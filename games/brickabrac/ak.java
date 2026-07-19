/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    j[] field_l;
    static String field_e;
    int field_i;
    int field_k;
    static mh field_d;
    boolean field_c;
    int[] field_m;
    int field_n;
    int field_h;
    String[] field_f;
    int field_a;
    oi field_b;
    int field_g;
    int field_j;

    final void a(int param0, int param1, vl param2, byte param3) {
        int discarded$2 = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        ge var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 <= -39) {
                break L1;
              } else {
                discarded$2 = this.c(86);
                break L1;
              }
            }
            var8 = (ge) ((Object) param2.d(-44));
            L2: while (true) {
              if (var8 == null) {
                break L0;
              } else {
                L3: {
                  L4: {
                    if (this.field_k == 1) {
                      break L4;
                    } else {
                      if (!var8.b(false)) {
                        var6 = 0;
                        L5: while (true) {
                          if (var6 >= this.field_k) {
                            break L3;
                          } else {
                            L6: {
                              if (var6 == param0) {
                                break L6;
                              } else {
                                if ((1 << var6 & (this.field_g | this.field_i | this.field_a)) != 0) {
                                  break L6;
                                } else {
                                  this.field_l[var6].field_kb.a(new ge(var8, param1 + this.field_l[var6].field_F), (byte) -39);
                                  break L6;
                                }
                              }
                            }
                            var6++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_l[param0].field_kb.a(new ge(var8, param1 + this.field_l[param0].field_F), (byte) -39);
                  break L3;
                }
                var8 = (ge) ((Object) param2.a((byte) 116));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("ak.I(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
    }

    final int a(byte param0) {
        boolean discarded$2 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        vn var5 = null;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          var2 = 0;
          if (param0 == -92) {
            break L0;
          } else {
            var5 = (vn) null;
            discarded$2 = this.a((j) null, (vl) null, -18, 53, (vn) null);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= this.field_k) {
            return var2;
          } else {
            if (((this.field_i | (this.field_a | this.field_g)) & 1 << var3) == 0) {
              if (this.field_l[var3].field_M == 0) {
                var2 = var2 | 1 << var3;
                var3++;
                continue L1;
              } else {
                var3++;
                continue L1;
              }
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final void a(boolean param0) {
        int discarded$0 = 0;
        if (param0) {
            discarded$0 = this.c(-32);
        }
        this.field_c = true;
    }

    final int c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var3 = 0;
        if (param0 == -17566) {
          L0: while (true) {
            if (var3 >= this.field_k) {
              return var2;
            } else {
              if ((1 << var3 & this.field_a) == 0) {
                if (7 == this.field_l[var3].field_Z) {
                  var2 = var2 | 1 << var3;
                  var3++;
                  continue L0;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return -12;
        }
    }

    final void a(j param0, vl param1, vl param2, int param3) {
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        on dupTemp$16 = null;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        RuntimeException var5 = null;
        kc var5_ref = null;
        ul var6 = null;
        vo var7 = null;
        vl[] var8_ref_vl__ = null;
        int var8 = 0;
        int var9_int = 0;
        on var9 = null;
        vn var9_ref = null;
        cl var9_ref2 = null;
        il var9_ref3 = null;
        vo var9_ref4 = null;
        int var10 = 0;
        ge var10_ref_ge = null;
        on var10_ref_on = null;
        vn var10_ref_vn = null;
        Object var11_ref = null;
        int var11 = 0;
        on var11_ref_on = null;
        ee var11_ref_ee = null;
        Object var12_ref = null;
        on var12_ref_on = null;
        int var12 = 0;
        vn var13 = null;
        on var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        vl var18 = null;
        vl var19 = null;
        no var20 = null;
        vl var21 = null;
        vl var22 = null;
        vl var23 = null;
        ee var24 = null;
        vl var25 = null;
        vl var26 = null;
        j stackIn_54_0 = null;
        j stackIn_55_0 = null;
        j stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_132_0 = 0;
        int stackIn_142_0 = 0;
        j stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        j stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        j stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        int stackIn_156_2 = 0;
        j stackIn_157_0 = null;
        j stackIn_158_0 = null;
        j stackIn_159_0 = null;
        String[] stackIn_159_1 = null;
        int stackIn_245_0 = 0;
        j stackIn_269_0 = null;
        int stackIn_269_1 = 0;
        j stackIn_270_0 = null;
        int stackIn_270_1 = 0;
        j stackIn_271_0 = null;
        int stackIn_271_1 = 0;
        int stackIn_271_2 = 0;
        int stackIn_279_0 = 0;
        int stackIn_283_0 = 0;
        int stackIn_284_0 = 0;
        int stackIn_285_0 = 0;
        int stackIn_285_1 = 0;
        j stackIn_286_0 = null;
        j stackIn_287_0 = null;
        j stackIn_288_0 = null;
        int stackIn_288_1 = 0;
        j stackIn_297_0 = null;
        j stackIn_298_0 = null;
        j stackIn_299_0 = null;
        j stackIn_300_0 = null;
        j stackIn_301_0 = null;
        j stackIn_302_0 = null;
        String[] stackIn_302_1 = null;
        RuntimeException stackIn_387_0 = null;
        StringBuilder stackIn_387_1 = null;
        RuntimeException stackIn_388_0 = null;
        StringBuilder stackIn_388_1 = null;
        RuntimeException stackIn_389_0 = null;
        StringBuilder stackIn_389_1 = null;
        String stackIn_389_2 = null;
        RuntimeException stackIn_390_0 = null;
        StringBuilder stackIn_390_1 = null;
        RuntimeException stackIn_391_0 = null;
        StringBuilder stackIn_391_1 = null;
        RuntimeException stackIn_392_0 = null;
        StringBuilder stackIn_392_1 = null;
        String stackIn_392_2 = null;
        RuntimeException stackIn_393_0 = null;
        StringBuilder stackIn_393_1 = null;
        RuntimeException stackIn_394_0 = null;
        StringBuilder stackIn_394_1 = null;
        RuntimeException stackIn_395_0 = null;
        StringBuilder stackIn_395_1 = null;
        String stackIn_395_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        j stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        j stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        int stackOut_155_2 = 0;
        j stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        int stackOut_154_2 = 0;
        j stackOut_156_0 = null;
        j stackOut_158_0 = null;
        String[] stackOut_158_1 = null;
        j stackOut_157_0 = null;
        String[] stackOut_157_1 = null;
        int stackOut_130_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_243_0 = 0;
        j stackOut_268_0 = null;
        int stackOut_268_1 = 0;
        j stackOut_270_0 = null;
        int stackOut_270_1 = 0;
        int stackOut_270_2 = 0;
        j stackOut_269_0 = null;
        int stackOut_269_1 = 0;
        int stackOut_269_2 = 0;
        int stackOut_278_0 = 0;
        int stackOut_277_0 = 0;
        int stackOut_282_0 = 0;
        int stackOut_284_0 = 0;
        int stackOut_284_1 = 0;
        int stackOut_283_0 = 0;
        int stackOut_283_1 = 0;
        j stackOut_285_0 = null;
        j stackOut_287_0 = null;
        int stackOut_287_1 = 0;
        j stackOut_286_0 = null;
        int stackOut_286_1 = 0;
        j stackOut_296_0 = null;
        j stackOut_297_0 = null;
        j stackOut_298_0 = null;
        j stackOut_301_0 = null;
        String[] stackOut_301_1 = null;
        j stackOut_299_0 = null;
        j stackOut_300_0 = null;
        String[] stackOut_300_1 = null;
        j stackOut_53_0 = null;
        j stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        j stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        RuntimeException stackOut_386_0 = null;
        StringBuilder stackOut_386_1 = null;
        RuntimeException stackOut_388_0 = null;
        StringBuilder stackOut_388_1 = null;
        String stackOut_388_2 = null;
        RuntimeException stackOut_387_0 = null;
        StringBuilder stackOut_387_1 = null;
        String stackOut_387_2 = null;
        RuntimeException stackOut_389_0 = null;
        StringBuilder stackOut_389_1 = null;
        RuntimeException stackOut_391_0 = null;
        StringBuilder stackOut_391_1 = null;
        String stackOut_391_2 = null;
        RuntimeException stackOut_390_0 = null;
        StringBuilder stackOut_390_1 = null;
        String stackOut_390_2 = null;
        RuntimeException stackOut_392_0 = null;
        StringBuilder stackOut_392_1 = null;
        RuntimeException stackOut_394_0 = null;
        StringBuilder stackOut_394_1 = null;
        String stackOut_394_2 = null;
        RuntimeException stackOut_393_0 = null;
        StringBuilder stackOut_393_1 = null;
        String stackOut_393_2 = null;
        Object var10_ref = null;
        var12_ref = null;
        var11_ref = null;
        var17 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param3 >= param0.field_i) {
                  break L2;
                } else {
                  fieldTemp$12 = param0.field_i - 1;
                  param0.field_i = param0.field_i - 1;
                  if (-1 <= (fieldTemp$12 ^ -1)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                param0.field_fb = param0.field_lb;
                if (null == param0.field_fb) {
                  break L3;
                } else {
                  param0.field_i = 100;
                  break L3;
                }
              }
              param0.field_lb = null;
              break L1;
            }
            L4: {
              if (param0.field_M > 0) {
                param0.field_M = param0.field_M - 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param0.field_ib <= 0) {
                break L5;
              } else {
                fieldTemp$13 = param0.field_ib - 1;
                param0.field_ib = param0.field_ib - 1;
                if (0 != fieldTemp$13) {
                  break L5;
                } else {
                  param0.b(16387, 0);
                  break L5;
                }
              }
            }
            var5_ref = (kc) ((Object) param0.field_x.d(-58));
            L6: while (true) {
              if (var5_ref == null) {
                var6 = (ul) ((Object) param0.field_nb.d(-85));
                L7: while (true) {
                  if (var6 == null) {
                    L8: {
                      var7 = param0.field_yb;
                      if (-3 == (param0.field_Z ^ -1)) {
                        L9: {
                          if (param1 == null) {
                            break L9;
                          } else {
                            if (0 == (3 & param0.field_db)) {
                              break L9;
                            } else {
                              if (3 != param0.field_db) {
                                param1.a(new qc(4), (byte) 3);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        L10: {
                          if (0 < var7.field_w) {
                            param0.field_db = param0.field_db ^ 3;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if ((param0.field_db & 2) == 0) {
                            break L11;
                          } else {
                            var7.field_k = 2048;
                            break L11;
                          }
                        }
                        L12: {
                          if (-1 != (param0.field_db & 1 ^ -1)) {
                            var7.field_k = var7.field_k - 2048;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if ((param0.field_db & 4) != 0) {
                            L14: {
                              var8 = 0;
                              if (!param0.field_gb.a(false)) {
                                var9_ref = (vn) ((Object) param0.field_gb.d(-76));
                                L15: while (true) {
                                  if (var9_ref == null) {
                                    break L14;
                                  } else {
                                    L16: {
                                      if (40 > var9_ref.field_C) {
                                        break L16;
                                      } else {
                                        L17: {
                                          if (param1 != null) {
                                            param1.a(new qc(6), (byte) 3);
                                            break L17;
                                          } else {
                                            break L17;
                                          }
                                        }
                                        var8 = 1;
                                        var9_ref.field_C = 0;
                                        param0.field_x.a(new kc(var9_ref.field_j, var9_ref.field_m), (byte) 3);
                                        param0.field_l = 0;
                                        var20 = new no(var9_ref.field_u + var9_ref.field_j, var9_ref.field_u + var9_ref.field_m, 0, 0, 15360, 0);
                                        var11 = 0;
                                        var12 = 0;
                                        L18: while (true) {
                                          if (param0.field_z.length <= var12) {
                                            L19: {
                                              stackOut_153_0 = (j) (param0);
                                              stackOut_153_1 = 16387;
                                              stackIn_155_0 = stackOut_153_0;
                                              stackIn_155_1 = stackOut_153_1;
                                              stackIn_154_0 = stackOut_153_0;
                                              stackIn_154_1 = stackOut_153_1;
                                              if (-1 > (var11 ^ -1)) {
                                                stackOut_155_0 = (j) ((Object) stackIn_155_0);
                                                stackOut_155_1 = stackIn_155_1;
                                                stackOut_155_2 = 1;
                                                stackIn_156_0 = stackOut_155_0;
                                                stackIn_156_1 = stackOut_155_1;
                                                stackIn_156_2 = stackOut_155_2;
                                                break L19;
                                              } else {
                                                stackOut_154_0 = (j) ((Object) stackIn_154_0);
                                                stackOut_154_1 = stackIn_154_1;
                                                stackOut_154_2 = 6;
                                                stackIn_156_0 = stackOut_154_0;
                                                stackIn_156_1 = stackOut_154_1;
                                                stackIn_156_2 = stackOut_154_2;
                                                break L19;
                                              }
                                            }
                                            L20: {
                                              ((j) (Object) stackIn_156_0).b(stackIn_156_1, stackIn_156_2);
                                              stackOut_156_0 = (j) (param0);
                                              stackIn_158_0 = stackOut_156_0;
                                              stackIn_157_0 = stackOut_156_0;
                                              if (-1 > (var11 ^ -1)) {
                                                stackOut_158_0 = (j) ((Object) stackIn_158_0);
                                                stackOut_158_1 = ml.field_e;
                                                stackIn_159_0 = stackOut_158_0;
                                                stackIn_159_1 = stackOut_158_1;
                                                break L20;
                                              } else {
                                                stackOut_157_0 = (j) ((Object) stackIn_157_0);
                                                stackOut_157_1 = eh.field_e;
                                                stackIn_159_0 = stackOut_157_0;
                                                stackIn_159_1 = stackOut_157_1;
                                                break L20;
                                              }
                                            }
                                            ((j) (Object) stackIn_159_0).a(stackIn_159_1, (byte) 75);
                                            break L16;
                                          } else {
                                            var19 = param0.field_z[var12];
                                            var21 = var19;
                                            var22 = var21;
                                            var21 = var19;
                                            var14 = (on) ((Object) var19.d(-78));
                                            L21: while (true) {
                                              if (var14 == null) {
                                                var12++;
                                                continue L18;
                                              } else {
                                                L22: {
                                                  if (!var14.a(var20, false)) {
                                                    break L22;
                                                  } else {
                                                    L23: {
                                                      if ((var14.field_i ^ -1) >= -1) {
                                                        if ((var14.field_i ^ -1) != -20) {
                                                          if (-21 != (var14.field_i ^ -1)) {
                                                            if (21 != var14.field_i) {
                                                              if (-23 == (var14.field_i ^ -1)) {
                                                                stackOut_130_0 = 1;
                                                                stackIn_132_0 = stackOut_130_0;
                                                                break L23;
                                                              } else {
                                                                stackOut_129_0 = 0;
                                                                stackIn_132_0 = stackOut_129_0;
                                                                break L23;
                                                              }
                                                            } else {
                                                              stackOut_127_0 = 1;
                                                              stackIn_132_0 = stackOut_127_0;
                                                              break L23;
                                                            }
                                                          } else {
                                                            stackOut_125_0 = 1;
                                                            stackIn_132_0 = stackOut_125_0;
                                                            break L23;
                                                          }
                                                        } else {
                                                          stackOut_123_0 = 1;
                                                          stackIn_132_0 = stackOut_123_0;
                                                          break L23;
                                                        }
                                                      } else {
                                                        stackOut_121_0 = 1;
                                                        stackIn_132_0 = stackOut_121_0;
                                                        break L23;
                                                      }
                                                    }
                                                    L24: {
                                                      var15 = stackIn_132_0;
                                                      if ((var14.field_i ^ -1) == -23) {
                                                        var14.field_i = 23;
                                                        break L24;
                                                      } else {
                                                        break L24;
                                                      }
                                                    }
                                                    L25: {
                                                      if (-22 != (var14.field_i ^ -1)) {
                                                        break L25;
                                                      } else {
                                                        var14.field_i = 22;
                                                        break L25;
                                                      }
                                                    }
                                                    if (var15 != 0) {
                                                      L26: {
                                                        if (var14.field_R != 0) {
                                                          stackOut_141_0 = 0;
                                                          stackIn_142_0 = stackOut_141_0;
                                                          break L26;
                                                        } else {
                                                          stackOut_140_0 = 1;
                                                          stackIn_142_0 = stackOut_140_0;
                                                          break L26;
                                                        }
                                                      }
                                                      L27: {
                                                        L28: {
                                                          var16 = stackIn_142_0;
                                                          var14.field_R = ue.field_b[var14.field_i];
                                                          var14.field_B = rb.field_a[var14.field_i];
                                                          var14.field_l = 0;
                                                          if (19 == var14.field_i) {
                                                            break L28;
                                                          } else {
                                                            if (var14.field_i != 20) {
                                                              break L27;
                                                            } else {
                                                              break L28;
                                                            }
                                                          }
                                                        }
                                                        var14.field_B = 1;
                                                        var14.field_R = 0;
                                                        break L27;
                                                      }
                                                      if (1 != this.field_k) {
                                                        break L22;
                                                      } else {
                                                        if (var14.field_R != 0) {
                                                          break L22;
                                                        } else {
                                                          if (var16 == 0) {
                                                            param0.a(2 * var9_ref.field_B + 10, var14, 2);
                                                            var11++;
                                                            break L22;
                                                          } else {
                                                            break L22;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                }
                                                var14 = (on) ((Object) var19.a((byte) 116));
                                                continue L21;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var9_ref = (vn) ((Object) param0.field_gb.a((byte) 116));
                                    continue L15;
                                  }
                                }
                              } else {
                                break L14;
                              }
                            }
                            L29: {
                              if (var8 != 0) {
                                break L29;
                              } else {
                                if (!param0.field_K.a(false)) {
                                  param0.field_gb.a(param0.field_K.c(3), (byte) 3);
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                            }
                            if (var8 != 0) {
                              fieldTemp$14 = param0.field_A + 1;
                              param0.field_A = param0.field_A + 1;
                              if (1 == fieldTemp$14) {
                                break L13;
                              } else {
                                break L13;
                              }
                            } else {
                              break L13;
                            }
                          } else {
                            break L13;
                          }
                        }
                        L30: {
                          var8 = 1;
                          if (param0.field_n == 0) {
                            var8 = 0;
                            break L30;
                          } else {
                            if (this.field_k == 1) {
                              var8 = 1;
                              break L30;
                            } else {
                              var9_int = 0;
                              L31: while (true) {
                                if (param0.field_z.length <= var9_int) {
                                  break L30;
                                } else {
                                  var21 = param0.field_z[var9_int];
                                  var22 = var21;
                                  var22 = var21;
                                  var11_ref_on = (on) ((Object) var21.d(param3 + -91));
                                  L32: while (true) {
                                    if (var11_ref_on == null) {
                                      var9_int++;
                                      continue L31;
                                    } else {
                                      L33: {
                                        if ((1 << var11_ref_on.field_i & hp.field_m) == 0) {
                                          break L33;
                                        } else {
                                          if (81920 > var11_ref_on.field_m) {
                                            break L33;
                                          } else {
                                            var8 = 0;
                                            break L30;
                                          }
                                        }
                                      }
                                      var11_ref_on = (on) ((Object) var21.a((byte) 116));
                                      continue L32;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        L34: {
                          if (var8 == 0) {
                            break L34;
                          } else {
                            var9_ref2 = (cl) ((Object) param0.field_v.d(-120));
                            L35: while (true) {
                              if (var9_ref2 == null) {
                                break L34;
                              } else {
                                var22 = var9_ref2.field_p;
                                var11_ref_ee = (ee) ((Object) var22.d(-125));
                                L36: while (true) {
                                  if (var11_ref_ee == null) {
                                    var9_ref2 = (cl) ((Object) param0.field_v.a((byte) 116));
                                    continue L35;
                                  } else {
                                    var11_ref_ee.field_m = var11_ref_ee.field_m + 256;
                                    var11_ref_ee = (ee) ((Object) var22.a((byte) 116));
                                    continue L36;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var9_int = 0;
                        L37: while (true) {
                          if (param0.field_z.length <= var9_int) {
                            var9_ref = (vn) ((Object) param0.field_K.d(-105));
                            L38: while (true) {
                              if (var9_ref == null) {
                                var9_ref = (vn) ((Object) param0.field_gb.d(param3 + -13));
                                L39: while (true) {
                                  if (var9_ref == null) {
                                    L40: {
                                      if (var7.field_w > 0) {
                                        var7.field_w = var7.field_w - 1;
                                        break L40;
                                      } else {
                                        break L40;
                                      }
                                    }
                                    L41: {
                                      if (var7.field_H > 0) {
                                        var7.field_H = var7.field_H - 1;
                                        break L41;
                                      } else {
                                        break L41;
                                      }
                                    }
                                    L42: {
                                      if (0 >= var7.field_z) {
                                        break L42;
                                      } else {
                                        var7.field_z = var7.field_z - 1;
                                        break L42;
                                      }
                                    }
                                    L43: {
                                      if (var8 == 0) {
                                        break L43;
                                      } else {
                                        fieldTemp$15 = param0.field_n - 1;
                                        param0.field_n = param0.field_n - 1;
                                        if (fieldTemp$15 % 16 == 0) {
                                          L44: {
                                            if (1 == this.field_k) {
                                              stackOut_244_0 = 13;
                                              stackIn_245_0 = stackOut_244_0;
                                              break L44;
                                            } else {
                                              stackOut_243_0 = 7;
                                              stackIn_245_0 = stackOut_243_0;
                                              break L44;
                                            }
                                          }
                                          var9_int = stackIn_245_0;
                                          var10_ref = null;
                                          var11 = 1;
                                          L45: while (true) {
                                            if (var11 > var9_int) {
                                              var11 = 0;
                                              L46: while (true) {
                                                if (-4 >= (var11 ^ -1)) {
                                                  break L43;
                                                } else {
                                                  var25 = param0.field_z[var11];
                                                  var26 = var25;
                                                  var26 = var25;
                                                  var10_ref_on = (on) ((Object) var25.d(-44));
                                                  L47: while (true) {
                                                    if (var10_ref_on == null) {
                                                      var11++;
                                                      continue L46;
                                                    } else {
                                                      L48: {
                                                        if (-1 != (1 & var10_ref_on.field_N ^ -1)) {
                                                          break L48;
                                                        } else {
                                                          if (81920 >= var10_ref_on.field_m) {
                                                            break L48;
                                                          } else {
                                                            var10_ref_on.field_B = 7;
                                                            var10_ref_on.field_R = 0;
                                                            var10_ref_on.field_l = 0;
                                                            break L48;
                                                          }
                                                        }
                                                      }
                                                      var10_ref_on = (on) ((Object) var25.a((byte) 116));
                                                      continue L47;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              dupTemp$16 = new on(34 * var11 << -1599867576, 4096, 0, 0, 0);
                                              var10_ref_on = dupTemp$16;
                                              param0.field_z[2].a(dupTemp$16, (byte) 3);
                                              var10_ref_on.field_R = 2;
                                              var10_ref_on.field_B = 10;
                                              var11++;
                                              continue L45;
                                            }
                                          }
                                        } else {
                                          break L43;
                                        }
                                      }
                                    }
                                    L49: {
                                      if (-1 < (param0.field_k ^ -1)) {
                                        break L49;
                                      } else {
                                        var9_ref3 = (il) ((Object) param0.field_C.d(-118));
                                        L50: while (true) {
                                          if (var9_ref3 == null) {
                                            param0.field_k = param0.field_k + 1;
                                            break L49;
                                          } else {
                                            var9_ref3.d(param3 + -2081170685);
                                            var9_ref3 = (il) ((Object) param0.field_C.a((byte) 116));
                                            continue L50;
                                          }
                                        }
                                      }
                                    }
                                    var9_int = 0;
                                    L51: while (true) {
                                      if (var9_int >= 8) {
                                        var9_ref4 = var7;
                                        var7.field_o = 0;
                                        var9_ref4.field_k = 0;
                                        var10 = 0;
                                        L52: while (true) {
                                          if (-4 >= (var10 ^ -1)) {
                                            L53: {
                                              if (-1 != (param0.field_L ^ -1)) {
                                                break L53;
                                              } else {
                                                if (param0.field_n == 0) {
                                                  L54: {
                                                    param0.field_P = 0;
                                                    param0.field_r = param0.field_r + 1;
                                                    param0.field_hb = param0.field_hb + 1;
                                                    param0.field_t = param0.field_t + 1;
                                                    if (1 != this.field_k) {
                                                      break L54;
                                                    } else {
                                                      param0.a(250, false, 65280, var7.field_m + -12800);
                                                      break L54;
                                                    }
                                                  }
                                                  L55: {
                                                    fieldTemp$17 = param0.field_qb + 1;
                                                    param0.field_qb = param0.field_qb + 1;
                                                    if (fieldTemp$17 < this.field_b.a(param3 + -125)) {
                                                      break L55;
                                                    } else {
                                                      if (!this.field_b.field_c) {
                                                        if (this.field_k != 1) {
                                                          param0.field_Z = 7;
                                                          break L53;
                                                        } else {
                                                          param0.field_Z = 5;
                                                          break L53;
                                                        }
                                                      } else {
                                                        break L55;
                                                      }
                                                    }
                                                  }
                                                  param0.field_Z = 0;
                                                  param0.field_P = 0;
                                                  break L53;
                                                } else {
                                                  break L53;
                                                }
                                              }
                                            }
                                            if (param0.field_lb == null) {
                                              var10 = 0;
                                              var11 = 0;
                                              var12 = 0;
                                              var13 = (vn) ((Object) param0.field_gb.d(-26));
                                              L56: while (true) {
                                                if (var13 == null) {
                                                  L57: {
                                                    if (var10 > 20) {
                                                      break L57;
                                                    } else {
                                                      if (15 >= var11) {
                                                        break L8;
                                                      } else {
                                                        break L57;
                                                      }
                                                    }
                                                  }
                                                  param0.a(ml.field_e, (byte) 75);
                                                  break L8;
                                                } else {
                                                  L58: {
                                                    var12 = var13.field_I;
                                                    if (var13.field_I <= var10) {
                                                      break L58;
                                                    } else {
                                                      var10 = var12;
                                                      break L58;
                                                    }
                                                  }
                                                  L59: {
                                                    var12 = var13.field_B;
                                                    if (var11 >= var13.field_B) {
                                                      break L59;
                                                    } else {
                                                      var11 = var12;
                                                      break L59;
                                                    }
                                                  }
                                                  var13 = (vn) ((Object) param0.field_gb.a((byte) 116));
                                                  continue L56;
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var11_ref_on = (on) ((Object) param0.field_z[var10].d(-49));
                                            L60: while (true) {
                                              if (var11_ref_on == null) {
                                                var10++;
                                                continue L52;
                                              } else {
                                                L61: {
                                                  if ((var11_ref_on.field_N & 4) != 0) {
                                                    var11_ref_on.a((byte) 119, true);
                                                    break L61;
                                                  } else {
                                                    break L61;
                                                  }
                                                }
                                                var11_ref_on = (on) ((Object) param0.field_z[var10].a((byte) 116));
                                                continue L60;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var10_ref_ge = (ge) ((Object) param0.field_pb.d(-119));
                                        L62: while (true) {
                                          if (var10_ref_ge == null) {
                                            L63: {
                                              var7.field_j = var7.field_j + var7.field_k / 8;
                                              if (var7.field_B > var7.field_j) {
                                                var7.field_j = var7.field_B;
                                                break L63;
                                              } else {
                                                break L63;
                                              }
                                            }
                                            L64: {
                                              if (-var7.field_u + var7.field_y < var7.field_j) {
                                                var7.field_j = -var7.field_u + var7.field_y;
                                                break L64;
                                              } else {
                                                break L64;
                                              }
                                            }
                                            L65: {
                                              if (var7.field_H > 0) {
                                                var10_ref_vn = (vn) ((Object) param0.field_gb.d(-111));
                                                L66: while (true) {
                                                  if (var10_ref_vn == null) {
                                                    break L65;
                                                  } else {
                                                    L67: {
                                                      if (var10_ref_vn.field_j - -var10_ref_vn.field_u > var7.field_u / 2 + var7.field_j) {
                                                        if (-1 <= (var10_ref_vn.field_k ^ -1)) {
                                                          break L67;
                                                        } else {
                                                          var10_ref_vn.field_k = -var10_ref_vn.field_k;
                                                          break L67;
                                                        }
                                                      } else {
                                                        if (0 > var10_ref_vn.field_k) {
                                                          var10_ref_vn.field_k = -var10_ref_vn.field_k;
                                                          break L67;
                                                        } else {
                                                          var10_ref_vn = (vn) ((Object) param0.field_gb.a((byte) 116));
                                                          continue L66;
                                                        }
                                                      }
                                                    }
                                                    var10_ref_vn = (vn) ((Object) param0.field_gb.a((byte) 116));
                                                    continue L66;
                                                  }
                                                }
                                              } else {
                                                break L65;
                                              }
                                            }
                                            var10 = 0;
                                            L68: while (true) {
                                              if (param0.field_z.length <= var10) {
                                                var10_ref_vn = (vn) ((Object) param0.field_gb.d(-122));
                                                L69: while (true) {
                                                  L70: {
                                                    if (var10_ref_vn == null) {
                                                      break L70;
                                                    } else {
                                                      var11 = 0;
                                                      L71: while (true) {
                                                        L72: {
                                                          if (var11 >= 5) {
                                                            break L72;
                                                          } else {
                                                            if (!this.a(param0, param1, 8, -128, var10_ref_vn)) {
                                                              break L72;
                                                            } else {
                                                              var11++;
                                                              continue L71;
                                                            }
                                                          }
                                                        }
                                                        L73: {
                                                          if (!var10_ref_vn.b(0)) {
                                                            break L73;
                                                          } else {
                                                            L74: {
                                                              if ((var11 ^ -1) == -6) {
                                                                break L74;
                                                              } else {
                                                                if (var10_ref_vn.field_j < 0) {
                                                                  break L74;
                                                                } else {
                                                                  if (0 > var10_ref_vn.field_m) {
                                                                    break L74;
                                                                  } else {
                                                                    if (param0.field_mb << 1595004136 >= var10_ref_vn.field_j) {
                                                                      break L73;
                                                                    } else {
                                                                      break L74;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var10_ref_vn.a(-1024 + param0.a(2048, (byte) 62), 1536, 105);
                                                            var10_ref_vn.field_E.field_j = -1;
                                                            var10_ref_vn.field_B = 0;
                                                            var10_ref_vn.field_y.field_j = -1;
                                                            var10_ref_vn.field_I = 0;
                                                            var10_ref_vn.field_C = 0;
                                                            param0.field_K.a(var10_ref_vn, (byte) 3);
                                                            break L73;
                                                          }
                                                        }
                                                        if (!param0.field_gb.a(false)) {
                                                          var10_ref_vn = (vn) ((Object) param0.field_gb.a((byte) 116));
                                                          continue L69;
                                                        } else {
                                                          break L70;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var10_ref_vn = (vn) ((Object) param0.field_K.d(-91));
                                                  L75: while (true) {
                                                    if (var10_ref_vn == null) {
                                                      var9_int++;
                                                      continue L51;
                                                    } else {
                                                      var10_ref_vn.a(var7, 0);
                                                      var10_ref_vn = (vn) ((Object) param0.field_K.a((byte) 116));
                                                      continue L75;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var26 = param0.field_z[var10];
                                                var12_ref_on = (on) ((Object) var26.d(-38));
                                                L76: while (true) {
                                                  if (var12_ref_on == null) {
                                                    var10++;
                                                    continue L68;
                                                  } else {
                                                    L77: {
                                                      if (0 == (var12_ref_on.field_N & 4)) {
                                                        break L77;
                                                      } else {
                                                        if (1 < var12_ref_on.field_P[var12_ref_on.field_C].field_t) {
                                                          var12_ref_on.field_j = var12_ref_on.field_j + var12_ref_on.field_k / 8;
                                                          var12_ref_on.field_m = var12_ref_on.field_m + var12_ref_on.field_o / 8;
                                                          break L77;
                                                        } else {
                                                          break L77;
                                                        }
                                                      }
                                                    }
                                                    var12_ref_on = (on) ((Object) var26.a((byte) 116));
                                                    continue L76;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            L78: {
                                              var10_ref_ge.field_j = var10_ref_ge.field_j + var10_ref_ge.field_k / 8;
                                              var10_ref_ge.field_m = var10_ref_ge.field_m + var10_ref_ge.field_o / 8;
                                              if (var10_ref_ge.field_m > 122880) {
                                                L79: {
                                                  stackOut_268_0 = (j) (param0);
                                                  stackOut_268_1 = 16387;
                                                  stackIn_270_0 = stackOut_268_0;
                                                  stackIn_270_1 = stackOut_268_1;
                                                  stackIn_269_0 = stackOut_268_0;
                                                  stackIn_269_1 = stackOut_268_1;
                                                  if (-51 > (param0.a(100, (byte) 62) ^ -1)) {
                                                    stackOut_270_0 = (j) ((Object) stackIn_270_0);
                                                    stackOut_270_1 = stackIn_270_1;
                                                    stackOut_270_2 = 4;
                                                    stackIn_271_0 = stackOut_270_0;
                                                    stackIn_271_1 = stackOut_270_1;
                                                    stackIn_271_2 = stackOut_270_2;
                                                    break L79;
                                                  } else {
                                                    stackOut_269_0 = (j) ((Object) stackIn_269_0);
                                                    stackOut_269_1 = stackIn_269_1;
                                                    stackOut_269_2 = 5;
                                                    stackIn_271_0 = stackOut_269_0;
                                                    stackIn_271_1 = stackOut_269_1;
                                                    stackIn_271_2 = stackOut_269_2;
                                                    break L79;
                                                  }
                                                }
                                                L80: {
                                                  ((j) (Object) stackIn_271_0).b(stackIn_271_1, stackIn_271_2);
                                                  if (r.field_A) {
                                                    jc.a(var10_ref_ge.field_i, 4, (byte) -110);
                                                    break L80;
                                                  } else {
                                                    break L80;
                                                  }
                                                }
                                                var10_ref_ge.b((byte) 111);
                                                break L78;
                                              } else {
                                                if (!var7.a(var10_ref_ge, (byte) 25)) {
                                                  break L78;
                                                } else {
                                                  L81: {
                                                    var10_ref_ge.b((byte) 111);
                                                    if (!var10_ref_ge.b(false)) {
                                                      stackOut_278_0 = 0;
                                                      stackIn_279_0 = stackOut_278_0;
                                                      break L81;
                                                    } else {
                                                      stackOut_277_0 = 1;
                                                      stackIn_279_0 = stackOut_277_0;
                                                      break L81;
                                                    }
                                                  }
                                                  L82: {
                                                    var11 = stackIn_279_0;
                                                    if (param2 == null) {
                                                      break L82;
                                                    } else {
                                                      param2.a(var10_ref_ge, (byte) 3);
                                                      break L82;
                                                    }
                                                  }
                                                  L83: {
                                                    if ((this.field_k ^ -1) != -2) {
                                                      break L83;
                                                    } else {
                                                      L84: {
                                                        stackOut_282_0 = var11;
                                                        stackIn_284_0 = stackOut_282_0;
                                                        stackIn_283_0 = stackOut_282_0;
                                                        if ((var10_ref_ge.field_i ^ -1) != -14) {
                                                          stackOut_284_0 = stackIn_284_0;
                                                          stackOut_284_1 = 0;
                                                          stackIn_285_0 = stackOut_284_0;
                                                          stackIn_285_1 = stackOut_284_1;
                                                          break L84;
                                                        } else {
                                                          stackOut_283_0 = stackIn_283_0;
                                                          stackOut_283_1 = 1;
                                                          stackIn_285_0 = stackOut_283_0;
                                                          stackIn_285_1 = stackOut_283_1;
                                                          break L84;
                                                        }
                                                      }
                                                      L85: {
                                                        var11 = stackIn_285_0 | stackIn_285_1;
                                                        stackOut_285_0 = (j) (param0);
                                                        stackIn_287_0 = stackOut_285_0;
                                                        stackIn_286_0 = stackOut_285_0;
                                                        if (var11 != 0) {
                                                          stackOut_287_0 = (j) ((Object) stackIn_287_0);
                                                          stackOut_287_1 = 100;
                                                          stackIn_288_0 = stackOut_287_0;
                                                          stackIn_288_1 = stackOut_287_1;
                                                          break L85;
                                                        } else {
                                                          stackOut_286_0 = (j) ((Object) stackIn_286_0);
                                                          stackOut_286_1 = 500;
                                                          stackIn_288_0 = stackOut_286_0;
                                                          stackIn_288_1 = stackOut_286_1;
                                                          break L85;
                                                        }
                                                      }
                                                      ((j) (Object) stackIn_288_0).a(stackIn_288_1, var7, param3 + 2);
                                                      if (var11 != 0) {
                                                        param0.field_u = 0;
                                                        param0.field_hb = 0;
                                                        param0.field_N = param0.field_N + 1;
                                                        break L83;
                                                      } else {
                                                        param0.field_u = param0.field_u + 1;
                                                        param0.field_N = 0;
                                                        break L83;
                                                      }
                                                    }
                                                  }
                                                  L86: {
                                                    if (!r.field_A) {
                                                      break L86;
                                                    } else {
                                                      jc.a(var10_ref_ge.field_i, 3, (byte) -115);
                                                      break L86;
                                                    }
                                                  }
                                                  L87: {
                                                    if (param1 != null) {
                                                      param1.a(new qc(3, var10_ref_ge.field_i), (byte) 3);
                                                      break L87;
                                                    } else {
                                                      break L87;
                                                    }
                                                  }
                                                  L88: {
                                                    L89: {
                                                      stackOut_296_0 = (j) (param0);
                                                      stackIn_300_0 = stackOut_296_0;
                                                      stackIn_297_0 = stackOut_296_0;
                                                      if (1 < this.field_k) {
                                                        break L89;
                                                      } else {
                                                        stackOut_297_0 = (j) ((Object) stackIn_297_0);
                                                        stackIn_300_0 = stackOut_297_0;
                                                        stackIn_298_0 = stackOut_297_0;
                                                        if ((var10_ref_ge.field_i ^ -1) == -14) {
                                                          break L89;
                                                        } else {
                                                          stackOut_298_0 = (j) ((Object) stackIn_298_0);
                                                          stackIn_301_0 = stackOut_298_0;
                                                          stackIn_299_0 = stackOut_298_0;
                                                          if (var11 == 0) {
                                                            stackOut_301_0 = (j) ((Object) stackIn_301_0);
                                                            stackOut_301_1 = eh.field_e;
                                                            stackIn_302_0 = stackOut_301_0;
                                                            stackIn_302_1 = stackOut_301_1;
                                                            break L88;
                                                          } else {
                                                            stackOut_299_0 = (j) ((Object) stackIn_299_0);
                                                            stackIn_300_0 = stackOut_299_0;
                                                            break L89;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    stackOut_300_0 = (j) ((Object) stackIn_300_0);
                                                    stackOut_300_1 = ml.field_e;
                                                    stackIn_302_0 = stackOut_300_0;
                                                    stackIn_302_1 = stackOut_300_1;
                                                    break L88;
                                                  }
                                                  ((j) (Object) stackIn_302_0).a(stackIn_302_1, (byte) 75);
                                                  break L78;
                                                }
                                              }
                                            }
                                            var10_ref_ge = (ge) ((Object) param0.field_pb.a((byte) 116));
                                            continue L62;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L90: {
                                      var9_ref.field_E.a(-7255, var9_ref.field_j + var9_ref.field_u);
                                      var9_ref.field_y.a(-7255, var9_ref.field_m - -var9_ref.field_u);
                                      if (var9_ref.field_J > 0) {
                                        var9_ref.field_J = var9_ref.field_J - 1;
                                        break L90;
                                      } else {
                                        break L90;
                                      }
                                    }
                                    L91: {
                                      if ((var9_ref.field_v ^ -1) < -1) {
                                        var9_ref.field_v = var9_ref.field_v - 1;
                                        break L91;
                                      } else {
                                        break L91;
                                      }
                                    }
                                    var9_ref = (vn) ((Object) param0.field_gb.a((byte) 116));
                                    continue L39;
                                  }
                                }
                              } else {
                                L92: {
                                  if (var9_ref.field_J <= 0) {
                                    break L92;
                                  } else {
                                    var9_ref.field_J = var9_ref.field_J - 1;
                                    break L92;
                                  }
                                }
                                L93: {
                                  if (-1 > (var9_ref.field_v ^ -1)) {
                                    var9_ref.field_v = var9_ref.field_v - 1;
                                    break L93;
                                  } else {
                                    break L93;
                                  }
                                }
                                var9_ref = (vn) ((Object) param0.field_K.a((byte) 116));
                                continue L38;
                              }
                            }
                          } else {
                            var23 = param0.field_z[var9_int];
                            var11_ref_on = (on) ((Object) var23.d(param3 ^ -42));
                            L94: while (true) {
                              if (var11_ref_on == null) {
                                var9_int++;
                                continue L37;
                              } else {
                                L95: {
                                  if (var8 == 0) {
                                    break L95;
                                  } else {
                                    if ((5 & var11_ref_on.field_N) != 0) {
                                      break L95;
                                    } else {
                                      var11_ref_on.field_m = var11_ref_on.field_m + 256;
                                      break L95;
                                    }
                                  }
                                }
                                L96: {
                                  if (0 > var11_ref_on.field_R) {
                                    break L96;
                                  } else {
                                    fieldTemp$18 = var11_ref_on.field_l + 1;
                                    var11_ref_on.field_l = var11_ref_on.field_l + 1;
                                    if (-17 != (fieldTemp$18 ^ -1)) {
                                      break L96;
                                    } else {
                                      var11_ref_on.field_B = 0;
                                      var11_ref_on.field_l = 0;
                                      if (0 == var11_ref_on.field_R) {
                                        L97: {
                                          var11_ref_on.b((byte) 111);
                                          if (-1 != (1 << var11_ref_on.field_i & hp.field_m ^ -1)) {
                                            param0.field_L = param0.field_L - 1;
                                            param0.field_m = param0.field_m + 1;
                                            param0.field_Q = param0.field_Q + 1;
                                            break L97;
                                          } else {
                                            break L97;
                                          }
                                        }
                                        if (!r.field_A) {
                                          break L96;
                                        } else {
                                          jc.a(var11_ref_on.field_N, 1, (byte) -95);
                                          break L96;
                                        }
                                      } else {
                                        L98: {
                                          if (var11_ref_on.field_i == 0) {
                                            param0.field_L = param0.field_L + 1;
                                            break L98;
                                          } else {
                                            break L98;
                                          }
                                        }
                                        var11_ref_on.field_i = var11_ref_on.field_R;
                                        var11_ref_on.field_R = -1;
                                        break L96;
                                      }
                                    }
                                  }
                                }
                                L99: {
                                  if ((4 & var11_ref_on.field_N) != 0) {
                                    var11_ref_on.a((byte) 58, true);
                                    var11_ref_on.field_S = var11_ref_on.field_S + 1;
                                    var11_ref_on.field_J = var11_ref_on.field_J + 1;
                                    var24 = var11_ref_on.field_P[var11_ref_on.field_C];
                                    if (var24.field_t == var11_ref_on.field_S) {
                                      var11_ref_on.f(105);
                                      break L99;
                                    } else {
                                      break L99;
                                    }
                                  } else {
                                    break L99;
                                  }
                                }
                                var11_ref_on = (on) ((Object) var23.a((byte) 116));
                                continue L94;
                              }
                            }
                          }
                        }
                      } else {
                        if (param0.field_Z != 0) {
                          if (-2 == (param0.field_Z ^ -1)) {
                            L100: {
                              if (-1 == (param0.field_P ^ -1)) {
                                L101: {
                                  if (-2 == (this.field_k ^ -1)) {
                                    param0.field_lb = null;
                                    param0.field_fb = this.field_b.a((byte) 115, param0.field_qb);
                                    param0.field_i = 100;
                                    break L101;
                                  } else {
                                    break L101;
                                  }
                                }
                                if (param1 == null) {
                                  break L100;
                                } else {
                                  param1.a(new qc(14), (byte) 3);
                                  break L100;
                                }
                              } else {
                                break L100;
                              }
                            }
                            L102: {
                              if (param0.field_r != 0) {
                                var8 = 0;
                                L103: while (true) {
                                  if ((var8 ^ -1) <= -4) {
                                    break L102;
                                  } else {
                                    var9 = (on) ((Object) param0.field_z[var8].d(-30));
                                    L104: while (true) {
                                      if (var9 == null) {
                                        var8++;
                                        continue L103;
                                      } else {
                                        L105: {
                                          if (-1 < (var9.field_R ^ -1)) {
                                            break L105;
                                          } else {
                                            fieldTemp$19 = var9.field_l + 1;
                                            var9.field_l = var9.field_l + 1;
                                            if ((fieldTemp$19 ^ -1) == -17) {
                                              var9.field_B = 0;
                                              var9.field_l = 0;
                                              var9.field_R = -1;
                                              break L105;
                                            } else {
                                              break L105;
                                            }
                                          }
                                        }
                                        var9 = (on) ((Object) param0.field_z[var8].a((byte) 116));
                                        continue L104;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L102;
                              }
                            }
                            L106: {
                              var8 = 0;
                              if (this.field_k == 1) {
                                var8 = 125;
                                break L106;
                              } else {
                                if (param0.field_r == 0) {
                                  var8 = 75;
                                  break L106;
                                } else {
                                  var8 = 40;
                                  break L106;
                                }
                              }
                            }
                            fieldTemp$20 = param0.field_P + 1;
                            param0.field_P = param0.field_P + 1;
                            if (fieldTemp$20 == var8) {
                              param0.field_P = 0;
                              param0.field_Z = 4;
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            if (-5 != (param0.field_Z ^ -1)) {
                              if (param0.field_Z == 3) {
                                fieldTemp$21 = param0.field_P + 1;
                                param0.field_P = param0.field_P + 1;
                                if (-351 == (fieldTemp$21 ^ -1)) {
                                  param0.field_P = 0;
                                  param0.field_Z = 8;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              } else {
                                if (param0.field_Z == 5) {
                                  fieldTemp$22 = param0.field_P + 1;
                                  param0.field_P = param0.field_P + 1;
                                  if (fieldTemp$22 != 350) {
                                    break L8;
                                  } else {
                                    param0.field_P = 0;
                                    param0.field_Z = 9;
                                    break L8;
                                  }
                                } else {
                                  break L8;
                                }
                              }
                            } else {
                              L107: {
                                if (-1 == (param0.field_P ^ -1)) {
                                  if (param1 == null) {
                                    break L107;
                                  } else {
                                    param1.a(new qc(13), (byte) 3);
                                    break L107;
                                  }
                                } else {
                                  break L107;
                                }
                              }
                              L108: {
                                fieldTemp$23 = param0.field_P + 1;
                                param0.field_P = param0.field_P + 1;
                                if (-76 == (fieldTemp$23 ^ -1)) {
                                  break L108;
                                } else {
                                  if (-2 != (this.field_k ^ -1)) {
                                    break L8;
                                  } else {
                                    if (25 != param0.field_P) {
                                      break L8;
                                    } else {
                                      break L108;
                                    }
                                  }
                                }
                              }
                              L109: {
                                param0.field_lb = lq.field_c;
                                stackOut_53_0 = (j) (param0);
                                stackIn_55_0 = stackOut_53_0;
                                stackIn_54_0 = stackOut_53_0;
                                if (param0.field_i > 25) {
                                  stackOut_55_0 = (j) ((Object) stackIn_55_0);
                                  stackOut_55_1 = 25;
                                  stackIn_56_0 = stackOut_55_0;
                                  stackIn_56_1 = stackOut_55_1;
                                  break L109;
                                } else {
                                  stackOut_54_0 = (j) ((Object) stackIn_54_0);
                                  stackOut_54_1 = param0.field_i;
                                  stackIn_56_0 = stackOut_54_0;
                                  stackIn_56_1 = stackOut_54_1;
                                  break L109;
                                }
                              }
                              stackIn_56_0.field_i = stackIn_56_1;
                              param0.field_Z = 2;
                              param0.field_P = 0;
                              break L8;
                            }
                          }
                        } else {
                          var8_ref_vl__ = new vl[3];
                          var9_int = 0;
                          L110: while (true) {
                            if (3 <= var9_int) {
                              L111: {
                                var18 = new vl();
                                var10 = param0.field_ab.field_p;
                                this.field_b.a(new ga(), param0.field_ab, var18, param0.field_qb, (byte) -118, var8_ref_vl__);
                                param0.a(var18, param3 + 9, var8_ref_vl__);
                                param0.a(26496, false);
                                if (-2 == (this.field_k ^ -1)) {
                                  if (0 >= param0.field_r) {
                                    break L111;
                                  } else {
                                    L112: {
                                      if (param0.field_ab.field_p == 0) {
                                        break L112;
                                      } else {
                                        if (var10 != param0.field_ab.field_p) {
                                          break L112;
                                        } else {
                                          break L111;
                                        }
                                      }
                                    }
                                    param0.field_tb = true;
                                    break L111;
                                  }
                                } else {
                                  break L111;
                                }
                              }
                              L113: {
                                if (param0.field_r == 0) {
                                  break L113;
                                } else {
                                  var11 = 0;
                                  L114: while (true) {
                                    if (var11 >= 3) {
                                      break L113;
                                    } else {
                                      var12_ref_on = (on) ((Object) var8_ref_vl__[var11].d(param3 ^ -107));
                                      L115: while (true) {
                                        if (var12_ref_on == null) {
                                          var11++;
                                          continue L114;
                                        } else {
                                          var12_ref_on.field_l = 0;
                                          var12_ref_on.field_B = 5;
                                          var12_ref_on.field_R = var12_ref_on.field_i;
                                          var12_ref_on = (on) ((Object) var8_ref_vl__[var11].a((byte) 116));
                                          continue L115;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              param0.field_Z = 1;
                              param0.field_P = 0;
                              param0.field_A = 0;
                              break L8;
                            } else {
                              var8_ref_vl__[var9_int] = new vl();
                              var9_int++;
                              continue L110;
                            }
                          }
                        }
                      }
                    }
                    break L0;
                  } else {
                    L116: {
                      if (var6.b(false)) {
                        break L116;
                      } else {
                        var6.b((byte) 111);
                        break L116;
                      }
                    }
                    var6 = (ul) ((Object) param0.field_nb.a((byte) 116));
                    continue L7;
                  }
                }
              } else {
                L117: {
                  if (var5_ref.c((byte) 69)) {
                    break L117;
                  } else {
                    var5_ref.b((byte) 111);
                    break L117;
                  }
                }
                var5_ref = (kc) ((Object) param0.field_x.a((byte) 116));
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L118: {
            var5 = decompiledCaughtException;
            stackOut_386_0 = (RuntimeException) (var5);
            stackOut_386_1 = new StringBuilder().append("ak.F(");
            stackIn_388_0 = stackOut_386_0;
            stackIn_388_1 = stackOut_386_1;
            stackIn_387_0 = stackOut_386_0;
            stackIn_387_1 = stackOut_386_1;
            if (param0 == null) {
              stackOut_388_0 = (RuntimeException) ((Object) stackIn_388_0);
              stackOut_388_1 = (StringBuilder) ((Object) stackIn_388_1);
              stackOut_388_2 = "null";
              stackIn_389_0 = stackOut_388_0;
              stackIn_389_1 = stackOut_388_1;
              stackIn_389_2 = stackOut_388_2;
              break L118;
            } else {
              stackOut_387_0 = (RuntimeException) ((Object) stackIn_387_0);
              stackOut_387_1 = (StringBuilder) ((Object) stackIn_387_1);
              stackOut_387_2 = "{...}";
              stackIn_389_0 = stackOut_387_0;
              stackIn_389_1 = stackOut_387_1;
              stackIn_389_2 = stackOut_387_2;
              break L118;
            }
          }
          L119: {
            stackOut_389_0 = (RuntimeException) ((Object) stackIn_389_0);
            stackOut_389_1 = ((StringBuilder) (Object) stackIn_389_1).append(stackIn_389_2).append(',');
            stackIn_391_0 = stackOut_389_0;
            stackIn_391_1 = stackOut_389_1;
            stackIn_390_0 = stackOut_389_0;
            stackIn_390_1 = stackOut_389_1;
            if (param1 == null) {
              stackOut_391_0 = (RuntimeException) ((Object) stackIn_391_0);
              stackOut_391_1 = (StringBuilder) ((Object) stackIn_391_1);
              stackOut_391_2 = "null";
              stackIn_392_0 = stackOut_391_0;
              stackIn_392_1 = stackOut_391_1;
              stackIn_392_2 = stackOut_391_2;
              break L119;
            } else {
              stackOut_390_0 = (RuntimeException) ((Object) stackIn_390_0);
              stackOut_390_1 = (StringBuilder) ((Object) stackIn_390_1);
              stackOut_390_2 = "{...}";
              stackIn_392_0 = stackOut_390_0;
              stackIn_392_1 = stackOut_390_1;
              stackIn_392_2 = stackOut_390_2;
              break L119;
            }
          }
          L120: {
            stackOut_392_0 = (RuntimeException) ((Object) stackIn_392_0);
            stackOut_392_1 = ((StringBuilder) (Object) stackIn_392_1).append(stackIn_392_2).append(',');
            stackIn_394_0 = stackOut_392_0;
            stackIn_394_1 = stackOut_392_1;
            stackIn_393_0 = stackOut_392_0;
            stackIn_393_1 = stackOut_392_1;
            if (param2 == null) {
              stackOut_394_0 = (RuntimeException) ((Object) stackIn_394_0);
              stackOut_394_1 = (StringBuilder) ((Object) stackIn_394_1);
              stackOut_394_2 = "null";
              stackIn_395_0 = stackOut_394_0;
              stackIn_395_1 = stackOut_394_1;
              stackIn_395_2 = stackOut_394_2;
              break L120;
            } else {
              stackOut_393_0 = (RuntimeException) ((Object) stackIn_393_0);
              stackOut_393_1 = (StringBuilder) ((Object) stackIn_393_1);
              stackOut_393_2 = "{...}";
              stackIn_395_0 = stackOut_393_0;
              stackIn_395_1 = stackOut_393_1;
              stackIn_395_2 = stackOut_393_2;
              break L120;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_395_0), stackIn_395_2 + ',' + param3 + ')');
        }
    }

    public static void d(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != -19537) {
            field_e = (String) null;
        }
    }

    private final void a(vn param0, int param1, j param2) {
        int var4_int = 0;
        vl var5 = null;
        on var6 = null;
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        int var7 = BrickABrac.field_J ? 1 : 0;
        try {
            hg.a(param1);
            for (var4_int = -1 + param2.field_z.length; var4_int > -1; var4_int--) {
                var5 = param2.field_z[var4_int];
                var6 = (on) ((Object) var5.f(param1 ^ -1));
                while (var6 != null) {
                    discarded$0 = var6.a(param0, (byte) 119);
                    var6 = (on) ((Object) var5.b(-126));
                }
                if (dj.field_c != null) {
                    break;
                }
            }
            discarded$1 = param2.field_yb.a(param0, (byte) 110);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "ak.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var3 = 30 * this.field_k;
        if (param0 > 120) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_k) {
              return var2;
            } else {
              if (((this.field_i | (this.field_a | this.field_g)) & 1 << var4) == 0) {
                var5 = this.field_l[var4].field_p + this.field_l[var4].field_ub;
                var6 = 0;
                var7 = (var4 + 1) % this.field_k;
                L1: while (true) {
                  if (this.field_k - 1 > var6) {
                    if ((1 << var7 & (this.field_a | this.field_g | this.field_i)) != 0) {
                      var7++;
                      var7 = var7 % this.field_k;
                      var6++;
                      continue L1;
                    } else {
                      L2: {
                        var8 = this.field_l[var7].field_ub - -this.field_l[var7].field_p;
                        if (var7 < var4) {
                          var8 = var8 + var3;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      if (var8 < var5) {
                        var2 = var2 | 1 << var7;
                        var4++;
                        continue L0;
                      } else {
                        var4++;
                        continue L0;
                      }
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return -109;
        }
    }

    final void a(byte param0, int param1) {
        j var3 = null;
        ge var4 = null;
        int var5 = 0;
        L0: {
          var5 = BrickABrac.field_J ? 1 : 0;
          if (param0 >= 81) {
            break L0;
          } else {
            this.field_c = true;
            break L0;
          }
        }
        var3 = this.field_l[param1];
        L1: while (true) {
          L2: {
            if (var3.field_X > var3.field_kb.field_n) {
              break L2;
            } else {
              var4 = (ge) (var3.field_kb.a(var3.field_X, 67));
              if (var4.field_y > var3.field_F) {
                break L2;
              } else {
                var4.a(var3, (byte) 99);
                var3.field_X = var3.field_X + 1;
                continue L1;
              }
            }
          }
          return;
        }
    }

    private final boolean a(j param0, vl param1, int param2, int param3, vn param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        on var9 = null;
        on var10 = null;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_101_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_111_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_86_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            param4.field_j = param4.field_j + param4.field_k / param2;
            param4.field_m = param4.field_m + param4.field_o / param2;
            if (122880 >= param4.field_m) {
              this.a(param4, -1, param0);
              if (param3 <= -125) {
                L1: {
                  if (null == dj.field_c) {
                    break L1;
                  } else {
                    L2: {
                      if (r.field_A) {
                        if (wl.field_N) {
                          if (cm.field_s) {
                            break L2;
                          } else {
                            if (-40 != (param4.field_C ^ -1)) {
                              break L2;
                            } else {
                              jc.a(0, 6, (byte) -108);
                              break L2;
                            }
                          }
                        } else {
                          param4.field_C = 0;
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (39 != param4.field_C) {
                        break L3;
                      } else {
                        if (param1 != null) {
                          param1.a(new qc(5), (byte) 3);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (param0.field_yb == dj.field_c) {
                      if (-1 > (param0.field_yb.field_z ^ -1)) {
                        L4: {
                          if (param1 != null) {
                            param1.a(new qc(10), (byte) 3);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        param0.field_yb.a((byte) 53, param0, param4);
                        param4.field_E.field_j = -1;
                        param4.field_C = 0;
                        param4.field_y.field_j = -1;
                        param0.field_K.a(param4, (byte) 3);
                        stackOut_86_0 = 0;
                        stackIn_87_0 = stackOut_86_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L5: {
                          if (param1 == null) {
                            break L5;
                          } else {
                            param1.a(new qc(0), (byte) 3);
                            break L5;
                          }
                        }
                        param0.field_yb.a((byte) 53, param0, param4);
                        param4.field_B = 0;
                        break L1;
                      }
                    } else {
                      L6: {
                        dj.field_c.a((byte) 53, param0, param4);
                        var9 = (on) ((Object) dj.field_c);
                        if (param1 != null) {
                          L7: {
                            var7 = 1;
                            if (-1 == (var9.field_N & 1 ^ -1)) {
                              if (-29 != (var9.field_i ^ -1)) {
                                if ((var9.field_i ^ -1) != -26) {
                                  L8: {
                                    if (-2 == (var9.field_i ^ -1)) {
                                      break L8;
                                    } else {
                                      if ((var9.field_i ^ -1) == -22) {
                                        break L8;
                                      } else {
                                        if (22 != var9.field_i) {
                                          L9: {
                                            if (26 != var9.field_i) {
                                              break L9;
                                            } else {
                                              if (var9.field_R == 27) {
                                                break L9;
                                              } else {
                                                var7 = 11;
                                                break L7;
                                              }
                                            }
                                          }
                                          L10: {
                                            if (19 != var9.field_i) {
                                              break L10;
                                            } else {
                                              if ((sh.field_a ^ -1) != -2) {
                                                var7 = 11;
                                                break L7;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if ((var9.field_i ^ -1) != -21) {
                                              break L11;
                                            } else {
                                              if (sh.field_a == 2) {
                                                break L11;
                                              } else {
                                                var7 = 11;
                                                break L7;
                                              }
                                            }
                                          }
                                          if ((var9.field_i ^ -1) != -28) {
                                            break L7;
                                          } else {
                                            if (var9.field_R == 26) {
                                              break L7;
                                            } else {
                                              var7 = 12;
                                              break L7;
                                            }
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                  var7 = 11;
                                  break L7;
                                } else {
                                  var7 = 9;
                                  break L7;
                                }
                              } else {
                                var7 = 8;
                                break L7;
                              }
                            } else {
                              var7 = 2;
                              break L7;
                            }
                          }
                          L12: {
                            if (0 == param4.field_J) {
                              break L12;
                            } else {
                              if (0 == (1 << var9.field_i & sg.field_n)) {
                                break L6;
                              } else {
                                break L12;
                              }
                            }
                          }
                          param1.a(new qc(var7), (byte) 3);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (param4.field_J != 0) {
                        break L1;
                      } else {
                        if (var9.field_R != 0) {
                          break L1;
                        } else {
                          L13: {
                            if (1 != this.field_k) {
                              break L13;
                            } else {
                              param0.a(10 - -param4.field_B, var9, 2);
                              break L13;
                            }
                          }
                          param4.field_B = param4.field_B + 1;
                          break L1;
                        }
                      }
                    }
                  }
                }
                this.a(param4, -1, param0);
                if (dj.field_c == null) {
                  stackOut_100_0 = 0;
                  stackIn_101_0 = stackOut_100_0;
                  decompiledRegionSelector0 = 7;
                  break L0;
                } else {
                  if (param4.field_J != 0) {
                    if (dj.field_c == param0.field_yb) {
                      stackOut_94_0 = 1;
                      stackIn_95_0 = stackOut_94_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      L14: {
                        var10 = (on) ((Object) dj.field_c);
                        if ((1 & var10.field_N) == 0) {
                          stackOut_98_0 = 0;
                          stackIn_99_0 = stackOut_98_0;
                          break L14;
                        } else {
                          stackOut_97_0 = 1;
                          stackIn_99_0 = stackOut_97_0;
                          break L14;
                        }
                      }
                      decompiledRegionSelector0 = 6;
                      break L0;
                    }
                  } else {
                    stackOut_90_0 = 1;
                    stackIn_91_0 = stackOut_90_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              } else {
                stackOut_29_0 = 0;
                stackIn_30_0 = stackOut_29_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              L15: {
                param4.b((byte) 111);
                if (param1 == null) {
                  break L15;
                } else {
                  param1.a(new qc(7), (byte) 3);
                  break L15;
                }
              }
              L16: {
                if (!param0.field_gb.a(false)) {
                  break L16;
                } else {
                  if (param0.field_K.a(false)) {
                    L17: {
                      if (1 == this.field_k) {
                        L18: {
                          if (!r.field_A) {
                            break L18;
                          } else {
                            if (0 != this.field_b.field_b.field_h) {
                              break L18;
                            } else {
                              if (0 < param0.field_qb) {
                                break L18;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                        param0.field_rb = param0.field_rb - 1;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L19: {
                      if (-1 <= (param0.field_rb ^ -1)) {
                        param0.b(16387, 3);
                        param0.a((byte) 22);
                        break L19;
                      } else {
                        L20: {
                          if (3 != param0.field_y) {
                            if ((param0.field_y ^ -1) == -7) {
                              param0.a(7, true, 150);
                              break L20;
                            } else {
                              param0.a(3, true, 150);
                              break L20;
                            }
                          } else {
                            param0.a(6, true, 150);
                            break L20;
                          }
                        }
                        L21: {
                          if (!r.field_A) {
                            break L21;
                          } else {
                            jc.a(0, 5, (byte) -124);
                            break L21;
                          }
                        }
                        param0.a(26496, true);
                        param0.field_P = 0;
                        param0.field_Z = 4;
                        break L19;
                      }
                    }
                    param0.a(eh.field_e, (byte) 75);
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L16;
                  }
                }
              }
              param0.b(16387, 2);
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) (var6);
            stackOut_102_1 = new StringBuilder().append("ak.B(");
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param0 == null) {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L22;
            } else {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L22;
            }
          }
          L23: {
            stackOut_105_0 = (RuntimeException) ((Object) stackIn_105_0);
            stackOut_105_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_105_2).append(',');
            stackIn_107_0 = stackOut_105_0;
            stackIn_107_1 = stackOut_105_1;
            stackIn_106_0 = stackOut_105_0;
            stackIn_106_1 = stackOut_105_1;
            if (param1 == null) {
              stackOut_107_0 = (RuntimeException) ((Object) stackIn_107_0);
              stackOut_107_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackOut_107_2 = "null";
              stackIn_108_0 = stackOut_107_0;
              stackIn_108_1 = stackOut_107_1;
              stackIn_108_2 = stackOut_107_2;
              break L23;
            } else {
              stackOut_106_0 = (RuntimeException) ((Object) stackIn_106_0);
              stackOut_106_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackOut_106_2 = "{...}";
              stackIn_108_0 = stackOut_106_0;
              stackIn_108_1 = stackOut_106_1;
              stackIn_108_2 = stackOut_106_2;
              break L23;
            }
          }
          L24: {
            stackOut_108_0 = (RuntimeException) ((Object) stackIn_108_0);
            stackOut_108_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_108_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_110_0 = stackOut_108_0;
            stackIn_110_1 = stackOut_108_1;
            stackIn_109_0 = stackOut_108_0;
            stackIn_109_1 = stackOut_108_1;
            if (param4 == null) {
              stackOut_110_0 = (RuntimeException) ((Object) stackIn_110_0);
              stackOut_110_1 = (StringBuilder) ((Object) stackIn_110_1);
              stackOut_110_2 = "null";
              stackIn_111_0 = stackOut_110_0;
              stackIn_111_1 = stackOut_110_1;
              stackIn_111_2 = stackOut_110_2;
              break L24;
            } else {
              stackOut_109_0 = (RuntimeException) ((Object) stackIn_109_0);
              stackOut_109_1 = (StringBuilder) ((Object) stackIn_109_1);
              stackOut_109_2 = "{...}";
              stackIn_111_0 = stackOut_109_0;
              stackIn_111_1 = stackOut_109_1;
              stackIn_111_2 = stackOut_109_2;
              break L24;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_111_0), stackIn_111_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_25_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_27_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_30_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_87_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_91_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_95_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_99_0 != 0;
                    } else {
                      return stackIn_101_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final boolean b(int param0) {
        int var2 = 0;
        L0: {
          if (param0 >= 75) {
            break L0;
          } else {
            field_e = (String) null;
            break L0;
          }
        }
        L1: {
          var2 = ((this.field_g | this.field_a | this.field_i) ^ -1) & -1 + (1 << this.field_k);
          if (var2 == 0) {
            this.a(false);
            break L1;
          } else {
            if (!wn.a(var2, (byte) -6)) {
              break L1;
            } else {
              this.field_h = ed.b(9, var2 + -1);
              this.field_a = this.field_a | 1 << this.field_h;
              this.a(false);
              break L1;
            }
          }
        }
        return this.field_c;
    }

    ak(String[] param0, int param1, oi param2, int[] param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        vo stackIn_7_0 = null;
        vo stackIn_8_0 = null;
        vo stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        vo stackOut_6_0 = null;
        vo stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        vo stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              this.field_k = param0.length;
              this.field_f = param0;
              this.field_b = param2;
              this.field_l = new j[this.field_k];
              if (this.field_k >= 2) {
                stackOut_3_0 = 306;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 510;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var6_int = stackIn_4_0;
            var7 = 0;
            var8 = 0;
            L2: while (true) {
              if (this.field_k <= var8) {
                this.field_m = new int[this.field_k];
                this.field_h = -1;
                break L0;
              } else {
                L3: {
                  this.field_l[var8] = new j(var6_int, var8 * 30, var7, param3[var8], param4[var8]);
                  stackOut_6_0 = this.field_l[var8].field_yb;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (1 < this.field_k) {
                    stackOut_8_0 = (vo) ((Object) stackIn_8_0);
                    stackOut_8_1 = 102400;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L3;
                  } else {
                    stackOut_7_0 = (vo) ((Object) stackIn_7_0);
                    stackOut_7_1 = 114688;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L3;
                  }
                }
                L4: {
                  stackIn_9_0.field_m = stackIn_9_1;
                  if ((param1 & 1 << var8) == 0) {
                    break L4;
                  } else {
                    var7++;
                    break L4;
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("ak.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
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
          L7: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_e = "Create unrated game";
    }
}
