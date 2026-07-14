/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ep {
    static int[] field_f;
    static int field_k;
    ml[] field_c;
    static volatile int field_g;
    static String field_e;
    static int field_i;
    static jp field_j;
    static jp field_h;
    static float field_a;
    static String field_d;
    static jp field_b;

    final int a(int param0, boolean param1) {
        int var3 = 0;
        ml var4 = null;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (!param1) {
            ep.a(false);
        }
        for (var3 = 0; ((ep) this).field_c.length > var3; var3++) {
            var4 = ((ep) this).field_c[var3];
            if (!(var4.field_g.length <= param0)) {
                return var3;
            }
            param0 = param0 - (var4.field_g.length - 1);
        }
        return ((ep) this).field_c.length;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0;
        int stackOut_5_0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            int discarded$2 = ((ep) this).a(-90, true, 49);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((ep) this).field_c) {
              break L2;
            } else {
              if (((ep) this).field_c.length <= 0) {
                break L2;
              } else {
                stackOut_4_0 = -((ep) this).field_c[0].field_d + ((ep) this).field_c[((ep) this).field_c.length - 1].field_a;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, byte param1) {
        int var4 = 0;
        ml var5 = null;
        int var6 = BrickABrac.field_J ? 1 : 0;
        if (param1 >= -33) {
            return -38;
        }
        ml[] var7 = ((ep) this).field_c;
        ml[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5.field_g.length > param0) {
                return var5.field_g[param0];
            }
            param0 = param0 - (var5.field_g.length + -1);
        }
        return 0;
    }

    final int a(int param0, boolean param1, int param2) {
        int var5 = 0;
        ml var6 = null;
        int var7 = 0;
        int var8 = BrickABrac.field_J ? 1 : 0;
        if (((ep) this).field_c != null) {
            // if_icmpeq L37
            // if_icmpgt L37
        } else {
            return -1;
        }
        if (((ep) this).field_c[-1 + ((ep) this).field_c.length].field_a < param2) {
            return -1;
        }
        if ((((ep) this).field_c.length ^ -1) == -2) {
            return ((ep) this).field_c[0].a((byte) -95, param0);
        }
        if (param1) {
            field_d = null;
        }
        int var4 = 0;
        for (var5 = 0; var5 < ((ep) this).field_c.length; var5++) {
            var6 = ((ep) this).field_c[var5];
            if (param2 >= var6.field_d) {
                if (!(var6.field_a < param2)) {
                    var7 = var6.a((byte) -95, param0);
                    if (!(0 != (var7 ^ -1))) {
                        return -1;
                    }
                    return var7 + var4;
                }
            }
            var4 = var4 + (-1 + var6.field_g.length);
        }
        return -1;
    }

    public static void a(boolean param0) {
        field_f = null;
        if (!param0) {
            field_b = null;
        }
        field_b = null;
        field_e = null;
        field_h = null;
        field_j = null;
        field_d = null;
    }

    final int b(int param0) {
        int var2 = 0;
        ml[] var3 = null;
        int var4 = 0;
        ml var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (param0 == 31458) {
          L0: {
            var2 = -1;
            if (null != ((ep) this).field_c) {
              var3 = ((ep) this).field_c;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3.length) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.b((byte) 56);
                    if (var6 > var2) {
                      var2 = var6;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          return 12;
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0;
        int stackOut_5_0;
        L0: {
          param2 = wj.a(-1, param2, '_', "");
          if (param1 == 73) {
            break L0;
          } else {
            ep.a(true);
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = w.a(10, param2);
            if (0 != (param0.indexOf(param2) ^ -1)) {
              break L2;
            } else {
              if (-1 == param0.indexOf(var3)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final int a(int param0, int param1, String param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = BrickABrac.field_J ? 1 : 0;
        var5 = 0;
        var6 = 0;
        var7 = param2.length();
        var8 = 0;
        L0: while (true) {
          if (var7 <= var8) {
            L1: {
              if (param3) {
                break L1;
              } else {
                field_k = 66;
                break L1;
              }
            }
            if (var5 <= 0) {
              return 0;
            } else {
              return (param0 - param1 << -1617102104) / var5;
            }
          } else {
            var9 = param2.charAt(var8);
            if (60 == var9) {
              var6 = 1;
              var8++;
              continue L0;
            } else {
              if (var9 == 62) {
                var6 = 0;
                var8++;
                continue L0;
              } else {
                if (var6 == 0) {
                  if (var9 == 32) {
                    var5++;
                    var8++;
                    continue L0;
                  } else {
                    var8++;
                    continue L0;
                  }
                } else {
                  var8++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[8192];
        field_g = -1;
        field_d = "Logging in...";
    }
}
