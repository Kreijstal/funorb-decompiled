/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vj extends eb {
    static rh field_K;
    static String field_L;
    static int field_P;
    private hh field_N;
    static boolean field_Q;
    private jj field_R;
    private String[] field_M;
    static String[] field_O;

    void a(gl param0, int param1, int param2, int param3) {
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
        int decompiledRegionSelector0 = 0;
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
            if (param3 >= 25) {
              L1: {
                super.a(param0, param1, param2, 104);
                this.field_N = null;
                if (this.field_s) {
                  var5_int = -this.field_w + -param2 + ef.field_j;
                  var6 = jb.field_b - param1 - this.field_u;
                  this.field_N = this.a(2, var5_int, var6);
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("vj.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final hh a(int param0, int param1, int param2) {
        hh var4 = null;
        hh var5 = null;
        int var6 = 0;
        L0: {
          var6 = Terraphoenix.field_V;
          var4 = (hh) ((Object) this.field_R.d(9272));
          if (param0 == 2) {
            break L0;
          } else {
            field_K = (rh) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (hh) ((Object) this.field_R.e((byte) -119));
                continue L1;
              } else {
                L3: {
                  if (var5.field_n > param1) {
                    break L3;
                  } else {
                    if (var5.field_o > param2) {
                      break L3;
                    } else {
                      if (var5.field_q + var5.field_n <= param1) {
                        break L3;
                      } else {
                        if (param2 > var5.field_o - -var5.field_h) {
                          break L3;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_j;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    final static void g(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Terraphoenix.field_V;
        try {
          L0: {
            var1_int = param0;
            L1: while (true) {
              if (21 <= var1_int) {
                break L0;
              } else {
                od.field_c[var1_int] = new re(var1_int);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "vj.G(" + param0 + ')');
        }
    }

    final void a(int param0, String param1, byte param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = 100 % ((param2 - 80) / 45);
                if (this.field_M == null) {
                  break L2;
                } else {
                  if (this.field_M.length > param0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var5 = new String[1 + param0];
                if (null == this.field_M) {
                  break L3;
                } else {
                  var6 = 0;
                  L4: while (true) {
                    if (var6 >= this.field_M.length) {
                      break L3;
                    } else {
                      var5[var6] = this.field_M[var6];
                      var6++;
                      continue L4;
                    }
                  }
                }
              }
              this.field_M = var5;
              break L1;
            }
            this.field_M[param0] = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("vj.L(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    boolean a(byte param0, gl param1) {
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
            L1: {
              if (param0 > 2) {
                break L1;
              } else {
                vj.a(103);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("vj.F(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static void a(int param0) {
        if (param0 != -24517) {
            field_L = (String) null;
        }
        jl.field_I.b(false);
        if (null == vi.field_n) {
            vi.field_n = new na(jl.field_I, m.field_e);
        }
        jl.field_I.a((gl) (vi.field_n), (byte) -1);
    }

    final void b(boolean param0) {
        int var2 = 0;
        w var3 = null;
        ld var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        em var12 = null;
        int var13 = 0;
        int var14 = 0;
        hh var15 = null;
        int var16 = 0;
        String var17 = null;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var16 = Terraphoenix.field_V;
          this.field_R = new jj();
          if (param0) {
            break L0;
          } else {
            var17 = (String) null;
            this.a(-95, (String) null, (byte) -110);
            break L0;
          }
        }
        var2 = 0;
        var3 = (w) ((Object) this.field_l);
        var4 = var3.a((gl) (this), -19302);
        L1: while (true) {
          var5 = this.field_o.indexOf("<hotspot=", var2);
          if ((var5 ^ -1) != 0) {
            var7 = this.field_o.indexOf(">", var5);
            var6 = this.field_o.substring(var5 - -9, var7);
            var7 = Integer.parseInt(var6);
            var2 = this.field_o.indexOf("</hotspot>", var5);
            var8 = var4.b(var5, 0);
            var9 = var4.b(var2, 0);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var11 > var9) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_f[var11];
                  if (var8 != var11) {
                    stackOut_9_0 = var12.field_d[0];
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = var4.a(var5, 0);
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_10_0;
                  if (var9 == var11) {
                    stackOut_14_0 = var4.a(var2, 0);
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  } else {
                    if (var12 != null) {
                      stackOut_13_0 = var12.field_d[var12.field_d.length - 1];
                      stackIn_15_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = 0;
                      stackIn_15_0 = stackOut_12_0;
                      break L4;
                    }
                  }
                }
                L5: {
                  var14 = stackIn_15_0;
                  var15 = new hh(var7, var13, var12.field_e, var14 + -var13, Math.max(var3.a(8233), -var12.field_e + var12.field_a));
                  if (var10 == null) {
                    break L5;
                  } else {
                    ((hh) (var10)).field_j = var15;
                    break L5;
                  }
                }
                this.field_R.a(var15, -16611);
                var10 = var15;
                var11++;
                continue L2;
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 < 45) {
            return;
        }
        super.a(param0, (byte) 117, param2, param3, param4);
        this.b(true);
    }

    String f(int param0) {
        if (param0 <= 70) {
            field_K = (rh) null;
        }
        if (this.field_N == null) {
            return null;
        }
        if (null == this.field_M) {
            return null;
        }
        if (this.field_N.field_i >= this.field_M.length) {
            return null;
        }
        return this.field_M[this.field_N.field_i];
    }

    vj(String param0, cj param1) {
        super(param0, (sc) null);
        this.field_N = null;
        try {
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "vj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, -121, param2, param3);
        if (!(0 == param2)) {
            return;
        }
        if (param1 > -106) {
            this.field_N = (hh) null;
        }
        w var9 = (w) ((Object) this.field_l);
        hh var6 = this.field_N;
        if (var6 == null) {
        } else {
            var7 = var9.a((gl) (this), -37, param0);
            var8 = var9.a((gl) (this), param3, (byte) -72);
            do {
                ed.a(var6.field_q - -2, var6.field_h - -2, var8 + (var6.field_o - 2), 52, var7 - (-var6.field_n + 2));
                var6 = var6.field_j;
            } while (var6 != null);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.a(param0, (byte) 88, param3, param2, ((w) ((Object) this.field_l)).b((gl) (this), (byte) 112));
        if (param1 >= -4) {
            field_L = (String) null;
        }
    }

    public static void h(int param0) {
        fa discarded$0 = null;
        field_L = null;
        if (param0 != -32015) {
            discarded$0 = vj.a(true, false, -10, (byte) -18, -113);
        }
        field_O = null;
        field_K = null;
    }

    final static fa a(boolean param0, boolean param1, int param2, byte param3, int param4) {
        if (param3 != 62) {
            field_L = (String) null;
        }
        return jg.a(30, param4, false, param0, param2, param1);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param3 - this.field_w;
        int var6 = -this.field_u + param0;
        hh var7 = this.a(param2 + 4, var5, var6);
        if (var7 != null) {
            if (!(this.field_r == null)) {
                ((jf) ((Object) this.field_r)).a((byte) -85, (vj) (this), param1, var7.field_i);
            }
        }
    }

    static {
        field_L = "Orb coins: <%0>";
        field_O = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_K = new rh(0, 2, 2, 1);
    }
}
