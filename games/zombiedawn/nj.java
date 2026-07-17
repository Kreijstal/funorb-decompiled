/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends pn implements hh {
    private long field_V;
    private an field_T;
    static String field_X;
    private an field_W;
    private ga field_U;

    nj(dn param0) {
        super(param0, 200, 200);
        RuntimeException var2 = null;
        ga var3 = null;
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
            ((nj) this).field_V = pd.a(-22826);
            var3 = new ga(ag.field_c, (sk) null);
            var3.field_i = ((nj) this).field_i;
            var3.field_n = 100;
            var3.field_j = 50;
            var3.field_k = 0;
            var3.field_h = (io) (Object) new vf(ii.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((nj) this).a(var3, 10);
            ((nj) this).field_U = new ga(ag.field_c, (sk) null);
            ((nj) this).field_U.field_k = 0;
            ((nj) this).field_U.field_j = 20 + var3.field_n + var3.field_j;
            ((nj) this).field_U.field_i = ((nj) this).field_i;
            ((nj) this).field_U.field_n = 80;
            ((nj) this).field_U.field_h = (io) (Object) new vf(rk.field_b, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((nj) this).a(((nj) this).field_U, 10);
            ((nj) this).field_T = this.a((byte) 32, (sk) this, ap.field_s);
            ((nj) this).field_W = this.a((byte) 32, (sk) this, ki.field_bb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("nj.<init>(");
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var5_int = -59 % ((-83 - param0) / 32);
            var6 = param1;
            if (var6 != 99) {
              if (var6 == 98) {
                boolean discarded$2 = ((nj) this).field_T.a((byte) 116, (ga) this);
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                stackOut_8_0 = super.a(-127, param1, param2, param3);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              boolean discarded$3 = ((nj) this).field_W.a((byte) 115, (ga) this);
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("nj.I(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
        return stackIn_9_0;
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        RuntimeException var5 = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, (byte) 90, param2, param3);
              if (ll.field_a) {
                param0.c((byte) 57);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var5_long = pd.a(-22826) - ((nj) this).field_V;
              var7 = (int)((10999L - var5_long) / 1000L);
              if (0 >= var7) {
                re.a((byte) -71);
                this.g((byte) 35);
                ((nj) this).field_F.a((ga) (Object) new i(((nj) this).field_F, rc.field_h), true);
                break L2;
              } else {
                ((nj) this).field_U.field_o = "" + var7;
                break L2;
              }
            }
            L3: {
              var8 = -48 % ((param1 - 46) / 42);
              if (!((nj) this).field_H) {
                break L3;
              } else {
                if (null == cn.field_b) {
                  this.g((byte) -108);
                  ((nj) this).field_F.a((ga) (Object) new i(((nj) this).field_F, gf.field_b), true);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (null == cn.field_b) {
                break L4;
              } else {
                if (!cn.field_b.field_a) {
                  break L4;
                } else {
                  this.g((byte) -121);
                  ((nj) this).field_F.a((ga) (Object) new i(((nj) this).field_F, gf.field_b), true);
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("nj.D(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final an a(byte param0, sk param1, String param2) {
        an var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        an stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        an stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var4 = new an(param2, param1);
              var4.field_h = (io) (Object) new vm();
              if (param0 == 32) {
                break L1;
              } else {
                ((nj) this).field_T = null;
                break L1;
              }
            }
            var5 = -6 + ((nj) this).field_n;
            ((nj) this).field_n = ((nj) this).field_n + 38;
            var4.a(-88, var5, 15, ((nj) this).field_i - 30, 30);
            ((nj) this).a((ga) (Object) var4, 10);
            ((nj) this).a(true);
            stackOut_2_0 = (an) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("nj.J(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    public static void b(boolean param0) {
        field_X = null;
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          if (param1 == -6) {
            if (param2 == ((nj) this).field_T) {
              this.g((byte) -126);
              return;
            } else {
              if (param2 == ((nj) this).field_W) {
                re.a((byte) -71);
                this.g((byte) 85);
                return;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("nj.K(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L0;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L0;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void g(byte param0) {
        int var2 = -75 % ((param0 - -62) / 46);
        if (!((nj) this).field_H) {
            return;
        }
        ((nj) this).field_H = false;
    }

    static {
    }
}
