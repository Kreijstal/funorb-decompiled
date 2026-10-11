/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug implements dh {
    private int field_l;
    static bm[] field_d;
    private qi field_c;
    private int field_k;
    private int field_e;
    private int field_h;
    static ah field_g;
    private int field_j;
    private int field_a;
    static String field_i;
    static String field_f;
    static String field_m;
    static uf field_b;

    final static void a(String param0, int param1) {
        try {
          ok.field_f = param0;
          if (param1 != 0) {
            field_i = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ug.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          return;
        }
        field_g = null;
        field_b = null;
        field_i = null;
        field_m = null;
        field_f = null;
        field_d = null;
    }

    final static void b(int param0) {
        kf.field_F = kf.field_F - 1;
        tc.a(tn.field_h[kf.field_F], gd.field_c[kf.field_F], bd.field_V[kf.field_F]);
        tc.field_d = ce.field_q[kf.field_F];
        tc.field_e = dm.field_b[kf.field_F];
        tc.field_a = m.field_c[kf.field_F];
        tc.field_i = mk.field_n[kf.field_F];
        if (param0 != -1) {
          field_g = (ah) null;
        }
    }

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_1 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        th var16 = null;
        th var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = HoldTheLine.field_D;
        try {
          var16 = new th(param1);
          var17 = var16;
          var17.field_l = -2 + param1.length;
          vn.field_d = var17.k(72);
          qe.field_f = new boolean[vn.field_d];
          nk.field_K = new int[vn.field_d];
          if (param0 != -97) {
            field_m = (String) null;
          }
          wc.field_i = new byte[vn.field_d][];
          la.field_j = new int[vn.field_d];
          lk.field_e = new byte[vn.field_d][];
          wb.field_g = new int[vn.field_d];
          ad.field_d = new int[vn.field_d];
          var17.field_l = -7 + param1.length - 8 * vn.field_d;
          bo.field_b = var17.k(-85);
          ih.field_o = var17.k(59);
          var3 = 1 + (var17.f((byte) -64) & 255);
          for (var4 = 0; var4 < vn.field_d; var4++) {
            la.field_j[var4] = var16.k(123);
          }
          for (var4Lifetime1 = 0; vn.field_d > var4Lifetime1; var4Lifetime1++) {
            wb.field_g[var4Lifetime1] = var17.k(-56);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < vn.field_d; var4Lifetime2++) {
            nk.field_K[var4Lifetime2] = var17.k(79);
          }
          for (var4Lifetime3 = 0; vn.field_d > var4Lifetime3; var4Lifetime3++) {
            ad.field_d[var4Lifetime3] = var17.k(101);
          }
          var17.field_l = -((-1 + var3) * 3) - vn.field_d * 8 + (param1.length - 7);
          dd.field_E = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            dd.field_E[var4Lifetime4] = var17.c(false);
            if (dd.field_E[var4Lifetime4] == 0) {
              dd.field_E[var4Lifetime4] = 1;
            }
          }
          var17.field_l = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < vn.field_d; var4Lifetime5++) {
            var5 = nk.field_K[var4Lifetime5];
            var6 = ad.field_d[var4Lifetime5];
            var7 = var5 * var6;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            lk.field_e[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            wc.field_i[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.f((byte) -59);
            stackIn_24_0 = 0;
            stackIn_24_1 = 1 & var11;
            if (stackIn_24_0 == stackIn_24_1) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var17.f(0);
              }
              if (0 != (var11 & 2)) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$0 = var17.f(0);
                  var9[var12] = dupTemp$0;
                  var13 = dupTemp$0;
                  stackIn_50_0 = var10;
                  if (-1 == var13) {
                    stackIn_51_1 = 0;
                  } else {
                    stackIn_51_1 = 1;
                  }
                  var10 = stackIn_50_0 | stackIn_51_1;
                }
              }
            } else {
              for (var12 = 0; var12 < var5; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var12 + var5 * var13] = var17.f(0);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var13 < var6; var13++) {
                    dupTemp$1 = var17.f(0);
                    var9[var13 * var5 + var12] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_39_0 = var10;
                    if (var14 == -1) {
                      stackIn_40_1 = 0;
                    } else {
                      stackIn_40_1 = 1;
                    }
                    var10 = stackIn_39_0 | stackIn_40_1;
                  }
                }
              }
            }
            qe.field_f[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_56_0 = var2;
          stackIn_56_1 = new StringBuilder().append("ug.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(')').toString());
        }
    }

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        int var10 = 0;
        n stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        km var12 = null;
        var11 = HoldTheLine.field_D;
        try {
          if (!(param3 instanceof km)) {
            stackIn_4_0 = null;
          } else {
            stackIn_4_0 = (n) (param3);
          }
          var12 = (km) (stackIn_4_0);
          tc.f(param1 + param3.field_k, param4 + param3.field_o, param3.field_x, param3.field_u, this.field_h);
          if (var12 == null) {
          }
          var7 = param3.field_x - var12.field_I * 2;
          if (param2 > -48) {
            return;
          }
          var8 = param3.field_k + param1 + var12.field_I;
          var9 = var12.field_H + (param4 + param3.field_o);
          tc.d(var8, var9, var7 + var8, var9, this.field_j);
          for (var10 = var12.a((byte) 104) - 1; var10 >= 0; var10--) {
            tc.d(var8 + var7 * var12.a(false, var10) / var12.a(0), var9, this.field_e, this.field_l);
          }
          if (this.field_c != null) {
            this.field_c.b(var12.field_q, var7 / 2 + var8, var12.field_H + (var9 + this.field_c.field_F), this.field_k, this.field_a);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ug.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(da param0, int param1, int param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var9 = 0;
        var10 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameRemainder1 = true;
          var4_int = jn.a(14, (byte) -96, param0);
          var5 = jn.a(13, (byte) -96, param0);
          var6 = param0.h(2, 7);
          var7 = hk.field_c[param2][param1];
          var8 = on.field_v[param2][param1];
          if (var7 != -1 && (var4_int > var7 ||
            -1 == var4_int)) {
            ad.field_a = true;
            decompiledFrameRemainder1 = false;
          }
          else {
            hk.field_c[param2][param1] = var4_int;
            ha.field_j[param2][param1] = var6;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var8 != -1 && (var8 < var5 ||
            var5 == -1)) {
            ad.field_a = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            on.field_v[param2][param1] = var5;
          }
          var9 = 92 / ((33 - param3) / 57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ug.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ug(qi param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_a = param2;
          this.field_h = param4;
          this.field_c = param0;
          this.field_e = param5;
          this.field_l = param6;
          this.field_j = param3;
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ug.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_i = "Game Achievements";
        field_g = new ah();
        field_m = "<col=2>This is a members-only setting. If you are a member, log in to select.";
        field_f = "Loading...";
    }
}
