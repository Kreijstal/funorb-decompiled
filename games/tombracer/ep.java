/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ep extends c implements fo, ffa, t {
    private int field_j;
    private boolean field_p;
    private int field_u;
    private int field_w;
    private boolean field_l;
    private int field_s;
    private boolean field_F;
    private boolean field_C;
    private int field_x;
    private int field_J;
    private int field_y;
    private int field_E;
    private int field_i;
    static ss field_k;
    private la field_z;
    private int field_H;
    private int field_K;
    private up field_t;
    private boolean field_B;
    private int field_G;
    static nh field_n;
    static jea field_r;
    private int field_v;
    private int field_o;
    private int field_I;
    private on field_q;
    private int field_D;
    int field_m;

    final int g(int param0) {
        if (param0 != -1) {
          return 72;
        }
        return this.field_x;
    }

    final void a(int param0, int param1) {
        int var3 = -21 % ((20 - param1) / 42);
        this.field_i = param0;
    }

    public final int e(byte param0) {
        if (param0 > -86) {
          this.field_z = (la) null;
          return this.field_G;
        }
        return this.field_G;
    }

    public final int a(byte param0) {
        if (param0 != 55) {
          uw var3 = (uw) null;
          this.a((uw) null, -69);
          return this.field_o;
        }
        return this.field_o;
    }

    final int k(int param0) {
        int var2 = -72 / ((param0 + 24) / 39);
        return this.field_s;
    }

    public final boolean j(byte param0) {
        if (param0 >= -102) {
          field_n = (nh) null;
          return true;
        }
        return true;
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 > 17) {
          this.field_u = param0;
          this.field_K = param1;
          return;
        }
        this.a(65, (byte) -64, 122, false);
        this.field_u = param0;
        this.field_K = param1;
    }

    final void a(la param0, int param1) {
        try {
          this.field_u = param0.a(this.field_u, (byte) 71);
          this.field_s = -this.field_s;
          this.field_H = dfa.a(-this.field_H, 8192, 105);
          if (param1 >= -16) {
            this.field_I = 44;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ep.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        this.field_K = param2;
        this.field_G = param3;
        this.field_u = param0;
        if (param1 != -78) {
          this.a(53);
        }
    }

    final boolean h(int param0) {
        if (param0 != 18407) {
          this.a(false, true);
          return this.field_F;
        }
        return this.field_F;
    }

    private final void b(boolean param0, boolean param1) {
        if (param0) {
          this.field_z.a(this.field_K, this.field_u, this.field_m, this.field_G, (byte) 6);
          if (this.field_B) {
            if (this.field_s != 0) {
              this.field_s = 0;
              this.field_B = false;
              this.field_J = this.field_J * 2;
              this.field_y = 0;
              this.field_C = false;
              return;
            }
            if (this.field_y != 0) {
              this.field_s = 0;
              this.field_B = false;
              this.field_J = this.field_J * 2;
              this.field_y = 0;
              this.field_C = false;
              return;
            }
          }
          this.h((byte) 32);
          if (param1) {
            this.a(true, 0);
          } else {
            this.field_I = this.field_I - 1;
            if (this.field_I <= 0) {
              this.a(true, 0);
            }
          }
          if (!this.field_C) {
            return;
          }
          this.field_t.field_g = null;
          return;
        }
        this.field_o = -115;
        this.field_z.a(this.field_K, this.field_u, this.field_m, this.field_G, (byte) 6);
        if (!this.field_B) {
          this.h((byte) 32);
          if (!param1) {
            this.field_I = this.field_I - 1;
            if (this.field_I <= 0) {
              this.a(true, 0);
            }
          } else {
            this.a(true, 0);
          }
        } else {
          if (this.field_s != 0) {
            this.field_s = 0;
            this.field_B = false;
            this.field_J = this.field_J * 2;
            this.field_y = 0;
            this.field_C = false;
            return;
          }
          if (this.field_y != 0) {
            this.field_s = 0;
            this.field_B = false;
            this.field_J = this.field_J * 2;
            this.field_y = 0;
            this.field_C = false;
            return;
          }
          this.h((byte) 32);
          if (param1) {
            this.a(true, 0);
            if (!this.field_C) {
              return;
            }
            this.field_t.field_g = null;
            return;
          }
          this.field_I = this.field_I - 1;
          if (this.field_I > 0) {
            if (!this.field_C) {
              return;
            }
            this.field_t.field_g = null;
            return;
          }
          this.a(true, 0);
        }
        if (this.field_C) {
          this.field_t.field_g = null;
        }
    }

    private final void a(int param0, byte param1, int param2, boolean param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        up var10;
        int var6Lifetime1;
        int var6Lifetime2;
        up var10Lifetime1;
        up var10Lifetime2;
        var9 = TombRacer.field_G ? 1 : 0;
        var5 = 0;
        if (param3) {
          var6 = 0;
          var7 = this.field_u;
          if (0 <= param0) {
            if (param0 > 0) {
              var6 = 1;
              this.field_u = this.field_u + param0;
            }
          } else {
            var6 = 1;
            this.field_u = this.field_u + param0;
          }
          var8 = this.field_K;
          if (var6 != 0 &&
            this.c(0, param0, 98)) {
            var5 = 1;
            this.b(true, false);
            this.field_s = -this.field_s;
            this.field_u = var7;
          }
          var6Lifetime2 = 0;
          if (param2 < 0) {
            var6Lifetime2 = 1;
            this.field_K = this.field_K + param2;
          } else {
            if (0 < param2) {
              this.field_K = this.field_K + param2;
              var6Lifetime2 = 1;
              if (var6Lifetime2 == 0) {
                if (param1 >= -51) {
                  var10 = (up) null;
                  this.a(81, (up) null);
                }
                if (var5 != 0) {
                  return;
                }
                if (!param3 &&
                  this.field_t.field_j == 0) {
                  return;
                }
                if (this.field_t.field_j == 3) {
                  this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
                }
                var6Lifetime2 = this.field_z.a(this, -16164, this.field_t);
                if (var6Lifetime2 <= 0) {
                  return;
                }
                this.b(true, true);
                return;
              }
              if (this.c(param2, 0, 111)) {
                var5 = 1;
                this.b(true, false);
                this.field_y = -this.field_y;
                this.field_K = var8;
              }
              if (param1 < -51) {
                if (var5 != 0) {
                  return;
                }
                if (!param3 &&
                  this.field_t.field_j == 0) {
                  return;
                }
                if (this.field_t.field_j == 3) {
                  this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
                }
                var6Lifetime2 = this.field_z.a(this, -16164, this.field_t);
                if (var6Lifetime2 <= 0) {
                  return;
                }
                this.b(true, true);
                return;
              }
              var10 = (up) null;
              this.a(81, (up) null);
              if (var5 != 0) {
                return;
              }
              if (!param3 &&
                this.field_t.field_j == 0) {
                return;
              }
              if (this.field_t.field_j == 3) {
                this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
              }
              var6Lifetime2 = this.field_z.a(this, -16164, this.field_t);
              if (var6Lifetime2 <= 0) {
                return;
              }
              this.b(true, true);
              return;
            }
          }
          if (var6Lifetime2 != 0) {
            if (!this.c(param2, 0, 111)) {
              if (param1 >= -51) {
                var10Lifetime2 = (up) null;
                this.a(81, (up) null);
              }
              if (var5 != 0) {
                return;
              }
              if (!param3 &&
                this.field_t.field_j == 0) {
                return;
              }
              if (this.field_t.field_j == 3) {
                this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
              }
              var6Lifetime2 = this.field_z.a(this, -16164, this.field_t);
              if (var6Lifetime2 <= 0) {
                return;
              }
              this.b(true, true);
              return;
            }
            var5 = 1;
            this.b(true, false);
            this.field_y = -this.field_y;
            this.field_K = var8;
          }
        }
        if (param1 >= -51) {
          var10Lifetime1 = (up) null;
          this.a(81, (up) null);
        }
        if (var5 != 0) {
          return;
        }
        if (!param3 &&
          this.field_t.field_j == 0) {
          return;
        }
        if (this.field_t.field_j == 3) {
          this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
        }
        var6Lifetime1 = this.field_z.a(this, -16164, this.field_t);
        if (var6Lifetime1 <= 0) {
          return;
        }
        this.b(true, true);
    }

    private final void h(byte param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        int var3Lifetime1;
        int var2Lifetime1;
        if (param0 < 0) {
          this.c(true);
          var3 = this.field_t.field_j;
          if (var3 == 4) {
            return;
          }
          if (var3 == 5) {
            return;
          }
          if (var3 != 3) {
            if (var3 == 0) {
              var2 = qva.a((byte) -35, this.field_y, this.field_s) + 4096;
              this.field_z.b(false).a(this.field_K, (byte) -83, 5, this.field_G, 3, var2, 10, 262144, this.field_u, 16, 8);
              return;
            }
            return;
          }
          this.field_z.b(false).a(this.field_K, (byte) -121, 4, this.field_G, 1, 0, 20, 0, this.field_u, this.field_o >> 18, this.field_o >> 17);
          return;
        }
        var3Lifetime1 = this.field_t.field_j;
        if (var3Lifetime1 == 4) {
          return;
        }
        if (var3Lifetime1 == 5) {
          return;
        }
        if (var3Lifetime1 != 3) {
          if (var3Lifetime1 != 0) {
            return;
          }
          var2Lifetime1 = qva.a((byte) -35, this.field_y, this.field_s) + 4096;
          this.field_z.b(false).a(this.field_K, (byte) -83, 5, this.field_G, 3, var2Lifetime1, 10, 262144, this.field_u, 16, 8);
          return;
        }
        this.field_z.b(false).a(this.field_K, (byte) -121, 4, this.field_G, 1, 0, 20, 0, this.field_u, this.field_o >> 18, this.field_o >> 17);
    }

    private final int b(int param0, up param1) {
        int stackIn_2_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (param0 < 100) {
            stackIn_2_0 = 115;
            return stackIn_2_0;
          }
          if (this.field_t.field_j == 4 &&
            5 == param1.field_j) {
            this.a(false, 0);
            this.field_z.b(30097, 1048576, 1, this.field_K, this.field_u);
            stackIn_32_0 = 0;
            return stackIn_32_0;
          }
          if (this.field_t.field_j == 3 && (param1.field_j == 4 ||
            param1.field_j == 5)) {
            this.a(false, 0);
            this.field_z.b(false).c(this.field_u, 93, this.field_y, this.field_G, this.field_s, this.field_K);
            if (5 == param1.field_j) {
              this.field_z.b(30097, 1048576, 0, this.field_K, this.field_u);
            }
            stackIn_30_0 = 0;
            return stackIn_30_0;
          }
          if (3 != this.field_t.field_j &&
            3 == param1.field_j) {
            var3_int = 1 + param1.field_b / 2;
            if (0 >= var3_int) {
              stackIn_15_0 = 0;
              return stackIn_15_0;
            }
            if (this.field_t.field_j == 4 ||
              this.field_t.field_j == 5) {
              var3_int = 0;
            }
            if (var3_int <= 0) {
              return 0;
            }
            if (!this.field_t.d(6734)) {
              this.field_i = 4;
            }
            this.field_t.a(29525, param1.b(-344));
            stackIn_26_0 = 0;
            return stackIn_26_0;
          }
          stackIn_34_0 = 0;
          return stackIn_34_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("ep.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    public final boolean a(int param0, gma param1, int param2, pc param3) {
        RuntimeException var5 = null;
        iq var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            var6 = (iq) null;
            this.a(63, (iq) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ep.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final int d(int param0) {
        if (param0 != 3) {
          this.field_F = true;
          return this.field_u;
        }
        return this.field_u;
    }

    final int f(boolean param0) {
        if (!param0) {
          this.a(42, (byte) 84);
          return this.field_H;
        }
        return this.field_H;
    }

    public final String toString() {
        return "Projectile (x=" + this.field_u + ", y=" + this.field_K + ", vx=" + this.field_s + ", vy=" + this.field_y + ", " + "angle=" + this.field_H + ", endSize=" + this.field_v + ")";
    }

    final void c(boolean param0, boolean param1) {
        if (param0) {
          this.field_B = param1 ? true : false;
          return;
        }
        this.field_D = 124;
        this.field_B = param1 ? true : false;
    }

    public final boolean a(byte param0, boolean param1) {
        if (param0 != -55) {
          return false;
        }
        return false;
    }

    final void b(boolean param0, int param1) {
        this.field_C = param0 ? true : false;
        int var3 = 43 / ((param1 - 14) / 38);
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = TombRacer.field_G ? 1 : 0;
        var5 = 0;
        if (param3 == 0) {
          if (param1) {
            if (0 > param0) {
              var5 = 1;
              this.field_u = this.field_u + param0;
            } else {
              if (0 < param0) {
                var5 = 1;
                this.field_u = this.field_u + param0;
              }
            }
            if (0 > param2) {
              this.field_K = this.field_K + param2;
              var5 = 1;
              var6 = 0;
              if (param1 ||
                this.field_t.field_j != 0) {
                if (this.field_t.field_j == 3) {
                  this.field_z.a(param3 - 31, this.field_K, th.field_o, 2 * this.field_o, this.field_o * 2, this.field_u);
                }
                var7 = this.field_z.a(this, -16164, this.field_t);
                if (var7 > 0) {
                  var6 = 1;
                  this.b(true, true);
                }
              }
              if (var5 != 0 &&
                this.c(param2, param0, 122) &&
                var6 == 0) {
                this.b(true, true);
              }
              return;
            }
            if (param2 > 0) {
              this.field_K = this.field_K + param2;
              var5 = 1;
            }
          }
          var6 = 0;
          if (!param1 &&
            this.field_t.field_j == 0) {
            if (var5 != 0 &&
              this.c(param2, param0, 122) &&
              var6 == 0) {
              this.b(true, true);
            }
            return;
          }
          if (this.field_t.field_j == 3) {
            this.field_z.a(param3 - 31, this.field_K, th.field_o, 2 * this.field_o, this.field_o * 2, this.field_u);
          }
          var7 = this.field_z.a(this, -16164, this.field_t);
          if (var7 <= 0) {
            if (var5 != 0 &&
              this.c(param2, param0, 122) &&
              var6 == 0) {
              this.b(true, true);
            }
            return;
          }
          var6 = 1;
          this.b(true, true);
        } else {
          this.field_w = -54;
          if (param1) {
            if (0 > param0) {
              var5 = 1;
              this.field_u = this.field_u + param0;
            } else {
              if (0 < param0) {
                var5 = 1;
                this.field_u = this.field_u + param0;
              }
            }
            if (0 > param2) {
              this.field_K = this.field_K + param2;
              var5 = 1;
              var6 = 0;
              if (param1) {
                if (this.field_t.field_j == 3) {
                  this.field_z.a(param3 - 31, this.field_K, th.field_o, 2 * this.field_o, this.field_o * 2, this.field_u);
                }
                var7 = this.field_z.a(this, -16164, this.field_t);
                if (var7 > 0) {
                  var6 = 1;
                  this.b(true, true);
                }
                if (var5 != 0 &&
                  this.c(param2, param0, 122) &&
                  var6 == 0) {
                  this.b(true, true);
                }
                return;
              }
              if (this.field_t.field_j != 0) {
                if (this.field_t.field_j == 3) {
                  this.field_z.a(param3 - 31, this.field_K, th.field_o, 2 * this.field_o, this.field_o * 2, this.field_u);
                }
                var7 = this.field_z.a(this, -16164, this.field_t);
                if (var7 > 0) {
                  var6 = 1;
                  this.b(true, true);
                }
              }
              if (var5 != 0 &&
                this.c(param2, param0, 122) &&
                var6 == 0) {
                this.b(true, true);
              }
              return;
            }
            if (param2 > 0) {
              this.field_K = this.field_K + param2;
              var5 = 1;
            }
          }
          var6 = 0;
          if (param1) {
            if (this.field_t.field_j == 3) {
              this.field_z.a(param3 - 31, this.field_K, th.field_o, 2 * this.field_o, this.field_o * 2, this.field_u);
            }
            var7 = this.field_z.a(this, -16164, this.field_t);
            if (var7 > 0) {
              var6 = 1;
              this.b(true, true);
            }
          } else {
            if (this.field_t.field_j != 0) {
              if (this.field_t.field_j == 3) {
                this.field_z.a(param3 - 31, this.field_K, th.field_o, 2 * this.field_o, this.field_o * 2, this.field_u);
              }
              var7 = this.field_z.a(this, -16164, this.field_t);
              if (var7 > 0) {
                var6 = 1;
                this.b(true, true);
              }
            }
          }
        }
        if (var5 == 0) {
          return;
        }
        if (!this.c(param2, param0, 122)) {
          return;
        }
        if (var6 != 0) {
          return;
        }
        this.b(true, true);
    }

    final c d(boolean param0) {
        if (!param0) {
          return (c) null;
        }
        return (c) ((Object) new ep());
    }

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        if (!param0) {
          this.e((byte) -115);
          return 0;
        }
        return 0;
    }

    public final int b(int param0) {
        int var2 = -24 / ((param0 - 1) / 45);
        return 0;
    }

    final int l(int param0) {
        if (param0 != 5) {
          return 53;
        }
        return this.field_E;
    }

    public final int c(int param0) {
        if (param0 >= -11) {
          return 67;
        }
        return this.field_o;
    }

    public final int e(int param0) {
        if (param0 != 9648) {
          return -95;
        }
        return this.field_K;
    }

    private final boolean f(byte param0) {
        if (param0 >= -114) {
          this.c(false, false);
          if (!(this.field_t.field_g instanceof hca)) {
            return this.field_t.field_c instanceof hca ? true : false;
          }
          return true;
        }
        if (this.field_t.field_g instanceof hca) {
          return true;
        }
        if (!(this.field_t.field_c instanceof hca)) {
          return false;
        }
        return true;
    }

    private final void a(boolean param0, int param1) {
        if (param0) {
          if (this.field_t.field_j != 4) {
            if (this.field_t.field_j == 5) {
            }
          } else {
            if (this.field_z.b(param1 ^ 30097, 1048576, 0, this.field_K, this.field_u)) {
              this.h((byte) 100);
            }
          }
        }
        this.field_F = true;
        this.field_z.field_u.a((ffa) (this), (byte) 123);
        if (param1 == 0) {
          return;
        }
        this.field_m = 81;
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
          return false;
        }
        return this.field_F;
    }

    public static void j(int param0) {
        if (param0 > 95) {
          field_n = null;
          field_k = null;
          field_r = null;
          return;
        }
        ep.j(-85);
        field_n = null;
        field_k = null;
        field_r = null;
    }

    final void b(int param0, int param1, byte param2) {
        this.field_s = param0;
        this.field_y = param1;
        int var4 = 118 / ((-51 - param2) / 40);
        this.field_H = qva.a((byte) -29, param1, param0);
    }

    final void b(int param0, boolean param1) {
        this.field_p = param1 ? true : false;
        if (param0 != -1) {
          this.b(false);
        }
    }

    public final void a(int param0, int param1, int param2) {
        this.field_z.field_u.a((ffa) (this), (byte) 98);
        this.a(param1, param0, (byte) 114);
        this.g((byte) -99);
        this.field_t.field_g = null;
        if (param2 == 2) {
          this.field_z.field_u.b((ffa) (this), param2 + 7071);
          return;
        }
        this.d(107);
        this.field_z.field_u.b((ffa) (this), param2 + 7071);
    }

    final void a(int param0, la param1, int param2, int param3, int param4, int param5) {
        try {
          this.field_y = 0;
          this.field_E = param4;
          this.field_l = false;
          this.field_J = param0 * 2;
          this.field_H = 0;
          int var7_int = -121 / ((-17 - param3) / 49);
          this.field_p = false;
          this.field_B = false;
          this.field_v = 2 * param2;
          this.field_C = false;
          this.field_j = param5;
          this.field_w = 0;
          this.field_F = false;
          this.field_z = param1;
          this.field_i = -1;
          this.field_s = 0;
          this.field_x = 0;
          this.field_o = this.field_J;
          this.field_t = null;
          this.field_I = 0;
          this.field_q.b((byte) 93);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ep.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int b(boolean param0) {
        if (param0) {
          this.field_i = -106;
          return this.field_y;
        }
        return this.field_y;
    }

    final void a(int param0, up param1) {
        try {
          this.field_t = param1;
          if (param0 > -122) {
            this.field_u = -12;
          }
          this.field_I = 5;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ep.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param0 < 68) {
          this.field_s = -53;
          return false;
        }
        return false;
    }

    public final int b(byte param0) {
        int var2 = 40 % ((-23 - param0) / 53);
        return this.field_u;
    }

    final void a(boolean param0, boolean param1) {
        this.field_l = param1 ? true : false;
        if (!param0) {
          this.d(true);
        }
    }

    private final boolean c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param2 < 92) {
          return true;
        }
        if (this.field_C) {
          var4 = 3;
        } else {
          var4 = 1;
        }
        if (!this.field_p) {
          return this.field_z.a((ffa) (this), this.field_J, 2, var4, this.field_K, this.field_u, false, this.field_t.field_g, this.field_J);
        }
        return this.field_z.a((ffa) (this), this.field_t.field_g, var4, this.field_J, param0 / 4, 12, this.field_J, this.field_u, 1, param1 / 4, this.field_K, 0, false) != 0 ? true : false;
    }

    final int i(int param0) {
        if (param0 != -1) {
          this.field_q = (on) null;
          return this.field_o;
        }
        return this.field_o;
    }

    final void a(uw param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 5465) {
            this.a((byte) 21, true);
          }
          if (this.field_G >= 0) {
            param0.a((byte) -116, 7, (fo) (this));
          } else {
            param0.a((byte) -128, 2, (fo) (this));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ep.AA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final on c(boolean param0) {
        if (param0) {
          this.field_I = -9;
          return this.field_q;
        }
        return this.field_q;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
          this.field_q = (on) null;
        }
    }

    public final boolean a(int param0) {
        int var2 = 61 % ((param0 - 6) / 46);
        return false;
    }

    final void b(int param0, int param1, int param2) {
        this.field_w = param1;
        if (param0 != 7) {
          return;
        }
        this.field_H = param2;
    }

    public final boolean a(int param0, gma param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -77) {
            return false;
          }
          this.field_v = 120;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ep.OD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1) {
        int stackIn_81_0 = 0;
        int var3;
        int var5;
        int var6;
        int var7;
        hr var8;
        hr var10;
        hr var12;
        hr var13;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        this.g((byte) -99);
        this.field_q.a(param0 + 87);
        if (param1) {
          if (this.f((byte) -118)) {
            var3 = 1;
            this.field_H = this.field_H + this.field_w;
            if (var3 != 0) {
              this.field_x = this.field_x + 1;
              if (this.field_x >= this.field_j) {
                this.a(true, param0 + 1);
                if (this.field_F) {
                  return;
                }
              }
            }
            if (this.field_F) {
              if (!this.field_F) {
                this.field_z.field_u.a((ffa) (this), -66);
                this.field_z.field_u.b((ffa) (this), 7073);
              }
              if (!this.field_B ||
                this.field_s != 0 ||
                this.field_y != 0) {
                this.field_o = this.field_x * (-this.field_J + this.field_v) / this.field_j + this.field_J;
              }
              if (var3 != 0 &&
                this.field_i != -1) {
                var8 = this.field_z.a(this.field_u, this.field_K, (byte) 100, this.field_G);
                var5 = 131072;
                var6 = -(var5 / 2) + uca.field_c.a(var5, 0);
                var7 = uca.field_c.a(var5, ~param0) - var5 / 2;
                var8.a(false, 24, this.field_i, 4, 10 + uca.field_c.a(10, 0));
                var8.b(121, var7, var6);
                var8.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 - 84);
              }
            } else {
              if (this.field_C) {
                this.a(this.field_s, (byte) -127, this.field_y, var3 != 0);
              } else {
                this.a(this.field_s, var3 != 0, this.field_y, ~param0);
              }
              if (this.field_F) {
                if (!this.field_B ||
                  this.field_s != 0 ||
                  this.field_y != 0) {
                  this.field_o = this.field_x * (-this.field_J + this.field_v) / this.field_j + this.field_J;
                }
                if (var3 != 0 &&
                  this.field_i != -1) {
                  var10 = this.field_z.a(this.field_u, this.field_K, (byte) 100, this.field_G);
                  var5 = 131072;
                  var6 = -(var5 / 2) + uca.field_c.a(var5, 0);
                  var7 = uca.field_c.a(var5, ~param0) - var5 / 2;
                  var10.a(false, 24, this.field_i, 4, 10 + uca.field_c.a(10, 0));
                  var10.b(121, var7, var6);
                  var10.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 - 84);
                }
              } else {
                this.field_z.field_u.a((ffa) (this), -66);
                this.field_z.field_u.b((ffa) (this), 7073);
                if (!this.field_B ||
                  this.field_s != 0 ||
                  this.field_y != 0) {
                  this.field_o = this.field_x * (-this.field_J + this.field_v) / this.field_j + this.field_J;
                }
                if (var3 != 0 &&
                  this.field_i != -1) {
                  var12 = this.field_z.a(this.field_u, this.field_K, (byte) 100, this.field_G);
                  var5 = 131072;
                  var6 = -(var5 / 2) + uca.field_c.a(var5, 0);
                  var7 = uca.field_c.a(var5, ~param0) - var5 / 2;
                  var12.a(false, 24, this.field_i, 4, 10 + uca.field_c.a(10, 0));
                  var12.b(121, var7, var6);
                  var12.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 - 84);
                }
              }
            }
            if (this.field_u < 0) {
              this.field_F = true;
            } else {
              if (this.field_K < 0) {
                this.field_F = true;
              } else {
                if (this.field_u >= this.field_z.m((byte) -86)) {
                  this.field_F = true;
                } else {
                  if (this.field_K >= this.field_z.s(-121)) {
                    this.field_F = true;
                  }
                }
              }
            }
            if (param0 != -1) {
              this.field_t = (up) null;
            }
            return;
          }
          stackIn_81_0 = 0;
        } else {
          stackIn_81_0 = 1;
        }
        var3Lifetime1 = stackIn_81_0;
        this.field_H = this.field_H + this.field_w;
        if (var3Lifetime1 != 0) {
          this.field_x = this.field_x + 1;
          if (this.field_x >= this.field_j) {
            this.a(true, param0 + 1);
            if (this.field_F) {
              return;
            }
          }
        }
        if (!this.field_F) {
          if (this.field_C) {
            this.a(this.field_s, (byte) -127, this.field_y, var3Lifetime1 != 0);
          } else {
            this.a(this.field_s, var3Lifetime1 != 0, this.field_y, ~param0);
          }
        }
        if (!this.field_F) {
          this.field_z.field_u.a((ffa) (this), -66);
          this.field_z.field_u.b((ffa) (this), 7073);
        }
        if (!this.field_B ||
          this.field_s != 0 ||
          this.field_y != 0) {
          this.field_o = this.field_x * (-this.field_J + this.field_v) / this.field_j + this.field_J;
        }
        boolean decompiledFrameRemainder0 = true;
        if (var3Lifetime1 != 0) {
          if (this.field_i == -1) {
            if (this.field_u >= 0 &&
              this.field_K >= 0 &&
              this.field_u < this.field_z.m((byte) -86)) {
              if (!(this.field_K < this.field_z.s(-121))) {
                this.field_F = true;
                if (param0 != -1) {
                  this.field_t = (up) null;
                }
                return;
              }
            } else {
              this.field_F = true;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            var13 = this.field_z.a(this.field_u, this.field_K, (byte) 100, this.field_G);
            var5Lifetime1 = 131072;
            var6Lifetime1 = -(var5Lifetime1 / 2) + uca.field_c.a(var5Lifetime1, 0);
            var7Lifetime1 = uca.field_c.a(var5Lifetime1, ~param0) - var5Lifetime1 / 2;
            var13.a(false, 24, this.field_i, 4, 10 + uca.field_c.a(10, 0));
            var13.b(121, var7Lifetime1, var6Lifetime1);
            var13.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 - 84);
          }
        }
        if (decompiledFrameRemainder0) {
          if (this.field_u < 0) {
            this.field_F = true;
          } else {
            if (this.field_K < 0) {
              this.field_F = true;
            } else {
              if (this.field_u >= this.field_z.m((byte) -86)) {
                this.field_F = true;
              } else {
                if (this.field_K >= this.field_z.s(-121)) {
                  this.field_F = true;
                }
              }
            }
          }
        }
        if (param0 == -1) {
          return;
        }
        this.field_t = (up) null;
    }

    public final boolean a(gma param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            return false;
          }
          field_r = (jea) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ep.OA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
          this.field_q = (on) null;
          return this.field_K;
        }
        return this.field_K;
    }

    public final int a(up param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (!io.a(param1, this.field_K, (byte) -90, param5, this.field_u, param4, this.field_o, this.field_o, param2)) {
            stackIn_6_0 = 0;
            return stackIn_6_0;
          }
          if (param3 != 0) {
            this.field_m = -65;
          }
          stackIn_10_0 = this.b(109, param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_13_0 = var7;
          stackIn_13_1 = new StringBuilder().append("ep.WC(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final int a(up param0, ep param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -97) {
            this.field_B = false;
          }
          stackIn_3_0 = this.a(param0, param1.field_o, param1.field_u, 0, param1.field_K, param1.field_o);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ep.SD(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0, iq param1) {
        try {
          dea.field_a.a(param1, false, this);
          if (param0 < 103) {
            ffa var4 = (ffa) null;
            this.a(40, (gma) null, -76, 70, -19, (ffa) null, -19, 65);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ep.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(up param0, int param1, pc param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (eha.a(this.field_o, param1, this.field_K, this.field_o, param2, this.field_u, 2) >= 0) {
            stackIn_7_0 = this.b(115, param0);
            return stackIn_7_0;
          }
          stackIn_5_0 = 0;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ep.ED(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int a(int param0, byte param1) {
        param0 = fs.a((byte) 88, param0, this.field_u);
        param0 = fs.a((byte) 30, param0, this.field_K);
        if (param1 == -39) {
          param0 = fs.a((byte) 32, param0, this.field_s);
          param0 = fs.a((byte) 120, param0, this.field_y);
          param0 = fs.a((byte) 58, param0, this.field_v);
          param0 = fs.a((byte) 85, param0, this.field_H);
          return param0;
        }
        boolean discarded$0 = this.f((byte) 2);
        param0 = fs.a((byte) 32, param0, this.field_s);
        param0 = fs.a((byte) 120, param0, this.field_y);
        param0 = fs.a((byte) 58, param0, this.field_v);
        param0 = fs.a((byte) 85, param0, this.field_H);
        return param0;
    }

    public final int a(boolean param0) {
        if (param0) {
          return 7 + 7 * this.field_D;
        }
        up var3 = (up) null;
        this.a(-80, (up) null);
        return 7 + 7 * this.field_D;
    }

    final int e(boolean param0) {
        if (param0) {
          this.c((byte) 40);
          return this.field_j;
        }
        return this.field_j;
    }

    public final boolean a(int param0, gma param1, int param2, int param3, int param4, ffa param5, int param6, int param7) {
        RuntimeException var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= 55) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_7_0 = var9;
          stackIn_7_1 = new StringBuilder().append("ep.IC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final void g(byte param0) {
        if (param0 != -99) {
          this.field_y = 18;
        }
    }

    ep() {
        this.field_i = -1;
        this.field_q = new on();
        int fieldTemp$0 = sd.field_G;
        sd.field_G = sd.field_G + 1;
        this.field_D = fieldTemp$0;
    }

    static {
    }
}
