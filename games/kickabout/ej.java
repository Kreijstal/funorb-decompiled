/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends UiLayoutNode {
    private int field_Bb;
    static String[] field_zb;
    static String field_Ab;
    static String field_yb;

    final void a(boolean param0, int param1) {
        java.awt.Component var4;
        java.awt.Component var4Lifetime1;
        if (this.field_sb != 1) {
          if (this.field_gb) {
            RenderedBall.field_C = this.field_Bb;
          }
        } else {
          if (AuctionListing.field_e != this.field_Bb) {
            AuctionListing.field_e = this.field_Bb;
            if (this.field_gb) {
              RenderedBall.field_C = this.field_Bb;
            }
          } else {
            AuctionListing.field_e = -1;
            if (!this.field_gb) {
              if (param1 < -5) {
                return;
              }
              var4 = (java.awt.Component) null;
              ej.a((java.awt.Component) null, -51);
              return;
            }
            RenderedBall.field_C = this.field_Bb;
          }
        }
        if (param1 < -5) {
          return;
        }
        var4Lifetime1 = (java.awt.Component) null;
        ej.a((java.awt.Component) null, -51);
    }

    final static void b(int param0, int param1, int param2, int param3) {
        FootballerAgent var4 = et.field_d.getBallCarrier((byte) -96);
        var4.field_O = false;
        var4.field_x = param0;
        var4.field_P = param2;
        var4.field_z = param3;
        int var5 = var4.directionMask(5339);
        int var6 = uv.a(true, param2, param0);
        int var7 = param1 > ~pq.b(param1 ^ -172, var6 ^ var5) ? 1 : 0;
        var4.field_h = var6;
        var4.setAction((byte) -31, 2);
        var4.setDirectionFromMask(var4.field_h, 26214);
        if (var7 != 0) {
          var4.actionTime = var4.actionTime + 16;
        }
        var4.actionTime = var4.actionTime + param3;
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          int var2_int = 2 % ((-26 - param1) / 58);
          param0.setFocusTraversalKeysEnabled(false);
          param0.addKeyListener(PlayerModelPreview.field_q);
          param0.addFocusListener(PlayerModelPreview.field_q);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ej.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void c(boolean param0) {
        int var3;
        var3 = Kickabout.field_G;
        if (AuctionListing.field_e == this.field_Bb) {
          SoftwareRasterizer.a(-4 + this.field_F, this.field_T - 4, 40, 40, 2, 65793, 128);
          SoftwareRasterizer.f(this.field_F - 4, -4 + this.field_T, 40, 40, 2, 6710886);
          if (param0) {
            if (c.a(this.field_Bb, 0, BufferedSocket.field_f)) {
              qe.field_i[PacketBuffer.field_e[this.field_Bb]].drawQuarterSize(this.field_F, this.field_T);
            } else {
              if (pc.field_e) {
                qe.field_i[PacketBuffer.field_e[this.field_Bb]].drawQuarterSize(this.field_F, this.field_T);
              } else {
                if (this.field_Bb != 32) {
                  pn.field_w.drawQuarterSize(this.field_F, this.field_T);
                } else {
                  if (TextFieldValidator.f(-1)) {
                    GameModesHelpScreen.field_L.drawQuarterSize(this.field_F, this.field_T);
                  } else {
                    pn.field_w.drawQuarterSize(this.field_F, this.field_T);
                  }
                }
              }
            }
          } else {
            this.c(true);
            if (c.a(this.field_Bb, 0, BufferedSocket.field_f)) {
              qe.field_i[PacketBuffer.field_e[this.field_Bb]].drawQuarterSize(this.field_F, this.field_T);
            } else {
              if (!pc.field_e) {
                if (this.field_Bb == 32) {
                  if (!TextFieldValidator.f(-1)) {
                    pn.field_w.drawQuarterSize(this.field_F, this.field_T);
                  } else {
                    GameModesHelpScreen.field_L.drawQuarterSize(this.field_F, this.field_T);
                  }
                } else {
                  pn.field_w.drawQuarterSize(this.field_F, this.field_T);
                }
              } else {
                qe.field_i[PacketBuffer.field_e[this.field_Bb]].drawQuarterSize(this.field_F, this.field_T);
              }
            }
          }
        } else {
          if (this.field_Bb == RenderedBall.field_C) {
            SoftwareRasterizer.a(this.field_F - 4, -4 + this.field_T, 40, 40, 2, 65793, 32);
            SoftwareRasterizer.f(this.field_F - 4, -4 + this.field_T, 40, 40, 2, 6710886);
          }
          if (param0) {
            if (c.a(this.field_Bb, 0, BufferedSocket.field_f)) {
              qe.field_i[PacketBuffer.field_e[this.field_Bb]].drawQuarterSize(this.field_F, this.field_T);
            } else {
              if (pc.field_e) {
                qe.field_i[PacketBuffer.field_e[this.field_Bb]].drawQuarterSize(this.field_F, this.field_T);
              } else {
                if (this.field_Bb != 32) {
                  pn.field_w.drawQuarterSize(this.field_F, this.field_T);
                } else {
                  if (!TextFieldValidator.f(-1)) {
                    pn.field_w.drawQuarterSize(this.field_F, this.field_T);
                  } else {
                    GameModesHelpScreen.field_L.drawQuarterSize(this.field_F, this.field_T);
                  }
                }
              }
            }
          } else {
            this.c(true);
            if (c.a(this.field_Bb, 0, BufferedSocket.field_f)) {
              qe.field_i[PacketBuffer.field_e[this.field_Bb]].drawQuarterSize(this.field_F, this.field_T);
            } else {
              if (!pc.field_e) {
                if (this.field_Bb == 32) {
                  if (!TextFieldValidator.f(-1)) {
                    pn.field_w.drawQuarterSize(this.field_F, this.field_T);
                  } else {
                    GameModesHelpScreen.field_L.drawQuarterSize(this.field_F, this.field_T);
                  }
                } else {
                  pn.field_w.drawQuarterSize(this.field_F, this.field_T);
                }
              } else {
                qe.field_i[PacketBuffer.field_e[this.field_Bb]].drawQuarterSize(this.field_F, this.field_T);
              }
            }
          }
        }
    }

    public static void h(byte param0) {
        if (param0 > 102) {
          field_zb = null;
          field_Ab = null;
          field_yb = null;
          return;
        }
        ej.h((byte) 120);
        field_zb = null;
        field_Ab = null;
        field_yb = null;
    }

    ej(int param0) {
        this.field_Bb = param0;
    }

    static {
        field_Ab = "Spectate <%0>'s game";
        field_zb = new String[]{"park", "beach", "street"};
        field_yb = "Waiting for music";
    }
}
