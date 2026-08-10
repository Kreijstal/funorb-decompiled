/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends qa {
    static vc field_O;
    int field_I;
    private int field_N;
    private dd[] field_E;
    private dd field_F;
    private int field_B;
    private int field_L;
    private int field_K;
    private int field_C;
    private dd field_P;
    static vg field_D;
    static volatile int field_J;
    private int field_G;
    static fh field_A;
    private dd field_M;
    static fa field_Q;
    boolean field_H;

    private final dd b(int param0, int param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var6 = 0;
        int var13 = fleas.field_A ? 1 : 0;
        dd var14 = new dd(this.field_N * 2, this.field_j);
        r.a(var14, 45);
        int var5 = this.field_j >> -34084671;
        for (var6 = 0; this.field_j > var6; var6++) {
            var7 = (this.field_N * 2 - 1) * (var6 >> 409506081) % (2 * this.field_N);
            var8 = 16711935 & param1;
            var9 = param1 & 65280;
            var10 = var6 + -var5;
            var11 = 128 + (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0);
            var12 = -257 >= (var11 ^ -1) ? var9 | var8 : (16711680 & var11 * var9 | -16711936 & var8 * var11) >>> 502419848;
            gb.b(var7, var6, this.field_N, var12);
            var8 = 16711935 & param0;
            var9 = param0 & 65280;
            gb.b(var7 + -(this.field_N * 2), var6, this.field_N, var12);
            var12 = 256 > var11 ? (16711680 & var9 * var11 | var8 * var11 & -16711936) >>> -215237912 : var9 | var8;
            gb.b(var7 + this.field_N, var6, this.field_N, var12);
            gb.b(-this.field_N + var7, var6, this.field_N, var12);
        }
        ia.a(-121);
        var6 = 83 % ((9 - param2) / 48);
        return var14;
    }

    final static void a(int param0, String param1) {
        fg.field_m = param1;
        if (param0 != -15493) {
            return;
        }
        try {
            cg.a((byte) -105, 12);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "lk.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param3 <= -85) {
              L1: {
                if (this.field_H) {
                  this.field_B = this.field_B + 1;
                  if (this.field_N * 2 >= this.field_B) {
                    break L1;
                  } else {
                    this.field_B = this.field_B - this.field_N * 2;
                    break L1;
                  }
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
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("lk.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static kc a(String param0, boolean param1, byte param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        String var7 = null;
        CharSequence var8 = null;
        kc stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              if (param2 == -35) {
                break L1;
              } else {
                var7 = (String) null;
                lk.a(63, (String) null);
                break L1;
              }
            }
            L2: {
              var6 = null;
              if ((param3.indexOf('@') ^ -1) != 0) {
                var6 = param3;
                break L2;
              } else {
                var8 = (CharSequence) ((Object) param3);
                var4_long = uj.a(var8, (byte) -126);
                break L2;
              }
            }
            stackIn_6_0 = r.a(param1, var4_long, (byte) 84, (String) (var6), param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("lk.AA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        if (!(0 == param3)) {
            return;
        }
        if (!param2) {
            return;
        }
        int var5 = param1 - -this.field_y;
        int var6 = this.field_z + param0;
        this.a(this.field_E[0], var6, 0, var5);
        if (-65537 < (this.field_I ^ -1)) {
            mi.a((byte) -52, var5 - -this.field_u, var5 + (this.field_u * this.field_I >> 650292688), var6 - -this.field_j, var6);
            this.a(this.field_E[1], var6, 0, var5);
            ia.a(-68);
        }
    }

    final static int k(int param0) {
        int stackIn_12_0 = 0;
        int stackIn_28_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!wf.b(-113)) {
                L2: {
                  bk.field_a.b(105, bg.a(pb.field_d, ob.field_e, 96), bg.a(ag.field_f, kc.field_b, 115));
                  if (!bk.field_a.b(-46)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                if (param0 == 10999) {
                  L3: {
                    L4: {
                      var3 = 0;
                      if (var1_int == 0) {
                        break L4;
                      } else {
                        if (-1 < (bk.field_a.field_k ^ -1)) {
                          break L4;
                        } else {
                          L5: {
                            var3 = em.field_e[bk.field_a.field_k];
                            if (var3 == 2) {
                              break L5;
                            } else {
                              if ((var3 ^ -1) != -6) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                          md.i(124);
                          break L3;
                        }
                      }
                    }
                    if (var2 == 0) {
                      break L3;
                    } else {
                      if (-3 == (vc.field_a ^ -1)) {
                        break L3;
                      } else {
                        md.i(-109);
                        break L3;
                      }
                    }
                  }
                  L6: {
                    if (-1 != (var3 ^ -1)) {
                      break L6;
                    } else {
                      if (2 != vc.field_a) {
                        break L6;
                      } else {
                        var4 = -sd.field_h + lj.a((byte) -38);
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if (var6 <= 0) {
                          pf.a(5, 1, true);
                          var3 = 2;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackIn_28_0 = var3;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_12_0 = 108;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L7: {
                  bk.field_a.h(0);
                  if (!bk.field_a.b(-66)) {
                    break L7;
                  } else {
                    var1_int = 1;
                    break L7;
                  }
                }
                if (-14 == (ji.field_a ^ -1)) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "lk.EA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return stackIn_28_0;
        }
    }

    private final dd d(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = fleas.field_A ? 1 : 0;
        int var2 = this.field_j >> 1509851841;
        dd var3 = new dd(var2, this.field_j);
        r.a(var3, 45);
        if (param0 != -15) {
            field_D = (vg) null;
        }
        for (var4 = 0; this.field_j > var4; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_j));
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 > var6 ? (int)(255.0 * var6) : 255;
                }
                gb.a(var5, var4, var8 << -2076140760 | var8 | var8 << -1840242832);
            }
        }
        ia.a(-106);
        return var3;
    }

    lk(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 794305025, (16711422 & param6) >> -1440119039);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.j(124);
    }

    private final void a(dd param0, int param1, int param2, int param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_u + param3;
              mi.a((byte) -52, var5_int + -this.field_P.field_w, param3 - -this.field_P.field_w, param1 + this.field_j, param1);
              var6 = -this.field_B + param3;
              if (param2 == 0) {
                break L1;
              } else {
                field_A = (fh) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var5_int <= var6) {
                L3: {
                  ia.a(param2 ^ -81);
                  if (gb.field_l > this.field_P.field_w + param3) {
                    break L3;
                  } else {
                    r.a(this.field_M, 45);
                    param0.d(-this.field_B, 0);
                    param0.d(this.field_N * 2 - this.field_B, 0);
                    this.field_F.a(0, 0);
                    ia.a(-70);
                    this.field_M.d(param3, param1);
                    break L3;
                  }
                }
                L4: {
                  if (var5_int - this.field_P.field_w > gb.field_h) {
                    break L4;
                  } else {
                    r.a(this.field_M, 45);
                    var7 = this.field_B + (-this.field_P.field_w + this.field_u);
                    L5: while (true) {
                      if (var7 <= this.field_N * 2) {
                        param0.d(-var7, 0);
                        param0.d(-var7 + this.field_N * 2, 0);
                        this.field_P.a(0, 0);
                        ia.a(-79);
                        this.field_M.d(-this.field_P.field_w + var5_int, param1);
                        break L4;
                      } else {
                        var7 = var7 - 2 * this.field_N;
                        continue L5;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param0.d(var6, param1);
                var6 = var6 + param0.field_w;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("lk.JA(");

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
          throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0) {
        int var1 = 2 / ((param0 - -62) / 39);
        return true;
    }

    public static void c(boolean param0) {
        field_O = null;
        field_D = null;
        field_Q = null;
        field_A = null;
        if (!param0) {
            lk.c(true);
        }
    }

    final static void a(byte param0) {
        if (vg.field_z != 0 + -wf.field_c && vg.field_z != -wf.field_c + 250) {
        }
        if (param0 != 35) {
            field_J = -59;
        }
        vg.field_z = vg.field_z + 1;
    }

    private final void j(int param0) {
        if (param0 < 116) {
            return;
        }
        this.field_E = new dd[]{this.b(this.field_G, this.field_C, -117), this.b(this.field_L, this.field_K, 118)};
        this.field_P = this.d((byte) -15);
        this.field_F = this.field_P.b();
        this.field_M = new dd(this.field_j >> 628191361, this.field_j);
    }

    final static boolean i(int param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == 10) {
            break L0;
          } else {
            lk.k(67);
            break L0;
          }
        }
        L1: {
          L2: {
            if (10 > bh.field_t) {
              break L2;
            } else {
              if (ci.field_f) {
                break L2;
              } else {
                if (qh.j(32391)) {
                  break L2;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void a(byte param0, int param1, int param2) {
        this.field_L = (param1 & 16711422) >> -1387688991;
        this.field_G = param1;
        this.field_C = param2;
        this.field_K = 8355711 & param2 >> 867289153;
        if (param0 <= 77) {
            lk.c(false);
        }
        this.j(119);
    }

    private lk(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_L = param8;
        this.field_C = param5;
        this.field_G = param6;
        this.field_K = param7;
        this.field_N = param4;
        this.a(param0, param2, param1, param3, 80);
    }

    static {
        field_O = new vc();
        field_J = 0;
        field_A = new fh(6, 0, 4, 2);
    }
}
