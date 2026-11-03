/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq extends IntrusiveNode {
    static Sprite field_n;
    static byte[] field_u;
    static boolean field_p;
    boolean field_s;
    static int field_r;
    static String raSuggestmute;
    static String tooltipSnookered;
    static int field_t;
    static UiComponent field_m;
    static String ratedMembersonly;
    static SceneNode field_o;
    int[] field_l;
    static int field_q;

    final static boolean c(byte param0) {
        if (!DualLinkNode.field_p) {
          return false;
        }
        if (hn.field_b != 0) {
          return false;
        }
        if (param0 != -75) {
          tq.a(75);
        }
        return true;
    }

    final static int[] a(int param0, int param1, boolean param2) {
        int var4 = 0;
        Sprite var5 = new Sprite(1024, 64);
        Sprite var3 = var5;
        if (param2) {
          tq.a(57);
        }
        for (var4 = 0; var3.field_D.length > var4; var4++) {
          var5.field_D[var4] = TriangleRasterizer.colorPalette[var4];
        }
        var3.bindAsRenderTarget();
        SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, param0, param1);
        OpacityWidget.field_P.bindAsRenderTarget(15100);
        return var3.field_D;
    }

    public static void a(int param0) {
        field_n = null;
        raSuggestmute = null;
        field_m = null;
        tooltipSnookered = null;
        ratedMembersonly = null;
        if (param0 != 0) {
          tq.a(-16, 85, false);
        }
        field_o = null;
        field_u = null;
    }

    final static boolean a(boolean param0, long param1, String param2) {
        SocialListEntry var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var5 = (String) null;
            tq.a(true, -73L, (String) null);
          }
          var4 = gf.a(62, param2);
          if (var4 != null &&
            null != var4.serverName) {
            return true;
          }
          stackIn_10_0 = (null != HighscoresScreen.field_L) && (QuickChatHelpDialog.b(param1, 0) != null);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("tq.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(long param0, byte param1, String param2) {
        CharSequence var5 = null;
        try {
          hn.field_b = 2;
          ArrayWidgetGroup.field_I = param2;
          if (param1 != -104) {
            tooltipSnookered = (String) null;
          }
          var5 = (CharSequence) ((Object) param2);
          ResourceArchive.field_a = TutorialController.normalizeDisplayName(117, var5);
          c.field_d = param0;
          jq.a((byte) 11);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "tq.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(byte param0) {
        if (null == MatchingTextValidator.field_u) {
          return;
        }
        he.detachInputListeners(MatchingTextValidator.field_u, 0);
        if (param0 > -100) {
          return;
        }
        MatchingTextValidator.field_u.a(StatefulTextPainter.field_s, -1);
        MatchingTextValidator.field_u = null;
        if (null != PlasmaTableScene.field_gb) {
          PlasmaTableScene.field_gb.d(22472);
        }
        TimeTrialSelectScreen.field_K.requestFocus();
    }

    final static int[] a(int param0, int param1, double[] param2) {
        int var4 = 0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var5 = null;
        int[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new int[param2.length];
          var3 = var5;
          if (param1 != -20607) {
            ratedMembersonly = (String) null;
          }
          for (var4 = 0; var4 < var5.length; var4++) {
            var5[var4] = SingleChildWidget.a(param2[var4], param0, 1);
          }
          stackIn_6_0 = var5;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("tq.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    tq() {
        this.field_s = false;
    }

    static {
        tooltipSnookered = "Snookered";
        raSuggestmute = "Suggest muting this player";
        field_p = true;
        ratedMembersonly = "Rated games are available to members only. To become a member, please visit the 'Account' section of the website.";
    }
}
