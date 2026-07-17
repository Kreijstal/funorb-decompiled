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
            var10 = ((rl) this).field_d[param2];
            var11 = var10;
            if (param3 < 0) {
              break L0;
            } else {
              if (var11.field_d.length <= param3) {
                break L0;
              } else {
                if (255 == var10.field_d[param3]) {
                  break L0;
                } else {
                  if (var10.field_b[param3] > ((rl) this).field_m.field_H) {
                    L1: {
                      if (1000 + ((rl) this).field_m.field_H < var10.field_b[param3]) {
                        this.a((byte) -118, "powerup not ready", ((rl) this).field_m.field_H + ": " + param2 + " tried to use a powerup slot that's not ready yet: " + param3 + " is due " + var10.field_b[param3]);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    return;
                  } else {
                    var7 = var10.field_d[param3];
                    var8 = var10.field_f[param3];
                    var9 = new qj(((rl) this).field_m.field_H + 50, param2, var7, var8, param4, param0);
                    ((rl) this).field_e.a((br) (Object) var9, false);
                    this.a(-7737, (ae) (Object) rm.a(((rl) this).field_m.field_H, param4, param0, var7, var8, param2, param1 ^ -13113, param4));
                    var11.field_b[param3] = ((rl) this).field_m.field_H + ((rl) this).field_m.a(var8, var7, param2, false);
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
            return;
        }
    }

    final void a(int param0, ge param1, int param2, lm param3) {
        int var5_int = param3.e((byte) -112);
        int var6 = param3.g(param2 + 1829980022);
        ge var7 = new ge(var5_int, var6, param3.k((byte) 121));
        if (param2 != -32422) {
            return;
        }
        try {
            var7.field_A = (rl) this;
            var7.field_x = ((rl) this).field_m.a(param2 + -16744794);
            var7.field_gb = param0;
            ((rl) this).field_m.field_d[var7.field_gb] = ((rl) this).field_m.field_d[var7.field_gb] + param3.o(-116);
            ((rl) this).field_u.a((br) (Object) var7, false);
            this.a(param3, var7, param1, false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "rl.J(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
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
        field_v = null;
    }

    private final void a(int param0, ge param1) {
        pc var3 = null;
        if (param0 != -2) {
            ((rl) this).field_j = null;
        }
        param1.field_eb = false;
        if (param1.field_Z) {
            return;
        }
        try {
            var3 = aq.a(((rl) this).field_m.field_H, false, param1.field_tb.field_x, param1.field_x);
            this.a(param0 + -7735, (ae) (Object) var3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "rl.Q(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
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
              var3 = ((rl) this).a(true, param1.field_C, param1.field_B);
              if (var3 == null) {
                break L2;
              } else {
                var3.a((ff) (Object) param1, true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("rl.F(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final c a(boolean param0, int param1, int param2) {
        if (!param0) {
            return null;
        }
        if (((rl) this).field_s[0].length < param1) {
            return null;
        }
        if (param2 > ((rl) this).field_s.length) {
            return null;
        }
        if (param2 < 0) {
            return null;
        }
        if (0 > param1) {
            return null;
        }
        if (!(null != ((rl) this).field_s[param2][param1])) {
            ((rl) this).field_s[param2][param1] = new c();
        }
        return ((rl) this).field_s[param2][param1];
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
              if (!(var4 instanceof ge)) {
                if (!(var4 instanceof lm)) {
                  break L0;
                } else {
                  var5 = (lm) (Object) var4;
                  var5.n((byte) -100);
                  break L0;
                }
              } else {
                var3 = (ge) (Object) var4;
                var3.f(true);
                var3.t(4);
                var3.r((byte) -111);
                if (var3.field_Q == 29) {
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
                ((rl) this).field_l = false;
            }
            ((rl) this).field_n.a((br) (Object) new nk(param1, param1.e((byte) -112), param1.g(1829947600), param2), false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "rl.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
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
                ((rl) this).field_s = null;
            }
            var3 = ng.a(param1.field_N, param0 ^ -101, param1.field_Q, param1.field_x, param1.field_G, ((rl) this).field_m.field_H, param1.field_E, param1.field_db, param1.field_ab);
            this.a(-7737, (ae) (Object) var3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "rl.M(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
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
            field_v = null;
        }
        return (pa) (Object) var3;
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
        kb stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        kb stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        kb stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        kb stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        kb stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        kb stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          var3 = ((rl) this).field_m.field_l;
          if (var3 == 0) {
            L1: {
              if (((rl) this).field_m.field_H >= 400) {
                break L1;
              } else {
                if (((rl) this).field_m.field_t != 1) {
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
              if (var3 == 1) {
                if (df.field_I) {
                  if (((rl) this).field_m.field_m[0] == 0) {
                    if (!pp.field_n) {
                      break L2;
                    } else {
                      if (11 != hg.field_rb) {
                        var9 = new ge(hc.field_c, gk.field_c, 0);
                        var9.a(-9019, (rl) this);
                        var9.field_gb = 0;
                        var9.field_x = ((rl) this).field_m.a(-16777216);
                        ((rl) this).field_m.field_K.a(-25612, (br) (Object) var9);
                        var9.field_S = true;
                        op.field_m.field_f = var9.field_x;
                        var10 = new ge(hc.field_c, -30 + gk.field_c, 1);
                        var10.a(-9019, (rl) this);
                        var10.field_gb = 0;
                        var10.field_x = ((rl) this).field_m.a(-16777216);
                        ((rl) this).field_m.field_K.a(-25612, (br) (Object) var10);
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
                  if (((rl) this).field_m.field_H % 32 != 0) {
                    break L2;
                  } else {
                    var3 = ((rl) this).field_m.field_t;
                    var15 = ((rl) this).field_m.field_m;
                    var5 = 0;
                    L3: while (true) {
                      if (~var5 <= ~var15.length) {
                        L4: {
                          L5: {
                            if (var3 == 0) {
                              break L5;
                            } else {
                              if (4500 >= ((rl) this).field_m.field_H) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (~(((rl) this).field_m.field_I / 8) <= ~((rl) this).field_m.field_g) {
                              break L6;
                            } else {
                              if (~((rl) this).field_m.field_H <= ~(((rl) this).field_m.field_C + -3000)) {
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
                        L7: {
                          var6 = var15[var5];
                          if (0 != var6) {
                            break L7;
                          } else {
                            var3--;
                            break L7;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                if (var3 == 2) {
                  var2 = ((rl) this).field_m.field_t;
                  var16 = ((rl) this).field_m.field_m;
                  var4 = 0;
                  L8: while (true) {
                    if (~var4 <= ~var16.length) {
                      L9: {
                        if (var2 == 0) {
                          break L9;
                        } else {
                          if (~((rl) this).field_m.field_C < ~((rl) this).field_m.field_H) {
                            break L2;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var3 = 0;
                      var4 = 0;
                      var5 = 1;
                      L10: while (true) {
                        if (~var5 <= ~((rl) this).field_m.field_d.length) {
                          L11: {
                            stackOut_46_0 = ((rl) this).field_m;
                            stackOut_46_1 = -110;
                            stackIn_48_0 = stackOut_46_0;
                            stackIn_48_1 = stackOut_46_1;
                            stackIn_47_0 = stackOut_46_0;
                            stackIn_47_1 = stackOut_46_1;
                            if (var4 == 0) {
                              stackOut_48_0 = (kb) (Object) stackIn_48_0;
                              stackOut_48_1 = stackIn_48_1;
                              stackOut_48_2 = var3;
                              stackIn_49_0 = stackOut_48_0;
                              stackIn_49_1 = stackOut_48_1;
                              stackIn_49_2 = stackOut_48_2;
                              break L11;
                            } else {
                              stackOut_47_0 = (kb) (Object) stackIn_47_0;
                              stackOut_47_1 = stackIn_47_1;
                              stackOut_47_2 = -1;
                              stackIn_49_0 = stackOut_47_0;
                              stackIn_49_1 = stackOut_47_1;
                              stackIn_49_2 = stackOut_47_2;
                              break L11;
                            }
                          }
                          ((kb) (Object) stackIn_49_0).a((byte) stackIn_49_1, stackIn_49_2);
                          this.a(false, 3);
                          break L2;
                        } else {
                          L12: {
                            if (((rl) this).field_m.field_d[var5] != ((rl) this).field_m.field_d[var3]) {
                              if (((rl) this).field_m.field_d[var5] <= ((rl) this).field_m.field_d[var3]) {
                                break L12;
                              } else {
                                var3 = var5;
                                var4 = 0;
                                break L12;
                              }
                            } else {
                              var4 = 1;
                              break L12;
                            }
                          }
                          var5++;
                          continue L10;
                        }
                      }
                    } else {
                      L13: {
                        var5 = var16[var4];
                        if (var5 != 0) {
                          break L13;
                        } else {
                          var2--;
                          break L13;
                        }
                      }
                      var4++;
                      continue L8;
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
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        md var4_ref_md = null;
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
        md var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              ak.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
              var1_int = vn.field_c.length;
              if (param0 >= 101) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L2: while (true) {
              if (var3 >= var1_int) {
                L3: {
                  var3 = ak.field_a[9] >> 8;
                  var4 = ak.field_a[10] >> 8;
                  var5 = ak.field_a[11] >> 8;
                  var6 = f.field_a << 4;
                  var7 = 0;
                  var8 = on.a(var6, -18924) >> 8;
                  var9 = wn.a(-126, var6) >> 8;
                  if (bd.field_g == -1) {
                    break L3;
                  } else {
                    if (bo.field_d != -1) {
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
                        L7: {
                          if (var23[var16] >= var23[var17_int]) {
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var17_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var4_ref_md = vn.field_c[var3];
                var4_ref_md.a((byte) -81);
                c.a(var3, (byte) 75);
                var5 = var4_ref_md.field_D + var4_ref_md.field_C >> 1;
                var6 = var4_ref_md.field_G + var4_ref_md.field_l >> 1;
                var7 = var4_ref_md.field_j + var4_ref_md.field_r >> 1;
                var8 = ak.field_a[9] >> 2;
                var9 = ak.field_a[10] >> 2;
                var10_int = ak.field_a[11] >> 2;
                var11 = hl.field_c[4] * var9 + var8 * hl.field_c[3] - -(var10_int * hl.field_c[5]) >> 14;
                var12 = var9 * hl.field_c[7] + hl.field_c[6] * var8 - -(hl.field_c[8] * var10_int) >> 14;
                var13 = var10_int * hl.field_c[11] + hl.field_c[10] * var9 + hl.field_c[9] * var8 >> 14;
                var2[var3] = var7 * var13 + (var12 * var6 + var11 * var5) >> 16;
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "rl.T(" + param0 + 41);
        }
    }

    private final void a(int param0, ae param1) {
        ae var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!((rl) this).field_q.f(param0 + 35850)) {
              var3 = (ae) (Object) ((rl) this).field_q.a((byte) 76);
              L1: while (true) {
                if (var3 == null) {
                  L2: {
                    ((rl) this).field_q.a(-25612, (br) (Object) param1);
                    if (param0 == -7737) {
                      break L2;
                    } else {
                      ((rl) this).field_d = null;
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  if (param1.field_f >= var3.field_f) {
                    qc.a((br) (Object) param1, (br) (Object) var3, 0);
                    return;
                  } else {
                    var3 = (ae) (Object) ((rl) this).field_q.c((byte) 123);
                    continue L1;
                  }
                }
              }
            } else {
              ((rl) this).field_q.a(param0 ^ 31283, (br) (Object) param1);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("rl.CA(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
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
        int var16 = 0;
        th var17 = null;
        sh var18 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            ((rl) this).field_b = new fh(param2);
            ((rl) this).field_s = new c[(((rl) this).field_b.field_c >> 7) + 1][1 + (((rl) this).field_b.field_r >> 7)];
            ((rl) this).field_m.field_H = 0;
            ip.b((byte) 97);
            ((rl) this).field_n = new th();
            ((rl) this).field_f = new th();
            ((rl) this).field_e = new th();
            var17 = param2.a(91);
            var5_ref_ek = (ek) (Object) var17.c(78);
            L1: while (true) {
              if (var5_ref_ek == null) {
                L2: {
                  ((rl) this).field_m.field_I = 0;
                  var5 = 2 * ((rl) this).field_m.field_t;
                  var6 = null;
                  var7 = null;
                  if (!param0) {
                    break L2;
                  } else {
                    var7 = (Object) (Object) new ek[var5];
                    var6 = (Object) (Object) new int[var5];
                    break L2;
                  }
                }
                if (param1 == -6) {
                  var8_ref_ek = (ek) (Object) ((rl) this).field_u.c(123);
                  L3: while (true) {
                    if (var8_ref_ek == null) {
                      L4: {
                        if (!param0) {
                          break L4;
                        } else {
                          var8 = 0;
                          L5: while (true) {
                            if (((Object[]) var7).length <= var8) {
                              break L4;
                            } else {
                              L6: {
                                if (null == ((Object[]) var7)[var8]) {
                                  break L6;
                                } else {
                                  ((lm) ((Object[]) var7)[var8]).p(95);
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
                        ((rl) this).field_m.field_g = ((rl) this).field_m.field_I;
                        ((rl) this).field_m.field_C = 9000 + 250 * ((rl) this).field_m.field_I;
                        if (((rl) this).field_m.field_t != 1) {
                          break L7;
                        } else {
                          ((rl) this).field_m.field_C = 64512;
                          break L7;
                        }
                      }
                      L8: {
                        if (64512 >= ((rl) this).field_m.field_C) {
                          break L8;
                        } else {
                          ((rl) this).field_m.field_C = 64512;
                          break L8;
                        }
                      }
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
                          ((rl) this).field_m.field_I = ((rl) this).field_m.field_I + 1;
                          if (!param0) {
                            break L9;
                          } else {
                            var9 = 2147483647;
                            var10 = (Object) (Object) (sh) (Object) ((rl) this).field_f.c(73);
                            L10: while (true) {
                              if (var10 == null) {
                                var10 = var10;
                                var16 = 0;
                                var11 = var16;
                                L11: while (true) {
                                  if (var16 >= ((Object[]) var6).length) {
                                    break L9;
                                  } else {
                                    L12: {
                                      if (var9 > ((int[]) var6)[var16]) {
                                        var12 = ((Object[]) var7)[var16];
                                        var13 = ((int[]) var6)[var16];
                                        ((int[]) var6)[var16] = var9;
                                        var9 = var13;
                                        ((Object[]) var7)[var16] = var10;
                                        var10 = var12;
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    var16++;
                                    continue L11;
                                  }
                                }
                              } else {
                                L13: {
                                  var11 = ((sh) var10).e((byte) -112) - var8_ref_ek.e((byte) -112);
                                  var12_int = ((sh) var10).g(1829947600) - var8_ref_ek.g(1829947600);
                                  var13 = var11 * var11 + var12_int * var12_int;
                                  if (var13 >= var9) {
                                    break L13;
                                  } else {
                                    var9 = var13;
                                    break L13;
                                  }
                                }
                                var10 = (Object) (Object) (sh) (Object) ((rl) this).field_f.b(6);
                                continue L10;
                              }
                            }
                          }
                        }
                      }
                      var8_ref_ek = (ek) (Object) ((rl) this).field_u.b(6);
                      continue L3;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L14: {
                  if (var5_ref_ek instanceof sh) {
                    var15 = (sh) (Object) var5_ref_ek;
                    var18 = var15;
                    if (var18.field_O >= ((rl) this).field_m.field_t) {
                      break L14;
                    } else {
                      var18.a(-9019, (rl) this);
                      var15.field_O = ((rl) this).field_m.field_y[var15.field_O];
                      ((rl) this).field_f.a((br) (Object) var5_ref_ek, false);
                      break L14;
                    }
                  } else {
                    break L14;
                  }
                }
                var5_ref_ek = (ek) (Object) var17.b(6);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var4;
            stackOut_41_1 = new StringBuilder().append("rl.K(").append(param0).append(44).append(param1).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L15;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L15;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 41);
        }
    }

    private final lm a(int param0, int param1) {
        ek var3 = this.c(param1, param0 + -417600939);
        if (param0 != 417600865) {
            Object var4 = null;
            this.a(-39, (pa) null);
        }
        if (!(var3 != null)) {
            throw new IllegalArgumentException("oid " + param1 + " invalid");
        }
        if (!(var3 instanceof lm)) {
            throw new IllegalArgumentException("oid " + param1 + " is not a human");
        }
        return (lm) (Object) var3;
    }

    private final void a(int param0, boolean param1, int param2, byte param3) {
        ((rl) this).field_n.a((br) (Object) new nk((rl) this, param2, param0, param1), false);
        if (param3 >= -44) {
            Object var6 = null;
            ((rl) this).a((byte) -68, (ge) null);
        }
    }

    private final void a(boolean param0, int param1) {
        ((rl) this).field_m.field_l = param1;
        if (param0) {
            boolean discarded$0 = this.b(-90, 117, 86, 71, -86, 91);
        }
        int var3 = ((rl) this).field_m.field_l;
        if (!(var3 != 2)) {
            ((rl) this).field_m.field_C = ((rl) this).field_m.field_H + 3000;
        }
        this.a(-7737, (ae) (Object) new fq(((rl) this).field_m.field_H, ((rl) this).field_m.field_l, ((rl) this).field_m.field_C));
    }

    private final ek c(int param0, int param1) {
        int var3 = 0;
        ek var4 = null;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = 101 / ((31 - param1) / 58);
        var4 = (ek) (Object) ((rl) this).field_u.c(101);
        L0: while (true) {
          if (var4 != null) {
            if (var4.field_x == param0) {
              return var4;
            } else {
              var4 = (ek) (Object) ((rl) this).field_u.b(6);
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
            throw fa.a((Throwable) (Object) runtimeException, "rl.HA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(byte param0, ge param1) {
        if (!(!param1.field_Z)) {
            return;
        }
        try {
            this.a(-7737, (ae) (Object) new aj(((rl) this).field_m.field_H, param1.field_x));
            param1.field_eb = false;
            int var3_int = -89 / ((param0 - -48) / 48);
            param1.field_S = false;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "rl.KA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final ek a(int param0, boolean param1) {
        ek var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = (ek) (Object) ((rl) this).field_m.field_u.c(104);
        L0: while (true) {
          if (var3 != null) {
            if (param0 == var3.field_x) {
              return var3;
            } else {
              var3 = (ek) (Object) ((rl) this).field_m.field_u.b(6);
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    private final boolean b(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        ge stackIn_73_0 = null;
        ge stackIn_74_0 = null;
        ge stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        ge stackIn_100_0 = null;
        ge stackIn_101_0 = null;
        ge stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        Object stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        Object stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        Object stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_107_2 = 0;
        ge stackIn_115_0 = null;
        ge stackIn_116_0 = null;
        ge stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        ge stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        ge stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        ge stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        int stackIn_130_2 = 0;
        Object stackIn_140_0 = null;
        Object stackIn_141_0 = null;
        Object stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        ge stackOut_99_0 = null;
        ge stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        ge stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        Object stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        Object stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        int stackOut_106_2 = 0;
        Object stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        int stackOut_105_2 = 0;
        Object stackOut_139_0 = null;
        Object stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        Object stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        ge stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        ge stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        int stackOut_129_2 = 0;
        ge stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        int stackOut_128_2 = 0;
        ge stackOut_114_0 = null;
        ge stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        ge stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        ge stackOut_72_0 = null;
        ge stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        ge stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        L0: {
          var18 = null;
          var14 = ZombieDawnMulti.field_E ? 1 : 0;
          var7 = param2;
          if (!((rl) this).field_o) {
            break L0;
          } else {
            System.out.println(((rl) this).field_m.field_H + ": executing powerup " + param1 + " with modifier " + param0);
            break L0;
          }
        }
        L1: {
          if (!((rl) this).field_m.b((byte) -105, 45, param5)) {
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
            if (param1 == 16) {
              break L3;
            } else {
              if (7 == param1) {
                break L3;
              } else {
                if (param1 == 4) {
                  break L3;
                } else {
                  if (3 == param1) {
                    break L3;
                  } else {
                    if (param1 == 14) {
                      break L3;
                    } else {
                      if (param1 == 8) {
                        break L3;
                      } else {
                        if (param1 == 1) {
                          break L3;
                        } else {
                          if (param1 == 2) {
                            break L3;
                          } else {
                            if (5 == param1) {
                              break L3;
                            } else {
                              if (param1 == 0) {
                                break L3;
                              } else {
                                if (param1 == 18) {
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
              if (!((rl) this).field_m.b(0, var13)) {
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
                      if (param1 == 17) {
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
              ((rl) this).a((byte) 23, var15);
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
              var13_ref_og = (og) (Object) var12;
              if (~var13_ref_og.field_O != ~param5) {
                ((rl) this).field_k[var13_ref_og.field_O] = cr.b(((rl) this).field_k[var13_ref_og.field_O], 1);
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
          if (var13 == 7) {
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
                      if (var10.field_Q == 20) {
                        break L8;
                      } else {
                        if (18 == var10.field_Q) {
                          break L8;
                        } else {
                          ((rl) this).a(param5, (ge) null, -32422, var10);
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
                      var18_ref = (ge) (Object) var17;
                      if (((rl) this).field_o) {
                        System.out.println("cursing, owner " + var18_ref.field_gb + ", prev 0 " + var18_ref.d((byte) 61, 0) + " 1 " + var18_ref.d((byte) 61, 1));
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var18_ref.field_gb == param5) {
                        break L11;
                      } else {
                        if (!var18_ref.d((byte) 61, param5)) {
                          break L11;
                        } else {
                          ((rl) this).field_k[param5] = cr.b(((rl) this).field_k[param5], 2);
                          break L11;
                        }
                      }
                    }
                    var18_ref.e(93, param5);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              return true;
            }
          } else {
            if (var13 == 4) {
              var8 = this.b((byte) 124, var7);
              if (var8 == null) {
                return false;
              } else {
                L12: {
                  stackOut_99_0 = (ge) var8;
                  stackIn_101_0 = stackOut_99_0;
                  stackIn_100_0 = stackOut_99_0;
                  if (param0 != 34) {
                    stackOut_101_0 = (ge) (Object) stackIn_101_0;
                    stackOut_101_1 = 0;
                    stackIn_102_0 = stackOut_101_0;
                    stackIn_102_1 = stackOut_101_1;
                    break L12;
                  } else {
                    stackOut_100_0 = (ge) (Object) stackIn_100_0;
                    stackOut_100_1 = 1;
                    stackIn_102_0 = stackOut_100_0;
                    stackIn_102_1 = stackOut_100_1;
                    break L12;
                  }
                }
                boolean discarded$5 = ((ge) (Object) stackIn_102_0).a(stackIn_102_1 != 0, (byte) 100);
                return true;
              }
            } else {
              L13: {
                if (var13 != 10) {
                  if (var13 != 9) {
                    if (var13 == 13) {
                      L14: {
                        stackOut_104_0 = this;
                        stackOut_104_1 = param4;
                        stackIn_106_0 = stackOut_104_0;
                        stackIn_106_1 = stackOut_104_1;
                        stackIn_105_0 = stackOut_104_0;
                        stackIn_105_1 = stackOut_104_1;
                        if (param0 != 36) {
                          stackOut_106_0 = this;
                          stackOut_106_1 = stackIn_106_1;
                          stackOut_106_2 = 0;
                          stackIn_107_0 = stackOut_106_0;
                          stackIn_107_1 = stackOut_106_1;
                          stackIn_107_2 = stackOut_106_2;
                          break L14;
                        } else {
                          stackOut_105_0 = this;
                          stackOut_105_1 = stackIn_105_1;
                          stackOut_105_2 = 1;
                          stackIn_107_0 = stackOut_105_0;
                          stackIn_107_1 = stackOut_105_1;
                          stackIn_107_2 = stackOut_105_2;
                          break L14;
                        }
                      }
                      this.a(stackIn_107_1, stackIn_107_2 != 0, param2, (byte) -52);
                      return true;
                    } else {
                      if (var13 == 1) {
                        var19 = this.b((byte) 25, var7);
                        if (var19 == null) {
                          return false;
                        } else {
                          boolean discarded$6 = var19.l((byte) -52);
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
                            if (var13 != 14) {
                              if (5 != var13) {
                                if (var13 != 0) {
                                  if (18 != var13) {
                                    if (15 != var13) {
                                      if (8 == var13) {
                                        var9 = this.a((byte) -125, var7);
                                        if (var9 != null) {
                                          L15: {
                                            var11 = ((rl) this).field_m.a((byte) 32, param5, 400);
                                            if (var9 instanceof ge) {
                                              if (34 != param0) {
                                                ((ge) (Object) var9).d(var11, -96);
                                                break L15;
                                              } else {
                                                ((ge) (Object) var9).m((byte) 124);
                                                break L15;
                                              }
                                            } else {
                                              if (!(var9 instanceof lm)) {
                                                break L15;
                                              } else {
                                                if (param0 == 34) {
                                                  ((lm) (Object) var9).c(false);
                                                  break L15;
                                                } else {
                                                  ((lm) (Object) var9).a(var11 * 3 / 4, true);
                                                  break L15;
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
                                          if (var13 != 11) {
                                            if (var13 == 12) {
                                              ((rl) this).field_m.field_z[param5] = ((rl) this).field_m.a((byte) 32, param5, 750);
                                              return true;
                                            } else {
                                              L16: {
                                                if (param3 <= -44) {
                                                  break L16;
                                                } else {
                                                  this.b(19, 25, -67, 7);
                                                  break L16;
                                                }
                                              }
                                              return false;
                                            }
                                          } else {
                                            ((rl) this).field_m.field_a[param5] = ((rl) this).field_m.a((byte) 32, param5, 500);
                                            return true;
                                          }
                                        } else {
                                          L17: {
                                            L18: {
                                              if (param4 == 65535) {
                                                break L18;
                                              } else {
                                                if (-1 == param4) {
                                                  break L18;
                                                } else {
                                                  this.b(2, param5, param4, param2);
                                                  break L17;
                                                }
                                              }
                                            }
                                            this.b(4, var7);
                                            break L17;
                                          }
                                          return true;
                                        }
                                      }
                                    } else {
                                      L19: {
                                        stackOut_139_0 = this;
                                        stackIn_141_0 = stackOut_139_0;
                                        stackIn_140_0 = stackOut_139_0;
                                        if (param0 != 32) {
                                          stackOut_141_0 = this;
                                          stackOut_141_1 = 0;
                                          stackIn_142_0 = stackOut_141_0;
                                          stackIn_142_1 = stackOut_141_1;
                                          break L19;
                                        } else {
                                          stackOut_140_0 = this;
                                          stackOut_140_1 = 1;
                                          stackIn_142_0 = stackOut_140_0;
                                          stackIn_142_1 = stackOut_140_1;
                                          break L19;
                                        }
                                      }
                                      this.a(stackIn_142_1 != 0, (byte) -108, param5, param2, param4);
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
                                    boolean discarded$7 = var22.c((byte) -68, param5);
                                    return true;
                                  }
                                }
                              } else {
                                var8 = this.b((byte) 68, var7);
                                if (var8 != null) {
                                  L20: {
                                    stackOut_127_0 = (ge) var8;
                                    stackOut_127_1 = 47;
                                    stackIn_129_0 = stackOut_127_0;
                                    stackIn_129_1 = stackOut_127_1;
                                    stackIn_128_0 = stackOut_127_0;
                                    stackIn_128_1 = stackOut_127_1;
                                    if (param0 != 35) {
                                      stackOut_129_0 = (ge) (Object) stackIn_129_0;
                                      stackOut_129_1 = stackIn_129_1;
                                      stackOut_129_2 = 0;
                                      stackIn_130_0 = stackOut_129_0;
                                      stackIn_130_1 = stackOut_129_1;
                                      stackIn_130_2 = stackOut_129_2;
                                      break L20;
                                    } else {
                                      stackOut_128_0 = (ge) (Object) stackIn_128_0;
                                      stackOut_128_1 = stackIn_128_1;
                                      stackOut_128_2 = 1;
                                      stackIn_130_0 = stackOut_128_0;
                                      stackIn_130_1 = stackOut_128_1;
                                      stackIn_130_2 = stackOut_128_2;
                                      break L20;
                                    }
                                  }
                                  boolean discarded$8 = ((ge) (Object) stackIn_130_0).a(stackIn_130_1, stackIn_130_2 != 0);
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
                            L21: {
                              stackOut_114_0 = (ge) var8;
                              stackIn_116_0 = stackOut_114_0;
                              stackIn_115_0 = stackOut_114_0;
                              if (param0 != 38) {
                                stackOut_116_0 = (ge) (Object) stackIn_116_0;
                                stackOut_116_1 = 0;
                                stackIn_117_0 = stackOut_116_0;
                                stackIn_117_1 = stackOut_116_1;
                                break L21;
                              } else {
                                stackOut_115_0 = (ge) (Object) stackIn_115_0;
                                stackOut_115_1 = 1;
                                stackIn_117_0 = stackOut_115_0;
                                stackIn_117_1 = stackOut_115_1;
                                break L21;
                              }
                            }
                            boolean discarded$9 = ((ge) (Object) stackIn_117_0).b(stackIn_117_1 != 0, (byte) -127);
                            return true;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  } else {
                    break L13;
                  }
                } else {
                  break L13;
                }
              }
              var11 = ((rl) this).field_m.a((byte) 32, param5, 1000);
              this.b(param1, param2, var11, 11564, param4);
              return true;
            }
          }
        } else {
          var16 = this.b((byte) 32, var7);
          if (var16 != null) {
            if (~var16.field_gb == ~param5) {
              L22: {
                stackOut_72_0 = (ge) var16;
                stackIn_74_0 = stackOut_72_0;
                stackIn_73_0 = stackOut_72_0;
                if (38 == param0) {
                  stackOut_74_0 = (ge) (Object) stackIn_74_0;
                  stackOut_74_1 = 24;
                  stackIn_75_0 = stackOut_74_0;
                  stackIn_75_1 = stackOut_74_1;
                  break L22;
                } else {
                  stackOut_73_0 = (ge) (Object) stackIn_73_0;
                  stackOut_73_1 = 19;
                  stackIn_75_0 = stackOut_73_0;
                  stackIn_75_1 = stackOut_73_1;
                  break L22;
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
        return (ge) (Object) var3;
    }

    private final void d(int param0) {
        Object var3_ref2 = null;
        br var2_ref_br = null;
        int var2 = 0;
        br var3 = null;
        ce var3_ref = null;
        ce var4 = null;
        br var4_ref = null;
        ge var5 = null;
        int var6 = 0;
        pa var7 = null;
        qj var8 = null;
        nk var9 = null;
        bf var10 = null;
        ce var11 = null;
        sa var12 = null;
        pa var13 = null;
        qj var14 = null;
        var3_ref2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((rl) this).field_m.field_l == 3) {
          return;
        } else {
          ((rl) this).field_m.field_H = ((rl) this).field_m.field_H + 1;
          ((rl) this).field_l = false;
          var2_ref_br = ((rl) this).field_u.c(86);
          L0: while (true) {
            if (!(var2_ref_br instanceof ek)) {
              var2 = 0;
              L1: while (true) {
                if (((rl) this).field_m.field_a.length <= var2) {
                  var2 = 0;
                  L2: while (true) {
                    if (var2 >= ((rl) this).field_m.field_z.length) {
                      if (0 != ((rl) this).field_m.field_l) {
                        var2 = 0;
                        L3: while (true) {
                          if (var2 >= ((rl) this).field_m.field_m.length) {
                            var2_ref_br = ((rl) this).field_u.c(75);
                            L4: while (true) {
                              if (!(var2_ref_br instanceof ek)) {
                                var9 = (nk) (Object) ((rl) this).field_n.c(127);
                                L5: while (true) {
                                  if (var9 == null) {
                                    var10 = (bf) (Object) ((rl) this).field_m.field_A.c(86);
                                    L6: while (true) {
                                      if (var10 == null) {
                                        var12 = (sa) (Object) ((rl) this).field_m.field_G.c(46);
                                        L7: while (true) {
                                          if (var12 == null) {
                                            var2 = 0;
                                            var3_ref2 = null;
                                            var4 = (ce) (Object) ((rl) this).field_m.field_s.c(78);
                                            L8: while (true) {
                                              if (var4 == null) {
                                                L9: {
                                                  if (var2 == 0) {
                                                    break L9;
                                                  } else {
                                                    var11 = (ce) (Object) ((rl) this).field_m.field_s.c(45);
                                                    L10: while (true) {
                                                      if (var11 == null) {
                                                        ((rl) this).field_b.a(48);
                                                        var4_ref = ((rl) this).field_u.c(99);
                                                        L11: while (true) {
                                                          if (!(var4_ref instanceof ek)) {
                                                            break L9;
                                                          } else {
                                                            L12: {
                                                              if (var4_ref instanceof ge) {
                                                                ((ge) (Object) var4_ref).j((byte) 82);
                                                                break L12;
                                                              } else {
                                                                break L12;
                                                              }
                                                            }
                                                            var4_ref = ((rl) this).field_u.b(6);
                                                            continue L11;
                                                          }
                                                        }
                                                      } else {
                                                        var11.a((byte) -60);
                                                        var11 = (ce) (Object) ((rl) this).field_m.field_s.b(6);
                                                        continue L10;
                                                      }
                                                    }
                                                  }
                                                }
                                                L13: while (true) {
                                                  L14: {
                                                    if (((rl) this).field_e.f(28113)) {
                                                      break L14;
                                                    } else {
                                                      var8 = (qj) (Object) ((rl) this).field_e.g(50);
                                                      var14 = var8;
                                                      if (var14.field_g > ((rl) this).field_m.field_H) {
                                                        ((rl) this).field_e.a(-25612, (br) (Object) var14);
                                                        break L14;
                                                      } else {
                                                        if (!this.b(var14.field_h, var14.field_q, var14.field_f, -84, var14.field_k, var14.field_n)) {
                                                          continue L13;
                                                        } else {
                                                          if (((rl) this).field_j[var8.field_n] != 255) {
                                                            if (((rl) this).field_j[var14.field_n] == var14.field_q) {
                                                              continue L13;
                                                            } else {
                                                              ((rl) this).field_j[var14.field_n] = -2;
                                                              continue L13;
                                                            }
                                                          } else {
                                                            ((rl) this).field_j[var8.field_n] = var8.field_q;
                                                            continue L13;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  return;
                                                }
                                              } else {
                                                L15: {
                                                  var3_ref = (ce) (Object) ((rl) this).field_m.field_s.b(6);
                                                  if (var4.d(-20232)) {
                                                    var2 = 1;
                                                    break L15;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                                var4 = var3_ref;
                                                continue L8;
                                              }
                                            }
                                          } else {
                                            var12.c(-21);
                                            var12 = (sa) (Object) ((rl) this).field_m.field_G.b(6);
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        var10.c(0);
                                        var10 = (bf) (Object) ((rl) this).field_m.field_A.b(6);
                                        continue L6;
                                      }
                                    }
                                  } else {
                                    var9.a(119);
                                    var9 = (nk) (Object) ((rl) this).field_n.b(6);
                                    continue L5;
                                  }
                                }
                              } else {
                                L16: {
                                  var3 = var2_ref_br.field_d;
                                  ((ek) (Object) var2_ref_br).h(41);
                                  if (!(var2_ref_br instanceof pa)) {
                                    break L16;
                                  } else {
                                    L17: {
                                      var7 = (pa) (Object) var2_ref_br;
                                      var13 = var7;
                                      if (!(var13 instanceof ge)) {
                                        break L17;
                                      } else {
                                        if (var13.field_Z) {
                                          break L17;
                                        } else {
                                          if (9 == var13.field_Q) {
                                            break L17;
                                          } else {
                                            if (var13.field_Q != 21) {
                                              ((rl) this).field_m.field_m[((ge) (Object) var7).field_gb] = ((rl) this).field_m.field_m[((ge) (Object) var7).field_gb] + 1;
                                              break L17;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (var13.field_S) {
                                      L18: {
                                        if (var13 instanceof ge) {
                                          var5 = (ge) (Object) var13;
                                          if (!var5.field_eb) {
                                            break L18;
                                          } else {
                                            this.a(-2, var5);
                                            break L18;
                                          }
                                        } else {
                                          break L18;
                                        }
                                      }
                                      this.a(-2, var13);
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                var2_ref_br = var3;
                                continue L4;
                              }
                            }
                          } else {
                            ((rl) this).field_m.field_m[var2] = 0;
                            var2++;
                            continue L3;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (((rl) this).field_m.field_z[var2] <= 0) {
                        ((rl) this).field_m.field_z[var2] = 0;
                        var2++;
                        continue L2;
                      } else {
                        ((rl) this).field_m.field_z[var2] = ((rl) this).field_m.field_z[var2] - 1;
                        var2++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  if (((rl) this).field_m.field_a[var2] <= 0) {
                    ((rl) this).field_m.field_a[var2] = 0;
                    var2++;
                    continue L1;
                  } else {
                    ((rl) this).field_m.field_a[var2] = ((rl) this).field_m.field_a[var2] - 1;
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              L19: {
                if (!(var2_ref_br instanceof ge)) {
                  break L19;
                } else {
                  if (!((ge) (Object) var2_ref_br).p((byte) 53)) {
                    break L19;
                  } else {
                    ((rl) this).field_l = true;
                    break L19;
                  }
                }
              }
              var2_ref_br = ((rl) this).field_u.b(6);
              continue L0;
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
            stackOut_2_2 = ((rl) this).field_b;
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
              stackOut_4_2 = (fh) (Object) stackIn_4_2;
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
              stackOut_3_2 = (fh) (Object) stackIn_3_2;
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
            ((rl) this).field_m.field_s.a((br) (Object) var6, false);
            if (param0 == 9) {
              var7 = (ek) (Object) ((rl) this).field_u.c(60);
              L2: while (true) {
                if (var7 == null) {
                  break L1;
                } else {
                  L3: {
                    if (!(var7 instanceof ge)) {
                      if (var7 instanceof lm) {
                        var11 = (lm) (Object) var7;
                        if (var6.a(var11.e((byte) -112), var11.g(1829947600), -1)) {
                          var11.a(200, true);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var7 = (ek) (Object) ((rl) this).field_u.b(6);
                        continue L2;
                      }
                    } else {
                      var10 = (ge) (Object) var7;
                      if (var6.a(var10.e((byte) -112), var10.g(1829947600), -1)) {
                        var10.d(200, -124);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var7 = (ek) (Object) ((rl) this).field_u.b(6);
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
        RuntimeException var3 = null;
        sh var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ge var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!param0.field_Z) {
              if (param1 == 105) {
                var3_ref = (sh) (Object) ((rl) this).field_f.c(64);
                L1: while (true) {
                  if (var3_ref == null) {
                    stackOut_26_0 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  } else {
                    L2: {
                      var4 = var3_ref.field_C - param0.field_C;
                      if (-1 > var4) {
                        break L2;
                      } else {
                        if (1 < var4) {
                          break L2;
                        } else {
                          var4 = -param0.field_B + var3_ref.field_B;
                          if (var4 < -1) {
                            break L2;
                          } else {
                            if (1 < var4) {
                              break L2;
                            } else {
                              if (var3_ref.a(param0, param1 + -84)) {
                                L3: {
                                  this.a(-7737, (ae) (Object) ak.a(var3_ref.field_O, (byte) -111, ((rl) this).field_m.field_H, param0.field_x));
                                  if (param0 instanceof lm) {
                                    L4: {
                                      ((rl) this).field_m.c(-118);
                                      var5 = 10;
                                      ((rl) this).field_g[var3_ref.field_O] = ((rl) this).field_g[var3_ref.field_O] + 1;
                                      if (!((lm) (Object) param0).field_hb) {
                                        break L4;
                                      } else {
                                        ((rl) this).field_k[var3_ref.field_O] = cr.b(((rl) this).field_k[var3_ref.field_O], 4);
                                        break L4;
                                      }
                                    }
                                    ((rl) this).field_m.field_J[var3_ref.field_O] = ((rl) this).field_m.field_J[var3_ref.field_O] + 3;
                                    if (!((rl) this).field_m.b((byte) -99, 60, var3_ref.field_O)) {
                                      break L3;
                                    } else {
                                      var5 = var5 + var5 / 2;
                                      break L3;
                                    }
                                  } else {
                                    var6 = (ge) (Object) param0;
                                    var5 = 4;
                                    var6.t(4);
                                    ((rl) this).field_i[var3_ref.field_O] = ((rl) this).field_i[var3_ref.field_O] + 1;
                                    ((rl) this).field_m.field_J[var3_ref.field_O] = ((rl) this).field_m.field_J[var3_ref.field_O] + 1;
                                    if (((rl) this).field_m.b((byte) -122, 53, var3_ref.field_O)) {
                                      var5 = var5 + var5 / 2;
                                      break L3;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                                ((rl) this).field_m.field_d[var3_ref.field_O] = ((rl) this).field_m.field_d[var3_ref.field_O] + var5;
                                ((rl) this).field_m.a(param1 + -233, (ff) (Object) param0);
                                stackOut_23_0 = 1;
                                stackIn_24_0 = stackOut_23_0;
                                return stackIn_24_0 != 0;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                    var3_ref = (sh) (Object) ((rl) this).field_f.b(6);
                    continue L1;
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("rl.AA(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param1 + 41);
        }
        return stackIn_27_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((rl) this).field_m.field_A.a((br) (Object) new bf(((rl) this).field_b, param2, param0, param3), false);
        if (param1 != -22930) {
            this.a(-17, false, -101, (byte) 121);
        }
    }

    final void a(lm param0, ge param1, int param2, int param3, byte param4) {
        if (!(!param1.field_Z)) {
            return;
        }
        try {
            this.a(-7737, (ae) (Object) fn.a(param3, param0.field_x, param1.field_x, (byte) 116, ((rl) this).field_m.field_H, param2));
            param1.field_S = false;
            if (param4 != -63) {
                ((rl) this).field_b = null;
            }
            param1.field_eb = false;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "rl.H(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void a(lm param0, ge param1, ge param2, boolean param3) {
        sj var5 = null;
        try {
            var5 = new sj(((rl) this).field_m.field_H, param2 != null ? param2.field_x : -1, param0.field_x, param1.field_x, param0.field_G, param0.field_E, param1.field_gb);
            this.a(-7737, (ae) (Object) var5);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "rl.JA(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    private final void a(boolean param0, byte param1, int param2, int param3, int param4) {
        pa[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        br var9_ref_br = null;
        int var9 = 0;
        pa var10 = null;
        int var11 = 0;
        int var12 = 0;
        ge var13 = null;
        int var14 = 0;
        int[] var15 = null;
        Object var16 = null;
        pa var16_ref = null;
        pa[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var16 = null;
          var14 = ZombieDawnMulti.field_E ? 1 : 0;
          g.field_a.setSeed((long)((param4 << 5) + param3 + param2));
          var17 = new pa[((rl) this).field_u.a(0)];
          var6 = var17;
          var20 = new int[((rl) this).field_u.a(0)];
          var19 = var20;
          var18 = var19;
          var15 = var18;
          var7 = var15;
          d.a(var7, 0, var20.length, 32767);
          if (param1 <= -36) {
            break L0;
          } else {
            field_r = null;
            break L0;
          }
        }
        var8 = 0;
        var9_ref_br = ((rl) this).field_u.c(111);
        L1: while (true) {
          if (!(var9_ref_br instanceof ek)) {
            vh.a(-7255, var20, (Object[]) (Object) var17);
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
                    if (((rl) this).field_m.b(0, ((ge) (Object) var10).field_gb)) {
                      ((rl) this).a((byte) 100, (ge) (Object) var10);
                      var9++;
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                boolean discarded$1 = var17[var9].b(param2, -50);
                var9++;
                continue L2;
              }
            }
          } else {
            L4: {
              if (var9_ref_br instanceof pa) {
                var16_ref = (pa) (Object) var9_ref_br;
                var11 = var16_ref.e((byte) -112) + -param3;
                var12 = -param4 + var16_ref.g(1829947600);
                if (var11 * var11 - -(var12 * var12) <= 14400) {
                  L5: {
                    if (!param0) {
                      break L5;
                    } else {
                      if (var16_ref instanceof ge) {
                        var13 = (ge) (Object) var16_ref;
                        if (var13.field_gb != param2) {
                          var6[var8] = (pa) (Object) var13;
                          var7[var8] = var13.field_x;
                          var8++;
                          break L4;
                        } else {
                          var9_ref_br = ((rl) this).field_u.b(6);
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
            var9_ref_br = ((rl) this).field_u.b(6);
            continue L1;
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        Object var5 = null;
        br var5_ref = null;
        br var6_ref_br = null;
        int var6 = 0;
        int var7 = 0;
        og var7_ref_og = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        bf var11 = null;
        sa var12 = null;
        ce var13 = null;
        int stackIn_32_0 = 0;
        int stackIn_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        var5 = null;
        var11 = (bf) (Object) ((rl) this).field_m.field_A.c(64);
        L0: while (true) {
          if (var11 == null) {
            var12 = (sa) (Object) ((rl) this).field_m.field_G.c(109);
            L1: while (true) {
              if (var12 == null) {
                var13 = (ce) (Object) ((rl) this).field_m.field_s.c(98);
                L2: while (true) {
                  L3: {
                    if (var13 == null) {
                      break L3;
                    } else {
                      var5_ref = ((rl) this).field_m.field_s.b(6);
                      if (!var13.a(param3, param2, -1)) {
                        var13 = (ce) (Object) var5_ref;
                        continue L2;
                      } else {
                        var13.c(param0 + -28190);
                        break L3;
                      }
                    }
                  }
                  var6_ref_br = ((rl) this).field_m.field_K.c(85);
                  L4: while (true) {
                    if (var6_ref_br == null) {
                      var6 = 0;
                      var7 = 0;
                      L5: while (true) {
                        if (var7 >= ((rl) this).field_m.field_a.length) {
                          if (var6 != 0) {
                            return;
                          } else {
                            L6: {
                              var7 = 0;
                              if (param0 == 2) {
                                break L6;
                              } else {
                                var10 = null;
                                ((rl) this).a((lm) null, (ge) null, -111, -126, (byte) -27);
                                break L6;
                              }
                            }
                            var8 = 0;
                            L7: while (true) {
                              if (((rl) this).field_m.field_z.length <= var8) {
                                if (var7 == 0) {
                                  return;
                                } else {
                                  return;
                                }
                              } else {
                                L8: {
                                  if (var7 == 0) {
                                    if (0 < ((rl) this).field_m.field_z[var8]) {
                                      stackOut_44_0 = 1;
                                      stackIn_46_0 = stackOut_44_0;
                                      break L8;
                                    } else {
                                      stackOut_43_0 = 0;
                                      stackIn_46_0 = stackOut_43_0;
                                      break L8;
                                    }
                                  } else {
                                    stackOut_41_0 = 1;
                                    stackIn_46_0 = stackOut_41_0;
                                    break L8;
                                  }
                                }
                                var7 = stackIn_46_0;
                                ((rl) this).field_m.field_z[var8] = 0;
                                var8++;
                                continue L7;
                              }
                            }
                          }
                        } else {
                          L9: {
                            if (var6 == 0) {
                              if (((rl) this).field_m.field_a[var7] > 0) {
                                stackOut_30_0 = 1;
                                stackIn_32_0 = stackOut_30_0;
                                break L9;
                              } else {
                                stackOut_29_0 = 0;
                                stackIn_32_0 = stackOut_29_0;
                                break L9;
                              }
                            } else {
                              stackOut_27_0 = 1;
                              stackIn_32_0 = stackOut_27_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_32_0;
                          ((rl) this).field_m.field_a[var7] = 0;
                          var7++;
                          continue L5;
                        }
                      }
                    } else {
                      L10: {
                        if (var6_ref_br instanceof og) {
                          var7_ref_og = (og) (Object) var6_ref_br;
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
                      var6_ref_br = ((rl) this).field_m.field_K.b(param0 + 4);
                      continue L4;
                    }
                  }
                }
              } else {
                var5_ref = ((rl) this).field_m.field_G.b(6);
                if (var12.a(param3, param0 + 17308, param2)) {
                  var12.d(-110);
                  var12.a(true);
                  return;
                } else {
                  var12 = (sa) (Object) var5_ref;
                  continue L1;
                }
              }
            }
          } else {
            if (!var11.a(param3, param2, (byte) 29)) {
              var11 = (bf) (Object) ((rl) this).field_m.field_A.b(6);
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
                  this.a(-7737, (ae) (Object) td.a(param2.g(1829947600), ((rl) this).field_m.field_H, param2.e((byte) -112), (byte) 41, param1.g(1829947600), param1.field_x, param1.e((byte) -112), param2.field_x));
                  var4_int = -87 % ((param0 - -35) / 36);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("rl.R(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
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
        int var14 = 0;
        hk var15 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((rl) this).field_t) {
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
              var8_ref_br = ((rl) this).field_u.c(85);
              L2: while (true) {
                if (var8_ref_br == null) {
                  break L1;
                } else {
                  L3: {
                    if (var8_ref_br instanceof lm) {
                      var9 = (lm) (Object) var8_ref_br;
                      if (!var9.field_Z) {
                        var10 = -param5 + var9.e((byte) -112);
                        var11 = -param3 + var9.g(1829947600);
                        if (var10 * var10 + var11 * var11 >= 4000) {
                          var9.field_G = param5 << 16;
                          var9.field_E = param3 << 16;
                          var9.field_S = true;
                          System.out.println("moving human oid " + var9.field_x);
                          break L1;
                        } else {
                          var8_ref_br = ((rl) this).field_u.b(6);
                          continue L2;
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var8_ref_br = ((rl) this).field_u.b(6);
                  continue L2;
                }
              }
            } else {
              if (var8 == 1) {
                ((rl) this).field_m.field_d[param0] = 100;
                ((rl) this).field_m.field_d[(param0 - -1) % ((rl) this).field_m.field_t] = 25;
                ((rl) this).field_m.field_H = 6000;
                this.a(false, 2);
                ((rl) this).field_m.field_C = ((rl) this).field_m.field_H - -1;
                break L1;
              } else {
                if (var8 != 3) {
                  if (2 == var8) {
                    var13 = ((rl) this).field_d[param2];
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
            var7.a(!param4 ? true : false, ((rl) this).field_b.b(var7.e((byte) -112), param2, var7.g(1829947600), param1, 8760));
        } else {
            var7.field_G = param1 << 16;
            var7.field_E = param2 << 16;
            var7.a(33, (byte) -89);
            var7.field_ab = param2;
            var7.field_N = param1;
        }
        this.a(-2, (pa) (Object) var7);
        return true;
    }

    rl(kb param0, hk[] param1, boolean param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        ek var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        ((rl) this).field_i = new int[4];
        ((rl) this).field_o = false;
        ((rl) this).field_j = new int[4];
        ((rl) this).field_p = new int[4];
        ((rl) this).field_k = new int[4];
        ((rl) this).field_g = new int[4];
        try {
          L0: {
            L1: {
              ((rl) this).field_d = param1;
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
            ((rl) this).field_t = stackIn_4_1 != 0;
            ((rl) this).field_m = param0;
            ((rl) this).field_q = new th();
            ((rl) this).field_u = ((rl) this).field_m.a((byte) 125);
            this.a(param3, (byte) -6, ((rl) this).field_m.field_h);
            var7 = (ek) (Object) ((rl) this).field_u.c(126);
            L2: while (true) {
              if (var7 == null) {
                ((rl) this).field_m.field_l = 0;
                var5_int = 0;
                L3: while (true) {
                  if (var5_int >= ((rl) this).field_j.length) {
                    break L0;
                  } else {
                    ((rl) this).field_j[var5_int] = 255;
                    var5_int++;
                    continue L3;
                  }
                }
              } else {
                var7.a(-9019, (rl) this);
                var7 = (ek) (Object) ((rl) this).field_u.b(6);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("rl.<init>(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Real-life threats";
    }
}
