/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo extends hn implements ng {
    private int field_J;
    static String field_E;
    private int[] field_H;
    private mn field_C;
    private uc field_G;
    private lg[] field_I;
    private String field_B;

    fo(mn param0, uc param1, String param2) {
        super(0, 0, 288, 0, (el) null);
        int var4_int = 0;
        ((fo) this).field_J = 0;
        try {
            ((fo) this).field_B = param2;
            ((fo) this).field_G = param1;
            ((fo) this).field_C = param0;
            var4_int = null != ((fo) this).field_B ? ((fo) this).field_G.a(((fo) this).field_B, 260, ((fo) this).field_G.field_x) : 0;
            ((fo) this).a((byte) -10, 0, 0, 22 + var4_int, 288);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "fo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              var4_int = ((fo) this).field_J;
              this.a(1 + var4_int, (byte) -119);
              ((fo) this).field_I[var4_int] = ((fo) this).a(param1 + -5177, param0, (ca) this);
              ((fo) this).field_H[var4_int] = param2;
              if (param1 == 5177) {
                break L1;
              } else {
                ((fo) this).field_I = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var4;
            stackOut_3_1 = new StringBuilder().append("fo.G(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void h(int param0) {
        field_E = null;
    }

    private final void a(int param0, byte param1) {
        int var6 = 0;
        int var7 = Torquing.field_u;
        if (!(param0 > ((fo) this).field_J)) {
            return;
        }
        lg[] var8 = new lg[param0];
        lg[] var3 = var8;
        int[] var4 = new int[param0];
        int var5 = 19 / ((-78 - param1) / 36);
        for (var6 = 0; ((fo) this).field_J > var6; var6++) {
            var8[var6] = ((fo) this).field_I[var6];
            var4[var6] = ((fo) this).field_H[var6];
        }
        ((fo) this).field_I = var3;
        ((fo) this).field_H = var4;
        ((fo) this).field_J = param0;
    }

    final static String i(int param0) {
        if (!(bh.field_a != mg.field_b)) {
            return on.field_d;
        }
        return vo.field_g;
    }

    final static int a(int param0, byte param1, int param2) {
        if (param0 < 0) {
            return fo.a(-param0, (byte) -74, param2);
        }
        if (0 > param2) {
            return fo.a(param0, (byte) -93, -param2);
        }
        if (!(param0 >= param2)) {
            return fo.a(param2, (byte) -46, param0);
        }
        if (!(param2 != 0)) {
            return param0;
        }
        if (param1 > -15) {
            int discarded$0 = fo.a(104, (byte) -106, -117);
        }
        return fo.a(param2, (byte) -71, param0 % param2);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -29, param2, param3);
        int discarded$31 = ((fo) this).field_G.a(((fo) this).field_B, ((fo) this).field_w + (param3 + 14), ((fo) this).field_k + (param2 - -10), ((fo) this).field_p + -28, ((fo) this).field_o, 16777215, -1, 0, 0, ((fo) this).field_G.field_x);
        if (param1 >= -7) {
            Object var6 = null;
            lg discarded$32 = ((fo) this).a(92, (String) null, (ca) null);
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                if (var6_int >= ((fo) this).field_J) {
                  break L2;
                } else {
                  if (param1 == ((fo) this).field_I[var6_int]) {
                    var7 = ((fo) this).field_H[var6_int];
                    if (-1 == var7) {
                      ((fo) this).field_C.b(true);
                      break L2;
                    } else {
                      od.b(128, ((fo) this).field_H[var6_int]);
                      break L2;
                    }
                  } else {
                    var6_int++;
                    continue L1;
                  }
                }
              }
              L3: {
                if (param0 <= -85) {
                  break L3;
                } else {
                  this.a(-79, (byte) -81);
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("fo.NA(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final lg a(int param0, String param1, ca param2) {
        lg var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        lg stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        lg stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = new lg(param1, param2);
            var4.field_q = (el) (Object) new rf();
            var5 = -2 + ((fo) this).field_o;
            ((fo) this).a((byte) 127, param0, 0, 34 + ((fo) this).field_o, ((fo) this).field_p);
            var4.a((byte) -42, 7, var5, 30, -14 + ((fo) this).field_p);
            ((fo) this).a((gm) (Object) var4, -6938);
            stackOut_0_0 = (lg) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("fo.F(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Cancel";
    }
}
