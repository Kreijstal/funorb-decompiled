/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    private gg[] field_f;
    private int field_k;
    String field_j;
    static sk field_g;
    static int field_l;
    private int field_h;
    float field_d;
    private int field_c;
    static int[] field_b;
    static String field_e;
    static ri field_m;
    static float field_i;
    static String field_a;

    final boolean a(int param0) {
        int var3 = 0;
        gg var4 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        L0: while (true) {
          if (((lh) this).field_k >= ((lh) this).field_c) {
            if (param0 <= -90) {
              return true;
            } else {
              ((lh) this).field_j = null;
              return true;
            }
          } else {
            var4 = ((lh) this).field_f[((lh) this).field_k];
            if (!var4.field_d.a((byte) -123)) {
              this.a(0, (byte) 30, var4);
              return false;
            } else {
              L1: {
                if ((var4.field_g ^ -1) > -1) {
                  break L1;
                } else {
                  if (!var4.field_d.a(-128, var4.field_g)) {
                    this.a(var4.field_d.a(var4.field_g, (byte) 104), (byte) 30, var4);
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (var4.field_a == null) {
                  break L2;
                } else {
                  if (var4.field_d.a(false, var4.field_a)) {
                    break L2;
                  } else {
                    this.a(var4.field_d.a(0, var4.field_a), (byte) 30, var4);
                    return false;
                  }
                }
              }
              L3: {
                if ((var4.field_g ^ -1) <= -1) {
                  break L3;
                } else {
                  if (var4.field_a != null) {
                    break L3;
                  } else {
                    if (var4.field_f == null) {
                      break L3;
                    } else {
                      if (var4.field_d.a(0)) {
                        break L3;
                      } else {
                        this.a(var4.field_d.b(0), (byte) 30, var4);
                        return false;
                      }
                    }
                  }
                }
              }
              ((lh) this).field_k = ((lh) this).field_k + 1;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_m = null;
        field_b = null;
        field_a = null;
        if (param0 != -50) {
            field_b = null;
        }
        field_e = null;
        field_g = null;
    }

    final static void a(int param0, ul param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        md var6 = null;
        int[] var7 = null;
        int var8 = 0;
        ga var9 = null;
        int var10 = 0;
        ga var11 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        var9 = new ga(param1.a("logo.fo3d", "", false));
        var11 = var9;
        var3 = var11.g(31365);
        var11.k(-1136);
        qh.field_f = bo.a(30816, var11);
        lk.field_G = new int[var3][];
        vn.field_c = new md[var3];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3) {
            var11.l(-3093);
            var10 = 0;
            var4 = var10;
            var5 = 60 / ((62 - param0) / 39);
            L1: while (true) {
              if (var10 >= var3) {
                return;
              } else {
                var6 = vn.field_c[var10];
                var6.a(6, 1, 6, 6, 2122);
                var6.a((byte) -102);
                var7 = new int[]{var6.field_C - -var6.field_D >> -1596068575, var6.field_G + var6.field_l >> -349764991, var6.field_j + var6.field_r >> -726377183};
                lk.field_G[var10] = var7;
                var6.a(-var7[2], 3, -var7[0], -var7[1]);
                var10++;
                continue L1;
              }
            }
          } else {
            vn.field_c[var4] = s.a(var9, (byte) -111);
            var4++;
            continue L0;
          }
        }
    }

    final static void a(boolean param0) {
        wn.field_r = bl.a((byte) 41);
        vd.field_c = 0;
        if (!param0) {
            String discarded$0 = lh.a((byte) -46, -87);
        }
    }

    final static String a(byte param0, int param1) {
        if (param0 != -12) {
            return null;
        }
        return gh.field_f[param1];
    }

    private final void a(int param0, byte param1, gg param2) {
        float var4 = (float)(((lh) this).field_k + 1) + (float)param0 / 100.0f;
        if (-1 != (param0 ^ -1)) {
            ((lh) this).field_j = param2.field_f + " - " + param0 + "%";
        } else {
            ((lh) this).field_j = param2.field_h;
        }
        if (param1 != 30) {
            field_m = null;
        }
        ((lh) this).field_d = (float)((lh) this).field_h * var4 / (float)(1 + ((lh) this).field_c);
    }

    private lh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        field_e = "The account name you use to access RuneScape and other Jagex.com games";
        field_b = new int[50];
        double var0 = 6.283185307179586 / (double)field_b.length;
        for (var2 = 0; field_b.length > var2; var2++) {
            field_b[var2] = (int)(48.0 * Math.sin(var0 * (double)var2));
        }
        field_a = "Recharge your powerups even faster than with Nimble Fingers! Equip both for the maximum recharge rate.";
    }
}
