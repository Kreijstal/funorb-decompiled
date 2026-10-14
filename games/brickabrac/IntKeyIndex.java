/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntKeyIndex {
    static String field_d;
    static String field_a;
    static ta field_c;
    static RgbSprite[] chocCentreSprites;
    static int field_b;
    private int[] entries;

    final static boolean a(int param0, int param1) {
        if (param1 != 0) {
          chocCentreSprites = (RgbSprite[]) null;
        }
        return param0 >= 2 ? true : false;
    }

    final static AccountResponse a(int param0, String[] param1) {
        AccountResponse var2 = null;
        RuntimeException var2_ref = null;
        AccountResponse stackIn_2_0 = null;
        AccountResponse stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new AccountResponse(false);
          var2.suggestedUsernames = param1;
          if (param0 == -2079) {
            stackIn_4_0 = var2;
            return stackIn_4_0;
          }
          stackIn_2_0 = (AccountResponse) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("lm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        chocCentreSprites = null;
        field_c = null;
        field_a = null;
        if (!param0) {
          IntKeyIndex.a(true);
        }
    }

    final static void a(int param0) {
        t.field_g = false;
        NanoGameClock.field_l = false;
        CheckboxWidgetRenderer.a(param0, true);
        MusicVoice.field_l = ej.field_P;
        ik.field_g = ej.field_P;
    }

    final static boolean a(byte param0) {
        if (param0 != -10) {
          IntKeyIndex.a((byte) 35);
        }
        return null != IntArrayRequest.gameplayScreen ? true : false;
    }

    final int findIndex(int key, byte obfuscationGuard) {
        int bucketMask;
        int bucket;
        int originalIndex;
        if (obfuscationGuard >= -68) {
          IntKeyIndex.a(47);
        }
        bucketMask = -1 + (this.entries.length >> 1);
        bucket = bucketMask & key;
        while (true) {
          originalIndex = this.entries[bucket + bucket + 1];
          if (-1 == originalIndex) {
            return -1;
          }
          if (key == this.entries[bucket + bucket]) {
            return originalIndex;
          }
          bucket = bucketMask & bucket + 1;
        }
    }

    IntKeyIndex(int[] keys) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while ((keys.length >> 1) + keys.length >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.entries = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.entries[var3] = -1;
          }
          for (var3Lifetime1 = 0; keys.length > var3Lifetime1; var3Lifetime1++) {
            for (var4 = keys[var3Lifetime1] & -1 + var2_int; this.entries[var4 + (var4 + 1)] != -1; var4 = var4 + 1 & var2_int - 1) {
            }
            this.entries[var4 + var4] = keys[var3Lifetime1];
            this.entries[var4 + (var4 + 1)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("lm.<init>(");
          if (keys == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_d = "<%0> has entered a game.";
        field_b = 4;
        field_a = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
