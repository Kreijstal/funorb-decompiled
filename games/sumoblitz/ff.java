/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ff extends en {
    private int field_q;
    private int field_p;
    static String field_n;
    private byte[] field_r;
    static hr[] field_k;
    private int[] field_l;
    static String field_m;
    static String field_o;

    public static void b(boolean param0) {
        field_m = null;
        field_o = null;
        field_k = null;
        if (!param0) {
          return;
        }
        field_n = null;
    }

    final void b(int param0) {
        this.field_q = 0;
        this.field_p = 0;
        if (param0 <= -7) {
          return;
        }
        jn var3 = (jn) null;
        ff.a(-47, -118, 3, (jn) null, 110, (byte) -26);
    }

    ff(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4);
        int var7 = 0;
        this.field_l = new int[this.field_g];
        for (var7 = 0; var7 < this.field_g; var7++) {
          this.field_l[var7] = (short)(int)(4096.0 * Math.pow((double)param5, (double)var7));
        }
    }

    final static void a(int param0, int param1, int param2, jn param3, int param4, byte param5) {
        float[] dupTemp$0 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        float[] var8 = null;
        int var9 = 0;
        jn var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float[] var8Lifetime1;
        float[] var8Lifetime2;
        float[] var8Lifetime1Lifetime1;
        int var7Lifetime1;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          stackIn_4_0 = (1 != ul.field_f) ? 0 : 1;
          var6_int = stackIn_4_0;
          var7 = 0;
          if (param5 != 94) {
            var10 = (jn) null;
            ff.a(-96, 96, -59, (jn) null, -77, (byte) 95);
          }
          while (true) {
            stackIn_9_0 = (var6_int != 0) ? 20 : 40;
            if (stackIn_9_0 > var7) {
              var8 = new float[]{0.0f, (float)(-(1 + fi.a(param1, he.field_o, (byte) -96)))};
              var14 = kt.a((byte) -27, var8, (float)(0.0 + (double)(2048.0f / (float)var7) * 0.017453292519943295));
              var13 = var14;
              var11 = var13;
              var8Lifetime2 = var11;
              param3.a((ms) (new vi(128, param0, param2, param4, (int)var14[0] << 8, (int)var14[1] << 8, 0)), (byte) 39);
              var7++;
              continue;
            }
            break;
          }
          var7Lifetime1 = 0;
          while (true) {
            stackIn_15_0 = (var6_int != 0) ? 50 : 100;
            if (stackIn_15_0 <= var7Lifetime1) {
              return;
            }
            var8Lifetime1 = new float[]{0.0f, (float)(-(fi.a(param1, he.field_o, (byte) -96) + 1))};
            dupTemp$0 = kt.a((byte) -126, var8Lifetime1, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7Lifetime1) + 0.0));
            var12 = dupTemp$0;
            var8Lifetime1Lifetime1 = dupTemp$0;
            param3.a((ms) (new vi(128, param0, param2, param4, (int)var12[0] << 8, (int)var12[1] << 8, 1)), (byte) 39);
            var7Lifetime1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("ff.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    void a(int param0, byte param1, int param2) {
        int fieldTemp$0 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_r[fieldTemp$0] = (byte)(127 + eb.a(param2, param1 >> 1));
    }

    final void a(int param0, int param1, int param2) {
        this.field_p = this.field_p + (this.field_l[param0] * param2 >> 12);
        if (param1 == 1157) {
          return;
        }
        jn var5 = (jn) null;
        ff.a(66, 11, -7, (jn) null, 98, (byte) -106);
    }

    final void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        this.field_p = Math.abs(this.field_p);
        if (param0) {
          ff.b(false);
          if (this.field_p < 4096) {
            fieldTemp$0 = this.field_q;
            this.field_q = this.field_q + 1;
            this.a(fieldTemp$0, (byte)(this.field_p >> 4), 127);
            this.field_p = 0;
            return;
          }
          this.field_p = 4095;
          fieldTemp$1 = this.field_q;
          this.field_q = this.field_q + 1;
          this.a(fieldTemp$1, (byte)(this.field_p >> 4), 127);
          this.field_p = 0;
          return;
        }
        if (this.field_p >= 4096) {
          this.field_p = 4095;
          fieldTemp$2 = this.field_q;
          this.field_q = this.field_q + 1;
          this.a(fieldTemp$2, (byte)(this.field_p >> 4), 127);
          this.field_p = 0;
          return;
        }
        int fieldTemp$3 = this.field_q;
        this.field_q = this.field_q + 1;
        this.a(fieldTemp$3, (byte)(this.field_p >> 4), 127);
        this.field_p = 0;
    }

    final static void a(byte param0, ki param1) {
        try {
          rc.field_l[0] = eb.field_b.b(0, "fence_hum_bg_loop");
          rc.field_l[2] = eb.field_b.b(0, "landmine_red_flash");
          rc.field_l[3] = eb.field_b.b(0, "landmine_blow");
          rc.field_l[4] = eb.field_b.b(0, "spike_trap_hum_bg_loop");
          rc.field_l[5] = eb.field_b.b(0, "teleport_short");
          rc.field_l[6] = eb.field_b.b(0, "accelerator_pad_1");
          rc.field_l[7] = eb.field_b.b(0, "accelerator_pad_2");
          rc.field_l[8] = eb.field_b.b(0, "accelerator_pad_3");
          rc.field_l[9] = eb.field_b.b(0, "accelerator_pad_4");
          rc.field_l[11] = eb.field_b.b(0, "attractor_pulse_loop");
          rc.field_l[12] = eb.field_b.b(0, "repeller_pulse_loop");
          fh.field_n[0] = mf.a(rc.field_l[4], 100, 96);
          fh.field_n[1] = mf.a(rc.field_l[11], 100, 96);
          fh.field_n[2] = mf.a(rc.field_l[12], 100, 96);
          rc.field_l[17] = eb.field_b.b(0, "menu_mouseover");
          rc.field_l[18] = eb.field_b.b(0, "multiplier_upgrade");
          rc.field_l[19] = eb.field_b.b(0, "npc_bomb_charge_and_explode1");
          rc.field_l[20] = eb.field_b.b(0, "npc_bomb_charge_and_explode2");
          rc.field_l[21] = eb.field_b.b(0, "npc_bomb_charge_and_explode3");
          rc.field_l[27] = eb.field_b.b(0, "player_pick_up");
          rc.field_l[28] = eb.field_b.b(0, "player_release_super_charge_attack");
          rc.field_l[29] = eb.field_b.b(0, "player_super_charge_attack");
          rc.field_l[30] = eb.field_b.b(0, "player_death_pulse");
          rc.field_l[33] = eb.field_b.b(0, "player_super_charge_deny");
          rc.field_l[32] = eb.field_b.b(0, "big_targeting_laser");
          rc.field_l[34] = eb.field_b.b(0, "firework_particles1");
          rc.field_l[35] = eb.field_b.b(0, "firework_particles2");
          rc.field_l[36] = eb.field_b.b(0, "firework_particles3");
          rc.field_l[37] = eb.field_b.b(0, "firework_particles4");
          if (param0 > -42) {
            jn var3 = (jn) null;
            ff.a(98, 120, 16, (jn) null, 107, (byte) 5);
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ff.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Sound: ";
        field_m = "Warning!";
        field_o = "Create";
    }
}
