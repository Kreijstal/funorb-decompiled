/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    String field_l;
    static sj field_e;
    String field_g;
    int field_d;
    bj field_j;
    static String field_a;
    static ta field_k;
    String field_m;
    static ea field_h;
    private static int[] field_c;
    static char[] field_n;
    static ta field_b;
    static hg field_f;
    static hg field_o;
    static bj field_i;

    final static String a(byte param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        String stackIn_25_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        byte stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        String stackOut_24_0 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              L2: {
                var1_ref = "(" + lc.field_s + " " + rd.field_a + " " + ud.field_a + ") " + oj.field_K;
                if (rj.field_d <= 0) {
                  break L2;
                } else {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L3: while (true) {
                    if (~rj.field_d >= ~var2) {
                      break L2;
                    } else {
                      var1_ref = var1_ref + ' ';
                      var3 = kj.field_a.field_u[var2] & 255;
                      var4 = var3 >> 347664612;
                      var3 = var3 & 15;
                      stackOut_4_0 = var4;
                      stackOut_4_1 = 10;
                      stackIn_21_0 = stackOut_4_0;
                      stackIn_21_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_5_0 >= stackIn_5_1) {
                              break L5;
                            } else {
                              var4 += 48;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var4 += 55;
                          break L4;
                        }
                        L6: {
                          L7: {
                            if (var3 < 10) {
                              break L7;
                            } else {
                              var3 += 55;
                              if (var5 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var3 += 48;
                          break L6;
                        }
                        var1_ref = var1_ref + (char)var4;
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_20_0 = param0;
              stackOut_20_1 = 48;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              break L1;
            }
            L8: {
              if (stackIn_21_0 > stackIn_21_1) {
                break L8;
              } else {
                field_e = null;
                break L8;
              }
            }
            stackOut_24_0 = (String) var1_ref;
            stackIn_25_0 = stackOut_24_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "hj.C(" + param0 + ')');
        }
        return stackIn_25_0;
    }

    final static void a(bj param0, int param1) {
        RuntimeException var2 = null;
        ld var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        pb var5 = null;
        int[] var6 = null;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param1 == 347664612) {
              var2_ref = new ld(param0.a("", 0, "logo.fo3d"));
              var3 = var2_ref.d((byte) -54);
              var2_ref.f((byte) 16);
              bl.field_v = tk.a(-123, var2_ref);
              aj.field_b = new pb[var3];
              pa.field_b = new int[var3][];
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var4 <= ~var3) {
                      break L3;
                    } else {
                      aj.field_b[var4] = lj.a(var2_ref, (byte) -62);
                      var4++;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var2_ref.o(-98);
                  break L2;
                }
                var4 = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      if (var3 <= var4) {
                        break L6;
                      } else {
                        var5 = aj.field_b[var4];
                        var5.a(1, 6, 6, 6, (byte) -81);
                        var5.a(true);
                        var6 = new int[]{var5.field_v + var5.field_H >> 130271905, var5.field_h + var5.field_l >> 1490739201, var5.field_J + var5.field_j >> -111880767};
                        pa.field_b[var4] = var6;
                        var5.a(-var6[2], -var6[1], 0, -var6[0]);
                        var4++;
                        if (var7 != 0) {
                          break L5;
                        } else {
                          if (var7 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    break L5;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("hj.B(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L7;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_i = null;
              field_a = null;
              if (!param0) {
                break L1;
              } else {
                hj.a(false);
                break L1;
              }
            }
            field_c = null;
            field_b = null;
            field_n = null;
            field_o = null;
            field_k = null;
            field_e = null;
            field_h = null;
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "hj.A(" + param0 + ')');
        }
    }

    private hj() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "hj.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        field_e = new sj("usename");
        field_a = "Just play";
        field_k = new ta();
        field_c = new int[98304];
        var0 = 92682;
        L0: while (true) {
          if (var0 < 46341) {
            field_n = new char[128];
            field_b = new ta();
            return;
          } else {
            L1: {
              var4 = (long)(-1 + (var0 << 1678240737));
              var6 = (long)((var0 << -922672735) - -1);
              var2 = (int)((var4 * var4 >> -884165806) + -32768L);
              var3 = (int)((var6 * var6 >> -2085222830) - 32768L);
              if (~field_c.length < ~var3) {
                break L1;
              } else {
                var3 = -1 + field_c.length;
                break L1;
              }
            }
            L2: {
              if (var2 < 0) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_5_0 = var2;
                stackIn_8_0 = stackOut_5_0;
                break L2;
              }
            }
            var1 = stackIn_8_0;
            L3: while (true) {
              if (var3 < var1) {
                var0--;
                continue L0;
              } else {
                field_c[var1] = var0;
                var1++;
                continue L3;
              }
            }
          }
        }
    }
}
