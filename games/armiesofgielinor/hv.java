/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hv extends fw {
    static int[] field_R;
    private at field_P;
    private String[] field_Q;
    static String field_O;
    private ct field_M;
    static rn field_N;

    final void a(int param0, int param1, int param2, boolean param3) {
        super.a(param0, param1, param2, param3);
        int var5 = -this.field_B + param1;
        int var6 = param2 + -this.field_p;
        ct var7 = this.a(var6, (byte) -61, var5);
        if (var7 != null) {
            if (!(null == this.field_x)) {
                ((nq) ((Object) this.field_x)).a(var7.field_n, param0, (byte) 112, (hv) (this));
            }
        }
    }

    final void a(int param0) {
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        pm var3;
        ju var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        int var11;
        ts var12;
        int var13;
        int var14;
        ct var15;
        int var16;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_P = new at();
        var2 = 0;
        var3 = (pm) ((Object) this.field_k);
        var4 = var3.a(-77, (kb) (this));
        if (param0 <= -115) {
          L0: while (true) {
            var5 = this.field_v.indexOf("<hotspot=", var2);
            if ((var5 ^ -1) != 0) {
              var7 = this.field_v.indexOf(">", var5);
              var6 = this.field_v.substring(var5 - -9, var7);
              var7 = Integer.parseInt(var6);
              var2 = this.field_v.indexOf("</hotspot>", var5);
              var8 = var4.a(0, var5);
              var9 = var4.a(0, var2);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var9 < var11) {
                  continue L0;
                } else {
                  L2: {
                    var12 = var4.field_b[var11];
                    if ((var8 ^ -1) != (var11 ^ -1)) {
                      stackIn_9_0 = var12.field_i[0];
                      break L2;
                    } else {
                      stackIn_9_0 = var4.a((byte) -66, var5);
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_9_0;
                    if (var11 != var9) {
                      if (var12 == null) {
                        stackIn_14_0 = 0;
                        break L3;
                      } else {
                        stackIn_14_0 = var12.field_i[-1 + var12.field_i.length];
                        break L3;
                      }
                    } else {
                      stackIn_14_0 = var4.a((byte) -66, var2);
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_14_0;
                    var15 = new ct(var7, var13, var12.field_n, -var13 + var14, Math.max(var3.a(true), var12.field_c - var12.field_n));
                    if (var10 != null) {
                      ((ct) (var10)).field_k = var15;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_P.a((byte) -119, (tc) (var15));
                  var10 = var15;
                  var11++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    boolean a(int param0, kb param1) {
        RuntimeException var3 = null;
        kb var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 11) {
                break L1;
              } else {
                var4 = (kb) null;
                this.a(-45, 118, 84, (kb) null);
                break L1;
              }
            }
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hv.M(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    private final ct a(int param0, byte param1, int param2) {
        ct var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        ct var4 = (ct) ((Object) this.field_P.e((byte) 107));
        while (var4 != null) {
            var5 = var4;
            while (var5 != null) {
                if ((param2 ^ -1) <= (var5.field_r ^ -1)) {
                    if (param0 >= var5.field_l && var5.field_r - -var5.field_p > param2) {
                        if (!(var5.field_q + var5.field_l < param0)) {
                            return var4;
                        }
                    }
                }
                var5 = var5.field_k;
            }
            var4 = (ct) ((Object) this.field_P.a((byte) 123));
        }
        if (param1 == -61) {
            return null;
        }
        kb var7 = (kb) null;
        this.a(-11, -2, 46, (kb) null);
        return null;
    }

    void a(int param0, int param1, int param2, kb param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
            super.a(param0, param1, param2, param3);
            this.field_M = null;
            if (this.field_t) {
                var5_int = -param1 + (sm.field_d - this.field_B);
                var6 = -param2 + ko.field_b + -this.field_p;
                this.field_M = this.a(var6, (byte) -61, var5_int);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "hv.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    hv(String param0, kh param1) {
        super(param0, (qo) null);
        this.field_M = null;
        try {
            this.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "hv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 8192) {
            field_R = (int[]) null;
        }
        super.a(param0, param1, param2, param3 ^ 0, param4);
        this.a(-128);
    }

    public static void b(boolean param0) {
        field_N = null;
        field_O = null;
        if (!param0) {
            field_N = (rn) null;
        }
        field_R = null;
    }

    String h(int param0) {
        if (this.field_M == null) {
            return null;
        }
        if (null == this.field_Q) {
            return null;
        }
        if (param0 != 21384) {
            return (String) null;
        }
        if (this.field_Q.length <= this.field_M.field_n) {
            return null;
        }
        return this.field_Q[this.field_M.field_n];
    }

    final void a(String param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String[] var8 = null;
        String[] var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == this.field_Q) {
                  break L2;
                } else {
                  if (this.field_Q.length <= param2) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var8 = new String[param2 - -1];
                var9 = var8;
                var4 = var9;
                if (null == this.field_Q) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= this.field_Q.length) {
                      break L3;
                    } else {
                      var8[var5] = this.field_Q[var5];
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              this.field_Q = var9;
              break L1;
            }
            L5: {
              if (!param1) {
                break L5;
              } else {
                var7 = (String) null;
                this.a((String) null, false, -3);
                break L5;
              }
            }
            this.field_Q[param2] = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("hv.CA(");

            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.a(param2, param0, param3, 8192, ((pm) ((Object) this.field_k)).a((kb) (this), -2));
        if (param1 != 9567) {
            this.field_P = (at) null;
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, (byte) -124, param3);
        if (param3 != 0) {
            return;
        }
        pm var10 = (pm) ((Object) this.field_k);
        if (param2 > -82) {
            kb var9 = (kb) null;
            this.a(-37, (kb) null);
        }
        ct var6 = this.field_M;
        if (var6 != null) {
            var7 = var10.a((kb) (this), param0, (byte) -123);
            var8 = var10.a(-18033, param1, (kb) (this));
            do {
                na.c(2 + var6.field_p, var7 - (-var6.field_r - -2), 116, 2 + var6.field_q, -2 + (var6.field_l + var8));
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    static {
        field_O = "This unit has no magical ability.";
        field_N = new rn();
    }
}
