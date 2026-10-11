/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ve {
    static pl field_b;
    static jg field_a;

    public static void b(byte param0) {
        field_a = null;
        int var1 = -9 / ((param0 - 36) / 56);
        field_b = null;
    }

    final static boolean a(int[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 1) {
            stackIn_6_0 = ((param0[param2 >> 5] & 1 << (31 & param2)) != 0);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ve.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        pa.field_d = new sf[17];
        pa.field_d[0] = new sf(0, 170, 170, 300, 0, (RgbSprite) null, true);
        if (param0 != 122) {
          return;
        }
        pa.field_d[1] = new sf(1, 224, 110, 200, 0, (RgbSprite) null, false);
        pa.field_d[2] = new sf(2, 224, 86, 400, 0, (RgbSprite) null, true);
        pa.field_d[3] = new sf(3, 224, 60, 200, 0, (RgbSprite) null, false);
        pa.field_d[4] = new sf(4, 224, 60, 285, 0, (RgbSprite) null, false);
        pa.field_d[5] = new sf(5, 224, 60, 200, 0, (RgbSprite) null, false);
        pa.field_d[6] = new sf(6, 224, 60, 285, 0, (RgbSprite) null, false);
        pa.field_d[7] = new sf(7, 224, 120, 200, 0, (RgbSprite) null, false);
        pa.field_d[8] = new sf(8, 224, 86, 285, 0, (RgbSprite) null, false);
        pa.field_d[9] = new sf(9, 170, 86, 300, 0, (RgbSprite) null, true);
        pa.field_d[10] = new sf(10, 224, 60, 200, 0, (RgbSprite) null, false);
        pa.field_d[11] = new sf(11, 224, 60, 285, 0, (RgbSprite) null, false);
        pa.field_d[12] = new sf(12, 224, 100, 285, 0, b.field_q[2], false);
        pa.field_d[13] = new sf(13, 170, 174, 300, 0, (RgbSprite) null, true);
        pa.field_d[14] = new sf(14, 224, 60, 200, 0, (RgbSprite) null, false);
        pa.field_d[15] = new sf(15, 224, 60, 400, 0, b.field_q[2], false);
        pa.field_d[16] = new sf(16, 170, 170, 300, 0, (RgbSprite) null, true);
    }

    final static boolean a(byte param0, int param1) {
        try {
          if (param0 > -84) {
            byte[] var3 = (byte[]) null;
            ve.a(-78, (byte[]) null);
          }
          if (rf.field_d.position >= param1) {
            return true;
          }
          if (rb.field_h == null) {
            return false;
          }
          int var2_int = rb.field_h.a(-119);
          if (var2_int > 0) {
            if (!(var2_int <= -rf.field_d.position + param1)) {
              var2_int = -rf.field_d.position + param1;
            }
            rb.field_h.a(rf.field_d.position, var2_int, rf.field_d.payload, -256);
            oe.field_b = mm.a(-100);
            rf.field_d.position = rf.field_d.position + var2_int;
            if (rf.field_d.position < param1) {
              return false;
            }
            rf.field_d.position = 0;
            return true;
          }
          try {
            if (false) throw (IOException) null;
            if (0 <= var2_int &&
              ki.l(150) <= 30000L) {
              return false;
            }
            pm.m(-125);
          } catch (IOException iOException) {
            pm.m(-40);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte[] param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        PacketBuffer var16 = null;
        PacketBuffer var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = SteelSentinels.obfuscationControl;
        try {
          var16 = new PacketBuffer(param1);
          var17 = var16;
          var17.position = param1.length - 2;
          rl.field_d = var17.readUnsignedShort((byte) -60);
          ca.field_r = new int[rl.field_d];
          oa.field_M = new int[rl.field_d];
          le.field_L = new int[rl.field_d];
          pd.field_U = new boolean[rl.field_d];
          dl.field_L = new byte[rl.field_d][];
          rl.field_a = new int[rl.field_d];
          sn.field_g = new byte[rl.field_d][];
          var17.position = -(8 * rl.field_d) - 7 + param1.length;
          un.field_n = var17.readUnsignedShort((byte) -60);
          eb.field_n = var17.readUnsignedShort((byte) -60);
          var3 = (255 & var17.readUnsignedByte((byte) -114)) + 1;
          var4 = 0;
          if (param0 != 16) {
            return;
          }
          while (var4 < rl.field_d) {
            rl.field_a[var4] = var16.readUnsignedShort((byte) -60);
            var4++;
          }
          for (var4Lifetime1 = 0; rl.field_d > var4Lifetime1; var4Lifetime1++) {
            oa.field_M[var4Lifetime1] = var17.readUnsignedShort((byte) -60);
          }
          for (var4Lifetime2 = 0; rl.field_d > var4Lifetime2; var4Lifetime2++) {
            le.field_L[var4Lifetime2] = var17.readUnsignedShort((byte) -60);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < rl.field_d; var4Lifetime3++) {
            ca.field_r[var4Lifetime3] = var17.readUnsignedShort((byte) -60);
          }
          var17.position = -(8 * rl.field_d) + (-7 + param1.length - 3 * (var3 - 1));
          ba.field_d = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            ba.field_d[var4Lifetime4] = var17.a(false);
            if (ba.field_d[var4Lifetime4] == 0) {
              ba.field_d[var4Lifetime4] = 1;
            }
          }
          var17.position = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < rl.field_d; var4Lifetime5++) {
            var5 = le.field_L[var4Lifetime5];
            var6 = ca.field_r[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            dl.field_L[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            sn.field_g[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.readUnsignedByte((byte) -121);
            if ((1 & var11) == 0) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var17.readByte((byte) -2);
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  dupTemp$1 = var17.readByte((byte) -2);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_31_0 = var10;
                  if (-1 == var13) {
                    stackIn_32_1 = 0;
                  } else {
                    stackIn_32_1 = 1;
                  }
                  var10 = stackIn_31_0 | stackIn_32_1;
                }
              }
            } else {
              for (var12 = 0; var12 < var5; var12++) {
                for (var13 = 0; var6 > var13; var13++) {
                  var8[var12 + var13 * var5] = var17.readByte((byte) -2);
                }
              }
              stackIn_41_0 = 0;
              stackIn_41_1 = var11 & 2;
              if (stackIn_41_0 != stackIn_41_1) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$0 = var17.readByte((byte) -2);
                    var9[var13 * var5 + var12] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_48_0 = var10;
                    if (var14 == -1) {
                      stackIn_49_1 = 0;
                    } else {
                      stackIn_49_1 = 1;
                    }
                    var10 = stackIn_48_0 | stackIn_49_1;
                  }
                }
              }
            }
            pd.field_U[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("ve.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    final static pe a(int param0, CipherPacketBuffer param1) {
        int var8 = 0;
        pe stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        pe var6 = null;
        int var7 = 0;
        int var9 = 0;
        var9 = SteelSentinels.obfuscationControl;
        try {
          var3 = 110 / ((-37 - param0) / 57);
          var2_int = param1.readBits(-72, 8);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var4 = he.a(-1766, param1) ? 1 : 0;
          var5 = he.a(-1766, param1) ? 1 : 0;
          var6 = new pe();
          var6.field_L = (short)param1.readBits(71, 16);
          var6.field_z = s.a(var6.field_z, 16, param1, false);
          var6.field_m = s.a(var6.field_m, 16, param1, false);
          var6.field_C = s.a(var6.field_C, 16, param1, false);
          var6.field_w = (short)param1.readBits(95, 16);
          var6.field_G = s.a(var6.field_G, 16, param1, false);
          var6.field_j = s.a(var6.field_j, 16, param1, false);
          var6.field_x = s.a(var6.field_x, 16, param1, false);
          if (var4 != 0) {
            var6.field_u = (short)param1.readBits(-113, 16);
            var6.field_g = s.a(var6.field_g, 16, param1, false);
            var6.field_H = s.a(var6.field_H, 16, param1, false);
            var6.field_F = s.a(var6.field_F, 16, param1, false);
            var6.field_M = s.a(var6.field_M, 16, param1, false);
            var6.field_V = s.a(var6.field_V, 16, param1, false);
            var6.field_T = s.a(var6.field_T, 16, param1, false);
          }
          if (var5 != 0) {
            param1.readBits(-113, 16);
            var6.field_y = s.a(var6.field_y, 16, param1, false);
            var6.field_i = s.a(var6.field_i, 16, param1, false);
            var6.field_E = s.a(var6.field_E, 16, param1, false);
            var6.field_k = s.a(var6.field_k, 16, param1, false);
            var6.field_Y = s.a(var6.field_Y, 16, param1, false);
          }
          if (he.a(-1766, param1)) {
            var6.field_e = s.a(var6.field_e, 16, param1, false);
          }
          if (he.a(-1766, param1)) {
            var6.field_P = ec.a(16, param1, var6.field_P, -13035);
            var7 = 0;
            for (var8 = 0; var6.field_P.length > var8; var8++) {
              if ((var6.field_P[var8] & 255) > var7) {
                var7 = var6.field_P[var8] & 255;
              }
            }
            if (var7 != 0) {
              var6.field_K = (byte)(1 + var7);
            } else {
              var6.field_P = null;
            }
          }
          stackIn_25_0 = var6;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("ve.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (0 > param1 ||
          param1 >= 65536) {
          var2 += 16;
          param1 = param1 >>> 16;
        }
        if (param1 >= 256) {
          param1 = param1 >>> 8;
          var2 += 8;
        }
        if (param1 >= 16) {
          var2 += 4;
          param1 = param1 >>> 4;
        }
        if (param0 > -75) {
          return 61;
        }
        if (param1 >= 4) {
          param1 = param1 >>> 2;
          var2 += 2;
        }
        if (param1 >= 1) {
          var2++;
          param1 = param1 >>> 1;
        }
        return var2 + param1;
    }

    static {
        field_a = null;
    }
}
