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
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!this.field_G) {
              L1: {
                this.field_G = true;
                if (param1 == -26661) {
                  break L1;
                } else {
                  field_B = (String) null;
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
                              var3_int = this.field_D;
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
                              if ((var3_int ^ -1) != -4) {
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
                          if ((this.field_w.field_t ^ -1) >= (this.field_w.field_Y ^ -1)) {
                            break L2;
                          } else {
                            if (this.field_w.field_S) {
                              break L2;
                            } else {
                              this.field_w.field_Y = this.field_w.field_Y + 1;
                              if (param0.field_b) {
                                param0.field_ob[this.field_w.field_O] = param0.field_ob[this.field_w.field_O] + 1;
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
                        this.field_w.a(1, true);
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                      this.field_w.a(1, true);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                    L12: {
                      this.field_w.field_t = this.field_w.field_t + 1;
                      this.field_w.field_Y = this.field_w.field_Y + 1;
                      if ((this.field_w.field_t ^ -1) >= -100) {
                        break L12;
                      } else {
                        this.field_w.field_t = 99;
                        break L12;
                      }
                    }
                    L13: {
                      if ((this.field_w.field_Y ^ -1) < (this.field_w.field_t ^ -1)) {
                        this.field_w.field_Y = this.field_w.field_t;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    if (!param0.field_b) {
                      break L2;
                    } else {
                      param0.d(this.field_w.field_O, -bw.field_m[this.field_w.field_N][4] + this.field_w.field_Y, param1 ^ -26714, 8);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L14: {
                    this.field_w.field_Y = this.field_w.field_Y - 1;
                    this.field_w.field_t = this.field_w.field_t - 1;
                    if ((this.field_w.field_t ^ -1) > -2) {
                      this.field_w.field_t = 1;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if ((this.field_w.field_Y ^ -1) > -1) {
                      this.field_w.field_Y = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  this.field_w.w(param1 + 48992);
                  if (!param0.field_b) {
                    break L2;
                  } else {
                    param0.d(this.field_w.field_O, this.field_w.field_Y - bw.field_m[this.field_w.field_N][4], 95, 8);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.field_w.field_A = this.field_w.field_A - 1;
                this.field_w.w(22331);
                break L2;
              }
              fl.a(param0, -112);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackIn_86_0 = (RuntimeException) (var3);

            stackIn_86_1 = new StringBuilder().append("st.G(");

            if (param0 == null) {
              stackIn_87_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackIn_87_2 = "null";
              break L16;
            } else {
              stackIn_87_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackIn_87_2 = "{...}";
              break L16;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_87_0), stackIn_87_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -84) {
                break L1;
              } else {
                field_F = (java.awt.Color) null;
                break L1;
              }
            }
            var4_int = this.a((byte) -39, param2, param0, true) ? 1 : 0;
            this.a(param2.field_xb, -26661);
            stackIn_4_0 = var4_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("st.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_13_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final String a(byte param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_w == null) {
                  break L2;
                } else {
                  var3 = "EventTurnEffect: pos: (" + this.field_w.field_J + "," + this.field_w.field_w + "), type: " + this.field_D;
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = "EventTurnEffect: unit: null, type: " + this.field_D;
              break L1;
            }
            var4 = 109 / ((53 - param0) / 51);
            stackIn_4_0 = (String) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3_ref), "st.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_y = null;
              field_B = null;
              field_A = null;
              if (param0) {
                break L1;
              } else {
                field_B = (String) null;
                break L1;
              }
            }
            field_F = null;
            field_z = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "st.E(" + param0 + ')');
        }
    }

    final static void a(int param0, je param1, je param2, je param3, je param4) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (jl.field_b != null) {
              decompiledRegionSelector0 = 0;
              break L0;
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
                        var5 = ml.field_Lb;
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var5 = ll.field_Tb;
                    if (var6 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var5 = dc.field_l;
                break L2;
              }
              fs.a(ni.field_d, (String) null, var5, 112, 0);
              qj.field_z.field_W = (8355711 & uf.field_i.field_W >> -490910655) + -(ni.field_d >> 1597400993 & 8355711) + ni.field_d;
              jl.field_b = qj.field_z;
              qj.field_z.field_T = (8355711 & uf.field_i.field_T >> 1555795745) + (ni.field_d + -((ni.field_d & 16711422) >> -656632639));
              qj.field_z.field_wb = -((16711423 & ni.field_d) >> -1427777407) + ni.field_d + ((uf.field_i.field_wb & 16711423) >> 1058863777);
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
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5_ref);

            stackIn_19_1 = new StringBuilder().append("st.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param4 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    st(jd param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_m = 19;
            this.field_D = param1;
            this.field_w = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("st.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final static d a(String param0, kl param1, kl param2, String param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        d stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == -2088) {
                break L1;
              } else {
                st.a(false);
                break L1;
              }
            }
            var5_int = param2.a(param3, param4 ^ -2139);
            var6 = param2.a((byte) 120, var5_int, param0);
            stackIn_4_0 = sp.a(param2, var6, 0, var5_int, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("st.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_21_2 + ',' + param4 + ')');
        }
        return stackIn_4_0;
    }

    static {
        field_B = "Passwords must be between 5 and 20 letters and numbers";
        field_F = new java.awt.Color(10040319);
        field_y = "Empty";
        field_A = "Spells to affect the balance of power.";
    }
}
