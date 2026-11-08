/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextDecodeHelpers {
    static String field_c;
    static ConnectionStage field_h;
    static int field_g;
    static String field_b;
    static int field_d;
    static int[] field_f;
    static int field_e;
    static String field_a;

    final static int hashString(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          if (param0 != 6) {
            field_b = (String) null;
          }
          var3 = 0;
          for (var4 = 0; var2_int > var4; var4++) {
            var3 = BackgroundParticle.encodeWindowsCodepageChar(param1.charAt(var4), 4290) + (var3 << 5) - var3;
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("nf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void layoutLobbyPanels(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var13 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7Lifetime1;
        var15 = Virogrid.field_F ? 1 : 0;
        try {
          var6_int = 8 + param3 + param5 + 495;
          QuickChatCategoryCache.field_k.setGeometry(3, -6 + ClientEnvironmentHelpers.field_c.field_ub, var6_int - 6, (byte) -46, 3);
          var7 = -5 + QuickChatCategoryCache.field_k.field_ub;
          PacketRequestHelpers.field_d.setGeometry(5, param2, param3 + (485 + param5 + 2), (byte) -48, -param2 + var7);
          UsernameAvailabilityValidator.field_n.setGeometry(param5, param2, -EditableTextWidget.field_I.field_K + (PacketRequestHelpers.field_d.field_K - param5), (byte) -88, 0);
          var7 = var7 - (2 + param2);
          var8 = -68 % ((72 - param4) / 40);
          EditableTextWidget.field_I.setGeometry(param5 + UsernameAvailabilityValidator.field_n.field_K, param2, EditableTextWidget.field_I.field_K, (byte) -97, 0);
          StatusAndUrlHelpers.field_c.setScrollPaneBounds(5, -126, 2 + (485 + param5) + param3, 2, var7 - 5, 5, param3);
          if (null != CameraAndLogoHelpers.field_c) {
            CameraAndLogoHelpers.field_c.setBounds(StatusAndUrlHelpers.field_c.field_ub, true, StatusAndUrlHelpers.field_c.field_F, StatusAndUrlHelpers.field_c.field_tb, StatusAndUrlHelpers.field_c.field_K);
          }
          var9 = -param5 + (ClientEnvironmentHelpers.field_c.field_K - var6_int);
          var10 = var9 / 2;
          var11 = var10 + (param1 + param5);
          var12 = 0;
          for (var13 = 0; var13 < 6; var13++) {
            if (var13 >= 5 ||
              null != NodeHashTable.field_i[var13]) {
              var14 = 3 + var12 * (-6 + ClientEnvironmentHelpers.field_c.field_ub + 2) / (1 + MenuInputState.field_h);
              var12++;
              var7Lifetime1 = 3 + (2 + (ClientEnvironmentHelpers.field_c.field_ub - 6)) * var12 / (1 + MenuInputState.field_h) - 2 - var14;
              if (var13 < 5) {
                NodeHashTable.field_i[var13].setGeometry(var6_int, var7Lifetime1, var9, (byte) -48, var14);
                TextEncodingHelpers.field_d[var13].setGeometry(param5, var7Lifetime1, var10 - param5, (byte) -72, 0);
                BoundedUrlRequest.field_g[var13].setGeometry(var10, -param0 + (var7Lifetime1 - param0), param1, (byte) -122, param0);
                QuickChatPhraseDefinition.field_o[var13].setGeometry(var11, -param0 - param0 + var7Lifetime1, -var11 - param5 + var9, (byte) -112, param0);
              } else {
                AccountCreationSupport.field_d.setGeometry(var6_int, var7Lifetime1, var9, (byte) -73, var14);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var6), "nf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String decodeWindowsCodePageText(int param0, byte param1, int param2, byte[] param3) {
        int var6 = 0;
        int incrementValue$0 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var8 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          var11 = new char[param0];
          var10 = var11;
          var4 = var10;
          var5 = 0;
          for (var6 = 0; param0 > var6; var6++) {
            var7 = 255 & param3[var6 + param2];
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = OverlayDrawHelpers.field_f[var7 - 128];
                if (0 == var8) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$0 = var5;
              var5++;
              var4[incrementValue$0] = (char)var7;
            }
          }
          if (param1 > -93) {
            TextDecodeHelpers.closeModalIfOpen((byte) -118);
          }
          stackIn_18_0 = new String(var11, 0, var5);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("nf.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -28637) {
          TextDecodeHelpers.cosineLookup(-2, 2);
        }
        field_h = null;
        field_c = null;
        field_f = null;
    }

    final static int cosineLookup(int param0, int param1) {
        param1 = param1 & 8191;
        if (param0 != 21855) {
          return -30;
        }
        if (4096 > param1) {
          return param1 >= 2048 ? -AccountCreationSupport.field_h[-2048 + param1] : AccountCreationSupport.field_h[-param1 + 2048];
        }
        return param1 < 6144 ? -AccountCreationSupport.field_h[-param1 + 6144] : AccountCreationSupport.field_h[-6144 + param1];
    }

    final static void closeModalIfOpen(byte param0) {
        int var1 = 83 / ((-71 - param0) / 39);
        if (ChatPanelUpdateHelpers.field_e) {
          DualLinkDequeIterator.closeModal((byte) -55);
        }
    }

    static {
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_f = new int[4];
        field_c = "Enter name of player to add to list";
        field_h = new ConnectionStage();
        field_a = "<%0> has left.";
    }
}
