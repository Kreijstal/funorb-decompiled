/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    private boolean field_c;
    static String field_i;
    static String field_j;
    private int field_a;
    static String field_k;
    private int field_f;
    private boolean field_d;
    private boolean field_e;
    private int field_m;
    private boolean field_g;
    static String field_h;
    private fb[] field_b;
    private int field_l;

    public static void d(int param0) {
        int var1 = 98 / ((-2 - param0) / 60);
        field_j = null;
        field_i = null;
        field_h = null;
        field_k = null;
    }

    private final void a(ja param0, byte param1, ja param2) {
        param0.g(-(param0.field_x / 2) + 320, 400);
        if (param1 != 59) {
            return;
        }
        try {
            g.a(param2, 320 + -(param2.field_x / 2), 400);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ko.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, int param2) {
        if (param0 > 61) {
          this.field_m = this.field_m + 1;
          if (-256 != (param1 ^ -1)) {
            if (-20 < (param1 ^ -1)) {
              if (!ll.field_k.a(45, -128)) {
                if (!h.i(51603)) {
                  if (this.field_m != 8) {
                    this.field_b[-1 + this.field_m] = new fb(190 + (this.field_m * 40 - 40), param1, this.field_m + -1);
                    this.field_b[-1 + this.field_m].field_l = -op.field_m.field_H + tg.field_e.field_b[this.field_m + -1];
                    this.field_b[this.field_m - 1].a(0);
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  if (!jk.a((byte) -73, param1)) {
                    if (!jk.a((byte) -122, param2)) {
                      if (this.field_m == 8) {
                        return false;
                      } else {
                        this.field_b[-1 + this.field_m] = new fb(190 + (this.field_m * 40 - 40), param1, this.field_m + -1);
                        this.field_b[-1 + this.field_m].field_l = -op.field_m.field_H + tg.field_e.field_b[this.field_m + -1];
                        this.field_b[this.field_m - 1].a(0);
                        return true;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                if ((param1 ^ -1) == -18) {
                  if (!h.i(51603)) {
                    if (this.field_m == 8) {
                      return false;
                    } else {
                      this.field_b[-1 + this.field_m] = new fb(190 + (this.field_m * 40 - 40), param1, this.field_m + -1);
                      this.field_b[-1 + this.field_m].field_l = -op.field_m.field_H + tg.field_e.field_b[this.field_m + -1];
                      this.field_b[this.field_m - 1].a(0);
                      return true;
                    }
                  } else {
                    if (!jk.a((byte) -73, param1)) {
                      if (!jk.a((byte) -122, param2)) {
                        if (this.field_m != 8) {
                          this.field_b[-1 + this.field_m] = new fb(190 + (this.field_m * 40 - 40), param1, this.field_m + -1);
                          this.field_b[-1 + this.field_m].field_l = -op.field_m.field_H + tg.field_e.field_b[this.field_m + -1];
                          this.field_b[this.field_m - 1].a(0);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_j = (String) null;
          this.field_m = this.field_m + 1;
          if (-256 != (param1 ^ -1)) {
            if (-20 < (param1 ^ -1)) {
              if (!ll.field_k.a(45, -128)) {
                if (!h.i(51603)) {
                  if (this.field_m != 8) {
                    this.field_b[-1 + this.field_m] = new fb(190 + (this.field_m * 40 - 40), param1, this.field_m + -1);
                    this.field_b[-1 + this.field_m].field_l = -op.field_m.field_H + tg.field_e.field_b[this.field_m + -1];
                    this.field_b[this.field_m - 1].a(0);
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  if (!jk.a((byte) -73, param1)) {
                    if (!jk.a((byte) -122, param2)) {
                      if (this.field_m != 8) {
                        this.field_b[-1 + this.field_m] = new fb(190 + (this.field_m * 40 - 40), param1, this.field_m + -1);
                        this.field_b[-1 + this.field_m].field_l = -op.field_m.field_H + tg.field_e.field_b[this.field_m + -1];
                        this.field_b[this.field_m - 1].a(0);
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                if ((param1 ^ -1) == -18) {
                  L0: {
                    if (!h.i(51603)) {
                      break L0;
                    } else {
                      L1: {
                        if (jk.a((byte) -73, param1)) {
                          break L1;
                        } else {
                          if (jk.a((byte) -122, param2)) {
                            break L1;
                          } else {
                            break L0;
                          }
                        }
                      }
                      return false;
                    }
                  }
                  if (this.field_m != 8) {
                    this.field_b[-1 + this.field_m] = new fb(190 + (this.field_m * 40 - 40), param1, this.field_m + -1);
                    this.field_b[-1 + this.field_m].field_l = -op.field_m.field_H + tg.field_e.field_b[this.field_m + -1];
                    this.field_b[this.field_m - 1].a(0);
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final boolean a(byte param0) {
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 <= -111) {
          if (!this.field_c) {
            if (!this.field_e) {
              if (!this.field_g) {
                if (!this.field_d) {
                  return false;
                } else {
                  return true;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                return stackIn_9_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final boolean g(int param0) {
        if (param0 != 13) {
            return false;
        }
        return this.field_c;
    }

    final void a(int param0, int param1, byte param2) {
        boolean discarded$1 = false;
        fb[] var4_ref_fb__ = null;
        int var4 = 0;
        int var5 = 0;
        fb var6_ref_fb = null;
        int var6 = 0;
        int var7 = 0;
        fb[] var8 = null;
        fb var9 = null;
        fb var10 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var8 = this.field_b;
        var4_ref_fb__ = var8;
        var5 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var5 >= var8.length) {
                break L2;
              } else {
                var6_ref_fb = var8[var5];
                var9 = var6_ref_fb;
                var10 = var9;
                var9 = var6_ref_fb;
                if (var7 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (var6_ref_fb == null) {
                      break L3;
                    } else {
                      var6_ref_fb.a(param1, param0, 255);
                      break L3;
                    }
                  }
                  var5++;
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            this.field_a = -1;
            break L1;
          }
          if (param2 >= 64) {
            var4 = 0;
            L4: while (true) {
              if (var4 < this.field_b.length) {
                var10 = this.field_b[var4];
                if (var7 == 0) {
                  L5: {
                    if (var10 == null) {
                      break L5;
                    } else {
                      var6 = var10.a(param1, (byte) -66);
                      if (-1 != var6) {
                        this.field_f = 20 + var10.field_m;
                        this.field_a = var4;
                        break L5;
                      } else {
                        var4++;
                        continue L4;
                      }
                    }
                  }
                  var4++;
                  continue L4;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            discarded$1 = this.b(119, 56, -64);
            var4 = 0;
            L6: while (true) {
              if (var4 < this.field_b.length) {
                var9 = this.field_b[var4];
                var10 = var9;
                var10 = var9;
                if (var7 == 0) {
                  L7: {
                    if (var9 == null) {
                      break L7;
                    } else {
                      var6 = var9.a(param1, (byte) -66);
                      if (-1 != var6) {
                        this.field_f = 20 + var9.field_m;
                        this.field_a = var4;
                        break L7;
                      } else {
                        var4++;
                        continue L6;
                      }
                    }
                  }
                  var4++;
                  continue L6;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final static void a(boolean param0, int param1, boolean param2, boolean param3) {
        int var5 = 0;
        cj stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        cj stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        cj stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        cj stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        cj stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        cj stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        cj stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        cj stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        cj stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        cj stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        cj stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        cj stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        cj stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        cj stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        cj stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        cj stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        cj stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        cj stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        cj stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        cj stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        cj stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        cj stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        cj stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        cj stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        cj stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        cj stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        cj stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        cj stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        cj stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        cj stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        cj stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        cj stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        cj stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        cj stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        cj stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        cj stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        cj stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        cj stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        cj stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        cj stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        cj stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        cj stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        cj stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        cj stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        int stackIn_150_2 = 0;
        cj stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        cj stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        cj stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        cj stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        cj stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        cj stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        cj stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        int stackIn_157_2 = 0;
        cj stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        cj stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        cj stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        cj stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        cj stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        int stackIn_162_2 = 0;
        cj stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        cj stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        cj stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        cj stackIn_189_0 = null;
        int stackIn_189_1 = 0;
        cj stackIn_190_0 = null;
        int stackIn_190_1 = 0;
        cj stackIn_191_0 = null;
        int stackIn_191_1 = 0;
        cj stackIn_192_0 = null;
        int stackIn_192_1 = 0;
        int stackIn_192_2 = 0;
        cj stackIn_193_0 = null;
        int stackIn_193_1 = 0;
        cj stackIn_194_0 = null;
        int stackIn_194_1 = 0;
        cj stackIn_195_0 = null;
        int stackIn_195_1 = 0;
        cj stackIn_196_0 = null;
        int stackIn_196_1 = 0;
        cj stackIn_197_0 = null;
        int stackIn_197_1 = 0;
        cj stackIn_198_0 = null;
        int stackIn_198_1 = 0;
        cj stackIn_199_0 = null;
        int stackIn_199_1 = 0;
        int stackIn_199_2 = 0;
        cj stackIn_200_0 = null;
        int stackIn_200_1 = 0;
        cj stackIn_201_0 = null;
        int stackIn_201_1 = 0;
        cj stackIn_202_0 = null;
        int stackIn_202_1 = 0;
        cj stackIn_203_0 = null;
        int stackIn_203_1 = 0;
        cj stackIn_204_0 = null;
        int stackIn_204_1 = 0;
        int stackIn_204_2 = 0;
        cj stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        cj stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        cj stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        cj stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        cj stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        cj stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        cj stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        cj stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        cj stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        cj stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        cj stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        cj stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        cj stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        cj stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        cj stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        cj stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        cj stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        cj stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        cj stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        cj stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        cj stackOut_186_0 = null;
        int stackOut_186_1 = 0;
        cj stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        cj stackOut_188_0 = null;
        int stackOut_188_1 = 0;
        cj stackOut_189_0 = null;
        int stackOut_189_1 = 0;
        cj stackOut_190_0 = null;
        int stackOut_190_1 = 0;
        int stackOut_190_2 = 0;
        cj stackOut_191_0 = null;
        int stackOut_191_1 = 0;
        int stackOut_191_2 = 0;
        cj stackOut_192_0 = null;
        int stackOut_192_1 = 0;
        cj stackOut_193_0 = null;
        int stackOut_193_1 = 0;
        cj stackOut_194_0 = null;
        int stackOut_194_1 = 0;
        cj stackOut_195_0 = null;
        int stackOut_195_1 = 0;
        cj stackOut_196_0 = null;
        int stackOut_196_1 = 0;
        cj stackOut_197_0 = null;
        int stackOut_197_1 = 0;
        int stackOut_197_2 = 0;
        cj stackOut_198_0 = null;
        int stackOut_198_1 = 0;
        int stackOut_198_2 = 0;
        cj stackOut_199_0 = null;
        int stackOut_199_1 = 0;
        cj stackOut_200_0 = null;
        int stackOut_200_1 = 0;
        cj stackOut_201_0 = null;
        int stackOut_201_1 = 0;
        cj stackOut_202_0 = null;
        int stackOut_202_1 = 0;
        int stackOut_202_2 = 0;
        cj stackOut_203_0 = null;
        int stackOut_203_1 = 0;
        int stackOut_203_2 = 0;
        cj stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        cj stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        cj stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        cj stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        cj stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        cj stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        int stackOut_148_2 = 0;
        cj stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        int stackOut_149_2 = 0;
        cj stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        cj stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        cj stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        cj stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        cj stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        cj stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        int stackOut_155_2 = 0;
        cj stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        int stackOut_156_2 = 0;
        cj stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        cj stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        cj stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        cj stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        int stackOut_160_2 = 0;
        cj stackOut_161_0 = null;
        int stackOut_161_1 = 0;
        int stackOut_161_2 = 0;
        cj stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        cj stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        cj stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        cj stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        cj stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        cj stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        cj stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        cj stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        cj stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        cj stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        cj stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        cj stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        cj stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        cj stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        cj stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        cj stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        cj stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        v.a(199);
        if (!param2) {
          if (0 > bc.field_e) {
            L0: {
              L1: {
                ql.field_b.field_wb = null;
                stackOut_59_0 = qe.field_k;
                stackOut_59_1 = -11838;
                stackIn_65_0 = stackOut_59_0;
                stackIn_65_1 = stackOut_59_1;
                stackIn_60_0 = stackOut_59_0;
                stackIn_60_1 = stackOut_59_1;
                if (!param0) {
                  break L1;
                } else {
                  stackOut_60_0 = (cj) ((Object) stackIn_60_0);
                  stackOut_60_1 = stackIn_60_1;
                  stackIn_65_0 = stackOut_60_0;
                  stackIn_65_1 = stackOut_60_1;
                  stackIn_61_0 = stackOut_60_0;
                  stackIn_61_1 = stackOut_60_1;
                  if (param3) {
                    break L1;
                  } else {
                    stackOut_61_0 = (cj) ((Object) stackIn_61_0);
                    stackOut_61_1 = stackIn_61_1;
                    stackIn_65_0 = stackOut_61_0;
                    stackIn_65_1 = stackOut_61_1;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    if (ee.field_a) {
                      break L1;
                    } else {
                      stackOut_62_0 = (cj) ((Object) stackIn_62_0);
                      stackOut_62_1 = stackIn_62_1;
                      stackIn_65_0 = stackOut_62_0;
                      stackIn_65_1 = stackOut_62_1;
                      stackIn_63_0 = stackOut_62_0;
                      stackIn_63_1 = stackOut_62_1;
                      if (null != mh.field_c) {
                        break L1;
                      } else {
                        stackOut_63_0 = (cj) ((Object) stackIn_63_0);
                        stackOut_63_1 = stackIn_63_1;
                        stackIn_65_0 = stackOut_63_0;
                        stackIn_65_1 = stackOut_63_1;
                        stackIn_64_0 = stackOut_63_0;
                        stackIn_64_1 = stackOut_63_1;
                        if (ej.field_n != null) {
                          break L1;
                        } else {
                          stackOut_64_0 = (cj) ((Object) stackIn_64_0);
                          stackOut_64_1 = stackIn_64_1;
                          stackOut_64_2 = 1;
                          stackIn_66_0 = stackOut_64_0;
                          stackIn_66_1 = stackOut_64_1;
                          stackIn_66_2 = stackOut_64_2;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_65_0 = (cj) ((Object) stackIn_65_0);
              stackOut_65_1 = stackIn_65_1;
              stackOut_65_2 = 0;
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L0;
            }
            L2: {
              L3: {
                ((cj) (Object) stackIn_66_0).a(stackIn_66_1, stackIn_66_2 != 0);
                stackOut_66_0 = cm.field_a;
                stackOut_66_1 = -11838;
                stackIn_72_0 = stackOut_66_0;
                stackIn_72_1 = stackOut_66_1;
                stackIn_67_0 = stackOut_66_0;
                stackIn_67_1 = stackOut_66_1;
                if (!param0) {
                  break L3;
                } else {
                  stackOut_67_0 = (cj) ((Object) stackIn_67_0);
                  stackOut_67_1 = stackIn_67_1;
                  stackIn_72_0 = stackOut_67_0;
                  stackIn_72_1 = stackOut_67_1;
                  stackIn_68_0 = stackOut_67_0;
                  stackIn_68_1 = stackOut_67_1;
                  if (param3) {
                    break L3;
                  } else {
                    stackOut_68_0 = (cj) ((Object) stackIn_68_0);
                    stackOut_68_1 = stackIn_68_1;
                    stackIn_72_0 = stackOut_68_0;
                    stackIn_72_1 = stackOut_68_1;
                    stackIn_69_0 = stackOut_68_0;
                    stackIn_69_1 = stackOut_68_1;
                    if (ee.field_a) {
                      break L3;
                    } else {
                      stackOut_69_0 = (cj) ((Object) stackIn_69_0);
                      stackOut_69_1 = stackIn_69_1;
                      stackIn_72_0 = stackOut_69_0;
                      stackIn_72_1 = stackOut_69_1;
                      stackIn_70_0 = stackOut_69_0;
                      stackIn_70_1 = stackOut_69_1;
                      if (mh.field_c != null) {
                        break L3;
                      } else {
                        stackOut_70_0 = (cj) ((Object) stackIn_70_0);
                        stackOut_70_1 = stackIn_70_1;
                        stackIn_72_0 = stackOut_70_0;
                        stackIn_72_1 = stackOut_70_1;
                        stackIn_71_0 = stackOut_70_0;
                        stackIn_71_1 = stackOut_70_1;
                        if (ej.field_n != null) {
                          break L3;
                        } else {
                          stackOut_71_0 = (cj) ((Object) stackIn_71_0);
                          stackOut_71_1 = stackIn_71_1;
                          stackOut_71_2 = 1;
                          stackIn_73_0 = stackOut_71_0;
                          stackIn_73_1 = stackOut_71_1;
                          stackIn_73_2 = stackOut_71_2;
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_72_0 = (cj) ((Object) stackIn_72_0);
              stackOut_72_1 = stackIn_72_1;
              stackOut_72_2 = 0;
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L2;
            }
            L4: {
              L5: {
                ((cj) (Object) stackIn_73_0).a(stackIn_73_1, stackIn_73_2 != 0);
                stackOut_73_0 = lm.field_gb;
                stackOut_73_1 = -11838;
                stackIn_77_0 = stackOut_73_0;
                stackIn_77_1 = stackOut_73_1;
                stackIn_74_0 = stackOut_73_0;
                stackIn_74_1 = stackOut_73_1;
                if (!param0) {
                  break L5;
                } else {
                  stackOut_74_0 = (cj) ((Object) stackIn_74_0);
                  stackOut_74_1 = stackIn_74_1;
                  stackIn_77_0 = stackOut_74_0;
                  stackIn_77_1 = stackOut_74_1;
                  stackIn_75_0 = stackOut_74_0;
                  stackIn_75_1 = stackOut_74_1;
                  if (param3) {
                    break L5;
                  } else {
                    stackOut_75_0 = (cj) ((Object) stackIn_75_0);
                    stackOut_75_1 = stackIn_75_1;
                    stackIn_77_0 = stackOut_75_0;
                    stackIn_77_1 = stackOut_75_1;
                    stackIn_76_0 = stackOut_75_0;
                    stackIn_76_1 = stackOut_75_1;
                    if (!ee.field_a) {
                      break L5;
                    } else {
                      stackOut_76_0 = (cj) ((Object) stackIn_76_0);
                      stackOut_76_1 = stackIn_76_1;
                      stackOut_76_2 = 1;
                      stackIn_78_0 = stackOut_76_0;
                      stackIn_78_1 = stackOut_76_1;
                      stackIn_78_2 = stackOut_76_2;
                      break L4;
                    }
                  }
                }
              }
              stackOut_77_0 = (cj) ((Object) stackIn_77_0);
              stackOut_77_1 = stackIn_77_1;
              stackOut_77_2 = 0;
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L4;
            }
            ((cj) (Object) stackIn_78_0).a(stackIn_78_1, stackIn_78_2 != 0);
            de.field_b.field_c.h(-37);
            if (0 != kj.field_u.field_T) {
              uk.field_N = true;
              if (ia.field_t.field_T != 0) {
                L6: {
                  L7: {
                    L8: {
                      if (bo.field_e) {
                        break L8;
                      } else {
                        if ((vl.field_h ^ -1) < -1) {
                          break L8;
                        } else {
                          if (kj.field_q >= 2) {
                            if (lc.field_m[12]) {
                              break L8;
                            } else {
                              pb.field_f = true;
                              break L7;
                            }
                          } else {
                            pb.field_f = true;
                            break L7;
                          }
                        }
                      }
                    }
                    ii.a(param1, -1);
                    if (var5 == 0) {
                      break L7;
                    } else {
                      cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                      if (0 == kn.field_a.field_T) {
                        break L6;
                      } else {
                        ee.field_a = false;
                        cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                        if (0 == kn.field_a.field_T) {
                          break L6;
                        } else {
                          ee.field_a = false;
                          break L6;
                        }
                      }
                    }
                  }
                  L9: {
                    if (pl.field_L.field_T == 0) {
                      break L9;
                    } else {
                      L10: {
                        if (1 != qo.field_r.length) {
                          break L10;
                        } else {
                          if (i.field_e == qo.field_r[0]) {
                            break L10;
                          } else {
                            i.field_e = qo.field_r[0];
                            cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                            if (0 != kn.field_a.field_T) {
                              ee.field_a = false;
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                      break L9;
                    }
                  }
                  if (0 == kn.field_a.field_T) {
                    break L6;
                  } else {
                    ee.field_a = false;
                    break L6;
                  }
                }
                return;
              } else {
                L11: {
                  if (pl.field_L.field_T == 0) {
                    break L11;
                  } else {
                    L12: {
                      if (1 != qo.field_r.length) {
                        break L12;
                      } else {
                        if (i.field_e == qo.field_r[0]) {
                          break L12;
                        } else {
                          i.field_e = qo.field_r[0];
                          break L12;
                        }
                      }
                    }
                    cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                    break L11;
                  }
                }
                L13: {
                  if (0 == kn.field_a.field_T) {
                    break L13;
                  } else {
                    ee.field_a = false;
                    break L13;
                  }
                }
                return;
              }
            } else {
              L14: {
                L15: {
                  if (ia.field_t.field_T == 0) {
                    break L15;
                  } else {
                    L16: {
                      if (bo.field_e) {
                        break L16;
                      } else {
                        if ((vl.field_h ^ -1) < -1) {
                          break L16;
                        } else {
                          if (kj.field_q >= 2) {
                            if (lc.field_m[12]) {
                              break L16;
                            } else {
                              pb.field_f = true;
                              if (0 == kn.field_a.field_T) {
                                break L14;
                              } else {
                                ee.field_a = false;
                                break L14;
                              }
                            }
                          } else {
                            pb.field_f = true;
                            break L15;
                          }
                        }
                      }
                    }
                    ii.a(param1, -1);
                    if (var5 == 0) {
                      break L15;
                    } else {
                      pb.field_f = true;
                      break L15;
                    }
                  }
                }
                L17: {
                  if (pl.field_L.field_T == 0) {
                    break L17;
                  } else {
                    if (1 != qo.field_r.length) {
                      cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                      break L17;
                    } else {
                      if (i.field_e == qo.field_r[0]) {
                        cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                        break L17;
                      } else {
                        i.field_e = qo.field_r[0];
                        cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                        break L17;
                      }
                    }
                  }
                }
                if (0 == kn.field_a.field_T) {
                  break L14;
                } else {
                  ee.field_a = false;
                  break L14;
                }
              }
              return;
            }
          } else {
            ql.field_b.field_wb = vl.a(ob.field_v, new String[]{Integer.toString(bc.field_e)}, 2);
            if (var5 == 0) {
              L18: {
                L19: {
                  stackOut_185_0 = qe.field_k;
                  stackOut_185_1 = -11838;
                  stackIn_191_0 = stackOut_185_0;
                  stackIn_191_1 = stackOut_185_1;
                  stackIn_186_0 = stackOut_185_0;
                  stackIn_186_1 = stackOut_185_1;
                  if (!param0) {
                    break L19;
                  } else {
                    stackOut_186_0 = (cj) ((Object) stackIn_186_0);
                    stackOut_186_1 = stackIn_186_1;
                    stackIn_191_0 = stackOut_186_0;
                    stackIn_191_1 = stackOut_186_1;
                    stackIn_187_0 = stackOut_186_0;
                    stackIn_187_1 = stackOut_186_1;
                    if (param3) {
                      break L19;
                    } else {
                      stackOut_187_0 = (cj) ((Object) stackIn_187_0);
                      stackOut_187_1 = stackIn_187_1;
                      stackIn_191_0 = stackOut_187_0;
                      stackIn_191_1 = stackOut_187_1;
                      stackIn_188_0 = stackOut_187_0;
                      stackIn_188_1 = stackOut_187_1;
                      if (ee.field_a) {
                        break L19;
                      } else {
                        stackOut_188_0 = (cj) ((Object) stackIn_188_0);
                        stackOut_188_1 = stackIn_188_1;
                        stackIn_191_0 = stackOut_188_0;
                        stackIn_191_1 = stackOut_188_1;
                        stackIn_189_0 = stackOut_188_0;
                        stackIn_189_1 = stackOut_188_1;
                        if (null != mh.field_c) {
                          break L19;
                        } else {
                          stackOut_189_0 = (cj) ((Object) stackIn_189_0);
                          stackOut_189_1 = stackIn_189_1;
                          stackIn_191_0 = stackOut_189_0;
                          stackIn_191_1 = stackOut_189_1;
                          stackIn_190_0 = stackOut_189_0;
                          stackIn_190_1 = stackOut_189_1;
                          if (ej.field_n != null) {
                            break L19;
                          } else {
                            stackOut_190_0 = (cj) ((Object) stackIn_190_0);
                            stackOut_190_1 = stackIn_190_1;
                            stackOut_190_2 = 1;
                            stackIn_192_0 = stackOut_190_0;
                            stackIn_192_1 = stackOut_190_1;
                            stackIn_192_2 = stackOut_190_2;
                            break L18;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_191_0 = (cj) ((Object) stackIn_191_0);
                stackOut_191_1 = stackIn_191_1;
                stackOut_191_2 = 0;
                stackIn_192_0 = stackOut_191_0;
                stackIn_192_1 = stackOut_191_1;
                stackIn_192_2 = stackOut_191_2;
                break L18;
              }
              L20: {
                L21: {
                  ((cj) (Object) stackIn_192_0).a(stackIn_192_1, stackIn_192_2 != 0);
                  stackOut_192_0 = cm.field_a;
                  stackOut_192_1 = -11838;
                  stackIn_198_0 = stackOut_192_0;
                  stackIn_198_1 = stackOut_192_1;
                  stackIn_193_0 = stackOut_192_0;
                  stackIn_193_1 = stackOut_192_1;
                  if (!param0) {
                    break L21;
                  } else {
                    stackOut_193_0 = (cj) ((Object) stackIn_193_0);
                    stackOut_193_1 = stackIn_193_1;
                    stackIn_198_0 = stackOut_193_0;
                    stackIn_198_1 = stackOut_193_1;
                    stackIn_194_0 = stackOut_193_0;
                    stackIn_194_1 = stackOut_193_1;
                    if (param3) {
                      break L21;
                    } else {
                      stackOut_194_0 = (cj) ((Object) stackIn_194_0);
                      stackOut_194_1 = stackIn_194_1;
                      stackIn_198_0 = stackOut_194_0;
                      stackIn_198_1 = stackOut_194_1;
                      stackIn_195_0 = stackOut_194_0;
                      stackIn_195_1 = stackOut_194_1;
                      if (ee.field_a) {
                        break L21;
                      } else {
                        stackOut_195_0 = (cj) ((Object) stackIn_195_0);
                        stackOut_195_1 = stackIn_195_1;
                        stackIn_198_0 = stackOut_195_0;
                        stackIn_198_1 = stackOut_195_1;
                        stackIn_196_0 = stackOut_195_0;
                        stackIn_196_1 = stackOut_195_1;
                        if (mh.field_c != null) {
                          break L21;
                        } else {
                          stackOut_196_0 = (cj) ((Object) stackIn_196_0);
                          stackOut_196_1 = stackIn_196_1;
                          stackIn_198_0 = stackOut_196_0;
                          stackIn_198_1 = stackOut_196_1;
                          stackIn_197_0 = stackOut_196_0;
                          stackIn_197_1 = stackOut_196_1;
                          if (ej.field_n != null) {
                            break L21;
                          } else {
                            stackOut_197_0 = (cj) ((Object) stackIn_197_0);
                            stackOut_197_1 = stackIn_197_1;
                            stackOut_197_2 = 1;
                            stackIn_199_0 = stackOut_197_0;
                            stackIn_199_1 = stackOut_197_1;
                            stackIn_199_2 = stackOut_197_2;
                            break L20;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_198_0 = (cj) ((Object) stackIn_198_0);
                stackOut_198_1 = stackIn_198_1;
                stackOut_198_2 = 0;
                stackIn_199_0 = stackOut_198_0;
                stackIn_199_1 = stackOut_198_1;
                stackIn_199_2 = stackOut_198_2;
                break L20;
              }
              L22: {
                L23: {
                  ((cj) (Object) stackIn_199_0).a(stackIn_199_1, stackIn_199_2 != 0);
                  stackOut_199_0 = lm.field_gb;
                  stackOut_199_1 = -11838;
                  stackIn_203_0 = stackOut_199_0;
                  stackIn_203_1 = stackOut_199_1;
                  stackIn_200_0 = stackOut_199_0;
                  stackIn_200_1 = stackOut_199_1;
                  if (!param0) {
                    break L23;
                  } else {
                    stackOut_200_0 = (cj) ((Object) stackIn_200_0);
                    stackOut_200_1 = stackIn_200_1;
                    stackIn_203_0 = stackOut_200_0;
                    stackIn_203_1 = stackOut_200_1;
                    stackIn_201_0 = stackOut_200_0;
                    stackIn_201_1 = stackOut_200_1;
                    if (param3) {
                      break L23;
                    } else {
                      stackOut_201_0 = (cj) ((Object) stackIn_201_0);
                      stackOut_201_1 = stackIn_201_1;
                      stackIn_203_0 = stackOut_201_0;
                      stackIn_203_1 = stackOut_201_1;
                      stackIn_202_0 = stackOut_201_0;
                      stackIn_202_1 = stackOut_201_1;
                      if (!ee.field_a) {
                        break L23;
                      } else {
                        stackOut_202_0 = (cj) ((Object) stackIn_202_0);
                        stackOut_202_1 = stackIn_202_1;
                        stackOut_202_2 = 1;
                        stackIn_204_0 = stackOut_202_0;
                        stackIn_204_1 = stackOut_202_1;
                        stackIn_204_2 = stackOut_202_2;
                        break L22;
                      }
                    }
                  }
                }
                stackOut_203_0 = (cj) ((Object) stackIn_203_0);
                stackOut_203_1 = stackIn_203_1;
                stackOut_203_2 = 0;
                stackIn_204_0 = stackOut_203_0;
                stackIn_204_1 = stackOut_203_1;
                stackIn_204_2 = stackOut_203_2;
                break L22;
              }
              L24: {
                ((cj) (Object) stackIn_204_0).a(stackIn_204_1, stackIn_204_2 != 0);
                de.field_b.field_c.h(-37);
                if (0 == kj.field_u.field_T) {
                  break L24;
                } else {
                  uk.field_N = true;
                  break L24;
                }
              }
              if (ia.field_t.field_T != 0) {
                L25: {
                  if (bo.field_e) {
                    break L25;
                  } else {
                    if ((vl.field_h ^ -1) < -1) {
                      break L25;
                    } else {
                      if (kj.field_q < 2) {
                        L26: {
                          pb.field_f = true;
                          if (pl.field_L.field_T == 0) {
                            break L26;
                          } else {
                            L27: {
                              if (1 != qo.field_r.length) {
                                break L27;
                              } else {
                                if (i.field_e == qo.field_r[0]) {
                                  break L27;
                                } else {
                                  i.field_e = qo.field_r[0];
                                  break L27;
                                }
                              }
                            }
                            cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                            break L26;
                          }
                        }
                        if (0 == kn.field_a.field_T) {
                          return;
                        } else {
                          ee.field_a = false;
                          return;
                        }
                      } else {
                        if (!lc.field_m[12]) {
                          L28: {
                            pb.field_f = true;
                            if (pl.field_L.field_T == 0) {
                              break L28;
                            } else {
                              L29: {
                                if (1 != qo.field_r.length) {
                                  break L29;
                                } else {
                                  if (i.field_e == qo.field_r[0]) {
                                    break L29;
                                  } else {
                                    i.field_e = qo.field_r[0];
                                    cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                                    if (0 == kn.field_a.field_T) {
                                      return;
                                    } else {
                                      ee.field_a = false;
                                      return;
                                    }
                                  }
                                }
                              }
                              cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                              break L28;
                            }
                          }
                          if (0 == kn.field_a.field_T) {
                            return;
                          } else {
                            ee.field_a = false;
                            return;
                          }
                        } else {
                          L30: {
                            ii.a(param1, -1);
                            if (var5 == 0) {
                              break L30;
                            } else {
                              pb.field_f = true;
                              break L30;
                            }
                          }
                          L31: {
                            if (pl.field_L.field_T == 0) {
                              break L31;
                            } else {
                              L32: {
                                if (1 != qo.field_r.length) {
                                  break L32;
                                } else {
                                  if (i.field_e == qo.field_r[0]) {
                                    break L32;
                                  } else {
                                    i.field_e = qo.field_r[0];
                                    break L32;
                                  }
                                }
                              }
                              cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                              break L31;
                            }
                          }
                          L33: {
                            if (0 == kn.field_a.field_T) {
                              break L33;
                            } else {
                              ee.field_a = false;
                              break L33;
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                }
                ii.a(param1, -1);
                if (var5 != 0) {
                  L34: {
                    pb.field_f = true;
                    if (pl.field_L.field_T == 0) {
                      break L34;
                    } else {
                      L35: {
                        if (1 != qo.field_r.length) {
                          break L35;
                        } else {
                          if (i.field_e == qo.field_r[0]) {
                            break L35;
                          } else {
                            i.field_e = qo.field_r[0];
                            cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                            if (0 != kn.field_a.field_T) {
                              ee.field_a = false;
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                      break L34;
                    }
                  }
                  if (0 != kn.field_a.field_T) {
                    ee.field_a = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L36: {
                    if (pl.field_L.field_T == 0) {
                      break L36;
                    } else {
                      L37: {
                        if (1 != qo.field_r.length) {
                          break L37;
                        } else {
                          if (i.field_e == qo.field_r[0]) {
                            break L37;
                          } else {
                            i.field_e = qo.field_r[0];
                            cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                            if (0 == kn.field_a.field_T) {
                              return;
                            } else {
                              ee.field_a = false;
                              return;
                            }
                          }
                        }
                      }
                      cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                      break L36;
                    }
                  }
                  if (0 == kn.field_a.field_T) {
                    return;
                  } else {
                    ee.field_a = false;
                    return;
                  }
                }
              } else {
                L38: {
                  if (pl.field_L.field_T == 0) {
                    break L38;
                  } else {
                    L39: {
                      if (1 != qo.field_r.length) {
                        break L39;
                      } else {
                        if (i.field_e == qo.field_r[0]) {
                          break L39;
                        } else {
                          i.field_e = qo.field_r[0];
                          cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                          if (0 == kn.field_a.field_T) {
                            return;
                          } else {
                            ee.field_a = false;
                            return;
                          }
                        }
                      }
                    }
                    cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                    break L38;
                  }
                }
                if (0 == kn.field_a.field_T) {
                  return;
                } else {
                  ee.field_a = false;
                  return;
                }
              }
            } else {
              L40: {
                L41: {
                  ql.field_b.field_wb = null;
                  stackOut_143_0 = qe.field_k;
                  stackOut_143_1 = -11838;
                  stackIn_149_0 = stackOut_143_0;
                  stackIn_149_1 = stackOut_143_1;
                  stackIn_144_0 = stackOut_143_0;
                  stackIn_144_1 = stackOut_143_1;
                  if (!param0) {
                    break L41;
                  } else {
                    stackOut_144_0 = (cj) ((Object) stackIn_144_0);
                    stackOut_144_1 = stackIn_144_1;
                    stackIn_149_0 = stackOut_144_0;
                    stackIn_149_1 = stackOut_144_1;
                    stackIn_145_0 = stackOut_144_0;
                    stackIn_145_1 = stackOut_144_1;
                    if (param3) {
                      break L41;
                    } else {
                      stackOut_145_0 = (cj) ((Object) stackIn_145_0);
                      stackOut_145_1 = stackIn_145_1;
                      stackIn_149_0 = stackOut_145_0;
                      stackIn_149_1 = stackOut_145_1;
                      stackIn_146_0 = stackOut_145_0;
                      stackIn_146_1 = stackOut_145_1;
                      if (ee.field_a) {
                        break L41;
                      } else {
                        stackOut_146_0 = (cj) ((Object) stackIn_146_0);
                        stackOut_146_1 = stackIn_146_1;
                        stackIn_149_0 = stackOut_146_0;
                        stackIn_149_1 = stackOut_146_1;
                        stackIn_147_0 = stackOut_146_0;
                        stackIn_147_1 = stackOut_146_1;
                        if (null != mh.field_c) {
                          break L41;
                        } else {
                          stackOut_147_0 = (cj) ((Object) stackIn_147_0);
                          stackOut_147_1 = stackIn_147_1;
                          stackIn_149_0 = stackOut_147_0;
                          stackIn_149_1 = stackOut_147_1;
                          stackIn_148_0 = stackOut_147_0;
                          stackIn_148_1 = stackOut_147_1;
                          if (ej.field_n != null) {
                            break L41;
                          } else {
                            stackOut_148_0 = (cj) ((Object) stackIn_148_0);
                            stackOut_148_1 = stackIn_148_1;
                            stackOut_148_2 = 1;
                            stackIn_150_0 = stackOut_148_0;
                            stackIn_150_1 = stackOut_148_1;
                            stackIn_150_2 = stackOut_148_2;
                            break L40;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_149_0 = (cj) ((Object) stackIn_149_0);
                stackOut_149_1 = stackIn_149_1;
                stackOut_149_2 = 0;
                stackIn_150_0 = stackOut_149_0;
                stackIn_150_1 = stackOut_149_1;
                stackIn_150_2 = stackOut_149_2;
                break L40;
              }
              L42: {
                L43: {
                  ((cj) (Object) stackIn_150_0).a(stackIn_150_1, stackIn_150_2 != 0);
                  stackOut_150_0 = cm.field_a;
                  stackOut_150_1 = -11838;
                  stackIn_156_0 = stackOut_150_0;
                  stackIn_156_1 = stackOut_150_1;
                  stackIn_151_0 = stackOut_150_0;
                  stackIn_151_1 = stackOut_150_1;
                  if (!param0) {
                    break L43;
                  } else {
                    stackOut_151_0 = (cj) ((Object) stackIn_151_0);
                    stackOut_151_1 = stackIn_151_1;
                    stackIn_156_0 = stackOut_151_0;
                    stackIn_156_1 = stackOut_151_1;
                    stackIn_152_0 = stackOut_151_0;
                    stackIn_152_1 = stackOut_151_1;
                    if (param3) {
                      break L43;
                    } else {
                      stackOut_152_0 = (cj) ((Object) stackIn_152_0);
                      stackOut_152_1 = stackIn_152_1;
                      stackIn_156_0 = stackOut_152_0;
                      stackIn_156_1 = stackOut_152_1;
                      stackIn_153_0 = stackOut_152_0;
                      stackIn_153_1 = stackOut_152_1;
                      if (ee.field_a) {
                        break L43;
                      } else {
                        stackOut_153_0 = (cj) ((Object) stackIn_153_0);
                        stackOut_153_1 = stackIn_153_1;
                        stackIn_156_0 = stackOut_153_0;
                        stackIn_156_1 = stackOut_153_1;
                        stackIn_154_0 = stackOut_153_0;
                        stackIn_154_1 = stackOut_153_1;
                        if (mh.field_c != null) {
                          break L43;
                        } else {
                          stackOut_154_0 = (cj) ((Object) stackIn_154_0);
                          stackOut_154_1 = stackIn_154_1;
                          stackIn_156_0 = stackOut_154_0;
                          stackIn_156_1 = stackOut_154_1;
                          stackIn_155_0 = stackOut_154_0;
                          stackIn_155_1 = stackOut_154_1;
                          if (ej.field_n != null) {
                            break L43;
                          } else {
                            stackOut_155_0 = (cj) ((Object) stackIn_155_0);
                            stackOut_155_1 = stackIn_155_1;
                            stackOut_155_2 = 1;
                            stackIn_157_0 = stackOut_155_0;
                            stackIn_157_1 = stackOut_155_1;
                            stackIn_157_2 = stackOut_155_2;
                            break L42;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_156_0 = (cj) ((Object) stackIn_156_0);
                stackOut_156_1 = stackIn_156_1;
                stackOut_156_2 = 0;
                stackIn_157_0 = stackOut_156_0;
                stackIn_157_1 = stackOut_156_1;
                stackIn_157_2 = stackOut_156_2;
                break L42;
              }
              L44: {
                L45: {
                  ((cj) (Object) stackIn_157_0).a(stackIn_157_1, stackIn_157_2 != 0);
                  stackOut_157_0 = lm.field_gb;
                  stackOut_157_1 = -11838;
                  stackIn_161_0 = stackOut_157_0;
                  stackIn_161_1 = stackOut_157_1;
                  stackIn_158_0 = stackOut_157_0;
                  stackIn_158_1 = stackOut_157_1;
                  if (!param0) {
                    break L45;
                  } else {
                    stackOut_158_0 = (cj) ((Object) stackIn_158_0);
                    stackOut_158_1 = stackIn_158_1;
                    stackIn_161_0 = stackOut_158_0;
                    stackIn_161_1 = stackOut_158_1;
                    stackIn_159_0 = stackOut_158_0;
                    stackIn_159_1 = stackOut_158_1;
                    if (param3) {
                      break L45;
                    } else {
                      stackOut_159_0 = (cj) ((Object) stackIn_159_0);
                      stackOut_159_1 = stackIn_159_1;
                      stackIn_161_0 = stackOut_159_0;
                      stackIn_161_1 = stackOut_159_1;
                      stackIn_160_0 = stackOut_159_0;
                      stackIn_160_1 = stackOut_159_1;
                      if (!ee.field_a) {
                        break L45;
                      } else {
                        stackOut_160_0 = (cj) ((Object) stackIn_160_0);
                        stackOut_160_1 = stackIn_160_1;
                        stackOut_160_2 = 1;
                        stackIn_162_0 = stackOut_160_0;
                        stackIn_162_1 = stackOut_160_1;
                        stackIn_162_2 = stackOut_160_2;
                        break L44;
                      }
                    }
                  }
                }
                stackOut_161_0 = (cj) ((Object) stackIn_161_0);
                stackOut_161_1 = stackIn_161_1;
                stackOut_161_2 = 0;
                stackIn_162_0 = stackOut_161_0;
                stackIn_162_1 = stackOut_161_1;
                stackIn_162_2 = stackOut_161_2;
                break L44;
              }
              L46: {
                ((cj) (Object) stackIn_162_0).a(stackIn_162_1, stackIn_162_2 != 0);
                de.field_b.field_c.h(-37);
                if (0 == kj.field_u.field_T) {
                  break L46;
                } else {
                  uk.field_N = true;
                  break L46;
                }
              }
              L47: {
                if (ia.field_t.field_T == 0) {
                  break L47;
                } else {
                  L48: {
                    if (bo.field_e) {
                      break L48;
                    } else {
                      if ((vl.field_h ^ -1) < -1) {
                        break L48;
                      } else {
                        if (kj.field_q >= 2) {
                          if (lc.field_m[12]) {
                            break L48;
                          } else {
                            pb.field_f = true;
                            break L47;
                          }
                        } else {
                          pb.field_f = true;
                          break L47;
                        }
                      }
                    }
                  }
                  ii.a(param1, -1);
                  if (var5 == 0) {
                    break L47;
                  } else {
                    pb.field_f = true;
                    break L47;
                  }
                }
              }
              L49: {
                if (pl.field_L.field_T == 0) {
                  break L49;
                } else {
                  L50: {
                    if (1 != qo.field_r.length) {
                      break L50;
                    } else {
                      if (i.field_e == qo.field_r[0]) {
                        break L50;
                      } else {
                        i.field_e = qo.field_r[0];
                        break L50;
                      }
                    }
                  }
                  cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                  break L49;
                }
              }
              L51: {
                if (0 == kn.field_a.field_T) {
                  break L51;
                } else {
                  ee.field_a = false;
                  break L51;
                }
              }
              return;
            }
          }
        } else {
          L52: {
            ko.d(-60);
            if (0 > bc.field_e) {
              ql.field_b.field_wb = null;
              break L52;
            } else {
              ql.field_b.field_wb = vl.a(ob.field_v, new String[]{Integer.toString(bc.field_e)}, 2);
              if (var5 == 0) {
                break L52;
              } else {
                ql.field_b.field_wb = null;
                break L52;
              }
            }
          }
          L53: {
            L54: {
              stackOut_6_0 = qe.field_k;
              stackOut_6_1 = -11838;
              stackIn_12_0 = stackOut_6_0;
              stackIn_12_1 = stackOut_6_1;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              if (!param0) {
                break L54;
              } else {
                stackOut_7_0 = (cj) ((Object) stackIn_7_0);
                stackOut_7_1 = stackIn_7_1;
                stackIn_12_0 = stackOut_7_0;
                stackIn_12_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param3) {
                  break L54;
                } else {
                  stackOut_8_0 = (cj) ((Object) stackIn_8_0);
                  stackOut_8_1 = stackIn_8_1;
                  stackIn_12_0 = stackOut_8_0;
                  stackIn_12_1 = stackOut_8_1;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  if (ee.field_a) {
                    break L54;
                  } else {
                    stackOut_9_0 = (cj) ((Object) stackIn_9_0);
                    stackOut_9_1 = stackIn_9_1;
                    stackIn_12_0 = stackOut_9_0;
                    stackIn_12_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (null != mh.field_c) {
                      break L54;
                    } else {
                      stackOut_10_0 = (cj) ((Object) stackIn_10_0);
                      stackOut_10_1 = stackIn_10_1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (ej.field_n != null) {
                        break L54;
                      } else {
                        stackOut_11_0 = (cj) ((Object) stackIn_11_0);
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        break L53;
                      }
                    }
                  }
                }
              }
            }
            stackOut_12_0 = (cj) ((Object) stackIn_12_0);
            stackOut_12_1 = stackIn_12_1;
            stackOut_12_2 = 0;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            stackIn_13_2 = stackOut_12_2;
            break L53;
          }
          L55: {
            L56: {
              ((cj) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2 != 0);
              stackOut_13_0 = cm.field_a;
              stackOut_13_1 = -11838;
              stackIn_19_0 = stackOut_13_0;
              stackIn_19_1 = stackOut_13_1;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              if (!param0) {
                break L56;
              } else {
                stackOut_14_0 = (cj) ((Object) stackIn_14_0);
                stackOut_14_1 = stackIn_14_1;
                stackIn_19_0 = stackOut_14_0;
                stackIn_19_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param3) {
                  break L56;
                } else {
                  stackOut_15_0 = (cj) ((Object) stackIn_15_0);
                  stackOut_15_1 = stackIn_15_1;
                  stackIn_19_0 = stackOut_15_0;
                  stackIn_19_1 = stackOut_15_1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  if (ee.field_a) {
                    break L56;
                  } else {
                    stackOut_16_0 = (cj) ((Object) stackIn_16_0);
                    stackOut_16_1 = stackIn_16_1;
                    stackIn_19_0 = stackOut_16_0;
                    stackIn_19_1 = stackOut_16_1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    if (mh.field_c != null) {
                      break L56;
                    } else {
                      stackOut_17_0 = (cj) ((Object) stackIn_17_0);
                      stackOut_17_1 = stackIn_17_1;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if (ej.field_n != null) {
                        break L56;
                      } else {
                        stackOut_18_0 = (cj) ((Object) stackIn_18_0);
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        break L55;
                      }
                    }
                  }
                }
              }
            }
            stackOut_19_0 = (cj) ((Object) stackIn_19_0);
            stackOut_19_1 = stackIn_19_1;
            stackOut_19_2 = 0;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            stackIn_20_2 = stackOut_19_2;
            break L55;
          }
          L57: {
            L58: {
              ((cj) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_20_2 != 0);
              stackOut_20_0 = lm.field_gb;
              stackOut_20_1 = -11838;
              stackIn_25_0 = stackOut_20_0;
              stackIn_25_1 = stackOut_20_1;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              if (!param0) {
                break L58;
              } else {
                stackOut_21_0 = (cj) ((Object) stackIn_21_0);
                stackOut_21_1 = stackIn_21_1;
                stackIn_25_0 = stackOut_21_0;
                stackIn_25_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (param3) {
                  break L58;
                } else {
                  stackOut_22_0 = (cj) ((Object) stackIn_22_0);
                  stackOut_22_1 = stackIn_22_1;
                  stackIn_25_0 = stackOut_22_0;
                  stackIn_25_1 = stackOut_22_1;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  if (!ee.field_a) {
                    break L58;
                  } else {
                    ((cj) (Object) stackIn_23_0).a(stackIn_23_1, true);
                    de.field_b.field_c.h(-37);
                    if (0 == kj.field_u.field_T) {
                      break L57;
                    } else {
                      uk.field_N = true;
                      break L57;
                    }
                  }
                }
              }
            }
            ((cj) (Object) stackIn_25_0).a(stackIn_25_1, false);
            de.field_b.field_c.h(-37);
            if (0 == kj.field_u.field_T) {
              break L57;
            } else {
              uk.field_N = true;
              break L57;
            }
          }
          L59: {
            L60: {
              if (ia.field_t.field_T == 0) {
                break L60;
              } else {
                L61: {
                  if (bo.field_e) {
                    break L61;
                  } else {
                    if ((vl.field_h ^ -1) < -1) {
                      break L61;
                    } else {
                      if (kj.field_q >= 2) {
                        if (lc.field_m[12]) {
                          break L61;
                        } else {
                          pb.field_f = true;
                          break L60;
                        }
                      } else {
                        pb.field_f = true;
                        break L60;
                      }
                    }
                  }
                }
                ii.a(param1, -1);
                if (var5 == 0) {
                  break L60;
                } else {
                  if (0 == kn.field_a.field_T) {
                    break L59;
                  } else {
                    ee.field_a = false;
                    break L59;
                  }
                }
              }
            }
            L62: {
              if (pl.field_L.field_T == 0) {
                break L62;
              } else {
                if (1 != qo.field_r.length) {
                  cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                  break L62;
                } else {
                  if (i.field_e == qo.field_r[0]) {
                    cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                    if (0 == kn.field_a.field_T) {
                      break L59;
                    } else {
                      ee.field_a = false;
                      break L59;
                    }
                  } else {
                    i.field_e = qo.field_r[0];
                    cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                    if (0 == kn.field_a.field_T) {
                      break L59;
                    } else {
                      ee.field_a = false;
                      break L59;
                    }
                  }
                }
              }
            }
            if (0 == kn.field_a.field_T) {
              break L59;
            } else {
              ee.field_a = false;
              break L59;
            }
          }
          return;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return this.field_g;
    }

    final void c(int param0) {
        fb[] var2_ref_fb__ = null;
        int var2 = 0;
        int var3 = 0;
        fb var4_ref_fb = null;
        int var4 = 0;
        int var5 = 0;
        fb[] var6 = null;
        fb var7 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var6 = this.field_b;
        var2_ref_fb__ = var6;
        if (param0 > -114) {
          this.field_a = -40;
          var3 = 0;
          L0: while (true) {
            L1: {
              if (var3 >= var6.length) {
                break L1;
              } else {
                var4_ref_fb = var6[var3];
                if (var5 == 0) {
                  L2: {
                    if (var4_ref_fb == null) {
                      break L2;
                    } else {
                      var4_ref_fb.c(123);
                      break L2;
                    }
                  }
                  var3++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                } else {
                  if (!this.field_e) {
                    L3: {
                      L4: {
                        if (!this.field_d) {
                          break L4;
                        } else {
                          if (!this.field_g) {
                            break L4;
                          } else {
                            if (this.field_c) {
                              this.a(la.field_j, (byte) 59, kj.field_o);
                              if (var5 == 0) {
                                break L3;
                              } else {
                                L5: {
                                  this.a(wp.field_e, (byte) 59, vl.field_k);
                                  var2 = this.e(-1);
                                  if (255 == var2) {
                                    break L5;
                                  } else {
                                    if (0 >= bd.field_g) {
                                      break L5;
                                    } else {
                                      if (-1 > (bo.field_d ^ -1)) {
                                        var3 = 4 + bd.field_g;
                                        var4 = 15 + bo.field_d;
                                        wa.field_b[var2].c(var3, var4, 255);
                                        if (!bk.field_g) {
                                          el.field_E.c(1 + var3, var4 - -1);
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                                return;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      L6: {
                        if (!this.field_d) {
                          break L6;
                        } else {
                          if (this.field_g) {
                            this.a(up.field_f, (byte) 59, oq.field_t);
                            if (var5 == 0) {
                              break L3;
                            } else {
                              this.a(la.field_j, (byte) 59, kj.field_o);
                              this.a(wp.field_e, (byte) 59, vl.field_k);
                              L7: {
                                var2 = this.e(-1);
                                if (255 == var2) {
                                  break L7;
                                } else {
                                  if (0 >= bd.field_g) {
                                    break L7;
                                  } else {
                                    if (-1 > (bo.field_d ^ -1)) {
                                      var3 = 4 + bd.field_g;
                                      var4 = 15 + bo.field_d;
                                      wa.field_b[var2].c(var3, var4, 255);
                                      if (!bk.field_g) {
                                        el.field_E.c(1 + var3, var4 - -1);
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              return;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      L8: {
                        if (!this.field_g) {
                          break L8;
                        } else {
                          this.a(dl.field_c, (byte) 59, bf.field_f);
                          if (var5 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        L10: {
                          if (!this.field_c) {
                            break L10;
                          } else {
                            if (this.field_d) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (this.field_c) {
                            break L11;
                          } else {
                            if (this.field_d) {
                              this.a(fe.field_U, (byte) 59, ap.field_t);
                              if (var5 == 0) {
                                break L3;
                              } else {
                                break L11;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        this.a(bq.field_a, (byte) 59, ii.field_c);
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L9;
                        }
                      }
                      this.a(mi.field_Mb, (byte) 59, aq.field_u);
                      if (var5 == 0) {
                        break L3;
                      } else {
                        this.a(up.field_f, (byte) 59, oq.field_t);
                        this.a(la.field_j, (byte) 59, kj.field_o);
                        this.a(wp.field_e, (byte) 59, vl.field_k);
                        L12: {
                          var2 = this.e(-1);
                          if (255 == var2) {
                            break L12;
                          } else {
                            if (0 >= bd.field_g) {
                              break L12;
                            } else {
                              if (-1 > (bo.field_d ^ -1)) {
                                var3 = 4 + bd.field_g;
                                var4 = 15 + bo.field_d;
                                wa.field_b[var2].c(var3, var4, 255);
                                if (!bk.field_g) {
                                  el.field_E.c(1 + var3, var4 - -1);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                    var2 = this.e(-1);
                    if (255 != var2) {
                      if (0 < bd.field_g) {
                        if (-1 > (bo.field_d ^ -1)) {
                          var3 = 4 + bd.field_g;
                          var4 = 15 + bo.field_d;
                          wa.field_b[var2].c(var3, var4, 255);
                          if (!bk.field_g) {
                            el.field_E.c(1 + var3, var4 - -1);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    L13: {
                      this.a(wp.field_e, (byte) 59, vl.field_k);
                      var2 = this.e(-1);
                      if (255 == var2) {
                        break L13;
                      } else {
                        if (0 >= bd.field_g) {
                          break L13;
                        } else {
                          if (-1 > (bo.field_d ^ -1)) {
                            var3 = 4 + bd.field_g;
                            var4 = 15 + bo.field_d;
                            wa.field_b[var2].c(var3, var4, 255);
                            if (!bk.field_g) {
                              el.field_E.c(1 + var3, var4 - -1);
                              break L13;
                            } else {
                              break L13;
                            }
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            L14: {
              if (this.field_a == -1) {
                break L14;
              } else {
                if (this.field_a >= tg.field_e.field_d.length) {
                  break L14;
                } else {
                  var2 = tg.field_e.field_d[this.field_a];
                  var3 = tg.field_e.field_f[this.field_a];
                  if (255 != var2) {
                    g.a(fe.field_W[var2], this.field_f + -100, 453);
                    oj.field_M[var2].g(-100 + this.field_f, 453);
                    if ((var3 ^ -1) == -256) {
                      break L14;
                    } else {
                      g.a(fe.field_W[var3], -100 + this.field_f, 438);
                      oj.field_M[var3].g(-100 + this.field_f, 438);
                      break L14;
                    }
                  } else {
                    break L14;
                  }
                }
              }
            }
            if (this.field_e) {
              this.a(wp.field_e, (byte) 59, vl.field_k);
              var2 = this.e(-1);
              if (255 != var2) {
                if (0 < bd.field_g) {
                  if (-1 > (bo.field_d ^ -1)) {
                    var3 = 4 + bd.field_g;
                    var4 = 15 + bo.field_d;
                    wa.field_b[var2].c(var3, var4, 255);
                    if (bk.field_g) {
                      return;
                    } else {
                      el.field_E.c(1 + var3, var4 - -1);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L15: {
                L16: {
                  if (!this.field_d) {
                    break L16;
                  } else {
                    if (!this.field_g) {
                      break L16;
                    } else {
                      if (this.field_c) {
                        this.a(la.field_j, (byte) 59, kj.field_o);
                        if (var5 == 0) {
                          break L15;
                        } else {
                          this.a(wp.field_e, (byte) 59, vl.field_k);
                          var2 = this.e(-1);
                          if (255 != var2) {
                            if (0 < bd.field_g) {
                              if (-1 > (bo.field_d ^ -1)) {
                                var3 = 4 + bd.field_g;
                                var4 = 15 + bo.field_d;
                                wa.field_b[var2].c(var3, var4, 255);
                                if (bk.field_g) {
                                  return;
                                } else {
                                  el.field_E.c(1 + var3, var4 - -1);
                                  return;
                                }
                              } else {
                                return;
                              }
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      } else {
                        break L16;
                      }
                    }
                  }
                }
                L17: {
                  if (!this.field_d) {
                    break L17;
                  } else {
                    if (this.field_g) {
                      this.a(up.field_f, (byte) 59, oq.field_t);
                      if (var5 == 0) {
                        break L15;
                      } else {
                        this.a(la.field_j, (byte) 59, kj.field_o);
                        this.a(wp.field_e, (byte) 59, vl.field_k);
                        var2 = this.e(-1);
                        if (255 != var2) {
                          if (0 < bd.field_g) {
                            if (-1 > (bo.field_d ^ -1)) {
                              var3 = 4 + bd.field_g;
                              var4 = 15 + bo.field_d;
                              wa.field_b[var2].c(var3, var4, 255);
                              if (bk.field_g) {
                                return;
                              } else {
                                el.field_E.c(1 + var3, var4 - -1);
                                return;
                              }
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                L18: {
                  if (!this.field_g) {
                    break L18;
                  } else {
                    this.a(dl.field_c, (byte) 59, bf.field_f);
                    if (var5 != 0) {
                      break L18;
                    } else {
                      var2 = this.e(-1);
                      if (255 != var2) {
                        if (0 < bd.field_g) {
                          if (-1 > (bo.field_d ^ -1)) {
                            var3 = 4 + bd.field_g;
                            var4 = 15 + bo.field_d;
                            wa.field_b[var2].c(var3, var4, 255);
                            if (bk.field_g) {
                              return;
                            } else {
                              el.field_E.c(1 + var3, var4 - -1);
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                L19: {
                  L20: {
                    if (!this.field_c) {
                      break L20;
                    } else {
                      if (this.field_d) {
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L21: {
                    if (this.field_c) {
                      break L21;
                    } else {
                      if (this.field_d) {
                        this.a(fe.field_U, (byte) 59, ap.field_t);
                        if (var5 != 0) {
                          break L21;
                        } else {
                          var2 = this.e(-1);
                          if (255 != var2) {
                            if (0 < bd.field_g) {
                              if (-1 > (bo.field_d ^ -1)) {
                                var3 = 4 + bd.field_g;
                                var4 = 15 + bo.field_d;
                                wa.field_b[var2].c(var3, var4, 255);
                                if (!bk.field_g) {
                                  el.field_E.c(1 + var3, var4 - -1);
                                  return;
                                } else {
                                  return;
                                }
                              } else {
                                return;
                              }
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      } else {
                        var2 = this.e(-1);
                        if (255 != var2) {
                          if (0 < bd.field_g) {
                            if (-1 > (bo.field_d ^ -1)) {
                              var3 = 4 + bd.field_g;
                              var4 = 15 + bo.field_d;
                              wa.field_b[var2].c(var3, var4, 255);
                              if (bk.field_g) {
                                return;
                              } else {
                                el.field_E.c(1 + var3, var4 - -1);
                                return;
                              }
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  this.a(bq.field_a, (byte) 59, ii.field_c);
                  if (var5 == 0) {
                    break L15;
                  } else {
                    break L19;
                  }
                }
                this.a(mi.field_Mb, (byte) 59, aq.field_u);
                if (var5 == 0) {
                  break L15;
                } else {
                  this.a(up.field_f, (byte) 59, oq.field_t);
                  this.a(la.field_j, (byte) 59, kj.field_o);
                  this.a(wp.field_e, (byte) 59, vl.field_k);
                  L22: {
                    var2 = this.e(-1);
                    if (255 == var2) {
                      break L22;
                    } else {
                      if (0 >= bd.field_g) {
                        break L22;
                      } else {
                        if (-1 > (bo.field_d ^ -1)) {
                          var3 = 4 + bd.field_g;
                          var4 = 15 + bo.field_d;
                          wa.field_b[var2].c(var3, var4, 255);
                          if (!bk.field_g) {
                            el.field_E.c(1 + var3, var4 - -1);
                            break L22;
                          } else {
                            break L22;
                          }
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                  return;
                }
              }
              var2 = this.e(-1);
              if (255 != var2) {
                if (0 < bd.field_g) {
                  if (-1 > (bo.field_d ^ -1)) {
                    var3 = 4 + bd.field_g;
                    var4 = 15 + bo.field_d;
                    wa.field_b[var2].c(var3, var4, 255);
                    if (bk.field_g) {
                      return;
                    } else {
                      el.field_E.c(1 + var3, var4 - -1);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          var3 = 0;
          L23: while (true) {
            L24: {
              L25: {
                if (var3 >= var6.length) {
                  break L25;
                } else {
                  var7 = var6[var3];
                  if (var5 != 0) {
                    break L24;
                  } else {
                    L26: {
                      if (var7 == null) {
                        break L26;
                      } else {
                        var7.c(123);
                        break L26;
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L23;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              if (this.field_a == -1) {
                break L24;
              } else {
                if (this.field_a >= tg.field_e.field_d.length) {
                  break L24;
                } else {
                  var2 = tg.field_e.field_d[this.field_a];
                  var3 = tg.field_e.field_f[this.field_a];
                  if (255 != var2) {
                    g.a(fe.field_W[var2], this.field_f + -100, 453);
                    oj.field_M[var2].g(-100 + this.field_f, 453);
                    if ((var3 ^ -1) == -256) {
                      break L24;
                    } else {
                      g.a(fe.field_W[var3], -100 + this.field_f, 438);
                      oj.field_M[var3].g(-100 + this.field_f, 438);
                      break L24;
                    }
                  } else {
                    break L24;
                  }
                }
              }
            }
            if (!this.field_e) {
              L27: {
                L28: {
                  if (!this.field_d) {
                    break L28;
                  } else {
                    if (!this.field_g) {
                      break L28;
                    } else {
                      if (this.field_c) {
                        this.a(la.field_j, (byte) 59, kj.field_o);
                        if (var5 == 0) {
                          break L27;
                        } else {
                          L29: {
                            this.a(wp.field_e, (byte) 59, vl.field_k);
                            var2 = this.e(-1);
                            if (255 == var2) {
                              break L29;
                            } else {
                              if (0 >= bd.field_g) {
                                break L29;
                              } else {
                                if (-1 > (bo.field_d ^ -1)) {
                                  var3 = 4 + bd.field_g;
                                  var4 = 15 + bo.field_d;
                                  wa.field_b[var2].c(var3, var4, 255);
                                  if (!bk.field_g) {
                                    el.field_E.c(1 + var3, var4 - -1);
                                    break L29;
                                  } else {
                                    break L29;
                                  }
                                } else {
                                  break L29;
                                }
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        break L28;
                      }
                    }
                  }
                }
                L30: {
                  if (!this.field_d) {
                    break L30;
                  } else {
                    if (this.field_g) {
                      this.a(up.field_f, (byte) 59, oq.field_t);
                      if (var5 == 0) {
                        break L27;
                      } else {
                        this.a(la.field_j, (byte) 59, kj.field_o);
                        this.a(wp.field_e, (byte) 59, vl.field_k);
                        L31: {
                          var2 = this.e(-1);
                          if (255 == var2) {
                            break L31;
                          } else {
                            if (0 >= bd.field_g) {
                              break L31;
                            } else {
                              if (-1 > (bo.field_d ^ -1)) {
                                var3 = 4 + bd.field_g;
                                var4 = 15 + bo.field_d;
                                wa.field_b[var2].c(var3, var4, 255);
                                if (!bk.field_g) {
                                  el.field_E.c(1 + var3, var4 - -1);
                                  break L31;
                                } else {
                                  break L31;
                                }
                              } else {
                                break L31;
                              }
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      break L30;
                    }
                  }
                }
                L32: {
                  if (!this.field_g) {
                    break L32;
                  } else {
                    this.a(dl.field_c, (byte) 59, bf.field_f);
                    if (var5 == 0) {
                      break L27;
                    } else {
                      break L32;
                    }
                  }
                }
                L33: {
                  L34: {
                    if (!this.field_c) {
                      break L34;
                    } else {
                      if (this.field_d) {
                        break L33;
                      } else {
                        break L34;
                      }
                    }
                  }
                  L35: {
                    if (this.field_c) {
                      break L35;
                    } else {
                      if (this.field_d) {
                        this.a(fe.field_U, (byte) 59, ap.field_t);
                        if (var5 == 0) {
                          break L27;
                        } else {
                          break L35;
                        }
                      } else {
                        break L27;
                      }
                    }
                  }
                  this.a(bq.field_a, (byte) 59, ii.field_c);
                  if (var5 == 0) {
                    break L27;
                  } else {
                    break L33;
                  }
                }
                this.a(mi.field_Mb, (byte) 59, aq.field_u);
                if (var5 == 0) {
                  break L27;
                } else {
                  this.a(up.field_f, (byte) 59, oq.field_t);
                  this.a(la.field_j, (byte) 59, kj.field_o);
                  this.a(wp.field_e, (byte) 59, vl.field_k);
                  L36: {
                    var2 = this.e(-1);
                    if (255 == var2) {
                      break L36;
                    } else {
                      if (0 >= bd.field_g) {
                        break L36;
                      } else {
                        if (-1 > (bo.field_d ^ -1)) {
                          var3 = 4 + bd.field_g;
                          var4 = 15 + bo.field_d;
                          wa.field_b[var2].c(var3, var4, 255);
                          if (!bk.field_g) {
                            el.field_E.c(1 + var3, var4 - -1);
                            break L36;
                          } else {
                            break L36;
                          }
                        } else {
                          break L36;
                        }
                      }
                    }
                  }
                  return;
                }
              }
              var2 = this.e(-1);
              if (255 != var2) {
                if (0 < bd.field_g) {
                  if (-1 > (bo.field_d ^ -1)) {
                    var3 = 4 + bd.field_g;
                    var4 = 15 + bo.field_d;
                    wa.field_b[var2].c(var3, var4, 255);
                    if (!bk.field_g) {
                      el.field_E.c(1 + var3, var4 - -1);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L37: {
                this.a(wp.field_e, (byte) 59, vl.field_k);
                var2 = this.e(-1);
                if (255 == var2) {
                  break L37;
                } else {
                  if (0 >= bd.field_g) {
                    break L37;
                  } else {
                    if (-1 > (bo.field_d ^ -1)) {
                      var3 = 4 + bd.field_g;
                      var4 = 15 + bo.field_d;
                      wa.field_b[var2].c(var3, var4, 255);
                      if (!bk.field_g) {
                        el.field_E.c(1 + var3, var4 - -1);
                        break L37;
                      } else {
                        break L37;
                      }
                    } else {
                      break L37;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final int e(int param0) {
        if (this.field_l != param0) {
          if (this.field_b[this.field_l] != null) {
            return this.field_b[this.field_l].a((byte) 97);
          } else {
            return 255;
          }
        } else {
          return 255;
        }
    }

    final void a(int param0, int param1) {
        boolean discarded$2 = false;
        if (this.field_b[param0] != null) {
          L0: {
            if (!this.field_b[param0].field_b) {
              discarded$2 = this.b(param1 ^ -18, param0);
              break L0;
            } else {
              break L0;
            }
          }
          if (param1 == -1) {
            return;
          } else {
            this.field_m = -102;
            return;
          }
        } else {
          return;
        }
    }

    final boolean f(int param0) {
        if (param0 != 0) {
            return true;
        }
        return this.field_e;
    }

    final int b(boolean param0) {
        int var2 = 0;
        if (!param0) {
          var2 = this.e(-1);
          if (var2 != 9) {
            if (var2 != 10) {
              return 0;
            } else {
              return ip.field_f;
            }
          } else {
            return ip.field_f;
          }
        } else {
          this.field_a = 77;
          var2 = this.e(-1);
          if (var2 != 9) {
            if (var2 != 10) {
              return 0;
            } else {
              return ip.field_f;
            }
          } else {
            return ip.field_f;
          }
        }
    }

    final boolean b(int param0, int param1) {
        boolean discarded$24 = false;
        boolean discarded$25 = false;
        boolean discarded$26 = false;
        boolean discarded$27 = false;
        boolean discarded$28 = false;
        boolean discarded$29 = false;
        boolean discarded$30 = false;
        boolean discarded$31 = false;
        boolean discarded$32 = false;
        boolean discarded$33 = false;
        boolean discarded$34 = false;
        boolean discarded$35 = false;
        boolean discarded$36 = false;
        boolean discarded$37 = false;
        boolean discarded$38 = false;
        boolean discarded$39 = false;
        boolean discarded$40 = false;
        boolean discarded$41 = false;
        boolean discarded$42 = false;
        boolean discarded$43 = false;
        boolean discarded$44 = false;
        boolean discarded$45 = false;
        boolean discarded$46 = false;
        boolean discarded$47 = false;
        fb[] var3_ref_fb__ = null;
        int var3 = 0;
        int var4 = 0;
        fb var5_ref_fb = null;
        int var5 = 0;
        int var6 = 0;
        fb[] var7 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_37_1 = null;
        Object stackIn_39_0 = null;
        Object stackIn_39_1 = null;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        Object stackIn_74_0 = null;
        Object stackIn_75_0 = null;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        Object stackIn_78_0 = null;
        Object stackIn_79_0 = null;
        Object stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        Object stackIn_82_0 = null;
        Object stackIn_82_1 = null;
        Object stackIn_83_0 = null;
        Object stackIn_83_1 = null;
        Object stackIn_84_0 = null;
        Object stackIn_84_1 = null;
        int stackIn_84_2 = 0;
        Object stackIn_109_0 = null;
        Object stackIn_110_0 = null;
        Object stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        Object stackIn_113_0 = null;
        Object stackIn_114_0 = null;
        Object stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        Object stackIn_117_0 = null;
        Object stackIn_118_0 = null;
        Object stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        Object stackIn_121_0 = null;
        Object stackIn_121_1 = null;
        Object stackIn_122_0 = null;
        Object stackIn_122_1 = null;
        Object stackIn_123_0 = null;
        Object stackIn_123_1 = null;
        int stackIn_123_2 = 0;
        Object stackIn_157_0 = null;
        Object stackIn_158_0 = null;
        Object stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        Object stackIn_161_0 = null;
        Object stackIn_162_0 = null;
        Object stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        Object stackIn_165_0 = null;
        Object stackIn_166_0 = null;
        Object stackIn_167_0 = null;
        int stackIn_167_1 = 0;
        Object stackIn_169_0 = null;
        Object stackIn_170_0 = null;
        Object stackIn_171_0 = null;
        int stackIn_171_1 = 0;
        Object stackIn_175_0 = null;
        Object stackIn_175_1 = null;
        Object stackIn_176_0 = null;
        Object stackIn_176_1 = null;
        Object stackIn_177_0 = null;
        Object stackIn_177_1 = null;
        int stackIn_177_2 = 0;
        Object stackIn_195_0 = null;
        Object stackIn_196_0 = null;
        Object stackIn_197_0 = null;
        int stackIn_197_1 = 0;
        Object stackIn_199_0 = null;
        Object stackIn_200_0 = null;
        Object stackIn_201_0 = null;
        int stackIn_201_1 = 0;
        Object stackIn_203_0 = null;
        Object stackIn_204_0 = null;
        Object stackIn_205_0 = null;
        int stackIn_205_1 = 0;
        Object stackIn_207_0 = null;
        Object stackIn_208_0 = null;
        Object stackIn_209_0 = null;
        int stackIn_209_1 = 0;
        Object stackIn_213_0 = null;
        Object stackIn_213_1 = null;
        Object stackIn_214_0 = null;
        Object stackIn_214_1 = null;
        Object stackIn_215_0 = null;
        Object stackIn_215_1 = null;
        int stackIn_215_2 = 0;
        Object stackIn_230_0 = null;
        Object stackIn_231_0 = null;
        Object stackIn_232_0 = null;
        int stackIn_232_1 = 0;
        Object stackIn_234_0 = null;
        Object stackIn_235_0 = null;
        Object stackIn_236_0 = null;
        int stackIn_236_1 = 0;
        Object stackIn_238_0 = null;
        Object stackIn_239_0 = null;
        Object stackIn_240_0 = null;
        int stackIn_240_1 = 0;
        Object stackIn_242_0 = null;
        Object stackIn_243_0 = null;
        Object stackIn_244_0 = null;
        int stackIn_244_1 = 0;
        Object stackIn_246_0 = null;
        Object stackIn_246_1 = null;
        Object stackIn_247_0 = null;
        Object stackIn_247_1 = null;
        Object stackIn_248_0 = null;
        Object stackIn_248_1 = null;
        int stackIn_248_2 = 0;
        Object stackIn_257_0 = null;
        Object stackIn_258_0 = null;
        Object stackIn_259_0 = null;
        int stackIn_259_1 = 0;
        Object stackIn_262_0 = null;
        Object stackIn_263_0 = null;
        Object stackIn_264_0 = null;
        int stackIn_264_1 = 0;
        Object stackIn_266_0 = null;
        Object stackIn_267_0 = null;
        Object stackIn_268_0 = null;
        int stackIn_268_1 = 0;
        Object stackIn_270_0 = null;
        Object stackIn_271_0 = null;
        Object stackIn_272_0 = null;
        int stackIn_272_1 = 0;
        Object stackIn_274_0 = null;
        Object stackIn_274_1 = null;
        Object stackIn_275_0 = null;
        Object stackIn_275_1 = null;
        Object stackIn_276_0 = null;
        Object stackIn_276_1 = null;
        int stackIn_276_2 = 0;
        Object stackIn_293_0 = null;
        Object stackIn_294_0 = null;
        Object stackIn_295_0 = null;
        int stackIn_295_1 = 0;
        Object stackIn_297_0 = null;
        Object stackIn_298_0 = null;
        Object stackIn_299_0 = null;
        int stackIn_299_1 = 0;
        Object stackIn_301_0 = null;
        Object stackIn_302_0 = null;
        Object stackIn_303_0 = null;
        int stackIn_303_1 = 0;
        Object stackIn_305_0 = null;
        Object stackIn_305_1 = null;
        Object stackIn_306_0 = null;
        Object stackIn_306_1 = null;
        Object stackIn_307_0 = null;
        Object stackIn_307_1 = null;
        int stackIn_307_2 = 0;
        Object stackIn_318_0 = null;
        Object stackIn_319_0 = null;
        Object stackIn_320_0 = null;
        int stackIn_320_1 = 0;
        Object stackIn_322_0 = null;
        Object stackIn_323_0 = null;
        Object stackIn_324_0 = null;
        int stackIn_324_1 = 0;
        Object stackIn_327_0 = null;
        Object stackIn_327_1 = null;
        Object stackIn_328_0 = null;
        Object stackIn_328_1 = null;
        Object stackIn_329_0 = null;
        Object stackIn_329_1 = null;
        int stackIn_329_2 = 0;
        Object stackIn_345_0 = null;
        Object stackIn_345_1 = null;
        Object stackIn_346_0 = null;
        Object stackIn_346_1 = null;
        Object stackIn_347_0 = null;
        Object stackIn_347_1 = null;
        int stackIn_347_2 = 0;
        Object stackOut_256_0 = null;
        Object stackOut_258_0 = null;
        int stackOut_258_1 = 0;
        Object stackOut_257_0 = null;
        int stackOut_257_1 = 0;
        Object stackOut_292_0 = null;
        Object stackOut_294_0 = null;
        int stackOut_294_1 = 0;
        Object stackOut_293_0 = null;
        int stackOut_293_1 = 0;
        Object stackOut_296_0 = null;
        Object stackOut_298_0 = null;
        int stackOut_298_1 = 0;
        Object stackOut_297_0 = null;
        int stackOut_297_1 = 0;
        Object stackOut_300_0 = null;
        Object stackOut_302_0 = null;
        int stackOut_302_1 = 0;
        Object stackOut_301_0 = null;
        int stackOut_301_1 = 0;
        Object stackOut_304_0 = null;
        Object stackOut_304_1 = null;
        Object stackOut_306_0 = null;
        Object stackOut_306_1 = null;
        int stackOut_306_2 = 0;
        Object stackOut_305_0 = null;
        Object stackOut_305_1 = null;
        int stackOut_305_2 = 0;
        Object stackOut_317_0 = null;
        Object stackOut_319_0 = null;
        int stackOut_319_1 = 0;
        Object stackOut_318_0 = null;
        int stackOut_318_1 = 0;
        Object stackOut_344_0 = null;
        Object stackOut_344_1 = null;
        Object stackOut_346_0 = null;
        Object stackOut_346_1 = null;
        int stackOut_346_2 = 0;
        Object stackOut_345_0 = null;
        Object stackOut_345_1 = null;
        int stackOut_345_2 = 0;
        Object stackOut_229_0 = null;
        Object stackOut_231_0 = null;
        int stackOut_231_1 = 0;
        Object stackOut_230_0 = null;
        int stackOut_230_1 = 0;
        Object stackOut_233_0 = null;
        Object stackOut_235_0 = null;
        int stackOut_235_1 = 0;
        Object stackOut_234_0 = null;
        int stackOut_234_1 = 0;
        Object stackOut_237_0 = null;
        Object stackOut_239_0 = null;
        int stackOut_239_1 = 0;
        Object stackOut_238_0 = null;
        int stackOut_238_1 = 0;
        Object stackOut_241_0 = null;
        Object stackOut_243_0 = null;
        int stackOut_243_1 = 0;
        Object stackOut_242_0 = null;
        int stackOut_242_1 = 0;
        Object stackOut_245_0 = null;
        Object stackOut_245_1 = null;
        Object stackOut_247_0 = null;
        Object stackOut_247_1 = null;
        int stackOut_247_2 = 0;
        Object stackOut_246_0 = null;
        Object stackOut_246_1 = null;
        int stackOut_246_2 = 0;
        Object stackOut_194_0 = null;
        Object stackOut_196_0 = null;
        int stackOut_196_1 = 0;
        Object stackOut_195_0 = null;
        int stackOut_195_1 = 0;
        Object stackOut_198_0 = null;
        Object stackOut_200_0 = null;
        int stackOut_200_1 = 0;
        Object stackOut_199_0 = null;
        int stackOut_199_1 = 0;
        Object stackOut_202_0 = null;
        Object stackOut_204_0 = null;
        int stackOut_204_1 = 0;
        Object stackOut_203_0 = null;
        int stackOut_203_1 = 0;
        Object stackOut_206_0 = null;
        Object stackOut_208_0 = null;
        int stackOut_208_1 = 0;
        Object stackOut_207_0 = null;
        int stackOut_207_1 = 0;
        Object stackOut_212_0 = null;
        Object stackOut_212_1 = null;
        Object stackOut_214_0 = null;
        Object stackOut_214_1 = null;
        int stackOut_214_2 = 0;
        Object stackOut_213_0 = null;
        Object stackOut_213_1 = null;
        int stackOut_213_2 = 0;
        Object stackOut_156_0 = null;
        Object stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        Object stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        Object stackOut_160_0 = null;
        Object stackOut_162_0 = null;
        int stackOut_162_1 = 0;
        Object stackOut_161_0 = null;
        int stackOut_161_1 = 0;
        Object stackOut_164_0 = null;
        Object stackOut_166_0 = null;
        int stackOut_166_1 = 0;
        Object stackOut_165_0 = null;
        int stackOut_165_1 = 0;
        Object stackOut_168_0 = null;
        Object stackOut_170_0 = null;
        int stackOut_170_1 = 0;
        Object stackOut_169_0 = null;
        int stackOut_169_1 = 0;
        Object stackOut_174_0 = null;
        Object stackOut_174_1 = null;
        Object stackOut_176_0 = null;
        Object stackOut_176_1 = null;
        int stackOut_176_2 = 0;
        Object stackOut_175_0 = null;
        Object stackOut_175_1 = null;
        int stackOut_175_2 = 0;
        Object stackOut_321_0 = null;
        Object stackOut_323_0 = null;
        int stackOut_323_1 = 0;
        Object stackOut_322_0 = null;
        int stackOut_322_1 = 0;
        Object stackOut_326_0 = null;
        Object stackOut_326_1 = null;
        Object stackOut_328_0 = null;
        Object stackOut_328_1 = null;
        int stackOut_328_2 = 0;
        Object stackOut_327_0 = null;
        Object stackOut_327_1 = null;
        int stackOut_327_2 = 0;
        Object stackOut_108_0 = null;
        Object stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        Object stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        Object stackOut_112_0 = null;
        Object stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        Object stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        Object stackOut_116_0 = null;
        Object stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        Object stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        Object stackOut_120_0 = null;
        Object stackOut_120_1 = null;
        Object stackOut_122_0 = null;
        Object stackOut_122_1 = null;
        int stackOut_122_2 = 0;
        Object stackOut_121_0 = null;
        Object stackOut_121_1 = null;
        int stackOut_121_2 = 0;
        Object stackOut_69_0 = null;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        Object stackOut_73_0 = null;
        Object stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        Object stackOut_77_0 = null;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_81_0 = null;
        Object stackOut_81_1 = null;
        Object stackOut_83_0 = null;
        Object stackOut_83_1 = null;
        int stackOut_83_2 = 0;
        Object stackOut_82_0 = null;
        Object stackOut_82_1 = null;
        int stackOut_82_2 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_36_1 = null;
        Object stackOut_261_0 = null;
        Object stackOut_263_0 = null;
        int stackOut_263_1 = 0;
        Object stackOut_262_0 = null;
        int stackOut_262_1 = 0;
        Object stackOut_265_0 = null;
        Object stackOut_267_0 = null;
        int stackOut_267_1 = 0;
        Object stackOut_266_0 = null;
        int stackOut_266_1 = 0;
        Object stackOut_269_0 = null;
        Object stackOut_271_0 = null;
        int stackOut_271_1 = 0;
        Object stackOut_270_0 = null;
        int stackOut_270_1 = 0;
        Object stackOut_273_0 = null;
        Object stackOut_273_1 = null;
        Object stackOut_275_0 = null;
        Object stackOut_275_1 = null;
        int stackOut_275_2 = 0;
        Object stackOut_274_0 = null;
        Object stackOut_274_1 = null;
        int stackOut_274_2 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_b[param1] == null) {
          return false;
        } else {
          L0: {
            if (param0 == 17) {
              break L0;
            } else {
              this.field_c = false;
              break L0;
            }
          }
          if (!this.field_b[param1].b((byte) 92)) {
            iq.a(-10, (byte) 99);
            var7 = this.field_b;
            var3_ref_fb__ = var7;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 >= var7.length) {
                    break L3;
                  } else {
                    var5_ref_fb = var7[var4];
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var5_ref_fb == null) {
                          break L4;
                        } else {
                          var5_ref_fb.c((byte) 18);
                          break L4;
                        }
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_l = param1;
                this.field_b[param1].b(2);
                break L2;
              }
              L5: {
                L6: {
                  var3 = this.field_b[param1].a((byte) 114);
                  this.field_e = false;
                  this.field_g = false;
                  this.field_c = false;
                  this.field_d = false;
                  var4 = ll.field_k.field_g[param1];
                  var5 = var3;
                  if (7 == var5) {
                    L7: {
                      this.field_c = true;
                      stackOut_256_0 = this;
                      stackIn_258_0 = stackOut_256_0;
                      stackIn_257_0 = stackOut_256_0;
                      if (37 != var4) {
                        stackOut_258_0 = this;
                        stackOut_258_1 = 0;
                        stackIn_259_0 = stackOut_258_0;
                        stackIn_259_1 = stackOut_258_1;
                        break L7;
                      } else {
                        stackOut_257_0 = this;
                        stackOut_257_1 = 1;
                        stackIn_259_0 = stackOut_257_0;
                        stackIn_259_1 = stackOut_257_1;
                        break L7;
                      }
                    }
                    ((ko) (this)).field_d = stackIn_259_1 != 0;
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  } else {
                    if (13 != var5) {
                      L8: {
                        if (var5 != 11) {
                          break L8;
                        } else {
                          if (var6 != 0) {
                            break L8;
                          } else {
                            L9: {
                              this.field_e = true;
                              if (df.field_I) {
                                ah.a((byte) -86, var3);
                                iq.a(var3, (byte) 99);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            L10: {
                              if (var6 == 0) {
                                break L10;
                              } else {
                                discarded$24 = this.h(1);
                                break L10;
                              }
                            }
                            return true;
                          }
                        }
                      }
                      if (9 == var5) {
                        break L6;
                      } else {
                        L11: {
                          if (-11 != (var5 ^ -1)) {
                            break L11;
                          } else {
                            if (var6 == 0) {
                              break L6;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (12 != var5) {
                            break L12;
                          } else {
                            if (var6 == 0) {
                              break L6;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L13: {
                          if (var5 != 17) {
                            break L13;
                          } else {
                            if (var6 == 0) {
                              this.field_d = true;
                              this.field_e = true;
                              this.field_g = true;
                              this.field_c = true;
                              if (var6 == 0) {
                                break L5;
                              } else {
                                L14: {
                                  this.field_g = true;
                                  stackOut_292_0 = this;
                                  stackIn_294_0 = stackOut_292_0;
                                  stackIn_293_0 = stackOut_292_0;
                                  if (-38 != (var4 ^ -1)) {
                                    stackOut_294_0 = this;
                                    stackOut_294_1 = 0;
                                    stackIn_295_0 = stackOut_294_0;
                                    stackIn_295_1 = stackOut_294_1;
                                    break L14;
                                  } else {
                                    stackOut_293_0 = this;
                                    stackOut_293_1 = 1;
                                    stackIn_295_0 = stackOut_293_0;
                                    stackIn_295_1 = stackOut_293_1;
                                    break L14;
                                  }
                                }
                                L15: {
                                  ((ko) (this)).field_d = stackIn_295_1 != 0;
                                  if (var6 == 0) {
                                    break L15;
                                  } else {
                                    L16: {
                                      this.field_g = true;
                                      stackOut_296_0 = this;
                                      stackIn_298_0 = stackOut_296_0;
                                      stackIn_297_0 = stackOut_296_0;
                                      if (32 != var4) {
                                        stackOut_298_0 = this;
                                        stackOut_298_1 = 0;
                                        stackIn_299_0 = stackOut_298_0;
                                        stackIn_299_1 = stackOut_298_1;
                                        break L16;
                                      } else {
                                        stackOut_297_0 = this;
                                        stackOut_297_1 = 1;
                                        stackIn_299_0 = stackOut_297_0;
                                        stackIn_299_1 = stackOut_297_1;
                                        break L16;
                                      }
                                    }
                                    ((ko) (this)).field_d = stackIn_299_1 != 0;
                                    if (var6 == 0) {
                                      break L15;
                                    } else {
                                      L17: {
                                        this.field_g = true;
                                        stackOut_300_0 = this;
                                        stackIn_302_0 = stackOut_300_0;
                                        stackIn_301_0 = stackOut_300_0;
                                        if ((var4 ^ -1) != -34) {
                                          stackOut_302_0 = this;
                                          stackOut_302_1 = 0;
                                          stackIn_303_0 = stackOut_302_0;
                                          stackIn_303_1 = stackOut_302_1;
                                          break L17;
                                        } else {
                                          stackOut_301_0 = this;
                                          stackOut_301_1 = 1;
                                          stackIn_303_0 = stackOut_301_0;
                                          stackIn_303_1 = stackOut_301_1;
                                          break L17;
                                        }
                                      }
                                      ((ko) (this)).field_d = stackIn_303_1 != 0;
                                      if (var6 == 0) {
                                        break L15;
                                      } else {
                                        L18: {
                                          this.field_c = true;
                                          this.field_d = true;
                                          stackOut_304_0 = this;
                                          stackOut_304_1 = this;
                                          stackIn_306_0 = stackOut_304_0;
                                          stackIn_306_1 = stackOut_304_1;
                                          stackIn_305_0 = stackOut_304_0;
                                          stackIn_305_1 = stackOut_304_1;
                                          if (-33 != (var4 ^ -1)) {
                                            stackOut_306_0 = this;
                                            stackOut_306_1 = this;
                                            stackOut_306_2 = 0;
                                            stackIn_307_0 = stackOut_306_0;
                                            stackIn_307_1 = stackOut_306_1;
                                            stackIn_307_2 = stackOut_306_2;
                                            break L18;
                                          } else {
                                            stackOut_305_0 = this;
                                            stackOut_305_1 = this;
                                            stackOut_305_2 = 1;
                                            stackIn_307_0 = stackOut_305_0;
                                            stackIn_307_1 = stackOut_305_1;
                                            stackIn_307_2 = stackOut_305_2;
                                            break L18;
                                          }
                                        }
                                        ((ko) (this)).field_d = stackIn_307_2 != 0;
                                        ((ko) (this)).field_c = stackIn_307_2 != 0;
                                        this.field_g = true;
                                        if (var6 == 0) {
                                          break L15;
                                        } else {
                                          this.field_e = true;
                                          this.field_g = true;
                                          break L15;
                                        }
                                      }
                                    }
                                  }
                                }
                                L19: {
                                  if (df.field_I) {
                                    ah.a((byte) -86, var3);
                                    iq.a(var3, (byte) 99);
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                if (var6 != 0) {
                                  discarded$25 = this.h(1);
                                  return true;
                                } else {
                                  return true;
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        if (4 != var5) {
                          if (var5 != 1) {
                            L20: {
                              L21: {
                                if (-3 == (var5 ^ -1)) {
                                  L22: {
                                    this.field_g = true;
                                    stackOut_317_0 = this;
                                    stackIn_319_0 = stackOut_317_0;
                                    stackIn_318_0 = stackOut_317_0;
                                    if (32 != var4) {
                                      stackOut_319_0 = this;
                                      stackOut_319_1 = 0;
                                      stackIn_320_0 = stackOut_319_0;
                                      stackIn_320_1 = stackOut_319_1;
                                      break L22;
                                    } else {
                                      stackOut_318_0 = this;
                                      stackOut_318_1 = 1;
                                      stackIn_320_0 = stackOut_318_0;
                                      stackIn_320_1 = stackOut_318_1;
                                      break L22;
                                    }
                                  }
                                  ((ko) (this)).field_d = stackIn_320_1 != 0;
                                  if (var6 == 0) {
                                    break L5;
                                  } else {
                                    break L21;
                                  }
                                } else {
                                  if ((var5 ^ -1) == -17) {
                                    break L21;
                                  } else {
                                    if (14 != var5) {
                                      if (-6 != (var5 ^ -1)) {
                                        if (var5 == 8) {
                                          break L20;
                                        } else {
                                          L23: {
                                            if (var5 == 0) {
                                              L24: {
                                                stackOut_344_0 = this;
                                                stackOut_344_1 = this;
                                                stackIn_346_0 = stackOut_344_0;
                                                stackIn_346_1 = stackOut_344_1;
                                                stackIn_345_0 = stackOut_344_0;
                                                stackIn_345_1 = stackOut_344_1;
                                                if (-33 != (var4 ^ -1)) {
                                                  stackOut_346_0 = this;
                                                  stackOut_346_1 = this;
                                                  stackOut_346_2 = 0;
                                                  stackIn_347_0 = stackOut_346_0;
                                                  stackIn_347_1 = stackOut_346_1;
                                                  stackIn_347_2 = stackOut_346_2;
                                                  break L24;
                                                } else {
                                                  stackOut_345_0 = this;
                                                  stackOut_345_1 = this;
                                                  stackOut_345_2 = 1;
                                                  stackIn_347_0 = stackOut_345_0;
                                                  stackIn_347_1 = stackOut_345_1;
                                                  stackIn_347_2 = stackOut_345_2;
                                                  break L24;
                                                }
                                              }
                                              ((ko) (this)).field_d = stackIn_347_2 != 0;
                                              ((ko) (this)).field_c = stackIn_347_2 != 0;
                                              this.field_g = true;
                                              if (var6 == 0) {
                                                break L5;
                                              } else {
                                                break L23;
                                              }
                                            } else {
                                              if (var5 != 15) {
                                                L25: {
                                                  this.field_g = true;
                                                  if (df.field_I) {
                                                    ah.a((byte) -86, var3);
                                                    iq.a(var3, (byte) 99);
                                                    break L25;
                                                  } else {
                                                    break L25;
                                                  }
                                                }
                                                if (var6 != 0) {
                                                  discarded$26 = this.h(1);
                                                  return true;
                                                } else {
                                                  return true;
                                                }
                                              } else {
                                                if (var6 == 0) {
                                                  break L23;
                                                } else {
                                                  L26: {
                                                    this.field_c = true;
                                                    stackOut_229_0 = this;
                                                    stackIn_231_0 = stackOut_229_0;
                                                    stackIn_230_0 = stackOut_229_0;
                                                    if (37 != var4) {
                                                      stackOut_231_0 = this;
                                                      stackOut_231_1 = 0;
                                                      stackIn_232_0 = stackOut_231_0;
                                                      stackIn_232_1 = stackOut_231_1;
                                                      break L26;
                                                    } else {
                                                      stackOut_230_0 = this;
                                                      stackOut_230_1 = 1;
                                                      stackIn_232_0 = stackOut_230_0;
                                                      stackIn_232_1 = stackOut_230_1;
                                                      break L26;
                                                    }
                                                  }
                                                  L27: {
                                                    ((ko) (this)).field_d = stackIn_232_1 != 0;
                                                    if (var6 == 0) {
                                                      break L27;
                                                    } else {
                                                      L28: {
                                                        this.field_e = true;
                                                        this.field_d = true;
                                                        this.field_e = true;
                                                        this.field_g = true;
                                                        this.field_c = true;
                                                        this.field_g = true;
                                                        stackOut_233_0 = this;
                                                        stackIn_235_0 = stackOut_233_0;
                                                        stackIn_234_0 = stackOut_233_0;
                                                        if (-38 != (var4 ^ -1)) {
                                                          stackOut_235_0 = this;
                                                          stackOut_235_1 = 0;
                                                          stackIn_236_0 = stackOut_235_0;
                                                          stackIn_236_1 = stackOut_235_1;
                                                          break L28;
                                                        } else {
                                                          stackOut_234_0 = this;
                                                          stackOut_234_1 = 1;
                                                          stackIn_236_0 = stackOut_234_0;
                                                          stackIn_236_1 = stackOut_234_1;
                                                          break L28;
                                                        }
                                                      }
                                                      ((ko) (this)).field_d = stackIn_236_1 != 0;
                                                      if (var6 == 0) {
                                                        break L27;
                                                      } else {
                                                        L29: {
                                                          this.field_g = true;
                                                          stackOut_237_0 = this;
                                                          stackIn_239_0 = stackOut_237_0;
                                                          stackIn_238_0 = stackOut_237_0;
                                                          if (32 != var4) {
                                                            stackOut_239_0 = this;
                                                            stackOut_239_1 = 0;
                                                            stackIn_240_0 = stackOut_239_0;
                                                            stackIn_240_1 = stackOut_239_1;
                                                            break L29;
                                                          } else {
                                                            stackOut_238_0 = this;
                                                            stackOut_238_1 = 1;
                                                            stackIn_240_0 = stackOut_238_0;
                                                            stackIn_240_1 = stackOut_238_1;
                                                            break L29;
                                                          }
                                                        }
                                                        ((ko) (this)).field_d = stackIn_240_1 != 0;
                                                        if (var6 == 0) {
                                                          break L27;
                                                        } else {
                                                          L30: {
                                                            this.field_g = true;
                                                            stackOut_241_0 = this;
                                                            stackIn_243_0 = stackOut_241_0;
                                                            stackIn_242_0 = stackOut_241_0;
                                                            if ((var4 ^ -1) != -34) {
                                                              stackOut_243_0 = this;
                                                              stackOut_243_1 = 0;
                                                              stackIn_244_0 = stackOut_243_0;
                                                              stackIn_244_1 = stackOut_243_1;
                                                              break L30;
                                                            } else {
                                                              stackOut_242_0 = this;
                                                              stackOut_242_1 = 1;
                                                              stackIn_244_0 = stackOut_242_0;
                                                              stackIn_244_1 = stackOut_242_1;
                                                              break L30;
                                                            }
                                                          }
                                                          ((ko) (this)).field_d = stackIn_244_1 != 0;
                                                          if (var6 == 0) {
                                                            break L27;
                                                          } else {
                                                            L31: {
                                                              this.field_c = true;
                                                              this.field_d = true;
                                                              stackOut_245_0 = this;
                                                              stackOut_245_1 = this;
                                                              stackIn_247_0 = stackOut_245_0;
                                                              stackIn_247_1 = stackOut_245_1;
                                                              stackIn_246_0 = stackOut_245_0;
                                                              stackIn_246_1 = stackOut_245_1;
                                                              if (-33 != (var4 ^ -1)) {
                                                                stackOut_247_0 = this;
                                                                stackOut_247_1 = this;
                                                                stackOut_247_2 = 0;
                                                                stackIn_248_0 = stackOut_247_0;
                                                                stackIn_248_1 = stackOut_247_1;
                                                                stackIn_248_2 = stackOut_247_2;
                                                                break L31;
                                                              } else {
                                                                stackOut_246_0 = this;
                                                                stackOut_246_1 = this;
                                                                stackOut_246_2 = 1;
                                                                stackIn_248_0 = stackOut_246_0;
                                                                stackIn_248_1 = stackOut_246_1;
                                                                stackIn_248_2 = stackOut_246_2;
                                                                break L31;
                                                              }
                                                            }
                                                            ((ko) (this)).field_d = stackIn_248_2 != 0;
                                                            ((ko) (this)).field_c = stackIn_248_2 != 0;
                                                            this.field_g = true;
                                                            if (var6 == 0) {
                                                              break L27;
                                                            } else {
                                                              this.field_e = true;
                                                              this.field_g = true;
                                                              break L27;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L32: {
                                                    if (df.field_I) {
                                                      ah.a((byte) -86, var3);
                                                      iq.a(var3, (byte) 99);
                                                      break L32;
                                                    } else {
                                                      break L32;
                                                    }
                                                  }
                                                  L33: {
                                                    if (var6 == 0) {
                                                      break L33;
                                                    } else {
                                                      discarded$27 = this.h(1);
                                                      break L33;
                                                    }
                                                  }
                                                  return true;
                                                }
                                              }
                                            }
                                          }
                                          this.field_e = true;
                                          if (var6 == 0) {
                                            break L5;
                                          } else {
                                            L34: {
                                              this.field_g = true;
                                              if (df.field_I) {
                                                ah.a((byte) -86, var3);
                                                iq.a(var3, (byte) 99);
                                                break L34;
                                              } else {
                                                break L34;
                                              }
                                            }
                                            if (var6 != 0) {
                                              discarded$28 = this.h(1);
                                              return true;
                                            } else {
                                              return true;
                                            }
                                          }
                                        }
                                      } else {
                                        if (var6 == 0) {
                                          break L21;
                                        } else {
                                          L35: {
                                            L36: {
                                              L37: {
                                                if (var5 == 8) {
                                                  break L37;
                                                } else {
                                                  if (var5 == 0) {
                                                    break L36;
                                                  } else {
                                                    if (var5 != 15) {
                                                      this.field_g = true;
                                                      break L35;
                                                    } else {
                                                      L38: {
                                                        this.field_c = true;
                                                        stackOut_194_0 = this;
                                                        stackIn_196_0 = stackOut_194_0;
                                                        stackIn_195_0 = stackOut_194_0;
                                                        if (37 != var4) {
                                                          stackOut_196_0 = this;
                                                          stackOut_196_1 = 0;
                                                          stackIn_197_0 = stackOut_196_0;
                                                          stackIn_197_1 = stackOut_196_1;
                                                          break L38;
                                                        } else {
                                                          stackOut_195_0 = this;
                                                          stackOut_195_1 = 1;
                                                          stackIn_197_0 = stackOut_195_0;
                                                          stackIn_197_1 = stackOut_195_1;
                                                          break L38;
                                                        }
                                                      }
                                                      ((ko) (this)).field_d = stackIn_197_1 != 0;
                                                      if (var6 == 0) {
                                                        break L35;
                                                      } else {
                                                        L39: {
                                                          this.field_e = true;
                                                          this.field_d = true;
                                                          this.field_e = true;
                                                          this.field_g = true;
                                                          this.field_c = true;
                                                          this.field_g = true;
                                                          stackOut_198_0 = this;
                                                          stackIn_200_0 = stackOut_198_0;
                                                          stackIn_199_0 = stackOut_198_0;
                                                          if (-38 != (var4 ^ -1)) {
                                                            stackOut_200_0 = this;
                                                            stackOut_200_1 = 0;
                                                            stackIn_201_0 = stackOut_200_0;
                                                            stackIn_201_1 = stackOut_200_1;
                                                            break L39;
                                                          } else {
                                                            stackOut_199_0 = this;
                                                            stackOut_199_1 = 1;
                                                            stackIn_201_0 = stackOut_199_0;
                                                            stackIn_201_1 = stackOut_199_1;
                                                            break L39;
                                                          }
                                                        }
                                                        ((ko) (this)).field_d = stackIn_201_1 != 0;
                                                        if (var6 == 0) {
                                                          break L35;
                                                        } else {
                                                          L40: {
                                                            this.field_g = true;
                                                            stackOut_202_0 = this;
                                                            stackIn_204_0 = stackOut_202_0;
                                                            stackIn_203_0 = stackOut_202_0;
                                                            if (32 != var4) {
                                                              stackOut_204_0 = this;
                                                              stackOut_204_1 = 0;
                                                              stackIn_205_0 = stackOut_204_0;
                                                              stackIn_205_1 = stackOut_204_1;
                                                              break L40;
                                                            } else {
                                                              stackOut_203_0 = this;
                                                              stackOut_203_1 = 1;
                                                              stackIn_205_0 = stackOut_203_0;
                                                              stackIn_205_1 = stackOut_203_1;
                                                              break L40;
                                                            }
                                                          }
                                                          ((ko) (this)).field_d = stackIn_205_1 != 0;
                                                          if (var6 == 0) {
                                                            break L35;
                                                          } else {
                                                            L41: {
                                                              this.field_g = true;
                                                              stackOut_206_0 = this;
                                                              stackIn_208_0 = stackOut_206_0;
                                                              stackIn_207_0 = stackOut_206_0;
                                                              if ((var4 ^ -1) != -34) {
                                                                stackOut_208_0 = this;
                                                                stackOut_208_1 = 0;
                                                                stackIn_209_0 = stackOut_208_0;
                                                                stackIn_209_1 = stackOut_208_1;
                                                                break L41;
                                                              } else {
                                                                stackOut_207_0 = this;
                                                                stackOut_207_1 = 1;
                                                                stackIn_209_0 = stackOut_207_0;
                                                                stackIn_209_1 = stackOut_207_1;
                                                                break L41;
                                                              }
                                                            }
                                                            ((ko) (this)).field_d = stackIn_209_1 != 0;
                                                            if (var6 == 0) {
                                                              break L35;
                                                            } else {
                                                              break L37;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              this.field_c = true;
                                              this.field_d = true;
                                              if (var6 == 0) {
                                                break L35;
                                              } else {
                                                break L36;
                                              }
                                            }
                                            L42: {
                                              stackOut_212_0 = this;
                                              stackOut_212_1 = this;
                                              stackIn_214_0 = stackOut_212_0;
                                              stackIn_214_1 = stackOut_212_1;
                                              stackIn_213_0 = stackOut_212_0;
                                              stackIn_213_1 = stackOut_212_1;
                                              if (-33 != (var4 ^ -1)) {
                                                stackOut_214_0 = this;
                                                stackOut_214_1 = this;
                                                stackOut_214_2 = 0;
                                                stackIn_215_0 = stackOut_214_0;
                                                stackIn_215_1 = stackOut_214_1;
                                                stackIn_215_2 = stackOut_214_2;
                                                break L42;
                                              } else {
                                                stackOut_213_0 = this;
                                                stackOut_213_1 = this;
                                                stackOut_213_2 = 1;
                                                stackIn_215_0 = stackOut_213_0;
                                                stackIn_215_1 = stackOut_213_1;
                                                stackIn_215_2 = stackOut_213_2;
                                                break L42;
                                              }
                                            }
                                            ((ko) (this)).field_d = stackIn_215_2 != 0;
                                            ((ko) (this)).field_c = stackIn_215_2 != 0;
                                            this.field_g = true;
                                            if (var6 == 0) {
                                              break L35;
                                            } else {
                                              this.field_e = true;
                                              this.field_g = true;
                                              break L35;
                                            }
                                          }
                                          L43: {
                                            if (df.field_I) {
                                              ah.a((byte) -86, var3);
                                              iq.a(var3, (byte) 99);
                                              break L43;
                                            } else {
                                              break L43;
                                            }
                                          }
                                          L44: {
                                            if (var6 == 0) {
                                              break L44;
                                            } else {
                                              discarded$29 = this.h(1);
                                              break L44;
                                            }
                                          }
                                          return true;
                                        }
                                      }
                                    } else {
                                      if (var6 == 0) {
                                        break L21;
                                      } else {
                                        L45: {
                                          if (-6 != (var5 ^ -1)) {
                                            break L45;
                                          } else {
                                            break L45;
                                          }
                                        }
                                        L46: {
                                          L47: {
                                            L48: {
                                              L49: {
                                                L50: {
                                                  if (var5 == 8) {
                                                    break L50;
                                                  } else {
                                                    if (var5 == 0) {
                                                      break L49;
                                                    } else {
                                                      if (var5 != 15) {
                                                        this.field_g = true;
                                                        if (var6 == 0) {
                                                          break L46;
                                                        } else {
                                                          discarded$30 = this.h(1);
                                                          discarded$31 = this.h(1);
                                                          break L46;
                                                        }
                                                      } else {
                                                        if (var6 == 0) {
                                                          break L48;
                                                        } else {
                                                          L51: {
                                                            this.field_c = true;
                                                            stackOut_156_0 = this;
                                                            stackIn_158_0 = stackOut_156_0;
                                                            stackIn_157_0 = stackOut_156_0;
                                                            if (37 != var4) {
                                                              stackOut_158_0 = this;
                                                              stackOut_158_1 = 0;
                                                              stackIn_159_0 = stackOut_158_0;
                                                              stackIn_159_1 = stackOut_158_1;
                                                              break L51;
                                                            } else {
                                                              stackOut_157_0 = this;
                                                              stackOut_157_1 = 1;
                                                              stackIn_159_0 = stackOut_157_0;
                                                              stackIn_159_1 = stackOut_157_1;
                                                              break L51;
                                                            }
                                                          }
                                                          ((ko) (this)).field_d = stackIn_159_1 != 0;
                                                          if (var6 == 0) {
                                                            break L47;
                                                          } else {
                                                            L52: {
                                                              this.field_e = true;
                                                              this.field_d = true;
                                                              this.field_e = true;
                                                              this.field_g = true;
                                                              this.field_c = true;
                                                              this.field_g = true;
                                                              stackOut_160_0 = this;
                                                              stackIn_162_0 = stackOut_160_0;
                                                              stackIn_161_0 = stackOut_160_0;
                                                              if (-38 != (var4 ^ -1)) {
                                                                stackOut_162_0 = this;
                                                                stackOut_162_1 = 0;
                                                                stackIn_163_0 = stackOut_162_0;
                                                                stackIn_163_1 = stackOut_162_1;
                                                                break L52;
                                                              } else {
                                                                stackOut_161_0 = this;
                                                                stackOut_161_1 = 1;
                                                                stackIn_163_0 = stackOut_161_0;
                                                                stackIn_163_1 = stackOut_161_1;
                                                                break L52;
                                                              }
                                                            }
                                                            ((ko) (this)).field_d = stackIn_163_1 != 0;
                                                            if (var6 == 0) {
                                                              break L47;
                                                            } else {
                                                              L53: {
                                                                this.field_g = true;
                                                                stackOut_164_0 = this;
                                                                stackIn_166_0 = stackOut_164_0;
                                                                stackIn_165_0 = stackOut_164_0;
                                                                if (32 != var4) {
                                                                  stackOut_166_0 = this;
                                                                  stackOut_166_1 = 0;
                                                                  stackIn_167_0 = stackOut_166_0;
                                                                  stackIn_167_1 = stackOut_166_1;
                                                                  break L53;
                                                                } else {
                                                                  stackOut_165_0 = this;
                                                                  stackOut_165_1 = 1;
                                                                  stackIn_167_0 = stackOut_165_0;
                                                                  stackIn_167_1 = stackOut_165_1;
                                                                  break L53;
                                                                }
                                                              }
                                                              ((ko) (this)).field_d = stackIn_167_1 != 0;
                                                              if (var6 == 0) {
                                                                break L47;
                                                              } else {
                                                                L54: {
                                                                  this.field_g = true;
                                                                  stackOut_168_0 = this;
                                                                  stackIn_170_0 = stackOut_168_0;
                                                                  stackIn_169_0 = stackOut_168_0;
                                                                  if ((var4 ^ -1) != -34) {
                                                                    stackOut_170_0 = this;
                                                                    stackOut_170_1 = 0;
                                                                    stackIn_171_0 = stackOut_170_0;
                                                                    stackIn_171_1 = stackOut_170_1;
                                                                    break L54;
                                                                  } else {
                                                                    stackOut_169_0 = this;
                                                                    stackOut_169_1 = 1;
                                                                    stackIn_171_0 = stackOut_169_0;
                                                                    stackIn_171_1 = stackOut_169_1;
                                                                    break L54;
                                                                  }
                                                                }
                                                                ((ko) (this)).field_d = stackIn_171_1 != 0;
                                                                if (var6 == 0) {
                                                                  break L47;
                                                                } else {
                                                                  break L50;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                this.field_c = true;
                                                this.field_d = true;
                                                if (var6 == 0) {
                                                  break L47;
                                                } else {
                                                  break L49;
                                                }
                                              }
                                              L55: {
                                                stackOut_174_0 = this;
                                                stackOut_174_1 = this;
                                                stackIn_176_0 = stackOut_174_0;
                                                stackIn_176_1 = stackOut_174_1;
                                                stackIn_175_0 = stackOut_174_0;
                                                stackIn_175_1 = stackOut_174_1;
                                                if (-33 != (var4 ^ -1)) {
                                                  stackOut_176_0 = this;
                                                  stackOut_176_1 = this;
                                                  stackOut_176_2 = 0;
                                                  stackIn_177_0 = stackOut_176_0;
                                                  stackIn_177_1 = stackOut_176_1;
                                                  stackIn_177_2 = stackOut_176_2;
                                                  break L55;
                                                } else {
                                                  stackOut_175_0 = this;
                                                  stackOut_175_1 = this;
                                                  stackOut_175_2 = 1;
                                                  stackIn_177_0 = stackOut_175_0;
                                                  stackIn_177_1 = stackOut_175_1;
                                                  stackIn_177_2 = stackOut_175_2;
                                                  break L55;
                                                }
                                              }
                                              ((ko) (this)).field_d = stackIn_177_2 != 0;
                                              ((ko) (this)).field_c = stackIn_177_2 != 0;
                                              this.field_g = true;
                                              if (var6 == 0) {
                                                break L47;
                                              } else {
                                                break L48;
                                              }
                                            }
                                            this.field_e = true;
                                            if (var6 == 0) {
                                              break L47;
                                            } else {
                                              this.field_g = true;
                                              break L47;
                                            }
                                          }
                                          L56: {
                                            if (df.field_I) {
                                              ah.a((byte) -86, var3);
                                              iq.a(var3, (byte) 99);
                                              break L56;
                                            } else {
                                              break L56;
                                            }
                                          }
                                          if (var6 == 0) {
                                            break L46;
                                          } else {
                                            discarded$32 = this.h(1);
                                            break L46;
                                          }
                                        }
                                        return true;
                                      }
                                    }
                                  }
                                }
                              }
                              L57: {
                                this.field_g = true;
                                stackOut_321_0 = this;
                                stackIn_323_0 = stackOut_321_0;
                                stackIn_322_0 = stackOut_321_0;
                                if ((var4 ^ -1) != -34) {
                                  stackOut_323_0 = this;
                                  stackOut_323_1 = 0;
                                  stackIn_324_0 = stackOut_323_0;
                                  stackIn_324_1 = stackOut_323_1;
                                  break L57;
                                } else {
                                  stackOut_322_0 = this;
                                  stackOut_322_1 = 1;
                                  stackIn_324_0 = stackOut_322_0;
                                  stackIn_324_1 = stackOut_322_1;
                                  break L57;
                                }
                              }
                              ((ko) (this)).field_d = stackIn_324_1 != 0;
                              if (var6 == 0) {
                                break L5;
                              } else {
                                break L20;
                              }
                            }
                            this.field_c = true;
                            this.field_d = true;
                            if (var6 == 0) {
                              break L5;
                            } else {
                              L58: {
                                stackOut_326_0 = this;
                                stackOut_326_1 = this;
                                stackIn_328_0 = stackOut_326_0;
                                stackIn_328_1 = stackOut_326_1;
                                stackIn_327_0 = stackOut_326_0;
                                stackIn_327_1 = stackOut_326_1;
                                if (-33 != (var4 ^ -1)) {
                                  stackOut_328_0 = this;
                                  stackOut_328_1 = this;
                                  stackOut_328_2 = 0;
                                  stackIn_329_0 = stackOut_328_0;
                                  stackIn_329_1 = stackOut_328_1;
                                  stackIn_329_2 = stackOut_328_2;
                                  break L58;
                                } else {
                                  stackOut_327_0 = this;
                                  stackOut_327_1 = this;
                                  stackOut_327_2 = 1;
                                  stackIn_329_0 = stackOut_327_0;
                                  stackIn_329_1 = stackOut_327_1;
                                  stackIn_329_2 = stackOut_327_2;
                                  break L58;
                                }
                              }
                              ((ko) (this)).field_d = stackIn_329_2 != 0;
                              ((ko) (this)).field_c = stackIn_329_2 != 0;
                              this.field_g = true;
                              if (var6 == 0) {
                                L59: {
                                  if (df.field_I) {
                                    ah.a((byte) -86, var3);
                                    iq.a(var3, (byte) 99);
                                    break L59;
                                  } else {
                                    break L59;
                                  }
                                }
                                if (var6 != 0) {
                                  discarded$33 = this.h(1);
                                  return true;
                                } else {
                                  return true;
                                }
                              } else {
                                L60: {
                                  this.field_e = true;
                                  this.field_g = true;
                                  if (df.field_I) {
                                    ah.a((byte) -86, var3);
                                    iq.a(var3, (byte) 99);
                                    break L60;
                                  } else {
                                    break L60;
                                  }
                                }
                                L61: {
                                  if (var6 == 0) {
                                    break L61;
                                  } else {
                                    discarded$34 = this.h(1);
                                    break L61;
                                  }
                                }
                                return true;
                              }
                            }
                          } else {
                            L62: {
                              this.field_g = true;
                              stackOut_108_0 = this;
                              stackIn_110_0 = stackOut_108_0;
                              stackIn_109_0 = stackOut_108_0;
                              if (-38 != (var4 ^ -1)) {
                                stackOut_110_0 = this;
                                stackOut_110_1 = 0;
                                stackIn_111_0 = stackOut_110_0;
                                stackIn_111_1 = stackOut_110_1;
                                break L62;
                              } else {
                                stackOut_109_0 = this;
                                stackOut_109_1 = 1;
                                stackIn_111_0 = stackOut_109_0;
                                stackIn_111_1 = stackOut_109_1;
                                break L62;
                              }
                            }
                            L63: {
                              ((ko) (this)).field_d = stackIn_111_1 != 0;
                              if (var6 == 0) {
                                break L63;
                              } else {
                                L64: {
                                  this.field_g = true;
                                  stackOut_112_0 = this;
                                  stackIn_114_0 = stackOut_112_0;
                                  stackIn_113_0 = stackOut_112_0;
                                  if (32 != var4) {
                                    stackOut_114_0 = this;
                                    stackOut_114_1 = 0;
                                    stackIn_115_0 = stackOut_114_0;
                                    stackIn_115_1 = stackOut_114_1;
                                    break L64;
                                  } else {
                                    stackOut_113_0 = this;
                                    stackOut_113_1 = 1;
                                    stackIn_115_0 = stackOut_113_0;
                                    stackIn_115_1 = stackOut_113_1;
                                    break L64;
                                  }
                                }
                                ((ko) (this)).field_d = stackIn_115_1 != 0;
                                if (var6 == 0) {
                                  break L63;
                                } else {
                                  L65: {
                                    this.field_g = true;
                                    stackOut_116_0 = this;
                                    stackIn_118_0 = stackOut_116_0;
                                    stackIn_117_0 = stackOut_116_0;
                                    if ((var4 ^ -1) != -34) {
                                      stackOut_118_0 = this;
                                      stackOut_118_1 = 0;
                                      stackIn_119_0 = stackOut_118_0;
                                      stackIn_119_1 = stackOut_118_1;
                                      break L65;
                                    } else {
                                      stackOut_117_0 = this;
                                      stackOut_117_1 = 1;
                                      stackIn_119_0 = stackOut_117_0;
                                      stackIn_119_1 = stackOut_117_1;
                                      break L65;
                                    }
                                  }
                                  ((ko) (this)).field_d = stackIn_119_1 != 0;
                                  if (var6 == 0) {
                                    break L63;
                                  } else {
                                    L66: {
                                      this.field_c = true;
                                      this.field_d = true;
                                      stackOut_120_0 = this;
                                      stackOut_120_1 = this;
                                      stackIn_122_0 = stackOut_120_0;
                                      stackIn_122_1 = stackOut_120_1;
                                      stackIn_121_0 = stackOut_120_0;
                                      stackIn_121_1 = stackOut_120_1;
                                      if (-33 != (var4 ^ -1)) {
                                        stackOut_122_0 = this;
                                        stackOut_122_1 = this;
                                        stackOut_122_2 = 0;
                                        stackIn_123_0 = stackOut_122_0;
                                        stackIn_123_1 = stackOut_122_1;
                                        stackIn_123_2 = stackOut_122_2;
                                        break L66;
                                      } else {
                                        stackOut_121_0 = this;
                                        stackOut_121_1 = this;
                                        stackOut_121_2 = 1;
                                        stackIn_123_0 = stackOut_121_0;
                                        stackIn_123_1 = stackOut_121_1;
                                        stackIn_123_2 = stackOut_121_2;
                                        break L66;
                                      }
                                    }
                                    ((ko) (this)).field_d = stackIn_123_2 != 0;
                                    ((ko) (this)).field_c = stackIn_123_2 != 0;
                                    this.field_g = true;
                                    if (var6 == 0) {
                                      L67: {
                                        if (df.field_I) {
                                          ah.a((byte) -86, var3);
                                          iq.a(var3, (byte) 99);
                                          break L67;
                                        } else {
                                          break L67;
                                        }
                                      }
                                      if (var6 == 0) {
                                        return true;
                                      } else {
                                        discarded$35 = this.h(1);
                                        return true;
                                      }
                                    } else {
                                      L68: {
                                        this.field_e = true;
                                        this.field_g = true;
                                        if (df.field_I) {
                                          ah.a((byte) -86, var3);
                                          iq.a(var3, (byte) 99);
                                          break L68;
                                        } else {
                                          break L68;
                                        }
                                      }
                                      L69: {
                                        if (var6 == 0) {
                                          break L69;
                                        } else {
                                          discarded$36 = this.h(1);
                                          break L69;
                                        }
                                      }
                                      return true;
                                    }
                                  }
                                }
                              }
                            }
                            L70: {
                              if (df.field_I) {
                                ah.a((byte) -86, var3);
                                iq.a(var3, (byte) 99);
                                break L70;
                              } else {
                                break L70;
                              }
                            }
                            if (var6 == 0) {
                              return true;
                            } else {
                              discarded$37 = this.h(1);
                              return true;
                            }
                          }
                        } else {
                          L71: {
                            this.field_g = true;
                            stackOut_69_0 = this;
                            stackIn_71_0 = stackOut_69_0;
                            stackIn_70_0 = stackOut_69_0;
                            if (-38 != (var4 ^ -1)) {
                              stackOut_71_0 = this;
                              stackOut_71_1 = 0;
                              stackIn_72_0 = stackOut_71_0;
                              stackIn_72_1 = stackOut_71_1;
                              break L71;
                            } else {
                              stackOut_70_0 = this;
                              stackOut_70_1 = 1;
                              stackIn_72_0 = stackOut_70_0;
                              stackIn_72_1 = stackOut_70_1;
                              break L71;
                            }
                          }
                          L72: {
                            ((ko) (this)).field_d = stackIn_72_1 != 0;
                            if (var6 == 0) {
                              break L72;
                            } else {
                              L73: {
                                this.field_g = true;
                                stackOut_73_0 = this;
                                stackIn_75_0 = stackOut_73_0;
                                stackIn_74_0 = stackOut_73_0;
                                if (32 != var4) {
                                  stackOut_75_0 = this;
                                  stackOut_75_1 = 0;
                                  stackIn_76_0 = stackOut_75_0;
                                  stackIn_76_1 = stackOut_75_1;
                                  break L73;
                                } else {
                                  stackOut_74_0 = this;
                                  stackOut_74_1 = 1;
                                  stackIn_76_0 = stackOut_74_0;
                                  stackIn_76_1 = stackOut_74_1;
                                  break L73;
                                }
                              }
                              ((ko) (this)).field_d = stackIn_76_1 != 0;
                              if (var6 == 0) {
                                break L72;
                              } else {
                                L74: {
                                  this.field_g = true;
                                  stackOut_77_0 = this;
                                  stackIn_79_0 = stackOut_77_0;
                                  stackIn_78_0 = stackOut_77_0;
                                  if ((var4 ^ -1) != -34) {
                                    stackOut_79_0 = this;
                                    stackOut_79_1 = 0;
                                    stackIn_80_0 = stackOut_79_0;
                                    stackIn_80_1 = stackOut_79_1;
                                    break L74;
                                  } else {
                                    stackOut_78_0 = this;
                                    stackOut_78_1 = 1;
                                    stackIn_80_0 = stackOut_78_0;
                                    stackIn_80_1 = stackOut_78_1;
                                    break L74;
                                  }
                                }
                                ((ko) (this)).field_d = stackIn_80_1 != 0;
                                if (var6 == 0) {
                                  break L72;
                                } else {
                                  L75: {
                                    this.field_c = true;
                                    this.field_d = true;
                                    stackOut_81_0 = this;
                                    stackOut_81_1 = this;
                                    stackIn_83_0 = stackOut_81_0;
                                    stackIn_83_1 = stackOut_81_1;
                                    stackIn_82_0 = stackOut_81_0;
                                    stackIn_82_1 = stackOut_81_1;
                                    if (-33 != (var4 ^ -1)) {
                                      stackOut_83_0 = this;
                                      stackOut_83_1 = this;
                                      stackOut_83_2 = 0;
                                      stackIn_84_0 = stackOut_83_0;
                                      stackIn_84_1 = stackOut_83_1;
                                      stackIn_84_2 = stackOut_83_2;
                                      break L75;
                                    } else {
                                      stackOut_82_0 = this;
                                      stackOut_82_1 = this;
                                      stackOut_82_2 = 1;
                                      stackIn_84_0 = stackOut_82_0;
                                      stackIn_84_1 = stackOut_82_1;
                                      stackIn_84_2 = stackOut_82_2;
                                      break L75;
                                    }
                                  }
                                  ((ko) (this)).field_d = stackIn_84_2 != 0;
                                  ((ko) (this)).field_c = stackIn_84_2 != 0;
                                  this.field_g = true;
                                  if (var6 == 0) {
                                    L76: {
                                      if (df.field_I) {
                                        ah.a((byte) -86, var3);
                                        iq.a(var3, (byte) 99);
                                        break L76;
                                      } else {
                                        break L76;
                                      }
                                    }
                                    if (var6 == 0) {
                                      return true;
                                    } else {
                                      discarded$38 = this.h(1);
                                      return true;
                                    }
                                  } else {
                                    L77: {
                                      this.field_e = true;
                                      this.field_g = true;
                                      if (df.field_I) {
                                        ah.a((byte) -86, var3);
                                        iq.a(var3, (byte) 99);
                                        break L77;
                                      } else {
                                        break L77;
                                      }
                                    }
                                    L78: {
                                      if (var6 == 0) {
                                        break L78;
                                      } else {
                                        discarded$39 = this.h(1);
                                        break L78;
                                      }
                                    }
                                    return true;
                                  }
                                }
                              }
                            }
                          }
                          L79: {
                            if (df.field_I) {
                              ah.a((byte) -86, var3);
                              iq.a(var3, (byte) 99);
                              break L79;
                            } else {
                              break L79;
                            }
                          }
                          if (var6 == 0) {
                            return true;
                          } else {
                            discarded$40 = this.h(1);
                            return true;
                          }
                        }
                      }
                    } else {
                      this.field_e = true;
                      if (var6 != 0) {
                        L80: {
                          this.field_d = true;
                          this.field_e = true;
                          this.field_g = true;
                          this.field_c = true;
                          this.field_g = true;
                          stackOut_24_0 = this;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_25_0 = stackOut_24_0;
                          if (-38 != (var4 ^ -1)) {
                            stackOut_26_0 = this;
                            stackOut_26_1 = 0;
                            stackIn_27_0 = stackOut_26_0;
                            stackIn_27_1 = stackOut_26_1;
                            break L80;
                          } else {
                            stackOut_25_0 = this;
                            stackOut_25_1 = 1;
                            stackIn_27_0 = stackOut_25_0;
                            stackIn_27_1 = stackOut_25_1;
                            break L80;
                          }
                        }
                        L81: {
                          ((ko) (this)).field_d = stackIn_27_1 != 0;
                          if (var6 == 0) {
                            break L81;
                          } else {
                            L82: {
                              this.field_g = true;
                              stackOut_28_0 = this;
                              stackIn_30_0 = stackOut_28_0;
                              stackIn_29_0 = stackOut_28_0;
                              if (32 != var4) {
                                stackOut_30_0 = this;
                                stackOut_30_1 = 0;
                                stackIn_31_0 = stackOut_30_0;
                                stackIn_31_1 = stackOut_30_1;
                                break L82;
                              } else {
                                stackOut_29_0 = this;
                                stackOut_29_1 = 1;
                                stackIn_31_0 = stackOut_29_0;
                                stackIn_31_1 = stackOut_29_1;
                                break L82;
                              }
                            }
                            ((ko) (this)).field_d = stackIn_31_1 != 0;
                            if (var6 == 0) {
                              break L81;
                            } else {
                              L83: {
                                this.field_g = true;
                                stackOut_32_0 = this;
                                stackIn_34_0 = stackOut_32_0;
                                stackIn_33_0 = stackOut_32_0;
                                if ((var4 ^ -1) != -34) {
                                  stackOut_34_0 = this;
                                  stackOut_34_1 = 0;
                                  stackIn_35_0 = stackOut_34_0;
                                  stackIn_35_1 = stackOut_34_1;
                                  break L83;
                                } else {
                                  stackOut_33_0 = this;
                                  stackOut_33_1 = 1;
                                  stackIn_35_0 = stackOut_33_0;
                                  stackIn_35_1 = stackOut_33_1;
                                  break L83;
                                }
                              }
                              ((ko) (this)).field_d = stackIn_35_1 != 0;
                              if (var6 == 0) {
                                break L81;
                              } else {
                                this.field_c = true;
                                this.field_d = true;
                                stackOut_36_0 = this;
                                stackOut_36_1 = this;
                                stackIn_39_0 = stackOut_36_0;
                                stackIn_39_1 = stackOut_36_1;
                                stackIn_37_0 = stackOut_36_0;
                                stackIn_37_1 = stackOut_36_1;
                                if (-33 != (var4 ^ -1)) {
                                  ((ko) (this)).field_d = false;
                                  ((ko) (this)).field_c = false;
                                  this.field_g = true;
                                  if (var6 == 0) {
                                    break L81;
                                  } else {
                                    this.field_e = true;
                                    this.field_g = true;
                                    break L81;
                                  }
                                } else {
                                  ((ko) (this)).field_d = true;
                                  ((ko) (this)).field_c = true;
                                  this.field_g = true;
                                  if (var6 == 0) {
                                    break L81;
                                  } else {
                                    this.field_e = true;
                                    this.field_g = true;
                                    break L81;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L84: {
                          if (df.field_I) {
                            ah.a((byte) -86, var3);
                            iq.a(var3, (byte) 99);
                            break L84;
                          } else {
                            break L84;
                          }
                        }
                        if (var6 == 0) {
                          return true;
                        } else {
                          discarded$41 = this.h(1);
                          return true;
                        }
                      } else {
                        L85: {
                          if (df.field_I) {
                            ah.a((byte) -86, var3);
                            iq.a(var3, (byte) 99);
                            if (var6 == 0) {
                              break L85;
                            } else {
                              discarded$42 = this.h(1);
                              break L85;
                            }
                          } else {
                            if (var6 == 0) {
                              break L85;
                            } else {
                              discarded$43 = this.h(1);
                              break L85;
                            }
                          }
                        }
                        return true;
                      }
                    }
                  }
                }
                this.field_e = true;
                if (var6 == 0) {
                  break L5;
                } else {
                  L86: {
                    this.field_d = true;
                    this.field_e = true;
                    this.field_g = true;
                    this.field_c = true;
                    this.field_g = true;
                    stackOut_261_0 = this;
                    stackIn_263_0 = stackOut_261_0;
                    stackIn_262_0 = stackOut_261_0;
                    if (-38 != (var4 ^ -1)) {
                      stackOut_263_0 = this;
                      stackOut_263_1 = 0;
                      stackIn_264_0 = stackOut_263_0;
                      stackIn_264_1 = stackOut_263_1;
                      break L86;
                    } else {
                      stackOut_262_0 = this;
                      stackOut_262_1 = 1;
                      stackIn_264_0 = stackOut_262_0;
                      stackIn_264_1 = stackOut_262_1;
                      break L86;
                    }
                  }
                  L87: {
                    ((ko) (this)).field_d = stackIn_264_1 != 0;
                    if (var6 == 0) {
                      break L87;
                    } else {
                      L88: {
                        this.field_g = true;
                        stackOut_265_0 = this;
                        stackIn_267_0 = stackOut_265_0;
                        stackIn_266_0 = stackOut_265_0;
                        if (32 != var4) {
                          stackOut_267_0 = this;
                          stackOut_267_1 = 0;
                          stackIn_268_0 = stackOut_267_0;
                          stackIn_268_1 = stackOut_267_1;
                          break L88;
                        } else {
                          stackOut_266_0 = this;
                          stackOut_266_1 = 1;
                          stackIn_268_0 = stackOut_266_0;
                          stackIn_268_1 = stackOut_266_1;
                          break L88;
                        }
                      }
                      ((ko) (this)).field_d = stackIn_268_1 != 0;
                      if (var6 == 0) {
                        break L87;
                      } else {
                        L89: {
                          this.field_g = true;
                          stackOut_269_0 = this;
                          stackIn_271_0 = stackOut_269_0;
                          stackIn_270_0 = stackOut_269_0;
                          if ((var4 ^ -1) != -34) {
                            stackOut_271_0 = this;
                            stackOut_271_1 = 0;
                            stackIn_272_0 = stackOut_271_0;
                            stackIn_272_1 = stackOut_271_1;
                            break L89;
                          } else {
                            stackOut_270_0 = this;
                            stackOut_270_1 = 1;
                            stackIn_272_0 = stackOut_270_0;
                            stackIn_272_1 = stackOut_270_1;
                            break L89;
                          }
                        }
                        ((ko) (this)).field_d = stackIn_272_1 != 0;
                        if (var6 == 0) {
                          break L87;
                        } else {
                          L90: {
                            this.field_c = true;
                            this.field_d = true;
                            stackOut_273_0 = this;
                            stackOut_273_1 = this;
                            stackIn_275_0 = stackOut_273_0;
                            stackIn_275_1 = stackOut_273_1;
                            stackIn_274_0 = stackOut_273_0;
                            stackIn_274_1 = stackOut_273_1;
                            if (-33 != (var4 ^ -1)) {
                              stackOut_275_0 = this;
                              stackOut_275_1 = this;
                              stackOut_275_2 = 0;
                              stackIn_276_0 = stackOut_275_0;
                              stackIn_276_1 = stackOut_275_1;
                              stackIn_276_2 = stackOut_275_2;
                              break L90;
                            } else {
                              stackOut_274_0 = this;
                              stackOut_274_1 = this;
                              stackOut_274_2 = 1;
                              stackIn_276_0 = stackOut_274_0;
                              stackIn_276_1 = stackOut_274_1;
                              stackIn_276_2 = stackOut_274_2;
                              break L90;
                            }
                          }
                          ((ko) (this)).field_d = stackIn_276_2 != 0;
                          ((ko) (this)).field_c = stackIn_276_2 != 0;
                          this.field_g = true;
                          if (var6 == 0) {
                            break L87;
                          } else {
                            L91: {
                              this.field_e = true;
                              this.field_g = true;
                              if (df.field_I) {
                                ah.a((byte) -86, var3);
                                iq.a(var3, (byte) 99);
                                break L91;
                              } else {
                                break L91;
                              }
                            }
                            L92: {
                              if (var6 == 0) {
                                break L92;
                              } else {
                                discarded$44 = this.h(1);
                                break L92;
                              }
                            }
                            return true;
                          }
                        }
                      }
                    }
                  }
                  L93: {
                    if (df.field_I) {
                      ah.a((byte) -86, var3);
                      iq.a(var3, (byte) 99);
                      break L93;
                    } else {
                      break L93;
                    }
                  }
                  if (var6 != 0) {
                    discarded$45 = this.h(1);
                    return true;
                  } else {
                    return true;
                  }
                }
              }
              L94: {
                if (df.field_I) {
                  ah.a((byte) -86, var3);
                  iq.a(var3, (byte) 99);
                  break L94;
                } else {
                  break L94;
                }
              }
              if (var6 != 0) {
                discarded$46 = this.h(1);
                return true;
              } else {
                return true;
              }
            }
          } else {
            discarded$47 = this.h(1);
            return true;
          }
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        var4 = (param2 + -190) / 40;
        if (param1 <= var4) {
          if (var4 < this.field_m) {
            if (null != this.field_b[var4]) {
              if (this.field_b[var4].a(param0, param2, (byte) -46)) {
                return this.b(17, var4);
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean h(int param0) {
        if (!this.a((byte) -122)) {
          return false;
        } else {
          if (null == this.field_b[this.field_l]) {
            this.field_l = -1;
            this.field_c = false;
            this.field_d = false;
            this.field_e = false;
            this.field_g = false;
            if (param0 == 1) {
              return true;
            } else {
              return true;
            }
          } else {
            this.field_b[this.field_l].c((byte) 18);
            this.field_l = -1;
            this.field_c = false;
            this.field_d = false;
            this.field_e = false;
            this.field_g = false;
            if (param0 == 1) {
              return true;
            } else {
              return true;
            }
          }
        }
    }

    final void a(int param0, id param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        ti var6 = null;
        wb var7 = null;
        int var8 = 0;
        int var9 = 0;
        ti stackIn_7_0 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ti stackOut_6_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var5_int = this.e(-1);
                if (!(param1 instanceof jj)) {
                  break L2;
                } else {
                  wd.a(param1.field_y, -1, this.field_l, op.field_m.field_H, ma.field_a);
                  if (var9 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var6 = (ti) ((Object) param1);
                if (var6 instanceof wb) {
                  stackOut_6_0 = (ti) (var6);
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_5_0 = null;
                  stackIn_7_0 = (ti) ((Object) stackOut_5_0);
                  break L3;
                }
              }
              L4: {
                var7 = (wb) ((Object) stackIn_7_0);
                var8 = var5_int;
                if (-256 != (var8 ^ -1)) {
                  break L4;
                } else {
                  if (var9 == 0) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                L6: {
                  L7: {
                    L8: {
                      L9: {
                        if (-13 == (var8 ^ -1)) {
                          break L9;
                        } else {
                          if ((var8 ^ -1) == -12) {
                            break L9;
                          } else {
                            L10: {
                              if (13 != var8) {
                                break L10;
                              } else {
                                if (var9 == 0) {
                                  break L8;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (var8 != 10) {
                                break L11;
                              } else {
                                if (var9 == 0) {
                                  break L8;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if ((var8 ^ -1) == -10) {
                              break L8;
                            } else {
                              if (var8 == 15) {
                                break L8;
                              } else {
                                L12: {
                                  if ((var8 ^ -1) != -18) {
                                    break L12;
                                  } else {
                                    if (var9 == 0) {
                                      break L7;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                L13: {
                                  if (3 != var8) {
                                    break L13;
                                  } else {
                                    if (var9 == 0) {
                                      break L6;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                L14: {
                                  if (-2 != (var8 ^ -1)) {
                                    break L14;
                                  } else {
                                    if (var9 == 0) {
                                      break L5;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                L15: {
                                  if (var8 != 2) {
                                    break L15;
                                  } else {
                                    if (var9 == 0) {
                                      break L5;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                L16: {
                                  if ((var8 ^ -1) != -5) {
                                    break L16;
                                  } else {
                                    if (var9 == 0) {
                                      break L5;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                if (-15 == (var8 ^ -1)) {
                                  break L5;
                                } else {
                                  L17: {
                                    if ((var8 ^ -1) != -17) {
                                      break L17;
                                    } else {
                                      if (var9 == 0) {
                                        break L5;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  L18: {
                                    if (var8 != 5) {
                                      break L18;
                                    } else {
                                      if (var9 == 0) {
                                        break L5;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L19: {
                                    if (-19 != (var8 ^ -1)) {
                                      break L19;
                                    } else {
                                      if (var9 == 0) {
                                        break L5;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  L20: {
                                    if (var8 != 7) {
                                      break L20;
                                    } else {
                                      if (var9 == 0) {
                                        wd.a(var6.field_y, -1, this.field_l, op.field_m.field_H, ma.field_a);
                                        break L1;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                  if (-1 == (var8 ^ -1)) {
                                    wd.a(var6.field_y, -1, this.field_l, op.field_m.field_H, ma.field_a);
                                    break L1;
                                  } else {
                                    wd.a(var6.field_y, -1, this.field_l, op.field_m.field_H, ma.field_a);
                                    break L1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      nn.a(ma.field_a, op.field_m.field_H, this.field_l, (byte) 102);
                      if (var9 == 0) {
                        break L1;
                      } else {
                        break L8;
                      }
                    }
                    ok.a(-117, param0, ma.field_a, op.field_m.field_H, param2, this.field_l);
                    if (var9 == 0) {
                      break L1;
                    } else {
                      break L7;
                    }
                  }
                  L21: {
                    if (var6 != null) {
                      param0 = -1;
                      param2 = var6.field_y;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  ok.a(-101, param0, ma.field_a, op.field_m.field_H, param2, this.field_l);
                  if (var9 == 0) {
                    break L1;
                  } else {
                    break L6;
                  }
                }
                L22: {
                  if (var7 == null) {
                    break L22;
                  } else {
                    if (!var7.q(-14945)) {
                      break L22;
                    } else {
                      if (!var7.o(127)) {
                        wd.a(var6.field_y, -1, this.field_l, op.field_m.field_H, ma.field_a);
                        if (var9 == 0) {
                          break L1;
                        } else {
                          break L5;
                        }
                      } else {
                        break L22;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
              L23: {
                if (var7 == null) {
                  break L23;
                } else {
                  if (!var7.o(88)) {
                    wd.a(var6.field_y, -1, this.field_l, op.field_m.field_H, ma.field_a);
                    if (var9 == 0) {
                      break L1;
                    } else {
                      wd.a(var6.field_y, -1, this.field_l, op.field_m.field_H, ma.field_a);
                      break L1;
                    }
                  } else {
                    break L23;
                  }
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
            tg.field_e.field_b[this.field_l] = op.field_m.field_H - -op.field_m.a(ll.field_k.field_g[this.field_l], var5_int, fb.field_e.field_M, false);
            this.field_b[this.field_l].a(0);
            this.field_c = false;
            this.field_g = false;
            if (param3 >= 112) {
              this.field_l = -1;
              this.field_e = false;
              this.field_d = false;
              iq.a(-11, (byte) 99);
              decompiledRegionSelector0 = 4;
              break L0;
            } else {
              decompiledRegionSelector0 = 3;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var5 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) (var5);
            stackOut_78_1 = new StringBuilder().append("ko.S(").append(param0).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param1 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L24;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L24;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final boolean a(int param0) {
        if (param0 != 20) {
            field_j = (String) null;
            return this.field_d;
        }
        return this.field_d;
    }

    final void b(int param0) {
        int var2 = 0;
        fb[] var3 = null;
        int var4 = 0;
        fb var5 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 110 / ((34 - param0) / 58);
        var3 = this.field_b;
        var4 = 0;
        L0: while (true) {
          if (var3.length > var4) {
            var5 = var3[var4];
            if (var6 == 0) {
              L1: {
                if (var5 == null) {
                  break L1;
                } else {
                  var5.field_b = false;
                  var5.b(2);
                  var5.c((byte) 18);
                  break L1;
                }
              }
              var4++;
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    ko() {
        this.field_d = false;
        this.field_f = 0;
        this.field_e = false;
        this.field_g = false;
        this.field_c = false;
        this.field_a = -1;
        this.field_b = new fb[8];
        this.field_m = 0;
        this.field_l = -1;
    }

    static {
        field_i = "Waiting for sound effects";
        field_h = "Location";
        field_k = "Players: ";
        field_j = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
