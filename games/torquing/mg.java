/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static gd field_b;
    static double[][] field_a;

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$57 = 0;
        int fieldTemp$58 = 0;
        int fieldTemp$59 = 0;
        int fieldTemp$60 = 0;
        int fieldTemp$61 = 0;
        int fieldTemp$62 = 0;
        int fieldTemp$63 = 0;
        int fieldTemp$64 = 0;
        int fieldTemp$65 = 0;
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (param0 < -46) {
          L0: {
            if (-101 != (param1 ^ -1)) {
              break L0;
            } else {
              if ((gl.field_q ^ -1) >= -1) {
                break L0;
              } else {
                fieldTemp$57 = gl.field_q - 1;
                gl.field_q = gl.field_q - 1;
                var2_ref_byte__ = mb.field_b[fieldTemp$57];
                mb.field_b[gl.field_q] = null;
                return var2_ref_byte__;
              }
            }
          }
          if (5000 != param1) {
            if (-30001 != (param1 ^ -1)) {
              if (null != l.field_d) {
                var2 = 0;
                L1: while (true) {
                  if (rf.field_r.length <= var2) {
                    return new byte[param1];
                  } else {
                    if (rf.field_r[var2] == param1) {
                      if ((ke.field_a[var2] ^ -1) < -1) {
                        ke.field_a[var2] = ke.field_a[var2] - 1;
                        var3 = l.field_d[var2][ke.field_a[var2] - 1];
                        l.field_d[var2][ke.field_a[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L1;
                      }
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                }
              } else {
                return new byte[param1];
              }
            } else {
              if (d.field_s > 0) {
                fieldTemp$58 = d.field_s - 1;
                d.field_s = d.field_s - 1;
                var2_ref_byte__ = lk.field_t[fieldTemp$58];
                lk.field_t[d.field_s] = null;
                return var2_ref_byte__;
              } else {
                if (null != l.field_d) {
                  var2 = 0;
                  L2: while (true) {
                    if (rf.field_r.length <= var2) {
                      return new byte[param1];
                    } else {
                      if (rf.field_r[var2] == param1) {
                        if ((ke.field_a[var2] ^ -1) < -1) {
                          ke.field_a[var2] = ke.field_a[var2] - 1;
                          var3 = l.field_d[var2][ke.field_a[var2] - 1];
                          l.field_d[var2][ke.field_a[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L2;
                        }
                      } else {
                        var2++;
                        continue L2;
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
              if (-30001 != (param1 ^ -1)) {
                if (null != l.field_d) {
                  var2 = 0;
                  L3: while (true) {
                    if (rf.field_r.length <= var2) {
                      return new byte[param1];
                    } else {
                      if (rf.field_r[var2] == param1) {
                        if ((ke.field_a[var2] ^ -1) < -1) {
                          ke.field_a[var2] = ke.field_a[var2] - 1;
                          var3 = l.field_d[var2][ke.field_a[var2] - 1];
                          l.field_d[var2][ke.field_a[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L3;
                        }
                      } else {
                        var2++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  return new byte[param1];
                }
              } else {
                if (d.field_s <= 0) {
                  L4: {
                    if (null != l.field_d) {
                      var2 = 0;
                      L5: while (true) {
                        if (rf.field_r.length <= var2) {
                          break L4;
                        } else {
                          if (rf.field_r[var2] == param1) {
                            if ((ke.field_a[var2] ^ -1) < -1) {
                              ke.field_a[var2] = ke.field_a[var2] - 1;
                              var3 = l.field_d[var2][ke.field_a[var2] - 1];
                              l.field_d[var2][ke.field_a[var2]] = null;
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
                    } else {
                      break L4;
                    }
                  }
                  return new byte[param1];
                } else {
                  fieldTemp$59 = d.field_s - 1;
                  d.field_s = d.field_s - 1;
                  var2_ref_byte__ = lk.field_t[fieldTemp$59];
                  lk.field_t[d.field_s] = null;
                  return var2_ref_byte__;
                }
              }
            } else {
              fieldTemp$60 = ok.field_E - 1;
              ok.field_E = ok.field_E - 1;
              var2_ref_byte__ = pd.field_b[fieldTemp$60];
              pd.field_b[ok.field_E] = null;
              return var2_ref_byte__;
            }
          }
        } else {
          field_b = (gd) null;
          if (-101 == (param1 ^ -1)) {
            if ((gl.field_q ^ -1) >= -1) {
              L6: {
                if (5000 != param1) {
                  break L6;
                } else {
                  if (ok.field_E > 0) {
                    fieldTemp$61 = ok.field_E - 1;
                    ok.field_E = ok.field_E - 1;
                    var2_ref_byte__ = pd.field_b[fieldTemp$61];
                    pd.field_b[ok.field_E] = null;
                    return var2_ref_byte__;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (-30001 != (param1 ^ -1)) {
                  break L7;
                } else {
                  if (d.field_s > 0) {
                    fieldTemp$62 = d.field_s - 1;
                    d.field_s = d.field_s - 1;
                    var2_ref_byte__ = lk.field_t[fieldTemp$62];
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
                    if (rf.field_r[var2] == param1) {
                      if ((ke.field_a[var2] ^ -1) < -1) {
                        ke.field_a[var2] = ke.field_a[var2] - 1;
                        var3 = l.field_d[var2][ke.field_a[var2] - 1];
                        l.field_d[var2][ke.field_a[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L8;
                      }
                    } else {
                      var2++;
                      continue L8;
                    }
                  } else {
                    return new byte[param1];
                  }
                }
              } else {
                return new byte[param1];
              }
            } else {
              fieldTemp$63 = gl.field_q - 1;
              gl.field_q = gl.field_q - 1;
              var2_ref_byte__ = mb.field_b[fieldTemp$63];
              mb.field_b[gl.field_q] = null;
              return var2_ref_byte__;
            }
          } else {
            L9: {
              if (5000 != param1) {
                break L9;
              } else {
                if (ok.field_E > 0) {
                  fieldTemp$64 = ok.field_E - 1;
                  ok.field_E = ok.field_E - 1;
                  var2_ref_byte__ = pd.field_b[fieldTemp$64];
                  pd.field_b[ok.field_E] = null;
                  return var2_ref_byte__;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (-30001 != (param1 ^ -1)) {
                break L10;
              } else {
                if (d.field_s > 0) {
                  fieldTemp$65 = d.field_s - 1;
                  d.field_s = d.field_s - 1;
                  var2_ref_byte__ = lk.field_t[fieldTemp$65];
                  lk.field_t[d.field_s] = null;
                  return var2_ref_byte__;
                } else {
                  break L10;
                }
              }
            }
            if (null != l.field_d) {
              var2 = 0;
              L11: while (true) {
                if (rf.field_r.length > var2) {
                  if (rf.field_r[var2] == param1) {
                    if ((ke.field_a[var2] ^ -1) < -1) {
                      ke.field_a[var2] = ke.field_a[var2] - 1;
                      var3 = l.field_d[var2][ke.field_a[var2] - 1];
                      l.field_d[var2][ke.field_a[var2]] = null;
                      return var3;
                    } else {
                      var2++;
                      continue L11;
                    }
                  } else {
                    var2++;
                    continue L11;
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
            nn.field_c = (jp) ((Object) new fh());
            gh.field_a = new co(param4);
            no.field_n = new bo(nn.field_c, gh.field_a);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "mg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = (double[][]) null;
        if (param0 >= -23) {
            String var2 = (String) null;
            mg.a(-36, 74, 14, 75, (vh) null, 80, (String) null, -11, -19);
        }
    }

    static {
        field_a = new double[9][9];
        field_b = new gd();
    }
}
