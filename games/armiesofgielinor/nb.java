/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    private int field_d;
    private int field_e;
    private int field_n;
    private RgbSprite[] field_k;
    private int field_l;
    private int field_o;
    private int field_q;
    private int field_c;
    private boolean field_s;
    private boolean field_p;
    static wm field_i;
    private int field_f;
    private int field_b;
    private boolean field_g;
    private boolean field_r;
    static String[] field_h;
    private int[] field_m;
    private boolean field_a;
    private int field_j;

    final static void a(int param0, int param1, byte param2, Unit param3) {
        if (param2 != -97) {
          return;
        }
        try {
          param0 -= 16;
          AttackEvent.field_E.h(param0 + 48, 12 + param1);
          km.field_h[0].h(46 + param0, param1 + 10);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "nb.S(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        this.field_a = false;
        this.field_g = false;
        if (!this.field_r) {
          return;
        }
        if (this.field_s) {
          this.field_a = this.a(0, param0, param1, param2);
          this.field_g = this.a(1, param0, param1, 0);
          return;
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_l == 0) {
          var2 = this.field_q;
          var3 = this.field_k[0].field_x;
          SoftwareRaster.b(this.field_c, this.field_d, var2, var3, this.field_m[0]);
          if (param0 != 1043) {
            this.g(61);
            return;
          }
          return;
        }
        if (this.field_l == 1) {
          var3 = this.field_q;
          var2 = this.field_k[0].field_A;
        }
        SoftwareRaster.b(this.field_c, this.field_d, var2, var3, this.field_m[0]);
        if (param0 == 1043) {
          return;
        }
        this.g(61);
    }

    final static int c(byte param0) {
        if (param0 < 93) {
          Unit var2 = (Unit) null;
          nb.a(-81, 18, (byte) -44, (Unit) null);
          return ku.field_K;
        }
        return ku.field_K;
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var4Lifetime3;
        int var5Lifetime3;
        if (param1 != -2) {
          this.b(-86, 56, -106);
          if (this.field_l == 0) {
            var4 = this.field_q;
            var5 = this.field_j;
            return mo.a(param2, this.field_c, this.field_d, param0, var4, (byte) -107, var5);
          }
          if (this.field_l != 1) {
            return false;
          }
          var4Lifetime3 = this.field_j;
          var5Lifetime3 = this.field_q;
          return mo.a(param2, this.field_c, this.field_d, param0, var4Lifetime3, (byte) -107, var5Lifetime3);
        }
        if (this.field_l == 0) {
          var4Lifetime1 = this.field_q;
          var5Lifetime1 = this.field_j;
          return mo.a(param2, this.field_c, this.field_d, param0, var4Lifetime1, (byte) -107, var5Lifetime1);
        }
        if (this.field_l != 1) {
          return false;
        }
        var4Lifetime2 = this.field_j;
        var5Lifetime2 = this.field_q;
        return mo.a(param2, this.field_c, this.field_d, param0, var4Lifetime2, (byte) -107, var5Lifetime2);
    }

    private final boolean a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = this.b(param3 ^ 0, param0);
        int var7 = this.a(param3, param0);
        int var8 = this.field_k[0].field_A;
        int var9 = this.field_k[0].field_x;
        var5 = mo.a(param1, var6, var7, param2, var8, (byte) -110, var9) ? 1 : 0;
        return var5 != 0;
    }

    public static void d(byte param0) {
        field_h = null;
        int var1 = -89 / ((param0 + 18) / 38);
        field_i = null;
    }

    private final boolean a(boolean param0, byte param1) {
        if (param1 != 10) {
          this.field_e = -1;
          if (this.field_e > 0) {
            if (this.field_e <= 0) {
              this.field_e = 0;
              return false;
            }
            if (param0) {
              this.field_e = this.field_e - 1;
              return false;
            }
            this.field_e = 0;
            return false;
          }
          if (param0) {
            this.field_e = 5;
            return true;
          }
          if (this.field_e <= 0) {
            this.field_e = 0;
            return false;
          }
          this.field_e = 0;
          return false;
        }
        if (this.field_e > 0) {
          if (this.field_e <= 0) {
            this.field_e = 0;
            return false;
          }
          if (param0) {
            this.field_e = this.field_e - 1;
            return false;
          }
          this.field_e = 0;
          return false;
        }
        if (param0) {
          this.field_e = 5;
          return true;
        }
        if (this.field_e <= 0) {
          this.field_e = 0;
          return false;
        }
        this.field_e = 0;
        return false;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 == 47) {
          this.field_b = param0;
          this.field_f = param2;
          this.field_o = param3;
          this.field_n = param4;
          return;
        }
        this.b(43);
        this.field_b = param0;
        this.field_f = param2;
        this.field_o = param3;
        this.field_n = param4;
    }

    private final void b(int param0) {
        if (param0 != 0) {
          return;
        }
        this.field_s = true;
    }

    private final void a(int param0) {
        if (param0 != 27150) {
          return;
        }
        this.field_j = this.field_k[0].field_A;
    }

    final void f(int param0) {
        this.g(param0 ^ 1043);
        this.a((byte) -91, param0);
        this.a((byte) -121, 1);
        this.e(-1342059263);
    }

    final boolean b(boolean param0) {
        if (param0) {
          return false;
        }
        return this.field_p;
    }

    final int c(int param0) {
        if (param0 != 26787) {
          this.c(true);
          return this.field_j;
        }
        return this.field_j;
    }

    private final int c(int param0, int param1) {
        int var3 = 0;
        if (param1 != 1) {
          this.field_m = (int[]) null;
          if (param0 == 0) {
            if (this.field_a) {
              var3 = 1;
              return var3;
            }
            return var3;
          }
          if (param0 != 1) {
            return var3;
          }
          if (this.field_g) {
            var3 = 1;
            return var3;
          }
          return var3;
        }
        if (param0 == 0) {
          if (this.field_a) {
            var3 = 1;
            return var3;
          }
          return var3;
        }
        if (param0 != 1) {
          return var3;
        }
        if (this.field_g) {
          var3 = 1;
          return var3;
        }
        return var3;
    }

    final int a(boolean param0) {
        if (param0) {
          return -78;
        }
        return this.field_b;
    }

    private final int a(int param0, int param1) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var3 = param0;
        if (param1 != 0) {
          if (param1 != 1) {
            return var3;
          }
          if (0 == this.field_l) {
            var3 = this.field_d;
            return var3;
          }
          if (this.field_l != 1) {
            return var3;
          }
          var3 = this.field_d;
          return var3;
        }
        if (this.field_l == 0) {
          var3 = this.field_d;
          return var3;
        }
        if (1 == this.field_l) {
          var4 = this.field_k[0].field_x;
          var3 = this.field_d - (-this.field_q + var4);
          return var3;
        }
        return var3;
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.field_q = param3;
        this.field_c = param2;
        this.field_d = param0;
        if (param1 >= -119) {
          return;
        }
    }

    final void b(byte param0) {
        if (param0 != -65) {
          this.field_b = 67;
          this.field_r = false;
          return;
        }
        this.field_r = false;
    }

    private final void a(byte param0, int param1) {
        RgbSprite var9 = null;
        RgbSprite var11 = null;
        RgbSprite var10 = null;
        RgbSprite var12 = null;
        int var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var3 = this.b(0, param1);
        int var4 = this.a(0, param1);
        int var6 = -12 / ((-44 - param0) / 33);
        int var5 = this.c(param1, 1);
        RgbSprite var10Lifetime1;
        RgbSprite var12Lifetime1;
        RgbSprite var10Lifetime2;
        RgbSprite var12Lifetime2;
        if (param1 != 0) {
          if (1 != param1) {
            return;
          }
          if (0 == this.field_l) {
            var9 = this.field_k[var5];
            var10 = var9;
            var12 = var10;
            var10Lifetime2 = var9;
            var9.d(var3, var4);
            return;
          }
          if (this.field_l == 1) {
            var10Lifetime1 = this.field_k[var5];
            var12Lifetime2 = var10Lifetime1;
            var12Lifetime2 = var10Lifetime1;
            var10Lifetime1.c(var3, var4);
            return;
          }
          return;
        }
        if (this.field_l == 0) {
          var12Lifetime1 = this.field_k[var5];
          var12Lifetime1.g(var3, var4);
          return;
        }
        if (1 == this.field_l) {
          var11 = this.field_k[var5];
          var11.g(var3, var4);
          return;
        }
    }

    final int a(byte param0) {
        if (param0 < 62) {
          this.f(-97);
          return this.field_f;
        }
        return this.field_f;
    }

    final void a(boolean param0, int param1, int param2, boolean param3) {
        boolean stackIn_13_1 = false;
        boolean stackIn_16_1 = false;
        boolean stackIn_80_1 = false;
        boolean stackIn_83_1 = false;
        boolean stackIn_121_1 = false;
        boolean stackIn_124_1 = false;
        int var5;
        int var6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        this.field_p = false;
        if (!this.field_r) {
          return;
        }
        if (!this.field_s) {
          return;
        }
        if (this.a(param3, (byte) 10)) {
          if (this.field_l == 1 &&
            !this.field_a &&
            !this.field_g) {
            stackIn_13_1 = !(0 >= param1);
            this.field_a = stackIn_13_1;
            stackIn_16_1 = !(param1 >= 0);
            this.field_g = stackIn_16_1;
          }
          if (!this.field_a) {
            if (!this.field_g) {
              return;
            }
            var5 = -1;
          } else {
            var5 = 1;
          }
          this.field_b = this.field_b + var5 * this.field_n;
          if (param2 != -2) {
            return;
          }
          if (this.field_b < 0) {
            this.field_b = 0;
          }
        } else {
          if (!param0) {
            if (param1 == 0) {
              return;
            }
            if (this.field_l == 1 &&
              !this.field_a) {
              if (this.field_g) {
                if (!this.field_a) {
                  if (!this.field_g) {
                    return;
                  }
                  var5 = -1;
                } else {
                  var5 = 1;
                }
                this.field_b = this.field_b + var5 * this.field_n;
                if (param2 != -2) {
                  return;
                }
                if (this.field_b >= 0) {
                  var6 = this.field_f + this.field_b;
                  this.field_p = true;
                  if (var6 <= this.field_o) {
                    return;
                  }
                  this.field_b = this.field_o - this.field_f;
                  return;
                }
                this.field_b = 0;
                var6Lifetime4 = this.field_f + this.field_b;
                this.field_p = true;
                if (var6Lifetime4 > this.field_o) {
                  this.field_b = this.field_o - this.field_f;
                }
                return;
              }
              stackIn_121_1 = !(0 >= param1);
              this.field_a = stackIn_121_1;
              stackIn_124_1 = !(param1 >= 0);
              this.field_g = stackIn_124_1;
            }
            if (!this.field_a) {
              if (!this.field_g) {
                return;
              }
              var5 = -1;
            } else {
              var5 = 1;
            }
            this.field_b = this.field_b + var5 * this.field_n;
            if (param2 != -2) {
              return;
            }
            if (this.field_b < 0) {
              this.field_b = 0;
            }
            var6Lifetime3 = this.field_f + this.field_b;
            this.field_p = true;
            if (var6Lifetime3 <= this.field_o) {
              return;
            }
            this.field_b = this.field_o - this.field_f;
            return;
          }
          if (this.field_l != 1) {
            if (!this.field_a) {
              if (!this.field_g) {
                return;
              }
              var5 = -1;
            } else {
              var5 = 1;
            }
            this.field_b = this.field_b + var5 * this.field_n;
            if (param2 != -2) {
              return;
            }
            if (this.field_b >= 0) {
              var6Lifetime2 = this.field_f + this.field_b;
              this.field_p = true;
              if (var6Lifetime2 <= this.field_o) {
                return;
              }
              this.field_b = this.field_o - this.field_f;
              return;
            }
            this.field_b = 0;
          } else {
            if (this.field_a) {
              if (!this.field_a) {
                if (!this.field_g) {
                  return;
                }
                var5 = -1;
              } else {
                var5 = 1;
              }
              this.field_b = this.field_b + var5 * this.field_n;
              if (param2 != -2) {
                return;
              }
              if (this.field_b >= 0) {
                var6Lifetime2 = this.field_f + this.field_b;
                this.field_p = true;
                if (var6Lifetime2 <= this.field_o) {
                  return;
                }
                this.field_b = this.field_o - this.field_f;
                return;
              }
              this.field_b = 0;
            } else {
              if (this.field_g) {
                if (!this.field_a) {
                  if (!this.field_g) {
                    return;
                  }
                  var5 = -1;
                } else {
                  var5 = 1;
                }
                this.field_b = this.field_b + var5 * this.field_n;
                if (param2 != -2) {
                  return;
                }
                if (this.field_b < 0) {
                  this.field_b = 0;
                }
              } else {
                stackIn_80_1 = !(0 >= param1);
                this.field_a = stackIn_80_1;
                stackIn_83_1 = !(param1 >= 0);
                this.field_g = stackIn_83_1;
                if (!this.field_a) {
                  if (!this.field_g) {
                    return;
                  }
                  var5 = -1;
                } else {
                  var5 = 1;
                }
                this.field_b = this.field_b + var5 * this.field_n;
                if (param2 != -2) {
                  return;
                }
                if (this.field_b >= 0) {
                  var6Lifetime2 = this.field_f + this.field_b;
                  this.field_p = true;
                  if (var6Lifetime2 <= this.field_o) {
                    return;
                  }
                  this.field_b = this.field_o - this.field_f;
                  return;
                }
                this.field_b = 0;
              }
            }
          }
        }
        var6Lifetime1 = this.field_f + this.field_b;
        this.field_p = true;
        if (var6Lifetime1 > this.field_o) {
          this.field_b = this.field_o - this.field_f;
        }
    }

    final boolean c(boolean param0) {
        if (param0) {
          return false;
        }
        return this.field_r;
    }

    final void d(int param0) {
        this.field_r = true;
        if (param0 > -60) {
          this.f(-13);
        }
    }

    private final int b(int param0, int param1) {
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var3 = param0;
        if (param1 != 0) {
          if (param1 != 1) {
            return var3;
          }
          if (this.field_l == 0) {
            var3 = this.field_c;
            return var3;
          }
          if (this.field_l == 1) {
            var3 = this.field_c;
            return var3;
          }
          return var3;
        }
        if (0 != this.field_l) {
          if (this.field_l == 1) {
            var3 = this.field_c;
          }
          return var3;
        }
        int var4 = this.field_k[0].field_A;
        var3 = this.field_c - (-this.field_q + var4);
        return var3;
    }

    private final void e(int param0) {
        boolean discarded$0 = false;
        int var7 = 0;
        int var2 = 0;
        int var3 = 0;
        int var7Lifetime1;
        if (param0 != -1342059263) {
          discarded$0 = this.a(false, (byte) 16);
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = this.field_o;
        if (0 >= var6) {
          var6 = 1;
        }
        if (this.field_l == 0) {
          var7 = this.field_k[0].field_A;
          var2 = var7 + (this.b(0, 1) + (-(var7 << 1) + this.field_q) * this.field_b / var6);
          var3 = this.field_d;
          var4 = this.field_f * (this.field_q - (var7 << 1)) / var6;
          if (this.field_f + this.field_b == this.field_o) {
            var4 = this.b(0, 0) - var2;
          }
          var5 = this.field_j;
        }
        if (this.field_l == 1) {
          var2 = this.field_c;
          var7Lifetime1 = this.field_k[0].field_x;
          var3 = var7Lifetime1 + this.a(0, 1) + (-(var7Lifetime1 << 1) + this.field_q) * this.field_b / var6;
          var4 = this.field_j;
          var5 = this.field_f * (-(var7Lifetime1 << 1) + this.field_q) / var6;
          if (this.field_b + this.field_f == this.field_o) {
            var5 = this.a(0, 0) - var3;
          }
          SoftwareRaster.f(var2, var3, var4, var5, this.field_m[1]);
          SoftwareRaster.b(var2, var3, var4, var5, this.field_m[0]);
          return;
        }
        SoftwareRaster.f(var2, var3, var4, var5, this.field_m[1]);
        SoftwareRaster.b(var2, var3, var4, var5, this.field_m[0]);
    }

    nb(RgbSprite[] param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_l = param2;
          this.field_k = param0;
          this.field_m = param1;
          this.a(27150);
          this.b(0);
          this.b((byte) -65);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("nb.<init>(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_i = new wm();
    }
}
