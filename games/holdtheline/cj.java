/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cj extends rm {
    static int[] field_K;
    private od field_H;
    static String field_M;
    static float field_G;
    private ah field_I;
    private String[] field_J;
    static String field_L;

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.j(0);
    }

    String f(int param0) {
        od discarded$0 = null;
        if (param0 != 0) {
            discarded$0 = this.a((byte) -75, 19, 29);
        }
        if (null == this.field_H) {
            return null;
        }
        if (this.field_J == null) {
            return null;
        }
        if (this.field_H.field_k >= this.field_J.length) {
            return null;
        }
        return this.field_J[this.field_H.field_k];
    }

    final void a(int param0, String param1, boolean param2) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        gn var7 = null;
        String[] var8 = null;
        String[] var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              L2: {
                if (null == this.field_J) {
                  break L2;
                } else {
                  if (this.field_J.length <= param0) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var8 = new String[param0 - -1];
                var9 = var8;
                var4 = var9;
                if (null != this.field_J) {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= this.field_J.length) {
                      break L3;
                    } else {
                      var8[var5] = this.field_J[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              this.field_J = var9;
              break L1;
            }
            L5: {
              this.field_J[param0] = param1;
              if (param2) {
                break L5;
              } else {
                var7 = (gn) null;
                cj.a((gn) null, (gn) null, (gn) null, 76, false);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4_ref);
            stackOut_13_1 = new StringBuilder().append("cj.D(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param3 - this.field_k;
        int var6 = param1 + -this.field_o;
        od var7 = this.a((byte) 124, var5, var6);
        if (var7 != null) {
            if (!(this.field_t == null)) {
                ((qa) ((Object) this.field_t)).a((cj) (this), var7.field_k, (byte) -106, param0);
            }
        }
    }

    boolean a(n param0, int param1) {
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
            if (param1 == -25823) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_J = (String[]) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("cj.NB(");
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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static void a(gn param0, gn param1, gn param2, int param3, boolean param4) {
        try {
            fj.field_o = qn.a("", -7079);
            fj.field_o.a(false, 107);
            i.a(true, param0, param1, param2);
            qj.h(-1);
            ak.field_b = gg.field_M;
            if (param3 < 98) {
                field_M = (String) null;
            }
            bb.field_a = gg.field_M;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "cj.L(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    void a(int param0, n param1, int param2, byte param3) {
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
              this.field_H = null;
              if (this.field_p) {
                var5_int = nc.field_g + (-param0 + -this.field_k);
                var6 = rf.field_X + -param2 + -this.field_o;
                this.field_H = this.a((byte) 124, var5_int, var6);
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
            stackOut_4_1 = new StringBuilder().append("cj.JA(").append(param0).append(',');
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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final od a(byte param0, int param1, int param2) {
        od var4 = null;
        od var5 = null;
        int var6 = 0;
        gn var7 = null;
        L0: {
          var6 = HoldTheLine.field_D;
          if (param0 > 121) {
            break L0;
          } else {
            var7 = (gn) null;
            cj.a((gn) null, (gn) null, (gn) null, -102, false);
            break L0;
          }
        }
        var4 = (od) ((Object) this.field_I.b((byte) 104));
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (od) ((Object) this.field_I.c((byte) 104));
                continue L1;
              } else {
                L3: {
                  if (param1 < var5.field_j) {
                    break L3;
                  } else {
                    if (param2 < var5.field_s) {
                      break L3;
                    } else {
                      if (param1 >= var5.field_n + var5.field_j) {
                        break L3;
                      } else {
                        if (var5.field_l + var5.field_s < param2) {
                          break L3;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_p;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
            return;
        }
        vc var5 = (vc) ((Object) this.field_l);
        od var6 = this.field_H;
        if (var6 == null) {
        } else {
            var7 = var5.a((n) (this), param2, 13112);
            var8 = var5.a(param0 ^ 1337393829, (n) (this), param1);
            do {
                ei.a(var6.field_l - -2, var6.field_n + 2, var7 + (var6.field_j + -2), -2 + var8 - -var6.field_s, (byte) 19);
                var6 = var6.field_p;
            } while (var6 != null);
        }
    }

    final static dk k(int param0) {
        int var1 = 31 % ((param0 - 66) / 35);
        if (wd.field_p == null) {
            wd.field_p = new dk(mo.field_w, 20, 0, 0, 0, 11579568, -1, 0, 0, mo.field_w.field_G, -1, 2147483647, true);
        }
        return wd.field_p;
    }

    final void j(int param0) {
        int var2 = 0;
        vc var3 = null;
        lm var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        lf var12 = null;
        int var13 = 0;
        int var14 = 0;
        od var15 = null;
        int var16 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var16 = HoldTheLine.field_D;
        this.field_I = new ah();
        var2 = param0;
        var3 = (vc) ((Object) this.field_l);
        var4 = var3.a((byte) 20, (n) (this));
        L0: while (true) {
          var5 = this.field_q.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          } else {
            var7 = this.field_q.indexOf(">", var5);
            var6 = this.field_q.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = this.field_q.indexOf("</hotspot>", var5);
            var8 = var4.b(var5, param0 ^ -22539);
            var9 = var4.b(var2, -22539);
            var10 = null;
            var11 = var8;
            L1: while (true) {
              if (var11 > var9) {
                continue L0;
              } else {
                L2: {
                  var12 = var4.field_b[var11];
                  if (var11 != var8) {
                    stackOut_6_0 = var12.field_c[0];
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = var4.a(16777215, var5);
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_7_0;
                  if (var11 != var9) {
                    if (var12 == null) {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = var12.field_c[-1 + var12.field_c.length];
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  } else {
                    stackOut_8_0 = var4.a(16777215, var2);
                    stackIn_12_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var14 = stackIn_12_0;
                  var15 = new od(var7, var13, var12.field_h, var14 - var13, Math.max(var3.a(true), -var12.field_h + var12.field_k));
                  if (var10 != null) {
                    ((od) (var10)).field_p = var15;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                this.field_I.a((byte) -97, var15);
                var10 = var15;
                var11++;
                continue L1;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_L = null;
        field_M = null;
        if (param0 != -1) {
            return;
        }
        field_K = null;
    }

    cj(String param0, dh param1) {
        super(param0, (tb) null);
        this.field_H = null;
        try {
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "cj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        this.a(param3, (byte) 122, param2, ((vc) ((Object) this.field_l)).a((n) (this), -121), param0);
        int var5 = 51 % ((69 - param1) / 32);
    }

    static {
        field_M = "Practice";
        field_L = "Ready";
        field_K = new int[]{331, 404, 477, 550};
    }
}
