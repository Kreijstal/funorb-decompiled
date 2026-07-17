/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends wl {
    static int[] field_r;
    private int field_l;
    private int field_m;
    static boolean field_q;
    static int field_j;
    private int field_i;
    private int field_p;
    private int field_o;
    static int field_n;
    private int field_k;

    final static int d() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        var7 = wizardrun.field_H;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!ae.a(-121)) {
                L2: {
                  ga.field_d.a(rb.a(-578629823, field_n, fi.field_B), 83, rb.a(-578629823, tf.field_e, dh.field_b));
                  if (!ga.field_d.b(-1)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (ga.field_d.field_g < 0) {
                        break L4;
                      } else {
                        L5: {
                          var3 = h.field_s[ga.field_d.field_g];
                          if (var3 == 2) {
                            break L5;
                          } else {
                            if (var3 == 5) {
                              break L5;
                            } else {
                              break L3;
                            }
                          }
                        }
                        sg.a((byte) 64);
                        break L3;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (oc.field_d != 2) {
                      sg.a((byte) 64);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L6: {
                  if (var3 != 0) {
                    break L6;
                  } else {
                    if (oc.field_d != 2) {
                      break L6;
                    } else {
                      var4 = -kh.field_g + d.a((byte) 115);
                      var6 = (int)((10999L + -var4) / 1000L);
                      if (0 < var6) {
                        break L6;
                      } else {
                        var3 = 2;
                        int discarded$1 = 15991;
                        le.a(true, 5);
                        break L6;
                      }
                    }
                  }
                }
                stackOut_26_0 = var3;
                stackIn_27_0 = stackOut_26_0;
                break L0;
              } else {
                L7: {
                  ga.field_d.a(46);
                  if (ga.field_d.b(-1)) {
                    var1_int = 1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (vk.field_r == 13) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "pg.F(" + -48 + 41);
        }
        return stackIn_27_0;
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

    final static int a(int param0, byte[] param1, int param2, CharSequence param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_68_0 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var9 = wizardrun.field_H;
        try {
          L0: {
            var6_int = param5;
            var7 = 0;
            L1: while (true) {
              if (var6_int <= var7) {
                stackOut_68_0 = var6_int;
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var8 = param3.charAt(var7);
                      if (var8 <= 0) {
                        break L4;
                      } else {
                        if (var8 < 128) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var8 < 160) {
                        break L5;
                      } else {
                        if (255 < var8) {
                          break L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var8 == 8364) {
                      param1[param4 - -var7] = (byte) -128;
                      break L2;
                    } else {
                      if (var8 == 8218) {
                        param1[param4 - -var7] = (byte) -126;
                        break L2;
                      } else {
                        if (var8 != 402) {
                          if (var8 == 8222) {
                            param1[var7 + param4] = (byte) -124;
                            break L2;
                          } else {
                            if (var8 != 8230) {
                              if (var8 == 8224) {
                                param1[var7 + param4] = (byte) -122;
                                break L2;
                              } else {
                                if (var8 != 8225) {
                                  if (710 != var8) {
                                    if (var8 != 8240) {
                                      if (352 != var8) {
                                        if (8249 != var8) {
                                          if (338 != var8) {
                                            if (var8 == 381) {
                                              param1[param4 - -var7] = (byte) -114;
                                              break L2;
                                            } else {
                                              if (var8 != 8216) {
                                                if (var8 == 8217) {
                                                  param1[param4 - -var7] = (byte) -110;
                                                  break L2;
                                                } else {
                                                  if (8220 == var8) {
                                                    param1[param4 + var7] = (byte) -109;
                                                    break L2;
                                                  } else {
                                                    if (var8 != 8221) {
                                                      if (8226 == var8) {
                                                        param1[var7 + param4] = (byte) -107;
                                                        break L2;
                                                      } else {
                                                        if (var8 == 8211) {
                                                          param1[var7 + param4] = (byte) -106;
                                                          break L2;
                                                        } else {
                                                          if (8212 != var8) {
                                                            if (var8 != 732) {
                                                              if (8482 == var8) {
                                                                param1[param4 + var7] = (byte) -103;
                                                                break L2;
                                                              } else {
                                                                if (var8 != 353) {
                                                                  if (var8 != 8250) {
                                                                    if (var8 != 339) {
                                                                      if (382 != var8) {
                                                                        if (var8 == 376) {
                                                                          param1[param4 + var7] = (byte) -97;
                                                                          break L2;
                                                                        } else {
                                                                          param1[var7 + param4] = (byte) 63;
                                                                          break L2;
                                                                        }
                                                                      } else {
                                                                        param1[var7 + param4] = (byte) -98;
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      param1[param4 + var7] = (byte) -100;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    param1[param4 + var7] = (byte) -101;
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  param1[var7 + param4] = (byte) -102;
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              param1[param4 - -var7] = (byte) -104;
                                                              break L2;
                                                            }
                                                          } else {
                                                            param1[var7 + param4] = (byte) -105;
                                                            break L2;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      param1[var7 + param4] = (byte) -108;
                                                      break L2;
                                                    }
                                                  }
                                                }
                                              } else {
                                                param1[var7 + param4] = (byte) -111;
                                                break L2;
                                              }
                                            }
                                          } else {
                                            param1[var7 + param4] = (byte) -116;
                                            break L2;
                                          }
                                        } else {
                                          param1[param4 - -var7] = (byte) -117;
                                          break L2;
                                        }
                                      } else {
                                        param1[param4 - -var7] = (byte) -118;
                                        break L2;
                                      }
                                    } else {
                                      param1[param4 + var7] = (byte) -119;
                                      break L2;
                                    }
                                  } else {
                                    param1[var7 + param4] = (byte) -120;
                                    break L2;
                                  }
                                } else {
                                  param1[var7 + param4] = (byte) -121;
                                  break L2;
                                }
                              }
                            } else {
                              param1[var7 + param4] = (byte) -123;
                              break L2;
                            }
                          }
                        } else {
                          param1[param4 + var7] = (byte) -125;
                          break L2;
                        }
                      }
                    }
                  }
                  param1[var7 + param4] = (byte)var8;
                  break L2;
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var6;
            stackOut_70_1 = new StringBuilder().append("pg.G(").append(8220).append(44);
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L6;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L6;
            }
          }
          L7: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(44).append(0).append(44);
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param3 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L7;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L7;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_69_0;
    }

    final static void a(int param0) {
        hg.field_b = null;
        mh.field_ob = null;
    }

    public static void e() {
        field_r = null;
    }

    final static void a(int param0, boolean param1, pg param2) {
        mg var5 = null;
        int var4 = 0;
        try {
            var5 = n.field_b;
            var5.c((byte) 92, param0);
            var5.field_m = var5.field_m + 1;
            var4 = var5.field_m;
            var5.b((byte) 11, 1);
            var5.b((byte) 11, param2.field_o);
            var5.b((byte) 11, param2.field_m);
            var5.f(param2.field_l, 613003928);
            var5.f(param2.field_i, 613003928);
            var5.f(param2.field_p, 613003928);
            var5.f(param2.field_k, 613003928);
            int discarded$0 = var5.e(var4, -1182887024);
            var5.a(-var4 + var5.field_m, -117);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "pg.A(" + param0 + 44 + 1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a() {
        td.field_f.c((ub) (Object) new ki(), -123);
    }

    pg(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((pg) this).field_k = param5;
        ((pg) this).field_l = param2;
        ((pg) this).field_i = param3;
        ((pg) this).field_m = param1;
        ((pg) this).field_o = param0;
        ((pg) this).field_p = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new int[8192];
        field_n = 0;
    }
}
