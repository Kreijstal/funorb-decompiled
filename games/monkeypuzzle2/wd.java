/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    int[][] field_a;
    int[] field_m;
    int[] field_r;
    ie[] field_t;
    private byte[] field_c;
    int[] field_p;
    private int[] field_q;
    int field_e;
    static boolean field_g;
    int[] field_f;
    static pj field_h;
    int field_d;
    private int field_k;
    byte[][] field_n;
    int[] field_j;
    static ud field_i;
    int field_l;
    private int[][] field_o;
    ie field_b;
    static String field_s;

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
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
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
        gk var17 = null;
        byte[] var21 = null;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new gk(rc.a(param1, 115));
              var4 = var17.a((byte) 114);
              if (-6 < (var4 ^ -1)) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 >= 6) {
                      this.field_l = var17.e(param0 ^ 16076);
                      break L2;
                    } else {
                      this.field_l = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.a((byte) 114);
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
                    if (7 > var4) {
                      this.field_k = var17.j(17277);
                      break L4;
                    } else {
                      this.field_k = var17.m(param0 + -41191);
                      break L4;
                    }
                  }
                  L5: {
                    if (-1 == (var5 & 2 ^ -1)) {
                      stackIn_17_0 = 0;
                      break L5;
                    } else {
                      stackIn_17_0 = 1;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_17_0;
                    if (param0 == 16050) {
                      break L6;
                    } else {
                      this.field_j = (int[]) null;
                      break L6;
                    }
                  }
                  L7: {
                    var8 = 0;
                    this.field_f = new int[this.field_k];
                    var9 = -1;
                    if (7 <= var4) {
                      var10 = 0;
                      L8: while (true) {
                        if (var10 >= this.field_k) {
                          break L7;
                        } else {
                          L9: {
                            dupTemp$0 = var8 + var17.m(gi.a(param0, -23687));
                            var8 = dupTemp$0;
                            this.field_f[var10] = dupTemp$0;
                            if (this.field_f[var10] > var9) {
                              var9 = this.field_f[var10];
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10++;
                          continue L8;
                        }
                      }
                    } else {
                      var10 = 0;
                      L10: while (true) {
                        if (var10 >= this.field_k) {
                          break L7;
                        } else {
                          dupTemp$1 = var8 + var17.j(gi.a(param0, 32207));
                          var8 = dupTemp$1;
                          this.field_f[var10] = dupTemp$1;
                          if (this.field_f[var10] > var9) {
                            var9 = this.field_f[var10];
                            var10++;
                            continue L10;
                          } else {
                            var10++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    this.field_e = 1 + var9;
                    if (var7 == 0) {
                      break L11;
                    } else {
                      this.field_n = new byte[this.field_e][];
                      break L11;
                    }
                  }
                  L12: {
                    this.field_j = new int[this.field_e];
                    this.field_r = new int[this.field_e];
                    this.field_m = new int[this.field_e];
                    this.field_p = new int[this.field_e];
                    this.field_a = new int[this.field_e][];
                    if (var6 != 0) {
                      this.field_q = new int[this.field_e];
                      var10 = 0;
                      L13: while (true) {
                        if (var10 >= this.field_e) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= this.field_k) {
                              this.field_b = new ie(this.field_q);
                              break L12;
                            } else {
                              this.field_q[this.field_f[var10]] = var17.e(127);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          this.field_q[var10] = -1;
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
                    if (var10 >= this.field_k) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (this.field_k <= var10) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(var21, 64, -91, 0);
                              this.field_n[this.field_f[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= this.field_k) {
                          L19: {
                            if (7 <= var4) {
                              var10 = 0;
                              L20: while (true) {
                                if (var10 >= this.field_k) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (var10 >= this.field_k) {
                                      break L19;
                                    } else {
                                      var11 = this.field_f[var10];
                                      var12 = this.field_m[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      array$2 = new int[var12];
                                      this.field_a[var11] = array$2;
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var12 <= var14) {
                                          L23: {
                                            this.field_r[var11] = var13 + 1;
                                            if (var13 - -1 != var12) {
                                              break L23;
                                            } else {
                                              this.field_a[var11] = null;
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            dupTemp$3 = var8 + var17.m(-25141);
                                            var8 = dupTemp$3;
                                            dupTemp$4 = this.field_a[var11];
                                            dupTemp$4[var14] = dupTemp$3;
                                            var15 = dupTemp$3;
                                            if ((var13 ^ -1) > (var15 ^ -1)) {
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
                                  this.field_m[this.field_f[var10]] = var17.m(-25141);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (this.field_k <= var10) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (this.field_k <= var10) {
                                      break L19;
                                    } else {
                                      var11 = this.field_f[var10];
                                      var8 = 0;
                                      var12 = this.field_m[var11];
                                      array$5 = new int[var12];
                                      this.field_a[var11] = array$5;
                                      var13 = -1;
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var12 <= var14) {
                                          L28: {
                                            this.field_r[var11] = 1 + var13;
                                            if (var13 - -1 == var12) {
                                              this.field_a[var11] = null;
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            dupTemp$6 = var8 + var17.j(17277);
                                            var8 = dupTemp$6;
                                            dupTemp$7 = this.field_a[var11];
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
                                  this.field_m[this.field_f[var10]] = var17.j(param0 + 1227);
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
                              this.field_o = new int[1 + var9][];
                              this.field_t = new ie[var9 + 1];
                              var10 = 0;
                              L31: while (true) {
                                if (var10 >= this.field_k) {
                                  break L30;
                                } else {
                                  var11 = this.field_f[var10];
                                  var12 = this.field_m[var11];
                                  array$8 = new int[this.field_r[var11]];
                                  this.field_o[var11] = array$8;
                                  var13 = 0;
                                  L32: while (true) {
                                    if (this.field_r[var11] <= var13) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var13 >= var12) {
                                          this.field_t[var11] = new ie(this.field_o[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (null != this.field_a[var11]) {
                                              var14 = this.field_a[var11][var13];
                                              break L34;
                                            } else {
                                              var14 = var13;
                                              break L34;
                                            }
                                          }
                                          this.field_o[var11][var14] = var17.e(-99);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      this.field_o[var11][var13] = -1;
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
                          this.field_p[this.field_f[var10]] = var17.e(-31);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      this.field_j[this.field_f[var10]] = var17.e(-36);
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
            stackIn_98_0 = (RuntimeException) (var3);

            stackIn_98_1 = new StringBuilder().append("wd.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_99_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackIn_99_2 = "null";
              break L35;
            } else {
              stackIn_99_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackIn_99_2 = "{...}";
              break L35;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_99_0), stackIn_99_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_h = null;
        field_i = null;
        field_s = null;
    }

    final static void a(int param0, boolean param1) {
        ug var2 = null;
        int var3 = 0;
        mk var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (mk) ((Object) eb.field_C.a((byte) -117));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param1) {
                    break L2;
                  } else {
                    field_i = (ud) null;
                    break L2;
                  }
                }
                var2 = t.field_v.a((byte) -117);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    lf.a(25197, param0);
                    var2 = t.field_v.d((byte) 63);
                    continue L3;
                  }
                }
              } else {
                fc.a(var4, (byte) 108, param0);
                var4 = (mk) ((Object) eb.field_C.d((byte) 63));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "wd.C(" + param0 + ',' + param1 + ')');
        }
    }

    wd(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_d = w.a(param0.length, param0, -18694);
            if (param1 != this.field_d) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (-65 != (param2.length ^ -1)) {
                    throw new RuntimeException();
                }
                this.field_c = ie.a(-106, param0, param0.length, 0);
                for (var4_int = 0; -65 < (var4_int ^ -1); var4_int++) {
                    if (param2[var4_int] != this.field_c[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(16050, param0);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "wd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = false;
        field_h = new pj();
        field_s = "Create your own free Jagex account";
    }
}
