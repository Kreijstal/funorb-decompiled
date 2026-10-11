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
        ge var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        ge stackIn_5_0 = null;
        ge stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (ge) (stackIn_2_0);
          }
          var2 = new ge(param0, ca.field_a, pc.field_a, mh.field_c, vi.field_w, in.field_c, se.field_y);
          if (!param1) {
            stackIn_5_0 = (ge) null;
            return stackIn_5_0;
          }
          la.a((byte) 123);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("w.H(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final int[] c(int param0, int param1) {
        int[] var4 = null;
        int[] var3 = null;
        int[] var4Lifetime1;
        int[] var3Lifetime1;
        if (param1 < 91) {
          field_z = 115;
          var4 = this.field_x.a(param0, (byte) -54);
          var3 = var4;
          if (!this.field_x.field_i) {
            return var4;
          }
          qq.a(var4, 0, we.field_M, lf.field_y[param0]);
          return var4;
        }
        var4Lifetime1 = this.field_x.a(param0, (byte) -54);
        var3Lifetime1 = var4Lifetime1;
        if (this.field_x.field_i) {
          qq.a(var4Lifetime1, 0, we.field_M, lf.field_y[param0]);
          return var4Lifetime1;
        }
        return var4Lifetime1;
    }

    final static co a(r param0, r param1, String param2, String param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        co stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 <= 101) {
            var7 = (String) null;
            w.a((r) null, (r) null, (String) null, (String) null, 73);
          }
          var5_int = param1.a((byte) 118, param3);
          var6 = param1.a(var5_int, param2, 113);
          stackIn_3_0 = fi.a(var5_int, param1, param0, var6, (byte) 70);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("w.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(int param0, byte[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 127 % ((param2 + 57) / 50);
          stackIn_1_0 = om.a(param0, 0, param1, 255);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("w.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(r param0, r param1, r param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        ei var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          tj.field_c = false;
          uk.a(param2, param1, 121);
          var8 = new ei(0);
          while (!var8.a((byte) 70)) {
          }
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
          if (param3 <= 25) {
            var7 = (byte[]) null;
            w.a(-39, (byte[]) null, -98);
          }
          while (var5 < 28) {
            na.field_o[var5] = ap.field_b[var5].a((byte) -123, true);
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("w.J(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (vc.a(-121, param0)) {
            return false;
          }
          if (rh.a(param2 ^ 288, param0)) {
            return false;
          }
          if (nh.a(param0, (byte) -113)) {
            return false;
          }
          if (param1.length() == param2) {
            return true;
          }
          if (tj.a(-22697, param0, param1)) {
            return false;
          }
          if (hl.a((byte) -99, param1, param0)) {
            return false;
          }
          if (!gm.a(122, param1, param0)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("w.F(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    public w() {
        super(0, true);
    }

    final static StringBuilder a(boolean param0, char param1, int param2, StringBuilder param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          if (!param0) {
            field_B = (String) null;
          }
          var4_int = param3.length();
          param3.setLength(param2);
          for (var5 = var4_int; param2 > var5; var5++) {
            param3.setCharAt(var5, param1);
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("w.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
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
        field_E = "Public chat is unavailable while setting up a rated game.";
        field_B = "Lives lost:";
        field_D = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_A = "Username: ";
        field_y = "Find opponents";
    }
}
