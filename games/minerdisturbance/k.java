/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends cb {
    static boolean field_i;

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param1, 5) == fg.field_d) {
              stackIn_3_0 = hn.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = 9 % ((49 - param0) / 56);
              stackIn_5_0 = c.field_b;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("k.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_5_0;
        }
    }

    k(ui param0) {
        super(param0);
    }

    final static void f(int param0) {
        Object var1 = null;
        Throwable decompiledCaughtException = null;
        Object var1_ref = null;
        var1_ref = lb.field_y;
        synchronized (var1_ref) {
          L0: {
            ld.field_B = qd.field_J;
            t.field_c = t.field_c + 1;
            nk.field_w = sa.field_o;
            gb.field_e = nm.field_a;
            field_i = kk.field_d;
            kk.field_d = false;
            jk.field_ab = ic.field_n;
            wi.field_w = al.field_n;
            m.field_e = vl.field_G;
            if (param0 == 10525) {
              ic.field_n = 0;
              break L0;
            } else {
              return;
            }
          }
        }
    }

    final static String g(int param0) {
        if ((af.field_u ^ -1) <= -3) {
          if (null != sb.field_r) {
            if (!sb.field_r.a((byte) 107)) {
              return ge.field_d;
            } else {
              return ic.field_g;
            }
          } else {
            if (hj.field_i.a((byte) 111)) {
              if (!hj.field_i.a(false, "commonui")) {
                return ub.field_c + " - " + hj.field_i.a("commonui", param0 + 22834) + "%";
              } else {
                if (!pb.field_r.a((byte) 99)) {
                  return dc.field_a;
                } else {
                  if (pb.field_r.a(false, "commonui")) {
                    if (oh.field_C.a((byte) 85)) {
                      if (oh.field_C.b(-1)) {
                        if (param0 != -22962) {
                          k.g(-76);
                          return nj.field_d;
                        } else {
                          return nj.field_d;
                        }
                      } else {
                        return ec.field_f + " - " + oh.field_C.c(-14858) + "%";
                      }
                    } else {
                      return l.field_e;
                    }
                  } else {
                    return mb.field_a + " - " + pb.field_r.a("commonui", -121) + "%";
                  }
                }
              }
            } else {
              return ul.field_d;
            }
          }
        } else {
          return aa.field_f;
        }
    }

    final ag a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        ag stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (dg.a(param0, -115) != null) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_3_0;
              if (param1 == 5) {
                break L2;
              } else {
                var4 = (String) null;
                this.a((String) null, -75);
                break L2;
              }
            }
            if (var3_int == 0) {
              stackIn_8_0 = fg.field_d;
              break L0;
            } else {
              return sc.field_a;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("k.D(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    static {
        field_i = false;
    }
}
