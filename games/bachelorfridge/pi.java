/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pi extends kj {
    private int field_f;
    private eaa field_g;
    static String field_h;

    final static String a(int param0, java.applet.Applet param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_3_0 = null;
          String stackIn_9_0 = null;
          String stackIn_16_0 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = BachelorFridge.field_y;
          try {
            try {
              var9 = param1.getParameter("cookieprefix");
              if (param0 != 11713) {
                stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              var3 = var9 + "settings";
              var4 = (String) (ac.a(param1, "getcookies", (byte) 64));
              var5 = fda.a(-1, ';', var4);
              for (var6 = 0; var6 < var5.length; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_9_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (null == nb.field_q) {
              return param1.getParameter("settings");
            }
            stackIn_16_0 = nb.field_q;
            return stackIn_16_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("pi.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean b(int param0) {
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_1 = 0;
        rea stackIn_15_0;
        rea stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        int stackIn_15_4;
        rea stackIn_16_0;
        rea stackIn_16_1;
        int stackIn_16_5;
        int var2;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        rea var9;
        int var10;
        var10 = BachelorFridge.field_y;
        int fieldTemp$0 = this.field_f - 2;
        this.field_f = this.field_f - 2;
        if (fieldTemp$0 == 0) {
          return true;
        }
        if (this.field_f <= 126 &&
          this.field_f > 50) {
          var2 = this.field_f;
          var2 += 16;
          for (var3 = 0; var3 < 72; var3++) {
            var4 = kla.a(this.field_f, this.field_e.field_h.field_w, -2147483648) - (this.field_f >> 1);
            stackIn_10_0 = (this.field_f >> 2) - Math.abs(var4) / 2;
            stackIn_10_1 = 0;
            if (stackIn_10_1 < kla.a(2, this.field_e.field_h.field_w, -2147483648)) {
              stackIn_13_1 = 1;
            } else {
              stackIn_13_1 = -1;
            }
            var5 = stackIn_10_0 * stackIn_13_1;
            kla.a(50, this.field_e.field_h.field_w, -2147483648);
            var6 = 64 + var4;
            var7 = var5 + 32;
            var8 = (int)(Math.sin(300.0 * (double)var2) * 100.0) * 0;
            stackIn_15_0 = null;
            stackIn_15_1 = null;
            stackIn_15_2 = var6;
            stackIn_15_3 = var8;
            stackIn_15_4 = var7;
            if (kla.a(20, this.field_e.field_h.field_w, -2147483648) >= 5) {
              stackIn_16_0 = null;
              stackIn_16_1 = null;
              stackIn_16_5 = aha.field_A[this.field_e.field_h.field_E][0];
            } else {
              stackIn_16_0 = null;
              stackIn_16_1 = null;
              stackIn_16_5 = aha.field_A[this.field_e.field_h.field_E][1];
            }
            var9 = new rea(stackIn_15_2, stackIn_15_3, stackIn_15_4, stackIn_16_5);
            kla.a(3, this.field_e.field_h.field_w, -2147483648);
            kla.a(5000, this.field_e.field_h.field_w, -2147483648);
            var9.field_o = (double)(-kla.a(2, this.field_e.field_h.field_w, -2147483648));
            var9.field_n = -kla.a(10, this.field_e.field_h.field_w, -2147483648) + 25;
            var9.field_h = -1;
            this.field_g.a(var9, true);
          }
        }
        if (param0 < 21) {
          this.field_g = (eaa) null;
        }
        r.a(-126, this.field_f, this.field_e.field_h.field_w, this.field_g);
        return false;
    }

    final static kv[] a(vr param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        kv[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -8845) {
            field_h = (String) null;
          }
          var4_int = param0.a(param2, false);
          var5 = param0.a((byte) 6, var4_int, param3);
          stackIn_3_0 = uka.a(var5, param1 ^ -8947, param0, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("pi.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
          this.b(57);
        }
    }

    pi(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        try {
          this.field_f = 136;
          this.field_g = new eaa();
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
          return;
        }
        fv.a(param0, 65280, 10, this.field_g, param2, (byte) -115);
    }

    public static void a(boolean param0) {
        if (param0) {
          field_h = (String) null;
        }
        field_h = null;
    }

    static {
        field_h = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
