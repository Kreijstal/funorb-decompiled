/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends ara implements ntb {
    private int field_n;
    private int field_j;
    static String field_r;
    static int field_q;
    private int field_i;
    int field_o;
    private int field_l;
    static String[] field_k;
    private int field_p;
    private int field_m;

    final int a(ml param0, int param1) {
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        try {
          var3_int = 2147483647;
          if (param1 != 3) {
            stackIn_3_0 = 88;
            return stackIn_3_0;
          }
          for (var4 = 0; var4 < param0.field_g.length; var4 += 2) {
            var5 = param0.field_g[var4];
            var6 = param0.field_g[var4 + 1];
            var7 = param0.field_g[(2 + var4) % param0.field_g.length];
            var8 = param0.field_g[(var4 + 3) % param0.field_g.length];
            if (var7 <= var5) {
              var5 += 512;
              var7 -= 512;
            } else {
              var5 -= 512;
              var7 += 512;
            }
            if (var8 > var6) {
              var6 -= 512;
              var8 += 512;
            } else {
              var8 -= 512;
              var6 += 512;
            }
            var9 = ng.a(8, -this.field_h + this.field_e, (byte) 89, -this.field_f + this.field_d, var7, this.field_d, var6, var5, var8, this.field_e);
            if (var9 != -1 &&
              var9 < var3_int) {
              var3_int = var9;
            }
          }
          stackIn_20_0 = var3_int;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("tj.V(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, byte param1) {
        if (param1 > -94) {
          pe var4 = (pe) null;
          this.a((byte) 43, (pe) null);
        }
        this.field_l = param0;
    }

    public static void g(int param0) {
        field_r = null;
        int var1 = -35 % ((param0 + 84) / 39);
        field_k = null;
    }

    final int c(byte param0) {
        if (param0 <= 36) {
          return 21;
        }
        return this.field_j;
    }

    final void a(byte param0, pe param1) {
        Object stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
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
        anb var15 = null;
        anb var16 = null;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var14 = VoidHunters.field_G;
        try {
          if (param0 != 93) {
            this.field_j = -51;
          }
          this.field_o = this.field_o - 1;
          if (this.field_o < 0) {
            this.b(param0 ^ -3929);
            if (this.field_m == 6) {
              param1.a(0, gib.field_a, this.field_p, this.field_n, false, this.field_d, this.field_e);
            }
          } else {
            if (3 != this.field_m &&
              this.field_m != 5) {
              param1.a(10, this.field_e, this.field_d, 0, 11184895, 1, 5);
              if (this.field_m != 1) {
                if (this.field_m == 6) {
                  var3 = null;
                  if (this.field_l < 0) {
                    var16 = param1.a(true, this.field_e, this.field_d, this.field_p);
                    var3 = var16;
                    if (var16 != null) {
                      var4 = 0;
                      var5 = -this.field_d + var16.field_d;
                      var6 = var16.field_e - this.field_e;
                      if (ar.a(var5, (byte) 111, var6) < cab.field_p / 2 &&
                        !param1.a(var16, param0 ^ 39)) {
                        var4 = 1;
                      }
                      if (var4 == 0) {
                        var3 = null;
                      } else {
                        this.field_l = var16.field_l;
                      }
                    }
                  } else {
                    var15 = param1.d((byte) -27, this.field_l);
                    var3 = var15;
                    if (var15 == null ||
                      param1.a(var15, -76)) {
                      this.field_l = -1;
                    }
                  }
                  if (var3 != null) {
                    var4Lifetime1 = ((anb) (var3)).field_k.field_r;
                    var5Lifetime1 = ((anb) (var3)).field_k.field_n;
                  } else {
                    var4Lifetime1 = this.field_d + (iea.field_d * fc.a(this.field_i, (byte) 28) >> 8);
                    var5Lifetime1 = this.field_e + (iea.field_d * eu.a(this.field_i, 70) >> 8);
                  }
                  var6Lifetime1 = var4Lifetime1 - this.field_d >> 6;
                  var7 = var5Lifetime1 - this.field_e >> 6;
                  var8 = ar.a(var6Lifetime1, (byte) 120, var7);
                  if (var8 > 0) {
                    var6Lifetime1 = var6Lifetime1 * la.field_k / var8;
                    var7 = var7 * la.field_k / var8;
                    var9 = var6Lifetime1 - this.field_f;
                    var10 = -this.field_h + var7;
                    var11 = ar.a(var9, (byte) 111, var10);
                    if (0 >= var11) {
                      this.field_e = this.field_e + this.field_h;
                      this.field_d = this.field_d + this.field_f;
                      return;
                    }
                    var12 = var9 * iea.field_d / var11;
                    this.field_f = this.field_f + var12;
                    var13 = var10 * iea.field_d / var11;
                    this.field_h = this.field_h + var13;
                  }
                }
              } else {
                this.field_f = this.field_f + (np.field_o * fc.a(this.field_i, (byte) 89) >> 16);
                this.field_h = this.field_h + (np.field_o * eu.a(this.field_i, 96) >> 16);
                var3_int = 128;
                param1.a(20, this.field_e, this.field_d, var3_int, param0 + 11184802, 1, 10);
              }
            }
          }
          this.field_e = this.field_e + this.field_h;
          this.field_d = this.field_d + this.field_f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("tj.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw rta.a((Throwable) (stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final void b(int param0, byte param1) {
        this.field_n = param0;
        if (param1 != 47) {
          this.field_o = -66;
        }
    }

    final void a(int param0, lta param1) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var9 = VoidHunters.field_G;
        try {
          var3_int = param1.a(this.field_d, (byte) 127);
          var4 = param1.b(true, this.field_e);
          if (param0 != this.field_m) {
            if (this.field_m == 4) {
              var5 = param1.a(-this.field_f + this.field_d, (byte) 119);
              var6 = param1.b(true, this.field_e - this.field_h);
              c.a(var6, var5, var3_int, var4, param0 ^ -16777216, 16746632);
              return;
            }
            if (this.field_m == 3) {
              var5 = param1.a(-this.field_f + this.field_d, (byte) 112);
              var6 = param1.b(true, this.field_e - this.field_h);
              var7 = qpb.a(false, this.field_p, 13894143);
              var8 = 255 * this.field_j / hrb.field_a;
              kra.a(var7, 3, 16994, var4, var8 >> 1, var3_int, var5, var6);
              if (0 < this.field_i) {
                jj.a(var7, (byte) 7, var4, Math.max(3.0f, (float)var8 * (11.0f * param1.field_a)), var8 >> 1, var3_int);
                jj.a(var7, (byte) 7, var4, Math.max(2.0f, 8.0f * param1.field_a * (float)var8), var8, var3_int);
              }
              jj.a(var7, (byte) 7, var6, Math.max(2.0f, param1.field_a * 8.0f * (float)var8), var8 >> 1, var5);
              jj.a(var7, (byte) 7, var6, Math.max(1.0f, (float)var8 * (param1.field_a * 4.0f)), var8, var5);
              hha.a(var3_int, (byte) 66, var5, var4, var7, var6, var8);
              return;
            }
            if (2 == this.field_m) {
              ena.a(var4, param1.field_a * 400.0f, param0 - 106, var3_int, 65280);
              return;
            }
            if (this.field_m == 5) {
              ena.a(var4, param1.field_a * 400.0f, -100, var3_int, 65280);
              return;
            }
            if (1 == this.field_m) {
              kq.a(2400.0f * param1.field_a, (byte) 96, var4, 65280, var3_int);
              ena.a(var4, 1600.0f * param1.field_a, -110, var3_int, 65280);
              return;
            }
            if (6 != this.field_m) {
              return;
            }
            kq.a(1200.0f * param1.field_a, (byte) 80, var4, 16776960, var3_int);
            if (this.field_l >= 0) {
              return;
            }
            var5 = cab.field_p / 2 >> 8;
            for (var6 = 0; var6 < 8; var6++) {
              var7Lifetime1 = (int)((float)(var5 * (fc.a(this.field_o + var6 << 5, (byte) 33) >> 8)) * param1.field_a) + var3_int;
              var8Lifetime1 = (int)((float)((eu.a(this.field_o + var6 << 5, 62) >> 8) * var5) * param1.field_a) + var4;
              hha.a(var3_int, (byte) 66, var7Lifetime1, var4, 65280, var8Lifetime1, 23);
            }
          } else {
            var5 = param1.a(this.field_d - this.field_f, (byte) 123);
            var6 = param1.b(true, -this.field_h + this.field_e);
            c.a(var6, var5, var3_int, var4, -16777216, 16776977);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("tj.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int b(boolean param0) {
        if (param0) {
          this.field_i = -104;
        }
        return this.field_n;
    }

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -111);
          param0.a(-632, this.field_i, 32);
          param0.a(-632, this.field_o, 32);
          param0.a(-632, this.field_p, 32);
          if (param1 > -109) {
            faa var4 = (faa) null;
            this.a((faa) null, true);
          }
          param0.a(-632, this.field_n, 32);
          param0.a(-632, this.field_m, 32);
          param0.a(-632, this.field_l, 32);
          param0.a(-632, this.field_j, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.field_i = param0.i(0, 32);
          this.field_o = param0.i(0, 32);
          this.field_p = param0.i(0, 32);
          if (param1) {
            field_r = (String) null;
          }
          this.field_n = param0.i(0, 32);
          this.field_m = param0.i(0, 32);
          this.field_l = param0.i(0, 32);
          this.field_j = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tj.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        int var3 = -117 % ((param0 - 63) / 42);
        this.field_p = param1;
    }

    final static boolean f(byte param0) {
        if (param0 != -21) {
          field_r = (String) null;
        }
        return tla.field_c;
    }

    final int d(byte param0) {
        if (param0 != -119) {
          return 84;
        }
        return this.field_l;
    }

    final void a(int param0, int param1, int param2) {
        this.field_e = this.field_e - this.field_h;
        this.field_d = this.field_d - this.field_f;
        int var4 = -this.field_d + param1;
        if (param2 <= 87) {
          this.d((byte) -40);
        }
        int var5 = -this.field_e + param0;
        this.field_f = var4;
        this.field_h = var5;
        this.field_d = this.field_d + this.field_f;
        this.field_e = this.field_e + this.field_h;
        this.field_i = this.field_i | 1;
    }

    public final void b(byte param0, tv param1) {
        tj var5 = null;
        tj var6 = null;
        try {
          var5 = (tj) (param1);
          var6 = var5;
          super.b((byte) 103, param1);
          var6.field_o = this.field_o;
          var6.field_p = this.field_p;
          var6.field_l = this.field_l;
          var6.field_i = this.field_i;
          var6.field_j = this.field_j;
          var6.field_m = this.field_m;
          if (param0 <= 54) {
            this.field_i = -107;
          }
          var6.field_n = this.field_n;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        this.field_j = param0;
        if (param1 <= 50) {
          field_r = (String) null;
        }
    }

    final void f(int param0) {
        if (param0 != -24805) {
          return;
        }
        this.field_i = this.field_i | 1;
    }

    public final boolean a(byte param0, tv param1) {
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        tj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        try {
          var4 = -41 / ((param0 - 22) / 59);
          var3 = (tj) (param1);
          stackIn_11_0 = (super.a((byte) -121, param1)) || (this.field_i != var3.field_i) || (this.field_o != var3.field_o) || (this.field_p != var3.field_p) || (this.field_n != var3.field_n) || (this.field_m != var3.field_m) || (this.field_l != var3.field_l) || (var3.field_j != this.field_j);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("tj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int e(int param0) {
        if (param0 != 512) {
          this.field_p = -93;
        }
        return this.field_p;
    }

    final int d(int param0) {
        if (param0 <= 100) {
          field_r = (String) null;
        }
        return this.field_d;
    }

    final void a(int param0, ml param1, sfa param2) {
        int var4_int = 0;
        if (this.field_m != 3 &&
          this.field_m != 4) {
          if (fra.a(param1.field_g, this.field_e, 2, this.field_d)) {
            param2.a(this.field_e, param1, this, (byte) 61, this.field_d);
          }
          return;
        }
        try {
          if (param0 != 24158) {
            field_k = (String[]) null;
          }
          var4_int = this.a(param1, 3);
          this.a(false, param2, param1, var4_int);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int e(byte param0) {
        if (param0 != -107) {
          this.e((byte) -9);
        }
        return this.field_e;
    }

    final int g(byte param0) {
        if (param0 != -104) {
          field_k = (String[]) null;
        }
        return this.field_m;
    }

    public final void a(tv param0, int param1) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        tj var5 = null;
        try {
          var5 = (tj) (param0);
          super.a(param0, -106);
          var4 = 0;
          if (var5.field_i != this.field_i) {
            var4 = 1;
            System.out.println("int angle has changed. before=" + var5.field_i + ", now=" + this.field_i);
          }
          if (this.field_o != var5.field_o) {
            var4 = 1;
            System.out.println("int life has changed. before=" + var5.field_o + ", now=" + this.field_o);
          }
          if (this.field_p != var5.field_p) {
            System.out.println("int fired_team has changed. before=" + var5.field_p + ", now=" + this.field_p);
            var4 = 1;
          }
          if (this.field_n != var5.field_n) {
            System.out.println("int fired_player has changed. before=" + var5.field_n + ", now=" + this.field_n);
            var4 = 1;
          }
          if (this.field_m != var5.field_m) {
            var4 = 1;
            System.out.println("int type has changed. before=" + var5.field_m + ", now=" + this.field_m);
          }
          if (param1 >= -19) {
            this.field_l = -123;
          }
          if (this.field_l != var5.field_l) {
            System.out.println("int target_body has changed. before=" + var5.field_l + ", now=" + this.field_l);
            var4 = 1;
          }
          if (this.field_j != var5.field_j) {
            var4 = 1;
            System.out.println("int damage has changed. before=" + var5.field_j + ", now=" + this.field_j);
          }
          if (var4 != 0) {
            System.out.println("This instance of Projectile has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("tj.F(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean c(int param0) {
        if (this.field_m == 3) {
          return true;
        }
        if (param0 < 82) {
          this.field_i = 82;
          return false;
        }
        return false;
    }

    tj() {
    }

    tj(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_d = param0;
        this.field_n = param7;
        this.field_e = param1;
        this.field_j = 5;
        this.field_o = param5;
        this.field_h = param3;
        this.field_f = param2;
        this.field_l = -1;
        this.field_i = param4;
        this.field_m = param8;
        this.field_p = param6;
        this.field_j = param9;
        if (fra.field_a == 1) {
          this.field_j = this.field_j * ed.field_o;
        }
    }

    final void a(boolean param0, sfa param1, ml param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 2147483647) {
            var5_int = (param3 * this.field_f >> 8) + (-this.field_f + this.field_d);
            var6 = (this.field_h * param3 >> 8) - this.field_h + this.field_e;
            param1.a(var6, param2, this, (byte) 61, var5_int);
          }
          if (param0) {
            this.field_n = 12;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("tj.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_r = "Player names can be up to 12 letters, numbers and underscores";
        field_q = 16384;
    }
}
