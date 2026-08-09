/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends lc implements rc {
    private tj field_F;
    private wd[] field_H;
    private int field_B;
    private int[] field_J;
    private sh field_I;
    static int[] field_D;
    private String field_z;
    static int field_A;
    static lj field_E;
    static int field_C;

    uc(sh param0, tj param1, String param2) {
        super(0, 0, 288, 0, (fc) null);
        int var4_int = 0;
        this.field_B = 0;
        try {
            this.field_I = param0;
            this.field_F = param1;
            this.field_z = param2;
            var4_int = null != this.field_z ? this.field_F.b(this.field_z, 260, this.field_F.field_s) : 0;
            this.b(var4_int + 22, 80, 288, 0, 0);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "uc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final wd a(String param0, sk param1, int param2) {
        wd var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        wd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new wd(param0, param1);
              var4.field_j = (fc) ((Object) new jh());
              var5 = -2 + this.field_m;
              this.b(this.field_m - -34, 80, this.field_k, 0, 0);
              var4.b(30, param2 + 84, -14 + this.field_k, 7, var5);
              this.b(var4, true);
              if (param2 == -4) {
                break L1;
              } else {
                uc.a(-89, 'ﾁ');
                break L1;
              }
            }
            stackIn_3_0 = (wd) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("uc.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 <= 33) {
          this.a(78, 87);
          super.a(param0, param1, 50, param3);
          this.field_F.a(this.field_z, 14 + (param3 - -this.field_r), this.field_i + (param1 - -10), -28 + this.field_k, this.field_m, 16777215, -1, 0, 0, this.field_F.field_s);
          return;
        } else {
          super.a(param0, param1, 50, param3);
          this.field_F.a(this.field_z, 14 + (param3 - -this.field_r), this.field_i + (param1 - -10), -28 + this.field_k, this.field_m, 16777215, -1, 0, 0, this.field_F.field_s);
          return;
        }
    }

    final void a(String param0, int param1, byte param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_B;
            this.a(-28, var4_int + 1);
            if (param2 <= 58) {
                this.field_I = (sh) null;
            }
            this.field_H[var4_int] = this.a(param0, (sk) (this), -4);
            this.field_J[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "uc.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void e(byte param0) {
        field_E = null;
        field_D = null;
        if (param0 != 28) {
            uc.e((byte) 127);
        }
    }

    final static boolean a(int param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (md.a(param0 + 108, param1)) {
            return true;
          } else {
            if (param1 != 45) {
              if (param1 != 160) {
                if (param1 != 32) {
                  if (param1 != 95) {
                    if (param0 != 2) {
                      field_C = -128;
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = Bounce.field_N;
        if (!(param1 > this.field_B)) {
            return;
        }
        wd[] var7 = new wd[param1];
        wd[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; this.field_B > var5; var5++) {
            var7[var5] = this.field_H[var5];
            var4[var5] = this.field_J[var5];
        }
        this.field_J = var4;
        this.field_B = param1;
        var5 = -52 % ((-62 - param0) / 34);
        this.field_H = var3;
    }

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                if (this.field_B <= var6_int) {
                  break L2;
                } else {
                  if (param4 == this.field_H[var6_int]) {
                    var7 = this.field_J[var6_int];
                    if ((var7 ^ -1) == 0) {
                      this.field_I.a(true);
                      break L2;
                    } else {
                      oh.a(104, this.field_J[var6_int]);
                      break L2;
                    }
                  } else {
                    var6_int++;
                    continue L1;
                  }
                }
              }
              if (param0 >= 6) {
                break L0;
              } else {
                this.field_F = (tj) null;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("uc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static void a(gk param0, int param1, gk param2, gk param3) {
        tg var17 = null;
        we[] var5 = null;
        we[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        we[] var14 = null;
        int var11_int = 0;
        tg var15 = null;
        tg var18 = null;
        tg var11 = null;
        tg var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = Bounce.field_N;
        try {
            ij.field_c = vh.a(param0, "commonui", (byte) -38, "frame_top");
            de.field_d = vh.a(param0, "commonui", (byte) 114, "frame_bottom");
            fd.field_m = nc.a("jagex_logo_grey", param0, "commonui", 0);
            ih.field_T = vh.a(param0, "commonui", (byte) 111, "button");
            la.field_E = ri.a("commonui", param0, false, "validation");
            qj.field_d = (tj) ((Object) eg.a(param2, "arezzo12", 127, param0, "commonui"));
            sg.field_a = (tj) ((Object) eg.a(param2, "arezzo14", 122, param0, "commonui"));
            ne.field_v = (tj) ((Object) eg.a(param2, "arezzo14bold", 117, param0, "commonui"));
            if (param1 <= 77) {
                field_E = (lj) null;
            }
            var17 = new tg(param3.b("button.gif", "", 124), (java.awt.Component) ((Object) ch.field_h));
            s.a(param0, "dropdown", 28576, "commonui");
            var5 = ff.a("screen_options", param0, (byte) 124, "commonui");
            nh.field_R = new we[4];
            ga.field_d = new we[4];
            tc.field_s = new we[4];
            var6 = new we[][]{ga.field_d, tc.field_s, nh.field_R};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_i;
            for (var8 = 1; var19.length > var8; var8++) {
                var7[var8] = (int[]) ((Object) var19[0].clone());
            }
            var8 = var5[0].field_j[0];
            var19[2][var8] = 16777215;
            var19[1][var8] = 2394342;
            var19[3][var8] = 4767999;
            for (var9 = 0; -4 < (var9 ^ -1); var9++) {
                var14 = var6[var9];
                we[] var10 = var14;
                for (var11_int = 0; var14.length > var11_int; var11_int++) {
                    var14[var11_int] = jd.a(-30894, var19[var11_int], var5[var9]);
                }
            }
            var9 = var17.field_q;
            wa.a(true);
            var17.d();
            na.f(0, 0, na.field_e, na.field_k);
            var15 = new tg(var9, var9);
            var18 = var15;
            var18.d();
            var17.b(0, 0);
            var11 = new tg(var9, var9);
            var11.d();
            var17.b(-var17.field_s + var9, 0);
            var12 = new tg(var17.field_s + -(2 * var9), var9);
            var12.d();
            var17.b(-var9, 0);
            ve.a(-125);
            ih.field_T = new tg[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "uc.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_D = new int[8192];
        field_E = new lj();
        field_C = 0;
    }
}
