/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends wj implements vh {
    static hd field_L;
    static String field_C;
    static int[] field_I;
    private hu field_B;
    private wv field_E;
    static int field_H;
    private int[] field_M;
    private String field_D;
    static int[] field_G;
    private int field_N;
    static String field_F;
    private wi[] field_J;

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param3 > 64) {
                break L1;
              } else {
                field_F = null;
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              if (((qp) this).field_N <= var6_int) {
                break L0;
              } else {
                if (((qp) this).field_J[var6_int] != param1) {
                  var6_int++;
                  var6_int++;
                  continue L2;
                } else {
                  var7 = ((qp) this).field_M[var6_int];
                  if (var7 != -1) {
                    qd.b(38, ((qp) this).field_M[var6_int]);
                    return;
                  } else {
                    ((qp) this).field_E.q(-77);
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("qp.C(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_L = null;
        field_G = null;
        field_C = null;
        field_F = null;
        field_I = null;
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (!(((qp) this).field_N < param1)) {
            return;
        }
        wi[] var7 = new wi[param1];
        wi[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; ((qp) this).field_N > var5; var5++) {
            var7[var5] = ((qp) this).field_J[var5];
            var4[var5] = ((qp) this).field_M[var5];
        }
        ((qp) this).field_J = var3;
        ((qp) this).field_M = var4;
        ((qp) this).field_N = param1;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, (int) (char)param1, param2, param3);
        int discarded$0 = ((qp) this).field_B.a(((qp) this).field_D, 14 + (param2 + ((qp) this).field_t), 10 + (((qp) this).field_g + param3), -28 + ((qp) this).field_n, ((qp) this).field_i, 16777215, -1, 0, 0, ((qp) this).field_B.field_G);
    }

    final wi a(String param0, jv param1, byte param2) {
        wi var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        wi stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        wi stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 == 79) {
              var4 = new wi(param0, param1);
              var4.field_r = (gj) (Object) new op();
              var5 = -2 + ((qp) this).field_i;
              ((qp) this).a(34 + ((qp) this).field_i, 1, 0, ((qp) this).field_n, 0);
              var4.a(30, param2 ^ 78, 7, ((qp) this).field_n + -14, var5);
              ((qp) this).a(-102, (fd) (Object) var4);
              stackOut_3_0 = (wi) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (wi) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("qp.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final void a(byte param0, int param1, String param2) {
        int var4_int = 0;
        try {
            var4_int = ((qp) this).field_N;
            this.a(0, var4_int + 1);
            ((qp) this).field_J[var4_int] = ((qp) this).a(param2, (jv) this, (byte) 79);
            if (param0 <= 53) {
                Object var5 = null;
                ((qp) this).a((byte) -105, -6, (String) null);
            }
            ((qp) this).field_M[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "qp.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    qp(wv param0, hu param1, String param2) {
        super(0, 0, 288, 0, (gj) null);
        int var4_int = 0;
        ((qp) this).field_N = 0;
        try {
            ((qp) this).field_D = param2;
            ((qp) this).field_E = param0;
            ((qp) this).field_B = param1;
            var4_int = null == ((qp) this).field_D ? 0 : ((qp) this).field_B.c(((qp) this).field_D, 260, ((qp) this).field_B.field_G);
            ((qp) this).a(22 + var4_int, 1, 0, 288, 0);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "qp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, boolean param1, int param2) {
        if (5 != param0) {
          if (4 != param0) {
            if (param0 != 3) {
              if (1 != param0) {
                if (param0 == 2) {
                  return rp.field_C;
                } else {
                  field_F = null;
                  throw new IllegalStateException();
                }
              } else {
                return vo.a((byte) -18, po.field_g, new String[2]);
              }
            } else {
              return lk.field_e;
            }
          } else {
            return vo.a((byte) -18, bd.field_B, new String[1]);
          }
        } else {
          return vo.a((byte) -18, fi.field_b, new String[1]);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Qualifying Round";
        field_I = new int[8192];
        field_F = "Please enter your age in years";
    }
}
