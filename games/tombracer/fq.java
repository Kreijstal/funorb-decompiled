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
        int discarded$10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 1) {
          L0: {
            discarded$10 = this.c(-33);
            if (this.field_a) {
              stackOut_7_0 = this.field_b;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = this.field_f;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (this.field_a) {
              stackOut_3_0 = this.field_b;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = this.field_f;
              stackIn_4_0 = stackOut_2_0;
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        hea stackOut_3_0 = null;
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
              var2_int = -71 / ((5 - param1) / 35);
              var3 = new hea(param0, ak.field_p, pg.field_C, mq.field_b, iga.field_m, ck.field_c);
              loa.a((byte) 123);
              stackOut_3_0 = (hea) (var3);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("fq.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(byte param0) {
        hea discarded$2 = null;
        byte[] var2 = null;
        CharSequence var3 = null;
        CharSequence var4 = null;
        fna.field_k = vc.field_q.e((byte) -76);
        if (param0 != -68) {
          var2 = (byte[]) null;
          discarded$2 = fq.a((byte[]) null, (byte) 68);
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
        boolean discarded$0 = false;
        try {
            if (param1 != 23) {
                discarded$0 = this.a(-16);
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
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        this.field_f = 0;
        this.field_b = 10;
        try {
          L0: {
            L1: {
              if (param0 < 11) {
                break L1;
              } else {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (-2 != (param1.b((byte) 44, 1) ^ -1)) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                ((fq) (this)).field_a = stackIn_5_1 != 0;
                break L1;
              }
            }
            L3: {
              if ((param0 ^ -1) > -14) {
                this.field_b = 10;
                this.field_d = 0;
                break L3;
              } else {
                this.field_d = param1.b((byte) 44, 2);
                this.field_b = param1.b((byte) 44, 8);
                if (var4 == 0) {
                  break L3;
                } else {
                  this.field_b = 10;
                  this.field_d = 0;
                  break L3;
                }
              }
            }
            L4: {
              if (param0 < 23) {
                break L4;
              } else {
                if ((param0 ^ -1) <= -27) {
                  break L4;
                } else {
                  discarded$1 = param1.b((byte) 44, 8);
                  break L4;
                }
              }
            }
            L5: {
              if (param0 < 24) {
                break L5;
              } else {
                this.field_f = param1.b((byte) 44, 8);
                if (var4 == 0) {
                  break L0;
                } else {
                  break L5;
                }
              }
            }
            this.field_f = 100;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("fq.<init>(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_c = new pl(0);
    }
}
