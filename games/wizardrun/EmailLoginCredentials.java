/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailLoginCredentials extends LoginCredentials {
    static MidiTrack field_l;
    static int field_i;
    private String email;
    static String field_g;
    static String field_h;
    private String password;

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ThrowableFormattingHelpers.a((java.awt.Component) ((Object) param0), (byte) 96);
          StyleNode.detachMouseListeners((java.awt.Component) ((Object) param0), 6769);
          if (MessagePanel.field_K != null) {
            MessagePanel.field_K.detach((java.awt.Component) ((Object) param0), param1 ^ -8058);
          }
          if (param1 == 8053) {
            return;
          }
          EmailLoginCredentials.getDiscardAlternativePrefix(false, -94, false, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ka.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String getDiscardAlternativePrefix(boolean param0, int param1, boolean param2, boolean param3) {
        int var4;
        var4 = 0;
        if (param0) {
          var4 += 4;
        }
        if (param2) {
          var4 += 2;
        }
        if (param1 != 2) {
          EmailLoginCredentials.releaseStatics(-47);
        }
        if (param3) {
          var4++;
        }
        return IntrusiveDeque.field_e[var4];
    }

    public static void releaseStatics(int param0) {
        if (param0 <= -24) {
          field_h = null;
          field_l = null;
          field_g = null;
          return;
        }
        EmailLoginCredentials.getDiscardAlternativePrefix(false, 106, false, false);
        field_h = null;
        field_l = null;
        field_g = null;
    }

    final LoginCredentialKind getCredentialKind(boolean param0) {
        if (!param0) {
          this.getCredentialKind(true);
          return Js5Index.field_v;
        }
        return Js5Index.field_v;
    }

    final void writeCredentials(int param0, PacketBuffer param1) {
        try {
          if (param0 != 4) {
            field_h = (String) null;
          }
          param1.writePrefixedCp1252String(0, this.email);
          param1.writeBase38Name(this.password, -66);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ka.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    EmailLoginCredentials(String param0, String param1) {
        try {
          this.password = param1;
          this.email = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "To Customer Support";
        field_g = "Press <%0> or SPACE";
    }
}
