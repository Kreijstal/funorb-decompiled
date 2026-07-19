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
        jn var3 = null;
        this.field_q = 0;
        this.field_p = 0;
        if (param0 <= -7) {
          return;
        } else {
          var3 = (jn) null;
          ff.a(-47, -118, 3, (jn) null, 110, (byte) -26);
          return;
        }
    }

    ff(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4);
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        this.field_l = new int[this.field_g];
        var7 = 0;
        L0: while (true) {
          if (var7 < this.field_g) {
            this.field_l[var7] = (short)(int)(4096.0 * Math.pow((double)param5, (double)var7));
            var7++;
            if (var8 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, jn param3, int param4, byte param5) {
        float[] dupTemp$1 = null;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        float[] var8 = null;
        int var9 = 0;
        jn var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
                var10 = (jn) null;
                ff.a(-96, 96, -59, (jn) null, -77, (byte) 95);
                break L2;
              }
            }
            L3: while (true) {
              L4: {
                if (var6_int != 0) {
                  stackOut_9_0 = 20;
                  stackIn_10_0 = stackOut_9_0;
                  break L4;
                } else {
                  stackOut_7_0 = 40;
                  stackIn_10_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (var9 != 0) {
                    break L4;
                  } else {
                    stackOut_8_0 = stackIn_8_0;
                    stackIn_10_0 = stackOut_8_0;
                    break L4;
                  }
                }
              }
              L5: {
                if (stackIn_10_0 <= var7) {
                  break L5;
                } else {
                  var8 = new float[]{0.0f, (float)(-(1 + fi.a(param1, he.field_o, (byte) -96)))};
                  var14 = kt.a((byte) -27, var8, (float)(0.0 + (double)(2048.0f / (float)var7) * 0.017453292519943295));
                  var13 = var14;
                  var11 = var13;
                  var8 = var11;
                  param3.a((ms) (new vi(128, param0, param2, param4, (int)var14[0] << -715891416, (int)var14[1] << -899822520, 0)), (byte) 39);
                  var7++;
                  if (var9 == 0) {
                    continue L3;
                  } else {
                    break L5;
                  }
                }
              }
              var7 = 0;
              L6: while (true) {
                L7: {
                  L8: {
                    if (var6_int != 0) {
                      stackOut_16_0 = 50;
                      stackIn_17_0 = stackOut_16_0;
                      break L8;
                    } else {
                      stackOut_14_0 = 100;
                      stackIn_18_0 = stackOut_14_0;
                      stackIn_15_0 = stackOut_14_0;
                      if (var9 != 0) {
                        break L7;
                      } else {
                        stackOut_15_0 = stackIn_15_0;
                        stackIn_17_0 = stackOut_15_0;
                        break L8;
                      }
                    }
                  }
                  stackOut_17_0 = stackIn_17_0 ^ -1;
                  stackIn_18_0 = stackOut_17_0;
                  break L7;
                }
                L9: {
                  if (stackIn_18_0 >= (var7 ^ -1)) {
                    break L9;
                  } else {
                    var8 = new float[]{0.0f, (float)(-(fi.a(param1, he.field_o, (byte) -96) - -1))};
                    dupTemp$1 = kt.a((byte) -126, var8, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7) + 0.0));
                    var12 = dupTemp$1;
                    var8 = dupTemp$1;
                    param3.a((ms) (new vi(128, param0, param2, param4, (int)var12[0] << -391494392, (int)var12[1] << -339798040, 1)), (byte) 39);
                    var7++;
                    if (var9 == 0) {
                      continue L6;
                    } else {
                      break L9;
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var6);
            stackOut_21_1 = new StringBuilder().append("ff.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void a(int param0, byte param1, int param2) {
        int fieldTemp$0 = this.field_q;
        this.field_q = this.field_q + 1;
        this.field_r[fieldTemp$0] = (byte)(127 + eb.a(param2, param1 >> 988161633));
    }

    final void a(int param0, int param1, int param2) {
        jn var5 = null;
        this.field_p = this.field_p + (this.field_l[param0] * param2 >> -1037059508);
        if (param1 == 1157) {
          return;
        } else {
          var5 = (jn) null;
          ff.a(66, 11, -7, (jn) null, 98, (byte) -106);
          return;
        }
    }

    final void a(boolean param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        this.field_p = Math.abs(this.field_p);
        if (!param0) {
          if (-4097 >= (this.field_p ^ -1)) {
            this.field_p = 4095;
            fieldTemp$4 = this.field_q;
            this.field_q = this.field_q + 1;
            this.a(fieldTemp$4, (byte)(this.field_p >> -2067382460), 127);
            this.field_p = 0;
            return;
          } else {
            fieldTemp$5 = this.field_q;
            this.field_q = this.field_q + 1;
            this.a(fieldTemp$5, (byte)(this.field_p >> -2067382460), 127);
            this.field_p = 0;
            return;
          }
        } else {
          ff.b(false);
          if (-4097 < (this.field_p ^ -1)) {
            fieldTemp$6 = this.field_q;
            this.field_q = this.field_q + 1;
            this.a(fieldTemp$6, (byte)(this.field_p >> -2067382460), 127);
            this.field_p = 0;
            return;
          } else {
            this.field_p = 4095;
            fieldTemp$7 = this.field_q;
            this.field_q = this.field_q + 1;
            this.a(fieldTemp$7, (byte)(this.field_p >> -2067382460), 127);
            this.field_p = 0;
            return;
          }
        }
    }

    final static void a(byte param0, ki param1) {
        RuntimeException var2 = null;
        jn var3 = null;
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
                var3 = (jn) null;
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
            stackOut_3_0 = (RuntimeException) (var2);
            stackOut_3_1 = new StringBuilder().append("ff.R(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        field_n = "Sound: ";
        field_m = "Warning!";
        field_o = "Create";
    }
}
