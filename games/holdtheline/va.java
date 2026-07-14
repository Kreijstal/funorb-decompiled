/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    private String field_g;
    static boolean field_k;
    static mg[][] field_d;
    static int[] field_c;
    static int field_e;
    static int[] field_j;
    static dl field_a;
    static String field_h;
    static String field_b;
    hj[] field_i;
    static String field_f;

    final static ma a(byte param0, int param1) {
        if (param0 >= -96) {
            Object var3 = null;
            uj[] discarded$0 = va.a(81, (da) null);
        }
        ma var2 = new ma();
        sg.field_v.a((byte) -126, (hl) (Object) var2);
        hh.a(param1, (byte) -23);
        return var2;
    }

    final hj[] a(int param0) {
        if (!(null == ((va) this).field_i)) {
            return ((va) this).field_i;
        }
        if (param0 != 180) {
            return null;
        }
        ((va) this).field_i = le.a(((va) this).field_g, 74);
        return le.a(((va) this).field_g, 74);
    }

    final boolean a(byte param0) {
        if (param0 <= 124) {
            boolean discarded$0 = ((va) this).a((byte) 31);
        }
        return null != ((va) this).field_i ? true : false;
    }

    final hj a(int param0, int param1, int param2, int param3) {
        if (null != ((va) this).a(180)) {
            return ((va) this).field_i[param1];
        }
        if (param2 != 9) {
            field_a = null;
        }
        return hi.a(param3, (byte) -108, param0);
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 >= -48) {
            va.b((byte) 38);
        }
        field_h = null;
        field_f = null;
        field_a = null;
        field_j = null;
        field_b = null;
        field_d = null;
    }

    final static uj[] a(int param0, da param1) {
        int var2 = 0;
        int var3 = 0;
        uj[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        uj var6 = null;
        int var7 = 0;
        var7 = HoldTheLine.field_D;
        var2 = param1.h(8, 7);
        if (-1 <= (var2 ^ -1)) {
          var3 = param1.h(12, param0 ^ 11661);
          var4 = new uj[var3];
          var5 = 0;
          if (param0 == 11658) {
            L0: while (true) {
              if (var5 >= var3) {
                return var4;
              } else {
                if (gl.a(param1, (byte) -37)) {
                  var6 = new uj();
                  int discarded$6 = param1.h(24, 7);
                  int discarded$7 = param1.h(24, 7);
                  var6.field_g = param1.h(24, 7);
                  int discarded$8 = param1.h(9, 7);
                  int discarded$9 = param1.h(12, 7);
                  int discarded$10 = param1.h(12, 7);
                  int discarded$11 = param1.h(12, 7);
                  var4[var5] = var6;
                  var5++;
                  continue L0;
                } else {
                  var6_int = param1.h(ld.a((byte) -68, var5 - 1), 7);
                  var4[var5] = var4[var6_int];
                  var5++;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    va(String param0) {
        ((va) this).field_i = null;
        ((va) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{125, 180, 180};
        field_b = "achievements to collect";
        field_k = false;
        field_h = "Standings";
        field_f = "1 retry attempt remaining";
    }
}
