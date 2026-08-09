/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm {
    static String[] field_w;
    byte[][] field_v;
    lr field_l;
    int[] field_e;
    int[] field_q;
    static je field_b;
    private int[] field_m;
    int field_s;
    private int[][] field_j;
    private byte[] field_n;
    static at field_o;
    static String field_d;
    lr[] field_f;
    static String field_u;
    private int field_r;
    int field_i;
    int[] field_p;
    int[][] field_a;
    int[] field_t;
    int field_c;
    static boolean field_g;
    static volatile int field_k;
    int[] field_h;

    private final void a(byte[] param0, boolean param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        byte[] var17 = null;
        vh var18 = null;
        byte[] var22 = null;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var18 = new vh(el.a(param1, param0));
              var4 = var18.k(0);
              if (5 > var4) {
                break L1;
              } else {
                if ((var4 ^ -1) >= -8) {
                  L2: {
                    if (var4 >= 6) {
                      this.field_c = var18.i(1);
                      break L2;
                    } else {
                      this.field_c = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var18.k(0);
                    if ((var5 & 1) == 0) {
                      stackIn_11_0 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if ((var5 & 2) == 0) {
                      stackIn_14_0 = 0;
                      break L4;
                    } else {
                      stackIn_14_0 = 1;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_14_0;
                    if (7 > var4) {
                      this.field_r = var18.e((byte) -104);
                      break L5;
                    } else {
                      this.field_r = var18.f((byte) 111);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    this.field_q = new int[this.field_r];
                    var9 = -1;
                    if (-8 < (var4 ^ -1)) {
                      var10 = 0;
                      L7: while (true) {
                        if (this.field_r <= var10) {
                          break L6;
                        } else {
                          L8: {
                            dupTemp$0 = var8 + var18.e((byte) -104);
                            var8 = dupTemp$0;
                            this.field_q[var10] = dupTemp$0;
                            if ((this.field_q[var10] ^ -1) < (var9 ^ -1)) {
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
                        if (this.field_r <= var10) {
                          break L6;
                        } else {
                          L10: {
                            dupTemp$1 = var8 + var18.f((byte) 101);
                            var8 = dupTemp$1;
                            this.field_q[var10] = dupTemp$1;
                            if (var9 < this.field_q[var10]) {
                              var9 = this.field_q[var10];
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
                    this.field_i = var9 + 1;
                    if (!param1) {
                      break L11;
                    } else {
                      var17 = (byte[]) null;
                      this.a((byte[]) null, true);
                      break L11;
                    }
                  }
                  L12: {
                    this.field_e = new int[this.field_i];
                    this.field_h = new int[this.field_i];
                    this.field_a = new int[this.field_i][];
                    if (var7 != 0) {
                      this.field_v = new byte[this.field_i][];
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    this.field_p = new int[this.field_i];
                    this.field_t = new int[this.field_i];
                    if (var6 == 0) {
                      break L13;
                    } else {
                      this.field_m = new int[this.field_i];
                      var10 = 0;
                      L14: while (true) {
                        if (var10 >= this.field_i) {
                          var10 = 0;
                          L15: while (true) {
                            if (this.field_r <= var10) {
                              this.field_l = new lr(this.field_m);
                              break L13;
                            } else {
                              this.field_m[this.field_q[var10]] = var18.i(1);
                              var10++;
                              continue L15;
                            }
                          }
                        } else {
                          this.field_m[var10] = -1;
                          var10++;
                          continue L14;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L16: while (true) {
                    if (var10 >= this.field_r) {
                      L17: {
                        if (var7 == 0) {
                          break L17;
                        } else {
                          var10 = 0;
                          L18: while (true) {
                            if (var10 >= this.field_r) {
                              break L17;
                            } else {
                              var22 = new byte[64];
                              var18.a(0, 64, 0, var22);
                              this.field_v[this.field_q[var10]] = var22;
                              var10++;
                              continue L18;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L19: while (true) {
                        if (var10 >= this.field_r) {
                          L20: {
                            if (var4 >= 7) {
                              var10 = 0;
                              L21: while (true) {
                                if (this.field_r <= var10) {
                                  var10 = 0;
                                  L22: while (true) {
                                    if (var10 >= this.field_r) {
                                      break L20;
                                    } else {
                                      var11 = this.field_q[var10];
                                      var8 = 0;
                                      var12 = this.field_p[var11];
                                      array$2 = new int[var12];
                                      this.field_a[var11] = array$2;
                                      var13 = -1;
                                      var14 = 0;
                                      L23: while (true) {
                                        if (var14 >= var12) {
                                          L24: {
                                            this.field_h[var11] = var13 + 1;
                                            if (var12 != 1 + var13) {
                                              break L24;
                                            } else {
                                              this.field_a[var11] = null;
                                              break L24;
                                            }
                                          }
                                          var10++;
                                          continue L22;
                                        } else {
                                          L25: {
                                            dupTemp$3 = var8 + var18.f((byte) 125);
                                            var8 = dupTemp$3;
                                            dupTemp$4 = this.field_a[var11];
                                            dupTemp$4[var14] = dupTemp$3;
                                            var15 = dupTemp$3;
                                            if ((var15 ^ -1) < (var13 ^ -1)) {
                                              var13 = var15;
                                              break L25;
                                            } else {
                                              break L25;
                                            }
                                          }
                                          var14++;
                                          continue L23;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_p[this.field_q[var10]] = var18.f((byte) 102);
                                  var10++;
                                  continue L21;
                                }
                              }
                            } else {
                              var10 = 0;
                              L26: while (true) {
                                if (this.field_r <= var10) {
                                  var10 = 0;
                                  L27: while (true) {
                                    if (var10 >= this.field_r) {
                                      break L20;
                                    } else {
                                      var11 = this.field_q[var10];
                                      var8 = 0;
                                      var12 = this.field_p[var11];
                                      var13 = -1;
                                      array$5 = new int[var12];
                                      this.field_a[var11] = array$5;
                                      var14 = 0;
                                      L28: while (true) {
                                        if (var12 <= var14) {
                                          L29: {
                                            this.field_h[var11] = var13 + 1;
                                            if (var12 != 1 + var13) {
                                              break L29;
                                            } else {
                                              this.field_a[var11] = null;
                                              break L29;
                                            }
                                          }
                                          var10++;
                                          continue L27;
                                        } else {
                                          dupTemp$6 = var8 + var18.e((byte) -104);
                                          var8 = dupTemp$6;
                                          dupTemp$7 = this.field_a[var11];
                                          dupTemp$7[var14] = dupTemp$6;
                                          var15 = dupTemp$6;
                                          if (var15 > var13) {
                                            var13 = var15;
                                            var14++;
                                            continue L28;
                                          } else {
                                            var14++;
                                            continue L28;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_p[this.field_q[var10]] = var18.e((byte) -104);
                                  var10++;
                                  continue L26;
                                }
                              }
                            }
                          }
                          L30: {
                            if (var6 == 0) {
                              break L30;
                            } else {
                              this.field_j = new int[var9 + 1][];
                              this.field_f = new lr[1 + var9];
                              var10 = 0;
                              L31: while (true) {
                                if (var10 >= this.field_r) {
                                  break L30;
                                } else {
                                  var11 = this.field_q[var10];
                                  var12 = this.field_p[var11];
                                  array$8 = new int[this.field_h[var11]];
                                  this.field_j[var11] = array$8;
                                  var13 = 0;
                                  L32: while (true) {
                                    if (this.field_h[var11] <= var13) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var13 >= var12) {
                                          this.field_f[var11] = new lr(this.field_j[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (this.field_a[var11] == null) {
                                              var14 = var13;
                                              break L34;
                                            } else {
                                              var14 = this.field_a[var11][var13];
                                              break L34;
                                            }
                                          }
                                          this.field_j[var11][var14] = var18.i(1);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      this.field_j[var11][var13] = -1;
                                      var13++;
                                      continue L32;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          break L0;
                        } else {
                          this.field_t[this.field_q[var10]] = var18.i(1);
                          var10++;
                          continue L19;
                        }
                      }
                    } else {
                      this.field_e[this.field_q[var10]] = var18.i(1);
                      var10++;
                      continue L16;
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
          L35: {
            var3 = decompiledCaughtException;
            stackIn_97_0 = (RuntimeException) (var3);

            stackIn_97_1 = new StringBuilder().append("jm.B(");

            if (param0 == null) {
              stackIn_98_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackIn_98_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackIn_98_2 = "null";
              break L35;
            } else {
              stackIn_98_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackIn_98_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackIn_98_2 = "{...}";
              break L35;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            vh.a(0, df.field_T, false, pd.field_e, kt.field_p, param0, true);
            var2_int = param1;
            L1: while (true) {
              if (kt.field_p <= var2_int) {
                L2: {
                  vh.a(param0, se.field_e, false, sq.field_k, kt.field_p + param0, param0 + param0, false);
                  if (param0 < kt.field_p) {
                    kt.field_p = param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                vt.field_m[param0 + var2_int] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "jm.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(je param0, int param1) {
        je var5 = null;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        je var4 = (je) ((Object) param0.field_fb.e((byte) 121));
        je var2 = var4;
        while (var4 != null) {
            var4.field_nb = 0;
            var4.field_ob = 0;
            var4.field_db = 0;
            var4.field_ab = 0;
            var5 = (je) ((Object) param0.field_fb.a((byte) 123));
            var5 = var5;
        }
        param0.field_nb = 0;
        param0.field_ob = 0;
        param0.field_ab = 0;
        if (param1 > -42) {
            return;
        }
        try {
            param0.field_db = 0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "jm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_w = null;
        field_u = null;
        if (param0 > -48) {
            return;
        }
        field_o = null;
        field_d = null;
        field_b = null;
    }

    jm(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_s = pk.a(param0, param0.length, 120);
            if (this.field_s != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                this.field_n = ua.a(-18423, param0.length, param0, 0);
                for (var4_int = 0; 64 > var4_int; var4_int++) {
                    if (this.field_n[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, false);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "jm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = new String[]{"Player_1", "Player_2", "Player_3", "Player_4", "Player_5", "Player_6", "Player_7", "Player_8"};
        field_u = "Remove name";
        field_d = "Accessories";
        field_g = false;
        field_o = new at();
        field_k = 0;
    }
}
