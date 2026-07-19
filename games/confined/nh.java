/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    static int field_b;
    static String field_a;

    final static void b(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var1 = tf.field_a;
        synchronized (var1) {
          L0: {
            L1: {
              ka.field_L = ka.field_L + 1;
              Confined.field_I = pe.field_n;
              ld.field_l = r.field_a;
              jh.field_R = rd.field_Nb;
              hn.field_D = th.field_cb;
              if (!param0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            th.field_cb = stackIn_4_0 != 0;
            rh.field_X = sh.field_K;
            wm.field_hb = va.field_a;
            m.field_a = qf.field_f;
            sh.field_K = 0;
            b.field_f = mg.field_e;
            break L0;
          }
        }
    }

    final static void a(sf param0, int param1, int param2) {
        int discarded$57 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        sf var5 = null;
        hb var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            var6 = vh.field_a;
            var6.b(true, param2);
            var6.field_n = var6.field_n + 1;
            var4 = var6.field_n;
            var6.f(100, 1);
            var6.f(117, param0.field_r);
            var6.f(param1 ^ 119, param0.field_u);
            var6.d(-90, param0.field_n);
            var6.d(-99, param0.field_v);
            var6.d(-95, param0.field_m);
            var6.d(-120, param0.field_q);
            discarded$57 = var6.e(26199, var4);
            var6.a(25859, -var4 + var6.field_n);
            if (param1 == 0) {
              break L0;
            } else {
              var5 = (sf) null;
              nh.a((sf) null, 93, 84);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var3);
            stackOut_3_1 = new StringBuilder().append("nh.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        fg discarded$0 = null;
        if (param0) {
            String var2 = (String) null;
            discarded$0 = nh.a((String) null, -4);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static fg a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        fg var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        fg stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fg stackOut_14_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (null != ij.field_t) {
              L1: {
                var6 = (CharSequence) ((Object) param0);
                var2 = hh.a(param1 + param1, var6);
                if (var2 != null) {
                  break L1;
                } else {
                  var2 = param0;
                  break L1;
                }
              }
              var3 = (fg) ((Object) ij.field_t.a((long)var2.hashCode(), -1));
              L2: while (true) {
                if (var3 != null) {
                  L3: {
                    var7 = (CharSequence) ((Object) var3.field_ob);
                    var4 = hh.a(param1 + 0, var7);
                    if (var4 == null) {
                      var4 = var3.field_ob;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (var4.equals(var2)) {
                    stackOut_14_0 = (fg) (var3);
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = (fg) ((Object) ij.field_t.a(param1 ^ 114));
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var2_ref);
            stackOut_18_1 = new StringBuilder().append("nh.B(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fg) ((Object) stackIn_3_0);
        } else {
          return stackIn_15_0;
        }
    }

    static {
        field_a = "Discard";
    }
}
