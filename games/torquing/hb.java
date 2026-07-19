/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends am {
    static String[] field_u;
    private int field_w;
    static int field_y;
    private int field_t;
    static int field_s;
    private int field_z;
    static qc field_x;
    private int field_v;

    final static da a(boolean param0) {
        if (param0) {
            hb.b(48);
        }
        String var1 = ki.i(20);
        if (var1 != null) {
            if (0 <= var1.indexOf('@')) {
                var1 = "";
            }
        }
        return new da(ki.i(20), dc.b(true));
    }

    final static void a(int param0, boolean param1, t param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        t var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var19 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (ph.field_k <= param0) {
                break L1;
              } else {
                param4 = param4 - (ph.field_k - param0);
                param0 = ph.field_k;
                break L1;
              }
            }
            L2: {
              if (param0 + param4 <= ph.field_a) {
                break L2;
              } else {
                param4 = ph.field_a + -param0;
                break L2;
              }
            }
            L3: {
              if (param6 >= ph.field_c) {
                break L3;
              } else {
                param3 = param3 - (-param6 + ph.field_c);
                param6 = ph.field_c;
                break L3;
              }
            }
            L4: {
              if (ph.field_h < param3 + param6) {
                param3 = -param6 + ph.field_h;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param4 <= 0) {
                break L5;
              } else {
                if ((param3 ^ -1) >= -1) {
                  break L5;
                } else {
                  L6: {
                    var21 = param2.c();
                    var30 = ph.field_e;
                    var10 = ph.field_j;
                    var11 = ph.field_d;
                    var29 = new int[4];
                    ph.b(var29);
                    param2.e();
                    if (!param1) {
                      break L6;
                    } else {
                      hb.b(-75);
                      break L6;
                    }
                  }
                  ph.f(var29[0], var29[1], var29[2], var29[3]);
                  var13 = param2.field_s * param6 + param0;
                  var14 = param2.field_s - param4;
                  var25 = var21.field_y;
                  var22 = var25;
                  var15 = var22;
                  var16 = param6;
                  L7: while (true) {
                    if (var16 >= param6 + param3) {
                      var21.d(-param2.field_v, -param2.field_r);
                      ph.a(var30, var10, var11);
                      ph.a(var29);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var17 = param0;
                      L8: while (true) {
                        if (param0 + param4 <= var17) {
                          var13 = var13 + var14;
                          var16++;
                          continue L7;
                        } else {
                          L9: {
                            var18 = var25[var13];
                            if (-1 != (var18 ^ -1)) {
                              L10: {
                                L11: {
                                  if (var17 <= 0) {
                                    break L11;
                                  } else {
                                    if (-1 == (var15[-1 + var13] ^ -1)) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if (-1 <= (var16 ^ -1)) {
                                    break L12;
                                  } else {
                                    if (var15[-param2.field_s + var13] == 0) {
                                      break L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                L13: {
                                  if (var17 >= -1 + param2.field_s) {
                                    break L13;
                                  } else {
                                    if (var15[1 + var13] == 0) {
                                      break L10;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                if (-1 + param2.field_t > var16) {
                                  if (0 == var15[var13 - -param2.field_s]) {
                                    break L10;
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  var13++;
                                  var17++;
                                  continue L8;
                                }
                              }
                              ph.d(var17, var16, param7, param5);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var13++;
                          var17++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var8 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var8);
            stackOut_40_1 = new StringBuilder().append("hb.A(").append(param0).append(',').append(param1).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param2 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L14;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L14;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public hb() {
        super(0, true);
        this.field_t = 0;
        this.field_w = 20;
        this.field_z = 1365;
        this.field_v = 0;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        uk.field_a[vg.field_o] = param5;
        lp.field_g[vg.field_o] = vg.field_o;
        il.field_o[vg.field_o] = param0;
        if (param0 > mc.field_l) {
            qd.field_g = param0;
        }
        if (param0 < ga.field_c) {
            lj.field_d = param0;
        }
        wh.field_y[vg.field_o] = param1;
        vo.field_d[vg.field_o] = param4;
        vp.field_F[vg.field_o] = param3;
        int var6 = param1 + param4 + param3;
        int var7 = var6 != 0 ? 1000 * param1 / var6 : 0;
        ji.field_a[vg.field_o] = var7;
        if (param2) {
            field_s = 26;
        }
        if (!(var7 <= qd.field_g)) {
            qd.field_g = var7;
        }
        if (var7 < lj.field_d) {
            lj.field_d = var7;
        }
        vg.field_o = vg.field_o + 1;
    }

    public static void b(int param0) {
        if (param0 != -799778388) {
            return;
        }
        field_x = null;
        field_u = null;
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        L0: {
          var14 = Torquing.field_u;
          var15 = this.field_l.a(param1, 25657);
          var3 = var15;
          if (param0 > 86) {
            break L0;
          } else {
            field_s = 59;
            break L0;
          }
        }
        L1: {
          if (!this.field_l.field_b) {
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (ci.field_c <= var4) {
                break L1;
              } else {
                var5 = (q.field_b[var4] << -2140445844) / this.field_z + this.field_v;
                var6 = (dp.field_a[param1] << 860028396) / this.field_z - -this.field_t;
                var7 = var5;
                var8 = var6;
                var9 = var5;
                var10 = var6;
                var11 = var5 * var5 >> -771939956;
                var12 = var6 * var6 >> -242533716;
                var13 = 0;
                L3: while (true) {
                  L4: {
                    if ((var11 - -var12 ^ -1) <= -16385) {
                      break L4;
                    } else {
                      if (this.field_w <= var13) {
                        break L4;
                      } else {
                        var10 = var8 + 2 * (var9 * var10 >> 456370988);
                        var9 = var11 + -var12 - -var7;
                        var12 = var10 * var10 >> 650470956;
                        var11 = var9 * var9 >> -799778388;
                        var13++;
                        continue L3;
                      }
                    }
                  }
                  L5: {
                    stackOut_9_0 = (int[]) (var15);
                    stackOut_9_1 = var4;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (-1 + this.field_w > var13) {
                      stackOut_11_0 = (int[]) ((Object) stackIn_11_0);
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = (var13 << 1574092108) / this.field_w;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      break L5;
                    } else {
                      stackOut_10_0 = (int[]) ((Object) stackIn_10_0);
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      break L5;
                    }
                  }
                  stackIn_12_0[stackIn_12_1] = stackIn_12_2;
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        return var15;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
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
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param1 == 35) {
                break L1;
              } else {
                field_x = (qc) null;
                break L1;
              }
            }
            L2: {
              var4_int = param2;
              if (0 == var4_int) {
                this.field_z = param0.i(7088);
                break L2;
              } else {
                if ((var4_int ^ -1) == -2) {
                  this.field_w = param0.i(param1 ^ 7059);
                  break L2;
                } else {
                  if (-3 != (var4_int ^ -1)) {
                    if (var4_int != 3) {
                      break L2;
                    } else {
                      this.field_t = param0.i(7088);
                      break L2;
                    }
                  } else {
                    this.field_v = param0.i(7088);
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("hb.H(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_u = new String[25];
        field_y = 0;
    }
}
