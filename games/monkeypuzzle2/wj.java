/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wj extends hf implements vc {
    static String field_h;
    private rj field_m;
    static String field_l;
    static tk field_k;
    static na field_i;
    static ad field_j;

    public final void a(int param0, rj param1) {
        try {
          if (param0 >= -19) {
            field_l = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "wj.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final na c(int param0) {
        if (param0 == 1) {
          return this.a(this.field_m.field_s, param0 ^ 3916);
        }
        ad var3 = (ad) null;
        wj.a((byte) -23, -1, (ad) null, 109);
        return this.a(this.field_m.field_s, param0 ^ 3916);
    }

    final String c(byte param0) {
        int var2 = 33 / ((param0 - 32) / 45);
        return this.a(1, this.field_m.field_s);
    }

    final static le[] a(byte param0, int param1, ad param2, int param3) {
        RuntimeException var4 = null;
        ad var5 = null;
        le[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!wg.a(param3, param1, param2, -3)) {
            return null;
          }
          if (param0 != 83) {
            var5 = (ad) null;
            wj.a((byte) -96, -124, (ad) null, -100);
          }
          stackIn_6_0 = o.a(true);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("wj.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    abstract String a(int param0, String param1);

    final static void a(int param0, wf param1, int param2) {
        hb var5 = null;
        int var4 = 0;
        try {
          var5 = gf.field_c;
          var5.b(true, param2);
          var5.field_h = var5.field_h + 1;
          var4 = var5.field_h;
          var5.b(1, param0 - 74685);
          var5.b(param1.field_e, param0 - 74685);
          var5.a(param1.field_f, false);
          var5.a(-803539344, param1.field_g);
          var5.a(-803539344, param1.field_k);
          if (param0 != 25533) {
            wj.d(80);
          }
          var5.a(-803539344, param1.field_l);
          var5.a(-803539344, param1.field_j);
          var5.a((byte) -59, var4);
          var5.a(-var4 + var5.field_h, (byte) -113);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "wj.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void d(byte param0) {
        if (param0 == 35) {
          if (me.field_f != null) {
            me.field_f.g((byte) -75);
          }
          sc.field_f = new eb();
          jh.field_C.c((byte) 36, sc.field_f);
          return;
        }
        field_j = (ad) null;
        if (me.field_f != null) {
          me.field_f.g((byte) -75);
        }
        sc.field_f = new eb();
        jh.field_C.c((byte) 36, sc.field_f);
    }

    public final void b(int param0, rj param1) {
        rj var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 16926) {
            var4 = (rj) null;
            this.a(35, (rj) null);
            this.a((byte) -88);
          } else {
            this.a((byte) -88);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wj.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean d(int param0) {
        int var1 = 96 / ((37 - param0) / 53);
        if (mc.field_a < 20) {
          return true;
        }
        if (!vg.c(false)) {
          return true;
        }
        if (ue.field_G <= 0) {
          return false;
        }
        if (!ej.a(12931)) {
          return true;
        }
        return false;
    }

    abstract na a(String param0, int param1);

    public final boolean a(boolean param0) {
        if (!param0) {
          field_k = (tk) null;
          if (this.field_m.field_s != null) {
            return 0 == this.field_m.field_s.length() ? true : false;
          }
          return true;
        }
        if (this.field_m.field_s == null) {
          return true;
        }
        if (0 != this.field_m.field_s.length()) {
          return false;
        }
        return true;
    }

    wj(rj param0) {
        try {
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "wj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_l = null;
        if (param0 == -95) {
          field_j = null;
          field_k = null;
          field_h = null;
          field_i = null;
          return;
        }
        wj.d(57);
        field_j = null;
        field_k = null;
        field_h = null;
        field_i = null;
    }

    final static void a(float[] param0, int param1, float[] param2) {
        try {
          if (param1 > -72) {
            field_l = (String) null;
          }
          param0[0] = param0[0] + param2[0];
          param0[1] = param0[1] + param2[1];
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "wj.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "Well done!";
        field_l = "Player names can be up to 12 letters, numbers and underscores";
        field_k = new tk();
        field_i = new na();
    }
}
