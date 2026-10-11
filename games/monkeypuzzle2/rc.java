/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends kc {
    private String field_e;
    static int field_g;
    static int field_f;
    static double field_l;
    static int[] field_j;
    static md field_k;
    static String field_i;
    private String field_h;

    final fk a(boolean param0) {
        if (param0) {
          return (fk) null;
        }
        return te.field_a;
    }

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var4_int = -1;
          var5 = param0;
          if (param2 < 8) {
            stackIn_3_0 = -111;
            return stackIn_3_0;
          }
          while (param1 > var5) {
            var4_int = var4_int >>> 8 ^ hb.field_k[(param3[var5] ^ var4_int) & 255];
            var5++;
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("rc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        gk var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new gk(param0);
          var3 = var9.a((byte) 114);
          if (param1 <= 114) {
            field_i = (String) null;
          }
          var4 = var9.e(127);
          if (var4 >= 0 && (fa.field_r == 0 ||
            !(fa.field_r < var4))) {
            if (var3 == 0) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.a(var13, var4, -127, 0);
              stackIn_23_0 = var5;
              return stackIn_23_0;
            }
            var5_int = var9.e(-80);
            if (var5_int >= 0 && (fa.field_r == 0 ||
              !(fa.field_r < var5_int))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (1 != var3) {
                var7 = oe.field_o;
                synchronized (var7) {
                  oe.field_o.a(57, var12, var9);
                }
              } else {
                tg.a(var12, var5_int, param0, var4, 9);
              }
              stackIn_21_0 = var6;
              return stackIn_21_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("rc.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(float param0, int param1, byte param2) {
        float[] var6 = null;
        float[] var5 = null;
        float[] var4 = null;
        float[] var3 = null;
        float[] var6Lifetime1;
        float[] var5Lifetime1;
        float[] var4Lifetime1;
        float[] var3Lifetime1;
        if (0 >= param1) {
          bl.field_f = -1;
          mh.field_D = -1;
          return;
        }
        if (param1 >= 17) {
          bl.field_f = -1;
          mh.field_D = -1;
          return;
        }
        if (param1 == 16) {
          bl.field_f = (int)pe.field_d[param1].field_e[0];
          mh.field_D = (int)pe.field_d[param1].field_e[1];
          return;
        }
        if (param2 == -111) {
          var6 = ac.a(pe.field_d[param1].field_e, 120, pe.field_d[param1 - 1].field_e);
          var5 = var6;
          var4 = var5;
          var3 = var4;
          oa.a(param0, var6, 122);
          wj.a(var6, -92, pe.field_d[param1 - 1].field_e);
          bl.field_f = (int)var6[0];
          mh.field_D = (int)var6[1];
          return;
        }
        field_f = -35;
        var6Lifetime1 = ac.a(pe.field_d[param1].field_e, 120, pe.field_d[param1 - 1].field_e);
        var5Lifetime1 = var6Lifetime1;
        var4Lifetime1 = var5Lifetime1;
        var3Lifetime1 = var4Lifetime1;
        oa.a(param0, var6Lifetime1, 122);
        wj.a(var6Lifetime1, -92, pe.field_d[param1 - 1].field_e);
        bl.field_f = (int)var6Lifetime1[0];
        mh.field_D = (int)var6Lifetime1[1];
    }

    final void a(int param0, gk param1) {
        try {
          int var3_int = 126 % ((-34 - param0) / 53);
          param1.a(this.field_e, -45);
          param1.a(this.field_h, (byte) 57);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "rc.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_i = null;
        field_j = null;
        if (param0 < 85) {
          field_k = (md) null;
          field_k = null;
          return;
        }
        field_k = null;
    }

    rc(String param0, String param1) {
        try {
          this.field_h = param1;
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "rc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = 0.0;
        field_j = new int[8192];
        field_i = null;
    }
}
