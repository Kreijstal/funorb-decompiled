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
        int var7 = 0;
        int var8 = 0;
        qj var9 = null;
        hk var10 = null;
        hk var11 = null;
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
                  if ((var10.field_b[param3] ^ -1) < (this.field_m.field_H ^ -1)) {
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
        RuntimeException var3_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackOut_5_0 = (RuntimeException) (var3_ref);
            stackOut_5_1 = new StringBuilder().append("rl.F(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
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
        if ((param2 ^ -1) < (this.field_s.length ^ -1)) {
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
        ge var3 = null;
        pa var4 = null;
        lm var5 = null;
        var4 = this.a((byte) -125, param1);
        if (var4 != null) {
          var4.b(false);
          if (param0 == 4) {
            L0: {
              L1: {
                if (!(var4 instanceof ge)) {
                  break L1;
                } else {
                  var3 = (ge) ((Object) var4);
                  var3.f(true);
                  var3.t(4);
                  var3.r((byte) -111);
                  if (-30 == (var3.field_Q ^ -1)) {
                    var3.a(4, (byte) -89);
                    if (!ZombieDawnMulti.field_E) {
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if (!(var4 instanceof lm)) {
                  break L2;
                } else {
                  var5 = (lm) ((Object) var4);
                  var5.n((byte) -100);
                  break L2;
                }
              }
              break L0;
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ge var9 = null;
        ge var10 = null;
        int[] var15 = null;
        int[] var16 = null;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        kb stackIn_49_0 = null;
        kb stackIn_55_0 = null;
        kb stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        kb stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        kb stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        kb stackOut_48_0 = null;
        kb stackOut_54_0 = null;
        kb stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        kb stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        kb stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 > 100) {
          L0: {
            L1: {
              L2: {
                L3: {
                  var3 = this.field_m.field_l;
                  if (-1 == (var3 ^ -1)) {
                    L4: {
                      if ((this.field_m.field_H ^ -1) <= -401) {
                        break L4;
                      } else {
                        if (-2 != (this.field_m.field_t ^ -1)) {
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.a(false, 1);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  } else {
                    if (-2 == (var3 ^ -1)) {
                      break L3;
                    } else {
                      if (var3 == 2) {
                        break L2;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
                if (df.field_I) {
                  if (-1 == (this.field_m.field_m[0] ^ -1)) {
                    if (!pp.field_n) {
                      break L1;
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
                  if ((this.field_m.field_H % 32 ^ -1) != -1) {
                    break L1;
                  } else {
                    var3 = this.field_m.field_t;
                    var15 = this.field_m.field_m;
                    var5 = 0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if ((var5 ^ -1) <= (var15.length ^ -1)) {
                            break L7;
                          } else {
                            var6 = var15[var5];
                            stackOut_22_0 = 0;
                            stackOut_22_1 = var6;
                            stackIn_27_0 = stackOut_22_0;
                            stackIn_27_1 = stackOut_22_1;
                            stackIn_23_0 = stackOut_22_0;
                            stackIn_23_1 = stackOut_22_1;
                            if (var7 != 0) {
                              break L6;
                            } else {
                              L8: {
                                if (stackIn_23_0 != stackIn_23_1) {
                                  break L8;
                                } else {
                                  var3--;
                                  break L8;
                                }
                              }
                              var5++;
                              if (var7 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        stackOut_26_0 = -1;
                        stackOut_26_1 = var3 ^ -1;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        break L6;
                      }
                      L9: {
                        L10: {
                          if (stackIn_27_0 == stackIn_27_1) {
                            break L10;
                          } else {
                            if (4500 >= this.field_m.field_H) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if ((this.field_m.field_I / 8 ^ -1) <= (this.field_m.field_g ^ -1)) {
                            break L11;
                          } else {
                            if ((this.field_m.field_H ^ -1) <= (this.field_m.field_C + -3000 ^ -1)) {
                              break L11;
                            } else {
                              if (1 >= var3) {
                                break L11;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        this.a(false, 2);
                        break L9;
                      }
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var2 = this.field_m.field_t;
              var16 = this.field_m.field_m;
              var4 = 0;
              L12: while (true) {
                L13: {
                  L14: {
                    if ((var4 ^ -1) <= (var16.length ^ -1)) {
                      break L14;
                    } else {
                      var5 = var16[var4];
                      stackOut_38_0 = var5 ^ -1;
                      stackOut_38_1 = -1;
                      stackIn_43_0 = stackOut_38_0;
                      stackIn_43_1 = stackOut_38_1;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      if (var7 != 0) {
                        break L13;
                      } else {
                        L15: {
                          if (stackIn_39_0 != stackIn_39_1) {
                            break L15;
                          } else {
                            var2--;
                            break L15;
                          }
                        }
                        var4++;
                        if (var7 == 0) {
                          continue L12;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  stackOut_42_0 = var2 ^ -1;
                  stackOut_42_1 = -1;
                  stackIn_43_0 = stackOut_42_0;
                  stackIn_43_1 = stackOut_42_1;
                  break L13;
                }
                L16: {
                  if (stackIn_43_0 == stackIn_43_1) {
                    break L16;
                  } else {
                    if ((this.field_m.field_C ^ -1) < (this.field_m.field_H ^ -1)) {
                      break L1;
                    } else {
                      break L16;
                    }
                  }
                }
                var3 = 0;
                var4 = 0;
                var5 = 1;
                L17: while (true) {
                  L18: {
                    L19: {
                      if ((var5 ^ -1) <= (this.field_m.field_d.length ^ -1)) {
                        break L19;
                      } else {
                        stackOut_48_0 = this.field_m;
                        stackIn_55_0 = stackOut_48_0;
                        stackIn_49_0 = stackOut_48_0;
                        if (var7 != 0) {
                          break L18;
                        } else {
                          L20: {
                            L21: {
                              if (stackIn_49_0.field_d[var5] != this.field_m.field_d[var3]) {
                                break L21;
                              } else {
                                var4 = 1;
                                if (var7 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            if (this.field_m.field_d[var5] <= this.field_m.field_d[var3]) {
                              break L20;
                            } else {
                              var3 = var5;
                              var4 = 0;
                              break L20;
                            }
                          }
                          var5++;
                          if (var7 == 0) {
                            continue L17;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    stackOut_54_0 = this.field_m;
                    stackIn_55_0 = stackOut_54_0;
                    break L18;
                  }
                  L22: {
                    stackOut_55_0 = (kb) ((Object) stackIn_55_0);
                    stackOut_55_1 = -110;
                    stackIn_57_0 = stackOut_55_0;
                    stackIn_57_1 = stackOut_55_1;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    if (var4 == 0) {
                      stackOut_57_0 = (kb) ((Object) stackIn_57_0);
                      stackOut_57_1 = stackIn_57_1;
                      stackOut_57_2 = var3;
                      stackIn_58_0 = stackOut_57_0;
                      stackIn_58_1 = stackOut_57_1;
                      stackIn_58_2 = stackOut_57_2;
                      break L22;
                    } else {
                      stackOut_56_0 = (kb) ((Object) stackIn_56_0);
                      stackOut_56_1 = stackIn_56_1;
                      stackOut_56_2 = -1;
                      stackIn_58_0 = stackOut_56_0;
                      stackIn_58_1 = stackOut_56_1;
                      stackIn_58_2 = stackOut_56_2;
                      break L22;
                    }
                  }
                  ((kb) (Object) stackIn_58_0).a((byte) stackIn_58_1, stackIn_58_2);
                  this.a(false, 3);
                  break L1;
                }
              }
            }
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
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
        md var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
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
              L3: {
                L4: {
                  if (var3 >= var1_int) {
                    break L4;
                  } else {
                    var4_ref_md = vn.field_c[var3];
                    var17 = var4_ref_md;
                    var17 = var4_ref_md;
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
                    if (var19 != 0) {
                      break L3;
                    } else {
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var3 = ak.field_a[9] >> 792557224;
                break L3;
              }
              L5: {
                var4 = ak.field_a[10] >> 714580008;
                var5 = ak.field_a[11] >> -1926026872;
                var6 = f.field_a << -287271580;
                var7 = 0;
                var8 = on.a(var6, -18924) >> -587800440;
                var9 = wn.a(-126, var6) >> -228522648;
                if (0 == (bd.field_g ^ -1)) {
                  break L5;
                } else {
                  if ((bo.field_d ^ -1) != 0) {
                    var9 = -128;
                    var7 = bd.field_g - 320;
                    var8 = -bo.field_d + 240;
                    break L5;
                  } else {
                    break L5;
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
              L6: while (true) {
                stackOut_14_0 = var15;
                stackOut_14_1 = vn.field_c.length;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                L7: while (true) {
                  L8: {
                    if (stackIn_15_0 >= stackIn_15_1) {
                      break L8;
                    } else {
                      var16 = 0;
                      if (var19 != 0) {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        var17_int = 1;
                        L9: while (true) {
                          L10: {
                            if (var17_int >= vn.field_c.length) {
                              break L10;
                            } else {
                              stackOut_19_0 = var21[var16] ^ -1;
                              stackOut_19_1 = var21[var17_int] ^ -1;
                              stackIn_15_0 = stackOut_19_0;
                              stackIn_15_1 = stackOut_19_1;
                              stackIn_20_0 = stackOut_19_0;
                              stackIn_20_1 = stackOut_19_1;
                              if (var19 != 0) {
                                continue L7;
                              } else {
                                L11: {
                                  if (stackIn_20_0 <= stackIn_20_1) {
                                    break L11;
                                  } else {
                                    var16 = var17_int;
                                    break L11;
                                  }
                                }
                                var17_int++;
                                if (var19 == 0) {
                                  continue L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          var2[var16] = -2147483648;
                          var17 = vn.field_c[var16];
                          c.a(var16, (byte) 106);
                          var18 = 0;
                          L12: while (true) {
                            L13: {
                              L14: {
                                if (var18 >= 3) {
                                  break L14;
                                } else {
                                  hl.field_c[var18] = hl.field_c[var18] + lk.field_G[var15][var18];
                                  var18++;
                                  if (var19 != 0) {
                                    break L13;
                                  } else {
                                    if (var19 == 0) {
                                      continue L12;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              sa.a(var17, ak.field_a, true, hl.field_c, (byte) -121, false, false);
                              gh.a(var17, var7, (byte) 116, var12, var14, var9, var13, var8);
                              var15++;
                              break L13;
                            }
                            if (var19 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "rl.T(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, ae param1) {
        ae var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!this.field_q.f(param0 + 35850)) {
              var3 = (ae) ((Object) this.field_q.a((byte) 76));
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 == null) {
                      break L3;
                    } else {
                      stackOut_6_0 = param1.field_f ^ -1;
                      stackOut_6_1 = var3.field_f ^ -1;
                      stackIn_13_0 = stackOut_6_0;
                      stackIn_13_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (stackIn_7_0 <= stackIn_7_1) {
                          qc.a(param1, var3, 0);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var3 = (ae) ((Object) this.field_q.c((byte) 123));
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  this.field_q.a(-25612, param1);
                  stackOut_12_0 = param0;
                  stackOut_12_1 = -7737;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L2;
                }
                L4: {
                  if (stackIn_13_0 == stackIn_13_1) {
                    break L4;
                  } else {
                    this.field_d = (hk[]) null;
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_q.a(param0 ^ 31283, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("rl.CA(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
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
        int var12_int = 0;
        Object var12 = null;
        int var13 = 0;
        int var14 = 0;
        sh var15 = null;
        th var16 = null;
        sh var17 = null;
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        boolean stackIn_38_0 = false;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_9_0 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        boolean stackOut_37_0 = false;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
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
              L2: {
                L3: {
                  if (var5_ref_ek == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var5_ref_ek instanceof sh;
                    stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var14 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0) {
                          var15 = (sh) ((Object) var5_ref_ek);
                          var17 = var15;
                          if ((var17.field_O ^ -1) <= (this.field_m.field_t ^ -1)) {
                            break L4;
                          } else {
                            var17.a(-9019, (rl) (this));
                            var15.field_O = this.field_m.field_y[var15.field_O];
                            this.field_f.a(var5_ref_ek, false);
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var5_ref_ek = (ek) ((Object) var16.b(6));
                      if (var14 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_m.field_I = 0;
                stackOut_9_0 = 2 * this.field_m.field_t;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              L5: {
                var5 = stackIn_10_0;
                var6 = null;
                var7 = null;
                if (!param0) {
                  break L5;
                } else {
                  var7 = new ek[var5];
                  var6 = new int[var5];
                  break L5;
                }
              }
              if (param1 == -6) {
                var8_ref_ek = (ek) ((Object) this.field_u.c(123));
                L6: while (true) {
                  L7: {
                    L8: {
                      L9: {
                        if (var8_ref_ek == null) {
                          break L9;
                        } else {
                          stackOut_16_0 = var8_ref_ek instanceof lm;
                          stackIn_38_0 = stackOut_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          if (var14 != 0) {
                            break L8;
                          } else {
                            L10: {
                              L11: {
                                if (!stackIn_17_0) {
                                  break L11;
                                } else {
                                  this.field_m.field_I = this.field_m.field_I + 1;
                                  if (!param0) {
                                    break L10;
                                  } else {
                                    var9 = 2147483647;
                                    var10 = (sh) ((Object) this.field_f.c(73));
                                    L12: while (true) {
                                      L13: {
                                        L14: {
                                          if (var10 == null) {
                                            break L14;
                                          } else {
                                            var11 = ((sh) (var10)).e((byte) -112) - var8_ref_ek.e((byte) -112);
                                            var12_int = ((sh) (var10)).g(1829947600) - var8_ref_ek.g(1829947600);
                                            var13 = var11 * var11 + var12_int * var12_int;
                                            stackOut_21_0 = var13;
                                            stackOut_21_1 = var9;
                                            stackIn_27_0 = stackOut_21_0;
                                            stackIn_27_1 = stackOut_21_1;
                                            stackIn_22_0 = stackOut_21_0;
                                            stackIn_22_1 = stackOut_21_1;
                                            if (var14 != 0) {
                                              break L13;
                                            } else {
                                              L15: {
                                                if (stackIn_22_0 >= stackIn_22_1) {
                                                  break L15;
                                                } else {
                                                  var9 = var13;
                                                  break L15;
                                                }
                                              }
                                              var10 = (sh) ((Object) this.field_f.b(6));
                                              if (var14 == 0) {
                                                continue L12;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                        }
                                        var10 = var10;
                                        var11 = 0;
                                        stackOut_26_0 = var11;
                                        stackOut_26_1 = ((Object[]) (var6)).length;
                                        stackIn_27_0 = stackOut_26_0;
                                        stackIn_27_1 = stackOut_26_1;
                                        break L13;
                                      }
                                      L16: while (true) {
                                        L17: {
                                          if (stackIn_27_0 >= stackIn_27_1) {
                                            break L17;
                                          } else {
                                            stackOut_28_0 = var9 ^ -1;
                                            stackOut_28_1 = ((int[]) (var6))[var11] ^ -1;
                                            stackIn_47_0 = stackOut_28_0;
                                            stackIn_47_1 = stackOut_28_1;
                                            stackIn_29_0 = stackOut_28_0;
                                            stackIn_29_1 = stackOut_28_1;
                                            if (var14 != 0) {
                                              break L7;
                                            } else {
                                              L18: {
                                                if (stackIn_29_0 < stackIn_29_1) {
                                                  var12 = ((Object[]) (var7))[var11];
                                                  var13 = ((int[]) (var6))[var11];
                                                  ((int[]) (var6))[var11] = var9;
                                                  var9 = var13;
                                                  ((Object[]) (var7))[var11] = var10;
                                                  var10 = var12;
                                                  break L18;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                              var11++;
                                              if (var14 == 0) {
                                                stackOut_26_0 = var11;
                                                stackOut_26_1 = ((Object[]) (var6)).length;
                                                stackIn_27_0 = stackOut_26_0;
                                                stackIn_27_1 = stackOut_26_1;
                                                continue L16;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                        }
                                        if (var14 == 0) {
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (!(var8_ref_ek instanceof ge)) {
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            var8_ref_ek = (ek) ((Object) this.field_u.b(6));
                            if (var14 == 0) {
                              continue L6;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      stackOut_37_0 = param0;
                      stackIn_38_0 = stackOut_37_0;
                      break L8;
                    }
                    L19: {
                      L20: {
                        if (!stackIn_38_0) {
                          break L20;
                        } else {
                          var8 = 0;
                          L21: while (true) {
                            if (((Object[]) (var7)).length <= var8) {
                              break L20;
                            } else {
                              if (var14 != 0) {
                                break L19;
                              } else {
                                L22: {
                                  if (null == ((Object[]) (var7))[var8]) {
                                    break L22;
                                  } else {
                                    ((lm) (((Object[]) (var7))[var8])).p(95);
                                    break L22;
                                  }
                                }
                                var8++;
                                if (var14 == 0) {
                                  continue L21;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                        }
                      }
                      this.field_m.field_g = this.field_m.field_I;
                      this.field_m.field_C = 9000 + 250 * this.field_m.field_I;
                      break L19;
                    }
                    stackOut_46_0 = this.field_m.field_t ^ -1;
                    stackOut_46_1 = -2;
                    stackIn_47_0 = stackOut_46_0;
                    stackIn_47_1 = stackOut_46_1;
                    break L7;
                  }
                  L23: {
                    if (stackIn_47_0 != stackIn_47_1) {
                      break L23;
                    } else {
                      this.field_m.field_C = 64512;
                      break L23;
                    }
                  }
                  L24: {
                    if (64512 >= this.field_m.field_C) {
                      break L24;
                    } else {
                      this.field_m.field_C = 64512;
                      break L24;
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var4 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) (var4);
            stackOut_52_1 = new StringBuilder().append("rl.K(").append(param0).append(',').append(param1).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param2 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L25;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L25;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ')');
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
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int var3 = 101 / ((31 - param1) / 58);
        ek var4 = (ek) ((Object) this.field_u.c(101));
        do {
            if (var4 == null) {
                return null;
            }
            if (!(var4.field_x != param0)) {
                return var4;
            }
            var4 = (ek) ((Object) this.field_u.b(6));
        } while (var5 == 0);
        return null;
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
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ek var3 = (ek) ((Object) this.field_m.field_u.c(104));
        if (!param1) {
            return (ek) null;
        }
        do {
            if (var3 == null) {
                return null;
            }
            if (!(param0 != var3.field_x)) {
                return var3;
            }
            var3 = (ek) ((Object) this.field_m.field_u.b(6));
        } while (var4 == 0);
        return null;
    }

    private final boolean b(int param0, int param1, int param2, int param3, int param4, int param5) {
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        int var7 = 0;
        ge var8 = null;
        pa var9 = null;
        lm var10 = null;
        int var11 = 0;
        int var12_int = 0;
        ek var12 = null;
        int var13 = 0;
        og var13_ref_og = null;
        int var14 = 0;
        ge var15 = null;
        ge var16 = null;
        pa var17 = null;
        Object var18 = null;
        ge var18_ref = null;
        ge var19 = null;
        ge var20 = null;
        ge var21 = null;
        pa var22 = null;
        ge var23 = null;
        int stackIn_24_0 = 0;
        ge stackIn_84_0 = null;
        ge stackIn_85_0 = null;
        ge stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        ge stackIn_111_0 = null;
        ge stackIn_112_0 = null;
        ge stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        Object stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        Object stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        Object stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        ge stackIn_126_0 = null;
        ge stackIn_127_0 = null;
        ge stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        ge stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        ge stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        ge stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        int stackIn_141_2 = 0;
        Object stackIn_151_0 = null;
        Object stackIn_152_0 = null;
        Object stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        ge stackOut_83_0 = null;
        ge stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        ge stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        ge stackOut_110_0 = null;
        ge stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        ge stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        Object stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        Object stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        int stackOut_117_2 = 0;
        Object stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        int stackOut_116_2 = 0;
        ge stackOut_125_0 = null;
        ge stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        ge stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        ge stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        ge stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        int stackOut_140_2 = 0;
        ge stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        int stackOut_139_2 = 0;
        Object stackOut_150_0 = null;
        Object stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        Object stackOut_151_0 = null;
        int stackOut_151_1 = 0;
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
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L4;
              } else {
                stackOut_22_0 = 1;
                stackIn_24_0 = stackOut_22_0;
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
              if ((var13_ref_og.field_O ^ -1) != (param5 ^ -1)) {
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
        L8: {
          var13 = param1;
          if (3 != var13) {
            break L8;
          } else {
            if (var14 == 0) {
              var16 = this.b((byte) 32, var7);
              if (var16 != null) {
                if ((var16.field_gb ^ -1) == (param5 ^ -1)) {
                  L9: {
                    stackOut_83_0 = (ge) (var16);
                    stackIn_85_0 = stackOut_83_0;
                    stackIn_84_0 = stackOut_83_0;
                    if (38 == param0) {
                      stackOut_85_0 = (ge) ((Object) stackIn_85_0);
                      stackOut_85_1 = 24;
                      stackIn_86_0 = stackOut_85_0;
                      stackIn_86_1 = stackOut_85_1;
                      break L9;
                    } else {
                      stackOut_84_0 = (ge) ((Object) stackIn_84_0);
                      stackOut_84_1 = 19;
                      stackIn_86_0 = stackOut_84_0;
                      stackIn_86_1 = stackOut_84_1;
                      break L9;
                    }
                  }
                  ((ge) (Object) stackIn_86_0).a(stackIn_86_1, (byte) -89);
                  var16.field_S = true;
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              break L8;
            }
          }
        }
        if (-8 == (var13 ^ -1)) {
          var17 = this.a((byte) -120, var7);
          if (var17 == null) {
            return false;
          } else {
            L10: {
              L11: {
                L12: {
                  if (!(var17 instanceof lm)) {
                    break L12;
                  } else {
                    if (!var17.field_Z) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                if (!(var17 instanceof ge)) {
                  break L10;
                } else {
                  if (param0 == 37) {
                    L13: {
                      var18_ref = (ge) ((Object) var17);
                      if (this.field_o) {
                        System.out.println("cursing, owner " + var18_ref.field_gb + ", prev 0 " + var18_ref.d((byte) 61, 0) + " 1 " + var18_ref.d((byte) 61, 1));
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (var18_ref.field_gb == param5) {
                        break L14;
                      } else {
                        if (!var18_ref.d((byte) 61, param5)) {
                          break L14;
                        } else {
                          this.field_k[param5] = cr.b(this.field_k[param5], 2);
                          break L14;
                        }
                      }
                    }
                    var18_ref.e(93, param5);
                    if (var14 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  } else {
                    break L10;
                  }
                }
              }
              var10 = this.a(417600865, var7);
              if (-21 == (var10.field_Q ^ -1)) {
                break L10;
              } else {
                if (18 == var10.field_Q) {
                  break L10;
                } else {
                  this.a(param5, (ge) null, -32422, var10);
                  var10.j(18);
                  break L10;
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
              L15: {
                stackOut_110_0 = (ge) (var8);
                stackIn_112_0 = stackOut_110_0;
                stackIn_111_0 = stackOut_110_0;
                if (param0 != 34) {
                  stackOut_112_0 = (ge) ((Object) stackIn_112_0);
                  stackOut_112_1 = 0;
                  stackIn_113_0 = stackOut_112_0;
                  stackIn_113_1 = stackOut_112_1;
                  break L15;
                } else {
                  stackOut_111_0 = (ge) ((Object) stackIn_111_0);
                  stackOut_111_1 = 1;
                  stackIn_113_0 = stackOut_111_0;
                  stackIn_113_1 = stackOut_111_1;
                  break L15;
                }
              }
              discarded$5 = ((ge) (Object) stackIn_113_0).a(stackIn_113_1 != 0, (byte) 100);
              return true;
            }
          } else {
            L16: {
              L17: {
                if (-11 != (var13 ^ -1)) {
                  break L17;
                } else {
                  if (var14 == 0) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (-10 != (var13 ^ -1)) {
                  break L18;
                } else {
                  if (var14 == 0) {
                    break L16;
                  } else {
                    break L18;
                  }
                }
              }
              if (-14 == (var13 ^ -1)) {
                L19: {
                  stackOut_115_0 = this;
                  stackOut_115_1 = param4;
                  stackIn_117_0 = stackOut_115_0;
                  stackIn_117_1 = stackOut_115_1;
                  stackIn_116_0 = stackOut_115_0;
                  stackIn_116_1 = stackOut_115_1;
                  if (-37 != (param0 ^ -1)) {
                    stackOut_117_0 = this;
                    stackOut_117_1 = stackIn_117_1;
                    stackOut_117_2 = 0;
                    stackIn_118_0 = stackOut_117_0;
                    stackIn_118_1 = stackOut_117_1;
                    stackIn_118_2 = stackOut_117_2;
                    break L19;
                  } else {
                    stackOut_116_0 = this;
                    stackOut_116_1 = stackIn_116_1;
                    stackOut_116_2 = 1;
                    stackIn_118_0 = stackOut_116_0;
                    stackIn_118_1 = stackOut_116_1;
                    stackIn_118_2 = stackOut_116_2;
                    break L19;
                  }
                }
                this.a(stackIn_118_1, stackIn_118_2 != 0, param2, (byte) -52);
                return true;
              } else {
                if (-2 == (var13 ^ -1)) {
                  var19 = this.b((byte) 25, var7);
                  if (var19 == null) {
                    return false;
                  } else {
                    discarded$6 = var19.l((byte) -52);
                    return true;
                  }
                } else {
                  L20: {
                    if (var13 != 2) {
                      break L20;
                    } else {
                      if (var14 == 0) {
                        var8 = this.b((byte) 32, var7);
                        if (var8 != null) {
                          L21: {
                            stackOut_125_0 = (ge) (var8);
                            stackIn_127_0 = stackOut_125_0;
                            stackIn_126_0 = stackOut_125_0;
                            if (param0 != 38) {
                              stackOut_127_0 = (ge) ((Object) stackIn_127_0);
                              stackOut_127_1 = 0;
                              stackIn_128_0 = stackOut_127_0;
                              stackIn_128_1 = stackOut_127_1;
                              break L21;
                            } else {
                              stackOut_126_0 = (ge) ((Object) stackIn_126_0);
                              stackOut_126_1 = 1;
                              stackIn_128_0 = stackOut_126_0;
                              stackIn_128_1 = stackOut_126_1;
                              break L21;
                            }
                          }
                          discarded$7 = ((ge) (Object) stackIn_128_0).b(stackIn_128_1 != 0, (byte) -127);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        break L20;
                      }
                    }
                  }
                  if (var13 == 16) {
                    var20 = this.b((byte) 100, var7);
                    if (var20 == null) {
                      return false;
                    } else {
                      var20.m(-6556);
                      return true;
                    }
                  } else {
                    L22: {
                      if (-15 != (var13 ^ -1)) {
                        break L22;
                      } else {
                        if (var14 == 0) {
                          var21 = this.b((byte) 86, var7);
                          if (var21 != null) {
                            var21.l(34);
                            return true;
                          } else {
                            return false;
                          }
                        } else {
                          break L22;
                        }
                      }
                    }
                    L23: {
                      if (5 != var13) {
                        break L23;
                      } else {
                        if (var14 == 0) {
                          var8 = this.b((byte) 68, var7);
                          if (var8 != null) {
                            L24: {
                              stackOut_138_0 = (ge) (var8);
                              stackOut_138_1 = 47;
                              stackIn_140_0 = stackOut_138_0;
                              stackIn_140_1 = stackOut_138_1;
                              stackIn_139_0 = stackOut_138_0;
                              stackIn_139_1 = stackOut_138_1;
                              if (param0 != 35) {
                                stackOut_140_0 = (ge) ((Object) stackIn_140_0);
                                stackOut_140_1 = stackIn_140_1;
                                stackOut_140_2 = 0;
                                stackIn_141_0 = stackOut_140_0;
                                stackIn_141_1 = stackOut_140_1;
                                stackIn_141_2 = stackOut_140_2;
                                break L24;
                              } else {
                                stackOut_139_0 = (ge) ((Object) stackIn_139_0);
                                stackOut_139_1 = stackIn_139_1;
                                stackOut_139_2 = 1;
                                stackIn_141_0 = stackOut_139_0;
                                stackIn_141_1 = stackOut_139_1;
                                stackIn_141_2 = stackOut_139_2;
                                break L24;
                              }
                            }
                            discarded$8 = ((ge) (Object) stackIn_141_0).a(stackIn_141_1, stackIn_141_2 != 0);
                            return true;
                          } else {
                            return false;
                          }
                        } else {
                          break L23;
                        }
                      }
                    }
                    L25: {
                      if (-1 != (var13 ^ -1)) {
                        break L25;
                      } else {
                        if (var14 == 0) {
                          var22 = this.a((byte) -121, var7);
                          if (var22 == null) {
                            return false;
                          } else {
                            discarded$9 = var22.c((byte) -68, param5);
                            return true;
                          }
                        } else {
                          break L25;
                        }
                      }
                    }
                    L26: {
                      if (18 != var13) {
                        break L26;
                      } else {
                        if (var14 == 0) {
                          var23 = this.b((byte) 40, var7);
                          if (var23 == null) {
                            return false;
                          } else {
                            var23.e(false);
                            return true;
                          }
                        } else {
                          break L26;
                        }
                      }
                    }
                    L27: {
                      if (15 != var13) {
                        break L27;
                      } else {
                        if (var14 == 0) {
                          L28: {
                            stackOut_150_0 = this;
                            stackIn_152_0 = stackOut_150_0;
                            stackIn_151_0 = stackOut_150_0;
                            if ((param0 ^ -1) != -33) {
                              stackOut_152_0 = this;
                              stackOut_152_1 = 0;
                              stackIn_153_0 = stackOut_152_0;
                              stackIn_153_1 = stackOut_152_1;
                              break L28;
                            } else {
                              stackOut_151_0 = this;
                              stackOut_151_1 = 1;
                              stackIn_153_0 = stackOut_151_0;
                              stackIn_153_1 = stackOut_151_1;
                              break L28;
                            }
                          }
                          this.a(stackIn_153_1 != 0, (byte) -108, param5, param2, param4);
                          return true;
                        } else {
                          break L27;
                        }
                      }
                    }
                    if (8 == var13) {
                      var9 = this.a((byte) -125, var7);
                      if (var9 != null) {
                        L29: {
                          L30: {
                            var11 = this.field_m.a((byte) 32, param5, 400);
                            if (var9 instanceof ge) {
                              break L30;
                            } else {
                              if (!(var9 instanceof lm)) {
                                break L29;
                              } else {
                                L31: {
                                  if ((param0 ^ -1) == -35) {
                                    break L31;
                                  } else {
                                    ((lm) ((Object) var9)).a(var11 * 3 / 4, true);
                                    if (var14 == 0) {
                                      break L29;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                                ((lm) ((Object) var9)).c(false);
                                if (var14 == 0) {
                                  break L29;
                                } else {
                                  break L30;
                                }
                              }
                            }
                          }
                          L32: {
                            if (34 != param0) {
                              break L32;
                            } else {
                              ((ge) ((Object) var9)).m((byte) 124);
                              if (var14 == 0) {
                                break L29;
                              } else {
                                break L32;
                              }
                            }
                          }
                          ((ge) ((Object) var9)).d(var11, -96);
                          break L29;
                        }
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      L33: {
                        if (17 != var13) {
                          break L33;
                        } else {
                          if (var14 == 0) {
                            L34: {
                              L35: {
                                if (param4 == 65535) {
                                  break L35;
                                } else {
                                  if (-1 == param4) {
                                    break L35;
                                  } else {
                                    this.b(2, param5, param4, param2);
                                    if (var14 == 0) {
                                      break L34;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                              }
                              this.b(4, var7);
                              break L34;
                            }
                            return true;
                          } else {
                            break L33;
                          }
                        }
                      }
                      L36: {
                        if ((var13 ^ -1) != -12) {
                          break L36;
                        } else {
                          if (var14 == 0) {
                            this.field_m.field_a[param5] = this.field_m.a((byte) 32, param5, 500);
                            return true;
                          } else {
                            break L36;
                          }
                        }
                      }
                      if (-13 == (var13 ^ -1)) {
                        this.field_m.field_z[param5] = this.field_m.a((byte) 32, param5, 750);
                        return true;
                      } else {
                        L37: {
                          if (param3 <= -44) {
                            break L37;
                          } else {
                            this.b(19, 25, -67, 7);
                            break L37;
                          }
                        }
                        return false;
                      }
                    }
                  }
                }
              }
            }
            var11 = this.field_m.a((byte) 32, param5, 1000);
            this.b(param1, param2, var11, 11564, param4);
            return true;
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
        br var2_ref_br = null;
        int var2 = 0;
        nk var2_ref_nk = null;
        bf var2_ref_bf = null;
        Object var3 = null;
        br var3_ref = null;
        ce var3_ref2 = null;
        ce var4 = null;
        br var4_ref = null;
        ge var5 = null;
        int var6 = 0;
        pa var7 = null;
        qj var8 = null;
        ce var9 = null;
        sa var10 = null;
        pa var11 = null;
        qj var12 = null;
        boolean stackIn_6_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        br stackIn_38_0 = null;
        br stackIn_54_0 = null;
        nk stackIn_57_0 = null;
        Object stackIn_59_0 = null;
        bf stackIn_62_0 = null;
        Object stackIn_64_0 = null;
        boolean stackIn_73_0 = false;
        int stackIn_78_0 = 0;
        boolean stackIn_88_0 = false;
        boolean stackIn_94_0 = false;
        boolean stackIn_126_0 = false;
        int stackIn_135_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        boolean stackOut_5_0 = false;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_137_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_141_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        br stackOut_37_0 = null;
        br stackOut_53_0 = null;
        nk stackOut_56_0 = null;
        br stackOut_58_0 = null;
        bf stackOut_61_0 = null;
        br stackOut_63_0 = null;
        boolean stackOut_72_0 = false;
        int stackOut_77_0 = 0;
        boolean stackOut_87_0 = false;
        boolean stackOut_93_0 = false;
        boolean stackOut_128_0 = false;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (-4 == (this.field_m.field_l ^ -1)) {
          return;
        } else {
          this.field_m.field_H = this.field_m.field_H + 1;
          this.field_l = false;
          var2_ref_br = this.field_u.c(86);
          L0: while (true) {
            L1: {
              L2: {
                if (!(var2_ref_br instanceof ek)) {
                  break L2;
                } else {
                  stackOut_5_0 = var2_ref_br instanceof ge;
                  stackIn_11_0 = stackOut_5_0 ? 1 : 0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (!stackIn_6_0) {
                        break L3;
                      } else {
                        if (!((ge) ((Object) var2_ref_br)).p((byte) 53)) {
                          break L3;
                        } else {
                          this.field_l = true;
                          break L3;
                        }
                      }
                    }
                    var2_ref_br = this.field_u.b(param0 ^ -32726);
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L1;
            }
            var2 = stackIn_11_0;
            L4: while (true) {
              L5: {
                L6: {
                  L7: {
                    if ((this.field_m.field_a.length ^ -1) >= (var2 ^ -1)) {
                      break L7;
                    } else {
                      stackOut_13_0 = -1;
                      stackOut_13_1 = this.field_m.field_a[var2] ^ -1;
                      stackIn_139_0 = stackOut_13_0;
                      stackIn_139_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (var6 != 0) {
                        L8: while (true) {
                          if (stackIn_139_0 <= stackIn_139_1) {
                            break L6;
                          } else {
                            stackOut_137_0 = this.field_m.field_z[var2];
                            stackIn_28_0 = stackOut_137_0;
                            stackIn_138_0 = stackOut_137_0;
                            if (var6 != 0) {
                              break L5;
                            } else {
                              stackOut_138_0 = stackIn_138_0;
                              stackIn_135_0 = stackOut_138_0;
                              L9: {
                                L10: {
                                  if (stackIn_135_0 <= 0) {
                                    break L10;
                                  } else {
                                    this.field_m.field_z[var2] = this.field_m.field_z[var2] - 1;
                                    if (var6 == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                this.field_m.field_z[var2] = 0;
                                break L9;
                              }
                              var2++;
                              if (var6 == 0) {
                                stackOut_141_0 = var2 ^ -1;
                                stackOut_141_1 = this.field_m.field_z.length ^ -1;
                                stackIn_139_0 = stackOut_141_0;
                                stackIn_139_1 = stackOut_141_1;
                                continue L8;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      } else {
                        L11: {
                          L12: {
                            if (stackIn_14_0 <= stackIn_14_1) {
                              break L12;
                            } else {
                              this.field_m.field_a[var2] = this.field_m.field_a[var2] - 1;
                              if (var6 == 0) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          this.field_m.field_a[var2] = 0;
                          break L11;
                        }
                        var2++;
                        if (var6 == 0) {
                          continue L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  var2 = 0;
                  L13: while (true) {
                    if ((var2 ^ -1) <= (this.field_m.field_z.length ^ -1)) {
                      break L6;
                    } else {
                      stackOut_21_0 = this.field_m.field_z[var2];
                      stackIn_28_0 = stackOut_21_0;
                      stackIn_22_0 = stackOut_21_0;
                      if (var6 != 0) {
                        break L5;
                      } else {
                        L14: {
                          L15: {
                            if (stackIn_22_0 <= 0) {
                              break L15;
                            } else {
                              this.field_m.field_z[var2] = this.field_m.field_z[var2] - 1;
                              if (var6 == 0) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          this.field_m.field_z[var2] = 0;
                          break L14;
                        }
                        var2++;
                        if (var6 == 0) {
                          continue L13;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L5;
              }
              if (stackIn_28_0 != this.field_m.field_l) {
                var2 = 0;
                L16: while (true) {
                  L17: {
                    L18: {
                      if (var2 >= this.field_m.field_m.length) {
                        break L18;
                      } else {
                        this.field_m.field_m[var2] = 0;
                        var2++;
                        if (var6 != 0) {
                          break L17;
                        } else {
                          if (var6 == 0) {
                            continue L16;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    var2_ref_br = this.field_u.c(75);
                    L19: while (true) {
                      L20: {
                        L21: {
                          if (!(var2_ref_br instanceof ek)) {
                            break L21;
                          } else {
                            var3_ref = var2_ref_br.field_d;
                            ((ek) ((Object) var2_ref_br)).h(param0 ^ -32763);
                            stackOut_37_0 = (br) (var2_ref_br);
                            stackIn_54_0 = stackOut_37_0;
                            stackIn_38_0 = stackOut_37_0;
                            if (var6 != 0) {
                              break L20;
                            } else {
                              L22: {
                                if (!(stackIn_38_0 instanceof pa)) {
                                  break L22;
                                } else {
                                  L23: {
                                    var7 = (pa) ((Object) var2_ref_br);
                                    var11 = var7;
                                    if (!(var11 instanceof ge)) {
                                      break L23;
                                    } else {
                                      if (var11.field_Z) {
                                        break L23;
                                      } else {
                                        if (9 == var11.field_Q) {
                                          break L23;
                                        } else {
                                          if ((var11.field_Q ^ -1) != -22) {
                                            this.field_m.field_m[((ge) ((Object) var7)).field_gb] = this.field_m.field_m[((ge) ((Object) var7)).field_gb] + 1;
                                            break L23;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var11.field_S) {
                                    L24: {
                                      if (var11 instanceof ge) {
                                        var5 = (ge) ((Object) var11);
                                        if (!var5.field_eb) {
                                          break L24;
                                        } else {
                                          this.a(-2, var5);
                                          break L24;
                                        }
                                      } else {
                                        break L24;
                                      }
                                    }
                                    this.a(-2, var11);
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                              var2_ref_br = var3_ref;
                              if (var6 == 0) {
                                continue L19;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        stackOut_53_0 = this.field_n.c(127);
                        stackIn_54_0 = stackOut_53_0;
                        break L20;
                      }
                      var2_ref_nk = (nk) ((Object) stackIn_54_0);
                      L25: while (true) {
                        L26: {
                          L27: {
                            if (var2_ref_nk == null) {
                              break L27;
                            } else {
                              var2_ref_nk.a(param0 + 32843);
                              stackOut_56_0 = (nk) ((Object) this.field_n.b(param0 ^ -32726));
                              stackIn_59_0 = stackOut_56_0;
                              stackIn_57_0 = stackOut_56_0;
                              if (var6 != 0) {
                                break L26;
                              } else {
                                var2_ref_nk = stackIn_57_0;
                                if (var6 == 0) {
                                  continue L25;
                                } else {
                                  break L27;
                                }
                              }
                            }
                          }
                          stackOut_58_0 = this.field_m.field_A.c(param0 + 32810);
                          stackIn_59_0 = stackOut_58_0;
                          break L26;
                        }
                        var2_ref_bf = (bf) ((Object) stackIn_59_0);
                        L28: while (true) {
                          L29: {
                            L30: {
                              if (var2_ref_bf == null) {
                                break L30;
                              } else {
                                var2_ref_bf.c(0);
                                stackOut_61_0 = (bf) ((Object) this.field_m.field_A.b(6));
                                stackIn_64_0 = stackOut_61_0;
                                stackIn_62_0 = stackOut_61_0;
                                if (var6 != 0) {
                                  break L29;
                                } else {
                                  var2_ref_bf = stackIn_62_0;
                                  if (var6 == 0) {
                                    continue L28;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                            }
                            stackOut_63_0 = this.field_m.field_G.c(46);
                            stackIn_64_0 = stackOut_63_0;
                            break L29;
                          }
                          var10 = (sa) ((Object) stackIn_64_0);
                          L31: while (true) {
                            L32: {
                              if (var10 == null) {
                                break L32;
                              } else {
                                var10.c(-21);
                                var10 = (sa) ((Object) this.field_m.field_G.b(6));
                                if (var6 == 0) {
                                  continue L31;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            var2 = 0;
                            break L17;
                          }
                        }
                      }
                    }
                  }
                  L33: {
                    var3_ref = null;
                    if (param0 == -32724) {
                      break L33;
                    } else {
                      field_v = (byte[]) null;
                      break L33;
                    }
                  }
                  var4 = (ce) ((Object) this.field_m.field_s.c(param0 ^ -32670));
                  L34: while (true) {
                    L35: {
                      L36: {
                        if (var4 == null) {
                          break L36;
                        } else {
                          var3_ref2 = (ce) ((Object) this.field_m.field_s.b(6));
                          stackOut_72_0 = var4.d(-20232);
                          stackIn_78_0 = stackOut_72_0 ? 1 : 0;
                          stackIn_73_0 = stackOut_72_0;
                          if (var6 != 0) {
                            break L35;
                          } else {
                            L37: {
                              if (stackIn_73_0) {
                                var2 = 1;
                                break L37;
                              } else {
                                break L37;
                              }
                            }
                            var4 = var3_ref2;
                            if (var6 == 0) {
                              continue L34;
                            } else {
                              break L36;
                            }
                          }
                        }
                      }
                      stackOut_77_0 = var2;
                      stackIn_78_0 = stackOut_77_0;
                      break L35;
                    }
                    L38: {
                      L39: {
                        L40: {
                          L41: {
                            if (stackIn_78_0 == 0) {
                              break L41;
                            } else {
                              var9 = (ce) ((Object) this.field_m.field_s.c(45));
                              L42: while (true) {
                                L43: {
                                  L44: {
                                    if (var9 == null) {
                                      break L44;
                                    } else {
                                      var9.a((byte) -60);
                                      var9 = (ce) ((Object) this.field_m.field_s.b(param0 ^ -32726));
                                      if (var6 != 0) {
                                        break L43;
                                      } else {
                                        if (var6 == 0) {
                                          continue L42;
                                        } else {
                                          break L44;
                                        }
                                      }
                                    }
                                  }
                                  this.field_b.a(48);
                                  break L43;
                                }
                                var4_ref = this.field_u.c(99);
                                L45: while (true) {
                                  if (!(var4_ref instanceof ek)) {
                                    break L41;
                                  } else {
                                    stackOut_87_0 = var4_ref instanceof ge;
                                    stackIn_94_0 = stackOut_87_0;
                                    stackIn_88_0 = stackOut_87_0;
                                    if (var6 != 0) {
                                      L46: while (true) {
                                        if (stackIn_94_0) {
                                          break L38;
                                        } else {
                                          var8 = (qj) ((Object) this.field_e.g(50));
                                          var12 = var8;
                                          if (var6 != 0) {
                                            break L38;
                                          } else {
                                            if (var12.field_g > this.field_m.field_H) {
                                              break L39;
                                            } else {
                                              L47: {
                                                if (!this.b(var12.field_h, var12.field_q, var12.field_f, -84, var12.field_k, var12.field_n)) {
                                                  break L47;
                                                } else {
                                                  L48: {
                                                    if ((this.field_j[var8.field_n] ^ -1) != -256) {
                                                      break L48;
                                                    } else {
                                                      this.field_j[var8.field_n] = var8.field_q;
                                                      if (var6 == 0) {
                                                        break L47;
                                                      } else {
                                                        break L48;
                                                      }
                                                    }
                                                  }
                                                  if ((this.field_j[var8.field_n] ^ -1) == (var12.field_q ^ -1)) {
                                                    break L47;
                                                  } else {
                                                    this.field_j[var8.field_n] = -2;
                                                    break L47;
                                                  }
                                                }
                                              }
                                              if (var6 == 0) {
                                                if (var6 == 0) {
                                                  stackOut_93_0 = this.field_e.f(28113);
                                                  stackIn_94_0 = stackOut_93_0;
                                                  continue L46;
                                                } else {
                                                  break L40;
                                                }
                                              } else {
                                                break L39;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L49: {
                                        if (stackIn_88_0) {
                                          ((ge) ((Object) var4_ref)).j((byte) 82);
                                          break L49;
                                        } else {
                                          break L49;
                                        }
                                      }
                                      var4_ref = this.field_u.b(6);
                                      if (var6 == 0) {
                                        continue L45;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L50: while (true) {
                            stackOut_128_0 = this.field_e.f(28113);
                            stackIn_126_0 = stackOut_128_0;
                            if (stackIn_126_0) {
                              break L38;
                            } else {
                              var8 = (qj) ((Object) this.field_e.g(50));
                              var12 = var8;
                              if (var6 != 0) {
                                break L38;
                              } else {
                                if (var12.field_g > this.field_m.field_H) {
                                  break L39;
                                } else {
                                  L51: {
                                    if (!this.b(var12.field_h, var12.field_q, var12.field_f, -84, var12.field_k, var12.field_n)) {
                                      break L51;
                                    } else {
                                      L52: {
                                        if ((this.field_j[var8.field_n] ^ -1) != -256) {
                                          break L52;
                                        } else {
                                          this.field_j[var8.field_n] = var8.field_q;
                                          if (var6 == 0) {
                                            break L51;
                                          } else {
                                            break L52;
                                          }
                                        }
                                      }
                                      if ((this.field_j[var8.field_n] ^ -1) == (var12.field_q ^ -1)) {
                                        break L51;
                                      } else {
                                        this.field_j[var8.field_n] = -2;
                                        break L51;
                                      }
                                    }
                                  }
                                  if (var6 == 0) {
                                    if (var6 == 0) {
                                      continue L50;
                                    } else {
                                      break L40;
                                    }
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                            }
                          }
                        }
                        break L38;
                      }
                      this.field_e.a(-25612, var12);
                      break L38;
                    }
                    return;
                  }
                }
              } else {
                return;
              }
            }
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        ce var6 = null;
        ek var7 = null;
        int var9 = 0;
        ge var10 = null;
        lm var11 = null;
        ce stackIn_3_0 = null;
        ce stackIn_3_1 = null;
        fh stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        int stackIn_3_5 = 0;
        ce stackIn_4_0 = null;
        ce stackIn_4_1 = null;
        fh stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_4_5 = 0;
        ce stackIn_5_0 = null;
        ce stackIn_5_1 = null;
        fh stackIn_5_2 = null;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        int stackIn_5_6 = 0;
        ce stackOut_2_0 = null;
        ce stackOut_2_1 = null;
        fh stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        int stackOut_2_5 = 0;
        ce stackOut_4_0 = null;
        ce stackOut_4_1 = null;
        fh stackOut_4_2 = null;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_4_6 = 0;
        ce stackOut_3_0 = null;
        ce stackOut_3_1 = null;
        fh stackOut_3_2 = null;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        int stackOut_3_5 = 0;
        int stackOut_3_6 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param3 == 11564) {
          L0: {
            stackOut_2_0 = null;
            stackOut_2_1 = null;
            stackOut_2_2 = this.field_b;
            stackOut_2_3 = param1;
            stackOut_2_4 = param4;
            stackOut_2_5 = param2;
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_4_2 = stackOut_2_2;
            stackIn_4_3 = stackOut_2_3;
            stackIn_4_4 = stackOut_2_4;
            stackIn_4_5 = stackOut_2_5;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            stackIn_3_5 = stackOut_2_5;
            if (9 != param0) {
              stackOut_4_0 = null;
              stackOut_4_1 = null;
              stackOut_4_2 = (fh) ((Object) stackIn_4_2);
              stackOut_4_3 = stackIn_4_3;
              stackOut_4_4 = stackIn_4_4;
              stackOut_4_5 = stackIn_4_5;
              stackOut_4_6 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              stackIn_5_4 = stackOut_4_4;
              stackIn_5_5 = stackOut_4_5;
              stackIn_5_6 = stackOut_4_6;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackOut_3_1 = null;
              stackOut_3_2 = (fh) ((Object) stackIn_3_2);
              stackOut_3_3 = stackIn_3_3;
              stackOut_3_4 = stackIn_3_4;
              stackOut_3_5 = stackIn_3_5;
              stackOut_3_6 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              stackIn_5_3 = stackOut_3_3;
              stackIn_5_4 = stackOut_3_4;
              stackIn_5_5 = stackOut_3_5;
              stackIn_5_6 = stackOut_3_6;
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
                  if (var9 != 0) {
                    break L1;
                  } else {
                    L3: {
                      L4: {
                        if (!(var7 instanceof ge)) {
                          break L4;
                        } else {
                          L5: {
                            var10 = (ge) ((Object) var7);
                            if (var6.a(var10.e((byte) -112), var10.g(1829947600), -1)) {
                              var10.d(200, -124);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      if (var7 instanceof lm) {
                        var11 = (lm) ((Object) var7);
                        if (var6.a(var11.e((byte) -112), var11.g(1829947600), -1)) {
                          var11.a(200, true);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var7 = (ek) ((Object) this.field_u.b(6));
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
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
        RuntimeException var3 = null;
        sh var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ge var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!param0.field_Z) {
              if (param1 == 105) {
                var3_ref = (sh) ((Object) this.field_f.c(64));
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var3_ref == null) {
                        break L3;
                      } else {
                        var4 = var3_ref.field_C - param0.field_C;
                        stackOut_9_0 = -1;
                        stackIn_29_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var7 != 0) {
                          break L2;
                        } else {
                          L4: {
                            if (stackIn_10_0 > var4) {
                              break L4;
                            } else {
                              if (1 < var4) {
                                break L4;
                              } else {
                                var4 = -param0.field_B + var3_ref.field_B;
                                if (0 < (var4 ^ -1)) {
                                  break L4;
                                } else {
                                  if (1 < var4) {
                                    break L4;
                                  } else {
                                    if (var3_ref.a(param0, param1 + -84)) {
                                      L5: {
                                        L6: {
                                          this.a(-7737, ak.a(var3_ref.field_O, (byte) -111, this.field_m.field_H, param0.field_x));
                                          if (param0 instanceof lm) {
                                            break L6;
                                          } else {
                                            L7: {
                                              var6 = (ge) ((Object) param0);
                                              var5 = 4;
                                              var6.t(4);
                                              this.field_i[var3_ref.field_O] = this.field_i[var3_ref.field_O] + 1;
                                              this.field_m.field_J[var3_ref.field_O] = this.field_m.field_J[var3_ref.field_O] + 1;
                                              if (this.field_m.b((byte) -122, 53, var3_ref.field_O)) {
                                                var5 = var5 + var5 / 2;
                                                break L7;
                                              } else {
                                                break L7;
                                              }
                                            }
                                            if (var7 == 0) {
                                              break L5;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                        L8: {
                                          this.field_m.c(-118);
                                          var5 = 10;
                                          this.field_g[var3_ref.field_O] = this.field_g[var3_ref.field_O] + 1;
                                          if (!((lm) ((Object) param0)).field_hb) {
                                            break L8;
                                          } else {
                                            this.field_k[var3_ref.field_O] = cr.b(this.field_k[var3_ref.field_O], 4);
                                            break L8;
                                          }
                                        }
                                        this.field_m.field_J[var3_ref.field_O] = this.field_m.field_J[var3_ref.field_O] + 3;
                                        if (!this.field_m.b((byte) -99, 60, var3_ref.field_O)) {
                                          break L5;
                                        } else {
                                          var5 = var5 + var5 / 2;
                                          break L5;
                                        }
                                      }
                                      this.field_m.field_d[var3_ref.field_O] = this.field_m.field_d[var3_ref.field_O] + var5;
                                      this.field_m.a(param1 + -233, param0);
                                      stackOut_25_0 = 1;
                                      stackIn_26_0 = stackOut_25_0;
                                      decompiledRegionSelector0 = 3;
                                      break L0;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var3_ref = (sh) ((Object) this.field_f.b(6));
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var3);
            stackOut_30_1 = new StringBuilder().append("rl.AA(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_29_0 != 0;
            } else {
              return stackIn_26_0 != 0;
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
        boolean discarded$1 = false;
        int[] var7 = null;
        int var8 = 0;
        br var9_ref_br = null;
        int var9 = 0;
        pa var10 = null;
        int var11 = 0;
        int var12 = 0;
        ge var13 = null;
        int var14 = 0;
        pa[] var15 = null;
        Object var16 = null;
        pa var16_ref = null;
        int[] var17 = null;
        pa var18 = null;
        pa[] var19 = null;
        int[] var20 = null;
        boolean stackIn_5_0 = false;
        int stackIn_23_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_22_0 = 0;
        L0: {
          var16 = null;
          var14 = ZombieDawnMulti.field_E ? 1 : 0;
          g.field_a.setSeed((long)((param4 << -161772635) + param3 + param2));
          var15 = new pa[this.field_u.a(0)];
          var19 = var15;
          var20 = new int[this.field_u.a(0)];
          var17 = var20;
          var7 = var17;
          d.a(var7, 0, var20.length, 32767);
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
          L2: {
            L3: {
              if (!(var9_ref_br instanceof ek)) {
                break L3;
              } else {
                stackOut_4_0 = var9_ref_br instanceof pa;
                stackIn_23_0 = stackOut_4_0 ? 1 : 0;
                stackIn_5_0 = stackOut_4_0;
                if (var14 != 0) {
                  break L2;
                } else {
                  L4: {
                    L5: {
                      if (stackIn_5_0) {
                        break L5;
                      } else {
                        if (var14 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      var16_ref = (pa) ((Object) var9_ref_br);
                      var18 = var16_ref;
                      var11 = var18.e((byte) -112) + -param3;
                      var12 = -param4 + var18.g(1829947600);
                      if (-14401 <= (var11 * var11 - -(var12 * var12) ^ -1)) {
                        break L6;
                      } else {
                        if (var14 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      L8: {
                        if (!param0) {
                          break L8;
                        } else {
                          if (var18 instanceof ge) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (!(var18 instanceof lm)) {
                        break L4;
                      } else {
                        var15[var8] = var16_ref;
                        var7[var8] = var16_ref.field_x;
                        var8++;
                        if (var14 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L9: {
                      var13 = (ge) ((Object) var18);
                      if (var13.field_gb != param2) {
                        break L9;
                      } else {
                        if (var14 == 0) {
                          break L4;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var15[var8] = (pa) ((Object) var13);
                    var7[var8] = var13.field_x;
                    var8++;
                    break L4;
                  }
                  var9_ref_br = this.field_u.b(6);
                  if (var14 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            vh.a(-7255, var20, var19);
            stackOut_22_0 = 0;
            stackIn_23_0 = stackOut_22_0;
            break L2;
          }
          var9 = stackIn_23_0;
          L10: while (true) {
            L11: {
              if (var8 <= var9) {
                break L11;
              } else {
                var10 = var15[var9];
                if (var14 != 0) {
                  break L11;
                } else {
                  L12: {
                    L13: {
                      if (!(var10 instanceof ge)) {
                        break L13;
                      } else {
                        if (this.field_m.b(0, ((ge) ((Object) var10)).field_gb)) {
                          this.a((byte) 100, (ge) ((Object) var10));
                          if (var14 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    discarded$1 = var15[var9].b(param2, -50);
                    break L12;
                  }
                  var9++;
                  if (var14 == 0) {
                    continue L10;
                  } else {
                    break L11;
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        Object var5 = null;
        br var5_ref = null;
        bf var6_ref_bf = null;
        int var6 = 0;
        br var6_ref_br = null;
        int var7 = 0;
        og var7_ref_og = null;
        int var8 = 0;
        int var9 = 0;
        ge var10 = null;
        sa var11 = null;
        ce var12 = null;
        bf stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        boolean stackIn_10_0 = false;
        boolean stackIn_17_0 = false;
        boolean stackIn_24_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        bf stackOut_2_0 = null;
        br stackOut_6_0 = null;
        boolean stackOut_9_0 = false;
        boolean stackOut_16_0 = false;
        boolean stackOut_23_0 = false;
        int stackOut_30_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_55_0 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        var5 = null;
        var6_ref_bf = (bf) ((Object) this.field_m.field_A.c(64));
        L0: while (true) {
          L1: {
            L2: {
              if (var6_ref_bf == null) {
                break L2;
              } else {
                stackOut_2_0 = (bf) (var6_ref_bf);
                stackIn_7_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var9 != 0) {
                  break L1;
                } else {
                  if (!((bf) (Object) stackIn_3_0).a(param3, param2, (byte) 29)) {
                    var6_ref_bf = (bf) ((Object) this.field_m.field_A.b(6));
                    if (var9 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    var6_ref_bf.a(-98);
                    return;
                  }
                }
              }
            }
            stackOut_6_0 = this.field_m.field_G.c(109);
            stackIn_7_0 = stackOut_6_0;
            break L1;
          }
          var11 = (sa) ((Object) stackIn_7_0);
          L3: while (true) {
            L4: {
              L5: {
                if (var11 == null) {
                  break L5;
                } else {
                  var5_ref = this.field_m.field_G.b(6);
                  stackOut_9_0 = var11.a(param3, param0 + 17308, param2);
                  stackIn_31_0 = stackOut_9_0 ? 1 : 0;
                  stackIn_10_0 = stackOut_9_0;
                  if (var9 != 0) {
                    break L4;
                  } else {
                    if (stackIn_10_0) {
                      var11.d(-110);
                      var11.a(true);
                      return;
                    } else {
                      var11 = (sa) ((Object) var5_ref);
                      if (var9 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              var12 = (ce) ((Object) this.field_m.field_s.c(98));
              L6: while (true) {
                L7: {
                  if (var12 == null) {
                    break L7;
                  } else {
                    var5_ref = this.field_m.field_s.b(6);
                    stackOut_16_0 = var12.a(param3, param2, -1);
                    stackIn_31_0 = stackOut_16_0 ? 1 : 0;
                    stackIn_17_0 = stackOut_16_0;
                    if (var9 != 0) {
                      break L4;
                    } else {
                      L8: {
                        if (!stackIn_17_0) {
                          break L8;
                        } else {
                          var12.c(param0 + -28190);
                          if (var9 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var12 = (ce) ((Object) var5_ref);
                      if (var9 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                var6_ref_br = this.field_m.field_K.c(85);
                L9: while (true) {
                  L10: {
                    if (var6_ref_br == null) {
                      break L10;
                    } else {
                      stackOut_23_0 = var6_ref_br instanceof og;
                      stackIn_31_0 = stackOut_23_0 ? 1 : 0;
                      stackIn_24_0 = stackOut_23_0;
                      if (var9 != 0) {
                        break L4;
                      } else {
                        L11: {
                          if (stackIn_24_0) {
                            var7_ref_og = (og) ((Object) var6_ref_br);
                            if (var7_ref_og.b(param2, param3, param0 + -120)) {
                              var7_ref_og.field_R = 1;
                              break L11;
                            } else {
                              break L11;
                            }
                          } else {
                            break L11;
                          }
                        }
                        var6_ref_br = this.field_m.field_K.b(param0 + 4);
                        if (var9 == 0) {
                          continue L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L4;
                }
              }
            }
            var6 = stackIn_31_0;
            var7 = 0;
            L12: while (true) {
              L13: {
                L14: {
                  if ((var7 ^ -1) <= (this.field_m.field_a.length ^ -1)) {
                    break L14;
                  } else {
                    stackOut_33_0 = var6;
                    stackIn_41_0 = stackOut_33_0;
                    stackIn_34_0 = stackOut_33_0;
                    if (var9 != 0) {
                      break L13;
                    } else {
                      L15: {
                        L16: {
                          if (stackIn_34_0 != 0) {
                            break L16;
                          } else {
                            if (-1 <= (this.field_m.field_a[var7] ^ -1)) {
                              stackOut_38_0 = 0;
                              stackIn_39_0 = stackOut_38_0;
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        stackOut_37_0 = 1;
                        stackIn_39_0 = stackOut_37_0;
                        break L15;
                      }
                      var6 = stackIn_39_0;
                      this.field_m.field_a[var7] = 0;
                      var7++;
                      if (var9 == 0) {
                        continue L12;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
                stackOut_40_0 = var6;
                stackIn_41_0 = stackOut_40_0;
                break L13;
              }
              if (stackIn_41_0 != 0) {
                return;
              } else {
                L17: {
                  var7 = 0;
                  if (param0 == 2) {
                    break L17;
                  } else {
                    var10 = (ge) null;
                    this.a((lm) null, (ge) null, -111, -126, (byte) -27);
                    break L17;
                  }
                }
                var8 = 0;
                L18: while (true) {
                  L19: {
                    L20: {
                      if (this.field_m.field_z.length <= var8) {
                        break L20;
                      } else {
                        stackOut_48_0 = var7;
                        stackIn_56_0 = stackOut_48_0;
                        stackIn_49_0 = stackOut_48_0;
                        if (var9 != 0) {
                          break L19;
                        } else {
                          L21: {
                            L22: {
                              if (stackIn_49_0 != 0) {
                                break L22;
                              } else {
                                if (0 >= this.field_m.field_z[var8]) {
                                  stackOut_53_0 = 0;
                                  stackIn_54_0 = stackOut_53_0;
                                  break L21;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            stackOut_52_0 = 1;
                            stackIn_54_0 = stackOut_52_0;
                            break L21;
                          }
                          var7 = stackIn_54_0;
                          this.field_m.field_z[var8] = 0;
                          var8++;
                          if (var9 == 0) {
                            continue L18;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    stackOut_55_0 = var7;
                    stackIn_56_0 = stackOut_55_0;
                    break L19;
                  }
                  if (stackIn_56_0 == 0) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, ge param1, ge param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
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
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
            stackOut_6_0 = (RuntimeException) (runtimeException);
            stackOut_6_1 = new StringBuilder().append("rl.R(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        br var8_ref_br = null;
        lm var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        hk var13 = null;
        hk var14 = null;
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
            if ((var8 ^ -1) == -1) {
              var8_ref_br = this.field_u.c(85);
              L2: while (true) {
                if (var8_ref_br == null) {
                  break L1;
                } else {
                  if (var12 != 0) {
                    break L1;
                  } else {
                    L3: {
                      L4: {
                        if (var8_ref_br instanceof lm) {
                          L5: {
                            var9 = (lm) ((Object) var8_ref_br);
                            if (!var9.field_Z) {
                              break L5;
                            } else {
                              if (var12 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            var10 = -param5 + var9.e((byte) -112);
                            var11 = -param3 + var9.g(1829947600);
                            if ((var10 * var10 + var11 * var11 ^ -1) <= -4001) {
                              break L6;
                            } else {
                              if (var12 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var9.field_G = param5 << 68571088;
                          var9.field_E = param3 << -956133712;
                          var9.field_S = true;
                          System.out.println("moving human oid " + var9.field_x);
                          if (var12 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var8_ref_br = this.field_u.b(6);
                      if (var12 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                    break L1;
                  }
                }
              }
            } else {
              L7: {
                L8: {
                  if (var8 == 1) {
                    this.field_m.field_d[param0] = 100;
                    this.field_m.field_d[(param0 - -1) % this.field_m.field_t] = 25;
                    this.field_m.field_H = 6000;
                    this.a(false, 2);
                    this.field_m.field_C = this.field_m.field_H - -1;
                    if (var12 == 0) {
                      break L1;
                    } else {
                      break L8;
                    }
                  } else {
                    L9: {
                      if (var8 != 3) {
                        break L9;
                      } else {
                        if (var12 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (2 == var8) {
                      break L7;
                    } else {
                      break L1;
                    }
                  }
                }
                this.a(false, param5);
                if (var12 == 0) {
                  break L1;
                } else {
                  break L7;
                }
              }
              var13 = this.field_d[param2];
              var14 = var13;
              var8 = 0;
              L10: while (true) {
                if ((var14.field_b.length ^ -1) >= (var8 ^ -1)) {
                  break L1;
                } else {
                  var13.field_b[var8] = 0;
                  var8++;
                  if (var12 != 0) {
                    break L1;
                  } else {
                    if (var12 == 0) {
                      continue L10;
                    } else {
                      break L1;
                    }
                  }
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
        ge var7 = null;
        ge stackIn_12_0 = null;
        ge stackIn_13_0 = null;
        ge stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ge stackOut_11_0 = null;
        ge stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ge stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        var7 = this.b((byte) 117, param3);
        if (var7 == null) {
          return false;
        } else {
          if (param0 == var7.field_gb) {
            if (21 == var7.field_Q) {
              return true;
            } else {
              if (!param4) {
                L0: {
                  L1: {
                    if (var7.field_lb) {
                      break L1;
                    } else {
                      L2: {
                        stackOut_11_0 = (ge) (var7);
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (param4) {
                          stackOut_13_0 = (ge) ((Object) stackIn_13_0);
                          stackOut_13_1 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          break L2;
                        } else {
                          stackOut_12_0 = (ge) ((Object) stackIn_12_0);
                          stackOut_12_1 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          break L2;
                        }
                      }
                      ((ge) (Object) stackIn_14_0).a(stackIn_14_1 != 0, this.field_b.b(var7.e((byte) -112), param2, var7.g(1829947600), param1, 8760));
                      if (!ZombieDawnMulti.field_E) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var7.field_G = param1 << 1544547728;
                  var7.field_E = param2 << -477061392;
                  var7.a(33, (byte) -89);
                  var7.field_ab = param2;
                  var7.field_N = param1;
                  break L0;
                }
                this.a(-2, (pa) (var7));
                return true;
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        }
    }

    rl(kb param0, hk[] param1, boolean param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        ek var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
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
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param2) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
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
              L3: {
                L4: {
                  if (var7 == null) {
                    break L4;
                  } else {
                    var7.a(-9019, (rl) (this));
                    var7 = (ek) ((Object) this.field_u.b(6));
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.field_m.field_l = 0;
                break L3;
              }
              var5_int = 0;
              L5: while (true) {
                L6: {
                  if ((var5_int ^ -1) <= (this.field_j.length ^ -1)) {
                    break L6;
                  } else {
                    this.field_j[var5_int] = 255;
                    var5_int++;
                    if (var6 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      if (var6 == 0) {
                        continue L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("rl.<init>(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          L8: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_c = "Real-life threats";
    }
}
