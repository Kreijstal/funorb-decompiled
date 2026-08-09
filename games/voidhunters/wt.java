/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wt {
    static String field_b;
    static String field_c;
    static volatile int field_a;

    final synchronized static long a(boolean param0) {
        long var1;
        var1 = System.currentTimeMillis();
        if ((dfb.field_q ^ -1L) >= (var1 ^ -1L)) {
          dfb.field_q = var1;
          if (param0) {
            field_b = (String) null;
            return var1 + eib.field_p;
          } else {
            return var1 + eib.field_p;
          }
        } else {
          eib.field_p = eib.field_p + (-var1 + dfb.field_q);
          dfb.field_q = var1;
          if (!param0) {
            return var1 + eib.field_p;
          } else {
            field_b = (String) null;
            return var1 + eib.field_p;
          }
        }
    }

    final static void a(int param0, int param1, String[] param2, String param3) {
        int var5 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              dn.field_r = gka.field_o;
              if (param0 == 255) {
                L2: {
                  if ((iua.field_p ^ -1) <= -14) {
                    stackIn_11_0 = 0;
                    break L2;
                  } else {
                    stackIn_11_0 = 1;
                    break L2;
                  }
                }
                cjb.field_b = rv.a(stackIn_11_0 != 0, param1 ^ -19341);
                break L1;
              } else {
                if (param0 < 100) {
                  cjb.field_b = tma.a(param0, param3, (byte) -124);
                  break L1;
                } else {
                  if ((param0 ^ -1) >= -106) {
                    cjb.field_b = wm.a(param2, (byte) -122);
                    break L1;
                  } else {
                    cjb.field_b = tma.a(param0, param3, (byte) -124);
                    break L1;
                  }
                }
              }
            }
            if (param1 == -19342) {
              break L0;
            } else {
              field_c = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("wt.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 > -97) {
            wt.a(-106);
        }
    }

    static {
        bcb discarded$0 = new bcb();
        field_b = "<%0>'s game";
        field_c = "Full";
        field_a = -1;
    }
}
