/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uh extends lk {
    hl field_s;
    int field_u;
    private ih field_t;
    private int field_w;
    hl field_A;
    private int[] field_r;
    private ih field_m;
    private int field_x;
    private ih field_B;
    private int[] field_y;
    private hl field_z;
    static java.util.zip.CRC32 field_v;
    private boolean field_o;
    private int field_q;
    private boolean field_p;
    static dg field_l;
    static int field_D;
    static uh field_n;
    static int[] field_C;

    final synchronized void a(byte param0, int param1, ih param2, int param3) {
        try {
          this.a(256, param3, false, param2, param1, (byte) 91);
          int var5_int = 83 / ((param0 + 55) / 51);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "uh.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(hl param0, byte param1, hl param2) {
        if (param1 >= -66) {
          return;
        }
        try {
          this.field_A = param0;
          this.field_w = 1048576;
          this.field_s = param2;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "uh.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, hl param3) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          param3.a(-1, param2, false);
          if (param0 > -88) {
            this.field_o = true;
            param3.b(-180, param1);
          } else {
            param3.b(-180, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("uh.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(sj param0, byte param1, int param2) {
        th var3 = null;
        if (param1 > -91) {
          return;
        }
        try {
          var3 = ed.field_q;
          var3.h(param2, 0);
          var3.c(5, -1);
          var3.c(0, -1);
          var3.e(91, param0.field_h);
          var3.c(param0.field_o, -1);
          var3.c(param0.field_m, -1);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "uh.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (0 >= this.field_w) {
          if (1048576 > this.field_w &&
            this.field_t != null) {
            this.field_s.a(param0);
          }
          if (this.field_q > 0 &&
            this.field_m != null) {
            this.field_z.a(param0);
          }
          if (this.field_p) {
            if (this.field_x > 0 &&
              !this.field_A.a((byte) -32)) {
              this.field_x = -this.field_x;
              this.field_B = null;
              this.field_p = false;
            } else {
              if (this.field_x < 0 &&
                !this.field_s.a((byte) -32)) {
                this.field_t = null;
                this.field_x = -this.field_x;
                this.field_p = false;
              }
            }
          }
          if (this.field_x == 0) {
            return;
          }
          this.field_w = this.field_w + param0 * this.field_x;
          if (this.field_w >= 1048576) {
            this.field_w = 1048576;
            if (this.field_p) {
              return;
            }
            this.field_x = 0;
            if (this.field_o) {
              return;
            }
            if (this.field_t != null) {
              this.field_s.d(false);
            }
            this.field_t = null;
            return;
          }
          if (0 < this.field_w) {
            return;
          }
          this.field_w = 0;
          if (this.field_p) {
            return;
          }
          this.field_x = 0;
          if (this.field_o) {
            return;
          }
          if (null != this.field_B) {
            this.field_A.d(false);
          }
          this.field_B = null;
          return;
        }
        if (this.field_B != null) {
          this.field_A.a(param0);
        }
        if (1048576 <= this.field_w) {
          if (this.field_q > 0 &&
            this.field_m != null) {
            this.field_z.a(param0);
          }
          if (this.field_p) {
            if (this.field_x > 0 &&
              !this.field_A.a((byte) -32)) {
              this.field_x = -this.field_x;
              this.field_B = null;
              this.field_p = false;
            } else {
              if (this.field_x < 0 &&
                !this.field_s.a((byte) -32)) {
                this.field_t = null;
                this.field_x = -this.field_x;
                this.field_p = false;
              }
            }
          }
          if (this.field_x == 0) {
            return;
          }
          this.field_w = this.field_w + param0 * this.field_x;
          if (this.field_w >= 1048576) {
            this.field_w = 1048576;
            if (this.field_p) {
              return;
            }
            this.field_x = 0;
            if (this.field_o) {
              return;
            }
            if (this.field_t != null) {
              this.field_s.d(false);
            }
            this.field_t = null;
            return;
          }
          if (0 < this.field_w) {
            return;
          }
          this.field_w = 0;
          if (this.field_p) {
            return;
          }
          this.field_x = 0;
          if (this.field_o) {
            return;
          }
          if (null != this.field_B) {
            this.field_A.d(false);
          }
          this.field_B = null;
          return;
        }
        if (this.field_t != null) {
          this.field_s.a(param0);
        }
        if (this.field_q > 0) {
          if (this.field_m == null) {
            if (this.field_p) {
              if (this.field_x > 0 &&
                !this.field_A.a((byte) -32)) {
                this.field_x = -this.field_x;
                this.field_B = null;
                this.field_p = false;
              } else {
                if (this.field_x < 0 &&
                  !this.field_s.a((byte) -32)) {
                  this.field_t = null;
                  this.field_x = -this.field_x;
                  this.field_p = false;
                }
              }
            }
            if (this.field_x == 0) {
              return;
            }
            this.field_w = this.field_w + param0 * this.field_x;
            if (this.field_w >= 1048576) {
              this.field_w = 1048576;
              if (this.field_p) {
                return;
              }
              this.field_x = 0;
              if (this.field_o) {
                return;
              }
              if (this.field_t != null) {
                this.field_s.d(false);
              }
              this.field_t = null;
              return;
            }
            if (0 < this.field_w) {
              return;
            }
            this.field_w = 0;
            if (this.field_p) {
              return;
            }
            this.field_x = 0;
            if (this.field_o) {
              return;
            }
            if (null != this.field_B) {
              this.field_A.d(false);
            }
            this.field_B = null;
            return;
          }
          this.field_z.a(param0);
        }
        if (this.field_p) {
          if (this.field_x > 0 &&
            !this.field_A.a((byte) -32)) {
            this.field_x = -this.field_x;
            this.field_B = null;
            this.field_p = false;
          } else {
            if (this.field_x < 0 &&
              !this.field_s.a((byte) -32)) {
              this.field_t = null;
              this.field_x = -this.field_x;
              this.field_p = false;
            }
          }
        }
        if (this.field_x == 0) {
          return;
        }
        this.field_w = this.field_w + param0 * this.field_x;
        if (this.field_w < 1048576) {
          if (0 >= this.field_w) {
            this.field_w = 0;
            if (this.field_p) {
              return;
            }
            this.field_x = 0;
            if (!this.field_o) {
              if (null != this.field_B) {
                this.field_A.d(false);
                this.field_B = null;
                return;
              }
              this.field_B = null;
            }
          }
        } else {
          this.field_w = 1048576;
          if (!this.field_p) {
            this.field_x = 0;
            if (this.field_o) {
              return;
            }
            if (this.field_t != null) {
              this.field_s.d(false);
            }
            this.field_t = null;
            return;
          }
        }
    }

    private final synchronized void a(int param0, int param1, boolean param2, ih param3, int param4, byte param5) {
        boolean stackIn_18_1 = false;
        int stackIn_30_0 = 0;
        hl stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        boolean stackIn_42_2 = false;
        hl stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        boolean stackIn_50_2 = false;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          if (this.field_p &&
            param2) {
            if (this.field_x > 0) {
              if (this.field_B != null) {
                this.field_A.d(false);
              }
              this.field_B = param3;
              if (param3 != null) {
                this.field_A.a(34, false, param3);
                this.a(-117, param4, param0, this.field_A);
              }
            } else {
              if (this.field_t != null) {
                this.field_s.d(false);
              }
              this.field_t = param3;
              if (param3 != null) {
                this.field_s.a(94, false, param3);
                this.a(-101, param4, param0, this.field_s);
              }
            }
            return;
          }
          stackIn_18_1 = (param2);
          this.field_p = stackIn_18_1;
          if (this.field_B == param3) {
            this.field_x = param1;
            this.a(-89, param4, param0, this.field_A);
            return;
          }
          if (this.field_t == param3) {
            this.field_x = -param1;
            this.a(-92, param4, param0, this.field_s);
            return;
          }
          if (null == this.field_B) {
            var7_int = 1;
          } else {
            if (null != this.field_t) {
              stackIn_30_0 = (524288 <= this.field_w) ? 0 : 1;
              var7_int = stackIn_30_0;
            } else {
              var7_int = 0;
            }
          }
          if (param5 < 89) {
            return;
          }
          if (var7_int == 0) {
            if (this.field_t != null) {
              this.field_s.d(false);
            }
            this.field_t = param3;
            if (param3 != null) {
              stackIn_49_0 = this.field_s;
              stackIn_49_1 = 46;
              stackIn_50_2 = !(param2);
              ((hl) (Object) stackIn_49_0).a(stackIn_49_1, stackIn_50_2, param3);
              this.a(-116, param4, param0, this.field_s);
            }
            this.field_x = -param1;
            return;
          }
          if (null != this.field_B) {
            this.field_A.d(false);
          }
          this.field_B = param3;
          if (param3 != null) {
            stackIn_41_0 = this.field_A;
            stackIn_41_1 = 27;
            stackIn_42_2 = !(param2);
            ((hl) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_42_2, param3);
            this.a(-124, param4, param0, this.field_A);
          }
          this.field_x = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_55_0 = var7;
          stackIn_55_1 = new StringBuilder().append("uh.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final lk b() {
        return null;
    }

    public static void a(byte param0) {
        if (param0 > 113) {
          field_l = null;
          field_C = null;
          field_n = null;
          field_v = null;
          return;
        }
        sj var2 = (sj) null;
        uh.a((sj) null, (byte) 38, -34);
        field_l = null;
        field_C = null;
        field_n = null;
        field_v = null;
    }

    final lk d() {
        return null;
    }

    final synchronized void a(int param0, int param1) {
        if (param0 != 0) {
          this.b();
          this.field_u = param1;
          return;
        }
        this.field_u = param1;
    }

    final static db a(sh param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        db stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        db stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -47) {
            stackIn_2_0 = (db) null;
            return stackIn_2_0;
          }
          if (nb.a(param1, param3, (byte) 127, param0)) {
            stackIn_7_0 = eb.a((byte) 27);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (db) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("uh.K(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_31_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_59_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          if (this.field_u <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_p) {
            if (0 < this.field_x &&
              !this.field_A.a((byte) -32)) {
              this.field_x = -this.field_x;
              this.field_p = false;
              this.field_B = null;
            } else {
              if (this.field_x < 0 &&
                !this.field_s.a((byte) -32)) {
                this.field_p = false;
                this.field_t = null;
                this.field_x = -this.field_x;
              }
            }
          }
          var4_int = (this.field_w >> 12) * this.field_u / 256;
          var5 = -var4_int + this.field_u;
          if (0 != this.field_x) {
            this.field_w = this.field_w + param2 * this.field_x;
            if (this.field_w >= 1048576) {
              this.field_w = 1048576;
              if (!this.field_p) {
                this.field_x = 0;
                if (!this.field_o) {
                  if (null != this.field_t) {
                    this.field_s.d(false);
                  }
                  this.field_t = null;
                }
              }
            } else {
              if (0 >= this.field_w) {
                this.field_w = 0;
                if (!this.field_p) {
                  this.field_x = 0;
                  if (!this.field_o) {
                    if (this.field_B != null) {
                      this.field_A.d(false);
                    }
                    this.field_B = null;
                  }
                }
              }
            }
          }
          if (!b.field_j) {
            stackIn_31_0 = param2;
          } else {
            stackIn_31_0 = param2 << 1;
          }
          var6 = stackIn_31_0;
          if (this.field_q < 256 && (null != this.field_B ||
            this.field_t != null)) {
            if (var4_int != 256) {
              if (var5 != 256) {
                if (null != this.field_y &&
                  this.field_y.length >= var6) {
                  o.a(this.field_y, 0, var6);
                  o.a(this.field_r, 0, var6);
                } else {
                  this.field_r = new int[var6];
                  this.field_y = new int[var6];
                }
                this.field_A.b(this.field_y, 0, param2);
                this.field_s.b(this.field_r, 0, param2);
                if (!b.field_j) {
                  stackIn_47_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_47_0 = localTemp$0;
                }
                var7 = stackIn_47_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (this.field_r[var8] * var5 + var4_int * this.field_y[var8] >> 8);
                }
              } else {
                this.field_s.b(param0, param1, param2);
              }
            } else {
              this.field_A.b(param0, param1, param2);
            }
          }
          if (this.field_m != null &&
            this.field_q != 0) {
            if (this.field_y != null &&
              this.field_y.length >= var6) {
              o.a(this.field_y, 0, var6);
            } else {
              this.field_r = new int[var6];
              this.field_y = new int[var6];
            }
            this.field_z.b(this.field_y, 0, param2);
            if (b.field_j) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_59_0 = localTemp$1;
            } else {
              stackIn_59_0 = param1;
            }
            var7Lifetime1 = stackIn_59_0;
            var8Lifetime1 = this.field_u * this.field_q / 256;
            var9 = this.field_u - var8Lifetime1;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var7Lifetime1 + var10] = param0[var10 + var7Lifetime1] * var9 + this.field_y[var10] * var8Lifetime1 >> 8;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_65_0 = var4;
          stackIn_65_1 = new StringBuilder().append("uh.I(");
          if (param0 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public uh() {
        this.field_u = 256;
        this.field_q = 0;
        this.field_o = false;
        hl var1 = new hl();
        this.a(var1, (byte) -72, new hl(var1));
    }

    final synchronized int a() {
        return 2;
    }

    static {
        field_v = new java.util.zip.CRC32();
        field_l = new dg();
        field_C = new int[4];
    }
}
