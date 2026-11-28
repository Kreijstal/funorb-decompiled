/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrowableIntArray {
    static String field_c;
    private int[] field_f;
    private int field_e;
    private boolean field_b;
    static pk field_d;
    private int field_a;

    final void removeAt(int param0, int param1) {
        if (param1 < 0) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 > this.field_e) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 != this.field_e) {
          ArrayBlockSupport.copyIntRange(this.field_f, param1 + 1, this.field_f, param1, this.field_e - param1);
        }
        this.field_e = this.field_e - 1;
        if (param0 >= 122) {
          return;
        }
        int discarded$0 = this.computeCapacity(-10, -60);
    }

    final int size(boolean param0) {
        if (!param0) {
          return 81;
        }
        return this.field_e + 1;
    }

    final int get(int param0, int param1) {
        if (this.field_e < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param0 == -32240) {
          return this.field_f[param1];
        }
        this.removeAt(126, 35);
        return this.field_f[param1];
    }

    private final void grow(int param0, int param1) {
        int[] var4 = new int[this.computeCapacity(2667, param1)];
        int[] var3 = var4;
        ArrayBlockSupport.copyIntRange(this.field_f, 0, var4, 0, this.field_f.length);
        if (param0 == 25613) {
          this.field_f = var4;
          return;
        }
        this.field_f = (int[]) null;
        this.field_f = var4;
    }

    private final int computeCapacity(int param0, int param1) {
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = CrazyCrystals.field_B;
        if (param0 == 2667) {
          var3 = this.field_f.length;
          while (var3 <= param1) {
            if (!this.field_b) {
              var3 = var3 + this.field_a;
              continue;
            }
            if (var3 == 0) {
              var3 = 1;
              continue;
            }
            var3 = var3 * this.field_a;
          }
          return var3;
        }
        this.field_f = (int[]) null;
        var3Lifetime1 = this.field_f.length;
        while (var3Lifetime1 <= param1) {
          if (!this.field_b) {
            var3Lifetime1 = var3Lifetime1 + this.field_a;
            continue;
          }
          if (var3Lifetime1 == 0) {
            var3Lifetime1 = 1;
            continue;
          }
          var3Lifetime1 = var3Lifetime1 * this.field_a;
        }
        return var3Lifetime1;
    }

    private final void set(byte param0, int param1, int param2) {
        if (this.field_e < param2) {
          this.field_e = param2;
        }
        if (param2 >= this.field_f.length) {
          this.grow(25613, param2);
        }
        this.field_f[param2] = param1;
        if (param0 == -2) {
          return;
        }
        this.get(-98, -14);
    }

    final void append(int param0, byte param1) {
        this.set((byte) -2, param0, this.field_e + 1);
        if (param1 <= 121) {
          this.field_a = 111;
        }
    }

    public static void clearStaticReferences(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 855) {
          field_c = (String) null;
        }
    }

    private GrowableIntArray() throws Throwable {
        throw new Error();
    }

    static {
        field_c = "This is a spider.<br><br>Spiders weave spider webs.<br><br>If the spider is standing on the web, the web will spread.<br><br>If you stand on the web, the spider will hear you.<br><br>Spiders are fast and very dangerous. Your only hope is to unite it with a rock!";
    }
}
