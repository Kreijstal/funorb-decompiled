/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static int field_a;

    final static byte[] a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        dh var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] stackIn_19_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        try {
          L0: {
            L1: {
              var9 = new dh(param1);
              var3 = var9.a(-16384);
              var4 = var9.f((byte) -107);
              if (0 > var4) {
                break L1;
              } else {
                L2: {
                  if (-1 == (eg.field_h ^ -1)) {
                    break L2;
                  } else {
                    if (var4 <= eg.field_h) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if ((var3 ^ -1) == param0) {
                  var13 = new byte[var4];
                  var11 = var13;
                  var5 = var11;
                  var9.a(var4, 0, 93, var13);
                  stackIn_21_0 = (byte[]) (var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var5_int = var9.f((byte) -107);
                    if (-1 < (var5_int ^ -1)) {
                      break L3;
                    } else {
                      L4: {
                        if (eg.field_h == 0) {
                          break L4;
                        } else {
                          if (eg.field_h >= var5_int) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        var12 = new byte[var5_int];
                        var10 = var12;
                        var6 = var10;
                        if (var3 != 1) {
                          var7 = wj.field_c;
                          synchronized (var7) {
                            L6: {
                              wj.field_c.a(var9, 10, var12);
                              break L6;
                            }
                          }
                          break L5;
                        } else {
                          ih.a(var12, var5_int, param1, var4, 9);
                          break L5;
                        }
                      }
                      stackIn_19_0 = (byte[]) (var6);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("qg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0;
        } else {
          return stackIn_21_0;
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[][] fieldTemp$4 = null;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int dupTemp$8 = 0;
        byte[][] arrayValue$9 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        L0: {
          if ((param1 ^ -1) != -101) {
            break L0;
          } else {
            if (0 >= nl.field_b) {
              break L0;
            } else {
              fieldTemp$4 = il.field_b;
              fieldTemp$5 = nl.field_b - 1;
              nl.field_b = nl.field_b - 1;
              var2_ref_byte__ = fieldTemp$4[fieldTemp$5];
              il.field_b[nl.field_b] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (-5001 != (param1 ^ -1)) {
            break L1;
          } else {
            if ((mg.field_o ^ -1) >= -1) {
              break L1;
            } else {
              fieldTemp$6 = mg.field_o - 1;
              mg.field_o = mg.field_o - 1;
              var2_ref_byte__ = na.field_Z[fieldTemp$6];
              na.field_Z[mg.field_o] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (param1 != 30000) {
            break L2;
          } else {
            if (g.field_cb > 0) {
              fieldTemp$7 = g.field_cb - 1;
              g.field_cb = g.field_cb - 1;
              var2_ref_byte__ = dg.field_e[fieldTemp$7];
              dg.field_e[g.field_cb] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null != ol.field_Kb) {
            var2 = 0;
            L4: while (true) {
              if (tc.field_c.length <= var2) {
                break L3;
              } else {
                if (param1 == tc.field_c[var2]) {
                  if (ba.field_g[var2] > 0) {
                    dupTemp$8 = ba.field_g[var2] - 1;
                    arrayValue$9 = ol.field_Kb[var2];
                    ba.field_g[var2] = dupTemp$8;
                    var3 = arrayValue$9[dupTemp$8];
                    ol.field_Kb[var2][ba.field_g[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L4;
                  }
                } else {
                  var2++;
                  continue L4;
                }
              }
            }
          } else {
            break L3;
          }
        }
        L5: {
          if (param0 > 19) {
            break L5;
          } else {
            field_a = -93;
            break L5;
          }
        }
        return new byte[param1];
    }

    final static ud a(byte param0, fa param1, String param2, fa param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ud stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = param3.c(-1, param2);
              if (param0 == 94) {
                break L1;
              } else {
                qg.a(83, -23);
                break L1;
              }
            }
            var6 = param3.a(-128, var5_int, param4);
            stackIn_3_0 = wl.a(param1, var5_int, param3, var6, -121);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("qg.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(ci param0, int param1, byte param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        var19 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              param5 = param5 + param4;
              param1 = param1 + param0.field_p;
              param4 = param4 - (-15 + param0.field_u);
              param4 = param4 + param0.field_v;
              var6_int = param1 - -(l.field_k * param4);
              var7 = 0;
              var8 = param1;
              var9 = param4;
              var10 = param0.field_t;
              var11 = param0.field_r;
              var12 = -var11 + l.field_k;
              if (param4 >= l.field_d) {
                break L1;
              } else {
                var14 = l.field_d + -param4;
                var10 = var10 - var14;
                var7 = var7 + var14 * var11;
                var6_int = var6_int + l.field_k * var14;
                param4 = l.field_d;
                var9 = var9 + var14;
                break L1;
              }
            }
            L2: {
              var13 = 0;
              if (param1 < l.field_b) {
                var14 = -param1 + l.field_b;
                var6_int = var6_int + var14;
                var12 = var12 + var14;
                param1 = l.field_b;
                var13 = var13 + var14;
                var8 = var8 + var14;
                var7 = var7 + var14;
                var11 = var11 - var14;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param4 + var10 > l.field_c) {
                var10 = var10 - (-l.field_c + (param4 - -var10));
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var11 + param1 > l.field_f) {
                var14 = -l.field_f + var11 + param1;
                var13 = var13 + var14;
                var12 = var12 + var14;
                var11 = var11 - var14;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param2 == 0) {
                break L5;
              } else {
                qg.a(113, 32);
                break L5;
              }
            }
            L6: {
              if ((var11 ^ -1) >= -1) {
                break L6;
              } else {
                if (var10 <= 0) {
                  break L6;
                } else {
                  var14 = var8;
                  var16 = -(var11 >> 2071108034);
                  var11 = -(var11 & 3);
                  var17 = -var10;
                  L7: while (true) {
                    if ((var17 ^ -1) <= -1) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var18 = var16;
                      L8: while (true) {
                        if (0 <= var18) {
                          var8 = var14;
                          var18 = var11;
                          L9: while (true) {
                            if (var18 >= 0) {
                              L10: {
                                var9++;
                                if (param0.field_t + (param4 - 15) <= var9) {
                                  param5++;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              var7 = var7 + var13;
                              var6_int = var6_int + var12;
                              var17++;
                              continue L7;
                            } else {
                              L11: {
                                incrementValue$0 = var7;
                                var7++;
                                var15 = param0.field_z[incrementValue$0];
                                if (0 == var15) {
                                  var6_int++;
                                  break L11;
                                } else {
                                  incrementValue$1 = var6_int;
                                  var6_int++;
                                  pj.a((byte) 106, true, param3, var15, incrementValue$1);
                                  break L11;
                                }
                              }
                              var18++;
                              continue L9;
                            }
                          }
                        } else {
                          L12: {
                            L13: {
                              incrementValue$2 = var7;
                              var7++;
                              var15 = param0.field_z[incrementValue$2];
                              if (-1 == (var15 ^ -1)) {
                                break L13;
                              } else {
                                if (gd.field_a[var8][var9] > param5) {
                                  break L13;
                                } else {
                                  incrementValue$3 = var8;
                                  var8++;
                                  gd.field_a[incrementValue$3][var9] = param5;
                                  incrementValue$4 = var6_int;
                                  var6_int++;
                                  pj.a((byte) 95, true, param3, var15, incrementValue$4);
                                  break L12;
                                }
                              }
                            }
                            var8++;
                            var6_int++;
                            break L12;
                          }
                          L14: {
                            L15: {
                              incrementValue$5 = var7;
                              var7++;
                              var15 = param0.field_z[incrementValue$5];
                              if (-1 == (var15 ^ -1)) {
                                break L15;
                              } else {
                                if (param5 < gd.field_a[var8][var9]) {
                                  break L15;
                                } else {
                                  incrementValue$6 = var8;
                                  var8++;
                                  gd.field_a[incrementValue$6][var9] = param5;
                                  incrementValue$7 = var6_int;
                                  var6_int++;
                                  pj.a((byte) 57, true, param3, var15, incrementValue$7);
                                  break L14;
                                }
                              }
                            }
                            var8++;
                            var6_int++;
                            break L14;
                          }
                          L16: {
                            L17: {
                              incrementValue$8 = var7;
                              var7++;
                              var15 = param0.field_z[incrementValue$8];
                              if (-1 == (var15 ^ -1)) {
                                break L17;
                              } else {
                                if (param5 >= gd.field_a[var8][var9]) {
                                  incrementValue$9 = var8;
                                  var8++;
                                  gd.field_a[incrementValue$9][var9] = param5;
                                  incrementValue$10 = var6_int;
                                  var6_int++;
                                  pj.a((byte) 50, true, param3, var15, incrementValue$10);
                                  break L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            var8++;
                            var6_int++;
                            break L16;
                          }
                          L18: {
                            L19: {
                              incrementValue$11 = var7;
                              var7++;
                              var15 = param0.field_z[incrementValue$11];
                              if (0 == var15) {
                                break L19;
                              } else {
                                if (param5 < gd.field_a[var8][var9]) {
                                  break L19;
                                } else {
                                  incrementValue$12 = var8;
                                  var8++;
                                  gd.field_a[incrementValue$12][var9] = param5;
                                  incrementValue$13 = var6_int;
                                  var6_int++;
                                  pj.a((byte) 40, true, param3, var15, incrementValue$13);
                                  break L18;
                                }
                              }
                            }
                            var6_int++;
                            var8++;
                            break L18;
                          }
                          var18++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackIn_53_0 = (RuntimeException) (var6);

            stackIn_53_1 = new StringBuilder().append("qg.B(");

            if (param0 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L20;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L20;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_a = 0;
    }
}
