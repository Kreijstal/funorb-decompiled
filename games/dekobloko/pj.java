/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends sf {
    int field_K;
    static String field_G;
    static String field_F;
    static String[] field_N;
    static String field_L;
    static ck field_I;
    wl field_J;
    byte field_M;

    final int a(boolean param0) {
        if (param0) {
            return -110;
        }
        if (!(this.field_J != null)) {
            return 0;
        }
        return 100 * this.field_J.field_n / (-this.field_M + this.field_J.field_r.length);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public static void h(byte param0) {
        int discarded$0 = 0;
        field_N = null;
        field_G = null;
        field_L = null;
        field_I = null;
        field_F = null;
        if (param0 < 78) {
            discarded$0 = pj.d(-100);
        }
    }

    final byte[] g(byte param0) {
        int discarded$2 = 0;
        if (!this.field_z) {
          if (this.field_J.field_r.length - this.field_M <= this.field_J.field_n) {
            if (param0 <= 65) {
              discarded$2 = pj.d(9);
              return this.field_J.field_r;
            } else {
              return this.field_J.field_r;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static int d(int param0) {
        int var1 = -62 % ((param0 - 81) / 40);
        return ac.field_A;
    }

    final static void a(ve param0, byte param1) {
        RuntimeException runtimeException = null;
        ve var2 = null;
        int var3 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            param0.b((byte) 108);
            if (param1 == -50) {
              var2 = (ve) ((Object) h.field_b.c((byte) -99));
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (var2 == null) {
                        break L4;
                      } else {
                        stackOut_5_0 = var2.a(param0, false);
                        stackIn_12_0 = stackOut_5_0 ? 1 : 0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var3 != 0) {
                          break L3;
                        } else {
                          if (!stackIn_6_0) {
                            break L4;
                          } else {
                            var2 = (ve) ((Object) h.field_b.d(true));
                            if (var3 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    L5: {
                      if (var2 != null) {
                        break L5;
                      } else {
                        h.field_b.a(param0, 2777);
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    stackOut_11_0 = 114;
                    stackIn_12_0 = stackOut_11_0;
                    break L3;
                  }
                  fm.a((byte) stackIn_12_0, param0, var2);
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (runtimeException);
            stackOut_14_1 = new StringBuilder().append("pj.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        int discarded$0 = 0;
        ul.field_d = param2;
        qk.field_d = param1;
        if (param0 != 31004) {
            discarded$0 = pj.d(-44);
        }
    }

    pj() {
    }

    static {
        field_F = "This game option is only available to members.";
        field_G = "Add <%0> to ignore list";
        field_N = new String[16];
        field_L = "Enter name of player to add to list";
    }
}
