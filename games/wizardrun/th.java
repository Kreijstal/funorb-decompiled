/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static byte[][][] field_a;
    static boolean field_h;
    static bh field_d;
    static int field_i;
    private rk field_c;
    static String field_e;
    static nj field_g;
    static String field_b;
    private rk field_f;

    final static void b(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = tc.field_m;
        synchronized (var1) {
          sh.field_c = ve.field_d;
          oc.field_a = oc.field_a + 1;
          pg.field_n = wizardrun.field_T;
          fi.field_B = gj.field_a;
          ih.field_a = jf.field_i;
          if (param0 != -21) {
            th.a((byte) 88);
          }
          jf.field_i = false;
          w.field_c = fi.field_w;
          tf.field_e = mh.field_pb;
          dh.field_b = dc.field_t;
          fi.field_w = 0;
        }
    }

    final rk d(int param0) {
        rk var2 = this.field_f;
        if (this.field_c == var2) {
          this.field_f = null;
          return null;
        }
        if (param0 > 3) {
          this.field_f = var2.field_i;
          return var2;
        }
        this.field_f = (rk) null;
        this.field_f = var2.field_i;
        return var2;
    }

    final rk a(int param0) {
        rk var2 = this.field_c.field_i;
        if (param0 != 0) {
          this.b(68);
          if (this.field_c != var2) {
            this.field_f = var2.field_i;
            return var2;
          }
          this.field_f = null;
          return null;
        }
        if (this.field_c != var2) {
          this.field_f = var2.field_i;
          return var2;
        }
        this.field_f = null;
        return null;
    }

    final int c(int param0) {
        int var4 = wizardrun.field_H;
        int var2 = 0;
        rk var3 = this.field_c.field_i;
        while (this.field_c != var3) {
          var3 = var3.field_i;
          var2++;
        }
        if (param0 == 4) {
          return var2;
        }
        return -16;
    }

    final static StringBuilder a(StringBuilder param0, char param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_3_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = wizardrun.field_H;
        try {
          var4_int = param0.length();
          param0.setLength(param2);
          var5 = var4_int;
          if (param3 != 1) {
            stackIn_3_0 = (StringBuilder) null;
            return stackIn_3_0;
          }
          while (param2 > var5) {
            param0.setCharAt(var5, param1);
            var5++;
          }
          stackIn_7_0 = (StringBuilder) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("th.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 <= 60) {
          return;
        }
        field_a = (byte[][][]) null;
        field_e = null;
        field_g = null;
        field_b = null;
        field_d = null;
    }

    final void a(rk param0, int param1) {
        try {
          if (param1 != 14) {
            this.a(-10);
          }
          if (param0.field_l != null) {
            param0.b(false);
          }
          param0.field_i = this.field_c;
          param0.field_l = this.field_c.field_l;
          param0.field_l.field_i = param0;
          param0.field_i.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "th.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final rk b(int param0) {
        rk var2 = this.field_c.field_i;
        if (param0 < 33) {
          field_g = (nj) null;
          if (this.field_c != var2) {
            var2.b(false);
            return var2;
          }
          return null;
        }
        if (this.field_c != var2) {
          var2.b(false);
          return var2;
        }
        return null;
    }

    public th() {
        this.field_c = new rk();
        this.field_c.field_l = this.field_c;
        this.field_c.field_i = this.field_c;
    }

    static {
        field_d = new bh(14, 0, 4, 1);
        field_b = "Just play";
    }
}
