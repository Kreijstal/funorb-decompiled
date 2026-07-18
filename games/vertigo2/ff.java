/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static String[] field_n;
    static int field_b;
    int[] field_l;
    byte[][] field_s;
    private int field_q;
    pq field_k;
    int[][] field_g;
    static long field_d;
    int field_c;
    int[] field_h;
    int[] field_e;
    static boolean field_m;
    static String field_u;
    int[] field_j;
    private int[] field_f;
    private byte[] field_a;
    int[] field_r;
    pq[] field_t;
    static String field_v;
    int field_p;
    private int[][] field_i;
    int field_o;

    final static void b(byte param0) {
        vd.field_b = new mk();
        n.field_b.a(false, (iq) (Object) vd.field_b);
    }

    private final void a(byte[] param0, boolean param1) {
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
        ed var17 = null;
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
        var16 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new ed(hm.a(-20595, param0));
              var4 = var17.h(-11);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 < 6) {
                      ((ff) this).field_c = 0;
                      break L2;
                    } else {
                      ((ff) this).field_c = var17.b(true);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.h(-11);
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
                      ((ff) this).field_q = var17.a(82);
                      break L5;
                    } else {
                      ((ff) this).field_q = var17.a((byte) -11);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    var9 = -1;
                    ((ff) this).field_e = new int[((ff) this).field_q];
                    if (var4 < 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (~var10 <= ~((ff) this).field_q) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.a((byte) -11);
                            var8 = dupTemp$4;
                            ((ff) this).field_e[var10] = dupTemp$4;
                            if (((ff) this).field_e[var10] <= var9) {
                              break L8;
                            } else {
                              var9 = ((ff) this).field_e[var10];
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
                        if (~((ff) this).field_q >= ~var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.a(118);
                            var8 = dupTemp$5;
                            ((ff) this).field_e[var10] = dupTemp$5;
                            if (var9 < ((ff) this).field_e[var10]) {
                              var9 = ((ff) this).field_e[var10];
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
                    ((ff) this).field_p = 1 + var9;
                    if (var7 != 0) {
                      ((ff) this).field_s = new byte[((ff) this).field_p][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((ff) this).field_h = new int[((ff) this).field_p];
                    ((ff) this).field_g = new int[((ff) this).field_p][];
                    ((ff) this).field_j = new int[((ff) this).field_p];
                    ((ff) this).field_l = new int[((ff) this).field_p];
                    ((ff) this).field_r = new int[((ff) this).field_p];
                    if (var6 != 0) {
                      ((ff) this).field_f = new int[((ff) this).field_p];
                      var10 = 0;
                      L13: while (true) {
                        if (~((ff) this).field_p >= ~var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((ff) this).field_q) {
                              ((ff) this).field_k = new pq(((ff) this).field_f);
                              break L12;
                            } else {
                              ((ff) this).field_f[((ff) this).field_e[var10]] = var17.b(true);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((ff) this).field_f[var10] = -1;
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
                    if (var10 >= ((ff) this).field_q) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= ((ff) this).field_q) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(0, var21, 64, 78);
                              ((ff) this).field_s[((ff) this).field_e[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (~((ff) this).field_q >= ~var10) {
                          L19: {
                            if (var4 >= 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (((ff) this).field_q <= var10) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (~var10 <= ~((ff) this).field_q) {
                                      break L19;
                                    } else {
                                      var11 = ((ff) this).field_e[var10];
                                      var12 = ((ff) this).field_h[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      ((ff) this).field_g[var11] = new int[var12];
                                      var14 = 0;
                                      L22: while (true) {
                                        if (~var12 >= ~var14) {
                                          L23: {
                                            ((ff) this).field_r[var11] = 1 + var13;
                                            if (1 + var13 != var12) {
                                              break L23;
                                            } else {
                                              ((ff) this).field_g[var11] = null;
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var17.a(83);
                                            var8 = dupTemp$6;
                                            ((ff) this).field_g[var11][var14] = dupTemp$6;
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
                                  ((ff) this).field_h[((ff) this).field_e[var10]] = var17.a(113);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (~var10 <= ~((ff) this).field_q) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (~((ff) this).field_q >= ~var10) {
                                      break L19;
                                    } else {
                                      var11 = ((ff) this).field_e[var10];
                                      var8 = 0;
                                      var12 = ((ff) this).field_h[var11];
                                      ((ff) this).field_g[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var14 >= var12) {
                                          L28: {
                                            ((ff) this).field_r[var11] = 1 + var13;
                                            if (var13 + 1 != var12) {
                                              break L28;
                                            } else {
                                              ((ff) this).field_g[var11] = null;
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var17.a((byte) -11);
                                            var8 = dupTemp$7;
                                            ((ff) this).field_g[var11][var14] = dupTemp$7;
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
                                  ((ff) this).field_h[((ff) this).field_e[var10]] = var17.a((byte) -11);
                                  var10++;
                                  continue L25;
                                }
                              }
                            }
                          }
                          L30: {
                            if (var6 != 0) {
                              ((ff) this).field_i = new int[var9 + 1][];
                              ((ff) this).field_t = new pq[var9 + 1];
                              var10 = 0;
                              L31: while (true) {
                                if (~((ff) this).field_q >= ~var10) {
                                  break L30;
                                } else {
                                  var11 = ((ff) this).field_e[var10];
                                  var12 = ((ff) this).field_h[var11];
                                  ((ff) this).field_i[var11] = new int[((ff) this).field_r[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (~((ff) this).field_r[var11] >= ~var13) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var12 <= var13) {
                                          ((ff) this).field_t[var11] = new pq(((ff) this).field_i[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (null == ((ff) this).field_g[var11]) {
                                              var14 = var13;
                                              break L34;
                                            } else {
                                              var14 = ((ff) this).field_g[var11][var13];
                                              break L34;
                                            }
                                          }
                                          ((ff) this).field_i[var11][var14] = var17.b(true);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((ff) this).field_i[var11][var13] = -1;
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
                          ((ff) this).field_l[((ff) this).field_e[var10]] = var17.b(true);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((ff) this).field_j[((ff) this).field_e[var10]] = var17.b(true);
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
            stackOut_95_0 = (RuntimeException) var3;
            stackOut_95_1 = new StringBuilder().append("ff.D(");
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param0 == null) {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L35;
            } else {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L35;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + ',' + true + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        kq.b(-69, param0);
        rg.a((byte) 53, param0);
    }

    public static void a(byte param0) {
        field_u = null;
        field_v = null;
        field_n = null;
    }

    ff(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((ff) this).field_o = w.a(param0.length, param0, -7);
            if (param1 != ((ff) this).field_o) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((ff) this).field_a = de.a(0, (byte) -114, param0.length, param0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((ff) this).field_a[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, true);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ff.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_b = 0;
        field_m = false;
        field_v = "Month";
    }
}
