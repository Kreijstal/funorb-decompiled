/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ft extends kt {
    private byte[] field_u;
    static int field_t;

    final void a(int param0, byte param1, int param2) {
        int incrementValue$0 = 0;
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param0 == 0) {
          var4 = param2 * 2;
          incrementValue$0 = var4;
          var4++;
          this.field_u[incrementValue$0] = (byte)-1;
          var5 = 255 & param1;
          this.field_u[var4] = (byte)(3 * var5 >> 5);
          return;
        }
        field_t = -1;
        var4Lifetime1 = param2 * 2;
        int incrementValue$1 = var4Lifetime1;
        var4Lifetime1++;
        this.field_u[incrementValue$1] = (byte)-1;
        var5Lifetime1 = 255 & param1;
        this.field_u[var4Lifetime1] = (byte)(3 * var5Lifetime1 >> 5);
    }

    final static void b(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (param0 != 18941) {
          ft.b(-27);
          if (kt.field_l >= 224) {
            nl.a(256, -13205);
            return;
          }
          var1 = kt.field_l % 32;
          nl.a(-var1 + kt.field_l + 32, param0 ^ -31338);
          return;
        }
        if (kt.field_l >= 224) {
          nl.a(256, -13205);
          return;
        }
        var1Lifetime1 = kt.field_l % 32;
        nl.a(-var1Lifetime1 + kt.field_l + 32, param0 ^ -31338);
    }

    ft() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    final byte[] a(int param0, int param1, boolean param2, int param3) {
        this.field_u = new byte[2 * param1 * (param3 * param0)];
        if (!param2) {
          this.a(param0, (byte) -10, param3, param1);
          return this.field_u;
        }
        return (byte[]) null;
    }

    static {
    }
}
