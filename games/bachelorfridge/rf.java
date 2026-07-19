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
        int dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int[] array$9 = null;
        int dupTemp$10 = 0;
        int[] array$11 = null;
        int dupTemp$12 = 0;
        int[] array$13 = null;
        RuntimeException var3 = null;
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
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        var16 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var17 = new lu(td.a(-97, param1));
              var4 = var17.b(16711935);
              if (-6 < (var4 ^ -1)) {
                break L1;
              } else {
                if ((var4 ^ -1) >= -8) {
                  L2: {
                    if (-7 >= (var4 ^ -1)) {
                      this.field_r = var17.f(-66);
                      break L2;
                    } else {
                      this.field_r = 0;
                      break L2;
                    }
                  }
                  L3: {
                    if (param0 == 27062) {
                      break L3;
                    } else {
                      rf.a(12);
                      break L3;
                    }
                  }
                  L4: {
                    var5 = var17.b(16711935);
                    if (-1 == (1 & var5 ^ -1)) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L4;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_13_0 = stackOut_11_0;
                      break L4;
                    }
                  }
                  L5: {
                    var6 = stackIn_13_0;
                    if ((var4 ^ -1) > -8) {
                      this.field_d = var17.e((byte) 100);
                      break L5;
                    } else {
                      this.field_d = var17.f((byte) -127);
                      break L5;
                    }
                  }
                  L6: {
                    if (-1 == (var5 & 2 ^ -1)) {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      break L6;
                    } else {
                      stackOut_17_0 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      break L6;
                    }
                  }
                  L7: {
                    var7 = stackIn_19_0;
                    var8 = 0;
                    var9 = -1;
                    this.field_o = new int[this.field_d];
                    if ((var4 ^ -1) > -8) {
                      var10 = 0;
                      L8: while (true) {
                        if (this.field_d <= var10) {
                          break L7;
                        } else {
                          dupTemp$7 = var8 + var17.e((byte) 107);
                          var8 = dupTemp$7;
                          this.field_o[var10] = dupTemp$7;
                          if (this.field_o[var10] > var9) {
                            var9 = this.field_o[var10];
                            var10++;
                            continue L8;
                          } else {
                            var10++;
                            continue L8;
                          }
                        }
                      }
                    } else {
                      var10 = 0;
                      L9: while (true) {
                        if (var10 >= this.field_d) {
                          break L7;
                        } else {
                          L10: {
                            dupTemp$8 = var8 + var17.f((byte) 103);
                            var8 = dupTemp$8;
                            this.field_o[var10] = dupTemp$8;
                            if (this.field_o[var10] > var9) {
                              var9 = this.field_o[var10];
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10++;
                          continue L9;
                        }
                      }
                    }
                  }
                  L11: {
                    this.field_f = var9 - -1;
                    this.field_p = new int[this.field_f];
                    this.field_e = new int[this.field_f];
                    this.field_i = new int[this.field_f];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      this.field_g = new byte[this.field_f][];
                      break L11;
                    }
                  }
                  L12: {
                    this.field_c = new int[this.field_f][];
                    this.field_j = new int[this.field_f];
                    if (var6 != 0) {
                      this.field_s = new int[this.field_f];
                      var10 = 0;
                      L13: while (true) {
                        if (this.field_f <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (this.field_d <= var10) {
                              this.field_m = new cr(this.field_s);
                              break L12;
                            } else {
                              this.field_s[this.field_o[var10]] = var17.f(lt.a(param0, 27083));
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          this.field_s[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (var10 >= this.field_d) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (this.field_d <= var10) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(var21, 64, param0 + -26934, 0);
                              this.field_g[this.field_o[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= this.field_d) {
                          L19: {
                            if (var4 < 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (var10 >= this.field_d) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (this.field_d <= var10) {
                                      break L19;
                                    } else {
                                      var11 = this.field_o[var10];
                                      var12 = this.field_e[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      array$9 = new int[var12];
                                      this.field_c[var11] = array$9;
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var14 >= var12) {
                                          L23: {
                                            this.field_j[var11] = var13 + 1;
                                            if (var13 - -1 == var12) {
                                              this.field_c[var11] = null;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          dupTemp$10 = var8 + var17.e((byte) 57);
                                          var8 = dupTemp$10;
                                          this.field_c[var11][var14] = dupTemp$10;
                                          var15 = dupTemp$10;
                                          if (var13 < var15) {
                                            var13 = var15;
                                            var14++;
                                            continue L22;
                                          } else {
                                            var14++;
                                            continue L22;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_e[this.field_o[var10]] = var17.e((byte) 108);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L24: while (true) {
                                if (var10 >= this.field_d) {
                                  var10 = 0;
                                  L25: while (true) {
                                    if (this.field_d <= var10) {
                                      break L19;
                                    } else {
                                      var11 = this.field_o[var10];
                                      var12 = this.field_e[var11];
                                      var8 = 0;
                                      array$11 = new int[var12];
                                      this.field_c[var11] = array$11;
                                      var13 = -1;
                                      var14 = 0;
                                      L26: while (true) {
                                        if (var14 >= var12) {
                                          L27: {
                                            this.field_j[var11] = 1 + var13;
                                            if (var12 != 1 + var13) {
                                              break L27;
                                            } else {
                                              this.field_c[var11] = null;
                                              break L27;
                                            }
                                          }
                                          var10++;
                                          continue L25;
                                        } else {
                                          dupTemp$12 = var8 + var17.f((byte) -124);
                                          var8 = dupTemp$12;
                                          this.field_c[var11][var14] = dupTemp$12;
                                          var15 = dupTemp$12;
                                          if (var15 > var13) {
                                            var13 = var15;
                                            var14++;
                                            continue L26;
                                          } else {
                                            var14++;
                                            continue L26;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_e[this.field_o[var10]] = var17.f((byte) -11);
                                  var10++;
                                  continue L24;
                                }
                              }
                            }
                          }
                          L28: {
                            if (var6 != 0) {
                              this.field_n = new int[1 + var9][];
                              this.field_l = new cr[1 + var9];
                              var10 = 0;
                              L29: while (true) {
                                if (var10 >= this.field_d) {
                                  break L28;
                                } else {
                                  var11 = this.field_o[var10];
                                  var12 = this.field_e[var11];
                                  array$13 = new int[this.field_j[var11]];
                                  this.field_n[var11] = array$13;
                                  var13 = 0;
                                  L30: while (true) {
                                    if (var13 >= this.field_j[var11]) {
                                      var13 = 0;
                                      L31: while (true) {
                                        if (var13 >= var12) {
                                          this.field_l[var11] = new cr(this.field_n[var11]);
                                          var10++;
                                          continue L29;
                                        } else {
                                          L32: {
                                            if (null == this.field_c[var11]) {
                                              var14 = var13;
                                              break L32;
                                            } else {
                                              var14 = this.field_c[var11][var13];
                                              break L32;
                                            }
                                          }
                                          this.field_n[var11][var14] = var17.f(103);
                                          var13++;
                                          continue L31;
                                        }
                                      }
                                    } else {
                                      this.field_n[var11][var13] = -1;
                                      var13++;
                                      continue L30;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L28;
                            }
                          }
                          break L0;
                        } else {
                          this.field_i[this.field_o[var10]] = var17.f(-67);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      this.field_p[this.field_o[var10]] = var17.f(lt.a(param0, 27103));
                      var10++;
                      continue L15;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L33: {
            var3 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) (var3);
            stackOut_95_1 = new StringBuilder().append("rf.A(").append(param0).append(',');
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param1 == null) {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L33;
            } else {
              stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L33;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ')');
        }
    }

    public static void b(int param0) {
        field_q = null;
        if (param0 >= -63) {
            rf.b(-64);
        }
        field_h = null;
    }

    rf(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_b = wc.a(param0, -31303, param0.length);
            if (this.field_b != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if ((param2.length ^ -1) != -65) {
                    throw new RuntimeException();
                }
                this.field_a = ln.a(param0.length, param0, 0, 8);
                for (var4_int = 0; 64 > var4_int; var4_int++) {
                    if (this.field_a[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(27062, param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "rf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new String[]{"MOVE_WALK", "MOVE_SPRINT", "MOVE_SPRINT2", "MOVE_SPRINT3", "MOVE_TELEPORT", "MOVE_LEVITATE", "ATTACK_ME_HIT", "ATTACK_ME_HIT2", "ATTACK_ME_HIT3", "ATTACK_DA_CONE", "ATTACK_DA_CONE2", "ATTACK_DA_CONE3", "ATTACK_DR_SPLASH", "ATTACK_DR_SPLASH2", "ATTACK_DR_SPLASH3", "ATTACK_BA_SHOVE", "ATTACK_BA_SHOVE2", "ATTACK_BA_SHOVE3", "ATTACK_FV_SPEAR", "ATTACK_FV_SPEAR2", "ATTACK_FV_SPEAR3", "ATTACK_FI_SWIPE", "ATTACK_FI_SWIPE2", "ATTACK_FI_SWIPE3", "ATTACK_ME_CHARGE", "ATTACK_ME_CHARGE2", "ATTACK_ME_CHARGE3", "ATTACK_ME_SHBARGE", "ATTACK_ME_SHBARGE2", "ATTACK_ME_SHBARGE3", "BUFF_ME_ATTACKUP", "ATTACK_DA_RANGE", "ATTACK_DA_RANGE2", "ATTACK_DA_RANGE3", "PASSIVE_DA_BUFFRNG", "PASSIVE_DA_BUFFRNG2", "PASSIVE_DA_BUFFRNG3", "BUFF_DA_SPEEDDOWN", "ATTACK_BA_SMASH", "ATTACK_BA_SMASH2", "ATTACK_BA_SMASH3", "ATTACK_BA_JUMPSHOVE", "ATTACK_BA_JUMPSHOVE2", "ATTACK_BA_JUMPSHOVE3", "BUFF_BA_GUARD", "BUFF_DR_SPEEDUP", "ATTACK_FV_FLYINGKICK", "ATTACK_FV_FLYINGKICK2", "ATTACK_FV_FLYINGKICK3", "ATTACK_FV_JUMP", "ATTACK_FV_JUMP2", "ATTACK_FV_JUMP3", "BUFF_FV_ATTACKDOWN", "PASSIVE_FI_BUFFSPLASH", "ATTACK_FI_RNGCONE", "ATTACK_FI_RNGCONE2", "ATTACK_FI_RNGCONE3", "BUFF_FI_POISON", "ATTACK_MI_POKE", "ATTACK_MI_POKE2", "ATTACK_MI_POKE3", "ATTACK_MI_HEAL", "ATTACK_MI_HEAL2", "ATTACK_MI_HEAL3", "ATTACK_MI_EXTEND", "ATTACK_MI_EXTEND2", "ATTACK_MI_EXTEND3", "BUFF_MI_SPATKUP", "ATTACK_RM_VAMPIRE", "ATTACK_RM_VAMPIRE2", "ATTACK_RM_VAMPIRE3", "ATTACK_RM_RNGSPLASH", "ATTACK_RM_RNGSPLASH2", "ATTACK_RM_RNGSPLASH3", "ATTACK_RM_FLSWIPE", "ATTACK_RM_FLSWIPE2", "ATTACK_RM_FLSWIPE3", "BUFF_RM_SPATKDOWN", "ATTACK_SWAP1", "ATTACK_SWAP2", "ATTACK_PIT", "ATTACK_BLOCK", "ATTACK_CONFUSE", "ATTACK_PANIC", "PASSIVE_HP", "PASSIVE_SPEED", "PASSIVE_ATTACK", "PASSIVE_SPATTACK", "SPECIAL_SNOW", "SPECIAL_SUPERSPEED", "SPECIAL_SLEEP", "SPECIAL_SHIELD", "SPECIAL_HAIL", "SPECIAL_RAISE", "SPECIAL_DBOMBER", "SPECIAL_MARTYR", "SPECIAL_INCOMING", "SPECIAL_SPILTMILK", "SPECIAL_DREAMS", "SPECIAL_SLOWALL", "SPECIAL_INSANOSAUCE", "SPECIAL_SUPERSPEEDALL", "SPECIAL_SHUFFLE", "SPECIAL_FLOOD", "SPECIAL_LEVITATE", "SPECIAL_FULLHEAL", "SPECIAL_INVINCIBLE", "SPECIAL_CLAMS", "SPECIAL_DISABLE", "SPECIAL_FISHRAIN", "SPECIAL_MASSPOISON", "SPECIAL_ZOMBIES", "SPECIAL_FLY", "SPECIAL_TBOMBER", "SPECIAL_STICKY", "SPECIAL_FLIRT", "SPECIAL_HMISSILE", "SPECIAL_BANANARANG", "SPECIAL_STAMPEDE", "SPECIAL_MYSTERY", "SPECIAL_SCAVENGER", "SPECIAL_ATTACKUPALL", "SPECIAL_SAUCEOFFLAME", "SPECIAL_SPLIT", "SPECIAL_CRANBERRY", "SPECIAL_BUFFVENDOR", "SPECIAL_HAZMAT", "SPECIAL_BAGPIPE", "SPECIAL_RESET", "SPECIAL_PETATTACK", "SPECIAL_TELEPORT", "SPECIAL_AIRSTRIKE", "SPECIAL_PIZZAPARTY", "SPECIAL_OHNO", "SPECIAL_REFRESHING", "SPECIAL_RAGE", "SPECIAL_GASCLOUD", "SPECIAL_ONE"};
    }
}
