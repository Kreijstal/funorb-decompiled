/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
                int discarded$2 = ((ak) this).c(86);
                break L1;
              }
            }
            var8 = (ge) (Object) param2.d(-44);
            L2: while (true) {
              if (var8 == null) {
                break L0;
              } else {
                L3: {
                  L4: {
                    if (((ak) this).field_k == 1) {
                      break L4;
                    } else {
                      if (!var8.b(false)) {
                        var6 = 0;
                        L5: while (true) {
                          if (var6 >= ((ak) this).field_k) {
                            break L3;
                          } else {
                            L6: {
                              if (var6 == param0) {
                                break L6;
                              } else {
                                if ((1 << var6 & (((ak) this).field_g | ((ak) this).field_i | ((ak) this).field_a)) != 0) {
                                  break L6;
                                } else {
                                  ((ak) this).field_l[var6].field_kb.a((Object) (Object) new ge(var8, param1 + ((ak) this).field_l[var6].field_F), (byte) -39);
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
                  ((ak) this).field_l[param0].field_kb.a((Object) (Object) new ge(var8, param1 + ((ak) this).field_l[param0].field_F), (byte) -39);
                  break L3;
                }
                var8 = (ge) (Object) param2.a((byte) 116);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("ak.I(").append(param0).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param3 + 41);
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          var2 = 0;
          if (param0 == -92) {
            break L0;
          } else {
            var5 = null;
            boolean discarded$2 = this.a((j) null, (vl) null, -18, 53, (vn) null);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= ((ak) this).field_k) {
            return var2;
          } else {
            if (((((ak) this).field_i | (((ak) this).field_a | ((ak) this).field_g)) & 1 << var3) == 0) {
              if (((ak) this).field_l[var3].field_M == 0) {
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
        if (param0) {
            int discarded$0 = ((ak) this).c(-32);
        }
        ((ak) this).field_c = true;
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
            if (var3 >= ((ak) this).field_k) {
              return var2;
            } else {
              if ((1 << var3 & ((ak) this).field_a) == 0) {
                if (7 == ((ak) this).field_l[var3].field_Z) {
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
        Object var10_ref = null;
        kc var5 = null;
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
        j stackIn_53_0 = null;
        j stackIn_54_0 = null;
        j stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_137_0 = 0;
        j stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        j stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        j stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        int stackIn_151_2 = 0;
        j stackIn_152_0 = null;
        j stackIn_153_0 = null;
        j stackIn_154_0 = null;
        String[] stackIn_154_1 = null;
        int stackIn_240_0 = 0;
        j stackIn_264_0 = null;
        int stackIn_264_1 = 0;
        j stackIn_265_0 = null;
        int stackIn_265_1 = 0;
        j stackIn_266_0 = null;
        int stackIn_266_1 = 0;
        int stackIn_266_2 = 0;
        int stackIn_274_0 = 0;
        int stackIn_278_0 = 0;
        int stackIn_279_0 = 0;
        int stackIn_280_0 = 0;
        int stackIn_280_1 = 0;
        j stackIn_281_0 = null;
        j stackIn_282_0 = null;
        j stackIn_283_0 = null;
        int stackIn_283_1 = 0;
        j stackIn_292_0 = null;
        j stackIn_293_0 = null;
        j stackIn_294_0 = null;
        j stackIn_295_0 = null;
        j stackIn_296_0 = null;
        j stackIn_297_0 = null;
        String[] stackIn_297_1 = null;
        j stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        j stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        int stackOut_150_2 = 0;
        j stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        int stackOut_149_2 = 0;
        j stackOut_151_0 = null;
        j stackOut_153_0 = null;
        String[] stackOut_153_1 = null;
        j stackOut_152_0 = null;
        String[] stackOut_152_1 = null;
        int stackOut_126_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_238_0 = 0;
        j stackOut_263_0 = null;
        int stackOut_263_1 = 0;
        j stackOut_265_0 = null;
        int stackOut_265_1 = 0;
        int stackOut_265_2 = 0;
        j stackOut_264_0 = null;
        int stackOut_264_1 = 0;
        int stackOut_264_2 = 0;
        int stackOut_273_0 = 0;
        int stackOut_272_0 = 0;
        int stackOut_277_0 = 0;
        int stackOut_279_0 = 0;
        int stackOut_279_1 = 0;
        int stackOut_278_0 = 0;
        int stackOut_278_1 = 0;
        j stackOut_280_0 = null;
        j stackOut_282_0 = null;
        int stackOut_282_1 = 0;
        j stackOut_281_0 = null;
        int stackOut_281_1 = 0;
        j stackOut_291_0 = null;
        j stackOut_292_0 = null;
        j stackOut_293_0 = null;
        j stackOut_296_0 = null;
        String[] stackOut_296_1 = null;
        j stackOut_294_0 = null;
        j stackOut_295_0 = null;
        String[] stackOut_295_1 = null;
        j stackOut_52_0 = null;
        j stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        j stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        var10_ref = null;
        L0: {
          L1: {
            var12_ref = null;
            var11_ref = null;
            var17 = BrickABrac.field_J ? 1 : 0;
            if (param3 >= param0.field_i) {
              break L1;
            } else {
              int fieldTemp$12 = param0.field_i - 1;
              param0.field_i = param0.field_i - 1;
              if (fieldTemp$12 <= 0) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L2: {
            param0.field_fb = param0.field_lb;
            if (null == param0.field_fb) {
              break L2;
            } else {
              param0.field_i = 100;
              break L2;
            }
          }
          param0.field_lb = null;
          break L0;
        }
        L3: {
          if (param0.field_M > 0) {
            param0.field_M = param0.field_M - 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0.field_ib <= 0) {
            break L4;
          } else {
            int fieldTemp$13 = param0.field_ib - 1;
            param0.field_ib = param0.field_ib - 1;
            if (0 != fieldTemp$13) {
              break L4;
            } else {
              param0.b(16387, 0);
              break L4;
            }
          }
        }
        var5 = (kc) (Object) param0.field_x.d(-58);
        L5: while (true) {
          if (var5 == null) {
            var6 = (ul) (Object) param0.field_nb.d(-85);
            L6: while (true) {
              if (var6 == null) {
                L7: {
                  L8: {
                    var7 = param0.field_yb;
                    if (param0.field_Z == 2) {
                      L9: {
                        if (param1 == null) {
                          break L9;
                        } else {
                          if (0 == (3 & param0.field_db)) {
                            break L9;
                          } else {
                            if (3 != param0.field_db) {
                              param1.a((nm) (Object) new qc(4), (byte) 3);
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
                        if ((param0.field_db & 1) != 0) {
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
                              var9_ref = (vn) (Object) param0.field_gb.d(-76);
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
                                          param1.a((nm) (Object) new qc(6), (byte) 3);
                                          break L17;
                                        } else {
                                          break L17;
                                        }
                                      }
                                      var8 = 1;
                                      var9_ref.field_C = 0;
                                      param0.field_x.a((nm) (Object) new kc(var9_ref.field_j, var9_ref.field_m), (byte) 3);
                                      param0.field_l = 0;
                                      var20 = new no(var9_ref.field_u + var9_ref.field_j, var9_ref.field_u + var9_ref.field_m, 0, 0, 15360, 0);
                                      var11 = 0;
                                      var12 = 0;
                                      L18: while (true) {
                                        if (~param0.field_z.length >= ~var12) {
                                          L19: {
                                            stackOut_148_0 = (j) param0;
                                            stackOut_148_1 = 16387;
                                            stackIn_150_0 = stackOut_148_0;
                                            stackIn_150_1 = stackOut_148_1;
                                            stackIn_149_0 = stackOut_148_0;
                                            stackIn_149_1 = stackOut_148_1;
                                            if (var11 > 0) {
                                              stackOut_150_0 = (j) (Object) stackIn_150_0;
                                              stackOut_150_1 = stackIn_150_1;
                                              stackOut_150_2 = 1;
                                              stackIn_151_0 = stackOut_150_0;
                                              stackIn_151_1 = stackOut_150_1;
                                              stackIn_151_2 = stackOut_150_2;
                                              break L19;
                                            } else {
                                              stackOut_149_0 = (j) (Object) stackIn_149_0;
                                              stackOut_149_1 = stackIn_149_1;
                                              stackOut_149_2 = 6;
                                              stackIn_151_0 = stackOut_149_0;
                                              stackIn_151_1 = stackOut_149_1;
                                              stackIn_151_2 = stackOut_149_2;
                                              break L19;
                                            }
                                          }
                                          L20: {
                                            ((j) (Object) stackIn_151_0).b(stackIn_151_1, stackIn_151_2);
                                            stackOut_151_0 = (j) param0;
                                            stackIn_153_0 = stackOut_151_0;
                                            stackIn_152_0 = stackOut_151_0;
                                            if (var11 > 0) {
                                              stackOut_153_0 = (j) (Object) stackIn_153_0;
                                              stackOut_153_1 = ml.field_e;
                                              stackIn_154_0 = stackOut_153_0;
                                              stackIn_154_1 = stackOut_153_1;
                                              break L20;
                                            } else {
                                              stackOut_152_0 = (j) (Object) stackIn_152_0;
                                              stackOut_152_1 = eh.field_e;
                                              stackIn_154_0 = stackOut_152_0;
                                              stackIn_154_1 = stackOut_152_1;
                                              break L20;
                                            }
                                          }
                                          ((j) (Object) stackIn_154_0).a(stackIn_154_1, (byte) 75);
                                          break L16;
                                        } else {
                                          var19 = param0.field_z[var12];
                                          var21 = var19;
                                          var22 = var21;
                                          var21 = var19;
                                          var14 = (on) (Object) var19.d(-78);
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
                                                    L24: {
                                                      if (var14.field_i > 0) {
                                                        break L24;
                                                      } else {
                                                        if (var14.field_i == 19) {
                                                          break L24;
                                                        } else {
                                                          if (var14.field_i == 20) {
                                                            break L24;
                                                          } else {
                                                            if (21 == var14.field_i) {
                                                              break L24;
                                                            } else {
                                                              if (var14.field_i != 22) {
                                                                stackOut_126_0 = 0;
                                                                stackIn_127_0 = stackOut_126_0;
                                                                break L23;
                                                              } else {
                                                                break L24;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    stackOut_125_0 = 1;
                                                    stackIn_127_0 = stackOut_125_0;
                                                    break L23;
                                                  }
                                                  L25: {
                                                    var15 = stackIn_127_0;
                                                    if (var14.field_i == 22) {
                                                      var14.field_i = 23;
                                                      break L25;
                                                    } else {
                                                      break L25;
                                                    }
                                                  }
                                                  L26: {
                                                    if (var14.field_i != 21) {
                                                      break L26;
                                                    } else {
                                                      var14.field_i = 22;
                                                      break L26;
                                                    }
                                                  }
                                                  if (var15 != 0) {
                                                    L27: {
                                                      if (var14.field_R != 0) {
                                                        stackOut_136_0 = 0;
                                                        stackIn_137_0 = stackOut_136_0;
                                                        break L27;
                                                      } else {
                                                        stackOut_135_0 = 1;
                                                        stackIn_137_0 = stackOut_135_0;
                                                        break L27;
                                                      }
                                                    }
                                                    L28: {
                                                      L29: {
                                                        var16 = stackIn_137_0;
                                                        var14.field_R = ue.field_b[var14.field_i];
                                                        var14.field_B = rb.field_a[var14.field_i];
                                                        var14.field_l = 0;
                                                        if (19 == var14.field_i) {
                                                          break L29;
                                                        } else {
                                                          if (var14.field_i != 20) {
                                                            break L28;
                                                          } else {
                                                            break L29;
                                                          }
                                                        }
                                                      }
                                                      var14.field_B = 1;
                                                      var14.field_R = 0;
                                                      break L28;
                                                    }
                                                    if (1 != ((ak) this).field_k) {
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
                                              var14 = (on) (Object) var19.a((byte) 116);
                                              continue L21;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var9_ref = (vn) (Object) param0.field_gb.a((byte) 116);
                                  continue L15;
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                          L30: {
                            if (var8 != 0) {
                              break L30;
                            } else {
                              if (!param0.field_K.a(false)) {
                                param0.field_gb.a(param0.field_K.c(3), (byte) 3);
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                          }
                          if (var8 != 0) {
                            int fieldTemp$14 = param0.field_A + 1;
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
                      L31: {
                        var8 = 1;
                        if (param0.field_n == 0) {
                          var8 = 0;
                          break L31;
                        } else {
                          if (((ak) this).field_k == 1) {
                            var8 = 1;
                            break L31;
                          } else {
                            var9_int = 0;
                            L32: while (true) {
                              if (param0.field_z.length <= var9_int) {
                                break L31;
                              } else {
                                var21 = param0.field_z[var9_int];
                                var22 = var21;
                                var22 = var21;
                                var11_ref_on = (on) (Object) var21.d(param3 + -91);
                                L33: while (true) {
                                  if (var11_ref_on == null) {
                                    var9_int++;
                                    continue L32;
                                  } else {
                                    L34: {
                                      if ((1 << var11_ref_on.field_i & hp.field_m) == 0) {
                                        break L34;
                                      } else {
                                        if (81920 > var11_ref_on.field_m) {
                                          break L34;
                                        } else {
                                          var8 = 0;
                                          break L31;
                                        }
                                      }
                                    }
                                    var11_ref_on = (on) (Object) var21.a((byte) 116);
                                    continue L33;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L35: {
                        if (var8 == 0) {
                          break L35;
                        } else {
                          var9_ref2 = (cl) (Object) param0.field_v.d(-120);
                          L36: while (true) {
                            if (var9_ref2 == null) {
                              break L35;
                            } else {
                              var22 = var9_ref2.field_p;
                              var11_ref_ee = (ee) (Object) var22.d(-125);
                              L37: while (true) {
                                if (var11_ref_ee == null) {
                                  var9_ref2 = (cl) (Object) param0.field_v.a((byte) 116);
                                  continue L36;
                                } else {
                                  var11_ref_ee.field_m = var11_ref_ee.field_m + 256;
                                  var11_ref_ee = (ee) (Object) var22.a((byte) 116);
                                  continue L37;
                                }
                              }
                            }
                          }
                        }
                      }
                      var9_int = 0;
                      L38: while (true) {
                        if (~param0.field_z.length >= ~var9_int) {
                          var9_ref = (vn) (Object) param0.field_K.d(-105);
                          L39: while (true) {
                            if (var9_ref == null) {
                              var9_ref = (vn) (Object) param0.field_gb.d(param3 + -13);
                              L40: while (true) {
                                if (var9_ref == null) {
                                  L41: {
                                    if (var7.field_w > 0) {
                                      var7.field_w = var7.field_w - 1;
                                      break L41;
                                    } else {
                                      break L41;
                                    }
                                  }
                                  L42: {
                                    if (var7.field_H > 0) {
                                      var7.field_H = var7.field_H - 1;
                                      break L42;
                                    } else {
                                      break L42;
                                    }
                                  }
                                  L43: {
                                    if (0 >= var7.field_z) {
                                      break L43;
                                    } else {
                                      var7.field_z = var7.field_z - 1;
                                      break L43;
                                    }
                                  }
                                  L44: {
                                    if (var8 == 0) {
                                      break L44;
                                    } else {
                                      int fieldTemp$15 = param0.field_n - 1;
                                      param0.field_n = param0.field_n - 1;
                                      if (fieldTemp$15 % 16 == 0) {
                                        L45: {
                                          if (1 == ((ak) this).field_k) {
                                            stackOut_239_0 = 13;
                                            stackIn_240_0 = stackOut_239_0;
                                            break L45;
                                          } else {
                                            stackOut_238_0 = 7;
                                            stackIn_240_0 = stackOut_238_0;
                                            break L45;
                                          }
                                        }
                                        var9_int = stackIn_240_0;
                                        var10_ref = null;
                                        var11 = 1;
                                        L46: while (true) {
                                          if (~var11 < ~var9_int) {
                                            var11 = 0;
                                            L47: while (true) {
                                              if (var11 >= 3) {
                                                break L44;
                                              } else {
                                                var25 = param0.field_z[var11];
                                                var26 = var25;
                                                var26 = var25;
                                                var10_ref_on = (on) (Object) var25.d(-44);
                                                L48: while (true) {
                                                  if (var10_ref_on == null) {
                                                    var11++;
                                                    continue L47;
                                                  } else {
                                                    L49: {
                                                      if ((1 & var10_ref_on.field_N) != 0) {
                                                        break L49;
                                                      } else {
                                                        if (81920 >= var10_ref_on.field_m) {
                                                          break L49;
                                                        } else {
                                                          var10_ref_on.field_B = 7;
                                                          var10_ref_on.field_R = 0;
                                                          var10_ref_on.field_l = 0;
                                                          break L49;
                                                        }
                                                      }
                                                    }
                                                    var10_ref_on = (on) (Object) var25.a((byte) 116);
                                                    continue L48;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            on dupTemp$16 = new on(34 * var11 << 8, 4096, 0, 0, 0);
                                            var10_ref_on = dupTemp$16;
                                            param0.field_z[2].a((nm) (Object) dupTemp$16, (byte) 3);
                                            var10_ref_on.field_R = 2;
                                            var10_ref_on.field_B = 10;
                                            var11++;
                                            continue L46;
                                          }
                                        }
                                      } else {
                                        break L44;
                                      }
                                    }
                                  }
                                  L50: {
                                    if (param0.field_k < 0) {
                                      break L50;
                                    } else {
                                      var9_ref3 = (il) (Object) param0.field_C.d(-118);
                                      L51: while (true) {
                                        if (var9_ref3 == null) {
                                          param0.field_k = param0.field_k + 1;
                                          break L50;
                                        } else {
                                          var9_ref3.d(param3 + -2081170685);
                                          var9_ref3 = (il) (Object) param0.field_C.a((byte) 116);
                                          continue L51;
                                        }
                                      }
                                    }
                                  }
                                  var9_int = 0;
                                  L52: while (true) {
                                    if (var9_int >= 8) {
                                      var9_ref4 = var7;
                                      var7.field_o = 0;
                                      var9_ref4.field_k = 0;
                                      var10 = 0;
                                      L53: while (true) {
                                        if (var10 >= 3) {
                                          L54: {
                                            if (param0.field_L != 0) {
                                              break L54;
                                            } else {
                                              if (param0.field_n == 0) {
                                                L55: {
                                                  param0.field_P = 0;
                                                  param0.field_r = param0.field_r + 1;
                                                  param0.field_hb = param0.field_hb + 1;
                                                  param0.field_t = param0.field_t + 1;
                                                  if (1 != ((ak) this).field_k) {
                                                    break L55;
                                                  } else {
                                                    param0.a(250, false, 65280, var7.field_m + -12800);
                                                    break L55;
                                                  }
                                                }
                                                L56: {
                                                  int fieldTemp$17 = param0.field_qb + 1;
                                                  param0.field_qb = param0.field_qb + 1;
                                                  if (fieldTemp$17 < ((ak) this).field_b.a(param3 + -125)) {
                                                    break L56;
                                                  } else {
                                                    if (!((ak) this).field_b.field_c) {
                                                      if (((ak) this).field_k != 1) {
                                                        param0.field_Z = 7;
                                                        break L54;
                                                      } else {
                                                        param0.field_Z = 5;
                                                        break L54;
                                                      }
                                                    } else {
                                                      break L56;
                                                    }
                                                  }
                                                }
                                                param0.field_Z = 0;
                                                param0.field_P = 0;
                                                break L54;
                                              } else {
                                                break L54;
                                              }
                                            }
                                          }
                                          if (param0.field_lb == null) {
                                            var10 = 0;
                                            var11 = 0;
                                            var12 = 0;
                                            var13 = (vn) (Object) param0.field_gb.d(-26);
                                            L57: while (true) {
                                              if (var13 == null) {
                                                L58: {
                                                  if (var10 > 20) {
                                                    break L58;
                                                  } else {
                                                    if (15 >= var11) {
                                                      break L8;
                                                    } else {
                                                      break L58;
                                                    }
                                                  }
                                                }
                                                param0.a(ml.field_e, (byte) 75);
                                                break L7;
                                              } else {
                                                L59: {
                                                  var12 = var13.field_I;
                                                  if (~var13.field_I >= ~var10) {
                                                    break L59;
                                                  } else {
                                                    var10 = var12;
                                                    break L59;
                                                  }
                                                }
                                                L60: {
                                                  var12 = var13.field_B;
                                                  if (~var11 <= ~var13.field_B) {
                                                    break L60;
                                                  } else {
                                                    var11 = var12;
                                                    break L60;
                                                  }
                                                }
                                                var13 = (vn) (Object) param0.field_gb.a((byte) 116);
                                                continue L57;
                                              }
                                            }
                                          } else {
                                            break L7;
                                          }
                                        } else {
                                          var11_ref_on = (on) (Object) param0.field_z[var10].d(-49);
                                          L61: while (true) {
                                            if (var11_ref_on == null) {
                                              var10++;
                                              continue L53;
                                            } else {
                                              L62: {
                                                if ((var11_ref_on.field_N & 4) != 0) {
                                                  var11_ref_on.a((byte) 119, true);
                                                  break L62;
                                                } else {
                                                  break L62;
                                                }
                                              }
                                              var11_ref_on = (on) (Object) param0.field_z[var10].a((byte) 116);
                                              continue L61;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var10_ref_ge = (ge) (Object) param0.field_pb.d(-119);
                                      L63: while (true) {
                                        if (var10_ref_ge == null) {
                                          L64: {
                                            var7.field_j = var7.field_j + var7.field_k / 8;
                                            if (~var7.field_B < ~var7.field_j) {
                                              var7.field_j = var7.field_B;
                                              break L64;
                                            } else {
                                              break L64;
                                            }
                                          }
                                          L65: {
                                            if (-var7.field_u + var7.field_y < var7.field_j) {
                                              var7.field_j = -var7.field_u + var7.field_y;
                                              break L65;
                                            } else {
                                              break L65;
                                            }
                                          }
                                          L66: {
                                            if (var7.field_H > 0) {
                                              var10_ref_vn = (vn) (Object) param0.field_gb.d(-111);
                                              L67: while (true) {
                                                if (var10_ref_vn == null) {
                                                  break L66;
                                                } else {
                                                  L68: {
                                                    if (~(var10_ref_vn.field_j - -var10_ref_vn.field_u) < ~(var7.field_u / 2 + var7.field_j)) {
                                                      if (var10_ref_vn.field_k <= 0) {
                                                        break L68;
                                                      } else {
                                                        var10_ref_vn.field_k = -var10_ref_vn.field_k;
                                                        break L68;
                                                      }
                                                    } else {
                                                      if (0 > var10_ref_vn.field_k) {
                                                        var10_ref_vn.field_k = -var10_ref_vn.field_k;
                                                        break L68;
                                                      } else {
                                                        var10_ref_vn = (vn) (Object) param0.field_gb.a((byte) 116);
                                                        continue L67;
                                                      }
                                                    }
                                                  }
                                                  var10_ref_vn = (vn) (Object) param0.field_gb.a((byte) 116);
                                                  continue L67;
                                                }
                                              }
                                            } else {
                                              break L66;
                                            }
                                          }
                                          var10 = 0;
                                          L69: while (true) {
                                            if (param0.field_z.length <= var10) {
                                              var10_ref_vn = (vn) (Object) param0.field_gb.d(-122);
                                              L70: while (true) {
                                                L71: {
                                                  if (var10_ref_vn == null) {
                                                    break L71;
                                                  } else {
                                                    var11 = 0;
                                                    L72: while (true) {
                                                      L73: {
                                                        if (var11 >= 5) {
                                                          break L73;
                                                        } else {
                                                          if (!this.a(param0, param1, 8, -128, var10_ref_vn)) {
                                                            break L73;
                                                          } else {
                                                            var11++;
                                                            continue L72;
                                                          }
                                                        }
                                                      }
                                                      L74: {
                                                        if (!var10_ref_vn.b(0)) {
                                                          break L74;
                                                        } else {
                                                          L75: {
                                                            if (var11 == 5) {
                                                              break L75;
                                                            } else {
                                                              if (var10_ref_vn.field_j < 0) {
                                                                break L75;
                                                              } else {
                                                                if (0 > var10_ref_vn.field_m) {
                                                                  break L75;
                                                                } else {
                                                                  if (~(param0.field_mb << 8) <= ~var10_ref_vn.field_j) {
                                                                    break L74;
                                                                  } else {
                                                                    break L75;
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
                                                          param0.field_K.a((nm) (Object) var10_ref_vn, (byte) 3);
                                                          break L74;
                                                        }
                                                      }
                                                      if (!param0.field_gb.a(false)) {
                                                        var10_ref_vn = (vn) (Object) param0.field_gb.a((byte) 116);
                                                        continue L70;
                                                      } else {
                                                        break L71;
                                                      }
                                                    }
                                                  }
                                                }
                                                var10_ref_vn = (vn) (Object) param0.field_K.d(-91);
                                                L76: while (true) {
                                                  if (var10_ref_vn == null) {
                                                    var9_int++;
                                                    continue L52;
                                                  } else {
                                                    var10_ref_vn.a(var7, 0);
                                                    var10_ref_vn = (vn) (Object) param0.field_K.a((byte) 116);
                                                    continue L76;
                                                  }
                                                }
                                              }
                                            } else {
                                              var26 = param0.field_z[var10];
                                              var12_ref_on = (on) (Object) var26.d(-38);
                                              L77: while (true) {
                                                if (var12_ref_on == null) {
                                                  var10++;
                                                  continue L69;
                                                } else {
                                                  L78: {
                                                    if (0 == (var12_ref_on.field_N & 4)) {
                                                      break L78;
                                                    } else {
                                                      if (1 < var12_ref_on.field_P[var12_ref_on.field_C].field_t) {
                                                        var12_ref_on.field_j = var12_ref_on.field_j + var12_ref_on.field_k / 8;
                                                        var12_ref_on.field_m = var12_ref_on.field_m + var12_ref_on.field_o / 8;
                                                        break L78;
                                                      } else {
                                                        break L78;
                                                      }
                                                    }
                                                  }
                                                  var12_ref_on = (on) (Object) var26.a((byte) 116);
                                                  continue L77;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          L79: {
                                            var10_ref_ge.field_j = var10_ref_ge.field_j + var10_ref_ge.field_k / 8;
                                            var10_ref_ge.field_m = var10_ref_ge.field_m + var10_ref_ge.field_o / 8;
                                            if (var10_ref_ge.field_m > 122880) {
                                              L80: {
                                                stackOut_263_0 = (j) param0;
                                                stackOut_263_1 = 16387;
                                                stackIn_265_0 = stackOut_263_0;
                                                stackIn_265_1 = stackOut_263_1;
                                                stackIn_264_0 = stackOut_263_0;
                                                stackIn_264_1 = stackOut_263_1;
                                                if (param0.a(100, (byte) 62) > 50) {
                                                  stackOut_265_0 = (j) (Object) stackIn_265_0;
                                                  stackOut_265_1 = stackIn_265_1;
                                                  stackOut_265_2 = 4;
                                                  stackIn_266_0 = stackOut_265_0;
                                                  stackIn_266_1 = stackOut_265_1;
                                                  stackIn_266_2 = stackOut_265_2;
                                                  break L80;
                                                } else {
                                                  stackOut_264_0 = (j) (Object) stackIn_264_0;
                                                  stackOut_264_1 = stackIn_264_1;
                                                  stackOut_264_2 = 5;
                                                  stackIn_266_0 = stackOut_264_0;
                                                  stackIn_266_1 = stackOut_264_1;
                                                  stackIn_266_2 = stackOut_264_2;
                                                  break L80;
                                                }
                                              }
                                              L81: {
                                                ((j) (Object) stackIn_266_0).b(stackIn_266_1, stackIn_266_2);
                                                if (r.field_A) {
                                                  jc.a(var10_ref_ge.field_i, 4, (byte) -110);
                                                  break L81;
                                                } else {
                                                  break L81;
                                                }
                                              }
                                              var10_ref_ge.b((byte) 111);
                                              break L79;
                                            } else {
                                              if (!var7.a((no) (Object) var10_ref_ge, (byte) 25)) {
                                                break L79;
                                              } else {
                                                L82: {
                                                  var10_ref_ge.b((byte) 111);
                                                  if (!var10_ref_ge.b(false)) {
                                                    stackOut_273_0 = 0;
                                                    stackIn_274_0 = stackOut_273_0;
                                                    break L82;
                                                  } else {
                                                    stackOut_272_0 = 1;
                                                    stackIn_274_0 = stackOut_272_0;
                                                    break L82;
                                                  }
                                                }
                                                L83: {
                                                  var11 = stackIn_274_0;
                                                  if (param2 == null) {
                                                    break L83;
                                                  } else {
                                                    param2.a((nm) (Object) var10_ref_ge, (byte) 3);
                                                    break L83;
                                                  }
                                                }
                                                L84: {
                                                  if (((ak) this).field_k != 1) {
                                                    break L84;
                                                  } else {
                                                    L85: {
                                                      stackOut_277_0 = var11;
                                                      stackIn_279_0 = stackOut_277_0;
                                                      stackIn_278_0 = stackOut_277_0;
                                                      if (var10_ref_ge.field_i != 13) {
                                                        stackOut_279_0 = stackIn_279_0;
                                                        stackOut_279_1 = 0;
                                                        stackIn_280_0 = stackOut_279_0;
                                                        stackIn_280_1 = stackOut_279_1;
                                                        break L85;
                                                      } else {
                                                        stackOut_278_0 = stackIn_278_0;
                                                        stackOut_278_1 = 1;
                                                        stackIn_280_0 = stackOut_278_0;
                                                        stackIn_280_1 = stackOut_278_1;
                                                        break L85;
                                                      }
                                                    }
                                                    L86: {
                                                      var11 = stackIn_280_0 | stackIn_280_1;
                                                      stackOut_280_0 = (j) param0;
                                                      stackIn_282_0 = stackOut_280_0;
                                                      stackIn_281_0 = stackOut_280_0;
                                                      if (var11 != 0) {
                                                        stackOut_282_0 = (j) (Object) stackIn_282_0;
                                                        stackOut_282_1 = 100;
                                                        stackIn_283_0 = stackOut_282_0;
                                                        stackIn_283_1 = stackOut_282_1;
                                                        break L86;
                                                      } else {
                                                        stackOut_281_0 = (j) (Object) stackIn_281_0;
                                                        stackOut_281_1 = 500;
                                                        stackIn_283_0 = stackOut_281_0;
                                                        stackIn_283_1 = stackOut_281_1;
                                                        break L86;
                                                      }
                                                    }
                                                    ((j) (Object) stackIn_283_0).a(stackIn_283_1, var7, param3 + 2);
                                                    if (var11 != 0) {
                                                      param0.field_u = 0;
                                                      param0.field_hb = 0;
                                                      param0.field_N = param0.field_N + 1;
                                                      break L84;
                                                    } else {
                                                      param0.field_u = param0.field_u + 1;
                                                      param0.field_N = 0;
                                                      break L84;
                                                    }
                                                  }
                                                }
                                                L87: {
                                                  if (!r.field_A) {
                                                    break L87;
                                                  } else {
                                                    jc.a(var10_ref_ge.field_i, 3, (byte) -115);
                                                    break L87;
                                                  }
                                                }
                                                L88: {
                                                  if (param1 != null) {
                                                    param1.a((nm) (Object) new qc(3, var10_ref_ge.field_i), (byte) 3);
                                                    break L88;
                                                  } else {
                                                    break L88;
                                                  }
                                                }
                                                L89: {
                                                  L90: {
                                                    stackOut_291_0 = (j) param0;
                                                    stackIn_295_0 = stackOut_291_0;
                                                    stackIn_292_0 = stackOut_291_0;
                                                    if (1 < ((ak) this).field_k) {
                                                      break L90;
                                                    } else {
                                                      stackOut_292_0 = (j) (Object) stackIn_292_0;
                                                      stackIn_295_0 = stackOut_292_0;
                                                      stackIn_293_0 = stackOut_292_0;
                                                      if (var10_ref_ge.field_i == 13) {
                                                        break L90;
                                                      } else {
                                                        stackOut_293_0 = (j) (Object) stackIn_293_0;
                                                        stackIn_296_0 = stackOut_293_0;
                                                        stackIn_294_0 = stackOut_293_0;
                                                        if (var11 == 0) {
                                                          stackOut_296_0 = (j) (Object) stackIn_296_0;
                                                          stackOut_296_1 = eh.field_e;
                                                          stackIn_297_0 = stackOut_296_0;
                                                          stackIn_297_1 = stackOut_296_1;
                                                          break L89;
                                                        } else {
                                                          stackOut_294_0 = (j) (Object) stackIn_294_0;
                                                          stackIn_295_0 = stackOut_294_0;
                                                          break L90;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  stackOut_295_0 = (j) (Object) stackIn_295_0;
                                                  stackOut_295_1 = ml.field_e;
                                                  stackIn_297_0 = stackOut_295_0;
                                                  stackIn_297_1 = stackOut_295_1;
                                                  break L89;
                                                }
                                                ((j) (Object) stackIn_297_0).a(stackIn_297_1, (byte) 75);
                                                break L79;
                                              }
                                            }
                                          }
                                          var10_ref_ge = (ge) (Object) param0.field_pb.a((byte) 116);
                                          continue L63;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L91: {
                                    var9_ref.field_E.a(-7255, var9_ref.field_j + var9_ref.field_u);
                                    var9_ref.field_y.a(-7255, var9_ref.field_m - -var9_ref.field_u);
                                    if (var9_ref.field_J > 0) {
                                      var9_ref.field_J = var9_ref.field_J - 1;
                                      break L91;
                                    } else {
                                      break L91;
                                    }
                                  }
                                  L92: {
                                    if (var9_ref.field_v > 0) {
                                      var9_ref.field_v = var9_ref.field_v - 1;
                                      break L92;
                                    } else {
                                      break L92;
                                    }
                                  }
                                  var9_ref = (vn) (Object) param0.field_gb.a((byte) 116);
                                  continue L40;
                                }
                              }
                            } else {
                              L93: {
                                if (var9_ref.field_J <= 0) {
                                  break L93;
                                } else {
                                  var9_ref.field_J = var9_ref.field_J - 1;
                                  break L93;
                                }
                              }
                              L94: {
                                if (var9_ref.field_v > 0) {
                                  var9_ref.field_v = var9_ref.field_v - 1;
                                  break L94;
                                } else {
                                  break L94;
                                }
                              }
                              var9_ref = (vn) (Object) param0.field_K.a((byte) 116);
                              continue L39;
                            }
                          }
                        } else {
                          var23 = param0.field_z[var9_int];
                          var11_ref_on = (on) (Object) var23.d(param3 ^ -42);
                          L95: while (true) {
                            if (var11_ref_on == null) {
                              var9_int++;
                              continue L38;
                            } else {
                              L96: {
                                if (var8 == 0) {
                                  break L96;
                                } else {
                                  if ((5 & var11_ref_on.field_N) != 0) {
                                    break L96;
                                  } else {
                                    var11_ref_on.field_m = var11_ref_on.field_m + 256;
                                    break L96;
                                  }
                                }
                              }
                              L97: {
                                if (0 > var11_ref_on.field_R) {
                                  break L97;
                                } else {
                                  int fieldTemp$18 = var11_ref_on.field_l + 1;
                                  var11_ref_on.field_l = var11_ref_on.field_l + 1;
                                  if (fieldTemp$18 != 16) {
                                    break L97;
                                  } else {
                                    var11_ref_on.field_B = 0;
                                    var11_ref_on.field_l = 0;
                                    if (0 == var11_ref_on.field_R) {
                                      L98: {
                                        var11_ref_on.b((byte) 111);
                                        if ((1 << var11_ref_on.field_i & hp.field_m) != 0) {
                                          param0.field_L = param0.field_L - 1;
                                          param0.field_m = param0.field_m + 1;
                                          param0.field_Q = param0.field_Q + 1;
                                          break L98;
                                        } else {
                                          break L98;
                                        }
                                      }
                                      if (!r.field_A) {
                                        break L97;
                                      } else {
                                        jc.a(var11_ref_on.field_N, 1, (byte) -95);
                                        break L97;
                                      }
                                    } else {
                                      L99: {
                                        if (var11_ref_on.field_i == 0) {
                                          param0.field_L = param0.field_L + 1;
                                          break L99;
                                        } else {
                                          break L99;
                                        }
                                      }
                                      var11_ref_on.field_i = var11_ref_on.field_R;
                                      var11_ref_on.field_R = -1;
                                      break L97;
                                    }
                                  }
                                }
                              }
                              L100: {
                                if ((4 & var11_ref_on.field_N) != 0) {
                                  var11_ref_on.a((byte) 58, true);
                                  var11_ref_on.field_S = var11_ref_on.field_S + 1;
                                  var11_ref_on.field_J = var11_ref_on.field_J + 1;
                                  var24 = var11_ref_on.field_P[var11_ref_on.field_C];
                                  if (~var24.field_t == ~var11_ref_on.field_S) {
                                    var11_ref_on.f(105);
                                    break L100;
                                  } else {
                                    break L100;
                                  }
                                } else {
                                  break L100;
                                }
                              }
                              var11_ref_on = (on) (Object) var23.a((byte) 116);
                              continue L95;
                            }
                          }
                        }
                      }
                    } else {
                      if (param0.field_Z != 0) {
                        if (param0.field_Z == 1) {
                          L101: {
                            if (param0.field_P == 0) {
                              L102: {
                                if (((ak) this).field_k == 1) {
                                  param0.field_lb = null;
                                  param0.field_fb = ((ak) this).field_b.a((byte) 115, param0.field_qb);
                                  param0.field_i = 100;
                                  break L102;
                                } else {
                                  break L102;
                                }
                              }
                              if (param1 == null) {
                                break L101;
                              } else {
                                param1.a((nm) (Object) new qc(14), (byte) 3);
                                break L101;
                              }
                            } else {
                              break L101;
                            }
                          }
                          L103: {
                            if (param0.field_r != 0) {
                              var8 = 0;
                              L104: while (true) {
                                if (var8 >= 3) {
                                  break L103;
                                } else {
                                  var9 = (on) (Object) param0.field_z[var8].d(-30);
                                  L105: while (true) {
                                    if (var9 == null) {
                                      var8++;
                                      continue L104;
                                    } else {
                                      L106: {
                                        if (var9.field_R < 0) {
                                          break L106;
                                        } else {
                                          int fieldTemp$19 = var9.field_l + 1;
                                          var9.field_l = var9.field_l + 1;
                                          if (fieldTemp$19 == 16) {
                                            var9.field_B = 0;
                                            var9.field_l = 0;
                                            var9.field_R = -1;
                                            break L106;
                                          } else {
                                            break L106;
                                          }
                                        }
                                      }
                                      var9 = (on) (Object) param0.field_z[var8].a((byte) 116);
                                      continue L105;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L103;
                            }
                          }
                          L107: {
                            var8 = 0;
                            if (((ak) this).field_k == 1) {
                              var8 = 125;
                              break L107;
                            } else {
                              if (param0.field_r == 0) {
                                var8 = 75;
                                break L107;
                              } else {
                                var8 = 40;
                                break L107;
                              }
                            }
                          }
                          int fieldTemp$20 = param0.field_P + 1;
                          param0.field_P = param0.field_P + 1;
                          if (~fieldTemp$20 == ~var8) {
                            param0.field_P = 0;
                            param0.field_Z = 4;
                            break L7;
                          } else {
                            break L7;
                          }
                        } else {
                          if (param0.field_Z != 4) {
                            if (param0.field_Z == 3) {
                              int fieldTemp$21 = param0.field_P + 1;
                              param0.field_P = param0.field_P + 1;
                              if (fieldTemp$21 == 350) {
                                param0.field_P = 0;
                                param0.field_Z = 8;
                                break L7;
                              } else {
                                break L7;
                              }
                            } else {
                              if (param0.field_Z == 5) {
                                int fieldTemp$22 = param0.field_P + 1;
                                param0.field_P = param0.field_P + 1;
                                if (fieldTemp$22 != 350) {
                                  break L8;
                                } else {
                                  param0.field_P = 0;
                                  param0.field_Z = 9;
                                  break L7;
                                }
                              } else {
                                break L7;
                              }
                            }
                          } else {
                            L108: {
                              if (param0.field_P == 0) {
                                if (param1 == null) {
                                  break L108;
                                } else {
                                  param1.a((nm) (Object) new qc(13), (byte) 3);
                                  break L108;
                                }
                              } else {
                                break L108;
                              }
                            }
                            L109: {
                              int fieldTemp$23 = param0.field_P + 1;
                              param0.field_P = param0.field_P + 1;
                              if (fieldTemp$23 == 75) {
                                break L109;
                              } else {
                                if (((ak) this).field_k != 1) {
                                  break L8;
                                } else {
                                  if (25 != param0.field_P) {
                                    break L8;
                                  } else {
                                    break L109;
                                  }
                                }
                              }
                            }
                            L110: {
                              param0.field_lb = lq.field_c;
                              stackOut_52_0 = (j) param0;
                              stackIn_54_0 = stackOut_52_0;
                              stackIn_53_0 = stackOut_52_0;
                              if (param0.field_i > 25) {
                                stackOut_54_0 = (j) (Object) stackIn_54_0;
                                stackOut_54_1 = 25;
                                stackIn_55_0 = stackOut_54_0;
                                stackIn_55_1 = stackOut_54_1;
                                break L110;
                              } else {
                                stackOut_53_0 = (j) (Object) stackIn_53_0;
                                stackOut_53_1 = param0.field_i;
                                stackIn_55_0 = stackOut_53_0;
                                stackIn_55_1 = stackOut_53_1;
                                break L110;
                              }
                            }
                            stackIn_55_0.field_i = stackIn_55_1;
                            param0.field_Z = 2;
                            param0.field_P = 0;
                            break L7;
                          }
                        }
                      } else {
                        var8_ref_vl__ = new vl[3];
                        var9_int = 0;
                        L111: while (true) {
                          if (3 <= var9_int) {
                            L112: {
                              var18 = new vl();
                              var10 = param0.field_ab.field_p;
                              ((ak) this).field_b.a(new ga(), param0.field_ab, var18, param0.field_qb, (byte) -118, var8_ref_vl__);
                              param0.a(var18, param3 + 9, var8_ref_vl__);
                              param0.a(26496, false);
                              if (((ak) this).field_k == 1) {
                                if (0 >= param0.field_r) {
                                  break L112;
                                } else {
                                  L113: {
                                    if (param0.field_ab.field_p == 0) {
                                      break L113;
                                    } else {
                                      if (var10 != param0.field_ab.field_p) {
                                        break L113;
                                      } else {
                                        break L112;
                                      }
                                    }
                                  }
                                  param0.field_tb = true;
                                  break L112;
                                }
                              } else {
                                break L112;
                              }
                            }
                            L114: {
                              if (param0.field_r == 0) {
                                break L114;
                              } else {
                                var11 = 0;
                                L115: while (true) {
                                  if (var11 >= 3) {
                                    break L114;
                                  } else {
                                    var12_ref_on = (on) (Object) var8_ref_vl__[var11].d(param3 ^ -107);
                                    L116: while (true) {
                                      if (var12_ref_on == null) {
                                        var11++;
                                        continue L115;
                                      } else {
                                        var12_ref_on.field_l = 0;
                                        var12_ref_on.field_B = 5;
                                        var12_ref_on.field_R = var12_ref_on.field_i;
                                        var12_ref_on = (on) (Object) var8_ref_vl__[var11].a((byte) 116);
                                        continue L116;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            param0.field_Z = 1;
                            param0.field_P = 0;
                            param0.field_A = 0;
                            break L7;
                          } else {
                            var8_ref_vl__[var9_int] = new vl();
                            var9_int++;
                            continue L111;
                          }
                        }
                      }
                    }
                  }
                  break L7;
                }
                return;
              } else {
                L117: {
                  if (var6.b(false)) {
                    break L117;
                  } else {
                    var6.b((byte) 111);
                    break L117;
                  }
                }
                var6 = (ul) (Object) param0.field_nb.a((byte) 116);
                continue L6;
              }
            }
          } else {
            L118: {
              if (var5.c((byte) 69)) {
                break L118;
              } else {
                var5.b((byte) 111);
                break L118;
              }
            }
            var5 = (kc) (Object) param0.field_x.a((byte) 116);
            continue L5;
          }
        }
    }

    public static void d(int param0) {
        field_d = null;
        field_e = null;
    }

    private final void a(vn param0, int param1, j param2) {
        int var4_int = 0;
        vl var5 = null;
        on var6 = null;
        int var7 = BrickABrac.field_J ? 1 : 0;
        try {
            hg.a(param1);
            for (var4_int = -1 + param2.field_z.length; var4_int > -1; var4_int--) {
                var5 = param2.field_z[var4_int];
                var6 = (on) (Object) var5.f(~param1);
                while (var6 != null) {
                    boolean discarded$0 = var6.a((no) (Object) param0, (byte) 119);
                    var6 = (on) (Object) var5.b(-126);
                }
                if (dj.field_c != null) {
                    break;
                }
            }
            boolean discarded$1 = param2.field_yb.a((no) (Object) param0, (byte) 110);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ak.J(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
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
        var3 = 30 * ((ak) this).field_k;
        if (param0 > 120) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((ak) this).field_k) {
              return var2;
            } else {
              if (((((ak) this).field_i | (((ak) this).field_a | ((ak) this).field_g)) & 1 << var4) == 0) {
                var5 = ((ak) this).field_l[var4].field_p + ((ak) this).field_l[var4].field_ub;
                var6 = 0;
                var7 = (var4 + 1) % ((ak) this).field_k;
                L1: while (true) {
                  if (((ak) this).field_k - 1 > var6) {
                    if ((1 << var7 & (((ak) this).field_a | ((ak) this).field_g | ((ak) this).field_i)) != 0) {
                      var7++;
                      var7 = var7 % ((ak) this).field_k;
                      var6++;
                      continue L1;
                    } else {
                      L2: {
                        var8 = ((ak) this).field_l[var7].field_ub - -((ak) this).field_l[var7].field_p;
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
            ((ak) this).field_c = true;
            break L0;
          }
        }
        var3 = ((ak) this).field_l[param1];
        L1: while (true) {
          L2: {
            if (var3.field_X > var3.field_kb.field_n) {
              break L2;
            } else {
              var4 = (ge) var3.field_kb.a(var3.field_X, 67);
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
        int stackIn_88_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_102_0 = 0;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_109_2 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        String stackIn_112_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_87_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
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
                            if (param4.field_C != 39) {
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
                          param1.a((nm) (Object) new qc(5), (byte) 3);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if ((Object) (Object) param0.field_yb == (Object) (Object) dj.field_c) {
                      if (param0.field_yb.field_z > 0) {
                        L4: {
                          if (param1 != null) {
                            param1.a((nm) (Object) new qc(10), (byte) 3);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        param0.field_yb.a((byte) 53, param0, (no) (Object) param4);
                        param4.field_E.field_j = -1;
                        param4.field_C = 0;
                        param4.field_y.field_j = -1;
                        param0.field_K.a((nm) (Object) param4, (byte) 3);
                        stackOut_87_0 = 0;
                        stackIn_88_0 = stackOut_87_0;
                        return stackIn_88_0 != 0;
                      } else {
                        L5: {
                          if (param1 == null) {
                            break L5;
                          } else {
                            param1.a((nm) (Object) new qc(0), (byte) 3);
                            break L5;
                          }
                        }
                        param0.field_yb.a((byte) 53, param0, (no) (Object) param4);
                        param4.field_B = 0;
                        break L1;
                      }
                    } else {
                      L6: {
                        dj.field_c.a((byte) 53, param0, (no) (Object) param4);
                        var9 = (on) (Object) dj.field_c;
                        if (param1 != null) {
                          L7: {
                            var7 = 1;
                            if ((var9.field_N & 1) == 0) {
                              if (var9.field_i != 28) {
                                if (var9.field_i != 25) {
                                  L8: {
                                    if (var9.field_i == 1) {
                                      break L8;
                                    } else {
                                      if (var9.field_i == 21) {
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
                                              if (sh.field_a != 1) {
                                                var7 = 11;
                                                break L7;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (var9.field_i != 20) {
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
                                          if (var9.field_i != 27) {
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
                          param1.a((nm) (Object) new qc(var7), (byte) 3);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L13: {
                        if (param4.field_J != 0) {
                          break L13;
                        } else {
                          if (var9.field_R != 0) {
                            break L13;
                          } else {
                            L14: {
                              if (1 != ((ak) this).field_k) {
                                break L14;
                              } else {
                                param0.a(10 - -param4.field_B, var9, 2);
                                break L14;
                              }
                            }
                            param4.field_B = param4.field_B + 1;
                            break L13;
                          }
                        }
                      }
                      break L1;
                    }
                  }
                }
                this.a(param4, -1, param0);
                if (dj.field_c == null) {
                  stackOut_101_0 = 0;
                  stackIn_102_0 = stackOut_101_0;
                  break L0;
                } else {
                  if (param4.field_J != 0) {
                    if ((Object) (Object) dj.field_c == (Object) (Object) param0.field_yb) {
                      stackOut_95_0 = 1;
                      stackIn_96_0 = stackOut_95_0;
                      return stackIn_96_0 != 0;
                    } else {
                      L15: {
                        var10 = (on) (Object) dj.field_c;
                        if ((1 & var10.field_N) == 0) {
                          stackOut_99_0 = 0;
                          stackIn_100_0 = stackOut_99_0;
                          break L15;
                        } else {
                          stackOut_98_0 = 1;
                          stackIn_100_0 = stackOut_98_0;
                          break L15;
                        }
                      }
                      return stackIn_100_0 != 0;
                    }
                  } else {
                    stackOut_91_0 = 1;
                    stackIn_92_0 = stackOut_91_0;
                    return stackIn_92_0 != 0;
                  }
                }
              } else {
                stackOut_29_0 = 0;
                stackIn_30_0 = stackOut_29_0;
                return stackIn_30_0 != 0;
              }
            } else {
              L16: {
                param4.b((byte) 111);
                if (param1 == null) {
                  break L16;
                } else {
                  param1.a((nm) (Object) new qc(7), (byte) 3);
                  break L16;
                }
              }
              L17: {
                if (!param0.field_gb.a(false)) {
                  break L17;
                } else {
                  if (param0.field_K.a(false)) {
                    L18: {
                      if (1 == ((ak) this).field_k) {
                        L19: {
                          if (!r.field_A) {
                            break L19;
                          } else {
                            if (0 != ((ak) this).field_b.field_b.field_h) {
                              break L19;
                            } else {
                              if (0 < param0.field_qb) {
                                break L19;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        param0.field_rb = param0.field_rb - 1;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L20: {
                      if (param0.field_rb <= 0) {
                        param0.b(16387, 3);
                        param0.a((byte) 22);
                        break L20;
                      } else {
                        L21: {
                          if (3 != param0.field_y) {
                            if (param0.field_y == 6) {
                              param0.a(7, true, 150);
                              break L21;
                            } else {
                              param0.a(3, true, 150);
                              break L21;
                            }
                          } else {
                            param0.a(6, true, 150);
                            break L21;
                          }
                        }
                        L22: {
                          if (!r.field_A) {
                            break L22;
                          } else {
                            jc.a(0, 5, (byte) -124);
                            break L22;
                          }
                        }
                        param0.a(26496, true);
                        param0.field_P = 0;
                        param0.field_Z = 4;
                        break L20;
                      }
                    }
                    param0.a(eh.field_e, (byte) 75);
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    return stackIn_25_0 != 0;
                  } else {
                    break L17;
                  }
                }
              }
              param0.b(16387, 2);
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              return stackIn_27_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_103_0 = (RuntimeException) var6;
            stackOut_103_1 = new StringBuilder().append("ak.B(");
            stackIn_105_0 = stackOut_103_0;
            stackIn_105_1 = stackOut_103_1;
            stackIn_104_0 = stackOut_103_0;
            stackIn_104_1 = stackOut_103_1;
            if (param0 == null) {
              stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
              stackOut_105_1 = (StringBuilder) (Object) stackIn_105_1;
              stackOut_105_2 = "null";
              stackIn_106_0 = stackOut_105_0;
              stackIn_106_1 = stackOut_105_1;
              stackIn_106_2 = stackOut_105_2;
              break L23;
            } else {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "{...}";
              stackIn_106_0 = stackOut_104_0;
              stackIn_106_1 = stackOut_104_1;
              stackIn_106_2 = stackOut_104_2;
              break L23;
            }
          }
          L24: {
            stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
            stackOut_106_1 = ((StringBuilder) (Object) stackIn_106_1).append(stackIn_106_2).append(44);
            stackIn_108_0 = stackOut_106_0;
            stackIn_108_1 = stackOut_106_1;
            stackIn_107_0 = stackOut_106_0;
            stackIn_107_1 = stackOut_106_1;
            if (param1 == null) {
              stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
              stackOut_108_1 = (StringBuilder) (Object) stackIn_108_1;
              stackOut_108_2 = "null";
              stackIn_109_0 = stackOut_108_0;
              stackIn_109_1 = stackOut_108_1;
              stackIn_109_2 = stackOut_108_2;
              break L24;
            } else {
              stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
              stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
              stackOut_107_2 = "{...}";
              stackIn_109_0 = stackOut_107_0;
              stackIn_109_1 = stackOut_107_1;
              stackIn_109_2 = stackOut_107_2;
              break L24;
            }
          }
          L25: {
            stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
            stackOut_109_1 = ((StringBuilder) (Object) stackIn_109_1).append(stackIn_109_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_111_0 = stackOut_109_0;
            stackIn_111_1 = stackOut_109_1;
            stackIn_110_0 = stackOut_109_0;
            stackIn_110_1 = stackOut_109_1;
            if (param4 == null) {
              stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
              stackOut_111_1 = (StringBuilder) (Object) stackIn_111_1;
              stackOut_111_2 = "null";
              stackIn_112_0 = stackOut_111_0;
              stackIn_112_1 = stackOut_111_1;
              stackIn_112_2 = stackOut_111_2;
              break L25;
            } else {
              stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
              stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
              stackOut_110_2 = "{...}";
              stackIn_112_0 = stackOut_110_0;
              stackIn_112_1 = stackOut_110_1;
              stackIn_112_2 = stackOut_110_2;
              break L25;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_112_0, stackIn_112_2 + 41);
        }
        return stackIn_102_0 != 0;
    }

    final boolean b(int param0) {
        int var2 = 0;
        L0: {
          if (param0 >= 75) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        L1: {
          var2 = ~(((ak) this).field_g | ((ak) this).field_a | ((ak) this).field_i) & -1 + (1 << ((ak) this).field_k);
          if (var2 == 0) {
            ((ak) this).a(false);
            break L1;
          } else {
            if (!wn.a(var2, (byte) -6)) {
              break L1;
            } else {
              ((ak) this).field_h = ed.b(9, var2 + -1);
              ((ak) this).field_a = ((ak) this).field_a | 1 << ((ak) this).field_h;
              ((ak) this).a(false);
              break L1;
            }
          }
        }
        return ((ak) this).field_c;
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
              ((ak) this).field_k = param0.length;
              ((ak) this).field_f = param0;
              ((ak) this).field_b = param2;
              ((ak) this).field_l = new j[((ak) this).field_k];
              if (((ak) this).field_k >= 2) {
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
              if (((ak) this).field_k <= var8) {
                ((ak) this).field_m = new int[((ak) this).field_k];
                ((ak) this).field_h = -1;
                break L0;
              } else {
                L3: {
                  ((ak) this).field_l[var8] = new j(var6_int, var8 * 30, var7, param3[var8], param4[var8]);
                  stackOut_6_0 = ((ak) this).field_l[var8].field_yb;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (1 < ((ak) this).field_k) {
                    stackOut_8_0 = (vo) (Object) stackIn_8_0;
                    stackOut_8_1 = 102400;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L3;
                  } else {
                    stackOut_7_0 = (vo) (Object) stackIn_7_0;
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
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("ak.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
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
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Create unrated game";
    }
}
