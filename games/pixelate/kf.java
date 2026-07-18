/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends bg {
    private int field_r;
    static int field_q;
    private int field_t;
    private int field_m;
    static byte[] field_o;
    static String field_n;
    static fm field_p;
    private int field_s;

    final static tc a(byte[] param0, int param1) {
        tc var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object stackIn_2_0 = null;
        tc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        tc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 != null) {
              var2 = new tc(param0, fa.field_b, e.field_b, gf.field_g, ge.field_c, wo.field_f);
              re.b(140);
              var3 = -1;
              stackOut_3_0 = (tc) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (tc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("kf.A(");
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
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -17 + ')');
        }
        return stackIn_4_0;
    }

    public static void d(int param0) {
        field_o = null;
        field_n = null;
        field_p = null;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          var2 = 330;
          if (((kf) this).field_r < 615) {
            stackOut_2_0 = 614 - ((kf) this).field_r;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        ((kf) this).a(param0 + 61, var3, var2, ((kf) this).field_r);
        var4 = 320 + -(((kf) this).field_r / param0);
        var5 = 0;
        L1: while (true) {
          if (7 <= var5) {
            return;
          } else {
            var6 = 13 + (76 * var5 + 76) + 2;
            if (5 + var4 <= var6) {
              if (((kf) this).field_r + var4 + -6 >= var6) {
                t.f(var6, var2 + 3, 19, 0, 128);
                t.f(var6 - -1, var2 - -4, 18, 16777215, 128);
                var5++;
                var5++;
                continue L1;
              } else {
                var5++;
                var5++;
                continue L1;
              }
            } else {
              var5++;
              var5++;
              continue L1;
            }
          }
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        L0: {
          super.a(param0);
          int fieldTemp$1 = ((kf) this).field_s + 1;
          ((kf) this).field_s = ((kf) this).field_s + 1;
          if (200 <= fieldTemp$1) {
            ((kf) this).field_s = 0;
            ((kf) this).field_t = ((kf) this).field_m * 2 / 3;
            break L0;
          } else {
            break L0;
          }
        }
        ((kf) this).field_t = ((kf) this).field_t - 1;
        if (((kf) this).field_t < ((kf) this).field_m + -20) {
          if (0 == ((kf) this).field_t % (((kf) this).field_m >> 2)) {
            ((kf) this).b(255);
            var2 = ((kf) this).field_t * 615 / ((kf) this).field_m;
            if (var2 > ((kf) this).field_r) {
              ((kf) this).field_r = ((kf) this).field_r + 10;
              ((kf) this).field_h = 0;
              if (((kf) this).field_r <= var2) {
                L1: {
                  if (((kf) this).field_r > 615) {
                    ((kf) this).field_r = 615;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                L2: {
                  ((kf) this).field_r = var2;
                  if (((kf) this).field_r > 615) {
                    ((kf) this).field_r = 615;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            } else {
              L3: {
                ((kf) this).field_r = var2;
                if (((kf) this).field_r > 615) {
                  ((kf) this).field_r = 615;
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          } else {
            var2 = ((kf) this).field_t * 615 / ((kf) this).field_m;
            if (var2 > ((kf) this).field_r) {
              ((kf) this).field_r = ((kf) this).field_r + 10;
              ((kf) this).field_h = 0;
              if (((kf) this).field_r <= var2) {
                L4: {
                  if (((kf) this).field_r > 615) {
                    ((kf) this).field_r = 615;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              } else {
                L5: {
                  ((kf) this).field_r = var2;
                  if (((kf) this).field_r > 615) {
                    ((kf) this).field_r = 615;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return;
              }
            } else {
              L6: {
                ((kf) this).field_r = var2;
                if (((kf) this).field_r > 615) {
                  ((kf) this).field_r = 615;
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            }
          }
        } else {
          var2 = ((kf) this).field_t * 615 / ((kf) this).field_m;
          if (var2 > ((kf) this).field_r) {
            ((kf) this).field_r = ((kf) this).field_r + 10;
            ((kf) this).field_h = 0;
            if (((kf) this).field_r <= var2) {
              L7: {
                if (((kf) this).field_r > 615) {
                  ((kf) this).field_r = 615;
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            } else {
              L8: {
                ((kf) this).field_r = var2;
                if (((kf) this).field_r > 615) {
                  ((kf) this).field_r = 615;
                  break L8;
                } else {
                  break L8;
                }
              }
              return;
            }
          } else {
            L9: {
              ((kf) this).field_r = var2;
              if (((kf) this).field_r > 615) {
                ((kf) this).field_r = 615;
                break L9;
              } else {
                break L9;
              }
            }
            return;
          }
        }
    }

    public kf() {
        ((kf) this).field_s = 0;
        ((kf) this).field_m = 500;
        ((kf) this).field_t = 2 * ((kf) this).field_m / 3;
        ((kf) this).field_r = 615 * ((kf) this).field_t / ((kf) this).field_m;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "to over <%0> great games";
    }
}
