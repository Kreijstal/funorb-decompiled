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
        tf stackIn_12_0 = null;
        tf stackIn_18_0 = null;
        tf stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        tf stackOut_3_0 = null;
        tf stackOut_11_0 = null;
        tf stackOut_20_0 = null;
        tf stackOut_17_0 = null;
        tf stackOut_6_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (0 == var2_int) {
              stackOut_3_0 = w.field_k;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (var2_int <= 255) {
                var3 = dc.a(param0, '.', (byte) -125);
                if (2 > var3.length) {
                  stackOut_11_0 = w.field_k;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      stackOut_20_0 = bg.a(var3[var3.length - 1], -21637);
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = nc.a(63, var6);
                      if (var7 != null) {
                        stackOut_17_0 = (tf) var7;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                stackOut_6_0 = vi.field_l;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("e.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + -101 + 41);
        }
        return stackIn_21_0;
    }

    final static byte[] a(String param0, boolean param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1) {
              stackOut_3_0 = th.field_u.a((byte) 127, param0, "");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("e.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    private final void a(boolean param0, byte[] param1) {
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
        wf stackIn_4_0 = null;
        wf stackIn_5_0 = null;
        wf stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException decompiledCaughtException = null;
        wf stackOut_3_0 = null;
        wf stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        wf stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        var16 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((e) this).field_m = null;
                break L1;
              }
            }
            L2: {
              var17 = new wf(qk.a(-121, param1));
              stackOut_3_0 = (wf) var17;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (param0) {
                stackOut_5_0 = (wf) (Object) stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = (wf) (Object) stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              var4 = ((wf) (Object) stackIn_6_0).d(stackIn_6_1 != 0);
              if (5 > var4) {
                break L3;
              } else {
                if (var4 <= 7) {
                  L4: {
                    if (var4 < 6) {
                      ((e) this).field_s = 0;
                      break L4;
                    } else {
                      ((e) this).field_s = var17.d((byte) 19);
                      break L4;
                    }
                  }
                  L5: {
                    var5 = var17.d(true);
                    if ((var5 & 1) == 0) {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      break L5;
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L5;
                    }
                  }
                  L6: {
                    var6 = stackIn_16_0;
                    if (0 == (2 & var5)) {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      break L6;
                    } else {
                      stackOut_17_0 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      break L6;
                    }
                  }
                  L7: {
                    var7 = stackIn_19_0;
                    if (var4 >= 7) {
                      ((e) this).field_k = var17.a((byte) 50);
                      break L7;
                    } else {
                      ((e) this).field_k = var17.b(-1698573656);
                      break L7;
                    }
                  }
                  L8: {
                    var8 = 0;
                    var9 = -1;
                    ((e) this).field_f = new int[((e) this).field_k];
                    if (var4 < 7) {
                      var10 = 0;
                      L9: while (true) {
                        if (var10 >= ((e) this).field_k) {
                          break L8;
                        } else {
                          L10: {
                            int dupTemp$4 = var8 + var17.b(-1698573656);
                            var8 = dupTemp$4;
                            ((e) this).field_f[var10] = dupTemp$4;
                            if (((e) this).field_f[var10] <= var9) {
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10++;
                          continue L9;
                        }
                      }
                    } else {
                      var10 = 0;
                      L11: while (true) {
                        if (((e) this).field_k <= var10) {
                          break L8;
                        } else {
                          L12: {
                            int dupTemp$5 = var8 + var17.a((byte) 50);
                            var8 = dupTemp$5;
                            ((e) this).field_f[var10] = dupTemp$5;
                            if (((e) this).field_f[var10] <= var9) {
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          var10++;
                          continue L11;
                        }
                      }
                    }
                  }
                  L13: {
                    ((e) this).field_d = 1 + var9;
                    ((e) this).field_n = new int[((e) this).field_d][];
                    ((e) this).field_t = new int[((e) this).field_d];
                    if (var7 == 0) {
                      break L13;
                    } else {
                      ((e) this).field_o = new byte[((e) this).field_d][];
                      break L13;
                    }
                  }
                  L14: {
                    ((e) this).field_r = new int[((e) this).field_d];
                    ((e) this).field_a = new int[((e) this).field_d];
                    ((e) this).field_m = new int[((e) this).field_d];
                    if (var6 != 0) {
                      ((e) this).field_l = new int[((e) this).field_d];
                      var10 = 0;
                      L15: while (true) {
                        if (((e) this).field_d <= var10) {
                          var10 = 0;
                          L16: while (true) {
                            if (var10 >= ((e) this).field_k) {
                              ((e) this).field_b = new el(((e) this).field_l);
                              break L14;
                            } else {
                              ((e) this).field_l[((e) this).field_f[var10]] = var17.d((byte) 19);
                              var10++;
                              continue L16;
                            }
                          }
                        } else {
                          ((e) this).field_l[var10] = -1;
                          var10++;
                          continue L15;
                        }
                      }
                    } else {
                      break L14;
                    }
                  }
                  var10 = 0;
                  L17: while (true) {
                    if (var10 >= ((e) this).field_k) {
                      L18: {
                        if (var7 != 0) {
                          var10 = 0;
                          L19: while (true) {
                            if (((e) this).field_k <= var10) {
                              var10 = 0;
                              L20: while (true) {
                                if (var10 >= ((e) this).field_k) {
                                  break L18;
                                } else {
                                  ((e) this).field_t[((e) this).field_f[var10]] = var17.d((byte) 19);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var21 = new byte[64];
                              var17.a(110, 64, 0, var21);
                              ((e) this).field_o[((e) this).field_f[var10]] = var21;
                              var10++;
                              continue L19;
                            }
                          }
                        } else {
                          var10 = 0;
                          L21: while (true) {
                            if (var10 >= ((e) this).field_k) {
                              break L18;
                            } else {
                              ((e) this).field_t[((e) this).field_f[var10]] = var17.d((byte) 19);
                              var10++;
                              continue L21;
                            }
                          }
                        }
                      }
                      L22: {
                        if (var4 >= 7) {
                          var10 = 0;
                          L23: while (true) {
                            if (((e) this).field_k <= var10) {
                              var10 = 0;
                              L24: while (true) {
                                if (((e) this).field_k <= var10) {
                                  break L22;
                                } else {
                                  var11 = ((e) this).field_f[var10];
                                  var8 = 0;
                                  var12 = ((e) this).field_m[var11];
                                  var13 = -1;
                                  ((e) this).field_n[var11] = new int[var12];
                                  var14 = 0;
                                  L25: while (true) {
                                    if (var12 <= var14) {
                                      L26: {
                                        ((e) this).field_a[var11] = var13 + 1;
                                        if (var12 != var13 + 1) {
                                          break L26;
                                        } else {
                                          ((e) this).field_n[var11] = null;
                                          break L26;
                                        }
                                      }
                                      var10++;
                                      continue L24;
                                    } else {
                                      L27: {
                                        int dupTemp$6 = var8 + var17.a((byte) 50);
                                        var8 = dupTemp$6;
                                        ((e) this).field_n[var11][var14] = dupTemp$6;
                                        var15 = dupTemp$6;
                                        if (var13 < var15) {
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
                              ((e) this).field_m[((e) this).field_f[var10]] = var17.a((byte) 50);
                              var10++;
                              continue L23;
                            }
                          }
                        } else {
                          var10 = 0;
                          L28: while (true) {
                            if (var10 >= ((e) this).field_k) {
                              var10 = 0;
                              L29: while (true) {
                                if (((e) this).field_k <= var10) {
                                  break L22;
                                } else {
                                  var11 = ((e) this).field_f[var10];
                                  var8 = 0;
                                  var12 = ((e) this).field_m[var11];
                                  var13 = -1;
                                  ((e) this).field_n[var11] = new int[var12];
                                  var14 = 0;
                                  L30: while (true) {
                                    if (var14 >= var12) {
                                      L31: {
                                        ((e) this).field_a[var11] = var13 - -1;
                                        if (var12 == var13 + 1) {
                                          ((e) this).field_n[var11] = null;
                                          break L31;
                                        } else {
                                          break L31;
                                        }
                                      }
                                      var10++;
                                      continue L29;
                                    } else {
                                      L32: {
                                        int dupTemp$7 = var8 + var17.b(-1698573656);
                                        var8 = dupTemp$7;
                                        ((e) this).field_n[var11][var14] = dupTemp$7;
                                        var15 = dupTemp$7;
                                        if (var13 >= var15) {
                                          break L32;
                                        } else {
                                          break L32;
                                        }
                                      }
                                      var14++;
                                      continue L30;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((e) this).field_m[((e) this).field_f[var10]] = var17.b(-1698573656);
                              var10++;
                              continue L28;
                            }
                          }
                        }
                      }
                      L33: {
                        if (var6 == 0) {
                          break L33;
                        } else {
                          ((e) this).field_j = new int[1 + var9][];
                          ((e) this).field_c = new el[1 + var9];
                          var10 = 0;
                          L34: while (true) {
                            if (var10 >= ((e) this).field_k) {
                              break L33;
                            } else {
                              var11 = ((e) this).field_f[var10];
                              var12 = ((e) this).field_m[var11];
                              ((e) this).field_j[var11] = new int[((e) this).field_a[var11]];
                              var13 = 0;
                              L35: while (true) {
                                if (((e) this).field_a[var11] <= var13) {
                                  var13 = 0;
                                  L36: while (true) {
                                    if (var13 >= var12) {
                                      ((e) this).field_c[var11] = new el(((e) this).field_j[var11]);
                                      var10++;
                                      continue L34;
                                    } else {
                                      L37: {
                                        if (((e) this).field_n[var11] != null) {
                                          var14 = ((e) this).field_n[var11][var13];
                                          break L37;
                                        } else {
                                          var14 = var13;
                                          break L37;
                                        }
                                      }
                                      ((e) this).field_j[var11][var14] = var17.d((byte) 19);
                                      var13++;
                                      continue L36;
                                    }
                                  }
                                } else {
                                  ((e) this).field_j[var11][var13] = -1;
                                  var13++;
                                  continue L35;
                                }
                              }
                            }
                          }
                        }
                      }
                      break L0;
                    } else {
                      ((e) this).field_r[((e) this).field_f[var10]] = var17.d((byte) 19);
                      var10++;
                      continue L17;
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
          L38: {
            var3 = decompiledCaughtException;
            stackOut_100_0 = (RuntimeException) var3;
            stackOut_100_1 = new StringBuilder().append("e.B(").append(param0).append(44);
            stackIn_102_0 = stackOut_100_0;
            stackIn_102_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param1 == null) {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L38;
            } else {
              stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
              stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
              stackOut_101_2 = "{...}";
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              break L38;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_103_0, stackIn_103_2 + 41);
        }
    }

    e(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((e) this).field_i = oe.a(101, param0, param0.length);
            if (param1 != ((e) this).field_i) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                ((e) this).field_v = si.a(0, param0, -110, param0.length);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((e) this).field_v[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(false, param0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "e.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Unable to connect to the data server. Please check any firewall you are using.";
        field_p = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_h = "Waiting for sound effects";
        field_e = "Return to game";
        field_q = 4;
    }
}
