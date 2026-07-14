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
        int var2 = 0;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        bg var6_ref = null;
        int var7 = 0;
        byte[] var8 = null;
        int var10 = 0;
        byte[] var11 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        Object var19 = null;
        Object var21 = null;
        Object var23 = null;
        Object var25 = null;
        Object var27 = null;
        Object var30 = null;
        Object var32 = null;
        Object var34 = null;
        Object var36 = null;
        Object var40 = null;
        Object var43 = null;
        Object var45 = null;
        Object var49 = null;
        Object var50 = null;
        Object var51 = null;
        Object var53 = null;
        bg var54 = null;
        Object var55 = null;
        bg var55_ref = null;
        byte[] var56 = null;
        bg var58 = null;
        Object var59 = null;
        bg var59_ref = null;
        byte[] var60 = null;
        bg var62 = null;
        Object var63 = null;
        bg var63_ref = null;
        byte[] var64 = null;
        byte[] var65 = null;
        byte[] var70 = null;
        byte[] var71 = null;
        byte[] var72 = null;
        byte[] var73 = null;
        var55 = null;
        var19 = null;
        var21 = null;
        var51 = null;
        var23 = null;
        var25 = null;
        var27 = null;
        var30 = null;
        var32 = null;
        var50 = null;
        var34 = null;
        var36 = null;
        var40 = null;
        var43 = null;
        var45 = null;
        var49 = null;
        var53 = null;
        var59 = null;
        var63 = null;
        var7 = ZombieDawn.field_J;
        if (vm.field_w != 0) {
          var2_long = pd.a(-22826);
          var4 = vm.field_w;
          if (vd.field_d != 0.0) {
            var4 = (int)((double)var4 + p.field_b.nextGaussian() * vd.field_d);
            if (0 <= var4) {
              L0: {
                if (dp.field_e.field_j > 0) {
                  var70 = new byte[dp.field_e.field_j];
                  var56 = var70;
                  var14 = var56;
                  var11 = var14;
                  var8 = var11;
                  var71 = var8;
                  var6 = 0;
                  L1: while (true) {
                    if (var70.length <= var6) {
                      var6_ref = new bg((long)var4 + var2_long, dp.field_e.field_j, var71);
                      dj.field_m.a(0, (le) (Object) var6_ref);
                      dp.field_e.field_j = 0;
                      break L0;
                    } else {
                      var8[var6] = dp.field_e.field_h[var6];
                      var6++;
                      continue L1;
                    }
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                var59_ref = (bg) (Object) dj.field_m.b((byte) 26);
                var58 = var59_ref;
                if (var58 == null) {
                  break L2;
                } else {
                  if ((var2_long ^ -1L) >= (var58.field_h ^ -1L)) {
                    break L2;
                  } else {
                    var58.b(-27598);
                    var10 = 0;
                    var6 = var10;
                    L3: while (true) {
                      if (var58.field_j <= var10) {
                        dp.field_e.field_j = var58.field_j;
                        break L2;
                      } else {
                        dp.field_e.field_h[var10] = var59_ref.field_m[var10];
                        var10++;
                        continue L3;
                      }
                    }
                  }
                }
              }
              vl.a((byte) -46, param0);
              var2 = -68 % ((param1 - 1) / 43);
              return;
            } else {
              L4: {
                var4 = 0;
                if (dp.field_e.field_j > 0) {
                  var72 = new byte[dp.field_e.field_j];
                  var60 = var72;
                  var14 = var60;
                  var11 = var14;
                  var8 = var11;
                  var73 = var8;
                  var6 = 0;
                  L5: while (true) {
                    if (var72.length <= var6) {
                      var6_ref = new bg((long)var4 + var2_long, dp.field_e.field_j, var73);
                      dj.field_m.a(0, (le) (Object) var6_ref);
                      dp.field_e.field_j = 0;
                      break L4;
                    } else {
                      var8[var6] = dp.field_e.field_h[var6];
                      var6++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                var63_ref = (bg) (Object) dj.field_m.b((byte) 26);
                var62 = var63_ref;
                if (var62 == null) {
                  break L6;
                } else {
                  if ((var2_long ^ -1L) >= (var62.field_h ^ -1L)) {
                    break L6;
                  } else {
                    var62.b(-27598);
                    var10 = 0;
                    var6 = var10;
                    L7: while (true) {
                      if (var62.field_j <= var10) {
                        dp.field_e.field_j = var62.field_j;
                        break L6;
                      } else {
                        dp.field_e.field_h[var10] = var63_ref.field_m[var10];
                        var10++;
                        continue L7;
                      }
                    }
                  }
                }
              }
              vl.a((byte) -46, param0);
              var2 = -68 % ((param1 - 1) / 43);
              return;
            }
          } else {
            L8: {
              if (dp.field_e.field_j > 0) {
                var64 = new byte[dp.field_e.field_j];
                var16 = var64;
                var14 = var16;
                var11 = var14;
                var8 = var11;
                var65 = var8;
                var17 = var65;
                var15 = var17;
                var6 = 0;
                L9: while (true) {
                  if (var64.length <= var6) {
                    var6_ref = new bg((long)var4 + var2_long, dp.field_e.field_j, var65);
                    dj.field_m.a(0, (le) (Object) var6_ref);
                    dp.field_e.field_j = 0;
                    break L8;
                  } else {
                    var8[var6] = dp.field_e.field_h[var6];
                    var6++;
                    continue L9;
                  }
                }
              } else {
                break L8;
              }
            }
            var55_ref = (bg) (Object) dj.field_m.b((byte) 26);
            var54 = var55_ref;
            if (var54 == null) {
              vl.a((byte) -46, param0);
              var2 = -68 % ((param1 - 1) / 43);
              return;
            } else {
              L10: {
                if ((var2_long ^ -1L) >= (var54.field_h ^ -1L)) {
                  break L10;
                } else {
                  var54.b(-27598);
                  var10 = 0;
                  var6 = var10;
                  L11: while (true) {
                    if (var54.field_j <= var10) {
                      dp.field_e.field_j = var54.field_j;
                      break L10;
                    } else {
                      dp.field_e.field_h[var10] = var55_ref.field_m[var10];
                      var10++;
                      continue L11;
                    }
                  }
                }
              }
              vl.a((byte) -46, param0);
              var2 = -68 % ((param1 - 1) / 43);
              return;
            }
          }
        } else {
          vl.a((byte) -46, param0);
          var2 = -68 % ((param1 - 1) / 43);
          return;
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
        ((b) this).field_o = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 480;
        field_q = -1;
        field_n = new af();
        field_h = false;
        field_i = "Player Name: ";
    }
}
