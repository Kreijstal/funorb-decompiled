/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends vh {
    private int field_cc;
    private int[] field_Nb;
    private int field_Xb;
    private char[] field_Tb;
    static String[] field_Sb;
    private qp[] field_dc;
    private uo[] field_Vb;
    private int field_Lb;
    static dd field_Rb;
    static String field_bc;
    private int field_Wb;
    static String[] field_fc;
    private int field_Mb;
    static int[] field_Yb;
    static int[][] field_gc;
    private int field_Ub;
    static di field_Zb;
    private int field_ac;
    private qp field_Qb;
    private int field_Pb;
    static String field_Ob;
    static lr field_ec;

    final void a(byte param0, int param1, int param2) {
        int var4_int;
        uo var5;
        uo stackIn_6_0 = null;
        uo stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        qp var4;
        qp var6;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= this.field_Vb.length) {
            L1: {
              if (param0 == 86) {
                break L1;
              } else {
                this.a(77, 52, -4);
                break L1;
              }
            }
            L2: {
              if (0 == (this.field_ac ^ -1)) {
                break L2;
              } else {
                var6 = this.field_dc[this.field_ac];
                var4 = var6;
                if (var4 != null) {
                  var6.a((byte) 86, param1, param2);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if ((this.field_Pb ^ -1) < -1) {
                this.b(-105, -1 + this.field_Pb);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            var5 = this.field_Vb[var4_int];
            if ((var5.field_R ^ -1) == -2) {
              L4: {
                this.a(var4_int, false, param2, param1);
                stackIn_6_0 = (uo) (var5);

                if (var4_int != this.field_ac) {
                  stackIn_7_0 = (uo) ((Object) stackIn_6_0);
                  stackIn_7_1 = 0;
                  break L4;
                } else {
                  stackIn_7_0 = (uo) ((Object) stackIn_6_0);
                  stackIn_7_1 = 1;
                  break L4;
                }
              }
              stackIn_7_0.field_Ib = stackIn_7_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final void f(int param0) {
        int var3 = 0;
        uo var4 = null;
        if (param0 != 17517) {
            this.a(45, 22, -51);
        }
        uo[] var5 = this.field_Vb;
        uo[] var2 = var5;
        for (var3 = 0; var5.length > var3; var3++) {
            var4 = var5[var3];
            var4.field_R = 0;
            var4.field_Ib = false;
        }
        if (null != this.field_Qb) {
            this.field_Qb.f(17517);
            this.field_Qb.a((byte) -117);
        }
        this.field_Qb = null;
        this.field_ac = -1;
        this.b(-100, 12);
    }

    final int g(int param0) {
        if (param0 != -1) {
            this.field_cc = 11;
        }
        return this.field_Wb + (null != this.field_Qb ? this.field_Qb.g(-1) : 0);
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        if (0 > param2) {
          return false;
        } else {
          if ((param2 ^ -1) >= -12) {
            L0: {
              if ((param3 ^ -1) > -2) {
                break L0;
              } else {
                if (hq.a(param2, param1, 1) < param3) {
                  break L0;
                } else {
                  L1: {
                    if (param0 > 103) {
                      break L1;
                    } else {
                      field_bc = (String) null;
                      break L1;
                    }
                  }
                  return true;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var6 = 0;
        int var4 = qi.field_a == 85 ? 1 : 0;
        if (this.field_Qb != null) {
            if (var4 != 0) {
                if (!(0 != (this.field_Qb.field_ac ^ -1))) {
                    this.f(17517);
                    this.b(-84, 0);
                    return true;
                }
            }
            return this.field_Qb.a(param0, param1, param2 + 0);
        }
        if (this.field_Qb == null && im.field_Ub == this && var4 != 0) {
            lq.i(15975);
            return true;
        }
        int var5 = ml.field_b;
        if (var5 > 0) {
            if (var5 == we.field_d) {
                var5 = 63;
            }
            for (var6 = 0; var6 < this.field_Tb.length; var6++) {
                if (!(var5 != this.field_Tb[var6])) {
                    this.a(var6, false, param0, param1);
                    return true;
                }
            }
        }
        if (param2 != 85) {
            return false;
        }
        return false;
    }

    private final void b(int param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        int var3 = 0;
        this.field_Pb = param1;
        if (param0 >= -78) {
            return;
        }
        for (var5 = 0; this.field_cc > var5; var5++) {
            var4 = this.field_Pb * this.field_Pb;
            var3 = var5 * this.field_Ub;
            this.field_Vb[var5].field_eb = (var4 * (this.field_Mb - this.field_ib) + var3 * (-var4 + 144)) / 144;
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var7;
        int var8;
        L0: {
          this.field_Wb = param1 * 2 + this.field_Xb;
          this.b(param4 - this.field_Lb, 2147483647, param2, this.field_Wb, this.field_Lb);
          if (param5 == this.field_Mb) {
            break L0;
          } else {
            this.field_Mb = param5;
            this.b(-95, this.field_Pb);
            break L0;
          }
        }
        L1: {
          var7 = 0;
          if (param3 >= 125) {
            break L1;
          } else {
            this.a((byte) -95, -61, 32);
            break L1;
          }
        }
        L2: while (true) {
          if (var7 >= this.field_cc) {
            L3: {
              if (this.field_ac == -1) {
                break L3;
              } else {
                if (null == this.field_dc[this.field_ac]) {
                  break L3;
                } else {
                  var7 = this.field_dc[this.field_ac].field_cc;
                  var8 = this.field_eb - -(this.field_Ub * (var7 + this.field_ac));
                  L4: while (true) {
                    if (var8 <= param4) {
                      this.field_dc[this.field_ac].a(param0, param1, this.field_Wb + param2, (byte) 126, var8, this.field_Vb[this.field_ac].field_ib);
                      break L3;
                    } else {
                      var8 = var8 - this.field_Ub;
                      continue L4;
                    }
                  }
                }
              }
            }
            return;
          } else {
            this.field_Vb[var7].a(0, true, param1, this.field_Ub, param0, this.field_Wb, this.field_Vb[var7].field_eb);
            var7++;
            continue L2;
          }
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        String var7;
        if (!param1) {
          L0: {
            if (this.field_ac != param0) {
              if (null != this.field_dc[param0]) {
                this.f(17517);
                this.b(-124, 0);
                this.field_ac = param0;
                this.field_Qb = this.field_dc[this.field_ac];
                gf.a(this.field_Qb, 0);
                this.field_Qb.b(-84, 12);
                break L0;
              } else {
                if (-1 != this.field_Nb[param0]) {
                  L1: {
                    var5 = this.field_Nb[param0] | 32768;
                    var6 = hn.field_b;
                    if (var6 != 0) {
                      break L1;
                    } else {
                      if (null == em.field_L) {
                        break L1;
                      } else {
                        var6 = 1;
                        break L1;
                      }
                    }
                  }
                  L2: {
                    if ((f.a(5, var6) ^ -1) == -3) {
                      om.a(1, var6, param2, (byte) -89);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var7 = (String) null;
                  ub.a((byte) 117, (String) null, param3, fm.field_I, hn.field_b, var5);
                  uq.a(var5, fm.field_I, hn.field_b, (byte) -76, c.field_d);
                  lq.i(15975);
                  cp.a(false);
                  break L0;
                } else {
                  mf.j(1);
                  lq.i(15975);
                  break L0;
                }
              }
            } else {
              this.f(17517);
              this.b(-102, 0);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void h(int param0) {
        field_Sb = null;
        field_Yb = null;
        field_bc = null;
        field_Ob = null;
        field_Zb = null;
        if (param0 >= -103) {
            qp.h(78);
        }
        field_Rb = null;
        field_gc = (int[][]) null;
        field_fc = null;
        field_ec = null;
    }

    final boolean i(int param0) {
        int var4 = 0;
        uo var5 = null;
        int var2 = 0;
        uo[] var3 = this.field_Vb;
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var2 = var2 | (-1 != (var5.field_R ^ -1) ? 1 : 0);
        }
        if (var2 == 0 && -1 != this.field_ac) {
            if (!(this.field_dc[this.field_ac] == null)) {
                var2 = this.field_dc[this.field_ac].i(-1) ? 1 : 0;
            }
        }
        if (param0 != -1) {
            this.field_ac = -79;
        }
        return var2 != 0;
    }

    qp(long param0, vh param1, vh param2, vh param3, qp[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        lr var17 = null;
        lr var18 = null;
        this.field_ac = -1;
        try {
          L0: {
            this.field_dc = param4;
            this.field_Tb = param7;
            this.field_Nb = param5;
            this.field_cc = this.field_Nb.length;
            var17 = param3.field_I;
            var18 = var17;
            this.field_Ub = var18.field_C + 2 - -var18.field_w;
            this.field_Xb = 0;
            this.field_Vb = new uo[this.field_cc];
            this.field_Lb = this.field_cc * this.field_Ub;
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (this.field_cc <= var13) {
                this.field_Xb = this.field_Xb + (ue.field_c.field_w - -10);
                this.b(-88, 12);
                break L0;
              } else {
                L2: {
                  if (this.field_Tb[var13] <= 0) {
                    break L2;
                  } else {
                    param6[var13] = var11 + qe.a(false, this.field_Tb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (this.field_dc[var13] != null) {
                      break L4;
                    } else {
                      if ((this.field_Nb[var13] ^ -1) != 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = ue.field_c;
                  break L3;
                }
                L5: {
                  this.field_Vb[var13] = new uo(0L, param2, (vh) null, param3, (dd) (var14), param6[var13]);
                  this.a(-126, this.field_Vb[var13]);
                  var15 = var17.b(param6[var13]);
                  if (var15 <= this.field_Xb) {
                    break L5;
                  } else {
                    this.field_Xb = var15;
                    break L5;
                  }
                }
                var13++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var10);

            stackIn_15_1 = new StringBuilder().append("qp.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param6 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L11;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param7 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L12;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L12;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), stackIn_34_2 + ')');
        }
    }

    static {
        field_bc = "You and <%0> want to draw.";
        field_fc = new String[]{"Uh-oh!", "Too bad!", "Whoops!"};
        field_Ob = "Username: ";
    }
}
