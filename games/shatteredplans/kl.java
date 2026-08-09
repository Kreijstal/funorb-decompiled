/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends wf {
    static int field_t;
    static int field_o;
    static bc field_s;
    static bi[] field_q;
    boolean field_p;
    static String field_r;

    kl(ln param0, pf param1, int[][] param2, fs param3, me param4, int param5, dc param6) {
        super(param0);
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_79_1 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_82_1 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        StringBuilder stackIn_85_1 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        StringBuilder stackIn_88_1 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        sd[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ln[] var12_ref_ln__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ln var14_ref_ln = null;
        sd var15 = null;
        Object var16 = null;
        int var17 = 0;
        int var18_int = 0;
        ln[] var18 = null;
        int var19 = 0;
        ln var20 = null;
        int var22 = 0;
        int var23 = 0;
        sd[] var24 = null;
        ln[] var25 = null;
        ln var26 = null;
        ln[] var27 = null;
        ln var28 = null;
        this.field_p = false;
        try {
          L0: {
            var24 = new sd[param0.field_D.length];
            var8 = var24;
            var9 = 0;
            var12_ref_ln__ = param0.field_D;
            var13 = 0;
            L1: while (true) {
              if (var13 >= var12_ref_ln__.length) {
                if (-1 != (var9 ^ -1)) {
                  var15 = (sd) ((Object) param1.d(0));
                  var16 = null;
                  this.field_j = 0;
                  var10 = 0;
                  L2: while (true) {
                    if (var15 == null) {
                      L3: {
                        this.field_j = this.field_j + 50 * (-1 + var9);
                        if (!(param4 instanceof ui)) {
                          break L3;
                        } else {
                          if (-37 != (this.field_n.field_p ^ -1)) {
                            break L3;
                          } else {
                            this.field_j = this.field_j + 100;
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (!(param4 instanceof hp)) {
                          break L4;
                        } else {
                          if (this.field_n.field_L != 2) {
                            break L4;
                          } else {
                            L5: {
                              if (!param6.field_o.field_i) {
                                var17 = ((sd) (var16)).field_r;
                                break L5;
                              } else {
                                var17 = param3.field_m.field_r;
                                break L5;
                              }
                            }
                            L6: {
                              if (-5 * this.field_n.field_G[0] <= var17) {
                                break L6;
                              } else {
                                this.field_j = this.field_j - 100;
                                break L6;
                              }
                            }
                            if (null == this.field_n.field_y) {
                              break L4;
                            } else {
                              if (this.field_n.field_y.field_x != param5) {
                                break L4;
                              } else {
                                this.field_j = this.field_j + 100;
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      L7: {
                        this.field_i = param0.field_x;
                        if (null != param0.field_y) {
                          var27 = param0.field_D;
                          var23 = 0;
                          var18_int = var23;
                          L8: while (true) {
                            if (var23 >= var27.length) {
                              break L7;
                            } else {
                              L9: {
                                var28 = var27[var23];
                                if (param3 == var28.field_y) {
                                  break L9;
                                } else {
                                  L10: {
                                    if (param0.field_y == var28.field_y) {
                                      break L10;
                                    } else {
                                      if (null == var28.field_y) {
                                        break L9;
                                      } else {
                                        if (param0.field_y.field_h[var28.field_y.field_x]) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                  this.field_i = this.field_i + var28.field_x;
                                  break L9;
                                }
                              }
                              var23++;
                              continue L8;
                            }
                          }
                        } else {
                          var25 = param0.field_D;
                          var18_int = 0;
                          L11: while (true) {
                            if (var18_int >= var25.length) {
                              break L7;
                            } else {
                              L12: {
                                var26 = var25[var18_int];
                                if (param3 == var26.field_y) {
                                  break L12;
                                } else {
                                  if (var26.field_y == null) {
                                    break L12;
                                  } else {
                                    this.field_i = this.field_i + var26.field_x;
                                    break L12;
                                  }
                                }
                              }
                              var18_int++;
                              continue L11;
                            }
                          }
                        }
                      }
                      L13: {
                        if (!param0.field_u) {
                          break L13;
                        } else {
                          this.field_i = 2 * this.field_i;
                          break L13;
                        }
                      }
                      L14: {
                        if (param6.field_o.field_l) {
                          break L14;
                        } else {
                          var17 = 0;
                          var18 = this.field_n.field_D;
                          var19 = 0;
                          L15: while (true) {
                            if (var18.length <= var19) {
                              L16: {
                                if ((this.field_i ^ -1) >= -1) {
                                  break L16;
                                } else {
                                  if (0 >= var17) {
                                    break L16;
                                  } else {
                                    var17++;
                                    break L16;
                                  }
                                }
                              }
                              this.field_i = this.field_i + var17;
                              break L14;
                            } else {
                              L17: {
                                var20 = var18[var19];
                                if (param3 == var20.field_y) {
                                  break L17;
                                } else {
                                  var17++;
                                  break L17;
                                }
                              }
                              var19++;
                              continue L15;
                            }
                          }
                        }
                      }
                      L18: {
                        if (this.field_i != 0) {
                          break L18;
                        } else {
                          this.field_i = 1;
                          break L18;
                        }
                      }
                      break L0;
                    } else {
                      var14 = 0;
                      L19: while (true) {
                        L20: {
                          if (var9 <= var14) {
                            break L20;
                          } else {
                            if (var24[var14] != var15) {
                              var14++;
                              continue L19;
                            } else {
                              var12 = 0;
                              var22 = 0;
                              var13 = var22;
                              L21: while (true) {
                                if ((var22 ^ -1) <= -5) {
                                  break L20;
                                } else {
                                  L22: {
                                    var12 = var12 + param0.field_G[var22] * param2[var10][var22];
                                    if ((var12 ^ -1) <= -1) {
                                      break L22;
                                    } else {
                                      var12 = -var12;
                                      break L22;
                                    }
                                  }
                                  L23: {
                                    if (var12 <= this.field_j) {
                                      break L23;
                                    } else {
                                      this.field_j = var12;
                                      var16 = var15;
                                      break L23;
                                    }
                                  }
                                  var22++;
                                  continue L21;
                                }
                              }
                            }
                          }
                        }
                        var15 = (sd) ((Object) param1.a((byte) -71));
                        var10++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  throw new RuntimeException("Target star " + param0.field_I + " does not appear to be connected to any of AI's stars.");
                }
              } else {
                L24: {
                  var14_ref_ln = var12_ref_ln__[var13];
                  if (var14_ref_ln.field_y != param3) {
                    break L24;
                  } else {
                    var11 = 0;
                    var10 = 0;
                    L25: while (true) {
                      L26: {
                        if (var10 >= var9) {
                          break L26;
                        } else {
                          if (var24[var10] != var14_ref_ln.field_R) {
                            var10++;
                            continue L25;
                          } else {
                            var11 = 1;
                            break L26;
                          }
                        }
                      }
                      if (var11 != 0) {
                        break L24;
                      } else {
                        var8[var9] = var14_ref_ln.field_R;
                        var9++;
                        break L24;
                      }
                    }
                  }
                }
                var13++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var8_ref = decompiledCaughtException;
            stackIn_73_0 = (RuntimeException) (var8_ref);

            stackIn_73_1 = new StringBuilder().append("kl.<init>(");

            if (param0 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L27;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_76_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');

            if (param1 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L28;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L28;
            }
          }
          L29: {


            stackIn_79_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',');

            if (param2 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L29;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L29;
            }
          }
          L30: {


            stackIn_82_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',');

            if (param3 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L30;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
              break L30;
            }
          }
          L31: {


            stackIn_85_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_83_2).append(',');

            if (param4 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackIn_86_2 = "null";
              break L31;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackIn_86_2 = "{...}";
              break L31;
            }
          }
          L32: {


            stackIn_88_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_86_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackIn_89_2 = "null";
              break L32;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackIn_89_2 = "{...}";
              break L32;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_74_0), stackIn_89_2 + ')');
        }
    }

    final static boolean d(byte param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 >= 95) {
            break L0;
          } else {
            kl.d((byte) -4);
            break L0;
          }
        }
        L1: {
          L2: {
            if (w.d(true)) {
              break L2;
            } else {
              if (0 < es.field_m) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public static void d(int param0) {
        field_s = null;
        field_q = null;
        if (param0 > -53) {
            kl.d((byte) 123);
        }
        field_r = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        int var18 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            var7_int = param3 & 16711935;
            if (!(param5 <= param6)) {
                param5 = param6;
            }
            gf.f(3 + param2, param1, 4 + param6 + -3, 16777215);
            var8 = param3 & 65280;
            gf.a(param2 + 3 - 1, 1 + param1, 16777215);
            gf.f(3 + param2, 1 + param1, -3 + (param6 + 2), 0);
            gf.a(3 + (param6 + param2), 1 + param1, 16777215);
            for (var9 = 2; var9 < 3; var9++) {
                var10 = (var9 * 256 + -512) / (param4 - 4);
                var11 = (-16711936 & (var10 >> 2124687521) * 16711935 + (-var10 + 256) * var7_int | 16711680 & (256 - var10) * var8 + (var10 >> 781713377) * 65280) >>> 1453120424;
                var12 = (-16711936 & 12583104 * (var10 >> 1064213697) + 536879104 - 2097184 * var10 | 16711680 & (var10 >> -602231807) * 49152 + (2097152 - var10 * 8192)) >>> -219704792;
                var13 = 8355711 & var12 >> 34204449;
                var14 = param1 + var9;
                var15 = param2 - (-3 + var9);
                var16 = 3 + param5 + param2;
                var17 = var16 - -5;
                var18 = param6 + param2 + 3;
                if (!(var17 <= var18)) {
                    var17 = var18;
                }
                gf.a(var15, var14, 16777215);
                gf.a(1 + var15, var14, 0);
                gf.f(2 + var15, var14, var16 + -var15 - 2, var11);
                gf.f(var16, var14, var17 + -var16, var13);
                gf.f(var17, var14, var18 + -var17, var12);
                gf.a(var18, var14, 16777215);
                gf.a(var18 - 1, var14, 0);
            }
            if (param0 < 12) {
                field_r = (String) null;
            }
            for (var9 = 3; var9 < -3 + param4; var9++) {
                var10 = (-2 + var9) * 256 / (param4 - 4);
                var11 = (-16711936 & (var10 >> -1782260415) * 16711935 + (-var10 + 256) * var7_int | (-var10 + 256) * var8 + 65280 * (var10 >> -823623263) & 16711680) >>> 1502004008;
                var12 = (16711680 & (-var10 + 256) * 8192 + 49152 * (var10 >> 1866955681) | -16711936 & 2097184 * (256 - var10) + 12583104 * (var10 >> -2088532895)) >>> -843651544;
                var13 = (16711422 & var12) >> -1721998751;
                var14 = var9 + param1;
                var15 = param2 - -param5 + 3;
                var16 = var15 + 5;
                var17 = param6 + param2 - -3;
                if (!((var17 ^ -1) <= (var16 ^ -1))) {
                    var16 = var17;
                }
                gf.a(param2, var14, 16777215);
                gf.a(1 + param2, var14, 0);
                gf.f(2 + param2, var14, var15 - param2 - 2, var11);
                gf.f(var15, var14, var16 - var15, var13);
                gf.f(var16, var14, -var16 + var17, var12);
                gf.a(3 + (param6 + param2), var14, 16777215);
                gf.a(2 + (param6 + param2), var14, 0);
            }
            for (var9 = param4 - 3; var9 < -2 + param4; var9++) {
                var10 = (var9 * 256 - 512) / (param4 + -4);
                var11 = (16711680 & var8 * (256 + -var10) + 65280 * (var10 >> -1658367999) | var7_int * (256 - var10) + 16711935 * (var10 >> -280830879) & -16711936) >>> 58022056;
                var12 = ((var10 >> 837909057) * 16711935 + 1073758208 + -(var10 * 4194368) & -16711936 | (var10 >> 258183137) * 65280 + 16384 * (-var10 + 256) & 16711680) >>> -1301822424;
                var13 = 8355711 & var12 >> -261580447;
                var14 = var9 + param1;
                var15 = -var9 + (param4 + param2 + (param5 + 2 - 3));
                var16 = var15 + 5;
                var17 = -3 + param4 + (param2 - -param6) - (-2 - -var9);
                gf.a(param2, var14, 16777215);
                if (var17 < var16) {
                    var16 = var17;
                }
                gf.a(1 + param2, var14, 0);
                gf.f(2 + param2, var14, var15 - (param2 + 2), var11);
                gf.f(var15, var14, -var15 + var16, var13);
                gf.f(var16, var14, -var16 + var17, var12);
                gf.a(var17, var14, 16777215);
                gf.a(-1 + var17, var14, 0);
            }
            gf.f(param2, param1 - (-param4 - -1), 1 + param6, 16777215);
            gf.a(param2, param1 - -param4 - 2, 16777215);
            gf.f(param2 - -1, param1 + (param4 + -2), param6 - 1, 0);
            gf.a(-3 + param2 + param6 + 4, param1 + param4 + -2, 16777215);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "kl.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_r = "In the first half of the 22nd Century (Old Earth Reckoning) scientists in the Escher Programme began research into faster-than-light travel.";
    }
}
