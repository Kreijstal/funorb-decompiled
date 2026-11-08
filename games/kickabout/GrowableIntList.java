/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrowableIntList {
    private int field_i;
    private boolean field_e;
    static boolean field_c;
    private int field_g;
    static String field_a;
    static String field_f;
    private int[] field_d;
    static ChatMessage[] field_b;
    static int field_h;

    final int get(int param0, byte param1) {
        if (this.field_g < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        int var3 = 82 / ((35 - param1) / 62);
        return this.field_d[param0];
    }

    private final void set(boolean param0, int param1, int param2) {
        if (this.field_g < param2) {
          this.field_g = param2;
        }
        if (param2 >= this.field_d.length) {
          this.grow(param2, true);
        }
        this.field_d[param2] = param1;
        if (!param0) {
          GrowableIntList.a(-117, 14, -87);
        }
    }

    private final int nextCapacity(int param0, int param1) {
        int var3;
        int var4;
        var4 = Kickabout.field_G;
        if (param1 != 20151) {
          this.grow(-85, true);
        }
        var3 = this.field_d.length;
        while (param0 >= var3) {
          if (!this.field_e) {
            var3 = var3 + this.field_i;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_i;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    private final void grow(int param0, boolean param1) {
        if (!param1) {
          field_f = (String) null;
        }
        int[] var4 = new int[this.nextCapacity(param0, 20151)];
        int[] var3 = var4;
        ArrayOperations.copyInts(this.field_d, 0, var4, 0, this.field_d.length);
        this.field_d = var4;
    }

    final static PlayerInputEvent createCheatEvent(int param0, byte param1, int param2) {
        int var3 = 3 % ((param1 - 62) / 40);
        return new PlayerInputEvent(7, param0, param2, (byte) 0, (byte) 0);
    }

    public static void a(boolean param0) {
        field_a = null;
        field_f = null;
        if (!param0) {
          GrowableIntList.a(52, 5, 56);
        }
        field_b = null;
    }

    final static int a(int param0, int param1, int param2) {
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        IntValueNode var8 = null;
        int var9 = 0;
        int var10 = 0;
        IntrusiveDeque var11 = null;
        var10 = Kickabout.field_G;
        try {
          var11 = new IntrusiveDeque();
          if (param0 != 5464) {
            field_b = (ChatMessage[]) null;
          }
          var11.addLast(new IntValueNode(0), 3);
          if (0 == param1) {
            var11.addLast(new IntValueNode(2), 3);
          }
          if (param1 == 1) {
            var11.addLast(new IntValueNode(3), 3);
          }
          if (2 == param1) {
            var11.addLast(new IntValueNode(4), 3);
          }
          if (param2 == 1 ||
            param2 == 2) {
            var11.addLast(new IntValueNode(1), param0 - 5461);
          }
          if (param2 == 2) {
            var11.addLast(new IntValueNode(5), 3);
          }
          if (param2 == 3) {
            var11.addLast(new IntValueNode(6), 3);
          }
          var4 = 100.0 / (double)var11.a(false);
          var6 = 0.0;
          var8 = (IntValueNode) (var11.g(param0 + 18545));
          while (true) {
            if (var8 == null) {
              stackIn_25_0 = -1;
              return stackIn_25_0;
            }
            var9 = TooltipOverlay.loadSoundGroup(var8.field_j, (byte) 19);
            if (var9 == -1) {
              var6 = var6 + var4;
              var8 = (IntValueNode) (var11.c(33));
              continue;
            }
            break;
          }
          var6 = var6 + (double)var9 * var4 / 100.0;
          stackIn_22_0 = (int)var6;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var3), "fu.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int size(int param0) {
        if (param0 != 1) {
          return -66;
        }
        return this.field_g + 1;
    }

    final void removeAt(int param0, int param1) {
        if (param1 >= 0 &&
          this.field_g >= param1) {
          if (param0 != -1) {
            return;
          }
          if (param1 != this.field_g) {
            ArrayOperations.copyInts(this.field_d, param1 + 1, this.field_d, param1, this.field_g - param1);
          }
          this.field_g = this.field_g - 1;
          return;
        }
        throw new ArrayIndexOutOfBoundsException(param1);
    }

    final void add(int param0, int param1) {
        if (param1 < 101) {
          return;
        }
        this.set(true, param0, 1 + this.field_g);
    }

    private GrowableIntList() throws Throwable {
        throw new Error();
    }

    static {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_f = "view all <%0> teams";
        field_h = 0;
    }
}
