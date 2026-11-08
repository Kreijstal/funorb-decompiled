/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextWidget extends TextInputWidget implements ValidationProvider {
    static String field_F;
    static ModalStack field_Z;
    static String field_bb;
    static String[] field_X;
    static int[] field_Y;
    private ValidationSource field_V;
    private int field_ab;
    static UiLayoutNode[] field_W;

    final void m(byte param0) {
        super.m((byte) -97);
        if (param0 >= -57) {
          ValidatedTextWidget.a(true, 93);
        }
        if (this.field_V != null) {
          this.field_V.validationChanged(113);
        }
    }

    ValidatedTextWidget(String param0, UiListener param1, int param2) {
        super(param0, param1, param2);
    }

    final static void a(boolean param0, int param1) {
        vb.field_j = 0;
        AlphaContainer.field_C = new int[3];
        if (param0) {
          RenderedBall var3 = (RenderedBall) null;
          ValidatedTextWidget.a((RenderedBall) null, true);
        }
        TrinketTile.field_Hb = param1;
        GrowableIntList.field_b = new ChatMessage[param1 * 15];
    }

    public static void n(byte param0) {
        field_Z = null;
        if (param0 <= 40) {
          field_Y = (int[]) null;
        }
        field_F = null;
        field_Y = null;
        field_bb = null;
        field_X = null;
        field_W = null;
    }

    public final ValidationSource a(byte param0) {
        if (param0 > -107) {
          ValidatedTextWidget.a((byte) -36, 39);
        }
        return this.field_V;
    }

    final static WorldDrawEntry a(RenderedBall param0, boolean param1) {
        WorldDrawEntry var2 = null;
        RuntimeException var2_ref = null;
        WorldDrawEntry stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            ValidatedTextWidget.n((byte) -2);
          }
          var2 = new WorldDrawEntry(2);
          var2.field_h = param0;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("mr.WA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void updatePointerState(byte param0, UiWidget param1, int param2, int param3) {
        try {
          super.updatePointerState(param0, param1, param2, param3);
          this.field_ab = -param2 + BytePlusOneCommand.field_A - this.field_t;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "mr.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        ManagerAction var2 = null;
        int var3 = Kickabout.field_G;
        ManagerAction var2Lifetime1;
        try {
          var2 = (ManagerAction) (MusicPatchNode.field_h.g(24009));
          while (var2 != null) {
            if (6 == var2.actionType) {
              var2.c((byte) -109);
            }
            var2 = (ManagerAction) (MusicPatchNode.field_h.c(33));
          }
          var2Lifetime1 = new ManagerAction(6, new int[]{param1});
          if (param0 < 16) {
            ValidatedTextWidget.n((byte) 103);
          }
          ii.a(var2Lifetime1, 71);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "mr.DB(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, ValidationSource param1) {
        try {
          this.field_V = param1;
          if (param0 != 6) {
            field_F = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "mr.CB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String getTooltip(int param0) {
        if (!this.field_m) {
          return null;
        }
        if (this.field_u == null) {
          return null;
        }
        if (param0 != -1) {
          this.getTooltip(54);
        }
        TournamentChampionDialog.b(ArchiveManager.field_m, 0, this.field_n - this.field_ab + BytePlusOneCommand.field_A);
        return this.field_u;
    }

    final static ld a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ld stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        ld stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          var2_int = param1.length();
          if (param0 != 6) {
            stackIn_3_0 = (ld) null;
            return stackIn_3_0;
          }
          var3 = 0;
          while (true) {
            if (var3 >= var2_int) {
              stackIn_13_0 = TournamentLobbyScreen.field_F;
              return stackIn_13_0;
            }
            var4 = param1.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 <= 57) {
              var3++;
              continue;
            }
            break;
          }
          stackIn_10_0 = null;
          return (ld) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("mr.EB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_F = "<%0> has left the game.";
        field_bb = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
