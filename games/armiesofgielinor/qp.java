/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qp extends dr {
    static String field_E;

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -24872) {
                break L1;
              } else {
                qp.g(125);
                break L1;
              }
            }
            stackIn_3_0 = new nd(sq.a(param1[2].a(param0 ^ -24870), (byte) -2, param1[0].a(2), param1[1].a(2)));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("qp.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int e(byte param0) {
        if (param0 >= -123) {
            Random var2 = (Random) null;
            qp.a(-126, -81, -63, -13, -70, -42, (ha) null, -51, (Random) null);
        }
        return nm.field_z;
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, boolean param5, boolean param6, int param7, boolean param8, wk param9) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              no.field_P.field_v = qn.field_g;
              if (param0 == 1) {
                break L1;
              } else {
                qp.g(111);
                break L1;
              }
            }
            L2: {
              no.field_P.field_y = qn.field_l;
              no.field_P.field_B = qn.field_d;
              if (!param6) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (dv.field_k == null) {
                      break L4;
                    } else {
                      if (t.field_f == param7) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  t.field_f = param7;
                  dv.field_k = a.field_m[0].g();
                  var19 = dv.field_k.field_B;
                  var18 = var19;
                  var17 = var18;
                  var10 = var17;
                  var11 = 0;
                  L5: while (true) {
                    if (var19.length <= var11) {
                      break L3;
                    } else {
                      var12 = 255 & var19[var11];
                      var13 = (255 & param7 >> 770024240) * var12 >> 244453928;
                      var14 = ((65280 & param7) >> -1541240920) * var12 >> 1533665416;
                      var15 = (255 & param7) * var12 >> 15505352;
                      var17[var11] = (var14 << 2068828936) + (var13 << -391340688) - -var15;
                      var11++;
                      continue L5;
                    }
                  }
                }
                dv.field_k.d(param3 - 20, -15 + param2, 92, 92, 256);
                break L2;
              }
            }
            L6: {
              if (!param5) {
                param9.g(param3, param2);
                if (!param1) {
                  if (param8) {
                    fe.a(a.field_m[2], param3, param2, 56, 56);
                    a.field_m[2].d(param3, param2, 56, 56, 228);
                    break L6;
                  } else {
                    if (param4) {
                      a.field_m[3].e(param3, param2);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                } else {
                  a.field_m[1].e(param3, param2);
                  break L6;
                }
              } else {
                L7: {
                  ku.field_J.b();
                  qn.b();
                  param9.g(0, 0);
                  if (!param1) {
                    if (param8) {
                      fe.a(a.field_m[2], 0, 0, 56, 56);
                      a.field_m[2].d(0, 0, 56, 56, 228);
                      break L7;
                    } else {
                      if (param4) {
                        a.field_m[3].e(0, 0);
                        break L7;
                      } else {
                        no.field_P.b();
                        ku.field_J.h(param3, param2);
                        break L6;
                      }
                    }
                  } else {
                    a.field_m[1].e(0, 0);
                    break L7;
                  }
                }
                no.field_P.b();
                ku.field_J.h(param3, param2);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var10_ref);

            stackIn_30_1 = new StringBuilder().append("qp.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
    }

    qp(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void g(int param0) {
        if (param0 < 114) {
            wk var2 = (wk) null;
            qp.a(-47, true, -89, 99, true, true, false, -24, false, (wk) null);
        }
        field_E = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, ha param6, int param7, Random param8) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        int stackIn_136_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_140_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_144_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_145_1 = 0;
        int stackIn_149_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_168_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_173_1 = 0;
        int stackIn_183_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_184_1 = 0;
        RuntimeException stackIn_191_0 = null;
        StringBuilder stackIn_191_1 = null;
        RuntimeException stackIn_192_0 = null;
        StringBuilder stackIn_192_1 = null;
        String stackIn_192_2 = null;
        StringBuilder stackIn_194_1 = null;
        StringBuilder stackIn_195_1 = null;
        String stackIn_195_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (5 != param5) {
              L1: {
                var9_int = -param4 + param1;
                var10 = param3 + -param0;
                var11 = 0;
                var12 = 0;
                var13 = 0;
                var14 = 0;
                if (param1 != param4) {
                  if (param3 != param0) {
                    L2: {
                      if (var9_int >= 2) {
                        break L2;
                      } else {
                        if (var9_int > -2) {
                          L3: {
                            if (-1 > (var10 ^ -1)) {
                              stackIn_168_0 = 1;
                              break L3;
                            } else {
                              stackIn_168_0 = -1;
                              break L3;
                            }
                          }
                          var11 = stackIn_168_0;
                          L4: while (true) {
                            L5: {
                              L6: {
                                if (var10 < var11) {
                                  break L6;
                                } else {
                                  if (-1 > (var10 ^ -1)) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              stackIn_173_0 = var11 ^ -1;
                              stackIn_173_1 = var10 ^ -1;
                              if (stackIn_173_0 > stackIn_173_1) {
                                break L1;
                              } else {
                                if ((var10 ^ -1) < -1) {
                                  break L1;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L7: {
                              if (null == param6.field_Eb[(var11 - -param0) * param6.field_v + (var12 + param4)]) {
                                break L7;
                              } else {
                                if (param6.field_Eb[param4 + (var12 - -((var11 - -param0) * param6.field_v))].field_h != param7) {
                                  break L7;
                                } else {
                                  var14 = 1;
                                  break L1;
                                }
                              }
                            }
                            L8: {
                              var13++;
                              if (param6.field_Eb[(var11 + param0) * param6.field_v + var12 - -param4] != null) {
                                break L8;
                              } else {
                                param6.field_Eb[var12 + param4 + (param0 + var11) * param6.field_v] = new ne(param7, param6);
                                break L8;
                              }
                            }
                            L9: {
                              stackIn_183_0 = var11;

                              if (-1 <= (var10 ^ -1)) {
                                stackIn_184_0 = stackIn_183_0;
                                stackIn_184_1 = -1;
                                break L9;
                              } else {
                                stackIn_184_0 = stackIn_183_0;
                                stackIn_184_1 = 1;
                                break L9;
                              }
                            }
                            var11 = stackIn_184_0 + stackIn_184_1;
                            continue L4;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    L10: {
                      if (-3 >= (var10 ^ -1)) {
                        break L10;
                      } else {
                        if (var10 > -2) {
                          L11: {
                            if (-1 > (var9_int ^ -1)) {
                              stackIn_149_0 = 1;
                              break L11;
                            } else {
                              stackIn_149_0 = -1;
                              break L11;
                            }
                          }
                          var12 = stackIn_149_0;
                          L12: while (true) {
                            L13: {
                              L14: {
                                if (var12 > var9_int) {
                                  break L14;
                                } else {
                                  if (var9_int > 0) {
                                    break L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              if (var9_int > var12) {
                                break L1;
                              } else {
                                if (var9_int > 0) {
                                  break L1;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            L15: {
                              if (null == param6.field_Eb[var12 + param4 + (var11 - -param0) * param6.field_v]) {
                                break L15;
                              } else {
                                if (param7 != param6.field_Eb[var12 + param4 - -((param0 + var11) * param6.field_v)].field_h) {
                                  break L15;
                                } else {
                                  var14 = 1;
                                  break L1;
                                }
                              }
                            }
                            L16: {
                              var13++;
                              if (null != param6.field_Eb[param6.field_v * (var11 - -param0) + (var12 - -param4)]) {
                                break L16;
                              } else {
                                param6.field_Eb[param6.field_v * (param0 + var11) + param4 + var12] = new ne(param7, param6);
                                break L16;
                              }
                            }
                            L17: {
                              stackIn_163_0 = var12;

                              if (var9_int > 0) {
                                stackIn_164_0 = stackIn_163_0;
                                stackIn_164_1 = 1;
                                break L17;
                              } else {
                                stackIn_164_0 = stackIn_163_0;
                                stackIn_164_1 = -1;
                                break L17;
                              }
                            }
                            var12 = stackIn_164_0 + stackIn_164_1;
                            continue L12;
                          }
                        } else {
                          break L10;
                        }
                      }
                    }
                    if ((ns.a(false, 100, param8) ^ -1) < -51) {
                      L18: {
                        if (var9_int > 0) {
                          stackIn_102_0 = 1;
                          break L18;
                        } else {
                          stackIn_102_0 = -1;
                          break L18;
                        }
                      }
                      var12 = stackIn_102_0;
                      L19: while (true) {
                        L20: {
                          L21: {
                            if (var12 >= var9_int) {
                              break L21;
                            } else {
                              if (var9_int > 0) {
                                break L20;
                              } else {
                                break L21;
                              }
                            }
                          }
                          stackIn_107_0 = var12 ^ -1;
                          if (stackIn_107_0 >= (var9_int ^ -1)) {
                            break L1;
                          } else {
                            if (-1 > (var9_int ^ -1)) {
                              break L1;
                            } else {
                              break L20;
                            }
                          }
                        }
                        L22: {
                          if (param6.field_Eb[param4 + (var12 - -(param6.field_v * (param0 + var11)))] == null) {
                            break L22;
                          } else {
                            if (param6.field_Eb[var12 + (param4 - -(param6.field_v * (var11 + param0)))].field_h != param7) {
                              break L22;
                            } else {
                              var14 = 1;
                              break L1;
                            }
                          }
                        }
                        L23: {
                          if (param6.field_Eb[param4 + (var12 - -((param0 + var11) * param6.field_v))] != null) {
                            break L23;
                          } else {
                            param6.field_Eb[param4 + var12 + param6.field_v * (param0 + var11)] = new ne(param7, param6);
                            break L23;
                          }
                        }
                        L24: {
                          var13++;
                          if (var12 == var9_int >> -1080653279) {
                            L25: {
                              if (-1 <= (var10 ^ -1)) {
                                stackIn_120_0 = -1;
                                break L25;
                              } else {
                                stackIn_120_0 = 1;
                                break L25;
                              }
                            }
                            var11 = stackIn_120_0;
                            L26: while (true) {
                              L27: {
                                L28: {
                                  L29: {
                                    if (var10 < var11) {
                                      break L29;
                                    } else {
                                      if (-1 > (var10 ^ -1)) {
                                        break L28;
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                  stackIn_125_0 = var11;
                                  stackIn_125_1 = var10;
                                  if (stackIn_125_0 < stackIn_125_1) {
                                    break L27;
                                  } else {
                                    if (var10 > 0) {
                                      break L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                L30: {
                                  if (param6.field_Eb[var12 - -param4 - -((var11 - -param0) * param6.field_v)] == null) {
                                    break L30;
                                  } else {
                                    if (param7 == param6.field_Eb[(param0 + var11) * param6.field_v + (var12 - -param4)].field_h) {
                                      break L27;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                                L31: {
                                  var13++;
                                  if (null == param6.field_Eb[(param0 + var11) * param6.field_v + (param4 + var12)]) {
                                    param6.field_Eb[param6.field_v * (var11 - -param0) + param4 + var12] = new ne(param7, param6);
                                    break L31;
                                  } else {
                                    break L31;
                                  }
                                }
                                L32: {
                                  stackIn_136_0 = var11;

                                  if (var10 <= 0) {
                                    stackIn_137_0 = stackIn_136_0;
                                    stackIn_137_1 = -1;
                                    break L32;
                                  } else {
                                    stackIn_137_0 = stackIn_136_0;
                                    stackIn_137_1 = 1;
                                    break L32;
                                  }
                                }
                                var11 = stackIn_137_0 + stackIn_137_1;
                                continue L26;
                              }
                              L33: {
                                stackIn_140_0 = var11;

                                if (0 < var10) {
                                  stackIn_141_0 = stackIn_140_0;
                                  stackIn_141_1 = -1;
                                  break L33;
                                } else {
                                  stackIn_141_0 = stackIn_140_0;
                                  stackIn_141_1 = 1;
                                  break L33;
                                }
                              }
                              var11 = stackIn_141_0 + stackIn_141_1;
                              break L24;
                            }
                          } else {
                            break L24;
                          }
                        }
                        L34: {
                          stackIn_144_0 = var12;

                          if (-1 > (var9_int ^ -1)) {
                            stackIn_145_0 = stackIn_144_0;
                            stackIn_145_1 = 1;
                            break L34;
                          } else {
                            stackIn_145_0 = stackIn_144_0;
                            stackIn_145_1 = -1;
                            break L34;
                          }
                        }
                        var12 = stackIn_145_0 + stackIn_145_1;
                        continue L19;
                      }
                    } else {
                      L35: {
                        if (-1 <= (var10 ^ -1)) {
                          stackIn_56_0 = -1;
                          break L35;
                        } else {
                          stackIn_56_0 = 1;
                          break L35;
                        }
                      }
                      var11 = stackIn_56_0;
                      L36: while (true) {
                        L37: {
                          L38: {
                            if (var10 <= var11) {
                              break L38;
                            } else {
                              if (-1 > (var10 ^ -1)) {
                                break L37;
                              } else {
                                break L38;
                              }
                            }
                          }
                          stackIn_61_0 = var10;
                          stackIn_61_1 = var11;
                          if (stackIn_61_0 >= stackIn_61_1) {
                            break L1;
                          } else {
                            if ((var10 ^ -1) < -1) {
                              break L1;
                            } else {
                              break L37;
                            }
                          }
                        }
                        L39: {
                          if (null == param6.field_Eb[param4 + (var12 + (param0 + var11) * param6.field_v)]) {
                            break L39;
                          } else {
                            if (param6.field_Eb[var12 - -param4 - -(param6.field_v * (var11 - -param0))].field_h == param7) {
                              var14 = 1;
                              break L1;
                            } else {
                              break L39;
                            }
                          }
                        }
                        L40: {
                          if (null != param6.field_Eb[(var11 + param0) * param6.field_v + (param4 + var12)]) {
                            break L40;
                          } else {
                            param6.field_Eb[var12 - -param4 + param6.field_v * (param0 + var11)] = new ne(param7, param6);
                            break L40;
                          }
                        }
                        L41: {
                          var13++;
                          if (var11 != var10 >> -1345275039) {
                            break L41;
                          } else {
                            L42: {
                              if (-1 > (var9_int ^ -1)) {
                                stackIn_74_0 = 1;
                                break L42;
                              } else {
                                stackIn_74_0 = -1;
                                break L42;
                              }
                            }
                            var12 = stackIn_74_0;
                            L43: while (true) {
                              L44: {
                                L45: {
                                  L46: {
                                    if (var9_int < var12) {
                                      break L46;
                                    } else {
                                      if (0 < var9_int) {
                                        break L45;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                  stackIn_79_0 = var9_int ^ -1;
                                  stackIn_79_1 = var12 ^ -1;
                                  if (stackIn_79_0 < stackIn_79_1) {
                                    break L44;
                                  } else {
                                    if (var9_int > 0) {
                                      break L44;
                                    } else {
                                      break L45;
                                    }
                                  }
                                }
                                L47: {
                                  if (param6.field_Eb[(param0 + var11) * param6.field_v + (var12 - -param4)] == null) {
                                    break L47;
                                  } else {
                                    if (param7 != param6.field_Eb[(var11 - -param0) * param6.field_v + (param4 + var12)].field_h) {
                                      break L47;
                                    } else {
                                      break L44;
                                    }
                                  }
                                }
                                L48: {
                                  var13++;
                                  if (null != param6.field_Eb[param6.field_v * (param0 + var11) + (param4 + var12)]) {
                                    break L48;
                                  } else {
                                    param6.field_Eb[param4 + (var12 - -((param0 + var11) * param6.field_v))] = new ne(param7, param6);
                                    break L48;
                                  }
                                }
                                L49: {
                                  stackIn_89_0 = var12;

                                  if (var9_int > 0) {
                                    stackIn_90_0 = stackIn_89_0;
                                    stackIn_90_1 = 1;
                                    break L49;
                                  } else {
                                    stackIn_90_0 = stackIn_89_0;
                                    stackIn_90_1 = -1;
                                    break L49;
                                  }
                                }
                                var12 = stackIn_90_0 + stackIn_90_1;
                                continue L43;
                              }
                              L50: {
                                stackIn_93_0 = var12;

                                if ((var9_int ^ -1) >= -1) {
                                  stackIn_94_0 = stackIn_93_0;
                                  stackIn_94_1 = 1;
                                  break L50;
                                } else {
                                  stackIn_94_0 = stackIn_93_0;
                                  stackIn_94_1 = -1;
                                  break L50;
                                }
                              }
                              var12 = stackIn_94_0 + stackIn_94_1;
                              break L41;
                            }
                          }
                        }
                        L51: {
                          stackIn_97_0 = var11;

                          if ((var10 ^ -1) < -1) {
                            stackIn_98_0 = stackIn_97_0;
                            stackIn_98_1 = 1;
                            break L51;
                          } else {
                            stackIn_98_0 = stackIn_97_0;
                            stackIn_98_1 = -1;
                            break L51;
                          }
                        }
                        var11 = stackIn_98_0 + stackIn_98_1;
                        continue L36;
                      }
                    }
                  } else {
                    L52: {
                      if (0 < var9_int) {
                        stackIn_28_0 = 1;
                        break L52;
                      } else {
                        stackIn_28_0 = -1;
                        break L52;
                      }
                    }
                    var12 = stackIn_28_0;
                    L53: while (true) {
                      L54: {
                        L55: {
                          if (var9_int <= var12) {
                            break L55;
                          } else {
                            if ((var9_int ^ -1) < -1) {
                              break L54;
                            } else {
                              break L55;
                            }
                          }
                        }
                        stackIn_33_0 = var9_int;
                        stackIn_33_1 = var12;
                        if (stackIn_33_0 >= stackIn_33_1) {
                          break L1;
                        } else {
                          if (-1 > (var9_int ^ -1)) {
                            break L1;
                          } else {
                            break L54;
                          }
                        }
                      }
                      L56: {
                        if (null == param6.field_Eb[(var11 + param0) * param6.field_v + (param4 + var12)]) {
                          break L56;
                        } else {
                          if (param7 != param6.field_Eb[(param0 + var11) * param6.field_v + (var12 - -param4)].field_h) {
                            break L56;
                          } else {
                            var14 = 1;
                            break L1;
                          }
                        }
                      }
                      L57: {
                        if (param6.field_Eb[param4 + (var12 + param6.field_v * (var11 - -param0))] == null) {
                          param6.field_Eb[param4 + (var12 - -(param6.field_v * (var11 + param0)))] = new ne(param7, param6);
                          break L57;
                        } else {
                          break L57;
                        }
                      }
                      L58: {
                        var13++;
                        stackIn_44_0 = var12;

                        if (-1 > (var9_int ^ -1)) {
                          stackIn_45_0 = stackIn_44_0;
                          stackIn_45_1 = 1;
                          break L58;
                        } else {
                          stackIn_45_0 = stackIn_44_0;
                          stackIn_45_1 = -1;
                          break L58;
                        }
                      }
                      var12 = stackIn_45_0 + stackIn_45_1;
                      continue L53;
                    }
                  }
                } else {
                  L59: {
                    if (0 >= var10) {
                      stackIn_7_0 = -1;
                      break L59;
                    } else {
                      stackIn_7_0 = 1;
                      break L59;
                    }
                  }
                  var11 = stackIn_7_0;
                  L60: while (true) {
                    L61: {
                      L62: {
                        if (var11 >= var10) {
                          break L62;
                        } else {
                          if (0 < var10) {
                            break L61;
                          } else {
                            break L62;
                          }
                        }
                      }
                      stackIn_12_0 = var10;
                      stackIn_12_1 = var11;
                      if (stackIn_12_0 >= stackIn_12_1) {
                        break L1;
                      } else {
                        if (var10 > 0) {
                          break L1;
                        } else {
                          break L61;
                        }
                      }
                    }
                    L63: {
                      if (null == param6.field_Eb[(param0 + var11) * param6.field_v + var12 - -param4]) {
                        break L63;
                      } else {
                        if (param6.field_Eb[param6.field_v * (var11 + param0) + (var12 + param4)].field_h != param7) {
                          break L63;
                        } else {
                          var14 = 1;
                          break L1;
                        }
                      }
                    }
                    L64: {
                      var13++;
                      if (null != param6.field_Eb[var12 - (-param4 - param6.field_v * (var11 - -param0))]) {
                        break L64;
                      } else {
                        param6.field_Eb[param6.field_v * (var11 - -param0) + (param4 + var12)] = new ne(param7, param6);
                        break L64;
                      }
                    }
                    L65: {
                      stackIn_22_0 = var11;

                      if (var10 > 0) {
                        stackIn_23_0 = stackIn_22_0;
                        stackIn_23_1 = 1;
                        break L65;
                      } else {
                        stackIn_23_0 = stackIn_22_0;
                        stackIn_23_1 = -1;
                        break L65;
                      }
                    }
                    var11 = stackIn_23_0 + stackIn_23_1;
                    continue L60;
                  }
                }
              }
              L66: {
                if (param2 != (var13 ^ -1)) {
                  break L66;
                } else {
                  if (var14 != 0) {
                    break L66;
                  } else {
                    var13 = 1;
                    qp.a(param0, param1, param2 ^ 0, param3, param4, param5 - -1, param6, param7, param8);
                    break L66;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L67: {
            var9 = decompiledCaughtException;
            stackIn_191_0 = (RuntimeException) (var9);

            stackIn_191_1 = new StringBuilder().append("qp.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_192_0 = (RuntimeException) ((Object) stackIn_191_0);
              stackIn_192_1 = (StringBuilder) ((Object) stackIn_191_1);
              stackIn_192_2 = "null";
              break L67;
            } else {
              stackIn_192_0 = (RuntimeException) ((Object) stackIn_191_0);
              stackIn_192_1 = (StringBuilder) ((Object) stackIn_191_1);
              stackIn_192_2 = "{...}";
              break L67;
            }
          }
          L68: {


            stackIn_194_1 = ((StringBuilder) (Object) stackIn_192_1).append(stackIn_192_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_192_0 = (RuntimeException) ((Object) stackIn_192_0);
              stackIn_195_1 = (StringBuilder) ((Object) stackIn_194_1);
              stackIn_195_2 = "null";
              break L68;
            } else {
              stackIn_192_0 = (RuntimeException) ((Object) stackIn_192_0);
              stackIn_195_1 = (StringBuilder) ((Object) stackIn_194_1);
              stackIn_195_2 = "{...}";
              break L68;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_192_0), stackIn_195_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_E = "Find opponents";
    }
}
