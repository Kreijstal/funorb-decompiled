/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static wl field_b;
    static String[] field_a;
    static boolean field_c;

    final static void a(boolean param0) {
        int var2 = 0;
        jh var3_ref_jh = null;
        int var3 = 0;
        cc var4 = null;
        int var4_int = 0;
        Object var5 = null;
        byte[] var5_array = null;
        int var6 = 0;
        byte[] var7 = null;
        uc var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var42 = null;
        var6 = Terraphoenix.field_V;
        var8 = mk.field_j;
        var2 = var8.a(-16384);
        if (0 != var2) {
          if (var2 != 1) {
            bd.a((Throwable) null, "A1: " + r.i(-15465), 117);
            gb.g(-17464);
            if (param0) {
              return;
            } else {
              uk.a(-74);
              return;
            }
          } else {
            var3 = var8.f((byte) -107);
            var4 = (cc) (Object) qb.field_a.d(9272);
            L0: while (true) {
              if (var4 == null) {
                if (var4 != null) {
                  var4.b((byte) 12);
                  if (!param0) {
                    uk.a(-74);
                    return;
                  } else {
                    return;
                  }
                } else {
                  gb.g(-17464);
                  return;
                }
              } else {
                if (var3 != var4.field_k) {
                  var4 = (cc) (Object) qb.field_a.e((byte) -119);
                  continue L0;
                } else {
                  if (var4 != null) {
                    L1: {
                      var4.b((byte) 12);
                      if (param0) {
                        break L1;
                      } else {
                        uk.a(-74);
                        break L1;
                      }
                    }
                    return;
                  } else {
                    gb.g(-17464);
                    return;
                  }
                }
              }
            }
          }
        } else {
          var3_ref_jh = (jh) (Object) qc.field_a.d(9272);
          if (var3_ref_jh != null) {
            L2: {
              var4_int = var8.a(-16384);
              if (-1 == (var4_int ^ -1)) {
                var5_array = null;
                break L2;
              } else {
                var42 = new byte[var4_int];
                var11 = var42;
                var10 = var11;
                var9 = var10;
                var7 = var9;
                var5_array = var7;
                var8.a(var4_int, 0, 90, var42);
                break L2;
              }
            }
            var8.field_k = var8.field_k + 4;
            if (!var8.c(0)) {
              gb.g(-17464);
              return;
            } else {
              var3_ref_jh.field_i = true;
              var3_ref_jh.field_j = var5_array;
              var3_ref_jh.b((byte) 12);
              if (param0) {
                return;
              } else {
                uk.a(-74);
                return;
              }
            }
          } else {
            gb.g(-17464);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 > -28) {
            field_c = true;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
