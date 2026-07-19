/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tn extends hc {
    private lb field_N;
    static boolean field_M;
    static ea[] field_K;
    static boolean field_J;
    private String[] field_L;
    private ta field_I;

    final static boolean a(int param0, int param1) {
        if (param1 != -3236) {
            field_K = (ea[]) null;
        }
        return param0 == (-param0 & param0) ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param1 + -this.field_u;
        int var6 = param2 + -this.field_t;
        lb var7 = this.b(var6, -2, var5);
        if (var7 != null) {
            if (this.field_y != null) {
                ((be) ((Object) this.field_y)).a((tn) (this), param3, 12278, var7.field_n);
            }
        }
    }

    public static void a(int param0) {
        if (param0 != -2) {
            field_M = false;
        }
        field_K = null;
    }

    String h(int param0) {
        if (this.field_N == null) {
            return null;
        }
        if (this.field_L == null) {
            return null;
        }
        if (param0 != -27867) {
            tn.a(-77);
        }
        if (this.field_N.field_n >= this.field_L.length) {
            return null;
        }
        return this.field_L[this.field_N.field_n];
    }

    final void a(int param0, int param1, String param2) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        fe var7 = null;
        String[] var8 = null;
        String[] var9 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              L2: {
                if (null == this.field_L) {
                  break L2;
                } else {
                  if (param1 >= this.field_L.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var8 = new String[1 + param1];
                var9 = var8;
                var4 = var9;
                if (null == this.field_L) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (this.field_L.length <= var5) {
                      break L3;
                    } else {
                      var8[var5] = this.field_L[var5];
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              this.field_L = var9;
              break L1;
            }
            L5: {
              this.field_L[param1] = param2;
              if (param0 < -9) {
                break L5;
              } else {
                var7 = (fe) null;
                this.a(-120, 41, (byte) -117, (fe) null);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4_ref);
            stackOut_12_1 = new StringBuilder().append("tn.E(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    private final lb b(int param0, int param1, int param2) {
        boolean discarded$2 = false;
        lb var4 = null;
        lb var5 = null;
        int var6 = 0;
        L0: {
          var6 = MinerDisturbance.field_ab;
          if (param1 == -2) {
            break L0;
          } else {
            discarded$2 = tn.a(53, 94);
            break L0;
          }
        }
        var4 = (lb) ((Object) this.field_I.b(82));
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (lb) ((Object) this.field_I.b((byte) 56));
                continue L1;
              } else {
                L3: {
                  if (param2 < var5.field_s) {
                    break L3;
                  } else {
                    if (param0 < var5.field_u) {
                      break L3;
                    } else {
                      if (var5.field_p + var5.field_s <= param2) {
                        break L3;
                      } else {
                        if (var5.field_u + var5.field_o < param0) {
                          break L3;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_v;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, byte param2, fe param3) {
        lb discarded$3 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              super.a(param0, param1, (byte) 105, param3);
              this.field_N = null;
              if (param2 >= 49) {
                break L1;
              } else {
                discarded$3 = this.b(38, 48, -19);
                break L1;
              }
            }
            L2: {
              if (this.field_x) {
                var5_int = -this.field_u + (-param1 + nk.field_w);
                var6 = -this.field_t + -param0 + gb.field_e;
                this.field_N = this.b(var6, -2, var5_int);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("tn.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        cf var5 = (cf) ((Object) this.field_A);
        lb var6 = this.field_N;
        if (var6 == null) {
        } else {
            var7 = var5.a(28793, (fe) (this), param1);
            var8 = var5.b(100, (fe) (this), param2);
            do {
                se.c(var6.field_s + var7 + -2, 2, -2 + var6.field_u + var8, var6.field_p - -2, 2 + var6.field_o);
                var6 = var6.field_v;
            } while (var6 != null);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        cf var3 = null;
        nf var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        mg var12 = null;
        int var13 = 0;
        int var14 = 0;
        lb var15 = null;
        int var16 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var16 = MinerDisturbance.field_ab;
        this.field_I = new ta();
        var2 = 0;
        var3 = (cf) ((Object) this.field_A);
        var4 = var3.c(0, (fe) (this));
        L0: while (true) {
          var5 = this.field_s.indexOf("<hotspot=", var2);
          if (var5 != -1) {
            var7 = this.field_s.indexOf(">", var5);
            var6 = this.field_s.substring(var5 - -9, var7);
            var7 = Integer.parseInt(var6);
            var2 = this.field_s.indexOf("</hotspot>", var5);
            var8 = var4.a((byte) 39, var5);
            var9 = var4.a((byte) 39, var2);
            var10 = null;
            var11 = var8;
            L1: while (true) {
              if (var11 > var9) {
                continue L0;
              } else {
                L2: {
                  var12 = var4.field_f[var11];
                  if (var11 == var8) {
                    stackOut_7_0 = var4.a(var5, (byte) -125);
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_6_0 = var12.field_d[0];
                    stackIn_8_0 = stackOut_6_0;
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_8_0;
                  if (var11 == var9) {
                    stackOut_12_0 = var4.a(var2, (byte) -125);
                    stackIn_13_0 = stackOut_12_0;
                    break L3;
                  } else {
                    if (var12 != null) {
                      stackOut_11_0 = var12.field_d[-1 + var12.field_d.length];
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = 0;
                      stackIn_13_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                }
                L4: {
                  var14 = stackIn_13_0;
                  var15 = new lb(var7, var13, var12.field_h, -var13 + var14, Math.max(var3.a(-89), var12.field_i - var12.field_h));
                  if (var10 == null) {
                    break L4;
                  } else {
                    ((lb) (var10)).field_v = var15;
                    break L4;
                  }
                }
                var10 = var15;
                this.field_I.a((byte) 51, var15);
                var11++;
                continue L1;
              }
            }
          } else {
            L5: {
              if (param0 <= -52) {
                break L5;
              } else {
                this.a((byte) 82);
                break L5;
              }
            }
            return;
          }
        }
    }

    tn(String param0, ad param1) {
        super(param0, (rm) null);
        this.field_N = null;
        try {
            this.field_A = param1;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "tn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.a(((cf) ((Object) this.field_A)).b(63, (fe) (this)), -73, param0, param1, param3);
        if (param2 != 32088) {
            this.field_L = (String[]) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        lb discarded$0 = null;
        super.a(param0, -97, param2, param3, param4);
        this.a((byte) -107);
        if (param1 > -33) {
            discarded$0 = this.b(6, -124, -71);
        }
    }

    final static void c(byte param0) {
        int var1 = -9 / ((param0 - 56) / 37);
        ng.a((byte) -99);
        if (!(ef.field_c == null)) {
            ci.a(ef.field_c, 0);
        }
        bf.c(109);
        ll.a(-118);
        bl.a(true);
        if (ob.l(-1)) {
            sn.field_c.d((byte) -75, 1);
            bk.a((byte) 83, 0);
        }
        si.a(-126);
    }

    boolean a(fe param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 >= 119) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_N = (lb) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("tn.UA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    static {
        field_J = false;
    }
}
