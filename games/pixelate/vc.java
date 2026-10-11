/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends qm {
    private ml field_P;
    private int field_Q;
    static bb field_O;
    static String field_N;

    final void a(int param0, int param1, int param2, ng param3) {
        try {
          this.field_Q = this.field_Q + 1;
          if (param0 != 40) {
            field_N = (String) null;
          }
          super.a(param0 ^ 0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vc.L(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String b(byte param0) {
        if (this.field_D) {
          return this.field_P.b((byte) -7);
        }
        if (param0 > 16) {
          return null;
        }
        field_N = (String) null;
        return null;
    }

    final boolean a(ng param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 27) {
            return false;
          }
          this.field_P = (ml) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vc.HA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, sb param3, int param4, sb param5, int param6, int param7, int param8, jl param9, int param10, int param11, int param12, sb param13, int param14, jl param15, byte param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          dj.a((byte) -109, param15, param9, param6);
          jj.a(param17, false, param0, param7, param18);
          op.b(param8, param20, true);
          lg.a(param5, param2, -118, param3, param4, param1);
          pb.a(param12, param13, 16, param10);
          ll.a((byte) -113, param19, param11, param14);
          var21_int = -33 / ((param16 - 20) / 57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_4_0 = var21;
          stackIn_4_1 = new StringBuilder().append("vc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5;
        int var6;
        int var7;
        dj var9;
        int var10;
        int var11;
        int var12;
        tf var14;
        tf var15;
        tf var16;
        tf var17;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = Pixelate.field_H ? 1 : 0;
        super.a(param0, param1, param2, (byte) 125);
        if (param1 != 0) {
          return;
        }
        var6 = -40 / ((param3 - 70) / 49);
        var5 = (this.field_E >> 1) + param2 + this.field_z;
        var7 = (this.field_C >> 1) + (this.field_p + param0);
        var9 = this.field_P.a((byte) 110);
        if (uo.field_b == var9) {
          var17 = ha.field_g[0];
          var10 = var17.field_A << 1;
          var11 = var17.field_B << 1;
          if (null == u.field_k) {
            u.field_k = new tf(var10, var11);
            h.a(-83, u.field_k);
          } else {
            if (var10 > u.field_k.field_F) {
              u.field_k = new tf(var10, var11);
              h.a(-83, u.field_k);
            } else {
              if (u.field_k.field_E >= var11) {
                h.a(-71, u.field_k);
                t.d();
              } else {
                u.field_k = new tf(var10, var11);
                h.a(-83, u.field_k);
              }
            }
          }
          var17.a(112, 144, var17.field_A << 4, var17.field_B << 4, -this.field_Q << 10, 4096);
          ia.a((byte) 92);
          u.field_k.b(var5 - var17.field_A, var7 - var17.field_B, 256);
          return;
        }
        if (var9 != tg.field_j) {
          if (var9 == sk.field_a) {
            var14 = ha.field_g[2];
            var14.b(var5 - (var14.field_F >> 1), -(var14.field_E >> 1) + var7, 256);
            return;
          }
          if (qk.field_g != var9) {
            return;
          }
          var15 = ha.field_g[1];
          var15.b(-(var15.field_F >> 1) + var5, var7 - (var15.field_E >> 1), 256);
          return;
        }
        var16 = ha.field_g[0];
        var10Lifetime1 = var16.field_A << 1;
        var11Lifetime1 = var16.field_B << 1;
        if (null == u.field_k) {
          u.field_k = new tf(var10Lifetime1, var11Lifetime1);
          h.a(-83, u.field_k);
        } else {
          if (var10Lifetime1 > u.field_k.field_F) {
            u.field_k = new tf(var10Lifetime1, var11Lifetime1);
            h.a(-83, u.field_k);
          } else {
            if (u.field_k.field_E >= var11Lifetime1) {
              h.a(-71, u.field_k);
              t.d();
            } else {
              u.field_k = new tf(var10Lifetime1, var11Lifetime1);
              h.a(-83, u.field_k);
            }
          }
        }
        var16.a(112, 144, var16.field_A << 4, var16.field_B << 4, -this.field_Q << 10, 4096);
        ia.a((byte) 92);
        u.field_k.b(var5 - var16.field_A, var7 - var16.field_B, 256);
    }

    public static void a(byte param0) {
        if (param0 <= -84) {
          field_N = null;
          field_O = null;
          return;
        }
        jl var2 = (jl) null;
        vc.a(16, 19, 82, (sb) null, 15, (sb) null, -91, -16, 3, (jl) null, 119, -31, -67, (sb) null, -69, (jl) null, (byte) 15, -5, 94, -75, -69);
        field_N = null;
        field_O = null;
    }

    vc(ml param0) {
        try {
          this.field_P = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_O = new bb();
        field_N = "Connection timed out. Please try using a different server.";
    }
}
