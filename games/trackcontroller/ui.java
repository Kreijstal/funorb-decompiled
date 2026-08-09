/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends di {
    private lb field_q;
    static String field_n;
    static aa field_m;
    static int[] field_r;
    private lb field_o;
    static be field_p;

    final ud a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        ud stackIn_2_0 = null;
        ud stackIn_5_0 = null;
        ud stackIn_10_0 = null;
        ud stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_q.field_s.toLowerCase();
            var4 = param1.toLowerCase();
            if (0 != var4.length()) {
              if (ri.a((byte) 56, var4, var3)) {
                L1: {
                  if (param0 <= -106) {
                    break L1;
                  } else {
                    var5 = (String) null;
                    this.a(-122, (String) null);
                    break L1;
                  }
                }
                if (!this.b(param1, 84)) {
                  stackIn_12_0 = TrackController.field_G;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = ef.field_b;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = ef.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = ef.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("ui.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final static void g(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 == 95) {
          L0: {
            if (cj.field_o == null) {
              break L0;
            } else {
              var1 = cj.field_o;
              synchronized (var1) {
                L1: {
                  cj.field_o = null;
                  break L1;
                }
              }
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void h(int param0) {
        if (param0 != 256) {
            ui.a(-68, 'ﾥ');
        }
        field_n = null;
        field_p = null;
        field_m = null;
        field_r = null;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (!vl.a(param1, param0 ^ -3296)) {
                if (param0 == -19050) {
                  var6 = ob.field_q;
                  var2 = var6;
                  var3 = 0;
                  L1: while (true) {
                    if (var3 >= var6.length) {
                      var2 = hj.field_f;
                      var3 = 0;
                      L2: while (true) {
                        if (var3 >= var2.length) {
                          stackIn_24_0 = 0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          var4 = var2[var3];
                          if (param1 != var4) {
                            var3++;
                            continue L2;
                          } else {
                            stackIn_21_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                    } else {
                      var4 = var6[var3];
                      if (var4 != param1) {
                        var3++;
                        continue L1;
                      } else {
                        return true;
                      }
                    }
                  }
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var2_ref), "ui.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                return stackIn_24_0 != 0;
              }
            }
          }
        }
    }

    private final boolean b(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 24) {
                break L1;
              } else {
                field_n = (String) null;
                break L1;
              }
            }
            L2: {
              var8 = this.field_o.field_s.toLowerCase();
              var4 = param0.toLowerCase();
              if (var8.length() <= 0) {
                break L2;
              } else {
                if (-1 > (var4.length() ^ -1)) {
                  var5 = var8.lastIndexOf("@");
                  if (-1 < (var5 ^ -1)) {
                    break L2;
                  } else {
                    if (var5 < -1 + var8.length()) {
                      var6 = var8.substring(0, var5);
                      var7 = var8.substring(var5 + 1);
                      if (-1 < (var4.indexOf(var6) ^ -1)) {
                        if (-1 < (var4.indexOf(var7) ^ -1)) {
                          break L2;
                        } else {
                          stackIn_13_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        stackIn_10_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackIn_15_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("ui.E(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param1 = v.a('_', (byte) -31, "", param1);
              if (param2 > 77) {
                break L1;
              } else {
                field_m = (aa) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = rb.a(22479, param1);
                if ((param0.indexOf(param1) ^ -1) != 0) {
                  break L3;
                } else {
                  if (-1 == param0.indexOf(var3)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("ui.G(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 426) {
                break L1;
              } else {
                field_m = (aa) null;
                break L1;
              }
            }
            var6 = this.field_q.field_s.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              if (ac.a(var5, -23797)) {
                stackIn_8_0 = nl.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!sd.a(var5, (byte) 115)) {
                  if (!ba.a(var5, false)) {
                    if (!this.b(param0, 35)) {
                      if (var6.length() <= 0) {
                        stackIn_31_0 = pf.field_N;
                        decompiledRegionSelector0 = 8;
                        break L0;
                      } else {
                        if (!cb.a(var6, var5, (byte) -11)) {
                          if (rh.a(param1 ^ 19012, var6, var5)) {
                            stackIn_25_0 = fe.field_J;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            if (ui.a(var5, var6, (byte) 103)) {
                              stackIn_29_0 = qd.field_c;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            } else {
                              return nl.field_c;
                            }
                          }
                        } else {
                          stackIn_21_0 = qd.field_c;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_17_0 = h.field_a;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_14_0 = mj.field_a;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_11_0 = kh.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3);

            stackIn_34_1 = new StringBuilder().append("ui.B(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L2;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
                      } else {
                        return stackIn_31_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    ui(lb param0, lb param1, lb param2) {
        super(param0);
        try {
            this.field_q = param1;
            this.field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ui.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, boolean param1) {
        if (!(-1 != param0)) {
            return true;
        }
        if (!param1) {
            ui.h(85);
        }
        return (pf.field_U & 1 << param0) != 0 ? true : false;
    }

    static {
        field_n = "Congratulations! You've completed the full game!";
        field_m = new aa(12, 0, 1, 0);
        field_r = new int[8192];
        field_p = new be(256);
    }
}
