def notify(message, color) {
    slackSend color: "${color}", message: "${message}"
}

def getcolorByBuildStatus(buildStatus){
    if (buildStatus == 'SUCCESS') {
        return 'good'
    } else if (buildStatus == 'UNSTABLE') {
        return 'warning'
    }
    return 'danger'
}

return this
