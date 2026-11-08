/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingListRequest extends IntrusiveNode {
    int[] field_r;
    static boolean field_q;
    static int field_n;
    static long field_o;
    static String field_p;

    public static void releaseStatics(boolean param0) {
        field_p = null;
        if (param0) {
          PendingListRequest.sampleOctaveNoise(-1.4104137420654297f, true);
        }
    }

    final static byte[] readArchiveBytes(boolean param0, byte param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ByteStorage var4 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            return null;
          }
          if (param2 instanceof byte[]) {
            var3 = (byte[]) (param2);
            if (param0) {
              stackIn_8_0 = PacketFlushHelpers.copyBytes(-14074, var3);
              return stackIn_8_0;
            }
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (param1 != -28) {
            PendingListRequest.setStatButtonCookie(49);
          }
          if (!(param2 instanceof ByteStorage)) {
            throw new IllegalArgumentException();
          }
          var4 = (ByteStorage) (param2);
          stackIn_14_0 = var4.toByteArray(111);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("vj.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static float sampleOctaveNoise(float param0, boolean param1) {
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float stackIn_7_0 = 0.0f;
        float stackIn_12_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        float var2_floatLifetime1;
        int var3Lifetime1;
        var4 = TetraLink.field_J;
        try {
          if (null == LobbyGame.field_Nb) {
            LobbyGame.field_Nb = new float[8];
            ConfirmPasswordTextGlobals.field_b = new float[8];
            var2_float = 0.5f;
            for (var3 = 0; 8 > var3; var3++) {
              LobbyGame.field_Nb[var3] = (float)(Math.random() * (double)var2_float);
              ConfirmPasswordTextGlobals.field_b[var3] = (float)(2.0 * (Math.random() * 3.141592653589793));
              var2_float = var2_float / 2.0f;
            }
          }
          var2_floatLifetime1 = 0.0f;
          if (!param1) {
            stackIn_7_0 = 1.0860400199890137f;
            return stackIn_7_0;
          }
          var5 = 0;
          var3Lifetime1 = var5;
          while (var5 < 8) {
            var2_floatLifetime1 = (float)((double)var2_floatLifetime1 + (double)LobbyGame.field_Nb[var5] * Math.sin((double)((float)(1 << var5) * param0 + ConfirmPasswordTextGlobals.field_b[var5])));
            var5++;
          }
          stackIn_12_0 = var2_floatLifetime1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var2), "vj.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static byte[] readNamedRootFile(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -73) {
            field_o = 126L;
          }
          stackIn_3_0 = CachedArchiveSource.field_e.getFileByName("", param1, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private PendingListRequest() throws Throwable {
        throw new Error();
    }

    final static void setStatButtonCookie(int param0) {
        GameSession.setTuhstatbutCookie(ProgressMessageDialog.getHostApplet(13), 60);
        if (param0 != 1) {
          Object var2 = (Object) null;
          PendingListRequest.readArchiveBytes(false, (byte) 43, (Object) null);
        }
    }

    final static void updateChatFilterSetting(int param0, int param1, int param2, int param3) {
        if (param3 <= 85) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param0 == 0) {
          if (RegistrationResponseHelpers.field_e != param2) {
            GameOptionControls.field_c = true;
            RegistrationResponseHelpers.field_e = param2;
            DisplayMode.sendChatFilterSettings(107, param1);
            if (param0 != 1) {
              if (((param0 == 2)) &&
                ((IntrusiveNode.field_f != param2))) {
                GameOptionControls.field_c = true;
                IntrusiveNode.field_f = param2;
                DisplayMode.sendChatFilterSettings(108, param1);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (param2 == RasterStackHelpers.field_b) {
                if (((param0 == 2)) &&
                  ((IntrusiveNode.field_f != param2))) {
                  GameOptionControls.field_c = true;
                  IntrusiveNode.field_f = param2;
                  DisplayMode.sendChatFilterSettings(108, param1);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                RasterStackHelpers.field_b = param2;
                GameOptionControls.field_c = true;
                DisplayMode.sendChatFilterSettings(102, param1);
              }
            }
          } else {
            if (param0 != 1) {
              if (((param0 == 2)) &&
                ((IntrusiveNode.field_f != param2))) {
                GameOptionControls.field_c = true;
                IntrusiveNode.field_f = param2;
                DisplayMode.sendChatFilterSettings(108, param1);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (param2 == RasterStackHelpers.field_b) {
                if (((param0 == 2)) &&
                  ((IntrusiveNode.field_f != param2))) {
                  GameOptionControls.field_c = true;
                  IntrusiveNode.field_f = param2;
                  DisplayMode.sendChatFilterSettings(108, param1);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                RasterStackHelpers.field_b = param2;
                GameOptionControls.field_c = true;
                DisplayMode.sendChatFilterSettings(102, param1);
              }
            }
          }
        } else {
          if (param0 != 1) {
            if (((param0 == 2)) &&
              ((IntrusiveNode.field_f != param2))) {
              GameOptionControls.field_c = true;
              IntrusiveNode.field_f = param2;
              DisplayMode.sendChatFilterSettings(108, param1);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (param2 == RasterStackHelpers.field_b) {
              if (((param0 == 2)) &&
                ((IntrusiveNode.field_f != param2))) {
                GameOptionControls.field_c = true;
                IntrusiveNode.field_f = param2;
                DisplayMode.sendChatFilterSettings(108, param1);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              RasterStackHelpers.field_b = param2;
              GameOptionControls.field_c = true;
              DisplayMode.sendChatFilterSettings(102, param1);
            }
          }
        }
        if ((decompiledFrameRemainder0) && (param0 == 2 &&
          IntrusiveNode.field_f != param2)) {
          GameOptionControls.field_c = true;
          IntrusiveNode.field_f = param2;
          DisplayMode.sendChatFilterSettings(108, param1);
        }

    }

    static {
        field_p = "Enter name of player to add to list";
    }
}
