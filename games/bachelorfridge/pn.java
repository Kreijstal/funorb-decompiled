/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pn {
    static String field_e;
    static int field_d;
    static int field_f;
    private pa[] field_c;
    ee[] field_b;
    kv[] field_a;

    private final ee a(int param0, byte param1) {
        pa discarded$0 = null;
        if (param1 != -78) {
          kv var4 = (kv) null;
          discarded$0 = this.a((kv) null, (kv) null, false, 60);
        }
        if (param0 < 0) {
          return null;
        }
        if (param0 > 31) {
          return null;
        }
        return this.field_b[param0 + 120];
    }

    private final ee b(int param0, int param1, int param2) {
        if (param1 > 5) {
          return null;
        }
        int var4 = -127 / ((param2 + 49) / 34);
        if (param0 == 0) {
          return nca.field_a[param1];
        }
        if (param0 == 1) {
          return nca.field_a[32 + param1];
        }
        if (param0 == 2) {
          return nca.field_a[96 + param1];
        }
        return null;
    }

    final void a(jo param0, byte param1) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        aj var7 = null;
        aj var8 = null;
        aj var9 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        var6 = BachelorFridge.field_y;
        try {
          if (-1 != param0.field_F) {
            this.a(param0, -1);
          }
          for (var4 = 0; param0.field_z > var4; var4++) {
            for (var5 = 0; var5 < param0.field_a; var5++) {
              var7 = param0.a(var4, (byte) 45, var5);
              this.a(var5, var4, param0, var7.field_a, var7.field_c, false);
            }
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < 2 + param0.field_z; var4Lifetime1++) {
            for (var5Lifetime1 = 0; var5Lifetime1 < 2 + param0.field_a; var5Lifetime1++) {
              var8 = param0.a(var4Lifetime1, (byte) -103, var5Lifetime1);
              if (param0.field_j[var5Lifetime1][var4Lifetime1].field_n == 1) {
                this.a(var5Lifetime1, false, var8.field_c, var4Lifetime1, param0, -32 + var8.field_a);
              }
            }
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < param0.field_z; var4Lifetime2++) {
            for (var5Lifetime2 = 0; param0.field_a > var5Lifetime2; var5Lifetime2++) {
              var9 = param0.a(var4Lifetime2, (byte) 48, var5Lifetime2);
              if (param0.field_I[var5Lifetime2][var4Lifetime2].field_a != -1 &&
                !param0.field_I[var5Lifetime2][var4Lifetime2].field_d) {
                this.a(var4Lifetime2, var9, var5Lifetime2, (byte) -35, param0);
              }
              this.a(var5Lifetime2, 79, var4Lifetime2, param0, var9.field_c, var9.field_a);
            }
          }
          if (param1 < 97) {
            this.field_c = (pa[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("pn.H(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(jo param0, int param1) {
        int var6 = 0;
        int var3_int = 0;
        ee[] var4 = null;
        int var5 = 0;
        kv var7 = null;
        kv var8 = null;
        int var9 = 0;
        kv stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var9 = BachelorFridge.field_y;
        try {
          var3_int = 0;
          if (1 == param0.field_F) {
            wf.a(54, (byte) -57);
          }
          if (param0.field_F > 80) {
            var3_int = 8 * (-80 + param0.field_F);
            if (var3_int > 255) {
              var3_int = 255;
            }
          }
          var4 = iw.field_b;
          var5 = var4.length;
          this.field_c = new pa[var5];
          if (param1 != -1) {
            this.field_a = (kv[]) null;
          }
          for (var6 = 0; var6 < var5; var6++) {
            if (var6 == 0) {
              stackIn_16_0 = null;
            } else {
              stackIn_16_0 = iw.field_b[var6 - 1].a();
            }
            var7 = stackIn_16_0;
            var8 = iw.field_b[var6].a();
            this.field_c[var6] = this.a(var8, var7, false, var3_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("pn.N(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final ee a(int param0, int param1) {
        if (param1 > 5) {
          return null;
        }
        if (param0 != 21160) {
          return (ee) null;
        }
        return this.field_b[96 + param1];
    }

    private final void a(int param0, aj param1, int param2, byte param3, jo param4) {
        ee var9 = null;
        wia var10 = param4.field_i.field_h.field_a[param2][param0];
        int var7 = var10.field_n;
        if (param3 != -35) {
          field_e = (String) null;
        }
        int var8 = var10.field_j;
        if (37 == var7) {
          return;
        }
        try {
          var9 = this.a(var7, param0, param2, (byte) -122, var8, param4.field_i.field_h.field_E);
          if (var9 != null) {
            var9.a(param1.field_c, param1.field_a, 104);
          }
          this.a(param2, (byte) 100, var8, param0, var7).a(param1.field_c, param1.field_a);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "pn.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final ee d(int param0, int param1) {
        if (param1 == 0) {
          return nca.field_a[15];
        }
        int var3 = 57 % ((param0 + 41) / 36);
        if (param1 == 1) {
          return nca.field_a[63];
        }
        if (param1 != 2) {
          return null;
        }
        return nca.field_a[111];
    }

    private final ee b(int param0, int param1) {
        if (param0 == ~param1) {
          return nca.field_a[14];
        }
        if (param1 == 1) {
          return nca.field_a[62];
        }
        if (param1 == 2) {
          return nca.field_a[110];
        }
        return null;
    }

    private final ee a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        if (param0 == 6 ||
          param0 == 8 ||
          10 == param0 ||
          param0 == 12 ||
          param0 == 14) {
          return this.b(param5, (param2 + param1 * 2) % 4, -85);
        }
        if (20 == param0) {
          return this.b(-1, param5);
        }
        int var7 = 39 / ((49 - param3) / 58);
        return null;
    }

    void b(jo param0, int param1) {
        ee discarded$0 = null;
        try {
          if (param1 != -13319) {
            discarded$0 = this.a(45, -37, 115, (byte) 34, -102, -47);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "pn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, jo param3, int param4, int param5) {
        int stackIn_32_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pa var11 = null;
        int var11_int = 0;
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
        wia var23 = null;
        var22 = BachelorFridge.field_y;
        try {
          if (param3.field_I[param0][param2].field_d) {
            return;
          }
          var8 = 32 / ((-62 - param1) / 45);
          var23 = param3.field_i.field_h.field_a[param0][param2];
          var9 = var23.field_n;
          if (var9 == 21 &&
            !param3.field_I[param0][param2].field_i) {
            this.field_b[109].a(param4, param5);
          } else {
            if (var9 == 21 &&
              param3.field_I[param0][param2].field_i) {
              this.field_b[108].a(param4, param5);
            } else {
              if (var9 != 22) {
                if (var9 == 23 ||
                  var9 == 24 ||
                  25 == var9 ||
                  26 == var9) {
                  this.a(param0, (byte) 83, 0, param2, 20).a(param4, param5);
                }
              } else {
                this.d(-79, param3.field_i.field_h.field_E).a(param4, param5, 104);
                this.field_b[103].a(param4, param5);
              }
            }
          }
          if (var9 == 34) {
            ge.field_K.a(param4, param5);
          } else {
            if (var9 == 35) {
              il.field_b.a(param4, param5);
            } else {
              if (var9 == 28) {
                if (var23.field_h >= od.field_w[var9].field_e) {
                  kka.field_f.a(param4, param5 - 64);
                } else {
                  hna.field_h.a(param4, param5 - 64);
                }
              } else {
                if (27 == var9) {
                  var10 = var23.field_j - 1;
                  if (var10 >= 0) {
                    if (iw.field_b.length <= var10) {
                      var10 = iw.field_b.length - 1;
                    }
                    var11 = this.field_c[var10];
                    var11.e(param4, param5);
                  }
                } else {
                  if (var9 != 36) {
                    if (30 != var9) {
                      if (var9 == 29) {
                        pk.field_b[(param2 + param0) % 7].a(param4, param5);
                      } else {
                        if (var9 == 39) {
                          ip.field_f[0].e(32 + param4, -32 + param5);
                        } else {
                          if (var9 == 37) {
                            var10 = (param0 + 47 * param2) % 3;
                            var11_int = (param0 * 342 + 98 * param2) % 32;
                            var12 = (231 * param0 + 167 * param2) % 32;
                            var13 = param4 - (-var11_int - (var12 - 32));
                            var14 = -var12 + (param5 + var11_int);
                            var15 = 32 + (1212 * param2 + 4642 * param0 & 31);
                            var16 = 16 + (31 & param2 * 464 + 57 * param0);
                            var17 = vr.field_b % var15;
                            var18 = var17 * (4 * (var16 * (var15 - var17))) / (var15 * var15);
                            var19 = 32;
                            var20 = 24;
                            stackIn_32_0 = (var17 << 1 > var15) ? 1 : 0;
                            var21 = stackIn_32_0;
                            var20 = var20 - (3 * var18 >> 4);
                            var19 = var19 - (var18 >> 2);
                            nk.a(param3.field_y, -(var19 >> 1) + 64 + var13, -(var20 >> 1) + 36 + var14, var19, var20);
                            eka.field_g[var10][var21].a(var13, -var18 + var14);
                          }
                        }
                      }
                    } else {
                      ld.field_l[(param2 + param0) % 7].a(param4, param5);
                    }
                  } else {
                    pfa.field_g.a(param4, -64 + param5);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_49_0 = var7;
          stackIn_49_1 = new StringBuilder().append("pn.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final pa a(kv param0, int param1, int param2) {
        int var7 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        pa var5 = null;
        int[] var6 = null;
        int var8 = 0;
        int var9 = 0;
        jo var10 = null;
        pa stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = BachelorFridge.field_y;
        try {
          param0.g();
          var4_int = param0.field_v.length;
          if (param2 >= -75) {
            var10 = (jo) null;
            this.a((jo) null, (byte) 45);
          }
          var5 = new pa(param0.field_n, param0.field_o);
          var6 = var5.field_v;
          for (var7 = 0; var4_int > var7; var7++) {
            var8 = 16777215 & param0.field_v[var7];
            if (var8 == 0) {
              var6[var7] = 0;
            } else {
              var6[var7] = mp.a(var8, param1 << 24);
            }
          }
          stackIn_10_0 = var5;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("pn.BA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, jo param2, int param3, int param4, boolean param5) {
        ee discarded$0 = null;
        try {
          if (param5) {
            discarded$0 = this.a(116, -127, -22);
          }
          this.c(26728, (param0 + param1 * (param2.field_a + 2)) % 24).a(param4, param3);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "pn.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(byte param0, int param1, String[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -29 % ((param0 + 48) / 46);
          if (0 <= param1 &&
            param1 < param2.length &&
            param2[param1] != null) {
            stackIn_4_0 = param2[param1];
            return stackIn_4_0;
          }
          stackIn_6_0 = "Unknown: " + param1;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pn.W(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final pa a(kv param0, kv param1, boolean param2, int param3) {
        int var8 = 0;
        pa stackIn_5_0 = null;
        pa stackIn_7_0 = null;
        pa stackIn_10_0 = null;
        pa stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        pa var6 = null;
        int[] var7 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        var15 = BachelorFridge.field_y;
        try {
          if (param1 == null) {
            stackIn_7_0 = this.a(param0, param3, -108);
            return stackIn_7_0;
          }
          if (param0 == null) {
            stackIn_5_0 = this.a(param1, 255 - param3, -115);
            return stackIn_5_0;
          }
          param1.g();
          param0.g();
          if (param2) {
            stackIn_10_0 = (pa) null;
            return stackIn_10_0;
          }
          var5_int = param1.field_v.length;
          if (param0.field_v.length != var5_int) {
            throw new RuntimeException();
          }
          var6 = new pa(param1.field_n, param1.field_o);
          var17 = var6.field_v;
          var16 = var17;
          var7 = var16;
          for (var8 = 0; var5_int > var8; var8++) {
            var9 = param1.field_v[var8] & 16777215;
            var10 = 16777215 & param0.field_v[var8];
            if (var9 == 0 &&
              var10 == 0) {
              var17[var8] = 0;
            } else {
              if (var9 != 0) {
                if (var10 != 0) {
                  var11 = var9 & 16711935;
                  var12 = 65280 & var9;
                  var13 = var10 & 16711935;
                  var12 = var12 * (256 - param3);
                  var14 = var10 & 65280;
                  var13 = var13 * param3;
                  var11 = var11 * (-param3 + 256);
                  var11 = var11 & -16711936;
                  var12 = var12 & 16711680;
                  var13 = var13 & -16711936;
                  var14 = var14 * param3;
                  var14 = var14 & 16711680;
                  var7[var8] = mp.a(mp.a(var11 + var13, var14 + var12) >>> 8, -16777216);
                } else {
                  var7[var8] = mp.a(-param3 + 255 << 24, var9);
                }
              } else {
                var7[var8] = mp.a(var10, param3 << 24);
              }
            }
          }
          stackIn_26_0 = var6;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("pn.S(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final ee a(int param0, byte param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var6 = 27 / ((-28 - param1) / 40);
        if (param4 != 6 &&
          param4 != 8 &&
          10 != param4 &&
          param4 != 12 &&
          param4 != 14) {
          if (param4 != 7 &&
            param4 != 9 &&
            param4 != 11 &&
            param4 != 13 &&
            param4 != 15) {
            if (20 != param4) {
              if (38 != param4) {
                if (param4 != 33) {
                  return null;
                }
                return fw.field_f;
              }
              var7 = param3 * param0 % 3;
              return cba.field_c[var7];
            }
            return this.field_b[102];
          }
          return this.a(21160, (param0 + param3 * 2) % 4);
        }
        return this.a((byte) -18, (param0 + 2 * param3) % 4);
    }

    private final void a(int param0, boolean param1, int param2, int param3, jo param4, int param5) {
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_24_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_29_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_34_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_38_1 = 0;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_49_1 = 0;
        int stackIn_52_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_58_1 = 0;
        int stackIn_59_2 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        ee var9 = null;
        ee var10 = null;
        ee var11 = null;
        ee var12 = null;
        ee var13 = null;
        ee var14 = null;
        var8 = BachelorFridge.field_y;
        try {
          if (param4.field_j[param0][param3].field_n == 1) {
            var7 = null;
            if (param4.field_j[param0][param3].field_k != 5) {
              if (param4.field_j[param0][param3].field_k != 10) {
                if (param4.field_j[param0][param3].field_k == 15) {
                  stackIn_52_1 = param4.field_i.field_h.field_E;
                  if (!param4.field_j[param0][param3].field_o) {
                    stackIn_53_2 = 0;
                  } else {
                    stackIn_53_2 = 16;
                  }
                  var14 = this.a(stackIn_52_1, stackIn_53_2 + (param0 + param3) % 4 * 5, 15392);
                  if (var14 != null) {
                    var14.a(param2, param5, 104);
                  }
                  stackIn_58_1 = 5 * ((param0 + param3) % 4);
                  if (param4.field_j[param0][param3].field_o) {
                    stackIn_59_2 = 16;
                  } else {
                    stackIn_59_2 = 0;
                  }
                  this.a(stackIn_58_1 + stackIn_59_2, (byte) -78).a(param2, param5);
                } else {
                  stackIn_42_1 = param4.field_i.field_h.field_E;
                  stackIn_42_2 = param4.field_j[param0][param3].field_k;
                  if (!param4.field_j[param0][param3].field_o) {
                    stackIn_43_3 = 0;
                  } else {
                    stackIn_43_3 = 16;
                  }
                  var13 = this.a(stackIn_42_1, stackIn_42_2 + stackIn_43_3, 15392);
                  if (var13 != null) {
                    var13.a(param2, param5, 104);
                  }
                  if (param4.field_j[param0][param3].field_o) {
                    stackIn_49_1 = 16;
                  } else {
                    stackIn_49_1 = 0;
                  }
                  this.a(stackIn_49_1 + param4.field_j[param0][param3].field_k, (byte) -78).a(param2, param5);
                }
              } else {
                stackIn_24_1 = param4.field_i.field_h.field_E;
                if (!param4.field_j[param0][param3].field_o) {
                  stackIn_25_2 = 0;
                } else {
                  stackIn_25_2 = 16;
                }
                var11 = this.a(stackIn_24_1, stackIn_25_2 + 8, 15392);
                if (var11 != null) {
                  var11.a(param2, param5, 104);
                }
                stackIn_29_1 = param4.field_i.field_h.field_E;
                if (param4.field_j[param0][param3].field_o) {
                  stackIn_30_2 = 16;
                } else {
                  stackIn_30_2 = 0;
                }
                var12 = this.a(stackIn_29_1, stackIn_30_2 + 2, 15392);
                if (var12 != null) {
                  var12.a(param2, param5, 104);
                }
                stackIn_34_1 = 8;
                if (param4.field_j[param0][param3].field_o) {
                  stackIn_35_2 = 16;
                } else {
                  stackIn_35_2 = 0;
                }
                this.a(stackIn_34_1 + stackIn_35_2, (byte) -78).a(param2, param5);
                if (!param4.field_j[param0][param3].field_o) {
                  stackIn_38_1 = 0;
                } else {
                  stackIn_38_1 = 16;
                }
                this.a(stackIn_38_1 + 2, (byte) -78).a(param2, param5);
              }
            } else {
              stackIn_5_1 = param4.field_i.field_h.field_E;
              if (!param4.field_j[param0][param3].field_o) {
                stackIn_6_2 = 0;
              } else {
                stackIn_6_2 = 16;
              }
              var9 = this.a(stackIn_5_1, stackIn_6_2 + 4, 15392);
              if (var9 != null) {
                var9.a(param2, param5, 104);
              }
              stackIn_11_1 = param4.field_i.field_h.field_E;
              stackIn_11_2 = 1;
              if (param4.field_j[param0][param3].field_o) {
                stackIn_12_3 = 16;
              } else {
                stackIn_12_3 = 0;
              }
              var10 = this.a(stackIn_11_1, stackIn_11_2 + stackIn_12_3, 15392);
              if (var10 != null) {
                var10.a(param2, param5, 104);
              }
              stackIn_16_1 = 4;
              if (param4.field_j[param0][param3].field_o) {
                stackIn_17_2 = 16;
              } else {
                stackIn_17_2 = 0;
              }
              this.a(stackIn_16_1 + stackIn_17_2, (byte) -78).a(param2, param5);
              stackIn_19_1 = 1;
              if (!param4.field_j[param0][param3].field_o) {
                stackIn_20_2 = 0;
              } else {
                stackIn_20_2 = 16;
              }
              this.a(stackIn_19_1 + stackIn_20_2, (byte) -78).a(param2, param5);
            }
          }
          if (param4.field_j[param0][param3].field_n == 29) {
            if (param4.field_j[param0][param3].field_k == 5) {
              pk.field_b[4].a(param2, param5);
              pk.field_b[1].a(param2, param5);
            } else {
              if (10 != param4.field_j[param0][param3].field_k) {
                if (15 != param4.field_j[param0][param3].field_k) {
                  pk.field_b[param4.field_j[param0][param3].field_k].a(param2, param5);
                } else {
                  pk.field_b[5 * ((param3 + param0) % 4)].a(param2, param5);
                }
              } else {
                pk.field_b[8].a(param2, param5);
                pk.field_b[2].a(param2, param5);
              }
            }
          }
          if (param1) {
            this.field_c = (pa[]) null;
          }
          if (30 == param4.field_j[param0][param3].field_n) {
            if (param4.field_j[param0][param3].field_k == 5) {
              ld.field_l[4].a(param2, param5);
              ld.field_l[1].a(param2, param5);
            } else {
              if (10 == param4.field_j[param0][param3].field_k) {
                ld.field_l[8].a(param2, param5);
                ld.field_l[2].a(param2, param5);
              } else {
                if (param4.field_j[param0][param3].field_k != 15) {
                  ld.field_l[param4.field_j[param0][param3].field_k].a(param2, param5);
                } else {
                  ld.field_l[(param3 + param0) % 4 * 5].a(param2, param5);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_82_0 = var7_ref;
          stackIn_82_1 = new StringBuilder().append("pn.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_82_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(param5).append(')').toString());
        }
    }

    private final ee c(int param0, int param1) {
        if (param1 < 0) {
          return null;
        }
        if (param1 > 23) {
          return null;
        }
        if (param0 != 26728) {
          return (ee) null;
        }
        return this.field_b[param1 + 64];
    }

    private final ee a(int param0, int param1, int param2) {
        if (param2 != 15392) {
          return (ee) null;
        }
        if (1 != param0) {
          return null;
        }
        return nca.field_a[64 + param1];
    }

    private final ee a(byte param0, int param1) {
        if (param1 > 5) {
          return null;
        }
        if (param0 != -18) {
          jo var4 = (jo) null;
          this.a(-77, false, -85, -1, (jo) null, -104);
        }
        return this.field_b[param1 + 88];
    }

    public static void a(byte param0) {
        field_e = null;
        int var1 = 125 % ((67 - param0) / 34);
    }

    static {
        field_e = "Chat";
        field_f = 0;
    }
}
