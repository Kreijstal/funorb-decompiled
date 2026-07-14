/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends pg {
    int field_o;
    int field_j;
    int field_m;
    int field_g;
    vl field_h;
    static String field_k;
    static String field_l;
    int field_n;
    static ll[] field_i;

    final static void d(byte param0) {
        byte[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        var8 = new byte[27];
        var12 = var8;
        var11 = var12;
        var10 = var11;
        var9 = var10;
        var1 = var9;
        var2 = 0;
        var2++;
        var8[var2] = (byte) 0;
        var3 = 0;
        L0: while (true) {
          if (4 <= var3) {
            var3 = 0;
            L1: while (true) {
              if (6 <= var3) {
                L2: {
                  if (param0 > 59) {
                    break L2;
                  } else {
                    field_l = null;
                    break L2;
                  }
                }
                var3 = 0;
                L3: while (true) {
                  if (16 <= var3) {
                    L4: {
                      if (lc.a((byte) 112)) {
                        break L4;
                      } else {
                        f discarded$1 = tf.a(6, -25866, var12);
                        break L4;
                      }
                    }
                    return;
                  } else {
                    var2++;
                    var1[var2] = (byte)b.field_f[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                var2++;
                var1[var2] = (byte)so.field_c[var3];
                var3++;
                continue L1;
              }
            }
          } else {
            L5: {
              var4 = null;
              if (var3 == -1) {
                var4 = ld.field_n;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-2 != var3) {
                break L6;
              } else {
                var4 = ud.field_z;
                break L6;
              }
            }
            L7: {
              if (var3 != -3) {
                break L7;
              } else {
                var4 = ug.field_d;
                break L7;
              }
            }
            L8: {
              if (-4 == var3) {
                var4 = hi.field_b;
                break L8;
              } else {
                break L8;
              }
            }
            var5 = -1;
            var6 = 0;
            L9: while (true) {
              if (var6 >= var4.length) {
                if ((var5 ^ -1) != 0) {
                  var2++;
                  var1[var2] = (byte)var5;
                  var3++;
                  continue L0;
                } else {
                  var2++;
                  var1[var2] = (byte) 0;
                  var3++;
                  continue L0;
                }
              } else {
                if (var4[var6][0] == kg.field_d[var3][0]) {
                  if (var4[var6][1] == kg.field_d[var3][1]) {
                    if (kg.field_d[var3][2] == var4[var6][2]) {
                      var5 = (byte)var6;
                      var6++;
                      continue L9;
                    } else {
                      var6++;
                      continue L9;
                    }
                  } else {
                    var6++;
                    continue L9;
                  }
                } else {
                  var6++;
                  continue L9;
                }
              }
            }
          }
        }
    }

    final static void a(byte param0, ij param1) {
        int var2 = 72 % ((param0 - 77) / 38);
        co.field_f.a((kc) (Object) param1, 9);
    }

    public static void a(byte param0) {
        field_k = null;
        field_l = null;
        field_i = null;
        if (param0 > -66) {
            field_i = null;
        }
    }

    final static String a(byte param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = param1.length();
          var3 = 21 / ((param0 - 40) / 54);
          if (var2 <= 20) {
            break L0;
          } else {
            var2 = 20;
            break L0;
          }
        }
        var9 = new char[var2];
        var8 = var9;
        var4 = var8;
        var5 = 0;
        L1: while (true) {
          if (var2 <= var5) {
            return new String(var9);
          } else {
            L2: {
              var6 = param1.charAt(var5);
              if (var6 < 65) {
                break L2;
              } else {
                if (var6 <= 90) {
                  var4[var5] = (char)(var6 + 32);
                  var5++;
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (var6 < 97) {
                  break L4;
                } else {
                  if (122 >= var6) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (var6 < 48) {
                  break L5;
                } else {
                  if (var6 <= 57) {
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              var4[var5] = (char)95;
              var5++;
              continue L1;
            }
            var4[var5] = (char)var6;
            var5++;
            continue L1;
          }
        }
    }

    final static void a(int param0) {
        if (!vh.field_n) {
            lo.field_q = (1600 + lo.field_q * 120) / 128;
        } else {
            lo.field_q = 120 * lo.field_q / 128;
        }
        if (param0 != 128) {
            Object var2 = null;
            vl.a((byte) 37, (ij) null);
        }
    }

    vl(int param0, int param1, int param2, int param3, int param4) {
        ((vl) this).field_o = param1;
        ((vl) this).field_j = param0;
        ((vl) this).field_n = param4;
        ((vl) this).field_g = param3;
        ((vl) this).field_m = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "This is a <col=ff80ff><shad=0>level 3</col></shad> spell and is unavailable unless you also put 5 other spells from the <%0> into your spellbook. You currently only have <%1>";
        field_l = "Choose the spells you wish your Arcanist to take into battle.<br>Select a spellbook from the top of the screen, then select your spells from the wheel to the left. You can remove spells from your spellbook by clicking on the icons above.";
    }
}
