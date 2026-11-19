/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScoreSubmission extends IntrusiveNode {
    int field_i;
    static String field_s;
    int[] field_q;
    int field_p;
    static String field_j;
    long field_n;
    int field_k;
    int field_m;
    int field_t;
    int field_l;
    int field_o;
    static String field_r;

    public static void releaseStatics(int param0) {
        field_j = null;
        field_s = null;
        if (param0 != 65535) {
          return;
        }
        field_r = null;
    }

    final static void showLoginDialog(boolean param0, byte param1, String param2, boolean param3) {
        try {
          LoginChoicePanel.h((byte) 98);
          GameShell.field_A.hideAllDialogs(false);
          TimedValidator.field_b = new LoginForm(ResizableDialog.field_S, (String) null, DialogLayer.field_J, param0, param3);
          int var4_int = -71 % ((param1 - 89) / 37);
          KeyboardShutdownHelpers.field_f = new StandardContentTransitionDialog(GameShell.field_A, TimedValidator.field_b);
          GameShell.field_A.showDialog((UiWidget) (KeyboardShutdownHelpers.field_f), (byte) 117);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ai.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    ScoreSubmission(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
          this.field_l = param3;
          this.field_o = param1;
          this.field_m = param4;
          this.field_q = param6;
          fieldTemp$0 = ArchiveContainerHelpers.field_c;
          ArchiveContainerHelpers.field_c = ArchiveContainerHelpers.field_c + 1;
          this.field_i = fieldTemp$0 & 65535;
          this.field_k = param2;
          this.field_p = param5;
          this.field_t = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ai.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Login: ";
        field_r = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_s = "a score in this game.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void openLoginDialogWithIntGuard(boolean param0, int param1, String param2, boolean param3) {
        try {
          LoginChoicePanel.h((byte) 98);
          GameShell.field_A.hideAllDialogs(false);
          TimedValidator.field_b = new LoginForm(ResizableDialog.field_S, (String) null, DialogLayer.field_J, param0, param3);
          int var4_int = -71 % ((param1 - 89) / 37);
          KeyboardShutdownHelpers.field_f = new StandardContentTransitionDialog(GameShell.field_A, TimedValidator.field_b);
          GameShell.field_A.showDialog((UiWidget) (KeyboardShutdownHelpers.field_f), (byte) 117);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ai.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }
}
