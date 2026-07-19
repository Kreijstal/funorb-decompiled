/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    int[] field_q;
    cm[] field_i;
    static boolean field_o;
    int[] field_n;
    private byte[] field_u;
    int[][] field_k;
    int[] field_m;
    static bi field_p;
    int field_c;
    static String field_d;
    private int[][] field_t;
    static String field_g;
    static bi field_r;
    private int[] field_s;
    cm field_b;
    byte[][] field_j;
    private int field_l;
    int[] field_v;
    static int[][] field_h;
    int[] field_f;
    int field_a;
    int field_e;

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
            return;
        }
        field_g = null;
        field_h = (int[][]) null;
        field_r = null;
        field_p = null;
    }

    private final void a(byte[] param0, byte param1) {
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
        ob var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new ob(pa.a(param0, 200));
              var4 = var17.j(-89);
              if (-6 < (var4 ^ -1)) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 < 6) {
                      this.field_e = 0;
                      break L2;
                    } else {
                      this.field_e = var17.a(16711680);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.j(-57);
                    if (0 == (1 & var5)) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if (var4 < 7) {
                      this.field_l = var17.f(-20976);
                      break L4;
                    } else {
                      this.field_l = var17.d(true);
                      break L4;
                    }
                  }
                  L5: {
                    if ((2 & var5) == 0) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_17_0;
                    var8 = 0;
                    this.field_q = new int[this.field_l];
                    var9 = -1;
                    if ((var4 ^ -1) > -8) {
                      var10 = 0;
                      L7: while (true) {
                        if (this.field_l <= var10) {
                          break L6;
                        } else {
                          L8: {
                            dupTemp$7 = var8 + var17.f(-20976);
                            var8 = dupTemp$7;
                            this.field_q[var10] = dupTemp$7;
                            if (this.field_q[var10] > var9) {
                              var9 = this.field_q[var10];
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var10++;
                          continue L7;
                        }
                      }
                    } else {
                      var10 = 0;
                      L9: while (true) {
                        if (this.field_l <= var10) {
                          break L6;
                        } else {
                          dupTemp$8 = var8 + var17.d(true);
                          var8 = dupTemp$8;
                          this.field_q[var10] = dupTemp$8;
                          if (this.field_q[var10] > var9) {
                            var9 = this.field_q[var10];
                            var10++;
                            continue L9;
                          } else {
                            var10++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                  L10: {
                    this.field_a = 1 + var9;
                    this.field_k = new int[this.field_a][];
                    this.field_n = new int[this.field_a];
                    this.field_m = new int[this.field_a];
                    this.field_f = new int[this.field_a];
                    if (var7 != 0) {
                      this.field_j = new byte[this.field_a][];
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    this.field_v = new int[this.field_a];
                    if (var6 == 0) {
                      break L11;
                    } else {
                      this.field_s = new int[this.field_a];
                      var10 = 0;
                      L12: while (true) {
                        if (this.field_a <= var10) {
                          var10 = 0;
                          L13: while (true) {
                            if (var10 >= this.field_l) {
                              this.field_b = new cm(this.field_s);
                              break L11;
                            } else {
                              this.field_s[this.field_q[var10]] = var17.a(16711680);
                              var10++;
                              continue L13;
                            }
                          }
                        } else {
                          this.field_s[var10] = -1;
                          var10++;
                          continue L12;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L14: while (true) {
                    if (this.field_l <= var10) {
                      L15: {
                        if (var7 != 0) {
                          var10 = 0;
                          L16: while (true) {
                            if (this.field_l <= var10) {
                              if (param1 > 77) {
                                var10 = 0;
                                L17: while (true) {
                                  if (var10 >= this.field_l) {
                                    break L15;
                                  } else {
                                    this.field_v[this.field_q[var10]] = var17.a(16711680);
                                    var10++;
                                    continue L17;
                                  }
                                }
                              } else {
                                decompiledRegionSelector0 = 0;
                                break L0;
                              }
                            } else {
                              var21 = new byte[64];
                              var17.a(64, 0, 17469032, var21);
                              this.field_j[this.field_q[var10]] = var21;
                              var10++;
                              continue L16;
                            }
                          }
                        } else {
                          if (param1 > 77) {
                            var10 = 0;
                            L18: while (true) {
                              if (var10 >= this.field_l) {
                                break L15;
                              } else {
                                this.field_v[this.field_q[var10]] = var17.a(16711680);
                                var10++;
                                continue L18;
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      }
                      L19: {
                        if (-8 < (var4 ^ -1)) {
                          var10 = 0;
                          L20: while (true) {
                            if (var10 >= this.field_l) {
                              var10 = 0;
                              L21: while (true) {
                                if (var10 >= this.field_l) {
                                  break L19;
                                } else {
                                  var11 = this.field_q[var10];
                                  var8 = 0;
                                  var12 = this.field_n[var11];
                                  var13 = -1;
                                  array$9 = new int[var12];
                                  this.field_k[var11] = array$9;
                                  var14 = 0;
                                  L22: while (true) {
                                    if (var12 <= var14) {
                                      L23: {
                                        this.field_m[var11] = 1 + var13;
                                        if (var13 - -1 == var12) {
                                          this.field_k[var11] = null;
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                      var10++;
                                      continue L21;
                                    } else {
                                      L24: {
                                        dupTemp$10 = var8 + var17.f(-20976);
                                        var8 = dupTemp$10;
                                        this.field_k[var11][var14] = dupTemp$10;
                                        var15 = dupTemp$10;
                                        if (var13 < var15) {
                                          var13 = var15;
                                          break L24;
                                        } else {
                                          break L24;
                                        }
                                      }
                                      var14++;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.field_n[this.field_q[var10]] = var17.f(-20976);
                              var10++;
                              continue L20;
                            }
                          }
                        } else {
                          var10 = 0;
                          L25: while (true) {
                            if (this.field_l <= var10) {
                              var10 = 0;
                              L26: while (true) {
                                if (var10 >= this.field_l) {
                                  break L19;
                                } else {
                                  var11 = this.field_q[var10];
                                  var12 = this.field_n[var11];
                                  var8 = 0;
                                  array$11 = new int[var12];
                                  this.field_k[var11] = array$11;
                                  var13 = -1;
                                  var14 = 0;
                                  L27: while (true) {
                                    if (var12 <= var14) {
                                      L28: {
                                        this.field_m[var11] = var13 + 1;
                                        if (var12 == 1 + var13) {
                                          this.field_k[var11] = null;
                                          break L28;
                                        } else {
                                          break L28;
                                        }
                                      }
                                      var10++;
                                      continue L26;
                                    } else {
                                      L29: {
                                        dupTemp$12 = var8 + var17.d(true);
                                        var8 = dupTemp$12;
                                        this.field_k[var11][var14] = dupTemp$12;
                                        var15 = dupTemp$12;
                                        if (var15 > var13) {
                                          var13 = var15;
                                          break L29;
                                        } else {
                                          break L29;
                                        }
                                      }
                                      var14++;
                                      continue L27;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.field_n[this.field_q[var10]] = var17.d(true);
                              var10++;
                              continue L25;
                            }
                          }
                        }
                      }
                      L30: {
                        if (var6 == 0) {
                          break L30;
                        } else {
                          this.field_t = new int[1 + var9][];
                          this.field_i = new cm[var9 - -1];
                          var10 = 0;
                          L31: while (true) {
                            if (this.field_l <= var10) {
                              break L30;
                            } else {
                              var11 = this.field_q[var10];
                              var12 = this.field_n[var11];
                              array$13 = new int[this.field_m[var11]];
                              this.field_t[var11] = array$13;
                              var13 = 0;
                              L32: while (true) {
                                if (this.field_m[var11] <= var13) {
                                  var13 = 0;
                                  L33: while (true) {
                                    if (var13 >= var12) {
                                      this.field_i[var11] = new cm(this.field_t[var11]);
                                      var10++;
                                      continue L31;
                                    } else {
                                      L34: {
                                        if (this.field_k[var11] == null) {
                                          var14 = var13;
                                          break L34;
                                        } else {
                                          var14 = this.field_k[var11][var13];
                                          break L34;
                                        }
                                      }
                                      this.field_t[var11][var14] = var17.a(16711680);
                                      var13++;
                                      continue L33;
                                    }
                                  }
                                } else {
                                  this.field_t[var11][var13] = -1;
                                  var13++;
                                  continue L32;
                                }
                              }
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      this.field_f[this.field_q[var10]] = var17.a(16711680);
                      var10++;
                      continue L14;
                    }
                  }
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var3 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) (var3);
            stackOut_102_1 = new StringBuilder().append("ci.B(");
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param0 == null) {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L35;
            } else {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L35;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ci(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_c = me.a(62, param0, param0.length);
            if (this.field_c != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                this.field_u = dp.a(param0, param0.length, -26131, 0);
                for (var4_int = 0; -65 < (var4_int ^ -1); var4_int++) {
                    if (this.field_u[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, (byte) 86);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ci.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Solicitation";
    }
}
