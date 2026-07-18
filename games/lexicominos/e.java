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
          throw ld.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + -101 + ')');
        }
        return stackIn_21_0;
    }

    final static byte[] a(String param0, boolean param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
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
            stackOut_2_0 = th.field_u.a((byte) 127, param0, "");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("e.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + true + ')');
        }
        return stackIn_3_0;
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
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        var16 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new wf(qk.a(-121, param1));
              var4 = var17.d(true);
              if (5 > var4) {
                break L1;
              } else {
                if (var4 <= 7) {
                  L2: {
                    if (var4 < 6) {
                      ((e) this).field_s = 0;
                      break L2;
                    } else {
                      ((e) this).field_s = var17.d((byte) 19);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.d(true);
                    if ((var5 & 1) == 0) {
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
                    if (0 == (2 & var5)) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_14_0;
                    if (var4 >= 7) {
                      ((e) this).field_k = var17.a((byte) 50);
                      break L5;
                    } else {
                      ((e) this).field_k = var17.b(-1698573656);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    var9 = -1;
                    ((e) this).field_f = new int[((e) this).field_k];
                    if (var4 < 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= ((e) this).field_k) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.b(-1698573656);
                            var8 = dupTemp$4;
                            ((e) this).field_f[var10] = dupTemp$4;
                            if (((e) this).field_f[var10] <= var9) {
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
                        if (((e) this).field_k <= var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.a((byte) 50);
                            var8 = dupTemp$5;
                            ((e) this).field_f[var10] = dupTemp$5;
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
                    }
                  }
                  L11: {
                    ((e) this).field_d = 1 + var9;
                    ((e) this).field_n = new int[((e) this).field_d][];
                    ((e) this).field_t = new int[((e) this).field_d];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      ((e) this).field_o = new byte[((e) this).field_d][];
                      break L11;
                    }
                  }
                  L12: {
                    ((e) this).field_r = new int[((e) this).field_d];
                    ((e) this).field_a = new int[((e) this).field_d];
                    ((e) this).field_m = new int[((e) this).field_d];
                    if (var6 != 0) {
                      ((e) this).field_l = new int[((e) this).field_d];
                      var10 = 0;
                      L13: while (true) {
                        if (((e) this).field_d <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((e) this).field_k) {
                              ((e) this).field_b = new el(((e) this).field_l);
                              break L12;
                            } else {
                              ((e) this).field_l[((e) this).field_f[var10]] = var17.d((byte) 19);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((e) this).field_l[var10] = -1;
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
                    if (var10 >= ((e) this).field_k) {
                      L16: {
                        if (var7 != 0) {
                          var10 = 0;
                          L17: while (true) {
                            if (((e) this).field_k <= var10) {
                              var10 = 0;
                              L18: while (true) {
                                if (var10 >= ((e) this).field_k) {
                                  break L16;
                                } else {
                                  ((e) this).field_t[((e) this).field_f[var10]] = var17.d((byte) 19);
                                  var10++;
                                  continue L18;
                                }
                              }
                            } else {
                              var21 = new byte[64];
                              var17.a(110, 64, 0, var21);
                              ((e) this).field_o[((e) this).field_f[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L19: while (true) {
                            if (var10 >= ((e) this).field_k) {
                              break L16;
                            } else {
                              ((e) this).field_t[((e) this).field_f[var10]] = var17.d((byte) 19);
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
                            if (((e) this).field_k <= var10) {
                              var10 = 0;
                              L22: while (true) {
                                if (((e) this).field_k <= var10) {
                                  break L20;
                                } else {
                                  var11 = ((e) this).field_f[var10];
                                  var8 = 0;
                                  var12 = ((e) this).field_m[var11];
                                  var13 = -1;
                                  ((e) this).field_n[var11] = new int[var12];
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var12 <= var14) {
                                      L24: {
                                        ((e) this).field_a[var11] = var13 + 1;
                                        if (var12 != var13 + 1) {
                                          break L24;
                                        } else {
                                          ((e) this).field_n[var11] = null;
                                          break L24;
                                        }
                                      }
                                      var10++;
                                      continue L22;
                                    } else {
                                      L25: {
                                        int dupTemp$6 = var8 + var17.a((byte) 50);
                                        var8 = dupTemp$6;
                                        ((e) this).field_n[var11][var14] = dupTemp$6;
                                        var15 = dupTemp$6;
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
                              ((e) this).field_m[((e) this).field_f[var10]] = var17.a((byte) 50);
                              var10++;
                              continue L21;
                            }
                          }
                        } else {
                          var10 = 0;
                          L26: while (true) {
                            if (var10 >= ((e) this).field_k) {
                              var10 = 0;
                              L27: while (true) {
                                if (((e) this).field_k <= var10) {
                                  break L20;
                                } else {
                                  var11 = ((e) this).field_f[var10];
                                  var8 = 0;
                                  var12 = ((e) this).field_m[var11];
                                  var13 = -1;
                                  ((e) this).field_n[var11] = new int[var12];
                                  var14 = 0;
                                  L28: while (true) {
                                    if (var14 >= var12) {
                                      L29: {
                                        ((e) this).field_a[var11] = var13 - -1;
                                        if (var12 == var13 + 1) {
                                          ((e) this).field_n[var11] = null;
                                          break L29;
                                        } else {
                                          break L29;
                                        }
                                      }
                                      var10++;
                                      continue L27;
                                    } else {
                                      L30: {
                                        int dupTemp$7 = var8 + var17.b(-1698573656);
                                        var8 = dupTemp$7;
                                        ((e) this).field_n[var11][var14] = dupTemp$7;
                                        var15 = dupTemp$7;
                                        if (var13 >= var15) {
                                          break L30;
                                        } else {
                                          break L30;
                                        }
                                      }
                                      var14++;
                                      continue L28;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((e) this).field_m[((e) this).field_f[var10]] = var17.b(-1698573656);
                              var10++;
                              continue L26;
                            }
                          }
                        }
                      }
                      L31: {
                        if (var6 == 0) {
                          break L31;
                        } else {
                          ((e) this).field_j = new int[1 + var9][];
                          ((e) this).field_c = new el[1 + var9];
                          var10 = 0;
                          L32: while (true) {
                            if (var10 >= ((e) this).field_k) {
                              break L31;
                            } else {
                              var11 = ((e) this).field_f[var10];
                              var12 = ((e) this).field_m[var11];
                              ((e) this).field_j[var11] = new int[((e) this).field_a[var11]];
                              var13 = 0;
                              L33: while (true) {
                                if (((e) this).field_a[var11] <= var13) {
                                  var13 = 0;
                                  L34: while (true) {
                                    if (var13 >= var12) {
                                      ((e) this).field_c[var11] = new el(((e) this).field_j[var11]);
                                      var10++;
                                      continue L32;
                                    } else {
                                      L35: {
                                        if (((e) this).field_n[var11] != null) {
                                          var14 = ((e) this).field_n[var11][var13];
                                          break L35;
                                        } else {
                                          var14 = var13;
                                          break L35;
                                        }
                                      }
                                      ((e) this).field_j[var11][var14] = var17.d((byte) 19);
                                      var13++;
                                      continue L34;
                                    }
                                  }
                                } else {
                                  ((e) this).field_j[var11][var13] = -1;
                                  var13++;
                                  continue L33;
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
                      continue L15;
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
          L36: {
            var3 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) var3;
            stackOut_95_1 = new StringBuilder().append("e.B(").append(false).append(',');
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param1 == null) {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L36;
            } else {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L36;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + ')');
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
            throw ld.a((Throwable) (Object) runtimeException, "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
