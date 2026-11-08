/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PlayerController {
    static String field_m;
    private Puzzle field_n;
    static String field_d;
    private int field_j;
    private FallingPieceView field_q;
    private int field_h;
    private BoardView field_f;
    boolean field_o;
    private int field_a;
    static int field_r;
    private InputQueue field_g;
    private int field_e;
    private boolean field_t;
    private Match field_k;
    boolean field_l;
    private int field_u;
    private int field_s;
    private int field_i;
    boolean field_c;
    int field_p;
    static char[] field_b;

    final void drainInputQueue(boolean param0) {
        int dupTemp$0 = 0;
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (param0) {
          this.field_a = 111;
        }
        while (true) {
          dupTemp$0 = this.field_g.poll(true);
          var2 = dupTemp$0;
          if (dupTemp$0 == -1) {
            break;
          }
          this.applyInput(0, var2);
        }
    }

    final void enqueueInput(int param0, int param1, int param2) {
        this.field_g.enqueue(param2, 0, param1);
        if (param0 != 6364) {
          PlayerController.canPollServerConnection((byte) -64);
        }
    }

    final void resetForRound(int param0) {
        this.field_l = false;
        this.field_e = this.field_o ? -50 : 0;
        this.field_g.clear(-1);
        int var2 = 94 / ((-68 - param0) / 57);
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 < 76) {
          field_r = 7;
        }
        field_d = null;
        field_m = null;
    }

    final void draw(int param0) {
        this.field_f.draw(false);
        if (param0 != -1) {
          PlayerController.releaseStatics(88);
        }
        if (!this.field_f.isAnimating(-127) &&
          !this.field_l &&
          this.field_e >= 0 &&
          this.field_u >= 0 &&
          this.field_h >= this.field_u) {
          this.field_q.draw(this.field_u, this.field_p, 0);
        }
    }

    final static boolean canPollServerConnection(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -59) {
          PlayerController.canPollServerConnection((byte) 49);
        }
        stackIn_7_0 = (10 <= el.field_b) && (!IconTextComponent.field_Nb) && (!PauseMenuScreen.isGameConnectionOpen(true));
        return stackIn_7_0;
    }

    final void showScorePopup(int param0, int param1, boolean param2) {
        int var5 = 0;
        int var4 = 0;
        if (param2) {
          var4 = this.field_k.boards[this.field_j].pieceColumn;
          var5 = this.field_k.boards[this.field_j].pieceRow;
          KiteTailSegment.spawnScorePopup(this.field_f.field_t - (-32 - 32 * var4), -1, param1, var5 * 32 + (32 + this.field_f.field_u));
        } else {
          KiteTailSegment.spawnScorePopup(this.field_i, -1, param1, this.field_s);
        }
        if (param0 != -20791) {
          this.enqueueInput(-23, -70, 98);
        }
    }

    final void restartPieceDrop(int param0) {
        if (!this.field_f.isAnimating(param0 ^ -40)) {
          this.field_f.playPictureCompleteEffect(param0 - 32);
          EmailValidator.playPieceSound((byte) 96, 7);
        }
        if (param0 != 93) {
          this.field_p = -49;
        }
        this.field_u = 0;
        this.field_k.boards[this.field_j].fastDrop = false;
    }

    final void beginPicture(int param0) {
        if (param0 != 2406) {
          this.field_j = -80;
        }
        this.field_e = !this.field_o ? 0 : -50;
        this.field_n = this.field_k.puzzle;
        this.field_f.startFadeIn((byte) 71);
        this.field_t = true;
        this.field_h = 16777216 / this.field_n.field_j + (this.field_n.field_n + this.field_n.field_h) + 10;
    }

    final static void openMessageMenu(boolean param0, boolean param1, String param2, int param3, int param4) {
        String stackIn_4_0 = null;
        String stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        boolean stackIn_26_2 = false;
        int stackIn_36_0 = 0;
        int stackIn_37_1 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var7Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          ek.field_c = true;
          ProxyAuthenticationException.field_g = param4;
          var11 = param2;
          if (param1) {
            stackIn_4_0 = td.field_a;
          } else {
            stackIn_4_0 = SoundVoice.field_k;
          }
          var6 = stackIn_4_0;
          if (ProxyAuthenticationException.field_g == 0) {
            var7 = qn.wrapText(var11, 480, TickClock.field_c, -121, DualLinkNode.field_o);
            var8 = var7 + 3;
            AccountRegistrationPanel.field_J = new String[var8];
            ProxyAuthenticationException.field_e = new int[var8];
            for (var9 = 0; var9 < var8; var9++) {
              ProxyAuthenticationException.field_e[var9] = -1;
            }
            di.field_b = new int[2];
            for (var9 = 0; var9 < var7; var9++) {
              AccountRegistrationPanel.field_J[var9] = TickClock.field_c[var9];
            }
            AccountRegistrationPanel.field_J[-3 + var8] = "";
            AccountRegistrationPanel.field_J[var8 - 2] = var6;
            ProxyAuthenticationException.field_e[-2 + var8] = 0;
            di.field_b[0] = 1;
            AccountRegistrationPanel.field_J[-1 + var8] = TabbedPanel.field_Hb;
            ProxyAuthenticationException.field_e[var8 - 1] = 1;
            di.field_b[1] = 2;
          } else {
            if (1 != ProxyAuthenticationException.field_g) {
              throw new IllegalArgumentException();
            }
            var7 = qn.wrapText(var11, 480, TickClock.field_c, -109, DualLinkNode.field_o);
            var8 = var7 + 2;
            AccountRegistrationPanel.field_J = new String[var8];
            ProxyAuthenticationException.field_e = new int[var8];
            for (var9 = 0; var8 > var9; var9++) {
              ProxyAuthenticationException.field_e[var9] = -1;
            }
            di.field_b = new int[1];
            for (var9 = 0; var7 > var9; var9++) {
              AccountRegistrationPanel.field_J[var9] = TickClock.field_c[var9];
            }
            AccountRegistrationPanel.field_J[-2 + var8] = "";
            AccountRegistrationPanel.field_J[var8 - 1] = TabbedPanel.field_Hb;
            ProxyAuthenticationException.field_e[var8 - 1] = 0;
            di.field_b[0] = 2;
          }
          VerticalScrollbar.field_Gb.field_h = di.field_b.length;
          var7Lifetime1 = 0;
          for (var8Lifetime1 = 0; var8Lifetime1 < AccountRegistrationPanel.field_J.length; var8Lifetime1++) {
            stackIn_25_0 = AccountRegistrationPanel.field_J[var8Lifetime1];
            stackIn_25_1 = 8192;
            stackIn_26_2 = !(ProxyAuthenticationException.field_e[var8Lifetime1] < 0);
            var9Lifetime1 = ArchiveProvider.measureMessageText(stackIn_25_0, stackIn_25_1, stackIn_26_2);
            if (ProxyAuthenticationException.field_e[var8Lifetime1] != -1) {
              var9Lifetime1 = var9Lifetime1 + ProxyAuthenticationException.field_a * 2;
            }
            if (var7Lifetime1 < var9Lifetime1) {
              var7Lifetime1 = var9Lifetime1;
            }
          }
          qn.field_o = -(var7Lifetime1 >> 1) + bq.field_d;
          LinkButtonPainter.field_e = -(var7Lifetime1 >> 1) + (bq.field_d + var7Lifetime1);
          nf.field_c = (WidgetStyleLayer.field_b + KiteTailSegment.field_e << 1) * VerticalScrollbar.field_Gb.field_h;
          for (var8Lifetime2 = param3; AccountRegistrationPanel.field_J.length > var8Lifetime2; var8Lifetime2++) {
            stackIn_36_0 = nf.field_c;
            if (ProxyAuthenticationException.field_e[var8Lifetime2] >= 0) {
              stackIn_37_1 = dk.field_d;
            } else {
              stackIn_37_1 = BouncedownBackground.field_m;
            }
            nf.field_c = stackIn_36_0 + stackIn_37_1;
          }
          ce.field_c = -(nf.field_c >> 1) + qh.field_b;
          VerticalScrollbar.field_Gb.initializeSelection(param0, NameAvailabilityValidator.messageMenuOptionAt(false, ProxyAuthenticationException.field_d, StatusBar.field_k), param3 ^ 17068, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_42_0 = var5;
          stackIn_42_1 = new StringBuilder().append("uh.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void syncTickWithBoard(int param0) {
        if (param0 != 9236) {
          this.field_i = 83;
        }
        this.field_e = this.field_k.boards[this.field_j].field_b;
    }

    final void tick(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = Pixelate.field_H ? 1 : 0;
        this.field_f.tick((byte) -113);
        if (param0 > ~this.field_p) {
          fieldTemp$0 = this.field_p + 1;
          this.field_p = this.field_p + 1;
          if (8 <= fieldTemp$0) {
            this.field_p = 0;
          }
        }
        if (this.field_f.isAnimating(-123)) {
          return;
        }
        if (this.field_t) {
          this.field_f = new BoardView(this.field_k.boards[this.field_j], this.field_i, this.field_s);
          this.field_q = new FallingPieceView(this.field_n, this.field_k.boards[this.field_j], this.field_f);
          this.field_u = 0;
          this.field_t = false;
        }
        if (this.field_l) {
          return;
        }
        fieldTemp$1 = this.field_e + 1;
        this.field_e = this.field_e + 1;
        if (fieldTemp$1 < 0) {
          return;
        }
        this.field_u = this.field_u + 1;
        if (this.field_k.boards[this.field_j].fastDrop &&
          this.field_u > 20) {
          var2 = this.field_n.field_h + 10 + this.field_n.field_n;
          if (this.field_u < var2) {
            this.field_u = var2;
          }
          this.field_u = this.field_u + this.field_a;
        }
        if (this.field_o) {
          if (this.field_u >= this.field_h) {
            this.field_u = this.field_h;
          }
          while (true) {
            dupTemp$2 = this.field_g.pollDueInput(this.field_e, (byte) -106);
            var2Lifetime1 = dupTemp$2;
            if (-1 == dupTemp$2) {
              return;
            }
            this.applyInput(~param0, var2Lifetime1);
          }
        }
        if (this.field_h <= this.field_u) {
          if (AgeValidator.field_p) {
            Vector3.sendInputEvent(5, param0 ^ 18655, this.field_e);
          }
          this.applyInput(0, 5);
        }
        return;
    }

    final int getTick(int param0) {
        if (param0 >= -77) {
          this.field_u = 19;
        }
        return this.field_e;
    }

    final boolean applyInput(int param0, int param1) {
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_32_0 = 0;
        int var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param0 != 0) {
          this.field_s = -1;
        }
        boolean decompiledFrameRemainder0 = true;
        var3 = 0;
        if (param1 == 5) {
          stackIn_32_0 = (!this.field_k.applyAction(param1, this.field_j, param0 + 92, this.field_e)) ? 0 : 1;
          var3 = stackIn_32_0;
          this.field_f.spawnPlacementParticles(param0 - 16);
          this.field_q.updatePreviewPosition(param0 - 122);
          this.field_u = 0;
          this.field_l = this.field_k.boards[this.field_j].isFullyPainted(param0 + 26745);
          if (50 != this.field_k.boards[this.field_j].field_f) {
            if (this.field_k.boards[this.field_j].field_f > 0) {
              EmailValidator.playPieceSound((byte) 96, 5);
            }
          } else {
            EmailValidator.playPieceSound((byte) 96, 6);
          }
        } else {
          if (param1 == 4) {
            if (this.field_p != 0) {
              return false;
            }
            if (this.field_k.applyAction(param1, this.field_j, 127, this.field_e)) {
              EmailValidator.playPieceSound((byte) 96, 4);
              this.field_p = 1;
              return true;
            }
          } else {
            if (8 == param1) {
              this.field_c = true;
              return false;
            }
            if (param1 != 2 &&
              param1 != 3 &&
              0 != param1 &&
              1 != param1) {
              if ((param1 == 6 ||
                param1 == 7)) {
                stackIn_22_0 = (!this.field_k.applyAction(param1, this.field_j, 28, this.field_e)) ? 0 : 1;
                var3 = stackIn_22_0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_13_0 = (!this.field_k.applyAction(param1, this.field_j, 117, this.field_e)) ? 0 : 1;
              var3 = stackIn_13_0;
              if (var3 != 0) {
                EmailValidator.playPieceSound((byte) 96, JavaRandomHelpers.randomBelow(ea.field_b, -101, 4) + 0);
              }
            }
          }
        }
        return var3 != 0;
    }

    final boolean isBoardIdle(int param0) {
        if (param0 != -1) {
          return true;
        }
        return this.field_f.isIdle(6);
    }

    PlayerController(Match param0, int param1, boolean param2, Puzzle param3, int param4, int param5) {
        boolean stackIn_4_1 = false;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        this.field_t = false;
        try {
          this.field_u = 0;
          this.field_n = param3;
          this.field_j = param1;
          this.field_i = param4;
          stackIn_4_1 = (param2);
          this.field_o = stackIn_4_1;
          this.field_s = param5;
          this.field_k = param0;
          this.field_a = 524288 / this.field_n.field_j;
          this.field_l = true;
          if (this.field_o) {
            stackIn_7_1 = -50;
          } else {
            stackIn_7_1 = 0;
          }
          this.field_e = stackIn_7_1;
          this.field_f = new BoardView(this.field_k.boards[this.field_j], this.field_i, this.field_s);
          this.field_q = new FallingPieceView(this.field_n, this.field_k.boards[this.field_j], this.field_f);
          this.field_h = 16777216 / this.field_n.field_j + (this.field_n.field_h + 10) + this.field_n.field_n;
          this.field_g = new InputQueue();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_11_0 = var7;
          stackIn_11_1 = new StringBuilder().append("uh.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean isBoardAnimating(int param0) {
        if (param0 >= -116) {
          this.applyInput(-27, -5);
        }
        return this.field_f.isAnimating(-123);
    }

    static {
        field_d = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_b = new char[]{(char)91, (char)93, (char)35};
    }
}
