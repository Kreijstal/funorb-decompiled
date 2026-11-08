/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PlayerBoard {
    int pieceRow;
    boolean[] pieceTones;
    int piecesPlaced;
    boolean field_x;
    private Puzzle field_j;
    int paddedHeight;
    static Sprite field_w;
    static String field_l;
    boolean field_m;
    private Random field_t;
    static boolean field_g;
    int field_f;
    boolean fastDrop;
    static String field_o;
    private int field_u;
    byte[] cells;
    int field_b;
    boolean field_k;
    static Sprite[] field_v;
    static int field_n;
    int paddedWidth;
    static int field_q;
    static ResourceArchive field_c;
    int pieceColumn;

    final void readState(int param0, PacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        boolean stackIn_6_1 = false;
        boolean[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean stackIn_11_2 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        int var3_intLifetime2;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          this.pieceColumn = param1.readUnsignedByte(param0 + 257);
          if (param0 != -2) {
            PlayerBoard.d(-62);
          }
          this.pieceRow = param1.readUnsignedByte(255);
          this.field_u = param1.readUnsignedShort((byte) 76);
          this.field_b = param1.readUnsignedShort((byte) -117);
          stackIn_6_1 = (1 == param1.readUnsignedByte(255));
          this.fastDrop = stackIn_6_1;
          for (var3_int = 0; var3_int < 4; var3_int++) {
            stackIn_10_0 = this.pieceTones;
            stackIn_10_1 = var3_int;
            stackIn_11_2 = (param1.readUnsignedByte(255) == 1);
            stackIn_10_0[stackIn_10_1] = stackIn_11_2;
          }
          for (var3_intLifetime1 = 0; this.cells.length > var3_intLifetime1; var3_intLifetime1++) {
            this.cells[var3_intLifetime1] = param1.readByte(0);
          }
          for (var3_intLifetime2 = 0; this.field_u > var3_intLifetime2; var3_intLifetime2++) {
            JavaRandomHelpers.a(this.field_t, -104, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("hd.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final boolean applyAction(int param0, byte param1) {
        int var4 = 0;
        byte[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        byte stackIn_18_2 = 0;
        int stackIn_19_3;
        int[] var3;
        int var5;
        int[] var6;
        int[] var7;
        int[] var8;
        var5 = Pixelate.field_H ? 1 : 0;
        if (param1 >= -79) {
          this.isFullyPainted(120);
        }
        boolean decompiledFrameRemainder0 = true;
        if (param0 == 2) {
          if (this.pieceColumn != 0 &&
            this.cells[this.paddedWidth * this.pieceRow + (-1 + this.pieceColumn)] != -1 &&
            -1 != this.cells[this.paddedWidth * this.pieceRow + this.pieceColumn + (-1 + this.paddedWidth)]) {
            this.pieceColumn = this.pieceColumn - 1;
            decompiledFrameRemainder0 = false;
          }
          else {
            return false;
          }
        }
        if (decompiledFrameRemainder0) {
          if (param0 == 3) {
            if (-2 + this.paddedWidth != this.pieceColumn &&
              -1 != this.cells[2 + (this.pieceColumn + this.paddedWidth * this.pieceRow)] &&
              this.cells[this.paddedWidth + this.paddedWidth * this.pieceRow + this.pieceColumn + 2] != -1) {
              this.pieceColumn = this.pieceColumn + 1;
              decompiledFrameRemainder0 = false;
            }
            else {
              return false;
            }
          }
          if (decompiledFrameRemainder0) {
            if (param0 == 0) {
              if (this.pieceRow != 0 &&
                -1 != this.cells[this.pieceRow * this.paddedWidth + this.pieceColumn - this.paddedWidth] &&
                -1 != this.cells[-this.paddedWidth + (1 + (this.pieceColumn + this.paddedWidth * this.pieceRow))]) {
                this.pieceRow = this.pieceRow - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                return false;
              }
            }
            if (decompiledFrameRemainder0) {
              if (param0 == 1) {
                if (this.paddedHeight - 2 != this.pieceRow &&
                  -1 != this.cells[this.paddedWidth * (2 + this.pieceRow) + this.pieceColumn] &&
                  this.cells[this.paddedWidth * (this.pieceRow + 2) + 1 + this.pieceColumn] != -1) {
                  this.pieceRow = this.pieceRow + 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  return false;
                }
              }
              if (decompiledFrameRemainder0) {
                if (4 == param0) {
                  wm.a(-11825, this.pieceTones);
                  this.field_x = true;
                  return true;
                }
                if (param0 != 6) {
                  if (param0 != 7) {
                    if (param0 == 5) {
                      var8 = new int[4];
                      var7 = var8;
                      var6 = var7;
                      var3 = var6;
                      var6[1] = this.pieceColumn - (-1 - this.paddedWidth * this.pieceRow);
                      var6[2] = this.pieceColumn + (1 + this.pieceRow) * this.paddedWidth;
                      var6[0] = this.pieceRow * this.paddedWidth + this.pieceColumn;
                      var6[3] = this.paddedWidth * (1 + this.pieceRow) + (1 + this.pieceColumn);
                      for (var4 = 0; var4 < 4; var4++) {
                        this.cells[var8[var4]] = (byte)cm.bitAnd((int) this.cells[var8[var4]], -4);
                        stackIn_18_0 = this.cells;
                        stackIn_18_1 = var8[var4];
                        stackIn_18_2 = this.cells[var8[var4]];
                        if (!this.pieceTones[var4]) {
                          stackIn_19_3 = 1;
                        } else {
                          stackIn_19_3 = 2;
                        }
                        stackIn_18_0[stackIn_18_1] = (byte)bq.bitOr((int) stackIn_18_2, stackIn_19_3);
                      }
                      this.spawnPiece(-91);
                      if (this.pieceColumn == 0 ||
                        this.pieceRow == 0 ||
                        this.pieceColumn == -2 + this.paddedWidth ||
                        -2 + this.paddedHeight == this.pieceRow) {
                        this.field_m = true;
                      }
                      this.piecesPlaced = this.piecesPlaced + 1;
                    }
                  } else {
                    this.fastDrop = false;
                  }
                } else {
                  this.fastDrop = true;
                }
              }
            }
          }
        }
        return true;
    }

    final static int a(int param0, int param1) {
        int var2 = -19 % ((param1 - 71) / 53);
        return SecondaryNodeHashTable.inverseSquareRoot(param0, -1) >> 8;
    }

    final boolean isFullyPainted(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        int var2 = 1;
        for (var3 = 1; -1 + this.paddedHeight > var3; var3++) {
          for (var4 = 1; -1 + this.paddedWidth > var4; var4++) {
            var2 = var2 & ((4 & this.cells[var3 * this.paddedWidth + var4]) != 0 ? 1 : 0);
          }
        }
        if (param0 != 26745) {
          return false;
        }
        return var2 != 0;
    }

    final static void d(int param0) {
        if (param0 >= -72) {
          PlayerBoard.releaseStatics((byte) -16);
        }
        lg.field_a = lg.field_a + 100;
        if (255 < lg.field_a) {
          lg.field_a = 255;
        }
    }

    final void seedPieces(int param0, int param1) {
        this.field_u = 0;
        if (param0 >= -13) {
          field_o = (String) null;
        }
        this.field_t = new Random((long)param1);
    }

    final void spawnPiece(int param0) {
        int var5 = 0;
        int var2;
        int var3;
        int var4;
        int var6;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        {
          var6 = Pixelate.field_H ? 1 : 0;
          var2 = 0;
          if (DateOfBirthValidator.field_j != 1) {
            this.field_u = this.field_u + 1;
            var3 = JavaRandomHelpers.a(this.field_t, -119, 100);
            var4 = 0;
            for (var5 = 0; var5 < 6; var5++) {
              var4 = var4 + SceneWidget.field_db[var5];
              if (var3 < var4) {
                var2 = var5;
                break;
              }
            }
          } else {
            var2 = un.field_j.takeNextPiece(0);
            if (-1 == var2) {
              return;
            }
          }
        }
        if (param0 >= -72) {
          this.pieceTones = (boolean[]) null;
        }
        for (var3Lifetime1 = 0; var3Lifetime1 < 4; var3Lifetime1++) {
          this.pieceTones[var3Lifetime1] = RisingBubble.field_e[var2][var3Lifetime1];
        }
        if (DateOfBirthValidator.field_j != 1) {
          this.field_u = this.field_u + 1;
          var3Lifetime2 = JavaRandomHelpers.a(this.field_t, -116, 4);
          for (var4Lifetime1 = 0; var3Lifetime2 > var4Lifetime1; var4Lifetime1++) {
            wm.a(-11825, this.pieceTones);
          }
        }
    }

    public static void releaseStatics(byte param0) {
        field_l = null;
        field_o = null;
        field_c = null;
        field_v = null;
        if (param0 <= 122) {
          field_l = (String) null;
        }
        field_w = null;
    }

    final void clear(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        var2 = -59 % ((14 - param0) / 37);
        for (var3 = 0; this.cells.length > var3; var3++) {
          if (this.cells[var3] != -1) {
            this.cells[var3] = (byte) 0;
          }
        }
        this.field_x = false;
        this.field_m = false;
        this.field_k = false;
    }

    final void loadCells(int param0, byte[] param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          for (var3_int = param0; var3_int < param1.length; var3_int++) {
            this.cells[var3_int] = param1[var3_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hd.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final int b(byte param0) {
        if (param0 >= -10) {
          return -115;
        }
        return this.field_j.borderFlags;
    }

    PlayerBoard(Puzzle param0) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        this.field_x = false;
        this.field_m = false;
        this.field_k = false;
        try {
          this.pieceTones = new boolean[4];
          this.field_j = param0;
          this.paddedWidth = this.field_j.columns + 2;
          this.paddedHeight = 2 + this.field_j.rows;
          this.cells = new byte[this.paddedHeight * this.paddedWidth];
          if ((this.field_j.borderFlags & 1) != 0) {
            this.cells[0] = (byte)-1;
            this.cells[this.paddedWidth - 1] = (byte)-1;
            this.cells[-this.paddedWidth + this.paddedHeight * this.paddedWidth] = (byte)-1;
            this.cells[this.paddedHeight * this.paddedWidth - 1] = (byte)-1;
          }
          if ((2 & this.field_j.borderFlags) != 0) {
            for (var2_int = 0; this.paddedHeight > var2_int; var2_int++) {
              this.cells[this.paddedWidth * var2_int] = (byte)-1;
            }
          }
          if ((this.field_j.borderFlags & 4) != 0) {
            for (var2_intLifetime1 = 0; this.paddedWidth > var2_intLifetime1; var2_intLifetime1++) {
              this.cells[var2_intLifetime1] = (byte)-1;
            }
          }
          if ((8 & this.field_j.borderFlags) != 0) {
            for (var2_intLifetime2 = 0; var2_intLifetime2 < this.paddedHeight; var2_intLifetime2++) {
              this.cells[var2_intLifetime2 * this.paddedWidth + this.paddedWidth - 1] = (byte)-1;
            }
          }
          if ((16 & this.field_j.borderFlags) != 0) {
            for (var2_intLifetime3 = 0; this.paddedWidth > var2_intLifetime3; var2_intLifetime3++) {
              this.cells[var2_intLifetime3 + (this.paddedHeight - 1) * this.paddedWidth] = (byte)-1;
            }
          }
          this.pieceRow = -1 + this.paddedHeight / 2;
          this.pieceColumn = -1 + this.paddedWidth / 2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("hd.<init>(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void loadPicture(IndexedSprite param0, int param1) {
        byte[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var5 = 0;
        int var7 = Pixelate.field_H ? 1 : 0;
        int var5Lifetime1;
        try {
          var3 = param0.indices;
          for (var4 = 0; param0.field_a > var4; var4++) {
            for (var5 = 0; var5 < param0.field_f; var5++) {
              var6 = 1 + var5 + (1 + var4) * this.paddedWidth;
              this.cells[var6] = (byte)cm.bitAnd((int) this.cells[var6], -4);
              this.cells[var6] = (byte)bq.bitOr((int) this.cells[var6], (int) var3[param0.field_f * var4 + var5]);
              this.cells[var6] = (byte)bq.bitOr((int) this.cells[var6], 4);
            }
          }
          var5Lifetime1 = -8 % ((param1 + 13) / 43);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "hd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_l = "You need to play 1 more rated game to unlock this option.";
        field_o = "Ask to join <%0>'s game";
    }
}
