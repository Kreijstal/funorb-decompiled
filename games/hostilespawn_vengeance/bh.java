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
        dk var2 = null;
        var2 = ((bh) this).field_f.field_j;
        if (((bh) this).field_f != var2) {
          var2.c(-1);
          if (param0 != 27) {
            dk discarded$2 = ((bh) this).b((byte) 117);
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
            var2 = ((bh) this).field_i;
            if (!(var2 != ((bh) this).field_f)) {
                ((bh) this).field_i = null;
                return null;
            }
            ((bh) this).field_i = var2.field_j;
            return var2;
        }
        var2 = ((bh) this).field_i;
        if (!(var2 != ((bh) this).field_f)) {
            ((bh) this).field_i = null;
            return null;
        }
        ((bh) this).field_i = var2.field_j;
        return var2;
    }

    final static void a(byte param0, int[] param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        RuntimeException var11 = null;
        int var11_int = 0;
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
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var26 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
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
            if (var13 == 0) {
              return;
            } else {
              var14 = (int)(Math.sqrt((double)((float)var13 / 4.0f)) * 4.0);
              var15 = v.field_g;
              if (var15 >= bn.field_p) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L1: {
                  var16 = var15 + -qg.field_n;
                  var17 = var15 + -qh.field_e;
                  var18 = var16 * var12;
                  var19 = var16 * var11_int;
                  var20 = pk.field_m;
                  if (~cn.field_r >= ~var20) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        var21 = -m.field_q + var20;
                        var22 = var20 + -ni.field_f;
                        var23 = var21 * var11_int - -var18 >> 2;
                        if (param0 != 0) {
                          break L3;
                        } else {
                          if (gj.field_h * var21 + var16 * en.field_s < 0) {
                            var20 += 4;
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        L5: {
                          L6: {
                            L7: {
                              L8: {
                                L9: {
                                  L10: {
                                    if (param2 != 0) {
                                      break L10;
                                    } else {
                                      if (0 <= var17 * bj.field_d + ic.field_n * var22) {
                                        var20 += 4;
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (param0 == 2) {
                                      break L11;
                                    } else {
                                      if (var23 >= 0) {
                                        break L11;
                                      } else {
                                        var24 = (int)Math.sqrt((double)(var16 * var16 + var21 * var21));
                                        if (param3 >= var24) {
                                          si.a(var20 >> 2, var15 >> 2, param1[param8 + -(var24 * param8 / param3)]);
                                          break L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    if (param2 == 2) {
                                      break L12;
                                    } else {
                                      if (var23 > var13) {
                                        var24 = (int)Math.sqrt((double)(var17 * var17 + var22 * var22));
                                        if (~var24 < ~param7) {
                                          break L5;
                                        } else {
                                          si.a(var20 >> 2, var15 >> 2, param1[param8 + -(var24 * param8 / param7)]);
                                          break L4;
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  L13: {
                                    var24 = -var19 + var21 * var12 >> 2;
                                    var25 = (var23 * param7 + param3 * (-var23 + var13)) / var13;
                                    if (0 <= var24) {
                                      break L13;
                                    } else {
                                      var24 = -var24;
                                      break L13;
                                    }
                                  }
                                  if (var24 >= var14 * var25 >> 2) {
                                    break L7;
                                  } else {
                                    si.a(var20 >> 2, var15 >> 2, param1[-(param8 * (var24 << 2) / var25 / var14) + param8]);
                                    break L6;
                                  }
                                }
                                var20 += 4;
                                break L8;
                              }
                              var20 += 4;
                              break L7;
                            }
                            var20 += 4;
                            break L6;
                          }
                          var20 += 4;
                          break L5;
                        }
                        var20 += 4;
                        break L4;
                      }
                      var20 += 4;
                      break L2;
                    }
                    var20 += 4;
                    var20 += 4;
                    break L1;
                  }
                }
                var15 += 4;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var11 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var11;
            stackOut_37_1 = new StringBuilder().append("bh.E(").append(param0).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L14;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L14;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + 9233 + 41);
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
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3 + param4;
              var6 = param1 + param0;
              if (param2 == 65) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            L2: {
              if (si.field_b < param3) {
                stackOut_5_0 = param3;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = si.field_b;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_6_0;
              if (param1 <= si.field_j) {
                stackOut_8_0 = si.field_j;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = param1;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            L4: {
              var8 = stackIn_9_0;
              if (var5_int < si.field_l) {
                stackOut_11_0 = var5_int;
                stackIn_12_0 = stackOut_11_0;
                break L4;
              } else {
                stackOut_10_0 = si.field_l;
                stackIn_12_0 = stackOut_10_0;
                break L4;
              }
            }
            L5: {
              var9 = stackIn_12_0;
              if (si.field_a <= var6) {
                stackOut_14_0 = si.field_a;
                stackIn_15_0 = stackOut_14_0;
                break L5;
              } else {
                stackOut_13_0 = var6;
                stackIn_15_0 = stackOut_13_0;
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
                  var12 = var10 + (1 - var8) >> 1;
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
                  var12 = -var7 + (1 + var9) >> 1;
                  L9: while (true) {
                    var12--;
                    if (var12 < 0) {
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
                  var12 = -var8 + (1 - -var10) >> 1;
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
                  var12 = -var7 + (var9 + 1) >> 1;
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
          throw wg.a((Throwable) (Object) var5, "bh.H(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final int c(byte param0) {
        int var2 = 0;
        dk var3 = null;
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = 0;
        if (param0 <= 4) {
          field_c = null;
          var3 = ((bh) this).field_f.field_j;
          L0: while (true) {
            if (((bh) this).field_f == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_j;
              continue L0;
            }
          }
        } else {
          var3 = ((bh) this).field_f.field_j;
          L1: while (true) {
            if (((bh) this).field_f == var3) {
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
        dk var2 = null;
        var2 = ((bh) this).field_f.field_j;
        if (var2 != ((bh) this).field_f) {
          ((bh) this).field_i = var2.field_j;
          if (param0 != -35) {
            return null;
          } else {
            return var2;
          }
        } else {
          ((bh) this).field_i = null;
          return null;
        }
    }

    public bh() {
        ((bh) this).field_f = new dk();
        ((bh) this).field_f.field_i = ((bh) this).field_f;
        ((bh) this).field_f.field_j = ((bh) this).field_f;
    }

    final void a(dk param0, int param1) {
        try {
            int var3_int = -17 / ((param1 - -79) / 43);
            if (!(null == param0.field_i)) {
                param0.c(-1);
            }
            param0.field_i = ((bh) this).field_f.field_i;
            param0.field_j = ((bh) this).field_f;
            param0.field_i.field_j = param0;
            param0.field_j.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "bh.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"Complete the starship levels (Kerrus levels 1<nbsp>to<nbsp>3)", "Locate the spawn hive on Kerrus level 7 (Infiltration)", "Unlock Kerrus hard mode by completing the campaign", "Reach the rank of 'Lone<nbsp>Wolf'", "Reach the rank of 'Scourge<nbsp>Elite'", "Kill 30 aliens with the C.R.A.G.", "Kill 30 aliens with the flamethrower", "Kill 30 aliens with the rocket launcher or other explosives", "Kill 30 aliens with the railgun", "Kill 50 aliens with the plasma gun", "Kill 5 aliens with one shot from the railgun", "Complete Kerrus level 5 (Destruction) from an auto gun start", "Complete Kerrus level 6 (Security) from an auto gun start", "Complete Kerrus level 7 (Infiltration) from an auto gun start", "Complete Kerrus level 8 (The Hive) from an auto gun start", "Complete Kerrus level 9 (Regicide) from an auto gun start", "Complete Kerrus level 10 (Escape) from an auto gun start", "Destroy all enemies on Kerrus level 4 (Entrance)", "Rise from the ashes of a reactor meltdown", "Reach the bridge of the space station", "Defeat the Vengeance Queen", "Escape the medical facility", "Complete Vengeance level 2 (Lockdown) without the security pass", "Complete Vengeance level 3 (Breach) without breaking an egg", "Kill the Guard on Vengeance level 4 (Infest Station)", "Finish Vengeance level 5 (Bridge) holding every weapon", "Kill all three Guards and complete Vengeance level 6 (Nightmare)", "Complete Vengeance level 7 (Invasion) never holding more than one explosive charge", "Complete Vengeance level 8 (Torment) having destroyed every egg", "Complete Vengeance level 9 (Planet-side) without using energy weapons", "Escape the planet on Vengeance level 10 (Hostile Revenant)", "Complete Vengeance, unlocking hard mode", "Kill a Guard with the pistol", "Complete Vengeance level 2 (Lockdown) from a pistol start", "Complete Vengeance level 3 (Breach) from a pistol start", "Complete Vengeance level 4 (Infest Station) from a pistol start", "Complete Vengeance level 5 (Bridge) from a pistol start", "Complete Vengeance level 6 (Nightmare) from a pistol start", "Complete Vengeance level 7 (Invasion) from a pistol start", "Complete Vengeance level 8 (Torment) from a pistol start", "Complete Vengeance level 9 (Planet-side) from a pistol start", "Complete Vengeance in hard mode"};
        field_d = 0;
        field_c = new nd(0, 2, 2, 1);
        field_j = new int[]{5, 8, 9, 10};
    }
}
