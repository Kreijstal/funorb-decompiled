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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new tc(param0, fa.field_b, e.field_b, gf.field_g, ge.field_c, wo.field_f);
              re.b(140);
              var3 = -91 % ((77 - param1) / 37);
              stackIn_4_0 = (tc) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2_ref);

            stackIn_7_1 = new StringBuilder().append("kf.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (tc) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    public static void d(int param0) {
        field_o = null;
        field_n = null;
        if (param0 <= 98) {
            return;
        }
        field_p = null;
    }

    final void c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_3_0 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          var2 = 330;
          if (this.field_r < 615) {
            stackIn_3_0 = 614 - this.field_r;
            break L0;
          } else {
            stackIn_3_0 = 0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        this.a(param0 + 61, var3, var2, this.field_r);
        var4 = 320 + -(this.field_r / param0);
        var5 = 0;
        L1: while (true) {
          if (7 <= var5) {
            return;
          } else {
            var6 = 13 + (76 * var5 + 76) + 2;
            if (5 + var4 <= var6) {
              if (this.field_r + var4 + -6 >= var6) {
                t.f(var6, var2 + 3, 19, 0, 128);
                t.f(var6 - -1, var2 - -4, 18, 16777215, 128);
                var5++;
                continue L1;
              } else {
                var5++;
                continue L1;
              }
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    final void a(byte param0) {
        int fieldTemp$0 = 0;
        int var2;
        L0: {
          super.a(param0);
          fieldTemp$0 = this.field_s + 1;
          this.field_s = this.field_s + 1;
          if (200 <= fieldTemp$0) {
            this.field_s = 0;
            this.field_t = this.field_m * 2 / 3;
            break L0;
          } else {
            break L0;
          }
        }
        this.field_t = this.field_t - 1;
        if (this.field_t < this.field_m + -20) {
          if (0 == this.field_t % (this.field_m >> 1970009026)) {
            this.b(255);
            var2 = this.field_t * 615 / this.field_m;
            if (var2 > this.field_r) {
              this.field_r = this.field_r + 10;
              this.field_h = 0;
              if (this.field_r <= var2) {
                L1: {
                  if (this.field_r > 615) {
                    this.field_r = 615;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                L2: {
                  this.field_r = var2;
                  if (this.field_r > 615) {
                    this.field_r = 615;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            } else {
              L3: {
                this.field_r = var2;
                if (this.field_r > 615) {
                  this.field_r = 615;
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          } else {
            var2 = this.field_t * 615 / this.field_m;
            if (var2 > this.field_r) {
              this.field_r = this.field_r + 10;
              this.field_h = 0;
              if (this.field_r <= var2) {
                L4: {
                  if (this.field_r > 615) {
                    this.field_r = 615;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              } else {
                L5: {
                  this.field_r = var2;
                  if (this.field_r > 615) {
                    this.field_r = 615;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return;
              }
            } else {
              L6: {
                this.field_r = var2;
                if (this.field_r > 615) {
                  this.field_r = 615;
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            }
          }
        } else {
          var2 = this.field_t * 615 / this.field_m;
          if (var2 > this.field_r) {
            this.field_r = this.field_r + 10;
            this.field_h = 0;
            if (this.field_r <= var2) {
              L7: {
                if (this.field_r > 615) {
                  this.field_r = 615;
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            } else {
              L8: {
                this.field_r = var2;
                if (this.field_r > 615) {
                  this.field_r = 615;
                  break L8;
                } else {
                  break L8;
                }
              }
              return;
            }
          } else {
            L9: {
              this.field_r = var2;
              if (this.field_r > 615) {
                this.field_r = 615;
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
        this.field_s = 0;
        this.field_m = 500;
        this.field_t = 2 * this.field_m / 3;
        this.field_r = 615 * this.field_t / this.field_m;
    }

    static {
        field_n = "to over <%0> great games";
    }
}
