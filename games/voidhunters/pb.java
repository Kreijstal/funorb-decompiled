/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static pb field_k;
    private int field_c;
    static pb field_g;
    int field_j;
    static pb field_d;
    static pb field_e;
    int field_i;
    private mj field_a;
    static pb field_l;
    static pb field_h;
    static pb field_b;
    static int field_m;
    static String field_n;
    static byte[] field_f;

    public static void a(byte param0) {
        if (param0 > -20) {
          pb discarded$2 = pb.a((byte) 99, -109);
          field_f = null;
          field_h = null;
          field_n = null;
          field_k = null;
          field_d = null;
          field_l = null;
          field_e = null;
          field_b = null;
          field_g = null;
          return;
        } else {
          field_f = null;
          field_h = null;
          field_n = null;
          field_k = null;
          field_d = null;
          field_l = null;
          field_e = null;
          field_b = null;
          field_g = null;
          return;
        }
    }

    final static pb a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        var2 = param1;
        if (0 != var2) {
          if (var2 != -2) {
            if (2 != var2) {
              if (var2 != 3) {
                if (-5 != var2) {
                  if (var2 != 5) {
                    if (6 != var2) {
                      if (param0 < -107) {
                        return null;
                      } else {
                        return null;
                      }
                    } else {
                      return field_b;
                    }
                  } else {
                    return field_h;
                  }
                } else {
                  return field_l;
                }
              } else {
                return field_e;
              }
            } else {
              return field_d;
            }
          } else {
            return field_g;
          }
        } else {
          return field_k;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    private pb(int param0, int param1, mj param2) {
        ((pb) this).field_c = param1;
        ((pb) this).field_a = param2;
        ((pb) this).field_j = param0;
        ((pb) this).field_i = ((pb) this).field_c * ((pb) this).field_a.field_h;
        if (16 <= ((pb) this).field_j) {
            throw new RuntimeException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new pb(0, 3, mj.field_d);
        field_g = new pb(1, 3, mj.field_d);
        field_d = new pb(2, 4, mj.field_f);
        field_e = new pb(3, 1, mj.field_d);
        field_l = new pb(4, 2, mj.field_d);
        field_h = new pb(5, 3, mj.field_d);
        field_b = new pb(6, 4, mj.field_d);
        field_m = ieb.a(16, -111);
        field_f = new byte[]{(byte)31, (byte)-117, (byte)8, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        field_n = "Launches a fighter for harrassment";
    }
}
