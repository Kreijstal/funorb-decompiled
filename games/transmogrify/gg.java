/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    String field_a;
    private int field_g;
    private int field_e;
    private int field_d;
    private qk[] field_b;
    float field_c;
    static hi field_f;

    final boolean a(int param0) {
        boolean stackIn_6_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        qk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                gg.c(-8);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if ((this.field_g ^ -1) <= (this.field_e ^ -1)) {
                  stackIn_40_0 = 1;
                  break L3;
                } else {
                  var2 = this.field_b[this.field_g];
                  stackOut_5_0 = var2.field_a.a((byte) -121);
                  stackIn_40_0 = stackOut_5_0 ? 1 : 0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!stackIn_6_0) {
                    this.a((byte) -128, var2, 0);
                    stackIn_11_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L4: {
                      if (-1 < (var2.field_f ^ -1)) {
                        break L4;
                      } else {
                        if (!var2.field_a.a((byte) -18, var2.field_f)) {
                          this.a((byte) -111, var2, var2.field_a.a(true, var2.field_f));
                          stackIn_19_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var2.field_g == null) {
                        break L5;
                      } else {
                        if (var2.field_a.a((byte) -1, var2.field_g)) {
                          break L5;
                        } else {
                          this.a((byte) -128, var2, var2.field_a.a(param0 + -5, var2.field_g));
                          stackIn_25_0 = 0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    L6: {
                      if (0 <= var2.field_f) {
                        break L6;
                      } else {
                        if (var2.field_g != null) {
                          break L6;
                        } else {
                          if (null == var2.field_d) {
                            break L6;
                          } else {
                            if (var2.field_a.c(32031)) {
                              break L6;
                            } else {
                              this.a((byte) -117, var2, var2.field_a.b(-22884));
                              stackIn_37_0 = 0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                    this.field_g = this.field_g + 1;
                    continue L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "gg.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_40_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0 != 0;
              } else {
                return stackIn_37_0 != 0;
              }
            }
          }
        }
    }

    public static void c(int param0) {
        try {
            field_f = null;
            int var1_int = 83 % ((27 - param0) / 58);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "gg.A(" + param0 + ')');
        }
    }

    final static void a(byte param0, int[] param1, boolean param2, boolean param3, e param4, boolean param5, int[] param6) {
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        var30 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              if (param0 >= 72) {
                break L1;
              } else {
                gg.b(-92);
                break L1;
              }
            }
            var21 = param1[3] >> -1519507710;
            var22 = param1[4] >> 848569538;
            var23 = param1[5] >> -1430636062;
            var24 = param1[6] >> -1583294590;
            var25 = param1[7] >> 173855682;
            var26 = param1[8] >> 496793186;
            var27 = param1[9] >> -664888510;
            var28 = param1[10] >> 46820450;
            var29 = param1[11] >> -1059353118;
            var13 = param6[3] * var24 + param6[4] * var25 - -(param6[5] * var26) >> -55750450;
            var12 = param6[5] * var23 + var21 * param6[3] - -(var22 * param6[4]) >> 1123797294;
            var15 = param6[8] * var23 + (var21 * param6[6] + var22 * param6[7]) >> 1524682510;
            var16 = param6[7] * var25 + param6[6] * var24 - -(param6[8] * var26) >> 782411374;
            var20 = var28 * param6[10] + var27 * param6[9] + var29 * param6[11] >> 1158086254;
            var14 = param6[5] * var29 + (var28 * param6[4] + var27 * param6[3]) >> 2122904462;
            var17 = param6[7] * var28 + (param6[6] * var27 - -(var29 * param6[8])) >> -145393170;
            var18 = param6[11] * var23 + var21 * param6[9] + param6[10] * var22 >> -1038486418;
            var19 = var24 * param6[9] - (-(param6[10] * var25) - var26 * param6[11]) >> 879284334;
            var21 = -param1[0] + param6[0];
            var22 = -param1[1] + param6[1];
            var23 = -param1[2] + param6[2];
            var9 = var23 * param1[5] + param1[3] * var21 - -(param1[4] * var22) >> 16 - nd.field_m;
            var10 = var23 * param1[8] + var21 * param1[6] + var22 * param1[7] >> -nd.field_m + 16;
            var11 = var22 * param1[10] + var21 * param1[9] - -(var23 * param1[11]) >> -186019120;
            var21 = ka.field_f;
            var22 = ka.field_g;
            var23 = 0;
            L2: while (true) {
              L3: {
                if (param4.field_M <= var23) {
                  L4: {
                    if (param4.field_j == null) {
                      break L4;
                    } else {
                      if (param4.field_a == null) {
                        break L4;
                      } else {
                        if (null == param4.field_c) {
                          break L4;
                        } else {
                          if (null == param4.field_g) {
                            break L4;
                          } else {
                            if (null == param4.field_Q) {
                              break L4;
                            } else {
                              if (param4.field_p == null) {
                                break L4;
                              } else {
                                if (param4.field_D == null) {
                                  break L4;
                                } else {
                                  if (null == param4.field_E) {
                                    break L4;
                                  } else {
                                    if (null != param4.field_m) {
                                      var23 = 0;
                                      L5: while (true) {
                                        if (param4.field_C <= var23) {
                                          break L4;
                                        } else {
                                          var24 = param4.field_j[var23];
                                          var25 = param4.field_a[var23];
                                          var26 = param4.field_c[var23];
                                          db.field_e[var23] = var9 - -(var18 * var26 + (var24 * var12 + var15 * var25) >> 1004514000);
                                          me.field_i[var23] = var10 - -(var13 * var24 - (-(var16 * var25) + -(var26 * var19)) >> -1288694832);
                                          ec.field_c[var23] = (var14 * var24 + (var17 * var25 + var20 * var26) >> 2123508272) + var11;
                                          var24 = param4.field_g[var23];
                                          var25 = param4.field_Q[var23];
                                          var26 = param4.field_p[var23];
                                          nk.field_e[var23] = (var18 * var26 + var24 * var12 + var15 * var25 >> -2050122704) + var9;
                                          qe.field_z[var23] = var10 + (var26 * var19 + var16 * var25 + var13 * var24 >> 1827838512);
                                          wi.field_d[var23] = (var25 * var17 + var14 * var24 - -(var26 * var20) >> -1486038064) + var11;
                                          var24 = param4.field_D[var23];
                                          var25 = param4.field_E[var23];
                                          var26 = param4.field_m[var23];
                                          bl.field_d[var23] = (var15 * var25 + var12 * var24 - -(var18 * var26) >> 1918160240) + var9;
                                          rl.field_d[var23] = var10 - -(var19 * var26 + (var25 * var16 + var13 * var24) >> -1183705168);
                                          kf.field_g[var23] = (var14 * var24 - -(var17 * var25) - -(var26 * var20) >> -773720144) + var11;
                                          var23++;
                                          continue L5;
                                        }
                                      }
                                    } else {
                                      break L4;
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
                  if (param2) {
                    var9 = param6[3];
                    var10 = param6[4];
                    var11 = param6[5];
                    var12 = param6[6];
                    var13 = param6[7];
                    var14 = param6[8];
                    var15 = param6[9];
                    var16 = param6[10];
                    var17 = param6[11];
                    var18 = 0;
                    L6: while (true) {
                      stackIn_60_0 = var18;
                      stackIn_60_1 = param4.field_l;
                      if (stackIn_60_0 >= stackIn_60_1) {
                        break L3;
                      } else {
                        stackIn_63_0 = var18 ^ -1;
                        stackIn_63_1 = mk.field_w.length ^ -1;
                        if (stackIn_63_0 <= stackIn_63_1) {
                          break L3;
                        } else {
                          var19 = param4.field_e[var18];
                          var20 = param4.field_F[var18];
                          var21 = param4.field_L[var18];
                          mk.field_w[var18] = var15 * var21 + (var9 * var19 + var12 * var20) >> -577623920;
                          nh.field_j[var18] = var19 * var10 + (var20 * var13 + var21 * var16) >> 291076144;
                          d.field_b[var18] = var21 * var17 + (var14 * var20 + var19 * var11) >> 1438355760;
                          var18++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                } else {
                  var24 = param4.field_v[var23];
                  var25 = param4.field_d[var23];
                  var26 = param4.field_B[var23];
                  var27 = var9 + (var25 * var15 + var12 * var24 - -(var26 * var18) >> 16 - nd.field_m);
                  var28 = (var25 * var16 + (var24 * var13 - -(var26 * var19)) >> -nd.field_m + 16) + var10;
                  var29 = var11 + (var20 * var26 + var14 * var24 + var17 * var25 >> -2142061136);
                  stackIn_60_0 = var29 ^ -1;

                  stackIn_60_1 = -51;

                  L8: {
                    if (stackIn_60_0 <= stackIn_60_1) {
                      L9: {
                        sg.field_a[var23] = var27 / var29 + var21;
                        d.field_a[var23] = var22 + var28 / var29;
                        if (var7_int <= var29) {
                          break L9;
                        } else {
                          var7_int = var29;
                          break L9;
                        }
                      }
                      nd.field_l[var23] = var29;
                      if ((var8 ^ -1) <= (var29 ^ -1)) {
                        break L8;
                      } else {
                        var8 = var29;
                        break L8;
                      }
                    } else {
                      nd.field_l[var23] = -2147483648;
                      break L8;
                    }
                  }
                  L10: {
                    if (!param5) {
                      break L10;
                    } else {
                      el.field_m[var23] = var27 >> nd.field_m;
                      hi.field_h[var23] = var28 >> nd.field_m;
                      rk.field_q[var23] = var29;
                      break L10;
                    }
                  }
                  var23++;
                  continue L2;
                }
              }
              ej.a(var8, (byte) -128, param4, param3, var7_int);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var7);

            stackIn_72_1 = new StringBuilder().append("gg.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L11;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L12;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L13;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L13;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_73_0), stackIn_81_2 + ')');
        }
    }

    final static void b(int param0) {
        try {
            dg.b(-81);
            ba.a(119, param0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "gg.D(" + param0 + ')');
        }
    }

    private gg() throws Throwable {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "gg.<init>()");
        }
    }

    private final void a(byte param0, qk param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -107) {
                break L1;
              } else {
                field_f = (hi) null;
                break L1;
              }
            }
            L2: {
              var4_float = (float)(1 + this.field_g) + (float)param2 / 100.0f;
              if ((param2 ^ -1) != -1) {
                this.field_a = param1.field_d + " - " + param2 + "%";
                break L2;
              } else {
                this.field_a = param1.field_b;
                break L2;
              }
            }
            this.field_c = (float)this.field_d * var4_float / (float)(1 + this.field_e);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("gg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    static {
        field_f = new hi();
    }
}
