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
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
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
            if (-1L != (param1 % 37L ^ -1L)) {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                if (-1L == (var4 ^ -1L)) {
                  var6 = new StringBuilder(var3);
                  if (param0) {
                    L1: while (true) {
                      if (param1 == 0L) {
                        discarded$2 = var6.reverse();
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
                        discarded$3 = var6.append((char) var9);
                        continue L1;
                      }
                    }
                  } else {
                    return (String) null;
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

    public static void a(int param0) {
        field_m = null;
        if (param0 != 0) {
            field_m = (int[]) null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    final void a(ee param0, byte param1, int param2, el param3) {
        String discarded$0 = null;
        try {
            this.field_o = db.b(param3, 256, param2);
            this.field_n = param2;
            this.field_q = param0;
            if (param1 >= -69) {
                discarded$0 = kk.a(false, -7L);
            }
            this.field_p = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "kk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static ii a(Throwable param0, String param1) {
        ii var2 = null;
        if (!(param0 instanceof ii)) {
            var2 = new ii(param0, param1);
        } else {
            var2 = (ii) ((Object) param0);
            var2.field_a = var2.field_a + ' ' + param1;
        }
        return var2;
    }

    kk(el param0, ee param1, int param2) {
        try {
            this.a(param1, (byte) -95, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "kk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static hj[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 >= -69) {
          field_k = -0.09486949443817139f;
          return ak.a(param1, param0, 1, param4, param2, 1, 0, 3, 1);
        } else {
          return ak.a(param1, param0, 1, param4, param2, 1, 0, 3, 1);
        }
    }

    static {
    }
}
