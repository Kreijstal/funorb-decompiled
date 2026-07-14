/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends gm {
    private int field_g;
    static ij field_k;
    private long field_h;
    private long field_j;
    static ci field_l;
    static String field_p;
    private int field_n;
    static String field_m;
    private long field_i;
    private long[] field_q;
    static boolean field_o;

    final int a(long param0, int param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = 108 % ((param1 - 64) / 54);
                        if ((((kh) this).field_j ^ -1L) < (((kh) this).field_i ^ -1L)) {
                            statePc = 13;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var5 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5++;
                        ((kh) this).field_j = ((kh) this).field_j + param0;
                        stackOut_3_0 = var5 ^ -1;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 <= -11) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((kh) this).field_i ^ -1L) < (((kh) this).field_j ^ -1L)) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = (((kh) this).field_j < ((kh) this).field_i ? -1 : (((kh) this).field_j == ((kh) this).field_i ? 0 : 1));
                        stackIn_4_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var6 != 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 >= 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((kh) this).field_j = ((kh) this).field_i;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = var5;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    try {
                        ((kh) this).field_h = ((kh) this).field_h + (-((kh) this).field_i + ((kh) this).field_j);
                        ((kh) this).field_i = ((kh) this).field_i + (-((kh) this).field_i + ((kh) this).field_j);
                        ((kh) this).field_j = ((kh) this).field_j + param0;
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 15: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw fk.a((Throwable) (Object) var4, "kh.D(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static byte[] a(int param0, int param1, byte param2, byte[] param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        df var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        byte[] stackOut_10_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0 >= param0) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4 = new byte[param1];
                        var5_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var5_int >= param1) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4[var5_int] = param3[param0 + var5_int];
                        var5_int++;
                        if (var8 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var8 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var8 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = param3;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = -88 / ((param2 - 55) / 51);
                        var5 = new df();
                        var5.a(94);
                        var5.a((byte) -122, var4, (long)(8 * param1));
                        var7 = new byte[64];
                        var5.a(-115, 0, var7);
                        stackOut_10_0 = (byte[]) var7;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return (byte[]) (Object) stackIn_11_0;
                }
                case 12: {
                    var4_ref = (RuntimeException) (Object) caughtException;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) var4_ref;
                        stackOut_13_1 = new StringBuilder().append("kh.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (param3 == null) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                        stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                        stackOut_14_2 = "{...}";
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_17_2 = stackOut_14_2;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 16: {
                    stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                    stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                    stackOut_16_2 = "null";
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw fk.a((Throwable) (Object) stackIn_17_0, (String) (Object) (stackIn_17_2 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void c(int param0) {
        nk var1 = null;
        int var2 = 0;
        r var3_ref_r = null;
        int var3 = 0;
        long var3_long = 0L;
        ln var3_ref_ln = null;
        ln var4 = null;
        int var4_int = 0;
        ln var4_ref = null;
        int var5 = 0;
        String var5_ref = null;
        ln var5_ref_ln = null;
        r var6 = null;
        String var7 = null;
        r var8_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_16_0 = 0;
        r stackIn_23_0 = null;
        r stackIn_24_0 = null;
        r stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        String stackIn_121_0 = null;
        String stackIn_122_0 = null;
        String stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        boolean stackIn_169_0 = false;
        boolean stackIn_170_0 = false;
        int stackIn_180_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        r stackOut_22_0 = null;
        r stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        r stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        String stackOut_120_0 = null;
        String stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        String stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        boolean stackOut_168_0 = false;
        boolean stackOut_169_0 = false;
        int stackOut_179_0 = 0;
        L0: {
          var11 = Chess.field_G;
          var1 = tk.field_h;
          if (param0 == 17) {
            break L0;
          } else {
            kh.c(1);
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = ((p) (Object) var1).i(param0 ^ -100);
            if (-1 == (var2 ^ -1)) {
              break L2;
            } else {
              if (1 == var2) {
                break L2;
              } else {
                if ((var2 ^ -1) == -3) {
                  break L2;
                } else {
                  if (var2 == 3) {
                    break L2;
                  } else {
                    if ((var2 ^ -1) == -5) {
                      break L2;
                    } else {
                      L3: {
                        if (5 != var2) {
                          break L3;
                        } else {
                          L4: {
                            var3_long = ((p) (Object) var1).d((byte) -124);
                            var5_ref = ((p) (Object) var1).d(0);
                            var6 = (r) (Object) ((p) (Object) var1).d(0);
                            var7 = ((p) (Object) var1).d(0);
                            var8_ref = ug.a((byte) -104, var3_long);
                            if (((String) (Object) var6).equals((Object) (Object) "")) {
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
                            L6: {
                              var9 = stackIn_16_0;
                              if (null == var8_ref) {
                                break L6;
                              } else {
                                if (var9 == 0) {
                                  break L5;
                                } else {
                                  var8_ref.a(1, var7, var5_ref);
                                  if (var11 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var8_ref = new r(var5_ref, var7, var3_long);
                            d.field_Mb.a(true, (l) (Object) var8_ref, var3_long);
                            break L5;
                          }
                          L7: {
                            var8_ref.field_Nb = ud.a(2) + -(long)((p) (Object) var1).e((byte) -112);
                            var8_ref.field_Pb = ((p) (Object) var1).f(674914976);
                            var10 = ((p) (Object) var1).c((byte) 112);
                            stackOut_22_0 = (r) var8_ref;
                            stackIn_24_0 = stackOut_22_0;
                            stackIn_23_0 = stackOut_22_0;
                            if (-1 == (var10 & 1 ^ -1)) {
                              stackOut_24_0 = (r) (Object) stackIn_24_0;
                              stackOut_24_1 = 0;
                              stackIn_25_0 = stackOut_24_0;
                              stackIn_25_1 = stackOut_24_1;
                              break L7;
                            } else {
                              stackOut_23_0 = (r) (Object) stackIn_23_0;
                              stackOut_23_1 = 1;
                              stackIn_25_0 = stackOut_23_0;
                              stackIn_25_1 = stackOut_23_1;
                              break L7;
                            }
                          }
                          ((r) (Object) stackIn_25_0).field_Hb = stackIn_25_1 != 0;
                          var8_ref.field_Jb = var10 >> 1028370977;
                          var8_ref.field_Vb = ((p) (Object) var1).i(-99);
                          var8_ref.field_Wb = ((p) (Object) var1).i(param0 + -112);
                          ta.a(var8_ref, param0 ^ -66);
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L8: {
                        if ((var2 ^ -1) == -7) {
                          break L8;
                        } else {
                          L9: {
                            if ((var2 ^ -1) != -8) {
                              break L9;
                            } else {
                              var3_ref_r = (r) (Object) bb.field_d.g(-18110);
                              L10: while (true) {
                                L11: {
                                  L12: {
                                    if (null == var3_ref_r) {
                                      break L12;
                                    } else {
                                      var3_ref_r.c(-2193);
                                      var3_ref_r.d(-1);
                                      var3_ref_r = (r) (Object) bb.field_d.a((byte) -122);
                                      if (var11 != 0) {
                                        break L11;
                                      } else {
                                        if (var11 == 0) {
                                          continue L10;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                  cb.field_f = 0;
                                  break L11;
                                }
                                if (var11 == 0) {
                                  break L1;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          L13: {
                            if (var2 != 8) {
                              break L13;
                            } else {
                              L14: {
                                var3 = ((p) (Object) var1).f(674914976);
                                var4 = (ln) (Object) ae.field_f.a((long)var3, param0 + 2983);
                                if (var4 == null) {
                                  var4_ref = new ln(qa.field_e);
                                  ae.field_f.a(true, (l) (Object) var4_ref, (long)var3);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              vl.a((p) (Object) var1, var4_ref, true, param0 ^ 101);
                              fh.a((byte) -119, var4_ref);
                              if (var11 == 0) {
                                break L1;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L15: {
                            if (var2 != 9) {
                              break L15;
                            } else {
                              L16: {
                                var3 = ((p) (Object) var1).f(param0 + 674914959);
                                var4_int = ((p) (Object) var1).i(-96);
                                var5_ref_ln = (ln) (Object) ae.field_f.a((long)var3, 3000);
                                if (null != var5_ref_ln) {
                                  L17: {
                                    L18: {
                                      if (0 == var4_int) {
                                        break L18;
                                      } else {
                                        var5_ref_ln.field_Hb = ig.field_g;
                                        var5_ref_ln.field_jc = var4_int;
                                        if (var11 == 0) {
                                          break L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    var5_ref_ln.c(param0 ^ -2178);
                                    break L17;
                                  }
                                  var5_ref_ln.d(-1);
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              if (var11 == 0) {
                                break L1;
                              } else {
                                break L15;
                              }
                            }
                          }
                          L19: {
                            if ((var2 ^ -1) != -11) {
                              break L19;
                            } else {
                              var3_ref_ln = (ln) (Object) nk.field_t.g(param0 ^ -18093);
                              L20: while (true) {
                                L21: {
                                  if (var3_ref_ln == null) {
                                    break L21;
                                  } else {
                                    var3_ref_ln.c(-2193);
                                    var3_ref_ln.d(-1);
                                    var3_ref_ln = (ln) (Object) nk.field_t.a((byte) -115);
                                    if (var11 != 0) {
                                      break L1;
                                    } else {
                                      if (var11 == 0) {
                                        continue L20;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                }
                                if (var11 == 0) {
                                  break L1;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                          L22: {
                            if ((var2 ^ -1) == -12) {
                              break L22;
                            } else {
                              if (-13 == (var2 ^ -1)) {
                                break L22;
                              } else {
                                L23: {
                                  if (var2 == 13) {
                                    break L23;
                                  } else {
                                    L24: {
                                      L25: {
                                        if (var2 == 14) {
                                          break L25;
                                        } else {
                                          if (-17 != (var2 ^ -1)) {
                                            break L24;
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                      L26: {
                                        var3_long = ((p) (Object) var1).d((byte) -74);
                                        var5_ref = (String) (Object) ug.a((byte) -107, var3_long);
                                        if (var5_ref == null) {
                                          break L26;
                                        } else {
                                          L27: {
                                            L28: {
                                              if (var2 != 14) {
                                                break L28;
                                              } else {
                                                ((r) (Object) var5_ref).field_ac = true;
                                                if (var11 == 0) {
                                                  break L27;
                                                } else {
                                                  break L28;
                                                }
                                              }
                                            }
                                            if (((r) (Object) var5_ref).field_Qb) {
                                              break L27;
                                            } else {
                                              ((r) (Object) var5_ref).field_Qb = true;
                                              cb.field_f = cb.field_f + 1;
                                              break L27;
                                            }
                                          }
                                          ta.a((r) (Object) var5_ref, param0 ^ -116);
                                          break L26;
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L1;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    L29: {
                                      if (15 == var2) {
                                        break L29;
                                      } else {
                                        if (var2 == 17) {
                                          break L29;
                                        } else {
                                          L30: {
                                            if ((var2 ^ -1) == -19) {
                                              break L30;
                                            } else {
                                              L31: {
                                                if (var2 == 19) {
                                                  break L31;
                                                } else {
                                                  L32: {
                                                    if (var2 != 20) {
                                                      break L32;
                                                    } else {
                                                      vl.a((p) (Object) var1, pd.field_Rb, false, param0 ^ 127);
                                                      if (var11 == 0) {
                                                        break L1;
                                                      } else {
                                                        break L32;
                                                      }
                                                    }
                                                  }
                                                  L33: {
                                                    if (-22 != (var2 ^ -1)) {
                                                      break L33;
                                                    } else {
                                                      L34: {
                                                        L35: {
                                                          var3 = ((p) (Object) var1).f(param0 ^ 674914993);
                                                          if ((var3 ^ -1) == -1) {
                                                            break L35;
                                                          } else {
                                                            eg.field_e = (long)var3 + ud.a(2);
                                                            if (var11 == 0) {
                                                              break L34;
                                                            } else {
                                                              break L35;
                                                            }
                                                          }
                                                        }
                                                        eg.field_e = 0L;
                                                        break L34;
                                                      }
                                                      if (var11 == 0) {
                                                        break L1;
                                                      } else {
                                                        break L33;
                                                      }
                                                    }
                                                  }
                                                  L36: {
                                                    if ((var2 ^ -1) != -23) {
                                                      break L36;
                                                    } else {
                                                      fm.field_W = ((p) (Object) var1).f(674914976);
                                                      jf.field_b = ((p) (Object) var1).c((byte) 75);
                                                      if (var11 == 0) {
                                                        break L1;
                                                      } else {
                                                        break L36;
                                                      }
                                                    }
                                                  }
                                                  L37: {
                                                    if ((var2 ^ -1) != -24) {
                                                      break L37;
                                                    } else {
                                                      gb.field_t = ((p) (Object) var1).d((byte) 116);
                                                      if (var11 == 0) {
                                                        break L1;
                                                      } else {
                                                        break L37;
                                                      }
                                                    }
                                                  }
                                                  fg.a((Throwable) null, (byte) -77, "L1: " + tm.b((byte) -123));
                                                  si.d(param0 ^ 65297);
                                                  if (var11 == 0) {
                                                    break L1;
                                                  } else {
                                                    break L31;
                                                  }
                                                }
                                              }
                                              L38: {
                                                var3_long = ((p) (Object) var1).d((byte) -60);
                                                var5 = ((p) (Object) var1).i(param0 + -144);
                                                var6 = mi.a(134217727, var3_long);
                                                if (null != var6) {
                                                  L39: {
                                                    L40: {
                                                      if ((var5 ^ -1) != -1) {
                                                        break L40;
                                                      } else {
                                                        var6.c(param0 ^ -2178);
                                                        if (var11 == 0) {
                                                          break L39;
                                                        } else {
                                                          break L40;
                                                        }
                                                      }
                                                    }
                                                    var6.field_Mb = var5;
                                                    var6.field_Sb = ig.field_g;
                                                    break L39;
                                                  }
                                                  var6.d(-1);
                                                  pd.field_Rb.field_Xb = pd.field_Rb.field_Xb - 1;
                                                  break L38;
                                                } else {
                                                  break L38;
                                                }
                                              }
                                              if (var11 == 0) {
                                                break L1;
                                              } else {
                                                break L30;
                                              }
                                            }
                                          }
                                          L41: {
                                            var3_long = ((p) (Object) var1).d((byte) 116);
                                            var5_ref = ((p) (Object) var1).d(0);
                                            var6 = (r) (Object) ((p) (Object) var1).d(0);
                                            var7 = (String) (Object) mi.a(param0 ^ 134217710, var3_long);
                                            if (var7 != null) {
                                              break L41;
                                            } else {
                                              var7 = (String) (Object) new r(var5_ref, (String) (Object) var6, var3_long);
                                              cm.field_v.a(true, (l) (Object) var7, var3_long);
                                              pd.field_Rb.field_Xb = pd.field_Rb.field_Xb + 1;
                                              break L41;
                                            }
                                          }
                                          L42: {
                                            ((r) (Object) var7).field_Pb = ((p) (Object) var1).f(param0 ^ 674914993);
                                            var8 = ((p) (Object) var1).c((byte) -59);
                                            ((r) (Object) var7).field_Jb = var8 >> 1772151457;
                                            stackOut_120_0 = (String) var7;
                                            stackIn_122_0 = stackOut_120_0;
                                            stackIn_121_0 = stackOut_120_0;
                                            if (0 == (1 & var8)) {
                                              stackOut_122_0 = (String) (Object) stackIn_122_0;
                                              stackOut_122_1 = 0;
                                              stackIn_123_0 = stackOut_122_0;
                                              stackIn_123_1 = stackOut_122_1;
                                              break L42;
                                            } else {
                                              stackOut_121_0 = (String) (Object) stackIn_121_0;
                                              stackOut_121_1 = 1;
                                              stackIn_123_0 = stackOut_121_0;
                                              stackIn_123_1 = stackOut_121_1;
                                              break L42;
                                            }
                                          }
                                          ((r) (Object) stackIn_123_0).field_Hb = stackIn_123_1 != 0;
                                          ((r) (Object) var7).field_Vb = ((p) (Object) var1).i(param0 + -142);
                                          ((r) (Object) var7).field_Wb = ((p) (Object) var1).i(-106);
                                          pd.field_Sb.a((o) (Object) var7, (byte) 109);
                                          if (var11 == 0) {
                                            break L1;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                    }
                                    L43: {
                                      var3_long = ((p) (Object) var1).d((byte) -84);
                                      var5 = ((p) (Object) var1).i(-125);
                                      var6 = ug.a((byte) -87, var3_long);
                                      if (null != var6) {
                                        L44: {
                                          L45: {
                                            if (15 == var2) {
                                              break L45;
                                            } else {
                                              if (var6.field_Qb) {
                                                cb.field_f = cb.field_f - 1;
                                                var6.field_Qb = false;
                                                if (var11 == 0) {
                                                  break L44;
                                                } else {
                                                  break L45;
                                                }
                                              } else {
                                                break L44;
                                              }
                                            }
                                          }
                                          var6.field_ac = false;
                                          break L44;
                                        }
                                        L46: {
                                          if (var5 == 0) {
                                            break L46;
                                          } else {
                                            var6.field_Mb = var5;
                                            var6.field_Sb = ig.field_g;
                                            break L46;
                                          }
                                        }
                                        ta.a(var6, -122);
                                        break L43;
                                      } else {
                                        break L43;
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L1;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                L47: {
                                  var3 = ((p) (Object) var1).f(674914976);
                                  var4_int = ((p) (Object) var1).i(-97);
                                  var5_ref_ln = (ln) (Object) ae.field_f.a((long)var3, 3000);
                                  if (var5_ref_ln != null) {
                                    L48: {
                                      var6 = (r) (Object) var5_ref_ln;
                                      var5_ref_ln.field_Tb = false;
                                      ((ln) (Object) var6).field_dc = false;
                                      if (var4_int != 0) {
                                        var5_ref_ln.field_jc = var4_int;
                                        var5_ref_ln.field_Hb = ig.field_g;
                                        break L48;
                                      } else {
                                        break L48;
                                      }
                                    }
                                    fh.a((byte) -127, var5_ref_ln);
                                    break L47;
                                  } else {
                                    break L47;
                                  }
                                }
                                if (var11 == 0) {
                                  break L1;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                          L49: {
                            var3 = ((p) (Object) var1).f(674914976);
                            var4 = (ln) (Object) ae.field_f.a((long)var3, 3000);
                            if (null == var4) {
                              break L49;
                            } else {
                              L50: {
                                L51: {
                                  if (11 != var2) {
                                    break L51;
                                  } else {
                                    var4.field_dc = true;
                                    if (var11 == 0) {
                                      break L50;
                                    } else {
                                      break L51;
                                    }
                                  }
                                }
                                var4.field_Tb = true;
                                break L50;
                              }
                              fh.a((byte) -124, var4);
                              break L49;
                            }
                          }
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L52: {
                        var3_long = ((p) (Object) var1).d((byte) -127);
                        var5 = ((p) (Object) var1).i(-77);
                        var6 = ug.a((byte) -92, var3_long);
                        if (null == var6) {
                          break L52;
                        } else {
                          L53: {
                            if (!var6.field_Qb) {
                              break L53;
                            } else {
                              cb.field_f = cb.field_f - 1;
                              var6.field_Qb = false;
                              break L53;
                            }
                          }
                          L54: {
                            L55: {
                              if (0 == var5) {
                                break L55;
                              } else {
                                var6.field_Mb = var5;
                                var6.field_Sb = ig.field_g;
                                if (var11 == 0) {
                                  break L54;
                                } else {
                                  break L55;
                                }
                              }
                            }
                            var6.c(-2193);
                            break L54;
                          }
                          var6.d(-1);
                          break L52;
                        }
                      }
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
            }
          }
          var3_ref_r = (r) (Object) pd.field_Sb.g(-18110);
          L56: while (true) {
            L57: {
              L58: {
                if (var3_ref_r == null) {
                  break L58;
                } else {
                  var3_ref_r.c(-2193);
                  var3_ref_r.d(param0 ^ -18);
                  var3_ref_r = (r) (Object) pd.field_Sb.a((byte) -107);
                  if (var11 != 0) {
                    break L57;
                  } else {
                    if (var11 == 0) {
                      continue L56;
                    } else {
                      break L58;
                    }
                  }
                }
              }
              var3_ref_r = (r) (Object) d.field_Mb.a(false);
              break L57;
            }
            L59: while (true) {
              L60: {
                L61: {
                  if (null == var3_ref_r) {
                    break L61;
                  } else {
                    stackOut_168_0 = var3_ref_r.field_ac;
                    stackIn_180_0 = stackOut_168_0 ? 1 : 0;
                    stackIn_169_0 = stackOut_168_0;
                    if (var11 != 0) {
                      break L60;
                    } else {
                      stackOut_169_0 = stackIn_169_0;
                      stackIn_170_0 = stackOut_169_0;
                      L62: {
                        L63: {
                          if (stackIn_170_0) {
                            break L63;
                          } else {
                            if (var3_ref_r.field_Qb) {
                              break L63;
                            } else {
                              break L62;
                            }
                          }
                        }
                        L64: {
                          var3_ref_r.field_ac = false;
                          if (!var3_ref_r.field_Qb) {
                            break L64;
                          } else {
                            var3_ref_r.field_Qb = false;
                            cb.field_f = cb.field_f - 1;
                            break L64;
                          }
                        }
                        ta.a(var3_ref_r, -98);
                        break L62;
                      }
                      var3_ref_r = (r) (Object) d.field_Mb.a(0);
                      if (var11 == 0) {
                        continue L59;
                      } else {
                        break L61;
                      }
                    }
                  }
                }
                stackOut_179_0 = var2 ^ -1;
                stackIn_180_0 = stackOut_179_0;
                break L60;
              }
              L65: {
                if (stackIn_180_0 != -2) {
                  break L65;
                } else {
                  if (pd.field_Rb == null) {
                    break L65;
                  } else {
                    i.field_c = pd.field_Rb.field_Gb;
                    break L65;
                  }
                }
              }
              L66: {
                if (4 != var2) {
                  pd.field_Rb = null;
                  break L66;
                } else {
                  var3 = ((p) (Object) var1).f(674914976);
                  pd.field_Rb = new ln(qa.field_e);
                  pd.field_Rb.a((long)var3, (byte) 71);
                  vl.a((p) (Object) var1, pd.field_Rb, false, 120);
                  eg.field_e = 0L;
                  break L66;
                }
              }
              L67: {
                L68: {
                  L69: {
                    if (-3 == (var2 ^ -1)) {
                      break L69;
                    } else {
                      if (3 != var2) {
                        break L68;
                      } else {
                        break L69;
                      }
                    }
                  }
                  if (null != ib.field_d) {
                    break L67;
                  } else {
                    ib.field_d = new ln(qa.field_e);
                    if (var11 == 0) {
                      break L67;
                    } else {
                      break L68;
                    }
                  }
                }
                ib.field_d = null;
                break L67;
              }
              L70: {
                if (-4 != (var2 ^ -1)) {
                  break L70;
                } else {
                  ud.field_b = true;
                  var3 = 0;
                  L71: while (true) {
                    L72: {
                      L73: {
                        if ((g.field_f.length ^ -1) >= (var3 ^ -1)) {
                          break L73;
                        } else {
                          g.field_f[var3] = ((p) (Object) var1).g(0);
                          var3++;
                          if (var11 != 0) {
                            break L72;
                          } else {
                            if (var11 == 0) {
                              continue L71;
                            } else {
                              break L73;
                            }
                          }
                        }
                      }
                      qd.field_u = ((p) (Object) var1).i(param0 ^ -105);
                      p.field_n = ((p) (Object) var1).i(-107);
                      break L72;
                    }
                    var3 = 0;
                    L74: while (true) {
                      L75: {
                        if (var3 >= fe.field_d.length) {
                          break L75;
                        } else {
                          fe.field_d[var3] = ((p) (Object) var1).g(0);
                          var3++;
                          if (var11 != 0) {
                            break L1;
                          } else {
                            if (var11 == 0) {
                              continue L74;
                            } else {
                              break L75;
                            }
                          }
                        }
                      }
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L70;
                      }
                    }
                  }
                }
              }
              ud.field_b = false;
              break L1;
            }
          }
        }
    }

    private final long c(byte param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        long stackIn_4_0 = 0L;
        long stackIn_16_0 = 0L;
        long stackIn_18_0 = 0L;
        long stackOut_3_0 = 0L;
        long stackOut_15_0 = 0L;
        long stackOut_17_0 = 0L;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = -119 / ((21 - param0) / 41);
                        var2_long = System.nanoTime();
                        var4 = -((kh) this).field_h + var2_long;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((kh) this).field_h = var2_long;
                        if ((var4 ^ -1L) >= 4999999999L) {
                            statePc = 13;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = -5000000001L;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 >= (var4 ^ -1L)) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((kh) this).field_q[((kh) this).field_n] = var4;
                        ((kh) this).field_n = (((kh) this).field_n - -1) % 10;
                        if (1 <= ((kh) this).field_g) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((kh) this).field_g = ((kh) this).field_g + 1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7 = 0L;
                        var9 = 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((((kh) this).field_g ^ -1) > (var9 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = var7 + ((kh) this).field_q[(10 + (((kh) this).field_n - var9)) % 10];
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if (var10 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var7 = stackIn_16_0;
                        var9++;
                        if (var10 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = var7 / (long)((kh) this).field_g;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0;
                }
                case 19: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw fk.a((Throwable) (Object) var2, "kh.F(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 40) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        ((kh) this).field_h = 0L;
                        if ((((kh) this).field_j ^ -1L) < (((kh) this).field_i ^ -1L)) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((kh) this).field_i = ((kh) this).field_i + (-((kh) this).field_i + ((kh) this).field_j);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw fk.a((Throwable) (Object) var2, "kh.C(" + param0 + 41);
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final long a(byte param0) {
        RuntimeException var2 = null;
        long stackIn_8_0 = 0L;
        long stackIn_10_0 = 0L;
        long stackOut_7_0 = 0L;
        long stackOut_9_0 = 0L;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((kh) this).field_i = ((kh) this).field_i + this.c((byte) 126);
                        if (param0 == -84) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_p = null;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((kh) this).field_i ^ -1L) > (((kh) this).field_j ^ -1L)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (-((kh) this).field_i + ((kh) this).field_j) / 1000000L;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        stackOut_9_0 = 0L;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw fk.a((Throwable) (Object) var2, "kh.G(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, lb param1, int param2, um param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        eg.field_i = param2 * qd.d(-31137) / 1000;
                        fd.a((byte) -103, param3);
                        aa.a(-8428, param3);
                        cd.a((byte) 127, param3);
                        tl.a(false);
                        ie.b(540);
                        if (param0 <= -121) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        kh.b(115);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        sl.field_a = 0 - eg.field_i;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var4;
                        stackOut_7_1 = new StringBuilder().append("kh.E(").append(param0).append(44);
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param1 == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "{...}";
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                    stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                    stackOut_10_2 = "null";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                        stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param2).append(44);
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (param3 == null) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                        stackOut_12_2 = "{...}";
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_15_2 = stackOut_12_2;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 14: {
                    stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                    stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                    stackOut_14_2 = "null";
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw fk.a((Throwable) (Object) stackIn_15_0, (String) (Object) (stackIn_15_2 + 41));
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != 64) {
            return;
        }
        try {
            field_l = null;
            field_m = null;
            field_p = null;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "kh.A(" + param0 + 41);
        }
    }

    kh() {
        ((kh) this).field_j = 0L;
        ((kh) this).field_h = 0L;
        ((kh) this).field_g = 1;
        ((kh) this).field_i = 0L;
        ((kh) this).field_n = 0;
        ((kh) this).field_q = new long[10];
        try {
            ((kh) this).field_i = System.nanoTime();
            ((kh) this).field_j = System.nanoTime();
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "kh.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Decline invitation to <%0>'s game";
        field_m = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_k = new ij();
    }
}
