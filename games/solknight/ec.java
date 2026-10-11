/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ec extends gg {
    static String field_j;
    long field_l;
    static int field_h;
    ec field_k;
    ec field_i;

    final static aj b(boolean param0) {
        if (param0) {
          field_j = (String) null;
        }
        if (null == ji.field_b) {
          ji.field_b = new aj();
          ji.field_b.a(87, ua.field_G);
          ji.field_b.field_n = 2763306;
          ji.field_b.field_f = 14;
          ji.field_b.field_b = 7697781;
          ji.field_b.field_d = 5;
          ji.field_b.field_e = 0;
          ji.field_b.field_j = 6;
          ji.field_b.field_q = 4;
          ji.field_b.field_k = jh.field_g;
        }
        return ji.field_b;
    }

    final void a(int param0) {
        if (param0 != 97) {
          this.field_l = 11L;
        }
        if (null == this.field_k) {
          return;
        }
        this.field_k.field_i = this.field_i;
        this.field_i.field_k = this.field_k;
        this.field_i = null;
        this.field_k = null;
    }

    final static boolean a(char param0, boolean param1) {
        boolean stackIn_10_0 = false;
        if (param1) {
          field_h = 22;
        }
        stackIn_10_0 = ((!(param0 < 65) &&
          !(param0 > 90)) ||
          (!(97 > param0) &&
          !(param0 > 122)));
        return stackIn_10_0;
    }

    final static boolean a(int param0, int param1, boolean param2, int param3) {
        int var4;
        int var5;
        if (param2) {
          if (qg.field_c[param0] < qg.field_c[param3]) {
            return true;
          }
          if (qg.field_c[param3] < qg.field_c[param0]) {
            return false;
          }
          if (l.field_a[param0] < l.field_a[param3]) {
            return true;
          }
          if (l.field_a[param3] < l.field_a[param0]) {
            return false;
          }
        } else {
          if (l.field_a[param0] < l.field_a[param3]) {
            return true;
          }
          if (l.field_a[param0] > l.field_a[param3]) {
            return false;
          }
          if (qg.field_c[param0] < qg.field_c[param3]) {
            return true;
          }
          if (qg.field_c[param3] < qg.field_c[param0]) {
            return false;
          }
        }
        var4 = eh.field_a[param0] + ld.field_M[param0] + ma.field_n[param0];
        var5 = eh.field_a[param3] + ld.field_M[param3] + ma.field_n[param3];
        if (var4 < var5) {
          return true;
        }
        if (param1 != -66) {
          field_j = (String) null;
        }
        if (var4 > var5) {
          return false;
        }
        return !(param0 >= param3);
    }

    final static boolean e(int param0) {
        di var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        di var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          var4 = (di) (ga.field_E.a((byte) 51));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          var2 = 0;
          if (param0 != 7697781) {
            return true;
          }
          while (var2 < var1.field_h) {
            if (null != var4.field_k[var2] &&
              var4.field_k[var2].field_c == 0) {
              return false;
            }
            if (var4.field_s[var2] != null &&
              var4.field_s[var2].field_c == 0) {
              return false;
            }
            var2++;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1_ref), "ec.DA(" + param0 + ')');
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 30418) {
            field_j = (String) null;
          }
          stackIn_3_0 = wi.a(-913, true, param1, 10);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ec.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    protected ec() {
    }

    public static void d(int param0) {
        if (param0 != -1) {
          ec.e(-35);
        }
        field_j = null;
    }

    static {
    }
}
