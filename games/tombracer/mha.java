/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mha extends rj {
    static long field_D;
    private nua field_z;
    private int field_A;
    private static String[] field_B;
    static int field_C;
    static String field_F;
    static int field_E;

    final String d(byte param0) {
        int var2 = -38 / ((-58 - param0) / 60);
        if (!this.field_f) {
          return null;
        }
        return this.field_z.a(127);
    }

    public static void b(int param0) {
        field_B = null;
        if (param0 != -23897) {
          return;
        }
        field_F = null;
    }

    final void a(int param0, int param1, ae param2, int param3) {
        try {
          this.field_A = this.field_A + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mha.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    mha(nua param0) {
        try {
          this.field_z = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mha.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        iu var15 = null;
        iu var16 = null;
        iu var13 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = TombRacer.field_G ? 1 : 0;
        int var9Lifetime1;
        int var10Lifetime1;
        super.a(param0, param1, 0, param3);
        if (param3 != param2) {
          return;
        }
        int var5 = (this.field_m >> 1) + this.field_i + param0;
        int var6 = (this.field_p >> 1) + param1 + this.field_n;
        it var8 = this.field_z.b(-4666);
        if (gla.field_p == var8) {
          var15 = pq.field_b[0];
          var9 = var15.field_n << 1;
          var10 = var15.field_k << 1;
          if (null == aj.field_l) {
            aj.field_l = new iu(var9, var10);
            nm.a(aj.field_l, (byte) 108);
            var15.a(112, 144, var15.field_n << 4, var15.field_k << 4, -this.field_A << 10, 4096);
            pfa.a(1);
            aj.field_l.a(-var15.field_n + var5, var6 - var15.field_k, 256);
            return;
          }
          if (aj.field_l.field_m < var9) {
            aj.field_l = new iu(var9, var10);
            nm.a(aj.field_l, (byte) 108);
            var15.a(112, 144, var15.field_n << 4, var15.field_k << 4, -this.field_A << 10, 4096);
            pfa.a(1);
            aj.field_l.a(-var15.field_n + var5, var6 - var15.field_k, 256);
            return;
          }
          if (var10 > aj.field_l.field_q) {
            aj.field_l = new iu(var9, var10);
            nm.a(aj.field_l, (byte) 108);
            var15.a(112, 144, var15.field_n << 4, var15.field_k << 4, -this.field_A << 10, 4096);
            pfa.a(1);
            aj.field_l.a(-var15.field_n + var5, var6 - var15.field_k, 256);
            return;
          }
          nm.a(aj.field_l, (byte) 95);
          bea.a();
          var15.a(112, 144, var15.field_n << 4, var15.field_k << 4, -this.field_A << 10, 4096);
          pfa.a(1);
          aj.field_l.a(-var15.field_n + var5, var6 - var15.field_k, 256);
          return;
        }
        if (tea.field_b == var8) {
          var16 = pq.field_b[0];
          var9Lifetime1 = var16.field_n << 1;
          var10Lifetime1 = var16.field_k << 1;
          if (null == aj.field_l) {
            aj.field_l = new iu(var9Lifetime1, var10Lifetime1);
            nm.a(aj.field_l, (byte) 108);
            var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -this.field_A << 10, 4096);
            pfa.a(1);
            aj.field_l.a(-var16.field_n + var5, var6 - var16.field_k, 256);
            return;
          }
          if (aj.field_l.field_m < var9Lifetime1) {
            aj.field_l = new iu(var9Lifetime1, var10Lifetime1);
            nm.a(aj.field_l, (byte) 108);
            var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -this.field_A << 10, 4096);
            pfa.a(1);
            aj.field_l.a(-var16.field_n + var5, var6 - var16.field_k, 256);
            return;
          }
          if (var10Lifetime1 > aj.field_l.field_q) {
            aj.field_l = new iu(var9Lifetime1, var10Lifetime1);
            nm.a(aj.field_l, (byte) 108);
            var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -this.field_A << 10, 4096);
            pfa.a(1);
            aj.field_l.a(-var16.field_n + var5, var6 - var16.field_k, 256);
            return;
          }
          nm.a(aj.field_l, (byte) 95);
          bea.a();
          var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -this.field_A << 10, 4096);
          pfa.a(1);
          aj.field_l.a(-var16.field_n + var5, var6 - var16.field_k, 256);
          return;
        }
        if (fp.field_c == var8) {
          var13 = pq.field_b[2];
          var13.a(var5 - (var13.field_m >> 1), var6 - (var13.field_q >> 1), 256);
          return;
        }
        if (uh.field_k != var8) {
          return;
        }
        iu var12 = pq.field_b[1];
        var12.a(var5 - (var12.field_m >> 1), -(var12.field_q >> 1) + var6, 256);
    }

    final boolean a(ae param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mha.S(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_B = new String[5];
        field_B[3] = "Floating Rotator";
        field_B[0] = "Wheeled";
        field_B[4] = "Mirror Fixed";
        field_B[1] = "Mirror Base";
        field_B[2] = "Rotator";
        field_E = 480;
        field_F = "Cancel";
    }
}
