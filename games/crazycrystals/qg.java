/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    int field_b;
    int[] field_g;
    static ih field_s;
    private int[] field_k;
    v field_t;
    private int[][] field_d;
    int[][] field_h;
    int[] field_l;
    static int field_q;
    v[] field_i;
    int[] field_e;
    int[] field_n;
    private byte[] field_j;
    int[] field_f;
    int field_a;
    private int field_p;
    int field_r;
    byte[][] field_m;
    static String field_o;
    static String[] field_c;

    private final void a(int param0, byte[] param1) {
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
        Object var17 = null;
        ng var18 = null;
        byte[] var22 = null;
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
        var16 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var18 = new ng(b.a(param1, -1));
              var4 = var18.h(255);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 < 6) {
                      ((qg) this).field_r = 0;
                      break L2;
                    } else {
                      ((qg) this).field_r = var18.b((byte) 127);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var18.h(255);
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
                    if ((2 & var5) == 0) {
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
                      ((qg) this).field_p = var18.a((byte) -122);
                      break L5;
                    } else {
                      ((qg) this).field_p = var18.c((byte) -7);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    var9 = -1;
                    ((qg) this).field_e = new int[((qg) this).field_p];
                    if (7 > var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (~((qg) this).field_p >= ~var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var18.c((byte) -7);
                            var8 = dupTemp$4;
                            ((qg) this).field_e[var10] = dupTemp$4;
                            if (~var9 > ~((qg) this).field_e[var10]) {
                              var9 = ((qg) this).field_e[var10];
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
                        if (~var10 <= ~((qg) this).field_p) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var18.a((byte) -124);
                            var8 = dupTemp$5;
                            ((qg) this).field_e[var10] = dupTemp$5;
                            if (~((qg) this).field_e[var10] >= ~var9) {
                              break L10;
                            } else {
                              var9 = ((qg) this).field_e[var10];
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
                    ((qg) this).field_a = 1 + var9;
                    if (var7 == 0) {
                      break L11;
                    } else {
                      ((qg) this).field_m = new byte[((qg) this).field_a][];
                      break L11;
                    }
                  }
                  L12: {
                    ((qg) this).field_l = new int[((qg) this).field_a];
                    ((qg) this).field_h = new int[((qg) this).field_a][];
                    ((qg) this).field_f = new int[((qg) this).field_a];
                    ((qg) this).field_g = new int[((qg) this).field_a];
                    ((qg) this).field_n = new int[((qg) this).field_a];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((qg) this).field_k = new int[((qg) this).field_a];
                      var10 = 0;
                      L13: while (true) {
                        if (((qg) this).field_a <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((qg) this).field_p) {
                              ((qg) this).field_t = new v(((qg) this).field_k);
                              break L12;
                            } else {
                              ((qg) this).field_k[((qg) this).field_e[var10]] = var18.b((byte) -23);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((qg) this).field_k[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (~((qg) this).field_p >= ~var10) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (((qg) this).field_p <= var10) {
                              break L16;
                            } else {
                              var22 = new byte[64];
                              var18.a(64, var22, (byte) -110, 0);
                              ((qg) this).field_m[((qg) this).field_e[var10]] = var22;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (~((qg) this).field_p >= ~var10) {
                          L19: {
                            if (var4 < 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (~((qg) this).field_p >= ~var10) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (~var10 <= ~((qg) this).field_p) {
                                      break L19;
                                    } else {
                                      var11 = ((qg) this).field_e[var10];
                                      var8 = 0;
                                      var12 = ((qg) this).field_f[var11];
                                      var13 = -1;
                                      ((qg) this).field_h[var11] = new int[var12];
                                      var14 = 0;
                                      L22: while (true) {
                                        if (~var12 >= ~var14) {
                                          L23: {
                                            ((qg) this).field_l[var11] = var13 - -1;
                                            if (1 + var13 == var12) {
                                              ((qg) this).field_h[var11] = null;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var18.c((byte) -7);
                                            var8 = dupTemp$6;
                                            ((qg) this).field_h[var11][var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (~var13 > ~var15) {
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
                                  ((qg) this).field_f[((qg) this).field_e[var10]] = var18.c((byte) -7);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (~var10 <= ~((qg) this).field_p) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (var10 >= ((qg) this).field_p) {
                                      break L19;
                                    } else {
                                      var11 = ((qg) this).field_e[var10];
                                      var8 = 0;
                                      var12 = ((qg) this).field_f[var11];
                                      var13 = -1;
                                      ((qg) this).field_h[var11] = new int[var12];
                                      var14 = 0;
                                      L27: while (true) {
                                        if (~var14 <= ~var12) {
                                          L28: {
                                            ((qg) this).field_l[var11] = 1 + var13;
                                            if (~var12 == ~(var13 - -1)) {
                                              ((qg) this).field_h[var11] = null;
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var18.a((byte) -121);
                                            var8 = dupTemp$7;
                                            ((qg) this).field_h[var11][var14] = dupTemp$7;
                                            var15 = dupTemp$7;
                                            if (~var13 <= ~var15) {
                                              break L29;
                                            } else {
                                              var13 = var15;
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
                                  ((qg) this).field_f[((qg) this).field_e[var10]] = var18.a((byte) -121);
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
                              ((qg) this).field_d = new int[var9 + 1][];
                              ((qg) this).field_i = new v[var9 + 1];
                              var10 = 0;
                              L31: while (true) {
                                if (((qg) this).field_p <= var10) {
                                  break L30;
                                } else {
                                  var11 = ((qg) this).field_e[var10];
                                  var12 = ((qg) this).field_f[var11];
                                  ((qg) this).field_d[var11] = new int[((qg) this).field_l[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (~var13 <= ~((qg) this).field_l[var11]) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (~var13 <= ~var12) {
                                          ((qg) this).field_i[var11] = new v(((qg) this).field_d[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (null != ((qg) this).field_h[var11]) {
                                              var14 = ((qg) this).field_h[var11][var13];
                                              break L34;
                                            } else {
                                              var14 = var13;
                                              break L34;
                                            }
                                          }
                                          ((qg) this).field_d[var11][var14] = var18.b((byte) -59);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((qg) this).field_d[var11][var13] = -1;
                                      var13++;
                                      continue L32;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L35: {
                            if (param0 == 64) {
                              break L35;
                            } else {
                              var17 = null;
                              this.a(-2, (byte[]) null);
                              break L35;
                            }
                          }
                          break L0;
                        } else {
                          ((qg) this).field_g[((qg) this).field_e[var10]] = var18.b((byte) 127);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((qg) this).field_n[((qg) this).field_e[var10]] = var18.b((byte) 127);
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
          L36: {
            var3 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) var3;
            stackOut_95_1 = new StringBuilder().append("qg.A(").append(param0).append(44);
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
          throw dn.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + 41);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_o = null;
        field_s = null;
    }

    qg(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((qg) this).field_b = gi.a(param0.length, param0, 26009);
            if (((qg) this).field_b != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((qg) this).field_j = ac.a(param0, 0, param0.length, (byte) -127);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((qg) this).field_j[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(64, param0);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "qg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new ih();
        field_c = new String[]{"Three's a Crowd", "Infestation Team", "Chomp", "Crystal Race", "Armageddon!"};
        field_o = "You are not currently logged in to the<nbsp>game.";
    }
}
