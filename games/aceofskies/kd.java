/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    private static String field_z;

    final synchronized static byte[] a(int param0, byte param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (100 == param0) {
          if (0 >= ki.field_e) {
            if (param1 >= 110) {
              if (5000 != param0) {
                if ((param0 ^ -1) != -30001) {
                  if (null != lm.field_c) {
                    var2 = 0;
                    L0: while (true) {
                      if (te.field_g.length <= var2) {
                        return new byte[param0];
                      } else {
                        if (param0 != te.field_g[var2]) {
                          var2++;
                          var2++;
                          continue L0;
                        } else {
                          if (0 < bb.field_m[var2]) {
                            bb.field_m[var2] = bb.field_m[var2] - 1;
                            var3 = lm.field_c[var2][bb.field_m[var2] - 1];
                            lm.field_c[var2][bb.field_m[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L0;
                          }
                        }
                      }
                    }
                  } else {
                    return new byte[param0];
                  }
                } else {
                  if ((rm.field_e ^ -1) >= -1) {
                    if (null != lm.field_c) {
                      var2 = 0;
                      L1: while (true) {
                        if (te.field_g.length > var2) {
                          if (param0 != te.field_g[var2]) {
                            var2++;
                            var2++;
                            continue L1;
                          } else {
                            if (0 < bb.field_m[var2]) {
                              bb.field_m[var2] = bb.field_m[var2] - 1;
                              var3 = lm.field_c[var2][bb.field_m[var2] - 1];
                              lm.field_c[var2][bb.field_m[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              continue L1;
                            }
                          }
                        } else {
                          return new byte[param0];
                        }
                      }
                    } else {
                      return new byte[param0];
                    }
                  } else {
                    rm.field_e = rm.field_e - 1;
                    var2_ref_byte__ = fb.field_d[rm.field_e - 1];
                    fb.field_d[rm.field_e] = null;
                    return var2_ref_byte__;
                  }
                }
              } else {
                if (fa.field_a <= 0) {
                  L2: {
                    if ((param0 ^ -1) != -30001) {
                      break L2;
                    } else {
                      if ((rm.field_e ^ -1) < -1) {
                        rm.field_e = rm.field_e - 1;
                        var2_ref_byte__ = fb.field_d[rm.field_e - 1];
                        fb.field_d[rm.field_e] = null;
                        return var2_ref_byte__;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (null != lm.field_c) {
                    var2 = 0;
                    L3: while (true) {
                      if (te.field_g.length > var2) {
                        if (param0 != te.field_g[var2]) {
                          var2++;
                          var2++;
                          continue L3;
                        } else {
                          if (0 < bb.field_m[var2]) {
                            bb.field_m[var2] = bb.field_m[var2] - 1;
                            var3 = lm.field_c[var2][bb.field_m[var2] - 1];
                            lm.field_c[var2][bb.field_m[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L3;
                          }
                        }
                      } else {
                        return new byte[param0];
                      }
                    }
                  } else {
                    return new byte[param0];
                  }
                } else {
                  fa.field_a = fa.field_a - 1;
                  var2_ref_byte__ = tq.field_f[fa.field_a - 1];
                  tq.field_f[fa.field_a] = null;
                  return var2_ref_byte__;
                }
              }
            } else {
              L4: {
                byte[] discarded$27 = kd.a(-122, (byte) 55);
                if (5000 != param0) {
                  break L4;
                } else {
                  if (fa.field_a > 0) {
                    fa.field_a = fa.field_a - 1;
                    var2_ref_byte__ = tq.field_f[fa.field_a - 1];
                    tq.field_f[fa.field_a] = null;
                    return var2_ref_byte__;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if ((param0 ^ -1) != -30001) {
                  break L5;
                } else {
                  if ((rm.field_e ^ -1) < -1) {
                    rm.field_e = rm.field_e - 1;
                    var2_ref_byte__ = fb.field_d[rm.field_e - 1];
                    fb.field_d[rm.field_e] = null;
                    return var2_ref_byte__;
                  } else {
                    break L5;
                  }
                }
              }
              if (null != lm.field_c) {
                var2 = 0;
                L6: while (true) {
                  if (te.field_g.length > var2) {
                    if (param0 != te.field_g[var2]) {
                      var2++;
                      var2++;
                      continue L6;
                    } else {
                      if (0 < bb.field_m[var2]) {
                        bb.field_m[var2] = bb.field_m[var2] - 1;
                        var3 = lm.field_c[var2][bb.field_m[var2] - 1];
                        lm.field_c[var2][bb.field_m[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L6;
                      }
                    }
                  } else {
                    return new byte[param0];
                  }
                }
              } else {
                return new byte[param0];
              }
            }
          } else {
            ki.field_e = ki.field_e - 1;
            var2_ref_byte__ = pg.field_c[ki.field_e - 1];
            pg.field_c[ki.field_e] = null;
            return var2_ref_byte__;
          }
        } else {
          if (param1 >= 110) {
            if (5000 != param0) {
              if ((param0 ^ -1) != -30001) {
                if (null != lm.field_c) {
                  var2 = 0;
                  if (te.field_g.length > var2) {
                    if (param0 == te.field_g[var2]) {
                      if (0 < bb.field_m[var2]) {
                        bb.field_m[var2] = bb.field_m[var2] - 1;
                        var3 = lm.field_c[var2][bb.field_m[var2] - 1];
                        lm.field_c[var2][bb.field_m[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        var2++;
                        var2++;
                        return new byte[param0];
                      }
                    } else {
                      var2++;
                      var2++;
                      var2++;
                      return new byte[param0];
                    }
                  } else {
                    return new byte[param0];
                  }
                } else {
                  return new byte[param0];
                }
              } else {
                if ((rm.field_e ^ -1) >= -1) {
                  if (null != lm.field_c) {
                    var2 = 0;
                    if (te.field_g.length > var2) {
                      if (param0 == te.field_g[var2]) {
                        if (0 < bb.field_m[var2]) {
                          bb.field_m[var2] = bb.field_m[var2] - 1;
                          var3 = lm.field_c[var2][bb.field_m[var2] - 1];
                          lm.field_c[var2][bb.field_m[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          var2++;
                          var2++;
                          return new byte[param0];
                        }
                      } else {
                        var2++;
                        var2++;
                        var2++;
                        return new byte[param0];
                      }
                    } else {
                      return new byte[param0];
                    }
                  } else {
                    return new byte[param0];
                  }
                } else {
                  rm.field_e = rm.field_e - 1;
                  var2_ref_byte__ = fb.field_d[rm.field_e - 1];
                  fb.field_d[rm.field_e] = null;
                  return var2_ref_byte__;
                }
              }
            } else {
              if (fa.field_a <= 0) {
                L7: {
                  if ((param0 ^ -1) != -30001) {
                    break L7;
                  } else {
                    if ((rm.field_e ^ -1) < -1) {
                      rm.field_e = rm.field_e - 1;
                      var2_ref_byte__ = fb.field_d[rm.field_e - 1];
                      fb.field_d[rm.field_e] = null;
                      return var2_ref_byte__;
                    } else {
                      break L7;
                    }
                  }
                }
                if (null != lm.field_c) {
                  var2 = 0;
                  if (te.field_g.length > var2) {
                    if (param0 == te.field_g[var2]) {
                      if (0 < bb.field_m[var2]) {
                        bb.field_m[var2] = bb.field_m[var2] - 1;
                        var3 = lm.field_c[var2][bb.field_m[var2] - 1];
                        lm.field_c[var2][bb.field_m[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        return new byte[param0];
                      }
                    } else {
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      return new byte[param0];
                    }
                  } else {
                    return new byte[param0];
                  }
                } else {
                  return new byte[param0];
                }
              } else {
                fa.field_a = fa.field_a - 1;
                var2_ref_byte__ = tq.field_f[fa.field_a - 1];
                tq.field_f[fa.field_a] = null;
                return var2_ref_byte__;
              }
            }
          } else {
            L8: {
              byte[] discarded$28 = kd.a(-122, (byte) 55);
              if (5000 != param0) {
                break L8;
              } else {
                if (fa.field_a > 0) {
                  fa.field_a = fa.field_a - 1;
                  var2_ref_byte__ = tq.field_f[fa.field_a - 1];
                  tq.field_f[fa.field_a] = null;
                  return var2_ref_byte__;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if ((param0 ^ -1) != -30001) {
                break L9;
              } else {
                if ((rm.field_e ^ -1) < -1) {
                  rm.field_e = rm.field_e - 1;
                  var2_ref_byte__ = fb.field_d[rm.field_e - 1];
                  fb.field_d[rm.field_e] = null;
                  return var2_ref_byte__;
                } else {
                  break L9;
                }
              }
            }
            if (null != lm.field_c) {
              var2 = 0;
              if (te.field_g.length > var2) {
                if (param0 == te.field_g[var2]) {
                  if (0 < bb.field_m[var2]) {
                    bb.field_m[var2] = bb.field_m[var2] - 1;
                    var3 = lm.field_c[var2][bb.field_m[var2] - 1];
                    lm.field_c[var2][bb.field_m[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    return new byte[param0];
                  }
                } else {
                  var2++;
                  var2++;
                  var2++;
                  var2++;
                  return new byte[param0];
                }
              } else {
                return new byte[param0];
              }
            } else {
              return new byte[param0];
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "kd.A(";
    }
}
