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
        int stackIn_53_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_125_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_124_0 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 16777215;
              var5 = ic.field_f >> -1544033663 << 5371288;
              if (vs.field_e[param2].h(-1)) {
                L2: {
                  var6 = vs.field_e[param2].field_a;
                  if (null != bv.field_w) {
                    var6 = bv.field_w.o(var6, param0 ^ -16711681);
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
                  L5: {
                    if (param2 == ks.field_y * jf.field_C.field_T.field_w + jf.field_C.field_T.field_J) {
                      break L5;
                    } else {
                      L6: {
                        if (!jf.field_C.field_vb.field_w) {
                          break L6;
                        } else {
                          if (-1 > (jf.field_C.field_T.field_B ^ -1)) {
                            L7: {
                              if (!jf.field_C.field_T.field_s) {
                                break L7;
                              } else {
                                if ((1 & jf.field_C.field_vb.field_e[param2]) == 0) {
                                  break L4;
                                } else {
                                  var4_int = var5 | 16711680;
                                  if (var14 == 0) {
                                    break L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            if (-1 != (jf.field_C.field_vb.field_e[param2] & 2 ^ -1)) {
                              var4_int = var5 | 16711680;
                              if (var14 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            } else {
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                      L8: {
                        L9: {
                          var6 = jf.field_C.field_vb.c(27732);
                          if (!jf.field_C.field_T.field_s) {
                            break L9;
                          } else {
                            L10: {
                              if (-1 == (jf.field_C.field_T.field_B ^ -1)) {
                                break L10;
                              } else {
                                if (-1 != (1 & jf.field_C.field_vb.field_e[param2] ^ -1)) {
                                  var4_int = var5 | 5570560;
                                  if (var14 == 0) {
                                    break L8;
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L11: {
                              if (var6 < jf.field_C.field_vb.field_q[param2]) {
                                break L11;
                              } else {
                                var4_int = var5 | 21760;
                                if (var14 == 0) {
                                  break L8;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (-1 == (2 & jf.field_C.field_vb.field_e[param2] ^ -1)) {
                              break L8;
                            } else {
                              var4_int = var5 | 5570560;
                              if (var14 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        L12: {
                          if (bv.field_w.field_gb != jf.field_C.field_q) {
                            break L12;
                          } else {
                            L13: {
                              if (jf.field_C.field_vb.field_q[param2] <= var6) {
                                break L13;
                              } else {
                                L14: {
                                  if (0 == (jf.field_C.field_vb.field_e[param2] & 2)) {
                                    break L14;
                                  } else {
                                    var4_int = 16711680 | var5;
                                    if (var14 == 0) {
                                      break L8;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                if (jf.field_C.field_vb.field_k[param2] < var6) {
                                  var4_int = 11118848 | var5;
                                  if (var14 == 0) {
                                    break L8;
                                  } else {
                                    break L13;
                                  }
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var4_int = var5 | 43264;
                            if (var14 == 0) {
                              break L8;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L15: {
                          if (var6 <= jf.field_C.field_vb.field_q[param2]) {
                            break L15;
                          } else {
                            var4_int = 21760 | var5;
                            if (var14 == 0) {
                              break L8;
                            } else {
                              break L15;
                            }
                          }
                        }
                        if (-1 == (jf.field_C.field_vb.field_e[param2] & 2 ^ -1)) {
                          break L8;
                        } else {
                          var4_int = var5 | 5570560;
                          break L8;
                        }
                      }
                      if (var14 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var4_int = 16777215 | var5;
                  break L4;
                }
                L16: {
                  if (jf.field_C.field_T.field_s) {
                    break L16;
                  } else {
                    if (jf.field_C.field_T.field_O != jf.field_C.field_q) {
                      break L16;
                    } else {
                      if (jf.field_C.field_T.h(-13494)) {
                        break L16;
                      } else {
                        L17: {
                          var6 = jf.field_C.field_T.B(3257);
                          var7 = jf.field_C.field_T.l((byte) -79);
                          var8 = jf.field_C.field_vb.field_n;
                          var9 = jf.field_C.field_vb.field_b;
                          if (jf.field_C.field_T.o(-28467)) {
                            var8 = jf.field_C.field_T.a(false);
                            var9 = jf.field_C.field_T.D(param0 + -16711795);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        var10 = Math.abs(var8 - param3);
                        var11 = Math.abs(-param1 + var9);
                        if (var6 < var10 - -var11) {
                          break L16;
                        } else {
                          if (var7 > var10 + var11) {
                            break L16;
                          } else {
                            L18: {
                              if ((var10 + var11 ^ -1) != -2) {
                                stackOut_52_0 = 0;
                                stackIn_53_0 = stackOut_52_0;
                                break L18;
                              } else {
                                stackOut_51_0 = 1;
                                stackIn_53_0 = stackOut_51_0;
                                break L18;
                              }
                            }
                            L19: {
                              var12 = stackIn_53_0;
                              if (var12 == 0) {
                                if (0 == (2 & bv.field_w.b(31, var9, var8, jf.field_C.field_T.field_O))) {
                                  if (-1 == (bv.field_w.b(31, param1, param3, jf.field_C.field_T.field_O) & 2 ^ -1)) {
                                    if (bv.field_w.field_j.a(var9, param3, var8, jf.field_C.field_T.x(-97), var6, param1, (byte) 62)) {
                                      stackOut_61_0 = 1;
                                      stackIn_63_0 = stackOut_61_0;
                                      break L19;
                                    } else {
                                      stackOut_60_0 = 0;
                                      stackIn_63_0 = stackOut_60_0;
                                      break L19;
                                    }
                                  } else {
                                    stackOut_58_0 = 0;
                                    stackIn_63_0 = stackOut_58_0;
                                    break L19;
                                  }
                                } else {
                                  stackOut_56_0 = 0;
                                  stackIn_63_0 = stackOut_56_0;
                                  break L19;
                                }
                              } else {
                                stackOut_54_0 = 0;
                                stackIn_63_0 = stackOut_54_0;
                                break L19;
                              }
                            }
                            L20: {
                              var13 = stackIn_63_0;
                              if (var12 != 0) {
                                break L20;
                              } else {
                                if (var13 != 0) {
                                  break L20;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            var4_int = var5 | 11145472;
                            break L16;
                          }
                        }
                      }
                    }
                  }
                }
                if (jf.field_C.field_lc) {
                  L21: {
                    var6 = -jf.field_C.field_T.field_J + -(ks.field_y * jf.field_C.field_T.field_w) + param2;
                    if (var6 == ks.field_y) {
                      break L21;
                    } else {
                      if (-ks.field_y == var6) {
                        break L21;
                      } else {
                        if (1 == var6) {
                          break L21;
                        } else {
                          if ((var6 ^ -1) == 0) {
                            break L21;
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
            L22: {
              if (param2 == jf.field_C.field_h) {
                var4_int = var4_int & 16777215 | var5 + var4_int & -16777216;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (0 <= (jf.field_C.field_cc ^ -1)) {
                break L23;
              } else {
                if (jf.field_C.field_ic > -1) {
                  L24: {
                    L25: {
                      if (jf.field_C.field_gc != 44) {
                        break L25;
                      } else {
                        if (!jf.field_C.field_rb) {
                          break L25;
                        } else {
                          if (-1 < jf.field_C.field_Cb) {
                            break L24;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    L26: {
                      var6 = Math.abs(jf.field_C.field_cc - param3);
                      var7 = Math.abs(jf.field_C.field_eb + -param1);
                      if (var6 > jf.field_C.field_ic) {
                        break L26;
                      } else {
                        if (var7 <= jf.field_C.field_ic) {
                          L27: {
                            if (jf.field_C.field_rb) {
                              break L27;
                            } else {
                              var4_int = var5 | 16711680;
                              if (var14 == 0) {
                                break L26;
                              } else {
                                break L27;
                              }
                            }
                          }
                          var4_int = 43264 | var5;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                    }
                    if (var14 == 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                  L28: {
                    L29: {
                      L30: {
                        var6 = jf.field_C.field_Cb;
                        if (1 == var6) {
                          if (jf.field_C.field_cc != param3) {
                            break L23;
                          } else {
                            if (jf.field_C.field_eb < param1) {
                              break L23;
                            } else {
                              if (param1 < -jf.field_C.field_ic + jf.field_C.field_eb) {
                                break L23;
                              } else {
                                var4_int = 43264 | var5;
                                if (var14 == 0) {
                                  break L23;
                                } else {
                                  break L30;
                                }
                              }
                            }
                          }
                        } else {
                          if (0 == var6) {
                            break L30;
                          } else {
                            if (-3 == (var6 ^ -1)) {
                              break L29;
                            } else {
                              if ((var6 ^ -1) == -4) {
                                break L28;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                      }
                      if (jf.field_C.field_eb != param1) {
                        break L23;
                      } else {
                        if (jf.field_C.field_cc > param3) {
                          break L23;
                        } else {
                          if (jf.field_C.field_ic + jf.field_C.field_cc >= param3) {
                            var4_int = 43264 | var5;
                            if (var14 == 0) {
                              break L23;
                            } else {
                              break L29;
                            }
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    if (param3 != jf.field_C.field_cc) {
                      break L23;
                    } else {
                      if (param1 < jf.field_C.field_eb) {
                        break L23;
                      } else {
                        if (jf.field_C.field_eb + jf.field_C.field_ic < param1) {
                          break L23;
                        } else {
                          var4_int = var5 | 43264;
                          if (var14 == 0) {
                            break L23;
                          } else {
                            break L28;
                          }
                        }
                      }
                    }
                  }
                  if (param1 != jf.field_C.field_eb) {
                    break L23;
                  } else {
                    if (param3 > jf.field_C.field_cc) {
                      break L23;
                    } else {
                      if (param3 >= jf.field_C.field_cc + -jf.field_C.field_ic) {
                        var4_int = 43264 | var5;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  }
                } else {
                  break L23;
                }
              }
            }
            L31: {
              var6 = bv.field_w.a(param2, -1, true) & 28;
              if (param0 == 16711680) {
                break L31;
              } else {
                field_o = (kl) null;
                break L31;
              }
            }
            var7 = 0;
            L32: while (true) {
              L33: {
                L34: {
                  if (5 <= var7) {
                    break L34;
                  } else {
                    stackOut_119_0 = var6 & 1 << var7;
                    stackIn_125_0 = stackOut_119_0;
                    stackIn_120_0 = stackOut_119_0;
                    if (var14 != 0) {
                      break L33;
                    } else {
                      L35: {
                        if (stackIn_120_0 == 0) {
                          break L35;
                        } else {
                          if (0 == (-16777216 & hm.field_l[var7])) {
                            break L35;
                          } else {
                            var4_int = fm.a(var4_int, hm.field_l[var7], 789485328);
                            break L35;
                          }
                        }
                      }
                      var7++;
                      if (var14 == 0) {
                        continue L32;
                      } else {
                        break L34;
                      }
                    }
                  }
                }
                stackOut_124_0 = var4_int;
                stackIn_125_0 = stackOut_124_0;
                break L33;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "a.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_125_0;
    }

    public static void a(boolean param0) {
        int discarded$0 = 0;
        field_m = null;
        field_o = null;
        field_k = null;
        field_n = null;
        if (!param0) {
            discarded$0 = a.a(-107, -22, -114, 71);
        }
    }

    final static jd a(int param0, int param1, bv param2) {
        jd var3 = null;
        RuntimeException var3_ref = null;
        jd stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        jd stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 != 0) {
              L1: {
                var3 = new jd();
                if (param1 > 31) {
                  break L1;
                } else {
                  a.a(96, (byte) -94);
                  break L1;
                }
              }
              no.a(param2, var3, param0, -24721);
              stackOut_5_0 = (jd) (var3);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3_ref);
            stackOut_7_1 = new StringBuilder().append("a.B(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int param0, byte param1) {
        if (param1 != -32) {
            field_m = (wk[]) null;
        }
        bv var2 = vl.field_n;
        var2.h(32161, param0);
        var2.b(1, 1);
        var2.b(1, 2);
    }

    a(int param0, int param1) {
        this.field_p = param0;
        this.field_l = param1;
    }

    static {
        field_k = "Retry";
        field_n = "You are not fighting for <%0>.";
    }
}
