/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    static String[] field_c;
    private qi[] field_h;
    static int[] field_b;
    static int field_d;
    boolean field_e;
    bp field_f;
    bp field_a;
    private bf field_g;
    qi[] field_i;

    final boolean a(int param0) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        byte[] var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        int var16 = 0;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          var16 = AceOfSkies.field_G ? 1 : 0;
          if (null == this.field_a) {
            L1: {
              if (bm.field_C == null) {
                var22 = gg.a(8, -117, 16.0f, new ol(419684), 128, 128, 4.0f, 4.0f, 0.5f, 16, 0.6000000238418579f);
                var19 = var22;
                var18 = var19;
                var2 = var18;
                bm.field_C = sf.a(false, -137, var22);
                break L1;
              } else {
                break L1;
              }
            }
            var23 = rb.a(false, bm.field_C, -76);
            var20 = var23;
            var17 = var20;
            var2 = var17;
            var24 = new byte[4 * var23.length];
            var21 = var24;
            var3 = var21;
            var4 = 0;
            var5 = 0;
            L2: while (true) {
              if ((var5 ^ -1) <= -17) {
                this.field_a = this.field_g.a(128, param0 ^ -96, 128, lc.field_g, 16, var24);
                break L0;
              } else {
                var6 = var5 * 16384;
                var7 = var6;
                var8 = 0;
                L3: while (true) {
                  if ((var8 ^ -1) <= -129) {
                    var5++;
                    continue L2;
                  } else {
                    var9 = 128 * var8 + var7;
                    var10 = (var8 + -1 & 127) * 128 + var7;
                    var11 = (127 & 1 + var8) * 128 + var7;
                    var12 = 0;
                    L4: while (true) {
                      if (128 <= var12) {
                        var8++;
                        continue L3;
                      } else {
                        var13 = (float)(-(var2[var11 + var12] & 255) + (var2[var10 + var12] & 255));
                        var14 = (float)((255 & var2[var9 - -(127 & -1 + var12)]) - (255 & var2[(var12 - -1 & 127) + var9]));
                        var15 = (float)(128.0 / Math.sqrt((double)(var14 * var14 + 16384.0f + var13 * var13)));
                        incrementValue$5 = var4;
                        var4++;
                        var3[incrementValue$5] = (byte)(int)(127.0f + var14 * var15);
                        incrementValue$6 = var4;
                        var4++;
                        var3[incrementValue$6] = (byte)(int)(127.0f + 128.0f * var15);
                        incrementValue$7 = var4;
                        var4++;
                        var3[incrementValue$7] = (byte)(int)(var15 * var13 + 127.0f);
                        incrementValue$8 = var4;
                        var4++;
                        incrementValue$9 = var6;
                        var6++;
                        var3[incrementValue$8] = var2[incrementValue$9];
                        var12++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        L5: {
          if (param0 == 0) {
            break L5;
          } else {
            this.field_f = (bp) null;
            break L5;
          }
        }
        L6: {
          if (null == this.field_a) {
            stackOut_19_0 = 0;
            stackIn_20_0 = stackOut_19_0;
            break L6;
          } else {
            stackOut_18_0 = 1;
            stackIn_20_0 = stackOut_18_0;
            break L6;
          }
        }
        return stackIn_20_0 != 0;
    }

    final boolean b(boolean param0) {
        if (param0) {
            this.field_h = (qi[]) null;
        }
        return this.field_e ? this.field_f != null ? true : false : null != this.field_i ? true : false;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        if (!param0) {
            field_b = (int[]) null;
        }
    }

    em(bf param0) {
        bp discarded$1 = null;
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
        this.field_h = null;
        this.field_f = null;
        this.field_i = null;
        this.field_a = null;
        try {
          L0: {
            L1: {
              this.field_g = param0;
              this.field_e = this.field_g.field_J;
              if (!this.field_e) {
                break L1;
              } else {
                if (this.field_g.a((byte) -13, la.field_h, hh.field_c)) {
                  break L1;
                } else {
                  this.field_e = false;
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_e) {
                break L2;
              } else {
                if (!this.field_g.a(la.field_h, 0, hh.field_c)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              fd.a(-70);
              if (this.field_e) {
                var17 = rb.a(false, wl.field_r, 66);
                this.field_f = this.field_g.a(128, -123, 128, hh.field_c, 16, var17);
                var18 = rb.a(false, lg.field_l, 101);
                discarded$1 = this.field_g.a(128, -95, 128, hh.field_c, 16, var18);
                break L3;
              } else {
                this.field_i = new qi[16];
                var2_int = 0;
                L4: while (true) {
                  if (-17 >= (var2_int ^ -1)) {
                    this.field_h = new qi[16];
                    var2_int = 0;
                    L5: while (true) {
                      if (16 <= var2_int) {
                        break L3;
                      } else {
                        var16 = cs.a(false, 32768 * var2_int, 32768, lg.field_l);
                        this.field_h[var2_int] = this.field_g.a(var16, 128, true, 128, hh.field_c, true);
                        var2_int++;
                        continue L5;
                      }
                    }
                  } else {
                    var15 = cs.a(false, var2_int * 32768, 32768, wl.field_r);
                    this.field_i[var2_int] = this.field_g.a(var15, 128, true, 128, hh.field_c, true);
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
            stackOut_17_1 = new StringBuilder().append("em.<init>(");
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
          throw pn.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_d = 0;
        field_c = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
