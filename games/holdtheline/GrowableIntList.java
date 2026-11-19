/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrowableIntList {
    private boolean field_d;
    private int[] elements;
    static String field_e;
    private int lastIndex;
    private int field_c;

    public static void clearSharedReferences(byte param0) {
        if (param0 != -13) {
          return;
        }
        field_e = null;
    }

    final void addAll(int[] param0, int param1) {
        try {
          this.setRange(this.lastIndex + 1, param0, 1, param0.length, param1);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "uh.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void removeAt(int param0, byte param1) {
        if (param0 < 0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 > this.lastIndex) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 != this.lastIndex) {
          ArrayOperations.copyInts(this.elements, 1 + param0, this.elements, param0, this.lastIndex - param0);
        }
        if (param1 > 4) {
          this.lastIndex = this.lastIndex - 1;
          return;
        }
        this.field_d = true;
        this.lastIndex = this.lastIndex - 1;
    }

    private final void set(int param0, int param1, byte param2) {
        if (param0 > this.lastIndex) {
          this.lastIndex = param0;
          if (this.elements.length <= param0) {
            this.growCapacity(0, param0);
          }
          if (param2 >= -116) {
            this.removeAt(-63, (byte) -29);
            this.elements[param0] = param1;
            return;
          }
          this.elements[param0] = param1;
          return;
        }
        if (this.elements.length <= param0) {
          this.growCapacity(0, param0);
        }
        if (param2 < -116) {
          this.elements[param0] = param1;
          return;
        }
        this.removeAt(-63, (byte) -29);
        this.elements[param0] = param1;
    }

    private final int calculateCapacity(int param0, byte param1) {
        int var3;
        int var5;
        int var4;
        var5 = HoldTheLine.field_D;
        var3 = this.elements.length;
        while (param0 >= var3) {
          if (!this.field_d) {
            var3 = var3 + this.field_c;
            continue;
          }
          if (var3 == 0) {
            var3 = 1;
            continue;
          }
          var3 = var3 * this.field_c;
        }
        var4 = -18 % ((45 - param1) / 53);
        return var3;
    }

    final int[] toArray(int param0) {
        int[] var3 = new int[this.lastIndex + 1];
        int[] var2 = var3;
        if (param0 <= -33) {
          ArrayOperations.copyInts(this.elements, 0, var3, 0, this.lastIndex + 1);
          return var3;
        }
        return (int[]) null;
    }

    private final void growCapacity(int param0, int param1) {
        int[] var4 = new int[this.calculateCapacity(param1, (byte) -81)];
        int[] var3 = var4;
        ArrayOperations.copyInts(this.elements, 0, var4, param0, this.elements.length);
        this.elements = var4;
    }

    final void add(int param0, byte param1) {
        if (param1 >= 61) {
          this.set(1 + this.lastIndex, param0, (byte) -119);
          return;
        }
        this.size(-32);
        this.set(1 + this.lastIndex, param0, (byte) -119);
    }

    private final void setRange(int param0, int[] param1, int param2, int param3, int param4) {
        try {
          if (this.lastIndex < param3 + (param0 - param2)) {
            this.lastIndex = -1 + param3 + param0;
            this.growCapacity(param2 ^ 1, param3 + (param0 - 1));
          }
          ArrayOperations.copyInts(param1, param4, this.elements, param0, param3);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "uh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int get(byte param0, int param1) {
        if (this.lastIndex < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param0 > 3) {
          return this.elements[param1];
        }
        this.field_c = -4;
        return this.elements[param1];
    }

    final int size(int param0) {
        if (param0 >= -110) {
          this.toArray(-118);
          return 1 + this.lastIndex;
        }
        return 1 + this.lastIndex;
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != 0) {
          GrowableIntList.clearSharedReferences((byte) -39);
          ak.field_c = param2;
          MouseWheelInput.field_b = param0;
          return;
        }
        ak.field_c = param2;
        MouseWheelInput.field_b = param0;
    }

    GrowableIntList(int param0, boolean param1) {
        this.elements = new int[]{};
        this.lastIndex = -1;
        this.field_d = false;
        this.field_c = param0;
        this.field_d = param1 ? true : false;
    }

    static {
        field_e = "Change display name";
    }
}
