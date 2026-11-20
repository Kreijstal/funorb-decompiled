/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginMethodPreference {
    static String field_b;
    private String field_a;

    final static void preloadLogoAudio(ResourceArchive param0, int param1) {
        VorbisSample var2 = null;
        try {
          VorbisSample.decodeSetup(param0.getNamedFile("", false, "headers.packvorbis"));
          var2 = VorbisSample.loadNamed(param0, "jagex logo2.packvorbis", "");
          if (param1 != 0) {
            field_b = (String) null;
          }
          var2.toPcmSampleUnbounded();
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "mf.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void writeLastLoginMethodCookie(java.applet.Applet param0, int param1) {
        if (param1 < 122) {
          return;
        }
        try {
          OpacityWidget.writeCookie(31536000L, param0, this.field_a, -100, "jagex-last-login-method");
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "mf.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int[] tintColorsBetween(int param0, byte param1, int param2, int[] param3) {
        int var12 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ChatMessage var16 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var15 = HoldTheLine.field_D;
        try {
          var4_int = param3.length;
          var5 = new int[var4_int];
          var6 = param0 >> 16 & 255;
          var7 = param2 >> 16 & 255;
          var8 = param0 >> 8 & 255;
          var9 = (65280 & param2) >> 8;
          var10 = param0 & 255;
          if (param1 <= 90) {
            var16 = (ChatMessage) null;
            LoginMethodPreference.receiveChatMessage((ChatMessage) null, true);
          }
          var11 = 255 & param2;
          for (var12 = 0; var4_int > var12; var12++) {
            var13 = param3[var12];
            var14 = (var13 >> 8 & 255) * 6 + (((var13 & 16711680) >> 16) * 5 + 5 * (255 & var13));
            var5[var12] = BitwiseIntegerOperations.orInts((int)((float)var14 / 4096.0f * (float)(var11 - var10)) + var10, BitwiseIntegerOperations.orInts((int)((float)var14 / 4096.0f * (float)(var9 - var8)) + var8 << 8, var6 + (int)((float)(var7 - var6) * ((float)var14 / 4096.0f)) << 16));
          }
          stackIn_7_0 = var5;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("mf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void receiveChatMessage(ChatMessage param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ChatMessage var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          if (param0.text == null) {
            return;
          }
          if (0 != param0.messageIdHigh ||
            param0.messageIdLow != 0) {
            for (var2_int = 0; Vector2f.field_e > var2_int; var2_int++) {
              var3 = RasterStateStack.field_a[var2_int];
              if (2 == var3.type &&
                param0.messageIdHigh == var3.messageIdHigh &&
                var3.messageIdLow == param0.messageIdLow) {
                return;
              }
            }
          }
          if (param0.quickChatParameters != null) {
          }
          ArchiveLoadStage.appendChatMessage(21325, param0);
          if (!param1) {
            return;
          }
          field_b = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("mf.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 > -62) {
          LoginMethodPreference.clearSharedReferences(-12);
          field_b = null;
          return;
        }
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean precedesPlayerStats(int param0, boolean param1, int param2, int param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param1) {
          if (SpriteSheetAsset.field_j[param0] > SpriteSheetAsset.field_j[param2]) {
            return true;
          }
          if (SpriteSheetAsset.field_j[param0] < SpriteSheetAsset.field_j[param2]) {
            return false;
          }
          if (NetworkGameClient.field_s[param0] > NetworkGameClient.field_s[param2]) {
            return true;
          }
          if (NetworkGameClient.field_s[param2] > NetworkGameClient.field_s[param0]) {
            return false;
          }
          var4 = IsaacPacketBuffer.field_u[param2] + (QuadraticPathSlicer.field_c[param2] + WidgetStyleNode.field_q[param2]);
          var5 = QuadraticPathSlicer.field_c[param0] + IsaacPacketBuffer.field_u[param0] + WidgetStyleNode.field_q[param0];
          if (var4 < var5) {
            return true;
          }
          if (param3 != 13234) {
            LoginMethodPreference.clearSharedReferences(-89);
          }
          if (var5 < var4) {
            return false;
          }
          return !(param2 >= param0);
        }
        if (NetworkGameClient.field_s[param2] < NetworkGameClient.field_s[param0]) {
          return true;
        }
        if (NetworkGameClient.field_s[param0] < NetworkGameClient.field_s[param2]) {
          return false;
        }
        if (SpriteSheetAsset.field_j[param2] < SpriteSheetAsset.field_j[param0]) {
          return true;
        }
        if (SpriteSheetAsset.field_j[param0] < SpriteSheetAsset.field_j[param2]) {
          return false;
        }
        var4Lifetime1 = IsaacPacketBuffer.field_u[param2] + (QuadraticPathSlicer.field_c[param2] + WidgetStyleNode.field_q[param2]);
        var5Lifetime1 = QuadraticPathSlicer.field_c[param0] + IsaacPacketBuffer.field_u[param0] + WidgetStyleNode.field_q[param0];
        if (var4Lifetime1 < var5Lifetime1) {
          return true;
        }
        if (param3 == 13234) {
          if (var5Lifetime1 < var4Lifetime1) {
            return false;
          }
          return !(param2 >= param0);
        }
        LoginMethodPreference.clearSharedReferences(-89);
        if (var5Lifetime1 < var4Lifetime1) {
          return false;
        }
        if (param2 >= param0) {
          return false;
        }
        return true;
    }

    final boolean matchesLoginMethod(int param0, String param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 62) {
            stackIn_4_0 = this.field_a.equals(param1);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    LoginMethodPreference(String param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Passwords must be between 5 and 20 characters long";
    }
}
