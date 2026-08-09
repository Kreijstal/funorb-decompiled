/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class r extends pj {
    static int[] field_r;

    final static br a(boolean param0, byte param1) {
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        pl var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        pl var8 = null;
        oq var9 = null;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          var8 = ig.field_a;
          var2 = var8;
          var3 = var8.e(-31302);
          jb.field_h = 127 & var3;
          if (0 == (var3 & 128)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          is.field_a = stackIn_3_0 != 0;
          wn.field_a = var8.e(-31302);
          bb.field_j = var8.a((byte) 113);
          if (2 == jb.field_h) {
            eh.field_c = var8.a(255);
            jt.field_w = var8.c((byte) 126);
            break L1;
          } else {
            jt.field_w = 0;
            eh.field_c = 0;
            break L1;
          }
        }
        L2: {
          if (param1 < -51) {
            break L2;
          } else {
            field_r = (int[]) null;
            break L2;
          }
        }
        L3: {
          if (-2 != (var8.e(-31302) ^ -1)) {
            stackIn_11_0 = 0;
            break L3;
          } else {
            stackIn_11_0 = 1;
            break L3;
          }
        }
        L4: {
          var4 = stackIn_11_0;
          wk.field_f = var8.d(-1);
          if (var4 == 0) {
            fu.field_E = wk.field_f;
            break L4;
          } else {
            fu.field_E = var8.d(-1);
            break L4;
          }
        }
        L5: {
          if ((jb.field_h ^ -1) == -2) {
            var8.a(255);
            var8.d(-1);
            break L5;
          } else {
            if (4 != jb.field_h) {
              break L5;
            } else {
              var8.a(255);
              var8.d(-1);
              break L5;
            }
          }
        }
        if (!param0) {
          oi.field_c = jb.a(var8, 80, -14832);
          tm.field_c = null;
          return new br(param0);
        } else {
          var5 = var8.a(255);
          try {
            L6: {
              L7: {
                var9 = kb.field_c.a(var5, -32769);
                oi.field_c = var9.f(1118);
                if (!fu.field_E.equals(qv.field_o)) {
                  stackIn_24_0 = var9.field_u;
                  break L7;
                } else {
                  stackIn_24_0 = null;
                  break L7;
                }
              }
              tm.field_c = stackIn_24_0;
              break L6;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            ms.a("CC1", (Throwable) ((Object) var6), 0);
            tm.field_c = null;
            oi.field_c = null;
            return new br(param0);
          }
          return new br(param0);
        }
    }

    public static void a(int param0) {
        int var1 = -113 % ((param0 - -31) / 47);
        field_r = null;
    }

    protected r() {
    }

    static {
        field_r = new int[8192];
    }
}
