/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq extends rqa {
    static int[] field_o;

    kq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 == 11105) {
          if (param0 <= param1) {
            return hob.a((param0 << -1932534864) / param1, (byte) -127);
          } else {
            return 2048 - hob.a((param1 << 1829689328) / param0, (byte) -126);
          }
        } else {
          field_o = null;
          if (param0 <= param1) {
            return hob.a((param0 << -1932534864) / param1, (byte) -127);
          } else {
            return 2048 - hob.a((param1 << 1829689328) / param0, (byte) -126);
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        hbb.field_z = param0[0].a(9);
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((kq) this).a((nc[]) null, 67);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    final static void a(float param0, byte param1, int param2, int param3, int param4) {
        if (li.field_i) {
          if (!rfa.field_p) {
            if (param1 < 52) {
              field_o = null;
              return;
            } else {
              return;
            }
          } else {
            og.field_r.a(Math.max(1, (int)param0), param2, param4, (byte) 97, -16777216 | param3);
            if (param1 >= 52) {
              return;
            } else {
              field_o = null;
              return;
            }
          }
        } else {
          dma.c(param4, param2, (int)param0, param3);
          if (param1 >= 52) {
            return;
          } else {
            field_o = null;
            return;
          }
        }
    }

    public static void e(byte param0) {
        if (param0 < 56) {
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[128];
    }
}
