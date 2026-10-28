/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static int field_e;
    static boolean[] field_f;
    int field_a;
    int[] field_b;
    int field_d;
    static int[] field_c;

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        if (param0 != -19467) {
          vl.a(42);
        }
    }

    final int b(int param0) {
        int stackIn_5_0 = 0;
        int var2 = -117 % ((param0 - 60) / 52);
        if (this.field_b != null &&
          this.field_b.length != 0) {
          stackIn_5_0 = this.field_b[-1 + this.field_b.length];
        } else {
          stackIn_5_0 = 0;
        }
        return stackIn_5_0;
    }

    final static int a(int param0, int param1) {
        if (param1 >= -113) {
          return -7;
        }
        return bi.field_d[param0 & 2047];
    }

    final static void b(int param0, int param1) {
        int var10 = EscapeVector.obfuscationControl;
        try {
          boolean stackIn_4_0 = !(param1 != 4);
          boolean var2_int = stackIn_4_0;
          if (hb.field_b == null) {
            return;
          }
          if (null == qi.field_M) {
            return;
          }
          if (param1 < 0 ||
            param1 >= 7) {
            param1 = 0;
          }
          if (param1 == 5 ||
            param1 == 6) {
            param1 = 0;
          }
          Sprite[] var3 = hb.field_b[param1];
          if (var2_int) {
            var3 = v.field_a;
          }
          if (param0 != 1) {
            vl.a(98);
          }
          Sprite[] var4 = qi.field_M[param1];
          for (int var5 = 0; 3 > var5; var5++) {
            if (var3 == null) {
              param1 = 0;
              var3 = hb.field_b[param1];
              var4 = qi.field_M[param1];
            }
            Sprite var6 = var3[var5];
            int var7 = var5 + 14;
            Sprite[] var8 = mb.field_f;
            if (var2_int) {
              var8 = ArchiveProvider.field_b;
            }
            var8[var7] = var6;
            Sprite var9 = var4[var5];
            jm.field_K[var7] = var9;
          }
          DualLinkNode.a(-1, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "vl.B(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(byte param0, int param1) {
        int var4 = EscapeVector.obfuscationControl;
        if (this.field_b == null) {
          return 0;
        }
        if (0 == this.field_b.length) {
          return 0;
        }
        int var3 = 1;
        if (param0 != 52) {
          this.a((byte) -102, -12);
        }
        while (this.field_b.length > var3) {
          if (this.field_b[var3] + this.field_b[-1 + var3] >> 1 > param1) {
            return -1 + var3;
          }
          var3++;
        }
        return this.field_b.length - 1;
    }

    vl(int param0, int param1, int param2) {
        this.field_a = param1;
        this.field_d = param0;
        this.field_b = new int[1 + param2];
    }

    final static int[] a(int param0, int param1, int param2, byte param3) {
        int var6 = EscapeVector.obfuscationControl;
        int[] var7 = new int[param2];
        int[] var4 = var7;
        for (int var5 = 0; var5 < param2; var5++) {
          var7[var5] = (var5 + (param1 + 1)) * param0;
        }
        if (param3 != -17) {
          field_f = (boolean[]) null;
        }
        return var4;
    }

    static {
        field_f = new boolean[]{false, false, false, false};
        field_c = new int[]{19, 20};
    }
}
