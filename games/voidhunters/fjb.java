/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fjb implements dja {
    static String field_b;
    static String field_a;
    static kob field_c;

    public final tv a(byte param0) {
        int var2 = 124 % ((-64 - param0) / 50);
        return (tv) ((Object) new rha());
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 < 76) {
          field_b = (String) null;
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          field_c = (kob) null;
          return (tv[]) ((Object) new rha[param1]);
        }
        return (tv[]) ((Object) new rha[param1]);
    }

    final static nc a(String param0, nc[] param1, rqa[] param2, byte param3) throws gva {
        int var5 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$0 = null;
        nc stackIn_5_0 = null;
        nc stackIn_9_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder var7 = null;
        var6 = VoidHunters.field_G;
        try {
          var4_int = 0;
          while (param2.length > var4_int) {
            if (!param2[var4_int].a(true, param0, param1)) {
              var4_int++;
              continue;
            }
            stackIn_5_0 = param2[var4_int].a(param1, -123);
            return stackIn_5_0;
          }
          if (param3 >= -122) {
            stackIn_9_0 = (nc) null;
            return stackIn_9_0;
          }
          var7 = new StringBuilder("The method " + param0 + "(");
          for (var5 = 0; param1.length > var5; var5++) {
            if (param1[var5].field_a) {
              discarded$1 = var7.append(sna.a(param1[var5].field_b, (byte) 119).toString());
            } else {
              discarded$2 = var7.append(wp.a(param1[var5].field_b.getClass(), false));
            }
            if (-1 + param1.length > var5) {
              discarded$3 = var7.append(',');
            }
          }
          discarded$0 = var7.append(") is undefined.");
          throw new gva(var7.toString());
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("fjb.D(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        String var0 = "Unknown";
        try {
          var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "Unknown";
        try {
          var0 = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "Unknown";
        try {
          var0 = System.getProperty("os.name").toLowerCase();
        } catch (Exception exception) {
        }
        field_b = var0.toLowerCase();
        var0 = "Unknown";
        try {
          var0 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
        }
        field_a = var0.toLowerCase();
        var0 = "Unknown";
        try {
          var0 = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "~/";
        try {
          var0 = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
        }
        File discarded$0 = new File(var0);
    }
}
