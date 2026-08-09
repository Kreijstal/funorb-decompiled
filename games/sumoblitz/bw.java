/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bw extends qt {
    static boolean field_d;
    static String field_c;

    public static void c(byte param0) {
        if (param0 <= 110) {
            bw.c((byte) 4);
        }
        field_c = null;
    }

    final void a(boolean param0, ha param1) {
        int var3_int = 0;
        int var4 = 0;
        ha var5 = null;
        int var6 = 0;
        hr[] var7 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param0) {
              wo.a(up.field_c, 360, -5, -16777216, 3, param1, 650, 50, 1, param0);
              hc.field_e.a(hc.field_d, -1, -16777216, 150, 320, 0);
              var3_int = 45;
              var4 = 0;
              L1: while (true) {
                if (-601 >= (var3_int ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var5 = param1;
                    var6 = var3_int;
                    var7 = up.field_c;
                    wo.a(var7, 100, var6, 0, 1, var5, 250, 200, 1, true);
                    if (this.field_a == var4) {
                      be.field_t.a(vd.field_a[var4], -1, -16777216, 258, var3_int - -125 - 4, 0);
                      break L2;
                    } else {
                      hc.field_e.a(vd.field_a[var4], -1, -16777216, 260, 125 + var3_int, 0);
                      break L2;
                    }
                  }
                  var4++;
                  var3_int += 300;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("bw.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static wb[] b(int param0) {
        wb[] var1;
        int var2;
        int var3;
        int var4;
        int[] var7;
        int var7_int;
        int var8;
        int var9;
        int[] var10;
        int[] var14;
        int[] var17;
        byte[] var21;
        int[] var22;
        byte[] var23;
        var9 = Sumoblitz.field_L ? 1 : 0;
        var1 = new wb[rl.field_n];
        var2 = 0;
        var3 = 126 / ((-69 - param0) / 52);
        L0: while (true) {
          if (var2 >= rl.field_n) {
            tl.a((byte) -46);
            return var1;
          } else {
            var4 = we.field_B[var2] * vg.field_k[var2];
            var21 = ag.field_d[var2];
            if (og.field_d[var2]) {
              var23 = fl.field_o[var2];
              var17 = new int[var4];
              var14 = var17;
              var7 = var14;
              var8 = 0;
              L1: while (true) {
                if (var8 >= var4) {
                  var1[var2] = (wb) ((Object) new mg(vf.field_d, li.field_u, er.field_h[var2], av.field_C[var2], vg.field_k[var2], we.field_B[var2], var17));
                  var2++;
                  continue L0;
                } else {
                  var7[var8] = ic.a(iv.field_l[eb.a((int) var21[var8], 255)], eb.a((int) var23[var8], 255) << 596863480);
                  var8++;
                  continue L1;
                }
              }
            } else {
              var10 = new int[var4];
              var22 = var10;
              var7_int = 0;
              L2: while (true) {
                if (var7_int >= var4) {
                  var1[var2] = new wb(vf.field_d, li.field_u, er.field_h[var2], av.field_C[var2], vg.field_k[var2], we.field_B[var2], var22);
                  var2++;
                  continue L0;
                } else {
                  var10[var7_int] = iv.field_l[eb.a((int) var21[var7_int], 255)];
                  var7_int++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void c(int param0) {
        if (param0 != 5008) {
            field_c = (String) null;
        }
        int var2 = (ko.field_p + -45) / 300;
        int var3 = (pi.field_e + -200) / 100;
        this.field_a = var2 + 2 * var3;
        if (-251 > ((ko.field_p - 45) % 300 ^ -1)) {
            this.field_a = -1;
        }
        if (!(-3 < (this.field_a ^ -1))) {
            this.field_a = -1;
        }
        if (hk.field_c == 1) {
            if (this.field_a != 0) {
                av.a(-7753, true, 7);
                ut.field_j = 0;
                ag.a(0, 0);
                ph.field_b.a(88);
                this.b((byte) -128);
            } else {
                wt.a(1 + oh.field_e % 5, (byte) 56);
                this.b((byte) -127);
            }
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            rq.field_d = true;
            var2 = "tuhstatbut";
            if (param0) {
                java.applet.Applet var6 = (java.applet.Applet) null;
                bw.a(true, (java.applet.Applet) null);
            }
            var3 = "rvnadlm";
            var4 = -1L;
            gj.a(var4, param1, true, var3, var2);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "bw.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public bw() {
    }

    static {
        field_c = "REASSIGN POWERUPS";
    }
}
