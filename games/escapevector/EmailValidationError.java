/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailValidationError {
    static Sprite[] field_a;
    static SpriteLoadTask field_b;

    public static void releaseStatics(int guard) {
        if (guard != 31167) {
          SpriteLoadTask[] var2 = (SpriteLoadTask[]) null;
          EmailValidationError.spritesFromTasks(false, (SpriteLoadTask[]) null);
        }
        field_b = null;
        field_a = null;
    }

    final static boolean ensureMasterIndex(int guard) {
        if (guard != 23403) {
          EmailValidationError.releaseStatics(-66);
        }
        return FullscreenFocusCanvas.field_e.ensureMasterIndex(false);
    }

    final static Sprite[] spritesFromTasks(boolean guard, SpriteLoadTask[] tasks) {
        String stackIn_15_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          if (!ConnectionSupport.loadAllSpriteTasks((byte) -73, tasks)) {
            Object stackIn_3_0 = null;
            return (Sprite[]) (stackIn_3_0);
          }
          Sprite[] var3 = new Sprite[tasks.length];
          if (guard) {
            Sprite[] stackIn_6_0 = (Sprite[]) null;
            return stackIn_6_0;
          }
          for (int var4 = 0; var4 < tasks.length; var4++) {
            var3[var4] = tasks[var4].loadSprite(94);
          }
          Sprite[] stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var2;
          StringBuilder stackIn_14_1 = new StringBuilder().append("tk.D(").append(guard).append(',');
          if (tasks == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void resendAchievementRequests(int guard, int opcode) {
        int var4 = EscapeVector.obfuscationControl;
        try {
          AchievementRecord var5 = (AchievementRecord) (RasterSnapshot.field_l.first(false));
          int var3 = -57 / ((-46 - guard) / 51);
          while (var5 != null) {
            DebouncedValidator.writeAchievementRecord(var5, opcode, true);
            var5 = (AchievementRecord) (RasterSnapshot.field_l.next((byte) 70));
          }
          IntrusiveNode var2 = SavedDataQuerySupport.field_b.first(false);
          while (var2 != null) {
            DirectByteStorage.writeAchievementQuery(opcode, 122);
            var2 = SavedDataQuerySupport.field_b.next((byte) 70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2_ref), "tk.A(" + guard + ',' + opcode + ')');
        }
    }

    static {
        field_a = new Sprite[7];
    }
}
