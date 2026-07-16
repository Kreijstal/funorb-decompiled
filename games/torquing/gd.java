/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static sm[] field_a;
    static t field_b;
    static int field_c;

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -12) {
            gd.a((byte) -23);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static vn a(la param0, int param1, la param2, int param3, int param4) {
        int var5 = 0;
        var5 = -26 % ((param4 - -37) / 36);
        if (!nd.a(param1, param0, -1, param3)) {
          return null;
        } else {
          return fi.a((byte) -9, param2.a(param1, 100, param3));
        }
    }

    final static StringBuilder a(int param0, StringBuilder param1, CharSequence param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Torquing.field_u;
        var4 = param1.length();
        if (param3 >= 0) {
          if (var4 >= param3) {
            var5 = param2.length();
            if (var5 != 0) {
              var6 = var5 + param3;
              if (var4 >= var6) {
                var7 = 0;
                L0: while (true) {
                  if (var5 <= var7) {
                    if (param0 == -20980) {
                      return param1;
                    } else {
                      field_a = null;
                      return param1;
                    }
                  } else {
                    int incrementValue$2 = param3;
                    param3++;
                    param1.setCharAt(incrementValue$2, param2.charAt(var7));
                    var7++;
                    continue L0;
                  }
                }
              } else {
                param1.setLength(var6);
                var7 = 0;
                L1: while (true) {
                  if (var5 <= var7) {
                    if (param0 == -20980) {
                      return param1;
                    } else {
                      field_a = null;
                      return param1;
                    }
                  } else {
                    int incrementValue$3 = param3;
                    param3++;
                    param1.setCharAt(incrementValue$3, param2.charAt(var7));
                    var7++;
                    continue L1;
                  }
                }
              }
            } else {
              return param1;
            }
          } else {
            throw new StringIndexOutOfBoundsException("length=" + var4 + " startPos=" + param3);
          }
        } else {
          throw new StringIndexOutOfBoundsException("length=" + var4 + " startPos=" + param3);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new t(640, 480);
        field_c = 0;
    }
}
