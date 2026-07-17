/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static ge[] field_d;
    static volatile boolean field_a;
    static ka field_b;
    static ka[][][] field_c;

    final static void a(int param0, int param1, int param2, int param3, ka param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var20 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (-param0 + param3 << 8) / param4.field_q;
              param1 = param1 + param4.field_p;
              param2 = param2 + param4.field_s;
              var7 = (param0 << 8) - -(param4.field_s * var6_int);
              var8 = param1 * qg.field_g + param2;
              var9 = 0;
              var10 = param4.field_x;
              var11 = param4.field_u;
              var12 = -var11 + qg.field_g;
              if (param1 >= qg.field_k) {
                break L1;
              } else {
                var14 = qg.field_k + -param1;
                var9 = var9 + var11 * var14;
                var8 = var8 + qg.field_g * var14;
                param1 = qg.field_k;
                var10 = var10 - var14;
                break L1;
              }
            }
            L2: {
              var13 = 0;
              if (param2 < qg.field_a) {
                var14 = -param2 + qg.field_a;
                var11 = var11 - var14;
                param2 = qg.field_a;
                var7 = var7 + var14 * var6_int;
                var9 = var9 + var14;
                var12 = var12 + var14;
                var13 = var13 + var14;
                var8 = var8 + var14;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (qg.field_l < param1 + var10) {
                var10 = var10 - (-qg.field_l + param1 - -var10);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (qg.field_c < param2 - -var11) {
                var14 = -qg.field_c + (param2 + var11);
                var11 = var11 - var14;
                var13 = var13 + var14;
                var12 = var12 + var14;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param5 >= 51) {
                break L5;
              } else {
                field_d = null;
                break L5;
              }
            }
            L6: {
              if (var11 <= 0) {
                break L6;
              } else {
                if (var10 > 0) {
                  param1 = -var10;
                  L7: while (true) {
                    if (param1 >= 0) {
                      break L0;
                    } else {
                      var14 = var7;
                      param2 = -var11;
                      L8: while (true) {
                        if (param2 >= 0) {
                          var9 = var9 + var13;
                          var8 = var8 + var12;
                          param1++;
                          continue L7;
                        } else {
                          L9: {
                            var15 = var14 >> 8;
                            var14 = var14 + var6_int;
                            var16 = 256 + -var15;
                            if (var15 >= 0) {
                              L10: {
                                int incrementValue$1 = var9;
                                var9++;
                                var17 = param4.field_y[incrementValue$1];
                                if (var17 == 0) {
                                  break L10;
                                } else {
                                  if (255 >= var15) {
                                    var18 = qg.field_i[var8];
                                    var19 = var15 * (16711935 & var17) + var16 * (var18 & 16711935) >> 8 & 16711935;
                                    qg.field_i[var8] = var19 - -jh.a(var16 * jh.a(65280, var18) - -(var15 * jh.a(65280, var17)) >> 8, 65280);
                                    break L10;
                                  } else {
                                    qg.field_i[var8] = var17;
                                    break L10;
                                  }
                                }
                              }
                              var8++;
                              break L9;
                            } else {
                              var8++;
                              var9++;
                              break L9;
                            }
                          }
                          param2++;
                          continue L8;
                        }
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var6;
            stackOut_32_1 = new StringBuilder().append("c.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param4 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 44 + param5 + 41);
        }
    }

    public static void b() {
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param2 >>> 31;
        return -var3 + (param2 + var3) / param0;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var1_int = 5;
                if (d.p(-88)) {
                  break L2;
                } else {
                  if (ee.field_o > 0) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L1;
            }
            var2 = stackIn_6_0;
            var3 = 0;
            L3: while (true) {
              if (var3 >= 3) {
                L4: {
                  var3 = 0;
                  if (param0 >= 86) {
                    break L4;
                  } else {
                    field_a = true;
                    break L4;
                  }
                }
                L5: while (true) {
                  if (var3 >= 6) {
                    var3 = 0;
                    L6: while (true) {
                      if (var3 >= 6) {
                        break L0;
                      } else {
                        L7: {
                          kj.field_I[var3] = false;
                          if (var2 == 0) {
                            break L7;
                          } else {
                            if (1 >= var3) {
                              break L7;
                            } else {
                              kj.field_I[var3] = true;
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (!bh.field_p) {
                            break L8;
                          } else {
                            if (!aj.field_h) {
                              break L8;
                            } else {
                              ac.field_d = ac.field_d + 64;
                              pi.field_a = pi.field_a + 128;
                              kj.field_I[var3] = false;
                              break L8;
                            }
                          }
                        }
                        var3++;
                        continue L6;
                      }
                    }
                  } else {
                    var4 = 0;
                    L9: while (true) {
                      if (var4 >= var1_int) {
                        if (var3 != 5) {
                          L10: {
                            if ((1 << var3 & k.field_b[ok.field_b]) <= 0) {
                              pa.field_s[ok.field_b][1 + var3] = false;
                              break L10;
                            } else {
                              pa.field_s[ok.field_b][1 + var3] = true;
                              break L10;
                            }
                          }
                          L11: {
                            if (var2 == 0) {
                              break L11;
                            } else {
                              if (var3 > 0) {
                                pa.field_s[ok.field_b][1 + var3] = false;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (!aj.field_h) {
                              break L12;
                            } else {
                              pa.field_s[ok.field_b][var3 - -1] = true;
                              break L12;
                            }
                          }
                          var3++;
                          continue L5;
                        } else {
                          var3++;
                          continue L5;
                        }
                      } else {
                        L13: {
                          L14: {
                            if (var2 == 0) {
                              break L14;
                            } else {
                              if (var3 > 1) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          if ((1 << var3 & pi.field_d[ok.field_b][ak.field_h]) <= 0) {
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        var4++;
                        continue L9;
                      }
                    }
                  }
                }
              } else {
                pa.field_s[var3][0] = true;
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "c.G(" + param0 + 41);
        }
    }

    final static void a(int param0, long param1) {
        if (!(param1 > 0L)) {
            return;
        }
        if (param1 % 10L != 0L) {
            nd.a(123, param1);
        } else {
            nd.a(117, -1L + param1);
            nd.a(125, 1L);
        }
        int var3 = 70 % ((param0 - -35) / 61);
    }

    final static void a(boolean param0) {
        t.field_b.a(0, 0, 0);
    }

    final static void a(String param0, int param1, boolean param2, float param3) {
        try {
            if (null == oa.field_k) {
                oa.field_k = new pe(t.field_b, jh.field_a);
                t.field_b.a((byte) 86, (ee) (Object) oa.field_k);
            }
            oa.field_k.a(param2, param0, param3, false);
            qg.b();
            int var4_int = 19;
            int discarded$0 = 0;
            c.a(true);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "c.A(" + (param0 != null ? "{...}" : "null") + 44 + 127 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_c = new ka[20][3][];
    }
}
