/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jt extends hd implements lv {
    private gr field_Cb;
    int field_Db;
    String field_Eb;
    int field_zb;
    hd field_Ab;
    static rv field_Bb;
    static int field_yb;

    public final int a(int param0) {
        if (param0 != 15) {
          this.a(81, -99, 126);
          return 120;
        }
        return 120;
    }

    public static void h(byte param0) {
        if (param0 != -17) {
          return;
        }
        field_Bb = null;
    }

    final static wd a(int param0, byte param1, int param2, int param3) {
        int var5 = Kickabout.field_G;
        wd var4 = (wd) (ak.field_i.g(param1 + 23909));
        while (var4 != null) {
          if (var4.field_k == param2) {
            return var4;
          }
          var4 = (wd) (ak.field_i.c(33));
        }
        var4 = new wd();
        var4.field_p = param0;
        var4.field_k = param2;
        ak.field_i.a(var4, 3);
        if (param1 == 100) {
          vg.a(true, var4, param3);
          return var4;
        }
        nu var6 = (nu) null;
        jt.a((nu) null, (byte) 12, -47, -89);
        vg.a(true, var4, param3);
        return var4;
    }

    final void j(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int stackIn_10_0;
        boolean stackIn_10_1;
        int stackIn_10_2;
        int stackIn_10_3;
        boolean stackIn_11_4 = false;
        int stackIn_23_0;
        boolean stackIn_23_1;
        int stackIn_23_2;
        int stackIn_23_3;
        boolean stackIn_24_4 = false;
        int stackIn_32_0;
        boolean stackIn_32_1;
        int stackIn_32_2;
        int stackIn_32_3;
        boolean stackIn_33_4 = false;
        int stackIn_40_0;
        boolean stackIn_40_1;
        int stackIn_40_2;
        int stackIn_40_3;
        boolean stackIn_41_4 = false;
        int stackIn_62_0;
        boolean stackIn_62_1;
        int stackIn_62_2;
        int stackIn_62_3;
        boolean stackIn_63_4 = false;
        int stackIn_77_0;
        boolean stackIn_77_1;
        int stackIn_77_2;
        int stackIn_77_3;
        boolean stackIn_78_4 = false;
        int stackIn_90_0;
        boolean stackIn_90_1;
        int stackIn_90_2;
        int stackIn_90_3;
        boolean stackIn_91_4 = false;
        int stackIn_99_0;
        boolean stackIn_99_1;
        int stackIn_99_2;
        int stackIn_99_3;
        boolean stackIn_100_4 = false;
        int stackIn_107_0;
        boolean stackIn_107_1;
        int stackIn_107_2;
        int stackIn_107_3;
        boolean stackIn_108_4 = false;
        var2 = this.i(-29050) ? 1 : 0;
        var3 = this.k(-9) ? 1 : 0;
        var4 = this.h(param0 ^ 55) ? 1 : 0;
        var5 = this.field_zb + this.field_Db * 4;
        var6 = 10;
        if (2 != this.field_zb) {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_zb == 3) {
            if (2 != this.field_Db) {
              if (this.field_zb == 3 &&
                this.field_Db == 1) {
                var6 -= 8;
              }
              if (param0 != 0) {
                this.field_Db = -70;
              }
              stackIn_10_0 = var5;
              stackIn_10_1 = this.field_gb;
              stackIn_10_2 = -2 + this.field_T;
              stackIn_10_3 = -2 + this.field_F - var6;
              stackIn_11_4 = (var2 != 0) ? false : true;
              jg.a(stackIn_10_0, stackIn_10_1, stackIn_10_2, stackIn_10_3, stackIn_11_4, var3 != 0, 4);
              decompiledFrameRemainder0 = false;
            }
            else {
              var6 -= 4;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.field_zb == 3 &&
              this.field_Db == 1) {
              var6 -= 8;
              if (param0 != 0) {
                this.field_Db = -70;
              }
              stackIn_23_0 = var5;
              stackIn_23_1 = this.field_gb;
              stackIn_23_2 = -2 + this.field_T;
              stackIn_23_3 = -2 + this.field_F - var6;
              stackIn_24_4 = (var2 != 0) ? false : true;
              jg.a(stackIn_23_0, stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_24_4, var3 != 0, 4);
            } else {
              if (param0 == 0) {
                stackIn_32_0 = var5;
                stackIn_32_1 = this.field_gb;
                stackIn_32_2 = -2 + this.field_T;
                stackIn_32_3 = -2 + this.field_F - var6;
                stackIn_33_4 = (var2 != 0) ? false : true;
                jg.a(stackIn_32_0, stackIn_32_1, stackIn_32_2, stackIn_32_3, stackIn_33_4, var3 != 0, 4);
              } else {
                this.field_Db = -70;
                stackIn_40_0 = var5;
                stackIn_40_1 = this.field_gb;
                stackIn_40_2 = -2 + this.field_T;
                stackIn_40_3 = -2 + this.field_F - var6;
                stackIn_41_4 = (var2 != 0) ? false : true;
                jg.a(stackIn_40_0, stackIn_40_1, stackIn_40_2, stackIn_40_3, stackIn_41_4, var3 != 0, 4);
              }
            }
          }
        } else {
          if (this.field_Db == 2) {
            var6 += 5;
            if (this.field_zb == 3 &&
              2 == this.field_Db) {
              var6 -= 4;
            }
            if (this.field_zb == 3 &&
              this.field_Db == 1) {
              var6 -= 8;
            }
            if (param0 != 0) {
              this.field_Db = -70;
            }
            stackIn_62_0 = var5;
            stackIn_62_1 = this.field_gb;
            stackIn_62_2 = -2 + this.field_T;
            stackIn_62_3 = -2 + this.field_F - var6;
            stackIn_63_4 = (var2 != 0) ? false : true;
            jg.a(stackIn_62_0, stackIn_62_1, stackIn_62_2, stackIn_62_3, stackIn_63_4, var3 != 0, 4);
          } else {
            if (this.field_zb == 3) {
              if (2 != this.field_Db) {
                if (this.field_zb == 3 &&
                  this.field_Db == 1) {
                  var6 -= 8;
                }
                if (param0 != 0) {
                  this.field_Db = -70;
                }
                stackIn_77_0 = var5;
                stackIn_77_1 = this.field_gb;
                stackIn_77_2 = -2 + this.field_T;
                stackIn_77_3 = -2 + this.field_F - var6;
                stackIn_78_4 = (var2 != 0) ? false : true;
                jg.a(stackIn_77_0, stackIn_77_1, stackIn_77_2, stackIn_77_3, stackIn_78_4, var3 != 0, 4);
                q.field_d.d(h.field_b[this.field_Db][this.field_zb].toUpperCase(), this.field_F + (this.field_q >> 1), this.field_mb + this.field_T - 9, 16777215, -1);
                if (var2 == 0) {
                  pb.field_C.d(this.field_Eb, -2 + ((this.field_q >> 1) + this.field_F), this.field_T + 40, 16777215, -1);
                }
                if (var4 != 0) {
                  fc.field_h.c(this.field_F + (-fc.field_h.field_o + this.field_q >> 1), this.field_T + (-fc.field_h.field_v + this.field_mb >> 1) + 10);
                }
                return;
              }
              var6 -= 4;
            }
            if (this.field_zb == 3 &&
              this.field_Db == 1) {
              var6 -= 8;
              if (param0 != 0) {
                this.field_Db = -70;
              }
              stackIn_90_0 = var5;
              stackIn_90_1 = this.field_gb;
              stackIn_90_2 = -2 + this.field_T;
              stackIn_90_3 = -2 + this.field_F - var6;
              stackIn_91_4 = (var2 != 0) ? false : true;
              jg.a(stackIn_90_0, stackIn_90_1, stackIn_90_2, stackIn_90_3, stackIn_91_4, var3 != 0, 4);
              q.field_d.d(h.field_b[this.field_Db][this.field_zb].toUpperCase(), this.field_F + (this.field_q >> 1), this.field_mb + this.field_T - 9, 16777215, -1);
              if (var2 == 0) {
                pb.field_C.d(this.field_Eb, -2 + ((this.field_q >> 1) + this.field_F), this.field_T + 40, 16777215, -1);
              }
              if (var4 != 0) {
                fc.field_h.c(this.field_F + (-fc.field_h.field_o + this.field_q >> 1), this.field_T + (-fc.field_h.field_v + this.field_mb >> 1) + 10);
              }
              return;
            }
            if (param0 == 0) {
              stackIn_99_0 = var5;
              stackIn_99_1 = this.field_gb;
              stackIn_99_2 = -2 + this.field_T;
              stackIn_99_3 = -2 + this.field_F - var6;
              stackIn_100_4 = (var2 != 0) ? false : true;
              jg.a(stackIn_99_0, stackIn_99_1, stackIn_99_2, stackIn_99_3, stackIn_100_4, var3 != 0, 4);
            } else {
              this.field_Db = -70;
              stackIn_107_0 = var5;
              stackIn_107_1 = this.field_gb;
              stackIn_107_2 = -2 + this.field_T;
              stackIn_107_3 = -2 + this.field_F - var6;
              stackIn_108_4 = (var2 != 0) ? false : true;
              jg.a(stackIn_107_0, stackIn_107_1, stackIn_107_2, stackIn_107_3, stackIn_108_4, var3 != 0, 4);
            }
          }
        }
        q.field_d.d(h.field_b[this.field_Db][this.field_zb].toUpperCase(), this.field_F + (this.field_q >> 1), this.field_mb + this.field_T - 9, 16777215, -1);
        if (var2 == 0) {
          pb.field_C.d(this.field_Eb, -2 + ((this.field_q >> 1) + this.field_F), this.field_T + 40, 16777215, -1);
        }
        if (var4 != 0) {
          fc.field_h.c(this.field_F + (-fc.field_h.field_o + this.field_q >> 1), this.field_T + (-fc.field_h.field_v + this.field_mb >> 1) + 10);
        }
    }

    jt(gr param0, int param1, int param2) {
        try {
          this.field_mb = 105;
          this.field_zb = param2;
          this.field_Db = param1;
          this.field_Cb = param0;
          this.field_q = 80;
          this.field_Eb = ad.a(cm.field_M[this.field_zb], 26300);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "jt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean k(int param0) {
        if (param0 != -9) {
          this.j(93);
          if (this.field_Cb.field_o != this.field_zb) {
            return false;
          }
          if (this.field_Db == this.field_Cb.field_K) {
            return true;
          }
          return false;
        }
        if (this.field_Cb.field_o != this.field_zb) {
          return false;
        }
        if (this.field_Db == this.field_Cb.field_K) {
          return true;
        }
        return false;
    }

    private final boolean h(int param0) {
        if (param0 <= 43) {
          this.j(123);
          if (this.field_zb == 0) {
            return false;
          }
          if (!this.field_Cb.field_a[this.field_Db][this.field_zb - 1]) {
            return true;
          }
          return false;
        }
        if (this.field_zb == 0) {
          return false;
        }
        if (!this.field_Cb.field_a[this.field_Db][this.field_zb - 1]) {
          return true;
        }
        return false;
    }

    final boolean i(int param0) {
        if (param0 == -29050) {
          return this.field_Cb.field_a[this.field_Db][this.field_zb];
        }
        this.field_Ab = (hd) null;
        return this.field_Cb.field_a[this.field_Db][this.field_zb];
    }

    public final int b(int param0) {
        if (param0 != 0) {
          this.j(66);
          return 110;
        }
        return 110;
    }

    public final void a(int param0, int param1, int param2) {
        int stackIn_11_0;
        boolean stackIn_11_1;
        int stackIn_11_2;
        int stackIn_11_3;
        boolean stackIn_12_4 = false;
        int stackIn_21_0;
        boolean stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        boolean stackIn_22_4 = false;
        int stackIn_26_0;
        boolean stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        boolean stackIn_27_4 = false;
        int stackIn_31_0;
        boolean stackIn_31_1;
        int stackIn_31_2;
        int stackIn_31_3;
        boolean stackIn_32_4 = false;
        int stackIn_35_0;
        boolean stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        boolean stackIn_36_4 = false;
        int stackIn_49_0;
        boolean stackIn_49_1;
        int stackIn_49_2;
        int stackIn_49_3;
        boolean stackIn_50_4 = false;
        int stackIn_56_0;
        boolean stackIn_56_1;
        int stackIn_56_2;
        int stackIn_56_3;
        boolean stackIn_57_4 = false;
        int stackIn_61_0;
        boolean stackIn_61_1;
        int stackIn_61_2;
        int stackIn_61_3;
        boolean stackIn_62_4 = false;
        int stackIn_65_0;
        boolean stackIn_65_1;
        int stackIn_65_2;
        int stackIn_65_3;
        boolean stackIn_66_4 = false;
        int stackIn_71_0;
        boolean stackIn_71_1;
        int stackIn_71_2;
        int stackIn_71_3;
        boolean stackIn_72_4 = false;
        int stackIn_76_0;
        boolean stackIn_76_1;
        int stackIn_76_2;
        int stackIn_76_3;
        boolean stackIn_77_4 = false;
        int stackIn_80_0;
        boolean stackIn_80_1;
        int stackIn_80_2;
        int stackIn_80_3;
        boolean stackIn_81_4 = false;
        int stackIn_93_0;
        boolean stackIn_93_1;
        int stackIn_93_2;
        int stackIn_93_3;
        boolean stackIn_94_4 = false;
        int stackIn_103_0;
        boolean stackIn_103_1;
        int stackIn_103_2;
        int stackIn_103_3;
        boolean stackIn_104_4 = false;
        int stackIn_108_0;
        boolean stackIn_108_1;
        int stackIn_108_2;
        int stackIn_108_3;
        boolean stackIn_109_4 = false;
        int stackIn_113_0;
        boolean stackIn_113_1;
        int stackIn_113_2;
        int stackIn_113_3;
        boolean stackIn_114_4 = false;
        int stackIn_117_0;
        boolean stackIn_117_1;
        int stackIn_117_2;
        int stackIn_117_3;
        boolean stackIn_118_4 = false;
        int var4;
        int var5;
        var4 = 4 * this.field_Db + this.field_zb;
        var5 = param2 - 55;
        if (2 != this.field_zb) {
          boolean decompiledFrameRemainder1 = true;
          if (this.field_zb == 3) {
            if (this.field_Db != 2) {
              if (param1 != 23) {
                this.field_zb = -32;
              }
              if (this.field_zb == 3 &&
                this.field_Db == 1) {
                var5 += 8;
              }
              stackIn_11_0 = var4;
              stackIn_11_1 = false;
              stackIn_11_2 = -48 + param0;
              stackIn_11_3 = var5;
              stackIn_12_4 = (this.i(-29050)) ? false : true;
              jg.a(stackIn_11_0, stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_12_4, false, param1 ^ 19);
              decompiledFrameRemainder1 = false;
            }
            else {
              var5 += 4;
            }
          }
          if (decompiledFrameRemainder1) {
            if (param1 != 23) {
              this.field_zb = -32;
              if (this.field_zb == 3 &&
                this.field_Db == 1) {
                var5 += 8;
              }
              stackIn_21_0 = var4;
              stackIn_21_1 = false;
              stackIn_21_2 = -48 + param0;
              stackIn_21_3 = var5;
              stackIn_22_4 = (this.i(-29050)) ? false : true;
              jg.a(stackIn_21_0, stackIn_21_1, stackIn_21_2, stackIn_21_3, stackIn_22_4, false, param1 ^ 19);
            } else {
              if (this.field_zb != 3) {
                stackIn_26_0 = var4;
                stackIn_26_1 = false;
                stackIn_26_2 = -48 + param0;
                stackIn_26_3 = var5;
                stackIn_27_4 = (this.i(-29050)) ? false : true;
                jg.a(stackIn_26_0, stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_27_4, false, param1 ^ 19);
              } else {
                if (this.field_Db != 1) {
                  stackIn_35_0 = var4;
                  stackIn_35_1 = false;
                  stackIn_35_2 = -48 + param0;
                  stackIn_35_3 = var5;
                  stackIn_36_4 = (this.i(-29050)) ? false : true;
                  jg.a(stackIn_35_0, stackIn_35_1, stackIn_35_2, stackIn_35_3, stackIn_36_4, false, param1 ^ 19);
                } else {
                  var5 += 8;
                  stackIn_31_0 = var4;
                  stackIn_31_1 = false;
                  stackIn_31_2 = -48 + param0;
                  stackIn_31_3 = var5;
                  stackIn_32_4 = (this.i(-29050)) ? false : true;
                  jg.a(stackIn_31_0, stackIn_31_1, stackIn_31_2, stackIn_31_3, stackIn_32_4, false, param1 ^ 19);
                }
              }
            }
          }
        } else {
          if (2 == this.field_Db) {
            var5 -= 5;
            boolean decompiledFrameRemainder0 = true;
            if (this.field_zb == 3) {
              if (this.field_Db != 2) {
                if (param1 != 23) {
                  this.field_zb = -32;
                }
                if (this.field_zb == 3 &&
                  this.field_Db == 1) {
                  var5 += 8;
                }
                stackIn_93_0 = var4;
                stackIn_93_1 = false;
                stackIn_93_2 = -48 + param0;
                stackIn_93_3 = var5;
                stackIn_94_4 = (this.i(-29050)) ? false : true;
                jg.a(stackIn_93_0, stackIn_93_1, stackIn_93_2, stackIn_93_3, stackIn_94_4, false, param1 ^ 19);
                decompiledFrameRemainder0 = false;
              }
              else {
                var5 += 4;
              }
            }
            if (decompiledFrameRemainder0) {
              if (param1 != 23) {
                this.field_zb = -32;
                if (this.field_zb == 3 &&
                  this.field_Db == 1) {
                  var5 += 8;
                }
                stackIn_103_0 = var4;
                stackIn_103_1 = false;
                stackIn_103_2 = -48 + param0;
                stackIn_103_3 = var5;
                stackIn_104_4 = (this.i(-29050)) ? false : true;
                jg.a(stackIn_103_0, stackIn_103_1, stackIn_103_2, stackIn_103_3, stackIn_104_4, false, param1 ^ 19);
              } else {
                if (this.field_zb != 3) {
                  stackIn_108_0 = var4;
                  stackIn_108_1 = false;
                  stackIn_108_2 = -48 + param0;
                  stackIn_108_3 = var5;
                  stackIn_109_4 = (this.i(-29050)) ? false : true;
                  jg.a(stackIn_108_0, stackIn_108_1, stackIn_108_2, stackIn_108_3, stackIn_109_4, false, param1 ^ 19);
                } else {
                  if (this.field_Db != 1) {
                    stackIn_117_0 = var4;
                    stackIn_117_1 = false;
                    stackIn_117_2 = -48 + param0;
                    stackIn_117_3 = var5;
                    stackIn_118_4 = (this.i(-29050)) ? false : true;
                    jg.a(stackIn_117_0, stackIn_117_1, stackIn_117_2, stackIn_117_3, stackIn_118_4, false, param1 ^ 19);
                  } else {
                    var5 += 8;
                    stackIn_113_0 = var4;
                    stackIn_113_1 = false;
                    stackIn_113_2 = -48 + param0;
                    stackIn_113_3 = var5;
                    stackIn_114_4 = (this.i(-29050)) ? false : true;
                    jg.a(stackIn_113_0, stackIn_113_1, stackIn_113_2, stackIn_113_3, stackIn_114_4, false, param1 ^ 19);
                  }
                }
              }
            }
          } else {
            if (this.field_zb == 3) {
              if (this.field_Db != 2) {
                if (param1 != 23) {
                  this.field_zb = -32;
                }
                if (this.field_zb == 3 &&
                  this.field_Db == 1) {
                  var5 += 8;
                }
                stackIn_49_0 = var4;
                stackIn_49_1 = false;
                stackIn_49_2 = -48 + param0;
                stackIn_49_3 = var5;
                stackIn_50_4 = (this.i(-29050)) ? false : true;
                jg.a(stackIn_49_0, stackIn_49_1, stackIn_49_2, stackIn_49_3, stackIn_50_4, false, param1 ^ 19);
                q.field_d.d(h.field_b[this.field_Db][this.field_zb], -5 + param2, 8 + param0, 16777215, -1);
                return;
              }
              var5 += 4;
            }
            if (param1 == 23) {
              if (this.field_zb != 3) {
                stackIn_71_0 = var4;
                stackIn_71_1 = false;
                stackIn_71_2 = -48 + param0;
                stackIn_71_3 = var5;
                stackIn_72_4 = (this.i(-29050)) ? false : true;
                jg.a(stackIn_71_0, stackIn_71_1, stackIn_71_2, stackIn_71_3, stackIn_72_4, false, param1 ^ 19);
              } else {
                if (this.field_Db != 1) {
                  stackIn_80_0 = var4;
                  stackIn_80_1 = false;
                  stackIn_80_2 = -48 + param0;
                  stackIn_80_3 = var5;
                  stackIn_81_4 = (this.i(-29050)) ? false : true;
                  jg.a(stackIn_80_0, stackIn_80_1, stackIn_80_2, stackIn_80_3, stackIn_81_4, false, param1 ^ 19);
                } else {
                  var5 += 8;
                  stackIn_76_0 = var4;
                  stackIn_76_1 = false;
                  stackIn_76_2 = -48 + param0;
                  stackIn_76_3 = var5;
                  stackIn_77_4 = (this.i(-29050)) ? false : true;
                  jg.a(stackIn_76_0, stackIn_76_1, stackIn_76_2, stackIn_76_3, stackIn_77_4, false, param1 ^ 19);
                }
              }
            } else {
              this.field_zb = -32;
              if (this.field_zb != 3) {
                stackIn_56_0 = var4;
                stackIn_56_1 = false;
                stackIn_56_2 = -48 + param0;
                stackIn_56_3 = var5;
                stackIn_57_4 = (this.i(-29050)) ? false : true;
                jg.a(stackIn_56_0, stackIn_56_1, stackIn_56_2, stackIn_56_3, stackIn_57_4, false, param1 ^ 19);
              } else {
                if (this.field_Db != 1) {
                  stackIn_65_0 = var4;
                  stackIn_65_1 = false;
                  stackIn_65_2 = -48 + param0;
                  stackIn_65_3 = var5;
                  stackIn_66_4 = (this.i(-29050)) ? false : true;
                  jg.a(stackIn_65_0, stackIn_65_1, stackIn_65_2, stackIn_65_3, stackIn_66_4, false, param1 ^ 19);
                } else {
                  var5 += 8;
                  stackIn_61_0 = var4;
                  stackIn_61_1 = false;
                  stackIn_61_2 = -48 + param0;
                  stackIn_61_3 = var5;
                  stackIn_62_4 = (this.i(-29050)) ? false : true;
                  jg.a(stackIn_61_0, stackIn_61_1, stackIn_61_2, stackIn_61_3, stackIn_62_4, false, param1 ^ 19);
                }
              }
            }
          }
        }
        q.field_d.d(h.field_b[this.field_Db][this.field_zb], -5 + param2, 8 + param0, 16777215, -1);
    }

    final static boolean a(nu param0, byte param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -127) {
            field_yb = -107;
          }
          stackIn_5_0 = (param0.a((byte) 6, param3, param2) < 0) ? 0 : 1;
          var4_int = stackIn_5_0;
          stackIn_8_0 = (param0.field_X.field_m < 40) ? 0 : 1;
          var5 = stackIn_8_0;
          var6 = param0.field_P[param3][param2].field_u;
          if (var5 == 0) {
            if (var6 != 0) {
              return false;
            }
            if (var4_int != 0) {
              return false;
            }
            ri.a((byte) -93, param2, param0, param3);
          } else {
            var7 = 1 - param0.field_X.field_n;
            if (param0.field_p) {
              var7 = 0;
            }
            go.a(cp.a((byte) 21, param2, param3, var7), param0, 0, param3, param2, ts.a(param2, var7, param3, 448));
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("jt.F(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(int param0, boolean param1) {
        hd stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        hd stackIn_34_0 = null;
        boolean stackIn_35_1 = false;
        hd stackIn_59_0 = null;
        boolean stackIn_60_1 = false;
        int stackIn_78_0 = 0;
        String stackIn_79_1 = null;
        hd stackIn_98_0 = null;
        boolean stackIn_99_1 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        var7 = Kickabout.field_G;
        if (param0 != 3784) {
          return;
        }
        var3 = this.i(-29050) ? 1 : 0;
        var4 = this.k(-9) ? 1 : 0;
        var5 = this.h(127) ? 1 : 0;
        if (!param1) {
          if (null != this.field_Ab) {
            var6 = cm.field_M[this.field_zb];
            stackIn_9_0 = this.field_Ab;
            stackIn_10_1 = (var6 > this.field_Cb.field_x) ? false : true;
            stackIn_9_0.field_lb = stackIn_10_1;
            if (param1 &&
              this.field_Ab.field_Q &&
              this.field_lb) {
              if (!this.field_Ab.field_lb) {
                qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, tt.field_d, new String[]{this.field_Eb}));
              } else {
                qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, pe.field_a, new String[]{this.field_Eb}));
              }
            }
            if (var3 != 0) {
              this.field_Ab.c((byte) -109);
              this.field_Ab = null;
            } else {
              if (var5 != 0) {
                this.field_Ab.c((byte) -109);
                this.field_Ab = null;
              }
            }
          } else {
            if (var3 == 0 &&
              var5 == 0) {
              this.field_Ab = eo.b();
              this.a((byte) -123, this.field_Ab);
              this.field_Ab.field_J = (-this.field_Ab.field_J + this.field_mb >> 1) - 3;
              this.field_Ab.field_s = -this.field_Ab.field_q + this.field_q >> 1;
            }
          }
          if (this.field_sb == 1 &&
            this.i(param0 - 32834)) {
            kj.a((byte) -111);
          }
          return;
        }
        if (!this.field_gb) {
          if (null != this.field_Ab) {
            var6Lifetime1 = cm.field_M[this.field_zb];
            stackIn_34_0 = this.field_Ab;
            stackIn_35_1 = !(var6Lifetime1 > this.field_Cb.field_x);
            stackIn_34_0.field_lb = stackIn_35_1;
            if (param1 &&
              this.field_Ab.field_Q &&
              this.field_lb) {
              if (!this.field_Ab.field_lb) {
                qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, tt.field_d, new String[]{this.field_Eb}));
              } else {
                qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, pe.field_a, new String[]{this.field_Eb}));
              }
            }
            if (var3 != 0 ||
              var5 != 0) {
              this.field_Ab.c((byte) -109);
              this.field_Ab = null;
            }
          } else {
            if (var3 == 0 &&
              var5 == 0) {
              this.field_Ab = eo.b();
              this.a((byte) -123, this.field_Ab);
              this.field_Ab.field_J = (-this.field_Ab.field_J + this.field_mb >> 1) - 3;
              this.field_Ab.field_s = -this.field_Ab.field_q + this.field_q >> 1;
            }
          }
          if (this.field_sb == 1 &&
            this.i(param0 - 32834)) {
            kj.a((byte) -111);
          }
          return;
        }
        if (this.field_lb) {
          if (var3 != 0) {
            stackIn_78_0 = -67;
            if (var4 != 0) {
              stackIn_79_1 = ja.field_I;
            } else {
              stackIn_79_1 = vj.field_e;
            }
            qd.$cfr$intArgs$a$b6210757cdab(stackIn_78_0, stackIn_79_1);
          } else {
            if (var5 != 0) {
              qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, li.field_e, new String[]{h.field_b[this.field_Db][this.field_zb], h.field_b[this.field_Db][this.field_zb - 1]}));
              if (null != this.field_Ab) {
                var6Lifetime2 = cm.field_M[this.field_zb];
                stackIn_59_0 = this.field_Ab;
                stackIn_60_1 = !(var6Lifetime2 > this.field_Cb.field_x);
                stackIn_59_0.field_lb = stackIn_60_1;
                if (param1 &&
                  this.field_Ab.field_Q &&
                  this.field_lb) {
                  if (!this.field_Ab.field_lb) {
                    qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, tt.field_d, new String[]{this.field_Eb}));
                  } else {
                    qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, pe.field_a, new String[]{this.field_Eb}));
                  }
                }
                this.field_Ab.c((byte) -109);
                this.field_Ab = null;
              } else {
              }
              if (this.field_sb == 1 &&
                this.i(param0 - 32834)) {
                kj.a((byte) -111);
              }
              return;
            }
          }
        }
        if (null != this.field_Ab) {
          var6Lifetime3 = cm.field_M[this.field_zb];
          stackIn_98_0 = this.field_Ab;
          stackIn_99_1 = (var6Lifetime3 > this.field_Cb.field_x) ? false : true;
          stackIn_98_0.field_lb = stackIn_99_1;
          if (param1 &&
            this.field_Ab.field_Q) {
            if (!this.field_lb) {
              if (var3 != 0 ||
                var5 != 0) {
                this.field_Ab.c((byte) -109);
                this.field_Ab = null;
              }
            } else {
              if (!this.field_Ab.field_lb) {
                qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, tt.field_d, new String[]{this.field_Eb}));
                if (var3 != 0 ||
                  var5 != 0) {
                  this.field_Ab.c((byte) -109);
                  this.field_Ab = null;
                }
              } else {
                qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, pe.field_a, new String[]{this.field_Eb}));
                if (var3 != 0 ||
                  var5 != 0) {
                  this.field_Ab.c((byte) -109);
                  this.field_Ab = null;
                }
              }
            }
          } else {
            if (var3 != 0 ||
              var5 != 0) {
              this.field_Ab.c((byte) -109);
              this.field_Ab = null;
            }
          }
        } else {
          if (var3 == 0 &&
            var5 == 0) {
            this.field_Ab = eo.b();
            this.a((byte) -123, this.field_Ab);
            this.field_Ab.field_J = (-this.field_Ab.field_J + this.field_mb >> 1) - 3;
            this.field_Ab.field_s = -this.field_Ab.field_q + this.field_q >> 1;
          }
        }
        if (this.field_sb != 1) {
          return;
        }
        if (!this.i(param0 - 32834)) {
          return;
        }
        kj.a((byte) -111);
        return;
    }

    static {
        field_Bb = new rv();
    }
}
