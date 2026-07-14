/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends br {
    private int field_f;
    static int field_l;
    byte[] field_o;
    static volatile int field_m;
    int field_j;
    static String field_g;
    static String field_n;
    static String field_h;
    int field_k;
    static dk field_i;
    static String field_p;

    public static void a(int param0) {
        field_i = null;
        field_p = null;
        field_n = null;
        field_h = null;
        field_g = null;
        if (param0 != -1569388056) {
            Object var2 = null;
            ma discarded$0 = gi.a(49, (String) null);
        }
    }

    final static fc a(byte[] param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[][] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        L0: {
          var16 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param1 < -86) {
            break L0;
          } else {
            int discarded$1 = gi.a(92, 124, -54, (byte) -50);
            break L0;
          }
        }
        var2 = 1;
        var2++;
        var3 = ql.a(true, var2, param0);
        var2++;
        var4 = ql.a(true, var2, param0);
        var2++;
        var5 = ql.a(true, var2, param0);
        var31 = new int[4];
        var27 = var31;
        var23 = var27;
        var19 = var23;
        var6 = var19;
        var32 = new int[4];
        var28 = var32;
        var24 = var28;
        var20 = var24;
        var7 = var20;
        var8 = 0;
        L1: while (true) {
          if (-5 >= (var8 ^ -1)) {
            var2++;
            var8 = ql.a(true, var2, param0);
            var2++;
            var9 = ql.a(true, var2, param0);
            var2++;
            var10 = ql.a(true, var2, param0);
            var2++;
            var11 = ql.a(true, var2, param0);
            var29 = new int[var11][var10];
            var13 = 0;
            L2: while (true) {
              if (var11 <= var13) {
                var2++;
                var13 = ql.a(true, var2, param0);
                var30 = new int[var13 * 4];
                var26 = var30;
                var22 = var26;
                var18 = var22;
                var14 = var18;
                var15 = 0;
                L3: while (true) {
                  if (var15 >= var13 * 4) {
                    return new fc(var29, var30, var3, var4, var5, var31, var32, var8, var9);
                  } else {
                    var2++;
                    var14[var15] = ql.a(true, var2, param0);
                    var15++;
                    continue L3;
                  }
                }
              } else {
                var14_int = 0;
                L4: while (true) {
                  if (var10 <= var14_int) {
                    var13++;
                    continue L2;
                  } else {
                    var2++;
                    var29[var13][var14_int] = ql.a(true, var2, param0);
                    var14_int++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            var2++;
            var6[var8] = ql.a(true, var2, param0);
            var2++;
            var7[var8] = ql.a(true, var2, param0);
            var8++;
            continue L1;
          }
        }
    }

    final static void a(byte param0, int param1) {
        li.field_C = 3 & param1 >> 1326190436;
        qe.field_g = 3 & param1 >> 2121804290;
        if ((li.field_C ^ -1) < -3) {
            li.field_C = 2;
        }
        if (param0 > -51) {
            field_m = 108;
        }
        if (qe.field_g < -3) {
            qe.field_g = 2;
        }
        ba.field_q = 3 & param1;
        if (!(-3 >= ba.field_q)) {
            ba.field_q = 2;
        }
    }

    final static int a(int param0, int param1, int param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = ZombieDawnMulti.field_E ? 1 : 0;
          if (-1 != (param0 ^ -1)) {
            L1: {
              var7 = param2;
              var8 = var7 / 43;
              var9 = 6 * (-(var8 * 43) + var7);
              var10 = (-param0 + 255) * param1 >> -1672199064;
              var11 = (-(var9 * param0 >> -1569388056) + 255) * param1 >> 476623304;
              if (var10 >= 256) {
                var10 = 255;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var11 < 256) {
                break L2;
              } else {
                var11 = 255;
                break L2;
              }
            }
            L3: {
              var12 = param1 * (255 + -((-var9 + 255) * param0 >> 662336872)) >> -1464657720;
              if (256 <= var12) {
                var12 = 255;
                break L3;
              } else {
                break L3;
              }
            }
            if (0 == var8) {
              var4 = param1;
              var6 = var10;
              var5 = var12;
              break L0;
            } else {
              if (1 != var8) {
                if (2 != var8) {
                  if (-4 == (var8 ^ -1)) {
                    var6 = param1;
                    var5 = var11;
                    var4 = var10;
                    break L0;
                  } else {
                    if (4 != var8) {
                      var4 = param1;
                      var5 = var10;
                      var6 = var11;
                      break L0;
                    } else {
                      var4 = var12;
                      var6 = param1;
                      var5 = var10;
                      break L0;
                    }
                  }
                } else {
                  var5 = param1;
                  var4 = var10;
                  var6 = var12;
                  break L0;
                }
              } else {
                var5 = param1;
                var4 = var11;
                var6 = var10;
                break L0;
              }
            }
          } else {
            var6 = param1;
            var5 = param1;
            var4 = param1;
            break L0;
          }
        }
        L4: {
          if (param3 < -17) {
            break L4;
          } else {
            field_n = null;
            break L4;
          }
        }
        return 255 & var6 | ((255 & var4) << -1050576848 | (var5 & 255) << 372560296);
    }

    final static ma a(int param0, String param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        ma var5 = null;
        L0: {
          if (param0 == 4) {
            break L0;
          } else {
            field_i = null;
            break L0;
          }
        }
        L1: {
          if (param1 == null) {
            break L1;
          } else {
            if (0 != param1.length()) {
              var2 = param1.indexOf('@');
              if (-1 == var2) {
                return jo.field_e;
              } else {
                var3 = param1.substring(0, var2);
                var4 = param1.substring(1 + var2);
                var5 = sb.a(32351, var3);
                if (var5 == null) {
                  return nf.a((byte) 125, var4);
                } else {
                  return var5;
                }
              }
            } else {
              break L1;
            }
          }
        }
        return of.field_d;
    }

    gi(byte[] param0) {
        ((gi) this).field_o = param0;
        ((gi) this).field_f = ((gi) this).field_o[7];
        ((gi) this).field_j = ((gi) this).field_o[11];
        if (4 == ((gi) this).field_f) {
            ((gi) this).field_f = 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_g = "This password contains repeated characters, and would be easy to guess";
        field_h = "Email is valid";
        field_n = "Players";
        field_p = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
