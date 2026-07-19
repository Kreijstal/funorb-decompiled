/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static byte[][] field_d;
    private jl field_b;
    private jl field_a;
    static ej field_f;
    static String field_e;
    static int field_c;

    final jl a(byte param0) {
        int var3 = 29 / ((-69 - param0) / 34);
        jl var2 = this.field_a;
        if (!(this.field_b != var2)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_o;
        return var2;
    }

    final jl a(int param0) {
        jl var2 = null;
        if (param0 == 0) {
          var2 = this.field_a;
          if (var2 == this.field_b) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_q;
            return var2;
          }
        } else {
          field_e = (String) null;
          var2 = this.field_a;
          if (var2 == this.field_b) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_q;
            return var2;
          }
        }
    }

    final jl d(int param0) {
        jl var2 = this.field_b.field_o;
        int var3 = -78 / ((param0 - -30) / 50);
        if (!(this.field_b != var2)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_o;
        return var2;
    }

    final jl c(boolean param0) {
        jl discarded$2 = null;
        jl var2 = null;
        jl stackIn_4_0 = null;
        jl stackIn_5_0 = null;
        jl stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        jl stackIn_10_0 = null;
        jl stackIn_11_0 = null;
        jl stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        jl stackOut_9_0 = null;
        jl stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        jl stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        jl stackOut_3_0 = null;
        jl stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        jl stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        if (!param0) {
          var2 = this.field_b.field_o;
          if (var2 == this.field_b) {
            return null;
          } else {
            L0: {
              stackOut_9_0 = (jl) (var2);
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (param0) {
                stackOut_11_0 = (jl) ((Object) stackIn_11_0);
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L0;
              } else {
                stackOut_10_0 = (jl) ((Object) stackIn_10_0);
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L0;
              }
            }
            ((jl) (Object) stackIn_12_0).b(stackIn_12_1 != 0);
            return var2;
          }
        } else {
          discarded$2 = this.a(-10);
          var2 = this.field_b.field_o;
          if (var2 != this.field_b) {
            L1: {
              stackOut_3_0 = (jl) (var2);
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (param0) {
                stackOut_5_0 = (jl) ((Object) stackIn_5_0);
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L1;
              } else {
                stackOut_4_0 = (jl) ((Object) stackIn_4_0);
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L1;
              }
            }
            ((jl) (Object) stackIn_6_0).b(stackIn_6_1 != 0);
            return var2;
          } else {
            return null;
          }
        }
    }

    final void a(boolean param0) {
        jl var2 = null;
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        L0: while (true) {
          var2 = this.field_b.field_o;
          if (var2 == this.field_b) {
            if (!param0) {
              field_d = (byte[][]) null;
              this.field_a = null;
              return;
            } else {
              this.field_a = null;
              return;
            }
          } else {
            var2.b(true);
            continue L0;
          }
        }
    }

    final int b(boolean param0) {
        int var2 = 0;
        jl var3 = null;
        int var4 = 0;
        var4 = Confined.field_J ? 1 : 0;
        if (!param0) {
          field_f = (ej) null;
          var2 = 0;
          var3 = this.field_b.field_o;
          L0: while (true) {
            if (this.field_b == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_o;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          var3 = this.field_b.field_o;
          L1: while (true) {
            if (this.field_b == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_o;
              continue L1;
            }
          }
        }
    }

    public wd() {
        this.field_b = new jl();
        this.field_b.field_o = this.field_b;
        this.field_b.field_q = this.field_b;
    }

    final static void a(long param0, int param1) {
        try {
            int var3_int = 0;
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                Thread.sleep(param0);
                var3_int = -14 / ((81 - param1) / 34);
                break L0;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final jl c(int param0) {
        jl var2 = null;
        var2 = this.field_b.field_q;
        if (this.field_b != var2) {
          this.field_a = var2.field_q;
          if (param0 >= -81) {
            return (jl) null;
          } else {
            return var2;
          }
        } else {
          this.field_a = null;
          return null;
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            if (!lc.a(true, param2)) {
              if (wc.a(param2, param0 ^ -14)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!ef.a(96, param2)) {
                  if (param1.length() == param0) {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!nm.a(param1, (byte) -89, param2)) {
                      if (!qd.a(param1, param2, false)) {
                        if (!ig.a(param1, 0, param2)) {
                          stackOut_23_0 = 1;
                          stackIn_24_0 = stackOut_23_0;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        } else {
                          stackOut_21_0 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var3);
            stackOut_25_1 = new StringBuilder().append("wd.E(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L1;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L1;
            }
          }
          L2: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L2;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_19_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_22_0 != 0;
                    } else {
                      return stackIn_24_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(jl param0, byte param1) {
        try {
            if (!(null == param0.field_q)) {
                param0.b(true);
            }
            param0.field_q = this.field_b.field_q;
            int var3_int = 121 / ((67 - param1) / 46);
            param0.field_o = this.field_b;
            param0.field_q.field_o = param0;
            param0.field_o.field_q = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "wd.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_d = (byte[][]) null;
        field_f = null;
        if (param0 != -17765) {
            wd.a(34L, 30);
        }
    }

    static {
        field_d = new byte[1000][];
        field_f = new ej();
        field_e = "Power shots";
        field_c = 2;
    }
}
