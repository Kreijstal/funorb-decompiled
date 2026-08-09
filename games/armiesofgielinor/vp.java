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
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
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
                    var14 = -param1 + param3;
                    if (param0 == param1) {
                      L5: {
                        if (param3 == param1) {
                          var12 = 0;
                          var9_int = param7 << 38540400;
                          var11 = 0;
                          var10 = param4 << -215886160;
                          break L5;
                        } else {
                          var15 = -param0 + param3;
                          if (param7 >= param4) {
                            var10 = param7 << 1305289296;
                            var12 = (param2 + -param7 << -526804944) / var14;
                            var11 = (param2 + -param4 << 2007579056) / var15;
                            var9_int = param4 << -2030780304;
                            break L5;
                          } else {
                            var9_int = param7 << -1784981648;
                            var12 = (-param4 + param2 << -1789498640) / var15;
                            var10 = param4 << -1419794128;
                            var11 = (param2 - param7 << 966761840) / var14;
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (0 > param1) {
                          param1 = Math.min(-param1, -param1 + param0);
                          var10 = var10 + param1 * var12;
                          var9_int = var9_int + var11 * param1;
                          param1 = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var13 = 0;
                      break L4;
                    } else {
                      L7: {
                        var10 = param7 << -374352912;
                        var9_int = param7 << -374352912;
                        var15 = param0 - param1;
                        var12 = (param2 - param7 << 1193852592) / var14;
                        var11 = (-param7 + param4 << -1746576048) / var15;
                        if (var11 < var12) {
                          var13 = 0;
                          break L7;
                        } else {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          if ((param1 ^ -1) > -1) {
                            if (param0 >= 0) {
                              param1 = -param1;
                              var9_int = var9_int + var11 * param1;
                              var10 = var10 + var12 * param1;
                              param1 = 0;
                              break L9;
                            } else {
                              param1 = param0 + -param1;
                              var10 = var10 + param1 * var12;
                              var9_int = var9_int + var11 * param1;
                              param1 = param0;
                              break L8;
                            }
                          } else {
                            break L9;
                          }
                        }
                        var16 = tm.field_k[param1];
                        L10: while (true) {
                          if (param0 <= param1) {
                            break L8;
                          } else {
                            L11: {
                              var17 = var9_int >> 1585780432;
                              if (var17 >= tm.field_l) {
                                break L11;
                              } else {
                                var18 = (var10 >> 735718256) - (var9_int >> 1628801776);
                                if (var18 != 0) {
                                  L12: {
                                    if (tm.field_l <= var17 + var18) {
                                      var18 = -var17 + tm.field_l + -1;
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if ((var17 ^ -1) > -1) {
                                    tf.a(var16, param8 + -1432128883, var17 + var18, param6, param5);
                                    break L11;
                                  } else {
                                    tf.a(var17 + var16, -1432128863, var18, param6, param5);
                                    break L11;
                                  }
                                } else {
                                  if ((var17 ^ -1) > -1) {
                                    break L11;
                                  } else {
                                    if (tm.field_l <= var17) {
                                      break L11;
                                    } else {
                                      tf.a(var16 + var17, -1432128863, var18, param6, param5);
                                      break L11;
                                    }
                                  }
                                }
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
                              continue L10;
                            }
                          }
                        }
                      }
                      var16 = -param0 + param3;
                      if (var16 == 0) {
                        var11 = 0;
                        var12 = 0;
                        break L4;
                      } else {
                        L13: {
                          var17 = param2 << -1058208272;
                          if (var13 == 0) {
                            var9_int = param4 << -802932560;
                            break L13;
                          } else {
                            var10 = param4 << 1908646608;
                            break L13;
                          }
                        }
                        var12 = (-var10 + var17) / var16;
                        var11 = (-var9_int + var17) / var16;
                        break L4;
                      }
                    }
                  }
                  if (param8 == 20) {
                    L14: {
                      if (param1 >= 0) {
                        break L14;
                      } else {
                        param1 = -param1;
                        var10 = var10 + var12 * param1;
                        var9_int = var9_int + param1 * var11;
                        param1 = 0;
                        break L14;
                      }
                    }
                    var15 = tm.field_k[param1];
                    L15: while (true) {
                      if (param1 >= param3) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        L16: {
                          var16 = var9_int >> 1923483984;
                          if (var16 < tm.field_l) {
                            var17 = -(var9_int >> 900075280) + (var10 >> 1555947824);
                            if (var17 == 0) {
                              if (-1 < (var16 ^ -1)) {
                                break L16;
                              } else {
                                if (var16 < tm.field_l) {
                                  tf.a(var15 + var16, -1432128863, var17, param6, param5);
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                            } else {
                              L17: {
                                if (tm.field_l > var16 + var17) {
                                  break L17;
                                } else {
                                  var17 = tm.field_l - (var16 + 1);
                                  break L17;
                                }
                              }
                              if (var16 >= 0) {
                                tf.a(var16 + var15, -1432128863, var17, param6, param5);
                                break L16;
                              } else {
                                tf.a(var15, param8 + -1432128883, var17 - -var16, param6, param5);
                                break L16;
                              }
                            }
                          } else {
                            break L16;
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
                          continue L15;
                        }
                      }
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
          L18: {
            var9 = decompiledCaughtException;
            stackIn_81_0 = (RuntimeException) (var9);

            stackIn_81_1 = new StringBuilder().append("vp.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "null";
              break L18;
            } else {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "{...}";
              break L18;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ',' + param7 + ',' + param8 + ')');
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
        bv var2;
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
            if (0 > param0.field_sb && -1 >= (this.field_C ^ -1) && this.field_C < param0.field_H.length) {
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
            fl.a(param0, -120);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vp.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -84) {
              stackIn_3_0 = 0;
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
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("vp.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("vp.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
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
