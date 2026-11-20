/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleCharacterStream {
    private int length;
    static String field_a;
    private String input;
    static int field_d;
    int position;

    final char readChar(int param0) {
        int fieldTemp$0 = 0;
        if (param0 <= -75) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return this.input.charAt(fieldTemp$0);
        }
        this.position = -65;
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return this.input.charAt(fieldTemp$1);
    }

    public final String toString() {
        return this.input.substring(0, this.position) + "|" + this.input.substring(this.position);
    }

    final boolean isAtEnd(byte param0) {
        if (param0 <= -102) {
          return this.length <= this.position ? true : false;
        }
        this.readChar(-42);
        return this.length <= this.position ? true : false;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 0) {
          ConsoleCharacterStream.usesTeamRules(107, -118);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean usesTeamRules(int param0, int param1) {
        if (param0 <= 32) {
          field_a = (String) null;
          if (param1 == 11) {
            return false;
          }
          if (param1 != 13) {
            return true;
          }
          return false;
        }
        if (param1 == 11) {
          return false;
        }
        if (param1 != 13) {
          return true;
        }
        return false;
    }

    ConsoleCharacterStream(String param0) {
        this.position = 0;
        try {
          this.input = param0;
          this.length = this.input.length();
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "qab.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "This password contains repeated characters, and would be easy to guess";
        field_d = 1024;
    }
}
