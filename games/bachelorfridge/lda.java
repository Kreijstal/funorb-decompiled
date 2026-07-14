/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lda {
    static String field_d;
    static String field_b;
    static int field_a;
    private kv[] field_c;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        Object var7 = null;
        if (param1 <= 8) {
          var7 = null;
          String discarded$2 = lda.a(26, 32, (String) null);
          hp.a(param4, param2, (byte) 108, param0, ((lda) this).field_c, param3);
          return;
        } else {
          hp.a(param4, param2, (byte) 108, param0, ((lda) this).field_c, param3);
          return;
        }
    }

    final static rma a(String param0, int param1, byte param2) {
        dm var3 = null;
        var3 = new dm();
        if (param2 >= -111) {
          field_a = -15;
          ((rma) (Object) var3).field_a = param0;
          ((rma) (Object) var3).field_b = param1;
          return (rma) (Object) var3;
        } else {
          ((rma) (Object) var3).field_a = param0;
          ((rma) (Object) var3).field_b = param1;
          return (rma) (Object) var3;
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 >= -15) {
            return -52;
        }
        return param0 & 255;
    }

    final static String a(int param0, int param1, String param2) {
        int var4 = 0;
        pf var6 = null;
        pf var7 = null;
        pf var8 = null;
        pf var9 = null;
        CharSequence var11 = null;
        var11 = (CharSequence) (Object) param2;
        if (wc.a(0, var11)) {
          if (-3 == (um.field_c ^ -1)) {
            if (!wb.a((byte) 52, param2)) {
              if (gl.a(3, param2)) {
                return lga.a(true, new String[1], rt.field_c);
              } else {
                if (maa.field_v >= 100) {
                  if (0 < dm.field_f) {
                    if (param0 == -26181) {
                      if (-201 >= (maa.field_v ^ -1)) {
                        return he.field_m;
                      } else {
                        if (bna.a((byte) 5, param2)) {
                          return lga.a(true, new String[1], bda.field_p);
                        } else {
                          var9 = sja.field_fb;
                          var9.c(param1, (byte) 116);
                          var9.field_g = var9.field_g + 1;
                          var4 = var9.field_g;
                          var9.d(0, 0);
                          var9.a((byte) -50, param2);
                          var9.b((byte) 124, -var4 + var9.field_g);
                          return null;
                        }
                      }
                    } else {
                      field_d = null;
                      if (-201 >= (maa.field_v ^ -1)) {
                        return he.field_m;
                      } else {
                        if (bna.a((byte) 5, param2)) {
                          return lga.a(true, new String[1], bda.field_p);
                        } else {
                          var8 = sja.field_fb;
                          var8.c(param1, (byte) 116);
                          var8.field_g = var8.field_g + 1;
                          var4 = var8.field_g;
                          var8.d(0, 0);
                          var8.a((byte) -50, param2);
                          var8.b((byte) 124, -var4 + var8.field_g);
                          return null;
                        }
                      }
                    }
                  } else {
                    return he.field_m;
                  }
                } else {
                  if (param0 == -26181) {
                    if (-201 >= (maa.field_v ^ -1)) {
                      return he.field_m;
                    } else {
                      if (bna.a((byte) 5, param2)) {
                        return lga.a(true, new String[1], bda.field_p);
                      } else {
                        var7 = sja.field_fb;
                        var7.c(param1, (byte) 116);
                        var7.field_g = var7.field_g + 1;
                        var4 = var7.field_g;
                        var7.d(0, 0);
                        var7.a((byte) -50, param2);
                        var7.b((byte) 124, -var4 + var7.field_g);
                        return null;
                      }
                    }
                  } else {
                    field_d = null;
                    if (-201 >= (maa.field_v ^ -1)) {
                      return he.field_m;
                    } else {
                      if (bna.a((byte) 5, param2)) {
                        return lga.a(true, new String[1], bda.field_p);
                      } else {
                        var6 = sja.field_fb;
                        var6.c(param1, (byte) 116);
                        var6.field_g = var6.field_g + 1;
                        var4 = var6.field_g;
                        var6.d(0, 0);
                        var6.a((byte) -50, param2);
                        var6.b((byte) 124, -var4 + var6.field_g);
                        return null;
                      }
                    }
                  }
                }
              }
            } else {
              return cea.field_a;
            }
          } else {
            return ama.field_l;
          }
        } else {
          return mk.field_f;
        }
    }

    public static void a(byte param0) {
        int var1 = 90 % ((-75 - param0) / 49);
        field_d = null;
        field_b = null;
    }

    lda(kv[] param0) {
        ((lda) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unfortunately you are not eligible to create an account.";
        field_d = "You have entered another game.";
    }
}
