/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc implements ad {
    private int field_d;
    static boolean field_e;
    private int field_a;
    static String field_b;
    private we field_c;

    final static void a(java.applet.Applet param0, String param1, byte param2) {
        try {
          String var6 = null;
          String var5 = null;
          String var4 = null;
          String var7 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            nj.field_a = param1;
            try {
              var6 = param0.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param0.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              if (param2 < 66) {
                field_b = (String) null;
              }
              var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (param1.length() == 0) {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              } else {
                var5Lifetime6 = var7 + "; Expires=" + e.a(sf.a((byte) -122) + 94608000000L, -127) + "; Max-Age=" + 94608000L;
              }
              lk.a(param0, "document.cookie=\"" + var5Lifetime6 + "\"", (byte) -106);
            } catch (Throwable throwable) {
            }
            ie.a(param0, true);
          } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "nc.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        int var1 = -96 % ((33 - param0) / 63);
        field_b = null;
    }

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MinerDisturbance.field_ab;
        try {
          if (!param2.field_x &&
            !param2.k(param0 - 12174)) {
            stackIn_5_0 = 2188450;
          } else {
            stackIn_5_0 = 3249872;
          }
          var6_int = stackIn_5_0;
          if (param0 != 12088) {
            field_b = (String) null;
          }
          this.field_c.a("<u=" + Integer.toString(var6_int, 16) + ">" + param2.field_s + "</u>", param1 + param2.field_u, param2.field_t + param3, param2.field_v, param2.field_q, var6_int, -1, this.field_a, this.field_d, this.field_c.field_I + this.field_c.field_E);
          if (!param2.k(-105)) {
            return;
          }
          var7 = this.field_c.a(param2.field_s);
          var8 = this.field_c.field_E + this.field_c.field_I;
          var9 = param2.field_u + param1;
          var10 = param3 + param2.field_t;
          if (this.field_a != 2) {
            if (1 == this.field_a) {
              var9 = var9 + (param2.field_v - var7 >> 1);
            }
          } else {
            var9 = var9 + (-var7 + param2.field_v);
          }
          if (this.field_d != 2) {
            if (this.field_d == 1) {
              var10 = var10 + (-var8 + param2.field_q >> 1);
            }
          } else {
            var10 = var10 + (param2.field_q - var8);
          }
          se.c(-2 + var9, 2, var10 + 2, 4 + var7, var8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("nc.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public nc() {
        this.field_a = 1;
        this.field_d = 1;
        this.field_c = bn.field_d;
    }

    nc(we param0, int param1, int param2) {
        try {
          this.field_c = param0;
          this.field_a = param1;
          this.field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "nc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = false;
        field_b = "Here Lies Crushed";
    }
}
