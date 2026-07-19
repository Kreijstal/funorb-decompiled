/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static String field_b;
    static String field_c;
    static cn field_a;

    final static void a(byte param0) {
        byte[] discarded$1 = null;
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
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
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
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                var1_int = 0;
                var2 = 0;
                var3 = 0;
                if (param0 == -54) {
                  break L2;
                } else {
                  discarded$1 = jd.a(15, false);
                  break L2;
                }
              }
              var5_ref_oh = (oh) ((Object) wa.field_c.a(false));
              L3: while (true) {
                if (var5_ref_oh == null) {
                  var4 = 0;
                  var5_ref_oh = (oh) ((Object) si.field_u.a(false));
                  L4: while (true) {
                    if (var5_ref_oh == null) {
                      L5: {
                        var5 = (int)Math.sqrt((double)((var1_int - -var2) * 8));
                        if (var2 + var1_int == 0) {
                          stackOut_46_0 = 8192;
                          stackIn_47_0 = stackOut_46_0;
                          break L5;
                        } else {
                          stackOut_45_0 = var2 * 16384 / (var1_int - -var2);
                          stackIn_47_0 = stackOut_45_0;
                          break L5;
                        }
                      }
                      L6: {
                        var6 = stackIn_47_0;
                        var7 = var4 + var3 >> 965589224;
                        if (var4 + var3 != 0) {
                          stackOut_49_0 = 16384 * var4 / (var4 + var3);
                          stackIn_50_0 = stackOut_49_0;
                          break L6;
                        } else {
                          stackOut_48_0 = 8192;
                          stackIn_50_0 = stackOut_48_0;
                          break L6;
                        }
                      }
                      L7: {
                        var8 = stackIn_50_0;
                        if (mm.field_b == null) {
                          mm.field_b = hl.c(ob.field_d, 100, 0, var6);
                          vi.field_d = hl.c(pa.field_b, 100, 0, var8);
                          mm.field_b.h(-1);
                          vi.field_d.h(-1);
                          rk.field_e.a(mm.field_b);
                          rk.field_e.a(vi.field_d);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      mm.field_b.a(441, qm.field_c * var5 / 64, var6);
                      vi.field_d.a(441, var7 * qm.field_c / 64, var8);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L8: {
                        if ((var5_ref_oh.field_i ^ -1) > -1) {
                          break L8;
                        } else {
                          if (-641 >= (var5_ref_oh.field_i ^ -1)) {
                            break L8;
                          } else {
                            L9: {
                              var6 = var5_ref_oh.field_q;
                              if (0 <= var5_ref_oh.field_m) {
                                break L9;
                              } else {
                                var6 = var6 - var5_ref_oh.field_s;
                                break L9;
                              }
                            }
                            var7 = var6 - -var5_ref_oh.field_s;
                            var8 = var6;
                            L10: while (true) {
                              if (var8 >= var7) {
                                break L8;
                              } else {
                                if ((var8 ^ -1) <= -1) {
                                  if ((var8 ^ -1) > -481) {
                                    L11: {
                                      if (6324320 == em.field_i[var8 * 640 - -var5_ref_oh.field_i]) {
                                        var9 = 256 * var5_ref_oh.field_i / 640;
                                        var3 = var3 + (-var9 + 256);
                                        var4 = var4 + var9;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    var8 += 6;
                                    continue L10;
                                  } else {
                                    var8 += 6;
                                    continue L10;
                                  }
                                } else {
                                  var8 += 6;
                                  continue L10;
                                }
                              }
                            }
                          }
                        }
                      }
                      var5_ref_oh = (oh) ((Object) si.field_u.b((byte) 70));
                      continue L4;
                    }
                  }
                } else {
                  L12: {
                    if (var5_ref_oh.field_o < 100) {
                      break L12;
                    } else {
                      if ((var5_ref_oh.field_q ^ -1) > -1) {
                        break L12;
                      } else {
                        if (var5_ref_oh.field_q >= 480) {
                          break L12;
                        } else {
                          L13: {
                            var6 = 640 * var5_ref_oh.field_q;
                            var7 = var5_ref_oh.field_i;
                            if (-1 < (var5_ref_oh.field_m ^ -1)) {
                              var7 = var7 - var5_ref_oh.field_s;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          var8 = var7 + var5_ref_oh.field_s;
                          var9 = var7;
                          L14: while (true) {
                            if (var9 >= var8) {
                              break L12;
                            } else {
                              if ((var9 ^ -1) <= -1) {
                                if (640 > var9) {
                                  if (-6324321 == (em.field_i[var6 - -var9] ^ -1)) {
                                    var10 = 256 * var9 / 640;
                                    var1_int = var1_int + (-var10 + 256);
                                    var2 = var2 + var10;
                                    var9 += 6;
                                    continue L14;
                                  } else {
                                    var9 += 6;
                                    continue L14;
                                  }
                                } else {
                                  var9 += 6;
                                  continue L14;
                                }
                              } else {
                                var9 += 6;
                                continue L14;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var5_ref_oh = (oh) ((Object) wa.field_c.b((byte) 70));
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "jd.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        int var1 = 19 % ((-6 - param0) / 50);
        field_a = null;
        field_b = null;
    }

    final synchronized static byte[] a(int param0, boolean param1) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param0 != 100) {
            break L0;
          } else {
            if (0 < vi.field_b) {
              fieldTemp$6 = vi.field_b - 1;
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
          if ((param0 ^ -1) != -5001) {
            break L1;
          } else {
            if (qj.field_c <= 0) {
              break L1;
            } else {
              fieldTemp$7 = qj.field_c - 1;
              qj.field_c = qj.field_c - 1;
              var2_ref_byte__ = ok.field_d[fieldTemp$7];
              ok.field_d[qj.field_c] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (param1) {
            break L2;
          } else {
            field_a = (cn) null;
            break L2;
          }
        }
        L3: {
          if (-30001 != (param0 ^ -1)) {
            break L3;
          } else {
            if (bm.field_c > 0) {
              fieldTemp$8 = bm.field_c - 1;
              bm.field_c = bm.field_c - 1;
              var2_ref_byte__ = id.field_b[fieldTemp$8];
              id.field_b[bm.field_c] = null;
              return var2_ref_byte__;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (ve.field_n == null) {
            break L4;
          } else {
            var2 = 0;
            L5: while (true) {
              if (var2 >= rb.field_h.length) {
                break L4;
              } else {
                if (rb.field_h[var2] == param0) {
                  if (0 < nb.field_b[var2]) {
                    nb.field_b[var2] = nb.field_b[var2] - 1;
                    var3 = ve.field_n[var2][nb.field_b[var2] - 1];
                    ve.field_n[var2][nb.field_b[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L5;
                  }
                } else {
                  var2++;
                  continue L5;
                }
              }
            }
          }
        }
        return new byte[param0];
    }

    final static sn a(boolean param0) {
        if (param0) {
            jd.a((byte) -80);
        }
        String var1 = fl.e(0);
        if (var1 != null) {
            if (!(0 > var1.indexOf('@'))) {
                var1 = "";
            }
        }
        return new sn(fl.e(0), uf.c(62));
    }

    final static int a(ih param0, byte param1, String[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            if (param1 == -121) {
              var3_int = 0;
              var4 = param2;
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4.length) {
                  stackOut_7_0 = var3_int;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = var4[var5];
                  var3_int = var3_int + ic.a(var6, param1 ^ -16777096, param0);
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -57;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("jd.A(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    static {
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_c = "To Level";
    }
}
