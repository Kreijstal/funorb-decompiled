/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb implements j {
    static int field_c;
    static int field_b;
    static int[] field_a;

    final static void a(da param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        uh var5 = null;
        int[] var6 = null;
        int var7 = 0;
        jd var8 = null;
        int var9 = 0;
        jd var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          var8 = new jd(param0.a(4, "logo.fo3d", ""));
          var10 = var8;
          var3 = var10.j(255);
          var10.d((byte) -83);
          vc.field_f = ml.a(22795, var10);
          wk.field_d = new uh[var3];
          bg.field_v = new int[var3][];
          for (var4 = 0; var3 > var4; var4++) {
            wk.field_d[var4] = ab.a(var8, -14945);
          }
          var5_int = -69 % ((param1 + 46) / 41);
          var10.m(0);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var3 > var9) {
            var5 = wk.field_d[var9];
            var5.a(8292, 1, 6, 6, 6);
            var5.b(32767);
            var6 = new int[]{var5.field_Q + var5.field_E >> 1, var5.field_m + var5.field_t >> 1, var5.field_G + var5.field_N >> 1};
            bg.field_v[var9] = var6;
            var5.a(-var6[0], -32768, -var6[1], -var6[2]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("pb.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        o var8 = null;
        try {
          var6_int = param3 + param4.field_m;
          if (param0 <= 113) {
            pb.a(88);
          }
          var7 = param4.field_j + param1;
          pl.a(true, param4.field_x, param4.field_t, var7, var6_int);
          var8 = gb.field_k[1];
          if (param4 instanceof pj &&
            ((pj) (param4)).field_F) {
            var8.a((-var8.field_q + param4.field_t >> 1) + 1 + var6_int, (param4.field_x - var8.field_r >> 1) + (1 + var7), 256);
          }
          if (param4.b(true)) {
            ci.a(-4 + param4.field_t, 2 + var7, -4 + param4.field_x, 2 + var6_int, (byte) 122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("pb.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static int a(int param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11675) {
            field_c = 69;
          }
          stackIn_3_0 = v.a(param0 ^ -11747, param1, param2, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(dl param0, Object param1, byte param2) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          if (null == param0.field_d) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (null != param0.field_d.peekEvent()) {
              i.a((byte) 100, 1L);
              continue;
            }
            break;
          }
          try {
            var3_int = 13 % ((param2 + 37) / 43);
            if (param1 != null) {
              param0.field_d.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("pb.D(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final static aa a(boolean param0, String param1, long param2, int param3, String param4) {
        RuntimeException var6 = null;
        vb stackIn_6_0 = null;
        jb stackIn_8_0 = null;
        il stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((long)param3 == param2 &&
            param4 != null) {
            stackIn_8_0 = new jb(param4, param1);
            return (aa) ((Object) stackIn_8_0);
          }
          if (param0) {
            stackIn_6_0 = new vb(param2, param1);
            return (aa) ((Object) stackIn_6_0);
          }
          stackIn_10_0 = new il(param2, param1);
          return (aa) ((Object) stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("pb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 33 % ((param0 + 53) / 41);
    }

    static {
        field_c = 1;
        field_a = new int[8192];
    }
}
