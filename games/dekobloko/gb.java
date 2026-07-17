/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends w {
    static int[] field_Pb;
    static String field_ac;
    private ck[] field_cc;
    static boolean field_Zb;
    private qd[] field_Wb;
    static int field_Vb;
    private int field_bc;
    private int field_Rb;
    private int field_Sb;
    private w field_ec;
    private w field_Qb;
    private int field_Ub;
    private int[] field_Yb;
    private int field_dc;
    private int field_Xb;
    static String field_Tb;
    private int field_Nb;
    static int field_Ob;

    final boolean f(int param0) {
        if (((gb) this).field_dc != -2) {
            return false;
        }
        int var2 = -62 % ((-76 - param0) / 48);
        if (wh.field_c != 13) {
            return true;
        }
        ((gb) this).field_dc = -1;
        return true;
    }

    final int b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        ((gb) this).a(false, param1);
        if (!param1) {
            return -2;
        }
        for (var3 = 0; var3 < ((gb) this).field_Rb; var3++) {
            if (((gb) this).field_Wb[var3].field_ob != 0) {
                return ((gb) this).field_Yb[var3];
            }
        }
        if (!(0 == ig.field_Yb)) {
            return -1;
        }
        var3 = -1 / ((param0 - 52) / 63);
        return ((gb) this).field_dc;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        L0: {
          var11 = client.field_A ? 1 : 0;
          if (0 != ((gb) this).field_Rb) {
            break L0;
          } else {
            ((gb) this).field_Wb[((gb) this).field_Rb] = new qd(0L, (w) null, (w) null, ((gb) this).field_Qb, (ck) null, on.field_i);
            ((gb) this).field_Wb[((gb) this).field_Rb].field_W = 1;
            ((gb) this).a((w) (Object) ((gb) this).field_Wb[((gb) this).field_Rb], -16834);
            ((gb) this).field_Yb[((gb) this).field_Rb] = -1;
            ((gb) this).field_Rb = ((gb) this).field_Rb + 1;
            break L0;
          }
        }
        var6 = 0;
        var7 = 0;
        L1: while (true) {
          if (((gb) this).field_Rb <= var7) {
            L2: {
              var6 = var6 + ((gb) this).field_Sb * 2;
              var7 = ((gb) this).field_Rb * ((gb) this).field_Xb + ((gb) this).field_bc - -((gb) this).field_bc;
              var8 = vh.a(param4, -18265, var6, param1);
              var9 = o.a(param3, 0, var7, param0);
              ((gb) this).a(var6, 0, var9, var7, var8);
              if (param2 >= 38) {
                break L2;
              } else {
                var12 = null;
                ((gb) this).a((String) null, -17, -15);
                break L2;
              }
            }
            var10 = 0;
            L3: while (true) {
              if (var10 >= ((gb) this).field_Rb) {
                return;
              } else {
                ((gb) this).field_Wb[var10].a(((gb) this).field_Xb, ((gb) this).field_Ub, ((gb) this).field_Sb, ((gb) this).field_bc + ((gb) this).field_Xb * var10, -(((gb) this).field_Sb * 2) + var6, ((gb) this).field_Nb, 500);
                var10++;
                continue L3;
              }
            }
          } else {
            var8 = ((gb) this).field_Wb[var7].b(((gb) this).field_Ub, ((gb) this).field_Nb, 1940);
            if (var6 < var8) {
              var6 = var8;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, String param1) {
        rm.a((byte) 73, param1);
        if (param0 >= -68) {
            return;
        }
        try {
            wi.a(false, -106, jc.field_a);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "gb.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(int param0, ji param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var5 = param1.a(param2, 108, param0);
            var4 = var5;
            if (param3 > 34) {
              if (var5 != null) {
                eh.a((byte) -72, var5);
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("gb.K(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0, boolean param1, byte param2, int param3) {
        if (!(jh.field_h)) {
            return;
        }
        ie.field_c.a(false, param1);
        int var4 = mg.field_bc.f(-1) ? 1 : 0;
        if (ig.field_Yb != 0) {
            if (var4 == 0) {
                param1 = false;
                qn.l(13);
            }
        }
        if (!(!param1)) {
            mg.field_bc.a(param3, param0, -115);
        }
        if (!(var4 == 0)) {
            ie.field_c.a(false, param1);
        }
        int var5 = -27 % ((param2 - -66) / 56);
        int var6 = mg.field_bc.g(-108) + mg.field_bc.field_E;
        if (var6 > 640) {
            l.field_f = l.field_f + 5;
        } else {
            if (var6 < 635) {
                if (!(0 >= l.field_f)) {
                    l.field_f = l.field_f - 5;
                }
            }
        }
    }

    final void a(int param0, int param1, ck param2, String param3) {
        ((gb) this).field_Wb[((gb) this).field_Rb] = new qd(0L, (w) null, (w) null, ((gb) this).field_ec, param2, param3);
        ((gb) this).field_Wb[((gb) this).field_Rb].field_S = ((gb) this).field_cc;
        ((gb) this).field_Wb[((gb) this).field_Rb].field_Gb = true;
        ((gb) this).field_Wb[((gb) this).field_Rb].field_W = 1;
        ((gb) this).a((w) (Object) ((gb) this).field_Wb[((gb) this).field_Rb], -16834);
        ((gb) this).field_Yb[((gb) this).field_Rb] = param1;
        if (param0 != 4193) {
            return;
        }
        try {
            ((gb) this).field_Rb = ((gb) this).field_Rb + 1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "gb.C(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    gb(gb param0) {
        this((w) (Object) param0, param0.field_cc, param0.field_Qb, param0.field_ec, param0.field_Sb, param0.field_Ub, param0.field_Nb, param0.field_bc, param0.field_Xb);
    }

    gb(w param0, ck[] param1, w param2, w param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        ((gb) this).field_Wb = new qd[256];
        ((gb) this).field_Yb = new int[256];
        ((gb) this).field_dc = -2;
        try {
            ((gb) this).field_ec = param3;
            ((gb) this).field_Sb = param4;
            ((gb) this).field_Xb = param8;
            ((gb) this).field_Ub = param5;
            ((gb) this).field_Nb = param6;
            ((gb) this).field_Qb = param2;
            ((gb) this).field_cc = param1;
            ((gb) this).field_bc = param7;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "gb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final void a(String param0, int param1, int param2) {
        try {
            ((gb) this).field_Wb[((gb) this).field_Rb] = new qd(0L, (w) null, (w) null, ((gb) this).field_ec, (ck) null, param0);
            ((gb) this).field_Wb[((gb) this).field_Rb].field_S = ((gb) this).field_cc;
            ((gb) this).field_Wb[((gb) this).field_Rb].field_Gb = true;
            ((gb) this).field_Wb[((gb) this).field_Rb].field_W = 1;
            int var4_int = -81 / ((24 - param2) / 32);
            ((gb) this).a((w) (Object) ((gb) this).field_Wb[((gb) this).field_Rb], -16834);
            ((gb) this).field_Yb[((gb) this).field_Rb] = param1;
            ((gb) this).field_Rb = ((gb) this).field_Rb + 1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "gb.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void e(int param0) {
        field_ac = null;
        field_Pb = null;
        field_Tb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ac = "Join";
        field_Vb = 0;
        field_Tb = "Encouraging rule breaking";
        field_Pb = new int[12];
        field_Ob = field_Vb;
    }
}
