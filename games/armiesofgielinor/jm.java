/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm {
    static String[] field_w;
    byte[][] field_v;
    lr field_l;
    int[] field_e;
    int[] field_q;
    static je field_b;
    private int[] field_m;
    int field_s;
    private int[][] field_j;
    private byte[] field_n;
    static at field_o;
    static String field_d;
    lr[] field_f;
    static String field_u;
    private int field_r;
    int field_i;
    int[] field_p;
    int[][] field_a;
    int[] field_t;
    int field_c;
    static boolean field_g;
    static volatile int field_k;
    int[] field_h;

    private final void a(byte[] param0, boolean param1) {
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
        vh var18 = null;
        byte[] var22 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = ArmiesOfGielinor.field_M ? 1 : 0;
          var18 = new vh(el.a(param1, param0));
          var4 = var18.k(0);
          if (5 > var4) {
            break L0;
          } else {
            if ((var4 ^ -1) >= -8) {
              L1: {
                if (var4 >= 6) {
                  ((jm) this).field_c = var18.i(1);
                  break L1;
                } else {
                  ((jm) this).field_c = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var18.k(0);
                if ((var5 & 1) == 0) {
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
                if ((var5 & 2) == 0) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
              L4: {
                var7 = stackIn_13_0;
                if (7 > var4) {
                  ((jm) this).field_r = var18.e((byte) -104);
                  break L4;
                } else {
                  ((jm) this).field_r = var18.f((byte) 111);
                  break L4;
                }
              }
              L5: {
                var8 = 0;
                ((jm) this).field_q = new int[((jm) this).field_r];
                var9 = -1;
                if (-8 < (var4 ^ -1)) {
                  var10 = 0;
                  L6: while (true) {
                    if (((jm) this).field_r <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var18.e((byte) -104);
                      ((jm) this).field_q[var10] = var8 + var18.e((byte) -104);
                      if (((jm) this).field_q[var10] > var9) {
                        var9 = ((jm) this).field_q[var10];
                        var10++;
                        continue L6;
                      } else {
                        var10++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L7: while (true) {
                    if (((jm) this).field_r <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var18.f((byte) 101);
                      ((jm) this).field_q[var10] = var8 + var18.f((byte) 101);
                      if (var9 < ((jm) this).field_q[var10]) {
                        var9 = ((jm) this).field_q[var10];
                        var10++;
                        continue L7;
                      } else {
                        var10++;
                        continue L7;
                      }
                    }
                  }
                }
              }
              L8: {
                ((jm) this).field_i = var9 + 1;
                if (!param1) {
                  break L8;
                } else {
                  var17 = null;
                  this.a((byte[]) null, true);
                  break L8;
                }
              }
              L9: {
                ((jm) this).field_e = new int[((jm) this).field_i];
                ((jm) this).field_h = new int[((jm) this).field_i];
                ((jm) this).field_a = new int[((jm) this).field_i][];
                if (var7 != 0) {
                  ((jm) this).field_v = new byte[((jm) this).field_i][];
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                ((jm) this).field_p = new int[((jm) this).field_i];
                ((jm) this).field_t = new int[((jm) this).field_i];
                if (var6 == 0) {
                  break L10;
                } else {
                  ((jm) this).field_m = new int[((jm) this).field_i];
                  var10 = 0;
                  L11: while (true) {
                    if (var10 >= ((jm) this).field_i) {
                      var10 = 0;
                      L12: while (true) {
                        if (((jm) this).field_r <= var10) {
                          ((jm) this).field_l = new lr(((jm) this).field_m);
                          break L10;
                        } else {
                          ((jm) this).field_m[((jm) this).field_q[var10]] = var18.i(1);
                          var10++;
                          continue L12;
                        }
                      }
                    } else {
                      ((jm) this).field_m[var10] = -1;
                      var10++;
                      continue L11;
                    }
                  }
                }
              }
              var10 = 0;
              L13: while (true) {
                if (var10 >= ((jm) this).field_r) {
                  L14: {
                    if (var7 == 0) {
                      break L14;
                    } else {
                      var10 = 0;
                      L15: while (true) {
                        if (var10 >= ((jm) this).field_r) {
                          break L14;
                        } else {
                          var22 = new byte[64];
                          var18.a(0, 64, 0, var22);
                          ((jm) this).field_v[((jm) this).field_q[var10]] = var22;
                          var10++;
                          continue L15;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L16: while (true) {
                    if (var10 >= ((jm) this).field_r) {
                      L17: {
                        if (var4 >= 7) {
                          var10 = 0;
                          L18: while (true) {
                            if (((jm) this).field_r <= var10) {
                              var10 = 0;
                              L19: while (true) {
                                if (var10 >= ((jm) this).field_r) {
                                  break L17;
                                } else {
                                  var11 = ((jm) this).field_q[var10];
                                  var8 = 0;
                                  var12 = ((jm) this).field_p[var11];
                                  ((jm) this).field_a[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L20: while (true) {
                                    if (var14 >= var12) {
                                      ((jm) this).field_h[var11] = var13 + 1;
                                      if (var12 == 1 + var13) {
                                        ((jm) this).field_a[var11] = null;
                                        var10++;
                                        continue L19;
                                      } else {
                                        var10++;
                                        continue L19;
                                      }
                                    } else {
                                      var8 = var8 + var18.f((byte) 125);
                                      ((jm) this).field_a[var11][var14] = var8 + var18.f((byte) 125);
                                      var15 = var8 + var18.f((byte) 125);
                                      if (var15 > var13) {
                                        var13 = var15;
                                        var14++;
                                        continue L20;
                                      } else {
                                        var14++;
                                        continue L20;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              ((jm) this).field_p[((jm) this).field_q[var10]] = var18.f((byte) 102);
                              var10++;
                              continue L18;
                            }
                          }
                        } else {
                          var10 = 0;
                          L21: while (true) {
                            if (((jm) this).field_r <= var10) {
                              var10 = 0;
                              L22: while (true) {
                                if (var10 >= ((jm) this).field_r) {
                                  break L17;
                                } else {
                                  var11 = ((jm) this).field_q[var10];
                                  var8 = 0;
                                  var12 = ((jm) this).field_p[var11];
                                  var13 = -1;
                                  ((jm) this).field_a[var11] = new int[var12];
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var12 <= var14) {
                                      ((jm) this).field_h[var11] = var13 + 1;
                                      if (var12 == 1 + var13) {
                                        ((jm) this).field_a[var11] = null;
                                        var10++;
                                        continue L22;
                                      } else {
                                        var10++;
                                        continue L22;
                                      }
                                    } else {
                                      var8 = var8 + var18.e((byte) -104);
                                      ((jm) this).field_a[var11][var14] = var8 + var18.e((byte) -104);
                                      var15 = var8 + var18.e((byte) -104);
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
                              ((jm) this).field_p[((jm) this).field_q[var10]] = var18.e((byte) -104);
                              var10++;
                              continue L21;
                            }
                          }
                        }
                      }
                      L24: {
                        if (var6 == 0) {
                          break L24;
                        } else {
                          ((jm) this).field_j = new int[var9 + 1][];
                          ((jm) this).field_f = new lr[1 + var9];
                          var10 = 0;
                          L25: while (true) {
                            if (var10 >= ((jm) this).field_r) {
                              break L24;
                            } else {
                              var11 = ((jm) this).field_q[var10];
                              var12 = ((jm) this).field_p[var11];
                              ((jm) this).field_j[var11] = new int[((jm) this).field_h[var11]];
                              var13 = 0;
                              L26: while (true) {
                                if (((jm) this).field_h[var11] <= var13) {
                                  var13 = 0;
                                  L27: while (true) {
                                    if (var13 >= var12) {
                                      ((jm) this).field_f[var11] = new lr(((jm) this).field_j[var11]);
                                      var10++;
                                      continue L25;
                                    } else {
                                      L28: {
                                        if (((jm) this).field_a[var11] == null) {
                                          var14 = var13;
                                          break L28;
                                        } else {
                                          var14 = ((jm) this).field_a[var11][var13];
                                          break L28;
                                        }
                                      }
                                      ((jm) this).field_j[var11][var14] = var18.i(1);
                                      var13++;
                                      continue L27;
                                    }
                                  }
                                } else {
                                  ((jm) this).field_j[var11][var13] = -1;
                                  var13++;
                                  continue L26;
                                }
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      ((jm) this).field_t[((jm) this).field_q[var10]] = var18.i(1);
                      var10++;
                      continue L16;
                    }
                  }
                } else {
                  ((jm) this).field_e[((jm) this).field_q[var10]] = var18.i(1);
                  var10++;
                  continue L13;
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new RuntimeException();
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        vh.a(0, df.field_T, false, pd.field_e, kt.field_p, param0, true);
        for (var2 = param1; kt.field_p > var2; var2++) {
            vt.field_m[param0 + var2] = var2;
        }
        vh.a(param0, se.field_e, false, sq.field_k, kt.field_p + param0, param0 + param0, false);
        if (!(param0 >= kt.field_p)) {
            kt.field_p = param0;
        }
    }

    final static void a(je param0, int param1) {
        je var5 = null;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        je var4 = (je) (Object) param0.field_fb.e((byte) 121);
        je var2 = var4;
        while (var4 != null) {
            var4.field_nb = 0;
            var4.field_ob = 0;
            var4.field_db = 0;
            var4.field_ab = 0;
            var5 = (je) (Object) param0.field_fb.a((byte) 123);
            je var5_ref = var5;
        }
        param0.field_nb = 0;
        param0.field_ob = 0;
        param0.field_ab = 0;
        if (param1 > -42) {
            return;
        }
        param0.field_db = 0;
    }

    public static void a(int param0) {
        field_w = null;
        field_u = null;
        if (param0 > -48) {
            return;
        }
        field_o = null;
        field_d = null;
        field_b = null;
    }

    jm(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((jm) this).field_s = pk.a(param0, param0.length, 120);
        if (((jm) this).field_s != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (64 != param2.length) {
                throw new RuntimeException();
            }
            ((jm) this).field_n = ua.a(-18423, param0.length, param0, 0);
            for (var4 = 0; 64 > var4; var4++) {
                if (((jm) this).field_n[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new String[]{"Player_1", "Player_2", "Player_3", "Player_4", "Player_5", "Player_6", "Player_7", "Player_8"};
        field_u = "Remove name";
        field_d = "Accessories";
        field_g = false;
        field_o = new at();
        field_k = 0;
    }
}
