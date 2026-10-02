/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static String loadingFontsText;

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          kc.a((java.awt.Component) ((Object) param1), 0);
          df.a(false, (java.awt.Component) ((Object) param1));
          if (param0 != -2) {
            loadingFontsText = (String) null;
          }
          if (null == vc.field_f) {
            return;
          }
          vc.field_f.a((java.awt.Component) ((Object) param1), (byte) 83);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var2);

          stackIn_7_1 = new StringBuilder().append("nb.B(").append(param0).append(',');

          if (param1 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void spawnEntityAtPointer(int param0, int pointerX, int categoryId, int pointerY, int variantId, boolean specialKinds) {
        GameplayEntity var6;
        double var7;
        double var9;
        int var11;
        int var12;
        GameplayEntity stackIn_17_0;
        int stackIn_17_1;
        float stackIn_17_2;
        int stackIn_17_3;
        float stackIn_17_4;
        GameplayEntity stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        float stackIn_18_2 = 0.0f;
        int stackIn_18_3 = 0;
        float stackIn_18_4 = 0.0f;
        int stackIn_18_5 = 0;
        int stackIn_21_6;
        float stackIn_21_7;
        float stackIn_21_8;
        float stackIn_21_9;
        GameplayEntity stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        float stackIn_23_2 = 0.0f;
        int stackIn_23_3 = 0;
        float stackIn_23_4 = 0.0f;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        float stackIn_23_7 = 0.0f;
        float stackIn_23_8 = 0.0f;
        float stackIn_23_9 = 0.0f;
        int stackIn_23_10 = 0;
        if (param0 != -28195) {
          return;
        }
        var6 = (GameplayEntity) ((Object) ra.availableEntities.removeLast(1));
        if (var6 == null) {
          return;
        }
        var7 = (double)(-320 + pointerX);
        var9 = (double)(-240 + pointerY);
        pointerX = (int)(320.0 + (var7 * Math.cos((double)(-el.gameplaySession.boardAngleRadians)) - var9 * Math.sin((double)(-el.gameplaySession.boardAngleRadians))));
        pointerY = (int)(Math.sin((double)(-el.gameplaySession.boardAngleRadians)) * var7 + Math.cos((double)(-el.gameplaySession.boardAngleRadians)) * var9 + 240.0);
        if (!specialKinds) {
          var6.initializeEntityMotion(-75, (float)pointerX, 0, (float)(-pointerX + 320), variantId, 0, 0.0f, (float)pointerY, (float)(-pointerY + 240), categoryId, 0.0f);
          var6.entityQueue = null;
          ji.movingEntities.addLast(param0 ^ 28286, var6);
          return;
        }
        var11 = (variantId + categoryId) % 4;
        var12 = 0;
        if (var11 == 0) {
          var12 = 2;
        }
        if (var11 == 1) {
          var12 = 4;
        }
        if (var11 == 2) {
          var12 = 3;
        }
        if (3 == var11) {
          var12 = 1;
        }
        stackIn_17_0 = (GameplayEntity) (var6);

        stackIn_17_1 = param0 + 28113;

        stackIn_17_2 = (float)pointerX;

        stackIn_17_3 = var12;

        stackIn_17_4 = (float)(320 - pointerX);

        if (var12 != 2) {
          stackIn_18_0 = (GameplayEntity) ((Object) stackIn_17_0);
          stackIn_18_1 = stackIn_17_1;
          stackIn_18_2 = stackIn_17_2;
          stackIn_18_3 = stackIn_17_3;
          stackIn_18_4 = stackIn_17_4;
          stackIn_18_5 = -1;
        } else {
          stackIn_18_0 = (GameplayEntity) ((Object) stackIn_17_0);
          stackIn_18_1 = stackIn_17_1;
          stackIn_18_2 = stackIn_17_2;
          stackIn_18_3 = stackIn_17_3;
          stackIn_18_4 = stackIn_17_4;
          stackIn_18_5 = variantId;
        }
        L5: {
          stackIn_18_0 = (GameplayEntity) ((Object) stackIn_18_0);

          stackIn_21_6 = 0;

          stackIn_21_7 = 0.0f;

          stackIn_21_8 = (float)pointerY;

          stackIn_21_9 = (float)(-pointerY + 240);

          if (var12 != 2) {




















            if (1 != var12) {
              stackIn_23_0 = (GameplayEntity) ((Object) stackIn_18_0);
              stackIn_23_1 = stackIn_18_1;
              stackIn_23_2 = stackIn_18_2;
              stackIn_23_3 = stackIn_18_3;
              stackIn_23_4 = stackIn_18_4;
              stackIn_23_5 = stackIn_18_5;
              stackIn_23_6 = stackIn_21_6;
              stackIn_23_7 = stackIn_21_7;
              stackIn_23_8 = stackIn_21_8;
              stackIn_23_9 = stackIn_21_9;
              stackIn_23_10 = -1;
              break L5;
            }
            stackIn_18_0 = (GameplayEntity) ((Object) stackIn_18_0);









          }
          stackIn_23_0 = (GameplayEntity) ((Object) stackIn_18_0);
          stackIn_23_1 = stackIn_18_1;
          stackIn_23_2 = stackIn_18_2;
          stackIn_23_3 = stackIn_18_3;
          stackIn_23_4 = stackIn_18_4;
          stackIn_23_5 = stackIn_18_5;
          stackIn_23_6 = stackIn_21_6;
          stackIn_23_7 = stackIn_21_7;
          stackIn_23_8 = stackIn_21_8;
          stackIn_23_9 = stackIn_21_9;
          stackIn_23_10 = categoryId;
        }
        ((GameplayEntity) (Object) stackIn_23_0).initializeEntityMotion(stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_23_4, stackIn_23_5, stackIn_23_6, stackIn_23_7, stackIn_23_8, stackIn_23_9, stackIn_23_10, 0.0f);
        var6.entityQueue = null;
        ji.movingEntities.addLast(param0 ^ 28286, var6);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = Geoblox.field_C;
        if (param10 != -2) {
            return;
        }
        if (param4 <= param7) {
            if (param15 > param7) {
                SpriteState.a(param3, param11, param13, param1, param15, param9, param2, param0, param4, param14, param6, SoftwareRasterizer.framebuffer, param12, param8, param5, param7, -1275583984);
                return;
            }
            if (param15 > param4) {
                SpriteState.a(param1, param11, param13, param3, param7, param0, param6, param9, param4, param8, param2, SoftwareRasterizer.framebuffer, param12, param14, param5, param15, -1275583984);
                return;
            }
            SpriteState.a(param1, param2, param8, param12, param7, param0, param6, param5, param15, param13, param11, SoftwareRasterizer.framebuffer, param3, param14, param9, param4, -1275583984);
            return;
        }
        if (param4 < param15) {
            SpriteState.a(param3, param6, param14, param12, param15, param9, param2, param5, param7, param13, param11, SoftwareRasterizer.framebuffer, param1, param8, param0, param4, param10 ^ 1275583982);
            return;
        }
        if (param15 > param7) {
            SpriteState.a(param12, param6, param14, param3, param4, param5, param11, param9, param7, param8, param2, SoftwareRasterizer.framebuffer, param1, param13, param0, param15, -1275583984);
            return;
        }
        SpriteState.a(param12, param2, param8, param1, param4, param5, param11, param0, param15, param14, param6, SoftwareRasterizer.framebuffer, param3, param13, param9, param7, -1275583984);
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            loadingFontsText = (String) null;
            if (rb.field_d == null) {
                return false;
            }
            if (rb.field_d.a(-119)) {
                return true;
            }
            return false;
        }
        if (rb.field_d == null) {
            return false;
        }
        if (rb.field_d.a(-119)) {
            return true;
        }
        return false;
    }

    public static void a(int param0) {
        if (param0 >= -80) {
            nb.a(108);
            loadingFontsText = null;
            return;
        }
        loadingFontsText = null;
    }

    static {
        loadingFontsText = "Loading fonts";
    }
}
