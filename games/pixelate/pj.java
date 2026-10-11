/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static tf field_a;
    private int field_h;
    private tf field_e;
    static ak field_i;
    boolean field_f;
    private int field_b;
    private int field_g;
    private int field_d;
    private int field_j;
    private int field_c;

    final static void a(byte param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 <= 87) {
            field_i = (ak) null;
          }
          if (param1 ||
            io.field_c == null) {
            bm.field_o = false;
          }
          if (param1) {
            if (0 < oo.field_b) {
              oo.field_b = oo.field_b - 1;
              return;
            }
            if (vn.field_g > 0) {
              vn.field_g = vn.field_g - 1;
              return;
            }
            if (0 >= h.field_W) {
              return;
            }
            h.field_W = h.field_W - 1;
            return;
          }
          if (io.field_c != null) {
            if (0 < oo.field_b) {
              oo.field_b = oo.field_b - 1;
              return;
            }
            if (vn.field_g > 0) {
              vn.field_g = vn.field_g - 1;
              return;
            }
            if (qh.field_c <= h.field_W) {
              return;
            }
            if (0 == h.field_W) {
              nl.a(false, -102);
            }
            h.field_W = h.field_W + 1;
            return;
          }
          if (null != bn.field_S) {
            if (oo.field_b > 0) {
              oo.field_b = oo.field_b - 1;
              return;
            }
            if (h.field_W > 0) {
              h.field_W = h.field_W - 1;
              return;
            }
            if (vn.field_g >= qh.field_c) {
              return;
            }
            if (vn.field_g == 0) {
              nl.a(true, -71);
            }
            vn.field_g = vn.field_g + 1;
            return;
          }
          bm.field_o = false;
          if (vn.field_g > 0) {
            vn.field_g = vn.field_g - 1;
            return;
          }
          if (h.field_W > 0) {
            h.field_W = h.field_W - 1;
            return;
          }
          if (qh.field_c <= oo.field_b) {
            return;
          }
          if (oo.field_b == 0) {
            gd.a((byte) -7);
          }
          oo.field_b = oo.field_b + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "pj.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(String param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_h = 0;
          this.field_c = param1;
          if (param2 != -1379417087) {
            this.field_b = -57;
          }
          this.field_g = 0;
          this.field_d = param3;
          this.field_f = false;
          this.field_j = 0;
          var5_int = rk.field_e.c(param0);
          if (var5_int > this.field_e.field_A) {
            this.field_e = new tf(10 + var5_int, this.field_e.field_B);
          }
          this.field_e.c();
          t.d();
          rk.field_e.b(param0, this.field_e.field_A >> 1, this.field_e.field_B, 0, -1);
          qa.field_f.a(19692);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("pj.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2, byte param3) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param3 <= 19) {
            field_a = (tf) null;
          }
          if (t.field_d >= param1 + param2 + param0) {
            stackIn_4_0 = param1 + param2;
            return stackIn_4_0;
          }
          if (0 <= -param0 + param1) {
            stackIn_9_0 = -param0 + param1;
            return stackIn_9_0;
          }
          stackIn_11_0 = t.field_d - param0;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "pj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 > -22) {
            this.field_j = -90;
          }
          if (this.field_f) {
            return;
          }
          if (this.field_h < 8) {
            this.field_e.d(-(this.field_j >> 1) + this.field_c, -(this.field_g >> 1) + this.field_d, this.field_j, this.field_g);
            return;
          }
          if (66 > this.field_h) {
            this.field_e.b(this.field_c - (this.field_e.field_A >> 1), this.field_d - (this.field_e.field_B >> 1));
            return;
          }
          if (0 >= this.field_b) {
            return;
          }
          this.field_e.c(this.field_c - (this.field_j >> 1), -(this.field_g >> 1) + this.field_d, this.field_j, this.field_g, this.field_b);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "pj.A(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          if (this.field_f) {
            return;
          }
          this.field_h = this.field_h + 1;
          if (this.field_h < 8) {
            this.field_g = this.field_h * this.field_e.field_B / 8;
            this.field_j = this.field_h * this.field_e.field_A / 8;
          } else {
            if (66 <= this.field_h) {
              if (this.field_h >= 76) {
                this.field_f = true;
              } else {
                var2_int = -58 + (-8 + this.field_h);
                this.field_g = this.field_e.field_B;
                this.field_j = (var2_int << 4) + this.field_e.field_A;
                this.field_b = (10 - var2_int) * 256 / 10;
              }
            }
          }
          if (param0 <= -55) {
            return;
          }
          pj.a(31, 2, 48, (byte) 8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "pj.D(" + param0 + ')');
        }
    }

    pj() {
        this.field_h = 0;
        this.field_e = new tf(320, 21);
        this.field_f = true;
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        try {
          field_a = null;
          field_i = null;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "pj.E(" + param0 + ')');
        }
    }

    static {
    }
}
