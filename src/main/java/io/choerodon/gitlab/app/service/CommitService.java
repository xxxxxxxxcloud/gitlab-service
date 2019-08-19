package io.choerodon.gitlab.app.service;

import java.util.List;

import io.choerodon.gitlab.api.vo.CommitVO;
import org.gitlab4j.api.models.Commit;

import io.choerodon.gitlab.api.vo.CommitStatuseVO;

/**
 * Created by zzy on 2018/1/14.
 */
public interface CommitService {
    CommitVO getCommit(Integer projectId, String sha, Integer userId);

    List<CommitStatuseVO> getCommitStatuse(Integer projectId, String sha, Integer userId);

    List<Commit> getCommits(Integer gitLabProjectId, String ref, String since);

    List<Commit> listCommits(Integer gilabProjectId , int page, int size, Integer userId);
}
