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
        ((lb) this).field_p = param3 ? true : false;
        ((lb) this).field_s = param1;
        ((lb) this).field_k = param2;
        ((lb) this).field_q = param4 ? true : false;
        ((lb) this).field_r = param0;
    }

    public static void d(boolean param0) {
        if (param0) {
          field_t = null;
          field_w = null;
          field_t = null;
          field_u = null;
          return;
        } else {
          field_w = null;
          field_t = null;
          field_u = null;
          return;
        }
    }

    final static go[] b(String param0, byte param1) {
        go[] var2 = new go[2];
        int var4 = -16 / ((param1 - -14) / 63);
        var2[0] = bi.a(false, param0, true, false, 2048);
        String var3 = param0 + "_destroyed";
        var2[1] = bi.a(false, var3, true, false, 2048);
        return var2;
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
