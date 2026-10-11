/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends ie {
    static ri[] field_C;
    static int[] field_z;
    static int[] field_B;

    we(int param0, int param1, int param2, int param3, mh param4, pk param5) {
        super(param0, param1, param2, param3, param4, (qm) null);
        try {
          this.field_y = param5;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "we.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 >= -35) {
          we.a((byte) -109);
          if (param3 != 0) {
            if (this.field_q == 0) {
              return;
            }
            if (this.field_p != 0) {
              ks.field_x.a(this.field_p + param1 + this.field_v, param0 + this.field_r, this.field_v + param1, (byte) -106, param0 + this.field_r + this.field_q);
              this.field_y.a(this.field_r + param0, this.field_v + param1, (byte) -95, param3);
              ks.field_x.b((byte) -84);
              return;
            }
            return;
          }
          if (this.field_w == null) {
            if (this.field_q == 0) {
              return;
            }
            if (this.field_p != 0) {
              ks.field_x.a(this.field_p + param1 + this.field_v, param0 + this.field_r, this.field_v + param1, (byte) -106, param0 + this.field_r + this.field_q);
              this.field_y.a(this.field_r + param0, this.field_v + param1, (byte) -95, param3);
              ks.field_x.b((byte) -84);
              return;
            }
            return;
          }
          this.field_w.a((pk) (this), param1, 5592405, true, param0);
          if (this.field_q == 0) {
            return;
          }
          if (this.field_p == 0) {
            return;
          }
          ks.field_x.a(this.field_p + param1 + this.field_v, param0 + this.field_r, this.field_v + param1, (byte) -106, param0 + this.field_r + this.field_q);
          this.field_y.a(this.field_r + param0, this.field_v + param1, (byte) -95, param3);
          ks.field_x.b((byte) -84);
          return;
        }
        if (param3 == 0 &&
          this.field_w != null) {
          this.field_w.a((pk) (this), param1, 5592405, true, param0);
          if (this.field_q == 0) {
            return;
          }
          if (this.field_p == 0) {
            return;
          }
          ks.field_x.a(this.field_p + param1 + this.field_v, param0 + this.field_r, this.field_v + param1, (byte) -106, param0 + this.field_r + this.field_q);
          this.field_y.a(this.field_r + param0, this.field_v + param1, (byte) -95, param3);
          ks.field_x.b((byte) -84);
          return;
        }
        if (this.field_q == 0) {
          return;
        }
        if (this.field_p == 0) {
          return;
        }
        ks.field_x.a(this.field_p + param1 + this.field_v, param0 + this.field_r, this.field_v + param1, (byte) -106, param0 + this.field_r + this.field_q);
        this.field_y.a(this.field_r + param0, this.field_v + param1, (byte) -95, param3);
        ks.field_x.b((byte) -84);
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -42) {
            field_C = (ri[]) null;
          }
          stackIn_6_0 = (this.b(param5, -1, param4, param2, param6)) && (super.a(param0, -55, param2, param3, param4, param5, param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("we.R(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean g(int param0) {
        if (param0 != -1) {
          return false;
        }
        if (10 > jv.field_a) {
          return false;
        }
        if (mp.field_a >= 13) {
          return true;
        }
        return false;
    }

    public static void e(boolean param0) {
        field_C = null;
        field_B = null;
        field_z = null;
        if (param0) {
          field_C = (ri[]) null;
        }
    }

    final void d(boolean param0) {
        this.field_y.c(param0);
    }

    final static void e(byte param0) {
        qv.field_o = ig.field_a.d(-1);
        int var1 = 74 % ((60 - param0) / 52);
        CharSequence var2 = (CharSequence) ((Object) qv.field_o);
        tc.field_f = uk.a(-1, var2);
    }

    final static void a(byte param0) {
        if (jv.field_a == 10) {
          ch.a(0);
          jv.field_a = 11;
        } else {
          if (!au.c(1)) {
            ch.a(0);
            jv.field_a = 11;
          }
        }
        if (param0 <= 10) {
          return;
        }
        ch.field_h = true;
    }

    static {
        field_z = new int[8192];
    }
}
