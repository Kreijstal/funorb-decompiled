/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ur extends rqa {
    final static wma a(faa param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        wma var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        var2 = param0.i(0, 8);
        if (var2 <= 0) {
          var3 = kv.a(false, param0) ? 1 : 0;
          var4 = kv.a(false, param0) ? 1 : 0;
          var5 = new wma();
          var5.field_J = (short)param0.i(0, 16);
          var5.field_r = et.a(param0, 16, 24, var5.field_r);
          var5.field_o = et.a(param0, 16, 24, var5.field_o);
          var5.field_p = et.a(param0, 16, 24, var5.field_p);
          var6 = -116 / ((-14 - param1) / 61);
          var5.field_y = (short)param0.i(0, 16);
          var5.field_w = et.a(param0, 16, 24, var5.field_w);
          var5.field_N = et.a(param0, 16, 24, var5.field_N);
          var5.field_D = et.a(param0, 16, 24, var5.field_D);
          if (var3 == 0) {
            L0: {
              if (var4 != 0) {
                int discarded$5 = param0.i(0, 16);
                var5.field_b = et.a(param0, 16, 24, var5.field_b);
                var5.field_m = et.a(param0, 16, 24, var5.field_m);
                var5.field_f = et.a(param0, 16, 24, var5.field_f);
                var5.field_i = et.a(param0, 16, 24, var5.field_i);
                var5.field_c = et.a(param0, 16, 24, var5.field_c);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (kv.a(false, param0)) {
                var5.field_K = et.a(param0, 16, 24, var5.field_K);
                break L1;
              } else {
                break L1;
              }
            }
            if (kv.a(false, param0)) {
              var5.field_E = mca.a(false, 16, param0, var5.field_E);
              var7 = 0;
              var8 = 0;
              L2: while (true) {
                if (var5.field_E.length <= var8) {
                  if (var7 == 0) {
                    var5.field_E = null;
                    return var5;
                  } else {
                    var5.field_z = (byte)(1 + var7);
                    return var5;
                  }
                } else {
                  if (var7 < (255 & var5.field_E[var8])) {
                    var7 = 255 & var5.field_E[var8];
                    var8++;
                    continue L2;
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            } else {
              return var5;
            }
          } else {
            L3: {
              var5.field_L = (short)param0.i(0, 16);
              var5.field_k = et.a(param0, 16, 24, var5.field_k);
              var5.field_v = et.a(param0, 16, 24, var5.field_v);
              var5.field_n = et.a(param0, 16, 24, var5.field_n);
              var5.field_j = et.a(param0, 16, 24, var5.field_j);
              var5.field_G = et.a(param0, 16, 24, var5.field_G);
              var5.field_I = et.a(param0, 16, 24, var5.field_I);
              if (var4 != 0) {
                int discarded$6 = param0.i(0, 16);
                var5.field_b = et.a(param0, 16, 24, var5.field_b);
                var5.field_m = et.a(param0, 16, 24, var5.field_m);
                var5.field_f = et.a(param0, 16, 24, var5.field_f);
                var5.field_i = et.a(param0, 16, 24, var5.field_i);
                var5.field_c = et.a(param0, 16, 24, var5.field_c);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (kv.a(false, param0)) {
                var5.field_K = et.a(param0, 16, 24, var5.field_K);
                break L4;
              } else {
                break L4;
              }
            }
            if (kv.a(false, param0)) {
              L5: {
                var5.field_E = mca.a(false, 16, param0, var5.field_E);
                var7 = 0;
                var8 = 0;
                if (var5.field_E.length <= var8) {
                  break L5;
                } else {
                  L6: {
                    if (var7 < (255 & var5.field_E[var8])) {
                      var7 = 255 & var5.field_E[var8];
                      break L6;
                    } else {
                      var8++;
                      break L6;
                    }
                  }
                  var8++;
                  var8++;
                  var8++;
                  break L5;
                }
              }
              if (var7 == 0) {
                var5.field_E = null;
                return var5;
              } else {
                var5.field_z = (byte)(1 + var7);
                return var5;
              }
            } else {
              return var5;
            }
          }
        } else {
          throw new IllegalStateException("" + var2);
        }
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((ur) this).a((nc[]) null, 2);
          return new nc(mbb.field_c);
        } else {
          return new nc(mbb.field_c);
        }
    }

    ur(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
