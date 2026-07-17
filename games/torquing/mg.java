/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static gd field_b;
    static double[][] field_a;

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        if (param1 == 100) {
          if (gl.field_q > 0) {
            int fieldTemp$79 = gl.field_q - 1;
            gl.field_q = gl.field_q - 1;
            var2 = mb.field_b[fieldTemp$79];
            mb.field_b[gl.field_q] = null;
            return var2;
          } else {
            if (5000 != param1) {
              if (param1 != 30000) {
                if (null != l.field_d) {
                  var2_int = 0;
                  L0: while (true) {
                    if (rf.field_r.length <= var2_int) {
                      return new byte[param1];
                    } else {
                      L1: {
                        if (rf.field_r[var2_int] != param1) {
                          var2_int++;
                          break L1;
                        } else {
                          if (ke.field_a[var2_int] <= 0) {
                            break L1;
                          } else {
                            ke.field_a[var2_int] = ke.field_a[var2_int] - 1;
                            var3 = l.field_d[var2_int][ke.field_a[var2_int] - 1];
                            l.field_d[var2_int][ke.field_a[var2_int]] = null;
                            return var3;
                          }
                        }
                      }
                      var2_int++;
                      continue L0;
                    }
                  }
                } else {
                  return new byte[param1];
                }
              } else {
                if (d.field_s > 0) {
                  int fieldTemp$80 = d.field_s - 1;
                  d.field_s = d.field_s - 1;
                  var2 = lk.field_t[fieldTemp$80];
                  lk.field_t[d.field_s] = null;
                  return var2;
                } else {
                  if (null != l.field_d) {
                    var2_int = 0;
                    L2: while (true) {
                      if (rf.field_r.length <= var2_int) {
                        return new byte[param1];
                      } else {
                        L3: {
                          if (rf.field_r[var2_int] != param1) {
                            var2_int++;
                            break L3;
                          } else {
                            if (ke.field_a[var2_int] <= 0) {
                              break L3;
                            } else {
                              ke.field_a[var2_int] = ke.field_a[var2_int] - 1;
                              var3 = l.field_d[var2_int][ke.field_a[var2_int] - 1];
                              l.field_d[var2_int][ke.field_a[var2_int]] = null;
                              return var3;
                            }
                          }
                        }
                        var2_int++;
                        continue L2;
                      }
                    }
                  } else {
                    return new byte[param1];
                  }
                }
              }
            } else {
              if (ok.field_E > 0) {
                int fieldTemp$81 = ok.field_E - 1;
                ok.field_E = ok.field_E - 1;
                var2 = pd.field_b[fieldTemp$81];
                pd.field_b[ok.field_E] = null;
                return var2;
              } else {
                if (param1 != 30000) {
                  if (null != l.field_d) {
                    var2_int = 0;
                    L4: while (true) {
                      if (rf.field_r.length <= var2_int) {
                        return new byte[param1];
                      } else {
                        L5: {
                          if (rf.field_r[var2_int] != param1) {
                            var2_int++;
                            break L5;
                          } else {
                            if (ke.field_a[var2_int] <= 0) {
                              break L5;
                            } else {
                              ke.field_a[var2_int] = ke.field_a[var2_int] - 1;
                              var3 = l.field_d[var2_int][ke.field_a[var2_int] - 1];
                              l.field_d[var2_int][ke.field_a[var2_int]] = null;
                              return var3;
                            }
                          }
                        }
                        var2_int++;
                        continue L4;
                      }
                    }
                  } else {
                    return new byte[param1];
                  }
                } else {
                  if (d.field_s > 0) {
                    int fieldTemp$82 = d.field_s - 1;
                    d.field_s = d.field_s - 1;
                    var2 = lk.field_t[fieldTemp$82];
                    lk.field_t[d.field_s] = null;
                    return var2;
                  } else {
                    L6: {
                      if (null != l.field_d) {
                        var2_int = 0;
                        if (rf.field_r.length <= var2_int) {
                          break L6;
                        } else {
                          L7: {
                            if (rf.field_r[var2_int] != param1) {
                              var2_int++;
                              break L7;
                            } else {
                              if (ke.field_a[var2_int] <= 0) {
                                var2_int++;
                                break L7;
                              } else {
                                ke.field_a[var2_int] = ke.field_a[var2_int] - 1;
                                var3 = l.field_d[var2_int][ke.field_a[var2_int] - 1];
                                l.field_d[var2_int][ke.field_a[var2_int]] = null;
                                return var3;
                              }
                            }
                          }
                          var2_int++;
                          var2_int++;
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    return new byte[param1];
                  }
                }
              }
            }
          }
        } else {
          if (5000 != param1) {
            if (param1 != 30000) {
              if (null != l.field_d) {
                L8: {
                  var2_int = 0;
                  if (rf.field_r.length <= var2_int) {
                    break L8;
                  } else {
                    L9: {
                      if (rf.field_r[var2_int] != param1) {
                        var2_int++;
                        break L9;
                      } else {
                        if (ke.field_a[var2_int] <= 0) {
                          var2_int++;
                          break L9;
                        } else {
                          ke.field_a[var2_int] = ke.field_a[var2_int] - 1;
                          var3 = l.field_d[var2_int][ke.field_a[var2_int] - 1];
                          l.field_d[var2_int][ke.field_a[var2_int]] = null;
                          return var3;
                        }
                      }
                    }
                    var2_int++;
                    var2_int++;
                    break L8;
                  }
                }
                return new byte[param1];
              } else {
                return new byte[param1];
              }
            } else {
              if (d.field_s > 0) {
                int fieldTemp$83 = d.field_s - 1;
                d.field_s = d.field_s - 1;
                var2 = lk.field_t[fieldTemp$83];
                lk.field_t[d.field_s] = null;
                return var2;
              } else {
                L10: {
                  if (null != l.field_d) {
                    var2_int = 0;
                    if (rf.field_r.length <= var2_int) {
                      break L10;
                    } else {
                      L11: {
                        if (rf.field_r[var2_int] != param1) {
                          var2_int++;
                          break L11;
                        } else {
                          if (ke.field_a[var2_int] <= 0) {
                            var2_int++;
                            break L11;
                          } else {
                            ke.field_a[var2_int] = ke.field_a[var2_int] - 1;
                            var3 = l.field_d[var2_int][ke.field_a[var2_int] - 1];
                            l.field_d[var2_int][ke.field_a[var2_int]] = null;
                            return var3;
                          }
                        }
                      }
                      var2_int++;
                      var2_int++;
                      var2_int++;
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
                return new byte[param1];
              }
            }
          } else {
            if (ok.field_E > 0) {
              int fieldTemp$84 = ok.field_E - 1;
              ok.field_E = ok.field_E - 1;
              var2 = pd.field_b[fieldTemp$84];
              pd.field_b[ok.field_E] = null;
              return var2;
            } else {
              L12: {
                if (param1 != 30000) {
                  break L12;
                } else {
                  if (d.field_s > 0) {
                    int fieldTemp$85 = d.field_s - 1;
                    d.field_s = d.field_s - 1;
                    var2 = lk.field_t[fieldTemp$85];
                    lk.field_t[d.field_s] = null;
                    return var2;
                  } else {
                    break L12;
                  }
                }
              }
              L13: {
                if (null != l.field_d) {
                  var2_int = 0;
                  if (rf.field_r.length <= var2_int) {
                    break L13;
                  } else {
                    L14: {
                      if (rf.field_r[var2_int] != param1) {
                        var2_int++;
                        break L14;
                      } else {
                        if (ke.field_a[var2_int] <= 0) {
                          var2_int++;
                          break L14;
                        } else {
                          ke.field_a[var2_int] = ke.field_a[var2_int] - 1;
                          var3 = l.field_d[var2_int][ke.field_a[var2_int] - 1];
                          l.field_d[var2_int][ke.field_a[var2_int]] = null;
                          return var3;
                        }
                      }
                    }
                    var2_int++;
                    var2_int++;
                    var2_int++;
                    break L13;
                  }
                } else {
                  break L13;
                }
              }
              return new byte[param1];
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, vh param4, int param5, String param6, int param7, int param8) {
        tl.field_u = param7;
        um.field_r = param1;
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
            throw rb.a((Throwable) (Object) runtimeException, "mg.A(" + -1 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    public static void a() {
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
