/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class en {
    private int field_b;
    int field_g;
    static String field_h;
    private short[] field_c;
    private int field_e;
    private int field_i;
    private short[] field_f;
    static String field_d;
    static dk field_j;
    private int field_a;

    abstract void a(boolean param0);

    final void a(int param0, int param1, int param2, int param3) {
        int var37 = 0;
        int var36 = 0;
        int var35 = 0;
        int var38 = 0;
        int var6 = 0;
        int var8 = 0;
        int var5 = 0;
        int var7 = 0;
        int var10 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var21 = 0;
        int var22 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        int var23 = 0;
        int var19 = 0;
        int var24 = 0;
        int var27 = 0;
        int var25 = 0;
        int var28 = 0;
        int var26 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var42 = 0;
        int var43 = Sumoblitz.field_L ? 1 : 0;
        if (param1 != 206) {
            this.field_f = (short[]) null;
        }
        int[] var48 = new int[param3];
        int[] var45 = var48;
        int[] var39 = var45;
        int[] var47 = new int[param2];
        int[] var44 = var47;
        int[] var40 = var44;
        int[] var49 = new int[param0];
        int[] var46 = var49;
        int[] var41 = var46;
        for (var42 = 0; param3 > var42; var42++) {
            var39[var42] = (var42 << 1046741740) / param3;
        }
        for (var42 = 0; param2 > var42; var42++) {
            var40[var42] = (var42 << 788419340) / param2;
        }
        for (var42 = 0; param0 > var42; var42++) {
            var41[var42] = (var42 << -1138565684) / param0;
        }
        this.b(-21);
        for (var37 = 0; var37 < param0; var37++) {
            for (var36 = 0; param2 > var36; var36++) {
                for (var35 = 0; param3 > var35; var35++) {
                    for (var38 = 0; this.field_g > var38; var38++) {
                        var42 = this.field_c[var38] << -432518836;
                        var6 = var47[var36] * var42 >> -687124148;
                        var8 = this.field_a * var42 >> -1653163636;
                        var5 = var48[var35] * var42 >> -741393364;
                        var7 = var42 * var49[var37] >> -221290292;
                        var10 = this.field_i * var42 >> -1617825876;
                        var9 = this.field_b * var42 >> -497949972;
                        var7 = var7 * this.field_i;
                        var6 = var6 * this.field_b;
                        var5 = var5 * this.field_a;
                        var11 = var5 >> 1865365708;
                        var12 = 1 + var11;
                        var13 = var6 >> 244666284;
                        var11 = var11 & 255;
                        var14 = 1 + var13;
                        var13 = var13 & 255;
                        var15 = var7 >> -682112116;
                        var16 = var15 - -1;
                        if ((var16 ^ -1) > (var10 ^ -1)) {
                            var16 = var16 & 255;
                        } else {
                            var16 = 0;
                        }
                        if (var12 >= var8) {
                            var12 = 0;
                        } else {
                            var12 = var12 & 255;
                        }
                        if (var14 < var9) {
                            var14 = var14 & 255;
                        } else {
                            var14 = 0;
                        }
                        var6 = var6 & 4095;
                        var15 = var15 & 255;
                        var7 = var7 & 4095;
                        var5 = var5 & 4095;
                        var21 = var6 + -4096;
                        var22 = var7 - 4096;
                        var17 = mu.field_y[var5];
                        var18 = mu.field_y[var6];
                        var20 = var5 - 4096;
                        var23 = this.field_f[var15];
                        var19 = mu.field_y[var7];
                        var24 = this.field_f[var16];
                        var27 = this.field_f[var13 - -var24];
                        var25 = this.field_f[var23 + var13];
                        var28 = this.field_f[var24 + var14];
                        var26 = this.field_f[var14 + var23];
                        var29 = qf.a(var6, var7, 8, (int) this.field_f[var11 - -var25], var5);
                        var30 = qf.a(var6, var7, 8, (int) this.field_f[var12 + var25], var20);
                        var31 = var29 - -((-var29 + var30) * var17 >> 888512364);
                        var29 = qf.a(var21, var7, param1 + -198, (int) this.field_f[var11 + var26], var5);
                        var30 = qf.a(var21, var7, param1 ^ 198, (int) this.field_f[var26 + var12], var20);
                        var32 = var29 + (var17 * (var30 + -var29) >> 1021556812);
                        var33 = var31 - -(var18 * (var32 - var31) >> 989731244);
                        var29 = qf.a(var6, var22, param1 ^ 198, (int) this.field_f[var11 + var27], var5);
                        var30 = qf.a(var6, var22, 8, (int) this.field_f[var27 + var12], var20);
                        var31 = ((-var29 + var30) * var17 >> -1519766228) + var29;
                        var29 = qf.a(var21, var22, 8, (int) this.field_f[var28 + var11], var5);
                        var30 = qf.a(var21, var22, param1 ^ 198, (int) this.field_f[var28 + var12], var20);
                        var32 = ((-var29 + var30) * var17 >> 1290288876) + var29;
                        var34 = ((var32 - var31) * var18 >> -1309030932) + var31;
                        this.a(var38, param1 + 951, (var19 * (var34 + -var33) >> -625341588) + var33);
                    }
                    this.a(false);
                }
            }
        }
    }

    private final void c(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        Random var2 = new Random((long)this.field_e);
        for (var3 = 0; -256 < (var3 ^ -1); var3++) {
            this.field_f[var3] = (short)var3;
        }
        for (var3 = param0; var3 < 255; var3++) {
            var4 = 255 + -var3;
            var5 = fi.a(var4, var2, (byte) -96);
            var6 = this.field_f[var5];
            this.field_f[var5] = this.field_f[var4];
            this.field_f[var4 - -256] = (short) var6;
            this.field_f[var4] = (short) var6;
        }
    }

    final static void a(byte param0, int param1) {
        c.field_s = 3 & param1 >> -1189596572;
        if (!(c.field_s <= 2)) {
            c.field_s = 2;
        }
        if (param0 < 24) {
            en.b((byte) 45);
        }
        ew.field_f = (param1 & 15) >> -826959710;
        if (!(-3 <= (ew.field_f ^ -1))) {
            ew.field_f = 2;
        }
        rs.field_g = param1 & 3;
        if ((rs.field_g ^ -1) < -3) {
            rs.field_g = 2;
        }
    }

    abstract void b(int param0);

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == -23517) {
            break L0;
          } else {
            field_h = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (10 > jv.field_a) {
              break L2;
            } else {
              if (ms.field_a) {
                break L2;
              } else {
                if (nt.a((byte) 116)) {
                  break L2;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public static void b(byte param0) {
        field_d = null;
        field_j = null;
        if (param0 < 30) {
            return;
        }
        field_h = null;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        this.field_c = new short[this.field_g];
        for (var2 = 0; this.field_g > var2; var2++) {
            this.field_c[var2] = (short)(int)Math.pow(2.0, (double)var2);
        }
        if (param0 <= 43) {
            this.c(-19);
        }
    }

    abstract void a(int param0, int param1, int param2);

    en(int param0, int param1, int param2, int param3, int param4) {
        this.field_b = 4;
        this.field_e = 0;
        this.field_i = 4;
        this.field_f = new short[512];
        this.field_g = 4;
        this.field_a = 4;
        this.field_a = param2;
        this.field_b = param3;
        this.field_g = param1;
        this.field_i = param4;
        this.field_e = param0;
        this.a((byte) 99);
        this.c(0);
    }

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.name").toLowerCase();
        } catch (Exception exception) {
        }
        field_h = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
        }
        field_d = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "~/";
        try {
            var0 = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
        }
        File discarded$0 = new File(var0);
        field_j = new dk();
    }
}
