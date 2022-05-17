def call(String[] args) {
  def asize = args.length
  echo "length is: ${asize}"
  for (x in args) {
    echo "arg is: $x"
  }
  tag=args[0]
  release=args[1]
  url=args[2]
  sh """
    echo tag: $tag
    echo release: $release
    echo url: $url
  """
}
