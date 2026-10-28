/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrowableIntList {
    private int growth;
    static String field_c;
    static int field_b;
    static String field_f;
    static Sprite field_h;
    private int[] values;
    private boolean multiplicativeGrowth;
    private int lastIndex;

    private final void set(int index, int value, boolean guard) {
        if (index > this.lastIndex) {
          this.lastIndex = index;
          if (this.values.length <= index) {
            this.growToIndex(0, index);
          }
          if (guard) {
            this.get(-30, 101);
            this.values[index] = value;
            return;
          }
          this.values[index] = value;
          return;
        }
        if (this.values.length <= index) {
          this.growToIndex(0, index);
        }
        if (!guard) {
          this.values[index] = value;
          return;
        }
        this.get(-30, 101);
        this.values[index] = value;
    }

    public static void releaseStatics(boolean guard) {
        field_f = null;
        field_c = null;
        field_h = null;
        if (!guard) {
          GrowableIntList.a((byte) 76);
        }
    }

    final void removeAt(int minimumIndex, int index) {
        if (index < minimumIndex) {
          throw new ArrayIndexOutOfBoundsException(index);
        }
        if (index <= this.lastIndex) {
          if (this.lastIndex != index) {
            ArraySupport.copy(this.values, index + 1, this.values, index, this.lastIndex - index);
          }
          this.lastIndex = this.lastIndex - 1;
          return;
        }
        throw new ArrayIndexOutOfBoundsException(index);
    }

    final void add(int value, byte guard) {
        this.set(this.lastIndex + 1, value, false);
        if (guard != -51) {
          this.size(false);
        }
    }

    private final void growToIndex(int guard, int index) {
        int[] var4 = new int[this.capacityForIndex(guard, index)];
        int[] var3 = var4;
        ArraySupport.copy(this.values, 0, var4, 0, this.values.length);
        this.values = var4;
    }

    final static void a(byte param0) {
        AchievementThresholdRule.field_g = EmailSyntaxValidator.c(false);
        Checkbox.field_F = new ModalStack();
        if (param0 > -21) {
          return;
        }
        MarkerSliderPainter.a(-43, true, true);
    }

    final int get(int guard, int index) {
        if (this.lastIndex < index) {
          throw new ArrayIndexOutOfBoundsException(index);
        }
        if (guard < -5) {
          return this.values[index];
        }
        GrowableIntList.b(false);
        return this.values[index];
    }

    private final int capacityForIndex(int guard, int index) {
        int var4 = EscapeVector.obfuscationControl;
        if (guard != 0) {
          return 34;
        }
        int var3 = this.values.length;
        while (index >= var3) {
          if (!this.multiplicativeGrowth) {
            var3 = var3 + this.growth;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.growth;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    private GrowableIntList() throws Throwable {
        throw new Error();
    }

    final static sn b(boolean param0) {
        if (!param0) {
          return (sn) null;
        }
        return new sn(TrackerMusicDefinition.c(31069), KeyCodeSupport.c(-89));
    }

    final int size(boolean guard) {
        if (!guard) {
          this.get(106, 72);
          return this.lastIndex + 1;
        }
        return this.lastIndex + 1;
    }

    static {
        field_c = "Names cannot start or end with space or underscore";
        field_f = "Score";
    }
}
