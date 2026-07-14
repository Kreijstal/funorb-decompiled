/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kn {
    private int[][] field_l;
    byte[][] field_g;
    int[] field_n;
    private int field_q;
    gl[] field_c;
    int[] field_e;
    int[] field_k;
    int field_o;
    int[] field_u;
    private int[] field_j;
    static String field_i;
    gl field_h;
    int field_t;
    int[] field_p;
    int[][] field_m;
    static tk field_r;
    static int field_a;
    static Calendar field_f;
    int field_s;
    private byte[] field_d;
    static int[] field_b;

    final static jk a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, ah[] param8, int param9, int param10, int param11, int param12) {
        jk var14 = null;
        jk var13 = null;
        if (mm.field_e.b(0)) {
            var13 = new jk(param6, param1, param0, param10, param3, param9, param12, param2, param11, param5);
        } else {
            var14 = (jk) (Object) mm.field_e.a((byte) 74);
            var13 = var14;
            var14.a(param2, param3, param1, param10, param0, (byte) -126, param6, param9, param12, param11, param5);
        }
        param8[param4 + param7].a((byte) -113, (hl) (Object) var13);
        return var13;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 <= 35) {
            return;
        }
        field_i = null;
        field_f = null;
        field_r = null;
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
        th var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = HoldTheLine.field_D;
          var17 = new th(ph.a((byte) -1, param1));
          var4 = var17.f((byte) -125);
          if (var4 > -6) {
            break L0;
          } else {
            if (-8 < var4) {
              break L0;
            } else {
              L1: {
                if ((var4 ^ -1) > -7) {
                  ((kn) this).field_s = 0;
                  break L1;
                } else {
                  ((kn) this).field_s = var17.a(-59);
                  break L1;
                }
              }
              L2: {
                var5 = var17.f((byte) -43);
                if (0 == (1 & var5)) {
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
                if ((2 & var5) == 0) {
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
                  ((kn) this).field_q = var17.k(-69);
                  break L4;
                } else {
                  ((kn) this).field_q = var17.g(-23);
                  break L4;
                }
              }
              L5: {
                var8 = 0;
                ((kn) this).field_n = new int[((kn) this).field_q];
                var9 = -1;
                if (7 > var4) {
                  var10 = 0;
                  L6: while (true) {
                    if (var10 >= ((kn) this).field_q) {
                      break L5;
                    } else {
                      var8 = var8 + var17.k(89);
                      ((kn) this).field_n[var10] = var8 + var17.k(89);
                      if (var9 < ((kn) this).field_n[var10]) {
                        var9 = ((kn) this).field_n[var10];
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
                    if (var10 >= ((kn) this).field_q) {
                      break L5;
                    } else {
                      var8 = var8 + var17.g(-123);
                      ((kn) this).field_n[var10] = var8 + var17.g(-123);
                      if (((kn) this).field_n[var10] > var9) {
                        var9 = ((kn) this).field_n[var10];
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
                ((kn) this).field_o = 1 + var9;
                ((kn) this).field_m = new int[((kn) this).field_o][];
                ((kn) this).field_e = new int[((kn) this).field_o];
                ((kn) this).field_u = new int[((kn) this).field_o];
                ((kn) this).field_p = new int[((kn) this).field_o];
                if (var7 != 0) {
                  ((kn) this).field_g = new byte[((kn) this).field_o][];
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                ((kn) this).field_k = new int[((kn) this).field_o];
                if (var6 == 0) {
                  break L9;
                } else {
                  ((kn) this).field_j = new int[((kn) this).field_o];
                  var10 = 0;
                  L10: while (true) {
                    if (((kn) this).field_o <= var10) {
                      var10 = 0;
                      L11: while (true) {
                        if (((kn) this).field_q <= var10) {
                          ((kn) this).field_h = new gl(((kn) this).field_j);
                          break L9;
                        } else {
                          ((kn) this).field_j[((kn) this).field_n[var10]] = var17.a(-98);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((kn) this).field_j[var10] = -1;
                      var10++;
                      continue L10;
                    }
                  }
                }
              }
              var10 = 0;
              L12: while (true) {
                if (var10 >= ((kn) this).field_q) {
                  L13: {
                    if (var7 == 0) {
                      break L13;
                    } else {
                      var10 = 0;
                      L14: while (true) {
                        if (((kn) this).field_q <= var10) {
                          break L13;
                        } else {
                          var21 = new byte[64];
                          var17.a(64, 0, (byte) 84, var21);
                          ((kn) this).field_g[((kn) this).field_n[var10]] = var21;
                          var10++;
                          continue L14;
                        }
                      }
                    }
                  }
                  L15: {
                    if (param0) {
                      break L15;
                    } else {
                      ((kn) this).field_k = null;
                      break L15;
                    }
                  }
                  var10 = 0;
                  L16: while (true) {
                    if (((kn) this).field_q <= var10) {
                      L17: {
                        if (-8 >= (var4 ^ -1)) {
                          var10 = 0;
                          L18: while (true) {
                            if (var10 >= ((kn) this).field_q) {
                              var10 = 0;
                              L19: while (true) {
                                if (((kn) this).field_q <= var10) {
                                  break L17;
                                } else {
                                  var11 = ((kn) this).field_n[var10];
                                  var12 = ((kn) this).field_u[var11];
                                  var8 = 0;
                                  ((kn) this).field_m[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L20: while (true) {
                                    if (var14 >= var12) {
                                      ((kn) this).field_k[var11] = 1 + var13;
                                      if (1 + var13 == var12) {
                                        ((kn) this).field_m[var11] = null;
                                        var10++;
                                        continue L19;
                                      } else {
                                        var10++;
                                        continue L19;
                                      }
                                    } else {
                                      var8 = var8 + var17.g(-54);
                                      ((kn) this).field_m[var11][var14] = var8 + var17.g(-54);
                                      var15 = var8 + var17.g(-54);
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
                              ((kn) this).field_u[((kn) this).field_n[var10]] = var17.g(-60);
                              var10++;
                              continue L18;
                            }
                          }
                        } else {
                          var10 = 0;
                          L21: while (true) {
                            if (var10 >= ((kn) this).field_q) {
                              var10 = 0;
                              L22: while (true) {
                                if (var10 >= ((kn) this).field_q) {
                                  break L17;
                                } else {
                                  var11 = ((kn) this).field_n[var10];
                                  var12 = ((kn) this).field_u[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  ((kn) this).field_m[var11] = new int[var12];
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var14 >= var12) {
                                      ((kn) this).field_k[var11] = 1 + var13;
                                      if (1 + var13 == var12) {
                                        ((kn) this).field_m[var11] = null;
                                        var10++;
                                        continue L22;
                                      } else {
                                        var10++;
                                        continue L22;
                                      }
                                    } else {
                                      var8 = var8 + var17.k(-121);
                                      ((kn) this).field_m[var11][var14] = var8 + var17.k(-121);
                                      var15 = var8 + var17.k(-121);
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
                              ((kn) this).field_u[((kn) this).field_n[var10]] = var17.k(122);
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
                          ((kn) this).field_c = new gl[var9 - -1];
                          ((kn) this).field_l = new int[1 + var9][];
                          var10 = 0;
                          L25: while (true) {
                            if (((kn) this).field_q <= var10) {
                              break L24;
                            } else {
                              var11 = ((kn) this).field_n[var10];
                              var12 = ((kn) this).field_u[var11];
                              ((kn) this).field_l[var11] = new int[((kn) this).field_k[var11]];
                              var13 = 0;
                              L26: while (true) {
                                if (var13 >= ((kn) this).field_k[var11]) {
                                  var13 = 0;
                                  L27: while (true) {
                                    if (var13 >= var12) {
                                      ((kn) this).field_c[var11] = new gl(((kn) this).field_l[var11]);
                                      var10++;
                                      continue L25;
                                    } else {
                                      L28: {
                                        if (null != ((kn) this).field_m[var11]) {
                                          var14 = ((kn) this).field_m[var11][var13];
                                          break L28;
                                        } else {
                                          var14 = var13;
                                          break L28;
                                        }
                                      }
                                      ((kn) this).field_l[var11][var14] = var17.a(72);
                                      var13++;
                                      continue L27;
                                    }
                                  }
                                } else {
                                  ((kn) this).field_l[var11][var13] = -1;
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
                      ((kn) this).field_p[((kn) this).field_n[var10]] = var17.a(-63);
                      var10++;
                      continue L16;
                    }
                  }
                } else {
                  ((kn) this).field_e[((kn) this).field_n[var10]] = var17.a(-66);
                  var10++;
                  continue L12;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    final static vk b(byte param0) {
        if (param0 != -49) {
            kn.a((byte) -96);
        }
        if (-4 == (mi.field_d ^ -1)) {
            return tk.field_c[4][0];
        }
        if (mi.field_d != 2) {
            return tk.field_c[cf.field_w][vg.field_P];
        }
        return tk.field_c[5][vg.field_P];
    }

    kn(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((kn) this).field_t = pg.a((byte) -86, param0, param0.length);
        if (param1 != ((kn) this).field_t) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (param2.length != 64) {
                throw new RuntimeException();
            }
            ((kn) this).field_d = wc.a(param0, -6408, 0, param0.length);
            for (var4 = 0; 64 > var4; var4++) {
                if (((kn) this).field_d[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(true, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Back";
        field_f = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
