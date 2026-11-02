/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameBoard {
    private int field_s;
    int[] field_q;
    int field_b;
    int currentPlayer;
    boolean field_n;
    static um field_j;
    int field_v;
    static boolean field_i;
    private int bestScore;
    int candidateCount;
    boolean field_g;
    int field_r;
    int[] field_e;
    int field_w;
    boolean field_x;
    static String field_o;
    byte[][] cells;
    int field_y;
    int field_a;
    int field_D;
    private boolean[] field_h;
    int turnCount;
    static int field_p;
    boolean finished;
    int[] pieceCounts;
    static String field_F;
    static String[][] field_d;
    int field_B;
    int field_m;
    int field_k;
    String[] playerNames;
    int[] field_G;
    int[] field_t;

    private final void a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var4;
        int var6;
        int var7;
        int var4Lifetime1;
        var6 = Virogrid.field_F ? 1 : 0;
        this.cells = new byte[param0][param1];
        if (param2 != -108) {
          this.field_G = (int[]) null;
        }
        for (var4 = 0; var4 < param0; var4++) {
          for (var5 = 0; var5 < param1; var5++) {
            this.cells[var4][var5] = (byte)-1;
          }
        }
        this.cells[0][0] = (byte) 0;
        this.cells[0][param1 - 1] = (byte) 1;
        this.cells[param0 - 1][0] = (byte) 1;
        this.cells[param0 - 1][-1 + param1] = (byte) 0;
        this.pieceCounts = new int[2];
        this.field_h = new boolean[2];
        var7 = 0;
        var4Lifetime1 = var7;
        while (this.pieceCounts.length > var7) {
          this.pieceCounts[var7] = 2;
          var7++;
        }
        this.field_a = -1;
        this.field_B = -1;
        this.field_k = -1;
        this.field_x = false;
        this.field_m = -1;
        this.field_n = false;
        this.field_g = false;
        this.field_w = -1;
    }

    final boolean cellEquals(byte param0, int param1, int param2, byte param3) {
        if (this.cells.length > param2 &&
          param2 >= 0) {
          if (param0 != 127) {
            this.field_g = true;
          }
          if (param1 >= this.cells[0].length) {
            return false;
          }
          if (param1 < 0) {
            return false;
          }
          if (param3 != this.cells[param2][param1]) {
            return false;
          }
          return true;
        }
        return false;
    }

    final void finishGame(int param0, int param1) {
        this.currentPlayer = param1;
        this.finished = true;
        if (param0 > -16) {
          PacketBuffer var4 = (PacketBuffer) null;
          this.readCells((PacketBuffer) null, (byte) -59);
        }
    }

    final void advanceTurn(int param0) {
        int var3 = Virogrid.field_F ? 1 : 0;
        if (this.finished) {
          throw new IllegalStateException();
        }
        this.turnCount = this.turnCount + 1;
        if (param0 > -96) {
          field_i = true;
        }
        do {
          this.currentPlayer = (this.currentPlayer + 1) % 2;
        } while ((1 << this.currentPlayer & this.field_r) != 0);
    }

    final int classifyMove(int param0, int param1, byte param2, int param3, int param4) {
        int var6;
        int var7;
        PacketBuffer var8;
        if (param2 != 99) {
          var8 = (PacketBuffer) null;
          this.readCells((PacketBuffer) null, (byte) -67);
        }
        if (param3 < this.cells.length &&
          param3 >= 0) {
          if (this.cells[0].length > param0 &&
            param0 >= 0) {
            if (this.cells[param3][param0] == -1) {
              var6 = Math.abs(-param1 + param3);
              var7 = Math.abs(param0 - param4);
              if (var6 <= 1 &&
                1 >= var7) {
                return 0;
              }
              if (var6 == 2 &&
                2 == var7 ||
                var6 == 0 &&
                var7 == 2 ||
                2 == var6 &&
                0 == var7) {
                return 1;
              }
            }
            return -1;
          }
          return -1;
        }
        return -1;
    }

    public static void a(int param0) {
        field_j = null;
        field_F = null;
        field_o = null;
        field_d = (String[][]) null;
        if (param0 <= 66) {
          GameBoard.a(-93);
        }
    }

    private final int a(boolean param0, int param1, byte param2, int param3, int param4, boolean param5, int param6, int param7) {
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        regionExit1: {
          regionExit2: {
            var17 = Virogrid.field_F ? 1 : 0;
            var9 = this.classifyMove(param1, param7, (byte) 99, param6, param3);
            var10 = 0;
            if (var9 == 0) {
              var10++;
              if (param0) {
                this.cells[param6][param1] = (byte)param2;
              }
            } else {
              if (1 != var9) {
                return -1;
              }
              if (!param0) {
                var11 = -1 + param6;
                if (var11 < 0) {
                  var11 = 0;
                }
                if (param4 <= 38) {
                  this.recountPieces((byte) 123);
                }
                var12 = 1 + param6;
                if (var12 >= this.cells.length) {
                  var12 = -1 + this.cells.length;
                }
                var13 = -1 + param1;
                if (var13 < 0) {
                  var13 = 0;
                }
                var14 = param1 + 1;
                if (var14 >= this.cells[0].length) {
                  var14 = this.cells[0].length - 1;
                }
                var15 = var11;
                if (var12 < var15) {
                  break regionExit1;
                }
                var16 = var13;
                if (var16 > var14) {
                  var15++;
                  break regionExit2;
                }
                if (this.cells[var15][var16] != -param2 + 1) {
                  var16++;
                  while (true) {
                    if (var16 > var14) {
                      var15++;
                      if (var12 < var15) {
                        break regionExit1;
                      }
                      var16 = var13;
                      continue;
                    }
                    if (this.cells[var15][var16] == -param2 + 1) {
                      var10++;
                      if (param0) {
                        this.cells[var15][var16] = (byte)param2;
                      }
                      if (param5) {
                        var10++;
                      }
                    }
                    var16++;
                  }
                }
                var10++;
                if (!param0) {
                  scanLoop3: while (true) {
                    if (param5) {
                      var10++;
                    }
                    do {
                      var16++;
                      while (var16 > var14) {
                        var15++;
                        if (var12 < var15) {
                          break regionExit1;
                        }
                        var16 = var13;
                      }
                    } while (this.cells[var15][var16] != -param2 + 1);
                    var10++;
                    if (!param0) {
                      continue scanLoop3;
                    }
                    this.cells[var15][var16] = (byte)param2;
                  }
                }
                while (true) {
                  this.cells[var15][var16] = (byte)param2;
                  while (true) {
                    if (param5) {
                      var10++;
                    }
                    do {
                      var16++;
                      while (var16 > var14) {
                        var15++;
                        if (var12 < var15) {
                          break regionExit1;
                        }
                        var16 = var13;
                      }
                    } while (this.cells[var15][var16] != -param2 + 1);
                    var10++;
                    if (param0) {
                      break;
                    }
                  }
                }
              }
              this.cells[param7][param3] = (byte)-1;
              this.cells[param6][param1] = (byte)param2;
            }
            var11 = -1 + param6;
            if (var11 < 0) {
              var11 = 0;
            }
            if (param4 <= 38) {
              this.recountPieces((byte) 123);
            }
            var12 = 1 + param6;
            if (var12 >= this.cells.length) {
              var12 = -1 + this.cells.length;
            }
            var13 = -1 + param1;
            if (var13 < 0) {
              var13 = 0;
            }
            var14 = param1 + 1;
            if (var14 >= this.cells[0].length) {
              var14 = this.cells[0].length - 1;
            }
            var15 = var11;
          }
          while (var12 >= var15) {
            for (var16 = var13; var16 <= var14; var16++) {
              if (this.cells[var15][var16] == -param2 + 1) {
                var10++;
                if (param0) {
                  this.cells[var15][var16] = (byte)param2;
                }
                if (param5) {
                  var10++;
                }
              }
            }
            var15++;
          }
        }
        return var10;
    }

    private final boolean a(int param0, int param1) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var12;
        PacketBuffer var13;
        int[] var14;
        int var6Lifetime1;
        int var7Lifetime1;
        var12 = Virogrid.field_F ? 1 : 0;
        if (param1 > -22) {
          var13 = (PacketBuffer) null;
          this.readCells((PacketBuffer) null, (byte) -15);
        }
        var14 = new int[]{-1, -1, -1, 0, 0, 1, 1, 1, 2, 2, 2, 0, 0, -2, -2, -2};
        var4 = new int[]{-1, 0, 1, -1, 1, -1, 0, 1, 0, -2, 2, -2, 2, -2, 0, 2};
        var5 = 1;
        var6 = 0;
        scanLoop1: while (true) {
          if (this.cells.length > var6) {
            for (var7 = 0; var7 < this.cells[0].length; var7++) {
              if (this.cells[var6][var7] == -1) {
                var5 = 0;
                break scanLoop1;
              }
            }
            var6++;
            continue;
          }
          break;
        }
        if (var5 != 0) {
          return false;
        }
        var8 = 0;
        for (var9 = 0; var9 < this.cells.length; var9++) {
          for (var10 = 0; this.cells[0].length > var10; var10++) {
            if (~param0 == ~this.cells[var9][var10]) {
              var8++;
              for (var11 = 0; var11 < var14.length; var11++) {
                var6Lifetime1 = var14[var11] + var9;
                var7Lifetime1 = var4[var11] + var10;
                if (var6Lifetime1 >= 0 &&
                  this.cells.length > var6Lifetime1 &&
                  var7Lifetime1 >= 0 &&
                  this.cells[0].length > var7Lifetime1 &&
                  this.cells[var6Lifetime1][var7Lifetime1] == -1) {
                  return false;
                }
              }
            }
          }
        }
        return !(var8 <= 0);
    }

    private final void recordCandidate(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var11 = 0;
        int[] var7_ref_int__;
        int var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int var12;
        int[] var13;
        var12 = Virogrid.field_F ? 1 : 0;
        if (this.candidateCount > 0 &&
          param1 < this.bestScore) {
          return;
        }
        if (this.candidateCount > 0 &&
          this.bestScore < param1) {
          this.candidateCount = 0;
        }
        if (this.candidateCount >= this.field_e.length) {
          var13 = new int[this.field_e.length * 2];
          var7_ref_int__ = var13;
          var8 = new int[this.field_e.length * 2];
          var9 = new int[2 * this.field_e.length];
          var10 = new int[2 * this.field_e.length];
          for (var11 = 0; var11 < this.field_e.length; var11++) {
            var13[var11] = this.field_e[var11];
            var8[var11] = this.field_G[var11];
            var9[var11] = this.field_q[var11];
            var10[var11] = this.field_t[var11];
          }
          this.field_t = var10;
          this.field_q = var9;
          this.field_G = var8;
          this.field_e = var7_ref_int__;
        }
        this.field_e[this.candidateCount] = param0;
        var7 = 55 / ((43 - param3) / 48);
        this.field_G[this.candidateCount] = param5;
        this.field_q[this.candidateCount] = param2;
        this.field_t[this.candidateCount] = param4;
        this.bestScore = param1;
        this.candidateCount = this.candidateCount + 1;
    }

    final void c(int param0, int param1) {
        int var3;
        this.field_n = false;
        this.field_x = false;
        var3 = param0;
        if (var3 == 1) {
          this.field_x = true;
        } else {
          if (var3 == 2) {
            this.field_n = true;
          }
        }
        if (param1 != 2) {
          this.finishGame(-64, 101);
        }
    }

    final boolean checkGameEnd(int param0) {
        int var3 = 0;
        int var4 = 0;
        byte dupTemp$0 = 0;
        boolean stackIn_22_1 = false;
        int var2;
        int var5;
        int var2Lifetime1;
        var5 = Virogrid.field_F ? 1 : 0;
        if (this.finished) {
          throw new IllegalStateException();
        }
        for (var2 = 0; var2 < this.pieceCounts.length; var2++) {
          this.pieceCounts[var2] = 0;
        }
        var2Lifetime1 = 1;
        if (param0 != 20602) {
          this.field_y = -14;
        }
        for (var3 = 0; this.cells.length > var3; var3++) {
          for (var4 = 0; var4 < this.cells[0].length; var4++) {
            if (this.cells[var3][var4] != -1) {
              dupTemp$0 = this.cells[var3][var4];
              this.pieceCounts[dupTemp$0] = this.pieceCounts[dupTemp$0] + 1;
            } else {
              var2Lifetime1 = 0;
            }
          }
        }
        stackIn_22_1 = (var2Lifetime1 != 0);
        this.field_n = stackIn_22_1;
        if (var2Lifetime1 != 0) {
          if (this.pieceCounts[0] > this.pieceCounts[1]) {
            this.finishGame(-124, 0);
          } else {
            if (this.pieceCounts[1] > this.pieceCounts[0]) {
              this.finishGame(param0 - 20709, 1);
            } else {
              this.finishGame(-35, -1);
            }
          }
          return true;
        }
        if (this.pieceCounts[0] == 0) {
          this.field_x = true;
          this.finishGame(-101, 1);
          return true;
        }
        if (this.pieceCounts[1] != 0) {
          return false;
        }
        this.field_x = true;
        this.finishGame(-38, 0);
        return true;
    }

    final void readCells(PacketBuffer param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var3_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          if (param1 <= 34) {
            GameBoard.a(-104);
          }
          var3_int = param0.readUnsignedByte(11132);
          if ((var3_int & 2) != 0) {
            for (var4 = 0; var4 < this.cells.length; var4++) {
              for (var5 = 0; this.cells[0].length > var5; var5++) {
                this.cells[var4][var5] = param0.readByte((byte) -101);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("uf.S(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final void recountPieces(byte param0) {
        int var4 = 0;
        byte dupTemp$0 = 0;
        int var2;
        int var3;
        int var5;
        boolean stackIn_17_1 = false;
        int var2Lifetime1;
        int var3Lifetime1;
        var5 = Virogrid.field_F ? 1 : 0;
        for (var2 = 0; var2 < this.pieceCounts.length; var2++) {
          this.pieceCounts[var2] = 0;
        }
        var2Lifetime1 = 1;
        for (var3 = 0; var3 < this.cells.length; var3++) {
          for (var4 = 0; this.cells[0].length > var4; var4++) {
            if (this.cells[var3][var4] != -1) {
              dupTemp$0 = this.cells[var3][var4];
              this.pieceCounts[dupTemp$0] = this.pieceCounts[dupTemp$0] + 1;
            } else {
              var2Lifetime1 = 0;
            }
          }
        }
        stackIn_17_1 = (var2Lifetime1 != 0);
        this.field_n = stackIn_17_1;
        if (var2Lifetime1 == 0) {
          if (0 != this.pieceCounts[0]) {
            if (this.pieceCounts[1] == 0) {
              this.field_x = true;
            }
          } else {
            this.field_x = true;
          }
        }
        var3Lifetime1 = 44 / ((-11 - param0) / 62);
    }

    final int applyMove(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int var15 = 0;
        byte dupTemp$0 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13_int;
        int[] var13;
        int var14;
        int var16;
        int[] var17;
        int[] var18;
        int var13_intLifetime1;
        int var14Lifetime1;
        int var14Lifetime1Lifetime1;
        var16 = Virogrid.field_F ? 1 : 0;
        if (this.finished) {
          throw new IllegalStateException();
        }
        var7 = this.classifyMove(param5, param0, (byte) 99, param4, param1);
        if (var7 != 0) {
          if (var7 != 1) {
            return 0;
          }
          this.cells[param4][param5] = (byte)param3;
          this.cells[param0][param1] = (byte)-1;
        } else {
          this.cells[param4][param5] = (byte)param3;
          this.field_h[param3] = true;
        }
        if (param2 != 119) {
          return -27;
        }
        var8 = param4 - 1;
        if (var8 < 0) {
          var8 = 0;
        }
        var9 = 1 + param4;
        if (var9 >= this.cells.length) {
          var9 = this.cells.length - 1;
        }
        var10 = param5 - 1;
        if (0 > var10) {
          var10 = 0;
        }
        var11 = 1 + param5;
        if (var11 >= this.cells[0].length) {
          var11 = -1 + this.cells[0].length;
        }
        var12 = 0;
        for (var13_int = var8; var13_int <= var9; var13_int++) {
          for (var14 = var10; var11 >= var14; var14++) {
            if (~(-param3 + 1) == ~this.cells[var13_int][var14]) {
              var12++;
              this.cells[var13_int][var14] = (byte)param3;
            }
          }
        }
        if (this.a(-param3 + 1, param2 ^ -88)) {
          this.field_g = true;
          for (var13_intLifetime1 = 0; var13_intLifetime1 < this.cells.length; var13_intLifetime1++) {
            for (var14Lifetime1 = 0; this.cells[0].length > var14Lifetime1; var14Lifetime1++) {
              if (this.cells[var13_intLifetime1][var14Lifetime1] == -1) {
                this.cells[var13_intLifetime1][var14Lifetime1] = (byte)param3;
              }
            }
          }
          var18 = new int[2];
          var17 = var18;
          var13 = var17;
          for (var14Lifetime1Lifetime1 = 0; var14Lifetime1Lifetime1 < this.cells.length; var14Lifetime1Lifetime1++) {
            for (var15 = 0; this.cells[0].length > var15; var15++) {
              if (this.cells[var14Lifetime1Lifetime1][var15] >= 0) {
                dupTemp$0 = this.cells[var14Lifetime1Lifetime1][var15];
                var13[dupTemp$0] = var13[dupTemp$0] + 1;
              }
            }
          }
          if (var13[1 - param3] < var18[param3]) {
          }
        }
        this.field_a = param1;
        this.field_B = param3;
        this.field_w = param5;
        this.field_m = param4;
        this.field_k = param0;
        return var12;
    }

    final boolean isLegalMove(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (this.classifyMove(param5, param4, (byte) 99, param1, param2) == -1) {
          return false;
        }
        if (param0 != this.cells[param4][param2]) {
          return false;
        }
        if (param3 != 2) {
          this.field_w = 30;
          return true;
        }
        return true;
    }

    final void setTurn(int param0, int param1, int param2) {
        if (param2 != 21428) {
          this.field_a = 70;
        }
        this.currentPlayer = param0;
        this.turnCount = param1;
    }

    final void restart(int param0) {
        this.a(this.cells.length, this.cells[0].length, (byte) -108);
        this.finished = false;
        this.field_r = 0;
        this.field_D = param0;
        int var2 = this.currentPlayer;
        if (var2 != 0 &&
          1 != var2) {
          var2 = this.field_v;
        }
        int localTemp$0 = var2 == 1 ? 0 : 1;
        var2 = localTemp$0;
        this.field_v = localTemp$0;
        this.setTurn(var2, 0, param0 + 21428);
    }

    final void a(boolean[][] param0, int param1, byte param2) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var11 = 0;
        int[] var12 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          var12 = new int[]{-1, -1, -1, 0, 0, 1, 1, 1, 2, 2, 2, 0, 0, -2, -2, -2};
          var5 = new int[]{-1, 0, 1, -1, 1, -1, 0, 1, 0, -2, 2, -2, 2, -2, 0, 2};
          if (param2 != 14) {
            this.isLegalMove(59, 84, 4, 79, -14, 66);
          }
          for (var8 = 0; this.cells.length > var8; var8++) {
            for (var9 = 0; this.cells[0].length > var9; var9++) {
              param0[var8][var9] = false;
              if (~param1 == ~this.cells[var8][var9]) {
                for (var10 = 0; var12.length > var10; var10++) {
                  var6 = var8 + var12[var10];
                  var7 = var5[var10] + var9;
                  if (var6 >= 0 &&
                    var6 < this.cells.length &&
                    var7 >= 0 &&
                    this.cells[0].length > var7 &&
                    -1 == this.cells[var6][var7]) {
                    param0[var8][var9] = true;
                    break;
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("uf.P(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void collectBestMoves(int param0, int param1) {
        int var18 = 0;
        int[] var4;
        int var5;
        int var6;
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
        int var19;
        int var20;
        int[] var21;
        int var22;
        int[] var24;
        byte[][] var27;
        int var14Lifetime1;
        int var15Lifetime1;
        var20 = Virogrid.field_F ? 1 : 0;
        var21 = new int[]{-1, -1, -1, 0, 0, 1, 1, 1, 2, 2, 2, 0, 0, -2, -2, -2};
        var24 = var21;
        this.field_e = new int[this.cells.length * this.cells[param1].length];
        var4 = new int[]{-1, 0, 1, -1, 1, -1, 0, 1, 0, -2, 2, -2, 2, -2, 0, 2};
        this.field_G = new int[this.cells.length * this.cells[0].length];
        this.field_q = new int[this.cells[0].length * this.cells.length];
        this.field_t = new int[this.cells[0].length * this.cells.length];
        this.candidateCount = 0;
        this.bestScore = -2147483648;
        var5 = (byte)this.currentPlayer;
        if (param0 == 1) {
          for (var6 = 0; this.cells.length > var6; var6++) {
            for (var7 = 0; this.cells[0].length > var7; var7++) {
              if (~this.cells[var6][var7] == ~var5) {
                var21 = var24;
                for (var10 = 0; var21.length > var10; var10++) {
                  var8 = var21[var10] + var6;
                  var9 = var7 + var4[var10];
                  if (this.isLegalMove(var5, var8, var7, 2, var6, var9)) {
                    this.recordCandidate(var8, 1, var6, -81, var7, var9);
                  }
                }
              }
            }
          }
        } else if (2 == param0) {
          for (var6 = 0; var6 < this.cells.length; var6++) {
            for (var7 = 0; var7 < this.cells[0].length; var7++) {
              if (var5 == this.cells[var6][var7]) {
                for (var10 = 0; var10 < var21.length; var10++) {
                  var8 = var6 + var21[var10];
                  var9 = var4[var10] + var7;
                  if (this.isLegalMove(var5, var8, var7, 2, var6, var9)) {
                    var11 = this.a(false, var9, (byte) var5, var7, 120, false, var8, var6);
                    this.recordCandidate(var8, var11, var6, param1 + 103, var7, var9);
                  }
                }
              }
            }
          }
        } else {
          if (param0 == 3) {
            var27 = new byte[this.cells.length][this.cells[0].length];
            for (var7 = 0; var7 < this.cells.length; var7++) {
              for (var8 = 0; var8 < this.cells[0].length; var8++) {
                var27[var7][var8] = this.cells[var7][var8];
              }
            }
            for (var7 = 0; this.cells.length > var7; var7++) {
              for (var8 = 0; this.cells[0].length > var8; var8++) {
                if (var5 == this.cells[var7][var8]) {
                  for (var11 = 0; var24.length > var11; var11++) {
                    var9 = var7 + var24[var11];
                    var10 = var8 + var4[var11];
                    if (this.isLegalMove(var5, var9, var8, 2, var7, var10)) {
                      var12 = this.a(true, var10, (byte) var5, var8, param1 + 69, false, var9, var7);
                      var13 = -9;
                      for (var14 = 0; var14 < this.cells.length; var14++) {
                        for (var15 = 0; var15 < this.cells[0].length; var15++) {
                          if (~(1 - var5) == ~this.cells[var14][var15]) {
                            for (var18 = 0; var18 < var24.length; var18++) {
                              var17 = var15 + var4[var18];
                              var16 = var14 + var24[var18];
                              if (this.isLegalMove(-var5 + 1, var16, var15, 2, var14, var17)) {
                                var19 = this.a(false, var17, (byte)(-var5 + 1), var15, 115, false, var16, var14);
                                if (var19 > var13) {
                                  var13 = var19;
                                }
                              }
                            }
                          }
                        }
                      }
                      var12 = var12 - var13;
                      this.recordCandidate(var9, var12, var7, param1 ^ -65, var8, var10);
                      for (var14Lifetime1 = 0; this.cells.length > var14Lifetime1; var14Lifetime1++) {
                        var22 = 0;
                        var15Lifetime1 = var22;
                        while (this.cells[0].length > var22) {
                          this.cells[var14Lifetime1][var22] = var27[var14Lifetime1][var22];
                          var22++;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    GameBoard(int param0, String[] param1, int param2, int param3) {
        this.field_h = new boolean[2];
        this.field_B = -1;
        this.field_m = -1;
        this.field_k = -1;
        this.field_w = -1;
        this.field_a = -1;
        try {
          this.field_y = param0;
          if (param1.length != 2) {
            throw new RuntimeException();
          }
          this.field_v = param2;
          this.currentPlayer = param2;
          this.playerNames = param1;
          this.field_s = param3;
          this.a(ra.field_a[this.field_s], ra.field_a[this.field_s], (byte) -108);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "uf.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_i = true;
        field_o = "All games";
        field_F = "Achievements";
    }
}
