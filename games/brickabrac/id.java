/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id extends mh {
    static int field_Pb;
    long field_gc;
    String field_hc;
    boolean field_Qb;
    mh field_Tb;
    mh field_Rb;
    static String field_bc;
    long field_Xb;
    mh field_cc;
    boolean field_ec;
    int field_Wb;
    int field_kc;
    static String field_jc;
    mh field_Vb;
    int field_ac;
    int field_Zb;
    String field_Yb;
    boolean field_fc;
    static String field_Sb;
    int field_Ub;
    mh field_dc;
    int field_ic;

    public static void h(int param0) {
        int var1 = 102 % ((param0 - 48) / 43);
        field_jc = null;
        field_bc = null;
        field_Sb = null;
    }

    final void a(String param0, String param1, byte param2) {
        CharSequence var6 = null;
        try {
          this.field_hc = param1;
          if (param2 != -121) {
            id var5 = (id) null;
            this.a((id) null, -125);
          }
          this.field_Yb = param0;
          var6 = (CharSequence) ((Object) this.field_hc);
          gb.a(var6, 116);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "id.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    id(String param0, String param1, long param2) {
        super(0L, (mh) null);
        CharSequence var6 = null;
        try {
          this.field_hc = param0;
          this.field_Yb = param1;
          this.field_gc = param2;
          var6 = (CharSequence) ((Object) this.field_hc);
          gb.a(var6, 124);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "id.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int[] a(IsaacGenerator param0, boolean param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var5 = 0;
        int[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = tf.field_g.length;
          if (!lc.a(0, -107)) {
            var2_int--;
          }
          var3 = new int[var2_int];
          for (var4 = 0; var3.length > var4; var4++) {
            var3[var4] = var4;
          }
          if (param1) {
            field_Sb = (String) null;
          }
          ke.a(var3, (byte) 39, param0);
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("id.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean i(int param0) {
        if (param0 != 0) {
          return false;
        }
        return !this.c(2) ? true : false;
    }

    final boolean a(id param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        boolean stackIn_2_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_12_1 = 0;
        boolean stackIn_15_0 = false;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = param0.field_fc;
          if (this.field_fc) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = 1;
          }
          if ((stackIn_2_0 ? 1 : 0) == stackIn_3_1) {
            stackIn_6_0 = this.field_fc;
            return stackIn_6_0;
          }
          if (param1 != -755) {
            var4 = (String) null;
            this.a((String) null, (String) null, (byte) -26);
          }
          stackIn_11_0 = this.field_Qb;
          if (param0.field_Qb) {
            stackIn_12_1 = 0;
          } else {
            stackIn_12_1 = 1;
          }
          if ((stackIn_11_0 ? 1 : 0) == stackIn_12_1) {
            stackIn_15_0 = this.field_Qb;
            return stackIn_15_0;
          }
          stackIn_19_0 = !(this.field_Xb >= param0.field_Xb);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("id.D(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_bc = "Try changing the '<%0>' setting.";
        field_Pb = 0;
        field_jc = "You can spectate this game";
        field_Sb = "Concluded";
    }
}
