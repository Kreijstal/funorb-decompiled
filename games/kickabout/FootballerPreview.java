/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FootballerPreview {
    static String[] field_a;
    private RenderedFootballer field_b;

    public static void releaseStatics(boolean param0) {
        field_a = null;
        if (!param0) {
          FootballerPreview.a(112);
        }
    }

    final static boolean containsForwardOrReversed(byte param0, String param1, String param2) {
        String var3 = null;
        int var4 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = QuickChatKeysHelpPanel.reverseString(-1, param1);
          var4 = -111 % ((-20 - param0) / 49);
          if (-1 != param2.indexOf(param1)) {
            return true;
          }
          if (param2.indexOf(var3) != -1) {
            return true;
          }
          stackIn_12_0 = (param2.startsWith(param1)) || (param2.startsWith(var3)) || (param2.endsWith(param1)) || (param2.endsWith(var3));
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("j.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static Sprite a(int param0) {
        if (param0 != -5275) {
          field_a = (String[]) null;
          return MeshObject.field_b[KitPatternMaskSupport.field_c][RankingsScreen.field_C];
        }
        return MeshObject.field_b[KitPatternMaskSupport.field_c][RankingsScreen.field_C];
    }

    final void draw(int param0, int param1, int param2) {
        int var4 = this.field_b.field_R;
        if (FaceNormal.field_c) {
          this.field_b.field_R = (this.field_b.field_R + 1024) % 2048;
          PacketBuffer.pushSpriteRaster(param0 + 39, SpriteResourceSupport.field_a);
          SoftwareRasterizer.clearFramebuffer();
          this.field_b.renderModel(1200, 300, 48, 90, (byte) -105);
          TeamManagementScreen.e(127);
          SpriteResourceSupport.field_a.drawHalfSize(param2 - param0, -47 + param1);
          if (FaceNormal.field_c) {
            this.field_b.field_R = var4;
            return;
          }
          return;
        }
        PacketBuffer.pushSpriteRaster(param0 + 39, SpriteResourceSupport.field_a);
        SoftwareRasterizer.clearFramebuffer();
        this.field_b.renderModel(1200, 300, 48, 90, (byte) -105);
        TeamManagementScreen.e(127);
        SpriteResourceSupport.field_a.drawHalfSize(param2 - param0, -47 + param1);
        if (!FaceNormal.field_c) {
          return;
        }
        this.field_b.field_R = var4;
    }

    final void updatePose(int param0, int param1) {
        if (param0 == 0) {
          this.field_b.directionMask = 0;
          this.field_b.directionX = 1;
          this.field_b.directionY = 0;
          if (param0 != 129) {
            this.field_b.stepMovement(2, (PlayArea[]) null, false, false);
            if (param1 == 1) {
              this.field_b.resetPose((byte) 125);
              return;
            }
            field_a = (String[]) null;
            this.field_b.resetPose((byte) 125);
            return;
          }
          this.field_b.directionMask = 3;
          this.field_b.stepMovement(2, (PlayArea[]) null, false, false);
          if (param1 != 1) {
            field_a = (String[]) null;
            this.field_b.resetPose((byte) 125);
            return;
          }
          this.field_b.resetPose((byte) 125);
          return;
        }
        this.field_b.directionMask = 8;
        if (param0 == 129) {
          this.field_b.directionMask = 3;
          this.field_b.stepMovement(2, (PlayArea[]) null, false, false);
          if (param1 == 1) {
            this.field_b.resetPose((byte) 125);
            return;
          }
          field_a = (String[]) null;
          this.field_b.resetPose((byte) 125);
          return;
        }
        this.field_b.stepMovement(2, (PlayArea[]) null, false, false);
        if (param1 == 1) {
          this.field_b.resetPose((byte) 125);
          return;
        }
        field_a = (String[]) null;
        this.field_b.resetPose((byte) 125);
    }

    FootballerPreview(int param0) {
        int var2 = 3;
        ClubState var3 = new ClubState();
        var3.field_w = 4;
        if (param0 != 0) {
          var3.field_k = 10;
          var3.field_R = 31;
        } else {
          var3.field_R = 31;
          var3.field_k = 16;
        }
        MeshData var4 = AuctionItem.a(var3.field_w, var3.field_k, 0, var2, 0, 0, var3.field_R, false, false, false);
        this.field_b = new RenderedFootballer(var4, var2, false);
        this.field_b.directionMask = 8;
        this.field_b.field_R = 1536;
        this.field_b.setAnimationClip((byte) -128, 5);
        if (param0 == 0) {
          this.field_b.field_mb.setFrame(10, 126);
        }
    }

    static {
    }
}
