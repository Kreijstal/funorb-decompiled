/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends cg {
    static w field_j;
    static byte[][] field_k;

    public static void c(boolean param0) {
        if (!param0) {
            rd.b((byte) 56);
            field_k = (byte[][]) null;
            field_j = null;
            return;
        }
        field_k = (byte[][]) null;
        field_j = null;
    }

    final static int a(int param0, int param1) {
        if (param1 != 1266438832) {
          field_j = (w) null;
          param0 = (1431655765 & param0) + ((param0 & -1431655766) >>> -1272223327);
          param0 = (param0 & 858993459) + (param0 >>> 2047830018 & -1288490189);
          param0 = 252645135 & param0 + (param0 >>> 1646212772);
          param0 = param0 + (param0 >>> 1141612424);
          param0 = param0 + (param0 >>> 1266438832);
          return 255 & param0;
        } else {
          param0 = (1431655765 & param0) + ((param0 & -1431655766) >>> -1272223327);
          param0 = (param0 & 858993459) + (param0 >>> 2047830018 & -1288490189);
          param0 = 252645135 & param0 + (param0 >>> 1646212772);
          param0 = param0 + (param0 >>> 1141612424);
          param0 = param0 + (param0 >>> 1266438832);
          return 255 & param0;
        }
    }

    final static void a(byte param0, String param1) {
        we.a(-119, param1);
        if (param0 <= 54) {
          field_j = (w) null;
          ca.a(kj.field_q, false, 16777215);
          return;
        } else {
          ca.a(kj.field_q, false, 16777215);
          return;
        }
    }

    final sg a(String param0, int param1) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (null != di.a(param0, 64)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (param1 < -58) {
          if (var3 == 0) {
            return pe.field_b;
          } else {
            return ii.field_e;
          }
        } else {
          field_j = (w) null;
          if (var3 == 0) {
            return pe.field_b;
          } else {
            return ii.field_e;
          }
        }
    }

    rd(hf param0) {
        super(param0);
    }

    final static void b(byte param0) {
        int var1 = 0;
        if (sd.field_c != null) {
          L0: {
            sd.field_c.b(true);
            if (null != ji.field_a) {
              ji.field_a.c(true);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = -127 / ((param0 - 12) / 41);
          vb.a((byte) 44);
          return;
        } else {
          L1: {
            if (null != ji.field_a) {
              ji.field_a.c(true);
              break L1;
            } else {
              break L1;
            }
          }
          var1 = -127 / ((param0 - 12) / 41);
          vb.a((byte) 44);
          return;
        }
    }

    final String a(String param0, boolean param1) {
        if (((rd) this).a(param0, -81) == pe.field_b) {
            return ha.field_c;
        }
        if (param1) {
            field_k = (byte[][]) (byte[][]) null;
            return gi.field_g;
        }
        return gi.field_g;
    }

    static {
    }
}
