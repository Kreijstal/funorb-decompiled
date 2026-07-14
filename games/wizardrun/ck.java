/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    final static void a(java.applet.Applet param0, String[] param1, int param2, int param3, int param4, int param5) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = wizardrun.field_H;
          td.field_d = param0.getParameter("overxgames");
          if (null == td.field_d) {
            td.field_d = "0";
            break L0;
          } else {
            break L0;
          }
        }
        dc.field_n = param0.getParameter("overxachievements");
        if (null != dc.field_n) {
          var6 = param0.getParameter("currency");
          if (var6 == null) {
            L1: {
              bb.field_k = 2;
              nh.field_n = param2;
              wd.field_g = param5;
              ug.field_H = param4;
              dc.field_s = new o[param1.length];
              if (param3 == 34) {
                break L1;
              } else {
                int discarded$4 = ck.a(-99, 41, 24);
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if ((param1.length ^ -1) >= (var7 ^ -1)) {
                nl.field_w = param1;
                return;
              } else {
                dc.field_s[var7] = new o(317, 34);
                var7++;
                continue L2;
              }
            }
          } else {
            if (!af.a((CharSequence) (Object) var6, (byte) 78)) {
              L3: {
                bb.field_k = 2;
                nh.field_n = param2;
                wd.field_g = param5;
                ug.field_H = param4;
                dc.field_s = new o[param1.length];
                if (param3 == 34) {
                  break L3;
                } else {
                  int discarded$5 = ck.a(-99, 41, 24);
                  break L3;
                }
              }
              var7 = 0;
              L4: while (true) {
                if ((param1.length ^ -1) >= (var7 ^ -1)) {
                  nl.field_w = param1;
                  return;
                } else {
                  dc.field_s[var7] = new o(317, 34);
                  var7++;
                  continue L4;
                }
              }
            } else {
              bb.field_k = ph.a(1124, (CharSequence) (Object) var6);
              nh.field_n = param2;
              wd.field_g = param5;
              ug.field_H = param4;
              dc.field_s = new o[param1.length];
              if (param3 != 34) {
                int discarded$6 = ck.a(-99, 41, 24);
                var7 = 0;
                L5: while (true) {
                  if ((param1.length ^ -1) >= (var7 ^ -1)) {
                    nl.field_w = param1;
                    return;
                  } else {
                    dc.field_s[var7] = new o(317, 34);
                    var7++;
                    continue L5;
                  }
                }
              } else {
                var7 = 0;
                L6: while (true) {
                  if ((param1.length ^ -1) >= (var7 ^ -1)) {
                    nl.field_w = param1;
                    return;
                  } else {
                    dc.field_s[var7] = new o(317, 34);
                    var7++;
                    continue L6;
                  }
                }
              }
            }
          }
        } else {
          L7: {
            dc.field_n = "0";
            var6 = param0.getParameter("currency");
            if (var6 == null) {
              bb.field_k = 2;
              break L7;
            } else {
              if (!af.a((CharSequence) (Object) var6, (byte) 78)) {
                bb.field_k = 2;
                break L7;
              } else {
                bb.field_k = ph.a(1124, (CharSequence) (Object) var6);
                break L7;
              }
            }
          }
          nh.field_n = param2;
          wd.field_g = param5;
          ug.field_H = param4;
          dc.field_s = new o[param1.length];
          if (param3 != 34) {
            int discarded$7 = ck.a(-99, 41, 24);
            var7 = 0;
            L8: while (true) {
              if ((param1.length ^ -1) >= (var7 ^ -1)) {
                nl.field_w = param1;
                return;
              } else {
                dc.field_s[var7] = new o(317, 34);
                var7++;
                continue L8;
              }
            }
          } else {
            var7 = 0;
            L9: while (true) {
              if ((param1.length ^ -1) >= (var7 ^ -1)) {
                nl.field_w = param1;
                return;
              } else {
                dc.field_s[var7] = new o(317, 34);
                var7++;
                continue L9;
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        di.a((byte) 60);
        if (param0 != 84) {
            return;
        }
        if (wizardrun.field_G != null) {
            ka.a(wizardrun.field_G, 8053);
            td.b(4);
            wh.b((byte) -104);
            jl.b(1);
            if (!(!ne.b(22845))) {
                n.field_b.c((byte) 88, 1);
                id.a((byte) -67, 0);
            }
            ql.a(param0 ^ -55);
            return;
        }
        td.b(4);
        wh.b((byte) -104);
        jl.b(1);
        if (!(!ne.b(22845))) {
            n.field_b.c((byte) 88, 1);
            id.a((byte) -67, 0);
        }
        ql.a(param0 ^ -55);
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = wizardrun.field_H;
        int var3 = 0;
        while ((param0 ^ -1) < -1) {
            var3 = param1 & 1 | var3 << 2046877441;
            param0--;
            param1 = param1 >>> 1;
        }
        if (param2 != 1685) {
            int discarded$0 = ck.a(-93, -128, 3);
            return var3;
        }
        return var3;
    }

    final static void a(int param0) {
        la.field_d = false;
        int discarded$5 = nk.field_N.f(255);
        if (param0 != 2046877441) {
            return;
        }
    }

    static {
    }
}
