/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    final static void a(boolean param0, boolean param1, byte param2, int param3, v param4) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        try {
          he.field_u[0] = j.field_r.nextInt();
          he.field_u[1] = j.field_r.nextInt();
          he.field_u[2] = (int)(dc.field_F >> 32);
          iq.field_x.field_u = 0;
          he.field_u[3] = (int)dc.field_F;
          iq.field_x.e(he.field_u[0], 0);
          iq.field_x.e(he.field_u[1], 0);
          iq.field_x.e(he.field_u[2], 0);
          iq.field_x.e(he.field_u[3], 0);
          cn.a(iq.field_x, 117);
          iq.field_x.d(param3, -1783);
          param4.a(iq.field_x, 47);
          uh.field_Wb.field_u = 0;
          if (param0) {
            uh.field_Wb.f(18, 95);
          }
          if (!param0 ||
            Vertigo2.field_L) {
            uh.field_Wb.f(16, 78);
          }
          uh.field_Wb.field_u = uh.field_Wb.field_u + 2;
          var5_int = uh.field_Wb.field_u;
          uh.field_Wb.e(ng.field_c, 0);
          uh.field_Wb.a((byte) -116, ff.field_d);
          var6 = 0;
          if (pl.field_i) {
            var6 = var6 | 1;
          }
          if (lm.field_G) {
            var6 = var6 | 4;
          }
          if (param1) {
            var6 = var6 | 8;
          }
          if (go.field_g != null) {
            var6 = var6 | 16;
          }
          uh.field_Wb.f(var6, -127);
          var7 = vq.a(ob.e((byte) 66), (byte) 114);
          if (null == var7) {
            var7 = "";
          }
          uh.field_Wb.a((byte) 0, var7);
          if (go.field_g != null) {
            uh.field_Wb.a(684868900, go.field_g);
          }
          var8 = -1 % ((param2 - 22) / 34);
          mq.a(jm.field_H, uh.field_Wb, lp.field_E, 12, iq.field_x);
          uh.field_Wb.a((byte) -116, uh.field_Wb.field_u - var5_int);
          lf.d(50, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("wl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static void a(jp param0, boolean param1, int param2, int param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_24_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_34_0Lifetime1;
        int stackIn_34_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param3 < 49) {
            return;
          }
          var5_int = d.b(-110, 3 * (-param2 + param4));
          var6 = param2 * 3;
          var7 = -10 + var5_int;
          vq.a(256);
          if (param0.field_G > 0 &&
            null != param0.field_x) {
            go.b(59);
          }
          ja.field_a = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param0.field_w > var8)))) {
            var9 = param0.field_p[var8];
            var10 = param0.field_L[var8];
            var11 = param0.field_c[var8];
            stackOut_12_0 = param1;
            stackIn_44_0 = stackOut_12_0 ? 1 : 0;
            stackIn_13_0 = stackOut_12_0;
            if (var19 == 0) {
              if (stackIn_13_0) {
                var12 = nj.field_a[var9];
                var13 = ml.field_t[var9];
                var14 = nj.field_a[var10] - var12;
                var15 = -var12 + nj.field_a[var11];
                var16 = -var13 + ml.field_t[var10];
                var17 = ml.field_t[var11] - var13;
              }
              if (!stackIn_13_0 ||
                -(var15 * var16) + var14 * var17 < 0) {
                var12Lifetime1 = pk.field_v[var9];
                if (-2147483648 != var12Lifetime1) {
                  var13Lifetime1 = pk.field_v[var10];
                  if (-2147483648 != var13Lifetime1) {
                    var14 = pk.field_v[var11];
                    if (var14 != -2147483648) {
                      var15 = -var6 + (var13Lifetime1 + var12Lifetime1 + var14);
                      if (var7 < 0) {
                        stackIn_24_0 = var15 << -var7;
                      } else {
                        stackIn_24_0 = var15 >> var7;
                      }
                      var16 = -stackIn_24_0 + eb.field_g.length - 1;
                      var17 = eb.field_g[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_34_0 = ~var16;
                          stackIn_34_1 = -1;
                          if (stackIn_34_0 > stackIn_34_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = eb.field_g[var16];
                          continue;
                        }
                        stackIn_34_0Lifetime1 = var16 << 4;
                        stackIn_34_1Lifetime1 = -var17;
                        var18 = stackIn_34_0Lifetime1 - stackIn_34_1Lifetime1;
                        ac.field_K[var18] = var8;
                        eb.field_g[var16] = var17 + 1;
                        if (param0.field_G > 0 &&
                          param0.field_x != null) {
                          dupTemp$0 = param0.field_x[var8];
                          oq.field_F[dupTemp$0] = oq.field_F[dupTemp$0] + 1;
                        }
                        ja.field_a = ja.field_a + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_44_0 = param0.field_G;
          }
          if (stackIn_44_0 > 0 &&
            null != param0.field_x) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(oq.field_F.length <= var9Lifetime1)) {
              var10Lifetime1 = oq.field_F[var9Lifetime1];
              oq.field_F[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_58_0 = var5;
          stackIn_58_1 = new StringBuilder().append("wl.B(");
          if (param0 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
