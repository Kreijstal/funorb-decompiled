/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class e {
    short[] field_L;
    private boolean field_z;
    int[] field_Q;
    int[] field_m;
    short[] field_s;
    short[] field_n;
    int field_k;
    short[] field_v;
    static String field_I;
    short[] field_J;
    int[] field_D;
    static String field_q;
    short field_l;
    short field_M;
    short[] field_N;
    int field_i;
    int[] field_E;
    short[] field_e;
    short[] field_B;
    short field_C;
    short[] field_d;
    int[] field_a;
    byte[] field_y;
    int field_P;
    int[] field_g;
    int[] field_j;
    short[] field_H;
    short[] field_G;
    short[] field_f;
    int[] field_p;
    short[] field_b;
    int field_t;
    short[] field_o;
    short[] field_F;
    short[] field_r;
    static String field_x;
    int[] field_c;
    int field_O;
    int field_u;
    byte field_w;
    short[] field_A;
    short[] field_h;

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Transmogrify.field_A ? 1 : 0;
        if (!this.field_z) {
          this.field_z = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          if (param0 == 22856) {
            var5 = -32768;
            var6 = -32768;
            var7 = -32768;
            var8 = 0;
            L0: while (true) {
              if (var8 < this.field_M) {
                var9 = this.field_v[var8];
                var10 = this.field_d[var8];
                if (var12 == 0) {
                  L1: {
                    if (var10 > var6) {
                      var6 = var10;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (var9 <= var5) {
                      break L2;
                    } else {
                      var5 = var9;
                      break L2;
                    }
                  }
                  L3: {
                    if (var10 >= var3) {
                      break L3;
                    } else {
                      var3 = var10;
                      break L3;
                    }
                  }
                  L4: {
                    var11 = this.field_B[var8];
                    if (var9 < var2) {
                      var2 = var9;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var11 >= var4) {
                      break L5;
                    } else {
                      var4 = var11;
                      break L5;
                    }
                  }
                  L6: {
                    if (var7 >= var11) {
                      break L6;
                    } else {
                      var7 = var11;
                      break L6;
                    }
                  }
                  var8++;
                  continue L0;
                } else {
                  return;
                }
              } else {
                this.field_P = var2;
                this.field_i = var7;
                this.field_u = var6;
                this.field_O = var3;
                this.field_t = var5;
                this.field_k = var4;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        var5 = 0;
        if (param3 >= -126) {
          this.field_h = (short[]) null;
          L0: while (true) {
            if (this.field_M > var5) {
              this.field_v[var5] = (short)(this.field_v[var5] + param1);
              this.field_d[var5] = (short)(this.field_d[var5] + param2);
              this.field_B[var5] = (short)(this.field_B[var5] + param0);
              var5++;
              if (var6 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              this.c(10);
              return;
            }
          }
        } else {
          L1: while (true) {
            if (this.field_M > var5) {
              this.field_v[var5] = (short)(this.field_v[var5] + param1);
              this.field_d[var5] = (short)(this.field_d[var5] + param2);
              this.field_B[var5] = (short)(this.field_B[var5] + param0);
              var5++;
              if (var6 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              this.c(10);
              return;
            }
          }
        }
    }

    final static String a(long param0, byte param1) {
        String discarded$1 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        v.field_a.setTime(new Date(param0));
        var3 = v.field_a.get(7);
        var4 = v.field_a.get(5);
        var5 = v.field_a.get(2);
        var6 = v.field_a.get(1);
        var7 = v.field_a.get(11);
        if (param1 >= -76) {
          discarded$1 = e.a(-53L, (byte) 59);
          var8 = v.field_a.get(12);
          var9 = v.field_a.get(13);
          return bh.field_b[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + jj.field_b[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          var8 = v.field_a.get(12);
          var9 = v.field_a.get(13);
          return bh.field_b[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + jj.field_b[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    public static void b(int param0) {
        if (param0 <= 38) {
          field_q = (String) null;
          field_q = null;
          field_I = null;
          field_x = null;
          return;
        } else {
          field_q = null;
          field_I = null;
          field_x = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = Transmogrify.field_A ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= this.field_M) {
            this.c(param1 ^ -22855);
            if (param1 == -22861) {
              return;
            } else {
              this.c(118);
              return;
            }
          } else {
            this.field_v[var6] = (short)(param2 * this.field_v[var6] / param0);
            this.field_d[var6] = (short)(param3 * this.field_d[var6] / param0);
            this.field_B[var6] = (short)(this.field_B[var6] * param4 / param0);
            var6++;
            if (var7 != 0) {
              if (param1 == -22861) {
                return;
              } else {
                this.c(118);
                return;
              }
            } else {
              if (var7 == 0) {
                continue L0;
              } else {
                this.c(param1 ^ -22855);
                if (param1 == -22861) {
                  return;
                } else {
                  this.c(118);
                  return;
                }
              }
            }
          }
        }
    }

    private final void c(int param0) {
        this.field_z = false;
        if (param0 == 10) {
            return;
        }
        this.c(93);
    }

    e() {
        this.field_z = false;
        this.field_w = (byte) 0;
    }

    static {
        field_q = "Login: ";
        field_x = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
