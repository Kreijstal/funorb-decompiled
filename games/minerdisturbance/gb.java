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
              ((gb) this).field_b = ((gb) this).field_b + 1;
              if (((gb) this).field_f.field_b[((gb) this).field_b].field_f == ((gb) this).field_f.field_b[-1 + ((gb) this).field_b]) {
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

    final static void b(int param0) {
        sa var1 = null;
        int var2 = 0;
        var2 = MinerDisturbance.field_ab;
        mj.field_o.e();
        im.field_b.e();
        sa.field_s = sa.field_s - 1;
        if (sa.field_s == 0) {
          sa.field_s = 200;
          var1 = (sa) (Object) hj.field_b.b(114);
          L0: while (true) {
            if (var1 == null) {
              if (null != m.field_c) {
                var1 = (sa) (Object) m.field_c.b(114);
                L1: while (true) {
                  if (var1 != null) {
                    L2: {
                      if (var1.field_p.c(122)) {
                        break L2;
                      } else {
                        var1.b(34);
                        break L2;
                      }
                    }
                    var1 = (sa) (Object) m.field_c.b((byte) 56);
                    continue L1;
                  } else {
                    if (param0 == -6129) {
                      if (null == km.field_a) {
                        return;
                      } else {
                        L3: {
                          if (!km.field_a.b((byte) -114)) {
                            de.field_b = null;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (param0 == -6129) {
                  if (null == km.field_a) {
                    return;
                  } else {
                    L4: {
                      if (!km.field_a.b((byte) -114)) {
                        de.field_b = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L5: {
                if (var1.field_p.c(121)) {
                  break L5;
                } else {
                  var1.b(param0 + 6163);
                  break L5;
                }
              }
              var1 = (sa) (Object) hj.field_b.b((byte) 56);
              continue L0;
            }
          }
        } else {
          if (param0 == -6129) {
            if (null == km.field_a) {
              return;
            } else {
              L6: {
                if (!km.field_a.b((byte) -114)) {
                  de.field_b = null;
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= -77) {
            return;
        }
        gb.b(92);
    }

    public final Object next() {
        pi var1 = null;
        int var2 = 0;
        var2 = MinerDisturbance.field_ab;
        if (((gb) this).field_d == ((gb) this).field_f.field_b[((gb) this).field_b + -1]) {
          L0: while (true) {
            if (((gb) this).field_f.field_f > ((gb) this).field_b) {
              ((gb) this).field_b = ((gb) this).field_b + 1;
              var1 = ((gb) this).field_f.field_b[((gb) this).field_b].field_f;
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

    private final void c(int param0) {
        ((gb) this).field_c = null;
        if (param0 <= 113) {
          ((gb) this).field_c = null;
          ((gb) this).field_d = ((gb) this).field_f.field_b[0].field_f;
          ((gb) this).field_b = 1;
          return;
        } else {
          ((gb) this).field_d = ((gb) this).field_f.field_b[0].field_f;
          ((gb) this).field_b = 1;
          return;
        }
    }

    final static void a(int param0, String param1) {
        lh.a(-18473, param1);
        if (param0 > -110) {
            return;
        }
        t.a(false, rf.field_a, 0);
    }

    gb(sd param0) {
        ((gb) this).field_c = null;
        ((gb) this).field_f = param0;
        this.c(123);
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
