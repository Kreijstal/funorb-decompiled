/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntList {
    private boolean multiplicativeGrowth;
    private int[] values;
    private int lastIndex;
    private int growth;
    static TextureTransformMode TEXTURE_COUNT2;
    static int field_g;
    static int field_h;
    static SpriteData field_e;

    final static int pollAccountCreation(boolean param0, String param1, int param2, String param3, int param4, int param5, String param6) {
        LoginFieldValue var7 = null;
        RuntimeException var7_ref = null;
        LoginFieldValue var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new LoginFieldValue(param1);
          if (param5 < 115) {
            stackIn_2_0 = -95;
            return stackIn_2_0;
          }
          var8 = new LoginFieldValue(param3);
          stackIn_4_0 = CachedTextLayout.pollAccountFormRequest(var7, param2, var8, param4, param0, 21, param6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("rs.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int get(int index, int guard) {
        if (index > this.lastIndex) {
          throw new ArrayIndexOutOfBoundsException(index);
        }
        if (guard == -29816) {
          return this.values[index];
        }
        field_e = (SpriteData) null;
        return this.values[index];
    }

    private final void ensureCapacity(int guard, int index) {
        int var4 = -38 % ((-60 - guard) / 46);
        int[] var5 = new int[this.capacityFor(1, index)];
        int[] var3 = var5;
        ArrayUtils.copy(this.values, 0, var5, 0, this.values.length);
        this.values = var5;
    }

    final static boolean openWindowsBrowser(String url, int guard) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          try {
            if (!PlatformTaskDispatcher.field_o.startsWith("win")) {
              return false;
            }
            if (!url.startsWith("http://") &&
              !url.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            if (guard != -2528) {
              return false;
            }
            for (var3 = 0; url.length() > var3; var3++) {
              if (-1 == var2.indexOf((int) url.charAt(var3))) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + url + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var2_ref2;
          stackIn_25_1 = new StringBuilder().append("rs.G(");
          if (url == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -26791) {
          return;
        }
        field_e = null;
        TEXTURE_COUNT2 = null;
    }

    final void removeAt(byte guard, int index) {
        if (guard != 61) {
          field_g = 27;
          if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
          }
          if (this.lastIndex >= index) {
            if (index != this.lastIndex) {
              ArrayUtils.copy(this.values, 1 + index, this.values, index, this.lastIndex - index);
            }
            this.lastIndex = this.lastIndex - 1;
            return;
          }
          throw new ArrayIndexOutOfBoundsException(index);
        }
        if (index < 0) {
          throw new ArrayIndexOutOfBoundsException(index);
        }
        if (this.lastIndex >= index) {
          if (index != this.lastIndex) {
            ArrayUtils.copy(this.values, 1 + index, this.values, index, this.lastIndex - index);
          }
          this.lastIndex = this.lastIndex - 1;
          return;
        }
        throw new ArrayIndexOutOfBoundsException(index);
    }

    private IntList() throws Throwable {
        throw new Error();
    }

    private final int capacityFor(int guard, int index) {
        int var3;
        int var4;
        String var5;
        int var3Lifetime1;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (guard == 1) {
          var3 = this.values.length;
          while (var3 <= index) {
            if (!this.multiplicativeGrowth) {
              var3 = var3 + this.growth;
              continue;
            }
            if (0 == var3) {
              var3 = 1;
              continue;
            }
            var3 = var3 * this.growth;
          }
          return var3;
        }
        var5 = (String) null;
        IntList.pollAccountCreation(false, (String) null, 93, (String) null, -122, -38, (String) null);
        var3Lifetime1 = this.values.length;
        while (var3Lifetime1 <= index) {
          if (!this.multiplicativeGrowth) {
            var3Lifetime1 = var3Lifetime1 + this.growth;
            continue;
          }
          if (0 == var3Lifetime1) {
            var3Lifetime1 = 1;
            continue;
          }
          var3Lifetime1 = var3Lifetime1 * this.growth;
        }
        return var3Lifetime1;
    }

    final void add(int guard, int value) {
        this.set(value, 1 + this.lastIndex, false);
        int var3 = 29 % ((-83 - guard) / 33);
    }

    private final void set(int value, int index, boolean guard) {
        if (guard) {
          field_e = (SpriteData) null;
        }
        if (index > this.lastIndex) {
          this.lastIndex = index;
        }
        if (index >= this.values.length) {
          this.ensureCapacity(99, index);
        }
        this.values[index] = value;
    }

    final int size(byte guard) {
        if (guard <= 28) {
          return 121;
        }
        return 1 + this.lastIndex;
    }

    static {
        TEXTURE_COUNT2 = new TextureTransformMode();
        field_g = 2;
        field_h = 4;
    }
}
