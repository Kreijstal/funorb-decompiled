/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pm extends um implements ok {
    static String field_e;
    private tb field_d;
    static java.math.BigInteger field_c;

    final static void a(int param0, int param1, jc param2) {
        am var3 = dp.field_e;
        var3.j(11, param1);
        var3.i(5, -107);
        var3.i(param0, -98);
        var3.a(param2.field_s, (byte) 105);
        var3.i(param2.field_u, -114);
        var3.i(param2.field_o, param0 ^ -126);
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            pm.a(true);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final String c(int param0) {
        if (param0 > -48) {
            return null;
        }
        return ((pm) this).a(((pm) this).field_d.field_o, (byte) -117);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, vn[] param8, int param9, vn[] param10, rb param11, vn[] param12, byte param13, int param14) {
        int var15 = 0;
        int var16 = 0;
        var15 = param11.field_w + param11.field_x;
        var16 = param11.field_w;
        qo.a(param7, var15, param8, param5, param10, param11, param1, param2, param6, (byte) -75, var16, param0, param9, var15, param3, var16, param4, param14, param11, param12);
        if (param13 > -58) {
          field_e = null;
          return;
        } else {
          return;
        }
    }

    public final void b(tb param0, int param1) {
        int var3 = 101 % ((param1 - 35) / 38);
    }

    public final void a(tb param0, int param1) {
        ((pm) this).a(-7674);
        if (param1 != 8) {
            field_c = null;
        }
    }

    public final boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 > 98) {
          if (null != ((pm) this).field_d.field_o) {
            if (((pm) this).field_d.field_o.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_c = null;
          if (null == ((pm) this).field_d.field_o) {
            return true;
          } else {
            L0: {
              if (((pm) this).field_d.field_o.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void d(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = ZombieDawn.field_J;
        ej.field_a = new vn(60, 60);
        ej.field_a.a();
        bi.g(30, 30, 28, 4521728);
        og.field_x = new vn[8];
        var1 = 0;
        L0: while (true) {
          if (8 <= var1) {
            if (param0 != 36) {
              return;
            } else {
              cn.field_f.b(69);
              return;
            }
          } else {
            og.field_x[var1] = new vn(22, 22);
            og.field_x[var1].a();
            bi.g(11, 11, 2 + var1, 5622784);
            bi.g(11, 11, var1, 65793);
            var1++;
            continue L0;
          }
        }
    }

    abstract rh a(String param0, int param1);

    abstract String a(String param0, byte param1);

    pm(tb param0) {
        ((pm) this).field_d = param0;
    }

    final rh c(byte param0) {
        Object var3 = null;
        if (param0 != -7) {
          var3 = null;
          ((pm) this).a((tb) null, 59);
          return ((pm) this).a(((pm) this).field_d.field_o, param0 + 9);
        } else {
          return ((pm) this).a(((pm) this).field_d.field_o, param0 + 9);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "If you do nothing the game will revert to normal view in <%0> second.";
        field_c = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
