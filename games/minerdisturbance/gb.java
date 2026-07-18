/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gb implements Iterator {
    static int field_e;
    static ea field_a;
    private sd field_f;
    private pi field_c;
    private int field_b;
    private pi field_d;

    public final boolean hasNext() {
        int var2 = 0;
        var2 = MinerDisturbance.field_ab;
        if (((gb) this).field_f.field_b[((gb) this).field_b - 1] == ((gb) this).field_d) {
          L0: while (true) {
            if (((gb) this).field_b < ((gb) this).field_f.field_f) {
              pi[] fieldTemp$2 = ((gb) this).field_f.field_b;
              int fieldTemp$3 = ((gb) this).field_b;
              ((gb) this).field_b = ((gb) this).field_b + 1;
              if (fieldTemp$2[fieldTemp$3].field_f == ((gb) this).field_f.field_b[-1 + ((gb) this).field_b]) {
                ((gb) this).field_d = ((gb) this).field_f.field_b[-1 + ((gb) this).field_b];
                continue L0;
              } else {
                ((gb) this).field_d = ((gb) this).field_f.field_b[((gb) this).field_b - 1].field_f;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static void b() {
        sa var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              mj.field_o.e();
              im.field_b.e();
              sa.field_s = sa.field_s - 1;
              if (sa.field_s == 0) {
                sa.field_s = 200;
                var1 = (sa) (Object) hj.field_b.b(114);
                L2: while (true) {
                  if (var1 == null) {
                    if (null == m.field_c) {
                      break L1;
                    } else {
                      var1 = (sa) (Object) m.field_c.b(114);
                      L3: while (true) {
                        if (var1 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (var1.field_p.c(122)) {
                              break L4;
                            } else {
                              var1.b(34);
                              break L4;
                            }
                          }
                          var1 = (sa) (Object) m.field_c.b((byte) 56);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (var1.field_p.c(121)) {
                        break L5;
                      } else {
                        var1.b(34);
                        break L5;
                      }
                    }
                    var1 = (sa) (Object) hj.field_b.b((byte) 56);
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (null == km.field_a) {
                break L6;
              } else {
                if (!km.field_a.b((byte) -114)) {
                  de.field_b = null;
                  break L6;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1_ref, "gb.D(" + -6129 + ')');
        }
    }

    public static void a() {
        field_a = null;
    }

    public final Object next() {
        pi var1 = null;
        int var2 = 0;
        var2 = MinerDisturbance.field_ab;
        if (((gb) this).field_d == ((gb) this).field_f.field_b[((gb) this).field_b + -1]) {
          L0: while (true) {
            if (((gb) this).field_f.field_f > ((gb) this).field_b) {
              pi[] fieldTemp$4 = ((gb) this).field_f.field_b;
              int fieldTemp$5 = ((gb) this).field_b;
              ((gb) this).field_b = ((gb) this).field_b + 1;
              var1 = fieldTemp$4[fieldTemp$5].field_f;
              if (((gb) this).field_f.field_b[((gb) this).field_b - 1] == var1) {
                continue L0;
              } else {
                ((gb) this).field_d = var1.field_f;
                ((gb) this).field_c = var1;
                return (Object) (Object) var1;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((gb) this).field_d;
          ((gb) this).field_c = var1;
          ((gb) this).field_d = var1.field_f;
          return (Object) (Object) var1;
        }
    }

    private final void c() {
        ((gb) this).field_c = null;
        ((gb) this).field_d = ((gb) this).field_f.field_b[0].field_f;
        ((gb) this).field_b = 1;
    }

    final static void a(int param0, String param1) {
        lh.a(-18473, param1);
        try {
            int discarded$0 = 0;
            t.a(false, rf.field_a);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "gb.B(" + -126 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    gb(sd param0) {
        ((gb) this).field_c = null;
        try {
            ((gb) this).field_f = param0;
            int discarded$0 = 123;
            this.c();
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "gb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void remove() {
        if (null == ((gb) this).field_c) {
            throw new IllegalStateException();
        }
        ((gb) this).field_c.b(34);
        ((gb) this).field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
    }
}
