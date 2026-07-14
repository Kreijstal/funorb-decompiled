/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    static boolean field_a;
    static int[] field_b;
    private int field_l;
    private int[] field_e;
    static at field_c;
    private int field_k;
    private int field_h;
    private int field_g;
    static String field_i;
    private int field_f;
    private byte[] field_d;
    static int field_j;
    static boolean[] field_m;

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        te discarded$0 = ub.a((byte) 70, im.field_v[13]);
        for (var2 = param0; ((cg) this).field_h > var2; var2++) {
            for (var3 = 0; var3 < ((cg) this).field_f; var3++) {
                ((cg) this).field_e[var2 - -(((cg) this).field_h * var3)] = qn.field_d[((cg) this).field_l + var2 - -((((cg) this).field_k + var3) * qn.field_l)];
            }
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = th.a(param0, 1, param1);
        if (!(var4 <= param1 / 2)) {
            var4 = param1 - var4;
        }
        if (param2 != 13) {
            return -127;
        }
        return var4;
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 8) {
            break L0;
          } else {
            cg.a((byte) -21);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (((cg) this).field_h <= var3) {
            return;
          } else {
            var4 = 0;
            L2: while (true) {
              if (((cg) this).field_f <= var4) {
                var3++;
                continue L1;
              } else {
                var5 = ((cg) this).field_h * var4 + var3;
                var6 = ((cg) this).field_l + (var3 - -(qn.field_l * (var4 - -((cg) this).field_k)));
                if (((cg) this).field_d[var5] > param1) {
                  if (((cg) this).field_d[var5] <= 8 + param1) {
                    var7 = qn.field_d[var6];
                    var8 = ((cg) this).field_e[var5];
                    var9 = (-param1 + ((cg) this).field_d[var5]) * 256 / 8;
                    qn.field_d[var6] = oe.c(oe.c(var9 * rn.a(var8, 255) + rn.a(var7, 255) * (-var9 + 256) >> -682449336, rn.a(var9 * (rn.a(var8, 65280) >> 1852188584) - -((-var9 + 256) * (rn.a(var7, 65280) >> 1895087432)), 65280)), rn.a((rn.a(var7, 16711680) >> -2022715408) * (256 - var9) + (rn.a(var8, 16711680) >> -2037990096) * var9 << 140585832, 16711851));
                    var4++;
                    continue L2;
                  } else {
                    qn.field_d[var6] = ((cg) this).field_e[var5];
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_m = null;
        field_c = null;
        field_b = null;
        field_i = null;
        if (param0 != -109) {
            cg.a((byte) 9);
        }
    }

    public cg() {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        ((cg) this).field_l = 0;
        ((cg) this).field_k = 0;
        ((cg) this).field_f = so.field_b.field_g;
        ((cg) this).field_h = so.field_b.field_a;
        ((cg) this).field_g = 50;
        ((cg) this).field_d = new byte[((cg) this).field_f * ((cg) this).field_h];
        ((cg) this).field_e = new int[((cg) this).field_h * ((cg) this).field_f];
        var11 = new int[((cg) this).field_f];
        var10 = var11;
        var9 = var10;
        var7 = var9;
        var6 = var7;
        var1 = var6;
        var2 = 1;
        L0: while (true) {
          if (var2 >= ((cg) this).field_f) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= ((cg) this).field_h) {
                this.a(0);
              } else {
                var3 = 0;
                L2: while (true) {
                  if (var3 >= ((cg) this).field_f) {
                    var2++;
                    continue L1;
                  } else {
                    var4 = (5 * this.a(var11[var3] + var2, 160, 13) + -(var3 * 2) + 1160) * (-8 + ((cg) this).field_g) / 1280;
                    ((cg) this).field_d[((cg) this).field_h * var3 + var2] = (byte)var4;
                    var3++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var6[var2] = (int)(40.0 * Math.sin(3.141592653589793 * (double)var2 / (double)((cg) this).field_f * 6.0));
            var2++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{2, 17, 18, 36, 37, 38, 6, 5, 9};
        field_i = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_c = new at();
        field_m = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true, true, false, true, true, false, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false, false, false, true, false, false, false, true, false};
    }
}
