/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String field_b;
    static df field_a;
    static h field_c;

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = Geoblox.field_C;
        try {
            eg.field_p.a(111);
            var1_int = 10 / ((param0 - 68) / 57);
            for (var2 = 0; var2 < 32; var2++) {
                pb.field_p[var2] = 0L;
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                tl.field_l[var1_int] = 0L;
            }
            nf.field_w = 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ih.C(" + param0 + ')');
        }
    }

    final static boolean a(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 0) {
          return true;
        }
        stackIn_8_0 = (ji.field_r.c(13519)) && (wd.field_e.c(13519)) && (bh.field_c.c(param0 + 13519)) && (!jl.field_t);
        return stackIn_8_0;
    }

    public static void a(byte param0) {
        if (param0 <= 46) {
            return;
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, int param1, ja param2, int param3) {
        int var22 = 0;
        int var23 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
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
        ja var24 = null;
        int var25 = 0;
        Object var26 = null;
        ja var26_ref = null;
        int var27 = 0;
        int[] var34 = null;
        int[] var35 = null;
        var26 = null;
        var27 = Geoblox.field_C;
        try {
          var4_int = param3 - vf.field_L.field_s / 2;
          var4_int = var4_int + vf.field_L.field_u;
          var5 = -(vf.field_L.field_o / 2) + param1;
          var5 = var5 + vf.field_L.field_p;
          var6 = -var4_int + bk.field_a.field_u;
          var7 = bk.field_a.field_p - var5;
          var8 = vf.field_L.field_r;
          if (var8 <= var6) {
            stackIn_4_0 = 0;
          } else {
            stackIn_4_0 = bk.field_a.field_r;
          }
          var9 = stackIn_4_0;
          var10 = vf.field_L.field_m;
          if (var7 >= var10) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = bk.field_a.field_m;
          }
          var11 = stackIn_7_0;
          stackIn_10_0 = (~var6 >= param0) ? 0 : var6;
          var12 = stackIn_10_0;
          stackIn_13_0 = (var7 > 0) ? var7 : 0;
          var13 = stackIn_13_0;
          var14 = var6 + var9;
          if (var14 > var8) {
            var14 = var8;
          }
          var15 = var11 + var7;
          if (var15 > var10) {
            var15 = var10;
          }
          var14 = var14 - var12;
          var15 = var15 - var13;
          var16 = var8 * var13 + var12;
          var17 = -var14 + var8;
          var18 = var12 + (-var6 + (-var7 + var13) * var9);
          var19 = -var14 + var9;
          var34 = vf.field_L.field_v;
          var35 = bk.field_a.field_v;
          for (var22 = var15; 0 < var22; var22--) {
            for (var23 = var14; var23 > 0; var23--) {
              if (var34[var16] != 0) {
                if (var35[var18] != 16777215) {
                  if (var35[var18] != 0) {
                    var24 = tl.field_g[-1 + var35[var18]];
                    stackIn_35_0 = (var24.field_z != 2) ? 0 : 1;
                    if (param2.field_z != 2) {
                      stackIn_38_1 = 0;
                    } else {
                      stackIn_38_1 = 1;
                    }
                    var25 = stackIn_35_0 ^ stackIn_38_1;
                    if (var25 != 0) {
                      var26_ref = (ja) ((Object) ra.field_a.e(1));
                      if (var26_ref != null) {
                        L12: {
                          if ((param2.field_z == 2) &&
                              (var25 != 0)) {
                            var26_ref.a(param0 ^ -97, (float)param3, 8, param2.field_w, param2.field_M, 0, param2.field_u, (float)param1, param2.field_F, param2.field_C, 0.0f);
                            break L12;
                          }
                          var26_ref.a(-121, var24.field_o, 8, var24.field_w, var24.field_M, 0, var24.field_u, var24.field_v, var24.field_F, var24.field_C, 0.0f);
                        }
                        bh.field_c.a(-42, var26_ref);
                      }
                    }
                    if (ik.a(var24, param2, false)) {
                      return;
                    }
                  }
                } else {
                  param2.field_t = true;
                  if (param2.field_z != 3) {
                    if (4 == param2.field_z) {
                      jc.a(7, false);
                    }
                  } else {
                    jl.field_t = true;
                  }
                }
              }
              var18++;
              var16++;
            }
            var18 = var18 + var19;
            var16 = var16 + var17;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_55_0 = (RuntimeException) (var4);
          stackIn_55_1 = new StringBuilder().append("ih.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param3).append(')').toString());
        }
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 119) {
            stackIn_4_0 = pf.field_O.a(0, param1, "");
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var2);
          stackIn_7_1 = new StringBuilder().append("ih.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_b = "You have 1 unread message!";
        field_a = null;
    }
}
