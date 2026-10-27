/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends hc {
    static hh field_N;
    private static int[] field_K;
    static int[][] field_E;
    private static int[] field_P;
    private static int[] field_O;
    private el field_F;
    static int field_M;
    private static int[] field_I;
    private int field_R;
    static int field_G;
    static Sprite field_Q;
    static PacketBuffer field_L;

    final void a(int param0, int param1, int param2, hm param3) {
        try {
          this.field_R = this.field_R + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oj.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_K = null;
        field_N = null;
        field_O = null;
        field_Q = null;
        field_E = (int[][]) null;
        field_P = null;
        field_I = null;
        if (param0 == 113) {
          field_L = null;
          return;
        }
        field_N = (hh) null;
        field_L = null;
    }

    final boolean a(int param0, hm param1) {
        String stackIn_7_2 = null;
        try {
          if (param0 == -4659) {
            return false;
          }
          field_P = (int[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("oj.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var11 = EscapeVector.obfuscationControl;
        super.a(param0, (byte) 101, param2, param3);
        if (param1 >= 85) {
          if (param2 != 0) {
            return;
          }
          int var5 = this.field_k + param3 + (this.field_g >> 1);
          int var6 = this.field_j + param0 + (this.field_x >> 1);
          rf var8 = this.field_F.a(17124);
          if (var8 != of.field_f &&
            ug.field_c != var8) {
            if (ob.field_a == var8) {
              Sprite var24 = ul.field_E[2];
              var24.c(var5 - (var24.width >> 1), var6 - (var24.height >> 1), 256);
              return;
            }
            if (df.field_h != var8) {
              return;
            }
            Sprite var23 = ul.field_E[1];
            var23.c(-(var23.width >> 1) + var5, var6 - (var23.height >> 1), 256);
            return;
          }
          Sprite var25 = ul.field_E[0];
          int var9 = var25.fullWidth << 1;
          int var10 = var25.fullHeight << 1;
          if (pi.field_j == null) {
            pi.field_j = new Sprite(var9, var10);
            eo.a(pi.field_j, (byte) -111);
          } else if (pi.field_j.width < var9) {
            pi.field_j = new Sprite(var9, var10);
            eo.a(pi.field_j, (byte) -111);
          } else if (var10 <= pi.field_j.height) {
            eo.a(pi.field_j, (byte) -79);
            SoftwareRasterizer.d();
          } else {
            pi.field_j = new Sprite(var9, var10);
            eo.a(pi.field_j, (byte) -111);
          }
          var25.b(112, 144, var25.fullWidth << 4, var25.fullHeight << 4, -this.field_R << 10, 4096);
          dl.a((byte) 116);
          pi.field_j.c(var5 - var25.fullWidth, -var25.fullHeight + var6, 256);
          return;
        }
        field_I = (int[]) null;
        if (param2 != 0) {
          return;
        }
        int var5Lifetime1 = this.field_k + param3 + (this.field_g >> 1);
        int var6Lifetime1 = this.field_j + param0 + (this.field_x >> 1);
        rf var8Lifetime1 = this.field_F.a(17124);
        if (var8Lifetime1 == of.field_f) {
          Sprite var15 = ul.field_E[0];
          int var9Lifetime1 = var15.fullWidth << 1;
          int var10Lifetime1 = var15.fullHeight << 1;
          if (pi.field_j != null &&
            pi.field_j.width >= var9Lifetime1 &&
            var10Lifetime1 <= pi.field_j.height) {
            eo.a(pi.field_j, (byte) -79);
            SoftwareRasterizer.d();
          } else {
            pi.field_j = new Sprite(var9Lifetime1, var10Lifetime1);
            eo.a(pi.field_j, (byte) -111);
          }
          var15.b(112, 144, var15.fullWidth << 4, var15.fullHeight << 4, -this.field_R << 10, 4096);
          dl.a((byte) 116);
          pi.field_j.c(var5Lifetime1 - var15.fullWidth, -var15.fullHeight + var6Lifetime1, 256);
          return;
        }
        if (ug.field_c != var8Lifetime1) {
          if (ob.field_a == var8Lifetime1) {
            Sprite var18 = ul.field_E[2];
            var18.c(var5Lifetime1 - (var18.width >> 1), var6Lifetime1 - (var18.height >> 1), 256);
            return;
          }
          if (df.field_h != var8Lifetime1) {
            return;
          }
          Sprite var17 = ul.field_E[1];
          var17.c(-(var17.width >> 1) + var5Lifetime1, var6Lifetime1 - (var17.height >> 1), 256);
          return;
        }
        Sprite var16 = ul.field_E[0];
        Sprite var14 = var16;
        int var9Lifetime2 = var16.fullWidth << 1;
        int var10Lifetime2 = var16.fullHeight << 1;
        if (pi.field_j != null &&
          pi.field_j.width >= var9Lifetime2 &&
          var10Lifetime2 <= pi.field_j.height) {
          eo.a(pi.field_j, (byte) -79);
          SoftwareRasterizer.d();
        } else {
          pi.field_j = new Sprite(var9Lifetime2, var10Lifetime2);
          eo.a(pi.field_j, (byte) -111);
        }
        var16.b(112, 144, var16.fullWidth << 4, var16.fullHeight << 4, -this.field_R << 10, 4096);
        dl.a((byte) 116);
        pi.field_j.c(var5Lifetime1 - var16.fullWidth, -var16.fullHeight + var6Lifetime1, 256);
    }

    final static void a(int param0, int param1, byte param2, String param3) {
        try {
          fh.field_g.a(param3, param1 - 1, -1 + param0, 0, -1, 64);
          fh.field_g.a(param3, param1 + 1, -1 + param0, 0, -1, 64);
          fh.field_g.a(param3, -1 + param1, param0 + 1, 0, -1, 64);
          fh.field_g.a(param3, 1 + param1, param0 + 1, 0, -1, 64);
          fh.field_g.b(param3, param1, param0, 16777215, -1);
          int var4_int = -103 / ((param2 - 7) / 46);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oj.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int[] k(int param0) {
        if (param0 != 64) {
          return (int[]) null;
        }
        if (null != bk.field_r) {
          return bk.field_r.d(param0 + 31240);
        }
        return null;
    }

    final static void a(byte param0) {
        if (!mj.a((byte) 93)) {
          return;
        }
        sn.a(4, 0, false);
        if (param0 < 79) {
          field_Q = (Sprite) null;
        }
    }

    final String d(int param0) {
        if (param0 != 1) {
          return (String) null;
        }
        if (!this.field_u) {
          return null;
        }
        return this.field_F.b(param0 ^ 64);
    }

    oj(el param0) {
        try {
          this.field_F = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = new int[]{4, 4, 4, 4};
        field_O = new int[]{1, 4, 4, 4, 4};
        field_M = -1;
        field_P = field_O;
        field_I = new int[]{1, 4, 4, 4, 4};
        field_E = new int[][]{field_O, field_P, field_I, field_K};
    }
}
