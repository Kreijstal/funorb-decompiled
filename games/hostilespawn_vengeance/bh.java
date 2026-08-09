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
        dk var2;
        var2 = this.field_f.field_j;
        if (this.field_f != var2) {
          var2.c(-1);
          if (param0 != 27) {
            this.b((byte) 117);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final dk b(byte param0) {
        dk var2 = null;
        if (param0 >= -6) {
            field_d = -28;
            var2 = this.field_i;
            if (!(var2 != this.field_f)) {
                this.field_i = null;
                return null;
            }
            this.field_i = var2.field_j;
            return var2;
        }
        var2 = this.field_i;
        if (!(var2 != this.field_f)) {
            this.field_i = null;
            return null;
        }
        this.field_i = var2.field_j;
        return var2;
    }

    final static void a(byte param0, int[] param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        var26 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              param9 = param9 & -4;
              param6 = param6 & -4;
              param3 = param3 & -4;
              param7 = param7 & -4;
              param5 = param5 & -4;
              param4 = param4 & -4;
              rl.a(-19104, param3, param7, param6, param5, param4, param9);
              var11_int = -m.field_q + ni.field_f;
              var12 = -qg.field_n + qh.field_e;
              var13 = var11_int * var11_int + var12 * var12 >> 57565314;
              if (param10 == 9233) {
                break L1;
              } else {
                bh.a(83);
                break L1;
              }
            }
            if (-1 == (var13 ^ -1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var14 = (int)(Math.sqrt((double)((float)var13 / 4.0f)) * 4.0);
              var15 = v.field_g;
              L2: while (true) {
                if (var15 >= bn.field_p) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var16 = var15 + -qg.field_n;
                  var17 = var15 + -qh.field_e;
                  var18 = var16 * var12;
                  var19 = var16 * var11_int;
                  var20 = pk.field_m;
                  L3: while (true) {
                    if (cn.field_r <= var20) {
                      var15 += 4;
                      continue L2;
                    } else {
                      L4: {
                        L5: {
                          var21 = -m.field_q + var20;
                          var22 = var20 + -ni.field_f;
                          var23 = var21 * var11_int - -var18 >> -899250686;
                          if ((param0 ^ -1) != -1) {
                            break L5;
                          } else {
                            if (-1 < (gj.field_h * var21 + var16 * en.field_s ^ -1)) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (-1 != (param2 ^ -1)) {
                            break L6;
                          } else {
                            if (0 <= var17 * bj.field_d + ic.field_n * var22) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (param0 == 2) {
                            break L7;
                          } else {
                            if (var23 >= 0) {
                              break L7;
                            } else {
                              var24 = (int)Math.sqrt((double)(var16 * var16 + var21 * var21));
                              if (param3 >= var24) {
                                si.a(var20 >> -459366750, var15 >> 765121794, param1[param8 + -(var24 * param8 / param3)]);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        L8: {
                          if (param2 == 2) {
                            break L8;
                          } else {
                            if (var23 > var13) {
                              var24 = (int)Math.sqrt((double)(var17 * var17 + var22 * var22));
                              if (var24 > param7) {
                                break L4;
                              } else {
                                si.a(var20 >> -496588574, var15 >> -1787376862, param1[param8 + -(var24 * param8 / param7)]);
                                break L4;
                              }
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          var24 = -var19 + var21 * var12 >> -2098207774;
                          var25 = (var23 * param7 + param3 * (-var23 + var13)) / var13;
                          if (0 <= var24) {
                            break L9;
                          } else {
                            var24 = -var24;
                            break L9;
                          }
                        }
                        if (var24 >= var14 * var25 >> 1600393282) {
                          break L4;
                        } else {
                          si.a(var20 >> 1792158274, var15 >> -1483440414, param1[-(param8 * (var24 << 778910722) / var25 / var14) + param8]);
                          break L4;
                        }
                      }
                      var20 += 4;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var11 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var11);

            stackIn_36_1 = new StringBuilder().append("bh.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L10;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L10;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3 + param4;
              var6 = param1 + param0;
              if (param2 == 65) {
                break L1;
              } else {
                field_c = (nd) null;
                break L1;
              }
            }
            L2: {
              if (si.field_b < param3) {
                stackIn_6_0 = param3;
                break L2;
              } else {
                stackIn_6_0 = si.field_b;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_6_0;
              if (param1 <= si.field_j) {
                stackIn_9_0 = si.field_j;
                break L3;
              } else {
                stackIn_9_0 = param1;
                break L3;
              }
            }
            L4: {
              var8 = stackIn_9_0;
              if (var5_int < si.field_l) {
                stackIn_12_0 = var5_int;
                break L4;
              } else {
                stackIn_12_0 = si.field_l;
                break L4;
              }
            }
            L5: {
              var9 = stackIn_12_0;
              if (si.field_a <= var6) {
                stackIn_15_0 = si.field_a;
                break L5;
              } else {
                stackIn_15_0 = var6;
                break L5;
              }
            }
            L6: {
              var10 = stackIn_15_0;
              if (si.field_b > param3) {
                break L6;
              } else {
                if (param3 >= si.field_l) {
                  break L6;
                } else {
                  var11 = param3 + var8 * si.field_e;
                  var12 = var10 + (1 - var8) >> 1978931393;
                  L7: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L6;
                    } else {
                      si.field_i[var11] = 16777215;
                      var11 = var11 + 2 * si.field_e;
                      continue L7;
                    }
                  }
                }
              }
            }
            L8: {
              if (si.field_j > param1) {
                break L8;
              } else {
                if (si.field_a <= var6) {
                  break L8;
                } else {
                  var11 = param1 * si.field_e - -var7;
                  var12 = -var7 + (1 + var9) >> -972719007;
                  L9: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L8;
                    } else {
                      si.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L9;
                    }
                  }
                }
              }
            }
            L10: {
              if (si.field_b > var5_int) {
                break L10;
              } else {
                if (var5_int < si.field_l) {
                  var11 = var5_int + (var8 - -(1 & -param3 + var5_int)) * si.field_e;
                  var12 = -var8 + (1 - -var10) >> -1786696479;
                  L11: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L10;
                    } else {
                      si.field_i[var11] = 16777215;
                      var11 = var11 + 2 * si.field_e;
                      continue L11;
                    }
                  }
                } else {
                  break L10;
                }
              }
            }
            L12: {
              if (si.field_j > param1) {
                break L12;
              } else {
                if (var6 >= si.field_a) {
                  break L12;
                } else {
                  var11 = (1 & var6 + -param1) + si.field_e * var6 - -var7;
                  var12 = -var7 + (var9 + 1) >> 2021179393;
                  L13: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L12;
                    } else {
                      si.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L13;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var5), "bh.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int c(byte param0) {
        int var2;
        dk var3;
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = 0;
        if (param0 <= 4) {
          field_c = (nd) null;
          var3 = this.field_f.field_j;
          L0: while (true) {
            if (this.field_f == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_j;
              continue L0;
            }
          }
        } else {
          var3 = this.field_f.field_j;
          L1: while (true) {
            if (this.field_f == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_j;
              continue L1;
            }
          }
        }
    }

    final dk d(byte param0) {
        dk var2;
        var2 = this.field_f.field_j;
        if (var2 != this.field_f) {
          this.field_i = var2.field_j;
          if (param0 != -35) {
            return (dk) null;
          } else {
            return var2;
          }
        } else {
          this.field_i = null;
          return null;
        }
    }

    public bh() {
        this.field_f = new dk();
        this.field_f.field_i = this.field_f;
        this.field_f.field_j = this.field_f;
    }

    final void a(dk param0, int param1) {
        try {
            int var3_int = -17 / ((param1 - -79) / 43);
            if (!(null == param0.field_i)) {
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
