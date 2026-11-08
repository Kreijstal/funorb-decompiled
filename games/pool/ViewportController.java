/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ViewportController {
    private int field_k;
    private int field_l;
    static ProjectedVertex[] field_c;
    private int field_f;
    static String muXCannotJoinFull;
    private int field_u;
    private int field_a;
    private int field_i;
    private int field_x;
    static int[] field_n;
    private int field_z;
    private int field_g;
    static int field_b;
    private int field_v;
    private int field_h;
    private boolean field_e;
    static String muRequestDeclined;
    private int field_p;
    private float field_m;
    private int field_j;
    private int field_r;
    static ResourceArchive field_q;
    static boolean field_y;
    private int field_d;
    static int field_t;
    private ViewportResizeListener field_o;

    final static void loadSceneAndBallModels(ResourceArchive archive, int obfuscationGuard) {
        Object var2 = null;
        int var3 = 0;
        TableScene var4 = null;
        int var5 = 0;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Pool.field_O;
        try {
          var2 = null;
          for (var3 = 0; BrowserCookieWriter.field_b.length > var3; var3++) {
            var4 = BrowserCookieWriter.field_b[var3];
            var4.loadModels(archive, obfuscationGuard ^ -98);
            if (null != var4.field_A &&
              var2 == null) {
              var2 = var4.field_A;
            }
          }
          for (var3Lifetime1 = obfuscationGuard; var3Lifetime1 < BrowserCookieWriter.field_b.length; var3Lifetime1++) {
            if (BrowserCookieWriter.field_b[var3Lifetime1].field_A == null) {
              BrowserCookieWriter.field_b[var3Lifetime1].field_A = (CueStick) (var2);
            }
          }
          for (var3Lifetime2 = 0; PoolGameModel.field_B.length > var3Lifetime2; var3Lifetime2++) {
            PoolGameModel.field_B[var3Lifetime2].loadBallMeshes(archive, (byte) 117);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("hr.E(");
          if (archive == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) (stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void updateViewportSize(boolean enabled) {
        int fieldTemp$0 = 0;
        if (MatchingTextValidator.field_u != null) {
          return;
        }
        if (UsernameSuggestionsPanel.field_V <= 0) {
          this.field_e = false;
        }
        if (!enabled) {
          return;
        }
        if (this.field_e) {
          fieldTemp$0 = this.field_r - 1;
          this.field_r = this.field_r - 1;
          if (fieldTemp$0 > 0) {
            return;
          }
          this.field_r = this.field_l;
          if (this.field_v <= AccountDisplayNameSupport.field_d) {
            this.applyConstrainedViewportSize(2);
          } else {
            this.field_e = false;
          }
          return;
        }
        if (LoginMethod.field_d < this.field_j) {
          ProjectedLineSupport.field_e = (this.field_j - LoginMethod.field_d) / 2;
        } else {
          if (0 < this.field_j) {
            ProjectedLineSupport.field_e = 0;
          }
        }
        if (LoginMethod.field_d == this.field_d &&
          ArchiveIndex.field_c == this.field_h) {
          return;
        }
        this.field_o.onViewportResize(this.field_h, this.field_d, 110);
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_n = null;
        muRequestDeclined = null;
        muXCannotJoinFull = null;
        if (param0 > -25) {
          return;
        }
        field_q = null;
    }

    final static void updateIgnoreListInteraction(boolean active, int obfuscationGuard, int opcode) {
        PlayerContextMenu var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        SocialListEntry var3 = CompressedContainerSupport.a(active, opcode, 100);
        PlayerContextMenu var4Lifetime1;
        if (obfuscationGuard >= -72) {
          int[] var7 = (int[]) null;
          ViewportController.drawProjectedCrosshair((float[]) null, -27, -27, (int[]) null);
        }
        if (var3 != null) {
          PlasmaBallSkin.field_m.addGameInviteActions((byte) 124, false);
          var4 = PlasmaBallSkin.field_m;
          var5_ref_String = PacketBuffer.muLobbyFriendRm;
          var4.field_n.addAction(var5_ref_String, 17130, 5);
          var4Lifetime1 = PlasmaBallSkin.field_m;
          var5 = DialogLayer.field_W;
          var6 = UsernameAvailabilityValidator.field_o;
          var4Lifetime1.field_n.layoutAtAnchor(0, 0, var5, 0, var6);
        }
        MeshBoundsSupport.updateIgnoreListPanel(opcode, (byte) 21, active);
    }

    final static void drawProjectedCrosshair(float[] point, int color, int obfuscationGuard, int[] cameraTransform) {
        point[0] = 0.5f + 8.0f * point[0];
        point[1] = point[1] * 8.0f + 0.5f;
        point[2] = point[2] * 8.0f + 0.5f;
        if ((point[0] - (float)cameraTransform[0]) * (float)cameraTransform[9] + (point[1] - (float)cameraTransform[1]) * (float)cameraTransform[10] + (point[2] - (float)cameraTransform[2]) * (float)cameraTransform[11] < 0.0f) {
          return;
        }
        try {
          ScreenProjectionSupport.projectToScreen(cameraTransform, point, 9);
          SoftwareRasterizer.drawLine((int)point[0], -4 + (int)point[1], (int)point[0], 4 + (int)point[1], color);
          int var4_int = 91 / ((55 - obfuscationGuard) / 46);
          SoftwareRasterizer.drawLine((int)point[0] - 4, (int)point[1], (int)point[0] + 4, (int)point[1], color);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "hr.I(" + (point != null ? "{...}" : "null") + ',' + color + ',' + obfuscationGuard + ',' + (cameraTransform != null ? "{...}" : "null") + ')');
        }
    }

    final void restorePreviousViewportSize(int obfuscationGuard) {
        this.field_o.onViewportResize(this.field_i, this.field_u, obfuscationGuard ^ 22433);
        if (obfuscationGuard != 22472) {
          muRequestDeclined = (String) null;
        }
    }

    final static void projectWorldPoint(int x, int[] destination, int[] cameraTransform, int y, int z, byte obfuscationGuard) {
        long var6_long = 0L;
        long var8 = 0L;
        long var10 = 0L;
        try {
          y = y - cameraTransform[1];
          if (obfuscationGuard != 9) {
            ResourceArchive var12 = (ResourceArchive) null;
            ViewportController.loadSceneAndBallModels((ResourceArchive) null, 12);
          }
          x = x - cameraTransform[0];
          z = z - cameraTransform[2];
          var6_long = KillerRules.multiplyFixedChecked((long)cameraTransform[3], (byte) -48, (long)x) - (-KillerRules.multiplyFixedChecked((long)cameraTransform[4], (byte) -48, (long)y) - KillerRules.multiplyFixedChecked((long)cameraTransform[5], (byte) -48, (long)z));
          var8 = KillerRules.multiplyFixedChecked((long)cameraTransform[6], (byte) -48, (long)x) + KillerRules.multiplyFixedChecked((long)cameraTransform[7], (byte) -48, (long)y) + KillerRules.multiplyFixedChecked((long)cameraTransform[8], (byte) -48, (long)z);
          var10 = KillerRules.multiplyFixedChecked((long)cameraTransform[9], (byte) -48, (long)x) + (KillerRules.multiplyFixedChecked((long)cameraTransform[10], (byte) -48, (long)y) + KillerRules.multiplyFixedChecked((long)cameraTransform[11], (byte) -48, (long)z));
          if (var10 == 0L) {
            var10 = 1L;
          }
          destination[0] = (int)((long)TriangleRasterizer.projectionCenterX + KillerRules.multiplyFixedChecked(512L, (byte) -48, var6_long) / var10);
          destination[1] = (int)((long)TriangleRasterizer.projectionCenterY + KillerRules.multiplyFixedChecked(512L, (byte) -48, var8) / var10);
          destination[2] = (int)var10;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "hr.J(" + x + ',' + (destination != null ? "{...}" : "null") + ',' + (cameraTransform != null ? "{...}" : "null") + ',' + y + ',' + z + ',' + obfuscationGuard + ')');
        }
    }

    final FullscreenFocusCanvas enterFullscreen(int obfuscationGuard) {
        this.field_u = LoginMethod.field_d;
        this.field_i = ArchiveIndex.field_c;
        this.field_o.onViewportResize(this.field_p, this.field_a, 117);
        int var2 = 35 % ((58 - obfuscationGuard) / 41);
        TabbedPane.field_Sb = false;
        FullscreenFocusCanvas var3 = CompressedContainerSupport.openFullscreenCanvas(this.field_a, StatefulTextPainter.field_s, (byte) 0, this.field_p, 0, 0);
        if (var3 == null) {
          this.restorePreviousViewportSize(22472);
        }
        return var3;
    }

    final void setAvailableSize(int param0, int param1, int param2) {
        this.field_j = param0;
        int var4 = -80 / ((-23 - param1) / 62);
        this.field_z = param2;
    }

    final static void drawInterfaceOverlays(boolean active, byte obfuscationGuard) {
        if (obfuscationGuard != 50) {
          ViewportController.updateIgnoreListInteraction(true, 91, 8);
        }
        HotspotRectangle.a((byte) 55, active);
        AudioService.drawTransientInterface(0, active);
    }

    private final void applyConstrainedViewportSize(int obfuscationGuard) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Pool.field_O;
        var2 = this.field_j;
        if (obfuscationGuard != 2) {
          this.field_k = 30;
        }
        var3 = this.field_z;
        if (!this.canApplyConstrainedSize(obfuscationGuard + 79)) {
          this.field_e = false;
          return;
        }
        if (var3 <= this.field_f) {
          if (this.field_k > var3) {
            var3 = this.field_k;
          }
        } else {
          var3 = this.field_f;
        }
        if (var2 <= this.field_g) {
          if (var2 < this.field_x) {
            var2 = this.field_x;
          }
        } else {
          var2 = this.field_g;
        }
        if (0.0f < this.field_m) {
          var4 = (int)(this.field_m * (float)var3 + 0.5f);
          if (var2 < var4) {
            var3 = (int)((float)var2 / this.field_m);
          } else {
            if (var4 < var2) {
              var2 = var4;
            }
          }
        }
        if (LoginMethod.field_d != var2 ||
          ArchiveIndex.field_c != var3) {
          this.field_o.onViewportResize(var3, var2, obfuscationGuard + 99);
        }
        if (this.field_j > 0) {
          ProjectedLineSupport.field_e = (-LoginMethod.field_d + this.field_j) / 2;
        }
    }

    final boolean canApplyConstrainedSize(int obfuscationGuard) {
        boolean stackIn_6_0 = false;
        if (obfuscationGuard <= 73) {
          field_c = (ProjectedVertex[]) null;
        }
        stackIn_6_0 = (AccountDisplayNameSupport.field_d >= this.field_v) && (UsernameSuggestionsPanel.field_V > 0);
        return stackIn_6_0;
    }

    private ViewportController() throws Throwable {
        throw new Error();
    }

    static {
        field_b = 6;
        muXCannotJoinFull = "<%0> cannot join; the game is full.";
        muRequestDeclined = "Your request to join has been declined.";
    }
}
