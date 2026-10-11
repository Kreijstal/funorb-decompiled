/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    cm field_g;
    private int field_k;
    int field_j;
    int[] field_a;
    static String field_e;
    int field_c;
    static String[] field_i;
    int[] field_b;
    int[] field_d;
    static jl field_h;
    static int[] field_l;
    static je field_f;

    public static void b(int param0) {
        field_f = null;
        field_l = null;
        field_e = null;
        field_i = null;
        field_h = null;
        if (param0 != 0) {
          field_f = (je) null;
        }
    }

    hm(PacketBuffer param0, boolean param1) {
        this();
        int discarded$0 = 0;
        try {
          discarded$0 = this.a(param0, -2, param1);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "hm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(mo param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 != -5) {
            hm.a(-8, 127, -35, 78, 58, -62, -122);
          }
          var2_int = ni.field_d;
          if (param0.field_b != 2) {
            if (param0.field_b == 4) {
              var2_intLifetime1 = fm.field_d[param0.field_b];
            } else {
              if (~oh.field_H == ~param0.field_n) {
                var2_intLifetime1 = CombatEvent.field_A[param0.field_b];
              } else {
                var2_intLifetime1 = fm.field_d[param0.field_b];
              }
            }
          } else {
            if (!param0.field_f) {
              if (0 == param0.field_a &&
                param0.field_e == 0) {
                var2_intLifetime1 = CombatEvent.field_A[param0.field_b];
              } else {
                var2_intLifetime1 = fm.field_d[param0.field_b];
              }
            } else {
              var2_intLifetime1 = ni.field_d;
            }
          }
          stackIn_16_0 = var2_intLifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("hm.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(byte param0) {
        if (param0 <= 44) {
          this.a((byte) 121);
        }
        return -this.field_k + this.field_c;
    }

    final boolean a(int param0, byte param1) {
        if (!(this.a((byte) 57) >= param0)) {
          return false;
        }
        this.field_k = this.field_k + param0;
        if (param1 != 103) {
          field_l = (int[]) null;
          return true;
        }
        return true;
    }

    final int a(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2 = NodeDeque.field_c.length;
        int var3 = this.field_j + this.field_c;
        for (var4 = param0; var4 < var2; var4++) {
          var5 = NodeDeque.field_c[var4];
          var3 = var3 - var5;
          if (0 > var3) {
            return var4;
          }
        }
        return var2;
    }

    private final int a(PacketBuffer param0, int param1, boolean param2) {
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = param0.readUnsignedByte(param1 + 2);
          if (9 < var4_int) {
            throw new RuntimeException("Unrecognized version: " + var4_int);
          }
          if (~var4_int <= param1) {
            if (var4_int < 5 ||
              param2) {
              for (var6 = 0; this.field_a.length > var6; var6++) {
                this.field_a[var6] = param0.readUnsignedByte(0);
              }
            }
            for (var6Lifetime2 = 0; this.field_d.length > var6Lifetime2; var6Lifetime2++) {
              this.field_d[var6Lifetime2] = param0.readUnsignedShort((byte) -104);
              if (this.field_d[var6Lifetime2] >= 135) {
                this.field_d[var6Lifetime2] = -1;
              }
            }
            this.field_c = param0.readInt(1);
            for (var6Lifetime3 = 0; 7 > var6Lifetime3; var6Lifetime3++) {
              this.field_b[var6Lifetime3] = param0.readUnsignedShort((byte) -104);
            }
          }
          var5 = -1;
          if (6 > var4_int) {
            var5Lifetime1 = param0.readUnsignedByte(0);
            this.field_k = 0;
            this.field_j = 0;
            for (var6Lifetime1 = 0; var6Lifetime1 < var5Lifetime1; var6Lifetime1++) {
              var7 = NodeDeque.field_c[var6Lifetime1];
              this.field_j = this.field_j + var7;
            }
          } else {
            this.field_k = param0.readInt(1);
            this.field_j = param0.readInt(1);
            this.field_g.a(var4_int, param0, -115);
          }
          stackIn_26_0 = var4_int;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("hm.F(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        OwnerChangeEvent.field_E.a(param5, -20500, param6, param2, param4);
        if (qd.field_I != null) {
          qd.field_I.b(param1, param3, param5, -TelefragEvent.field_z + param1, param5, param0 ^ 6518);
        }
        if (param0 != -1) {
          field_i = (String[]) null;
        }
    }

    private hm() {
        int var1 = 0;
        int var1Lifetime1;
        this.field_k = 0;
        this.field_a = new int[135];
        this.field_b = new int[7];
        this.field_c = 0;
        this.field_j = 0;
        this.field_d = new int[5];
        for (var1 = 0; 5 > var1; var1++) {
          this.field_d[var1] = -1;
        }
        int var3 = 0;
        var1Lifetime1 = var3;
        while (135 > var3) {
          this.field_a[var3] = 0;
          var3++;
        }
        this.field_g = new cm();
    }

    static {
        field_i = new String[]{"Full health", "1/2 health", "1/3 health", "1/4 health", "1/5 health", "1/6 health"};
        field_e = "Are You Sure?";
        field_l = new int[]{0, 0, 536870912, 553634816, 544700415};
        field_h = new jl();
    }
}
