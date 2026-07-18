/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static float field_b;
    static String field_a;
    static String field_c;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
    }

    final synchronized static byte[] a(int param0, byte param1) {
        int var2 = 0;
        byte[] var2_ref_byte__ = null;
        byte[] var3_ref_byte__ = null;
        int var3 = 0;
        byte[] var4 = null;
        if (param0 != 100) {
          var2 = 1;
          if (param0 != 5000) {
            if (param0 != 30000) {
              L0: {
                if (null == ef.field_g) {
                  break L0;
                } else {
                  var3 = 0;
                  L1: while (true) {
                    if (ec.field_E.length <= var3) {
                      break L0;
                    } else {
                      L2: {
                        if (ec.field_E[var3] != param0) {
                          var3++;
                          break L2;
                        } else {
                          if (fb.field_f[var3] > 0) {
                            fb.field_f[var3] = fb.field_f[var3] - 1;
                            var4 = ef.field_g[var3][fb.field_f[var3] - 1];
                            ef.field_g[var3][fb.field_f[var3]] = null;
                            return var4;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
              return new byte[param0];
            } else {
              if (lf.field_d > 0) {
                int fieldTemp$223 = lf.field_d - 1;
                lf.field_d = lf.field_d - 1;
                var3_ref_byte__ = vf.field_c[fieldTemp$223];
                vf.field_c[lf.field_d] = null;
                return var3_ref_byte__;
              } else {
                L3: {
                  if (null == ef.field_g) {
                    break L3;
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (ec.field_E.length <= var3) {
                        break L3;
                      } else {
                        L5: {
                          if (ec.field_E[var3] != param0) {
                            var3++;
                            break L5;
                          } else {
                            if (fb.field_f[var3] > 0) {
                              fb.field_f[var3] = fb.field_f[var3] - 1;
                              var4 = ef.field_g[var3][fb.field_f[var3] - 1];
                              ef.field_g[var3][fb.field_f[var3]] = null;
                              return var4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
                return new byte[param0];
              }
            }
          } else {
            if (pd.field_C > 0) {
              int fieldTemp$224 = pd.field_C - 1;
              pd.field_C = pd.field_C - 1;
              var3_ref_byte__ = pe.field_a[fieldTemp$224];
              pe.field_a[pd.field_C] = null;
              return var3_ref_byte__;
            } else {
              if (param0 != 30000) {
                L6: {
                  if (null == ef.field_g) {
                    break L6;
                  } else {
                    var3 = 0;
                    L7: while (true) {
                      if (ec.field_E.length <= var3) {
                        break L6;
                      } else {
                        L8: {
                          if (ec.field_E[var3] != param0) {
                            var3++;
                            break L8;
                          } else {
                            if (fb.field_f[var3] > 0) {
                              fb.field_f[var3] = fb.field_f[var3] - 1;
                              var4 = ef.field_g[var3][fb.field_f[var3] - 1];
                              ef.field_g[var3][fb.field_f[var3]] = null;
                              return var4;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var3++;
                        continue L7;
                      }
                    }
                  }
                }
                return new byte[param0];
              } else {
                if (lf.field_d > 0) {
                  int fieldTemp$225 = lf.field_d - 1;
                  lf.field_d = lf.field_d - 1;
                  var3_ref_byte__ = vf.field_c[fieldTemp$225];
                  vf.field_c[lf.field_d] = null;
                  return var3_ref_byte__;
                } else {
                  if (null != ef.field_g) {
                    var3 = 0;
                    L9: while (true) {
                      if (ec.field_E.length > var3) {
                        L10: {
                          if (ec.field_E[var3] != param0) {
                            var3++;
                            break L10;
                          } else {
                            if (fb.field_f[var3] > 0) {
                              fb.field_f[var3] = fb.field_f[var3] - 1;
                              var4 = ef.field_g[var3][fb.field_f[var3] - 1];
                              ef.field_g[var3][fb.field_f[var3]] = null;
                              return var4;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var3++;
                        continue L9;
                      } else {
                        return new byte[param0];
                      }
                    }
                  } else {
                    return new byte[param0];
                  }
                }
              }
            }
          }
        } else {
          if (gg.field_Q > 0) {
            int fieldTemp$226 = gg.field_Q - 1;
            gg.field_Q = gg.field_Q - 1;
            var2_ref_byte__ = qh.field_b[fieldTemp$226];
            qh.field_b[gg.field_Q] = null;
            return var2_ref_byte__;
          } else {
            var2 = 1;
            if (param0 == 5000) {
              if (pd.field_C > 0) {
                int fieldTemp$227 = pd.field_C - 1;
                pd.field_C = pd.field_C - 1;
                var3_ref_byte__ = pe.field_a[fieldTemp$227];
                pe.field_a[pd.field_C] = null;
                return var3_ref_byte__;
              } else {
                if (param0 == 30000) {
                  if (lf.field_d > 0) {
                    int fieldTemp$228 = lf.field_d - 1;
                    lf.field_d = lf.field_d - 1;
                    var3_ref_byte__ = vf.field_c[fieldTemp$228];
                    vf.field_c[lf.field_d] = null;
                    return var3_ref_byte__;
                  } else {
                    if (null != ef.field_g) {
                      var3 = 0;
                      L11: while (true) {
                        if (ec.field_E.length > var3) {
                          L12: {
                            if (ec.field_E[var3] != param0) {
                              var3++;
                              break L12;
                            } else {
                              if (fb.field_f[var3] > 0) {
                                fb.field_f[var3] = fb.field_f[var3] - 1;
                                var4 = ef.field_g[var3][fb.field_f[var3] - 1];
                                ef.field_g[var3][fb.field_f[var3]] = null;
                                return var4;
                              } else {
                                break L12;
                              }
                            }
                          }
                          var3++;
                          continue L11;
                        } else {
                          return new byte[param0];
                        }
                      }
                    } else {
                      return new byte[param0];
                    }
                  }
                } else {
                  L13: {
                    if (null == ef.field_g) {
                      break L13;
                    } else {
                      var3 = 0;
                      L14: while (true) {
                        if (ec.field_E.length <= var3) {
                          break L13;
                        } else {
                          L15: {
                            if (ec.field_E[var3] != param0) {
                              var3++;
                              break L15;
                            } else {
                              if (fb.field_f[var3] > 0) {
                                fb.field_f[var3] = fb.field_f[var3] - 1;
                                var4 = ef.field_g[var3][fb.field_f[var3] - 1];
                                ef.field_g[var3][fb.field_f[var3]] = null;
                                return var4;
                              } else {
                                break L15;
                              }
                            }
                          }
                          var3++;
                          continue L14;
                        }
                      }
                    }
                  }
                  return new byte[param0];
                }
              }
            } else {
              L16: {
                if (param0 != 30000) {
                  break L16;
                } else {
                  if (lf.field_d > 0) {
                    int fieldTemp$229 = lf.field_d - 1;
                    lf.field_d = lf.field_d - 1;
                    var3_ref_byte__ = vf.field_c[fieldTemp$229];
                    vf.field_c[lf.field_d] = null;
                    return var3_ref_byte__;
                  } else {
                    break L16;
                  }
                }
              }
              L17: {
                if (null == ef.field_g) {
                  break L17;
                } else {
                  var3 = 0;
                  if (ec.field_E.length <= var3) {
                    break L17;
                  } else {
                    L18: {
                      if (ec.field_E[var3] != param0) {
                        var3++;
                        break L18;
                      } else {
                        if (fb.field_f[var3] > 0) {
                          fb.field_f[var3] = fb.field_f[var3] - 1;
                          var4 = ef.field_g[var3][fb.field_f[var3] - 1];
                          ef.field_g[var3][fb.field_f[var3]] = null;
                          return var4;
                        } else {
                          var3++;
                          break L18;
                        }
                      }
                    }
                    var3++;
                    var3++;
                    var3++;
                    break L17;
                  }
                }
              }
              return new byte[param0];
            }
          }
        }
    }

    final static hj[] a(boolean param0, int param1, int param2, int param3, int param4) {
        return kk.a(3, 1, 0, 1, (byte) 123, 0, 1, 0, 65793);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Log in";
        field_c = "BEAM BLAST";
    }
}
