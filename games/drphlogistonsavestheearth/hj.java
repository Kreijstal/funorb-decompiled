/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class hj {
    static int field_f;
    static String field_h;
    int field_d;
    static ok field_g;
    String field_b;
    static String field_a;
    static nh field_e;
    static gk field_i;
    static String field_c;

    public static void a(int param0) {
        field_i = null;
        field_a = null;
        field_g = null;
        field_c = null;
        if (param0 == -20385) {
          field_e = null;
          field_h = null;
          return;
        }
        field_e = (nh) null;
        field_e = null;
        field_h = null;
    }

    abstract java.net.Socket a(boolean param0) throws IOException;

    final static int a(int param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 12286) {
            field_g = (ok) null;
          }
          if (param1) {
            stackIn_6_0 = sl.field_o.b(param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = k.field_H.b(param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hj.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static String a(String param0, vj param1, String param2, int param3, int param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 17733) {
            field_h = (String) null;
          }
          if (!param1.a(0)) {
            stackIn_5_0 = (String) (param0);
            return stackIn_5_0;
          }
          stackIn_7_0 = param2 + " - " + param1.a(71, param3) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("hj.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 != 31619) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_b, this.field_d);
    }

    static {
        field_a = "Music:";
        field_e = null;
        field_h = "Player Name: ";
        field_c = "Charge the Verne Cannon";
    }
}
