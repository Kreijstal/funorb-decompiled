/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kbb extends le {
    static String field_q;
    private int field_i;
    private int field_j;
    private int field_k;
    private int field_l;
    private int field_o;
    private int field_n;
    private int field_s;
    static int field_p;
    private int field_r;
    private int field_m;

    final static void a(asb param0, asb param1, asb param2, byte param3, asb param4) {
        djb.field_s = new ima[5][];
        ok.field_b = new sw[5];
        ok.field_b[0] = tg.a(param3 + 14135, param1, "basic", "tinyfont_graphics2");
        djb.field_s[0] = ima.a(param2, "basic", "tinyfont_graphics2");
        ok.field_b[1] = tg.a(14223, param1, "basic", "antigrav_24_graphics2");
        djb.field_s[1] = ima.a(param2, "basic", "font_antigrav_24_alpha");
        ok.field_b[2] = tg.a(14223, param1, "basic", "antigrav_18_graphics2");
        djb.field_s[2] = ima.a(param2, "basic", "font_antigrav_18_alpha");
        ok.field_b[3] = tg.a(mgb.a((int) param3, 14295), param1, "basic", "calibri_11_graphics2");
        djb.field_s[3] = ima.a(param2, "basic", "font_calibri_11_alpha");
        ok.field_b[4] = tg.a(14223, param1, "basic", "calibri_12_graphics2");
        djb.field_s[4] = ima.a(param2, "basic", "font_calibri_12_alpha");
        if (param3 != 88) {
          return;
        } else {
          nkb.a(false, "Finished unpacking raw fonts");
          po.field_o = true;
          return;
        }
    }

    final void a(int param0, int param1, ds param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var4 = param0;
        if (-1 != (var4 ^ -1)) {
          if (1 == var4) {
            ((kbb) this).field_o = (param2.d((byte) -114) << -1537834804) / 100;
            if (param1 <= -60) {
              return;
            } else {
              this.b(108, 41, -61, 78);
              return;
            }
          } else {
            if (var4 != 2) {
              if (param1 <= -60) {
                return;
              } else {
                this.b(108, 41, -61, 78);
                return;
              }
            } else {
              ((kbb) this).field_n = (param2.d((byte) -114) << -82877524) / 100;
              if (param1 <= -60) {
                return;
              } else {
                this.b(108, 41, -61, 78);
                return;
              }
            }
          }
        } else {
          ((kbb) this).field_j = param2.a(true);
          if (param1 <= -60) {
            return;
          } else {
            this.b(108, 41, -61, 78);
            return;
          }
        }
    }

    public static void e(byte param0) {
        field_q = null;
        int var1 = -4 % ((-75 - param0) / 37);
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        Object stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        L0: {
          var11 = VoidHunters.field_G;
          if (param1 < param2) {
            stackOut_2_0 = param2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param1 <= param2) {
            stackOut_5_0 = param1;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = param2;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param0 <= -10) {
            break L2;
          } else {
            kbb.e((byte) 5);
            break L2;
          }
        }
        L3: {
          if (var5 < param3) {
            stackOut_10_0 = param3;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = var5;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        L4: {
          var5 = stackIn_11_0;
          if (var6 <= param3) {
            stackOut_13_0 = var6;
            stackIn_14_0 = stackOut_13_0;
            break L4;
          } else {
            stackOut_12_0 = param3;
            stackIn_14_0 = stackOut_12_0;
            break L4;
          }
        }
        var6 = stackIn_14_0;
        var7 = -var6 + var5;
        ((kbb) this).field_l = (var5 + var6) / 2;
        if (0 >= var7) {
          ((kbb) this).field_i = 0;
          if ((((kbb) this).field_l ^ -1) < -1) {
            if (4096 <= ((kbb) this).field_l) {
              ((kbb) this).field_k = 0;
              return;
            } else {
              L5: {
                stackOut_59_0 = this;
                stackOut_59_1 = var7 << 232304460;
                stackIn_61_0 = stackOut_59_0;
                stackIn_61_1 = stackOut_59_1;
                stackIn_60_0 = stackOut_59_0;
                stackIn_60_1 = stackOut_59_1;
                if ((((kbb) this).field_l ^ -1) >= -2049) {
                  stackOut_61_0 = this;
                  stackOut_61_1 = stackIn_61_1;
                  stackOut_61_2 = ((kbb) this).field_l * 2;
                  stackIn_62_0 = stackOut_61_0;
                  stackIn_62_1 = stackOut_61_1;
                  stackIn_62_2 = stackOut_61_2;
                  break L5;
                } else {
                  stackOut_60_0 = this;
                  stackOut_60_1 = stackIn_60_1;
                  stackOut_60_2 = -(((kbb) this).field_l * 2) + 8192;
                  stackIn_62_0 = stackOut_60_0;
                  stackIn_62_1 = stackOut_60_1;
                  stackIn_62_2 = stackOut_60_2;
                  break L5;
                }
              }
              ((kbb) this).field_k = stackIn_62_1 / stackIn_62_2;
              return;
            }
          } else {
            ((kbb) this).field_k = 0;
            return;
          }
        } else {
          var8 = (-param2 + var5 << -91985492) / var7;
          var9 = (var5 - param1 << -1954268340) / var7;
          var10 = (-param3 + var5 << -98347604) / var7;
          if (var5 != param2) {
            if (var5 != param1) {
              L6: {
                stackOut_44_0 = this;
                stackIn_46_0 = stackOut_44_0;
                stackIn_45_0 = stackOut_44_0;
                if (var6 != param2) {
                  stackOut_46_0 = this;
                  stackOut_46_1 = -var8 + 20480;
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  break L6;
                } else {
                  stackOut_45_0 = this;
                  stackOut_45_1 = var9 + 12288;
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  break L6;
                }
              }
              ((kbb) this).field_i = stackIn_47_1;
              ((kbb) this).field_i = ((kbb) this).field_i / 6;
              if ((((kbb) this).field_l ^ -1) < -1) {
                if (4096 <= ((kbb) this).field_l) {
                  ((kbb) this).field_k = 0;
                  return;
                } else {
                  L7: {
                    stackOut_50_0 = this;
                    stackOut_50_1 = var7 << 232304460;
                    stackIn_52_0 = stackOut_50_0;
                    stackIn_52_1 = stackOut_50_1;
                    stackIn_51_0 = stackOut_50_0;
                    stackIn_51_1 = stackOut_50_1;
                    if ((((kbb) this).field_l ^ -1) >= -2049) {
                      stackOut_52_0 = this;
                      stackOut_52_1 = stackIn_52_1;
                      stackOut_52_2 = ((kbb) this).field_l * 2;
                      stackIn_53_0 = stackOut_52_0;
                      stackIn_53_1 = stackOut_52_1;
                      stackIn_53_2 = stackOut_52_2;
                      break L7;
                    } else {
                      stackOut_51_0 = this;
                      stackOut_51_1 = stackIn_51_1;
                      stackOut_51_2 = -(((kbb) this).field_l * 2) + 8192;
                      stackIn_53_0 = stackOut_51_0;
                      stackIn_53_1 = stackOut_51_1;
                      stackIn_53_2 = stackOut_51_2;
                      break L7;
                    }
                  }
                  ((kbb) this).field_k = stackIn_53_1 / stackIn_53_2;
                  return;
                }
              } else {
                ((kbb) this).field_k = 0;
                return;
              }
            } else {
              L8: {
                stackOut_32_0 = this;
                stackIn_34_0 = stackOut_32_0;
                stackIn_33_0 = stackOut_32_0;
                if (var6 != param3) {
                  stackOut_34_0 = this;
                  stackOut_34_1 = 12288 + -var10;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  break L8;
                } else {
                  stackOut_33_0 = this;
                  stackOut_33_1 = 4096 - -var8;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  break L8;
                }
              }
              ((kbb) this).field_i = stackIn_35_1;
              ((kbb) this).field_i = ((kbb) this).field_i / 6;
              if ((((kbb) this).field_l ^ -1) < -1) {
                if (4096 > ((kbb) this).field_l) {
                  L9: {
                    stackOut_39_0 = this;
                    stackOut_39_1 = var7 << 232304460;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_41_1 = stackOut_39_1;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    if ((((kbb) this).field_l ^ -1) >= -2049) {
                      stackOut_41_0 = this;
                      stackOut_41_1 = stackIn_41_1;
                      stackOut_41_2 = ((kbb) this).field_l * 2;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      stackIn_42_2 = stackOut_41_2;
                      break L9;
                    } else {
                      stackOut_40_0 = this;
                      stackOut_40_1 = stackIn_40_1;
                      stackOut_40_2 = -(((kbb) this).field_l * 2) + 8192;
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_42_1 = stackOut_40_1;
                      stackIn_42_2 = stackOut_40_2;
                      break L9;
                    }
                  }
                  ((kbb) this).field_k = stackIn_42_1 / stackIn_42_2;
                  return;
                } else {
                  ((kbb) this).field_k = 0;
                  return;
                }
              } else {
                ((kbb) this).field_k = 0;
                return;
              }
            }
          } else {
            L10: {
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (var6 != param1) {
                stackOut_18_0 = this;
                stackOut_18_1 = -var9 + 4096;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L10;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = 20480 - -var10;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L10;
              }
            }
            ((kbb) this).field_i = stackIn_19_1;
            ((kbb) this).field_i = ((kbb) this).field_i / 6;
            if ((((kbb) this).field_l ^ -1) < -1) {
              if (4096 > ((kbb) this).field_l) {
                L11: {
                  stackOut_26_0 = this;
                  stackOut_26_1 = var7 << 232304460;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  if ((((kbb) this).field_l ^ -1) >= -2049) {
                    stackOut_28_0 = this;
                    stackOut_28_1 = stackIn_28_1;
                    stackOut_28_2 = ((kbb) this).field_l * 2;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    stackIn_29_2 = stackOut_28_2;
                    break L11;
                  } else {
                    stackOut_27_0 = this;
                    stackOut_27_1 = stackIn_27_1;
                    stackOut_27_2 = -(((kbb) this).field_l * 2) + 8192;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    stackIn_29_2 = stackOut_27_2;
                    break L11;
                  }
                }
                ((kbb) this).field_k = stackIn_29_1 / stackIn_29_2;
                return;
              } else {
                ((kbb) this).field_k = 0;
                return;
              }
            } else {
              ((kbb) this).field_k = 0;
              return;
            }
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
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
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var14 = VoidHunters.field_G;
          if (-2049 <= (param2 ^ -1)) {
            stackOut_2_0 = param2 * (param0 + 4096) >> 764825964;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param0 + param2 - (param0 * param2 >> -292121844);
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var5 = stackIn_3_0;
        if (param3 == 4096) {
          if (0 < var5) {
            param1 = param1 * 6;
            var6 = param2 + param2 + -var5;
            var7 = (-var6 + var5 << 550223468) / var5;
            var8 = param1 >> -1013632084;
            var9 = -(var8 << 1980052204) + param1;
            var10 = var5;
            var10 = var7 * var10 >> 1389699052;
            var10 = var9 * var10 >> -754638068;
            var11 = var10 + var6;
            var12 = -var10 + var5;
            var13 = var8;
            if (var13 != 0) {
              if ((var13 ^ -1) != -2) {
                if (2 != var13) {
                  if ((var13 ^ -1) != -4) {
                    if (4 != var13) {
                      if (var13 != 5) {
                        return;
                      } else {
                        ((kbb) this).field_r = var5;
                        ((kbb) this).field_m = var12;
                        ((kbb) this).field_s = var6;
                        return;
                      }
                    } else {
                      ((kbb) this).field_m = var5;
                      ((kbb) this).field_s = var6;
                      ((kbb) this).field_r = var11;
                      return;
                    }
                  } else {
                    ((kbb) this).field_m = var5;
                    ((kbb) this).field_s = var12;
                    ((kbb) this).field_r = var6;
                    return;
                  }
                } else {
                  ((kbb) this).field_r = var6;
                  ((kbb) this).field_s = var5;
                  ((kbb) this).field_m = var11;
                  return;
                }
              } else {
                ((kbb) this).field_r = var12;
                ((kbb) this).field_s = var5;
                ((kbb) this).field_m = var6;
                return;
              }
            } else {
              ((kbb) this).field_s = var11;
              ((kbb) this).field_r = var5;
              ((kbb) this).field_m = var6;
              return;
            }
          } else {
            ((kbb) this).field_m = param2;
            ((kbb) this).field_s = param2;
            ((kbb) this).field_r = param2;
            return;
          }
        } else {
          return;
        }
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int[][] var15 = null;
        int[][] var20 = null;
        int[][] var25 = null;
        int[][] var29 = null;
        int[][] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        var12 = VoidHunters.field_G;
        var30 = ((kbb) this).field_d.a(param1, (byte) -118);
        var25 = var30;
        var20 = var25;
        var15 = var20;
        var13 = var15;
        var3 = var13;
        if (((kbb) this).field_d.field_g) {
          var29 = ((kbb) this).a((byte) 108, 0, param1);
          var32 = var29[0];
          var31 = var29[1];
          var33 = var29[2];
          var8 = var30[0];
          var9 = var30[1];
          var10 = var30[2];
          var11 = 0;
          L0: while (true) {
            if (hob.field_d > var11) {
              this.a((byte) -44, var31[var11], var32[var11], var33[var11]);
              ((kbb) this).field_l = ((kbb) this).field_l + ((kbb) this).field_n;
              ((kbb) this).field_k = ((kbb) this).field_k + ((kbb) this).field_o;
              ((kbb) this).field_i = ((kbb) this).field_i + ((kbb) this).field_j;
              L1: while (true) {
                if (0 <= ((kbb) this).field_i) {
                  L2: while (true) {
                    if (4096 >= ((kbb) this).field_i) {
                      L3: {
                        if (-1 < ((kbb) this).field_k) {
                          ((kbb) this).field_k = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (-4097 >= ((kbb) this).field_k) {
                          break L4;
                        } else {
                          ((kbb) this).field_k = 4096;
                          break L4;
                        }
                      }
                      L5: {
                        if ((((kbb) this).field_l ^ -1) <= -1) {
                          break L5;
                        } else {
                          ((kbb) this).field_l = 0;
                          break L5;
                        }
                      }
                      L6: {
                        if ((((kbb) this).field_l ^ -1) >= -4097) {
                          break L6;
                        } else {
                          ((kbb) this).field_l = 4096;
                          break L6;
                        }
                      }
                      this.b(((kbb) this).field_k, ((kbb) this).field_i, ((kbb) this).field_l, 4096);
                      var8[var11] = ((kbb) this).field_r;
                      var9[var11] = ((kbb) this).field_s;
                      var10[var11] = ((kbb) this).field_m;
                      var11++;
                      continue L0;
                    } else {
                      ((kbb) this).field_i = ((kbb) this).field_i - 4096;
                      continue L2;
                    }
                  }
                } else {
                  ((kbb) this).field_i = ((kbb) this).field_i + 4096;
                  continue L1;
                }
              }
            } else {
              L7: {
                if (param0 == 255) {
                  break L7;
                } else {
                  this.b(72, 53, 92, -63);
                  break L7;
                }
              }
              return var3;
            }
          }
        } else {
          L8: {
            if (param0 == 255) {
              break L8;
            } else {
              this.b(72, 53, 92, -63);
              break L8;
            }
          }
          return var3;
        }
    }

    public kbb() {
        super(1, false);
        ((kbb) this).field_n = 0;
        ((kbb) this).field_o = 0;
        ((kbb) this).field_j = 0;
    }

    static {
    }
}
