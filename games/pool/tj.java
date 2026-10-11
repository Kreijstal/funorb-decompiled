/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tj extends oe {
    private int field_cb;
    static String field_eb;
    private int field_X;
    private int field_Y;
    static int field_fb;
    static int[][] field_ab;
    private int field_Z;
    private int field_db;
    static String field_W;
    private int field_bb;

    boolean g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (this.field_db > 0) {
          var2 = this.field_bb;
          var3 = this.field_X;
          fieldTemp$0 = this.field_Z + 1;
          this.field_Z = this.field_Z + 1;
          if (fieldTemp$0 >= this.field_db) {
            this.field_db = 0;
            this.j(50);
          } else {
            var4 = this.field_Z * (this.field_db * 2 - this.field_Z);
            var5 = this.field_db * this.field_db;
            var2 = (-this.field_Y + this.field_bb) * var4 / var5 + this.field_Y;
            var3 = (this.field_X - this.field_cb) * var4 / var5 + this.field_cb;
          }
          this.b(var3, 31936, var2);
        }
        if (param0 != -20) {
          this.a((byte) 127, -67, -57, -106);
        }
        return super.g((byte) -20);
    }

    boolean a(boolean param0) {
        this.b(param0);
        return super.a(param0);
    }

    final static int c(int param0, int param1, int param2) {
        if (param2 != 4096) {
          return 124;
        }
        if (param0 == 0) {
          if (0 != param1) {
            if (param1 < 0) {
              return -2048;
            }
            return 2048;
          }
          return 0;
        }
        if (0 <= param0) {
          if (param1 == 0) {
            return 0;
          }
          if (param1 < 0) {
            return -jd.a(param0, 1164778608, -param1);
          }
          return jd.a(param0, 1164778608, param1);
        }
        if (0 == param1) {
          return 4096;
        }
        if (param1 >= 0) {
          return -jd.a(-param0, 1164778608, param1) + 4096;
        }
        return -4096 + jd.a(-param0, 1164778608, -param1);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param3 <= 0) {
          this.b(param1, 31936, param2);
          return;
        }
        this.field_Z = 0;
        this.field_Y = this.field_l;
        int var5 = 77 / ((param0 - 44) / 34);
        this.field_X = param1;
        this.field_bb = param2;
        this.field_db = param3;
        this.field_cb = this.field_y;
    }

    final static int i(int param0) {
        if (sf.field_y < 2) {
          return 0;
        }
        if (0 != gj.field_S) {
          if (null != wh.field_a) {
            if (!wh.field_a.d(-103)) {
              return 14;
            }
            if (!wh.field_a.a((byte) 114, "")) {
              return 29;
            }
            if (!wh.field_a.a("", 0)) {
              return 29;
            }
          }
          if (!uj.field_d.d(84)) {
            return 43;
          }
          if (!uj.field_d.a("commonui", param0 - 19535)) {
            return 57;
          }
          if (!vf.field_nb.d(-96)) {
            return 71;
          }
          if (!vf.field_nb.a("commonui", 0)) {
            return 80;
          }
          if (!rg.field_r.d(47)) {
            return 82;
          }
          if (!rg.field_r.c(-63)) {
            return 86;
          }
        } else {
          if (!uj.field_d.d(param0 - 19430)) {
            return 20;
          }
          if (!uj.field_d.a("commonui", 0)) {
            return 40;
          }
          if (!vf.field_nb.d(104)) {
            return 50;
          }
          if (!vf.field_nb.a("commonui", param0 ^ 19535)) {
            return 60;
          }
          if (!rg.field_r.d(114)) {
            return 70;
          }
          if (!rg.field_r.c(-63)) {
            return 80;
          }
        }
        if (param0 != 19535) {
          tj.i(-99);
        }
        return 100;
    }

    public static void h(byte param0) {
        if (param0 != -16) {
          tj.i(83);
        }
        field_ab = (int[][]) null;
        field_W = null;
        field_eb = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7;
        boolean stackIn_6_0 = false;
        var7 = 101 / ((69 - param1) / 51);
        stackIn_6_0 = (param0 >= param6) && (param0 < param4 + param6) && (param5 <= param3) && (param3 < param5 + param2);
        return stackIn_6_0;
    }

    void j(int param0) {
        if (param0 != 50) {
          this.a(true);
        }
    }

    tj(lq param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_db = 0;
        this.field_Z = 0;
    }

    void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = Pool.field_O;
        qh.d(6 + param0, param1 + 35, this.field_l - 12, this.field_y - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        if (param2 != 260) {
          return;
        }
        var7 = 0;
        var8 = param1;
        while (var7 < var4) {
          if (var8 >= qh.field_c &&
            var8 < qh.field_g) {
            var9 = var7 * (var6 - var5) / var4 + var5;
            var10 = 0;
            var11 = this.field_l;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (20 - var10) * (20 - var10) + (20 - var7) * (20 - var7);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (-var12 + 462) / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  qh.field_d[var10 + qh.field_l * var8 + param0] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (var13Lifetime1 <= 20) {
                var14 = var13Lifetime1 * var13Lifetime1 + (-var7 + 20) * (-var7 + 20);
                if (462 >= var14) {
                  if (var14 < 420) {
                    var12Lifetime1 = var11 + 1;
                  } else {
                    var15 = var9 * (-var14 + 462) / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    qh.field_d[param0 + (qh.field_l * var8 + var11)] = var15;
                  }
                  var13Lifetime1++;
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 8 | var9 << 16);
            qh.f(var10 + param0, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        var6Lifetime1 = 169;
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param1;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          qh.f(param0, var8Lifetime1, 6, var9Lifetime1);
          qh.f(this.field_l + param0 - 6, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        me.field_p.c(this.field_l + param0 - 90, 10 + param1);
        id.a(param1 + 35, this.field_l - 10, gr.field_I, param0 + 5, (byte) 23);
        id.a(-22 + (param1 + this.field_y), this.field_l, rb.field_d, param0, (byte) 23);
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var4Lifetime2 = -79 + this.field_y;
        var7Lifetime2 = 0;
        var8Lifetime2 = param1 + 57;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = var7Lifetime2 * (var6Lifetime2 - var5Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          qh.f(param0, var8Lifetime2, 6, var9Lifetime2);
          qh.f(param0 - (-this.field_l + 6), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
        return;
    }

    void b(boolean param0) {
        if (0 >= this.field_db) {
          return;
        }
        this.b(this.field_X, 31936, this.field_bb);
        if (param0) {
          this.a(true);
        }
        this.field_db = 0;
        this.j(50);
    }

    static {
        field_W = "Players: ";
        field_eb = "To <u=ffffff>zoom</u> in and out: Use the <img=1> <col=99ff99>mouse wheel</col>, or hold <img=11>+<img=0> left mouse button and drag.";
    }
}
