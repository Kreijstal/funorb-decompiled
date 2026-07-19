/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends pd {
    private wf field_x;
    static String field_s;
    static ka[] field_t;
    static String field_v;
    static boolean[][] field_u;
    static int field_w;

    rl(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            this.field_x = new wf(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
            kh var3 = (kh) null;
            this.a(false, (kh) null);
            return 7;
        }
        return 7;
    }

    final void g(byte param0) {
        if (param0 != 3) {
            return;
        }
        this.field_x = this.field_x.e(-1);
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            this.field_x.a(-29928, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(boolean param0) {
        field_t = null;
        if (!param0) {
          field_v = (String) null;
          field_u = (boolean[][]) null;
          field_s = null;
          field_v = null;
          return;
        } else {
          field_u = (boolean[][]) null;
          field_s = null;
          field_v = null;
          return;
        }
    }

    final static int r(int param0) {
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_8_0 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            discarded$12 = ej.field_a.a(gv.field_u, true, oi.field_b, -116);
            ej.field_a.g((byte) -127);
            L1: while (true) {
              L2: {
                L3: {
                  if (!es.a(true)) {
                    break L3;
                  } else {
                    discarded$13 = ej.field_a.a((byte) 116, fna.field_h, kda.field_td);
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if ((bf.field_a ^ -1) != 0) {
                  break L2;
                } else {
                  if (nfa.field_p) {
                    stackOut_12_0 = 3;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (gsa.field_y != wt.field_d) {
                      if (!gva.field_b.b(108)) {
                        stackOut_19_0 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L4: {
                          if (param0 <= -87) {
                            break L4;
                          } else {
                            field_u = (boolean[][]) null;
                            break L4;
                          }
                        }
                        if (gsa.field_y != kl.field_a) {
                          stackOut_26_0 = -1;
                          stackIn_27_0 = stackOut_26_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackOut_24_0 = 2;
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
              var1_int = bf.field_a;
              jsa.a(false, -1);
              stackOut_8_0 = var1_int;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "rl.U(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_25_0;
                } else {
                  return stackIn_27_0;
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, hca param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param0 <= -114) {
              param1.a(this.field_x, (byte) 3);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
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
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("rl.L(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_v = "Finish Order";
        field_s = "Portals";
        field_w = 0;
    }
}
