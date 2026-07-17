/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class es {
    static String[][][] field_c;
    static ru[] field_d;
    int field_a;
    static String field_b;
    private og[] field_e;

    final og a(byte param0) {
        if (param0 != 13) {
            boolean discarded$0 = ((es) this).a(97);
        }
        int fieldTemp$1 = ((es) this).field_a;
        ((es) this).field_a = ((es) this).field_a + 1;
        return ((es) this).field_e[fieldTemp$1];
    }

    public static void b(int param0) {
        if (param0 > -13) {
            es.b(-31);
        }
        field_b = null;
        field_d = null;
        field_c = null;
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_16_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_15_0 = 0;
            if (mg.field_e.field_q < param1) {
              if (param0 < -63) {
                if (null == am.field_z) {
                  return false;
                } else {
                  try {
                    L0: {
                      var2_int = am.field_z.d((byte) 43);
                      if (var2_int <= 0) {
                        L1: {
                          if (0 > var2_int) {
                            break L1;
                          } else {
                            if (ca.b(0) <= 30000L) {
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              break L1;
                            }
                          }
                        }
                        dj.a((byte) -127);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        L2: {
                          if (param1 + -mg.field_e.field_q < var2_int) {
                            var2_int = -mg.field_e.field_q + param1;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        am.field_z.a(0, mg.field_e.field_q, var2_int, mg.field_e.field_o);
                        iq.field_h = vi.b(46);
                        mg.field_e.field_q = mg.field_e.field_q + var2_int;
                        if (mg.field_e.field_q < param1) {
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0 != 0;
                        } else {
                          mg.field_e.field_q = 0;
                          stackOut_15_0 = 1;
                          stackIn_16_0 = stackOut_15_0;
                          return stackIn_16_0 != 0;
                        }
                      }
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var2 = (IOException) (Object) decompiledCaughtException;
                      dj.a((byte) -127);
                      decompiledRegionSelector0 = 1;
                      break L3;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    return false;
                  } else {
                    return false;
                  }
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0) {
        if (param0 <= 109) {
            field_d = null;
        }
        return ((es) this).field_a >= ((es) this).field_e.length ? true : false;
    }

    final static void a(int param0, int param1, au param2, int param3, boolean param4, int param5, byte param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9_int = 0;
        nf[] var9 = null;
        int var10 = 0;
        int[] var11_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        nf var14 = null;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        nf[][] stackIn_32_0 = null;
        nf[][] stackIn_33_0 = null;
        nf[][] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        RuntimeException decompiledCaughtException = null;
        nf[][] stackOut_31_0 = null;
        nf[][] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        nf[][] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var8_int = -49 % ((2 - param6) / 56);
              if (param3 < param1) {
                L2: {
                  stackOut_31_0 = pu.field_k;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_32_0 = stackOut_31_0;
                  if (param3 != -1) {
                    stackOut_33_0 = (nf[][]) (Object) stackIn_33_0;
                    stackOut_33_1 = 4 + param3;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    break L2;
                  } else {
                    stackOut_32_0 = (nf[][]) (Object) stackIn_32_0;
                    stackOut_32_1 = 1;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    break L2;
                  }
                }
                L3: {
                  var9 = stackIn_34_0[stackIn_34_1];
                  var10 = 1;
                  if (!param4) {
                    break L3;
                  } else {
                    if (param3 == -1) {
                      var11 = 0;
                      L4: while (true) {
                        if (~var11 <= ~lm.field_e.length) {
                          break L3;
                        } else {
                          if ((ln.field_d[var11 / 8] & 1 << (var11 & 7)) == 0) {
                            var11++;
                            continue L4;
                          } else {
                            var10 = 0;
                            break L3;
                          }
                        }
                      }
                    } else {
                      var11 = 0;
                      L5: while (true) {
                        L6: {
                          if (~(var9.length + -1) >= ~var11) {
                            break L6;
                          } else {
                            if ((tg.field_d[(var11 + param0) / 8] & 1 << (param0 - -var11 & 7)) == 0) {
                              var11++;
                              continue L5;
                            } else {
                              var10 = 0;
                              break L6;
                            }
                          }
                        }
                        param0 = param0 + (255 & t.field_b[param3]);
                        break L3;
                      }
                    }
                  }
                }
                var11 = 0;
                var12 = 0;
                L7: while (true) {
                  L8: {
                    if (param3 != -1) {
                      stackOut_50_0 = -1 + var9.length;
                      stackIn_51_0 = stackOut_50_0;
                      break L8;
                    } else {
                      stackOut_49_0 = lm.field_e.length;
                      stackIn_51_0 = stackOut_49_0;
                      break L8;
                    }
                  }
                  if (~stackIn_51_0 >= ~var12) {
                    L9: {
                      if (var11 != 0) {
                        break L9;
                      } else {
                        var12 = 0;
                        L10: while (true) {
                          if (var12 >= var9.length - 1) {
                            break L9;
                          } else {
                            L11: {
                              if (-1 != param3) {
                                ur.field_B[param3] = (byte)var12;
                                break L11;
                              } else {
                                param7 = var12;
                                break L11;
                              }
                            }
                            es.a(param0, param1, param2, param3 + 1, param4, param5, (byte) -72, param7);
                            if (fc.field_a) {
                              return;
                            } else {
                              var12++;
                              continue L10;
                            }
                          }
                        }
                      }
                    }
                    break L1;
                  } else {
                    L12: {
                      if (param3 == -1) {
                        param7 = var12;
                        break L12;
                      } else {
                        ur.field_B[param3] = (byte)var12;
                        break L12;
                      }
                    }
                    L13: {
                      L14: {
                        if (param3 != -1) {
                          break L14;
                        } else {
                          if (lm.field_e.length == 1) {
                            var13 = 1;
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      var14 = var9[1 + var12];
                      if (param4) {
                        L15: {
                          L16: {
                            if (var14.field_rb) {
                              break L16;
                            } else {
                              L17: {
                                if (var10 == 0) {
                                  break L17;
                                } else {
                                  if (!var14.field_xb) {
                                    break L17;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              stackOut_72_0 = 0;
                              stackIn_73_0 = stackOut_72_0;
                              break L15;
                            }
                          }
                          stackOut_71_0 = 1;
                          stackIn_73_0 = stackOut_71_0;
                          break L15;
                        }
                        var13 = stackIn_73_0;
                        break L13;
                      } else {
                        L18: {
                          if (param3 == -1) {
                            if (~vu.field_M.field_nc != ~lm.field_e[var12]) {
                              stackOut_65_0 = 0;
                              stackIn_66_0 = stackOut_65_0;
                              break L18;
                            } else {
                              stackOut_64_0 = 1;
                              stackIn_66_0 = stackOut_64_0;
                              break L18;
                            }
                          } else {
                            if ((vu.field_M.field_pc[param3] & 255) != var12) {
                              stackOut_62_0 = 0;
                              stackIn_66_0 = stackOut_62_0;
                              break L18;
                            } else {
                              stackOut_61_0 = 1;
                              stackIn_66_0 = stackOut_61_0;
                              break L18;
                            }
                          }
                        }
                        var13 = stackIn_66_0;
                        break L13;
                      }
                    }
                    L19: {
                      if (var13 == 0) {
                        break L19;
                      } else {
                        es.a(param0, param1, param2, param3 - -1, param4, param5, (byte) 120, param7);
                        var11 = 1;
                        break L19;
                      }
                    }
                    if (!fc.field_a) {
                      var12++;
                      continue L7;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                var9_int = 1;
                var10 = 0;
                L20: while (true) {
                  if (fs.field_d.length <= var10) {
                    if (var9_int != 0) {
                      fc.field_a = true;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var20 = fs.field_d[var10];
                    var19 = var20;
                    var18 = var19;
                    var17 = var18;
                    var11_ref_int__ = var17;
                    var12 = 0;
                    var13 = 0;
                    L21: while (true) {
                      L22: {
                        if (var13 >= var20.length) {
                          L23: {
                            if (var12 != 0) {
                              break L23;
                            } else {
                              if (~param3 != ~tq.field_b) {
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                          var9_int = 0;
                          var13 = 0;
                          L24: while (true) {
                            if (~var20.length >= ~var13) {
                              break L22;
                            } else {
                              L25: {
                                var14_int = var20[var13];
                                if (var14_int == -1) {
                                  jp.field_a = true;
                                  break L25;
                                } else {
                                  if (param3 > var14_int) {
                                    dt.field_d[var14_int] = true;
                                    break L25;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                              var13 += 2;
                              continue L24;
                            }
                          }
                        } else {
                          L26: {
                            var14_int = var20[var13];
                            var15 = var11_ref_int__[var13 - -1];
                            if (-1 != var14_int) {
                              L27: {
                                if (~var14_int != ~param3) {
                                  break L27;
                                } else {
                                  if (~var15 != ~param5) {
                                    break L27;
                                  } else {
                                    var12 = 1;
                                    break L26;
                                  }
                                }
                              }
                              if (~param3 >= ~var14_int) {
                                break L22;
                              } else {
                                if (var15 != (255 & ur.field_B[var14_int])) {
                                  break L22;
                                } else {
                                  break L26;
                                }
                              }
                            } else {
                              if (~var15 != ~lm.field_e[param7]) {
                                break L22;
                              } else {
                                break L26;
                              }
                            }
                          }
                          var13 += 2;
                          continue L21;
                        }
                      }
                      var10++;
                      continue L20;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var8 = decompiledCaughtException;
            stackOut_91_0 = (RuntimeException) var8;
            stackOut_91_1 = new StringBuilder().append("es.B(").append(param0).append(44).append(param1).append(44);
            stackIn_93_0 = stackOut_91_0;
            stackIn_93_1 = stackOut_91_1;
            stackIn_92_0 = stackOut_91_0;
            stackIn_92_1 = stackOut_91_1;
            if (param2 == null) {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "null";
              stackIn_94_0 = stackOut_93_0;
              stackIn_94_1 = stackOut_93_1;
              stackIn_94_2 = stackOut_93_2;
              break L28;
            } else {
              stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
              stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
              stackOut_92_2 = "{...}";
              stackIn_94_0 = stackOut_92_0;
              stackIn_94_1 = stackOut_92_1;
              stackIn_94_2 = stackOut_92_2;
              break L28;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_94_0, stackIn_94_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    es(at param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        og var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        ((es) this).field_a = 0;
        try {
          L0: {
            ((es) this).field_e = new og[param0.b(false)];
            var2_int = 0;
            var3 = (og) (Object) param0.e((byte) 105);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                var3.d(121);
                int incrementValue$4 = var2_int;
                var2_int++;
                ((es) this).field_e[incrementValue$4] = var3;
                var3 = (og) (Object) param0.a((byte) 123);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("es.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[][][]{new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[2][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][]};
        field_b = "Load Mission";
    }
}
