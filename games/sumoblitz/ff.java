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
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, jn param3, int param4, byte param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        float[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float[] var15 = null;
        float[] var16 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 != ul.field_f) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_4_0;
              var7 = 0;
              if (param5 == 94) {
                break L2;
              } else {
                var10 = null;
                ff.a(-96, 96, -59, (jn) null, -77, (byte) 95);
                break L2;
              }
            }
            L3: while (true) {
              L4: {
                if (var6_int != 0) {
                  stackOut_8_0 = 20;
                  stackIn_9_0 = stackOut_8_0;
                  break L4;
                } else {
                  stackOut_7_0 = 40;
                  stackIn_9_0 = stackOut_7_0;
                  break L4;
                }
              }
              if (stackIn_9_0 <= var7) {
                var7 = 0;
                L5: while (true) {
                  L6: {
                    if (var6_int != 0) {
                      stackOut_14_0 = 50;
                      stackIn_15_0 = stackOut_14_0;
                      break L6;
                    } else {
                      stackOut_13_0 = 100;
                      stackIn_15_0 = stackOut_13_0;
                      break L6;
                    }
                  }
                  if (~stackIn_15_0 >= ~var7) {
                    break L0;
                  } else {
                    var8 = new float[]{0.0f, (float)(-(fi.a(param1, he.field_o, (byte) -96) - -1))};
                    float[] dupTemp$1 = kt.a((byte) -126, var8, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7) + 0.0));
                    var12 = dupTemp$1;
                    var8 = dupTemp$1;
                    param3.a((ms) (Object) new vi(128, param0, param2, param4, (int)var12[0] << 8, (int)var12[1] << 8, 1), (byte) 39);
                    var7++;
                    continue L5;
                  }
                }
              } else {
                var8 = new float[]{0.0f, (float)(-(1 + fi.a(param1, he.field_o, (byte) -96)))};
                var16 = kt.a((byte) -27, var8, (float)(0.0 + (double)(2048.0f / (float)var7) * 0.017453292519943295));
                var15 = var16;
                var14 = var15;
                var13 = var14;
                var11 = var13;
                var8 = var11;
                param3.a((ms) (Object) new vi(128, param0, param2, param4, (int)var16[0] << 8, (int)var16[1] << 8, 0), (byte) 39);
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var6;
            stackOut_18_1 = new StringBuilder().append("ff.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    void a(int param0, byte param1, int param2) {
        int fieldTemp$0 = ((ff) this).field_q;
        ((ff) this).field_q = ((ff) this).field_q + 1;
        ((ff) this).field_r[fieldTemp$0] = (byte)(127 + eb.a(param2, param1 >> 1));
    }

    final void a(int param0, int param1, int param2) {
        ((ff) this).field_p = ((ff) this).field_p + (((ff) this).field_l[param0] * param2 >> 12);
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
            if (((ff) this).field_p < 4096) {
                int fieldTemp$0 = ((ff) this).field_q;
                ((ff) this).field_q = ((ff) this).field_q + 1;
                ((ff) this).a(fieldTemp$0, (byte)(((ff) this).field_p >> 4), 127);
                ((ff) this).field_p = 0;
                return;
            }
            ((ff) this).field_p = 4095;
            int fieldTemp$1 = ((ff) this).field_q;
            ((ff) this).field_q = ((ff) this).field_q + 1;
            ((ff) this).a(fieldTemp$1, (byte)(((ff) this).field_p >> 4), 127);
            ((ff) this).field_p = 0;
            return;
        }
        if (((ff) this).field_p >= 4096) {
            ((ff) this).field_p = 4095;
            int fieldTemp$2 = ((ff) this).field_q;
            ((ff) this).field_q = ((ff) this).field_q + 1;
            ((ff) this).a(fieldTemp$2, (byte)(((ff) this).field_p >> 4), 127);
            ((ff) this).field_p = 0;
            return;
        }
        int fieldTemp$3 = ((ff) this).field_q;
        ((ff) this).field_q = ((ff) this).field_q + 1;
        ((ff) this).a(fieldTemp$3, (byte)(((ff) this).field_p >> 4), 127);
        ((ff) this).field_p = 0;
    }

    final static void a(byte param0, ki param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
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
              if (param0 <= -42) {
                break L1;
              } else {
                var3 = null;
                ff.a(98, 120, 16, (jn) null, 107, (byte) 5);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("ff.R(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
