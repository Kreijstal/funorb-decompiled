/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ki {
    private kk field_g;
    private hb field_d;
    static java.awt.Canvas field_f;
    private kk field_b;
    static Calendar field_e;
    static int[] field_c;
    static String field_a;

    final static void a(boolean param0, int param1, boolean param2) {
        if (param1 == 0) {
          if (!param0) {
            ll.a();
            lh.a(param0, -94);
            return;
          } else {
            ll.c(0, 0, ll.field_d, ll.field_k, 0, 192);
            lh.a(param0, -94);
            return;
          }
        } else {
          ki.a(false, -67, false);
          if (!param0) {
            ll.a();
            lh.a(param0, -94);
            return;
          } else {
            ll.c(0, 0, ll.field_d, ll.field_k, 0, 192);
            lh.a(param0, -94);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_f = null;
        field_c = null;
    }

    final ob a(int param0, int param1) {
        ob var3 = null;
        byte[] var4 = null;
        ob var5 = null;
        var3 = (ob) ((ki) this).field_d.a((long)param1, (byte) 102);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (param1 < 32768) {
              var4 = ((ki) this).field_g.a(1, param1, (byte) -23);
              break L0;
            } else {
              var4 = ((ki) this).field_b.a(1, param1 & 32767, (byte) -67);
              break L0;
            }
          }
          var5 = new ob();
          if (param0 >= 91) {
            if (var4 != null) {
              L1: {
                var5.a(false, new be(var4));
                if (param1 >= 32768) {
                  var5.f(32768);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((ki) this).field_d.a(-60, (Object) (Object) var5, (long)param1);
              return var5;
            } else {
              L2: {
                if (param1 >= 32768) {
                  var5.f(32768);
                  break L2;
                } else {
                  break L2;
                }
              }
              ((ki) this).field_d.a(-60, (Object) (Object) var5, (long)param1);
              return var5;
            }
          } else {
            field_c = null;
            if (var4 == null) {
              L3: {
                if (param1 >= 32768) {
                  var5.f(32768);
                  break L3;
                } else {
                  break L3;
                }
              }
              ((ki) this).field_d.a(-60, (Object) (Object) var5, (long)param1);
              return var5;
            } else {
              L4: {
                var5.a(false, new be(var4));
                if (param1 >= 32768) {
                  var5.f(32768);
                  break L4;
                } else {
                  break L4;
                }
              }
              ((ki) this).field_d.a(-60, (Object) (Object) var5, (long)param1);
              return var5;
            }
          }
        }
    }

    private ki() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{45, 46, 47, 48, 49};
        field_e = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_a = "There's more than one space large enough for this exhibit, but only one place it can go. Think carefully.";
    }
}
