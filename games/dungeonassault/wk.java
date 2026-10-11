/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static String[] field_a;
    private int field_d;
    private int field_e;
    static char[] field_f;
    float field_j;
    private bl[] field_i;
    static int field_g;
    static int field_h;
    private int field_c;
    String field_b;

    final boolean a(boolean param0) {
        int var3;
        bl var4;
        var3 = DungeonAssault.field_K;
        if (param0) {
          wk.a(73, -60);
        }
        while (this.field_e > this.field_d) {
          var4 = this.field_i[this.field_d];
          if (!var4.field_q.a(-14354)) {
            this.a((byte) 12, 0, var4);
            return false;
          }
          if (0 <= var4.field_m &&
            !var4.field_q.a(false, var4.field_m)) {
            this.a((byte) 12, var4.field_q.c(-123, var4.field_m), var4);
            return false;
          }
          if (var4.field_h != null &&
            !var4.field_q.a(false, var4.field_h)) {
            this.a((byte) 12, var4.field_q.b(var4.field_h, -1), var4);
            return false;
          }
          if (var4.field_m < 0 &&
            var4.field_h == null &&
            null != var4.field_f &&
            !var4.field_q.a((byte) 59)) {
            this.a((byte) 12, var4.field_q.b(100), var4);
            return false;
          }
          this.field_d = this.field_d + 1;
        }
        return true;
    }

    final static void a(int param0, String param1, se param2, int param3, int[] param4, int param5) {
        tf var6 = null;
        if (param5 != 31139) {
          return;
        }
        try {
          var6 = new tf(param2, param1, param4);
          var6.b(-param2.field_H + param3, 32, -var6.field_i + param0);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "wk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    private final void a(byte param0, int param1, bl param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        int[] var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = (float)(this.field_d + 1) + (float)param1 / 100.0f;
          this.field_j = (float)this.field_c * var4_float / (float)(this.field_e + 1);
          if (param0 != 12) {
            var5 = (int[]) null;
            wk.a(-109, (String) null, (se) null, 89, (int[]) null, -3);
          }
          if (param1 != 0) {
            this.field_b = param2.field_f + " - " + param1 + "%";
            return;
          }
          this.field_b = param2.field_g;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("wk.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          wk.a(105, 105);
          field_a = null;
          field_f = null;
          return;
        }
        field_a = null;
        field_f = null;
    }

    final static void a(int param0) {
        if (param0 != -1) {
          wk.c(true);
          sn.a(66, 17);
          return;
        }
        sn.a(66, 17);
    }

    final static cn[] a(cn[] param0, int param1) {
        int var3 = 0;
        cn[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        cn[] var5 = null;
        cn[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          var5 = new cn[param0.length];
          var2 = var5;
          for (var3 = param1; param0.length > var3; var3++) {
            var5[var3] = g.a(param0[var3], (byte) -105);
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("wk.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int c(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = DungeonAssault.field_K;
        try {
          lg.field_w.a(wo.field_b, (byte) 66, ci.field_m, true);
          lg.field_w.b(true);
          while (ha.b((byte) 47)) {
            lg.field_w.a(126, mm.field_t, ob.field_Yb);
          }
          if (param0) {
            stackIn_6_0 = 11;
            return stackIn_6_0;
          }
          if (ki.field_f != -1) {
            var1_int = ki.field_f;
            sn.a(16, -1);
            stackIn_10_0 = var1_int;
            return stackIn_10_0;
          }
          if (cd.field_b) {
            stackIn_14_0 = 3;
            return stackIn_14_0;
          }
          if (wd.field_d == ql.field_f) {
            stackIn_17_0 = 1;
            return stackIn_17_0;
          }
          if (!im.field_b.b(36)) {
            stackIn_21_0 = 1;
            return stackIn_21_0;
          }
          if (ol.field_i != ql.field_f) {
            return -1;
          }
          stackIn_25_0 = 2;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "wk.H(" + param0 + ')');
        }
    }

    private final void a(nh param0, String param1, String param2, boolean param3, int param4, String param5) {
        bl[] var10 = null;
        bl var9 = null;
        bl var11 = null;
        int fieldTemp$0 = 0;
        try {
          if (param3) {
            int[] var8 = (int[]) null;
            wk.a(13, (String) null, (se) null, -71, (int[]) null, -117);
          }
          if (this.field_i.length <= this.field_e) {
            var10 = new bl[this.field_e * 2];
            bl[] var7 = var10;
            cj.a(this.field_i, 0, var10, 0, this.field_e);
            this.field_i = var10;
          }
          var9 = new bl();
          var11 = var9;
          bl var7_ref = var11;
          var11.field_g = param5;
          var11.field_h = param2;
          var11.field_m = param4;
          var11.field_f = param1;
          var11.field_q = param0;
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_i[fieldTemp$0] = var9;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "wk.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, String param1, String param2, nh param3, int param4) {
        try {
          this.a(param3, param0, param1, false, -1, param2);
          if (param4 >= -75) {
            cn[] var7 = (cn[]) null;
            wk.a((cn[]) null, 114);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "wk.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, String param2, nh param3) {
        if (param1 != 237) {
          return;
        }
        try {
          this.a(param3, param2, (String) null, false, -1, param0);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "wk.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var3 = 0;
        int var2 = 0;
        int var3Lifetime1;
        if (0 != (param0 & 7)) {
          var2 = -(param0 & 7) + 8;
        }
        if (param1 == 18605) {
          var3 = var2 + param0;
          return var3;
        }
        wk.c(true);
        var3Lifetime1 = var2 + param0;
        return var3Lifetime1;
    }

    wk(int param0) {
        this.field_i = new bl[16];
        this.field_c = param0;
    }

    static {
        field_f = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
