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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
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
            if (param3 == 88) {
              nkb.a(false, "Finished unpacking raw fonts");
              po.field_o = true;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("kbb.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (-1 != (var4_int ^ -1)) {
                if (1 == var4_int) {
                  this.field_o = (param2.d((byte) -114) << -1537834804) / 100;
                  break L1;
                } else {
                  if (var4_int != 2) {
                    break L1;
                  } else {
                    this.field_n = (param2.d((byte) -114) << -82877524) / 100;
                    break L1;
                  }
                }
              } else {
                this.field_j = param2.a(true);
                break L1;
              }
            }
            if (param1 <= -60) {
              break L0;
            } else {
              this.b(108, 41, -61, 78);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("kbb.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public static void e(byte param0) {
        field_q = null;
        int var1 = -4 % ((-75 - param0) / 37);
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          var11 = VoidHunters.field_G;
          if (param1 < param2) {
            stackIn_3_0 = param2;
            break L0;
          } else {
            stackIn_3_0 = param1;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param1 <= param2) {
            stackIn_6_0 = param1;
            break L1;
          } else {
            stackIn_6_0 = param2;
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
            stackIn_11_0 = param3;
            break L3;
          } else {
            stackIn_11_0 = var5;
            break L3;
          }
        }
        L4: {
          var5 = stackIn_11_0;
          if (var6 <= param3) {
            stackIn_14_0 = var6;
            break L4;
          } else {
            stackIn_14_0 = param3;
            break L4;
          }
        }
        var6 = stackIn_14_0;
        var7 = -var6 + var5;
        this.field_l = (var5 + var6) / 2;
        if (0 >= var7) {
          this.field_i = 0;
          if ((this.field_l ^ -1) < -1) {
            if (4096 <= this.field_l) {
              this.field_k = 0;
              return;
            } else {
              L5: {
                stackIn_61_0 = this;

                stackIn_61_1 = var7 << 232304460;

                if ((this.field_l ^ -1) >= -2049) {
                  stackIn_62_0 = this;
                  stackIn_62_1 = stackIn_61_1;
                  stackIn_62_2 = this.field_l * 2;
                  break L5;
                } else {
                  stackIn_62_0 = this;
                  stackIn_62_1 = stackIn_61_1;
                  stackIn_62_2 = -(this.field_l * 2) + 8192;
                  break L5;
                }
              }
              ((kbb) (this)).field_k = stackIn_62_1 / stackIn_62_2;
              return;
            }
          } else {
            this.field_k = 0;
            return;
          }
        } else {
          var8 = (-param2 + var5 << -91985492) / var7;
          var9 = (var5 - param1 << -1954268340) / var7;
          var10 = (-param3 + var5 << -98347604) / var7;
          if (var5 != param2) {
            if (var5 != param1) {
              L6: {
                stackIn_46_0 = this;

                if (var6 != param2) {
                  stackIn_47_0 = this;
                  stackIn_47_1 = -var8 + 20480;
                  break L6;
                } else {
                  stackIn_47_0 = this;
                  stackIn_47_1 = var9 + 12288;
                  break L6;
                }
              }
              ((kbb) (this)).field_i = stackIn_47_1;
              this.field_i = this.field_i / 6;
              if ((this.field_l ^ -1) < -1) {
                if (4096 <= this.field_l) {
                  this.field_k = 0;
                  return;
                } else {
                  L7: {
                    stackIn_52_0 = this;

                    stackIn_52_1 = var7 << 232304460;

                    if ((this.field_l ^ -1) >= -2049) {
                      stackIn_53_0 = this;
                      stackIn_53_1 = stackIn_52_1;
                      stackIn_53_2 = this.field_l * 2;
                      break L7;
                    } else {
                      stackIn_53_0 = this;
                      stackIn_53_1 = stackIn_52_1;
                      stackIn_53_2 = -(this.field_l * 2) + 8192;
                      break L7;
                    }
                  }
                  ((kbb) (this)).field_k = stackIn_53_1 / stackIn_53_2;
                  return;
                }
              } else {
                this.field_k = 0;
                return;
              }
            } else {
              L8: {
                stackIn_34_0 = this;

                if (var6 != param3) {
                  stackIn_35_0 = this;
                  stackIn_35_1 = 12288 + -var10;
                  break L8;
                } else {
                  stackIn_35_0 = this;
                  stackIn_35_1 = 4096 - -var8;
                  break L8;
                }
              }
              ((kbb) (this)).field_i = stackIn_35_1;
              this.field_i = this.field_i / 6;
              if ((this.field_l ^ -1) < -1) {
                if (4096 > this.field_l) {
                  L9: {
                    stackIn_41_0 = this;

                    stackIn_41_1 = var7 << 232304460;

                    if ((this.field_l ^ -1) >= -2049) {
                      stackIn_42_0 = this;
                      stackIn_42_1 = stackIn_41_1;
                      stackIn_42_2 = this.field_l * 2;
                      break L9;
                    } else {
                      stackIn_42_0 = this;
                      stackIn_42_1 = stackIn_41_1;
                      stackIn_42_2 = -(this.field_l * 2) + 8192;
                      break L9;
                    }
                  }
                  ((kbb) (this)).field_k = stackIn_42_1 / stackIn_42_2;
                  return;
                } else {
                  this.field_k = 0;
                  return;
                }
              } else {
                this.field_k = 0;
                return;
              }
            }
          } else {
            L10: {
              stackIn_18_0 = this;

              if (var6 != param1) {
                stackIn_19_0 = this;
                stackIn_19_1 = -var9 + 4096;
                break L10;
              } else {
                stackIn_19_0 = this;
                stackIn_19_1 = 20480 - -var10;
                break L10;
              }
            }
            ((kbb) (this)).field_i = stackIn_19_1;
            this.field_i = this.field_i / 6;
            if ((this.field_l ^ -1) < -1) {
              if (4096 > this.field_l) {
                L11: {
                  stackIn_28_0 = this;

                  stackIn_28_1 = var7 << 232304460;

                  if ((this.field_l ^ -1) >= -2049) {
                    stackIn_29_0 = this;
                    stackIn_29_1 = stackIn_28_1;
                    stackIn_29_2 = this.field_l * 2;
                    break L11;
                  } else {
                    stackIn_29_0 = this;
                    stackIn_29_1 = stackIn_28_1;
                    stackIn_29_2 = -(this.field_l * 2) + 8192;
                    break L11;
                  }
                }
                ((kbb) (this)).field_k = stackIn_29_1 / stackIn_29_2;
                return;
              } else {
                this.field_k = 0;
                return;
              }
            } else {
              this.field_k = 0;
              return;
            }
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        L0: {
          var14 = VoidHunters.field_G;
          if (-2049 <= (param2 ^ -1)) {
            stackIn_3_0 = param2 * (param0 + 4096) >> 764825964;
            break L0;
          } else {
            stackIn_3_0 = param0 + param2 - (param0 * param2 >> -292121844);
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
                        this.field_r = var5;
                        this.field_m = var12;
                        this.field_s = var6;
                        return;
                      }
                    } else {
                      this.field_m = var5;
                      this.field_s = var6;
                      this.field_r = var11;
                      return;
                    }
                  } else {
                    this.field_m = var5;
                    this.field_s = var12;
                    this.field_r = var6;
                    return;
                  }
                } else {
                  this.field_r = var6;
                  this.field_s = var5;
                  this.field_m = var11;
                  return;
                }
              } else {
                this.field_r = var12;
                this.field_s = var5;
                this.field_m = var6;
                return;
              }
            } else {
              this.field_s = var11;
              this.field_r = var5;
              this.field_m = var6;
              return;
            }
          } else {
            this.field_m = param2;
            this.field_s = param2;
            this.field_r = param2;
            return;
          }
        } else {
          return;
        }
    }

    final int[][] a(int param0, int param1) {
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int[][] var13;
        int[][] var15;
        int[][] var20;
        int[][] var28;
        int[] var29;
        int[] var30;
        int[] var31;
        var12 = VoidHunters.field_G;
        var20 = this.field_d.a(param1, (byte) -118);
        var15 = var20;
        var13 = var15;
        var3 = var13;
        if (this.field_d.field_g) {
          var28 = this.a((byte) 108, 0, param1);
          var30 = var28[0];
          var29 = var28[1];
          var31 = var28[2];
          var8 = var20[0];
          var9 = var20[1];
          var10 = var20[2];
          var11 = 0;
          L0: while (true) {
            if (hob.field_d > var11) {
              this.a((byte) -44, var29[var11], var30[var11], var31[var11]);
              this.field_l = this.field_l + this.field_n;
              this.field_k = this.field_k + this.field_o;
              this.field_i = this.field_i + this.field_j;
              L1: while (true) {
                if (0 <= this.field_i) {
                  L2: while (true) {
                    if (4096 >= this.field_i) {
                      L3: {
                        if (-1 < (this.field_k ^ -1)) {
                          this.field_k = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (-4097 <= (this.field_k ^ -1)) {
                          break L4;
                        } else {
                          this.field_k = 4096;
                          break L4;
                        }
                      }
                      L5: {
                        if ((this.field_l ^ -1) <= -1) {
                          break L5;
                        } else {
                          this.field_l = 0;
                          break L5;
                        }
                      }
                      L6: {
                        if ((this.field_l ^ -1) >= -4097) {
                          break L6;
                        } else {
                          this.field_l = 4096;
                          break L6;
                        }
                      }
                      this.b(this.field_k, this.field_i, this.field_l, 4096);
                      var8[var11] = this.field_r;
                      var9[var11] = this.field_s;
                      var10[var11] = this.field_m;
                      var11++;
                      continue L0;
                    } else {
                      this.field_i = this.field_i - 4096;
                      continue L2;
                    }
                  }
                } else {
                  this.field_i = this.field_i + 4096;
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
        this.field_n = 0;
        this.field_o = 0;
        this.field_j = 0;
    }

    static {
    }
}
