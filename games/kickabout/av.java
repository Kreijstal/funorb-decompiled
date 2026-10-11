/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class av {
    String field_c;
    static hd[] field_b;
    int field_a;
    static String field_d;

    final static void a(int param0, int param1, int[] param2, ea param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = Kickabout.field_G;
        try {
          for (var4_int = param3.field_c + param1; param3.field_l >= var4_int; var4_int++) {
            for (var5 = param3.field_i + 1; param3.field_d >= var5; var5++) {
              for (var6 = param3.field_k + 1; param3.field_e >= var6; var6++) {
                param2[var6 + (var5 << 5) + ((var4_int << 10) - (-(var4_int << 6) + (-var4_int - var5)))] = param0;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("av.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    abstract java.net.Socket a(int param0) throws IOException;

    public static void b(int param0) {
        field_d = null;
        if (param0 <= 68) {
          return;
        }
        field_b = null;
    }

    final java.net.Socket c(int param0) throws IOException {
        if (param0 != 16080938) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_c, this.field_a);
    }

    static {
        field_d = "to the Final";
    }
}
