/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc extends hl {
    static java.math.BigInteger field_W;
    static boolean field_cb;
    static boolean field_Y;
    static int field_X;
    static boolean field_Z;
    static boolean field_db;
    static kc field_bb;
    static String field_ab;

    final void a(boolean param0, pj param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "pc.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void q(int param0) {
        field_W = null;
        field_ab = null;
        field_bb = null;
        if (param0 != -1) {
          field_X = -91;
        }
    }

    pc(sk param0, pj param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static void a(int param0, String param1, String param2, boolean param3) {
        try {
          vh.field_k = param1;
          wd.field_p = param2;
          vd.a(param3, -536866817, ki.field_d);
          if (param0 != -1) {
            String var5 = (String) null;
            pc.a((String) null, false);
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "pc.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int[] param11) {
        int var18 = 0;
        int incrementValue$0 = 0;
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int incrementValue$2 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
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
        int var24Lifetime1;
        int var26Lifetime1;
        int var26Lifetime2;
        int var27Lifetime1;
        int var27Lifetime2;
        int var28Lifetime1;
        int var28Lifetime2;
        var29 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 != 53) {
            return;
          }
          var13 = 16384 / (1 + 2 * param9);
          var14 = 1 + param9 + (-param2 - param8);
          if (var14 > 0) {
            var14 = 0;
          }
          var15 = -param9 - param2 + (-param8 + ul.field_f);
          if (var15 > 0) {
            var15 = 0;
          }
          var16 = 0;
          var17 = 1 + param9 + param8;
          if (ul.field_f < var17) {
            var16 = var17 - ul.field_f;
            var17 = ul.field_f;
          }
          for (var18 = -param5; 0 > var18; var18++) {
            var19 = 0;
            var20 = 0;
            var21 = 0;
            var22 = param1 - param9;
            var23 = -1 - (param9 << 1) + var22;
            var24 = -param9 + param8;
            if (var24 < 0) {
              var23 = var23 - var24;
              var22 = var22 - var24;
              var24 = 0;
            }
            var25 = -var24 + var17;
            while (var17 > var24) {
              if (0 != param11[param7]) {
                param3 = param11[param7];
              } else {
                param3 = (16711422 & param6[var22]) >> 1;
              }
              var19 = var19 + (255 & param3 >> 16);
              var20 = var20 + (param3 >> 8 & 255);
              var22++;
              var21 = var21 + (param3 & 255);
              var23++;
              param7 += 4;
              var24++;
            }
            incrementValue$0 = param1;
            param1++;
            param6[incrementValue$0] = var21 / var25 + ((var19 / var25 << 16) + (var20 / var25 << 8));
            var24Lifetime1 = 1 - param2;
            var23 = var23 + var16;
            while (var14 > var24Lifetime1) {
              var23++;
              if (ul.field_e > param9 + param8 - (-param2 - var24Lifetime1)) {
                if (0 == param11[param7]) {
                  param3 = param6[var22] >> 1 & 8355711;
                } else {
                  param3 = param11[param7];
                }
                var19 = var19 + (255 & param3 >> 16);
                var25++;
                var22++;
                var21 = var21 + (255 & param3);
                param7 += 4;
                var20 = var20 + ((param3 & 65380) >> 8);
              }
              var26 = var19 / var25;
              var27 = var20 / var25;
              var28 = var21 / var25;
              incrementValue$5 = param1;
              param1++;
              param6[incrementValue$5] = var28 + ((var26 << 16) + (var27 << 8));
              var24Lifetime1++;
            }
            while (var15 > var24Lifetime1) {
              param3 = param6[var23++];
              var19 = var19 - (param3 >> 16 & 255);
              if (0 > var19) {
                var19 = 0;
              }
              var20 = var20 - ((65465 & param3) >> 8);
              if (0 > var20) {
                var20 = 0;
              }
              var21 = var21 - (param3 & 255);
              if (0 == param11[param7]) {
                param3 = 8355711 & param6[var22] >> 1;
                var12_int = param3;
                param3 = param3 | (1052688 | param3 >> 4);
                param3 = param3 - 65793;
                param3 = -(65793 & param3 >> 4) + var12_int;
              } else {
                param3 = param11[param7];
              }
              if (var21 < 0) {
                var21 = 0;
              }
              var21 = var21 + (param3 & 255);
              param7 += 4;
              var20 = var20 + (param3 >> 8 & 255);
              var22++;
              var19 = var19 + (255 & param3 >> 16);
              var26Lifetime1 = var13 * var19 >> 14;
              var27Lifetime1 = var13 * var20 >> 14;
              if (var27Lifetime1 > 255) {
                var27Lifetime1 = 255;
              }
              var28Lifetime1 = var13 * var21 >> 14;
              if (var26Lifetime1 > 255) {
                var26Lifetime1 = 255;
              }
              if (255 < var28Lifetime1) {
                var28Lifetime1 = 255;
              }
              incrementValue$4 = param1;
              param1++;
              param6[incrementValue$4] = var28Lifetime1 + (var27Lifetime1 << 8) + (var26Lifetime1 << 16);
              var24Lifetime1++;
            }
            while (var24Lifetime1 < 0) {
              param3 = param6[var23++];
              var25--;
              var19 = var19 - (255 & param3 >> 16);
              var20 = var20 - ((param3 & 65512) >> 8);
              var21 = var21 - (param3 & 255);
              var26Lifetime2 = var19 / var25;
              var27Lifetime2 = var20 / var25;
              if (0 <= var27Lifetime2) {
                if (var27Lifetime2 > 255) {
                  var27Lifetime2 = 255;
                }
              } else {
                var27Lifetime2 = 0;
              }
              var28Lifetime2 = var21 / var25;
              if (var26Lifetime2 >= 0) {
                if (255 < var26Lifetime2) {
                  var26Lifetime2 = 255;
                }
              } else {
                var26Lifetime2 = 0;
              }
              if (var28Lifetime2 >= 0) {
                if (var28Lifetime2 > 255) {
                  var28Lifetime2 = 255;
                }
              } else {
                var28Lifetime2 = 0;
              }
              incrementValue$2 = param1;
              param1++;
              param6[incrementValue$2] = (var26Lifetime2 << 16) - (-(var27Lifetime2 << 8) - var28Lifetime2);
              var24Lifetime1++;
            }
            param7 = param7 + param10;
            param1 = param1 + param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_67_0 = var12;
          stackIn_67_1 = new StringBuilder().append("pc.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    final static void f(boolean param0) {
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ef var4_ref_ef = null;
        Object var5 = null;
        int var6 = 0;
        int[] var7 = null;
        vb var9 = null;
        se var10 = null;
        byte[] var14 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          var10 = cd.field_t;
          var2 = var10.b((byte) 90);
          if (var2 == 0) {
            var9 = (vb) (e.field_b.b((byte) -28));
            if (var9 == null) {
              th.a(119);
              return;
            }
            var4 = var10.b((byte) 90);
            if (var4 == 0) {
              var5 = null;
            } else {
              var14 = new byte[var4];
              var10.a((byte) 108, var14, 0, var4);
            }
            var10.field_i = var10.field_i + 4;
            if (!var10.h(9982)) {
              th.a(108);
              return;
            }
            var9.b(57);
          } else {
            if (var2 == 1) {
              var3 = var10.l(0);
              var4_ref_ef = (ef) (sd.field_a.b((byte) -113));
              while (var4_ref_ef != null) {
                if (var4_ref_ef.field_f != var3) {
                  var4_ref_ef = (ef) (sd.field_a.d(853));
                  continue;
                }
                break;
              }
              if (var4_ref_ef == null) {
                th.a(126);
                return;
              }
              var4_ref_ef.b(57);
            } else {
              pe.a((byte) -13, (Throwable) null, "A1: " + sj.b(true));
              th.a(119);
            }
          }
          if (param0) {
            stackIn_25_0 = 57;
            stackIn_25_1 = -8;
            var7 = (int[]) null;
            pc.$cfr$intArgs$a$c64d0b17f51c(stackIn_25_0, stackIn_25_1, -11, 81, 3, 33, (int[]) null, -76, -25, 43, -2, (int[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "pc.K(" + param0 + ')');
        }
    }

    final static void a(String param0, boolean param1) {
        try {
          ug.field_r = param0;
          if (!param1) {
            field_bb = (kc) null;
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "pc.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_W = new java.math.BigInteger("65537");
        field_Z = true;
        field_db = false;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$c64d0b17f51c(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int[] param11) {
        int var18 = 0;
        int incrementValue$0 = 0;
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int incrementValue$2 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
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
        int var24Lifetime1;
        int var26Lifetime1;
        int var26Lifetime2;
        int var27Lifetime1;
        int var27Lifetime2;
        int var28Lifetime1;
        int var28Lifetime2;
        var29 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 != 53) {
            return;
          }
          var13 = 16384 / (1 + 2 * param9);
          var14 = 1 + param9 + (-param2 - param8);
          if (var14 > 0) {
            var14 = 0;
          }
          var15 = -param9 - param2 + (-param8 + ul.field_f);
          if (var15 > 0) {
            var15 = 0;
          }
          var16 = 0;
          var17 = 1 + param9 + param8;
          if (ul.field_f < var17) {
            var16 = var17 - ul.field_f;
            var17 = ul.field_f;
          }
          for (var18 = -param5; 0 > var18; var18++) {
            var19 = 0;
            var20 = 0;
            var21 = 0;
            var22 = param1 - param9;
            var23 = -1 - (param9 << 1) + var22;
            var24 = -param9 + param8;
            if (var24 < 0) {
              var23 = var23 - var24;
              var22 = var22 - var24;
              var24 = 0;
            }
            var25 = -var24 + var17;
            while (var17 > var24) {
              if (0 != param11[param7]) {
                param3 = param11[param7];
              } else {
                param3 = (16711422 & param6[var22]) >> 1;
              }
              var19 = var19 + (255 & param3 >> 16);
              var20 = var20 + (param3 >> 8 & 255);
              var22++;
              var21 = var21 + (param3 & 255);
              var23++;
              param7 += 4;
              var24++;
            }
            incrementValue$0 = param1;
            param1++;
            param6[incrementValue$0] = var21 / var25 + ((var19 / var25 << 16) + (var20 / var25 << 8));
            var24Lifetime1 = 1 - param2;
            var23 = var23 + var16;
            while (var14 > var24Lifetime1) {
              var23++;
              if (ul.field_e > param9 + param8 - (-param2 - var24Lifetime1)) {
                if (0 == param11[param7]) {
                  param3 = param6[var22] >> 1 & 8355711;
                } else {
                  param3 = param11[param7];
                }
                var19 = var19 + (255 & param3 >> 16);
                var25++;
                var22++;
                var21 = var21 + (255 & param3);
                param7 += 4;
                var20 = var20 + ((param3 & 65380) >> 8);
              }
              var26 = var19 / var25;
              var27 = var20 / var25;
              var28 = var21 / var25;
              incrementValue$5 = param1;
              param1++;
              param6[incrementValue$5] = var28 + ((var26 << 16) + (var27 << 8));
              var24Lifetime1++;
            }
            while (var15 > var24Lifetime1) {
              param3 = param6[var23++];
              var19 = var19 - (param3 >> 16 & 255);
              if (0 > var19) {
                var19 = 0;
              }
              var20 = var20 - ((65465 & param3) >> 8);
              if (0 > var20) {
                var20 = 0;
              }
              var21 = var21 - (param3 & 255);
              if (0 == param11[param7]) {
                param3 = 8355711 & param6[var22] >> 1;
                var12_int = param3;
                param3 = param3 | (1052688 | param3 >> 4);
                param3 = param3 - 65793;
                param3 = -(65793 & param3 >> 4) + var12_int;
              } else {
                param3 = param11[param7];
              }
              if (var21 < 0) {
                var21 = 0;
              }
              var21 = var21 + (param3 & 255);
              param7 += 4;
              var20 = var20 + (param3 >> 8 & 255);
              var22++;
              var19 = var19 + (255 & param3 >> 16);
              var26Lifetime1 = var13 * var19 >> 14;
              var27Lifetime1 = var13 * var20 >> 14;
              if (var27Lifetime1 > 255) {
                var27Lifetime1 = 255;
              }
              var28Lifetime1 = var13 * var21 >> 14;
              if (var26Lifetime1 > 255) {
                var26Lifetime1 = 255;
              }
              if (255 < var28Lifetime1) {
                var28Lifetime1 = 255;
              }
              incrementValue$4 = param1;
              param1++;
              param6[incrementValue$4] = var28Lifetime1 + (var27Lifetime1 << 8) + (var26Lifetime1 << 16);
              var24Lifetime1++;
            }
            while (var24Lifetime1 < 0) {
              param3 = param6[var23++];
              var25--;
              var19 = var19 - (255 & param3 >> 16);
              var20 = var20 - ((param3 & 65512) >> 8);
              var21 = var21 - (param3 & 255);
              var26Lifetime2 = var19 / var25;
              var27Lifetime2 = var20 / var25;
              if (0 <= var27Lifetime2) {
                if (var27Lifetime2 > 255) {
                  var27Lifetime2 = 255;
                }
              } else {
                var27Lifetime2 = 0;
              }
              var28Lifetime2 = var21 / var25;
              if (var26Lifetime2 >= 0) {
                if (255 < var26Lifetime2) {
                  var26Lifetime2 = 255;
                }
              } else {
                var26Lifetime2 = 0;
              }
              if (var28Lifetime2 >= 0) {
                if (var28Lifetime2 > 255) {
                  var28Lifetime2 = 255;
                }
              } else {
                var28Lifetime2 = 0;
              }
              incrementValue$2 = param1;
              param1++;
              param6[incrementValue$2] = (var26Lifetime2 << 16) - (-(var27Lifetime2 << 8) - var28Lifetime2);
              var24Lifetime1++;
            }
            param7 = param7 + param10;
            param1 = param1 + param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_67_0 = var12;
          stackIn_67_1 = new StringBuilder().append("pc.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }
}
