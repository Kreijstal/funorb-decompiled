/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static int field_b;
    static String loginMessage2Text;
    static String field_c;
    static String field_a;
    static String fullscreenAfterCancelText;

    final static boolean a(boolean param0, int param1) {
        if (param0) {
            return (param1 & -param1) == param1 ? true : false;
        }
        return true;
    }

    final static boolean scratchSpriteOverlapsBoard(GameplayEntity diagnosticEntity, float diagnosticBoardAngleRadians, int methodGuard) {
        RuntimeException boardOverlapFailureForContext = null;
        boolean overlapFound = false;
        RuntimeException boardOverlapFailureBeforeEntityDescription = null;
        StringBuilder boardOverlapMessagePrefix = null;
        RuntimeException boardOverlapFailureAtEntityDescription = null;
        StringBuilder boardOverlapMessageAtEntityDescription = null;
        String entityArgumentDescription = null;
        RuntimeException caughtBoardOverlapFailure = null;
        try {
          if (methodGuard == 0) {
            overlapFound = PixelOverlapProbe.findFirstNonzeroPixelOverlap(vf.spriteScratchRaster, -(vf.spriteScratchRaster.fullWidth >> 1) + ng.rotatedEntityScreenX, -(vf.spriteScratchRaster.fullHeight >> 1) + td.rotatedEntityScreenY, bk.boardOwnershipRaster, 0, 0);
            return overlapFound;
          }
          return false;
        } catch (java.lang.RuntimeException boardOverlapFailure) {
          caughtBoardOverlapFailure = boardOverlapFailure;
          boardOverlapFailureForContext = caughtBoardOverlapFailure;
          boardOverlapFailureBeforeEntityDescription = (RuntimeException) (boardOverlapFailureForContext);

          boardOverlapMessagePrefix = new StringBuilder().append("uj.C(");

          if (diagnosticEntity == null) {
            boardOverlapFailureAtEntityDescription = (RuntimeException) ((Object) boardOverlapFailureBeforeEntityDescription);
            boardOverlapMessageAtEntityDescription = (StringBuilder) ((Object) boardOverlapMessagePrefix);
            entityArgumentDescription = "null";
          } else {
            boardOverlapFailureAtEntityDescription = (RuntimeException) ((Object) boardOverlapFailureBeforeEntityDescription);
            boardOverlapMessageAtEntityDescription = (StringBuilder) ((Object) boardOverlapMessagePrefix);
            entityArgumentDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) boardOverlapFailureAtEntityDescription), ((StringBuilder) (Object) boardOverlapMessageAtEntityDescription).append(entityArgumentDescription).append(',').append(diagnosticBoardAngleRadians).append(',').append(methodGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        fullscreenAfterCancelText = null;
        loginMessage2Text = null;
        field_c = null;
        field_a = null;
        if (param0 > 0) {
            uj.a(false, -95);
        }
    }

    final static String[] a(char param0, boolean param1, String param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        String[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = (CharSequence) ((Object) param2);
          var3_int = cg.a(var9, param1, param0);
          var4 = new String[1 + var3_int];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var3_int > var7; var7++) {
            for (var8 = var6; param2.charAt(var8) != param0; var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param2.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param2.substring(var6);
          stackIn_7_0 = (String[]) (var4);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var3);

          stackIn_10_1 = new StringBuilder().append("uj.D(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = 0;
        loginMessage2Text = "Error connecting to server. Please try using a different server.";
        field_c = "Harvesting Pumpkin";
        field_a = "Starting Game";
        fullscreenAfterCancelText = "to return to the normal view.";
    }
}
