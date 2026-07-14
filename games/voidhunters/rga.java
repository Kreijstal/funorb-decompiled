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
        byte[] var29 = null;
        byte[] var26 = null;
        byte[] var23 = null;
        byte[] var20 = null;
        byte[] var19 = null;
        byte[] var3 = null;
        byte[] var30 = null;
        byte[] var27 = null;
        byte[] var24 = null;
        byte[] var21 = null;
        byte[] var18 = null;
        byte[] var31 = null;
        byte[] var28 = null;
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
        int var17 = VoidHunters.field_G;
        int var2 = 59 % ((param0 - -26) / 42);
        if (!(((rga) this).field_e != null)) {
            if (ti.field_c == null) {
                var29 = dbb.a(4.0f, 0.6000000238418579f, (byte) 97, 8, (vjb) (Object) new ko(419684), 16, 128, 128, 0.5f, 4.0f, 16.0f);
                var26 = var29;
                var23 = var26;
                var20 = var23;
                var19 = var20;
                var3 = var19;
                ti.field_c = gfb.a(false, var29, -12445);
            }
            var30 = ffb.a(false, ti.field_c, true);
            var27 = var30;
            var24 = var27;
            var21 = var24;
            var18 = var21;
            var3 = var18;
            var31 = new byte[var30.length * 4];
            var28 = var31;
            var25 = var28;
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
                        var5++;
                        var4[var5] = (byte)(int)(127.0f + var15 * var16);
                        var5++;
                        var4[var5] = (byte)(int)(var16 * 128.0f + 127.0f);
                        var5++;
                        var4[var5] = (byte)(int)(var16 * var14 + 127.0f);
                        var5++;
                        var7++;
                        var4[var5] = var3[var7];
                    }
                }
            }
            ((rga) this).field_e = ((rga) this).field_h.a(128, 16, var31, qua.field_d, 128, -16539);
        }
        return null != ((rga) this).field_e ? true : false;
    }

    public static void a(byte param0) {
        field_f = null;
        field_g = null;
        if (param0 <= 20) {
            field_g = null;
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var2 = -51 % ((param0 - -8) / 49);
          if (((rga) this).field_b) {
            if (null == ((rga) this).field_d) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            }
          } else {
            if (null == ((rga) this).field_a) {
              stackOut_3_0 = 0;
              stackIn_7_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_7_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    rga(pf param0) {
        int var2 = 0;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        L0: {
          ((rga) this).field_e = null;
          ((rga) this).field_c = null;
          ((rga) this).field_a = null;
          ((rga) this).field_d = null;
          ((rga) this).field_h = param0;
          ((rga) this).field_b = ((rga) this).field_h.field_uc;
          if (!((rga) this).field_b) {
            break L0;
          } else {
            if (((rga) this).field_h.a(mj.field_f, wh.field_o, -92)) {
              break L0;
            } else {
              ((rga) this).field_b = false;
              break L0;
            }
          }
        }
        L1: {
          if (((rga) this).field_b) {
            break L1;
          } else {
            if (((rga) this).field_h.a(-10, wh.field_o, mj.field_f)) {
              break L1;
            } else {
            }
          }
        }
        L2: {
          mta.c((byte) 111);
          if (((rga) this).field_b) {
            var17 = ffb.a(false, dv.field_b, true);
            ((rga) this).field_d = ((rga) this).field_h.a(128, 16, var17, wh.field_o, 128, -16539);
            var18 = ffb.a(false, wpa.field_q, true);
            gf discarded$1 = ((rga) this).field_h.a(128, 16, var18, wh.field_o, 128, -16539);
            break L2;
          } else {
            ((rga) this).field_a = new eb[16];
            var2 = 0;
            L3: while (true) {
              if (-17 >= (var2 ^ -1)) {
                ((rga) this).field_c = new eb[16];
                var2 = 0;
                L4: while (true) {
                  if (-17 >= (var2 ^ -1)) {
                    break L2;
                  } else {
                    var16 = ppb.a(wpa.field_q, 32768 * var2, true, 32768);
                    ((rga) this).field_c[var2] = ((rga) this).field_h.a(128, wh.field_o, 0, 128, true, var16);
                    var2++;
                    continue L4;
                  }
                }
              } else {
                var15 = ppb.a(dv.field_b, var2 * 32768, true, 32768);
                ((rga) this).field_a[var2] = ((rga) this).field_h.a(128, wh.field_o, 0, 128, true, var15);
                var2++;
                continue L3;
              }
            }
          }
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        if (param2) {
            return;
        }
        Object var4 = null;
        vt.a(param0, -90, param1, (String) null);
    }

    static {
    }
}
