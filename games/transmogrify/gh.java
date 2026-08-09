/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends wf {
    byte[] field_k;
    int field_j;
    static int field_l;
    static tf field_g;
    static int field_h;
    static sd field_m;
    static boolean field_i;

    final static void d(int param0) {
        cf var1;
        hj var2;
        var1 = (cf) ((Object) mh.field_e.a((byte) -95));
        if (var1 != null) {
          var2 = nf.field_l;
          var2.c((byte) -126);
          if (param0 != 0) {
            gh.e(38);
            var2.c((byte) -108);
            var2.c((byte) -105);
            var2.c((byte) -119);
            var1.c(param0 + 5);
            return;
          } else {
            var2.c((byte) -108);
            var2.c((byte) -105);
            var2.c((byte) -119);
            var1.c(param0 + 5);
            return;
          }
        } else {
          pc.a(1);
          return;
        }
    }

    public static void e(int param0) {
        if (param0 < 10) {
            field_i = true;
            field_m = null;
            field_g = null;
            return;
        }
        field_m = null;
        field_g = null;
    }

    private gh() throws Throwable {
        throw new Error();
    }

    final static void a(java.applet.Applet param0, byte param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = param0.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) ((Object) var2);
                if ((uk.b(114, var3) ^ -1L) == -1L) {
                  break L1;
                } else {
                  L2: {
                    if (param1 == -112) {
                      break L2;
                    } else {
                      gh.e(-50);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("gh.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_l = -17;
        field_g = new tf(10, 2, 2, 0);
        field_i = false;
    }
}
