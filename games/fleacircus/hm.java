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
        if (param0 == 2067) {
          field_c = null;
          field_h = null;
          field_b = null;
          return;
        }
        field_g = (rh) null;
        field_c = null;
        field_h = null;
        field_b = null;
    }

    final static boolean a(gm param0, gm param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          var3_int = -param0.field_mb + param1.field_mb;
          if (!param2) {
            var5 = (String) null;
            hm.a((String) null, (rh) null, (byte) -42, (String) null);
          }
          if (param1.field_lb == ul.field_F) {
            var3_int -= 200;
          } else {
            if (param1.field_lb == null) {
              var3_int += 200;
            }
          }
          if (param0.field_lb != ul.field_F) {
            if (param0.field_lb == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("hm.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    final java.net.Socket a(int param0) throws IOException {
        if (param0 == 200) {
          return new java.net.Socket(this.field_a, this.field_e);
        }
        field_c = (String[]) null;
        return new java.net.Socket(this.field_a, this.field_e);
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
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = 75 % ((param2 - 67) / 55);
          var4_int = param1.a(param3, (byte) -100);
          var6 = param1.a(param0, (byte) -15, var4_int);
          stackIn_1_0 = ji.a(param1, var4_int, -21460, var6);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("hm.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_b = new wd();
        field_c = new String[255];
        field_f = "<%0>Barriers and Blue Switches:<%1> these yellow walls get in the fleas' way, but if a flea presses a blue button, all the barriers and blue buttons disappear.";
        field_h = "Score: <%0>";
    }
}
