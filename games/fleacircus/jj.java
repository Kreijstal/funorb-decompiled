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
        if (!param0) {
          return;
        } else {
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
        int fieldTemp$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var2 = 35 % ((param0 - 38) / 49);
        if (this.field_U > 0) {
          var3 = this.field_O;
          var4 = this.field_W;
          fieldTemp$1 = this.field_Q + 1;
          this.field_Q = this.field_Q + 1;
          if (fieldTemp$1 < this.field_U) {
            var5 = (this.field_U * 2 + -this.field_Q) * this.field_Q;
            var6 = this.field_U * this.field_U;
            var3 = (this.field_O + -this.field_T) * var5 / var6 + this.field_T;
            var4 = this.field_N + var5 * (-this.field_N + this.field_W) / var6;
            this.a(var4, (byte) -127, var3);
            return super.a(89);
          } else {
            this.field_U = 0;
            this.m(-120);
            this.a(var4, (byte) -127, var3);
            return super.a(89);
          }
        } else {
          return super.a(89);
        }
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = fleas.field_A ? 1 : 0;
        if (param2 == 17344) {
          gb.a(6 + param1, param0 + 35, this.field_u - 12, this.field_j - 40, 2105376, 0);
          var5 = 211;
          var4 = 35;
          var6 = 194;
          var7 = 0;
          var8 = param0;
          L0: while (true) {
            if (var4 <= var7) {
              var6 = 169;
              var4 = 22;
              var5 = 194;
              var7 = 0;
              var8 = param0 - -35;
              L1: while (true) {
                if (var4 <= var7) {
                  ha.field_i.d(param1 + this.field_u + -90, param0 + 10);
                  bc.a(uh.field_m, param0 - -35, param1 - -5, (byte) 126, this.field_u + -10);
                  bc.a(ki.field_c, -22 + (param0 - -this.field_j), param1, (byte) -126, this.field_u);
                  var6 = 127;
                  var4 = this.field_j - 79;
                  var5 = 169;
                  var7 = 0;
                  var8 = 57 + param0;
                  L2: while (true) {
                    if (var7 >= var4) {
                      return;
                    } else {
                      var9 = (var6 + -var5) * var7 / var4 + var5;
                      var9 = var9 | (var9 << 1311612688 | var9 << 437811944);
                      gb.b(param1, var8, 6, var9);
                      gb.b(param1 + (this.field_u - 6), var8, 6, var9);
                      var7++;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  var9 = var5 - -(var7 * (var6 + -var5) / var4);
                  var9 = var9 | (var9 << 122295632 | var9 << 414913448);
                  gb.b(param1, var8, 6, var9);
                  gb.b(-6 + this.field_u + param1, var8, 6, var9);
                  var7++;
                  var8++;
                  continue L1;
                }
              }
            } else {
              if (var8 >= gb.field_b) {
                if (var8 < gb.field_i) {
                  L3: {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var10 = 0;
                    var11 = this.field_u;
                    if (20 < var7) {
                      break L3;
                    } else {
                      L4: while (true) {
                        if (20 < var10) {
                          break L3;
                        } else {
                          var12 = (20 + -var10) * (20 + -var10) + (20 + -var7) * (20 - var7);
                          if (-463 <= (var12 ^ -1)) {
                            if (-421 < (var12 ^ -1)) {
                              break L3;
                            } else {
                              var13 = var9 * (462 - var12) / 42;
                              var13 = var13 | (var13 << -1899106384 | var13 << 450895624);
                              gb.field_a[var8 * gb.field_d + param1 - -var10] = var13;
                              var10++;
                              continue L4;
                            }
                          } else {
                            var10++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  L5: {
                    if (-21 > (var7 ^ -1)) {
                      break L5;
                    } else {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L6: while (true) {
                        L7: {
                          if ((var13 ^ -1) < -21) {
                            break L7;
                          } else {
                            var14 = var13 * var13 + (-var7 + 20) * (-var7 + 20);
                            if (var14 > 462) {
                              break L7;
                            } else {
                              if (420 > var14) {
                                var12 = 1 + var11;
                                var13++;
                                var11++;
                                continue L6;
                              } else {
                                var15 = var9 * (-var14 + 462) / 42;
                                var15 = var15 | (var15 << -1666281584 | var15 << 1139222856);
                                gb.field_a[var8 * gb.field_d + param1 - -var11] = var15;
                                var13++;
                                var11++;
                                continue L6;
                              }
                            }
                          }
                        }
                        var11 = var12;
                        break L5;
                      }
                    }
                  }
                  var9 = var9 | (var9 << 1956503792 | var9 << -703197336);
                  gb.b(var10 - -param1, var8, var11 + -var10, var9);
                  var8++;
                  var7++;
                  continue L0;
                } else {
                  var8++;
                  var7++;
                  continue L0;
                }
              } else {
                var8++;
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    void m(int param0) {
        int var2 = -37 / ((param0 - -56) / 45);
    }

    void l(int param0) {
        if (!((this.field_U ^ -1) < param0)) {
            return;
        }
        this.a(this.field_W, (byte) -128, this.field_O);
        this.field_U = 0;
        this.m(param0 + -123);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        var5 = -119 / ((25 - param3) / 42);
        if ((param0 ^ -1) >= -1) {
          this.a(param2, (byte) -127, param1);
          return;
        } else {
          this.field_T = this.field_u;
          this.field_N = this.field_j;
          this.field_W = param2;
          this.field_U = param0;
          this.field_O = param1;
          this.field_Q = 0;
          return;
        }
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
