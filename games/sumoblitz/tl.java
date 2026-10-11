/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tl extends ms {
    static int field_t;
    int field_n;
    private int field_w;
    private int field_x;
    private int field_u;
    static int[] field_k;
    int field_m;
    int field_q;
    static String field_s;
    private int field_p;
    static int field_v;
    private int field_l;
    private int field_o;
    private jn field_r;

    final void a(int param0, ha param1) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        nt var5 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if ((this.field_u % 10 <= 5 ||
            this.field_q >= 200) &&
            !this.g(0)) {
            if (0 == this.field_m) {
              if (2 == this.field_n) {
                ud.field_q[1].a((float)(this.field_x >> 8), (float)(this.field_o >> 8), 2048, 0, 1, 0, 2);
              } else if (this.field_n == 1) {
                ud.field_q[0].a((float)(this.field_x >> 8), (float)(this.field_o >> 8), 2048, 0, 1, 0, 2);
              } else if (this.field_n == 0) {
                ud.field_q[2].a((float)(this.field_x >> 8), (float)(this.field_o >> 8), 2048, 0, 1, 0, 2);
              }
            } else if (this.field_n == 2) {
              ud.field_q[7].a((float)(this.field_x >> 8), (float)(this.field_o >> 8), 2048, 0, 1, 0, 2);
            } else if (this.field_n == 1) {
              ud.field_q[6].a((float)(this.field_x >> 8), (float)(this.field_o >> 8), 2048, 0, 1, 0, 2);
            } else if (this.field_n == 0) {
              ud.field_q[5].a((float)(this.field_x >> 8), (float)(this.field_o >> 8), 2048, 0, 1, 0, 2);
            } else if (this.field_n == 3) {
              ud.field_q[8].a((float)(this.field_x >> 8), (float)(this.field_o >> 8), 2048, 0, 1, 0, 2);
            } else if (this.field_n == 4) {
              ud.field_q[9].a((float)(this.field_x >> 8), (float)(this.field_o >> 8), 2048, 0, 1, 0, 2);
            }
          } else {
            if (2 == this.field_n) {
              ud.field_q[12].a((float)(this.field_x >> 8), (float)(this.field_o >> 8), 2048, 0, 1, 0, 2);
            } else {
              if (this.field_n != 1) {
                if (0 == this.field_n) {
                  ud.field_q[10].a((float)(this.field_x >> 8), (float)(this.field_o >> 8), 2048, 0, 1, 0, 2);
                } else {
                  if (3 != this.field_n) {
                    if (this.field_n == 4) {
                      ud.field_q[14].a((float)(this.field_x >> 8), (float)(this.field_o >> 8), 2048, 0, 1, 0, 2);
                    }
                  } else {
                    ud.field_q[13].a((float)(this.field_x >> 8), (float)(this.field_o >> 8), 2048, 0, 1, 0, 2);
                  }
                }
              } else {
                ud.field_q[11].a((float)(this.field_x >> 8), (float)(this.field_o >> 8), 2048, 0, 1, 0, 2);
              }
            }
          }
          var5 = (nt) (this.field_r.b(126));
          if (param0 > -53) {
            this.g(-26);
          }
          while (var5 != null) {
            var5.a(param1, -127);
            var5 = (nt) (this.field_r.d((byte) 18));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_41_0 = var3;
          stackIn_41_1 = new StringBuilder().append("tl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final int d(int param0) {
        int var2 = 87 % ((param0 - 7) / 41);
        return this.field_o;
    }

    private final int d(byte param0) {
        int var2;
        int var3;
        ha var4;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 < 28) {
          var4 = (ha) null;
          this.a(77, (ha) null);
        }
        var2 = -1414832128;
        if (this.field_n == 0) {
          var2 = -1442815829;
        } else {
          if (this.field_n != 1) {
            if (3 == this.field_n) {
              var2 = -1426128896;
            } else {
              if (4 == this.field_n) {
                var2 = -1442796545;
              }
            }
          } else {
            var2 = -1436548949;
          }
        }
        return var2;
    }

    final boolean g(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 0) {
          this.field_u = -46;
        }
        stackIn_7_0 = (0 != this.field_w) || (0 != this.field_p);
        return stackIn_7_0;
    }

    final int c(byte param0) {
        int discarded$0 = 0;
        if (param0 != 70) {
          discarded$0 = this.d((byte) -57);
        }
        return this.field_x;
    }

    final void c(int param0) {
        int var3;
        nt var4;
        var3 = Sumoblitz.field_L ? 1 : 0;
        this.field_o = this.field_o + this.field_p;
        this.field_x = this.field_x + this.field_w;
        if (this.e(-114)) {
          if (this.field_w == 0) {
            this.field_w = 256;
          }
          if (0 == this.field_p) {
            this.field_p = 256;
          }
        } else {
          this.field_p = 251 * this.field_p / 256;
          this.field_w = 251 * this.field_w / 256;
        }
        if (this.field_x <= 13312 &&
          this.field_w <= 0) {
          if (this.field_w == 0) {
            this.field_w = 256;
          }
          this.field_w = -this.field_w;
        } else {
          if (this.field_x > -52 + rj.field_c << 8 &&
            this.field_w >= 0) {
            if (0 == this.field_w) {
              this.field_w = -256;
            }
            this.field_w = -this.field_w;
          }
        }
        if (this.field_o <= 13312 &&
          this.field_p <= 0) {
          if (this.field_p == 0) {
            this.field_p = 256;
          }
          this.field_p = -this.field_p;
        } else {
          if (this.field_o > rl.field_k - 52 << 8 &&
            0 <= this.field_p) {
            if (this.field_p == 0) {
              this.field_p = 256;
            }
            this.field_p = -this.field_p;
          }
        }
        if (1 == this.field_m && (this.field_w != 0 ||
          this.field_p != 0)) {
          if (0 == this.field_u % 2) {
            this.field_r.a((ms) (new eq(50, -1024 + (this.field_x + fi.a(2048, he.field_o, (byte) -96)) >> 8, -1024 + (this.field_o + fi.a(2048, he.field_o, (byte) -96)) >> 8, this.d((byte) 105), 1 + this.field_n, true)), (byte) 39);
          } else {
            this.field_r.a((ms) (new eq(50, -1024 + (this.field_x + fi.a(2048, he.field_o, (byte) -96)) >> 8, this.field_o - (-fi.a(2048, he.field_o, (byte) -96) + 1024) >> 8, this.d((byte) 65), 1 + this.field_n, false)), (byte) 39);
          }
        }
        if (param0 != -31255) {
          return;
        }
        var4 = (nt) (this.field_r.b(param0 ^ -31326));
        while (var4 != null) {
          if (var4.a(-2567)) {
            var4.b(false);
          }
          var4 = (nt) (this.field_r.d((byte) 18));
        }
        this.field_q = this.field_q - 1;
        this.field_u = this.field_u + 1;
        return;
    }

    private final boolean e(int param0) {
        cb var2;
        nm var3;
        int var4;
        int var5;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = new cb(is.field_c);
        if (param0 > -106) {
          field_v = -85;
        }
        var3 = (nm) (var2.b((byte) -80));
        while (var3 != null) {
          var4 = (var3.field_m << 8) + this.field_l;
          if (wn.a(this.field_o, var4, -117, var3.field_q, this.field_x, var3.field_l) && (3 == var3.field_y ||
            var3.field_y == 6)) {
            return true;
          }
          var3 = (nm) (var2.b(0));
        }
        return false;
    }

    public static void f(int param0) {
        if (param0 <= 42) {
          return;
        }
        field_k = null;
        field_s = null;
    }

    final static void a(byte param0) {
        if (param0 >= -13) {
          return;
        }
        av.field_C = null;
        er.field_h = null;
        ag.field_d = (byte[][]) null;
        iv.field_l = null;
        vg.field_k = null;
        we.field_B = null;
    }

    final int a(int param0) {
        if (param0 >= -32) {
          return 10;
        }
        return this.field_l;
    }

    tl(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_m = param0;
        this.field_w = param4;
        this.field_q = 1000;
        this.field_o = param3;
        this.field_p = param5;
        this.field_n = param1;
        this.field_l = 5120;
        this.field_x = param2;
        this.field_r = new jn();
    }

    static {
        field_k = new int[8192];
        field_v = 0;
    }
}
