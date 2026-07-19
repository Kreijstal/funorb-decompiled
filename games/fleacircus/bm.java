/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends gj implements da {
    private bb[] field_F;
    private bd field_L;
    private String field_H;
    static int field_K;
    static String field_N;
    private fa field_G;
    static int field_M;
    private int[] field_I;
    private int field_J;

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param3 == 248) {
              var6_int = 0;
              L1: while (true) {
                L2: {
                  if (var6_int >= this.field_J) {
                    break L2;
                  } else {
                    if (var8 == 0) {
                      L3: {
                        if (this.field_F[var6_int] != param4) {
                          break L3;
                        } else {
                          L4: {
                            var7 = this.field_I[var6_int];
                            if (0 != (var7 ^ -1)) {
                              break L4;
                            } else {
                              this.field_L.n(-22645);
                              if (var8 == 0) {
                                break L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                          cg.a((byte) -105, this.field_I[var6_int]);
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var6_int++;
                      continue L1;
                    } else {
                      return;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var6);
            stackOut_16_1 = new StringBuilder().append("bm.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1) {
        bb[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        bb[] var7 = null;
        bb[] var8 = null;
        var6 = fleas.field_A ? 1 : 0;
        if (this.field_J < param1) {
          var7 = new bb[param1];
          var8 = var7;
          var3 = var8;
          var4 = new int[param1];
          var5 = param0;
          L0: while (true) {
            if (this.field_J > var5) {
              var7[var5] = this.field_F[var5];
              var4[var5] = this.field_I[var5];
              var5++;
              if (var6 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              this.field_F = var8;
              this.field_I = var4;
              this.field_J = param1;
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void c(boolean param0) {
        if (param0) {
            field_N = (String) null;
            field_N = null;
            return;
        }
        field_N = null;
    }

    final bb a(kd param0, boolean param1, String param2) {
        bb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        bb stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        bb stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var4 = new bb(param2, param0);
              var4.field_p = (ch) ((Object) new ri());
              if (param1) {
                break L1;
              } else {
                this.field_G = (fa) null;
                break L1;
              }
            }
            var5 = this.field_j - 2;
            this.a(0, this.field_u, 0, this.field_j + 34, 80);
            var4.a(7, this.field_u - 14, var5, 30, 80);
            this.a((qa) (var4), (byte) -32);
            stackOut_2_0 = (bb) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("bm.GA(");
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
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static ll a(boolean param0, int param1, int param2, int param3, int param4) {
        ll var5 = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var5 = (ll) ((Object) jj.field_S.c((byte) 47));
        L0: while (true) {
          if (var5 != null) {
            stackOut_3_0 = var5.field_k;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var6 == 0) {
              if (stackIn_5_0 == param4) {
                return var5;
              } else {
                var5 = (ll) ((Object) jj.field_S.b((byte) -105));
                continue L0;
              }
            } else {
              ak.a(stackIn_4_0, var5, param1);
              return var5;
            }
          } else {
            var5 = new ll();
            var5.field_k = param4;
            var5.field_t = param2;
            var5.field_q = param3;
            jj.field_S.a(param0, var5);
            ak.a(-14722, var5, param1);
            return var5;
          }
        }
    }

    final static int f(byte param0) {
        if (param0 <= 8) {
            bm.c(true);
            return (int)(1000000000L / na.field_f);
        }
        return (int)(1000000000L / na.field_f);
    }

    final static void e(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 31) {
                break L1;
              } else {
                bm.c(false);
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              if (var1_int >= qi.field_f) {
                break L0;
              } else {
                var3 = rk.field_u[var1_int];
                var4 = kk.field_a[var1_int];
                var2 = -1 + var3;
                var8 = 16 * var4 + 16;
                var7 = 16 * var3 + 20;
                var6 = var4 * 16;
                if (var9 == 0) {
                  L3: {
                    if (-15 == (fl.field_c[var3][var4] ^ -1)) {
                      break L3;
                    } else {
                      if (fl.field_c[var3][var4] != 28) {
                        me.field_i[var1_int] = 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var5 = var3 * 16;
                  L4: while (true) {
                    L5: {
                      if (!qg.a(fl.field_c[var2][var4], -48)) {
                        var2 = var3 - -1;
                        break L5;
                      } else {
                        var5 -= 16;
                        var2--;
                        if (var9 != 0) {
                          break L5;
                        } else {
                          continue L4;
                        }
                      }
                    }
                    L6: while (true) {
                      L7: {
                        if (!qg.a(fl.field_c[var2][var4], -117)) {
                          oa.field_m[var1_int] = var5;
                          uh.field_n[var1_int] = var6;
                          lc.field_v[var1_int] = var7;
                          ca.field_G[var1_int] = var8;
                          var1_int++;
                          break L7;
                        } else {
                          var2++;
                          var7 += 16;
                          if (var9 != 0) {
                            break L7;
                          } else {
                            continue L6;
                          }
                        }
                      }
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "bm.EA(" + param0 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_J;
            this.a(param1 ^ param1, 1 + var4_int);
            this.field_F[var4_int] = this.a((kd) (this), true, param0);
            this.field_I[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "bm.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    bm(bd param0, fa param1, String param2) {
        super(0, 0, 288, 0, (ch) null);
        int var4_int = 0;
        this.field_J = 0;
        try {
            this.field_G = param1;
            this.field_H = param2;
            this.field_L = param0;
            var4_int = null == this.field_H ? 0 : this.field_G.b(this.field_H, 260, this.field_G.field_H);
            this.a(0, 288, 0, var4_int + 22, 80);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "bm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        super.b(param0, param1, param2, param3);
        int discarded$0 = this.field_G.a(this.field_H, 14 + param1 + this.field_y, param0 + (this.field_z + 10), -28 + this.field_u, this.field_j, 16777215, -1, 0, 0, this.field_G.field_H);
    }

    static {
        field_N = "To server list";
    }
}
