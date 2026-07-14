/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dg implements Iterator {
    static vj field_e;
    private be field_g;
    static ck[][] field_d;
    private uh field_a;
    private be field_f;
    static mi field_c;
    static int field_b;

    public final Object next() {
        be var1 = ((dg) this).field_f;
        if (((dg) this).field_a.field_a != var1) {
            ((dg) this).field_f = var1.field_p;
        } else {
            var1 = null;
            ((dg) this).field_f = null;
        }
        ((dg) this).field_g = var1;
        return (Object) (Object) var1;
    }

    public final void remove() {
        if (!(((dg) this).field_g != null)) {
            throw new IllegalStateException();
        }
        ((dg) this).field_g.e((byte) 81);
        ((dg) this).field_g = null;
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        if (param0 != 8) {
            field_d = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(int param0, w param1, w param2) {
        if (param2.field_M != null) {
          if (null != param1.field_M) {
            if (null != mc.field_a) {
              if (null != hg.field_e) {
                uf.field_z = param1.field_M;
                if (param0 == 21014) {
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                } else {
                  field_c = null;
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                }
              } else {
                hg.field_e = new nk(64);
                uf.field_z = param1.field_M;
                if (param0 == 21014) {
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                } else {
                  field_c = null;
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                }
              }
            } else {
              mc.field_a = new nk(64);
              if (null != hg.field_e) {
                uf.field_z = param1.field_M;
                if (param0 == 21014) {
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                } else {
                  field_c = null;
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                }
              } else {
                hg.field_e = new nk(64);
                uf.field_z = param1.field_M;
                if (param0 == 21014) {
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                } else {
                  field_c = null;
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                }
              }
            }
          } else {
            param1.field_M = new vj();
            if (null != mc.field_a) {
              if (null != hg.field_e) {
                uf.field_z = param1.field_M;
                if (param0 == 21014) {
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                } else {
                  field_c = null;
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                }
              } else {
                hg.field_e = new nk(64);
                uf.field_z = param1.field_M;
                if (param0 == 21014) {
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                } else {
                  field_c = null;
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                }
              }
            } else {
              mc.field_a = new nk(64);
              if (null == hg.field_e) {
                hg.field_e = new nk(64);
                uf.field_z = param1.field_M;
                if (param0 == 21014) {
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                } else {
                  field_c = null;
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                }
              } else {
                uf.field_z = param1.field_M;
                if (param0 == 21014) {
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                } else {
                  field_c = null;
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                }
              }
            }
          }
        } else {
          param2.field_M = new vj();
          if (null == param1.field_M) {
            param1.field_M = new vj();
            if (null == mc.field_a) {
              mc.field_a = new nk(64);
              if (null != hg.field_e) {
                uf.field_z = param1.field_M;
                if (param0 == 21014) {
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                } else {
                  field_c = null;
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                }
              } else {
                hg.field_e = new nk(64);
                uf.field_z = param1.field_M;
                if (param0 == 21014) {
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                } else {
                  field_c = null;
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                }
              }
            } else {
              if (null != hg.field_e) {
                uf.field_z = param1.field_M;
                if (param0 == 21014) {
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                } else {
                  field_c = null;
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                }
              } else {
                hg.field_e = new nk(64);
                uf.field_z = param1.field_M;
                if (param0 == 21014) {
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                } else {
                  field_c = null;
                  qi.field_S = param2.field_M;
                  d.a(true);
                  return;
                }
              }
            }
          } else {
            L0: {
              if (null != mc.field_a) {
                break L0;
              } else {
                mc.field_a = new nk(64);
                break L0;
              }
            }
            if (null != hg.field_e) {
              uf.field_z = param1.field_M;
              if (param0 == 21014) {
                qi.field_S = param2.field_M;
                d.a(true);
                return;
              } else {
                field_c = null;
                qi.field_S = param2.field_M;
                d.a(true);
                return;
              }
            } else {
              hg.field_e = new nk(64);
              uf.field_z = param1.field_M;
              if (param0 == 21014) {
                qi.field_S = param2.field_M;
                d.a(true);
                return;
              } else {
                field_c = null;
                qi.field_S = param2.field_M;
                d.a(true);
                return;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        kn var2 = null;
        kc var2_ref = null;
        int var3 = 0;
        kn var4 = null;
        kc var5 = null;
        var3 = client.field_A ? 1 : 0;
        var4 = (kn) (Object) pb.field_c.c((byte) -80);
        var2 = (kn) (Object) pb.field_c.c((byte) -80);
        L0: while (true) {
          if (var4 == null) {
            if (param0 <= -47) {
              var5 = (kc) (Object) field_e.c((byte) -121);
              var2_ref = (kc) (Object) field_e.c((byte) -121);
              L1: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  wb.a(var5, param1, 60);
                  var2_ref = (kc) (Object) field_e.d(true);
                  continue L1;
                }
              }
            } else {
              field_b = 100;
              var5 = (kc) (Object) field_e.c((byte) -121);
              var2_ref = (kc) (Object) field_e.c((byte) -121);
              L2: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  wb.a(var5, param1, 60);
                  var2_ref = (kc) (Object) field_e.d(true);
                  continue L2;
                }
              }
            }
          } else {
            fm.a((byte) -125, param1, var4);
            var2 = (kn) (Object) pb.field_c.d(true);
            continue L0;
          }
        }
    }

    public final boolean hasNext() {
        return ((dg) this).field_f != ((dg) this).field_a.field_a;
    }

    final static boolean b(int param0) {
        if (param0 >= -34) {
            return false;
        }
        return rg.a(se.h(25144), (byte) -78);
    }

    dg(uh param0) {
        ((dg) this).field_g = null;
        ((dg) this).field_a = param0;
        ((dg) this).field_f = ((dg) this).field_a.field_a.field_p;
        ((dg) this).field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ck[8][];
        field_e = new vj();
    }
}
