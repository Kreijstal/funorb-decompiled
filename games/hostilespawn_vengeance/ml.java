/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static String field_b;
    static bd field_a;

    final static void a(byte param0, int param1) {
        jg.a(23);
        if (param0 != 112) {
          vi var3 = (vi) null;
          ml.a((vi) null, (java.math.BigInteger) null, 8, (java.math.BigInteger) null, (vi) null);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -67) {
          return;
        }
        field_a = null;
    }

    final static ll a(int param0, String param1) {
        ll stackIn_6_0 = null;
        ll stackIn_9_0 = null;
        ll stackIn_15_0 = null;
        int stackIn_24_0 = 0;
        ll stackIn_28_0 = null;
        ll stackIn_42_0 = null;
        ll stackIn_46_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          var2_int = param1.length();
          if (param0 >= -43) {
            field_a = (bd) null;
          }
          if (var2_int == 0) {
            stackIn_6_0 = gf.field_f;
            return stackIn_6_0;
          }
          if (var2_int > 64) {
            stackIn_9_0 = hb.field_v;
            return stackIn_9_0;
          }
          if (param1.charAt(0) == 34) {
            if (param1.charAt(var2_int - 1) != 34) {
              stackIn_15_0 = we.field_g;
              return stackIn_15_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < var2_int - 1; var4++) {
              var5 = param1.charAt(var4);
              if (var5 == 92) {
                stackIn_24_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_24_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_28_0 = we.field_g;
                  return stackIn_28_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var2_int > var4Lifetime1; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param1.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                var4Lifetime1 != var2_int - 1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_42_0 = we.field_g;
                return stackIn_42_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (e.field_A.indexOf(var5Lifetime1) == -1) {
                stackIn_46_0 = we.field_g;
                return stackIn_46_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_52_0 = var2;
          stackIn_52_1 = new StringBuilder().append("ml.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    final static void a(vi param0, java.math.BigInteger param1, int param2, java.math.BigInteger param3, vi param4) {
        try {
          hg.a(param4.field_n, -120, param4.field_i, param2, param0, param1, param3);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ml.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -110) {
            stackIn_4_0 = gm.a(param1, -116, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ml.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static byte[] a(byte[] param0, byte param1) {
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        CharSequence var9 = null;
        vi var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        try {
          var10 = new vi(param0);
          var3 = var10.l(param1 ^ -32326);
          var4 = var10.d(8195);
          if (param1 != -76) {
            var9 = (CharSequence) null;
            ml.a((byte) -45, (CharSequence) null);
          }
          if (var4 >= 0 && (mk.field_H == 0 ||
            !(var4 > mk.field_H))) {
            if (var3 == 0) {
              var14 = new byte[var4];
              var12 = var14;
              var5 = var12;
              var10.a(var4, 0, var14, -18181);
              stackIn_23_0 = var5;
              return stackIn_23_0;
            }
            var5_int = var10.d(8195);
            if (var5_int >= 0 && (mk.field_H == 0 ||
              !(var5_int > mk.field_H))) {
              var13 = new byte[var5_int];
              var11 = var13;
              var6 = var11;
              if (var3 != 1) {
                var7 = tg.field_b;
                synchronized (var7) {
                  tg.field_b.a(124, var13, var10);
                }
              } else {
                wf.a(var13, var5_int, param0, var4, 9);
              }
              stackIn_21_0 = var6;
              return stackIn_21_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("ml.G(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, double param1, double param2, p param3, int[] param4, oj param5, int param6) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var12 = 0;
        p var13 = null;
        p var14 = null;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param4[param3.field_j.b(-4)] == 2) {
            param3.field_i = 14;
            param3.field_e = 1;
            var9_int = 16;
            for (var10 = 0; var10 < var9_int; var10++) {
              var13 = jn.field_F[ib.field_c];
              var13.field_c = Math.random() * 256.0;
              if (!(var13.field_c < 0.0)) {
                if (256.0 <= var13.field_c) {
                  var13.field_c = var13.field_c - 256.0;
                }
              } else {
                var13.field_c = var13.field_c + 256.0;
              }
              var13.field_j.a((byte) 46, param3.field_j);
              var13.field_l.a(param3.field_l, -28860);
              var13.field_h = 0;
              var13.field_i = 37;
              var13.field_e = 0;
              ib.field_c = ib.field_c + 1;
            }
          } else {
            param3.field_l.a(6, (byte) 94, param3.field_c);
          }
          param3.a(8573);
          param4[param6] = 0;
          if (param0 > -96) {
            field_a = (bd) null;
          }
          if (param3.a(param1, param2, 29821)) {
            if (param3.field_i != 14) {
              var9_intLifetime1 = 16;
              for (var10Lifetime1 = 0; var9_intLifetime1 > var10Lifetime1; var10Lifetime1++) {
                var14 = jn.field_F[ib.field_c];
                var14.field_c = 256.0 * Math.random();
                if (!(0.0 > var14.field_c)) {
                  if (var14.field_c >= 256.0) {
                    var14.field_c = var14.field_c - 256.0;
                  }
                } else {
                  var14.field_c = var14.field_c + 256.0;
                }
                var14.field_j.a((byte) 46, param3.field_j);
                var14.field_l.a(param3.field_l, -28860);
                ib.field_c = ib.field_c + 1;
                var14.field_i = 37;
                var14.field_e = 0;
                var14.field_h = 0;
              }
            }
            param5.field_F = 255;
            param5.field_z = 4;
            param3.field_i = 14;
            param3.field_e = 1;
            tk.a(1, fg.field_b, 0, true);
          }
          param4[param6] = 3;
          param3.field_e = param3.field_e + 1;
          if (param3.field_e > 32) {
            param3.field_i = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_30_0 = var9;
          stackIn_30_1 = new StringBuilder().append("ml.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param4 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param5 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, boolean param14, int param15) {
        int var17;
        var17 = HostileSpawn.field_I ? 1 : 0;
        if (param8 < param0) {
          if (param0 < param6) {
            tg.a(param5, param3, param11, param7, param0, param15, param10, param9, param8, param13, 1299210768, si.field_i, param4, param12, param1, param2, param6);
          } else {
            if (param8 < param6) {
              tg.a(param9, param3, param11, param7, param6, param10, param15, param5, param8, param1, 1299210768, si.field_i, param12, param4, param13, param2, param0);
            } else {
              tg.a(param9, param5, param12, param1, param8, param10, param2, param3, param6, param7, 1299210768, si.field_i, param11, param4, param13, param15, param0);
            }
          }
        } else {
          if (param8 >= param6) {
            if (param6 > param0) {
              tg.a(param3, param9, param4, param13, param6, param2, param15, param5, param0, param1, 1299210768, si.field_i, param12, param11, param7, param10, param8);
            } else {
              tg.a(param3, param5, param12, param1, param0, param2, param10, param9, param6, param13, 1299210768, si.field_i, param4, param11, param7, param15, param8);
            }
          } else {
            tg.a(param5, param9, param4, param13, param8, param15, param2, param3, param0, param7, 1299210768, si.field_i, param11, param12, param1, param10, param6);
          }
        }
        if (param14) {
          ml.a((byte) -43);
        }
    }

    static {
        field_b = "Orb points: ";
    }
}
