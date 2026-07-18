/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un {
    static String field_c;
    static String field_b;
    static String field_a;

    final static void a(byte param0) {
        kf.field_I = null;
        int var1 = -59 / ((-91 - param0) / 32);
        ce.field_C = null;
    }

    final static cd a(int param0, String param1, int param2) {
        cd var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        cd stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        cd stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new cd(false);
            var3.field_f = param1;
            var4 = -78 % ((param2 - 59) / 32);
            var3.field_h = param0;
            stackOut_0_0 = (cd) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("un.F(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = client.field_A ? 1 : 0;
          var2 = param1;
          if (var2 == 32) {
            break L0;
          } else {
            if (var2 == 160) {
              break L0;
            } else {
              if (var2 == 95) {
                break L0;
              } else {
                if (var2 != 45) {
                  L1: {
                    if (var2 != 91) {
                      if (var2 != 93) {
                        if (35 != var2) {
                          L2: {
                            if (var2 == 224) {
                              break L2;
                            } else {
                              if (var2 == 225) {
                                break L2;
                              } else {
                                if (226 == var2) {
                                  break L2;
                                } else {
                                  if (228 != var2) {
                                    if (var2 != 227) {
                                      if (var2 == 192) {
                                        break L2;
                                      } else {
                                        if (var2 != 193) {
                                          if (var2 != 194) {
                                            if (var2 != 196) {
                                              if (195 != var2) {
                                                L3: {
                                                  if (var2 == 232) {
                                                    break L3;
                                                  } else {
                                                    if (var2 == 233) {
                                                      break L3;
                                                    } else {
                                                      if (var2 == 234) {
                                                        break L3;
                                                      } else {
                                                        if (var2 != 235) {
                                                          if (200 != var2) {
                                                            if (var2 != 201) {
                                                              if (var2 == 202) {
                                                                break L3;
                                                              } else {
                                                                if (var2 == 203) {
                                                                  break L3;
                                                                } else {
                                                                  L4: {
                                                                    if (var2 == 237) {
                                                                      break L4;
                                                                    } else {
                                                                      if (var2 != 238) {
                                                                        if (var2 != 239) {
                                                                          if (205 == var2) {
                                                                            break L4;
                                                                          } else {
                                                                            if (var2 == 206) {
                                                                              break L4;
                                                                            } else {
                                                                              if (var2 != 207) {
                                                                                L5: {
                                                                                  if (var2 == 242) {
                                                                                    break L5;
                                                                                  } else {
                                                                                    if (243 == var2) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      if (var2 == 244) {
                                                                                        break L5;
                                                                                      } else {
                                                                                        if (var2 != 246) {
                                                                                          if (245 == var2) {
                                                                                            break L5;
                                                                                          } else {
                                                                                            if (var2 == 210) {
                                                                                              break L5;
                                                                                            } else {
                                                                                              if (var2 != 211) {
                                                                                                if (var2 == 212) {
                                                                                                  break L5;
                                                                                                } else {
                                                                                                  if (var2 == 214) {
                                                                                                    break L5;
                                                                                                  } else {
                                                                                                    if (213 == var2) {
                                                                                                      break L5;
                                                                                                    } else {
                                                                                                      L6: {
                                                                                                        if (249 == var2) {
                                                                                                          break L6;
                                                                                                        } else {
                                                                                                          if (var2 == 250) {
                                                                                                            break L6;
                                                                                                          } else {
                                                                                                            if (var2 != 251) {
                                                                                                              if (252 == var2) {
                                                                                                                break L6;
                                                                                                              } else {
                                                                                                                if (217 != var2) {
                                                                                                                  if (var2 == 218) {
                                                                                                                    break L6;
                                                                                                                  } else {
                                                                                                                    if (219 == var2) {
                                                                                                                      break L6;
                                                                                                                    } else {
                                                                                                                      if (var2 != 220) {
                                                                                                                        L7: {
                                                                                                                          if (231 == var2) {
                                                                                                                            break L7;
                                                                                                                          } else {
                                                                                                                            if (var2 != 199) {
                                                                                                                              L8: {
                                                                                                                                if (var2 == 255) {
                                                                                                                                  break L8;
                                                                                                                                } else {
                                                                                                                                  if (var2 != 376) {
                                                                                                                                    L9: {
                                                                                                                                      if (var2 != 241) {
                                                                                                                                        if (209 != var2) {
                                                                                                                                          if (var2 == 223) {
                                                                                                                                            return 'b';
                                                                                                                                          } else {
                                                                                                                                            return Character.toLowerCase(param1);
                                                                                                                                          }
                                                                                                                                        } else {
                                                                                                                                          break L9;
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        break L9;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    return 'n';
                                                                                                                                  } else {
                                                                                                                                    break L8;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              return 'y';
                                                                                                                            } else {
                                                                                                                              break L7;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                        return 'c';
                                                                                                                      } else {
                                                                                                                        break L6;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  break L6;
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L6;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                break L5;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          break L5;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              } else {
                                                                                break L4;
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          break L4;
                                                                        }
                                                                      } else {
                                                                        break L4;
                                                                      }
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                }
                                                              }
                                                            } else {
                                                              break L3;
                                                            }
                                                          } else {
                                                            break L3;
                                                          }
                                                        } else {
                                                          break L3;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                return 'e';
                                              } else {
                                                break L2;
                                              }
                                            } else {
                                              break L2;
                                            }
                                          } else {
                                            break L2;
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    } else {
                                      break L2;
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                          return 'a';
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                  return param1;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        return '_';
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4 = new char[param3];
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (var6 >= param3) {
                stackOut_12_0 = new String(var4, 0, var5);
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                L2: {
                  var7 = param0[var6 + param2] & 255;
                  if (0 != var7) {
                    L3: {
                      if (var7 < 128) {
                        break L3;
                      } else {
                        if (var7 >= 160) {
                          break L3;
                        } else {
                          L4: {
                            var8 = nh.field_l[-128 + var7];
                            if (0 != var8) {
                              break L4;
                            } else {
                              var8 = 63;
                              break L4;
                            }
                          }
                          var7 = var8;
                          break L3;
                        }
                      }
                    }
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = (char)var7;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4_ref;
            stackOut_14_1 = new StringBuilder().append("un.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 0 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_13_0;
    }

    final static boolean a(int param0, int param1, int param2) {
        L0: {
          if (0 > param1) {
            break L0;
          } else {
            if (param1 > 11) {
              break L0;
            } else {
              L1: {
                if (param2 < 1) {
                  break L1;
                } else {
                  if (param2 > gk.c(param0, 1, param1)) {
                    break L1;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            }
          }
        }
        return false;
    }

    final static vg a(int param0, uf param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        vg stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        vg stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.a(8, (byte) 87);
            if (var2_int > 0) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                var3 = wg.a(param1, (byte) -127) ? 1 : 0;
                if (param0 == -128) {
                  break L1;
                } else {
                  var9 = null;
                  vg discarded$20 = un.a(36, (uf) null);
                  break L1;
                }
              }
              L2: {
                var4 = wg.a(param1, (byte) -112) ? 1 : 0;
                var5 = new vg();
                var5.field_l = (short)param1.a(16, (byte) 103);
                int discarded$21 = 16;
                var5.field_J = v.a(param1, true, var5.field_J);
                int discarded$22 = 16;
                var5.field_o = v.a(param1, true, var5.field_o);
                int discarded$23 = 16;
                var5.field_e = v.a(param1, true, var5.field_e);
                var5.field_L = (short)param1.a(16, (byte) 55);
                int discarded$24 = 16;
                var5.field_M = v.a(param1, true, var5.field_M);
                int discarded$25 = 16;
                var5.field_c = v.a(param1, true, var5.field_c);
                int discarded$26 = 16;
                var5.field_A = v.a(param1, true, var5.field_A);
                if (var3 != 0) {
                  var5.field_D = (short)param1.a(16, (byte) 90);
                  int discarded$27 = 16;
                  var5.field_k = v.a(param1, true, var5.field_k);
                  int discarded$28 = 16;
                  var5.field_u = v.a(param1, true, var5.field_u);
                  int discarded$29 = 16;
                  var5.field_O = v.a(param1, true, var5.field_O);
                  int discarded$30 = 16;
                  var5.field_F = v.a(param1, true, var5.field_F);
                  int discarded$31 = 16;
                  var5.field_t = v.a(param1, true, var5.field_t);
                  int discarded$32 = 16;
                  var5.field_r = v.a(param1, true, var5.field_r);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var4 != 0) {
                  int discarded$33 = param1.a(16, (byte) 125);
                  int discarded$34 = 16;
                  var5.field_y = v.a(param1, true, var5.field_y);
                  int discarded$35 = 16;
                  var5.field_z = v.a(param1, true, var5.field_z);
                  int discarded$36 = 16;
                  var5.field_C = v.a(param1, true, var5.field_C);
                  int discarded$37 = 16;
                  var5.field_N = v.a(param1, true, var5.field_N);
                  int discarded$38 = 16;
                  var5.field_P = v.a(param1, true, var5.field_P);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (wg.a(param1, (byte) -123)) {
                  int discarded$39 = 16;
                  var5.field_j = v.a(param1, true, var5.field_j);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (!wg.a(param1, (byte) -115)) {
                  break L5;
                } else {
                  var5.field_Q = he.a((byte) 5, var5.field_Q, 16, param1);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    if (var5.field_Q.length <= var7) {
                      if (var6 != 0) {
                        var5.field_B = (byte)(var6 + 1);
                        break L5;
                      } else {
                        var5.field_Q = null;
                        break L5;
                      }
                    } else {
                      L7: {
                        if (var6 < (var5.field_Q[var7] & 255)) {
                          var6 = var5.field_Q[var7] & 255;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_25_0 = (vg) var5;
              stackIn_26_0 = stackOut_25_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var2;
            stackOut_27_1 = new StringBuilder().append("un.G(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return stackIn_26_0;
    }

    public static void b() {
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Names cannot contain consecutive spaces";
        field_a = "Loading fonts";
        field_c = "Kick <%0> from this game";
    }
}
