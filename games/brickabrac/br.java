/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class br extends mh {
    private int field_Vb;
    private int field_dc;
    private jp[] field_Tb;
    private int field_Yb;
    private int field_Sb;
    private int field_Zb;
    static int[][] field_bc;
    private int field_Qb;
    private rk[] field_Xb;
    static String field_ac;
    private int field_Wb;
    private int[] field_cc;
    static String field_Ub;
    static String field_Rb;
    private mh field_ec;
    private mh field_Pb;

    final static void a(int param0, byte param1, int param2) {
        om var6 = null;
        om var7 = null;
        pi var4 = null;
        if (re.field_i != param2) {
            var6 = (om) ((Object) pn.field_i.a((long)re.field_i, -1));
            var7 = var6;
            if (!(var7 == null)) {
                var7.field_Qb = null;
            }
            re.field_i = param2;
            var4 = k.field_h;
            var4.e(-13413, param0);
            var4.a(-29, 3);
            var4.a(-127, 11);
            var4.b((byte) 121, param2);
        }
        int var3 = 20 / ((55 - param1) / 62);
    }

    final void a(String param0, int param1, byte param2) {
        try {
            this.field_Xb[this.field_Wb] = new rk(0L, (mh) null, (mh) null, this.field_ec, (jp) null, param0);
            this.field_Xb[this.field_Wb].field_Gb = this.field_Tb;
            this.field_Xb[this.field_Wb].field_Lb = true;
            this.field_Xb[this.field_Wb].field_Q = 1;
            this.a(this.field_Xb[this.field_Wb], 0);
            if (param2 < 70) {
                this.field_Xb = (rk[]) null;
            }
            this.field_cc[this.field_Wb] = param1;
            this.field_Wb = this.field_Wb + 1;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "br.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(byte param0, boolean param1) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        this.a(param1, -15211);
        if (!param1) {
            return -2;
        }
        int var3 = -36 / ((param0 - 13) / 63);
        for (var4 = 0; this.field_Wb > var4; var4++) {
            if (this.field_Xb[var4].field_L != 0) {
                return this.field_cc[var4];
            }
        }
        if (!(ki.field_e == 0)) {
            return -1;
        }
        return this.field_dc;
    }

    final void a(String param0, int param1, int param2, jp param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              this.field_Xb[this.field_Wb] = new rk(0L, (mh) null, (mh) null, this.field_ec, param3, param0);
              this.field_Xb[this.field_Wb].field_Gb = this.field_Tb;
              this.field_Xb[this.field_Wb].field_Lb = true;
              this.field_Xb[this.field_Wb].field_Q = 1;
              this.a(this.field_Xb[this.field_Wb], 0);
              this.field_cc[this.field_Wb] = param2;
              this.field_Wb = this.field_Wb + 1;
              if (param1 >= 62) {
                break L1;
              } else {
                this.field_Vb = -95;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("br.H(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    br(br param0) {
        this(param0, param0.field_Tb, param0.field_Pb, param0.field_ec, param0.field_Vb, param0.field_Qb, param0.field_Yb, param0.field_Sb, param0.field_Zb);
    }

    public static void h(int param0) {
        field_Ub = null;
        if (param0 < 20) {
            return;
        }
        field_bc = (int[][]) null;
        field_Rb = null;
        field_ac = null;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int var4 = 33 % ((param3 - 75) / 45);
        if (lb.field_d >= param1 - -param2 - -param0) {
            return param1 - -param2;
        }
        if (!(0 > param1 - param0)) {
            return param1 - param0;
        }
        return lb.field_d + -param0;
    }

    br(mh param0, jp[] param1, mh param2, mh param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Xb = new rk[256];
        this.field_dc = -2;
        this.field_cc = new int[256];
        try {
            this.field_Pb = param2;
            this.field_Qb = param5;
            this.field_Zb = param8;
            this.field_Sb = param7;
            this.field_ec = param3;
            this.field_Tb = param1;
            this.field_Yb = param6;
            this.field_Vb = param4;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "br.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean i(int param0) {
        int var2 = 0;
        if (!(-2 == this.field_dc)) {
            return false;
        }
        if (dc.field_b == 13) {
            this.field_dc = -1;
            var2 = -81 % ((-25 - param0) / 41);
            return true;
        }
        var2 = -81 % ((-25 - param0) / 41);
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (this.field_Wb != 0) {
          var6 = 0;
          if (param1 < -49) {
            var7 = 0;
            L0: while (true) {
              if (this.field_Wb <= var7) {
                var6 = var6 + this.field_Vb * 2;
                var7 = this.field_Zb * this.field_Wb + this.field_Sb - -this.field_Sb;
                var8 = fp.a(-1, var6, param4, param3);
                var9 = br.a(var7, param0, param2, 122);
                this.a(var7, var9, var8, var6, (byte) 64);
                var10 = 0;
                L1: while (true) {
                  if (var10 >= this.field_Wb) {
                    return;
                  } else {
                    this.field_Xb[var10].a(-10411, this.field_Zb * var10 + this.field_Sb, this.field_Qb, this.field_Yb, this.field_Vb, this.field_Zb, var6 - 2 * this.field_Vb);
                    var10++;
                    continue L1;
                  }
                }
              } else {
                var8 = this.field_Xb[var7].a(this.field_Yb, 24, this.field_Qb);
                if (var6 < var8) {
                  var6 = var8;
                  var7++;
                  continue L0;
                } else {
                  var7++;
                  continue L0;
                }
              }
            }
          } else {
            this.field_Zb = -94;
            var7 = 0;
            L2: while (true) {
              if (this.field_Wb <= var7) {
                var6 = var6 + this.field_Vb * 2;
                var7 = this.field_Zb * this.field_Wb + this.field_Sb - -this.field_Sb;
                var8 = fp.a(-1, var6, param4, param3);
                var9 = br.a(var7, param0, param2, 122);
                this.a(var7, var9, var8, var6, (byte) 64);
                var10 = 0;
                L3: while (true) {
                  if (var10 >= this.field_Wb) {
                    return;
                  } else {
                    this.field_Xb[var10].a(-10411, this.field_Zb * var10 + this.field_Sb, this.field_Qb, this.field_Yb, this.field_Vb, this.field_Zb, var6 - 2 * this.field_Vb);
                    var10++;
                    continue L3;
                  }
                }
              } else {
                var8 = this.field_Xb[var7].a(this.field_Yb, 24, this.field_Qb);
                if (var6 < var8) {
                  var6 = var8;
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          }
        } else {
          this.field_Xb[this.field_Wb] = new rk(0L, (mh) null, (mh) null, this.field_Pb, (jp) null, gg.field_m);
          this.field_Xb[this.field_Wb].field_Q = 1;
          this.a(this.field_Xb[this.field_Wb], 0);
          this.field_cc[this.field_Wb] = -1;
          this.field_Wb = this.field_Wb + 1;
          var6 = 0;
          if (param1 >= -49) {
            this.field_Zb = -94;
            var7 = 0;
            L4: while (true) {
              if (this.field_Wb <= var7) {
                var6 = var6 + this.field_Vb * 2;
                var7 = this.field_Zb * this.field_Wb + this.field_Sb - -this.field_Sb;
                var8 = fp.a(-1, var6, param4, param3);
                var9 = br.a(var7, param0, param2, 122);
                this.a(var7, var9, var8, var6, (byte) 64);
                var10 = 0;
                L5: while (true) {
                  if (var10 >= this.field_Wb) {
                    return;
                  } else {
                    this.field_Xb[var10].a(-10411, this.field_Zb * var10 + this.field_Sb, this.field_Qb, this.field_Yb, this.field_Vb, this.field_Zb, var6 - 2 * this.field_Vb);
                    var10++;
                    continue L5;
                  }
                }
              } else {
                var8 = this.field_Xb[var7].a(this.field_Yb, 24, this.field_Qb);
                if (var6 < var8) {
                  var6 = var8;
                  var7++;
                  continue L4;
                } else {
                  var7++;
                  continue L4;
                }
              }
            }
          } else {
            var7 = 0;
            L6: while (true) {
              if (this.field_Wb <= var7) {
                var6 = var6 + this.field_Vb * 2;
                var7 = this.field_Zb * this.field_Wb + this.field_Sb - -this.field_Sb;
                var8 = fp.a(-1, var6, param4, param3);
                var9 = br.a(var7, param0, param2, 122);
                this.a(var7, var9, var8, var6, (byte) 64);
                var10 = 0;
                L7: while (true) {
                  if (var10 >= this.field_Wb) {
                    return;
                  } else {
                    this.field_Xb[var10].a(-10411, this.field_Zb * var10 + this.field_Sb, this.field_Qb, this.field_Yb, this.field_Vb, this.field_Zb, var6 - 2 * this.field_Vb);
                    var10++;
                    continue L7;
                  }
                }
              } else {
                var8 = this.field_Xb[var7].a(this.field_Yb, 24, this.field_Qb);
                if (var6 < var8) {
                  var6 = var8;
                  var7++;
                  continue L6;
                } else {
                  var7++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    static {
        field_ac = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_Ub = "To report a player, right-click on their name and select the option to report abuse.";
        field_Rb = "Breaking real-world laws";
    }
}
