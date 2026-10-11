/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class via extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String[][] field_c;
    static jpa[] field_a;
    java.awt.Frame field_d;
    static int field_e;
    volatile boolean field_b;

    final static lu a(String param0, int param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        lu stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          var6 = null;
          if (param3.indexOf((int) (char)param1) != -1) {
            var6 = param3;
          } else {
            var7 = (CharSequence) ((Object) param3);
            var4_long = jm.a(var7, 117);
          }
          stackIn_4_0 = b.a(param0, 0, (String) (var6), param2, var4_long);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("via.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = (String[][]) null;
        if (param0 != 64) {
          field_a = (jpa[]) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(byte param0, fia param1) {
        try {
          vf.a(31637, param1, this.field_d);
          if (param0 != -34) {
            field_c = (String[][]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "via.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_b = true;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "via.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(ka param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var8 = null;
        Exception var9 = null;
        String var10 = null;
        gda var11 = null;
        try {
          if (param0 == null) {
            param0 = qi.field_O;
          }
          if (param0 == null) {
            return;
          }
          var11 = tga.field_a.e();
          var11.a();
          if (param2 != 0) {
            var11.c(param2 << 3);
          }
          if (0 != param1) {
            var11.d(param1 << 3);
          }
          if (param7 != 0) {
            var11.b(param7 << 3);
          }
          var11.a(param4 >> 14, -param3 >> 14, -param5 >> 14);
          try {
            if (ica.field_a) {
              param0.a(var11, (el) null, 0);
            } else {
              param0.a(var11, (el) null, 2048, 0);
            }
            if (param6 >= 44) {
              return;
            }
            var10 = (String) null;
            via.a((String) null, 40, false, (String) null);
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var9 = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var8 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var8;
          stackIn_23_1 = new StringBuilder().append("via.B(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    via() {
    }

    static {
        field_c = new String[][]{new String[]{"3", "4", "5", "6"}, new String[]{"2", "3"}};
    }
}
