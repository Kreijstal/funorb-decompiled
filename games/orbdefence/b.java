/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends hi {
    static sk field_n;
    private boolean field_r;
    private String field_s;
    static String field_q;
    private ug field_o;
    static String field_p;

    final static sc a(String param0, String param1, int param2, ki param3, ki param4) {
        int var5 = param4.a(param1, 0);
        int var7 = -47 / ((param2 - -46) / 46);
        int var6 = param4.a(param0, 5187, var5);
        return vi.a(-13449, param3, param4, var6, var5);
    }

    public static void j(int param0) {
        field_q = null;
        if (param0 != -1) {
          boolean discarded$2 = b.a((byte) 50, -105);
          field_p = null;
          field_n = null;
          return;
        } else {
          field_p = null;
          field_n = null;
          return;
        }
    }

    b(vi param0, vi param1) {
        super(param0);
        ((b) this).field_r = false;
        ((b) this).field_s = "";
        ((b) this).field_o = new ug(param0, param1);
    }

    final String a(int param0, String param1) {
        Object var4 = null;
        if (((b) this).field_o.a(param1, (byte) -99) != vh.field_h) {
          if (((b) this).a(param1, (byte) -99) == vh.field_h) {
            return pk.field_G;
          } else {
            if (param0 != -11300) {
              var4 = null;
              qd discarded$2 = ((b) this).a((String) null, (byte) 83);
              return wb.field_c;
            } else {
              return wb.field_c;
            }
          }
        } else {
          return ((b) this).field_o.a(-11300, param1);
        }
    }

    final static boolean a(byte param0, int param1) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 71) {
          L0: {
            var3 = null;
            sc discarded$6 = b.a((String) null, (String) null, -123, (ki) null, (ki) null);
            if ((param1 ^ -1) > -1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((param1 ^ -1) > -1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final qd a(String param0, byte param1) {
        mi var3 = null;
        if (((b) this).field_o.a(param0, param1) == vh.field_h) {
            return vh.field_h;
        }
        if (!(param0.equals((Object) (Object) ((b) this).field_s))) {
            var3 = cj.a((byte) -114, param0);
            if (var3.a(false)) {
                ((b) this).field_s = param0;
                ((b) this).field_r = var3.b((byte) 67);
                return !((b) this).field_r ? vh.field_h : nc.field_bb;
            }
            return uj.field_b;
        }
        return !((b) this).field_r ? vh.field_h : nc.field_bb;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Open in popup window";
        field_q = "ICE BEAM";
    }
}
