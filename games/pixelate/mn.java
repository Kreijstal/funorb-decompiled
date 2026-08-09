/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    int field_b;
    static String field_a;
    static bd field_c;
    int[] field_g;
    int field_d;
    static String field_f;
    static int field_e;

    public static void b(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != -26) {
            field_c = (bd) null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        String var5;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          if (null == this.field_g) {
            break L0;
          } else {
            if (this.field_g.length == 0) {
              break L0;
            } else {
              var3 = 1;
              L1: while (true) {
                if (this.field_g.length <= var3) {
                  if (param1 != 27760) {
                    var5 = (String) null;
                    mn.a(-39, (fm) null, (String) null, (String) null, (String) null);
                    return -1 + this.field_g.length;
                  } else {
                    return -1 + this.field_g.length;
                  }
                } else {
                  if ((param0 ^ -1) <= (this.field_g[var3] + this.field_g[-1 + var3] >> 309538785 ^ -1)) {
                    var3++;
                    continue L1;
                  } else {
                    return -1 + var3;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    final int a(byte param0) {
        if (param0 == 86) {
          if (this.field_g != null) {
            if (this.field_g.length == 0) {
              return 0;
            } else {
              return this.field_g[this.field_g.length + -1];
            }
          } else {
            return 0;
          }
        } else {
          this.a((byte) -107);
          if (this.field_g != null) {
            if (this.field_g.length == 0) {
              return 0;
            } else {
              return this.field_g[this.field_g.length + -1];
            }
          } else {
            return 0;
          }
        }
    }

    final static cm a(int param0, pp param1) {
        cm var2 = null;
        RuntimeException var2_ref = null;
        cm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -21317) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            var2 = new cm(param1, param1);
            bo.field_d.a(22125, var2);
            wi.field_d.a(param1);
            stackIn_3_0 = (cm) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("mn.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7;
        var7 = 46 / ((-78 - param2) / 35);
        if (param4 <= param0) {
          if (param4 - -param6 > param0) {
            if (param1 <= param5) {
              if (param5 >= param1 + param3) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static String a(int param0, fm param1, String param2, String param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1.b(-3)) {
              stackIn_3_0 = (String) (param4);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 > 43) {
                  break L1;
                } else {
                  field_f = (String) null;
                  break L1;
                }
              }
              stackIn_7_0 = param2 + " - " + param1.c(109, param3) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("mn.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    mn(int param0, int param1, int param2) {
        this.field_b = param0;
        this.field_d = param1;
        this.field_g = new int[param2 - -1];
    }

    static {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_c = new bd();
        field_e = -1;
    }
}
