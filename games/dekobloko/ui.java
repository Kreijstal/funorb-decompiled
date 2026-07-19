/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    int field_N;
    int[] field_d;
    int[] field_M;
    int[][] field_q;
    static w field_x;
    int[] field_B;
    static gh field_t;
    int[] field_I;
    int[] field_G;
    int[][] field_a;
    int field_m;
    int[] field_j;
    private int field_A;
    int[] field_J;
    int[] field_l;
    int[] field_s;
    int[][] field_F;
    private int[] field_D;
    int[] field_O;
    int[] field_f;
    private int[] field_y;
    int[] field_b;
    static w[] field_E;
    int[] field_z;
    private int field_u;
    int[] field_w;
    int[][] field_c;
    int[] field_K;
    static String field_o;
    byte[][] field_e;
    int field_H;
    int[] field_n;
    int field_k;
    int[][] field_p;
    int[] field_C;
    int[] field_r;
    int[] field_v;
    int field_i;
    ud[] field_g;
    private pl field_h;
    static String field_L;

    final static ta a(int param0, String param1) {
        RuntimeException var2 = null;
        ta stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ta stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_E = (w[]) null;
                break L1;
              }
            }
            stackOut_2_0 = new ta(param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ui.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(int param0) {
        if (param0 != -12040) {
            return (String) null;
        }
        return de.field_V.c((byte) -38);
    }

    public static void b(int param0) {
        field_o = null;
        field_t = null;
        field_L = null;
        field_x = null;
        field_E = null;
        if (param0 != 31158) {
            field_x = (w) null;
        }
    }

    private final void a(byte param0) {
        String discarded$2 = null;
        int var2 = 0;
        int var3 = 0;
        ud var4 = null;
        int var5 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_19_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_18_0 = null;
        var5 = client.field_A ? 1 : 0;
        if (this.field_h != null) {
          L0: {
            var2 = 1;
            if (param0 == 103) {
              break L0;
            } else {
              discarded$2 = ui.a(-5);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            L2: {
              L3: {
                L4: {
                  if ((var3 ^ -1) <= (this.field_g.length ^ -1)) {
                    break L4;
                  } else {
                    stackOut_6_0 = this;
                    stackIn_19_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (((ui) (this)).field_g[var3] == null) {
                          L6: {
                            L7: {
                              if (this.field_M[var3] >> 1040524164 == 0) {
                                break L7;
                              } else {
                                var4 = this.field_h.b(this.field_y[var3], this.field_D[var3], -1);
                                if (var5 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var4 = this.field_h.a(-62, this.field_y[var3], this.field_D[var3]);
                            break L6;
                          }
                          L8: {
                            if (var4 != null) {
                              break L8;
                            } else {
                              var2 = 0;
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                          this.field_M[var3] = lb.a(this.field_M[var3], 15);
                          this.field_g[var3] = var4;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var3++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (var2 != 0) {
                  this.field_h = null;
                  this.field_D = null;
                  stackOut_18_0 = this;
                  stackIn_19_0 = stackOut_18_0;
                  break L3;
                } else {
                  break L2;
                }
              }
              ((ui) (this)).field_y = null;
              break L2;
            }
            return;
          }
        } else {
          return;
        }
    }

    ui(wl param0, pl param1) {
        int discarded$11 = 0;
        int dupTemp$12 = 0;
        int dupTemp$13 = 0;
        int[] array$14 = null;
        int dupTemp$15 = 0;
        int[] array$16 = null;
        int dupTemp$17 = 0;
        int[] array$18 = null;
        int dupTemp$19 = 0;
        int[] array$20 = null;
        int dupTemp$21 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        byte[] var16 = null;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var12 = client.field_A ? 1 : 0;
        try {
          L0: {
            this.field_h = param1;
            this.field_i = 1 + param0.d((byte) -58);
            discarded$11 = param0.d((byte) -61);
            this.field_H = 1 + param0.d((byte) -112);
            this.field_u = 1 + param0.d((byte) -84);
            this.field_A = param0.d((byte) -122) + 1;
            var3_int = param0.d((byte) -98);
            this.field_N = 1 & var3_int;
            this.field_k = param0.d((byte) -27);
            this.field_m = param0.d((byte) -30);
            this.field_s = new int[this.field_i];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var5 ^ -1) <= (this.field_i ^ -1)) {
                    break L3;
                  } else {
                    dupTemp$12 = var4 + param0.d((byte) -126);
                    var4 = dupTemp$12;
                    this.field_s[var5] = lb.a(255, dupTemp$12);
                    var5++;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_e = new byte[256][];
                this.field_d = new int[256];
                an.a(this.field_d, 0, 256, 64);
                break L2;
              }
              var5 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if ((var5 ^ -1) <= -257) {
                      break L6;
                    } else {
                      this.field_e[var5] = client.field_D;
                      var5++;
                      if (var12 != 0) {
                        break L5;
                      } else {
                        if (var12 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var5 = 0;
                  break L5;
                }
                L7: while (true) {
                  L8: {
                    L9: {
                      L10: {
                        if (var5 >= this.field_u) {
                          break L10;
                        } else {
                          this.field_d[var5] = 1 + param0.d((byte) -103);
                          var6 = param0.e(3);
                          var16 = new byte[var6];
                          stackOut_12_0 = 0;
                          stackOut_12_1 = var6;
                          stackIn_18_0 = stackOut_12_0;
                          stackIn_18_1 = stackOut_12_1;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          if (var12 != 0) {
                            L11: while (true) {
                              if (stackIn_18_0 <= stackIn_18_1) {
                                break L9;
                              } else {
                                var7 = param0.d((byte) -33);
                                if (var12 != 0) {
                                  break L8;
                                } else {
                                  L12: {
                                    L13: {
                                      if (-1 <= (var7 ^ -1)) {
                                        break L13;
                                      } else {
                                        var4 = 0;
                                        var8 = 0;
                                        L14: while (true) {
                                          L15: {
                                            L16: {
                                              if (96 <= var8) {
                                                break L16;
                                              } else {
                                                dupTemp$13 = var4 + param0.d((byte) -79);
                                                var4 = dupTemp$13;
                                                this.field_p[var6][var8] = var5 - -lb.a(dupTemp$13, 255);
                                                var8++;
                                                if (var12 != 0) {
                                                  break L15;
                                                } else {
                                                  if (var12 == 0) {
                                                    continue L14;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                            }
                                            this.field_z[var6] = param0.d((byte) -64);
                                            var8 = param0.d((byte) -99);
                                            this.field_r[var6] = param0.d((byte) -19);
                                            this.field_j[var6] = param0.d((byte) -110);
                                            this.field_K[var6] = this.field_j[var6] + param0.d((byte) -66);
                                            this.field_O[var6] = param0.d((byte) -110);
                                            break L15;
                                          }
                                          var9 = param0.d((byte) -78);
                                          this.field_J[var6] = param0.d((byte) -64);
                                          this.field_C[var6] = param0.d((byte) -46);
                                          this.field_I[var6] = this.field_C[var6] + param0.d((byte) -58);
                                          array$14 = new int[var8];
                                          this.field_q[var6] = array$14;
                                          var4 = 0;
                                          var10 = 0;
                                          var11 = 0;
                                          L17: while (true) {
                                            L18: {
                                              L19: {
                                                if (var8 <= var11) {
                                                  break L19;
                                                } else {
                                                  dupTemp$15 = var10 + param0.e((byte) 126);
                                                  var10 = dupTemp$15;
                                                  var4 = var4 + dupTemp$15;
                                                  this.field_q[var6][var11] = var4 + dupTemp$15;
                                                  var11++;
                                                  if (var12 != 0) {
                                                    break L18;
                                                  } else {
                                                    if (var12 == 0) {
                                                      continue L17;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                              }
                                              var4 = 0;
                                              array$16 = new int[var8];
                                              this.field_F[var6] = array$16;
                                              break L18;
                                            }
                                            var11 = 0;
                                            L20: while (true) {
                                              L21: {
                                                L22: {
                                                  if (var11 >= var8) {
                                                    break L22;
                                                  } else {
                                                    dupTemp$17 = var4 + param0.d((byte) -27);
                                                    var4 = dupTemp$17;
                                                    this.field_F[var6][var11] = lb.a(255, dupTemp$17);
                                                    var11++;
                                                    if (var12 != 0) {
                                                      break L21;
                                                    } else {
                                                      if (var12 == 0) {
                                                        continue L20;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                }
                                                var10 = 0;
                                                array$18 = new int[var9];
                                                this.field_c[var6] = array$18;
                                                var4 = 0;
                                                break L21;
                                              }
                                              var11 = 0;
                                              L23: while (true) {
                                                L24: {
                                                  L25: {
                                                    if ((var9 ^ -1) >= (var11 ^ -1)) {
                                                      break L25;
                                                    } else {
                                                      dupTemp$19 = var10 + param0.e((byte) -2);
                                                      var10 = dupTemp$19;
                                                      var4 = var4 + dupTemp$19;
                                                      this.field_c[var6][var11] = var4 + dupTemp$19;
                                                      var11++;
                                                      if (var12 != 0) {
                                                        break L24;
                                                      } else {
                                                        if (var12 == 0) {
                                                          continue L23;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var4 = 0;
                                                  array$20 = new int[var9];
                                                  this.field_a[var6] = array$20;
                                                  break L24;
                                                }
                                                var11 = 0;
                                                L26: while (true) {
                                                  L27: {
                                                    L28: {
                                                      if (var9 <= var11) {
                                                        break L28;
                                                      } else {
                                                        dupTemp$21 = var4 + param0.d((byte) -110);
                                                        var4 = dupTemp$21;
                                                        this.field_a[var6][var11] = lb.a(255, dupTemp$21);
                                                        var11++;
                                                        if (var12 != 0) {
                                                          break L27;
                                                        } else {
                                                          if (var12 == 0) {
                                                            continue L26;
                                                          } else {
                                                            break L28;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    this.field_v[var6] = param0.e(3);
                                                    break L27;
                                                  }
                                                  var11 = 0;
                                                  L29: while (true) {
                                                    if (var7 <= var11) {
                                                      break L13;
                                                    } else {
                                                      this.field_B[var5] = param0.h(65280);
                                                      this.field_w[var5] = param0.h(65280);
                                                      this.field_f[var5] = this.field_w[var5] + param0.h(65280);
                                                      this.field_G[var5] = param0.d((byte) -112);
                                                      this.field_l[var5] = param0.g((byte) -104);
                                                      this.field_M[var5] = param0.d((byte) -65);
                                                      this.field_n[var5] = param0.d((byte) -54);
                                                      this.field_b[var5] = -1 + param0.g((byte) -108);
                                                      this.field_D[var5] = param0.e(3);
                                                      this.field_y[var5] = param0.e(3);
                                                      var5++;
                                                      var11++;
                                                      if (var12 != 0) {
                                                        break L12;
                                                      } else {
                                                        if (var12 == 0) {
                                                          continue L29;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var6++;
                                    break L12;
                                  }
                                  if (var12 == 0) {
                                    stackOut_17_0 = this.field_A;
                                    stackOut_17_1 = var6;
                                    stackIn_18_0 = stackOut_17_0;
                                    stackIn_18_1 = stackOut_17_1;
                                    continue L11;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          } else {
                            L30: {
                              if (stackIn_13_0 >= stackIn_13_1) {
                                break L30;
                              } else {
                                param0.a(var16, 0, (byte) 127, var6);
                                this.field_e[var5] = var16;
                                break L30;
                              }
                            }
                            var5++;
                            if (var12 == 0) {
                              continue L7;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      this.field_z = new int[this.field_A];
                      this.field_v = new int[this.field_A];
                      this.field_J = new int[this.field_A];
                      this.field_F = new int[this.field_A][];
                      this.field_K = new int[this.field_A];
                      this.field_p = new int[this.field_A][96];
                      this.field_j = new int[this.field_A];
                      this.field_a = new int[this.field_A][];
                      this.field_C = new int[this.field_A];
                      this.field_I = new int[this.field_A];
                      this.field_c = new int[this.field_A][];
                      this.field_O = new int[this.field_A];
                      this.field_r = new int[this.field_A];
                      this.field_q = new int[this.field_A][];
                      var5 = param0.e(3);
                      this.field_M = new int[var5];
                      this.field_D = new int[var5];
                      this.field_f = new int[var5];
                      this.field_b = new int[var5];
                      this.field_w = new int[var5];
                      this.field_y = new int[var5];
                      this.field_G = new int[var5];
                      this.field_n = new int[var5];
                      this.field_l = new int[var5];
                      this.field_g = new ud[var5];
                      this.field_B = new int[var5];
                      var5 = 0;
                      var6 = 0;
                      L31: while (true) {
                        stackOut_17_0 = this.field_A;
                        stackOut_17_1 = var6;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (stackIn_18_0 <= stackIn_18_1) {
                          break L9;
                        } else {
                          var7 = param0.d((byte) -33);
                          if (var12 != 0) {
                            break L8;
                          } else {
                            L32: {
                              L33: {
                                if (-1 <= (var7 ^ -1)) {
                                  break L33;
                                } else {
                                  var4 = 0;
                                  var8 = 0;
                                  L34: while (true) {
                                    L35: {
                                      L36: {
                                        if (96 <= var8) {
                                          break L36;
                                        } else {
                                          dupTemp$13 = var4 + param0.d((byte) -79);
                                          var4 = dupTemp$13;
                                          this.field_p[var6][var8] = var5 - -lb.a(dupTemp$13, 255);
                                          var8++;
                                          if (var12 != 0) {
                                            break L35;
                                          } else {
                                            if (var12 == 0) {
                                              continue L34;
                                            } else {
                                              break L36;
                                            }
                                          }
                                        }
                                      }
                                      this.field_z[var6] = param0.d((byte) -64);
                                      var8 = param0.d((byte) -99);
                                      this.field_r[var6] = param0.d((byte) -19);
                                      this.field_j[var6] = param0.d((byte) -110);
                                      this.field_K[var6] = this.field_j[var6] + param0.d((byte) -66);
                                      this.field_O[var6] = param0.d((byte) -110);
                                      break L35;
                                    }
                                    var9 = param0.d((byte) -78);
                                    this.field_J[var6] = param0.d((byte) -64);
                                    this.field_C[var6] = param0.d((byte) -46);
                                    this.field_I[var6] = this.field_C[var6] + param0.d((byte) -58);
                                    array$14 = new int[var8];
                                    this.field_q[var6] = array$14;
                                    var4 = 0;
                                    var10 = 0;
                                    var11 = 0;
                                    L37: while (true) {
                                      L38: {
                                        L39: {
                                          if (var8 <= var11) {
                                            break L39;
                                          } else {
                                            dupTemp$15 = var10 + param0.e((byte) 126);
                                            var10 = dupTemp$15;
                                            var4 = var4 + dupTemp$15;
                                            this.field_q[var6][var11] = var4 + dupTemp$15;
                                            var11++;
                                            if (var12 != 0) {
                                              break L38;
                                            } else {
                                              if (var12 == 0) {
                                                continue L37;
                                              } else {
                                                break L39;
                                              }
                                            }
                                          }
                                        }
                                        var4 = 0;
                                        array$16 = new int[var8];
                                        this.field_F[var6] = array$16;
                                        break L38;
                                      }
                                      var11 = 0;
                                      L40: while (true) {
                                        L41: {
                                          L42: {
                                            if (var11 >= var8) {
                                              break L42;
                                            } else {
                                              dupTemp$17 = var4 + param0.d((byte) -27);
                                              var4 = dupTemp$17;
                                              this.field_F[var6][var11] = lb.a(255, dupTemp$17);
                                              var11++;
                                              if (var12 != 0) {
                                                break L41;
                                              } else {
                                                if (var12 == 0) {
                                                  continue L40;
                                                } else {
                                                  break L42;
                                                }
                                              }
                                            }
                                          }
                                          var10 = 0;
                                          array$18 = new int[var9];
                                          this.field_c[var6] = array$18;
                                          var4 = 0;
                                          break L41;
                                        }
                                        var11 = 0;
                                        L43: while (true) {
                                          L44: {
                                            L45: {
                                              if ((var9 ^ -1) >= (var11 ^ -1)) {
                                                break L45;
                                              } else {
                                                dupTemp$19 = var10 + param0.e((byte) -2);
                                                var10 = dupTemp$19;
                                                var4 = var4 + dupTemp$19;
                                                this.field_c[var6][var11] = var4 + dupTemp$19;
                                                var11++;
                                                if (var12 != 0) {
                                                  break L44;
                                                } else {
                                                  if (var12 == 0) {
                                                    continue L43;
                                                  } else {
                                                    break L45;
                                                  }
                                                }
                                              }
                                            }
                                            var4 = 0;
                                            array$20 = new int[var9];
                                            this.field_a[var6] = array$20;
                                            break L44;
                                          }
                                          var11 = 0;
                                          L46: while (true) {
                                            L47: {
                                              L48: {
                                                if (var9 <= var11) {
                                                  break L48;
                                                } else {
                                                  dupTemp$21 = var4 + param0.d((byte) -110);
                                                  var4 = dupTemp$21;
                                                  this.field_a[var6][var11] = lb.a(255, dupTemp$21);
                                                  var11++;
                                                  if (var12 != 0) {
                                                    break L47;
                                                  } else {
                                                    if (var12 == 0) {
                                                      continue L46;
                                                    } else {
                                                      break L48;
                                                    }
                                                  }
                                                }
                                              }
                                              this.field_v[var6] = param0.e(3);
                                              break L47;
                                            }
                                            var11 = 0;
                                            L49: while (true) {
                                              if (var7 <= var11) {
                                                break L33;
                                              } else {
                                                this.field_B[var5] = param0.h(65280);
                                                this.field_w[var5] = param0.h(65280);
                                                this.field_f[var5] = this.field_w[var5] + param0.h(65280);
                                                this.field_G[var5] = param0.d((byte) -112);
                                                this.field_l[var5] = param0.g((byte) -104);
                                                this.field_M[var5] = param0.d((byte) -65);
                                                this.field_n[var5] = param0.d((byte) -54);
                                                this.field_b[var5] = -1 + param0.g((byte) -108);
                                                this.field_D[var5] = param0.e(3);
                                                this.field_y[var5] = param0.e(3);
                                                var5++;
                                                var11++;
                                                if (var12 != 0) {
                                                  break L32;
                                                } else {
                                                  if (var12 == 0) {
                                                    continue L49;
                                                  } else {
                                                    break L33;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var6++;
                              break L32;
                            }
                            if (var12 == 0) {
                              continue L31;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                    this.a((byte) 103);
                    break L8;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L50: {
            var3 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) (var3);
            stackOut_54_1 = new StringBuilder().append("ui.<init>(");
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param0 == null) {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L50;
            } else {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L50;
            }
          }
          L51: {
            stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
            stackOut_57_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_57_2).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param1 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L51;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L51;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ')');
        }
    }

    static {
        field_o = "Steady...";
        field_t = new gh(2);
        field_L = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
