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
        jk var13 = null;
        RuntimeException var13_ref = null;
        jk var14 = null;
        jk stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        jk stackOut_3_0 = null;
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
            L1: {
              if (!mm.field_e.b(0)) {
                var14 = (jk) (Object) mm.field_e.a((byte) 74);
                var13 = var14;
                var14.a(param2, param3, param1, param10, param0, (byte) -126, param6, param9, param12, param11, param5);
                break L1;
              } else {
                var13 = new jk(param6, param1, param0, param10, param3, param9, param12, param2, param11, param5);
                break L1;
              }
            }
            param8[1 + param7].a((byte) -113, (hl) (Object) var13);
            stackOut_3_0 = (jk) var13;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var13_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var13_ref;
            stackOut_5_1 = new StringBuilder().append("kn.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(1).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param8 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + param12 + 41);
        }
        return stackIn_4_0;
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
        th var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
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
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        var16 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var17 = new th(ph.a((byte) -1, param1));
              var4 = var17.f((byte) -125);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 < 6) {
                      ((kn) this).field_s = 0;
                      break L2;
                    } else {
                      ((kn) this).field_s = var17.a(-59);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.f((byte) -43);
                    if (0 == (1 & var5)) {
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
                    if (7 > var4) {
                      ((kn) this).field_q = var17.k(-69);
                      break L5;
                    } else {
                      ((kn) this).field_q = var17.g(-23);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    ((kn) this).field_n = new int[((kn) this).field_q];
                    var9 = -1;
                    if (7 > var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (~var10 <= ~((kn) this).field_q) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.k(89);
                            var8 = dupTemp$4;
                            ((kn) this).field_n[var10] = dupTemp$4;
                            if (~var9 <= ~((kn) this).field_n[var10]) {
                              break L8;
                            } else {
                              var9 = ((kn) this).field_n[var10];
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
                        if (~var10 <= ~((kn) this).field_q) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.g(-123);
                            var8 = dupTemp$5;
                            ((kn) this).field_n[var10] = dupTemp$5;
                            if (~((kn) this).field_n[var10] < ~var9) {
                              var9 = ((kn) this).field_n[var10];
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
                    ((kn) this).field_o = 1 + var9;
                    ((kn) this).field_m = new int[((kn) this).field_o][];
                    ((kn) this).field_e = new int[((kn) this).field_o];
                    ((kn) this).field_u = new int[((kn) this).field_o];
                    ((kn) this).field_p = new int[((kn) this).field_o];
                    if (var7 != 0) {
                      ((kn) this).field_g = new byte[((kn) this).field_o][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((kn) this).field_k = new int[((kn) this).field_o];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((kn) this).field_j = new int[((kn) this).field_o];
                      var10 = 0;
                      L13: while (true) {
                        if (~((kn) this).field_o >= ~var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (~((kn) this).field_q >= ~var10) {
                              ((kn) this).field_h = new gl(((kn) this).field_j);
                              break L12;
                            } else {
                              ((kn) this).field_j[((kn) this).field_n[var10]] = var17.a(-98);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((kn) this).field_j[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (var10 >= ((kn) this).field_q) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (~((kn) this).field_q >= ~var10) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(64, 0, (byte) 84, var21);
                              ((kn) this).field_g[((kn) this).field_n[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (~((kn) this).field_q >= ~var10) {
                          L19: {
                            if (var4 >= 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (~var10 <= ~((kn) this).field_q) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (((kn) this).field_q <= var10) {
                                      break L19;
                                    } else {
                                      var11 = ((kn) this).field_n[var10];
                                      var12 = ((kn) this).field_u[var11];
                                      var8 = 0;
                                      ((kn) this).field_m[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L22: while (true) {
                                        if (~var14 <= ~var12) {
                                          L23: {
                                            ((kn) this).field_k[var11] = 1 + var13;
                                            if (1 + var13 == var12) {
                                              ((kn) this).field_m[var11] = null;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var17.g(-54);
                                            var8 = dupTemp$6;
                                            ((kn) this).field_m[var11][var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (var15 > var13) {
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
                                  ((kn) this).field_u[((kn) this).field_n[var10]] = var17.g(-60);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (~var10 <= ~((kn) this).field_q) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (~var10 <= ~((kn) this).field_q) {
                                      break L19;
                                    } else {
                                      var11 = ((kn) this).field_n[var10];
                                      var12 = ((kn) this).field_u[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      ((kn) this).field_m[var11] = new int[var12];
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var14 >= var12) {
                                          L28: {
                                            ((kn) this).field_k[var11] = 1 + var13;
                                            if (~(1 + var13) == ~var12) {
                                              ((kn) this).field_m[var11] = null;
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var17.k(-121);
                                            var8 = dupTemp$7;
                                            ((kn) this).field_m[var11][var14] = dupTemp$7;
                                            var15 = dupTemp$7;
                                            if (var15 <= var13) {
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
                                  ((kn) this).field_u[((kn) this).field_n[var10]] = var17.k(122);
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
                              ((kn) this).field_c = new gl[var9 - -1];
                              ((kn) this).field_l = new int[1 + var9][];
                              var10 = 0;
                              L31: while (true) {
                                if (~((kn) this).field_q >= ~var10) {
                                  break L30;
                                } else {
                                  var11 = ((kn) this).field_n[var10];
                                  var12 = ((kn) this).field_u[var11];
                                  ((kn) this).field_l[var11] = new int[((kn) this).field_k[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (var13 >= ((kn) this).field_k[var11]) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var13 >= var12) {
                                          ((kn) this).field_c[var11] = new gl(((kn) this).field_l[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (null != ((kn) this).field_m[var11]) {
                                              var14 = ((kn) this).field_m[var11][var13];
                                              break L34;
                                            } else {
                                              var14 = var13;
                                              break L34;
                                            }
                                          }
                                          ((kn) this).field_l[var11][var14] = var17.a(72);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((kn) this).field_l[var11][var13] = -1;
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
                          ((kn) this).field_p[((kn) this).field_n[var10]] = var17.a(-63);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((kn) this).field_e[((kn) this).field_n[var10]] = var17.a(-66);
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
            stackOut_94_1 = new StringBuilder().append("kn.C(").append(1).append(44);
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param1 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_97_0, stackIn_97_2 + 41);
        }
    }

    final static vk b(byte param0) {
        if (param0 != -49) {
            kn.a((byte) -96);
        }
        if (mi.field_d == 3) {
            return tk.field_c[4][0];
        }
        if (mi.field_d != 2) {
            return tk.field_c[cf.field_w][vg.field_P];
        }
        return tk.field_c[5][vg.field_P];
    }

    kn(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((kn) this).field_t = pg.a((byte) -86, param0, param0.length);
            if (param1 != ((kn) this).field_t) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((kn) this).field_d = wc.a(param0, -6408, 0, param0.length);
                for (var4_int = 0; 64 > var4_int; var4_int++) {
                    if (((kn) this).field_d[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(true, param0);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "kn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Back";
        field_f = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
