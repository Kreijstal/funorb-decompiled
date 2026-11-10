/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    static boolean field_g;
    private java.nio.ByteBuffer field_h;
    static ReportAbuseDialog field_i;
    static String field_j;
    static String field_k;

    final byte[] getBytes(int param0) {
        int var2 = 82 / ((-69 - param0) / 36);
        byte[] var3 = new byte[this.field_h.capacity()];
        this.field_h.position(0);
        this.field_h.get(var3);
        return var3;
    }

    final static Sprite[] createSolidFrameSprites(int param0, int param1, byte param2) {
        if (param2 != 28) {
          field_i = (ReportAbuseDialog) null;
          return PortalView.createSolidFrameSprites((byte) -112, param0, 1, param1);
        }
        return PortalView.createSolidFrameSprites((byte) -112, param0, 1, param1);
    }

    final void setBytes(byte[] param0, byte param1) {
        try {
          this.field_h = java.nio.ByteBuffer.allocateDirect(param0.length);
          if (param1 > -68) {
            DirectByteStorage.createSolidFrameSprites(112, 60, (byte) -105);
          }
          this.field_h.position(0);
          this.field_h.put(param0);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "bk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void readUsernameParameter(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param0.getParameter("username");
          if (param1 != -17708) {
            return;
          }
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (QuitPageHelpers.encodeBase37(param1 + 17708, var3) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("bk.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_i = null;
        field_j = null;
        if (param0 != 4912) {
          field_i = (ReportAbuseDialog) null;
          field_k = null;
          return;
        }
        field_k = null;
    }

    DirectByteStorage() {
    }

    static {
        field_k = "Loading patches";
        field_j = "You can join this game";
    }
}
