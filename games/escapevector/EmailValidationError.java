/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailValidationError {
    static Sprite[] field_a;
    static SpriteLoadTask field_b;

    public static void releaseStatics(int guard) {
        if (guard != 31167) {
          SpriteLoadTask[] var2 = (SpriteLoadTask[]) null;
          EmailValidationError.a(false, (SpriteLoadTask[]) null);
        }
        field_b = null;
        field_a = null;
    }

    final static boolean a(int param0) {
        if (param0 != 23403) {
          EmailValidationError.releaseStatics(-66);
        }
        return FullscreenFocusCanvas.field_e.ensureMasterIndex(false);
    }

    final static Sprite[] a(boolean param0, SpriteLoadTask[] param1) {
        String stackIn_15_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          if (!nm.a((byte) -73, param1)) {
            Object stackIn_3_0 = null;
            return (Sprite[]) (stackIn_3_0);
          }
          Sprite[] var3 = new Sprite[param1.length];
          if (param0) {
            Sprite[] stackIn_6_0 = (Sprite[]) null;
            return stackIn_6_0;
          }
          for (int var4 = 0; var4 < param1.length; var4++) {
            var3[var4] = param1[var4].loadSprite(94);
          }
          Sprite[] stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var2;
          StringBuilder stackIn_14_1 = new StringBuilder().append("tk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
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
          throw t.a((Throwable) ((Object) var2_ref), "tk.A(" + guard + ',' + opcode + ')');
        }
    }

    static {
        field_a = new Sprite[7];
    }
}
