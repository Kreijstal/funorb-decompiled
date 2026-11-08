/*
 * Decompiled by CFR-JS 0.4.0.
 */
class LongAndTextLoginPayload extends LoginPayload {
    static String createDisplaynameHint;
    static int field_l;
    private long longValue;
    private String text;
    static int[] field_i;
    static String joinXsGame;
    static int field_h;

    LoginPayloadKind payloadKind(byte param0) {
        int var2 = -3 / ((param0 + 54) / 43);
        return NineSliceFrameSupport.field_b;
    }

    public static void releaseStatics(int param0) {
        joinXsGame = null;
        if (param0 != -1431655766) {
          field_h = -108;
          field_i = null;
          createDisplaynameHint = null;
          return;
        }
        field_i = null;
        createDisplaynameHint = null;
    }

    final void writePayload(byte param0, PacketBuffer param1) {
        try {
          param1.writeLong(this.longValue, (byte) -90);
          int var3_int = 6 % ((param0 - 22) / 51);
          param1.a(this.text, 103);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "se.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int countSetBits(boolean param0, int param1) {
        param1 = (1431655765 & param1) + ((param1 & -1431655766) >>> 1);
        param1 = (param1 & 858993459) + (-1288490189 & param1 >>> 2);
        param1 = 252645135 & (param1 >>> 4) + param1;
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        if (!param0) {
          return 255 & param1;
        }
        createDisplaynameHint = (String) null;
        return 255 & param1;
    }

    LongAndTextLoginPayload(long param0, String param1) {
        try {
          this.longValue = param0;
          this.text = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "se.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = 50;
        createDisplaynameHint = "Player names can be up to 12 letters, numbers and underscores";
        field_i = new int[]{291, 363, 428, 486, 548};
        joinXsGame = "Join <%0>'s game";
    }
}
