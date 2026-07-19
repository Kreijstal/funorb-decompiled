/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    private ms[] field_i;
    static int field_c;
    private int field_b;
    private int field_a;
    static iw field_f;
    private ms field_e;
    private ms field_d;
    static jn field_g;
    static String field_h;

    final ms a(boolean param0) {
        int fieldTemp$0 = 0;
        ms var2 = null;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if ((this.field_b ^ -1) < -1) {
            if (this.field_i[this.field_b - 1] != this.field_d) {
                var2 = this.field_d;
                this.field_d = var2.field_b;
                return var2;
            }
        }
        if (!param0) {
            return (ms) null;
        }
        do {
            if (this.field_a <= this.field_b) {
                return null;
            }
            fieldTemp$0 = this.field_b;
            this.field_b = this.field_b + 1;
            var2 = this.field_i[fieldTemp$0].field_b;
            if (!(this.field_i[-1 + this.field_b] == var2)) {
                this.field_d = var2.field_b;
                return var2;
            }
        } while (var3 == 0);
        return null;
    }

    final ms a(int param0, long param1) {
        ms var5 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        if (param0 < 102) {
            return (ms) null;
        }
        ms var4 = this.field_i[(int)(param1 & (long)(-1 + this.field_a))];
        this.field_e = var4.field_b;
        while (this.field_e != var4) {
            if (var6 != 0) {
                return null;
            }
            if (!((param1 ^ -1L) != (this.field_e.field_h ^ -1L))) {
                var5 = this.field_e;
                this.field_e = this.field_e.field_b;
                return var5;
            }
            this.field_e = this.field_e.field_b;
        }
        this.field_e = null;
        return null;
    }

    final void c(int param0) {
        int var2 = 0;
        ms var3 = null;
        ms var4 = null;
        int var5 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_12_0 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == 6407) {
          var2 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (this.field_a <= var2) {
                  break L2;
                } else {
                  stackOut_4_0 = this;
                  stackIn_13_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    var3 = ((te) (this)).field_i[var2];
                    L3: while (true) {
                      L4: {
                        L5: {
                          var4 = var3.field_b;
                          if (var4 == var3) {
                            break L5;
                          } else {
                            var4.b(false);
                            if (var5 != 0) {
                              break L4;
                            } else {
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var2++;
                        break L4;
                      }
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              this.field_d = null;
              stackOut_12_0 = this;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            ((te) (this)).field_e = null;
            return;
          }
        } else {
          return;
        }
    }

    public static void b(int param0) {
        if (param0 != 6406) {
            te.b(41);
        }
        field_h = null;
        field_f = null;
        field_g = null;
    }

    final ms a(int param0) {
        this.field_b = 0;
        if (param0 < 36) {
            return (ms) null;
        }
        return this.a(true);
    }

    final static boolean a(boolean param0, int param1, int param2) {
        if (param0) {
            field_h = (String) null;
        }
        return (is.a(!param0 ? true : false, param1, param2) | oj.b(param1, param2, -126) | pk.a(param1, param2, 52)) & jf.a(param1, (byte) -91, param2);
    }

    final void a(ms param0, int param1, long param2) {
        ms var5 = null;
        try {
            if (param0.field_g != null) {
                param0.b(false);
            }
            var5 = this.field_i[(int)(param2 & (long)(param1 + this.field_a))];
            param0.field_g = var5.field_g;
            param0.field_b = var5;
            param0.field_g.field_b = param0;
            param0.field_b.field_g = param0;
            param0.field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "te.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, iw param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            if (param0 == -21339) {
              if (m.field_X != param1) {
                if (nl.field_p != param1) {
                  if (field_f != param1) {
                    if (kd.field_b != param1) {
                      if (param1 == ps.field_c) {
                        stackOut_20_0 = 6410;
                        stackIn_21_0 = stackOut_20_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        if (rg.field_A == param1) {
                          stackOut_18_0 = 6145;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          throw new IllegalStateException();
                        }
                      }
                    } else {
                      stackOut_13_0 = 6409;
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackOut_10_0 = 6406;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_7_0 = 6408;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = 6407;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 57;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2);
            stackOut_23_1 = new StringBuilder().append("te.E(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L1;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_14_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_19_0;
                  } else {
                    return stackIn_21_0;
                  }
                }
              }
            }
          }
        }
    }

    te(int param0) {
        int var2 = 0;
        ms dupTemp$0 = null;
        ms var3 = null;
        this.field_b = 0;
        this.field_a = param0;
        this.field_i = new ms[param0];
        for (var2 = 0; var2 < param0; var2++) {
            dupTemp$0 = new ms();
            var3 = dupTemp$0;
            this.field_i[var2] = dupTemp$0;
            var3.field_b = var3;
            var3.field_g = var3;
        }
    }

    static {
        field_c = 0;
        field_f = new iw(1);
        field_g = new jn();
        field_h = "Cancel";
    }
}
