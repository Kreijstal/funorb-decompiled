/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends v implements sg {
    static int field_jb;
    private ng field_gb;
    static int[] field_hb;
    static String field_fb;
    static String field_ib;
    static sl field_cb;
    static uf field_eb;
    static int[] field_db;
    static int field_bb;

    private final ng a(String param0, int param1, gg param2) {
        ng var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ng stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ng(param0, param2);
          var4.field_q = (j) ((Object) new cl());
          var5 = -6 + this.field_l;
          this.field_l = this.field_l + 38;
          var4.a((byte) 117, 15, 30, -16 + this.field_p - 14, var5);
          if (param1 != 2) {
            field_cb = (sl) null;
          }
          this.a(0, var4);
          this.b((byte) 112);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("nh.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final static boolean g(byte param0) {
        if (param0 <= 84) {
          nh.a(true, 5, 82, -78);
          if (null == tf.field_h) {
            return false;
          }
          if (tf.field_h.c(-1)) {
            return true;
          }
          return false;
        }
        if (null == tf.field_h) {
          return false;
        }
        if (tf.field_h.c(-1)) {
          return true;
        }
        return false;
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        if (param0) {
          if (bg.field_Q[param2] < bg.field_Q[param3]) {
            return true;
          }
          if (bg.field_Q[param2] > bg.field_Q[param3]) {
            return false;
          }
          if (bj.field_b[param2] < bj.field_b[param3]) {
            return true;
          }
          if (bj.field_b[param3] < bj.field_b[param2]) {
            return false;
          }
          if (param1 != 0) {
            nh.l(19);
          }
          var4 = ea.field_a[param2] + (rk.field_p[param2] + cb.field_e[param2]);
          var5 = cb.field_e[param3] + (rk.field_p[param3] + ea.field_a[param3]);
          if (var4 < var5) {
            return true;
          }
          if (var5 < var4) {
            return false;
          }
          return !(param2 >= param3);
        }
        if (bj.field_b[param2] < bj.field_b[param3]) {
          return true;
        }
        if (bj.field_b[param2] > bj.field_b[param3]) {
          return false;
        }
        if (bg.field_Q[param2] < bg.field_Q[param3]) {
          return true;
        }
        if (bg.field_Q[param2] > bg.field_Q[param3]) {
          return false;
        }
        if (param1 == 0) {
          var4Lifetime1 = ea.field_a[param2] + (rk.field_p[param2] + cb.field_e[param2]);
          var5Lifetime1 = cb.field_e[param3] + (rk.field_p[param3] + ea.field_a[param3]);
          if (var4Lifetime1 < var5Lifetime1) {
            return true;
          }
          if (var5Lifetime1 < var4Lifetime1) {
            return false;
          }
          return !(param2 >= param3);
        }
        nh.l(19);
        var4Lifetime2 = ea.field_a[param2] + (rk.field_p[param2] + cb.field_e[param2]);
        var5Lifetime2 = cb.field_e[param3] + (rk.field_p[param3] + ea.field_a[param3]);
        if (var4Lifetime2 < var5Lifetime2) {
          return true;
        }
        if (var5Lifetime2 < var4Lifetime2) {
          return false;
        }
        if (param2 >= param3) {
          return false;
        }
        return true;
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4) {
            field_db = (int[]) null;
          }
          if (param0 != this.field_gb) {
            return;
          }
          this.e(param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("nh.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    nh(si param0, ll param1) {
        super(param0, 200, 150);
        Object var3 = null;
        ee var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (dj.field_P != param1) {
            if (de.field_b == param1) {
              this.field_l = this.field_l + 10;
              var3 = uc.field_T;
              if (nh.g((byte) 94)) {
                this.field_l = this.field_l + 20;
                var3 = hd.field_g;
              }
            } else {
              if (tj.field_d == param1) {
                var3 = jd.field_d;
                this.field_l = this.field_l + 30;
              }
            }
          } else {
            var3 = d.field_z;
          }
          var4 = new ee((String) (var3), (gg) null);
          var4.field_m = 0;
          var4.field_i = 50;
          var4.field_p = this.field_p;
          var4.field_l = 80;
          var4.field_q = (j) ((Object) new bc(ug.field_f, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a(0, var4);
          this.field_gb = this.a(ab.field_n, 2, (gg) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("nh.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void l(int param0) {
        field_hb = null;
        field_eb = null;
        field_ib = null;
        field_cb = null;
        if (param0 == -25725) {
          field_fb = null;
          field_db = null;
          return;
        }
        field_eb = (uf) null;
        field_fb = null;
        field_db = null;
    }

    private final void e(boolean param0) {
        if (!this.field_K) {
          return;
        }
        this.field_K = param0 ? true : false;
    }

    static {
        field_hb = new int[]{0, 3, 3, 3, 2, 1, 3, 3};
        field_ib = "Error connecting to server. Please try using a different server.";
        field_fb = "Cancel";
        field_db = new int[]{468, 6, 168, 40};
        field_cb = new sl();
        field_bb = 5;
    }
}
