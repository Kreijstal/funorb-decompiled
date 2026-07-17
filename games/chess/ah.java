/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends ub {
    private int field_m;
    private int field_f;
    private String field_k;
    static ci field_i;
    private boolean field_j;
    private int field_n;
    private int field_l;
    private int field_o;
    static hg field_g;
    private lh field_h;

    final void a(int param0, String param1, int param2, int param3, lh param4) {
        fj var8 = null;
        int var7 = 0;
        if (param1 == null) {
            ((ah) this).field_a = null;
            return;
        }
        if (param4 == ((ah) this).field_h) {
            if (((ah) this).field_j) {
                if (((ah) this).field_l == 1) {
                    if (null != ((ah) this).field_k) {
                        if (((ah) this).field_k.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((ah) this).field_j = true;
            ((ah) this).field_h = param4;
            ((ah) this).field_l = 1;
            var8 = this.a(param3, -110, param4, param1);
            var7 = param4.b(param1);
            var8.field_i[param0] = -(var7 >> 1) + param2;
            var8.field_i[param1.length()] = param2 - -(var7 >> 1);
            me.a(param1, 0, var8, param4, (byte) 79);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ah.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    private final fj a(int param0, int param1, lh param2, String param3) {
        fj var5 = null;
        RuntimeException var5_ref = null;
        fj var6 = null;
        fj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        fj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            L1: {
              if (param1 <= -103) {
                break L1;
              } else {
                ((ah) this).field_k = null;
                break L1;
              }
            }
            var6 = new fj(param0 - param2.field_C, param0 + param2.field_t, param3.length());
            var5 = var6;
            ((ah) this).field_a = new fj[]{var6};
            stackOut_2_0 = (fj) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("ah.G(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
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
              var2_int = -123 / ((param1 - 2) / 50);
              if (null == mn.a(-1, param0)) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ah.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final void a(String param0, int param1, lh param2, int param3, int param4) {
        fj var7 = null;
        fj var8 = null;
        if (param4 != 8829) {
            ((ah) this).field_l = -109;
        }
        if (!(param0 != null)) {
            ((ah) this).field_a = null;
            return;
        }
        if (((ah) this).field_h == param2) {
            if (((ah) this).field_j) {
                if (((ah) this).field_l == 0) {
                    if (null != ((ah) this).field_k) {
                        if (!(!((ah) this).field_k.equals((Object) (Object) param0))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((ah) this).field_h = param2;
            ((ah) this).field_l = 0;
            ((ah) this).field_j = true;
            ((ah) this).field_k = param0;
            var7 = this.a(param3, -125, param2, param0);
            var8 = var7;
            var7.field_i[0] = param1;
            var8.field_i[param0.length()] = param2.b(param0) + param1;
            me.a(param0, 0, var8, param2, (byte) 79);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ah.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(int param0, int param1, int param2, String param3, lh param4) {
        fj var8 = null;
        fj var9 = null;
        if (param3 == null) {
            ((ah) this).field_a = null;
            return;
        }
        if (((ah) this).field_h == param4) {
            if (((ah) this).field_j) {
                if (((ah) this).field_l == 2) {
                    if (null != ((ah) this).field_k) {
                        if (!(!((ah) this).field_k.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((ah) this).field_j = true;
            ((ah) this).field_l = 2;
            ((ah) this).field_h = param4;
            ((ah) this).field_k = param3;
            var8 = this.a(param1, -109, param4, param3);
            var9 = var8;
            var9.field_i[param0] = param2 + -param4.b(param3);
            var9.field_i[param3.length()] = param2;
            me.a(param3, 0, var9, param4, (byte) 79);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ah.B(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, String param5, int param6, lh param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        fj var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        fj stackIn_35_0 = null;
        fj stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        fj stackIn_36_0 = null;
        fj stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        fj stackIn_37_0 = null;
        fj stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        String stackIn_39_0 = null;
        String stackIn_40_0 = null;
        String stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        fj stackOut_34_0 = null;
        fj stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        fj stackOut_36_0 = null;
        fj stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        fj stackOut_35_0 = null;
        fj stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        String stackOut_38_0 = null;
        String stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        String stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var15 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param3 != 0) {
                break L1;
              } else {
                param3 = param7.field_q;
                break L1;
              }
            }
            if (param5 != null) {
              L2: {
                if (((ah) this).field_h != param7) {
                  break L2;
                } else {
                  if (((ah) this).field_j) {
                    break L2;
                  } else {
                    if (~param0 != ~((ah) this).field_l) {
                      break L2;
                    } else {
                      if (~param4 != ~((ah) this).field_m) {
                        break L2;
                      } else {
                        if (param3 != ((ah) this).field_n) {
                          break L2;
                        } else {
                          if (~param2 != ~((ah) this).field_f) {
                            break L2;
                          } else {
                            if (param6 != ((ah) this).field_o) {
                              break L2;
                            } else {
                              if (((ah) this).field_k == null) {
                                break L2;
                              } else {
                                if (!((ah) this).field_k.equals((Object) (Object) param5)) {
                                  break L2;
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
                }
              }
              L3: {
                ((ah) this).field_j = false;
                ((ah) this).field_k = param5;
                ((ah) this).field_o = param6;
                ((ah) this).field_f = param2;
                ((ah) this).field_m = param4;
                ((ah) this).field_h = param7;
                ((ah) this).field_l = param0;
                ((ah) this).field_n = param3;
                var16 = new String[param7.b(param5, param6) - -1];
                var17 = var16;
                var10 = Math.max(1, param7.a(param5, new int[1], var17));
                if (((ah) this).field_m != 3) {
                  break L3;
                } else {
                  if (var10 != 1) {
                    break L3;
                  } else {
                    ((ah) this).field_m = 1;
                    break L3;
                  }
                }
              }
              L4: {
                if (((ah) this).field_m == 0) {
                  var11 = param7.field_C;
                  break L4;
                } else {
                  if (((ah) this).field_m != 1) {
                    if (((ah) this).field_m != 2) {
                      L5: {
                        var12 = (((ah) this).field_f - var10 * ((ah) this).field_n) / (1 + var10);
                        if (var12 < 0) {
                          var12 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      ((ah) this).field_n = ((ah) this).field_n + var12;
                      var11 = var12 + param7.field_C;
                      break L4;
                    } else {
                      var11 = -(var10 * ((ah) this).field_n) + (-param7.field_t + ((ah) this).field_f);
                      break L4;
                    }
                  } else {
                    var11 = param7.field_C - -(-(((ah) this).field_n * var10) + ((ah) this).field_f >> 1);
                    break L4;
                  }
                }
              }
              ((ah) this).field_a = new fj[var10];
              if (param1 >= 107) {
                var12 = 0;
                L6: while (true) {
                  if (~var12 <= ~var10) {
                    break L0;
                  } else {
                    L7: {
                      var13 = var16[var12];
                      stackOut_34_0 = null;
                      stackOut_34_1 = null;
                      stackOut_34_2 = -param7.field_C + var11;
                      stackOut_34_3 = param7.field_t + var11;
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_36_1 = stackOut_34_1;
                      stackIn_36_2 = stackOut_34_2;
                      stackIn_36_3 = stackOut_34_3;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      stackIn_35_2 = stackOut_34_2;
                      stackIn_35_3 = stackOut_34_3;
                      if (var13 != null) {
                        stackOut_36_0 = null;
                        stackOut_36_1 = null;
                        stackOut_36_2 = stackIn_36_2;
                        stackOut_36_3 = stackIn_36_3;
                        stackOut_36_4 = var13.length();
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        stackIn_37_3 = stackOut_36_3;
                        stackIn_37_4 = stackOut_36_4;
                        break L7;
                      } else {
                        stackOut_35_0 = null;
                        stackOut_35_1 = null;
                        stackOut_35_2 = stackIn_35_2;
                        stackOut_35_3 = stackIn_35_3;
                        stackOut_35_4 = 0;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        stackIn_37_2 = stackOut_35_2;
                        stackIn_37_3 = stackOut_35_3;
                        stackIn_37_4 = stackOut_35_4;
                        break L7;
                      }
                    }
                    L8: {
                      var14 = new fj(stackIn_37_2, stackIn_37_3, stackIn_37_4);
                      var14.field_i[0] = 0;
                      if (var13 == null) {
                        break L8;
                      } else {
                        L9: {
                          var14.field_i[var13.length()] = param7.b(var13);
                          stackOut_38_0 = (String) var13;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_39_0 = stackOut_38_0;
                          if (param0 == 3) {
                            stackOut_40_0 = (String) (Object) stackIn_40_0;
                            stackOut_40_1 = ((ah) this).a(param7.b(var13), true, var13, param6);
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            break L9;
                          } else {
                            stackOut_39_0 = (String) (Object) stackIn_39_0;
                            stackOut_39_1 = 0;
                            stackIn_41_0 = stackOut_39_0;
                            stackIn_41_1 = stackOut_39_1;
                            break L9;
                          }
                        }
                        me.a(stackIn_41_0, stackIn_41_1, var14, param7, (byte) 79);
                        break L8;
                      }
                    }
                    ((ah) this).field_a[var12] = var14;
                    var11 = var11 + param3;
                    var12++;
                    continue L6;
                  }
                }
              } else {
                return;
              }
            } else {
              ((ah) this).field_a = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var9;
            stackOut_44_1 = new StringBuilder().append("ah.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param5 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L10;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L10;
            }
          }
          L11: {
            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(44).append(param6).append(44);
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param7 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L11;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L11;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + 41);
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Chess.field_G;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= param0.length()) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                L2: {
                  var3 = param0.charAt(var2_int);
                  if (b.a((char) var3, (byte) 104)) {
                    break L2;
                  } else {
                    if (!di.a(-49, (char) var3)) {
                      stackOut_6_0 = 1;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0 != 0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("ah.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + -29 + 41);
        }
        return stackIn_12_0 != 0;
    }

    public static void d(byte param0) {
        field_g = null;
        field_i = null;
    }

    final static boolean a(byte param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        if (lk.a((byte) 95)) {
            ih.a(param4, param2, param3, -1);
            if (pi.field_d != null) {
                if (!(!pi.field_d.a(param5, param2, param4, param1, -11))) {
                    fi.a(-393711775);
                    param2 = false;
                }
            }
            ai.a(param2, 3, param4);
            kj.a(param2, param6, 4239);
            param2 = false;
        }
        int var7 = -87 % ((49 - param0) / 52);
        return param2;
    }

    public ah() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new hg(2, 4, 4, 0);
    }
}
