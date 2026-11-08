/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RankingsBufferSupport {
    static boolean field_f;
    static String tutorialEightBallAfterfirstpot;
    static int field_b;
    static int field_d;
    static int keycodeDefaultRight1;
    static MeshBuilder field_e;

    final static Sprite[] alignPanelEdgeSprites(Sprite[] sprites, byte obfuscationGuard) {
        RuntimeException var2 = null;
        Sprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          sprites[3].field_y = sprites[3].field_A;
          if (obfuscationGuard != -29) {
            tutorialEightBallAfterfirstpot = (String) null;
          }
          sprites[1].field_w = sprites[1].field_z;
          sprites[5].field_y = sprites[5].field_A;
          sprites[7].field_w = sprites[7].field_z;
          stackIn_3_0 = (Sprite[]) (sprites);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gn.A(");
          if (sprites == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void allocateRankingsArrays(int param0, int param1, boolean param2) {
        if (StateIconLabel.field_Nb == null) {
          StateIconLabel.field_Nb = new int[param0 * 2];
          if (TickClock.field_g == null ||
            !(param0 <= TickClock.field_g.length)) {
            TickClock.field_g = new int[param0 * 2];
          }
          if (null == MenuScreen.field_y ||
            !(MenuScreen.field_y.length >= param0)) {
            MenuScreen.field_y = new int[param0 * 2];
          }
          if (param2) {
            return;
          }
          if (TextInputPainter.field_s == null ||
            !(TextInputPainter.field_s.length >= param0)) {
            TextInputPainter.field_s = new int[2 * param0];
          }
          if (LoginTextSupport.field_d == null) {
            LoginTextSupport.field_d = new int[param0 * 2];
          } else {
            if (LoginTextSupport.field_d.length < param0) {
              LoginTextSupport.field_d = new int[param0 * 2];
              if (VertexNormal.field_c == null ||
                !(VertexNormal.field_c.length >= param0)) {
                VertexNormal.field_c = new int[param0 * 2];
              }
              if (NetworkGameClient.field_H == null ||
                !(param1 + param0 <= NetworkGameClient.field_H.length)) {
                NetworkGameClient.field_H = new int[2 * (param1 + param0)];
              }
              if (LobbyPlayer.field_cc == null ||
                !(LobbyPlayer.field_cc.length >= param0)) {
                LobbyPlayer.field_cc = new boolean[2 * param0];
              }
              DiskCacheWorker.field_d = 2147483647;
              LogoJingleLoader.field_a = -2147483648;
              SpriteSheetLoadSupport.field_c = -2147483648;
              MenuScreenBase.field_c = 0;
              ArchiveRequest.field_z = 2147483647;
              return;
            }
          }
          if (VertexNormal.field_c == null) {
            VertexNormal.field_c = new int[param0 * 2];
            if (NetworkGameClient.field_H == null ||
              !(param1 + param0 <= NetworkGameClient.field_H.length)) {
              NetworkGameClient.field_H = new int[2 * (param1 + param0)];
            }
            if (LobbyPlayer.field_cc == null ||
              !(LobbyPlayer.field_cc.length >= param0)) {
              LobbyPlayer.field_cc = new boolean[2 * param0];
            }
          } else {
            if (VertexNormal.field_c.length < param0) {
              VertexNormal.field_c = new int[param0 * 2];
              if (NetworkGameClient.field_H == null ||
                !(param1 + param0 <= NetworkGameClient.field_H.length)) {
                NetworkGameClient.field_H = new int[2 * (param1 + param0)];
              }
              if (LobbyPlayer.field_cc == null ||
                !(LobbyPlayer.field_cc.length >= param0)) {
                LobbyPlayer.field_cc = new boolean[2 * param0];
              }
            } else {
              if (NetworkGameClient.field_H == null) {
                NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                if (LobbyPlayer.field_cc == null ||
                  !(LobbyPlayer.field_cc.length >= param0)) {
                  LobbyPlayer.field_cc = new boolean[2 * param0];
                }
              } else {
                if (param1 + param0 > NetworkGameClient.field_H.length) {
                  NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                  if (LobbyPlayer.field_cc == null ||
                    !(LobbyPlayer.field_cc.length >= param0)) {
                    LobbyPlayer.field_cc = new boolean[2 * param0];
                  }
                } else {
                  if (LobbyPlayer.field_cc == null) {
                    LobbyPlayer.field_cc = new boolean[2 * param0];
                  } else {
                    if (LobbyPlayer.field_cc.length < param0) {
                      LobbyPlayer.field_cc = new boolean[2 * param0];
                    }
                  }
                }
              }
            }
          }
        } else {
          if (param0 <= StateIconLabel.field_Nb.length) {
            if (TickClock.field_g == null ||
              !(param0 <= TickClock.field_g.length)) {
              TickClock.field_g = new int[param0 * 2];
            }
            if (null == MenuScreen.field_y ||
              !(MenuScreen.field_y.length >= param0)) {
              MenuScreen.field_y = new int[param0 * 2];
            }
            if (param2) {
              return;
            }
            if (TextInputPainter.field_s == null ||
              !(TextInputPainter.field_s.length >= param0)) {
              TextInputPainter.field_s = new int[2 * param0];
            }
            if (LoginTextSupport.field_d == null) {
              LoginTextSupport.field_d = new int[param0 * 2];
            } else {
              if (LoginTextSupport.field_d.length < param0) {
                LoginTextSupport.field_d = new int[param0 * 2];
                if (VertexNormal.field_c == null ||
                  !(VertexNormal.field_c.length >= param0)) {
                  VertexNormal.field_c = new int[param0 * 2];
                }
                if (NetworkGameClient.field_H == null ||
                  !(param1 + param0 <= NetworkGameClient.field_H.length)) {
                  NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                }
                if (LobbyPlayer.field_cc == null ||
                  !(LobbyPlayer.field_cc.length >= param0)) {
                  LobbyPlayer.field_cc = new boolean[2 * param0];
                }
                DiskCacheWorker.field_d = 2147483647;
                LogoJingleLoader.field_a = -2147483648;
                SpriteSheetLoadSupport.field_c = -2147483648;
                MenuScreenBase.field_c = 0;
                ArchiveRequest.field_z = 2147483647;
                return;
              }
            }
            if (VertexNormal.field_c == null) {
              VertexNormal.field_c = new int[param0 * 2];
              if (NetworkGameClient.field_H == null ||
                !(param1 + param0 <= NetworkGameClient.field_H.length)) {
                NetworkGameClient.field_H = new int[2 * (param1 + param0)];
              }
              if (LobbyPlayer.field_cc == null ||
                !(LobbyPlayer.field_cc.length >= param0)) {
                LobbyPlayer.field_cc = new boolean[2 * param0];
              }
            } else {
              if (VertexNormal.field_c.length < param0) {
                VertexNormal.field_c = new int[param0 * 2];
                if (NetworkGameClient.field_H == null ||
                  !(param1 + param0 <= NetworkGameClient.field_H.length)) {
                  NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                }
                if (LobbyPlayer.field_cc == null ||
                  !(LobbyPlayer.field_cc.length >= param0)) {
                  LobbyPlayer.field_cc = new boolean[2 * param0];
                }
              } else {
                if (NetworkGameClient.field_H == null) {
                  NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                  if (LobbyPlayer.field_cc == null ||
                    !(LobbyPlayer.field_cc.length >= param0)) {
                    LobbyPlayer.field_cc = new boolean[2 * param0];
                  }
                } else {
                  if (param1 + param0 > NetworkGameClient.field_H.length) {
                    NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                    if (LobbyPlayer.field_cc == null ||
                      !(LobbyPlayer.field_cc.length >= param0)) {
                      LobbyPlayer.field_cc = new boolean[2 * param0];
                    }
                  } else {
                    if (LobbyPlayer.field_cc == null) {
                      LobbyPlayer.field_cc = new boolean[2 * param0];
                    } else {
                      if (LobbyPlayer.field_cc.length < param0) {
                        LobbyPlayer.field_cc = new boolean[2 * param0];
                      }
                    }
                  }
                }
              }
            }
          } else {
            StateIconLabel.field_Nb = new int[param0 * 2];
            if (TickClock.field_g == null ||
              !(param0 <= TickClock.field_g.length)) {
              TickClock.field_g = new int[param0 * 2];
            }
            if (null == MenuScreen.field_y ||
              !(MenuScreen.field_y.length >= param0)) {
              MenuScreen.field_y = new int[param0 * 2];
            }
            if (param2) {
              return;
            }
            if (TextInputPainter.field_s == null ||
              !(TextInputPainter.field_s.length >= param0)) {
              TextInputPainter.field_s = new int[2 * param0];
            }
            if (LoginTextSupport.field_d == null) {
              LoginTextSupport.field_d = new int[param0 * 2];
            } else {
              if (LoginTextSupport.field_d.length < param0) {
                LoginTextSupport.field_d = new int[param0 * 2];
                if (VertexNormal.field_c == null ||
                  !(VertexNormal.field_c.length >= param0)) {
                  VertexNormal.field_c = new int[param0 * 2];
                }
                if (NetworkGameClient.field_H == null ||
                  !(param1 + param0 <= NetworkGameClient.field_H.length)) {
                  NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                }
                if (LobbyPlayer.field_cc == null ||
                  !(LobbyPlayer.field_cc.length >= param0)) {
                  LobbyPlayer.field_cc = new boolean[2 * param0];
                }
                DiskCacheWorker.field_d = 2147483647;
                LogoJingleLoader.field_a = -2147483648;
                SpriteSheetLoadSupport.field_c = -2147483648;
                MenuScreenBase.field_c = 0;
                ArchiveRequest.field_z = 2147483647;
                return;
              }
            }
            if (VertexNormal.field_c == null) {
              VertexNormal.field_c = new int[param0 * 2];
              if (NetworkGameClient.field_H == null) {
                NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                if (LobbyPlayer.field_cc == null ||
                  !(LobbyPlayer.field_cc.length >= param0)) {
                  LobbyPlayer.field_cc = new boolean[2 * param0];
                }
              } else {
                if (param1 + param0 > NetworkGameClient.field_H.length) {
                  NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                  if (LobbyPlayer.field_cc == null ||
                    !(LobbyPlayer.field_cc.length >= param0)) {
                    LobbyPlayer.field_cc = new boolean[2 * param0];
                  }
                } else {
                  if (LobbyPlayer.field_cc == null) {
                    LobbyPlayer.field_cc = new boolean[2 * param0];
                  } else {
                    if (LobbyPlayer.field_cc.length < param0) {
                      LobbyPlayer.field_cc = new boolean[2 * param0];
                    }
                  }
                }
              }
            } else {
              if (VertexNormal.field_c.length < param0) {
                VertexNormal.field_c = new int[param0 * 2];
                if (NetworkGameClient.field_H == null ||
                  !(param1 + param0 <= NetworkGameClient.field_H.length)) {
                  NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                }
              } else {
                if (NetworkGameClient.field_H == null) {
                  NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                } else {
                  if (param1 + param0 > NetworkGameClient.field_H.length) {
                    NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                  }
                }
              }
              if (LobbyPlayer.field_cc == null) {
                LobbyPlayer.field_cc = new boolean[2 * param0];
              } else {
                if (LobbyPlayer.field_cc.length < param0) {
                  LobbyPlayer.field_cc = new boolean[2 * param0];
                }
              }
            }
          }
        }
        DiskCacheWorker.field_d = 2147483647;
        LogoJingleLoader.field_a = -2147483648;
        SpriteSheetLoadSupport.field_c = -2147483648;
        MenuScreenBase.field_c = 0;
        ArchiveRequest.field_z = 2147483647;
    }

    final static MeshBuilder mirrorAlongZ(MeshBuilder param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        MeshBuilder stackIn_6_0 = null;
        MeshBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          for (var2_int = 0; param0.vertexZ.length > var2_int; var2_int++) {
            param0.vertexZ[var2_int] = -param0.vertexZ[var2_int];
          }
          if (param1 != 5) {
            stackIn_6_0 = (MeshBuilder) null;
            return stackIn_6_0;
          }
          ImageProducerRasterBuffer.a(param0, (byte) 38);
          param0.clearCaches();
          stackIn_8_0 = (MeshBuilder) (param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("gn.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 1) {
          return;
        }
        field_e = null;
        tutorialEightBallAfterfirstpot = null;
    }

    static {
        tutorialEightBallAfterfirstpot = "Now you have potted a ball, that group - either spots (balls 1-7) or stripes (balls 9-15) - becomes yours. Your objective is now to pot the rest of the balls of your group, then the black ball. You must always hit one of your balls first!";
        keycodeDefaultRight1 = 50;
    }
}
