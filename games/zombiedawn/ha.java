/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    static String field_c;
    static fc field_d;
    static int field_a;
    static boolean field_e;
    static int field_b;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 127) {
            field_a = -74;
        }
    }

    final static void a(byte param0) {
        if (param0 < 116) {
            field_d = (fc) null;
        }
        fp.field_H = dj.field_e.field_H.field_u + 300;
        ac.field_t = -300;
    }

    final static void b(int param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param0 == 27914) {
                break L1;
              } else {
                ha.a(-110);
                break L1;
              }
            }
            var1 = ea.field_c;
            synchronized (var1) {
              L2: {
                L3: {
                  nl.field_s = nl.field_s + 1;
                  he.field_e = wb.field_y;
                  if (ih.field_F < 0) {
                    var5 = 0;
                    var2 = var5;
                    L4: while (true) {
                      if (var5 >= 112) {
                        ih.field_F = uc.field_d;
                        break L3;
                      } else {
                        bo.field_p[var5] = false;
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    L5: while (true) {
                      if (ih.field_F == uc.field_d) {
                        break L3;
                      } else {
                        var2 = nd.field_c[uc.field_d];
                        uc.field_d = 127 & 1 + uc.field_d;
                        if (-1 >= (var2 ^ -1)) {
                          bo.field_p[var2] = true;
                          continue L5;
                        } else {
                          bo.field_p[var2 ^ -1] = false;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                wb.field_y = je.field_c;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "ha.B(" + param0 + ')');
        }
    }

    static {
        field_d = null;
        field_c = "Select Level";
        field_b = 0;
    }
}
