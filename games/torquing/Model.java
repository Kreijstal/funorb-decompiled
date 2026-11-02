/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Model extends IntrusiveNode {
    static int[] field_p;
    pj field_k;
    static int[] field_m;
    static gd field_o;
    mp field_q;
    static Sprite field_r;
    static String[] field_n;
    static String field_j;
    MeshGeometry field_l;

    final static void trimToUsedCounts(Model model, byte obfuscationGuard) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        mp var4 = null;
        MeshGeometry var5 = null;
        int var3Lifetime1;
        int var3Lifetime2;
        try {
          var5 = model.field_l;
          if (var5.field_M.length > var5.field_f) {
            var3 = var5.field_f;
            var5.field_M = u.a(32681, var5.field_M, var3);
            var5.field_B = u.a(32681, var5.field_B, var3);
            var5.field_E = u.a(32681, var5.field_E, var3);
          }
          if (var5.vertexCount < var5.vertexX.length) {
            var3Lifetime1 = var5.vertexCount;
            var5.vertexX = u.a(32681, var5.vertexX, var3Lifetime1);
            var5.vertexY = u.a(32681, var5.vertexY, var3Lifetime1);
            var5.vertexZ = u.a(32681, var5.vertexZ, var3Lifetime1);
            var5.field_j = mn.a(-6058, var5.field_j, 0, var3Lifetime1);
            if (null != var5.field_D) {
              var5.field_D = cc.a(var3Lifetime1, (byte) 127, var5.field_D);
            }
            var5.field_m = qi.a(var3Lifetime1, var5.field_m, (byte) 60);
            var4 = model.field_q;
            if (null != var4.field_u) {
              var4.field_u = mn.a(-6058, var4.field_u, 255, var3Lifetime1);
            }
          }
          if (null != var5.field_u &&
            var5.field_u.length > var5.field_k) {
            var3Lifetime2 = var5.field_k;
            var5.field_s = cc.a(var3Lifetime2, (byte) 23, var5.field_s);
            var5.field_u = qi.a(var3Lifetime2, var5.field_u, (byte) 60);
            var5.field_n = qi.a(var3Lifetime2, var5.field_n, (byte) 60);
            var5.field_x = qi.a(var3Lifetime2, var5.field_x, (byte) 60);
          }
          if (obfuscationGuard < -55) {
            return;
          }
          Model.a(-88);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("kh.A(");
          if (model == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rb.wrapThrowable((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 24997) {
          field_n = null;
          field_j = null;
          field_p = null;
          field_r = null;
          field_m = null;
          field_o = null;
          return;
        }
        Model var2 = (Model) null;
        Model.trimToUsedCounts((Model) null, (byte) -125);
        field_n = null;
        field_j = null;
        field_p = null;
        field_r = null;
        field_m = null;
        field_o = null;
    }

    public Model() {
        this.field_k = null;
        this.field_l = null;
        this.field_q = null;
    }

    Model(MeshGeometry param0) {
        try {
          this.field_k = null;
          this.field_l = param0;
          this.field_q = new mp();
        } catch (RuntimeException runtimeException) {
          throw rb.wrapThrowable((Throwable) ((Object) runtimeException), "kh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    Model(Model param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        try {
          this.field_l = new MeshGeometry(param0.field_l, param1, param2, param3, param4);
          this.field_k = null;
          this.field_q = new mp();
        } catch (RuntimeException runtimeException) {
          throw rb.wrapThrowable((Throwable) ((Object) runtimeException), "kh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_m = new int[8192];
        field_p = new int[25];
        dk.a(field_p, 0, 25, -1);
        field_p[9] = 1;
        field_p[8] = 0;
        field_j = "Connection restored.";
    }
}
