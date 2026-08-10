/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    qq field_d;
    static String field_m;
    static String field_k;
    static String field_f;
    int[][] field_i;
    int[] field_l;
    private byte[] field_g;
    int field_h;
    int[] field_s;
    int field_o;
    private int[][] field_c;
    byte[][] field_a;
    int[] field_p;
    int field_e;
    qq[] field_n;
    private int field_q;
    int[] field_b;
    private int[] field_j;
    int[] field_r;

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
        int stackIn_14_0 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
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
        k var17 = null;
        byte[] var21 = null;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new k(hb.a(param1, param0));
              var4 = var17.g(31365);
              if (5 > var4) {
                break L1;
              } else {
                if (7 >= var4) {
                  L2: {
                    if (-7 >= (var4 ^ -1)) {
                      this.field_h = var17.i(param0 ^ -1478490344);
                      break L2;
                    } else {
                      this.field_h = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.g(31365);
                    if (0 == (1 & var5)) {
                      stackIn_11_0 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if (-1 == (var5 & 2 ^ -1)) {
                      stackIn_14_0 = 0;
                      break L4;
                    } else {
                      stackIn_14_0 = 1;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_14_0;
                    if (-8 < (var4 ^ -1)) {
                      this.field_q = var17.d((byte) 69);
                      break L5;
                    } else {
                      this.field_q = var17.e((byte) -49);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    this.field_l = new int[this.field_q];
                    var9 = -1;
                    if (var4 >= 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= this.field_q) {
                          break L6;
                        } else {
                          dupTemp$0 = var8 + var17.e((byte) -49);
                          var8 = dupTemp$0;
                          this.field_l[var10] = dupTemp$0;
                          if (this.field_l[var10] > var9) {
                            var9 = this.field_l[var10];
                            var10++;
                            continue L7;
                          } else {
                            var10++;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      var10 = 0;
                      L8: while (true) {
                        if (this.field_q <= var10) {
                          break L6;
                        } else {
                          dupTemp$1 = var8 + var17.d((byte) 69);
                          var8 = dupTemp$1;
                          this.field_l[var10] = dupTemp$1;
                          if ((this.field_l[var10] ^ -1) < (var9 ^ -1)) {
                            var9 = this.field_l[var10];
                            var10++;
                            continue L8;
                          } else {
                            var10++;
                            continue L8;
                          }
                        }
                      }
                    }
                  }
                  L9: {
                    this.field_e = var9 - -1;
                    this.field_r = new int[this.field_e];
                    this.field_p = new int[this.field_e];
                    this.field_s = new int[this.field_e];
                    this.field_b = new int[this.field_e];
                    if (var7 == 0) {
                      break L9;
                    } else {
                      this.field_a = new byte[this.field_e][];
                      break L9;
                    }
                  }
                  L10: {
                    this.field_i = new int[this.field_e][];
                    if (var6 != 0) {
                      this.field_j = new int[this.field_e];
                      var10 = 0;
                      L11: while (true) {
                        if (var10 >= this.field_e) {
                          var10 = 0;
                          L12: while (true) {
                            if (this.field_q <= var10) {
                              this.field_d = new qq(this.field_j);
                              break L10;
                            } else {
                              this.field_j[this.field_l[var10]] = var17.i(param0 + -1478490344);
                              var10++;
                              continue L12;
                            }
                          }
                        } else {
                          this.field_j[var10] = -1;
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                  var10 = 0;
                  L13: while (true) {
                    if (this.field_q <= var10) {
                      L14: {
                        if (var7 != 0) {
                          var10 = 0;
                          L15: while (true) {
                            if (this.field_q <= var10) {
                              var10 = 0;
                              L16: while (true) {
                                if (this.field_q <= var10) {
                                  break L14;
                                } else {
                                  this.field_p[this.field_l[var10]] = var17.i(vg.a(param0, -1478490344));
                                  var10++;
                                  continue L16;
                                }
                              }
                            } else {
                              var21 = new byte[64];
                              var17.a(0, param0 + -6351, 64, var21);
                              this.field_a[this.field_l[var10]] = var21;
                              var10++;
                              continue L15;
                            }
                          }
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (this.field_q <= var10) {
                              break L14;
                            } else {
                              this.field_p[this.field_l[var10]] = var17.i(vg.a(param0, -1478490344));
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      L18: {
                        if ((var4 ^ -1) <= -8) {
                          var10 = 0;
                          L19: while (true) {
                            if (var10 >= this.field_q) {
                              var10 = 0;
                              L20: while (true) {
                                if (this.field_q <= var10) {
                                  break L18;
                                } else {
                                  var11 = this.field_l[var10];
                                  var12 = this.field_s[var11];
                                  var8 = 0;
                                  array$2 = new int[var12];
                                  this.field_i[var11] = array$2;
                                  var13 = -1;
                                  var14 = 0;
                                  L21: while (true) {
                                    if (var12 <= var14) {
                                      L22: {
                                        this.field_b[var11] = 1 + var13;
                                        if (var13 - -1 != var12) {
                                          break L22;
                                        } else {
                                          this.field_i[var11] = null;
                                          break L22;
                                        }
                                      }
                                      var10++;
                                      continue L20;
                                    } else {
                                      dupTemp$3 = var8 + var17.e((byte) -49);
                                      var8 = dupTemp$3;
                                      dupTemp$4 = this.field_i[var11];
                                      dupTemp$4[var14] = dupTemp$3;
                                      var15 = dupTemp$3;
                                      if (var15 > var13) {
                                        var13 = var15;
                                        var14++;
                                        continue L21;
                                      } else {
                                        var14++;
                                        continue L21;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              this.field_s[this.field_l[var10]] = var17.e((byte) -49);
                              var10++;
                              continue L19;
                            }
                          }
                        } else {
                          var10 = 0;
                          L23: while (true) {
                            if (this.field_q <= var10) {
                              var10 = 0;
                              L24: while (true) {
                                if (this.field_q <= var10) {
                                  break L18;
                                } else {
                                  var11 = this.field_l[var10];
                                  var12 = this.field_s[var11];
                                  var8 = 0;
                                  array$5 = new int[var12];
                                  this.field_i[var11] = array$5;
                                  var13 = -1;
                                  var14 = 0;
                                  L25: while (true) {
                                    if (var12 <= var14) {
                                      L26: {
                                        this.field_b[var11] = 1 + var13;
                                        if (var13 - -1 != var12) {
                                          break L26;
                                        } else {
                                          this.field_i[var11] = null;
                                          break L26;
                                        }
                                      }
                                      var10++;
                                      continue L24;
                                    } else {
                                      L27: {
                                        dupTemp$6 = var8 + var17.d((byte) 69);
                                        var8 = dupTemp$6;
                                        dupTemp$7 = this.field_i[var11];
                                        dupTemp$7[var14] = dupTemp$6;
                                        var15 = dupTemp$6;
                                        if (var15 > var13) {
                                          var13 = var15;
                                          break L27;
                                        } else {
                                          break L27;
                                        }
                                      }
                                      var14++;
                                      continue L25;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.field_s[this.field_l[var10]] = var17.d((byte) 69);
                              var10++;
                              continue L23;
                            }
                          }
                        }
                      }
                      L28: {
                        if (var6 == 0) {
                          break L28;
                        } else {
                          this.field_n = new qq[1 + var9];
                          this.field_c = new int[1 + var9][];
                          var10 = 0;
                          L29: while (true) {
                            if (var10 >= this.field_q) {
                              break L28;
                            } else {
                              var11 = this.field_l[var10];
                              var12 = this.field_s[var11];
                              array$8 = new int[this.field_b[var11]];
                              this.field_c[var11] = array$8;
                              var13 = 0;
                              L30: while (true) {
                                if (var13 >= this.field_b[var11]) {
                                  var13 = 0;
                                  L31: while (true) {
                                    if (var13 >= var12) {
                                      this.field_n[var11] = new qq(this.field_c[var11]);
                                      var10++;
                                      continue L29;
                                    } else {
                                      L32: {
                                        if (this.field_i[var11] == null) {
                                          var14 = var13;
                                          break L32;
                                        } else {
                                          var14 = this.field_i[var11][var13];
                                          break L32;
                                        }
                                      }
                                      this.field_c[var11][var14] = var17.i(-1478490344);
                                      var13++;
                                      continue L31;
                                    }
                                  }
                                } else {
                                  this.field_c[var11][var13] = -1;
                                  var13++;
                                  continue L30;
                                }
                              }
                            }
                          }
                        }
                      }
                      break L0;
                    } else {
                      this.field_r[this.field_l[var10]] = var17.i(param0 + -1478490344);
                      var10++;
                      continue L13;
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
            stackIn_96_0 = (RuntimeException) (var3);

            stackIn_96_1 = new StringBuilder().append("be.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_97_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackIn_97_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackIn_97_2 = "null";
              break L33;
            } else {
              stackIn_97_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackIn_97_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackIn_97_2 = "{...}";
              break L33;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_97_0), stackIn_97_2 + ')');
        }
    }

    final static void a(long param0, boolean param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            try {
              L0: {
                L1: {
                  if (param1) {
                    break L1;
                  } else {
                    field_f = (String) null;
                    break L1;
                  }
                }
                Thread.sleep(param0);
                break L0;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_m = null;
        if (param0 != 0) {
            field_f = (String) null;
        }
        field_k = null;
    }

    be(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_o = pb.a(param0, param0.length, (byte) -120);
            if (this.field_o != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                this.field_g = ho.a(4246, 0, param0, param0.length);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (this.field_g[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(0, param0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "be.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Hide chat to continue";
        field_k = "Asking to join <%0>'s game...";
        field_f = "No";
    }
}
