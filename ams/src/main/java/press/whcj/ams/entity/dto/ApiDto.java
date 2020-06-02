package press.whcj.ams.entity.dto;

import lombok.Getter;
import lombok.Setter;
import press.whcj.ams.entity.MongoPage;
import press.whcj.ams.entity.vo.ApiVo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xyyxhcj@qq.com
 * @since 2019/12/31
 */
@Getter
@Setter
public class ApiDto extends ApiVo {
	private static final long serialVersionUID = -2107807918182928550L;
	private String groupId;
	private StructureDto requestParamDto;
	private StructureDto responseParamDto;
	private MongoPage<ApiVo> page = new MongoPage<>();
	private List<String> ids = new ArrayList<>();
	private String structureId;
	private String nameOrUri;
	private List<String> groupIds = new ArrayList<>();
	private String envId;
}
