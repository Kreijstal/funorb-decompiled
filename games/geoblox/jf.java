/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf implements dh {
    private int field_i;
    static int field_g;
    private int field_d;
    static int[] field_b;
    private int field_e;
    static int field_j;
    static dm field_a;
    private int field_h;
    private m field_f;
    private int field_k;
    private int field_l;
    static int field_c;

    final static void a(byte param0) {
        gf.field_d = new qh();
        if (param0 < 19) {
          field_a = null;
          hk.field_C.b((el) (Object) gf.field_d, -54);
          return;
        } else {
          hk.field_C.b((el) (Object) gf.field_d, -54);
          return;
        }
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ol var12 = null;
        el stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        el stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param4 instanceof ol) {
                stackOut_3_0 = (el) param4;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (el) (Object) stackOut_2_0;
                break L1;
              }
            }
            var12 = (ol) (Object) stackIn_4_0;
            if (param1 < -5) {
              L2: {
                if (var12 == null) {
                  break L2;
                } else {
                  break L2;
                }
              }
              vb.a(param4.field_v + param0, param4.field_m + param2, param4.field_r, param4.field_h, ((jf) this).field_h);
              var7 = -(2 * var12.field_H) + param4.field_r;
              var8 = param0 - (-param4.field_v - var12.field_H);
              var9 = var12.field_G + param2 + param4.field_m;
              vb.g(var8, var9, var7 + var8, var9, ((jf) this).field_d);
              var10 = var12.a((byte) 86) - 1;
              L3: while (true) {
                if (var10 < 0) {
                  if (null == ((jf) this).field_f) {
                    break L0;
                  } else {
                    ((jf) this).field_f.b(var12.field_s, var8 - -(var7 / 2), ((jf) this).field_f.field_p + var9 + var12.field_G, ((jf) this).field_k, ((jf) this).field_l);
                    return;
                  }
                } else {
                  vb.d(var7 * var12.c(-113, var10) / var12.g(-128) + var8, var9, ((jf) this).field_i, ((jf) this).field_e);
                  var10--;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("jf.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final static java.awt.Container a(boolean param0) {
        if (sg.field_a != null) {
            return (java.awt.Container) (Object) sg.field_a;
        }
        return (java.awt.Container) (Object) k.c(122);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9) {
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var16 = Geoblox.field_C;
        try {
          L0: {
            L1: while (true) {
              param7--;
              if (param7 < 0) {
                if (param2 == 33423689) {
                  break L0;
                } else {
                  field_c = -7;
                  return;
                }
              } else {
                var17 = param9;
                var10 = var17;
                var11 = param0;
                var12 = param3;
                var13 = param5;
                var14 = param8;
                var15 = var17[var11] >> 1 & 8355711;
                var10[var11] = cd.a(255, var14 >> 17) + ((cd.a(33423689, var13) >> 9) + (cd.a(33423360, var12) >> 1)) + var15;
                param0++;
                param8 = param8 + param4;
                param3 = param3 + param1;
                param5 = param5 + param6;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var10_ref;
            stackOut_6_1 = new StringBuilder().append("jf.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param9 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    public static void b(byte param0) {
        field_a = null;
        int var1 = 0;
        field_b = null;
    }

    final static void a(dm[] param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var11 = Geoblox.field_C;
        try {
          L0: {
            if (param0 == null) {
              break L0;
            } else {
              if (param3 <= 0) {
                break L0;
              } else {
                var6_int = param0[0].field_s;
                var7 = param0[2].field_s;
                var8 = param0[1].field_s;
                param0[0].e(param2, param4, param1);
                param0[2].e(-var7 + (param2 - -param3), param4, param1);
                vb.a(da.field_d);
                vb.b(var6_int + param2, param4, -var7 + param3 + param2, param4 - -param0[1].field_o);
                var9 = param2 - -var6_int;
                var10 = -var7 + (param2 + param3);
                param2 = var9;
                L1: while (true) {
                  if (param2 >= var10) {
                    vb.b(da.field_d);
                    return;
                  } else {
                    param0[1].e(param2, param4, param1);
                    param2 = param2 + var8;
                    continue L1;
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("jf.G(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + -17154 + 41);
        }
    }

    final static byte[] a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        byte[] stackIn_70_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_69_0 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var6 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param1 >= 117) {
                break L1;
              } else {
                var7 = null;
                jf.a(25, 87, -85, 85, 111, -85, 50, 110, -77, (int[]) null);
                break L1;
              }
            }
            var2_int = param0.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_69_0 = (byte[]) var3;
                stackIn_70_0 = stackOut_69_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param0.charAt(var4);
                      if (var5 <= 0) {
                        break L5;
                      } else {
                        if (var5 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var5 < 160) {
                        break L6;
                      } else {
                        if (255 < var5) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (8364 != var5) {
                      if (var5 != 8218) {
                        if (402 != var5) {
                          if (8222 != var5) {
                            if (var5 == 8230) {
                              var3[var4] = (byte) -123;
                              break L3;
                            } else {
                              if (var5 != 8224) {
                                if (var5 != 8225) {
                                  if (var5 != 710) {
                                    if (var5 == 8240) {
                                      var3[var4] = (byte) -119;
                                      break L3;
                                    } else {
                                      if (352 == var5) {
                                        var3[var4] = (byte) -118;
                                        break L3;
                                      } else {
                                        if (8249 == var5) {
                                          var3[var4] = (byte) -117;
                                          break L3;
                                        } else {
                                          if (338 != var5) {
                                            if (var5 == 381) {
                                              var3[var4] = (byte) -114;
                                              break L3;
                                            } else {
                                              if (8216 == var5) {
                                                var3[var4] = (byte) -111;
                                                break L3;
                                              } else {
                                                if (8217 == var5) {
                                                  var3[var4] = (byte) -110;
                                                  break L3;
                                                } else {
                                                  if (var5 != 8220) {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte) -108;
                                                      break L3;
                                                    } else {
                                                      if (var5 == 8226) {
                                                        var3[var4] = (byte) -107;
                                                        break L3;
                                                      } else {
                                                        if (8211 == var5) {
                                                          var3[var4] = (byte) -106;
                                                          break L3;
                                                        } else {
                                                          if (var5 != 8212) {
                                                            if (var5 != 732) {
                                                              if (var5 != 8482) {
                                                                if (var5 != 353) {
                                                                  if (var5 == 8250) {
                                                                    var3[var4] = (byte) -101;
                                                                    break L3;
                                                                  } else {
                                                                    if (var5 == 339) {
                                                                      var3[var4] = (byte) -100;
                                                                      break L3;
                                                                    } else {
                                                                      if (var5 == 382) {
                                                                        var3[var4] = (byte) -98;
                                                                        break L3;
                                                                      } else {
                                                                        if (var5 != 376) {
                                                                          var3[var4] = (byte) 63;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte) -97;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte) -102;
                                                                  break L3;
                                                                }
                                                              } else {
                                                                var3[var4] = (byte) -103;
                                                                break L3;
                                                              }
                                                            } else {
                                                              var3[var4] = (byte) -104;
                                                              break L3;
                                                            }
                                                          } else {
                                                            var3[var4] = (byte) -105;
                                                            break L3;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var3[var4] = (byte) -109;
                                                    break L3;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var3[var4] = (byte) -116;
                                            break L3;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte) -120;
                                    break L3;
                                  }
                                } else {
                                  var3[var4] = (byte) -121;
                                  break L3;
                                }
                              } else {
                                var3[var4] = (byte) -122;
                                break L3;
                              }
                            }
                          } else {
                            var3[var4] = (byte) -124;
                            break L3;
                          }
                        } else {
                          var3[var4] = (byte) -125;
                          break L3;
                        }
                      } else {
                        var3[var4] = (byte) -126;
                        break L3;
                      }
                    } else {
                      var3[var4] = (byte) -128;
                      break L3;
                    }
                  }
                  var3[var4] = (byte)var5;
                  var4++;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var2;
            stackOut_71_1 = new StringBuilder().append("jf.C(");
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param0 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L7;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 44 + param1 + 41);
        }
        return stackIn_70_0;
    }

    jf(m param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((jf) this).field_d = param3;
            ((jf) this).field_h = param4;
            ((jf) this).field_e = param6;
            ((jf) this).field_f = param0;
            ((jf) this).field_i = param5;
            ((jf) this).field_k = param1;
            ((jf) this).field_l = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "jf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_g = 3;
    }
}
