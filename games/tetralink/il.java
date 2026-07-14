/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends en {
    static int field_S;
    static int[] field_T;
    static hl field_Q;
    static String field_O;
    static int field_R;
    int field_N;
    static String field_P;

    final static rj a(String param0, int param1) {
        if (param1 != 14781) {
            field_Q = null;
        }
        return new rj(param0);
    }

    final static long a(int param0, CharSequence param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TetraLink.field_J;
          var2 = 0L;
          var4 = param1.length();
          if (param0 == -23718) {
            break L0;
          } else {
            field_Q = null;
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          L2: {
            if (var5 >= var4) {
              break L2;
            } else {
              L3: {
                L4: {
                  var2 = var2 * 37L;
                  var6 = param1.charAt(var5);
                  if (var6 < 65) {
                    break L4;
                  } else {
                    if (90 >= var6) {
                      var2 = var2 + (long)(1 - (-var6 + 65));
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var6 < 97) {
                    break L5;
                  } else {
                    if (var6 > 122) {
                      break L5;
                    } else {
                      var2 = var2 + (long)(-97 + var6 + 1);
                      break L3;
                    }
                  }
                }
                if (var6 < 48) {
                  break L3;
                } else {
                  if (var6 <= 57) {
                    var2 = var2 + (long)(-48 + var6 + 27);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if (-177917621779460414L < (var2 ^ -1L)) {
                var5++;
                continue L1;
              } else {
                break L2;
              }
            }
          }
          L6: while (true) {
            L7: {
              if (-1L != (var2 % 37L ^ -1L)) {
                break L7;
              } else {
                if (var2 == 0L) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
    }

    public il() {
        super(0, 0, 0, 0, (kg) null, (dn) null);
        ((il) this).field_N = 256;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param3 == 0)) {
            return;
        }
        if (!(null != ((il) this).field_J)) {
            return;
        }
        if (!(0 != ((il) this).field_N)) {
            return;
        }
        if (!(((il) this).field_N != 256)) {
            ((il) this).field_J.a(0, ((il) this).field_t + param1, param2 - -((il) this).field_w, param3);
            return;
        }
        oh var6 = new oh(((il) this).field_J.field_F, ((il) this).field_J.field_u);
        sk.a((byte) 105, var6);
        ((il) this).field_J.a(param0, 0, 0, param3);
        dh.a(-581);
        var6.a(((il) this).field_t + param1, param2 + ((il) this).field_w, ((il) this).field_N);
    }

    il(na param0) {
        super(param0.field_t, param0.field_w, param0.field_F, param0.field_u, (kg) null, (dn) null);
        param0.a(((il) this).field_u, 0, -118, 0, ((il) this).field_F);
        ((il) this).field_J = param0;
        ((il) this).field_N = 256;
    }

    public static void e(byte param0) {
        field_T = null;
        field_Q = null;
        int var1 = -86 % ((-82 - param0) / 43);
        field_O = null;
        field_P = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = new int[]{8};
        field_S = 0;
        field_P = "Kick <%0> from this game";
        field_O = "Previous";
    }
}
