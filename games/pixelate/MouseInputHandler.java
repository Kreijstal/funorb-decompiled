/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MouseInputHandler implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_b;
    static int field_c;
    static String field_a;

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wb.mouseClicked(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (fj.field_c != null) {
            jm.field_o = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "wb.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
          long dupTemp$1 = 0L;
          IOException var2 = null;
          CipherPacketBuffer var4 = null;
          CipherPacketBuffer var5 = null;
          int stackIn_11_0 = 0;
          Throwable decompiledCaughtException = null;
          if (ra.field_b == null) {
            ra.field_b = OptionsScreen.field_p.requestSocket(param0 ^ 20278, MatchController.field_B, gd.field_g);
          }
          if (param0 == ra.field_b.field_b) {
            return false;
          }
          dupTemp$1 = hm.a(64);
          aj.field_m = dupTemp$1;
          SpriteCheckboxPainter.field_c = dupTemp$1;
          if (ra.field_b.field_b != 1) {
            GameModeSelectScreen.field_s = jm.field_q;
          } else {
            try {
              NodeHashTableIterator.field_e = new BufferedSocket((java.net.Socket) (ra.field_b.field_e), OptionsScreen.field_p);
              aa.field_f.position = 0;
              var4 = MusicCrossfadeStream.field_o;
              var5 = var4;
              GameModeSelectScreen.field_s = ij.field_o;
              var5.position = 0;
              stackIn_11_0 = (param1) ? -2 : -1;
              BirthDateEntryPanel.field_G = stackIn_11_0;
              gb.field_d = stackIn_11_0;
              MarkerSlider.field_U = stackIn_11_0;
              FallingPieceView.a(CipherPacketBuffer.field_q, (byte) 66, bj.field_a, aa.field_f, hf.field_n);
              SecondaryNodeHashTable.flushOutgoingPackets(-1, 10000);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              GameModeSelectScreen.field_s = jm.field_q;
              ra.field_b = null;
              return true;
            }
          }
          ra.field_b = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        try {
          if (null != fj.field_c) {
            oi.field_c = 0;
            QuickChatPhraseCache.field_b = param0.getX();
            ra.field_d = param0.getY();
            QuickChatPhraseCache.field_j = true;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "wb.mouseDragged(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != fj.field_c) {
            oi.field_c = 0;
            QuickChatPhraseCache.field_b = -1;
            ra.field_d = -1;
            QuickChatPhraseCache.field_j = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wb.mouseExited(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 >= -43) {
          MouseInputHandler.a(48, true);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        try {
          if (fj.field_c != null) {
            oi.field_c = 0;
            QuickChatPhraseCache.field_b = param0.getX();
            ra.field_d = param0.getY();
            QuickChatPhraseCache.field_j = true;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "wb.mouseMoved(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != fj.field_c) {
            oi.field_c = 0;
            EditableTextWidget.field_X = param0.getX();
            IntrusiveNode.field_j = param0.getY();
            hm.a(64);
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              tl.field_a = 2;
              jm.field_o = 2;
            } else {
              tl.field_a = 1;
              jm.field_o = 1;
            }
            var2_int = param0.getModifiers();
            if ((var2_int & 4) == 0) {
            }
            if ((var2_int & 8) != 0) {
            }
            if ((var2_int & 16) == 0) {
            }
            QuickChatPhraseCache.field_j = true;
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("wb.mousePressed(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
          if (fj.field_c != null) {
            oi.field_c = 0;
            QuickChatPhraseCache.field_b = param0.getX();
            ra.field_d = param0.getY();
            QuickChatPhraseCache.field_j = true;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "wb.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != fj.field_c) {
            oi.field_c = 0;
            jm.field_o = 0;
            QuickChatPhraseCache.field_j = true;
            var2_int = param0.getModifiers();
            if ((var2_int & 16) == 0) {
            }
            if (0 != (4 & var2_int)) {
            }
            if ((var2_int & 8) != 0) {
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("wb.mouseReleased(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static IndexedSprite a(IndexedSprite param0, boolean param1, int[] param2) {
        IndexedSprite var3 = null;
        RuntimeException var3_ref = null;
        IndexedSprite stackIn_2_0 = null;
        IndexedSprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new IndexedSprite(0, 0, 0);
          var3.palette = param2;
          var3.field_h = param0.field_h;
          var3.field_f = param0.field_f;
          if (param1) {
            stackIn_2_0 = (IndexedSprite) null;
            return stackIn_2_0;
          }
          var3.field_d = param0.field_d;
          var3.indices = param0.indices;
          var3.field_m = param0.field_m;
          var3.field_a = param0.field_a;
          var3.field_g = param0.field_g;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("wb.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static ResourceArchive a(int param0, byte param1) {
        if (param1 != 124) {
          return (ResourceArchive) null;
        }
        return el.createResourceArchive(-115, true, false, param0, 1, false);
    }

    final static void b(int param0) {
        int fieldTemp$6 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_107_0 = 0;
        bi var1;
        int var2;
        bi var1Lifetime1;
        bi var1Lifetime2;
        var2 = Pixelate.field_H ? 1 : 0;
        if (WeightedLruCache.field_j > 0) {
          WeightedLruCache.field_j = WeightedLruCache.field_j - 1;
          return;
        }
        if (!AlphaContainer.field_N) {
          if (param0 == 5) {
            if (of.field_d == GreenGrowTheRushesBackground.field_m) {
              if (NetworkGameClient.field_D > 0) {
                NetworkGameClient.field_D = NetworkGameClient.field_D - 1;
              } else {
                if (AccountRegistrationPanel.field_S > 0) {
                  AccountRegistrationPanel.field_S = AccountRegistrationPanel.field_S - 1;
                }
              }
            } else {
              fieldTemp$6 = AccountRegistrationPanel.field_S;
              AccountRegistrationPanel.field_S = AccountRegistrationPanel.field_S + 1;
              if (fieldTemp$6 >= 15) {
                of.field_d = GreenGrowTheRushesBackground.field_m;
                stackIn_10_0 = (5 != GreenGrowTheRushesBackground.field_m) ? 15 : 75;
                NetworkGameClient.field_D = stackIn_10_0;
              }
            }
          } else {
            field_c = -69;
            if (of.field_d == GreenGrowTheRushesBackground.field_m) {
              if (NetworkGameClient.field_D > 0) {
                NetworkGameClient.field_D = NetworkGameClient.field_D - 1;
              } else {
                if (AccountRegistrationPanel.field_S > 0) {
                  AccountRegistrationPanel.field_S = AccountRegistrationPanel.field_S - 1;
                }
              }
            } else {
              fieldTemp$5 = AccountRegistrationPanel.field_S;
              AccountRegistrationPanel.field_S = AccountRegistrationPanel.field_S + 1;
              if (fieldTemp$5 >= 15) {
                of.field_d = GreenGrowTheRushesBackground.field_m;
                stackIn_23_0 = (5 != GreenGrowTheRushesBackground.field_m) ? 15 : 75;
                NetworkGameClient.field_D = stackIn_23_0;
              }
            }
          }
        } else {
          if (GameApplet.field_i == StatefulTextPainter.field_v.puzzle.pictureIndex) {
            if (param0 == 5) {
              if (of.field_d == GreenGrowTheRushesBackground.field_m) {
                if (NetworkGameClient.field_D > 0) {
                  NetworkGameClient.field_D = NetworkGameClient.field_D - 1;
                } else {
                  if (AccountRegistrationPanel.field_S > 0) {
                    AccountRegistrationPanel.field_S = AccountRegistrationPanel.field_S - 1;
                  }
                }
              } else {
                fieldTemp$4 = AccountRegistrationPanel.field_S;
                AccountRegistrationPanel.field_S = AccountRegistrationPanel.field_S + 1;
                if (fieldTemp$4 >= 15) {
                  of.field_d = GreenGrowTheRushesBackground.field_m;
                  stackIn_39_0 = (5 != GreenGrowTheRushesBackground.field_m) ? 15 : 75;
                  NetworkGameClient.field_D = stackIn_39_0;
                }
              }
            } else {
              field_c = -69;
              if (of.field_d == GreenGrowTheRushesBackground.field_m) {
                if (NetworkGameClient.field_D > 0) {
                  NetworkGameClient.field_D = NetworkGameClient.field_D - 1;
                } else {
                  if (AccountRegistrationPanel.field_S > 0) {
                    AccountRegistrationPanel.field_S = AccountRegistrationPanel.field_S - 1;
                  }
                }
              } else {
                fieldTemp$3 = AccountRegistrationPanel.field_S;
                AccountRegistrationPanel.field_S = AccountRegistrationPanel.field_S + 1;
                if (fieldTemp$3 >= 15) {
                  of.field_d = GreenGrowTheRushesBackground.field_m;
                  stackIn_52_0 = (5 != GreenGrowTheRushesBackground.field_m) ? 15 : 75;
                  NetworkGameClient.field_D = stackIn_52_0;
                }
              }
            }
          } else {
            GameApplet.field_i = StatefulTextPainter.field_v.puzzle.pictureIndex;
            if (StatefulTextPainter.field_v.field_r == 0) {
              GreenGrowTheRushesBackground.field_m = StatefulTextPainter.field_v.puzzle.pictureIndex;
              if (param0 != 5) {
                field_c = -69;
              }
              if (of.field_d != GreenGrowTheRushesBackground.field_m) {
                fieldTemp$0 = AccountRegistrationPanel.field_S;
                AccountRegistrationPanel.field_S = AccountRegistrationPanel.field_S + 1;
                if (fieldTemp$0 >= 15) {
                  of.field_d = GreenGrowTheRushesBackground.field_m;
                  stackIn_107_0 = (5 != GreenGrowTheRushesBackground.field_m) ? 15 : 75;
                  NetworkGameClient.field_D = stackIn_107_0;
                }
                if (-1 != of.field_d) {
                  var1 = jb.field_b[of.field_d];
                  var1.field_f = -(AccountRegistrationPanel.field_S * (AccountRegistrationPanel.field_S * 270) / 225) + 20;
                }
                return;
              }
              if (NetworkGameClient.field_D > 0) {
                NetworkGameClient.field_D = NetworkGameClient.field_D - 1;
                if (-1 != of.field_d) {
                  var1Lifetime2 = jb.field_b[of.field_d];
                  var1Lifetime2.field_f = -(AccountRegistrationPanel.field_S * (AccountRegistrationPanel.field_S * 270) / 225) + 20;
                }
              } else {
                if (AccountRegistrationPanel.field_S <= 0) {
                  if (-1 != of.field_d) {
                    var1Lifetime2 = jb.field_b[of.field_d];
                    var1Lifetime2.field_f = -(AccountRegistrationPanel.field_S * (AccountRegistrationPanel.field_S * 270) / 225) + 20;
                  }
                } else {
                  AccountRegistrationPanel.field_S = AccountRegistrationPanel.field_S - 1;
                  if (-1 != of.field_d) {
                    var1Lifetime2 = jb.field_b[of.field_d];
                    var1Lifetime2.field_f = -(AccountRegistrationPanel.field_S * (AccountRegistrationPanel.field_S * 270) / 225) + 20;
                  }
                }
              }
              return;
            }
            if (StatefulTextPainter.field_v.field_r != 1) {
              GreenGrowTheRushesBackground.field_m = -1;
              if (param0 != 5) {
                field_c = -69;
              }
              if (of.field_d == GreenGrowTheRushesBackground.field_m) {
                if (NetworkGameClient.field_D > 0) {
                  NetworkGameClient.field_D = NetworkGameClient.field_D - 1;
                } else {
                  if (AccountRegistrationPanel.field_S > 0) {
                    AccountRegistrationPanel.field_S = AccountRegistrationPanel.field_S - 1;
                  }
                }
              } else {
                fieldTemp$2 = AccountRegistrationPanel.field_S;
                AccountRegistrationPanel.field_S = AccountRegistrationPanel.field_S + 1;
                if (fieldTemp$2 >= 15) {
                  of.field_d = GreenGrowTheRushesBackground.field_m;
                  stackIn_70_0 = (5 != GreenGrowTheRushesBackground.field_m) ? 15 : 75;
                  NetworkGameClient.field_D = stackIn_70_0;
                }
              }
            } else {
              stackIn_81_0 = (0 != StatefulTextPainter.field_v.puzzle.pictureIndex) ? -1 : 5;
              GreenGrowTheRushesBackground.field_m = stackIn_81_0;
              if (param0 != 5) {
                field_c = -69;
              }
              if (of.field_d == GreenGrowTheRushesBackground.field_m) {
                if (NetworkGameClient.field_D > 0) {
                  NetworkGameClient.field_D = NetworkGameClient.field_D - 1;
                } else {
                  if (AccountRegistrationPanel.field_S > 0) {
                    AccountRegistrationPanel.field_S = AccountRegistrationPanel.field_S - 1;
                  }
                }
              } else {
                fieldTemp$1 = AccountRegistrationPanel.field_S;
                AccountRegistrationPanel.field_S = AccountRegistrationPanel.field_S + 1;
                if (fieldTemp$1 >= 15) {
                  of.field_d = GreenGrowTheRushesBackground.field_m;
                  stackIn_88_0 = (5 != GreenGrowTheRushesBackground.field_m) ? 15 : 75;
                  NetworkGameClient.field_D = stackIn_88_0;
                }
              }
            }
          }
        }
        if (-1 != of.field_d) {
          var1Lifetime1 = jb.field_b[of.field_d];
          var1Lifetime1.field_f = -(AccountRegistrationPanel.field_S * (AccountRegistrationPanel.field_S * 270) / 225) + 20;
        }
    }

    static {
        field_a = "Puzzle Complete!";
    }
}
