/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a extends tc {
    int field_p;
    static wk[] field_m;
    static String field_n;
    static String field_k;
    int field_l;
    static kl field_o;

    final static int a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_52_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_119_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_118_0 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 16777215;
              var5 = ic.field_f >> 1 << 24;
              if (vs.field_e[param2].h(-1)) {
                L2: {
                  var6 = vs.field_e[param2].field_a;
                  if (null != bv.field_w) {
                    var6 = bv.field_w.o(var6, -1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4_int = bo.field_g[1 + var6] | -2147483648;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (jf.field_C.field_T != null) {
                L4: {
                  if (param2 == ks.field_y * jf.field_C.field_T.field_w + jf.field_C.field_T.field_J) {
                    var4_int = 16777215 | var5;
                    break L4;
                  } else {
                    if (!jf.field_C.field_vb.field_w) {
                      var6 = jf.field_C.field_vb.c(27732);
                      if (!jf.field_C.field_T.field_s) {
                        if (bv.field_w.field_gb != jf.field_C.field_q) {
                          if (var6 <= jf.field_C.field_vb.field_q[param2]) {
                            if ((jf.field_C.field_vb.field_e[param2] & 2) == 0) {
                              break L4;
                            } else {
                              var4_int = var5 | 5570560;
                              break L4;
                            }
                          } else {
                            var4_int = 21760 | var5;
                            break L4;
                          }
                        } else {
                          if (jf.field_C.field_vb.field_q[param2] <= var6) {
                            var4_int = var5 | 43264;
                            break L4;
                          } else {
                            if (0 == (jf.field_C.field_vb.field_e[param2] & 2)) {
                              if (jf.field_C.field_vb.field_k[param2] < var6) {
                                var4_int = 11118848 | var5;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              var4_int = 16711680 | var5;
                              break L4;
                            }
                          }
                        }
                      } else {
                        if (-1 == jf.field_C.field_T.field_B) {
                          if (var6 < jf.field_C.field_vb.field_q[param2]) {
                            if ((2 & jf.field_C.field_vb.field_e[param2]) == 0) {
                              break L4;
                            } else {
                              var4_int = var5 | 5570560;
                              break L4;
                            }
                          } else {
                            var4_int = var5 | 21760;
                            break L4;
                          }
                        } else {
                          if (-1 != (1 & jf.field_C.field_vb.field_e[param2])) {
                            var4_int = var5 | 5570560;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    } else {
                      if (jf.field_C.field_T.field_B > 0) {
                        if (!jf.field_C.field_T.field_s) {
                          if ((jf.field_C.field_vb.field_e[param2] & 2) != 0) {
                            var4_int = var5 | 16711680;
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          if ((1 & jf.field_C.field_vb.field_e[param2]) == 0) {
                            break L4;
                          } else {
                            var4_int = var5 | 16711680;
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (jf.field_C.field_T.field_s) {
                    break L5;
                  } else {
                    if (jf.field_C.field_T.field_O != jf.field_C.field_q) {
                      break L5;
                    } else {
                      if (jf.field_C.field_T.h(-13494)) {
                        break L5;
                      } else {
                        L6: {
                          var6 = jf.field_C.field_T.B(3257);
                          var7 = jf.field_C.field_T.l((byte) -79);
                          var8 = jf.field_C.field_vb.field_n;
                          var9 = jf.field_C.field_vb.field_b;
                          if (jf.field_C.field_T.o(-28467)) {
                            var8 = jf.field_C.field_T.a(false);
                            var9 = jf.field_C.field_T.D(-115);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var10 = Math.abs(var8 - param3);
                        var11 = Math.abs(-param1 + var9);
                        if (var6 < var10 - -var11) {
                          break L5;
                        } else {
                          if (var7 > var10 + var11) {
                            break L5;
                          } else {
                            L7: {
                              if (var10 + var11 != 1) {
                                stackOut_51_0 = 0;
                                stackIn_52_0 = stackOut_51_0;
                                break L7;
                              } else {
                                stackOut_50_0 = 1;
                                stackIn_52_0 = stackOut_50_0;
                                break L7;
                              }
                            }
                            L8: {
                              var12 = stackIn_52_0;
                              if (var12 == 0) {
                                if (0 == (2 & bv.field_w.b(31, var9, var8, jf.field_C.field_T.field_O))) {
                                  if ((bv.field_w.b(31, param1, param3, jf.field_C.field_T.field_O) & 2) == 0) {
                                    if (bv.field_w.field_j.a(var9, param3, var8, jf.field_C.field_T.x(-97), var6, param1, (byte) 62)) {
                                      stackOut_60_0 = 1;
                                      stackIn_62_0 = stackOut_60_0;
                                      break L8;
                                    } else {
                                      stackOut_59_0 = 0;
                                      stackIn_62_0 = stackOut_59_0;
                                      break L8;
                                    }
                                  } else {
                                    stackOut_57_0 = 0;
                                    stackIn_62_0 = stackOut_57_0;
                                    break L8;
                                  }
                                } else {
                                  stackOut_55_0 = 0;
                                  stackIn_62_0 = stackOut_55_0;
                                  break L8;
                                }
                              } else {
                                stackOut_53_0 = 0;
                                stackIn_62_0 = stackOut_53_0;
                                break L8;
                              }
                            }
                            L9: {
                              var13 = stackIn_62_0;
                              if (var12 != 0) {
                                break L9;
                              } else {
                                if (var13 != 0) {
                                  break L9;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var4_int = var5 | 11145472;
                            break L5;
                          }
                        }
                      }
                    }
                  }
                }
                if (jf.field_C.field_lc) {
                  L10: {
                    var6 = -jf.field_C.field_T.field_J + -(ks.field_y * jf.field_C.field_T.field_w) + param2;
                    if (var6 == ks.field_y) {
                      break L10;
                    } else {
                      if (-ks.field_y == var6) {
                        break L10;
                      } else {
                        if (1 == var6) {
                          break L10;
                        } else {
                          if (var6 == -1) {
                            break L10;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  var4_int = var5 | 16777215;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L11: {
              if (param2 == jf.field_C.field_h) {
                var4_int = var4_int & 16777215 | var5 + var4_int & -16777216;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (jf.field_C.field_cc <= -1) {
                break L12;
              } else {
                if (jf.field_C.field_ic > -1) {
                  L13: {
                    if (jf.field_C.field_gc != 44) {
                      break L13;
                    } else {
                      if (!jf.field_C.field_rb) {
                        break L13;
                      } else {
                        if (-1 < jf.field_C.field_Cb) {
                          var6 = jf.field_C.field_Cb;
                          if (1 == var6) {
                            if (jf.field_C.field_cc != param3) {
                              break L12;
                            } else {
                              if (jf.field_C.field_eb < param1) {
                                break L12;
                              } else {
                                if (param1 < -jf.field_C.field_ic + jf.field_C.field_eb) {
                                  break L12;
                                } else {
                                  var4_int = 43264 | var5;
                                  break L12;
                                }
                              }
                            }
                          } else {
                            if (0 == var6) {
                              if (jf.field_C.field_eb != param1) {
                                break L12;
                              } else {
                                if (jf.field_C.field_cc > param3) {
                                  break L12;
                                } else {
                                  if (jf.field_C.field_ic + jf.field_C.field_cc >= param3) {
                                    var4_int = 43264 | var5;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            } else {
                              if (var6 == 2) {
                                if (param3 != jf.field_C.field_cc) {
                                  break L12;
                                } else {
                                  if (param1 < jf.field_C.field_eb) {
                                    break L12;
                                  } else {
                                    if (jf.field_C.field_eb + jf.field_C.field_ic < param1) {
                                      break L12;
                                    } else {
                                      var4_int = var5 | 43264;
                                      break L12;
                                    }
                                  }
                                }
                              } else {
                                if (var6 == 3) {
                                  if (param1 != jf.field_C.field_eb) {
                                    break L12;
                                  } else {
                                    if (param3 > jf.field_C.field_cc) {
                                      break L12;
                                    } else {
                                      if (param3 >= jf.field_C.field_cc + -jf.field_C.field_ic) {
                                        var4_int = 43264 | var5;
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  var6 = Math.abs(jf.field_C.field_cc - param3);
                  var7 = Math.abs(jf.field_C.field_eb + -param1);
                  if (var6 > jf.field_C.field_ic) {
                    break L12;
                  } else {
                    if (var7 <= jf.field_C.field_ic) {
                      if (jf.field_C.field_rb) {
                        var4_int = 43264 | var5;
                        break L12;
                      } else {
                        var4_int = var5 | 16711680;
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                } else {
                  break L12;
                }
              }
            }
            var6 = bv.field_w.a(param2, -1, true) & 28;
            var7 = 0;
            L14: while (true) {
              if (5 <= var7) {
                stackOut_118_0 = var4_int;
                stackIn_119_0 = stackOut_118_0;
                break L0;
              } else {
                L15: {
                  if ((var6 & 1 << var7) == 0) {
                    break L15;
                  } else {
                    break L15;
                  }
                }
                var7++;
                continue L14;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "a.A(" + 16711680 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_119_0;
    }

    public static void a(boolean param0) {
        field_m = null;
        field_o = null;
        field_k = null;
        field_n = null;
    }

    final static jd a(int param0, int param1, bv param2) {
        jd var3 = null;
        RuntimeException var3_ref = null;
        jd stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        jd stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 != 0) {
              var3 = new jd();
              no.a(param2, (uo) (Object) var3, param0, -24721);
              stackOut_3_0 = (jd) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("a.B(").append(param0).append(',').append(32).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, byte param1) {
        bv var2 = vl.field_n;
        var2.h(32161, param0);
        var2.b(1, 1);
        var2.b(1, 2);
    }

    a(int param0, int param1) {
        ((a) this).field_p = param0;
        ((a) this).field_l = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Retry";
        field_n = "You are not fighting for <%0>.";
    }
}
