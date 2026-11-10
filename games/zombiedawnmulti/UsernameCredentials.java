/*
 * Decompiled by CFR-JS 0.4.0.
 */
class UsernameCredentials extends LoginCredentials {
    private long field_p;
    static IndexedSprite[] field_q;
    static boolean field_n;
    static String field_o;
    private String field_m;

    public static void releaseStatics(boolean param0) {
        field_o = null;
        field_q = null;
        if (param0) {
          UsernameCredentials.releaseStatics(true);
        }
    }

    CredentialKind getCredentialKind(int param0) {
        if (param0 != 7) {
          field_o = (String) null;
          return ArrayWidgetGroup.field_G;
        }
        return ArrayWidgetGroup.field_G;
    }

    UsernameCredentials(long param0, String param1) {
        try {
          this.field_p = param0;
          this.field_m = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void writeTo(PacketBuffer param0, int param1) {
        try {
          param0.writeLong(this.field_p, true);
          if (param1 != -1) {
            this.getCredentialKind(-111);
          }
          param0.writeBase38Name(13066, this.field_m);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pp.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_o = "Make humans or enemy zombies heavy with their burdens, slowing them down. Then, move in for the kill!";
    }
}
