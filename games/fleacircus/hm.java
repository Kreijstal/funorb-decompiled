/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class hm {
    int field_e;
    String field_a;
    static wd field_b;
    static rh field_g;
    static String[] field_c;
    static String field_h;
    static String field_f;
    static int field_d;

    public static void b(int param0) {
        field_g = null;
        field_f = null;
        if (param0 != 2067) {
          field_g = (rh) null;
          field_c = null;
          field_h = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_h = null;
          field_b = null;
          return;
        }
    }

    final static boolean a(gm param0, gm param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
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
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = -param0.field_mb + param1.field_mb;
              if (param2) {
                break L1;
              } else {
                var5 = (String) null;
                hm.a((String) null, (rh) null, (byte) -42, (String) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1.field_lb == ul.field_F) {
                  break L3;
                } else {
                  if (param1.field_lb != null) {
                    break L2;
                  } else {
                    var3_int += 200;
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var3_int -= 200;
              break L2;
            }
            L4: {
              L5: {
                if (param0.field_lb != ul.field_F) {
                  break L5;
                } else {
                  var3_int += 200;
                  if (var4 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (param0.field_lb != null) {
                break L4;
              } else {
                var3_int -= 200;
                break L4;
              }
            }
            L6: {
              if ((var3_int ^ -1) >= -1) {
                stackIn_16_0 = 0;
                break L6;
              } else {
                stackIn_16_0 = 1;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("hm.D(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != 200) {
          field_c = (String[]) null;
          return new java.net.Socket(this.field_a, this.field_e);
        } else {
          return new java.net.Socket(this.field_a, this.field_e);
        }
    }

    abstract java.net.Socket a(boolean param0) throws IOException;

    final static bi a(String param0, rh param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        bi stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = 75 % ((param2 - 67) / 55);
            var4_int = param1.a(param3, (byte) -100);
            var6 = param1.a(param0, (byte) -15, var4_int);
            stackIn_1_0 = ji.a(param1, var4_int, -21460, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("hm.B(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_b = new wd();
        field_c = new String[255];
        field_f = "<%0>Barriers and Blue Switches:<%1> these yellow walls get in the fleas' way, but if a flea presses a blue button, all the barriers and blue buttons disappear.";
        field_h = "Score: <%0>";
    }
}
