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
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (to.field_r != null) {
                to.field_r.p(-92);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              nf.field_b = new be(param0, param2, false, true, true);
              ph.field_l.c((ng) (Object) nf.field_b, -120);
              if (param1 <= -30) {
                break L2;
              } else {
                field_d = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("al.F(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final static int a(int param0, char param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param2.length();
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4) {
                stackOut_7_0 = var3_int;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                L2: {
                  if (param2.charAt(var5) == param1) {
                    var3_int++;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("al.D(").append(0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0;
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
          if (oa.field_j == 0) {
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
            ((al) this).field_j = (var3 >> 1) + ((al) this).field_i + -64;
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
        try {
            param3.e(160, 12);
            if (param1 != 66) {
                Object var6 = null;
                tf[] discarded$0 = al.a(true, (tf[]) null);
            }
            param3.b(param1 + 1276387878, 17);
            param3.b(1276387944, param4);
            param3.b(1276387944, param0);
            param3.e(160, param2);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "al.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(String param0) {
        System.out.println("Error: " + qk.a(param0, "%0a", "\n", -127));
    }

    al(dd param0, hd param1, kk param2) {
        try {
            ((al) this).field_f = param1;
            ((al) this).field_n = 20;
            ((al) this).field_i = param2.field_t;
            ((al) this).field_l = param2.field_u;
            ((al) this).field_h = param0.field_h;
            ((al) this).field_k = param0.field_j;
            ((al) this).field_a = param0.field_n;
            ((al) this).a(-127);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "al.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
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
        Object var20 = null;
        int var21 = 0;
        int var22 = 0;
        tf var23 = null;
        tf var24 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_24_0 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_41_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_51_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_57_0 = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        Object stackOut_47_0 = null;
        Object stackOut_46_0 = null;
        Object stackOut_50_0 = null;
        Object stackOut_49_0 = null;
        Object stackOut_53_0 = null;
        Object stackOut_52_0 = null;
        Object stackOut_56_0 = null;
        Object stackOut_55_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_33_0 = null;
        Object stackOut_37_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_40_0 = null;
        Object stackOut_39_0 = null;
        Object stackOut_43_0 = null;
        Object stackOut_42_0 = null;
        L0: {
          L1: {
            var4 = ((al) this).field_f.field_s;
            if (((al) this).field_h >= param0) {
              break L1;
            } else {
              if (((al) this).field_a < param0) {
                break L1;
              } else {
                if (0 != param0 % 2) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        L2: {
          var5 = stackIn_5_0;
          var6 = ((al) this).field_f.field_e;
          var7 = ((al) this).field_f.field_h;
          var8 = -param0 + 10;
          if (param0 >= 10) {
            stackOut_7_0 = 256;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = (param0 << 8) / 10;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_8_0;
          var10 = ((al) this).field_k * (-10 + param0 + (-((al) this).field_h + -((al) this).field_a)) >> 16;
          if (var10 >= 0) {
            break L3;
          } else {
            var10 = 0;
            break L3;
          }
        }
        L4: {
          if (256 < var10) {
            var10 = 256;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var11 = 256 - var10;
          var12 = var10;
          var13 = ((al) this).field_i - -(32 * var6);
          var14 = ((al) this).field_l + 32 * (2 + var7);
          var15 = 64 + (64 * var11 >> 8);
          var16 = ((al) this).field_j + ((var13 + -((al) this).field_j) * var12 >> 8);
          var17 = ((-((al) this).field_o + var14) * var12 >> 8) + (((al) this).field_o + -var15);
          if (var5 == 0) {
            break L5;
          } else {
            var16 += 5;
            break L5;
          }
        }
        L6: {
          if (jc.field_d) {
            L7: {
              int fieldTemp$1 = ((al) this).field_b + 1;
              ((al) this).field_b = ((al) this).field_b + 1;
              if (fieldTemp$1 >= 50) {
                ((al) this).field_b = 0;
                break L7;
              } else {
                break L7;
              }
            }
            gd.field_f[((al) this).field_b].b(1 + var13, -63 + var14, var9);
            break L6;
          } else {
            break L6;
          }
        }
        L8: {
          t.a(1 + var13, -63 + var14, 63, 63, 16777215);
          t.a(2 + var13, var14 - 62, 61, 61, 0);
          var18 = var9 * var11 * 15 >> 16;
          fi.a(6 + var16, var17 + 5, var13, var14 - 64, 6, var18, gg.field_z);
          fi.a(-7 + (var15 + var16), 5 + var17, 64 + var13, var14 - 64, 6, var18, gg.field_z);
          fi.a(var16 - -6, var15 + var17, var13, var14 + -1, 6, var18, gg.field_z);
          fi.a(var16 - (-var15 - -7), var15 + var17, 64 + var13, var14 + -1, 6, var18, gg.field_z);
          var15 = var15 / 2;
          var19 = null;
          var20 = null;
          if (null == fq.field_o) {
            stackOut_23_0 = 0;
            stackIn_24_0 = stackOut_23_0;
            break L8;
          } else {
            stackOut_22_0 = fo.field_t;
            stackIn_24_0 = stackOut_22_0;
            break L8;
          }
        }
        L9: {
          var21 = stackIn_24_0;
          if (var21 == 0) {
            var19 = (Object) (Object) rg.field_e.field_f[0];
            var20 = (Object) (Object) rg.field_e.field_f[1];
            break L9;
          } else {
            if (var21 == 1) {
              var20 = (Object) (Object) fq.field_o.field_f[1];
              var19 = (Object) (Object) fq.field_o.field_f[0];
              break L9;
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
              break L9;
            }
          }
        }
        L10: {
          if (param2 < var8) {
            L11: {
              if (var4[0]) {
                stackOut_47_0 = var20;
                stackIn_48_0 = stackOut_47_0;
                break L11;
              } else {
                stackOut_46_0 = var19;
                stackIn_48_0 = stackOut_46_0;
                break L11;
              }
            }
            L12: {
              fi.a((tf) (Object) stackIn_48_0, ii.field_p[var8 + -1], var16, var17);
              if (!var4[1]) {
                stackOut_50_0 = var19;
                stackIn_51_0 = stackOut_50_0;
                break L12;
              } else {
                stackOut_49_0 = var20;
                stackIn_51_0 = stackOut_49_0;
                break L12;
              }
            }
            L13: {
              fi.a((tf) (Object) stackIn_51_0, ii.field_p[-1 + var8], var16 + var15, var17);
              if (!var4[2]) {
                stackOut_53_0 = var19;
                stackIn_54_0 = stackOut_53_0;
                break L13;
              } else {
                stackOut_52_0 = var20;
                stackIn_54_0 = stackOut_52_0;
                break L13;
              }
            }
            L14: {
              fi.a((tf) (Object) stackIn_54_0, ii.field_p[var8 + -1], var16, var15 + var17);
              if (var4[3]) {
                stackOut_56_0 = var20;
                stackIn_57_0 = stackOut_56_0;
                break L14;
              } else {
                stackOut_55_0 = var19;
                stackIn_57_0 = stackOut_55_0;
                break L14;
              }
            }
            fi.a((tf) (Object) stackIn_57_0, ii.field_p[-1 + var8], var16 - -var15, var17 - -var15);
            break L10;
          } else {
            L15: {
              var22 = 0;
              if (param1 == 0) {
                break L15;
              } else {
                var22 = 8 - param1 << 2;
                var22 = var22 + (var22 * var11 >> 8);
                break L15;
              }
            }
            L16: {
              if (!var4[0]) {
                stackOut_34_0 = var19;
                stackIn_35_0 = stackOut_34_0;
                break L16;
              } else {
                stackOut_33_0 = var20;
                stackIn_35_0 = stackOut_33_0;
                break L16;
              }
            }
            L17: {
              ((tf) (Object) stackIn_35_0).a(var16, var22 + var17, var15, var15);
              if (!var4[1]) {
                stackOut_37_0 = var19;
                stackIn_38_0 = stackOut_37_0;
                break L17;
              } else {
                stackOut_36_0 = var20;
                stackIn_38_0 = stackOut_36_0;
                break L17;
              }
            }
            L18: {
              ((tf) (Object) stackIn_38_0).a(var15 + var16 - var22, var17, var15, var15);
              if (!var4[2]) {
                stackOut_40_0 = var19;
                stackIn_41_0 = stackOut_40_0;
                break L18;
              } else {
                stackOut_39_0 = var20;
                stackIn_41_0 = stackOut_39_0;
                break L18;
              }
            }
            L19: {
              ((tf) (Object) stackIn_41_0).a(var22 + var16, var15 + var17, var15, var15);
              if (var4[3]) {
                stackOut_43_0 = var20;
                stackIn_44_0 = stackOut_43_0;
                break L19;
              } else {
                stackOut_42_0 = var19;
                stackIn_44_0 = stackOut_42_0;
                break L19;
              }
            }
            ((tf) (Object) stackIn_44_0).a(var15 + var16, -var22 + var17 + var15, var15, var15);
            break L10;
          }
        }
    }

    final static tf[] a(boolean param0, tf[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        tf var3 = null;
        int var4 = 0;
        Object var5 = null;
        tf[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        tf[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (!param0) {
                break L1;
              } else {
                var5 = null;
                al.a(99, (byte) 118, 123, (we) null, -60);
                break L1;
              }
            }
            L2: while (true) {
              if (var2_int >= param1.length) {
                stackOut_5_0 = (tf[]) param1;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var3 = param1[var2_int];
                param1[var2_int].field_y = 0;
                var3.field_D = 0;
                param1[var2_int].field_A = param1[var2_int].field_F;
                param1[var2_int].field_B = param1[var2_int].field_E;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("al.E(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void a() {
        field_g = null;
        field_m = null;
        field_d = null;
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
