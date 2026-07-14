/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static int[] field_e;
    static String field_g;
    static boolean field_b;
    int field_h;
    static ek[] field_c;
    static qd field_i;
    static int field_d;
    static li field_a;
    static String field_f;

    public static void a(byte param0) {
        field_i = null;
        field_a = null;
        field_c = null;
        field_g = null;
        field_e = null;
        if (param0 != -50) {
            return;
        }
        field_f = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ua(int param0) {
        ((ua) this).field_h = param0;
    }

    final static void a(int param0, int param1, pb param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        L0: {
          var20 = stellarshard.field_B;
          var6 = (param0 + -param1 << -1513262808) / param2.field_w;
          param4 = param4 + param2.field_t;
          param5 = param5 + param2.field_s;
          var7 = (param1 << -2002548056) - -(var6 * param2.field_t);
          var8 = param4 - -(param5 * ti.field_i);
          var9 = 0;
          var10 = param2.field_y;
          var11 = param2.field_v;
          var12 = ti.field_i + -var11;
          var13 = param3;
          if (param5 >= ti.field_f) {
            break L0;
          } else {
            var14 = ti.field_f + -param5;
            param5 = ti.field_f;
            var8 = var8 + ti.field_i * var14;
            var10 = var10 - var14;
            var9 = var9 + var14 * var11;
            break L0;
          }
        }
        L1: {
          if (param4 >= ti.field_e) {
            break L1;
          } else {
            var14 = ti.field_e + -param4;
            var9 = var9 + var14;
            var13 = var13 + var14;
            var11 = var11 - var14;
            var8 = var8 + var14;
            var12 = var12 + var14;
            param4 = ti.field_e;
            var7 = var7 + var14 * var6;
            break L1;
          }
        }
        L2: {
          if (var10 + param5 > ti.field_l) {
            var10 = var10 - (param5 + var10 - ti.field_l);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (ti.field_c < var11 + param4) {
            var14 = -ti.field_c + param4 - -var11;
            var11 = var11 - var14;
            var13 = var13 + var14;
            var12 = var12 + var14;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (var11 <= 0) {
            break L4;
          } else {
            if (var10 > 0) {
              param5 = -var10;
              L5: while (true) {
                if (param5 >= 0) {
                  return;
                } else {
                  var14 = var7;
                  param4 = -var11;
                  L6: while (true) {
                    if (param4 >= 0) {
                      var8 = var8 + var12;
                      var9 = var9 + var13;
                      param5++;
                      continue L5;
                    } else {
                      var15 = var14 >> -1516799512;
                      var16 = 256 - var15;
                      var14 = var14 + var6;
                      if (0 <= var15) {
                        var9++;
                        var17 = param2.field_z[var9];
                        if (0 != var17) {
                          if ((var15 ^ -1) < -256) {
                            ti.field_a[var8] = var17;
                            var8++;
                            param4++;
                            continue L6;
                          } else {
                            var18 = ti.field_a[var8];
                            var19 = var15 * (16711935 & var17) + var16 * (var18 & 16711935) >> 135472296 & 16711935;
                            ti.field_a[var8] = (sa.a(16711841, var15 * sa.a(65280, var17) + var16 * sa.a(65280, var18)) >> 2034937352) + var19;
                            var8++;
                            param4++;
                            continue L6;
                          }
                        } else {
                          var8++;
                          param4++;
                          continue L6;
                        }
                      } else {
                        var9++;
                        var8++;
                        param4++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            } else {
              break L4;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[8192];
        field_g = "Unpacking graphics";
        field_i = new qd(1);
        field_a = new li(0, 2, 2, 1);
        field_f = "Play the game without logging in just yet";
    }
}
