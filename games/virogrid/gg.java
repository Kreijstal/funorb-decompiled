/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gg extends fd {
    private je field_L;
    static int[][] field_E;
    static km field_F;
    boolean field_G;
    static String[] field_I;
    static jc field_D;
    static km field_M;
    static String field_N;
    private int field_H;
    static String field_J;
    static ao field_K;

    final void a(byte param0, int param1, int param2, int param3) {
        if (0 != ((gg) this).field_H) {
          if (256 > ((gg) this).field_H) {
            L0: {
              L1: {
                if (b.field_Eb == null) {
                  break L1;
                } else {
                  if (b.field_Eb.field_w < ((gg) this).field_g) {
                    break L1;
                  } else {
                    if (b.field_Eb.field_p < ((gg) this).field_m) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
              b.field_Eb = new mg(((gg) this).field_g, ((gg) this).field_m);
              break L0;
            }
            kb.a(b.field_Eb, 16865);
            df.c();
            ((gg) this).b(0, 23, 0);
            super.a(param0, -param1 + -((gg) this).field_l, -param2 + -((gg) this).field_u, param3);
            ai.a(true);
            b.field_Eb.a(param1 - -((gg) this).field_l, ((gg) this).field_u + param2, ((gg) this).field_H);
            return;
          } else {
            if (0 != param3) {
              return;
            } else {
              ((gg) this).b(param2 + ((gg) this).field_u, 40, param1 + ((gg) this).field_l);
              super.a((byte) 37, param1, param2, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    boolean a(byte param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -67 / ((50 - param0) / 33);
            ((gg) this).field_H = this.e((byte) 30);
            if (((gg) this).field_H != 0) {
              break L1;
            } else {
              if (((gg) this).field_G) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    public static void g(int param0) {
        field_K = null;
        field_F = null;
        field_I = null;
        field_J = null;
        field_D = null;
        field_E = null;
        if (param0 != -1) {
            Object var2 = null;
            int discarded$0 = gg.a((CharSequence) null, 'ﾙ', 7);
        }
        field_N = null;
        field_M = null;
    }

    final fi c(byte param0) {
        fi var2 = super.c(param0);
        if (var2 != null) {
            return var2;
        }
        return (fi) this;
    }

    private final int e(byte param0) {
        if (param0 < 28) {
            field_I = null;
        }
        return !((gg) this).field_G ? 0 : (Object) (Object) ((gg) this).field_L.c((byte) 51) != this ? 0 : 256;
    }

    boolean f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          if (param0 == 3) {
            break L0;
          } else {
            ((gg) this).c(8, 89, 62);
            break L0;
          }
        }
        L1: {
          var2 = this.e((byte) 99);
          var3 = -((gg) this).field_H + var2;
          if ((var3 ^ -1) >= -1) {
            break L1;
          } else {
            ((gg) this).field_H = ((gg) this).field_H + (var3 + 7) / 8;
            break L1;
          }
        }
        L2: {
          if (var3 >= 0) {
            break L2;
          } else {
            ((gg) this).field_H = ((gg) this).field_H + (-16 + var3 + 1) / 16;
            break L2;
          }
        }
        L3: {
          L4: {
            if (0 != ((gg) this).field_H) {
              break L4;
            } else {
              if (var2 != 0) {
                break L4;
              } else {
                if (((gg) this).field_G) {
                  break L4;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L3;
                }
              }
            }
          }
          stackOut_10_0 = 0;
          stackIn_11_0 = stackOut_10_0;
          break L3;
        }
        return stackIn_11_0 != 0;
    }

    final void c(int param0, int param1, int param2) {
        ((gg) this).a(param0, true, mn.field_a + -param0 >> 1758644161, mm.field_i - param2 >> 1382565825, param2);
        if (param1 < 106) {
            field_F = null;
        }
    }

    final static int a(CharSequence param0, char param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = Virogrid.field_F ? 1 : 0;
          var3 = 0;
          var4 = param0.length();
          var5 = 0;
          if (param2 == 16) {
            break L0;
          } else {
            var7 = null;
            int discarded$2 = gg.a((CharSequence) null, '`', -91);
            break L0;
          }
        }
        L1: while (true) {
          if (var5 >= var4) {
            return var3;
          } else {
            if (param0.charAt(var5) == param1) {
              var3++;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, wg param1, boolean param2, int param3) {
        if (!param2) {
            field_F = null;
        }
        jf.field_o = param1;
        oe.field_f = param0;
        qg.field_w = param3;
    }

    gg(je param0, int param1, int param2) {
        super(-param1 + mm.field_i >> -1908060287, -param2 + mn.field_a >> -492806047, param1, param2, (ol) null);
        ((gg) this).field_G = false;
        ((gg) this).field_L = param0;
        ((gg) this).field_H = 0;
    }

    final static void a(int param0) {
        pc.field_b = hc.a(-9986);
        if (param0 != 15810) {
            return;
        }
        jg.field_e = 0;
    }

    abstract void b(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new String[16];
        field_N = "You have won!";
        field_D = new jc(256);
        field_J = "You are on <%0>";
    }
}
