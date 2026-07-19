/*
 * Decompiled by CFR-JS 0.4.0.
 */
class eo extends bw {
    static kv[] field_k;
    static js field_f;
    eo field_m;
    static String field_j;
    static int field_l;
    static String field_g;
    long field_h;
    eo field_i;

    final void b(int param0) {
        if (null == this.field_i) {
          return;
        } else {
          this.field_i.field_m = this.field_m;
          if (param0 != 0) {
            return;
          } else {
            this.field_m.field_i = this.field_i;
            this.field_i = null;
            this.field_m = null;
            return;
          }
        }
    }

    public static void c(byte param0) {
        field_j = null;
        field_k = null;
        field_g = null;
        if (param0 != 114) {
            return;
        }
        field_f = null;
    }

    final long d(int param0) {
        if (param0 >= -97) {
            return 6L;
        }
        return this.field_h;
    }

    final boolean a(int param0) {
        if (param0 == 0) {
          if (this.field_i == null) {
            return false;
          } else {
            return true;
          }
        } else {
          this.b(115);
          if (this.field_i == null) {
            return false;
          } else {
            return true;
          }
        }
    }

    final static pp a(lu param0, int param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        fda stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        fda stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -4479) {
                break L1;
              } else {
                field_l = 115;
                break L1;
              }
            }
            var2 = qi.a(param0, (byte) 64);
            stackOut_2_0 = new fda(var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("eo.J(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (pp) ((Object) stackIn_3_0);
    }

    final static void c(int param0) {
        eo var1 = null;
        int var3 = BachelorFridge.field_y;
        try {
            bda.field_l = 0;
            sja.field_gb = null;
            maa.field_v = 0;
            es.field_j.d(71);
            cca.field_v.d(59);
            var1 = wja.field_m.b((byte) -73);
            while (var1 != null) {
                var1.b(0);
                var1 = wja.field_m.a(-25177);
            }
            int var2 = -42 / ((param0 - 35) / 54);
            var1 = fq.field_s.b((byte) -73);
            while (var1 != null) {
                var1.b(0);
                var1 = fq.field_s.a(-25177);
            }
            um.field_c = 0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "eo.I(" + param0 + ')');
        }
    }

    final void a(boolean param0, long param1) {
        if (null != this.field_i) {
            throw new RuntimeException();
        }
        if (!param0) {
            return;
        }
        this.field_h = param1;
    }

    protected eo() {
    }

    static {
        field_l = 0;
        field_j = "Visit the Account Management section on the main site to view.";
        field_g = "Achieved";
    }
}
