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
        int var1_int = 0;
        RuntimeException var1 = null;
        hb var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0) {
              var1_int = 0;
              L1: while (true) {
                if (8 <= var1_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var2 = um.field_i[var1_int];
                    if (var2 == null) {
                      break L2;
                    } else {
                      var2.field_i = qe.a(var2, 0);
                      break L2;
                    }
                  }
                  var1_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "lb.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(ec param0, int param1, int param2) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        ai dupTemp$8 = null;
        int discarded$9 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var4_int = param0.c(true);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if ((var4_int & 1) == 0) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((lb) (this)).field_H = stackIn_4_1 != 0;
              if ((param2 ^ -1) > -20) {
                this.field_N = param0.f(-121);
                break L2;
              } else {
                this.field_N = param0.h(-46);
                break L2;
              }
            }
            L3: {
              if (param2 < 1) {
                discarded$5 = param0.f(-127);
                this.field_s = param0.f(-106);
                this.field_m = this.field_N;
                this.field_l = this.field_N;
                this.field_b = 0;
                break L3;
              } else {
                L4: {
                  if ((param2 ^ -1) <= -20) {
                    this.field_l = param0.h(param1 ^ 13077);
                    this.field_s = param0.h(-107);
                    this.field_m = param0.h(-35);
                    break L4;
                  } else {
                    this.field_l = param0.f(-128);
                    this.field_s = param0.f(-98);
                    if (param2 < 5) {
                      this.field_m = this.field_N;
                      break L4;
                    } else {
                      this.field_m = param0.f(-114);
                      break L4;
                    }
                  }
                }
                this.field_b = -this.field_N + this.field_l;
                break L3;
              }
            }
            L5: {
              if (param2 >= 6) {
                discarded$6 = param0.h(-78);
                this.field_q = param0.h(param1 + 13099);
                break L5;
              } else {
                this.field_q = -1;
                break L5;
              }
            }
            L6: {
              if (param2 >= 8) {
                this.field_K = param0.c(true);
                break L6;
              } else {
                this.field_K = 0;
                break L6;
              }
            }
            L7: {
              this.field_B = param0.f(-122);
              this.field_h = param0.f(-119);
              this.field_D = param0.k(0);
              this.field_y = param0.f(param1 + 13077);
              this.field_r = param0.f(-121);
              this.field_I = param0.k(0);
              if (-3 < (param2 ^ -1)) {
                this.field_w = ek.field_c;
                break L7;
              } else {
                this.field_w = rm.a(param0, 6065);
                break L7;
              }
            }
            L8: {
              if (-5 < (param2 ^ -1)) {
                break L8;
              } else {
                discarded$7 = param0.c(true);
                break L8;
              }
            }
            var5 = 0;
            L9: while (true) {
              if (var5 >= this.field_k.field_f.length) {
                this.field_L = new ai[49];
                this.field_L[24] = new ai(2);
                dupTemp$8 = new ai(3);
                this.field_L[48] = dupTemp$8;
                this.field_L[42] = dupTemp$8;
                this.field_L[6] = dupTemp$8;
                this.field_L[0] = dupTemp$8;
                var5 = 0;
                L10: while (true) {
                  if (-50 >= (var5 ^ -1)) {
                    this.field_a = new hb[8];
                    var5 = 0;
                    L11: while (true) {
                      if (8 <= var5) {
                        this.field_F = new int[6];
                        this.field_e = 0;
                        if (param1 == -13182) {
                          L12: {
                            this.field_J = new int[6];
                            if (13 > param2) {
                              var5 = 0;
                              L13: while (true) {
                                if (-7 >= (var5 ^ -1)) {
                                  var5 = 0;
                                  L14: while (true) {
                                    if (var5 >= 6) {
                                      this.field_f = 0;
                                      this.field_z = 0;
                                      this.field_A = -1;
                                      break L12;
                                    } else {
                                      this.field_F[var5] = 0;
                                      var5++;
                                      continue L14;
                                    }
                                  }
                                } else {
                                  this.field_J[var5] = 0;
                                  var5++;
                                  continue L13;
                                }
                              }
                            } else {
                              var5 = 0;
                              L15: while (true) {
                                if ((var5 ^ -1) <= -7) {
                                  var5 = 0;
                                  L16: while (true) {
                                    if (var5 >= 6) {
                                      this.field_f = param0.k(param1 + 13182);
                                      this.field_A = param0.h(-75);
                                      this.field_z = param0.c(true);
                                      break L12;
                                    } else {
                                      var6 = param0.c(true);
                                      this.field_F[var5] = var6;
                                      this.field_e = this.field_e + var6;
                                      var5++;
                                      continue L16;
                                    }
                                  }
                                } else {
                                  this.field_J[var5] = param0.k(0);
                                  var5++;
                                  continue L15;
                                }
                              }
                            }
                          }
                          var5 = 0;
                          L17: while (true) {
                            if (10 <= var5) {
                              var5 = 0;
                              L18: while (true) {
                                if ((var5 ^ -1) <= -11) {
                                  var5 = 0;
                                  L19: while (true) {
                                    if (-11 >= (var5 ^ -1)) {
                                      L20: {
                                        if ((param2 ^ -1) > -15) {
                                          var5 = 0;
                                          L21: while (true) {
                                            if (10 <= var5) {
                                              break L20;
                                            } else {
                                              this.field_j[var5] = -1L;
                                              this.field_M[var5] = -1;
                                              var5++;
                                              continue L21;
                                            }
                                          }
                                        } else {
                                          var5 = 0;
                                          L22: while (true) {
                                            if ((var5 ^ -1) <= -11) {
                                              break L20;
                                            } else {
                                              L23: {
                                                this.field_j[var5] = param0.c((byte) 63);
                                                if (param2 >= 15) {
                                                  this.field_M[var5] = param0.h(-74);
                                                  break L23;
                                                } else {
                                                  this.field_M[var5] = -1;
                                                  break L23;
                                                }
                                              }
                                              var5++;
                                              continue L22;
                                            }
                                          }
                                        }
                                      }
                                      L24: {
                                        if ((param2 ^ -1) > -19) {
                                          break L24;
                                        } else {
                                          this.field_u = param0.c(true);
                                          discarded$9 = param0.k(0);
                                          this.field_g = param0.h(-125);
                                          this.field_i = param0.h(-76);
                                          this.field_p = param0.h(param1 ^ 13114);
                                          break L24;
                                        }
                                      }
                                      decompiledRegionSelector0 = 1;
                                      break L0;
                                    } else {
                                      L25: {
                                        if (-1L != (this.field_c[var5] ^ -1L)) {
                                          break L25;
                                        } else {
                                          this.field_c[var5] = -1L;
                                          this.field_G[var5] = 0;
                                          break L25;
                                        }
                                      }
                                      L26: {
                                        if (0L != this.field_t[var5]) {
                                          break L26;
                                        } else {
                                          this.field_t[var5] = -1L;
                                          this.field_n[var5] = 0;
                                          break L26;
                                        }
                                      }
                                      var5++;
                                      continue L19;
                                    }
                                  }
                                } else {
                                  L27: {
                                    this.field_t[var5] = param0.c((byte) 113);
                                    if (-11 < (param2 ^ -1)) {
                                      this.field_n[var5] = 0;
                                      break L27;
                                    } else {
                                      this.field_n[var5] = param0.e((byte) -87);
                                      break L27;
                                    }
                                  }
                                  var5++;
                                  continue L18;
                                }
                              }
                            } else {
                              L28: {
                                this.field_c[var5] = param0.c((byte) 56);
                                if ((param2 ^ -1) <= -11) {
                                  this.field_G[var5] = param0.e((byte) 114);
                                  break L28;
                                } else {
                                  this.field_G[var5] = 0;
                                  break L28;
                                }
                              }
                              var5++;
                              continue L17;
                            }
                          }
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        this.field_a[var5] = ai.a(param0, var5, -12, param2);
                        var5++;
                        continue L11;
                      }
                    }
                  } else {
                    L29: {
                      if (-1 == (var5 ^ -1)) {
                        break L29;
                      } else {
                        if (var5 == 6) {
                          break L29;
                        } else {
                          if ((var5 ^ -1) == -25) {
                            break L29;
                          } else {
                            if (var5 == 42) {
                              break L29;
                            } else {
                              if (-49 == (var5 ^ -1)) {
                                break L29;
                              } else {
                                this.field_L[var5] = gk.a(param0, (byte) -36);
                                break L29;
                              }
                            }
                          }
                        }
                      }
                    }
                    var5++;
                    continue L10;
                  }
                }
              } else {
                this.field_k.field_f[var5] = param0.h(md.b(param1, 13096));
                var5++;
                continue L9;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var4 = decompiledCaughtException;
            stackOut_90_0 = (RuntimeException) (var4);
            stackOut_90_1 = new StringBuilder().append("lb.D(");
            stackIn_92_0 = stackOut_90_0;
            stackIn_92_1 = stackOut_90_1;
            stackIn_91_0 = stackOut_90_0;
            stackIn_91_1 = stackOut_90_1;
            if (param0 == null) {
              stackOut_92_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackOut_92_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackOut_92_2 = "null";
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              stackIn_93_2 = stackOut_92_2;
              break L30;
            } else {
              stackOut_91_0 = (RuntimeException) ((Object) stackIn_91_0);
              stackOut_91_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackOut_91_2 = "{...}";
              stackIn_93_0 = stackOut_91_0;
              stackIn_93_1 = stackOut_91_1;
              stackIn_93_2 = stackOut_91_2;
              break L30;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_93_0), stackIn_93_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        try {
            wa.field_l = param2;
            i.field_x = param0;
            n.field_c = param1;
            wm.a((byte) -52, gf.field_i / 2, gf.field_c / param3);
            mi.a(param0.field_N, 25570, param0.field_E + param0.field_N, param1.field_N, param1.field_N - -param1.field_E);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "lb.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    lb(ec param0, int param1) {
        this();
        try {
            this.a(param0, -13182, param1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static char a(char param0, int param1) {
        char discarded$2 = 0;
        L0: {
          if (param0 == 181) {
            break L0;
          } else {
            if (402 == param0) {
              break L0;
            } else {
              L1: {
                if (param1 >= 44) {
                  break L1;
                } else {
                  discarded$2 = lb.a('ﾞ', 95);
                  break L1;
                }
              }
              return Character.toTitleCase(param0);
            }
          }
        }
        return param0;
    }

    lb() {
        int var1 = 0;
        long[] var2 = null;
        int var3 = 0;
        this.field_n = new int[10];
        this.field_M = new int[10];
        this.field_G = new int[10];
        this.field_p = -1;
        this.field_t = new long[10];
        this.field_c = new long[10];
        this.field_j = new long[10];
        this.field_w = ek.field_c;
        this.field_b = 0;
        this.field_m = 2500;
        this.field_q = -1;
        this.field_l = 2500;
        this.field_s = 2500;
        this.field_N = 2500;
        this.field_k = new wm(84);
        this.field_a = new hb[8];
        this.field_L = new ai[49];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 49) {
            this.field_J = new int[6];
            this.field_F = new int[6];
            this.field_A = -1;
            var1 = 0;
            L1: while (true) {
              if (var1 >= 10) {
                var1 = 0;
                L2: while (true) {
                  if (-11 >= (var1 ^ -1)) {
                    this.field_u = 0;
                    return;
                  } else {
                    this.field_j[var1] = -1L;
                    this.field_M[var1] = -1;
                    var1++;
                    continue L2;
                  }
                }
              } else {
                var2 = this.field_c;
                var3 = var1;
                this.field_t[var1] = -1L;
                var2[var3] = -1L;
                var1++;
                continue L1;
              }
            }
          } else {
            if (-25 != (var1 ^ -1)) {
              L3: {
                if (-1 == (var1 ^ -1)) {
                  break L3;
                } else {
                  if (6 == var1) {
                    break L3;
                  } else {
                    if (var1 == 42) {
                      break L3;
                    } else {
                      if ((var1 ^ -1) != -49) {
                        this.field_L[var1] = new ai(0);
                        var1++;
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              this.field_L[var1] = new ai(3);
              var1++;
              continue L0;
            } else {
              this.field_L[var1] = new ai(2);
              var1++;
              continue L0;
            }
          }
        }
    }

    static {
        field_O = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_E = "Previous";
        field_d = new String[]{null, "When a raider enters a room containing a monster, it will fight to the death. As the raider and monster exchange blows, the <%attack> of one is compared to the <%defence> of the other to see if the strike breaks through the other's guard."};
        field_x = "Regenerate when raider leaves.";
    }
}
