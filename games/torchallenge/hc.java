/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hc extends ng {
    static ka[] field_T;
    static boolean field_Q;
    static volatile long field_R;
    static int field_S;
    static k field_P;
    static int field_O;

    hc(String param0, gg param1, boolean param2) {
        this(param0, param1);
        try {
            ((hc) this).field_D = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "hc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        fe var8 = ia.field_i[param3][param5][param2];
        int var9 = qk.a(param3, param7, param6, param2, 125, param1, param5, param4);
        if (param0 < 20) {
            hc.d((byte) -55);
        }
        if (!(var9 > 0)) {
            return;
        }
        if (!(var8 != null)) {
            return;
        }
        e discarded$0 = ol.a(-120, var8, var9);
    }

    final static void a(uf param0, byte param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            var5 = TorChallenge.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  var6 = new byte[24];
                  var2 = var6;
                  if (null != cf.field_d) {
                    try {
                      L2: {
                        cf.field_d.a(0L, 0);
                        cf.field_d.a((byte) -128, var6);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (var3_int >= 24) {
                              break L4;
                            } else {
                              if (var2[var3_int] == 0) {
                                var3_int++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (24 > var3_int) {
                            break L2;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L6: while (true) {
                          if (24 <= var4) {
                            break L5;
                          } else {
                            var2[var4] = (byte) -1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    param0.a(24, 0, var2, -16384);
                    break L1;
                  } else {
                    param0.a(24, 0, var2, -16384);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_16_0 = (RuntimeException) var2_ref;
                stackOut_16_1 = new StringBuilder().append("hc.AA(");
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param0 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L7;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L7;
                }
              }
              throw oj.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + -13 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, ka param8) {
        dd.field_u = param5;
        vk.field_d = param8;
        rl.field_f = param3;
        pi.field_b = param6;
        if (param1 < 86) {
            return;
        }
        try {
            si.field_J = param0;
            fd.field_f = param4;
            vk.field_k = param7;
            bh.field_t = param2;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "hc.EA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + (param8 != null ? "{...}" : "null") + 41);
        }
    }

    final static void d(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ae var4_ref_ae = null;
        long var4 = 0L;
        int var5 = 0;
        ji var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        pa var28 = null;
        RuntimeException decompiledCaughtException = null;
        var26 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var28 = id.field_b;
              var2 = var28.j(-105);
              if (param0 == -117) {
                break L1;
              } else {
                boolean discarded$7 = hc.c((byte) -46);
                break L1;
              }
            }
            L2: {
              if (var2 != 0) {
                if (var2 == 1) {
                  var3 = var28.c(false);
                  var4 = var28.k(param0 ^ 95);
                  var6 = (ji) (Object) wf.field_g.c((byte) 1);
                  L3: while (true) {
                    L4: {
                      if (var6 == null) {
                        break L4;
                      } else {
                        if (var6.field_l == var3) {
                          break L4;
                        } else {
                          var6 = (ji) (Object) wf.field_g.c(-270);
                          continue L3;
                        }
                      }
                    }
                    if (var6 != null) {
                      var6.field_x = var4;
                      var6.a(true);
                      break L2;
                    } else {
                      ob.b(-99);
                      return;
                    }
                  }
                } else {
                  td.a("HS1: " + ck.a(param0 + -13182), (Throwable) null, (byte) -92);
                  ob.b(-89);
                  break L2;
                }
              } else {
                var3 = var28.c(false);
                var4_ref_ae = (ae) (Object) bk.field_t.c((byte) -110);
                L5: while (true) {
                  L6: {
                    if (var4_ref_ae == null) {
                      break L6;
                    } else {
                      if (var4_ref_ae.field_o == var3) {
                        break L6;
                      } else {
                        var4_ref_ae = (ae) (Object) bk.field_t.c(-270);
                        continue L5;
                      }
                    }
                  }
                  if (var4_ref_ae == null) {
                    ob.b(-127);
                    return;
                  } else {
                    L7: {
                      var5 = var28.j(-127);
                      if (var5 == 0) {
                        break L7;
                      } else {
                        var6_int = var4_ref_ae.field_r;
                        ph.field_b[0].field_e = false;
                        var7 = var4_ref_ae.field_q;
                        ph.field_b[0].field_g = mf.field_a;
                        ph.field_b[0].field_a = null;
                        var8_int = 1;
                        L8: while (true) {
                          if (var5 <= var8_int) {
                            String[][] dupTemp$8 = new String[3][var6_int];
                            var4_ref_ae.field_i = dupTemp$8;
                            var8 = dupTemp$8;
                            var9 = new String[3][var6_int];
                            long[][] dupTemp$9 = new long[3][var6_int];
                            var4_ref_ae.field_t = dupTemp$9;
                            var10 = dupTemp$9;
                            int[][] dupTemp$10 = new int[3][var7 * var6_int];
                            var4_ref_ae.field_l = dupTemp$10;
                            var11 = dupTemp$10;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var28.j(param0 + 25);
                            if (0 >= var18) {
                              break L7;
                            } else {
                              var19 = 0;
                              L9: while (true) {
                                if (var19 >= var18) {
                                  break L7;
                                } else {
                                  L10: {
                                    var20 = var28.j(-85);
                                    var21 = ph.field_b[var20].field_g;
                                    var22 = var28.k(-120);
                                    var24 = var28.field_q;
                                    if (var19 >= var6_int) {
                                      break L10;
                                    } else {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = ph.field_b[var20].field_a;
                                      var10[0][var12] = var22;
                                      var12++;
                                      var25 = 0;
                                      L11: while (true) {
                                        if (var7 <= var25) {
                                          break L10;
                                        } else {
                                          int incrementValue$11 = var15;
                                          var15++;
                                          var11[0][incrementValue$11] = var28.i(51);
                                          var25++;
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var21 == null) {
                                      break L12;
                                    } else {
                                      if (jc.a(var21, 26691)) {
                                        var8[1][var13] = mf.field_a;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var13++;
                                        var28.field_q = var24;
                                        var25 = 0;
                                        L13: while (true) {
                                          if (var25 >= var7) {
                                            break L12;
                                          } else {
                                            int incrementValue$12 = var16;
                                            var16++;
                                            var11[1][incrementValue$12] = var28.i(46);
                                            var25++;
                                            continue L13;
                                          }
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (var6_int <= var14) {
                                      break L14;
                                    } else {
                                      if (!ph.field_b[var20].field_e) {
                                        ph.field_b[var20].field_e = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = ph.field_b[var20].field_a;
                                        var10[2][var14] = var22;
                                        var14++;
                                        var28.field_q = var24;
                                        var25 = 0;
                                        L15: while (true) {
                                          if (var7 <= var25) {
                                            break L14;
                                          } else {
                                            int incrementValue$13 = var17;
                                            var17++;
                                            var11[2][incrementValue$13] = var28.i(param0 + 158);
                                            var25++;
                                            continue L15;
                                          }
                                        }
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L9;
                                }
                              }
                            }
                          } else {
                            L16: {
                              ph.field_b[var8_int].field_g = var28.b(false);
                              ph.field_b[var8_int].field_e = false;
                              if (var28.j(-121) == 1) {
                                ph.field_b[var8_int].field_a = var28.b(false);
                                break L16;
                              } else {
                                ph.field_b[var8_int].field_a = null;
                                break L16;
                              }
                            }
                            var8_int++;
                            continue L8;
                          }
                        }
                      }
                    }
                    var4_ref_ae.field_n = true;
                    var4_ref_ae.a(true);
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "hc.BA(" + param0 + 41);
        }
    }

    private hc(String param0, gg param1) {
        this(param0, kl.field_e.field_f, param1);
        try {
            ((hc) this).field_q = kl.field_e.field_l;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "hc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_T = null;
        field_P = null;
    }

    final static boolean c(byte param0) {
        int var1 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var1 = -73 % ((param0 - -52) / 54);
            if (li.field_K < 20) {
              break L1;
            } else {
              if (!ih.f((byte) -108)) {
                break L1;
              } else {
                L2: {
                  if (0 >= uk.field_H) {
                    break L2;
                  } else {
                    if (mf.a((byte) -119)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    private hc(String param0, j param1, gg param2) {
        super(param0, param1, param2);
        try {
            ((hc) this).field_q = kl.field_e.field_l;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "hc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((hc) this).field_D = !((hc) this).field_D ? true : false;
        super.a(param0, param1, param2, param3);
        if (param1 != -13461) {
            field_Q = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = false;
        field_R = 0L;
        field_P = new k(7, 0, 1, 1);
    }
}
