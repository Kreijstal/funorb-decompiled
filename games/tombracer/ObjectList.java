/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ObjectList {
    static LoginMethod field_d;
    private int size;
    private static String[] field_g;
    private Object[] elements;
    static String field_i;
    static int field_h;
    private int growth;
    static String field_b;
    static int field_c;

    final void insert(int param0, int param1, Object param2) {
        Object[] var6 = null;
        Object[] var7 = null;
        Object[] var4 = null;
        try {
          this.size = this.size + 1;
          if (param1 != 0) {
            Object var5 = (Object) null;
            this.insert(-79, -69, (Object) null);
          }
          if (this.size < this.elements.length) {
            ArrayUtils.copy(this.elements, param0, this.elements, 1 + param0, -param0 + this.size - 1);
          } else {
            var6 = new Object[this.growth + this.elements.length];
            var7 = var6;
            var4 = var7;
            ArrayUtils.copy(this.elements, 0, var7, 0, param0);
            ArrayUtils.copy(this.elements, param0, var4, 1 + param0, -param0 + this.elements.length);
            this.elements = var6;
          }
          this.elements[param0] = param2;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ub.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        DualLinkNode var1 = null;
        int var2 = TombRacer.field_G ? 1 : 0;
        DualLinkNode var1Lifetime1;
        try {
          ol.field_b = null;
          ii.field_a = 0;
          MonochromeRowCacheEntry.field_k = param0;
          PlayingSound.field_f.clear(8);
          MenuScreen.field_l.clear(8);
          var1 = TrackPlayerLocomotor.field_s.startTraversal(16);
          while (var1 != null) {
            var1.unlinkSecondary(-7975);
            var1 = TrackPlayerLocomotor.field_s.nextInTraversal((byte) -112);
          }
          var1Lifetime1 = CoinItemComponent.field_G.startTraversal(param0 - 120);
          while (var1Lifetime1 != null) {
            var1Lifetime1.unlinkSecondary(-7975);
            var1Lifetime1 = CoinItemComponent.field_G.nextInTraversal((byte) -112);
          }
          UiWidget.field_g = 0;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ub.G(" + param0 + ')');
        }
    }

    private final void initialize(int param0, Object[] param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          this.elements = new Object[param1.length];
          ArrayUtils.copy(param1, 0, this.elements, 0, param1.length);
          this.size = param0;
          for (var3_int = 0; this.elements.length > var3_int; var3_int++) {
            if (this.elements[var3_int] != null) {
              this.size = this.size + 1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ub.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_d = null;
        field_i = null;
        field_g = null;
        if (!param0) {
          return;
        }
        field_b = null;
    }

    public ObjectList() {
        this(10, 10);
    }

    final Object get(boolean param0, int param1) {
        if (!param0) {
          this.elements = new Object[5];
        }
        return this.elements[param1];
    }

    private ObjectList(Object[] param0, int param1) {
        this(param0);
        try {
          this.growth = param1;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ub.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void copyInto(Object[] param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1) {
            field_i = (String) null;
          }
          for (var3_int = 0; var3_int < param0.length; var3_int++) {
            if (this.elements.length <= var3_int) {
              return;
            }
            param0[var3_int] = this.elements[var3_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ub.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final int size(int param0) {
        if (param0 != -1) {
          ((int[]) (((Object[]) (this.elements[0]))[7]))[3] = 68;
        }
        return this.size;
    }

    private ObjectList(int param0, int param1) {
        this(new Object[param0], param1);
    }

    final static boolean hasFlag1024(int param0, int param1, byte param2) {
        int var3 = -40 % ((-25 - param2) / 37);
        return 0 != (param1 & 1024) ? true : false;
    }

    final void add(byte param0, Object param1) {
        try {
          this.insert(this.size, 0, param1);
          if (param0 != -37) {
            this.elements = (Object[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ub.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ObjectList(int param0) {
        this(new Object[param0]);
    }

    private ObjectList(Object[] param0) {
        this.growth = 1;
        try {
          this.initialize(0, param0);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ub.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new LoginMethod("usename");
        field_g = new String[4];
        field_g[2] = "Spitting Torch";
        field_g[0] = "Brazier";
        field_g[1] = "Wall Torch";
        field_g[3] = "Pillar";
        field_h = 0;
        field_c = field_h;
    }
}
