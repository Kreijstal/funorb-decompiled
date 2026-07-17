/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ft extends kt {
    private byte[] field_u;
    static int field_t;

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (param0 != 0) {
          field_t = -1;
          var4 = param2 * 2;
          int incrementValue$2 = var4;
          var4++;
          ((ft) this).field_u[incrementValue$2] = (byte) -1;
          var5 = 255 & param1;
          ((ft) this).field_u[var4] = (byte)(3 * var5 >> 5);
          return;
        } else {
          var4 = param2 * 2;
          int incrementValue$3 = var4;
          var4++;
          ((ft) this).field_u[incrementValue$3] = (byte) -1;
          var5 = 255 & param1;
          ((ft) this).field_u[var4] = (byte)(3 * var5 >> 5);
          return;
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        if (param0 == 18941) {
          if (kt.field_l < 224) {
            var1 = kt.field_l % 32;
            nl.a(-var1 + kt.field_l - -32, param0 ^ -31338);
            return;
          } else {
            nl.a(256, -13205);
            return;
          }
        } else {
          ft.b(-27);
          if (kt.field_l < 224) {
            var1 = kt.field_l % 32;
            nl.a(-var1 + kt.field_l - -32, param0 ^ -31338);
            return;
          } else {
            nl.a(256, -13205);
            return;
          }
        }
    }

    ft() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    final byte[] a(int param0, int param1, boolean param2, int param3) {
        ((ft) this).field_u = new byte[2 * param1 * (param3 * param0)];
        if (param2) {
          return null;
        } else {
          ((ft) this).a(param0, (byte) -10, param3, param1);
          return ((ft) this).field_u;
        }
    }

    static {
    }
}
