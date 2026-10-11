/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class p {
    int field_d;
    static String field_f;
    int field_k;
    static e field_h;
    int field_i;
    static float[] field_g;
    int field_l;
    int field_c;
    int field_e;
    static String field_b;
    static int field_j;
    static int[] field_a;

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    public static void a(boolean param0) {
        field_f = null;
        field_b = null;
        if (!param0) {
          p.a(-114);
        }
        field_g = null;
        field_a = null;
        field_h = null;
    }

    final static hj a(int param0, byte param1, int param2) {
        int var3;
        hj var4;
        int var5;
        int var6;
        int var3Lifetime1;
        var5 = HoldTheLine.field_D;
        if (null == ra.field_X) {
          if (!fb.field_i.b("world_images", -128)) {
            return hi.a(111, (byte) -112, 84);
          }
          ra.field_X = si.a(fb.field_i, 33, "world_images", "");
          ok.a(32381);
          mi.field_c = new hj[4];
          for (var3 = 0; var3 < 4; var3++) {
            mi.field_c[var3] = ra.field_X[var3].e();
            qm.a(mi.field_c[var3], 64, -1);
            mi.field_c[var3].f();
            rf.field_ab.a(-rf.field_ab.field_s + mi.field_c[var3].field_s >> 1, -rf.field_ab.field_y + mi.field_c[var3].field_y >> 1);
          }
          ih.field_t = new hj[4];
          var6 = 0;
          var3Lifetime1 = var6;
          while (var6 < 4) {
            ih.field_t[var6] = ra.field_X[var6].e();
            qm.a(ih.field_t[var6], 128, -1);
            var4 = ih.field_t[var6].e();
            var4.f();
            kj.field_q.d(17, 0, 84, 84);
            ih.field_t[var6].f();
            var4.d(0, 0, 64);
            var6++;
          }
          ug.b(-1);
        }
        if (param1 >= -31) {
          return (hj) null;
        }
        if (param0 == 1) {
          return mi.field_c[param2];
        }
        if (param0 != 2) {
          return ra.field_X[param2];
        }
        return ih.field_t[param2];
    }

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = HoldTheLine.field_D;
        try {
          var5 = qg.field_d;
          var1 = var5;
          var2 = 0;
          if (param0 < 76) {
            p.a(false);
          }
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
          throw kk.a((Throwable) ((Object) var1_ref), "p.H(" + param0 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2) {
        hj var3 = tn.field_b.field_i[kj.b(2, 6)];
        if (param0 != -61) {
          return;
        }
        var3.d(param1, param2, var3.field_o >> 1, var3.field_v >> 1, 64);
    }

    static {
        field_f = "<img=11>";
        field_g = new float[]{0.0f, 0.5f, 1.0f, 100.0f, 800.0f, 80.0f, 0.0f, 10.0f};
        field_h = new e(8, 0, 4, 1);
        field_b = "Mouse over an icon for details";
        field_a = new int[128];
    }
}
