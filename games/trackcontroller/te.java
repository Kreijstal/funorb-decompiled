/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends java.awt.Canvas {
    static mk field_b;
    private java.awt.Component field_a;

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "te.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 70 / ((param0 - 34) / 33);
    }

    final static void a(byte param0) {
        if (!ge.field_D) {
          throw new IllegalStateException();
        }
        if (param0 < -22) {
          bc.field_d = true;
          wg.a(-100, false);
          rl.field_N = 0;
          return;
        }
        field_b = (mk) null;
        bc.field_d = true;
        wg.a(-100, false);
        rl.field_N = 0;
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            te.a(-20, 81, -51);
          }
          ug.a(82, (java.awt.Component) ((Object) param1));
          ei.a((byte) -125, (java.awt.Component) ((Object) param1));
          if (rd.field_l == null) {
            return;
          }
          rd.field_l.a((java.awt.Component) ((Object) param1), false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("te.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_a.update(param0);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "te.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var9 = 0;
        int var10 = 0;
        int var3 = va.a(param2, (byte) -47);
        int var4 = mi.a(2048, param2);
        int var5 = va.a(param0, (byte) -47);
        int var6 = mi.a(2048, param0);
        int var7 = (int)((long)var3 * (long)var5 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        if (param1 == 0) {
          var9 = (int)((long)var5 * (long)var4 >> 16);
          var10 = (int)((long)var4 * (long)var6 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
        te.a(-86, 13, 8);
        var9 = (int)((long)var5 * (long)var4 >> 16);
        var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    te(java.awt.Component param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "te.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String[] a(String param0, char param1, byte param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_9_0 = null;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param0);
          var3_int = sf.a(var10, param1, 11109);
          var4 = new String[1 + var3_int];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var3_int > var7; var7++) {
            for (var8 = var6; param1 != param0.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param0.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param0.substring(var6);
          if (param2 <= -36) {
            stackIn_11_0 = var4;
            return stackIn_11_0;
          }
          stackIn_9_0 = (String[]) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("te.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_b = new mk();
    }
}
