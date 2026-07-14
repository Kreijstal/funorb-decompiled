/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends vg {
    static String field_i;
    static String field_h;
    int field_f;
    private int field_g;
    static TombRacer field_j;
    private int field_k;

    final boolean a(byte param0) {
        if (param0 < -62) {
          if (((ad) this).field_k <= jba.field_j) {
            if (((ad) this).field_k - -64 >= jba.field_j) {
              if (sta.field_B >= ((ad) this).field_g) {
                if (sta.field_B > 64 + ((ad) this).field_g) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((ad) this).field_k = -99;
          if (((ad) this).field_k <= jba.field_j) {
            if (((ad) this).field_k - -64 >= jba.field_j) {
              if (sta.field_B >= ((ad) this).field_g) {
                if (sta.field_B > 64 + ((ad) this).field_g) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public static void b(int param0) {
        int var1 = -85 / ((42 - param0) / 45);
        field_i = null;
        field_h = null;
        field_j = null;
    }

    ad(int param0, int param1, int param2) {
        this(param1, param2);
        ((ad) this).field_f = param0;
    }

    final boolean a(int param0) {
        if (param0 != -64) {
            return true;
        }
        return (((ad) this).field_f ^ -1) == 0 ? true : false;
    }

    final static up a(byte param0, kh param1) {
        int var2 = 0;
        int var3 = 0;
        up var4 = null;
        Object var5 = null;
        var2 = param1.b((byte) 44, 4);
        if (param0 != 87) {
          var5 = null;
          up discarded$2 = ad.a((byte) -125, (kh) null);
          var3 = param1.b((byte) 44, 10);
          var4 = new up(var2, var3);
          return var4;
        } else {
          var3 = param1.b((byte) 44, 10);
          var4 = new up(var2, var3);
          return var4;
        }
    }

    final static boolean a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        if (param0 == -13545) {
          L0: while (true) {
            if (bca.field_a.length > var2) {
              if (param1 == bca.field_a[var2]) {
                return true;
              } else {
                var2++;
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        nh[] var7 = null;
        ha var8 = null;
        String var9 = null;
        String var10 = null;
        String stackIn_6_0 = null;
        String stackIn_12_0 = null;
        String stackOut_11_0 = null;
        String stackOut_10_0 = null;
        String stackOut_5_0 = null;
        String stackOut_4_0 = null;
        var5 = -38 / ((32 - param0) / 33);
        var8 = tga.field_a;
        var4_int = ((ad) this).field_k;
        var6 = ((ad) this).field_g;
        var7 = dr.field_a;
        tra.a(1, var7, (byte) -96, var4_int, var8, 64, 1, 64, var6, 0);
        tga.field_a.KA(((ad) this).field_k, ((ad) this).field_g, ((ad) this).field_k + 64, -3 + ((ad) this).field_g - -64);
        if (!((ad) this).a(-64)) {
          L0: {
            fa.field_a[((ad) this).field_f].a(((ad) this).field_k, ((ad) this).field_g);
            tga.field_a.la();
            var3 = 2431750;
            if (!param1) {
              break L0;
            } else {
              var3 = 10309393;
              break L0;
            }
          }
          L1: {
            if (((ad) this).a(-64)) {
              stackOut_11_0 = "";
              stackIn_12_0 = stackOut_11_0;
              break L1;
            } else {
              stackOut_10_0 = la.field_m[((ad) this).field_f];
              stackIn_12_0 = stackOut_10_0;
              break L1;
            }
          }
          var9 = stackIn_12_0;
          var4 = var9;
          int discarded$2 = be.a(var9.toUpperCase(), 1, qf.field_j, var3, 0, 64, 1, 40 + ((ad) this).field_g, -10 + ((ad) this).field_k, -1, (byte) 60, 84);
          return;
        } else {
          L2: {
            nc.field_e.a(((ad) this).field_k, ((ad) this).field_g);
            tga.field_a.la();
            var3 = 2431750;
            if (!param1) {
              break L2;
            } else {
              var3 = 10309393;
              break L2;
            }
          }
          L3: {
            if (((ad) this).a(-64)) {
              stackOut_5_0 = "";
              stackIn_6_0 = stackOut_5_0;
              break L3;
            } else {
              stackOut_4_0 = la.field_m[((ad) this).field_f];
              stackIn_6_0 = stackOut_4_0;
              break L3;
            }
          }
          var10 = stackIn_6_0;
          var4 = var10;
          int discarded$3 = be.a(var10.toUpperCase(), 1, qf.field_j, var3, 0, 64, 1, 40 + ((ad) this).field_g, -10 + ((ad) this).field_k, -1, (byte) 60, 84);
          return;
        }
    }

    ad(int param0, int param1) {
        ((ad) this).field_f = -1;
        ((ad) this).field_k = -2 + param0 - -uca.field_c.a(4, 0);
        ((ad) this).field_g = -5 + (uca.field_c.a(10, 0) + param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Completed";
        field_h = "<%0> wants to draw.";
    }
}
