/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class epa extends MenuScreen {
    static int[] field_r;
    static String field_q;

    final int getItemHeight(int param0, int param1) {
        if (param1 < 121) {
          return -92;
        }
        if (5 > param0) {
          return 100;
        }
        return cq.field_d.field_k + cq.field_d.field_w;
    }

    epa(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void releaseStatics(int param0) {
        if (param0 != 2) {
          epa.releaseStatics(10);
          field_q = null;
          field_r = null;
          return;
        }
        field_q = null;
        field_r = null;
    }

    final int getItemY(int param0, int param1) {
        if (param0 < 3) {
          return -cq.field_d.field_w + this.firstItemY;
        }
        if (param1 != 30) {
          field_r = (int[]) null;
          if (param0 < 5) {
            return this.firstItemY + this.getItemHeight(0, 125) - cq.field_d.field_w;
          }
          return (param0 > 4 ? 30 : -1 + this.items.length == param0 ? 60 : 30) - cq.field_d.field_w + (this.firstItemY + (-2 + param0) * this.itemSpacing);
        }
        if (param0 < 5) {
          return this.firstItemY + this.getItemHeight(0, 125) - cq.field_d.field_w;
        }
        return (param0 > 4 ? 30 : -1 + this.items.length == param0 ? 60 : 30) - cq.field_d.field_w + (this.firstItemY + (-2 + param0) * this.itemSpacing);
    }

    final static void a(int param0, byte param1, String param2) {
        int var3_int = 0;
        try {
          if (param1 != -84) {
            field_q = (String) null;
          }
          gj.field_r = false;
          TileOperator.field_p = false;
          if (TextureOperator.field_l != null &&
            TextureOperator.field_l.field_B) {
            var3_int = 1;
            if (param0 == 8) {
              if (!LoadProfileCommand.field_r) {
                param2 = TestModel.field_n;
              } else {
                param2 = SoundCache.field_d;
              }
              param0 = 2;
              vn.field_b.a(ScrollControlWidget.field_E, 123);
            }
            if (param0 == 10) {
              ToolkitModel.a((byte) -33);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (gj.field_r) {
                param2 = LegacyOpenGlFlowingWaterEffect.formatText(94, nka.field_a, new String[]{param2});
              }
              if (S2CProfileUpdatePacket.field_d) {
                param2 = KeySwitchComponent.field_K;
              }
              TextureOperator.field_l.showResultMessage(param0, (byte) 94, param2);
            }
            if (param0 != 256) {
              if (10 == param0) {
                return;
              }
              if (!LoadProfileCommand.field_r) {
                vn.field_b.clearFields((byte) -92);
                return;
              }
            }
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "epa.CA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static PcmStreamMixer d(byte param0) {
        if (param0 != -91) {
          epa.releaseStatics(15);
          return PitModel.field_n;
        }
        return PitModel.field_n;
    }

    final int getItemRight(int param0, byte param1) {
        if (param1 != -48) {
          field_r = (int[]) null;
        }
        if (param0 == 0) {
          return -110 + this.itemRight;
        }
        if (param0 == 1) {
          return this.itemRight - 25;
        }
        if (2 == param0) {
          return this.itemRight + 60;
        }
        if (3 == param0) {
          return -80 + this.itemRight;
        }
        if (4 == param0) {
          return this.itemRight + 30;
        }
        if (param0 == 6) {
          return this.itemRight - 10;
        }
        if (7 == param0) {
          return this.itemRight - 10;
        }
        return this.itemRight;
    }

    final int getItemX(byte param0, int param1) {
        if (param1 == 0) {
          return this.itemX - 80;
        }
        if (param1 == 1) {
          return 5 + this.itemX;
        }
        if (param0 < 111) {
          return -91;
        }
        if (param1 == 2) {
          return 90 + this.itemX;
        }
        if (param1 == 3) {
          return -50 + this.itemX;
        }
        if (4 == param1) {
          return this.itemX + 60;
        }
        if (param1 == 6) {
          return this.itemX - 10;
        }
        if (param1 != 7) {
          return this.itemX;
        }
        return this.itemX - 10;
    }

    static {
        field_q = "Change display name";
        field_r = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
