/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends java.awt.Canvas {
    static cg field_b;
    static RgbSprite[] field_c;
    static ue field_d;
    private java.awt.Component field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 < 43) {
          le.a(-119);
          field_b = null;
          field_d = null;
          return;
        }
        field_b = null;
        field_d = null;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        PacketBuffer var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.length() > 1) {
            return true;
          }
          if (param0 == -125) {
            return false;
          }
          var3 = (PacketBuffer) null;
          le.a(94, (byte) 20, (PacketBuffer) null);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("le.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_a.update(param0);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "le.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "le.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, byte param1, PacketBuffer param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param2.e(-23470);
            if (param1 != -25) {
              stackIn_2_0 = (String) null;
              return stackIn_2_0;
            }
            if (var3_int > param0) {
              var3_int = param0;
            }
            var4 = new byte[var3_int];
            param2.position = param2.position + ds.field_c.a(param2.payload, param2.position, false, var3_int, 0, var4);
            var5 = co.a(0, var3_int, -107, var4);
            stackIn_7_0 = var5;
            return stackIn_7_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_9_0 = "Cabbage";
            return stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("le.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    le(java.awt.Component param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "le.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
