/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static String field_a;
    static int field_e;
    static int field_b;
    static int field_d;
    static String[] field_c;

    final static void a(int param0, int param1, int param2, int param3) {
        jc.a(param2, param1, param3, 0, 2, 0);
        int var4 = 14 / ((-45 - param0) / 48);
    }

    public static void a(int param0) {
        int var1 = 2;
        field_a = null;
        field_c = null;
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) ib.field_f;
        synchronized (var1) {
          L0: {
            la.field_g = ua.field_a;
            fc.field_m = fc.field_m + 1;
            hj.field_S = wi.field_tb;
            eh.field_h = dj.field_d;
            cp.field_U = lj.field_g;
            lj.field_g = false;
            no.field_d = wm.field_g;
            lc.field_c = ak.field_k;
            hm.field_k = em.field_C;
            wm.field_g = param0;
            break L0;
          }
        }
    }

    final static pp a(int param0, byte param1, cn param2, int param3) {
        cn var4 = null;
        RuntimeException var4_ref = null;
        cn var5 = null;
        cn var6 = null;
        cn var7 = null;
        pp stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        pp stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              jh.c();
              var4 = param2;
              var5 = new cn(param2.field_y, param2.field_v);
              var5.e();
              var4.f(0, 0, 96);
              var6 = param2.d();
              var6.e();
              param2.b(0, 0, 256);
              param2.b(0, 0, 256);
              if (param1 <= -108) {
                break L1;
              } else {
                field_e = -70;
                break L1;
              }
            }
            var7 = rb.a(32, param2, 8421631, (byte) 117);
            jh.b();
            stackOut_2_0 = new pp(var4, var5, var6, var7, param3, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("ke.A(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 41);
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, int param1) {
        if (param0 > 56) {
          if (10 != param1) {
            if (param1 != 12) {
              if (param1 != 19) {
                if (param1 != 18) {
                  if (param1 == 9) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Being a python, the snake in this room is not venomous, but its massive size makes it no less deadly to slow-witted raiders.";
        field_e = 0;
        field_c = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
