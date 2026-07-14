/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ub {
    static volatile int field_b;
    fj[] field_a;
    static km[][] field_d;
    static int field_e;
    static String field_c;

    final int a(byte param0, int param1) {
        int var4 = 0;
        fj var5 = null;
        int var6 = Chess.field_G;
        int var3 = -75 % ((param0 - 15) / 43);
        for (var4 = 0; ((ub) this).field_a.length > var4; var4++) {
            var5 = ((ub) this).field_a[var4];
            if (var5.field_i.length > param1) {
                return var4;
            }
            param1 = param1 - (var5.field_i.length - 1);
        }
        return ((ub) this).field_a.length;
    }

    final int c(byte param0) {
        int var2 = 0;
        fj[] var3 = null;
        int var4 = 0;
        fj var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Chess.field_G;
          var2 = -1;
          if (param0 == -24) {
            break L0;
          } else {
            int discarded$2 = ((ub) this).a(87, -122);
            break L0;
          }
        }
        L1: {
          if (null == ((ub) this).field_a) {
            break L1;
          } else {
            var3 = ((ub) this).field_a;
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(false);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
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
        return var2;
    }

    final int a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 34) {
          L0: {
            L1: {
              if (((ub) this).field_a == null) {
                break L1;
              } else {
                if (-1 <= (((ub) this).field_a.length ^ -1)) {
                  break L1;
                } else {
                  stackOut_4_0 = -((ub) this).field_a[0].field_d + ((ub) this).field_a[-1 + ((ub) this).field_a.length].field_e;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0;
        } else {
          return -28;
        }
    }

    final int a(int param0, boolean param1, String param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Chess.field_G;
          var5 = 0;
          if (param1) {
            break L0;
          } else {
            field_e = 17;
            break L0;
          }
        }
        var6 = 0;
        var7 = param2.length();
        var8 = 0;
        L1: while (true) {
          if (var8 >= var7) {
            if (0 < var5) {
              return (param3 + -param0 << -429191896) / var5;
            } else {
              return 0;
            }
          } else {
            var9 = param2.charAt(var8);
            if (var9 != 60) {
              if (var9 == 62) {
                var6 = 0;
                var8++;
                continue L1;
              } else {
                if (var6 == 0) {
                  if (var9 == 32) {
                    var5++;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                } else {
                  var8++;
                  continue L1;
                }
              }
            } else {
              var6 = 1;
              var8++;
              continue L1;
            }
          }
        }
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 21549) {
          L0: {
            L1: {
              if (null == lj.field_a) {
                break L1;
              } else {
                if (tb.field_f != ik.field_e) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        fj var5 = null;
        int var6 = Chess.field_G;
        if (param0 != -5940) {
            field_b = 126;
        }
        fj[] var7 = ((ub) this).field_a;
        fj[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (!(var5.field_i.length <= param1)) {
                return var5.field_i[param1];
            }
            param1 = param1 - (-1 + var5.field_i.length);
        }
        return 0;
    }

    public static void b(byte param0) {
        field_c = null;
        int var1 = -92 / ((-17 - param0) / 43);
        field_d = null;
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        fj var6 = null;
        int var7 = 0;
        int var8 = Chess.field_G;
        if (((ub) this).field_a != null) {
            // if_icmpeq L39
            // if_icmplt L39
        } else {
            return -1;
        }
        if (!(((ub) this).field_a[((ub) this).field_a.length + -1].field_e >= param0)) {
            return -1;
        }
        if (((ub) this).field_a.length == 1) {
            return ((ub) this).field_a[0].a(param2, -1);
        }
        if (param1 <= 3) {
            ub.b((byte) 76);
        }
        int var4 = 0;
        for (var5 = 0; var5 < ((ub) this).field_a.length; var5++) {
            var6 = ((ub) this).field_a[var5];
            if (param0 >= var6.field_d) {
                if (!(var6.field_e < param0)) {
                    var7 = var6.a(param2, -1);
                    if (!(var7 != -1)) {
                        return -1;
                    }
                    return var7 + var4;
                }
            }
            var4 = var4 + (-1 + var6.field_i.length);
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_d = new km[2][7];
        field_c = "Accept <%0> into this game";
    }
}
