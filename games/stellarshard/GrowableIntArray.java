/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrowableIntArray {
    private int[] field_f;
    static int field_c;
    static int[] field_a;
    private int field_b;
    private int field_e;
    static int[] field_g;
    private boolean field_d;

    private final void set(int param0, int param1, int param2) {
        if (param0 != 31860) {
          field_c = 90;
          if (param1 > this.field_e) {
            this.field_e = param1;
          }
          if (param1 >= this.field_f.length) {
            this.grow(param1, 64);
            this.field_f[param1] = param2;
            return;
          }
          this.field_f[param1] = param2;
          return;
        }
        if (param1 > this.field_e) {
          this.field_e = param1;
        }
        if (param1 < this.field_f.length) {
          this.field_f[param1] = param2;
          return;
        }
        this.grow(param1, 64);
        this.field_f[param1] = param2;
    }

    public static void resetStaticState(boolean param0) {
        field_g = null;
        field_a = null;
        if (!param0) {
          field_c = -98;
        }
    }

    private final int computeCapacity(boolean param0, int param1) {
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = stellarshard.field_B;
        if (param0) {
          var3 = this.field_f.length;
          while (param1 >= var3) {
            if (!this.field_d) {
              var3 = var3 + this.field_b;
              continue;
            }
            if (var3 == 0) {
              var3 = 1;
              continue;
            }
            var3 = var3 * this.field_b;
          }
          return var3;
        }
        this.field_b = 105;
        var3Lifetime1 = this.field_f.length;
        while (param1 >= var3Lifetime1) {
          if (!this.field_d) {
            var3Lifetime1 = var3Lifetime1 + this.field_b;
            continue;
          }
          if (var3Lifetime1 == 0) {
            var3Lifetime1 = 1;
            continue;
          }
          var3Lifetime1 = var3Lifetime1 * this.field_b;
        }
        return var3Lifetime1;
    }

    private final void grow(int param0, int param1) {
        int[] var4 = null;
        int[] var3 = null;
        int[] var4Lifetime1;
        int[] var3Lifetime1;
        if (param1 >= 54) {
          var4 = new int[this.computeCapacity(true, param0)];
          var3 = var4;
          ArrayBlockSupport.copyIntRange(this.field_f, 0, var4, 0, this.field_f.length);
          this.field_f = var4;
          return;
        }
        GrowableIntArray.resetStaticState(false);
        var4Lifetime1 = new int[this.computeCapacity(true, param0)];
        var3Lifetime1 = var4Lifetime1;
        ArrayBlockSupport.copyIntRange(this.field_f, 0, var4Lifetime1, 0, this.field_f.length);
        this.field_f = var4Lifetime1;
    }

    final void removeAt(int param0, byte param1) {
        if (param0 < 0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 > this.field_e) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 == 111) {
          if (param0 != this.field_e) {
            ArrayBlockSupport.copyIntRange(this.field_f, 1 + param0, this.field_f, param0, this.field_e - param0);
          }
          this.field_e = this.field_e - 1;
          return;
        }
        this.removeAt(77, (byte) -17);
        if (param0 != this.field_e) {
          ArrayBlockSupport.copyIntRange(this.field_f, 1 + param0, this.field_f, param0, this.field_e - param0);
        }
        this.field_e = this.field_e - 1;
    }

    final void append(int param0, boolean param1) {
        if (!param1) {
          this.set(31860, this.field_e + 1, param0);
          return;
        }
        this.grow(-83, -41);
        this.set(31860, this.field_e + 1, param0);
    }

    final int get(byte param0, int param1) {
        if (param0 != -117) {
          this.size(-72);
          if (param1 <= this.field_e) {
            return this.field_f[param1];
          }
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 <= this.field_e) {
          return this.field_f[param1];
        }
        throw new ArrayIndexOutOfBoundsException(param1);
    }

    final static void b(int param0) {
        RegistrationAgreementPane.field_F = null;
        if (param0 > -12) {
          return;
        }
        wc.field_C = null;
    }

    private GrowableIntArray() throws Throwable {
        throw new Error();
    }

    final int size(int param0) {
        if (param0 != 19692) {
          this.get((byte) 67, 47);
          return 1 + this.field_e;
        }
        return 1 + this.field_e;
    }

    static {
    }
}
