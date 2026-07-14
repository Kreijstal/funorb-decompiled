/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends am {
    static bd field_p;
    static bd field_m;
    static vl field_q;
    static int field_l;
    static boolean field_i;
    static bd field_n;
    byte[] field_r;
    long field_j;
    int field_s;
    static String field_k;
    static vl field_h;
    static eg field_o;
    static boolean field_t;

    final static void a(int param0, int param1, oc param2, boolean param3, og param4, oc param5, int param6, int param7, boolean param8, oj param9, int param10, int param11, int param12, int param13, int param14, int param15, oc param16) {
        oj var17 = null;
        double var18 = 0.0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        bd[][] var22_ref_bd____ = null;
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
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int stackIn_14_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_180_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_190_0 = 0;
        int stackIn_232_0 = 0;
        int stackIn_238_0 = 0;
        int stackIn_243_0 = 0;
        int stackIn_248_0 = 0;
        int stackIn_261_0 = 0;
        int stackIn_266_0 = 0;
        int stackIn_271_0 = 0;
        int stackIn_274_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_181_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_260_0 = 0;
        int stackOut_259_0 = 0;
        int stackOut_257_0 = 0;
        int stackOut_265_0 = 0;
        int stackOut_264_0 = 0;
        int stackOut_262_0 = 0;
        int stackOut_270_0 = 0;
        int stackOut_269_0 = 0;
        int stackOut_267_0 = 0;
        int stackOut_273_0 = 0;
        int stackOut_272_0 = 0;
        int stackOut_230_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_227_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_233_0 = 0;
        int stackOut_242_0 = 0;
        int stackOut_241_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_247_0 = 0;
        int stackOut_246_0 = 0;
        int stackOut_244_0 = 0;
        L0: {
          var40 = HostileSpawn.field_I ? 1 : 0;
          param9.field_G = 2;
          var17 = mm.field_m[0];
          var18 = nh.a(-12149, (p) (Object) param9, (p) (Object) var17);
          if (var18 >= 0.0) {
            break L0;
          } else {
            var18 = var18 + 256.0;
            break L0;
          }
        }
        L1: {
          if (param3) {
            if (param11 < param1) {
              if (param15 <= param1) {
                if (-param1 < param11) {
                  if (param15 > -param1) {
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L1;
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_14_0 = stackOut_11_0;
                    break L1;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_14_0 = stackOut_9_0;
                  break L1;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_14_0 = stackOut_7_0;
                break L1;
              }
            } else {
              stackOut_5_0 = 0;
              stackIn_14_0 = stackOut_5_0;
              break L1;
            }
          } else {
            stackOut_3_0 = 0;
            stackIn_14_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var20 = stackIn_14_0;
          if (19 != param9.field_i) {
            break L2;
          } else {
            if (param9.field_w != 4) {
              break L2;
            } else {
              if (var20 != 0) {
                break L2;
              } else {
                if (param8) {
                  param9.field_w = 1;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
          }
        }
        L3: {
          if (param3) {
            if (param11 < param0) {
              if (param0 > param15) {
                if (param11 > -param0) {
                  if (param15 <= -param0) {
                    stackOut_30_0 = 0;
                    stackIn_32_0 = stackOut_30_0;
                    break L3;
                  } else {
                    stackOut_29_0 = 1;
                    stackIn_32_0 = stackOut_29_0;
                    break L3;
                  }
                } else {
                  stackOut_27_0 = 0;
                  stackIn_32_0 = stackOut_27_0;
                  break L3;
                }
              } else {
                stackOut_25_0 = 0;
                stackIn_32_0 = stackOut_25_0;
                break L3;
              }
            } else {
              stackOut_23_0 = 0;
              stackIn_32_0 = stackOut_23_0;
              break L3;
            }
          } else {
            stackOut_21_0 = 0;
            stackIn_32_0 = stackOut_21_0;
            break L3;
          }
        }
        L4: {
          var21 = stackIn_32_0;
          if (19 == param9.field_i) {
            if (-28 != param9.field_i) {
              break L4;
            } else {
              if (param9.field_s) {
                break L4;
              } else {
                if (-1 == param9.field_w) {
                  break L4;
                } else {
                  param9.field_w = 0;
                  param9.field_z = 0;
                  break L4;
                }
              }
            }
          } else {
            if (-28 != param9.field_i) {
              break L4;
            } else {
              if (param9.field_s) {
                break L4;
              } else {
                if (var21 != 0) {
                  break L4;
                } else {
                  if (-1 == param9.field_w) {
                    break L4;
                  } else {
                    param9.field_w = 0;
                    param9.field_z = 0;
                    break L4;
                  }
                }
              }
            }
          }
        }
        L5: {
          if ((param9.field_B ^ -1) < 99) {
            param9.field_B = param9.field_B - 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          param9.field_p = param9.field_p + 1;
          if (param9.field_C > param9.field_p + 1) {
            break L6;
          } else {
            param9.field_z = param9.field_z + 1;
            param9.field_p = 0;
            break L6;
          }
        }
        L7: {
          if (0 >= param9.field_B) {
            break L7;
          } else {
            if ((param9.field_w ^ -1) != -2) {
              param9.field_B = 0;
              break L7;
            } else {
              break L7;
            }
          }
        }
        L8: {
          var22 = param9.field_w;
          if (var22 != -1) {
            if (-2 != var22) {
              if (var22 != 2) {
                if (var22 == 3) {
                  param9.a(225, -64.0 + param9.field_c, param7);
                  if (param9.field_c % 64.0 < 4.0) {
                    param9.field_w = 1;
                    param9.field_c = Math.floor(param9.field_c / 64.0) * 64.0;
                    break L8;
                  } else {
                    break L8;
                  }
                } else {
                  if ((var22 ^ -1) == -5) {
                    L9: {
                      param9.field_p = param9.field_p + 2;
                      if (param8) {
                        break L9;
                      } else {
                        if (param9.field_i == 19) {
                          break L9;
                        } else {
                          param9.field_w = 1;
                          break L8;
                        }
                      }
                    }
                    if (var21 == 0) {
                      L10: {
                        if (var20 != 0) {
                          break L10;
                        } else {
                          if (!param8) {
                            break L10;
                          } else {
                            param9.field_w = 1;
                            break L8;
                          }
                        }
                      }
                      if (19 == param9.field_i) {
                        L11: {
                          var22 = param9.field_z % lb.field_a[4].length;
                          if ((var22 ^ -1) != -5) {
                            break L11;
                          } else {
                            if ((param9.field_p ^ -1) != -3) {
                              break L11;
                            } else {
                              L12: {
                                param9.field_e = 50;
                                tk.a(3, jc.field_c, 62, true);
                                jn.field_F[ib.field_c].field_c = param9.field_c;
                                jn.field_F[ib.field_c].field_j.a((byte) 46, param2);
                                jn.field_F[ib.field_c].field_l.a(param4, -28860);
                                jn.field_F[ib.field_c].field_l.field_f = jn.field_F[ib.field_c].field_l.field_f - 0.5;
                                jn.field_F[ib.field_c].field_l.field_a = jn.field_F[ib.field_c].field_l.field_a - 0.5;
                                if (0.0 <= jn.field_F[ib.field_c].field_l.field_f) {
                                  break L12;
                                } else {
                                  jn.field_F[ib.field_c].field_l.field_f = jn.field_F[ib.field_c].field_l.field_f + 1.0;
                                  jn.field_F[ib.field_c].field_j.field_e = jn.field_F[ib.field_c].field_j.field_e - 1;
                                  break L12;
                                }
                              }
                              L13: {
                                if (jn.field_F[ib.field_c].field_l.field_a < 0.0) {
                                  jn.field_F[ib.field_c].field_l.field_a = jn.field_F[ib.field_c].field_l.field_a + 1.0;
                                  jn.field_F[ib.field_c].field_j.field_g = jn.field_F[ib.field_c].field_j.field_g - 1;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              jn.field_F[ib.field_c].field_e = 0;
                              jn.field_F[ib.field_c].field_h = 0;
                              jn.field_F[ib.field_c].field_i = 13;
                              jn.field_F[ib.field_c].field_l.a(20, (byte) 94, jn.field_F[ib.field_c].field_c);
                              ib.field_c = ib.field_c + 1;
                              if (Math.random() < 0.5) {
                                param9.field_c = param9.field_c + 64.0;
                                boolean[] discarded$3 = param9.b(-27757, (int)(Math.random() * 10.0), ln.field_a);
                                param9.field_c = param9.field_c - 64.0;
                                param5.a((byte) 46, param16);
                                param5.b(param2, 24161);
                                var18 = param5.a(25124);
                                param9.a(225, var18, 5);
                                break L8;
                              } else {
                                param9.field_c = param9.field_c - 64.0;
                                boolean[] discarded$4 = param9.b(-27757, (int)(Math.random() * 10.0), ln.field_a);
                                param9.field_c = param9.field_c + 64.0;
                                param5.a((byte) 46, param16);
                                param5.b(param2, 24161);
                                var18 = param5.a(25124);
                                param9.a(225, var18, 5);
                                break L8;
                              }
                            }
                          }
                        }
                        param5.a((byte) 46, param16);
                        param5.b(param2, 24161);
                        var18 = param5.a(25124);
                        param9.a(225, var18, 5);
                        break L8;
                      } else {
                        if (-28 != (param9.field_i ^ -1)) {
                          L14: {
                            if ((3 & param9.field_e) != 0) {
                              break L14;
                            } else {
                              if ((eh.field_g ^ -1) >= -1) {
                                break L14;
                              } else {
                                if (Math.abs(param11) < -49) {
                                  break L14;
                                } else {
                                  if (-49 < Math.abs(param15)) {
                                    break L14;
                                  } else {
                                    ci.a(1, 45);
                                    if ((uj.field_l ^ -1) != -2) {
                                      break L14;
                                    } else {
                                      if (0 < param9.field_e) {
                                        break L14;
                                      } else {
                                        L15: {
                                          param9.field_e = 30;
                                          var22 = param9.field_i;
                                          if (var22 == 1) {
                                            break L15;
                                          } else {
                                            if ((var22 ^ -1) == -26) {
                                              break L15;
                                            } else {
                                              if (var22 != 24) {
                                                if (18 != var22) {
                                                  if (27 == var22) {
                                                    break L14;
                                                  } else {
                                                    if (var22 != -27) {
                                                      if (19 == var22) {
                                                        break L14;
                                                      } else {
                                                        if (var22 != 23) {
                                                          if (-9 == var22) {
                                                            param9.field_e = 60;
                                                            tk.a(5, jc.field_c, 35, true);
                                                            break L14;
                                                          } else {
                                                            break L14;
                                                          }
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                } else {
                                                  break L15;
                                                }
                                              } else {
                                                tk.a(1, jc.field_c, 0, true);
                                                break L14;
                                              }
                                            }
                                          }
                                        }
                                        tk.a(1, jc.field_c, 0, true);
                                        break L14;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L16: {
                            if ((param9.field_e ^ -1) >= -1) {
                              break L16;
                            } else {
                              param9.field_e = param9.field_e - 1;
                              break L16;
                            }
                          }
                          param5.a((byte) 46, param16);
                          param5.b(param2, 24161);
                          var18 = param5.a(25124);
                          param9.a(225, var18, 5);
                          break L8;
                        } else {
                          L17: {
                            var22 = param9.field_z % pa.field_i[4].length;
                            if (var22 < 14) {
                              break L17;
                            } else {
                              if (17 < var22) {
                                break L17;
                              } else {
                                if ((eh.field_g ^ -1) >= -1) {
                                  break L17;
                                } else {
                                  if (Math.abs(param11) > 48) {
                                    break L17;
                                  } else {
                                    if (48 >= Math.abs(param15)) {
                                      L18: {
                                        ci.a(3, 126);
                                        if (1 != uj.field_l) {
                                          break L18;
                                        } else {
                                          if (param9.field_e <= 0) {
                                            break L18;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      if (param9.field_e <= 0) {
                                        break L17;
                                      } else {
                                        param9.field_e = param9.field_e - 1;
                                        param5.a((byte) 46, param16);
                                        param5.b(param2, 24161);
                                        var18 = param5.a(25124);
                                        param9.a(225, var18, 5);
                                        break L8;
                                      }
                                    } else {
                                      param5.a((byte) 46, param16);
                                      param5.b(param2, 24161);
                                      var18 = param5.a(25124);
                                      param9.a(225, var18, 5);
                                      break L8;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          param5.a((byte) 46, param16);
                          param5.b(param2, 24161);
                          var18 = param5.a(25124);
                          param9.a(225, var18, 5);
                          break L8;
                        }
                      }
                    } else {
                      param9.field_J = true;
                      param9.field_w = 1;
                      break L8;
                    }
                  } else {
                    if ((var22 ^ -1) == -6) {
                      L19: {
                        boolean[] discarded$5 = param9.field_l.a(25302, true, param9.field_K, param9.field_t, ln.field_a, 1, param9.field_j);
                        param9.b((byte) 117);
                        var22_ref_bd____ = param9.e(127);
                        var23 = 3;
                        if (var22_ref_bd____ == null) {
                          break L19;
                        } else {
                          if (var22_ref_bd____[5] == null) {
                            break L19;
                          } else {
                            var23 = var22_ref_bd____[5].length;
                            break L19;
                          }
                        }
                      }
                      if (param9.field_z >= var23) {
                        L20: {
                          if (3 == ha.field_t) {
                            if (-9 != param9.field_i) {
                              break L20;
                            } else {
                              if (0 == bm.field_c) {
                                kd.a(0, 1);
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          if (-24 == param9.field_i) {
                            jj.a(16, param9);
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        L22: {
                          if (-9 != (param9.field_i ^ -1)) {
                            break L22;
                          } else {
                            var24 = 0;
                            L23: while (true) {
                              if (var24 >= 10) {
                                break L22;
                              } else {
                                mm.field_m[el.field_j] = new oj(param9.field_j, 3, rl.field_c);
                                el.field_j = el.field_j + 1;
                                var24++;
                                continue L23;
                              }
                            }
                          }
                        }
                        param9.c((byte) -123);
                        bn.a(3, param9);
                        break L8;
                      } else {
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                }
              } else {
                param9.a(225, param9.field_c + 64.0, param7);
                if (4.0 <= param9.field_c % 64.0) {
                  break L8;
                } else {
                  param9.field_w = 1;
                  param9.field_c = 64.0 * Math.floor(param9.field_c / 64.0);
                  break L8;
                }
              }
            } else {
              L24: {
                if (-28 != (param9.field_i ^ -1)) {
                  break L24;
                } else {
                  L25: {
                    if ((ln.field_a.field_c[param12] ^ -1) == -7) {
                      ln.field_a.field_c[param12] = 5;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if ((ln.field_a.field_c[-1 + param12] ^ -1) == -7) {
                      ln.field_a.field_c[-1 + param12] = 0;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (6 != ln.field_a.field_c[param12 + -ln.field_a.field_d]) {
                      break L27;
                    } else {
                      ln.field_a.field_c[param12 - ln.field_a.field_d] = 0;
                      break L27;
                    }
                  }
                  if (ln.field_a.field_c[param12 + (-ln.field_a.field_d - 1)] == 6) {
                    ln.field_a.field_c[-1 + (param12 + -ln.field_a.field_d)] = 0;
                    break L24;
                  } else {
                    break L24;
                  }
                }
              }
              L28: {
                if (param8) {
                  L29: {
                    if (var20 == 0) {
                      break L29;
                    } else {
                      if (var21 != 0) {
                        break L29;
                      } else {
                        param9.field_w = 4;
                        break L28;
                      }
                    }
                  }
                  L30: {
                    if (var21 == 0) {
                      param9.field_J = false;
                      break L30;
                    } else {
                      param9.field_w = 1;
                      param9.field_J = true;
                      if (param9.field_B <= 0) {
                        break L30;
                      } else {
                        param9.field_B = 0;
                        break L30;
                      }
                    }
                  }
                  L31: {
                    var22 = cm.field_c[param12];
                    var23 = param12 - param10;
                    var24 = param12 + param10;
                    var25 = param12 + 1;
                    var26 = -1 + param12;
                    if (3 == param9.field_i) {
                      stackOut_116_0 = 0;
                      stackIn_117_0 = stackOut_116_0;
                      break L31;
                    } else {
                      stackOut_115_0 = 1;
                      stackIn_117_0 = stackOut_115_0;
                      break L31;
                    }
                  }
                  L32: {
                    var27 = stackIn_117_0;
                    if (1 >= ln.field_a.b(var27, 5857, var23)) {
                      stackOut_119_0 = 0;
                      stackIn_120_0 = stackOut_119_0;
                      break L32;
                    } else {
                      stackOut_118_0 = 1;
                      stackIn_120_0 = stackOut_118_0;
                      break L32;
                    }
                  }
                  L33: {
                    var28 = stackIn_120_0;
                    if (1 >= ln.field_a.b(var27, 5857, var24)) {
                      stackOut_122_0 = 0;
                      stackIn_123_0 = stackOut_122_0;
                      break L33;
                    } else {
                      stackOut_121_0 = 1;
                      stackIn_123_0 = stackOut_121_0;
                      break L33;
                    }
                  }
                  L34: {
                    var29 = stackIn_123_0;
                    if (ln.field_a.b(var27, 5857, var25) <= 1) {
                      stackOut_125_0 = 0;
                      stackIn_126_0 = stackOut_125_0;
                      break L34;
                    } else {
                      stackOut_124_0 = 1;
                      stackIn_126_0 = stackOut_124_0;
                      break L34;
                    }
                  }
                  L35: {
                    var30 = stackIn_126_0;
                    if (-2 <= (ln.field_a.b(var27, 5857, var26) ^ -1)) {
                      stackOut_128_0 = 0;
                      stackIn_129_0 = stackOut_128_0;
                      break L35;
                    } else {
                      stackOut_127_0 = 1;
                      stackIn_129_0 = stackOut_127_0;
                      break L35;
                    }
                  }
                  L36: {
                    var31 = stackIn_129_0;
                    if (var28 == 0) {
                      if (var29 == 0) {
                        if (var30 == 0) {
                          if (var31 != 0) {
                            stackOut_137_0 = 1;
                            stackIn_139_0 = stackOut_137_0;
                            break L36;
                          } else {
                            stackOut_136_0 = 0;
                            stackIn_139_0 = stackOut_136_0;
                            break L36;
                          }
                        } else {
                          stackOut_134_0 = 1;
                          stackIn_139_0 = stackOut_134_0;
                          break L36;
                        }
                      } else {
                        stackOut_132_0 = 1;
                        stackIn_139_0 = stackOut_132_0;
                        break L36;
                      }
                    } else {
                      stackOut_130_0 = 1;
                      stackIn_139_0 = stackOut_130_0;
                      break L36;
                    }
                  }
                  L37: {
                    var32 = stackIn_139_0;
                    if (var32 == 0) {
                      L38: {
                        if (1 < ln.field_a.b(var27, 5857, -1 + var23)) {
                          break L38;
                        } else {
                          if (ln.field_a.b(var27, 5857, 1 + var23) > 1) {
                            break L38;
                          } else {
                            if (-2 > (ln.field_a.b(var27, 5857, var24 + -1) ^ -1)) {
                              break L38;
                            } else {
                              if (ln.field_a.b(var27, 5857, var24 + 1) > 1) {
                                break L38;
                              } else {
                                break L37;
                              }
                            }
                          }
                        }
                      }
                      var32 = 1;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  L39: {
                    var33 = 0;
                    if (var32 != 0) {
                      var33 = 1;
                      break L39;
                    } else {
                      L40: {
                        if (!param9.field_J) {
                          L41: {
                            if (var22 <= cm.field_c[var23]) {
                              if (var28 != 0) {
                                stackOut_174_0 = 0;
                                stackIn_175_0 = stackOut_174_0;
                                break L41;
                              } else {
                                stackOut_173_0 = 1;
                                stackIn_175_0 = stackOut_173_0;
                                break L41;
                              }
                            } else {
                              stackOut_171_0 = 0;
                              stackIn_175_0 = stackOut_171_0;
                              break L41;
                            }
                          }
                          L42: {
                            var34 = stackIn_175_0;
                            if (var22 <= cm.field_c[var26]) {
                              if (var31 != 0) {
                                stackOut_179_0 = 0;
                                stackIn_180_0 = stackOut_179_0;
                                break L42;
                              } else {
                                stackOut_178_0 = 1;
                                stackIn_180_0 = stackOut_178_0;
                                break L42;
                              }
                            } else {
                              stackOut_176_0 = 0;
                              stackIn_180_0 = stackOut_176_0;
                              break L42;
                            }
                          }
                          L43: {
                            var37 = stackIn_180_0;
                            if (cm.field_c[var24] >= var22) {
                              if (var29 != 0) {
                                stackOut_184_0 = 0;
                                stackIn_185_0 = stackOut_184_0;
                                break L43;
                              } else {
                                stackOut_183_0 = 1;
                                stackIn_185_0 = stackOut_183_0;
                                break L43;
                              }
                            } else {
                              stackOut_181_0 = 0;
                              stackIn_185_0 = stackOut_181_0;
                              break L43;
                            }
                          }
                          L44: {
                            var35 = stackIn_185_0;
                            if (cm.field_c[var25] >= var22) {
                              if (var30 != 0) {
                                stackOut_189_0 = 0;
                                stackIn_190_0 = stackOut_189_0;
                                break L44;
                              } else {
                                stackOut_188_0 = 1;
                                stackIn_190_0 = stackOut_188_0;
                                break L44;
                              }
                            } else {
                              stackOut_186_0 = 0;
                              stackIn_190_0 = stackOut_186_0;
                              break L44;
                            }
                          }
                          var36 = stackIn_190_0;
                          break L40;
                        } else {
                          L45: {
                            if (cm.field_c[var24] <= var22) {
                              if (var29 != 0) {
                                stackOut_153_0 = 0;
                                stackIn_154_0 = stackOut_153_0;
                                break L45;
                              } else {
                                stackOut_152_0 = 1;
                                stackIn_154_0 = stackOut_152_0;
                                break L45;
                              }
                            } else {
                              stackOut_150_0 = 0;
                              stackIn_154_0 = stackOut_150_0;
                              break L45;
                            }
                          }
                          L46: {
                            var34 = stackIn_154_0;
                            if (var22 >= cm.field_c[var26]) {
                              if (var31 != 0) {
                                stackOut_158_0 = 0;
                                stackIn_159_0 = stackOut_158_0;
                                break L46;
                              } else {
                                stackOut_157_0 = 1;
                                stackIn_159_0 = stackOut_157_0;
                                break L46;
                              }
                            } else {
                              stackOut_155_0 = 0;
                              stackIn_159_0 = stackOut_155_0;
                              break L46;
                            }
                          }
                          L47: {
                            var36 = stackIn_159_0;
                            if (var22 >= cm.field_c[var23]) {
                              if (var28 != 0) {
                                stackOut_163_0 = 0;
                                stackIn_164_0 = stackOut_163_0;
                                break L47;
                              } else {
                                stackOut_162_0 = 1;
                                stackIn_164_0 = stackOut_162_0;
                                break L47;
                              }
                            } else {
                              stackOut_160_0 = 0;
                              stackIn_164_0 = stackOut_160_0;
                              break L47;
                            }
                          }
                          var35 = stackIn_164_0;
                          if (var22 >= cm.field_c[var25]) {
                            L48: {
                              if (var30 != 0) {
                                stackOut_168_0 = 0;
                                stackIn_169_0 = stackOut_168_0;
                                break L48;
                              } else {
                                stackOut_167_0 = 1;
                                stackIn_169_0 = stackOut_167_0;
                                break L48;
                              }
                            }
                            var37 = stackIn_169_0;
                            break L40;
                          } else {
                            var37 = 0;
                            break L40;
                          }
                        }
                      }
                      L49: {
                        L50: {
                          if (var18 >= 224.0) {
                            break L50;
                          } else {
                            if (var18 >= 32.0) {
                              break L49;
                            } else {
                              break L50;
                            }
                          }
                        }
                        if (var34 != 0) {
                          break L49;
                        } else {
                          var33 = 1;
                          break L39;
                        }
                      }
                      L51: {
                        if (32.0 > var18) {
                          break L51;
                        } else {
                          if (96.0 <= var18) {
                            break L51;
                          } else {
                            if (var37 != 0) {
                              break L51;
                            } else {
                              var33 = 1;
                              break L39;
                            }
                          }
                        }
                      }
                      L52: {
                        if (96.0 > var18) {
                          break L52;
                        } else {
                          if (var18 >= 160.0) {
                            break L52;
                          } else {
                            if (var35 == 0) {
                              var33 = 1;
                              break L39;
                            } else {
                              break L52;
                            }
                          }
                        }
                      }
                      if (var18 < 160.0) {
                        break L39;
                      } else {
                        if (224.0 <= var18) {
                          break L39;
                        } else {
                          if (var36 == 0) {
                            var33 = 1;
                            break L39;
                          } else {
                            break L39;
                          }
                        }
                      }
                    }
                  }
                  if (var33 == 0) {
                    L53: {
                      if (1 != param9.field_i) {
                        break L53;
                      } else {
                        if (!param9.field_J) {
                          if (0 < tm.field_q) {
                            L54: {
                              if (-25 < param9.field_B) {
                                break L54;
                              } else {
                                param9.field_B = (int)((0.5 * Math.random() + 0.5) * 100.0);
                                break L54;
                              }
                            }
                            if (of.field_a != -1) {
                              break L53;
                            } else {
                              if (Math.random() >= 0.4) {
                                break L53;
                              } else {
                                L55: {
                                  L56: {
                                    var38 = uh.field_i;
                                    if (-5 <= param11) {
                                      break L56;
                                    } else {
                                      if (-5 >= (param15 ^ -1)) {
                                        break L56;
                                      } else {
                                        break L55;
                                      }
                                    }
                                  }
                                  var38 = var38 / 2;
                                  break L55;
                                }
                                jh.a(var38, (byte) 49, 12, jc.field_c, 6);
                                of.field_a = 20 - -(int)(50.0 * Math.random());
                                break L53;
                              }
                            }
                          } else {
                            L57: {
                              if ((param9.field_B ^ -1) < 99) {
                                break L57;
                              } else {
                                if (Math.random() < 0.04) {
                                  param9.field_B = (int)((0.5 + Math.random() * 0.5) * 100.0);
                                  break L57;
                                } else {
                                  break L57;
                                }
                              }
                            }
                            if (of.field_a != 0) {
                              break L53;
                            } else {
                              if (Math.random() >= 0.4) {
                                break L53;
                              } else {
                                L58: {
                                  L59: {
                                    var38 = uh.field_i;
                                    if (param11 >= 4) {
                                      break L59;
                                    } else {
                                      if (4 > param15) {
                                        break L58;
                                      } else {
                                        break L59;
                                      }
                                    }
                                  }
                                  var38 = var38 / 2;
                                  break L58;
                                }
                                jh.a(var38, (byte) 40, 12, jc.field_c, 6);
                                of.field_a = (int)(50.0 * Math.random()) + 20;
                                break L53;
                              }
                            }
                          }
                        } else {
                          break L53;
                        }
                      }
                    }
                    L60: {
                      if (0 >= param9.field_B) {
                        break L60;
                      } else {
                        param6 = param6 * 3;
                        param9.field_p = param9.field_p + 2;
                        if (param9.field_p >= param9.field_C) {
                          param9.field_p = 0;
                          param9.field_z = param9.field_z + 1;
                          break L60;
                        } else {
                          break L60;
                        }
                      }
                    }
                    L61: {
                      param9.a(225, var18, 3);
                      li.field_r = param9.a(ln.field_a, 128, param6);
                      if (li.field_r[0]) {
                        break L61;
                      } else {
                        if (!li.field_r[1]) {
                          break L28;
                        } else {
                          break L61;
                        }
                      }
                    }
                    param9.field_D = 50;
                    param9.field_w = 0;
                    break L28;
                  } else {
                    L62: {
                      if (1 != param9.field_i) {
                        break L62;
                      } else {
                        if (param9.field_J) {
                          break L62;
                        } else {
                          if (tm.field_q > 0) {
                            if ((param9.field_B ^ -1) >= 24) {
                              param9.field_B = (int)((Math.random() + 0.5) * 100.0);
                              break L62;
                            } else {
                              break L62;
                            }
                          } else {
                            if (99 > (param9.field_B ^ -1)) {
                              break L62;
                            } else {
                              if (Math.random() >= 0.02) {
                                break L62;
                              } else {
                                param9.field_B = (int)(100.0 * (Math.random() + 0.5));
                                break L62;
                              }
                            }
                          }
                        }
                      }
                    }
                    L63: {
                      if (param9.field_B <= 0) {
                        break L63;
                      } else {
                        param6 = param6 * 3;
                        param9.field_p = param9.field_p + 2;
                        if (param9.field_p >= param9.field_C) {
                          param9.field_p = 0;
                          param9.field_z = param9.field_z + 1;
                          break L63;
                        } else {
                          break L63;
                        }
                      }
                    }
                    L64: {
                      if (!param9.field_J) {
                        L65: {
                          if (var22 <= cm.field_c[var26]) {
                            if (var31 != 0) {
                              stackOut_260_0 = 0;
                              stackIn_261_0 = stackOut_260_0;
                              break L65;
                            } else {
                              stackOut_259_0 = 1;
                              stackIn_261_0 = stackOut_259_0;
                              break L65;
                            }
                          } else {
                            stackOut_257_0 = 0;
                            stackIn_261_0 = stackOut_257_0;
                            break L65;
                          }
                        }
                        L66: {
                          var37 = stackIn_261_0;
                          if (cm.field_c[var25] >= var22) {
                            if (var30 != 0) {
                              stackOut_265_0 = 0;
                              stackIn_266_0 = stackOut_265_0;
                              break L66;
                            } else {
                              stackOut_264_0 = 1;
                              stackIn_266_0 = stackOut_264_0;
                              break L66;
                            }
                          } else {
                            stackOut_262_0 = 0;
                            stackIn_266_0 = stackOut_262_0;
                            break L66;
                          }
                        }
                        L67: {
                          var36 = stackIn_266_0;
                          if (var22 <= cm.field_c[var24]) {
                            if (var29 != 0) {
                              stackOut_270_0 = 0;
                              stackIn_271_0 = stackOut_270_0;
                              break L67;
                            } else {
                              stackOut_269_0 = 1;
                              stackIn_271_0 = stackOut_269_0;
                              break L67;
                            }
                          } else {
                            stackOut_267_0 = 0;
                            stackIn_271_0 = stackOut_267_0;
                            break L67;
                          }
                        }
                        L68: {
                          var35 = stackIn_271_0;
                          if (var22 > cm.field_c[var23]) {
                            stackOut_273_0 = 0;
                            stackIn_274_0 = stackOut_273_0;
                            break L68;
                          } else {
                            stackOut_272_0 = 1;
                            stackIn_274_0 = stackOut_272_0;
                            break L68;
                          }
                        }
                        var34 = stackIn_274_0;
                        if (var34 != 0) {
                          break L64;
                        } else {
                          if (var35 != 0) {
                            break L64;
                          } else {
                            if (var36 != 0) {
                              break L64;
                            } else {
                              if (var37 == 0) {
                                if (var30 == 0) {
                                  var36 = 1;
                                  break L64;
                                } else {
                                  if (var28 == 0) {
                                    var34 = 1;
                                    break L64;
                                  } else {
                                    break L64;
                                  }
                                }
                              } else {
                                break L64;
                              }
                            }
                          }
                        }
                      } else {
                        L69: {
                          if (cm.field_c[var24] <= var22) {
                            if (var29 == 0) {
                              stackOut_230_0 = 1;
                              stackIn_232_0 = stackOut_230_0;
                              break L69;
                            } else {
                              stackOut_229_0 = 0;
                              stackIn_232_0 = stackOut_229_0;
                              break L69;
                            }
                          } else {
                            stackOut_227_0 = 0;
                            stackIn_232_0 = stackOut_227_0;
                            break L69;
                          }
                        }
                        L70: {
                          var34 = stackIn_232_0;
                          if (var22 >= cm.field_c[var26]) {
                            if (var31 == 0) {
                              stackOut_236_0 = 1;
                              stackIn_238_0 = stackOut_236_0;
                              break L70;
                            } else {
                              stackOut_235_0 = 0;
                              stackIn_238_0 = stackOut_235_0;
                              break L70;
                            }
                          } else {
                            stackOut_233_0 = 0;
                            stackIn_238_0 = stackOut_233_0;
                            break L70;
                          }
                        }
                        L71: {
                          var36 = stackIn_238_0;
                          if (var22 >= cm.field_c[var23]) {
                            if (var28 != 0) {
                              stackOut_242_0 = 0;
                              stackIn_243_0 = stackOut_242_0;
                              break L71;
                            } else {
                              stackOut_241_0 = 1;
                              stackIn_243_0 = stackOut_241_0;
                              break L71;
                            }
                          } else {
                            stackOut_239_0 = 0;
                            stackIn_243_0 = stackOut_239_0;
                            break L71;
                          }
                        }
                        L72: {
                          var35 = stackIn_243_0;
                          if (cm.field_c[var25] <= var22) {
                            if (var30 != 0) {
                              stackOut_247_0 = 0;
                              stackIn_248_0 = stackOut_247_0;
                              break L72;
                            } else {
                              stackOut_246_0 = 1;
                              stackIn_248_0 = stackOut_246_0;
                              break L72;
                            }
                          } else {
                            stackOut_244_0 = 0;
                            stackIn_248_0 = stackOut_244_0;
                            break L72;
                          }
                        }
                        var37 = stackIn_248_0;
                        if (var34 != 0) {
                          break L64;
                        } else {
                          if (var35 != 0) {
                            break L64;
                          } else {
                            if (var36 != 0) {
                              break L64;
                            } else {
                              if (var37 != 0) {
                                break L64;
                              } else {
                                if (var30 == 0) {
                                  var37 = 1;
                                  break L64;
                                } else {
                                  if (var28 != 0) {
                                    break L64;
                                  } else {
                                    var35 = 1;
                                    break L64;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L73: {
                      if (var34 != 0) {
                        var18 = 0.0;
                        break L73;
                      } else {
                        break L73;
                      }
                    }
                    L74: {
                      if (var35 != 0) {
                        var18 = 128.0;
                        break L74;
                      } else {
                        break L74;
                      }
                    }
                    L75: {
                      if (var36 != 0) {
                        var18 = 192.0;
                        break L75;
                      } else {
                        break L75;
                      }
                    }
                    L76: {
                      if (var37 == 0) {
                        break L76;
                      } else {
                        var18 = 64.0;
                        break L76;
                      }
                    }
                    L77: {
                      L78: {
                        param9.a(225, var18, 3);
                        if (64.0 == var18) {
                          break L78;
                        } else {
                          if (192.0 != var18) {
                            break L77;
                          } else {
                            break L78;
                          }
                        }
                      }
                      L79: {
                        if (0.5 > param4.field_a) {
                          param4.field_a = param4.field_a + 0.01;
                          break L79;
                        } else {
                          break L79;
                        }
                      }
                      if (0.5 < param4.field_a) {
                        param4.field_a = param4.field_a - 0.01;
                        break L77;
                      } else {
                        break L77;
                      }
                    }
                    L80: {
                      L81: {
                        if (0.0 == var18) {
                          break L81;
                        } else {
                          if (var18 == 128.0) {
                            break L81;
                          } else {
                            break L80;
                          }
                        }
                      }
                      L82: {
                        if (0.5 > param4.field_f) {
                          param4.field_f = param4.field_f + 0.01;
                          break L82;
                        } else {
                          break L82;
                        }
                      }
                      if (param4.field_f > 0.5) {
                        param4.field_f = param4.field_f - 0.01;
                        break L80;
                      } else {
                        break L80;
                      }
                    }
                    L83: {
                      L84: {
                        var38 = param6;
                        var39 = var38 / 2;
                        var38 = var38 - var39;
                        li.field_r = param9.a(ln.field_a, 128, var39);
                        if (li.field_r[0]) {
                          break L84;
                        } else {
                          if (li.field_r[1]) {
                            break L84;
                          } else {
                            break L83;
                          }
                        }
                      }
                      if ((param9.field_i ^ -1) != -28) {
                        break L83;
                      } else {
                        if (!param9.field_s) {
                          param9.field_I = param9.field_x;
                          param9.field_L = 100;
                          param9.field_s = true;
                          break L83;
                        } else {
                          break L83;
                        }
                      }
                    }
                    var39 = var38 / 2;
                    param9.a(225, var18, 1);
                    li.field_r = param9.a(ln.field_a, 128, var39);
                    var38 = var38 - var39;
                    if (!li.field_r[0]) {
                      if (li.field_r[1]) {
                        param9.a(225, var18, 1);
                        li.field_r = param9.a(ln.field_a, 128, var38);
                        if (li.field_r[0]) {
                          break L28;
                        } else {
                          if (!li.field_r[1]) {
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                      } else {
                        param9.a(225, var18, 1);
                        li.field_r = param9.a(ln.field_a, 128, var38);
                        if (li.field_r[0]) {
                          break L28;
                        } else {
                          if (!li.field_r[1]) {
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                      }
                    } else {
                      param9.a(225, var18, 1);
                      li.field_r = param9.a(ln.field_a, 128, var38);
                      if (li.field_r[0]) {
                        break L28;
                      } else {
                        if (!li.field_r[1]) {
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                    }
                  }
                } else {
                  L85: {
                    if (0 >= param9.field_B) {
                      break L85;
                    } else {
                      param9.field_B = 0;
                      break L85;
                    }
                  }
                  L86: {
                    if (0 <= param9.field_I) {
                      param9.field_t = param6;
                      param9.field_K = param9.field_c;
                      break L86;
                    } else {
                      break L86;
                    }
                  }
                  L87: {
                    li.field_r = param9.a(param6, 3, ln.field_a);
                    if (li.field_r[0]) {
                      break L87;
                    } else {
                      if (li.field_r[1]) {
                        break L87;
                      } else {
                        if (0.01 > Math.random()) {
                          param9.field_D = 50;
                          param9.field_w = 0;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                    }
                  }
                  param9.field_w = 0;
                  param9.field_D = 50;
                  break L28;
                }
              }
              if (param9.field_i != 27) {
                break L8;
              } else {
                L88: {
                  ln.field_a.field_c[param12] = 6;
                  if (0 == ln.field_a.field_c[-1 + param12]) {
                    ln.field_a.field_c[-1 + param12] = 6;
                    break L88;
                  } else {
                    break L88;
                  }
                }
                L89: {
                  if (0 == ln.field_a.field_c[-1 + -ln.field_a.field_d + param12]) {
                    ln.field_a.field_c[-ln.field_a.field_d + (param12 - 1)] = 6;
                    break L89;
                  } else {
                    break L89;
                  }
                }
                if (ln.field_a.field_c[-ln.field_a.field_d + param12] == 0) {
                  ln.field_a.field_c[param12 + -ln.field_a.field_d] = 6;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
          } else {
            L90: {
              if ((param9.field_i ^ -1) != -28) {
                break L90;
              } else {
                if (param9.field_s) {
                  break L90;
                } else {
                  if (var21 != 0) {
                    break L90;
                  } else {
                    break L8;
                  }
                }
              }
            }
            if (param8) {
              if (var21 == 0) {
                param9.field_J = false;
                if (var20 == 0) {
                  param9.field_w = 1;
                  param9.a(225, var18, param14);
                  break L8;
                } else {
                  param9.field_w = 4;
                  param9.field_c = var18;
                  break L8;
                }
              } else {
                param9.field_w = 1;
                param9.field_J = true;
                break L8;
              }
            } else {
              param9.field_D = param9.field_D - 1;
              if (param9.field_D - 1 > -1) {
                var22 = (int)(Math.random() * 3.0);
                if (-1 != var22) {
                  if (-2 != (var22 ^ -1)) {
                    if (var22 == 2) {
                      param9.field_w = 3;
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    param9.field_w = 2;
                    break L8;
                  }
                } else {
                  param9.field_w = 1;
                  break L8;
                }
              } else {
                break L8;
              }
            }
          }
        }
        L91: {
          if (-6 == (param9.field_w ^ -1)) {
            break L91;
          } else {
            L92: {
              if (var21 == 0) {
                break L92;
              } else {
                param9.field_J = true;
                param9.field_w = 1;
                break L92;
              }
            }
            L93: {
              if (param11 > param1) {
                break L93;
              } else {
                if (param1 < param15) {
                  break L93;
                } else {
                  if (-param1 > param11) {
                    break L93;
                  } else {
                    if (-param1 > param15) {
                      break L93;
                    } else {
                      if (-20 != (param9.field_i ^ -1)) {
                        if (param9.field_J) {
                          break L91;
                        } else {
                          param9.field_w = 4;
                          break L91;
                        }
                      } else {
                        break L91;
                      }
                    }
                  }
                }
              }
            }
            param9.field_J = false;
            break L91;
          }
        }
        L94: {
          if (param9.field_I <= 0) {
            tm.field_q = 2;
            if (param9.field_i == 27) {
              break L94;
            } else {
              if ((param9.field_w ^ -1) != -6) {
                param9.field_z = 0;
                param9.field_w = 5;
                param9.e((byte) -49);
                if (8 != param9.field_i) {
                  break L94;
                } else {
                  param9.field_C = 16;
                  break L94;
                }
              } else {
                break L94;
              }
            }
          } else {
            break L94;
          }
        }
        ak.field_f = ak.field_f + 1;
        if (param13 >= 12) {
          L95: {
            if (!param8) {
              break L95;
            } else {
              ak.field_f = ak.field_f + 50;
              break L95;
            }
          }
          L96: {
            if (-5 != (param9.field_w ^ -1)) {
              break L96;
            } else {
              ak.field_f = ak.field_f + 450;
              break L96;
            }
          }
          L97: {
            if ((param9.field_i ^ -1) != -28) {
              break L97;
            } else {
              L98: {
                if (4 != param9.field_w) {
                  var22 = cm.field_c[param9.field_j.b(-4)];
                  if (0 >= var22) {
                    break L98;
                  } else {
                    lj.field_q = lj.field_q + var22 * 50;
                    break L98;
                  }
                } else {
                  lj.field_q = 256;
                  break L98;
                }
              }
              if (lj.field_q < 20) {
                lj.field_q = 20;
                break L97;
              } else {
                break L97;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static bd[] a(int param0, int param1, int param2, int param3, int param4) {
        bd[] var6 = new bd[9];
        bd[] var5 = var6;
        var6[6] = el.a(-7, param1, param3);
        var5[3] = el.a(-7, param1, param3);
        var5[2] = el.a(-7, param1, param3);
        var5[1] = el.a(-7, param1, param3);
        var5[0] = el.a(-7, param1, param3);
        if (param4 <= 101) {
            field_o = null;
        }
        var6[8] = el.a(-122, param1, param0);
        var5[7] = el.a(-122, param1, param0);
        var5[5] = el.a(-122, param1, param0);
        if (-1 != (param2 ^ -1)) {
            var6[4] = el.a(-115, 64, param2);
        }
        return var5;
    }

    final static void d(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        int stackOut_3_5 = 0;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          if (-51 < jf.field_d) {
            L1: {
              stackOut_2_0 = 0;
              stackOut_2_1 = 0;
              stackOut_2_2 = 640;
              stackOut_2_3 = 480;
              stackOut_2_4 = 0;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              stackIn_4_4 = stackOut_2_4;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              stackIn_3_2 = stackOut_2_2;
              stackIn_3_3 = stackOut_2_3;
              stackIn_3_4 = stackOut_2_4;
              if (-26 > jf.field_d) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackOut_4_4 = stackIn_4_4;
                stackOut_4_5 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                stackIn_5_4 = stackOut_4_4;
                stackIn_5_5 = stackOut_4_5;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = stackIn_3_4;
                stackOut_3_5 = -50 + 2 * jf.field_d;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_5_3 = stackOut_3_3;
                stackIn_5_4 = stackOut_3_4;
                stackIn_5_5 = stackOut_3_5;
                break L1;
              }
            }
            si.a(stackIn_5_0, stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4, -(stackIn_5_5 * 5) + 250);
            var1 = -72 + mm.field_m[0].field_j.field_e * 24 - uj.field_p.field_e;
            var2 = -48 + 24 * mm.field_m[0].field_j.field_g - uj.field_p.field_g;
            if (dl.field_n == null) {
              break L0;
            } else {
              L2: {
                var3 = 0;
                var4 = 1;
                if (bm.field_c == 0) {
                  L3: {
                    if (rl.field_c == 0) {
                      var4 = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if ((rl.field_c ^ -1) == -2) {
                    var3 = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  L4: {
                    if (rl.field_c >= -5) {
                      var3 = 1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (0 != rl.field_c) {
                      break L5;
                    } else {
                      var4 = 0;
                      break L5;
                    }
                  }
                  L6: {
                    if (-9 != rl.field_c) {
                      break L6;
                    } else {
                      var4 = 0;
                      break L6;
                    }
                  }
                  if (rl.field_c != 9) {
                    break L2;
                  } else {
                    var4 = 0;
                    break L2;
                  }
                }
              }
              if (var4 == 0) {
                break L0;
              } else {
                vj.field_e[0].a(true, 128, 192, var1 + dl.field_n.field_z / 2, dl.field_n.field_z / 2 + var2);
                if (var3 == 0) {
                  if (jf.field_d >= 40) {
                    dl.field_n.c(-((50 - jf.field_d) / 2) + var1, -((-jf.field_d + 50) / 2) + var2, -jf.field_d + dl.field_n.field_u - -50, 50 + dl.field_n.field_r - jf.field_d, -(25 * jf.field_d) + 1250);
                    break L0;
                  } else {
                    dl.field_n.a(var1 - (-jf.field_d + 50) / 2, var2 + -((50 - jf.field_d) / 2), 50 + (dl.field_n.field_u - jf.field_d), 50 + (dl.field_n.field_r + -jf.field_d));
                    si.a(-((-jf.field_d + 50) / 2) + var1, -((-jf.field_d + 50) / 2) + var2, dl.field_n.field_u + 50 - jf.field_d, 50 + dl.field_n.field_r + -jf.field_d, 0, (10200 - 255 * jf.field_d) / 40);
                    break L0;
                  }
                } else {
                  if ((jf.field_d ^ -1) > -41) {
                    dl.field_n.b(var1 + dl.field_n.field_z / 2, var2 + dl.field_n.field_z / 2, 0, jf.field_d + 78 << -931948667);
                    break L0;
                  } else {
                    dl.field_n.c((50 + -jf.field_d) / 4 + var1, var2 - -((-jf.field_d + 50) / 4), -((-jf.field_d + 50) / 2) + dl.field_n.field_u, dl.field_n.field_r + -((50 - jf.field_d) / 2), -(25 * jf.field_d) + 1250);
                    break L0;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        L7: {
          if (param0 <= -8) {
            break L7;
          } else {
            ei.d(-29);
            break L7;
          }
        }
    }

    final static void a(p param0, byte param1, int[] param2, int param3, int[] param4, int[] param5) {
        int var6 = 0;
        oc var7 = null;
        og var8 = null;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = HostileSpawn.field_I ? 1 : 0;
          param0.a(param1 ^ -8463);
          param0.field_e = 0;
          if (param1 == -116) {
            break L0;
          } else {
            ei.d(49);
            break L0;
          }
        }
        var6 = 0;
        var7 = param0.field_j;
        var8 = param0.field_l;
        var9 = param0.field_c;
        param4[param3] = 0;
        var11 = ln.field_a.field_r[param3] ? 1 : 0;
        L1: while (true) {
          L2: {
            if (-1 != (param0.field_e ^ -1)) {
              break L2;
            } else {
              if (var6 >= 104) {
                break L2;
              } else {
                L3: {
                  var8.a(5, (byte) 94, var9);
                  var6++;
                  param0.a(param1 + 8689);
                  var12 = var7.b(-4);
                  if (var11 != 0) {
                    break L3;
                  } else {
                    if (wb.field_Z) {
                      break L3;
                    } else {
                      if (!ln.field_a.field_r[var12]) {
                        break L3;
                      } else {
                        param0.field_e = 1;
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  var11 = ln.field_a.field_r[var12] ? 1 : 0;
                  if (param2[var12] == 1) {
                    if (4 <= var6) {
                      param0.field_e = 1;
                      break L4;
                    } else {
                      tg.a(var12, param1 + 30543);
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if ((param4[var12] ^ -1) == -3) {
                    param0.field_e = 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var13 = 26 + -(var6 >> 982722818);
                if (param5[var12] >= var13) {
                  continue L1;
                } else {
                  param5[var12] = var13;
                  continue L1;
                }
              }
            }
          }
          param4[param3] = 3;
          param0.field_i = -1;
          return;
        }
    }

    public static void c(int param0) {
        field_p = null;
        field_m = null;
        field_k = null;
        field_o = null;
        field_h = null;
        field_n = null;
        if (param0 != 3) {
            Object var2 = null;
            bd[] discarded$0 = ei.a((gb) null, 102, (String) null, (String) null);
        }
        field_q = null;
    }

    final static bd[] a(gb param0, int param1, String param2, String param3) {
        int var4 = param0.a((byte) -2, param2);
        if (param1 < 88) {
            Object var6 = null;
            ei.a(36, -95, (oc) null, true, (og) null, (oc) null, 63, -21, false, (oj) null, -5, 22, 60, 105, 79, 88, (oc) null);
        }
        int var5 = param0.a(var4, param3, -1);
        return ne.a(44, param0, var5, var4);
    }

    ei(long param0, int param1, byte[] param2) {
        ((ei) this).field_r = param2;
        ((ei) this).field_j = param0;
        ((ei) this).field_s = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = false;
        field_l = 0;
        field_k = "Passwords must be between 5 and 20 characters long";
        field_q = new vl();
        field_t = true;
        field_h = new vl();
    }
}
