/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static int field_h;
    static int field_e;
    private fc[] field_c;
    private fc field_d;
    static String field_a;
    private int field_f;
    static int field_g;
    private int field_b;
    private fc field_j;
    static int[] field_k;
    static String field_i;

    final fc a(int param0, long param1) {
        fc var5 = null;
        int var6 = TrackController.field_F ? 1 : 0;
        if (param0 != 8434) {
            return null;
        }
        fc var4 = ((id) this).field_c[(int)((long)(((id) this).field_b - 1) & param1)];
        ((id) this).field_j = var4.field_h;
        while (var4 != ((id) this).field_j) {
            if ((param1 ^ -1L) == (((id) this).field_j.field_b ^ -1L)) {
                var5 = ((id) this).field_j;
                ((id) this).field_j = ((id) this).field_j.field_h;
                return var5;
            }
            ((id) this).field_j = ((id) this).field_j.field_h;
        }
        ((id) this).field_j = null;
        return null;
    }

    final static void a(byte param0, int param1, oh param2, String param3, va param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        var5 = 0;
        if (param0 <= -111) {
          var6 = -1;
          var7 = 1;
          L0: while (true) {
            if (var7 >= param3.length()) {
              return;
            } else {
              L1: {
                var8 = param3.charAt(var7);
                if (var8 == 60) {
                  var6 = param4.field_b[0] + ((var5 >> 1682823368) + param2.a(param3.substring(0, var7)));
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var6 != -1) {
                  param4.field_b[var7] = var6;
                  break L2;
                } else {
                  L3: {
                    if (var8 == 32) {
                      var5 = var5 + param1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  param4.field_b[var7] = param4.field_b[0] + ((var5 >> -1934668536) + param2.a(param3.substring(0, 1 + var7)) + -param2.a((char) var8));
                  break L2;
                }
              }
              if (var8 == 62) {
                var6 = -1;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final fc a(byte param0) {
        fc var2 = null;
        int var3 = 0;
        L0: {
          var3 = TrackController.field_F ? 1 : 0;
          if ((((id) this).field_f ^ -1) >= -1) {
            break L0;
          } else {
            if (((id) this).field_c[((id) this).field_f - 1] == ((id) this).field_d) {
              break L0;
            } else {
              var2 = ((id) this).field_d;
              ((id) this).field_d = var2.field_h;
              return var2;
            }
          }
        }
        L1: while (true) {
          if (((id) this).field_b <= ((id) this).field_f) {
            if (param0 != 91) {
              field_e = -86;
              return null;
            } else {
              return null;
            }
          } else {
            ((id) this).field_f = ((id) this).field_f + 1;
            var2 = ((id) this).field_c[((id) this).field_f].field_h;
            if (((id) this).field_c[-1 + ((id) this).field_f] != var2) {
              ((id) this).field_d = var2.field_h;
              return var2;
            } else {
              continue L1;
            }
          }
        }
    }

    final void a(boolean param0, long param1, fc param2) {
        if (!(null == param2.field_e)) {
            param2.a(-38);
        }
        fc var5 = ((id) this).field_c[(int)((long)(((id) this).field_b - 1) & param1)];
        param2.field_h = var5;
        if (param0) {
            ((id) this).field_f = 37;
        }
        param2.field_e = var5.field_e;
        param2.field_e.field_h = param2;
        param2.field_h.field_e = param2;
        param2.field_b = param1;
    }

    final fc b(int param0) {
        if (param0 > -34) {
            fc discarded$0 = ((id) this).b(16);
        }
        ((id) this).field_f = 0;
        return ((id) this).a((byte) 91);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1) {
            return;
        }
        field_i = null;
        field_k = null;
    }

    id(int param0) {
        int var2 = 0;
        fc var3 = null;
        ((id) this).field_f = 0;
        ((id) this).field_c = new fc[param0];
        ((id) this).field_b = param0;
        for (var2 = 0; var2 < param0; var2++) {
            var3 = new fc();
            ((id) this).field_c[var2] = new fc();
            var3.field_h = var3;
            var3.field_e = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 200;
        field_a = "Mouse over an icon for details";
        field_k = new int[8192];
    }
}
