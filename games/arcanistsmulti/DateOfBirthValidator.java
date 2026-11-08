/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DateOfBirthValidator extends DebouncedValidator implements TextInputListener, DropdownListener {
    static int[] field_i;
    DateInputWidget field_h;

    final static int hitTestTab(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_int = 0;
          var4 = MembershipOfferScreen.field_r;
          while (var3_int < BevelTextPainter.field_v.length) {
            var5 = CalendarHelpers.field_c[var3_int];
            if (var5 < 0) {
              var4 = var4 + TimeAndInputHelpers.field_a;
            } else {
              var6 = UiTheme.measureText(true, (byte) 29, BevelTextPainter.field_v[var3_int]);
              var4 = var4 + MusicAndClipHelpers.field_c;
              var7 = TextLine.field_l - (var6 >> 1);
              if (ButtonMenuDialog.containsPoint(param0, 30, var4, var6 + (ScreenClearHelpers.field_d << 1), IntrusiveNodeHashTable.field_h + (TutorialCaptionGlobals.field_h << 1), param2, -ScreenClearHelpers.field_d + var7)) {
                stackIn_6_0 = var5;
                return stackIn_6_0;
              }
              var4 = var4 + (IntrusiveNodeHashTable.field_h + MusicAndClipHelpers.field_c + (TutorialCaptionGlobals.field_h << 1));
            }
            var3_int++;
          }
          if (param1 <= 33) {
            field_i = (int[]) null;
          }
          stackIn_13_0 = -1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "bl.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void showEmptyLoginPanel(byte param0) {
        String var2 = (String) null;
        LoginLoadingHelpers.showLoginPanel("", -3, (String) null);
        int var1 = -117 / ((-16 - param0) / 36);
    }

    final static SceneTabbedPanel createQuickChatMenu(boolean param0, SceneWidget param1, SceneWidget param2, QuickChatCategory param3, SceneWidget param4) {
        int var14 = 0;
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        SceneTabbedPanel stackIn_9_0 = null;
        int stackIn_13_0 = 0;
        SceneTabbedPanel stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        SceneTabbedPanel[] var11 = null;
        int var12 = 0;
        QuickChatCategory var13_ref_oo = null;
        int var13 = 0;
        int var15 = 0;
        QuickChatPhrase var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int var12Lifetime1;
        var17 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param3 == null) {
            stackIn_3_0 = null;
            return (SceneTabbedPanel) (stackIn_3_0);
          }
          if (null != param3.field_p) {
            stackIn_7_0 = param3.field_p.length;
          } else {
            stackIn_7_0 = 0;
          }
          var5_int = stackIn_7_0;
          if (!param0) {
            stackIn_9_0 = (SceneTabbedPanel) null;
            return stackIn_9_0;
          }
          if (param3.field_D != null) {
            stackIn_13_0 = param3.field_D.length;
          } else {
            stackIn_13_0 = 0;
          }
          var6 = stackIn_13_0;
          var7 = var5_int + var6;
          var8 = new String[var7];
          var21 = new char[var7];
          var19 = var21;
          var9 = var19;
          var20 = new int[var7];
          var18 = var20;
          var10 = var18;
          var11 = new SceneTabbedPanel[var7];
          if (param3.field_p != null) {
            for (var12 = 0; var12 < param3.field_p.length; var12++) {
              var13_ref_oo = ByteStorage.field_d.getCategory(3, param3.field_p[var12]);
              var8[var12] = var13_ref_oo.field_w;
              var9[var12] = param3.field_n[var12];
              var11[var12] = DateOfBirthValidator.createQuickChatMenu(true, param1, param2, var13_ref_oo, param4);
            }
          }
          if (null != param3.field_D) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            for (var14 = 0; param3.field_D.length > var14; var14++) {
              var15 = param3.field_D[var14];
              if (var15 == -1) {
                var8[var12Lifetime1 + var14] = IntrusiveNodeHashTable.field_j;
                var9[var12Lifetime1 + var14] = param3.field_z[var14];
                var10[var12Lifetime1 + var14] = param3.field_D[var14];
              } else {
                var16 = NameTable.field_d.getDefinition(var15, (byte) -70);
                var8[var14 + var12Lifetime1] = var16.getText(true);
                var9[var12Lifetime1 + var14] = param3.field_z[var14];
                if (var9[var12Lifetime1 + var14] <= 0) {
                  var13 = (char)(var13 + 1);
                  var9[var12Lifetime1 + var14] = (char)var13;
                }
                var10[var14 + var12Lifetime1] = param3.field_D[var14];
              }
            }
          }
          stackIn_28_0 = new SceneTabbedPanel(0L, param2, param4, param1, var11, var20, var8, var21);
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("bl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param3 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param4 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    public final void onTextChanged(EditableTextWidget param0, int param1) {
        try {
          this.restartDebounce(-17444);
          if (param1 != -20626) {
            this.field_h = (DateInputWidget) null;
          }
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "bl.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void onSelectionChanged(DropdownList param0, int param1) {
        try {
          this.restartDebounce(-17444);
          if (param1 != -6509) {
            this.computeState((byte) -51);
          }
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "bl.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean hasPendingReflectionCheck(int param0) {
        int var2 = 0;
        ReflectionCheckRequest var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        ReflectionCheckRequest var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var4 = (ReflectionCheckRequest) (ScreenClearHelpers.field_b.first(12623));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = param0; var2 < var1.field_s; var2++) {
            if (null != var4.field_n[var2] &&
              var4.field_n[var2].field_e == 0) {
              return false;
            }
            if (var4.field_g[var2] != null &&
              var4.field_g[var2].field_e == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var1_ref), "bl.C(" + param0 + ')');
        }
    }

    public final boolean isEmpty(byte param0) {
        if (param0 > -72) {
          this.field_h = (DateInputWidget) null;
        }
        return this.field_h.isIncomplete(-28612);
    }

    public static void releaseStatics(byte param0) {
        int var1 = 48 % ((-29 - param0) / 33);
        field_i = null;
    }

    public final void onTextSubmitted(EditableTextWidget param0, int param1) {
        try {
          if (param1 < 73) {
            this.field_h = (DateInputWidget) null;
          }
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "bl.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void stopEffectStream(PcmSampleStream param0, int param1) {
        try {
          TexturedSpriteHelpers.field_e.removeSubStream(param0);
          if (param1 < 119) {
            PcmSampleStream var3 = (PcmSampleStream) null;
            DateOfBirthValidator.stopEffectStream((PcmSampleStream) null, 64);
          }
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "bl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String computeMessage(boolean param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_h.getDay(68);
          var3 = this.field_h.getMonth(105);
          var4 = this.field_h.getYear(param0);
          var5 = DateHelpers.currentYear(-109);
          if (1890 <= var4 &&
            var4 <= -3 + var5) {
            if (SceneTabStrip.isValidDate(var3, (byte) 119, var4, var2_int)) {
              stackIn_7_0 = null;
              return (String) (stackIn_7_0);
            }
          } else {
            stackIn_4_0 = CachedArchiveProvider.formatTemplate(125, new String[]{"1890", Integer.toString(-3 + var5)}, PairedSceneWidget.field_Kb);
            return stackIn_4_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return NineSliceHelpers.field_d;
    }

    final ValidationState computeState(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        EditableTextWidget var6 = null;
        ValidationState stackIn_2_0 = null;
        ValidationState stackIn_5_0 = null;
        ValidationState stackIn_11_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_h.getDay(69);
          var3 = this.field_h.getMonth(param0 + 134);
          var4 = this.field_h.getYear(true);
          var5 = DateHelpers.currentYear(-26);
          if (1890 > var4) {
            stackIn_2_0 = DateHelpers.field_k;
            return stackIn_2_0;
          }
          if (var4 > -3 + var5) {
            stackIn_5_0 = DateHelpers.field_k;
            return stackIn_5_0;
          }
          if (param0 != -66) {
            var6 = (EditableTextWidget) null;
            this.onTextChanged((EditableTextWidget) null, -112);
          }
          if (!SceneTabStrip.isValidDate(var3, (byte) 115, var4, var2_int)) {
            stackIn_11_0 = DateHelpers.field_k;
            return stackIn_11_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return DateHelpers.field_k;
        }
        return CacheEntry.field_s;
    }

    public DateOfBirthValidator() {
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_i = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((1 & var0) == 1) {
              var0 = -306674912 ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_i[var1] = var0;
        }
    }
}
