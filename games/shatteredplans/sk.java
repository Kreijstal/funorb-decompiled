/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends oh {
    int field_j;
    long field_l;
    static qr field_k;
    byte[] field_h;
    static String field_i;

    public static void a(int param0) {
        field_i = null;
        field_k = null;
        if (param0 >= -6) {
            nf discarded$0 = sk.a(false, 27);
        }
    }

    final static nf a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        sl var8 = null;
        dp var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_21_0 = null;
        int[] stackOut_20_0 = null;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          var8 = sa.field_a;
          var3 = var8.j(param1 ^ 113);
          if (param1 == ~(128 & var3)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          kr.field_b = stackIn_3_0 != 0;
          ob.field_k = var3 & 127;
          nj.field_a = var8.j(-77);
          sp.field_j = var8.d(param1 ^ -31);
          if (ob.field_k != 2) {
            el.field_f = 0;
            va.field_b = 0;
            break L1;
          } else {
            el.field_f = var8.f(param1 + -20975);
            va.field_b = var8.k(param1 + 256);
            break L1;
          }
        }
        L2: {
          if (1 != var8.j(param1 + -66)) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          jc.field_s = var8.e(param1);
          if (var4 == 0) {
            em.field_a = jc.field_s;
            break L3;
          } else {
            em.field_a = var8.e(-1);
            break L3;
          }
        }
        L4: {
          L5: {
            if (ob.field_k == 1) {
              break L5;
            } else {
              if (ob.field_k == 4) {
                break L5;
              } else {
                fm.field_f = 0;
                mc.field_q = null;
                break L4;
              }
            }
          }
          fm.field_f = var8.f(param1 + -20975);
          mc.field_q = var8.e(param1);
          break L4;
        }
        if (param0) {
          var5 = var8.f(-20976);
          try {
            L6: {
              L7: {
                var9 = dh.field_c.a((byte) 47, var5);
                ke.field_h = var9.f(80);
                if (em.field_a.equals((Object) (Object) ln.field_o)) {
                  stackOut_21_0 = null;
                  stackIn_22_0 = (int[]) (Object) stackOut_21_0;
                  break L7;
                } else {
                  stackOut_20_0 = var9.field_o;
                  stackIn_22_0 = stackOut_20_0;
                  break L7;
                }
              }
              mb.field_p = stackIn_22_0;
              break L6;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            jq.a(param1 + -29900, (Throwable) (Object) var6, "CC1");
            ke.field_h = null;
            mb.field_p = null;
            return new nf(param0);
          }
          return new nf(param0);
        } else {
          ke.field_h = pe.a((ob) (Object) var8, param1 + 1, 80);
          mb.field_p = null;
          return new nf(param0);
        }
    }

    sk(long param0, int param1, byte[] param2) {
        try {
            ((sk) this).field_l = param0;
            ((sk) this).field_j = param1;
            ((sk) this).field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "sk.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Terraformed system";
    }
}
