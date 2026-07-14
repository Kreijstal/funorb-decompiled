/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iba extends rqa {
    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((iba) this).a((nc[]) null, -72);
          return new nc(nda.field_q);
        } else {
          return new nc(nda.field_q);
        }
    }

    final static void a(no param0, int param1, byte param2, int param3, phb[] param4, boolean param5, String param6, int param7, int param8, boolean param9, int param10, phb[] param11, int param12, int param13, int param14) {
        qma.a(param0, ag.field_p, fda.field_o, param13, param12, param14, param10, param3, param0, skb.field_o, param14, param8, new bc(param11), mb.field_j, eqa.field_o, eh.field_p, param2 + 29, param1, new bc(param4), param10);
        k.a(param7, param9, param6, param5, (byte) 25);
        if (param2 != -115) {
            Object var16 = null;
            iba.a((no) null, 4, (byte) 70, -69, (phb[]) null, true, (String) null, -82, -63, false, -29, (phb[]) null, -73, 82, -95);
        }
    }

    final static tsa a(int param0, qab param1) {
        int var2 = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var7 = VoidHunters.field_G;
        param1.field_b = param1.field_b - 1;
        var2 = param1.field_b - 1;
        var3 = new StringBuilder();
        var4 = param1.a(-76);
        if (param0 >= 10) {
          StringBuilder discarded$10 = var3.append(var4);
          var5 = 0;
          L0: while (true) {
            if (!param1.a((byte) -126)) {
              var6 = param1.a(-82);
              if (var5 == 0) {
                L1: {
                  if (var6 != 92) {
                    StringBuilder discarded$11 = var3.append(var6);
                    break L1;
                  } else {
                    var5 = 1;
                    break L1;
                  }
                }
                if (var4 != var6) {
                  continue L0;
                } else {
                  L2: {
                    if (34 != var4) {
                      stackOut_16_0 = ek.field_o;
                      stackIn_17_0 = stackOut_16_0;
                      break L2;
                    } else {
                      stackOut_15_0 = dla.field_d;
                      stackIn_17_0 = stackOut_15_0;
                      break L2;
                    }
                  }
                  var6 = stackIn_17_0;
                  return new tsa(var6, var2, var3.toString());
                }
              } else {
                var5 = 0;
                StringBuilder discarded$12 = var3.append(var6);
                continue L0;
              }
            } else {
              L3: {
                if (34 != var4) {
                  stackOut_6_0 = ek.field_o;
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_5_0 = dla.field_d;
                  stackIn_7_0 = stackOut_5_0;
                  break L3;
                }
              }
              var6 = stackIn_7_0;
              return new tsa(var6, var2, var3.toString());
            }
          }
        } else {
          return null;
        }
    }

    iba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
