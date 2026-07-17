/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb {
    private int field_b;
    private int field_e;
    private int field_a;
    private int[] field_c;
    private int field_d;
    private int[] field_f;
    static uf field_h;
    static bc field_g;

    final int b(byte param0) {
        if (((qb) this).field_b != 0) {
          if (param0 != 123) {
            ((qb) this).field_b = 27;
            int fieldTemp$4 = ((qb) this).field_b - 1;
            ((qb) this).field_b = ((qb) this).field_b - 1;
            return ((qb) this).field_f[fieldTemp$4];
          } else {
            int fieldTemp$5 = ((qb) this).field_b - 1;
            ((qb) this).field_b = ((qb) this).field_b - 1;
            return ((qb) this).field_f[fieldTemp$5];
          }
        } else {
          this.a(4094);
          ((qb) this).field_b = 256;
          if (param0 == 123) {
            int fieldTemp$6 = ((qb) this).field_b - 1;
            ((qb) this).field_b = ((qb) this).field_b - 1;
            return ((qb) this).field_f[fieldTemp$6];
          } else {
            ((qb) this).field_b = 27;
            int fieldTemp$7 = ((qb) this).field_b - 1;
            ((qb) this).field_b = ((qb) this).field_b - 1;
            return ((qb) this).field_f[fieldTemp$7];
          }
        }
    }

    final static int a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = Bounce.field_N;
        var1 = (int)(11.0 * Math.random());
        if (var1 != 10) {
          var2 = ne.field_w;
          if (var2 == 0) {
            return 0;
          } else {
            if (var2 != 1) {
              if (var2 != 2) {
                if (var2 == 3) {
                  if (var1 <= 7) {
                    if (var1 == 1) {
                      return 2;
                    } else {
                      if (2 != var1) {
                        if (var1 == 3) {
                          return 3;
                        } else {
                          if (var1 != 4) {
                            if (var1 == 5) {
                              return 4;
                            } else {
                              if (var1 != 6) {
                                return 0;
                              } else {
                                return 4;
                              }
                            }
                          } else {
                            return 3;
                          }
                        }
                      } else {
                        return 2;
                      }
                    }
                  } else {
                    return 1;
                  }
                } else {
                  if (var2 == 4) {
                    return var1 % 2 + 3;
                  } else {
                    if (var2 == 5) {
                      if (var1 > 2) {
                        return 2;
                      } else {
                        return 0;
                      }
                    } else {
                      if (var2 != 6) {
                        if (var2 != 7) {
                          if (8 == var2) {
                            return (int)(Math.random() * 4.0);
                          } else {
                            if (var2 != 9) {
                              return 0;
                            } else {
                              ne.field_w = 0;
                              return 0;
                            }
                          }
                        } else {
                          return 2;
                        }
                      } else {
                        if (var1 <= 3) {
                          return 2;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                }
              } else {
                if (var1 > 3) {
                  if (7 >= var1) {
                    return 1;
                  } else {
                    if (7 >= var1) {
                      return 0;
                    } else {
                      return 2;
                    }
                  }
                } else {
                  if (7 >= var1) {
                    return 0;
                  } else {
                    return 2;
                  }
                }
              }
            } else {
              if (6 >= var1) {
                return 0;
              } else {
                return 1;
              }
            }
          }
        } else {
          return 5;
        }
    }

    final static void a(boolean param0, int param1) {
        l.a(param0, false, 22);
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_16_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_15_0 = 0;
            if (param0 <= jc.field_g.field_h) {
              return true;
            } else {
              if (dh.field_a == null) {
                return false;
              } else {
                try {
                  L0: {
                    var2_int = dh.field_a.d(param1 ^ param1);
                    if (0 < var2_int) {
                      L1: {
                        if (-jc.field_g.field_h + param0 < var2_int) {
                          var2_int = -jc.field_g.field_h + param0;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      dh.field_a.a(jc.field_g.field_i, true, var2_int, jc.field_g.field_h);
                      qe.field_k = fa.a(-96);
                      jc.field_g.field_h = jc.field_g.field_h + var2_int;
                      if (jc.field_g.field_h < param0) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      } else {
                        jc.field_g.field_h = 0;
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      }
                    } else {
                      if (var2_int < 0) {
                        int discarded$6 = 18;
                        kc.a();
                        return false;
                      } else {
                        if (ph.a((byte) -111) <= 30000L) {
                          break L0;
                        } else {
                          int discarded$7 = 18;
                          kc.a();
                          return false;
                        }
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  int discarded$8 = 18;
                  kc.a();
                  return false;
                }
                return false;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            if (nd.a(param1, 60)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              int discarded$17 = -12;
              if (ab.a(param1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                if (hc.b(param1, 0)) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                } else {
                  L1: {
                    if (param0 < -122) {
                      break L1;
                    } else {
                      boolean discarded$18 = qb.a(-112, 114);
                      break L1;
                    }
                  }
                  if (param2.length() == 0) {
                    stackOut_16_0 = 1;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0 != 0;
                  } else {
                    if (pf.a(128, param1, param2)) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0 != 0;
                    } else {
                      if (!ee.a(-1, param2, param1)) {
                        int discarded$19 = 8;
                        if (!ah.a(param1, param2)) {
                          stackOut_28_0 = 1;
                          stackIn_29_0 = stackOut_28_0;
                          break L0;
                        } else {
                          stackOut_26_0 = 0;
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0 != 0;
                        }
                      } else {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        return stackIn_24_0 != 0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var3;
            stackOut_30_1 = new StringBuilder().append("qb.F(").append(param0).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L2;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L2;
            }
          }
          L3: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L3;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
        }
        return stackIn_29_0 != 0;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Bounce.field_N;
        int fieldTemp$3 = ((qb) this).field_a + 1;
        ((qb) this).field_a = ((qb) this).field_a + 1;
        ((qb) this).field_e = ((qb) this).field_e + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (var2 < 256) {
            L1: {
              var3 = ((qb) this).field_c[var2];
              if ((var2 & 2) != 0) {
                if ((var2 & 1) != 0) {
                  ((qb) this).field_d = ((qb) this).field_d ^ ((qb) this).field_d >>> 16;
                  break L1;
                } else {
                  ((qb) this).field_d = ((qb) this).field_d ^ ((qb) this).field_d << 2;
                  break L1;
                }
              } else {
                if ((1 & var2) == 0) {
                  ((qb) this).field_d = ((qb) this).field_d ^ ((qb) this).field_d << 13;
                  break L1;
                } else {
                  ((qb) this).field_d = ((qb) this).field_d ^ ((qb) this).field_d >>> 6;
                  break L1;
                }
              }
            }
            ((qb) this).field_d = ((qb) this).field_d + ((qb) this).field_c[255 & var2 - -128];
            int dupTemp$4 = ((qb) this).field_e + ((qb) this).field_c[da.b(1020, var3) >> 2] - -((qb) this).field_d;
            var4 = dupTemp$4;
            ((qb) this).field_c[var2] = dupTemp$4;
            int dupTemp$5 = ((qb) this).field_c[da.b(255, var4 >> 8 >> 2)] - -var3;
            ((qb) this).field_e = dupTemp$5;
            ((qb) this).field_f[var2] = dupTemp$5;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    public static void a() {
        field_h = null;
        field_g = null;
    }

    private final void b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Bounce.field_N;
        var5 = -1640531527;
        var7 = -1640531527;
        var3 = -1640531527;
        var4 = -1640531527;
        var6 = -1640531527;
        var9 = -1640531527;
        var8 = -1640531527;
        var10 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                qb.a(false, 81);
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.a(4094);
                    ((qb) this).field_b = 256;
                    return;
                  } else {
                    var7 = var7 + ((qb) this).field_c[4 + var2];
                    var6 = var6 + ((qb) this).field_c[3 + var2];
                    var4 = var4 + ((qb) this).field_c[1 + var2];
                    var10 = var10 + ((qb) this).field_c[7 + var2];
                    var5 = var5 + ((qb) this).field_c[var2 + 2];
                    var3 = var3 + ((qb) this).field_c[var2];
                    var9 = var9 + ((qb) this).field_c[6 + var2];
                    var8 = var8 + ((qb) this).field_c[var2 - -5];
                    var3 = var3 ^ var4 << 11;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 2;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 8;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 16;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 10;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> 4;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 8;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 9;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((qb) this).field_c[var2] = var3;
                    ((qb) this).field_c[var2 - -1] = var4;
                    ((qb) this).field_c[var2 - -2] = var5;
                    ((qb) this).field_c[var2 - -3] = var6;
                    ((qb) this).field_c[var2 + 4] = var7;
                    ((qb) this).field_c[var2 + 5] = var8;
                    ((qb) this).field_c[var2 + 6] = var9;
                    ((qb) this).field_c[7 + var2] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var3 = var3 + ((qb) this).field_f[var2];
                var5 = var5 + ((qb) this).field_f[var2 - -2];
                var7 = var7 + ((qb) this).field_f[4 + var2];
                var10 = var10 + ((qb) this).field_f[var2 + 7];
                var8 = var8 + ((qb) this).field_f[var2 - -5];
                var4 = var4 + ((qb) this).field_f[1 + var2];
                var9 = var9 + ((qb) this).field_f[6 + var2];
                var6 = var6 + ((qb) this).field_f[3 + var2];
                var3 = var3 ^ var4 << 11;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> 2;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << 8;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> 16;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << 10;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> 4;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 8;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> 9;
                var5 = var5 + var10;
                var3 = var3 + var4;
                ((qb) this).field_c[var2] = var3;
                ((qb) this).field_c[1 + var2] = var4;
                ((qb) this).field_c[var2 + 2] = var5;
                ((qb) this).field_c[var2 - -3] = var6;
                ((qb) this).field_c[var2 - -4] = var7;
                ((qb) this).field_c[5 + var2] = var8;
                ((qb) this).field_c[var2 - -6] = var9;
                ((qb) this).field_c[7 + var2] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << 11;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 2;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 8;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 16;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 10;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 4;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << 8;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 9;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L0;
          }
        }
    }

    qb(int[] param0) {
        int var2_int = 0;
        try {
            ((qb) this).field_f = new int[256];
            ((qb) this).field_c = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((qb) this).field_f[var2_int] = param0[var2_int];
            }
            int discarded$0 = 0;
            this.b();
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "qb.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new uf();
        field_g = new bc();
    }
}
