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
        } else {
          return 16711935 & 15 * (16711935 & param0) >> 450340772 | (param0 & 65280) * 15 >> -772990300 & 65280;
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4;
        var4 = -3 % ((-42 - param0) / 33);
        if (-31 < (Math.abs(param1 + -this.field_h) ^ -1)) {
          if ((Math.abs(-this.field_m + param2) ^ -1) <= -31) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(boolean param0, boolean param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_26_0 = 0;
        ja[] stackIn_29_0 = null;
        ef stackIn_31_0;
        String stackIn_31_1;
        int stackIn_31_2;
        int stackIn_31_3;
        ef stackIn_32_0 = null;
        String stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_80_0 = 0;
        ja[] stackIn_83_0 = null;
        ef stackIn_85_0;
        String stackIn_85_1;
        int stackIn_85_2;
        int stackIn_85_3;
        ef stackIn_86_0 = null;
        String stackIn_86_1 = null;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        int stackIn_86_4 = 0;
        int stackIn_93_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_106_0 = 0;
        ja[] stackIn_112_0 = null;
        ef stackIn_114_0;
        String stackIn_114_1;
        int stackIn_114_2;
        int stackIn_114_3;
        ef stackIn_115_0 = null;
        String stackIn_115_1 = null;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        int stackIn_115_4 = 0;
        int stackIn_122_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_137_0 = 0;
        ja[] stackIn_145_0 = null;
        ef stackIn_147_0;
        String stackIn_147_1;
        int stackIn_147_2;
        int stackIn_147_3;
        ef stackIn_148_0 = null;
        String stackIn_148_1 = null;
        int stackIn_148_2 = 0;
        int stackIn_148_3 = 0;
        int stackIn_148_4 = 0;
        int stackIn_155_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_177_0 = 0;
        ja[] stackIn_180_0 = null;
        ef stackIn_182_0;
        String stackIn_182_1;
        int stackIn_182_2;
        int stackIn_182_3;
        ef stackIn_183_0 = null;
        String stackIn_183_1 = null;
        int stackIn_183_2 = 0;
        int stackIn_183_3 = 0;
        int stackIn_183_4 = 0;
        int stackIn_191_0 = 0;
        int stackIn_196_0 = 0;
        int stackIn_206_0 = 0;
        ja[] stackIn_212_0 = null;
        ef stackIn_214_0;
        String stackIn_214_1;
        int stackIn_214_2;
        int stackIn_214_3;
        ef stackIn_215_0 = null;
        String stackIn_215_1 = null;
        int stackIn_215_2 = 0;
        int stackIn_215_3 = 0;
        int stackIn_215_4 = 0;
        int stackIn_222_0 = 0;
        int stackIn_227_0 = 0;
        int stackIn_237_0 = 0;
        ja[] stackIn_242_0 = null;
        ef stackIn_244_0;
        String stackIn_244_1;
        int stackIn_244_2;
        int stackIn_244_3;
        ef stackIn_245_0 = null;
        String stackIn_245_1 = null;
        int stackIn_245_2 = 0;
        int stackIn_245_3 = 0;
        int stackIn_245_4 = 0;
        int stackIn_252_0 = 0;
        int stackIn_257_0 = 0;
        int stackIn_267_0 = 0;
        ja[] stackIn_271_0 = null;
        ef stackIn_273_0;
        String stackIn_273_1;
        int stackIn_273_2;
        int stackIn_273_3;
        ef stackIn_274_0 = null;
        String stackIn_274_1 = null;
        int stackIn_274_2 = 0;
        int stackIn_274_3 = 0;
        int stackIn_274_4 = 0;
        int stackIn_281_0 = 0;
        int stackIn_286_0 = 0;
        int stackIn_296_0 = 0;
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
                  stackIn_63_0 = 0;
                  break L0;
                } else {
                  stackIn_63_0 = 1;
                  break L0;
                }
              }
              L1: {
                var2 = stackIn_63_0;
                if (iq.field_f) {
                  if (var2 == 0) {
                    stackIn_68_0 = 0;
                    break L1;
                  } else {
                    stackIn_68_0 = 1;
                    break L1;
                  }
                } else {
                  stackIn_68_0 = 0;
                  break L1;
                }
              }
              var3 = stackIn_68_0;
              if (!tj.field_f) {
                if (0 >= id.field_D) {
                  if (var3 != 0) {
                    if (-21 < (wf.field_m % 40 ^ -1)) {
                      L2: {
                        var4 = 1;
                        if (var4 != 0) {
                          stackIn_271_0 = rl.field_a;
                          break L2;
                        } else {
                          stackIn_271_0 = oi.field_h;
                          break L2;
                        }
                      }
                      L3: {
                        var5 = stackIn_271_0;
                        var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                        var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                        s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                        var19 = new int[4];
                        var11 = var19;
                        oo.a(var19);
                        oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                        stackIn_273_0 = qp.field_w;

                        stackIn_273_1 = pb.field_i;

                        stackIn_273_2 = -var5[2].field_x + 635;

                        stackIn_273_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                        if (var4 == 0) {
                          stackIn_274_0 = (ef) ((Object) stackIn_273_0);
                          stackIn_274_1 = (String) ((Object) stackIn_273_1);
                          stackIn_274_2 = stackIn_273_2;
                          stackIn_274_3 = stackIn_273_3;
                          stackIn_274_4 = 16777215;
                          break L3;
                        } else {
                          stackIn_274_0 = (ef) ((Object) stackIn_273_0);
                          stackIn_274_1 = (String) ((Object) stackIn_273_1);
                          stackIn_274_2 = stackIn_273_2;
                          stackIn_274_3 = stackIn_273_3;
                          stackIn_274_4 = 1;
                          break L3;
                        }
                      }
                      L4: {
                        ((ef) (Object) stackIn_274_0).a(stackIn_274_1, stackIn_274_2, stackIn_274_3, stackIn_274_4, -1);
                        oo.b(var19);
                        if (hh.field_b) {
                          if (sq.field_N) {
                            if (df.field_I) {
                              stackIn_281_0 = 0;
                              break L4;
                            } else {
                              stackIn_281_0 = 1;
                              break L4;
                            }
                          } else {
                            stackIn_281_0 = 0;
                            break L4;
                          }
                        } else {
                          stackIn_281_0 = 0;
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          var9 = stackIn_281_0;
                          if (!param0) {
                            break L6;
                          } else {
                            if (!vk.i((byte) -39)) {
                              break L6;
                            } else {
                              if (var9 != 0) {
                                break L6;
                              } else {
                                stackIn_286_0 = 1;
                                break L5;
                              }
                            }
                          }
                        }
                        stackIn_286_0 = 0;
                        break L5;
                      }
                      dd.a(stackIn_286_0 != 0, 0);
                      if (re.field_b) {
                        if (var9 != 0) {
                          if (param0) {
                            if (vk.i((byte) -39)) {
                              stackIn_296_0 = 1;
                              kg.a(stackIn_296_0 != 0, (byte) 117);
                              return;
                            } else {
                              kg.a(false, (byte) 117);
                              return;
                            }
                          } else {
                            kg.a(false, (byte) 117);
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      L7: {
                        var4 = 0;
                        if (var4 != 0) {
                          stackIn_242_0 = rl.field_a;
                          break L7;
                        } else {
                          stackIn_242_0 = oi.field_h;
                          break L7;
                        }
                      }
                      L8: {
                        var5 = stackIn_242_0;
                        var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                        var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                        s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                        var26 = new int[4];
                        oo.a(var26);
                        oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                        stackIn_244_0 = qp.field_w;

                        stackIn_244_1 = pb.field_i;

                        stackIn_244_2 = -var5[2].field_x + 635;

                        stackIn_244_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                        if (var4 == 0) {
                          stackIn_245_0 = (ef) ((Object) stackIn_244_0);
                          stackIn_245_1 = (String) ((Object) stackIn_244_1);
                          stackIn_245_2 = stackIn_244_2;
                          stackIn_245_3 = stackIn_244_3;
                          stackIn_245_4 = 16777215;
                          break L8;
                        } else {
                          stackIn_245_0 = (ef) ((Object) stackIn_244_0);
                          stackIn_245_1 = (String) ((Object) stackIn_244_1);
                          stackIn_245_2 = stackIn_244_2;
                          stackIn_245_3 = stackIn_244_3;
                          stackIn_245_4 = 1;
                          break L8;
                        }
                      }
                      L9: {
                        ((ef) (Object) stackIn_245_0).a(stackIn_245_1, stackIn_245_2, stackIn_245_3, stackIn_245_4, -1);
                        oo.b(var26);
                        if (hh.field_b) {
                          if (sq.field_N) {
                            if (df.field_I) {
                              stackIn_252_0 = 0;
                              break L9;
                            } else {
                              stackIn_252_0 = 1;
                              break L9;
                            }
                          } else {
                            stackIn_252_0 = 0;
                            break L9;
                          }
                        } else {
                          stackIn_252_0 = 0;
                          break L9;
                        }
                      }
                      L10: {
                        L11: {
                          var9 = stackIn_252_0;
                          if (!param0) {
                            break L11;
                          } else {
                            if (!vk.i((byte) -39)) {
                              break L11;
                            } else {
                              if (var9 != 0) {
                                break L11;
                              } else {
                                stackIn_257_0 = 1;
                                break L10;
                              }
                            }
                          }
                        }
                        stackIn_257_0 = 0;
                        break L10;
                      }
                      dd.a(stackIn_257_0 != 0, 0);
                      if (re.field_b) {
                        if (var9 != 0) {
                          if (param0) {
                            if (vk.i((byte) -39)) {
                              stackIn_267_0 = 1;
                              kg.a(stackIn_267_0 != 0, (byte) 117);
                              return;
                            } else {
                              kg.a(false, (byte) 117);
                              return;
                            }
                          } else {
                            kg.a(false, (byte) 117);
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
                    L12: {
                      var4 = 0;
                      if (var4 != 0) {
                        stackIn_212_0 = rl.field_a;
                        break L12;
                      } else {
                        stackIn_212_0 = oi.field_h;
                        break L12;
                      }
                    }
                    L13: {
                      var5 = stackIn_212_0;
                      var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                      var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                      s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                      var25 = new int[4];
                      oo.a(var25);
                      oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                      stackIn_214_0 = qp.field_w;

                      stackIn_214_1 = pb.field_i;

                      stackIn_214_2 = -var5[2].field_x + 635;

                      stackIn_214_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                      if (var4 == 0) {
                        stackIn_215_0 = (ef) ((Object) stackIn_214_0);
                        stackIn_215_1 = (String) ((Object) stackIn_214_1);
                        stackIn_215_2 = stackIn_214_2;
                        stackIn_215_3 = stackIn_214_3;
                        stackIn_215_4 = 16777215;
                        break L13;
                      } else {
                        stackIn_215_0 = (ef) ((Object) stackIn_214_0);
                        stackIn_215_1 = (String) ((Object) stackIn_214_1);
                        stackIn_215_2 = stackIn_214_2;
                        stackIn_215_3 = stackIn_214_3;
                        stackIn_215_4 = 1;
                        break L13;
                      }
                    }
                    L14: {
                      ((ef) (Object) stackIn_215_0).a(stackIn_215_1, stackIn_215_2, stackIn_215_3, stackIn_215_4, -1);
                      oo.b(var25);
                      if (hh.field_b) {
                        if (sq.field_N) {
                          if (df.field_I) {
                            stackIn_222_0 = 0;
                            break L14;
                          } else {
                            stackIn_222_0 = 1;
                            break L14;
                          }
                        } else {
                          stackIn_222_0 = 0;
                          break L14;
                        }
                      } else {
                        stackIn_222_0 = 0;
                        break L14;
                      }
                    }
                    L15: {
                      L16: {
                        var9 = stackIn_222_0;
                        if (!param0) {
                          break L16;
                        } else {
                          if (!vk.i((byte) -39)) {
                            break L16;
                          } else {
                            if (var9 != 0) {
                              break L16;
                            } else {
                              stackIn_227_0 = 1;
                              break L15;
                            }
                          }
                        }
                      }
                      stackIn_227_0 = 0;
                      break L15;
                    }
                    dd.a(stackIn_227_0 != 0, 0);
                    if (re.field_b) {
                      if (var9 != 0) {
                        if (param0) {
                          if (vk.i((byte) -39)) {
                            stackIn_237_0 = 1;
                            kg.a(stackIn_237_0 != 0, (byte) 117);
                            return;
                          } else {
                            kg.a(false, (byte) 117);
                            return;
                          }
                        } else {
                          kg.a(false, (byte) 117);
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
                  if (20 <= wf.field_m % 40) {
                    L17: {
                      if (var3 != 0) {
                        if (-21 >= (wf.field_m % 40 ^ -1)) {
                          stackIn_177_0 = 0;
                          break L17;
                        } else {
                          stackIn_177_0 = 1;
                          break L17;
                        }
                      } else {
                        stackIn_177_0 = 0;
                        break L17;
                      }
                    }
                    L18: {
                      var4 = stackIn_177_0;
                      if (var4 != 0) {
                        stackIn_180_0 = rl.field_a;
                        break L18;
                      } else {
                        stackIn_180_0 = oi.field_h;
                        break L18;
                      }
                    }
                    L19: {
                      var5 = stackIn_180_0;
                      var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                      var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                      s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                      var24 = new int[4];
                      oo.a(var24);
                      oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                      stackIn_182_0 = qp.field_w;

                      stackIn_182_1 = pb.field_i;

                      stackIn_182_2 = -var5[2].field_x + 635;

                      stackIn_182_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                      if (var4 == 0) {
                        stackIn_183_0 = (ef) ((Object) stackIn_182_0);
                        stackIn_183_1 = (String) ((Object) stackIn_182_1);
                        stackIn_183_2 = stackIn_182_2;
                        stackIn_183_3 = stackIn_182_3;
                        stackIn_183_4 = 16777215;
                        break L19;
                      } else {
                        stackIn_183_0 = (ef) ((Object) stackIn_182_0);
                        stackIn_183_1 = (String) ((Object) stackIn_182_1);
                        stackIn_183_2 = stackIn_182_2;
                        stackIn_183_3 = stackIn_182_3;
                        stackIn_183_4 = 1;
                        break L19;
                      }
                    }
                    L20: {
                      ((ef) (Object) stackIn_183_0).a(stackIn_183_1, stackIn_183_2, stackIn_183_3, stackIn_183_4, -1);
                      oo.b(var24);
                      if (hh.field_b) {
                        if (sq.field_N) {
                          if (df.field_I) {
                            stackIn_191_0 = 0;
                            break L20;
                          } else {
                            stackIn_191_0 = 1;
                            break L20;
                          }
                        } else {
                          stackIn_191_0 = 0;
                          break L20;
                        }
                      } else {
                        stackIn_191_0 = 0;
                        break L20;
                      }
                    }
                    L21: {
                      L22: {
                        var9 = stackIn_191_0;
                        if (!param0) {
                          break L22;
                        } else {
                          if (!vk.i((byte) -39)) {
                            break L22;
                          } else {
                            if (var9 != 0) {
                              break L22;
                            } else {
                              stackIn_196_0 = 1;
                              break L21;
                            }
                          }
                        }
                      }
                      stackIn_196_0 = 0;
                      break L21;
                    }
                    dd.a(stackIn_196_0 != 0, 0);
                    if (re.field_b) {
                      L23: {
                        if (var9 != 0) {
                          if (param0) {
                            if (vk.i((byte) -39)) {
                              stackIn_206_0 = 1;
                              kg.a(stackIn_206_0 != 0, (byte) 117);
                              break L23;
                            } else {
                              kg.a(false, (byte) 117);
                              return;
                            }
                          } else {
                            kg.a(false, (byte) 117);
                            return;
                          }
                        } else {
                          break L23;
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L24: {
                      var4 = 1;
                      if (var4 != 0) {
                        stackIn_145_0 = rl.field_a;
                        break L24;
                      } else {
                        stackIn_145_0 = oi.field_h;
                        break L24;
                      }
                    }
                    L25: {
                      var5 = stackIn_145_0;
                      var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                      var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                      s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                      var23 = new int[4];
                      oo.a(var23);
                      oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                      stackIn_147_0 = qp.field_w;

                      stackIn_147_1 = pb.field_i;

                      stackIn_147_2 = -var5[2].field_x + 635;

                      stackIn_147_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                      if (var4 == 0) {
                        stackIn_148_0 = (ef) ((Object) stackIn_147_0);
                        stackIn_148_1 = (String) ((Object) stackIn_147_1);
                        stackIn_148_2 = stackIn_147_2;
                        stackIn_148_3 = stackIn_147_3;
                        stackIn_148_4 = 16777215;
                        break L25;
                      } else {
                        stackIn_148_0 = (ef) ((Object) stackIn_147_0);
                        stackIn_148_1 = (String) ((Object) stackIn_147_1);
                        stackIn_148_2 = stackIn_147_2;
                        stackIn_148_3 = stackIn_147_3;
                        stackIn_148_4 = 1;
                        break L25;
                      }
                    }
                    L26: {
                      ((ef) (Object) stackIn_148_0).a(stackIn_148_1, stackIn_148_2, stackIn_148_3, stackIn_148_4, -1);
                      oo.b(var23);
                      if (hh.field_b) {
                        if (sq.field_N) {
                          if (df.field_I) {
                            stackIn_155_0 = 0;
                            break L26;
                          } else {
                            stackIn_155_0 = 1;
                            break L26;
                          }
                        } else {
                          stackIn_155_0 = 0;
                          break L26;
                        }
                      } else {
                        stackIn_155_0 = 0;
                        break L26;
                      }
                    }
                    L27: {
                      L28: {
                        var9 = stackIn_155_0;
                        if (!param0) {
                          break L28;
                        } else {
                          if (!vk.i((byte) -39)) {
                            break L28;
                          } else {
                            if (var9 != 0) {
                              break L28;
                            } else {
                              stackIn_160_0 = 1;
                              break L27;
                            }
                          }
                        }
                      }
                      stackIn_160_0 = 0;
                      break L27;
                    }
                    dd.a(stackIn_160_0 != 0, 0);
                    if (re.field_b) {
                      L29: {
                        if (var9 != 0) {
                          if (param0) {
                            if (vk.i((byte) -39)) {
                              stackIn_170_0 = 1;
                              kg.a(stackIn_170_0 != 0, (byte) 117);
                              break L29;
                            } else {
                              kg.a(false, (byte) 117);
                              return;
                            }
                          } else {
                            kg.a(false, (byte) 117);
                            return;
                          }
                        } else {
                          break L29;
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (param0) {
                  L30: {
                    var4 = 1;
                    if (var4 != 0) {
                      stackIn_112_0 = rl.field_a;
                      break L30;
                    } else {
                      stackIn_112_0 = oi.field_h;
                      break L30;
                    }
                  }
                  L31: {
                    var5 = stackIn_112_0;
                    var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                    var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                    s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                    var21 = new int[4];
                    oo.a(var21);
                    oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                    stackIn_114_0 = qp.field_w;

                    stackIn_114_1 = pb.field_i;

                    stackIn_114_2 = -var5[2].field_x + 635;

                    stackIn_114_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                    if (var4 == 0) {
                      stackIn_115_0 = (ef) ((Object) stackIn_114_0);
                      stackIn_115_1 = (String) ((Object) stackIn_114_1);
                      stackIn_115_2 = stackIn_114_2;
                      stackIn_115_3 = stackIn_114_3;
                      stackIn_115_4 = 16777215;
                      break L31;
                    } else {
                      stackIn_115_0 = (ef) ((Object) stackIn_114_0);
                      stackIn_115_1 = (String) ((Object) stackIn_114_1);
                      stackIn_115_2 = stackIn_114_2;
                      stackIn_115_3 = stackIn_114_3;
                      stackIn_115_4 = 1;
                      break L31;
                    }
                  }
                  L32: {
                    ((ef) (Object) stackIn_115_0).a(stackIn_115_1, stackIn_115_2, stackIn_115_3, stackIn_115_4, -1);
                    oo.b(var21);
                    if (hh.field_b) {
                      if (sq.field_N) {
                        if (df.field_I) {
                          stackIn_122_0 = 0;
                          break L32;
                        } else {
                          stackIn_122_0 = 1;
                          break L32;
                        }
                      } else {
                        stackIn_122_0 = 0;
                        break L32;
                      }
                    } else {
                      stackIn_122_0 = 0;
                      break L32;
                    }
                  }
                  L33: {
                    L34: {
                      var9 = stackIn_122_0;
                      if (!param0) {
                        break L34;
                      } else {
                        if (!vk.i((byte) -39)) {
                          break L34;
                        } else {
                          if (var9 != 0) {
                            break L34;
                          } else {
                            stackIn_127_0 = 1;
                            break L33;
                          }
                        }
                      }
                    }
                    stackIn_127_0 = 0;
                    break L33;
                  }
                  dd.a(stackIn_127_0 != 0, 0);
                  if (re.field_b) {
                    L35: {
                      if (var9 != 0) {
                        if (param0) {
                          if (vk.i((byte) -39)) {
                            stackIn_137_0 = 1;
                            kg.a(stackIn_137_0 != 0, (byte) 117);
                            break L35;
                          } else {
                            kg.a(false, (byte) 117);
                            return;
                          }
                        } else {
                          kg.a(false, (byte) 117);
                          return;
                        }
                      } else {
                        break L35;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  L36: {
                    L37: {
                      if (0 >= id.field_D) {
                        break L37;
                      } else {
                        if (20 <= wf.field_m % 40) {
                          break L37;
                        } else {
                          stackIn_80_0 = 1;
                          break L36;
                        }
                      }
                    }
                    if (var3 != 0) {
                      if (-21 < (wf.field_m % 40 ^ -1)) {
                        stackIn_80_0 = 1;
                        break L36;
                      } else {
                        stackIn_80_0 = 0;
                        break L36;
                      }
                    } else {
                      stackIn_80_0 = 0;
                      break L36;
                    }
                  }
                  L38: {
                    var4 = stackIn_80_0;
                    if (var4 != 0) {
                      stackIn_83_0 = rl.field_a;
                      break L38;
                    } else {
                      stackIn_83_0 = oi.field_h;
                      break L38;
                    }
                  }
                  L39: {
                    var5 = stackIn_83_0;
                    var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                    var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                    s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                    var22 = new int[4];
                    oo.a(var22);
                    oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                    stackIn_85_0 = qp.field_w;

                    stackIn_85_1 = pb.field_i;

                    stackIn_85_2 = -var5[2].field_x + 635;

                    stackIn_85_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                    if (var4 == 0) {
                      stackIn_86_0 = (ef) ((Object) stackIn_85_0);
                      stackIn_86_1 = (String) ((Object) stackIn_85_1);
                      stackIn_86_2 = stackIn_85_2;
                      stackIn_86_3 = stackIn_85_3;
                      stackIn_86_4 = 16777215;
                      break L39;
                    } else {
                      stackIn_86_0 = (ef) ((Object) stackIn_85_0);
                      stackIn_86_1 = (String) ((Object) stackIn_85_1);
                      stackIn_86_2 = stackIn_85_2;
                      stackIn_86_3 = stackIn_85_3;
                      stackIn_86_4 = 1;
                      break L39;
                    }
                  }
                  L40: {
                    ((ef) (Object) stackIn_86_0).a(stackIn_86_1, stackIn_86_2, stackIn_86_3, stackIn_86_4, -1);
                    oo.b(var22);
                    if (hh.field_b) {
                      if (sq.field_N) {
                        if (df.field_I) {
                          stackIn_93_0 = 0;
                          break L40;
                        } else {
                          stackIn_93_0 = 1;
                          break L40;
                        }
                      } else {
                        stackIn_93_0 = 0;
                        break L40;
                      }
                    } else {
                      stackIn_93_0 = 0;
                      break L40;
                    }
                  }
                  L41: {
                    L42: {
                      var9 = stackIn_93_0;
                      if (!param0) {
                        break L42;
                      } else {
                        if (!vk.i((byte) -39)) {
                          break L42;
                        } else {
                          if (var9 != 0) {
                            break L42;
                          } else {
                            stackIn_98_0 = 1;
                            break L41;
                          }
                        }
                      }
                    }
                    stackIn_98_0 = 0;
                    break L41;
                  }
                  L43: {
                    L44: {
                      dd.a(stackIn_98_0 != 0, 0);
                      if (!re.field_b) {
                        break L44;
                      } else {
                        if (var9 != 0) {
                          if (!param0) {
                            kg.a(false, (byte) 117);
                            break L43;
                          } else {
                            if (!vk.i((byte) -39)) {
                              kg.a(false, (byte) 117);
                              break L43;
                            } else {
                              stackIn_106_0 = 1;
                              kg.a(stackIn_106_0 != 0, (byte) 117);
                              break L44;
                            }
                          }
                        } else {
                          break L43;
                        }
                      }
                    }
                    break L43;
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
          L45: {
            L46: {
              field_k = (ja[]) null;
              if (null == op.field_m) {
                break L46;
              } else {
                if (1 >= op.field_m.field_t) {
                  break L46;
                } else {
                  L47: {
                    if (pl.field_I != 10) {
                      stackIn_6_0 = 0;
                      break L47;
                    } else {
                      stackIn_6_0 = 1;
                      break L47;
                    }
                  }
                  L48: {
                    var2 = stackIn_6_0;
                    if (iq.field_f) {
                      if (var2 != 0) {
                        stackIn_12_0 = 1;
                        break L48;
                      } else {
                        stackIn_12_0 = 0;
                        break L48;
                      }
                    } else {
                      stackIn_12_0 = 0;
                      break L48;
                    }
                  }
                  L49: {
                    L50: {
                      var3 = stackIn_12_0;
                      if (!tj.field_f) {
                        break L50;
                      } else {
                        if (!param0) {
                          break L50;
                        } else {
                          stackIn_26_0 = 1;
                          break L49;
                        }
                      }
                    }
                    L51: {
                      if (0 >= id.field_D) {
                        break L51;
                      } else {
                        if (20 <= wf.field_m % 40) {
                          break L51;
                        } else {
                          stackIn_26_0 = 1;
                          break L49;
                        }
                      }
                    }
                    if (var3 != 0) {
                      if (-21 < (wf.field_m % 40 ^ -1)) {
                        stackIn_26_0 = 1;
                        break L49;
                      } else {
                        stackIn_26_0 = 0;
                        break L49;
                      }
                    } else {
                      stackIn_26_0 = 0;
                      break L49;
                    }
                  }
                  L52: {
                    var4 = stackIn_26_0;
                    if (var4 != 0) {
                      stackIn_29_0 = rl.field_a;
                      break L52;
                    } else {
                      stackIn_29_0 = oi.field_h;
                      break L52;
                    }
                  }
                  L53: {
                    var5 = stackIn_29_0;
                    var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
                    var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
                    s.a(-var7 + dq.field_k.field_qb + -5, 0, var5, -5 + -var6 + 640, var7, var6);
                    var20 = new int[4];
                    oo.a(var20);
                    oo.e(-5 + -nf.field_d + 640 + -var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w + -5, 635 - var5[2].field_x, dq.field_k.field_qb + -var5[6].field_w);
                    stackIn_31_0 = qp.field_w;

                    stackIn_31_1 = pb.field_i;

                    stackIn_31_2 = -var5[2].field_x + 635;

                    stackIn_31_3 = dq.field_k.field_qb - (var5[6].field_w - -5);

                    if (var4 == 0) {
                      stackIn_32_0 = (ef) ((Object) stackIn_31_0);
                      stackIn_32_1 = (String) ((Object) stackIn_31_1);
                      stackIn_32_2 = stackIn_31_2;
                      stackIn_32_3 = stackIn_31_3;
                      stackIn_32_4 = 16777215;
                      break L53;
                    } else {
                      stackIn_32_0 = (ef) ((Object) stackIn_31_0);
                      stackIn_32_1 = (String) ((Object) stackIn_31_1);
                      stackIn_32_2 = stackIn_31_2;
                      stackIn_32_3 = stackIn_31_3;
                      stackIn_32_4 = 1;
                      break L53;
                    }
                  }
                  L54: {
                    ((ef) (Object) stackIn_32_0).a(stackIn_32_1, stackIn_32_2, stackIn_32_3, stackIn_32_4, -1);
                    oo.b(var20);
                    if (hh.field_b) {
                      if (sq.field_N) {
                        if (df.field_I) {
                          stackIn_40_0 = 0;
                          break L54;
                        } else {
                          stackIn_40_0 = 1;
                          break L54;
                        }
                      } else {
                        stackIn_40_0 = 0;
                        break L54;
                      }
                    } else {
                      stackIn_40_0 = 0;
                      break L54;
                    }
                  }
                  L55: {
                    L56: {
                      var9 = stackIn_40_0;
                      if (!param0) {
                        break L56;
                      } else {
                        if (!vk.i((byte) -39)) {
                          break L56;
                        } else {
                          if (var9 != 0) {
                            break L56;
                          } else {
                            stackIn_45_0 = 1;
                            break L55;
                          }
                        }
                      }
                    }
                    stackIn_45_0 = 0;
                    break L55;
                  }
                  dd.a(stackIn_45_0 != 0, 0);
                  if (!re.field_b) {
                    break L46;
                  } else {
                    if (var9 != 0) {
                      if (!param0) {
                        kg.a(false, (byte) 117);
                        break L45;
                      } else {
                        if (!vk.i((byte) -39)) {
                          kg.a(false, (byte) 117);
                          break L45;
                        } else {
                          stackIn_53_0 = 1;
                          kg.a(stackIn_53_0 != 0, (byte) 117);
                          break L46;
                        }
                      }
                    } else {
                      break L45;
                    }
                  }
                }
              }
            }
            break L45;
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
          if (!param1) {
            if (mh.field_c != null) {
              L1: {
                if (!param1) {
                  if (null != mh.field_c) {
                    if (mh.field_h <= 0) {
                      if (-1 <= (sq.field_Q ^ -1)) {
                        if (da.field_a < b.field_d) {
                          if (da.field_a == 0) {
                            jq.a(false, (byte) -20);
                            da.field_a = da.field_a + 1;
                            var2 = -72 / ((-39 - param0) / 44);
                            return;
                          } else {
                            da.field_a = da.field_a + 1;
                            var2 = -72 / ((-39 - param0) / 44);
                            return;
                          }
                        } else {
                          var2 = -72 / ((-39 - param0) / 44);
                          return;
                        }
                      } else {
                        sq.field_Q = sq.field_Q - 1;
                        var2 = -72 / ((-39 - param0) / 44);
                        return;
                      }
                    } else {
                      mh.field_h = mh.field_h - 1;
                      var2 = -72 / ((-39 - param0) / 44);
                      return;
                    }
                  } else {
                    if (ej.field_n == null) {
                      io.field_b = false;
                      if (-1 <= (sq.field_Q ^ -1)) {
                        if ((da.field_a ^ -1) >= -1) {
                          if (mh.field_h < b.field_d) {
                            L2: {
                              if (0 != mh.field_h) {
                                break L2;
                              } else {
                                wf.a(6835);
                                break L2;
                              }
                            }
                            mh.field_h = mh.field_h + 1;
                            var2 = -72 / ((-39 - param0) / 44);
                            return;
                          } else {
                            var2 = -72 / ((-39 - param0) / 44);
                            return;
                          }
                        } else {
                          da.field_a = da.field_a - 1;
                          break L1;
                        }
                      } else {
                        sq.field_Q = sq.field_Q - 1;
                        var2 = -72 / ((-39 - param0) / 44);
                        return;
                      }
                    } else {
                      if (0 < mh.field_h) {
                        mh.field_h = mh.field_h - 1;
                        break L1;
                      } else {
                        if ((da.field_a ^ -1) >= -1) {
                          if (sq.field_Q < b.field_d) {
                            L3: {
                              if (0 != sq.field_Q) {
                                break L3;
                              } else {
                                jq.a(true, (byte) 126);
                                break L3;
                              }
                            }
                            sq.field_Q = sq.field_Q + 1;
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          da.field_a = da.field_a - 1;
                          break L1;
                        }
                      }
                    }
                  }
                } else {
                  if (-1 > (mh.field_h ^ -1)) {
                    mh.field_h = mh.field_h - 1;
                    break L1;
                  } else {
                    if (0 >= sq.field_Q) {
                      if (da.field_a > 0) {
                        da.field_a = da.field_a - 1;
                        break L1;
                      } else {
                        var2 = -72 / ((-39 - param0) / 44);
                        return;
                      }
                    } else {
                      sq.field_Q = sq.field_Q - 1;
                      break L1;
                    }
                  }
                }
              }
              var2 = -72 / ((-39 - param0) / 44);
              return;
            } else {
              io.field_b = false;
              break L0;
            }
          } else {
            io.field_b = false;
            break L0;
          }
        }
        if (!param1) {
          if (null != mh.field_c) {
            if (mh.field_h <= 0) {
              if (-1 <= (sq.field_Q ^ -1)) {
                if (da.field_a < b.field_d) {
                  if (da.field_a == 0) {
                    jq.a(false, (byte) -20);
                    da.field_a = da.field_a + 1;
                    var2 = -72 / ((-39 - param0) / 44);
                    return;
                  } else {
                    da.field_a = da.field_a + 1;
                    var2 = -72 / ((-39 - param0) / 44);
                    return;
                  }
                } else {
                  var2 = -72 / ((-39 - param0) / 44);
                  return;
                }
              } else {
                sq.field_Q = sq.field_Q - 1;
                var2 = -72 / ((-39 - param0) / 44);
                return;
              }
            } else {
              mh.field_h = mh.field_h - 1;
              var2 = -72 / ((-39 - param0) / 44);
              return;
            }
          } else {
            if (ej.field_n == null) {
              io.field_b = false;
              if (-1 <= (sq.field_Q ^ -1)) {
                if ((da.field_a ^ -1) >= -1) {
                  if (mh.field_h < b.field_d) {
                    if (0 != mh.field_h) {
                      mh.field_h = mh.field_h + 1;
                      var2 = -72 / ((-39 - param0) / 44);
                      return;
                    } else {
                      wf.a(6835);
                      mh.field_h = mh.field_h + 1;
                      var2 = -72 / ((-39 - param0) / 44);
                      return;
                    }
                  } else {
                    var2 = -72 / ((-39 - param0) / 44);
                    return;
                  }
                } else {
                  da.field_a = da.field_a - 1;
                  var2 = -72 / ((-39 - param0) / 44);
                  return;
                }
              } else {
                sq.field_Q = sq.field_Q - 1;
                var2 = -72 / ((-39 - param0) / 44);
                return;
              }
            } else {
              if (0 >= mh.field_h) {
                if ((da.field_a ^ -1) >= -1) {
                  if (sq.field_Q < b.field_d) {
                    if (0 != sq.field_Q) {
                      sq.field_Q = sq.field_Q + 1;
                      var2 = -72 / ((-39 - param0) / 44);
                      return;
                    } else {
                      jq.a(true, (byte) 126);
                      sq.field_Q = sq.field_Q + 1;
                      var2 = -72 / ((-39 - param0) / 44);
                      return;
                    }
                  } else {
                    var2 = -72 / ((-39 - param0) / 44);
                    return;
                  }
                } else {
                  da.field_a = da.field_a - 1;
                  var2 = -72 / ((-39 - param0) / 44);
                  return;
                }
              } else {
                mh.field_h = mh.field_h - 1;
                var2 = -72 / ((-39 - param0) / 44);
                return;
              }
            }
          }
        } else {
          if (-1 <= (mh.field_h ^ -1)) {
            if (0 >= sq.field_Q) {
              if (da.field_a <= 0) {
                var2 = -72 / ((-39 - param0) / 44);
                return;
              } else {
                da.field_a = da.field_a - 1;
                var2 = -72 / ((-39 - param0) / 44);
                return;
              }
            } else {
              sq.field_Q = sq.field_Q - 1;
              var2 = -72 / ((-39 - param0) / 44);
              return;
            }
          } else {
            mh.field_h = mh.field_h - 1;
            var2 = -72 / ((-39 - param0) / 44);
            return;
          }
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
