/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends af {
    static boolean field_i;
    private boolean field_g;
    private int field_p;
    static bh field_n;
    private int field_h;
    private vd field_j;
    private String field_q;
    private int field_l;
    private int field_o;
    private int field_k;
    static lg field_f;
    static String field_m;

    private final fg a(String param0, int param1, int param2, vd param3) {
        fg var5 = null;
        RuntimeException var5_ref = null;
        fg var6 = null;
        Object stackIn_2_0 = null;
        fg stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        fg stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1 >= 11) {
              var6 = new fg(-param3.field_M + param2, param3.field_B + param2, param0.length());
              var5 = var6;
              ((cf) this).field_d = new fg[]{var6};
              stackOut_3_0 = (fg) var5;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (fg) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("cf.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    final void a(int param0, byte param1, vd param2, int param3, String param4) {
        fg var8 = null;
        fg var9 = null;
        if (param4 == null) {
            ((cf) this).field_d = null;
            return;
        }
        if (((cf) this).field_j == param2) {
            if (((cf) this).field_g) {
                if (((cf) this).field_k == 2) {
                    if (((cf) this).field_q != null) {
                        if (((cf) this).field_q.equals((Object) (Object) param4)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((cf) this).field_g = true;
            ((cf) this).field_q = param4;
            if (param1 > -58) {
                field_n = null;
            }
            ((cf) this).field_k = 2;
            ((cf) this).field_j = param2;
            var8 = this.a(param4, 108, param3, param2);
            var9 = var8;
            var9.field_e[0] = param0 + -param2.b(param4);
            var9.field_e[param4.length()] = param0;
            lk.a(-58, param2, 0, var9, param4);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "cf.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    public static void c(int param0) {
        field_n = null;
        field_m = null;
        field_f = null;
    }

    final static void a(byte param0) {
        da.h(0);
    }

    final void a(vd param0, String param1, int param2, boolean param3, int param4) {
        fg var8 = null;
        int var7 = 0;
        if (!(param1 != null)) {
            ((cf) this).field_d = null;
            return;
        }
        if (((cf) this).field_j == param0) {
            if (((cf) this).field_g) {
                if (((cf) this).field_k == 1) {
                    if (((cf) this).field_q != null) {
                        if (!(!((cf) this).field_q.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((cf) this).field_g = param3 ? true : false;
            ((cf) this).field_k = 1;
            ((cf) this).field_j = param0;
            var8 = this.a(param1, 46, param4, param0);
            var7 = param0.b(param1);
            var8.field_e[0] = -(var7 >> 1) + param2;
            var8.field_e[param1.length()] = param2 - -(var7 >> 1);
            lk.a(90, param0, 0, var8, param1);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "cf.F(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static wc a(int param0, boolean param1) {
        mg var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        mg var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var7 = wizardrun.field_H;
          if (param0 == -2) {
            break L0;
          } else {
            field_f = null;
            break L0;
          }
        }
        L1: {
          var8 = nk.field_N;
          var2 = var8;
          var3 = var8.f(255);
          dj.field_e = 127 & var3;
          if ((var3 & 128) == 0) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          rb.field_a = stackIn_5_0 != 0;
          il.field_a = var8.f(255);
          ug.field_N = var8.e((byte) 0);
          if (dj.field_e == 2) {
            wh.field_g = var8.j(-14477);
            ac.field_r = var8.d((byte) 80);
            break L2;
          } else {
            ac.field_r = 0;
            wh.field_g = 0;
            break L2;
          }
        }
        L3: {
          if (var8.f(param0 + 257) != 1) {
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L3;
          } else {
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L3;
          }
        }
        L4: {
          var4 = stackIn_13_0;
          th.field_e = var8.d(0);
          if (var4 == 0) {
            tg.field_b = th.field_e;
            break L4;
          } else {
            tg.field_b = var8.d(0);
            break L4;
          }
        }
        L5: {
          L6: {
            if (dj.field_e == 1) {
              break L6;
            } else {
              if (dj.field_e != 4) {
                break L5;
              } else {
                break L6;
              }
            }
          }
          int discarded$2 = var8.j(-14477);
          String discarded$3 = var8.d(param0 + 2);
          break L5;
        }
        vl.field_f = ol.a(80, (va) (Object) var8, (byte) 45);
        rh.field_m = null;
        return new wc(false);
    }

    final void a(String param0, int param1, int param2, int param3, byte param4, vd param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        fg var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        fg stackIn_38_0 = null;
        fg stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        fg stackIn_39_0 = null;
        fg stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        fg stackIn_40_0 = null;
        fg stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        int stackIn_40_4 = 0;
        int stackIn_42_0 = 0;
        vd stackIn_42_1 = null;
        int stackIn_43_0 = 0;
        vd stackIn_43_1 = null;
        int stackIn_44_0 = 0;
        vd stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        fg stackOut_37_0 = null;
        fg stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        fg stackOut_39_0 = null;
        fg stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        fg stackOut_38_0 = null;
        fg stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        int stackOut_38_4 = 0;
        int stackOut_41_0 = 0;
        vd stackOut_41_1 = null;
        int stackOut_43_0 = 0;
        vd stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        int stackOut_42_0 = 0;
        vd stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var15 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (0 == param1) {
                param1 = param5.field_E;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 != null) {
              L2: {
                if (param5 != ((cf) this).field_j) {
                  break L2;
                } else {
                  if (((cf) this).field_g) {
                    break L2;
                  } else {
                    if (((cf) this).field_k != param2) {
                      break L2;
                    } else {
                      if (~((cf) this).field_p != ~param6) {
                        break L2;
                      } else {
                        if (((cf) this).field_l != param1) {
                          break L2;
                        } else {
                          if (((cf) this).field_o != param7) {
                            break L2;
                          } else {
                            if (((cf) this).field_h != param3) {
                              break L2;
                            } else {
                              if (null == ((cf) this).field_q) {
                                break L2;
                              } else {
                                if (!((cf) this).field_q.equals((Object) (Object) param0)) {
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
                ((cf) this).field_p = param6;
                ((cf) this).field_h = param3;
                ((cf) this).field_l = param1;
                ((cf) this).field_j = param5;
                ((cf) this).field_q = param0;
                ((cf) this).field_k = param2;
                ((cf) this).field_g = false;
                ((cf) this).field_o = param7;
                var16 = new String[param5.b(param0, param3) + 1];
                var17 = var16;
                var10 = Math.max(1, param5.a(param0, new int[1], var17));
                if (((cf) this).field_p != 3) {
                  break L3;
                } else {
                  if (var10 == 1) {
                    ((cf) this).field_p = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                ((cf) this).field_d = new fg[var10];
                if (((cf) this).field_p == 0) {
                  var11 = param5.field_M;
                  break L4;
                } else {
                  if (1 != ((cf) this).field_p) {
                    if (2 != ((cf) this).field_p) {
                      L5: {
                        var12 = (((cf) this).field_o - var10 * ((cf) this).field_l) / (var10 - -1);
                        if (0 <= var12) {
                          break L5;
                        } else {
                          var12 = 0;
                          break L5;
                        }
                      }
                      ((cf) this).field_l = ((cf) this).field_l + var12;
                      var11 = var12 + param5.field_M;
                      break L4;
                    } else {
                      var11 = ((cf) this).field_o - (param5.field_B + var10 * ((cf) this).field_l);
                      break L4;
                    }
                  } else {
                    var11 = param5.field_M + (((cf) this).field_o + -(var10 * ((cf) this).field_l) >> 1);
                    break L4;
                  }
                }
              }
              L6: {
                if (param4 <= -120) {
                  break L6;
                } else {
                  ((cf) this).field_p = 34;
                  break L6;
                }
              }
              var12 = 0;
              L7: while (true) {
                if (~var12 <= ~var10) {
                  break L0;
                } else {
                  var13 = var16[var12];
                  L8: {
                    stackOut_37_0 = null;
                    stackOut_37_1 = null;
                    stackOut_37_2 = var11 + -param5.field_M;
                    stackOut_37_3 = var11 - -param5.field_B;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_39_2 = stackOut_37_2;
                    stackIn_39_3 = stackOut_37_3;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    stackIn_38_2 = stackOut_37_2;
                    stackIn_38_3 = stackOut_37_3;
                    if (var13 != null) {
                      stackOut_39_0 = null;
                      stackOut_39_1 = null;
                      stackOut_39_2 = stackIn_39_2;
                      stackOut_39_3 = stackIn_39_3;
                      stackOut_39_4 = var13.length();
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      stackIn_40_2 = stackOut_39_2;
                      stackIn_40_3 = stackOut_39_3;
                      stackIn_40_4 = stackOut_39_4;
                      break L8;
                    } else {
                      stackOut_38_0 = null;
                      stackOut_38_1 = null;
                      stackOut_38_2 = stackIn_38_2;
                      stackOut_38_3 = stackIn_38_3;
                      stackOut_38_4 = 0;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_40_2 = stackOut_38_2;
                      stackIn_40_3 = stackOut_38_3;
                      stackIn_40_4 = stackOut_38_4;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new fg(stackIn_40_2, stackIn_40_3, stackIn_40_4);
                    var14.field_e[0] = 0;
                    if (var13 == null) {
                      break L9;
                    } else {
                      L10: {
                        var14.field_e[var13.length()] = param5.b(var13);
                        stackOut_41_0 = -76;
                        stackOut_41_1 = (vd) param5;
                        stackIn_43_0 = stackOut_41_0;
                        stackIn_43_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (param2 != 3) {
                          stackOut_43_0 = stackIn_43_0;
                          stackOut_43_1 = (vd) (Object) stackIn_43_1;
                          stackOut_43_2 = 0;
                          stackIn_44_0 = stackOut_43_0;
                          stackIn_44_1 = stackOut_43_1;
                          stackIn_44_2 = stackOut_43_2;
                          break L10;
                        } else {
                          stackOut_42_0 = stackIn_42_0;
                          stackOut_42_1 = (vd) (Object) stackIn_42_1;
                          stackOut_42_2 = ((cf) this).a(param5.b(var13), var13, 6454, param3);
                          stackIn_44_0 = stackOut_42_0;
                          stackIn_44_1 = stackOut_42_1;
                          stackIn_44_2 = stackOut_42_2;
                          break L10;
                        }
                      }
                      lk.a(stackIn_44_0, stackIn_44_1, stackIn_44_2, var14, var13);
                      break L9;
                    }
                  }
                  var11 = var11 + param1;
                  ((cf) this).field_d[var12] = var14;
                  var12++;
                  continue L7;
                }
              }
            } else {
              ((cf) this).field_d = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var9;
            stackOut_47_1 = new StringBuilder().append("cf.I(");
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
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
          L12: {
            stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param5 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L12;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L12;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final void a(int param0, byte param1, int param2, String param3, vd param4) {
        fg var7 = null;
        fg var8 = null;
        if (param1 > -71) {
            ((cf) this).field_p = 2;
        }
        if (!(param3 != null)) {
            ((cf) this).field_d = null;
            return;
        }
        if (((cf) this).field_j == param4) {
            if (((cf) this).field_g) {
                if (((cf) this).field_k == 0) {
                    if (((cf) this).field_q != null) {
                        if (((cf) this).field_q.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((cf) this).field_k = 0;
            ((cf) this).field_j = param4;
            ((cf) this).field_g = true;
            ((cf) this).field_q = param3;
            var7 = this.a(param3, 70, param0, param4);
            var8 = var7;
            var7.field_e[0] = param2;
            var8.field_e[param3.length()] = param4.b(param3) + param2;
            lk.a(113, param4, 0, var8, param3);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "cf.C(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    public cf() {
    }

    final static o[] a(int param0, int param1, kl param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        o[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        o[] stackOut_5_0 = null;
        Object stackOut_1_0 = null;
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
            if (h.a(param0, param3, param2, -126)) {
              L1: {
                if (param1 == 30736) {
                  break L1;
                } else {
                  field_m = null;
                  break L1;
                }
              }
              stackOut_5_0 = pi.b(0);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (o[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("cf.H(").append(param0).append(44).append(param1).append(44);
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
          throw bd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = false;
        field_n = new bh(2, 4, 4, 0);
        field_f = new lg();
        field_m = "Highscores";
    }
}
