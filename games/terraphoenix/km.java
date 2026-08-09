/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    static pg[] field_q;
    int field_j;
    bc[] field_f;
    static String[] field_c;
    int[] field_o;
    int field_i;
    static String field_m;
    int[] field_b;
    private int field_s;
    private byte[] field_a;
    int[] field_h;
    private int[][] field_n;
    int field_t;
    byte[][] field_p;
    int[] field_k;
    int[] field_d;
    int[][] field_r;
    private int[] field_l;
    static int field_e;
    bc field_g;

    public static void a(byte param0) {
        field_q = null;
        field_c = null;
        if (param0 != 13) {
            field_e = 1;
        }
        field_m = null;
    }

    final static bg a(int param0) {
        if (param0 < 111) {
            km.a((byte) 11);
        }
        bg var1 = new bg(ah.field_A, sb.field_j, ha.field_s[0], hj.field_K[0], sb.field_m[0], rf.field_p[0], qc.field_b[0], wb.field_a);
        mj.a((byte) 79);
        return var1;
    }

    private final void a(int param0, byte[] param1) {
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
        int stackIn_17_0 = 0;
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
        dh var18 = null;
        byte[] var22 = null;
        var16 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var18 = new dh(qg.a(-1, param1));
              var4 = var18.a(-16384);
              if (5 > var4) {
                break L1;
              } else {
                if (-8 > (var4 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    if (6 <= var4) {
                      this.field_t = var18.f((byte) -107);
                      break L2;
                    } else {
                      this.field_t = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var18.a(-16384);
                    if (0 == (var5 & 1)) {
                      stackIn_11_0 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if (-8 < (var4 ^ -1)) {
                      this.field_s = var18.i(-25578);
                      break L4;
                    } else {
                      this.field_s = var18.d(-10355);
                      break L4;
                    }
                  }
                  L5: {
                    if (0 == (var5 & 2)) {
                      stackIn_17_0 = 0;
                      break L5;
                    } else {
                      stackIn_17_0 = 1;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_17_0;
                    var8 = 0;
                    this.field_b = new int[this.field_s];
                    var9 = -1;
                    if (7 <= var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= this.field_s) {
                          break L6;
                        } else {
                          L8: {
                            dupTemp$0 = var8 + var18.d(-10355);
                            var8 = dupTemp$0;
                            this.field_b[var10] = dupTemp$0;
                            if (var9 < this.field_b[var10]) {
                              var9 = this.field_b[var10];
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
                        if (var10 >= this.field_s) {
                          break L6;
                        } else {
                          L10: {
                            dupTemp$1 = var8 + var18.i(-25578);
                            var8 = dupTemp$1;
                            this.field_b[var10] = dupTemp$1;
                            if (this.field_b[var10] > var9) {
                              var9 = this.field_b[var10];
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
                    this.field_j = 1 + var9;
                    this.field_h = new int[this.field_j];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      this.field_p = new byte[this.field_j][];
                      break L11;
                    }
                  }
                  L12: {
                    this.field_r = new int[this.field_j][];
                    this.field_d = new int[this.field_j];
                    this.field_o = new int[this.field_j];
                    this.field_k = new int[this.field_j];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      this.field_l = new int[this.field_j];
                      var10 = 0;
                      L13: while (true) {
                        if (this.field_j <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (this.field_s <= var10) {
                              this.field_g = new bc(this.field_l);
                              break L12;
                            } else {
                              this.field_l[this.field_b[var10]] = var18.f((byte) -107);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          this.field_l[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (this.field_s <= var10) {
                      L16: {
                        if (param0 >= 37) {
                          break L16;
                        } else {
                          var17 = (byte[]) null;
                          this.a(107, (byte[]) null);
                          break L16;
                        }
                      }
                      L17: {
                        if (var7 == 0) {
                          break L17;
                        } else {
                          var10 = 0;
                          L18: while (true) {
                            if (this.field_s <= var10) {
                              break L17;
                            } else {
                              var22 = new byte[64];
                              var18.a(64, 0, 103, var22);
                              this.field_p[this.field_b[var10]] = var22;
                              var10++;
                              continue L18;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L19: while (true) {
                        if (var10 >= this.field_s) {
                          L20: {
                            if (var4 >= 7) {
                              var10 = 0;
                              L21: while (true) {
                                if (var10 >= this.field_s) {
                                  var10 = 0;
                                  L22: while (true) {
                                    if (this.field_s <= var10) {
                                      break L20;
                                    } else {
                                      var11 = this.field_b[var10];
                                      var8 = 0;
                                      var12 = this.field_d[var11];
                                      array$2 = new int[var12];
                                      this.field_r[var11] = array$2;
                                      var13 = -1;
                                      var14 = 0;
                                      L23: while (true) {
                                        if (var14 >= var12) {
                                          L24: {
                                            this.field_k[var11] = 1 + var13;
                                            if (var12 != 1 + var13) {
                                              break L24;
                                            } else {
                                              this.field_r[var11] = null;
                                              break L24;
                                            }
                                          }
                                          var10++;
                                          continue L22;
                                        } else {
                                          dupTemp$3 = var8 + var18.d(-10355);
                                          var8 = dupTemp$3;
                                          dupTemp$4 = this.field_r[var11];
                                          dupTemp$4[var14] = dupTemp$3;
                                          var15 = dupTemp$3;
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
                                  this.field_d[this.field_b[var10]] = var18.d(-10355);
                                  var10++;
                                  continue L21;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (this.field_s <= var10) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (this.field_s <= var10) {
                                      break L20;
                                    } else {
                                      var11 = this.field_b[var10];
                                      var12 = this.field_d[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      array$5 = new int[var12];
                                      this.field_r[var11] = array$5;
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var12 <= var14) {
                                          L28: {
                                            this.field_k[var11] = 1 + var13;
                                            if (1 + var13 == var12) {
                                              this.field_r[var11] = null;
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            dupTemp$6 = var8 + var18.i(-25578);
                                            var8 = dupTemp$6;
                                            dupTemp$7 = this.field_r[var11];
                                            dupTemp$7[var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (var13 < var15) {
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
                                  this.field_d[this.field_b[var10]] = var18.i(-25578);
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
                              this.field_n = new int[1 + var9][];
                              this.field_f = new bc[1 + var9];
                              var10 = 0;
                              L31: while (true) {
                                if (this.field_s <= var10) {
                                  break L30;
                                } else {
                                  var11 = this.field_b[var10];
                                  var12 = this.field_d[var11];
                                  array$8 = new int[this.field_k[var11]];
                                  this.field_n[var11] = array$8;
                                  var13 = 0;
                                  L32: while (true) {
                                    if (var13 >= this.field_k[var11]) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var13 >= var12) {
                                          this.field_f[var11] = new bc(this.field_n[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (this.field_r[var11] == null) {
                                              var14 = var13;
                                              break L34;
                                            } else {
                                              var14 = this.field_r[var11][var13];
                                              break L34;
                                            }
                                          }
                                          this.field_n[var11][var14] = var18.f((byte) -107);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      this.field_n[var11][var13] = -1;
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
                          this.field_o[this.field_b[var10]] = var18.f((byte) -107);
                          var10++;
                          continue L19;
                        }
                      }
                    } else {
                      this.field_h[this.field_b[var10]] = var18.f((byte) -107);
                      var10++;
                      continue L15;
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
            stackIn_97_0 = (RuntimeException) (var3);

            stackIn_97_1 = new StringBuilder().append("km.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw qk.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ')');
        }
    }

    km(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_i = j.a(0, param0.length, param0);
            if (this.field_i != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (-65 != (param2.length ^ -1)) {
                    throw new RuntimeException();
                }
                this.field_a = tg.a(param0, param0.length, 0, 8);
                for (var4_int = 0; (var4_int ^ -1) > -65; var4_int++) {
                    if (param2[var4_int] != this.field_a[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(94, param0);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "km.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Names should contain a maximum of 12 characters";
        field_q = new pg[10];
        field_e = 1600;
    }
}
