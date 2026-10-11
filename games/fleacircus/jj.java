/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jj extends db {
    private int field_T;
    static Random field_R;
    private int field_N;
    private int field_U;
    private int field_W;
    static String field_V;
    private int field_O;
    static dd field_P;
    static String field_Y;
    static String field_X;
    static int[] field_Z;
    private int field_Q;
    static vc field_S;
    static td field_M;

    public static void c(boolean param0) {
        if (param0) {
          field_R = null;
          field_Y = null;
          field_V = null;
          field_P = null;
          field_S = null;
          field_Z = null;
          field_M = null;
          field_X = null;
          return;
        }
    }

    final static void a(float param0, String param1, boolean param2) {
        try {
          qj.field_I = param1;
          if (!param2) {
            jj.c(true);
          }
          wa.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "jj.GB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    jj(f param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_U = 0;
        this.field_Q = 0;
    }

    boolean j(int param0) {
        if (param0 < 70) {
          return false;
        }
        this.l(-1);
        return super.j(122);
    }

    boolean a(int param0) {
        int var3 = 0;
        int var4 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var6 = 0;
        int var2 = 35 % ((param0 - 38) / 49);
        int var3Lifetime1;
        int var4Lifetime1;
        if (this.field_U > 0) {
          var3 = this.field_O;
          var4 = this.field_W;
          fieldTemp$0 = this.field_Q + 1;
          this.field_Q = this.field_Q + 1;
          if (fieldTemp$0 >= this.field_U) {
            this.field_U = 0;
            this.m(-120);
            this.a(var4, (byte) -127, var3);
            return super.a(89);
          }
          var5 = (this.field_U * 2 - this.field_Q) * this.field_Q;
          var6 = this.field_U * this.field_U;
          var3Lifetime1 = (this.field_O - this.field_T) * var5 / var6 + this.field_T;
          var4Lifetime1 = this.field_N + var5 * (-this.field_N + this.field_W) / var6;
          this.a(var4Lifetime1, (byte) -127, var3Lifetime1);
          return super.a(89);
        }
        return super.a(89);
    }

    void b(int param0, int param1, int param2) {
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
        var16 = fleas.field_A ? 1 : 0;
        if (param2 != 17344) {
          return;
        }
        gb.a(6 + param1, param0 + 35, this.field_u - 12, this.field_j - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        while (var4 > var7) {
          if (var8 >= gb.field_b &&
            var8 < gb.field_i) {
            var9 = (-var5 + var6) * var7 / var4 + var5;
            var10 = 0;
            var11 = this.field_u;
            if (20 >= var7) {
              while (20 >= var10) {
                var12 = (20 - var10) * (20 - var10) + (20 - var7) * (20 - var7);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (462 - var12) / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  gb.field_a[var8 * gb.field_d + param1 + var10] = var13;
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
                if (var14 <= 462) {
                  if (420 > var14) {
                    var12Lifetime1 = 1 + var11;
                  } else {
                    var15 = var9 * (-var14 + 462) / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    gb.field_a[var8 * gb.field_d + param1 + var11] = var15;
                  }
                  var13Lifetime1++;
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            gb.b(var10 + param1, var8, var11 - var10, var9);
          }
          var8++;
          var7++;
        }
        var6Lifetime1 = 169;
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var7Lifetime1 = 0;
        var8Lifetime1 = param0 + 35;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + var7Lifetime1 * (var6Lifetime1 - var5Lifetime1) / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          gb.b(param1, var8Lifetime1, 6, var9Lifetime1);
          gb.b(-6 + this.field_u + param1, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        ha.field_i.d(param1 + this.field_u - 90, param0 + 10);
        bc.a(uh.field_m, param0 + 35, param1 + 5, (byte) 126, this.field_u - 10);
        bc.a(ki.field_c, -22 + (param0 + this.field_j), param1, (byte) -126, this.field_u);
        var6Lifetime2 = 127;
        var4Lifetime2 = this.field_j - 79;
        var5Lifetime2 = 169;
        var7Lifetime2 = 0;
        var8Lifetime2 = 57 + param0;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = (var6Lifetime2 - var5Lifetime2) * var7Lifetime2 / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          gb.b(param1, var8Lifetime2, 6, var9Lifetime2);
          gb.b(param1 + (this.field_u - 6), var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
        return;
    }

    void m(int param0) {
        int var2 = -37 / ((param0 + 56) / 45);
    }

    void l(int param0) {
        if (~this.field_U >= param0) {
          return;
        }
        this.a(this.field_W, (byte) -128, this.field_O);
        this.field_U = 0;
        this.m(param0 - 123);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = -119 / ((25 - param3) / 42);
        if (param0 > 0) {
          this.field_T = this.field_u;
          this.field_N = this.field_j;
          this.field_W = param2;
          this.field_U = param0;
          this.field_O = param1;
          this.field_Q = 0;
          return;
        }
        this.a(param2, (byte) -127, param1);
    }

    static {
        field_V = "If you want to place a tile where a flea is, hold the mouse button down and the tile will be placed as soon as the flea moves out of the way. This trick lets you place tiles even when an area is crowded with fleas.";
        field_R = new Random();
        field_X = "You are not currently logged in to the<nbsp>game.";
        field_Y = "to over <%0> great games";
        field_Z = new int[12];
        field_S = new vc();
    }
}
