/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg extends pa {
    static ra field_J;
    static int field_H;
    static String field_L;
    static int field_I;
    static String field_K;
    static int field_E;
    static int field_F;

    final static void a(String param0, int param1, String param2) {
        try {
          if (param1 >= -10) {
            field_F = 94;
          }
          r.a(param2, 126, false, param0);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "rg.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 != 0) {
          field_E = -66;
          if (param1 != 0) {
            if (this.field_i == 0) {
              return;
            }
            if (this.field_n != 0) {
              se.field_j.a(this.field_k + param2, this.field_k + (param2 + this.field_i), (byte) -75, param0 + this.field_j, this.field_n + (this.field_j + param0));
              this.field_z.a(param0 + this.field_j, param1, param2 + this.field_k, 0);
              se.field_j.b(3);
              return;
            }
            return;
          }
          if (null != this.field_h) {
            this.field_h.a(16777215, true, param0, (ga) (this), param2);
          }
          if (this.field_i == 0) {
            return;
          }
          if (this.field_n == 0) {
            return;
          }
          se.field_j.a(this.field_k + param2, this.field_k + (param2 + this.field_i), (byte) -75, param0 + this.field_j, this.field_n + (this.field_j + param0));
          this.field_z.a(param0 + this.field_j, param1, param2 + this.field_k, 0);
          se.field_j.b(3);
          return;
        }
        if (param1 == 0) {
          if (null == this.field_h) {
            if (this.field_i == 0) {
              return;
            }
            if (this.field_n != 0) {
              se.field_j.a(this.field_k + param2, this.field_k + (param2 + this.field_i), (byte) -75, param0 + this.field_j, this.field_n + (this.field_j + param0));
              this.field_z.a(param0 + this.field_j, param1, param2 + this.field_k, 0);
              se.field_j.b(3);
              return;
            }
            return;
          }
          this.field_h.a(16777215, true, param0, (ga) (this), param2);
        }
        if (this.field_i == 0) {
          return;
        }
        if (this.field_n != 0) {
          se.field_j.a(this.field_k + param2, this.field_k + (param2 + this.field_i), (byte) -75, param0 + this.field_j, this.field_n + (this.field_j + param0));
          this.field_z.a(param0 + this.field_j, param1, param2 + this.field_k, 0);
          se.field_j.b(3);
          return;
        }
    }

    rg(int param0, int param1, int param2, int param3, io param4, ga param5) {
        super(param0, param1, param2, param3, param4, (sk) null);
        try {
          this.field_z = param5;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "rg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        if (param0 == 13885) {
          field_J = null;
          field_K = null;
          field_L = null;
          return;
        }
        rg.g(109);
        field_J = null;
        field_K = null;
        field_L = null;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            field_H = 43;
          }
          stackIn_6_0 = (this.b(param3, 21224, param2, param4, param0)) && (super.a(param0, 1, param2, param3, param4, param5, param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("rg.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void b(boolean param0) {
        this.field_z.a(param0);
    }

    final static void a(oi param0, boolean param1) {
        int var2_int = 0;
        vn var3 = null;
        if (hm.field_E == null) {
          return;
        }
        try {
          var2_int = param0.field_I + param0.field_x;
          if (param1) {
            field_H = 9;
          }
          var3 = new vn(var2_int, var2_int);
          var3.a();
          hm.field_E.d(0, 0, var2_int, var2_int);
          cn.field_f.b(44);
          hm.field_E = var3;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "rg.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_L = "Left-click or 'ESC': Skip cutscene";
        field_H = 4;
        field_J = new ra();
        field_I = 0;
        field_K = "DETONATE";
        field_F = -1;
    }
}
