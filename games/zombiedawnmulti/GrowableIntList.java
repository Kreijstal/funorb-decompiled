/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrowableIntList {
    static String field_e;
    private boolean field_i;
    static UiComponent[] field_h;
    static boolean field_k;
    private int field_a;
    private int[] field_o;
    static double field_n;
    static int field_d;
    static String field_b;
    static int field_m;
    static byte[] field_g;
    private int field_f;
    static int[] field_c;
    static IndexedSprite[] field_l;
    static Sprite field_j;

    private final void ensureCapacity(int param0, byte param1) {
        int[] var4 = null;
        int[] var3 = null;
        int[] var4Lifetime1;
        int[] var3Lifetime1;
        if (param1 > 21) {
          var4 = new int[this.capacityForIndex(param0, (byte) 104)];
          var3 = var4;
          ArrayOperations.copy(this.field_o, 0, var4, 0, this.field_o.length);
          this.field_o = var4;
          return;
        }
        field_l = (IndexedSprite[]) null;
        var4Lifetime1 = new int[this.capacityForIndex(param0, (byte) 104)];
        var3Lifetime1 = var4Lifetime1;
        ArrayOperations.copy(this.field_o, 0, var4Lifetime1, 0, this.field_o.length);
        this.field_o = var4Lifetime1;
    }

    private final int capacityForIndex(int param0, byte param1) {
        int var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = this.field_o.length;
        while (param0 >= var3) {
          if (!this.field_i) {
            var3 = var3 + this.field_f;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_f;
            continue;
          }
          var3 = 1;
        }
        if (param1 <= 101) {
          return -50;
        }
        return var3;
    }

    private final void set(int param0, int param1, int param2) {
        if (param0 > this.field_a) {
          this.field_a = param0;
          if (this.field_o.length > param0) {
            if (param2 == 0) {
              this.field_o[param0] = param1;
              return;
            }
            return;
          }
          this.ensureCapacity(param0, (byte) 79);
          if (param2 == 0) {
            this.field_o[param0] = param1;
            return;
          }
          return;
        }
        if (this.field_o.length <= param0) {
          this.ensureCapacity(param0, (byte) 79);
          if (param2 == 0) {
            this.field_o[param0] = param1;
            return;
          }
          return;
        }
        if (param2 == 0) {
          this.field_o[param0] = param1;
          return;
        }
    }

    final void add(byte param0, int param1) {
        if (param0 != -7) {
          return;
        }
        this.set(1 + this.field_a, param1, param0 ^ -7);
    }

    final int get(byte param0, int param1) {
        if (param0 != 105) {
          return 57;
        }
        if (this.field_a < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        return this.field_o[param1];
    }

    final int size(int param0) {
        int discarded$0 = 0;
        if (param0 != 1) {
          discarded$0 = this.capacityForIndex(-120, (byte) 109);
          return this.field_a + 1;
        }
        return this.field_a + 1;
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_j = null;
        if (param0 <= -4) {
          field_b = null;
          field_l = null;
          field_e = null;
          field_h = null;
          field_g = null;
          return;
        }
    }

    final void removeAt(int param0, int param1) {
        int var3 = 0;
        int var3Lifetime1;
        if (0 > param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_a < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_a == param1) {
          var3 = -95 / ((param0 - 37) / 32);
          this.field_a = this.field_a - 1;
          return;
        }
        ArrayOperations.copy(this.field_o, param1 + 1, this.field_o, param1, -param1 + this.field_a);
        var3Lifetime1 = -95 / ((param0 - 37) / 32);
        this.field_a = this.field_a - 1;
    }

    private GrowableIntList() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_b = "The invitation has been withdrawn.";
        field_n = 0.0;
        field_g = new byte[520];
    }
}
