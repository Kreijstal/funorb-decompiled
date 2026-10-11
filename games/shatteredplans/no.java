/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no {
    static ri field_e;
    static boolean field_b;
    static String field_a;
    static int[] field_c;
    static boolean[] field_f;
    static String field_d;

    final static void a(int param0, int param1) {
        try {
          int var5_int = 0;
          int var12 = 0;
          int var6 = 0;
          int var2_int = 0;
          l var3 = null;
          int var8_int = 0;
          ln[] var9_ref_ln__ = null;
          int var10_int = 0;
          ln var13 = null;
          int var14 = 0;
          ln[] var15 = null;
          ln var16 = null;
          ln[] var17 = null;
          Object var18 = null;
          ln var18_ref = null;
          ln var19 = null;
          ln[] var20 = null;
          ln var22 = null;
          ln var26 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2 = null;
          jn var4 = null;
          Object var5 = null;
          ln var8 = null;
          int var9 = 0;
          ln var10 = null;
          ln[] var21 = null;
          fs var23 = null;
          sd var24 = null;
          fs var25 = null;
          sd var27 = null;
          fs var28 = null;
          ln var29 = null;
          ln var30 = null;
          ln var31 = null;
          sd var32 = null;
          ln var13Lifetime1;
          ln var13Lifetime2;
          ln var13Lifetime3;
          ln var22Lifetime1;
          ln var26Lifetime1;
          ln var26Lifetime2;
          ln var29Lifetime1;
          ln var29Lifetime2;
          ln var22Lifetime2;
          ln var22Lifetime3;
          ln var13Lifetime2Lifetime1;
          ln var26Lifetime1Lifetime1;
          ln var29Lifetime1Lifetime1;
          int var10_intLifetime1;
          int var10_intLifetime2;
          var18 = null;
          var14 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            var2_int = -105 / ((-38 - param0) / 46);
            if (kb.field_x >= param1) {
              return;
            }
            try {
              kb.field_x = param1;
              var3 = wl.field_a.a(117, kb.field_x, true);
            } catch (jn decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (jn) (Object) decompiledCaughtException;
              throw new RuntimeException("Failed to advance Tutorial to stage " + kb.field_x + ". ");
            }
            var15 = oq.field_a.field_P.field_g.field_e;
            for (var5_int = 0; var5_int < var15.length; var5_int++) {
              var16 = var15[var5_int];
              var13 = var16;
              var22 = var13;
              var13Lifetime1 = var16;
              var18_ref = var3.field_e[var5_int];
              var18_ref.field_u = var16.field_u;
              var18_ref.field_G = var16.field_G;
              var18_ref.field_x = var16.field_x;
              var18_ref.field_J = var16.field_J;
              var18_ref.field_L = var16.field_L;
              var8_int = 0;
              var17 = var16.field_D;
              for (var10_int = 0; var10_int < var17.length; var10_int++) {
                var19 = var17[var10_int];
                var13Lifetime2 = var19;
                var22Lifetime2 = var13Lifetime2;
                var13Lifetime2Lifetime1 = var19;
                if (!var18_ref.b(var19, (byte) 10)) {
                  var8_int++;
                }
              }
              if (var8_int > 0) {
                var9_ref_ln__ = new ln[var18_ref.field_D.length + var8_int];
                var8_int = 0;
                for (var10_intLifetime1 = 0; var18_ref.field_D.length > var10_intLifetime1; var10_intLifetime1++) {
                  var9_ref_ln__[var10_intLifetime1] = var18_ref.field_D[var10_intLifetime1];
                }
                var20 = var16.field_D;
                for (var12 = 0; var20.length > var12; var12++) {
                  var13Lifetime3 = var20[var12];
                  var22Lifetime3 = var13Lifetime3;
                  var26 = var22Lifetime3;
                  var22Lifetime3 = var13Lifetime3;
                  if (!var18_ref.b(var13Lifetime3, (byte) 10)) {
                    var9_ref_ln__[var8_int + var10_intLifetime1] = var3.field_e[var13Lifetime3.field_p];
                    var8_int++;
                  }
                }
                var18_ref.field_D = var9_ref_ln__;
              }
              var18_ref.field_t = var16.field_t;
              var18_ref.field_y = var16.field_y;
              var18_ref.field_R = var16.field_R;
              if (var16.field_y != null) {
                var9 = 0;
                if (var16.field_R != null &&
                  var16 == var16.field_R.field_q) {
                  var9 = 1;
                }
                var10_intLifetime2 = 0;
                if (var16.field_y != null &&
                  var16.field_y.field_m.field_q == var16) {
                  var10_intLifetime2 = 1;
                }
                var18_ref.field_R.a(-21771, var18_ref);
                if (var9 != 0) {
                  var18_ref.field_R.field_q = var18_ref;
                }
                var18_ref.field_y.field_m.a(-21771, var18_ref);
                if (var10_intLifetime2 != 0) {
                  var18_ref.field_y.field_m.field_q = var18_ref;
                }
                var16.b((byte) -71);
                var16.a(16);
              }
            }
            oq.field_a.a(var3, 6);
            if (id.field_d != null) {
              id.field_d = var3.field_e[id.field_d.field_p];
            }
            if (null != d.field_d) {
              d.field_d = var3.field_e[d.field_d.field_p];
            }
            var21 = var3.field_e;
            for (var6 = 0; var6 < var21.length; var6++) {
              var22Lifetime1 = var21[var6];
              var26Lifetime1 = var22Lifetime1;
              var29 = var26Lifetime1;
              var26Lifetime1Lifetime1 = var22Lifetime1;
              uq.field_m.a(pa.a(var22Lifetime1, -31), 27275, "star" + var22Lifetime1.field_p);
            }
            var5 = null;
            if (kb.field_x == 5) {
              var23 = new fs(1, hn.field_f[1], or.field_b[1], df.field_k[1], ho.field_e[1]);
              var5 = var23;
              var3.field_e[6].field_t = var23;
              var3.field_e[6].field_y = var23;
              var3.field_e[7].field_t = var23;
              var3.field_e[7].field_y = var23;
              var23.field_m = new lo(var23, var3.field_e[7]);
              var23.field_m.a(-21771, var3.field_e[7]);
              var23.field_m.a(-21771, var3.field_e[6]);
              var24 = new sd(var23, var3.field_e[7]);
              var24.a(-21771, var3.field_e[7]);
              var24.a(-21771, var3.field_e[6]);
              var3.field_e[6].field_R = var24;
              var3.field_e[7].field_R = var24;
              var23.field_i.a((byte) -113, var24);
              var23.field_q = new um(var3.field_e[7].field_x + var3.field_e[6].field_x);
            }
            if (6 == kb.field_x) {
              var25 = new fs(2, hn.field_f[2], or.field_b[2], df.field_k[2], ho.field_e[2]);
              var5 = var25;
              var26Lifetime2 = var3.field_e[17];
              var29Lifetime1 = var26Lifetime2;
              var29Lifetime1Lifetime1 = var26Lifetime2;
              var26Lifetime2.field_y = var25;
              var26Lifetime2.field_t = var25;
              var25.field_m = new lo(var25, var26Lifetime2);
              var25.field_m.a(-21771, var26Lifetime2);
              var27 = new sd(var25, var26Lifetime2);
              var27.a(-21771, var26Lifetime2);
              var26Lifetime2.field_R = var27;
              var25.field_i.a((byte) -113, var27);
              var25.field_q = new um(var26Lifetime2.field_x);
            }
            if (kb.field_x == 7) {
              var28 = new fs(3, hn.field_f[3], or.field_b[3], df.field_k[3], ho.field_e[3]);
              var5 = var28;
              var29Lifetime2 = var3.field_e[37];
              var30 = var3.field_e[36];
              var8 = var3.field_e[35];
              var31 = var3.field_e[34];
              var29Lifetime2.field_t = var28;
              var29Lifetime2.field_y = var28;
              var10 = var3.field_e[33];
              var30.field_t = var28;
              var30.field_y = var28;
              var8.field_t = var28;
              var8.field_y = var28;
              var31.field_y = var28;
              var31.field_t = var28;
              var10.field_t = var28;
              var10.field_y = var28;
              var28.field_m = new lo(var28, var29Lifetime2);
              var28.field_m.a(-21771, var29Lifetime2);
              var28.field_m.a(-21771, var30);
              var28.field_m.a(-21771, var8);
              var28.field_m.a(-21771, var31);
              var28.field_m.a(-21771, var10);
              var32 = new sd(var28, var29Lifetime2);
              var32.a(-21771, var29Lifetime2);
              var32.a(-21771, var30);
              var32.a(-21771, var8);
              var32.a(-21771, var31);
              var32.a(-21771, var10);
              var29Lifetime2.field_R = var32;
              var30.field_R = var32;
              var8.field_R = var32;
              var31.field_R = var32;
              var10.field_R = var32;
              var28.field_i.a((byte) -113, var32);
              var28.field_q = new um(var31.field_x + var8.field_x + (var30.field_x + var29Lifetime2.field_x) + var10.field_x);
            }
            if (var5 != null) {
              oq.field_a.a(2, (fs) (var5));
              oq.field_a.field_z.a(-128, oq.field_a.field_P.field_v);
              oq.field_a.field_Y.a(oq.field_a.field_P.field_v, 1);
              uq.field_m.a(re.a("<col=<%0>>" + ((fs) (var5)).field_t + "</col>", 4371, new String[]{Integer.toString(((fs) (var5)).field_s, 16)}), 27275, "player" + ((fs) (var5)).field_x);
            }
            qj.a(ol.field_g, -1);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            throw r.a((Throwable) ((Object) var2), "no.C(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, int param1, java.awt.Canvas param2) {
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 > ma.field_p) {
            var3_int = 0;
            if (oq.field_e) {
              oq.field_e = false;
              var3_int = 1;
            }
            ge.a(vj.g((byte) 120), ei.a(82), var3_int != 0, 0, po.field_h);
          } else {
            if (!or.a(250)) {
              gf.b();
              sn.a(240, 28318, 320);
              mc.a(param1 ^ 37, 0, param2, 0);
            } else {
              if (gm.field_i == 0) {
                gr.a(false, param0, param1 ^ 10);
                mc.a(64, 0, param2, 0);
              } else {
                pa.a(param1 ^ 9232, param2);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("no.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(nf param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = 0;
          for (var3 = -1 + da.field_g; var3 >= 0; var3--) {
            if (param0 != wm.field_d[var3]) {
              continue;
            }
            var2_int = 1 + var3;
            break;
          }
          if (param1 != 1) {
            field_e = (ri) null;
          }
          for (var3Lifetime1 = var2_int; var3Lifetime1 < da.field_g; var3Lifetime1++) {
            if (null != wm.field_d[var3Lifetime1].field_j) {
              ks.a(param1 ^ -115, false, wm.field_d[var3Lifetime1].field_j.field_z);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("no.D(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_a = null;
        int var1 = -122 / ((param0 - 55) / 56);
        field_c = null;
        field_f = null;
    }

    static {
        field_a = "Disruptive behaviour";
        field_c = new int[8192];
        field_d = "This password contains repeated characters, and would be easy to guess";
    }
}
