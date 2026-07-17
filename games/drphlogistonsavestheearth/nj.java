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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
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
              if (var11 < 0) {
                L2: while (true) {
                  if (8L >= param2) {
                    L3: {
                      if (param0 <= -72) {
                        break L3;
                      } else {
                        ((nj) this).field_n = null;
                        break L3;
                      }
                    }
                    L4: {
                      if (param2 > 0L) {
                        var8 = 255 & param1[var5_int] << var6;
                        ((nj) this).field_k[((nj) this).field_g] = (byte)li.a((int) ((nj) this).field_k[((nj) this).field_g], var8 >>> var7);
                        break L4;
                      } else {
                        var8 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      if (param2 + (long)var7 < 8L) {
                        ((nj) this).field_b = (int)((long)((nj) this).field_b + param2);
                        break L5;
                      } else {
                        L6: {
                          ((nj) this).field_g = ((nj) this).field_g + 1;
                          param2 = param2 - (long)(8 + -var7);
                          ((nj) this).field_b = ((nj) this).field_b + (-var7 + 8);
                          if (((nj) this).field_b != 512) {
                            break L6;
                          } else {
                            this.a(8);
                            ((nj) this).field_g = 0;
                            ((nj) this).field_b = 0;
                            break L6;
                          }
                        }
                        ((nj) this).field_k[((nj) this).field_g] = (byte)rk.a(var8 << 8 + -var7, 255);
                        ((nj) this).field_b = ((nj) this).field_b + (int)param2;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = param1[var5_int] << var6 & 255 | (param1[var5_int + 1] & 255) >>> 8 - var6;
                      if (var8 < 0) {
                        break L7;
                      } else {
                        if (var8 < 256) {
                          L8: {
                            ((nj) this).field_k[((nj) this).field_g] = (byte)li.a((int) ((nj) this).field_k[((nj) this).field_g], var8 >>> var7);
                            ((nj) this).field_g = ((nj) this).field_g + 1;
                            ((nj) this).field_b = ((nj) this).field_b + (8 - var7);
                            if (512 != ((nj) this).field_b) {
                              break L8;
                            } else {
                              this.a(8);
                              ((nj) this).field_g = 0;
                              ((nj) this).field_b = 0;
                              break L8;
                            }
                          }
                          ((nj) this).field_k[((nj) this).field_g] = (byte)rk.a(255, var8 << 8 + -var7);
                          ((nj) this).field_b = ((nj) this).field_b + var7;
                          param2 = param2 - 8L;
                          var5_int++;
                          continue L2;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((255 & (int)var9) + (((nj) this).field_m[var11] & 255));
                ((nj) this).field_m[var11] = (byte)var12;
                var9 = var9 >>> 8;
                var12 = var12 >>> 8;
                var11--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("nj.H(").append(param0).append(44);
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L9;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param2 + 41);
        }
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_21_0 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            int stackOut_3_0 = 0;
            int stackOut_19_0 = 0;
            int stackOut_20_0 = 0;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
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
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = 1;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0 != 0;
                    }
                    case 5: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) pb.a("getcookies", param0, true);
                            var4 = ki.a((byte) -95, ';', var3);
                            var5 = 0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 18;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 15;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 15;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            return true;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var5++;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var2_ref = caughtException;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (null == param0.getParameter("tuhstatbut")) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            stackOut_19_0 = 1;
                            stackIn_21_0 = stackOut_19_0;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            stackOut_20_0 = 0;
                            stackIn_21_0 = stackOut_20_0;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        return stackIn_21_0 != 0;
                    }
                    case 22: {
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_22_0 = (RuntimeException) var2_ref2;
                        stackOut_22_1 = new StringBuilder().append("nj.E(");
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        if (param0 == null) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                        stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                        stackOut_23_2 = "{...}";
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 24: {
                        stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                        stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                        stackOut_24_2 = "null";
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        throw ie.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 8 + 41);
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
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
                    if (((nj) this).field_g >= 64) {
                      this.a(8);
                      ((nj) this).field_g = 0;
                      break L1;
                    } else {
                      int fieldTemp$2 = ((nj) this).field_g;
                      ((nj) this).field_g = ((nj) this).field_g + 1;
                      ((nj) this).field_k[fieldTemp$2] = (byte) 0;
                      continue L2;
                    }
                  }
                }
              }
              L3: while (true) {
                if (32 <= ((nj) this).field_g) {
                  kg.a(((nj) this).field_m, 0, ((nj) this).field_k, 32, 32);
                  this.a(8);
                  var4_int = 0;
                  var5 = param0;
                  L4: while (true) {
                    if (var4_int >= 8) {
                      break L0;
                    } else {
                      var6 = ((nj) this).field_n[var4_int];
                      param2[var5] = (byte)(int)(var6 >>> 56);
                      param2[1 + var5] = (byte)(int)(var6 >>> 48);
                      param2[var5 + 2] = (byte)(int)(var6 >>> 40);
                      param2[var5 - -3] = (byte)(int)(var6 >>> 32);
                      param2[4 + var5] = (byte)(int)(var6 >>> 24);
                      param2[5 + var5] = (byte)(int)(var6 >>> 16);
                      param2[var5 - -6] = (byte)(int)(var6 >>> 8);
                      param2[7 + var5] = (byte)(int)var6;
                      var5 += 8;
                      var4_int++;
                      continue L4;
                    }
                  }
                } else {
                  int fieldTemp$3 = ((nj) this).field_g;
                  ((nj) this).field_g = ((nj) this).field_g + 1;
                  ((nj) this).field_k[fieldTemp$3] = (byte) 0;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("nj.A(").append(param0).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 32) {
            ((nj) this).field_k[0] = (byte) 0;
            ((nj) this).field_g = 0;
            ((nj) this).field_b = 0;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    field_p = null;
                    break L2;
                  }
                }
                return;
              } else {
                ((nj) this).field_n[var2] = 0L;
                var2++;
                continue L1;
              }
            }
          } else {
            ((nj) this).field_m[var2] = (byte) 0;
            var2++;
            continue L0;
          }
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_c = null;
        field_f = null;
        field_d = null;
        field_o = null;
        field_p = null;
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        L0: {
          var4 = 0;
          if (param0) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param1) {
            var4 += 2;
            break L1;
          } else {
            break L1;
          }
        }
        if (param2 < -52) {
          L2: {
            if (!param3) {
              break L2;
            } else {
              var4++;
              break L2;
            }
          }
          return tf.field_nb[var4];
        } else {
          return null;
        }
    }

    final static java.awt.Frame a(int param0, int param1, bl param2, boolean param3, int param4, int param5) {
        RuntimeException var6 = null;
        fl[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        fl[] var10 = null;
        il var11 = null;
        Object stackIn_10_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_30_0 = null;
        java.awt.Frame stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        java.awt.Frame stackOut_31_0 = null;
        Object stackOut_29_0 = null;
        Object stackOut_26_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param2.a(-20)) {
              L1: {
                if (param1 == 0) {
                  var10 = eb.a(param2, true);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        L3: {
                          if (var10[var8].field_g != param4) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_9_0 = null;
                    stackIn_10_0 = stackOut_9_0;
                    return (java.awt.Frame) (Object) stackIn_10_0;
                  }
                } else {
                  break L1;
                }
              }
              L4: {
                var11 = param2.a(param4, param5, param0, 0, param1);
                if (!param3) {
                  break L4;
                } else {
                  field_o = null;
                  break L4;
                }
              }
              L5: while (true) {
                if (var11.field_b != 0) {
                  var7 = (java.awt.Frame) var11.field_g;
                  if (null != var7) {
                    if (var11.field_b != 2) {
                      stackOut_31_0 = (java.awt.Frame) var7;
                      stackIn_32_0 = stackOut_31_0;
                      break L0;
                    } else {
                      ce.a(param2, var7, (byte) -47);
                      stackOut_29_0 = null;
                      stackIn_30_0 = stackOut_29_0;
                      return (java.awt.Frame) (Object) stackIn_30_0;
                    }
                  } else {
                    stackOut_26_0 = null;
                    stackIn_27_0 = stackOut_26_0;
                    return (java.awt.Frame) (Object) stackIn_27_0;
                  }
                } else {
                  kk.a(10L, true);
                  continue L5;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var6;
            stackOut_33_1 = new StringBuilder().append("nj.G(").append(param0).append(44).append(param1).append(44);
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L6;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L6;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_32_0;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((nj) this).field_n[var2] = ff.a(((nj) this).field_n[var2], ff.a(((nj) this).field_l[var2], ((nj) this).field_h[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= 8) {
                        var3 = 0;
                        L5: while (true) {
                          if (var3 >= 8) {
                            ((nj) this).field_q[0] = ff.a(((nj) this).field_q[0], qb.field_e[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 < 8) {
                                    ((nj) this).field_h[var3] = ((nj) this).field_i[var3];
                                    var3++;
                                    continue L7;
                                  } else {
                                    var2++;
                                    continue L2;
                                  }
                                }
                              } else {
                                ((nj) this).field_i[var3] = ((nj) this).field_q[var3];
                                var8 = 0;
                                var4 = var8;
                                var5 = 56;
                                L8: while (true) {
                                  if (var8 < 8) {
                                    ((nj) this).field_i[var3] = ff.a(((nj) this).field_i[var3], qb.field_c[var8][rk.a(255, (int)(((nj) this).field_h[rk.a(7, var3 + -var8)] >>> var5))]);
                                    var5 -= 8;
                                    var8++;
                                    continue L8;
                                  } else {
                                    var3++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          } else {
                            ((nj) this).field_q[var3] = ((nj) this).field_i[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((nj) this).field_i[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (var4 < 8) {
                            ((nj) this).field_i[var3] = ff.a(((nj) this).field_i[var3], qb.field_c[var4][rk.a((int)(((nj) this).field_q[rk.a(var3 - var4, 7)] >>> var5), 255)]);
                            var5 -= 8;
                            var4++;
                            continue L9;
                          } else {
                            var3++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((nj) this).field_q[var2] = ((nj) this).field_n[var2];
                ((nj) this).field_h[var2] = ff.a(((nj) this).field_l[var2], ((nj) this).field_n[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((nj) this).field_l[var2] = ff.a(hg.a(255L, (long)((nj) this).field_k[7 + var3]), ff.a(hg.a(65280L, (long)((nj) this).field_k[6 + var3] << 8), ff.a(hg.a(16711680L, (long)((nj) this).field_k[var3 + 5] << 16), ff.a(ff.a(ff.a(ff.a((long)((nj) this).field_k[var3] << 56, hg.a((long)((nj) this).field_k[var3 - -1], 255L) << 48), hg.a(255L, (long)((nj) this).field_k[2 + var3]) << 40), hg.a((long)((nj) this).field_k[3 + var3] << 32, 1095216660480L)), hg.a((long)((nj) this).field_k[var3 + 4] << 24, 4278190080L)))));
            var2++;
            var3 += 8;
            continue L0;
          }
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
