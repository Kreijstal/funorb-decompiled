/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends de {
    static rh field_p;
    static String field_s;
    static dj field_o;
    static char[] field_r;
    static tf field_q;

    private final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6, tc param7, int param8, int param9, int param10) {
        int var12_int = 0;
        RuntimeException var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              var12_int = param6 + (param1 + param10);
              if (var12_int != 0) {
                param6 = (200 * param6 + var12_int) / (var12_int * 2);
                param1 = (var12_int + 200 * param1) / (2 * var12_int);
                param10 = (var12_int + param10 * 200) / (var12_int * 2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 != param8) {
                param7.c(param8 + 1 + ". ", 70, param4, param9, param0);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var14 = param5;
              param7.a(var14, 70, param4, param9, param0);
              var15 = Integer.toString(param3);
              param7.b(var15, aj.field_o[0], param4, param9, param0);
              if (param2 == 540) {
                break L3;
              } else {
                field_p = (rh) null;
                break L3;
              }
            }
            L4: {
              if ((var12_int ^ -1) > -51) {
                stackOut_10_0 = Integer.toString(var12_int);
                stackIn_11_0 = stackOut_10_0;
                break L4;
              } else {
                stackOut_9_0 = "50+";
                stackIn_11_0 = stackOut_9_0;
                break L4;
              }
            }
            var16 = stackIn_11_0;
            var13 = var16;
            param7.b(var16, aj.field_o[1], param4, param9, param0);
            var17 = param10 + "%";
            param7.b(var17, aj.field_o[2], param4, param9, param0);
            var18 = param1 + "%";
            param7.b(var18, aj.field_o[3], param4, param9, param0);
            var19 = param6 + "%";
            param7.b(var19, aj.field_o[4], param4, param9, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var12 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var12);
            stackOut_13_1 = new StringBuilder().append("wh.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param6).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param7 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    final int b(int param0, int param1) {
        int var3 = 51 % ((param0 - -13) / 37);
        if (jg.a((byte) 64)) {
            return this.field_d + param1 * this.field_i;
        }
        if (!(param1 >= 2)) {
            return this.field_d;
        }
        return this.field_i + this.field_d;
    }

    final int a(int param0, byte param1) {
        int discarded$1 = 0;
        this.field_m = 30;
        if (param1 == 90) {
          this.field_a = 640 + -this.field_m;
          if (!jg.a((byte) 123)) {
            if (2 > param0) {
              if (-1 != (param0 ^ -1)) {
                return this.field_a - this.d(1, 28);
              } else {
                return this.field_m;
              }
            } else {
              return -(this.d(param0, 29) >> -1754623199) + 320;
            }
          } else {
            return -(this.d(param0, 29) >> -1754623199) + 320;
          }
        } else {
          discarded$1 = this.a(-116, false);
          this.field_a = 640 + -this.field_m;
          if (!jg.a((byte) 123)) {
            if (2 > param0) {
              if (-1 != (param0 ^ -1)) {
                return this.field_a - this.d(1, 28);
              } else {
                return this.field_m;
              }
            } else {
              return -(this.d(param0, 29) >> -1754623199) + 320;
            }
          } else {
            return -(this.d(param0, 29) >> -1754623199) + 320;
          }
        }
    }

    private final int d(int param0, int param1) {
        String var3 = we.field_o[this.field_k[param0]];
        int var4 = 96 / ((param1 - -50) / 50);
        return 20 + rk.field_e.c(var3);
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        sm var5_ref_sm = null;
        int var5 = 0;
        df var6 = null;
        int var6_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        pc var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_26_0 = 0;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2 = 88 % ((31 - param0) / 43);
                var11 = vi.field_o;
                var3 = var11.f(255);
                var4 = var11.f(255);
                if (-1 != (var3 ^ -1)) {
                  break L2;
                } else {
                  var5_ref_sm = (sm) ((Object) in.field_J.c(1504642273));
                  if (var5_ref_sm == null) {
                    na.a(true);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    L3: {
                      var6_int = -var11.field_m + jj.field_b;
                      var13 = var5_ref_sm.field_o;
                      var12 = var13;
                      var7 = var12;
                      if (var6_int > var13.length << -631127614) {
                        var6_int = var13.length << 395893986;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var8 = 0;
                    L4: while (true) {
                      L5: {
                        if (var8 >= var6_int) {
                          var5_ref_sm.c(2779);
                          break L5;
                        } else {
                          var7[var8 >> -1521578494] = var7[var8 >> -1521578494] + (var11.f(255) << (cm.a(var8, 3) << -234211896));
                          var8++;
                          if (var9 != 0) {
                            break L5;
                          } else {
                            continue L4;
                          }
                        }
                      }
                      if (var9 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              L6: {
                if ((var3 ^ -1) != -2) {
                  break L6;
                } else {
                  var5 = var11.l(-20729);
                  var6 = (df) ((Object) he.field_b.c(1504642273));
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (var6 == null) {
                          break L9;
                        } else {
                          stackOut_19_0 = var4;
                          stackIn_27_0 = stackOut_19_0;
                          stackIn_20_0 = stackOut_19_0;
                          if (var9 != 0) {
                            break L8;
                          } else {
                            L10: {
                              if (stackIn_20_0 != var6.field_p) {
                                break L10;
                              } else {
                                if (var6.field_k == var5) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            var6 = (df) ((Object) he.field_b.f(1504642273));
                            if (var9 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      if (var6 == null) {
                        stackOut_26_0 = 1;
                        stackIn_27_0 = stackOut_26_0;
                        break L8;
                      } else {
                        var6.c(2779);
                        if (var9 == 0) {
                          break L1;
                        } else {
                          break L6;
                        }
                      }
                    }
                    na.a(stackIn_27_0 != 0);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              jo.a(1, "LR1: " + jm.b(-35), (Throwable) null);
              na.a(true);
              break L1;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "wh.I(" + param0 + ')');
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

    final void a(int param0) {
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        int discarded$18 = 0;
        int discarded$19 = 0;
        int discarded$20 = 0;
        int discarded$21 = 0;
        int discarded$22 = 0;
        int discarded$23 = 0;
        int var3 = 0;
        String var4 = null;
        tc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        ob var16 = null;
        ob var17 = null;
        String var18 = null;
        tc var21 = null;
        String[] var22 = null;
        String var23 = null;
        ob var24 = null;
        tc var25 = null;
        String[] var26 = null;
        String var27 = null;
        tc var29 = null;
        String[] var30 = null;
        String var31 = null;
        String var33 = null;
        String var36 = null;
        tc var37 = null;
        String[] var38 = null;
        String var39 = null;
        var15 = Pixelate.field_H ? 1 : 0;
        gj.field_W[8].b(0, 45);
        this.b((byte) -71);
        if (param0 == 11) {
          L0: {
            this.d((byte) 74);
            var24 = rk.field_e;
            var16 = var24;
            var3 = var24.field_w + var24.field_z;
            if (ca.field_f != null) {
              break L0;
            } else {
              if (!jg.a((byte) 112)) {
                ca.field_f = cn.a(0, 7, 10, -119);
                break L0;
              } else {
                if (!jg.a((byte) 83)) {
                  if (!ca.field_f.field_u) {
                    var33 = wd.field_b;
                    if (var15 != 0) {
                      L1: {
                        L2: {
                          if (ca.field_f.field_o == null) {
                            break L2;
                          } else {
                            var29 = qj.field_e;
                            var5 = var29;
                            var6 = 1 + var29.field_w + var29.field_z;
                            var7 = 150 + var6;
                            var8 = 16777215;
                            var9 = 0;
                            var29.b(hg.field_b, aj.field_o[0], var7, var8, var9);
                            var29.b(db.field_N, aj.field_o[1], var7, var8, var9);
                            var29.b(wa.field_d, aj.field_o[2], var7, var8, var9);
                            var29.b(ab.field_e, aj.field_o[3], var7, var8, var9);
                            var29.b(fa.field_d, aj.field_o[4], var7, var8, var9);
                            var4 = cf.field_z;
                            var7 = var7 + (var6 + 4);
                            var30 = ca.field_f.field_o[d.field_c];
                            var10 = var30;
                            var11 = ca.field_f.field_r[d.field_c];
                            var12 = 0;
                            var13 = 0;
                            L3: while (true) {
                              L4: {
                                L5: {
                                  L6: {
                                    if (10 <= var13) {
                                      break L6;
                                    } else {
                                      if (var15 != 0) {
                                        break L5;
                                      } else {
                                        L7: {
                                          if (null == var30[var13]) {
                                            break L7;
                                          } else {
                                            L8: {
                                              var31 = var30[var13];
                                              var8 = 16777215;
                                              if (sm.a(var31, param0 + -12)) {
                                                var12 = 1;
                                                var8 = 16711680;
                                                break L8;
                                              } else {
                                                break L8;
                                              }
                                            }
                                            var4 = "";
                                            this.a(var9, var11[4 * var13 + 3], 540, var11[var13 * 4], var7, var31, var11[4 * var13 + 2], var29, var13, var8, var11[4 * var13 + 1]);
                                            break L7;
                                          }
                                        }
                                        var7 = var7 + var6;
                                        var13++;
                                        if (var15 == 0) {
                                          continue L3;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                  if (var12 == 0) {
                                    var7 += 4;
                                    var8 = 16711680;
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                                this.a(var9, ca.field_f.field_m, param0 ^ 535, ca.field_f.field_p, var7, kn.field_J, ca.field_f.field_n, var29, -1, var8, ca.field_f.field_v);
                                break L4;
                              }
                              if (var15 == 0) {
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        var4 = pf.field_l;
                        if (var15 == 0) {
                          break L1;
                        } else {
                          var4 = mj.field_h;
                          break L1;
                        }
                      }
                      discarded$12 = var24.a(var4, 50, 150, 540, 200, 0, -1, 1, 1, var3);
                      return;
                    } else {
                      discarded$13 = var24.a(var33, 50, 150, 540, 200, 0, -1, 1, 1, var3);
                      return;
                    }
                  } else {
                    L9: {
                      L10: {
                        if (ca.field_f.field_o == null) {
                          break L10;
                        } else {
                          var25 = qj.field_e;
                          var5 = var25;
                          var6 = 1 + var25.field_w + var25.field_z;
                          var7 = 150 + var6;
                          var8 = 16777215;
                          var9 = 0;
                          var25.b(hg.field_b, aj.field_o[0], var7, var8, var9);
                          var25.b(db.field_N, aj.field_o[1], var7, var8, var9);
                          var25.b(wa.field_d, aj.field_o[2], var7, var8, var9);
                          var25.b(ab.field_e, aj.field_o[3], var7, var8, var9);
                          var25.b(fa.field_d, aj.field_o[4], var7, var8, var9);
                          var4 = cf.field_z;
                          var7 = var7 + (var6 + 4);
                          var26 = ca.field_f.field_o[d.field_c];
                          var10 = var26;
                          var11 = ca.field_f.field_r[d.field_c];
                          var12 = 0;
                          var13 = 0;
                          L11: while (true) {
                            L12: {
                              L13: {
                                L14: {
                                  if (10 <= var13) {
                                    break L14;
                                  } else {
                                    if (var15 != 0) {
                                      break L13;
                                    } else {
                                      L15: {
                                        if (null == var26[var13]) {
                                          break L15;
                                        } else {
                                          L16: {
                                            var27 = var26[var13];
                                            var8 = 16777215;
                                            if (sm.a(var27, param0 + -12)) {
                                              var12 = 1;
                                              var8 = 16711680;
                                              break L16;
                                            } else {
                                              break L16;
                                            }
                                          }
                                          var4 = "";
                                          this.a(var9, var11[4 * var13 + 3], 540, var11[var13 * 4], var7, var27, var11[4 * var13 + 2], var25, var13, var8, var11[4 * var13 + 1]);
                                          break L15;
                                        }
                                      }
                                      var7 = var7 + var6;
                                      var13++;
                                      if (var15 == 0) {
                                        continue L11;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                                if (var12 == 0) {
                                  var7 += 4;
                                  var8 = 16711680;
                                  break L13;
                                } else {
                                  break L12;
                                }
                              }
                              this.a(var9, ca.field_f.field_m, param0 ^ 535, ca.field_f.field_p, var7, kn.field_J, ca.field_f.field_n, var25, -1, var8, ca.field_f.field_v);
                              break L12;
                            }
                            if (var15 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      var4 = pf.field_l;
                      if (var15 == 0) {
                        break L9;
                      } else {
                        var4 = mj.field_h;
                        break L9;
                      }
                    }
                    discarded$14 = var24.a(var4, 50, 150, 540, 200, 0, -1, 1, 1, var3);
                    return;
                  }
                } else {
                  var4 = mj.field_h;
                  discarded$15 = var24.a(var4, 50, 150, 540, 200, 0, -1, 1, 1, var3);
                  return;
                }
              }
            }
          }
          if (!jg.a((byte) 83)) {
            if (!ca.field_f.field_u) {
              var36 = wd.field_b;
              if (var15 == 0) {
                discarded$16 = var24.a(var36, 50, 150, 540, 200, 0, -1, 1, 1, var3);
                return;
              } else {
                L17: {
                  L18: {
                    if (ca.field_f.field_o == null) {
                      break L18;
                    } else {
                      var37 = qj.field_e;
                      var6 = 1 + var37.field_w + var37.field_z;
                      var7 = 150 + var6;
                      var8 = 16777215;
                      var9 = 0;
                      var37.b(hg.field_b, aj.field_o[0], var7, var8, var9);
                      var37.b(db.field_N, aj.field_o[1], var7, var8, var9);
                      var37.b(wa.field_d, aj.field_o[2], var7, var8, var9);
                      var37.b(ab.field_e, aj.field_o[3], var7, var8, var9);
                      var37.b(fa.field_d, aj.field_o[4], var7, var8, var9);
                      var4 = cf.field_z;
                      var7 = var7 + (var6 + 4);
                      var38 = ca.field_f.field_o[d.field_c];
                      var11 = ca.field_f.field_r[d.field_c];
                      var12 = 0;
                      var13 = 0;
                      L19: while (true) {
                        L20: {
                          L21: {
                            L22: {
                              if (10 <= var13) {
                                break L22;
                              } else {
                                if (var15 != 0) {
                                  break L21;
                                } else {
                                  L23: {
                                    if (null == var38[var13]) {
                                      break L23;
                                    } else {
                                      L24: {
                                        var39 = var38[var13];
                                        var8 = 16777215;
                                        if (sm.a(var39, param0 + -12)) {
                                          var12 = 1;
                                          var8 = 16711680;
                                          break L24;
                                        } else {
                                          break L24;
                                        }
                                      }
                                      var4 = "";
                                      this.a(var9, var11[4 * var13 + 3], 540, var11[var13 * 4], var7, var39, var11[4 * var13 + 2], var37, var13, var8, var11[4 * var13 + 1]);
                                      break L23;
                                    }
                                  }
                                  var7 = var7 + var6;
                                  var13++;
                                  if (var15 == 0) {
                                    continue L19;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            if (var12 == 0) {
                              var7 += 4;
                              var8 = 16711680;
                              break L21;
                            } else {
                              break L20;
                            }
                          }
                          this.a(var9, ca.field_f.field_m, param0 ^ 535, ca.field_f.field_p, var7, kn.field_J, ca.field_f.field_n, var37, -1, var8, ca.field_f.field_v);
                          break L20;
                        }
                        if (var15 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                  var4 = pf.field_l;
                  if (var15 == 0) {
                    break L17;
                  } else {
                    var4 = mj.field_h;
                    break L17;
                  }
                }
                discarded$17 = var24.a(var4, 50, 150, 540, 200, 0, -1, 1, 1, var3);
                return;
              }
            } else {
              L25: {
                L26: {
                  if (ca.field_f.field_o == null) {
                    break L26;
                  } else {
                    var37 = qj.field_e;
                    var6 = 1 + var37.field_w + var37.field_z;
                    var7 = 150 + var6;
                    var8 = 16777215;
                    var9 = 0;
                    var37.b(hg.field_b, aj.field_o[0], var7, var8, var9);
                    var37.b(db.field_N, aj.field_o[1], var7, var8, var9);
                    var37.b(wa.field_d, aj.field_o[2], var7, var8, var9);
                    var37.b(ab.field_e, aj.field_o[3], var7, var8, var9);
                    var37.b(fa.field_d, aj.field_o[4], var7, var8, var9);
                    var4 = cf.field_z;
                    var7 = var7 + (var6 + 4);
                    var38 = ca.field_f.field_o[d.field_c];
                    var11 = ca.field_f.field_r[d.field_c];
                    var12 = 0;
                    var13 = 0;
                    L27: while (true) {
                      L28: {
                        L29: {
                          L30: {
                            if (10 <= var13) {
                              break L30;
                            } else {
                              if (var15 != 0) {
                                break L29;
                              } else {
                                L31: {
                                  if (null == var38[var13]) {
                                    break L31;
                                  } else {
                                    L32: {
                                      var39 = var38[var13];
                                      var8 = 16777215;
                                      if (sm.a(var39, param0 + -12)) {
                                        var12 = 1;
                                        var8 = 16711680;
                                        break L32;
                                      } else {
                                        break L32;
                                      }
                                    }
                                    var4 = "";
                                    this.a(var9, var11[4 * var13 + 3], 540, var11[var13 * 4], var7, var39, var11[4 * var13 + 2], var37, var13, var8, var11[4 * var13 + 1]);
                                    break L31;
                                  }
                                }
                                var7 = var7 + var6;
                                var13++;
                                if (var15 == 0) {
                                  continue L27;
                                } else {
                                  break L30;
                                }
                              }
                            }
                          }
                          if (var12 == 0) {
                            var7 += 4;
                            var8 = 16711680;
                            break L29;
                          } else {
                            break L28;
                          }
                        }
                        this.a(var9, ca.field_f.field_m, param0 ^ 535, ca.field_f.field_p, var7, kn.field_J, ca.field_f.field_n, var37, -1, var8, ca.field_f.field_v);
                        break L28;
                      }
                      if (var15 == 0) {
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                }
                var4 = pf.field_l;
                if (var15 == 0) {
                  break L25;
                } else {
                  var4 = mj.field_h;
                  break L25;
                }
              }
              discarded$18 = var24.a(var4, 50, 150, 540, 200, 0, -1, 1, 1, var3);
              return;
            }
          } else {
            var4 = mj.field_h;
            discarded$19 = var24.a(var4, 50, 150, 540, 200, 0, -1, 1, 1, var3);
            return;
          }
        } else {
          L33: {
            this.a((byte) -95, false, 89);
            this.d((byte) 74);
            var17 = rk.field_e;
            var16 = var17;
            var3 = var17.field_w + var17.field_z;
            if (ca.field_f != null) {
              break L33;
            } else {
              if (!jg.a((byte) 112)) {
                ca.field_f = cn.a(0, 7, 10, -119);
                break L33;
              } else {
                break L33;
              }
            }
          }
          if (!jg.a((byte) 83)) {
            if (!ca.field_f.field_u) {
              var18 = wd.field_b;
              if (var15 == 0) {
                discarded$20 = var17.a(var18, 50, 150, 540, 200, 0, -1, 1, 1, var3);
                return;
              } else {
                L34: {
                  L35: {
                    if (ca.field_f.field_o == null) {
                      break L35;
                    } else {
                      var21 = qj.field_e;
                      var6 = 1 + var21.field_w + var21.field_z;
                      var7 = 150 + var6;
                      var8 = 16777215;
                      var9 = 0;
                      var21.b(hg.field_b, aj.field_o[0], var7, var8, var9);
                      var21.b(db.field_N, aj.field_o[1], var7, var8, var9);
                      var21.b(wa.field_d, aj.field_o[2], var7, var8, var9);
                      var21.b(ab.field_e, aj.field_o[3], var7, var8, var9);
                      var21.b(fa.field_d, aj.field_o[4], var7, var8, var9);
                      var4 = cf.field_z;
                      var7 = var7 + (var6 + 4);
                      var22 = ca.field_f.field_o[d.field_c];
                      var11 = ca.field_f.field_r[d.field_c];
                      var12 = 0;
                      var13 = 0;
                      L36: while (true) {
                        L37: {
                          L38: {
                            L39: {
                              if (10 <= var13) {
                                break L39;
                              } else {
                                if (var15 != 0) {
                                  break L38;
                                } else {
                                  L40: {
                                    if (null == var22[var13]) {
                                      break L40;
                                    } else {
                                      L41: {
                                        var23 = var22[var13];
                                        var8 = 16777215;
                                        if (sm.a(var23, param0 + -12)) {
                                          var12 = 1;
                                          var8 = 16711680;
                                          break L41;
                                        } else {
                                          break L41;
                                        }
                                      }
                                      var4 = "";
                                      this.a(var9, var11[4 * var13 + 3], 540, var11[var13 * 4], var7, var23, var11[4 * var13 + 2], var21, var13, var8, var11[4 * var13 + 1]);
                                      break L40;
                                    }
                                  }
                                  var7 = var7 + var6;
                                  var13++;
                                  if (var15 == 0) {
                                    continue L36;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                            }
                            if (var12 == 0) {
                              var7 += 4;
                              var8 = 16711680;
                              break L38;
                            } else {
                              break L37;
                            }
                          }
                          this.a(var9, ca.field_f.field_m, param0 ^ 535, ca.field_f.field_p, var7, kn.field_J, ca.field_f.field_n, var21, -1, var8, ca.field_f.field_v);
                          break L37;
                        }
                        if (var15 == 0) {
                          break L34;
                        } else {
                          break L35;
                        }
                      }
                    }
                  }
                  var4 = pf.field_l;
                  if (var15 == 0) {
                    break L34;
                  } else {
                    var4 = mj.field_h;
                    break L34;
                  }
                }
                discarded$21 = var17.a(var4, 50, 150, 540, 200, 0, -1, 1, 1, var3);
                return;
              }
            } else {
              L42: {
                L43: {
                  if (ca.field_f.field_o == null) {
                    break L43;
                  } else {
                    var21 = qj.field_e;
                    var6 = 1 + var21.field_w + var21.field_z;
                    var7 = 150 + var6;
                    var8 = 16777215;
                    var9 = 0;
                    var21.b(hg.field_b, aj.field_o[0], var7, var8, var9);
                    var21.b(db.field_N, aj.field_o[1], var7, var8, var9);
                    var21.b(wa.field_d, aj.field_o[2], var7, var8, var9);
                    var21.b(ab.field_e, aj.field_o[3], var7, var8, var9);
                    var21.b(fa.field_d, aj.field_o[4], var7, var8, var9);
                    var4 = cf.field_z;
                    var7 = var7 + (var6 + 4);
                    var22 = ca.field_f.field_o[d.field_c];
                    var11 = ca.field_f.field_r[d.field_c];
                    var12 = 0;
                    var13 = 0;
                    L44: while (true) {
                      L45: {
                        L46: {
                          L47: {
                            if (10 <= var13) {
                              break L47;
                            } else {
                              if (var15 != 0) {
                                break L46;
                              } else {
                                L48: {
                                  if (null == var22[var13]) {
                                    break L48;
                                  } else {
                                    L49: {
                                      var23 = var22[var13];
                                      var8 = 16777215;
                                      if (sm.a(var23, param0 + -12)) {
                                        var12 = 1;
                                        var8 = 16711680;
                                        break L49;
                                      } else {
                                        break L49;
                                      }
                                    }
                                    var4 = "";
                                    this.a(var9, var11[4 * var13 + 3], 540, var11[var13 * 4], var7, var23, var11[4 * var13 + 2], var21, var13, var8, var11[4 * var13 + 1]);
                                    break L48;
                                  }
                                }
                                var7 = var7 + var6;
                                var13++;
                                if (var15 == 0) {
                                  continue L44;
                                } else {
                                  break L47;
                                }
                              }
                            }
                          }
                          if (var12 == 0) {
                            var7 += 4;
                            var8 = 16711680;
                            break L46;
                          } else {
                            break L45;
                          }
                        }
                        this.a(var9, ca.field_f.field_m, param0 ^ 535, ca.field_f.field_p, var7, kn.field_J, ca.field_f.field_n, var21, -1, var8, ca.field_f.field_v);
                        break L45;
                      }
                      if (var15 == 0) {
                        break L42;
                      } else {
                        break L43;
                      }
                    }
                  }
                }
                var4 = pf.field_l;
                if (var15 == 0) {
                  break L42;
                } else {
                  var4 = mj.field_h;
                  break L42;
                }
              }
              discarded$22 = var17.a(var4, 50, 150, 540, 200, 0, -1, 1, 1, var3);
              return;
            }
          } else {
            var4 = mj.field_h;
            discarded$23 = var17.a(var4, 50, 150, 540, 200, 0, -1, 1, 1, var3);
            return;
          }
        }
    }

    public static void f(byte param0) {
        field_s = null;
        field_q = null;
        field_r = null;
        field_o = null;
        field_p = null;
        int var1 = 116 / ((param0 - -12) / 59);
    }

    final static void e(int param0, int param1) {
        int var2 = 0;
        if (fq.field_o == null) {
          if (rj.field_C[param1] == rg.field_e) {
            var2 = 20 / ((10 - param0) / 32);
            return;
          } else {
            fq.field_o = rj.field_C[param1];
            fq.field_o.field_d = dm.field_Cb;
            ci.field_o = param1;
            hn.field_d = 0;
            u.a(false, 2 - -param1);
            var2 = 20 / ((10 - param0) / 32);
            return;
          }
        } else {
          var2 = 20 / ((10 - param0) / 32);
          return;
        }
    }

    final int a(int param0, boolean param1) {
        if (!param1) {
          if (!jg.a((byte) 115)) {
            if (param0 < 2) {
              if (param0 != 0) {
                return this.field_a;
              } else {
                return this.field_m - -this.d(0, -103);
              }
            } else {
              return (this.d(param0, 53) >> 2046724481) + 320;
            }
          } else {
            return (this.d(param0, 53) >> 2046724481) + 320;
          }
        } else {
          this.c((byte) -54);
          if (!jg.a((byte) 115)) {
            if (param0 < 2) {
              if (param0 != 0) {
                return this.field_a;
              } else {
                return this.field_m - -this.d(0, -103);
              }
            } else {
              return (this.d(param0, 53) >> 2046724481) + 320;
            }
          } else {
            return (this.d(param0, 53) >> 2046724481) + 320;
          }
        }
    }

    final void c(byte param0) {
        if (param0 >= -13) {
          field_s = (String) null;
          la.a(this.field_l, nc.field_a, false, -25528);
          return;
        } else {
          la.a(this.field_l, nc.field_a, false, -25528);
          return;
        }
    }

    wh(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static void a(java.math.BigInteger param0, we param1, java.math.BigInteger param2, we param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              pg.a(param0, true, 0, param3.field_m, param2, param1, param3.field_k);
              if (param4 == 12556) {
                break L1;
              } else {
                field_s = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("wh.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
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
          L4: {
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
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        tf var4 = null;
        if (param0 <= -116) {
          var4 = oc.field_N;
          if (!jg.a((byte) 117)) {
            if ((param2 ^ -1) == -2) {
              var4 = oc.field_S;
              super.a((byte) 35, var4, param1, param2);
              return;
            } else {
              super.a((byte) 35, var4, param1, param2);
              return;
            }
          } else {
            var4 = oc.field_S;
            super.a((byte) 35, var4, param1, param2);
            return;
          }
        } else {
          field_q = (tf) null;
          var4 = oc.field_N;
          if (jg.a((byte) 117)) {
            var4 = oc.field_S;
            super.a((byte) 35, var4, param1, param2);
            return;
          } else {
            L0: {
              if ((param2 ^ -1) != -2) {
                break L0;
              } else {
                var4 = oc.field_S;
                break L0;
              }
            }
            super.a((byte) 35, var4, param1, param2);
            return;
          }
        }
    }

    static {
        field_p = null;
        field_r = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_s = "Private";
        field_o = new dj();
    }
}
