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
        byte[] var25 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          var16 = AceOfSkies.field_G ? 1 : 0;
          if (null == ((em) this).field_a) {
            L1: {
              if (bm.field_C == null) {
                var28 = gg.a(8, -117, 16.0f, (ai) (Object) new ol(419684), 128, 128, 4.0f, 4.0f, 0.5f, 16, 0.6000000238418579f);
                var25 = var28;
                var22 = var25;
                var19 = var22;
                var18 = var19;
                var2 = var18;
                bm.field_C = sf.a(false, -137, var28);
                break L1;
              } else {
                break L1;
              }
            }
            var29 = rb.a(false, bm.field_C, -76);
            var26 = var29;
            var23 = var26;
            var20 = var23;
            var17 = var20;
            var2 = var17;
            var30 = new byte[4 * var29.length];
            var27 = var30;
            var24 = var27;
            var21 = var24;
            var3 = var21;
            var4 = 0;
            var5 = 0;
            L2: while (true) {
              if (var5 >= 16) {
                ((em) this).field_a = ((em) this).field_g.a(128, param0 ^ -96, 128, lc.field_g, 16, var30);
                break L0;
              } else {
                var6 = var5 * 16384;
                var7 = var6;
                var8 = 0;
                L3: while (true) {
                  if (var8 >= 128) {
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
                        int incrementValue$5 = var4;
                        var4++;
                        var3[incrementValue$5] = (byte)(int)(127.0f + var14 * var15);
                        int incrementValue$6 = var4;
                        var4++;
                        var3[incrementValue$6] = (byte)(int)(127.0f + 128.0f * var15);
                        int incrementValue$7 = var4;
                        var4++;
                        var3[incrementValue$7] = (byte)(int)(var15 * var13 + 127.0f);
                        int incrementValue$8 = var4;
                        var4++;
                        int incrementValue$9 = var6;
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
            ((em) this).field_f = null;
            break L5;
          }
        }
        L6: {
          if (null == ((em) this).field_a) {
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
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            ((em) this).field_h = null;
            break L0;
          }
        }
        L1: {
          if (!((em) this).field_e) {
            if (null == ((em) this).field_i) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              stackOut_7_0 = 1;
              stackIn_9_0 = stackOut_7_0;
              break L1;
            }
          } else {
            if (((em) this).field_f == null) {
              stackOut_5_0 = 0;
              stackIn_9_0 = stackOut_5_0;
              break L1;
            } else {
              stackOut_4_0 = 1;
              stackIn_9_0 = stackOut_4_0;
              break L1;
            }
          }
        }
        return stackIn_9_0 != 0;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
    }

    em(bf param0) {
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        ((em) this).field_h = null;
        ((em) this).field_f = null;
        ((em) this).field_i = null;
        ((em) this).field_a = null;
        try {
          L0: {
            L1: {
              ((em) this).field_g = param0;
              ((em) this).field_e = ((em) this).field_g.field_J;
              if (!((em) this).field_e) {
                break L1;
              } else {
                if (((em) this).field_g.a((byte) -13, la.field_h, hh.field_c)) {
                  break L1;
                } else {
                  ((em) this).field_e = false;
                  break L1;
                }
              }
            }
            L2: {
              if (((em) this).field_e) {
                break L2;
              } else {
                if (!((em) this).field_g.a(la.field_h, 0, hh.field_c)) {
                  return;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              fd.a(-70);
              if (((em) this).field_e) {
                var17 = rb.a(false, wl.field_r, 66);
                ((em) this).field_f = ((em) this).field_g.a(128, -123, 128, hh.field_c, 16, var17);
                var18 = rb.a(false, lg.field_l, 101);
                bp discarded$1 = ((em) this).field_g.a(128, -95, 128, hh.field_c, 16, var18);
                break L3;
              } else {
                ((em) this).field_i = new qi[16];
                var2_int = 0;
                L4: while (true) {
                  if (var2_int >= 16) {
                    ((em) this).field_h = new qi[16];
                    var2_int = 0;
                    L5: while (true) {
                      if (16 <= var2_int) {
                        break L3;
                      } else {
                        var16 = cs.a(false, 32768 * var2_int, 32768, lg.field_l);
                        ((em) this).field_h[var2_int] = ((em) this).field_g.a(var16, 128, true, 128, hh.field_c, true);
                        var2_int++;
                        continue L5;
                      }
                    }
                  } else {
                    var15 = cs.a(false, var2_int * 32768, 32768, wl.field_r);
                    ((em) this).field_i[var2_int] = ((em) this).field_g.a(var15, 128, true, 128, hh.field_c, true);
                    var2_int++;
                    continue L4;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("em.<init>(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_c = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
