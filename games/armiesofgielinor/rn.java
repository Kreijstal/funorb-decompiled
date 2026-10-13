/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    static ValidationState validationInvalid;
    static int field_d;
    static ClientUiComponent field_a;
    static int consoleCallKind;
    static String field_b;

    final static void generateProceduralMap(int obfuscationGuard, Battlefield battlefield) {
        if (obfuscationGuard >= -1) {
          return;
        }
        try {
          MovementPlanner.generateProceduralMap((byte) 96, battlefield);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "rn.C(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    static int bitwiseAnd(int left, int right) {
        return left & right;
    }

    final static String b(boolean param0) {
        if (!param0) {
          rn.a(true);
          if (null != mv.localAccountName) {
            return mv.localAccountName;
          }
          return "";
        }
        if (null != mv.localAccountName) {
          return mv.localAccountName;
        }
        return "";
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void openLoginDialog(int obfuscationGuard, String unusedText, boolean showRegistration, boolean offerGuestPlay) {
        try {
          MapRepository.a(true);
          KingBlackDragonEvent.field_C.closeAllDialogs(obfuscationGuard ^ -124);
          ContextActionMenu.loginForm = new LoginForm(IsaacRandom.loginAccountIdentifier, (String) null, fh.field_i, showRegistration, offerGuestPlay);
          if (obfuscationGuard != 3) {
            field_d = -55;
          }
          lt.loginDialog = new StandardContentDialog(KingBlackDragonEvent.field_C, ContextActionMenu.loginForm);
          KingBlackDragonEvent.field_C.showDialog(lt.loginDialog, 0);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "rn.B(" + obfuscationGuard + ',' + (unusedText != null ? "{...}" : "null") + ',' + showRegistration + ',' + offerGuestPlay + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          validationInvalid = null;
          field_b = null;
          field_a = null;
          return;
        }
        String var2 = (String) null;
        rn.openLoginDialog(-107, (String) null, true, true);
        validationInvalid = null;
        field_b = null;
        field_a = null;
    }

    static {
        validationInvalid = new ValidationState();
        field_b = "This structure is not captured";
        consoleCallKind = 3;
    }
}
