/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends pl {
    static int field_I;
    static int[] field_G;
    static od field_H;
    static String field_J;
    private int field_K;
    private dk field_F;

    final void a(int param0, int param1, int param2, ub param3) {
        try {
          this.field_K = this.field_K + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "kc.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String c(boolean param0) {
        if (this.field_v) {
          return this.field_F.a(-2864);
        }
        if (!param0) {
          return null;
        }
        this.field_K = -116;
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        o var15 = null;
        o var18 = null;
        o var12 = null;
        o var21 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = wizardrun.field_H;
        int var9Lifetime1;
        int var10Lifetime1;
        super.a(param0, param1, param2, param3);
        if (param2 != 0) {
          return;
        }
        int var5 = this.field_o + param0 + (this.field_r >> 1);
        int var6 = (this.field_n >> 1) + (param3 + this.field_l);
        ok var8 = this.field_F.a(true);
        if (nf.field_c == var8) {
          var15 = te.field_k[0];
          var9 = var15.field_x << 1;
          var10 = var15.field_s << 1;
          if (null == ue.field_d) {
            ue.field_d = new o(var9, var10);
            ud.a(ue.field_d, false);
            var15.b(112, 144, var15.field_x << 4, var15.field_s << 4, -this.field_K << 10, 4096);
            bb.b(4);
            ue.field_d.a(var5 - var15.field_x, var6 - var15.field_s, 256);
            return;
          }
          if (ue.field_d.field_z < var9) {
            ue.field_d = new o(var9, var10);
            ud.a(ue.field_d, false);
            var15.b(112, 144, var15.field_x << 4, var15.field_s << 4, -this.field_K << 10, 4096);
            bb.b(4);
            ue.field_d.a(var5 - var15.field_x, var6 - var15.field_s, 256);
            return;
          }
          if (ue.field_d.field_p >= var10) {
            ud.a(ue.field_d, false);
            ed.d();
            var15.b(112, 144, var15.field_x << 4, var15.field_s << 4, -this.field_K << 10, 4096);
            bb.b(4);
            ue.field_d.a(var5 - var15.field_x, var6 - var15.field_s, 256);
            return;
          }
          ue.field_d = new o(var9, var10);
          ud.a(ue.field_d, false);
          var15.b(112, 144, var15.field_x << 4, var15.field_s << 4, -this.field_K << 10, 4096);
          bb.b(4);
          ue.field_d.a(var5 - var15.field_x, var6 - var15.field_s, 256);
          return;
        }
        if (l.field_S == var8) {
          var18 = te.field_k[0];
          var9Lifetime1 = var18.field_x << 1;
          var10Lifetime1 = var18.field_s << 1;
          if (null == ue.field_d) {
            ue.field_d = new o(var9Lifetime1, var10Lifetime1);
            ud.a(ue.field_d, false);
            var18.b(112, 144, var18.field_x << 4, var18.field_s << 4, -this.field_K << 10, 4096);
            bb.b(4);
            ue.field_d.a(var5 - var18.field_x, var6 - var18.field_s, 256);
            return;
          }
          if (ue.field_d.field_z < var9Lifetime1) {
            ue.field_d = new o(var9Lifetime1, var10Lifetime1);
            ud.a(ue.field_d, false);
            var18.b(112, 144, var18.field_x << 4, var18.field_s << 4, -this.field_K << 10, 4096);
            bb.b(4);
            ue.field_d.a(var5 - var18.field_x, var6 - var18.field_s, 256);
            return;
          }
          if (ue.field_d.field_p >= var10Lifetime1) {
            ud.a(ue.field_d, false);
            ed.d();
            var18.b(112, 144, var18.field_x << 4, var18.field_s << 4, -this.field_K << 10, 4096);
            bb.b(4);
            ue.field_d.a(var5 - var18.field_x, var6 - var18.field_s, 256);
            return;
          }
          ue.field_d = new o(var9Lifetime1, var10Lifetime1);
          ud.a(ue.field_d, false);
          var18.b(112, 144, var18.field_x << 4, var18.field_s << 4, -this.field_K << 10, 4096);
          bb.b(4);
          ue.field_d.a(var5 - var18.field_x, var6 - var18.field_s, 256);
          return;
        }
        if (hg.field_c == var8) {
          var12 = te.field_k[2];
          var12.a(-(var12.field_z >> 1) + var5, -(var12.field_p >> 1) + var6, 256);
          return;
        }
        if (gf.field_V == var8) {
          var21 = te.field_k[1];
          var21.a(-(var21.field_z >> 1) + var5, var6 - (var21.field_p >> 1), 256);
          return;
        }
    }

    final boolean a(ub param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 8) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kc.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 == 112) {
          field_G = null;
          field_J = null;
          field_H = null;
          return;
        }
        field_G = (int[]) null;
        field_G = null;
        field_J = null;
        field_H = null;
    }

    kc(dk param0) {
        try {
          this.field_F = param0;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "kc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_J = "Names should contain a maximum of 12 characters";
        field_G = new int[256];
    }
}
