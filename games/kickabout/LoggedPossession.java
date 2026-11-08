/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class LoggedPossession {
    private int[] pitchEnds;
    private int field_e;
    private int nobody;
    private int[] perPlayer;
    private int[][] perFootballer;
    static String field_a;

    final static void a(boolean param0) {
        int var2;
        var2 = Kickabout.field_G;
        ThumbnailStateFactory.field_d.field_B = NanoTickClock.field_t;
        if (param0) {
          LoggedPossession.releaseStatics(-10);
        }
        boolean decompiledFrameRemainder0 = true;
        ThumbnailStateFactory.field_d.field_x = ClubStateFactory.field_g;
        if (HuffmanCodec.field_e == 1) {
          ThumbnailStateFactory.field_d.field_x = new PlayArea[]{new PlayArea(368, 600, 528, 1200)};
          ThumbnailStateFactory.field_d.field_B = ThumbnailStateFactory.field_d.field_x;
        } else {
          if (HuffmanCodec.field_e != 2) {
            if (HuffmanCodec.field_e != 3) {
              if (HuffmanCodec.field_e != 4) {
                if (HuffmanCodec.field_e != 5) {
                  if (6 == HuffmanCodec.field_e) {
                    ThumbnailStateFactory.field_d.field_x = new PlayArea[]{new PlayArea(320, 0, 660, 1344)};
                    ThumbnailStateFactory.field_d.field_B = new PlayArea[]{new PlayArea(0, 0, 896, 1344)};
                  } else {
                    if (HuffmanCodec.field_e != 7) {
                      if (HuffmanCodec.field_e == 8) {
                        ThumbnailStateFactory.field_d.field_x = new PlayArea[]{new PlayArea(10, 200, 860, 300), new PlayArea(348, 100, 648, 400), new PlayArea(10, 610, 860, 710), new PlayArea(258, 510, 558, 810), new PlayArea(10, 1000, 860, 1100), new PlayArea(298, 900, 748, 1200), new PlayArea(760, 200, 860, 710), new PlayArea(10, 610, 110, 1100)};
                        ThumbnailStateFactory.field_d.field_B = ThumbnailStateFactory.field_d.field_x;
                      } else {
                        if (HuffmanCodec.field_e == 9) {
                          ThumbnailStateFactory.field_d.field_x = new PlayArea[]{new PlayArea(0, 0, 896, 800)};
                          ThumbnailStateFactory.field_d.field_B = new PlayArea[]{new PlayArea(0, 0, 896, 1344)};
                        } else {
                          if (HuffmanCodec.field_e != 10 &&
                            HuffmanCodec.field_e != 11) {
                            if (HuffmanCodec.field_e == 12) {
                              ThumbnailStateFactory.field_d.field_x = new PlayArea[]{};
                              ThumbnailStateFactory.field_d.field_B = new PlayArea[]{new PlayArea(0, 0, 896, 530), new PlayArea(370, -45, 525, 530, 0, 45)};
                            } else {
                              if ((HuffmanCodec.field_e == 13)) {
                                ThumbnailStateFactory.field_d.field_x = new PlayArea[]{new PlayArea(0, 0, 896, 530)};
                                ThumbnailStateFactory.field_d.field_B = new PlayArea[]{new PlayArea(0, 0, 896, 530), new PlayArea(370, -45, 525, 530, 0, 45)};
                              }
                            }
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            ThumbnailStateFactory.field_d.field_x = new PlayArea[]{new PlayArea(300, 466, 850, 646), new PlayArea(0, 672, 100, 1344)};
                            ThumbnailStateFactory.field_d.field_B = ThumbnailStateFactory.field_d.field_x;
                          }
                        }
                      }
                    } else {
                      ThumbnailStateFactory.field_d.field_x = new PlayArea[]{new PlayArea(60, 250, 300, 700), new PlayArea(320, 0, 896, 1344)};
                      ThumbnailStateFactory.field_d.field_B = ThumbnailStateFactory.field_d.field_x;
                    }
                  }
                } else {
                  ThumbnailStateFactory.field_d.field_x = new PlayArea[]{};
                  ThumbnailStateFactory.field_d.field_B = new PlayArea[]{new PlayArea(0, 0, 896, 900), new PlayArea(0, 940, 896, 1344), new PlayArea(826, 0, 896, 1344), new PlayArea(0, 0, 710, 1344)};
                }
              } else {
                ThumbnailStateFactory.field_d.field_x = new PlayArea[]{};
                ThumbnailStateFactory.field_d.field_B = new PlayArea[]{new PlayArea(0, 0, 896, 1344)};
              }
            } else {
              ThumbnailStateFactory.field_d.field_x = new PlayArea[]{new PlayArea(390, 220, 850, 320), new PlayArea(600, 220, 850, 620), new PlayArea(20, 470, 850, 620), new PlayArea(20, 470, 200, 900), new PlayArea(20, 800, 390, 900), new PlayArea(310, 800, 390, 1160), new PlayArea(310, 1060, 850, 1160)};
              ThumbnailStateFactory.field_d.field_B = ThumbnailStateFactory.field_d.field_x;
            }
          } else {
            ThumbnailStateFactory.field_d.field_x = new PlayArea[]{new PlayArea(368, 240, 528, 770)};
            ThumbnailStateFactory.field_d.field_B = ThumbnailStateFactory.field_d.field_x;
          }
        }

    }

    final static int a(int param0, PlayerStats param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 928) {
            stackIn_4_0 = (5 * param1.getHighestBaseStat((byte) 73) + param1.tackle + param1.power + param1.speed) / 8;
            return stackIn_4_0;
          }
          stackIn_2_0 = -33;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("p.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 != -24) {
          return 63;
        }
        return ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(112, param1, TextLineLayoutSupport.field_e);
    }

    final void recordTick(int param0, CommonGame param1) {
        int[] dupTemp$8 = null;
        int var4 = 0;
        BallAgent var5 = null;
        BallAgent var6 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4Lifetime1;
        try {
          if (param0 != -27626) {
            return;
          }
          var5 = param1.field_V;
          var6 = var5;
          if (88080384 != var6.pixelY(879306160)) {
            stackIn_7_0 = (var6.positionY < 44040192) ? 0 : 1;
            var4 = stackIn_7_0;
            if (var6.positionY == 44040192) {
              var4 = this.field_e;
              this.field_e = 1 - this.field_e;
            }
            this.pitchEnds[var4] = this.pitchEnds[var4] + 1;
          }
          if (var6.possessorTeam == -1) {
            this.nobody = this.nobody + 1;
          } else {
            dupTemp$8 = this.perFootballer[var5.possessorTeam];
            dupTemp$8[var5.possessorSlot] = dupTemp$8[var5.possessorSlot] + 1;
            var4Lifetime1 = param1.findControllingParticipant((byte) 6, var6.possessorTeam, var6.possessorSlot);
            if (var4Lifetime1 != -1) {
              this.perPlayer[var4Lifetime1] = this.perPlayer[var4Lifetime1] + 1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("p.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 320) {
          LoggedPossession.a(false);
        }
        field_a = null;
    }

    public final String toString() {
        int var2 = 0;
        StringBuilder discarded$39 = null;
        StringBuilder discarded$40 = null;
        int var3;
        StringBuilder var4;
        StringBuilder var5;
        var3 = Kickabout.field_G;
        var4 = new StringBuilder();
        var5 = var4;
        StringBuilder discarded$34 = var5.append(" pitchEnds=" + this.pitchEnds[0] + "." + this.pitchEnds[1]);
        StringBuilder discarded$35 = var5.append(" perFootballerHome=" + this.perFootballer[0][0] + "." + this.perFootballer[0][1] + "." + this.perFootballer[0][2] + "." + this.perFootballer[0][3]);
        StringBuilder discarded$36 = var5.append(" perFootballerAway=" + this.perFootballer[1][0] + "." + this.perFootballer[1][1] + "." + this.perFootballer[1][2] + "." + this.perFootballer[1][3]);
        StringBuilder discarded$37 = var5.append(" perPlayer=");
        for (var2 = 0; var2 < this.perPlayer.length; var2++) {
          discarded$39 = var4.append(this.perPlayer[var2]);
          if (var2 < this.perPlayer.length - 1) {
            discarded$40 = var5.append(".");
          }
        }
        StringBuilder discarded$38 = var5.append(" nobody=" + this.nobody);
        return "LoggedPosession{" + var5.toString() + "}";
    }

    final void copyFrom(int param0, LoggedPossession param1) {
        int var4 = 0;
        int var3_int = 0;
        int var5 = Kickabout.field_G;
        int var3_intLifetime1;
        int var3_intLifetime2;
        try {
          for (var3_int = 0; var3_int < 2; var3_int++) {
            this.pitchEnds[var3_int] = param1.pitchEnds[var3_int];
          }
          for (var3_intLifetime1 = 0; var3_intLifetime1 < 2; var3_intLifetime1++) {
            for (var4 = 0; var4 < 5; var4++) {
              this.perFootballer[var3_intLifetime1][var4] = param1.perFootballer[var3_intLifetime1][var4];
            }
          }
          for (var3_intLifetime2 = 0; this.perPlayer.length > var3_intLifetime2; var3_intLifetime2++) {
            this.perPlayer[var3_intLifetime2] = param1.perPlayer[var3_intLifetime2];
          }
          if (param0 <= 27) {
            LoggedPossession.a(true);
          }
          this.nobody = param1.nobody;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "p.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    LoggedPossession(int param0) {
        this.field_e = 0;
        this.pitchEnds = new int[2];
        this.perFootballer = new int[2][5];
        this.perPlayer = new int[param0];
    }

    static {
        field_a = "Loading menus";
    }
}
