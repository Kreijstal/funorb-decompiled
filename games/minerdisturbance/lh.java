/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    final synchronized static byte[] a(byte param0, int param1) {
        byte[][] fieldTemp$72 = null;
        int fieldTemp$73 = 0;
        int fieldTemp$74 = 0;
        byte[][] fieldTemp$75 = null;
        int fieldTemp$76 = 0;
        int fieldTemp$77 = 0;
        byte[][] fieldTemp$78 = null;
        int fieldTemp$79 = 0;
        byte[][] fieldTemp$80 = null;
        int fieldTemp$81 = 0;
        byte[][] fieldTemp$82 = null;
        int fieldTemp$83 = 0;
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3_ref_byte__ = null;
        int var3 = 0;
        byte[] var4 = null;
        if (-101 != (param1 ^ -1)) {
          if (param1 != 5000) {
            L0: {
              var2 = -83 % ((-16 - param0) / 34);
              if (-30001 != (param1 ^ -1)) {
                break L0;
              } else {
                if (-1 <= (ff.field_b ^ -1)) {
                  break L0;
                } else {
                  fieldTemp$72 = qa.field_b;
                  fieldTemp$73 = ff.field_b - 1;
                  ff.field_b = ff.field_b - 1;
                  var3_ref_byte__ = fieldTemp$72[fieldTemp$73];
                  qa.field_b[ff.field_b] = null;
                  return var3_ref_byte__;
                }
              }
            }
            if (dk.field_d != null) {
              var3 = 0;
              L1: while (true) {
                if (qe.field_a.length <= var3) {
                  return new byte[param1];
                } else {
                  if (param1 == qe.field_a[var3]) {
                    if (qk.field_a[var3] > 0) {
                      qk.field_a[var3] = qk.field_a[var3] - 1;
                      var4 = dk.field_d[var3][qk.field_a[var3] - 1];
                      dk.field_d[var3][qk.field_a[var3]] = null;
                      return var4;
                    } else {
                      var3++;
                      continue L1;
                    }
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            } else {
              return new byte[param1];
            }
          } else {
            if (qg.field_f > 0) {
              fieldTemp$74 = qg.field_f - 1;
              qg.field_f = qg.field_f - 1;
              var2_ref_byte__ = tm.field_u[fieldTemp$74];
              tm.field_u[qg.field_f] = null;
              return var2_ref_byte__;
            } else {
              L2: {
                var2 = -83 % ((-16 - param0) / 34);
                if (-30001 != (param1 ^ -1)) {
                  break L2;
                } else {
                  if (-1 <= (ff.field_b ^ -1)) {
                    break L2;
                  } else {
                    fieldTemp$75 = qa.field_b;
                    fieldTemp$76 = ff.field_b - 1;
                    ff.field_b = ff.field_b - 1;
                    var3_ref_byte__ = fieldTemp$75[fieldTemp$76];
                    qa.field_b[ff.field_b] = null;
                    return var3_ref_byte__;
                  }
                }
              }
              if (dk.field_d != null) {
                var3 = 0;
                L3: while (true) {
                  if (qe.field_a.length <= var3) {
                    return new byte[param1];
                  } else {
                    if (param1 == qe.field_a[var3]) {
                      if (qk.field_a[var3] > 0) {
                        qk.field_a[var3] = qk.field_a[var3] - 1;
                        var4 = dk.field_d[var3][qk.field_a[var3] - 1];
                        dk.field_d[var3][qk.field_a[var3]] = null;
                        return var4;
                      } else {
                        var3++;
                        continue L3;
                      }
                    } else {
                      var3++;
                      continue L3;
                    }
                  }
                }
              } else {
                return new byte[param1];
              }
            }
          }
        } else {
          if ((qh.field_e ^ -1) >= -1) {
            if (param1 == 5000) {
              if (qg.field_f > 0) {
                fieldTemp$77 = qg.field_f - 1;
                qg.field_f = qg.field_f - 1;
                var2_ref_byte__ = tm.field_u[fieldTemp$77];
                tm.field_u[qg.field_f] = null;
                return var2_ref_byte__;
              } else {
                var2 = -83 % ((-16 - param0) / 34);
                if (-30001 == (param1 ^ -1)) {
                  if (-1 <= (ff.field_b ^ -1)) {
                    if (dk.field_d != null) {
                      var3 = 0;
                      L4: while (true) {
                        if (qe.field_a.length <= var3) {
                          return new byte[param1];
                        } else {
                          if (param1 == qe.field_a[var3]) {
                            if (qk.field_a[var3] > 0) {
                              qk.field_a[var3] = qk.field_a[var3] - 1;
                              var4 = dk.field_d[var3][qk.field_a[var3] - 1];
                              dk.field_d[var3][qk.field_a[var3]] = null;
                              return var4;
                            } else {
                              var3++;
                              continue L4;
                            }
                          } else {
                            var3++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      return new byte[param1];
                    }
                  } else {
                    fieldTemp$78 = qa.field_b;
                    fieldTemp$79 = ff.field_b - 1;
                    ff.field_b = ff.field_b - 1;
                    var3_ref_byte__ = fieldTemp$78[fieldTemp$79];
                    qa.field_b[ff.field_b] = null;
                    return var3_ref_byte__;
                  }
                } else {
                  if (dk.field_d != null) {
                    var3 = 0;
                    L5: while (true) {
                      if (qe.field_a.length > var3) {
                        if (param1 == qe.field_a[var3]) {
                          if (qk.field_a[var3] > 0) {
                            qk.field_a[var3] = qk.field_a[var3] - 1;
                            var4 = dk.field_d[var3][qk.field_a[var3] - 1];
                            dk.field_d[var3][qk.field_a[var3]] = null;
                            return var4;
                          } else {
                            var3++;
                            continue L5;
                          }
                        } else {
                          var3++;
                          continue L5;
                        }
                      } else {
                        return new byte[param1];
                      }
                    }
                  } else {
                    return new byte[param1];
                  }
                }
              }
            } else {
              L6: {
                var2 = -83 % ((-16 - param0) / 34);
                if (-30001 != (param1 ^ -1)) {
                  break L6;
                } else {
                  if (-1 <= (ff.field_b ^ -1)) {
                    break L6;
                  } else {
                    fieldTemp$80 = qa.field_b;
                    fieldTemp$81 = ff.field_b - 1;
                    ff.field_b = ff.field_b - 1;
                    var3_ref_byte__ = fieldTemp$80[fieldTemp$81];
                    qa.field_b[ff.field_b] = null;
                    return var3_ref_byte__;
                  }
                }
              }
              if (dk.field_d != null) {
                var3 = 0;
                L7: while (true) {
                  if (qe.field_a.length > var3) {
                    if (param1 == qe.field_a[var3]) {
                      if (qk.field_a[var3] > 0) {
                        qk.field_a[var3] = qk.field_a[var3] - 1;
                        var4 = dk.field_d[var3][qk.field_a[var3] - 1];
                        dk.field_d[var3][qk.field_a[var3]] = null;
                        return var4;
                      } else {
                        var3++;
                        continue L7;
                      }
                    } else {
                      var3++;
                      continue L7;
                    }
                  } else {
                    return new byte[param1];
                  }
                }
              } else {
                return new byte[param1];
              }
            }
          } else {
            fieldTemp$82 = oe.field_e;
            fieldTemp$83 = qh.field_e - 1;
            qh.field_e = qh.field_e - 1;
            var2_ref_byte__ = fieldTemp$82[fieldTemp$83];
            oe.field_e[qh.field_e] = null;
            return var2_ref_byte__;
          }
        }
    }

    final static byte[] b(int param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
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
              if (param0 == -1) {
                break L1;
              } else {
                var3 = (String) null;
                lh.a(94, (String) null);
                break L1;
              }
            }
            stackOut_2_0 = fa.field_d.a(param1, param0 ^ -1, "");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("lh.A(").append(param0).append(',');
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
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        int decompiledRegionSelector0 = 0;
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
            ag.field_d = param1;
            if (param0 == -18473) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("lh.B(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
