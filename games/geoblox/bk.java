/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    static dm field_a;
    static dm field_b;
    static String field_c;

    public static void a(boolean param0) {
        if (!param0) {
          field_b = (dm) null;
          field_b = null;
          field_c = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_a = null;
          return;
        }
    }

    final static void a(rh param0, int param1, int param2, ob param3) {
        vd discarded$0 = null;
        try {
            uf.field_a = param1 * sb.a(true) / 1000;
            ab.a(99, param0);
            ni.a(param0, 0);
            if (param2 < 97) {
                discarded$0 = bk.a(true, -54);
            }
            ul.a(-21541, param0);
            jk.b((byte) -91);
            ad.a((byte) -32);
            gb.field_f = -uf.field_a + 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "bk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static vd a(boolean param0, int param1) {
        int discarded$4 = 0;
        String discarded$5 = null;
        int discarded$6 = 0;
        String discarded$7 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        pk var8 = null;
        og var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int[] stackOut_21_0 = null;
        Object stackOut_20_0 = null;
        L0: {
          var7 = Geoblox.field_C;
          var8 = eh.field_d;
          var3 = var8.c((byte) 34);
          gj.field_u = var3 & 127;
          if ((param1 & var3) == 0) {
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
          vd.field_l = stackIn_3_0 != 0;
          bm.field_s = var8.c((byte) 34);
          uf.field_c = var8.b(2901);
          if (-3 != (gj.field_u ^ -1)) {
            uk.field_o = 0;
            tj.field_b = 0;
            break L1;
          } else {
            tj.field_b = var8.b(true);
            uk.field_o = var8.e(105);
            break L1;
          }
        }
        L2: {
          if (-2 != (var8.c((byte) 34) ^ -1)) {
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
          cj.field_a = var8.e((byte) 117);
          if (var4 == 0) {
            jc.field_b = cj.field_a;
            break L3;
          } else {
            jc.field_b = var8.e((byte) 124);
            break L3;
          }
        }
        L4: {
          if (gj.field_u == 1) {
            discarded$4 = var8.b(true);
            discarded$5 = var8.e((byte) 112);
            break L4;
          } else {
            if ((gj.field_u ^ -1) != -5) {
              break L4;
            } else {
              discarded$6 = var8.b(true);
              discarded$7 = var8.e((byte) 112);
              break L4;
            }
          }
        }
        if (!param0) {
          re.field_f = qa.a(var8, 0, 80);
          vj.field_c = null;
          return new vd(param0);
        } else {
          var5 = var8.b(true);
          try {
            L5: {
              L6: {
                var9 = rd.field_r.a((byte) -14, var5);
                re.field_f = var9.e((byte) -69);
                if (!jc.field_b.equals(wd.field_f)) {
                  stackOut_21_0 = var9.field_m;
                  stackIn_22_0 = stackOut_21_0;
                  break L6;
                } else {
                  stackOut_20_0 = null;
                  stackIn_22_0 = (int[]) ((Object) stackOut_20_0);
                  break L6;
                }
              }
              vj.field_c = stackIn_22_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            gi.a((Throwable) ((Object) var6), "CC1", (byte) 125);
            vj.field_c = null;
            re.field_f = null;
            return new vd(param0);
          }
          return new vd(param0);
        }
    }

    static {
        field_a = new dm(640, 640);
        field_c = "Username: ";
    }
}
