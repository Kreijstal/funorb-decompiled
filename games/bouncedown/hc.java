/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static String[] field_e;
    private ug field_a;
    private int field_c;
    private ug[] field_f;
    static String[] field_d;
    private long field_b;

    final ug b(int param0) {
        ug var2 = null;
        ug var3 = null;
        int var4 = 0;
        var4 = Bounce.field_N;
        if (this.field_a != null) {
          if (param0 == 0) {
            var2 = this.field_f[(int)(this.field_b & (long)(-1 + this.field_c))];
            L0: while (true) {
              if (this.field_a != var2) {
                if (this.field_a.field_j == this.field_b) {
                  var3 = this.field_a;
                  this.field_a = this.field_a.field_l;
                  return var3;
                } else {
                  this.field_a = this.field_a.field_l;
                  continue L0;
                }
              } else {
                this.field_a = null;
                return null;
              }
            }
          } else {
            field_d = (String[]) null;
            var2 = this.field_f[(int)(this.field_b & (long)(-1 + this.field_c))];
            L1: while (true) {
              if (this.field_a != var2) {
                if (this.field_a.field_j == this.field_b) {
                  var3 = this.field_a;
                  this.field_a = this.field_a.field_l;
                  return var3;
                } else {
                  this.field_a = this.field_a.field_l;
                  continue L1;
                }
              } else {
                this.field_a = null;
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(long param0, ug param1, int param2) {
        ug var5 = null;
        try {
            if (param1.field_i != null) {
                param1.a(96);
            }
            var5 = this.field_f[(int)((long)(this.field_c - 1) & param0)];
            param1.field_l = var5;
            param1.field_i = var5.field_i;
            int var6 = -91 / ((param2 - -71) / 43);
            param1.field_i.field_l = param1;
            param1.field_j = param0;
            param1.field_l.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "hc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static tg a(int param0, int param1, byte param2) {
        tg var3 = null;
        int var4 = 0;
        int var5 = 0;
        tg var6 = null;
        var5 = Bounce.field_N;
        if (param2 >= -121) {
          return (tg) null;
        } else {
          var6 = new tg(param0, param0);
          var3 = var6;
          var4 = 0;
          L0: while (true) {
            if (var3.field_v.length <= var4) {
              return var3;
            } else {
              var6.field_v[var4] = param1;
              var4++;
              continue L0;
            }
          }
        }
    }

    final static ke a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7) {
        ke var8 = null;
        if (param5 > -125) {
          return (ke) null;
        } else {
          var8 = new ke(param0, param2, param3, param1, param7, param6);
          uk.field_d.a(1, var8);
          qh.a(var8, param4, -22762);
          return var8;
        }
    }

    final static lj a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        lj var5 = null;
        lj stackIn_4_0 = null;
        lj stackIn_8_0 = null;
        lj stackIn_13_0 = null;
        lj stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lj stackOut_7_0 = null;
        lj stackOut_14_0 = null;
        lj stackOut_12_0 = null;
        lj stackOut_3_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() == 0) {
                  break L1;
                } else {
                  var2_int = param0.indexOf('@');
                  if ((var2_int ^ -1) == 0) {
                    stackOut_7_0 = uc.field_E;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      var3 = param0.substring(0, var2_int);
                      if (param1 == 4011) {
                        break L2;
                      } else {
                        hc.a(true);
                        break L2;
                      }
                    }
                    var4 = param0.substring(1 + var2_int);
                    var5 = qd.a(var3, param1 + -3915);
                    if (var5 == null) {
                      stackOut_14_0 = qe.a(param1 ^ 3924, var4);
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackOut_12_0 = (lj) (var5);
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_3_0 = ga.field_f;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("hc.H(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    final static boolean b(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
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
              if (param1 == 0) {
                break L1;
              } else {
                field_e = (String[]) null;
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                if (param0.length() < lc.field_y) {
                  break L2;
                } else {
                  if (param0.length() > mb.field_e) {
                    break L2;
                  } else {
                    return false;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("hc.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final ug a(long param0, int param1) {
        ug var4 = null;
        ug var5 = null;
        int var6 = 0;
        var6 = Bounce.field_N;
        this.field_b = param0;
        if (param1 == 0) {
          var4 = this.field_f[(int)((long)(-1 + this.field_c) & param0)];
          this.field_a = var4.field_l;
          L0: while (true) {
            if (this.field_a != var4) {
              if ((this.field_a.field_j ^ -1L) == (param0 ^ -1L)) {
                var5 = this.field_a;
                this.field_a = this.field_a.field_l;
                return var5;
              } else {
                this.field_a = this.field_a.field_l;
                continue L0;
              }
            } else {
              this.field_a = null;
              return null;
            }
          }
        } else {
          field_e = (String[]) null;
          var4 = this.field_f[(int)((long)(-1 + this.field_c) & param0)];
          this.field_a = var4.field_l;
          L1: while (true) {
            if (this.field_a != var4) {
              if ((this.field_a.field_j ^ -1L) == (param0 ^ -1L)) {
                var5 = this.field_a;
                this.field_a = this.field_a.field_l;
                return var5;
              } else {
                this.field_a = this.field_a.field_l;
                continue L1;
              }
            } else {
              this.field_a = null;
              return null;
            }
          }
        }
    }

    final static void a(int param0) {
        ke discarded$0 = null;
        String var2 = (String) null;
        pk.a((String) null, "", -116);
        if (param0 != 0) {
            discarded$0 = hc.a(97, -3, -125, -88, -110, (byte) -93, 42, -6);
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        if (!param0) {
            field_d = (String[]) null;
        }
    }

    final static boolean a(int param0, boolean param1, int param2, byte param3) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        int var4 = 0;
        int var5 = 0;
        int stackIn_19_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        if (!param1) {
          if (ij.field_b[param0] < ij.field_b[param2]) {
            return true;
          } else {
            if (ij.field_b[param0] <= ij.field_b[param2]) {
              if (sj.field_j[param0] >= sj.field_j[param2]) {
                if (sj.field_j[param2] >= sj.field_j[param0]) {
                  var4 = th.field_c[param0] + (nh.field_S[param0] + gk.field_i[param0]);
                  if (param3 == 97) {
                    var5 = th.field_c[param2] + (nh.field_S[param2] - -gk.field_i[param2]);
                    if (var4 < var5) {
                      return true;
                    } else {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L0: {
                          if (param0 >= param2) {
                            stackOut_57_0 = 0;
                            stackIn_58_0 = stackOut_57_0;
                            break L0;
                          } else {
                            stackOut_56_0 = 1;
                            stackIn_58_0 = stackOut_56_0;
                            break L0;
                          }
                        }
                        return stackIn_58_0 != 0;
                      }
                    }
                  } else {
                    discarded$2 = hc.a(-127, true, -50, (byte) 41);
                    var5 = th.field_c[param2] + (nh.field_S[param2] - -gk.field_i[param2]);
                    if (var4 < var5) {
                      return true;
                    } else {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L1: {
                          if (param0 >= param2) {
                            stackOut_47_0 = 0;
                            stackIn_48_0 = stackOut_47_0;
                            break L1;
                          } else {
                            stackOut_46_0 = 1;
                            stackIn_48_0 = stackOut_46_0;
                            break L1;
                          }
                        }
                        return stackIn_48_0 != 0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          if (sj.field_j[param2] <= sj.field_j[param0]) {
            if (sj.field_j[param0] > sj.field_j[param2]) {
              return false;
            } else {
              if (ij.field_b[param2] <= ij.field_b[param0]) {
                if (ij.field_b[param2] >= ij.field_b[param0]) {
                  var4 = th.field_c[param0] + (nh.field_S[param0] + gk.field_i[param0]);
                  if (param3 != 97) {
                    discarded$3 = hc.a(-127, true, -50, (byte) 41);
                    var5 = th.field_c[param2] + (nh.field_S[param2] - -gk.field_i[param2]);
                    if (var4 < var5) {
                      return true;
                    } else {
                      if (var4 <= var5) {
                        if (param0 >= param2) {
                          return false;
                        } else {
                          return true;
                        }
                      } else {
                        return false;
                      }
                    }
                  } else {
                    var5 = th.field_c[param2] + (nh.field_S[param2] - -gk.field_i[param2]);
                    if (var4 < var5) {
                      return true;
                    } else {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L2: {
                          if (param0 >= param2) {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            break L2;
                          } else {
                            stackOut_17_0 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            break L2;
                          }
                        }
                        return stackIn_19_0 != 0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        }
    }

    hc(int param0) {
        int var2 = 0;
        ug dupTemp$0 = null;
        ug var3 = null;
        this.field_f = new ug[param0];
        this.field_c = param0;
        for (var2 = 0; param0 > var2; var2++) {
            dupTemp$0 = new ug();
            var3 = dupTemp$0;
            this.field_f[var2] = dupTemp$0;
            var3.field_l = var3;
            var3.field_i = var3;
        }
    }

    static {
        field_e = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_d = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
