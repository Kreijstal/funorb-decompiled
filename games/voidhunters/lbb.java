/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lbb implements ntb {
    static String field_c;
    private int field_b;
    private int[] field_j;
    private int field_e;
    private int field_d;
    private qqb field_f;
    private qdb field_i;
    private int field_a;
    static String field_h;
    et[] field_g;

    final int d(byte param0) {
        int var2 = -14 / ((param0 - -56) / 40);
        return ((lbb) this).field_i.field_f;
    }

    final int g(byte param0) {
        if (param0 <= 39) {
            ((lbb) this).field_d = -39;
        }
        return ((lbb) this).field_b;
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        lbb var5 = null;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        L0: {
          var5 = (lbb) (Object) param0;
          boolean discarded$1 = tja.a((ntb[]) (Object) var5.field_g, 1, (ntb[]) (Object) var5.field_g, false, 5547);
          if (null == var5.field_i) {
            break L0;
          } else {
            if (var5.field_i != null) {
              var5.field_i.a((tv) (Object) var5.field_i, -123);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (null == var5.field_f) {
            break L1;
          } else {
            if (null != var5.field_f) {
              var5.field_f.a((tv) (Object) var5.field_f, -102);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          var4 = 0;
          if (var5.field_d == var5.field_d) {
            break L2;
          } else {
            var4 = 1;
            System.out.println("int mission_phase has changed. before=" + var5.field_d + ", now=" + var5.field_d);
            break L2;
          }
        }
        L3: {
          if (var5.field_e == var5.field_e) {
            break L3;
          } else {
            var4 = 1;
            System.out.println("int phase_change_countdown has changed. before=" + var5.field_e + ", now=" + var5.field_e);
            break L3;
          }
        }
        L4: {
          if ((var5.field_a ^ -1) != (var5.field_a ^ -1)) {
            System.out.println("int phase_timer has changed. before=" + var5.field_a + ", now=" + var5.field_a);
            var4 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (var5.field_b != var5.field_b) {
            var4 = 1;
            System.out.println("int winner has changed. before=" + var5.field_b + ", now=" + var5.field_b);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (dn.a((tv[]) (Object) var5.field_g, false, 1, (tv[]) (Object) var5.field_g, -77)) {
            System.out.println("MissionVariable[] custom_variables has changed. ");
            var4 = 1;
            break L6;
          } else {
            break L6;
          }
        }
        if (param1 < -19) {
          L7: {
            if (var5.field_i != null) {
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              break L7;
            } else {
              stackOut_24_0 = 1;
              stackIn_26_0 = stackOut_24_0;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = stackIn_26_0;
            stackIn_28_0 = stackOut_26_0;
            stackIn_27_0 = stackOut_26_0;
            if (var5.field_i != null) {
              stackOut_28_0 = stackIn_28_0;
              stackOut_28_1 = 0;
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              break L8;
            } else {
              stackOut_27_0 = stackIn_27_0;
              stackOut_27_1 = 1;
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              break L8;
            }
          }
          L9: {
            L10: {
              if ((stackIn_29_0 ^ stackIn_29_1) != 0) {
                break L10;
              } else {
                if (var5.field_i == null) {
                  break L9;
                } else {
                  if (!var5.field_i.a((byte) 84, (tv) (Object) var5.field_i)) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
            }
            System.out.println("MissionGenerationData nextround has changed. before=" + var5.field_i + ", now=" + var5.field_i);
            var4 = 1;
            break L9;
          }
          L11: {
            if (!ikb.a(var5.field_j, var5.field_j, false)) {
              break L11;
            } else {
              System.out.println("int[] teamscores has changed. ");
              var4 = 1;
              break L11;
            }
          }
          L12: {
            if (var5.field_f != null) {
              stackOut_38_0 = 0;
              stackIn_39_0 = stackOut_38_0;
              break L12;
            } else {
              stackOut_37_0 = 1;
              stackIn_39_0 = stackOut_37_0;
              break L12;
            }
          }
          L13: {
            stackOut_39_0 = stackIn_39_0;
            stackIn_41_0 = stackOut_39_0;
            stackIn_40_0 = stackOut_39_0;
            if (null != var5.field_f) {
              stackOut_41_0 = stackIn_41_0;
              stackOut_41_1 = 0;
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              break L13;
            } else {
              stackOut_40_0 = stackIn_40_0;
              stackOut_40_1 = 1;
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              break L13;
            }
          }
          L14: {
            L15: {
              if ((stackIn_42_0 ^ stackIn_42_1) != 0) {
                break L15;
              } else {
                if (null == var5.field_f) {
                  break L14;
                } else {
                  if (!var5.field_f.a((byte) 126, (tv) (Object) var5.field_f)) {
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
            }
            System.out.println("MatchResults current_match has changed. before=" + var5.field_f + ", now=" + var5.field_f);
            var4 = 1;
            break L14;
          }
          L16: {
            if (var4 != 0) {
              System.out.println("This instance of MissionState has changed");
              break L16;
            } else {
              break L16;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, rsb param1) {
        int var4 = 0;
        int var5_int = 0;
        tfa var5 = null;
        int var6 = 0;
        int var7 = 0;
        bea var8 = null;
        bea var9 = null;
        Random var10 = null;
        String var11 = null;
        L0: {
          var7 = VoidHunters.field_G;
          var8 = new bea();
          var9 = var8;
          var9.field_d = this.a((byte) 120);
          if (!qab.a(param0 + 92, ((lbb) this).d(6472))) {
            break L0;
          } else {
            var10 = new Random((long)var9.field_d);
            this.b(-1, param1);
            ((lbb) this).a(var10, 2196, param1);
            break L0;
          }
        }
        L1: {
          var9.field_c = ((lbb) this).c(true);
          var9.a(91, param1);
          if (vpa.a((byte) -125)) {
            var11 = ih.field_f[param1.field_e.d(6472)];
            qa.a(202, "missions_started_" + var11, 1);
            qa.a(param0 + 202, "missions_started", 1);
            var5_int = 0;
            L2: while (true) {
              if (var5_int >= var9.field_c.length) {
                break L1;
              } else {
                L3: {
                  var6 = var8.field_c[var5_int];
                  if (0 < var6) {
                    qa.a(param0 + 202, "votes_for_" + ih.field_f[var5_int], var6);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5_int++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        this.b(-1);
        ((lbb) this).c(5, -7, 0);
        ((lbb) this).field_b = -1;
        ((lbb) this).field_e = 0;
        var4 = param0;
        L4: while (true) {
          if ((var4 ^ -1) <= (param1.field_c.length ^ -1)) {
            return;
          } else {
            var5 = param1.a(var4, (byte) 59);
            var5.b((byte) 127);
            var5.b(-1);
            var5.field_k = null;
            var4++;
            continue L4;
          }
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var2 = -41 % ((14 - param0) / 41);
            if (((lbb) this).field_d == 0) {
              break L1;
            } else {
              if (((lbb) this).field_d == 1) {
                break L1;
              } else {
                if ((((lbb) this).field_d ^ -1) == -3) {
                  break L1;
                } else {
                  if (((lbb) this).field_d != 3) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final int e(byte param0) {
        int var2 = -113 % ((-74 - param0) / 52);
        return ((lbb) this).field_e;
    }

    private final boolean a(boolean param0, rsb param1) {
        int var3 = 0;
        tfa var4 = null;
        int var5 = VoidHunters.field_G;
        if (param0) {
            return true;
        }
        for (var3 = 0; (var3 ^ -1) > (param1.field_c.length ^ -1); var3++) {
            var4 = param1.a(var3, (byte) 59);
            if (var4.field_a) {
                if (54 == var4.field_b) {
                    return true;
                }
            }
        }
        return false;
    }

    final void a(Random param0, int param1, rsb param2) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        tfa var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        tfa var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        var16 = VoidHunters.field_G;
        var20 = new int[2];
        var19 = var20;
        var18 = var19;
        var17 = var18;
        var4 = var17;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        L0: while (true) {
          if (param2.field_c.length <= var7) {
            var7 = -var6 + var5;
            var8 = 0;
            L1: while (true) {
              if ((var8 ^ -1) <= (var7 ^ -1)) {
                L2: {
                  if (param1 == 2196) {
                    break L2;
                  } else {
                    field_h = null;
                    break L2;
                  }
                }
                return;
              } else {
                L3: {
                  var9 = var7 + -var8;
                  var10 = 0;
                  if (1 >= var9) {
                    break L3;
                  } else {
                    var10 = hob.a(param0, var9, 122);
                    break L3;
                  }
                }
                var11 = 0;
                var12 = 0;
                L4: while (true) {
                  if (param2.field_c.length <= var12) {
                    var8++;
                    continue L1;
                  } else {
                    L5: {
                      L6: {
                        var13 = param2.a(var12, (byte) 59);
                        var14 = var13.field_h;
                        if (var13.field_a) {
                          break L6;
                        } else {
                          if (-1 == (foa.field_p ^ -1)) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if ((var14 ^ -1) > -1) {
                          break L7;
                        } else {
                          if ((var20.length ^ -1) < (var14 ^ -1)) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (var11 == var10) {
                          var15 = ccb.a(param0, var20, (byte) -21, false);
                          var13.field_h = var15;
                          var4[var15] = var4[var15] + 1;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var11++;
                      break L5;
                    }
                    var12++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            L9: {
              L10: {
                var8_ref = param2.a(var7, (byte) 59);
                if (var8_ref.field_a) {
                  break L10;
                } else {
                  if (-1 != (foa.field_p ^ -1)) {
                    break L10;
                  } else {
                    break L9;
                  }
                }
              }
              var5++;
              var9 = var8_ref.field_h;
              if (var9 < 0) {
                break L9;
              } else {
                if ((var9 ^ -1) > (var20.length ^ -1)) {
                  var6++;
                  var4[var9] = var4[var9] + 1;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            var7++;
            continue L0;
          }
        }
    }

    final void b(boolean param0) {
        nkb.a(param0, "Skipping phase countdown for " + ((lbb) this).field_d);
        ((lbb) this).field_e = 0;
        if (param0) {
            ((lbb) this).field_g = null;
        }
    }

    public final void b(faa param0, int param1) {
        faa var3 = null;
        et[] var4 = null;
        int var5 = 0;
        et[] var6 = null;
        int var7 = 0;
        et var8 = null;
        int var9 = 0;
        faa var10 = null;
        int stackIn_5_0 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        faa stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        faa stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        faa stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        faa stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        faa stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        faa stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        faa stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        faa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        faa stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        faa stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        faa stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        faa stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        faa stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        faa stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        var9 = VoidHunters.field_G;
        param0.a(-632, ((lbb) this).field_d, 32);
        param0.a(-632, ((lbb) this).field_e, 32);
        param0.a(-632, ((lbb) this).field_a, 32);
        param0.a(-632, ((lbb) this).field_b, 32);
        var10 = param0;
        var3 = var10;
        if (param1 < -109) {
          L0: {
            var4 = ((lbb) this).field_g;
            if (var4 == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = var4.length;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            var10.a(-632, var5, 8);
            if (0 != var5) {
              var6 = var4;
              var7 = 0;
              L2: while (true) {
                if (var6.length <= var7) {
                  break L1;
                } else {
                  L3: {
                    var8 = var6[var7];
                    stackOut_9_0 = (faa) var3;
                    stackOut_9_1 = 80;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (var8 == null) {
                      stackOut_11_0 = (faa) (Object) stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      break L3;
                    } else {
                      stackOut_10_0 = (faa) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      break L3;
                    }
                  }
                  L4: {
                    if (vq.a(stackIn_12_0, stackIn_12_1, stackIn_12_2 != 0)) {
                      stb.a(2, 1, var10, (tv) (Object) var8);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var7++;
                  continue L2;
                }
              }
            } else {
              break L1;
            }
          }
          L5: {
            stackOut_16_0 = (faa) param0;
            stackOut_16_1 = 99;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (((lbb) this).field_i == null) {
              stackOut_18_0 = (faa) (Object) stackIn_18_0;
              stackOut_18_1 = stackIn_18_1;
              stackOut_18_2 = 0;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (faa) (Object) stackIn_17_0;
              stackOut_17_1 = stackIn_17_1;
              stackOut_17_2 = 1;
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            if (vq.a(stackIn_19_0, stackIn_19_1, stackIn_19_2 != 0)) {
              ((lbb) this).field_i.b(param0, -112);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = 8;
            stackIn_24_0 = stackOut_22_0;
            stackIn_23_0 = stackOut_22_0;
            if (((lbb) this).field_j != null) {
              stackOut_24_0 = stackIn_24_0;
              stackOut_24_1 = ((lbb) this).field_j.length;
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              break L7;
            } else {
              stackOut_23_0 = stackIn_23_0;
              stackOut_23_1 = 0;
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              break L7;
            }
          }
          L8: {
            pgb.a(stackIn_25_0, stackIn_25_1, 76, param0, ((lbb) this).field_j);
            stackOut_25_0 = (faa) param0;
            stackOut_25_1 = 84;
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (((lbb) this).field_f == null) {
              stackOut_27_0 = (faa) (Object) stackIn_27_0;
              stackOut_27_1 = stackIn_27_1;
              stackOut_27_2 = 0;
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (faa) (Object) stackIn_26_0;
              stackOut_26_1 = stackIn_26_1;
              stackOut_26_2 = 1;
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          L9: {
            if (vq.a(stackIn_28_0, stackIn_28_1, stackIn_28_2 != 0)) {
              ((lbb) this).field_f.b(param0, -126);
              break L9;
            } else {
              break L9;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param0 != 2) {
            ((lbb) this).field_j = null;
        }
        et var6 = ((lbb) this).c(-1, param2);
        et var7 = var6;
        if (!(var7 == null)) {
            var7.field_a = param1;
        }
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 < 15) {
            return true;
        }
        return wh.a(param0, (byte) 99, param1) & (((param1 & 8192) != 0 ? true : false) | bla.a(param1, false, param0) | hsb.a(param0, 65536, param1));
    }

    public final boolean a(byte param0, tv param1) {
        int var4 = 0;
        lbb var5 = null;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_28_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          L1: {
            var5 = (lbb) (Object) param1;
            var4 = 97 / ((param0 - 22) / 59);
            if ((var5.field_d ^ -1) != (var5.field_d ^ -1)) {
              break L1;
            } else {
              if (var5.field_e != var5.field_e) {
                break L1;
              } else {
                if (var5.field_a != var5.field_a) {
                  break L1;
                } else {
                  if (var5.field_b != var5.field_b) {
                    break L1;
                  } else {
                    if (dn.a((tv[]) (Object) var5.field_g, false, 1, (tv[]) (Object) var5.field_g, -22)) {
                      break L1;
                    } else {
                      L2: {
                        if (var5.field_i != null) {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          break L2;
                        } else {
                          stackOut_6_0 = 1;
                          stackIn_8_0 = stackOut_6_0;
                          break L2;
                        }
                      }
                      L3: {
                        stackOut_8_0 = stackIn_8_0;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var5.field_i != null) {
                          stackOut_10_0 = stackIn_10_0;
                          stackOut_10_1 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          break L3;
                        } else {
                          stackOut_9_0 = stackIn_9_0;
                          stackOut_9_1 = 1;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          break L3;
                        }
                      }
                      if ((stackIn_11_0 ^ stackIn_11_1) != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (var5.field_i == null) {
                            break L4;
                          } else {
                            if (var5.field_i.a((byte) -74, (tv) (Object) var5.field_i)) {
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (wpb.a(var5.field_j, var5.field_j, (byte) 28)) {
                          break L1;
                        } else {
                          L5: {
                            if (null != var5.field_f) {
                              stackOut_18_0 = 0;
                              stackIn_19_0 = stackOut_18_0;
                              break L5;
                            } else {
                              stackOut_17_0 = 1;
                              stackIn_19_0 = stackOut_17_0;
                              break L5;
                            }
                          }
                          L6: {
                            stackOut_19_0 = stackIn_19_0;
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_20_0 = stackOut_19_0;
                            if (var5.field_f != null) {
                              stackOut_21_0 = stackIn_21_0;
                              stackOut_21_1 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              stackIn_22_1 = stackOut_21_1;
                              break L6;
                            } else {
                              stackOut_20_0 = stackIn_20_0;
                              stackOut_20_1 = 1;
                              stackIn_22_0 = stackOut_20_0;
                              stackIn_22_1 = stackOut_20_1;
                              break L6;
                            }
                          }
                          if ((stackIn_22_0 ^ stackIn_22_1) != 0) {
                            break L1;
                          } else {
                            L7: {
                              if (var5.field_f == null) {
                                break L7;
                              } else {
                                if (!var5.field_f.a((byte) -57, (tv) (Object) var5.field_f)) {
                                  break L7;
                                } else {
                                  break L1;
                                }
                              }
                            }
                            stackOut_27_0 = 0;
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_26_0 = 1;
          stackIn_28_0 = stackOut_26_0;
          break L0;
        }
        return stackIn_28_0 != 0;
    }

    final int d(int param0) {
        if (param0 != 6472) {
            Object var3 = null;
            this.a((int[]) null, false);
        }
        return ((lbb) this).field_i.field_b;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -8) {
            ((lbb) this).b(54, -62, 111);
        }
        int var4 = ((lbb) this).b(7061, param2);
        ((lbb) this).b(2, var4 - -param1, param2);
    }

    private final void a(rsb param0, byte param1, int param2) {
        int var6 = 0;
        tfa var8 = null;
        int var9 = 0;
        int var10 = VoidHunters.field_G;
        int var4 = -2147483648;
        int var5 = -1;
        int var7 = 28 / ((-37 - param1) / 47);
        for (var6 = 0; param0.field_c.length > var6; var6++) {
            var8 = param0.a(var6, (byte) 59);
            if (var8.a((byte) -43)) {
                if (!((param2 ^ -1) != (var8.field_h ^ -1))) {
                    var9 = var8.field_n + var8.field_c;
                    if (!((var4 ^ -1) <= (var9 ^ -1))) {
                        var5 = var9;
                        var5 = var6;
                    }
                }
            }
        }
        if (-1 >= (var5 ^ -1)) {
            param0.a(var5, (byte) 59).a(255);
        }
    }

    final void a(int param0) {
        if (param0 < 125) {
            return;
        }
        nkb.a(false, "Extending phase countdown for " + ((lbb) this).field_d);
        ((lbb) this).field_e = ((lbb) this).field_e + 600 * oq.field_l;
    }

    final et a(int param0, int param1) {
        if (param0 != -31634) {
            Object var4 = null;
            this.a((int[]) null, false);
        }
        if (null == ((lbb) this).field_g) {
            return null;
        }
        if (0 > param1) {
            return null;
        }
        if ((((lbb) this).field_g.length ^ -1) >= (param1 ^ -1)) {
            return null;
        }
        if (((lbb) this).field_g[param1] == null) {
            return null;
        }
        return ((lbb) this).field_g[param1];
    }

    private final int[] a(byte param0, rsb param1) {
        int var4 = 0;
        tfa var5 = null;
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        int[] var3 = new int[2];
        for (var4 = 0; (param1.field_c.length ^ -1) < (var4 ^ -1); var4++) {
            var5 = param1.a(var4, (byte) 59);
            if (!(!var5.a((byte) -119))) {
                var6 = var5.field_h;
                if ((var6 ^ -1) <= -1) {
                    if ((var6 ^ -1) > (var3.length ^ -1)) {
                        var3[var6] = var3[var6] + 1;
                    }
                }
            }
        }
        if (param0 != -63) {
            return null;
        }
        return var3;
    }

    final int[] c(boolean param0) {
        if (!param0) {
            Object var3 = null;
            this.a((int[]) null, true);
        }
        return ((lbb) this).field_i.field_c;
    }

    final int f(byte param0) {
        if (param0 >= -87) {
            ((lbb) this).field_a = -116;
        }
        return ((lbb) this).field_a;
    }

    public final void b(byte param0, tv param1) {
        int var4 = VoidHunters.field_G;
        lbb var5 = (lbb) (Object) param1;
        var5.field_b = var5.field_b;
        var5.field_a = var5.field_a;
        var5.field_d = var5.field_d;
        var5.field_e = var5.field_e;
        if (param0 <= 54) {
            ((lbb) this).field_a = 126;
        }
        var5.field_g = (et[]) (Object) sqb.a((tv[]) (Object) var5.field_g, (tv[]) (Object) var5.field_g, 1, mja.field_p, false);
        if (var5.field_i != null) {
            if (null == var5.field_i) {
                var5.field_i = new qdb();
            }
            var5.field_i.b((byte) 98, (tv) (Object) var5.field_i);
        } else {
            var5.field_i = null;
        }
        var5.field_j = dob.a(var5.field_j, (byte) -57, var5.field_j);
        if (null == var5.field_f) {
            var5.field_f = null;
        } else {
            if (var5.field_f == null) {
                var5.field_f = new qqb();
            }
            var5.field_f.b((byte) 64, (tv) (Object) var5.field_f);
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            boolean discarded$0 = lbb.a(111, -111, (byte) -58);
        }
        field_c = null;
        field_h = null;
    }

    private final int a(byte param0) {
        if (param0 != 120) {
            return 73;
        }
        return ((lbb) this).field_i.field_d;
    }

    final boolean c(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 1) {
          L0: {
            L1: {
              if (!((lbb) this).f(24416)) {
                break L1;
              } else {
                if (uaa.a(((lbb) this).d(param0 + 6471), 103) <= 1) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final boolean f(int param0) {
        if (param0 != 24416) {
            field_h = null;
        }
        return ((lbb) this).field_i != null ? true : false;
    }

    private final void a(int param0, byte param1, int param2, rsb param3, int param4, int param5) {
        int var8 = 0;
        tfa var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = VoidHunters.field_G;
        int var7 = 0;
        int var9 = -90 % ((-72 - param1) / 52);
        for (var8 = 0; var8 < param3.field_c.length; var8++) {
            var10 = param3.a(var8, (byte) 59);
            if (!(!var10.field_a)) {
                var11 = var10.a(param5, 11863, param5);
                var12 = var10.a(param4, 11863, param0);
                if ((var11 ^ -1) == -1) {
                    if ((param2 ^ -1) < (var12 ^ -1)) {
                        var7 = 1;
                        break;
                    }
                }
            }
        }
        if (!(var7 != 0)) {
            ((lbb) this).field_e = ((lbb) this).field_e - 16;
            if (!((((lbb) this).field_e ^ -1) <= -1)) {
                ((lbb) this).field_e = 0;
            }
        }
    }

    final void b(boolean param0, int param1) {
        wna var3 = null;
        if (!(((lbb) this).field_d != 5)) {
            ((lbb) this).field_b = param1;
            if (null != ((lbb) this).field_f) {
                var3 = new wna();
                var3.field_b = ((lbb) this).field_a;
                var3.field_d = ((lbb) this).field_b;
                ((lbb) this).field_f.a(126, var3);
            }
            ((lbb) this).c(6, -7, oq.field_l * 10);
        }
        if (param0) {
            Object var4 = null;
            boolean discarded$0 = ((lbb) this).a((byte) -35, (tv) null);
        }
    }

    final int b(int param0, int param1) {
        if (param0 != 7061) {
            return -10;
        }
        if (null != ((lbb) this).field_g) {
            if ((param1 ^ -1) <= -1) {
                if (param1 < ((lbb) this).field_g.length) {
                    if (null == ((lbb) this).field_g[param1]) {
                        return 0;
                    }
                    return ((lbb) this).field_g[param1].field_a;
                }
            }
        }
        return 0;
    }

    final int a(boolean param0, int param1) {
        Object var4 = null;
        L0: {
          if (!param0) {
            break L0;
          } else {
            var4 = null;
            boolean discarded$2 = ((lbb) this).a((byte) 66, (tv) null);
            break L0;
          }
        }
        if (-1 < (param1 ^ -1)) {
          return 0;
        } else {
          if (param1 < ((lbb) this).field_j.length) {
            return ((lbb) this).field_j[param1];
          } else {
            return 0;
          }
        }
    }

    private final void b(int param0) {
        if (!(((lbb) this).field_i != null)) {
            return;
        }
        ((lbb) this).field_i.field_f = ((lbb) this).field_i.field_f - 1;
        if (!(param0 > (((lbb) this).field_i.field_f ^ -1))) {
            ((lbb) this).field_i = null;
        }
    }

    final et c(int param0, int param1) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        if ((param1 ^ -1) > param0) {
            return null;
        }
        if (null != ((lbb) this).field_g) {
            if ((((lbb) this).field_g.length ^ -1) < (param1 ^ -1)) {
                return ((lbb) this).field_g[param1];
            }
        }
        if (null == ((lbb) this).field_g) {
            ((lbb) this).field_g = new et[1 + param1];
            ((lbb) this).field_g[param1] = new et();
            return ((lbb) this).field_g[param1];
        }
        et[] var6 = new et[1 + param1];
        et[] var3 = var6;
        for (var4 = 0; (var4 ^ -1) > (((lbb) this).field_g.length ^ -1); var4++) {
            var6[var4] = ((lbb) this).field_g[var4];
        }
        var3[param1] = new et();
        ((lbb) this).field_g = var3;
        return ((lbb) this).field_g[param1];
    }

    private final int[] a(rsb param0, byte param1) {
        tfa var6 = null;
        int var7 = 0;
        int var8 = VoidHunters.field_G;
        int[] var9 = new int[31];
        int[] var3 = var9;
        int var4 = 0;
        int var5 = 126 / ((-8 - param1) / 48);
        while ((var4 ^ -1) > (param0.field_c.length ^ -1)) {
            var6 = param0.a(var4, (byte) 59);
            if (var6.field_a) {
                if (var6.field_i != null) {
                    if ((var6.field_i.length ^ -1) < -1) {
                        for (var7 = 0; var7 < var6.field_i.length; var7++) {
                            if ((var6.field_i[var7] ^ -1) <= -1) {
                                var9[var6.field_i[var7]] = var9[var6.field_i[var7]] + 1;
                            }
                        }
                    }
                }
            }
            var4++;
        }
        return var9;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 1) {
            ((lbb) this).a(-126);
        }
        ((lbb) this).field_i = new qdb();
        ((lbb) this).field_i.field_d = param0;
        ((lbb) this).field_i.field_b = param2;
        ((lbb) this).field_i.field_f = uaa.a(param2, param1 ^ 57);
        ((lbb) this).field_f = new qqb();
    }

    final qqb b(byte param0) {
        if (param0 > -45) {
            return null;
        }
        return ((lbb) this).field_f;
    }

    private final void b(int param0, rsb param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        L0: {
          var8 = VoidHunters.field_G;
          var9 = this.a((byte) -63, param1);
          var3 = var9;
          var4 = -var9[1] + var9[0];
          var5 = param0;
          if ((var4 ^ -1) < -2) {
            var5 = 0;
            break L0;
          } else {
            if (var4 < -1) {
              var5 = 1;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (0 == (var5 ^ -1)) {
            break L1;
          } else {
            var6 = Math.abs(var4) / 2;
            var7 = 0;
            L2: while (true) {
              if ((var7 ^ -1) <= (var6 ^ -1)) {
                break L1;
              } else {
                this.a(param1, (byte) -128, var5);
                var7++;
                continue L2;
              }
            }
          }
        }
    }

    private final void a(int[] param0, boolean param1) {
        ((lbb) this).field_i.field_c = param0;
        if (param1) {
            Object var4 = null;
            ((lbb) this).a((faa) null, false);
        }
    }

    final int e(int param0) {
        if (param0 != 8) {
            return -38;
        }
        return ((lbb) this).field_d;
    }

    final et[] d(boolean param0) {
        if (param0) {
            int discarded$0 = ((lbb) this).d(53);
        }
        return ((lbb) this).field_g;
    }

    public final void a(faa param0, boolean param1) {
        int var4 = VoidHunters.field_G;
        ((lbb) this).field_d = param0.i(0, 32);
        ((lbb) this).field_e = param0.i(0, 32);
        ((lbb) this).field_a = param0.i(0, 32);
        ((lbb) this).field_b = param0.i(0, 32);
        ((lbb) this).field_g = (et[]) (Object) kcb.a(8, mja.field_p, param0, 1, -128, (tv[]) (Object) ((lbb) this).field_g);
        if (!kv.a(false, param0)) {
            ((lbb) this).field_i = null;
        } else {
            if (null == ((lbb) this).field_i) {
                ((lbb) this).field_i = new qdb();
            }
            ((lbb) this).field_i.a(param0, false);
        }
        ((lbb) this).field_j = wkb.a((byte) 37, ((lbb) this).field_j, param0, 8);
        if (!kv.a(param1, param0)) {
            ((lbb) this).field_f = null;
        } else {
            if (((lbb) this).field_f == null) {
                ((lbb) this).field_f = new qqb();
            }
            ((lbb) this).field_f.a(param0, false);
        }
    }

    final void a(rsb param0, int param1, byte param2) {
        int var5 = 0;
        int[] var5_ref_int__ = null;
        Random var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int[] var11 = null;
        int[] var13 = null;
        pe var14 = null;
        hkb var15 = null;
        hkb var16 = null;
        int[] var19 = null;
        int[] var22 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int stackIn_74_0 = 0;
        int stackIn_78_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          if ((((lbb) this).field_e ^ -1) >= -1) {
            break L0;
          } else {
            ((lbb) this).field_e = ((lbb) this).field_e - 1;
            break L0;
          }
        }
        L1: {
          var14 = param0.field_g;
          ((lbb) this).field_a = ((lbb) this).field_a + 1;
          if (param2 == -19) {
            break L1;
          } else {
            var10 = null;
            ((lbb) this).a((rsb) null, -55, (byte) 8);
            break L1;
          }
        }
        L2: {
          if ((qrb.field_a ^ -1) != -2) {
            break L2;
          } else {
            if (5 == ((lbb) this).field_d) {
              break L2;
            } else {
              var5 = 0;
              L3: while (true) {
                if ((var5 ^ -1) <= (param0.field_c.length ^ -1)) {
                  break L2;
                } else {
                  param0.a(var5, (byte) 59).field_g = null;
                  var5++;
                  continue L3;
                }
              }
            }
          }
        }
        L4: {
          if (((lbb) this).field_d == 0) {
            if ((((lbb) this).field_e ^ -1) != -1) {
              break L4;
            } else {
              L5: {
                if (!ahb.a(param0, (byte) -106)) {
                  stackOut_73_0 = 0;
                  stackIn_74_0 = stackOut_73_0;
                  break L5;
                } else {
                  stackOut_72_0 = 1;
                  stackIn_74_0 = stackOut_72_0;
                  break L5;
                }
              }
              L6: {
                var5 = stackIn_74_0;
                if (var5 != 0) {
                  break L6;
                } else {
                  L7: {
                    if (!this.a(false, param0)) {
                      stackOut_77_0 = 0;
                      stackIn_78_0 = stackOut_77_0;
                      break L7;
                    } else {
                      stackOut_76_0 = 1;
                      stackIn_78_0 = stackOut_76_0;
                      break L7;
                    }
                  }
                  var5 = stackIn_78_0;
                  break L6;
                }
              }
              if (var5 != 0) {
                if (((lbb) this).f(24416)) {
                  ((lbb) this).c(3, -7, oq.field_j);
                  break L4;
                } else {
                  ((lbb) this).c(1, -7, oq.field_h);
                  break L4;
                }
              } else {
                break L4;
              }
            }
          } else {
            if (((lbb) this).field_d != 1) {
              if (-3 == (((lbb) this).field_d ^ -1)) {
                L8: {
                  if (0 >= ((lbb) this).field_e) {
                    break L8;
                  } else {
                    this.a(30, (byte) -128, ena.field_q, param0, 14, -2);
                    break L8;
                  }
                }
                if (-1 == (((lbb) this).field_e ^ -1)) {
                  var26 = this.a(param0, (byte) -95);
                  this.a(var26, false);
                  if (!qab.a(82, ((lbb) this).field_i.field_b)) {
                    ((lbb) this).c(3, -7, oq.field_j);
                    ((lbb) this).field_e = 0;
                    break L4;
                  } else {
                    ((lbb) this).c(3, -7, oq.field_j);
                    break L4;
                  }
                } else {
                  break L4;
                }
              } else {
                if (((lbb) this).field_d != 3) {
                  if (-6 != (((lbb) this).field_d ^ -1)) {
                    if (((lbb) this).field_d != 6) {
                      break L4;
                    } else {
                      if (0 == ((lbb) this).field_e) {
                        L9: {
                          if (null == ((lbb) this).field_f) {
                            break L9;
                          } else {
                            if (((lbb) this).f(24416)) {
                              break L9;
                            } else {
                              if (!qab.a(81, var14.d(false))) {
                                break L9;
                              } else {
                                var5 = ((lbb) this).field_f.a(true);
                                if (0 > var5) {
                                  break L9;
                                } else {
                                  if (((lbb) this).field_j.length <= var5) {
                                    break L9;
                                  } else {
                                    ((lbb) this).field_j[var5] = ((lbb) this).field_j[var5] + 1;
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L10: {
                          if (unb.field_o) {
                            var16 = pba.b(false).a(3, false);
                            var16.a(true, param0, param2 ^ -112);
                            break L10;
                          } else {
                            var15 = bkb.a(0);
                            var15.a(true, param0, param2 ^ 104);
                            break L10;
                          }
                        }
                        ((lbb) this).c(0, param2 ^ 20, oq.field_l * 1);
                        if (0 == qv.field_o) {
                          var5 = 0;
                          L11: while (true) {
                            if (var5 >= param0.field_c.length) {
                              break L4;
                            } else {
                              param0.a(var5, (byte) 59).field_h = -1;
                              var5++;
                              continue L11;
                            }
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    var14.a((byte) 127, param0);
                    if (!this.a(false, param0)) {
                      break L4;
                    } else {
                      ((lbb) this).b(false, -1);
                      break L4;
                    }
                  }
                } else {
                  L12: {
                    if (1 == dcb.field_f) {
                      var25 = new int[2];
                      var22 = var25;
                      var19 = var22;
                      var13 = var19;
                      var11 = var13;
                      var5_ref_int__ = var11;
                      var6 = 1;
                      var7 = 0;
                      L13: while (true) {
                        if (param0.field_c.length <= var7) {
                          if (var6 == 0) {
                            break L12;
                          } else {
                            if (-1 <= (((lbb) this).field_e ^ -1)) {
                              break L12;
                            } else {
                              ((lbb) this).field_e = ((lbb) this).field_e - 1;
                              break L12;
                            }
                          }
                        } else {
                          L14: {
                            L15: {
                              if (param0.field_c[var7].field_a) {
                                break L15;
                              } else {
                                if ((foa.field_p ^ -1) == -1) {
                                  break L14;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            L16: {
                              var25 = var22;
                              var8 = param0.a(var7, (byte) 59).field_h;
                              if (-1 < (var8 ^ -1)) {
                                break L16;
                              } else {
                                if (var8 < var25.length) {
                                  var11[var8] = var11[var8] + 1;
                                  break L14;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            var6 = 0;
                            break L14;
                          }
                          var7++;
                          continue L13;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                  L17: {
                    if ((((lbb) this).field_e ^ -1) != -1) {
                      break L17;
                    } else {
                      this.a(0, param0);
                      break L17;
                    }
                  }
                  var14.a((byte) 127, param0);
                  break L4;
                }
              }
            } else {
              L18: {
                if (((lbb) this).field_e <= 0) {
                  break L18;
                } else {
                  this.a(13, (byte) -126, sl.field_a, param0, 0, -1);
                  break L18;
                }
              }
              if (-1 == (((lbb) this).field_e ^ -1)) {
                var5 = param1;
                var6_ref = new Random((long)var5);
                var24 = this.a(param0, (byte) -96);
                var8 = 0;
                L19: while (true) {
                  if (var24.length <= var8) {
                    var8 = sj.a(-126, 14, var6_ref, true, var24);
                    ((lbb) this).a(var5, 1, var8);
                    ((lbb) this).c(2, -7, oq.field_z);
                    break L4;
                  } else {
                    L20: {
                      if (!tla.b(param2 ^ -110, var8)) {
                        var24[var8] = -1;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    var8++;
                    continue L19;
                  }
                }
              } else {
                break L4;
              }
            }
          }
        }
    }

    public lbb() {
        ((lbb) this).field_j = new int[unb.field_p];
        ((lbb) this).field_e = 1 * oq.field_l;
        ((lbb) this).field_g = null;
        ((lbb) this).field_d = 0;
        ((lbb) this).field_a = 0;
        ((lbb) this).field_b = -1;
    }

    final void c(int param0, int param1, int param2) {
        ((lbb) this).field_d = param0;
        ((lbb) this).field_e = param2;
        if (!(param1 == (((lbb) this).field_d ^ -1))) {
            ((lbb) this).field_g = null;
        }
        ((lbb) this).field_a = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Email (Login):";
        field_c = "Scale down map height";
    }
}
