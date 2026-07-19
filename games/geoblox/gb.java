/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static em field_b;
    static int field_f;
    static int field_c;
    static int field_g;
    private tf field_a;
    private hf field_d;
    static int field_e;

    final static boolean b(int param0) {
        RuntimeException var1 = null;
        float var1_float = 0.0f;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_6_0 = 0;
        var4 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (n.field_j != param0) {
                break L1;
              } else {
                td.a(-348, fl.field_c[25]);
                break L1;
              }
            }
            n.field_j = n.field_j + 1;
            L2: while (true) {
              if (!hh.a(93)) {
                L3: {
                  if (0 != n.field_j % 40) {
                    break L3;
                  } else {
                    if (vc.field_h >= 11) {
                      break L3;
                    } else {
                      fh.field_c = n.field_j;
                      vc.field_h = vc.field_h + 1;
                      if (10 != vc.field_h) {
                        break L3;
                      } else {
                        td.a(-348, fl.field_c[26]);
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  var1_float = -((480.0f - (float)n.field_j) / 480.0f) + 1.0f;
                  if (11 <= vc.field_h) {
                    break L4;
                  } else {
                    si.field_j = ((int)(var1_float * ka.field_c) << -231506296) + (uf.field_h[0] + ((int)(var1_float * lk.field_b) << -265857872)) - -(int)(kk.field_x * var1_float);
                    break L4;
                  }
                }
                L5: {
                  var2 = tl.field_r[vc.field_h].field_s >> -757524927;
                  var3 = n.field_j << -597797246;
                  if (sg.field_d) {
                    break L5;
                  } else {
                    if (-var3 + 900 <= 320 + var2) {
                      td.a(-348, fl.field_c[7]);
                      sg.field_d = true;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (ab.field_d) {
                    break L6;
                  } else {
                    if (-var2 + (320 - qh.field_O[1].field_s) <= -1200 - -var3) {
                      td.a(-348, fl.field_c[8]);
                      ab.field_d = true;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (494 > n.field_j) {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    break L7;
                  } else {
                    stackOut_23_0 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    break L7;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-14 != (ki.field_d ^ -1)) {
                  continue L2;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "gb.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_25_0 != 0;
        }
    }

    final hf c(byte param0) {
        hf var2 = null;
        var2 = this.field_a.field_a.field_b;
        if (var2 != this.field_a.field_a) {
          if (param0 != 88) {
            field_g = -4;
            this.field_d = var2.field_b;
            return var2;
          } else {
            this.field_d = var2.field_b;
            return var2;
          }
        } else {
          this.field_d = null;
          return null;
        }
    }

    final hf d(int param0) {
        hf discarded$2 = null;
        hf var2 = null;
        var2 = this.field_a.field_a.field_c;
        if (this.field_a.field_a == var2) {
          this.field_d = null;
          return null;
        } else {
          if (param0 != 1) {
            discarded$2 = this.a((byte) 55);
            this.field_d = var2.field_c;
            return var2;
          } else {
            this.field_d = var2.field_c;
            return var2;
          }
        }
    }

    final hf c(int param0) {
        hf var2 = null;
        var2 = this.field_d;
        if (var2 != this.field_a.field_a) {
          this.field_d = var2.field_c;
          if (param0 != 26) {
            return (hf) null;
          } else {
            return var2;
          }
        } else {
          this.field_d = null;
          return null;
        }
    }

    final static int a(int param0) {
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_5_0 = 0;
        var2 = Geoblox.field_C;
        try {
          L0: {
            discarded$12 = kd.field_e.a(true, 127, ec.field_d, mj.field_b);
            kd.field_e.i(-65);
            L1: while (true) {
              if (!hh.a(77)) {
                if (fe.field_d == param0) {
                  if (va.field_d) {
                    stackOut_9_0 = 3;
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (si.field_g == tf.field_d) {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (ih.field_c.a(-106)) {
                        if (kd.field_b != tf.field_d) {
                          stackOut_21_0 = -1;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackOut_19_0 = 2;
                          stackIn_20_0 = stackOut_19_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                } else {
                  var1_int = fe.field_d;
                  pc.a(-1, false);
                  stackOut_5_0 = var1_int;
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                discarded$13 = kd.field_e.a((byte) 105, te.field_a, ki.field_d);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "gb.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  return stackIn_22_0;
                }
              }
            }
          }
        }
    }

    final hf a(hf param0, byte param1) {
        hf var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        hf stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hf stackOut_6_0 = null;
        Object stackOut_4_0 = null;
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
              if (param0 == null) {
                var3 = this.field_a.field_a.field_c;
                break L1;
              } else {
                var3 = param0;
                break L1;
              }
            }
            if (this.field_a.field_a != var3) {
              var4 = 59 / ((param1 - 85) / 38);
              this.field_d = var3.field_c;
              stackOut_6_0 = (hf) (var3);
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_d = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("gb.F(");
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hf) ((Object) stackIn_5_0);
        } else {
          return stackIn_7_0;
        }
    }

    public static void b(byte param0) {
        int var1 = -66 / ((33 - param0) / 32);
        field_b = null;
    }

    final static void a(String param0, byte param1) {
        int var2 = -10 / ((58 - param1) / 41);
        System.out.println("Error: " + og.a(param0, "\n", true, "%0a"));
    }

    gb(tf param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "gb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final hf a(byte param0) {
        hf var2 = this.field_d;
        if (param0 <= 105) {
            return (hf) null;
        }
        if (!(var2 != this.field_a.field_a)) {
            this.field_d = null;
            return null;
        }
        this.field_d = var2.field_b;
        return var2;
    }

    final hf a(byte param0, hf param1) {
        hf discarded$2 = null;
        hf var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        hf stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        hf stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = this.field_a.field_a.field_b;
                break L1;
              }
            }
            L2: {
              if (param0 == 56) {
                break L2;
              } else {
                discarded$2 = this.d(-60);
                break L2;
              }
            }
            if (this.field_a.field_a == var3) {
              this.field_d = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_d = var3.field_b;
              stackOut_9_0 = (hf) (var3);
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("gb.J(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hf) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    static {
        field_e = -1;
    }
}
