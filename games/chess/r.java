/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends ci {
    static ci field_Tb;
    int field_Sb;
    static String field_Zb;
    static String field_Fb;
    static int field_Eb;
    ci field_Ob;
    long field_Yb;
    boolean field_Qb;
    static boolean field_bc;
    int field_Vb;
    int field_Jb;
    int field_Wb;
    ci field_Xb;
    String field_Lb;
    boolean field_Hb;
    int field_Mb;
    int field_Pb;
    String field_Rb;
    boolean field_ac;
    ci field_Gb;
    static dk field_Ib;
    ci field_Kb;
    ci field_Ub;
    long field_Nb;

    final boolean a(r param0, int param1) {
        RuntimeException var3 = null;
        r var4 = null;
        boolean stackIn_2_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        boolean stackIn_14_0 = false;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = param0.field_Qb;
          if (this.field_Qb) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = 1;
          }
          if ((stackIn_2_0 ? 1 : 0) == stackIn_3_1) {
            stackIn_5_0 = this.field_Qb;
            return stackIn_5_0;
          }
          if (param1 != -343) {
            var4 = (r) null;
            this.a((r) null, -42);
          }
          stackIn_11_0 = (param0.field_ac) ? 0 : 1;
          if (stackIn_11_0 == (this.field_ac ? 1 : 0)) {
            stackIn_14_0 = this.field_ac;
            return stackIn_14_0;
          }
          stackIn_18_0 = !(this.field_Nb >= param0.field_Nb);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("r.E(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, String param1, String param2) {
        CharSequence var5 = null;
        try {
          if (param0 != 1) {
            this.field_Gb = (ci) null;
          }
          this.field_Lb = param1;
          this.field_Rb = param2;
          var5 = (CharSequence) ((Object) this.field_Rb);
          ad.a(var5, -2);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "r.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void k(int param0) {
        h var1 = null;
        if (param0 == 3029) {
          var1 = (h) (ni.field_c.c(101));
          if (var1 == null) {
            var1 = new h();
          }
          var1.a(wb.field_h, wb.field_c, 0, wb.field_d, wb.field_j, wb.field_i, wb.field_b, wb.field_a);
          tm.field_a.a((o) (var1), (byte) -39);
          return;
        }
    }

    final static void a(int param0, byte param1, int param2, le param3) {
        try {
          o.field_f = param2;
          de.field_c = param3;
          bb.field_b = param0;
          if (param1 > -46) {
            field_Ib = (dk) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "r.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    r(String param0, String param1, long param2) {
        super(0L, (ci) null);
        CharSequence var6 = null;
        try {
          this.field_Lb = param1;
          this.field_Rb = param0;
          this.field_Yb = param2;
          var6 = (CharSequence) ((Object) this.field_Rb);
          ad.a(var6, -2);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "r.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean l(int param0) {
        if (param0 != 1) {
          return true;
        }
        return !this.e(-4) ? true : false;
    }

    public static void m(int param0) {
        field_Zb = null;
        int var1 = -85 / ((-34 - param0) / 32);
        field_Tb = null;
        field_Ib = null;
        field_Fb = null;
    }

    final static boolean a(boolean param0, nk param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_6_0 = (1 == param1.e(-63, 1));
            return stackIn_6_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("r.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_Zb = "Continue spectating";
        field_Fb = "You cannot chat to <%0> because <%0> is not in your friend list.";
    }
}
