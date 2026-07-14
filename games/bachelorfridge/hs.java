/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hs {
    int field_d;
    int field_b;
    private cda[] field_a;
    static String field_c;
    private su field_e;

    final static boolean a(int param0) {
        if (!(lna.field_q)) {
            return false;
        }
        int var1 = 114 % ((param0 - 0) / 55);
        if (gk.field_d == 0) {
            return true;
        }
        return false;
    }

    final nla a(int param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var12 = 0;
        int var13 = 0;
        nla var14 = null;
        nla var15 = null;
        dha var16 = null;
        dha var17 = null;
        L0: {
          var13 = BachelorFridge.field_y;
          var14 = new nla();
          var15 = var14;
          var4 = -13 / ((param1 - 34) / 41);
          var5 = this.a(param0, 376);
          if (param0 != ((hs) this).field_a[var5].field_a) {
            var6 = 0;
            L1: while (true) {
              if (var6 >= 11) {
                break L0;
              } else {
                var7 = (double)this.a((byte) -95, param0);
                var9 = (double)(param0 - ((hs) this).field_a[var5].field_a);
                var16 = ((hs) this).field_e.field_f[var6][var5].a(var9 / var7, 81);
                var15.field_g[var6].field_h = var16.field_c;
                var15.field_g[var6].field_l = var16.field_a;
                var17 = ((hs) this).field_e.field_d[var6][var5].a(var9 / var7, 72);
                var15.field_g[var6].field_d = var17.field_c;
                var15.field_g[var6].field_e = var17.field_a;
                var12 = ((hs) this).field_e.field_b[var6][var5].a((int)var9, (byte) -52);
                var15.field_g[var6].field_j = var12;
                var6++;
                continue L1;
              }
            }
          } else {
            var14.a(((hs) this).field_a[var5], true);
            break L0;
          }
        }
        return var15;
    }

    private final int a(byte param0, int param1) {
        int var3 = 0;
        L0: {
          if (param0 == -95) {
            break L0;
          } else {
            nla discarded$2 = ((hs) this).a(-51, (byte) 112);
            break L0;
          }
        }
        L1: {
          var3 = this.a(param1, 376);
          if (null == ((hs) this).field_a[var3]) {
            break L1;
          } else {
            if (null != ((hs) this).field_a[var3 + 1]) {
              return ((hs) this).field_a[var3 + 1].field_a + -((hs) this).field_a[var3].field_a;
            } else {
              break L1;
            }
          }
        }
        return -1;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param1 == 376) {
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((hs) this).field_a.length) {
              return 0;
            } else {
              if (((hs) this).field_a[var3] != null) {
                if (((hs) this).field_a[var3].field_a > param0) {
                  return -1 + var3;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return 113;
        }
    }

    final static boolean a(char param0, int param1) {
        if (param0 >= 32) {
            if (param0 <= 126) {
                return true;
            }
        }
        if (param1 != 376) {
            return false;
        }
        if (param0 >= 160) {
            if (param0 <= 255) {
                return true;
            }
        }
        if (param0 != 8364) {
            if (338 != param0) {
                if (8212 != param0) {
                    if (param0 != 339) {
                        if (376 != param0) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    final static boolean a(boolean param0, int[] param1) {
        int var3 = BachelorFridge.field_y;
        int var2 = 0;
        if (param0) {
            return true;
        }
        while (var2 > -9) {
            if (!(-1 == param1[var2])) {
                return true;
            }
            var2++;
        }
        return false;
    }

    hs(int param0, int param1, cda[] param2, int param3) {
        ((hs) this).field_a = param2;
        ((hs) this).field_b = param3;
        ((hs) this).field_d = param1;
        ((hs) this).field_e = new su(((hs) this).field_a);
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -127) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Cleared!";
    }
}
