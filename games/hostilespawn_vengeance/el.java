/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.Socket;
import java.net.ProxySelector;
import java.net.URI;

final class el extends fe {
    static int field_j;
    static int field_m;
    static long[] field_e;
    static String field_i;
    static de[] field_h;
    static bd field_f;
    static bd field_d;
    private java.net.ProxySelector field_k;
    static bd field_l;
    static String field_g;

    public static void b() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_g = null;
            field_i = null;
            field_e = null;
            field_h = null;
            field_d = null;
            field_f = null;
            field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "el.E(" + true + ')');
        }
    }

    final static bd a(int param0, int param1, int param2) {
        bd var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        bd stackIn_7_0 = null;
        bd stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        bd stackOut_6_0 = null;
        bd stackOut_10_0 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new bd(param1, param1);
              if (param0 <= -6) {
                break L1;
              } else {
                field_m = -43;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var4 <= ~var3.field_D.length) {
                    break L4;
                  } else {
                    stackOut_6_0 = (bd) var3;
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      stackIn_7_0.field_D[var4] = param2;
                      var4++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_10_0 = (bd) var3;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var3_ref, "el.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    final static double a(double param0, double param1, int param2, double param3, double param4) {
        RuntimeException var9 = null;
        double stackIn_4_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        double stackOut_3_0 = 0.0;
        try {
          L0: {
            L1: {
              if (param2 == 16) {
                break L1;
              } else {
                el.a((int[]) null, (int[]) null, -25, false, (pf) null, true, true);
                break L1;
              }
            }
            stackOut_3_0 = Math.atan2(param0 - param1, param3 - param4) * 128.0 / 3.141592653589793;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var9, "el.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_4_0;
    }

    private final java.net.Socket a(int param0, int param1, String param2, String param3) throws IOException {
        RuntimeException var5 = null;
        java.net.Socket var5_ref = null;
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket stackOut_17_0 = null;
        Object stackOut_34_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var5_ref = new java.net.Socket(param3, param1);
                var5_ref.setSoTimeout(10000);
                var6 = var5_ref.getOutputStream();
                if (param2 != null) {
                  break L2;
                } else {
                  var6.write(("CONNECT " + ((el) this).field_a + ":" + ((el) this).field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  if (var12 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6.write(("CONNECT " + ((el) this).field_a + ":" + ((el) this).field_b + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L1;
            }
            var6.flush();
            var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var5_ref.getInputStream()));
            L3: {
              var8 = var7.readLine();
              if (var8 != null) {
                L4: {
                  if (var8.startsWith("HTTP/1.0 200")) {
                    break L4;
                  } else {
                    if (!var8.startsWith("HTTP/1.1 200")) {
                      L5: {
                        if (var8.startsWith("HTTP/1.0 407")) {
                          break L5;
                        } else {
                          if (!var8.startsWith("HTTP/1.1 407")) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var9 = 0;
                      var8 = var7.readLine();
                      var10 = "proxy-authenticate: ";
                      L6: while (true) {
                        L7: {
                          if (null == var8) {
                            break L7;
                          } else {
                            if (var9 >= 50) {
                              break L7;
                            } else {
                              if (!var8.toLowerCase().startsWith(var10)) {
                                var9++;
                                var8 = var7.readLine();
                                if (var12 == 0) {
                                  continue L6;
                                } else {
                                  break L7;
                                }
                              } else {
                                L8: {
                                  var8 = var8.substring(var10.length()).trim();
                                  var11 = var8.indexOf(' ');
                                  if (var11 == -1) {
                                    break L8;
                                  } else {
                                    var8 = var8.substring(0, var11);
                                    break L8;
                                  }
                                }
                                throw new ab(var8);
                              }
                            }
                          }
                        }
                        throw new ab("");
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_17_0 = (java.net.Socket) var5_ref;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0;
              } else {
                break L3;
              }
            }
            var6.close();
            var7.close();
            var5_ref.close();
            stackOut_34_0 = null;
            stackIn_35_0 = stackOut_34_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var5;
            stackOut_36_1 = new StringBuilder().append("el.G(").append(10).append(',').append(param1).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L9;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L9;
            }
          }
          L10: {
            stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
            stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param3 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L10;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L10;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ')');
        }
        return (java.net.Socket) (Object) stackIn_35_0;
    }

    final static void a(int[] param0, int[] param1, int param2, boolean param3, pf param4, boolean param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        var30 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              var21 = param1[3] >> 2;
              var22 = param1[4] >> 2;
              var23 = param1[5] >> 2;
              var24 = param1[6] >> 2;
              var25 = param1[7] >> 2;
              var26 = param1[8] >> 2;
              var27 = param1[9] >> 2;
              var28 = param1[10] >> 2;
              var29 = param1[11] >> 2;
              var13 = param0[4] * var25 + (var24 * param0[3] - -(param0[5] * var26)) >> 14;
              var12 = param0[5] * var23 + var21 * param0[3] - -(var22 * param0[4]) >> 14;
              var18 = var22 * param0[10] + param0[9] * var21 + var23 * param0[11] >> 14;
              var14 = param0[5] * var29 + var27 * param0[3] + param0[4] * var28 >> 14;
              var19 = var26 * param0[11] + var25 * param0[10] + var24 * param0[9] >> 14;
              var20 = var28 * param0[10] + (param0[9] * var27 + param0[11] * var29) >> 14;
              var16 = var25 * param0[7] + (param0[6] * var24 + param0[8] * var26) >> 14;
              var17 = var29 * param0[8] + var27 * param0[6] - -(var28 * param0[7]) >> 14;
              var15 = param0[8] * var23 + var21 * param0[6] - -(var22 * param0[7]) >> 14;
              var21 = -param1[0] + param0[0];
              var22 = param0[1] - param1[1];
              if (param2 == -12705) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            var23 = param0[2] - param1[2];
            var9 = param1[3] * var21 - (-(var22 * param1[4]) + -(param1[5] * var23)) >> -ih.field_w + 16;
            var10 = var22 * param1[7] + (param1[6] * var21 - -(param1[8] * var23)) >> 16 - ih.field_w;
            var11 = param1[11] * var23 + param1[9] * var21 - -(param1[10] * var22) >> 16;
            var21 = ge.field_c;
            var22 = ge.field_b;
            var23 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var23 >= param4.field_c) {
                      break L5;
                    } else {
                      var24 = param4.field_n[var23];
                      var25 = param4.field_E[var23];
                      var26 = param4.field_H[var23];
                      var27 = (var12 * var24 - -(var25 * var15) - -(var26 * var18) >> -ih.field_w + 16) + var9;
                      var28 = (var19 * var26 + (var13 * var24 - -(var25 * var16)) >> -ih.field_w + 16) + var10;
                      var29 = (var26 * var20 + (var25 * var17 + var14 * var24) >> 16) + var11;
                      stackOut_6_0 = var29;
                      stackOut_6_1 = 50;
                      stackIn_69_0 = stackOut_6_0;
                      stackIn_69_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var30 != 0) {
                        break L4;
                      } else {
                        L6: {
                          L7: {
                            if (stackIn_7_0 < stackIn_7_1) {
                              break L7;
                            } else {
                              L8: {
                                tb.field_K[var23] = var21 - -(var27 / var29);
                                lc.field_c[var23] = var22 + var28 / var29;
                                if (var8 < var29) {
                                  var8 = var29;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              L9: {
                                if (var7_int > var29) {
                                  var7_int = var29;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              rb.field_p[var23] = var29;
                              if (var30 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          rb.field_p[var23] = -2147483648;
                          break L6;
                        }
                        L10: {
                          if (!param5) {
                            break L10;
                          } else {
                            dk.field_m[var23] = var27 >> ih.field_w;
                            sj.field_f[var23] = var28 >> ih.field_w;
                            ii.field_c[var23] = var29;
                            break L10;
                          }
                        }
                        var23++;
                        if (var30 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L11: {
                    if (null == param4.field_v) {
                      break L11;
                    } else {
                      if (param4.field_p == null) {
                        break L11;
                      } else {
                        if (param4.field_e == null) {
                          break L11;
                        } else {
                          if (param4.field_Q == null) {
                            break L11;
                          } else {
                            if (null == param4.field_B) {
                              break L11;
                            } else {
                              if (null == param4.field_M) {
                                break L11;
                              } else {
                                if (null == param4.field_h) {
                                  break L11;
                                } else {
                                  if (param4.field_l == null) {
                                    break L11;
                                  } else {
                                    if (param4.field_F != null) {
                                      var23 = 0;
                                      L12: while (true) {
                                        if (param4.field_k <= var23) {
                                          break L11;
                                        } else {
                                          var24 = param4.field_v[var23];
                                          var25 = param4.field_p[var23];
                                          var26 = param4.field_e[var23];
                                          ac.field_j[var23] = var9 - -(var25 * var15 + (var24 * var12 + var18 * var26) >> 16);
                                          ke.field_v[var23] = (var16 * var25 + var24 * var13 + var26 * var19 >> 16) + var10;
                                          vi.field_m[var23] = var11 + (var26 * var20 + var25 * var17 + var14 * var24 >> 16);
                                          var24 = param4.field_Q[var23];
                                          var25 = param4.field_B[var23];
                                          var26 = param4.field_M[var23];
                                          lk.field_M[var23] = (var25 * var15 + (var24 * var12 - -(var26 * var18)) >> 16) + var9;
                                          fm.field_c[var23] = (var13 * var24 - -(var16 * var25) + var19 * var26 >> 16) + var10;
                                          l.field_c[var23] = (var25 * var17 + var24 * var14 - -(var20 * var26) >> 16) + var11;
                                          var24 = param4.field_h[var23];
                                          var25 = param4.field_l[var23];
                                          var26 = param4.field_F[var23];
                                          se.field_d[var23] = (var18 * var26 + var25 * var15 + var12 * var24 >> 16) + var9;
                                          ae.field_q[var23] = var10 + (var19 * var26 + var13 * var24 + var16 * var25 >> 16);
                                          gi.field_l[var23] = (var24 * var14 + (var17 * var25 - -(var20 * var26)) >> 16) + var11;
                                          var23++;
                                          if (var30 != 0) {
                                            break L3;
                                          } else {
                                            if (var30 == 0) {
                                              continue L12;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L13: {
                    if (!param3) {
                      break L13;
                    } else {
                      var9 = param0[3];
                      var10 = param0[4];
                      var11 = param0[5];
                      var12 = param0[6];
                      var13 = param0[7];
                      var14 = param0[8];
                      var15 = param0[9];
                      var16 = param0[10];
                      var17 = param0[11];
                      var18 = 0;
                      L14: while (true) {
                        if (var18 >= param4.field_L) {
                          break L13;
                        } else {
                          stackOut_63_0 = ~oa.field_c.length;
                          stackOut_63_1 = ~var18;
                          stackIn_69_0 = stackOut_63_0;
                          stackIn_69_1 = stackOut_63_1;
                          stackIn_64_0 = stackOut_63_0;
                          stackIn_64_1 = stackOut_63_1;
                          if (var30 != 0) {
                            break L4;
                          } else {
                            if (stackIn_64_0 >= stackIn_64_1) {
                              break L13;
                            } else {
                              var19 = param4.field_u[var18];
                              var20 = param4.field_w[var18];
                              var21 = param4.field_r[var18];
                              oa.field_c[var18] = var9 * var19 - (-(var20 * var12) - var15 * var21) >> 16;
                              in.field_c[var18] = var21 * var16 + (var13 * var20 + var10 * var19) >> 16;
                              dl.field_o[var18] = var20 * var14 + var19 * var11 + var17 * var21 >> 16;
                              var18++;
                              if (var30 == 0) {
                                continue L14;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_68_0 = var8;
                  stackOut_68_1 = var7_int;
                  stackIn_69_0 = stackOut_68_0;
                  stackIn_69_1 = stackOut_68_1;
                  break L4;
                }
                int discarded$1 = 106;
                pc.a(stackIn_69_0, stackIn_69_1, param6, param4);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var7;
            stackOut_71_1 = new StringBuilder().append("el.B(");
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param0 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L15;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L15;
            }
          }
          L16: {
            stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');
            stackIn_78_0 = stackOut_75_0;
            stackIn_78_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param1 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L16;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_79_0 = stackOut_76_0;
              stackIn_79_1 = stackOut_76_1;
              stackIn_79_2 = stackOut_76_2;
              break L16;
            }
          }
          L17: {
            stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
            stackOut_79_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_82_0 = stackOut_79_0;
            stackIn_82_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param4 == null) {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L17;
            } else {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "{...}";
              stackIn_83_0 = stackOut_80_0;
              stackIn_83_1 = stackOut_80_1;
              stackIn_83_2 = stackOut_80_2;
              break L17;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_83_0, stackIn_83_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(int param0, p param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1.field_e < 0) {
                break L1;
              } else {
                sj.field_e.a(true, 128, (int)param1.field_c, param0, param3);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("el.H(").append(param0).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + -117 + ',' + param3 + ')');
        }
    }

    private final java.net.Socket a(java.net.Proxy param0) throws IOException {
        RuntimeException var3 = null;
        java.net.SocketAddress var3_ref = null;
        int var4 = 0;
        Object var5 = null;
        java.net.InetSocketAddress var5_ref = null;
        Object var6 = null;
        Exception var7 = null;
        Class var7_ref = null;
        java.lang.reflect.Method var8 = null;
        Object var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        java.lang.reflect.Method var12 = null;
        String var13 = null;
        String var14 = null;
        java.net.Socket stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        java.net.Socket stackOut_3_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_22_0 = null;
        Object stackOut_20_0 = null;
        java.net.Socket stackOut_17_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            if (param0.type() == java.net.Proxy.Type.DIRECT) {
              stackOut_3_0 = ((el) this).b(117);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var3_ref = param0.address();
              if (!((Object) var3_ref instanceof java.net.InetSocketAddress)) {
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                return (java.net.Socket) (Object) stackIn_9_0;
              } else {
                var4 = 0;
                var5_ref = (java.net.InetSocketAddress) (Object) var3_ref;
                if (param0.type() != java.net.Proxy.Type.HTTP) {
                  if (param0.type() != java.net.Proxy.Type.SOCKS) {
                    stackOut_22_0 = null;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    var6 = (Object) (Object) new java.net.Socket(param0);
                    ((java.net.Socket) var6).connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((el) this).field_a, ((el) this).field_b));
                    stackOut_20_0 = var6;
                    stackIn_21_0 = stackOut_20_0;
                    return (java.net.Socket) (Object) stackIn_21_0;
                  }
                } else {
                  var6 = null;
                  try {
                    L1: {
                      L2: {
                        var7_ref = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var8 = var7_ref.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var8.setAccessible(true);
                        var9 = var8.invoke((Object) null, new Object[2]);
                        if (null == var9) {
                          break L2;
                        } else {
                          var10 = var7_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                          var10.setAccessible(true);
                          if (!((Boolean) var10.invoke(var9, new Object[0])).booleanValue()) {
                            break L2;
                          } else {
                            var11 = var7_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                            var11.setAccessible(true);
                            var12 = var7_ref.getDeclaredMethod("getHeaderValue", new Class[2]);
                            var12.setAccessible(true);
                            var13 = (String) var11.invoke(var9, new Object[0]);
                            var14 = (String) var12.invoke(var9, new Object[2]);
                            var6 = (Object) (Object) (var13 + ": " + var14);
                            break L2;
                          }
                        }
                      }
                      break L1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var7 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  stackOut_17_0 = this.a(10, var5_ref.getPort(), (String) var6, var5_ref.getHostName());
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("el.F(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L4;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + -117 + ')');
        }
        return (java.net.Socket) (Object) stackIn_23_0;
    }

    final static int c() {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            stackOut_3_0 = ae.field_s;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "el.I(" + 9 + ')');
        }
        return stackIn_4_0;
    }

    final java.net.Socket a(int param0) throws IOException {
        RuntimeException var2 = null;
        int var2_int = 0;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        Object var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        ab var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        int stackIn_8_0 = 0;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        java.net.ProxySelector stackIn_13_0 = null;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        StringBuilder stackIn_13_3 = null;
        String stackIn_13_4 = null;
        java.net.ProxySelector stackIn_14_0 = null;
        java.net.URI stackIn_14_1 = null;
        java.net.URI stackIn_14_2 = null;
        StringBuilder stackIn_14_3 = null;
        java.net.ProxySelector stackIn_16_0 = null;
        java.net.URI stackIn_16_1 = null;
        java.net.URI stackIn_16_2 = null;
        StringBuilder stackIn_16_3 = null;
        java.net.ProxySelector stackIn_17_0 = null;
        java.net.URI stackIn_17_1 = null;
        java.net.URI stackIn_17_2 = null;
        StringBuilder stackIn_17_3 = null;
        String stackIn_17_4 = null;
        java.net.Socket stackIn_20_0 = null;
        java.net.Socket stackIn_25_0 = null;
        java.net.Socket stackIn_30_0 = null;
        java.net.Socket stackIn_42_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        java.net.ProxySelector stackOut_12_0 = null;
        java.net.URI stackOut_12_1 = null;
        java.net.URI stackOut_12_2 = null;
        StringBuilder stackOut_12_3 = null;
        String stackOut_12_4 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        String stackOut_10_4 = null;
        java.net.ProxySelector stackOut_13_0 = null;
        java.net.URI stackOut_13_1 = null;
        java.net.URI stackOut_13_2 = null;
        StringBuilder stackOut_13_3 = null;
        java.net.ProxySelector stackOut_16_0 = null;
        java.net.URI stackOut_16_1 = null;
        java.net.URI stackOut_16_2 = null;
        StringBuilder stackOut_16_3 = null;
        String stackOut_16_4 = null;
        java.net.ProxySelector stackOut_14_0 = null;
        java.net.URI stackOut_14_1 = null;
        java.net.URI stackOut_14_2 = null;
        StringBuilder stackOut_14_3 = null;
        String stackOut_14_4 = null;
        java.net.Socket stackOut_19_0 = null;
        java.net.Socket stackOut_24_0 = null;
        java.net.Socket stackOut_29_0 = null;
        java.net.Socket stackOut_41_0 = null;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")) ? 1 : 0;
              if (var2_int != 0) {
                break L1;
              } else {
                String discarded$3 = System.setProperty("java.net.useSystemProxies", "true");
                break L1;
              }
            }
            L2: {
              if (((el) this).field_b != 443) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_8_0 = stackOut_5_0;
                break L2;
              }
            }
            var5 = stackIn_8_0;
            try {
              L3: {
                L4: {
                  stackOut_9_0 = ((el) this).field_k;
                  stackOut_9_1 = null;
                  stackOut_9_2 = null;
                  stackOut_9_3 = new StringBuilder();
                  stackIn_12_0 = stackOut_9_0;
                  stackIn_12_1 = stackOut_9_1;
                  stackIn_12_2 = stackOut_9_2;
                  stackIn_12_3 = stackOut_9_3;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  stackIn_10_3 = stackOut_9_3;
                  if (var5 != 0) {
                    stackOut_12_0 = (java.net.ProxySelector) (Object) stackIn_12_0;
                    stackOut_12_1 = null;
                    stackOut_12_2 = null;
                    stackOut_12_3 = (StringBuilder) (Object) stackIn_12_3;
                    stackOut_12_4 = "https";
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    stackIn_13_3 = stackOut_12_3;
                    stackIn_13_4 = stackOut_12_4;
                    break L4;
                  } else {
                    stackOut_10_0 = (java.net.ProxySelector) (Object) stackIn_10_0;
                    stackOut_10_1 = null;
                    stackOut_10_2 = null;
                    stackOut_10_3 = (StringBuilder) (Object) stackIn_10_3;
                    stackOut_10_4 = "http";
                    stackIn_13_0 = stackOut_10_0;
                    stackIn_13_1 = stackOut_10_1;
                    stackIn_13_2 = stackOut_10_2;
                    stackIn_13_3 = stackOut_10_3;
                    stackIn_13_4 = stackOut_10_4;
                    break L4;
                  }
                }
                L5: {
                  var3 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + ((el) this).field_a));
                  stackOut_13_0 = ((el) this).field_k;
                  stackOut_13_1 = null;
                  stackOut_13_2 = null;
                  stackOut_13_3 = new StringBuilder();
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_16_1 = stackOut_13_1;
                  stackIn_16_2 = stackOut_13_2;
                  stackIn_16_3 = stackOut_13_3;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  if (var5 != 0) {
                    stackOut_16_0 = (java.net.ProxySelector) (Object) stackIn_16_0;
                    stackOut_16_1 = null;
                    stackOut_16_2 = null;
                    stackOut_16_3 = (StringBuilder) (Object) stackIn_16_3;
                    stackOut_16_4 = "http";
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    stackIn_17_3 = stackOut_16_3;
                    stackIn_17_4 = stackOut_16_4;
                    break L5;
                  } else {
                    stackOut_14_0 = (java.net.ProxySelector) (Object) stackIn_14_0;
                    stackOut_14_1 = null;
                    stackOut_14_2 = null;
                    stackOut_14_3 = (StringBuilder) (Object) stackIn_14_3;
                    stackOut_14_4 = "https";
                    stackIn_17_0 = stackOut_14_0;
                    stackIn_17_1 = stackOut_14_1;
                    stackIn_17_2 = stackOut_14_2;
                    stackIn_17_3 = stackOut_14_3;
                    stackIn_17_4 = stackOut_14_4;
                    break L5;
                  }
                }
                var4 = ((java.net.ProxySelector) (Object) stackIn_17_0).select(new java.net.URI(stackIn_17_4 + "://" + ((el) this).field_a));
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
              stackOut_19_0 = ((el) this).b(98);
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0;
            }
            boolean discarded$4 = var3.addAll((Collection) (Object) var4);
            var6_array = var3.toArray();
            var7 = null;
            var8_array = var6_array;
            var9 = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if (~var8_array.length >= ~var9) {
                    break L8;
                  } else {
                    var10 = var8_array[var9];
                    var11 = (java.net.Proxy) var10;
                    try {
                      L9: {
                        int discarded$5 = -117;
                        var12_ref2 = this.a(var11);
                        stackOut_24_0 = (java.net.Socket) var12_ref2;
                        stackIn_42_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var13 != 0) {
                          decompiledRegionSelector0 = 0;
                          break L9;
                        } else {
                          if (stackIn_25_0 != null) {
                            stackOut_29_0 = (java.net.Socket) var12_ref2;
                            stackIn_30_0 = stackOut_29_0;
                            decompiledRegionSelector0 = 1;
                            break L9;
                          } else {
                            decompiledRegionSelector0 = 2;
                            break L9;
                          }
                        }
                      }
                    } catch (java.io.IOException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L11: {
                        var12_ref = (IOException) (Object) decompiledCaughtException;
                        decompiledRegionSelector0 = 2;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var12 = (ab) (Object) decompiledCaughtException;
                        var7 = (Object) (Object) var12;
                        decompiledRegionSelector0 = 2;
                        break L10;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      break L7;
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        return stackIn_30_0;
                      } else {
                        var9++;
                        if (var13 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                L12: {
                  if (param0 == 31067) {
                    break L12;
                  } else {
                    field_e = null;
                    break L12;
                  }
                }
                if (var7 == null) {
                  stackOut_41_0 = ((el) this).b(param0 + -30986);
                  stackIn_42_0 = stackOut_41_0;
                  break L7;
                } else {
                  throw el.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "el.D(" + param0 + ')');
        }
        return stackIn_42_0;
    }

    el() {
        try {
            ((el) this).field_k = java.net.ProxySelector.getDefault();
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "el.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_h = new de[2];
        field_i = "points";
        field_e = new long[32];
        field_j = 0;
        field_g = "The lift has a security lock on it. There should be a security console to turn it off somewhere.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
