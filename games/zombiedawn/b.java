/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends le {
    static int field_l;
    int[] field_k;
    boolean field_o;
    static lp field_j;
    static java.applet.Applet field_m;
    static af field_n;
    static int field_q;
    static int[] field_p;
    static boolean field_h;
    static String field_i;

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        bg var6_ref_bg = null;
        int var7 = 0;
        byte[] var8 = null;
        bg var9 = null;
        int var10 = 0;
        byte[] var11 = null;
        bg var13 = null;
        byte[] var14 = null;
        byte[] var17 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (vm.field_w == 0) {
                break L1;
              } else {
                L2: {
                  var2_long = pd.a(-22826);
                  var4 = vm.field_w;
                  if (vd.field_d != 0.0) {
                    var4 = (int)((double)var4 + p.field_b.nextGaussian() * vd.field_d);
                    if (0 > var4) {
                      var4 = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (dp.field_e.field_j > 0) {
                    var14 = new byte[dp.field_e.field_j];
                    var11 = var14;
                    var8 = var11;
                    var17 = var8;
                    var6 = 0;
                    L4: while (true) {
                      if (var14.length <= var6) {
                        var6_ref_bg = new bg((long)var4 + var2_long, dp.field_e.field_j, var17);
                        dj.field_m.a(0, var6_ref_bg);
                        dp.field_e.field_j = 0;
                        break L3;
                      } else {
                        var8[var6] = dp.field_e.field_h[var6];
                        var6++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var9 = (bg) ((Object) dj.field_m.b((byte) 26));
                var13 = var9;
                if (var13 == null) {
                  break L1;
                } else {
                  if ((var2_long ^ -1L) >= (var13.field_h ^ -1L)) {
                    break L1;
                  } else {
                    var13.b(-27598);
                    var10 = 0;
                    var6 = var10;
                    L5: while (true) {
                      if (var13.field_j <= var10) {
                        dp.field_e.field_j = var13.field_j;
                        break L1;
                      } else {
                        dp.field_e.field_h[var10] = var9.field_m[var10];
                        var10++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
            vl.a((byte) -46, param0);
            var2_int = -68 % ((param1 - 1) / 43);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "b.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        field_n = null;
        field_i = null;
        field_j = null;
        field_m = null;
        field_p = null;
        if (param0 != -47) {
            b.a(-22, -89);
        }
    }

    b() {
        this.field_o = false;
    }

    static {
        field_l = 480;
        field_q = -1;
        field_n = new af();
        field_h = false;
        field_i = "Player Name: ";
    }
}
