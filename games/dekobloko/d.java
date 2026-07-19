/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static ck[] field_h;
    static w field_g;
    static int field_b;
    static mh field_f;
    static w field_a;
    static int[] field_d;
    static pi field_e;
    static int field_c;

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        field_a = null;
        field_f = null;
        field_e = null;
        if (param0 != 36) {
          d.a(false);
          field_h = null;
          return;
        } else {
          field_h = null;
          return;
        }
    }

    final static void a(boolean param0) {
        RuntimeException runtimeException = null;
        be var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              md.field_Z = 0;
              f.field_w = null;
              ed.field_g = 0;
              qi.field_S.c(111);
              uf.field_z.c(117);
              if (param0) {
                break L1;
              } else {
                d.a(true);
                break L1;
              }
            }
            var1 = mc.field_a.c(-9443);
            L2: while (true) {
              L3: {
                L4: {
                  if (var1 == null) {
                    break L4;
                  } else {
                    var1.e((byte) 105);
                    var1 = mc.field_a.b(-112);
                    if (var2 != 0) {
                      break L3;
                    } else {
                      if (var2 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var1 = hg.field_e.c(-9443);
                break L3;
              }
              L5: while (true) {
                L6: {
                  L7: {
                    if (var1 == null) {
                      break L7;
                    } else {
                      var1.e((byte) 100);
                      var1 = hg.field_e.b(104);
                      if (var2 != 0) {
                        break L6;
                      } else {
                        if (var2 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  jj.field_b = 0;
                  break L6;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) runtimeException), "d.A(" + param0 + ')');
        }
    }

    static {
        field_d = new int[8192];
        field_c = 0;
        field_e = new pi(36, 36, 0);
    }
}
