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
        ge var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          if (param3 <= -39) {
            break L0;
          } else {
            int discarded$2 = ((ak) this).c(86);
            break L0;
          }
        }
        var5 = (ge) (Object) param2.d(-44);
        L1: while (true) {
          if (var5 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (((ak) this).field_k == 1) {
                  break L3;
                } else {
                  if (!var5.b(false)) {
                    var6 = 0;
                    L4: while (true) {
                      if (var6 >= ((ak) this).field_k) {
                        break L2;
                      } else {
                        if (var6 != param0) {
                          if ((1 << var6 & (((ak) this).field_g | ((ak) this).field_i | ((ak) this).field_a)) == 0) {
                            ((ak) this).field_l[var6].field_kb.a((Object) (Object) new ge(var5, param1 + ((ak) this).field_l[var6].field_F), (byte) -39);
                            var6++;
                            continue L4;
                          } else {
                            var6++;
                            continue L4;
                          }
                        } else {
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
              }
              ((ak) this).field_l[param0].field_kb.a((Object) (Object) new ge(var5, param1 + ((ak) this).field_l[param0].field_F), (byte) -39);
              break L2;
            }
            var5 = (ge) (Object) param2.a((byte) 116);
            continue L1;
          }
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
        on var10_ref = null;
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
        vl var21_ref = null;
        vl var22 = null;
        vl var23 = null;
        ee var24 = null;
        vl var25 = null;
        vl var26 = null;
        vl var26_ref = null;
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
        j stackOut_153_0;
        int stackOut_153_1;
        j stackOut_155_0;
        int stackOut_155_1;
        int stackOut_155_2;
        j stackOut_154_0;
        int stackOut_154_1;
        int stackOut_154_2;
        j stackOut_156_0;
        j stackOut_158_0;
        String[] stackOut_158_1;
        j stackOut_157_0;
        String[] stackOut_157_1;
        int stackOut_130_0;
        int stackOut_129_0;
        int stackOut_127_0;
        int stackOut_125_0;
        int stackOut_123_0;
        int stackOut_121_0;
        int stackOut_141_0;
        int stackOut_140_0;
        int stackOut_244_0;
        int stackOut_243_0;
        j stackOut_268_0;
        int stackOut_268_1;
        j stackOut_270_0;
        int stackOut_270_1;
        int stackOut_270_2;
        j stackOut_269_0;
        int stackOut_269_1;
        int stackOut_269_2;
        int stackOut_278_0;
        int stackOut_277_0;
        int stackOut_282_0;
        int stackOut_284_0;
        int stackOut_284_1;
        int stackOut_283_0;
        int stackOut_283_1;
        j stackOut_285_0;
        j stackOut_287_0;
        int stackOut_287_1;
        j stackOut_286_0;
        int stackOut_286_1;
        j stackOut_296_0;
        j stackOut_297_0;
        j stackOut_298_0;
        j stackOut_301_0;
        String[] stackOut_301_1;
        j stackOut_299_0;
        j stackOut_300_0;
        String[] stackOut_300_1;
        j stackOut_53_0;
        j stackOut_55_0;
        int stackOut_55_1;
        j stackOut_54_0;
        int stackOut_54_1;
        L0: {
          L1: {
            var12_ref = null;
            var11_ref = null;
            var17 = BrickABrac.field_J ? 1 : 0;
            if (param3 >= param0.field_i) {
              break L1;
            } else {
              param0.field_i = param0.field_i - 1;
              if (-1 <= (param0.field_i - 1 ^ -1)) {
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
            param0.field_ib = param0.field_ib - 1;
            if (0 != param0.field_ib - 1) {
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
                  var7 = param0.field_yb;
                  if (-3 == (param0.field_Z ^ -1)) {
                    L8: {
                      if (param1 == null) {
                        break L8;
                      } else {
                        if (0 == (3 & param0.field_db)) {
                          break L8;
                        } else {
                          if (3 != param0.field_db) {
                            param1.a((nm) (Object) new qc(4), (byte) 3);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    L9: {
                      if (0 < var7.field_w) {
                        param0.field_db = param0.field_db ^ 3;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if ((param0.field_db & 2) == -1) {
                        break L10;
                      } else {
                        var7.field_k = 2048;
                        break L10;
                      }
                    }
                    L11: {
                      if (-1 != (param0.field_db & 1)) {
                        var7.field_k = var7.field_k - 2048;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if ((param0.field_db & 4) != 0) {
                        L13: {
                          var8 = 0;
                          if (!param0.field_gb.a(false)) {
                            var9_ref = (vn) (Object) param0.field_gb.d(-76);
                            L14: while (true) {
                              if (var9_ref == null) {
                                break L13;
                              } else {
                                L15: {
                                  if (40 > var9_ref.field_C) {
                                    break L15;
                                  } else {
                                    L16: {
                                      if (param1 != null) {
                                        param1.a((nm) (Object) new qc(6), (byte) 3);
                                        break L16;
                                      } else {
                                        break L16;
                                      }
                                    }
                                    var8 = 1;
                                    var9_ref.field_C = 0;
                                    param0.field_x.a((nm) (Object) new kc(var9_ref.field_j, var9_ref.field_m), (byte) 3);
                                    param0.field_l = 0;
                                    var20 = new no(var9_ref.field_u + var9_ref.field_j, var9_ref.field_u + var9_ref.field_m, 0, 0, 15360, 0);
                                    var11 = 0;
                                    var12 = 0;
                                    L17: while (true) {
                                      if (param0.field_z.length <= var12) {
                                        L18: {
                                          stackOut_153_0 = (j) param0;
                                          stackOut_153_1 = 16387;
                                          stackIn_155_0 = stackOut_153_0;
                                          stackIn_155_1 = stackOut_153_1;
                                          stackIn_154_0 = stackOut_153_0;
                                          stackIn_154_1 = stackOut_153_1;
                                          if (-1 > var11) {
                                            stackOut_155_0 = (j) (Object) stackIn_155_0;
                                            stackOut_155_1 = stackIn_155_1;
                                            stackOut_155_2 = 1;
                                            stackIn_156_0 = stackOut_155_0;
                                            stackIn_156_1 = stackOut_155_1;
                                            stackIn_156_2 = stackOut_155_2;
                                            break L18;
                                          } else {
                                            stackOut_154_0 = (j) (Object) stackIn_154_0;
                                            stackOut_154_1 = stackIn_154_1;
                                            stackOut_154_2 = 6;
                                            stackIn_156_0 = stackOut_154_0;
                                            stackIn_156_1 = stackOut_154_1;
                                            stackIn_156_2 = stackOut_154_2;
                                            break L18;
                                          }
                                        }
                                        L19: {
                                          ((j) (Object) stackIn_156_0).b(stackIn_156_1, stackIn_156_2);
                                          stackOut_156_0 = (j) param0;
                                          stackIn_158_0 = stackOut_156_0;
                                          stackIn_157_0 = stackOut_156_0;
                                          if (-1 < var11) {
                                            stackOut_158_0 = (j) (Object) stackIn_158_0;
                                            stackOut_158_1 = ml.field_e;
                                            stackIn_159_0 = stackOut_158_0;
                                            stackIn_159_1 = stackOut_158_1;
                                            break L19;
                                          } else {
                                            stackOut_157_0 = (j) (Object) stackIn_157_0;
                                            stackOut_157_1 = eh.field_e;
                                            stackIn_159_0 = stackOut_157_0;
                                            stackIn_159_1 = stackOut_157_1;
                                            break L19;
                                          }
                                        }
                                        ((j) (Object) stackIn_159_0).a((String[]) (Object) stackIn_159_1, (byte) 75);
                                        break L15;
                                      } else {
                                        var19 = param0.field_z[var12];
                                        var21_ref = var19;
                                        var22 = var21_ref;
                                        var21_ref = var19;
                                        var14 = (on) (Object) var19.d(-78);
                                        L20: while (true) {
                                          if (var14 == null) {
                                            var12++;
                                            continue L17;
                                          } else {
                                            L21: {
                                              if (!var14.a(var20, false)) {
                                                break L21;
                                              } else {
                                                L22: {
                                                  if ((var14.field_i ^ -1) >= -1) {
                                                    if (var14.field_i != -20) {
                                                      if (-21 != var14.field_i) {
                                                        if (21 != var14.field_i) {
                                                          if (-23 == (var14.field_i ^ -1)) {
                                                            stackOut_130_0 = 1;
                                                            stackIn_132_0 = stackOut_130_0;
                                                            break L22;
                                                          } else {
                                                            stackOut_129_0 = 0;
                                                            stackIn_132_0 = stackOut_129_0;
                                                            break L22;
                                                          }
                                                        } else {
                                                          stackOut_127_0 = 1;
                                                          stackIn_132_0 = stackOut_127_0;
                                                          break L22;
                                                        }
                                                      } else {
                                                        stackOut_125_0 = 1;
                                                        stackIn_132_0 = stackOut_125_0;
                                                        break L22;
                                                      }
                                                    } else {
                                                      stackOut_123_0 = 1;
                                                      stackIn_132_0 = stackOut_123_0;
                                                      break L22;
                                                    }
                                                  } else {
                                                    stackOut_121_0 = 1;
                                                    stackIn_132_0 = stackOut_121_0;
                                                    break L22;
                                                  }
                                                }
                                                L23: {
                                                  var15 = stackIn_132_0;
                                                  if (var14.field_i == -23) {
                                                    var14.field_i = 23;
                                                    break L23;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                                L24: {
                                                  if (-22 != var14.field_i) {
                                                    break L24;
                                                  } else {
                                                    var14.field_i = 22;
                                                    break L24;
                                                  }
                                                }
                                                if (var15 != 0) {
                                                  L25: {
                                                    if (var14.field_R != 0) {
                                                      stackOut_141_0 = 0;
                                                      stackIn_142_0 = stackOut_141_0;
                                                      break L25;
                                                    } else {
                                                      stackOut_140_0 = 1;
                                                      stackIn_142_0 = stackOut_140_0;
                                                      break L25;
                                                    }
                                                  }
                                                  L26: {
                                                    L27: {
                                                      var16 = stackIn_142_0;
                                                      var14.field_R = ue.field_b[var14.field_i];
                                                      var14.field_B = rb.field_a[var14.field_i];
                                                      var14.field_l = 0;
                                                      if (19 == var14.field_i) {
                                                        break L27;
                                                      } else {
                                                        if (var14.field_i != 20) {
                                                          break L26;
                                                        } else {
                                                          break L27;
                                                        }
                                                      }
                                                    }
                                                    var14.field_B = 1;
                                                    var14.field_R = 0;
                                                    break L26;
                                                  }
                                                  if (1 != ((ak) this).field_k) {
                                                    break L21;
                                                  } else {
                                                    if (var14.field_R != 0) {
                                                      break L21;
                                                    } else {
                                                      if (var16 == 0) {
                                                        param0.a(2 * var9_ref.field_B + 10, var14, 2);
                                                        var11++;
                                                        break L21;
                                                      } else {
                                                        var14 = (on) (Object) var19.a((byte) 116);
                                                        continue L20;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14 = (on) (Object) var19.a((byte) 116);
                                                  continue L20;
                                                }
                                              }
                                            }
                                            var14 = (on) (Object) var19.a((byte) 116);
                                            continue L20;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var9_ref = (vn) (Object) param0.field_gb.a((byte) 116);
                                continue L14;
                              }
                            }
                          } else {
                            break L13;
                          }
                        }
                        L28: {
                          if (var8 != 0) {
                            break L28;
                          } else {
                            if (!param0.field_K.a(false)) {
                              param0.field_gb.a(param0.field_K.c(3), (byte) 3);
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                        }
                        if (var8 != 0) {
                          param0.field_A = param0.field_A + 1;
                          if (1 == param0.field_A + 1) {
                            break L12;
                          } else {
                            break L12;
                          }
                        } else {
                          break L12;
                        }
                      } else {
                        break L12;
                      }
                    }
                    L29: {
                      var8 = 1;
                      if (param0.field_n == 0) {
                        var8 = 0;
                        break L29;
                      } else {
                        if (((ak) this).field_k == 1) {
                          var8 = 1;
                          break L29;
                        } else {
                          var9_int = 0;
                          L30: while (true) {
                            if (param0.field_z.length <= var9_int) {
                              break L29;
                            } else {
                              var21 = param0.field_z[var9_int];
                              var22 = var21;
                              var22 = var21;
                              var11_ref_on = (on) (Object) var21.d(param3 + -91);
                              L31: while (true) {
                                if (var11_ref_on == null) {
                                  var9_int++;
                                  continue L30;
                                } else {
                                  L32: {
                                    if ((1 << var11_ref_on.field_i & hp.field_m) == 0) {
                                      break L32;
                                    } else {
                                      if (81920 > var11_ref_on.field_m) {
                                        break L32;
                                      } else {
                                        var8 = 0;
                                        break L29;
                                      }
                                    }
                                  }
                                  var11_ref_on = (on) (Object) var21.a((byte) 116);
                                  continue L31;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L33: {
                      if (var8 == 0) {
                        break L33;
                      } else {
                        var9_ref2 = (cl) (Object) param0.field_v.d(-120);
                        L34: while (true) {
                          if (var9_ref2 == null) {
                            break L33;
                          } else {
                            var22 = var9_ref2.field_p;
                            var11_ref_ee = (ee) (Object) var22.d(-125);
                            L35: while (true) {
                              if (var11_ref_ee == null) {
                                var9_ref2 = (cl) (Object) param0.field_v.a((byte) 116);
                                continue L34;
                              } else {
                                var11_ref_ee.field_m = var11_ref_ee.field_m + 256;
                                var11_ref_ee = (ee) (Object) var22.a((byte) 116);
                                continue L35;
                              }
                            }
                          }
                        }
                      }
                    }
                    var9_int = 0;
                    L36: while (true) {
                      if (param0.field_z.length <= var9_int) {
                        var9_ref = (vn) (Object) param0.field_K.d(-105);
                        L37: while (true) {
                          if (var9_ref == null) {
                            var9_ref = (vn) (Object) param0.field_gb.d(param3 + -13);
                            L38: while (true) {
                              if (var9_ref == null) {
                                L39: {
                                  if (var7.field_w > 0) {
                                    var7.field_w = var7.field_w - 1;
                                    break L39;
                                  } else {
                                    break L39;
                                  }
                                }
                                L40: {
                                  if (var7.field_H > 0) {
                                    var7.field_H = var7.field_H - 1;
                                    break L40;
                                  } else {
                                    break L40;
                                  }
                                }
                                L41: {
                                  if (0 >= var7.field_z) {
                                    break L41;
                                  } else {
                                    var7.field_z = var7.field_z - 1;
                                    break L41;
                                  }
                                }
                                L42: {
                                  if (var8 == 0) {
                                    break L42;
                                  } else {
                                    param0.field_n = param0.field_n - 1;
                                    if ((param0.field_n - 1) % 16 == 0) {
                                      L43: {
                                        if (1 == ((ak) this).field_k) {
                                          stackOut_244_0 = 13;
                                          stackIn_245_0 = stackOut_244_0;
                                          break L43;
                                        } else {
                                          stackOut_243_0 = 7;
                                          stackIn_245_0 = stackOut_243_0;
                                          break L43;
                                        }
                                      }
                                      var9_int = stackIn_245_0;
                                      var10_ref = null;
                                      var11 = 1;
                                      L44: while (true) {
                                        if (var11 > var9_int) {
                                          var11 = 0;
                                          L45: while (true) {
                                            if (-4 >= (var11 ^ -1)) {
                                              break L42;
                                            } else {
                                              var25 = param0.field_z[var11];
                                              var26 = var25;
                                              var26 = var25;
                                              var10_ref_on = (on) (Object) var25.d(-44);
                                              L46: while (true) {
                                                if (var10_ref_on == null) {
                                                  var11++;
                                                  continue L45;
                                                } else {
                                                  L47: {
                                                    if (-1 != (1 & var10_ref_on.field_N ^ -1)) {
                                                      break L47;
                                                    } else {
                                                      if (81920 >= var10_ref_on.field_m) {
                                                        break L47;
                                                      } else {
                                                        var10_ref_on.field_B = 7;
                                                        var10_ref_on.field_R = 0;
                                                        var10_ref_on.field_l = 0;
                                                        break L47;
                                                      }
                                                    }
                                                  }
                                                  var10_ref_on = (on) (Object) var25.a((byte) 116);
                                                  continue L46;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          var10_ref = new on(34 * var11 << -1599867576, 4096, 0, 0, 0);
                                          param0.field_z[2].a((nm) (Object) new on(34 * var11 << -1599867576, 4096, 0, 0, 0), (byte) 3);
                                          var10_ref.field_R = 2;
                                          var10_ref.field_B = 10;
                                          var11++;
                                          continue L44;
                                        }
                                      }
                                    } else {
                                      break L42;
                                    }
                                  }
                                }
                                L48: {
                                  if (-1 < (param0.field_k ^ -1)) {
                                    break L48;
                                  } else {
                                    var9_ref3 = (il) (Object) param0.field_C.d(-118);
                                    L49: while (true) {
                                      if (var9_ref3 == null) {
                                        param0.field_k = param0.field_k + 1;
                                        break L48;
                                      } else {
                                        var9_ref3.d(param3 + -2081170685);
                                        var9_ref3 = (il) (Object) param0.field_C.a((byte) 116);
                                        continue L49;
                                      }
                                    }
                                  }
                                }
                                var9_int = 0;
                                L50: while (true) {
                                  if (var9_int >= 8) {
                                    var9_ref4 = var7;
                                    var7.field_o = 0;
                                    var9_ref4.field_k = 0;
                                    var10 = 0;
                                    L51: while (true) {
                                      if (-4 >= (var10 ^ -1)) {
                                        L52: {
                                          if (-1 != (param0.field_L ^ -1)) {
                                            break L52;
                                          } else {
                                            if (param0.field_n == 0) {
                                              L53: {
                                                param0.field_P = 0;
                                                param0.field_r = param0.field_r + 1;
                                                param0.field_hb = param0.field_hb + 1;
                                                param0.field_t = param0.field_t + 1;
                                                if (1 != ((ak) this).field_k) {
                                                  break L53;
                                                } else {
                                                  param0.a(250, false, 65280, var7.field_m + -12800);
                                                  break L53;
                                                }
                                              }
                                              L54: {
                                                param0.field_qb = param0.field_qb + 1;
                                                if (param0.field_qb + 1 < ((ak) this).field_b.a(param3 + -125)) {
                                                  break L54;
                                                } else {
                                                  if (!((ak) this).field_b.field_c) {
                                                    if (((ak) this).field_k != 1) {
                                                      param0.field_Z = 7;
                                                      break L52;
                                                    } else {
                                                      param0.field_Z = 5;
                                                      break L52;
                                                    }
                                                  } else {
                                                    break L54;
                                                  }
                                                }
                                              }
                                              param0.field_Z = 0;
                                              param0.field_P = 0;
                                              break L52;
                                            } else {
                                              break L52;
                                            }
                                          }
                                        }
                                        if (param0.field_lb == null) {
                                          var10 = 0;
                                          var11 = 0;
                                          var12 = 0;
                                          var13 = (vn) (Object) param0.field_gb.d(-26);
                                          L55: while (true) {
                                            if (var13 == null) {
                                              L56: {
                                                if (var10 > 20) {
                                                  break L56;
                                                } else {
                                                  if (15 >= var11) {
                                                    break L7;
                                                  } else {
                                                    break L56;
                                                  }
                                                }
                                              }
                                              param0.a(ml.field_e, (byte) 75);
                                              break L7;
                                            } else {
                                              L57: {
                                                var12 = var13.field_I;
                                                if (var13.field_I <= var10) {
                                                  break L57;
                                                } else {
                                                  var10 = var12;
                                                  break L57;
                                                }
                                              }
                                              L58: {
                                                var12 = var13.field_B;
                                                if (var11 >= var13.field_B) {
                                                  break L58;
                                                } else {
                                                  var11 = var12;
                                                  break L58;
                                                }
                                              }
                                              var13 = (vn) (Object) param0.field_gb.a((byte) 116);
                                              continue L55;
                                            }
                                          }
                                        } else {
                                          break L7;
                                        }
                                      } else {
                                        var11_ref_on = (on) (Object) param0.field_z[var10].d(-49);
                                        L59: while (true) {
                                          if (var11_ref_on == null) {
                                            var10++;
                                            continue L51;
                                          } else {
                                            L60: {
                                              if ((var11_ref_on.field_N & 4) != 0) {
                                                var11_ref_on.a((byte) 119, true);
                                                break L60;
                                              } else {
                                                break L60;
                                              }
                                            }
                                            var11_ref_on = (on) (Object) param0.field_z[var10].a((byte) 116);
                                            continue L59;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var10_ref_ge = (ge) (Object) param0.field_pb.d(-119);
                                    L61: while (true) {
                                      if (var10_ref_ge == null) {
                                        L62: {
                                          var7.field_j = var7.field_j + var7.field_k / 8;
                                          if (var7.field_B > var7.field_j) {
                                            var7.field_j = var7.field_B;
                                            break L62;
                                          } else {
                                            break L62;
                                          }
                                        }
                                        L63: {
                                          if (-var7.field_u + var7.field_y < var7.field_j) {
                                            var7.field_j = -var7.field_u + var7.field_y;
                                            break L63;
                                          } else {
                                            break L63;
                                          }
                                        }
                                        L64: {
                                          if (var7.field_H > 0) {
                                            var10_ref_vn = (vn) (Object) param0.field_gb.d(-111);
                                            L65: while (true) {
                                              if (var10_ref_vn == null) {
                                                break L64;
                                              } else {
                                                L66: {
                                                  if (var10_ref_vn.field_j - -var10_ref_vn.field_u > var7.field_u / 2 + var7.field_j) {
                                                    if (-1 <= (var10_ref_vn.field_k ^ -1)) {
                                                      break L66;
                                                    } else {
                                                      var10_ref_vn.field_k = -var10_ref_vn.field_k;
                                                      break L66;
                                                    }
                                                  } else {
                                                    if (0 > var10_ref_vn.field_k) {
                                                      var10_ref_vn.field_k = -var10_ref_vn.field_k;
                                                      break L66;
                                                    } else {
                                                      var10_ref_vn = (vn) (Object) param0.field_gb.a((byte) 116);
                                                      continue L65;
                                                    }
                                                  }
                                                }
                                                var10_ref_vn = (vn) (Object) param0.field_gb.a((byte) 116);
                                                continue L65;
                                              }
                                            }
                                          } else {
                                            break L64;
                                          }
                                        }
                                        var10 = 0;
                                        L67: while (true) {
                                          if (param0.field_z.length <= var10) {
                                            var10_ref_vn = (vn) (Object) param0.field_gb.d(-122);
                                            L68: while (true) {
                                              L69: {
                                                if (var10_ref_vn == null) {
                                                  break L69;
                                                } else {
                                                  var11 = 0;
                                                  L70: while (true) {
                                                    L71: {
                                                      if (var11 >= 5) {
                                                        break L71;
                                                      } else {
                                                        if (!this.a(param0, param1, 8, -128, var10_ref_vn)) {
                                                          break L71;
                                                        } else {
                                                          var11++;
                                                          continue L70;
                                                        }
                                                      }
                                                    }
                                                    L72: {
                                                      if (!var10_ref_vn.b(0)) {
                                                        break L72;
                                                      } else {
                                                        L73: {
                                                          if ((var11 ^ -1) == -6) {
                                                            break L73;
                                                          } else {
                                                            if (var10_ref_vn.field_j < 0) {
                                                              break L73;
                                                            } else {
                                                              if (0 > var10_ref_vn.field_m) {
                                                                break L73;
                                                              } else {
                                                                if (param0.field_mb << 1595004136 >= var10_ref_vn.field_j) {
                                                                  break L72;
                                                                } else {
                                                                  break L73;
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
                                                        break L72;
                                                      }
                                                    }
                                                    if (!param0.field_gb.a(false)) {
                                                      var10_ref_vn = (vn) (Object) param0.field_gb.a((byte) 116);
                                                      continue L68;
                                                    } else {
                                                      break L69;
                                                    }
                                                  }
                                                }
                                              }
                                              var10_ref_vn = (vn) (Object) param0.field_K.d(-91);
                                              L74: while (true) {
                                                if (var10_ref_vn == null) {
                                                  var9_int++;
                                                  continue L50;
                                                } else {
                                                  var10_ref_vn.a(var7, 0);
                                                  var10_ref_vn = (vn) (Object) param0.field_K.a((byte) 116);
                                                  continue L74;
                                                }
                                              }
                                            }
                                          } else {
                                            var26_ref = param0.field_z[var10];
                                            var12_ref_on = (on) (Object) var26_ref.d(-38);
                                            L75: while (true) {
                                              if (var12_ref_on == null) {
                                                var10++;
                                                continue L67;
                                              } else {
                                                L76: {
                                                  if (0 == (var12_ref_on.field_N & 4)) {
                                                    break L76;
                                                  } else {
                                                    if (1 < var12_ref_on.field_P[var12_ref_on.field_C].field_t) {
                                                      var12_ref_on.field_j = var12_ref_on.field_j + var12_ref_on.field_k / 8;
                                                      var12_ref_on.field_m = var12_ref_on.field_m + var12_ref_on.field_o / 8;
                                                      break L76;
                                                    } else {
                                                      var12_ref_on = (on) (Object) var26_ref.a((byte) 116);
                                                      continue L75;
                                                    }
                                                  }
                                                }
                                                var12_ref_on = (on) (Object) var26_ref.a((byte) 116);
                                                continue L75;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        L77: {
                                          var10_ref_ge.field_j = var10_ref_ge.field_j + var10_ref_ge.field_k / 8;
                                          var10_ref_ge.field_m = var10_ref_ge.field_m + var10_ref_ge.field_o / 8;
                                          if (var10_ref_ge.field_m > 122880) {
                                            L78: {
                                              stackOut_268_0 = (j) param0;
                                              stackOut_268_1 = 16387;
                                              stackIn_270_0 = stackOut_268_0;
                                              stackIn_270_1 = stackOut_268_1;
                                              stackIn_269_0 = stackOut_268_0;
                                              stackIn_269_1 = stackOut_268_1;
                                              if (-51 > (param0.a(100, (byte) 62) ^ -1)) {
                                                stackOut_270_0 = (j) (Object) stackIn_270_0;
                                                stackOut_270_1 = stackIn_270_1;
                                                stackOut_270_2 = 4;
                                                stackIn_271_0 = stackOut_270_0;
                                                stackIn_271_1 = stackOut_270_1;
                                                stackIn_271_2 = stackOut_270_2;
                                                break L78;
                                              } else {
                                                stackOut_269_0 = (j) (Object) stackIn_269_0;
                                                stackOut_269_1 = stackIn_269_1;
                                                stackOut_269_2 = 5;
                                                stackIn_271_0 = stackOut_269_0;
                                                stackIn_271_1 = stackOut_269_1;
                                                stackIn_271_2 = stackOut_269_2;
                                                break L78;
                                              }
                                            }
                                            L79: {
                                              ((j) (Object) stackIn_271_0).b(stackIn_271_1, stackIn_271_2);
                                              if (r.field_A) {
                                                jc.a(var10_ref_ge.field_i, 4, (byte) -110);
                                                break L79;
                                              } else {
                                                break L79;
                                              }
                                            }
                                            var10_ref_ge.b((byte) 111);
                                            break L77;
                                          } else {
                                            if (!var7.a((no) (Object) var10_ref_ge, (byte) 25)) {
                                              break L77;
                                            } else {
                                              L80: {
                                                var10_ref_ge.b((byte) 111);
                                                if (!var10_ref_ge.b(false)) {
                                                  stackOut_278_0 = 0;
                                                  stackIn_279_0 = stackOut_278_0;
                                                  break L80;
                                                } else {
                                                  stackOut_277_0 = 1;
                                                  stackIn_279_0 = stackOut_277_0;
                                                  break L80;
                                                }
                                              }
                                              L81: {
                                                var11 = stackIn_279_0;
                                                if (param2 == null) {
                                                  break L81;
                                                } else {
                                                  param2.a((nm) (Object) var10_ref_ge, (byte) 3);
                                                  break L81;
                                                }
                                              }
                                              L82: {
                                                if ((((ak) this).field_k ^ -1) != -2) {
                                                  break L82;
                                                } else {
                                                  L83: {
                                                    stackOut_282_0 = var11;
                                                    stackIn_284_0 = stackOut_282_0;
                                                    stackIn_283_0 = stackOut_282_0;
                                                    if ((var10_ref_ge.field_i ^ -1) != -14) {
                                                      stackOut_284_0 = stackIn_284_0;
                                                      stackOut_284_1 = 0;
                                                      stackIn_285_0 = stackOut_284_0;
                                                      stackIn_285_1 = stackOut_284_1;
                                                      break L83;
                                                    } else {
                                                      stackOut_283_0 = stackIn_283_0;
                                                      stackOut_283_1 = 1;
                                                      stackIn_285_0 = stackOut_283_0;
                                                      stackIn_285_1 = stackOut_283_1;
                                                      break L83;
                                                    }
                                                  }
                                                  L84: {
                                                    var11 = stackIn_285_0 | stackIn_285_1;
                                                    stackOut_285_0 = (j) param0;
                                                    stackIn_287_0 = stackOut_285_0;
                                                    stackIn_286_0 = stackOut_285_0;
                                                    if (var11 != 0) {
                                                      stackOut_287_0 = (j) (Object) stackIn_287_0;
                                                      stackOut_287_1 = 100;
                                                      stackIn_288_0 = stackOut_287_0;
                                                      stackIn_288_1 = stackOut_287_1;
                                                      break L84;
                                                    } else {
                                                      stackOut_286_0 = (j) (Object) stackIn_286_0;
                                                      stackOut_286_1 = 500;
                                                      stackIn_288_0 = stackOut_286_0;
                                                      stackIn_288_1 = stackOut_286_1;
                                                      break L84;
                                                    }
                                                  }
                                                  ((j) (Object) stackIn_288_0).a(stackIn_288_1, var7, param3 + 2);
                                                  if (var11 != 0) {
                                                    param0.field_u = 0;
                                                    param0.field_hb = 0;
                                                    param0.field_N = param0.field_N + 1;
                                                    break L82;
                                                  } else {
                                                    param0.field_u = param0.field_u + 1;
                                                    param0.field_N = 0;
                                                    break L82;
                                                  }
                                                }
                                              }
                                              L85: {
                                                if (!r.field_A) {
                                                  break L85;
                                                } else {
                                                  jc.a(var10_ref_ge.field_i, 3, (byte) -115);
                                                  break L85;
                                                }
                                              }
                                              L86: {
                                                if (param1 != null) {
                                                  param1.a((nm) (Object) new qc(3, var10_ref_ge.field_i), (byte) 3);
                                                  break L86;
                                                } else {
                                                  break L86;
                                                }
                                              }
                                              L87: {
                                                L88: {
                                                  stackOut_296_0 = (j) param0;
                                                  stackIn_300_0 = stackOut_296_0;
                                                  stackIn_297_0 = stackOut_296_0;
                                                  if (1 < ((ak) this).field_k) {
                                                    break L88;
                                                  } else {
                                                    stackOut_297_0 = (j) (Object) stackIn_297_0;
                                                    stackIn_300_0 = stackOut_297_0;
                                                    stackIn_298_0 = stackOut_297_0;
                                                    if ((var10_ref_ge.field_i ^ -1) == -14) {
                                                      break L88;
                                                    } else {
                                                      stackOut_298_0 = (j) (Object) stackIn_298_0;
                                                      stackIn_301_0 = stackOut_298_0;
                                                      stackIn_299_0 = stackOut_298_0;
                                                      if (var11 == 0) {
                                                        stackOut_301_0 = (j) (Object) stackIn_301_0;
                                                        stackOut_301_1 = eh.field_e;
                                                        stackIn_302_0 = stackOut_301_0;
                                                        stackIn_302_1 = stackOut_301_1;
                                                        break L87;
                                                      } else {
                                                        stackOut_299_0 = (j) (Object) stackIn_299_0;
                                                        stackIn_300_0 = stackOut_299_0;
                                                        break L88;
                                                      }
                                                    }
                                                  }
                                                }
                                                stackOut_300_0 = (j) (Object) stackIn_300_0;
                                                stackOut_300_1 = ml.field_e;
                                                stackIn_302_0 = stackOut_300_0;
                                                stackIn_302_1 = stackOut_300_1;
                                                break L87;
                                              }
                                              ((j) (Object) stackIn_302_0).a((String[]) (Object) stackIn_302_1, (byte) 75);
                                              break L77;
                                            }
                                          }
                                        }
                                        var10_ref_ge = (ge) (Object) param0.field_pb.a((byte) 116);
                                        continue L61;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L89: {
                                  var9_ref.field_E.a(-7255, var9_ref.field_j + var9_ref.field_u);
                                  var9_ref.field_y.a(-7255, var9_ref.field_m - -var9_ref.field_u);
                                  if (var9_ref.field_J > 0) {
                                    var9_ref.field_J = var9_ref.field_J - 1;
                                    break L89;
                                  } else {
                                    break L89;
                                  }
                                }
                                L90: {
                                  if ((var9_ref.field_v ^ -1) < -1) {
                                    var9_ref.field_v = var9_ref.field_v - 1;
                                    break L90;
                                  } else {
                                    break L90;
                                  }
                                }
                                var9_ref = (vn) (Object) param0.field_gb.a((byte) 116);
                                continue L38;
                              }
                            }
                          } else {
                            L91: {
                              if (var9_ref.field_J <= 0) {
                                break L91;
                              } else {
                                var9_ref.field_J = var9_ref.field_J - 1;
                                break L91;
                              }
                            }
                            L92: {
                              if (-1 > (var9_ref.field_v ^ -1)) {
                                var9_ref.field_v = var9_ref.field_v - 1;
                                break L92;
                              } else {
                                break L92;
                              }
                            }
                            var9_ref = (vn) (Object) param0.field_K.a((byte) 116);
                            continue L37;
                          }
                        }
                      } else {
                        var23 = param0.field_z[var9_int];
                        var11_ref_on = (on) (Object) var23.d(param3 ^ -42);
                        L93: while (true) {
                          if (var11_ref_on == null) {
                            var9_int++;
                            continue L36;
                          } else {
                            L94: {
                              if (var8 == 0) {
                                break L94;
                              } else {
                                if ((5 & var11_ref_on.field_N) != 0) {
                                  break L94;
                                } else {
                                  var11_ref_on.field_m = var11_ref_on.field_m + 256;
                                  break L94;
                                }
                              }
                            }
                            L95: {
                              if (0 > var11_ref_on.field_R) {
                                break L95;
                              } else {
                                var11_ref_on.field_l = var11_ref_on.field_l + 1;
                                if (-17 != (var11_ref_on.field_l + 1 ^ -1)) {
                                  break L95;
                                } else {
                                  var11_ref_on.field_B = 0;
                                  var11_ref_on.field_l = 0;
                                  if (0 == var11_ref_on.field_R) {
                                    L96: {
                                      var11_ref_on.b((byte) 111);
                                      if (-1 != (1 << var11_ref_on.field_i & hp.field_m ^ -1)) {
                                        param0.field_L = param0.field_L - 1;
                                        param0.field_m = param0.field_m + 1;
                                        param0.field_Q = param0.field_Q + 1;
                                        break L96;
                                      } else {
                                        break L96;
                                      }
                                    }
                                    if (!r.field_A) {
                                      break L95;
                                    } else {
                                      jc.a(var11_ref_on.field_N, 1, (byte) -95);
                                      break L95;
                                    }
                                  } else {
                                    L97: {
                                      if (var11_ref_on.field_i == 0) {
                                        param0.field_L = param0.field_L + 1;
                                        break L97;
                                      } else {
                                        break L97;
                                      }
                                    }
                                    var11_ref_on.field_i = var11_ref_on.field_R;
                                    var11_ref_on.field_R = -1;
                                    break L95;
                                  }
                                }
                              }
                            }
                            if ((4 & var11_ref_on.field_N) != 0) {
                              L98: {
                                var11_ref_on.a((byte) 58, true);
                                var11_ref_on.field_S = var11_ref_on.field_S + 1;
                                var11_ref_on.field_J = var11_ref_on.field_J + 1;
                                var24 = var11_ref_on.field_P[var11_ref_on.field_C];
                                if (var24.field_t == var11_ref_on.field_S) {
                                  var11_ref_on.f(105);
                                  break L98;
                                } else {
                                  break L98;
                                }
                              }
                              var11_ref_on = (on) (Object) var23.a((byte) 116);
                              continue L93;
                            } else {
                              var11_ref_on = (on) (Object) var23.a((byte) 116);
                              continue L93;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (param0.field_Z != 0) {
                      if (-2 == param0.field_Z) {
                        L99: {
                          if (-1 == param0.field_P) {
                            L100: {
                              if (-2 == (((ak) this).field_k ^ -1)) {
                                param0.field_lb = null;
                                param0.field_fb = ((ak) this).field_b.a((byte) 115, param0.field_qb);
                                param0.field_i = 100;
                                break L100;
                              } else {
                                break L100;
                              }
                            }
                            if (param1 == null) {
                              break L99;
                            } else {
                              param1.a((nm) (Object) new qc(14), (byte) 3);
                              break L99;
                            }
                          } else {
                            break L99;
                          }
                        }
                        L101: {
                          if (param0.field_r != 0) {
                            var8 = 0;
                            L102: while (true) {
                              if (var8 <= -4) {
                                break L101;
                              } else {
                                var9 = (on) (Object) param0.field_z[var8].d(-30);
                                L103: while (true) {
                                  if (var9 == null) {
                                    var8++;
                                    continue L102;
                                  } else {
                                    L104: {
                                      if (-1 > var9.field_R) {
                                        break L104;
                                      } else {
                                        var9.field_l = var9.field_l + 1;
                                        if ((var9.field_l + 1 ^ -1) == -17) {
                                          var9.field_B = 0;
                                          var9.field_l = 0;
                                          var9.field_R = -1;
                                          break L104;
                                        } else {
                                          break L104;
                                        }
                                      }
                                    }
                                    var9 = (on) (Object) param0.field_z[var8].a((byte) 116);
                                    continue L103;
                                  }
                                }
                              }
                            }
                          } else {
                            break L101;
                          }
                        }
                        L105: {
                          var8 = 0;
                          if (((ak) this).field_k == 1) {
                            var8 = 125;
                            break L105;
                          } else {
                            if (param0.field_r == 0) {
                              var8 = 75;
                              break L105;
                            } else {
                              var8 = 40;
                              break L105;
                            }
                          }
                        }
                        param0.field_P = param0.field_P + 1;
                        if (param0.field_P + 1 == var8) {
                          param0.field_P = 0;
                          param0.field_Z = 4;
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        if (-5 != param0.field_Z) {
                          if (param0.field_Z == 3) {
                            param0.field_P = param0.field_P + 1;
                            if (-351 == param0.field_P + 1) {
                              param0.field_P = 0;
                              param0.field_Z = 8;
                              break L7;
                            } else {
                              break L7;
                            }
                          } else {
                            if (param0.field_Z == 5) {
                              param0.field_P = param0.field_P + 1;
                              if (param0.field_P + 1 != 350) {
                                break L7;
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
                          L106: {
                            if (-1 == (param0.field_P ^ -1)) {
                              if (param1 == null) {
                                break L106;
                              } else {
                                param1.a((nm) (Object) new qc(13), (byte) 3);
                                break L106;
                              }
                            } else {
                              break L106;
                            }
                          }
                          L107: {
                            param0.field_P = param0.field_P + 1;
                            if (-76 == param0.field_P + 1) {
                              break L107;
                            } else {
                              if (-2 != ((ak) this).field_k) {
                                break L7;
                              } else {
                                if (25 != param0.field_P) {
                                  break L7;
                                } else {
                                  break L107;
                                }
                              }
                            }
                          }
                          L108: {
                            param0.field_lb = lq.field_c;
                            stackOut_53_0 = (j) param0;
                            stackIn_55_0 = stackOut_53_0;
                            stackIn_54_0 = stackOut_53_0;
                            if (param0.field_i > 25) {
                              stackOut_55_0 = (j) (Object) stackIn_55_0;
                              stackOut_55_1 = 25;
                              stackIn_56_0 = stackOut_55_0;
                              stackIn_56_1 = stackOut_55_1;
                              break L108;
                            } else {
                              stackOut_54_0 = (j) (Object) stackIn_54_0;
                              stackOut_54_1 = param0.field_i;
                              stackIn_56_0 = stackOut_54_0;
                              stackIn_56_1 = stackOut_54_1;
                              break L108;
                            }
                          }
                          ((j) (Object) stackIn_56_0).field_i = stackIn_56_1;
                          param0.field_Z = 2;
                          param0.field_P = 0;
                          break L7;
                        }
                      }
                    } else {
                      var8_ref_vl__ = new vl[3];
                      var9_int = 0;
                      L109: while (true) {
                        if (3 <= var9_int) {
                          L110: {
                            var18 = new vl();
                            var10 = param0.field_ab.field_p;
                            ((ak) this).field_b.a(new ga(), param0.field_ab, var18, param0.field_qb, (byte) -118, var8_ref_vl__);
                            param0.a(var18, param3 + 9, var8_ref_vl__);
                            param0.a(26496, false);
                            if (-2 == (((ak) this).field_k ^ -1)) {
                              if (0 >= param0.field_r) {
                                break L110;
                              } else {
                                L111: {
                                  if (param0.field_ab.field_p == 0) {
                                    break L111;
                                  } else {
                                    if (var10 != param0.field_ab.field_p) {
                                      break L111;
                                    } else {
                                      break L110;
                                    }
                                  }
                                }
                                param0.field_tb = true;
                                break L110;
                              }
                            } else {
                              break L110;
                            }
                          }
                          L112: {
                            if (param0.field_r == 0) {
                              break L112;
                            } else {
                              var11 = 0;
                              L113: while (true) {
                                if (var11 >= 3) {
                                  break L112;
                                } else {
                                  var12_ref_on = (on) (Object) var8_ref_vl__[var11].d(param3 ^ -107);
                                  L114: while (true) {
                                    if (var12_ref_on != null) {
                                      var12_ref_on.field_l = 0;
                                      var12_ref_on.field_B = 5;
                                      var12_ref_on.field_R = var12_ref_on.field_i;
                                      var12_ref_on = (on) (Object) var8_ref_vl__[var11].a((byte) 116);
                                      continue L114;
                                    } else {
                                      var11++;
                                      continue L113;
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
                          continue L109;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                L115: {
                  if (var6.b(false)) {
                    break L115;
                  } else {
                    var6.b((byte) 111);
                    break L115;
                  }
                }
                var6 = (ul) (Object) param0.field_nb.a((byte) 116);
                continue L6;
              }
            }
          } else {
            L116: {
              if (var5.c((byte) 69)) {
                break L116;
              } else {
                var5.b((byte) 111);
                break L116;
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
        if (param0 != -19537) {
            field_e = null;
        }
    }

    private final void a(vn param0, int param1, j param2) {
        int var4 = 0;
        vl var5 = null;
        on var6 = null;
        int var7 = BrickABrac.field_J ? 1 : 0;
        hg.a(param1);
        for (var4 = -1 + param2.field_z.length; var4 > -1; var4--) {
            var5 = param2.field_z[var4];
            var6 = (on) (Object) var5.f(param1 ^ -1);
            while (var6 != null) {
                boolean discarded$0 = var6.a((no) (Object) param0, (byte) 119);
                var6 = (on) (Object) var5.b(-126);
            }
            if (dj.field_c != null) {
                break;
            }
        }
        boolean discarded$1 = param2.field_yb.a((no) (Object) param0, (byte) 110);
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
        ge var4 = null;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 < 81) {
            ((ak) this).field_c = true;
        }
        j var3 = ((ak) this).field_l[param1];
        while (var3.field_X <= var3.field_kb.field_n) {
            var4 = (ge) var3.field_kb.a(var3.field_X, 67);
            // if_icmpgt L112
            var4.a(var3, (byte) 99);
            var3.field_X = var3.field_X + 1;
        }
    }

    private final boolean a(j param0, vl param1, int param2, int param3, vn param4) {
        int var7 = 0;
        int var8 = 0;
        on var9 = null;
        on var10 = null;
        int stackIn_92_0 = 0;
        int stackOut_90_0;
        int stackOut_91_0;
        var8 = BrickABrac.field_J ? 1 : 0;
        param4.field_j = param4.field_j + param4.field_k / param2;
        param4.field_m = param4.field_m + param4.field_o / param2;
        if (122880 >= param4.field_m) {
          this.a(param4, -1, param0);
          if (param3 <= -125) {
            L0: {
              if (null == dj.field_c) {
                break L0;
              } else {
                L1: {
                  if (r.field_A) {
                    if (wl.field_N) {
                      if (cm.field_s) {
                        break L1;
                      } else {
                        if (-40 != (param4.field_C ^ -1)) {
                          break L1;
                        } else {
                          jc.a(0, 6, (byte) -108);
                          break L1;
                        }
                      }
                    } else {
                      param4.field_C = 0;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (39 != param4.field_C) {
                    break L2;
                  } else {
                    if (param1 != null) {
                      param1.a((nm) (Object) new qc(5), (byte) 3);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                if ((Object) (Object) param0.field_yb == (Object) (Object) dj.field_c) {
                  if (-1 > (param0.field_yb.field_z ^ -1)) {
                    L3: {
                      if (param1 != null) {
                        param1.a((nm) (Object) new qc(10), (byte) 3);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    param0.field_yb.a((byte) 53, param0, (no) (Object) param4);
                    param4.field_E.field_j = -1;
                    param4.field_C = 0;
                    param4.field_y.field_j = -1;
                    param0.field_K.a((nm) (Object) param4, (byte) 3);
                    return false;
                  } else {
                    L4: {
                      if (param1 == null) {
                        break L4;
                      } else {
                        param1.a((nm) (Object) new qc(0), (byte) 3);
                        break L4;
                      }
                    }
                    param0.field_yb.a((byte) 53, param0, (no) (Object) param4);
                    param4.field_B = 0;
                    break L0;
                  }
                } else {
                  L5: {
                    dj.field_c.a((byte) 53, param0, (no) (Object) param4);
                    var9 = (on) (Object) dj.field_c;
                    if (param1 != null) {
                      L6: {
                        var7 = 1;
                        if (-1 == (var9.field_N & 1)) {
                          if (-29 != var9.field_i) {
                            if (var9.field_i != -26) {
                              L7: {
                                if (-2 == var9.field_i) {
                                  break L7;
                                } else {
                                  if ((var9.field_i ^ -1) == -22) {
                                    break L7;
                                  } else {
                                    if (22 != var9.field_i) {
                                      L8: {
                                        if (26 != var9.field_i) {
                                          break L8;
                                        } else {
                                          if (var9.field_R == 27) {
                                            break L8;
                                          } else {
                                            var7 = 11;
                                            break L6;
                                          }
                                        }
                                      }
                                      L9: {
                                        if (19 != var9.field_i) {
                                          break L9;
                                        } else {
                                          if ((sh.field_a ^ -1) != -2) {
                                            var7 = 11;
                                            break L6;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if ((var9.field_i ^ -1) != -21) {
                                          break L10;
                                        } else {
                                          if (sh.field_a == 2) {
                                            break L10;
                                          } else {
                                            var7 = 11;
                                            break L6;
                                          }
                                        }
                                      }
                                      if ((var9.field_i ^ -1) != -28) {
                                        break L6;
                                      } else {
                                        if (var9.field_R == 26) {
                                          break L6;
                                        } else {
                                          var7 = 12;
                                          break L6;
                                        }
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var7 = 11;
                              break L6;
                            } else {
                              var7 = 9;
                              break L6;
                            }
                          } else {
                            var7 = 8;
                            break L6;
                          }
                        } else {
                          var7 = 2;
                          break L6;
                        }
                      }
                      L11: {
                        if (0 == param4.field_J) {
                          break L11;
                        } else {
                          if (0 == (1 << var9.field_i & sg.field_n)) {
                            break L5;
                          } else {
                            break L11;
                          }
                        }
                      }
                      param1.a((nm) (Object) new qc(var7), (byte) 3);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (param4.field_J != 0) {
                    break L0;
                  } else {
                    if (var9.field_R != 0) {
                      break L0;
                    } else {
                      L12: {
                        if (1 != ((ak) this).field_k) {
                          break L12;
                        } else {
                          param0.a(10 - -param4.field_B, var9, 2);
                          break L12;
                        }
                      }
                      param4.field_B = param4.field_B + 1;
                      break L0;
                    }
                  }
                }
              }
            }
            L13: {
              L14: {
                this.a(param4, -1, param0);
                if (dj.field_c == null) {
                  break L14;
                } else {
                  if (param4.field_J != 0) {
                    if ((Object) (Object) dj.field_c == (Object) (Object) param0.field_yb) {
                      return true;
                    } else {
                      var10 = (on) (Object) dj.field_c;
                      if ((1 & var10.field_N) == 0) {
                        break L14;
                      } else {
                        stackOut_90_0 = 1;
                        stackIn_92_0 = stackOut_90_0;
                        break L13;
                      }
                    }
                  } else {
                    return true;
                  }
                }
              }
              stackOut_91_0 = 0;
              stackIn_92_0 = stackOut_91_0;
              break L13;
            }
            return stackIn_92_0 != 0;
          } else {
            return false;
          }
        } else {
          L15: {
            param4.b((byte) 111);
            if (param1 == null) {
              break L15;
            } else {
              param1.a((nm) (Object) new qc(7), (byte) 3);
              break L15;
            }
          }
          L16: {
            if (!param0.field_gb.a(false)) {
              break L16;
            } else {
              if (param0.field_K.a(false)) {
                L17: {
                  if (1 == ((ak) this).field_k) {
                    L18: {
                      if (!r.field_A) {
                        break L18;
                      } else {
                        if (0 != ((ak) this).field_b.field_b.field_h) {
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
                return false;
              } else {
                break L16;
              }
            }
          }
          param0.b(16387, 2);
          return false;
        }
    }

    final boolean b(int param0) {
        if (param0 < 75) {
            field_e = null;
        }
        int var2 = ((((ak) this).field_g | ((ak) this).field_a | ((ak) this).field_i) ^ -1) & -1 + (1 << ((ak) this).field_k);
        if (var2 != 0) {
            // ifeq L98
            ((ak) this).field_h = ed.b(9, var2 + -1);
            ((ak) this).field_a = ((ak) this).field_a | 1 << ((ak) this).field_h;
            ((ak) this).a(false);
        } else {
            ((ak) this).a(false);
        }
        return ((ak) this).field_c;
    }

    ak(String[] param0, int param1, oi param2, int[] param3, int[] param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        vo stackIn_6_0 = null;
        vo stackIn_7_0 = null;
        vo stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackOut_2_0;
        int stackOut_1_0;
        vo stackOut_5_0;
        vo stackOut_7_0;
        int stackOut_7_1;
        vo stackOut_6_0;
        int stackOut_6_1;
        L0: {
          ((ak) this).field_k = param0.length;
          ((ak) this).field_f = param0;
          ((ak) this).field_b = param2;
          ((ak) this).field_l = new j[((ak) this).field_k];
          if (((ak) this).field_k >= 2) {
            stackOut_2_0 = 306;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 510;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var6 = stackIn_3_0;
        var7 = 0;
        var8 = 0;
        L1: while (true) {
          if (((ak) this).field_k <= var8) {
            ((ak) this).field_m = new int[((ak) this).field_k];
            ((ak) this).field_h = -1;
          } else {
            L2: {
              ((ak) this).field_l[var8] = new j(var6, var8 * 30, var7, param3[var8], param4[var8]);
              stackOut_5_0 = ((ak) this).field_l[var8].field_yb;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (1 < ((ak) this).field_k) {
                stackOut_7_0 = (vo) (Object) stackIn_7_0;
                stackOut_7_1 = 102400;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L2;
              } else {
                stackOut_6_0 = (vo) (Object) stackIn_6_0;
                stackOut_6_1 = 114688;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L2;
              }
            }
            ((vo) (Object) stackIn_8_0).field_m = stackIn_8_1;
            if ((param1 & 1 << var8) != 0) {
              var7++;
              var8++;
              continue L1;
            } else {
              var8++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Create unrated game";
    }
}
