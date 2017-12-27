node {
  scm {
        git {
            remote {
                github('yurgas/test-project')
                refspec('+refs/pull/*:refs/remotes/origin/pr/*')
            }
            branch('${sha1}')
        }
  }
  triggers {
    githubPullRequest {
        admin('yurgas')
        userWhitelist('yurgas')
        cron('*/1 * * * *')
        permitAll()
        displayBuildErrorsOnDownstreamBuilds()
        whiteListTargetBranches(['master'])
        whiteListLabels(['run_build'])
        includeRegions('project[12]/.*')
    }
  }
  echo 'test'
}
