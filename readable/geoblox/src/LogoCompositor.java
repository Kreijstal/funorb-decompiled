/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LogoCompositor {
    static int pendingActionPanelTop;
    static String openInPopupWindowText;
    static ClientProtocolStage connectedSessionStage;
    static PacketBuffer sessionPacketBuffer;

    final static void drawLogoAnimation(int centerY, int centerX, int methodGuard) {
        int logoLeft;
        int logoTop;
        int sceneAlpha256;
        int overlayTickOffset;
        int overlayAlpha256;
        int clientControlFlowGuard;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        if (DequeCursor.logoAnimationTick < 0) {
          return;
        }
        logoLeft = -135 + centerX;
        logoTop = centerY - 35;
        sceneAlpha256 = 256;
        if (75 > DequeCursor.logoAnimationTick) {
          sceneAlpha256 = (DequeCursor.logoAnimationTick << 8) / 75;
        }
        if (DequeCursor.logoAnimationTick > 200) {
          sceneAlpha256 = (250 - DequeCursor.logoAnimationTick << 8) / 50;
        }
        Geoblox.setRasterTarget(1, SessionSnapshotSupport.logoSceneRaster);
        TriangleRasterState.prepareTriangleClipFromRasterizer();
        SoftwareRasterizer.clearFramebuffer();
        TextTemplateArgumentType.renderLogoMeshes((byte) 123);
        if (sceneAlpha256 < 256) {
          SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.stride, SoftwareRasterizer.framebufferHeight, 0, -sceneAlpha256 + 256);
          RasterTargetRestoreSupport.restoreRasterTarget(true);
          if (DequeCursor.logoAnimationTick >= 150) {
            LogoPreparationSupport.logoFinalFrameTop.drawAlpha(15 + logoLeft, logoTop + 10, sceneAlpha256);
          } else {
            SessionSnapshotSupport.logoSceneRaster.drawHalfSize(logoLeft, logoTop);
          }
          overlayTickOffset = -125 + DequeCursor.logoAnimationTick;
          if (methodGuard != -51) {
            openInPopupWindowText = (String) null;
          }
          if ((overlayTickOffset > 0) &&
              (overlayTickOffset < 50)) {
            if (overlayTickOffset >= 20) {
              if (overlayTickOffset >= 30) {
                overlayAlpha256 = 256 * (-overlayTickOffset + 50) / 20;
                ProxySocketConnector.logoGlowRaster.drawAdditive(logoLeft, logoTop, overlayAlpha256);
              } else {
                ProxySocketConnector.logoGlowRaster.drawAdditive(logoLeft, logoTop, 256);
              }
            } else {
              overlayAlpha256 = overlayTickOffset * 256 / 20;
              ProxySocketConnector.logoGlowRaster.drawAdditive(logoLeft, logoTop, overlayAlpha256);
            }
          }
        } else {
          RasterTargetRestoreSupport.restoreRasterTarget(true);
          if (DequeCursor.logoAnimationTick >= 150) {
            LogoPreparationSupport.logoFinalFrameTop.drawAlpha(15 + logoLeft, logoTop + 10, sceneAlpha256);
            overlayTickOffset = -125 + DequeCursor.logoAnimationTick;
            if (methodGuard != -51) {
              openInPopupWindowText = (String) null;
              if ((overlayTickOffset > 0) &&
                  (overlayTickOffset < 50)) {
                if (overlayTickOffset >= 20) {
                  if (overlayTickOffset >= 30) {
                    overlayAlpha256 = 256 * (-overlayTickOffset + 50) / 20;
                    ProxySocketConnector.logoGlowRaster.drawAdditive(logoLeft, logoTop, overlayAlpha256);
                  } else {
                    ProxySocketConnector.logoGlowRaster.drawAdditive(logoLeft, logoTop, 256);
                  }
                } else {
                  overlayAlpha256 = overlayTickOffset * 256 / 20;
                  ProxySocketConnector.logoGlowRaster.drawAdditive(logoLeft, logoTop, overlayAlpha256);
                }
              }
              overlayTickOffset = DequeCursor.logoAnimationTick - 140;
              if (overlayTickOffset > 0) {
                overlayAlpha256 = 256;
                if (overlayTickOffset < 20) {
                  overlayAlpha256 = overlayTickOffset * 256 / 20;
                }
                UsernameQuerySupport.logoFinalFrameBottom.drawAlpha(15 + logoLeft, logoTop + 10, sceneAlpha256 * overlayAlpha256 >> 8);
              }
            } else {
              if (overlayTickOffset <= 0) {
                overlayTickOffset = DequeCursor.logoAnimationTick - 140;
                if (overlayTickOffset > 0) {
                  overlayAlpha256 = 256;
                  if (overlayTickOffset < 20) {
                    overlayAlpha256 = overlayTickOffset * 256 / 20;
                  }
                  UsernameQuerySupport.logoFinalFrameBottom.drawAlpha(15 + logoLeft, logoTop + 10, sceneAlpha256 * overlayAlpha256 >> 8);
                }
              } else {
                if (overlayTickOffset >= 50) {
                  overlayTickOffset = DequeCursor.logoAnimationTick - 140;
                  if (overlayTickOffset > 0) {
                    overlayAlpha256 = 256;
                    if (overlayTickOffset < 20) {
                      overlayAlpha256 = overlayTickOffset * 256 / 20;
                    }
                    UsernameQuerySupport.logoFinalFrameBottom.drawAlpha(15 + logoLeft, logoTop + 10, sceneAlpha256 * overlayAlpha256 >> 8);
                  }
                } else {
                  if (overlayTickOffset < 20) {
                    overlayAlpha256 = overlayTickOffset * 256 / 20;
                    ProxySocketConnector.logoGlowRaster.drawAdditive(logoLeft, logoTop, overlayAlpha256);
                    overlayTickOffset = DequeCursor.logoAnimationTick - 140;
                    if (overlayTickOffset > 0) {
                      overlayAlpha256 = 256;
                      if (overlayTickOffset < 20) {
                        overlayAlpha256 = overlayTickOffset * 256 / 20;
                      }
                      UsernameQuerySupport.logoFinalFrameBottom.drawAlpha(15 + logoLeft, logoTop + 10, sceneAlpha256 * overlayAlpha256 >> 8);
                    }
                  } else {
                    if (overlayTickOffset < 30) {
                      ProxySocketConnector.logoGlowRaster.drawAdditive(logoLeft, logoTop, 256);
                      overlayTickOffset = DequeCursor.logoAnimationTick - 140;
                      if (overlayTickOffset > 0) {
                        overlayAlpha256 = 256;
                        if (overlayTickOffset < 20) {
                          overlayAlpha256 = overlayTickOffset * 256 / 20;
                        }
                        UsernameQuerySupport.logoFinalFrameBottom.drawAlpha(15 + logoLeft, logoTop + 10, sceneAlpha256 * overlayAlpha256 >> 8);
                      }
                    } else {
                      overlayAlpha256 = 256 * (-overlayTickOffset + 50) / 20;
                      ProxySocketConnector.logoGlowRaster.drawAdditive(logoLeft, logoTop, overlayAlpha256);
                      overlayTickOffset = DequeCursor.logoAnimationTick - 140;
                      if (overlayTickOffset > 0) {
                        overlayAlpha256 = 256;
                        if (overlayTickOffset < 20) {
                          overlayAlpha256 = overlayTickOffset * 256 / 20;
                        }
                        UsernameQuerySupport.logoFinalFrameBottom.drawAlpha(15 + logoLeft, logoTop + 10, sceneAlpha256 * overlayAlpha256 >> 8);
                      }
                    }
                  }
                }
              }
            }
            return;
          }
          SessionSnapshotSupport.logoSceneRaster.drawHalfSize(logoLeft, logoTop);
          overlayTickOffset = -125 + DequeCursor.logoAnimationTick;
          if (methodGuard != -51) {
            openInPopupWindowText = (String) null;
            if ((overlayTickOffset > 0) &&
                (overlayTickOffset < 50)) {
              if (overlayTickOffset >= 20) {
                if (overlayTickOffset >= 30) {
                  overlayAlpha256 = 256 * (-overlayTickOffset + 50) / 20;
                  ProxySocketConnector.logoGlowRaster.drawAdditive(logoLeft, logoTop, overlayAlpha256);
                } else {
                  ProxySocketConnector.logoGlowRaster.drawAdditive(logoLeft, logoTop, 256);
                }
              } else {
                overlayAlpha256 = overlayTickOffset * 256 / 20;
                ProxySocketConnector.logoGlowRaster.drawAdditive(logoLeft, logoTop, overlayAlpha256);
              }
            }
          } else {
            if ((overlayTickOffset > 0) &&
                (overlayTickOffset < 50)) {
              if (overlayTickOffset < 20) {
                overlayAlpha256 = overlayTickOffset * 256 / 20;
                ProxySocketConnector.logoGlowRaster.drawAdditive(logoLeft, logoTop, overlayAlpha256);
              } else {
                if (overlayTickOffset < 30) {
                  ProxySocketConnector.logoGlowRaster.drawAdditive(logoLeft, logoTop, 256);
                } else {
                  overlayAlpha256 = 256 * (-overlayTickOffset + 50) / 20;
                  ProxySocketConnector.logoGlowRaster.drawAdditive(logoLeft, logoTop, overlayAlpha256);
                }
              }
            }
          }
        }
        overlayTickOffset = DequeCursor.logoAnimationTick - 140;
        if (overlayTickOffset > 0) {
          overlayAlpha256 = 256;
          if (overlayTickOffset < 20) {
            overlayAlpha256 = overlayTickOffset * 256 / 20;
          }
          UsernameQuerySupport.logoFinalFrameBottom.drawAlpha(15 + logoLeft, logoTop + 10, sceneAlpha256 * overlayAlpha256 >> 8);
        }
        return;
    }

    public static void releaseStaticReferences(int methodGuard) {
        openInPopupWindowText = null;
        sessionPacketBuffer = null;
        connectedSessionStage = null;
        if (methodGuard != -6910) {
            pendingActionPanelTop = -22;
        }
    }

    final static void resetUiInteractionState(byte methodGuard) {
        InstrumentPatch.field_q = false;
        SettingsCookieSupport.field_a = null;
        int sentinelDivision = 46 / ((methodGuard + 64) / 39);
        ResizableDialog.field_V = 0;
        ByteTextDecodingSupport.field_a = -1;
        PendingActionMarker.field_g = -1;
    }

    static {
        openInPopupWindowText = "Open in popup window";
        connectedSessionStage = new ClientProtocolStage();
    }
}
