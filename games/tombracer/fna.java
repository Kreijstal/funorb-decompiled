/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fna {
    static qua[] field_j;
    static int field_h;
    dea field_c;
    static String field_k;
    String field_e;
    int field_g;
    private int field_f;
    int field_i;
    private int field_d;
    int field_b;
    boolean field_a;
    private boolean field_l;

    final void c(int param0) {
        this.field_c.c(-72);
        if (param0 != 1701110401) {
          this.field_e = (String) null;
        }
    }

    final static void a(int param0, int param1, ik param2) {
        kh var3 = null;
        try {
          if (param1 != -23814) {
            field_j = (qua[]) null;
          }
          var3 = ql.field_k;
          var3.k(param0, -2988);
          var3.i(2, 0);
          var3.i(0, 0);
          var3.i(param2.field_g, 0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fna.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int d(int param0) {
        nh var2;
        int var3;
        if (this.field_g == 5) {
          return ng.field_k[5].c() / 2 + this.field_d;
        }
        if (this.field_g == 6) {
          return ng.field_k[5].c() / 2 + this.field_d;
        }
        if (param0 != 11919) {
          field_k = (String) null;
        }
        var2 = this.b(-28425);
        var3 = var2.c();
        if (1 == this.field_g ||
          this.field_g == 3) {
          var3 = -5 + var3 * 2 / 3;
        }
        return this.field_d + var3;
    }

    public static void a(int param0) {
        if (param0 != 1) {
          field_j = (qua[]) null;
        }
        field_k = null;
        field_j = null;
    }

    final void a(boolean param0, boolean param1, boolean param2, int param3) {
        dea stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        boolean stackIn_6_2 = false;
        boolean stackIn_7_3;
        if (param3 != 6) {
          this.a(-5, 1, -105);
        }
        if (!this.field_a) {
          stackIn_6_0 = this.field_c;
          stackIn_6_1 = -115;
          stackIn_6_2 = param0;
          stackIn_7_3 = (param2) ? false : true;
          ((dea) (Object) stackIn_6_0).a((byte) stackIn_6_1, stackIn_6_2, stackIn_7_3);
        }
        if (param1) {
          if (6 > this.field_d) {
            this.field_d = this.field_d + 1;
          }
          if (!param1 &&
            this.field_d > 0) {
            this.field_d = this.field_d - 1;
          }
        } else {
          if (this.field_d > 0) {
            this.field_d = this.field_d - 1;
          }
        }
    }

    final void a(boolean param0, boolean param1, int param2, boolean param3) {
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        kia stackIn_51_0 = null;
        int stackIn_78_0 = 0;
        nh stackIn_89_0 = null;
        int var5;
        da var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        nh var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        kia var20_ref_kia;
        kea var20_ref_kea;
        int var20;
        int var21_int;
        String var21;
        kea var21_ref;
        nh var21_ref2;
        int var22_int;
        String var22;
        int var24;
        nh[] var25;
        ha var26;
        kia var27;
        nh[] var28;
        ha var29;
        nh var30;
        int var18Lifetime1;
        int var19Lifetime1;
        int var18Lifetime2;
        int var19Lifetime2;
        int var21_intLifetime1;
        int var22_intLifetime1;
        var24 = TombRacer.field_G ? 1 : 0;
        stackIn_3_0 = (!param0) ? 2431750 : 10827264;
        var5 = stackIn_3_0;
        var6 = eda.field_f;
        var7 = this.e(-163) / 2;
        var8 = this.d(param2 + 11918) / 2;
        var9 = this.field_i + this.field_c.e(param2 ^ -103);
        if (param2 != 1) {
          return;
        }
        var10 = -var7 + this.field_b;
        var11 = var9 - var8;
        var12 = this.b(-28425);
        var13 = this.e(-163);
        var14 = this.d(11919);
        var15 = -1;
        if (36 != this.field_g) {
          if (this.field_g != 37) {
            stackIn_13_0 = (38 == this.field_g) ? 1 : 0;
          } else {
            stackIn_13_0 = 1;
          }
        } else {
          stackIn_13_0 = 1;
        }
        var16 = stackIn_13_0;
        if (39 != this.field_g) {
          stackIn_19_0 = (this.field_g == 40) ? 1 : 0;
        } else {
          stackIn_19_0 = 1;
        }
        var17 = stackIn_19_0;
        if (var16 == 0 &&
          var17 == 0) {
          if (param1) {
            if (param3) {
              var5 = 10827264;
              if (var24 != 0) {
                if (param3) {
                  var5 = 12632256;
                  var5 = 1052688;
                } else {
                  var5 = 1052688;
                }
              }
            }
          } else {
            if (param3) {
              var5 = 12632256;
              if (var24 != 0) {
                var5 = 1052688;
              }
            } else {
              var5 = 1052688;
            }
          }
        }
        if (this.field_g != 5 &&
          6 != this.field_g) {
          if (var16 == 0) {
            if (var17 == 0) {
              if (param1) {
                if (param3) {
                  var12.a(var10, var11, var13, var14);
                }
                if (!param3 ||
                  var24 != 0) {
                  var12.a(var10, var11, var13, var14, 0, -4144960, 1);
                  if (var24 != 0) {
                    if (param3) {
                      var12.a(var10, var11, var13, var14, 2, 1614823488, 1);
                      var12.a(var10, var11, var13, var14, 2, 1610612736, 1);
                    } else {
                      var12.a(var10, var11, var13, var14, 2, 1610612736, 1);
                    }
                  }
                }} else {
                if (param3) {
                  var12.a(var10, var11, var13, var14, 2, 1614823488, 1);
                  if (var24 != 0) {
                    var12.a(var10, var11, var13, var14, 2, 1610612736, 1);
                  }
                } else {
                  var12.a(var10, var11, var13, var14, 2, 1610612736, 1);
                }
              }
              oka.a(this.field_e, var5, var6, -1, 5 + var9, this.field_b, var15);
              if (var24 == 0) {
                return;
              }
            }
            var18 = 300;
            var19 = 120;
            if (39 == this.field_g) {
              ng.field_k[4].a(-89 + this.field_b, -16 + (-(var19 >> 1) + var9), var18, var19, 0, -4144960, 1);
              oka.a(bc.field_a, var5, var6, -1, var9 + (-(var19 >> 1) + 25), -94 + (var18 >> 1) + this.field_b, var15);
            }
            var26 = tga.field_a;
            var21_int = this.field_b - 8;
            var22_int = var9 - 8 - 16;
            var25 = dr.field_a;
            tra.a(1, var25, (byte) -68, var21_int, var26, 16, 1, 16, var22_int, 0);
            if (param3) {
              var15 = 2236962;
              var5 = 10309393;
            }
            if (this.field_g != 39) {
              stackIn_51_0 = vk.field_d;
            } else {
              stackIn_51_0 = ska.field_r;
            }
            var27 = stackIn_51_0;
            var20_ref_kia = var27;
            if (vja.b(30000) == var27) {
              var15 = 2236962;
              var5 = 10827264;
              oka.a("X", var5, var6, -1, -8 + (var9 - 1), this.field_b, var15);
            }
            var21 = this.field_e;
            if (!ipa.a(dna.A(param2 + 124), true, var27)) {
              var5 = 2431750;
              var21 = "<str=010101>" + this.field_e + "</str>";
              var15 = -1;
            }
            oka.a(var21, var5, var6, -1, 10 + var9, this.field_b, var15);
            if (var24 == 0) {
              return;
            }
          }
          var18Lifetime2 = 300;
          var19Lifetime2 = 120;
          if (this.field_g == 36) {
            ng.field_k[5].a(-63 + this.field_b, var9 - (var19Lifetime2 >> 1) - 16, var18Lifetime2, var19Lifetime2, 0, -4144960, 1);
            oka.a(dna.field_I, var5, var6, -1, 25 + (-(var19Lifetime2 >> 1) + var9), -65 + (this.field_b + (var18Lifetime2 >> 1)), var15);
          }
          var29 = tga.field_a;
          var21_intLifetime1 = this.field_b - 8;
          var22_intLifetime1 = var9 - 8 - 16;
          var28 = dr.field_a;
          tra.a(1, var28, (byte) -109, var21_intLifetime1, var29, 16, 1, 16, var22_intLifetime1, 0);
          if (this.field_g == 36) {
            var20_ref_kea = baa.field_e;
          } else {
            if (37 != this.field_g) {
              var20_ref_kea = kva.field_s;
            } else {
              var20_ref_kea = tia.field_d;
            }
          }
          if (param3) {
            var15 = 2236962;
            var5 = 10309393;
          }
          var21_ref = dna.A(36);
          if (var20_ref_kea == var21_ref) {
            var15 = 2236962;
            var5 = 10827264;
            oka.a("X", var5, var6, param2 - 2, -8 + var9 - 1, this.field_b, var15);
          }
          var22 = this.field_e;
          if (!ipa.a(var20_ref_kea, true, vja.b(30000))) {
            var15 = -1;
            var5 = 2431750;
            var22 = "<str=010101>" + this.field_e + "</str>";
          }
          oka.a(var22, var5, var6, -1, var9 + 10, this.field_b, var15);
          if (var24 == 0) {
            return;
          }
        }
        var18Lifetime1 = 300;
        var19Lifetime1 = 100;
        if (this.field_g == 5) {
          ng.field_k[5].a(this.field_b + (-(var18Lifetime1 >> 1) + 10), var9 - (var19Lifetime1 >> 1) + 13, var18Lifetime1, var19Lifetime1, 0, -4144960, 1);
        }
        oka.a(this.field_e, var5, var6, param2 - 2, var9, -64 + this.field_b, var15);
        if (this.field_g != 5) {
          stackIn_78_0 = jg.a((byte) -103);
        } else {
          stackIn_78_0 = tk.a(param2 ^ -22635);
        }
        var20 = stackIn_78_0;
        if (!param3) {
          tka.field_p.a(-34 + this.field_b, var9 - 16, 0, -4144960, 1);
        }
        if (param3 ||
          var24 != 0) {
          tka.field_p.a(this.field_b - 34, -16 + var9);
        }
        tga.field_a.KA(this.field_b - 35, -17 + var9, (var20 >> 1) - 35 + this.field_b, var9);
        if (!param3) {
          ep.field_n.a(this.field_b - 34, -16 + var9, 0, -4144960, 1);
        }
        if (param3 ||
          var24 != 0) {
          ep.field_n.a(-34 + this.field_b, -16 + var9);
        }
        tga.field_a.la();
        if (this.field_g != 6) {
          stackIn_89_0 = haa.field_z;
        } else {
          stackIn_89_0 = wh.field_y;
        }
        var30 = stackIn_89_0;
        var21_ref2 = var30;
        if (param3) {
          var30.a(-12 + ((var20 >> 1) - 35) + this.field_b, var9 - (var30.c() >> 1) - 6);
          if (var24 == 0) {
            return;
          }
        }
        var30.a((var20 >> 1) + (-35 + this.field_b) - 12, -6 - (var30.c() >> 1) + var9, 0, -4144960, 1);
        return;
    }

    final int e(int param0) {
        if (param0 != -163) {
          return -37;
        }
        nh var2 = this.b(param0 ^ 28586);
        return var2.a() + this.field_d;
    }

    final void a(boolean param0) {
        if (param0) {
          String var3 = (String) null;
          fna.a(86, (String) null);
        }
        this.field_c.d(31990);
    }

    final static hra a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        hra var5 = null;
        int var6 = 0;
        hra stackIn_4_0 = null;
        hra stackIn_8_0 = null;
        hra stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            0 != param1.length()) {
            var2_int = param1.indexOf('@');
            if (var2_int == -1) {
              stackIn_8_0 = is.field_wb;
              return stackIn_8_0;
            }
            var3 = param1.substring(0, var2_int);
            var4 = param1.substring(var2_int + 1);
            var6 = 77 % ((param0 + 25) / 63);
            var5 = bd.a(-1, var3);
            if (var5 == null) {
              return wn.a(76, var4);
            }
            stackIn_12_0 = var5;
            return stackIn_12_0;
          }
          stackIn_4_0 = mma.field_d;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("fna.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2, boolean param3, boolean param4, int param5, int param6, int param7, boolean param8, int param9, int param10, boolean param11, int param12, int param13) {
        qda.field_b = null;
        se.d((byte) 118);
        if (param5 == -22919) {
          param3 = rk.a(param12, param3, (byte) 107, param0, param9, param10, param7);
          voa.a(param13, param4, param5 + 27015, param8, param1, param3, param12, param6, param2, param11);
          uka.b(param13, -125, param11);
          pw.a(param3, (byte) -112, param7, param13);
          return;
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        nh var10;
        int var5Lifetime1;
        if (!this.field_c.b(20)) {
          return false;
        }
        if (this.field_g != 1 &&
          3 != this.field_g) {
          var10 = this.b(-28425);
          var5 = var10.a();
          var6 = var10.c();
          if (param0 != -30323) {
            fna.a(39, 63, false, true, true, 14, -127, -48, false, 75, -103, false, -22, 2);
          }
          var7 = param1 + var5 / 2 - this.field_b;
          var8 = param2 - (this.field_i - var6 / 2);
          if (!ab.a(this.field_i - var6 / 2, param1, this.field_i + var6 / 2, param2, this.field_b + var5 / 2, this.field_b - var5 / 2, 105)) {
            return false;
          }
          var9 = ema.a(this.field_l, 0, var7, this.field_f, var8) ? 1 : 0;
          return var9 != 0;
        }
        var4 = this.e(-163);
        var5Lifetime1 = this.d(11919);
        return ab.a(-(var5Lifetime1 / 2) + this.field_i, param1, var5Lifetime1 / 2 + this.field_i, param2, this.field_b + var4 / 2, this.field_b - var4 / 2, 104);
    }

    private final nh b(int param0) {
        if (this.field_g == 1) {
          return fra.field_q;
        }
        if (this.field_g == 3) {
          return ij.field_X;
        }
        if (param0 != -28425) {
          fna.a(-43, -1, false, true, false, -66, -12, 75, false, -21, 73, false, -95, 84);
        }
        return this.field_l ? em.field_h[this.field_f] : ng.field_k[this.field_f];
    }

    fna(int param0, String param1, int param2, boolean param3) {
        this.field_c = new dea();
        try {
          this.field_g = param0;
          this.field_l = param3 ? true : false;
          this.field_f = param2;
          this.field_e = param1.toUpperCase();
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fna.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
