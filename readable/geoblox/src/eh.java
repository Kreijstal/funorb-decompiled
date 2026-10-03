/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static int pendingActionPanelTop;
    static String openInPopupWindowText;
    static ClientProtocolStage field_b;
    static PacketBuffer field_d;

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = Geoblox.clientControlFlowFlag;
        if (DequeCursor.logoAnimationTick < 0) {
          return;
        }
        var3 = -135 + param1;
        var4 = param0 - 35;
        var5 = 256;
        if (75 > DequeCursor.logoAnimationTick) {
          var5 = (DequeCursor.logoAnimationTick << 8) / 75;
        }
        if (DequeCursor.logoAnimationTick > 200) {
          var5 = (250 - DequeCursor.logoAnimationTick << 8) / 50;
        }
        Geoblox.setRasterTarget(1, ki.field_c);
        TriangleRasterState.prepareTriangleClipFromRasterizer();
        SoftwareRasterizer.clearFramebuffer();
        TextTemplateArgumentType.renderLogoMeshes((byte) 123);
        if (var5 < 256) {
          SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.stride, SoftwareRasterizer.framebufferHeight, 0, -var5 + 256);
          id.restoreRasterTarget(true);
          if (DequeCursor.logoAnimationTick >= 150) {
            bk.field_b.drawAlpha(15 + var3, var4 + 10, var5);
          } else {
            ki.field_c.drawHalfSize(var3, var4);
          }
          var6 = -125 + DequeCursor.logoAnimationTick;
          if (param2 != -51) {
            openInPopupWindowText = (String) null;
          }
          if ((var6 > 0) &&
              (var6 < 50)) {
            if (var6 >= 20) {
              if (var6 >= 30) {
                var7 = 256 * (-var6 + 50) / 20;
                ProxySocketConnector.field_l.drawAdditive(var3, var4, var7);
              } else {
                ProxySocketConnector.field_l.drawAdditive(var3, var4, 256);
              }
            } else {
              var7 = var6 * 256 / 20;
              ProxySocketConnector.field_l.drawAdditive(var3, var4, var7);
            }
          }
        } else {
          id.restoreRasterTarget(true);
          if (DequeCursor.logoAnimationTick >= 150) {
            bk.field_b.drawAlpha(15 + var3, var4 + 10, var5);
            var6 = -125 + DequeCursor.logoAnimationTick;
            if (param2 != -51) {
              openInPopupWindowText = (String) null;
              if ((var6 > 0) &&
                  (var6 < 50)) {
                if (var6 >= 20) {
                  if (var6 >= 30) {
                    var7 = 256 * (-var6 + 50) / 20;
                    ProxySocketConnector.field_l.drawAdditive(var3, var4, var7);
                  } else {
                    ProxySocketConnector.field_l.drawAdditive(var3, var4, 256);
                  }
                } else {
                  var7 = var6 * 256 / 20;
                  ProxySocketConnector.field_l.drawAdditive(var3, var4, var7);
                }
              }
              var6 = DequeCursor.logoAnimationTick - 140;
              if (var6 > 0) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                }
                cl.field_b.drawAlpha(15 + var3, var4 + 10, var5 * var7 >> 8);
              }
            } else {
              if (var6 <= 0) {
                var6 = DequeCursor.logoAnimationTick - 140;
                if (var6 > 0) {
                  var7 = 256;
                  if (var6 < 20) {
                    var7 = var6 * 256 / 20;
                  }
                  cl.field_b.drawAlpha(15 + var3, var4 + 10, var5 * var7 >> 8);
                }
              } else {
                if (var6 >= 50) {
                  var6 = DequeCursor.logoAnimationTick - 140;
                  if (var6 > 0) {
                    var7 = 256;
                    if (var6 < 20) {
                      var7 = var6 * 256 / 20;
                    }
                    cl.field_b.drawAlpha(15 + var3, var4 + 10, var5 * var7 >> 8);
                  }
                } else {
                  if (var6 < 20) {
                    var7 = var6 * 256 / 20;
                    ProxySocketConnector.field_l.drawAdditive(var3, var4, var7);
                    var6 = DequeCursor.logoAnimationTick - 140;
                    if (var6 > 0) {
                      var7 = 256;
                      if (var6 < 20) {
                        var7 = var6 * 256 / 20;
                      }
                      cl.field_b.drawAlpha(15 + var3, var4 + 10, var5 * var7 >> 8);
                    }
                  } else {
                    if (var6 < 30) {
                      ProxySocketConnector.field_l.drawAdditive(var3, var4, 256);
                      var6 = DequeCursor.logoAnimationTick - 140;
                      if (var6 > 0) {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = var6 * 256 / 20;
                        }
                        cl.field_b.drawAlpha(15 + var3, var4 + 10, var5 * var7 >> 8);
                      }
                    } else {
                      var7 = 256 * (-var6 + 50) / 20;
                      ProxySocketConnector.field_l.drawAdditive(var3, var4, var7);
                      var6 = DequeCursor.logoAnimationTick - 140;
                      if (var6 > 0) {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = var6 * 256 / 20;
                        }
                        cl.field_b.drawAlpha(15 + var3, var4 + 10, var5 * var7 >> 8);
                      }
                    }
                  }
                }
              }
            }
            return;
          }
          ki.field_c.drawHalfSize(var3, var4);
          var6 = -125 + DequeCursor.logoAnimationTick;
          if (param2 != -51) {
            openInPopupWindowText = (String) null;
            if ((var6 > 0) &&
                (var6 < 50)) {
              if (var6 >= 20) {
                if (var6 >= 30) {
                  var7 = 256 * (-var6 + 50) / 20;
                  ProxySocketConnector.field_l.drawAdditive(var3, var4, var7);
                } else {
                  ProxySocketConnector.field_l.drawAdditive(var3, var4, 256);
                }
              } else {
                var7 = var6 * 256 / 20;
                ProxySocketConnector.field_l.drawAdditive(var3, var4, var7);
              }
            }
          } else {
            if ((var6 > 0) &&
                (var6 < 50)) {
              if (var6 < 20) {
                var7 = var6 * 256 / 20;
                ProxySocketConnector.field_l.drawAdditive(var3, var4, var7);
              } else {
                if (var6 < 30) {
                  ProxySocketConnector.field_l.drawAdditive(var3, var4, 256);
                } else {
                  var7 = 256 * (-var6 + 50) / 20;
                  ProxySocketConnector.field_l.drawAdditive(var3, var4, var7);
                }
              }
            }
          }
        }
        var6 = DequeCursor.logoAnimationTick - 140;
        if (var6 > 0) {
          var7 = 256;
          if (var6 < 20) {
            var7 = var6 * 256 / 20;
          }
          cl.field_b.drawAlpha(15 + var3, var4 + 10, var5 * var7 >> 8);
        }
        return;
    }

    public static void a(int param0) {
        openInPopupWindowText = null;
        field_d = null;
        field_b = null;
        if (param0 != -6910) {
            pendingActionPanelTop = -22;
        }
    }

    final static void a(byte param0) {
        InstrumentPatch.field_q = false;
        tc.field_a = null;
        int var1 = 46 / ((param0 + 64) / 39);
        ResizableDialog.field_V = 0;
        bc.field_a = -1;
        PendingActionMarker.field_g = -1;
    }

    static {
        openInPopupWindowText = "Open in popup window";
        field_b = new ClientProtocolStage();
    }
}
