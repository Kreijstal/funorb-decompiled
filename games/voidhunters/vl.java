/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends rqa {
    static mma field_p;
    static String field_q;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                vl.a(-21);
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(98, 125));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vl.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void e(byte param0) {
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        RuntimeException var1_ref = null;
        var4 = VoidHunters.field_G;
        try {
          var1 = gha.field_q;
          synchronized (var1) {
            L0: {
              if (param0 == -101) {
                L1: {
                  baa.field_q = baa.field_q + 1;
                  bva.field_c = nwa.field_a;
                  if (-1 >= (dh.field_p ^ -1)) {
                    L2: while (true) {
                      if (dh.field_p == wlb.field_p) {
                        break L1;
                      } else {
                        var2 = kq.field_o[wlb.field_p];
                        wlb.field_p = 127 & 1 + wlb.field_p;
                        if ((var2 ^ -1) <= -1) {
                          si.field_o[var2] = true;
                          continue L2;
                        } else {
                          si.field_o[var2 ^ -1] = false;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L3: while (true) {
                      if (112 <= var2) {
                        dh.field_p = wlb.field_p;
                        break L1;
                      } else {
                        si.field_o[var2] = false;
                        var2++;
                        continue L3;
                      }
                    }
                  }
                }
                nwa.field_a = tna.field_o;
                break L0;
              } else {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "vl.C(" + param0 + ')');
        }
    }

    vl(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 127) {
            field_p = (mma) null;
            field_p = null;
            field_q = null;
            return;
        }
        field_p = null;
        field_q = null;
    }

    static {
        field_p = new mma();
        field_q = "You need a rating of <%1> to play with the current options.";
    }
}
