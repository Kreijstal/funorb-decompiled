/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kc {
    static int field_c;
    static pj field_a;
    static Boolean field_b;
    static int field_d;

    abstract void a(int param0, gk param1);

    final static void b(boolean param0) {
        if (null != ha.field_Z) {
          if (ha.field_Z.h()) {
            L0: {
              ha.field_Z = li.a(ke.field_h[4], 100, 96);
              na.a((byte) 60, ha.field_Z);
              if (param0) {
                break L0;
              } else {
                field_b = (Boolean) null;
                break L0;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          L1: {
            ha.field_Z = li.a(ke.field_h[4], 100, 96);
            na.a((byte) 60, ha.field_Z);
            if (param0) {
              break L1;
            } else {
              field_b = (Boolean) null;
              break L1;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 4) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var1 = wj.field_k;
          synchronized (var1) {
            L0: {
              L1: {
                o.field_b = bh.field_e;
                je.field_c = je.field_c + 1;
                if (param0 >= 86) {
                  break L1;
                } else {
                  field_b = (Boolean) null;
                  break L1;
                }
              }
              L2: {
                if (0 > vf.field_a) {
                  var5 = 0;
                  var2 = var5;
                  L3: while (true) {
                    if (112 <= var5) {
                      vf.field_a = sl.field_j;
                      break L2;
                    } else {
                      dl.field_c[var5] = false;
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  L4: while (true) {
                    if (sl.field_j == vf.field_a) {
                      break L2;
                    } else {
                      var2 = ia.field_g[sl.field_j];
                      sl.field_j = 127 & sl.field_j + 1;
                      if (-1 < (var2 ^ -1)) {
                        dl.field_c[var2 ^ -1] = false;
                        continue L4;
                      } else {
                        dl.field_c[var2] = true;
                        continue L4;
                      }
                    }
                  }
                }
              }
              bh.field_e = jk.field_w;
              break L0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1_ref), "kc.I(" + param0 + ')');
        }
    }

    abstract fk a(boolean param0);

    static {
        field_d = 0;
    }
}
