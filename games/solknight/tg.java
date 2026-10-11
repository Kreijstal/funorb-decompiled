/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends pj {
    static o field_J;
    static o field_I;
    static String field_K;

    public static void a(int param0) {
        field_K = null;
        field_I = null;
        if (param0 != 22722) {
          return;
        }
        field_J = null;
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          var3 = uc.a(param0, param2, 0);
          if (param1 > -95) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          if (var3 != null) {
            stackIn_7_0 = var3;
            return stackIn_7_0;
          }
          var4 = 0;
          while (true) {
            if (var4 >= param2.length()) {
              return null;
            }
            if (wg.a(param2.charAt(var4), (byte) -127)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_13_0 = ah.field_b;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("tg.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static ce a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ce stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (td.field_h.a(false) &&
            !param0.equals(td.field_h.b(28903))) {
            td.field_h = hh.a(param0, false);
          }
          var2_int = -48 / ((44 - param1) / 48);
          stackIn_4_0 = td.field_h;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("tg.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.field_F = !this.field_F ? true : false;
        super.a(param0, param1, param2, param3);
    }

    tg(String param0, dg param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_F = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "tg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private tg(String param0, dg param1) {
        this(param0, ph.field_f.field_i, param1);
        try {
          this.field_w = ph.field_f.field_r;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "tg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private tg(String param0, j param1, dg param2) {
        super(param0, param1, param2);
        try {
          this.field_w = ph.field_f.field_r;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "tg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_J = new o(540, 140);
        field_I = new o(270, 70);
        field_K = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
