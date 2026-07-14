/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    int[] field_e;
    cr field_m;
    private int field_d;
    int field_b;
    static String[] field_h;
    int[][] field_c;
    int[] field_i;
    int field_f;
    private byte[] field_a;
    int[] field_o;
    byte[][] field_g;
    private int[][] field_n;
    int field_r;
    int[] field_j;
    cr[] field_l;
    static sna field_q;
    int[] field_p;
    static int field_k;
    private int[] field_s;

    final static void a(int param0) {
        vka.c((byte) 73);
        if (param0 >= -127) {
            field_k = 18;
        }
    }

    private final void a(int param0, byte[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        lu var17 = null;
        byte[] var21 = null;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          var16 = BachelorFridge.field_y;
          var17 = new lu(td.a(-97, param1));
          var4 = var17.b(16711935);
          if (-6 < (var4 ^ -1)) {
            break L0;
          } else {
            if (var4 >= -8) {
              L1: {
                if (-7 <= var4) {
                  ((rf) this).field_r = var17.f(-66);
                  break L1;
                } else {
                  ((rf) this).field_r = 0;
                  break L1;
                }
              }
              L2: {
                if (param0 == 27062) {
                  break L2;
                } else {
                  rf.a(12);
                  break L2;
                }
              }
              L3: {
                var5 = var17.b(16711935);
                if (-1 == (1 & var5 ^ -1)) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              L4: {
                var6 = stackIn_12_0;
                if ((var4 ^ -1) > -8) {
                  ((rf) this).field_d = var17.e((byte) 100);
                  break L4;
                } else {
                  ((rf) this).field_d = var17.f((byte) -127);
                  break L4;
                }
              }
              L5: {
                if (-1 == (var5 & 2 ^ -1)) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L5;
                } else {
                  stackOut_16_0 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  break L5;
                }
              }
              L6: {
                var7 = stackIn_18_0;
                var8 = 0;
                var9 = -1;
                ((rf) this).field_o = new int[((rf) this).field_d];
                if ((var4 ^ -1) > -8) {
                  var10 = 0;
                  L7: while (true) {
                    if (((rf) this).field_d <= var10) {
                      break L6;
                    } else {
                      var8 = var8 + var17.e((byte) 107);
                      ((rf) this).field_o[var10] = var8 + var17.e((byte) 107);
                      if (((rf) this).field_o[var10] > var9) {
                        var9 = ((rf) this).field_o[var10];
                        var10++;
                        continue L7;
                      } else {
                        var10++;
                        continue L7;
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L8: while (true) {
                    if (var10 >= ((rf) this).field_d) {
                      break L6;
                    } else {
                      var8 = var8 + var17.f((byte) 103);
                      ((rf) this).field_o[var10] = var8 + var17.f((byte) 103);
                      if (((rf) this).field_o[var10] > var9) {
                        var9 = ((rf) this).field_o[var10];
                        var10++;
                        continue L8;
                      } else {
                        var10++;
                        continue L8;
                      }
                    }
                  }
                }
              }
              L9: {
                ((rf) this).field_f = var9 - -1;
                ((rf) this).field_p = new int[((rf) this).field_f];
                ((rf) this).field_e = new int[((rf) this).field_f];
                ((rf) this).field_i = new int[((rf) this).field_f];
                if (var7 == 0) {
                  break L9;
                } else {
                  ((rf) this).field_g = new byte[((rf) this).field_f][];
                  break L9;
                }
              }
              L10: {
                ((rf) this).field_c = new int[((rf) this).field_f][];
                ((rf) this).field_j = new int[((rf) this).field_f];
                if (var6 != 0) {
                  ((rf) this).field_s = new int[((rf) this).field_f];
                  var10 = 0;
                  L11: while (true) {
                    if (((rf) this).field_f <= var10) {
                      var10 = 0;
                      L12: while (true) {
                        if (((rf) this).field_d <= var10) {
                          ((rf) this).field_m = new cr(((rf) this).field_s);
                          break L10;
                        } else {
                          ((rf) this).field_s[((rf) this).field_o[var10]] = var17.f(lt.a(param0, 27083));
                          var10++;
                          continue L12;
                        }
                      }
                    } else {
                      ((rf) this).field_s[var10] = -1;
                      var10++;
                      continue L11;
                    }
                  }
                } else {
                  break L10;
                }
              }
              var10 = 0;
              L13: while (true) {
                if (var10 >= ((rf) this).field_d) {
                  L14: {
                    if (var7 == 0) {
                      break L14;
                    } else {
                      var10 = 0;
                      L15: while (true) {
                        if (((rf) this).field_d <= var10) {
                          break L14;
                        } else {
                          var21 = new byte[64];
                          var17.a(var21, 64, param0 + -26934, 0);
                          ((rf) this).field_g[((rf) this).field_o[var10]] = var21;
                          var10++;
                          continue L15;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L16: while (true) {
                    if (var10 >= ((rf) this).field_d) {
                      L17: {
                        if (var4 < 7) {
                          var10 = 0;
                          L18: while (true) {
                            if (var10 >= ((rf) this).field_d) {
                              var10 = 0;
                              L19: while (true) {
                                if (((rf) this).field_d <= var10) {
                                  break L17;
                                } else {
                                  var11 = ((rf) this).field_o[var10];
                                  var12 = ((rf) this).field_e[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  ((rf) this).field_c[var11] = new int[var12];
                                  var14 = 0;
                                  L20: while (true) {
                                    if (var14 >= var12) {
                                      ((rf) this).field_j[var11] = var13 + 1;
                                      if (var13 - -1 == var12) {
                                        ((rf) this).field_c[var11] = null;
                                        var10++;
                                        continue L19;
                                      } else {
                                        var10++;
                                        continue L19;
                                      }
                                    } else {
                                      var8 = var8 + var17.e((byte) 57);
                                      ((rf) this).field_c[var11][var14] = var8 + var17.e((byte) 57);
                                      var15 = var8 + var17.e((byte) 57);
                                      if (var13 < var15) {
                                        var13 = var15;
                                        var14++;
                                        continue L20;
                                      } else {
                                        var14++;
                                        continue L20;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              ((rf) this).field_e[((rf) this).field_o[var10]] = var17.e((byte) 108);
                              var10++;
                              continue L18;
                            }
                          }
                        } else {
                          var10 = 0;
                          L21: while (true) {
                            if (var10 >= ((rf) this).field_d) {
                              var10 = 0;
                              L22: while (true) {
                                if (((rf) this).field_d <= var10) {
                                  break L17;
                                } else {
                                  var11 = ((rf) this).field_o[var10];
                                  var12 = ((rf) this).field_e[var11];
                                  var8 = 0;
                                  ((rf) this).field_c[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var14 >= var12) {
                                      ((rf) this).field_j[var11] = 1 + var13;
                                      if (var12 == 1 + var13) {
                                        ((rf) this).field_c[var11] = null;
                                        var10++;
                                        continue L22;
                                      } else {
                                        var10++;
                                        continue L22;
                                      }
                                    } else {
                                      var8 = var8 + var17.f((byte) -124);
                                      ((rf) this).field_c[var11][var14] = var8 + var17.f((byte) -124);
                                      var15 = var8 + var17.f((byte) -124);
                                      if (var15 > var13) {
                                        var13 = var15;
                                        var14++;
                                        continue L23;
                                      } else {
                                        var14++;
                                        continue L23;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              ((rf) this).field_e[((rf) this).field_o[var10]] = var17.f((byte) -11);
                              var10++;
                              continue L21;
                            }
                          }
                        }
                      }
                      L24: {
                        if (var6 != 0) {
                          ((rf) this).field_n = new int[1 + var9][];
                          ((rf) this).field_l = new cr[1 + var9];
                          var10 = 0;
                          L25: while (true) {
                            if (var10 >= ((rf) this).field_d) {
                              break L24;
                            } else {
                              var11 = ((rf) this).field_o[var10];
                              var12 = ((rf) this).field_e[var11];
                              ((rf) this).field_n[var11] = new int[((rf) this).field_j[var11]];
                              var13 = 0;
                              L26: while (true) {
                                if (var13 >= ((rf) this).field_j[var11]) {
                                  var13 = 0;
                                  L27: while (true) {
                                    if (var13 >= var12) {
                                      ((rf) this).field_l[var11] = new cr(((rf) this).field_n[var11]);
                                      var10++;
                                      continue L25;
                                    } else {
                                      L28: {
                                        if (null == ((rf) this).field_c[var11]) {
                                          var14 = var13;
                                          break L28;
                                        } else {
                                          var14 = ((rf) this).field_c[var11][var13];
                                          break L28;
                                        }
                                      }
                                      ((rf) this).field_n[var11][var14] = var17.f(103);
                                      var13++;
                                      continue L27;
                                    }
                                  }
                                } else {
                                  ((rf) this).field_n[var11][var13] = -1;
                                  var13++;
                                  continue L26;
                                }
                              }
                            }
                          }
                        } else {
                          break L24;
                        }
                      }
                      return;
                    } else {
                      ((rf) this).field_i[((rf) this).field_o[var10]] = var17.f(-67);
                      var10++;
                      continue L16;
                    }
                  }
                } else {
                  ((rf) this).field_p[((rf) this).field_o[var10]] = var17.f(lt.a(param0, 27103));
                  var10++;
                  continue L13;
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new RuntimeException();
    }

    public static void b(int param0) {
        field_q = null;
        if (param0 >= -63) {
            rf.b(-64);
        }
        field_h = null;
    }

    rf(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((rf) this).field_b = wc.a(param0, -31303, param0.length);
        if (((rf) this).field_b != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if ((param2.length ^ -1) != -65) {
                throw new RuntimeException();
            }
            ((rf) this).field_a = ln.a(param0.length, param0, 0, 8);
            for (var4 = 0; 64 > var4; var4++) {
                if (((rf) this).field_a[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(27062, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new String[]{"MOVE_WALK", "MOVE_SPRINT", "MOVE_SPRINT2", "MOVE_SPRINT3", "MOVE_TELEPORT", "MOVE_LEVITATE", "ATTACK_ME_HIT", "ATTACK_ME_HIT2", "ATTACK_ME_HIT3", "ATTACK_DA_CONE", "ATTACK_DA_CONE2", "ATTACK_DA_CONE3", "ATTACK_DR_SPLASH", "ATTACK_DR_SPLASH2", "ATTACK_DR_SPLASH3", "ATTACK_BA_SHOVE", "ATTACK_BA_SHOVE2", "ATTACK_BA_SHOVE3", "ATTACK_FV_SPEAR", "ATTACK_FV_SPEAR2", "ATTACK_FV_SPEAR3", "ATTACK_FI_SWIPE", "ATTACK_FI_SWIPE2", "ATTACK_FI_SWIPE3", "ATTACK_ME_CHARGE", "ATTACK_ME_CHARGE2", "ATTACK_ME_CHARGE3", "ATTACK_ME_SHBARGE", "ATTACK_ME_SHBARGE2", "ATTACK_ME_SHBARGE3", "BUFF_ME_ATTACKUP", "ATTACK_DA_RANGE", "ATTACK_DA_RANGE2", "ATTACK_DA_RANGE3", "PASSIVE_DA_BUFFRNG", "PASSIVE_DA_BUFFRNG2", "PASSIVE_DA_BUFFRNG3", "BUFF_DA_SPEEDDOWN", "ATTACK_BA_SMASH", "ATTACK_BA_SMASH2", "ATTACK_BA_SMASH3", "ATTACK_BA_JUMPSHOVE", "ATTACK_BA_JUMPSHOVE2", "ATTACK_BA_JUMPSHOVE3", "BUFF_BA_GUARD", "BUFF_DR_SPEEDUP", "ATTACK_FV_FLYINGKICK", "ATTACK_FV_FLYINGKICK2", "ATTACK_FV_FLYINGKICK3", "ATTACK_FV_JUMP", "ATTACK_FV_JUMP2", "ATTACK_FV_JUMP3", "BUFF_FV_ATTACKDOWN", "PASSIVE_FI_BUFFSPLASH", "ATTACK_FI_RNGCONE", "ATTACK_FI_RNGCONE2", "ATTACK_FI_RNGCONE3", "BUFF_FI_POISON", "ATTACK_MI_POKE", "ATTACK_MI_POKE2", "ATTACK_MI_POKE3", "ATTACK_MI_HEAL", "ATTACK_MI_HEAL2", "ATTACK_MI_HEAL3", "ATTACK_MI_EXTEND", "ATTACK_MI_EXTEND2", "ATTACK_MI_EXTEND3", "BUFF_MI_SPATKUP", "ATTACK_RM_VAMPIRE", "ATTACK_RM_VAMPIRE2", "ATTACK_RM_VAMPIRE3", "ATTACK_RM_RNGSPLASH", "ATTACK_RM_RNGSPLASH2", "ATTACK_RM_RNGSPLASH3", "ATTACK_RM_FLSWIPE", "ATTACK_RM_FLSWIPE2", "ATTACK_RM_FLSWIPE3", "BUFF_RM_SPATKDOWN", "ATTACK_SWAP1", "ATTACK_SWAP2", "ATTACK_PIT", "ATTACK_BLOCK", "ATTACK_CONFUSE", "ATTACK_PANIC", "PASSIVE_HP", "PASSIVE_SPEED", "PASSIVE_ATTACK", "PASSIVE_SPATTACK", "SPECIAL_SNOW", "SPECIAL_SUPERSPEED", "SPECIAL_SLEEP", "SPECIAL_SHIELD", "SPECIAL_HAIL", "SPECIAL_RAISE", "SPECIAL_DBOMBER", "SPECIAL_MARTYR", "SPECIAL_INCOMING", "SPECIAL_SPILTMILK", "SPECIAL_DREAMS", "SPECIAL_SLOWALL", "SPECIAL_INSANOSAUCE", "SPECIAL_SUPERSPEEDALL", "SPECIAL_SHUFFLE", "SPECIAL_FLOOD", "SPECIAL_LEVITATE", "SPECIAL_FULLHEAL", "SPECIAL_INVINCIBLE", "SPECIAL_CLAMS", "SPECIAL_DISABLE", "SPECIAL_FISHRAIN", "SPECIAL_MASSPOISON", "SPECIAL_ZOMBIES", "SPECIAL_FLY", "SPECIAL_TBOMBER", "SPECIAL_STICKY", "SPECIAL_FLIRT", "SPECIAL_HMISSILE", "SPECIAL_BANANARANG", "SPECIAL_STAMPEDE", "SPECIAL_MYSTERY", "SPECIAL_SCAVENGER", "SPECIAL_ATTACKUPALL", "SPECIAL_SAUCEOFFLAME", "SPECIAL_SPLIT", "SPECIAL_CRANBERRY", "SPECIAL_BUFFVENDOR", "SPECIAL_HAZMAT", "SPECIAL_BAGPIPE", "SPECIAL_RESET", "SPECIAL_PETATTACK", "SPECIAL_TELEPORT", "SPECIAL_AIRSTRIKE", "SPECIAL_PIZZAPARTY", "SPECIAL_OHNO", "SPECIAL_REFRESHING", "SPECIAL_RAGE", "SPECIAL_GASCLOUD", "SPECIAL_ONE"};
    }
}
