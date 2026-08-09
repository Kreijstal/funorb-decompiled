/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static uj field_d;
    int field_e;
    int field_c;
    static int field_a;
    static cr field_f;
    static String field_b;

    final static ji a(byte param0, ed param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ji var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ji stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = -50 % ((-39 - param0) / 41);
            param1.h(-11);
            var3 = param1.h(-11);
            var4 = qf.a(-39, var3);
            var4.field_t = param1.h(-11);
            var5 = param1.h(-11);
            var6 = 0;
            L1: while (true) {
              if (var6 >= var5) {
                var4.a(-107);
                stackIn_5_0 = (ji) (var4);
                break L0;
              } else {
                var7 = param1.h(-11);
                var4.a((byte) 110, var7, param1);
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("ve.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, uh param1, String param2, boolean param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        b var8 = null;
        String var9 = null;
        b var10 = null;
        String var11 = null;
        b var12 = null;
        String var13 = null;
        b var14 = null;
        try {
          L0: {
            L1: {
              oq.a(uk.field_v, -1, 4462, param1.a((byte) -38), (String) null, (int[]) null, param1, 0L, (String) null);
              if (!param1.field_kc) {
                break L1;
              } else {
                L2: {
                  if (param1.field_xc == 2) {
                    break L2;
                  } else {
                    if ((fn.field_z ^ -1) <= -3) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var8 = un.field_Lb;
                var9 = Vertigo2.a(new String[]{param2}, ch.field_g, param0 + -243);
                var8.field_n.a(var9, 10, param0 + -117);
                break L1;
              }
            }
            L3: {
              un.field_Lb.a(param0 ^ 119);
              if (!param3) {
                break L3;
              } else {
                if (br.field_Q == un.field_Lb.field_j) {
                  var12 = un.field_Lb;
                  var13 = Vertigo2.a(new String[]{param2}, be.field_s, param0 ^ 60);
                  var12.field_n.a(var13, 16, 0);
                  break L3;
                } else {
                  var10 = un.field_Lb;
                  var11 = Vertigo2.a(new String[]{param2}, as.field_f, -113);
                  var10.field_n.a(var11, 15, 0);
                  break L3;
                }
              }
            }
            L4: {
              var14 = un.field_Lb;
              if (param0 == 117) {
                break L4;
              } else {
                field_b = (String) null;
                break L4;
              }
            }
            var5 = sd.field_N;
            var6 = no.field_e;
            var14.field_n.c(0, var6, -1220, var5, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ve.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        if (!(!tf.a((byte) 45))) {
            ol.a(param1, param4, param6, 74);
            if (un.field_Lb != null && un.field_Lb.a(param2, param4, param6, param5, 2)) {
                param4 = false;
                ql.i(113);
            }
            mh.a(param4, (byte) -73, param6);
            pp.a(param3 ^ -21953, param4, param0);
            param4 = false;
        }
        if (param3 != 21911) {
            ve.a((byte) 13);
        }
        return param4;
    }

    ve(int param0, int param1, int param2, int param3) {
        this.field_e = param0;
        this.field_c = param3;
    }

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        field_d = null;
        if (param0 > -124) {
            ve.a((byte) -20);
        }
    }

    static {
        field_d = new uj(1);
        field_a = 34;
        field_b = "Similar rating";
    }
}
