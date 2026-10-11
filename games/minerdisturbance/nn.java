/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    int field_e;
    private int field_j;
    boolean field_d;
    int field_i;
    private int field_p;
    private int field_o;
    static ag field_f;
    private int field_b;
    static char field_l;
    static int field_k;
    static ea field_c;
    private int field_g;
    static boolean field_n;
    static r field_r;
    static ae field_m;
    static boolean field_q;
    static ea[] field_h;
    static String field_a;

    final boolean b(int param0) {
        if (param0 <= -16) {
          return 102 == this.field_g ? true : false;
        }
        this.d(89);
        return 102 == this.field_g ? true : false;
    }

    final static java.net.URL a(int param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          var4 = null;
          if (nj.field_a != null &&
            !nj.field_a.equals(param1.getParameter("settings"))) {
            var3 = nj.field_a;
            var4 = var3;
            var4 = var3;
          }
          if (param0 < 83) {
            field_n = true;
          }
          if (null != w.field_T &&
            !w.field_T.equals(param1.getParameter("session"))) {
            var4 = w.field_T;
          }
          stackIn_9_0 = mj.a((String) (var4), -1, false, (String) (var3), param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("nn.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw lj.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.a(param0, param3, gb.field_e, param4, param1, 113, nk.field_w);
        int var7 = this.a(param0, param3, m.field_e, param4, param1, 50, wi.field_w);
        this.a(var6, var7, -1);
        if (param2 == 140) {
          return;
        }
        this.e((byte) -78);
    }

    public static void a(boolean param0) {
        field_f = null;
        field_c = null;
        field_h = null;
        field_a = null;
        field_m = null;
        if (param0) {
          field_r = null;
          return;
        }
        java.net.URL var2 = (java.net.URL) null;
        nn.a(-84, (java.applet.Applet) null, (java.net.URL) null);
        field_r = null;
    }

    final boolean e(byte param0) {
        if (param0 >= 124) {
          return this.field_g == 97 ? true : false;
        }
        java.net.URL var3 = (java.net.URL) null;
        nn.a(-85, (java.applet.Applet) null, (java.net.URL) null);
        return this.field_g == 97 ? true : false;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        this.field_p = param0;
        this.field_d = param3 ? true : false;
        if (!this.field_d) {
          this.field_e = param1;
          return;
        }
        this.field_e = param2;
    }

    final void a(int param0, int param1) {
        if (this.field_p == param1) {
          this.field_e = param0;
          this.field_d = false;
        }
    }

    final boolean a(byte param0) {
        int var2 = 77 / ((75 - param0) / 33);
        if (this.field_j != 0) {
          return true;
        }
        if (84 == this.field_g) {
          return true;
        }
        if (this.field_g != 83) {
          return false;
        }
        return true;
    }

    final void a(boolean param0, int param1, int param2) {
        this.field_d = param0 ? true : false;
        this.field_p = 0;
        if (this.field_d) {
          this.field_e = param1;
          if (param2 < 82) {
            this.field_p = 102;
            return;
          }
          return;
        }
        if (param2 >= 82) {
          return;
        }
        this.field_p = 102;
    }

    final boolean b(boolean param0) {
        if (!param0) {
          this.b(12);
          if (this.field_o != 0) {
            return true;
          }
          if (this.field_g != 84) {
            return this.field_g == 83 ? true : false;
          }
          return true;
        }
        if (this.field_o != 0) {
          return true;
        }
        if (this.field_g == 84) {
          return true;
        }
        if (this.field_g != 83) {
          return false;
        }
        return true;
    }

    final void d(int param0) {
        this.field_o = 0;
        this.field_g = 0;
        this.field_j = 0;
        if (this.field_p == 0 &&
          lj.field_t == 96) {
          if (this.field_e <= 0) {
            this.field_e = this.field_i;
          }
          this.field_e = this.field_e - 1;
          this.field_d = false;
        }
        if (0 == this.field_p) {
          this.field_g = lj.field_t;
        }
        if (this.field_p == 0 &&
          lj.field_t == 97) {
          this.field_e = this.field_e + 1;
          if (this.field_i <= this.field_e) {
            this.field_e = 0;
          }
          this.field_d = false;
        }
        if (param0 == -4664) {
          return;
        }
        this.b(90);
    }

    final boolean c(int param0) {
        int var2 = 117 / ((param0 - 42) / 55);
        return this.field_g == 103 ? true : false;
    }

    final boolean a(int param0) {
        int var2 = 43 / ((4 - param0) / 55);
        return this.field_g == 96 ? true : false;
    }

    final void b(byte param0) {
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime2Lifetime1;
        this.field_o = 0;
        this.field_g = 0;
        this.field_j = 0;
        if (0 != this.field_p) {
          if (0 == this.field_p) {
            this.field_g = lj.field_t;
          }
          var2 = 91 % ((param0 - 33) / 54);
          if (this.field_p != 0) {
            return;
          }
          if (lj.field_t != 99) {
            return;
          }
          this.field_e = this.field_e + 1;
          this.field_d = false;
          if (this.field_i > this.field_e) {
            return;
          }
          this.field_e = 0;
          return;
        }
        if (lj.field_t != 98) {
          if (0 == this.field_p) {
            this.field_g = lj.field_t;
          }
          var2Lifetime1 = 91 % ((param0 - 33) / 54);
          if (this.field_p != 0) {
            return;
          }
          if (lj.field_t != 99) {
            return;
          }
          this.field_e = this.field_e + 1;
          this.field_d = false;
          if (this.field_i > this.field_e) {
            return;
          }
          this.field_e = 0;
          return;
        }
        if (this.field_e <= 0) {
          this.field_e = this.field_i;
          this.field_d = false;
          this.field_e = this.field_e - 1;
          if (0 != this.field_p) {
            var2Lifetime2 = 91 % ((param0 - 33) / 54);
            if (this.field_p == 0 &&
              lj.field_t == 99) {
              this.field_e = this.field_e + 1;
              this.field_d = false;
              if (this.field_i > this.field_e) {
                return;
              }
              this.field_e = 0;
            }
            return;
          }
          this.field_g = lj.field_t;
          var2Lifetime2Lifetime1 = 91 % ((param0 - 33) / 54);
          if (this.field_p != 0) {
            return;
          }
          if (lj.field_t == 99) {
            this.field_e = this.field_e + 1;
            this.field_d = false;
            if (this.field_i > this.field_e) {
              return;
            }
            this.field_e = 0;
          }
          return;
        }
        this.field_d = false;
        this.field_e = this.field_e - 1;
        if (0 != this.field_p) {
          var2Lifetime3 = 91 % ((param0 - 33) / 54);
          if (this.field_p != 0) {
            return;
          }
          if (lj.field_t != 99) {
            return;
          }
          this.field_e = this.field_e + 1;
          this.field_d = false;
          if (this.field_i > this.field_e) {
            return;
          }
          this.field_e = 0;
          return;
        }
        this.field_g = lj.field_t;
        var2Lifetime4 = 91 % ((param0 - 33) / 54);
        if (this.field_p != 0) {
          return;
        }
        if (lj.field_t != 99) {
          return;
        }
        this.field_e = this.field_e + 1;
        this.field_d = false;
        if (this.field_i <= this.field_e) {
          this.field_e = 0;
        }
    }

    final boolean d(byte param0) {
        if (param0 == 77) {
          return 0 != this.field_p ? true : false;
        }
        this.c((byte) -76);
        return 0 != this.field_p ? true : false;
    }

    nn(int param0) {
        this.field_e = 0;
        this.field_d = false;
        this.field_i = param0;
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 >= param4 &&
          param3 > param6 &&
          param0 <= param2 &&
          param0 + param1 * this.field_i > param2) {
          return (param2 - param0) / param1;
        }
        if (param5 >= 34) {
          return -1;
        }
        this.a(-46, 20, -121, 53, 72);
        return -1;
    }

    final void c(byte param0) {
        this.field_o = 0;
        this.field_g = 0;
        this.field_j = 0;
        if (param0 <= 80) {
          this.a(false, 50, -65);
          if (this.field_p == 0) {
            this.field_g = lj.field_t;
            return;
          }
          return;
        }
        if (this.field_p != 0) {
          return;
        }
        this.field_g = lj.field_t;
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_i <= param0) {
          throw new IllegalArgumentException();
        }
        if (param1 >= this.field_i) {
          throw new IllegalArgumentException();
        }
        this.field_j = 0;
        this.field_g = 0;
        this.field_o = 0;
        if (0 != jk.field_ab) {
          this.field_b = q.field_d;
          this.field_d = true;
          this.field_j = jk.field_ab;
          this.field_o = jk.field_ab;
          this.field_e = param1;
          this.field_p = jk.field_ab;
        }
        if (this.field_p == 0) {
          boolean decompiledFrameRemainder0 = true;
          if (0 == jk.field_ab) {
            if (ld.field_B != 0) {
              if (param2 != ~this.field_p) {
                return;
              }
              if (!this.field_d &&
                !k.field_i) {
                return;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_p = 0;
            }
          }
          if (decompiledFrameRemainder0) {
            if (param2 != ~this.field_p) {
              return;
            }
            if (this.field_d) {
              if (0 > param0) {
                if (!this.field_d) {
                  return;
                }
                this.field_e = -1;
                return;
              }
              if (param0 == this.field_e) {
              }
              this.field_e = param0;
              this.field_d = true;
              return;
            }
            if (!k.field_i) {
              return;
            }
          }
        } else {
          if (ld.field_B == 0) {
            if (0 == jk.field_ab &&
              ld.field_B == 0) {
              this.field_p = 0;
            }
            if (param2 != ~this.field_p) {
              return;
            }
            if (!this.field_d &&
              !k.field_i) {
              return;
            }
            if (0 > param0) {
              if (!this.field_d) {
                return;
              }
              this.field_e = -1;
              return;
            }
            if (param0 == this.field_e) {
            }
            this.field_e = param0;
            this.field_d = true;
            return;
          }
          if (this.field_b <= 0) {
            this.field_j = this.field_p;
            this.field_b = bi.field_q;
            this.field_b = this.field_b - 1;
            if (0 == jk.field_ab &&
              ld.field_B == 0) {
              this.field_p = 0;
            }
            if (param2 != ~this.field_p) {
              return;
            }
            if (!this.field_d &&
              !k.field_i) {
              return;
            }
            if (0 > param0) {
              if (!this.field_d) {
                return;
              }
              this.field_e = -1;
              return;
            }
            if (param0 == this.field_e) {
            }
            this.field_e = param0;
            this.field_d = true;
            return;
          }
          this.field_b = this.field_b - 1;
          if (0 == jk.field_ab &&
            ld.field_B == 0) {
            this.field_p = 0;
          }
          if (param2 != ~this.field_p) {
            return;
          }
          if (!this.field_d &&
            !k.field_i) {
            return;
          }
        }
        if (0 > param0) {
          if (this.field_d) {
            this.field_e = -1;
          }
        } else {
          if (param0 == this.field_e) {
          }
          this.field_e = param0;
          this.field_d = true;
        }
    }

    static {
        field_f = new ag();
        field_l = ',';
        field_k = 5;
        field_c = new ea(540, 140);
        field_r = new r();
        field_m = new ae();
        field_h = new ea[2];
        field_a = "<%0> <times> 1,000 = <%1>";
    }
}
