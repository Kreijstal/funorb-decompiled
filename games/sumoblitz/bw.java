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
        RuntimeException var3 = null;
        int var4 = 0;
        ha var5 = null;
        int var6 = 0;
        hr[] var7 = null;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param0) {
              wo.a(up.field_c, 360, -5, -16777216, 3, param1, 650, 50, 1, param0);
              hc.field_e.a(hc.field_d, -1, -16777216, 150, 320, 0);
              var3_int = 45;
              var4 = 0;
              L1: while (true) {
                if (var3_int >= 600) {
                  break L0;
                } else {
                  L2: {
                    var5 = param1;
                    var6 = var3_int;
                    var7 = up.field_c;
                    wo.a(var7, 100, var6, 0, 1, var5, 250, 200, 1, true);
                    if (((bw) this).field_a == var4) {
                      be.field_t.a(vd.field_a[var4], -1, -16777216, 258, var3_int + 121, 0);
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
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("bw.J(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final static wb[] b() {
        wb[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var14 = null;
        int[] var17 = null;
        int[] var21 = null;
        byte[] var22 = null;
        int[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        var1 = new wb[rl.field_n];
        var2 = 0;
        var3 = 126;
        L0: while (true) {
          if (var2 >= rl.field_n) {
            tl.a((byte) -46);
            return var1;
          } else {
            var4 = we.field_B[var2] * vg.field_k[var2];
            var22 = ag.field_d[var2];
            if (og.field_d[var2]) {
              var24 = fl.field_o[var2];
              var25 = new int[var4];
              var21 = var25;
              var17 = var21;
              var14 = var17;
              var7 = var14;
              var8 = 0;
              L1: while (true) {
                if (var8 >= var4) {
                  var1[var2] = (wb) (Object) new mg(vf.field_d, li.field_u, er.field_h[var2], av.field_C[var2], vg.field_k[var2], we.field_B[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var7[var8] = ic.a(iv.field_l[eb.a((int) var22[var8], 255)], eb.a((int) var24[var8], 255) << 24);
                  var8++;
                  continue L1;
                }
              }
            } else {
              var10 = new int[var4];
              var23 = var10;
              var7_int = 0;
              L2: while (true) {
                if (var7_int >= var4) {
                  var1[var2] = new wb(vf.field_d, li.field_u, er.field_h[var2], av.field_C[var2], vg.field_k[var2], we.field_B[var2], var23);
                  var2++;
                  continue L0;
                } else {
                  var10[var7_int] = iv.field_l[eb.a((int) var22[var7_int], 255)];
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
            field_c = null;
        }
        int var2 = (ko.field_p + -45) / 300;
        int var3 = (pi.field_e + -200) / 100;
        ((bw) this).field_a = var2 + 2 * var3;
        if (-251 > (ko.field_p - 45) % 300) {
            ((bw) this).field_a = -1;
        }
        if (!(-3 > ((bw) this).field_a)) {
            ((bw) this).field_a = -1;
        }
        if (hk.field_c == 1) {
            if (((bw) this).field_a != 0) {
                av.a(-7753, true, 7);
                ut.field_j = 0;
                ag.a(0, 0);
                ph.field_b.a(88);
                ((bw) this).b((byte) -128);
            } else {
                wt.a(1 + oh.field_e % 5, (byte) 56);
                ((bw) this).b((byte) -127);
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
                Object var6 = null;
                bw.a(true, (java.applet.Applet) null);
            }
            var3 = "rvnadlm";
            var4 = -1L;
            gj.a(var4, param1, true, var3, var2);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "bw.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public bw() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "REASSIGN POWERUPS";
    }
}
