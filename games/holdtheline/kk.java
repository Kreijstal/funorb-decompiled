/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends hl {
    static boolean field_j;
    db field_o;
    int field_n;
    static int field_l;
    static gn field_i;
    static int[] field_m;
    static float field_k;
    ee field_q;
    ui field_p;

    final static String a(boolean param0, long param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HoldTheLine.field_D;
        if (0L < param1) {
          if (6582952005840035281L > param1) {
            if (param1 % 37L != 0L) {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                if (var4 == 0L) {
                  var6 = new StringBuilder(var3);
                  if (param0) {
                    L1: while (true) {
                      if (param1 == 0L) {
                        StringBuilder discarded$2 = var6.reverse();
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      } else {
                        L2: {
                          var7 = param1;
                          param1 = param1 / 37L;
                          var9 = ne.field_a[(int)(-(param1 * 37L) + var7)];
                          if (95 == var9) {
                            var10 = var6.length() - 1;
                            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                            var9 = 160;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        StringBuilder discarded$3 = var6.append(var9);
                        continue L1;
                      }
                    }
                  } else {
                    return null;
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

    public static void a() {
        field_m = null;
        field_i = null;
    }

    final void a(ee param0, byte param1, int param2, el param3) {
        try {
            ((kk) this).field_o = db.b(param3, 256, param2);
            ((kk) this).field_n = param2;
            ((kk) this).field_q = param0;
            if (param1 >= -69) {
                String discarded$0 = kk.a(false, -7L);
            }
            ((kk) this).field_p = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "kk.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final static ii a(Throwable param0, String param1) {
        ii var2 = null;
        if (!(param0 instanceof ii)) {
            var2 = new ii(param0, param1);
        } else {
            var2 = (ii) (Object) param0;
            var2.field_a = var2.field_a + 32 + param1;
        }
        return var2;
    }

    kk(el param0, ee param1, int param2) {
        try {
            ((kk) this).a(param1, (byte) -95, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "kk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static hj[] a(int param0, int param1, int param2, int param3, int param4) {
        int discarded$0 = 1;
        int discarded$1 = 3;
        int discarded$2 = 0;
        int discarded$3 = 1;
        int discarded$4 = 65793;
        int discarded$5 = 0;
        int discarded$6 = 1;
        int discarded$7 = 0;
        int discarded$8 = 0;
        return ak.a();
    }

    static {
    }
}
