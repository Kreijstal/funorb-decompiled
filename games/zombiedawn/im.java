/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class im {
    private int field_f;
    static int field_d;
    private int field_a;
    int field_g;
    private int field_b;
    private short[] field_c;
    private short[] field_e;

    private final void a(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = ZombieDawn.field_J;
        Random var2 = new Random((long)((im) this).field_b);
        for (var3 = 0; var3 < 255; var3++) {
            ((im) this).field_e[var3] = (short)var3;
        }
        for (var3 = 0; var3 < 255; var3++) {
            var4 = -var3 + 255;
            var5 = pb.a(var2, var4, 1);
            var6 = ((im) this).field_e[var5];
            ((im) this).field_e[var5] = ((im) this).field_e[var4];
            ((im) this).field_e[var4 + 256] = (short) var6;
            ((im) this).field_e[var4] = (short) var6;
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(boolean param0);

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = ZombieDawn.field_J;
        ((im) this).field_c = new short[((im) this).field_g];
        for (var2 = 0; ((im) this).field_g > var2; var2++) {
            ((im) this).field_c[var2] = (short)(int)Math.pow(2.0, (double)var2);
        }
    }

    final static void a(le param0, int param1, le param2) {
        if (param1 != -30395) {
            return;
        }
        try {
            if (!(param0.field_d == null)) {
                param0.b(-27598);
            }
            param0.field_b = param2.field_b;
            param0.field_d = param2;
            param0.field_d.field_b = param0;
            param0.field_b.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "im.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
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
        int[] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int var28 = 0;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        var28 = ZombieDawn.field_J;
        var36 = new int[param0];
        var34 = var36;
        var32 = var34;
        var30 = var32;
        var25 = var30;
        var27 = 0;
        L0: while (true) {
          if (var27 >= param0) {
            var35 = new int[param1];
            var33 = var35;
            var31 = var33;
            var29 = var31;
            var26 = var29;
            var27 = 0;
            L1: while (true) {
              if (param1 <= var27) {
                ((im) this).a(false);
                if (param2 == -9394) {
                  var23 = 0;
                  L2: while (true) {
                    if (param1 <= var23) {
                      return;
                    } else {
                      var22 = 0;
                      L3: while (true) {
                        if (param0 <= var22) {
                          var23++;
                          continue L2;
                        } else {
                          var24 = 0;
                          L4: while (true) {
                            if (((im) this).field_g <= var24) {
                              ((im) this).a((byte) 44);
                              var22++;
                              continue L3;
                            } else {
                              L5: {
                                var27 = ((im) this).field_c[var24] << 12;
                                var5 = var35[var23] * var27 >> 12;
                                var6 = var27 * ((im) this).field_a >> 12;
                                var7 = ((im) this).field_f * var27 >> 12;
                                var4 = var27 * var36[var22] >> 12;
                                var5 = var5 * ((im) this).field_f;
                                var4 = var4 * ((im) this).field_a;
                                var8 = var4 >> 12;
                                var9 = var8 - -1;
                                var10 = var5 >> 12;
                                var8 = var8 & 255;
                                var11 = var10 - -1;
                                var5 = var5 & 4095;
                                if (var9 < var6) {
                                  var9 = var9 & 255;
                                  break L5;
                                } else {
                                  var9 = 0;
                                  break L5;
                                }
                              }
                              L6: {
                                var10 = var10 & 255;
                                if (var11 >= var7) {
                                  var11 = 0;
                                  break L6;
                                } else {
                                  var11 = var11 & 255;
                                  break L6;
                                }
                              }
                              var4 = var4 & 4095;
                              var16 = ((im) this).field_e[var10];
                              var12 = a.field_f[var4];
                              var14 = var4 - 4096;
                              var15 = var5 + -4096;
                              var13 = a.field_f[var5];
                              var17 = ((im) this).field_e[var11];
                              var18 = je.a((int) ((im) this).field_e[var16 + var8], var4, false, var5);
                              var19 = je.a((int) ((im) this).field_e[var16 + var9], var14, false, var5);
                              var20 = (var12 * (var19 - var18) >> 12) + var18;
                              var18 = je.a((int) ((im) this).field_e[var17 + var8], var4, false, var15);
                              var19 = je.a((int) ((im) this).field_e[var9 - -var17], var14, false, var15);
                              var21 = ((-var18 + var19) * var12 >> 12) + var18;
                              ((im) this).a(var24, var20 - -((var21 - var20) * var13 >> 12), -25466);
                              var24++;
                              continue L4;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                var26[var27] = (var27 << 12) / param1;
                var27++;
                continue L1;
              }
            }
          } else {
            var25[var27] = (var27 << 12) / param0;
            var27++;
            continue L0;
          }
        }
    }

    abstract void a(byte param0);

    im(int param0, int param1, int param2, int param3, int param4) {
        ((im) this).field_a = 4;
        ((im) this).field_g = 4;
        ((im) this).field_b = 0;
        ((im) this).field_f = 4;
        ((im) this).field_e = new short[512];
        ((im) this).field_a = param2;
        ((im) this).field_b = param0;
        ((im) this).field_f = param3;
        ((im) this).field_g = param1;
        this.b(true);
        this.a(255);
    }

    static {
    }
}
