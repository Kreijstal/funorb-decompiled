/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jwa extends le {
    static llb field_k;
    static int field_l;
    private int field_j;
    private int field_i;
    private int field_m;

    public jwa() {
        this(0);
    }

    private final void b(int param0, int param1) {
        this.field_j = (255 & param0) << 4;
        this.field_i = param0 >> 4 & 4080;
        int var3 = -58 % ((param1 + 77) / 41);
        this.field_m = (16711680 & param0) >> 12;
    }

    final int[][] a(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = VoidHunters.field_G;
        int[][] var9 = this.field_d.a(param1, (byte) -98);
        int[][] var3 = var9;
        if (this.field_d.field_g) {
          var4 = var9[0];
          var5 = var9[1];
          var6 = var9[2];
          for (var7 = 0; var7 < hob.field_d; var7++) {
            var4[var7] = this.field_m;
            var5[var7] = this.field_i;
            var6[var7] = this.field_j;
          }
        }
        if (param0 != 255) {
          return (int[][]) null;
        }
        return var3;
    }

    private jwa(int param0) {
        super(0, false);
        this.b(param0, -121);
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 > -60) {
            return;
          }
          var4_int = param0;
          if (var4_int == 0) {
            this.b(param2.c((byte) -94), -123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("jwa.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static String a(boolean param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        String stackIn_6_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          if (param1 == null) {
            return null;
          }
          if (param0) {
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          var2_int = 0;
          var3 = param1.length();
          while (var2_int < var3) {
            if (fg.a(param1.charAt(var2_int), 120)) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (fg.a(param1.charAt(var3 - 1), 116)) {
              var3--;
              continue;
            }
            break;
          }
          var4 = var3 - var2_int;
          if (var4 < 1) {
            return null;
          }
          if (12 < var4) {
            stackIn_19_0 = null;
            return (String) (stackIn_19_0);
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var6 < var3; var6++) {
            var7 = param1.charAt(var6);
            if (qnb.a((byte) -128, (char) var7)) {
              var8 = rr.a((char) var7, 102);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("jwa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_k = null;
        if (param0 > -76) {
          jwa.d(-39);
        }
    }

    static {
        field_l = 2;
    }
}
