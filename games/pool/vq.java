/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vq extends vh {
    static String field_bc;
    private dd[] field_Pb;
    static dd field_Yb;
    private int field_cc;
    private int field_Nb;
    static int[] field_Ub;
    private vh field_Wb;
    static String field_Zb;
    static String field_Xb;
    private int field_Qb;
    static boolean field_Sb;
    static int field_Ob;
    private uo[] field_Rb;
    private int field_ac;
    private int field_Lb;
    private vh field_Tb;
    private int field_Mb;
    private int[] field_dc;
    private int field_Vb;

    public static void f(int param0) {
        field_bc = null;
        field_Zb = null;
        field_Ub = null;
        field_Xb = null;
        field_Yb = null;
    }

    final boolean f(byte param0) {
        if (!(-2 == ((vq) this).field_Qb)) {
            return false;
        }
        if (qi.field_a == 13) {
            ((vq) this).field_Qb = -1;
        }
        int var2 = -37 % ((7 - param0) / 56);
        return true;
    }

    final static boolean a(char param0, int param1) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            L2: {
              if (param0 < 65) {
                break L2;
              } else {
                if (param0 <= 90) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 < 97) {
                break L3;
              } else {
                if (param0 > 122) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L0;
        }
        return stackIn_8_0 != 0;
    }

    final void a(String param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        Object var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((vq) this).field_Rb[((vq) this).field_Nb] = new uo(0L, (vh) null, (vh) null, ((vq) this).field_Tb, (dd) null, param0);
              ((vq) this).field_Rb[((vq) this).field_Nb].field_Gb = ((vq) this).field_Pb;
              ((vq) this).field_Rb[((vq) this).field_Nb].field_J = true;
              ((vq) this).field_Rb[((vq) this).field_Nb].field_cb = 1;
              ((vq) this).a(-103, (vh) (Object) ((vq) this).field_Rb[((vq) this).field_Nb]);
              ((vq) this).field_dc[((vq) this).field_Nb] = param2;
              ((vq) this).field_Nb = ((vq) this).field_Nb + 1;
              if (param1 == 17130) {
                break L1;
              } else {
                var5 = null;
                ((vq) this).a(-100, (byte) -124, (dd) null, (String) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("vq.G(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((vq) this).field_Nb != 0) {
            break L0;
          } else {
            ((vq) this).field_Rb[((vq) this).field_Nb] = new uo(0L, (vh) null, (vh) null, ((vq) this).field_Wb, (dd) null, np.field_g);
            ((vq) this).field_Rb[((vq) this).field_Nb].field_cb = 1;
            ((vq) this).a(76, (vh) (Object) ((vq) this).field_Rb[((vq) this).field_Nb]);
            ((vq) this).field_dc[((vq) this).field_Nb] = -1;
            ((vq) this).field_Nb = ((vq) this).field_Nb + 1;
            break L0;
          }
        }
        var6 = 0;
        var7 = 0;
        L1: while (true) {
          if (var7 >= ((vq) this).field_Nb) {
            var6 = var6 + 2 * ((vq) this).field_Mb;
            var7 = ((vq) this).field_Nb * ((vq) this).field_ac + ((vq) this).field_Lb - -((vq) this).field_Lb;
            var8 = de.a(var6, param0, param2, 0);
            var9 = sh.a(var7, param4, param3 + -1, param1);
            ((vq) this).b(var9, 2147483647, var8, var6, var7);
            var10 = param3;
            L2: while (true) {
              if (((vq) this).field_Nb <= var10) {
                return;
              } else {
                ((vq) this).field_Rb[var10].a(((vq) this).field_Mb, true, ((vq) this).field_Vb, ((vq) this).field_ac, ((vq) this).field_cc, var6 - ((vq) this).field_Mb * 2, ((vq) this).field_Lb + ((vq) this).field_ac * var10);
                var10++;
                continue L2;
              }
            }
          } else {
            var8 = ((vq) this).field_Rb[var7].a(0, ((vq) this).field_cc, ((vq) this).field_Vb);
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

    vq(vh param0, dd[] param1, vh param2, vh param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        ((vq) this).field_Qb = -2;
        ((vq) this).field_Rb = new uo[256];
        ((vq) this).field_dc = new int[256];
        try {
            ((vq) this).field_ac = param8;
            ((vq) this).field_Lb = param7;
            ((vq) this).field_Mb = param4;
            ((vq) this).field_Tb = param3;
            ((vq) this).field_cc = param6;
            ((vq) this).field_Wb = param2;
            ((vq) this).field_Vb = param5;
            ((vq) this).field_Pb = param1;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "vq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = Pool.field_O;
        ((vq) this).a(param1, false);
        if (!param1) {
            return -2;
        }
        if (param0 < 8) {
            return -81;
        }
        for (var3 = 0; var3 < ((vq) this).field_Nb; var3++) {
            if (!(((vq) this).field_Rb[var3].field_R == 0)) {
                return ((vq) this).field_dc[var3];
            }
        }
        if (ne.field_s != 0) {
            return -1;
        }
        return ((vq) this).field_Qb;
    }

    final void a(int param0, byte param1, dd param2, String param3) {
        try {
            ((vq) this).field_Rb[((vq) this).field_Nb] = new uo(0L, (vh) null, (vh) null, ((vq) this).field_Tb, param2, param3);
            ((vq) this).field_Rb[((vq) this).field_Nb].field_Gb = ((vq) this).field_Pb;
            ((vq) this).field_Rb[((vq) this).field_Nb].field_J = true;
            ((vq) this).field_Rb[((vq) this).field_Nb].field_cb = 1;
            ((vq) this).a(73, (vh) (Object) ((vq) this).field_Rb[((vq) this).field_Nb]);
            int var5_int = -81 / ((20 - param1) / 60);
            ((vq) this).field_dc[((vq) this).field_Nb] = param0;
            ((vq) this).field_Nb = ((vq) this).field_Nb + 1;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "vq.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    vq(vq param0) {
        this((vh) (Object) param0, param0.field_Pb, param0.field_Wb, param0.field_Tb, param0.field_Mb, param0.field_Vb, param0.field_cc, param0.field_Lb, param0.field_ac);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Zb = "You";
        field_Ub = new int[3];
        field_bc = "Disruptive behaviour";
    }
}
