/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ut {
    static int field_a;
    static pa field_c;
    static String field_b;

    public static void a(byte param0) {
        if (param0 <= 104) {
            field_c = (pa) null;
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, byte param1, int[] param2, int param3, int param4) {
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        if (param1 == -96) {
          param0--;
          L0: while (true) {
            if ((param0 ^ -1) > -1) {
              return;
            } else {
              try {
                L1: {
                  var9 = param2;
                  var5 = var9;
                  var6 = param4;
                  var7 = param3;
                  var9[var6] = var7 + (pg.a(var9[var6], 16711422) >> -646806271);
                  param4++;
                  break L1;
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var5_ref = decompiledCaughtException;
                  stackIn_10_0 = (RuntimeException) (var5_ref);

                  stackIn_10_1 = new StringBuilder().append("ut.A(").append(param0).append(',').append(param1).append(',');

                  if (param2 == null) {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "null";
                    break L2;
                  } else {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "{...}";
                    break L2;
                  }
                }
                throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
              }
              param0--;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    static {
        field_b = "This game has been updated! Please reload this page.";
    }
}
