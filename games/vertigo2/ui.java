/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    short field_f;
    static cr field_b;
    boolean field_c;
    boolean field_a;
    static int field_g;
    boolean field_i;
    int field_h;
    static lg field_e;
    static int field_d;

    final static er[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        er[] var10 = null;
        er[] var11_ref_er__ = null;
        int var11 = 0;
        int var12 = 0;
        er var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        er[] stackIn_64_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_52_0 = 0;
        er[] stackOut_63_0 = null;
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var9_int = param0 - -param1 - -param5;
            var10 = new er[]{new er(var9_int, var9_int), new er(param8, var9_int), new er(var9_int, var9_int), new er(var9_int, param8), new er(64, 64), new er(var9_int, param8), new er(var9_int, var9_int), new er(param8, var9_int), new er(var9_int, var9_int)};
            var11_ref_er__ = var10;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var12 ^ -1) <= (var11_ref_er__.length ^ -1)) {
                    break L3;
                  } else {
                    var13 = var11_ref_er__[var12];
                    stackOut_3_0 = 0;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      var14 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var14 >= var13.field_F.length) {
                              break L6;
                            } else {
                              var13.field_F[var14] = param7;
                              var14++;
                              if (var15 != 0) {
                                break L5;
                              } else {
                                if (var15 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var12++;
                          break L5;
                        }
                        if (var15 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_12_0 = param6;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              L7: {
                if (stackIn_13_0 == 5) {
                  break L7;
                } else {
                  field_d = 37;
                  break L7;
                }
              }
              var11 = 0;
              L8: while (true) {
                L9: {
                  L10: {
                    if ((var11 ^ -1) <= (param0 ^ -1)) {
                      break L10;
                    } else {
                      stackOut_18_0 = 0;
                      stackIn_28_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (var15 != 0) {
                        break L9;
                      } else {
                        var12 = stackIn_19_0;
                        L11: while (true) {
                          L12: {
                            L13: {
                              if ((var9_int ^ -1) >= (var12 ^ -1)) {
                                break L13;
                              } else {
                                var10[6].field_F[var12 + (-1 + (var9_int - var11)) * var9_int] = param2;
                                var10[8].field_F[var12 + (-1 + -var11 + var9_int) * var9_int] = param2;
                                var10[2].field_F[-1 - -var9_int + (-var11 + var9_int * var12)] = param2;
                                var10[8].field_F[-var11 - -var9_int + -1 + var9_int * var12] = param2;
                                var12++;
                                if (var15 != 0) {
                                  break L12;
                                } else {
                                  if (var15 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            var11++;
                            break L12;
                          }
                          if (var15 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  break L9;
                }
                var11 = stackIn_28_0;
                L14: while (true) {
                  stackOut_29_0 = param0;
                  stackOut_29_1 = var11;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  L15: while (true) {
                    L16: {
                      L17: {
                        if (stackIn_30_0 <= stackIn_30_1) {
                          break L17;
                        } else {
                          stackOut_31_0 = 0;
                          stackIn_41_0 = stackOut_31_0;
                          stackIn_32_0 = stackOut_31_0;
                          if (var15 != 0) {
                            break L16;
                          } else {
                            var12 = stackIn_32_0;
                            L18: while (true) {
                              L19: {
                                if (var12 >= var9_int) {
                                  break L19;
                                } else {
                                  var10[0].field_F[var12 + var9_int * var11] = param4;
                                  var10[0].field_F[var9_int * var12 + var11] = param4;
                                  stackOut_34_0 = var9_int + -var11;
                                  stackOut_34_1 = var12;
                                  stackIn_30_0 = stackOut_34_0;
                                  stackIn_30_1 = stackOut_34_1;
                                  stackIn_35_0 = stackOut_34_0;
                                  stackIn_35_1 = stackOut_34_1;
                                  if (var15 != 0) {
                                    continue L15;
                                  } else {
                                    L20: {
                                      if (stackIn_35_0 <= stackIn_35_1) {
                                        break L20;
                                      } else {
                                        var10[2].field_F[var11 * var9_int + var12] = param4;
                                        var10[6].field_F[var9_int * var12 + var11] = param4;
                                        break L20;
                                      }
                                    }
                                    var12++;
                                    if (var15 == 0) {
                                      continue L18;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              var11++;
                              if (var15 == 0) {
                                continue L14;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      stackOut_40_0 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      break L16;
                    }
                    var11 = stackIn_41_0;
                    L21: while (true) {
                      L22: {
                        L23: {
                          if ((param8 ^ -1) >= (var11 ^ -1)) {
                            break L23;
                          } else {
                            stackOut_43_0 = 0;
                            stackIn_53_0 = stackOut_43_0;
                            stackIn_44_0 = stackOut_43_0;
                            if (var15 != 0) {
                              break L22;
                            } else {
                              var12 = stackIn_44_0;
                              L24: while (true) {
                                L25: {
                                  L26: {
                                    if ((param0 ^ -1) >= (var12 ^ -1)) {
                                      break L26;
                                    } else {
                                      var10[7].field_F[var11 + (-var12 + (var9_int + -1)) * param8] = param2;
                                      var10[5].field_F[-var12 + (-1 + (var9_int + var11 * var9_int))] = param2;
                                      var10[1].field_F[var11 + param8 * var12] = param4;
                                      var10[3].field_F[var12 + var11 * var9_int] = param4;
                                      var12++;
                                      if (var15 != 0) {
                                        break L25;
                                      } else {
                                        if (var15 == 0) {
                                          continue L24;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  break L25;
                                }
                                if (var15 == 0) {
                                  continue L21;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                        }
                        stackOut_52_0 = 0;
                        stackIn_53_0 = stackOut_52_0;
                        break L22;
                      }
                      var11 = stackIn_53_0;
                      L27: while (true) {
                        L28: {
                          if (param8 >> -351733375 <= var11) {
                            break L28;
                          } else {
                            var12 = 0;
                            L29: while (true) {
                              L30: {
                                L31: {
                                  if (param5 <= var12) {
                                    break L31;
                                  } else {
                                    var10[1].field_F[param8 * (-1 + -var12 + var9_int) + var11] = param3;
                                    var10[3].field_F[-1 + (var9_int - (var12 - var11 * var9_int))] = param3;
                                    var10[7].field_F[var11 + var12 * param8] = param3;
                                    var10[5].field_F[var12 + var11 * var9_int] = param3;
                                    var12++;
                                    if (var15 != 0) {
                                      break L30;
                                    } else {
                                      if (var15 == 0) {
                                        continue L29;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                                var11++;
                                break L30;
                              }
                              if (var15 == 0) {
                                continue L27;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                        stackOut_63_0 = (er[]) (var10);
                        stackIn_64_0 = stackOut_63_0;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var9), "ui.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_64_0;
    }

    final static boolean c(int param0) {
        er[] discarded$2 = null;
        RuntimeException var1 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 <= -100) {
                break L1;
              } else {
                discarded$2 = ui.a(-32, -26, -60, -33, 84, -75, 106, 100, 13);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == t.field_m) {
                  break L3;
                } else {
                  if (!t.field_m.a(false)) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "ui.E(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    public static void a(int param0) {
        if (param0 != 64) {
            return;
        }
        try {
            field_e = null;
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ui.C(" + param0 + ')');
        }
    }

    final static void a(long param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        mi var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = uh.field_Wb;
              var4.j(param1, 124);
              var4.field_u = var4.field_u + 1;
              var5 = var4.field_u;
              var4.f(6, 88);
              if (param2 >= 85) {
                break L1;
              } else {
                field_b = (cr) null;
                break L1;
              }
            }
            var4.a((byte) -117, param0);
            var4.b((byte) 117, var4.field_u - var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) runtimeException), "ui.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String b(int param0) {
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String stackIn_59_0 = null;
        Object stackIn_105_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_58_0 = null;
        String stackOut_56_0 = null;
        Object stackOut_104_0 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = null;
              var2 = null;
              if (field_g != 0) {
                break L1;
              } else {
                if (null != sj.field_d) {
                  var2 = w.field_E;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (2 != field_g) {
                break L2;
              } else {
                if (dh.a((byte) 127)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (c.a(sm.field_Kb, (byte) -125)) {
                        break L4;
                      } else {
                        var2 = Vertigo2.a(new String[]{ea.field_b}, bj.field_b, param0 ^ 410);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2 = Vertigo2.a(new String[]{ea.field_b}, qo.field_E, 91);
                    break L3;
                  }
                  if (!pm.field_a) {
                    break L2;
                  } else {
                    dh.a((byte) -114, (String) (var2), 2, (String) null, 0, (String) null);
                    on.a(9110);
                    break L2;
                  }
                }
              }
            }
            L5: {
              if (null != var2) {
                break L5;
              } else {
                if (nb.field_z) {
                  break L5;
                } else {
                  if (null != gk.field_c) {
                    break L5;
                  } else {
                    var2 = na.field_l;
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (param0 == -485) {
                break L6;
              } else {
                field_b = (cr) null;
                break L6;
              }
            }
            L7: {
              if (null != var2) {
                ir.a((String) null, lj.field_p, (String) (var2), 0, 0);
                break L7;
              } else {
                L8: {
                  var3 = qe.field_V;
                  var3 = jk.a(15709, var3);
                  var4 = "";
                  var5 = "|";
                  var6 = field_g;
                  var7 = 0;
                  if (var6 == 2) {
                    var4 = Vertigo2.a(new String[]{ea.field_b}, di.field_B, -114);
                    var8 = Vertigo2.a(new String[]{var3}, af.field_L, -128);
                    var7 = -485 + (dj.field_d.field_Fb - -field_b.field_Fb) - (-cg.field_f.c(var8) + cg.field_f.c(var4));
                    if ((var7 ^ -1) > -1) {
                      var7 = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    L9: {
                      if (0 != var6) {
                        break L9;
                      } else {
                        L10: {
                          if (gd.field_j != null) {
                            break L10;
                          } else {
                            if (fq.field_i) {
                              var4 = "[" + fb.field_A + "] ";
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (gd.field_j != null) {
                          L11: {
                            L12: {
                              if (!ar.field_t) {
                                break L12;
                              } else {
                                if (null == v.field_a) {
                                  break L12;
                                } else {
                                  var4 = "[" + v.field_a + "] ";
                                  if (var10 == 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            var4 = "[" + Vertigo2.a(new String[]{gd.field_j.field_Nb}, ie.field_Rb, param0 ^ 411) + "] ";
                            break L11;
                          }
                          var6 = 1;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L13: {
                      if (tb.a((byte) 118)) {
                        stackOut_58_0 = ": ";
                        stackIn_59_0 = stackOut_58_0;
                        break L13;
                      } else {
                        stackOut_56_0 = "<img=3>: ";
                        stackIn_59_0 = stackOut_56_0;
                        break L13;
                      }
                    }
                    L14: {
                      L15: {
                        var8 = stackIn_59_0;
                        var4 = var4 + var3 + var8;
                        if (pe.field_r) {
                          break L15;
                        } else {
                          if (hj.field_b) {
                            var4 = "<col=999999>" + var4 + pb.field_c + "</col>";
                            var5 = "";
                            if (var10 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          } else {
                            break L14;
                          }
                        }
                      }
                      var5 = "";
                      var4 = "<col=999999>" + var4 + ah.field_k + "</col>";
                      break L14;
                    }
                    L16: {
                      var9 = cg.field_f.c(var4);
                      if (tb.a((byte) 122)) {
                        break L16;
                      } else {
                        L17: {
                          if (!dj.field_d.field_pb) {
                            break L17;
                          } else {
                            if ((var9 ^ -1) >= (-dj.field_d.field_ob + ed.field_n ^ -1)) {
                              break L17;
                            } else {
                              if (!pe.field_r) {
                                var1 = pb.field_c;
                                break L17;
                              } else {
                                var1 = "Broken!";
                                break L17;
                              }
                            }
                          }
                        }
                        if (-1 == (dj.field_d.field_tb ^ -1)) {
                          break L16;
                        } else {
                          if (dj.field_d.field_ub >= var9) {
                            break L16;
                          } else {
                            if (!pe.field_r) {
                              g.a((byte) -10);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                    break L8;
                  }
                }
                L18: {
                  ir.a(var5, gg.field_n[var6], var4 + cc.b(fb.field_D.toString()), var7, 0);
                  if (!il.field_a) {
                    field_b.field_pb = false;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (field_b.field_pb) {
                    var1 = Vertigo2.a(new String[]{var3, ea.field_b}, bd.field_g, -113);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                break L7;
              }
            }
            stackOut_104_0 = var1;
            stackIn_105_0 = stackOut_104_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (var1), "ui.A(" + param0 + ')');
        }
        return (String) ((Object) stackIn_105_0);
    }

    static {
        field_g = 0;
    }
}
