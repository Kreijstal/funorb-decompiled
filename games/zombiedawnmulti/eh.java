/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static String field_h;
    private int[] field_e;
    static String field_f;
    private int[] field_d;
    static String field_g;
    static int field_b;
    static String field_c;
    private byte[] field_a;

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (f.field_a < 0) {
          return;
        }
        var3 = param0 - 135;
        var4 = param1 - 35;
        var5 = 256;
        if (f.field_a < 75) {
          var5 = (f.field_a << 8) / 75;
        }
        if (200 < f.field_a) {
          var5 = (-f.field_a + 250 << 8) / 50;
        }
        r.a(0, m.field_w);
        ep.e();
        oo.b();
        rl.a((byte) 125);
        if (var5 < 256) {
          oo.f(0, 0, oo.field_b, oo.field_l, 0, -var5 + 256);
        }
        ql.a(true);
        if (f.field_a < 150) {
          m.field_w.f(var3, var4);
        } else {
          qp.field_v.c(15 + var3, var4 + 10, var5);
        }
        if (param2 < 70) {
          return;
        }
        var6 = f.field_a - 125;
        if (0 < var6 &&
          var6 < 50) {
          if (var6 >= 20) {
            if (30 <= var6) {
              var7 = 256 * (50 - var6) / 20;
              kk.field_r.e(var3, var4, var7);
            } else {
              kk.field_r.e(var3, var4, 256);
            }
          } else {
            var7 = 256 * var6 / 20;
            kk.field_r.e(var3, var4, var7);
          }
        }
        var6Lifetime1 = f.field_a - 140;
        if (var6Lifetime1 > 0) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
          }
          qd.field_s.c(var3 + 15, 10 + var4, var7Lifetime1 * var5 >> 8);
        }
        return;
    }

    final static ld a(boolean param0, cj param1, cj param2, cj param3, ob param4) {
        int var14 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        ld stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        ld[] var11 = null;
        int var12 = 0;
        ob var13_ref_ob = null;
        int var13 = 0;
        int var15 = 0;
        tl var16 = null;
        int var17 = 0;
        ob var18 = null;
        int[] var19 = null;
        char[] var20 = null;
        int[] var21 = null;
        char[] var22 = null;
        int var12Lifetime1;
        var17 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param4 == null) {
            return null;
          }
          if (param4.field_x != null) {
            stackIn_7_0 = param4.field_x.length;
          } else {
            stackIn_7_0 = 0;
          }
          var5_int = stackIn_7_0;
          if (null != param4.field_B) {
            stackIn_10_0 = param4.field_B.length;
          } else {
            stackIn_10_0 = 0;
          }
          var6 = stackIn_10_0;
          var7 = var5_int + var6;
          if (param0) {
            var18 = (ob) null;
            eh.a(false, (cj) null, (cj) null, (cj) null, (ob) null);
          }
          var8 = new String[var7];
          var22 = new char[var7];
          var20 = var22;
          var9 = var20;
          var21 = new int[var7];
          var19 = var21;
          var10 = var19;
          var11 = new ld[var7];
          if (null != param4.field_x) {
            for (var12 = 0; param4.field_x.length > var12; var12++) {
              var13_ref_ob = ok.field_p.a(param4.field_x[var12], 32767);
              var8[var12] = var13_ref_ob.field_s;
              var9[var12] = param4.field_r[var12];
              var11[var12] = eh.a(false, param1, param2, param3, var13_ref_ob);
            }
          }
          if (param4.field_B != null) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            for (var14 = 0; param4.field_B.length > var14; var14++) {
              var15 = param4.field_B[var14];
              if (var15 == -1) {
                var8[var14 + var12Lifetime1] = le.field_I;
                var9[var14 + var12Lifetime1] = param4.field_D[var14];
                var10[var12Lifetime1 + var14] = param4.field_B[var14];
              } else {
                var16 = bd.field_c.a(var15, -11452);
                var8[var12Lifetime1 + var14] = var16.e(-18572);
                var9[var12Lifetime1 + var14] = param4.field_D[var14];
                if (var9[var12Lifetime1 + var14] <= 0) {
                  var13 = (char)(var13 + 1);
                  var9[var14 + var12Lifetime1] = (char)var13;
                }
                var10[var12Lifetime1 + var14] = param4.field_B[var14];
              }
            }
          }
          stackIn_27_0 = new ld(0L, param3, param1, param2, var11, var21, var8, var22);
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("eh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param4 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        ja var1 = null;
        ja var2 = null;
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var1 = new ja(540, 140);
          r.a(0, var1);
          ep.e();
          oo.b();
          f.field_a = 0;
          rl.a((byte) 120);
          var2 = var1.c();
          for (var3 = 0; var3 < 15; var3++) {
            var2.f(-2, -2, 16777215);
            oo.i(4, 4, 0, 0, 540, 140);
          }
          kk.field_r.a();
          var1.f(0, 0);
          if (param0 != -1741) {
            field_f = (String) null;
          }
          ql.a(true);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "eh.A(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_g = null;
        field_f = null;
        if (param0 <= 26) {
          ob var2 = (ob) null;
          eh.a(false, (cj) null, (cj) null, (cj) null, (ob) null);
        }
        field_c = null;
    }

    final int a(int param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var11Lifetime6;
        int var11Lifetime7;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var7_int = 0;
          param0 = param0 + param2;
          var9 = 77 / ((param1 + 1) / 54);
          var8 = param5;
          L2: while (true) {
            var10 = param3[var8];
            if (var10 < 0) {
              var7_int = this.field_d[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_d[var7_int];
            var11 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param2;
              param2++;
              param4[incrementValue$1] = (byte)(~var11);
              if (param0 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((64 & var10) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_d[var7_int];
            }
            dupTemp$2 = this.field_d[var7_int];
            var11Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param2;
              param2++;
              param4[incrementValue$3] = (byte)(~var11Lifetime1);
              if (param0 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 != (32 & var10)) {
              var7_int = this.field_d[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$4 = this.field_d[var7_int];
            var11Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              incrementValue$5 = param2;
              param2++;
              param4[incrementValue$5] = (byte)(~var11Lifetime2);
              if (param2 >= param0) {
                return 1 + (var8 - param5);
              }
              var7_int = 0;
            }
            if ((16 & var10) != 0) {
              var7_int = this.field_d[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.field_d[var7_int];
            var11Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param2;
              param2++;
              param4[incrementValue$7] = (byte)(~var11Lifetime3);
              if (param2 >= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var10 & 8) != 0) {
              var7_int = this.field_d[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_d[var7_int];
            var11Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param2;
              param2++;
              param4[incrementValue$9] = (byte)(~var11Lifetime4);
              if (param0 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 == (4 & var10)) {
              var7_int++;
            } else {
              var7_int = this.field_d[var7_int];
            }
            dupTemp$10 = this.field_d[var7_int];
            var11Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param2;
              param2++;
              param4[incrementValue$11] = (byte)(~var11Lifetime5);
              if (param0 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var10 & 2) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_d[var7_int];
            }
            dupTemp$12 = this.field_d[var7_int];
            var11Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param2;
              param2++;
              param4[incrementValue$13] = (byte)(~var11Lifetime6);
              if (param2 >= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 != (1 & var10)) {
              var7_int = this.field_d[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_d[var7_int];
            var11Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param2;
              param2++;
              param4[incrementValue$15] = (byte)(~var11Lifetime7);
              if (param0 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_63_0 = 1 + (var8 - param5);
          return stackIn_63_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_66_0 = var7;
          stackIn_66_1 = new StringBuilder().append("eh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param4 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param5).append(')').toString());
        }
    }

    final int a(int param0, byte param1, int param2, byte[] param3, int param4, byte[] param5) {
        int dupTemp$0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
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
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var7_int = 0;
          param0 = param0 + param2;
          var8 = param4 << 3;
          if (param1 != -62) {
            this.field_a = (byte[]) null;
          }
          while (true) {
            if (param2 >= param0) {
              stackIn_21_0 = (7 + var8 >> 3) - param4;
              return stackIn_21_0;
            }
            var9 = 255 & param5[param2];
            var10 = this.field_e[var9];
            var11 = this.field_a[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            }
            var12 = var8 >> 3;
            var13 = 7 & var8;
            var7_int = var7_int & -var13 >> 31;
            var14 = (-1 + (var13 + var11) >> 3) + var12;
            var8 = var8 + var11;
            var13 += 24;
            dupTemp$0 = cr.b(var7_int, var10 >>> var13);
            var7_int = dupTemp$0;
            param3[var12] = (byte)dupTemp$0;
            if (var14 > var12) {
              var12++;
              var13 -= 8;
              var7_int = var10 >>> var13;
              param3[var12] = (byte)(var10 >>> var13);
              if (var12 < var14) {
                var12++;
                var13 -= 8;
                var7_int = var10 >>> var13;
                param3[var12] = (byte)(var10 >>> var13);
                if (var12 < var14) {
                  var13 -= 8;
                  var12++;
                  var7_int = var10 >>> var13;
                  param3[var12] = (byte)(var10 >>> var13);
                  if (var14 > var12) {
                    var13 -= 8;
                    var12++;
                    var7_int = var10 << -var13;
                    param3[var12] = (byte)(var10 << -var13);
                  }
                }
              }
            }
            param2++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("eh.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    eh(byte[] param0) {
        int var5 = 0;
        int var14 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          var2_int = param0.length;
          this.field_e = new int[var2_int];
          this.field_a = param0;
          var17 = new int[33];
          var16 = var17;
          var3 = var16;
          this.field_d = new int[8];
          var4 = 0;
          for (var5 = 0; var5 < var2_int; var5++) {
            var6 = param0[var5];
            if (0 != var6) {
              var7 = 1 << 32 - var6;
              var8 = var17[var6];
              this.field_e[var5] = var8;
              if ((var7 & var8) == 0) {
                for (var10 = var6 - 1; var10 >= 1; var10--) {
                  var11 = var17[var10];
                  if (~var11 == ~var8) {
                    var12 = 1 << 32 - var10;
                    if ((var11 & var12) == 0) {
                      var3[var10] = cr.b(var12, var11);
                      continue;
                    }
                    var3[var10] = var3[-1 + var10];
                  }
                  break;
                }
                var9 = var8 | var7;
              } else {
                var9 = var3[-1 + var6];
              }
              var17[var6] = var9;
              for (var10Lifetime1 = var6 + 1; var10Lifetime1 <= 32; var10Lifetime1++) {
                if (var17[var10Lifetime1] == var8) {
                  var17[var10Lifetime1] = var9;
                }
              }
              var10Lifetime2 = 0;
              for (var11Lifetime1 = 0; var11Lifetime1 < var6; var11Lifetime1++) {
                var12Lifetime1 = -2147483648 >>> var11Lifetime1;
                if (0 == (var8 & var12Lifetime1)) {
                  var10Lifetime2++;
                } else {
                  if (this.field_d[var10Lifetime2] == 0) {
                    this.field_d[var10Lifetime2] = var4;
                  }
                  var10Lifetime2 = this.field_d[var10Lifetime2];
                }
                if (var10Lifetime2 >= this.field_d.length) {
                  var13 = new int[2 * this.field_d.length];
                  for (var14 = 0; var14 < this.field_d.length; var14++) {
                    var13[var14] = this.field_d[var14];
                  }
                  this.field_d = var13;
                }
                var12Lifetime1 = var12Lifetime1 >>> 1;
              }
              if (var4 <= var10Lifetime2) {
                var4 = 1 + var10Lifetime2;
              }
              this.field_d[var10Lifetime2] = ~var5;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("eh.<init>(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    static {
        field_b = 0;
        field_f = "Scamming";
        field_c = "Enter multiplayer lobby";
        field_h = "From only <%0>/month";
        field_g = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
