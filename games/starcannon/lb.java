/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    short[] field_a;
    short field_s;
    short[] field_q;
    int[] field_n;
    short[] field_J;
    short field_R;
    int[] field_r;
    short[] field_x;
    static cg field_t;
    int[] field_j;
    int[] field_f;
    int[] field_i;
    static String field_l;
    int[] field_g;
    short[] field_N;
    short[] field_e;
    short[] field_b;
    short[] field_I;
    short[] field_c;
    byte[] field_u;
    int field_M;
    int field_p;
    int[] field_h;
    short[] field_z;
    private boolean field_H;
    static String[] field_d;
    int field_v;
    short[] field_K;
    int[] field_C;
    short[] field_o;
    int field_w;
    byte field_O;
    short[] field_m;
    static int field_B;
    short[] field_G;
    short[] field_y;
    short field_P;
    int field_F;
    short[] field_A;
    int[] field_E;
    short[] field_D;
    short[] field_Q;
    static String field_L;
    int field_k;

    final static String a(ue param0, String param1, String param2, byte param3) {
        if (param3 >= -102) {
            field_d = null;
        }
        if (!(param0.b((byte) 96))) {
            return param2;
        }
        return param1 + " - " + param0.a((byte) 120) + "%";
    }

    final static int a(int param0, String[] param1, String param2, qe param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        L0: {
          var5 = param3.a(param2);
          if (param0 < var5) {
            break L0;
          } else {
            if ((param2.indexOf("<br>") ^ -1) != 0) {
              break L0;
            } else {
              param1[0] = (String) (Object) param1;
              return 1;
            }
          }
        }
        L1: {
          var6 = (param0 + (var5 + -1)) / param0;
          param0 = var5 / var6;
          var6 = 0;
          var7 = 0;
          if (param4 <= -58) {
            break L1;
          } else {
            field_l = null;
            break L1;
          }
        }
        var8 = param2.length();
        var9 = 0;
        L2: while (true) {
          if (var9 >= var8) {
            L3: {
              if (var7 < var8) {
                var6++;
                param1[var6] = param2.substring(var7, var8).trim();
                break L3;
              } else {
                break L3;
              }
            }
            return var6;
          } else {
            L4: {
              L5: {
                var10 = param2.charAt(var9);
                if (var10 == 32) {
                  break L5;
                } else {
                  if (45 == var10) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              var11 = param2.substring(var7, var9 - -1).trim();
              var12 = param3.a(var11);
              if (var12 < param0) {
                break L4;
              } else {
                var7 = 1 + var9;
                var6++;
                param1[var6] = var11;
                break L4;
              }
            }
            if (62 == var10) {
              if (param2.regionMatches(var9 - 3, "<br>", 0, 4)) {
                var6++;
                param1[var6] = param2.substring(var7, -3 + var9).trim();
                var7 = 1 + var9;
                var9++;
                continue L2;
              } else {
                var9++;
                continue L2;
              }
            } else {
              var9++;
              continue L2;
            }
          }
        }
    }

    final static void a(nh param0, qe param1, int param2, String param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = StarCannon.field_A;
        var5 = 0;
        var6 = -1;
        if (param2 == 3853) {
          var7 = 1;
          L0: while (true) {
            if (var7 >= param3.length()) {
              return;
            } else {
              L1: {
                var8 = param3.charAt(var7);
                if (var8 != 60) {
                  break L1;
                } else {
                  var6 = param0.field_d[0] + ((var5 >> 389513192) - -param1.a(param3.substring(0, var7)));
                  break L1;
                }
              }
              L2: {
                if (0 == (var6 ^ -1)) {
                  L3: {
                    if (var8 != 32) {
                      break L3;
                    } else {
                      var5 = var5 + param4;
                      break L3;
                    }
                  }
                  param0.field_d[var7] = param0.field_d[0] + (var5 >> -724427064) - (-param1.a(param3.substring(0, 1 + var7)) + param1.a((char) var8));
                  break L2;
                } else {
                  param0.field_d[var7] = var6;
                  break L2;
                }
              }
              if (62 == var8) {
                var6 = -1;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = StarCannon.field_A;
        if (((lb) this).field_H) {
          return;
        } else {
          ((lb) this).field_H = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (((lb) this).field_R <= var8) {
              L1: {
                ((lb) this).field_p = var2;
                ((lb) this).field_w = var6;
                ((lb) this).field_F = var3;
                ((lb) this).field_M = var5;
                if (param0 == -3) {
                  break L1;
                } else {
                  field_l = null;
                  break L1;
                }
              }
              ((lb) this).field_k = var4;
              ((lb) this).field_v = var7;
              return;
            } else {
              L2: {
                var9 = ((lb) this).field_J[var8];
                var10 = ((lb) this).field_x[var8];
                if (var6 >= var10) {
                  break L2;
                } else {
                  var6 = var10;
                  break L2;
                }
              }
              L3: {
                if (var9 > var5) {
                  var5 = var9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var11 = ((lb) this).field_q[var8];
                if (var3 > var10) {
                  var3 = var10;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var2 > var9) {
                  var2 = var9;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var7 < var11) {
                  var7 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var4 > var11) {
                var4 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    final static hd b(byte param0) {
        if (param0 != -127) {
            String discarded$0 = lb.a(-62);
        }
        if (null == d.field_l) {
            d.field_l = new hd(nb.field_b, 20, 0, 0, 0, 11579568, -1, 0, 0, nb.field_b.field_p, -1, 2147483647, true);
        }
        return d.field_l;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = StarCannon.field_A;
        for (var6 = 0; ((lb) this).field_R > var6; var6++) {
            ((lb) this).field_J[var6] = (short)(param2 * ((lb) this).field_J[var6] / param0);
            ((lb) this).field_x[var6] = (short)(param1 * ((lb) this).field_x[var6] / param0);
            ((lb) this).field_q[var6] = (short)(((lb) this).field_q[var6] * param3 / param0);
        }
        if (param4 != -72) {
            ((lb) this).a(-86, 117, (byte) 99, 54);
        }
        this.b(param4 + 153);
    }

    private final void b(int param0) {
        if (param0 <= 48) {
            this.b(83);
        }
        ((lb) this).field_H = false;
    }

    public static void a(byte param0) {
        if (param0 != -49) {
            Object var2 = null;
            lb.a((nh) null, (qe) null, -33, (String) null, -39);
        }
        field_d = null;
        field_l = null;
        field_L = null;
        field_t = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = StarCannon.field_A;
        if (param2 != -30) {
            ((lb) this).field_H = true;
        }
        for (var5 = 0; ((lb) this).field_R > var5; var5++) {
            ((lb) this).field_J[var5] = (short)(((lb) this).field_J[var5] + param0);
            ((lb) this).field_x[var5] = (short)(((lb) this).field_x[var5] + param3);
            ((lb) this).field_q[var5] = (short)(((lb) this).field_q[var5] + param1);
        }
        this.b(104);
    }

    final static String a(int param0) {
        if (!eg.field_h) {
            if (di.field_m >= le.field_a) {
                if (!(hf.field_l + le.field_a <= di.field_m)) {
                    return sc.field_c;
                }
            }
        }
        int var1 = 68 % ((-45 - param0) / 62);
        return null;
    }

    lb() {
        ((lb) this).field_O = (byte) 0;
        ((lb) this).field_H = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "MEDIUM";
        field_d = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
