/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PhantomDecoy extends SceneObject {
    private boolean field_G;
    private int field_R;
    private int field_H;
    boolean field_O;
    static String field_I;
    static BinaryBitmapFont field_L;
    private int field_N;
    private int field_K;
    int field_Q;
    int field_P;
    static Sprite[] field_F;
    private int field_J;
    static long field_M;

    public static void releaseStatics(int param0) {
        if (param0 == 1) {
          field_L = null;
          field_I = null;
          field_F = null;
          return;
        }
        PlatformTaskDispatcher var2 = (PlatformTaskDispatcher) null;
        PhantomDecoy.initializeArchiveServices(-32, 42, (String) null, -55, 28, (PlatformTaskDispatcher) null, -114, -1, (byte) 0);
        field_L = null;
        field_I = null;
        field_F = null;
    }

    final void tick(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        PlatformTaskDispatcher var3;
        int fieldTemp$0 = this.field_P - 1;
        PlatformTaskDispatcher var3Lifetime1;
        PlatformTaskDispatcher var3Lifetime2;
        PlatformTaskDispatcher var3Lifetime3;
        this.field_P = this.field_P - 1;
        if (fieldTemp$0 <= 0) {
          this.unlink(true);
          this.unlinkSecondary(-4564);
          return;
        }
        if (this.field_G) {
          fieldTemp$1 = this.field_H;
          this.field_H = this.field_H + 1;
          if (fieldTemp$1 > 17) {
            fieldTemp$2 = this.field_R + 1;
            this.field_R = this.field_R + 1;
            if (fieldTemp$2 >= 2) {
              this.field_R = 0;
            }
            this.field_H = 0;
          }
          if (param0 <= -79) {
            return;
          }
          var3 = (PlatformTaskDispatcher) null;
          PhantomDecoy.initializeArchiveServices(45, 6, (String) null, -22, 31, (PlatformTaskDispatcher) null, -49, 13, (byte) 76);
          return;
        }
        this.field_N = this.field_N + this.field_K;
        if (this.field_N > 160) {
          this.field_K = -this.field_K;
          fieldTemp$3 = this.field_H;
          this.field_H = this.field_H + 1;
          if (fieldTemp$3 > 17) {
            fieldTemp$4 = this.field_R + 1;
            this.field_R = this.field_R + 1;
            if (fieldTemp$4 >= 2) {
              this.field_R = 0;
            }
            this.field_H = 0;
          }
          if (param0 <= -79) {
            return;
          }
          var3Lifetime1 = (PlatformTaskDispatcher) null;
          PhantomDecoy.initializeArchiveServices(45, 6, (String) null, -22, 31, (PlatformTaskDispatcher) null, -49, 13, (byte) 76);
          return;
        }
        if (this.field_N >= 80) {
          fieldTemp$7 = this.field_H;
          this.field_H = this.field_H + 1;
          if (fieldTemp$7 > 17) {
            fieldTemp$8 = this.field_R + 1;
            this.field_R = this.field_R + 1;
            if (fieldTemp$8 >= 2) {
              this.field_R = 0;
            }
            this.field_H = 0;
          }
          if (param0 <= -79) {
            return;
          }
          var3Lifetime2 = (PlatformTaskDispatcher) null;
          PhantomDecoy.initializeArchiveServices(45, 6, (String) null, -22, 31, (PlatformTaskDispatcher) null, -49, 13, (byte) 76);
          return;
        }
        this.field_K = -this.field_K;
        fieldTemp$5 = this.field_H;
        this.field_H = this.field_H + 1;
        if (fieldTemp$5 > 17) {
          fieldTemp$6 = this.field_R + 1;
          this.field_R = this.field_R + 1;
          if (fieldTemp$6 >= 2) {
            this.field_R = 0;
          }
          this.field_H = 0;
        }
        if (param0 <= -79) {
          return;
        }
        var3Lifetime3 = (PlatformTaskDispatcher) null;
        PhantomDecoy.initializeArchiveServices(45, 6, (String) null, -22, 31, (PlatformTaskDispatcher) null, -49, 13, (byte) 76);
        return;
    }

    final boolean containsPoint(int param0, int param1, int param2) {
        int var5 = 0;
        int var4 = this.positionX >> 16;
        int var5Lifetime1;
        if (param0 != 7) {
          this.field_K = -42;
          var5 = this.positionY >> 16;
          if (param1 >= 24 + var4 - 7) {
            return false;
          }
          if (7 + var4 - 24 >= param1) {
            return false;
          }
          if (param2 <= -48 + (var5 + 5)) {
            return false;
          }
          if (param2 < 2 + var5) {
            return true;
          }
          return false;
        }
        var5Lifetime1 = this.positionY >> 16;
        if (param1 >= 24 + var4 - 7) {
          return false;
        }
        if (7 + var4 - 24 >= param1) {
          return false;
        }
        if (param2 <= -48 + (var5Lifetime1 + 5)) {
          return false;
        }
        if (param2 < 2 + var5Lifetime1) {
          return true;
        }
        return false;
    }

    final static String formatArchiveProgress(String param0, byte param1, ResourceArchive param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.ensureIndex((byte) -123)) {
            stackIn_2_0 = (String) (param3);
            return stackIn_2_0;
          }
          var4_int = -2 / ((44 - param1) / 46);
          stackIn_4_0 = param0 + " - " + param2.getOverallProgress(0) + "%";
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("jj.L(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void initializeArchiveServices(int param0, int param1, String param2, int param3, int param4, PlatformTaskDispatcher param5, int param6, int param7, byte param8) {
        CacheEntry.field_q = param0;
        if (param8 > -84) {
          return;
        }
        try {
          AudioStartupHelpers.field_e = param4;
          GameHud.field_f = param1;
          IsaacRandom.field_b = param6;
          ObjectFactoryHelpers.field_a = param5;
          RankingsRequest.field_r = param2;
          BufferedSocket.field_q = param3;
          FullscreenFocusCanvas.field_b = param7;
          SharedTransportGlobals.field_a = (Js5Transport) ((Object) new SocketJs5Transport());
          FullscreenSupport.field_d = new DiskCacheWorker(param5);
          EffectVolumeHelpers.field_a = new Js5ArchiveManager(SharedTransportGlobals.field_a, FullscreenSupport.field_d);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "jj.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    PhantomDecoy(int param0, int param1, int param2, int param3, boolean param4) {
        super(param0, param1, param2);
        this.field_R = 0;
        this.field_H = 0;
        this.field_Q = param3;
        this.field_N = this.field_G ? 255 : 96;
        this.field_K = 3;
        this.field_P = null == PortalEntryEvent.field_m ? 3000 : PortalEntryEvent.field_m.computeEffectDuration((byte) 32, this.field_Q, 3000);
        this.field_G = param4 ? true : false;
        this.field_J = 1;
    }

    final void draw(int param0, Camera param1) {
        Sprite stackIn_9_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Sprite var8 = null;
        try {
          var3_int = param1.worldToScreenX(this.getX(-43), -20126) - 24;
          if (param0 != -10136) {
            this.field_P = -6;
          }
          var4 = -48 + param1.worldToScreenY(this.getY(118), 119);
          if (!WeightedLruCache.isOnScreen(var3_int, var4, (byte) -86, param1)) {
            return;
          }
          var5 = this.field_Q;
          var6 = PortalEntryEvent.field_m.field_D[var5][0];
          var7 = PortalEntryEvent.field_m.field_D[var5][1];
          var8 = TeamSpriteHelpers.createTeamColouredSprite(this.field_R, var7, this.field_C, param0 ^ -10135, var6);
          if (this.field_G) {
            stackIn_9_0 = QuickChatCategoryRegistry.field_d[1];
            if (3 != this.field_J) {
              stackIn_10_1 = var3_int;
            } else {
              stackIn_10_1 = -5 + var3_int;
            }
            RasterEffectHelpers.darkenUnderSprite(stackIn_9_0, stackIn_10_1 + 12, 43 + var4);
            var8.drawTransparent(var3_int, var4);
          } else {
            var8.drawBlended(var3_int, var4, this.field_N);
          }
          if (!this.field_O) {
            return;
          }
          QuickChatCategoryRegistry.field_d[0].drawTintedWithOpacity(1 + var3_int, 2 + var4, 128, 16711680);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("jj.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_I = "Mute this player for 48 hours";
    }
}
