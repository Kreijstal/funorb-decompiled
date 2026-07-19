/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cw {
    static String field_a;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
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
        int stackIn_19_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_40_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_39_0 = 0;
        var18 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 50 + ic.field_f;
              if (param3 <= -116) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            L2: {
              if (null == jf.field_C.field_T) {
                break L2;
              } else {
                L3: {
                  if (jf.field_C.field_q == bv.field_w.field_gb) {
                    break L3;
                  } else {
                    if (jf.field_C.field_T.field_O == jf.field_C.field_q) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if ((jf.field_C.field_T.field_B ^ -1) >= -1) {
                  break L2;
                } else {
                  L4: {
                    L5: {
                      L6: {
                        if (jf.field_C.field_T.field_s) {
                          break L6;
                        } else {
                          if (jf.field_C.field_T.field_O != jf.field_C.field_q) {
                            break L6;
                          } else {
                            if (jf.field_C.field_T.h(-13494)) {
                              break L6;
                            } else {
                              L7: {
                                var7 = jf.field_C.field_T.B(3257);
                                var8 = jf.field_C.field_T.l((byte) -79);
                                var9 = jf.field_C.field_vb.field_n;
                                var10 = jf.field_C.field_vb.field_b;
                                if (jf.field_C.field_T.o(-28467)) {
                                  var9 = jf.field_C.field_T.a(false);
                                  var10 = jf.field_C.field_T.D(-65);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              var11 = Math.abs(var9 - param4);
                              var12 = Math.abs(var10 + -param5);
                              if (var11 + var12 > var7) {
                                break L6;
                              } else {
                                if (var8 > var11 - -var12) {
                                  break L6;
                                } else {
                                  L8: {
                                    if (var12 + var11 != 1) {
                                      stackOut_18_0 = 0;
                                      stackIn_19_0 = stackOut_18_0;
                                      break L8;
                                    } else {
                                      stackOut_17_0 = 1;
                                      stackIn_19_0 = stackOut_17_0;
                                      break L8;
                                    }
                                  }
                                  L9: {
                                    var13 = stackIn_19_0;
                                    if (var13 == 0) {
                                      if ((bv.field_w.b(31, var10, var9, jf.field_C.field_T.field_O) & 2) == 0) {
                                        if ((2 & bv.field_w.b(31, param5, param4, jf.field_C.field_T.field_O)) == 0) {
                                          if (bv.field_w.field_j.a(var10, param4, var9, jf.field_C.field_T.x(-111), var7, param5, (byte) 62)) {
                                            stackOut_27_0 = 1;
                                            stackIn_29_0 = stackOut_27_0;
                                            break L9;
                                          } else {
                                            stackOut_26_0 = 0;
                                            stackIn_29_0 = stackOut_26_0;
                                            break L9;
                                          }
                                        } else {
                                          stackOut_24_0 = 0;
                                          stackIn_29_0 = stackOut_24_0;
                                          break L9;
                                        }
                                      } else {
                                        stackOut_22_0 = 0;
                                        stackIn_29_0 = stackOut_22_0;
                                        break L9;
                                      }
                                    } else {
                                      stackOut_20_0 = 0;
                                      stackIn_29_0 = stackOut_20_0;
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    var14 = stackIn_29_0;
                                    if (var13 != 0) {
                                      break L10;
                                    } else {
                                      if (var14 != 0) {
                                        break L10;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  var15 = 1;
                                  L11: while (true) {
                                    if ((var15 ^ -1) <= -41) {
                                      break L6;
                                    } else {
                                      var16 = Math.abs(-(var15 * 2) + 40);
                                      var17 = -20 + (param1 + var15);
                                      qn.d(-40 + param2 + var16, var17, -1 + -var16 + param2 - -40, var17, 16711680, var6_int);
                                      var15 += 2;
                                      if (var18 != 0) {
                                        break L5;
                                      } else {
                                        if (var18 == 0) {
                                          continue L11;
                                        } else {
                                          break L6;
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
                      if (jf.field_C.field_T.field_s) {
                        break L5;
                      } else {
                        stackOut_38_0 = 3;
                        stackIn_40_0 = stackOut_38_0;
                        break L4;
                      }
                    }
                    stackOut_39_0 = 1;
                    stackIn_40_0 = stackOut_39_0;
                    break L4;
                  }
                  L12: {
                    var7 = stackIn_40_0;
                    var8 = jf.field_C.field_vb.c(27732);
                    if ((jf.field_C.field_vb.field_e[param0] & var7) == 0) {
                      break L12;
                    } else {
                      L13: {
                        if (jf.field_C.field_T.field_s) {
                          break L13;
                        } else {
                          if (jf.field_C.field_vb.field_q[param0] <= var8) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L14: {
                        L15: {
                          if (param5 == 0) {
                            break L15;
                          } else {
                            L16: {
                              if (var8 < jf.field_C.field_vb.field_q[-bv.field_w.field_v + param0]) {
                                break L16;
                              } else {
                                if (!jf.field_C.field_T.field_s) {
                                  break L14;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            if (-1 != (var7 & jf.field_C.field_vb.field_e[param0 + -ks.field_y] ^ -1)) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        qn.d(-40 + param2, param1, param2, -20 + param1, 16711680, var6_int);
                        break L14;
                      }
                      L17: {
                        L18: {
                          if (param5 == -1 + ef.field_c) {
                            break L18;
                          } else {
                            L19: {
                              if (var8 < jf.field_C.field_vb.field_q[ks.field_y + param0]) {
                                break L19;
                              } else {
                                if (!jf.field_C.field_T.field_s) {
                                  break L17;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            if ((jf.field_C.field_vb.field_e[ks.field_y + param0] & var7) == 0) {
                              break L18;
                            } else {
                              break L17;
                            }
                          }
                        }
                        qn.d(40 + param2, param1, param2, param1 - -20, 16711680, var6_int);
                        break L17;
                      }
                      L20: {
                        L21: {
                          if (0 == param4) {
                            break L21;
                          } else {
                            L22: {
                              if (jf.field_C.field_vb.field_q[-1 + param0] > var8) {
                                break L22;
                              } else {
                                if (!jf.field_C.field_T.field_s) {
                                  break L20;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            if ((var7 & jf.field_C.field_vb.field_e[param0 - 1]) != 0) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        qn.d(param2 + -40, param1, param2, 20 + param1, 16711680, var6_int);
                        break L20;
                      }
                      L23: {
                        if (param4 == -1 + ks.field_y) {
                          break L23;
                        } else {
                          L24: {
                            if (var8 < jf.field_C.field_vb.field_q[1 + param0]) {
                              break L24;
                            } else {
                              if (!jf.field_C.field_T.field_s) {
                                break L2;
                              } else {
                                break L24;
                              }
                            }
                          }
                          if ((var7 & jf.field_C.field_vb.field_e[param0 - -1]) == 0) {
                            break L23;
                          } else {
                            break L2;
                          }
                        }
                      }
                      qn.d(40 + param2, param1, param2, -20 + param1, 16711680, var6_int);
                      break L2;
                    }
                  }
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
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var6), "cw.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 > -91) {
            cw.a(-12, 36, -105, 64, -39, -61);
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Options";
        field_a = "This unit has an attack range of <%0> to <%1>";
    }
}
