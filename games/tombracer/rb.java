/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends nv {
    private boolean field_s;
    static String field_q;
    static int[] field_o;
    private int field_t;
    private jma field_n;
    static jea[] field_p;
    static long field_r;

    final static tn a(cn param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        tn stackIn_2_0 = null;
        tn stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 15) {
              var4 = param0.f(param1, 105);
              var3 = var4;
              if (var4 != null) {
                stackIn_7_0 = new tn(var4);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (tn) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("rb.L(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void k(int param0) {
        this.j((byte) 79);
        this.field_n.a((byte) -14, this.field_s);
        if (param0 != 5418) {
            this.c(false);
        }
    }

    rb(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            this.field_t = param1.b((byte) 44, 4);
            this.field_n = new jma(15, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void g(byte param0) {
        if (param0 > -116) {
          rb.g((byte) 32);
          field_q = null;
          field_o = null;
          field_p = null;
          return;
        } else {
          field_q = null;
          field_o = null;
          field_p = null;
          return;
        }
    }

    final void a(boolean param0, kh param1) {
        if (param0) {
            return;
        }
        try {
            super.a(param0, param1);
            param1.a((byte) -127, this.field_t, 4);
            this.field_n.a(this.h((byte) 119), (byte) 88, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rb.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void j(byte param0) {
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = this.field_t;
        if (var3 != 0) {
          if ((var3 ^ -1) != -2) {
            if (var3 != 2) {
              if (var3 == 3) {
                this.field_s = this.i(12340).f(8, 10915);
                if (param0 == 79) {
                  return;
                } else {
                  this.g(91);
                  return;
                }
              } else {
                if (param0 != 79) {
                  this.g(91);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L0: {
                var2 = this.b(true).a(this.field_g.e(9648), this.field_g.c(-96), param0 ^ 79, 2, this.field_g.a((byte) 55), this.field_g.d(param0 + -76), this.e(6));
                stackIn_7_0 = this;

                if (var2 < (this.field_g.c(param0 ^ -51) >> -82100400) * (this.field_g.a((byte) 55) >> 775746832)) {
                  stackIn_8_0 = this;
                  stackIn_8_1 = 0;
                  break L0;
                } else {
                  stackIn_8_0 = this;
                  stackIn_8_1 = 1;
                  break L0;
                }
              }
              ((rb) (this)).field_s = stackIn_8_1 != 0;
              if (param0 != 79) {
                this.g(91);
                return;
              } else {
                return;
              }
            }
          } else {
            this.field_s = this.field_g.d(50, false);
            if (param0 != 79) {
              this.g(91);
              return;
            } else {
              return;
            }
          }
        } else {
          this.field_s = this.a((byte) 87);
          if (param0 != 79) {
            this.g(91);
            return;
          } else {
            return;
          }
        }
    }

    final void c(boolean param0) {
        super.c(param0);
        if (this.field_t == 0) {
            this.field_n.a((byte) -14, true);
        }
    }

    final int a(int param0, int param1) {
        kh var4;
        if (param1 > -48) {
          var4 = (kh) null;
          this.a(false, (kh) null);
          param0 = upa.a(this.field_s, param0, (byte) -53);
          return param0;
        } else {
          param0 = upa.a(this.field_s, param0, (byte) -53);
          return param0;
        }
    }

    final void g(int param0) {
        super.g(param0);
        this.field_n.a((byte) 48, this.h((byte) 116));
    }

    final int a(boolean param0) {
        if (param0) {
            this.field_n = (jma) null;
            return 13;
        }
        return 13;
    }

    static {
        field_q = "Played";
        field_o = fqa.e(true);
    }
}
