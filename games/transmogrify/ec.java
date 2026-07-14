/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ec {
    static rc field_d;
    int field_e;
    static qj field_b;
    static int[] field_c;
    String field_a;

    final static void a(int param0, int param1) {
        od var2 = null;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        kc.field_g = param0;
        var2 = (od) (Object) lb.field_f.a((byte) -95);
        L0: while (true) {
          if (var2 == null) {
            if (param1 == 9956) {
              if (null != nc.field_q) {
                var2 = (od) (Object) nc.field_q.a((byte) -95);
                L1: while (true) {
                  if (var2 != null) {
                    L2: {
                      if (var2.field_i.b(8)) {
                        var2.field_j.i(128 + var2.field_k * kc.field_g >> -690821016);
                        break L2;
                      } else {
                        var2.c(5);
                        break L2;
                      }
                    }
                    var2 = (od) (Object) nc.field_q.a(true);
                    continue L1;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              ec.a(true, true, 47);
              if (null != nc.field_q) {
                var2 = (od) (Object) nc.field_q.a((byte) -95);
                L3: while (true) {
                  if (var2 != null) {
                    L4: {
                      if (var2.field_i.b(8)) {
                        var2.field_j.i(128 + var2.field_k * kc.field_g >> -690821016);
                        break L4;
                      } else {
                        var2.c(5);
                        break L4;
                      }
                    }
                    var2 = (od) (Object) nc.field_q.a(true);
                    continue L3;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            L5: {
              if (!var2.field_i.b(param1 + -9948)) {
                var2.c(param1 + -9951);
                break L5;
              } else {
                var2.field_j.i(128 + var2.field_k * kc.field_g >> 595263304);
                break L5;
              }
            }
            var2 = (od) (Object) lb.field_f.a(true);
            continue L0;
          }
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 0) {
            field_c = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (param0) {
            sb.c(0, 0, sb.field_c, sb.field_g, 0, 192);
        } else {
            sb.c();
            sb.c();
            sb.c();
        }
        kh.a(-75, param0);
        int var3 = 119 % ((-73 - param2) / 42);
    }

    final static hb a(int param0, int param1, int param2, hb param3) {
        hb var4 = new hb(param3.field_h, -param2 + param0);
        ji.a(param3.field_l, param2, var4.field_l, param1, var4.field_l.length);
        return var4;
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static ci a(boolean param0, byte param1, int param2, int param3, boolean param4) {
        if (param1 != 77) {
          ci discarded$2 = ec.a(true, (byte) 79, -120, 125, true);
          return mh.a(-26159, param4, param0, false, param2, param3);
        } else {
          return mh.a(-26159, param4, param0, false, param2, param3);
        }
    }

    final static void a(String param0, int param1, String param2) {
        if (!(null == wg.field_d)) {
            wg.field_d.r(77);
        }
        ok.field_a = new ff(param0, param2, false, true, true);
        int var3 = -114 / ((57 - param1) / 56);
        l.field_d.b(-88, (qg) (Object) ok.field_a);
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 != -9008) {
          field_c = null;
          return new java.net.Socket(((ec) this).field_a, ((ec) this).field_e);
        } else {
          return new java.net.Socket(((ec) this).field_a, ((ec) this).field_e);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new rc();
        field_c = new int[8192];
        field_b = new qj();
    }
}
