/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;

final class nj {
    private long[] field_n;
    private int field_b;
    static int field_j;
    private long[] field_i;
    static nh field_f;
    private int field_g;
    static String field_e;
    static lh field_p;
    static he[] field_d;
    private long[] field_h;
    private byte[] field_k;
    private long[] field_l;
    private long[] field_q;
    static int field_a;
    static String field_c;
    static he field_o;
    private byte[] field_m;

    final void a(byte param0, byte[] param1, long param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        byte stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = -((int)param2 & 7) + 8 & 7;
            var7 = 7 & ((nj) this).field_b;
            var9 = param2;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var11 < 0) {
                      break L4;
                    } else {
                      var12 = var12 + ((255 & (int)var9) + (((nj) this).field_m[var11] & 255));
                      ((nj) this).field_m[var11] = (byte)var12;
                      var9 = var9 >>> 8;
                      var12 = var12 >>> 8;
                      var11--;
                      if (var13 != 0) {
                        break L3;
                      } else {
                        if (var13 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L5: while (true) {
                    if (8L >= param2) {
                      break L3;
                    } else {
                      var8 = param1[var5_int] << var6 & 255 | (param1[var5_int + 1] & 255) >>> 8 - var6;
                      stackOut_8_0 = -1;
                      stackOut_8_1 = ~var8;
                      stackIn_22_0 = stackOut_8_0;
                      stackIn_22_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var13 != 0) {
                        break L2;
                      } else {
                        L6: {
                          if (stackIn_9_0 < stackIn_9_1) {
                            break L6;
                          } else {
                            if (var8 < 256) {
                              L7: {
                                ((nj) this).field_k[((nj) this).field_g] = (byte)li.a((int) ((nj) this).field_k[((nj) this).field_g], var8 >>> var7);
                                ((nj) this).field_g = ((nj) this).field_g + 1;
                                ((nj) this).field_b = ((nj) this).field_b + (8 - var7);
                                if (512 != ((nj) this).field_b) {
                                  break L7;
                                } else {
                                  this.a(8);
                                  ((nj) this).field_g = 0;
                                  ((nj) this).field_b = 0;
                                  break L7;
                                }
                              }
                              ((nj) this).field_k[((nj) this).field_g] = (byte)rk.a(255, var8 << 8 + -var7);
                              ((nj) this).field_b = ((nj) this).field_b + var7;
                              param2 = param2 - 8L;
                              var5_int++;
                              if (var13 == 0) {
                                continue L5;
                              } else {
                                break L3;
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                        throw new RuntimeException("LOGIC ERROR");
                      }
                    }
                  }
                }
                stackOut_21_0 = param0;
                stackOut_21_1 = -72;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                break L2;
              }
              L8: {
                if (stackIn_22_0 <= stackIn_22_1) {
                  break L8;
                } else {
                  ((nj) this).field_n = null;
                  break L8;
                }
              }
              L9: {
                L10: {
                  if (param2 > 0L) {
                    break L10;
                  } else {
                    var8 = 0;
                    if (var13 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                var8 = 255 & param1[var5_int] << var6;
                ((nj) this).field_k[((nj) this).field_g] = (byte)li.a((int) ((nj) this).field_k[((nj) this).field_g], var8 >>> var7);
                break L9;
              }
              L11: {
                L12: {
                  if (param2 + (long)var7 < 8L) {
                    break L12;
                  } else {
                    L13: {
                      ((nj) this).field_g = ((nj) this).field_g + 1;
                      param2 = param2 - (long)(8 + -var7);
                      ((nj) this).field_b = ((nj) this).field_b + (-var7 + 8);
                      if (((nj) this).field_b != 512) {
                        break L13;
                      } else {
                        this.a(8);
                        ((nj) this).field_g = 0;
                        ((nj) this).field_b = 0;
                        break L13;
                      }
                    }
                    ((nj) this).field_k[((nj) this).field_g] = (byte)rk.a(var8 << 8 + -var7, 255);
                    ((nj) this).field_b = ((nj) this).field_b + (int)param2;
                    if (var13 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                ((nj) this).field_b = (int)((long)((nj) this).field_b + param2);
                break L11;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var5;
            stackOut_36_1 = new StringBuilder().append("nj.H(").append(param0).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L14;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L14;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + param2 + ')');
        }
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            Throwable var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_19_0 = 0;
            int stackIn_27_0 = 0;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_31_0 = null;
            StringBuilder stackIn_31_1 = null;
            RuntimeException stackIn_32_0 = null;
            StringBuilder stackIn_32_1 = null;
            String stackIn_32_2 = null;
            int stackOut_4_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_26_0 = 0;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            RuntimeException stackOut_29_0 = null;
            StringBuilder stackOut_29_1 = null;
            String stackOut_29_2 = null;
            RuntimeException stackOut_31_0 = null;
            StringBuilder stackOut_31_1 = null;
            String stackOut_31_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (aj.field_c) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = 1;
                            stackIn_5_0 = stackOut_4_0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0 != 0;
                    }
                    case 6: {
                        try {
                            if (param1 == 8) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = 0;
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0 != 0;
                    }
                    case 9: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) pb.a("getcookies", param0, true);
                            var4 = ki.a((byte) -95, ';', var3);
                            var5 = 0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 21;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            stackOut_11_0 = ~var6;
                            stackIn_27_0 = stackOut_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            if (var7 != 0) {
                                statePc = 27;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (stackIn_12_0 > -1) {
                                statePc = 20;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 20;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackOut_18_0 = 1;
                            stackIn_19_0 = stackOut_18_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return stackIn_19_0 != 0;
                    }
                    case 20: {
                        try {
                            var5++;
                            if (var7 == 0) {
                                statePc = 10;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var2_ref2 = caughtException;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (null == param0.getParameter("tuhstatbut")) {
                                statePc = 26;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            stackOut_24_0 = 1;
                            stackIn_27_0 = stackOut_24_0;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            stackOut_26_0 = 0;
                            stackIn_27_0 = stackOut_26_0;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        return stackIn_27_0 != 0;
                    }
                    case 28: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        stackOut_28_0 = (RuntimeException) var2_ref;
                        stackOut_28_1 = new StringBuilder().append("nj.E(");
                        stackIn_31_0 = stackOut_28_0;
                        stackIn_31_1 = stackOut_28_1;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        if (param0 == null) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                        stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                        stackOut_29_2 = "{...}";
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_32_1 = stackOut_29_1;
                        stackIn_32_2 = stackOut_29_2;
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 31: {
                        stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
                        stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
                        stackOut_31_2 = "null";
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        stackIn_32_2 = stackOut_31_2;
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        throw ie.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param1 + ')');
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, byte[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            ((nj) this).field_k[((nj) this).field_g] = (byte)li.a((int) ((nj) this).field_k[((nj) this).field_g], 128 >>> rk.a(7, ((nj) this).field_b));
            ((nj) this).field_g = ((nj) this).field_g + 1;
            if (param1 <= -94) {
              L1: {
                if (((nj) this).field_g <= 32) {
                  break L1;
                } else {
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (((nj) this).field_g >= 64) {
                          break L4;
                        } else {
                          int fieldTemp$2 = ((nj) this).field_g;
                          ((nj) this).field_g = ((nj) this).field_g + 1;
                          ((nj) this).field_k[fieldTemp$2] = (byte) 0;
                          if (var8 != 0) {
                            break L3;
                          } else {
                            if (var8 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      this.a(8);
                      break L3;
                    }
                    ((nj) this).field_g = 0;
                    break L1;
                  }
                }
              }
              L5: while (true) {
                L6: {
                  L7: {
                    if (32 <= ((nj) this).field_g) {
                      break L7;
                    } else {
                      int fieldTemp$3 = ((nj) this).field_g;
                      ((nj) this).field_g = ((nj) this).field_g + 1;
                      ((nj) this).field_k[fieldTemp$3] = (byte) 0;
                      if (var8 != 0) {
                        break L6;
                      } else {
                        if (var8 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  kg.a(((nj) this).field_m, 0, ((nj) this).field_k, 32, 32);
                  this.a(8);
                  break L6;
                }
                var4_int = 0;
                var5 = param0;
                L8: while (true) {
                  L9: {
                    L10: {
                      if (var4_int >= 8) {
                        break L10;
                      } else {
                        var6 = ((nj) this).field_n[var4_int];
                        param2[var5] = (byte)(int)(var6 >>> 1807801720);
                        param2[1 + var5] = (byte)(int)(var6 >>> 751054512);
                        param2[var5 + 2] = (byte)(int)(var6 >>> 1396502760);
                        param2[var5 - -3] = (byte)(int)(var6 >>> -412184928);
                        param2[4 + var5] = (byte)(int)(var6 >>> 884804056);
                        param2[5 + var5] = (byte)(int)(var6 >>> 1178832912);
                        param2[var5 - -6] = (byte)(int)(var6 >>> -1859592376);
                        param2[7 + var5] = (byte)(int)var6;
                        var5 += 8;
                        var4_int++;
                        if (var8 != 0) {
                          break L9;
                        } else {
                          if (var8 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    break L9;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4;
            stackOut_26_1 = new StringBuilder().append("nj.A(").append(param0).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L11;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 32) {
                    break L3;
                  } else {
                    ((nj) this).field_m[var2_int] = (byte) 0;
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((nj) this).field_k[0] = (byte) 0;
                ((nj) this).field_g = 0;
                ((nj) this).field_b = 0;
                break L2;
              }
              var2_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_int >= 8) {
                      break L6;
                    } else {
                      ((nj) this).field_n[var2_int] = 0L;
                      var2_int++;
                      if (var3 != 0) {
                        break L5;
                      } else {
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (param0) {
                    break L5;
                  } else {
                    field_p = null;
                    break L5;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) (Object) runtimeException, "nj.D(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_e = null;
              if (param0 == 0) {
                break L1;
              } else {
                String discarded$2 = nj.a(false, true, -15, true);
                break L1;
              }
            }
            field_c = null;
            field_f = null;
            field_d = null;
            field_o = null;
            field_p = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "nj.C(" + param0 + ')');
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_10_0 = null;
        String stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_14_0 = null;
        Object stackOut_9_0 = null;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if (param0) {
                var4_int += 4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1) {
                var4_int += 2;
                break L2;
              } else {
                break L2;
              }
            }
            if (param2 < -52) {
              L3: {
                if (!param3) {
                  break L3;
                } else {
                  var4_int++;
                  break L3;
                }
              }
              stackOut_14_0 = tf.field_nb[var4_int];
              stackIn_15_0 = stackOut_14_0;
              break L0;
            } else {
              stackOut_9_0 = null;
              stackIn_10_0 = stackOut_9_0;
              return (String) (Object) stackIn_10_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var4, "nj.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_15_0;
    }

    final static java.awt.Frame a(int param0, int param1, bl param2, boolean param3, int param4, int param5) {
        RuntimeException var6 = null;
        fl[] var6_array = null;
        il var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_15_0 = 0;
        int stackIn_38_0 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_49_0 = null;
        Object stackIn_52_0 = null;
        java.awt.Frame stackIn_54_0 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        int stackOut_14_0 = 0;
        int stackOut_37_0 = 0;
        Object stackOut_40_0 = null;
        Object stackOut_10_0 = null;
        java.awt.Frame stackOut_53_0 = null;
        Object stackOut_51_0 = null;
        Object stackOut_48_0 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (!param2.a(-20)) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (java.awt.Frame) (Object) stackIn_5_0;
            } else {
              L1: {
                if (param1 == 0) {
                  var6_array = eb.a(param2, true);
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var8 >= var6_array.length) {
                            break L4;
                          } else {
                            stackOut_14_0 = ~var6_array[var8].field_g;
                            stackIn_38_0 = stackOut_14_0;
                            stackIn_15_0 = stackOut_14_0;
                            if (var9 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_15_0 != ~param4) {
                                  break L5;
                                } else {
                                  if (var6_array[var8].field_h != param5) {
                                    break L5;
                                  } else {
                                    L6: {
                                      if (param0 == 0) {
                                        break L6;
                                      } else {
                                        if (~var6_array[var8].field_c == ~param0) {
                                          break L6;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                    L7: {
                                      if (var7_int == 0) {
                                        break L7;
                                      } else {
                                        if (var6_array[var8].field_b > param1) {
                                          break L7;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                    param1 = var6_array[var8].field_b;
                                    var7_int = 1;
                                    break L5;
                                  }
                                }
                              }
                              var8++;
                              if (var9 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackOut_37_0 = var7_int;
                        stackIn_38_0 = stackOut_37_0;
                        break L3;
                      }
                      if (stackIn_38_0 == 0) {
                        stackOut_40_0 = null;
                        stackIn_41_0 = stackOut_40_0;
                        return (java.awt.Frame) (Object) stackIn_41_0;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (java.awt.Frame) (Object) stackIn_11_0;
                  }
                } else {
                  break L1;
                }
              }
              L8: {
                var6_ref = param2.a(param4, param5, param0, 0, param1);
                if (!param3) {
                  break L8;
                } else {
                  field_o = null;
                  break L8;
                }
              }
              L9: while (true) {
                L10: {
                  if (var6_ref.field_b != 0) {
                    break L10;
                  } else {
                    kk.a(10L, true);
                    if (var9 == 0) {
                      continue L9;
                    } else {
                      break L10;
                    }
                  }
                }
                var7 = (java.awt.Frame) var6_ref.field_g;
                if (null != var7) {
                  if (var6_ref.field_b != 2) {
                    stackOut_53_0 = (java.awt.Frame) var7;
                    stackIn_54_0 = stackOut_53_0;
                    break L0;
                  } else {
                    ce.a(param2, var7, (byte) -47);
                    stackOut_51_0 = null;
                    stackIn_52_0 = stackOut_51_0;
                    return (java.awt.Frame) (Object) stackIn_52_0;
                  }
                } else {
                  stackOut_48_0 = null;
                  stackIn_49_0 = stackOut_48_0;
                  return (java.awt.Frame) (Object) stackIn_49_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var6;
            stackOut_55_1 = new StringBuilder().append("nj.G(").append(param0).append(',').append(param1).append(',');
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param2 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L11;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L11;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_54_0;
    }

    private final void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_59_0 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 8) {
                    break L3;
                  } else {
                    ((nj) this).field_l[var2_int] = ff.a(hg.a(255L, (long)((nj) this).field_k[7 + var3]), ff.a(hg.a(65280L, (long)((nj) this).field_k[6 + var3] << -1502511992), ff.a(hg.a(16711680L, (long)((nj) this).field_k[var3 + 5] << -1351999536), ff.a(ff.a(ff.a(ff.a((long)((nj) this).field_k[var3] << -1202474824, hg.a((long)((nj) this).field_k[var3 - -1], 255L) << 2003009584), hg.a(255L, (long)((nj) this).field_k[2 + var3]) << 208246952), hg.a((long)((nj) this).field_k[3 + var3] << 1557832160, 1095216660480L)), hg.a((long)((nj) this).field_k[var3 + 4] << 1265708888, 4278190080L)))));
                    var2_int++;
                    var3 += 8;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_int >= 8) {
                      break L6;
                    } else {
                      ((nj) this).field_q[var2_int] = ((nj) this).field_n[var2_int];
                      ((nj) this).field_h[var2_int] = ff.a(((nj) this).field_l[var2_int], ((nj) this).field_n[var2_int]);
                      var2_int++;
                      if (var6 != 0) {
                        break L5;
                      } else {
                        if (var6 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var2_int = 1;
                  break L5;
                }
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var2_int > 10) {
                        break L9;
                      } else {
                        stackOut_17_0 = 0;
                        stackIn_60_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var6 != 0) {
                          break L8;
                        } else {
                          stackOut_18_0 = stackIn_18_0;
                          stackIn_20_0 = stackOut_18_0;
                          var3 = stackIn_20_0;
                          L10: while (true) {
                            L11: {
                              L12: {
                                if (var3 >= 8) {
                                  break L12;
                                } else {
                                  ((nj) this).field_i[var3] = 0L;
                                  var4 = 0;
                                  stackOut_22_0 = 56;
                                  stackIn_32_0 = stackOut_22_0;
                                  stackIn_23_0 = stackOut_22_0;
                                  if (var6 != 0) {
                                    break L11;
                                  } else {
                                    var5 = stackIn_23_0;
                                    L13: while (true) {
                                      L14: {
                                        L15: {
                                          if (var4 >= 8) {
                                            break L15;
                                          } else {
                                            ((nj) this).field_i[var3] = ff.a(((nj) this).field_i[var3], qb.field_c[var4][rk.a((int)(((nj) this).field_q[rk.a(var3 - var4, 7)] >>> var5), 255)]);
                                            var5 -= 8;
                                            var4++;
                                            if (var6 != 0) {
                                              break L14;
                                            } else {
                                              if (var6 == 0) {
                                                continue L13;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                        }
                                        var3++;
                                        break L14;
                                      }
                                      if (var6 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_31_0 = 0;
                              stackIn_32_0 = stackOut_31_0;
                              break L11;
                            }
                            var3 = stackIn_32_0;
                            L16: while (true) {
                              L17: {
                                L18: {
                                  if (var3 >= 8) {
                                    break L18;
                                  } else {
                                    ((nj) this).field_q[var3] = ((nj) this).field_i[var3];
                                    var3++;
                                    if (var6 != 0) {
                                      break L17;
                                    } else {
                                      if (var6 == 0) {
                                        continue L16;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                                ((nj) this).field_q[0] = ff.a(((nj) this).field_q[0], qb.field_e[var2_int]);
                                break L17;
                              }
                              var3 = 0;
                              L19: while (true) {
                                L20: {
                                  L21: {
                                    if (8 <= var3) {
                                      break L21;
                                    } else {
                                      ((nj) this).field_i[var3] = ((nj) this).field_q[var3];
                                      var4 = 0;
                                      stackOut_41_0 = 56;
                                      stackIn_51_0 = stackOut_41_0;
                                      stackIn_42_0 = stackOut_41_0;
                                      if (var6 != 0) {
                                        break L20;
                                      } else {
                                        var5 = stackIn_42_0;
                                        L22: while (true) {
                                          L23: {
                                            L24: {
                                              if (var4 >= 8) {
                                                break L24;
                                              } else {
                                                ((nj) this).field_i[var3] = ff.a(((nj) this).field_i[var3], qb.field_c[var4][rk.a(255, (int)(((nj) this).field_h[rk.a(7, var3 + -var4)] >>> var5))]);
                                                var5 -= 8;
                                                var4++;
                                                if (var6 != 0) {
                                                  break L23;
                                                } else {
                                                  if (var6 == 0) {
                                                    continue L22;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                            }
                                            var3++;
                                            break L23;
                                          }
                                          if (var6 == 0) {
                                            continue L19;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_50_0 = 0;
                                  stackIn_51_0 = stackOut_50_0;
                                  break L20;
                                }
                                var3 = stackIn_51_0;
                                L25: while (true) {
                                  L26: {
                                    L27: {
                                      if (var3 >= 8) {
                                        break L27;
                                      } else {
                                        ((nj) this).field_h[var3] = ((nj) this).field_i[var3];
                                        var3++;
                                        if (var6 != 0) {
                                          break L26;
                                        } else {
                                          if (var6 == 0) {
                                            continue L25;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                    }
                                    var2_int++;
                                    break L26;
                                  }
                                  if (var6 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_59_0 = param0;
                    stackIn_60_0 = stackOut_59_0;
                    break L8;
                  }
                  L28: {
                    if (stackIn_60_0 == 8) {
                      break L28;
                    } else {
                      java.awt.Frame discarded$1 = nj.a(118, 34, (bl) null, false, -72, 58);
                      break L28;
                    }
                  }
                  var2_int = 0;
                  L29: while (true) {
                    L30: {
                      L31: {
                        if (var2_int >= 8) {
                          break L31;
                        } else {
                          ((nj) this).field_n[var2_int] = ff.a(((nj) this).field_n[var2_int], ff.a(((nj) this).field_l[var2_int], ((nj) this).field_h[var2_int]));
                          var2_int++;
                          if (var6 != 0) {
                            break L30;
                          } else {
                            if (var6 == 0) {
                              continue L29;
                            } else {
                              break L31;
                            }
                          }
                        }
                      }
                      break L30;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "nj.B(" + param0 + ')');
        }
    }

    nj() {
        ((nj) this).field_b = 0;
        ((nj) this).field_n = new long[8];
        ((nj) this).field_g = 0;
        ((nj) this).field_q = new long[8];
        ((nj) this).field_h = new long[8];
        ((nj) this).field_i = new long[8];
        ((nj) this).field_l = new long[8];
        ((nj) this).field_k = new byte[64];
        ((nj) this).field_m = new byte[32];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 49;
        field_e = "Passwords must be between 5 and 20 characters long";
        field_c = "This password contains your Player Name, and would be easy to guess";
    }
}
