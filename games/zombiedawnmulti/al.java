/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class al extends df {
    static String field_U;
    static String field_ab;
    static cj field_fb;
    private int field_S;
    private int field_Y;
    static String field_cb;
    static String field_W;
    static int field_bb;
    private int field_X;
    private int field_db;
    private int field_V;
    static ul field_eb;
    private int field_T;
    static int field_Z;

    final static void b(boolean param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          if (!param0) {
            return;
          }
          try {
            fo.a(jl.b(0), "resizing", (byte) 23, new Object[]{new Integer(param1)});
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void j(byte param0) {
        if (param0 > -70) {
          field_ab = (String) null;
        }
    }

    boolean i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (param0 != -27388) {
          this.a(-14, (byte) 3, 7, -57);
        }
        if (this.field_db <= 0) {
        } else {
          var2 = this.field_V;
          var3 = this.field_Y;
          fieldTemp$0 = this.field_S + 1;
          this.field_S = this.field_S + 1;
          if (fieldTemp$0 < this.field_db) {
            var4 = (this.field_db * 2 - this.field_S) * this.field_S;
            var5 = this.field_db * this.field_db;
            var2 = var4 * (-this.field_X + this.field_V) / var5 + this.field_X;
            var3 = this.field_T + var4 * (-this.field_T + this.field_Y) / var5;
          } else {
            this.field_db = 0;
            this.j((byte) -101);
          }
          this.b(var2, var3, param0 + 27505);
        }
        return super.i(-27388);
    }

    final static String k(int param0) {
        if (param0 <= 68) {
          return (String) null;
        }
        return s.field_e.f((byte) -24);
    }

    final static void j(int param0) {
        ch.field_e = false;
        nj.field_f = false;
        fb.a(param0, 99);
        id.field_B = mp.field_b;
        ta.field_hb = mp.field_b;
    }

    public static void i(byte param0) {
        field_U = null;
        field_cb = null;
        int var1 = -15 % ((-22 - param0) / 60);
        field_eb = null;
        field_ab = null;
        field_fb = null;
        field_W = null;
    }

    al(vk param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_S = 0;
        this.field_db = 0;
    }

    void a(boolean param0, int param1, int param2) {
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
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        oo.a(6 + param1, param2 + 35, -12 + this.field_n, this.field_w - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        while (var4 > var7) {
          if (oo.field_e <= var8 &&
            oo.field_d > var8) {
            var9 = (-var5 + var6) * var7 / var4 + var5;
            var10 = 0;
            var11 = this.field_n;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (-var10 + 20) * (20 - var10) + (-var7 + 20) * (20 - var7);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (462 - var12) / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  oo.field_i[param1 + oo.field_b * var8 + var10] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = (20 - var7) * (20 - var7) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 < 420) {
                    var12Lifetime1 = 1 + var11;
                  } else {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    oo.field_i[var11 + (param1 + var8 * oo.field_b)] = var15;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 8 | var9 << 16);
            oo.b(var10 + param1, var8, -var10 + var11, var9);
          }
          var8++;
          var7++;
        }
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var6Lifetime1 = 169;
        var7Lifetime1 = 0;
        var8Lifetime1 = param2 + 35;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + var7Lifetime1 * (-var5Lifetime1 + var6Lifetime1) / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          oo.b(param1, var8Lifetime1, 6, var9Lifetime1);
          oo.b(param1 + (this.field_n - 6), var8Lifetime1, 6, var9Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        hq.field_e.g(-90 + param1 + this.field_n, 10 + param2);
        fk.a(param1 + 5, this.field_n - 10, param0, sn.field_Nb, 35 + param2);
        fk.a(param1, this.field_n, true, jh.field_Hb, this.field_w + param2 - 22);
        var5Lifetime2 = 169;
        var4Lifetime2 = this.field_w - 79;
        var6Lifetime2 = 127;
        var7Lifetime2 = 0;
        var8Lifetime2 = 57 + param2;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = (-var5Lifetime2 + var6Lifetime2) * var7Lifetime2 / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          oo.b(param1, var8Lifetime2, 6, var9Lifetime2);
          oo.b(this.field_n + (param1 - 6), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    final static int c(int param0, int param1, int param2) {
        if (null == er.field_j) {
          return -1;
        }
        if (param2 >= jp.field_d &&
          param2 < jp.field_d + er.field_j.field_x &&
          param0 >= cr.field_j &&
          cr.field_j + er.field_j.field_w > param0) {
          return 0;
        }
        if (il.field_k <= param2 && param2 < il.field_k + er.field_j.field_x && param0 >= sq.field_O &&
          !(param0 >= sq.field_O + er.field_j.field_w)) {
          return 1;
        }
        if (param1 != -1) {
          field_eb = (ul) null;
        }
        return -1;
    }

    boolean h(int param0) {
        if (param0 != -6134) {
          field_U = (String) null;
        }
        this.h((byte) 113);
        return super.h(-6134);
    }

    void h(byte param0) {
        if (param0 <= 29) {
          field_cb = (String) null;
        }
        if (this.field_db <= 0) {
          return;
        }
        this.b(this.field_V, this.field_Y, 69);
        this.field_db = 0;
        this.j((byte) -116);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param0 <= 0) {
          this.b(param3, param2, 73);
          return;
        }
        this.field_V = param3;
        this.field_Y = param2;
        this.field_S = 0;
        this.field_T = this.field_w;
        if (param1 != -112) {
          this.h(20);
        }
        this.field_X = this.field_n;
        this.field_db = param0;
    }

    static {
        field_ab = "More suggestions";
        field_W = "Friends";
        field_U = "Impose your will upon enemy zombies.";
        field_cb = "You have <%0> unread messages!";
    }
}
