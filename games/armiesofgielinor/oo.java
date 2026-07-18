/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo {
    private String field_c;
    private wk field_b;
    private int field_p;
    private ru[] field_i;
    private dl field_h;
    private String[] field_k;
    static byte[][] field_d;
    private int field_n;
    private int field_l;
    private wk field_t;
    private int field_r;
    private wk field_m;
    static int field_a;
    private boolean field_s;
    private int field_f;
    static String field_e;
    static gu field_g;
    private int field_q;
    static String field_o;
    static String field_j;

    public static void b(int param0) {
        try {
            field_g = null;
            field_o = null;
            field_d = null;
            field_e = null;
            field_j = null;
            if (param0 != -8616) {
                oo.b(85);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "oo.E(" + param0 + ')');
        }
    }

    private final void a(String param0, byte param1, ru[] param2, java.applet.Applet param3, boolean param4, String[] param5) {
        String var7 = null;
        RuntimeException var7_ref = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var7 = param3.getParameter("currency");
                if (null == var7) {
                  break L2;
                } else {
                  if (!vv.a(-84, (CharSequence) (Object) var7)) {
                    break L2;
                  } else {
                    ((oo) this).field_r = dq.a(param1 + 2, (CharSequence) (Object) var7);
                    if (!ArmiesOfGielinor.field_M) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              ((oo) this).field_r = 2;
              break L1;
            }
            ((oo) this).field_c = param0;
            ((oo) this).field_h = new dl(2);
            ((oo) this).field_k = param5;
            if (param1 == 71) {
              L3: {
                ((oo) this).field_i = param2;
                if (null == ((oo) this).field_i) {
                  break L3;
                } else {
                  if (3 > ((oo) this).field_i.length) {
                    break L3;
                  } else {
                    mk.field_h = param4;
                    break L0;
                  }
                }
              }
              throw new IllegalArgumentException("");
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var7_ref;
            stackOut_20_1 = new StringBuilder().append("oo.K(");
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L4;
            }
          }
          L5: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L5;
            }
          }
          L6: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L6;
            }
          }
          L7: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param4).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param5 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L7;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
    }

    final int a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_114_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_133_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_113_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_132_0 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ((oo) this).field_l = ((oo) this).field_l + 65536;
            L1: while (true) {
              L2: {
                L3: {
                  if (ev.b(-101, qk.field_d, ((oo) this).field_l) < 65536) {
                    break L3;
                  } else {
                    ((oo) this).field_l = ((oo) this).field_l - qk.field_d;
                    ((oo) this).field_f = ((oo) this).field_f + 1;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1 <= -95) {
                  break L2;
                } else {
                  this.a((wk) null, 114, -82, (String) null, (ka) null, (int[]) null, 110, 33, 0, 0.8778258562088013f);
                  break L2;
                }
              }
              L4: {
                var3_int = -1;
                if (((oo) this).field_i != null) {
                  var3_int = ((oo) this).field_i.length;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var3_int != -1) {
                  L6: {
                    if (qk.field_c > ((oo) this).field_p) {
                      L7: {
                        L8: {
                          ((oo) this).field_p = ((oo) this).field_p + 1;
                          if (((oo) this).field_p <= qk.field_a) {
                            break L8;
                          } else {
                            if (null == ((oo) this).field_i) {
                              break L7;
                            } else {
                              if (((oo) this).field_i[((oo) this).field_n] == null) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        if (qk.field_c > ((oo) this).field_p) {
                          break L6;
                        } else {
                          if (((oo) this).field_i[(((oo) this).field_n - -1) % var3_int] == null) {
                            ((oo) this).field_p = ((oo) this).field_p - 1;
                            if (var6 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      ((oo) this).field_p = ((oo) this).field_p - 1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L9: {
                    if (((oo) this).field_p < qk.field_c) {
                      break L9;
                    } else {
                      L10: {
                        ((oo) this).field_q = ((oo) this).field_n;
                        ((oo) this).field_p = ((oo) this).field_p - qk.field_c;
                        if (((oo) this).field_s) {
                          break L10;
                        } else {
                          ((oo) this).field_n = ((oo) this).field_n - 1;
                          if (0 > ((oo) this).field_n) {
                            ((oo) this).field_n = ((oo) this).field_n + var3_int;
                            if (var6 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      ((oo) this).field_n = ((oo) this).field_n + 1;
                      if (var3_int > ((oo) this).field_n) {
                        break L9;
                      } else {
                        ((oo) this).field_n = ((oo) this).field_n - var3_int;
                        break L9;
                      }
                    }
                  }
                  if (((oo) this).field_p <= qk.field_a) {
                    break L5;
                  } else {
                    ((oo) this).field_s = true;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L11: {
                if (null == mg.field_d) {
                  break L11;
                } else {
                  L12: {
                    var4 = 0;
                    if (tr.field_A == 0) {
                      break L12;
                    } else {
                      if (ur.field_z <= 257) {
                        break L12;
                      } else {
                        if (290 > ur.field_z) {
                          L13: {
                            if (9 >= iu.field_t) {
                              break L13;
                            } else {
                              if (82 > iu.field_t) {
                                var4 = 1;
                                ((oo) this).field_p = qk.field_c;
                                ((oo) this).field_s = false;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (558 >= iu.field_t) {
                            break L12;
                          } else {
                            if (631 <= iu.field_t) {
                              break L12;
                            } else {
                              var4 = 1;
                              ((oo) this).field_p = qk.field_c;
                              ((oo) this).field_s = true;
                              break L12;
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  if (var4 != 0) {
                    break L11;
                  } else {
                    if (((oo) this).field_p <= qk.field_a) {
                      break L11;
                    } else {
                      if (257 >= ur.field_z) {
                        break L11;
                      } else {
                        if (290 <= ur.field_z) {
                          break L11;
                        } else {
                          L14: {
                            if (sm.field_d <= 9) {
                              break L14;
                            } else {
                              if (sm.field_d < 82) {
                                ((oo) this).field_p = qk.field_a;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                          }
                          if (558 >= sm.field_d) {
                            break L11;
                          } else {
                            if (631 > sm.field_d) {
                              ((oo) this).field_p = qk.field_a;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L15: {
                if (!param0) {
                  break L15;
                } else {
                  L16: {
                    ((oo) this).field_h.a(0, this.a(iu.field_t, ur.field_z, -387), this.a(sm.field_d, ko.field_b, -387));
                    var4 = 0;
                    if (!((oo) this).field_h.d((byte) 96)) {
                      break L16;
                    } else {
                      L17: {
                        if (0 == ((oo) this).field_h.field_h) {
                          var4 = 1;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      if (((oo) this).field_h.field_h != 1) {
                        break L16;
                      } else {
                        stackOut_113_0 = 2;
                        stackIn_114_0 = stackOut_113_0;
                        return stackIn_114_0;
                      }
                    }
                  }
                  L18: {
                    L19: {
                      if (!mk.field_h) {
                        break L19;
                      } else {
                        L20: while (true) {
                          if (!jd.i((byte) -71)) {
                            break L19;
                          } else {
                            var5 = this.c(127);
                            stackOut_119_0 = 0;
                            stackIn_129_0 = stackOut_119_0;
                            stackIn_120_0 = stackOut_119_0;
                            if (var6 != 0) {
                              break L18;
                            } else {
                              if (stackIn_120_0 != var5) {
                                stackOut_125_0 = var5;
                                stackIn_126_0 = stackOut_125_0;
                                return stackIn_126_0;
                              } else {
                                if (var6 == 0) {
                                  continue L20;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_128_0 = var4;
                    stackIn_129_0 = stackOut_128_0;
                    break L18;
                  }
                  if (stackIn_129_0 == 0) {
                    break L15;
                  } else {
                    this.b((byte) -92);
                    stackOut_130_0 = 3;
                    stackIn_131_0 = stackOut_130_0;
                    return stackIn_131_0;
                  }
                }
              }
              stackOut_132_0 = 0;
              stackIn_133_0 = stackOut_132_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "oo.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_133_0;
    }

    private final void b(byte param0) {
        Exception var2 = null;
        RuntimeException var2_ref = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  rf.a(32767, ag.d((byte) 73));
                  if (param0 < -84) {
                    break L2;
                  } else {
                    ((oo) this).field_n = 29;
                    break L2;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2 = (Exception) (Object) decompiledCaughtException;
                var2.printStackTrace();
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2_ref, "oo.A(" + param0 + ')');
        }
    }

    private final int c(int param0) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 126) {
                break L1;
              } else {
                int discarded$2 = this.c(-121);
                break L1;
              }
            }
            L2: {
              ((oo) this).field_h.b((byte) -120);
              if (!((oo) this).field_h.d((byte) 73)) {
                break L2;
              } else {
                if (((oo) this).field_h.field_h != 0) {
                  if (((oo) this).field_h.field_h == 1) {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    break L2;
                  }
                } else {
                  this.b((byte) -95);
                  stackOut_7_0 = 3;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              }
            }
            if (rs.field_q != 13) {
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              stackOut_15_0 = 1;
              stackIn_16_0 = stackOut_15_0;
              return stackIn_16_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "oo.I(" + param0 + ')');
        }
        return stackIn_18_0;
    }

    private final void a(int[] param0, int param1, String param2, int param3, ka param4, byte param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            rq.a((byte) -56);
            var9_int = param7;
            L1: while (true) {
              L2: {
                L3: {
                  if (var9_int >= param6) {
                    break L3;
                  } else {
                    qn.f(param3, var9_int, param1, var9_int + 1);
                    var10 = var9_int * param0.length / param6;
                    var11 = param0[param0.length - var10 + -1];
                    int discarded$3 = param4.a(param2, param3, param7, param1, param6, var11, -1, 1, 1, 0);
                    var9_int++;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                rf.b(-18862);
                break L2;
              }
              L4: {
                if (param5 >= 62) {
                  break L4;
                } else {
                  field_e = null;
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("oo.J(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param3).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            qn.a(9, 9, 622, 47, 4540749, 65793);
            qn.f(9, 257, 622, 33, 2585);
            qn.a(9, 265, 622, 11, 2585, 1515566);
            var2_int = 0;
            var3 = 14;
            L1: while (true) {
              L2: {
                L3: {
                  if (4 <= var2_int) {
                    break L3;
                  } else {
                    qn.a(var3, 331, 117, 90, 460551, 3881787);
                    var2_int++;
                    var3 += 121;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2_int = 0;
                break L2;
              }
              L4: {
                if (param0 >= 106) {
                  break L4;
                } else {
                  this.a((byte) -43);
                  break L4;
                }
              }
              var3 = 299;
              L5: while (true) {
                L6: {
                  L7: {
                    if (var2_int >= 2) {
                      break L7;
                    } else {
                      qn.a(508, var3, 127, 42, 1130115, 3365268);
                      qn.f(508, 42 + var3, 127, 42, 12410);
                      var3 += 91;
                      var2_int++;
                      if (var4 != 0) {
                        break L6;
                      } else {
                        if (var4 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  this.d(1439);
                  break L6;
                }
                L8: {
                  if (null == iw.field_p) {
                    break L8;
                  } else {
                    if (!iw.field_p.a((byte) 82)) {
                      break L8;
                    } else {
                      if (!iw.field_p.a(28979, "members_expansion_screen")) {
                        break L8;
                      } else {
                        if (!iw.field_p.a(28979, "arialish12")) {
                          break L8;
                        } else {
                          if (!iw.field_p.a(28979, "pump32")) {
                            break L8;
                          } else {
                            if (bh.field_H == null) {
                              break L8;
                            } else {
                              if (!bh.field_H.a((byte) 82)) {
                                break L8;
                              } else {
                                if (!bh.field_H.a(28979, "arialish12")) {
                                  break L8;
                                } else {
                                  if (!bh.field_H.a(28979, "pump32")) {
                                    break L8;
                                  } else {
                                    mc.field_a = pv.a("members_expansion_screen", "frame", iw.field_p, 24914);
                                    mg.field_d = ic.a("arrow", (byte) 51, "members_expansion_screen", iw.field_p);
                                    ll.field_Sb = gs.a("arialish12", iw.field_p, bh.field_H, (byte) -53, "");
                                    kt.field_n = it.a("", iw.field_p, bh.field_H, (byte) -87, "pump32");
                                    hr.field_b = nh.a("benefit_orbs", "members_expansion_screen", iw.field_p, false);
                                    ar.field_D = nh.a("button_text", "members_expansion_screen", iw.field_p, false);
                                    nh.field_G = ac.a(iw.field_p, "button_highlights", (byte) -4, "members_expansion_screen");
                                    bh.field_H = null;
                                    iw.field_p = null;
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                this.a((byte) -124);
                if (mc.field_a != null) {
                  L9: {
                    ((oo) this).field_b.g(376, 339);
                    ((oo) this).field_t.g(9, 9);
                    mc.field_a.a(0, 0);
                    if (mg.field_d != null) {
                      mg.field_d.g(9, 257);
                      mg.field_d.d(558, 257);
                      if (ko.field_b <= 257) {
                        break L9;
                      } else {
                        if (ko.field_b >= 290) {
                          break L9;
                        } else {
                          var2_int = (40 * sr.c(((oo) this).field_f << -1173839804, 127) >> 263324176) + 40;
                          if (var2_int <= 0) {
                            break L9;
                          } else {
                            L10: {
                              L11: {
                                if (sm.field_d <= 9) {
                                  break L11;
                                } else {
                                  if (sm.field_d < 82) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (sm.field_d <= 558) {
                                break L9;
                              } else {
                                if (sm.field_d < 631) {
                                  mg.field_d.h();
                                  mg.field_d.f(557, 256, var2_int);
                                  mg.field_d.f(559, 256, var2_int);
                                  mg.field_d.f(557, 258, var2_int);
                                  mg.field_d.f(559, 258, var2_int);
                                  mg.field_d.h();
                                  if (var4 == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                            }
                            mg.field_d.f(8, 256, var2_int);
                            mg.field_d.f(10, 256, var2_int);
                            mg.field_d.f(8, 258, var2_int);
                            mg.field_d.f(10, 258, var2_int);
                            break L9;
                          }
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                  L12: {
                    L13: {
                      ((oo) this).field_m.g(16, 302);
                      int discarded$4 = ll.field_Sb.a(((oo) this).field_k[((oo) this).field_n], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                      hr.field_b.g(30, 330);
                      int discarded$5 = ll.field_Sb.a(db.field_e[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                      int discarded$6 = ll.field_Sb.a(db.field_e[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                      int discarded$7 = ll.field_Sb.a(db.field_e[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                      ar.field_D.g((127 - ar.field_D.field_A) / 2 + 508, 315);
                      if (0 != ((oo) this).field_h.field_h) {
                        break L13;
                      } else {
                        nh.field_G[0].g(508, 299);
                        if (var4 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (((oo) this).field_h.field_h == 1) {
                      nh.field_G[1].g(508, 387);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "oo.G(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException var2 = null;
        ru var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null != ((oo) this).field_i) {
              L1: {
                if (param0 == 1439) {
                  break L1;
                } else {
                  field_a = -111;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var2_ref = ((oo) this).field_i[((oo) this).field_n];
                  if (var2_ref != null) {
                    break L3;
                  } else {
                    if (ll.field_Sb == null) {
                      break L2;
                    } else {
                      int discarded$2 = ll.field_Sb.a(ef.field_a, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2_ref.a(9, 58);
                break L2;
              }
              L4: {
                if (((oo) this).field_p >= qk.field_a) {
                  break L4;
                } else {
                  var2_ref = ((oo) this).field_i[((oo) this).field_q];
                  if (null != var2_ref) {
                    L5: {
                      var3 = ((oo) this).field_p * (var2_ref.field_g - -60) / qk.field_a;
                      var4 = var3 - 30;
                      if (!((oo) this).field_s) {
                        break L5;
                      } else {
                        rb.a(58, param0 ^ -1708085583, 9, var4 * -256 / 30, 256 * (-var4 + var2_ref.field_g) / 30, var2_ref);
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    rb.a(58, -1708086482, 9, 256 * (var2_ref.field_g + -var4) / 30, var4 * -256 / 30, var2_ref);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              break L0;
            } else {
              L6: {
                if (null == ll.field_Sb) {
                  break L6;
                } else {
                  int discarded$3 = ll.field_Sb.a(ef.field_a, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                  break L6;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "oo.M(" + param0 + ')');
        }
    }

    private final void a(wk param0, int param1, int param2, String param3, ka param4, int[] param5, int param6, int param7, int param8, float param9) {
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        wk var13 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var11_int = (int)((float)param8 / param9);
              var12 = (int)((float)param7 / param9);
              var13 = new wk(var11_int, var12);
              vn.a(var13, 3);
              if (param6 < -108) {
                break L1;
              } else {
                oo.b(-32);
                break L1;
              }
            }
            param0.c((int)((float)(-param2) / param9), (int)((float)(-param1) / param9), (int)((float)param0.field_y / param9), (int)((float)param0.field_v / param9));
            this.a(param5, var11_int, param3, 0, param4, (byte) 79, var12, 0);
            rf.b(-18862);
            vn.a(param0, 3);
            var13.d(param2, param1, param8, param7);
            rf.b(-18862);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var11 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var11;
            stackOut_5_1 = new StringBuilder().append("oo.F(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param5 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        try {
          L0: {
            if (mc.field_a == null) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param0 < 508) {
                  break L1;
                } else {
                  if (635 <= param0) {
                    break L1;
                  } else {
                    if (param1 < 299) {
                      break L1;
                    } else {
                      if (param1 < 386) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L2: {
                if (param0 < 508) {
                  break L2;
                } else {
                  if (param0 >= 635) {
                    break L2;
                  } else {
                    if (param1 < 390) {
                      break L2;
                    } else {
                      if (475 <= param1) {
                        break L2;
                      } else {
                        stackOut_29_0 = 1;
                        stackIn_30_0 = stackOut_29_0;
                        return stackIn_30_0;
                      }
                    }
                  }
                }
              }
              if (param2 == -387) {
                stackOut_34_0 = -1;
                stackIn_35_0 = stackOut_34_0;
                break L0;
              } else {
                stackOut_32_0 = -86;
                stackIn_33_0 = stackOut_32_0;
                return stackIn_33_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "oo.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_35_0;
    }

    private final void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        wk var5 = null;
        String var6 = null;
        String var7 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((oo) this).field_t != null) {
                break L1;
              } else {
                if (null == kt.field_n) {
                  break L1;
                } else {
                  L2: {
                    ((oo) this).field_t = new wk(622, 47);
                    vn.a(((oo) this).field_t, 3);
                    qn.a(0, 0, 622, 47, 4540749, 65793);
                    var2_int = 16448250;
                    var3 = 10068666;
                    var4 = cj.a(var3, var2_int, -60);
                    this.a(var4, 622, ((oo) this).field_c, 0, (ka) (Object) kt.field_n, (byte) 66, 47, 0);
                    rf.b(-18862);
                    ((oo) this).field_m = new wk(475, 24);
                    this.a(((oo) this).field_m, -4, 0, hr.field_h, (ka) (Object) kt.field_n, var4, -124, 24, 475, 0.75f);
                    if (param0 < -103) {
                      break L2;
                    } else {
                      this.a((int[]) null, -60, (String) null, -5, (ka) null, (byte) 31, 126, -81);
                      break L2;
                    }
                  }
                  var4 = cj.a(526344, 526344, 126);
                  var5 = new wk(121, 122);
                  vn.a(var5, 3);
                  qn.a(0, 0, var5.field_y, var5.field_v / 2, 16180917, 16306250);
                  qn.a(0, var5.field_v / 2, var5.field_y, var5.field_v, 16306250, 15568919);
                  var6 = rv.field_a;
                  var7 = wp.field_B;
                  this.a(var5, -16, 0, var6, (ka) (Object) kt.field_n, var4, -112, var5.field_v, var5.field_y, 0.5f);
                  this.a(var5, 20, 0, var7, (ka) (Object) kt.field_n, var4, -123, var5.field_v, var5.field_y, 0.5f);
                  this.a(var5, 12 + -kt.field_n.field_H + var5.field_v / 2, 0, qb.field_c[((oo) this).field_r], (ka) (Object) kt.field_n, var4, -125, var5.field_v / 3, var5.field_y, 0.699999988079071f);
                  rf.b(-18862);
                  ((oo) this).field_b = new wk(121, 122);
                  vn.a(((oo) this).field_b, 3);
                  var5.a(((oo) this).field_b.field_y / 2, ((oo) this).field_b.field_v / 2, -2048, 4096);
                  rf.b(-18862);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "oo.H(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var7_int = -43 % ((param6 - 19) / 62);
                var8 = 0;
                if (sr.a(param3 + -1, param5, 2, (byte) -113) == 2) {
                  break L2;
                } else {
                  if (4 != sr.a(-1 + param3, param5, 2, (byte) -104)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var8++;
              break L1;
            }
            L3: {
              L4: {
                if (sr.a(param3, 1 + param5, 2, (byte) -113) == 2) {
                  break L4;
                } else {
                  if (sr.a(param3, 1 + param5, 2, (byte) -100) != 4) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var8 += 2;
              break L3;
            }
            L5: {
              if ((var8 & 1) > 0) {
                ac.field_k[2].b(-32 + param4, param1 + 10, param0, param2);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((var8 & 2) <= 0) {
                break L6;
              } else {
                ac.field_k[2].b(8 + param4, 10 + param1, param0, param2);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var7, "oo.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (rd.field_j != null) {
                  break L2;
                } else {
                  if (bc.field_a != null) {
                    oa.a(102, bc.field_a.field_d);
                    if (!ArmiesOfGielinor.field_M) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              oa.a(90, rd.field_j.field_d);
              break L1;
            }
            L3: {
              if (param0 == -387) {
                break L3;
              } else {
                field_o = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "oo.D(" + param0 + ')');
        }
    }

    oo(java.applet.Applet param0, String param1, ru[] param2, String[] param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        ((oo) this).field_l = 0;
        ((oo) this).field_s = true;
        ((oo) this).field_f = 0;
        try {
          L0: {
            this.a(param1, (byte) 71, param2, param0, true, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("oo.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new byte[250][];
        field_e = "Full screen";
        field_g = new gu();
        field_o = "This <%0> is currently wearing <%2>. Are you sure you wish to replace it with <%1>? The <%2> will be lost forever if you do this.";
        field_j = "Try again";
    }
}
