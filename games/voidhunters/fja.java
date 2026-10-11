/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fja extends rqa {
    static int field_o;
    static String field_r;
    static caa[] field_q;
    static rq field_p;

    fja(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_p = null;
        field_r = null;
        int var1 = 42 / ((param0 - 0) / 43);
        field_q = null;
    }

    final static fs[] a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        fs[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        fs[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4Lifetime1;
        var5 = VoidHunters.field_G;
        try {
          stackIn_4_0 = (param0[-1 + param0.length] != 0) ? 0 : 1;
          var2_int = stackIn_4_0;
          if (var2_int != 0) {
            stackIn_7_0 = param0.length;
          } else {
            stackIn_7_0 = 1 + param0.length;
          }
          var3 = new fs[stackIn_7_0];
          var4 = 0;
          if (param1 != 2) {
            field_q = (caa[]) null;
          }
          for (var4Lifetime1 = 0; param0.length > var4Lifetime1; var4Lifetime1++) {
            var3[var4Lifetime1] = new fs(param0[var4Lifetime1], 2);
          }
          if (var4Lifetime1 < var3.length) {
            var3[var4Lifetime1] = new fs(0, 2);
          }
          stackIn_15_0 = var3;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("fja.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        pca.field_i = new uj[13];
        pca.field_i[0] = (uj) ((Object) new nfa());
        pca.field_i[1] = (uj) ((Object) new rea());
        pca.field_i[2] = (uj) ((Object) new mcb());
        if (param0 == 11) {
          pca.field_i[3] = (uj) ((Object) new qsb());
          pca.field_i[4] = (uj) ((Object) new gb());
          pca.field_i[5] = (uj) ((Object) new uw());
          pca.field_i[6] = (uj) ((Object) new vdb());
          pca.field_i[7] = (uj) ((Object) new lg());
          pca.field_i[8] = (uj) ((Object) new nnb());
          pca.field_i[9] = (uj) ((Object) new kib());
          pca.field_i[10] = (uj) ((Object) new pva());
          pca.field_i[11] = (uj) ((Object) new fpa());
          pca.field_i[12] = (uj) ((Object) new hka());
          return;
        }
        fja.a(-61);
        pca.field_i[3] = (uj) ((Object) new qsb());
        pca.field_i[4] = (uj) ((Object) new gb());
        pca.field_i[5] = (uj) ((Object) new uw());
        pca.field_i[6] = (uj) ((Object) new vdb());
        pca.field_i[7] = (uj) ((Object) new lg());
        pca.field_i[8] = (uj) ((Object) new nnb());
        pca.field_i[9] = (uj) ((Object) new kib());
        pca.field_i[10] = (uj) ((Object) new pva());
        pca.field_i[11] = (uj) ((Object) new fpa());
        pca.field_i[12] = (uj) ((Object) new hka());
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -119) {
            stackIn_4_0 = new nc(frb.a(231, 107));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("fja.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_r = "Cancel";
        field_o = 50;
    }
}
