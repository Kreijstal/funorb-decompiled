/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends rg {
    static String field_K;
    static int[] field_J;
    private th field_H;
    static String field_F;
    static String field_G;
    static boolean field_E;
    static pd field_I;
    static String[] field_L;

    final void b(int param0, cf param1) {
        df var3 = null;
        boolean discarded$0 = false;
        if (!(param1 instanceof df)) {
            throw new IllegalArgumentException();
        }
        if (param0 != 3016) {
            return;
        }
        try {
            var3 = (df) ((Object) param1);
            this.field_H.a(-25612, var3);
            var3.field_R = true;
            discarded$0 = var3.a((cf) (this), 0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "vk.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean l(byte param0) {
        String discarded$4 = null;
        CharSequence var2 = null;
        if (param0 <= -121) {
          if (fn.field_i >= 20) {
            if (ge.p(-86)) {
              if (qq.field_a > 0) {
                if (re.b(-118)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var2 = (CharSequence) null;
          discarded$4 = vk.a(-28, (CharSequence) null);
          if (fn.field_i >= 20) {
            if (ge.p(-86)) {
              if (qq.field_a > 0) {
                if (re.b(-118)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final void h(byte param0) {
        boolean discarded$1 = false;
        ch var2 = null;
        df var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = new ch(this.field_H);
        var3 = (df) ((Object) var2.c(-3));
        if (param0 > -84) {
          discarded$1 = vk.l((byte) 127);
          L0: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L1: {
                  if (!var3.i(-27388)) {
                    break L1;
                  } else {
                    var3.a(true);
                    break L1;
                  }
                }
                var3 = (df) ((Object) var2.a((byte) -113));
                continue L0;
              } else {
                return;
              }
            } else {
              this.field_B = (cf) ((Object) this.j((byte) -119));
              return;
            }
          }
        } else {
          L2: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L3: {
                  if (!var3.i(-27388)) {
                    break L3;
                  } else {
                    var3.a(true);
                    break L3;
                  }
                }
                var3 = (df) ((Object) var2.a((byte) -113));
                continue L2;
              } else {
                return;
              }
            } else {
              this.field_B = (cf) ((Object) this.j((byte) -119));
              return;
            }
          }
        }
    }

    public static void k(byte param0) {
        field_K = null;
        field_I = null;
        int var1 = 90 / ((30 - param0) / 47);
        field_F = null;
        field_J = null;
        field_G = null;
        field_L = null;
    }

    final static void a(ka param0, byte param1) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int incrementValue$6 = 0;
        int fieldTemp$7 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 83) {
                break L1;
              } else {
                field_J = (int[]) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                if (var2_int >= 3) {
                  var2_int = 0;
                  break L3;
                } else {
                  ub.field_ub[var2_int] = 0;
                  var2_int++;
                  if (var5 != 0) {
                    break L3;
                  } else {
                    continue L2;
                  }
                }
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (uf.field_g <= var2_int) {
                      break L6;
                    } else {
                      stackOut_10_0 = param0.field_l;
                      stackIn_15_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (stackIn_11_0 != uk.field_M[var2_int].field_l) {
                            break L7;
                          } else {
                            dupTemp$4 = uk.field_M[var2_int].a(true);
                            ub.field_ub[dupTemp$4] = ub.field_ub[dupTemp$4] + 1;
                            break L7;
                          }
                        }
                        var2_int++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  dupTemp$5 = param0.a(true);
                  ub.field_ub[dupTemp$5] = ub.field_ub[dupTemp$5] + 1;
                  var2_int = 0;
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L5;
                }
                var3 = stackIn_15_0;
                L8: while (true) {
                  L9: {
                    L10: {
                      if (var3 >= uf.field_g) {
                        break L10;
                      } else {
                        stackOut_17_0 = uk.field_M[var3].field_l ^ -1;
                        stackIn_25_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var5 != 0) {
                          break L9;
                        } else {
                          L11: {
                            L12: {
                              if (stackIn_18_0 != (param0.field_l ^ -1)) {
                                break L12;
                              } else {
                                var4 = uk.field_M[var3].a(true);
                                if (ub.field_ub[var4] <= sj.field_m) {
                                  break L12;
                                } else {
                                  ub.field_ub[var4] = ub.field_ub[var4] - 1;
                                  if (var5 == 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            incrementValue$6 = var2_int;
                            var2_int++;
                            uk.field_M[incrementValue$6] = uk.field_M[var3];
                            break L11;
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    stackOut_24_0 = var2_int;
                    stackIn_25_0 = stackOut_24_0;
                    break L9;
                  }
                  uf.field_g = stackIn_25_0;
                  fieldTemp$7 = uf.field_g;
                  uf.field_g = uf.field_g + 1;
                  uk.field_M[fieldTemp$7] = param0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var2);
            stackOut_27_1 = new StringBuilder().append("vk.E(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L13;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L13;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 20) {
                break L1;
              } else {
                var3 = (int[]) null;
                vk.a((int[]) null, true, 94, 30, (byte) 84, (int[]) null, 90, 72, -73);
                break L1;
              }
            }
            stackOut_2_0 = so.a(false, -52, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("vk.P(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean i(byte param0) {
        int[] var2 = null;
        if (param0 == -39) {
          if (a.a(-107)) {
            if ((8 & wf.field_m) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var2 = (int[]) null;
          vk.a((int[]) null, false, -127, -95, (byte) -9, (int[]) null, -29, -30, -79);
          if (a.a(-107)) {
            if ((8 & wf.field_m) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void h(int param0) {
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        ch var2 = null;
        df var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = new ch(this.field_H);
        var3 = (df) ((Object) var2.c(-3));
        L0: while (true) {
          if (var3 == null) {
            this.field_B = null;
            if (param0 < -81) {
              return;
            } else {
              discarded$3 = vk.i((byte) 56);
              return;
            }
          } else {
            var3.field_R = false;
            var3 = (df) ((Object) var2.a((byte) -112));
            if (var4 != 0) {
              if (param0 < -81) {
                return;
              } else {
                discarded$4 = vk.i((byte) 56);
                return;
              }
            } else {
              if (var4 == 0) {
                continue L0;
              } else {
                this.field_B = null;
                if (param0 < -81) {
                  return;
                } else {
                  discarded$5 = vk.i((byte) 56);
                  return;
                }
              }
            }
          }
        }
    }

    final df j(byte param0) {
        ch var2 = null;
        df var3 = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        int stackIn_8_0 = 0;
        boolean stackOut_2_0 = false;
        byte stackOut_7_0 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = new ch(this.field_H);
        var3 = (df) ((Object) var2.c(-3));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackOut_2_0 = var3.field_R;
                stackIn_8_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0) {
                    return var3;
                  } else {
                    var3 = (df) ((Object) var2.a((byte) -48));
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = param0;
            stackIn_8_0 = stackOut_7_0;
            break L1;
          }
          if (stackIn_8_0 < -118) {
            return null;
          } else {
            return (df) null;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ch var5 = null;
        cf var6 = null;
        int var7 = 0;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          if (this.field_h != null) {
            this.field_h.a(true, param1, -15112, param3, (cf) (this));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == -2) {
          var5 = new ch(this.field_H);
          var6 = (cf) ((Object) var5.a(32397));
          L1: while (true) {
            if (var6 != null) {
              var6.a(-2, param1 - -this.field_i, param2, param3 + this.field_y);
              var6 = (cf) ((Object) var5.e(-3));
              if (var7 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final cf f(int param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(this.field_H);
        if (param0 != -1963) {
            return (cf) null;
        }
        df var3 = (df) ((Object) var2.c(-3));
        do {
            if (var3 == null) {
                return null;
            }
            if (!(!var3.field_R)) {
                return var3.g(122);
            }
            var3 = (df) ((Object) var2.a((byte) -38));
        } while (var4 == 0);
        return null;
    }

    final static ja[] a(int param0, int param1, ul param2, int param3) {
        boolean discarded$2 = false;
        RuntimeException var4 = null;
        ja[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ja[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (ud.a(param3, param2, param1, (byte) -42)) {
              L1: {
                if (param0 >= 32) {
                  break L1;
                } else {
                  discarded$2 = vk.i((byte) -118);
                  break L1;
                }
              }
              stackOut_5_0 = eb.a(33);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("vk.N(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, byte param4, int[] param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var9_int = 13 / ((param4 - 48) / 58);
                if ((param2 ^ -1) == -2) {
                  break L2;
                } else {
                  L3: {
                    if (3 != param2) {
                      break L3;
                    } else {
                      mj.field_Hb[param2] = (nc) ((Object) new fk(param2, param1, param3, param6, param8, param7, param5));
                      if (var10 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if ((param2 ^ -1) == -5) {
                      break L4;
                    } else {
                      L5: {
                        if (5 == param2) {
                          break L5;
                        } else {
                          if (-7 == (param2 ^ -1)) {
                            break L5;
                          } else {
                            L6: {
                              if (10 == param2) {
                                break L6;
                              } else {
                                L7: {
                                  if (param2 == 12) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (param2 == 14) {
                                        break L8;
                                      } else {
                                        L9: {
                                          if (-16 == (param2 ^ -1)) {
                                            break L9;
                                          } else {
                                            L10: {
                                              if (13 == param2) {
                                                break L10;
                                              } else {
                                                mj.field_Hb[param2] = new nc(param2, param1, param3, param6, param8, param7, param5);
                                                if (var10 == 0) {
                                                  break L1;
                                                } else {
                                                  break L10;
                                                }
                                              }
                                            }
                                            mj.field_Hb[param2] = (nc) ((Object) new kp(param2, param1, param3, param6, param8, param7, param5));
                                            if (var10 == 0) {
                                              break L1;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        mj.field_Hb[param2] = (nc) ((Object) new tk(param2, param1, param3, param6, param8, param7, param5));
                                        if (var10 == 0) {
                                          break L1;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    mj.field_Hb[param2] = (nc) ((Object) new vj(param2, param1, param3, param6, param8, param7, param5));
                                    if (var10 == 0) {
                                      break L1;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                mj.field_Hb[param2] = (nc) ((Object) new vo(param2, param1, param3, param6, param8, param7, param5));
                                if (var10 == 0) {
                                  break L1;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            mj.field_Hb[param2] = (nc) ((Object) new si(param2, param1, param3, param6, param8, param7, param5));
                            if (var10 == 0) {
                              break L1;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      mj.field_Hb[param2] = (nc) ((Object) new mq(param2, param1, param3, param6, param8, param7, param5));
                      if (var10 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  mj.field_Hb[param2] = (nc) ((Object) new ol(param2, param1, param3, param6, param8, param7, param5));
                  if (var10 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              mj.field_Hb[param2] = (nc) ((Object) new ho(param2, param1, param3, param6, param8, param7, param5));
              break L1;
            }
            ab.field_h = (si) ((Object) mj.field_Hb[10]);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var9);
            stackOut_32_1 = new StringBuilder().append("vk.R(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          L12: {
            stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param5 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L12;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L12;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public vk() {
        super(0, 0, ub.field_wb, kc.field_a, (nl) null, (bj) null);
        this.field_H = new th();
    }

    final void g(byte param0) {
        ch var2 = null;
        df var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = new ch(this.field_H);
        if (param0 == 118) {
          var3 = (df) ((Object) var2.c(-3));
          L0: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L1: {
                  if (var3.h(-6134)) {
                    var3.a(true);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3 = (df) ((Object) var2.a((byte) -30));
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          field_J = (int[]) null;
          var3 = (df) ((Object) var2.c(-3));
          L2: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L3: {
                  if (var3.h(-6134)) {
                    var3.a(true);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = (df) ((Object) var2.a((byte) -30));
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

    static {
        field_F = "(Including <%0>)";
        field_G = "Achievements can only be earned in Rated games.";
        field_K = "Music: ";
        field_L = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_E = false;
    }
}
