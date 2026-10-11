/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr {
    static qr field_a;
    static String field_d;
    static byte[] field_c;
    static String field_f;
    static int[] field_b;
    static String field_e;

    final static lp a(ph param0, fs param1, byte param2, fs param3, fs[] param4) {
        String dupTemp$1 = null;
        int var9_int = 0;
        RuntimeException var5 = null;
        kb var6 = null;
        fe var7 = null;
        ff var8 = null;
        ff var9 = null;
        ff var10 = null;
        int var11 = 0;
        lp var12 = null;
        lp var13 = null;
        lp[] stackIn_3_0 = null;
        int stackIn_4_1 = 0;
        fe[] stackIn_6_0 = null;
        int stackIn_7_1 = 0;
        lp stackIn_9_0 = null;
        ff[][] stackIn_12_0 = null;
        int stackIn_13_1 = 0;
        ff[][] stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        lp stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var12 = new lp(0, 0, 182, rg.field_a);
          var13 = var12;
          var13.field_h = param3;
          stackIn_3_0 = param0.field_h;
          if (param1.field_x < param3.field_x) {
            stackIn_4_1 = param3.field_x;
          } else {
            stackIn_4_1 = param3.field_x + 1;
          }
          stackIn_3_0[stackIn_4_1] = var12;
          var6 = new kb(pf.field_a[param3.field_x].field_z * 3 / 4, -1 + (var13.field_i / 2 - rs.field_Cb.field_J), 182 - pf.field_a[param3.field_x].field_z * 3 / 4, param3.field_k, param3.field_t, 16777215, true);
          var13.a(var6, 8);
          var7 = new fe(3 * pf.field_a[param3.field_x].field_z / 4, var13.field_i / 2 + 1, 182 - 3 * pf.field_a[param3.field_x].field_z / 4, rs.field_Cb.field_J, 8421504, md.i(0), eb.field_e, 3375155);
          var13.a(var7, param2 - 13);
          stackIn_6_0 = param0.field_i;
          if (param3.field_x >= param1.field_x) {
            stackIn_7_1 = -1 + param3.field_x;
          } else {
            stackIn_7_1 = param3.field_x;
          }
          stackIn_6_0[stackIn_7_1] = var7;
          dupTemp$1 = re.a(jg.field_f, 4371, new String[]{param3.field_t});
          var7.field_o = dupTemp$1;
          var6.field_o = dupTemp$1;
          var13.field_o = dupTemp$1;
          if (param2 != 21) {
            stackIn_9_0 = (lp) null;
            return stackIn_9_0;
          }
          bg.a(-2612, param4.length);
          var8 = new ff(3 * pf.field_a[param3.field_x].field_z / 4, 3 + var13.field_i / 2 + rs.field_Cb.field_J, ne.a(-1, false));
          var13.a(var8, 8);
          var8.field_o = re.a(jg.field_f, 4371, new String[]{param3.field_t});
          stackIn_12_0 = param0.field_f;
          if (param1.field_x < param3.field_x) {
            stackIn_13_1 = param3.field_x;
          } else {
            stackIn_13_1 = 1 + param3.field_x;
          }
          stackIn_12_0[stackIn_13_1][0] = var8;
          for (var9_int = 1; param4.length - 1 > var9_int; var9_int++) {
            var10 = new ff(pf.field_a[param3.field_x].field_z + (2 + dc.field_F.field_z) * var9_int, var13.field_i / 2 + rs.field_Cb.field_J + 3, wm.a(-1, param2 - 21));
            var13.a(var10, 8);
            var10.field_o = re.a(jg.field_f, 4371, new String[]{param3.field_t});
            stackIn_17_0 = param0.field_f;
            if (param3.field_x <= param1.field_x) {
              stackIn_18_1 = 1 + param3.field_x;
            } else {
              stackIn_18_1 = param3.field_x;
            }
            stackIn_17_0[stackIn_18_1][var9_int] = var10;
          }
          var9 = new ff(0, (var12.field_i - pf.field_a[param3.field_x].field_w) / 2, pf.field_a[param3.field_x]);
          var13.a(var9, param2 ^ 29);
          var9.field_o = re.a(jg.field_f, 4371, new String[]{param3.field_t});
          stackIn_20_0 = var13;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("lr.E(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param4 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        field_f = null;
        field_b = null;
        field_e = null;
        field_c = null;
        if (param0 != 3) {
          field_c = (byte[]) null;
        }
    }

    final static void a(int param0, int param1, int[] param2, byte param3, Object[] param4) {
        int var10 = 0;
        int incrementValue$0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var11 = 0;
        Object var12 = null;
        int var13 = 0;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param3 <= 66) {
            return;
          }
          if (param1 > param0) {
            var5_int = (param0 + param1) / 2;
            var6 = param0;
            var7 = param2[var5_int];
            param2[var5_int] = param2[param1];
            param2[param1] = var7;
            var8 = param4[var5_int];
            param4[var5_int] = param4[param1];
            param4[param1] = var8;
            stackIn_7_0 = (var7 == 2147483647) ? 0 : 1;
            var9 = stackIn_7_0;
            for (var10 = param0; param1 > var10; var10++) {
              if ((var7 - (var9 & var10)) < param2[var10]) {
                var11 = param2[var10];
                param2[var10] = param2[var6];
                param2[var6] = var11;
                var12 = param4[var10];
                param4[var10] = param4[var6];
                incrementValue$0 = var6;
                var6++;
                param4[incrementValue$0] = var12;
              }
            }
            param2[param1] = param2[var6];
            param2[var6] = var7;
            param4[param1] = param4[var6];
            param4[var6] = var8;
            lr.a(param0, var6 - 1, param2, (byte) 69, param4);
            lr.a(var6 + 1, param1, param2, (byte) 77, param4);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("lr.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 63) {
            stackIn_4_0 = hm.a(param1, 0, param1.length, (byte) 28);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("lr.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static int a(byte param0) {
        if (param0 != 27) {
          Object[] var2 = (Object[]) null;
          lr.a(-35, -18, (int[]) null, (byte) 95, (Object[]) null);
        }
        return tg.field_b.nextInt();
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        byte[] var3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (param0 == 100 &&
          je.field_c > 0) {
          fieldTemp$3 = je.field_c - 1;
          je.field_c = je.field_c - 1;
          var2_ref_byte__ = qf.field_d[fieldTemp$3];
          qf.field_d[je.field_c] = null;
          return var2_ref_byte__;
        }
        if (param0 == 5000 &&
          ik.field_j > 0) {
          fieldTemp$4 = ik.field_j - 1;
          ik.field_j = ik.field_j - 1;
          var2_ref_byte__Lifetime1 = mj.field_Bb[fieldTemp$4];
          mj.field_Bb[ik.field_j] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param0 == 30000 &&
          0 < en.field_a) {
          fieldTemp$5 = en.field_a - 1;
          en.field_a = en.field_a - 1;
          var2_ref_byte__Lifetime2 = jf.field_c[fieldTemp$5];
          jf.field_c[en.field_a] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (param1 <= 67) {
          return (byte[]) null;
        }
        if (nn.field_c != null) {
          for (var2 = 0; var2 < nf.field_a.length; var2++) {
            if (nf.field_a[var2] == param0 &&
              tf.field_a[var2] > 0) {
              dupTemp$6 = tf.field_a[var2] - 1;
              arrayValue$7 = nn.field_c[var2];
              tf.field_a[var2] = dupTemp$6;
              var3 = arrayValue$7[dupTemp$6];
              nn.field_c[var2][tf.field_a[var2]] = null;
              return var3;
            }
          }
        }
        return new byte[param0];
    }

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        sl var5 = null;
        int var6 = 0;
        int var8 = 0;
        Object[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        lq var12 = null;
        sl var13 = null;
        int[] var14 = null;
        gb var15 = null;
        Object var16 = null;
        gb var16_ref = null;
        int[] var17 = null;
        var16 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 < 65) {
            var9 = (Object[]) null;
            lr.a(121, -50, (int[]) null, (byte) -33, (Object[]) null);
          }
          var13 = sa.field_a;
          var2 = var13.j(-100);
          if (var2 == 0) {
            var11 = ae.a(-128);
            var17 = var11;
            var14 = var17;
            var3 = var14;
            var10 = var11;
            var4 = var10;
            var5 = var13;
            var6 = ((ob) ((Object) var5)).j(-115);
            for (var7 = 0; var7 < var6; var7++) {
              var10[var7] = ((ob) ((Object) var5)).a(16711680);
            }
            var15 = (gb) (vl.field_o.d(0));
            if (var15 == null) {
              q.g(-112);
              return;
            }
            var15.field_l = false;
            var15.field_h = var17[0];
            var15.field_j = true;
            var15.field_k = var3;
            var15.b((byte) -105);
            return;
          }
          if (var2 == 1) {
            var12 = (lq) (rs.field_Bb.d(0));
            if (var12 == null) {
              q.g(-100);
              return;
            }
            var12.b((byte) -108);
          } else {
            if (var2 == 2) {
              var16_ref = (gb) (vl.field_o.d(0));
              if (var16_ref == null) {
                q.g(-120);
                return;
              }
              var16_ref.field_k = ae.a(-116);
              var16_ref.field_h = var16_ref.field_k[0];
              var16_ref.field_j = true;
              var16_ref.field_l = true;
              var16_ref.b((byte) -89);
            } else {
              jq.a(-29901, (Throwable) null, "A1: " + w.a(16738));
              q.g(-125);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "lr.G(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
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
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var42 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var35Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var36Lifetime2;
        int var36Lifetime3;
        int var37Lifetime2;
        int var38Lifetime2;
        int var39Lifetime2;
        int var40Lifetime2;
        var42 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param8 >= 0 &&
            param4 < wn.field_e) {
            if (0 > param3 &&
              param0 < 0 &&
              param14 < 0) {
              return;
            }
            if (wn.field_c <= param3 &&
              wn.field_c <= param0 &&
              param14 >= wn.field_c) {
              return;
            }
            if (param2 != -31232) {
              return;
            }
            var34 = -param4 + param8;
            if (param15 == param4) {
              if (param8 == param4) {
                var27 = 0;
                var32 = 0;
                var18 = param0 << 16;
                var29 = param10;
                var23 = 0;
                var17_int = param3 << 16;
                var24 = 0;
                var19 = 0;
                var21 = param9;
                var25 = param16;
                var28 = 0;
                var26 = param11;
                var31 = 0;
                var30 = param1;
                var20 = 0;
                var22 = param7;
              } else {
                var35 = -param15 + param8;
                if (param0 > param3) {
                  var23 = (-param9 + param6 << 16) / var34;
                  var32 = (-param1 + param13 << 16) / var35;
                  var27 = (param12 - param16 << 16) / var34;
                  var29 = param10 << 16;
                  var30 = param1 << 16;
                  var22 = param7 << 16;
                  var31 = (param13 - param10 << 16) / var34;
                  var24 = (param6 - param7 << 16) / var35;
                  var28 = (param12 - param11 << 16) / var35;
                  var26 = param11 << 16;
                  var25 = param16 << 16;
                  var18 = param0 << 16;
                  var17_int = param3 << 16;
                  var21 = param9 << 16;
                  var19 = (param14 - param3 << 16) / var34;
                  var20 = (param14 - param0 << 16) / var35;
                } else {
                  var28 = (param12 - param16 << 16) / var34;
                  var30 = param10 << 16;
                  var18 = param3 << 16;
                  var29 = param1 << 16;
                  var31 = (param13 - param1 << 16) / var35;
                  var17_int = param0 << 16;
                  var20 = (-param3 + param14 << 16) / var34;
                  var32 = (-param10 + param13 << 16) / var34;
                  var25 = param11 << 16;
                  var27 = (-param11 + param12 << 16) / var35;
                  var21 = param7 << 16;
                  var24 = (param6 - param9 << 16) / var34;
                  var19 = (param14 - param0 << 16) / var35;
                  var22 = param9 << 16;
                  var26 = param16 << 16;
                  var23 = (param6 - param7 << 16) / var35;
                }
              }
              if (param4 < 0) {
                param4 = Math.min(-param4, param15 - param4);
                var22 = var22 + var24 * param4;
                var17_int = var17_int + var19 * param4;
                var25 = var25 + var27 * param4;
                var18 = var18 + param4 * var20;
                var29 = var29 + var31 * param4;
                var30 = var30 + param4 * var32;
                var26 = var26 + param4 * var28;
                var21 = var21 + var23 * param4;
                param4 = 0;
              }
              var33 = 0;
            } else {
              var26 = param16 << 16;
              var25 = param16 << 16;
              var18 = param3 << 16;
              var17_int = param3 << 16;
              var22 = param9 << 16;
              var21 = param9 << 16;
              var30 = param10 << 16;
              var29 = param10 << 16;
              var35 = param15 - param4;
              var20 = (param14 - param3 << 16) / var34;
              var19 = (-param3 + param0 << 16) / var35;
              if (var20 > var19) {
                var27 = (param11 - param16 << 16) / var35;
                var32 = (param13 - param10 << 16) / var34;
                var28 = (-param16 + param12 << 16) / var34;
                var31 = (-param10 + param1 << 16) / var35;
                var33 = 0;
                var23 = (param7 - param9 << 16) / var35;
                var24 = (-param9 + param6 << 16) / var34;
              } else {
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var27 = (param12 - param16 << 16) / var34;
                var32 = (param1 - param10 << 16) / var35;
                var24 = (-param9 + param7 << 16) / var35;
                var31 = (param13 - param10 << 16) / var34;
                var23 = (-param9 + param6 << 16) / var34;
                var33 = 1;
                var28 = (param11 - param16 << 16) / var35;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param4 < 0) {
                if (param15 < 0) {
                  param4 = param15 - param4;
                  var17_int = var17_int + var19 * param4;
                  var30 = var30 + param4 * var32;
                  var29 = var29 + param4 * var31;
                  var22 = var22 + param4 * var24;
                  var26 = var26 + var28 * param4;
                  var18 = var18 + param4 * var20;
                  var21 = var21 + var23 * param4;
                  var25 = var25 + var27 * param4;
                  param4 = param15;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param4 = -param4;
                  var29 = var29 + param4 * var31;
                  var26 = var26 + var28 * param4;
                  var21 = var21 + param4 * var23;
                  var25 = var25 + param4 * var27;
                  var22 = var22 + param4 * var24;
                  var18 = var18 + param4 * var20;
                  var30 = var30 + var32 * param4;
                  var17_int = var17_int + var19 * param4;
                  param4 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = wn.field_h[param4];
                while (param4 < param15) {
                  var37 = var17_int >> 16;
                  if (var37 < wn.field_c) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (var38 == 0) {
                      if (var37 >= 0 &&
                        var37 < wn.field_c) {
                        jg.a(var38, var29, var37 + var36Lifetime2, 0, var25, false, var21, 0, param5, 0);
                      }
                    } else {
                      var39 = (var22 - var21) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (var30 - var29) / var38;
                      if (wn.field_c <= var38 + var37) {
                        var38 = -1 + wn.field_c - var37;
                      }
                      if (0 > var37) {
                        jg.a(var38 + var37, var29 - var37 * var41, var36Lifetime2, var40, -(var40 * var37) + var25, false, -(var37 * var39) + var21, var41, param5, var39);
                      } else {
                        jg.a(var38, var29, var37 + var36Lifetime2, var40, var25, false, var21, var41, param5, var39);
                      }
                    }
                  }
                  param4++;
                  if (wn.field_e <= param4) {
                    return;
                  }
                  var21 = var21 + var23;
                  var29 = var29 + var31;
                  var17_int = var17_int + var19;
                  var18 = var18 + var20;
                  var22 = var22 + var24;
                  var25 = var25 + var27;
                  var36Lifetime2 = var36Lifetime2 + gf.field_b;
                  var26 = var26 + var28;
                  var30 = var30 + var32;
                }
              }
              var36Lifetime3 = -param15 + param8;
              if (0 != var36Lifetime3) {
                var37Lifetime2 = param14 << 16;
                var38Lifetime2 = param6 << 16;
                var39Lifetime2 = param12 << 16;
                if (var33 != 0) {
                  var30 = param1 << 16;
                  var22 = param7 << 16;
                  var26 = param11 << 16;
                  var18 = param0 << 16;
                } else {
                  var21 = param7 << 16;
                  var29 = param1 << 16;
                  var17_int = param0 << 16;
                  var25 = param11 << 16;
                }
                var40Lifetime2 = param13 << 16;
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
              } else {
                var19 = 0;
                var28 = 0;
                var31 = 0;
                var23 = 0;
                var27 = 0;
                var24 = 0;
                var20 = 0;
                var32 = 0;
              }
            }
            if (param4 < 0) {
              param4 = -param4;
              var26 = var26 + param4 * var28;
              var30 = var30 + param4 * var32;
              var29 = var29 + param4 * var31;
              var18 = var18 + var20 * param4;
              var25 = var25 + param4 * var27;
              var22 = var22 + var24 * param4;
              var17_int = var17_int + var19 * param4;
              var21 = var21 + param4 * var23;
              param4 = 0;
            }
            var35Lifetime1 = wn.field_h[param4];
            while (param4 < param8) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < wn.field_c) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (var37Lifetime1 == 0) {
                  if (var36Lifetime1 >= 0 &&
                    wn.field_c > var36Lifetime1) {
                    jg.a(var37Lifetime1, var29, var36Lifetime1 + var35Lifetime1, 0, var25, false, var21, 0, param5, 0);
                  }
                } else {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (-var29 + var30) / var37Lifetime1;
                  if (var37Lifetime1 + var36Lifetime1 >= wn.field_c) {
                    var37Lifetime1 = -var36Lifetime1 + (wn.field_c - 1);
                  }
                  if (var36Lifetime1 >= 0) {
                    jg.a(var37Lifetime1, var29, var36Lifetime1 + var35Lifetime1, var39Lifetime1, var25, false, var21, var40Lifetime1, param5, var38Lifetime1);
                  } else {
                    jg.a(var37Lifetime1 + var36Lifetime1, -(var36Lifetime1 * var40Lifetime1) + var29, var35Lifetime1, var39Lifetime1, var25 - var36Lifetime1 * var39Lifetime1, false, var21 - var36Lifetime1 * var38Lifetime1, var40Lifetime1, param5, var38Lifetime1);
                  }
                }
              }
              param4++;
              if (param4 >= wn.field_e) {
                return;
              }
              var25 = var25 + var27;
              var21 = var21 + var23;
              var26 = var26 + var28;
              var35Lifetime1 = var35Lifetime1 + gf.field_b;
              var22 = var22 + var24;
              var17_int = var17_int + var19;
              var18 = var18 + var20;
              var29 = var29 + var31;
              var30 = var30 + var32;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_79_0 = var17;
          stackIn_79_1 = new StringBuilder().append("lr.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    static {
        field_f = "End turn";
        field_d = "That name is not available";
        field_b = new int[]{-1, -1, 2, -1, -1, -1, 2, 3, 0, -1, 3, -1, 1, -1, -1, -1, -1, -1, 3, 3, 0, 2};
        field_e = "Rankings";
    }
}
