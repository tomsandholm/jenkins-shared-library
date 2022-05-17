def call(String[] args) {
  def asize = args.length
  echo "length is: ${asize}"
  for (x in args) {
    echo "arg is: $x"
  }
  tag=arg[0]
  release=arg[1]
  url=[2]
  sh """
    echo tag: $tag
    echo release: $release
    echo url: $url
  """
}
