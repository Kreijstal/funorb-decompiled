/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    static pg[] field_q;
    int field_j;
    bc[] field_f;
    static String[] field_c;
    int[] field_o;
    int field_i;
    static String field_m;
    int[] field_b;
    private int field_s;
    private byte[] field_a;
    int[] field_h;
    private int[][] field_n;
    int field_t;
    byte[][] field_p;
    int[] field_k;
    int[] field_d;
    int[][] field_r;
    private int[] field_l;
    static int field_e;
    bc field_g;

    public static void a(byte param0) {
        field_q = null;
        field_c = null;
        if (param0 != 13) {
            field_e = 1;
        }
        field_m = null;
    }

    final static bg a(int param0) {
        if (param0 < 111) {
            km.a((byte) 11);
        }
        bg var1 = new bg(ah.field_A, sb.field_j, ha.field_s[0], hj.field_K[0], sb.field_m[0], rf.field_p[0], qc.field_b[0], wb.field_a);
        mj.a((byte) 79);
        return var1;
    }

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
        dh var18 = null;
        byte[] var22 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
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
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        var16 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var18 = new dh(qg.a(-1, param1));
              var4 = var18.a(-16384);
              if (5 > var4) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (6 <= var4) {
                      ((km) this).field_t = var18.f((byte) -107);
                      break L2;
                    } else {
                      ((km) this).field_t = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var18.a(-16384);
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
                    if (var4 < 7) {
                      ((km) this).field_s = var18.i(-25578);
                      break L4;
                    } else {
                      ((km) this).field_s = var18.d(-10355);
                      break L4;
                    }
                  }
                  L5: {
                    if (0 == (var5 & 2)) {
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
                    ((km) this).field_b = new int[((km) this).field_s];
                    var9 = -1;
                    if (7 <= var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= ((km) this).field_s) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var18.d(-10355);
                            var8 = dupTemp$4;
                            ((km) this).field_b[var10] = dupTemp$4;
                            if (var9 < ((km) this).field_b[var10]) {
                              var9 = ((km) this).field_b[var10];
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
                        if (var10 >= ((km) this).field_s) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var18.i(-25578);
                            var8 = dupTemp$5;
                            ((km) this).field_b[var10] = dupTemp$5;
                            if (((km) this).field_b[var10] > var9) {
                              var9 = ((km) this).field_b[var10];
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
                    ((km) this).field_j = 1 + var9;
                    ((km) this).field_h = new int[((km) this).field_j];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      ((km) this).field_p = new byte[((km) this).field_j][];
                      break L11;
                    }
                  }
                  L12: {
                    ((km) this).field_r = new int[((km) this).field_j][];
                    ((km) this).field_d = new int[((km) this).field_j];
                    ((km) this).field_o = new int[((km) this).field_j];
                    ((km) this).field_k = new int[((km) this).field_j];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((km) this).field_l = new int[((km) this).field_j];
                      var10 = 0;
                      L13: while (true) {
                        if (((km) this).field_j <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (((km) this).field_s <= var10) {
                              ((km) this).field_g = new bc(((km) this).field_l);
                              break L12;
                            } else {
                              ((km) this).field_l[((km) this).field_b[var10]] = var18.f((byte) -107);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((km) this).field_l[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (((km) this).field_s <= var10) {
                      L16: {
                        if (param0 >= 37) {
                          break L16;
                        } else {
                          var17 = null;
                          this.a(107, (byte[]) null);
                          break L16;
                        }
                      }
                      L17: {
                        if (var7 == 0) {
                          break L17;
                        } else {
                          var10 = 0;
                          L18: while (true) {
                            if (((km) this).field_s <= var10) {
                              break L17;
                            } else {
                              var22 = new byte[64];
                              var18.a(64, 0, 103, var22);
                              ((km) this).field_p[((km) this).field_b[var10]] = var22;
                              var10++;
                              continue L18;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L19: while (true) {
                        if (var10 >= ((km) this).field_s) {
                          L20: {
                            if (var4 >= 7) {
                              var10 = 0;
                              L21: while (true) {
                                if (var10 >= ((km) this).field_s) {
                                  var10 = 0;
                                  L22: while (true) {
                                    if (((km) this).field_s <= var10) {
                                      break L20;
                                    } else {
                                      var11 = ((km) this).field_b[var10];
                                      var8 = 0;
                                      var12 = ((km) this).field_d[var11];
                                      ((km) this).field_r[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L23: while (true) {
                                        if (var14 >= var12) {
                                          L24: {
                                            ((km) this).field_k[var11] = 1 + var13;
                                            if (var12 != 1 + var13) {
                                              break L24;
                                            } else {
                                              ((km) this).field_r[var11] = null;
                                              break L24;
                                            }
                                          }
                                          var10++;
                                          continue L22;
                                        } else {
                                          L25: {
                                            int dupTemp$6 = var8 + var18.d(-10355);
                                            var8 = dupTemp$6;
                                            ((km) this).field_r[var11][var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (var15 <= var13) {
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
                                  ((km) this).field_d[((km) this).field_b[var10]] = var18.d(-10355);
                                  var10++;
                                  continue L21;
                                }
                              }
                            } else {
                              var10 = 0;
                              L26: while (true) {
                                if (((km) this).field_s <= var10) {
                                  var10 = 0;
                                  L27: while (true) {
                                    if (((km) this).field_s <= var10) {
                                      break L20;
                                    } else {
                                      var11 = ((km) this).field_b[var10];
                                      var12 = ((km) this).field_d[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      ((km) this).field_r[var11] = new int[var12];
                                      var14 = 0;
                                      L28: while (true) {
                                        if (var12 <= var14) {
                                          L29: {
                                            ((km) this).field_k[var11] = 1 + var13;
                                            if (1 + var13 == var12) {
                                              ((km) this).field_r[var11] = null;
                                              break L29;
                                            } else {
                                              break L29;
                                            }
                                          }
                                          var10++;
                                          continue L27;
                                        } else {
                                          L30: {
                                            int dupTemp$7 = var8 + var18.i(-25578);
                                            var8 = dupTemp$7;
                                            ((km) this).field_r[var11][var14] = dupTemp$7;
                                            var15 = dupTemp$7;
                                            if (var13 < var15) {
                                              var13 = var15;
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
                                  ((km) this).field_d[((km) this).field_b[var10]] = var18.i(-25578);
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
                              ((km) this).field_n = new int[1 + var9][];
                              ((km) this).field_f = new bc[1 + var9];
                              var10 = 0;
                              L32: while (true) {
                                if (((km) this).field_s <= var10) {
                                  break L31;
                                } else {
                                  var11 = ((km) this).field_b[var10];
                                  var12 = ((km) this).field_d[var11];
                                  ((km) this).field_n[var11] = new int[((km) this).field_k[var11]];
                                  var13 = 0;
                                  L33: while (true) {
                                    if (var13 >= ((km) this).field_k[var11]) {
                                      var13 = 0;
                                      L34: while (true) {
                                        if (var13 >= var12) {
                                          ((km) this).field_f[var11] = new bc(((km) this).field_n[var11]);
                                          var10++;
                                          continue L32;
                                        } else {
                                          L35: {
                                            if (((km) this).field_r[var11] == null) {
                                              var14 = var13;
                                              break L35;
                                            } else {
                                              var14 = ((km) this).field_r[var11][var13];
                                              break L35;
                                            }
                                          }
                                          ((km) this).field_n[var11][var14] = var18.f((byte) -107);
                                          var13++;
                                          continue L34;
                                        }
                                      }
                                    } else {
                                      ((km) this).field_n[var11][var13] = -1;
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
                          ((km) this).field_o[((km) this).field_b[var10]] = var18.f((byte) -107);
                          var10++;
                          continue L19;
                        }
                      }
                    } else {
                      ((km) this).field_h[((km) this).field_b[var10]] = var18.f((byte) -107);
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
            stackOut_95_1 = new StringBuilder().append("km.A(").append(param0).append(44);
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
          throw qk.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + 41);
        }
    }

    km(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((km) this).field_i = j.a(0, param0.length, param0);
            if (((km) this).field_i != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                int discarded$0 = 8;
                ((km) this).field_a = tg.a(param0, param0.length, 0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != ((km) this).field_a[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(94, param0);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "km.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Names should contain a maximum of 12 characters";
        field_q = new pg[10];
        field_e = 1600;
    }
}
