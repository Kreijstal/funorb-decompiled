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
        ((ff) this).field_q = 0;
        ((ff) this).field_p = 0;
        if (param0 <= -7) {
            return;
        }
        Object var3 = null;
        ff.a(-47, -118, 3, (jn) null, 110, (byte) -26);
    }

    ff(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4);
        int var7 = 0;
        ((ff) this).field_l = new int[((ff) this).field_g];
        var7 = 0;
        L0: while (true) {
          if (var7 < ((ff) this).field_g) {
            ((ff) this).field_l[var7] = (short)(int)(4096.0 * Math.pow((double)param5, (double)var7));
            var7++;
            continue L0;
          } else {
          }
        }
    }

    final static void a(int param0, int param1, int param2, jn param3, int param4, byte param5) {
        int var6 = 0;
        int var7 = 0;
        float[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        float[] var11 = null;
        float[] var13 = null;
        float[] var14 = null;
        float[] var15 = null;
        float[] var16 = null;
        float[] var17 = null;
        float[] var22 = null;
        float[] var31 = null;
        float[] var32 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var9 = Sumoblitz.field_L ? 1 : 0;
          if (1 != ul.field_f) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var6 = stackIn_3_0;
        var7 = 0;
        if (param5 != 94) {
          var10 = null;
          ff.a(-96, 96, -59, (jn) null, -77, (byte) 95);
          L1: while (true) {
            L2: {
              if (var6 != 0) {
                stackOut_19_0 = 20;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              } else {
                stackOut_18_0 = 40;
                stackIn_20_0 = stackOut_18_0;
                break L2;
              }
            }
            if (stackIn_20_0 <= var7) {
              var7 = 0;
              L3: while (true) {
                L4: {
                  if (var6 != 0) {
                    stackOut_25_0 = 50;
                    stackIn_26_0 = stackOut_25_0;
                    break L4;
                  } else {
                    stackOut_24_0 = 100;
                    stackIn_26_0 = stackOut_24_0;
                    break L4;
                  }
                }
                if ((stackIn_26_0 ^ -1) < (var7 ^ -1)) {
                  var8 = new float[]{0.0f, (float)(-(fi.a(param1, he.field_o, (byte) -96) - -1))};
                  var22 = kt.a((byte) -126, var8, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7) + 0.0));
                  var8 = kt.a((byte) -126, var8, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7) + 0.0));
                  param3.a((ms) (Object) new vi(128, param0, param2, param4, (int)var22[0] << -391494392, (int)var22[1] << -339798040, 1), (byte) 39);
                  var7++;
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              var8 = new float[]{0.0f, (float)(-(1 + fi.a(param1, he.field_o, (byte) -96)))};
              var32 = kt.a((byte) -27, var8, (float)(0.0 + (double)(2048.0f / (float)var7) * 0.017453292519943295));
              var17 = var32;
              var14 = var17;
              var13 = var14;
              var11 = var13;
              var8 = var11;
              param3.a((ms) (Object) new vi(128, param0, param2, param4, (int)var32[0] << -715891416, (int)var32[1] << -899822520, 0), (byte) 39);
              var7++;
              continue L1;
            }
          }
        } else {
          L5: while (true) {
            L6: {
              if (var6 != 0) {
                stackOut_6_0 = 20;
                stackIn_7_0 = stackOut_6_0;
                break L6;
              } else {
                stackOut_5_0 = 40;
                stackIn_7_0 = stackOut_5_0;
                break L6;
              }
            }
            if (stackIn_7_0 <= var7) {
              var7 = 0;
              L7: while (true) {
                L8: {
                  if (var6 != 0) {
                    stackOut_12_0 = 50;
                    stackIn_13_0 = stackOut_12_0;
                    break L8;
                  } else {
                    stackOut_11_0 = 100;
                    stackIn_13_0 = stackOut_11_0;
                    break L8;
                  }
                }
                if ((stackIn_13_0 ^ -1) >= (var7 ^ -1)) {
                  return;
                } else {
                  var8 = new float[]{0.0f, (float)(-(fi.a(param1, he.field_o, (byte) -96) - -1))};
                  var16 = kt.a((byte) -126, var8, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7) + 0.0));
                  var8 = kt.a((byte) -126, var8, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7) + 0.0));
                  param3.a((ms) (Object) new vi(128, param0, param2, param4, (int)var16[0] << -391494392, (int)var16[1] << -339798040, 1), (byte) 39);
                  var7++;
                  continue L7;
                }
              }
            } else {
              var8 = new float[]{0.0f, (float)(-(1 + fi.a(param1, he.field_o, (byte) -96)))};
              var31 = kt.a((byte) -27, var8, (float)(0.0 + (double)(2048.0f / (float)var7) * 0.017453292519943295));
              var15 = var31;
              var14 = var15;
              var13 = var14;
              var11 = var13;
              var8 = var11;
              param3.a((ms) (Object) new vi(128, param0, param2, param4, (int)var31[0] << -715891416, (int)var31[1] << -899822520, 0), (byte) 39);
              var7++;
              continue L5;
            }
          }
        }
    }

    void a(int param0, byte param1, int param2) {
        ((ff) this).field_q = ((ff) this).field_q + 1;
        ((ff) this).field_r[((ff) this).field_q] = (byte)(127 + eb.a(param2, param1 >> 988161633));
    }

    final void a(int param0, int param1, int param2) {
        ((ff) this).field_p = ((ff) this).field_p + (((ff) this).field_l[param0] * param2 >> -1037059508);
        if (param1 == 1157) {
            return;
        }
        Object var5 = null;
        ff.a(66, 11, -7, (jn) null, 98, (byte) -106);
    }

    final void a(boolean param0) {
        ((ff) this).field_p = Math.abs(((ff) this).field_p);
        if (param0) {
            ff.b(false);
            if (-4097 < (((ff) this).field_p ^ -1)) {
                ((ff) this).field_q = ((ff) this).field_q + 1;
                ((ff) this).a(((ff) this).field_q, (byte)(((ff) this).field_p >> -2067382460), 127);
                ((ff) this).field_p = 0;
                return;
            }
            ((ff) this).field_p = 4095;
            ((ff) this).field_q = ((ff) this).field_q + 1;
            ((ff) this).a(((ff) this).field_q, (byte)(((ff) this).field_p >> -2067382460), 127);
            ((ff) this).field_p = 0;
            return;
        }
        if (-4097 >= (((ff) this).field_p ^ -1)) {
            ((ff) this).field_p = 4095;
            ((ff) this).field_q = ((ff) this).field_q + 1;
            ((ff) this).a(((ff) this).field_q, (byte)(((ff) this).field_p >> -2067382460), 127);
            ((ff) this).field_p = 0;
            return;
        }
        ((ff) this).field_q = ((ff) this).field_q + 1;
        ((ff) this).a(((ff) this).field_q, (byte)(((ff) this).field_p >> -2067382460), 127);
        ((ff) this).field_p = 0;
    }

    final static void a(byte param0, ki param1) {
        Object var3 = null;
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
          var3 = null;
          ff.a(98, 120, 16, (jn) null, 107, (byte) 5);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Sound: ";
        field_m = "Warning!";
        field_o = "Create";
    }
}
