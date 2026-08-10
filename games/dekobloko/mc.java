/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static nk field_a;
    static int[] field_b;
    static int field_f;
    static String field_e;
    static String field_d;
    static String field_c;

    final static void a(boolean param0, ff param1, int param2) {
        uf var5 = null;
        int var4 = 0;
        try {
            var5 = we.field_b;
            var5.f(param2, -4);
            var5.field_n = var5.field_n + 1;
            var4 = var5.field_n;
            var5.a(true, 1);
            var5.a(param0, param1.field_q);
            var5.b(17, param1.field_r);
            var5.a(param1.field_p, false);
            var5.a(param1.field_n, false);
            var5.a(param1.field_s, false);
            var5.a(param1.field_t, false);
            var5.a((byte) -15, var4);
            var5.b(var5.field_n + -var4, true);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "mc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static void a(ve param0, boolean param1, int param2, byte param3) {
        qd dupTemp$0 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        qd stackIn_36_0 = null;
        qd stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        qd stackIn_43_0 = null;
        qd stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_75_0 = 0;
        qd stackIn_92_0 = null;
        boolean stackIn_92_1 = false;
        qd stackIn_93_0 = null;
        boolean stackIn_93_1 = false;
        int stackIn_93_2 = 0;
        qd stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        int stackIn_98_1 = 0;
        qd stackIn_101_0 = null;
        qd stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        qd stackIn_106_0 = null;
        qd stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_113_0 = 0;
        qd stackIn_128_0 = null;
        qd stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        qd stackIn_132_0 = null;
        qd stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        qd stackIn_136_0 = null;
        qd stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        qd stackIn_140_0 = null;
        qd stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        String stackIn_155_0 = null;
        qd stackIn_160_0 = null;
        qd stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        qd stackIn_163_0 = null;
        qd stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        int stackIn_170_0 = 0;
        int stackIn_217_0 = 0;
        int stackIn_230_0 = 0;
        qd stackIn_329_0 = null;
        boolean stackIn_329_1 = false;
        qd stackIn_330_0 = null;
        boolean stackIn_330_1 = false;
        int stackIn_330_2 = 0;
        qd stackIn_332_0 = null;
        int stackIn_332_1 = 0;
        int stackIn_332_2 = 0;
        int stackIn_332_3 = 0;
        int stackIn_335_1 = 0;
        qd stackIn_339_0 = null;
        qd stackIn_340_0 = null;
        int stackIn_340_1 = 0;
        qd stackIn_344_0 = null;
        qd stackIn_345_0 = null;
        int stackIn_345_1 = 0;
        RuntimeException stackIn_353_0 = null;
        StringBuilder stackIn_353_1 = null;
        RuntimeException stackIn_354_0 = null;
        StringBuilder stackIn_354_1 = null;
        String stackIn_354_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        qd[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        qd var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        int var22_int = 0;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        ve var27 = null;
        int var28 = 0;
        qd var29 = null;
        qd var30 = null;
        qd[] var31 = null;
        String var32 = null;
        String var33 = null;
        var26 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                L2: {
                  if (fj.field_h) {
                    stackIn_12_0 = 0;
                    break L2;
                  } else {
                    stackIn_12_0 = 1;
                    break L2;
                  }
                }
                var4_int = stackIn_12_0;
                break L1;
              } else {
                L3: {
                  if (ig.b(true)) {
                    if (!param0.field_lc) {
                      stackIn_8_0 = 1;
                      break L3;
                    } else {
                      stackIn_8_0 = 0;
                      break L3;
                    }
                  } else {
                    stackIn_8_0 = 0;
                    break L3;
                  }
                }
                var4_int = stackIn_8_0;
                break L1;
              }
            }
            L4: {
              L5: {
                L6: {
                  var5 = 0;
                  if (!param1) {
                    var6 = 0;
                    L7: while (true) {
                      if ((var6 ^ -1) <= -6) {
                        L8: {
                          if (qa.field_v[0][2].field_Kb) {
                            if (!ig.b(true)) {
                              sl.field_g = cm.a((byte) 82, bh.field_h, new String[]{cd.field_m.field_Vb});
                              break L8;
                            } else {
                              sl.field_g = kf.field_J;
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                        if (2 <= b.field_P.length) {
                          L9: {
                            if (param1) {
                              if (0 != (rk.field_V ^ -1)) {
                                stackIn_58_0 = 1;
                                break L9;
                              } else {
                                stackIn_58_0 = 0;
                                break L9;
                              }
                            } else {
                              stackIn_58_0 = 0;
                              break L9;
                            }
                          }
                          var6 = stackIn_58_0;
                          if (var6 != 0) {
                            var7 = rk.field_V;
                            var8_int = 0;
                            L10: while (true) {
                              if (kk.field_l.length <= var8_int) {
                                break L6;
                              } else {
                                kk.field_l[var8_int] = (byte) 0;
                                var8_int++;
                                continue L10;
                              }
                            }
                          } else {
                            break L5;
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        L11: {
                          if (var4_int == 0) {
                            break L11;
                          } else {
                            if (qa.field_v[0][var6 + 1].field_ob == 0) {
                              break L11;
                            } else {
                              if (var6 != param0.field_Wb) {
                                param0.field_Wb = var6;
                                var5 = 1;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        L12: {
                          stackIn_36_0 = qa.field_v[0][1 + var6];

                          if (var4_int == 0) {
                            stackIn_37_0 = (qd) ((Object) stackIn_36_0);
                            stackIn_37_1 = 0;
                            break L12;
                          } else {
                            stackIn_37_0 = (qd) ((Object) stackIn_36_0);
                            stackIn_37_1 = 1;
                            break L12;
                          }
                        }
                        L13: {
                          stackIn_37_0.field_Hb = stackIn_37_1 != 0;
                          if (pd.field_a) {
                            break L13;
                          } else {
                            if (3 == var6) {
                              qa.field_v[0][var6 - -1].field_Hb = false;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L14: {
                          stackIn_43_0 = qa.field_v[0][1 + var6];

                          if (param0.field_Wb != var6) {
                            stackIn_44_0 = (qd) ((Object) stackIn_43_0);
                            stackIn_44_1 = 0;
                            break L14;
                          } else {
                            stackIn_44_0 = (qd) ((Object) stackIn_43_0);
                            stackIn_44_1 = 1;
                            break L14;
                          }
                        }
                        stackIn_44_0.field_ab = stackIn_44_1 != 0;
                        var6++;
                        continue L7;
                      }
                    }
                  } else {
                    if (2 <= b.field_P.length) {
                      L15: {
                        if (param1) {
                          if (0 != (rk.field_V ^ -1)) {
                            stackIn_22_0 = 1;
                            break L15;
                          } else {
                            stackIn_22_0 = 0;
                            break L15;
                          }
                        } else {
                          stackIn_22_0 = 0;
                          break L15;
                        }
                      }
                      var6 = stackIn_22_0;
                      if (var6 != 0) {
                        var7 = rk.field_V;
                        var8_int = 0;
                        L16: while (true) {
                          if (kk.field_l.length <= var8_int) {
                            break L6;
                          } else {
                            kk.field_l[var8_int] = (byte) 0;
                            var8_int++;
                            continue L16;
                          }
                        }
                      } else {
                        break L5;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                kk.field_l[var7 / 8] = (byte)de.b((int) kk.field_l[var7 / 8], 1 << var7 % 8);
                break L5;
              }
              L17: {
                if (!param1) {
                  stackIn_67_0 = 0;
                  break L17;
                } else {
                  stackIn_67_0 = -1;
                  break L17;
                }
              }
              var7 = stackIn_67_0;
              L18: while (true) {
                if (var7 >= b.field_P.length) {
                  break L4;
                } else {
                  L19: {
                    if (var6 != 0) {
                      if (rk.field_V != var7) {
                        stackIn_75_0 = 1;
                        break L19;
                      } else {
                        stackIn_75_0 = 0;
                        break L19;
                      }
                    } else {
                      stackIn_75_0 = 0;
                      break L19;
                    }
                  }
                  L20: {
                    var8_int = stackIn_75_0;
                    if (var4_int == 0) {
                      break L20;
                    } else {
                      if (qa.field_v[1][var7 - -1].field_ob == 0) {
                        break L20;
                      } else {
                        if (param1) {
                          if (var6 != 0) {
                            break L20;
                          } else {
                            if (var7 == -1) {
                              var9 = 0;
                              L21: while (true) {
                                if (var9 >= kk.field_l.length) {
                                  break L20;
                                } else {
                                  kk.field_l[var9] = (byte) 0;
                                  var9++;
                                  continue L21;
                                }
                              }
                            } else {
                              kk.field_l[var7 / 8] = (byte)qm.b((int) kk.field_l[var7 / 8], 1 << lb.a(var7, 7));
                              break L20;
                            }
                          }
                        } else {
                          var9 = b.field_P[var7];
                          if (param0.field_mc == var9) {
                            break L20;
                          } else {
                            var5 = 1;
                            param0.field_mc = var9;
                            break L20;
                          }
                        }
                      }
                    }
                  }
                  L22: {
                    if (!param1) {
                      L23: {
                        var9 = b.field_P[var7];
                        stackIn_101_0 = qa.field_v[1][1 + var7];

                        if (param0.field_mc != var9) {
                          stackIn_102_0 = (qd) ((Object) stackIn_101_0);
                          stackIn_102_1 = 0;
                          break L23;
                        } else {
                          stackIn_102_0 = (qd) ((Object) stackIn_101_0);
                          stackIn_102_1 = 1;
                          break L23;
                        }
                      }
                      stackIn_102_0.field_ab = stackIn_102_1 != 0;
                      break L22;
                    } else {
                      if ((var7 ^ -1) != 0) {
                        stackIn_95_0 = qa.field_v[1][1 + var7];
                        stackIn_95_1 = -1;
                        stackIn_95_2 = kk.field_l[var7 / 8] & 1 << (var7 & 7);
                        stackIn_95_3 = -1;
                        L24: {


                          if (stackIn_95_1 == (stackIn_95_2 ^ stackIn_95_3)) {
                            stackIn_95_0 = (qd) ((Object) stackIn_95_0);
                            stackIn_98_1 = 0;
                            break L24;
                          } else {
                            stackIn_95_0 = (qd) ((Object) stackIn_95_0);
                            stackIn_98_1 = 1;
                            break L24;
                          }
                        }
                        stackIn_95_0.field_ab = stackIn_98_1 != 0;
                        break L22;
                      } else {
                        qa.field_v[1][1 + var7].field_ab = true;
                        var9 = 0;
                        L25: while (true) {
                          if (b.field_P.length <= var9) {
                            break L22;
                          } else {
                            L26: {
                              dupTemp$0 = qa.field_v[1][var7 + 1];
                              stackIn_92_0 = (qd) (dupTemp$0);

                              stackIn_92_1 = dupTemp$0.field_ab;

                              if (0 != (kk.field_l[var9 / 8] & 1 << (7 & var9))) {
                                stackIn_93_0 = (qd) ((Object) stackIn_92_0);
                                stackIn_93_1 = stackIn_92_1;
                                stackIn_93_2 = 0;
                                break L26;
                              } else {
                                stackIn_93_0 = (qd) ((Object) stackIn_92_0);
                                stackIn_93_1 = stackIn_92_1;
                                stackIn_93_2 = 1;
                                break L26;
                              }
                            }
                            stackIn_93_0.field_ab = stackIn_93_1 & stackIn_93_2 != 0;
                            var9++;
                            continue L25;
                          }
                        }
                      }
                    }
                  }
                  L27: {
                    L28: {
                      stackIn_106_0 = qa.field_v[1][1 + var7];

                      if (var4_int == 0) {
                        break L28;
                      } else {
                        stackIn_106_0 = (qd) ((Object) stackIn_106_0);

                        if (var8_int != 0) {
                          break L28;
                        } else {
                          stackIn_107_0 = (qd) ((Object) stackIn_106_0);
                          stackIn_107_1 = 1;
                          break L27;
                        }
                      }
                    }
                    stackIn_107_0 = (qd) ((Object) stackIn_106_0);
                    stackIn_107_1 = 0;
                    break L27;
                  }
                  stackIn_107_0.field_Hb = stackIn_107_1 != 0;
                  var7++;
                  continue L18;
                }
              }
            }
            L29: {
              if (param3 < -121) {
                break L29;
              } else {
                var27 = (ve) null;
                mc.a((ve) null, false, -56, (byte) 50);
                break L29;
              }
            }
            L30: {
              if (!param1) {
                stackIn_113_0 = 1;
                break L30;
              } else {
                stackIn_113_0 = 0;
                break L30;
              }
            }
            var6 = stackIn_113_0;
            L31: while (true) {
              if (var6 >= 3) {
                L32: {
                  if (!param1) {
                    break L32;
                  } else {
                    if (1 >= mg.field_Vb) {
                      break L32;
                    } else {
                      var6 = 0;
                      L33: while (true) {
                        if (var6 >= mg.field_Vb - -1) {
                          break L32;
                        } else {
                          L34: {
                            var30 = qa.field_v[3][var6];
                            if (var4_int == 0) {
                              break L34;
                            } else {
                              if (var30.field_ob == 0) {
                                break L34;
                              } else {
                                qa.field_x = var6;
                                break L34;
                              }
                            }
                          }
                          L35: {
                            if (!var30.field_Kb) {
                              break L35;
                            } else {
                              if (0 < var6) {
                                L36: {
                                  if (null == jj.field_a) {
                                    stackIn_155_0 = null;
                                    break L36;
                                  } else {
                                    stackIn_155_0 = jj.field_a[-1 + var6];
                                    break L36;
                                  }
                                }
                                var8 = stackIn_155_0;
                                if (var8 != null) {
                                  sl.field_g = var8;
                                  break L35;
                                } else {
                                  break L35;
                                }
                              } else {
                                break L35;
                              }
                            }
                          }
                          L37: {
                            stackIn_160_0 = (qd) (var30);

                            if (qa.field_x != var6) {
                              stackIn_161_0 = (qd) ((Object) stackIn_160_0);
                              stackIn_161_1 = 0;
                              break L37;
                            } else {
                              stackIn_161_0 = (qd) ((Object) stackIn_160_0);
                              stackIn_161_1 = 1;
                              break L37;
                            }
                          }
                          L38: {
                            stackIn_161_0.field_ab = stackIn_161_1 != 0;
                            stackIn_163_0 = (qd) (var30);

                            if (var4_int == 0) {
                              stackIn_164_0 = (qd) ((Object) stackIn_163_0);
                              stackIn_164_1 = 0;
                              break L38;
                            } else {
                              stackIn_164_0 = (qd) ((Object) stackIn_163_0);
                              stackIn_164_1 = 1;
                              break L38;
                            }
                          }
                          stackIn_164_0.field_Hb = stackIn_164_1 != 0;
                          var6++;
                          continue L33;
                        }
                      }
                    }
                  }
                }
                var6 = 0;
                var7 = 0;
                L39: while (true) {
                  if (j.field_b <= var7) {
                    L40: {
                      L41: {
                        if (var5 == 0) {
                          break L41;
                        } else {
                          if (param1) {
                            break L41;
                          } else {
                            qa.a(param2, 1850462342);
                            break L40;
                          }
                        }
                      }
                      break L40;
                    }
                    break L0;
                  } else {
                    L42: {
                      var31 = qa.field_v[4 - -var7];
                      var8_array = var31;
                      if (!param1) {
                        stackIn_170_0 = 0;
                        break L42;
                      } else {
                        stackIn_170_0 = -1;
                        break L42;
                      }
                    }
                    var9 = stackIn_170_0;
                    L43: while (true) {
                      if (var9 >= -1 + var31.length) {
                        var6 = var6 + (255 & rb.field_k[var7]);
                        var7++;
                        continue L39;
                      } else {
                        L44: {
                          var10 = 0;
                          var11 = 0;
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          if (var4_int == 0) {
                            break L44;
                          } else {
                            if (0 <= var9) {
                              L45: {
                                if (af.field_b == null) {
                                  break L45;
                                } else {
                                  if (null != af.field_b[var7]) {
                                    if (0 >= (af.field_b[var7][var9] & (uc.field_d ^ -1))) {
                                      break L45;
                                    } else {
                                      var15 = wb.b((byte) -93, (uc.field_d ^ -1) & af.field_b[var7][var9]);
                                      var14 = 1;
                                      break L45;
                                    }
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                              L46: {
                                if (null == cb.field_e) {
                                  break L46;
                                } else {
                                  if (null != cb.field_e[var7]) {
                                    if (0 < eh.field_a) {
                                      break L46;
                                    } else {
                                      if (!cb.field_e[var7][var9]) {
                                        break L46;
                                      } else {
                                        var10 = 1;
                                        break L46;
                                      }
                                    }
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              L47: {
                                if (mg.field_Ob == null) {
                                  break L47;
                                } else {
                                  if (mg.field_Ob[var7] != null) {
                                    L48: {
                                      var16 = mg.field_Ob[var7][var9];
                                      if (var16 <= 0) {
                                        break L48;
                                      } else {
                                        if (var16 > de.field_R) {
                                          var12 = 1;
                                          break L48;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                    if (-1 == (var16 ^ -1)) {
                                      break L47;
                                    } else {
                                      if (uc.field_a) {
                                        break L47;
                                      } else {
                                        if (-1 > (eh.field_a ^ -1)) {
                                          break L47;
                                        } else {
                                          var10 = 1;
                                          break L47;
                                        }
                                      }
                                    }
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                              L49: {
                                if (null == ik.field_h) {
                                  break L49;
                                } else {
                                  if (ik.field_h[var7] == null) {
                                    break L49;
                                  } else {
                                    L50: {
                                      var16 = ik.field_h[var7][var9];
                                      if (0 == var16) {
                                        break L50;
                                      } else {
                                        if (uc.field_a) {
                                          break L50;
                                        } else {
                                          if (0 < eh.field_a) {
                                            break L50;
                                          } else {
                                            var10 = 1;
                                            break L50;
                                          }
                                        }
                                      }
                                    }
                                    if ((var16 ^ -1) >= -1) {
                                      break L49;
                                    } else {
                                      if (var16 > rf.field_o) {
                                        var11 = 1;
                                        break L49;
                                      } else {
                                        break L49;
                                      }
                                    }
                                  }
                                }
                              }
                              L51: {
                                if (param1) {
                                  if (null != eh.field_h) {
                                    if (eh.field_h[var7] != null) {
                                      if (eh.field_h[var7][var9]) {
                                        stackIn_217_0 = 1;
                                        break L51;
                                      } else {
                                        stackIn_217_0 = 0;
                                        break L51;
                                      }
                                    } else {
                                      stackIn_217_0 = 0;
                                      break L51;
                                    }
                                  } else {
                                    stackIn_217_0 = 0;
                                    break L51;
                                  }
                                } else {
                                  stackIn_217_0 = 0;
                                  break L51;
                                }
                              }
                              var13 = stackIn_217_0;
                              break L44;
                            } else {
                              break L44;
                            }
                          }
                        }
                        L52: {
                          if (te.field_p < 2) {
                            break L52;
                          } else {
                            if (bj.field_d[12]) {
                              var13 = 0;
                              var11 = 0;
                              var12 = 0;
                              var14 = 0;
                              var10 = 0;
                              break L52;
                            } else {
                              break L52;
                            }
                          }
                        }
                        L53: {
                          L54: {
                            if (var10 != 0) {
                              break L54;
                            } else {
                              if (var11 != 0) {
                                break L54;
                              } else {
                                if (var12 != 0) {
                                  break L54;
                                } else {
                                  if (var13 != 0) {
                                    break L54;
                                  } else {
                                    if (var14 == 0) {
                                      stackIn_230_0 = 0;
                                      break L53;
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackIn_230_0 = 1;
                          break L53;
                        }
                        L55: {
                          var16 = stackIn_230_0;
                          ve.field_ac = true;
                          if (var16 != 0) {
                            break L55;
                          } else {
                            if (var9 < 0) {
                              break L55;
                            } else {
                              if (bc.field_D == null) {
                                break L55;
                              } else {
                                L56: {
                                  if (!param1) {
                                    break L56;
                                  } else {
                                    if (fj.field_h) {
                                      break L55;
                                    } else {
                                      break L56;
                                    }
                                  }
                                }
                                L57: {
                                  if (null != km.field_D) {
                                    break L57;
                                  } else {
                                    rd.field_c = new boolean[j.field_b];
                                    km.field_D = new byte[j.field_b];
                                    break L57;
                                  }
                                }
                                gd.field_b = false;
                                ve.field_ac = false;
                                var17_int = 0;
                                L58: while (true) {
                                  if (var7 <= var17_int) {
                                    L59: {
                                      uc.a(-1, param1, -1, 0, var9, var7, param0, false);
                                      if (2 > te.field_p) {
                                        break L59;
                                      } else {
                                        if (bj.field_d[12]) {
                                          ve.field_ac = true;
                                          break L59;
                                        } else {
                                          break L59;
                                        }
                                      }
                                    }
                                    if (ve.field_ac) {
                                      break L55;
                                    } else {
                                      var16 = 1;
                                      break L55;
                                    }
                                  } else {
                                    rd.field_c[var17_int] = false;
                                    var17_int++;
                                    continue L58;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L60: {
                          var17 = var8_array[1 + var9];
                          if (var4_int == 0) {
                            break L60;
                          } else {
                            if (var17.field_ob != 0) {
                              if (!param1) {
                                if (var16 != 0) {
                                  break L60;
                                } else {
                                  if ((byte)var9 == param0.field_kc[var7]) {
                                    break L60;
                                  } else {
                                    param0.field_kc[var7] = (byte)var9;
                                    var5 = 1;
                                    break L60;
                                  }
                                }
                              } else {
                                if (var9 == -1) {
                                  var18 = var6;
                                  L61: while (true) {
                                    if (var18 >= var31.length + var6 - 1) {
                                      break L60;
                                    } else {
                                      v.field_a[var18 / 8] = (byte)lb.a((int) v.field_a[var18 / 8], 1 << lb.a(var18, 7) ^ -1);
                                      var18++;
                                      continue L61;
                                    }
                                  }
                                } else {
                                  v.field_a[(var6 + var9) / 8] = (byte)qm.b((int) v.field_a[(var6 + var9) / 8], 1 << lb.a(var9 + var6, 7));
                                  break L60;
                                }
                              }
                            } else {
                              break L60;
                            }
                          }
                        }
                        L62: {
                          if (!param1) {
                            break L62;
                          } else {
                            if (var16 == 0) {
                              break L62;
                            } else {
                              v.field_a[(var6 + var9) / 8] = (byte)lb.a((int) v.field_a[(var6 + var9) / 8], 1 << lb.a(var9 + var6, 7) ^ -1);
                              break L62;
                            }
                          }
                        }
                        L63: {
                          if ((var9 ^ -1) > -1) {
                            break L63;
                          } else {
                            if (var17.field_Kb) {
                              L64: {
                                if (gn.field_c != null) {
                                  if (gn.field_c[var7] != null) {
                                    var18_ref = gn.field_c[var7][var9];
                                    break L64;
                                  } else {
                                    var18_ref = null;
                                    break L64;
                                  }
                                } else {
                                  var18_ref = null;
                                  break L64;
                                }
                              }
                              L65: {
                                if (hb.field_Qb == null) {
                                  var19 = null;
                                  break L65;
                                } else {
                                  if (null == hb.field_Qb[var7]) {
                                    var19 = null;
                                    break L65;
                                  } else {
                                    var19 = hb.field_Qb[var7][var9];
                                    break L65;
                                  }
                                }
                              }
                              L66: {
                                var20 = null;
                                if (var19 == null) {
                                  break L66;
                                } else {
                                  if (((String) (var19)).equals(var18_ref)) {
                                    break L66;
                                  } else {
                                    var20 = var19;
                                    break L66;
                                  }
                                }
                              }
                              L67: {
                                var21 = null;
                                if (var13 != 0) {
                                  var21 = gd.field_d;
                                  var22 = var21;
                                  var25 = var22;
                                  var22 = var25;
                                  var21 = var22;
                                  var25 = var21;
                                  var22 = var25;
                                  var25 = var22;
                                  var22 = var25;
                                  var21 = var22;
                                  var22 = var25;
                                  break L67;
                                } else {
                                  if (var10 != 0) {
                                    var21 = pj.field_F;
                                    break L67;
                                  } else {
                                    L68: {
                                      if (var11 != 0) {
                                        var22_int = -rf.field_o + ik.field_h[var7][var9];
                                        if (var22_int != 1) {
                                          var21 = cm.a((byte) 81, eb.field_g, new String[]{Integer.toString(var22_int)});
                                          break L68;
                                        } else {
                                          var21 = pl.field_f;
                                          break L68;
                                        }
                                      } else {
                                        break L68;
                                      }
                                    }
                                    L69: {
                                      if (var12 != 0) {
                                        var32 = cm.a((byte) 110, wl.field_q, new String[]{Integer.toString(de.field_R), Integer.toString(mg.field_Ob[var7][var9])});
                                        var22 = var32;
                                        var25 = var22;
                                        var22 = var25;
                                        var21 = var22;
                                        var25_ref = var32;
                                        var22 = var25_ref;
                                        if (var21 != null) {
                                          var21 = (String) (var21) + "<br>" + var32;
                                          break L69;
                                        } else {
                                          var21 = var32;
                                          break L69;
                                        }
                                      } else {
                                        break L69;
                                      }
                                    }
                                    if (var14 != 0) {
                                      L70: {
                                        var22 = ig.field_Sb;
                                        if (0 >= var15) {
                                          break L70;
                                        } else {
                                          if (lc.field_e == null) {
                                            break L70;
                                          } else {
                                            if (var15 > lc.field_e.length) {
                                              break L70;
                                            } else {
                                              if (lc.field_e[var15 - 1] == null) {
                                                break L70;
                                              } else {
                                                var22 = lc.field_e[var15 + -1][0];
                                                break L70;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var21 != null) {
                                        var21 = (String) (var21) + "<br>" + (String) (var22);
                                        break L67;
                                      } else {
                                        var21 = var22;
                                        break L67;
                                      }
                                    } else {
                                      break L67;
                                    }
                                  }
                                }
                              }
                              L71: {
                                if (var4_int == 0) {
                                  break L71;
                                } else {
                                  if (ve.field_ac) {
                                    break L71;
                                  } else {
                                    L72: {
                                      var22 = null;
                                      var23 = 0;
                                      if (!gd.field_b) {
                                        break L72;
                                      } else {
                                        var22 = "</col>" + hb.field_Pb + "<col=A00000>";
                                        var25 = var22;
                                        var22 = var25;
                                        var25 = var22;
                                        var22 = var25;
                                        var21 = var22;
                                        break L72;
                                      }
                                    }
                                    var24 = 0;
                                    L73: while (true) {
                                      if (var7 <= var24) {
                                        if (var23 == 0) {
                                          var21 = cm.a((byte) 115, ai.field_T, new String[]{(String) (var22)});
                                          break L71;
                                        } else {
                                          var21 = tl.field_x + (String) (var22);
                                          break L71;
                                        }
                                      } else {
                                        L74: {
                                          if (rd.field_c[var24]) {
                                            var25_ref = "</col>" + pa.field_db[var24] + "<col=A00000>";
                                            var22 = var25_ref;
                                            var21 = var22;
                                            var22 = var25_ref;
                                            if (var22 != null) {
                                              var22 = (String) (var22) + ", " + var25_ref;
                                              var21 = var22;
                                              var21 = var22;
                                              var23 = 1;
                                              break L74;
                                            } else {
                                              var22 = var25_ref;
                                              break L74;
                                            }
                                          } else {
                                            break L74;
                                          }
                                        }
                                        var24++;
                                        continue L73;
                                      }
                                    }
                                  }
                                }
                              }
                              L75: {
                                if (var21 == null) {
                                  break L75;
                                } else {
                                  var21 = "<col=A00000>" + (String) (var21);
                                  var33 = j.a("<br>", (String) (var21), "<br><col=A00000>", 0);
                                  if (var20 != null) {
                                    var20 = (String) (var20) + "<br>" + var33;
                                    break L75;
                                  } else {
                                    var20 = var33;
                                    break L75;
                                  }
                                }
                              }
                              if (var20 == null) {
                                break L63;
                              } else {
                                sl.field_g = (String) (var20);
                                break L63;
                              }
                            } else {
                              break L63;
                            }
                          }
                        }
                        L76: {
                          if (!param1) {
                            L77: {
                              L78: {
                                stackIn_339_0 = (qd) (var17);

                                if (!ve.field_ac) {
                                  break L78;
                                } else {
                                  stackIn_339_0 = (qd) ((Object) stackIn_339_0);

                                  if ((byte)var9 != param0.field_kc[var7]) {
                                    break L78;
                                  } else {
                                    stackIn_340_0 = (qd) ((Object) stackIn_339_0);
                                    stackIn_340_1 = 1;
                                    break L77;
                                  }
                                }
                              }
                              stackIn_340_0 = (qd) ((Object) stackIn_339_0);
                              stackIn_340_1 = 0;
                              break L77;
                            }
                            stackIn_340_0.field_ab = stackIn_340_1 != 0;
                            break L76;
                          } else {
                            if (0 != (var9 ^ -1)) {
                              stackIn_332_0 = (qd) (var17);
                              stackIn_332_1 = -1;
                              stackIn_332_2 = v.field_a[(var9 + var6) / 8] & 1 << (var6 - -var9 & 7);
                              stackIn_332_3 = -1;
                              L79: {


                                if (stackIn_332_1 == (stackIn_332_2 ^ stackIn_332_3)) {
                                  stackIn_332_0 = (qd) ((Object) stackIn_332_0);
                                  stackIn_335_1 = 0;
                                  break L79;
                                } else {
                                  stackIn_332_0 = (qd) ((Object) stackIn_332_0);
                                  stackIn_335_1 = 1;
                                  break L79;
                                }
                              }
                              stackIn_332_0.field_ab = stackIn_335_1 != 0;
                              break L76;
                            } else {
                              var17.field_ab = true;
                              var28 = var6;
                              var18 = var28;
                              L80: while (true) {
                                if (var28 >= -1 + (var31.length + var6)) {
                                  break L76;
                                } else {
                                  L81: {
                                    stackIn_329_0 = (qd) (var17);

                                    stackIn_329_1 = var17.field_ab;

                                    if (0 != (v.field_a[var28 / 8] & 1 << (var28 & 7))) {
                                      stackIn_330_0 = (qd) ((Object) stackIn_329_0);
                                      stackIn_330_1 = stackIn_329_1;
                                      stackIn_330_2 = 0;
                                      break L81;
                                    } else {
                                      stackIn_330_0 = (qd) ((Object) stackIn_329_0);
                                      stackIn_330_1 = stackIn_329_1;
                                      stackIn_330_2 = 1;
                                      break L81;
                                    }
                                  }
                                  stackIn_330_0.field_ab = stackIn_330_1 & stackIn_330_2 != 0;
                                  var28++;
                                  continue L80;
                                }
                              }
                            }
                          }
                        }
                        L82: {
                          L83: {
                            stackIn_344_0 = (qd) (var17);

                            if (var4_int == 0) {
                              break L83;
                            } else {
                              stackIn_344_0 = (qd) ((Object) stackIn_344_0);

                              if (var16 != 0) {
                                break L83;
                              } else {
                                stackIn_345_0 = (qd) ((Object) stackIn_344_0);
                                stackIn_345_1 = 1;
                                break L82;
                              }
                            }
                          }
                          stackIn_345_0 = (qd) ((Object) stackIn_344_0);
                          stackIn_345_1 = 0;
                          break L82;
                        }
                        stackIn_345_0.field_Hb = stackIn_345_1 != 0;
                        var9++;
                        continue L43;
                      }
                    }
                  }
                }
              } else {
                L84: {
                  var29 = qa.field_v[2][var6];
                  if (var4_int == 0) {
                    break L84;
                  } else {
                    if (var29.field_ob != 0) {
                      if (!param1) {
                        if (var6 == param0.field_qc) {
                          break L84;
                        } else {
                          var5 = 1;
                          param0.field_qc = var6;
                          break L84;
                        }
                      } else {
                        if (var6 != 0) {
                          jb.field_c = jb.field_c ^ var6;
                          break L84;
                        } else {
                          jb.field_c = 0;
                          break L84;
                        }
                      }
                    } else {
                      break L84;
                    }
                  }
                }
                L85: {
                  if (!param1) {
                    L86: {
                      stackIn_136_0 = (qd) (var29);

                      if (-1 == (var6 & param0.field_qc ^ -1)) {
                        stackIn_137_0 = (qd) ((Object) stackIn_136_0);
                        stackIn_137_1 = 0;
                        break L86;
                      } else {
                        stackIn_137_0 = (qd) ((Object) stackIn_136_0);
                        stackIn_137_1 = 1;
                        break L86;
                      }
                    }
                    stackIn_137_0.field_ab = stackIn_137_1 != 0;
                    break L85;
                  } else {
                    if (var6 == 0) {
                      L87: {
                        stackIn_132_0 = (qd) (var29);

                        if (-1 != (jb.field_c ^ -1)) {
                          stackIn_133_0 = (qd) ((Object) stackIn_132_0);
                          stackIn_133_1 = 0;
                          break L87;
                        } else {
                          stackIn_133_0 = (qd) ((Object) stackIn_132_0);
                          stackIn_133_1 = 1;
                          break L87;
                        }
                      }
                      stackIn_133_0.field_ab = stackIn_133_1 != 0;
                      break L85;
                    } else {
                      L88: {
                        stackIn_128_0 = (qd) (var29);

                        if (0 == (var6 & jb.field_c)) {
                          stackIn_129_0 = (qd) ((Object) stackIn_128_0);
                          stackIn_129_1 = 0;
                          break L88;
                        } else {
                          stackIn_129_0 = (qd) ((Object) stackIn_128_0);
                          stackIn_129_1 = 1;
                          break L88;
                        }
                      }
                      stackIn_129_0.field_ab = stackIn_129_1 != 0;
                      break L85;
                    }
                  }
                }
                L89: {
                  stackIn_140_0 = (qd) (var29);

                  if (var4_int == 0) {
                    stackIn_141_0 = (qd) ((Object) stackIn_140_0);
                    stackIn_141_1 = 0;
                    break L89;
                  } else {
                    stackIn_141_0 = (qd) ((Object) stackIn_140_0);
                    stackIn_141_1 = 1;
                    break L89;
                  }
                }
                stackIn_141_0.field_Hb = stackIn_141_1 != 0;
                var6++;
                continue L31;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L90: {
            var4 = decompiledCaughtException;
            stackIn_353_0 = (RuntimeException) (var4);

            stackIn_353_1 = new StringBuilder().append("mc.C(");

            if (param0 == null) {
              stackIn_354_0 = (RuntimeException) ((Object) stackIn_353_0);
              stackIn_354_1 = (StringBuilder) ((Object) stackIn_353_1);
              stackIn_354_2 = "null";
              break L90;
            } else {
              stackIn_354_0 = (RuntimeException) ((Object) stackIn_353_0);
              stackIn_354_1 = (StringBuilder) ((Object) stackIn_353_1);
              stackIn_354_2 = "{...}";
              break L90;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_354_0), stackIn_354_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ve var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.charAt(0);
              var3 = 1;
              if (param1 < -99) {
                break L1;
              } else {
                var5 = (ve) null;
                mc.a((ve) null, false, -98, (byte) -9);
                break L1;
              }
            }
            L2: while (true) {
              if (param0.length() <= var3) {
                stackIn_9_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(var3) == var2_int) {
                  var3++;
                  continue L2;
                } else {
                  stackIn_6_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("mc.A(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    static {
        field_b = new int[]{2053254, 7976409, 15906096, 11781092, 41672};
        field_f = 5;
        field_d = "Off";
        field_c = "Start Game";
    }
}
