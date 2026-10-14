/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveFetchClient {
    static String localPlayerNameKey;
    static String[] field_j;
    static int field_p;
    static RgbSprite field_k;
    SecondaryNodeQueue pendingPriority;
    SecondaryNodeQueue activePriority;
    SecondaryNodeQueue pendingBackground;
    SecondaryNodeQueue activeBackground;
    int idleMillis;
    long lastPollMillis;
    PacketBuffer controlPacket;
    byte xorKey;
    volatile int failureCount;
    volatile int lastError;
    PacketBuffer responseHeader;
    ArchiveNetworkRequest currentResponse;

    abstract void reportIntegrityFailure(byte obfuscationGuard);

    final static ff a(String param0, boolean param1, String param2, byte param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        int var7 = 0;
        CharSequence var8 = null;
        ff stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          var7 = -101 % ((param3 + 57) / 48);
          var6 = null;
          if (-1 != param0.indexOf('@')) {
            var6 = param0;
          } else {
            var8 = (CharSequence) ((Object) param0);
            var4_long = HighscoresScreen.a(false, var8);
          }
          stackIn_4_0 = he.a(var4_long, 20, param1, param2, (String) (var6));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ih.N(");
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    abstract void closeTransport(byte obfuscationGuard);

    final boolean isPriorityQueueFull(int obfuscationGuard) {
        if (obfuscationGuard == 2) {
          return this.getPriorityCount((byte) -123) >= 20 ? true : false;
        }
        this.activeBackground = (SecondaryNodeQueue) null;
        return this.getPriorityCount((byte) -123) >= 20 ? true : false;
    }

    final static void a(String param0, int param1) {
        try {
          g.field_m = param0;
          bd.a(param1, true);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ih.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int getBackgroundCount(byte obfuscationGuard) {
        int var2 = 88 % ((obfuscationGuard - 30) / 42);
        return this.pendingBackground.size(-25906) + this.activeBackground.size(-25906);
    }

    public static void c(int param0) {
        field_j = null;
        if (param0 != -12200) {
          field_j = (String[]) null;
          field_k = null;
          localPlayerNameKey = null;
          return;
        }
        field_k = null;
        localPlayerNameKey = null;
    }

    final static void a(RasterCacheSurface param0, RgbSprite param1, int param2, int param3, int param4, boolean param5) {
        try {
          IndexedSpriteGeometry.pushSpriteRaster(-77, param0.sprite);
          Rasterizer2D.fillVerticalGradient(0, 0, param0.width, param0.height, ro.jungleBackgroundColors[param2], 16777215);
          param1.b((-param1.canvasWidth + param0.width) / 2 - 30 / param3, -param1.canvasHeight + param4 + (param0.height - 200 / param3), 55, 110);
          sc.popRaster(-117);
          if (!param5) {
            RgbSprite var7 = (RgbSprite) null;
            ArchiveFetchClient.a((RasterCacheSurface) null, (RgbSprite) null, 100, 125, 72, false);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ih.K(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    abstract void attachTransport(Object transport, boolean connectionMode, int obfuscationGuard);

    final ArchiveNetworkRequest request(int obfuscationGuard, int archiveId, byte trailerBytes, int groupId, boolean priority) {
        ArchiveNetworkRequest stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        long requestKey;
        ArchiveNetworkRequest request;
        requestKey = ((long)archiveId << 32) + (long)groupId;
        request = new ArchiveNetworkRequest();
        stackIn_2_0 = request;
        stackIn_3_1 = (!priority) ? false : true;
        stackIn_2_0.priority = stackIn_3_1;
        request.trailerBytes = trailerBytes;
        if (obfuscationGuard != -952050528) {
          this.lastError = 5;
        }
        request.secondaryKey = requestKey;
        if (!priority) {
          if (20 <= this.getBackgroundCount((byte) -42)) {
            throw new RuntimeException();
          }
          this.pendingBackground.addLast(request, false);
          return request;
        }
        if (this.getPriorityCount((byte) -42) >= 20) {
          throw new RuntimeException();
        }
        this.pendingPriority.addLast(request, false);
        return request;
    }

    final boolean isBackgroundQueueFull(byte obfuscationGuard) {
        if (obfuscationGuard == 101) {
          return this.getBackgroundCount((byte) 105) >= 20 ? true : false;
        }
        this.activeBackground = (SecondaryNodeQueue) null;
        return this.getBackgroundCount((byte) 105) >= 20 ? true : false;
    }

    final static void a(boolean param0, String param1, String param2, int param3) {
        GameScreen.field_d = param1;
        dl.field_e = param2;
        if (param3 != 2) {
          return;
        }
        try {
          MusicPatch.a(0, WidgetTextLayout.field_d, param0);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ih.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int getPriorityCount(byte obfuscationGuard) {
        if (obfuscationGuard >= -33) {
          return 20;
        }
        return this.pendingPriority.size(-25906) + this.activePriority.size(-25906);
    }

    abstract boolean pollTransport(int obfuscationGuard);

    final static void a(byte param0, boolean param1) {
        if (param0 > -16) {
          ArchiveFetchClient.c(-18);
          RankingsScreen.a(param1, -58, true);
          return;
        }
        RankingsScreen.a(param1, -58, true);
    }

    ArchiveFetchClient() {
        this.pendingPriority = new SecondaryNodeQueue();
        this.activePriority = new SecondaryNodeQueue();
        this.pendingBackground = new SecondaryNodeQueue();
        this.activeBackground = new SecondaryNodeQueue();
        this.controlPacket = new PacketBuffer(6);
        this.failureCount = 0;
        this.xorKey = (byte) 0;
        this.lastError = 0;
        this.responseHeader = new PacketBuffer(10);
    }

    static {
    }
}
