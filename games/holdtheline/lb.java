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
        if (!param0) {
          return (vj) ((Object) new lb(this.field_s, this.field_r, this.field_k, this.field_p, this.field_q));
        }
        return (vj) null;
    }

    final in a(boolean param0) {
        if (!param0) {
          return new wb(this.field_r, this.field_s).b(-114);
        }
        field_t = (hj[]) null;
        return new wb(this.field_r, this.field_s).b(-114);
    }

    final in g(int param0) {
        if (param0 == -1) {
          return new wb(this.field_r, this.field_s).b(-117);
        }
        this.field_s = (qm) null;
        return new wb(this.field_r, this.field_s).b(-117);
    }

    final in a(byte param0, float param1) {
        if (param0 >= 117) {
          return new wb(this.field_r, this.field_s).b(-126);
        }
        this.field_r = (qm) null;
        return new wb(this.field_r, this.field_s).b(-126);
    }

    final qm a(int param0) {
        if (param0 != 0) {
          field_x = 13;
          return this.field_s;
        }
        return this.field_s;
    }

    final qm a(boolean param0, float param1) {
        if (!param0) {
          return new qm((int)((float)(this.field_s.field_h - this.field_r.field_h) * param1 + (float)this.field_r.field_h), (int)((float)(-this.field_r.field_f + this.field_s.field_f) * param1 + (float)this.field_r.field_f));
        }
        this.a((byte) -61, 1.257719874382019f);
        return new qm((int)((float)(this.field_s.field_h - this.field_r.field_h) * param1 + (float)this.field_r.field_h), (int)((float)(-this.field_r.field_f + this.field_s.field_f) * param1 + (float)this.field_r.field_f));
    }

    final float f(int param0) {
        if (param0 == 50) {
          return (float)Math.sqrt((double)((-this.field_r.field_f + this.field_s.field_f) * (this.field_s.field_f - this.field_r.field_f) + (this.field_s.field_h - this.field_r.field_h) * (-this.field_r.field_h + this.field_s.field_h)));
        }
        this.i(31);
        return (float)Math.sqrt((double)((-this.field_r.field_f + this.field_s.field_f) * (this.field_s.field_f - this.field_r.field_f) + (this.field_s.field_h - this.field_r.field_h) * (-this.field_r.field_h + this.field_s.field_h)));
    }

    final int i(int param0) {
        if (param0 < -72) {
          return (-this.field_r.field_h + this.field_s.field_h) * (this.field_s.field_h - this.field_r.field_h) + (this.field_s.field_f - this.field_r.field_f) * (-this.field_r.field_f + this.field_s.field_f);
        }
        this.a(true, 1.4694377183914185f);
        return (-this.field_r.field_h + this.field_s.field_h) * (this.field_s.field_h - this.field_r.field_h) + (this.field_s.field_f - this.field_r.field_f) * (-this.field_r.field_f + this.field_s.field_f);
    }

    lb(qm param0, qm param1, int param2, boolean param3, boolean param4) {
        try {
          this.field_p = param3 ? true : false;
          this.field_s = param1;
          this.field_k = param2;
          this.field_q = param4 ? true : false;
          this.field_r = param0;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
          field_w = null;
          field_t = null;
          field_u = null;
          return;
        }
        field_t = (hj[]) null;
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new go[2];
          var4 = -16 / ((param1 + 14) / 63);
          var2[0] = bi.a(false, param0, true, false, 2048);
          var3 = param0 + "_destroyed";
          var2[1] = bi.a(false, var3, true, false, 2048);
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("lb.H(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_w = new long[32];
        field_x = 0;
        field_t = new hj[4];
    }
}
