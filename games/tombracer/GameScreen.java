/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameScreen {
    static java.applet.Applet field_e;
    static String field_a;
    static gb field_b;
    int field_d;
    int field_c;

    final static boolean a(int param0, boolean param1, int param2) {
        String var4 = null;
        int var3 = null != WaveformOperator.field_n ? 1 : 0;
        String var4Lifetime1;
        String var4Lifetime2;
        String var4Lifetime3;
        if (MenuEntry.field_h == 9) {
          if (!SoundEventQueue.a(uba.field_f, 110, fp.field_d, tba.field_g, CoinItemComponent.field_I)) {
            if (MenuEntry.field_h == 10) {
              if (var3 != 0) {
                return false;
              }
              ContextMenu.e((byte) 113);
              return true;
            }
            if (!param1) {
              if (MenuEntry.field_h != 11) {
                return false;
              }
              if (!LegacyOpenGlTurbulentTextureEffect.field_f) {
                return false;
              }
              if (VerticalGradientOperator.field_n != 2) {
                if (2 == VerticalGradientOperator.field_n) {
                  if (VerticalScrollbar.isChatSendAllowed(-1)) {
                    var4 = (String) null;
                    ResultsPhase.writeChatMessage(VerticalGradientOperator.field_n, (String) null, param2, 32371, cr.field_b, CharacterSelectPhase.field_q);
                  }
                  return true;
                }
                if (var3 == 0) {
                  if (VerticalScrollbar.isChatSendAllowed(-1)) {
                    var4 = (String) null;
                    ResultsPhase.writeChatMessage(VerticalGradientOperator.field_n, (String) null, param2, 32371, cr.field_b, CharacterSelectPhase.field_q);
                  }
                  return true;
                }
                return false;
              }
              if (ota.isPlayerReachable(apa.field_a, (byte) 13, cr.field_b)) {
                if (2 != VerticalGradientOperator.field_n &&
                  var3 != 0) {
                  return false;
                }
                if (VerticalScrollbar.isChatSendAllowed(-1)) {
                  var4 = (String) null;
                  ResultsPhase.writeChatMessage(VerticalGradientOperator.field_n, (String) null, param2, 32371, cr.field_b, CharacterSelectPhase.field_q);
                }
                return true;
              }
              return false;
            }
            field_e = (java.applet.Applet) null;
            if (MenuEntry.field_h != 11) {
              return false;
            }
            if (LegacyOpenGlTurbulentTextureEffect.field_f) {
              if (VerticalGradientOperator.field_n == 2 &&
                !ota.isPlayerReachable(apa.field_a, (byte) 13, cr.field_b)) {
                return false;
              }
              if (2 != VerticalGradientOperator.field_n &&
                var3 != 0) {
                return false;
              }
              if (VerticalScrollbar.isChatSendAllowed(-1)) {
                var4Lifetime3 = (String) null;
                ResultsPhase.writeChatMessage(VerticalGradientOperator.field_n, (String) null, param2, 32371, cr.field_b, CharacterSelectPhase.field_q);
              }
              return true;
            }
            return false;
          }
          if (uba.field_f != 2 &&
            var3 != 0) {
            return false;
          }
          return eca.a((byte) -121, uba.field_f, CoinItemComponent.field_I, fp.field_d, tba.field_g);
        }
        if (MenuEntry.field_h == 10) {
          if (var3 != 0) {
            return false;
          }
          ContextMenu.e((byte) 113);
          return true;
        }
        if (param1) {
          field_e = (java.applet.Applet) null;
          if (MenuEntry.field_h == 11) {
            if (!LegacyOpenGlTurbulentTextureEffect.field_f) {
              return false;
            }
            if (VerticalGradientOperator.field_n == 2 &&
              !ota.isPlayerReachable(apa.field_a, (byte) 13, cr.field_b)) {
              return false;
            }
            if (2 != VerticalGradientOperator.field_n &&
              var3 != 0) {
              return false;
            }
            if (VerticalScrollbar.isChatSendAllowed(-1)) {
              var4Lifetime1 = (String) null;
              ResultsPhase.writeChatMessage(VerticalGradientOperator.field_n, (String) null, param2, 32371, cr.field_b, CharacterSelectPhase.field_q);
            }
            return true;
          }
          return false;
        }
        if (MenuEntry.field_h == 11) {
          if (!LegacyOpenGlTurbulentTextureEffect.field_f) {
            return false;
          }
          if (VerticalGradientOperator.field_n == 2 &&
            !ota.isPlayerReachable(apa.field_a, (byte) 13, cr.field_b)) {
            return false;
          }
          if (2 != VerticalGradientOperator.field_n &&
            var3 != 0) {
            return false;
          }
          if (VerticalScrollbar.isChatSendAllowed(-1)) {
            var4Lifetime2 = (String) null;
            ResultsPhase.writeChatMessage(VerticalGradientOperator.field_n, (String) null, param2, 32371, cr.field_b, CharacterSelectPhase.field_q);
          }
          return true;
        }
        return false;
    }

    final static int positiveModulo(int param0, int param1, int param2) {
        int var3 = 118 % ((24 - param2) / 41);
        if (param0 < 0) {
          param0 = param1 + param0 % param1;
        }
        if (param0 < param1) {
          return param0;
        }
        return param0 % param1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var7 = null;
        int var8 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 < param2) {
            for (var5_int = param1; param2 > var5_int; var5_int++) {
              vaa.field_a[var5_int][param0] = param3;
            }
          } else {
            var8 = param2;
            var5_int = var8;
            while (param1 > var8) {
              vaa.field_a[var8][param0] = param3;
              var8++;
            }
          }
          if (param4 == 0) {
            return;
          }
          var7 = (String) null;
          GameScreen.replaceCharacter('N', (String) null, (String) null, 30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var5), "dfa.FC(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void c(byte param0) {
        og.exitFullscreen(0);
        if (null != nma.field_l) {
          CharacterChoiceFactory.detachCanvasInput(nma.field_l, false);
        }
        ContextMenu.releaseKeyboardHandler((byte) 101);
        BeamSegment.releaseMouseHandler(5);
        if (param0 == 62) {
          RasterizerOperator.closeNetworkAndCacheResources(0);
          if (bl.b(param0 - 62)) {
            ql.field_k.writeCipheredOpcode(1, -2988);
            bl.flushPacketBuffer(0, -1);
          }
          DropAnimation.closeGameSocket(60);
          return;
        }
        GameScreen.a(-50, false, 79);
        RasterizerOperator.closeNetworkAndCacheResources(0);
        if (bl.b(param0 - 62)) {
          ql.field_k.writeCipheredOpcode(1, -2988);
          bl.flushPacketBuffer(0, -1);
        }
        DropAnimation.closeGameSocket(60);
    }

    abstract boolean isFullScreen(int param0);

    abstract void draw(byte param0, boolean param1);

    abstract void update(boolean param0, boolean param1, int param2);

    public static void releaseStatics(byte param0) {
        field_b = null;
        if (param0 != -104) {
          field_b = (gb) null;
          field_e = null;
          field_a = null;
          return;
        }
        field_e = null;
        field_a = null;
    }

    abstract void onDeactivated(int param0);

    final static String replaceCharacter(char param0, String param1, String param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param2.length();
          var5 = param1.length();
          var6 = var4_int;
          var7 = var5 - 1;
          if (param3 != var7) {
            var8_int = 0;
            while (true) {
              var8_int = param2.indexOf((int) param0, var8_int);
              if (var8_int < 0) {
                break;
              }
              var8_int++;
              var6 = var6 + var7;
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param2.indexOf((int) param0, var9);
            if (var10 < 0) {
              discarded$0 = var8.append(param2.substring(var9));
              stackIn_11_0 = var8.toString();
              return stackIn_11_0;
            }
            discarded$1 = var8.append(param2.substring(var9, var10));
            var9 = var10 + 1;
            discarded$2 = var8.append(param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("dfa.EC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    abstract boolean handleKey(int param0, char param1, int param2);

    abstract void onActivated(byte param0);

    GameScreen(int param0) {
        this.field_c = param0;
        this.field_d = this.field_c;
    }

    static {
        field_a = "Bruce";
        field_b = new gb();
    }
}
