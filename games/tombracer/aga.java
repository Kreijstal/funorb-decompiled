/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aga {
    private int field_g;
    private int field_h;
    private int field_i;
    private short[] field_b;
    static String field_a;
    private int field_e;
    ob field_c;
    private int field_f;
    int field_d;

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          var2 = ((aga) this).field_d;
          if (2 != var2) {
            if (var2 == 3) {
              ((aga) this).field_f = 1;
              ((aga) this).field_h = 2048;
              ((aga) this).field_g = 0;
              ((aga) this).field_i = 4096;
              break L0;
            } else {
              if (var2 == 4) {
                ((aga) this).field_h = 2048;
                ((aga) this).field_g = 0;
                ((aga) this).field_f = 4;
                ((aga) this).field_i = 2048;
                break L0;
              } else {
                if (5 == var2) {
                  ((aga) this).field_f = 4;
                  ((aga) this).field_h = 2048;
                  ((aga) this).field_i = 8192;
                  ((aga) this).field_g = 0;
                  break L0;
                } else {
                  if (var2 != 12) {
                    if (var2 != 13) {
                      if (var2 == 10) {
                        ((aga) this).field_h = 512;
                        ((aga) this).field_i = 2048;
                        ((aga) this).field_g = 1536;
                        ((aga) this).field_f = 3;
                        break L0;
                      } else {
                        if (var2 != 11) {
                          if (6 == var2) {
                            ((aga) this).field_g = 1280;
                            ((aga) this).field_i = 2048;
                            ((aga) this).field_h = 768;
                            ((aga) this).field_f = 3;
                            break L0;
                          } else {
                            if (var2 != 7) {
                              if (var2 != 8) {
                                if (9 != var2) {
                                  if (14 == var2) {
                                    ((aga) this).field_i = 2048;
                                    ((aga) this).field_g = 1280;
                                    ((aga) this).field_h = 768;
                                    ((aga) this).field_f = 1;
                                    break L0;
                                  } else {
                                    if (15 != var2) {
                                      if (16 == var2) {
                                        ((aga) this).field_h = 256;
                                        ((aga) this).field_g = 1792;
                                        ((aga) this).field_f = 1;
                                        ((aga) this).field_i = 8192;
                                        break L0;
                                      } else {
                                        ((aga) this).field_h = 2048;
                                        ((aga) this).field_i = 2048;
                                        ((aga) this).field_f = 0;
                                        ((aga) this).field_g = 0;
                                        break L0;
                                      }
                                    } else {
                                      ((aga) this).field_f = 1;
                                      ((aga) this).field_h = 512;
                                      ((aga) this).field_i = 4096;
                                      ((aga) this).field_g = 1536;
                                      break L0;
                                    }
                                  }
                                } else {
                                  ((aga) this).field_g = 1024;
                                  ((aga) this).field_h = 1024;
                                  ((aga) this).field_i = 4096;
                                  ((aga) this).field_f = 3;
                                  break L0;
                                }
                              } else {
                                ((aga) this).field_f = 3;
                                ((aga) this).field_g = 1024;
                                ((aga) this).field_h = 1024;
                                ((aga) this).field_i = 2048;
                                break L0;
                              }
                            } else {
                              ((aga) this).field_f = 3;
                              ((aga) this).field_h = 768;
                              ((aga) this).field_i = 4096;
                              ((aga) this).field_g = 1280;
                              break L0;
                            }
                          }
                        } else {
                          ((aga) this).field_f = 3;
                          ((aga) this).field_g = 1536;
                          ((aga) this).field_h = 512;
                          ((aga) this).field_i = 4096;
                          break L0;
                        }
                      }
                    } else {
                      ((aga) this).field_i = 8192;
                      ((aga) this).field_h = 2048;
                      ((aga) this).field_g = 0;
                      ((aga) this).field_f = 2;
                      break L0;
                    }
                  } else {
                    ((aga) this).field_g = 0;
                    ((aga) this).field_i = 2048;
                    ((aga) this).field_f = 2;
                    ((aga) this).field_h = 2048;
                    break L0;
                  }
                }
              }
            }
          } else {
            ((aga) this).field_i = 2048;
            ((aga) this).field_g = 0;
            ((aga) this).field_h = 2048;
            ((aga) this).field_f = 1;
            break L0;
          }
        }
        L1: {
          if (param0 == 87) {
            break L1;
          } else {
            this.b((byte) -61);
            break L1;
          }
        }
    }

    private final void a(int param0, int param1, ha param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((aga) this).field_c = param2.a(param5, param1, param0, param3, param6, 1.0f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8;
            stackOut_2_1 = new StringBuilder().append("aga.E(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param3 + 44 + 512 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param2 == -1814184927) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          if (param0) {
            var4 = 2048;
            break L1;
          } else {
            var5 = 2047 & param1 * ((aga) this).field_i / 50 + ((aga) this).field_e;
            var6 = ((aga) this).field_f;
            if (var6 != 1) {
              if (var6 == 3) {
                var4 = ooa.field_e[var5] >> 1;
                break L1;
              } else {
                if (4 != var6) {
                  if (var6 == 2) {
                    var4 = var5;
                    break L1;
                  } else {
                    if (5 == var6) {
                      L2: {
                        if (var5 >= 1024) {
                          stackOut_17_0 = 2048 + -var5;
                          stackIn_18_0 = stackOut_17_0;
                          break L2;
                        } else {
                          stackOut_16_0 = var5;
                          stackIn_18_0 = stackOut_16_0;
                          break L2;
                        }
                      }
                      var4 = stackIn_18_0 << 1;
                      break L1;
                    } else {
                      var4 = 2048;
                      break L1;
                    }
                  }
                } else {
                  var4 = var5 >> 10 << 11;
                  break L1;
                }
              }
            } else {
              var4 = 1024 - -(qu.field_b[var5 << 3] >> 4);
              break L1;
            }
          }
        }
        ((aga) this).field_c.a((byte) 105, (float)((var4 * ((aga) this).field_h >> 11) + ((aga) this).field_g) / 2048.0f);
    }

    public static void a() {
        field_a = null;
    }

    final static nl[] a(int param0) {
        return new nl[]{vw.field_a, ub.field_d, npa.field_f};
    }

    final static g a(boolean param0, int param1) {
        qg[] var2 = null;
        int var3 = 0;
        qg var4 = null;
        g[] var5 = null;
        int var6 = 0;
        g var7 = null;
        int var8 = 0;
        qg[] var9 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        var9 = cm.field_a;
        var2 = var9;
        var3 = 0;
        L0: while (true) {
          if (var9.length > var3) {
            var4 = var9[var3];
            var5 = var4.field_c;
            var6 = 0;
            L1: while (true) {
              if (var5.length <= var6) {
                var3++;
                continue L0;
              } else {
                var7 = var5[var6];
                if (param1 != var7.field_a) {
                  var6++;
                  continue L1;
                } else {
                  return var7;
                }
              }
            }
          } else {
            return null;
          }
        }
    }

    private final void a(int param0, byte param1) {
        if (param1 != -42) {
            this.a(32, (byte) 21);
        }
        ((aga) this).field_d = param0;
        this.b((byte) 87);
    }

    aga(ha param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9_int = 0;
        int var10 = 0;
        try {
            if (ooa.field_e == null) {
                int discarded$0 = 2;
                pd.b();
            }
            this.a(param4, param3, param0, param6, 512, param2, param5);
            var9_int = (-ri.field_q + 2 * param6 >> cn.field_b) + 1;
            ((aga) this).field_b = new short[var9_int];
            for (var10 = 0; var10 < ((aga) this).field_b.length; var10++) {
                ((aga) this).field_b[var10] = (short)var9_int;
            }
            this.a(param7, (byte) -42);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "aga.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You have 1 unread message!";
    }
}
