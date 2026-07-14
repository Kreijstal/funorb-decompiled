/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends ji {
    static String field_E;
    static String field_B;
    static String field_y;
    static String field_A;
    static String field_D;
    static int field_z;
    static cr[] field_C;

    final static ge a(byte[] param0, boolean param1) {
        if (param0 == null) {
            return null;
        }
        ge var2 = new ge(param0, ca.field_a, pc.field_a, mh.field_c, vi.field_w, in.field_c, se.field_y);
        if (!param1) {
            return null;
        }
        la.a((byte) 123);
        return var2;
    }

    final int[] c(int param0, int param1) {
        int[] var4 = null;
        int[] var3 = null;
        if (param1 < 91) {
            field_z = 115;
            var4 = ((w) this).field_x.a(param0, (byte) -54);
            var3 = var4;
            if (!((w) this).field_x.field_i) {
                return var4;
            }
            qq.a(var4, 0, we.field_M, lf.field_y[param0]);
            return var4;
        }
        var4 = ((w) this).field_x.a(param0, (byte) -54);
        var3 = var4;
        if (((w) this).field_x.field_i) {
            qq.a(var4, 0, we.field_M, lf.field_y[param0]);
            return var4;
        }
        return var4;
    }

    final static co a(r param0, r param1, String param2, String param3, int param4) {
        if (param4 <= 101) {
            Object var7 = null;
            co discarded$0 = w.a((r) null, (r) null, (String) null, (String) null, 73);
        }
        int var5 = param1.a((byte) 118, param3);
        int var6 = param1.a(var5, param2, 113);
        return fi.a(var5, param1, param0, var6, (byte) 70);
    }

    final static int a(int param0, byte[] param1, int param2) {
        int var3 = 127 % ((param2 - -57) / 50);
        return om.a(param0, 0, param1, 255);
    }

    final static void a(r param0, r param1, r param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        ei var8 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        tj.field_c = false;
        uk.a(param2, param1, 121);
        var8 = new ei(0);
        L0: while (true) {
          if (var8.a((byte) 70)) {
            L1: {
              pn.a((byte) 71, var8);
              ap.field_b[2] = new go(param0, "character", "vertigo_death");
              ap.field_b[3] = new go(param0, "character", "fall_fan_jump");
              ap.field_b[0] = new go(param0, "character", "vertigo_idle");
              ap.field_b[4] = new go(param0, "character", "vertigo_jetpack_idle");
              ap.field_b[5] = new go(param0, "character", "vertigo_portal_in");
              ap.field_b[1] = new go(param0, "character", "vertigo_walk");
              ap.field_b[6] = new go(param0, "character", "vertigo_new_fall");
              ap.field_b[7] = new go(param0, "character", "vertigo_new_land");
              ap.field_b[8] = new go(param0, "character", "vertigo_new_mid_jump");
              ap.field_b[9] = new go(param0, "character", "vertigo_new_peak");
              ap.field_b[10] = new go(param0, "character", "vertigo_dynamite");
              ap.field_b[26] = new go(param0, "character", "new_dynamite");
              ap.field_b[11] = new go(param0, "character", "vertigo_failed_jump");
              ap.field_b[12] = new go(param0, "character", "vertigo_fan_idle");
              ap.field_b[13] = new go(param0, "character", "vertigo_portal_out");
              ap.field_b[14] = new go(param0, "character", "land_fan_jump");
              ap.field_b[15] = new go(param0, "character", "mid_fan_jump");
              ap.field_b[16] = new go(param0, "character", "peak_fan_jump");
              ap.field_b[17] = new go(param0, "character", "new_jetpack_mid_jump");
              ap.field_b[18] = new go(param0, "character", "new_jetpack_peak_jump");
              ap.field_b[20] = new go(param0, "character", "electric_death");
              ap.field_b[21] = new go(param0, "character", "anticipation");
              ap.field_b[22] = new go(param0, "character", "score_anim");
              ap.field_b[23] = new go(param0, "character", "game_over");
              ap.field_b[24] = new go(param0, "character", "placeholder_jump");
              ap.field_b[25] = new go(param0, "character", "toony_fall");
              ap.field_b[19] = new go(param0, "character", "idle_sad");
              ap.field_b[27] = new go(param0, "character", "flames");
              wi.field_d[2] = new go(param0, "character", "new_fan_spin");
              wi.field_d[0] = new go(param0, "character", "new_fan_start");
              wi.field_d[1] = new go(param0, "character", "new_fan_stop");
              wi.field_d[3] = new go(param0, "character", "portal_in_vortex");
              wi.field_d[4] = new go(param0, "character", "portal_out_vortex");
              wi.field_d[5] = new go(param0, "character", "ice_block_break");
              var5 = 0;
              if (param3 > 25) {
                break L1;
              } else {
                var7 = null;
                int discarded$1 = w.a(-39, (byte[]) null, -98);
                break L1;
              }
            }
            L2: while (true) {
              if ((var5 ^ -1) > -29) {
                na.field_o[var5] = ap.field_b[var5].a((byte) -123, true);
                var5++;
                continue L2;
              } else {
                return;
              }
            }
          } else {
            continue L0;
          }
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        if (!(!vc.a(-121, param0))) {
            return false;
        }
        if (!(!rh.a(param2 ^ 288, param0))) {
            return false;
        }
        if (nh.a(param0, (byte) -113)) {
            return false;
        }
        if (!(param1.length() != param2)) {
            return true;
        }
        if (!(!tj.a(-22697, param0, param1))) {
            return false;
        }
        if (hl.a((byte) -99, param1, param0)) {
            return false;
        }
        if (!gm.a(122, param1, param0)) {
            return true;
        }
        return false;
    }

    public w() {
        super(0, true);
    }

    final static StringBuilder a(boolean param0, char param1, int param2, StringBuilder param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param0) {
          var4 = param3.length();
          param3.setLength(param2);
          var5 = var4;
          L0: while (true) {
            if (param2 <= var5) {
              return param3;
            } else {
              param3.setCharAt(var5, param1);
              var5++;
              continue L0;
            }
          }
        } else {
          field_B = null;
          var4 = param3.length();
          param3.setLength(param2);
          var5 = var4;
          L1: while (true) {
            if (param2 <= var5) {
              return param3;
            } else {
              param3.setCharAt(var5, param1);
              var5++;
              continue L1;
            }
          }
        }
    }

    public static void g(int param0) {
        field_C = null;
        field_B = null;
        field_D = null;
        field_A = null;
        if (param0 != 2) {
            return;
        }
        field_y = null;
        field_E = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Public chat is unavailable while setting up a rated game.";
        field_B = "Lives lost:";
        field_D = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_A = "Username: ";
        field_y = "Find opponents";
    }
}
