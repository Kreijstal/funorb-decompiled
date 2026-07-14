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
            return ((nv) this).field_K.a(1);
        }
        return ((nv) this).field_K.a(1);
    }

    final static cn a(int param0, byte[] param1) {
        int var2 = 0;
        cn var3 = null;
        var2 = 34 / ((15 - param0) / 44);
        if (param1 == null) {
          return null;
        } else {
          var3 = new cn(param1, aq.field_f, fc.field_g, ku.field_c, lo.field_j, lt.field_a, pq.field_O);
          tk.h((byte) -92);
          return var3;
        }
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
            if (param1 >= ((nv) this).field_K.a(1)) {
              return -1;
            } else {
              return ((nv) this).field_K.a(param1, (byte) -63);
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
        return ((nv) this).field_M;
    }

    final static void a(int param0, int param1, String param2, String param3, byte param4) {
        ei.field_b.field_y = param1;
        ei.field_b.field_V = param3;
        ei.field_b.field_q = ei.field_b.field_q + ij.field_s.field_q;
        if (param4 != 34) {
          nv.j(77);
          ei.field_b.field_E = param2;
          ij.field_s.field_s = ij.field_s.field_s + ij.field_s.field_q;
          ij.field_s.field_q = param0;
          ei.field_b.field_q = ei.field_b.field_q - ij.field_s.field_q;
          ij.field_s.field_s = ij.field_s.field_s - ij.field_s.field_q;
          return;
        } else {
          ei.field_b.field_E = param2;
          ij.field_s.field_s = ij.field_s.field_s + ij.field_s.field_q;
          ij.field_s.field_q = param0;
          ei.field_b.field_q = ei.field_b.field_q - ij.field_s.field_q;
          ij.field_s.field_s = ij.field_s.field_s - ij.field_s.field_q;
          return;
        }
    }

    final boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Kickabout.field_G;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          L0: {
            var8 = -((nv) this).field_H + -param5 + param2;
            var9 = -(2 * ((nv) this).field_H) + ((nv) this).field_n;
            if (var8 <= var9) {
              break L0;
            } else {
              var8 = var9;
              break L0;
            }
          }
          L1: {
            if (-1 < (var8 ^ -1)) {
              var8 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          var8 = var8 * ((nv) this).field_M / var9;
          if (1 != param6) {
            if (param6 == 2) {
              var10 = 2147483647;
              var11 = -1;
              var12 = 0;
              L2: while (true) {
                if (((nv) this).field_K.a(1) <= var12) {
                  if (var11 < 0) {
                    return true;
                  } else {
                    ((nv) this).field_K.a(-1, var11);
                    return true;
                  }
                } else {
                  var13 = ((nv) this).field_K.a(var12, (byte) -111) - var8;
                  var13 = var13 * var13;
                  if (var13 >= var10) {
                    var12++;
                    var12++;
                    continue L2;
                  } else {
                    var10 = var13;
                    var11 = var12;
                    var12++;
                    continue L2;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            ((nv) this).field_K.c(var8, 124);
            return true;
          }
        } else {
          return false;
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
          field_E = null;
          return;
        } else {
          return;
        }
    }

    final static boolean i(int param0) {
        Object var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            var2 = null;
            cn discarded$6 = nv.a(-42, (byte[]) null);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new int[]{100, 696, 796};
        field_I = new String[]{"Lacing up boots", "Practising dives", "Buffing silverware", "Group hugging", "Dressing the mascot", "Practising keepy-uppy", "Buying a half-time pie", "Memorising chants", "Never walking alone", "Learning offside", "Getting a glamorous girlfriend", "Cursing the ref", "Painting fans' faces", "Pacing the touchline", "Brushing up on clichès", "Learning formations", "Goading opposition fans", "Kissing our badges", "Finetuning longshots", "Wiping up dribbles", "Doing shuttle runs", "Dribbling round cones", "Warming up", "Stretching hamstrings", "Downloading smell of victory", "Loading boyish enthusiasm", "Downloading smell of grass", "Loading sheepskin coats", "Downloading the spirit of '66", "Loading Mexican waves", "Loading half-time talking to", "Loading referee's glasses", "Loading corner flags", "Loading goal celebrations", "Downloading post-game interviews", "Loading buckets and sponges", "Loading streakers", "Loading penalty shootouts", "Loading sudden death", "Loading golden goal", "Loading banana shots"};
        field_G = "auto-switch automatically switches player when you pass the ball";
        field_N = new tf();
    }
}
