/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends lh {
    int field_i;
    int field_j;
    int field_l;
    static vc field_r;
    static String field_p;
    mi field_q;
    int field_m;
    int field_n;
    static String field_k;
    static dd field_o;

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        we.a(param0 + -7);
        gb.g(param2, param4, param1, param3);
        if (param0 != -52) {
            mi.a((byte) -106);
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_o = null;
        field_k = null;
        if (param0 != 27) {
          mi.a((byte) -97, -115, -108, -36, -108);
          field_r = null;
          return;
        } else {
          field_r = null;
          return;
        }
    }

    mi(int param0, int param1, int param2, int param3, int param4) {
        ((mi) this).field_j = param2;
        ((mi) this).field_l = param4;
        ((mi) this).field_i = param1;
        ((mi) this).field_m = param0;
        ((mi) this).field_n = param3;
    }

    final static jd c(byte param0) {
        if (!(null != ll.field_n)) {
            ll.field_n = new jd();
            ll.field_n.a(ug.field_e, true);
            ll.field_n.field_a = nb.field_c;
            ll.field_n.field_b = 7697781;
            ll.field_n.field_k = 14;
            ll.field_n.field_e = 0;
            ll.field_n.field_j = 4;
            ll.field_n.field_f = 2763306;
            ll.field_n.field_r = 5;
            ll.field_n.field_c = 6;
        }
        return ll.field_n;
    }

    final static void a(byte param0, int param1, boolean param2, wk param3) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        Throwable var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (null != hh.field_b) {
                jd.a(true, 1048576, (byte) 102, param3, 256);
                break L1;
              } else {
                break L1;
              }
            }
            if (gg.field_h == null) {
              break L0;
            } else {
              var4 = (Object) (Object) db.field_J;
              synchronized (var4) {
                L2: {
                  gg.field_h.a(256, true, -1);
                  if (param3 == ae.field_b) {
                    return;
                  } else {
                    L3: {
                      gg.field_h.e(-398);
                      db.field_J.g();
                      ae.field_b = param3;
                      if (ae.field_b == null) {
                        break L3;
                      } else {
                        gg.field_h.a(true, 68, ae.field_b);
                        break L3;
                      }
                    }
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4_ref;
            stackOut_16_1 = new StringBuilder().append("mi.D(").append(12).append(',').append(256).append(',').append(true).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Loading music";
        field_k = "Back";
        field_r = new vc();
    }
}
