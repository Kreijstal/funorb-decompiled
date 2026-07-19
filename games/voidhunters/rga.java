/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rga {
    gf field_e;
    static soa field_f;
    private eb[] field_c;
    static llb field_g;
    private pf field_h;
    eb[] field_a;
    boolean field_b;
    gf field_d;

    final boolean b(byte param0) {
        byte[] var23 = null;
        byte[] var20 = null;
        byte[] var19 = null;
        byte[] var24 = null;
        byte[] var21 = null;
        byte[] var18 = null;
        byte[] var25 = null;
        byte[] var22 = null;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        byte[] var3 = null;
        int var17 = VoidHunters.field_G;
        int var2 = 59 % ((param0 - -26) / 42);
        if (!(this.field_e != null)) {
            if (ti.field_c == null) {
                var23 = dbb.a(4.0f, 0.6000000238418579f, (byte) 97, 8, new ko(419684), 16, 128, 128, 0.5f, 4.0f, 16.0f);
                var20 = var23;
                var19 = var20;
                var3 = var19;
                ti.field_c = gfb.a(false, var23, -12445);
            }
            var24 = ffb.a(false, ti.field_c, true);
            var21 = var24;
            var18 = var21;
            var3 = var18;
            var25 = new byte[var24.length * 4];
            var22 = var25;
            var4 = var22;
            var5 = 0;
            for (var6 = 0; 16 > var6; var6++) {
                var7 = 16384 * var6;
                var8 = var7;
                for (var9 = 0; (var9 ^ -1) > -129; var9++) {
                    var10 = 128 * var9 + var8;
                    var11 = var8 + 128 * (var9 + -1 & 127);
                    var12 = 128 * (127 & 1 + var9) + var8;
                    for (var13 = 0; 128 > var13; var13++) {
                        var14 = (float)((255 & var3[var11 + var13]) + -(255 & var3[var13 + var12]));
                        var15 = (float)((255 & var3[(-1 + var13 & 127) + var10]) + -(var3[(127 & var13 + 1) + var10] & 255));
                        var16 = (float)(128.0 / Math.sqrt((double)(16384.0f + var15 * var15 + var14 * var14)));
                        incrementValue$0 = var5;
                        var5++;
                        var4[incrementValue$0] = (byte)(int)(127.0f + var15 * var16);
                        incrementValue$1 = var5;
                        var5++;
                        var4[incrementValue$1] = (byte)(int)(var16 * 128.0f + 127.0f);
                        incrementValue$2 = var5;
                        var5++;
                        var4[incrementValue$2] = (byte)(int)(var16 * var14 + 127.0f);
                        incrementValue$3 = var5;
                        var5++;
                        incrementValue$4 = var7;
                        var7++;
                        var4[incrementValue$3] = var3[incrementValue$4];
                    }
                }
            }
            this.field_e = this.field_h.a(128, 16, var25, qua.field_d, 128, -16539);
        }
        return null != this.field_e ? true : false;
    }

    public static void a(byte param0) {
        field_f = null;
        field_g = null;
        if (param0 <= 20) {
            field_g = (llb) null;
        }
    }

    final boolean c(byte param0) {
        int var2 = -51 % ((param0 - -8) / 49);
        return !this.field_b ? null != this.field_a ? true : false : null != this.field_d ? true : false;
    }

    rga(pf param0) {
        gf discarded$1 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        this.field_e = null;
        this.field_c = null;
        this.field_a = null;
        this.field_d = null;
        try {
          L0: {
            L1: {
              this.field_h = param0;
              this.field_b = this.field_h.field_uc;
              if (!this.field_b) {
                break L1;
              } else {
                if (this.field_h.a(mj.field_f, wh.field_o, -92)) {
                  break L1;
                } else {
                  this.field_b = false;
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_b) {
                break L2;
              } else {
                if (!this.field_h.a(-10, wh.field_o, mj.field_f)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              mta.c((byte) 111);
              if (this.field_b) {
                var17 = ffb.a(false, dv.field_b, true);
                this.field_d = this.field_h.a(128, 16, var17, wh.field_o, 128, -16539);
                var18 = ffb.a(false, wpa.field_q, true);
                discarded$1 = this.field_h.a(128, 16, var18, wh.field_o, 128, -16539);
                break L3;
              } else {
                this.field_a = new eb[16];
                var2_int = 0;
                L4: while (true) {
                  if (-17 >= (var2_int ^ -1)) {
                    this.field_c = new eb[16];
                    var2_int = 0;
                    L5: while (true) {
                      if (-17 >= (var2_int ^ -1)) {
                        break L3;
                      } else {
                        var16 = ppb.a(wpa.field_q, 32768 * var2_int, true, 32768);
                        this.field_c[var2_int] = this.field_h.a(128, wh.field_o, 0, 128, true, var16);
                        var2_int++;
                        continue L5;
                      }
                    }
                  } else {
                    var15 = ppb.a(dv.field_b, var2_int * 32768, true, 32768);
                    this.field_a[var2_int] = this.field_h.a(128, wh.field_o, 0, 128, true, var15);
                    var2_int++;
                    continue L4;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var2);
            stackOut_17_1 = new StringBuilder().append("rga.<init>(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        if (param2) {
            return;
        }
        String var4 = (String) null;
        vt.a(param0, -90, param1, (String) null);
    }

    static {
    }
}
