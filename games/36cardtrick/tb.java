/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb implements ci {
    private int field_f;
    static sg field_b;
    static int[] field_h;
    private int field_a;
    static String field_e;
    private int field_j;
    private ee field_g;
    static int field_d;
    private int field_i;
    static java.awt.Canvas field_c;
    private int field_l;
    private int field_k;

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        h var12 = null;
        lk stackIn_3_0 = null;
        lk stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          var11 = Main.field_T;
          if (param1 instanceof h) {
            stackOut_2_0 = (lk) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (lk) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (h) (Object) stackIn_3_0;
          if (var12 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        if (param2 == 11447) {
          vj.c(param0 + param1.field_o, param1.field_i + param3, param1.field_h, param1.field_q, ((tb) this).field_f);
          var7 = -(2 * var12.field_K) + param1.field_h;
          var8 = param1.field_o + (param0 - -var12.field_K);
          var9 = var12.field_J + param3 - -param1.field_i;
          vj.e(var8, var9, var8 + var7, var9, ((tb) this).field_l);
          var10 = var12.a(true) + -1;
          L2: while (true) {
            if (0 > var10) {
              if (((tb) this).field_g != null) {
                ((tb) this).field_g.a(var12.field_r, var7 / 2 + var8, ((tb) this).field_g.field_E + var9 + var12.field_J, ((tb) this).field_k, ((tb) this).field_i);
                return;
              } else {
                return;
              }
            } else {
              vj.b(var8 - -(var12.a((byte) -63, var10) * var7 / var12.f((byte) -40)), var9, ((tb) this).field_j, ((tb) this).field_a);
              var10--;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var4 = Main.field_T;
        dh var5 = (dh) (Object) vb.field_c.a((byte) 74);
        while (var5 != null) {
            ke.a(var5, param0, 21719);
            var5 = (dh) (Object) vb.field_c.b((byte) -104);
        }
        qb var2 = ue.field_b.a((byte) 74);
        int var3 = -54 / ((param1 - -65) / 51);
        while (var2 != null) {
            fl.b(1, param0);
            var2 = ue.field_b.b((byte) -104);
        }
    }

    final static ff a(String param0, String param1, byte param2, boolean param3) {
        long var4 = 0L;
        Object var6 = null;
        CharSequence var7 = null;
        var4 = 0L;
        if (param2 != -18) {
          return null;
        } else {
          L0: {
            var6 = null;
            if ((param1.indexOf('@') ^ -1) == 0) {
              var7 = (CharSequence) (Object) param1;
              var4 = fe.a(var7, 109);
              break L0;
            } else {
              var6 = (Object) (Object) param1;
              break L0;
            }
          }
          return nk.a(-116, param3, var4, (String) var6, param0);
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 128) {
          var2 = null;
          ff discarded$2 = tb.a((String) null, (String) null, (byte) -86, false);
          field_e = null;
          field_b = null;
          field_h = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          field_h = null;
          field_c = null;
          return;
        }
    }

    tb(ee param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((tb) this).field_i = param2;
        ((tb) this).field_l = param3;
        ((tb) this).field_a = param6;
        ((tb) this).field_j = param5;
        ((tb) this).field_k = param1;
        ((tb) this).field_f = param4;
        ((tb) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new sg();
        field_e = "Waiting for extra data";
        field_h = new int[128];
    }
}
