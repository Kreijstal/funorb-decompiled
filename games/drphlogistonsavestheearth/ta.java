/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ta {
    static int[] field_j;
    static String field_a;
    private int field_h;
    static java.util.zip.CRC32 field_b;
    static he[] field_d;
    private int[] field_m;
    static String field_g;
    private int field_k;
    private int[] field_e;
    private int field_l;
    private int field_f;
    static int[] field_i;
    static int field_c;

    final static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        jl var4_ref_jl = null;
        Object var5 = null;
        int var6 = 0;
        uj var8 = null;
        lh var9 = null;
        byte[] var13 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var9 = dh.field_N;
          var2 = var9.l(param0 ^ 31764);
          if (var2 == 0) {
            var8 = (uj) (md.field_e.h(param0 ^ -11147));
            if (var8 == null) {
              eg.a((byte) 126);
              return;
            }
            var4 = var9.l(31760);
            if (var4 == 0) {
              var5 = null;
            } else {
              var13 = new byte[var4];
              var9.b(0, var4, 128, var13);
            }
            var9.field_j = var9.field_j + 4;
            if (!var9.m(0)) {
              eg.a((byte) 126);
              return;
            }
            var8.a(-16175);
          } else {
            if (var2 == 1) {
              var3 = var9.h(51);
              var4_ref_jl = (jl) (DrPhlogistonSavesTheEarth.field_F.h(-11151));
              while (var4_ref_jl != null) {
                if (~var3 != ~var4_ref_jl.field_j) {
                  var4_ref_jl = (jl) (DrPhlogistonSavesTheEarth.field_F.e(param0 - 4));
                  continue;
                }
                break;
              }
              if (var4_ref_jl != null) {
                var4_ref_jl.a(-16175);
                decompiledFrameRemainder0 = false;
              }
              else {
                eg.a((byte) 126);
                return;
              }
            }
            if (decompiledFrameRemainder0) {
              gb.a((Throwable) null, "A1: " + al.a(-46), 10);
              eg.a((byte) 126);
            }
          }
          if (param0 != 4) {
            field_d = (he[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "ta.A(" + param0 + ')');
        }
    }

    final static nh a(int param0) {
        int var4_int = 0;
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 20529) {
          field_j = (int[]) null;
        }
        int var1 = gf.field_o[0] * qa.field_J[0];
        byte[] var2 = a.field_e[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
          var3[var4_int] = aj.field_a[rk.a((int) var2[var4_int], 255)];
        }
        nh var4 = new nh(oe.field_b, ih.field_K, kh.field_i[0], vi.field_b[0], gf.field_o[0], qa.field_J[0], var3);
        oc.a((byte) -21);
        return var4;
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!param0) {
          field_i = (int[]) null;
        }
        int fieldTemp$0 = this.field_h + 1;
        this.field_h = this.field_h + 1;
        this.field_l = this.field_l + fieldTemp$0;
        for (var2 = 0; 256 > var2; var2++) {
          var3 = this.field_e[var2];
          if (0 != (var2 & 2)) {
            if ((var2 & 1) != 0) {
              this.field_k = this.field_k ^ this.field_k >>> 16;
            } else {
              this.field_k = this.field_k ^ this.field_k << 2;
            }
          } else {
            if ((var2 & 1) == 0) {
              this.field_k = this.field_k ^ this.field_k << 13;
            } else {
              this.field_k = this.field_k ^ this.field_k >>> 6;
            }
          }
          this.field_k = this.field_k + this.field_e[255 & 128 + var2];
          dupTemp$1 = this.field_l + (this.field_e[rk.a(1020, var3) >> 2] + this.field_k);
          var4 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          dupTemp$2 = this.field_e[rk.a(var4 >> 8 >> 2, 255)] + var3;
          this.field_l = dupTemp$2;
          this.field_m[var2] = dupTemp$2;
        }
    }

    final int b(byte param0) {
        int var2 = 66 / ((param0 - 37) / 50);
        if (this.field_f == 0) {
          this.a(true);
          this.field_f = 256;
        }
        int fieldTemp$0 = this.field_f - 1;
        this.field_f = this.field_f - 1;
        return this.field_m[fieldTemp$0];
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var5 = -1640531527;
        int var8 = -1640531527;
        int var6 = -1640531527;
        int var4 = -1640531527;
        int var3 = -1640531527;
        int var10 = -1640531527;
        int var9 = -1640531527;
        int var7 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        for (var2 = 0; var2 < 4; var2++) {
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var3 = var3 + this.field_m[var2Lifetime1];
          var10 = var10 + this.field_m[var2Lifetime1 + 7];
          var9 = var9 + this.field_m[var2Lifetime1 + 6];
          var8 = var8 + this.field_m[var2Lifetime1 + 5];
          var7 = var7 + this.field_m[4 + var2Lifetime1];
          var6 = var6 + this.field_m[var2Lifetime1 + 3];
          var4 = var4 + this.field_m[1 + var2Lifetime1];
          var5 = var5 + this.field_m[var2Lifetime1 + 2];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_e[var2Lifetime1] = var3;
          this.field_e[1 + var2Lifetime1] = var4;
          this.field_e[var2Lifetime1 + 2] = var5;
          this.field_e[3 + var2Lifetime1] = var6;
          this.field_e[4 + var2Lifetime1] = var7;
          this.field_e[5 + var2Lifetime1] = var8;
          this.field_e[6 + var2Lifetime1] = var9;
          this.field_e[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var3 = var3 + this.field_e[var2Lifetime2];
          var5 = var5 + this.field_e[2 + var2Lifetime2];
          var7 = var7 + this.field_e[4 + var2Lifetime2];
          var9 = var9 + this.field_e[6 + var2Lifetime2];
          var6 = var6 + this.field_e[var2Lifetime2 + 3];
          var10 = var10 + this.field_e[var2Lifetime2 + 7];
          var8 = var8 + this.field_e[5 + var2Lifetime2];
          var4 = var4 + this.field_e[1 + var2Lifetime2];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_e[var2Lifetime2] = var3;
          this.field_e[1 + var2Lifetime2] = var4;
          this.field_e[2 + var2Lifetime2] = var5;
          this.field_e[var2Lifetime2 + 3] = var6;
          this.field_e[var2Lifetime2 + 4] = var7;
          this.field_e[var2Lifetime2 + 5] = var8;
          this.field_e[6 + var2Lifetime2] = var9;
          this.field_e[7 + var2Lifetime2] = var10;
        }
        this.a(true);
        this.field_f = 256;
        if (param0 >= -40) {
          field_b = (java.util.zip.CRC32) null;
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_i = null;
        if (param0 != 1441320386) {
          field_d = (he[]) null;
        }
        field_j = null;
        field_b = null;
        field_d = null;
        field_g = null;
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 6) {
            return false;
          }
          var3 = (CharSequence) ((Object) param1);
          stackIn_4_0 = tf.field_pb.equals(rh.a(-85, var3));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ta.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        ug.field_I = new v();
        fb.field_e.a(33, ug.field_I);
        if (param0) {
          field_d = (he[]) null;
        }
    }

    ta(int[] param0) {
        int var2_int = 0;
        try {
          this.field_e = new int[256];
          this.field_m = new int[256];
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            this.field_m[var2_int] = param0[var2_int];
          }
          this.a((byte) -105);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ta.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Confirm Email:";
        field_g = "achievements to collect";
        field_j = new int[]{3, 3, 3, 3, 3, 3, -1, 3, -1, -1, -1, 3, -1, 3, 3, 3, 3, 3, 3, -1, -1, -1, 1, 1, 1, 1, -1, 1, -1, -1, -1, -1, -1, -1, -1, 3, -1, -1, 3, 3, 3, -1, -1, -1, -1, -1, -1, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, 1, 1, 1, 1, -1, 1, -1, -1, -1};
        field_b = new java.util.zip.CRC32();
        field_i = new int[8192];
    }
}
