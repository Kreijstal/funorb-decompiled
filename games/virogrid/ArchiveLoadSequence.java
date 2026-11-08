/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveLoadSequence {
    private TextMetricsGlobals[] field_g;
    private int field_e;
    String field_j;
    static PlatformTaskDispatcher field_f;
    static SpriteWidget field_i;
    static int field_c;
    float field_a;
    private int field_d;
    private int field_b;
    static boolean field_h;

    private final void updateProgress(TextMetricsGlobals param0, int param1, int param2) {
        float var4_float = 0.0f;
        try {
          var4_float = (float)param2 / 100.0f + (float)(1 + this.field_d);
          if (param2 == 0) {
            this.field_j = param0.field_b;
          } else {
            this.field_j = param0.field_e + " - " + param2 + "%";
          }
          if (param1 > -19) {
            ArchiveLoadSequence.setTargetFrameRate(85, (byte) -81);
          }
          this.field_a = var4_float * (float)this.field_b / (float)(1 + this.field_e);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "qc.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static LogoAndLoginHelpers validateEmailDomain(int param0, String param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        LogoAndLoginHelpers var7 = null;
        int var8 = 0;
        LogoAndLoginHelpers stackIn_3_0 = null;
        LogoAndLoginHelpers stackIn_7_0 = null;
        LogoAndLoginHelpers stackIn_11_0 = null;
        LogoAndLoginHelpers stackIn_17_0 = null;
        LogoAndLoginHelpers stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = PasswordFieldPainter.field_H;
            return stackIn_3_0;
          }
          if (255 < var2_int) {
            stackIn_7_0 = MouseWheelInput.field_a;
            return stackIn_7_0;
          }
          var3 = DialWidgetPainter.split(param1, (byte) -123, '.');
          if (2 > var3.length) {
            stackIn_11_0 = PasswordFieldPainter.field_H;
            return stackIn_11_0;
          }
          var4 = var3;
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var7 = EmailDomainValidationHelpers.validateDomainLabel(var6, 8286);
            if (var7 != null) {
              stackIn_17_0 = var7;
              return stackIn_17_0;
            }
          }
          if (param0 != 28320) {
            ArchiveLoadSequence.releaseStatics((byte) 90);
          }
          stackIn_22_0 = LobbyLayout.validateDigitsOnly(true, var3[-1 + var3.length]);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("qc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final boolean pollLoading(boolean param0) {
        TextMetricsGlobals var2;
        int var3;
        TextMetricsGlobals var4;
        var3 = Virogrid.field_F ? 1 : 0;
        while (this.field_e > this.field_d) {
          var4 = this.field_g[this.field_d];
          var2 = var4;
          if (!var4.field_f.ensureIndexLoaded(0)) {
            this.updateProgress(var4, -87, 0);
            return false;
          }
          if (var4.field_m >= 0 &&
            !var4.field_f.ensureGroupLoaded((byte) 81, var4.field_m)) {
            this.updateProgress(var2, -50, var4.field_f.getGroupProgress((byte) 105, var4.field_m));
            return false;
          }
          if (var4.field_k != null &&
            !var4.field_f.ensureGroupAvailableByName((byte) -102, var4.field_k)) {
            this.updateProgress(var2, -97, var4.field_f.getGroupProgressByName(var4.field_k, 126));
            return false;
          }
          if (var4.field_m < 0 &&
            null == var4.field_k &&
            null != var4.field_e &&
            !var4.field_f.areAllGroupsAvailable(25867)) {
            this.updateProgress(var2, -95, var4.field_f.getOverallProgress(-2677));
            return false;
          }
          this.field_d = this.field_d + 1;
        }
        if (!param0) {
        }
        return true;
    }

    final static Sprite[] centerOnlyPanelSlices(int param0, Sprite param1) {
        Sprite[] var2 = null;
        RuntimeException var2_ref = null;
        Sprite[] var3 = null;
        Sprite[] stackIn_2_0 = null;
        Sprite[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new Sprite[9];
          var2 = var3;
          var3[4] = param1;
          if (param0 >= 16) {
            stackIn_4_0 = var2;
            return stackIn_4_0;
          }
          stackIn_2_0 = (Sprite[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("qc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void saveRasterState(int param0) {
        ProxySocketConnector.field_l[MouseInputHandler.field_b] = Rasterizer.field_d;
        TextHotspot.field_i[MouseInputHandler.field_b] = Rasterizer.field_i;
        CellAnimator.field_i[MouseInputHandler.field_b] = Rasterizer.field_k;
        ValidationMessageWidget.field_O[MouseInputHandler.field_b] = Rasterizer.field_g;
        TextFieldValidator.field_h[MouseInputHandler.field_b] = Rasterizer.field_h;
        FadeLayer.field_K[MouseInputHandler.field_b] = Rasterizer.field_e;
        LobbyJoinTextGlobals.field_e[MouseInputHandler.field_b] = Rasterizer.field_f;
        if (param0 > 96) {
          MouseInputHandler.field_b = MouseInputHandler.field_b + 1;
          return;
        }
    }

    final static void rebuildPopupMenuIfOpen(byte param0) {
        if (!DigestHelpers.isFullscreenPromptOpen(true)) {
          return;
        }
        if (param0 == -12) {
          PopupMenuHelpers.buildPopupMenu(false, 4, (byte) 107);
          return;
        }
        ArchiveLoadSequence.rebuildPopupMenuIfOpen((byte) -103);
        PopupMenuHelpers.buildPopupMenu(false, 4, (byte) 107);
    }

    final static void setTargetFrameRate(int param0, byte param1) {
        if (param1 <= 81) {
          return;
        }
        ReflectionCheckHelpers.field_f = 1000000000L / (long)param0;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 9) {
          field_c = -88;
          field_i = null;
          field_f = null;
          return;
        }
        field_i = null;
        field_f = null;
    }

    private ArchiveLoadSequence() throws Throwable {
        throw new Error();
    }

    static {
        field_h = true;
    }
}
