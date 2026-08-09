/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq {
    private int field_d;
    static int field_g;
    private int field_b;
    private int field_f;
    static pl field_c;
    private boolean field_a;
    static l field_e;

    final int c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 1) {
          L0: {
            this.c(-33);
            if (this.field_a) {
              stackIn_8_0 = this.field_b;
              break L0;
            } else {
              stackIn_8_0 = this.field_f;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (this.field_a) {
              stackIn_4_0 = this.field_b;
              break L1;
            } else {
              stackIn_4_0 = this.field_f;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        field_c = null;
        field_e = null;
    }

    final static hea a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        hea var3 = null;
        hea stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              var2_int = -71 / ((5 - param1) / 35);
              var3 = new hea(param0, ak.field_p, pg.field_C, mq.field_b, iga.field_m, ck.field_c);
              loa.a((byte) 123);
              stackIn_4_0 = (hea) (var3);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("fq.B(");

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
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(byte param0) {
        byte[] var2;
        CharSequence var3;
        CharSequence var4;
        fna.field_k = vc.field_q.e((byte) -76);
        if (param0 != -68) {
          var2 = (byte[]) null;
          fq.a((byte[]) null, (byte) 68);
          var3 = (CharSequence) ((Object) fna.field_k);
          tia.field_b = jd.a(1, var3);
          return;
        } else {
          var4 = (CharSequence) ((Object) fna.field_k);
          tia.field_b = jd.a(1, var4);
          return;
        }
    }

    final void a(kh param0, int param1) {
        try {
            if (param1 != 23) {
                this.a(-16);
            }
            param0.a((byte) 118, !this.field_a ? 0 : 1, 1);
            param0.a((byte) -125, this.field_d, 2);
            param0.a((byte) -128, this.field_b, 8);
            param0.a((byte) 64, this.field_f, 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fq.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(byte param0) {
        if (param0 > -44) {
            return 74;
        }
        return this.field_b;
    }

    final boolean a(int param0) {
        if (param0 != -25584) {
            return true;
        }
        return this.field_a;
    }

    fq() {
        this.field_f = 0;
        this.field_b = 10;
    }

    fq(int param0, kh param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_f = 0;
        this.field_b = 10;
        try {
          L0: {
            if (param0 < 11) {
              break L0;
            } else {
              L1: {
                stackIn_4_0 = this;

                if (-2 != (param1.b((byte) 44, 1) ^ -1)) {
                  stackIn_5_0 = this;
                  stackIn_5_1 = 0;
                  break L1;
                } else {
                  stackIn_5_0 = this;
                  stackIn_5_1 = 1;
                  break L1;
                }
              }
              ((fq) (this)).field_a = stackIn_5_1 != 0;
              break L0;
            }
          }
          L2: {
            if ((param0 ^ -1) > -14) {
              this.field_b = 10;
              this.field_d = 0;
              break L2;
            } else {
              this.field_d = param1.b((byte) 44, 2);
              this.field_b = param1.b((byte) 44, 8);
              break L2;
            }
          }
          L3: {
            if (param0 < 23) {
              break L3;
            } else {
              if ((param0 ^ -1) <= -27) {
                break L3;
              } else {
                param1.b((byte) 44, 8);
                break L3;
              }
            }
          }
          if (param0 < 24) {
            this.field_f = 100;
            return;
          } else {
            this.field_f = param1.b((byte) 44, 8);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("fq.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    static {
        field_c = new pl(0);
    }
}
