/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tqa implements fo {
    private int field_c;
    private int field_m;
    private int field_h;
    private int field_b;
    private int field_i;
    static char field_o;
    static byte[] field_e;
    static int field_g;
    static String field_k;
    private int field_a;
    private la field_f;
    private int field_d;
    private vna field_p;
    private int field_l;
    private pca[] field_j;
    private int field_n;

    public final int c(byte param0) {
        if (param0 < 91) {
            this.field_h = 23;
        }
        return this.field_f.s(38) / 2;
    }

    private final int a(byte param0, int param1, int param2) {
        int var4 = 55 / ((-30 - param0) / 56);
        return param2 + (-this.field_c - -((-this.field_l + param1) * this.field_i));
    }

    final static void a(boolean param0, byte param1) {
        int var2 = -75 / ((param1 - -12) / 44);
        ej.field_a.b(-42, 0, 0);
    }

    private final void a(int param0, la param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.field_c = 0;
            this.field_l = 0;
            this.field_a = param3 / param0;
            this.field_h = param2 / param0;
            this.field_n = this.field_a + param4;
            this.field_d = 0 + this.field_h;
            this.field_m = param0;
            this.field_f = param1;
            this.field_b = -this.field_l + this.field_n;
            this.field_i = -this.field_c + this.field_d;
            this.field_j = new pca[this.field_b * this.field_i];
            var6_int = this.field_c;
            L1: while (true) {
              if (var6_int >= this.field_d) {
                break L0;
              } else {
                var7 = this.field_l;
                L2: while (true) {
                  if (var7 >= this.field_n) {
                    var6_int++;
                    continue L1;
                  } else {
                    this.a(var6_int, new pca(), var7, 10);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("tqa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int b(byte param0) {
        int var2 = -60 % ((param0 - -23) / 53);
        return this.field_f.m((byte) -86) / 2;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            this.c((byte) -59);
        }
    }

    final void a(byte param0, kh param1, la param2) {
        int var4_int = 0;
        int var5 = 0;
        lk var6 = null;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 25) {
                break L1;
              } else {
                this.field_f = (la) null;
                break L1;
              }
            }
            L2: {
              this.field_p.d(8);
              if ((param2.field_E ^ -1) < -9) {
                L3: {
                  if (-10 <= (param2.field_E ^ -1)) {
                    param1.b((byte) 44, 8);
                    param1.b((byte) 44, 8);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4_int = 0;
                L4: while (true) {
                  if (var4_int >= this.field_a) {
                    L5: {
                      if (10 > param2.field_E) {
                        break L5;
                      } else {
                        var4_int = param1.b((byte) 44, 8);
                        var5 = 0;
                        L6: while (true) {
                          if (var5 >= var4_int) {
                            break L5;
                          } else {
                            var6 = new lk(param2, param1);
                            this.field_p.b((byte) -77, var6);
                            var5++;
                            continue L6;
                          }
                        }
                      }
                    }
                    break L2;
                  } else {
                    var5 = 0;
                    L7: while (true) {
                      if (this.field_h <= var5) {
                        var4_int++;
                        continue L4;
                      } else {
                        this.a(param0 + -133, var5, var4_int).a((byte) 29, param2, param1);
                        var5++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("tqa.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
    }

    final int c(int param0) {
        if (param0 < 0) {
            this.field_l = 127;
        }
        return this.field_a;
    }

    final void f(byte param0) {
        int var3 = 0;
        int var4 = 0;
        pca var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        pca[] var2 = this.field_j;
        this.a(this.field_m, this.field_f, -125);
        if (param0 != 64) {
            this.field_d = -6;
        }
        for (var3 = this.field_c; this.field_d > var3; var3++) {
            for (var4 = this.field_l; this.field_n > var4; var4++) {
                var5 = var2[this.a((byte) 93, var4, -1 + -var3 + this.field_h)];
                this.a(var3, var5, var4, 10);
                var5.e(param0 + -64);
            }
        }
        lk var7 = (lk) ((Object) this.field_p.f(param0 ^ -16));
        while (var7 != null) {
            var7.a(this.field_f, (byte) 104);
            var7 = (lk) ((Object) this.field_p.e(107));
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int stackIn_8_0 = 0;
        if (param1 == 48) {
          L0: {
            L1: {
              if ((param2 ^ -1) > -1) {
                break L1;
              } else {
                if (0 > param0) {
                  break L1;
                } else {
                  if (param2 >= this.field_h) {
                    break L1;
                  } else {
                    if (this.field_a <= param0) {
                      break L1;
                    } else {
                      stackIn_8_0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            stackIn_8_0 = 0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        if (param0 < 24) {
            return;
        }
        field_k = null;
        field_e = null;
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            this.a(8, 65, true, 67, -80, 46, 77);
        }
        return false;
    }

    public final void a(int param0, iq param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        lk var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 > 103) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= this.field_i) {
                  var6 = (lk) ((Object) this.field_p.f(-80));
                  L2: while (true) {
                    if (var6 == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var6.a(119, param1);
                      var6 = (lk) ((Object) this.field_p.e(107));
                      continue L2;
                    }
                  }
                } else {
                  var4 = 0;
                  L3: while (true) {
                    if (this.field_b <= var4) {
                      var3_int++;
                      continue L1;
                    } else {
                      this.a(-118, var3_int, var4).a((byte) 117, param1);
                      var4++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("tqa.DB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int e(byte param0) {
        if (param0 > -86) {
            this.field_d = -124;
            return 0;
        }
        return 0;
    }

    private final void a(int param0, pca param1, int param2, int param3) {
        int var5_int = 0;
        try {
            if (param3 != 10) {
                field_g = -103;
            }
            var5_int = this.a((byte) 113, param2, param0);
            this.field_j[var5_int] = param1;
            this.field_j[var5_int].a(param0, 125, param2, (tqa) (this));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tqa.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int a(int param0) {
        int var2 = -52 / ((-4 - param0) / 62);
        return this.field_h;
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        this.a(param6, param3, -123, param0, param4, param1, param5, -1);
        if (!param2) {
            this.field_j = (pca[]) null;
        }
    }

    final int d(int param0) {
        if (param0 != -30551) {
            this.a(1, false);
        }
        return this.field_m;
    }

    final boolean b(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        pca var17;
        int var18;
        L0: {
          var18 = TombRacer.field_G ? 1 : 0;
          var8 = 1;
          var9 = param5 / 2;
          var10 = param0 / 2;
          if (param3 == 8597) {
            break L0;
          } else {
            this.field_c = -71;
            break L0;
          }
        }
        var11 = this.a(param4 + -var9 - -var8, false);
        var12 = this.a(-var10 + (param1 + var8), false);
        var13 = this.a(-var8 + (param4 - -var9), false);
        var14 = this.a(-var8 + (param1 + var10), false);
        var15 = var11;
        L1: while (true) {
          if (var13 < var15) {
            return false;
          } else {
            var16 = var12;
            L2: while (true) {
              if (var14 < var16) {
                var15++;
                continue L1;
              } else {
                if (!this.a(var16, (byte) 48, var15)) {
                  if (param2) {
                    return true;
                  } else {
                    var16++;
                    continue L2;
                  }
                } else {
                  var17 = this.a(-115, var15, var16);
                  if (var17.a(param6, 0)) {
                    return true;
                  } else {
                    var16++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
    }

    final la b(int param0) {
        if (param0 != 0) {
            field_g = -85;
        }
        return this.field_f;
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        if (param1) {
            return -102;
        }
        if (param0 < 0) {
            var3 = (param0 - -1 - this.field_m) / this.field_m;
        } else {
            var3 = param0 / this.field_m;
        }
        return var3;
    }

    final void a(uw param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = param1;
            L1: while (true) {
              if (var3_int >= this.field_j.length) {
                break L0;
              } else {
                this.field_j[var3_int].a(param0, (byte) 84);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("tqa.H(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = TombRacer.field_G ? 1 : 0;
        if (param1 != 2) {
            this.field_i = -62;
        }
        pca[] var4 = this.field_j;
        int var5 = this.field_i;
        int var6 = this.field_b;
        this.a(param0, this.field_f, 0);
        int var7 = param2 / param0;
        int var8 = param2 / param0;
        for (var9_int = 0; this.field_i > var9_int; var9_int++) {
            for (var10 = 0; this.field_b > var10; var10++) {
                var11 = za.a(0, (byte) 113, var5 + -1, var9_int - var7);
                var12 = za.a(0, (byte) 85, -1 + var6, var10 - var8);
                this.a(param1 + -115, var9_int, var10).a(var4[var12 * var5 + var11], 21324);
            }
        }
        lk var9 = (lk) ((Object) this.field_p.f(-80));
        while (var9 != null) {
            var9.a(-6492, var9.a((byte) 124) + param2);
            var9.b(param1 ^ 2, param2 + var9.g((byte) -121));
            var9 = (lk) ((Object) this.field_p.e(118));
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        pca var18;
        int var19;
        la var20;
        L0: {
          var19 = TombRacer.field_G ? 1 : 0;
          var9 = -1 + this.field_m;
          var10 = param6 / 2;
          var11 = param4 / 2;
          if ((param1 ^ -1) != -2) {
            break L0;
          } else {
            var10 = var10 + this.field_m;
            var11 = var11 + this.field_m;
            break L0;
          }
        }
        L1: {
          var12 = iia.d(this.field_c, this.a(-var10 + param0 + var9, false), 2);
          var13 = iia.d(this.field_l, this.a(var9 + -var11 + param3, false), 2);
          var14 = et.b(this.a(-var9 + var10 + param0, false), -1 + this.field_d, 124);
          var15 = et.b(this.a(var11 + (param3 - var9), false), this.field_n - 1, 101);
          if (param2 <= -104) {
            break L1;
          } else {
            var20 = (la) null;
            this.a((byte) -39, (kh) null, (la) null);
            break L1;
          }
        }
        var16 = var12;
        L2: while (true) {
          if (var14 < var16) {
            return;
          } else {
            var17 = var13;
            L3: while (true) {
              if (var17 > var15) {
                var16++;
                continue L2;
              } else {
                if (this.a(var17, (byte) 48, var16)) {
                  L4: {
                    var18 = this.a(127, var16, var17);
                    if ((param5 ^ -1) != 0) {
                      var18.a(param7, param5, true);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (param1 != -1) {
                    var18.a((byte) 29, param7);
                    var17++;
                    continue L3;
                  } else {
                    var17++;
                    continue L3;
                  }
                } else {
                  var17++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.a(param3, param0, -110, param5, param1, param4, param2, 1);
        if (!param6) {
            this.field_p = (vna) null;
        }
    }

    final void a(int param0, la param1, int param2) {
        try {
            this.a(param0, param1, param1.m((byte) -86), param1.s(-125), 0);
            int var4_int = 17 / ((-78 - param2) / 43);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tqa.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final pca a(int param0, int param1, byte param2) {
        int var4 = this.a(param1, false);
        int var5 = this.a(param0, false);
        if (!this.a(var5, (byte) 48, var4)) {
            return null;
        }
        if (param2 != 119) {
            return (pca) null;
        }
        return this.a(-116, var4, var5);
    }

    final void a(int param0, byte param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        lk var5 = (lk) ((Object) this.field_p.f(-80));
        while (var5 != null) {
            if (!(var5.a(param0, false))) {
                var5.p(56);
            }
            var5 = (lk) ((Object) this.field_p.e(126));
        }
        if (param1 > -11) {
            this.field_n = 14;
        }
    }

    final void a(int param0, kh param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        lk var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (this.field_a <= var3_int) {
                param1.a((byte) -128, this.field_p.a((byte) -16), param0);
                var6 = (lk) ((Object) this.field_p.f(-80));
                L2: while (true) {
                  if (var6 == null) {
                    break L0;
                  } else {
                    var6.a((byte) -128, param1);
                    var6 = (lk) ((Object) this.field_p.e(123));
                    continue L2;
                  }
                }
              } else {
                var4 = 0;
                L3: while (true) {
                  if (this.field_h <= var4) {
                    var3_int++;
                    continue L1;
                  } else {
                    this.a(-98, var4, var3_int).a(param1, -78);
                    var4++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("tqa.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final pca a(int param0, int param1, int param2) {
        int var4 = -107 % ((param0 - -36) / 59);
        return this.field_j[this.a((byte) 31, param2, param1)];
    }

    tqa(la param0, int param1) {
        this.field_p = new vna();
        try {
            this.a(param1, param0, 107);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_o = '/';
        field_g = -1;
        field_k = "You need a rating of <%1> to play with the current options.";
    }
}
