/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static String[] field_k;
    private int field_b;
    private String[] field_f;
    private int[] field_g;
    static int[] field_d;
    static int field_a;
    static String field_i;
    private int[] field_h;
    private int field_c;
    static ut[] field_j;
    static boolean field_e;

    final static kg[] a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        kg[] var6 = null;
        kg var7_ref_kg = null;
        int var7 = 0;
        int var8_int = 0;
        tf var8 = null;
        int var9 = 0;
        int var10_int = 0;
        ut var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        kg[] var15 = null;
        Object var16 = null;
        nr var17 = null;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var16 = null;
        var14 = Kickabout.field_G;
        var15 = new kg[6];
        var6 = var15;
        if (!vi.field_n) {
          var7_ref_kg = eo.a(bt.a(-126, param4, param3));
          var8_int = 0;
          L0: while (true) {
            if (6 <= var8_int) {
              return var6;
            } else {
              var15[var8_int] = var7_ref_kg;
              var8_int++;
              continue L0;
            }
          }
        } else {
          L1: {
            if (param2 < -2) {
              break L1;
            } else {
              field_i = null;
              break L1;
            }
          }
          L2: {
            if (!param4) {
              stackOut_10_0 = 2;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = 6;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          var7 = stackIn_11_0;
          var8 = new tf();
          var9 = 0;
          L3: while (true) {
            if (-5 >= (var9 ^ -1)) {
              var9 = 0;
              L4: while (true) {
                if (-7 >= (var9 ^ -1)) {
                  return var6;
                } else {
                  jm.a(100, 9863, (param5 + -param0) * var9 / 6 + param0);
                  var10 = bt.a(-127, param4, param3);
                  iw.a(87, var10);
                  var17 = (nr) (Object) var8.g(24009);
                  L5: while (true) {
                    if (var17 == null) {
                      ta.e(121);
                      var6[var9] = eo.a(var10);
                      var9++;
                      continue L4;
                    } else {
                      var17.a(var9, -2);
                      var17 = (nr) (Object) var8.c(33);
                      continue L5;
                    }
                  }
                }
              }
            } else {
              var10_int = 0;
              L6: while (true) {
                if (2 - -param3 <= var10_int) {
                  var9++;
                  continue L3;
                } else {
                  if (p.a((byte) -24, 256) <= param1) {
                    L7: {
                      var11 = p.a((byte) -24, 5);
                      var12 = p.a((byte) -24, 5);
                      var13 = var12 + (var9 * 36 + 20);
                      if (!param4) {
                        var13 = ph.field_e[0][0].field_i - var13;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var8.a((gn) (Object) new nr(var13, var10_int * 26 + 63 + 11 * var9, var7, var11), 3);
                    var10_int++;
                    continue L6;
                  } else {
                    var10_int++;
                    continue L6;
                  }
                }
              }
            }
          }
        }
    }

    final void a(ml param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Kickabout.field_G;
          ((ng) this).field_b = param0.j((byte) -104);
          ((ng) this).field_c = param0.h((byte) -123);
          ((ng) this).field_h = new int[((ng) this).field_c];
          ((ng) this).field_g = new int[((ng) this).field_c];
          ((ng) this).field_f = new String[((ng) this).field_c];
          if (param1 == -20363) {
            break L0;
          } else {
            field_j = null;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (((ng) this).field_c <= var3) {
            return;
          } else {
            ((ng) this).field_g[var3] = param0.h((byte) -108);
            if (((ng) this).field_g[var3] != 0) {
              ((ng) this).field_h[var3] = param0.h((byte) -117);
              var3++;
              continue L1;
            } else {
              ((ng) this).field_f[var3] = param0.a(-117);
              var3++;
              continue L1;
            }
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 != -4) {
            field_e = false;
        }
        return nn.field_D;
    }

    final String a(byte param0) {
        String[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        String[] var5 = null;
        var4 = Kickabout.field_G;
        if (param0 == 51) {
          if ((((ng) this).field_b ^ -1) <= -1) {
            var5 = new String[((ng) this).field_c];
            var2 = var5;
            var3 = 0;
            L0: while (true) {
              if (((ng) this).field_c <= var3) {
                return vo.a((byte) -18, rv.field_d[((ng) this).field_b], var5);
              } else {
                if (-1 != ((ng) this).field_g[var3]) {
                  if (-2 != ((ng) this).field_g[var3]) {
                    if (2 == ((ng) this).field_g[var3]) {
                      var2[var3] = eb.field_g[((ng) this).field_h[var3]];
                      var3++;
                      continue L0;
                    } else {
                      if (-4 == (((ng) this).field_g[var3] ^ -1)) {
                        var2[var3] = kp.field_g[((ng) this).field_h[var3]];
                        var3++;
                        continue L0;
                      } else {
                        var3++;
                        continue L0;
                      }
                    }
                  } else {
                    var2[var3] = qb.field_Qb[((ng) this).field_h[var3]];
                    var3++;
                    continue L0;
                  }
                } else {
                  var2[var3] = ((ng) this).field_f[var3];
                  var3++;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static ut[] a(String param0, String param1, int param2, sj param3) {
        int var4 = param3.b(param1, param2 + -3);
        if (param2 != 2) {
            field_j = null;
        }
        int var5 = param3.a((byte) -104, param0, var4);
        return dk.a(var4, var5, (byte) -123, param3);
    }

    final static void a(int param0, int param1) {
        ig.field_d = param0;
        mf.field_Db = null;
        um.field_b = false;
        if (param1 <= 27) {
            field_k = null;
        }
    }

    public static void b(int param0) {
        field_j = null;
        field_k = null;
        if (param0 <= 40) {
            boolean discarded$0 = ng.a(-83);
        }
        field_i = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "You appear to be telling someone your password - please don't!";
        field_d = new int[7];
        field_k = new String[]{"Power affects how fast a character can charge up shots, and how hard the ball is kicked. <col=88aaff>Hotshots</col> with high POW stats make unstoppable strikers.", "Characters with a high SPD run faster and can use their sprint ability more often. This is the <col=33ff33>Ranger's</col> favourite stat, because he can sprint with the ball.", "TCK allows a character to travel further and faster when tackling. This is ideal for heavy defenders such as the <col=ff0000>Tank</col>, who can turn while tackling.", "EXP is earned by all characters at the end of every match. When EXP reaches 100%, it can be spent on another stat point (in POW, SPD or TCK) to make the character even stronger."};
        field_d[0] = 10;
        field_d[1] = 20;
        field_d[6] = 80;
        field_d[4] = 60;
        field_d[5] = 70;
        field_d[2] = 40;
        field_d[3] = 50;
    }
}
