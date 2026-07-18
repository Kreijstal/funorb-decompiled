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
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        var18 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 50 + ic.field_f;
              if (param3 <= -116) {
                break L1;
              } else {
                field_b = null;
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
                if (jf.field_C.field_T.field_B <= 0) {
                  break L2;
                } else {
                  L4: {
                    if (jf.field_C.field_T.field_s) {
                      break L4;
                    } else {
                      if (jf.field_C.field_T.field_O != jf.field_C.field_q) {
                        break L4;
                      } else {
                        if (jf.field_C.field_T.h(-13494)) {
                          break L4;
                        } else {
                          L5: {
                            var7 = jf.field_C.field_T.B(3257);
                            var8 = jf.field_C.field_T.l((byte) -79);
                            var9 = jf.field_C.field_vb.field_n;
                            var10 = jf.field_C.field_vb.field_b;
                            if (jf.field_C.field_T.o(-28467)) {
                              var9 = jf.field_C.field_T.a(false);
                              var10 = jf.field_C.field_T.D(-65);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var11 = Math.abs(var9 - param4);
                          var12 = Math.abs(var10 + -param5);
                          if (var11 + var12 > var7) {
                            break L4;
                          } else {
                            if (var8 > var11 - -var12) {
                              break L4;
                            } else {
                              L6: {
                                if (var12 + var11 != 1) {
                                  stackOut_18_0 = 0;
                                  stackIn_19_0 = stackOut_18_0;
                                  break L6;
                                } else {
                                  stackOut_17_0 = 1;
                                  stackIn_19_0 = stackOut_17_0;
                                  break L6;
                                }
                              }
                              L7: {
                                var13 = stackIn_19_0;
                                if (var13 == 0) {
                                  if ((bv.field_w.b(31, var10, var9, jf.field_C.field_T.field_O) & 2) == 0) {
                                    if ((2 & bv.field_w.b(31, param5, param4, jf.field_C.field_T.field_O)) == 0) {
                                      if (bv.field_w.field_j.a(var10, param4, var9, jf.field_C.field_T.x(-111), var7, param5, (byte) 62)) {
                                        stackOut_27_0 = 1;
                                        stackIn_29_0 = stackOut_27_0;
                                        break L7;
                                      } else {
                                        stackOut_26_0 = 0;
                                        stackIn_29_0 = stackOut_26_0;
                                        break L7;
                                      }
                                    } else {
                                      stackOut_24_0 = 0;
                                      stackIn_29_0 = stackOut_24_0;
                                      break L7;
                                    }
                                  } else {
                                    stackOut_22_0 = 0;
                                    stackIn_29_0 = stackOut_22_0;
                                    break L7;
                                  }
                                } else {
                                  stackOut_20_0 = 0;
                                  stackIn_29_0 = stackOut_20_0;
                                  break L7;
                                }
                              }
                              L8: {
                                var14 = stackIn_29_0;
                                if (var13 != 0) {
                                  break L8;
                                } else {
                                  if (var14 != 0) {
                                    break L8;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var15 = 1;
                              L9: while (true) {
                                if (var15 >= 40) {
                                  break L4;
                                } else {
                                  var16 = Math.abs(-(var15 * 2) + 40);
                                  var17 = -20 + (param1 + var15);
                                  qn.d(-40 + param2 + var16, var17, -1 + -var16 + param2 - -40, var17, 16711680, var6_int);
                                  var15 += 2;
                                  continue L9;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L10: {
                    if (jf.field_C.field_T.field_s) {
                      stackOut_37_0 = 1;
                      stackIn_38_0 = stackOut_37_0;
                      break L10;
                    } else {
                      stackOut_36_0 = 3;
                      stackIn_38_0 = stackOut_36_0;
                      break L10;
                    }
                  }
                  L11: {
                    var7 = stackIn_38_0;
                    var8 = jf.field_C.field_vb.c(27732);
                    if ((jf.field_C.field_vb.field_e[param0] & var7) == 0) {
                      break L11;
                    } else {
                      L12: {
                        if (jf.field_C.field_T.field_s) {
                          break L12;
                        } else {
                          if (jf.field_C.field_vb.field_q[param0] <= var8) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L13: {
                        L14: {
                          if (param5 == 0) {
                            break L14;
                          } else {
                            L15: {
                              if (var8 < jf.field_C.field_vb.field_q[-bv.field_w.field_v + param0]) {
                                break L15;
                              } else {
                                if (!jf.field_C.field_T.field_s) {
                                  break L13;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            if ((var7 & jf.field_C.field_vb.field_e[param0 + -ks.field_y]) != 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        qn.d(-40 + param2, param1, param2, -20 + param1, 16711680, var6_int);
                        break L13;
                      }
                      L16: {
                        L17: {
                          if (param5 == -1 + ef.field_c) {
                            break L17;
                          } else {
                            L18: {
                              if (var8 < jf.field_C.field_vb.field_q[ks.field_y + param0]) {
                                break L18;
                              } else {
                                if (!jf.field_C.field_T.field_s) {
                                  break L16;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            if ((jf.field_C.field_vb.field_e[ks.field_y + param0] & var7) == 0) {
                              break L17;
                            } else {
                              break L16;
                            }
                          }
                        }
                        qn.d(40 + param2, param1, param2, param1 - -20, 16711680, var6_int);
                        break L16;
                      }
                      L19: {
                        L20: {
                          if (0 == param4) {
                            break L20;
                          } else {
                            L21: {
                              if (jf.field_C.field_vb.field_q[-1 + param0] > var8) {
                                break L21;
                              } else {
                                if (!jf.field_C.field_T.field_s) {
                                  break L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            if ((var7 & jf.field_C.field_vb.field_e[param0 - 1]) != 0) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        qn.d(param2 + -40, param1, param2, 20 + param1, 16711680, var6_int);
                        break L19;
                      }
                      L22: {
                        if (param4 == -1 + ks.field_y) {
                          break L22;
                        } else {
                          L23: {
                            if (var8 < jf.field_C.field_vb.field_q[1 + param0]) {
                              break L23;
                            } else {
                              if (!jf.field_C.field_T.field_s) {
                                break L2;
                              } else {
                                break L23;
                              }
                            }
                          }
                          if ((var7 & jf.field_C.field_vb.field_e[param0 - -1]) == 0) {
                            break L22;
                          } else {
                            break L2;
                          }
                        }
                      }
                      qn.d(40 + param2, param1, param2, -20 + param1, 16711680, var6_int);
                      break L2;
                    }
                  }
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var6, "cw.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Options";
        field_a = "This unit has an attack range of <%0> to <%1>";
    }
}
