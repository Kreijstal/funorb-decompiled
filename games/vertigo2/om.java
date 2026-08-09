/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends ml {
    static int field_B;
    static int field_D;
    static String field_C;

    om(int param0) {
        this(qc.field_x, param0);
    }

    private om(cc param0, int param1) {
        super(param0, param1);
    }

    final static void a(String param0, byte param1) {
        try {
            int var2_int = -48 / ((-83 - param1) / 39);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "om.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final String a(byte param0, iq param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -90) {
                break L1;
              } else {
                field_D = -38;
                break L1;
              }
            }
            stackIn_3_0 = rh.a((byte) -95, param1.field_w.length(), '*');
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("om.BA(").append(param0).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, int param1, byte[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param1;
            L1: while (true) {
              if (var5 >= param0) {
                L2: {
                  if (param3 == 255) {
                    break L2;
                  } else {
                    om.c((byte) 93);
                    break L2;
                  }
                }
                var4_int = var4_int ^ -1;
                stackIn_7_0 = var4_int;
                break L0;
              } else {
                var4_int = var4_int >>> 417678216 ^ hn.field_r[(param2[var5] ^ var4_int) & 255];
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("om.GA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    public static void c(byte param0) {
        if (param0 < 76) {
            String var2 = (String) null;
            om.a((String) null, (byte) -77);
        }
        field_C = null;
    }

    static {
        field_C = "Unable to connect to the data server. Please check any firewall you are using.";
        field_B = 84;
    }
}
