/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends jc {
    private int field_K;
    static int field_J;
    static String field_N;
    private int field_M;
    private boolean field_P;
    private we field_O;
    private String field_L;
    private int field_Q;

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = this.field_u + param1;
        int var6 = param2 + this.field_t;
        super.a(param0, param1, param2, param3);
        if (0 != param3) {
          return;
        }
        int var7 = !this.field_P ? 0 : -(this.field_K * 2) + (-this.field_Q + this.field_v);
        this.field_O.a(this.field_L, this.field_K + (var7 + var5), this.field_K + var6, this.field_Q - this.field_K, -(this.field_K * 2) + this.field_q, this.field_M, -1, !this.field_P ? 2 : 0, 1, this.field_O.field_I);
    }

    public static void n(int param0) {
        field_N = null;
        if (param0 != 43) {
          field_N = (String) null;
        }
    }

    final String h(int param0) {
        int var2 = this.field_I.field_x ? 1 : 0;
        this.field_I.field_x = this.field_x;
        String var3 = this.field_I.h(param0);
        this.field_I.field_x = var2 != 0 ? true : false;
        return var3;
    }

    final static int c(byte param0) {
        int var5 = 0;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          var1_int = 0;
          var2 = 0;
          while (true) {
            if (var2 >= 35) {
              var2 = -55 % ((25 - param0) / 53);
              stackIn_24_0 = var1_int;
              return stackIn_24_0;
            }
            var3 = 0;
            var4 = 0;
            L2: while (true) {
              if (var4 < 2) {
                if (th.field_b[var2][var4]) {
                  if (d.a(var2, var4, (byte) 68)) {
                    var3 = 1;
                    break L2;
                  }
                  if (vd.field_s[var2]) {
                    for (var5 = 0; var5 < 2; var5++) {
                      if (~var5 != ~var4 &&
                        d.a(var2, var5, (byte) 68)) {
                        var3 = 1;
                        break;
                      }
                    }
                  }
                }
                var4++;
                continue;
              }
              break;
            }
            if (var3 != 0) {
              var1_int++;
            }
            var2++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "am.C(" + param0 + ')');
        }
    }

    am(int param0, int param1, int param2, int param3, fe param4, boolean param5, int param6, int param7, we param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ad) null, (rm) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.field_I = param4;
          this.field_L = param10;
          this.field_M = param9;
          this.field_K = param7;
          stackIn_4_1 = (param5);
          this.field_P = stackIn_4_1;
          this.field_Q = param6;
          this.field_O = param8;
          var12_int = -this.field_K + this.field_Q;
          var13 = this.field_O.b(param10, var12_int, this.field_O.field_I) + 2 * this.field_K;
          if (param3 >= var13) {
            var13 = param3;
          } else {
            this.a(var13, -128, param0, param2, param1);
          }
          if (!this.field_P) {
            stackIn_10_0 = this.field_Q + 2 * this.field_K;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_I.a(-(this.field_K * 2) + param3, -113, var14, -(this.field_K * 3) + (-this.field_Q + param2), this.field_K + (var13 - param3 >> 1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("am.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void a(bj param0, int param1) {
        wm var4 = null;
        wm var5 = null;
        try {
          var4 = new wm(22050, fj.field_r);
          var5 = var4;
          re.field_a = new ji[62];
          re.field_a[0] = jd.a(param0, "", "md_slugger").a().a(var5);
          re.field_a[1] = jd.a(param0, "", "md_menu").a().a(var5);
          re.field_a[2] = jd.a(param0, "", "md_cha-ching").a().a(var5);
          re.field_a[3] = jd.a(param0, "", "md_sploch").a().a(var5);
          re.field_a[4] = jd.a(param0, "", "md_scream").a().a(var5);
          re.field_a[5] = jd.a(param0, "", "md_lava_noise_500ms").a().a(var5);
          re.field_a[6] = jd.a(param0, "", "md_drowning").a().a(var5);
          re.field_a[7] = jd.a(param0, "", "md_choking").a().a(var5);
          re.field_a[8] = jd.a(param0, "", "md_boom").a().a(var5);
          re.field_a[9] = jd.a(param0, "", "md_clunk").a().a(var5);
          re.field_a[10] = jd.a(param0, "", "md_jump").a().a(var5);
          re.field_a[11] = jd.a(param0, "", "md_ching").a().a(var5);
          re.field_a[12] = jd.a(param0, "", "md_pickup_iron").a().a(var5);
          re.field_a[13] = jd.a(param0, "", "md_pickup_silver").a().a(var5);
          re.field_a[14] = jd.a(param0, "", "md_pickup_gold").a().a(var5);
          re.field_a[15] = jd.a(param0, "", "md_pickup_xenon").a().a(var5);
          re.field_a[16] = jd.a(param0, "", "md_pickup_diamond").a().a(var5);
          re.field_a[17] = jd.a(param0, "", "md_beep").a().a(var5);
          re.field_a[18] = jd.a(param0, "", "md_hiss").a().a(var5);
          re.field_a[19] = jd.a(param0, "", "md_splurdoosh").a().a(var5);
          re.field_a[20] = jd.a(param0, "", "md_whoopf").a().a(var5);
          re.field_a[21] = jd.a(param0, "", "md_crumble").a().a(var5);
          re.field_a[22] = jd.a(param0, "", "md_thudathuda").a().a(var5);
          re.field_a[23] = jd.a(param0, "", "md_chink").a().a(var5);
          re.field_a[24] = jd.a(param0, "", "md_dull_chink").a().a(var5);
          re.field_a[25] = jd.a(param0, "", "md_splash").a().a(var5);
          re.field_a[26] = jd.a(param0, "", "md_splash_2").a().a(var5);
          re.field_a[param1] = jd.a(param0, "", "md_splash_3").a().a(var5);
          re.field_a[28] = jd.a(param0, "", "md_splash_4").a().a(var5);
          re.field_a[29] = jd.a(param0, "", "md_splash_5").a().a(var5);
          re.field_a[30] = jd.a(param0, "", "md_splosh").a().a(var5);
          re.field_a[31] = jd.a(param0, "", "md_step_150ms").a().a(var5);
          re.field_a[32] = jd.a(param0, "", "md_twump").a().a(var5);
          re.field_a[33] = jd.a(param0, "", "md_ice_boom").a().a(var5);
          re.field_a[34] = jd.a(param0, "", "md_ice_dull_chink").a().a(var5);
          re.field_a[35] = jd.a(param0, "", "md_ice_jetpack_200ms_loop").a().a(var5);
          re.field_a[36] = jd.a(param0, "", "md_ice_jetpack_broken_200ms_loop").a().a(var5);
          re.field_a[37] = jd.a(param0, "", "md_ice_penguin_squawk").a().a(var5);
          re.field_a[38] = jd.a(param0, "", "md_ice_penguin_squawk_2").a().a(var5);
          re.field_a[39] = jd.a(param0, "", "md_ice_penguin_squawk_3").a().a(var5);
          re.field_a[40] = jd.a(param0, "", "md_ice_penguin_squawk_4").a().a(var5);
          re.field_a[41] = jd.a(param0, "", "md_ice_player_land_on_snow").a().a(var5);
          re.field_a[42] = jd.a(param0, "", "md_ice_sliding_200ms_loop").a().a(var5);
          re.field_a[43] = jd.a(param0, "", "md_ice_teeth_chatter_400ms_loop").a().a(var5);
          re.field_a[44] = jd.a(param0, "", "md_ice_walrus_growl").a().a(var5);
          re.field_a[45] = jd.a(param0, "", "md_ice_walrus_grunt").a().a(var5);
          re.field_a[46] = jd.a(param0, "", "md_ice_oil_burning").a().a(var5);
          re.field_a[47] = jd.a(param0, "", "md_lava_rising_bgsound").a().a(var5);
          re.field_a[48] = jd.a(param0, "", "md_ice_mining_ice").a().a(var5);
          re.field_a[49] = jd.a(param0, "", "md_ice_mining_ice_2").a().a(var5);
          re.field_a[50] = jd.a(param0, "", "md_ice_mining_ice_3").a().a(var5);
          re.field_a[51] = jd.a(param0, "", "md_ice_mining_snow").a().a(var5);
          re.field_a[52] = jd.a(param0, "", "md_ice_mining_snow_2").a().a(var5);
          re.field_a[53] = jd.a(param0, "", "md_ice_mining_snow_3").a().a(var5);
          re.field_a[54] = jd.a(param0, "", "md_ice_mining_rock").a().a(var5);
          re.field_a[55] = jd.a(param0, "", "md_ice_mining_rock_2").a().a(var5);
          re.field_a[56] = jd.a(param0, "", "md_ice_mining_rock_3").a().a(var5);
          re.field_a[57] = jd.a(param0, "", "md_ice_player_glooping_in_oil").a().a(var5);
          re.field_a[58] = jd.a(param0, "", "md_ice_player_glooping_in_oil_2").a().a(var5);
          re.field_a[59] = jd.a(param0, "", "md_ice_player_glooping_in_oil_3").a().a(var5);
          re.field_a[60] = jd.a(param0, "", "md_ice_player_glooping_in_oil_4").a().a(var5);
          re.field_a[61] = jd.a(param0, "", "md_ice_pickup_freezium").a().a(var5);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "am.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_N = "Friends can be added in multiplayer<nbsp>games";
    }
}
