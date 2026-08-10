/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    int[] field_a;
    static db field_u;
    static String field_g;
    static String[] field_p;
    private int[] field_l;
    int[] field_m;
    el field_b;
    int field_i;
    private byte[] field_v;
    static String field_h;
    int[][] field_n;
    int[] field_f;
    el[] field_c;
    static String field_e;
    private int field_k;
    int[] field_r;
    int field_s;
    int[] field_t;
    static int field_q;
    int field_d;
    byte[][] field_o;
    private int[][] field_j;

    public static void a(int param0) {
        if (param0 != 1) {
            field_q = 62;
        }
        field_g = null;
        field_p = null;
        field_e = null;
        field_h = null;
        field_u = null;
    }

    final static tf a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        tf var7 = null;
        int var8 = 0;
        tf stackIn_4_0 = null;
        tf stackIn_7_0 = null;
        tf stackIn_10_0 = null;
        tf stackIn_14_0 = null;
        tf stackIn_20_0 = null;
        tf stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (0 == var2_int) {
              stackIn_4_0 = w.field_k;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) >= -256) {
                if (param1 < -69) {
                  var3 = dc.a(param0, '.', (byte) -125);
                  if (2 > var3.length) {
                    stackIn_14_0 = w.field_k;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var4 = var3;
                    var5 = 0;
                    L1: while (true) {
                      if (var4.length <= var5) {
                        stackIn_23_0 = bg.a(var3[var3.length - 1], -21637);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var6 = var4[var5];
                        var7 = nc.a(63, var6);
                        if (var7 != null) {
                          stackIn_20_0 = (tf) (var7);
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    }
                  }
                } else {
                  stackIn_10_0 = (tf) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = vi.field_l;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("e.A(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L2;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  return stackIn_23_0;
                }
              }
            }
          }
        }
    }

    final static byte[] a(String param0, boolean param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              stackIn_4_0 = th.field_u.a((byte) 127, param0, "");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("e.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(boolean param0, byte[] param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        wf stackIn_5_0 = null;
        wf stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
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
        wf var17 = null;
        byte[] var21 = null;
        var16 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_m = (int[]) null;
                break L1;
              }
            }
            L2: {
              var17 = new wf(qk.a(-121, param1));
              stackIn_5_0 = (wf) (var17);

              if (param0) {
                stackIn_6_0 = (wf) ((Object) stackIn_5_0);
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = (wf) ((Object) stackIn_5_0);
                stackIn_6_1 = 1;
                break L2;
              }
            }
            L3: {
              var4 = ((wf) (Object) stackIn_6_0).d(stackIn_6_1 != 0);
              if (5 > var4) {
                break L3;
              } else {
                if ((var4 ^ -1) >= -8) {
                  L4: {
                    if ((var4 ^ -1) > -7) {
                      this.field_s = 0;
                      break L4;
                    } else {
                      this.field_s = var17.d((byte) 19);
                      break L4;
                    }
                  }
                  L5: {
                    var5 = var17.d(true);
                    if ((var5 & 1) == 0) {
                      stackIn_16_0 = 0;
                      break L5;
                    } else {
                      stackIn_16_0 = 1;
                      break L5;
                    }
                  }
                  L6: {
                    var6 = stackIn_16_0;
                    if (0 == (2 & var5)) {
                      stackIn_19_0 = 0;
                      break L6;
                    } else {
                      stackIn_19_0 = 1;
                      break L6;
                    }
                  }
                  L7: {
                    var7 = stackIn_19_0;
                    if (var4 >= 7) {
                      this.field_k = var17.a((byte) 50);
                      break L7;
                    } else {
                      this.field_k = var17.b(-1698573656);
                      break L7;
                    }
                  }
                  L8: {
                    var8 = 0;
                    var9 = -1;
                    this.field_f = new int[this.field_k];
                    if (-8 < (var4 ^ -1)) {
                      var10 = 0;
                      L9: while (true) {
                        if (var10 >= this.field_k) {
                          break L8;
                        } else {
                          dupTemp$0 = var8 + var17.b(-1698573656);
                          var8 = dupTemp$0;
                          this.field_f[var10] = dupTemp$0;
                          if (this.field_f[var10] > var9) {
                            var9 = this.field_f[var10];
                            var10++;
                            continue L9;
                          } else {
                            var10++;
                            continue L9;
                          }
                        }
                      }
                    } else {
                      var10 = 0;
                      L10: while (true) {
                        if (this.field_k <= var10) {
                          break L8;
                        } else {
                          dupTemp$1 = var8 + var17.a((byte) 50);
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
                    this.field_d = 1 + var9;
                    this.field_n = new int[this.field_d][];
                    this.field_t = new int[this.field_d];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      this.field_o = new byte[this.field_d][];
                      break L11;
                    }
                  }
                  L12: {
                    this.field_r = new int[this.field_d];
                    this.field_a = new int[this.field_d];
                    this.field_m = new int[this.field_d];
                    if (var6 != 0) {
                      this.field_l = new int[this.field_d];
                      var10 = 0;
                      L13: while (true) {
                        if (this.field_d <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= this.field_k) {
                              this.field_b = new el(this.field_l);
                              break L12;
                            } else {
                              this.field_l[this.field_f[var10]] = var17.d((byte) 19);
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
                    } else {
                      break L12;
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (var10 >= this.field_k) {
                      L16: {
                        if (var7 != 0) {
                          var10 = 0;
                          L17: while (true) {
                            if (this.field_k <= var10) {
                              var10 = 0;
                              L18: while (true) {
                                if (var10 >= this.field_k) {
                                  break L16;
                                } else {
                                  this.field_t[this.field_f[var10]] = var17.d((byte) 19);
                                  var10++;
                                  continue L18;
                                }
                              }
                            } else {
                              var21 = new byte[64];
                              var17.a(110, 64, 0, var21);
                              this.field_o[this.field_f[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L19: while (true) {
                            if (var10 >= this.field_k) {
                              break L16;
                            } else {
                              this.field_t[this.field_f[var10]] = var17.d((byte) 19);
                              var10++;
                              continue L19;
                            }
                          }
                        }
                      }
                      L20: {
                        if (var4 >= 7) {
                          var10 = 0;
                          L21: while (true) {
                            if (this.field_k <= var10) {
                              var10 = 0;
                              L22: while (true) {
                                if (this.field_k <= var10) {
                                  break L20;
                                } else {
                                  var11 = this.field_f[var10];
                                  var8 = 0;
                                  var12 = this.field_m[var11];
                                  var13 = -1;
                                  array$2 = new int[var12];
                                  this.field_n[var11] = array$2;
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var12 <= var14) {
                                      L24: {
                                        this.field_a[var11] = var13 + 1;
                                        if (var12 != var13 + 1) {
                                          break L24;
                                        } else {
                                          this.field_n[var11] = null;
                                          break L24;
                                        }
                                      }
                                      var10++;
                                      continue L22;
                                    } else {
                                      L25: {
                                        dupTemp$3 = var8 + var17.a((byte) 50);
                                        var8 = dupTemp$3;
                                        dupTemp$4 = this.field_n[var11];
                                        dupTemp$4[var14] = dupTemp$3;
                                        var15 = dupTemp$3;
                                        if (var13 < var15) {
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
                              this.field_m[this.field_f[var10]] = var17.a((byte) 50);
                              var10++;
                              continue L21;
                            }
                          }
                        } else {
                          var10 = 0;
                          L26: while (true) {
                            if (var10 >= this.field_k) {
                              var10 = 0;
                              L27: while (true) {
                                if (this.field_k <= var10) {
                                  break L20;
                                } else {
                                  var11 = this.field_f[var10];
                                  var8 = 0;
                                  var12 = this.field_m[var11];
                                  var13 = -1;
                                  array$5 = new int[var12];
                                  this.field_n[var11] = array$5;
                                  var14 = 0;
                                  L28: while (true) {
                                    if (var14 >= var12) {
                                      L29: {
                                        this.field_a[var11] = var13 - -1;
                                        if (var12 == var13 + 1) {
                                          this.field_n[var11] = null;
                                          break L29;
                                        } else {
                                          break L29;
                                        }
                                      }
                                      var10++;
                                      continue L27;
                                    } else {
                                      dupTemp$6 = var8 + var17.b(-1698573656);
                                      var8 = dupTemp$6;
                                      dupTemp$7 = this.field_n[var11];
                                      dupTemp$7[var14] = dupTemp$6;
                                      var15 = dupTemp$6;
                                      if ((var13 ^ -1) > (var15 ^ -1)) {
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
                              this.field_m[this.field_f[var10]] = var17.b(-1698573656);
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
                          this.field_j = new int[1 + var9][];
                          this.field_c = new el[1 + var9];
                          var10 = 0;
                          L31: while (true) {
                            if (var10 >= this.field_k) {
                              break L30;
                            } else {
                              var11 = this.field_f[var10];
                              var12 = this.field_m[var11];
                              array$8 = new int[this.field_a[var11]];
                              this.field_j[var11] = array$8;
                              var13 = 0;
                              L32: while (true) {
                                if (this.field_a[var11] <= var13) {
                                  var13 = 0;
                                  L33: while (true) {
                                    if (var13 >= var12) {
                                      this.field_c[var11] = new el(this.field_j[var11]);
                                      var10++;
                                      continue L31;
                                    } else {
                                      L34: {
                                        if (this.field_n[var11] != null) {
                                          var14 = this.field_n[var11][var13];
                                          break L34;
                                        } else {
                                          var14 = var13;
                                          break L34;
                                        }
                                      }
                                      this.field_j[var11][var14] = var17.d((byte) 19);
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
                      this.field_r[this.field_f[var10]] = var17.d((byte) 19);
                      var10++;
                      continue L15;
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var3 = decompiledCaughtException;
            stackIn_102_0 = (RuntimeException) (var3);

            stackIn_102_1 = new StringBuilder().append("e.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_103_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackIn_103_2 = "null";
              break L35;
            } else {
              stackIn_103_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackIn_103_2 = "{...}";
              break L35;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_103_0), stackIn_103_2 + ')');
        }
    }

    e(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_i = oe.a(101, param0, param0.length);
            if (param1 != this.field_i) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                this.field_v = si.a(0, param0, -110, param0.length);
                for (var4_int = 0; -65 < (var4_int ^ -1); var4_int++) {
                    if (this.field_v[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(false, param0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Unable to connect to the data server. Please check any firewall you are using.";
        field_p = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_h = "Waiting for sound effects";
        field_e = "Return to game";
        field_q = 4;
    }
}
