/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    ke field_h;
    int[] field_q;
    static boolean field_s;
    byte[][] field_l;
    int[] field_n;
    int[][] field_o;
    static vi field_a;
    private int[][] field_r;
    int field_k;
    int[] field_f;
    ke[] field_p;
    static String field_e;
    int field_b;
    int[] field_i;
    static String field_j;
    static int field_c;
    int field_g;
    private int field_t;
    static kc[] field_u;
    int[] field_d;
    private byte[] field_v;
    private int[] field_m;

    private final void a(byte[] param0) {
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
        pb var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        var16 = Main.field_T;
        try {
          L0: {
            L1: {
              var17 = new pb(ac.a(-115, param0));
              var4 = var17.f(-125);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (6 > var4) {
                      ((d) this).field_k = 0;
                      break L2;
                    } else {
                      ((d) this).field_k = var17.e((byte) 125);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.f(-123);
                    if (0 == (var5 & 1)) {
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
                    if (var4 >= 7) {
                      ((d) this).field_t = var17.b(false);
                      break L4;
                    } else {
                      ((d) this).field_t = var17.d((byte) 72);
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 & 2) == 0) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_17_0;
                    var8 = 0;
                    var9 = -1;
                    ((d) this).field_d = new int[((d) this).field_t];
                    if (7 <= var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= ((d) this).field_t) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.b(false);
                            var8 = dupTemp$4;
                            ((d) this).field_d[var10] = dupTemp$4;
                            if (~var9 > ~((d) this).field_d[var10]) {
                              var9 = ((d) this).field_d[var10];
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
                        if (var10 >= ((d) this).field_t) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.d((byte) 72);
                            var8 = dupTemp$5;
                            ((d) this).field_d[var10] = dupTemp$5;
                            if (var9 >= ((d) this).field_d[var10]) {
                              break L10;
                            } else {
                              var9 = ((d) this).field_d[var10];
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
                    ((d) this).field_b = 1 + var9;
                    ((d) this).field_f = new int[((d) this).field_b];
                    if (var7 != 0) {
                      ((d) this).field_l = new byte[((d) this).field_b][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((d) this).field_o = new int[((d) this).field_b][];
                    ((d) this).field_i = new int[((d) this).field_b];
                    ((d) this).field_n = new int[((d) this).field_b];
                    ((d) this).field_q = new int[((d) this).field_b];
                    if (var6 != 0) {
                      ((d) this).field_m = new int[((d) this).field_b];
                      var10 = 0;
                      L13: while (true) {
                        if (~((d) this).field_b >= ~var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (~var10 <= ~((d) this).field_t) {
                              ((d) this).field_h = new ke(((d) this).field_m);
                              break L12;
                            } else {
                              ((d) this).field_m[((d) this).field_d[var10]] = var17.e((byte) 125);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((d) this).field_m[var10] = -1;
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
                    if (~var10 <= ~((d) this).field_t) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= ((d) this).field_t) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(126, var21, 0, 64);
                              ((d) this).field_l[((d) this).field_d[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= ((d) this).field_t) {
                          L19: {
                            if (7 > var4) {
                              var10 = 0;
                              L20: while (true) {
                                if (~((d) this).field_t >= ~var10) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (~((d) this).field_t >= ~var10) {
                                      break L19;
                                    } else {
                                      var11 = ((d) this).field_d[var10];
                                      var12 = ((d) this).field_q[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      ((d) this).field_o[var11] = new int[var12];
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var12 <= var14) {
                                          L23: {
                                            ((d) this).field_f[var11] = var13 - -1;
                                            if (var13 - -1 == var12) {
                                              ((d) this).field_o[var11] = null;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var17.d((byte) 72);
                                            var8 = dupTemp$6;
                                            ((d) this).field_o[var11][var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (~var13 <= ~var15) {
                                              break L24;
                                            } else {
                                              var13 = var15;
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
                                  ((d) this).field_q[((d) this).field_d[var10]] = var17.d((byte) 72);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (~var10 <= ~((d) this).field_t) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (~((d) this).field_t >= ~var10) {
                                      break L19;
                                    } else {
                                      var11 = ((d) this).field_d[var10];
                                      var12 = ((d) this).field_q[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      ((d) this).field_o[var11] = new int[var12];
                                      var14 = 0;
                                      L27: while (true) {
                                        if (~var14 <= ~var12) {
                                          L28: {
                                            ((d) this).field_f[var11] = 1 + var13;
                                            if (var13 - -1 != var12) {
                                              break L28;
                                            } else {
                                              ((d) this).field_o[var11] = null;
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var17.b(false);
                                            var8 = dupTemp$7;
                                            ((d) this).field_o[var11][var14] = dupTemp$7;
                                            var15 = dupTemp$7;
                                            if (~var15 >= ~var13) {
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
                                  ((d) this).field_q[((d) this).field_d[var10]] = var17.b(false);
                                  var10++;
                                  continue L25;
                                }
                              }
                            }
                          }
                          L30: {
                            if (var6 != 0) {
                              ((d) this).field_p = new ke[var9 + 1];
                              ((d) this).field_r = new int[var9 + 1][];
                              var10 = 0;
                              L31: while (true) {
                                if (~((d) this).field_t >= ~var10) {
                                  break L30;
                                } else {
                                  var11 = ((d) this).field_d[var10];
                                  var12 = ((d) this).field_q[var11];
                                  ((d) this).field_r[var11] = new int[((d) this).field_f[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (((d) this).field_f[var11] <= var13) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var12 <= var13) {
                                          ((d) this).field_p[var11] = new ke(((d) this).field_r[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (((d) this).field_o[var11] != null) {
                                              var14 = ((d) this).field_o[var11][var13];
                                              break L34;
                                            } else {
                                              var14 = var13;
                                              break L34;
                                            }
                                          }
                                          ((d) this).field_r[var11][var14] = var17.e((byte) 126);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((d) this).field_r[var11][var13] = -1;
                                      var13++;
                                      continue L32;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L30;
                            }
                          }
                          break L0;
                        } else {
                          ((d) this).field_n[((d) this).field_d[var10]] = var17.e((byte) 125);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((d) this).field_i[((d) this).field_d[var10]] = var17.e((byte) 127);
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
            stackOut_94_0 = (RuntimeException) var3;
            stackOut_94_1 = new StringBuilder().append("d.A(");
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param0 == null) {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L35;
            } else {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L35;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_97_0, stackIn_97_2 + ',' + -4451 + ')');
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        field_e = null;
        field_a = null;
        if (!param0) {
            d.a(false);
        }
        field_u = null;
    }

    final static void a(java.awt.Component param0) {
        try {
            param0.removeMouseListener((java.awt.event.MouseListener) (Object) wc.field_B);
            param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) wc.field_B);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) wc.field_B);
            ge.field_a = 0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "d.C(" + (param0 != null ? "{...}" : "null") + ',' + 0 + ')');
        }
    }

    d(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((d) this).field_g = uh.a((byte) 124, param0.length, param0);
            if (((d) this).field_g != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                int discarded$0 = 0;
                ((d) this).field_v = ti.a(0, param0, param0.length);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((d) this).field_v[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            int discarded$1 = -4451;
            this.a(param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "d.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = false;
        field_e = "You are not currently logged in to the<nbsp>game.";
        field_u = new kc[11];
        field_j = "Please enter your age in years";
    }
}
