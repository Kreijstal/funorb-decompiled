/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tm extends am {
    static ot field_z;
    static ut field_u;
    static String field_r;
    static ut field_v;
    static int field_t;
    String field_s;
    static int[][] field_x;
    Class[] field_p;
    String field_o;
    static int[] field_y;
    static ut[] field_n;
    static ut field_w;
    static String[] field_q;

    public static void a(int param0) {
        field_n = null;
        field_w = null;
        field_r = null;
        field_u = null;
        field_v = null;
        field_q = null;
        if (param0 != 15) {
          field_x = null;
          field_x = null;
          field_y = null;
          field_z = null;
          return;
        } else {
          field_x = null;
          field_y = null;
          field_z = null;
          return;
        }
    }

    final boolean a(li[] param0, int param1, String param2) {
        int var4 = 0;
        int var6 = 0;
        Object var7 = null;
        Class var8 = null;
        Class var9 = null;
        var6 = Kickabout.field_G;
        if (param1 == 2) {
          if (!((tm) this).field_o.equals((Object) (Object) param2)) {
            return false;
          } else {
            if (param0.length != ((tm) this).field_p.length) {
              return false;
            } else {
              var4 = 0;
              L0: while (true) {
                if (((tm) this).field_p.length > var4) {
                  if (param0[var4].field_b) {
                    L1: {
                      var9 = rm.a(param0[var4].field_d, (byte) 127);
                      if (var9 != Boolean.TYPE) {
                        break L1;
                      } else {
                        if (((tm) this).field_p[var4] != Boolean.TYPE) {
                          return false;
                        } else {
                          break L1;
                        }
                      }
                    }
                    L2: {
                      if (Character.TYPE != var9) {
                        break L2;
                      } else {
                        if (((tm) this).field_p[var4] == Character.TYPE) {
                          break L2;
                        } else {
                          return false;
                        }
                      }
                    }
                    if (fp.a(89, var9)) {
                      if (fp.a(98, ((tm) this).field_p[var4])) {
                        var4++;
                        continue L0;
                      } else {
                        return false;
                      }
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    if (((tm) this).field_p[var4].isInstance(param0[var4].field_d)) {
                      var4++;
                      var4++;
                      continue L0;
                    } else {
                      return false;
                    }
                  }
                } else {
                  return true;
                }
              }
            }
          }
        } else {
          var7 = null;
          tm.a(58, 112, true, (dg) null);
          if (!((tm) this).field_o.equals((Object) (Object) param2)) {
            return false;
          } else {
            if (param0.length != ((tm) this).field_p.length) {
              return false;
            } else {
              var4 = 0;
              L3: while (true) {
                if (((tm) this).field_p.length > var4) {
                  if (param0[var4].field_b) {
                    L4: {
                      var8 = rm.a(param0[var4].field_d, (byte) 127);
                      if (var8 != Boolean.TYPE) {
                        break L4;
                      } else {
                        if (((tm) this).field_p[var4] != Boolean.TYPE) {
                          return false;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (Character.TYPE != var8) {
                        break L5;
                      } else {
                        if (((tm) this).field_p[var4] == Character.TYPE) {
                          break L5;
                        } else {
                          return false;
                        }
                      }
                    }
                    if (fp.a(89, var8)) {
                      if (fp.a(98, ((tm) this).field_p[var4])) {
                        var4++;
                        continue L3;
                      } else {
                        return false;
                      }
                    } else {
                      var4++;
                      continue L3;
                    }
                  } else {
                    if (((tm) this).field_p[var4].isInstance(param0[var4].field_d)) {
                      var4++;
                      var4++;
                      continue L3;
                    } else {
                      return false;
                    }
                  }
                } else {
                  return true;
                }
              }
            }
          }
        }
    }

    final static boolean b(int param0) {
        si var1 = null;
        int var2 = 0;
        int var3 = 0;
        si var4 = null;
        var3 = Kickabout.field_G;
        if (param0 == -16000) {
          var4 = (si) (Object) nv.field_N.g(param0 ^ -25527);
          var1 = var4;
          if (var1 == null) {
            return false;
          } else {
            var2 = 0;
            L0: while (true) {
              if (var1.field_n > var2) {
                L1: {
                  if (null != var4.field_f[var2]) {
                    if (-1 != (var4.field_f[var2].field_a ^ -1)) {
                      break L1;
                    } else {
                      return false;
                    }
                  } else {
                    break L1;
                  }
                }
                if (null != var4.field_e[var2]) {
                  if (0 == var4.field_e[var2].field_a) {
                    return false;
                  } else {
                    var2++;
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  var2++;
                  var2++;
                  continue L0;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return true;
        }
    }

    public final String toString() {
        return ((tm) this).field_s;
    }

    abstract li a(byte param0, li[] param1);

    final static void a(int param0, int param1, boolean param2, dg param3) {
        mt.field_a = param1;
        if (param2) {
            return;
        }
        ba.field_p = param3;
        dq.field_f = param0;
    }

    tm(String param0, Class[] param1, String param2) {
        int var5 = 0;
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        ((tm) this).field_o = param0;
        ((tm) this).field_p = param1;
        var7 = new StringBuilder(((tm) this).field_o).append(40);
        var8 = var7;
        var5 = 0;
        L0: while (true) {
          if (((tm) this).field_p.length <= var5) {
            L1: {
              StringBuilder discarded$242 = var8.append(41);
              if (param2 == null) {
                break L1;
              } else {
                StringBuilder discarded$243 = var8.append("     <col=ffaaff>" + param2 + "</col>");
                break L1;
              }
            }
            ((tm) this).field_s = var8.toString();
          } else {
            StringBuilder discarded$244 = var7.append(dr.a(-120, ((tm) this).field_p[var5]));
            if (((tm) this).field_p.length + -1 <= var5) {
              var5++;
              var5++;
              continue L0;
            } else {
              StringBuilder discarded$245 = var8.append(", ");
              var5++;
              var5++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new ut(76, 92);
        field_t = 0;
        field_x = new int[3][4];
        field_x[0][0] = 7508762;
        field_x[0][1] = 7180825;
        field_x[0][2] = 8100378;
        field_x[0][3] = 8100371;
        field_x[1][0] = 13943953;
        field_x[1][3] = 15061120;
        field_x[1][2] = 13878165;
        field_x[1][1] = 13352330;
        field_x[2][0] = 5921627;
        field_x[2][1] = 4934732;
        field_x[2][2] = 2960685;
        field_x[2][3] = 6568505;
        field_r = "<%0> has joined your game.";
        field_v = new ut(270, 70);
        field_y = new int[3];
        field_q = new String[]{"<img=0>The highest league in Kickabout is known as the Diamond Division. The rules here are slightly different.", "<img=0>When you reach the Diamond Division, your league points vanish and are replaced with <col=ffff00>diamond league points</col>.", "<img=0>Players compete with each other in a weekly battle to get the highest score. There is no maximum value or target score to reach.", "<img=0>Diamond league points are reset every week at <col=ffff00>10am GMT on Tuesdays</col>. All players' scores are set back to 0.", "<img=0>The player(s) with the highest score at the end of each week receives the Diamond Trophy and the famous 'We Are The Champions' Achievement!"};
        field_y[2] = 22;
        field_y[1] = 17;
        field_y[0] = 15;
    }
}
