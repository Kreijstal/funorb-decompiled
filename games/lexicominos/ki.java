/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ki {
    static ng field_b;
    static int field_f;
    static nc field_d;
    static int field_g;
    static wh field_a;
    static db field_c;
    static boolean field_e;

    final static void a(int param0, Random param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          do {
            var3_int = rh.a(14817, param1, 4);
          } while (e.field_q == var3_int ||
            qj.field_gb == var3_int);
          qj.field_gb = e.field_q;
          e.field_q = var3_int;
          nh.a(0, param0, var3_int, true);
          if (param2 > -96) {
            field_c = (db) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ki.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(byte param0) {
        if (param0 > -101) {
          Random var2 = (Random) null;
          ki.a(-45, (Random) null, 72);
        }
        return qg.field_d;
    }

    final static void a(Object param0, ab param1, int param2) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param1.field_i == null) {
            return;
          }
          var3_int = 0;
          if (param2 != 50) {
            field_f = -68;
          }
          while (var3_int < 50) {
            if (null != param1.field_i.peekEvent()) {
              ge.a(0, 1L);
              var3_int++;
              continue;
            }
            break;
          }
          try {
            if (param0 != null) {
              param1.field_i.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param0, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ki.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = -128 / ((param0 + 49) / 63);
        field_d = null;
        field_a = null;
    }

    static {
        field_d = null;
        field_b = new ng();
        field_e = false;
    }
}
