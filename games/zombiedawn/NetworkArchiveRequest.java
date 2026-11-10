/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkArchiveRequest extends ArchiveRequest {
    static boolean field_A;
    static int[] field_y;
    PacketBuffer field_w;
    static String field_z;
    byte field_C;
    static Sprite[] field_x;
    int field_v;
    static ClientProtocolStage field_B;

    final byte[] getBytes(int param0) {
        if (this.field_q) {
          throw new RuntimeException();
        }
        if (this.field_w.position < this.field_w.payload.length - this.field_C) {
          throw new RuntimeException();
        }
        if (param0 != 0) {
          return (byte[]) null;
        }
        return this.field_w.payload;
    }

    final static void updateTooltip(String param0, int param1) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        try {
          LevelSelectScreen.field_m = LevelSelectScreen.field_m + 1;
          if (param1 != 0) {
            return;
          }
          if (LoadingAndMapHelpers.field_d == -1 &&
            -1 == Blast.field_n) {
            LoadingAndMapHelpers.field_d = KeyStateHelpers.field_b;
            Blast.field_n = FadingModalPanel.field_K;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(AchievementBanner.field_m));
          } else {
            decompiledFrameRemainder0 = (AchievementBanner.field_m == null);
          }
          if (decompiledFrameRemainder0) {
            if (!StatefulWidgetRenderer.field_x) {
              if (OfflineLoginHelpers.field_d <= LevelSelectScreen.field_m) {
                stackIn_19_0 = (OfflineLoginHelpers.field_d + TextWidgetPainter.field_k > LevelSelectScreen.field_m) ? 1 : 0;
              } else {
                stackIn_19_0 = 0;
              }
            } else {
              stackIn_19_0 = 0;
            }
            var2_int = stackIn_19_0;
            if (param0 == null) {
              LevelSelectScreen.field_m = 0;
            } else {
              if (StatefulWidgetRenderer.field_x) {
                LevelSelectScreen.field_m = OfflineLoginHelpers.field_d;
              } else {
                if (var2_int != 0) {
                  LevelSelectScreen.field_m = OfflineLoginHelpers.field_d;
                } else {
                  LevelSelectScreen.field_m = 0;
                }
              }
            }
            if (param0 == null) {
              if (var2_int != 0) {
                StatefulWidgetRenderer.field_x = true;
              }
            } else {
              StatefulWidgetRenderer.field_x = false;
            }
            GooPuddle.field_i = Blast.field_n;
            WeightedLruCache.field_i = LoadingAndMapHelpers.field_d;
          }
          AchievementBanner.field_m = param0;
          if (!StatefulWidgetRenderer.field_x &&
            OfflineLoginHelpers.field_d > LevelSelectScreen.field_m &&
            LoginCredentials.field_a) {
            LevelSelectScreen.field_m = 0;
            GooPuddle.field_i = Blast.field_n;
            WeightedLruCache.field_i = LoadingAndMapHelpers.field_d;
          }
          LoadingAndMapHelpers.field_d = -1;
          if (StatefulWidgetRenderer.field_x &&
            LevelSelectScreen.field_m == ProxySocketConnector.field_o) {
            LevelSelectScreen.field_m = 0;
            StatefulWidgetRenderer.field_x = false;
          }
          Blast.field_n = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_45_0 = var2;
          stackIn_45_1 = new StringBuilder().append("og.J(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_z = null;
        if (param0) {
          return;
        }
        field_y = null;
        field_x = null;
        field_B = null;
    }

    final static void setPendingAccountAction(int param0, int param1) {
        Bzip2State.field_s = param1;
        if (param0 >= -110) {
          NetworkArchiveRequest.setPendingAccountAction(53, -25);
        }
    }

    final int getProgress(int param0) {
        if (this.field_w == null) {
          return 0;
        }
        if (param0 != -31478) {
          return 29;
        }
        return 100 * this.field_w.position / (-this.field_C + this.field_w.payload.length);
    }

    final static void tickSharedAnimations(int param0) {
        int var2 = 0;
        MenuBackgroundActor[] var1 = null;
        MenuBackgroundActor var3 = null;
        int var4 = 0;
        MenuBackgroundActor[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ZombieDawn.field_J;
        try {
          var5 = DraggableWidget.field_L;
          var1 = var5;
          for (var2 = param0; var2 < var5.length; var2++) {
            var3 = var5[var2];
            var3.update(param0 ^ 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1_ref), "og.H(" + param0 + ')');
        }
    }

    NetworkArchiveRequest() {
    }

    static {
        field_y = new int[8192];
        field_z = "Rank";
        field_B = new ClientProtocolStage();
    }
}
