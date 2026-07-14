/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek implements ui {
    static int field_g;
    static int[] field_c;
    private kg field_f;
    private int field_b;
    static rc field_a;
    static int field_e;
    private int field_d;

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        if (param1.equals((Object) (Object) "B")) {
            return Byte.TYPE;
        }
        if (param1.equals((Object) (Object) "I")) {
            return Integer.TYPE;
        }
        if (param0 != 3249872) {
            ek.a(-89);
        }
        if (param1.equals((Object) (Object) "S")) {
            return Short.TYPE;
        }
        if (param1.equals((Object) (Object) "J")) {
            return Long.TYPE;
        }
        if (param1.equals((Object) (Object) "Z")) {
            return Boolean.TYPE;
        }
        if (param1.equals((Object) (Object) "F")) {
            return Float.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "D"))) {
            return Double.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "C"))) {
            return Character.TYPE;
        }
        return Class.forName(param1);
    }

    public static void a(byte param0) {
        if (param0 != -38) {
            field_c = null;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(int param0) {
        ck.field_z = wf.field_d.a(de.field_c[12]);
        int var1 = wf.field_d.a(de.field_c[13]);
        if (ck.field_z < var1) {
            ck.field_z = var1;
        }
        int var2 = wf.field_d.field_t + wf.field_d.field_D - -4;
        if (param0 < 88) {
            return;
        }
        fd.field_a[5] = var2 + (wf.field_d.field_t + 130 - -wf.field_d.field_y) - -4;
        fd.field_b[5] = 2 * var2 + jk.field_x.a(true);
    }

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        if (param3 == 0) {
          return "";
        } else {
          if ((param3 ^ -1) == -2) {
            var10 = param1[param2];
            var4_ref = var10;
            if (var4_ref != null) {
              return ((Object) (Object) var10).toString();
            } else {
              return "null";
            }
          } else {
            var4 = param3 - -param2;
            var5 = 0;
            var6_int = param2;
            L0: while (true) {
              if (var6_int >= var4) {
                var6 = new StringBuilder(var5);
                if (param0 < -26) {
                  var7 = param2;
                  L1: while (true) {
                    if (var4 <= var7) {
                      return var6.toString();
                    } else {
                      var8 = param1[var7];
                      if (var8 != null) {
                        StringBuilder discarded$2 = var6.append(var8);
                        var7++;
                        continue L1;
                      } else {
                        StringBuilder discarded$3 = var6.append("null");
                        var7++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                var7_ref_CharSequence = param1[var6_int];
                if (var7_ref_CharSequence != null) {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  continue L0;
                } else {
                  var5 += 4;
                  var6_int++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var12 = Transmogrify.field_A ? 1 : 0;
            if (param4.field_g) {
              break L1;
            } else {
              if (param4.b((byte) -119)) {
                break L1;
              } else {
                stackOut_2_0 = 2188450;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 3249872;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        L2: {
          var6 = stackIn_4_0;
          var7 = -107 / ((51 - param3) / 47);
          int discarded$1 = ((ek) this).field_f.a("<u=" + Integer.toString(var6, 16) + ">" + param4.field_k + "</u>", param0 + param4.field_p, param4.field_n + param1, param4.field_l, param4.field_h, var6, -1, ((ek) this).field_b, ((ek) this).field_d, ((ek) this).field_f.field_y - -((ek) this).field_f.field_t);
          if (param4.b((byte) 50)) {
            L3: {
              var8 = ((ek) this).field_f.a(param4.field_k);
              var9 = ((ek) this).field_f.field_t + ((ek) this).field_f.field_y;
              var10 = param0 - -param4.field_p;
              var11 = param1 + param4.field_n;
              if ((((ek) this).field_b ^ -1) != -3) {
                if (1 == ((ek) this).field_b) {
                  var10 = var10 + (-var8 + param4.field_l >> -1452902559);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                var10 = var10 + (param4.field_l + -var8);
                break L3;
              }
            }
            L4: {
              if (-3 == (((ek) this).field_d ^ -1)) {
                var11 = var11 + (-var9 + param4.field_h);
                break L4;
              } else {
                if (1 != ((ek) this).field_d) {
                  break L4;
                } else {
                  var11 = var11 + (-var9 + param4.field_h >> -90962431);
                  break L4;
                }
              }
            }
            ri.a(var8 - -4, -2 + var10, 2 + var11, (byte) -107, var9);
            break L2;
          } else {
            break L2;
          }
        }
    }

    public ek() {
        ((ek) this).field_b = 1;
        ((ek) this).field_d = 1;
        ((ek) this).field_f = vd.field_h;
    }

    ek(kg param0, int param1, int param2) {
        ((ek) this).field_d = param2;
        ((ek) this).field_b = param1;
        ((ek) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 250;
        field_c = new int[256];
        field_a = new rc();
    }
}
