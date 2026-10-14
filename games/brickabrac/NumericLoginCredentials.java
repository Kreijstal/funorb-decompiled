/*
 * Decompiled by CFR-JS 0.4.0.
 */
class NumericLoginCredentials extends LoginCredentials {
    private long identifier;
    private String password;
    static boolean repeatMessageAvailable;

    final static LoginMethodPreference[] b(int param0) {
        if (param0 == 140) {
          return new LoginMethodPreference[]{EmailConfirmationValidator.field_k, ll.field_d, LinkWidgetRenderer.field_c};
        }
        return (LoginMethodPreference[]) null;
    }

    final void writeCredentials(int obfuscationGuard, PacketBuffer packet) {
        if (obfuscationGuard != 0) {
          return;
        }
        try {
          packet.writeLong(-23054, this.identifier);
          packet.writeBase38Name(false, this.password);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bo.B(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    NumericLoginCredentials(long identifier, String password) {
        try {
          this.password = password;
          this.identifier = identifier;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bo.<init>(" + identifier + ',' + (password != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, String param1) {
        try {
          VerticalScrollbar.a(243, param1, 140, ContextActionController.field_g, -15531, 2);
          if (param0 <= 93) {
            NumericLoginCredentials.b(99);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bo.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    LoginCredentialKind getCredentialKind(int obfuscationGuard) {
        if (obfuscationGuard != 13) {
          return (LoginCredentialKind) null;
        }
        return MembershipBenefitsScreen.numericLoginKind;
    }

    static {
        repeatMessageAvailable = false;
    }
}
