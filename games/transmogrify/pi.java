/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends wf {
    static int field_j;
    static ci field_g;
    static int field_k;
    static int field_h;
    int field_i;

    final static fc a(int param0, String param1) {
        RuntimeException var2 = null;
        fc stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 17118) {
                break L1;
              } else {
                pi.a((byte) 93);
                break L1;
              }
            }
            L2: {
              if (!dl.field_l.b(-26753)) {
                break L2;
              } else {
                if (!param1.equals(dl.field_l.a((byte) -41))) {
                  dl.field_l = bh.a(param0 ^ -17080, param1);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            stackIn_7_0 = dl.field_l;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("pi.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 != -110) {
            field_k = -126;
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        String var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param1.length;
              var3 = new byte[var2_int];
              ji.a(param1, 0, var3, 0, var2_int);
              if (param0 == -29) {
                break L1;
              } else {
                var4 = (String) null;
                pi.a(-109, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("pi.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    pi(int param0) {
        this.field_i = param0;
    }

    static {
        field_j = 10;
    }
}
