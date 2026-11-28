/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    static PlatformTask field_b;
    static volatile int field_a;

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          gg.a(true, param0, "");
          rf.a(20104, param0);
          if (param1 < 120) {
            field_b = (PlatformTask) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) runtimeException), "lj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, java.awt.Canvas param1, int param2, byte param3) {
        java.awt.Graphics var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref2 = null;
        try {
          try {
            var4 = param1.getGraphics();
            v.field_B.drawImage(param0, var4, (byte) -88, param2);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref2 = (Exception) (Object) decompiledCaughtException;
            param1.repaint();
          }
          if (param3 < -127) {
            return;
          }
          field_b = (PlatformTask) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("lj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static CoverageBitmapFont a(int param0, byte[] param1) {
        CoverageBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        CoverageBitmapFont stackIn_5_0 = null;
        CoverageBitmapFont stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          var2 = new CoverageBitmapFont(param1, SingleChildWidgetContainer.field_x, rg.field_c, pb.field_h, bd.field_m, ci.field_b, BufferedRandomAccessFile.field_f);
          GzipDecompressor.a(12428);
          if (param0 == 22076) {
            stackIn_7_0 = var2;
            return stackIn_7_0;
          }
          stackIn_5_0 = (CoverageBitmapFont) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("lj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != 0) {
          field_b = (PlatformTask) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_a = 0;
    }
}
