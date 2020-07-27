package press.whcj.ams.entity;


import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author xyyxhcj@qq.com
 * @since 2019/12/31
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class Api extends BaseEntity implements Serializable {
    private String name;
    @DBRef
    private ApiGroup group;

    private String projectId;

    private String apiUri;

    /**
     * failure example
     */
    private String apiFailureMock;

    /**
     * success example
     */
    private String apiSuccessMock;

    /**
     * 0post 1get
     */
    private Byte apiRequestType;
    @DBRef
    @JsonBackReference("requestParam")
    private Structure requestParam;

    private boolean reqParamIsReference;

    @DBRef
    @JsonBackReference("responseParam")
    private Structure responseParam;

    private boolean respParamIsReference;

    /**
     * 0-enable 1-maintaining 2-deprecated 3-pending 4-plan 5-develop 6-test 7-docking 8-bug
     */
    private Byte apiStatus;

    private String desc;

    /**
     * 0json 1form-data
     */
    private Byte requestParamType;

    /**
     * 0json 1binary
     */
    private Byte responseParamType;

    private static final long serialVersionUID = 1L;

    private Byte isDel;
}
