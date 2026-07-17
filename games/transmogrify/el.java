/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el {
    private int field_u;
    int[] field_s;
    static ce field_n;
    int field_b;
    static int[] field_m;
    static boolean field_g;
    private int[][] field_o;
    private int[] field_k;
    int[] field_i;
    int[] field_c;
    private byte[] field_e;
    int field_l;
    db[] field_t;
    int field_r;
    db field_h;
    int[] field_q;
    int[] field_j;
    byte[][] field_p;
    int[][] field_f;
    static String field_a;
    static int field_d;

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
        oa var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        var16 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new oa(lk.a(-110, param0));
              var4 = var17.d((byte) 85);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (6 <= var4) {
                      ((el) this).field_b = var17.c((byte) -108);
                      break L2;
                    } else {
                      ((el) this).field_b = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.d((byte) 52);
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
                    if (var4 >= 7) {
                      ((el) this).field_u = var17.h(-16777216);
                      break L4;
                    } else {
                      ((el) this).field_u = var17.a((byte) -102);
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
                    ((el) this).field_c = new int[((el) this).field_u];
                    var9 = -1;
                    if (var4 < 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (((el) this).field_u <= var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.a((byte) -95);
                            var8 = dupTemp$4;
                            ((el) this).field_c[var10] = dupTemp$4;
                            if (((el) this).field_c[var10] <= var9) {
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
                        if (((el) this).field_u <= var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.h(-16777216);
                            var8 = dupTemp$5;
                            ((el) this).field_c[var10] = dupTemp$5;
                            if (var9 >= ((el) this).field_c[var10]) {
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
                    ((el) this).field_l = var9 - -1;
                    ((el) this).field_q = new int[((el) this).field_l];
                    ((el) this).field_j = new int[((el) this).field_l];
                    ((el) this).field_i = new int[((el) this).field_l];
                    ((el) this).field_f = new int[((el) this).field_l][];
                    ((el) this).field_s = new int[((el) this).field_l];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      ((el) this).field_p = new byte[((el) this).field_l][];
                      break L11;
                    }
                  }
                  L12: {
                    if (var6 != 0) {
                      ((el) this).field_k = new int[((el) this).field_l];
                      var10 = 0;
                      L13: while (true) {
                        if (var10 >= ((el) this).field_l) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((el) this).field_u) {
                              ((el) this).field_h = new db(((el) this).field_k);
                              break L12;
                            } else {
                              ((el) this).field_k[((el) this).field_c[var10]] = var17.c((byte) -128);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((el) this).field_k[var10] = -1;
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
                    if (((el) this).field_u <= var10) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (((el) this).field_u <= var10) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(64, 2, var21, 0);
                              ((el) this).field_p[((el) this).field_c[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (((el) this).field_u <= var10) {
                          L19: {
                            if (var4 >= 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (var10 >= ((el) this).field_u) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (((el) this).field_u <= var10) {
                                      break L19;
                                    } else {
                                      var11 = ((el) this).field_c[var10];
                                      var8 = 0;
                                      var12 = ((el) this).field_s[var11];
                                      ((el) this).field_f[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var12 <= var14) {
                                          L23: {
                                            ((el) this).field_i[var11] = 1 + var13;
                                            if (var12 != var13 - -1) {
                                              break L23;
                                            } else {
                                              ((el) this).field_f[var11] = null;
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var17.h(-16777216);
                                            var8 = dupTemp$6;
                                            ((el) this).field_f[var11][var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (var15 <= var13) {
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
                                  ((el) this).field_s[((el) this).field_c[var10]] = var17.h(-16777216);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (((el) this).field_u <= var10) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (((el) this).field_u <= var10) {
                                      break L19;
                                    } else {
                                      var11 = ((el) this).field_c[var10];
                                      var12 = ((el) this).field_s[var11];
                                      var8 = 0;
                                      ((el) this).field_f[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var12 <= var14) {
                                          L28: {
                                            ((el) this).field_i[var11] = 1 + var13;
                                            if (var13 + 1 == var12) {
                                              ((el) this).field_f[var11] = null;
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var17.a((byte) -96);
                                            var8 = dupTemp$7;
                                            ((el) this).field_f[var11][var14] = dupTemp$7;
                                            var15 = dupTemp$7;
                                            if (var13 < var15) {
                                              var13 = var15;
                                              break L29;
                                            } else {
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
                                  ((el) this).field_s[((el) this).field_c[var10]] = var17.a((byte) -121);
                                  var10++;
                                  continue L25;
                                }
                              }
                            }
                          }
                          L30: {
                            if (var6 != 0) {
                              ((el) this).field_t = new db[var9 + 1];
                              ((el) this).field_o = new int[var9 + 1][];
                              var10 = 0;
                              L31: while (true) {
                                if (((el) this).field_u <= var10) {
                                  break L30;
                                } else {
                                  var11 = ((el) this).field_c[var10];
                                  var12 = ((el) this).field_s[var11];
                                  ((el) this).field_o[var11] = new int[((el) this).field_i[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (((el) this).field_i[var11] <= var13) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var12 <= var13) {
                                          ((el) this).field_t[var11] = new db(((el) this).field_o[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (((el) this).field_f[var11] != null) {
                                              var14 = ((el) this).field_f[var11][var13];
                                              break L34;
                                            } else {
                                              var14 = var13;
                                              break L34;
                                            }
                                          }
                                          ((el) this).field_o[var11][var14] = var17.c((byte) -126);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((el) this).field_o[var11][var13] = -1;
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
                          ((el) this).field_q[((el) this).field_c[var10]] = var17.c((byte) -123);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((el) this).field_j[((el) this).field_c[var10]] = var17.c((byte) -127);
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
            stackOut_93_0 = (RuntimeException) var3;
            stackOut_93_1 = new StringBuilder().append("el.F(");
            stackIn_95_0 = stackOut_93_0;
            stackIn_95_1 = stackOut_93_1;
            stackIn_94_0 = stackOut_93_0;
            stackIn_94_1 = stackOut_93_1;
            if (param0 == null) {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "null";
              stackIn_96_0 = stackOut_95_0;
              stackIn_96_1 = stackOut_95_1;
              stackIn_96_2 = stackOut_95_2;
              break L35;
            } else {
              stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
              stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
              stackOut_94_2 = "{...}";
              stackIn_96_0 = stackOut_94_0;
              stackIn_96_1 = stackOut_94_1;
              stackIn_96_2 = stackOut_94_2;
              break L35;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_96_0, stackIn_96_2 + 44 + -114 + 41);
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 >= param1) {
                break L1;
              } else {
                if (param1 < 128) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 < 160) {
                break L2;
              } else {
                if (param1 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (param1 != 0) {
                var6 = af.field_a;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var6.length <= var3) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if (param1 == var4) {
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0 != 0;
                    } else {
                      var3++;
                      continue L4;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            stackOut_20_0 = 0;
            stackIn_21_0 = stackOut_20_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2_ref, "el.A(" + -9904 + 44 + param1 + 41);
        }
        return stackIn_21_0 != 0;
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = Transmogrify.field_A ? 1 : 0;
        try {
            th.field_c.a(0);
            for (var1_int = 0; var1_int < 32; var1_int++) {
                kd.field_b[var1_int] = 0L;
            }
            if (param0 != -6491) {
                boolean discarded$0 = el.a(5);
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                ik.field_ib[var1_int] = 0L;
            }
            ca.field_b = 0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "el.E(" + param0 + 41);
        }
    }

    final static void a(int param0, byte param1, String param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              rh.field_v = gd.field_l;
              if (param0 != 255) {
                L2: {
                  if (param0 < 100) {
                    break L2;
                  } else {
                    if (param0 <= 105) {
                      q.field_h = ve.a(param3, (byte) -113);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                q.field_h = mk.a(242763393, param2, param0);
                break L1;
              } else {
                L3: {
                  if (ab.field_j >= 13) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L3;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L3;
                  }
                }
                int discarded$12 = -116;
                q.field_h = de.a(stackIn_5_0 != 0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("el.C(").append(param0).append(44).append(33).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final static boolean a(int param0) {
        if (param0 <= 116) {
            return true;
        }
        return c.field_d;
    }

    public static void a() {
        field_a = null;
        field_m = null;
        field_n = null;
    }

    el(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            int discarded$0 = 40;
            ((el) this).field_r = v.a(param0, param0.length);
            if (((el) this).field_r != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((el) this).field_e = n.a(param0, param0.length, -5705, 0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != ((el) this).field_e[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            int discarded$1 = -114;
            this.a(param0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "el.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[8192];
        field_a = "Go Back";
        field_n = new ce();
        field_d = -1;
    }
}
