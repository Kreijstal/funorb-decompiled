/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends br {
    private int field_m;
    static int[] field_i;
    static ja[] field_k;
    private int field_l;
    static String field_j;
    private int field_h;
    private int field_g;
    static int[] field_f;

    final static void a(int param0, ul param1) {
        ac var2 = null;
        try {
            ac.b(param1.a("headers.packvorbis", "", false));
            if (param0 != 7478) {
                field_k = (ja[]) null;
            }
            var2 = ac.a(param1, "jagex logo2.packvorbis", "");
            var2.c();
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ui.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        int discarded$0 = 0;
        if (param0 != 9307) {
            discarded$0 = this.a(105);
        }
    }

    final static int a(int param0, boolean param1) {
        if (param1) {
            ui.a(true, false);
            return 16711935 & 15 * (16711935 & param0) >> 450340772 | (param0 & 65280) * 15 >> -772990300 & 65280;
        }
        return 16711935 & 15 * (16711935 & param0) >> 450340772 | (param0 & 65280) * 15 >> -772990300 & 65280;
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = -3 % ((-42 - param0) / 33);
        if (-31 >= (Math.abs(param1 + -this.field_h) ^ -1)) {
            return false;
        }
        if ((Math.abs(-this.field_m + param2) ^ -1) <= -31) {
            return false;
        }
        return true;
    }

    final static void a(boolean param0, boolean param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_21_0 = 0;
        ja[] stackIn_24_0 = null;
        ef stackIn_26_0;
        String stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        ef stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        ja[] stackIn_64_0 = null;
        ef stackIn_66_0;
        String stackIn_66_1;
        int stackIn_66_2;
        int stackIn_66_3;
        ef stackIn_67_0 = null;
        String stackIn_67_1 = null;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        int stackIn_67_4 = 0;
        int stackIn_72_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_95_0 = 0;
        ja[] stackIn_98_0 = null;
        ef stackIn_100_0;
        String stackIn_100_1;
        int stackIn_100_2;
        int stackIn_100_3;
        ef stackIn_101_0 = null;
        String stackIn_101_1 = null;
        int stackIn_101_2 = 0;
        int stackIn_101_3 = 0;
        int stackIn_101_4 = 0;
        int stackIn_106_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_119_0 = 0;
        ja[] stackIn_127_0 = null;
        ef stackIn_129_0;
        String stackIn_129_1;
        int stackIn_129_2;
        int stackIn_129_3;
        ef stackIn_130_0 = null;
        String stackIn_130_1 = null;
        int stackIn_130_2 = 0;
        int stackIn_130_3 = 0;
        int stackIn_130_4 = 0;
        int stackIn_135_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_148_0 = 0;
        int stackIn_154_0 = 0;
        ja[] stackIn_157_0 = null;
        ef stackIn_159_0;
        String stackIn_159_1;
        int stackIn_159_2;
        int stackIn_159_3;
        ef stackIn_160_0 = null;
        String stackIn_160_1 = null;
        int stackIn_160_2 = 0;
        int stackIn_160_3 = 0;
        int stackIn_160_4 = 0;
        int stackIn_165_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_178_0 = 0;
        ja[] stackIn_184_0 = null;
        ef stackIn_186_0;
        String stackIn_186_1;
        int stackIn_186_2;
        int stackIn_186_3;
        ef stackIn_187_0 = null;
        String stackIn_187_1 = null;
        int stackIn_187_2 = 0;
        int stackIn_187_3 = 0;
        int stackIn_187_4 = 0;
        int stackIn_192_0 = 0;
        int stackIn_197_0 = 0;
        int stackIn_205_0 = 0;
        ja[] stackIn_211_0 = null;
        ef stackIn_213_0;
        String stackIn_213_1;
        int stackIn_213_2;
        int stackIn_213_3;
        ef stackIn_214_0 = null;
        String stackIn_214_1 = null;
        int stackIn_214_2 = 0;
        int stackIn_214_3 = 0;
        int stackIn_214_4 = 0;
        int stackIn_219_0 = 0;
        int stackIn_224_0 = 0;
        int stackIn_232_0 = 0;
        ja[] stackIn_237_0 = null;
        ef stackIn_239_0;
        String stackIn_239_1;
        int stackIn_239_2;
        int stackIn_239_3;
        ef stackIn_240_0 = null;
        String stackIn_240_1 = null;
        int stackIn_240_2 = 0;
        int stackIn_240_3 = 0;
        int stackIn_240_4 = 0;
        int stackIn_245_0 = 0;
        int stackIn_250_0 = 0;
        int stackIn_258_0 = 0;
        int var2;
        int var3;
        int var4;
        ja[] var5;
        int var6;
        int var7;
        int var9;
        int[] var11;
        int[] var19;
        int[] var20;
        int[] var21;
        int[] var22;
        int[] var23;
        int[] var24;
        int[] var25;
        int[] var26;
        if (!param1) {
          if (null != op.field_m) {
            if (1 < op.field_m.field_t) {
              L0: {
                if (pl.field_I != 10) {
                  stackIn_55_0 = 0;
                  break L0;
                } else {
                  stackIn_55_0 = 1;
                  break L0;
                }
              }
              L1: {
                L2: {
                  var2 = stackIn_55_0;
                  if (!iq.field_f) {
                    break L2;
                  } else {
                    if (var2 == 0) {
                      break L2;
                    } else {
                      stackIn_59_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_59_0 = 0;
                break L1;
              }
              var3 = stackIn_59_0;
              if (!tj.field_f) {
                if (0 >= id.field_D) {
                  if (var3 != 0) {
                    if (-21 < (wf.field_m % 40 ^ -1)) {
                      L3: {
                        var4 = 1;
                        if (var4 != 0) {
                          stackIn_237_0 = rl.field_a;
                          break L3;
                        } else {
                          stackIn_237_0 = oi.field_h;
                          break L3;
                        }
                      }
                      L4: {
                        var5 = stackIn_237_0;
                        var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                        var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                        s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                        var19 = new int[4];
                        var11 = var19;
                        oo.a(var19);
                        oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                        stackIn_239_0 = qp.field_w;

                        stackIn_239_1 = pb.field_i;

                        stackIn_239_2 = -var5[2].field_x + 635;

                        stackIn_239_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                        if (var4 == 0) {
                          stackIn_240_0 = (ef) ((Object) stackIn_239_0);
                          stackIn_240_1 = (String) ((Object) stackIn_239_1);
                          stackIn_240_2 = stackIn_239_2;
                          stackIn_240_3 = stackIn_239_3;
                          stackIn_240_4 = 16777215;
                          break L4;
                        } else {
                          stackIn_240_0 = (ef) ((Object) stackIn_239_0);
                          stackIn_240_1 = (String) ((Object) stackIn_239_1);
                          stackIn_240_2 = stackIn_239_2;
                          stackIn_240_3 = stackIn_239_3;
                          stackIn_240_4 = 1;
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          ((ef) (Object) stackIn_240_0).a(stackIn_240_1, stackIn_240_2, stackIn_240_3, stackIn_240_4, -1);
                          oo.b(var19);
                          if (!hh.field_b) {
                            break L6;
                          } else {
                            if (!sq.field_N) {
                              break L6;
                            } else {
                              if (df.field_I) {
                                break L6;
                              } else {
                                stackIn_245_0 = 1;
                                break L5;
                              }
                            }
                          }
                        }
                        stackIn_245_0 = 0;
                        break L5;
                      }
                      L7: {
                        L8: {
                          var9 = stackIn_245_0;
                          if (!param0) {
                            break L8;
                          } else {
                            if (!vk.i((byte) -39)) {
                              break L8;
                            } else {
                              if (var9 != 0) {
                                break L8;
                              } else {
                                stackIn_250_0 = 1;
                                break L7;
                              }
                            }
                          }
                        }
                        stackIn_250_0 = 0;
                        break L7;
                      }
                      L9: {
                        dd.a(stackIn_250_0 != 0, 0);
                        if (!re.field_b) {
                          break L9;
                        } else {
                          if (var9 != 0) {
                            if (!param0) {
                              kg.a(false, (byte) 117);
                              return;
                            } else {
                              if (!vk.i((byte) -39)) {
                                kg.a(false, (byte) 117);
                                return;
                              } else {
                                stackIn_258_0 = 1;
                                kg.a(stackIn_258_0 != 0, (byte) 117);
                                break L9;
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      L10: {
                        var4 = 0;
                        if (var4 != 0) {
                          stackIn_211_0 = rl.field_a;
                          break L10;
                        } else {
                          stackIn_211_0 = oi.field_h;
                          break L10;
                        }
                      }
                      L11: {
                        var5 = stackIn_211_0;
                        var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                        var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                        s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                        var26 = new int[4];
                        oo.a(var26);
                        oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                        stackIn_213_0 = qp.field_w;

                        stackIn_213_1 = pb.field_i;

                        stackIn_213_2 = -var5[2].field_x + 635;

                        stackIn_213_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                        if (var4 == 0) {
                          stackIn_214_0 = (ef) ((Object) stackIn_213_0);
                          stackIn_214_1 = (String) ((Object) stackIn_213_1);
                          stackIn_214_2 = stackIn_213_2;
                          stackIn_214_3 = stackIn_213_3;
                          stackIn_214_4 = 16777215;
                          break L11;
                        } else {
                          stackIn_214_0 = (ef) ((Object) stackIn_213_0);
                          stackIn_214_1 = (String) ((Object) stackIn_213_1);
                          stackIn_214_2 = stackIn_213_2;
                          stackIn_214_3 = stackIn_213_3;
                          stackIn_214_4 = 1;
                          break L11;
                        }
                      }
                      L12: {
                        L13: {
                          ((ef) (Object) stackIn_214_0).a(stackIn_214_1, stackIn_214_2, stackIn_214_3, stackIn_214_4, -1);
                          oo.b(var26);
                          if (!hh.field_b) {
                            break L13;
                          } else {
                            if (!sq.field_N) {
                              break L13;
                            } else {
                              if (df.field_I) {
                                break L13;
                              } else {
                                stackIn_219_0 = 1;
                                break L12;
                              }
                            }
                          }
                        }
                        stackIn_219_0 = 0;
                        break L12;
                      }
                      L14: {
                        L15: {
                          var9 = stackIn_219_0;
                          if (!param0) {
                            break L15;
                          } else {
                            if (!vk.i((byte) -39)) {
                              break L15;
                            } else {
                              if (var9 != 0) {
                                break L15;
                              } else {
                                stackIn_224_0 = 1;
                                break L14;
                              }
                            }
                          }
                        }
                        stackIn_224_0 = 0;
                        break L14;
                      }
                      L16: {
                        dd.a(stackIn_224_0 != 0, 0);
                        if (!re.field_b) {
                          break L16;
                        } else {
                          if (var9 != 0) {
                            if (!param0) {
                              kg.a(false, (byte) 117);
                              return;
                            } else {
                              if (!vk.i((byte) -39)) {
                                kg.a(false, (byte) 117);
                                return;
                              } else {
                                stackIn_232_0 = 1;
                                kg.a(stackIn_232_0 != 0, (byte) 117);
                                break L16;
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L17: {
                      var4 = 0;
                      if (var4 != 0) {
                        stackIn_184_0 = rl.field_a;
                        break L17;
                      } else {
                        stackIn_184_0 = oi.field_h;
                        break L17;
                      }
                    }
                    L18: {
                      var5 = stackIn_184_0;
                      var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                      var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                      s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                      var25 = new int[4];
                      oo.a(var25);
                      oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                      stackIn_186_0 = qp.field_w;

                      stackIn_186_1 = pb.field_i;

                      stackIn_186_2 = -var5[2].field_x + 635;

                      stackIn_186_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                      if (var4 == 0) {
                        stackIn_187_0 = (ef) ((Object) stackIn_186_0);
                        stackIn_187_1 = (String) ((Object) stackIn_186_1);
                        stackIn_187_2 = stackIn_186_2;
                        stackIn_187_3 = stackIn_186_3;
                        stackIn_187_4 = 16777215;
                        break L18;
                      } else {
                        stackIn_187_0 = (ef) ((Object) stackIn_186_0);
                        stackIn_187_1 = (String) ((Object) stackIn_186_1);
                        stackIn_187_2 = stackIn_186_2;
                        stackIn_187_3 = stackIn_186_3;
                        stackIn_187_4 = 1;
                        break L18;
                      }
                    }
                    L19: {
                      L20: {
                        ((ef) (Object) stackIn_187_0).a(stackIn_187_1, stackIn_187_2, stackIn_187_3, stackIn_187_4, -1);
                        oo.b(var25);
                        if (!hh.field_b) {
                          break L20;
                        } else {
                          if (!sq.field_N) {
                            break L20;
                          } else {
                            if (df.field_I) {
                              break L20;
                            } else {
                              stackIn_192_0 = 1;
                              break L19;
                            }
                          }
                        }
                      }
                      stackIn_192_0 = 0;
                      break L19;
                    }
                    L21: {
                      L22: {
                        var9 = stackIn_192_0;
                        if (!param0) {
                          break L22;
                        } else {
                          if (!vk.i((byte) -39)) {
                            break L22;
                          } else {
                            if (var9 != 0) {
                              break L22;
                            } else {
                              stackIn_197_0 = 1;
                              break L21;
                            }
                          }
                        }
                      }
                      stackIn_197_0 = 0;
                      break L21;
                    }
                    L23: {
                      dd.a(stackIn_197_0 != 0, 0);
                      if (!re.field_b) {
                        break L23;
                      } else {
                        if (var9 != 0) {
                          if (!param0) {
                            kg.a(false, (byte) 117);
                            return;
                          } else {
                            if (!vk.i((byte) -39)) {
                              kg.a(false, (byte) 117);
                              return;
                            } else {
                              stackIn_205_0 = 1;
                              kg.a(stackIn_205_0 != 0, (byte) 117);
                              break L23;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  if (20 <= wf.field_m % 40) {
                    L24: {
                      L25: {
                        if (var3 == 0) {
                          break L25;
                        } else {
                          if (-21 >= (wf.field_m % 40 ^ -1)) {
                            break L25;
                          } else {
                            stackIn_154_0 = 1;
                            break L24;
                          }
                        }
                      }
                      stackIn_154_0 = 0;
                      break L24;
                    }
                    L26: {
                      var4 = stackIn_154_0;
                      if (var4 != 0) {
                        stackIn_157_0 = rl.field_a;
                        break L26;
                      } else {
                        stackIn_157_0 = oi.field_h;
                        break L26;
                      }
                    }
                    L27: {
                      var5 = stackIn_157_0;
                      var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                      var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                      s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                      var24 = new int[4];
                      oo.a(var24);
                      oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                      stackIn_159_0 = qp.field_w;

                      stackIn_159_1 = pb.field_i;

                      stackIn_159_2 = -var5[2].field_x + 635;

                      stackIn_159_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                      if (var4 == 0) {
                        stackIn_160_0 = (ef) ((Object) stackIn_159_0);
                        stackIn_160_1 = (String) ((Object) stackIn_159_1);
                        stackIn_160_2 = stackIn_159_2;
                        stackIn_160_3 = stackIn_159_3;
                        stackIn_160_4 = 16777215;
                        break L27;
                      } else {
                        stackIn_160_0 = (ef) ((Object) stackIn_159_0);
                        stackIn_160_1 = (String) ((Object) stackIn_159_1);
                        stackIn_160_2 = stackIn_159_2;
                        stackIn_160_3 = stackIn_159_3;
                        stackIn_160_4 = 1;
                        break L27;
                      }
                    }
                    L28: {
                      L29: {
                        ((ef) (Object) stackIn_160_0).a(stackIn_160_1, stackIn_160_2, stackIn_160_3, stackIn_160_4, -1);
                        oo.b(var24);
                        if (!hh.field_b) {
                          break L29;
                        } else {
                          if (!sq.field_N) {
                            break L29;
                          } else {
                            if (df.field_I) {
                              break L29;
                            } else {
                              stackIn_165_0 = 1;
                              break L28;
                            }
                          }
                        }
                      }
                      stackIn_165_0 = 0;
                      break L28;
                    }
                    L30: {
                      L31: {
                        var9 = stackIn_165_0;
                        if (!param0) {
                          break L31;
                        } else {
                          if (!vk.i((byte) -39)) {
                            break L31;
                          } else {
                            if (var9 != 0) {
                              break L31;
                            } else {
                              stackIn_170_0 = 1;
                              break L30;
                            }
                          }
                        }
                      }
                      stackIn_170_0 = 0;
                      break L30;
                    }
                    L32: {
                      dd.a(stackIn_170_0 != 0, 0);
                      if (!re.field_b) {
                        break L32;
                      } else {
                        if (var9 != 0) {
                          if (!param0) {
                            kg.a(false, (byte) 117);
                            return;
                          } else {
                            if (!vk.i((byte) -39)) {
                              kg.a(false, (byte) 117);
                              return;
                            } else {
                              stackIn_178_0 = 1;
                              kg.a(stackIn_178_0 != 0, (byte) 117);
                              break L32;
                            }
                          }
                        } else {
                          break L32;
                        }
                      }
                    }
                    return;
                  } else {
                    L33: {
                      var4 = 1;
                      if (var4 != 0) {
                        stackIn_127_0 = rl.field_a;
                        break L33;
                      } else {
                        stackIn_127_0 = oi.field_h;
                        break L33;
                      }
                    }
                    L34: {
                      var5 = stackIn_127_0;
                      var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                      var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                      s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                      var23 = new int[4];
                      oo.a(var23);
                      oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                      stackIn_129_0 = qp.field_w;

                      stackIn_129_1 = pb.field_i;

                      stackIn_129_2 = -var5[2].field_x + 635;

                      stackIn_129_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                      if (var4 == 0) {
                        stackIn_130_0 = (ef) ((Object) stackIn_129_0);
                        stackIn_130_1 = (String) ((Object) stackIn_129_1);
                        stackIn_130_2 = stackIn_129_2;
                        stackIn_130_3 = stackIn_129_3;
                        stackIn_130_4 = 16777215;
                        break L34;
                      } else {
                        stackIn_130_0 = (ef) ((Object) stackIn_129_0);
                        stackIn_130_1 = (String) ((Object) stackIn_129_1);
                        stackIn_130_2 = stackIn_129_2;
                        stackIn_130_3 = stackIn_129_3;
                        stackIn_130_4 = 1;
                        break L34;
                      }
                    }
                    L35: {
                      L36: {
                        ((ef) (Object) stackIn_130_0).a(stackIn_130_1, stackIn_130_2, stackIn_130_3, stackIn_130_4, -1);
                        oo.b(var23);
                        if (!hh.field_b) {
                          break L36;
                        } else {
                          if (!sq.field_N) {
                            break L36;
                          } else {
                            if (df.field_I) {
                              break L36;
                            } else {
                              stackIn_135_0 = 1;
                              break L35;
                            }
                          }
                        }
                      }
                      stackIn_135_0 = 0;
                      break L35;
                    }
                    L37: {
                      L38: {
                        var9 = stackIn_135_0;
                        if (!param0) {
                          break L38;
                        } else {
                          if (!vk.i((byte) -39)) {
                            break L38;
                          } else {
                            if (var9 != 0) {
                              break L38;
                            } else {
                              stackIn_140_0 = 1;
                              break L37;
                            }
                          }
                        }
                      }
                      stackIn_140_0 = 0;
                      break L37;
                    }
                    L39: {
                      dd.a(stackIn_140_0 != 0, 0);
                      if (!re.field_b) {
                        break L39;
                      } else {
                        if (var9 != 0) {
                          if (!param0) {
                            kg.a(false, (byte) 117);
                            return;
                          } else {
                            if (!vk.i((byte) -39)) {
                              kg.a(false, (byte) 117);
                              return;
                            } else {
                              stackIn_148_0 = 1;
                              kg.a(stackIn_148_0 != 0, (byte) 117);
                              break L39;
                            }
                          }
                        } else {
                          break L39;
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                if (!param0) {
                  L40: {
                    L41: {
                      L42: {
                        if (0 >= id.field_D) {
                          break L42;
                        } else {
                          if (20 > wf.field_m % 40) {
                            break L41;
                          } else {
                            break L42;
                          }
                        }
                      }
                      L43: {
                        if (var3 == 0) {
                          break L43;
                        } else {
                          if (-21 >= (wf.field_m % 40 ^ -1)) {
                            break L43;
                          } else {
                            break L41;
                          }
                        }
                      }
                      stackIn_95_0 = 0;
                      break L40;
                    }
                    stackIn_95_0 = 1;
                    break L40;
                  }
                  L44: {
                    var4 = stackIn_95_0;
                    if (var4 != 0) {
                      stackIn_98_0 = rl.field_a;
                      break L44;
                    } else {
                      stackIn_98_0 = oi.field_h;
                      break L44;
                    }
                  }
                  L45: {
                    var5 = stackIn_98_0;
                    var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                    var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                    s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                    var22 = new int[4];
                    oo.a(var22);
                    oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                    stackIn_100_0 = qp.field_w;

                    stackIn_100_1 = pb.field_i;

                    stackIn_100_2 = -var5[2].field_x + 635;

                    stackIn_100_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                    if (var4 == 0) {
                      stackIn_101_0 = (ef) ((Object) stackIn_100_0);
                      stackIn_101_1 = (String) ((Object) stackIn_100_1);
                      stackIn_101_2 = stackIn_100_2;
                      stackIn_101_3 = stackIn_100_3;
                      stackIn_101_4 = 16777215;
                      break L45;
                    } else {
                      stackIn_101_0 = (ef) ((Object) stackIn_100_0);
                      stackIn_101_1 = (String) ((Object) stackIn_100_1);
                      stackIn_101_2 = stackIn_100_2;
                      stackIn_101_3 = stackIn_100_3;
                      stackIn_101_4 = 1;
                      break L45;
                    }
                  }
                  L46: {
                    L47: {
                      ((ef) (Object) stackIn_101_0).a(stackIn_101_1, stackIn_101_2, stackIn_101_3, stackIn_101_4, -1);
                      oo.b(var22);
                      if (!hh.field_b) {
                        break L47;
                      } else {
                        if (!sq.field_N) {
                          break L47;
                        } else {
                          if (df.field_I) {
                            break L47;
                          } else {
                            stackIn_106_0 = 1;
                            break L46;
                          }
                        }
                      }
                    }
                    stackIn_106_0 = 0;
                    break L46;
                  }
                  L48: {
                    L49: {
                      var9 = stackIn_106_0;
                      if (!param0) {
                        break L49;
                      } else {
                        if (!vk.i((byte) -39)) {
                          break L49;
                        } else {
                          if (var9 != 0) {
                            break L49;
                          } else {
                            stackIn_111_0 = 1;
                            break L48;
                          }
                        }
                      }
                    }
                    stackIn_111_0 = 0;
                    break L48;
                  }
                  L50: {
                    L51: {
                      dd.a(stackIn_111_0 != 0, 0);
                      if (!re.field_b) {
                        break L51;
                      } else {
                        if (var9 != 0) {
                          if (!param0) {
                            kg.a(false, (byte) 117);
                            break L50;
                          } else {
                            if (!vk.i((byte) -39)) {
                              kg.a(false, (byte) 117);
                              break L50;
                            } else {
                              stackIn_119_0 = 1;
                              kg.a(stackIn_119_0 != 0, (byte) 117);
                              break L51;
                            }
                          }
                        } else {
                          break L50;
                        }
                      }
                    }
                    break L50;
                  }
                  return;
                } else {
                  L52: {
                    var4 = 1;
                    if (var4 != 0) {
                      stackIn_64_0 = rl.field_a;
                      break L52;
                    } else {
                      stackIn_64_0 = oi.field_h;
                      break L52;
                    }
                  }
                  L53: {
                    var5 = stackIn_64_0;
                    var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                    var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                    s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                    var21 = new int[4];
                    oo.a(var21);
                    oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                    stackIn_66_0 = qp.field_w;

                    stackIn_66_1 = pb.field_i;

                    stackIn_66_2 = -var5[2].field_x + 635;

                    stackIn_66_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                    if (var4 == 0) {
                      stackIn_67_0 = (ef) ((Object) stackIn_66_0);
                      stackIn_67_1 = (String) ((Object) stackIn_66_1);
                      stackIn_67_2 = stackIn_66_2;
                      stackIn_67_3 = stackIn_66_3;
                      stackIn_67_4 = 16777215;
                      break L53;
                    } else {
                      stackIn_67_0 = (ef) ((Object) stackIn_66_0);
                      stackIn_67_1 = (String) ((Object) stackIn_66_1);
                      stackIn_67_2 = stackIn_66_2;
                      stackIn_67_3 = stackIn_66_3;
                      stackIn_67_4 = 1;
                      break L53;
                    }
                  }
                  L54: {
                    L55: {
                      ((ef) (Object) stackIn_67_0).a(stackIn_67_1, stackIn_67_2, stackIn_67_3, stackIn_67_4, -1);
                      oo.b(var21);
                      if (!hh.field_b) {
                        break L55;
                      } else {
                        if (!sq.field_N) {
                          break L55;
                        } else {
                          if (df.field_I) {
                            break L55;
                          } else {
                            stackIn_72_0 = 1;
                            break L54;
                          }
                        }
                      }
                    }
                    stackIn_72_0 = 0;
                    break L54;
                  }
                  L56: {
                    L57: {
                      var9 = stackIn_72_0;
                      if (!param0) {
                        break L57;
                      } else {
                        if (!vk.i((byte) -39)) {
                          break L57;
                        } else {
                          if (var9 != 0) {
                            break L57;
                          } else {
                            stackIn_77_0 = 1;
                            break L56;
                          }
                        }
                      }
                    }
                    stackIn_77_0 = 0;
                    break L56;
                  }
                  L58: {
                    dd.a(stackIn_77_0 != 0, 0);
                    if (!re.field_b) {
                      break L58;
                    } else {
                      if (var9 != 0) {
                        if (!param0) {
                          kg.a(false, (byte) 117);
                          return;
                        } else {
                          if (!vk.i((byte) -39)) {
                            kg.a(false, (byte) 117);
                            return;
                          } else {
                            stackIn_85_0 = 1;
                            kg.a(stackIn_85_0 != 0, (byte) 117);
                            break L58;
                          }
                        }
                      } else {
                        break L58;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          L59: {
            L60: {
              field_k = (ja[]) null;
              if (null == op.field_m) {
                break L60;
              } else {
                if (1 >= op.field_m.field_t) {
                  break L60;
                } else {
                  L61: {
                    if (pl.field_I != 10) {
                      stackIn_6_0 = 0;
                      break L61;
                    } else {
                      stackIn_6_0 = 1;
                      break L61;
                    }
                  }
                  L62: {
                    L63: {
                      var2 = stackIn_6_0;
                      if (!iq.field_f) {
                        break L63;
                      } else {
                        if (var2 == 0) {
                          break L63;
                        } else {
                          stackIn_10_0 = 1;
                          break L62;
                        }
                      }
                    }
                    stackIn_10_0 = 0;
                    break L62;
                  }
                  L64: {
                    L65: {
                      L66: {
                        var3 = stackIn_10_0;
                        if (!tj.field_f) {
                          break L66;
                        } else {
                          if (param0) {
                            break L65;
                          } else {
                            break L66;
                          }
                        }
                      }
                      L67: {
                        if (0 >= id.field_D) {
                          break L67;
                        } else {
                          if (20 > wf.field_m % 40) {
                            break L65;
                          } else {
                            break L67;
                          }
                        }
                      }
                      L68: {
                        if (var3 == 0) {
                          break L68;
                        } else {
                          if (-21 >= (wf.field_m % 40 ^ -1)) {
                            break L68;
                          } else {
                            break L65;
                          }
                        }
                      }
                      stackIn_21_0 = 0;
                      break L64;
                    }
                    stackIn_21_0 = 1;
                    break L64;
                  }
                  L69: {
                    var4 = stackIn_21_0;
                    if (var4 != 0) {
                      stackIn_24_0 = rl.field_a;
                      break L69;
                    } else {
                      stackIn_24_0 = oi.field_h;
                      break L69;
                    }
                  }
                  L70: {
                    var5 = stackIn_24_0;
                    var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                    var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                    s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                    var20 = new int[4];
                    oo.a(var20);
                    oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                    stackIn_26_0 = qp.field_w;

                    stackIn_26_1 = pb.field_i;

                    stackIn_26_2 = -var5[2].field_x + 635;

                    stackIn_26_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                    if (var4 == 0) {
                      stackIn_27_0 = (ef) ((Object) stackIn_26_0);
                      stackIn_27_1 = (String) ((Object) stackIn_26_1);
                      stackIn_27_2 = stackIn_26_2;
                      stackIn_27_3 = stackIn_26_3;
                      stackIn_27_4 = 16777215;
                      break L70;
                    } else {
                      stackIn_27_0 = (ef) ((Object) stackIn_26_0);
                      stackIn_27_1 = (String) ((Object) stackIn_26_1);
                      stackIn_27_2 = stackIn_26_2;
                      stackIn_27_3 = stackIn_26_3;
                      stackIn_27_4 = 1;
                      break L70;
                    }
                  }
                  L71: {
                    L72: {
                      ((ef) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, -1);
                      oo.b(var20);
                      if (!hh.field_b) {
                        break L72;
                      } else {
                        if (!sq.field_N) {
                          break L72;
                        } else {
                          if (df.field_I) {
                            break L72;
                          } else {
                            stackIn_32_0 = 1;
                            break L71;
                          }
                        }
                      }
                    }
                    stackIn_32_0 = 0;
                    break L71;
                  }
                  L73: {
                    L74: {
                      var9 = stackIn_32_0;
                      if (!param0) {
                        break L74;
                      } else {
                        if (!vk.i((byte) -39)) {
                          break L74;
                        } else {
                          if (var9 != 0) {
                            break L74;
                          } else {
                            stackIn_37_0 = 1;
                            break L73;
                          }
                        }
                      }
                    }
                    stackIn_37_0 = 0;
                    break L73;
                  }
                  dd.a(stackIn_37_0 != 0, 0);
                  if (!re.field_b) {
                    break L60;
                  } else {
                    if (var9 != 0) {
                      if (!param0) {
                        kg.a(false, (byte) 117);
                        break L59;
                      } else {
                        if (!vk.i((byte) -39)) {
                          kg.a(false, (byte) 117);
                          break L59;
                        } else {
                          stackIn_45_0 = 1;
                          kg.a(stackIn_45_0 != 0, (byte) 117);
                          break L60;
                        }
                      }
                    } else {
                      break L59;
                    }
                  }
                }
              }
            }
            break L59;
          }
          return;
        }
    }

    private final int a(int param0) {
        if (param0 != -29394) {
            return -57;
        }
        return 0;
    }

    public static void a(byte param0) {
        field_f = null;
        field_i = null;
        field_j = null;
        field_k = null;
        if (param0 > -41) {
            field_j = (String) null;
        }
    }

    final static void a(byte param0, boolean param1) {
        int var2;
        int var3;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param1) {
            io.field_b = false;
            break L0;
          } else {
            if (mh.field_c == null) {
              io.field_b = false;
              break L0;
            } else {
              L1: {
                L2: {
                  if (!param1) {
                    break L2;
                  } else {
                    L3: {
                      if (-1 > (mh.field_h ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          if (0 >= sq.field_Q) {
                            break L4;
                          } else {
                            sq.field_Q = sq.field_Q - 1;
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (da.field_a <= 0) {
                          break L1;
                        } else {
                          da.field_a = da.field_a - 1;
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    mh.field_h = mh.field_h - 1;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (null != mh.field_c) {
                  if (mh.field_h > 0) {
                    mh.field_h = mh.field_h - 1;
                    var2 = -72 / ((-39 - param0) / 44);
                    return;
                  } else {
                    L5: {
                      if (-1 > (sq.field_Q ^ -1)) {
                        break L5;
                      } else {
                        if (da.field_a < b.field_d) {
                          if ((da.field_a ^ -1) != -1) {
                            da.field_a = da.field_a + 1;
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L5;
                            }
                          } else {
                            L6: {
                              jq.a(false, (byte) -20);
                              da.field_a = da.field_a + 1;
                              if (var3 == 0) {
                                break L6;
                              } else {
                                sq.field_Q = sq.field_Q - 1;
                                if (var3 == 0) {
                                  break L6;
                                } else {
                                  mh.field_h = mh.field_h - 1;
                                  break L6;
                                }
                              }
                            }
                            var2 = -72 / ((-39 - param0) / 44);
                            return;
                          }
                        } else {
                          var2 = -72 / ((-39 - param0) / 44);
                          return;
                        }
                      }
                    }
                    sq.field_Q = sq.field_Q - 1;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      mh.field_h = mh.field_h - 1;
                      var2 = -72 / ((-39 - param0) / 44);
                      return;
                    }
                  }
                } else {
                  L7: {
                    if (ej.field_n == null) {
                      break L7;
                    } else {
                      L8: {
                        if (0 < mh.field_h) {
                          break L8;
                        } else {
                          L9: {
                            if ((da.field_a ^ -1) >= -1) {
                              break L9;
                            } else {
                              da.field_a = da.field_a - 1;
                              if (var3 == 0) {
                                break L1;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if ((sq.field_Q ^ -1) > (b.field_d ^ -1)) {
                            L10: {
                              if (0 != sq.field_Q) {
                                break L10;
                              } else {
                                jq.a(true, (byte) 126);
                                break L10;
                              }
                            }
                            sq.field_Q = sq.field_Q + 1;
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L8;
                            }
                          } else {
                            break L1;
                          }
                        }
                      }
                      mh.field_h = mh.field_h - 1;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L11: {
                    io.field_b = false;
                    if (-1 > (sq.field_Q ^ -1)) {
                      break L11;
                    } else {
                      if ((da.field_a ^ -1) >= -1) {
                        if ((mh.field_h ^ -1) <= (b.field_d ^ -1)) {
                          break L1;
                        } else {
                          if (0 != mh.field_h) {
                            mh.field_h = mh.field_h + 1;
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L11;
                            }
                          } else {
                            L12: {
                              wf.a(6835);
                              mh.field_h = mh.field_h + 1;
                              if (var3 == 0) {
                                break L12;
                              } else {
                                sq.field_Q = sq.field_Q - 1;
                                if (var3 == 0) {
                                  break L12;
                                } else {
                                  L13: {
                                    if (mh.field_h > 0) {
                                      break L13;
                                    } else {
                                      L14: {
                                        if (-1 > (sq.field_Q ^ -1)) {
                                          break L14;
                                        } else {
                                          if (da.field_a < b.field_d) {
                                            L15: {
                                              if ((da.field_a ^ -1) != -1) {
                                                break L15;
                                              } else {
                                                jq.a(false, (byte) -20);
                                                break L15;
                                              }
                                            }
                                            da.field_a = da.field_a + 1;
                                            if (var3 == 0) {
                                              break L12;
                                            } else {
                                              break L14;
                                            }
                                          } else {
                                            var2 = -72 / ((-39 - param0) / 44);
                                            return;
                                          }
                                        }
                                      }
                                      sq.field_Q = sq.field_Q - 1;
                                      if (var3 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  mh.field_h = mh.field_h - 1;
                                  break L12;
                                }
                              }
                            }
                            var2 = -72 / ((-39 - param0) / 44);
                            return;
                          }
                        }
                      } else {
                        da.field_a = da.field_a - 1;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          L16: {
                            if ((mh.field_h ^ -1) <= (b.field_d ^ -1)) {
                              break L16;
                            } else {
                              L17: {
                                if (0 != mh.field_h) {
                                  break L17;
                                } else {
                                  wf.a(6835);
                                  break L17;
                                }
                              }
                              mh.field_h = mh.field_h + 1;
                              if (var3 == 0) {
                                break L16;
                              } else {
                                sq.field_Q = sq.field_Q - 1;
                                if (var3 == 0) {
                                  break L16;
                                } else {
                                  L18: {
                                    if (mh.field_h > 0) {
                                      break L18;
                                    } else {
                                      L19: {
                                        if (-1 > (sq.field_Q ^ -1)) {
                                          break L19;
                                        } else {
                                          if (da.field_a < b.field_d) {
                                            L20: {
                                              if ((da.field_a ^ -1) != -1) {
                                                break L20;
                                              } else {
                                                jq.a(false, (byte) -20);
                                                break L20;
                                              }
                                            }
                                            da.field_a = da.field_a + 1;
                                            if (var3 == 0) {
                                              break L16;
                                            } else {
                                              break L19;
                                            }
                                          } else {
                                            var2 = -72 / ((-39 - param0) / 44);
                                            return;
                                          }
                                        }
                                      }
                                      sq.field_Q = sq.field_Q - 1;
                                      if (var3 == 0) {
                                        break L16;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  mh.field_h = mh.field_h - 1;
                                  break L16;
                                }
                              }
                            }
                          }
                          var2 = -72 / ((-39 - param0) / 44);
                          return;
                        }
                      }
                    }
                  }
                  sq.field_Q = sq.field_Q - 1;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    L21: {
                      L22: {
                        if (mh.field_h > 0) {
                          break L22;
                        } else {
                          L23: {
                            if (-1 > (sq.field_Q ^ -1)) {
                              break L23;
                            } else {
                              if (da.field_a < b.field_d) {
                                L24: {
                                  if ((da.field_a ^ -1) != -1) {
                                    break L24;
                                  } else {
                                    jq.a(false, (byte) -20);
                                    break L24;
                                  }
                                }
                                da.field_a = da.field_a + 1;
                                if (var3 == 0) {
                                  break L21;
                                } else {
                                  break L23;
                                }
                              } else {
                                var2 = -72 / ((-39 - param0) / 44);
                                return;
                              }
                            }
                          }
                          sq.field_Q = sq.field_Q - 1;
                          if (var3 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      mh.field_h = mh.field_h - 1;
                      break L21;
                    }
                    var2 = -72 / ((-39 - param0) / 44);
                    return;
                  }
                }
              }
              var2 = -72 / ((-39 - param0) / 44);
              return;
            }
          }
        }
        if (param1) {
          L25: {
            L26: {
              if (-1 > (mh.field_h ^ -1)) {
                break L26;
              } else {
                L27: {
                  if (0 >= sq.field_Q) {
                    break L27;
                  } else {
                    sq.field_Q = sq.field_Q - 1;
                    if (var3 != 0) {
                      break L27;
                    } else {
                      var2 = -72 / ((-39 - param0) / 44);
                      return;
                    }
                  }
                }
                if (da.field_a > 0) {
                  da.field_a = da.field_a - 1;
                  if (var3 == 0) {
                    break L25;
                  } else {
                    break L26;
                  }
                } else {
                  var2 = -72 / ((-39 - param0) / 44);
                  return;
                }
              }
            }
            mh.field_h = mh.field_h - 1;
            if (var3 == 0) {
              break L25;
            } else {
              if (null != mh.field_c) {
                if (mh.field_h > 0) {
                  mh.field_h = mh.field_h - 1;
                  var2 = -72 / ((-39 - param0) / 44);
                  return;
                } else {
                  L28: {
                    if (-1 > (sq.field_Q ^ -1)) {
                      break L28;
                    } else {
                      if (da.field_a < b.field_d) {
                        if ((da.field_a ^ -1) != -1) {
                          da.field_a = da.field_a + 1;
                          if (var3 == 0) {
                            break L25;
                          } else {
                            break L28;
                          }
                        } else {
                          L29: {
                            jq.a(false, (byte) -20);
                            da.field_a = da.field_a + 1;
                            if (var3 == 0) {
                              break L29;
                            } else {
                              sq.field_Q = sq.field_Q - 1;
                              if (var3 == 0) {
                                break L29;
                              } else {
                                mh.field_h = mh.field_h - 1;
                                var2 = -72 / ((-39 - param0) / 44);
                                return;
                              }
                            }
                          }
                          var2 = -72 / ((-39 - param0) / 44);
                          return;
                        }
                      } else {
                        var2 = -72 / ((-39 - param0) / 44);
                        return;
                      }
                    }
                  }
                  sq.field_Q = sq.field_Q - 1;
                  if (var3 == 0) {
                    break L25;
                  } else {
                    mh.field_h = mh.field_h - 1;
                    var2 = -72 / ((-39 - param0) / 44);
                    return;
                  }
                }
              } else {
                L30: {
                  if (ej.field_n == null) {
                    break L30;
                  } else {
                    L31: {
                      if (0 < mh.field_h) {
                        break L31;
                      } else {
                        L32: {
                          if ((da.field_a ^ -1) >= -1) {
                            break L32;
                          } else {
                            da.field_a = da.field_a - 1;
                            if (var3 == 0) {
                              break L25;
                            } else {
                              break L32;
                            }
                          }
                        }
                        if ((sq.field_Q ^ -1) > (b.field_d ^ -1)) {
                          L33: {
                            if (0 != sq.field_Q) {
                              break L33;
                            } else {
                              jq.a(true, (byte) 126);
                              break L33;
                            }
                          }
                          sq.field_Q = sq.field_Q + 1;
                          if (var3 == 0) {
                            break L25;
                          } else {
                            break L31;
                          }
                        } else {
                          var2 = -72 / ((-39 - param0) / 44);
                          return;
                        }
                      }
                    }
                    mh.field_h = mh.field_h - 1;
                    if (var3 == 0) {
                      break L25;
                    } else {
                      break L30;
                    }
                  }
                }
                L34: {
                  io.field_b = false;
                  if (-1 > (sq.field_Q ^ -1)) {
                    break L34;
                  } else {
                    if ((da.field_a ^ -1) >= -1) {
                      if ((mh.field_h ^ -1) <= (b.field_d ^ -1)) {
                        break L25;
                      } else {
                        if (0 != mh.field_h) {
                          mh.field_h = mh.field_h + 1;
                          if (var3 == 0) {
                            break L25;
                          } else {
                            break L34;
                          }
                        } else {
                          L35: {
                            wf.a(6835);
                            mh.field_h = mh.field_h + 1;
                            if (var3 == 0) {
                              break L35;
                            } else {
                              sq.field_Q = sq.field_Q - 1;
                              if (var3 == 0) {
                                break L35;
                              } else {
                                if (mh.field_h > 0) {
                                  mh.field_h = mh.field_h - 1;
                                  var2 = -72 / ((-39 - param0) / 44);
                                  return;
                                } else {
                                  L36: {
                                    if (-1 > (sq.field_Q ^ -1)) {
                                      break L36;
                                    } else {
                                      if (da.field_a < b.field_d) {
                                        L37: {
                                          if ((da.field_a ^ -1) != -1) {
                                            break L37;
                                          } else {
                                            jq.a(false, (byte) -20);
                                            break L37;
                                          }
                                        }
                                        da.field_a = da.field_a + 1;
                                        if (var3 == 0) {
                                          break L35;
                                        } else {
                                          break L36;
                                        }
                                      } else {
                                        var2 = -72 / ((-39 - param0) / 44);
                                        return;
                                      }
                                    }
                                  }
                                  sq.field_Q = sq.field_Q - 1;
                                  if (var3 == 0) {
                                    break L35;
                                  } else {
                                    mh.field_h = mh.field_h - 1;
                                    var2 = -72 / ((-39 - param0) / 44);
                                    return;
                                  }
                                }
                              }
                            }
                          }
                          var2 = -72 / ((-39 - param0) / 44);
                          return;
                        }
                      }
                    } else {
                      da.field_a = da.field_a - 1;
                      if (var3 == 0) {
                        break L25;
                      } else {
                        L38: {
                          if ((mh.field_h ^ -1) <= (b.field_d ^ -1)) {
                            break L38;
                          } else {
                            L39: {
                              if (0 != mh.field_h) {
                                break L39;
                              } else {
                                wf.a(6835);
                                break L39;
                              }
                            }
                            mh.field_h = mh.field_h + 1;
                            if (var3 == 0) {
                              break L38;
                            } else {
                              sq.field_Q = sq.field_Q - 1;
                              if (var3 == 0) {
                                break L38;
                              } else {
                                L40: {
                                  if (mh.field_h > 0) {
                                    break L40;
                                  } else {
                                    L41: {
                                      if (-1 > (sq.field_Q ^ -1)) {
                                        break L41;
                                      } else {
                                        if (da.field_a < b.field_d) {
                                          L42: {
                                            if ((da.field_a ^ -1) != -1) {
                                              break L42;
                                            } else {
                                              jq.a(false, (byte) -20);
                                              break L42;
                                            }
                                          }
                                          da.field_a = da.field_a + 1;
                                          if (var3 == 0) {
                                            break L38;
                                          } else {
                                            break L41;
                                          }
                                        } else {
                                          var2 = -72 / ((-39 - param0) / 44);
                                          return;
                                        }
                                      }
                                    }
                                    sq.field_Q = sq.field_Q - 1;
                                    if (var3 == 0) {
                                      break L38;
                                    } else {
                                      break L40;
                                    }
                                  }
                                }
                                mh.field_h = mh.field_h - 1;
                                break L38;
                              }
                            }
                          }
                        }
                        var2 = -72 / ((-39 - param0) / 44);
                        return;
                      }
                    }
                  }
                }
                sq.field_Q = sq.field_Q - 1;
                if (var3 == 0) {
                  break L25;
                } else {
                  if (mh.field_h > 0) {
                    mh.field_h = mh.field_h - 1;
                    var2 = -72 / ((-39 - param0) / 44);
                    return;
                  } else {
                    L43: {
                      L44: {
                        if (-1 > (sq.field_Q ^ -1)) {
                          break L44;
                        } else {
                          if (da.field_a < b.field_d) {
                            if ((da.field_a ^ -1) != -1) {
                              da.field_a = da.field_a + 1;
                              if (var3 == 0) {
                                break L43;
                              } else {
                                break L44;
                              }
                            } else {
                              L45: {
                                jq.a(false, (byte) -20);
                                da.field_a = da.field_a + 1;
                                if (var3 == 0) {
                                  break L45;
                                } else {
                                  sq.field_Q = sq.field_Q - 1;
                                  if (var3 == 0) {
                                    break L45;
                                  } else {
                                    mh.field_h = mh.field_h - 1;
                                    var2 = -72 / ((-39 - param0) / 44);
                                    return;
                                  }
                                }
                              }
                              var2 = -72 / ((-39 - param0) / 44);
                              return;
                            }
                          } else {
                            var2 = -72 / ((-39 - param0) / 44);
                            return;
                          }
                        }
                      }
                      sq.field_Q = sq.field_Q - 1;
                      if (var3 == 0) {
                        break L43;
                      } else {
                        mh.field_h = mh.field_h - 1;
                        var2 = -72 / ((-39 - param0) / 44);
                        return;
                      }
                    }
                    var2 = -72 / ((-39 - param0) / 44);
                    return;
                  }
                }
              }
            }
          }
          var2 = -72 / ((-39 - param0) / 44);
          return;
        } else {
          L46: {
            if (null != mh.field_c) {
              if (mh.field_h > 0) {
                mh.field_h = mh.field_h - 1;
                var2 = -72 / ((-39 - param0) / 44);
                return;
              } else {
                L47: {
                  if (-1 > (sq.field_Q ^ -1)) {
                    break L47;
                  } else {
                    if (da.field_a < b.field_d) {
                      if ((da.field_a ^ -1) != -1) {
                        da.field_a = da.field_a + 1;
                        if (var3 == 0) {
                          break L46;
                        } else {
                          break L47;
                        }
                      } else {
                        L48: {
                          jq.a(false, (byte) -20);
                          da.field_a = da.field_a + 1;
                          if (var3 == 0) {
                            break L48;
                          } else {
                            sq.field_Q = sq.field_Q - 1;
                            if (var3 == 0) {
                              break L48;
                            } else {
                              mh.field_h = mh.field_h - 1;
                              break L48;
                            }
                          }
                        }
                        var2 = -72 / ((-39 - param0) / 44);
                        return;
                      }
                    } else {
                      var2 = -72 / ((-39 - param0) / 44);
                      return;
                    }
                  }
                }
                sq.field_Q = sq.field_Q - 1;
                if (var3 == 0) {
                  break L46;
                } else {
                  mh.field_h = mh.field_h - 1;
                  var2 = -72 / ((-39 - param0) / 44);
                  return;
                }
              }
            } else {
              L49: {
                if (ej.field_n == null) {
                  break L49;
                } else {
                  L50: {
                    if (0 < mh.field_h) {
                      break L50;
                    } else {
                      L51: {
                        if ((da.field_a ^ -1) >= -1) {
                          break L51;
                        } else {
                          da.field_a = da.field_a - 1;
                          if (var3 == 0) {
                            break L46;
                          } else {
                            break L51;
                          }
                        }
                      }
                      if ((sq.field_Q ^ -1) > (b.field_d ^ -1)) {
                        L52: {
                          if (0 != sq.field_Q) {
                            break L52;
                          } else {
                            jq.a(true, (byte) 126);
                            break L52;
                          }
                        }
                        sq.field_Q = sq.field_Q + 1;
                        if (var3 == 0) {
                          break L46;
                        } else {
                          break L50;
                        }
                      } else {
                        break L46;
                      }
                    }
                  }
                  mh.field_h = mh.field_h - 1;
                  if (var3 == 0) {
                    break L46;
                  } else {
                    break L49;
                  }
                }
              }
              L53: {
                io.field_b = false;
                if (-1 > (sq.field_Q ^ -1)) {
                  break L53;
                } else {
                  if ((da.field_a ^ -1) >= -1) {
                    if ((mh.field_h ^ -1) <= (b.field_d ^ -1)) {
                      break L46;
                    } else {
                      if (0 != mh.field_h) {
                        mh.field_h = mh.field_h + 1;
                        if (var3 == 0) {
                          break L46;
                        } else {
                          break L53;
                        }
                      } else {
                        L54: {
                          wf.a(6835);
                          mh.field_h = mh.field_h + 1;
                          if (var3 == 0) {
                            break L54;
                          } else {
                            sq.field_Q = sq.field_Q - 1;
                            if (var3 == 0) {
                              break L54;
                            } else {
                              L55: {
                                if (mh.field_h > 0) {
                                  break L55;
                                } else {
                                  L56: {
                                    if (-1 > (sq.field_Q ^ -1)) {
                                      break L56;
                                    } else {
                                      if (da.field_a < b.field_d) {
                                        L57: {
                                          if ((da.field_a ^ -1) != -1) {
                                            break L57;
                                          } else {
                                            jq.a(false, (byte) -20);
                                            break L57;
                                          }
                                        }
                                        da.field_a = da.field_a + 1;
                                        if (var3 == 0) {
                                          break L54;
                                        } else {
                                          break L56;
                                        }
                                      } else {
                                        var2 = -72 / ((-39 - param0) / 44);
                                        return;
                                      }
                                    }
                                  }
                                  sq.field_Q = sq.field_Q - 1;
                                  if (var3 == 0) {
                                    break L54;
                                  } else {
                                    break L55;
                                  }
                                }
                              }
                              mh.field_h = mh.field_h - 1;
                              break L54;
                            }
                          }
                        }
                        var2 = -72 / ((-39 - param0) / 44);
                        return;
                      }
                    }
                  } else {
                    da.field_a = da.field_a - 1;
                    if (var3 == 0) {
                      break L46;
                    } else {
                      L58: {
                        if ((mh.field_h ^ -1) <= (b.field_d ^ -1)) {
                          break L58;
                        } else {
                          L59: {
                            if (0 != mh.field_h) {
                              break L59;
                            } else {
                              wf.a(6835);
                              break L59;
                            }
                          }
                          mh.field_h = mh.field_h + 1;
                          if (var3 == 0) {
                            break L58;
                          } else {
                            sq.field_Q = sq.field_Q - 1;
                            if (var3 == 0) {
                              break L58;
                            } else {
                              L60: {
                                if (mh.field_h > 0) {
                                  break L60;
                                } else {
                                  L61: {
                                    if (-1 > (sq.field_Q ^ -1)) {
                                      break L61;
                                    } else {
                                      if (da.field_a < b.field_d) {
                                        L62: {
                                          if ((da.field_a ^ -1) != -1) {
                                            break L62;
                                          } else {
                                            jq.a(false, (byte) -20);
                                            break L62;
                                          }
                                        }
                                        da.field_a = da.field_a + 1;
                                        if (var3 == 0) {
                                          break L58;
                                        } else {
                                          break L61;
                                        }
                                      } else {
                                        var2 = -72 / ((-39 - param0) / 44);
                                        return;
                                      }
                                    }
                                  }
                                  sq.field_Q = sq.field_Q - 1;
                                  if (var3 == 0) {
                                    break L58;
                                  } else {
                                    break L60;
                                  }
                                }
                              }
                              mh.field_h = mh.field_h - 1;
                              break L58;
                            }
                          }
                        }
                      }
                      var2 = -72 / ((-39 - param0) / 44);
                      return;
                    }
                  }
                }
              }
              sq.field_Q = sq.field_Q - 1;
              if (var3 == 0) {
                break L46;
              } else {
                L63: {
                  L64: {
                    if (mh.field_h > 0) {
                      break L64;
                    } else {
                      L65: {
                        if (-1 > (sq.field_Q ^ -1)) {
                          break L65;
                        } else {
                          if (da.field_a < b.field_d) {
                            L66: {
                              if ((da.field_a ^ -1) != -1) {
                                break L66;
                              } else {
                                jq.a(false, (byte) -20);
                                break L66;
                              }
                            }
                            da.field_a = da.field_a + 1;
                            if (var3 == 0) {
                              break L63;
                            } else {
                              break L65;
                            }
                          } else {
                            var2 = -72 / ((-39 - param0) / 44);
                            return;
                          }
                        }
                      }
                      sq.field_Q = sq.field_Q - 1;
                      if (var3 == 0) {
                        break L63;
                      } else {
                        break L64;
                      }
                    }
                  }
                  mh.field_h = mh.field_h - 1;
                  break L63;
                }
                var2 = -72 / ((-39 - param0) / 44);
                return;
              }
            }
          }
          var2 = -72 / ((-39 - param0) / 44);
          return;
        }
    }

    ui(int param0, int param1, int param2) {
        this.field_l = param0;
        this.field_g = param1;
        this.field_h = 24 * this.field_l - (-12 + -this.a(-29394));
        this.field_m = 12 + (24 * this.field_g - -this.a(-29394));
    }

    static {
        field_f = new int[]{280, 180, 180, 180, 180, 180};
        field_i = new int[]{3, 3, 2, 3, 3, 4, 3, 3, 2, 2, 2, 4, 3, 3, 3, 3};
    }
}
