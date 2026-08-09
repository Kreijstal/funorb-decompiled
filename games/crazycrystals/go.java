/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go extends ln {
    static String field_k;
    static boolean field_i;
    static String field_g;
    static ef field_l;
    static String field_j;
    static long field_h;

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = CrazyCrystals.field_B;
        try {
          L0: {
            pj.a(ae.field_F, param0, be.field_c, true, uo.field_m, (byte) 119, 0);
            var2_int = 0;
            L1: while (true) {
              if (be.field_c <= var2_int) {
                if (param1 == 240) {
                  L2: {
                    pj.a(db.field_i, param0 + param0, be.field_c + param0, false, em.field_i, (byte) 119, param0);
                    if (param0 < be.field_c) {
                      be.field_c = param0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                wp.field_d[var2_int + param0] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "go.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_l = null;
        if (param0 < 48) {
            go.b((byte) -69);
        }
        field_g = null;
        field_j = null;
        field_k = null;
    }

    final int a(int param0, byte param1) {
        int var3 = 45 % ((55 - param1) / 50);
        return q.field_a[param0].field_l;
    }

    go(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final static void a(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param0 == -21587) {
              var5 = ga.field_J;
              var1 = var5;
              var2 = 0;
              var3 = var5.length;
              L1: while (true) {
                if (var2 >= var3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  incrementValue$16 = var2;
                  var2++;
                  var5[incrementValue$16] = 0;
                  incrementValue$17 = var2;
                  var2++;
                  var5[incrementValue$17] = 0;
                  incrementValue$18 = var2;
                  var2++;
                  var5[incrementValue$18] = 0;
                  incrementValue$19 = var2;
                  var2++;
                  var5[incrementValue$19] = 0;
                  incrementValue$20 = var2;
                  var2++;
                  var5[incrementValue$20] = 0;
                  incrementValue$21 = var2;
                  var2++;
                  var5[incrementValue$21] = 0;
                  incrementValue$22 = var2;
                  var2++;
                  var5[incrementValue$22] = 0;
                  incrementValue$23 = var2;
                  var2++;
                  var5[incrementValue$23] = 0;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1_ref), "go.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(int param0) {
        ne.field_b = false;
        kd.field_n.h(param0 ^ 287);
        if (param0 != 480) {
            field_l = (ef) null;
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dl var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var10 = CrazyCrystals.field_B;
        try {
          L0: {
            var3_int = 228 - 12 * param1;
            var4 = param1 * 12 + 252;
            var5 = 228 + -(12 * param0);
            var6 = 12 * param0 + 252;
            kh.d(0, 0, 480, var5, 0, 64);
            kh.d(0, var5, var3_int, -var5 + var6, 0, 64);
            kh.d(var3_int, var5, -var3_int + var4, -var5 + var6, 0, 192);
            kh.d(var4, var5, 480 - var4, var6 + -var5, 0, 64);
            kh.d(0, var6, 480, 480 + -var6, 0, 64);
            var7 = tm.field_d[0][0].a((byte) -46);
            var8 = le.field_g[var7][0];
            var9 = -1;
            L1: while (true) {
              if (param1 < var9) {
                L2: {
                  var9 = 0;
                  if (!param2) {
                    break L2;
                  } else {
                    field_l = (ef) null;
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var9 >= param0) {
                    var9 = -1;
                    L4: while (true) {
                      if (var9 > param1) {
                        break L0;
                      } else {
                        var8.b(var9 * 24 + (240 + -(12 * param1)), 234 - -(12 * param0), 24, 36);
                        var9++;
                        continue L4;
                      }
                    }
                  } else {
                    var8.b(-24 + (240 + -(param1 * 12)), var9 * 24 + (-(param0 * 12) + 234), 24, 36);
                    var8.b(240 - -(param1 * 12), 234 - 12 * param0 - -(var9 * 24), 24, 36);
                    var9++;
                    continue L3;
                  }
                }
              } else {
                var8.b(-(param1 * 12) + (240 - -(24 * var9)), 234 - param0 * 12 - 24, 24, 36);
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var3), "go.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_k = "You cannot play this level yet.";
        field_g = "Your email address is used to identify this account";
        field_j = "Continue";
    }
}
