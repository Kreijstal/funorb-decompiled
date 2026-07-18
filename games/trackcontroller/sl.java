/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sl {
    static aa field_e;
    int field_h;
    private int field_k;
    int[][] field_i;
    int[][] field_d;
    byte[][] field_o;
    static int field_n;
    int field_l;
    static int field_j;
    private boolean field_g;
    private int field_c;
    int field_f;
    private int field_m;
    int field_b;
    int field_a;

    final void a(boolean param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = TrackController.field_F ? 1 : 0;
          if (param2) {
            break L0;
          } else {
            ((sl) this).field_f = -91;
            break L0;
          }
        }
        ((sl) this).field_m = ((sl) this).field_h / 5 % ri.field_H.length;
        var4 = ((sl) this).field_f;
        var5 = 0;
        L1: while (true) {
          if (((sl) this).field_o.length <= var5) {
            ((sl) this).a(467, (byte) -117, 229 + param1);
            return;
          } else {
            var6 = ((sl) this).field_a;
            var7 = 0;
            L2: while (true) {
              if (var7 >= ((sl) this).field_o[0].length) {
                var4 += 26;
                var5++;
                continue L1;
              } else {
                L3: {
                  ((sl) this).a(var6, var4, 0, (int) ((sl) this).field_o[var5][var7]);
                  var8 = -65 & ((sl) this).field_d[var5][var7];
                  if (var8 < 7) {
                    break L3;
                  } else {
                    if (var8 >= 38) {
                      break L3;
                    } else {
                      ii.field_r[var8].e(var6, var4);
                      if ((((sl) this).field_d[var5][var7] & 64) != 0) {
                        ue.a(var6, var8, (byte) 91, var4);
                        var6 += 26;
                        var7++;
                        continue L2;
                      } else {
                        var6 += 26;
                        var7++;
                        continue L2;
                      }
                    }
                  }
                }
                if (var8 == 38) {
                  L4: {
                    if (!param0) {
                      break L4;
                    } else {
                      if (((sl) this).field_h % 30 >= 15) {
                        break L4;
                      } else {
                        ii.field_r[50].e(var6, var4);
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var9 = ((sl) this).field_b / 3 % 4;
                    if (!ui.a(0, param2)) {
                      break L5;
                    } else {
                      if (((sl) this).field_b != 0) {
                        da.field_p[32 + ((sl) this).field_l][var9].e(var6, var4);
                        var6 += 26;
                        var7++;
                        continue L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  da.field_p[((sl) this).field_l][var9].e(var6, var4);
                  var6 += 26;
                  var7++;
                  continue L2;
                } else {
                  var6 += 26;
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void a(int[][] param0, byte param1, int[][] param2, byte[][] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3.length == 0) {
                ((sl) this).field_o = new byte[0][0];
                break L1;
              } else {
                ((sl) this).field_o = new byte[param3.length][param3[0].length];
                break L1;
              }
            }
            L2: {
              if (param1 == 50) {
                break L2;
              } else {
                ((sl) this).a(-69, 10, -15, -70);
                break L2;
              }
            }
            L3: {
              if (param0.length != 0) {
                ((sl) this).field_d = new int[param0.length][param0[0].length];
                break L3;
              } else {
                ((sl) this).field_d = new int[0][0];
                break L3;
              }
            }
            var5_int = 0;
            L4: while (true) {
              if (var5_int >= param3.length) {
                ((sl) this).field_i = new int[param2.length][param2[0].length];
                var5_int = 0;
                L5: while (true) {
                  if (var5_int >= param2.length) {
                    L6: {
                      if (((sl) this).field_g) {
                        var5_int = 6;
                        var6 = 0;
                        var7 = 8;
                        var8 = 0;
                        var9 = 0;
                        L7: while (true) {
                          if (8 <= var9) {
                            ((sl) this).field_k = (5 - var6 - var5_int) * 13;
                            ((sl) this).field_c = (7 - var8 - var7) * 13;
                            break L6;
                          } else {
                            var10 = 0;
                            L8: while (true) {
                              if (var10 >= 6) {
                                var9++;
                                continue L7;
                              } else {
                                L9: {
                                  if (0 != param2[var9][var10]) {
                                    var5_int = Math.min(var5_int, var10);
                                    var6 = Math.max(var6, var10);
                                    var7 = Math.min(var7, var9);
                                    var8 = Math.max(var8, var9);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                var10++;
                                continue L8;
                              }
                            }
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    break L0;
                  } else {
                    pd.a(param2[var5_int], 0, ((sl) this).field_i[var5_int], 0, param2[0].length);
                    var5_int++;
                    continue L5;
                  }
                }
              } else {
                pd.a(param3[var5_int], 0, ((sl) this).field_o[var5_int], 0, param3[var5_int].length);
                pd.a(param0[var5_int], 0, ((sl) this).field_d[var5_int], 0, param0[var5_int].length);
                var5_int++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var5;
            stackOut_28_1 = new StringBuilder().append("sl.B(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param1).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          L12: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param3 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L12;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L12;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_e = null;
    }

    void a(ea param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((sl) this).a(param0.field_d, (byte) 50, param0.field_i, param0.field_o);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("sl.I(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 107 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          var5 = param3;
          if (var5 == 0) {
            break L0;
          } else {
            L1: {
              if (var5 == 1) {
                break L1;
              } else {
                if (var5 == 2) {
                  break L1;
                } else {
                  if (4 != var5) {
                    if (var5 != 3) {
                      if (var5 != 6) {
                        if (var5 == 5) {
                          ii.field_r[ki.field_c[((sl) this).field_m]].e(param0, param1);
                          break L0;
                        } else {
                          break L0;
                        }
                      } else {
                        ii.field_r[ki.field_c[((sl) this).field_m]].f(param0, param1);
                        break L0;
                      }
                    } else {
                      ii.field_r[ri.field_H[((sl) this).field_m]].e(param0, param1);
                      break L0;
                    }
                  } else {
                    ii.field_r[ri.field_H[((sl) this).field_m]].g(param0, param1);
                    break L0;
                  }
                }
              }
            }
            ii.field_r[param3].e(param0, param1);
            break L0;
          }
        }
        L2: {
          if (param2 == 0) {
            break L2;
          } else {
            ((sl) this).a(false, 1);
            break L2;
          }
        }
    }

    void a(boolean param0, int param1) {
        if (param1 < 72) {
            return;
        }
        ((sl) this).field_h = ((sl) this).field_h + 1;
    }

    final static th a(int param0, int param1) {
        th var2 = new th();
        fh.field_b.a((byte) -122, (fc) (Object) var2);
        nk.a(4, -108);
        return var2;
    }

    final static void b(byte param0) {
    }

    final static nl a(Throwable param0, String param1) {
        nl var2 = null;
        if (!(param0 instanceof nl)) {
            var2 = new nl(param0, param1);
        } else {
            var2 = (nl) (Object) param0;
            var2.field_a = var2.field_a + ' ' + param1;
        }
        return var2;
    }

    final void a(int param0, byte param1, int param2) {
        qj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        qj var11 = null;
        var10 = TrackController.field_F ? 1 : 0;
        var11 = nd.field_L[4];
        var4 = var11;
        cl.a(nd.field_L, -10 + param0, 228, param2 - 10, 176, 4);
        if (param1 <= 0) {
          nd.field_L[4] = var11;
          ll.a(nd.field_F);
          ll.b(param0, param2, param0 + 156, param2 + 208);
          cl.a(nd.field_L, param0 - 10, 228, -10 + param2, 176, 4);
          var5 = ((sl) this).field_c + param2;
          var6 = 0;
          L0: while (true) {
            if (8 <= var6) {
              ll.b(nd.field_F);
              return;
            } else {
              var7 = param0 + ((sl) this).field_k;
              var8 = 0;
              L1: while (true) {
                if (var8 >= 6) {
                  var5 += 26;
                  var6++;
                  continue L0;
                } else {
                  var9 = ((sl) this).field_i[var6][var8];
                  if (var9 >= 7) {
                    if (var9 < 38) {
                      ii.field_r[var9].e(var7, var5);
                      var7 += 26;
                      var8++;
                      continue L1;
                    } else {
                      var7 += 26;
                      var8++;
                      continue L1;
                    }
                  } else {
                    var7 += 26;
                    var8++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    sl(boolean param0, int param1, int param2) {
        ((sl) this).field_c = 0;
        ((sl) this).field_f = param2;
        ((sl) this).field_k = 0;
        ((sl) this).field_g = param0 ? true : false;
        ((sl) this).field_a = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new aa(8, 0, 4, 1);
    }
}
