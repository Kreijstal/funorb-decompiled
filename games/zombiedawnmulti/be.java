/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    qq field_d;
    static String field_m;
    static String field_k;
    static String field_f;
    int[][] field_i;
    int[] field_l;
    private byte[] field_g;
    int field_h;
    int[] field_s;
    int field_o;
    private int[][] field_c;
    byte[][] field_a;
    int[] field_p;
    int field_e;
    qq[] field_n;
    private int field_q;
    int[] field_b;
    private int[] field_j;
    int[] field_r;

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
        k var17 = null;
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
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              int discarded$5 = 0;
              var17 = new k(hb.a(param1));
              var4 = var17.g(31365);
              if (5 > var4) {
                break L1;
              } else {
                if (7 >= var4) {
                  L2: {
                    if (var4 >= 6) {
                      ((be) this).field_h = var17.i(-1478490344);
                      break L2;
                    } else {
                      ((be) this).field_h = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.g(31365);
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
                    if (-1 == (var5 & 2)) {
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
                    if (-8 > var4) {
                      ((be) this).field_q = var17.d((byte) 69);
                      break L5;
                    } else {
                      ((be) this).field_q = var17.e((byte) -49);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    ((be) this).field_l = new int[((be) this).field_q];
                    var9 = -1;
                    if (var4 >= 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= ((be) this).field_q) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$6 = var8 + var17.e((byte) -49);
                            var8 = dupTemp$6;
                            ((be) this).field_l[var10] = dupTemp$6;
                            if (((be) this).field_l[var10] <= var9) {
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
                        if (((be) this).field_q <= var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$7 = var8 + var17.d((byte) 69);
                            var8 = dupTemp$7;
                            ((be) this).field_l[var10] = dupTemp$7;
                            if (((be) this).field_l[var10] <= var9) {
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
                    ((be) this).field_e = var9 - -1;
                    ((be) this).field_r = new int[((be) this).field_e];
                    ((be) this).field_p = new int[((be) this).field_e];
                    ((be) this).field_s = new int[((be) this).field_e];
                    ((be) this).field_b = new int[((be) this).field_e];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      ((be) this).field_a = new byte[((be) this).field_e][];
                      break L11;
                    }
                  }
                  L12: {
                    ((be) this).field_i = new int[((be) this).field_e][];
                    if (var6 != 0) {
                      ((be) this).field_j = new int[((be) this).field_e];
                      var10 = 0;
                      L13: while (true) {
                        if (var10 >= ((be) this).field_e) {
                          var10 = 0;
                          L14: while (true) {
                            if (((be) this).field_q <= var10) {
                              ((be) this).field_d = new qq(((be) this).field_j);
                              break L12;
                            } else {
                              ((be) this).field_j[((be) this).field_l[var10]] = var17.i(-1478490344);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((be) this).field_j[var10] = -1;
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
                    if (((be) this).field_q <= var10) {
                      L16: {
                        if (var7 != 0) {
                          var10 = 0;
                          L17: while (true) {
                            if (((be) this).field_q <= var10) {
                              var10 = 0;
                              L18: while (true) {
                                if (((be) this).field_q <= var10) {
                                  break L16;
                                } else {
                                  ((be) this).field_p[((be) this).field_l[var10]] = var17.i(vg.a(0, -1478490344));
                                  var10++;
                                  continue L18;
                                }
                              }
                            } else {
                              var21 = new byte[64];
                              var17.a(0, -6351, 64, var21);
                              ((be) this).field_a[((be) this).field_l[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L19: while (true) {
                            if (((be) this).field_q <= var10) {
                              break L16;
                            } else {
                              ((be) this).field_p[((be) this).field_l[var10]] = var17.i(vg.a(0, -1478490344));
                              var10++;
                              continue L19;
                            }
                          }
                        }
                      }
                      L20: {
                        if (var4 >= 7) {
                          var10 = 0;
                          L21: while (true) {
                            if (var10 >= ((be) this).field_q) {
                              var10 = 0;
                              L22: while (true) {
                                if (((be) this).field_q <= var10) {
                                  break L20;
                                } else {
                                  var11 = ((be) this).field_l[var10];
                                  var12 = ((be) this).field_s[var11];
                                  var8 = 0;
                                  ((be) this).field_i[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var12 <= var14) {
                                      L24: {
                                        ((be) this).field_b[var11] = 1 + var13;
                                        if (var13 - -1 != var12) {
                                          break L24;
                                        } else {
                                          ((be) this).field_i[var11] = null;
                                          break L24;
                                        }
                                      }
                                      var10++;
                                      continue L22;
                                    } else {
                                      L25: {
                                        int dupTemp$8 = var8 + var17.e((byte) -49);
                                        var8 = dupTemp$8;
                                        ((be) this).field_i[var11][var14] = dupTemp$8;
                                        var15 = dupTemp$8;
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
                              ((be) this).field_s[((be) this).field_l[var10]] = var17.e((byte) -49);
                              var10++;
                              continue L21;
                            }
                          }
                        } else {
                          var10 = 0;
                          L26: while (true) {
                            if (((be) this).field_q <= var10) {
                              var10 = 0;
                              L27: while (true) {
                                if (((be) this).field_q <= var10) {
                                  break L20;
                                } else {
                                  var11 = ((be) this).field_l[var10];
                                  var12 = ((be) this).field_s[var11];
                                  var8 = 0;
                                  ((be) this).field_i[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L28: while (true) {
                                    if (var12 <= var14) {
                                      L29: {
                                        ((be) this).field_b[var11] = 1 + var13;
                                        if (var13 - -1 != var12) {
                                          break L29;
                                        } else {
                                          ((be) this).field_i[var11] = null;
                                          break L29;
                                        }
                                      }
                                      var10++;
                                      continue L27;
                                    } else {
                                      L30: {
                                        int dupTemp$9 = var8 + var17.d((byte) 69);
                                        var8 = dupTemp$9;
                                        ((be) this).field_i[var11][var14] = dupTemp$9;
                                        var15 = dupTemp$9;
                                        if (var15 > var13) {
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
                              ((be) this).field_s[((be) this).field_l[var10]] = var17.d((byte) 69);
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
                          ((be) this).field_n = new qq[1 + var9];
                          ((be) this).field_c = new int[1 + var9][];
                          var10 = 0;
                          L32: while (true) {
                            if (var10 >= ((be) this).field_q) {
                              break L31;
                            } else {
                              var11 = ((be) this).field_l[var10];
                              var12 = ((be) this).field_s[var11];
                              ((be) this).field_c[var11] = new int[((be) this).field_b[var11]];
                              var13 = 0;
                              L33: while (true) {
                                if (var13 >= ((be) this).field_b[var11]) {
                                  var13 = 0;
                                  L34: while (true) {
                                    if (var13 >= var12) {
                                      ((be) this).field_n[var11] = new qq(((be) this).field_c[var11]);
                                      var10++;
                                      continue L32;
                                    } else {
                                      L35: {
                                        if (((be) this).field_i[var11] == null) {
                                          var14 = var13;
                                          break L35;
                                        } else {
                                          var14 = ((be) this).field_i[var11][var13];
                                          break L35;
                                        }
                                      }
                                      ((be) this).field_c[var11][var14] = var17.i(-1478490344);
                                      var13++;
                                      continue L34;
                                    }
                                  }
                                } else {
                                  ((be) this).field_c[var11][var13] = -1;
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
                      ((be) this).field_r[((be) this).field_l[var10]] = var17.i(-1478490344);
                      var10++;
                      continue L15;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var3 = decompiledCaughtException;
            stackOut_94_0 = (RuntimeException) var3;
            stackOut_94_1 = new StringBuilder().append("be.B(").append(0).append(44);
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
              break L36;
            } else {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L36;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_97_0, stackIn_97_2 + 41);
        }
    }

    final static void a(long param0) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            {
              L0: {
                Thread.sleep(param0);
                break L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_f = null;
        field_m = null;
        field_k = null;
    }

    be(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((be) this).field_o = pb.a(param0, param0.length, (byte) -120);
            if (((be) this).field_o != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                ((be) this).field_g = ho.a(4246, 0, param0, param0.length);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((be) this).field_g[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(0, param0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "be.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Hide chat to continue";
        field_k = "Asking to join <%0>'s game...";
        field_f = "No";
    }
}
