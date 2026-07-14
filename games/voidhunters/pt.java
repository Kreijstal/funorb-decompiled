/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pt extends rqa {
    static int field_o;

    final static String a(int param0, int param1) {
        if (param1 > -26) {
            String discarded$0 = pt.a(-66, 68);
        }
        return "0" + (param0 + 1) + "/" + "0" + mb.field_k.length;
    }

    final static tv[] a(int param0, int param1, tv[] param2, dja param3, int param4, faa param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          var7 = 47 / ((82 - param0) / 43);
          var6 = param5.i(0, param4);
          if (0 == var6) {
            param2 = null;
            break L0;
          } else {
            L1: {
              L2: {
                if (param2 == null) {
                  break L2;
                } else {
                  if (param2.length != var6) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              param2 = param3.a(11995, var6);
              param2 = param2;
              break L1;
            }
            var8 = 0;
            L3: while (true) {
              if (var8 >= var6) {
                break L0;
              } else {
                if (kv.a(false, param5)) {
                  L4: {
                    if (param2[var8] == null) {
                      param2[var8] = param3.a((byte) 109);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((utb) (Object) param2[var8]).a(param5, 32);
                  var8++;
                  continue L3;
                } else {
                  param2[var8] = null;
                  var8++;
                  continue L3;
                }
              }
            }
          }
        }
        return param2;
    }

    pt(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            Object var4 = null;
            nc discarded$0 = ((pt) this).a((nc[]) null, -95);
        }
        return new nc(oq.field_E);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 64;
    }
}
