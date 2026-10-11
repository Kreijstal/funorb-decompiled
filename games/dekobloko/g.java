/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends ek {
    static w field_R;
    static int field_L;
    static ck[] field_O;
    private nb field_P;
    static String field_K;
    private int field_M;
    static ve field_N;
    static int field_Q;

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        tb var8;
        int var9;
        int var10;
        int var11;
        ck var14;
        ck var15;
        ck var16;
        ck var17;
        ck var20;
        ck var21;
        ck var22;
        ck var23;
        int var9Lifetime1;
        int var10Lifetime1;
        int var9Lifetime2;
        int var10Lifetime2;
        tb var8Lifetime1;
        var11 = client.field_A ? 1 : 0;
        super.a(param0, -105, param2, param3);
        if (param2 != 0) {
          return;
        }
        var5 = (this.field_t >> 1) + (this.field_u + param0);
        var6 = param3 - (-this.field_D - (this.field_y >> 1));
        if (param1 > -103) {
          this.c((byte) -60);
          var8 = this.field_P.a(20350);
          if (le.field_o == var8) {
            var15 = tl.field_u[0];
            var9 = var15.field_K << 1;
            var10 = var15.field_C << 1;
            if (kl.field_v != null &&
              var9 <= kl.field_v.field_I &&
              var10 <= kl.field_v.field_H) {
              tb.a(true, kl.field_v);
              hk.b();
            } else {
              kl.field_v = new ck(var9, var10);
              tb.a(true, kl.field_v);
            }
            var15.a(112, 144, var15.field_K << 4, var15.field_C << 4, -this.field_M << 10, 4096);
            mk.a((byte) -5);
            kl.field_v.f(var5 - var15.field_K, -var15.field_C + var6, 256);
            return;
          }
          if (jb.field_j != var8) {
            if (var8 == vm.field_u) {
              var17 = tl.field_u[2];
              var17.f(var5 - (var17.field_I >> 1), var6 - (var17.field_H >> 1), 256);
              return;
            }
            if (var8 != dc.field_b) {
              return;
            }
            var20 = tl.field_u[1];
            var20.f(-(var20.field_I >> 1) + var5, var6 - (var20.field_H >> 1), 256);
            return;
          }
          var16 = tl.field_u[0];
          var14 = var16;
          var9Lifetime2 = var16.field_K << 1;
          var10Lifetime2 = var16.field_C << 1;
          if (kl.field_v == null) {
            kl.field_v = new ck(var9Lifetime2, var10Lifetime2);
            tb.a(true, kl.field_v);
          } else {
            if (var9Lifetime2 > kl.field_v.field_I) {
              kl.field_v = new ck(var9Lifetime2, var10Lifetime2);
              tb.a(true, kl.field_v);
            } else {
              if (var10Lifetime2 <= kl.field_v.field_H) {
                tb.a(true, kl.field_v);
                hk.b();
              } else {
                kl.field_v = new ck(var9Lifetime2, var10Lifetime2);
                tb.a(true, kl.field_v);
              }
            }
          }
          var16.a(112, 144, var16.field_K << 4, var16.field_C << 4, -this.field_M << 10, 4096);
          mk.a((byte) -5);
          kl.field_v.f(var5 - var16.field_K, -var16.field_C + var6, 256);
          return;
        }
        var8Lifetime1 = this.field_P.a(20350);
        if (le.field_o != var8Lifetime1 &&
          jb.field_j != var8Lifetime1) {
          if (var8Lifetime1 == vm.field_u) {
            var21 = tl.field_u[2];
            var21.f(var5 - (var21.field_I >> 1), var6 - (var21.field_H >> 1), 256);
            return;
          }
          if (var8Lifetime1 != dc.field_b) {
            return;
          }
          var22 = tl.field_u[1];
          var22.f(-(var22.field_I >> 1) + var5, var6 - (var22.field_H >> 1), 256);
          return;
        }
        var23 = tl.field_u[0];
        var9Lifetime1 = var23.field_K << 1;
        var10Lifetime1 = var23.field_C << 1;
        if (kl.field_v == null) {
          kl.field_v = new ck(var9Lifetime1, var10Lifetime1);
          tb.a(true, kl.field_v);
        } else {
          if (var9Lifetime1 > kl.field_v.field_I) {
            kl.field_v = new ck(var9Lifetime1, var10Lifetime1);
            tb.a(true, kl.field_v);
          } else {
            if (var10Lifetime1 <= kl.field_v.field_H) {
              tb.a(true, kl.field_v);
              hk.b();
            } else {
              kl.field_v = new ck(var9Lifetime1, var10Lifetime1);
              tb.a(true, kl.field_v);
            }
          }
        }
        var23.a(112, 144, var23.field_K << 4, var23.field_C << 4, -this.field_M << 10, 4096);
        mk.a((byte) -5);
        kl.field_v.f(var5 - var23.field_K, -var23.field_C + var6, 256);
    }

    final void a(ce param0, int param1, int param2, int param3) {
        try {
          if (param1 <= 38) {
            g.a(100);
          }
          this.field_M = this.field_M + 1;
          super.a(param0, 89, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "g.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static wb a(int param0, String param1) {
        String var2 = null;
        wb var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        wb stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = client.field_A ? 1 : 0;
        try {
          if (null == hg.field_e) {
            return null;
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = kf.a(var6, (byte) 2);
          if (var2 == null) {
            var2 = param1;
          }
          if (param0 != -3805) {
            g.a(106);
          }
          var3 = (wb) (hg.field_e.a(24710, (long)var2.hashCode()));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_Ob);
            var4 = kf.a(var7, (byte) 2);
            if (var4 == null) {
              var4 = var3.field_Ob;
            }
            if (var4.equals(var2)) {
              stackIn_16_0 = var3;
              return stackIn_16_0;
            }
            var3 = (wb) (hg.field_e.d(-17713));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("g.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final String c(byte param0) {
        if (this.field_q) {
          return this.field_P.b((byte) 69);
        }
        if (param0 == 113) {
          return null;
        }
        return (String) null;
    }

    final boolean a(boolean param0, ce param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          field_Q = -39;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("g.EC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_N = null;
        field_R = null;
        field_O = null;
        field_K = null;
        if (param0 >= -91) {
          field_K = (String) null;
        }
    }

    g(nb param0) {
        try {
          this.field_P = param0;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "g.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_L = 2;
        field_K = "Suggested names: ";
    }
}
