/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrowableIntArray {
    private int growthRate;
    private boolean geometricGrowth;
    private int lastIndex;
    private int[] values;
    static int[] field_d;

    public static void clearSharedReferences(int param0) {
        field_d = null;
        if (param0 != -1) {
          field_d = (int[]) null;
        }
    }

    final void add(byte param0, int param1) {
        this.set(this.lastIndex + 1, -15220, param1);
        if (param0 >= -66) {
          field_d = (int[]) null;
        }
    }

    final static Sprite[] loadNamedSprites(String param0, int param1, ResourceArchive param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Sprite[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.getGroupId(param0, -112);
          var6 = -104 / ((-47 - param1) / 40);
          var5 = param2.getFileId(true, var4_int, param3);
          stackIn_1_0 = MapClearanceArea.a(var5, (byte) 75, param2, var4_int);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("hma.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final int capacityForIndex(int param0, int param1) {
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        var3 = this.values.length;
        while (param1 >= var3) {
          if (!this.geometricGrowth) {
            var3 = var3 + this.growthRate;
            continue;
          }
          if (var3 == 0) {
            var3 = 1;
            continue;
          }
          var3 = var3 * this.growthRate;
        }
        if (param0 == 0) {
          return var3;
        }
        this.lastIndex = 102;
        return var3;
    }

    private final void growForIndex(byte param0, int param1) {
        int[] var4 = null;
        int[] var3 = null;
        int[] var4Lifetime1;
        int[] var3Lifetime1;
        if (param0 > 110) {
          var4 = new int[this.capacityForIndex(0, param1)];
          var3 = var4;
          ArrayOperations.copy(this.values, 0, var4, 0, this.values.length);
          this.values = var4;
          return;
        }
        field_d = (int[]) null;
        var4Lifetime1 = new int[this.capacityForIndex(0, param1)];
        var3Lifetime1 = var4Lifetime1;
        ArrayOperations.copy(this.values, 0, var4Lifetime1, 0, this.values.length);
        this.values = var4Lifetime1;
    }

    final int get(int param0, byte param1) {
        if (param0 > this.lastIndex) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 == 106) {
          return this.values[param0];
        }
        return -67;
    }

    final void removeAt(int param0, byte param1) {
        if (param0 < 0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 > this.lastIndex) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 == 70) {
          if (param0 != this.lastIndex) {
            ArrayOperations.copy(this.values, 1 + param0, this.values, param0, this.lastIndex - param0);
          }
          this.lastIndex = this.lastIndex - 1;
          return;
        }
    }

    final int size(byte param0) {
        int var2 = -107 / ((param0 + 16) / 43);
        return 1 + this.lastIndex;
    }

    private final void set(int param0, int param1, int param2) {
        if (param0 > this.lastIndex) {
          this.lastIndex = param0;
        }
        if (param1 != -15220) {
          return;
        }
        if (param0 < this.values.length) {
          this.values[param0] = param2;
          return;
        }
        this.growForIndex((byte) 116, param0);
        this.values[param0] = param2;
    }

    private GrowableIntArray() throws Throwable {
        throw new Error();
    }

    static {
    }
}
