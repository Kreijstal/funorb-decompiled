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
        be var1 = null;
        var1 = this.field_f;
        if (this.field_a.field_a != var1) {
          this.field_f = var1.field_p;
          if (client.field_A) {
            var1 = null;
            this.field_f = null;
            this.field_g = var1;
            return var1;
          } else {
            this.field_g = var1;
            return var1;
          }
        } else {
          var1 = null;
          this.field_f = null;
          this.field_g = var1;
          return var1;
        }
    }

    public final void remove() {
        if (!(this.field_g != null)) {
            throw new IllegalStateException();
        }
        this.field_g.e((byte) 81);
        this.field_g = null;
    }

    public static void a(int param0) {
        field_e = null;
        field_d = (ck[][]) null;
        if (param0 != 8) {
            field_d = (ck[][]) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(int param0, w param1, w param2) {
        try {
            if (param2.field_M == null) {
                param2.field_M = new vj();
            }
            if (null == param1.field_M) {
                param1.field_M = new vj();
            }
            if (null == mc.field_a) {
                mc.field_a = new nk(64);
            }
            if (null == hg.field_e) {
                hg.field_e = new nk(64);
            }
            uf.field_z = param1.field_M;
            if (param0 != 21014) {
                field_c = (mi) null;
            }
            qi.field_S = param2.field_M;
            d.a(true);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "dg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        kn var4 = null;
        kc var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (kn) ((Object) pb.field_c.c((byte) -80));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    fm.a((byte) -125, param1, var4);
                    var4 = (kn) ((Object) pb.field_c.d(true));
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 <= -47) {
                  break L2;
                } else {
                  field_b = 100;
                  break L2;
                }
              }
              var5 = (kc) ((Object) field_e.c((byte) -121));
              L4: while (true) {
                if (var5 == null) {
                  break L0;
                } else {
                  wb.a(var5, param1, 60);
                  var5 = (kc) ((Object) field_e.d(true));
                  if (var3 == 0) {
                    continue L4;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "dg.C(" + param0 + ',' + param1 + ')');
        }
    }

    public final boolean hasNext() {
        return this.field_f != this.field_a.field_a;
    }

    final static boolean b(int param0) {
        if (param0 >= -34) {
            return false;
        }
        return rg.a(se.h(25144), (byte) -78);
    }

    dg(uh param0) {
        this.field_g = null;
        try {
            this.field_a = param0;
            this.field_f = this.field_a.field_a.field_p;
            this.field_g = null;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "dg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new ck[8][];
        field_e = new vj();
    }
}
