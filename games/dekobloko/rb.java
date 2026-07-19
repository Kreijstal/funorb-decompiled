/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static um field_f;
    static int field_e;
    static String field_l;
    static byte[] field_k;
    static String field_g;
    static int field_b;
    static int field_m;
    static String field_i;
    static int[] field_n;
    static i field_c;
    static ck[][] field_d;
    static int field_h;
    static String field_a;
    static ck[][] field_j;

    final static String a(boolean param0, byte param1, CharSequence param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        boolean stackIn_25_0 = false;
        String stackIn_32_0 = null;
        int stackIn_35_0 = 0;
        String stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        boolean stackOut_24_0 = false;
        String stackOut_31_0 = null;
        String stackOut_37_0 = null;
        String stackOut_20_0 = null;
        String stackOut_17_0 = null;
        String stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                var3_int = param2.length();
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (-13 > (var3_int ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      var4 = kf.a(param2, (byte) 2);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (1 > var4.length()) {
                          break L2;
                        } else {
                          L3: {
                            if (ug.a(var4.charAt(0), 32)) {
                              break L3;
                            } else {
                              if (ug.a(var4.charAt(-1 + var4.length()), 32)) {
                                break L3;
                              } else {
                                if (param1 > 12) {
                                  var5 = 0;
                                  var6 = 0;
                                  L4: while (true) {
                                    L5: {
                                      if (param2.length() <= var6) {
                                        stackOut_34_0 = var5;
                                        stackIn_35_0 = stackOut_34_0;
                                        break L5;
                                      } else {
                                        var7 = param2.charAt(var6);
                                        stackOut_24_0 = ug.a((char) var7, 32);
                                        stackIn_35_0 = stackOut_24_0 ? 1 : 0;
                                        stackIn_25_0 = stackOut_24_0;
                                        if (var8 != 0) {
                                          break L5;
                                        } else {
                                          L6: {
                                            L7: {
                                              if (!stackIn_25_0) {
                                                break L7;
                                              } else {
                                                var5++;
                                                if (var8 == 0) {
                                                  break L6;
                                                } else {
                                                  break L7;
                                                }
                                              }
                                            }
                                            var5 = 0;
                                            break L6;
                                          }
                                          L8: {
                                            if (2 > var5) {
                                              break L8;
                                            } else {
                                              if (param0) {
                                                break L8;
                                              } else {
                                                stackOut_31_0 = un.field_b;
                                                stackIn_32_0 = stackOut_31_0;
                                                decompiledRegionSelector0 = 5;
                                                break L0;
                                              }
                                            }
                                          }
                                          var6++;
                                          continue L4;
                                        }
                                      }
                                    }
                                    if (stackIn_35_0 > 0) {
                                      stackOut_37_0 = qf.field_j;
                                      stackIn_38_0 = stackOut_37_0;
                                      decompiledRegionSelector0 = 6;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  }
                                } else {
                                  stackOut_20_0 = (String) null;
                                  stackIn_21_0 = stackOut_20_0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              }
                            }
                          }
                          stackOut_17_0 = qf.field_j;
                          stackIn_18_0 = stackOut_17_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackOut_12_0 = di.field_G;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackOut_7_0 = di.field_G;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = di.field_G;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var3);
            stackOut_40_1 = new StringBuilder().append("rb.A(").append(param0).append(',').append(param1).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param2 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L9;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_32_0;
                  } else {
                    return stackIn_38_0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(long param0, String param1, int param2, int param3, int param4) {
        try {
            fa.field_r = param1;
            qa.field_y = param3;
            cd.field_a = param4;
            if (param2 > -21) {
                field_i = (String) null;
            }
            li.field_e = param0;
            ch.field_c = true;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "rb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(int param0, int param1, int[] param2) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -6) {
                break L1;
              } else {
                field_b = -32;
                break L1;
              }
            }
            L2: {
              if (0 == (param2[param1 >> 1301827237] & 1 << (param1 & 31))) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("rb.B(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static void a(boolean param0, byte param1, String param2, boolean param3) {
        try {
            wj.q(-61);
            ah.field_c.c(true);
            dm.field_c = new he(hb.field_Ob, (String) null, vb.field_Z, param0, param3);
            if (param1 > -13) {
                String var5 = (String) null;
                rb.a(false, (byte) -65, (String) null, false);
            }
            de.field_W = new ph(ah.field_c, dm.field_c);
            ah.field_c.a((byte) -109, de.field_W);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "rb.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        field_j = (ck[][]) null;
        field_a = null;
        field_c = null;
        field_d = (ck[][]) null;
        if (param0 != 573767765) {
          field_l = (String) null;
          field_f = null;
          field_n = null;
          field_g = null;
          field_i = null;
          return;
        } else {
          field_f = null;
          field_n = null;
          field_g = null;
          field_i = null;
          return;
        }
    }

    final static String a(int param0, int param1, String param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        uf var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_14_0 = null;
        Object stackOut_22_0 = null;
        String stackOut_20_0 = null;
        String stackOut_17_0 = null;
        String stackOut_10_0 = null;
        String stackOut_7_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param2);
            if (dc.a(var6, (byte) -70)) {
              if ((jj.field_b ^ -1) == -3) {
                if (!k.a(param2, true)) {
                  if (!qe.a(param2, param1 ^ 3)) {
                    L1: {
                      if (100 > md.field_Z) {
                        break L1;
                      } else {
                        if (0 < eh.field_a) {
                          break L1;
                        } else {
                          stackOut_14_0 = bh.field_f;
                          stackIn_15_0 = stackOut_14_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                    if (200 > md.field_Z) {
                      if (!ik.a(param2, (byte) -118)) {
                        var5 = we.field_b;
                        var5.f(param0, -4);
                        var5.field_n = var5.field_n + 1;
                        var4 = var5.field_n;
                        var5.a(true, 0);
                        var5.a(param1, param2);
                        var5.b(-var4 + var5.field_n, true);
                        stackOut_22_0 = null;
                        stackIn_23_0 = stackOut_22_0;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        stackOut_20_0 = cm.a((byte) 82, pe.field_a, new String[]{param2});
                        stackIn_21_0 = stackOut_20_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    } else {
                      stackOut_17_0 = bh.field_f;
                      stackIn_18_0 = stackOut_17_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    stackOut_10_0 = cm.a((byte) 111, f.field_p, new String[]{param2});
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_7_0 = si.field_i;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = ah.field_e;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = ge.field_d;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("rb.C(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L2;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_15_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_18_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_21_0;
                    } else {
                      return (String) ((Object) stackIn_23_0);
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(hl param0, int param1) {
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
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var2_int ^ -1) <= -4) {
                    break L3;
                  } else {
                    ql.field_d[var2_int] = 0;
                    var2_int++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1 == -3) {
                  break L2;
                } else {
                  field_c = (i) null;
                  break L2;
                }
              }
              var2_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (ic.field_c <= var2_int) {
                      break L6;
                    } else {
                      stackOut_10_0 = pd.field_g[var2_int].field_m ^ -1;
                      stackIn_16_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (stackIn_11_0 == (param0.field_m ^ -1)) {
                            dupTemp$4 = pd.field_g[var2_int].b((byte) 94);
                            ql.field_d[dupTemp$4] = ql.field_d[dupTemp$4] + 1;
                            break L7;
                          } else {
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
                  dupTemp$5 = param0.b((byte) 94);
                  ql.field_d[dupTemp$5] = ql.field_d[dupTemp$5] + 1;
                  var2_int = 0;
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L5;
                }
                var3 = stackIn_16_0;
                L8: while (true) {
                  L9: {
                    L10: {
                      if (ic.field_c <= var3) {
                        break L10;
                      } else {
                        stackOut_18_0 = param0.field_m ^ -1;
                        stackIn_26_0 = stackOut_18_0;
                        stackIn_19_0 = stackOut_18_0;
                        if (var5 != 0) {
                          break L9;
                        } else {
                          L11: {
                            L12: {
                              if (stackIn_19_0 != (pd.field_g[var3].field_m ^ -1)) {
                                break L12;
                              } else {
                                var4 = pd.field_g[var3].b((byte) 94);
                                if (ql.field_d[var4] <= kf.field_M) {
                                  break L12;
                                } else {
                                  ql.field_d[var4] = ql.field_d[var4] - 1;
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
                            pd.field_g[incrementValue$6] = pd.field_g[var3];
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
                    stackOut_25_0 = var2_int;
                    stackIn_26_0 = stackOut_25_0;
                    break L9;
                  }
                  ic.field_c = stackIn_26_0;
                  fieldTemp$7 = ic.field_c;
                  ic.field_c = ic.field_c + 1;
                  pd.field_g[fieldTemp$7] = param0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var2);
            stackOut_28_1 = new StringBuilder().append("rb.F(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L13;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L13;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
    }

    static {
        field_f = new um();
        field_i = "Open in popup window";
        field_n = new int[]{287440998, 288563797, 288572484, 287467144, 289703987, 288594261, 288602999, 288612215, 573767765, 574894916, 572679765, 574920994, 573819955, 572718933};
        field_h = 0;
        field_g = "This password contains your Player Name, and would be easy to guess";
        field_a = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_b = 0;
        field_j = new ck[8][];
        field_d = new ck[8][];
        field_c = new i();
    }
}
