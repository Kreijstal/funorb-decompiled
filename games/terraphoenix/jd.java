/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends vc {
    private int field_j;
    private long[] field_l;
    private long field_k;
    static String field_i;
    private int field_m;
    private long field_n;
    private long field_h;

    final static void a(int param0, fa param1, fa param2) {
        try {
            if (param0 < 106) {
                Object var4 = null;
                jd.a(-74, (fa) null, (fa) null);
            }
            sj.field_f = param1;
            dm.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "jd.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final long a(int param0) {
        ((jd) this).field_n = ((jd) this).field_n + this.a((byte) -82);
        if (param0 <= 39) {
            return 8L;
        }
        if (!(((jd) this).field_n >= ((jd) this).field_k)) {
            return (-((jd) this).field_n + ((jd) this).field_k) / 1000000L;
        }
        return 0L;
    }

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        if (param0 == 0) {
          if (((jd) this).field_n < ((jd) this).field_k) {
            ((jd) this).field_h = ((jd) this).field_h + (((jd) this).field_k - ((jd) this).field_n);
            ((jd) this).field_n = ((jd) this).field_n + (((jd) this).field_k + -((jd) this).field_n);
            ((jd) this).field_k = ((jd) this).field_k + param1;
            return 1;
          } else {
            var4 = 0;
            L0: while (true) {
              L1: {
                ((jd) this).field_k = ((jd) this).field_k + param1;
                var4++;
                if (10 <= var4) {
                  break L1;
                } else {
                  if (~((jd) this).field_n < ~((jd) this).field_k) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (((jd) this).field_k >= ((jd) this).field_n) {
                  break L2;
                } else {
                  ((jd) this).field_k = ((jd) this).field_n;
                  break L2;
                }
              }
              return var4;
            }
          }
        } else {
          return 3;
        }
    }

    final static void a(boolean param0, int param1) {
        uf var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        cc var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            var4 = (cc) (Object) qb.field_a.d(9272);
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    jd.d(116);
                    break L2;
                  }
                }
                var2 = qc.field_a.d(9272);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    da.a(0, param1);
                    var2 = qc.field_a.e((byte) -119);
                    continue L3;
                  }
                }
              } else {
                ia.a(param1, var4, -118);
                var4 = (cc) (Object) qb.field_a.e((byte) -119);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2_ref, "jd.D(" + param0 + 44 + param1 + 41);
        }
    }

    private final long a(byte param0) {
        int var8 = 0;
        int var9 = Terraphoenix.field_V;
        long var2 = System.nanoTime();
        long var4 = -((jd) this).field_h + var2;
        ((jd) this).field_h = var2;
        if (var4 > -5000000000L) {
            if (!(5000000000L <= var4)) {
                ((jd) this).field_l[((jd) this).field_j] = var4;
                if (!(((jd) this).field_m >= 1)) {
                    ((jd) this).field_m = ((jd) this).field_m + 1;
                }
                ((jd) this).field_j = (1 + ((jd) this).field_j) % 10;
            }
        }
        long var6 = 0L;
        for (var8 = 1; ((jd) this).field_m >= var8; var8++) {
            var6 = var6 + ((jd) this).field_l[(10 + (((jd) this).field_j - var8)) % 10];
        }
        return var6 / (long)((jd) this).field_m;
    }

    final static void a(int param0, byte param1, boolean param2, int param3) {
        int var4 = 0;
        if (param1 >= -21) {
            jd.a(false, -74);
        }
        uf.field_f.b(param3, param0);
        if (param2) {
            var4 = 2 * (el.field_e % uf.field_f.field_r);
            if (var4 >= uf.field_f.field_r) {
                var4 = uf.field_f.field_r - var4 + uf.field_f.field_r;
            }
            if (var4 < 10) {
                var4 = 10;
            } else {
                if (!(var4 <= -40 + uf.field_f.field_r)) {
                    var4 = -40 + uf.field_f.field_r;
                }
            }
            lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4, 0, 80);
        }
    }

    final void b(int param0) {
        ((jd) this).field_h = (long)param0;
        if (~((jd) this).field_k < ~((jd) this).field_n) {
            ((jd) this).field_n = ((jd) this).field_n + (((jd) this).field_k + -((jd) this).field_n);
        }
    }

    public static void d(int param0) {
        if (param0 != 1) {
            field_i = null;
        }
        field_i = null;
    }

    final static void a(dc param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= am.field_J) {
                    int dupTemp$4 = param0.a(2);
                    je.field_a[dupTemp$4] = je.field_a[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (~var3 <= ~am.field_J) {
                        am.field_J = var2_int;
                        int fieldTemp$5 = am.field_J;
                        am.field_J = am.field_J + 1;
                        ra.field_i[fieldTemp$5] = param0;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (~param0.field_l != ~ra.field_i[var3].field_l) {
                              break L5;
                            } else {
                              var4 = ra.field_i[var3].a(2);
                              if (~bl.field_f > ~je.field_a[var4]) {
                                je.field_a[var4] = je.field_a[var4] - 1;
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          int incrementValue$6 = var2_int;
                          var2_int++;
                          ra.field_i[incrementValue$6] = ra.field_i[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (ra.field_i[var2_int].field_l == param0.field_l) {
                        int dupTemp$7 = ra.field_i[var2_int].a(2);
                        je.field_a[dupTemp$7] = je.field_a[dupTemp$7] + 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                je.field_a[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("jd.H(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + -119 + 41);
        }
    }

    jd() {
        ((jd) this).field_k = 0L;
        ((jd) this).field_l = new long[10];
        ((jd) this).field_j = 0;
        ((jd) this).field_n = 0L;
        ((jd) this).field_h = 0L;
        ((jd) this).field_m = 1;
        ((jd) this).field_n = System.nanoTime();
        ((jd) this).field_k = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "This password contains your Player Name, and would be easy to guess";
    }
}
