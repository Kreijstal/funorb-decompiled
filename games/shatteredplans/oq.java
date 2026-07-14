/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq {
    static int field_c;
    oq field_f;
    static volatile boolean field_e;
    String field_h;
    static int field_j;
    String field_d;
    static qr[] field_b;
    static String[] field_i;
    static km field_a;
    static ej field_g;

    final static int a(byte param0, int param1, int param2) {
        if (param0 != -123) {
            oq.a(-75, true);
        }
        if (param2 == 1) {
            if (!(!qe.a((byte) -65, param1))) {
                return 29;
            }
        }
        return er.field_b[param2];
    }

    final static String[] a(byte[] param0, byte param1) {
        int var4 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        String var2 = rm.a(param0, param1 ^ -17731);
        if (param1 != -17) {
            field_b = null;
        }
        String[] var3 = so.a(var2, '\n', -123);
        for (var4 = 0; var4 < var3.length; var4++) {
            var3[var4] = var3[var4].trim();
        }
        return var3;
    }

    final static void a(int param0, boolean param1) {
        sl var2 = js.field_f;
        if (param1) {
            return;
        }
        var2.h(param0, 255);
        var2.c(1, (byte) -114);
        var2.c(3, (byte) -73);
    }

    public static void a(int param0) {
        field_g = null;
        field_i = null;
        field_b = null;
        field_a = null;
        if (param0 != 29) {
            Object var2 = null;
        }
    }

    final static void a(boolean param0) {
        if (!(eh.field_P)) {
            throw new IllegalStateException();
        }
        or.field_a = true;
        wk.a(param0, false);
        gm.field_i = 0;
    }

    oq(String param0, String param1, oq param2) {
        ((oq) this).field_d = param0;
        ((oq) this).field_h = param1;
        ((oq) this).field_f = param2;
    }

    final static long a(int param0, CharSequence param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0L;
        var4 = param1.length();
        var5 = 0;
        L0: while (true) {
          L1: {
            if (var4 <= var5) {
              break L1;
            } else {
              L2: {
                L3: {
                  var2 = var2 * 37L;
                  var6 = param1.charAt(var5);
                  if (var6 < 65) {
                    break L3;
                  } else {
                    if (90 >= var6) {
                      var2 = var2 + (long)(1 - (-var6 + 65));
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var6 < 97) {
                    break L4;
                  } else {
                    if (var6 <= 122) {
                      var2 = var2 + (long)(1 - -var6 - 97);
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var6 < 48) {
                  break L2;
                } else {
                  if (var6 > 57) {
                    break L2;
                  } else {
                    var2 = var2 + (long)(var6 + 27 - 48);
                    break L2;
                  }
                }
              }
              if (-177917621779460414L < (var2 ^ -1L)) {
                var5++;
                continue L0;
              } else {
                break L1;
              }
            }
          }
          if (param0 == 5722) {
            L5: while (true) {
              L6: {
                if (0L != var2 % 37L) {
                  break L6;
                } else {
                  if (-1L == (var2 ^ -1L)) {
                    break L6;
                  } else {
                    var2 = var2 / 37L;
                    continue L5;
                  }
                }
              }
              return var2;
            }
          } else {
            return 13L;
          }
        }
    }

    final static ro a(String param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1) {
            Object var6 = null;
        }
        int var2 = param0.length();
        for (var3 = 0; var2 > var3; var3++) {
            var4 = param0.charAt(var3);
            if (48 > var4) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        return as.field_t;
    }

    final static void a(int param0, int param1) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        fk var4 = (fk) (Object) tr.field_vb.d(0);
        while (var4 != null) {
            dn.a(param0, var4, (byte) 13);
            var4 = (fk) (Object) tr.field_vb.a((byte) -71);
        }
        oh var2 = ua.field_d.d(0);
        if (param1 != 37) {
            field_i = null;
        }
        while (var2 != null) {
            cp.a(param0, 1);
            var2 = ua.field_d.a((byte) -71);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 20;
        field_e = true;
    }
}
