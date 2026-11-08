/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureCache implements TextureProvider {
    static String day;
    static int[] field_e;
    private Texture[] field_f;
    static char[] field_d;
    static int field_l;
    static int[] field_k;
    private IntrusiveDeque field_a;
    static UiComponent field_c;
    private int field_j;
    private int field_b;
    private int field_g;
    private ResourceArchive field_i;

    public final int[] getTexturePixels(boolean param0, int param1, float param2) {
        Texture var8 = null;
        Texture var7 = this.field_f[param1];
        Texture var6 = var7;
        var6 = var7;
        if (!param0) {
          return (int[]) null;
        }
        if (var7 == null) {
          return null;
        }
        if (null != var7.pixels) {
          if (param2 == var7.field_p) {
            this.field_a.addLast((byte) -84, var7);
            return var7.pixels;
          }
          var7.unlink((byte) -117);
          var7.releasePixels();
          this.field_j = this.field_j + 1;
        }
        if (var7.buildPixels(param2, this.field_b, this.field_i)) {
          if (0 == this.field_j) {
            var8 = (Texture) (this.field_a.removeFirst(-1));
            var8.releasePixels();
            this.field_a.addLast((byte) -84, var7);
            return var7.pixels;
          }
          this.field_j = this.field_j - 1;
          this.field_a.addLast((byte) -84, var7);
          return var7.pixels;
        }
        return null;
    }

    final static void drawFlatTriangle(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param3 > param2) {
          if (param1 <= param3) {
            if (param1 <= param2) {
              FixedPointVectorSupport.a(SoftwareRasterizer.pixels, param5, param4, param2, param7, param1, param3, param0, 19547);
              if (param6 == 108) {
                return;
              }
              TextureCache.getVisibleTooltipIndex(-1);
              return;
            }
            FixedPointVectorSupport.a(SoftwareRasterizer.pixels, param5, param7, param1, param4, param2, param3, param0, 19547);
            if (param6 == 108) {
              return;
            }
            TextureCache.getVisibleTooltipIndex(-1);
            return;
          }
          FixedPointVectorSupport.a(SoftwareRasterizer.pixels, param5, param7, param3, param0, param2, param1, param4, 19547);
          if (param6 != 108) {
            TextureCache.getVisibleTooltipIndex(-1);
            return;
          }
          return;
        }
        if (param1 > param2) {
          FixedPointVectorSupport.a(SoftwareRasterizer.pixels, param5, param0, param2, param7, param3, param1, param4, param6 + 19439);
          if (param6 != 108) {
            TextureCache.getVisibleTooltipIndex(-1);
            return;
          }
          return;
        }
        if (param1 <= param3) {
          FixedPointVectorSupport.a(SoftwareRasterizer.pixels, param5, param4, param3, param0, param1, param2, param7, 19547);
          if (param6 != 108) {
            TextureCache.getVisibleTooltipIndex(-1);
            return;
          }
          return;
        }
        FixedPointVectorSupport.a(SoftwareRasterizer.pixels, param5, param0, param1, param4, param3, param2, param7, param6 + 19439);
        if (param6 != 108) {
          TextureCache.getVisibleTooltipIndex(-1);
          return;
        }
    }

    final static int getVisibleTooltipIndex(int obfuscationGuard) {
        if (obfuscationGuard != 104) {
          LobbyGame var2 = (LobbyGame) null;
          TextureCache.insertLobbyGameSorted(70, (LobbyGame) null);
          if (ClientException.field_j) {
            return -1;
          }
          if (PackedColorSupport.field_a < LongAndTextLoginPayload.field_l) {
            return -1;
          }
          if (!(FadingDialog.field_Q + LongAndTextLoginPayload.field_l <= PackedColorSupport.field_a)) {
            return KillerBallSkin.field_m;
          }
          return -1;
        }
        if (ClientException.field_j) {
          return -1;
        }
        if (PackedColorSupport.field_a < LongAndTextLoginPayload.field_l) {
          return -1;
        }
        if (FadingDialog.field_Q + LongAndTextLoginPayload.field_l <= PackedColorSupport.field_a) {
          return -1;
        }
        return KillerBallSkin.field_m;
    }

    public final int getTextureAlphaMode(int param0, byte param1) {
        if (param1 != -91) {
          field_c = (UiComponent) null;
          if (!this.field_f[param0].field_n) {
            return 1;
          }
          return 0;
        }
        if (!this.field_f[param0].field_n) {
          return 1;
        }
        return 0;
    }

    public final int getAverageTextureColor(int param0, int param1) {
        if (param0 < 44) {
          return -97;
        }
        if (this.field_f[param1] == null) {
          return 0;
        }
        return this.field_f[param1].averageColor;
    }

    final static void insertLobbyGameSorted(int obfuscationGuard, LobbyGame game) {
        LobbyGame var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          game.unlink((byte) -117);
          var2 = (LobbyGame) (NetworkGameClient.field_A.last((byte) -72));
          while (var2 != null) {
            if (var2.comesBeforeGame(game, false)) {
              var2 = (LobbyGame) (NetworkGameClient.field_A.previous((byte) -5));
              continue;
            }
            break;
          }
          if (var2 != null) {
            TextLineLayout.insertAfter(game, (byte) -119, var2);
          } else {
            NetworkGameClient.field_A.addFirst((byte) -108, game);
          }
          if (obfuscationGuard > -73) {
            field_c = (UiComponent) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_12_0 = var2_ref;
          stackIn_12_1 = new StringBuilder().append("dp.D(").append(obfuscationGuard).append(',');
          if (game == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void placeWidgetAtBottomCenter(UiComponent parent, UiComponent child, int obfuscationGuard) {
        child.localX = parent.width - child.width >> 1;
        if (obfuscationGuard > -10) {
          return;
        }
        try {
          child.localY = parent.height + (-child.height - 10);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "dp.F(" + (parent != null ? "{...}" : "null") + ',' + (child != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public final boolean isSize64(int param0, int param1) {
        if (param1 != 55) {
          return true;
        }
        return 64 == this.field_b ? true : false;
    }

    public final boolean isTextureReady(byte param0, int param1) {
        if (param0 <= 97) {
          TextureCache.drawFlatTriangle(72, -96, -108, 104, -44, -64, -2, -66);
          return true;
        }
        return true;
    }

    final static int pollArchiveLoading(int obfuscationGuard) {
        TranslatedUiText.field_m.serviceProviders((byte) -46);
        int var1 = 55 / ((25 - obfuscationGuard) / 40);
        if (!GameRules.field_c.processNetwork(-2147483648)) {
          return SocketArchiveNetworkClient.g(-27108);
        }
        return 0;
    }

    final static int projectTablePointX(int param0, int param1, int param2) {
        if (param2 < 12) {
          TextureCache.pollArchiveLoading(26);
          ScrollPane.a(param1, (byte) 0, param0);
          return (LookupRetrySupport.field_h[0] << 9) / LookupRetrySupport.field_h[2] + 320;
        }
        ScrollPane.a(param1, (byte) 0, param0);
        return (LookupRetrySupport.field_h[0] << 9) / LookupRetrySupport.field_h[2] + 320;
    }

    public static void releaseStatics(int param0) {
        day = null;
        field_d = null;
        field_e = null;
        field_k = null;
        field_c = null;
        if (param0 != 3729) {
          field_e = (int[]) null;
        }
    }

    TextureCache(ResourceArchive param0, ResourceArchive param1, int param2, int param3) {
        int var7 = 0;
        int[] var5 = null;
        int var6 = 0;
        PacketBuffer var8 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        this.field_a = new IntrusiveDeque();
        this.field_b = 128;
        this.field_j = 0;
        try {
          this.field_i = param1;
          this.field_g = param2;
          this.field_j = this.field_g;
          this.field_b = param3;
          var12 = param0.getFileIds(0, 0);
          var11 = var12;
          var10 = var11;
          var5 = var10;
          var6 = var12.length;
          this.field_f = new Texture[param0.getFileCount(false, 0)];
          for (var7 = 0; var7 < var6; var7++) {
            var8 = new PacketBuffer(param0.getFileBytesUnkeyed(86, var12[var7], 0));
            this.field_f[var12[var7]] = new Texture(var8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("dp.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_d = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        day = "Day";
        field_k = new int[]{0, 1, 3, 9, 10, 8, 7, 5, 15, 2, 12, 14, 4, 13, 11, 6};
    }
}
