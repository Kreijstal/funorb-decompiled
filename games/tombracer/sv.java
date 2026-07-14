/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sv extends wv {
    static String field_q;
    private dea field_r;

    final static String a(byte param0, long param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        if (-1L > (param1 ^ -1L)) {
          if ((param1 ^ -1L) > -6582952005840035282L) {
            if (-1L != (param1 % 37L ^ -1L)) {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                if ((var4 ^ -1L) == -1L) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (0L == param1) {
                      if (param0 != -38) {
                        field_q = null;
                        StringBuilder discarded$3 = var6.reverse();
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      } else {
                        StringBuilder discarded$4 = var6.reverse();
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      }
                    } else {
                      L2: {
                        var7 = param1;
                        param1 = param1 / 37L;
                        var9 = fra.field_n[(int)(-(37L * param1) + var7)];
                        if (95 == var9) {
                          var10 = var6.length() + -1;
                          var9 = 160;
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      StringBuilder discarded$5 = var6.append(var9);
                      continue L1;
                    }
                  }
                } else {
                  var3++;
                  var4 = var4 / 37L;
                  continue L0;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final int a(byte param0, int param1) {
        if (0 == param1) {
            return 0;
        }
        if (param0 < 111) {
            int discarded$11 = ((sv) this).g(19, -86);
            if (!(param1 != -1 + ((sv) this).field_m.length)) {
                return aaa.a(false) - ((sv) this).field_m[param1].e(-163);
            }
            if (!(param1 >= 3)) {
                return 30 + (20 + aaa.a(false) / 2) - ((sv) this).field_m[param1].e(-163);
            }
            return aaa.a(false) / 2 + 30;
        }
        if (!(param1 != -1 + ((sv) this).field_m.length)) {
            return aaa.a(false) - ((sv) this).field_m[param1].e(-163);
        }
        if (!(param1 >= 3)) {
            return 30 + (20 + aaa.a(false) / 2) - ((sv) this).field_m[param1].e(-163);
        }
        return aaa.a(false) / 2 + 30;
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        ((sv) this).field_r.c(param0 ^ -87);
    }

    final void a(byte param0, boolean param1) {
        super.a(param0, param1);
        int var3 = ((sv) this).field_m[1].field_i + -70 + ((sv) this).field_r.e(47) + -150;
        tp.field_K.a((aaa.a(false) >> 497193505) - (tp.field_K.a() >> -248090687), var3);
    }

    public static void d(int param0) {
        field_q = null;
        if (param0 > -42) {
            field_q = null;
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
          int discarded$2 = ((sv) this).g(-74, 3);
          return ((sv) this).a((byte) 116, param0) + ((sv) this).field_m[param0].e(-163);
        } else {
          return ((sv) this).a((byte) 116, param0) + ((sv) this).field_m[param0].e(-163);
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        super.a(param0, param1, param2);
        ((sv) this).field_r.a((byte) -111, param0, !param1 ? true : false);
    }

    final boolean a(int param0, char param1, int param2) {
        if ((param0 ^ -1) != -14) {
          if (param2 != 1) {
            ((sv) this).field_r = null;
            return super.a(param0, param1, 1);
          } else {
            return super.a(param0, param1, 1);
          }
        } else {
          return true;
        }
    }

    final int g(int param0, int param1) {
        int var3 = 0;
        if (-1 != (param0 ^ -1)) {
          if (param0 != ((sv) this).field_m.length - 1) {
            if (3 > param0) {
              var3 = 20;
              return var3 + (((sv) this).field_n - -((param0 + -1) * ((sv) this).field_m[param0].d(11919)) + -((sv) this).field_m[0].d(11919));
            } else {
              if (param1 != 30) {
                field_q = null;
                return ((sv) this).field_n + ((param0 - 3) * ((sv) this).field_i + -((sv) this).field_m[param0].d(11919));
              } else {
                return ((sv) this).field_n + ((param0 - 3) * ((sv) this).field_i + -((sv) this).field_m[param0].d(11919));
              }
            }
          } else {
            var3 = 60;
            param0 = -1 + ((sv) this).field_m.length;
            return -var3 + ((sv) this).field_n - (-(param0 * ((sv) this).field_i) + ((sv) this).field_m[param0].d(11919));
          }
        } else {
          var3 = 60;
          param0 = -1 + ((sv) this).field_m.length;
          return -var3 + ((sv) this).field_n - (-(param0 * ((sv) this).field_i) + ((sv) this).field_m[param0].d(11919));
        }
    }

    final static kg a(cn param0, int param1, cn param2, int param3, int param4) {
        if (jna.a(false, param4, param1, param2)) {
          if (param3 != 24876) {
            return null;
          } else {
            return ci.a(param0.a(false, param1, param4), (byte) -123);
          }
        } else {
          return null;
        }
    }

    sv(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        ((sv) this).field_r = new dea();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Reject";
    }
}
