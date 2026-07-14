/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs {
    static float[] field_b;
    static int[][] field_d;
    static String[] field_c;
    static String field_a;

    final static void a(int param0, boolean param1, boolean param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        Object var10_ref = null;
        vb var10_ref_vb = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        int stackIn_53_4 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        int stackIn_54_3 = 0;
        int stackIn_54_4 = 0;
        int stackIn_54_5 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        int stackOut_51_4 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        int stackOut_53_4 = 0;
        int stackOut_53_5 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        int stackOut_52_3 = 0;
        int stackOut_52_4 = 0;
        int stackOut_52_5 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        int stackOut_17_5 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        L0: {
          var10_ref = null;
          var12 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (!param1) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        if (!param2) {
          L1: {
            var9 = param5 + og.field_p[param5];
            if ((vs.field_e[param5].field_h ^ -1) == -4) {
              eq.a(20 + param0, true, (byte) 126, var9, param3, false, 40 + param4, param7);
              break L1;
            } else {
              break L1;
            }
          }
          rl.a(1, param5, param4, false, param0);
          var10_ref_vb = (vb) (Object) jf.field_C.field_pc.e((byte) 122);
          L2: while (true) {
            if (var10_ref_vb == null) {
              L3: {
                if (-4 != (vs.field_e[param5].field_h ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    stackOut_51_0 = param0 + 20;
                    stackOut_51_1 = 0;
                    stackOut_51_2 = 126;
                    stackOut_51_3 = var9;
                    stackOut_51_4 = param3;
                    stackIn_53_0 = stackOut_51_0;
                    stackIn_53_1 = stackOut_51_1;
                    stackIn_53_2 = stackOut_51_2;
                    stackIn_53_3 = stackOut_51_3;
                    stackIn_53_4 = stackOut_51_4;
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    stackIn_52_2 = stackOut_51_2;
                    stackIn_52_3 = stackOut_51_3;
                    stackIn_52_4 = stackOut_51_4;
                    if (null == vs.field_e[param5].field_c) {
                      stackOut_53_0 = stackIn_53_0;
                      stackOut_53_1 = stackIn_53_1;
                      stackOut_53_2 = stackIn_53_2;
                      stackOut_53_3 = stackIn_53_3;
                      stackOut_53_4 = stackIn_53_4;
                      stackOut_53_5 = 0;
                      stackIn_54_0 = stackOut_53_0;
                      stackIn_54_1 = stackOut_53_1;
                      stackIn_54_2 = stackOut_53_2;
                      stackIn_54_3 = stackOut_53_3;
                      stackIn_54_4 = stackOut_53_4;
                      stackIn_54_5 = stackOut_53_5;
                      break L4;
                    } else {
                      stackOut_52_0 = stackIn_52_0;
                      stackOut_52_1 = stackIn_52_1;
                      stackOut_52_2 = stackIn_52_2;
                      stackOut_52_3 = stackIn_52_3;
                      stackOut_52_4 = stackIn_52_4;
                      stackOut_52_5 = 1;
                      stackIn_54_0 = stackOut_52_0;
                      stackIn_54_1 = stackOut_52_1;
                      stackIn_54_2 = stackOut_52_2;
                      stackIn_54_3 = stackOut_52_3;
                      stackIn_54_4 = stackOut_52_4;
                      stackIn_54_5 = stackOut_52_5;
                      break L4;
                    }
                  }
                  eq.a(stackIn_54_0, stackIn_54_1 != 0, (byte) stackIn_54_2, stackIn_54_3, stackIn_54_4, stackIn_54_5 != 0, 40 + param4, param7);
                  break L3;
                }
              }
              L5: {
                if (!vs.field_e[param5].c((byte) -79)) {
                  break L5;
                } else {
                  L6: {
                    var10 = vs.field_e[param5].b((byte) -56);
                    var11 = 0;
                    if (param6 == 0) {
                      var11 = var11 | 1;
                      break L6;
                    } else {
                      if (vs.field_e[param5 + -1].b((byte) -55) == var10) {
                        break L6;
                      } else {
                        L7: {
                          L8: {
                            var11 = var11 | 1;
                            if (param8 == 0) {
                              break L8;
                            } else {
                              if (vs.field_e[param5 - ks.field_y].b((byte) -22) == var10) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var11 = var11 | 2;
                          break L7;
                        }
                        L9: {
                          L10: {
                            if (-1 + ks.field_y == param6) {
                              break L10;
                            } else {
                              if (var10 == vs.field_e[param5 + 1].b((byte) -90)) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var11 = var11 | 4;
                          break L9;
                        }
                        L11: {
                          L12: {
                            if (param8 == -1 + ef.field_c) {
                              break L12;
                            } else {
                              if (var10 == vs.field_e[param5 - -ks.field_y].b((byte) -75)) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          var11 = var11 | 8;
                          break L11;
                        }
                        L13: {
                          dm.a(var10, false, param0 - -20, param4 + 40, var11, false);
                          var10 = bv.field_w.b(31, param8, param6, -1);
                          if (-1 == (2 & var10 ^ -1)) {
                            break L13;
                          } else {
                            nt.a(894, var9, ug.field_b, param4, param0);
                            break L13;
                          }
                        }
                        return;
                      }
                    }
                  }
                  L14: {
                    if (param8 == 0) {
                      var11 = var11 | 2;
                      break L14;
                    } else {
                      if (vs.field_e[param5 - ks.field_y].b((byte) -22) == var10) {
                        break L14;
                      } else {
                        L15: {
                          var11 = var11 | 2;
                          if (-1 + ks.field_y == param6) {
                            var11 = var11 | 4;
                            break L15;
                          } else {
                            if (var10 == vs.field_e[param5 + 1].b((byte) -90)) {
                              break L15;
                            } else {
                              L16: {
                                L17: {
                                  var11 = var11 | 4;
                                  if (param8 == -1 + ef.field_c) {
                                    break L17;
                                  } else {
                                    if (var10 == vs.field_e[param5 - -ks.field_y].b((byte) -75)) {
                                      break L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                var11 = var11 | 8;
                                break L16;
                              }
                              L18: {
                                dm.a(var10, false, param0 - -20, param4 + 40, var11, false);
                                var10 = bv.field_w.b(31, param8, param6, -1);
                                if (-1 == (2 & var10 ^ -1)) {
                                  break L18;
                                } else {
                                  nt.a(894, var9, ug.field_b, param4, param0);
                                  break L18;
                                }
                              }
                              return;
                            }
                          }
                        }
                        L19: {
                          if (param8 == -1 + ef.field_c) {
                            var11 = var11 | 8;
                            break L19;
                          } else {
                            if (var10 == vs.field_e[param5 - -ks.field_y].b((byte) -75)) {
                              break L19;
                            } else {
                              L20: {
                                var11 = var11 | 8;
                                dm.a(var10, false, param0 - -20, param4 + 40, var11, false);
                                var10 = bv.field_w.b(31, param8, param6, -1);
                                if (-1 == (2 & var10 ^ -1)) {
                                  break L20;
                                } else {
                                  nt.a(894, var9, ug.field_b, param4, param0);
                                  break L20;
                                }
                              }
                              return;
                            }
                          }
                        }
                        dm.a(var10, false, param0 - -20, param4 + 40, var11, false);
                        var10 = bv.field_w.b(31, param8, param6, -1);
                        if (-1 != (2 & var10 ^ -1)) {
                          nt.a(894, var9, ug.field_b, param4, param0);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L21: {
                    if (-1 + ks.field_y == param6) {
                      var11 = var11 | 4;
                      break L21;
                    } else {
                      if (var10 == vs.field_e[param5 + 1].b((byte) -90)) {
                        break L21;
                      } else {
                        L22: {
                          var11 = var11 | 4;
                          if (param8 == -1 + ef.field_c) {
                            var11 = var11 | 8;
                            break L22;
                          } else {
                            if (var10 == vs.field_e[param5 - -ks.field_y].b((byte) -75)) {
                              break L22;
                            } else {
                              var11 = var11 | 8;
                              dm.a(var10, false, param0 - -20, param4 + 40, var11, false);
                              var10 = bv.field_w.b(31, param8, param6, -1);
                              if (-1 == (2 & var10 ^ -1)) {
                                return;
                              } else {
                                nt.a(894, var9, ug.field_b, param4, param0);
                                return;
                              }
                            }
                          }
                        }
                        dm.a(var10, false, param0 - -20, param4 + 40, var11, false);
                        var10 = bv.field_w.b(31, param8, param6, -1);
                        if (-1 != (2 & var10 ^ -1)) {
                          nt.a(894, var9, ug.field_b, param4, param0);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L23: {
                    if (param8 == -1 + ef.field_c) {
                      var11 = var11 | 8;
                      break L23;
                    } else {
                      if (var10 == vs.field_e[param5 - -ks.field_y].b((byte) -75)) {
                        break L23;
                      } else {
                        var11 = var11 | 8;
                        dm.a(var10, false, param0 - -20, param4 + 40, var11, false);
                        var10 = bv.field_w.b(31, param8, param6, -1);
                        if (-1 != (2 & var10 ^ -1)) {
                          nt.a(894, var9, ug.field_b, param4, param0);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  dm.a(var10, false, param0 - -20, param4 + 40, var11, false);
                  break L5;
                }
              }
              var10 = bv.field_w.b(31, param8, param6, -1);
              if (-1 != (2 & var10 ^ -1)) {
                nt.a(894, var9, ug.field_b, param4, param0);
                return;
              } else {
                return;
              }
            } else {
              L24: {
                if (param5 != var10_ref_vb.field_x) {
                  break L24;
                } else {
                  var10_ref_vb.a(ug.field_b, 31785, false);
                  break L24;
                }
              }
              var10_ref_vb = (vb) (Object) jf.field_C.field_pc.a((byte) 123);
              continue L2;
            }
          }
        } else {
          if (null != vs.field_e[param5].field_c) {
            L25: {
              var9 = param5 + og.field_p[param5];
              if ((vs.field_e[param5].field_h ^ -1) == -4) {
                eq.a(20 + param0, true, (byte) 126, var9, param3, false, 40 + param4, param7);
                break L25;
              } else {
                break L25;
              }
            }
            rl.a(1, param5, param4, false, param0);
            var10_ref_vb = (vb) (Object) jf.field_C.field_pc.e((byte) 122);
            L26: while (true) {
              if (var10_ref_vb == null) {
                L27: {
                  if (-4 != (vs.field_e[param5].field_h ^ -1)) {
                    break L27;
                  } else {
                    L28: {
                      stackOut_15_0 = param0 + 20;
                      stackOut_15_1 = 0;
                      stackOut_15_2 = 126;
                      stackOut_15_3 = var9;
                      stackOut_15_4 = param3;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      stackIn_17_3 = stackOut_15_3;
                      stackIn_17_4 = stackOut_15_4;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      stackIn_16_2 = stackOut_15_2;
                      stackIn_16_3 = stackOut_15_3;
                      stackIn_16_4 = stackOut_15_4;
                      if (null == vs.field_e[param5].field_c) {
                        stackOut_17_0 = stackIn_17_0;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = stackIn_17_2;
                        stackOut_17_3 = stackIn_17_3;
                        stackOut_17_4 = stackIn_17_4;
                        stackOut_17_5 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        stackIn_18_3 = stackOut_17_3;
                        stackIn_18_4 = stackOut_17_4;
                        stackIn_18_5 = stackOut_17_5;
                        break L28;
                      } else {
                        stackOut_16_0 = stackIn_16_0;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = stackIn_16_2;
                        stackOut_16_3 = stackIn_16_3;
                        stackOut_16_4 = stackIn_16_4;
                        stackOut_16_5 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        stackIn_18_3 = stackOut_16_3;
                        stackIn_18_4 = stackOut_16_4;
                        stackIn_18_5 = stackOut_16_5;
                        break L28;
                      }
                    }
                    eq.a(stackIn_18_0, stackIn_18_1 != 0, (byte) stackIn_18_2, stackIn_18_3, stackIn_18_4, stackIn_18_5 != 0, 40 + param4, param7);
                    break L27;
                  }
                }
                L29: {
                  if (!vs.field_e[param5].c((byte) -79)) {
                    break L29;
                  } else {
                    L30: {
                      L31: {
                        var10 = vs.field_e[param5].b((byte) -56);
                        var11 = 0;
                        if (param6 == 0) {
                          break L31;
                        } else {
                          if (vs.field_e[param5 + -1].b((byte) -55) == var10) {
                            break L30;
                          } else {
                            break L31;
                          }
                        }
                      }
                      var11 = var11 | 1;
                      break L30;
                    }
                    L32: {
                      L33: {
                        if (param8 == 0) {
                          break L33;
                        } else {
                          if (vs.field_e[param5 - ks.field_y].b((byte) -22) == var10) {
                            break L32;
                          } else {
                            break L33;
                          }
                        }
                      }
                      var11 = var11 | 2;
                      break L32;
                    }
                    L34: {
                      L35: {
                        if (-1 + ks.field_y == param6) {
                          break L35;
                        } else {
                          if (var10 == vs.field_e[param5 + 1].b((byte) -90)) {
                            break L34;
                          } else {
                            break L35;
                          }
                        }
                      }
                      var11 = var11 | 4;
                      break L34;
                    }
                    L36: {
                      L37: {
                        if (param8 == -1 + ef.field_c) {
                          break L37;
                        } else {
                          if (var10 == vs.field_e[param5 - -ks.field_y].b((byte) -75)) {
                            break L36;
                          } else {
                            break L37;
                          }
                        }
                      }
                      var11 = var11 | 8;
                      break L36;
                    }
                    dm.a(var10, false, param0 - -20, param4 + 40, var11, false);
                    break L29;
                  }
                }
                var10 = bv.field_w.b(31, param8, param6, -1);
                if (-1 == (2 & var10 ^ -1)) {
                  return;
                } else {
                  nt.a(894, var9, ug.field_b, param4, param0);
                  return;
                }
              } else {
                L38: {
                  if (param5 != var10_ref_vb.field_x) {
                    break L38;
                  } else {
                    var10_ref_vb.a(ug.field_b, 31785, false);
                    break L38;
                  }
                }
                var10_ref_vb = (vb) (Object) jf.field_C.field_pc.a((byte) 123);
                continue L26;
              }
            }
          } else {
            return;
          }
        }
    }

    final static boolean a(byte param0, String param1) {
        CharSequence var3 = null;
        if (hf.field_c) {
          if (param0 > 108) {
            if (-3 == (rs.field_t ^ -1)) {
              if (null != wm.field_b) {
                var3 = (CharSequence) (Object) param1;
                if (wm.field_b.equals((Object) (Object) k.a(var3, false))) {
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
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        if (0 > kd.field_X) {
          return -2;
        } else {
          if (param2 <= param4) {
            if (param5 + param2 > param4) {
              L0: {
                if (param3 > param0) {
                  break L0;
                } else {
                  if (param3 - -param6 <= param0) {
                    break L0;
                  } else {
                    if (-45 < (param0 - param3 ^ -1)) {
                      return -3;
                    } else {
                      if (param1 == 24340) {
                        if (-4 + (param6 + -40) < -param3 + param0) {
                          return -3;
                        } else {
                          L1: {
                            var7 = param3 + (-dd.field_e + 44);
                            var8 = param2 - -(param5 >> 82817409);
                            var9 = (-var7 + param0) / 80 * 2;
                            if (param4 > var8) {
                              var9++;
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                          L2: {
                            stackOut_36_0 = var9;
                            stackIn_38_0 = stackOut_36_0;
                            stackIn_37_0 = stackOut_36_0;
                            if (!od.field_c[kd.field_X]) {
                              stackOut_38_0 = stackIn_38_0;
                              stackOut_38_1 = 0;
                              stackIn_39_0 = stackOut_38_0;
                              stackIn_39_1 = stackOut_38_1;
                              break L2;
                            } else {
                              stackOut_37_0 = stackIn_37_0;
                              stackOut_37_1 = -1;
                              stackIn_39_0 = stackOut_37_0;
                              stackIn_39_1 = stackOut_37_1;
                              break L2;
                            }
                          }
                          var9 = stackIn_39_0 + stackIn_39_1;
                          if (1 > (var9 ^ -1)) {
                            if (var9 < bc.field_j[kd.field_X].length) {
                              return var9;
                            } else {
                              return -3;
                            }
                          } else {
                            return -3;
                          }
                        }
                      } else {
                        var10 = null;
                        fs.a(-51, (String) null, (String) null, 30, 0);
                        if (-4 + (param6 + -40) < -param3 + param0) {
                          return -3;
                        } else {
                          L3: {
                            var7 = param3 + (-dd.field_e + 44);
                            var8 = param2 - -(param5 >> 82817409);
                            var9 = (-var7 + param0) / 80 * 2;
                            if (param4 > var8) {
                              var9++;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          L4: {
                            stackOut_21_0 = var9;
                            stackIn_23_0 = stackOut_21_0;
                            stackIn_22_0 = stackOut_21_0;
                            if (!od.field_c[kd.field_X]) {
                              stackOut_23_0 = stackIn_23_0;
                              stackOut_23_1 = 0;
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              break L4;
                            } else {
                              stackOut_22_0 = stackIn_22_0;
                              stackOut_22_1 = -1;
                              stackIn_24_0 = stackOut_22_0;
                              stackIn_24_1 = stackOut_22_1;
                              break L4;
                            }
                          }
                          var9 = stackIn_24_0 + stackIn_24_1;
                          if (1 > (var9 ^ -1)) {
                            if (var9 < bc.field_j[kd.field_X].length) {
                              return var9;
                            } else {
                              return -3;
                            }
                          } else {
                            return -3;
                          }
                        }
                      }
                    }
                  }
                }
              }
              return -2;
            } else {
              return -2;
            }
          } else {
            return -2;
          }
        }
    }

    final static boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_3_0 = 0;
        boolean stackOut_2_0 = false;
        if (param0) {
          L0: {
            fs.a(15, false, true, 64, -122, 113, -41, -38, 58);
            if (wq.field_a != null) {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ph.field_f;
              stackIn_8_0 = stackOut_6_0 ? 1 : 0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (wq.field_a != null) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ph.field_f;
              stackIn_4_0 = stackOut_2_0 ? 1 : 0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_a = null;
        if (param0 != -1) {
          var2 = null;
          fs.a(-83, (String) null, (String) null, 92, 123);
          field_b = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0, String param1, String param2, int param3, int param4) {
        qj.field_z.field_I = param1;
        qj.field_z.field_X = param2;
        qj.field_z.field_N = param0;
        int var5 = 112 % ((param3 - -51) / 39);
        qj.field_z.field_gb = qj.field_z.field_gb + rb.field_b.field_gb;
        rb.field_b.field_S = rb.field_b.field_S + rb.field_b.field_gb;
        rb.field_b.field_gb = param4;
        qj.field_z.field_gb = qj.field_z.field_gb - rb.field_b.field_gb;
        rb.field_b.field_S = rb.field_b.field_S - rb.field_b.field_gb;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[16];
        field_a = "Show players in <%0>'s game";
    }
}
