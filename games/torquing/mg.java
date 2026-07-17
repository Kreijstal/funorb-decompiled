/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static gd field_b;
    static double[][] field_a;

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (param0 < -46) {
          L0: {
            if (param1 != 100) {
              break L0;
            } else {
              if (gl.field_q <= 0) {
                break L0;
              } else {
                int fieldTemp$29 = gl.field_q - 1;
                gl.field_q = gl.field_q - 1;
                var2_ref_byte__ = mb.field_b[fieldTemp$29];
                mb.field_b[gl.field_q] = null;
                return var2_ref_byte__;
              }
            }
          }
          if (5000 != param1) {
            if (param1 != 30000) {
              if (null != l.field_d) {
                var2 = 0;
                L1: while (true) {
                  if (rf.field_r.length <= var2) {
                    return new byte[param1];
                  } else {
                    if (rf.field_r[var2] != param1) {
                      var2++;
                      var2++;
                      continue L1;
                    } else {
                      if (ke.field_a[var2] > 0) {
                        ke.field_a[var2] = ke.field_a[var2] - 1;
                        var3 = l.field_d[var2][ke.field_a[var2] - 1];
                        l.field_d[var2][ke.field_a[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                return new byte[param1];
              }
            } else {
              if (d.field_s > 0) {
                int fieldTemp$30 = d.field_s - 1;
                d.field_s = d.field_s - 1;
                var2_ref_byte__ = lk.field_t[fieldTemp$30];
                lk.field_t[d.field_s] = null;
                return var2_ref_byte__;
              } else {
                if (null != l.field_d) {
                  var2 = 0;
                  L2: while (true) {
                    if (rf.field_r.length <= var2) {
                      return new byte[param1];
                    } else {
                      if (rf.field_r[var2] != param1) {
                        var2++;
                        var2++;
                        continue L2;
                      } else {
                        if (ke.field_a[var2] > 0) {
                          ke.field_a[var2] = ke.field_a[var2] - 1;
                          var3 = l.field_d[var2][ke.field_a[var2] - 1];
                          l.field_d[var2][ke.field_a[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L2;
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
            if (ok.field_E <= 0) {
              if (param1 != 30000) {
                if (null != l.field_d) {
                  var2 = 0;
                  L3: while (true) {
                    if (rf.field_r.length <= var2) {
                      return new byte[param1];
                    } else {
                      if (rf.field_r[var2] != param1) {
                        var2++;
                        var2++;
                        continue L3;
                      } else {
                        if (ke.field_a[var2] > 0) {
                          ke.field_a[var2] = ke.field_a[var2] - 1;
                          var3 = l.field_d[var2][ke.field_a[var2] - 1];
                          l.field_d[var2][ke.field_a[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  return new byte[param1];
                }
              } else {
                if (d.field_s > 0) {
                  int fieldTemp$31 = d.field_s - 1;
                  d.field_s = d.field_s - 1;
                  var2_ref_byte__ = lk.field_t[fieldTemp$31];
                  lk.field_t[d.field_s] = null;
                  return var2_ref_byte__;
                } else {
                  L4: {
                    if (null != l.field_d) {
                      var2 = 0;
                      L5: while (true) {
                        if (rf.field_r.length <= var2) {
                          break L4;
                        } else {
                          if (rf.field_r[var2] != param1) {
                            var2++;
                            var2++;
                            continue L5;
                          } else {
                            if (ke.field_a[var2] > 0) {
                              ke.field_a[var2] = ke.field_a[var2] - 1;
                              var3 = l.field_d[var2][ke.field_a[var2] - 1];
                              l.field_d[var2][ke.field_a[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              continue L5;
                            }
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  return new byte[param1];
                }
              }
            } else {
              int fieldTemp$32 = ok.field_E - 1;
              ok.field_E = ok.field_E - 1;
              var2_ref_byte__ = pd.field_b[fieldTemp$32];
              pd.field_b[ok.field_E] = null;
              return var2_ref_byte__;
            }
          }
        } else {
          field_b = null;
          if (param1 == 100) {
            if (gl.field_q <= 0) {
              L6: {
                if (5000 != param1) {
                  break L6;
                } else {
                  if (ok.field_E > 0) {
                    int fieldTemp$33 = ok.field_E - 1;
                    ok.field_E = ok.field_E - 1;
                    var2_ref_byte__ = pd.field_b[fieldTemp$33];
                    pd.field_b[ok.field_E] = null;
                    return var2_ref_byte__;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (param1 != 30000) {
                  break L7;
                } else {
                  if (d.field_s > 0) {
                    int fieldTemp$34 = d.field_s - 1;
                    d.field_s = d.field_s - 1;
                    var2_ref_byte__ = lk.field_t[fieldTemp$34];
                    lk.field_t[d.field_s] = null;
                    return var2_ref_byte__;
                  } else {
                    break L7;
                  }
                }
              }
              if (null != l.field_d) {
                var2 = 0;
                L8: while (true) {
                  if (rf.field_r.length > var2) {
                    if (rf.field_r[var2] != param1) {
                      var2++;
                      var2++;
                      continue L8;
                    } else {
                      if (ke.field_a[var2] > 0) {
                        ke.field_a[var2] = ke.field_a[var2] - 1;
                        var3 = l.field_d[var2][ke.field_a[var2] - 1];
                        l.field_d[var2][ke.field_a[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L8;
                      }
                    }
                  } else {
                    return new byte[param1];
                  }
                }
              } else {
                return new byte[param1];
              }
            } else {
              int fieldTemp$35 = gl.field_q - 1;
              gl.field_q = gl.field_q - 1;
              var2_ref_byte__ = mb.field_b[fieldTemp$35];
              mb.field_b[gl.field_q] = null;
              return var2_ref_byte__;
            }
          } else {
            L9: {
              if (5000 != param1) {
                break L9;
              } else {
                if (ok.field_E > 0) {
                  int fieldTemp$36 = ok.field_E - 1;
                  ok.field_E = ok.field_E - 1;
                  var2_ref_byte__ = pd.field_b[fieldTemp$36];
                  pd.field_b[ok.field_E] = null;
                  return var2_ref_byte__;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (param1 != 30000) {
                break L10;
              } else {
                if (d.field_s > 0) {
                  int fieldTemp$37 = d.field_s - 1;
                  d.field_s = d.field_s - 1;
                  var2_ref_byte__ = lk.field_t[fieldTemp$37];
                  lk.field_t[d.field_s] = null;
                  return var2_ref_byte__;
                } else {
                  break L10;
                }
              }
            }
            if (null != l.field_d) {
              var2 = 0;
              if (rf.field_r.length > var2) {
                if (rf.field_r[var2] == param1) {
                  if (ke.field_a[var2] > 0) {
                    ke.field_a[var2] = ke.field_a[var2] - 1;
                    var3 = l.field_d[var2][ke.field_a[var2] - 1];
                    l.field_d[var2][ke.field_a[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    return new byte[param1];
                  }
                } else {
                  var2++;
                  var2++;
                  var2++;
                  var2++;
                  return new byte[param1];
                }
              } else {
                return new byte[param1];
              }
            } else {
              return new byte[param1];
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, vh param4, int param5, String param6, int param7, int param8) {
        tl.field_u = param7;
        um.field_r = param1;
        if (param0 != -1) {
            return;
        }
        try {
            gi.field_c = param3;
            gf.field_g = param2;
            hq.field_a = param4;
            eg.field_x = param5;
            qg.field_A = param8;
            cl.field_d = param6;
            nn.field_c = (jp) (Object) new fh();
            gh.field_a = new co(param4);
            no.field_n = new bo(nn.field_c, gh.field_a);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "mg.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new double[9][9];
        field_b = new gd();
    }
}
