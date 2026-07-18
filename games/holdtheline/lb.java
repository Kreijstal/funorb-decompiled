/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends vj {
    static long[] field_w;
    qm field_s;
    static int field_x;
    static jf field_u;
    qm field_r;
    static hj[] field_t;
    static int field_v;

    final vj c(boolean param0) {
        if (param0) {
          return null;
        } else {
          return (vj) (Object) new lb(((lb) this).field_s, ((lb) this).field_r, ((lb) this).field_k, ((lb) this).field_p, ((lb) this).field_q);
        }
    }

    final in a(boolean param0) {
        if (param0) {
          field_t = null;
          return new wb(((lb) this).field_r, ((lb) this).field_s).b(-114);
        } else {
          return new wb(((lb) this).field_r, ((lb) this).field_s).b(-114);
        }
    }

    final in g(int param0) {
        if (param0 != -1) {
          ((lb) this).field_s = null;
          return new wb(((lb) this).field_r, ((lb) this).field_s).b(-117);
        } else {
          return new wb(((lb) this).field_r, ((lb) this).field_s).b(-117);
        }
    }

    final in a(byte param0, float param1) {
        if (param0 < 117) {
          ((lb) this).field_r = null;
          return new wb(((lb) this).field_r, ((lb) this).field_s).b(-126);
        } else {
          return new wb(((lb) this).field_r, ((lb) this).field_s).b(-126);
        }
    }

    final qm a(int param0) {
        if (param0 != 0) {
            field_x = 13;
            return ((lb) this).field_s;
        }
        return ((lb) this).field_s;
    }

    final qm a(boolean param0, float param1) {
        if (param0) {
          in discarded$1 = ((lb) this).a((byte) -61, 1.257719874382019f);
          return new qm((int)((float)(((lb) this).field_s.field_h + -((lb) this).field_r.field_h) * param1 + (float)((lb) this).field_r.field_h), (int)((float)(-((lb) this).field_r.field_f + ((lb) this).field_s.field_f) * param1 + (float)((lb) this).field_r.field_f));
        } else {
          return new qm((int)((float)(((lb) this).field_s.field_h + -((lb) this).field_r.field_h) * param1 + (float)((lb) this).field_r.field_h), (int)((float)(-((lb) this).field_r.field_f + ((lb) this).field_s.field_f) * param1 + (float)((lb) this).field_r.field_f));
        }
    }

    final float f(int param0) {
        if (param0 != 50) {
          int discarded$1 = ((lb) this).i(31);
          return (float)Math.sqrt((double)((-((lb) this).field_r.field_f + ((lb) this).field_s.field_f) * (((lb) this).field_s.field_f - ((lb) this).field_r.field_f) + (((lb) this).field_s.field_h - ((lb) this).field_r.field_h) * (-((lb) this).field_r.field_h + ((lb) this).field_s.field_h)));
        } else {
          return (float)Math.sqrt((double)((-((lb) this).field_r.field_f + ((lb) this).field_s.field_f) * (((lb) this).field_s.field_f - ((lb) this).field_r.field_f) + (((lb) this).field_s.field_h - ((lb) this).field_r.field_h) * (-((lb) this).field_r.field_h + ((lb) this).field_s.field_h)));
        }
    }

    final int i(int param0) {
        if (param0 >= -72) {
          qm discarded$1 = ((lb) this).a(true, 1.4694377183914185f);
          return (-((lb) this).field_r.field_h + ((lb) this).field_s.field_h) * (((lb) this).field_s.field_h + -((lb) this).field_r.field_h) - -((((lb) this).field_s.field_f - ((lb) this).field_r.field_f) * (-((lb) this).field_r.field_f + ((lb) this).field_s.field_f));
        } else {
          return (-((lb) this).field_r.field_h + ((lb) this).field_s.field_h) * (((lb) this).field_s.field_h + -((lb) this).field_r.field_h) - -((((lb) this).field_s.field_f - ((lb) this).field_r.field_f) * (-((lb) this).field_r.field_f + ((lb) this).field_s.field_f));
        }
    }

    lb(qm param0, qm param1, int param2, boolean param3, boolean param4) {
        try {
            ((lb) this).field_p = param3 ? true : false;
            ((lb) this).field_s = param1;
            ((lb) this).field_k = param2;
            ((lb) this).field_q = param4 ? true : false;
            ((lb) this).field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void d(boolean param0) {
        field_w = null;
        field_t = null;
        field_u = null;
    }

    final static go[] b(String param0, byte param1) {
        go[] var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        int var4 = 0;
        go[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        go[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new go[2];
            var4 = -16 / ((param1 - -14) / 63);
            var2[0] = bi.a(false, param0, true, false, 2048);
            var3 = param0 + "_destroyed";
            var2[1] = bi.a(false, var3, true, false, 2048);
            stackOut_0_0 = (go[]) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("lb.H(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new long[32];
        field_x = 0;
        field_t = new hj[4];
    }
}
