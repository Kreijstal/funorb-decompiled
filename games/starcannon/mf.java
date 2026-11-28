/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static String field_b;
    static String field_e;
    static AccountServiceResult field_a;
    static int field_d;
    static BufferedRandomAccessFile field_c;

    final static AwtRasterBuffer a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          AwtRasterBuffer var5 = null;
          ImageProducerRasterBuffer var5_ref = null;
          AwtRasterBuffer stackIn_3_0 = null;
          ImageProducerRasterBuffer stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param3 != -21880) {
                field_d = 25;
              }
              var4 = Class.forName("BufferedImageRasterBuffer");
              var5 = (AwtRasterBuffer) (var4.newInstance());
              var5.initialize(param3 ^ 28897, param0, param1, param2);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ImageProducerRasterBuffer();
              ((AwtRasterBuffer) ((Object) var5_ref)).initialize(-9623, param0, param1, param2);
              stackIn_5_0 = var5_ref;
              return (AwtRasterBuffer) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("mf.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw sd.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return;
          }
          FullscreenFocusCanvas.a((java.awt.Component) ((Object) param1), (byte) 69);
          TextHotspotBounds.a((java.awt.Component) ((Object) param1), 0);
          if (null == qj.field_eb) {
            return;
          }
          qj.field_eb.attach(205, (java.awt.Component) ((Object) param1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("mf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(int param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        if (param0 != 23675) {
          mf.clearStaticReferences(1);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static void a(byte param0) {
        if (!ai.field_c) {
          throw new IllegalStateException();
        }
        sh.field_t = true;
        if (param0 == -58) {
          ma.a(false, param0 + 58);
          bl.field_a = 0;
          return;
        }
        java.awt.Component var2 = (java.awt.Component) null;
        mf.a(24, (java.awt.Component) null, 34, 123);
        ma.a(false, param0 + 58);
        bl.field_a = 0;
    }

    static {
        field_e = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_b = "End Game";
    }
}
