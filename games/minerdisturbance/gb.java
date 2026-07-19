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
        pi[] fieldTemp$2 = null;
        int fieldTemp$3 = 0;
        int var2 = 0;
        var2 = MinerDisturbance.field_ab;
        if (this.field_f.field_b[this.field_b - 1] == this.field_d) {
          L0: while (true) {
            if (this.field_b < this.field_f.field_f) {
              fieldTemp$2 = this.field_f.field_b;
              fieldTemp$3 = this.field_b;
              this.field_b = this.field_b + 1;
              if (fieldTemp$2[fieldTemp$3].field_f == this.field_f.field_b[-1 + this.field_b]) {
                this.field_d = this.field_f.field_b[-1 + this.field_b];
                continue L0;
              } else {
                this.field_d = this.field_f.field_b[this.field_b - 1].field_f;
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
        RuntimeException var1_ref = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
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
                var1 = (sa) ((Object) hj.field_b.b(114));
                L2: while (true) {
                  if (var1 == null) {
                    if (null == m.field_c) {
                      break L1;
                    } else {
                      var1 = (sa) ((Object) m.field_c.b(114));
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
                          var1 = (sa) ((Object) m.field_c.b((byte) 56));
                          continue L3;
                        }
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
                    var1 = (sa) ((Object) hj.field_b.b((byte) 56));
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            if (param0 == -6129) {
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1_ref), "gb.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        pi[] fieldTemp$4 = null;
        int fieldTemp$5 = 0;
        pi var1 = null;
        int var2 = 0;
        var2 = MinerDisturbance.field_ab;
        if (this.field_d == this.field_f.field_b[this.field_b + -1]) {
          L0: while (true) {
            if (this.field_f.field_f > this.field_b) {
              fieldTemp$4 = this.field_f.field_b;
              fieldTemp$5 = this.field_b;
              this.field_b = this.field_b + 1;
              var1 = fieldTemp$4[fieldTemp$5].field_f;
              if (this.field_f.field_b[this.field_b - 1] == var1) {
                continue L0;
              } else {
                this.field_d = var1.field_f;
                this.field_c = var1;
                return var1;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = this.field_d;
          this.field_c = var1;
          this.field_d = var1.field_f;
          return var1;
        }
    }

    private final void c(int param0) {
        this.field_c = null;
        if (param0 <= 113) {
          this.field_c = (pi) null;
          this.field_d = this.field_f.field_b[0].field_f;
          this.field_b = 1;
          return;
        } else {
          this.field_d = this.field_f.field_b[0].field_f;
          this.field_b = 1;
          return;
        }
    }

    final static void a(int param0, String param1) {
        lh.a(-18473, param1);
        if (param0 > -110) {
            return;
        }
        try {
            t.a(false, rf.field_a, 0);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "gb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    gb(sd param0) {
        this.field_c = null;
        try {
            this.field_f = param0;
            this.c(123);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "gb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void remove() {
        if (null == this.field_c) {
            throw new IllegalStateException();
        }
        this.field_c.b(34);
        this.field_c = null;
    }

    static {
        field_e = 0;
    }
}
