/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    private int field_e;
    boolean field_i;
    private int field_a;
    int field_h;
    int field_d;
    private int field_f;
    static int field_j;
    private int field_c;
    static int field_b;
    private int field_g;

    final void a(byte param0) {
        this.field_e = 0;
        this.field_g = 0;
        int var2 = -114 / ((38 - param0) / 37);
        this.field_a = 0;
        if (0 == this.field_f &&
          da.field_b == 98) {
          if (this.field_d <= 0) {
            this.field_d = this.field_h;
          }
          this.field_d = this.field_d - 1;
          this.field_i = false;
        }
        if (this.field_f == 0) {
          this.field_a = da.field_b;
        }
        if (this.field_f == 0 &&
          da.field_b == 99) {
          this.field_d = this.field_d + 1;
          if (this.field_h <= this.field_d) {
            this.field_d = 0;
          }
          this.field_i = false;
        }
    }

    final boolean a(int param0) {
        if (param0 != -104) {
          return false;
        }
        return this.field_a == 103 ? true : false;
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        int var6 = 0;
        int var27 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var28 = 0;
        int var29 = 0;
        var29 = Lexicominos.field_L ? 1 : 0;
        try {
          o.a(qb.field_b, 0, 307200, -1);
          for (var1_int = 0; 41 > var1_int; var1_int += 40) {
            var2 = og.field_f[var1_int][0];
            var3 = we.field_b[var1_int][0];
            var4 = bg.field_f[var1_int][0];
            var5 = 0;
            for (var6 = 1; var6 < 10; var6++) {
              var7 = og.field_f[var1_int][var6];
              var8 = we.field_b[var1_int][var6];
              var9 = bg.field_f[var1_int][var6];
              var10 = ce.field_c[-1 + var6];
              var11 = var7 - (var2 - 1);
              if (var11 > 0) {
                var14 = var3 << 20;
                var17 = (-var4 + var9 << 20) / var11;
                var16 = var4 << 20;
                var12 = 1 + var7;
                var13 = var5 << 20;
                var15 = (var8 - var3 << 20) / var11;
                var18 = -2147483648;
              } else {
                var13 = 311 + (-var5 - var10) << 20;
                var11 = 1 - var7 + var2;
                var14 = var8 << 20;
                var12 = var2 + 1;
                var18 = 0;
                var17 = (-var9 + var4 << 20) / var11;
                var15 = (-var8 + var3 << 20) / var11;
                var16 = var9 << 20;
              }
              var19 = (var10 << 20) / var11;
              var2 = var7;
              var5 = var5 + var10;
              var3 = var8;
              while (var11 > 0) {
                var20 = var14 >> 20;
                var21 = 1 + (var16 >> 20) - var20;
                var22 = 471859200 / var21;
                var23 = (471859200 - var21 * var22) / 2;
                var24 = lf.field_f * var20 + var12 - var11;
                if (var21 + var20 > 480) {
                  var21 = 480 - var20;
                }
                if (var20 < 0) {
                  var21 = var21 + var20;
                  var23 = var23 - var20 * var22;
                  var24 = var24 - var20 * lf.field_f;
                }
                var25 = var19 / 2 + var13;
                if (325058560 >= var25) {
                  var26 = (var25 >> 7 | var18) & -2048;
                  var14 = var14 + var15;
                  for (var27 = -var21; var27 < 0; var27++) {
                    var28 = var22 / 2 + var23;
                    if (var28 <= 470810624) {
                      qb.field_b[var24] = tb.a(var26, var28 >> 18);
                      var23 = var23 + var22;
                      var24 = var24 + lf.field_f;
                    }
                  }
                  var16 = var16 + var17;
                  var13 = var13 + var19;
                }
                var11--;
              }
              var4 = var9;
            }
          }
          if (param0) {
            field_b = -104;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "fi.L(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        this.field_i = param1 ? true : false;
        this.field_f = param0;
        if (!this.field_i) {
          this.field_d = param3;
        } else {
          this.field_d = param2;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        var4 = 29 / ((param2 + 54) / 46);
        if (param1 >= this.field_h) {
          throw new IllegalArgumentException();
        }
        if (this.field_h <= param0) {
          throw new IllegalArgumentException();
        }
        this.field_e = 0;
        this.field_g = 0;
        this.field_a = 0;
        if (0 != nk.field_z) {
          this.field_c = tc.field_a;
          this.field_f = nk.field_z;
          this.field_d = param0;
          this.field_i = true;
          this.field_g = nk.field_z;
          this.field_e = nk.field_z;
        }
        if (this.field_f != 0 &&
          ul.field_o != 0) {
          if (0 >= this.field_c) {
            this.field_c = sf.field_a;
            this.field_g = this.field_f;
          }
          this.field_c = this.field_c - 1;
        }
        if (nk.field_z == 0 &&
          ul.field_o == 0) {
          this.field_f = 0;
        }
        if (this.field_f == 0 && (this.field_i ||
          ob.field_c)) {
          if (param1 >= 0) {
            if (param1 == this.field_d) {
            }
            this.field_i = true;
            this.field_d = param1;
          } else {
            if (this.field_i) {
              this.field_d = -1;
            }
          }
        }
    }

    final boolean d(byte param0) {
        if (param0 < 83) {
          this.field_d = 93;
        }
        return this.field_a == 97 ? true : false;
    }

    final boolean e(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 471859200) {
          return true;
        }
        stackIn_7_0 = (2 == this.field_g) || (96 == this.field_a);
        return stackIn_7_0;
    }

    final void a(int param0, int param1) {
        if (param1 < 84) {
          return;
        }
        if (this.field_f == 0) {
          this.field_i = false;
          this.field_d = param0;
        }
    }

    final static db[] a(sh param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 54) {
            field_j = -68;
          }
          if (nb.a(param3, param1, (byte) 126, param0)) {
            return df.a((byte) 91);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("fi.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean d(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 0) {
          field_j = -108;
        }
        stackIn_8_0 = (this.field_g != 0) || (this.field_a == 84) || (this.field_a == 83);
        return stackIn_8_0;
    }

    final boolean f(int param0) {
        int var2 = -30 % ((31 - param0) / 62);
        return this.field_a == 96 ? true : false;
    }

    final boolean b(boolean param0) {
        boolean stackIn_8_0 = false;
        if (!param0) {
          return false;
        }
        stackIn_8_0 = (0 != this.field_e) || (this.field_a == 84) || (this.field_a == 83);
        return stackIn_8_0;
    }

    final void b(byte param0) {
        int var2 = 6 / ((-65 - param0) / 52);
        this.field_e = 0;
        this.field_a = 0;
        this.field_g = 0;
        if (this.field_f == 0) {
          this.field_a = da.field_b;
        }
    }

    final boolean c(int param0) {
        if (param0 != -1) {
          field_b = 67;
        }
        return this.field_f != 0 ? true : false;
    }

    final void c(byte param0) {
        int var2;
        this.field_g = 0;
        this.field_e = 0;
        this.field_a = 0;
        if (0 == this.field_f) {
          this.field_a = da.field_b;
        }
        if (this.field_f == 0 &&
          da.field_b == 96) {
          if (this.field_d <= 0) {
            this.field_d = this.field_h;
          }
          this.field_i = false;
          this.field_d = this.field_d - 1;
        }
        if (this.field_f == 0 &&
          da.field_b == 97) {
          this.field_d = this.field_d + 1;
          this.field_i = false;
          if (this.field_h <= this.field_d) {
            this.field_d = 0;
          }
        }
        var2 = 43 % ((43 - param0) / 41);
    }

    final boolean b(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 != -98) {
          return true;
        }
        stackIn_9_0 = (this.field_g == 1) || (this.field_a == 97) || (this.field_a == 84) || (this.field_a == 83);
        return stackIn_9_0;
    }

    final boolean e(byte param0) {
        if (param0 != -60) {
          return true;
        }
        return 102 == this.field_a ? true : false;
    }

    fi(int param0) {
        this.field_i = false;
        this.field_d = 0;
        this.field_h = param0;
    }

    static {
        field_b = 2;
    }
}
