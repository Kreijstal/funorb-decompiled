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

    final static void c() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        jl var4_ref_jl = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        uj var8 = null;
        lh var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = dh.field_N;
              var2 = var9.l(31760);
              if (var2 == 0) {
                var8 = (uj) (Object) md.field_e.h(-11151);
                if (var8 == null) {
                  int discarded$4 = 126;
                  eg.a();
                  return;
                } else {
                  L2: {
                    var4 = var9.l(31760);
                    if (var4 == 0) {
                      var5 = null;
                      break L2;
                    } else {
                      var13 = new byte[var4];
                      var9.b(0, var4, 128, var13);
                      break L2;
                    }
                  }
                  var9.field_j = var9.field_j + 4;
                  if (!var9.m(0)) {
                    int discarded$5 = 126;
                    eg.a();
                    return;
                  } else {
                    var8.a(-16175);
                    break L1;
                  }
                }
              } else {
                if (var2 == 1) {
                  var3 = var9.h(51);
                  var4_ref_jl = (jl) (Object) DrPhlogistonSavesTheEarth.field_F.h(-11151);
                  L3: while (true) {
                    L4: {
                      if (var4_ref_jl == null) {
                        break L4;
                      } else {
                        if (var3 != var4_ref_jl.field_j) {
                          var4_ref_jl = (jl) (Object) DrPhlogistonSavesTheEarth.field_F.e(0);
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var4_ref_jl != null) {
                      var4_ref_jl.a(-16175);
                      break L1;
                    } else {
                      int discarded$6 = 126;
                      eg.a();
                      return;
                    }
                  }
                } else {
                  gb.a((Throwable) null, "A1: " + al.a(-46), 10);
                  int discarded$7 = 126;
                  eg.a();
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "ta.A(" + 4 + 41);
        }
    }

    final static nh a(int param0) {
        int var4_int = 0;
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 20529) {
            field_j = null;
        }
        int var1 = gf.field_o[0] * qa.field_J[0];
        byte[] var2 = a.field_e[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = aj.field_a[rk.a((int) var2[var4_int], 255)];
        }
        nh var4 = new nh(oe.field_b, ih.field_K, kh.field_i[0], vi.field_b[0], gf.field_o[0], qa.field_J[0], var3);
        int discarded$0 = -21;
        oc.a();
        return var4;
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int fieldTemp$3 = ((ta) this).field_h + 1;
        ((ta) this).field_h = ((ta) this).field_h + 1;
        ((ta) this).field_l = ((ta) this).field_l + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (256 <= var2) {
            return;
          } else {
            L1: {
              var3 = ((ta) this).field_e[var2];
              if (0 != (var2 & 2)) {
                if ((var2 & 1) != 0) {
                  ((ta) this).field_k = ((ta) this).field_k ^ ((ta) this).field_k >>> 16;
                  break L1;
                } else {
                  ((ta) this).field_k = ((ta) this).field_k ^ ((ta) this).field_k << 2;
                  break L1;
                }
              } else {
                if ((var2 & 1) == 0) {
                  ((ta) this).field_k = ((ta) this).field_k ^ ((ta) this).field_k << 13;
                  break L1;
                } else {
                  ((ta) this).field_k = ((ta) this).field_k ^ ((ta) this).field_k >>> 6;
                  break L1;
                }
              }
            }
            ((ta) this).field_k = ((ta) this).field_k + ((ta) this).field_e[255 & 128 + var2];
            int dupTemp$4 = ((ta) this).field_l + (((ta) this).field_e[rk.a(1020, var3) >> 2] + ((ta) this).field_k);
            var4 = dupTemp$4;
            ((ta) this).field_e[var2] = dupTemp$4;
            int dupTemp$5 = ((ta) this).field_e[rk.a(var4 >> 8 >> 2, 255)] - -var3;
            ((ta) this).field_l = dupTemp$5;
            ((ta) this).field_m[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    final int b(byte param0) {
        int var2 = 66 / ((param0 - 37) / 50);
        if (((ta) this).field_f == 0) {
            this.a(true);
            ((ta) this).field_f = 256;
        }
        int fieldTemp$0 = ((ta) this).field_f - 1;
        ((ta) this).field_f = ((ta) this).field_f - 1;
        return ((ta) this).field_m[fieldTemp$0];
    }

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var5 = -1640531527;
        var8 = -1640531527;
        var6 = -1640531527;
        var4 = -1640531527;
        var3 = -1640531527;
        var10 = -1640531527;
        var9 = -1640531527;
        var7 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.a(true);
                    ((ta) this).field_f = 256;
                    return;
                  } else {
                    var3 = var3 + ((ta) this).field_e[var2];
                    var5 = var5 + ((ta) this).field_e[2 + var2];
                    var7 = var7 + ((ta) this).field_e[4 + var2];
                    var9 = var9 + ((ta) this).field_e[6 + var2];
                    var6 = var6 + ((ta) this).field_e[var2 - -3];
                    var10 = var10 + ((ta) this).field_e[var2 - -7];
                    var8 = var8 + ((ta) this).field_e[5 + var2];
                    var4 = var4 + ((ta) this).field_e[1 + var2];
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
                    ((ta) this).field_e[var2] = var3;
                    ((ta) this).field_e[1 + var2] = var4;
                    ((ta) this).field_e[2 + var2] = var5;
                    ((ta) this).field_e[var2 - -3] = var6;
                    ((ta) this).field_e[var2 - -4] = var7;
                    ((ta) this).field_e[var2 + 5] = var8;
                    ((ta) this).field_e[6 + var2] = var9;
                    ((ta) this).field_e[7 + var2] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var3 = var3 + ((ta) this).field_m[var2];
                var10 = var10 + ((ta) this).field_m[var2 - -7];
                var9 = var9 + ((ta) this).field_m[var2 + 6];
                var8 = var8 + ((ta) this).field_m[var2 + 5];
                var7 = var7 + ((ta) this).field_m[4 + var2];
                var6 = var6 + ((ta) this).field_m[var2 + 3];
                var4 = var4 + ((ta) this).field_m[1 + var2];
                var5 = var5 + ((ta) this).field_m[var2 - -2];
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
                ((ta) this).field_e[var2] = var3;
                ((ta) this).field_e[1 + var2] = var4;
                ((ta) this).field_e[var2 + 2] = var5;
                ((ta) this).field_e[3 + var2] = var6;
                ((ta) this).field_e[4 + var2] = var7;
                ((ta) this).field_e[5 + var2] = var8;
                ((ta) this).field_e[6 + var2] = var9;
                ((ta) this).field_e[var2 - -7] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
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
            var2++;
            continue L0;
          }
        }
    }

    public static void b() {
        field_a = null;
        field_i = null;
        field_j = null;
        field_b = null;
        field_d = null;
        field_g = null;
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var3 = (CharSequence) (Object) param1;
            stackOut_2_0 = tf.field_pb.equals((Object) (Object) rh.a(-85, var3));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ta.F(").append(6).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static void b(boolean param0) {
        ug.field_I = new v();
        fb.field_e.a(33, (vg) (Object) ug.field_I);
        if (param0) {
            field_d = null;
        }
    }

    ta(int[] param0) {
        int var2_int = 0;
        try {
            ((ta) this).field_e = new int[256];
            ((ta) this).field_m = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                ((ta) this).field_m[var2_int] = param0[var2_int];
            }
            int discarded$0 = -105;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ta.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Confirm Email:";
        field_g = "achievements to collect";
        field_j = new int[]{3, 3, 3, 3, 3, 3, -1, 3, -1, -1, -1, 3, -1, 3, 3, 3, 3, 3, 3, -1, -1, -1, 1, 1, 1, 1, -1, 1, -1, -1, -1, -1, -1, -1, -1, 3, -1, -1, 3, 3, 3, -1, -1, -1, -1, -1, -1, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, 1, 1, 1, 1, -1, 1, -1, -1, -1};
        field_b = new java.util.zip.CRC32();
        field_i = new int[8192];
    }
}
