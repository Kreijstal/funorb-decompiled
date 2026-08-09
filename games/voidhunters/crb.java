/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class crb extends anb implements ntb, utb, ofa {
    static int[][] field_w;
    private int field_u;
    static bwa field_v;

    final int d(int param0) {
        if (param0 <= 42) {
            faa var3 = (faa) null;
            this.a((faa) null, (byte) -116);
            return 3;
        }
        return 3;
    }

    public final void a(faa param0, int param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "crb.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
            return;
        }
        try {
            super.b(param0, -115);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "crb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException runtimeException = null;
        faa var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, -45);
              if (param1 < -19) {
                break L1;
              } else {
                var4 = (faa) null;
                this.a((faa) null, true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("crb.F(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 80 / ((22 - param0) / 59);
            stackIn_1_0 = super.a((byte) 96, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("crb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "crb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void l(int param0) {
        if (param0 != 3) {
            crb.a(123, true);
            field_w = (int[][]) null;
            field_v = null;
            return;
        }
        field_w = (int[][]) null;
        field_v = null;
    }

    public final void b(byte param0, tv param1) {
        RuntimeException runtimeException = null;
        crb var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = (crb) ((Object) param1);
            if (this.field_u == var3.field_u) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3.field_u = this.field_u;
                super.b((byte) 94, param1);
                if (param0 > 54) {
                  break L1;
                } else {
                  field_v = (bwa) null;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("crb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 == 3) {
          L0: {
            if (wq.e((byte) 105)) {
              param1 = false;
              break L0;
            } else {
              break L0;
            }
          }
          nda.a(-128, param1);
          if (kea.field_b) {
            dma.e(hra.field_o.field_a.field_L, hra.field_o.field_a.field_K, hra.field_o.field_a.field_hb, hra.field_o.field_a.field_G);
            hra.field_o.field_a.b(param1, 35);
            uta.a(param1, 4095);
            return;
          } else {
            uta.a(param1, 4095);
            return;
          }
        } else {
          return;
        }
    }

    public final void a(faa param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, (byte) -101);
              if (param1 <= -91) {
                break L1;
              } else {
                crb.l(-20);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("crb.E(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    crb() {
        this.field_u = 0;
        this.d((byte) -50);
    }

    final void d(byte param0) {
        int fieldTemp$0 = ogb.field_o;
        ogb.field_o = ogb.field_o + 1;
        this.field_u = fieldTemp$0;
        ikb.e((byte) -125);
        int var2 = -58 / ((param0 - -4) / 38);
    }

    crb(ml param0) {
        this.field_u = 0;
        this.d((byte) -50);
        try {
            this.field_k = param0;
            this.e((byte) 119);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "crb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
