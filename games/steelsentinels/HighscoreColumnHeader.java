/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HighscoreColumnHeader {
    static long[] field_c;
    boolean field_d;
    static RgbSprite[] field_i;
    String field_b;
    String field_g;
    static boolean field_h;
    static String field_f;
    static String field_a;
    static SceneWidget field_e;

    final static void updateTooltip(int param0, String param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = SteelSentinels.obfuscationControl;
        try {
          CachedTextLayout.field_m = CachedTextLayout.field_m + 1;
          if (TriangleMesh.field_d == -1 &&
            MeshMaterial.field_c == -1) {
            MeshMaterial.field_c = DelegatingCanvas.field_c;
            TriangleMesh.field_d = LobbySetupHelpers.field_f;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 == null) {
            decompiledFrameRemainder0 = (SectorCacheStore.field_b == null);
          } else {
            decompiledFrameRemainder0 = !(param1.equals(SectorCacheStore.field_b));
          }
          if (decompiledFrameRemainder0) {
            if (!AlternateUsernameCredentials.field_A) {
              if (ConditionalTextValue.field_c <= CachedTextLayout.field_m) {
                stackIn_17_0 = (CachedTextLayout.field_m < ByteArrayPoolHelpers.field_c + ConditionalTextValue.field_c) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param1 == null) {
              CachedTextLayout.field_m = 0;
            } else {
              if (AlternateUsernameCredentials.field_A) {
                CachedTextLayout.field_m = ConditionalTextValue.field_c;
              } else {
                if (var2_int != 0) {
                  CachedTextLayout.field_m = ConditionalTextValue.field_c;
                } else {
                  CachedTextLayout.field_m = 0;
                }
              }
            }
            if (param1 != null) {
              AlternateUsernameCredentials.field_A = false;
            } else {
              if (var2_int != 0) {
                AlternateUsernameCredentials.field_A = true;
              }
            }
            NameTable.field_l = MeshMaterial.field_c;
            SocialListUiHelpers.field_a = TriangleMesh.field_d;
          }
          if (!AlternateUsernameCredentials.field_A &&
            CachedTextLayout.field_m < ConditionalTextValue.field_c &&
            ConditionalTextValue.field_a) {
            NameTable.field_l = MeshMaterial.field_c;
            CachedTextLayout.field_m = 0;
            SocialListUiHelpers.field_a = TriangleMesh.field_d;
          }
          if (param0 > -125) {
            return;
          }
          SectorCacheStore.field_b = param1;
          if (AlternateUsernameCredentials.field_A &&
            CachedTextLayout.field_m == SocialListPanel.field_Ub) {
            CachedTextLayout.field_m = 0;
            AlternateUsernameCredentials.field_A = false;
          }
          TriangleMesh.field_d = -1;
          MeshMaterial.field_c = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_44_0 = var2;
          stackIn_44_1 = new StringBuilder().append("hg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    final static void attachCanvasInput(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SocketConnector.attachKeyboardInput(-1, (java.awt.Component) ((Object) param1));
          TickClock.attachMouseInput(true, (java.awt.Component) ((Object) param1));
          if (null != WeightedLruCache.field_j) {
            WeightedLruCache.field_j.attach((java.awt.Component) ((Object) param1), false);
          }
          if (param0 == -93) {
            return;
          }
          field_h = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("hg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        field_i = null;
        field_c = null;
        field_f = null;
        if (param0 >= 82) {
          field_a = null;
          return;
        }
        java.awt.Canvas var2 = (java.awt.Canvas) null;
        HighscoreColumnHeader.attachCanvasInput((byte) 122, (java.awt.Canvas) null);
        field_a = null;
    }

    static {
        field_c = new long[32];
        field_h = false;
        field_f = "Go Back";
        field_a = "FULL ACCESS";
    }
}
