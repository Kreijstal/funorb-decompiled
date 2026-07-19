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
            this.field_D = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "hc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        fe var8 = ia.field_i[param3][param5][param2];
        int var9 = qk.a(param3, param7, param6, param2, 125, param1, param5, param4);
        if (param0 < 20) {
            hc.d((byte) -55);
        }
        if (!(-1 > (var9 ^ -1))) {
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
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            var5 = TorChallenge.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (param1 == -13) {
                    break L1;
                  } else {
                    field_S = 50;
                    break L1;
                  }
                }
                L2: {
                  var6 = new byte[24];
                  var2 = var6;
                  if (null != cf.field_d) {
                    try {
                      L3: {
                        cf.field_d.a(0L, 0);
                        cf.field_d.a((byte) -128, var6);
                        var3_int = 0;
                        L4: while (true) {
                          L5: {
                            if ((var3_int ^ -1) <= -25) {
                              break L5;
                            } else {
                              if (var2[var3_int] == 0) {
                                var3_int++;
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (24 > var3_int) {
                            break L3;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L7: while (true) {
                          if (24 <= var4) {
                            break L6;
                          } else {
                            var2[var4] = (byte)-1;
                            var4++;
                            continue L7;
                          }
                        }
                      }
                    }
                    param0.a(24, 0, var2, -16384);
                    break L2;
                  } else {
                    param0.a(24, 0, var2, -16384);
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_18_0 = (RuntimeException) (var2_ref);
                stackOut_18_1 = new StringBuilder().append("hc.AA(");
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param0 == null) {
                  stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackOut_20_2 = "null";
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  break L8;
                } else {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "{...}";
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  break L8;
                }
              }
              throw oj.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
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
            throw oj.a((Throwable) ((Object) runtimeException), "hc.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(byte param0) {
        boolean discarded$7 = false;
        String[][] dupTemp$8 = null;
        long[][] dupTemp$9 = null;
        int[][] dupTemp$10 = null;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
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
        int decompiledRegionSelector0 = 0;
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
                discarded$7 = hc.c((byte) -46);
                break L1;
              }
            }
            L2: {
              if (var2 != 0) {
                if ((var2 ^ -1) == -2) {
                  var3 = var28.c(false);
                  var4 = var28.k(param0 ^ 95);
                  var6 = (ji) ((Object) wf.field_g.c((byte) 1));
                  L3: while (true) {
                    L4: {
                      if (var6 == null) {
                        break L4;
                      } else {
                        if (var6.field_l == var3) {
                          break L4;
                        } else {
                          var6 = (ji) ((Object) wf.field_g.c(-270));
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
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  td.a("HS1: " + ck.a(param0 + -13182), (Throwable) null, (byte) -92);
                  ob.b(-89);
                  break L2;
                }
              } else {
                var3 = var28.c(false);
                var4_ref_ae = (ae) ((Object) bk.field_t.c((byte) -110));
                L5: while (true) {
                  L6: {
                    if (var4_ref_ae == null) {
                      break L6;
                    } else {
                      if (var4_ref_ae.field_o == var3) {
                        break L6;
                      } else {
                        var4_ref_ae = (ae) ((Object) bk.field_t.c(-270));
                        continue L5;
                      }
                    }
                  }
                  if (var4_ref_ae == null) {
                    ob.b(-127);
                    decompiledRegionSelector0 = 0;
                    break L0;
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
                            dupTemp$8 = new String[3][var6_int];
                            var4_ref_ae.field_i = dupTemp$8;
                            var8 = dupTemp$8;
                            var9 = new String[3][var6_int];
                            dupTemp$9 = new long[3][var6_int];
                            var4_ref_ae.field_t = dupTemp$9;
                            var10 = dupTemp$9;
                            dupTemp$10 = new int[3][var7 * var6_int];
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
                                          incrementValue$11 = var15;
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
                                            incrementValue$12 = var16;
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
                                            incrementValue$13 = var17;
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
                              if ((var28.j(-121) ^ -1) == -2) {
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
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "hc.BA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private hc(String param0, gg param1) {
        this(param0, kl.field_e.field_f, param1);
        try {
            this.field_q = kl.field_e.field_l;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "hc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_T = null;
        field_P = null;
        if (param0 > -23) {
            field_P = (k) null;
        }
    }

    final static boolean c(byte param0) {
        int var1 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var1 = -73 % ((param0 - -52) / 54);
            if (-21 < (li.field_K ^ -1)) {
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
            this.field_q = kl.field_e.field_l;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "hc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_D = !this.field_D ? true : false;
        super.a(param0, param1 ^ 0, param2, param3);
        if (param1 != -13461) {
            field_Q = true;
        }
    }

    static {
        field_Q = false;
        field_R = 0L;
        field_P = new k(7, 0, 1, 1);
    }
}
