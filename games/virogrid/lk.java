/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends km {
    boolean field_Sb;
    static int[] field_Tb;
    static byte[] field_Pb;
    int field_Gb;
    km field_Lb;
    String field_Nb;
    long field_Ib;
    long field_Ob;
    boolean field_Xb;
    km field_Hb;
    int field_Wb;
    int field_Rb;
    int field_Ub;
    int field_Vb;
    km field_Mb;
    boolean field_Jb;
    km field_Kb;
    km field_Yb;
    String field_Eb;
    int field_Fb;
    static il field_Qb;

    final boolean g(int param0) {
        if (param0 == 0) {
          return !this.a(1) ? true : false;
        }
        lk.e((byte) -9);
        return !this.a(1) ? true : false;
    }

    final void a(String param0, String param1, int param2) {
        CharSequence var5 = null;
        try {
          this.field_Eb = param0;
          if (param2 != 0) {
            this.field_Nb = (String) null;
          }
          this.field_Nb = param1;
          var5 = (CharSequence) ((Object) this.field_Nb);
          c.a(var5, true);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "lk.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, lk param1) {
        RuntimeException var3 = null;
        boolean stackIn_2_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_12_1 = 0;
        boolean stackIn_15_0 = false;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_Sb != param1.field_Sb) {
            stackIn_2_0 = this.field_Sb;
            return stackIn_2_0;
          }
          if (param0 < 1) {
            return true;
          }
          stackIn_9_0 = (this.field_Xb) ? 0 : 1;
          if (param1.field_Xb) {
            stackIn_12_1 = 0;
          } else {
            stackIn_12_1 = 1;
          }
          if (stackIn_9_0 != stackIn_12_1) {
            stackIn_15_0 = this.field_Xb;
            return stackIn_15_0;
          }
          stackIn_19_0 = !(param1.field_Ib <= this.field_Ib);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("lk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_Tb = null;
        if (param0 != 10) {
          return;
        }
        field_Pb = null;
        field_Qb = null;
    }

    lk(String param0, String param1, long param2) {
        super(0L, (km) null);
        CharSequence var6 = null;
        try {
          this.field_Ob = param2;
          this.field_Nb = param0;
          this.field_Eb = param1;
          var6 = (CharSequence) ((Object) this.field_Nb);
          c.a(var6, true);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
