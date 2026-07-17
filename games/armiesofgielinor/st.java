/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class st extends oj {
    static java.awt.Color field_F;
    int field_D;
    private boolean field_G;
    static String field_B;
    static String field_y;
    static boolean field_C;
    static String field_A;
    static hc field_z;

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!((st) this).field_G) {
              L1: {
                ((st) this).field_G = true;
                if (param1 == -26661) {
                  break L1;
                } else {
                  field_B = null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              var3_int = ((st) this).field_D;
                              if (1 != var3_int) {
                                break L9;
                              } else {
                                if (var4 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (var3_int != 2) {
                                break L10;
                              } else {
                                if (var4 == 0) {
                                  break L7;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (var3_int != 3) {
                                break L11;
                              } else {
                                if (var4 == 0) {
                                  break L6;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (var3_int == 4) {
                              break L5;
                            } else {
                              if (6 == var3_int) {
                                break L4;
                              } else {
                                if (var3_int != 5) {
                                  break L2;
                                } else {
                                  if (var4 == 0) {
                                    break L3;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          if (~((st) this).field_w.field_t >= ~((st) this).field_w.field_Y) {
                            break L2;
                          } else {
                            if (((st) this).field_w.field_S) {
                              break L2;
                            } else {
                              ((st) this).field_w.field_Y = ((st) this).field_w.field_Y + 1;
                              if (param0.field_b) {
                                param0.field_ob[((st) this).field_w.field_O] = param0.field_ob[((st) this).field_w.field_O] + 1;
                                if (var4 == 0) {
                                  break L2;
                                } else {
                                  break L7;
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        ((st) this).field_w.a(1, true);
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                      ((st) this).field_w.a(1, true);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                    L12: {
                      ((st) this).field_w.field_t = ((st) this).field_w.field_t + 1;
                      ((st) this).field_w.field_Y = ((st) this).field_w.field_Y + 1;
                      if (((st) this).field_w.field_t <= 99) {
                        break L12;
                      } else {
                        ((st) this).field_w.field_t = 99;
                        break L12;
                      }
                    }
                    L13: {
                      if (~((st) this).field_w.field_Y < ~((st) this).field_w.field_t) {
                        ((st) this).field_w.field_Y = ((st) this).field_w.field_t;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    if (!param0.field_b) {
                      break L2;
                    } else {
                      param0.d(((st) this).field_w.field_O, -bw.field_m[((st) this).field_w.field_N][4] + ((st) this).field_w.field_Y, param1 ^ -26714, 8);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L14: {
                    ((st) this).field_w.field_Y = ((st) this).field_w.field_Y - 1;
                    ((st) this).field_w.field_t = ((st) this).field_w.field_t - 1;
                    if (((st) this).field_w.field_t < 1) {
                      ((st) this).field_w.field_t = 1;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (((st) this).field_w.field_Y < 0) {
                      ((st) this).field_w.field_Y = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  ((st) this).field_w.w(param1 + 48992);
                  if (!param0.field_b) {
                    break L2;
                  } else {
                    param0.d(((st) this).field_w.field_O, ((st) this).field_w.field_Y - bw.field_m[((st) this).field_w.field_N][4], 95, 8);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                ((st) this).field_w.field_A = ((st) this).field_w.field_A - 1;
                ((st) this).field_w.w(22331);
                break L2;
              }
              fl.a(param0, -112);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_83_0 = (RuntimeException) var3;
            stackOut_83_1 = new StringBuilder().append("st.G(");
            stackIn_86_0 = stackOut_83_0;
            stackIn_86_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param0 == null) {
              stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
              stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
              stackOut_86_2 = "null";
              stackIn_87_0 = stackOut_86_0;
              stackIn_87_1 = stackOut_86_1;
              stackIn_87_2 = stackOut_86_2;
              break L16;
            } else {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "{...}";
              stackIn_87_0 = stackOut_84_0;
              stackIn_87_1 = stackOut_84_1;
              stackIn_87_2 = stackOut_84_2;
              break L16;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_87_0, stackIn_87_2 + 44 + param1 + 41);
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
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
        try {
          L0: {
            L1: {
              if (param1 <= -84) {
                break L1;
              } else {
                field_F = null;
                break L1;
              }
            }
            var4_int = ((st) this).a((byte) -39, param2, param0, true) ? 1 : 0;
            ((st) this).a(param2.field_xb, -26661);
            stackOut_3_0 = var4_int;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("st.A(");
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final String a(byte param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((st) this).field_w == null) {
                  break L2;
                } else {
                  var3 = "EventTurnEffect: pos: (" + ((st) this).field_w.field_J + "," + ((st) this).field_w.field_w + "), type: " + ((st) this).field_D;
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = "EventTurnEffect: unit: null, type: " + ((st) this).field_D;
              break L1;
            }
            var4 = 109 / ((53 - param0) / 51);
            stackOut_3_0 = (String) var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3_ref, "st.C(" + param0 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_y = null;
            field_B = null;
            field_A = null;
            field_F = null;
            field_z = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "st.E(" + 1 + 41);
        }
    }

    final static void a(int param0, je param1, je param2, je param3, je param4) {
        RuntimeException var5 = null;
        String var5_ref = null;
        int var6 = 0;
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
        RuntimeException decompiledCaughtException = null;
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
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (jl.field_b != null) {
              return;
            } else {
              L1: {
                if (param0 == 8) {
                  break L1;
                } else {
                  st.a(-95, (je) null, (je) null, (je) null, (je) null);
                  break L1;
                }
              }
              L2: {
                L3: {
                  hf.field_c = false;
                  if (bb.field_a) {
                    break L3;
                  } else {
                    L4: {
                      if (!vi.field_d) {
                        break L4;
                      } else {
                        var5_ref = ml.field_Lb;
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var5_ref = ll.field_Tb;
                    if (var6 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var5_ref = dc.field_l;
                break L2;
              }
              fs.a(ni.field_d, (String) null, var5_ref, 112, 0);
              qj.field_z.field_W = (8355711 & uf.field_i.field_W >> 1) + -(ni.field_d >> 1 & 8355711) + ni.field_d;
              jl.field_b = qj.field_z;
              qj.field_z.field_T = (8355711 & uf.field_i.field_T >> 1) + (ni.field_d + -((ni.field_d & 16711422) >> 1));
              qj.field_z.field_wb = -((16711423 & ni.field_d) >> 1) + ni.field_d + ((uf.field_i.field_wb & 16711423) >> 1);
              ew.field_d = rb.field_b;
              eu.field_g = new je(0L, param2);
              sb.field_i = new je(0L, param4);
              f.field_C = new je(0L, (je) null);
              mb.field_F = new je(0L, param3);
              qj.field_z = new je(0L, param1);
              qj.field_z.field_Z = tc.field_e;
              mb.field_F.a(qj.field_z, 102);
              rb.field_b = new je(0L, ew.field_d);
              mb.field_F.a(rb.field_b, 66);
              qf.field_e = new je(0L, uf.field_i, nk.field_t);
              ed.field_e = new je(0L, uf.field_i);
              eu.field_g.a(sb.field_i, 103);
              eu.field_g.a(f.field_C, 79);
              f.field_C.a(mb.field_F, 64);
              f.field_C.a(qf.field_e, 80);
              f.field_C.a(ed.field_e, 123);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("st.D(").append(param0).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 41);
        }
    }

    st(jd param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((st) this).field_m = 19;
            ((st) this).field_D = param1;
            ((st) this).field_w = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("st.<init>(");
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
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
    }

    final static d a(String param0, kl param1, kl param2, String param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        d stackIn_4_0 = null;
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
        d stackOut_3_0 = null;
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
            var5_int = param2.a(param3, 125);
            var6 = param2.a((byte) 120, var5_int, param0);
            stackOut_3_0 = sp.a(param2, var6, 0, var5_int, param1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("st.B(");
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + -2088 + 41);
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Passwords must be between 5 and 20 letters and numbers";
        field_F = new java.awt.Color(10040319);
        field_y = "Empty";
        field_A = "Spells to affect the balance of power.";
    }
}
