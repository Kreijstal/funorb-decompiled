/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class od implements nr {
    int field_b;
    int field_a;

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = param0;
        if (var3 != 1) {
          if (var3 != 2) {
            if (var3 != 3) {
              if (var3 != 0) {
                if (4 != var3) {
                  if (var3 != 6) {
                    if (var3 != 5) {
                      return;
                    } else {
                      int discarded$14 = -96;
                      var2 = fi.a(8, he.field_o);
                      dj discarded$15 = fe.a(78, nt.field_n[0][var2]);
                      return;
                    }
                  } else {
                    int discarded$16 = -96;
                    var2 = fi.a(8, he.field_o);
                    dj discarded$17 = fe.a(78, nt.field_n[0][var2]);
                    return;
                  }
                } else {
                  int discarded$18 = -96;
                  var2 = fi.a(5, he.field_o);
                  dj discarded$19 = fe.a(80, nt.field_n[2][var2]);
                  return;
                }
              } else {
                int discarded$20 = -96;
                var2 = fi.a(8, he.field_o);
                dj discarded$21 = fe.a(91, nt.field_n[1][var2]);
                return;
              }
            } else {
              int discarded$22 = -96;
              var2 = fi.a(8, he.field_o);
              dj discarded$23 = fe.a(91, nt.field_n[1][var2]);
              return;
            }
          } else {
            int discarded$24 = -96;
            var2 = fi.a(8, he.field_o);
            dj discarded$25 = fe.a(91, nt.field_n[1][var2]);
            return;
          }
        } else {
          int discarded$26 = -96;
          var2 = fi.a(8, he.field_o);
          dj discarded$27 = fe.a(91, nt.field_n[1][var2]);
          return;
        }
    }

    final static void a() {
        rf.field_a.a((byte) 117);
        if (!(he.field_n != null)) {
            he.field_n = new m(rf.field_a, t.field_s);
        }
        rf.field_a.a((byte) 115, (pk) (Object) he.field_n);
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (param0 >= -50) {
            return;
        }
        try {
            if (11 == jv.field_a) {
                int discarded$0 = -126;
                tu.a();
            }
            int discarded$1 = 122;
            hu.a(hn.field_k, ur.field_R, ch.field_h);
            um.a(0, 0, param1, (byte) 124);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "od.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    od(int param0, int param1) {
        ((od) this).field_b = param0;
        ((od) this).field_a = param1;
    }

    static {
    }
}
