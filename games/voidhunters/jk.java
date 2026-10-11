/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends llb {
    static int field_Cb;
    llb field_Ib;
    boolean field_Lb;
    llb field_wb;
    String field_xb;
    long field_zb;
    int field_yb;
    int field_Db;
    String field_Hb;
    boolean field_Eb;
    llb field_Jb;
    boolean field_Fb;
    int field_Gb;
    long field_Kb;
    llb field_Nb;
    int field_Ab;
    int field_vb;
    int field_Bb;
    llb field_Mb;

    final boolean a(int param0, jk param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_12_0 = 0;
        int stackIn_15_1 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_21_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (param1.field_Fb) ? 0 : 1;
          if (stackIn_3_0 == (this.field_Fb ? 1 : 0)) {
            stackIn_5_0 = this.field_Fb;
            return stackIn_5_0;
          }
          if (param0 != 26344) {
            return true;
          }
          stackIn_12_0 = (param1.field_Eb) ? 0 : 1;
          if (this.field_Eb) {
            stackIn_15_1 = 0;
          } else {
            stackIn_15_1 = 1;
          }
          if (stackIn_12_0 == stackIn_15_1) {
            stackIn_21_0 = !(this.field_Kb >= param1.field_Kb);
            return stackIn_21_0;
          }
          stackIn_17_0 = this.field_Eb;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("jk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final boolean i(int param0) {
        int var2 = -19 / ((-46 - param0) / 57);
        return !this.c((byte) 97) ? true : false;
    }

    final void a(String param0, String param1, int param2) {
        CharSequence var6 = null;
        try {
          this.field_xb = param0;
          this.field_Hb = param1;
          if (param2 != -424) {
            jk var5 = (jk) null;
            this.a(-116, (jk) null);
          }
          var6 = (CharSequence) ((Object) this.field_Hb);
          jwa.a(false, var6);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "jk.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    jk(String param0, String param1, long param2) {
        super(0L, (llb) null);
        CharSequence var6 = null;
        try {
          this.field_zb = param2;
          this.field_xb = param1;
          this.field_Hb = param0;
          var6 = (CharSequence) ((Object) this.field_Hb);
          jwa.a(false, var6);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "jk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void h(int param0) {
        sp.field_p = ik.a(param0 - 21167);
        if (param0 != 118) {
          field_Cb = 85;
        }
    }

    static {
    }
}
