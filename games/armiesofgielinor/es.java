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
            this.a(97);
        }
        int fieldTemp$0 = this.field_a;
        this.field_a = this.field_a + 1;
        return this.field_e[fieldTemp$0];
    }

    public static void b(int param0) {
        if (param0 > -13) {
            es.b(-31);
        }
        field_b = null;
        field_d = null;
        field_c = (String[][][]) null;
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            int stackIn_14_0 = 0;
            int stackIn_16_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            IOException var2 = null;
            if (mg.field_e.field_q < param1) {
              if (param0 < -63) {
                if (null == am.field_z) {
                  return false;
                } else {
                  try {
                    L0: {
                      var2_int = am.field_z.d((byte) 43);
                      if (-1 <= (var2_int ^ -1)) {
                        L1: {
                          if (0 > var2_int) {
                            break L1;
                          } else {
                            if (ca.b(0) <= 30000L) {
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L1;
                            }
                          }
                        }
                        dj.a((byte) -127);
                        decompiledRegionSelector0 = 3;
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
                          stackIn_14_0 = 0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          mg.field_e.field_q = 0;
                          stackIn_16_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var2 = (IOException) (Object) decompiledCaughtException;
                      dj.a((byte) -127);
                      decompiledRegionSelector0 = 3;
                      break L3;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    return stackIn_14_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      return stackIn_16_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 2) {
                        return false;
                      } else {
                        return false;
                      }
                    }
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
            field_d = (ru[]) null;
        }
        return this.field_a >= this.field_e.length ? true : false;
    }

    final static void a(int param0, int param1, au param2, int param3, boolean param4, int param5, byte param6, int param7) {
        nf[][] stackIn_33_0 = null;
        nf[][] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        nf[] var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var11_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        nf var14 = null;
        int var14_int = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var8_int = -49 % ((2 - param6) / 56);
              if (param3 < param1) {
                L2: {
                  stackIn_33_0 = pu.field_k;

                  if ((param3 ^ -1) != 0) {
                    stackIn_34_0 = (nf[][]) ((Object) stackIn_33_0);
                    stackIn_34_1 = 4 + param3;
                    break L2;
                  } else {
                    stackIn_34_0 = (nf[][]) ((Object) stackIn_33_0);
                    stackIn_34_1 = 1;
                    break L2;
                  }
                }
                L3: {
                  var9 = stackIn_34_0[stackIn_34_1];
                  var10 = 1;
                  if (!param4) {
                    break L3;
                  } else {
                    if (0 == (param3 ^ -1)) {
                      var11 = 0;
                      L4: while (true) {
                        if (var11 >= lm.field_e.length) {
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
                          if (var9.length + -1 <= var11) {
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
                    if (0 != (param3 ^ -1)) {
                      stackIn_51_0 = -1 + var9.length;
                      break L8;
                    } else {
                      stackIn_51_0 = lm.field_e.length;
                      break L8;
                    }
                  }
                  if ((stackIn_51_0 ^ -1) >= (var12 ^ -1)) {
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
                              decompiledRegionSelector0 = 2;
                              break L0;
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
                        if (0 != (param3 ^ -1)) {
                          break L14;
                        } else {
                          if ((lm.field_e.length ^ -1) == -2) {
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
                          if (!var14.field_rb) {
                            if (var10 != 0) {
                              if (var14.field_xb) {
                                stackIn_75_0 = 1;
                                break L15;
                              } else {
                                stackIn_75_0 = 0;
                                break L15;
                              }
                            } else {
                              stackIn_75_0 = 0;
                              break L15;
                            }
                          } else {
                            stackIn_75_0 = 1;
                            break L15;
                          }
                        }
                        var13 = stackIn_75_0;
                        break L13;
                      } else {
                        L16: {
                          if ((param3 ^ -1) == 0) {
                            if (vu.field_M.field_nc != lm.field_e[var12]) {
                              stackIn_66_0 = 0;
                              break L16;
                            } else {
                              stackIn_66_0 = 1;
                              break L16;
                            }
                          } else {
                            if ((vu.field_M.field_pc[param3] & 255) != var12) {
                              stackIn_66_0 = 0;
                              break L16;
                            } else {
                              stackIn_66_0 = 1;
                              break L16;
                            }
                          }
                        }
                        var13 = stackIn_66_0;
                        break L13;
                      }
                    }
                    L17: {
                      if (var13 == 0) {
                        break L17;
                      } else {
                        es.a(param0, param1, param2, param3 - -1, param4, param5, (byte) 120, param7);
                        var11 = 1;
                        break L17;
                      }
                    }
                    if (!fc.field_a) {
                      var12++;
                      continue L7;
                    } else {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              } else {
                var9_int = 1;
                var10 = 0;
                L18: while (true) {
                  if (fs.field_d.length <= var10) {
                    if (var9_int != 0) {
                      fc.field_a = true;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var18 = fs.field_d[var10];
                    var17 = var18;
                    var11_ref_int__ = var17;
                    var12 = 0;
                    var13 = 0;
                    L19: while (true) {
                      L20: {
                        if (var13 >= var18.length) {
                          L21: {
                            if (var12 != 0) {
                              break L21;
                            } else {
                              if (param3 != tq.field_b) {
                                break L20;
                              } else {
                                break L21;
                              }
                            }
                          }
                          var9_int = 0;
                          var13 = 0;
                          L22: while (true) {
                            if (var18.length <= var13) {
                              break L20;
                            } else {
                              L23: {
                                var14_int = var18[var13];
                                if (var14_int == -1) {
                                  jp.field_a = true;
                                  break L23;
                                } else {
                                  if (param3 > var14_int) {
                                    dt.field_d[var14_int] = true;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                              var13 += 2;
                              continue L22;
                            }
                          }
                        } else {
                          L24: {
                            var14_int = var18[var13];
                            var15 = var11_ref_int__[var13 - -1];
                            if (-1 != var14_int) {
                              L25: {
                                if (var14_int != param3) {
                                  break L25;
                                } else {
                                  if (var15 != param5) {
                                    break L25;
                                  } else {
                                    var12 = 1;
                                    break L24;
                                  }
                                }
                              }
                              if (param3 <= var14_int) {
                                break L20;
                              } else {
                                if (var15 != (255 & ur.field_B[var14_int])) {
                                  break L20;
                                } else {
                                  break L24;
                                }
                              }
                            } else {
                              if (var15 != lm.field_e[param7]) {
                                break L20;
                              } else {
                                break L24;
                              }
                            }
                          }
                          var13 += 2;
                          continue L19;
                        }
                      }
                      var10++;
                      continue L18;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var8 = decompiledCaughtException;
            stackIn_95_0 = (RuntimeException) (var8);

            stackIn_95_1 = new StringBuilder().append("es.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_96_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "null";
              break L26;
            } else {
              stackIn_96_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "{...}";
              break L26;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_96_0), stackIn_96_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    es(at param0) {
        int incrementValue$2 = 0;
        int var2_int = 0;
        og var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_a = 0;
        try {
          L0: {
            this.field_e = new og[param0.b(false)];
            var2_int = 0;
            var3 = (og) ((Object) param0.e((byte) 105));
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                var3.d(121);
                incrementValue$2 = var2_int;
                var2_int++;
                this.field_e[incrementValue$2] = var3;
                var3 = (og) ((Object) param0.a((byte) 123));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("es.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    static {
        field_c = new String[][][]{new String[][]{new String[]{null, null, null, null}}, new String[][]{new String[]{null, "movement_range", null, null}}, new String[][]{new String[]{null, null, null}}, new String[][]{new String[]{null, null, null, null, null}}, new String[][]{new String[]{null, null, null, null, null}}, new String[][]{new String[]{null, null, null, null}}, new String[][]{new String[]{null, null, null}}, new String[][]{new String[]{null, null, null, null, null, null}}, new String[][]{new String[]{null, null, null}}, new String[][]{new String[]{null, null, null, null}, new String[]{null, null, null}}, new String[][]{new String[]{null, null, null, null, null}}, new String[][]{new String[]{null, null, null, null, null}}, new String[][]{new String[]{null, null, null, null}}, new String[][]{new String[]{null, null, null, null}}, new String[][]{new String[]{"key_space", "key_arrows", "key_esc"}}};
        field_b = "Load Mission";
    }
}
