/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends fb {
    static String field_O;
    static qk field_M;
    static ci field_P;
    static String field_N;
    static String field_Q;

    private ki(String param0, jm param1, rg param2) {
        super(param0, param1, param2);
        try {
          this.field_n = a.field_a.field_k;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ki.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        int stackIn_10_0 = 0;
        boolean stackIn_11_1 = false;
        int stackIn_19_0 = 0;
        boolean stackIn_20_1 = false;
        int stackIn_29_0 = 0;
        boolean stackIn_30_1 = false;
        int stackIn_37_0 = 0;
        boolean stackIn_38_1 = false;
        if (oc.field_p != null) {
          oc.field_p.b(param0 ^ 16777215, param1);
        }
        if (pd.field_Lb == null) {
          if (param0 == 0) {
            if (wn.field_e &&
              ma.field_D) {
              stackIn_29_0 = -7093;
              stackIn_30_1 = (param1) && (ak.a(true));
              jb.a(stackIn_29_0, stackIn_30_1);
            }
            return;
          }
          ki.b(false);
          if (wn.field_e &&
            ma.field_D) {
            stackIn_37_0 = -7093;
            stackIn_38_1 = (param1) && (ak.a(true));
            jb.a(stackIn_37_0, stackIn_38_1);
          }
          return;
        }
        pd.field_Lb.b(16777215, param1);
        if (param0 == 0) {
          if (wn.field_e &&
            ma.field_D) {
            stackIn_10_0 = -7093;
            stackIn_11_1 = (param1) && (ak.a(true));
            jb.a(stackIn_10_0, stackIn_11_1);
          }
          return;
        }
        ki.b(false);
        if (!wn.field_e) {
          return;
        }
        if (!ma.field_D) {
          return;
        }
        stackIn_19_0 = -7093;
        stackIn_20_1 = (param1) && (ak.a(true));
        jb.a(stackIn_19_0, stackIn_20_1);
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        this.field_I = !this.field_I ? true : false;
        super.a(param0, param1, param2, param3);
    }

    public static void b(boolean param0) {
        field_N = null;
        field_Q = null;
        if (param0) {
          field_O = null;
          field_P = null;
          field_M = null;
          return;
        }
        ki.a(-59, true);
        field_O = null;
        field_P = null;
        field_M = null;
    }

    ki(String param0, rg param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_I = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ki.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Chess.field_G;
        try {
          var5 = ge.field_eb;
          var1 = var5;
          var2 = param0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1_ref), "ki.CA(" + param0 + ')');
        }
    }

    private ki(String param0, rg param1) {
        this(param0, a.field_a.field_a, param1);
        try {
          this.field_n = a.field_a.field_k;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ki.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_O = "Ask to join <%0>'s game";
        field_Q = "To server list";
        field_N = "Enter name of player to add to list";
    }
}
