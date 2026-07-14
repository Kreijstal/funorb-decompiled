/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    private int field_i;
    private int field_k;
    private int field_h;
    private int field_o;
    private int field_l;
    private int field_b;
    private hd field_f;
    static String field_g;
    private int field_j;
    static String field_d;
    static hh[][][] field_c;
    private int field_e;
    private int field_a;
    private int field_n;
    static int[] field_m;

    final static void a(String param0, int param1, String param2) {
        if (!(to.field_r == null)) {
            to.field_r.p(-92);
        }
        nf.field_b = new be(param0, param2, false, true, true);
        ph.field_l.c((ng) (Object) nf.field_b, -120);
        if (param1 > -30) {
            field_d = null;
        }
    }

    final static int a(int param0, char param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        var3 = param0;
        var4 = param2.length();
        var5 = 0;
        L0: while (true) {
          if (var5 >= var4) {
            return var3;
          } else {
            if (param2.charAt(var5) == param1) {
              var3++;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Pixelate.field_H ? 1 : 0;
          var2 = 20 / ((param0 - -63) / 56);
          var3 = 32 * ((al) this).field_f.field_i;
          var4 = 32 * ((al) this).field_f.field_a;
          if (-1 == (oa.field_j ^ -1)) {
            L1: {
              L2: {
                ((al) this).field_e = ((al) this).field_e + ((al) this).field_n;
                if (((al) this).field_e > var4 + var3) {
                  break L2;
                } else {
                  if (0 > ((al) this).field_e) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              ((al) this).field_e = -((al) this).field_n + -((al) this).field_n + ((al) this).field_e;
              ((al) this).field_n = -((al) this).field_n;
              break L1;
            }
            if (var3 > ((al) this).field_e) {
              ((al) this).field_o = ((al) this).field_l - -6;
              ((al) this).field_j = ((al) this).field_e + ((al) this).field_i;
              break L0;
            } else {
              ((al) this).field_o = -var3 + ((al) this).field_e + -10 + ((al) this).field_l - -16;
              ((al) this).field_j = ((al) this).field_i - (-var3 - -16) + 10;
              break L0;
            }
          } else {
            ((al) this).field_j = (var3 >> -788124639) + ((al) this).field_i + -64;
            ((al) this).field_o = 6 + ((al) this).field_l;
            break L0;
          }
        }
        L3: {
          var5 = 138;
          if (((al) this).field_o >= var5) {
            break L3;
          } else {
            ((al) this).field_o = var5;
            break L3;
          }
        }
    }

    final static void a(int param0, byte param1, int param2, we param3, int param4) {
        param3.e(160, 12);
        if (param1 != 66) {
            Object var6 = null;
            tf[] discarded$0 = al.a(true, (tf[]) null);
        }
        param3.b(param1 + 1276387878, 17);
        param3.b(1276387944, param4);
        param3.b(1276387944, param0);
        param3.e(160, param2);
    }

    final static void a(String param0, int param1) {
        if (param1 != 0) {
            return;
        }
        System.out.println("Error: " + qk.a(param0, "%0a", "\n", -127));
    }

    al(dd param0, hd param1, kk param2) {
        ((al) this).field_f = param1;
        ((al) this).field_n = 20;
        ((al) this).field_i = param2.field_t;
        ((al) this).field_l = param2.field_u;
        ((al) this).field_h = param0.field_h;
        ((al) this).field_k = param0.field_j;
        ((al) this).field_a = param0.field_n;
        ((al) this).a(-127);
    }

    final void a(int param0, int param1, int param2) {
        boolean[] var4 = null;
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
        Object var19 = null;
        tf var19_ref = null;
        Object var20 = null;
        tf var20_ref = null;
        int var21 = 0;
        int var22 = 0;
        tf var23 = null;
        tf var24 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_27_0 = 0;
        tf stackIn_38_0 = null;
        tf stackIn_41_0 = null;
        tf stackIn_44_0 = null;
        tf stackIn_47_0 = null;
        tf stackIn_51_0 = null;
        tf stackIn_54_0 = null;
        tf stackIn_57_0 = null;
        tf stackIn_60_0 = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        tf stackOut_50_0 = null;
        tf stackOut_49_0 = null;
        tf stackOut_53_0 = null;
        tf stackOut_52_0 = null;
        tf stackOut_56_0 = null;
        tf stackOut_55_0 = null;
        tf stackOut_59_0 = null;
        tf stackOut_58_0 = null;
        tf stackOut_37_0 = null;
        tf stackOut_36_0 = null;
        tf stackOut_40_0 = null;
        tf stackOut_39_0 = null;
        tf stackOut_43_0 = null;
        tf stackOut_42_0 = null;
        tf stackOut_46_0 = null;
        tf stackOut_45_0 = null;
        L0: {
          var4 = ((al) this).field_f.field_s;
          if (((al) this).field_h < param0) {
            if (((al) this).field_a >= param0) {
              if (0 == param0 % 2) {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_8_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_8_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_8_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_8_0;
          var6 = ((al) this).field_f.field_e;
          var7 = ((al) this).field_f.field_h;
          var8 = -param0 + 10;
          if ((param0 ^ -1) <= -11) {
            stackOut_10_0 = 256;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          } else {
            stackOut_9_0 = (param0 << -1856016600) / 10;
            stackIn_11_0 = stackOut_9_0;
            break L1;
          }
        }
        L2: {
          var9 = stackIn_11_0;
          var10 = ((al) this).field_k * (-10 + param0 + (-((al) this).field_h + -((al) this).field_a)) >> 541625264;
          if (var10 >= 0) {
            break L2;
          } else {
            var10 = 0;
            break L2;
          }
        }
        L3: {
          if (256 < var10) {
            var10 = 256;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var11 = 256 - var10;
          var12 = var10;
          var13 = ((al) this).field_i - -(32 * var6);
          var14 = ((al) this).field_l + 32 * (2 + var7);
          var15 = 64 + (64 * var11 >> 1827900136);
          var16 = ((al) this).field_j + ((var13 + -((al) this).field_j) * var12 >> 738065384);
          var17 = ((-((al) this).field_o + var14) * var12 >> 670019496) + (((al) this).field_o + -var15);
          if (var5 == 0) {
            break L4;
          } else {
            var16 += 5;
            break L4;
          }
        }
        L5: {
          if (jc.field_d) {
            L6: {
              ((al) this).field_b = ((al) this).field_b + 1;
              if ((((al) this).field_b + 1 ^ -1) <= -51) {
                ((al) this).field_b = 0;
                break L6;
              } else {
                break L6;
              }
            }
            gd.field_f[((al) this).field_b].b(1 + var13, -63 + var14, var9);
            break L5;
          } else {
            break L5;
          }
        }
        L7: {
          t.a(1 + var13, -63 + var14, 63, 63, 16777215);
          t.a(2 + var13, var14 + -64 - -2, 61, 61, 0);
          var18 = var9 * var11 * 15 >> -204249232;
          fi.a(6 + var16, var17 + 5, var13, var14 - 64, 6, var18, gg.field_z);
          fi.a(-7 + (var15 + var16), 5 + var17, 64 + var13, var14 - 64, 6, var18, gg.field_z);
          fi.a(var16 - -6, var15 + var17, var13, var14 + -1, 6, var18, gg.field_z);
          fi.a(var16 - (-var15 - -7), var15 + var17, 64 + var13, var14 + -1, 6, var18, gg.field_z);
          var15 = var15 / 2;
          var19 = null;
          var20 = null;
          if (null == fq.field_o) {
            stackOut_26_0 = 0;
            stackIn_27_0 = stackOut_26_0;
            break L7;
          } else {
            stackOut_25_0 = fo.field_t;
            stackIn_27_0 = stackOut_25_0;
            break L7;
          }
        }
        L8: {
          var21 = stackIn_27_0;
          if (-1 == var21) {
            var19_ref = rg.field_e.field_f[0];
            var20_ref = rg.field_e.field_f[1];
            break L8;
          } else {
            if (-2 == var21) {
              var20_ref = fq.field_o.field_f[1];
              var19_ref = fq.field_o.field_f[0];
              break L8;
            } else {
              var23 = im.field_Hb[0];
              var24 = im.field_Hb[1];
              var23.c();
              rg.field_e.field_f[0].f(0, 0);
              fq.field_o.field_f[0].a(0, 0, var21);
              var24.c();
              rg.field_e.field_f[1].f(0, 0);
              fq.field_o.field_f[1].a(0, 0, var21);
              qa.field_f.a(param2 ^ 19692);
              break L8;
            }
          }
        }
        L9: {
          if (param2 < var8) {
            L10: {
              if (var4[0]) {
                stackOut_50_0 = (tf) var20_ref;
                stackIn_51_0 = stackOut_50_0;
                break L10;
              } else {
                stackOut_49_0 = (tf) var19_ref;
                stackIn_51_0 = stackOut_49_0;
                break L10;
              }
            }
            L11: {
              fi.a(stackIn_51_0, ii.field_p[var8 + -1], var16, var17);
              if (!var4[1]) {
                stackOut_53_0 = (tf) var19_ref;
                stackIn_54_0 = stackOut_53_0;
                break L11;
              } else {
                stackOut_52_0 = (tf) var20_ref;
                stackIn_54_0 = stackOut_52_0;
                break L11;
              }
            }
            L12: {
              fi.a(stackIn_54_0, ii.field_p[-1 + var8], var16 + var15, var17);
              if (!var4[2]) {
                stackOut_56_0 = (tf) var19_ref;
                stackIn_57_0 = stackOut_56_0;
                break L12;
              } else {
                stackOut_55_0 = (tf) var20_ref;
                stackIn_57_0 = stackOut_55_0;
                break L12;
              }
            }
            L13: {
              fi.a(stackIn_57_0, ii.field_p[var8 + -1], var16, var15 + var17);
              if (var4[3]) {
                stackOut_59_0 = (tf) var20_ref;
                stackIn_60_0 = stackOut_59_0;
                break L13;
              } else {
                stackOut_58_0 = (tf) var19_ref;
                stackIn_60_0 = stackOut_58_0;
                break L13;
              }
            }
            fi.a(stackIn_60_0, ii.field_p[-1 + var8], var16 - -var15, var17 - -var15);
            break L9;
          } else {
            L14: {
              var22 = 0;
              if (-1 == (param1 ^ -1)) {
                break L14;
              } else {
                var22 = 8 - param1 << 782412034;
                var22 = var22 + (var22 * var11 >> 391334280);
                break L14;
              }
            }
            L15: {
              if (!var4[0]) {
                stackOut_37_0 = (tf) var19_ref;
                stackIn_38_0 = stackOut_37_0;
                break L15;
              } else {
                stackOut_36_0 = (tf) var20_ref;
                stackIn_38_0 = stackOut_36_0;
                break L15;
              }
            }
            L16: {
              ((tf) (Object) stackIn_38_0).a(var16, var22 + var17, var15, var15);
              if (!var4[1]) {
                stackOut_40_0 = (tf) var19_ref;
                stackIn_41_0 = stackOut_40_0;
                break L16;
              } else {
                stackOut_39_0 = (tf) var20_ref;
                stackIn_41_0 = stackOut_39_0;
                break L16;
              }
            }
            L17: {
              ((tf) (Object) stackIn_41_0).a(var15 + var16 - var22, var17, var15, var15);
              if (!var4[2]) {
                stackOut_43_0 = (tf) var19_ref;
                stackIn_44_0 = stackOut_43_0;
                break L17;
              } else {
                stackOut_42_0 = (tf) var20_ref;
                stackIn_44_0 = stackOut_42_0;
                break L17;
              }
            }
            L18: {
              ((tf) (Object) stackIn_44_0).a(var22 + var16, var15 + var17, var15, var15);
              if (var4[3]) {
                stackOut_46_0 = (tf) var20_ref;
                stackIn_47_0 = stackOut_46_0;
                break L18;
              } else {
                stackOut_45_0 = (tf) var19_ref;
                stackIn_47_0 = stackOut_45_0;
                break L18;
              }
            }
            ((tf) (Object) stackIn_47_0).a(var15 + var16, -var22 + var17 + var15, var15, var15);
            break L9;
          }
        }
    }

    final static tf[] a(boolean param0, tf[] param1) {
        tf var3 = null;
        int var4 = Pixelate.field_H ? 1 : 0;
        int var2 = 0;
        if (param0) {
            Object var5 = null;
            al.a(99, (byte) 118, 123, (we) null, -60);
        }
        while (var2 < param1.length) {
            var3 = param1[var2];
            param1[var2].field_y = 0;
            var3.field_D = 0;
            param1[var2].field_A = param1[var2].field_F;
            param1[var2].field_B = param1[var2].field_E;
            var2++;
        }
        return param1;
    }

    public static void a(byte param0) {
        field_g = null;
        field_m = null;
        field_d = null;
        if (param0 != 51) {
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new hh[6][6][];
        field_d = "Resign";
        field_m = new int[8192];
    }
}
