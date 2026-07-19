/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends se implements in {
    static th field_K;
    private gn field_N;
    private gn field_H;
    static int field_M;
    private gn field_P;
    static boolean field_J;
    static String field_L;
    static String[] field_G;
    static String field_O;
    static String field_I;

    final static void i(int param0) {
        ra.field_o = rg.g(-18799);
        nb.field_a = new vk();
        if (param0 != 4) {
          dg.h(-109);
          io.a(-21113, true, true);
          return;
        } else {
          io.a(-21113, true, true);
          return;
        }
    }

    final static vp a(int param0) {
        if (param0 != 30) {
            field_I = (String) null;
            return bh.field_a;
        }
        return bh.field_a;
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
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
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_N != param2) {
                  break L2;
                } else {
                  qe.c((byte) 106);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param2 != this.field_P) {
                  break L3;
                } else {
                  hb.a(0);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (param2 != this.field_H) {
                break L1;
              } else {
                bo.b(4);
                break L1;
              }
            }
            if (param3 < -83) {
              break L0;
            } else {
              field_G = (String[]) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("dg.E(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(eh param0, int param1) {
        RuntimeException runtimeException = null;
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
              r.field_a = param0;
              if (param1 == -40) {
                break L1;
              } else {
                field_J = false;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("dg.F(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_K = null;
        field_O = null;
        field_I = null;
        field_G = null;
        int var1 = 18 / ((31 - param0) / 43);
        field_L = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_y - -param3;
        int var6 = this.field_i + param1;
        int discarded$0 = ke.field_h.a(ti.field_H, 20 + var5, var6 - -20, this.field_n + -40, this.field_w + -50, 16777215, -1, 1, 0, ke.field_h.field_C);
        super.a(param0, param1, param2, param3);
    }

    final static void h(int param0) {
        if (!(rm.field_b == null)) {
            rm.field_b.h();
        }
        if (!(ga.field_u == null)) {
            ga.field_u.h();
        }
        if (param0 > -50) {
            dg.i(87);
            return;
        }
    }

    public dg() {
        super(0, 0, 476, 225, (nl) null);
        this.field_P = new gn(en.field_a, (bj) null);
        this.field_N = new gn(oq.field_v, (bj) null);
        this.field_H = new gn(gf.field_a, (bj) null);
        oq var1 = new oq();
        this.field_P.field_h = (nl) ((Object) var1);
        this.field_N.field_h = (nl) ((Object) var1);
        this.field_H.field_h = (nl) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 66999905;
        this.field_N.b(-var3 + this.field_n >> -388906975, -var2 + (-48 + this.field_w), 28972, var4, 30);
        this.field_H.b((this.field_n + -var3 >> 280078721) + (var4 - -var2), -48 + (this.field_w - var2), 28972, var4, 30);
        this.field_P.b(this.field_n + -var3 >> -205126591, -(var2 * 2) + (-78 + this.field_w), 28972, var3, 30);
        this.field_N.field_A = (bj) (this);
        this.field_P.field_A = (bj) (this);
        this.field_P.field_x = qm.field_I;
        this.field_H.field_A = (bj) (this);
        this.field_H.field_x = de.field_a;
        this.b((byte) 45, this.field_N);
        this.b((byte) 70, this.field_P);
        this.b((byte) 60, this.field_H);
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 != param0) {
                if ((param0 ^ -1) == -100) {
                  stackOut_9_0 = this.a(78, param2);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_5_0 = this.a((byte) -1, param2);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("dg.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    static {
        field_K = new th();
        field_L = "The '<%0>' setting needs to be changed.";
        field_G = new String[]{"Pupil", "Neophyte", "Battle Master", "Conqueror", "Single-minded", "Bare Limbs", "Human-lover", "Gene Therapy", "Magic Fingers", "Lord of the Castle", "My Precious...", "Gotcha!", "Skin and Bones", "Mutant Strain", "Unattached", "Sire of the Realm", "Pumpkin Studies", "Slaughterer", "Unforgiving", "Behind Enemy Lines", "Barren Ally", "Laborious Student", "Gas Mask", "Journeyman"};
        field_J = false;
        field_O = "Determined";
        field_I = "Remove friend";
    }
}
