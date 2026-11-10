/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Effect implements noa {
    static jea field_a;
    int field_j;
    private int preset;
    WorldBody field_g;
    static jpa[] field_e;
    private int field_k;
    static String[][] field_h;
    int size;
    private static String[] field_i;
    WorldBody field_c;
    static String[] field_d;

    final void a(WorldBody param0, int param1) {
        this.field_g = param0;
        if (param1 != 2348) {
          return;
        }
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "up.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(char param0, boolean param1) {
        if (!param1) {
          field_d = (String[]) null;
          if (param0 == 32) {
            return true;
          }
          if (40 != param0) {
            return 41 == param0 ? true : false;
          }
          return true;
        }
        if (param0 == 32) {
          return true;
        }
        if (40 == param0) {
          return true;
        }
        if (41 != param0) {
          return false;
        }
        return true;
    }

    final int e(int param0) {
        if (param0 > -78) {
          this.field_j = 23;
          return this.field_k;
        }
        return this.field_k;
    }

    final int getPreset(int param0) {
        if (param0 != -344) {
          this.a(9);
          return this.preset;
        }
        return this.preset;
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_h = (String[][]) null;
        field_i = null;
        if (param0 != 2) {
          return;
        }
        field_e = null;
        field_d = null;
    }

    final void a(BitPacketBuffer param0, byte param1) {
        try {
          param0.writeBits((byte) -125, this.preset, 4);
          if (param1 != 125) {
            this.preset = 36;
          }
          param0.writeBits((byte) 116, this.size, 10);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "up.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        this.field_j = this.a(true);
        if (param0 > -37) {
          this.b(-40, 82);
        }
    }

    final void a(int param0, int param1) {
        this.preset = param1;
        this.a(-80);
        if (param0 != 29525) {
          field_i = (String[]) null;
        }
    }

    final int c(int param0) {
        int var2 = 77 % ((-68 - param0) / 55);
        int var3 = this.preset;
        if (0 == var3) {
          return 2;
        }
        if (var3 == 2) {
          return 1;
        }
        if (1 == var3) {
          return 1;
        }
        if (var3 == 5) {
          return 2;
        }
        return 0;
    }

    private final int a(boolean param0) {
        int var2;
        int var2Lifetime1;
        if (param0) {
          var2 = this.preset;
          if (var2 == 0) {
            return 0;
          }
          if (var2 == 2) {
            return 3;
          }
          if (var2 == 1) {
            return 3;
          }
          if (var2 == 3) {
            return 4;
          }
          if (4 == var2) {
            return 1;
          }
          if (5 == var2) {
            return 5;
          }
          if (6 != var2) {
            throw new IllegalStateException("Unknown effect preset: " + this.preset);
          }
          return 2;
        }
        field_i = (String[]) null;
        var2Lifetime1 = this.preset;
        if (var2Lifetime1 == 0) {
          return 0;
        }
        if (var2Lifetime1 == 2) {
          return 3;
        }
        if (var2Lifetime1 == 1) {
          return 3;
        }
        if (var2Lifetime1 == 3) {
          return 4;
        }
        if (4 == var2Lifetime1) {
          return 1;
        }
        if (5 == var2Lifetime1) {
          return 5;
        }
        if (6 != var2Lifetime1) {
          throw new IllegalStateException("Unknown effect preset: " + this.preset);
        }
        return 2;
    }

    final boolean d(int param0) {
        if (param0 != 6734) {
          this.b(94, -61);
          if (this.field_j != 1) {
            return this.field_j == 2 ? true : false;
          }
          return true;
        }
        if (this.field_j == 1) {
          return true;
        }
        if (this.field_j != 2) {
          return false;
        }
        return true;
    }

    Effect(int param0, int param1) {
        this((WorldBody) null, param0, param1);
    }

    final void b(int param0, int param1) {
        this.field_k = param1;
        if (param0 != 1) {
          field_e = (jpa[]) null;
        }
    }

    Effect(WorldBody param0, Effect param1) {
        this(param0, param1.preset, param1.size);
        try {
          this.field_k = param1.field_k;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "up.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    Effect(WorldBody param0, int param1, int param2) {
        try {
          this.preset = param1;
          this.size = param2;
          this.a(param0, 2348);
          this.a(-70);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "up.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        return "Effect: preset " + this.preset + ", size " + this.size;
    }

    static {
        field_i = new String[1];
        field_i[0] = "Normal";
        field_h = new String[11][];
        field_d = new String[]{"<%0> took a nice hot bath", "<%0> took a dip", "<%0> felt the heat", "<%0> needs to cool off", "<%0> melted", "<%0> found that lava was bad to touch"};
    }
}
