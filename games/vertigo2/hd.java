/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hd {
    static String field_c;
    static long[] field_d;
    private int field_a;
    static cc field_f;
    static cr field_g;
    static String field_h;
    private nj field_e;
    static r field_b;

    final int a(byte param0, int param1) {
        vp var4 = null;
        bo var5 = null;
        int var6 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -17) {
            return -89;
        }
        bo var3 = (bo) ((Object) this.field_e.c((byte) -30));
        while (var3 != null) {
            if (!(param1 != var3.field_q)) {
                var4 = new vp(this.field_e);
                var5 = (bo) ((Object) var4.a(var3, 3));
                while (var5 != null) {
                    var5.c(param0 ^ -19);
                    var5 = (bo) ((Object) var4.a((byte) 23));
                }
                return var3.field_s;
            }
            var3 = (bo) ((Object) this.field_e.b(false));
        }
        return 0;
    }

    final int a(boolean param0, int param1) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        bo var3 = (bo) ((Object) this.field_e.a((byte) 100));
        while (var3 != null) {
            if (param1 >= var3.field_s) {
                if (!(10 + var3.field_s <= param1)) {
                    return var3.field_o[param1 - var3.field_s];
                }
            }
            var3 = (bo) ((Object) this.field_e.b(39));
        }
        if (!param0) {
            return -20;
        }
        return -1;
    }

    final int a(int param0) {
        if (param0 != 16777215) {
            return 90;
        }
        return this.field_e.c(true);
    }

    final void a(boolean param0) {
        mi var2;
        bo var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        var2 = uh.field_Wb;
        if (!param0) {
          var3 = (bo) ((Object) this.field_e.a((byte) 100));
          L0: while (true) {
            L1: {
              if (var3 == null) {
                break L1;
              } else {
                if (-10 <= (-var2.field_u + var2.field_p.length ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    if (var3.field_n) {
                      break L2;
                    } else {
                      if (Math.random() < 0.7) {
                        break L1;
                      } else {
                        if (!var3.a((byte) 76)) {
                          break L1;
                        } else {
                          var3.a(0, var2);
                          var3.field_n = true;
                          break L2;
                        }
                      }
                    }
                  }
                  var3 = (bo) ((Object) this.field_e.b(57));
                  continue L0;
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 7829367) {
            field_h = (String) null;
        }
        if ((this.field_e.c(true) ^ -1) <= -255) {
            return;
        }
        bo var4 = (bo) ((Object) this.field_e.c((byte) -125));
        if (var4 == null) {
            var4 = new bo(this.field_a, param0);
            this.field_e.a(var4, false);
        } else {
            if (var4.a((byte) 76)) {
                var4 = new bo(this.field_a, param0);
                this.field_e.a(var4, false);
            }
        }
        var4.b(param1, param2 + -7829378);
    }

    final static int b(boolean param0) {
        if (param0) {
            return -24;
        }
        return 1900 + new Date().getYear();
    }

    public static void b(int param0) {
        field_g = null;
        field_b = null;
        field_c = null;
        field_d = null;
        field_h = null;
        if (param0 != 1) {
            return;
        }
        field_f = null;
    }

    final int a(int param0, int param1, byte param2, int param3, int param4) {
        Object var16 = null;
        int var17 = Vertigo2.field_L ? 1 : 0;
        int var6 = param4 / 5;
        int var7 = param1 / 4;
        int var8 = (640 - 2 * var6) / (param4 - -var6);
        int var9 = this.field_e.c(true) / var8;
        int var10 = this.field_e.c(true) - var9 * var8;
        if (-1 == (var9 ^ -1)) {
            if (!(var10 != 0)) {
                return param3;
            }
        }
        param3 = param3 - var7;
        bi.b(var6, param3 + -var7 - 2 * (var7 + param1), 640 - 2 * var6, (param1 - -var7) * 2 - -var7, 1, 200);
        bi.e(var6, -((var7 + param1) * 2) + (param3 + -var7), 640 - 2 * var6, var7 + (param1 - -var7) * 2, 16777215);
        param3 = param3 - (param1 - -var7);
        int var11 = var6 * 2;
        int var12 = (param1 - -tk.field_c.field_z + tk.field_c.field_M) / 2;
        bi.e(var11, param3, param4, param1, 16776960);
        var11 = var11 + (var6 + param4);
        String var18 = "start <gt>= auth tic";
        tk.field_c.b(var18, var11, var12 + param3, 16777215, -1);
        var11 = var11 + (tk.field_c.a(var18, 640) + var6);
        bi.e(var11, param3, param4, param1, 16711680);
        String var19 = "end <lt>= auth tic";
        var11 = var11 + (param4 + var6);
        tk.field_c.b(var19, var11, param3 + var12, 16777215, -1);
        var11 = var11 + (var6 - -tk.field_c.a(var19, 640));
        bi.e(var11, param3, param4, param1, 65280);
        var11 = var11 + (param4 - -var6);
        String var20 = "startTic<lt>=authoritativeTic&&authoritativeTic<lt>endTic";
        tk.field_c.b(var20, var11, var12 + param3, 16777215, -1);
        var11 = var11 + (var6 - -tk.field_c.a(var20, 640));
        param3 = param3 - (var7 + param1);
        var11 = 2 * var6;
        bi.b(var11, param3, param4, param1, 34816, 180);
        String var21 = "got ack";
        var11 = var11 + (param4 - -var6);
        tk.field_c.b(var21, var11, param3 + var12, 16777215, -1);
        if (param2 != 51) {
            this.a((byte) -125, 58);
        }
        var11 = var11 + (var6 - -tk.field_c.a(var21, 640));
        bi.b(var11, param3, param4, param1, 8912896, 180);
        var11 = var11 + (var6 + param4);
        String var22 = "transmitted";
        String var13 = var22;
        tk.field_c.b(var13, var11, param3 - -var12, 16777215, -1);
        var11 = var11 + (var6 + tk.field_c.a(var22, 640));
        bi.b(var11, param3, param4, param1, 7829367, 180);
        String var23 = "not transmitted";
        var13 = var23;
        var11 = var11 + (param4 - -var6);
        tk.field_c.b(var13, var11, param3 - -var12, 16777215, -1);
        var11 = var11 + (tk.field_c.a(var23, 640) + var6);
        param3 = param3 - var7 * 2;
        if (0 == var10) {
            var10 = var8;
        }
        param3 = param3 - (var7 + param1);
        int var14 = -((param4 - -var6) * (var8 + -var10)) + -var6 + (640 + -param4);
        int var15 = var10;
        bo var16_ref = (bo) ((Object) this.field_e.c((byte) -24));
        while (var16_ref != null) {
            if (var16_ref.field_n) {
                bi.b(var14, param3, param4, param1, 8912896, 180);
            } else {
                bi.b(var14, param3, param4, param1, 7829367, 180);
            }
            if (var16_ref.field_s > param0) {
                bi.e(var14, param3, param4, param1, 16776960);
            } else {
                if (var16_ref.field_s - -10 > param0) {
                    bi.e(var14, param3, param4, param1, 65280);
                } else {
                    bi.e(var14, param3, param4, param1, 16711680);
                }
            }
            var15--;
            var14 = var14 - (param4 + var6);
            if (!(-1 != (var15 ^ -1))) {
                param3 = param3 - (var7 + param1);
                var15 = var8;
                var14 = -param4 + (640 - var6);
            }
            var16_ref = (bo) ((Object) this.field_e.b(false));
        }
        return param3;
    }

    final static void a(byte param0) {
        nm.field_J = false;
        rp.field_e = null;
        bl.field_z = null;
        jo.field_g = null;
        ba.field_b = null;
        if (param0 != 47) {
            field_f = (cc) null;
        }
    }

    hd(int param0, int param1) {
        this.field_a = param0;
        if ((this.field_a ^ -1) <= -1) {
            this.field_e = new nj();
        }
    }

    static {
        field_c = "Red got <%0>. Blue got <%1>.";
        field_d = new long[32];
        field_h = "New medal awarded!";
    }
}
