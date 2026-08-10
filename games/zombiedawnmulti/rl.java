/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static String[] field_h;
    boolean field_l;
    private hk[] field_d;
    th field_q;
    private int[] field_i;
    private int[] field_j;
    private int[] field_k;
    private c[][] field_s;
    private int[] field_g;
    static of[] field_r;
    private th field_n;
    static byte[] field_v;
    private boolean field_t;
    private th field_e;
    int[] field_p;
    fh field_b;
    private boolean field_o;
    kb field_m;
    static String field_c;
    private th field_f;
    static ja[] field_a;
    th field_u;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7;
        int var8;
        qj var9;
        hk var10;
        hk var11;
        if (param1 == -11513) {
          L0: {
            var10 = this.field_d[param2];
            var11 = var10;
            if ((param3 ^ -1) > -1) {
              break L0;
            } else {
              if (var11.field_d.length <= param3) {
                break L0;
              } else {
                if (255 == var10.field_d[param3]) {
                  break L0;
                } else {
                  if (var10.field_b[param3] > this.field_m.field_H) {
                    L1: {
                      if (1000 + this.field_m.field_H < var10.field_b[param3]) {
                        this.a((byte) -118, "powerup not ready", this.field_m.field_H + ": " + param2 + " tried to use a powerup slot that's not ready yet: " + param3 + " is due " + var10.field_b[param3]);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    return;
                  } else {
                    var7 = var10.field_d[param3];
                    var8 = var10.field_f[param3];
                    var9 = new qj(this.field_m.field_H + 50, param2, var7, var8, param4, param0);
                    this.field_e.a(var9, false);
                    this.a(-7737, rm.a(this.field_m.field_H, param4, param0, var7, var8, param2, param1 ^ -13113, param4));
                    var11.field_b[param3] = this.field_m.field_H + this.field_m.a(var8, var7, param2, false);
                    return;
                  }
                }
              }
            }
          }
          this.a((byte) 95, "invalid powerup slot", param2 + " tried to use invalid powerup slot: " + param3);
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        if (nb.field_a != null) {
            nb.field_a.g((byte) 118);
        }
        if (param0 >= -125) {
            return;
        }
        if (null != pj.field_I) {
            pj.field_I.l(124);
        }
        qe.d(0);
    }

    final void a(int param0, ge param1, int param2, lm param3) {
        int var5_int = param3.e((byte) -112);
        int var6 = param3.g(param2 + 1829980022);
        ge var7 = new ge(var5_int, var6, param3.k((byte) 121));
        if (param2 != -32422) {
            return;
        }
        try {
            var7.field_A = (rl) (this);
            var7.field_x = this.field_m.a(param2 + -16744794);
            var7.field_gb = param0;
            this.field_m.field_d[var7.field_gb] = this.field_m.field_d[var7.field_gb] + param3.o(-116);
            this.field_u.a(var7, false);
            this.a(param3, var7, param1, false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        this.d(-32724);
        if (param0 != -198) {
            return;
        }
        this.a(120);
    }

    public static void c(int param0) {
        field_a = null;
        field_c = null;
        field_h = null;
        field_r = null;
        if (param0 < 59) {
            field_c = (String) null;
        }
        field_v = null;
    }

    private final void a(int param0, ge param1) {
        pc var3 = null;
        if (param0 != -2) {
            this.field_j = (int[]) null;
        }
        param1.field_eb = false;
        if (param1.field_Z) {
            return;
        }
        try {
            var3 = aq.a(this.field_m.field_H, false, param1.field_tb.field_x, param1.field_x);
            this.a(param0 + -7735, var3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, ek param1) {
        c var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param1.c((byte) -70);
              if (param0 < -21) {
                break L1;
              } else {
                rl.a((byte) 90);
                break L1;
              }
            }
            L2: {
              var3 = this.a(true, param1.field_C, param1.field_B);
              if (var3 == null) {
                break L2;
              } else {
                var3.a(param1, true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("rl.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final c a(boolean param0, int param1, int param2) {
        if (!param0) {
            return (c) null;
        }
        if (this.field_s[0].length < param1) {
            return null;
        }
        if (param2 > this.field_s.length) {
            return null;
        }
        if (param2 < 0) {
            return null;
        }
        if (0 > param1) {
            return null;
        }
        if (!(null != this.field_s[param2][param1])) {
            this.field_s[param2][param1] = new c();
        }
        return this.field_s[param2][param1];
    }

    private final void b(int param0, int param1) {
        ge var3;
        pa var4;
        lm var5;
        var4 = this.a((byte) -125, param1);
        if (var4 != null) {
          var4.b(false);
          if (param0 == 4) {
            L0: {
              if (!(var4 instanceof ge)) {
                L1: {
                  if (!(var4 instanceof lm)) {
                    break L1;
                  } else {
                    var5 = (lm) ((Object) var4);
                    var5.n((byte) -100);
                    break L1;
                  }
                }
                break L0;
              } else {
                var3 = (ge) ((Object) var4);
                var3.f(true);
                var3.t(4);
                var3.r((byte) -111);
                if (-30 == (var3.field_Q ^ -1)) {
                  var3.a(4, (byte) -89);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, ge param1, boolean param2) {
        try {
            if (param0 != 65) {
                this.field_l = false;
            }
            this.field_n.a(new nk(param1, param1.e((byte) -112), param1.g(1829947600), param2), false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, pa param1) {
        so var3 = null;
        param1.field_S = false;
        if (param1.field_Z) {
            return;
        }
        try {
            if (param0 != -2) {
                this.field_s = (c[][]) null;
            }
            var3 = ng.a(param1.field_N, param0 ^ -101, param1.field_Q, param1.field_x, param1.field_G, this.field_m.field_H, param1.field_E, param1.field_db, param1.field_ab);
            this.a(-7737, var3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final pa a(byte param0, int param1) {
        ek var3 = this.c(param1, -117);
        if (var3 == null) {
            return null;
        }
        if (!(var3 instanceof pa)) {
            throw new IllegalArgumentException("oid " + param1 + " is not a character");
        }
        if (param0 > -119) {
            field_v = (byte[]) null;
        }
        return (pa) ((Object) var3);
    }

    private final void a(int param0) {
        kb stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        kb stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        ge var9;
        ge var10;
        int[] var15;
        int[] var16;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 > 100) {
          L0: {
            var3 = this.field_m.field_l;
            if (-1 == (var3 ^ -1)) {
              L1: {
                if ((this.field_m.field_H ^ -1) <= -401) {
                  break L1;
                } else {
                  if (-2 != (this.field_m.field_t ^ -1)) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              this.a(false, 1);
              break L0;
            } else {
              L2: {
                if (-2 == (var3 ^ -1)) {
                  if (df.field_I) {
                    if (-1 == (this.field_m.field_m[0] ^ -1)) {
                      if (!pp.field_n) {
                        break L2;
                      } else {
                        if (11 != hg.field_rb) {
                          var9 = new ge(hc.field_c, gk.field_c, 0);
                          var9.a(-9019, (rl) (this));
                          var9.field_gb = 0;
                          var9.field_x = this.field_m.a(-16777216);
                          this.field_m.field_K.a(-25612, var9);
                          var9.field_S = true;
                          op.field_m.field_f = var9.field_x;
                          var10 = new ge(hc.field_c, -30 + gk.field_c, 1);
                          var10.a(-9019, (rl) (this));
                          var10.field_gb = 0;
                          var10.field_x = this.field_m.a(-16777216);
                          this.field_m.field_K.a(-25612, var10);
                          var10.field_S = true;
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      break L0;
                    }
                  } else {
                    if (this.field_m.field_H % 32 != 0) {
                      break L2;
                    } else {
                      var3 = this.field_m.field_t;
                      var15 = this.field_m.field_m;
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var15.length) {
                          L4: {
                            L5: {
                              if (-1 == (var3 ^ -1)) {
                                break L5;
                              } else {
                                if (4500 >= this.field_m.field_H) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              if (this.field_m.field_I / 8 >= this.field_m.field_g) {
                                break L6;
                              } else {
                                if (this.field_m.field_H >= this.field_m.field_C + -3000) {
                                  break L6;
                                } else {
                                  if (1 >= var3) {
                                    break L6;
                                  } else {
                                    break L0;
                                  }
                                }
                              }
                            }
                            this.a(false, 2);
                            break L4;
                          }
                          break L0;
                        } else {
                          var6 = var15[var5];
                          if (0 == var6) {
                            var3--;
                            var5++;
                            continue L3;
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (var3 == 2) {
                    var2 = this.field_m.field_t;
                    var16 = this.field_m.field_m;
                    var4 = 0;
                    L7: while (true) {
                      if (var4 >= var16.length) {
                        L8: {
                          if (var2 == 0) {
                            break L8;
                          } else {
                            if (this.field_m.field_C > this.field_m.field_H) {
                              break L2;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var3 = 0;
                        var4 = 0;
                        var5 = 1;
                        L9: while (true) {
                          if (var5 >= this.field_m.field_d.length) {
                            L10: {
                              stackIn_50_0 = this.field_m;

                              stackIn_50_1 = -110;

                              if (var4 == 0) {
                                stackIn_51_0 = (kb) ((Object) stackIn_50_0);
                                stackIn_51_1 = stackIn_50_1;
                                stackIn_51_2 = var3;
                                break L10;
                              } else {
                                stackIn_51_0 = (kb) ((Object) stackIn_50_0);
                                stackIn_51_1 = stackIn_50_1;
                                stackIn_51_2 = -1;
                                break L10;
                              }
                            }
                            ((kb) (Object) stackIn_51_0).a((byte) stackIn_51_1, stackIn_51_2);
                            this.a(false, 3);
                            break L2;
                          } else {
                            if (this.field_m.field_d[var5] != this.field_m.field_d[var3]) {
                              if (this.field_m.field_d[var5] > this.field_m.field_d[var3]) {
                                var3 = var5;
                                var4 = 0;
                                var5++;
                                continue L9;
                              } else {
                                var5++;
                                continue L9;
                              }
                            } else {
                              var4 = 1;
                              var5++;
                              continue L9;
                            }
                          }
                        }
                      } else {
                        var5 = var16[var4];
                        if ((var5 ^ -1) == -1) {
                          var2--;
                          var4++;
                          continue L7;
                        } else {
                          var4++;
                          continue L7;
                        }
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              }
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        md var4_ref_md = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        md var17 = null;
        int var18 = 0;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              ak.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
              var1_int = vn.field_c.length;
              if (param0 >= 101) {
                break L1;
              } else {
                field_h = (String[]) null;
                break L1;
              }
            }
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L2: while (true) {
              if (var3 >= var1_int) {
                L3: {
                  var3 = ak.field_a[9] >> 792557224;
                  var4 = ak.field_a[10] >> 714580008;
                  var5 = ak.field_a[11] >> -1926026872;
                  var6 = f.field_a << -287271580;
                  var7 = 0;
                  var8 = on.a(var6, -18924) >> -587800440;
                  var9 = wn.a(-126, var6) >> -228522648;
                  if (0 == (bd.field_g ^ -1)) {
                    break L3;
                  } else {
                    if ((bo.field_d ^ -1) != 0) {
                      var9 = -128;
                      var7 = bd.field_g - 320;
                      var8 = -bo.field_d + 240;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var7 * var7 + (var8 * var8 + var9 * var9)));
                var8 = (int)((double)var8 * var10);
                var9 = (int)((double)var9 * var10);
                var7 = (int)((double)var7 * var10);
                var12 = -var3 + var7;
                var13 = var8 + -var4;
                var14 = -var5 + var9;
                var10 = 256.0 / Math.sqrt((double)(var14 * var14 + (var12 * var12 + var13 * var13)));
                var12 = (int)((double)var12 * var10);
                var14 = (int)((double)var14 * var10);
                var13 = (int)((double)var13 * var10);
                var15 = 0;
                L4: while (true) {
                  if (var15 >= vn.field_c.length) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L5: while (true) {
                      if (var17_int >= vn.field_c.length) {
                        var2[var16] = -2147483648;
                        var17 = vn.field_c[var16];
                        c.a(var16, (byte) 106);
                        var18 = 0;
                        L6: while (true) {
                          if (var18 >= 3) {
                            sa.a(var17, ak.field_a, true, hl.field_c, (byte) -121, false, false);
                            gh.a(var17, var7, (byte) 116, var12, var14, var9, var13, var8);
                            var15++;
                            continue L4;
                          } else {
                            hl.field_c[var18] = hl.field_c[var18] + lk.field_G[var15][var18];
                            var18++;
                            continue L6;
                          }
                        }
                      } else {
                        if ((var21[var16] ^ -1) > (var21[var17_int] ^ -1)) {
                          var16 = var17_int;
                          var17_int++;
                          continue L5;
                        } else {
                          var17_int++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              } else {
                var4_ref_md = vn.field_c[var3];
                var4_ref_md.a((byte) -81);
                c.a(var3, (byte) 75);
                var5 = var4_ref_md.field_D + var4_ref_md.field_C >> 1546541409;
                var6 = var4_ref_md.field_G + var4_ref_md.field_l >> 417600865;
                var7 = var4_ref_md.field_j + var4_ref_md.field_r >> 1797707969;
                var8 = ak.field_a[9] >> 498310498;
                var9 = ak.field_a[10] >> 557478690;
                var10_int = ak.field_a[11] >> 2097945858;
                var11 = hl.field_c[4] * var9 + var8 * hl.field_c[3] - -(var10_int * hl.field_c[5]) >> 1591623950;
                var12 = var9 * hl.field_c[7] + hl.field_c[6] * var8 - -(hl.field_c[8] * var10_int) >> 1119527310;
                var13 = var10_int * hl.field_c[11] + hl.field_c[10] * var9 + hl.field_c[9] * var8 >> 1934932974;
                var2[var3] = var7 * var13 + (var12 * var6 + var11 * var5) >> 1113028080;
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "rl.T(" + param0 + ')');
        }
    }

    private final void a(int param0, ae param1) {
        ae var3 = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!this.field_q.f(param0 + 35850)) {
              var3 = (ae) ((Object) this.field_q.a((byte) 76));
              L1: while (true) {
                if (var3 == null) {
                  L2: {
                    this.field_q.a(-25612, param1);
                    if (param0 == -7737) {
                      break L2;
                    } else {
                      this.field_d = (hk[]) null;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if ((param1.field_f ^ -1) <= (var3.field_f ^ -1)) {
                    qc.a(param1, var3, 0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = (ae) ((Object) this.field_q.c((byte) 123));
                    continue L1;
                  }
                }
              }
            } else {
              this.field_q.a(param0 ^ 31283, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("rl.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(boolean param0, byte param1, fc param2) {
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ek var5_ref_ek = null;
        int var5 = 0;
        Object var6 = null;
        Object var7 = null;
        ek var8_ref_ek = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        Object var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        sh var15 = null;
        th var16 = null;
        sh var17 = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            this.field_b = new fh(param2);
            this.field_s = new c[(this.field_b.field_c >> -1771110265) + 1][1 + (this.field_b.field_r >> -1092212313)];
            this.field_m.field_H = 0;
            ip.b((byte) 97);
            this.field_n = new th();
            this.field_f = new th();
            this.field_e = new th();
            var16 = param2.a(91);
            var5_ref_ek = (ek) ((Object) var16.c(78));
            L1: while (true) {
              if (var5_ref_ek == null) {
                L2: {
                  this.field_m.field_I = 0;
                  var5 = 2 * this.field_m.field_t;
                  var6 = null;
                  var7 = null;
                  if (!param0) {
                    break L2;
                  } else {
                    var7 = new ek[var5];
                    var6 = new int[var5];
                    break L2;
                  }
                }
                if (param1 == -6) {
                  var8_ref_ek = (ek) ((Object) this.field_u.c(123));
                  L3: while (true) {
                    if (var8_ref_ek == null) {
                      L4: {
                        if (!param0) {
                          break L4;
                        } else {
                          var8 = 0;
                          L5: while (true) {
                            if (((Object[]) (var7)).length <= var8) {
                              break L4;
                            } else {
                              L6: {
                                if (null == ((Object[]) (var7))[var8]) {
                                  break L6;
                                } else {
                                  ((lm) (((Object[]) (var7))[var8])).p(95);
                                  break L6;
                                }
                              }
                              var8++;
                              continue L5;
                            }
                          }
                        }
                      }
                      L7: {
                        this.field_m.field_g = this.field_m.field_I;
                        this.field_m.field_C = 9000 + 250 * this.field_m.field_I;
                        if ((this.field_m.field_t ^ -1) != -2) {
                          break L7;
                        } else {
                          this.field_m.field_C = 64512;
                          break L7;
                        }
                      }
                      L8: {
                        if (64512 >= this.field_m.field_C) {
                          break L8;
                        } else {
                          this.field_m.field_C = 64512;
                          break L8;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L9: {
                        if (!(var8_ref_ek instanceof lm)) {
                          if (!(var8_ref_ek instanceof ge)) {
                            break L9;
                          } else {
                            break L9;
                          }
                        } else {
                          this.field_m.field_I = this.field_m.field_I + 1;
                          if (!param0) {
                            break L9;
                          } else {
                            var9 = 2147483647;
                            var10 = (sh) ((Object) this.field_f.c(73));
                            L10: while (true) {
                              if (var10 == null) {
                                var10 = var8_ref_ek;
                                var11 = 0;
                                L11: while (true) {
                                  if (var11 >= ((Object[]) (var6)).length) {
                                    break L9;
                                  } else {
                                    L12: {
                                      if ((var9 ^ -1) < (((int[]) (var6))[var11] ^ -1)) {
                                        var12 = ((Object[]) (var7))[var11];
                                        var13 = ((int[]) (var6))[var11];
                                        ((int[]) (var6))[var11] = var9;
                                        var9 = var13;
                                        ((Object[]) (var7))[var11] = var10;
                                        var10 = var12;
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    var11++;
                                    continue L11;
                                  }
                                }
                              } else {
                                L13: {
                                  var11 = ((sh) (var10)).e((byte) -112) - var8_ref_ek.e((byte) -112);
                                  var12_int = ((sh) (var10)).g(1829947600) - var8_ref_ek.g(1829947600);
                                  var13 = var11 * var11 + var12_int * var12_int;
                                  if (var13 >= var9) {
                                    break L13;
                                  } else {
                                    var9 = var13;
                                    break L13;
                                  }
                                }
                                var10 = (sh) ((Object) this.field_f.b(6));
                                continue L10;
                              }
                            }
                          }
                        }
                      }
                      var8_ref_ek = (ek) ((Object) this.field_u.b(6));
                      continue L3;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L14: {
                  if (var5_ref_ek instanceof sh) {
                    var15 = (sh) ((Object) var5_ref_ek);
                    var17 = var15;
                    if (var17.field_O >= this.field_m.field_t) {
                      break L14;
                    } else {
                      var17.a(-9019, (rl) (this));
                      var15.field_O = this.field_m.field_y[var15.field_O];
                      this.field_f.a(var5_ref_ek, false);
                      break L14;
                    }
                  } else {
                    break L14;
                  }
                }
                var5_ref_ek = (ek) ((Object) var16.b(6));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var4);

            stackIn_43_1 = new StringBuilder().append("rl.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L15;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L15;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final lm a(int param0, int param1) {
        ek var3 = this.c(param1, param0 + -417600939);
        if (param0 != 417600865) {
            pa var4 = (pa) null;
            this.a(-39, (pa) null);
        }
        if (!(var3 != null)) {
            throw new IllegalArgumentException("oid " + param1 + " invalid");
        }
        if (!(var3 instanceof lm)) {
            throw new IllegalArgumentException("oid " + param1 + " is not a human");
        }
        return (lm) ((Object) var3);
    }

    private final void a(int param0, boolean param1, int param2, byte param3) {
        this.field_n.a(new nk((rl) (this), param2, param0, param1), false);
        if (param3 >= -44) {
            ge var6 = (ge) null;
            this.a((byte) -68, (ge) null);
        }
    }

    private final void a(boolean param0, int param1) {
        boolean discarded$0 = false;
        this.field_m.field_l = param1;
        if (param0) {
            discarded$0 = this.b(-90, 117, 86, 71, -86, 91);
        }
        int var3 = this.field_m.field_l;
        if (!(var3 != 2)) {
            this.field_m.field_C = this.field_m.field_H + 3000;
        }
        this.a(-7737, new fq(this.field_m.field_H, this.field_m.field_l, this.field_m.field_C));
    }

    private final ek c(int param0, int param1) {
        int var3;
        ek var4;
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = 101 / ((31 - param1) / 58);
        var4 = (ek) ((Object) this.field_u.c(101));
        L0: while (true) {
          if (var4 != null) {
            if (var4.field_x == param0) {
              return var4;
            } else {
              var4 = (ek) ((Object) this.field_u.b(6));
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(byte param0, String param1, String param2) {
        try {
            int var4_int = 46 / ((param0 - -53) / 59);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, ge param1) {
        if (!(!param1.field_Z)) {
            return;
        }
        try {
            this.a(-7737, new aj(this.field_m.field_H, param1.field_x));
            param1.field_eb = false;
            int var3_int = -89 / ((param0 - -48) / 48);
            param1.field_S = false;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final ek a(int param0, boolean param1) {
        ek var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = (ek) ((Object) this.field_m.field_u.c(104));
        if (param1) {
          L0: while (true) {
            if (var3 != null) {
              if (param0 == var3.field_x) {
                return var3;
              } else {
                var3 = (ek) ((Object) this.field_m.field_u.b(6));
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return (ek) null;
        }
    }

    private final boolean b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_24_0 = 0;
        ge stackIn_74_0 = null;
        ge stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        ge stackIn_103_0 = null;
        ge stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        Object stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        Object stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        int stackIn_109_2 = 0;
        ge stackIn_118_0 = null;
        ge stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        ge stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        ge stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        int stackIn_132_2 = 0;
        Object stackIn_143_0 = null;
        Object stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        int var7;
        ge var8;
        pa var9;
        lm var10;
        int var11;
        int var12_int;
        ek var12;
        int var13;
        og var13_ref_og;
        int var14;
        ge var15;
        ge var16;
        pa var17;
        Object var18;
        ge var18_ref;
        ge var19;
        ge var20;
        ge var21;
        pa var22;
        ge var23;
        L0: {
          var18 = null;
          var14 = ZombieDawnMulti.field_E ? 1 : 0;
          var7 = param2;
          if (!this.field_o) {
            break L0;
          } else {
            System.out.println(this.field_m.field_H + ": executing powerup " + param1 + " with modifier " + param0);
            break L0;
          }
        }
        L1: {
          if (!this.field_m.b((byte) -105, 45, param5)) {
            break L1;
          } else {
            if (param1 != 17) {
              return false;
            } else {
              break L1;
            }
          }
        }
        L2: {
          L3: {
            if (-17 == (param1 ^ -1)) {
              break L3;
            } else {
              if (7 == param1) {
                break L3;
              } else {
                if ((param1 ^ -1) == -5) {
                  break L3;
                } else {
                  if (3 == param1) {
                    break L3;
                  } else {
                    if (-15 == (param1 ^ -1)) {
                      break L3;
                    } else {
                      if (param1 == 8) {
                        break L3;
                      } else {
                        if (-2 == (param1 ^ -1)) {
                          break L3;
                        } else {
                          if (param1 == 2) {
                            break L3;
                          } else {
                            if (5 == param1) {
                              break L3;
                            } else {
                              if (-1 == (param1 ^ -1)) {
                                break L3;
                              } else {
                                if ((param1 ^ -1) == -19) {
                                  break L3;
                                } else {
                                  if (param1 != 6) {
                                    break L2;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          var15 = this.b((byte) 87, var7);
          var12_int = 0;
          if (var15 != null) {
            L4: {
              var13 = var15.field_gb;
              if (!this.field_m.b(0, var13)) {
                stackIn_24_0 = 0;
                break L4;
              } else {
                stackIn_24_0 = 1;
                break L4;
              }
            }
            L5: {
              var12_int = stackIn_24_0;
              if (var12_int == 0) {
                break L5;
              } else {
                L6: {
                  if (param1 == 12) {
                    break L6;
                  } else {
                    if (11 == param1) {
                      break L6;
                    } else {
                      if (-18 == (param1 ^ -1)) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var12_int = 0;
                break L5;
              }
            }
            if (var12_int == 0) {
              break L2;
            } else {
              this.a((byte) 23, var15);
              return false;
            }
          } else {
            break L2;
          }
        }
        L7: {
          var12 = this.c(var7, -69);
          if (var12 == null) {
            break L7;
          } else {
            if (var12 instanceof og) {
              var13_ref_og = (og) ((Object) var12);
              if (var13_ref_og.field_O != param5) {
                this.field_k[var13_ref_og.field_O] = cr.b(this.field_k[var13_ref_og.field_O], 1);
                return false;
              } else {
                return false;
              }
            } else {
              break L7;
            }
          }
        }
        var13 = param1;
        if (3 != var13) {
          if (-8 == (var13 ^ -1)) {
            var17 = this.a((byte) -120, var7);
            if (var17 == null) {
              return false;
            } else {
              L8: {
                L9: {
                  if (!(var17 instanceof lm)) {
                    break L9;
                  } else {
                    if (!var17.field_Z) {
                      var10 = this.a(417600865, var7);
                      if (-21 == (var10.field_Q ^ -1)) {
                        break L8;
                      } else {
                        if (18 == var10.field_Q) {
                          break L8;
                        } else {
                          this.a(param5, (ge) null, -32422, var10);
                          var10.j(18);
                          break L8;
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                if (!(var17 instanceof ge)) {
                  break L8;
                } else {
                  if (param0 == 37) {
                    L10: {
                      var18_ref = (ge) ((Object) var17);
                      if (this.field_o) {
                        System.out.println("cursing, owner " + var18_ref.field_gb + ", prev 0 " + var18_ref.d((byte) 61, 0) + " 1 " + var18_ref.d((byte) 61, 1));
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    if (var18_ref.field_gb != param5) {
                      if (var18_ref.d((byte) 61, param5)) {
                        this.field_k[param5] = cr.b(this.field_k[param5], 2);
                        var18_ref.e(93, param5);
                        break L8;
                      } else {
                        var18_ref.e(93, param5);
                        break L8;
                      }
                    } else {
                      var18_ref.e(93, param5);
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
              }
              return true;
            }
          } else {
            if ((var13 ^ -1) == -5) {
              var8 = this.b((byte) 124, var7);
              if (var8 == null) {
                return false;
              } else {
                L11: {
                  stackIn_103_0 = (ge) (var8);

                  if (param0 != 34) {
                    stackIn_104_0 = (ge) ((Object) stackIn_103_0);
                    stackIn_104_1 = 0;
                    break L11;
                  } else {
                    stackIn_104_0 = (ge) ((Object) stackIn_103_0);
                    stackIn_104_1 = 1;
                    break L11;
                  }
                }
                ((ge) (Object) stackIn_104_0).a(stackIn_104_1 != 0, (byte) 100);
                return true;
              }
            } else {
              L12: {
                if (-11 != (var13 ^ -1)) {
                  if (-10 != (var13 ^ -1)) {
                    if (-14 == (var13 ^ -1)) {
                      L13: {
                        stackIn_108_0 = this;

                        stackIn_108_1 = param4;

                        if (-37 != (param0 ^ -1)) {
                          stackIn_109_0 = this;
                          stackIn_109_1 = stackIn_108_1;
                          stackIn_109_2 = 0;
                          break L13;
                        } else {
                          stackIn_109_0 = this;
                          stackIn_109_1 = stackIn_108_1;
                          stackIn_109_2 = 1;
                          break L13;
                        }
                      }
                      this.a(stackIn_109_1, stackIn_109_2 != 0, param2, (byte) -52);
                      return true;
                    } else {
                      if (-2 == (var13 ^ -1)) {
                        var19 = this.b((byte) 25, var7);
                        if (var19 == null) {
                          return false;
                        } else {
                          var19.l((byte) -52);
                          return true;
                        }
                      } else {
                        if (var13 != 2) {
                          if (var13 == 16) {
                            var20 = this.b((byte) 100, var7);
                            if (var20 == null) {
                              return false;
                            } else {
                              var20.m(-6556);
                              return true;
                            }
                          } else {
                            if (-15 != (var13 ^ -1)) {
                              if (5 != var13) {
                                if (-1 != (var13 ^ -1)) {
                                  if (18 != var13) {
                                    if (15 != var13) {
                                      if (8 == var13) {
                                        var9 = this.a((byte) -125, var7);
                                        if (var9 != null) {
                                          L14: {
                                            var11 = this.field_m.a((byte) 32, param5, 400);
                                            if (var9 instanceof ge) {
                                              if (34 != param0) {
                                                ((ge) ((Object) var9)).d(var11, -96);
                                                break L14;
                                              } else {
                                                ((ge) ((Object) var9)).m((byte) 124);
                                                break L14;
                                              }
                                            } else {
                                              if (!(var9 instanceof lm)) {
                                                break L14;
                                              } else {
                                                if ((param0 ^ -1) == -35) {
                                                  ((lm) ((Object) var9)).c(false);
                                                  break L14;
                                                } else {
                                                  ((lm) ((Object) var9)).a(var11 * 3 / 4, true);
                                                  break L14;
                                                }
                                              }
                                            }
                                          }
                                          return true;
                                        } else {
                                          return false;
                                        }
                                      } else {
                                        if (17 != var13) {
                                          if ((var13 ^ -1) != -12) {
                                            if (-13 == (var13 ^ -1)) {
                                              this.field_m.field_z[param5] = this.field_m.a((byte) 32, param5, 750);
                                              return true;
                                            } else {
                                              L15: {
                                                if (param3 <= -44) {
                                                  break L15;
                                                } else {
                                                  this.b(19, 25, -67, 7);
                                                  break L15;
                                                }
                                              }
                                              return false;
                                            }
                                          } else {
                                            this.field_m.field_a[param5] = this.field_m.a((byte) 32, param5, 500);
                                            return true;
                                          }
                                        } else {
                                          L16: {
                                            if (param4 != 65535) {
                                              if (-1 == param4) {
                                                this.b(4, var7);
                                                break L16;
                                              } else {
                                                this.b(2, param5, param4, param2);
                                                break L16;
                                              }
                                            } else {
                                              this.b(4, var7);
                                              break L16;
                                            }
                                          }
                                          return true;
                                        }
                                      }
                                    } else {
                                      L17: {
                                        stackIn_143_0 = this;

                                        if ((param0 ^ -1) != -33) {
                                          stackIn_144_0 = this;
                                          stackIn_144_1 = 0;
                                          break L17;
                                        } else {
                                          stackIn_144_0 = this;
                                          stackIn_144_1 = 1;
                                          break L17;
                                        }
                                      }
                                      this.a(stackIn_144_1 != 0, (byte) -108, param5, param2, param4);
                                      return true;
                                    }
                                  } else {
                                    var23 = this.b((byte) 40, var7);
                                    if (var23 == null) {
                                      return false;
                                    } else {
                                      var23.e(false);
                                      return true;
                                    }
                                  }
                                } else {
                                  var22 = this.a((byte) -121, var7);
                                  if (var22 == null) {
                                    return false;
                                  } else {
                                    var22.c((byte) -68, param5);
                                    return true;
                                  }
                                }
                              } else {
                                var8 = this.b((byte) 68, var7);
                                if (var8 != null) {
                                  L18: {
                                    stackIn_131_0 = (ge) (var8);

                                    stackIn_131_1 = 47;

                                    if (param0 != 35) {
                                      stackIn_132_0 = (ge) ((Object) stackIn_131_0);
                                      stackIn_132_1 = stackIn_131_1;
                                      stackIn_132_2 = 0;
                                      break L18;
                                    } else {
                                      stackIn_132_0 = (ge) ((Object) stackIn_131_0);
                                      stackIn_132_1 = stackIn_131_1;
                                      stackIn_132_2 = 1;
                                      break L18;
                                    }
                                  }
                                  ((ge) (Object) stackIn_132_0).a(stackIn_132_1, stackIn_132_2 != 0);
                                  return true;
                                } else {
                                  return false;
                                }
                              }
                            } else {
                              var21 = this.b((byte) 86, var7);
                              if (var21 != null) {
                                var21.l(34);
                                return true;
                              } else {
                                return false;
                              }
                            }
                          }
                        } else {
                          var8 = this.b((byte) 32, var7);
                          if (var8 != null) {
                            L19: {
                              stackIn_118_0 = (ge) (var8);

                              if (param0 != 38) {
                                stackIn_119_0 = (ge) ((Object) stackIn_118_0);
                                stackIn_119_1 = 0;
                                break L19;
                              } else {
                                stackIn_119_0 = (ge) ((Object) stackIn_118_0);
                                stackIn_119_1 = 1;
                                break L19;
                              }
                            }
                            ((ge) (Object) stackIn_119_0).b(stackIn_119_1 != 0, (byte) -127);
                            return true;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  } else {
                    break L12;
                  }
                } else {
                  break L12;
                }
              }
              var11 = this.field_m.a((byte) 32, param5, 1000);
              this.b(param1, param2, var11, 11564, param4);
              return true;
            }
          }
        } else {
          var16 = this.b((byte) 32, var7);
          if (var16 != null) {
            if (var16.field_gb == param5) {
              L20: {
                stackIn_74_0 = (ge) (var16);

                if (38 == param0) {
                  stackIn_75_0 = (ge) ((Object) stackIn_74_0);
                  stackIn_75_1 = 24;
                  break L20;
                } else {
                  stackIn_75_0 = (ge) ((Object) stackIn_74_0);
                  stackIn_75_1 = 19;
                  break L20;
                }
              }
              ((ge) (Object) stackIn_75_0).a(stackIn_75_1, (byte) -89);
              var16.field_S = true;
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    private final ge b(byte param0, int param1) {
        if (param0 < 19) {
            this.b(101, -68, 16, -57, 121);
        }
        ek var3 = this.c(param1, -40);
        if (!(var3 != null)) {
            if (this.a(param1, true) == null) {
                return null;
            }
            return null;
        }
        if (!(var3 instanceof ge)) {
            return null;
        }
        return (ge) ((Object) var3);
    }

    private final void d(int param0) {
        br var2_ref_br;
        int var2;
        nk var2_ref_nk;
        Object var3;
        ce var3_ref;
        br var3_ref2;
        ce var4;
        br var4_ref;
        ge var5;
        int var6;
        pa var7;
        qj var8;
        bf var9;
        ce var10;
        sa var11;
        pa var12;
        qj var13;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (-4 == (this.field_m.field_l ^ -1)) {
          return;
        } else {
          this.field_m.field_H = this.field_m.field_H + 1;
          this.field_l = false;
          var2_ref_br = this.field_u.c(86);
          L0: while (true) {
            if (!(var2_ref_br instanceof ek)) {
              var2 = 0;
              L1: while (true) {
                if (this.field_m.field_a.length <= var2) {
                  var2 = 0;
                  L2: while (true) {
                    if (var2 >= this.field_m.field_z.length) {
                      if (0 != this.field_m.field_l) {
                        var2 = 0;
                        L3: while (true) {
                          if (var2 >= this.field_m.field_m.length) {
                            var2_ref_br = this.field_u.c(75);
                            L4: while (true) {
                              if (!(var2_ref_br instanceof ek)) {
                                var2_ref_nk = (nk) ((Object) this.field_n.c(127));
                                L5: while (true) {
                                  if (var2_ref_nk == null) {
                                    var9 = (bf) ((Object) this.field_m.field_A.c(param0 + 32810));
                                    L6: while (true) {
                                      if (var9 == null) {
                                        var11 = (sa) ((Object) this.field_m.field_G.c(46));
                                        L7: while (true) {
                                          if (var11 == null) {
                                            L8: {
                                              var2 = 0;
                                              var3 = null;
                                              if (param0 == -32724) {
                                                break L8;
                                              } else {
                                                field_v = (byte[]) null;
                                                break L8;
                                              }
                                            }
                                            var4 = (ce) ((Object) this.field_m.field_s.c(param0 ^ -32670));
                                            L9: while (true) {
                                              if (var4 == null) {
                                                L10: {
                                                  if (var2 == 0) {
                                                    break L10;
                                                  } else {
                                                    var10 = (ce) ((Object) this.field_m.field_s.c(45));
                                                    L11: while (true) {
                                                      if (var10 == null) {
                                                        this.field_b.a(48);
                                                        var4_ref = this.field_u.c(99);
                                                        L12: while (true) {
                                                          if (!(var4_ref instanceof ek)) {
                                                            break L10;
                                                          } else {
                                                            L13: {
                                                              if (var4_ref instanceof ge) {
                                                                ((ge) ((Object) var4_ref)).j((byte) 82);
                                                                break L13;
                                                              } else {
                                                                break L13;
                                                              }
                                                            }
                                                            var4_ref = this.field_u.b(6);
                                                            continue L12;
                                                          }
                                                        }
                                                      } else {
                                                        var10.a((byte) -60);
                                                        var10 = (ce) ((Object) this.field_m.field_s.b(param0 ^ -32726));
                                                        continue L11;
                                                      }
                                                    }
                                                  }
                                                }
                                                L14: while (true) {
                                                  L15: {
                                                    if (this.field_e.f(28113)) {
                                                      break L15;
                                                    } else {
                                                      var8 = (qj) ((Object) this.field_e.g(50));
                                                      var13 = var8;
                                                      if (var13.field_g > this.field_m.field_H) {
                                                        this.field_e.a(-25612, var13);
                                                        break L15;
                                                      } else {
                                                        if (!this.b(var13.field_h, var13.field_q, var13.field_f, -84, var13.field_k, var13.field_n)) {
                                                          continue L14;
                                                        } else {
                                                          if ((this.field_j[var8.field_n] ^ -1) != -256) {
                                                            if (this.field_j[var13.field_n] == var13.field_q) {
                                                              continue L14;
                                                            } else {
                                                              this.field_j[var13.field_n] = -2;
                                                              continue L14;
                                                            }
                                                          } else {
                                                            this.field_j[var8.field_n] = var8.field_q;
                                                            continue L14;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  return;
                                                }
                                              } else {
                                                L16: {
                                                  var3_ref = (ce) ((Object) this.field_m.field_s.b(6));
                                                  if (var4.d(-20232)) {
                                                    var2 = 1;
                                                    break L16;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                                var4 = var3_ref;
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            var11.c(-21);
                                            var11 = (sa) ((Object) this.field_m.field_G.b(6));
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        var9.c(0);
                                        var9 = (bf) ((Object) this.field_m.field_A.b(6));
                                        continue L6;
                                      }
                                    }
                                  } else {
                                    var2_ref_nk.a(param0 + 32843);
                                    var2_ref_nk = (nk) ((Object) this.field_n.b(param0 ^ -32726));
                                    continue L5;
                                  }
                                }
                              } else {
                                L17: {
                                  var3_ref2 = var2_ref_br.field_d;
                                  ((ek) ((Object) var2_ref_br)).h(param0 ^ -32763);
                                  if (!(var2_ref_br instanceof pa)) {
                                    break L17;
                                  } else {
                                    L18: {
                                      var7 = (pa) ((Object) var2_ref_br);
                                      var12 = var7;
                                      if (!(var12 instanceof ge)) {
                                        break L18;
                                      } else {
                                        if (var12.field_Z) {
                                          break L18;
                                        } else {
                                          if (9 == var12.field_Q) {
                                            break L18;
                                          } else {
                                            if ((var12.field_Q ^ -1) != -22) {
                                              this.field_m.field_m[((ge) ((Object) var7)).field_gb] = this.field_m.field_m[((ge) ((Object) var7)).field_gb] + 1;
                                              break L18;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (var12.field_S) {
                                      L19: {
                                        if (var12 instanceof ge) {
                                          var5 = (ge) ((Object) var12);
                                          if (!var5.field_eb) {
                                            break L19;
                                          } else {
                                            this.a(-2, var5);
                                            break L19;
                                          }
                                        } else {
                                          break L19;
                                        }
                                      }
                                      this.a(-2, var12);
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                var2_ref_br = var3_ref2;
                                continue L4;
                              }
                            }
                          } else {
                            this.field_m.field_m[var2] = 0;
                            var2++;
                            continue L3;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (this.field_m.field_z[var2] <= 0) {
                        this.field_m.field_z[var2] = 0;
                        var2++;
                        continue L2;
                      } else {
                        this.field_m.field_z[var2] = this.field_m.field_z[var2] - 1;
                        var2++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  if (-1 <= (this.field_m.field_a[var2] ^ -1)) {
                    this.field_m.field_a[var2] = 0;
                    var2++;
                    continue L1;
                  } else {
                    this.field_m.field_a[var2] = this.field_m.field_a[var2] - 1;
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              L20: {
                if (!(var2_ref_br instanceof ge)) {
                  break L20;
                } else {
                  if (!((ge) ((Object) var2_ref_br)).p((byte) 53)) {
                    break L20;
                  } else {
                    this.field_l = true;
                    break L20;
                  }
                }
              }
              var2_ref_br = this.field_u.b(param0 ^ -32726);
              continue L0;
            }
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        ce var6;
        ek var7;
        int var9;
        ge var10;
        ce stackIn_4_0;
        ce stackIn_4_1;
        fh stackIn_4_2;
        int stackIn_4_3;
        int stackIn_4_4;
        int stackIn_4_5;
        ce stackIn_5_0 = null;
        ce stackIn_5_1 = null;
        fh stackIn_5_2 = null;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        int stackIn_5_6 = 0;
        lm var11;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param3 == 11564) {
          L0: {
            stackIn_4_0 = null;

            stackIn_4_1 = null;

            stackIn_4_2 = this.field_b;

            stackIn_4_3 = param1;

            stackIn_4_4 = param4;

            stackIn_4_5 = param2;

            if (9 != param0) {
              stackIn_5_0 = null;
              stackIn_5_1 = null;
              stackIn_5_2 = (fh) ((Object) stackIn_4_2);
              stackIn_5_3 = stackIn_4_3;
              stackIn_5_4 = stackIn_4_4;
              stackIn_5_5 = stackIn_4_5;
              stackIn_5_6 = 0;
              break L0;
            } else {
              stackIn_5_0 = null;
              stackIn_5_1 = null;
              stackIn_5_2 = (fh) ((Object) stackIn_4_2);
              stackIn_5_3 = stackIn_4_3;
              stackIn_5_4 = stackIn_4_4;
              stackIn_5_5 = stackIn_4_5;
              stackIn_5_6 = 1;
              break L0;
            }
          }
          L1: {
            var6 = new ce(stackIn_5_2, stackIn_5_3, stackIn_5_4, stackIn_5_5, stackIn_5_6);
            this.field_m.field_s.a(var6, false);
            if (param0 == 9) {
              var7 = (ek) ((Object) this.field_u.c(60));
              L2: while (true) {
                if (var7 == null) {
                  break L1;
                } else {
                  L3: {
                    if (!(var7 instanceof ge)) {
                      if (var7 instanceof lm) {
                        var11 = (lm) ((Object) var7);
                        if (var6.a(var11.e((byte) -112), var11.g(1829947600), -1)) {
                          var11.a(200, true);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var7 = (ek) ((Object) this.field_u.b(6));
                        continue L2;
                      }
                    } else {
                      var10 = (ge) ((Object) var7);
                      if (var6.a(var10.e((byte) -112), var10.g(1829947600), -1)) {
                        var10.d(200, -124);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var7 = (ek) ((Object) this.field_u.b(6));
                  continue L2;
                }
              }
            } else {
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean a(pa param0, byte param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sh var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ge var6 = null;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!param0.field_Z) {
              if (param1 == 105) {
                var3 = (sh) ((Object) this.field_f.c(64));
                L1: while (true) {
                  if (var3 == null) {
                    stackIn_27_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      var4 = var3.field_C - param0.field_C;
                      if (-1 > var4) {
                        break L2;
                      } else {
                        if (1 < var4) {
                          break L2;
                        } else {
                          var4 = -param0.field_B + var3.field_B;
                          if (0 < (var4 ^ -1)) {
                            break L2;
                          } else {
                            if (1 < var4) {
                              break L2;
                            } else {
                              if (var3.a(param0, param1 + -84)) {
                                L3: {
                                  this.a(-7737, ak.a(var3.field_O, (byte) -111, this.field_m.field_H, param0.field_x));
                                  if (param0 instanceof lm) {
                                    L4: {
                                      this.field_m.c(-118);
                                      var5 = 10;
                                      this.field_g[var3.field_O] = this.field_g[var3.field_O] + 1;
                                      if (!((lm) ((Object) param0)).field_hb) {
                                        break L4;
                                      } else {
                                        this.field_k[var3.field_O] = cr.b(this.field_k[var3.field_O], 4);
                                        break L4;
                                      }
                                    }
                                    this.field_m.field_J[var3.field_O] = this.field_m.field_J[var3.field_O] + 3;
                                    if (!this.field_m.b((byte) -99, 60, var3.field_O)) {
                                      break L3;
                                    } else {
                                      var5 = var5 + var5 / 2;
                                      break L3;
                                    }
                                  } else {
                                    var6 = (ge) ((Object) param0);
                                    var5 = 4;
                                    var6.t(4);
                                    this.field_i[var3.field_O] = this.field_i[var3.field_O] + 1;
                                    this.field_m.field_J[var3.field_O] = this.field_m.field_J[var3.field_O] + 1;
                                    if (this.field_m.b((byte) -122, 53, var3.field_O)) {
                                      var5 = var5 + var5 / 2;
                                      break L3;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                                this.field_m.field_d[var3.field_O] = this.field_m.field_d[var3.field_O] + var5;
                                this.field_m.a(param1 + -233, param0);
                                stackIn_24_0 = 1;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                    var3 = (sh) ((Object) this.field_f.b(6));
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3_ref);

            stackIn_30_1 = new StringBuilder().append("rl.AA(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L5;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_24_0 != 0;
            } else {
              return stackIn_27_0 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_m.field_A.a(new bf(this.field_b, param2, param0, param3), false);
        if (param1 != -22930) {
            this.a(-17, false, -101, (byte) 121);
        }
    }

    final void a(lm param0, ge param1, int param2, int param3, byte param4) {
        if (!(!param1.field_Z)) {
            return;
        }
        try {
            this.a(-7737, fn.a(param3, param0.field_x, param1.field_x, (byte) 116, this.field_m.field_H, param2));
            param1.field_S = false;
            if (param4 != -63) {
                this.field_b = (fh) null;
            }
            param1.field_eb = false;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.H(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(lm param0, ge param1, ge param2, boolean param3) {
        sj var5 = null;
        try {
            var5 = new sj(this.field_m.field_H, param2 != null ? param2.field_x : -1, param0.field_x, param1.field_x, param0.field_G, param0.field_E, param1.field_gb);
            if (param3) {
                this.field_d = (hk[]) null;
            }
            this.a(-7737, var5);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.JA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0, byte param1, int param2, int param3, int param4) {
        pa[] var6;
        int[] var7;
        int var8;
        br var9_ref_br;
        int var9;
        pa var10;
        int var11;
        int var12;
        ge var13;
        int var14;
        int[] var15;
        Object var16;
        pa var16_ref;
        pa[] var17;
        int[] var18;
        L0: {
          var16 = null;
          var14 = ZombieDawnMulti.field_E ? 1 : 0;
          g.field_a.setSeed((long)((param4 << -161772635) + param3 + param2));
          var17 = new pa[this.field_u.a(0)];
          var6 = var17;
          var18 = new int[this.field_u.a(0)];
          var15 = var18;
          var7 = var15;
          d.a(var7, 0, var18.length, 32767);
          if (param1 <= -36) {
            break L0;
          } else {
            field_r = (of[]) null;
            break L0;
          }
        }
        var8 = 0;
        var9_ref_br = this.field_u.c(111);
        L1: while (true) {
          if (!(var9_ref_br instanceof ek)) {
            var17 = var6;
            vh.a(-7255, var18, var17);
            var17 = var6;
            var9 = 0;
            L2: while (true) {
              if (var8 <= var9) {
                return;
              } else {
                L3: {
                  var10 = var17[var9];
                  if (!(var10 instanceof ge)) {
                    break L3;
                  } else {
                    if (this.field_m.b(0, ((ge) ((Object) var10)).field_gb)) {
                      this.a((byte) 100, (ge) ((Object) var10));
                      var9++;
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var17[var9].b(param2, -50);
                var9++;
                continue L2;
              }
            }
          } else {
            L4: {
              if (var9_ref_br instanceof pa) {
                var16_ref = (pa) ((Object) var9_ref_br);
                var11 = var16_ref.e((byte) -112) + -param3;
                var12 = -param4 + var16_ref.g(1829947600);
                if (-14401 <= (var11 * var11 - -(var12 * var12) ^ -1)) {
                  L5: {
                    if (!param0) {
                      break L5;
                    } else {
                      if (var16_ref instanceof ge) {
                        var13 = (ge) ((Object) var16_ref);
                        if (var13.field_gb != param2) {
                          var6[var8] = (pa) ((Object) var13);
                          var7[var8] = var13.field_x;
                          var8++;
                          break L4;
                        } else {
                          var9_ref_br = this.field_u.b(6);
                          continue L1;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (!(var16_ref instanceof lm)) {
                    break L4;
                  } else {
                    var6[var8] = var16_ref;
                    var7[var8] = var16_ref.field_x;
                    var8++;
                    break L4;
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            var9_ref_br = this.field_u.b(6);
            continue L1;
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int stackIn_32_0 = 0;
        int stackIn_46_0 = 0;
        Object var5;
        br var5_ref;
        br var6_ref_br;
        int var6;
        int var7;
        og var7_ref_og;
        int var8;
        int var9;
        ge var10;
        bf var11;
        sa var12;
        ce var13;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        var5 = null;
        var11 = (bf) ((Object) this.field_m.field_A.c(64));
        L0: while (true) {
          if (var11 == null) {
            var12 = (sa) ((Object) this.field_m.field_G.c(109));
            L1: while (true) {
              if (var12 == null) {
                var13 = (ce) ((Object) this.field_m.field_s.c(98));
                L2: while (true) {
                  L3: {
                    if (var13 == null) {
                      break L3;
                    } else {
                      var5_ref = this.field_m.field_s.b(6);
                      if (!var13.a(param3, param2, -1)) {
                        var13 = (ce) ((Object) var5_ref);
                        continue L2;
                      } else {
                        var13.c(param0 + -28190);
                        break L3;
                      }
                    }
                  }
                  var6_ref_br = this.field_m.field_K.c(85);
                  L4: while (true) {
                    if (var6_ref_br == null) {
                      var6 = 0;
                      var7 = 0;
                      L5: while (true) {
                        if (var7 >= this.field_m.field_a.length) {
                          if (var6 != 0) {
                            return;
                          } else {
                            L6: {
                              var7 = 0;
                              if (param0 == 2) {
                                break L6;
                              } else {
                                var10 = (ge) null;
                                this.a((lm) null, (ge) null, -111, -126, (byte) -27);
                                break L6;
                              }
                            }
                            var8 = 0;
                            L7: while (true) {
                              if (this.field_m.field_z.length <= var8) {
                                if (var7 == 0) {
                                  return;
                                } else {
                                  return;
                                }
                              } else {
                                L8: {
                                  if (var7 == 0) {
                                    if (0 < this.field_m.field_z[var8]) {
                                      stackIn_46_0 = 1;
                                      break L8;
                                    } else {
                                      stackIn_46_0 = 0;
                                      break L8;
                                    }
                                  } else {
                                    stackIn_46_0 = 1;
                                    break L8;
                                  }
                                }
                                var7 = stackIn_46_0;
                                this.field_m.field_z[var8] = 0;
                                var8++;
                                continue L7;
                              }
                            }
                          }
                        } else {
                          L9: {
                            if (var6 == 0) {
                              if (-1 > (this.field_m.field_a[var7] ^ -1)) {
                                stackIn_32_0 = 1;
                                break L9;
                              } else {
                                stackIn_32_0 = 0;
                                break L9;
                              }
                            } else {
                              stackIn_32_0 = 1;
                              break L9;
                            }
                          }
                          var6 = stackIn_32_0;
                          this.field_m.field_a[var7] = 0;
                          var7++;
                          continue L5;
                        }
                      }
                    } else {
                      L10: {
                        if (var6_ref_br instanceof og) {
                          var7_ref_og = (og) ((Object) var6_ref_br);
                          if (var7_ref_og.b(param2, param3, param0 + -120)) {
                            var7_ref_og.field_R = 1;
                            break L10;
                          } else {
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      }
                      var6_ref_br = this.field_m.field_K.b(param0 + 4);
                      continue L4;
                    }
                  }
                }
              } else {
                var5_ref = this.field_m.field_G.b(6);
                if (var12.a(param3, param0 + 17308, param2)) {
                  var12.d(-110);
                  var12.a(true);
                  return;
                } else {
                  var12 = (sa) ((Object) var5_ref);
                  continue L1;
                }
              }
            }
          } else {
            if (!var11.a(param3, param2, (byte) 29)) {
              var11 = (bf) ((Object) this.field_m.field_A.b(6));
              continue L0;
            } else {
              var11.a(-98);
              return;
            }
          }
        }
    }

    final void a(int param0, ge param1, ge param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2.field_Z) {
                break L1;
              } else {
                if (param1.field_Z) {
                  break L1;
                } else {
                  this.a(-7737, td.a(param2.g(1829947600), this.field_m.field_H, param2.e((byte) -112), (byte) 41, param1.g(1829947600), param1.field_x, param1.e((byte) -112), param2.field_x));
                  var4_int = -87 % ((param0 - -35) / 36);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("rl.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var8;
        br var8_ref_br;
        lm var9;
        int var10;
        int var11;
        int var12;
        hk var13;
        int var14;
        hk var15;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_t) {
          L0: {
            System.out.println("player [" + param2 + "] cheating: " + param1 + ", " + param5 + ", " + param3 + ", " + param0);
            if (param4 == 3) {
              break L0;
            } else {
              this.a(102, false, -116, (byte) 100);
              break L0;
            }
          }
          L1: {
            var8 = param1;
            if (var8 == 0) {
              var8_ref_br = this.field_u.c(85);
              L2: while (true) {
                if (var8_ref_br == null) {
                  break L1;
                } else {
                  L3: {
                    if (var8_ref_br instanceof lm) {
                      var9 = (lm) ((Object) var8_ref_br);
                      if (!var9.field_Z) {
                        var10 = -param5 + var9.e((byte) -112);
                        var11 = -param3 + var9.g(1829947600);
                        if ((var10 * var10 + var11 * var11 ^ -1) <= -4001) {
                          var9.field_G = param5 << 68571088;
                          var9.field_E = param3 << -956133712;
                          var9.field_S = true;
                          System.out.println("moving human oid " + var9.field_x);
                          break L1;
                        } else {
                          var8_ref_br = this.field_u.b(6);
                          continue L2;
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var8_ref_br = this.field_u.b(6);
                  continue L2;
                }
              }
            } else {
              if (var8 == 1) {
                this.field_m.field_d[param0] = 100;
                this.field_m.field_d[(param0 - -1) % this.field_m.field_t] = 25;
                this.field_m.field_H = 6000;
                this.a(false, 2);
                this.field_m.field_C = this.field_m.field_H - -1;
                break L1;
              } else {
                if (var8 != 3) {
                  if (2 == var8) {
                    var13 = this.field_d[param2];
                    var15 = var13;
                    var14 = 0;
                    var8 = var14;
                    L4: while (true) {
                      if (var15.field_b.length <= var14) {
                        break L1;
                      } else {
                        var13.field_b[var14] = 0;
                        var14++;
                        continue L4;
                      }
                    }
                  } else {
                    break L1;
                  }
                } else {
                  this.a(false, param5);
                  break L1;
                }
              }
            }
          }
          return;
        } else {
          this.a((byte) 52, "cheat disabled!", "player [" + param2 + "] attempted to cheat: " + param1 + ", " + param5 + ", " + param3 + ", " + param0);
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, boolean param4) {
        ge var7 = this.b((byte) 117, param3);
        if (!(var7 != null)) {
            return false;
        }
        if (param0 != var7.field_gb) {
            return true;
        }
        if (!(21 != var7.field_Q)) {
            return true;
        }
        if (param4) {
            return true;
        }
        if (!var7.field_lb) {
            var7.a(!param4 ? true : false, this.field_b.b(var7.e((byte) -112), param2, var7.g(1829947600), param1, 8760));
        } else {
            var7.field_G = param1 << 1544547728;
            var7.field_E = param2 << -477061392;
            var7.a(33, (byte) -89);
            var7.field_ab = param2;
            var7.field_N = param1;
        }
        this.a(-2, (pa) (var7));
        return true;
    }

    rl(kb param0, hk[] param1, boolean param2, boolean param3) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        ek var7 = null;
        this.field_i = new int[4];
        this.field_o = false;
        this.field_j = new int[4];
        this.field_p = new int[4];
        this.field_k = new int[4];
        this.field_g = new int[4];
        try {
          L0: {
            L1: {
              this.field_d = param1;
              stackIn_3_0 = this;

              if (!param2) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            ((rl) (this)).field_t = stackIn_4_1 != 0;
            this.field_m = param0;
            this.field_q = new th();
            this.field_u = this.field_m.a((byte) 125);
            this.a(param3, (byte) -6, this.field_m.field_h);
            var7 = (ek) ((Object) this.field_u.c(126));
            L2: while (true) {
              if (var7 == null) {
                this.field_m.field_l = 0;
                var5_int = 0;
                L3: while (true) {
                  if (var5_int >= this.field_j.length) {
                    break L0;
                  } else {
                    this.field_j[var5_int] = 255;
                    var5_int++;
                    continue L3;
                  }
                }
              } else {
                var7.a(-9019, (rl) (this));
                var7 = (ek) ((Object) this.field_u.b(6));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("rl.<init>(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_c = "Real-life threats";
    }
}
