/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    static PcmSample field_d;
    static QuickChatDynamicCommand field_b;
    static NameAvailabilityResult field_a;
    static String[] field_c;
    static String field_f;
    static String[] field_e;

    public static void releaseStatics(byte guard) {
        field_b = null;
        field_d = null;
        field_e = null;
        field_a = null;
        field_f = null;
        field_c = null;
        if (guard != 63) {
          co.releaseStatics((byte) -70);
        }
    }

    final static char a(BinaryBitmapFont param0, byte param1) {
        String stackIn_33_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var2_int = 119;
          int var3 = param0.charAdvance((char) var2_int);
          char[] var11 = SpriteStrip.field_k[0];
          char[] var10 = var11;
          char[] var9 = var10;
          char[] var4_ref_char__ = var9;
          if (param1 >= -122) {
            int stackIn_3_0 = 65479;
            return (char) stackIn_3_0;
          }
          for (int var5 = 0; var5 < var11.length; var5++) {
            int var6 = var11[var5];
            if (ml.a((char) var6, 21654)) {
              int var7 = param0.charAdvance((char) var6);
              if (var3 < var7) {
                var3 = var7;
                var2_int = var6;
              }
            }
          }
          char[] var4_ref_char__Lifetime1 = SpriteStrip.field_k[1];
          for (int var5Lifetime1 = 0; var4_ref_char__Lifetime1.length > var5Lifetime1; var5Lifetime1++) {
            int var6Lifetime1 = var4_ref_char__Lifetime1[var5Lifetime1];
            int var7Lifetime1 = param0.charAdvance((char) var6Lifetime1);
            if (ml.a((char) var6Lifetime1, 21654) &&
              var7Lifetime1 > var3) {
              var2_int = var6Lifetime1;
              var3 = var7Lifetime1;
            }
          }
          int var4 = StrongCacheEntry.widestAllowedGlyph((byte) -89, ModalPanel.field_R[0], param0, uj.field_f[0]);
          int var5Lifetime2 = param0.charAdvance((char) var4);
          if (var5Lifetime2 > var3) {
            var3 = var5Lifetime2;
            var2_int = var4;
          }
          int var4Lifetime1 = StrongCacheEntry.widestAllowedGlyph((byte) -63, ModalPanel.field_R[1], param0, uj.field_f[1]);
          int var5Lifetime3 = param0.charAdvance((char) var4Lifetime1);
          if (var5Lifetime3 > var3) {
            var3 = var5Lifetime3;
            var2_int = var4Lifetime1;
          }
          int stackIn_29_0 = var2_int;
          return (char) stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_32_0 = var2;
          StringBuilder stackIn_32_1 = new StringBuilder().append("co.A(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    final static EmailValidationError a(String param0, int param1) {
        String stackIn_14_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          int var2_int = param0.length();
          int var3 = param1;
          while (true) {
            if (var3 >= var2_int) {
              EmailValidationError stackIn_10_0 = CachedTextLayout.field_p;
              return stackIn_10_0;
            }
            int var4 = param0.charAt(var3);
            if (48 > var4) {
              return null;
            }
            if (57 >= var4) {
              var3++;
              continue;
            }
            break;
          }
          Object stackIn_7_0 = null;
          return (EmailValidationError) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var2;
          StringBuilder stackIn_13_1 = new StringBuilder().append("co.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_f = "Type your email address again to make sure it's correct";
        field_b = new QuickChatDynamicCommand(0, 2, 2, 1);
        field_e = new String[]{"Well done, commander. You have secured all the stolen technology stored in the aliens' outer system.", "We are now heading for the centre of the system, where <photo>a moon orbiting a sun-baked planet holds more of our technology.<br><br>This seems to be an important centre for the aliens. <photo>There are several fuel depots. Your ship has been converted to run on alien fuel if necessary.", "Watch out for these items. Land next to them to upgrade your ship.", "Be warned that these caves are defended. These dangerous red cylinders will pull your ship in like a magnet if you get too close."};
    }
}
