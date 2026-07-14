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
        int var5 = 0;
        String var6 = null;
        tf var7 = null;
        int var8 = Lexicominos.field_L ? 1 : 0;
        int var2 = param0.length();
        if (!(0 != var2)) {
            return w.field_k;
        }
        if ((var2 ^ -1) < -256) {
            return vi.field_l;
        }
        if (param1 >= -69) {
            return null;
        }
        String[] var3 = dc.a(param0, '.', (byte) -125);
        if (!(2 <= var3.length)) {
            return w.field_k;
        }
        String[] var4 = var3;
        for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var7 = nc.a(63, var6);
            if (!(var7 == null)) {
                return var7;
            }
        }
        return bg.a(var3[var3.length - 1], -21637);
    }

    final static byte[] a(String param0, boolean param1) {
        if (!param1) {
            return null;
        }
        return th.field_u.a((byte) 127, param0, "");
    }

    private final void a(boolean param0, byte[] param1) {
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
        wf stackIn_3_0 = null;
        wf stackIn_4_0 = null;
        wf stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        wf stackOut_2_0 = null;
        wf stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        wf stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          var16 = Lexicominos.field_L ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            ((e) this).field_m = null;
            break L0;
          }
        }
        L1: {
          var17 = new wf(qk.a(-121, param1));
          stackOut_2_0 = (wf) var17;
          stackIn_4_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (param0) {
            stackOut_4_0 = (wf) (Object) stackIn_4_0;
            stackOut_4_1 = 0;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            break L1;
          } else {
            stackOut_3_0 = (wf) (Object) stackIn_3_0;
            stackOut_3_1 = 1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            break L1;
          }
        }
        L2: {
          var4 = ((wf) (Object) stackIn_5_0).d(stackIn_5_1 != 0);
          if (5 > var4) {
            break L2;
          } else {
            if ((var4 ^ -1) >= -8) {
              L3: {
                if ((var4 ^ -1) > -7) {
                  ((e) this).field_s = 0;
                  break L3;
                } else {
                  ((e) this).field_s = var17.d((byte) 19);
                  break L3;
                }
              }
              L4: {
                var5 = var17.d(true);
                if ((var5 & 1) == 0) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
              L5: {
                var6 = stackIn_15_0;
                if (0 == (2 & var5)) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L5;
                } else {
                  stackOut_16_0 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  break L5;
                }
              }
              L6: {
                var7 = stackIn_18_0;
                if (var4 >= 7) {
                  ((e) this).field_k = var17.a((byte) 50);
                  break L6;
                } else {
                  ((e) this).field_k = var17.b(-1698573656);
                  break L6;
                }
              }
              L7: {
                var8 = 0;
                var9 = -1;
                ((e) this).field_f = new int[((e) this).field_k];
                if (-8 < (var4 ^ -1)) {
                  var10 = 0;
                  L8: while (true) {
                    if (var10 >= ((e) this).field_k) {
                      break L7;
                    } else {
                      var8 = var8 + var17.b(-1698573656);
                      ((e) this).field_f[var10] = var8 + var17.b(-1698573656);
                      if (((e) this).field_f[var10] > var9) {
                        var9 = ((e) this).field_f[var10];
                        var10++;
                        continue L8;
                      } else {
                        var10++;
                        continue L8;
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L9: while (true) {
                    if (((e) this).field_k <= var10) {
                      break L7;
                    } else {
                      var8 = var8 + var17.a((byte) 50);
                      ((e) this).field_f[var10] = var8 + var17.a((byte) 50);
                      if (((e) this).field_f[var10] > var9) {
                        var9 = ((e) this).field_f[var10];
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
                ((e) this).field_d = 1 + var9;
                ((e) this).field_n = new int[((e) this).field_d][];
                ((e) this).field_t = new int[((e) this).field_d];
                if (var7 == 0) {
                  break L10;
                } else {
                  ((e) this).field_o = new byte[((e) this).field_d][];
                  break L10;
                }
              }
              L11: {
                ((e) this).field_r = new int[((e) this).field_d];
                ((e) this).field_a = new int[((e) this).field_d];
                ((e) this).field_m = new int[((e) this).field_d];
                if (var6 != 0) {
                  ((e) this).field_l = new int[((e) this).field_d];
                  var10 = 0;
                  L12: while (true) {
                    if (((e) this).field_d <= var10) {
                      var10 = 0;
                      L13: while (true) {
                        if (var10 >= ((e) this).field_k) {
                          ((e) this).field_b = new el(((e) this).field_l);
                          break L11;
                        } else {
                          ((e) this).field_l[((e) this).field_f[var10]] = var17.d((byte) 19);
                          var10++;
                          continue L13;
                        }
                      }
                    } else {
                      ((e) this).field_l[var10] = -1;
                      var10++;
                      continue L12;
                    }
                  }
                } else {
                  break L11;
                }
              }
              var10 = 0;
              L14: while (true) {
                if (var10 >= ((e) this).field_k) {
                  L15: {
                    if (var7 != 0) {
                      var10 = 0;
                      L16: while (true) {
                        if (((e) this).field_k <= var10) {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= ((e) this).field_k) {
                              break L15;
                            } else {
                              ((e) this).field_t[((e) this).field_f[var10]] = var17.d((byte) 19);
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var21 = new byte[64];
                          var17.a(110, 64, 0, var21);
                          ((e) this).field_o[((e) this).field_f[var10]] = var21;
                          var10++;
                          continue L16;
                        }
                      }
                    } else {
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= ((e) this).field_k) {
                          break L15;
                        } else {
                          ((e) this).field_t[((e) this).field_f[var10]] = var17.d((byte) 19);
                          var10++;
                          continue L18;
                        }
                      }
                    }
                  }
                  L19: {
                    if (var4 >= 7) {
                      var10 = 0;
                      L20: while (true) {
                        if (((e) this).field_k <= var10) {
                          var10 = 0;
                          L21: while (true) {
                            if (((e) this).field_k <= var10) {
                              break L19;
                            } else {
                              var11 = ((e) this).field_f[var10];
                              var8 = 0;
                              var12 = ((e) this).field_m[var11];
                              var13 = -1;
                              ((e) this).field_n[var11] = new int[var12];
                              var14 = 0;
                              L22: while (true) {
                                if (var12 <= var14) {
                                  ((e) this).field_a[var11] = var13 + 1;
                                  if (var12 == var13 + 1) {
                                    ((e) this).field_n[var11] = null;
                                    var10++;
                                    continue L21;
                                  } else {
                                    var10++;
                                    continue L21;
                                  }
                                } else {
                                  var8 = var8 + var17.a((byte) 50);
                                  ((e) this).field_n[var11][var14] = var8 + var17.a((byte) 50);
                                  var15 = var8 + var17.a((byte) 50);
                                  if (var13 < var15) {
                                    var13 = var15;
                                    var14++;
                                    continue L22;
                                  } else {
                                    var14++;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((e) this).field_m[((e) this).field_f[var10]] = var17.a((byte) 50);
                          var10++;
                          continue L20;
                        }
                      }
                    } else {
                      var10 = 0;
                      L23: while (true) {
                        if (var10 >= ((e) this).field_k) {
                          var10 = 0;
                          L24: while (true) {
                            if (((e) this).field_k <= var10) {
                              break L19;
                            } else {
                              var11 = ((e) this).field_f[var10];
                              var8 = 0;
                              var12 = ((e) this).field_m[var11];
                              var13 = -1;
                              ((e) this).field_n[var11] = new int[var12];
                              var14 = 0;
                              L25: while (true) {
                                if (var14 >= var12) {
                                  ((e) this).field_a[var11] = var13 - -1;
                                  if (var12 == var13 + 1) {
                                    ((e) this).field_n[var11] = null;
                                    var10++;
                                    continue L24;
                                  } else {
                                    var10++;
                                    continue L24;
                                  }
                                } else {
                                  var8 = var8 + var17.b(-1698573656);
                                  ((e) this).field_n[var11][var14] = var8 + var17.b(-1698573656);
                                  var15 = var8 + var17.b(-1698573656);
                                  if (var13 < var15) {
                                    var13 = var15;
                                    var14++;
                                    continue L25;
                                  } else {
                                    var14++;
                                    continue L25;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((e) this).field_m[((e) this).field_f[var10]] = var17.b(-1698573656);
                          var10++;
                          continue L23;
                        }
                      }
                    }
                  }
                  L26: {
                    if (var6 == 0) {
                      break L26;
                    } else {
                      ((e) this).field_j = new int[1 + var9][];
                      ((e) this).field_c = new el[1 + var9];
                      var10 = 0;
                      L27: while (true) {
                        if (var10 >= ((e) this).field_k) {
                          break L26;
                        } else {
                          var11 = ((e) this).field_f[var10];
                          var12 = ((e) this).field_m[var11];
                          ((e) this).field_j[var11] = new int[((e) this).field_a[var11]];
                          var13 = 0;
                          L28: while (true) {
                            if (((e) this).field_a[var11] <= var13) {
                              var13 = 0;
                              L29: while (true) {
                                if (var13 >= var12) {
                                  ((e) this).field_c[var11] = new el(((e) this).field_j[var11]);
                                  var10++;
                                  continue L27;
                                } else {
                                  L30: {
                                    if (((e) this).field_n[var11] != null) {
                                      var14 = ((e) this).field_n[var11][var13];
                                      break L30;
                                    } else {
                                      var14 = var13;
                                      break L30;
                                    }
                                  }
                                  ((e) this).field_j[var11][var14] = var17.d((byte) 19);
                                  var13++;
                                  continue L29;
                                }
                              }
                            } else {
                              ((e) this).field_j[var11][var13] = -1;
                              var13++;
                              continue L28;
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  ((e) this).field_r[((e) this).field_f[var10]] = var17.d((byte) 19);
                  var10++;
                  continue L14;
                }
              }
            } else {
              break L2;
            }
          }
        }
        throw new RuntimeException();
    }

    e(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((e) this).field_i = oe.a(101, param0, param0.length);
        if (param1 != ((e) this).field_i) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (64 != param2.length) {
                throw new RuntimeException();
            }
            ((e) this).field_v = si.a(0, param0, -110, param0.length);
            for (var4 = 0; -65 < (var4 ^ -1); var4++) {
                if (((e) this).field_v[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(false, param0);
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
