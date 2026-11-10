/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailLoginCredentials extends LoginCredentials {
    static int field_p;
    private String field_r;
    static String field_q;
    static String field_n;
    static int field_m;
    static String field_s;
    private String field_o;

    final CredentialKind getCredentialKind(int param0) {
        if (param0 != 7) {
          PacketBuffer var3 = (PacketBuffer) null;
          this.writeTo((PacketBuffer) null, -78);
          return BrowserPageHelpers.field_b;
        }
        return BrowserPageHelpers.field_b;
    }

    public static void releaseStatics(int param0) {
        field_s = null;
        field_q = null;
        field_n = null;
        if (param0 != 3) {
          EmailLoginCredentials.releaseStatics(96);
        }
    }

    final void writeTo(PacketBuffer param0, int param1) {
        try {
          if (param1 != -1) {
            field_q = (String) null;
          }
          param0.writeVersionedString(-16171, this.field_r);
          param0.writeBase38Name(param1 ^ -13067, this.field_o);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "mn.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    EmailLoginCredentials(String param0, String param1) {
        try {
          this.field_r = param0;
          this.field_o = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "mn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = 200;
        field_q = "Honour";
        field_m = 3;
        field_n = "Seriously offensive language";
        field_s = "Enough playing around.";
    }
}
