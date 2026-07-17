/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends je {
    private je field_Mb;
    private je[] field_Ib;
    static String field_Nb;
    static String field_Lb;
    int field_Kb;
    private je[] field_Jb;

    final static void a(p param0, byte param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        sn var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            wh.field_f = false;
            am.field_v = new sn[47];
            var2_int = 0;
            L1: while (true) {
              L2: {
                if (var2_int >= 47) {
                  ml.a(42, (au) null, false, (String) null);
                  wh.field_f = true;
                  break L2;
                } else {
                  var3 = param0.a(wl.field_M[var2_int], (byte) -97, "");
                  if (var4 != 0) {
                    break L2;
                  } else {
                    L3: {
                      if (var3 != null) {
                        break L3;
                      } else {
                        var3 = param0.a((byte) -128, "", wl.field_M[var2_int]);
                        break L3;
                      }
                    }
                    am.field_v[var2_int] = var3;
                    var2_int++;
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("ml.F(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + 111 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((ml) this).field_ab = param1;
        ((ml) this).field_ob = param6;
        ((ml) this).field_S = param2;
        ((ml) this).field_gb = param0;
        if (param4 != 0) {
          return;
        } else {
          this.a(param3, param5, param4 + -20199);
          return;
        }
    }

    public static void k(int param0) {
        field_Nb = null;
        field_Lb = null;
        if (param0 == 2) {
            return;
        }
        ml.a((p) null, (byte) 111);
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0;
        if (param2 != -20199) {
          boolean discarded$1 = ml.a(96, -94, -90, false);
          L0: while (true) {
            if (((ml) this).field_Ib.length <= var4) {
              ((ml) this).field_Mb.a(-param1 + ((ml) this).field_ob, -20500, ((ml) this).field_gb, param1, 0);
              var8 = 0;
              var4 = var8;
              L1: while (true) {
                if (var8 < ((ml) this).field_Jb.length) {
                  ((ml) this).field_Jb[var8].a(((ml) this).field_Mb.field_ob + -(2 * param0), -20500, -(param0 * 2) + ((ml) this).field_Mb.field_gb, param0, param0);
                  if (var7 == 0) {
                    L2: {
                      if (var8 != ((ml) this).field_Kb) {
                        ((ml) this).field_Jb[var8].field_S = ((ml) this).field_Jb[var8].field_S + 10000;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var8++;
                    continue L1;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              var5 = ((ml) this).field_gb * var4 / ((ml) this).field_Ib.length;
              var6 = ((ml) this).field_gb * (1 + var4) / ((ml) this).field_Ib.length;
              ((ml) this).field_Ib[var4].field_S = var5;
              ((ml) this).field_Ib[var4].field_ab = 0;
              ((ml) this).field_Ib[var4].field_gb = -var5 + var6;
              ((ml) this).field_Ib[var4].field_ob = param1;
              var4++;
              if (var7 == 0) {
                continue L0;
              } else {
                var8 = 0;
                var4 = var8;
                L3: while (true) {
                  if (var8 < ((ml) this).field_Jb.length) {
                    ((ml) this).field_Jb[var8].a(((ml) this).field_Mb.field_ob + -(2 * param0), -20500, -(param0 * 2) + ((ml) this).field_Mb.field_gb, param0, param0);
                    if (var7 == 0) {
                      L4: {
                        if (var8 != ((ml) this).field_Kb) {
                          ((ml) this).field_Jb[var8].field_S = ((ml) this).field_Jb[var8].field_S + 10000;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var8++;
                      continue L3;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } else {
          L5: while (true) {
            if (((ml) this).field_Ib.length <= var4) {
              ((ml) this).field_Mb.a(-param1 + ((ml) this).field_ob, -20500, ((ml) this).field_gb, param1, 0);
              var8 = 0;
              var4 = var8;
              L6: while (true) {
                if (var8 < ((ml) this).field_Jb.length) {
                  ((ml) this).field_Jb[var8].a(((ml) this).field_Mb.field_ob + -(2 * param0), -20500, -(param0 * 2) + ((ml) this).field_Mb.field_gb, param0, param0);
                  if (var7 == 0) {
                    L7: {
                      if (var8 != ((ml) this).field_Kb) {
                        ((ml) this).field_Jb[var8].field_S = ((ml) this).field_Jb[var8].field_S + 10000;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var8++;
                    continue L6;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              var5 = ((ml) this).field_gb * var4 / ((ml) this).field_Ib.length;
              var6 = ((ml) this).field_gb * (1 + var4) / ((ml) this).field_Ib.length;
              ((ml) this).field_Ib[var4].field_S = var5;
              ((ml) this).field_Ib[var4].field_ab = 0;
              ((ml) this).field_Ib[var4].field_gb = -var5 + var6;
              ((ml) this).field_Ib[var4].field_ob = param1;
              var4++;
              if (var7 != 0) {
                var8 = 0;
                var4 = var8;
                L8: while (true) {
                  if (var8 < ((ml) this).field_Jb.length) {
                    ((ml) this).field_Jb[var8].a(((ml) this).field_Mb.field_ob + -(2 * param0), -20500, -(param0 * 2) + ((ml) this).field_Mb.field_gb, param0, param0);
                    if (var7 == 0) {
                      L9: {
                        if (var8 != ((ml) this).field_Kb) {
                          ((ml) this).field_Jb[var8].field_S = ((ml) this).field_Jb[var8].field_S + 10000;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var8++;
                      continue L8;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (var7 == 0) {
                  continue L5;
                } else {
                  ((ml) this).field_Mb.a(-param1 + ((ml) this).field_ob, -20500, ((ml) this).field_gb, param1, 0);
                  var8 = 0;
                  var4 = var8;
                  L10: while (true) {
                    if (var8 < ((ml) this).field_Jb.length) {
                      ((ml) this).field_Jb[var8].a(((ml) this).field_Mb.field_ob + -(2 * param0), -20500, -(param0 * 2) + ((ml) this).field_Mb.field_gb, param0, param0);
                      if (var7 == 0) {
                        L11: {
                          if (var8 != ((ml) this).field_Kb) {
                            ((ml) this).field_Jb[var8].field_S = ((ml) this).field_Jb[var8].field_S + 10000;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var8++;
                        continue L10;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, au param1, boolean param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        tg var8 = null;
        String var9 = null;
        tg var10 = null;
        String var11 = null;
        tg var12 = null;
        String var13 = null;
        tg var14 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              ng.a(bv.field_x, (je) (Object) param1, (int[]) null, (String) null, param1.d((byte) -84), 92, -1, (String) null, 0L);
              if (!param1.field_kc) {
                break L1;
              } else {
                L2: {
                  if (2 == param1.field_ac) {
                    break L2;
                  } else {
                    if (hi.field_j >= 2) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var8 = tn.field_Z;
                var9 = fo.a(4800, bc.field_k, new String[1]);
                var8.field_i.a(10, var9, (byte) -118);
                break L1;
              }
            }
            L3: {
              tn.field_Z.a((byte) 96);
              if (!param2) {
                break L3;
              } else {
                L4: {
                  if (oo.field_a != tn.field_Z.field_c) {
                    break L4;
                  } else {
                    var10 = tn.field_Z;
                    var11 = fo.a(4800, cp.field_g, new String[1]);
                    var10.field_i.a(16, var11, (byte) -103);
                    if (!ArmiesOfGielinor.field_M) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var12 = tn.field_Z;
                var13 = fo.a(4800, fs.field_a, new String[1]);
                var12.field_i.a(15, var13, (byte) -105);
                break L3;
              }
            }
            var14 = tn.field_Z;
            var5 = iu.field_t;
            var6 = ur.field_z;
            var7 = 125 / ((22 - param0) / 38);
            var14.field_i.a(0, var6, 0, (byte) -118, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ml.G(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          L6: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 10000) {
          var2 = 0;
          L0: while (true) {
            if (((ml) this).field_Ib.length > var2) {
              if (var3 == 0) {
                L1: {
                  if (((ml) this).field_Kb == var2) {
                    break L1;
                  } else {
                    if (((ml) this).field_Ib[var2].field_yb != 0) {
                      ((ml) this).field_Ib[((ml) this).field_Kb].field_rb = false;
                      ((ml) this).field_Jb[((ml) this).field_Kb].field_S = ((ml) this).field_Jb[((ml) this).field_Kb].field_S + 10000;
                      ((ml) this).field_Kb = var2;
                      ((ml) this).field_Ib[var2].field_rb = true;
                      ((ml) this).field_Jb[var2].field_S = ((ml) this).field_Jb[var2].field_S - 10000;
                      break L1;
                    } else {
                      var2++;
                      continue L0;
                    }
                  }
                }
                var2++;
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          ml.a(10, (au) null, false, (String) null);
          var2 = 0;
          L2: while (true) {
            if (((ml) this).field_Ib.length > var2) {
              if (var3 == 0) {
                L3: {
                  if (((ml) this).field_Kb == var2) {
                    break L3;
                  } else {
                    if (((ml) this).field_Ib[var2].field_yb != 0) {
                      ((ml) this).field_Ib[((ml) this).field_Kb].field_rb = false;
                      ((ml) this).field_Jb[((ml) this).field_Kb].field_S = ((ml) this).field_Jb[((ml) this).field_Kb].field_S + 10000;
                      ((ml) this).field_Kb = var2;
                      ((ml) this).field_Ib[var2].field_rb = true;
                      ((ml) this).field_Jb[var2].field_S = ((ml) this).field_Jb[var2].field_S - 10000;
                      break L3;
                    } else {
                      var2++;
                      continue L2;
                    }
                  }
                }
                var2++;
                continue L2;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(om param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String[] var7 = null;
        String[] var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var7 = param0.e(-23209);
                var8 = var7;
                if (param0.field_G.field_s != 1) {
                  break L2;
                } else {
                  L3: {
                    if (!var8[1].equalsIgnoreCase(wf.field_q[1])) {
                      stackOut_4_0 = 2;
                      stackIn_5_0 = stackOut_4_0;
                      break L3;
                    } else {
                      stackOut_3_0 = 1;
                      stackIn_5_0 = stackOut_3_0;
                      break L3;
                    }
                  }
                  L4: {
                    var3 = stackIn_5_0;
                    op.field_c[0][var3] = lp.field_c[0];
                    if (1 != var3) {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      break L4;
                    } else {
                      stackOut_6_0 = 2;
                      stackIn_8_0 = stackOut_6_0;
                      break L4;
                    }
                  }
                  var4 = stackIn_8_0;
                  op.field_c[0][var4] = lp.field_c[3];
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (param0.field_G.field_s != 2) {
                break L1;
              } else {
                op.field_c[0][2] = lp.field_c[0];
                break L1;
              }
            }
            op.field_c[0][0] = lp.field_c[param0.field_G.field_s];
            var3 = 0;
            if (param1 == -26) {
              L5: while (true) {
                if (var3 >= op.field_c[0].length) {
                  break L0;
                } else {
                  mn.field_k[76][var3] = ge.b(op.field_c[0][var3], -20849);
                  bp.a(var3, op.field_c[0][var3], param1 + -100);
                  var3++;
                  if (var5 == 0) {
                    continue L5;
                  } else {
                    return;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("ml.A(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
    }

    final static af a(boolean param0, String param1, byte param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        af stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        af stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 10) {
                break L1;
              } else {
                ml.a(-33, (au) null, true, (String) null);
                break L1;
              }
            }
            L2: {
              L3: {
                var4_long = 0L;
                var6 = null;
                if (-1 != param1.indexOf('@')) {
                  break L3;
                } else {
                  var7 = (CharSequence) (Object) param1;
                  var4_long = wc.a(var7, param2 + -10);
                  if (!ArmiesOfGielinor.field_M) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var6 = (Object) (Object) param1;
              break L2;
            }
            stackOut_5_0 = oi.a((String) var6, param3, param0, param2 ^ 11, var4_long);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("ml.D(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          L5: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    final static boolean a(int param0, int param1, int param2, boolean param3) {
        return (ko.field_b + -param0) * (-param0 + ko.field_b) + (-param1 + sm.field_d) * (-param1 + sm.field_d) < param2 * param2;
    }

    ml(long param0, je param1, String[] param2, je param3, je[] param4, int param5) {
        super(param0, (je) null);
        RuntimeException var8 = null;
        int var8_int = 0;
        je var9 = null;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ((ml) this).field_Ib = new je[param2.length];
            ((ml) this).field_Mb = new je(0L, param3);
            ((ml) this).field_Jb = param4;
            var8_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param2.length <= var8_int) {
                    break L3;
                  } else {
                    var9 = new je(0L, param1);
                    var9.field_X = param2[var8_int];
                    ((ml) this).field_Ib[var8_int] = var9;
                    ((ml) this).a(var9, 121);
                    var8_int++;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((ml) this).a(((ml) this).field_Mb, 122);
                break L2;
              }
              var8_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (param4.length <= var8_int) {
                      break L6;
                    } else {
                      ((ml) this).field_Mb.a(param4[var8_int], 75);
                      var8_int++;
                      if (var10 != 0) {
                        break L5;
                      } else {
                        if (var10 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  ((ml) this).field_Kb = param5;
                  ((ml) this).field_Ib[param5].field_rb = true;
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8;
            stackOut_12_1 = new StringBuilder().append("ml.<init>(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L7;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L7;
            }
          }
          L8: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L8;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L8;
            }
          }
          L9: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L9;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L9;
            }
          }
          L10: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = "Set up new unrated game";
        field_Lb = "Press F10 to open Quick Chat.";
    }
}
