/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends pe implements qd {
    static int field_M;
    private pl field_H;
    private pl field_J;
    static wd field_F;
    static int field_I;
    static ui field_E;
    static String field_L;
    private pl field_K;
    static char[] field_G;

    final boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_8_0 = false;
        boolean stackOut_12_0 = false;
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
            if (super.a(param0, param1, (byte) -105, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (param2 < -96) {
                  break L1;
                } else {
                  ((ki) this).field_J = null;
                  break L1;
                }
              }
              if (param1 == 98) {
                stackOut_8_0 = ((ki) this).a((byte) -117, param3);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (99 == param1) {
                  stackOut_12_0 = ((ki) this).b(param3, 1);
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("ki.K(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    public ki() {
        super(0, 0, 476, 225, (bf) null);
        ((ki) this).field_K = new pl(qk.field_h, (ce) null);
        ((ki) this).field_H = new pl(v.field_c, (ce) null);
        ((ki) this).field_J = new pl(th.field_b, (ce) null);
        jl var1 = new jl();
        ((ki) this).field_K.field_w = (bf) (Object) var1;
        ((ki) this).field_H.field_w = (bf) (Object) var1;
        ((ki) this).field_J.field_w = (bf) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> 1;
        ((ki) this).field_H.a(120, -48 + (((ki) this).field_n - var2), 30, var4, ((ki) this).field_r + -var3 >> 1);
        ((ki) this).field_J.a(117, -48 + ((ki) this).field_n - var2, 30, var4, (-var3 + ((ki) this).field_r >> 1) - (-var4 - var2));
        ((ki) this).field_K.a(120, ((ki) this).field_n - (78 + 2 * var2), 30, var3, -var3 + ((ki) this).field_r >> 1);
        ((ki) this).field_H.field_s = (ce) this;
        ((ki) this).field_K.field_s = (ce) this;
        ((ki) this).field_J.field_s = (ce) this;
        ((ki) this).field_K.field_p = hb.field_i;
        ((ki) this).field_J.field_p = hf.field_a;
        ((ki) this).a((ub) (Object) ((ki) this).field_H, (byte) 101);
        ((ki) this).a((ub) (Object) ((ki) this).field_K, (byte) 47);
        ((ki) this).a((ub) (Object) ((ki) this).field_J, (byte) 46);
    }

    public static void g(byte param0) {
        field_E = null;
        int var1 = 31 % ((param0 - -23) / 41);
        field_G = null;
        field_F = null;
        field_L = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((ki) this).field_o - -param0;
        int var6 = ((ki) this).field_l + param3;
        int discarded$0 = gh.field_b.a(ci.field_c, var5 + 20, 20 + var6, ((ki) this).field_r + -40, ((ki) this).field_n + -50, 16777215, -1, 1, 0, gh.field_b.field_M);
        super.a(param0, param1, param2, param3);
    }

    final static void h(byte param0) {
        wi.field_J = false;
        cf.field_i = false;
        jc.a((byte) 79, -1);
        fi.field_y = ej.field_b;
        if (param0 <= 64) {
          ki.g((byte) -56);
          wc.field_j = ej.field_b;
          return;
        } else {
          wc.field_j = ej.field_b;
          return;
        }
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (((ki) this).field_H == param1) {
                pc.a(-1);
                break L1;
              } else {
                if (param1 == ((ki) this).field_K) {
                  w.b(-1);
                  break L1;
                } else {
                  if (param1 != ((ki) this).field_J) {
                    break L1;
                  } else {
                    jf.a(55);
                    break L1;
                  }
                }
              }
            }
            if (param0 == -18905) {
              break L0;
            } else {
              ki.g((byte) 6);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("ki.DA(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "This game has been updated! Please reload this page.";
        field_G = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
    }
}
