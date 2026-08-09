/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static gd field_b;
    static double[][] field_a;

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$2 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        int dupTemp$8 = 0;
        byte[][] arrayValue$9 = null;
        int dupTemp$10 = 0;
        byte[][] arrayValue$11 = null;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int dupTemp$16 = 0;
        byte[][] arrayValue$17 = null;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int dupTemp$21 = 0;
        byte[][] arrayValue$22 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        if (param0 < -46) {
          L0: {
            if (-101 != (param1 ^ -1)) {
              break L0;
            } else {
              if ((gl.field_q ^ -1) >= -1) {
                break L0;
              } else {
                fieldTemp$2 = gl.field_q - 1;
                gl.field_q = gl.field_q - 1;
                var2_ref_byte__ = mb.field_b[fieldTemp$2];
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
                        dupTemp$3 = ke.field_a[var2] - 1;
                        arrayValue$4 = l.field_d[var2];
                        ke.field_a[var2] = dupTemp$3;
                        var3 = arrayValue$4[dupTemp$3];
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
                fieldTemp$5 = d.field_s - 1;
                d.field_s = d.field_s - 1;
                var2_ref_byte__ = lk.field_t[fieldTemp$5];
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
                          dupTemp$6 = ke.field_a[var2] - 1;
                          arrayValue$7 = l.field_d[var2];
                          ke.field_a[var2] = dupTemp$6;
                          var3 = arrayValue$7[dupTemp$6];
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
                          dupTemp$8 = ke.field_a[var2] - 1;
                          arrayValue$9 = l.field_d[var2];
                          ke.field_a[var2] = dupTemp$8;
                          var3 = arrayValue$9[dupTemp$8];
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
                              dupTemp$10 = ke.field_a[var2] - 1;
                              arrayValue$11 = l.field_d[var2];
                              ke.field_a[var2] = dupTemp$10;
                              var3 = arrayValue$11[dupTemp$10];
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
                  fieldTemp$12 = d.field_s - 1;
                  d.field_s = d.field_s - 1;
                  var2_ref_byte__ = lk.field_t[fieldTemp$12];
                  lk.field_t[d.field_s] = null;
                  return var2_ref_byte__;
                }
              }
            } else {
              fieldTemp$13 = ok.field_E - 1;
              ok.field_E = ok.field_E - 1;
              var2_ref_byte__ = pd.field_b[fieldTemp$13];
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
                    fieldTemp$14 = ok.field_E - 1;
                    ok.field_E = ok.field_E - 1;
                    var2_ref_byte__ = pd.field_b[fieldTemp$14];
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
                    fieldTemp$15 = d.field_s - 1;
                    d.field_s = d.field_s - 1;
                    var2_ref_byte__ = lk.field_t[fieldTemp$15];
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
                        dupTemp$16 = ke.field_a[var2] - 1;
                        arrayValue$17 = l.field_d[var2];
                        ke.field_a[var2] = dupTemp$16;
                        var3 = arrayValue$17[dupTemp$16];
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
              fieldTemp$18 = gl.field_q - 1;
              gl.field_q = gl.field_q - 1;
              var2_ref_byte__ = mb.field_b[fieldTemp$18];
              mb.field_b[gl.field_q] = null;
              return var2_ref_byte__;
            }
          } else {
            L9: {
              if (5000 != param1) {
                break L9;
              } else {
                if (ok.field_E > 0) {
                  fieldTemp$19 = ok.field_E - 1;
                  ok.field_E = ok.field_E - 1;
                  var2_ref_byte__ = pd.field_b[fieldTemp$19];
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
                  fieldTemp$20 = d.field_s - 1;
                  d.field_s = d.field_s - 1;
                  var2_ref_byte__ = lk.field_t[fieldTemp$20];
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
                      dupTemp$21 = ke.field_a[var2] - 1;
                      arrayValue$22 = l.field_d[var2];
                      ke.field_a[var2] = dupTemp$21;
                      var3 = arrayValue$22[dupTemp$21];
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
