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
        int var3_int = 0;
        RuntimeException var3 = null;
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
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                                    if (param2.length() <= var6) {
                                      if (var5 > 0) {
                                        stackIn_35_0 = qf.field_j;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param2.charAt(var6);
                                        if (!ug.a((char) var7, 32)) {
                                          var5 = 0;
                                          break L5;
                                        } else {
                                          var5++;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (2 > var5) {
                                          break L6;
                                        } else {
                                          if (param0) {
                                            break L6;
                                          } else {
                                            stackIn_30_0 = un.field_b;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  stackIn_21_0 = (String) null;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              }
                            }
                          }
                          stackIn_18_0 = qf.field_j;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackIn_13_0 = di.field_G;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_8_0 = di.field_G;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = di.field_G;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("rb.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L7;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L7;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
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
                    return stackIn_30_0;
                  } else {
                    return stackIn_35_0;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("rb.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
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
        }
        field_f = null;
        field_n = null;
        field_g = null;
        field_i = null;
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                          stackIn_15_0 = bh.field_f;
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
                        stackIn_23_0 = null;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        stackIn_21_0 = cm.a((byte) 82, pe.field_a, new String[]{param2});
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    } else {
                      stackIn_18_0 = bh.field_f;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    stackIn_11_0 = cm.a((byte) 111, f.field_p, new String[]{param2});
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = si.field_i;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = ah.field_e;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = ge.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("rb.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L2;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
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
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if ((var2_int ^ -1) <= -4) {
                L2: {
                  if (param1 == -3) {
                    break L2;
                  } else {
                    field_c = (i) null;
                    break L2;
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (ic.field_c <= var2_int) {
                    dupTemp$0 = param0.b((byte) 94);
                    ql.field_d[dupTemp$0] = ql.field_d[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L4: while (true) {
                      if (ic.field_c <= var3) {
                        ic.field_c = var2_int;
                        fieldTemp$1 = ic.field_c;
                        ic.field_c = ic.field_c + 1;
                        pd.field_g[fieldTemp$1] = param0;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (param0.field_m != pd.field_g[var3].field_m) {
                              break L6;
                            } else {
                              var4 = pd.field_g[var3].b((byte) 94);
                              if (ql.field_d[var4] <= kf.field_M) {
                                break L6;
                              } else {
                                ql.field_d[var4] = ql.field_d[var4] - 1;
                                break L5;
                              }
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          pd.field_g[incrementValue$2] = pd.field_g[var3];
                          break L5;
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    L7: {
                      if (pd.field_g[var2_int].field_m == param0.field_m) {
                        dupTemp$3 = pd.field_g[var2_int].b((byte) 94);
                        ql.field_d[dupTemp$3] = ql.field_d[dupTemp$3] + 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              } else {
                ql.field_d[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("rb.F(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
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
