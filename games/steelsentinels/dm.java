/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static String field_h;
    private boolean field_b;
    static u field_f;
    static boolean field_c;
    static int field_a;
    private String field_i;
    static String field_e;
    private boolean field_g;
    static String field_d;

    final void a(int param0, boolean param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        this.field_g = true;
        if (param0 != 200) {
          L0: {
            field_a = 9;
            stackIn_7_0 = this;

            if (!param1) {
              stackIn_8_0 = this;
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = 1;
              break L0;
            }
          }
          ((dm) (this)).field_b = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
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
          ((dm) (this)).field_b = stackIn_4_1 != 0;
          return;
        }
    }

    final boolean b(int param0) {
        if (param0 != 200) {
            this.a(false);
            return this.field_b;
        }
        return this.field_b;
    }

    final static boolean a(ah param0, int param1, ah param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        StringBuilder var5 = null;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 22635) {
                break L1;
              } else {
                var5 = (StringBuilder) null;
                dm.a('', -119, (StringBuilder) null, -20);
                break L1;
              }
            }
            L2: {
              var3_int = -param0.field_bc + param2.field_bc;
              if (param2.field_ac != nn.field_f) {
                if (param2.field_ac == null) {
                  var3_int += 200;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                var3_int -= 200;
                break L2;
              }
            }
            L3: {
              if (nn.field_f != param0.field_ac) {
                if (param0.field_ac == null) {
                  var3_int -= 200;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                var3_int += 200;
                break L3;
              }
            }
            L4: {
              if ((var3_int ^ -1) >= -1) {
                stackIn_16_0 = 0;
                break L4;
              } else {
                stackIn_16_0 = 1;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("dm.D(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final boolean a(byte param0) {
        if (param0 != -72) {
            return true;
        }
        return this.field_g;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 > -99) {
          dm.a(120);
          field_f = null;
          field_d = null;
          field_h = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          field_h = null;
          return;
        }
    }

    final String a(boolean param0) {
        if (!param0) {
            return (String) null;
        }
        return this.field_i;
    }

    final static StringBuilder a(char param0, int param1, StringBuilder param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            var4_int = param2.length();
            param2.setLength(param3);
            var5 = var4_int;
            L1: while (true) {
              if (param3 <= var5) {
                L2: {
                  if (param1 == 200) {
                    break L2;
                  } else {
                    field_a = 21;
                    break L2;
                  }
                }
                stackIn_7_0 = (StringBuilder) (param2);
                break L0;
              } else {
                param2.setCharAt(var5, param0);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("dm.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    dm(String param0) {
        this.field_g = false;
        this.field_b = false;
        try {
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "dm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = true;
        field_h = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_e = "Sentinels Expansion";
        field_a = 3;
        field_d = "Friends";
    }
}
