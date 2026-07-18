/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static String field_b;
    static String field_c;
    static cn field_a;

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oh var5_ref_oh = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            if (!eh.field_k) {
              L1: {
                if (null != mm.field_b) {
                  mm.field_b.g(256);
                  vi.field_d.g(256);
                  mm.field_b = null;
                  vi.field_d = null;
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              var1_int = 0;
              var2 = 0;
              var3 = 0;
              var5_ref_oh = (oh) (Object) wa.field_c.a(false);
              L2: while (true) {
                if (var5_ref_oh == null) {
                  var4 = 0;
                  var5_ref_oh = (oh) (Object) si.field_u.a(false);
                  L3: while (true) {
                    if (var5_ref_oh == null) {
                      L4: {
                        var5 = (int)Math.sqrt((double)((var1_int - -var2) * 8));
                        if (var2 + var1_int == 0) {
                          stackOut_40_0 = 8192;
                          stackIn_41_0 = stackOut_40_0;
                          break L4;
                        } else {
                          stackOut_39_0 = var2 * 16384 / (var1_int - -var2);
                          stackIn_41_0 = stackOut_39_0;
                          break L4;
                        }
                      }
                      L5: {
                        var6 = stackIn_41_0;
                        var7 = var4 + var3 >> 8;
                        if (var4 + var3 != 0) {
                          stackOut_43_0 = 16384 * var4 / (var4 + var3);
                          stackIn_44_0 = stackOut_43_0;
                          break L5;
                        } else {
                          stackOut_42_0 = 8192;
                          stackIn_44_0 = stackOut_42_0;
                          break L5;
                        }
                      }
                      L6: {
                        var8 = stackIn_44_0;
                        if (mm.field_b == null) {
                          mm.field_b = hl.c(ob.field_d, 100, 0, var6);
                          vi.field_d = hl.c(pa.field_b, 100, 0, var8);
                          mm.field_b.h(-1);
                          vi.field_d.h(-1);
                          rk.field_e.a((wg) (Object) mm.field_b);
                          rk.field_e.a((wg) (Object) vi.field_d);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      mm.field_b.a(441, qm.field_c * var5 / 64, var6);
                      vi.field_d.a(441, var7 * qm.field_c / 64, var8);
                      break L0;
                    } else {
                      L7: {
                        if (var5_ref_oh.field_i < 0) {
                          break L7;
                        } else {
                          if (var5_ref_oh.field_i >= 640) {
                            break L7;
                          } else {
                            L8: {
                              var6 = var5_ref_oh.field_q;
                              if (0 <= var5_ref_oh.field_m) {
                                break L8;
                              } else {
                                var6 = var6 - var5_ref_oh.field_s;
                                break L8;
                              }
                            }
                            var7 = var6 - -var5_ref_oh.field_s;
                            var8 = var6;
                            L9: while (true) {
                              if (~var8 <= ~var7) {
                                break L7;
                              } else {
                                L10: {
                                  if (var8 < 0) {
                                    break L10;
                                  } else {
                                    if (var8 >= 480) {
                                      break L10;
                                    } else {
                                      if (6324320 == em.field_i[var8 * 640 - -var5_ref_oh.field_i]) {
                                        var9 = 256 * var5_ref_oh.field_i / 640;
                                        var3 = var3 + (-var9 + 256);
                                        var4 = var4 + var9;
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                var8 += 6;
                                continue L9;
                              }
                            }
                          }
                        }
                      }
                      var5_ref_oh = (oh) (Object) si.field_u.b((byte) 70);
                      continue L3;
                    }
                  }
                } else {
                  L11: {
                    if (var5_ref_oh.field_o < 100) {
                      break L11;
                    } else {
                      if (var5_ref_oh.field_q < 0) {
                        break L11;
                      } else {
                        if (var5_ref_oh.field_q >= 480) {
                          break L11;
                        } else {
                          L12: {
                            var6 = 640 * var5_ref_oh.field_q;
                            var7 = var5_ref_oh.field_i;
                            if (var5_ref_oh.field_m < 0) {
                              var7 = var7 - var5_ref_oh.field_s;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          var8 = var7 + var5_ref_oh.field_s;
                          var9 = var7;
                          L13: while (true) {
                            if (var9 >= var8) {
                              break L11;
                            } else {
                              L14: {
                                if (var9 < 0) {
                                  break L14;
                                } else {
                                  if (640 <= var9) {
                                    break L14;
                                  } else {
                                    if (em.field_i[var6 - -var9] != 6324320) {
                                      break L14;
                                    } else {
                                      var10 = 256 * var9 / 640;
                                      var1_int = var1_int + (-var10 + 256);
                                      var2 = var2 + var10;
                                      break L14;
                                    }
                                  }
                                }
                              }
                              var9 += 6;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                  }
                  var5_ref_oh = (oh) (Object) wa.field_c.b((byte) 70);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "jd.D(" + -54 + ')');
        }
    }

    public static void b() {
        field_c = null;
        int var1 = 0;
        field_a = null;
        field_b = null;
    }

    final synchronized static byte[] a(int param0) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param0 != 100) {
            break L0;
          } else {
            if (0 < vi.field_b) {
              int fieldTemp$6 = vi.field_b - 1;
              vi.field_b = vi.field_b - 1;
              var2_ref_byte__ = ei.field_l[fieldTemp$6];
              ei.field_l[vi.field_b] = null;
              return var2_ref_byte__;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 != 5000) {
            break L1;
          } else {
            if (qj.field_c <= 0) {
              break L1;
            } else {
              int fieldTemp$7 = qj.field_c - 1;
              qj.field_c = qj.field_c - 1;
              var2_ref_byte__ = ok.field_d[fieldTemp$7];
              ok.field_d[qj.field_c] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (param0 != 30000) {
            break L2;
          } else {
            if (bm.field_c > 0) {
              int fieldTemp$8 = bm.field_c - 1;
              bm.field_c = bm.field_c - 1;
              var2_ref_byte__ = id.field_b[fieldTemp$8];
              id.field_b[bm.field_c] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (ve.field_n == null) {
            break L3;
          } else {
            var2 = 0;
            L4: while (true) {
              if (var2 >= rb.field_h.length) {
                break L3;
              } else {
                if (rb.field_h[var2] == param0) {
                  if (0 < nb.field_b[var2]) {
                    nb.field_b[var2] = nb.field_b[var2] - 1;
                    var3 = ve.field_n[var2][nb.field_b[var2] - 1];
                    ve.field_n[var2][nb.field_b[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L4;
                  }
                } else {
                  var2++;
                  continue L4;
                }
              }
            }
          }
        }
        return new byte[param0];
    }

    final static sn a(boolean param0) {
        String var1 = fl.e(0);
        if (var1 != null) {
            if (!(0 > var1.indexOf('@'))) {
                var1 = "";
            }
        }
        int discarded$0 = 62;
        return new sn(fl.e(0), uf.c());
    }

    final static int a(ih param0, byte param1, String[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = 0;
            var4 = param2;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4.length) {
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var6 = var4[var5];
                var3_int = var3_int + ic.a(var6, 16777215, param0);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("jd.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(-121).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_c = "To Level";
    }
}
