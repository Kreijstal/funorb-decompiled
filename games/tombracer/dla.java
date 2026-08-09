/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dla {
    int field_d;
    int field_l;
    int[] field_f;
    private int[][] field_m;
    int[] field_k;
    pla[] field_e;
    pla field_b;
    int[][] field_n;
    private int field_o;
    int[] field_p;
    int[] field_c;
    int[] field_j;
    private byte[] field_i;
    private int[] field_g;
    int field_a;
    byte[][] field_h;

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
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        int decompiledRegionSelector0 = 0;
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
        uia var17 = null;
        byte[] var21 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var17 = new uia(sua.a(param1, -106));
            if (param0 == -23918) {
              L1: {
                var4 = var17.h(255);
                if (5 > var4) {
                  break L1;
                } else {
                  if (var4 <= 7) {
                    L2: {
                      if (6 <= var4) {
                        this.field_a = var17.e(param0 ^ 23871);
                        break L2;
                      } else {
                        this.field_a = 0;
                        break L2;
                      }
                    }
                    L3: {
                      var5 = var17.h(255);
                      if (0 == (1 & var5)) {
                        stackIn_13_0 = 0;
                        break L3;
                      } else {
                        stackIn_13_0 = 1;
                        break L3;
                      }
                    }
                    L4: {
                      var6 = stackIn_13_0;
                      if (0 == (2 & var5)) {
                        stackIn_16_0 = 0;
                        break L4;
                      } else {
                        stackIn_16_0 = 1;
                        break L4;
                      }
                    }
                    L5: {
                      var7 = stackIn_16_0;
                      if (-8 < (var4 ^ -1)) {
                        this.field_o = var17.d(127);
                        break L5;
                      } else {
                        this.field_o = var17.g(-48);
                        break L5;
                      }
                    }
                    L6: {
                      var8 = 0;
                      var9 = -1;
                      this.field_k = new int[this.field_o];
                      if (7 > var4) {
                        var10 = 0;
                        L7: while (true) {
                          if (var10 >= this.field_o) {
                            break L6;
                          } else {
                            L8: {
                              dupTemp$0 = var8 + var17.d(125);
                              var8 = dupTemp$0;
                              this.field_k[var10] = dupTemp$0;
                              if ((this.field_k[var10] ^ -1) < (var9 ^ -1)) {
                                var9 = this.field_k[var10];
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
                          if (this.field_o <= var10) {
                            break L6;
                          } else {
                            L10: {
                              dupTemp$1 = var8 + var17.g(-48);
                              var8 = dupTemp$1;
                              this.field_k[var10] = dupTemp$1;
                              if (var9 < this.field_k[var10]) {
                                var9 = this.field_k[var10];
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
                      this.field_l = var9 - -1;
                      this.field_f = new int[this.field_l];
                      if (var7 != 0) {
                        this.field_h = new byte[this.field_l][];
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      this.field_c = new int[this.field_l];
                      this.field_p = new int[this.field_l];
                      this.field_n = new int[this.field_l][];
                      this.field_j = new int[this.field_l];
                      if (var6 != 0) {
                        this.field_g = new int[this.field_l];
                        var10 = 0;
                        L13: while (true) {
                          if (var10 >= this.field_l) {
                            var10 = 0;
                            L14: while (true) {
                              if (this.field_o <= var10) {
                                this.field_b = new pla(this.field_g);
                                break L12;
                              } else {
                                this.field_g[this.field_k[var10]] = var17.e(119);
                                var10++;
                                continue L14;
                              }
                            }
                          } else {
                            this.field_g[var10] = -1;
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
                      if (this.field_o <= var10) {
                        L16: {
                          if (var7 != 0) {
                            var10 = 0;
                            L17: while (true) {
                              if (this.field_o <= var10) {
                                var10 = 0;
                                L18: while (true) {
                                  if (this.field_o <= var10) {
                                    break L16;
                                  } else {
                                    this.field_f[this.field_k[var10]] = var17.e(95);
                                    var10++;
                                    continue L18;
                                  }
                                }
                              } else {
                                var21 = new byte[64];
                                var17.a(var21, 0, -106, 64);
                                this.field_h[this.field_k[var10]] = var21;
                                var10++;
                                continue L17;
                              }
                            }
                          } else {
                            var10 = 0;
                            L19: while (true) {
                              if (this.field_o <= var10) {
                                break L16;
                              } else {
                                this.field_f[this.field_k[var10]] = var17.e(95);
                                var10++;
                                continue L19;
                              }
                            }
                          }
                        }
                        L20: {
                          if ((var4 ^ -1) <= -8) {
                            var10 = 0;
                            L21: while (true) {
                              if (this.field_o <= var10) {
                                var10 = 0;
                                L22: while (true) {
                                  if (this.field_o <= var10) {
                                    break L20;
                                  } else {
                                    var11 = this.field_k[var10];
                                    var8 = 0;
                                    var12 = this.field_c[var11];
                                    var13 = -1;
                                    array$2 = new int[var12];
                                    this.field_n[var11] = array$2;
                                    var14 = 0;
                                    L23: while (true) {
                                      if (var14 >= var12) {
                                        L24: {
                                          this.field_p[var11] = var13 + 1;
                                          if (1 + var13 != var12) {
                                            break L24;
                                          } else {
                                            this.field_n[var11] = null;
                                            break L24;
                                          }
                                        }
                                        var10++;
                                        continue L22;
                                      } else {
                                        dupTemp$3 = var8 + var17.g(-48);
                                        var8 = dupTemp$3;
                                        dupTemp$4 = this.field_n[var11];
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
                                this.field_c[this.field_k[var10]] = var17.g(-48);
                                var10++;
                                continue L21;
                              }
                            }
                          } else {
                            var10 = 0;
                            L25: while (true) {
                              if (this.field_o <= var10) {
                                var10 = 0;
                                L26: while (true) {
                                  if (this.field_o <= var10) {
                                    break L20;
                                  } else {
                                    var11 = this.field_k[var10];
                                    var12 = this.field_c[var11];
                                    var8 = 0;
                                    var13 = -1;
                                    array$5 = new int[var12];
                                    this.field_n[var11] = array$5;
                                    var14 = 0;
                                    L27: while (true) {
                                      if (var12 <= var14) {
                                        L28: {
                                          this.field_p[var11] = var13 + 1;
                                          if (var12 == 1 + var13) {
                                            this.field_n[var11] = null;
                                            break L28;
                                          } else {
                                            break L28;
                                          }
                                        }
                                        var10++;
                                        continue L26;
                                      } else {
                                        dupTemp$6 = var8 + var17.d(123);
                                        var8 = dupTemp$6;
                                        dupTemp$7 = this.field_n[var11];
                                        dupTemp$7[var14] = dupTemp$6;
                                        var15 = dupTemp$6;
                                        if (var13 < var15) {
                                          var13 = var15;
                                          var14++;
                                          continue L27;
                                        } else {
                                          var14++;
                                          continue L27;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                this.field_c[this.field_k[var10]] = var17.d(123);
                                var10++;
                                continue L25;
                              }
                            }
                          }
                        }
                        L29: {
                          if (var6 != 0) {
                            this.field_e = new pla[var9 - -1];
                            this.field_m = new int[1 + var9][];
                            var10 = 0;
                            L30: while (true) {
                              if (var10 >= this.field_o) {
                                break L29;
                              } else {
                                var11 = this.field_k[var10];
                                var12 = this.field_c[var11];
                                array$8 = new int[this.field_p[var11]];
                                this.field_m[var11] = array$8;
                                var13 = 0;
                                L31: while (true) {
                                  if (this.field_p[var11] <= var13) {
                                    var13 = 0;
                                    L32: while (true) {
                                      if (var13 >= var12) {
                                        this.field_e[var11] = new pla(this.field_m[var11]);
                                        var10++;
                                        continue L30;
                                      } else {
                                        L33: {
                                          if (null == this.field_n[var11]) {
                                            var14 = var13;
                                            break L33;
                                          } else {
                                            var14 = this.field_n[var11][var13];
                                            break L33;
                                          }
                                        }
                                        this.field_m[var11][var14] = var17.e(kha.b(param0, 23927));
                                        var13++;
                                        continue L32;
                                      }
                                    }
                                  } else {
                                    this.field_m[var11][var13] = -1;
                                    var13++;
                                    continue L31;
                                  }
                                }
                              }
                            }
                          } else {
                            break L29;
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        this.field_j[this.field_k[var10]] = var17.e(-69);
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
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var3 = decompiledCaughtException;
            stackIn_102_0 = (RuntimeException) (var3);

            stackIn_102_1 = new StringBuilder().append("dla.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_103_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackIn_103_2 = "null";
              break L34;
            } else {
              stackIn_103_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackIn_103_2 = "{...}";
              break L34;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_103_0), stackIn_103_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0) {
        if (cga.field_f < 2) {
          return 0;
        } else {
          L0: {
            if (bg.field_t == 0) {
              if (!tk.field_b.b(-100)) {
                return 20;
              } else {
                if (tk.field_b.c("commonui", param0 ^ -122)) {
                  if (!hm.field_n.b(param0 + -100)) {
                    return 50;
                  } else {
                    if (hm.field_n.c("commonui", -126)) {
                      if (!vc.field_p.b(param0 ^ -123)) {
                        return 70;
                      } else {
                        if (!vc.field_p.a(0)) {
                          return 80;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      return 60;
                    }
                  }
                } else {
                  return 40;
                }
              }
            } else {
              L1: {
                if (nja.field_J != null) {
                  if (nja.field_J.b(-37)) {
                    if (nja.field_J.a("", 127)) {
                      if (nja.field_J.c("", -127)) {
                        break L1;
                      } else {
                        return 29;
                      }
                    } else {
                      return 29;
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L1;
                }
              }
              if (tk.field_b.b(param0 + -130)) {
                if (tk.field_b.c("commonui", -128)) {
                  if (hm.field_n.b(param0 + -42)) {
                    if (hm.field_n.c("commonui", -124)) {
                      if (vc.field_p.b(-128)) {
                        if (vc.field_p.a(0)) {
                          break L0;
                        } else {
                          return 86;
                        }
                      } else {
                        return 82;
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                } else {
                  return 57;
                }
              } else {
                return 43;
              }
            }
          }
          if (param0 == 7) {
            return 100;
          } else {
            return 91;
          }
        }
    }

    final static void b(int param0) {
        if (!(!vo.field_b)) {
            bea.d(bea.field_b, bea.field_h, bea.field_d + -bea.field_b, bea.field_k + -bea.field_h);
            rua.field_gb.b(36, false);
        }
        if (param0 != 23713) {
            dla.a(120);
        }
    }

    dla(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_d = sq.a(param0.length, param0, (byte) -124);
            if (param1 != this.field_d) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if ((param2.length ^ -1) != -65) {
                    throw new RuntimeException();
                }
                this.field_i = fja.a(param0.length, param0, 0, 8);
                for (var4_int = 0; -65 < (var4_int ^ -1); var4_int++) {
                    if (this.field_i[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(-23918, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
