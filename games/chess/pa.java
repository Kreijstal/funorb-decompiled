/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends o {
    static String field_k;
    static String field_n;
    static int[] field_o;
    static String[] field_l;
    static ci field_m;
    static String[] field_j;
    int field_p;
    int[] field_q;

    public static void c(byte param0) {
        field_j = null;
        field_n = null;
        field_k = null;
        field_l = null;
        field_m = null;
        field_o = null;
    }

    final static void a(int param0, boolean param1, p param2, jk param3) {
        try {
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            Object var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            String stackIn_38_2 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            var14 = Chess.field_G;
            try {
              L0: {
                L1: {
                  var18 = (Object) (Object) new fl();
                  ((fl) var18).field_l = param2.i(-82);
                  ((fl) var18).field_t = param2.e((byte) -102);
                  ((fl) var18).field_v = new int[((fl) var18).field_l];
                  if (param1) {
                    break L1;
                  } else {
                    field_n = null;
                    break L1;
                  }
                }
                ((fl) var18).field_w = new nl[((fl) var18).field_l];
                ((fl) var18).field_r = new byte[((fl) var18).field_l][][];
                ((fl) var18).field_u = new nl[((fl) var18).field_l];
                ((fl) var18).field_q = new int[((fl) var18).field_l];
                ((fl) var18).field_o = new int[((fl) var18).field_l];
                var5 = 0;
                L2: while (true) {
                  if (~((fl) var18).field_l >= ~var5) {
                    vj.field_c.a((o) var18, (byte) 92);
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            L6: {
                              var6_int = param2.i(-101);
                              if (var6_int == 0) {
                                break L6;
                              } else {
                                if (var6_int == 1) {
                                  break L6;
                                } else {
                                  if (var6_int == 2) {
                                    break L6;
                                  } else {
                                    L7: {
                                      if (var6_int == 3) {
                                        break L7;
                                      } else {
                                        if (var6_int != 4) {
                                          break L5;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var20 = param2.d(0);
                                    var8 = param2.d(0);
                                    var9 = param2.i(-107);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L8: while (true) {
                                      if (var9 <= var11_int) {
                                        L9: {
                                          var23 = new byte[var9][];
                                          var22 = var23;
                                          var21 = var22;
                                          var19 = var21;
                                          var11 = var19;
                                          if (var6_int != 3) {
                                            break L9;
                                          } else {
                                            var12_int = 0;
                                            L10: while (true) {
                                              if (var12_int >= var9) {
                                                break L9;
                                              } else {
                                                var13 = param2.e((byte) -108);
                                                var11[var12_int] = new byte[var13];
                                                param2.a(var13, (byte) 121, var23[var12_int], 0);
                                                var12_int++;
                                                continue L10;
                                              }
                                            }
                                          }
                                        }
                                        ((fl) var18).field_q[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L11: while (true) {
                                          if (var17 >= var9) {
                                            ((fl) var18).field_u[var5] = param3.a(8, var8, var12, kl.a(0, var20));
                                            ((fl) var18).field_r[var5] = var23;
                                            break L4;
                                          } else {
                                            var12[var17] = kl.a(0, var10[var17]);
                                            var17++;
                                            continue L11;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param2.d(0);
                                        var11_int++;
                                        continue L8;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L12: {
                              var16 = param2.d(0);
                              String dupTemp$1 = param2.d(0);
                              var15 = dupTemp$1;
                              var8 = dupTemp$1;
                              var9 = 0;
                              if (var6_int == 1) {
                                var9 = param2.e((byte) -94);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            ((fl) var18).field_q[var5] = var6_int;
                            ((fl) var18).field_v[var5] = var9;
                            ((fl) var18).field_w[var5] = param3.a(var15, kl.a(0, var16), (byte) 73);
                            break L5;
                          }
                          break L4;
                        }
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L13: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((fl) var18).field_o[var5] = -1;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L16: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((fl) var18).field_o[var5] = -4;
                        break L16;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L17: {
                        var6_ref4 = decompiledCaughtException;
                        ((fl) var18).field_o[var5] = -5;
                        break L17;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L18: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_35_0 = (RuntimeException) var4;
                stackOut_35_1 = new StringBuilder().append("pa.B(").append(param0).append(44).append(param1).append(44);
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                if (param2 == null) {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "null";
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  stackIn_38_2 = stackOut_37_2;
                  break L18;
                } else {
                  stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                  stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                  stackOut_36_2 = "{...}";
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_38_2 = stackOut_36_2;
                  break L18;
                }
              }
              L19: {
                stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(44);
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                if (param3 == null) {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "null";
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  break L19;
                } else {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "{...}";
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_41_2 = stackOut_39_2;
                  break L19;
                }
              }
              throw fk.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private pa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_o = new int[8192];
        field_j = new String[]{"<br><br>Pawns have the most complex rules:<br><br>* Pawns are the only pieces that capture in a different way than they move; they can capture enemy pieces on either square diagonally in front of them, but cannot move there if those squares are empty;<br><br>* A pawn can move forward if, and only if, that square is empty, but cannot capture pieces directly ahead;<br><br>* The first time it moves, it can move forward two squares if <u>both</u> squares in front of the pawn are empty;<br><br>* If a pawn moves forward two squares, the opponent's pawns can, on the next turn only, take it as if it had only moved forward one square. This is known as 'en passant';<br><br>* If a pawn moves all the way to the last rank it can be converted into a queen, rook, bishop or knight. This is called 'promotion'", "<br><br>The rook moves any number of squares either horizontally or vertically, but cannot jump over other pieces en route;<br><br>The rook is also involved in the king's special 'castling' move. For more information on castling, read the rules for the king.", "<br><br>The knight moves two spaces vertically and one horizontally, or vice versa;<br><br>The knight is the <u>only</u> piece that can jump over occupied squares. It can do this regardless of the colour of the pieces occupying those squares;<br><br>The colour of the square it occupies alternates after each move.", "<br><br>The bishop moves any number of squares diagonally, but cannot jump over other pieces en route;<br><br>The bishop will remain on the same colour of square throughout the game.", "<br><br>The queen moves any number of squares horizontally, vertically or diagonally, but cannot jump over other pieces en route;<br><br>Due to its movement abilities the queen is the most powerful piece on the board.", "<br><br>The king can move one square horizontally, vertically or diagonally, or can, once per game, perform a special move called 'castling';<br><br>To perform this move, select the king, not the rook. The rook will move automatically, after you've moved the king;<br><br>Castling consists of moving the king two squares towards a rook <u>and</u> moving the rook to the square the king moved through, but is only allowed when all the following conditions are true:<br><br>* Neither piece can have been previously moved;<br>* There must not be any pieces between the king and the rook;<br>* The king must not be in check, nor move through check;<br>* The rook cannot be a promoted pawn. For more information on promotion, read the rules for the pawn."};
        field_k = "Updates will sent to the email address you've given";
        field_n = "Game options changed (<%0>)";
    }
}
