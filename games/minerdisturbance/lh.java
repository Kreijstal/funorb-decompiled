/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    final synchronized static byte[] a(byte param0, int param1) {
        byte[][] fieldTemp$4 = null;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        int fieldTemp$8 = 0;
        byte[][] fieldTemp$9 = null;
        int fieldTemp$10 = 0;
        int dupTemp$11 = 0;
        byte[][] arrayValue$12 = null;
        int fieldTemp$13 = 0;
        int dupTemp$14 = 0;
        byte[][] arrayValue$15 = null;
        byte[][] fieldTemp$16 = null;
        int fieldTemp$17 = 0;
        int dupTemp$18 = 0;
        byte[][] arrayValue$19 = null;
        byte[][] fieldTemp$20 = null;
        int fieldTemp$21 = 0;
        int dupTemp$22 = 0;
        byte[][] arrayValue$23 = null;
        byte[][] fieldTemp$24 = null;
        int fieldTemp$25 = 0;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3_ref_byte__;
        int var3;
        byte[] var4;
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
                  fieldTemp$4 = qa.field_b;
                  fieldTemp$5 = ff.field_b - 1;
                  ff.field_b = ff.field_b - 1;
                  var3_ref_byte__ = fieldTemp$4[fieldTemp$5];
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
                      dupTemp$6 = qk.field_a[var3] - 1;
                      arrayValue$7 = dk.field_d[var3];
                      qk.field_a[var3] = dupTemp$6;
                      var4 = arrayValue$7[dupTemp$6];
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
              fieldTemp$8 = qg.field_f - 1;
              qg.field_f = qg.field_f - 1;
              var2_ref_byte__ = tm.field_u[fieldTemp$8];
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
                    fieldTemp$9 = qa.field_b;
                    fieldTemp$10 = ff.field_b - 1;
                    ff.field_b = ff.field_b - 1;
                    var3_ref_byte__ = fieldTemp$9[fieldTemp$10];
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
                        dupTemp$11 = qk.field_a[var3] - 1;
                        arrayValue$12 = dk.field_d[var3];
                        qk.field_a[var3] = dupTemp$11;
                        var4 = arrayValue$12[dupTemp$11];
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
                fieldTemp$13 = qg.field_f - 1;
                qg.field_f = qg.field_f - 1;
                var2_ref_byte__ = tm.field_u[fieldTemp$13];
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
                              dupTemp$14 = qk.field_a[var3] - 1;
                              arrayValue$15 = dk.field_d[var3];
                              qk.field_a[var3] = dupTemp$14;
                              var4 = arrayValue$15[dupTemp$14];
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
                    fieldTemp$16 = qa.field_b;
                    fieldTemp$17 = ff.field_b - 1;
                    ff.field_b = ff.field_b - 1;
                    var3_ref_byte__ = fieldTemp$16[fieldTemp$17];
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
                            dupTemp$18 = qk.field_a[var3] - 1;
                            arrayValue$19 = dk.field_d[var3];
                            qk.field_a[var3] = dupTemp$18;
                            var4 = arrayValue$19[dupTemp$18];
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
                    fieldTemp$20 = qa.field_b;
                    fieldTemp$21 = ff.field_b - 1;
                    ff.field_b = ff.field_b - 1;
                    var3_ref_byte__ = fieldTemp$20[fieldTemp$21];
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
                        dupTemp$22 = qk.field_a[var3] - 1;
                        arrayValue$23 = dk.field_d[var3];
                        qk.field_a[var3] = dupTemp$22;
                        var4 = arrayValue$23[dupTemp$22];
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
            fieldTemp$24 = oe.field_e;
            fieldTemp$25 = qh.field_e - 1;
            qh.field_e = qh.field_e - 1;
            var2_ref_byte__ = fieldTemp$24[fieldTemp$25];
            oe.field_e[qh.field_e] = null;
            return var2_ref_byte__;
          }
        }
    }

    final static byte[] b(int param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = fa.field_d.a(param1, param0 ^ -1, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("lh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("lh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
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
