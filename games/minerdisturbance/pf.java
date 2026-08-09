/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static String[][] field_d;
    static String[] field_f;
    static String[][] field_g;
    static ea[] field_a;
    static oe field_e;
    private boolean field_h;
    static int field_c;
    private String field_b;
    static int field_i;

    public static void a(int param0) {
        field_g = (String[][]) null;
        field_e = null;
        field_f = null;
        if (param0 != -1) {
            return;
        }
        field_d = (String[][]) null;
        field_a = null;
    }

    final boolean b(byte param0) {
        if (param0 <= 26) {
            return true;
        }
        return this.field_h;
    }

    final String a(byte param0) {
        int var2 = 16 / ((-65 - param0) / 32);
        return this.field_b;
    }

    pf(String param0) {
        this(param0, false);
    }

    final static void a(we param0, String param1, int param2, int param3, mg param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = MinerDisturbance.field_ab;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            if (param3 == -19453) {
              L1: while (true) {
                if (var7 >= param1.length()) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var8 = param1.charAt(var7);
                    if (var8 == 60) {
                      var6 = param4.field_d[0] + (var5_int >> -1070577144) - -param0.a(param1.substring(0, var7));
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (0 != (var6 ^ -1)) {
                      param4.field_d[var7] = var6;
                      break L3;
                    } else {
                      L4: {
                        if (32 == var8) {
                          var5_int = var5_int + param2;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      param4.field_d[var7] = (var5_int >> 31909096) + param4.field_d[0] - (-param0.a(param1.substring(0, 1 + var7)) - -param0.a((char) var8));
                      break L3;
                    }
                  }
                  L5: {
                    if (var8 == 62) {
                      var6 = -1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("pf.A(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        mb.field_b.a(0, param0, -114);
    }

    pf(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_b = param0;
              stackIn_3_0 = this;

              if (!param1) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((pf) (this)).field_h = stackIn_4_1 != 0;
              if (this.field_b != null) {
                break L2;
              } else {
                this.field_b = "";
                break L2;
              }
            }
            L3: {
              if (this.field_b.length() != 0) {
                break L3;
              } else {
                this.field_h = false;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("pf.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    static {
        field_d = new String[][]{new String[]{"Watch your head. Cracks in the rock above you are the first indications of a cave-in. Unless you have a hard hat, a cave-in will crush you as flat as a pancake!"}};
        field_g = new String[][]{null, new String[]{"Unstable snow: This snow isn't rock hard. If you fall on it from a height or charge into it, you'll cause it to crack."}};
        field_f = new String[]{"Story", "Controls", "Using Equipment", "Environment", "Advanced Environment", "Super Volcano Environment", "Tips"};
    }
}
