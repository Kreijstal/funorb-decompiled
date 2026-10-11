/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static String[] field_g;
    static bd[] field_a;
    static int field_d;
    static nd field_c;
    static int field_e;
    private dk field_f;
    private dk field_i;
    static bd field_h;
    static int[] field_j;
    static int field_b;

    final dk a(byte param0) {
        dk var2 = this.field_f.field_j;
        if (this.field_f == var2) {
          return null;
        }
        var2.c(-1);
        if (param0 == 27) {
          return var2;
        }
        this.b((byte) 117);
        return var2;
    }

    final dk b(byte param0) {
        dk var2 = null;
        dk var2Lifetime1;
        if (param0 >= -6) {
          field_d = -28;
          var2 = this.field_i;
          if (var2 == this.field_f) {
            this.field_i = null;
            return null;
          }
          this.field_i = var2.field_j;
          return var2;
        }
        var2Lifetime1 = this.field_i;
        if (var2Lifetime1 == this.field_f) {
          this.field_i = null;
          return null;
        }
        this.field_i = var2Lifetime1.field_j;
        return var2Lifetime1;
    }

    final static void a(byte param0, int[] param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var15 = 0;
        int var20 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        var26 = HostileSpawn.field_I ? 1 : 0;
        try {
          param9 = param9 & -4;
          param6 = param6 & -4;
          param3 = param3 & -4;
          param7 = param7 & -4;
          param5 = param5 & -4;
          param4 = param4 & -4;
          rl.a(-19104, param3, param7, param6, param5, param4, param9);
          var11_int = -m.field_q + ni.field_f;
          var12 = -qg.field_n + qh.field_e;
          var13 = var11_int * var11_int + var12 * var12 >> 2;
          if (param10 != 9233) {
            bh.a(83);
          }
          if (var13 == 0) {
            return;
          }
          var14 = (int)(Math.sqrt((double)((float)var13 / 4.0f)) * 4.0);
          for (var15 = v.field_g; var15 < bn.field_p; var15 += 4) {
            var16 = var15 - qg.field_n;
            var17 = var15 - qh.field_e;
            var18 = var16 * var12;
            var19 = var16 * var11_int;
            for (var20 = pk.field_m; cn.field_r > var20; var20 += 4) {
              var21 = -m.field_q + var20;
              var22 = var20 - ni.field_f;
              var23 = var21 * var11_int + var18 >> 2;
              if ((param0 != 0 ||
                !(gj.field_h * var21 + var16 * en.field_s < 0)) && (param2 != 0 ||
                !(0 <= var17 * bj.field_d + ic.field_n * var22))) {
                if (param0 != 2 &&
                  var23 < 0) {
                  var24 = (int)Math.sqrt((double)(var16 * var16 + var21 * var21));
                  if (param3 >= var24) {
                    si.a(var20 >> 2, var15 >> 2, param1[param8 - var24 * param8 / param3]);
                  }
                } else if (param2 != 2 &&
                  var23 > var13) {
                  var24 = (int)Math.sqrt((double)(var17 * var17 + var22 * var22));
                  if (var24 <= param7) {
                    si.a(var20 >> 2, var15 >> 2, param1[param8 - var24 * param8 / param7]);
                  }
                } else {
                  var24 = -var19 + var21 * var12 >> 2;
                  var25 = (var23 * param7 + param3 * (-var23 + var13)) / var13;
                  if (0 > var24) {
                    var24 = -var24;
                  }
                  if (var24 < var14 * var25 >> 2) {
                    si.a(var20 >> 2, var15 >> 2, param1[-(param8 * (var24 << 2) / var25 / var14) + param8]);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_36_0 = var11;
          stackIn_36_1 = new StringBuilder().append("bh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_j = null;
        field_c = null;
        field_h = null;
        if (param0 != -4) {
          return;
        }
        field_g = null;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          var5_int = param3 + param4;
          var6 = param1 + param0;
          if (param2 != 65) {
            field_c = (nd) null;
          }
          if (si.field_b < param3) {
            stackIn_6_0 = param3;
          } else {
            stackIn_6_0 = si.field_b;
          }
          var7 = stackIn_6_0;
          if (param1 <= si.field_j) {
            stackIn_9_0 = si.field_j;
          } else {
            stackIn_9_0 = param1;
          }
          var8 = stackIn_9_0;
          if (var5_int < si.field_l) {
            stackIn_12_0 = var5_int;
          } else {
            stackIn_12_0 = si.field_l;
          }
          var9 = stackIn_12_0;
          if (si.field_a <= var6) {
            stackIn_15_0 = si.field_a;
          } else {
            stackIn_15_0 = var6;
          }
          var10 = stackIn_15_0;
          if (si.field_b <= param3 &&
            param3 < si.field_l) {
            var11 = param3 + var8 * si.field_e;
            var12 = var10 + (1 - var8) >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              si.field_i[var11] = 16777215;
              var11 = var11 + 2 * si.field_e;
            }
          }
          if (si.field_j <= param1 &&
            si.field_a > var6) {
            var11Lifetime1 = param1 * si.field_e + var7;
            var12Lifetime1 = -var7 + (1 + var9) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              si.field_i[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (si.field_b <= var5_int &&
            var5_int < si.field_l) {
            var11Lifetime2 = var5_int + (var8 + (1 & -param3 + var5_int)) * si.field_e;
            var12Lifetime2 = -var8 + (1 + var10) >> 1;
            while (true) {
              var12Lifetime2--;
              if (0 > var12Lifetime2) {
                break;
              }
              si.field_i[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * si.field_e;
            }
          }
          if (si.field_j <= param1 &&
            var6 < si.field_a) {
            var11Lifetime3 = (1 & var6 - param1) + si.field_e * var6 + var7;
            var12Lifetime3 = -var7 + (var9 + 1) >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              si.field_i[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var5), "bh.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int c(byte param0) {
        dk var3 = null;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        int var2 = 0;
        dk var3Lifetime1;
        if (param0 > 4) {
          var3 = this.field_f.field_j;
          while (this.field_f != var3) {
            var2++;
            var3 = var3.field_j;
          }
          return var2;
        }
        field_c = (nd) null;
        var3Lifetime1 = this.field_f.field_j;
        while (this.field_f != var3Lifetime1) {
          var2++;
          var3Lifetime1 = var3Lifetime1.field_j;
        }
        return var2;
    }

    final dk d(byte param0) {
        dk var2 = this.field_f.field_j;
        if (var2 == this.field_f) {
          this.field_i = null;
          return null;
        }
        this.field_i = var2.field_j;
        if (param0 == -35) {
          return var2;
        }
        return (dk) null;
    }

    public bh() {
        this.field_f = new dk();
        this.field_f.field_i = this.field_f;
        this.field_f.field_j = this.field_f;
    }

    final void a(dk param0, int param1) {
        try {
          int var3_int = -17 / ((param1 + 79) / 43);
          if (null != param0.field_i) {
            param0.c(-1);
          }
          param0.field_i = this.field_f.field_i;
          param0.field_j = this.field_f;
          param0.field_i.field_j = param0;
          param0.field_j.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "bh.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_g = new String[]{"Complete the starship levels (Kerrus levels 1<nbsp>to<nbsp>3)", "Locate the spawn hive on Kerrus level 7 (Infiltration)", "Unlock Kerrus hard mode by completing the campaign", "Reach the rank of 'Lone<nbsp>Wolf'", "Reach the rank of 'Scourge<nbsp>Elite'", "Kill 30 aliens with the C.R.A.G.", "Kill 30 aliens with the flamethrower", "Kill 30 aliens with the rocket launcher or other explosives", "Kill 30 aliens with the railgun", "Kill 50 aliens with the plasma gun", "Kill 5 aliens with one shot from the railgun", "Complete Kerrus level 5 (Destruction) from an auto gun start", "Complete Kerrus level 6 (Security) from an auto gun start", "Complete Kerrus level 7 (Infiltration) from an auto gun start", "Complete Kerrus level 8 (The Hive) from an auto gun start", "Complete Kerrus level 9 (Regicide) from an auto gun start", "Complete Kerrus level 10 (Escape) from an auto gun start", "Destroy all enemies on Kerrus level 4 (Entrance)", "Rise from the ashes of a reactor meltdown", "Reach the bridge of the space station", "Defeat the Vengeance Queen", "Escape the medical facility", "Complete Vengeance level 2 (Lockdown) without the security pass", "Complete Vengeance level 3 (Breach) without breaking an egg", "Kill the Guard on Vengeance level 4 (Infest Station)", "Finish Vengeance level 5 (Bridge) holding every weapon", "Kill all three Guards and complete Vengeance level 6 (Nightmare)", "Complete Vengeance level 7 (Invasion) never holding more than one explosive charge", "Complete Vengeance level 8 (Torment) having destroyed every egg", "Complete Vengeance level 9 (Planet-side) without using energy weapons", "Escape the planet on Vengeance level 10 (Hostile Revenant)", "Complete Vengeance, unlocking hard mode", "Kill a Guard with the pistol", "Complete Vengeance level 2 (Lockdown) from a pistol start", "Complete Vengeance level 3 (Breach) from a pistol start", "Complete Vengeance level 4 (Infest Station) from a pistol start", "Complete Vengeance level 5 (Bridge) from a pistol start", "Complete Vengeance level 6 (Nightmare) from a pistol start", "Complete Vengeance level 7 (Invasion) from a pistol start", "Complete Vengeance level 8 (Torment) from a pistol start", "Complete Vengeance level 9 (Planet-side) from a pistol start", "Complete Vengeance in hard mode"};
        field_d = 0;
        field_c = new nd(0, 2, 2, 1);
        field_j = new int[]{5, 8, 9, 10};
    }
}
