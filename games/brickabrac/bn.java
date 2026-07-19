/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bn extends vi {
    int field_s;
    static String field_t;
    static jp field_p;
    int field_u;
    static mh field_q;
    static wq field_r;

    boolean a(no param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
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
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var34 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param0.field_u;
              var4 = var3_int + param0.field_j;
              var5 = var3_int + param0.field_m;
              var6 = -this.field_m + -(this.field_s >> 1712513089) + var5;
              if (-1 >= (var6 ^ -1)) {
                break L1;
              } else {
                var6 = -var6;
                break L1;
              }
            }
            if (var3_int - -(this.field_s >> -2084793375) > var6) {
              L2: {
                var6 = -(this.field_u >> 4229409) - (this.field_j - var4);
                if (-1 >= (var6 ^ -1)) {
                  break L2;
                } else {
                  var6 = -var6;
                  break L2;
                }
              }
              if (var6 >= (this.field_u >> 1822499265) + var3_int) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var7 = var4;
                  var8 = var5;
                  if (this.field_m <= var5) {
                    if (this.field_s + this.field_m >= var5) {
                      break L3;
                    } else {
                      var8 = this.field_m + this.field_s;
                      break L3;
                    }
                  } else {
                    var8 = this.field_m;
                    break L3;
                  }
                }
                L4: {
                  if (var4 < this.field_j) {
                    var7 = this.field_j;
                    break L4;
                  } else {
                    if (var4 <= this.field_j + this.field_u) {
                      break L4;
                    } else {
                      var7 = this.field_u + this.field_j;
                      break L4;
                    }
                  }
                }
                var9 = (-var4 + var7) * (var7 + -var4) - -((var8 - var5) * (-var5 + var8));
                if (var9 <= var3_int * var3_int) {
                  L5: {
                    var10 = 0;
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    var17 = 0;
                    var18 = -this.field_o + param0.field_o;
                    var19 = -var3_int + this.field_m - var5;
                    var20 = var19 << -302670456;
                    var21 = -var5 + (this.field_m - -var3_int) + this.field_s;
                    var22 = var21 << 1235057864;
                    if (var18 == 0) {
                      break L5;
                    } else {
                      var22 = var22 / var18;
                      var20 = var20 / var18;
                      break L5;
                    }
                  }
                  L6: {
                    var23 = -3 / ((param1 - -29) / 35);
                    if (var20 < var22) {
                      var14 = var19;
                      var17 = 1;
                      var12 = var20;
                      break L6;
                    } else {
                      var14 = var21;
                      var12 = var22;
                      var17 = 2;
                      break L6;
                    }
                  }
                  L7: {
                    var14 = var14 + var5;
                    var24 = -this.field_k + param0.field_k;
                    var25 = -var3_int + this.field_j - var4;
                    var26 = var25 << -567660184;
                    var27 = -var4 + (this.field_j + var3_int - -this.field_u);
                    var28 = var27 << -966662072;
                    if (var24 == 0) {
                      break L7;
                    } else {
                      var28 = var28 / var24;
                      var26 = var26 / var24;
                      break L7;
                    }
                  }
                  L8: {
                    if (var28 <= var26) {
                      var13 = var27;
                      var16 = 4;
                      var11 = var28;
                      break L8;
                    } else {
                      var16 = 8;
                      var11 = var26;
                      var13 = var25;
                      break L8;
                    }
                  }
                  L9: {
                    L10: {
                      var13 = var13 + var4;
                      var29 = var4 + (var12 * var24 >> -1118643224);
                      var30 = (var18 * var11 >> 1248239432) + var5;
                      if (-1 == (var18 ^ -1)) {
                        break L10;
                      } else {
                        if (var29 < this.field_j - var3_int) {
                          break L10;
                        } else {
                          if (var29 <= var3_int + this.field_u + this.field_j) {
                            L11: {
                              if (var24 == 0) {
                                break L11;
                              } else {
                                if (-var3_int + this.field_m > var30) {
                                  break L11;
                                } else {
                                  if (var3_int + this.field_m - -this.field_s >= var30) {
                                    if (var12 >= var11) {
                                      var10 = var11;
                                      var15 = var16;
                                      var14 = var5 + (var18 * var10 >> 162497096);
                                      break L9;
                                    } else {
                                      var15 = var17;
                                      var10 = var12;
                                      var13 = (var24 * var10 >> -547518264) + var4;
                                      break L9;
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            var15 = var17;
                            var10 = var12;
                            var13 = var4 - -(var10 * var24 >> 2005670344);
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    var10 = var11;
                    var15 = var16;
                    var14 = (var10 * var18 >> -1711406104) + var5;
                    break L9;
                  }
                  L12: {
                    var31 = 0;
                    var32 = 0;
                    if (-9 == (var15 ^ -1)) {
                      var31 = 256;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (4 != var15) {
                      break L13;
                    } else {
                      var31 = -256;
                      break L13;
                    }
                  }
                  L14: {
                    if (1 != var15) {
                      break L14;
                    } else {
                      var32 = 256;
                      break L14;
                    }
                  }
                  L15: {
                    if (2 == var15) {
                      var32 = -256;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var33 = -(var32 * var18 + var31 * var24) >> -2057217048;
                  if (-1 <= (var33 ^ -1)) {
                    if (var10 > ea.field_b) {
                      stackOut_61_0 = 1;
                      stackIn_62_0 = stackOut_61_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      oh.field_f = var13 - param0.field_u;
                      ea.field_b = var10;
                      mn.field_A = var31;
                      ae.field_b = var32;
                      dj.field_c = (bn) (this);
                      sh.field_a = var15;
                      mm.field_Tb = -param0.field_u + var14;
                      stackOut_63_0 = 1;
                      stackIn_64_0 = stackOut_63_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    stackOut_57_0 = 0;
                    stackIn_58_0 = stackOut_57_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) (var3);
            stackOut_65_1 = new StringBuilder().append("bn.F(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L16;
            } else {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L16;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_58_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_62_0 != 0;
                } else {
                  return stackIn_64_0 != 0;
                }
              }
            }
          }
        }
    }

    bn(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0, param1, param2, param3, param6);
        this.field_s = param5;
        this.field_u = param4;
    }

    final boolean a(no param0, boolean param1) {
        RuntimeException var3 = null;
        long var3_long = 0L;
        long var5 = 0L;
        long var7 = 0L;
        long var9 = 0L;
        long var11 = 0L;
        long var13 = 0L;
        long var15 = 0L;
        int var17 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var17 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_long = (long)param0.field_u;
              var5 = (long)param0.field_j;
              var7 = (long)param0.field_m;
              var9 = (long)(-this.field_m - this.field_s / 2) + var7;
              if (var9 < 0L) {
                var9 = -var9;
                break L1;
              } else {
                break L1;
              }
            }
            if (var9 < (long)(this.field_s / 2) + var3_long) {
              L2: {
                var9 = var5 + (long)(-this.field_j - this.field_u / 2);
                if (-1L < (var9 ^ -1L)) {
                  var9 = -var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (!param1) {
                  break L3;
                } else {
                  bn.c(111);
                  break L3;
                }
              }
              if (var3_long + (long)(this.field_u / 2) <= var9) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L4: {
                  var11 = var5;
                  var13 = var7;
                  if ((var5 ^ -1L) > ((long)this.field_j ^ -1L)) {
                    var11 = (long)this.field_j;
                    break L4;
                  } else {
                    if ((var5 ^ -1L) >= ((long)(this.field_j - -this.field_u) ^ -1L)) {
                      break L4;
                    } else {
                      var11 = (long)(this.field_j - -this.field_u);
                      break L4;
                    }
                  }
                }
                L5: {
                  if ((var7 ^ -1L) <= ((long)this.field_m ^ -1L)) {
                    if ((var7 ^ -1L) < ((long)(this.field_s + this.field_m) ^ -1L)) {
                      var13 = (long)(this.field_m + this.field_s);
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    var13 = (long)this.field_m;
                    break L5;
                  }
                }
                var15 = (var11 + -var5) * (var11 + -var5) + (-var7 + var13) * (var13 + -var7);
                if (var15 > var3_long * var3_long) {
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return true;
                }
              }
            } else {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var3);
            stackOut_29_1 = new StringBuilder().append("bn.C(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_28_0 != 0;
          }
        }
    }

    void a(byte param0, j param1, no param2) {
        boolean discarded$0 = false;
        try {
            if (param0 != 53) {
                no var5 = (no) null;
                discarded$0 = this.a((no) null, (byte) 44);
            }
            param2.field_j = oh.field_f;
            param2.field_m = mm.field_Tb;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "bn.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(int param0) {
        int var1 = 62 / ((25 - param0) / 57);
        if (ej.field_I != null) {
            ej.field_I.m(17);
        }
        pq.field_o = new qo();
        rj.field_c.b((byte) 110, pq.field_o);
    }

    int a(int param0, StringBuilder param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 79) {
                break L1;
              } else {
                this.field_s = 1;
                break L1;
              }
            }
            stackOut_2_0 = (33029 + this.field_s * 37 << -1457884979) + (41 * this.field_u - -29813 << -819356926) ^ super.a(80, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("bn.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void d(byte param0) {
        field_p = null;
        field_r = null;
        field_q = null;
        int var1 = 51 / ((-46 - param0) / 34);
        field_t = null;
    }

    static {
        field_t = "Offer rematch";
    }
}
