/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ft {
    static il field_c;
    int field_b;
    static boolean field_a;

    public static void a(byte param0) {
        try {
          int var1_int = 62 % ((param0 - 12) / 39);
          field_c = null;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ft.D(" + param0 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          if (param0 < 75) {
            field_c = (il) null;
          }
          try {
            var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
            param1.getAppletContext().showDocument(sda.a(param1, -1, var2), "_top");
          } catch (Exception exception) {
            exception.printStackTrace();
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "ft.toString()");
        }
    }

    final static void a(an param0, int param1, int[] param2, int[] param3, boolean param4, boolean param5, boolean param6) {
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        var30 = TombRacer.field_G ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param3[3] >> 2;
          var22 = param3[4] >> 2;
          var23 = param3[5] >> 2;
          var24 = param3[6] >> 2;
          var25 = param3[7] >> 2;
          var26 = param3[8] >> 2;
          var27 = param3[9] >> 2;
          var28 = param3[10] >> 2;
          var12 = var23 * param2[5] + var21 * param2[3] + param2[4] * var22 >> 14;
          var13 = param2[3] * var24 - (-(param2[4] * var25) - param2[5] * var26) >> 14;
          var29 = param3[11] >> 2;
          var19 = param2[10] * var25 + var24 * param2[9] + param2[11] * var26 >> 14;
          var14 = var27 * param2[3] + param2[4] * var28 + var29 * param2[5] >> 14;
          var18 = var23 * param2[11] + (var22 * param2[10] + var21 * param2[9]) >> 14;
          var15 = param2[8] * var23 + (param2[6] * var21 + param2[7] * var22) >> 14;
          var17 = var28 * param2[7] + (var27 * param2[6] + param2[8] * var29) >> 14;
          if (param1 != 1251086882) {
            return;
          }
          var20 = param2[11] * var29 + param2[10] * var28 + var27 * param2[9] >> 14;
          var16 = var26 * param2[8] + param2[6] * var24 + param2[7] * var25 >> 14;
          var21Lifetime1 = param2[0] - param3[0];
          var22Lifetime1 = -param3[1] + param2[1];
          var23Lifetime1 = -param3[2] + param2[2];
          var9 = param3[5] * var23Lifetime1 + (param3[3] * var21Lifetime1 + param3[4] * var22Lifetime1) >> -hma.field_a + 16;
          var10 = param3[8] * var23Lifetime1 + (param3[6] * var21Lifetime1 + param3[7] * var22Lifetime1) >> 16 - hma.field_a;
          var11 = param3[10] * var22Lifetime1 + var21Lifetime1 * param3[9] + var23Lifetime1 * param3[11] >> 16;
          var21Lifetime2 = uoa.field_f;
          var22Lifetime2 = uoa.field_g;
          var23Lifetime2 = 0;
          L2: while (true) {
            if (param0.field_I > var23Lifetime2) {
              var24Lifetime1 = param0.field_l[var23Lifetime2];
              var25Lifetime1 = param0.field_h[var23Lifetime2];
              var26Lifetime1 = param0.field_t[var23Lifetime2];
              var27Lifetime1 = var9 + (var24Lifetime1 * var12 + var15 * var25Lifetime1 + var18 * var26Lifetime1 >> -hma.field_a + 16);
              var28Lifetime1 = var10 + (var13 * var24Lifetime1 - (-(var16 * var25Lifetime1) - var19 * var26Lifetime1) >> 16 - hma.field_a);
              var29Lifetime1 = (var25Lifetime1 * var17 + (var24Lifetime1 * var14 + var20 * var26Lifetime1) >> 16) + var11;
              stackIn_69_0 = ~var29Lifetime1;
              stackIn_69_1 = -51;
              if (var30 == 0) {
                if (stackIn_69_0 > stackIn_69_1) {
                  wp.field_c[var23Lifetime2] = -2147483648;
                } else {
                  ds.field_f[var23Lifetime2] = var27Lifetime1 / var29Lifetime1 + var21Lifetime2;
                  mg.field_e[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
                  if (var29Lifetime1 < var7_int) {
                    var7_int = var29Lifetime1;
                  }
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                  wp.field_c[var23Lifetime2] = var29Lifetime1;
                }
                if (param6) {
                  bma.field_p[var23Lifetime2] = var27Lifetime1 >> hma.field_a;
                  ipa.field_M[var23Lifetime2] = var28Lifetime1 >> hma.field_a;
                  iia.field_v[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            } else {
              if (null != param0.field_j &&
                null != param0.field_F &&
                null != param0.field_o &&
                null != param0.field_x &&
                null != param0.field_G &&
                null != param0.field_J &&
                null != param0.field_E &&
                param0.field_v != null &&
                param0.field_L != null) {
                var23Lifetime2 = 0;
                while (!(var23Lifetime2 >= param0.field_u)) {
                  var24Lifetime1 = param0.field_j[var23Lifetime2];
                  var25Lifetime1 = param0.field_F[var23Lifetime2];
                  var26Lifetime1 = param0.field_o[var23Lifetime2];
                  rva.field_u[var23Lifetime2] = var9 + (var18 * var26Lifetime1 + (var15 * var25Lifetime1 + var24Lifetime1 * var12) >> 16);
                  un.field_r[var23Lifetime2] = var10 + (var16 * var25Lifetime1 + var24Lifetime1 * var13 + var26Lifetime1 * var19 >> 16);
                  lq.field_o[var23Lifetime2] = (var25Lifetime1 * var17 + (var24Lifetime1 * var14 + var26Lifetime1 * var20) >> 16) + var11;
                  var24Lifetime1 = param0.field_x[var23Lifetime2];
                  var25Lifetime1 = param0.field_G[var23Lifetime2];
                  var26Lifetime1 = param0.field_J[var23Lifetime2];
                  fva.field_c[var23Lifetime2] = var9 + (var25Lifetime1 * var15 + var24Lifetime1 * var12 + var18 * var26Lifetime1 >> 16);
                  hma.field_f[var23Lifetime2] = (var25Lifetime1 * var16 + var13 * var24Lifetime1 + var26Lifetime1 * var19 >> 16) + var10;
                  gv.field_q[var23Lifetime2] = var11 + (var26Lifetime1 * var20 + (var25Lifetime1 * var17 + var14 * var24Lifetime1) >> 16);
                  var24Lifetime1 = param0.field_E[var23Lifetime2];
                  var25Lifetime1 = param0.field_v[var23Lifetime2];
                  var26Lifetime1 = param0.field_L[var23Lifetime2];
                  nc.field_b[var23Lifetime2] = var9 + (var26Lifetime1 * var18 + (var15 * var25Lifetime1 + var24Lifetime1 * var12) >> 16);
                  eq.field_p[var23Lifetime2] = var10 + (var25Lifetime1 * var16 + (var13 * var24Lifetime1 + var19 * var26Lifetime1) >> 16);
                  bw.field_b[var23Lifetime2] = var11 + (var25Lifetime1 * var17 + var14 * var24Lifetime1 + var26Lifetime1 * var20 >> 16);
                  var23Lifetime2++;
                  if (var30 != 0) {
                    return;
                  }
                }
              }
              if (param4) {
                var9 = param2[3];
                var10 = param2[4];
                var11 = param2[5];
                var12 = param2[6];
                var13 = param2[7];
                var14 = param2[8];
                var15 = param2[9];
                var16 = param2[10];
                var17 = param2[11];
                var18 = 0;
                while (!(var18 >= param0.field_A)) {
                  stackIn_69_0 = ~ada.field_y.length;
                  stackIn_69_1 = ~var18;
                  if (var30 != 0) {
                    break L2;
                  }
                  if (stackIn_69_0 >= stackIn_69_1) {
                    break;
                  }
                  var19 = param0.field_k[var18];
                  var20 = param0.field_c[var18];
                  var21Lifetime2 = param0.field_r[var18];
                  ada.field_y[var18] = var19 * var9 + var20 * var12 + var21Lifetime2 * var15 >> 16;
                  ie.field_i[var18] = var19 * var10 + (var13 * var20 + var21Lifetime2 * var16) >> 16;
                  dd.field_d[var18] = var21Lifetime2 * var17 + var14 * var20 + var19 * var11 >> 16;
                  var18++;
                }
              }
              stackIn_69_0 = var7_int;
              stackIn_69_1 = param5 ? 1 : 0;
            }
            break;
          }
          ck.a(stackIn_69_0, stackIn_69_1 != 0, param0, param1 ^ -1251095052, var8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_74_0 = var7;
          stackIn_74_1 = new StringBuilder().append("ft.A(");
          if (param0 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',');
          if (param3 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(q param0, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (~vga.field_n.a((byte) -16) > param1) {
            vga.field_n.b((byte) -90, param0);
          }
          param0.c(param1 ^ 8174);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ft.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    ft(int param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ft.<init>(" + param0 + ')');
        }
    }

    static {
    }
}
