/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sl {
    int field_a;
    static java.awt.Color field_i;
    int field_g;
    int field_m;
    int field_d;
    int field_f;
    static bd field_b;
    static int field_c;
    static int field_k;
    static String field_j;
    int field_h;
    static int field_l;
    static String field_e;

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    public static void a(boolean param0) {
        if (param0) {
          field_e = null;
          field_j = null;
          field_b = null;
          field_e = null;
          field_i = null;
          return;
        } else {
          field_j = null;
          field_b = null;
          field_e = null;
          field_i = null;
          return;
        }
    }

    final static ak a(int param0) {
        if (param0 != 1) {
            field_k = 60;
            return la.b((byte) -110);
        }
        return la.b((byte) -110);
    }

    final static el a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        var2 = param0.length();
        if (var2 != 0) {
          if (var2 <= 63) {
            var3 = 0;
            var4 = -104 / ((param1 - -26) / 43);
            L0: while (true) {
              if (var2 > var3) {
                var5 = param0.charAt(var3);
                if (45 != var5) {
                  if (-1 == oa.field_h.indexOf(var5)) {
                    return gm.field_f;
                  } else {
                    var3++;
                    var3++;
                    continue L0;
                  }
                } else {
                  L1: {
                    if (var3 == 0) {
                      break L1;
                    } else {
                      if (var3 != var2 - 1) {
                        var3++;
                        var3++;
                        var3++;
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return gm.field_f;
                }
              } else {
                return null;
              }
            }
          } else {
            return mk.field_a;
          }
        } else {
          return pd.field_Kb;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new java.awt.Color(10040319);
        field_c = 480;
        field_j = "Report <%0> for abuse";
        field_b = new bd();
        field_e = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
