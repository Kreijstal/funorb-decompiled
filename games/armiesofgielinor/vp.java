/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp extends oj {
    static String field_A;
    int field_E;
    int field_C;
    int field_z;
    static String[] field_y;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, byte param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
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
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        var19 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 > param3) {
                break L1;
              } else {
                if (param1 >= tm.field_q) {
                  break L1;
                } else {
                  L2: {
                    if ((param7 ^ -1) <= -1) {
                      break L2;
                    } else {
                      if (0 <= param4) {
                        break L2;
                      } else {
                        if (-1 >= (param2 ^ -1)) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (tm.field_l > param7) {
                      break L3;
                    } else {
                      if (tm.field_l > param4) {
                        break L3;
                      } else {
                        if (tm.field_l > param2) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      var14 = -param1 + param3;
                      if (param0 == param1) {
                        break L5;
                      } else {
                        L6: {
                          L7: {
                            var10 = param7 << -374352912;
                            var9_int = param7 << -374352912;
                            var15 = param0 - param1;
                            var12 = (param2 - param7 << 1193852592) / var14;
                            var11 = (-param7 + param4 << -1746576048) / var15;
                            if (var11 < var12) {
                              break L7;
                            } else {
                              var16 = var11;
                              var11 = var12;
                              var12 = var16;
                              var13 = 1;
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var13 = 0;
                          break L6;
                        }
                        L8: {
                          L9: {
                            L10: {
                              if ((param1 ^ -1) > -1) {
                                L11: {
                                  if (param0 >= 0) {
                                    break L11;
                                  } else {
                                    param1 = param0 + -param1;
                                    var10 = var10 + param1 * var12;
                                    var9_int = var9_int + var11 * param1;
                                    param1 = param0;
                                    if (var19 == 0) {
                                      break L9;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                param1 = -param1;
                                var9_int = var9_int + var11 * param1;
                                var10 = var10 + var12 * param1;
                                param1 = 0;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            var16 = tm.field_k[param1];
                            L12: while (true) {
                              if (param0 <= param1) {
                                break L9;
                              } else {
                                var17 = var9_int >> 1585780432;
                                stackOut_26_0 = var17;
                                stackOut_26_1 = tm.field_l;
                                stackIn_45_0 = stackOut_26_0;
                                stackIn_45_1 = stackOut_26_1;
                                stackIn_27_0 = stackOut_26_0;
                                stackIn_27_1 = stackOut_26_1;
                                if (var19 != 0) {
                                  break L8;
                                } else {
                                  L13: {
                                    if (stackIn_27_0 >= stackIn_27_1) {
                                      break L13;
                                    } else {
                                      L14: {
                                        var18 = (var10 >> 735718256) - (var9_int >> 1628801776);
                                        if (var18 != 0) {
                                          break L14;
                                        } else {
                                          if ((var17 ^ -1) > -1) {
                                            break L13;
                                          } else {
                                            if (tm.field_l <= var17) {
                                              break L13;
                                            } else {
                                              tf.a(var16 + var17, -1432128863, var18, param6, param5);
                                              if (var19 == 0) {
                                                break L13;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L15: {
                                        if (tm.field_l <= var17 + var18) {
                                          var18 = -var17 + tm.field_l + -1;
                                          break L15;
                                        } else {
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        if ((var17 ^ -1) > -1) {
                                          break L16;
                                        } else {
                                          tf.a(var17 + var16, -1432128863, var18, param6, param5);
                                          if (var19 == 0) {
                                            break L13;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      tf.a(var16, param8 + -1432128883, var17 + var18, param6, param5);
                                      break L13;
                                    }
                                  }
                                  param1++;
                                  if (param1 >= tm.field_q) {
                                    decompiledRegionSelector0 = 3;
                                    break L0;
                                  } else {
                                    var16 = var16 + qn.field_l;
                                    var9_int = var9_int + var11;
                                    var10 = var10 + var12;
                                    continue L12;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_44_0 = -param0;
                          stackOut_44_1 = param3;
                          stackIn_45_0 = stackOut_44_0;
                          stackIn_45_1 = stackOut_44_1;
                          break L8;
                        }
                        L17: {
                          L18: {
                            var16 = stackIn_45_0 + stackIn_45_1;
                            if (var16 == 0) {
                              break L18;
                            } else {
                              L19: {
                                L20: {
                                  var17 = param2 << -1058208272;
                                  if (var13 == 0) {
                                    break L20;
                                  } else {
                                    var10 = param4 << 1908646608;
                                    if (var19 == 0) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                var9_int = param4 << -802932560;
                                break L19;
                              }
                              var12 = (-var10 + var17) / var16;
                              var11 = (-var9_int + var17) / var16;
                              if (var19 == 0) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          var11 = 0;
                          var12 = 0;
                          break L17;
                        }
                        if (var19 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L21: {
                      L22: {
                        if (param3 == param1) {
                          break L22;
                        } else {
                          L23: {
                            L24: {
                              var15 = -param0 + param3;
                              if (param7 >= param4) {
                                break L24;
                              } else {
                                var9_int = param7 << -1784981648;
                                var12 = (-param4 + param2 << -1789498640) / var15;
                                var10 = param4 << -1419794128;
                                var11 = (param2 - param7 << 966761840) / var14;
                                if (var19 == 0) {
                                  break L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            var10 = param7 << 1305289296;
                            var12 = (param2 + -param7 << -526804944) / var14;
                            var11 = (param2 + -param4 << 2007579056) / var15;
                            var9_int = param4 << -2030780304;
                            break L23;
                          }
                          if (var19 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var12 = 0;
                      var9_int = param7 << 38540400;
                      var11 = 0;
                      var10 = param4 << -215886160;
                      break L21;
                    }
                    L25: {
                      if (0 > param1) {
                        param1 = Math.min(-param1, -param1 + param0);
                        var10 = var10 + param1 * var12;
                        var9_int = var9_int + var11 * param1;
                        param1 = 0;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    var13 = 0;
                    break L4;
                  }
                  if (param8 == 20) {
                    L26: {
                      if (param1 >= 0) {
                        break L26;
                      } else {
                        param1 = -param1;
                        var10 = var10 + var12 * param1;
                        var9_int = var9_int + param1 * var11;
                        param1 = 0;
                        break L26;
                      }
                    }
                    var15 = tm.field_k[param1];
                    L27: while (true) {
                      L28: {
                        if (param1 >= param3) {
                          break L28;
                        } else {
                          var16 = var9_int >> 1923483984;
                          if (var19 != 0) {
                            break L28;
                          } else {
                            L29: {
                              if (var16 < tm.field_l) {
                                L30: {
                                  var17 = -(var9_int >> 900075280) + (var10 >> 1555947824);
                                  if (var17 == 0) {
                                    break L30;
                                  } else {
                                    L31: {
                                      if (tm.field_l > var16 + var17) {
                                        break L31;
                                      } else {
                                        var17 = tm.field_l - (var16 + 1);
                                        break L31;
                                      }
                                    }
                                    L32: {
                                      if (var16 >= 0) {
                                        break L32;
                                      } else {
                                        tf.a(var15, param8 + -1432128883, var17 - -var16, param6, param5);
                                        if (var19 == 0) {
                                          break L29;
                                        } else {
                                          break L32;
                                        }
                                      }
                                    }
                                    tf.a(var16 + var15, -1432128863, var17, param6, param5);
                                    if (var19 == 0) {
                                      break L29;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                                if (-1 < (var16 ^ -1)) {
                                  break L29;
                                } else {
                                  if (var16 < tm.field_l) {
                                    tf.a(var15 + var16, -1432128863, var17, param6, param5);
                                    break L29;
                                  } else {
                                    break L29;
                                  }
                                }
                              } else {
                                break L29;
                              }
                            }
                            param1++;
                            if (tm.field_q <= param1) {
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              var10 = var10 + var12;
                              var15 = var15 + qn.field_l;
                              var9_int = var9_int + var11;
                              continue L27;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L33: {
            var9 = decompiledCaughtException;
            stackOut_88_0 = (RuntimeException) (var9);
            stackOut_88_1 = new StringBuilder().append("vp.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_90_0 = stackOut_88_0;
            stackIn_90_1 = stackOut_88_1;
            stackIn_89_0 = stackOut_88_0;
            stackIn_89_1 = stackOut_88_1;
            if (param6 == null) {
              stackOut_90_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackOut_90_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackOut_90_2 = "null";
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              break L33;
            } else {
              stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackOut_89_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackOut_89_2 = "{...}";
              stackIn_91_0 = stackOut_89_0;
              stackIn_91_1 = stackOut_89_1;
              stackIn_91_2 = stackOut_89_2;
              break L33;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_91_0), stackIn_91_2 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
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

    public static void g(int param0) {
        field_A = null;
        if (param0 != -829) {
            return;
        }
        field_y = null;
    }

    final String a(byte param0, boolean param1) {
        int var4 = 118 % ((param0 - 53) / 51);
        String var3 = "EventMana: type: , points: " + this.field_E + ", player: " + this.field_C;
        return var3;
    }

    final static void a(byte param0, int param1) {
        bv var2 = null;
        if (param0 != 69) {
          return;
        } else {
          var2 = vl.field_n;
          var2.h(32161, param1);
          var2.b(1, 1);
          var2.b(1, 3);
          return;
        }
    }

    final void a(ha param0, int param1) {
        int dupTemp$0 = 0;
        try {
            if (param1 != -26661) {
                vp.a((byte) 14, 105);
            }
            if (0 > param0.field_sb) {
                if (-1 >= (this.field_C ^ -1)) {
                    if (this.field_C < param0.field_H.length) {
                        param0.field_H[this.field_C] = param0.field_H[this.field_C] + this.field_E;
                        if (-1000000001 > (param0.field_H[this.field_C] ^ -1)) {
                            param0.field_H[this.field_C] = 1000000000;
                        }
                        dupTemp$0 = param0.o(this.field_C, -1);
                        param0.field_fb[dupTemp$0] = param0.field_fb[dupTemp$0] + this.field_E;
                        if (param0.field_fb[param0.o(this.field_C, -1)] > 1000000000) {
                            param0.field_fb[param0.o(this.field_C, -1)] = 1000000000;
                        }
                    }
                }
            }
            fl.a(param0, -120);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vp.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
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
        int stackOut_2_0 = 0;
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
            if (param1 < -84) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_z = -20;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("vp.A(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    vp(int param0, int param1, int param2) {
        this.field_m = 9;
        this.field_z = param0;
        this.field_E = param1;
        this.field_C = param2;
    }

    final static wk a(int param0, int param1, int param2, kl param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param2 == -9027) {
              break L0;
            } else {
              vp.g(-17);
              break L0;
            }
          }
          if (kp.a(false, param0, param3, param1)) {
            return gv.a(2809);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("vp.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
        field_A = "Loading";
        field_y = new String[]{"This unit has a normal <%0> attack.", "This unit deals +2 damage with <%0> attacks.", "This unit deals +5 damage with <%0> attacks.", "This unit deals +10 damage with <%0> attacks.", "This unit's <%0> attacks have +2 maximum range.", "This unit's <%0> attacks have +3 maximum range.", "This unit's <%0> attacks poison enemy units."};
    }
}
