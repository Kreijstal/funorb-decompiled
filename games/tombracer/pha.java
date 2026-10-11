/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pha extends jea {
    int field_Ab;
    static String field_Ib;
    int field_zb;
    boolean field_Hb;
    boolean field_tb;
    String field_wb;
    jea field_Cb;
    jea field_Nb;
    jea field_Gb;
    long field_yb;
    String field_vb;
    jea field_Db;
    static jpa field_Bb;
    static int[] field_ub;
    jea field_Kb;
    int field_xb;
    int field_Eb;
    long field_Mb;
    boolean field_Fb;
    int field_Lb;
    int field_Jb;

    public static void d(byte param0) {
        field_Bb = null;
        field_Ib = null;
        if (param0 == -68) {
          field_ub = null;
          return;
        }
        la var2 = (la) null;
        pha.a((kh) null, (la) null, 16);
        field_ub = null;
    }

    final boolean a(byte param0, pha param1) {
        RuntimeException var3 = null;
        pha var4 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        boolean stackIn_14_0 = false;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (param1.field_Fb) ? 0 : 1;
          if (stackIn_3_0 == (this.field_Fb ? 1 : 0)) {
            stackIn_5_0 = this.field_Fb;
            return stackIn_5_0;
          }
          if (param0 <= 106) {
            var4 = (pha) null;
            this.a((byte) 29, (pha) null);
          }
          stackIn_11_0 = (this.field_Hb) ? 0 : 1;
          if (stackIn_11_0 == (param1.field_Hb ? 1 : 0)) {
            stackIn_14_0 = this.field_Hb;
            return stackIn_14_0;
          }
          stackIn_18_0 = !(param1.field_Mb <= this.field_Mb);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("pha.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final boolean f(int param0) {
        if (param0 != 162) {
          return false;
        }
        return !this.d(0) ? true : false;
    }

    pha(String param0, String param1, long param2) {
        super(0L, (jea) null);
        CharSequence var6 = null;
        try {
          this.field_yb = param2;
          this.field_vb = param0;
          this.field_wb = param1;
          var6 = (CharSequence) ((Object) this.field_vb);
          jd.a(1, var6);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(String param0, int param1, String param2) {
        CharSequence var5 = null;
        try {
          this.field_vb = param2;
          if (param1 <= 23) {
            pha.d((byte) 68);
          }
          this.field_wb = param0;
          var5 = (CharSequence) ((Object) this.field_vb);
          jd.a(1, var5);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pha.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static ib a(kh param0, la param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        vja stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 162) {
            field_ub = (int[]) null;
          }
          var3_int = param0.b((byte) 44, 4);
          var4 = var3_int;
          if (var4 != 0) {
            throw new IllegalStateException("Unrecognised spawner type: " + var3_int);
          }
          stackIn_5_0 = new vja(param1, param0);
          return (ib) ((Object) stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pha.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_ub = new int[]{50, 162, 28, 261, 212, 301, 386, 379, 481};
        field_Ib = "Piles";
    }
}
