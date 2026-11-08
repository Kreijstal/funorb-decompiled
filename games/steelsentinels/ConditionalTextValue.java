/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConditionalTextValue {
    static RgbSprite field_g;
    private boolean field_d;
    static int field_e;
    static boolean field_h;
    static int field_b;
    private String field_f;
    static String field_i;
    static int field_c;
    static boolean field_a;

    final String getText(int param0) {
        if (param0 != 2134230754) {
          field_i = (String) null;
          return this.field_f;
        }
        return this.field_f;
    }

    public static void releaseStatics(int param0) {
        int var1 = 4 / ((param0 + 28) / 39);
        field_g = null;
        field_i = null;
    }

    final static void initializeLoginStack(boolean param0) {
        LoadoutHelpers.field_j = IntrusiveNode.a(125);
        GradientOutlineTextPainter.field_p = new ModalStack();
        ChecksumAndFrameHelpers.showLoginDialog(true, param0, -73);
    }

    ConditionalTextValue(String param0) {
        this(param0, false);
    }

    final static void sendPlayerIdCommand(long param0, int param1, boolean param2) {
        int var5 = 0;
        CipherPacketBuffer var4 = ClockAndCookieHelpers.field_g;
        int var5Lifetime1;
        var4.writeCipheredOpcode(param1, (byte) -117);
        if (!param2) {
          var4.position = var4.position + 1;
          var5 = var4.position;
          var4.writeByte((byte) 115, 6);
          var4.writeLong(-28875, param0);
          var4.backpatchByteLength((byte) -92, -var5 + var4.position);
          return;
        }
        ConditionalTextValue.releaseStatics(-47);
        var4.position = var4.position + 1;
        var5Lifetime1 = var4.position;
        var4.writeByte((byte) 115, 6);
        var4.writeLong(-28875, param0);
        var4.backpatchByteLength((byte) -92, -var5Lifetime1 + var4.position);
    }

    final static int integerSquareRoot(int param0, int param1) {
        int var2 = -124 % ((param1 + 65) / 50);
        if ((long)param0 < 65536L) {
          if ((long)param0 < 256L) {
            if (param0 < 0) {
              return -1;
            }
            return ReportAbuseDialog.field_Xb[param0] >> 12;
          }
          if (4096L > (long)param0) {
            if ((long)param0 >= 1024L) {
              return ReportAbuseDialog.field_Xb[param0 >> 4] >> 10;
            }
            return ReportAbuseDialog.field_Xb[param0 >> 2] >> 11;
          }
          if ((long)param0 < 16384L) {
            return ReportAbuseDialog.field_Xb[param0 >> 6] >> 9;
          }
          return ReportAbuseDialog.field_Xb[param0 >> 8] >> 8;
        }
        if (16777216L > (long)param0) {
          if ((long)param0 < 1048576L) {
            if ((long)param0 >= 262144L) {
              return ReportAbuseDialog.field_Xb[param0 >> 12] >> 6;
            }
            return ReportAbuseDialog.field_Xb[param0 >> 10] >> 7;
          }
          if ((long)param0 >= 4194304L) {
            return ReportAbuseDialog.field_Xb[param0 >> 16] >> 4;
          }
          return ReportAbuseDialog.field_Xb[param0 >> 14] >> 5;
        }
        if ((long)param0 < 268435456L) {
          if ((long)param0 >= 67108864L) {
            return ReportAbuseDialog.field_Xb[param0 >> 20] >> 2;
          }
          return ReportAbuseDialog.field_Xb[param0 >> 18] >> 3;
        }
        if ((long)param0 >= 1073741824L) {
          return ReportAbuseDialog.field_Xb[param0 >> 24];
        }
        return ReportAbuseDialog.field_Xb[param0 >> 22] >> 1;
    }

    ConditionalTextValue(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_f = param0;
          if (this.field_f == null) {
            this.field_f = "";
          }
          stackIn_6_1 = (param1);
          this.field_d = stackIn_6_1;
          if (this.field_f.length() != 0) {
            return;
          }
          this.field_d = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ik.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean isFlagged(byte param0) {
        if (param0 != 51) {
          return true;
        }
        return this.field_d;
    }

    static {
        field_e = 0;
        field_h = false;
        field_c = 50;
        field_i = "The invitation has been withdrawn.";
        field_a = false;
        field_b = 3;
    }
}
