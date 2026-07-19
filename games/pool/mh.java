/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh extends fe {
    private ko field_O;
    private String[] field_N;
    private qa field_P;

    void a(ei param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              super.a(param0, param1, param2, param3);
              this.field_P = null;
              if (this.field_s) {
                var5_int = -this.field_C + -param2 + wn.field_i;
                var6 = -this.field_D + (-param3 + gg.field_f);
                this.field_P = this.a(var6, var5_int, -31244);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("mh.S(");
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        if (param3) {
            return;
        }
        this.g((byte) 28);
    }

    boolean a(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -107 / ((param1 - -43) / 47);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("mh.M(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Pool.field_O;
        try {
          L0: {
            L1: {
              qh.f(param0, param1, 1 + param3, 10000536);
              qh.f(param0, param1 + param2, 1 + param3, 12105912);
              var5_int = 1;
              var6 = param2;
              if (qh.field_c <= var5_int + param1) {
                break L1;
              } else {
                var5_int = -param1 + qh.field_c;
                break L1;
              }
            }
            L2: {
              if (param1 + var6 <= qh.field_g) {
                break L2;
              } else {
                var6 = qh.field_g + -param1;
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var7 >= var6) {
                if (!param4) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var8 = 152 + 48 * var7 / param2;
                var9 = var8 << 75324456 | var8 << -1001154736 | var8;
                qh.field_d[qh.field_l * (var7 + param1) - -param0] = var9;
                qh.field_d[(param1 - -var7) * qh.field_l + param0 + param3] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var5), "mh.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        io var4 = null;
        op var5 = null;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        vj var13 = null;
        int var14 = 0;
        int var15 = 0;
        qa var16 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var2 = -46 / ((param0 - -35) / 50);
        this.field_O = new ko();
        var3 = 0;
        var4 = (io) ((Object) this.field_z);
        var5 = var4.b(0, (ei) (this));
        L0: while (true) {
          var6 = this.field_m.indexOf("<hotspot=", var3);
          if (-1 == var6) {
            return;
          } else {
            var8 = this.field_m.indexOf(">", var6);
            var7 = this.field_m.substring(var6 - -9, var8);
            var8 = Integer.parseInt(var7);
            var3 = this.field_m.indexOf("</hotspot>", var6);
            var9 = var5.a(var6, 0);
            var10 = var5.a(var3, 0);
            var11 = null;
            var12 = var9;
            L1: while (true) {
              if (var12 > var10) {
                continue L0;
              } else {
                L2: {
                  var13 = var5.field_b[var12];
                  if (var9 != var12) {
                    stackOut_6_0 = var13.field_h[0];
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = var5.a(var6, (byte) -73);
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var14 = stackIn_7_0;
                  if (var10 != var12) {
                    if (var13 != null) {
                      stackOut_11_0 = var13.field_h[-1 + var13.field_h.length];
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  } else {
                    stackOut_8_0 = var5.a(var3, (byte) -104);
                    stackIn_12_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var15 = stackIn_12_0;
                  var16 = new qa(var8, var14, var13.field_e, var15 - var14, Math.max(var4.a(-10492), var13.field_i - var13.field_e));
                  if (var11 != null) {
                    ((qa) (var11)).field_l = var16;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                this.field_O.b((byte) 82, var16);
                var11 = var16;
                var12++;
                continue L1;
              }
            }
          }
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        super.a(param0, (byte) 50, param2, param3);
        int var5 = -21 % ((param1 - -42) / 53);
        if (!(param0 == 0)) {
            return;
        }
        io var6 = (io) ((Object) this.field_z);
        qa var7 = this.field_P;
        if (var7 == null) {
        } else {
            var8 = var6.a(5286, (ei) (this), param2);
            var9 = var6.a(param3, (ei) (this), (byte) -7);
            do {
                bj.a(var9 - -var7.field_p - 2, var7.field_q - -2, 2 + var7.field_w, var7.field_n + (var8 - 2), 2187);
                var7 = var7.field_l;
            } while (var7 != null);
        }
    }

    String e(int param0) {
        if (null == this.field_P) {
            return null;
        }
        if (this.field_N == null) {
            return null;
        }
        if (this.field_N.length <= this.field_P.field_s) {
            return null;
        }
        if (param0 > -10) {
            return (String) null;
        }
        return this.field_N[this.field_P.field_s];
    }

    private final qa a(int param0, int param1, int param2) {
        qa var5 = null;
        int var6 = Pool.field_O;
        qa var4 = (qa) ((Object) this.field_O.c((byte) -21));
        while (var4 != null) {
            var5 = var4;
            while (var5 != null) {
                if (param1 >= var5.field_n) {
                    if (param0 >= var5.field_p) {
                        if (param1 < var5.field_n + var5.field_w) {
                            if (!(param0 > var5.field_q + var5.field_p)) {
                                return var4;
                            }
                        }
                    }
                }
                var5 = var5.field_l;
            }
            var4 = (qa) ((Object) this.field_O.f((byte) -5));
        }
        if (param2 == -31244) {
            return null;
        }
        return (qa) null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param1 + -this.field_C;
        int var6 = -this.field_D + param2;
        qa var7 = this.a(var6, var5, param0 + -31260);
        if (var7 != null) {
            if (null != this.field_t) {
                ((jb) ((Object) this.field_t)).a(param3, (mh) (this), param0 + -12163, var7.field_s);
            }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = -72 / ((param3 - -62) / 41);
        this.a(param2, param0, ((io) ((Object) this.field_z)).a(1, (ei) (this)), false, param1);
    }

    mh(String param0, fp param1) {
        super(param0, (cc) null);
        this.field_P = null;
        try {
            this.field_z = param1;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
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
        var7 = Pool.field_O;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = -75 % ((param0 - -66) / 49);
                if (null == this.field_N) {
                  break L2;
                } else {
                  if (this.field_N.length > param2) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var5 = new String[1 + param2];
                if (this.field_N != null) {
                  var6 = 0;
                  L4: while (true) {
                    if (var6 >= this.field_N.length) {
                      break L3;
                    } else {
                      var5[var6] = this.field_N[var6];
                      var6++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              this.field_N = var5;
              break L1;
            }
            this.field_N[param2] = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (runtimeException);
            stackOut_12_1 = new StringBuilder().append("mh.P(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    static {
    }
}
