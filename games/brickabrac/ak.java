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
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        ge var8 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 <= -39) {
                break L1;
              } else {
                this.c(86);
                break L1;
              }
            }
            var8 = (ge) ((Object) param2.d(-44));
            L2: while (true) {
              if (var8 == null) {
                break L0;
              } else {
                stackIn_6_0 = this.field_k;
                stackIn_6_1 = 1;
                L3: {
                  L4: {
                    if (stackIn_6_0 == stackIn_6_1) {
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
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("ak.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
    }

    final int a(byte param0) {
        boolean discarded$1 = false;
        int var2;
        int var3;
        int var4;
        vn var5;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          var2 = 0;
          if (param0 == -92) {
            break L0;
          } else {
            var5 = (vn) null;
            discarded$1 = this.a((j) null, (vl) null, -18, 53, (vn) null);
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
        if (param0) {
            this.c(-32);
        }
        this.field_c = true;
    }

    final int c(int param0) {
        int var2;
        int var3;
        int var4;
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
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        on dupTemp$4 = null;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        j stackIn_55_0 = null;
        j stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_132_0 = 0;
        int stackIn_142_0 = 0;
        j stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        j stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        int stackIn_156_2 = 0;
        j stackIn_158_0 = null;
        j stackIn_159_0 = null;
        String[] stackIn_159_1 = null;
        int stackIn_245_0 = 0;
        j stackIn_270_0 = null;
        int stackIn_270_1 = 0;
        j stackIn_271_0 = null;
        int stackIn_271_1 = 0;
        int stackIn_271_2 = 0;
        int stackIn_279_0 = 0;
        int stackIn_284_0 = 0;
        int stackIn_285_0 = 0;
        int stackIn_285_1 = 0;
        j stackIn_287_0 = null;
        j stackIn_288_0 = null;
        int stackIn_288_1 = 0;
        j stackIn_300_0 = null;
        j stackIn_302_0 = null;
        String[] stackIn_302_1 = null;
        RuntimeException stackIn_388_0 = null;
        StringBuilder stackIn_388_1 = null;
        RuntimeException stackIn_389_0 = null;
        StringBuilder stackIn_389_1 = null;
        String stackIn_389_2 = null;
        StringBuilder stackIn_391_1 = null;
        StringBuilder stackIn_392_1 = null;
        String stackIn_392_2 = null;
        StringBuilder stackIn_394_1 = null;
        StringBuilder stackIn_395_1 = null;
        String stackIn_395_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        kc var5 = null;
        RuntimeException var5_ref = null;
        ul var6 = null;
        vo var7 = null;
        int var8 = 0;
        vl[] var8_ref_vl__ = null;
        vn var9 = null;
        int var9_int = 0;
        cl var9_ref = null;
        il var9_ref2 = null;
        vo var9_ref3 = null;
        on var9_ref4 = null;
        Object var10_ref = null;
        on var10_ref_on = null;
        int var10 = 0;
        ge var10_ref_ge = null;
        vn var10_ref_vn = null;
        Object var11_ref = null;
        int var11 = 0;
        on var11_ref_on = null;
        ee var11_ref_ee = null;
        Object var12_ref = null;
        int var12 = 0;
        on var12_ref_on = null;
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
                  fieldTemp$0 = param0.field_i - 1;
                  param0.field_i = param0.field_i - 1;
                  if (-1 <= (fieldTemp$0 ^ -1)) {
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
                fieldTemp$1 = param0.field_ib - 1;
                param0.field_ib = param0.field_ib - 1;
                if (0 != fieldTemp$1) {
                  break L5;
                } else {
                  param0.b(16387, 0);
                  break L5;
                }
              }
            }
            var5 = (kc) ((Object) param0.field_x.d(-58));
            L6: while (true) {
              if (var5 == null) {
                var6 = (ul) ((Object) param0.field_nb.d(-85));
                L7: while (true) {
                  if (var6 == null) {
                    L8: {
                      L9: {
                        var7 = param0.field_yb;
                        if (-3 == (param0.field_Z ^ -1)) {
                          L10: {
                            if (param1 == null) {
                              break L10;
                            } else {
                              if (0 == (3 & param0.field_db)) {
                                break L10;
                              } else {
                                if (3 != param0.field_db) {
                                  param1.a(new qc(4), (byte) 3);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          L11: {
                            if (0 < var7.field_w) {
                              param0.field_db = param0.field_db ^ 3;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          L12: {
                            if ((param0.field_db & 2) == 0) {
                              break L12;
                            } else {
                              var7.field_k = 2048;
                              break L12;
                            }
                          }
                          L13: {
                            if (-1 != (param0.field_db & 1 ^ -1)) {
                              var7.field_k = var7.field_k - 2048;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            if ((param0.field_db & 4) != 0) {
                              L15: {
                                var8 = 0;
                                if (!param0.field_gb.a(false)) {
                                  var9 = (vn) ((Object) param0.field_gb.d(-76));
                                  L16: while (true) {
                                    if (var9 == null) {
                                      break L15;
                                    } else {
                                      L17: {
                                        if (40 > var9.field_C) {
                                          break L17;
                                        } else {
                                          L18: {
                                            if (param1 != null) {
                                              param1.a(new qc(6), (byte) 3);
                                              break L18;
                                            } else {
                                              break L18;
                                            }
                                          }
                                          var8 = 1;
                                          var9.field_C = 0;
                                          param0.field_x.a(new kc(var9.field_j, var9.field_m), (byte) 3);
                                          param0.field_l = 0;
                                          var20 = new no(var9.field_u + var9.field_j, var9.field_u + var9.field_m, 0, 0, 15360, 0);
                                          var11 = 0;
                                          var12 = 0;
                                          L19: while (true) {
                                            if (param0.field_z.length <= var12) {
                                              L20: {
                                                stackIn_155_0 = (j) (param0);

                                                stackIn_155_1 = 16387;

                                                if (-1 > (var11 ^ -1)) {
                                                  stackIn_156_0 = (j) ((Object) stackIn_155_0);
                                                  stackIn_156_1 = stackIn_155_1;
                                                  stackIn_156_2 = 1;
                                                  break L20;
                                                } else {
                                                  stackIn_156_0 = (j) ((Object) stackIn_155_0);
                                                  stackIn_156_1 = stackIn_155_1;
                                                  stackIn_156_2 = 6;
                                                  break L20;
                                                }
                                              }
                                              L21: {
                                                ((j) (Object) stackIn_156_0).b(stackIn_156_1, stackIn_156_2);
                                                stackIn_158_0 = (j) (param0);

                                                if (-1 > (var11 ^ -1)) {
                                                  stackIn_159_0 = (j) ((Object) stackIn_158_0);
                                                  stackIn_159_1 = ml.field_e;
                                                  break L21;
                                                } else {
                                                  stackIn_159_0 = (j) ((Object) stackIn_158_0);
                                                  stackIn_159_1 = eh.field_e;
                                                  break L21;
                                                }
                                              }
                                              ((j) (Object) stackIn_159_0).a(stackIn_159_1, (byte) 75);
                                              break L17;
                                            } else {
                                              var19 = param0.field_z[var12];
                                              var21 = var19;
                                              var22 = var21;
                                              var21 = var19;
                                              var14 = (on) ((Object) var19.d(-78));
                                              L22: while (true) {
                                                if (var14 == null) {
                                                  var12++;
                                                  continue L19;
                                                } else {
                                                  L23: {
                                                    if (!var14.a(var20, false)) {
                                                      break L23;
                                                    } else {
                                                      L24: {
                                                        if ((var14.field_i ^ -1) >= -1) {
                                                          if ((var14.field_i ^ -1) != -20) {
                                                            if (-21 != (var14.field_i ^ -1)) {
                                                              if (21 != var14.field_i) {
                                                                if (-23 == (var14.field_i ^ -1)) {
                                                                  stackIn_132_0 = 1;
                                                                  break L24;
                                                                } else {
                                                                  stackIn_132_0 = 0;
                                                                  break L24;
                                                                }
                                                              } else {
                                                                stackIn_132_0 = 1;
                                                                break L24;
                                                              }
                                                            } else {
                                                              stackIn_132_0 = 1;
                                                              break L24;
                                                            }
                                                          } else {
                                                            stackIn_132_0 = 1;
                                                            break L24;
                                                          }
                                                        } else {
                                                          stackIn_132_0 = 1;
                                                          break L24;
                                                        }
                                                      }
                                                      L25: {
                                                        var15 = stackIn_132_0;
                                                        if ((var14.field_i ^ -1) == -23) {
                                                          var14.field_i = 23;
                                                          break L25;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                      L26: {
                                                        if (-22 != (var14.field_i ^ -1)) {
                                                          break L26;
                                                        } else {
                                                          var14.field_i = 22;
                                                          break L26;
                                                        }
                                                      }
                                                      if (var15 != 0) {
                                                        L27: {
                                                          if (var14.field_R != 0) {
                                                            stackIn_142_0 = 0;
                                                            break L27;
                                                          } else {
                                                            stackIn_142_0 = 1;
                                                            break L27;
                                                          }
                                                        }
                                                        L28: {
                                                          L29: {
                                                            var16 = stackIn_142_0;
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
                                                        if (1 != this.field_k) {
                                                          break L23;
                                                        } else {
                                                          if (var14.field_R != 0) {
                                                            break L23;
                                                          } else {
                                                            if (var16 == 0) {
                                                              param0.a(2 * var9.field_B + 10, var14, 2);
                                                              var11++;
                                                              break L23;
                                                            } else {
                                                              break L23;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  var14 = (on) ((Object) var19.a((byte) 116));
                                                  continue L22;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var9 = (vn) ((Object) param0.field_gb.a((byte) 116));
                                      continue L16;
                                    }
                                  }
                                } else {
                                  break L15;
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
                                fieldTemp$2 = param0.field_A + 1;
                                param0.field_A = param0.field_A + 1;
                                if (1 == fieldTemp$2) {
                                  break L14;
                                } else {
                                  break L14;
                                }
                              } else {
                                break L14;
                              }
                            } else {
                              break L14;
                            }
                          }
                          L31: {
                            var8 = 1;
                            if (param0.field_n == 0) {
                              var8 = 0;
                              break L31;
                            } else {
                              if (this.field_k == 1) {
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
                                    var11_ref_on = (on) ((Object) var21.d(param3 + -91));
                                    L33: while (true) {
                                      if (var11_ref_on == null) {
                                        var9_int++;
                                        continue L32;
                                      } else {
                                        L34: {
                                          if ((1 << var11_ref_on.field_i & hp.field_m ^ -1) == -1) {
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
                                        var11_ref_on = (on) ((Object) var21.a((byte) 116));
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
                              var9_ref = (cl) ((Object) param0.field_v.d(-120));
                              L36: while (true) {
                                if (var9_ref == null) {
                                  break L35;
                                } else {
                                  var22 = var9_ref.field_p;
                                  var11_ref_ee = (ee) ((Object) var22.d(-125));
                                  L37: while (true) {
                                    if (var11_ref_ee == null) {
                                      var9_ref = (cl) ((Object) param0.field_v.a((byte) 116));
                                      continue L36;
                                    } else {
                                      var11_ref_ee.field_m = var11_ref_ee.field_m + 256;
                                      var11_ref_ee = (ee) ((Object) var22.a((byte) 116));
                                      continue L37;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var9_int = 0;
                          L38: while (true) {
                            if (param0.field_z.length <= var9_int) {
                              var9 = (vn) ((Object) param0.field_K.d(-105));
                              L39: while (true) {
                                if (var9 == null) {
                                  var9 = (vn) ((Object) param0.field_gb.d(param3 + -13));
                                  L40: while (true) {
                                    if (var9 == null) {
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
                                          fieldTemp$3 = param0.field_n - 1;
                                          param0.field_n = param0.field_n - 1;
                                          if (fieldTemp$3 % 16 == 0) {
                                            L45: {
                                              if (1 == this.field_k) {
                                                stackIn_245_0 = 13;
                                                break L45;
                                              } else {
                                                stackIn_245_0 = 7;
                                                break L45;
                                              }
                                            }
                                            var9_int = stackIn_245_0;
                                            var10_ref = null;
                                            var11 = 1;
                                            L46: while (true) {
                                              if (var11 > var9_int) {
                                                var11 = 0;
                                                L47: while (true) {
                                                  if (-4 >= (var11 ^ -1)) {
                                                    break L44;
                                                  } else {
                                                    var25 = param0.field_z[var11];
                                                    var26 = var25;
                                                    var26 = var25;
                                                    var10_ref_on = (on) ((Object) var25.d(-44));
                                                    L48: while (true) {
                                                      if (var10_ref_on == null) {
                                                        var11++;
                                                        continue L47;
                                                      } else {
                                                        L49: {
                                                          if (-1 != (1 & var10_ref_on.field_N ^ -1)) {
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
                                                        var10_ref_on = (on) ((Object) var25.a((byte) 116));
                                                        continue L48;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                dupTemp$4 = new on(34 * var11 << -1599867576, 4096, 0, 0, 0);
                                                var10_ref_on = dupTemp$4;
                                                param0.field_z[2].a(dupTemp$4, (byte) 3);
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
                                        if (-1 < (param0.field_k ^ -1)) {
                                          break L50;
                                        } else {
                                          var9_ref2 = (il) ((Object) param0.field_C.d(-118));
                                          L51: while (true) {
                                            if (var9_ref2 == null) {
                                              param0.field_k = param0.field_k + 1;
                                              break L50;
                                            } else {
                                              var9_ref2.d(param3 + -2081170685);
                                              var9_ref2 = (il) ((Object) param0.field_C.a((byte) 116));
                                              continue L51;
                                            }
                                          }
                                        }
                                      }
                                      var9_int = 0;
                                      L52: while (true) {
                                        if (var9_int >= 8) {
                                          var9_ref3 = var7;
                                          var7.field_o = 0;
                                          var9_ref3.field_k = 0;
                                          var10 = 0;
                                          L53: while (true) {
                                            if (-4 >= (var10 ^ -1)) {
                                              L54: {
                                                if (-1 != (param0.field_L ^ -1)) {
                                                  break L54;
                                                } else {
                                                  if (param0.field_n == 0) {
                                                    L55: {
                                                      param0.field_P = 0;
                                                      param0.field_r = param0.field_r + 1;
                                                      param0.field_hb = param0.field_hb + 1;
                                                      param0.field_t = param0.field_t + 1;
                                                      if (1 != this.field_k) {
                                                        break L55;
                                                      } else {
                                                        param0.a(250, false, 65280, var7.field_m + -12800);
                                                        break L55;
                                                      }
                                                    }
                                                    L56: {
                                                      fieldTemp$5 = param0.field_qb + 1;
                                                      param0.field_qb = param0.field_qb + 1;
                                                      if (fieldTemp$5 < this.field_b.a(param3 + -125)) {
                                                        break L56;
                                                      } else {
                                                        if (!this.field_b.field_c) {
                                                          if (this.field_k != 1) {
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
                                                var13 = (vn) ((Object) param0.field_gb.d(-26));
                                                L57: while (true) {
                                                  if (var13 == null) {
                                                    L58: {
                                                      if (var10 > 20) {
                                                        break L58;
                                                      } else {
                                                        if (15 >= var11) {
                                                          break L9;
                                                        } else {
                                                          break L58;
                                                        }
                                                      }
                                                    }
                                                    param0.a(ml.field_e, (byte) 75);
                                                    break L8;
                                                  } else {
                                                    L59: {
                                                      var12 = var13.field_I;
                                                      if ((var13.field_I ^ -1) >= (var10 ^ -1)) {
                                                        break L59;
                                                      } else {
                                                        var10 = var12;
                                                        break L59;
                                                      }
                                                    }
                                                    L60: {
                                                      var12 = var13.field_B;
                                                      if (var11 >= var13.field_B) {
                                                        break L60;
                                                      } else {
                                                        var11 = var12;
                                                        break L60;
                                                      }
                                                    }
                                                    var13 = (vn) ((Object) param0.field_gb.a((byte) 116));
                                                    continue L57;
                                                  }
                                                }
                                              } else {
                                                break L8;
                                              }
                                            } else {
                                              var11_ref_on = (on) ((Object) param0.field_z[var10].d(-49));
                                              L61: while (true) {
                                                if (var11_ref_on == null) {
                                                  var10++;
                                                  continue L53;
                                                } else {
                                                  L62: {
                                                    if ((var11_ref_on.field_N & 4 ^ -1) != -1) {
                                                      var11_ref_on.a((byte) 119, true);
                                                      break L62;
                                                    } else {
                                                      break L62;
                                                    }
                                                  }
                                                  var11_ref_on = (on) ((Object) param0.field_z[var10].a((byte) 116));
                                                  continue L61;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          var10_ref_ge = (ge) ((Object) param0.field_pb.d(-119));
                                          L63: while (true) {
                                            if (var10_ref_ge == null) {
                                              L64: {
                                                var7.field_j = var7.field_j + var7.field_k / 8;
                                                if (var7.field_B > var7.field_j) {
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
                                                  var10_ref_vn = (vn) ((Object) param0.field_gb.d(-111));
                                                  L67: while (true) {
                                                    if (var10_ref_vn == null) {
                                                      break L66;
                                                    } else {
                                                      L68: {
                                                        if ((var10_ref_vn.field_j - -var10_ref_vn.field_u ^ -1) < (var7.field_u / 2 + var7.field_j ^ -1)) {
                                                          if (-1 <= (var10_ref_vn.field_k ^ -1)) {
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
                                                            var10_ref_vn = (vn) ((Object) param0.field_gb.a((byte) 116));
                                                            continue L67;
                                                          }
                                                        }
                                                      }
                                                      var10_ref_vn = (vn) ((Object) param0.field_gb.a((byte) 116));
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
                                                  var10_ref_vn = (vn) ((Object) param0.field_gb.d(-122));
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
                                                                if ((var11 ^ -1) == -6) {
                                                                  break L75;
                                                                } else {
                                                                  if (var10_ref_vn.field_j < 0) {
                                                                    break L75;
                                                                  } else {
                                                                    if (0 > var10_ref_vn.field_m) {
                                                                      break L75;
                                                                    } else {
                                                                      if (param0.field_mb << 1595004136 >= var10_ref_vn.field_j) {
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
                                                              param0.field_K.a(var10_ref_vn, (byte) 3);
                                                              break L74;
                                                            }
                                                          }
                                                          if (!param0.field_gb.a(false)) {
                                                            var10_ref_vn = (vn) ((Object) param0.field_gb.a((byte) 116));
                                                            continue L70;
                                                          } else {
                                                            break L71;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var10_ref_vn = (vn) ((Object) param0.field_K.d(-91));
                                                    L76: while (true) {
                                                      if (var10_ref_vn == null) {
                                                        var9_int++;
                                                        continue L52;
                                                      } else {
                                                        var10_ref_vn.a(var7, 0);
                                                        var10_ref_vn = (vn) ((Object) param0.field_K.a((byte) 116));
                                                        continue L76;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var26 = param0.field_z[var10];
                                                  var12_ref_on = (on) ((Object) var26.d(-38));
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
                                                      var12_ref_on = (on) ((Object) var26.a((byte) 116));
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
                                                    stackIn_270_0 = (j) (param0);

                                                    stackIn_270_1 = 16387;

                                                    if (-51 > (param0.a(100, (byte) 62) ^ -1)) {
                                                      stackIn_271_0 = (j) ((Object) stackIn_270_0);
                                                      stackIn_271_1 = stackIn_270_1;
                                                      stackIn_271_2 = 4;
                                                      break L80;
                                                    } else {
                                                      stackIn_271_0 = (j) ((Object) stackIn_270_0);
                                                      stackIn_271_1 = stackIn_270_1;
                                                      stackIn_271_2 = 5;
                                                      break L80;
                                                    }
                                                  }
                                                  L81: {
                                                    ((j) (Object) stackIn_271_0).b(stackIn_271_1, stackIn_271_2);
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
                                                  if (!var7.a(var10_ref_ge, (byte) 25)) {
                                                    break L79;
                                                  } else {
                                                    L82: {
                                                      var10_ref_ge.b((byte) 111);
                                                      if (!var10_ref_ge.b(false)) {
                                                        stackIn_279_0 = 0;
                                                        break L82;
                                                      } else {
                                                        stackIn_279_0 = 1;
                                                        break L82;
                                                      }
                                                    }
                                                    L83: {
                                                      var11 = stackIn_279_0;
                                                      if (param2 == null) {
                                                        break L83;
                                                      } else {
                                                        param2.a(var10_ref_ge, (byte) 3);
                                                        break L83;
                                                      }
                                                    }
                                                    L84: {
                                                      if ((this.field_k ^ -1) != -2) {
                                                        break L84;
                                                      } else {
                                                        L85: {
                                                          stackIn_284_0 = var11;

                                                          if ((var10_ref_ge.field_i ^ -1) != -14) {
                                                            stackIn_285_0 = stackIn_284_0;
                                                            stackIn_285_1 = 0;
                                                            break L85;
                                                          } else {
                                                            stackIn_285_0 = stackIn_284_0;
                                                            stackIn_285_1 = 1;
                                                            break L85;
                                                          }
                                                        }
                                                        L86: {
                                                          var11 = stackIn_285_0 | stackIn_285_1;
                                                          stackIn_287_0 = (j) (param0);

                                                          if (var11 != 0) {
                                                            stackIn_288_0 = (j) ((Object) stackIn_287_0);
                                                            stackIn_288_1 = 100;
                                                            break L86;
                                                          } else {
                                                            stackIn_288_0 = (j) ((Object) stackIn_287_0);
                                                            stackIn_288_1 = 500;
                                                            break L86;
                                                          }
                                                        }
                                                        ((j) (Object) stackIn_288_0).a(stackIn_288_1, var7, param3 + 2);
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
                                                        param1.a(new qc(3, var10_ref_ge.field_i), (byte) 3);
                                                        break L88;
                                                      } else {
                                                        break L88;
                                                      }
                                                    }
                                                    L89: {
                                                      L90: {
                                                        stackIn_300_0 = (j) (param0);

                                                        if (1 < this.field_k) {
                                                          break L90;
                                                        } else {
                                                          stackIn_300_0 = (j) ((Object) stackIn_300_0);

                                                          if ((var10_ref_ge.field_i ^ -1) == -14) {
                                                            break L90;
                                                          } else {


                                                            if (var11 == 0) {
                                                              stackIn_302_0 = (j) ((Object) stackIn_300_0);
                                                              stackIn_302_1 = eh.field_e;
                                                              break L89;
                                                            } else {
                                                              stackIn_300_0 = (j) ((Object) stackIn_300_0);
                                                              break L90;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      stackIn_302_0 = (j) ((Object) stackIn_300_0);
                                                      stackIn_302_1 = ml.field_e;
                                                      break L89;
                                                    }
                                                    ((j) (Object) stackIn_302_0).a(stackIn_302_1, (byte) 75);
                                                    break L79;
                                                  }
                                                }
                                              }
                                              var10_ref_ge = (ge) ((Object) param0.field_pb.a((byte) 116));
                                              continue L63;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L91: {
                                        var9.field_E.a(-7255, var9.field_j + var9.field_u);
                                        var9.field_y.a(-7255, var9.field_m - -var9.field_u);
                                        if (var9.field_J > 0) {
                                          var9.field_J = var9.field_J - 1;
                                          break L91;
                                        } else {
                                          break L91;
                                        }
                                      }
                                      L92: {
                                        if ((var9.field_v ^ -1) < -1) {
                                          var9.field_v = var9.field_v - 1;
                                          break L92;
                                        } else {
                                          break L92;
                                        }
                                      }
                                      var9 = (vn) ((Object) param0.field_gb.a((byte) 116));
                                      continue L40;
                                    }
                                  }
                                } else {
                                  L93: {
                                    if (var9.field_J <= 0) {
                                      break L93;
                                    } else {
                                      var9.field_J = var9.field_J - 1;
                                      break L93;
                                    }
                                  }
                                  L94: {
                                    if (-1 > (var9.field_v ^ -1)) {
                                      var9.field_v = var9.field_v - 1;
                                      break L94;
                                    } else {
                                      break L94;
                                    }
                                  }
                                  var9 = (vn) ((Object) param0.field_K.a((byte) 116));
                                  continue L39;
                                }
                              }
                            } else {
                              var23 = param0.field_z[var9_int];
                              var11_ref_on = (on) ((Object) var23.d(param3 ^ -42));
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
                                      fieldTemp$6 = var11_ref_on.field_l + 1;
                                      var11_ref_on.field_l = var11_ref_on.field_l + 1;
                                      if (-17 != (fieldTemp$6 ^ -1)) {
                                        break L97;
                                      } else {
                                        var11_ref_on.field_B = 0;
                                        var11_ref_on.field_l = 0;
                                        if (0 == var11_ref_on.field_R) {
                                          L98: {
                                            var11_ref_on.b((byte) 111);
                                            if (-1 != (1 << var11_ref_on.field_i & hp.field_m ^ -1)) {
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
                                      if (var24.field_t == var11_ref_on.field_S) {
                                        var11_ref_on.f(105);
                                        break L100;
                                      } else {
                                        break L100;
                                      }
                                    } else {
                                      break L100;
                                    }
                                  }
                                  var11_ref_on = (on) ((Object) var23.a((byte) 116));
                                  continue L95;
                                }
                              }
                            }
                          }
                        } else {
                          if (param0.field_Z != 0) {
                            if (-2 == (param0.field_Z ^ -1)) {
                              L101: {
                                if (-1 == (param0.field_P ^ -1)) {
                                  L102: {
                                    if (-2 == (this.field_k ^ -1)) {
                                      param0.field_lb = null;
                                      param0.field_fb = this.field_b.a((byte) 115, param0.field_qb);
                                      param0.field_i = 100;
                                      break L102;
                                    } else {
                                      break L102;
                                    }
                                  }
                                  if (param1 == null) {
                                    break L101;
                                  } else {
                                    param1.a(new qc(14), (byte) 3);
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
                                    if ((var8 ^ -1) <= -4) {
                                      break L103;
                                    } else {
                                      var9_ref4 = (on) ((Object) param0.field_z[var8].d(-30));
                                      L105: while (true) {
                                        if (var9_ref4 == null) {
                                          var8++;
                                          continue L104;
                                        } else {
                                          L106: {
                                            if (-1 < (var9_ref4.field_R ^ -1)) {
                                              break L106;
                                            } else {
                                              fieldTemp$7 = var9_ref4.field_l + 1;
                                              var9_ref4.field_l = var9_ref4.field_l + 1;
                                              if ((fieldTemp$7 ^ -1) == -17) {
                                                var9_ref4.field_B = 0;
                                                var9_ref4.field_l = 0;
                                                var9_ref4.field_R = -1;
                                                break L106;
                                              } else {
                                                break L106;
                                              }
                                            }
                                          }
                                          var9_ref4 = (on) ((Object) param0.field_z[var8].a((byte) 116));
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
                                if (this.field_k == 1) {
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
                              fieldTemp$8 = param0.field_P + 1;
                              param0.field_P = param0.field_P + 1;
                              if (fieldTemp$8 == var8) {
                                param0.field_P = 0;
                                param0.field_Z = 4;
                                break L8;
                              } else {
                                break L8;
                              }
                            } else {
                              if (-5 != (param0.field_Z ^ -1)) {
                                if (param0.field_Z == 3) {
                                  fieldTemp$9 = param0.field_P + 1;
                                  param0.field_P = param0.field_P + 1;
                                  if (-351 == (fieldTemp$9 ^ -1)) {
                                    param0.field_P = 0;
                                    param0.field_Z = 8;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  if (param0.field_Z == 5) {
                                    fieldTemp$10 = param0.field_P + 1;
                                    param0.field_P = param0.field_P + 1;
                                    if (fieldTemp$10 != 350) {
                                      break L9;
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
                                L108: {
                                  if (-1 == (param0.field_P ^ -1)) {
                                    if (param1 == null) {
                                      break L108;
                                    } else {
                                      param1.a(new qc(13), (byte) 3);
                                      break L108;
                                    }
                                  } else {
                                    break L108;
                                  }
                                }
                                L109: {
                                  fieldTemp$11 = param0.field_P + 1;
                                  param0.field_P = param0.field_P + 1;
                                  if (-76 == (fieldTemp$11 ^ -1)) {
                                    break L109;
                                  } else {
                                    if (-2 != (this.field_k ^ -1)) {
                                      break L9;
                                    } else {
                                      if (25 != param0.field_P) {
                                        break L9;
                                      } else {
                                        break L109;
                                      }
                                    }
                                  }
                                }
                                L110: {
                                  param0.field_lb = lq.field_c;
                                  stackIn_55_0 = (j) (param0);

                                  if (param0.field_i > 25) {
                                    stackIn_56_0 = (j) ((Object) stackIn_55_0);
                                    stackIn_56_1 = 25;
                                    break L110;
                                  } else {
                                    stackIn_56_0 = (j) ((Object) stackIn_55_0);
                                    stackIn_56_1 = param0.field_i;
                                    break L110;
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
                            L111: while (true) {
                              if (3 <= var9_int) {
                                L112: {
                                  var18 = new vl();
                                  var10 = param0.field_ab.field_p;
                                  this.field_b.a(new ga(), param0.field_ab, var18, param0.field_qb, (byte) -118, var8_ref_vl__);
                                  param0.a(var18, param3 + 9, var8_ref_vl__);
                                  param0.a(26496, false);
                                  if (-2 == (this.field_k ^ -1)) {
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
                                        var12_ref_on = (on) ((Object) var8_ref_vl__[var11].d(param3 ^ -107));
                                        L116: while (true) {
                                          if (var12_ref_on == null) {
                                            var11++;
                                            continue L115;
                                          } else {
                                            var12_ref_on.field_l = 0;
                                            var12_ref_on.field_B = 5;
                                            var12_ref_on.field_R = var12_ref_on.field_i;
                                            var12_ref_on = (on) ((Object) var8_ref_vl__[var11].a((byte) 116));
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
                                break L8;
                              } else {
                                var8_ref_vl__[var9_int] = new vl();
                                var9_int++;
                                continue L111;
                              }
                            }
                          }
                        }
                      }
                      break L8;
                    }
                    break L0;
                  } else {
                    L117: {
                      if (var6.b(false)) {
                        break L117;
                      } else {
                        var6.b((byte) 111);
                        break L117;
                      }
                    }
                    var6 = (ul) ((Object) param0.field_nb.a((byte) 116));
                    continue L7;
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
                var5 = (kc) ((Object) param0.field_x.a((byte) 116));
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L119: {
            var5_ref = decompiledCaughtException;
            stackIn_388_0 = (RuntimeException) (var5_ref);

            stackIn_388_1 = new StringBuilder().append("ak.F(");

            if (param0 == null) {
              stackIn_389_0 = (RuntimeException) ((Object) stackIn_388_0);
              stackIn_389_1 = (StringBuilder) ((Object) stackIn_388_1);
              stackIn_389_2 = "null";
              break L119;
            } else {
              stackIn_389_0 = (RuntimeException) ((Object) stackIn_388_0);
              stackIn_389_1 = (StringBuilder) ((Object) stackIn_388_1);
              stackIn_389_2 = "{...}";
              break L119;
            }
          }
          L120: {


            stackIn_391_1 = ((StringBuilder) (Object) stackIn_389_1).append(stackIn_389_2).append(',');

            if (param1 == null) {
              stackIn_389_0 = (RuntimeException) ((Object) stackIn_389_0);
              stackIn_392_1 = (StringBuilder) ((Object) stackIn_391_1);
              stackIn_392_2 = "null";
              break L120;
            } else {
              stackIn_389_0 = (RuntimeException) ((Object) stackIn_389_0);
              stackIn_392_1 = (StringBuilder) ((Object) stackIn_391_1);
              stackIn_392_2 = "{...}";
              break L120;
            }
          }
          L121: {


            stackIn_394_1 = ((StringBuilder) (Object) stackIn_392_1).append(stackIn_392_2).append(',');

            if (param2 == null) {
              stackIn_389_0 = (RuntimeException) ((Object) stackIn_389_0);
              stackIn_395_1 = (StringBuilder) ((Object) stackIn_394_1);
              stackIn_395_2 = "null";
              break L121;
            } else {
              stackIn_389_0 = (RuntimeException) ((Object) stackIn_389_0);
              stackIn_395_1 = (StringBuilder) ((Object) stackIn_394_1);
              stackIn_395_2 = "{...}";
              break L121;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_389_0), stackIn_395_2 + ',' + param3 + ')');
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
        int var7 = BrickABrac.field_J ? 1 : 0;
        try {
            hg.a(param1);
            for (var4_int = -1 + param2.field_z.length; var4_int > -1; var4_int--) {
                var5 = param2.field_z[var4_int];
                var6 = (on) ((Object) var5.f(param1 ^ -1));
                while (var6 != null) {
                    var6.a(param0, (byte) 119);
                    var6 = (on) ((Object) var5.b(-126));
                }
                if (dj.field_c != null) {
                    break;
                }
            }
            param2.field_yb.a(param0, (byte) 110);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "ak.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
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
        j var3;
        ge var4;
        int var5;
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
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_101_0 = 0;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        StringBuilder stackIn_107_1 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
        StringBuilder stackIn_110_1 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_111_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        on var9 = null;
        on var10 = null;
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
                        stackIn_87_0 = 0;
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
                  stackIn_101_0 = 0;
                  decompiledRegionSelector0 = 7;
                  break L0;
                } else {
                  if (param4.field_J != 0) {
                    if (dj.field_c == param0.field_yb) {
                      stackIn_95_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      L14: {
                        var10 = (on) ((Object) dj.field_c);
                        if ((1 & var10.field_N) == 0) {
                          stackIn_99_0 = 0;
                          break L14;
                        } else {
                          stackIn_99_0 = 1;
                          break L14;
                        }
                      }
                      decompiledRegionSelector0 = 6;
                      break L0;
                    }
                  } else {
                    stackIn_91_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              } else {
                stackIn_30_0 = 0;
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
                    stackIn_25_0 = 0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L16;
                  }
                }
              }
              param0.b(16387, 2);
              stackIn_27_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackIn_104_0 = (RuntimeException) (var6);

            stackIn_104_1 = new StringBuilder().append("ak.B(");

            if (param0 == null) {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackIn_105_2 = "null";
              break L22;
            } else {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackIn_105_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_107_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_105_2).append(',');

            if (param1 == null) {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackIn_108_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackIn_108_2 = "null";
              break L23;
            } else {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackIn_108_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackIn_108_2 = "{...}";
              break L23;
            }
          }
          L24: {


            stackIn_110_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_108_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackIn_111_1 = (StringBuilder) ((Object) stackIn_110_1);
              stackIn_111_2 = "null";
              break L24;
            } else {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackIn_111_1 = (StringBuilder) ((Object) stackIn_110_1);
              stackIn_111_2 = "{...}";
              break L24;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_105_0), stackIn_111_2 + ')');
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
        if (param0 < 75) {
            field_e = (String) null;
        }
        int var2 = ((this.field_g | this.field_a | this.field_i) ^ -1) & -1 + (1 << this.field_k);
        if (var2 == 0 || wn.a(var2, (byte) -6)) {
            this.a(false);
        }
        return this.field_c;
    }

    ak(String[] param0, int param1, oi param2, int[] param3, int[] param4) {
        int stackIn_4_0 = 0;
        vo stackIn_8_0 = null;
        vo stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              this.field_k = param0.length;
              this.field_f = param0;
              this.field_b = param2;
              this.field_l = new j[this.field_k];
              if (this.field_k >= 2) {
                stackIn_4_0 = 306;
                break L1;
              } else {
                stackIn_4_0 = 510;
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
                  stackIn_8_0 = this.field_l[var8].field_yb;

                  if (1 < this.field_k) {
                    stackIn_9_0 = (vo) ((Object) stackIn_8_0);
                    stackIn_9_1 = 102400;
                    break L3;
                  } else {
                    stackIn_9_0 = (vo) ((Object) stackIn_8_0);
                    stackIn_9_1 = 114688;
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
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("ak.<init>(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_17_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_e = "Create unrated game";
    }
}
