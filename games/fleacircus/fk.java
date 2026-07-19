/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends dl {
    static vc field_z;
    static String field_B;
    ni field_A;
    static boolean field_D;
    byte field_E;
    static int field_C;
    int field_y;
    static String field_x;

    final static void a(String param0, int param1, boolean param2, String[] param3) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        String[] var6 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (!param2) {
              L1: {
                L2: {
                  ui.field_kb = ui.field_ob;
                  if (param1 == 255) {
                    break L2;
                  } else {
                    L3: {
                      if ((param1 ^ -1) > -101) {
                        break L3;
                      } else {
                        if (105 < param1) {
                          break L3;
                        } else {
                          var4 = param3;
                          m.a(-100, var4);
                          kh.field_a = ha.a(param3, -21916);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    kh.field_a = af.a((byte) 36, param1, param0);
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  if (ug.field_c >= 13) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L4;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L4;
                  }
                }
                kh.field_a = ld.a(stackIn_12_0 != 0, (byte) 42);
                var6 = (String[]) null;
                m.a(-44, (String[]) null);
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (runtimeException);
            stackOut_14_1 = new StringBuilder().append("fk.E(");
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
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void i(int param0) {
        String[] var2 = null;
        if (param0 != 105) {
          var2 = (String[]) null;
          fk.a((String) null, 1, true, (String[]) null);
          field_B = null;
          field_z = null;
          field_x = null;
          return;
        } else {
          field_B = null;
          field_z = null;
          field_x = null;
          return;
        }
    }

    final int f(int param0) {
        if (param0 == 8651) {
          if (this.field_A == null) {
            return 0;
          } else {
            return 100 * this.field_A.field_i / (this.field_A.field_k.length + -this.field_E);
          }
        } else {
          return 45;
        }
    }

    final byte[] g(int param0) {
        if (!this.field_q) {
          if (this.field_A.field_i >= -this.field_E + this.field_A.field_k.length) {
            if (param0 != 100) {
              field_D = false;
              return this.field_A.field_k;
            } else {
              return this.field_A.field_k;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    fk() {
    }

    static {
        field_z = new vc();
        field_B = "(Including <%0>)";
        field_x = "Waiting for sound effects";
    }
}
