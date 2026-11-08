/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HighScoreSubmission extends IntrusiveNode {
    static String youGainedALife;
    int field_p;
    static int field_m;
    int field_l;
    long field_w;
    int field_v;
    int field_x;
    int field_A;
    int[] field_z;
    int field_n;
    int field_B;
    static int field_s;
    static String loadingGraphics;
    static int field_q;
    static IntrusiveDeque field_o;
    static String field_y;
    static int[] field_r;

    public static void releaseStatics(int param0) {
        youGainedALife = null;
        if (param0 != -19382) {
          return;
        }
        field_y = null;
        loadingGraphics = null;
        field_o = null;
        field_r = null;
    }

    final static void loadLogoModel(ResourceArchive param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        TriangleMesh var5 = null;
        int[] var6 = null;
        CipherPacketBuffer var7 = null;
        int var8 = 0;
        CipherPacketBuffer var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        try {
          var7 = new CipherPacketBuffer(param0.getFileByName(false, "", "logo.fo3d"));
          var9 = var7;
          var3 = var9.readUnsignedByte(-123);
          var9.beginBitReading(8);
          SoundCache.field_a = ProjectedVertex.readLogoMaterials(24, var9);
          ShotRecord.field_S = new TriangleMesh[var3];
          QuickChatMenu.field_gc = new int[var3][];
          for (var4 = 0; var4 < var3; var4++) {
            ShotRecord.field_S[var4] = ArrayWidgetGroup.readPackedTriangleMesh(-16336, var7);
          }
          if (param1 >= -104) {
            loadingGraphics = (String) null;
          }
          var9.endBitReading(8);
          var8 = 0;
          var4Lifetime1 = var8;
          while (var3 > var8) {
            var5 = ShotRecord.field_S[var8];
            var5.scaleVertices(6, 1, 6, 6, 1);
            var5.updateBounds((byte) 103);
            var6 = new int[]{var5.minX + var5.maxX >> 1, var5.minY + var5.maxY >> 1, var5.maxZ + var5.minZ >> 1};
            QuickChatMenu.field_gc[var8] = var6;
            var5.translateVertices(0, -var6[0], -var6[2], -var6[1]);
            var8++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("oj.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean hasInputOverlay(int obfuscationGuard) {
        int var1;
        boolean stackIn_7_0 = false;
        var1 = 38 / ((obfuscationGuard - 45) / 37);
        stackIn_7_0 = (null != PlasmaBallSkin.field_m) || (OpacityWidget.isNamePopupOpen((byte) 86)) || (AccountMenuText.field_b != null) || (DraggableWidget.isQuickChatOverlayOpen(-1));
        return stackIn_7_0;
    }

    final static boolean handleChatShortcut(int param0, int param1, int param2) {
        int var3 = LookupRetrySupport.field_e != null ? 1 : 0;
        if (~IterableDualLinkDeque.field_a == param2 &&
          NineBallRules.canOpenQuickChatOptions(ProjectedVertex.field_s, DiskCacheWorker.field_g, 17, AppletContainerSupport.field_a, SupportPageLauncher.field_a)) {
          if (AppletContainerSupport.field_a != 2 &&
            var3 != 0) {
            return false;
          }
          return QuickChatDynamicCommand.openQuickChatOptions(AppletContainerSupport.field_a, DiskCacheWorker.field_g, SupportPageLauncher.field_a, ProjectedVertex.field_s, (byte) 76);
        }
        if (IterableDualLinkDeque.field_a == 10) {
          if (var3 != 0) {
            return false;
          }
          EmailValidator.restoreLobbyQuickChat((byte) -65);
          return true;
        }
        if (11 == IterableDualLinkDeque.field_a) {
          if (!AccountWelcomePanel.field_T) {
            return false;
          }
          if (AccountStateQuery.field_t == 2 &&
            !AccountStateQuery.isChatRecipientAvailable(false, QuickChatDynamicCommand.field_c, BrowserCookieSupport.field_e)) {
            return false;
          }
          if (2 != AccountStateQuery.field_t &&
            var3 != 0) {
            return false;
          }
          if (PlasmaBallSkin.allowRateLimitedMessage(param2 + 12010)) {
            String var4 = (String) null;
            AlternateLongAndTextLoginPayload.a((byte) -127, (String) null, param1, BrowserCookieSupport.field_e, AccountStateQuery.field_t, PasswordValidator.field_x);
          }
          return true;
        }
        return false;
    }

    HighScoreSubmission(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
          fieldTemp$0 = LobbyGame.field_Wb;
          LobbyGame.field_Wb = LobbyGame.field_Wb + 1;
          this.field_B = fieldTemp$0 & 65535;
          this.field_A = param4;
          this.field_n = param2;
          this.field_l = param0;
          this.field_x = param3;
          this.field_p = param1;
          this.field_z = param6;
          this.field_v = param5;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "oj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        youGainedALife = "You gained 1 life!";
        field_m = 4;
        loadingGraphics = "Loading graphics";
        field_q = -1;
        field_o = new IntrusiveDeque();
        field_r = new int[8192];
    }
}
