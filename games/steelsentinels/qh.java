/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qh extends SceneWidget {
    static boolean field_Wb;
    static String field_Vb;
    SceneWidget field_Tb;
    static int field_Yb;
    static ak field_Xb;
    private SceneWidget field_Sb;
    static String field_Ub;

    final static int d(byte param0) {
        try {
          int stackIn_12_0 = 0;
          int stackIn_26_0 = 0;
          int stackIn_29_0 = 0;
          int stackIn_34_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (ne.field_N.field_f >= 4) {
            if (ne.field_N.field_t == -1) {
              return 3;
            }
            if (ne.field_N.field_t != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (wh.field_d == 0) {
              ha.field_T = km.field_k.a(rl.field_f, ih.field_n, 376255344);
              wh.field_d = wh.field_d + 1;
            }
            if (1 == wh.field_d) {
              if (ha.field_T.field_a == 2) {
                stackIn_12_0 = gf.a(-1, 16777215);
                return stackIn_12_0;
              }
              if (ha.field_T.field_a == 1) {
                wh.field_d = wh.field_d + 1;
              }
            }
            if (2 == wh.field_d) {
              nf.field_c = new sg((java.net.Socket) (ha.field_T.field_c), km.field_k);
              var2 = new PacketBuffer(13);
              s.a(var2, 12, jf.field_ib, rb.field_f, sh.field_a);
              var2.a((byte) 120, 15);
              var2.b(true, wn.field_g);
              nf.field_c.a(13, var2.payload, -100, 0);
              wh.field_d = wh.field_d + 1;
              na.field_f = 30000L + mm.a(-57);
            }
            if (param0 > -65) {
              field_Wb = false;
            }
            if (wh.field_d == 3) {
              if (nf.field_c.a(-124) > 0) {
                var1_int = nf.field_c.b((byte) -94);
                if (0 != var1_int) {
                  stackIn_29_0 = gf.a(var1_int, 16777215);
                  return stackIn_29_0;
                }
                wh.field_d = wh.field_d + 1;
              } else {
                if (na.field_f < mm.a(40)) {
                  stackIn_26_0 = gf.a(-2, 16777215);
                  return stackIn_26_0;
                }
              }
            }
            if (wh.field_d != 4) {
              return -1;
            }
            ne.field_N.a(nf.field_c, fk.field_h, 6);
            wh.field_d = 0;
            ha.field_T = null;
            nf.field_c = null;
            stackIn_34_0 = 0;
            return stackIn_34_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return gf.a(-3, 16777215);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = SteelSentinels.obfuscationControl;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (dn.a(param1, -91)) {
            return true;
          }
          var2 = cd.field_b;
          var3 = 0;
          if (param0 != -30) {
            qh.a((byte) -42, 'A');
          }
          while (var3 < var2.length) {
            var4 = var2[var3];
            if (~param1 == ~var4) {
              return true;
            }
            var3++;
          }
          var2Lifetime1 = ua.field_H;
          for (var3Lifetime1 = 0; var2Lifetime1.length > var3Lifetime1; var3Lifetime1++) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (param1 == var4Lifetime1) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "qh.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        var4 = -param0;
        var5 = -param0;
        if (null != this.field_Sb) {
          var4 = this.field_Sb.g(-2147483648);
        }
        if (null != this.field_Tb) {
          var5 = this.field_Tb.b(-113, -param1 - param0 + (-var4 - param1 + this.field_zb));
        }
        var6 = param1 + (param1 + var4 - (-param0 - var5));
        if (this.field_zb < var6) {
          var5 = var5 + (-var6 + this.field_zb);
          var6 = this.field_zb;
        }
        if (this.field_Kb == 1) {
          param1 = param1 + (this.field_zb - var6) / 2;
        }
        if (2 == this.field_Kb) {
          param1 = param1 + (this.field_zb - var6);
        }
        if (this.field_Sb != null) {
          this.field_Sb.a(0, 0, this.field_Lb, param1, var4);
          this.field_Sb.field_Fb = this.field_Fb;
        }
        if (null != this.field_Tb) {
          this.field_Tb.a(0, 0, this.field_Lb, param1 + var4 + param0, var5);
          if (this.field_Sb == null) {
            this.field_Tb.field_Kb = this.field_Kb;
          } else {
            this.field_Tb.field_Kb = 0;
          }
          this.field_Tb.field_Fb = this.field_Fb;
        }
        var7 = -115 % ((param2 + 45) / 46);
    }

    final int a(byte param0, int param1, int param2) {
        int var4 = -param1;
        if (param0 < 126) {
          return 116;
        }
        int var5 = -param1;
        if (this.field_Sb != null) {
          var4 = this.field_Sb.g(-2147483648);
        }
        if (this.field_Tb != null) {
          var5 = this.field_Tb.g(-2147483648);
        }
        return var5 + param2 + var4 - (-param1 - param2);
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var28Lifetime1;
        int var29Lifetime1;
        int var30Lifetime1;
        int var31Lifetime1;
        var32 = SteelSentinels.obfuscationControl;
        try {
          if (SoftwareRaster.field_g.length < 307200) {
            return;
          }
          var5_int = param3;
          var6 = param1;
          if (1000 > param0) {
            param0 = 1000;
          }
          var7 = param4 * param4;
          var8 = var5_int - param4 >> 4;
          var9 = param2 + var5_int >> 4;
          var10 = var5_int + param4 + 15 >> 4;
          var11 = -param4 + var6 >> 4;
          var12 = var6 + 15 >> 4;
          if (var10 > 640) {
            var10 = 640;
          }
          if (var8 < 0) {
            var8 = 0;
          }
          var13 = 15 + param4 + var6 >> 4;
          if (var11 < 0) {
            var11 = 0;
          }
          if (var13 > 480) {
            var13 = 480;
          }
          if (var9 < 0) {
            var9 = 0;
          }
          if (640 < var9) {
            var9 = 640;
          }
          if (var12 < 0) {
            var12 = 0;
          }
          if (var12 > 480) {
            var12 = 480;
          }
          var14 = (var9 << 4) - var5_int;
          var14 = var14 * var14;
          var15 = -var5_int + (1 + var9 << 4);
          var15 = var15 * var15;
          var16 = (var9 + 2 << 4) - var5_int;
          var16 = var16 * var16;
          var17 = var15 - var14;
          var18 = -var15 + var16;
          var19 = var18 - var17;
          var20 = -var6 + (var12 << 4);
          var20 = var20 * var20;
          var21 = (1 + var12 << 4) - var6;
          var21 = var21 * var21;
          var22 = -var6 + (2 + var12 << 4);
          var22 = var22 * var22;
          var23 = -var20 + var21;
          var24 = var22 - var21;
          var25 = var24 - var23;
          var26 = 16;
          var27 = var7;
          while (var7 > 2147483647 >>> var26) {
            var26--;
            var27 = var27 + 1 >>> 1;
          }
          var28 = var12 * 640 + var9;
          var29 = var14 + var20;
          var30 = var23;
          for (var31 = var12; var31 < var13; var31++) {
            ig.a((byte) -88, var26, var31, var27, var9, param0, var8, var17, var6, var7, var10, var5_int, var19, var29, var28);
            var29 = var29 + var30;
            var28 += 640;
            var30 = var30 + var25;
          }
          var28Lifetime1 = 640 * var12 + var9;
          var30Lifetime1 = var23;
          var29Lifetime1 = var20 + var14;
          for (var31Lifetime1 = var12 - 1; var11 <= var31Lifetime1; var31Lifetime1--) {
            var30Lifetime1 = var30Lifetime1 - var25;
            var29Lifetime1 = var29Lifetime1 - var30Lifetime1;
            var28Lifetime1 -= 640;
            Projectile.a(var31Lifetime1, var29Lifetime1, var17, var19, var26, var7, var27, var8, var9, var10, param0, var28Lifetime1, var5_int, var6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5), "qh.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        this.a(0, param5, param0, param3, param1);
        this.a(param4, param2, -96);
        if (param6 < 120) {
          field_Yb = 4;
        }
    }

    qh(long param0, SceneWidget param1, SceneWidget param2, SceneWidget param3, RgbSprite param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 != null) {
            this.field_Sb = new SceneWidget(0L, param2);
            this.field_Sb.field_Pb = param4;
            this.a(this.field_Sb, 119);
          }
          if (param5 != null) {
            this.field_Tb = new SceneWidget(0L, param3, param5);
            this.a(this.field_Tb, 119);
            this.h(99);
          } else {
            this.h(99);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("qh.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static String k(int param0) {
        if (param0 != 8347) {
          qh.j(-70);
        }
        return rf.field_d.h(param0 ^ 8346);
    }

    public static void j(int param0) {
        field_Ub = null;
        field_Vb = null;
        if (param0 != 15) {
          qh.a((byte) -26, 'ﾳ');
        }
        field_Xb = null;
    }

    static {
        field_Wb = true;
        field_Vb = "This game is full.";
        field_Ub = "ESC - cancel private message";
    }
}
