/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrowableIntArray {
    private int[] field_a;
    private int field_c;
    private boolean field_i;
    private int field_h;
    static Sprite[] field_b;
    static int field_g;
    static Sprite field_d;
    static long field_e;
    static Sprite field_f;

    public static void resetStaticState(int param0) {
        if (param0 == 1) {
          field_f = null;
          field_b = null;
          field_d = null;
          return;
        }
        field_g = 47;
        field_f = null;
        field_b = null;
        field_d = null;
    }

    final void append(int param0, int param1) {
        int var3 = -67 % ((-45 - param0) / 43);
        this.set(1 + this.field_h, (byte) 61, param1);
    }

    private final int computeCapacity(int param0, int param1) {
        int var3;
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        var3 = this.field_a.length;
        if (param1 >= -98) {
          return -103;
        }
        while (var3 <= param0) {
          if (!this.field_i) {
            var3 = var3 + this.field_c;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_c;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    final void removeAt(boolean param0, int param1) {
        if (param1 < 0) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 > this.field_h) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_h != param1) {
          ArrayBlockSupport.copyIntRange(this.field_a, 1 + param1, this.field_a, param1, -param1 + this.field_h);
        }
        this.field_h = this.field_h - 1;
        if (!param0) {
          this.size(-55);
          return;
        }
    }

    private GrowableIntArray() throws Throwable {
        throw new Error();
    }

    private final void set(int param0, byte param1, int param2) {
        if (param0 > this.field_h) {
          this.field_h = param0;
        }
        if (this.field_a.length <= param0) {
          this.grow(param0, 0);
          if (param1 != 61) {
            field_f = (Sprite) null;
            this.field_a[param0] = param2;
            return;
          }
          this.field_a[param0] = param2;
          return;
        }
        if (param1 == 61) {
          this.field_a[param0] = param2;
          return;
        }
        field_f = (Sprite) null;
        this.field_a[param0] = param2;
    }

    private final void grow(int param0, int param1) {
        int[] var4 = new int[this.computeCapacity(param0, -113)];
        int[] var3 = var4;
        ArrayBlockSupport.copyIntRange(this.field_a, param1, var4, 0, this.field_a.length);
        this.field_a = var4;
    }

    final int get(byte param0, int param1) {
        if (this.field_h < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param0 == 43) {
          return this.field_a[param1];
        }
        this.field_h = 68;
        return this.field_a[param1];
    }

    final int size(int param0) {
        if (param0 <= 74) {
          this.get((byte) -24, -1);
          return this.field_h + 1;
        }
        return this.field_h + 1;
    }

    static {
        field_g = 0;
    }
}
