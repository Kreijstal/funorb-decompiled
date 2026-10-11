/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ema extends sna {
    int field_xb;
    String field_Hb;
    int field_Mb;
    sna field_Fb;
    int field_Kb;
    int field_Jb;
    boolean field_Ob;
    String field_Nb;
    sna field_Bb;
    int field_yb;
    sna field_Db;
    boolean field_wb;
    static String field_Lb;
    sna field_Ib;
    sna field_vb;
    int field_Gb;
    long field_Eb;
    boolean field_zb;
    long field_Cb;
    static String field_Ab;

    final boolean a(int param0, ema param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_15_0 = 0;
        boolean stackIn_18_0 = false;
        boolean stackIn_22_0 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (param1.field_Ob) ? 0 : 1;
          if (this.field_Ob) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          if (stackIn_3_0 != stackIn_6_1) {
            stackIn_9_0 = this.field_Ob;
            return stackIn_9_0;
          }
          if (param0 != 0) {
            this.field_Bb = (sna) null;
          }
          stackIn_15_0 = (param1.field_wb) ? 0 : 1;
          if (stackIn_15_0 == (this.field_wb ? 1 : 0)) {
            stackIn_18_0 = this.field_wb;
            return stackIn_18_0;
          }
          stackIn_22_0 = !(this.field_Cb >= param1.field_Cb);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("ema.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final boolean f(byte param0) {
        if (param0 == 21) {
          return !this.a(0) ? true : false;
        }
        this.field_Eb = 8L;
        return !this.a(0) ? true : false;
    }

    public static void f(int param0) {
        if (param0 != 0) {
          ema.f(56);
          field_Ab = null;
          field_Lb = null;
          return;
        }
        field_Ab = null;
        field_Lb = null;
    }

    ema(String param0, String param1, long param2) {
        super(0L, (sna) null);
        CharSequence var6 = null;
        try {
          this.field_Eb = param2;
          this.field_Hb = param0;
          this.field_Nb = param1;
          var6 = (CharSequence) ((Object) this.field_Hb);
          fq.a(0, var6);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ema.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(String param0, int param1, String param2) {
        CharSequence var5 = null;
        try {
          this.field_Nb = param2;
          this.field_Hb = param0;
          var5 = (CharSequence) ((Object) this.field_Hb);
          fq.a(param1 + param1, var5);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ema.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Lb = "members-only content";
        field_Ab = "Loading...";
    }
}
