/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pda extends rqa {
    pda(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        var8 = VoidHunters.field_G;
        if (param4 == -2) {
          if (ob.field_j <= param1) {
            if (mt.field_o >= param5) {
              if (param3 >= lua.field_c) {
                if (param0 <= hab.field_i) {
                  if (param6 == 1) {
                    nv.a(param2, 102, param3, param0, param1, param5);
                    return;
                  } else {
                    rg.a(param5, param0, param1, param2, param3, param6, 120);
                    return;
                  }
                } else {
                  if (-2 == (param6 ^ -1)) {
                    lob.a(param5, param2, param1, 256, param3, param0);
                    return;
                  } else {
                    is.a(param5, param2, param1, param6, 20408, param3, param0);
                    return;
                  }
                }
              } else {
                if (-2 == (param6 ^ -1)) {
                  lob.a(param5, param2, param1, 256, param3, param0);
                  return;
                } else {
                  is.a(param5, param2, param1, param6, 20408, param3, param0);
                  return;
                }
              }
            } else {
              if (-2 == (param6 ^ -1)) {
                lob.a(param5, param2, param1, 256, param3, param0);
                return;
              } else {
                is.a(param5, param2, param1, param6, 20408, param3, param0);
                return;
              }
            }
          } else {
            if (-2 == (param6 ^ -1)) {
              lob.a(param5, param2, param1, 256, param3, param0);
              return;
            } else {
              is.a(param5, param2, param1, param6, 20408, param3, param0);
              return;
            }
          }
        } else {
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          pda.a(-5, -124, 5, -27, -5, 31, 53);
          return new nc((Object) (Object) frb.a(160, 80));
        } else {
          return new nc((Object) (Object) frb.a(160, 80));
        }
    }

    static {
    }
}
