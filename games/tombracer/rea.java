/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rea extends nv {
    private int field_s;
    private int field_q;
    private boolean field_u;
    private boolean field_p;
    private int field_o;
    private int field_v;
    private int field_n;
    private int field_w;
    static String field_r;
    private int field_x;
    private up field_t;

    final boolean l(int param0) {
        if (param0 == -5) {
          return this.field_n == 4 ? true : false;
        }
        this.field_t = (up) null;
        return this.field_n == 4 ? true : false;
    }

    final boolean c(int param0) {
        int var2 = 97 / ((param0 - 2) / 62);
        return this.field_n == 1 ? true : false;
    }

    final boolean r(int param0) {
        if (param0 <= -31) {
          return this.field_n == 2 ? true : false;
        }
        this.field_o = 10;
        return this.field_n == 2 ? true : false;
    }

    final void a(boolean param0, fsa param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.a(param0, param1);
          if (4 > this.b(true).field_E) {
            param1.h(3, 0);
          }
          param1.b((byte) -62, 8);
          if (0 == this.field_q) {
            param1.b((byte) 17, true);
            this.field_q = param1.b(73);
            param1.a((byte) -3, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("rea.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          param1.a((byte) 116, this.field_v, 8);
          param1.a((byte) -128, this.field_o, 8);
          param1.a((byte) 107, this.field_s, 8);
          param1.a((byte) -20, this.field_x, 8);
          param1.a((byte) -126, this.field_u ? 1 : 0, 1);
          param1.a((byte) -23, this.field_p ? 1 : 0, 1);
          this.field_t.a(param1, (byte) 125);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rea.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    rea(la param0, boolean param1) {
        super(param0, param1);
        this.field_u = false;
        this.field_p = false;
        try {
          this.field_s = 25;
          this.field_x = 50;
          this.field_v = 50;
          this.field_o = 25;
          this.field_t = new up(0, 100);
          this.field_t.b(1, 4);
          this.k((byte) -106);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void k(byte param0) {
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        if (0 >= this.field_s) {
          this.field_s = 1;
          if (0 >= this.field_v) {
            this.field_v = 1;
          }
          if (this.field_o <= 0) {
            this.field_o = 1;
          }
          if (this.field_x <= 0) {
            this.field_x = 1;
          }
          var2 = 7 % ((-26 - param0) / 56);
          return;
        }
        if (0 >= this.field_v) {
          this.field_v = 1;
        }
        if (this.field_o <= 0) {
          this.field_o = 1;
        }
        if (this.field_x > 0) {
          var2Lifetime1 = 7 % ((-26 - param0) / 56);
          return;
        }
        this.field_x = 1;
        var2Lifetime2 = 7 % ((-26 - param0) / 56);
        return;
    }

    final int j(byte param0) {
        if (param0 != 90) {
          field_r = (String) null;
          return this.field_o;
        }
        return this.field_o;
    }

    final void b(byte param0, boolean param1) {
        this.field_u = param1 ? true : false;
        if (param0 <= 64) {
          this.field_q = -123;
        }
    }

    final int a(boolean param0) {
        if (param0) {
          this.a(109, 0, 65, 72, 73);
          return 2;
        }
        return 2;
    }

    final boolean s(int param0) {
        int var2 = -108 % ((param0 + 19) / 49);
        return this.field_n == 3 ? true : false;
    }

    rea(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        boolean stackIn_8_1 = false;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_u = false;
        this.field_p = false;
        try {
          if (param0.field_E >= 3) {
            this.field_v = param1.b((byte) 44, 8);
            this.field_o = param1.b((byte) 44, 8);
            if (param0.field_E >= 20) {
              this.field_s = param1.b((byte) 44, 8);
            }
            this.field_x = param1.b((byte) 44, 8);
            stackIn_8_1 = (param1.b((byte) 44, 1) == 1);
            this.field_u = stackIn_8_1;
            if (param0.field_E >= 20) {
              stackIn_12_1 = (param1.b((byte) 44, 1) == 1);
              this.field_p = stackIn_12_1;
            }
          } else {
            this.field_o = 25;
            this.field_u = false;
            this.field_v = 50;
            this.field_x = 50;
          }
          if (16 <= param0.field_E) {
            this.field_t = ad.a((byte) 87, param1);
          } else {
            this.field_t = new up(0, 100);
          }
          this.k((byte) -101);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("rea.<init>(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
          return true;
        }
        return true;
    }

    final void k(int param0) {
        int var3;
        int var4;
        int var5;
        int var6_int;
        la var6;
        int var7;
        hca var8;
        var7 = TombRacer.field_G ? 1 : 0;
        var8 = this.field_g.H(param0 - 5537);
        var3 = this.field_p ? 1 : 0;
        var4 = this.field_g.d(3);
        var5 = this.field_g.e(param0 + 4230);
        if (var3 == 0) {
          if (this.field_n != 0) {
            if (1 == this.field_n) {
              var3 = ck.a(var8.d(3), 1, var4, this.field_g.c(param0 - 5496), this.field_g.a((byte) 55), var8.e(9648), (byte) 82, var5, 1) ? 1 : 0;
            }
          } else {
            var3 = ck.a(var8.d(3), var8.a((byte) 55), var4, this.field_g.c(-23), this.field_g.a((byte) 55), var8.e(9648), (byte) 69, var5, var8.c(param0 - 5519)) ? 1 : 0;
          }
        }
        var6_int = this.field_n;
        if (var6_int == 0) {
          if (var3 == 0) {
            this.b(0, 0);
            if (this.field_u) {
              this.field_g.L(-31);
              if (param0 != 5418) {
                this.field_v = -69;
              }
              return;
            }
          } else {
            this.field_n = 1;
            if (this.field_u) {
              this.field_g.G(121);
            }
            this.field_w = this.field_w + 1;
            if (this.field_v < this.field_w) {
              this.b(param0 ^ 5418, 2);
              if (!this.field_u) {
                this.field_g.G(121);
                if (param0 != 5418) {
                  this.field_v = -69;
                }
                return;
              }
            }
          }
        } else {
          if (var6_int != 1) {
            if (2 == var6_int) {
              this.field_w = this.field_w + 1;
              if (this.field_w > this.field_o) {
                var6 = this.b(true);
                var6.a(123, var5, this.field_t, this.field_g.a((byte) 55), this.field_g.c(-79), var4);
                this.b(0, 3);
                this.field_g.a((byte) -3, this.field_q);
                this.field_g.b((byte) 17, false);
                if (param0 == 5418) {
                  return;
                }
                this.field_v = -69;
                return;
              }
            } else {
              if (3 != var6_int) {
                if (var6_int == 4) {
                  this.field_w = this.field_w + 1;
                  if (this.field_w > this.field_x) {
                    this.b(param0 - 5418, 1);
                    this.field_g.L(127);
                  }
                }
              } else {
                this.field_w = this.field_w + 1;
                if (this.field_s < this.field_w) {
                  this.b(param0 - 5418, 4);
                  this.field_g.a((byte) -3, 0);
                  this.field_g.b((byte) 17, true);
                }
              }
            }
          } else {
            if (var3 != 0) {
              this.field_n = 1;
              if (this.field_u) {
                this.field_g.G(121);
              }
              this.field_w = this.field_w + 1;
              if (this.field_v < this.field_w) {
                this.b(param0 ^ 5418, 2);
                if (!this.field_u) {
                  this.field_g.G(121);
                }
              }
            } else {
              this.b(0, 0);
              if (this.field_u) {
                this.field_g.L(-31);
              }
            }
          }
        }
        if (param0 == 5418) {
          return;
        }
        this.field_v = -69;
    }

    final static hja[] a(cn param0, int param1, int param2, byte param3) {
        RuntimeException var4 = null;
        hja[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!jna.a(false, param2, param1, param0)) {
            return null;
          }
          if (param3 <= 20) {
            field_r = (String) null;
          }
          stackIn_6_0 = uj.a(0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("rea.FA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_r = null;
        if (param0 != 12134) {
          rea.a(85, 105, 55, -55, 43, true, 103);
        }
    }

    private final void b(int param0, int param1) {
        this.field_n = param1;
        this.field_w = param0;
    }

    final int a(int param0, int param1) {
        param0 = fs.a((byte) 49, param0, this.field_n);
        if (param1 >= -48) {
          return -52;
        }
        return param0;
    }

    final int d(boolean param0) {
        if (param0) {
          this.g((byte) -41);
          return this.field_x;
        }
        return this.field_x;
    }

    final int g(byte param0) {
        if (param0 > -36) {
          field_r = (String) null;
          return this.field_w;
        }
        return this.field_w;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        boolean stackIn_18_0 = false;
        if (param5) {
          rea.a(-44, -75, 109, 115, -67, true, -126);
          if (param2 > param3) {
            return false;
          }
          if (param1 + param2 <= param3) {
            return false;
          }
          if (param6 > param0) {
            return false;
          }
          if (param4 + param6 <= param0) {
            return false;
          }
          return true;
        }
        if (param2 > param3) {
          return false;
        }
        if (param1 + param2 <= param3) {
          return false;
        }
        stackIn_18_0 = (param6 <= param0) && (param4 + param6 > param0);
        return stackIn_18_0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ffa param6) {
        RuntimeException var8 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 1) {
            this.g((byte) 48);
          }
          stackIn_5_0 = (this.field_n == 3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("rea.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_o = param1;
        if (param2 == 1) {
          this.field_v = param4;
          this.field_x = param3;
          this.field_s = param0;
          return;
        }
        this.field_q = -90;
        this.field_v = param4;
        this.field_x = param3;
        this.field_s = param0;
    }

    final boolean a(int param0, int param1, pc param2, int param3) {
        RuntimeException var5 = null;
        pc var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (3 != this.field_n) {
            return false;
          }
          if (param1 != 1) {
            var6 = (pc) null;
            this.a(-121, -9, (pc) null, -81);
          }
          param2.a(param3, (byte) 47);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("rea.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_r = "Player Name: ";
    }
}
