/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountConnectionState {
    static int field_a;

    final static void notifyBrowserResize(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          if (param0 != 0) {
            AccountConnectionState.notifyBrowserResize(93, 80);
          }
          try {
            BrowserScriptBridge.call(new Object[]{new Integer(param1)}, "resizing", param0 + 30383, DisplayNameValidator.getActiveApplet(1));
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean canCommunicate(int param0) {
        if (param0 != 0) {
          return false;
        }
        if (MarkerSliderWidget.field_F == this) {
          return true;
        }
        if (this == DateFormattingHelpers.field_b) {
          return true;
        }
        if (BufferedSocket.field_l != this) {
          return false;
        }
        return true;
    }

    final static NameAvailabilityRequest createNameSuggestions(String[] args, byte param1) {
        NameAvailabilityRequest var2 = null;
        RuntimeException var2_ref = null;
        NameAvailabilityRequest stackIn_2_0 = null;
        NameAvailabilityRequest stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new NameAvailabilityRequest(false);
          var2.suggestions = args;
          if (param1 < -63) {
            stackIn_4_0 = var2;
            return stackIn_4_0;
          }
          stackIn_2_0 = (NameAvailabilityRequest) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("rc.C(");
          if (args == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = 0;
        IntrusiveDeque discarded$0 = new IntrusiveDeque();
    }
}
