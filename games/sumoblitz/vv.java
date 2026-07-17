/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vv implements Iterator {
    private pj field_e;
    private pj field_c;
    static hr[] field_a;
    private hl field_d;
    static ul field_b;

    public final Object next() {
        pj var1 = ((vv) this).field_c;
        if (((vv) this).field_d.field_c == var1) {
            var1 = null;
            ((vv) this).field_c = null;
        } else {
            ((vv) this).field_c = var1.field_m;
        }
        ((vv) this).field_e = var1;
        return (Object) (Object) var1;
    }

    public final boolean hasNext() {
        return ((vv) this).field_c != ((vv) this).field_d.field_c;
    }

    public final void remove() {
        if (!(((vv) this).field_e != null)) {
            throw new IllegalStateException();
        }
        ((vv) this).field_e.c(-5106);
        ((vv) this).field_e = null;
    }

    final static void a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ws.field_b != param1) {
                gs.field_b = new int[param1];
                var3_int = 0;
                L2: while (true) {
                  if (var3_int >= param1) {
                    ws.field_b = param1;
                    break L1;
                  } else {
                    gs.field_b[var3_int] = (var3_int << 12) / param1;
                    var3_int++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 == -1203350004) {
                break L3;
              } else {
                vv.a(86);
                break L3;
              }
            }
            L4: {
              if (ts.field_c != param2) {
                L5: {
                  if (ws.field_b == param2) {
                    uv.field_o = gs.field_b;
                    break L5;
                  } else {
                    uv.field_o = new int[param2];
                    var5 = 0;
                    var3_int = var5;
                    L6: while (true) {
                      if (param2 <= var5) {
                        break L5;
                      } else {
                        uv.field_o[var5] = (var5 << 12) / param2;
                        var5++;
                        continue L6;
                      }
                    }
                  }
                }
                ts.field_c = param2;
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3, "vv.A(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    vv(hl param0) {
        ((vv) this).field_e = null;
        try {
            ((vv) this).field_d = param0;
            ((vv) this).field_e = null;
            ((vv) this).field_c = ((vv) this).field_d.field_c.field_m;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "vv.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 > -91) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = null;
    }
}
