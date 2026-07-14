/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static int[][] field_a;

    final static int a(byte param0, char param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (param0 == -72) {
          L0: {
            var3 = 0;
            var4 = param2.length();
            var5 = 0;
            if (var4 <= var5) {
              break L0;
            } else {
              L1: {
                if (param1 != param2.charAt(var5)) {
                  var5++;
                  break L1;
                } else {
                  var3++;
                  var5++;
                  break L1;
                }
              }
              var5++;
              var5++;
              var5++;
              break L0;
            }
          }
          return var3;
        } else {
          field_a = null;
          L2: {
            var3 = 0;
            var4 = param2.length();
            var5 = 0;
            if (var4 <= var5) {
              break L2;
            } else {
              L3: {
                if (param1 != param2.charAt(var5)) {
                  var5++;
                  break L3;
                } else {
                  var3++;
                  var5++;
                  break L3;
                }
              }
              var5++;
              var5++;
              var5++;
              break L2;
            }
          }
          return var3;
        }
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        var4 = -81 / ((param2 - -41) / 45);
        var3 = fj.a(param1, 100, param0);
        if (var3 != null) {
          return var3;
        } else {
          var5 = 0;
          L0: while (true) {
            if (param1.length() > var5) {
              if (!ee.a(37, param1.charAt(var5))) {
                return wh.field_c;
              } else {
                var5++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 1) {
            Object var2 = null;
            int discarded$0 = wd.a((byte) -59, '', (CharSequence) null);
        }
    }

    static {
    }
}
