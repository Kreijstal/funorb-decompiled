/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    final synchronized static byte[] a(byte param0, int param1) {
        int var2 = 0;
        byte[] var2_ref_byte__ = null;
        byte[] var3_ref_byte__ = null;
        int var3 = 0;
        byte[] var4 = null;
        if (param1 != 100) {
          if (param1 != 5000) {
            L0: {
              var2 = 0;
              if (param1 != 30000) {
                break L0;
              } else {
                if (ff.field_b <= 0) {
                  break L0;
                } else {
                  byte[][] fieldTemp$300 = qa.field_b;
                  int fieldTemp$301 = ff.field_b - 1;
                  ff.field_b = ff.field_b - 1;
                  var3_ref_byte__ = fieldTemp$300[fieldTemp$301];
                  qa.field_b[ff.field_b] = null;
                  return var3_ref_byte__;
                }
              }
            }
            if (dk.field_d != null) {
              var3 = 0;
              L1: while (true) {
                if (~qe.field_a.length >= ~var3) {
                  return new byte[param1];
                } else {
                  L2: {
                    if (~param1 != ~qe.field_a[var3]) {
                      var3++;
                      break L2;
                    } else {
                      if (qk.field_a[var3] <= 0) {
                        break L2;
                      } else {
                        qk.field_a[var3] = qk.field_a[var3] - 1;
                        var4 = dk.field_d[var3][qk.field_a[var3] - 1];
                        dk.field_d[var3][qk.field_a[var3]] = null;
                        return var4;
                      }
                    }
                  }
                  var3++;
                  continue L1;
                }
              }
            } else {
              return new byte[param1];
            }
          } else {
            if (qg.field_f > 0) {
              int fieldTemp$302 = qg.field_f - 1;
              qg.field_f = qg.field_f - 1;
              var2_ref_byte__ = tm.field_u[fieldTemp$302];
              tm.field_u[qg.field_f] = null;
              return var2_ref_byte__;
            } else {
              L3: {
                var2 = 0;
                if (param1 != 30000) {
                  break L3;
                } else {
                  if (ff.field_b <= 0) {
                    break L3;
                  } else {
                    byte[][] fieldTemp$303 = qa.field_b;
                    int fieldTemp$304 = ff.field_b - 1;
                    ff.field_b = ff.field_b - 1;
                    var3_ref_byte__ = fieldTemp$303[fieldTemp$304];
                    qa.field_b[ff.field_b] = null;
                    return var3_ref_byte__;
                  }
                }
              }
              if (dk.field_d != null) {
                var3 = 0;
                L4: while (true) {
                  if (~qe.field_a.length >= ~var3) {
                    return new byte[param1];
                  } else {
                    L5: {
                      if (~param1 != ~qe.field_a[var3]) {
                        var3++;
                        break L5;
                      } else {
                        if (qk.field_a[var3] <= 0) {
                          break L5;
                        } else {
                          qk.field_a[var3] = qk.field_a[var3] - 1;
                          var4 = dk.field_d[var3][qk.field_a[var3] - 1];
                          dk.field_d[var3][qk.field_a[var3]] = null;
                          return var4;
                        }
                      }
                    }
                    var3++;
                    continue L4;
                  }
                }
              } else {
                return new byte[param1];
              }
            }
          }
        } else {
          if (qh.field_e > 0) {
            byte[][] fieldTemp$305 = oe.field_e;
            int fieldTemp$306 = qh.field_e - 1;
            qh.field_e = qh.field_e - 1;
            var2_ref_byte__ = fieldTemp$305[fieldTemp$306];
            oe.field_e[qh.field_e] = null;
            return var2_ref_byte__;
          } else {
            if (param1 == 5000) {
              if (qg.field_f > 0) {
                int fieldTemp$307 = qg.field_f - 1;
                qg.field_f = qg.field_f - 1;
                var2_ref_byte__ = tm.field_u[fieldTemp$307];
                tm.field_u[qg.field_f] = null;
                return var2_ref_byte__;
              } else {
                var2 = 0;
                if (param1 == 30000) {
                  if (ff.field_b <= 0) {
                    if (dk.field_d != null) {
                      var3 = 0;
                      L6: while (true) {
                        if (~qe.field_a.length >= ~var3) {
                          return new byte[param1];
                        } else {
                          L7: {
                            if (~param1 != ~qe.field_a[var3]) {
                              var3++;
                              break L7;
                            } else {
                              if (qk.field_a[var3] <= 0) {
                                break L7;
                              } else {
                                qk.field_a[var3] = qk.field_a[var3] - 1;
                                var4 = dk.field_d[var3][qk.field_a[var3] - 1];
                                dk.field_d[var3][qk.field_a[var3]] = null;
                                return var4;
                              }
                            }
                          }
                          var3++;
                          continue L6;
                        }
                      }
                    } else {
                      return new byte[param1];
                    }
                  } else {
                    byte[][] fieldTemp$308 = qa.field_b;
                    int fieldTemp$309 = ff.field_b - 1;
                    ff.field_b = ff.field_b - 1;
                    var3_ref_byte__ = fieldTemp$308[fieldTemp$309];
                    qa.field_b[ff.field_b] = null;
                    return var3_ref_byte__;
                  }
                } else {
                  if (dk.field_d != null) {
                    var3 = 0;
                    L8: while (true) {
                      if (~qe.field_a.length >= ~var3) {
                        return new byte[param1];
                      } else {
                        L9: {
                          if (~param1 != ~qe.field_a[var3]) {
                            var3++;
                            break L9;
                          } else {
                            if (qk.field_a[var3] <= 0) {
                              break L9;
                            } else {
                              qk.field_a[var3] = qk.field_a[var3] - 1;
                              var4 = dk.field_d[var3][qk.field_a[var3] - 1];
                              dk.field_d[var3][qk.field_a[var3]] = null;
                              return var4;
                            }
                          }
                        }
                        var3++;
                        continue L8;
                      }
                    }
                  } else {
                    return new byte[param1];
                  }
                }
              }
            } else {
              L10: {
                var2 = 0;
                if (param1 != 30000) {
                  break L10;
                } else {
                  if (ff.field_b <= 0) {
                    break L10;
                  } else {
                    byte[][] fieldTemp$310 = qa.field_b;
                    int fieldTemp$311 = ff.field_b - 1;
                    ff.field_b = ff.field_b - 1;
                    var3_ref_byte__ = fieldTemp$310[fieldTemp$311];
                    qa.field_b[ff.field_b] = null;
                    return var3_ref_byte__;
                  }
                }
              }
              L11: {
                if (dk.field_d != null) {
                  var3 = 0;
                  if (~qe.field_a.length >= ~var3) {
                    break L11;
                  } else {
                    L12: {
                      if (~param1 != ~qe.field_a[var3]) {
                        var3++;
                        break L12;
                      } else {
                        if (qk.field_a[var3] <= 0) {
                          var3++;
                          break L12;
                        } else {
                          qk.field_a[var3] = qk.field_a[var3] - 1;
                          var4 = dk.field_d[var3][qk.field_a[var3] - 1];
                          dk.field_d[var3][qk.field_a[var3]] = null;
                          return var4;
                        }
                      }
                    }
                    var3++;
                    var3++;
                    var3++;
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
              return new byte[param1];
            }
          }
        }
    }

    final static byte[] b(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
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
            stackOut_0_0 = fa.field_d.a(param1, 0, "");
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("lh.A(").append(-1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("lh.B(").append(-18473).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    static {
    }
}
