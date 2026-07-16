/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ov implements Iterator {
    static String field_a;
    private ht field_d;
    private gn field_g;
    static String field_c;
    private int field_f;
    static int field_b;
    private gn field_e;

    public final boolean hasNext() {
        int var2 = 0;
        var2 = Kickabout.field_G;
        if (((ov) this).field_d.field_e[-1 + ((ov) this).field_f] == ((ov) this).field_e) {
          L0: while (true) {
            if (((ov) this).field_d.field_d > ((ov) this).field_f) {
              int fieldTemp$1 = ((ov) this).field_f;
              ((ov) this).field_f = ((ov) this).field_f + 1;
              if (((ov) this).field_d.field_e[fieldTemp$1].field_d != ((ov) this).field_d.field_e[-1 + ((ov) this).field_f]) {
                ((ov) this).field_e = ((ov) this).field_d.field_e[-1 + ((ov) this).field_f].field_d;
                return true;
              } else {
                ((ov) this).field_e = ((ov) this).field_d.field_e[((ov) this).field_f - 1];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static void a(tf param0, int param1) {
        gn var2 = null;
        int var4 = 0;
        gn var5 = null;
        gn var6 = null;
        var4 = Kickabout.field_G;
        if (param1 != 0) {
          field_b = -112;
          L0: while (true) {
            if (!jo.a(param0, false)) {
              var2 = param0.g(24009);
              L1: while (true) {
                if (!(var2 instanceof ak)) {
                  continue L0;
                } else {
                  if (!(var2.field_d instanceof ak)) {
                    continue L0;
                  } else {
                    L2: {
                      var6 = var2.field_d;
                      if (((ak) (Object) var2).a((byte) 120) < ((ak) (Object) var6).a((byte) -73)) {
                        var2.c((byte) -109);
                        pa.a(var2, var6, (byte) 127);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var2 = var6;
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          }
        } else {
          L3: while (true) {
            if (!jo.a(param0, false)) {
              var2 = param0.g(24009);
              L4: while (true) {
                if (!(var2 instanceof ak)) {
                  continue L3;
                } else {
                  if (!(var2.field_d instanceof ak)) {
                    continue L3;
                  } else {
                    L5: {
                      var5 = var2.field_d;
                      if (((ak) (Object) var2).a((byte) 120) < ((ak) (Object) var5).a((byte) -73)) {
                        var2.c((byte) -109);
                        pa.a(var2, var5, (byte) 127);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var2 = var5;
                    continue L4;
                  }
                }
              }
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            boolean discarded$0 = ov.a(-70, -86, -1);
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, int param1) {
        ml var2 = or.field_d;
        int var3 = -31 / ((param0 - 40) / 56);
        var2.b(param1, (byte) 120);
        var2.a(106, 1);
        var2.a(119, 0);
    }

    public final Object next() {
        gn var1 = null;
        int var2 = 0;
        var2 = Kickabout.field_G;
        if (((ov) this).field_d.field_e[((ov) this).field_f - 1] == ((ov) this).field_e) {
          L0: while (true) {
            if (((ov) this).field_d.field_d > ((ov) this).field_f) {
              int fieldTemp$2 = ((ov) this).field_f;
              ((ov) this).field_f = ((ov) this).field_f + 1;
              var1 = ((ov) this).field_d.field_e[fieldTemp$2].field_d;
              if (var1 == ((ov) this).field_d.field_e[((ov) this).field_f + -1]) {
                continue L0;
              } else {
                ((ov) this).field_e = var1.field_d;
                ((ov) this).field_g = var1;
                return (Object) (Object) var1;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((ov) this).field_e;
          ((ov) this).field_e = var1.field_d;
          ((ov) this).field_g = var1;
          return (Object) (Object) var1;
        }
    }

    public final void remove() {
        if (!(((ov) this).field_g != null)) {
            throw new IllegalStateException();
        }
        ((ov) this).field_g.c((byte) -109);
        ((ov) this).field_g = null;
    }

    private final void b(int param0) {
        ((ov) this).field_e = ((ov) this).field_d.field_e[param0].field_d;
        ((ov) this).field_f = 1;
        ((ov) this).field_g = null;
    }

    final static boolean a(int param0, int param1, int param2) {
        if ((cc.field_e ^ -1) == param1) {
            hq.b((byte) 124);
            return true;
        }
        if (!(-103 != (cc.field_e ^ -1))) {
            dr.field_g.a(5075);
            return true;
        }
        if (null == dr.field_g) {
            return false;
        }
        if (!dr.field_g.a(param0, param2, (byte) -101)) {
            return false;
        }
        return true;
    }

    ov(ht param0) {
        ((ov) this).field_g = null;
        ((ov) this).field_d = param0;
        this.b(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_b = 0;
        field_c = "Spend EXP";
    }
}
