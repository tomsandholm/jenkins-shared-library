// vars/lib/dco_tag.groovy

def call() {
  script {
    sh """
      echo "DCO_TAG \$(cat ./dco-tag)"
    """
  }
}
