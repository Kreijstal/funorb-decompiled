/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends cj {
    private int field_Qb;
    static String field_Yb;
    static String field_Zb;
    private int field_Pb;
    static String field_Ib;
    static String field_Mb;
    private int field_Wb;
    private int field_Ob;
    private cj field_Rb;
    static boolean field_Hb;
    static String field_Sb;
    private ja[] field_Ub;
    static int field_Lb;
    private int field_Kb;
    private cj field_Fb;
    private int[] field_Xb;
    private int field_Jb;
    static ja[] field_Nb;
    static String field_Gb;
    private int field_Vb;
    private mo[] field_Tb;

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ZombieDawnMulti.field_E ? 1 : 0;
          if (0 != ((sn) this).field_Vb) {
            break L0;
          } else {
            ((sn) this).field_Tb[((sn) this).field_Vb] = new mo(0L, (cj) null, (cj) null, ((sn) this).field_Fb, (ja) null, bg.field_a);
            ((sn) this).field_Tb[((sn) this).field_Vb].field_lb = 1;
            ((sn) this).a((byte) 50, (cj) (Object) ((sn) this).field_Tb[((sn) this).field_Vb]);
            ((sn) this).field_Xb[((sn) this).field_Vb] = -1;
            ((sn) this).field_Vb = ((sn) this).field_Vb + 1;
            break L0;
          }
        }
        var6 = 0;
        var7 = 0;
        L1: while (true) {
          if (var7 >= ((sn) this).field_Vb) {
            var6 = var6 + ((sn) this).field_Jb * 2;
            var7 = ((sn) this).field_Qb + ((sn) this).field_Qb + ((sn) this).field_Vb * ((sn) this).field_Wb;
            if (param0 == 4542) {
              var8 = qp.a(param1, (byte) 30, var6, param4);
              var9 = br.a(true, param3, param2, var7);
              ((sn) this).a(var7, var9, var6, var8, -3344);
              var10 = 0;
              L2: while (true) {
                if (((sn) this).field_Vb <= var10) {
                  return;
                } else {
                  ((sn) this).field_Tb[var10].a(((sn) this).field_Kb, param0 + -4540, ((sn) this).field_Wb, var6 - ((sn) this).field_Jb * 2, ((sn) this).field_Jb, ((sn) this).field_Wb * var10 + ((sn) this).field_Qb, ((sn) this).field_Pb);
                  var10++;
                  continue L2;
                }
              }
            } else {
              return;
            }
          } else {
            var8 = ((sn) this).field_Tb[var7].a(((sn) this).field_Pb, false, ((sn) this).field_Kb);
            if (var8 > var6) {
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

    final int e(boolean param0, int param1) {
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ((sn) this).a(-11838, param0);
        if (!(param0)) {
            return -2;
        }
        for (var3 = 0; ((sn) this).field_Vb > var3; var3++) {
            if (0 != ((sn) this).field_Tb[var3].field_T) {
                return ((sn) this).field_Xb[var3];
            }
        }
        if (param1 != -1839469055) {
            Object var5 = null;
            ((sn) this).a((byte) 97, (String) null, -128);
        }
        if (kd.field_b != 0) {
            return -1;
        }
        return ((sn) this).field_Ob;
    }

    sn(sn param0) {
        this((cj) (Object) param0, param0.field_Ub, param0.field_Fb, param0.field_Rb, param0.field_Jb, param0.field_Pb, param0.field_Kb, param0.field_Qb, param0.field_Wb);
    }

    final boolean d(byte param0) {
        if (param0 < 71) {
            Object var3 = null;
            sn.a(3, (k) null);
        }
        if (!(((sn) this).field_Ob == -2)) {
            return false;
        }
        if (sj.field_p == 13) {
            ((sn) this).field_Ob = -1;
            return true;
        }
        return true;
    }

    public static void c(byte param0) {
        field_Zb = null;
        field_Sb = null;
        field_Gb = null;
        field_Yb = null;
        field_Mb = null;
        if (param0 < 112) {
            field_Nb = null;
        }
        field_Ib = null;
        field_Nb = null;
    }

    final static void a(int param0, k param1) {
        int var2_int = 0;
        try {
            vn.field_e = param1.d((byte) 69) << 5;
            var2_int = param1.g(param0 + 27315);
            ao.field_c = (var2_int & 7) << 18;
            vn.field_e = vn.field_e + (var2_int >> 3);
            ao.field_c = ao.field_c + (param1.d((byte) 69) << 2);
            var2_int = param1.g(31365);
            ao.field_c = ao.field_c + (var2_int >> 6);
            jq.field_a = var2_int << 15 & 2064384;
            if (param0 != 4050) {
                sn.c((byte) 16);
            }
            jq.field_a = jq.field_a + (param1.g(31365) << 7);
            var2_int = param1.g(31365);
            qc.field_q = var2_int << 16 & 65536;
            jq.field_a = jq.field_a + (var2_int >> 1);
            qc.field_q = qc.field_q + param1.d((byte) 69);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "sn.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    sn(cj param0, ja[] param1, cj param2, cj param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        ((sn) this).field_Ob = -2;
        ((sn) this).field_Xb = new int[256];
        ((sn) this).field_Tb = new mo[256];
        try {
            ((sn) this).field_Rb = param3;
            ((sn) this).field_Ub = param1;
            ((sn) this).field_Qb = param7;
            ((sn) this).field_Pb = param5;
            ((sn) this).field_Wb = param8;
            ((sn) this).field_Jb = param4;
            ((sn) this).field_Fb = param2;
            ((sn) this).field_Kb = param6;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "sn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(byte param0, String param1, int param2) {
        RuntimeException runtimeException = null;
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
              ((sn) this).field_Tb[((sn) this).field_Vb] = new mo(0L, (cj) null, (cj) null, ((sn) this).field_Rb, (ja) null, param1);
              ((sn) this).field_Tb[((sn) this).field_Vb].field_X = ((sn) this).field_Ub;
              ((sn) this).field_Tb[((sn) this).field_Vb].field_ib = true;
              ((sn) this).field_Tb[((sn) this).field_Vb].field_lb = 1;
              ((sn) this).a((byte) 50, (cj) (Object) ((sn) this).field_Tb[((sn) this).field_Vb]);
              ((sn) this).field_Xb[((sn) this).field_Vb] = param2;
              ((sn) this).field_Vb = ((sn) this).field_Vb + 1;
              if (param0 == -118) {
                break L1;
              } else {
                boolean discarded$2 = ((sn) this).d((byte) 122);
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
            stackOut_3_1 = new StringBuilder().append("sn.GA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final void a(ja param0, int param1, String param2, boolean param3) {
        try {
            ((sn) this).field_Tb[((sn) this).field_Vb] = new mo(0L, (cj) null, (cj) null, ((sn) this).field_Rb, param0, param2);
            ((sn) this).field_Tb[((sn) this).field_Vb].field_X = ((sn) this).field_Ub;
            ((sn) this).field_Tb[((sn) this).field_Vb].field_ib = param3 ? true : false;
            ((sn) this).field_Tb[((sn) this).field_Vb].field_lb = 1;
            ((sn) this).a((byte) 50, (cj) (Object) ((sn) this).field_Tb[((sn) this).field_Vb]);
            ((sn) this).field_Xb[((sn) this).field_Vb] = param1;
            ((sn) this).field_Vb = ((sn) this).field_Vb + 1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "sn.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Sb = "You know what you want, they should too.";
        field_Yb = "EXCLUSIVE";
        field_Mb = "Achievements this game:";
        field_Gb = "Play rated game";
        field_Zb = "Back";
    }
}
