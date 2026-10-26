/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class gg {
    int field_f;
    static String field_i;
    private int field_b;
    private int field_c;
    static PcmSample field_a;
    private int field_g;
    private short[] field_h;
    private short[] field_d;
    private int field_e;

    abstract void a(int param0, int param1, byte param2);

    private final void a(byte param0) {
        Random var2;
        int var3;
        int var4;
        int var5;
        int var6;
        Random var7;
        int var3Lifetime1;
        int var4Lifetime1;
        var7 = new Random((long)this.field_c);
        var2 = var7;
        var3 = -35 / ((param0 + 73) / 50);
        for (var4 = 0; var4 < 255; var4++) {
          this.field_d[var4] = (short)var4;
        }
        for (var3Lifetime1 = 0; 255 > var3Lifetime1; var3Lifetime1++) {
          var4Lifetime1 = 255 - var3Lifetime1;
          var5 = bs.a(-1, var7, var4Lifetime1);
          var6 = this.field_d[var5];
          this.field_d[var5] = this.field_d[var4Lifetime1];
          this.field_d[256 + var4Lifetime1] = (short) var6;
          this.field_d[var4Lifetime1] = (short) var6;
        }
    }

    final static byte[] a(int param0, int param1, float param2, ai param3, int param4, int param5, float param6, float param7, float param8, int param9, float param10) {
        byte[] var11 = null;
        RuntimeException var11_ref = null;
        byte[] var12 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var12 = new byte[param4 * param5 * param9];
          var11 = var12;
          if (param1 > -63) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          fr.a(param7, param6, 0, param8, param2, param9, var12, param4, param5, param10, param0, 0, param3);
          stackIn_4_0 = var12;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11_ref = decompiledCaughtException;
          stackIn_7_0 = var11_ref;
          stackIn_7_1 = new StringBuilder().append("gg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    abstract void c(int param0);

    final static SoundPlayback a(PcmSample param0, int param1, int param2) {
        RuntimeException var3 = null;
        SoundPlayback stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -27227) {
            field_a = (PcmSample) null;
          }
          stackIn_3_0 = jo.a(param0, param1, (byte) -33);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gg.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        nf.field_a = false;
        if (param0 != -98) {
          ai var2 = (ai) null;
          gg.a(121, 109, 0.5157560110092163f, (ai) null, 51, 109, -0.17956805229187012f, 1.0828834772109985f, -1.4294534921646118f, 111, 0.21281719207763672f);
        }
        ss.field_t = false;
        oi.a(-1, 20665);
        nb.field_c = dk.field_h;
        ht.field_k = dk.field_h;
    }

    public static void a(boolean param0) {
        if (!param0) {
          ai var2 = (ai) null;
          gg.a(-90, 43, 0.35438913106918335f, (ai) null, 65, -70, 1.1266902685165405f, -1.0076642036437988f, -1.1031489372253418f, -37, 0.5276761054992676f);
        }
        field_a = null;
        field_i = null;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var37 = 0;
        int var36 = 0;
        int var35 = 0;
        int var38 = 0;
        int var9 = 0;
        int var7 = 0;
        int var10 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var22 = 0;
        int var21 = 0;
        int var17 = 0;
        int var20 = 0;
        int var23 = 0;
        int var24 = 0;
        int var18 = 0;
        int var19 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var25 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var42 = 0;
        int var29Lifetime1;
        int var29Lifetime2;
        int var29Lifetime3;
        int var30Lifetime1;
        int var30Lifetime2;
        int var30Lifetime3;
        int var31Lifetime1;
        int var32Lifetime1;
        int var42Lifetime1;
        int var42Lifetime2;
        int var42Lifetime3;
        if (!param0) {
          gg.a(false);
        }
        int[] var47 = new int[param2];
        int[] var44 = var47;
        int[] var39 = var44;
        int[] var48 = new int[param3];
        int[] var45 = var48;
        int[] var40 = var45;
        for (var42 = 0; param2 > var42; var42++) {
          var39[var42] = (var42 << 12) / param2;
        }
        int[] var46 = new int[param1];
        int[] var43 = var46;
        int[] var41 = var43;
        for (var42Lifetime1 = 0; param3 > var42Lifetime1; var42Lifetime1++) {
          var40[var42Lifetime1] = (var42Lifetime1 << 12) / param3;
        }
        for (var42Lifetime2 = 0; param1 > var42Lifetime2; var42Lifetime2++) {
          var41[var42Lifetime2] = (var42Lifetime2 << 12) / param1;
        }
        this.c(-30042);
        for (var37 = 0; var37 < param1; var37++) {
          for (var36 = 0; param3 > var36; var36++) {
            for (var35 = 0; param2 > var35; var35++) {
              for (var38 = 0; this.field_f > var38; var38++) {
                var42Lifetime3 = this.field_h[var38] << 12;
                var9 = this.field_e * var42Lifetime3 >> 12;
                var7 = var42Lifetime3 * var46[var37] >> 12;
                var10 = this.field_g * var42Lifetime3 >> 12;
                var5 = var42Lifetime3 * var47[var35] >> 12;
                var6 = var42Lifetime3 * var48[var36] >> 12;
                var8 = var42Lifetime3 * this.field_b >> 12;
                var6 = var6 * this.field_e;
                var7 = var7 * this.field_g;
                var5 = var5 * this.field_b;
                var11 = var5 >> 12;
                var12 = var11 + 1;
                var11 = var11 & 255;
                var13 = var6 >> 12;
                var14 = 1 + var13;
                var13 = var13 & 255;
                var15 = var7 >> 12;
                var16 = var15 + 1;
                if (var16 < var10) {
                  var16 = var16 & 255;
                } else {
                  var16 = 0;
                }
                if (var8 > var12) {
                  var12 = var12 & 255;
                } else {
                  var12 = 0;
                }
                var6 = var6 & 4095;
                var15 = var15 & 255;
                if (var14 < var9) {
                  var14 = var14 & 255;
                } else {
                  var14 = 0;
                }
                var5 = var5 & 4095;
                var7 = var7 & 4095;
                var22 = var7 - 4096;
                var21 = -4096 + var6;
                var17 = ua.field_h[var5];
                var20 = -4096 + var5;
                var23 = this.field_d[var15];
                var24 = this.field_d[var16];
                var18 = ua.field_h[var6];
                var19 = ua.field_h[var7];
                var26 = this.field_d[var23 + var14];
                var27 = this.field_d[var24 + var13];
                var28 = this.field_d[var14 + var24];
                var25 = this.field_d[var23 + var13];
                var29 = mq.a((byte) -128, var5, var7, (int) this.field_d[var25 + var11], var6);
                var30 = mq.a((byte) -125, var20, var7, (int) this.field_d[var12 + var25], var6);
                var31 = var29 + (var17 * (-var29 + var30) >> 12);
                var29Lifetime1 = mq.a((byte) -84, var5, var7, (int) this.field_d[var26 + var11], var21);
                var30Lifetime1 = mq.a((byte) -109, var20, var7, (int) this.field_d[var26 + var12], var21);
                var32 = ((-var29Lifetime1 + var30Lifetime1) * var17 >> 12) + var29Lifetime1;
                var33 = var31 + (var18 * (var32 - var31) >> 12);
                var29Lifetime2 = mq.a((byte) 78, var5, var22, (int) this.field_d[var27 + var11], var6);
                var30Lifetime2 = mq.a((byte) -62, var20, var22, (int) this.field_d[var12 + var27], var6);
                var31Lifetime1 = var29Lifetime2 + ((var30Lifetime2 - var29Lifetime2) * var17 >> 12);
                var29Lifetime3 = mq.a((byte) 110, var5, var22, (int) this.field_d[var11 + var28], var21);
                var30Lifetime3 = mq.a((byte) 108, var20, var22, (int) this.field_d[var12 + var28], var21);
                var32Lifetime1 = ((var30Lifetime3 - var29Lifetime3) * var17 >> 12) + var29Lifetime3;
                var34 = var31Lifetime1 + (var18 * (var32Lifetime1 - var31Lifetime1) >> 12);
                this.a(var38, var33 + (var19 * (-var33 + var34) >> 12), (byte) 119);
              }
              this.a(0);
            }
          }
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        this.field_h = new short[this.field_f];
        int var3 = 61 / ((param0 + 67) / 53);
        for (var2 = 0; this.field_f > var2; var2++) {
          this.field_h[var2] = (short)(int)Math.pow(2.0, (double)var2);
        }
    }

    abstract void a(int param0);

    gg(int param0, int param1, int param2, int param3, int param4) {
        this.field_f = 4;
        this.field_g = 4;
        this.field_c = 0;
        this.field_d = new short[512];
        this.field_e = 4;
        this.field_b = 4;
        this.field_c = param0;
        this.field_b = param2;
        this.field_f = param1;
        this.field_e = param3;
        this.field_g = param4;
        this.b(48);
        this.a((byte) 96);
    }

    static {
        field_i = "You are not currently logged in to the<nbsp>game.";
    }
}
