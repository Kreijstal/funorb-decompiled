/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    final synchronized static byte[] a(byte param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3_ref_byte__ = null;
        int var3 = 0;
        byte[] var4 = null;
        if (-101 != (param1 ^ -1)) {
          if (param1 != 5000) {
            L0: {
              var2 = -83 % ((-16 - param0) / 34);
              if (-30001 != param1) {
                break L0;
              } else {
                if (-1 >= ff.field_b) {
                  break L0;
                } else {
                  ff.field_b = ff.field_b - 1;
                  var3_ref_byte__ = qa.field_b[ff.field_b - 1];
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
                  if (param1 != qe.field_a[var3]) {
                    var3++;
                    var3++;
                    continue L1;
                  } else {
                    if (qk.field_a[var3] > 0) {
                      qk.field_a[var3] = qk.field_a[var3] - 1;
                      var4 = dk.field_d[var3][qk.field_a[var3] - 1];
                      dk.field_d[var3][qk.field_a[var3]] = null;
                      return var4;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              return new byte[param1];
            }
          } else {
            if (qg.field_f > 0) {
              qg.field_f = qg.field_f - 1;
              var2_ref_byte__ = tm.field_u[qg.field_f - 1];
              tm.field_u[qg.field_f] = null;
              return var2_ref_byte__;
            } else {
              L2: {
                var2 = -83 % ((-16 - param0) / 34);
                if (-30001 != param1) {
                  break L2;
                } else {
                  if (-1 >= ff.field_b) {
                    break L2;
                  } else {
                    ff.field_b = ff.field_b - 1;
                    var3_ref_byte__ = qa.field_b[ff.field_b - 1];
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
                    if (param1 != qe.field_a[var3]) {
                      var3++;
                      var3++;
                      continue L3;
                    } else {
                      if (qk.field_a[var3] > 0) {
                        qk.field_a[var3] = qk.field_a[var3] - 1;
                        var4 = dk.field_d[var3][qk.field_a[var3] - 1];
                        dk.field_d[var3][qk.field_a[var3]] = null;
                        return var4;
                      } else {
                        var3++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                return new byte[param1];
              }
            }
          }
        } else {
          if (qh.field_e >= -1) {
            if (param1 == 5000) {
              if (qg.field_f > 0) {
                qg.field_f = qg.field_f - 1;
                var2_ref_byte__ = tm.field_u[qg.field_f - 1];
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
                          if (param1 != qe.field_a[var3]) {
                            var3++;
                            var3++;
                            continue L4;
                          } else {
                            if (qk.field_a[var3] > 0) {
                              qk.field_a[var3] = qk.field_a[var3] - 1;
                              var4 = dk.field_d[var3][qk.field_a[var3] - 1];
                              dk.field_d[var3][qk.field_a[var3]] = null;
                              return var4;
                            } else {
                              var3++;
                              continue L4;
                            }
                          }
                        }
                      }
                    } else {
                      return new byte[param1];
                    }
                  } else {
                    ff.field_b = ff.field_b - 1;
                    var3_ref_byte__ = qa.field_b[ff.field_b - 1];
                    qa.field_b[ff.field_b] = null;
                    return var3_ref_byte__;
                  }
                } else {
                  if (dk.field_d != null) {
                    var3 = 0;
                    L5: while (true) {
                      if (qe.field_a.length > var3) {
                        if (param1 != qe.field_a[var3]) {
                          var3++;
                          var3++;
                          continue L5;
                        } else {
                          if (qk.field_a[var3] > 0) {
                            qk.field_a[var3] = qk.field_a[var3] - 1;
                            var4 = dk.field_d[var3][qk.field_a[var3] - 1];
                            dk.field_d[var3][qk.field_a[var3]] = null;
                            return var4;
                          } else {
                            var3++;
                            continue L5;
                          }
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
                if (-30001 != param1) {
                  break L6;
                } else {
                  if (-1 <= (ff.field_b ^ -1)) {
                    break L6;
                  } else {
                    ff.field_b = ff.field_b - 1;
                    var3_ref_byte__ = qa.field_b[ff.field_b - 1];
                    qa.field_b[ff.field_b] = null;
                    return var3_ref_byte__;
                  }
                }
              }
              if (dk.field_d != null) {
                var3 = 0;
                if (qe.field_a.length > var3) {
                  if (param1 == qe.field_a[var3]) {
                    if (qk.field_a[var3] > 0) {
                      qk.field_a[var3] = qk.field_a[var3] - 1;
                      var4 = dk.field_d[var3][qk.field_a[var3] - 1];
                      dk.field_d[var3][qk.field_a[var3]] = null;
                      return var4;
                    } else {
                      var3++;
                      var3++;
                      var3++;
                      var3++;
                      return new byte[param1];
                    }
                  } else {
                    var3++;
                    var3++;
                    var3++;
                    var3++;
                    return new byte[param1];
                  }
                } else {
                  return new byte[param1];
                }
              } else {
                return new byte[param1];
              }
            }
          } else {
            qh.field_e = qh.field_e - 1;
            var2_ref_byte__ = oe.field_e[qh.field_e - 1];
            oe.field_e[qh.field_e] = null;
            return var2_ref_byte__;
          }
        }
    }

    final static byte[] b(int param0, String param1) {
        Object var3 = null;
        if (param0 != -1) {
          var3 = null;
          lh.a(94, (String) null);
          return fa.field_d.a(param1, param0 ^ -1, "");
        } else {
          return fa.field_d.a(param1, param0 ^ -1, "");
        }
    }

    final static void a(int param0, String param1) {
        ag.field_d = param1;
        if (param0 != -18473) {
            return;
        }
    }

    static {
    }
}
