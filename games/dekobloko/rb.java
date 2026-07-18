/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        String stackIn_11_0 = null;
        String stackIn_19_0 = null;
        String stackIn_27_0 = null;
        Object stackIn_30_0 = null;
        boolean stackIn_34_0 = false;
        String stackIn_46_0 = null;
        int stackIn_49_0 = 0;
        String stackIn_51_0 = null;
        Object stackIn_53_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_33_0 = false;
        String stackOut_45_0 = null;
        int stackOut_48_0 = 0;
        Object stackOut_52_0 = null;
        String stackOut_50_0 = null;
        Object stackOut_29_0 = null;
        String stackOut_26_0 = null;
        String stackOut_18_0 = null;
        String stackOut_10_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (null != param2) {
              L1: {
                var3_int = param2.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int > 12) {
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
                                      L6: {
                                        if (~param2.length() >= ~var6) {
                                          break L6;
                                        } else {
                                          var7 = param2.charAt(var6);
                                          stackOut_33_0 = ug.a((char) var7, 32);
                                          stackIn_49_0 = stackOut_33_0 ? 1 : 0;
                                          stackIn_34_0 = stackOut_33_0;
                                          if (var8 != 0) {
                                            break L5;
                                          } else {
                                            L7: {
                                              L8: {
                                                if (!stackIn_34_0) {
                                                  break L8;
                                                } else {
                                                  var5++;
                                                  if (var8 == 0) {
                                                    break L7;
                                                  } else {
                                                    break L8;
                                                  }
                                                }
                                              }
                                              var5 = 0;
                                              break L7;
                                            }
                                            L9: {
                                              if (2 > var5) {
                                                break L9;
                                              } else {
                                                if (param0) {
                                                  break L9;
                                                } else {
                                                  stackOut_45_0 = un.field_b;
                                                  stackIn_46_0 = stackOut_45_0;
                                                  return stackIn_46_0;
                                                }
                                              }
                                            }
                                            var6++;
                                            if (var8 == 0) {
                                              continue L4;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_48_0 = var5;
                                      stackIn_49_0 = stackOut_48_0;
                                      break L5;
                                    }
                                    if (stackIn_49_0 <= 0) {
                                      stackOut_52_0 = null;
                                      stackIn_53_0 = stackOut_52_0;
                                      break L0;
                                    } else {
                                      stackOut_50_0 = qf.field_j;
                                      stackIn_51_0 = stackOut_50_0;
                                      return stackIn_51_0;
                                    }
                                  }
                                } else {
                                  stackOut_29_0 = null;
                                  stackIn_30_0 = stackOut_29_0;
                                  return (String) (Object) stackIn_30_0;
                                }
                              }
                            }
                          }
                          stackOut_26_0 = qf.field_j;
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0;
                        }
                      }
                    }
                    stackOut_18_0 = di.field_G;
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0;
                  }
                }
              }
              stackOut_10_0 = di.field_G;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0;
            } else {
              stackOut_2_0 = di.field_G;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var3;
            stackOut_54_1 = new StringBuilder().append("rb.A(").append(param0).append(',').append(param1).append(',');
            stackIn_57_0 = stackOut_54_0;
            stackIn_57_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param2 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L10;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_58_0 = stackOut_55_0;
              stackIn_58_1 = stackOut_55_1;
              stackIn_58_2 = stackOut_55_2;
              break L10;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + ')');
        }
        return (String) (Object) stackIn_53_0;
    }

    final static void a(long param0, String param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              fa.field_r = param1;
              qa.field_y = param3;
              cd.field_a = param4;
              if (param2 <= -21) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            li.field_e = param0;
            ch.field_c = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("rb.E(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(int param0, int param1, int[] param2) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("rb.B(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(boolean param0, byte param1, String param2, boolean param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              wj.q(-61);
              ah.field_c.c(true);
              dm.field_c = new he(hb.field_Ob, (String) null, vb.field_Z, param0, param3);
              if (param1 <= -13) {
                break L1;
              } else {
                rb.a(false, (byte) -65, (String) null, false);
                break L1;
              }
            }
            de.field_W = new ph(ah.field_c, (ce) (Object) dm.field_c);
            ah.field_c.a((byte) -109, (ce) (Object) de.field_W);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("rb.D(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_k = null;
              field_l = null;
              field_j = null;
              field_a = null;
              field_c = null;
              field_d = null;
              if (param0 == 573767765) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            field_f = null;
            field_n = null;
            field_g = null;
            field_i = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "rb.G(" + param0 + ')');
        }
    }

    final static String a(int param0, int param1, String param2) {
        uf var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        Object stackOut_24_0 = null;
        String stackOut_22_0 = null;
        String stackOut_19_0 = null;
        String stackOut_10_0 = null;
        String stackOut_7_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            if (dc.a((CharSequence) (Object) param2, (byte) -70)) {
              if (jj.field_b == 2) {
                if (!k.a(param2, true)) {
                  if (!qe.a(param2, param1 ^ 3)) {
                    L1: {
                      if (100 > md.field_Z) {
                        break L1;
                      } else {
                        if (0 < eh.field_a) {
                          break L1;
                        } else {
                          stackOut_16_0 = bh.field_f;
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0;
                        }
                      }
                    }
                    if (200 > md.field_Z) {
                      if (!ik.a(param2, (byte) -118)) {
                        var3 = we.field_b;
                        var3.f(param0, -4);
                        var3.field_n = var3.field_n + 1;
                        var4 = var3.field_n;
                        var3.a(true, 0);
                        var3.a(param1, param2);
                        var3.b(-var4 + var3.field_n, true);
                        stackOut_24_0 = null;
                        stackIn_25_0 = stackOut_24_0;
                        break L0;
                      } else {
                        stackOut_22_0 = cm.a((byte) 82, pe.field_a, new String[1]);
                        stackIn_23_0 = stackOut_22_0;
                        return stackIn_23_0;
                      }
                    } else {
                      stackOut_19_0 = bh.field_f;
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0;
                    }
                  } else {
                    stackOut_10_0 = cm.a((byte) 111, f.field_p, new String[1]);
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                } else {
                  stackOut_7_0 = si.field_i;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = ah.field_e;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = ge.field_d;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3_ref;
            stackOut_26_1 = new StringBuilder().append("rb.C(").append(param0).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L2;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return (String) (Object) stackIn_25_0;
    }

    final static void a(hl param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_34_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 3) {
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
                  field_c = null;
                  break L2;
                }
              }
              var2_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (~ic.field_c >= ~var2_int) {
                      break L6;
                    } else {
                      stackOut_12_0 = ~pd.field_g[var2_int].field_m;
                      stackIn_21_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (stackIn_13_0 == ~param0.field_m) {
                            int dupTemp$4 = pd.field_g[var2_int].b((byte) 94);
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
                  int dupTemp$5 = param0.b((byte) 94);
                  ql.field_d[dupTemp$5] = ql.field_d[dupTemp$5] + 1;
                  var2_int = 0;
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L5;
                }
                var3 = stackIn_21_0;
                L8: while (true) {
                  L9: {
                    L10: {
                      if (~ic.field_c >= ~var3) {
                        break L10;
                      } else {
                        stackOut_23_0 = ~param0.field_m;
                        stackIn_35_0 = stackOut_23_0;
                        stackIn_24_0 = stackOut_23_0;
                        if (var5 != 0) {
                          break L9;
                        } else {
                          L11: {
                            L12: {
                              if (stackIn_24_0 != ~pd.field_g[var3].field_m) {
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
                            int incrementValue$6 = var2_int;
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
                    stackOut_34_0 = var2_int;
                    stackIn_35_0 = stackOut_34_0;
                    break L9;
                  }
                  ic.field_c = stackIn_35_0;
                  int fieldTemp$7 = ic.field_c;
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
            stackOut_37_0 = (RuntimeException) var2;
            stackOut_37_1 = new StringBuilder().append("rb.F(");
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L13;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L13;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
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
