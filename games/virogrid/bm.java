/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends ie {
    private int field_l;
    private int field_q;
    static wl field_i;
    private int field_j;
    private int field_p;
    private String field_h;
    private boolean field_m;
    private e field_f;
    static String field_g;
    private int field_k;
    static String field_o;
    static String field_n;

    final void a(int param0, byte param1, e param2, int param3, String param4) {
        RuntimeException var6 = null;
        ri var7 = null;
        ri var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param4 != null) {
              L1: {
                if (((bm) this).field_f != param2) {
                  break L1;
                } else {
                  if (!((bm) this).field_m) {
                    break L1;
                  } else {
                    if (0 != ((bm) this).field_j) {
                      break L1;
                    } else {
                      if (((bm) this).field_h == null) {
                        break L1;
                      } else {
                        if (!((bm) this).field_h.equals((Object) (Object) param4)) {
                          break L1;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              ((bm) this).field_f = param2;
              ((bm) this).field_m = true;
              ((bm) this).field_j = 0;
              ((bm) this).field_h = param4;
              var7 = this.a(false, param4, param2, param0);
              var8 = var7;
              var7.field_d[0] = param3;
              var8.field_d[param4.length()] = param3 + param2.a(param4);
              bd.a(param1 ^ 91, 0, var8, param2, param4);
              if (param1 == 59) {
                break L0;
              } else {
                ((bm) this).field_h = null;
                return;
              }
            } else {
              ((bm) this).field_d = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("bm.P(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          L3: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    final static mg[] a(int param0, int param1, int param2, byte param3) {
        if (param3 >= -68) {
          boolean discarded$2 = bm.a('￶', true);
          return he.b(param2, 1, param1, (byte) 89, param0);
        } else {
          return he.b(param2, 1, param1, (byte) 89, param0);
        }
    }

    final static void d(int param0, int param1) {
        c.field_a = param0;
        if (param1 == 0) {
          L0: {
            if (null != vg.field_B) {
              vg.field_B.e(2, param0);
              break L0;
            } else {
              break L0;
            }
          }
          if (null != wc.field_f) {
            wc.field_f.a((byte) 90, param0);
            return;
          } else {
            return;
          }
        } else {
          L1: {
            field_g = null;
            if (null != vg.field_B) {
              vg.field_B.e(2, param0);
              break L1;
            } else {
              break L1;
            }
          }
          if (null == wc.field_f) {
            return;
          } else {
            wc.field_f.a((byte) 90, param0);
            return;
          }
        }
    }

    final void a(byte param0, int param1, String param2, int param3, e param4) {
        ri var8 = null;
        ri var9 = null;
        if (!(param2 != null)) {
            ((bm) this).field_d = null;
            return;
        }
        if (param0 > -49) {
            return;
        }
        if (param4 == ((bm) this).field_f) {
            if (((bm) this).field_m) {
                if (((bm) this).field_j == 2) {
                    if (((bm) this).field_h != null) {
                        if (!(!((bm) this).field_h.equals((Object) (Object) param2))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((bm) this).field_j = 2;
            ((bm) this).field_f = param4;
            ((bm) this).field_h = param2;
            ((bm) this).field_m = true;
            var8 = this.a(false, param2, param4, param3);
            var9 = var8;
            var9.field_d[0] = -param4.a(param2) + param1;
            var9.field_d[param2.length()] = param1;
            bd.a(37, 0, var9, param4, param2);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "bm.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, String param4, e param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        ri var14 = null;
        int var15 = 0;
        Object var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        ri stackIn_36_0 = null;
        ri stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        ri stackIn_37_0 = null;
        ri stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        ri stackIn_38_0 = null;
        ri stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        ri stackOut_35_0 = null;
        ri stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        ri stackOut_37_0 = null;
        ri stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        ri stackOut_36_0 = null;
        ri stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var15 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 != 0) {
                break L1;
              } else {
                param3 = param5.field_J;
                break L1;
              }
            }
            if (param4 == null) {
              ((bm) this).field_d = null;
              return;
            } else {
              L2: {
                if (param5 != ((bm) this).field_f) {
                  break L2;
                } else {
                  if (((bm) this).field_m) {
                    break L2;
                  } else {
                    if (~((bm) this).field_j != ~param1) {
                      break L2;
                    } else {
                      if (~param0 != ~((bm) this).field_l) {
                        break L2;
                      } else {
                        if (~param3 != ~((bm) this).field_q) {
                          break L2;
                        } else {
                          if (~param7 != ~((bm) this).field_k) {
                            break L2;
                          } else {
                            if (((bm) this).field_p != param6) {
                              break L2;
                            } else {
                              if (((bm) this).field_h == null) {
                                break L2;
                              } else {
                                if (!((bm) this).field_h.equals((Object) (Object) param4)) {
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
                ((bm) this).field_l = param0;
                ((bm) this).field_j = param1;
                ((bm) this).field_q = param3;
                ((bm) this).field_k = param7;
                ((bm) this).field_h = param4;
                ((bm) this).field_f = param5;
                ((bm) this).field_m = false;
                ((bm) this).field_p = param6;
                var17 = new String[1 + param5.b(param4, param6)];
                var18 = var17;
                if (param2) {
                  break L3;
                } else {
                  var16 = null;
                  ((bm) this).a(-35, (byte) -77, (e) null, 104, (String) null);
                  break L3;
                }
              }
              L4: {
                var10 = Math.max(1, param5.a(param4, new int[1], var18));
                if (((bm) this).field_l != 3) {
                  break L4;
                } else {
                  if (var10 != 1) {
                    break L4;
                  } else {
                    ((bm) this).field_l = 1;
                    break L4;
                  }
                }
              }
              L5: {
                if (0 != ((bm) this).field_l) {
                  if (1 == ((bm) this).field_l) {
                    var11 = (-(var10 * ((bm) this).field_q) + ((bm) this).field_k >> 1) + param5.field_H;
                    break L5;
                  } else {
                    if (((bm) this).field_l != 2) {
                      L6: {
                        var12 = (((bm) this).field_k - ((bm) this).field_q * var10) / (var10 - -1);
                        if (0 > var12) {
                          var12 = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11 = param5.field_H - -var12;
                      ((bm) this).field_q = ((bm) this).field_q + var12;
                      break L5;
                    } else {
                      var11 = -(var10 * ((bm) this).field_q) + (-param5.field_G + ((bm) this).field_k);
                      break L5;
                    }
                  }
                } else {
                  var11 = param5.field_H;
                  break L5;
                }
              }
              ((bm) this).field_d = new ri[var10];
              var12 = 0;
              L7: while (true) {
                if (~var10 >= ~var12) {
                  break L0;
                } else {
                  L8: {
                    var13 = var17[var12];
                    stackOut_35_0 = null;
                    stackOut_35_1 = null;
                    stackOut_35_2 = -param5.field_H + var11;
                    stackOut_35_3 = var11 + param5.field_G;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_37_1 = stackOut_35_1;
                    stackIn_37_2 = stackOut_35_2;
                    stackIn_37_3 = stackOut_35_3;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    stackIn_36_2 = stackOut_35_2;
                    stackIn_36_3 = stackOut_35_3;
                    if (var13 == null) {
                      stackOut_37_0 = null;
                      stackOut_37_1 = null;
                      stackOut_37_2 = stackIn_37_2;
                      stackOut_37_3 = stackIn_37_3;
                      stackOut_37_4 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      stackIn_38_2 = stackOut_37_2;
                      stackIn_38_3 = stackOut_37_3;
                      stackIn_38_4 = stackOut_37_4;
                      break L8;
                    } else {
                      stackOut_36_0 = null;
                      stackOut_36_1 = null;
                      stackOut_36_2 = stackIn_36_2;
                      stackOut_36_3 = stackIn_36_3;
                      stackOut_36_4 = var13.length();
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_38_2 = stackOut_36_2;
                      stackIn_38_3 = stackOut_36_3;
                      stackIn_38_4 = stackOut_36_4;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new ri(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                    var14.field_d[0] = 0;
                    if (var13 != null) {
                      L10: {
                        var14.field_d[var13.length()] = param5.a(var13);
                        stackOut_40_0 = 62;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_41_0 = stackOut_40_0;
                        if (param1 != 3) {
                          stackOut_42_0 = stackIn_42_0;
                          stackOut_42_1 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          stackIn_43_1 = stackOut_42_1;
                          break L10;
                        } else {
                          stackOut_41_0 = stackIn_41_0;
                          stackOut_41_1 = ((bm) this).a(var13, param5.a(var13), true, param6);
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_43_1 = stackOut_41_1;
                          break L10;
                        }
                      }
                      bd.a(stackIn_43_0, stackIn_43_1, var14, param5, var13);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var11 = var11 + param3;
                  ((bm) this).field_d[var12] = var14;
                  var12++;
                  continue L7;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var9;
            stackOut_46_1 = new StringBuilder().append("bm.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param4 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L11;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L11;
            }
          }
          L12: {
            stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param5 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L12;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L12;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static boolean a(char param0, boolean param1) {
        if (!param1) {
          if (65 > param0) {
            if (param0 >= 97) {
              if (122 >= param0) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (param0 > 90) {
              if (param0 >= 97) {
                if (122 < param0) {
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
          }
        } else {
          return true;
        }
    }

    private final ri a(boolean param0, String param1, e param2, int param3) {
        ri var5 = null;
        RuntimeException var5_ref = null;
        ri var6 = null;
        ri stackIn_3_0 = null;
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
        ri stackOut_2_0 = null;
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
            var6 = new ri(-param2.field_H + param3, param3 + param2.field_G, param1.length());
            var5 = var6;
            ((bm) this).field_d = new ri[]{var6};
            stackOut_2_0 = (ri) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("bm.J(").append(false).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static void c(int param0, int param1) {
    }

    public static void c(int param0) {
        field_o = null;
        field_i = null;
        field_n = null;
        field_g = null;
    }

    final void a(String param0, byte param1, e param2, int param3, int param4) {
        ri var7 = null;
        int var8 = 0;
        if (param0 == null) {
            ((bm) this).field_d = null;
            return;
        }
        if (((bm) this).field_f == param2) {
            if (((bm) this).field_m) {
                if (((bm) this).field_j == 1) {
                    if (((bm) this).field_h != null) {
                        if (!(!((bm) this).field_h.equals((Object) (Object) param0))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            int var6_int = 78 / ((-27 - param1) / 49);
            ((bm) this).field_m = true;
            ((bm) this).field_j = 1;
            ((bm) this).field_f = param2;
            var7 = this.a(false, param0, param2, param4);
            var8 = param2.a(param0);
            var7.field_d[0] = param3 + -(var8 >> 1);
            var7.field_d[param0.length()] = (var8 >> 1) + param3;
            bd.a(94, 0, var7, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "bm.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public bm() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "This game has been updated! Please reload this page.";
        field_i = new wl();
        field_o = "Auto-respond to <%0>";
        field_n = "Waiting for sound effects";
    }
}
