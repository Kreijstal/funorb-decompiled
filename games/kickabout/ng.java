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
        int stackIn_11_0 = 0;
        kg[] var6;
        kg var7_ref_kg;
        int var7;
        int var8_int;
        tf var8;
        int var9;
        ut var10;
        int var10_int;
        int var11;
        int var12;
        int var13;
        int var14;
        kg[] var15;
        Object var16;
        nr var17;
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
              field_i = (String) null;
              break L1;
            }
          }
          L2: {
            if (!param4) {
              stackIn_11_0 = 2;
              break L2;
            } else {
              stackIn_11_0 = 6;
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
                  var17 = (nr) ((Object) var8.g(24009));
                  L5: while (true) {
                    if (var17 == null) {
                      ta.e(121);
                      var6[var9] = eo.a(var10);
                      var9++;
                      continue L4;
                    } else {
                      var17.a(var9, -2);
                      var17 = (nr) ((Object) var8.c(33));
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
                    var8.a(new nr(var13, var10_int * 26 + 63 + 11 * var9, var7, var11), 3);
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
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              this.field_b = param0.j((byte) -104);
              this.field_c = param0.h((byte) -123);
              this.field_h = new int[this.field_c];
              this.field_g = new int[this.field_c];
              this.field_f = new String[this.field_c];
              if (param1 == -20363) {
                break L1;
              } else {
                field_j = (ut[]) null;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (this.field_c <= var3_int) {
                break L0;
              } else {
                L3: {
                  this.field_g[var3_int] = param0.h((byte) -108);
                  if (this.field_g[var3_int] != 0) {
                    this.field_h[var3_int] = param0.h((byte) -117);
                    break L3;
                  } else {
                    this.field_f[var3_int] = param0.a(-117);
                    break L3;
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ng.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 != -4) {
            field_e = false;
        }
        return nn.field_D;
    }

    final String a(byte param0) {
        String[] var2;
        int var3;
        int var4;
        String[] var5;
        var4 = Kickabout.field_G;
        if (param0 == 51) {
          if ((this.field_b ^ -1) <= -1) {
            var5 = new String[this.field_c];
            var2 = var5;
            var3 = 0;
            L0: while (true) {
              if (this.field_c <= var3) {
                return vo.a((byte) -18, rv.field_d[this.field_b], var5);
              } else {
                if (-1 != (this.field_g[var3] ^ -1)) {
                  if (-2 != (this.field_g[var3] ^ -1)) {
                    if (2 == this.field_g[var3]) {
                      var2[var3] = eb.field_g[this.field_h[var3]];
                      var3++;
                      continue L0;
                    } else {
                      if (-4 == (this.field_g[var3] ^ -1)) {
                        var2[var3] = kp.field_g[this.field_h[var3]];
                        var3++;
                        continue L0;
                      } else {
                        var3++;
                        continue L0;
                      }
                    }
                  } else {
                    var2[var3] = qb.field_Qb[this.field_h[var3]];
                    var3++;
                    continue L0;
                  }
                } else {
                  var2[var3] = this.field_f[var3];
                  var3++;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return (String) null;
        }
    }

    final static ut[] a(String param0, String param1, int param2, sj param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ut[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param3.b(param1, param2 + -3);
              if (param2 == 2) {
                break L1;
              } else {
                field_j = (ut[]) null;
                break L1;
              }
            }
            var5 = param3.a((byte) -104, param0, var4_int);
            stackIn_3_0 = dk.a(var4_int, var5, (byte) -123, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ng.G(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1) {
        ig.field_d = param0;
        mf.field_Db = null;
        um.field_b = false;
        if (param1 <= 27) {
            field_k = (String[]) null;
        }
    }

    public static void b(int param0) {
        field_j = null;
        field_k = null;
        if (param0 <= 40) {
            ng.a(-83);
        }
        field_i = null;
        field_d = null;
    }

    static {
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
