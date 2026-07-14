/*
 * Decompiled by CFR-JS 0.4.0.
 */
class se extends fb {
    static int field_V;
    static String field_U;
    private String[] field_Q;
    static java.math.BigInteger field_M;
    static dd[] field_N;
    static String field_W;
    static boolean field_X;
    static String field_Z;
    static int[] field_ab;
    private re field_R;
    static nb field_S;
    static byte[][][] field_Y;
    private jc field_O;

    void a(int param0, int param1, mf param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param1 >= -6) {
            Object var7 = null;
            se.a(39, (int[]) null, -35, (byte) 95, 6, 9, 86);
        }
        super.a(param0, -8, param2, param3);
        ((se) this).field_R = null;
        if (((se) this).field_w) {
            var5 = hn.field_k + -param0 + -((se) this).field_u;
            var6 = -((se) this).field_r + (rf.field_b - param3);
            ((se) this).field_R = this.a((byte) 126, var6, var5);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, (int) (char)param1, param2, param3, param4);
        ((se) this).f((byte) 49);
    }

    final static void a(int param0, rk[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, rk param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        if (-1 < (param7 ^ -1)) {
          return;
        } else {
          L0: {
            var10 = param7 / param5;
            var11 = var10 / 60;
            param7 = param7 % 60;
            if (0 == (4 & param8)) {
              break L0;
            } else {
              var10 = var10 % 60;
              break L0;
            }
          }
          L1: {
            var12 = param7 / 10;
            var13 = param7 % 10;
            var14 = var10 / 10;
            var15 = var10 % 10;
            var16 = var11 / 10;
            var17 = var11 % 10;
            if ((4 & param8) == 0) {
              break L1;
            } else {
              L2: {
                param1[var16].a(param2, param3, param6, param0);
                param2 = param2 + (param4 + param1[var16].field_j);
                param1[var17].a(param2, param3, param6, param0);
                param2 = param2 + (param4 + param1[var17].field_j);
                if (-1 == (param8 & 64 ^ -1)) {
                  param9.a(param2, param3, param6, param0);
                  break L2;
                } else {
                  if ((param7 & 1) != 0) {
                    break L2;
                  } else {
                    param9.a(param2, param3, param6, param0);
                    break L2;
                  }
                }
              }
              param2 = param2 + (param9.field_j + param4);
              break L1;
            }
          }
          L3: {
            if ((2 & param8) != 0) {
              L4: {
                L5: {
                  param1[var14].a(param2, param3, param6, param0);
                  param2 = param2 + (param4 + param1[var14].field_j);
                  param1[var15].a(param2, param3, param6, param0);
                  param2 = param2 + (param1[var15].field_j - -param4);
                  if ((32 & param8) == 0) {
                    break L5;
                  } else {
                    if ((1 & param7) == 0) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                param9.a(param2, param3, param6, param0);
                break L4;
              }
              param2 = param2 + (param9.field_j - -param4);
              break L3;
            } else {
              break L3;
            }
          }
          L6: {
            if (0 == (1 & param8)) {
              break L6;
            } else {
              param1[var12].a(param2, param3, param6, param0);
              param2 = param2 + (param4 + param1[var12].field_j);
              param1[var13].a(param2, param3, param6, param0);
              param2 = param2 + (param1[var13].field_j + param4);
              break L6;
            }
          }
          return;
        }
    }

    public static void e(byte param0) {
        field_Y = null;
        field_Z = null;
        field_W = null;
        field_M = null;
        if (param0 != 67) {
            field_X = true;
        }
        field_ab = null;
        field_S = null;
        field_U = null;
        field_N = null;
    }

    final void f(byte param0) {
        int var2 = 0;
        mg var3 = null;
        ub var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        re var10 = null;
        int var11 = 0;
        fj var12 = null;
        int var13 = 0;
        int var14 = 0;
        re var15 = null;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var16 = Chess.field_G;
        ((se) this).field_O = new jc();
        var2 = 0;
        if (param0 >= 27) {
          var3 = (mg) (Object) ((se) this).field_n;
          var4 = var3.a((mf) this, -23159);
          L0: while (true) {
            var5 = ((se) this).field_v.indexOf("<hotspot=", var2);
            if (var5 == -1) {
              return;
            } else {
              var7 = ((se) this).field_v.indexOf(">", var5);
              var6 = ((se) this).field_v.substring(var5 - -9, var7);
              var7 = Integer.parseInt(var6);
              var2 = ((se) this).field_v.indexOf("</hotspot>", var5);
              var8 = var4.a((byte) -104, var5);
              var9 = var4.a((byte) -29, var2);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var9 < var11) {
                  continue L0;
                } else {
                  L2: {
                    var12 = var4.field_a[var11];
                    if (var8 == var11) {
                      stackOut_8_0 = var4.a(-5940, var5);
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = var12.field_i[0];
                      stackIn_9_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_9_0;
                    if (var9 == var11) {
                      stackOut_13_0 = var4.a(-5940, var2);
                      stackIn_14_0 = stackOut_13_0;
                      break L3;
                    } else {
                      if (var12 != null) {
                        stackOut_12_0 = var12.field_i[var12.field_i.length - 1];
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_14_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var14 = stackIn_14_0;
                    var15 = new re(var7, var13, var12.field_d, var14 - var13, Math.max(var3.a((byte) 118), var12.field_e + -var12.field_d));
                    if (var10 != null) {
                      var10.field_q = var15;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((se) this).field_O.a((o) (Object) var15, (byte) -124);
                  var10 = var15;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, String param2) {
        int var5 = 0;
        int var6 = Chess.field_G;
        if (null != ((se) this).field_Q) {
            // if_icmplt L85
        }
        String[] var7 = new String[1 + param1];
        String[] var4 = var7;
        if (null != ((se) this).field_Q) {
            for (var5 = 0; var5 < ((se) this).field_Q.length; var5++) {
                var7[var5] = ((se) this).field_Q[var5];
            }
        }
        ((se) this).field_Q = var4;
        ((se) this).field_Q[param1] = param2;
        if (param0 != -23750) {
            field_U = null;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, -97, param3);
        if (param1 != 0) {
            return;
        }
        mg var9 = (mg) (Object) ((se) this).field_n;
        re var6 = ((se) this).field_R;
        if (var6 == null) {
        } else {
            var7 = var9.a((mf) this, param3, -1581179903);
            var8 = var9.a(0, param0, (mf) this);
            do {
                rc.a(var6.field_k + 2, false, -2 + (var7 - -var6.field_o), 2 + var6.field_l, var6.field_s + var8 + -2);
                var6 = var6.field_q;
            } while (var6 != null);
        }
        if (param2 > -80) {
            ((se) this).a(-120, true, 63, 80);
        }
    }

    final static void a(int param0, int[] param1, int param2, byte param3, int param4, int param5, int param6) {
        int var17 = 0;
        int var8 = 0;
        int var7 = 0;
        int var18 = Chess.field_G;
        double var9 = 3.141592653589793 + Math.atan2((double)(-param0 + param6), (double)(-param5 + param4));
        double var11 = hg.a((byte) 26, (double)(-param5 + param4), (double)(param6 - param0)) / (double)param2;
        double var13 = var11 * qn.a(-17513, var9);
        if (param3 <= 26) {
            field_M = null;
        }
        double var15 = var11 * mn.a(var9, 2278);
        for (var17 = 0; var17 < param1.length; var17 += 2) {
            var8 = param1[var17 + 1];
            var7 = param1[var17];
            param1[var17] = (int)(var15 * (double)var8 + var13 * (double)var7);
            param1[1 + var17] = (int)(var13 * (double)var8 + var15 * (double)(-var7));
        }
        for (var17 = 0; var17 < param1.length; var17 += 2) {
            param1[var17] = param1[var17] + param6;
            param1[var17 + 1] = param1[var17 + 1] + param4;
        }
    }

    String g(int param0) {
        if (param0 != 0) {
            return null;
        }
        if (null == ((se) this).field_R) {
            return null;
        }
        if (((se) this).field_Q == null) {
            return null;
        }
        if (((se) this).field_R.field_t >= ((se) this).field_Q.length) {
            return null;
        }
        return ((se) this).field_Q[((se) this).field_R.field_t];
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param1) {
            return;
        }
        super.a(param0, param1, param2, param3);
        int var5 = param3 - ((se) this).field_u;
        int var6 = param0 + -((se) this).field_r;
        re var7 = this.a((byte) 102, var6, var5);
        if (var7 != null) {
            if (null != ((se) this).field_p) {
                ((nn) (Object) ((se) this).field_p).a(var7.field_t, (byte) -108, (se) this, param2);
            }
        }
    }

    se(String param0, jm param1) {
        super(param0, (rg) null);
        ((se) this).field_R = null;
        ((se) this).field_n = param1;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param2 != 1) {
            se.e((byte) 29);
        }
        ((se) this).a(param1, 34, ((mg) (Object) ((se) this).field_n).a(true, (mf) this), param3, param0);
    }

    boolean a(int param0, mf param1) {
        if (param0 != 0) {
            Object var4 = null;
            ((se) this).a(-27, 56, (mf) null, 111);
        }
        return false;
    }

    private final re a(byte param0, int param1, int param2) {
        re var4 = null;
        re var5 = null;
        int var6 = 0;
        L0: {
          var6 = Chess.field_G;
          if (param0 >= 83) {
            break L0;
          } else {
            ((se) this).f((byte) -35);
            break L0;
          }
        }
        var4 = (re) (Object) ((se) this).field_O.g(-18110);
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (re) (Object) ((se) this).field_O.a((byte) -92);
                continue L1;
              } else {
                L3: {
                  if (param2 < var5.field_o) {
                    break L3;
                  } else {
                    if (param1 < var5.field_s) {
                      break L3;
                    } else {
                      if (var5.field_l + var5.field_o <= param2) {
                        break L3;
                      } else {
                        if (var5.field_k + var5.field_s < param1) {
                          break L3;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_q;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = "Knight";
        field_U = "Inviting <%0>";
        field_N = new dd[7];
        field_ab = new int[]{2, 1, 2, 5, 5, 1, 2, 2, 3, 5, 1};
        field_W = "Report abuse";
        field_M = new java.math.BigInteger("65537");
    }
}
