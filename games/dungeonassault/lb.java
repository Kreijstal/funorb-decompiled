/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    int field_w;
    static cn field_C;
    int field_i;
    int field_K;
    static cn field_o;
    static String field_O;
    static cn field_v;
    int field_r;
    int field_u;
    private long[] field_c;
    private int[] field_n;
    int[] field_J;
    ai[] field_L;
    int field_l;
    private int[] field_M;
    wm field_k;
    static String field_E;
    boolean field_H;
    int field_b;
    int field_g;
    int field_e;
    int field_q;
    int field_h;
    int field_B;
    int field_N;
    int[] field_F;
    private int[] field_G;
    long[] field_t;
    int field_m;
    int field_p;
    static String[] field_d;
    static String field_x;
    int field_D;
    int field_A;
    int field_I;
    private long[] field_j;
    hb[] field_a;
    int field_f;
    int field_y;
    int field_z;
    int field_s;

    final static void a(boolean param0) {
        int var1 = 0;
        hb var2 = null;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        if (param0) {
          var1 = 0;
          L0: while (true) {
            if (8 <= var1) {
              return;
            } else {
              var2 = um.field_i[var1];
              if (var2 != null) {
                var2.field_i = qe.a(var2, 0);
                var1++;
                continue L0;
              } else {
                var1++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(ec param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var7 = DungeonAssault.field_K;
          var4 = param0.c(true);
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((var4 & 1) == 0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((lb) this).field_H = stackIn_3_1 != 0;
          if ((param2 ^ -1) > -20) {
            ((lb) this).field_N = param0.f(-121);
            break L1;
          } else {
            ((lb) this).field_N = param0.h(-46);
            break L1;
          }
        }
        L2: {
          if (param2 < 1) {
            int discarded$4 = param0.f(-127);
            ((lb) this).field_s = param0.f(-106);
            ((lb) this).field_m = ((lb) this).field_N;
            ((lb) this).field_l = ((lb) this).field_N;
            ((lb) this).field_b = 0;
            break L2;
          } else {
            L3: {
              if ((param2 ^ -1) <= -20) {
                ((lb) this).field_l = param0.h(param1 ^ 13077);
                ((lb) this).field_s = param0.h(-107);
                ((lb) this).field_m = param0.h(-35);
                break L3;
              } else {
                ((lb) this).field_l = param0.f(-128);
                ((lb) this).field_s = param0.f(-98);
                if (param2 < 5) {
                  ((lb) this).field_m = ((lb) this).field_N;
                  break L3;
                } else {
                  ((lb) this).field_m = param0.f(-114);
                  break L3;
                }
              }
            }
            ((lb) this).field_b = -((lb) this).field_N + ((lb) this).field_l;
            break L2;
          }
        }
        L4: {
          if (param2 >= 6) {
            int discarded$5 = param0.h(-78);
            ((lb) this).field_q = param0.h(param1 + 13099);
            break L4;
          } else {
            ((lb) this).field_q = -1;
            break L4;
          }
        }
        L5: {
          if (param2 >= 8) {
            ((lb) this).field_K = param0.c(true);
            break L5;
          } else {
            ((lb) this).field_K = 0;
            break L5;
          }
        }
        L6: {
          ((lb) this).field_B = param0.f(-122);
          ((lb) this).field_h = param0.f(-119);
          ((lb) this).field_D = param0.k(0);
          ((lb) this).field_y = param0.f(param1 + 13077);
          ((lb) this).field_r = param0.f(-121);
          ((lb) this).field_I = param0.k(0);
          if (-3 < param2) {
            ((lb) this).field_w = ek.field_c;
            break L6;
          } else {
            ((lb) this).field_w = rm.a(param0, 6065);
            break L6;
          }
        }
        L7: {
          if (-5 > param2) {
            break L7;
          } else {
            int discarded$6 = param0.c(true);
            break L7;
          }
        }
        var5 = 0;
        L8: while (true) {
          if (var5 >= ((lb) this).field_k.field_f.length) {
            ((lb) this).field_L = new ai[49];
            ((lb) this).field_L[24] = new ai(2);
            ((lb) this).field_L[48] = new ai(3);
            ((lb) this).field_L[42] = new ai(3);
            ((lb) this).field_L[6] = new ai(3);
            ((lb) this).field_L[0] = new ai(3);
            var5 = 0;
            L9: while (true) {
              if (-50 >= var5) {
                ((lb) this).field_a = new hb[8];
                var5 = 0;
                L10: while (true) {
                  if (8 <= var5) {
                    ((lb) this).field_F = new int[6];
                    ((lb) this).field_e = 0;
                    if (param1 == -13182) {
                      L11: {
                        ((lb) this).field_J = new int[6];
                        if (13 > param2) {
                          var5 = 0;
                          L12: while (true) {
                            if (-7 >= (var5 ^ -1)) {
                              var5 = 0;
                              L13: while (true) {
                                if (var5 >= 6) {
                                  ((lb) this).field_f = 0;
                                  ((lb) this).field_z = 0;
                                  ((lb) this).field_A = -1;
                                  break L11;
                                } else {
                                  ((lb) this).field_F[var5] = 0;
                                  var5++;
                                  continue L13;
                                }
                              }
                            } else {
                              ((lb) this).field_J[var5] = 0;
                              var5++;
                              continue L12;
                            }
                          }
                        } else {
                          var5 = 0;
                          L14: while (true) {
                            if ((var5 ^ -1) <= -7) {
                              var5 = 0;
                              L15: while (true) {
                                if (var5 >= 6) {
                                  ((lb) this).field_f = param0.k(param1 + 13182);
                                  ((lb) this).field_A = param0.h(-75);
                                  ((lb) this).field_z = param0.c(true);
                                  break L11;
                                } else {
                                  var6 = param0.c(true);
                                  ((lb) this).field_F[var5] = var6;
                                  ((lb) this).field_e = ((lb) this).field_e + var6;
                                  var5++;
                                  continue L15;
                                }
                              }
                            } else {
                              ((lb) this).field_J[var5] = param0.k(0);
                              var5++;
                              continue L14;
                            }
                          }
                        }
                      }
                      var5 = 0;
                      L16: while (true) {
                        if (10 <= var5) {
                          var5 = 0;
                          L17: while (true) {
                            if (var5 <= -11) {
                              var5 = 0;
                              L18: while (true) {
                                if (-11 >= (var5 ^ -1)) {
                                  L19: {
                                    if ((param2 ^ -1) > -15) {
                                      var5 = 0;
                                      L20: while (true) {
                                        if (10 <= var5) {
                                          break L19;
                                        } else {
                                          ((lb) this).field_j[var5] = -1L;
                                          ((lb) this).field_M[var5] = -1;
                                          var5++;
                                          continue L20;
                                        }
                                      }
                                    } else {
                                      var5 = 0;
                                      L21: while (true) {
                                        if ((var5 ^ -1) <= -11) {
                                          break L19;
                                        } else {
                                          ((lb) this).field_j[var5] = param0.c((byte) 63);
                                          if (param2 >= 15) {
                                            ((lb) this).field_M[var5] = param0.h(-74);
                                            var5++;
                                            continue L21;
                                          } else {
                                            ((lb) this).field_M[var5] = -1;
                                            var5++;
                                            continue L21;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L22: {
                                    if ((param2 ^ -1) > -19) {
                                      break L22;
                                    } else {
                                      ((lb) this).field_u = param0.c(true);
                                      int discarded$7 = param0.k(0);
                                      ((lb) this).field_g = param0.h(-125);
                                      ((lb) this).field_i = param0.h(-76);
                                      ((lb) this).field_p = param0.h(param1 ^ 13114);
                                      break L22;
                                    }
                                  }
                                  return;
                                } else {
                                  L23: {
                                    if (-1L != (((lb) this).field_c[var5] ^ -1L)) {
                                      break L23;
                                    } else {
                                      ((lb) this).field_c[var5] = -1L;
                                      ((lb) this).field_G[var5] = 0;
                                      break L23;
                                    }
                                  }
                                  if (0L == ((lb) this).field_t[var5]) {
                                    ((lb) this).field_t[var5] = -1L;
                                    ((lb) this).field_n[var5] = 0;
                                    var5++;
                                    continue L18;
                                  } else {
                                    var5++;
                                    continue L18;
                                  }
                                }
                              }
                            } else {
                              ((lb) this).field_t[var5] = param0.c((byte) 113);
                              if (-11 > param2) {
                                ((lb) this).field_n[var5] = 0;
                                var5++;
                                continue L17;
                              } else {
                                ((lb) this).field_n[var5] = param0.e((byte) -87);
                                var5++;
                                continue L17;
                              }
                            }
                          }
                        } else {
                          ((lb) this).field_c[var5] = param0.c((byte) 56);
                          if ((param2 ^ -1) <= -11) {
                            ((lb) this).field_G[var5] = param0.e((byte) 114);
                            var5++;
                            continue L16;
                          } else {
                            ((lb) this).field_G[var5] = 0;
                            var5++;
                            continue L16;
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    ((lb) this).field_a[var5] = ai.a(param0, var5, -12, param2);
                    var5++;
                    continue L10;
                  }
                }
              } else {
                if (-1 != var5) {
                  if (var5 != 6) {
                    if (var5 != -25) {
                      if (var5 != 42) {
                        if (-49 != var5) {
                          ((lb) this).field_L[var5] = gk.a(param0, (byte) -36);
                          var5++;
                          continue L9;
                        } else {
                          var5++;
                          continue L9;
                        }
                      } else {
                        var5++;
                        continue L9;
                      }
                    } else {
                      var5++;
                      continue L9;
                    }
                  } else {
                    var5++;
                    continue L9;
                  }
                } else {
                  var5++;
                  continue L9;
                }
              }
            }
          } else {
            ((lb) this).field_k.field_f[var5] = param0.h(md.b(param1, 13096));
            var5++;
            continue L8;
          }
        }
    }

    public static void a(byte param0) {
        field_E = null;
        field_C = null;
        field_O = null;
        field_x = null;
        field_o = null;
        field_d = null;
        if (param0 <= 3) {
            lb.a((byte) 82);
        }
        field_v = null;
    }

    final static void a(se param0, se param1, int param2, int param3) {
        wa.field_l = param2;
        i.field_x = param0;
        n.field_c = param1;
        wm.a((byte) -52, gf.field_i / 2, gf.field_c / param3);
        mi.a(param0.field_N, 25570, param0.field_E + param0.field_N, param1.field_N, param1.field_N - -param1.field_E);
    }

    lb(ec param0, int param1) {
        this();
        this.a(param0, -13182, param1);
    }

    final static char a(char param0, int param1) {
        if (param0 != 181) {
            // if_icmpeq L18
        } else {
            return param0;
        }
        if (param1 < 44) {
            char discarded$0 = lb.a('ﾞ', 95);
        }
        return Character.toTitleCase(param0);
    }

    lb() {
        int var1 = 0;
        long[] var2 = null;
        int var3 = 0;
        ((lb) this).field_n = new int[10];
        ((lb) this).field_M = new int[10];
        ((lb) this).field_G = new int[10];
        ((lb) this).field_p = -1;
        ((lb) this).field_t = new long[10];
        ((lb) this).field_c = new long[10];
        ((lb) this).field_j = new long[10];
        ((lb) this).field_w = ek.field_c;
        ((lb) this).field_b = 0;
        ((lb) this).field_m = 2500;
        ((lb) this).field_q = -1;
        ((lb) this).field_l = 2500;
        ((lb) this).field_s = 2500;
        ((lb) this).field_N = 2500;
        ((lb) this).field_k = new wm(84);
        ((lb) this).field_a = new hb[8];
        ((lb) this).field_L = new ai[49];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 49) {
            ((lb) this).field_J = new int[6];
            ((lb) this).field_F = new int[6];
            ((lb) this).field_A = -1;
            var1 = 0;
            L1: while (true) {
              if (var1 >= 10) {
                var1 = 0;
                L2: while (true) {
                  if (-11 >= (var1 ^ -1)) {
                    ((lb) this).field_u = 0;
                  } else {
                    ((lb) this).field_j[var1] = -1L;
                    ((lb) this).field_M[var1] = -1;
                    var1++;
                    continue L2;
                  }
                }
              } else {
                var2 = ((lb) this).field_c;
                var3 = var1;
                ((lb) this).field_t[var1] = -1L;
                var2[var3] = -1L;
                var1++;
                continue L1;
              }
            }
          } else {
            if (-25 != var1) {
              L3: {
                if (-1 == var1) {
                  break L3;
                } else {
                  if (6 == var1) {
                    break L3;
                  } else {
                    if (var1 == 42) {
                      break L3;
                    } else {
                      if ((var1 ^ -1) != -49) {
                        ((lb) this).field_L[var1] = new ai(0);
                        var1++;
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ((lb) this).field_L[var1] = new ai(3);
              var1++;
              continue L0;
            } else {
              ((lb) this).field_L[var1] = new ai(2);
              var1++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_E = "Previous";
        field_d = new String[]{null, "When a raider enters a room containing a monster, it will fight to the death. As the raider and monster exchange blows, the <%attack> of one is compared to the <%defence> of the other to see if the strike breaks through the other's guard."};
        field_x = "Regenerate when raider leaves.";
    }
}
