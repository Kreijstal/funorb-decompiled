/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextAndNameCredentials extends LoginCredentials {
    static int field_e;
    static Sprite[] field_b;
    private String field_c;
    private String field_f;
    static String field_g;
    static int field_d;

    final static PendingIntArrayRequest requestIntArray(int param0, int param1) {
        PendingIntArrayRequest var2 = null;
        PendingIntArrayRequest var2Lifetime1;
        if (param0 >= 62) {
          var2 = new PendingIntArrayRequest();
          ScrollContainer.field_J.addFirst(0, var2);
          ByteRequestWriter.sendByteRequest(2, param1);
          return var2;
        }
        field_g = (String) null;
        var2Lifetime1 = new PendingIntArrayRequest();
        ScrollContainer.field_J.addFirst(0, var2Lifetime1);
        ByteRequestWriter.sendByteRequest(2, param1);
        return var2Lifetime1;
    }

    final static boolean isCurrentUser(int param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 56) {
            return false;
          }
          var3 = (CharSequence) ((Object) param1);
          stackIn_4_0 = FullscreenMembershipDialog.field_T.equals(CheckboxWidget.normalizeDisplayName(var3, -48));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("l.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void writePayload(boolean param0, PacketBuffer param1) {
        try {
          if (param0) {
            java.awt.Component var4 = (java.awt.Component) null;
            TextAndNameCredentials.createRasterBuffer(-71, 119, (java.awt.Component) null, -102);
          }
          param1.writeTerminatedStringWithHeader((byte) -88, this.field_f);
          param1.writeBase38Name(this.field_c, (byte) 95);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "l.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final LoginPayloadKind payloadKind(byte param0) {
        if (param0 != -102) {
          field_b = (Sprite[]) null;
          return LinkTextPainter.field_a;
        }
        return LinkTextPainter.field_a;
    }

    final static RasterBuffer createRasterBuffer(int param0, int param1, java.awt.Component param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          RasterBuffer var5 = null;
          ImageProducerRasterBuffer var5_ref = null;
          RasterBuffer stackIn_3_0 = null;
          ImageProducerRasterBuffer stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 != -1) {
                field_b = (Sprite[]) null;
              }
              var4 = Class.forName("BufferedImageRasterBuffer");
              var5 = (RasterBuffer) (var4.newInstance());
              var5.initialize(param1, param3, param2, -11055);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ImageProducerRasterBuffer();
              ((RasterBuffer) ((Object) var5_ref)).initialize(param1, param3, param2, -11055);
              stackIn_5_0 = var5_ref;
              return (RasterBuffer) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("l.I(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        field_b = null;
        if (param0 != -1) {
          TextAndNameCredentials.releaseStatics(19);
        }
    }

    TextAndNameCredentials(String param0, String param1) {
        try {
          this.field_c = param1;
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = -1;
        field_d = -1;
    }
}
