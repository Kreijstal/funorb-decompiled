/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ob extends vi {
    static je field_hb;
    private int field_U;
    private int field_W;
    private int field_fb;
    static String[] field_bb;
    static String field_ib;
    private int field_gb;
    static String field_X;
    static am field_eb;
    static dj field_T;
    static v field_Y;
    static int field_ab;
    private int field_cb;
    private int field_Z;
    static ll[] field_db;

    void e(boolean param0) {
        if (param0) {
          this.a(-67, (byte) -5, -121);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = 58 / ((param1 - 76) / 32);
        if (param2 <= 0) {
          this.a(param0, 0, param3);
          return;
        }
        this.field_cb = param2;
        this.field_W = this.field_k;
        this.field_gb = param3;
        this.field_U = param0;
        this.field_fb = this.field_v;
        this.field_Z = 0;
    }

    final static void j(byte param0) {
        int var1 = 0;
        if (param0 > -107) {
          return;
        }
        if (si.field_l > 32) {
          var1 = si.field_l % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          mf.a(si.field_l - var1, 21298);
        } else {
          mf.a(0, 21298);
        }
    }

    void a(int param0, byte param1, int param2) {
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
        var16 = ArcanistsMulti.field_G ? 1 : 0;
        de.c(6 + param0, 35 + param2, this.field_v - 12, -40 + this.field_k, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        while (var4 > var7) {
          if (de.field_c <= var8 &&
            de.field_k > var8) {
            var9 = var7 * (var6 - var5) / var4 + var5;
            var10 = 0;
            var11 = this.field_v;
            if (var7 <= 20) {
              while (20 >= var10) {
                var12 = (-var7 + 20) * (20 - var7) + (-var10 + 20) * (-var10 + 20);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (462 - var12) * var9 / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  de.field_l[de.field_e * var8 + param0 + var10] = var13;
                }
                var10++;
              }
            }
            if (20 >= var7) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; 20 >= var13Lifetime1; var13Lifetime1++) {
                var14 = (20 - var7) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (420 <= var14) {
                    var15 = var9 * (462 - var14) / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    de.field_l[var11 + (de.field_e * var8 + param0)] = var15;
                  } else {
                    var12Lifetime1 = var11 + 1;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            de.f(param0 + var10, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        var5Lifetime1 = 194;
        var6Lifetime1 = 169;
        var4Lifetime1 = 22;
        if (param1 != -117) {
          this.e(false);
        }
        var7Lifetime1 = 0;
        var8Lifetime1 = param2 + 35;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + var7Lifetime1 * (-var5Lifetime1 + var6Lifetime1) / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          de.f(param0, var8Lifetime1, 6, var9Lifetime1);
          de.f(this.field_v + (param0 - 6), var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        ci.field_e.c(-90 + (param0 + this.field_v), 10 + param2);
        dd.a(2, 35 + param2, fk.field_g, this.field_v - 10, 5 + param0);
        dd.a(param1 ^ -119, param2 + this.field_k - 22, vi.field_E, this.field_v, param0);
        var4Lifetime2 = this.field_k - 79;
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var7Lifetime2 = 0;
        var8Lifetime2 = 57 + param2;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = (var6Lifetime2 - var5Lifetime2) * var7Lifetime2 / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          de.f(param0, var8Lifetime2, 6, var9Lifetime2);
          de.f(this.field_v + (param0 - 6), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    public static void f(boolean param0) {
        field_Y = null;
        field_hb = null;
        field_db = null;
        field_ib = null;
        field_X = null;
        if (param0) {
          return;
        }
        field_bb = null;
        field_eb = null;
        field_T = null;
    }

    boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (param0 < 19) {
          return true;
        }
        if (this.field_cb <= 0) {
        } else {
          var2 = this.field_U;
          var3 = this.field_gb;
          fieldTemp$0 = this.field_Z + 1;
          this.field_Z = this.field_Z + 1;
          if (fieldTemp$0 < this.field_cb) {
            var4 = (this.field_cb * 2 - this.field_Z) * this.field_Z;
            var5 = this.field_cb * this.field_cb;
            var3 = (this.field_gb - this.field_W) * var4 / var5 + this.field_W;
            var2 = var4 * (-this.field_fb + this.field_U) / var5 + this.field_fb;
          } else {
            this.field_cb = 0;
            this.e(false);
          }
          this.a(var2, 0, var3);
        }
        return super.a((byte) 107);
    }

    ob(h param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_cb = 0;
        this.field_Z = 0;
    }

    boolean g(byte param0) {
        this.a(109);
        if (param0 != 45) {
          return false;
        }
        return super.g((byte) 45);
    }

    void a(int param0) {
        if (param0 < 89) {
          return;
        }
        if (0 >= this.field_cb) {
          return;
        }
        this.a(this.field_U, 0, this.field_gb);
        this.field_cb = 0;
        this.e(false);
    }

    final static void a(int param0, ge param1, int param2) {
        if (param0 != 20) {
          return;
        }
        try {
          he.field_e.b((byte) -98, 58);
          he.field_e.f(param2, (byte) -7);
          he.field_e.c(param1.field_o, (byte) -109);
          he.field_e.c(param1.field_j, (byte) -101);
          he.field_e.c(param1.field_q, (byte) -56);
          he.field_e.c(param1.field_s, (byte) -79);
          he.field_e.c(param1.field_k, (byte) -113);
          he.field_e.f(param1.field_m, (byte) -111);
          he.field_e.f(param1.field_h, (byte) -124);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ob.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_hb = new je();
        field_ib = "Player";
        field_ab = 0;
        field_Y = null;
        field_X = "DRAGON MASTER - ";
    }
}
