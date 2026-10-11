/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends ca {
    private int field_i;
    private int field_n;
    private int field_h;
    static String field_o;
    private int field_f;
    private lb field_s;
    private int field_m;
    private boolean field_p;
    int field_g;
    private int field_k;
    private int field_l;
    static dh field_q;
    static fk field_j;
    static im field_r;

    final void a(byte param0) {
        if (0 > this.field_g) {
          if (param0 == 44) {
            if (this.field_p) {
              this.field_g = this.field_g + 2;
            }
            this.field_g = this.field_g + 1;
            if (this.field_g == 100 &&
              !this.field_p) {
              this.field_s.a((byte) -6, this.field_i);
            }
            return;
          }
          this.field_f = -103;
          if (this.field_p) {
            this.field_g = this.field_g + 2;
          }
        } else {
          this.field_f = this.field_f + this.field_l;
          this.field_k = this.field_k + this.field_h;
          if (this.field_k > 1600) {
            this.field_h = this.field_h - 1;
            this.field_l = this.field_l + 1;
            if (param0 == 44) {
              if (this.field_p) {
                this.field_g = this.field_g + 2;
              }
              this.field_g = this.field_g + 1;
              if (this.field_g == 100) {
                if (this.field_p) {
                  return;
                }
                this.field_s.a((byte) -6, this.field_i);
              }
              return;
            }
            this.field_f = -103;
            if (this.field_p) {
              this.field_g = this.field_g + 2;
              this.field_g = this.field_g + 1;
              if (this.field_g != 100) {
                return;
              }
              if (!this.field_p) {
                this.field_s.a((byte) -6, this.field_i);
              }
              return;
            }
          } else {
            this.field_h = this.field_h + 1;
            this.field_l = this.field_l + 1;
            if (param0 != 44) {
              this.field_f = -103;
            }
            if (this.field_p) {
              this.field_g = this.field_g + 2;
            }
          }
        }
        this.field_g = this.field_g + 1;
        if (this.field_g != 100) {
          return;
        }
        if (this.field_p) {
          return;
        }
        this.field_s.a((byte) -6, this.field_i);
    }

    final static int a(byte param0, int param1) {
        int var2Lifetime1;
        if (param0 != 47) {
          return 15;
        }
        int var2 = 1;
        if (param1 == 1) {
          var2 = 2;
          if (param1 == 4) {
            var2 = 3;
          }
          return var2;
        }
        if (param1 == 2) {
          var2 = 2;
          if (param1 == 4) {
            var2 = 3;
          }
          return var2;
        }
        if (param1 != 5) {
          if (param1 == 4) {
            var2 = 3;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (param1 == 4) {
          var2Lifetime1 = 3;
        }
        return var2Lifetime1;
    }

    final static boolean a(ti param0, int param1, ti param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          var3_int = param0.field_ab - param2.field_ab;
          if (param1 != 100) {
            return true;
          }
          if (param0.field_Z == uc.field_r) {
            var3_int -= 200;
          } else {
            if (null == param0.field_Z) {
              var3_int += 200;
            }
          }
          if (param2.field_Z != uc.field_r) {
            if (param2.field_Z == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("oj.C(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var11 = OrbDefence.field_D ? 1 : 0;
        int var4 = -param1 + ((this.field_f >> 4) + 320);
        int var5 = 240 + ((this.field_k >> 4) - param2);
        if (this.field_p) {
          var4 = (this.field_f >> 4) + 363;
          var5 = 24 + (this.field_k >> 4);
        }
        int var6 = 255;
        if (param0 != 54) {
          this.a((byte) 2, -56, 109);
        }
        int var7 = this.field_i + 3 << 4;
        int var8 = this.field_g;
        int var9 = 363;
        int var10 = 24;
        if (this.field_p) {
          var9 = -param1 + (this.field_n >> 4) + 320;
          var10 = (this.field_m >> 4) - param2 + 240;
        }
        if (100 < var8) {
          var5 = var10;
          var4 = var9;
          if (this.field_p) {
            return;
          }
          var6 = 200 - var8;
          var7 = 320;
          if (var8 >= 0) {
            ul.a(var4 << 4, var5 << 4, var7, var6, ki.field_f);
          } else {
            if (this.field_p) {
              ul.a(5808, 384, 320, 200, em.field_s);
              return;
            }
            return;
          }
          return;
        }
        if (0 > var8) {
          if (var8 >= 0) {
            ul.a(var4 << 4, var5 << 4, var7, var6, ki.field_f);
          } else {
            if (this.field_p) {
              ul.a(5808, 384, 320, 200, em.field_s);
              return;
            }
            return;
          }
          return;
        }
        var4 = (var8 * var9 + var4 * (-var8 + 100)) / 100;
        var5 = (var8 * var10 + var5 * (-var8 + 100)) / 100;
        if (var8 >= 0) {
          ul.a(var4 << 4, var5 << 4, var7, var6, ki.field_f);
        } else {
          if (this.field_p) {
            ul.a(5808, 384, 320, 200, em.field_s);
            return;
          }
          return;
        }
    }

    oj(int param0, int param1, lb param2, int param3) {
        try {
          this.field_k = param1 * ol.field_e << 4;
          this.field_f = ol.field_e * param0 << 4;
          this.field_l = (int)(-80.0 + Math.random() * 161.0);
          this.field_h = (int)(Math.random() * 161.0 - 80.0);
          this.field_i = 1;
          this.field_g = -param3;
          this.field_s = param2;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "oj.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void c(int param0) {
        field_o = null;
        field_j = null;
        if (param0 == 384) {
          field_q = null;
          field_r = null;
          return;
        }
        oj.c(100);
        field_q = null;
        field_r = null;
    }

    oj(int param0, int param1, lb param2, int param3, int param4) {
        try {
          this.field_k = param1 * ol.field_e << 4;
          this.field_f = param0 * ol.field_e << 4;
          this.field_l = (int)(-80.0 + Math.random() * 161.0);
          this.field_h = (int)(-80.0 + Math.random() * 161.0);
          this.field_g = -param3;
          this.field_s = param2;
          this.field_i = param4;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "oj.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_o = "BIG SHOT";
        field_j = new fk(2);
        field_r = new im();
    }
}
