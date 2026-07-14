/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends ka {
    static String field_q;
    static String[][] field_s;
    static bi field_r;
    static int field_p;

    final int c(ln param0, int param1) {
        int var3 = 0;
        ln[] var4 = null;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          var3 = 0;
          if (param1 == -5) {
            break L0;
          } else {
            field_s = null;
            break L0;
          }
        }
        var4 = param0.field_D;
        var5 = 0;
        L1: while (true) {
          if (var5 >= var4.length) {
            return super.c(param0, -5) - -(var3 * 4);
          } else {
            var6 = var4[var5];
            if (((ma) this).field_n == var6.field_y) {
              var3++;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    final static void j(int param0) {
        if (param0 != 25140) {
            return;
        }
        if ((oq.field_j ^ -1) == -85) {
            fl.a(0, "enter");
            return;
        }
    }

    final static int a(CharSequence param0, int param1) {
        if (param1 != 2) {
            return -125;
        }
        return fc.a(10, param0, (byte) -108, true);
    }

    final int d(ln param0, int param1) {
        if (param1 != 2) {
            Object var4 = null;
            int discarded$0 = ((ma) this).a((byte) -71, (ln) null);
        }
        int var3 = ((ma) this).a(-5, param0) + (param0.field_x >> 2081046625);
        return -1 != (var3 ^ -1) ? var3 : 1;
    }

    ma(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 7);
    }

    public static void i(int param0) {
        field_r = null;
        field_q = null;
        field_s = null;
        if (param0 <= 3) {
            field_r = null;
        }
    }

    final int a(byte param0, ln param1) {
        int var3 = 0;
        int var5 = 0;
        ln[] var7 = null;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        Object var11 = null;
        ln[] var12 = null;
        ln var13 = null;
        fs[] var14 = null;
        fs var15 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = 0;
        var12 = param1.field_D;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var12.length) {
            L1: {
              var14 = ((ma) this).field_g.field_v;
              var5 = 0;
              if (param0 < -14) {
                break L1;
              } else {
                var11 = null;
                int discarded$1 = ((ma) this).d((ln) null, 93);
                break L1;
              }
            }
            L2: while (true) {
              if (var5 >= var14.length) {
                return var3;
              } else {
                var15 = var14[var5];
                if (((ma) this).field_n != var15) {
                  if (!((ma) this).field_n.field_h[var15.field_x]) {
                    var7 = param1.field_D;
                    var8 = 0;
                    L3: while (true) {
                      if (var8 < var7.length) {
                        var9 = var7[var8];
                        if (var9.field_y == var15) {
                          var3 = var3 + var9.field_R.field_r;
                          var8++;
                          continue L3;
                        } else {
                          var8++;
                          continue L3;
                        }
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    var5++;
                    continue L2;
                  }
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          } else {
            var13 = var12[var5];
            if (null != var13.field_y) {
              if (var13.field_y != ((ma) this).field_n) {
                if (!((ma) this).field_n.field_h[var13.field_y.field_x]) {
                  var3 = var3 + var13.field_x;
                  var5++;
                  continue L0;
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final int[] b(int param0) {
        int var2 = -23 / ((-48 - param0) / 61);
        return new int[]{17, 15};
    }

    final int a(int param0, byte param1) {
        if (param1 > -25) {
            Object var4 = null;
            int discarded$0 = ma.a((CharSequence) null, -24);
        }
        if (param0 < 5) {
            return param0;
        }
        if ((param0 ^ -1) > -26) {
            return (param0 - -5) / 2;
        }
        return -10 + param0;
    }

    final int b(byte param0, ln param1) {
        int var3 = 126 / ((param0 - -44) / 62);
        return ((ma) this).a((byte) -92, param1) * 3 >> (!param1.field_u ? 1 : 2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_s = new String[][]{new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[2], new String[1], new String[1], new String[1], new String[1], new String[3], new String[1], new String[1]};
    }
}
