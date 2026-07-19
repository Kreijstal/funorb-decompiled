/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends jk {
    static pj field_J;
    static String field_E;
    static int field_G;
    static ai[] field_D;
    static int field_H;
    static String field_F;
    static boolean field_I;

    public static void a(boolean param0) {
        if (param0) {
            oa.a(false);
        }
        field_J = null;
        field_E = null;
        field_D = null;
        field_F = null;
    }

    private oa(int param0, int param1, int param2, int param3, ml param4, of param5, we param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_v = param6;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "oa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            Throwable var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_6_0 = 0;
            int stackIn_6_1 = 0;
            int stackIn_10_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_15_1 = 0;
            int stackIn_20_0 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_5_1 = 0;
            int stackOut_9_0 = 0;
            byte stackOut_14_0 = 0;
            int stackOut_14_1 = 0;
            int stackOut_19_0 = 0;
            int stackOut_18_0 = 0;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            var7 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var2 = "tuhstatbut";
                    var3 = (String) (mf.a(-26159, "getcookies", param1));
                    var4 = ma.a(126, ';', var3);
                    var5 = 0;
                    L2: while (true) {
                      L3: {
                        if ((var4.length ^ -1) >= (var5 ^ -1)) {
                          break L3;
                        } else {
                          var6 = var4[var5].indexOf('=');
                          stackOut_5_0 = -1;
                          stackOut_5_1 = var6 ^ -1;
                          stackIn_15_0 = stackOut_5_0;
                          stackIn_15_1 = stackOut_5_1;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          if (var7 != 0) {
                            decompiledRegionSelector0 = 0;
                            break L1;
                          } else {
                            L4: {
                              if (stackIn_6_0 < stackIn_6_1) {
                                break L4;
                              } else {
                                if (var4[var5].substring(0, var6).trim().equals(var2)) {
                                  stackOut_9_0 = 1;
                                  stackIn_10_0 = stackOut_9_0;
                                  decompiledRegionSelector0 = 1;
                                  break L1;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var5++;
                            if (var7 == 0) {
                              continue L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 2;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var2_ref2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 2;
                    break L5;
                  }
                }
                L6: {
                  if (decompiledRegionSelector0 == 0) {
                    break L6;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      decompiledRegionSelector1 = 1;
                      break L0;
                    } else {
                      stackOut_14_0 = param0;
                      stackOut_14_1 = -120;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L6;
                    }
                  }
                }
                L7: {
                  if (stackIn_15_0 < stackIn_15_1) {
                    break L7;
                  } else {
                    field_D = (ai[]) null;
                    break L7;
                  }
                }
                L8: {
                  if (null == param1.getParameter("tuhstatbut")) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L8;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L8;
                  }
                }
                decompiledRegionSelector1 = 0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_21_0 = (RuntimeException) (var2_ref);
                stackOut_21_1 = new StringBuilder().append("oa.B(").append(param0).append(',');
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (param1 == null) {
                  stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackOut_23_2 = "null";
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  break L9;
                } else {
                  stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackOut_22_2 = "{...}";
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_24_2 = stackOut_22_2;
                  break L9;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_20_0 != 0;
            } else {
              return stackIn_10_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        ee var7 = null;
        RuntimeException var7_ref = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, param1, param2, param3, param4 ^ param4, param5);
                var7 = od.field_n;
                if (var7 == null) {
                  break L2;
                } else {
                  if (!this.a(param1, param0, param5, param3, (byte) 45)) {
                    break L2;
                  } else {
                    L3: {
                      if (this.field_o instanceof tc) {
                        break L3;
                      } else {
                        if (!(var7.field_o instanceof tc)) {
                          break L2;
                        } else {
                          ((tc) ((Object) var7.field_o)).a((oa) (this), (byte) -27, var7);
                          od.field_n = null;
                          if (!MonkeyPuzzle2.field_F) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    ((tc) ((Object) this.field_o)).a((oa) (this), (byte) -27, var7);
                    od.field_n = null;
                    break L1;
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var7_ref);
            stackOut_8_1 = new StringBuilder().append("oa.I(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(float param0, float[] param1, int param2) {
        try {
            param1[1] = param1[1] * param0;
            if (param2 <= 104) {
                field_F = (String) null;
            }
            param1[0] = param1[0] * param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "oa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void j(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        ki var2 = null;
        int var2_int = 0;
        il var3_ref_il = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_44_0 = 0;
        il stackIn_47_0 = null;
        Object stackIn_55_0 = null;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_88_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_43_0 = 0;
        il stackOut_46_0 = null;
        ug stackOut_54_0 = null;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_87_0 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = (ki) ((Object) ok.field_a.a((byte) -117));
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var2 == null) {
                      break L4;
                    } else {
                      stackOut_3_0 = qb.field_b;
                      stackIn_44_0 = stackOut_3_0 ? 1 : 0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_4_0) {
                            L6: {
                              if (2 != var2.field_w) {
                                break L6;
                              } else {
                                h.a(3, true);
                                if (var6 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              if (-4 == (var2.field_w ^ -1)) {
                                break L7;
                              } else {
                                L8: {
                                  if (var2.field_w != 5) {
                                    break L8;
                                  } else {
                                    h.a(2, true);
                                    if (var6 == 0) {
                                      break L5;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                if (6 != var2.field_w) {
                                  break L5;
                                } else {
                                  h.a(1, true);
                                  if (var6 == 0) {
                                    break L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            h.a(4, true);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L9: {
                          L10: {
                            if (var2.field_w != 6) {
                              break L10;
                            } else {
                              if (var2.field_j) {
                                break L10;
                              } else {
                                if (var2.field_x) {
                                  break L10;
                                } else {
                                  stackOut_20_0 = 1;
                                  stackIn_22_0 = stackOut_20_0;
                                  break L9;
                                }
                              }
                            }
                          }
                          stackOut_21_0 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          break L9;
                        }
                        L11: {
                          L12: {
                            var3 = stackIn_22_0;
                            var2.g(122);
                            if (var3 == 0) {
                              break L12;
                            } else {
                              if (var2.field_j) {
                                break L12;
                              } else {
                                if (-1 <= (var2.field_m ^ -1)) {
                                  break L12;
                                } else {
                                  var4 = 0;
                                  var5 = 0;
                                  L13: while (true) {
                                    L14: {
                                      if ((var2.field_m ^ -1) >= (var5 ^ -1)) {
                                        break L14;
                                      } else {
                                        stackOut_27_0 = -5;
                                        stackOut_27_1 = var2.field_o[var5].field_w ^ -1;
                                        stackIn_56_0 = stackOut_27_0;
                                        stackIn_56_1 = stackOut_27_1;
                                        stackIn_28_0 = stackOut_27_0;
                                        stackIn_28_1 = stackOut_27_1;
                                        if (var6 != 0) {
                                          break L2;
                                        } else {
                                          L15: {
                                            if (stackIn_28_0 == stackIn_28_1) {
                                              break L15;
                                            } else {
                                              var4 = 1;
                                              if (var6 == 0) {
                                                break L14;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          var5++;
                                          if (var6 == 0) {
                                            continue L13;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                    }
                                    L16: {
                                      L17: {
                                        if (var4 != 0) {
                                          break L17;
                                        } else {
                                          var2.field_t = hd.field_u;
                                          if (var6 == 0) {
                                            break L16;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      var2.field_q = var2.field_q + 2.0f;
                                      break L16;
                                    }
                                    if (var6 == 0) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (!var2.field_x) {
                            break L11;
                          } else {
                            if (var2.field_w != 6) {
                              break L11;
                            } else {
                              if (var2.field_m == 0) {
                                var2.field_t = hd.field_u;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        var2 = (ki) ((Object) ok.field_a.d((byte) 63));
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_43_0 = 0;
                  stackIn_44_0 = stackOut_43_0;
                  break L3;
                }
                var2_int = stackIn_44_0;
                L18: while (true) {
                  L19: {
                    L20: {
                      if (-4 >= (var2_int ^ -1)) {
                        break L20;
                      } else {
                        stackOut_46_0 = (il) ((Object) rf.field_a.a((byte) -117));
                        stackIn_55_0 = stackOut_46_0;
                        stackIn_47_0 = stackOut_46_0;
                        if (var6 != 0) {
                          break L19;
                        } else {
                          var3_ref_il = stackIn_47_0;
                          L21: while (true) {
                            L22: {
                              L23: {
                                if (var3_ref_il == null) {
                                  break L23;
                                } else {
                                  var3_ref_il.e(5);
                                  var3_ref_il = (il) ((Object) rf.field_a.d((byte) 63));
                                  if (var6 != 0) {
                                    break L22;
                                  } else {
                                    if (var6 == 0) {
                                      continue L21;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                              }
                              var2_int++;
                              break L22;
                            }
                            if (var6 == 0) {
                              continue L18;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                    }
                    stackOut_54_0 = ok.field_a.a((byte) -117);
                    stackIn_55_0 = stackOut_54_0;
                    break L19;
                  }
                  var2 = (ki) ((Object) stackIn_55_0);
                  stackOut_55_0 = param0;
                  stackOut_55_1 = -79;
                  stackIn_56_0 = stackOut_55_0;
                  stackIn_56_1 = stackOut_55_1;
                  break L2;
                }
              }
              L24: {
                if (stackIn_56_0 <= stackIn_56_1) {
                  break L24;
                } else {
                  oa.a(true);
                  break L24;
                }
              }
              L25: while (true) {
                L26: {
                  L27: {
                    if (var2 == null) {
                      break L27;
                    } else {
                      var2.d((byte) 116);
                      var2 = (ki) ((Object) ok.field_a.d((byte) 63));
                      if (var6 != 0) {
                        break L26;
                      } else {
                        if (var6 == 0) {
                          continue L25;
                        } else {
                          break L27;
                        }
                      }
                    }
                  }
                  var2 = (ki) ((Object) ok.field_a.a((byte) -117));
                  break L26;
                }
                L28: while (true) {
                  L29: {
                    L30: {
                      if (var2 == null) {
                        break L30;
                      } else {
                        var2.f(-7);
                        stackOut_65_0 = (var2.field_q - (float)var2.field_y < (float)(hf.field_f.field_k + -90) ? -1 : (var2.field_q - (float)var2.field_y == (float)(hf.field_f.field_k + -90) ? 0 : 1));
                        stackIn_88_0 = stackOut_65_0;
                        stackIn_66_0 = stackOut_65_0;
                        if (var6 != 0) {
                          break L29;
                        } else {
                          L31: {
                            if (stackIn_66_0 > 0) {
                              L32: {
                                if (vl.field_j) {
                                  hf.field_f.d(-115);
                                  vl.field_j = false;
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                              var1_int = 1;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          L33: {
                            L34: {
                              L35: {
                                if ((var2.field_w ^ -1) == -2) {
                                  break L35;
                                } else {
                                  if (6 == var2.field_w) {
                                    break L35;
                                  } else {
                                    if (var2.field_w == 5) {
                                      break L35;
                                    } else {
                                      if ((var2.field_w ^ -1) != -1) {
                                        break L34;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                }
                              }
                              if (!pa.a(var2.field_I, (int)(var2.field_B + (float)var2.field_G), (int)var2.field_q + var2.field_y, sb.field_m, 80, 0)) {
                                break L34;
                              } else {
                                L36: {
                                  if (!jj.a(-32680, var2, -80 + (var2.field_G + (int)var2.field_B), var2.field_y + (int)var2.field_q)) {
                                    stackOut_80_0 = 0;
                                    stackIn_81_0 = stackOut_80_0;
                                    break L36;
                                  } else {
                                    stackOut_79_0 = 1;
                                    stackIn_81_0 = stackOut_79_0;
                                    break L36;
                                  }
                                }
                                var3 = stackIn_81_0;
                                var2.field_x = var2.field_x | var3 != 0;
                                if (var6 == 0) {
                                  break L33;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            if (var2.field_w != 3) {
                              break L33;
                            } else {
                              if (-2 != (var2.field_n ^ -1)) {
                                break L33;
                              } else {
                                if ((var2.field_C ^ -1) >= -5) {
                                  break L33;
                                } else {
                                  var2.field_t = ri.field_b;
                                  break L33;
                                }
                              }
                            }
                          }
                          var2.c((byte) -114);
                          var2 = (ki) ((Object) ok.field_a.d((byte) 63));
                          if (var6 == 0) {
                            continue L28;
                          } else {
                            break L30;
                          }
                        }
                      }
                    }
                    stackOut_87_0 = var1_int;
                    stackIn_88_0 = stackOut_87_0;
                    break L29;
                  }
                  vl.field_j = stackIn_88_0 != 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "oa.D(" + param0 + ')');
        }
    }

    static {
        field_J = new pj();
        field_G = -1;
        field_E = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_F = "Please try again in a few minutes.";
    }
}
