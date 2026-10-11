/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ue {
    private long field_e;
    private long field_d;
    static t[] field_c;
    static int field_h;
    static t field_f;
    static t field_b;
    private RandomAccessFile field_a;
    static si field_g;

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.field_e < ((long)param0 + this.field_d)) {
            this.field_a.seek(this.field_e);
            this.field_a.write(1);
            throw new EOFException();
          }
          this.field_a.write(param3, param2, param0);
          this.field_d = this.field_d + (long)param0;
          if (param1 != 2) {
            ue.a(-61, 120);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ue.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_42_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var23 = 0;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var16Lifetime1Lifetime1;
        int var17Lifetime1Lifetime1;
        int var18Lifetime1Lifetime1;
        int var19Lifetime1Lifetime1;
        var23 = Torquing.field_u;
        try {
          pl.b(param4, param0 ^ -15867);
          var7_int = 0;
          var8 = -param5 + param4;
          if (param0 != -15788) {
            return;
          }
          if (var8 < 0) {
            var8 = 0;
          }
          var9 = param4;
          var10 = -param4;
          var11 = var8;
          var12 = -var8;
          var13 = -1;
          if (j.field_q <= param2 &&
            param2 <= qk.field_p) {
            var39 = qd.field_a[param2];
            var16 = ln.a(qg.field_z, kn.field_e, -param4 + param1, 97);
            var17 = ln.a(qg.field_z, kn.field_e, param1 + param4, 114);
            var18 = ln.a(qg.field_z, kn.field_e, -var8 + param1, 88);
            var19 = ln.a(qg.field_z, kn.field_e, var8 + param1, param0 + 15882);
            di.a(var16, (byte) -125, param3, var39, var18);
            di.a(var18, (byte) -114, param6, var39, var19);
            di.a(var19, (byte) 108, param3, var39, var17);
          }
          var14 = -1;
          while (true) {
            if (var7_int >= var9) {
              return;
            }
            var13 += 2;
            var14 += 2;
            var12 = var12 + var14;
            var10 = var10 + var13;
            if (var12 >= 0 &&
              var11 >= 1) {
              var11--;
              vc.field_a[var11] = var7_int;
              var12 = var12 - (var11 << 1);
            }
            var7_int++;
            if (var10 >= 0) {
              var9--;
              var10 = var10 - (var9 << 1);
              var15 = param2 - var9;
              var16Lifetime1 = param2 + var9;
              if (var16Lifetime1 >= j.field_q &&
                qk.field_p >= var15) {
                if (var8 <= var9) {
                  var17Lifetime1 = ln.a(qg.field_z, kn.field_e, param1 + var7_int, param0 ^ -15853);
                  var18Lifetime1 = ln.a(qg.field_z, kn.field_e, -var7_int + param1, 118);
                  if (qk.field_p >= var16Lifetime1) {
                    di.a(var18Lifetime1, (byte) 76, param3, qd.field_a[var16Lifetime1], var17Lifetime1);
                  }
                  if (j.field_q <= var15) {
                    di.a(var18Lifetime1, (byte) 15, param3, qd.field_a[var15], var17Lifetime1);
                  }
                } else {
                  var17Lifetime1 = vc.field_a[var9];
                  var18Lifetime1 = ln.a(qg.field_z, kn.field_e, var7_int + param1, 119);
                  var19Lifetime1 = ln.a(qg.field_z, kn.field_e, param1 - var7_int, param0 ^ -15855);
                  var20 = ln.a(qg.field_z, kn.field_e, var17Lifetime1 + param1, 95);
                  var21 = ln.a(qg.field_z, kn.field_e, -var17Lifetime1 + param1, 96);
                  if (var16Lifetime1 <= qk.field_p) {
                    var40 = qd.field_a[var16Lifetime1];
                    di.a(var19Lifetime1, (byte) -111, param3, var40, var21);
                    di.a(var21, (byte) -94, param6, var40, var20);
                    di.a(var20, (byte) 33, param3, var40, var18Lifetime1);
                  }
                  if (var15 >= j.field_q) {
                    var41 = qd.field_a[var15];
                    di.a(var19Lifetime1, (byte) -93, param3, var41, var21);
                    di.a(var21, (byte) 107, param6, var41, var20);
                    di.a(var20, (byte) -95, param3, var41, var18Lifetime1);
                  }
                }
              }
            }
            var15Lifetime1 = param2 - var7_int;
            var16Lifetime1Lifetime1 = var7_int + param2;
            if (var16Lifetime1Lifetime1 < j.field_q) {
              continue;
            }
            if (qk.field_p < var15Lifetime1) {
              continue;
            }
            var17Lifetime1Lifetime1 = var9 + param1;
            var18Lifetime1Lifetime1 = param1 - var9;
            if (kn.field_e > var17Lifetime1Lifetime1) {
              continue;
            }
            if (qg.field_z < var18Lifetime1Lifetime1) {
              continue;
            }
            var17Lifetime1Lifetime1 = ln.a(qg.field_z, kn.field_e, var17Lifetime1Lifetime1, 94);
            var18Lifetime1Lifetime1 = ln.a(qg.field_z, kn.field_e, var18Lifetime1Lifetime1, 118);
            if (var7_int >= var8) {
              if (qk.field_p >= var16Lifetime1Lifetime1) {
                di.a(var18Lifetime1Lifetime1, (byte) 51, param3, qd.field_a[var16Lifetime1Lifetime1], var17Lifetime1Lifetime1);
              }
              if (j.field_q > var15Lifetime1) {
                continue;
              }
              di.a(var18Lifetime1Lifetime1, (byte) 71, param3, qd.field_a[var15Lifetime1], var17Lifetime1Lifetime1);
              continue;
            }
            if (var7_int <= var11) {
              stackIn_42_0 = var11;
            } else {
              stackIn_42_0 = vc.field_a[var7_int];
            }
            var19Lifetime1Lifetime1 = stackIn_42_0;
            var20Lifetime1 = ln.a(qg.field_z, kn.field_e, param1 + var19Lifetime1Lifetime1, 100);
            var21Lifetime1 = ln.a(qg.field_z, kn.field_e, param1 - var19Lifetime1Lifetime1, 81);
            if (var16Lifetime1Lifetime1 <= qk.field_p) {
              var42 = qd.field_a[var16Lifetime1Lifetime1];
              di.a(var18Lifetime1Lifetime1, (byte) -103, param3, var42, var21Lifetime1);
              di.a(var21Lifetime1, (byte) -115, param6, var42, var20Lifetime1);
              di.a(var20Lifetime1, (byte) -116, param3, var42, var17Lifetime1Lifetime1);
            }
            if (j.field_q > var15Lifetime1) {
              continue;
            }
            var43 = qd.field_a[var15Lifetime1];
            di.a(var18Lifetime1Lifetime1, (byte) 4, param3, var43, var21Lifetime1);
            di.a(var21Lifetime1, (byte) -5, param6, var43, var20Lifetime1);
            di.a(var20Lifetime1, (byte) -95, param3, var43, var17Lifetime1Lifetime1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var7), "ue.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(byte param0) throws IOException {
        int var2 = 26 % ((param0 - 16) / 52);
        if (null != this.field_a) {
          this.field_a.close();
          this.field_a = null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        int var1 = -70 % ((-19 - param0) / 59);
        field_b = null;
        field_f = null;
    }

    protected final void finalize() throws Throwable {
        if (null != this.field_a) {
          System.out.println("");
          this.a((byte) -89);
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_a.read(param2, param1, param0);
          if (0 < var5_int) {
            this.field_d = this.field_d + (long)var5_int;
          }
          if (param3 == 15389) {
            stackIn_6_0 = var5_int;
            return stackIn_6_0;
          }
          stackIn_4_0 = 40;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ue.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != -16513) {
          ue.a(28, -38, 8, -108, 43, -40, 73);
        }
        sh.b(0);
    }

    final void a(int param0, long param1) throws IOException {
        this.field_a.seek(param1);
        if (param0 != -2) {
          return;
        }
        this.field_d = param1;
    }

    final long b(byte param0) throws IOException {
        int var2 = 108 % ((param0 + 8) / 56);
        return this.field_a.length();
    }

    ue(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param2 < param0.length()) {
            param0.delete();
          }
          this.field_a = new RandomAccessFile(param0, param1);
          this.field_e = param2;
          this.field_d = 0L;
          var5_int = this.field_a.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_a.seek(0L);
            this.field_a.write(var5_int);
          }
          this.field_a.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ue.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_h = -1;
    }
}
