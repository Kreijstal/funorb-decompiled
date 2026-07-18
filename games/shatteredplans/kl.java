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
        RuntimeException var8 = null;
        sd[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ln[] var12_ref_ln__ = null;
        int var12 = 0;
        int var13 = 0;
        ln var14_ref_ln = null;
        int var14 = 0;
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
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        ((kl) this).field_p = false;
        try {
          L0: {
            var24 = new sd[param0.field_D.length];
            var8_array = var24;
            var9 = 0;
            var12_ref_ln__ = param0.field_D;
            var13 = 0;
            L1: while (true) {
              if (var13 >= var12_ref_ln__.length) {
                if (var9 != 0) {
                  var15 = (sd) (Object) param1.d(0);
                  var16 = null;
                  ((kl) this).field_j = 0;
                  var10 = 0;
                  L2: while (true) {
                    if (var15 == null) {
                      L3: {
                        ((kl) this).field_j = ((kl) this).field_j + 50 * (-1 + var9);
                        if (!(param4 instanceof ui)) {
                          break L3;
                        } else {
                          if (((kl) this).field_n.field_p != 36) {
                            break L3;
                          } else {
                            ((kl) this).field_j = ((kl) this).field_j + 100;
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (!(param4 instanceof hp)) {
                          break L4;
                        } else {
                          if (((kl) this).field_n.field_L != 2) {
                            break L4;
                          } else {
                            L5: {
                              if (!param6.field_o.field_i) {
                                var17 = ((sd) var16).field_r;
                                break L5;
                              } else {
                                var17 = param3.field_m.field_r;
                                break L5;
                              }
                            }
                            L6: {
                              if (-5 * ((kl) this).field_n.field_G[0] <= var17) {
                                break L6;
                              } else {
                                ((kl) this).field_j = ((kl) this).field_j - 100;
                                break L6;
                              }
                            }
                            if (null == ((kl) this).field_n.field_y) {
                              break L4;
                            } else {
                              if (((kl) this).field_n.field_y.field_x != param5) {
                                break L4;
                              } else {
                                ((kl) this).field_j = ((kl) this).field_j + 100;
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      L7: {
                        ((kl) this).field_i = param0.field_x;
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
                                  ((kl) this).field_i = ((kl) this).field_i + var28.field_x;
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
                                    ((kl) this).field_i = ((kl) this).field_i + var26.field_x;
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
                          ((kl) this).field_i = 2 * ((kl) this).field_i;
                          break L13;
                        }
                      }
                      L14: {
                        if (param6.field_o.field_l) {
                          break L14;
                        } else {
                          var17 = 0;
                          var18 = ((kl) this).field_n.field_D;
                          var19 = 0;
                          L15: while (true) {
                            if (var18.length <= var19) {
                              L16: {
                                if (((kl) this).field_i <= 0) {
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
                              ((kl) this).field_i = ((kl) this).field_i + var17;
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
                        if (((kl) this).field_i != 0) {
                          break L18;
                        } else {
                          ((kl) this).field_i = 1;
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
                                if (var22 >= 4) {
                                  break L20;
                                } else {
                                  L22: {
                                    var12 = var12 + param0.field_G[var22] * param2[var10][var22];
                                    if (var12 >= 0) {
                                      break L22;
                                    } else {
                                      var12 = -var12;
                                      break L22;
                                    }
                                  }
                                  L23: {
                                    if (var12 <= ((kl) this).field_j) {
                                      break L23;
                                    } else {
                                      ((kl) this).field_j = var12;
                                      var16 = (Object) (Object) var15;
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
                        var15 = (sd) (Object) param1.a((byte) -71);
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
                        var8_array[var9] = var14_ref_ln.field_R;
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
            var8 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var8;
            stackOut_71_1 = new StringBuilder().append("kl.<init>(");
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param0 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L27;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L27;
            }
          }
          L28: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param1 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L28;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L28;
            }
          }
          L29: {
            stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',');
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param2 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L29;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L29;
            }
          }
          L30: {
            stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
            stackOut_80_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',');
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param3 == null) {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L30;
            } else {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L30;
            }
          }
          L31: {
            stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
            stackOut_83_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_83_2).append(',');
            stackIn_85_0 = stackOut_83_0;
            stackIn_85_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param4 == null) {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L31;
            } else {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "{...}";
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_86_2 = stackOut_84_2;
              break L31;
            }
          }
          L32: {
            stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
            stackOut_86_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_86_2).append(',').append(param5).append(',');
            stackIn_88_0 = stackOut_86_0;
            stackIn_88_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param6 == null) {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L32;
            } else {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "{...}";
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_89_2 = stackOut_87_2;
              break L32;
            }
          }
          throw r.a((Throwable) (Object) stackIn_89_0, stackIn_89_2 + ')');
        }
    }

    final static boolean d(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 95) {
            break L0;
          } else {
            boolean discarded$6 = kl.d((byte) -4);
            break L0;
          }
        }
        L1: {
          L2: {
            int discarded$7 = 1;
            if (w.d()) {
              break L2;
            } else {
              if (0 < es.field_m) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public static void d() {
        field_s = null;
        field_q = null;
        field_r = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        RuntimeException decompiledCaughtException = null;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 16711680;
              if (param5 > 100) {
                param5 = 100;
                break L1;
              } else {
                break L1;
              }
            }
            gf.f(18, 455, 101, 16777215);
            var8 = 0;
            gf.a(17, 456, 16777215);
            gf.f(18, 456, 99, 0);
            gf.a(118, 456, 16777215);
            var9 = 2;
            L2: while (true) {
              if (var9 >= 3) {
                var9 = 3;
                L3: while (true) {
                  if (var9 >= 7) {
                    var9 = 7;
                    L4: while (true) {
                      if (var9 >= 8) {
                        gf.f(15, 464, 101, 16777215);
                        gf.a(15, 463, 16777215);
                        gf.f(16, 463, 99, 0);
                        gf.a(116, 463, 16777215);
                        break L0;
                      } else {
                        L5: {
                          var10 = (var9 * 256 - 512) / 6;
                          var11 = (16711680 & var8 * (256 + -var10) + 65280 * (var10 >> 1) | var7_int * (256 - var10) + 16711935 * (var10 >> 1) & -16711936) >>> 8;
                          var12 = ((var10 >> 1) * 16711935 + 1073758208 + -(var10 * 4194368) & -16711936 | (var10 >> 1) * 65280 + 16384 * (-var10 + 256) & 16711680) >>> 8;
                          var13 = 8355711 & var12 >> 1;
                          var14 = var9 + 455;
                          var15 = -var9 + (25 + (param5 - 1));
                          var16 = var15 + 5;
                          var17 = 122 - (-2 - -var9);
                          gf.a(15, var14, 16777215);
                          if (var17 >= var16) {
                            break L5;
                          } else {
                            var16 = var17;
                            break L5;
                          }
                        }
                        gf.a(16, var14, 0);
                        gf.f(17, var14, var15 - 17, var11);
                        gf.f(var15, var14, -var15 + var16, var13);
                        gf.f(var16, var14, -var16 + var17, var12);
                        gf.a(var17, var14, 16777215);
                        gf.a(-1 + var17, var14, 0);
                        var9++;
                        continue L4;
                      }
                    }
                  } else {
                    L6: {
                      var10 = (-2 + var9) * 256 / 6;
                      var11 = (-16711936 & (var10 >> 1) * 16711935 + (-var10 + 256) * var7_int | (-var10 + 256) * var8 + 65280 * (var10 >> 1) & 16711680) >>> 8;
                      var12 = (16711680 & (-var10 + 256) * 8192 + 49152 * (var10 >> 1) | -16711936 & 2097184 * (256 - var10) + 12583104 * (var10 >> 1)) >>> 8;
                      var13 = (16711422 & var12) >> 1;
                      var14 = var9 + 455;
                      var15 = 15 - -param5 + 3;
                      var16 = var15 + 5;
                      var17 = 118;
                      if (var17 < var16) {
                        var16 = var17;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    gf.a(15, var14, 16777215);
                    gf.a(16, var14, 0);
                    gf.f(17, var14, var15 - 17, var11);
                    gf.f(var15, var14, var16 - var15, var13);
                    gf.f(var16, var14, -var16 + var17, var12);
                    gf.a(118, var14, 16777215);
                    gf.a(117, var14, 0);
                    var9++;
                    continue L3;
                  }
                }
              } else {
                L7: {
                  var10 = (var9 * 256 + -512) / 6;
                  var11 = (-16711936 & (var10 >> 1) * 16711935 + (-var10 + 256) * var7_int | 16711680 & (256 - var10) * var8 + (var10 >> 1) * 65280) >>> 8;
                  var12 = (-16711936 & 12583104 * (var10 >> 1) + 536879104 - 2097184 * var10 | 16711680 & (var10 >> 1) * 49152 + (2097152 - var10 * 8192)) >>> 8;
                  var13 = 8355711 & var12 >> 1;
                  var14 = 455 + var9;
                  var15 = 15 - (-3 + var9);
                  var16 = 3 + param5 + 15;
                  var17 = var16 - -5;
                  var18 = 118;
                  if (var17 > var18) {
                    var17 = var18;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                gf.a(var15, var14, 16777215);
                gf.a(1 + var15, var14, 0);
                gf.f(2 + var15, var14, var16 + -var15 - 2, var11);
                gf.f(var16, var14, var17 + -var16, var13);
                gf.f(var17, var14, var18 + -var17, var12);
                gf.a(var18, var14, 16777215);
                gf.a(var18 - 1, var14, 0);
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var7, "kl.D(" + 73 + ',' + 455 + ',' + 15 + ',' + 16711680 + ',' + 10 + ',' + param5 + ',' + 100 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "In the first half of the 22nd Century (Old Earth Reckoning) scientists in the Escher Programme began research into faster-than-light travel.";
    }
}
