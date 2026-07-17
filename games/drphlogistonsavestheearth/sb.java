/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    private int field_f;
    private int field_b;
    private uf[] field_j;
    static bl field_d;
    static vj field_g;
    float field_a;
    static vj field_i;
    private int field_e;
    String field_h;
    private static long[] field_c;

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (af.field_b >= 10) {
          if (gf.field_G) {
            return false;
          } else {
            L0: {
              int discarded$6 = 64;
              if (n.a()) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return false;
        }
    }

    final boolean a(int param0) {
        uf var2 = null;
        int var3 = 0;
        uf var4 = null;
        uf var5 = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 == -11255) {
          L0: while (true) {
            if (((sb) this).field_e < ((sb) this).field_f) {
              var5 = ((sb) this).field_j[((sb) this).field_e];
              var4 = var5;
              var2 = var4;
              if (!var5.field_b.a(0)) {
                int discarded$4 = 52;
                this.a(var2, 0);
                return false;
              } else {
                L1: {
                  if (var5.field_l < 0) {
                    break L1;
                  } else {
                    if (!var5.field_b.c(var5.field_l, 29691)) {
                      int discarded$5 = 52;
                      this.a(var2, var5.field_b.a(24, var5.field_l));
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (var5.field_h == null) {
                    break L2;
                  } else {
                    if (!var5.field_b.a(255, var5.field_h)) {
                      int discarded$6 = 52;
                      this.a(var2, var5.field_b.b(10461, var5.field_h));
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (0 <= var5.field_l) {
                    break L3;
                  } else {
                    if (var5.field_h != null) {
                      break L3;
                    } else {
                      if (null == var5.field_g) {
                        break L3;
                      } else {
                        if (!var5.field_b.c((byte) 66)) {
                          int discarded$7 = 52;
                          this.a(var2, var5.field_b.d((byte) 95));
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ((sb) this).field_e = ((sb) this).field_e + 1;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    private final void a(uf param0, int param1) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4_float = (float)(1 + ((sb) this).field_e) + (float)param1 / 100.0f;
            if (0 == param1) {
              ((sb) this).field_h = param0.field_e;
              break L0;
            } else {
              ((sb) this).field_h = param0.field_g + " - " + param1 + "%";
              break L0;
            }
          }
          ((sb) this).field_a = var4_float * (float)((sb) this).field_b / (float)(1 + ((sb) this).field_f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("sb.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + 52 + 41);
        }
    }

    public static void a() {
        field_d = null;
        field_g = null;
        field_i = null;
        field_c = null;
    }

    private sb() throws Throwable {
        throw new Error();
    }

    final static void b() {
        int discarded$7 = 6;
        af.b();
        if (n.field_g != null) {
          L0: {
            hb.a(-5, n.field_g);
            int discarded$8 = -19495;
            oe.b();
            de.e(-86);
            int discarded$9 = -120;
            oi.b();
            if (DrPhlogistonSavesTheEarth.t(18137)) {
              nj.field_p.d(1, -18392);
              qj.a(0, 14656);
              break L0;
            } else {
              break L0;
            }
          }
          int discarded$10 = 126;
          eg.a();
          return;
        } else {
          L1: {
            int discarded$11 = -19495;
            oe.b();
            de.e(-86);
            int discarded$12 = -120;
            oi.b();
            if (DrPhlogistonSavesTheEarth.t(18137)) {
              nj.field_p.d(1, -18392);
              qj.a(0, 14656);
              break L1;
            } else {
              break L1;
            }
          }
          int discarded$13 = 126;
          eg.a();
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_c = new long[256];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_c[var2] = var0;
                var2++;
                continue L0;
              } else {
                L2: {
                  if (1L == (1L & var0)) {
                    var0 = var0 >>> 1 ^ -3932672073523589310L;
                    var3++;
                    break L2;
                  } else {
                    var0 = var0 >>> 1;
                    var3++;
                    break L2;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        }
    }
}
