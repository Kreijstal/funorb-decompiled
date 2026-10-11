/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static int field_a;
    private tf[] field_b;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        dk.a(param3, param4, (byte) 75, param1, param0, this.field_b);
        if (param2 != -1) {
          String var7 = (String) null;
          sb.a(107, (String) null, false);
        }
    }

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3) {
            field_a = 28;
          }
          if (!param2) {
            stackIn_6_0 = bg.field_j.c(param1);
            return stackIn_6_0;
          }
          stackIn_4_0 = ma.field_y.c(param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("sb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    sb(tf[] param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, int param1) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var8 = Pixelate.field_H ? 1 : 0;
        String var2 = fg.field_e;
        String var3 = Integer.toString(param0);
        int var4 = var3.length();
        int var5 = var2.length();
        int var6 = var4 % 3;
        if (var6 == 0) {
          var6 = 3;
        }
        StringBuilder var7 = new StringBuilder((var4 - var6) / param1 + var5);
        StringBuilder discarded$0 = var7.append(var2);
        StringBuilder discarded$1 = var7.append(var3.substring(0, var6));
        var3 = var3.substring(var6);
        while (var3.length() > 0) {
          discarded$2 = var7.append(wl.field_f);
          discarded$3 = var7.append(var3.substring(0, 3));
          var3 = var3.substring(3);
        }
        return var7.toString();
    }

    static {
    }
}
