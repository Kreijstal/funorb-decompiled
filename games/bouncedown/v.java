/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class v {
    static w[] field_f;
    ml field_i;
    ml field_e;
    ml field_h;
    ml field_m;
    int field_g;
    long field_k;
    wi field_a;
    wi field_c;
    byte field_j;
    volatile int field_d;
    volatile int field_l;
    lf field_b;

    final int c(int param0) {
        if (param0 != -8217) {
            int discarded$0 = ((v) this).a(true);
        }
        return ((v) this).field_i.a((byte) 12) - -((v) this).field_e.a((byte) 12);
    }

    abstract boolean a(byte param0);

    final boolean b(boolean param0) {
        if (param0) {
            ((v) this).field_c = null;
        }
        return ((v) this).c(-8217) >= 20 ? true : false;
    }

    final static void d(byte param0) {
        if (!(vc.d((byte) -96))) {
            return;
        }
        nj.a(false, -25698, 4);
    }

    public static void b(int param0) {
        if (param0 != -8217) {
            return;
        }
        field_f = null;
    }

    abstract void a(byte param0, Object param1, boolean param2);

    final static int a(byte[] param0, CharSequence param1, int param2, int param3, byte param4, int param5) {
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
        var9 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (param4 == -110) {
                break L1;
              } else {
                v.b(76);
                break L1;
              }
            }
            var6_int = param2 + -param3;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6_int) {
                stackOut_68_0 = var6_int;
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param1.charAt(var7 + param3);
                      if (0 >= var8) {
                        break L5;
                      } else {
                        if (128 > var8) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var8 < 160) {
                        break L6;
                      } else {
                        if (var8 > 255) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var8 == 8364) {
                      param0[var7 + param5] = (byte) -128;
                      break L3;
                    } else {
                      if (8218 != var8) {
                        if (var8 != 402) {
                          if (var8 == 8222) {
                            param0[param5 + var7] = (byte) -124;
                            break L3;
                          } else {
                            if (var8 != 8230) {
                              if (var8 == 8224) {
                                param0[var7 + param5] = (byte) -122;
                                break L3;
                              } else {
                                if (var8 == 8225) {
                                  param0[var7 + param5] = (byte) -121;
                                  break L3;
                                } else {
                                  if (var8 != 710) {
                                    if (var8 != 8240) {
                                      if (352 == var8) {
                                        param0[param5 + var7] = (byte) -118;
                                        break L3;
                                      } else {
                                        if (8249 == var8) {
                                          param0[var7 + param5] = (byte) -117;
                                          break L3;
                                        } else {
                                          if (var8 != 338) {
                                            if (var8 == 381) {
                                              param0[param5 + var7] = (byte) -114;
                                              break L3;
                                            } else {
                                              if (var8 != 8216) {
                                                if (var8 != 8217) {
                                                  if (var8 == 8220) {
                                                    param0[param5 + var7] = (byte) -109;
                                                    break L3;
                                                  } else {
                                                    if (var8 == 8221) {
                                                      param0[param5 - -var7] = (byte) -108;
                                                      break L3;
                                                    } else {
                                                      if (var8 != 8226) {
                                                        if (8211 != var8) {
                                                          if (var8 != 8212) {
                                                            if (var8 == 732) {
                                                              param0[param5 - -var7] = (byte) -104;
                                                              break L3;
                                                            } else {
                                                              if (var8 == 8482) {
                                                                param0[var7 + param5] = (byte) -103;
                                                                break L3;
                                                              } else {
                                                                if (var8 != 353) {
                                                                  if (var8 != 8250) {
                                                                    if (var8 != 339) {
                                                                      if (var8 == 382) {
                                                                        param0[var7 + param5] = (byte) -98;
                                                                        break L3;
                                                                      } else {
                                                                        if (var8 != 376) {
                                                                          param0[var7 + param5] = (byte) 63;
                                                                          break L3;
                                                                        } else {
                                                                          param0[var7 + param5] = (byte) -97;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      param0[param5 - -var7] = (byte) -100;
                                                                      break L3;
                                                                    }
                                                                  } else {
                                                                    param0[var7 + param5] = (byte) -101;
                                                                    break L3;
                                                                  }
                                                                } else {
                                                                  param0[var7 + param5] = (byte) -102;
                                                                  break L3;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            param0[param5 - -var7] = (byte) -105;
                                                            break L3;
                                                          }
                                                        } else {
                                                          param0[var7 + param5] = (byte) -106;
                                                          break L3;
                                                        }
                                                      } else {
                                                        param0[var7 + param5] = (byte) -107;
                                                        break L3;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  param0[var7 + param5] = (byte) -110;
                                                  break L3;
                                                }
                                              } else {
                                                param0[var7 + param5] = (byte) -111;
                                                break L3;
                                              }
                                            }
                                          } else {
                                            param0[var7 + param5] = (byte) -116;
                                            break L3;
                                          }
                                        }
                                      }
                                    } else {
                                      param0[var7 + param5] = (byte) -119;
                                      break L3;
                                    }
                                  } else {
                                    param0[param5 - -var7] = (byte) -120;
                                    break L3;
                                  }
                                }
                              }
                            } else {
                              param0[param5 - -var7] = (byte) -123;
                              break L3;
                            }
                          }
                        } else {
                          param0[param5 - -var7] = (byte) -125;
                          break L3;
                        }
                      } else {
                        param0[param5 + var7] = (byte) -126;
                        break L3;
                      }
                    }
                  }
                  param0[param5 - -var7] = (byte)var8;
                  break L3;
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var6;
            stackOut_70_1 = new StringBuilder().append("v.L(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L7;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L7;
            }
          }
          L8: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(44);
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param1 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L8;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L8;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_69_0;
    }

    final boolean b(byte param0) {
        if (param0 < 32) {
            int discarded$0 = ((v) this).a(false);
        }
        return 20 <= ((v) this).a(true) ? true : false;
    }

    final lf a(int param0, byte param1, int param2, boolean param3, int param4) {
        long var6 = (long)param0 + ((long)param4 << 32);
        lf var8 = new lf();
        var8.field_s = param1;
        var8.field_j = var6;
        int var9 = 25 % ((param2 - -13) / 49);
        var8.field_m = param3 ? true : false;
        if (!param3) {
            if (!(-21 < ((v) this).a(true))) {
                throw new RuntimeException();
            }
            ((v) this).field_h.a((byte) -78, (ug) (Object) var8);
        } else {
            if (-21 <= ((v) this).c(-8217)) {
                throw new RuntimeException();
            }
            ((v) this).field_i.a((byte) -78, (ug) (Object) var8);
        }
        return var8;
    }

    final int a(boolean param0) {
        if (!param0) {
            Object var3 = null;
            int discarded$0 = v.a((byte[]) null, (CharSequence) null, 42, 22, (byte) -44, -125);
        }
        return ((v) this).field_h.a((byte) 12) - -((v) this).field_m.a((byte) 12);
    }

    abstract void a(int param0);

    abstract void c(byte param0);

    v() {
        ((v) this).field_i = new ml();
        ((v) this).field_e = new ml();
        ((v) this).field_h = new ml();
        ((v) this).field_m = new ml();
        ((v) this).field_a = new wi(6);
        ((v) this).field_j = (byte) 0;
        ((v) this).field_l = 0;
        ((v) this).field_d = 0;
        ((v) this).field_c = new wi(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_f = new w[255];
        for (var0 = 0; var0 < field_f.length; var0++) {
            field_f[var0] = new w();
        }
    }
}
