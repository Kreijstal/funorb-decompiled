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

    private final void a(byte[] param0, int param1) {
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
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = Main.field_T;
          var17 = new pb(ac.a(-115, param0));
          var4 = var17.f(-125);
          if ((var4 ^ -1) > -6) {
            break L0;
          } else {
            if (-8 > (var4 ^ -1)) {
              break L0;
            } else {
              L1: {
                if (6 > var4) {
                  ((d) this).field_k = 0;
                  break L1;
                } else {
                  ((d) this).field_k = var17.e((byte) 125);
                  break L1;
                }
              }
              L2: {
                var5 = var17.f(param1 + 4328);
                if (0 == (var5 & 1)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                if (-8 >= (var4 ^ -1)) {
                  ((d) this).field_t = var17.b(false);
                  break L3;
                } else {
                  ((d) this).field_t = var17.d((byte) 72);
                  break L3;
                }
              }
              L4: {
                if ((var5 & 2 ^ -1) == -1) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              L5: {
                var7 = stackIn_16_0;
                var8 = 0;
                var9 = -1;
                ((d) this).field_d = new int[((d) this).field_t];
                if (7 <= var4) {
                  var10 = 0;
                  L6: while (true) {
                    if (var10 >= ((d) this).field_t) {
                      break L5;
                    } else {
                      L7: {
                        int dupTemp$4 = var8 + var17.b(false);
                        var8 = dupTemp$4;
                        ((d) this).field_d[var10] = dupTemp$4;
                        if ((var9 ^ -1) > (((d) this).field_d[var10] ^ -1)) {
                          var9 = ((d) this).field_d[var10];
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var10++;
                      continue L6;
                    }
                  }
                } else {
                  var10 = 0;
                  L8: while (true) {
                    if (var10 >= ((d) this).field_t) {
                      break L5;
                    } else {
                      L9: {
                        int dupTemp$5 = var8 + var17.d((byte) 72);
                        var8 = dupTemp$5;
                        ((d) this).field_d[var10] = dupTemp$5;
                        if (var9 >= ((d) this).field_d[var10]) {
                          break L9;
                        } else {
                          var9 = ((d) this).field_d[var10];
                          break L9;
                        }
                      }
                      var10++;
                      continue L8;
                    }
                  }
                }
              }
              L10: {
                ((d) this).field_b = 1 + var9;
                ((d) this).field_f = new int[((d) this).field_b];
                if (var7 != 0) {
                  ((d) this).field_l = new byte[((d) this).field_b][];
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                ((d) this).field_o = new int[((d) this).field_b][];
                ((d) this).field_i = new int[((d) this).field_b];
                ((d) this).field_n = new int[((d) this).field_b];
                ((d) this).field_q = new int[((d) this).field_b];
                if (var6 != 0) {
                  ((d) this).field_m = new int[((d) this).field_b];
                  var10 = 0;
                  L12: while (true) {
                    if ((((d) this).field_b ^ -1) >= (var10 ^ -1)) {
                      var10 = 0;
                      L13: while (true) {
                        if ((var10 ^ -1) <= (((d) this).field_t ^ -1)) {
                          ((d) this).field_h = new ke(((d) this).field_m);
                          break L11;
                        } else {
                          ((d) this).field_m[((d) this).field_d[var10]] = var17.e((byte) 125);
                          var10++;
                          continue L13;
                        }
                      }
                    } else {
                      ((d) this).field_m[var10] = -1;
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
                if ((var10 ^ -1) <= (((d) this).field_t ^ -1)) {
                  L15: {
                    if (var7 == 0) {
                      break L15;
                    } else {
                      var10 = 0;
                      L16: while (true) {
                        if (var10 >= ((d) this).field_t) {
                          break L15;
                        } else {
                          var21 = new byte[64];
                          var17.a(126, var21, 0, 64);
                          ((d) this).field_l[((d) this).field_d[var10]] = var21;
                          var10++;
                          continue L16;
                        }
                      }
                    }
                  }
                  L17: {
                    if (param1 == -4451) {
                      break L17;
                    } else {
                      d.a(false);
                      break L17;
                    }
                  }
                  var10 = 0;
                  L18: while (true) {
                    if (var10 >= ((d) this).field_t) {
                      L19: {
                        if (7 > var4) {
                          var10 = 0;
                          L20: while (true) {
                            if ((((d) this).field_t ^ -1) >= (var10 ^ -1)) {
                              var10 = 0;
                              L21: while (true) {
                                if ((((d) this).field_t ^ -1) >= (var10 ^ -1)) {
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
                                        if ((var13 ^ -1) <= (var15 ^ -1)) {
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
                            if ((var10 ^ -1) <= (((d) this).field_t ^ -1)) {
                              var10 = 0;
                              L26: while (true) {
                                if ((((d) this).field_t ^ -1) >= (var10 ^ -1)) {
                                  break L19;
                                } else {
                                  var11 = ((d) this).field_d[var10];
                                  var12 = ((d) this).field_q[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  ((d) this).field_o[var11] = new int[var12];
                                  var14 = 0;
                                  L27: while (true) {
                                    if ((var14 ^ -1) <= (var12 ^ -1)) {
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
                                        if ((var15 ^ -1) >= (var13 ^ -1)) {
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
                            if ((((d) this).field_t ^ -1) >= (var10 ^ -1)) {
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
                      return;
                    } else {
                      ((d) this).field_n[((d) this).field_d[var10]] = var17.e((byte) 125);
                      var10++;
                      continue L18;
                    }
                  }
                } else {
                  ((d) this).field_i[((d) this).field_d[var10]] = var17.e((byte) 127);
                  var10++;
                  continue L14;
                }
              }
            }
          }
        }
        throw new RuntimeException();
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

    final static void a(java.awt.Component param0, int param1) {
        param0.removeMouseListener((java.awt.event.MouseListener) (Object) wc.field_B);
        param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) wc.field_B);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) wc.field_B);
        ge.field_a = param1;
    }

    d(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((d) this).field_g = uh.a((byte) 124, param0.length, param0);
        if (((d) this).field_g != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (64 != param2.length) {
                throw new RuntimeException();
            }
            ((d) this).field_v = ti.a(0, param0, param0.length, 0);
            for (var4 = 0; var4 < 64; var4++) {
                if (((d) this).field_v[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, -4451);
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
