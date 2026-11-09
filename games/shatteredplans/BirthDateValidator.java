/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BirthDateValidator extends DebouncedValidator implements TextFieldListener, DateValidatorMarker {
    DateInputWidget input;
    static String field_j;
    static String field_l;
    static String field_n;
    static String field_k;
    static int[] field_i;

    public final void onTextChanged(TextFieldWidget param0, int param1) {
        try {
          if (param1 != 95) {
            this.isEmpty(25);
          }
          this.notifyChanged(param1 - 158);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ja.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void clearStatics(byte param0) {
        field_i = null;
        if (param0 <= 123) {
          BirthDateValidator.clearStatics((byte) 15);
        }
        field_l = null;
        field_n = null;
        field_k = null;
        field_j = null;
    }

    final static void a(int param0, int param1, Sprite param2, int param3) {
        int var9 = 0;
        int var10 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var11 = 0;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = -1;
          var5 = param2.field_z;
          var6 = param1;
          if (-param1 + var5 > var6) {
            var6 = -param1 + var5;
          }
          var7 = param2.field_w;
          if (param0 != -174137048) {
            return;
          }
          var8 = param3;
          if (var8 < -param3 + var7) {
            var8 = var7 - param3;
          }
          for (var9 = 0; var9 < var7; var9++) {
            for (var10 = 0; var5 > var10; var10++) {
              var4_int++;
              var11 = param2.field_B[var4_int];
              if (var11 != 0) {
                var12 = (float)((-param1 + var10) * (var10 - param1) + (-param3 + var9) * (-param3 + var9));
                var12 = var12 / (float)(var8 * var8 + var6 * var6);
                var13 = (int)(256.0f * (-(float)Math.sqrt((double)var12) + 1.0f));
                if (var13 <= 0) {
                  param2.field_B[var4_int] = 1;
                } else {
                  if (var13 <= 255) {
                    var14 = var11 & 16711935;
                    var14 = var14 * var13;
                    var15 = 65280 & var11;
                    var15 = var15 * var13;
                    var11 = (16711680 & var15 | -16711936 & var14) >>> 8;
                    stackIn_21_0 = param2.field_B;
                    stackIn_21_1 = var4_int;
                    if (var11 == 0) {
                      stackIn_22_2 = 1;
                    } else {
                      stackIn_22_2 = var11;
                    }
                    stackIn_21_0[stackIn_21_1] = stackIn_22_2;
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("ja.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    final String computeMessage(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        TextFieldWidget var6 = null;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.input.day(false);
          var3 = this.input.monthIndex((byte) 119);
          if (param0 < 61) {
            var6 = (TextFieldWidget) null;
            this.onTextChanged((TextFieldWidget) null, 80);
          }
          var4 = this.input.year(115);
          var5 = BattleSnapshot.getCurrentYear(-13299);
          if (1890 <= var4 &&
            var4 <= -3 + var5) {
            if (tg.a(var2_int, var3, (byte) -126, var4)) {
              stackIn_9_0 = null;
              return (String) (stackIn_9_0);
            }
          } else {
            stackIn_6_0 = QuickChatCategoryRegistry.a(PlayerStats.field_b, 4371, new String[]{"1890", Integer.toString(var5 - 3)});
            return stackIn_6_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return LoginForm.field_M;
    }

    public BirthDateValidator() {
    }

    final ValidationState computeState(boolean param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ValidationState stackIn_3_0 = null;
        ValidationState stackIn_7_0 = null;
        ValidationState stackIn_10_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.input.day(param0);
          var3 = this.input.monthIndex((byte) 108);
          var4 = this.input.year(66);
          var5 = BattleSnapshot.getCurrentYear(-13299);
          if (1890 > var4) {
            stackIn_3_0 = ArchiveSourceManager.field_b;
            return stackIn_3_0;
          }
          if (-3 + var5 < var4) {
            stackIn_7_0 = ArchiveSourceManager.field_b;
            return stackIn_7_0;
          }
          if (!tg.a(var2_int, var3, (byte) -127, var4)) {
            stackIn_10_0 = ArchiveSourceManager.field_b;
            return stackIn_10_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return ArchiveSourceManager.field_b;
        }
        return CachedArchiveSource.field_g;
    }

    public final void onEnter(int param0, TextFieldWidget param1) {
        try {
          if (param0 != 4340) {
            field_l = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ja.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean isEmpty(int param0) {
        if (param0 != 16647) {
          return true;
        }
        return this.input.hasIncompleteDate(-107);
    }

    static {
        field_k = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_n = "Fleets";
        field_l = "<%0> has been removed.";
    }
}
