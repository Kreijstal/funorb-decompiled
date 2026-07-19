/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    static String field_a;
    static int[] field_c;
    static ll field_d;
    static db[] field_b;

    final static short[] a(th param0, byte param1, int param2, short[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_10_0 = null;
        short[] stackIn_21_0 = null;
        short[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_20_0 = null;
        short[] stackOut_23_0 = null;
        short[] stackOut_9_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param0.g(param2, 26527);
            if (0 != var4_int) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (param3.length == var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param3 = new short[var4_int];
                break L1;
              }
              var5 = param0.g(4, 26527);
              if (param1 <= -32) {
                L3: {
                  L4: {
                    L5: {
                      var6 = (short)param0.g(16, 26527);
                      if ((var5 ^ -1) < -1) {
                        break L5;
                      } else {
                        var7 = 0;
                        L6: while (true) {
                          if (var7 >= var4_int) {
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            param3[var7] = (short)var6;
                            var7++;
                            if (var8 != 0) {
                              break L4;
                            } else {
                              continue L6;
                            }
                          }
                        }
                      }
                    }
                    var7 = 0;
                    L7: while (true) {
                      if (var4_int <= var7) {
                        break L4;
                      } else {
                        stackOut_20_0 = (short[]) (param3);
                        stackIn_24_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (var8 != 0) {
                          break L3;
                        } else {
                          stackIn_21_0[var7] = (short)(param0.g(var5, 26527) + var6);
                          var7++;
                          continue L7;
                        }
                      }
                    }
                  }
                  stackOut_23_0 = (short[]) (param3);
                  stackIn_24_0 = stackOut_23_0;
                  break L3;
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_9_0 = (short[]) null;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var4);
            stackOut_25_1 = new StringBuilder().append("hi.D(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          L9: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (short[]) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_24_0;
          }
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        wh var9 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_34_0 = null;
        String stackIn_38_0 = null;
        String stackIn_39_0 = null;
        String stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        wh stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_25_0 = null;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        String stackOut_37_0 = null;
        String stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        wh stackOut_44_0 = null;
        wh stackOut_43_0 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = rf.field_c;
              var2 = param0;
              if (-3 != (sh.field_a ^ -1)) {
                break L1;
              } else {
                var3_long = -ug.field_x + rf.c(param0 + 0);
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (var2 >= 0) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              }
            }
            var3 = 0;
            L2: while (true) {
              if (ee.field_g.length <= var3) {
                break L0;
              } else {
                var4 = ni.field_a[var3];
                if (var10 == 0) {
                  L3: {
                    L4: {
                      if (var4 >= 0) {
                        break L4;
                      } else {
                        var5 = ea.field_b;
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (bc.field_H.field_d == var4) {
                        break L5;
                      } else {
                        var5 = ec.field_c;
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var5 = g.field_n;
                    break L3;
                  }
                  L6: {
                    var6 = ee.field_g[var3];
                    if (sh.field_a != 2) {
                      break L6;
                    } else {
                      if (var2 != 1) {
                        break L6;
                      } else {
                        L7: {
                          if (hf.field_b.length > ed.field_t.length) {
                            stackOut_17_0 = hf.field_b.length;
                            stackIn_18_0 = stackOut_17_0;
                            break L7;
                          } else {
                            stackOut_16_0 = ed.field_t.length;
                            stackIn_18_0 = stackOut_16_0;
                            break L7;
                          }
                        }
                        L8: {
                          var7 = stackIn_18_0;
                          if (qc.field_e.length < nl.field_a.length) {
                            stackOut_20_0 = nl.field_a.length;
                            stackIn_21_0 = stackOut_20_0;
                            break L8;
                          } else {
                            stackOut_19_0 = qc.field_e.length;
                            stackIn_21_0 = stackOut_19_0;
                            break L8;
                          }
                        }
                        L9: {
                          var8 = stackIn_21_0;
                          if (6 > var3) {
                            break L9;
                          } else {
                            if (var7 + 6 > var3) {
                              L10: {
                                if (0 <= var3 - (6 + -ed.field_t.length) + -var7) {
                                  stackOut_26_0 = ed.field_t[-var7 + ed.field_t.length + (-6 + var3)];
                                  stackIn_27_0 = stackOut_26_0;
                                  break L10;
                                } else {
                                  stackOut_25_0 = "";
                                  stackIn_27_0 = stackOut_25_0;
                                  break L10;
                                }
                              }
                              var6 = stackIn_27_0;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (var7 + 7 > var3) {
                          break L6;
                        } else {
                          if (var8 + (7 - -var7) > var3) {
                            L11: {
                              if (qc.field_e.length <= -var7 + -7 + var3) {
                                stackOut_33_0 = "";
                                stackIn_34_0 = stackOut_33_0;
                                break L11;
                              } else {
                                stackOut_32_0 = qc.field_e[-var7 + (-7 + var3)];
                                stackIn_34_0 = stackOut_32_0;
                                break L11;
                              }
                            }
                            var6 = stackIn_34_0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  L12: {
                    if ((var4 ^ -1) != 1) {
                      break L12;
                    } else {
                      var6 = Integer.toString(var2);
                      break L12;
                    }
                  }
                  L13: {
                    stackOut_37_0 = (String) (var6);
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_38_0 = stackOut_37_0;
                    if ((var4 ^ -1) > -1) {
                      stackOut_39_0 = (String) ((Object) stackIn_39_0);
                      stackOut_39_1 = 0;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      break L13;
                    } else {
                      stackOut_38_0 = (String) ((Object) stackIn_38_0);
                      stackOut_38_1 = 1;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      break L13;
                    }
                  }
                  L14: {
                    var7 = ii.a(stackIn_40_0, stackIn_40_1 != 0, 0);
                    var8 = -(var7 >> -1686790367) + uh.field_D;
                    if ((var4 ^ -1) <= -1) {
                      L15: {
                        if (bc.field_H.field_d != var4) {
                          stackOut_44_0 = sc.field_d;
                          stackIn_45_0 = stackOut_44_0;
                          break L15;
                        } else {
                          stackOut_43_0 = fg.field_c;
                          stackIn_45_0 = stackOut_43_0;
                          break L15;
                        }
                      }
                      L16: {
                        var9 = stackIn_45_0;
                        var1_int = var1_int + we.field_l;
                        if (var9 == null) {
                          break L16;
                        } else {
                          var9.a(var1_int, (oh.field_b << -2026513727) + fb.field_g, var7 - -(jh.field_e << 1912526497), var8 + -jh.field_e, -1160208572);
                          break L16;
                        }
                      }
                      var1_int = var1_int + oh.field_b;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L17: {
                    L18: {
                      if (var4 < 0) {
                        break L18;
                      } else {
                        fb.field_m.b(var6, var8, var1_int - -kk.field_o, var5, -1);
                        var1_int = var1_int + (oh.field_b - -we.field_l + fb.field_g);
                        if (var10 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    pb.field_i.b(var6, var8, var1_int + sb.field_f, var5, -1);
                    var1_int = var1_int + hc.field_fb;
                    break L17;
                  }
                  var3++;
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "hi.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 5) {
            field_c = (int[]) null;
        }
    }

    final static boolean a(int param0, char param1) {
        if (param0 == 18670) {
          if (param1 < 65) {
            if (param1 >= 97) {
              if (param1 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (90 < param1) {
              if (param1 >= 97) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          field_d = (ll) null;
          if (param1 >= 65) {
            if (90 < param1) {
              if (param1 >= 97) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (param1 >= 97) {
              if (param1 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    static {
        field_c = new int[]{2, 2, 3, 5, 1, 2, 3, 5, 3, 5, 10, 1, 3, 5, 10, 2};
        field_a = "Create your own free Jagex account";
    }
}
