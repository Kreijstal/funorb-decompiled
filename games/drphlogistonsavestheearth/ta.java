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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = dh.field_N;
              var2 = var9.l(param0 ^ 31764);
              if (-1 == (var2 ^ -1)) {
                var8 = (uj) ((Object) md.field_e.h(param0 ^ -11147));
                if (var8 == null) {
                  eg.a((byte) 126);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var4 = var9.l(31760);
                    if (-1 == (var4 ^ -1)) {
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
                    eg.a((byte) 126);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8.a(-16175);
                    break L1;
                  }
                }
              } else {
                if ((var2 ^ -1) == -2) {
                  var3 = var9.h(51);
                  var4_ref_jl = (jl) ((Object) DrPhlogistonSavesTheEarth.field_F.h(-11151));
                  L3: while (true) {
                    L4: {
                      if (var4_ref_jl == null) {
                        break L4;
                      } else {
                        if (var3 != var4_ref_jl.field_j) {
                          var4_ref_jl = (jl) ((Object) DrPhlogistonSavesTheEarth.field_F.e(param0 + -4));
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
                      eg.a((byte) 126);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                } else {
                  gb.a((Throwable) null, "A1: " + al.a(-46), 10);
                  eg.a((byte) 126);
                  break L1;
                }
              }
            }
            L5: {
              if (param0 == 4) {
                break L5;
              } else {
                field_d = (he[]) null;
                break L5;
              }
            }
            decompiledRegionSelector0 = 3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "ta.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
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
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            field_i = (int[]) null;
            break L0;
          }
        }
        int fieldTemp$3 = this.field_h + 1;
        this.field_h = this.field_h + 1;
        this.field_l = this.field_l + fieldTemp$3;
        var2 = 0;
        L1: while (true) {
          if (256 <= var2) {
            return;
          } else {
            L2: {
              var3 = this.field_e[var2];
              if (0 != (var2 & 2)) {
                if (-1 != (var2 & 1 ^ -1)) {
                  this.field_k = this.field_k ^ this.field_k >>> -352778512;
                  break L2;
                } else {
                  this.field_k = this.field_k ^ this.field_k << -191680830;
                  break L2;
                }
              } else {
                if (-1 == (var2 & 1 ^ -1)) {
                  this.field_k = this.field_k ^ this.field_k << -1852321555;
                  break L2;
                } else {
                  this.field_k = this.field_k ^ this.field_k >>> -1530930682;
                  break L2;
                }
              }
            }
            this.field_k = this.field_k + this.field_e[255 & 128 + var2];
            dupTemp$4 = this.field_l + (this.field_e[rk.a(1020, var3) >> 103879490] + this.field_k);
            var4 = dupTemp$4;
            this.field_e[var2] = dupTemp$4;
            dupTemp$5 = this.field_e[rk.a(var4 >> -578376280 >> -1412009790, 255)] - -var3;
            this.field_l = dupTemp$5;
            this.field_m[var2] = dupTemp$5;
            var2++;
            continue L1;
          }
        }
    }

    final int b(byte param0) {
        int var2 = 66 / ((param0 - 37) / 50);
        if (-1 == (this.field_f ^ -1)) {
            this.a(true);
            this.field_f = 256;
        }
        int fieldTemp$0 = this.field_f - 1;
        this.field_f = this.field_f - 1;
        return this.field_m[fieldTemp$0];
    }

    private final void a(byte param0) {
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
          if ((var2 ^ -1) <= -5) {
            var2 = 0;
            L1: while (true) {
              if (-257 >= (var2 ^ -1)) {
                var2 = 0;
                L2: while (true) {
                  if ((var2 ^ -1) <= -257) {
                    L3: {
                      this.a(true);
                      this.field_f = 256;
                      if (param0 < -40) {
                        break L3;
                      } else {
                        field_b = (java.util.zip.CRC32) null;
                        break L3;
                      }
                    }
                    return;
                  } else {
                    var3 = var3 + this.field_e[var2];
                    var5 = var5 + this.field_e[2 + var2];
                    var7 = var7 + this.field_e[4 + var2];
                    var9 = var9 + this.field_e[6 + var2];
                    var6 = var6 + this.field_e[var2 - -3];
                    var10 = var10 + this.field_e[var2 - -7];
                    var8 = var8 + this.field_e[5 + var2];
                    var4 = var4 + this.field_e[1 + var2];
                    var3 = var3 ^ var4 << 1726144683;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 1441320386;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 740731624;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -913395312;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -1548228982;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> 519540196;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 654430344;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -1802933655;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    this.field_e[var2] = var3;
                    this.field_e[1 + var2] = var4;
                    this.field_e[2 + var2] = var5;
                    this.field_e[var2 - -3] = var6;
                    this.field_e[var2 - -4] = var7;
                    this.field_e[var2 + 5] = var8;
                    this.field_e[6 + var2] = var9;
                    this.field_e[7 + var2] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var3 = var3 + this.field_m[var2];
                var10 = var10 + this.field_m[var2 - -7];
                var9 = var9 + this.field_m[var2 + 6];
                var8 = var8 + this.field_m[var2 + 5];
                var7 = var7 + this.field_m[4 + var2];
                var6 = var6 + this.field_m[var2 + 3];
                var4 = var4 + this.field_m[1 + var2];
                var5 = var5 + this.field_m[var2 - -2];
                var3 = var3 ^ var4 << -1559248533;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> -1473466494;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << -1843730872;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> 1291893200;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << 1352962634;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> -303361948;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 1402475176;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> 744017289;
                var5 = var5 + var10;
                var3 = var3 + var4;
                this.field_e[var2] = var3;
                this.field_e[1 + var2] = var4;
                this.field_e[var2 + 2] = var5;
                this.field_e[3 + var2] = var6;
                this.field_e[4 + var2] = var7;
                this.field_e[5 + var2] = var8;
                this.field_e[6 + var2] = var9;
                this.field_e[var2 - -7] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << 669103211;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 1511902114;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << -981801848;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 763286928;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << 2057447306;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -2146144732;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 294526376;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> -1600643959;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L0;
          }
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
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 6) {
              var3 = (CharSequence) ((Object) param1);
              stackOut_3_0 = tf.field_pb.equals(rh.a(-85, var3));
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("ta.F(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
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
