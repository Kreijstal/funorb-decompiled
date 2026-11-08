/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Sprite {
    static boolean field_k;
    int field_i;
    int field_j;
    static RgbSprite[] field_m;
    static IndexedSprite[] field_b;
    static SceneWidget field_f;
    int field_g;
    static String field_e;
    static NodeDeque field_c;
    int field_n;
    static int field_h;
    int field_d;
    int field_a;
    static SceneWidget field_l;

    abstract void drawAlpha(int param0, int param1, int param2);

    public static void releaseStatics(byte param0) {
        if (param0 < 55) {
          return;
        }
        field_m = null;
        field_c = null;
        field_f = null;
        field_e = null;
        field_b = null;
        field_l = null;
    }

    final static Class loadClassOrPrimitive(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_2_0 = Byte.TYPE;
            return stackIn_2_0;
          }
          if (param1.equals("I")) {
            stackIn_6_0 = Integer.TYPE;
            return stackIn_6_0;
          }
          if (param1.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param1.equals("J")) {
            stackIn_13_0 = Long.TYPE;
            return stackIn_13_0;
          }
          if (param1.equals("Z")) {
            stackIn_16_0 = Boolean.TYPE;
            return stackIn_16_0;
          }
          if (param1.equals("F")) {
            stackIn_20_0 = Float.TYPE;
            return stackIn_20_0;
          }
          if (param1.equals("D")) {
            stackIn_24_0 = Double.TYPE;
            return stackIn_24_0;
          }
          if (param0 != 10126) {
            field_l = (SceneWidget) null;
          }
          if (!param1.equals("C")) {
            stackIn_31_0 = Class.forName(param1);
            return stackIn_31_0;
          }
          stackIn_29_0 = Character.TYPE;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("ea.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    abstract void draw(int param0, int param1);

    final static ChatMessage rebuildChatHistoryRows(int param0, int param1, int param2, int param3) {
        boolean stackIn_47_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ChatMessage var8_ref_na;
        int var9;
        ChatMessage var9_ref_na;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = SteelSentinels.obfuscationControl;
        BoundedRandomAccessFile.field_j.field_Ub.field_M.clear(6);
        var4 = null;
        var5 = 0;
        var6 = 0;
        for (var7 = uc.field_a - 1; 0 <= var7; var7--) {
          var8_ref_na = ph.field_e[var7];
          var9 = 0;
          if (!fj.field_e &&
            var5 < ArchiveLoadSequence.field_h) {
            var10_int = NameAvailabilityValidator.a(var8_ref_na.field_k, 1);
            if (var8_ref_na.getVisibilityClass((byte) 58) >= var10_int && (var8_ref_na.field_g ||
              !o.a(-99, var8_ref_na.field_p))) {
              var9 = 1;
            }
          }
          if (var9 == 0) {
            var8_ref_na.field_m = null;
          } else {
            var5++;
            if (var8_ref_na.field_m == null ||
              TextWidgetPainter.field_l) {
              if (var8_ref_na.field_m == null) {
                NameValidationHelpers.field_e = NameValidationHelpers.field_e + 1;
              }
              var10 = ArticulatedPart.a(-118, var8_ref_na);
              var11 = var10 + BitmapFont.escapeMarkup(var8_ref_na.field_o);
              var12 = LoginConnectionStage.getChatLineColour(-102, var8_ref_na);
              var8_ref_na.field_m = new SceneWidget(0L, ReportAbuseDialog.field_ic, var11);
              var8_ref_na.field_m.field_xb = (8355711 & ReportAbuseDialog.field_ic.field_xb >> 1) - (8355711 & var12 >> 1) + var12;
              var8_ref_na.field_m.field_L = BirthDateEntryPanel.field_X;
              var8_ref_na.field_m.field_nb = var12;
              var8_ref_na.field_m.field_rb = ((ReportAbuseDialog.field_ic.field_rb & 16711422) >> 1) + (-((16711422 & var12) >> 1) + var12);
              var6 = var6 + param3;
            }
          }
        }
        var7Lifetime1 = 0;
        for (var8 = 0; var8 < uc.field_a; var8++) {
          var9_ref_na = ph.field_e[var8];
          if (null != var9_ref_na.field_m) {
            BoundedRandomAccessFile.field_j.field_Ub.addChild(var9_ref_na.field_m, 127);
            var9_ref_na.field_m.setBounds(0, var7Lifetime1, param3, param1, var9_ref_na.field_m.getContentWidth(-2147483648));
            var7Lifetime1 = var7Lifetime1 + param3;
            if (var9_ref_na.field_m.field_Eb != 0) {
              var4 = var9_ref_na;
            }
          }
        }
        var8Lifetime1 = BoundedRandomAccessFile.field_j.field_Ub.field_lb + BoundedRandomAccessFile.field_j.field_Ub.field_Lb - (-var6 + var7Lifetime1);
        BoundedRandomAccessFile.field_j.field_Ub.field_Lb = BoundedRandomAccessFile.field_j.field_Ub.field_Lb - var8Lifetime1;
        BoundedRandomAccessFile.field_j.field_Ub.field_eb = BoundedRandomAccessFile.field_j.field_Ub.field_eb + var8Lifetime1;
        if (TextWidgetPainter.field_l) {
          BoundedRandomAccessFile.field_j.field_Ub.field_Lb = var7Lifetime1;
        }
        if (TextWidgetPainter.field_l) {
          PopupMenuHelpers.field_f = true;
          BoundedRandomAccessFile.field_j.field_Ub.field_eb = -BoundedRandomAccessFile.field_j.field_Ub.field_Lb + BoundedRandomAccessFile.field_j.field_Tb.field_Lb;
          BoundedRandomAccessFile.field_j.field_Ub.field_gb = 0;
          TextWidgetPainter.field_l = false;
        }
        BoundedRandomAccessFile.field_j.field_Ub.field_lb = -BoundedRandomAccessFile.field_j.field_Ub.field_Lb + var7Lifetime1;
        if (param2 <= 0) {
          return (ChatMessage) null;
        }
        if (jn.field_g &&
          LoginActionHelpers.field_a != null) {
          PopupMenuHelpers.field_f = true;
        }
        var9Lifetime1 = BoundedRandomAccessFile.field_j.field_Tb.field_Lb - (BoundedRandomAccessFile.field_j.field_Ub.field_Lb + BoundedRandomAccessFile.field_j.field_Ub.field_lb);
        if (PopupMenuHelpers.field_f) {
          BoundedRandomAccessFile.field_j.field_Ub.field_gb = -BoundedRandomAccessFile.field_j.field_Ub.field_eb + var9Lifetime1;
        }
        BoundedRandomAccessFile.field_j.applyScrollInputForViewport(true, 8113, param3, param0 * 2 * param3);
        stackIn_47_0 = (var9Lifetime1 == BoundedRandomAccessFile.field_j.field_Ub.field_eb + BoundedRandomAccessFile.field_j.field_Ub.field_gb);
        PopupMenuHelpers.field_f = stackIn_47_0;
        return (ChatMessage) (var4);
    }

    final static void loadLogoJingle(ResourceArchive param0, int param1) {
        VorbisSample var2 = null;
        try {
          VorbisSample.decodeSetup(param0.a("", -742, "headers.packvorbis"));
          if (param1 != 1728986241) {
            field_c = (NodeDeque) null;
          }
          var2 = VorbisSample.loadNamed(param0, "jagex logo2.packvorbis", "");
          var2.decodeAllToPcm();
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "ea.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_e = "Sentinels Expansion";
    }
}
