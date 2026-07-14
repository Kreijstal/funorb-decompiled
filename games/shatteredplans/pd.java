/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends hb {
    static ed field_j;
    private el field_i;
    static u field_h;
    static qf field_m;
    static int field_k;
    static pf field_f;
    static long field_l;
    static String field_g;

    final oh a(byte param0) {
        if (param0 <= 99) {
            pd.b(11);
            return (oh) (Object) ((pd) this).field_i.a(true);
        }
        return (oh) (Object) ((pd) this).field_i.a(true);
    }

    final static String a(byte param0, long param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        int var7 = 0;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 > 0L) {
          if (6582952005840035281L > param1) {
            if (0L == param1 % 37L) {
              return null;
            } else {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                if (var4 == 0L) {
                  var7 = -67 / ((param0 - 32) / 63);
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if ((param1 ^ -1L) == -1L) {
                      StringBuilder discarded$2 = var6.reverse();
                      var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                      return var6.toString();
                    } else {
                      L2: {
                        var8 = param1;
                        param1 = param1 / 37L;
                        var10 = k.field_f[(int)(var8 + -(param1 * 37L))];
                        if (var10 != 95) {
                          break L2;
                        } else {
                          var11 = -1 + var6.length();
                          var6.setCharAt(var11, Character.toUpperCase(var6.charAt(var11)));
                          var10 = 160;
                          break L2;
                        }
                      }
                      StringBuilder discarded$3 = var6.append(var10);
                      continue L1;
                    }
                  }
                } else {
                  var3++;
                  var4 = var4 / 37L;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final int b(byte param0) {
        if (param0 != -61) {
            int discarded$0 = ((pd) this).b((byte) 6);
            return ((pd) this).field_i.b(0);
        }
        return ((pd) this).field_i.b(0);
    }

    pd(el param0) {
        ((pd) this).field_i = param0;
    }

    final oh a(boolean param0) {
        if (param0) {
            field_l = -98L;
            return (oh) (Object) ((pd) this).field_i.a((byte) -68);
        }
        return (oh) (Object) ((pd) this).field_i.a((byte) -68);
    }

    final static void a(int param0) {
        hd.field_q = null;
        cm.field_g = null;
        if (param0 != 0) {
          pd.b(-53);
          cf.field_H = null;
          mc.field_s = null;
          sj.field_a = null;
          eo.field_fb = null;
          return;
        } else {
          cf.field_H = null;
          mc.field_s = null;
          sj.field_a = null;
          eo.field_fb = null;
          return;
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_j = null;
        field_f = null;
        field_m = null;
        field_h = null;
        if (param0 != 0) {
            field_m = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ed();
        field_h = new u();
        field_k = 0;
        field_f = new pf();
        field_g = "Showing combat and damaged fleets retreating.";
    }
}
