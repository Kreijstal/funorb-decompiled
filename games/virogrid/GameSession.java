/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameSession {
    boolean field_l;
    boolean online;
    int localPlayer;
    private int field_i;
    private int field_z;
    private int field_o;
    GameBoard board;
    CellAnimator animator;
    int field_n;
    private int field_c;
    private int cellSize;
    private int field_p;
    private int field_B;
    private String field_a;
    static String field_s;
    boolean field_t;
    int field_v;
    static byte[] field_f;
    private int hoverColumn;
    private int hoverRow;
    private int field_k;
    private int tickCount;
    private int field_m;
    static String field_b;
    int turnTimer;
    private int field_d;
    private int field_u;
    static rm[] field_y;
    boolean field_D;
    private int field_q;

    private final void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int dupTemp$4 = 0;
        int fieldTemp$3 = 0;
        String stackIn_7_0 = null;
        String[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        String[] stackIn_50_2 = null;
        String stackIn_51_3;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        String stackIn_74_2 = null;
        String[] stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        String stackIn_93_2 = null;
        String[] stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        String stackIn_98_2 = null;
        String[] stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        String stackIn_102_2 = null;
        Object stackIn_131_0 = null;
        String stackIn_131_1 = null;
        String var2_ref_String;
        int var2;
        String var3_ref_String;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        var6 = Virogrid.field_F ? 1 : 0;
        if (this.board.finished) {
          if (this.board.currentPlayer >= 0) {
            if (this.online &&
              this.board.currentPlayer == this.localPlayer) {
              gh.field_Fb = gg.field_N;
            } else {
              gh.field_Fb = oi.a(new String[]{this.board.playerNames[this.board.currentPlayer]}, rf.field_j, 2);
            }
          } else {
            gh.field_Fb = ne.field_b;
          }
        } else {
          if (this.board.currentPlayer < 0) {
            gh.field_Fb = "";
          } else {
            var2_ref_String = Integer.toString((this.turnTimer + 49) / 50);
            if (this.online) {
              if (this.board.currentPlayer == 0) {
                stackIn_7_0 = GameApplet.textColourBlue;
              } else {
                stackIn_7_0 = pb.textColourWhite;
              }
              var3_ref_String = stackIn_7_0;
              if (this.board.currentPlayer == this.localPlayer) {
                gh.field_Fb = oi.a(new String[]{var3_ref_String, var2_ref_String}, gf.textYourTurnPlaying, 2);
              } else {
                gh.field_Fb = oi.a(new String[]{var3_ref_String, var2_ref_String, this.board.playerNames[this.board.currentPlayer]}, ie.textXTurnPlaying, 2);
              }
            } else {
              gh.field_Fb = oi.a(new String[]{this.board.playerNames[this.board.currentPlayer], var2_ref_String}, hc.textXTurn, 2);
            }
          }
        }
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder0 = true;
        if (null != gh.field_Fb) {
          decompiledFrameRemainder0 = !(!gh.field_Fb.equals(ej.field_M));
        } else {
          decompiledFrameRemainder0 = (null == ej.field_M);
        }
        if (decompiledFrameRemainder0) {
          wm.field_u = 0;
          decompiledFrameRemainder1 = false;
        }
        if (decompiledFrameRemainder1) {
          fieldTemp$0 = wm.field_u + 8;
          wm.field_u = wm.field_u + 8;
          if (fieldTemp$0 >= 256) {
            ej.field_M = gh.field_Fb;
            wm.field_u = 0;
          }
        }
        boolean decompiledFrameRemainder2 = true;
        vg.smallFont.a(gh.field_Fb);
        if (this.field_D && (!this.online ||
          this.board.currentPlayer == this.localPlayer)) {
          fieldTemp$1 = this.field_i + 1;
          this.field_i = this.field_i + 1;
          if (!(fieldTemp$1 <= 28)) {
            this.field_i = 28;
          }
          decompiledFrameRemainder2 = false;
        }
        else {
          fieldTemp$2 = this.field_i - 1;
          this.field_i = this.field_i - 1;
          if (0 > fieldTemp$2) {
            this.field_i = 0;
          }
        }
        if (this.online) {
          for (var2 = 0; var2 < 2; var2++) {
            if (var2 == this.localPlayer) {
              if (0 == (1 << var2 & this.board.field_r)) {
                if (!this.board.finished &&
                  (1 << var2 & this.board.field_D) != 0) {
                  ve.field_v[var2] = pl.field_f;
                } else {
                  if ((this.board.field_b & 1 << var2) == 0) {
                    ve.field_v[var2] = null;
                  } else {
                    stackIn_73_0 = ve.field_v;
                    stackIn_73_1 = var2;
                    if (this.field_t) {
                      stackIn_74_2 = u.field_u;
                    } else {
                      stackIn_74_2 = fl.field_r;
                    }
                    stackIn_73_0[stackIn_73_1] = stackIn_74_2;
                  }
                }
              } else {
                if ((1 << var2 & this.board.field_b) != 0) {
                  ve.field_v[var2] = nd.field_b;
                } else {
                  ve.field_v[var2] = h.field_d;
                }
              }
            } else {
              var3_ref_String = this.board.playerNames[var2];
              if ((this.board.field_r & 1 << var2) != 0) {
                if ((1 << var2 & this.field_v) != 0) {
                  ve.field_v[var2] = oi.a(new String[]{var3_ref_String}, mh.field_f, 2);
                } else {
                  if ((this.board.field_b & 1 << var2) == 0) {
                    ve.field_v[var2] = oi.a(new String[]{var3_ref_String}, qn.field_L, 2);
                  } else {
                    ve.field_v[var2] = oi.a(new String[]{var3_ref_String}, c.field_f, 2);
                  }
                }
              } else {
                if ((1 << var2 & this.field_v) == 0) {
                  if (!this.board.finished &&
                    (this.board.field_D & 1 << var2) != 0) {
                    ve.field_v[var2] = oi.a(new String[]{var3_ref_String}, wa.field_S, 2);
                  } else {
                    if ((this.board.field_b & 1 << var2) != 0) {
                      stackIn_50_0 = ve.field_v;
                      stackIn_50_1 = var2;
                      stackIn_50_2 = new String[]{var3_ref_String};
                      if (!this.field_t) {
                        stackIn_51_3 = bl.field_H;
                      } else {
                        stackIn_51_3 = lg.field_b;
                      }
                      stackIn_50_0[stackIn_50_1] = oi.a(stackIn_50_2, stackIn_51_3, 2);
                    } else {
                      ve.field_v[var2] = null;
                    }
                  }
                } else {
                  ve.field_v[var2] = oi.a(new String[]{var3_ref_String}, nf.field_a, 2);
                }
              }
            }
          }
          if (this.localPlayer == -2) {
            this.field_z = -1;
            ve.field_v[3] = sj.field_d;
            ve.field_v[2] = null;
            this.field_q = 3;
          } else if (!this.board.finished) {
            this.field_q = -1;
            this.field_z = 2;
            ve.field_p[3] = null;
            if (0 != (1 << this.localPlayer & this.board.field_D)) {
              ve.field_v[2] = je.field_E;
            } else if (this.board.field_D != 0) {
              ve.field_v[2] = of.field_c;
            } else {
              ve.field_v[2] = null;
              this.field_z = -1;
            }
          } else {
            this.field_z = 2;
            this.field_q = 3;
            ve.field_v[3] = sj.field_d;
            if (this.field_v != 0) {
              ve.field_v[2] = null;
              this.field_z = -1;
            } else if ((this.board.field_b & 1 << this.localPlayer) != 0) {
              stackIn_92_0 = ve.field_v;
              stackIn_92_1 = 2;
              if (!this.field_t) {
                stackIn_93_2 = (String) (field_s);
              } else {
                stackIn_93_2 = (String) (field_b);
              }
              stackIn_92_0[stackIn_92_1] = stackIn_93_2;
            } else if (this.board.field_b == 0) {
              stackIn_101_0 = ve.field_v;
              stackIn_101_1 = 2;
              if (!this.field_t) {
                stackIn_102_2 = eb.field_g;
              } else {
                stackIn_102_2 = ei.field_e;
              }
              stackIn_101_0[stackIn_101_1] = stackIn_102_2;
            } else {
              stackIn_97_0 = ve.field_v;
              stackIn_97_1 = 2;
              if (this.field_t) {
                stackIn_98_2 = pb.field_m;
              } else {
                stackIn_98_2 = rf.field_g;
              }
              stackIn_97_0[stackIn_97_1] = stackIn_98_2;
            }
          }
        } else {
          ve.field_v[2] = null;
          ve.field_v[3] = null;
          if (this.board.finished) {
            this.field_q = 1;
            this.field_z = 0;
            ve.field_v[0] = hg.textPlayAgain;
            ve.field_v[1] = sj.field_d;
          } else {
            ve.field_v[0] = null;
            ve.field_v[1] = null;
          }
        }
        var2Lifetime1 = 0;
        for (var3 = 0; var3 < 4; var3++) {
          if (null != ve.field_v[var3]) {
            if (var2Lifetime1 != var3) {
              ve.field_v[var2Lifetime1] = ve.field_v[var3];
              if (var3 == this.field_z) {
                this.field_z = var2Lifetime1;
              }
              if (var3 == this.field_q) {
                this.field_q = var2Lifetime1;
              }
            }
            var2Lifetime1++;
          }
        }
        for (var3Lifetime1 = var2Lifetime1; 4 > var3Lifetime1; var3Lifetime1++) {
          ve.field_v[var3Lifetime1] = null;
        }
        for (var3Lifetime2 = 0; 4 > var3Lifetime2; var3Lifetime2++) {
          stackIn_131_0 = null;
          stackIn_131_1 = ve.field_v[var3Lifetime2];
          regionExit1: {
            regionExit2: {
              if (stackIn_131_0 != stackIn_131_1) {
                if (!ve.field_v[var3Lifetime2].equals(ve.field_p[var3Lifetime2])) {
                  break regionExit2;
                }
              } else {
                if (ve.field_p[var3Lifetime2] != null) {
                  break regionExit2;
                }
              }
              ve.field_A[var3Lifetime2] = 0;
              break regionExit1;
            }
            dupTemp$4 = ve.field_A[var3Lifetime2] + 8;
            ve.field_A[var3Lifetime2] = dupTemp$4;
            if (256 <= dupTemp$4) {
              ve.field_p[var3Lifetime2] = ve.field_v[var3Lifetime2];
              ve.field_A[var3Lifetime2] = 0;
            }
          }
        }
        if (param0) {
          this.a(true);
        }
        ve.field_y = 0;
        var3Lifetime3 = 1;
        for (var4 = 0; var4 < 4; var4++) {
          if (null != ve.field_v[var4]) {
            var5 = vg.smallFont.a(ve.field_v[var4].toUpperCase());
            if (var5 > var3Lifetime3) {
              var3Lifetime3 = var5;
            }
          }
        }
        var7 = 0;
        var4Lifetime1 = var7;
        while (var7 < 4) {
          if (ve.field_v[var7] != null) {
            ve.field_B[var7] = var3Lifetime3;
            if (ve.field_y < 32 + ve.field_B[var7] + 17) {
              ve.field_y = 32 + ve.field_B[var7] + 17;
            }
          }
          var7++;
        }
        ie.field_e = ie.field_e + (-ie.field_e + (float)ve.field_y) * 0.10000000149011612f;
        if (this.board.finished) {
          fieldTemp$3 = this.field_n + 1;
          this.field_n = this.field_n + 1;
          if (150 < fieldTemp$3) {
          }
        }
        CellFlip.field_m = dn.field_b;
        if (!bl.field_B) {
          if (wc.field_j > 1) {
            CellFlip.field_m = oi.a(new String[]{Integer.toString(wc.field_j)}, sj.field_e, 2);
          } else {
            if (wc.field_j == 1) {
              CellFlip.field_m = cj.field_q;
            } else {
              CellFlip.field_m = DualLinkNode.field_n;
            }
          }
        }
    }

    final static boolean c(byte param0) {
        if (ba.field_a == -1) {
          if (!wg.a(1, 0)) {
            return false;
          }
          ba.field_a = sh.field_qb.readUnsignedByte(11132);
          sh.field_qb.position = 0;
        }
        if (param0 != 48) {
          field_y = (rm[]) null;
        }
        if (-2 == ba.field_a) {
          if (!wg.a(2, 0)) {
            return false;
          }
          ba.field_a = sh.field_qb.readUnsignedShort((byte) -109);
          sh.field_qb.position = 0;
        }
        return wg.a(ba.field_a, 0);
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4) {
        gk.field_g.g(58, 8);
        gk.field_g.a(this.board.turnCount, -70);
        gk.field_g.a(param3, param4 - 19);
        gk.field_g.a(param2, 56);
        gk.field_g.a(param0, param4 - 177);
        gk.field_g.a(param1, 91);
        if (null == this.animator.field_j) {
        }
        this.animator.field_j = new bi(param2, param3, this.board.turnCount, param1, param0);
        if (param4 != 85) {
          field_y = (rm[]) null;
        }
    }

    private final int b(int param0, int param1) {
        if (param0 != 200) {
          return -47;
        }
        return param1 == 0 ? 30136 : 16777215;
    }

    private final void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (0 < param1) {
          Rasterizer.c(param0, param3, param1, param2);
        }
        if (param4) {
          this.a((byte) 104, false);
        }
    }

    private final void chooseAiMove(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        this.field_D = false;
        this.animator.selectedColumn = -1;
        this.animator.selectedRow = -1;
        this.board.collectBestMoves(param0, 0);
        if (this.board.candidateCount > 0) {
          var3 = id.field_r % this.board.candidateCount;
          var4 = this.board.candidateDestRows[var3];
          var5 = this.board.candidateDestColumns[var3];
          var6 = this.board.candidateSourceRows[var3];
          var7 = this.board.candidateSourceColumns[var3];
          if (!this.online) {
            this.performMove(-13020, var6, var5, var7, var4);
          } else {
            this.a(var6, var7, var5, var4, (byte) 85);
          }
        }
        if (param1 != -11272) {
          this.field_i = 18;
        }
    }

    final static lk a(long param0, byte param1) {
        if (param1 != -127) {
          GameSession.c((byte) 111);
        }
        return (lk) (ah.field_h.a(param0, (byte) 99));
    }

    final void c(int param0) {
        if (!this.online) {
          throw new IllegalStateException();
        }
        gk.field_g.g(param0, 8);
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 23320) {
          field_b = (String) null;
        }
        field_f = null;
        field_s = null;
        field_y = null;
    }

    final void c(int param0, boolean param1) {
        int var15 = 0;
        int stackIn_8_0 = 0;
        String stackIn_125_0 = null;
        int stackIn_136_0 = 0;
        int stackIn_139_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        String var6_ref_String;
        String var7_ref_String;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var16;
        int var17;
        Sprite var18;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var9Lifetime2;
        int var10Lifetime2;
        int var11Lifetime2;
        int var12Lifetime1;
        String var6_ref_StringLifetime1;
        String var6_ref_StringLifetime2;
        String var7_ref_StringLifetime1;
        int var9Lifetime3;
        var17 = Virogrid.field_F ? 1 : 0;
        if (this.board.finished) {
          if (!this.animator.flips.b((byte) 26)) {
            stackIn_8_0 = (-2 == this.localPlayer) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
        } else {
          stackIn_8_0 = 1;
        }
        var3 = stackIn_8_0;
        if (var3 != 0) {
          var4 = 0;
          var5 = 0;
          for (var6 = 0; var6 < 4; var6++) {
            if (ve.field_p[var6] == null) {
              if (null != ve.field_v[var6]) {
                var5++;
              }
            } else {
              var5++;
            }
          }
          if (this.board.finished &&
            -1 == i.field_y &&
            -1 == hm.field_c) {
            var7_ref_String = "";
            var6_ref_String = var7_ref_String;
            var7_ref_StringLifetime1 = var6_ref_String;
            var6_ref_StringLifetime1 = var7_ref_StringLifetime1;
            if (this.board.currentPlayer != -1) {
              if (this.online &&
                this.localPlayer == this.board.currentPlayer) {
                var6_ref_StringLifetime2 = gg.field_N;
              } else {
                var6_ref_StringLifetime2 = oi.a(new String[]{this.board.playerNames[this.board.currentPlayer]}, rf.field_j, 2);
                var7_ref_StringLifetime1 = var6_ref_StringLifetime2;
                var7_ref_StringLifetime1 = var6_ref_StringLifetime2;
              }
            } else {
              var6_ref_StringLifetime2 = ne.field_b;
            }
            if (!(this.board.currentPlayer < 0) ||
              this.board.currentPlayer == -1 &&
              this.board.boardFilled) {
              if (!this.board.boardFilled) {
                if (this.board.playerWipedOut) {
                  if (this.online &&
                    this.localPlayer == 1 - this.board.currentPlayer) {
                    var7_ref_StringLifetime1 = id.textEndgameNopiecesYou;
                  } else {
                    var7_ref_StringLifetime1 = oi.a(new String[]{this.board.playerNames[-this.board.currentPlayer + 1]}, cg.textEndgameNopieces, 2);
                  }
                } else {
                  if (this.board.field_r != 0) {
                    if (this.online &&
                      -this.board.currentPlayer + 1 == this.localPlayer) {
                      var7_ref_StringLifetime1 = pg.textEndgameResignedYou;
                    } else {
                      var7_ref_StringLifetime1 = oi.a(new String[]{this.board.playerNames[1 - this.board.currentPlayer]}, vm.textEndgameResigned, 2);
                    }
                  } else {
                    if (this.turnTimer <= 1) {
                      if (this.online &&
                        this.localPlayer == -this.board.currentPlayer + 1) {
                        var7_ref_StringLifetime1 = ao.textEndgameNotimeYou;
                      } else {
                        var7_ref_StringLifetime1 = oi.a(new String[]{this.board.playerNames[1 - this.board.currentPlayer]}, dd.textEndgameNotime, 2);
                      }
                    }
                  }
                }
              } else {
                if (-1 != this.board.currentPlayer) {
                  if (this.online &&
                    this.board.currentPlayer == this.localPlayer) {
                    var7_ref_StringLifetime1 = fh.textEndgameBoardfilledYou;
                  } else {
                    var7_ref_StringLifetime1 = oi.a(new String[]{this.board.playerNames[this.board.currentPlayer]}, rc.textEndgameBoardfilled, 2);
                  }
                } else {
                  var7_ref_StringLifetime1 = vf.textEndgameBoardfilledDraw;
                }
              }
            }
            var8 = hd.standardFont.a(var6_ref_StringLifetime2) / 2;
            var9 = mc.menuFont.a(var7_ref_StringLifetime1) / 2;
            if (var9 > var8) {
              var8 = var9;
            }
            var9Lifetime3 = ve.field_B[0] / 2;
            if (var8 < var9Lifetime3) {
              var8 = var9Lifetime3;
            }
            var10 = j.field_b;
            var11 = -24 + tm.field_g;
            var12 = 0;
            var13 = 36;
            var12 += 12;
            var12 += 26;
            var13 += 26;
            var12 = var12 + (18 * var5 / 2 + 8);
            var13 = var13 + 18 * var5;
            var8 += 20;
            var14 = 2 + (int)((Math.cos((double)((float)id.field_r / 20.0f)) + 1.0) * 8.0);
            for (var15 = 0; var15 < 9; var15++) {
              var16 = var14 * (-var15 + 9) >>> 3;
              Rasterizer.a(-var8 + (var10 - var16), var12 + (var11 - var13 - var16), var8 + var16 << 1, var13 + var16 << 1, 10, 1141646, 26);
            }
            Rasterizer.a(-var8 + var10, var12 + (-var13 + var11), var8 << 1, var13 << 1, 10, 0, 180);
            var4 = 1;
            hd.standardFont.c(var6_ref_StringLifetime2, var10, -2 + var11 + hd.standardFont.field_H / 2, 16777215, -1);
            var11 = var11 + (hd.standardFont.field_H / 2 * 5 - 2);
            if (!(var7_ref_StringLifetime1.length() <= 0)) {
              mc.menuFont.c(var7_ref_StringLifetime1, var10, -2 + var11 + mc.menuFont.field_H / 2, 16777215, -1);
            }
          }
          if (!this.online) {
            var4 = 1;
          }
          if (var4 == 0 &&
            i.field_y == -1) {
            var6Lifetime2 = 2147483647;
            var7 = 0;
            for (var8Lifetime2 = 0; var8Lifetime2 < 4; var8Lifetime2++) {
              if (null != ve.field_p[var8Lifetime2] ||
                null != ve.field_v[var8Lifetime2]) {
                var7 += 20;
                if ((float)var6Lifetime2 > ie.field_e) {
                  var6Lifetime2 = (int)ie.field_e;
                }
              }
            }
            if (2147483647 != var6Lifetime2) {
              Rasterizer.a(-4 + (-var6Lifetime2 + 651), -28, 8 + var6Lifetime2, 32 + var7, 4, 0, 200);
            }
          }
          for (var6Lifetime3 = 0; 4 > var6Lifetime3; var6Lifetime3++) {
            regionExit1: {
              var7Lifetime2 = 1141646;
              if (var6Lifetime3 == this.field_z ||
                var6Lifetime3 == this.field_q) {
                if (i.field_y != -1) {
                  break regionExit1;
                }
                if (var6Lifetime3 == this.field_u) {
                  var7Lifetime2 = 16777215;
                }
                if (20 > id.field_r % 40 &&
                  this.board.finished) {
                  var7Lifetime2 = 8421504 | (16711422 & var7Lifetime2) >> 1;
                }
              }
              if (null != ve.field_p[var6Lifetime3] ||
                ve.field_v[var6Lifetime3] != null) {
                var8Lifetime3 = 651;
                var9Lifetime2 = 0;
                if (var4 != 0) {
                  var9Lifetime2 = 80 + tm.field_g;
                  var8Lifetime3 = 400;
                }
                var10Lifetime2 = -3 + (1 + var6Lifetime3) * 20 + (-2 + var9Lifetime2);
                var11Lifetime2 = var8Lifetime3 - (int)ie.field_e;
                if (var4 != 0) {
                  var11Lifetime2 = 320 + (-(ve.field_B[var6Lifetime3] / 2) - 16);
                }
                var12Lifetime1 = var11Lifetime2 + (32 + ve.field_B[var6Lifetime3]);
                if (ve.field_A[var6Lifetime3] == 0) {
                  if (ve.field_v[var6Lifetime3] != null) {
                    Rasterizer.e(var11Lifetime2, vg.smallFont.field_G - (vg.smallFont.field_H - var10Lifetime2), 32 + ve.field_B[var6Lifetime3], 18, 4, 1141646);
                    vg.smallFont.b(ve.field_p[var6Lifetime3].toUpperCase(), -(vg.smallFont.a(ve.field_v[var6Lifetime3].toUpperCase()) >> 1) + (var12Lifetime1 + var11Lifetime2) / 2, var10Lifetime2, var7Lifetime2, -1);
                  }
                } else {
                  if (ve.field_p[var6Lifetime3] != null) {
                    vg.smallFont.c(ve.field_p[var6Lifetime3].toUpperCase(), (var11Lifetime2 + var12Lifetime1) / 2 - (vg.smallFont.a(ve.field_p[var6Lifetime3].toUpperCase()) >> 1), var10Lifetime2, var7Lifetime2, -1, 256 - ve.field_A[var6Lifetime3]);
                  }
                  if (null != ve.field_v[var6Lifetime3]) {
                    vg.smallFont.c(ve.field_v[var6Lifetime3].toUpperCase(), -(vg.smallFont.a(ve.field_v[var6Lifetime3].toUpperCase()) >> 1) + (var12Lifetime1 + var11Lifetime2) / 2, var10Lifetime2, var7Lifetime2, -1, ve.field_A[var6Lifetime3]);
                  }
                }
              }
            }
          }
        }
        if (this.online) {
          stackIn_125_0 = CellFlip.field_m;
          if (stackIn_125_0 != null) {
            var4Lifetime1 = 18 + vg.smallFont.a(CellFlip.field_m.toUpperCase());
            vi.field_k = vi.field_k + ((float)var4Lifetime1 - vi.field_k) * 0.5f;
            if (this.field_u == -2 &&
              param1) {
              stackIn_136_0 = 1;
            } else {
              if (wc.field_j > 0) {
                stackIn_136_0 = (20 > id.field_r % 40) ? 1 : 0;
              } else {
                stackIn_136_0 = 0;
              }
            }
            var5Lifetime1 = stackIn_136_0;
            stackIn_139_0 = (var5Lifetime1 == 0) ? 1141646 : 16777215;
            var6Lifetime1 = stackIn_139_0;
            Rasterizer.a(-4, -21 + (-2 + we.field_c.field_J), (int)vi.field_k + 8, 34, 4, 0, 200);
            var7Lifetime1 = 256;
            var8Lifetime1 = -20 + we.field_c.field_J;
            var9Lifetime1 = 1;
            var10Lifetime1 = (int)vi.field_k;
            var11Lifetime1 = 18;
            if (var10Lifetime1 > 8 &&
              var11Lifetime1 > 8) {
              Rasterizer.e(var9Lifetime1, var8Lifetime1, var10Lifetime1, var11Lifetime1, 4, 1141646);
            }
            vg.smallFont.b(CellFlip.field_m.toUpperCase(), ((int)vi.field_k >> 1) + var9Lifetime1, -2 + (we.field_c.field_J - 4), var6Lifetime1, -1, var7Lifetime1);
          }
        }
        if (param0 != -16) {
          var18 = (Sprite) null;
          this.a((Sprite) null, (byte) 103, true);
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = Virogrid.field_F ? 1 : 0;
        int var2Lifetime1;
        int var2Lifetime2;
        if (13 == um.field_Gb) {
          var2 = 2;
          if (!this.online) {
            vm.$cfr$intArgs$a$45c25716b3df(30, ih.field_d);
            this.a(true, var2, 22273, false);
            return;
          }
          if (this.localPlayer < 0) {
            var2Lifetime2 = 5;
          } else {
            if (!this.board.finished) {
              var2Lifetime2 = 3;
            } else {
              var2Lifetime2 = 4;
            }
          }
          vm.$cfr$intArgs$a$45c25716b3df(30, ih.field_d);
          this.a(true, var2Lifetime2, 22273, false);
          return;
        }
        var2Lifetime1 = -20 / ((param0 - 36) / 54);
    }

    private final void a(int param0, boolean param1, Sprite param2) {
        int var4_int = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        int var7 = 0;
        CellFlip var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var6Lifetime1;
        int var7Lifetime1;
        int var9Lifetime1;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          pj.a(param2, 256);
          Rasterizer.b(100, param0, 10, 400, 0);
          Rasterizer.b(530, 0, 10, 400, 0);
          Rasterizer.b(110, 0, 420, 400, 191);
          for (var4_int = 0; var4_int < this.animator.displayedCells.length; var4_int++) {
            for (var5 = 0; var5 < this.animator.displayedCells[0].length; var5++) {
              var7 = -(this.cellSize * var5) - this.field_p + 370;
              if (param1) {
                stackIn_8_0 = var4_int * this.cellSize + this.field_B + 140;
              } else {
                stackIn_8_0 = -this.field_B + (500 - this.cellSize * var4_int);
              }
              var6 = stackIn_8_0;
              var8_int = 0;
              var9 = this.b(var4_int, var5, -2096, this.turnPulse(param0 ^ 6121), var8_int);
              Rasterizer.c(var6, var7, this.field_o, var9);
            }
          }
          var8 = (CellFlip) (this.animator.flips.a((byte) -117));
          while (var8 != null) {
            stackIn_15_0 = (var8.newOwnerIsFirstPlayer) ? 12517376 : 16777215;
            var9Lifetime1 = stackIn_15_0;
            if (param1) {
              stackIn_18_0 = this.field_B + (140 + this.cellSize * var8.row);
            } else {
              stackIn_18_0 = -this.field_B + 500 - var8.row * this.cellSize;
            }
            var6Lifetime1 = stackIn_18_0;
            var7Lifetime1 = -(this.cellSize * var8.column) - this.field_p + 370;
            if (var8.phase != 0) {
              if (var8.phase == 1) {
                Rasterizer.b(var6Lifetime1 - (var8.field_n >> 1), 0, var8.field_n, var7Lifetime1, var9Lifetime1);
                Rasterizer.c(var6Lifetime1, var7Lifetime1, var8.field_n, var9Lifetime1);
              } else {
                Rasterizer.b(var6Lifetime1 - (var8.field_n >> 1), 0, var8.field_n, var8.field_h, var9Lifetime1);
                Rasterizer.c(var6Lifetime1, var8.field_h, var8.field_n >> 1, var9Lifetime1);
                Rasterizer.c(var6Lifetime1, var7Lifetime1, this.field_o, var9Lifetime1);
              }
            } else {
              Rasterizer.a(var6Lifetime1, 0, var6Lifetime1, var8.field_h, var9Lifetime1);
            }
            var8 = (CellFlip) (this.animator.flips.a(16213));
          }
          ul.b((byte) 115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("ic.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final void drawStatusPanel(int param0, boolean param1) {
        int var11 = 0;
        int stackIn_5_0 = 0;
        v stackIn_9_0;
        String stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        int stackIn_10_4;
        v stackIn_16_0;
        String stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        int stackIn_17_4;
        int stackIn_84_0 = 0;
        int var3;
        String var4;
        String var5;
        int var5_int;
        String var6;
        int var6_int;
        String var7_ref_String;
        int var7;
        int var8;
        String var9_ref_String;
        int var9;
        int var10;
        int var12;
        int var13;
        String var14;
        String var15;
        String var16;
        String var17;
        var13 = Virogrid.field_F ? 1 : 0;
        ah.a(400, 100, 39, 1141646, 120);
        ah.a(400, 100, 40, 1141646, 120);
        if (this.board.finished) {
          stackIn_84_0 = (this.board.currentPlayer == 0) ? 30136 : 16777215;
          var3 = stackIn_84_0;
          var4 = Integer.toString(this.board.pieceCounts[0]);
          var7_ref_String = var4;
          var6 = var7_ref_String;
          var7_ref_String = var4;
          var5 = Integer.toString(this.board.pieceCounts[1]);
          var7_ref_String = var5;
          var6 = var7_ref_String;
          var7_ref_String = var5;
          if (this.animator.flips.b((byte) 91)) {
            var6 = ne.field_b;
            var7 = 16777215;
            if (0 <= this.board.currentPlayer) {
              if (this.online &&
                this.localPlayer == this.board.currentPlayer) {
                var7 = var3;
                var6 = gg.field_N;
              } else {
                var7 = var3;
                var6 = oi.a(new String[]{this.board.playerNames[this.board.currentPlayer]}, rf.field_j, 2);
              }
            }
            mc.menuFont.c(var6, 320, 30, var7, -1);
            var8 = mc.menuFont.a(var6);
            hd.standardFont.a(var4, Math.min(186, 320 + (-16 - var8 / 2)), 30, 30136, -1);
            hd.standardFont.b(var5, Math.max(456, var8 / 2 + 336), 30, 16777215, -1);
          } else {
            if (this.board.field_g) {
              var6_int = 1 - this.board.lastMovePlayer;
              var7_ref_String = oi.a(new String[]{this.board.playerNames[var6_int]}, ee.textEndgameEntrapment, 2);
              if (this.online &&
                this.localPlayer == var6_int) {
                var7_ref_String = vc.textEndgameEntrapmentYou;
                var6 = var7_ref_String;
                var6 = var7_ref_String;
              }
              mc.menuFont.c(var7_ref_String, 320, 30, 16777215, -1);
            }
          }
        } else {
          pe.a(10, 1141646, 319, (byte) 99, 25);
          pe.a(10, 1141646, 320, (byte) -124, 25);
          var16 = Integer.toString(this.board.pieceCounts[0]);
          var17 = Integer.toString(this.board.pieceCounts[1]);
          hd.standardFont.a(var16, 316, 30, 30136, -1);
          hd.standardFont.b(var17, 326, 30, 16777215, -1);
          if (this.board.currentPlayer >= 0) {
            var5 = oi.a(new String[]{Integer.toString((-1 + (this.turnTimer + 50)) / 50)}, ej.field_O, 2);
            stackIn_5_0 = (this.board.currentPlayer == 0) ? 30136 : 16777215;
            var6_int = stackIn_5_0;
            if (this.online &&
              this.localPlayer == this.board.currentPlayer) {
              stackIn_9_0 = mc.menuFont;
              stackIn_9_1 = vg.field_E;
              stackIn_9_2 = 124;
              stackIn_9_3 = 30;
              if (id.field_r % 20 >= 10) {
                stackIn_10_4 = 8355711 & var6_int >> 1;
              } else {
                stackIn_10_4 = var6_int;
              }
              ((v) (Object) stackIn_9_0).b(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_10_4, -1);
              mc.menuFont.a(var5, 516, 30, 16777215, -1);
            } else {
              var14 = this.board.playerNames[this.board.currentPlayer];
              var7_ref_String = var14;
              var8 = -hd.standardFont.a(var17) + 268;
              var9_ref_String = oi.a(new String[]{var14}, ec.field_y, 2);
              while (var8 < hd.standardFont.a(var9_ref_String)) {
                var15 = var7_ref_String.substring(0, var7_ref_String.length() - 1);
                var7_ref_String = var15;
                var9_ref_String = oi.a(new String[]{var15 + "..."}, ec.field_y, 2);
              }
              stackIn_16_0 = mc.menuFont;
              stackIn_16_1 = var9_ref_String;
              stackIn_16_2 = 516;
              stackIn_16_3 = 30;
              if (this.board.currentPlayer != 0) {
                stackIn_17_4 = 16777215;
              } else {
                stackIn_17_4 = 30136;
              }
              ((v) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_17_4, -1);
              mc.menuFont.b(var5, 124, 30, 16777215, -1);
            }
          }
          var5_int = 0;
          if (!this.board.finished &&
            this.board.currentPlayer >= 0 && (!this.online ||
            this.localPlayer == this.board.currentPlayer)) {
            regionExit1: {
              var6 = "";
              if ((!this.online ||
                !(this.board.turnCount <= 1)) && 0 != this.board.turnCount) {
                if ((!this.online ||
                  !(this.board.turnCount <= 3)) &&
                  this.board.turnCount != 2) {
                  if ((((this.online &&
                    (this.board.turnCount <= 5)) ||
                    this.board.turnCount == 4)) && (!(!b.field_Db))) {
                    var6 = jd.tutorial4;
                  }
                } else {
                  if (!(!b.field_Db)) {
                    var6 = fa.tutorial3;
                  }
                }
                break regionExit1;
              }
              if (b.field_Db) {
                if (this.animator.selectedRow == -1) {
                  var6 = ee.tutorial1;
                  for (var7 = 0; var7 < this.board.cells.length; var7++) {
                    for (var8 = 0; this.board.cells[0].length > var8; var8++) {
                      if (~this.board.cells[var7][var8] == ~this.board.currentPlayer) {
                        this.a(this.cellScreenY(var8, 5975), this.cellScreenY(this.board.cells[0].length / 2, 5975), false, this.b(200, this.board.currentPlayer), this.cellScreenX(param1, 4347, this.board.cells.length / 2), this.cellScreenX(param1, 4347, var7));
                      }
                    }
                  }
                } else {
                  var6 = gl.tutorial2;
                }
              }
            }
            if ((!this.online &&
              this.board.turnCount > 0 ||
              (!(this.board.turnCount <= 1) ||
              this.animator.selectedRow != -1)) &&
              this.board.cells[0].length / 2 == this.hoverColumn) {
              var6 = "";
            }
            if (var6.length() > 0) {
              var5_int = 1;
              if (!var6.equals(this.field_a)) {
                this.field_c = 0;
                this.field_a = var6;
              }
            }
          }
          if (var5_int == 0) {
            this.field_c = this.field_c - 10;
            if (this.field_c < 0) {
              this.field_c = 0;
            }
          } else {
            this.field_c = this.field_c + 10;
            if (200 < this.field_c) {
              this.field_c = 200;
            }
          }
          if (this.field_a.length() > 0 &&
            this.field_c > 0) {
            var6_int = 320;
            var7 = 224;
            var8 = mc.menuFont.c(this.field_a, 23320) + 16;
            var9 = 16 + mc.menuFont.a(this.field_a, 800, 20);
            var10 = (int)(8.0 * (1.0 + Math.cos((double)((float)id.field_r / 20.0f)))) + 2;
            for (var11 = 0; var11 < 9; var11++) {
              var12 = var10 * (9 - var11) >>> 3;
              Rasterizer.a(-(var8 / 2) + var6_int - var12, -var12 + (-(var9 / 2) + var7), var12 + var8 / 2 << 1, var9 / 2 + var12 << 1, 10, 1141646, this.field_c / 7);
            }
            Rasterizer.a(-(var8 / 2) + var6_int, -(var9 / 2) + var7, var8, var9, 10, 0, this.field_c);
            mc.menuFont.a(this.field_a, 320, 220, 0, 0, 16777215, -1, this.field_c, 1, 1, 20);
          }
        }
        if (param0 <= 65) {
          this.field_a = (String) null;
        }
    }

    final static void a(Sprite[] param0, int param1, int param2, Sprite[] param3, int param4, e param5, int param6, int param7, int param8, int param9, boolean param10, int param11) {
        try {
          kh.a(param1, param7, param2, param11, param5, (byte) -59, param3, param4, param1, param7, param6, param0, param8, param5, param10);
          if (param9 != -16824) {
            GameSession.a(117L, (byte) -51);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ic.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, boolean param3) {
        int var5;
        int var6;
        if (param0 &&
          0 == jk.field_c) {
          ai.field_c = cf.field_c;
          kg.field_a = lj.field_r;
        }
        BufferedSocket.a(false, (byte) -106);
        if (!ke.field_p.field_d &&
          mf.a(98, param1)) {
          ka.a(true, (byte) 87);
        }
        var5 = param1;
        if (param2 != 22273) {
          GameSession.b(64);
        }
        var6 = param3 ? 1 : 0;
        gb.a(-2, 0, var6 != 0, var5);
    }

    private final void layoutBoard(int param0) {
        this.cellSize = 360 / (this.animator.displayedCells.length - 1);
        int var2 = 300 / (-1 + this.animator.displayedCells[0].length);
        if (param0 != -6032) {
          this.field_q = -26;
        }
        if (this.cellSize > var2) {
          this.cellSize = var2;
        }
        this.field_B = (360 - this.cellSize * (-1 + this.animator.displayedCells.length)) / 2;
        this.field_p = (-(this.cellSize * (-1 + this.animator.displayedCells[0].length)) + 300) / 2;
        this.field_o = -2 + (int)Math.round((double)this.cellSize / 2.25);
        this.field_d = (int)((double)this.cellSize / 2.25);
        ie.a(this.animator.displayedCells.length, this.cellSize, param0 ^ -30900, this.field_B, this.field_p, this.animator.displayedCells[0].length);
        oj.b(-9, this.cellSize);
    }

    private final void a(Sprite param0, boolean param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_58_0;
        int stackIn_58_1;
        int stackIn_58_2;
        int stackIn_58_3;
        int[] stackIn_59_4;
        int stackIn_110_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_116_2 = 0;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_129_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        CellFlip var15 = null;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var8Lifetime6;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        int var9Lifetime6;
        int var15_intLifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime1;
        var19 = Virogrid.field_F ? 1 : 0;
        try {
          pj.a(param0, 256);
          Rasterizer.b(100, 0, 10, 400, 0);
          Rasterizer.b(530, 0, 10, 400, 0);
          Rasterizer.b(110, 0, 420, 400, 263172);
          var4_int = this.turnPulse(6121);
          if (param2 != 9) {
            return;
          }
          if (var4_int <= 0) {
            stackIn_6_0 = -var4_int;
          } else {
            stackIn_6_0 = var4_int;
          }
          var5 = stackIn_6_0;
          if (!this.board.finished) {
            if (this.animator.selectedRow != -1) {
              stackIn_14_0 = (this.animator.selectedColumn != -1) ? 1 : 0;
            } else {
              stackIn_14_0 = 0;
            }
          } else {
            stackIn_14_0 = 0;
          }
          var10 = stackIn_14_0;
          var11 = (this.field_d >> 1) + this.field_d << 4;
          var12 = 100 - id.field_r % 200;
          if (2 > this.board.turnCount) {
            var11 = this.field_d + this.field_d << 4;
            var12 = -(id.field_r % 50) + 100;
          }
          if (var12 < 0) {
            var12 = -var12;
          }
          if (var10 != 0) {
            var8 = this.cellScreenX(param1, 4347, this.animator.selectedRow);
            var9 = this.cellScreenY(this.animator.selectedColumn, 5975);
            Rasterizer.c(var8, var9, this.field_d, 16776964);
            Rasterizer.c(var8, var9, 1 + this.field_d, 16776964);
            Rasterizer.c(var8, var9, this.field_d, 263172);
          }
          var12 += 100;
          var13 = 0;
          var14 = var5;
          if (this.board.cells.length != 7) {
            if (this.board.cells.length == 9) {
              var14 = (int)((double)var5 * 0.65);
            } else {
              if (11 <= this.board.cells.length) {
                var14 = var5 >> 1;
                var5 = var5 >> 1;
              }
            }
          } else {
            var14 = (int)(0.9 * (double)var5);
          }
          for (var6 = 0; var6 < this.animator.displayedCells.length; var6++) {
            for (var7 = 0; var7 < this.animator.displayedCells[0].length; var7++) {
              var8Lifetime1 = this.cellScreenX(param1, 4347, var6);
              var9Lifetime1 = this.cellScreenY(var7, 5975);
              Rasterizer.c(var8Lifetime1, var9Lifetime1, this.field_o, 996682);
              var15_int = this.b(var6, var7, -2096, var4_int, var13);
              if (var15_int == -1) {
                Rasterizer.c(var8Lifetime1, var9Lifetime1, this.field_o - 3, 263172);
                if (var10 != 0) {
                  var16 = this.board.classifyMove(var7, this.animator.selectedRow, (byte) 99, var6, this.animator.selectedColumn);
                  if (var16 != -1) {
                    this.a(var8Lifetime1, -var14 + this.field_d, this.b(this.animator.selectedRow, this.animator.selectedColumn, -2096, var4_int, var13), var9Lifetime1, false);
                  }
                }
              }
            }
          }
          for (var6Lifetime1 = 0; var6Lifetime1 < this.animator.displayedCells.length; var6Lifetime1++) {
            for (var7Lifetime1 = 0; var7Lifetime1 < this.animator.displayedCells[0].length; var7Lifetime1++) {
              var8Lifetime2 = this.cellScreenX(param1, 4347, var6Lifetime1);
              var9Lifetime2 = this.cellScreenY(var7Lifetime1, param2 ^ 5982);
              if ((!this.online ||
                this.localPlayer == this.board.currentPlayer) && (!this.board.finished &&
                this.animator.displayedCells[var6Lifetime1][var7Lifetime1] == this.board.currentPlayer &&
                this.animator.field_h[var6Lifetime1][var7Lifetime1])) {
                if (this.animator.selectedRow != var6Lifetime1 ||
                  this.animator.selectedColumn != var7Lifetime1) {
                  stackIn_58_0 = var8Lifetime2 << 4;
                  stackIn_58_1 = var9Lifetime2 << 4;
                  stackIn_58_2 = var11;
                  stackIn_58_3 = var12;
                  if (this.board.currentPlayer == 0) {
                    stackIn_59_4 = vb.field_a;
                  } else {
                    stackIn_59_4 = vb.field_j;
                  }
                  Rasterizer.a(stackIn_58_0, stackIn_58_1, stackIn_58_2, stackIn_58_3, stackIn_59_4);
                }
                if (this.turnTimer > sh.turnDurations[this.board.timeSetting] - 200 &&
                  this.turnTimer < -150 + sh.turnDurations[this.board.timeSetting]) {
                  Rasterizer.f(var8Lifetime2, var9Lifetime2, this.field_d + 1, 16776964);
                }
              }
            }
          }
          for (var6Lifetime2 = 0; var6Lifetime2 < this.animator.displayedCells.length; var6Lifetime2++) {
            for (var7Lifetime2 = 0; this.animator.displayedCells[0].length > var7Lifetime2; var7Lifetime2++) {
              boolean decompiledFrameRemainder0 = true;
              var8Lifetime3 = this.cellScreenX(param1, 4347, var6Lifetime2);
              var9Lifetime3 = this.cellScreenY(var7Lifetime2, param2 + 5966);
              var15_intLifetime1 = this.b(var6Lifetime2, var7Lifetime2, -2096, var4_int, var13);
              if (-1 != var15_intLifetime1) {
                if (this.animator.selectedRow == var6Lifetime2 &&
                  this.animator.selectedColumn == var7Lifetime2) {
                  Rasterizer.c(var8Lifetime3, var9Lifetime3, this.field_o - 3, 263172);
                  var16Lifetime1 = -this.field_k + this.field_d;
                  this.a(var8Lifetime3, var16Lifetime1, var15_intLifetime1, var9Lifetime3, false);
                } else {
                  if (this.animator.displayedCells[var6Lifetime2][var7Lifetime2] != -1 &&
                    this.animator.displayedCells[var6Lifetime2][var7Lifetime2] != this.board.currentPlayer) {
                    var16Lifetime1 = -this.hoverRow + var6Lifetime2;
                    if (var16Lifetime1 < 0) {
                      var16Lifetime1 = -var16Lifetime1;
                    }
                    var17 = var7Lifetime2 - this.hoverColumn;
                    if (var17 < 0) {
                      var17 = -var17;
                    }
                    if (var16Lifetime1 <= 1 &&
                      var17 <= 1 && (!this.online ||
                      this.localPlayer == this.board.currentPlayer) && (!this.board.finished &&
                      this.animator.selectedRow != -1 &&
                      this.board.isLegalMove((int) (byte)this.board.currentPlayer, this.hoverRow, this.animator.selectedColumn, 2, this.animator.selectedRow, this.hoverColumn))) {
                      Rasterizer.c(var8Lifetime3, var9Lifetime3, -3 + this.field_o, 263172);
                      this.a(var8Lifetime3, -(var5 >> 1) + this.field_d, var15_intLifetime1, var9Lifetime3, false);
                    } else {
                      this.a(var8Lifetime3, this.field_d, var15_intLifetime1, var9Lifetime3, false);
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    this.a(var8Lifetime3, this.field_d, var15_intLifetime1, var9Lifetime3, false);
                  }
                }
              }
            }
          }
          if ((!this.online ||
            this.localPlayer == this.board.currentPlayer) && !this.board.finished) {
            if (!this.board.cellEquals((byte) 127, this.hoverColumn, this.hoverRow, (byte)this.board.currentPlayer)) {
              if ((this.animator.selectedRow != -1) &&
                (this.board.isLegalMove((int) (byte)this.board.currentPlayer, this.hoverRow, this.animator.selectedColumn, 2, this.animator.selectedRow, this.hoverColumn))) {
                var8Lifetime4 = this.cellScreenX(param1, 4347, this.hoverRow);
                var9Lifetime4 = this.cellScreenY(this.hoverColumn, 5975);
                Rasterizer.f(var8Lifetime4, var9Lifetime4, this.field_d, 16776964);
              }
            } else {
              var8Lifetime4 = this.cellScreenX(param1, 4347, this.hoverRow);
              var9Lifetime4 = this.cellScreenY(this.hoverColumn, 5975);
              Rasterizer.f(var8Lifetime4, var9Lifetime4, this.field_d, 16776964);
            }
          }
          var15 = (CellFlip) (this.animator.flips.a((byte) -70));
          while (var15 != null) {
            stackIn_110_0 = (var15.newOwnerIsFirstPlayer) ? 30136 : 16777215;
            var16Lifetime2 = stackIn_110_0;
            var8Lifetime5 = this.cellScreenX(param1, 4347, var15.row);
            var9Lifetime5 = this.cellScreenY(var15.column, 5975);
            if (var15.phase != 0) {
              if (var15.phase != 1) {
                this.a(var8Lifetime5, this.field_d, var16Lifetime2, var9Lifetime5, false);
              } else {
                stackIn_115_1 = var8Lifetime5;
                if (this.field_d >= var15.field_n) {
                  stackIn_116_2 = var15.field_n;
                } else {
                  stackIn_116_2 = this.field_d;
                }
                this.a(stackIn_115_1, stackIn_116_2, var16Lifetime2, var9Lifetime5, false);
              }
            }
            var15 = (CellFlip) (this.animator.flips.a(param2 + 16204));
          }
          if (this.board.lastMovePlayer >= 0) {
            var16Lifetime3 = this.b(param2 ^ 193, this.board.lastMovePlayer);
            var17Lifetime1 = this.cellScreenX(param1, param2 ^ 4338, this.board.lastMoveSourceRow);
            var18 = this.cellScreenY(this.board.lastMoveSourceColumn, 5975);
            var8Lifetime6 = this.cellScreenX(param1, 4347, this.board.lastMoveDestRow);
            var9Lifetime6 = this.cellScreenY(this.board.lastMoveDestColumn, 5975);
            this.a(var9Lifetime6, var18, false, var16Lifetime3, var17Lifetime1, var8Lifetime6);
          }
          this.drawStatusPanel(68, param1);
          if (ke.field_p.field_k) {
            wd.b(8);
          }
          ul.b((byte) 121);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_128_0 = var4;
          stackIn_128_1 = new StringBuilder().append("ic.FA(");
          if (param0 == null) {
            stackIn_129_2 = "null";
          } else {
            stackIn_129_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_128_0), ((StringBuilder) (Object) stackIn_128_1).append(stackIn_129_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(boolean param0, byte param1, Sprite param2, Sprite param3) {
        try {
          this.a(0, param0, param3);
          this.a(param2, (byte) -123, param0);
          if (param1 <= 1) {
            this.chooseAiMove(47, 113);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ic.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void resign(byte param0) {
        int var3;
        var3 = Virogrid.field_F ? 1 : 0;
        if (!this.online) {
          if (this.board.currentPlayer == 0) {
            this.board.finishGame(param0 - 25, 1);
          } else {
            if (this.board.currentPlayer == 1) {
              this.board.finishGame(-35, 0);
            }
          }
        } else {
          gk.field_g.g(60, param0 + 53);
        }
        if (param0 != -45) {
          GameSession.c((byte) -78);
        }
    }

    private final int b(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_35_0 = 0;
        int var6;
        int var7;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder0 = true;
        var7 = Virogrid.field_F ? 1 : 0;
        if (this.hoverRow == param0 &&
          this.hoverColumn == param1 && (!this.online ||
          this.localPlayer == this.board.currentPlayer) && !this.board.finished) {
          if ((!this.board.cellEquals((byte) 127, this.hoverColumn, this.hoverRow, (byte)this.board.currentPlayer)) &&
            (decompiledFrameRemainder0 = (-1 != this.animator.selectedRow))) {
            decompiledFrameRemainder0 = !(!this.board.isLegalMove((int) (byte)this.board.currentPlayer, this.hoverRow, this.animator.selectedColumn, 2, this.animator.selectedRow, this.hoverColumn));
          }
          if (decompiledFrameRemainder0) {
            param4 = param4 + param3 * 4;
            decompiledFrameRemainder1 = false;
          }
        }
        if (decompiledFrameRemainder1) {
          if ((!this.online ||
            this.localPlayer == this.board.currentPlayer) &&
            (!this.board.finished &&
            this.animator.displayedCells[param0][param1] == this.board.currentPlayer &&
            this.animator.field_h[param0][param1])) {
            param4 = param4 + param3 * 6;
          } else {
            if (this.animator.displayedCells[param0][param1] != 0) {
              if (this.animator.displayedCells[param0][param1] == 1) {
                param4 += 128;
              } else {
                if (this.animator.displayedCells[param0][param1] == -1) {
                  return -1;
                }
              }
            } else {
              param4 -= 128;
            }
          }
        }
        if (param2 != -2096) {
          return -59;
        }
        if (128 >= param4) {
          if (param4 < -128) {
            param4 = -128;
          }
        } else {
          param4 = 128;
        }
        if (param4 > 0) {
          stackIn_35_0 = -(65793 * (-param4 + 128)) + 16777215;
        } else {
          stackIn_35_0 = 30136 - 1 * (-param4 + 128);
        }
        var6 = stackIn_35_0;
        return var6;
    }

    final void tick(int param0, boolean param1) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_70_0 = 0;
        ml stackIn_71_1 = null;
        int var3;
        int var6;
        int var7;
        var7 = Virogrid.field_F ? 1 : 0;
        this.tickCount = this.tickCount + 1;
        if (param1 &&
          !ag.c(-101) &&
          gb.field_H.field_g) {
          if (dc.field_Y[96]) {
            tl.a(0.0f, false, 0.029999999329447746f);
          }
          if (dc.field_Y[97]) {
            tl.a(0.0f, false, -0.029999999329447746f);
          }
          if (dc.field_Y[98]) {
            tl.a(-8.0f, false, 0.0f);
          }
          if (dc.field_Y[99]) {
            tl.a(8.0f, false, 0.0f);
          }
        }
        var3 = 0;
        for (var4 = 0; this.board.cells.length > var4; var4++) {
          for (var5 = 0; var5 < this.board.cells[0].length; var5++) {
            if (this.hoverRow == var4 &&
              var5 == this.hoverColumn) {
              var6 = this.board.classifyMove(var5, this.animator.selectedRow, (byte) 99, var4, this.animator.selectedColumn);
              if (var6 != -1 &&
                var6 == 1) {
                var3 = 1;
                if ((double)this.field_k < (double)this.field_d / 1.25) {
                  this.field_k = this.field_k + 1;
                }
              }
            }
          }
        }
        if (var3 == 0 &&
          0 < this.field_k) {
          this.field_k = this.field_k - 1;
        }
        if (this.online) {
          if (!this.board.finished) {
            if (this.turnTimer > 1) {
              this.turnTimer = this.turnTimer - 1;
            }
          } else {
            if (!this.board.finished) {
              this.turnTimer = this.turnTimer - 1;
              if (this.turnTimer == 0) {
                this.chooseAiMove(1, -11272);
              }
            }
          }
        } else {
          if (!this.board.finished) {
            this.turnTimer = this.turnTimer - 1;
            if (this.turnTimer == 0) {
              this.chooseAiMove(1, -11272);
            }
          }
        }
        this.animator.advanceFlips(-125);
        if (!this.board.finished && (this.board.currentPlayer == this.localPlayer ||
          !this.online) && (this.turnTimer < 750 &&
          this.turnTimer % 50 == 0)) {
          vm.$cfr$intArgs$a$45c25716b3df(30, bg.field_Lb);
        }
        if (this.board.finished &&
          this.board.currentPlayer >= 0 && (this.animator.field_e == 0 &&
          9 == this.tickCount % 20 ||
          this.animator.field_e == 1 &&
          this.tickCount % 20 == 19)) {
          stackIn_70_0 = 30;
          if (this.online &&
            this.localPlayer != this.animator.field_e) {
            stackIn_71_1 = cg.field_d;
          } else {
            stackIn_71_1 = f.field_j;
          }
          vm.$cfr$intArgs$a$45c25716b3df(stackIn_70_0, stackIn_71_1);
        }
        if (this.board.finished &&
          this.animator.flips.b((byte) 48) &&
          param1 &&
          gb.field_H.field_g &&
          jk.field_c != 2 &&
          ce.field_E + 20 < id.field_r) {
          while (4.71238898038469 < (double)cf.field_c) {
            cf.field_c = (float)((double)cf.field_c - 6.283185307179586);
          }
          jk.field_c = 0;
          while ((double)cf.field_c < -1.5707963267948966) {
            cf.field_c = (float)((double)cf.field_c + 6.283185307179586);
          }
          cf.field_c = cf.field_c + 0.004999999888241291f;
          vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
          vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
          gb.c((byte) -44);
        }
        if (param0 >= -101) {
          field_y = (rm[]) null;
        }
        this.a(false);
    }

    private final int cellScreenX(boolean param0, int param1, int param2) {
        if (param1 != 4347) {
          this.field_c = -75;
        }
        return param0 ? this.field_B + 140 + this.cellSize * param2 : -this.field_B + 500 - this.cellSize * param2;
    }

    private final void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var36 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var30;
        int var31;
        int var32;
        int var33;
        double var34;
        int var37;
        int var38;
        int var39;
        int[] var46;
        int[] var47;
        var39 = Virogrid.field_F ? 1 : 0;
        var7 = ha.a(-param0 + param1, 109, -param5 + param4);
        var8 = 3;
        var9 = -1024 + var7;
        var10 = 1024 + var7;
        param5 = nf.a(21855, var7) * 2 / 65536 + param5;
        param0 = param0 + 2 * id.a(var7, 32) / 65536;
        var11 = 0;
        var12 = 0;
        var13 = param5;
        var14 = param0;
        var15 = -(nf.a(21855, var7) * 4 / 65536) + param5;
        var16 = -(4 * id.a(var7, 32) / 65536) + param0;
        var17 = var15 - var8 * nf.a(21855, var7) / 65536;
        var18 = -(var8 * id.a(var7, 32) / 65536) + var16;
        var19 = this.field_d / 2;
        var20 = nf.a(21855, var9) * (var11 + var19) / 65536 + var15;
        var21 = id.a(var9, 32) * (var19 + var11) / 65536 + var16;
        var22 = (var19 + var12) * nf.a(21855, var10) / 65536 + var15;
        var23 = id.a(var10, 32) * (var19 + var12) / 65536 + var16;
        var24 = var17 + (2 * var8 + var19 + var11) * nf.a(21855, var9) / 65536;
        var25 = var18 + id.a(var9, 32) * (var11 + var19 + 2 * var8) / 65536;
        if (param2) {
          return;
        }
        var26 = (2 * var8 + (var12 + var19)) * nf.a(21855, var10) / 65536 + var17;
        var27 = var18 + (2 * var8 + (var19 + var12)) * id.a(var10, 32) / 65536;
        Rasterizer.a(param4 + 2, param1, 2 + var13, var14, 263172);
        Rasterizer.a(-2 + param4, param1, var13 - 2, var14, 263172);
        Rasterizer.a(param4, param1 + 2, var13, 2 + var14, 263172);
        Rasterizer.a(param4, -2 + param1, var13, var14 - 2, 263172);
        Rasterizer.a(param4 + 3, param1, 3 + var13, var14, 263172);
        Rasterizer.a(-3 + param4, param1, var13 - 3, var14, 263172);
        Rasterizer.a(param4, 3 + param1, var13, var14 + 3, 263172);
        Rasterizer.a(param4, -3 + param1, var13, var14 - 3, 263172);
        Rasterizer.c(param4, param1, 4, 0);
        Rasterizer.c(param4, param1, 2, param3);
        var46 = new int[3];
        var46[0] = var15;
        var47 = new int[3];
        var46[1] = var20;
        var46[2] = var22;
        var47[0] = var16;
        var47[1] = var21;
        var47[2] = var23;
        fk.a(var18, var25, var27, var17, var24, var26, 263172);
        fk.a(var47[0], var47[1], var47[2], var46[0], var46[1], var46[2], param3);
        Rasterizer.a(param4, param1, var13, var14, param3);
        Rasterizer.a(param4 + 1, param1, var13 + 1, var14, param3);
        Rasterizer.a(param4 - 1, param1, -1 + var13, var14, param3);
        Rasterizer.a(param4, 1 + param1, var13, var14 + 1, param3);
        Rasterizer.a(param4, param1 - 1, var13, var14 - 1, param3);
        var30 = (2 + var19) / 2 * nf.a(21855, var7) / 65536 + param5;
        var31 = param0 + id.a(var7, 32) * ((2 + var19) / 2) / 65536;
        var32 = -(3 * nf.a(21855, var7) / 65536) + param4;
        var33 = -(3 * id.a(var7, 32) / 65536) + param1;
        var34 = (double)(id.field_r % 100) / 100.0;
        for (var36 = 0; var36 < 4; var36++) {
          var37 = (int)Math.round((double)(-var32 + var30) * var34 + (double)var32);
          var38 = (int)Math.round((double)var33 + (double)(-var33 + var31) * var34);
          var34 = var34 + 0.25;
          Rasterizer.c(var37, var38, 1, 263172);
          if (var34 > 1.0) {
            var34 = var34 - 1.0;
          }
        }
    }

    private final void a(Sprite param0, byte param1, boolean param2) {
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_59_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          pj.a(param0, 256);
          Rasterizer.b(110, 0, 420, 400, 127);
          Rasterizer.b(100, 0, 10, 400, 0);
          Rasterizer.b(530, 0, 10, 400, 0);
          var4_int = 31 & id.field_r >> 1;
          if (var4_int >= 16) {
            var4_int = 32 - var4_int;
          }
          for (var5 = 0; var5 < this.animator.displayedCells.length; var5++) {
            for (var6 = 0; this.animator.displayedCells[0].length > var6; var6++) {
              var8 = -(this.cellSize * var6) + 370 - this.field_p;
              if (!param2) {
                stackIn_11_0 = -this.field_B + 500 - var5 * this.cellSize;
              } else {
                stackIn_11_0 = this.field_B + (140 + var5 * this.cellSize);
              }
              var7 = stackIn_11_0;
              Rasterizer.c(var7, var8, this.field_o, 263172);
              Rasterizer.c(var7, var8, this.field_d, 0);
            }
          }
          var9 = 94 / ((param1 + 65) / 58);
          for (var5Lifetime1 = 0; this.animator.displayedCells.length > var5Lifetime1; var5Lifetime1++) {
            var11 = 0;
            var6Lifetime1 = var11;
            while (var11 < this.animator.displayedCells[0].length) {
              if (param2) {
                stackIn_20_0 = 140 + (this.field_B + var5Lifetime1 * this.cellSize);
              } else {
                stackIn_20_0 = -(var5Lifetime1 * this.cellSize) + (500 - this.field_B);
              }
              var7Lifetime1 = stackIn_20_0;
              var8Lifetime1 = -(this.cellSize * var11) - this.field_p + 370;
              if (this.animator.displayedCells[var5Lifetime1][var11] != -1) {
                Rasterizer.c(var7Lifetime1, var8Lifetime1, this.field_o, 263172);
                Rasterizer.c(var7Lifetime1, var8Lifetime1, this.field_d, 0);
              }
              if ((!this.online ||
                this.board.currentPlayer == this.localPlayer) &&
                (!this.board.finished &&
                this.animator.displayedCells[var5Lifetime1][var11] == this.board.currentPlayer &&
                this.animator.field_h[var5Lifetime1][var11] &&
                this.turnTimer > -200 + sh.turnDurations[this.board.timeSetting] &&
                -150 + sh.turnDurations[this.board.timeSetting] > this.turnTimer)) {
                Rasterizer.f(var7Lifetime1, var8Lifetime1, this.field_o, 16776964);
              }
              var11++;
            }
          }
          if ((!this.online ||
            this.board.currentPlayer == this.localPlayer) && !this.board.finished) {
            if (!this.board.cellEquals((byte) 127, this.hoverColumn, this.hoverRow, (byte)this.board.currentPlayer)) {
              if ((this.animator.selectedRow != -1) &&
                (this.board.isLegalMove((int) (byte)this.board.currentPlayer, this.hoverRow, this.animator.selectedColumn, 2, this.animator.selectedRow, this.hoverColumn))) {
                if (param2) {
                  stackIn_53_0 = this.field_B + (140 + this.hoverRow * this.cellSize);
                } else {
                  stackIn_53_0 = -this.field_B + 500 - this.hoverRow * this.cellSize;
                }
                var7Lifetime2 = stackIn_53_0;
                var8Lifetime2 = -(this.cellSize * this.hoverColumn) + (-this.field_p + 370);
                Rasterizer.f(var7Lifetime2, var8Lifetime2, this.field_o, 16776964);
              }
            } else {
              if (param2) {
                stackIn_53_0 = this.field_B + (140 + this.hoverRow * this.cellSize);
              } else {
                stackIn_53_0 = -this.field_B + 500 - this.hoverRow * this.cellSize;
              }
              var7Lifetime2 = stackIn_53_0;
              var8Lifetime2 = -(this.cellSize * this.hoverColumn) + (-this.field_p + 370);
              Rasterizer.f(var7Lifetime2, var8Lifetime2, this.field_o, 16776964);
            }
          }
          if (this.animator.selectedRow != -1 &&
            -1 != this.animator.selectedColumn) {
            if (param2) {
              stackIn_59_0 = this.animator.selectedRow * this.cellSize + (140 + this.field_B);
            } else {
              stackIn_59_0 = -(this.cellSize * this.animator.selectedRow) + (-this.field_B + 500);
            }
            var7Lifetime3 = stackIn_59_0;
            var8Lifetime3 = -this.field_p + (370 - this.animator.selectedColumn * this.cellSize);
            Rasterizer.f(var7Lifetime3, var8Lifetime3, this.field_o, 16776964);
            Rasterizer.f(var7Lifetime3, var8Lifetime3, 1 + this.field_o, 16776964);
          }
          this.drawStatusPanel(107, param2);
          ul.b((byte) 104);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_64_0 = var4;
          stackIn_64_1 = new StringBuilder().append("ic.F(");
          if (param0 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, Sprite param2) {
        try {
          this.a(param2, param0, 9);
          if (param1 <= 60) {
            this.a(112, -120, -26, -118, false);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ic.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, double param1, boolean param2, int param3, double param4, int param5, boolean param6, byte param7) {
        boolean stackIn_41_0 = false;
        int stackIn_61_0 = 0;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var12Lifetime1;
        var17 = Virogrid.field_F ? 1 : 0;
        if (!param6 &&
          hk.field_Jb <= we.field_c.field_J) {
          var11 = 0;
          if (this.board.finished &&
            i.field_y == -1 &&
            hm.field_c == -1) {
            var11 = 1;
          }
          if (param7 != -64) {
            this.online = false;
          }
          if (param0) {
            if (var11 == 0) {
              this.field_u = hk.field_Jb / 18;
              if (nl.field_u < hk.field_Jb / 2 + 638 - (int)ie.field_e) {
                this.field_u = -1;
              }
            } else {
              this.field_u = -1;
              if (nl.field_u > -16 + (-(ve.field_B[0] / 2) + j.field_b) &&
                nl.field_u < j.field_b + ve.field_B[0] / 2 + 16 &&
                hk.field_Jb > 80 + tm.field_g) {
                this.field_u = (-84 - tm.field_g + hk.field_Jb) / 18;
              }
            }
          }
          if (this.online &&
            -1 != hk.field_Jb) {
            var12 = hk.field_Jb + (24 - we.field_c.field_J);
            if (0 < var12 &&
              var12 <= 24 &&
              vi.field_k > (float)nl.field_u) {
              this.field_u = -2;
            }
          }
          if (0 != oi.field_g &&
            -1 != this.field_u) {
            if (this.field_u != this.field_z) {
              if (this.field_u != this.field_q) {
                if (this.field_u == -2) {
                  stackIn_41_0 = !(bl.field_B);
                  bl.field_B = stackIn_41_0;
                  if (stackIn_41_0) {
                    wc.field_j = 0;
                  }
                }
              } else {
                if (!this.online) {
                  wh.a(param7 + 2158, true, 9);
                } else {
                  wh.a(2094, true, 12);
                }
              }
            } else {
              if (this.board.finished) {
                this.restartGame((byte) 45);
              } else {
                this.c(param7 + 123);
              }
            }
          }
          if (!this.board.finished &&
            this.field_m != 0 &&
            this.board.field_v != this.board.currentPlayer) {
            if (this.animator.flips.b((byte) 64)) {
              this.chooseAiMove(this.field_m, -11272);
            }
            this.animator.selectedColumn = -1;
            this.animator.selectedRow = -1;
            this.field_D = false;
            return;
          }
          if (this.field_u == -1 && (param0 &&
            !this.board.finished &&
            param4 >= 110.0 &&
            param4 < 530.0 &&
            0.0 <= param1)) {
            if (!(param1 < 400.0)) {
              return;
            }
            var14 = this.cellSize / 2;
            if (!param2) {
              stackIn_61_0 = -(int)param4 + (-this.field_B + var14 + 500);
            } else {
              stackIn_61_0 = (int)param4 - 140 + var14 - this.field_B;
            }
            var12Lifetime1 = stackIn_61_0;
            if (var12Lifetime1 < 0) {
              var12Lifetime1 = var12Lifetime1 - this.cellSize;
            }
            var13 = -(int)param1 + (-this.field_p + 370) + var14;
            var12Lifetime1 = var12Lifetime1 / this.cellSize;
            if (var13 < 0) {
              var13 = var13 - this.cellSize;
            }
            this.hoverRow = var12Lifetime1;
            var13 = var13 / this.cellSize;
            this.hoverColumn = var13;
            if (param5 != 1) {
              if (param5 != 2) {
                return;
              }
              if (this.animator.selectedRow == -1) {
                return;
              }
              vm.$cfr$intArgs$a$45c25716b3df(30, of.field_b);
              this.animator.selectedRow = -1;
              this.animator.selectedColumn = -1;
              return;
            }
            var15 = this.animator.selectedRow;
            var16 = this.animator.selectedColumn;
            if (this.animator.selectedRow != -1 &&
              this.animator.selectedColumn != -1) {
              if (this.board.isLegalMove(this.board.currentPlayer, var12Lifetime1, this.animator.selectedColumn, param7 + 66, this.animator.selectedRow, var13)) {
                if (this.online) {
                  if (this.board.currentPlayer == this.localPlayer) {
                    this.a(this.animator.selectedRow, this.animator.selectedColumn, var13, var12Lifetime1, (byte) 85);
                    this.animator.selectedRow = -1;
                    this.animator.selectedColumn = -1;
                    this.field_D = false;
                  }
                } else {
                  this.performMove(param7 ^ 13028, this.animator.selectedRow, var13, this.animator.selectedColumn, var12Lifetime1);
                  this.animator.selectedColumn = -1;
                  this.field_D = false;
                  this.animator.selectedRow = -1;
                }
              } else {
                if (!this.board.cellEquals((byte) 127, var13, var12Lifetime1, (byte)this.board.currentPlayer)) {
                  vm.$cfr$intArgs$a$45c25716b3df(30, of.field_b);
                }
                this.animator.selectedColumn = -1;
                this.animator.selectedRow = -1;
              }
            }
            if (-1 != this.animator.selectedRow) {
              return;
            }
            if (this.board.cellEquals((byte) 127, var13, var12Lifetime1, (byte)this.board.currentPlayer)) {
              if (var15 == var12Lifetime1 &&
                var13 == var16) {
                return;
              }
              if (!this.online ||
                this.board.currentPlayer == this.localPlayer) {
                this.animator.selectedRow = var12Lifetime1;
                this.animator.selectedColumn = var13;
                return;
              }
            }
          }
          return;
        }
        this.field_u = -1;
    }

    final void restartGame(byte param0) {
        if (this.online) {
          gk.field_g.g(61, 8);
        } else {
          this.board.restart(0);
          this.animator = new CellAnimator(this.board, this.localPlayer);
          this.animator.resetToBoard(false);
          this.turnTimer = sh.turnDurations[this.board.timeSetting];
          vm.$cfr$intArgs$a$45c25716b3df(30, qd.field_i);
          BufferedSocket.a(true, (byte) -106);
          this.field_q = -1;
          this.field_z = -1;
        }
        if (param0 <= 29) {
          this.layoutBoard(56);
        }
    }

    private final int cellScreenY(int param0, int param1) {
        if (param1 != 5975) {
          this.localPlayer = 116;
        }
        return -this.field_p + 370 - this.cellSize * param0;
    }

    private final int turnPulse(int param0) {
        int var2 = 31 & id.field_r >> 1;
        if (var2 >= 16) {
          var2 = 32 - var2;
        }
        var2 = 16 + (var2 >> 1);
        if (param0 != 6121) {
          return -8;
        }
        if (this.board.currentPlayer == 0) {
          var2 = -var2;
        }
        return var2;
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        if (param0 != -70) {
          this.cellSize = -77;
        }
        if (!this.online) {
          for (var3 = 0; 4 > var3; var3++) {
            ve.field_A[var3] = 256;
            ve.field_v[var3] = null;
            ve.field_p[var3] = null;
          }
          this.a(false, 0, 22273, param1);
        }
    }

    private final void performMove(int param0, int param1, int param2, int param3, int param4) {
        this.board.applyMove(param1, param3, (byte) 119, this.board.currentPlayer, param4, param2);
        this.animator.syncWithBoard(this.online, 31626);
        if (param0 != -13020) {
          this.field_o = 2;
        }
        if (this.board.checkGameEnd(20602)) {
          if (this.localPlayer != -2) {
            this.a(false, -1, param0 ^ -26075, false);
          }
          this.field_n = 0;
        } else {
          this.board.advanceTurn(param0 ^ 12970);
          this.turnTimer = sh.turnDurations[this.board.timeSetting];
        }
    }

    GameSession(boolean param0, int param1, String[] param2, int param3, boolean param4, int param5, int param6) {
        int var8_int = 0;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        Object stackIn_9_0;
        GameBoard stackIn_9_1;
        GameBoard stackIn_9_2;
        int stackIn_9_3;
        String[] stackIn_9_4;
        GameBoard stackIn_10_1 = null;
        GameBoard stackIn_10_2 = null;
        int stackIn_10_5 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        this.field_l = false;
        this.field_c = 0;
        this.field_a = "";
        this.hoverRow = 0;
        this.field_k = 0;
        this.hoverColumn = 0;
        try {
          stackIn_4_1 = (param0);
          this.online = stackIn_4_1;
          this.field_m = param6;
          this.localPlayer = param3;
          stackIn_7_1 = (param4);
          this.field_t = stackIn_7_1;
          stackIn_9_0 = this;
          stackIn_9_1 = null;
          stackIn_9_2 = null;
          stackIn_9_3 = param1;
          stackIn_9_4 = (String[]) (param2);
          if (!this.online) {
            stackIn_10_1 = null;
            stackIn_10_2 = null;
            stackIn_10_5 = 0;
          } else {
            stackIn_10_1 = null;
            stackIn_10_2 = null;
            stackIn_10_5 = -1;
          }
          this.board = new GameBoard(stackIn_9_3, stackIn_9_4, stackIn_10_5, param5);
          if (!this.online) {
            this.board.setTurn(0, 0, 21428);
            this.turnTimer = sh.turnDurations[this.board.timeSetting];
          }
          this.animator = new CellAnimator(this.board, this.localPlayer);
          this.tickCount = 0;
          this.field_z = -1;
          this.field_D = true;
          this.field_i = 0;
          this.field_q = -1;
          if (!this.online) {
            for (var8_int = 0; 4 > var8_int; var8_int++) {
              ve.field_A[var8_int] = 256;
              ve.field_v[var8_int] = null;
              ve.field_p[var8_int] = null;
            }
            this.layoutBoard(-6032);
            return;
          }
          this.layoutBoard(-6032);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("ic.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_s = "Cancel rematch";
        field_b = "Cancel unrated rematch";
    }
}
