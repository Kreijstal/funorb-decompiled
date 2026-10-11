/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends sd {
    static bd[] field_y;
    static bd field_z;
    static bd[] field_A;
    static String field_x;

    final static void a(int param0, int param1, int param2, bd[] param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param3 != null &&
            param2 > 0) {
            var6_int = param3[0].field_u;
            var7 = param3[2].field_u;
            var8 = param3[1].field_u;
            param3[0].d(param1, param0, param4);
            param3[2].d(-var7 + param2 + param1, param0, param4);
            si.b(ia.field_i);
            si.f(param1 + var6_int, param0, param2 + (param1 - var7), param0 + param3[1].field_r);
            var9 = param1 + var6_int;
            if (param5 <= 107) {
              return;
            }
            var10 = param1 + param2 - var7;
            for (param1 = var9; var10 > param1; param1 = param1 + var8) {
              param3[1].d(param1, param0, param4);
            }
            si.a(ia.field_i);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("km.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(de param0, int param1, int param2) {
        en var3 = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = s.field_b;
          var3.i(19319, param2);
          var3.d(96, 2);
          var3.d(param1 ^ -19825, 0);
          var3.d(param1 ^ -19780, param0.field_l);
          if (param1 != -19746) {
            var4 = (String) null;
            km.a((String) null, true, -0.6628716588020325f, (byte) -73);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("km.CA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_x = null;
        field_z = null;
        if (param0 <= 46) {
          return;
        }
        field_y = null;
        field_A = null;
    }

    final static void a(String param0, boolean param1, float param2, byte param3) {
        try {
          if (null == hj.field_t) {
            hj.field_t = new pe(im.field_e, se.field_g);
            im.field_e.c(hj.field_t, 98);
          }
          hj.field_t.a(param2, param1, 127, param0);
          si.d();
          if (param3 <= 122) {
            int[] var5 = (int[]) null;
            km.a((byte) -37, 35, -17, (int[]) null, 25, -125, (byte) 42, 124, 121, 123, 63);
          }
          lf.a((byte) 80, true);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "km.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    km(int param0) {
        this(jd.field_s, param0);
    }

    final String c(ag param0, int param1) {
        RuntimeException var3 = null;
        bd[] var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            var4 = (bd[]) null;
            km.a(-66, -3, -19, (bd[]) null, -48, -1);
          }
          stackIn_3_0 = wj.a(param0.field_n.length(), 512, '*');
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("km.V(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2, int[] param3, int param4, int param5, byte param6, int param7, int param8, int param9, int param10) {
        int var15 = 0;
        int var20 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
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
        int var31 = 0;
        var31 = HostileSpawn.field_I ? 1 : 0;
        try {
          param1 = param1 & -4;
          param10 = param10 & -4;
          param8 = param8 & -4;
          param2 = param2 & -4;
          param5 = param5 & -4;
          param4 = param4 & -4;
          rl.a(-19104, param10, param4, param1, param2, param8, param5);
          var11_int = -m.field_q + ni.field_f;
          var12 = -qg.field_n + qh.field_e;
          var13 = var11_int * var11_int + var12 * var12 >> 2;
          if (var13 == 0) {
            return;
          }
          var14 = (int)(Math.sqrt((double)((float)var13 / 4.0f)) * 4.0);
          if (param7 < 77) {
            return;
          }
          for (var15 = v.field_g; var15 < bn.field_p; var15 += 4) {
            var16 = var15 - qg.field_n;
            var17 = -qh.field_e + var15;
            var18 = var12 * var16;
            var19 = var16 * var11_int;
            for (var20 = pk.field_m; cn.field_r > var20; var20 += 4) {
              var21 = -m.field_q + var20;
              var22 = var20 - ni.field_f;
              var23 = var18 + var11_int * var21 >> 2;
              if ((param0 != 0 ||
                !(en.field_s * var16 + var21 * gj.field_h < 0)) && (param6 != 0 ||
                !(var17 * bj.field_d + var22 * ic.field_n >= 0))) {
                if (param0 != 2 &&
                  var23 < 0) {
                  var24 = (int)Math.sqrt((double)(var21 * var21 + var16 * var16));
                  if (var24 <= param10) {
                    var25 = var20 >> 2;
                    var26 = var15 >> 2;
                    var27 = -(param3[-(param9 * var24 / param10) + param9] & 255) + 256;
                    var28 = var25 + var26 * si.field_e;
                    var29 = si.field_i[var28];
                    si.field_i[var28] = ll.a(ua.a(16711680, var27 * ua.a(var29, 65280)) >> 8, ua.a(16711935, var27 * ua.a(16711935, var29) >> 8));
                  }
                } else if (param6 != 2 &&
                  var13 < var23) {
                  var24 = (int)Math.sqrt((double)(var22 * var22 + var17 * var17));
                  if (param4 >= var24) {
                    var25 = var20 >> 2;
                    var26 = var15 >> 2;
                    var27 = -(param3[-(var24 * param9 / param4) + param9] & 255) + 256;
                    var28 = var25 + var26 * si.field_e;
                    var29 = si.field_i[var28];
                    si.field_i[var28] = ll.a(ua.a(var27 * ua.a(var29, 65280) >> 8, 65280), ua.a(ua.a(var29, 16711935) * var27 >> 8, 16711935));
                  }
                } else {
                  var24 = var21 * var12 - var19 >> 2;
                  if (var24 < 0) {
                    var24 = -var24;
                  }
                  var25 = (param10 * (var13 - var23) + var23 * param4) / var13;
                  if (var25 * var14 >> 2 > var24) {
                    var26 = var20 >> 2;
                    var27 = var15 >> 2;
                    var28 = -(param3[param9 - (var24 << 2) * param9 / var25 / var14] & 255) + 256;
                    var29 = var26 + si.field_e * var27;
                    var30 = si.field_i[var29];
                    si.field_i[var29] = ll.a(ua.a(var28 * ua.a(65280, var30) >> 8, 65280), ua.a(var28 * ua.a(var30, 16711935) >> 8, 16711935));
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_39_0 = var11;
          stackIn_39_1 = new StringBuilder().append("km.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    private km(vm param0, int param1) {
        super(param0, param1);
    }

    static {
    }
}
