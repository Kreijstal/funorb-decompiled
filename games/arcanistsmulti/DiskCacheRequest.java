/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheRequest extends ArchiveRequest {
    static String field_B;
    SectorCacheStore field_x;
    static IndexedSprite[] field_v;
    byte[] field_z;
    static ResourceArchive field_C;
    static String field_G;
    static String field_I;
    static String field_D;
    static Sprite[] field_E;
    static LoginMethod field_y;
    int field_A;
    static int field_F;
    static BinaryBitmapFont field_w;
    static IndexedSprite[] field_H;
    static Sprite[] field_u;

    final static void updateChatModeSetting(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
          DiskCacheRequest.releaseStatics((byte) 111);
          if (0 == param3) {
            if (param1 == on.field_h) {
              if (param3 != 1) {
                if (2 != param3) {
                  return;
                }
                if (param1 == hd.field_b) {
                  return;
                }
                hd.field_b = param1;
                ui.field_s = true;
                ub.sendChatSettings(param0, false);
                return;
              }
              if (ra.field_m == param1) {
                if (2 != param3) {
                  return;
                }
                if (param1 == hd.field_b) {
                  return;
                }
                hd.field_b = param1;
                ui.field_s = true;
                ub.sendChatSettings(param0, false);
                return;
              }
              ui.field_s = true;
              ra.field_m = param1;
              ub.sendChatSettings(param0, false);
              if (2 != param3) {
                return;
              }
              if (param1 != hd.field_b) {
                hd.field_b = param1;
                ui.field_s = true;
                ub.sendChatSettings(param0, false);
                return;
              }
              return;
            }
            ui.field_s = true;
            on.field_h = param1;
            ub.sendChatSettings(param0, !param2 ? true : false);
          }
          if (param3 == 1 &&
            ra.field_m != param1) {
            ui.field_s = true;
            ra.field_m = param1;
            ub.sendChatSettings(param0, false);
            if (2 == param3 &&
              param1 != hd.field_b) {
              hd.field_b = param1;
              ui.field_s = true;
              ub.sendChatSettings(param0, false);
              return;
            }
            return;
          }
          if (2 != param3) {
            return;
          }
          if (param1 == hd.field_b) {
            return;
          }
          hd.field_b = param1;
          ui.field_s = true;
          ub.sendChatSettings(param0, false);
          return;
        }
        if (0 == param3) {
          if (param1 == on.field_h) {
            if (param3 == 1 &&
              ra.field_m != param1) {
              ui.field_s = true;
              ra.field_m = param1;
              ub.sendChatSettings(param0, false);
              if (2 == param3 &&
                param1 != hd.field_b) {
                hd.field_b = param1;
                ui.field_s = true;
                ub.sendChatSettings(param0, false);
                return;
              }
              return;
            }
            if (2 == param3 &&
              param1 != hd.field_b) {
              hd.field_b = param1;
              ui.field_s = true;
              ub.sendChatSettings(param0, false);
              return;
            }
            return;
          }
          ui.field_s = true;
          on.field_h = param1;
          ub.sendChatSettings(param0, !param2 ? true : false);
        }
        if (param3 == 1 &&
          ra.field_m != param1) {
          ui.field_s = true;
          ra.field_m = param1;
          ub.sendChatSettings(param0, false);
          if (2 == param3 &&
            param1 != hd.field_b) {
            hd.field_b = param1;
            ui.field_s = true;
            ub.sendChatSettings(param0, false);
            return;
          }
          return;
        }
        if (2 == param3 &&
          param1 != hd.field_b) {
          hd.field_b = param1;
          ui.field_s = true;
          ub.sendChatSettings(param0, false);
          return;
        }
    }

    final byte[] getData(int param0) {
        if (this.field_p) {
          throw new RuntimeException();
        }
        if (param0 <= -11) {
          return this.field_z;
        }
        this.getData(-122);
        return this.field_z;
    }

    public static void releaseStatics(byte param0) {
        field_v = null;
        field_B = null;
        field_u = null;
        field_C = null;
        int var1 = -29 / ((-31 - param0) / 42);
        field_H = null;
        field_I = null;
        field_y = null;
        field_G = null;
        field_w = null;
        field_D = null;
        field_E = null;
    }

    final int getProgressPercent(byte param0) {
        if (param0 > -71) {
          field_B = (String) null;
          if (this.field_p) {
            return 0;
          }
          return 100;
        }
        if (this.field_p) {
          return 0;
        }
        return 100;
    }

    DiskCacheRequest() {
    }

    static {
        field_B = "To Customer Support";
        field_G = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_I = "Declined";
        field_D = "Checking";
        field_y = new LoginMethod("email");
        field_F = 20;
    }
}
