/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nv extends wi {
    static String field_G;
    private fu field_K;
    static int[] field_E;
    int field_H;
    static String[] field_I;
    static tf field_N;
    static ut[] field_L;
    static hd field_F;
    int field_J;
    private int field_M;

    final int a(byte param0) {
        if (param0 != 31) {
            nv.a(121, -34);
            return this.field_K.a(1);
        }
        return this.field_K.a(1);
    }

    final static cn a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        cn var3 = null;
        cn stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn stackOut_3_0 = null;
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
            var2_int = 34 / ((15 - param0) / 44);
            if (param1 != null) {
              var3 = new cn(param1, aq.field_f, fc.field_g, ku.field_c, lo.field_j, lt.field_a, pq.field_O);
              tk.h((byte) -92);
              stackOut_3_0 = (cn) (var3);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("nv.H(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, double param1, double param2, int param3, int param4) {
        int var8 = 0;
        var8 = Kickabout.field_G;
        if (cu.field_c == 0) {
          if (param4 > 0) {
            be.field_i = new tf();
            i.field_B = param2;
            cu.field_c = param4;
            if (param3 != go.field_b) {
              if (0 != param0) {
                m.field_a = param1;
                go.field_b = param0;
                return;
              } else {
                am.field_g = null;
                m.field_a = param1;
                go.field_b = param0;
                return;
              }
            } else {
              if (param0 > 0) {
                am.field_g = new tf();
                m.field_a = param1;
                go.field_b = param0;
                return;
              } else {
                if (0 != param0) {
                  m.field_a = param1;
                  go.field_b = param0;
                  return;
                } else {
                  am.field_g = null;
                  m.field_a = param1;
                  go.field_b = param0;
                  return;
                }
              }
            }
          } else {
            if (param4 != 0) {
              i.field_B = param2;
              cu.field_c = param4;
              if (param3 != go.field_b) {
                if (0 == param0) {
                  am.field_g = null;
                  m.field_a = param1;
                  go.field_b = param0;
                  return;
                } else {
                  m.field_a = param1;
                  go.field_b = param0;
                  return;
                }
              } else {
                if (param0 <= 0) {
                  if (0 != param0) {
                    m.field_a = param1;
                    go.field_b = param0;
                    return;
                  } else {
                    am.field_g = null;
                    m.field_a = param1;
                    go.field_b = param0;
                    return;
                  }
                } else {
                  am.field_g = new tf();
                  m.field_a = param1;
                  go.field_b = param0;
                  return;
                }
              }
            } else {
              be.field_i = null;
              i.field_B = param2;
              cu.field_c = param4;
              if (param3 == go.field_b) {
                if (param0 <= 0) {
                  if (0 == param0) {
                    am.field_g = null;
                    m.field_a = param1;
                    go.field_b = param0;
                    return;
                  } else {
                    m.field_a = param1;
                    go.field_b = param0;
                    return;
                  }
                } else {
                  am.field_g = new tf();
                  m.field_a = param1;
                  go.field_b = param0;
                  return;
                }
              } else {
                if (0 == param0) {
                  am.field_g = null;
                  m.field_a = param1;
                  go.field_b = param0;
                  return;
                } else {
                  m.field_a = param1;
                  go.field_b = param0;
                  return;
                }
              }
            }
          }
        } else {
          if (param4 != 0) {
            i.field_B = param2;
            cu.field_c = param4;
            if (param3 != go.field_b) {
              if (0 == param0) {
                am.field_g = null;
                m.field_a = param1;
                go.field_b = param0;
                return;
              } else {
                m.field_a = param1;
                go.field_b = param0;
                return;
              }
            } else {
              if (param0 <= 0) {
                if (0 == param0) {
                  am.field_g = null;
                  m.field_a = param1;
                  go.field_b = param0;
                  return;
                } else {
                  m.field_a = param1;
                  go.field_b = param0;
                  return;
                }
              } else {
                am.field_g = new tf();
                m.field_a = param1;
                go.field_b = param0;
                return;
              }
            }
          } else {
            be.field_i = null;
            i.field_B = param2;
            cu.field_c = param4;
            if (param3 != go.field_b) {
              if (0 == param0) {
                am.field_g = null;
                m.field_a = param1;
                go.field_b = param0;
                return;
              } else {
                m.field_a = param1;
                go.field_b = param0;
                return;
              }
            } else {
              if (param0 <= 0) {
                if (0 == param0) {
                  am.field_g = null;
                  m.field_a = param1;
                  go.field_b = param0;
                  return;
                } else {
                  m.field_a = param1;
                  go.field_b = param0;
                  return;
                }
              } else {
                am.field_g = new tf();
                m.field_a = param1;
                go.field_b = param0;
                return;
              }
            }
          }
        }
    }

    final int a(byte param0, int param1) {
        if (param0 == -120) {
          if (param1 >= 0) {
            if (param1 >= this.field_K.a(1)) {
              return -1;
            } else {
              return this.field_K.a(param1, (byte) -63);
            }
          } else {
            return -1;
          }
        } else {
          return 17;
        }
    }

    final int h(byte param0) {
        if (param0 != -88) {
            return -8;
        }
        return this.field_M;
    }

    final static void a(int param0, int param1, String param2, String param3, byte param4) {
        try {
            ei.field_b.field_y = param1;
            ei.field_b.field_V = param3;
            ei.field_b.field_q = ei.field_b.field_q + ij.field_s.field_q;
            if (param4 != 34) {
                nv.j(77);
            }
            ei.field_b.field_E = param2;
            ij.field_s.field_s = ij.field_s.field_s + ij.field_s.field_q;
            ij.field_s.field_q = param0;
            ei.field_b.field_q = ei.field_b.field_q - ij.field_s.field_q;
            ij.field_s.field_s = ij.field_s.field_s - ij.field_s.field_q;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "nv.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var14 = Kickabout.field_G;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = -this.field_H + -param5 + param2;
                var9 = -(2 * this.field_H) + this.field_n;
                if (var8_int <= var9) {
                  break L1;
                } else {
                  var8_int = var9;
                  break L1;
                }
              }
              L2: {
                if (-1 < (var8_int ^ -1)) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8_int = var8_int * this.field_M / var9;
                if (1 != param6) {
                  if (param6 != 2) {
                    break L3;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (this.field_K.a(1) <= var12) {
                        if (var11 < 0) {
                          break L3;
                        } else {
                          this.field_K.a(-1, var11);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = this.field_K.a(var12, (byte) -111) - var8_int;
                          var13 = var13 * var13;
                          if (var13 >= var10) {
                            break L5;
                          } else {
                            var10 = var13;
                            var11 = var12;
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  this.field_K.c(var8_int, 124);
                  break L3;
                }
              }
              stackOut_17_0 = 1;
              stackIn_18_0 = stackOut_17_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var8);
            stackOut_21_1 = new StringBuilder().append("nv.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0 != 0;
        } else {
          return stackIn_20_0 != 0;
        }
    }

    public static void j(int param0) {
        if (param0 != 696) {
          nv.a(-1, -86);
          field_I = null;
          field_F = null;
          field_G = null;
          field_L = null;
          field_N = null;
          field_E = null;
          return;
        } else {
          field_I = null;
          field_F = null;
          field_G = null;
          field_L = null;
          field_N = null;
          field_E = null;
          return;
        }
    }

    final static void a(int param0, int param1) {
        ml var2 = null;
        var2 = or.field_d;
        var2.b(param0, (byte) -104);
        var2.a(106, 1);
        var2.a(117, 1);
        if (param1 != 32361) {
          field_E = (int[]) null;
          return;
        } else {
          return;
        }
    }

    final static boolean i(int param0) {
        cn discarded$6 = null;
        byte[] var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            var2 = (byte[]) null;
            discarded$6 = nv.a(-42, (byte[]) null);
            if (eq.field_j == eq.field_a) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (eq.field_j == eq.field_a) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    private nv() throws Throwable {
        throw new Error();
    }

    static {
        field_E = new int[]{100, 696, 796};
        field_I = new String[]{"Lacing up boots", "Practising dives", "Buffing silverware", "Group hugging", "Dressing the mascot", "Practising keepy-uppy", "Buying a half-time pie", "Memorising chants", "Never walking alone", "Learning offside", "Getting a glamorous girlfriend", "Cursing the ref", "Painting fans' faces", "Pacing the touchline", "Brushing up on clichès", "Learning formations", "Goading opposition fans", "Kissing our badges", "Finetuning longshots", "Wiping up dribbles", "Doing shuttle runs", "Dribbling round cones", "Warming up", "Stretching hamstrings", "Downloading smell of victory", "Loading boyish enthusiasm", "Downloading smell of grass", "Loading sheepskin coats", "Downloading the spirit of '66", "Loading Mexican waves", "Loading half-time talking to", "Loading referee's glasses", "Loading corner flags", "Loading goal celebrations", "Downloading post-game interviews", "Loading buckets and sponges", "Loading streakers", "Loading penalty shootouts", "Loading sudden death", "Loading golden goal", "Loading banana shots"};
        field_G = "auto-switch automatically switches player when you pass the ball";
        field_N = new tf();
    }
}
