/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    private int field_t;
    private int field_u;
    private int field_s;
    private int field_r;
    private int field_x;
    private int field_y;
    private int field_z;
    private String field_c;
    static String field_j;
    private int field_i;
    private vm field_a;
    private String[] field_d;
    private int field_b;
    static String field_l;
    private String field_o;
    private int field_m;
    private int field_q;
    static String field_p;
    static bd field_v;
    private int field_e;
    static int field_h;
    private int field_n;
    boolean field_g;
    private int field_f;
    private int field_k;
    static String field_w;

    final boolean b(byte param0) {
        if (param0 != -66) {
          return false;
        }
        return this.field_z == 0 ? true : false;
    }

    final void a(int param0) {
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 <= 39) {
          return;
        }
        if (bm.field_c == 0) {
          uf.field_i[4].b(0, 0, this.field_y);
          this.b(-7068);
          if (0 <= this.field_z) {
            si.a(0, 0, 640, 480, 0, 256 - this.field_z * 4);
            return;
          }
          return;
        }
        vg.field_c.a(0, 0, this.field_y / 2);
        if (0 > this.field_z) {
          this.b(-7068);
          return;
        }
        int var2 = -(736 * this.field_z / 50) + 480;
        int var3 = 256 + var2;
        if (var2 > 0) {
          si.c(0, 0, 640, var2, 0);
        }
        if (var3 > 0) {
          hj.a(0, var2, 0, 256, -var2 + var3, 32101, 640);
          return;
        }
    }

    final void a(byte param0) {
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if ((em.field_c & 7) == 0) {
          if (this.field_y < 256) {
            this.field_y = this.field_y + 1;
          }
          if (this.field_u < 256) {
            this.field_u = this.field_u + 1;
          }
        }
        if (this.field_z > 0) {
          this.field_z = this.field_z - 1;
        }
        if (param0 >= -113) {
          return;
        }
        if (this.field_s <= this.field_n) {
          return;
        }
        if (this.field_r > 0) {
          this.field_r = this.field_r - 1;
          return;
        }
        if (this.field_b >= 0) {
          this.field_b = this.field_b + 1;
          if (this.field_b != this.field_m) {
            return;
          }
          this.field_n = this.field_n + 1;
          this.field_b = -1;
          this.field_i = 0;
          return;
        }
        if (em.field_c % this.field_t != 0) {
          return;
        }
        this.field_i = this.field_i + 1;
        if (0 < this.field_i &&
          this.field_d[this.field_n].charAt(this.field_i - 1) == 46) {
          if (this.field_g) {
            this.field_r = 40;
          } else {
            if (this.field_i < 2 ||
              this.field_d[this.field_n].charAt(this.field_i - 2) != 46) {
              if (this.field_i >= this.field_d[this.field_n].length()) {
                this.field_r = 40;
              } else {
                if (this.field_d[this.field_n].charAt(this.field_i) != 46) {
                  this.field_r = 40;
                }
              }
            }
          }
        }
        if (this.field_i >= this.field_d[this.field_n].length()) {
          if (this.field_i < this.field_d[this.field_n].length()) {
            return;
          }
          this.field_b = 0;
          return;
        }
        if (this.field_d[this.field_n].charAt(this.field_i) != 60) {
          if (this.field_i < this.field_d[this.field_n].length()) {
            return;
          }
          this.field_b = 0;
          return;
        }
        while (true) {
          if (this.field_i >= this.field_d[this.field_n].length()) {
            if (this.field_i < this.field_d[this.field_n].length()) {
              return;
            }
            this.field_b = 0;
            return;
          }
          if (this.field_d[this.field_n].charAt(this.field_i) != 62) {
            this.field_i = this.field_i + 1;
            continue;
          }
          break;
        }
        if (this.field_i < this.field_d[this.field_n].length()) {
          return;
        }
        this.field_b = 0;
        return;
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = v.a(-18214, '_', "", param1);
          if (param0) {
            field_l = (String) null;
          }
          var3 = ia.a(param1, -90);
          stackIn_7_0 = (param2.indexOf(param1) != -1) || (param2.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("eg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_l = null;
        if (param0 == -1) {
          field_v = null;
          field_j = null;
          field_w = null;
          field_p = null;
          return;
        }
        field_p = (String) null;
        field_v = null;
        field_j = null;
        field_w = null;
        field_p = null;
    }

    final void a(String param0, byte param1) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = null;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var3_int = 75 % ((43 - param1) / 48);
          while (true) {
            try {
              this.field_s = this.field_a.a(param0.toUpperCase(), new int[]{500}, this.field_d);
            } catch (java.lang.ArrayIndexOutOfBoundsException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              arrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) (Object) decompiledCaughtException;
              this.field_s = -1;
              this.field_d = new String[2 * this.field_d.length];
            }
            if (-1 == this.field_s) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("eg.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void d(int param0) {
        if (param0 == -868) {
          if (0 > this.field_z) {
            this.field_z = 50;
          }
          return;
        }
        this.field_z = -20;
        if (0 > this.field_z) {
          this.field_z = 50;
        }
    }

    private final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = this.field_q - (this.field_b + this.field_n * this.field_m);
        for (var3 = 0; this.field_n > var3; var3++) {
          this.field_a.c(this.field_d[var3], this.field_e, var2, this.field_x, this.field_k);
          var2 = var2 + this.field_m;
        }
        if (this.field_n >= this.field_s) {
          if (param0 != -7068) {
            return;
          }
          var3Lifetime1 = 0;
          if (this.field_n != this.field_s) {
            if (this.field_z >= 0) {
              return;
            }
            if (var3Lifetime1 != 0) {
              this.field_a.b(this.field_o, 320, this.field_q + this.field_m * 2, 16776960, -1);
            } else {
              this.field_a.a(this.field_c, 320, 2 * this.field_m + this.field_q, 8421504, -1, this.field_u);
            }
            return;
          }
          if (0 < this.field_f) {
            this.field_f = this.field_f - 1;
          } else {
            if (this.field_o != null) {
              var3Lifetime1 = 1;
            }
          }
        } else {
          if (this.field_i > 0) {
            this.field_a.c(this.field_d[this.field_n].substring(0, this.field_i), this.field_e, var2, this.field_x, this.field_k);
            if (param0 != -7068) {
              return;
            }
            var3Lifetime1 = 0;
            if (this.field_n == this.field_s) {
              if (0 < this.field_f) {
                this.field_f = this.field_f - 1;
              } else {
                if (this.field_o != null) {
                  var3Lifetime1 = 1;
                }
              }
            }
          } else {
            if (param0 != -7068) {
              return;
            }
            var3Lifetime1 = 0;
            if (this.field_n != this.field_s) {
              if (this.field_z >= 0) {
                return;
              }
              if (var3Lifetime1 != 0) {
                this.field_a.b(this.field_o, 320, this.field_q + this.field_m * 2, 16776960, -1);
              } else {
                this.field_a.a(this.field_c, 320, 2 * this.field_m + this.field_q, 8421504, -1, this.field_u);
              }
              return;
            }
            if (0 < this.field_f) {
              this.field_f = this.field_f - 1;
            } else {
              if (this.field_o != null) {
                var3Lifetime1 = 1;
              }
            }
          }
        }
        if (this.field_z < 0) {
          if (var3Lifetime1 != 0) {
            this.field_a.b(this.field_o, 320, this.field_q + this.field_m * 2, 16776960, -1);
          } else {
            this.field_a.a(this.field_c, 320, 2 * this.field_m + this.field_q, 8421504, -1, this.field_u);
          }
        }
    }

    eg() {
        this.field_r = 0;
        this.field_u = 0;
        this.field_i = 0;
        this.field_y = 0;
        this.field_t = 4;
        this.field_c = jd.field_x;
        this.field_d = new String[32];
        this.field_a = (vm) ((Object) al.field_Z);
        this.field_x = 13684944;
        this.field_b = -1;
        this.field_z = -1;
        this.field_o = lb.field_c;
        this.field_e = 70;
        this.field_m = 18;
        this.field_q = 400;
        this.field_n = 0;
        this.field_f = 50;
        this.field_g = true;
        this.field_k = -1;
    }

    static {
        field_j = "Vengeance Expansion Installed";
        field_l = "I should be able to make my way around the blockage via this vent.";
        field_h = 2;
        field_p = "Why is there always a crate blocking the way I want to go?";
    }
}
