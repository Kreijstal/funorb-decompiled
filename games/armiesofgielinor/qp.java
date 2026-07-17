/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qp extends dr {
    static String field_E;

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_2_0 = new nd((Object) (Object) sq.a(param1[2].a(param0 ^ -24870), (byte) -2, param1[0].a(2), param1[1].a(2)));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("qp.C(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static int e() {
        return nm.field_z;
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, boolean param5, boolean param6, int param7, boolean param8, wk param9) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
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
                  var21 = dv.field_k.field_B;
                  var20 = var21;
                  var19 = var20;
                  var18 = var19;
                  var17 = var18;
                  var10_array = var17;
                  var11 = 0;
                  L5: while (true) {
                    if (var21.length <= var11) {
                      break L3;
                    } else {
                      var12 = 255 & var21[var11];
                      var13 = (255 & param7 >> 16) * var12 >> 8;
                      var14 = ((65280 & param7) >> 8) * var12 >> 8;
                      var15 = (255 & param7) * var12 >> 8;
                      var17[var11] = (var14 << 8) + (var13 << 16) - -var15;
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
            var10 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var10;
            stackOut_28_1 = new StringBuilder().append("qp.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param9 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
    }

    qp(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void g(int param0) {
        if (param0 < 114) {
            Object var2 = null;
            qp.a(-47, true, -89, 99, true, true, false, -24, false, (wk) null);
        }
        field_E = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, ha param6, int param7, Random param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_6_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        int stackIn_132_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_134_1 = 0;
        int stackIn_136_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        int stackIn_142_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_157_1 = 0;
        int stackIn_161_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_176_1 = 0;
        int stackOut_160_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_175_1 = 0;
        int stackOut_174_0 = 0;
        int stackOut_174_1 = 0;
        int stackOut_141_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_156_1 = 0;
        int stackOut_155_0 = 0;
        int stackOut_155_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_131_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_133_1 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        int stackOut_135_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_137_1 = 0;
        int stackOut_136_0 = 0;
        int stackOut_136_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (5 != param5) {
          L0: {
            var9_int = -param4 + param1;
            var10 = param3 + -param0;
            var11 = 0;
            var12 = 0;
            var13 = 0;
            var14 = 0;
            if (~param1 != ~param4) {
              if (~param3 != ~param0) {
                L1: {
                  if (var9_int >= 2) {
                    break L1;
                  } else {
                    if (var9_int > -2) {
                      L2: {
                        if (var10 > 0) {
                          stackOut_160_0 = 1;
                          stackIn_161_0 = stackOut_160_0;
                          break L2;
                        } else {
                          stackOut_159_0 = -1;
                          stackIn_161_0 = stackOut_159_0;
                          break L2;
                        }
                      }
                      var11 = stackIn_161_0;
                      L3: while (true) {
                        L4: {
                          L5: {
                            if (~var10 > ~var11) {
                              break L5;
                            } else {
                              if (var10 > 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (~var11 > ~var10) {
                            break L0;
                          } else {
                            if (var10 > 0) {
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L6: {
                          if (null == param6.field_Eb[(var11 - -param0) * param6.field_v + (var12 + param4)]) {
                            break L6;
                          } else {
                            if (param6.field_Eb[param4 + (var12 - -((var11 - -param0) * param6.field_v))].field_h != param7) {
                              break L6;
                            } else {
                              var14 = 1;
                              break L0;
                            }
                          }
                        }
                        L7: {
                          var13++;
                          if (param6.field_Eb[(var11 + param0) * param6.field_v + var12 - -param4] != null) {
                            break L7;
                          } else {
                            param6.field_Eb[var12 + param4 + (param0 + var11) * param6.field_v] = new ne(param7, param6);
                            break L7;
                          }
                        }
                        L8: {
                          stackOut_173_0 = var11;
                          stackIn_175_0 = stackOut_173_0;
                          stackIn_174_0 = stackOut_173_0;
                          if (var10 <= 0) {
                            stackOut_175_0 = stackIn_175_0;
                            stackOut_175_1 = -1;
                            stackIn_176_0 = stackOut_175_0;
                            stackIn_176_1 = stackOut_175_1;
                            break L8;
                          } else {
                            stackOut_174_0 = stackIn_174_0;
                            stackOut_174_1 = 1;
                            stackIn_176_0 = stackOut_174_0;
                            stackIn_176_1 = stackOut_174_1;
                            break L8;
                          }
                        }
                        var11 = stackIn_176_0 + stackIn_176_1;
                        continue L3;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                L9: {
                  if (var10 >= 2) {
                    break L9;
                  } else {
                    if (var10 > -2) {
                      L10: {
                        if (var9_int > 0) {
                          stackOut_141_0 = 1;
                          stackIn_142_0 = stackOut_141_0;
                          break L10;
                        } else {
                          stackOut_140_0 = -1;
                          stackIn_142_0 = stackOut_140_0;
                          break L10;
                        }
                      }
                      var12 = stackIn_142_0;
                      L11: while (true) {
                        L12: {
                          L13: {
                            if (~var12 < ~var9_int) {
                              break L13;
                            } else {
                              if (var9_int > 0) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (var9_int > var12) {
                            break L0;
                          } else {
                            if (var9_int > 0) {
                              break L0;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L14: {
                          if (null == param6.field_Eb[var12 + param4 + (var11 - -param0) * param6.field_v]) {
                            break L14;
                          } else {
                            if (~param7 != ~param6.field_Eb[var12 + param4 - -((param0 + var11) * param6.field_v)].field_h) {
                              break L14;
                            } else {
                              var14 = 1;
                              break L0;
                            }
                          }
                        }
                        L15: {
                          var13++;
                          if (null != param6.field_Eb[param6.field_v * (var11 - -param0) + (var12 - -param4)]) {
                            break L15;
                          } else {
                            param6.field_Eb[param6.field_v * (param0 + var11) + param4 + var12] = new ne(param7, param6);
                            break L15;
                          }
                        }
                        L16: {
                          stackOut_154_0 = var12;
                          stackIn_156_0 = stackOut_154_0;
                          stackIn_155_0 = stackOut_154_0;
                          if (var9_int > 0) {
                            stackOut_156_0 = stackIn_156_0;
                            stackOut_156_1 = 1;
                            stackIn_157_0 = stackOut_156_0;
                            stackIn_157_1 = stackOut_156_1;
                            break L16;
                          } else {
                            stackOut_155_0 = stackIn_155_0;
                            stackOut_155_1 = -1;
                            stackIn_157_0 = stackOut_155_0;
                            stackIn_157_1 = stackOut_155_1;
                            break L16;
                          }
                        }
                        var12 = stackIn_157_0 + stackIn_157_1;
                        continue L11;
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                if (ns.a(false, 100, param8) > 50) {
                  L17: {
                    if (var9_int > 0) {
                      stackOut_96_0 = 1;
                      stackIn_97_0 = stackOut_96_0;
                      break L17;
                    } else {
                      stackOut_95_0 = -1;
                      stackIn_97_0 = stackOut_95_0;
                      break L17;
                    }
                  }
                  var12 = stackIn_97_0;
                  L18: while (true) {
                    L19: {
                      L20: {
                        if (var12 >= var9_int) {
                          break L20;
                        } else {
                          if (var9_int > 0) {
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                      }
                      if (~var12 >= ~var9_int) {
                        break L0;
                      } else {
                        if (var9_int > 0) {
                          break L0;
                        } else {
                          break L19;
                        }
                      }
                    }
                    L21: {
                      if (param6.field_Eb[param4 + (var12 - -(param6.field_v * (param0 + var11)))] == null) {
                        break L21;
                      } else {
                        if (~param6.field_Eb[var12 + (param4 - -(param6.field_v * (var11 + param0)))].field_h != ~param7) {
                          break L21;
                        } else {
                          var14 = 1;
                          break L0;
                        }
                      }
                    }
                    L22: {
                      if (param6.field_Eb[param4 + (var12 - -((param0 + var11) * param6.field_v))] != null) {
                        break L22;
                      } else {
                        param6.field_Eb[param4 + var12 + param6.field_v * (param0 + var11)] = new ne(param7, param6);
                        break L22;
                      }
                    }
                    L23: {
                      var13++;
                      if (var12 == var9_int >> 1) {
                        L24: {
                          if (var10 <= 0) {
                            stackOut_113_0 = -1;
                            stackIn_114_0 = stackOut_113_0;
                            break L24;
                          } else {
                            stackOut_112_0 = 1;
                            stackIn_114_0 = stackOut_112_0;
                            break L24;
                          }
                        }
                        var11 = stackIn_114_0;
                        L25: while (true) {
                          L26: {
                            L27: {
                              L28: {
                                if (var10 < var11) {
                                  break L28;
                                } else {
                                  if (var10 > 0) {
                                    break L27;
                                  } else {
                                    break L28;
                                  }
                                }
                              }
                              if (var11 < var10) {
                                break L26;
                              } else {
                                if (var10 > 0) {
                                  break L26;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            L29: {
                              if (param6.field_Eb[var12 - -param4 - -((var11 - -param0) * param6.field_v)] == null) {
                                break L29;
                              } else {
                                if (param7 == param6.field_Eb[(param0 + var11) * param6.field_v + (var12 - -param4)].field_h) {
                                  break L26;
                                } else {
                                  break L29;
                                }
                              }
                            }
                            L30: {
                              var13++;
                              if (null == param6.field_Eb[(param0 + var11) * param6.field_v + (param4 + var12)]) {
                                param6.field_Eb[param6.field_v * (var11 - -param0) + param4 + var12] = new ne(param7, param6);
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                            L31: {
                              stackOut_127_0 = var11;
                              stackIn_129_0 = stackOut_127_0;
                              stackIn_128_0 = stackOut_127_0;
                              if (var10 <= 0) {
                                stackOut_129_0 = stackIn_129_0;
                                stackOut_129_1 = -1;
                                stackIn_130_0 = stackOut_129_0;
                                stackIn_130_1 = stackOut_129_1;
                                break L31;
                              } else {
                                stackOut_128_0 = stackIn_128_0;
                                stackOut_128_1 = 1;
                                stackIn_130_0 = stackOut_128_0;
                                stackIn_130_1 = stackOut_128_1;
                                break L31;
                              }
                            }
                            var11 = stackIn_130_0 + stackIn_130_1;
                            continue L25;
                          }
                          L32: {
                            stackOut_131_0 = var11;
                            stackIn_133_0 = stackOut_131_0;
                            stackIn_132_0 = stackOut_131_0;
                            if (0 < var10) {
                              stackOut_133_0 = stackIn_133_0;
                              stackOut_133_1 = -1;
                              stackIn_134_0 = stackOut_133_0;
                              stackIn_134_1 = stackOut_133_1;
                              break L32;
                            } else {
                              stackOut_132_0 = stackIn_132_0;
                              stackOut_132_1 = 1;
                              stackIn_134_0 = stackOut_132_0;
                              stackIn_134_1 = stackOut_132_1;
                              break L32;
                            }
                          }
                          var11 = stackIn_134_0 + stackIn_134_1;
                          break L23;
                        }
                      } else {
                        break L23;
                      }
                    }
                    L33: {
                      stackOut_135_0 = var12;
                      stackIn_137_0 = stackOut_135_0;
                      stackIn_136_0 = stackOut_135_0;
                      if (var9_int > 0) {
                        stackOut_137_0 = stackIn_137_0;
                        stackOut_137_1 = 1;
                        stackIn_138_0 = stackOut_137_0;
                        stackIn_138_1 = stackOut_137_1;
                        break L33;
                      } else {
                        stackOut_136_0 = stackIn_136_0;
                        stackOut_136_1 = -1;
                        stackIn_138_0 = stackOut_136_0;
                        stackIn_138_1 = stackOut_136_1;
                        break L33;
                      }
                    }
                    var12 = stackIn_138_0 + stackIn_138_1;
                    continue L18;
                  }
                } else {
                  L34: {
                    if (var10 <= 0) {
                      stackOut_52_0 = -1;
                      stackIn_53_0 = stackOut_52_0;
                      break L34;
                    } else {
                      stackOut_51_0 = 1;
                      stackIn_53_0 = stackOut_51_0;
                      break L34;
                    }
                  }
                  var11 = stackIn_53_0;
                  L35: while (true) {
                    L36: {
                      L37: {
                        if (~var10 >= ~var11) {
                          break L37;
                        } else {
                          if (var10 > 0) {
                            break L36;
                          } else {
                            break L37;
                          }
                        }
                      }
                      if (var10 >= var11) {
                        break L0;
                      } else {
                        if (var10 > 0) {
                          break L0;
                        } else {
                          break L36;
                        }
                      }
                    }
                    L38: {
                      if (null == param6.field_Eb[param4 + (var12 + (param0 + var11) * param6.field_v)]) {
                        break L38;
                      } else {
                        if (param6.field_Eb[var12 - -param4 - -(param6.field_v * (var11 - -param0))].field_h == param7) {
                          var14 = 1;
                          break L0;
                        } else {
                          break L38;
                        }
                      }
                    }
                    L39: {
                      if (null != param6.field_Eb[(var11 + param0) * param6.field_v + (param4 + var12)]) {
                        break L39;
                      } else {
                        param6.field_Eb[var12 - -param4 + param6.field_v * (param0 + var11)] = new ne(param7, param6);
                        break L39;
                      }
                    }
                    L40: {
                      var13++;
                      if (var11 != var10 >> 1) {
                        break L40;
                      } else {
                        L41: {
                          if (var9_int > 0) {
                            stackOut_69_0 = 1;
                            stackIn_70_0 = stackOut_69_0;
                            break L41;
                          } else {
                            stackOut_68_0 = -1;
                            stackIn_70_0 = stackOut_68_0;
                            break L41;
                          }
                        }
                        var12 = stackIn_70_0;
                        L42: while (true) {
                          L43: {
                            L44: {
                              L45: {
                                if (~var9_int > ~var12) {
                                  break L45;
                                } else {
                                  if (0 < var9_int) {
                                    break L44;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                              if (~var9_int < ~var12) {
                                break L43;
                              } else {
                                if (var9_int > 0) {
                                  break L43;
                                } else {
                                  break L44;
                                }
                              }
                            }
                            L46: {
                              if (param6.field_Eb[(param0 + var11) * param6.field_v + (var12 - -param4)] == null) {
                                break L46;
                              } else {
                                if (~param7 != ~param6.field_Eb[(var11 - -param0) * param6.field_v + (param4 + var12)].field_h) {
                                  break L46;
                                } else {
                                  break L43;
                                }
                              }
                            }
                            L47: {
                              var13++;
                              if (null != param6.field_Eb[param6.field_v * (param0 + var11) + (param4 + var12)]) {
                                break L47;
                              } else {
                                param6.field_Eb[param4 + (var12 - -((param0 + var11) * param6.field_v))] = new ne(param7, param6);
                                break L47;
                              }
                            }
                            L48: {
                              stackOut_82_0 = var12;
                              stackIn_84_0 = stackOut_82_0;
                              stackIn_83_0 = stackOut_82_0;
                              if (var9_int > 0) {
                                stackOut_84_0 = stackIn_84_0;
                                stackOut_84_1 = 1;
                                stackIn_85_0 = stackOut_84_0;
                                stackIn_85_1 = stackOut_84_1;
                                break L48;
                              } else {
                                stackOut_83_0 = stackIn_83_0;
                                stackOut_83_1 = -1;
                                stackIn_85_0 = stackOut_83_0;
                                stackIn_85_1 = stackOut_83_1;
                                break L48;
                              }
                            }
                            var12 = stackIn_85_0 + stackIn_85_1;
                            continue L42;
                          }
                          L49: {
                            stackOut_86_0 = var12;
                            stackIn_88_0 = stackOut_86_0;
                            stackIn_87_0 = stackOut_86_0;
                            if (var9_int <= 0) {
                              stackOut_88_0 = stackIn_88_0;
                              stackOut_88_1 = 1;
                              stackIn_89_0 = stackOut_88_0;
                              stackIn_89_1 = stackOut_88_1;
                              break L49;
                            } else {
                              stackOut_87_0 = stackIn_87_0;
                              stackOut_87_1 = -1;
                              stackIn_89_0 = stackOut_87_0;
                              stackIn_89_1 = stackOut_87_1;
                              break L49;
                            }
                          }
                          var12 = stackIn_89_0 + stackIn_89_1;
                          break L40;
                        }
                      }
                    }
                    L50: {
                      stackOut_90_0 = var11;
                      stackIn_92_0 = stackOut_90_0;
                      stackIn_91_0 = stackOut_90_0;
                      if (var10 > 0) {
                        stackOut_92_0 = stackIn_92_0;
                        stackOut_92_1 = 1;
                        stackIn_93_0 = stackOut_92_0;
                        stackIn_93_1 = stackOut_92_1;
                        break L50;
                      } else {
                        stackOut_91_0 = stackIn_91_0;
                        stackOut_91_1 = -1;
                        stackIn_93_0 = stackOut_91_0;
                        stackIn_93_1 = stackOut_91_1;
                        break L50;
                      }
                    }
                    var11 = stackIn_93_0 + stackIn_93_1;
                    continue L35;
                  }
                }
              } else {
                L51: {
                  if (0 < var9_int) {
                    stackOut_25_0 = 1;
                    stackIn_26_0 = stackOut_25_0;
                    break L51;
                  } else {
                    stackOut_24_0 = -1;
                    stackIn_26_0 = stackOut_24_0;
                    break L51;
                  }
                }
                var12 = stackIn_26_0;
                L52: while (true) {
                  L53: {
                    L54: {
                      if (var9_int <= var12) {
                        break L54;
                      } else {
                        if (var9_int > 0) {
                          break L53;
                        } else {
                          break L54;
                        }
                      }
                    }
                    if (var9_int >= var12) {
                      break L0;
                    } else {
                      if (var9_int > 0) {
                        break L0;
                      } else {
                        break L53;
                      }
                    }
                  }
                  L55: {
                    if (null == param6.field_Eb[(var11 + param0) * param6.field_v + (param4 + var12)]) {
                      break L55;
                    } else {
                      if (~param7 != ~param6.field_Eb[(param0 + var11) * param6.field_v + (var12 - -param4)].field_h) {
                        break L55;
                      } else {
                        var14 = 1;
                        break L0;
                      }
                    }
                  }
                  L56: {
                    if (param6.field_Eb[param4 + (var12 + param6.field_v * (var11 - -param0))] == null) {
                      param6.field_Eb[param4 + (var12 - -(param6.field_v * (var11 + param0)))] = new ne(param7, param6);
                      break L56;
                    } else {
                      break L56;
                    }
                  }
                  L57: {
                    var13++;
                    stackOut_39_0 = var12;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_40_0 = stackOut_39_0;
                    if (var9_int > 0) {
                      stackOut_41_0 = stackIn_41_0;
                      stackOut_41_1 = 1;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      break L57;
                    } else {
                      stackOut_40_0 = stackIn_40_0;
                      stackOut_40_1 = -1;
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_42_1 = stackOut_40_1;
                      break L57;
                    }
                  }
                  var12 = stackIn_42_0 + stackIn_42_1;
                  continue L52;
                }
              }
            } else {
              L58: {
                if (0 >= var10) {
                  stackOut_5_0 = -1;
                  stackIn_6_0 = stackOut_5_0;
                  break L58;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L58;
                }
              }
              var11 = stackIn_6_0;
              L59: while (true) {
                L60: {
                  L61: {
                    if (~var11 <= ~var10) {
                      break L61;
                    } else {
                      if (0 < var10) {
                        break L60;
                      } else {
                        break L61;
                      }
                    }
                  }
                  if (var10 >= var11) {
                    break L0;
                  } else {
                    if (var10 > 0) {
                      break L0;
                    } else {
                      break L60;
                    }
                  }
                }
                L62: {
                  if (null == param6.field_Eb[(param0 + var11) * param6.field_v + var12 - -param4]) {
                    break L62;
                  } else {
                    if (~param6.field_Eb[param6.field_v * (var11 + param0) + (var12 + param4)].field_h != ~param7) {
                      break L62;
                    } else {
                      var14 = 1;
                      break L0;
                    }
                  }
                }
                L63: {
                  var13++;
                  if (null != param6.field_Eb[var12 - (-param4 - param6.field_v * (var11 - -param0))]) {
                    break L63;
                  } else {
                    param6.field_Eb[param6.field_v * (var11 - -param0) + (param4 + var12)] = new ne(param7, param6);
                    break L63;
                  }
                }
                L64: {
                  stackOut_18_0 = var11;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (var10 > 0) {
                    stackOut_20_0 = stackIn_20_0;
                    stackOut_20_1 = 1;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L64;
                  } else {
                    stackOut_19_0 = stackIn_19_0;
                    stackOut_19_1 = -1;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L64;
                  }
                }
                var11 = stackIn_21_0 + stackIn_21_1;
                continue L59;
              }
            }
          }
          L65: {
            if (param2 != ~var13) {
              break L65;
            } else {
              if (var14 != 0) {
                break L65;
              } else {
                var13 = 1;
                qp.a(param0, param1, param2, param3, param4, param5 - -1, param6, param7, param8);
                break L65;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Find opponents";
    }
}
