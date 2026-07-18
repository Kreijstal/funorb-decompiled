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
        return bh.field_a;
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
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
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((dg) this).field_N != param2) {
                if (param2 != ((dg) this).field_P) {
                  if (param2 != ((dg) this).field_H) {
                    break L1;
                  } else {
                    bo.b(4);
                    break L1;
                  }
                } else {
                  hb.a(0);
                  break L1;
                }
              } else {
                qe.c((byte) 106);
                break L1;
              }
            }
            if (param3 < -83) {
              break L0;
            } else {
              field_G = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("dg.E(").append(param0).append(',').append(param1).append(',');
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
          throw fa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(eh param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          r.field_a = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("dg.F(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -40 + ')');
        }
    }

    public static void a(byte param0) {
        field_K = null;
        field_O = null;
        field_I = null;
        field_G = null;
        int var1 = -18;
        field_L = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((dg) this).field_y - -param3;
        int var6 = ((dg) this).field_i + param1;
        int discarded$0 = ke.field_h.a(ti.field_H, 20 + var5, var6 - -20, ((dg) this).field_n + -40, ((dg) this).field_w + -50, 16777215, -1, 1, 0, ke.field_h.field_C);
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
        ((dg) this).field_P = new gn(en.field_a, (bj) null);
        ((dg) this).field_N = new gn(oq.field_v, (bj) null);
        ((dg) this).field_H = new gn(gf.field_a, (bj) null);
        oq var1 = new oq();
        ((dg) this).field_P.field_h = (nl) (Object) var1;
        ((dg) this).field_N.field_h = (nl) (Object) var1;
        ((dg) this).field_H.field_h = (nl) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        ((dg) this).field_N.b(-var3 + ((dg) this).field_n >> 1, -var2 + (-48 + ((dg) this).field_w), 28972, var4, 30);
        ((dg) this).field_H.b((((dg) this).field_n + -var3 >> 1) + (var4 - -var2), -48 + (((dg) this).field_w - var2), 28972, var4, 30);
        ((dg) this).field_P.b(((dg) this).field_n + -var3 >> 1, -(var2 * 2) + (-78 + ((dg) this).field_w), 28972, var3, 30);
        ((dg) this).field_N.field_A = (bj) this;
        ((dg) this).field_P.field_A = (bj) this;
        ((dg) this).field_P.field_x = qm.field_I;
        ((dg) this).field_H.field_A = (bj) this;
        ((dg) this).field_H.field_x = de.field_a;
        ((dg) this).b((byte) 45, (cf) (Object) ((dg) this).field_N);
        ((dg) this).b((byte) 70, (cf) (Object) ((dg) this).field_P);
        ((dg) this).b((byte) 60, (cf) (Object) ((dg) this).field_H);
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
              return stackIn_3_0 != 0;
            } else {
              if (98 != param0) {
                if (param0 == 99) {
                  stackOut_9_0 = ((dg) this).a(78, param2);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_5_0 = ((dg) this).a((byte) -1, param2);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("dg.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new th();
        field_L = "The '<%0>' setting needs to be changed.";
        field_G = new String[]{"Pupil", "Neophyte", "Battle Master", "Conqueror", "Single-minded", "Bare Limbs", "Human-lover", "Gene Therapy", "Magic Fingers", "Lord of the Castle", "My Precious...", "Gotcha!", "Skin and Bones", "Mutant Strain", "Unattached", "Sire of the Realm", "Pumpkin Studies", "Slaughterer", "Unforgiving", "Behind Enemy Lines", "Barren Ally", "Laborious Student", "Gas Mask", "Journeyman"};
        field_J = false;
        field_O = "Determined";
        field_I = "Remove friend";
    }
}
