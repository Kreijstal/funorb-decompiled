/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ii extends gb {
    static qj field_p;
    static int field_o;
    static int[] field_q;
    static qj[] field_r;
    static java.awt.Frame field_s;

    final static int b(boolean param0) {
        if (param0) {
            ii.a((byte) 79);
            return oi.field_b;
        }
        return oi.field_b;
    }

    final static void a(byte param0) {
        li var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              sb.field_b.b();
              if (param0 <= -57) {
                break L1;
              } else {
                field_o = 87;
                break L1;
              }
            }
            L2: {
              g.field_x.b();
              id.field_e = id.field_e - 1;
              if (0 == id.field_e) {
                id.field_e = 200;
                var1 = (li) ((Object) kd.field_a.b(2));
                L3: while (true) {
                  if (var1 == null) {
                    if (jk.field_c == null) {
                      break L2;
                    } else {
                      var1 = (li) ((Object) jk.field_c.b(2));
                      L4: while (true) {
                        if (var1 == null) {
                          break L2;
                        } else {
                          L5: {
                            if (var1.field_k.b(10000536)) {
                              break L5;
                            } else {
                              var1.a(-29);
                              break L5;
                            }
                          }
                          var1 = (li) ((Object) jk.field_c.a(10));
                          continue L4;
                        }
                      }
                    }
                  } else {
                    L6: {
                      if (!var1.field_k.b(10000536)) {
                        var1.a(-40);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var1 = (li) ((Object) kd.field_a.a(10));
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L7: {
              if (null == fj.field_P) {
                break L7;
              } else {
                if (!fj.field_P.c((byte) -64)) {
                  ch.field_n = null;
                  break L7;
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
          throw sl.a((Throwable) ((Object) var1_ref), "ii.H(" + param0 + ')');
        }
    }

    public static void f(int param0) {
        field_s = null;
        field_p = null;
        if (param0 != -5146) {
          field_s = (java.awt.Frame) null;
          field_q = null;
          field_r = null;
          return;
        } else {
          field_q = null;
          field_r = null;
          return;
        }
    }

    ii() {
    }

    static {
    }
}
