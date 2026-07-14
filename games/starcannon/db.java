/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends vk implements ga {
    private dk field_y;
    private dk field_A;
    static long field_C;
    private dk field_z;
    static String field_B;

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        int var7 = 0;
        var7 = StarCannon.field_A;
        if (!param2) {
          if (param0 != ((db) this).field_A) {
            if (param0 != ((db) this).field_y) {
              if (((db) this).field_z == param0) {
                pk.a((byte) -64);
                return;
              } else {
                return;
              }
            } else {
              pb.b(73);
              return;
            }
          } else {
            ag.k(-1108);
            return;
          }
        } else {
          return;
        }
    }

    public db() {
        super(0, 0, 476, 225, (de) null);
        ((db) this).field_y = new dk(qj.field_V, (qg) null);
        ((db) this).field_A = new dk(fk.field_v, (qg) null);
        ((db) this).field_z = new dk(rg.field_E, (qg) null);
        gb var1 = new gb();
        ((db) this).field_y.field_o = (de) (Object) var1;
        ((db) this).field_A.field_o = (de) (Object) var1;
        ((db) this).field_z.field_o = (de) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 2048693697;
        ((db) this).field_A.a(((db) this).field_i + -var3 >> -1911336351, var4, (byte) 123, 30, -var2 + ((db) this).field_f + -48);
        ((db) this).field_z.a(var4 + ((((db) this).field_i + -var3 >> -1999196127) - -var2), var4, (byte) 116, 30, -48 + ((db) this).field_f + -var2);
        ((db) this).field_y.a(((db) this).field_i - var3 >> 1862558561, var3, (byte) 127, 30, -(2 * var2) + -78 + ((db) this).field_f);
        ((db) this).field_A.field_g = (qg) this;
        ((db) this).field_y.field_g = (qg) this;
        ((db) this).field_z.field_g = (qg) this;
        ((db) this).field_y.field_p = wj.field_f;
        ((db) this).field_z.field_p = ej.field_t;
        ((db) this).a(true, (uj) (Object) ((db) this).field_A);
        ((db) this).a(true, (uj) (Object) ((db) this).field_y);
        ((db) this).a(true, (uj) (Object) ((db) this).field_z);
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if ((param3 ^ -1) != -99) {
            if (param3 != 99) {
              return false;
            } else {
              return ((db) this).a((byte) -103, param0);
            }
          } else {
            return ((db) this).b(-10, param0);
          }
        } else {
          return true;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param1 + ((db) this).field_s;
        int var6 = ((db) this).field_j - -param3;
        int discarded$0 = nb.field_c.a(ec.field_c, 20 + var5, var6 - -20, -40 + ((db) this).field_i, ((db) this).field_f - 50, 16777215, -1, 1, 0, nb.field_c.field_p);
        super.a(param0, param1, param2, param3);
    }

    public static void a(int param0) {
        field_B = null;
        if (param0 >= -91) {
            field_B = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Change display name";
    }
}
