/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static int[] field_a;

    final synchronized static byte[] a(int param0, byte param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (param1 == -2) {
          if (param0 == 100) {
            if (0 >= nn.field_cb) {
              if (5000 != param0) {
                if ((param0 ^ -1) != -30001) {
                  if (rk.field_c != null) {
                    var2 = 0;
                    L0: while (true) {
                      if (ed.field_V.length <= var2) {
                        return new byte[param0];
                      } else {
                        if (param0 != ed.field_V[var2]) {
                          var2++;
                          var2++;
                          continue L0;
                        } else {
                          if (0 < im.field_d[var2]) {
                            im.field_d[var2] = im.field_d[var2] - 1;
                            var3 = rk.field_c[var2][im.field_d[var2] - 1];
                            rk.field_c[var2][im.field_d[var2]] = null;
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
                  if ((uf.field_e ^ -1) < -1) {
                    uf.field_e = uf.field_e - 1;
                    var2_ref_byte__ = ng.field_q[uf.field_e - 1];
                    ng.field_q[uf.field_e] = null;
                    return var2_ref_byte__;
                  } else {
                    if (rk.field_c != null) {
                      var2 = 0;
                      L1: while (true) {
                        if (ed.field_V.length <= var2) {
                          return new byte[param0];
                        } else {
                          if (param0 != ed.field_V[var2]) {
                            var2++;
                            var2++;
                            continue L1;
                          } else {
                            if (0 < im.field_d[var2]) {
                              im.field_d[var2] = im.field_d[var2] - 1;
                              var3 = rk.field_c[var2][im.field_d[var2] - 1];
                              rk.field_c[var2][im.field_d[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              continue L1;
                            }
                          }
                        }
                      }
                    } else {
                      return new byte[param0];
                    }
                  }
                }
              } else {
                if (0 >= ae.field_L) {
                  if ((param0 ^ -1) != -30001) {
                    if (rk.field_c != null) {
                      var2 = 0;
                      L2: while (true) {
                        if (ed.field_V.length > var2) {
                          if (param0 != ed.field_V[var2]) {
                            var2++;
                            var2++;
                            continue L2;
                          } else {
                            if (0 < im.field_d[var2]) {
                              im.field_d[var2] = im.field_d[var2] - 1;
                              var3 = rk.field_c[var2][im.field_d[var2] - 1];
                              rk.field_c[var2][im.field_d[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              continue L2;
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
                    if ((uf.field_e ^ -1) >= -1) {
                      L3: {
                        if (rk.field_c != null) {
                          var2 = 0;
                          if (ed.field_V.length > var2) {
                            if (param0 == ed.field_V[var2]) {
                              if (0 < im.field_d[var2]) {
                                im.field_d[var2] = im.field_d[var2] - 1;
                                var3 = rk.field_c[var2][im.field_d[var2] - 1];
                                rk.field_c[var2][im.field_d[var2]] = null;
                                return var3;
                              } else {
                                var2++;
                                var2++;
                                var2++;
                                break L3;
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
                          break L3;
                        }
                      }
                      return new byte[param0];
                    } else {
                      uf.field_e = uf.field_e - 1;
                      var2_ref_byte__ = ng.field_q[uf.field_e - 1];
                      ng.field_q[uf.field_e] = null;
                      return var2_ref_byte__;
                    }
                  }
                } else {
                  ae.field_L = ae.field_L - 1;
                  var2_ref_byte__ = bg.field_j[ae.field_L - 1];
                  bg.field_j[ae.field_L] = null;
                  return var2_ref_byte__;
                }
              }
            } else {
              nn.field_cb = nn.field_cb - 1;
              var2_ref_byte__ = d.field_f[nn.field_cb - 1];
              d.field_f[nn.field_cb] = null;
              return var2_ref_byte__;
            }
          } else {
            if (5000 != param0) {
              if ((param0 ^ -1) != -30001) {
                if (rk.field_c != null) {
                  var2 = 0;
                  if (ed.field_V.length > var2) {
                    if (param0 == ed.field_V[var2]) {
                      if (0 < im.field_d[var2]) {
                        im.field_d[var2] = im.field_d[var2] - 1;
                        var3 = rk.field_c[var2][im.field_d[var2] - 1];
                        rk.field_c[var2][im.field_d[var2]] = null;
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
                if ((uf.field_e ^ -1) >= -1) {
                  L4: {
                    if (rk.field_c != null) {
                      var2 = 0;
                      if (ed.field_V.length > var2) {
                        if (param0 == ed.field_V[var2]) {
                          if (0 < im.field_d[var2]) {
                            im.field_d[var2] = im.field_d[var2] - 1;
                            var3 = rk.field_c[var2][im.field_d[var2] - 1];
                            rk.field_c[var2][im.field_d[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            var2++;
                            var2++;
                            var2++;
                            break L4;
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
                      break L4;
                    }
                  }
                  return new byte[param0];
                } else {
                  uf.field_e = uf.field_e - 1;
                  var2_ref_byte__ = ng.field_q[uf.field_e - 1];
                  ng.field_q[uf.field_e] = null;
                  return var2_ref_byte__;
                }
              }
            } else {
              if (0 >= ae.field_L) {
                L5: {
                  if ((param0 ^ -1) != -30001) {
                    break L5;
                  } else {
                    if ((uf.field_e ^ -1) < -1) {
                      uf.field_e = uf.field_e - 1;
                      var2_ref_byte__ = ng.field_q[uf.field_e - 1];
                      ng.field_q[uf.field_e] = null;
                      return var2_ref_byte__;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (rk.field_c != null) {
                    var2 = 0;
                    if (ed.field_V.length > var2) {
                      if (param0 == ed.field_V[var2]) {
                        if (0 < im.field_d[var2]) {
                          im.field_d[var2] = im.field_d[var2] - 1;
                          var3 = rk.field_c[var2][im.field_d[var2] - 1];
                          rk.field_c[var2][im.field_d[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          var2++;
                          var2++;
                          var2++;
                          break L6;
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
                    break L6;
                  }
                }
                return new byte[param0];
              } else {
                ae.field_L = ae.field_L - 1;
                var2_ref_byte__ = bg.field_j[ae.field_L - 1];
                bg.field_j[ae.field_L] = null;
                return var2_ref_byte__;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0) {
        ph.field_w = kb.field_q.g((byte) 81);
        if (param0 < 18) {
            return;
        }
        CharSequence var2 = (CharSequence) (Object) ph.field_w;
        ik.field_f = cc.a(var2, (byte) 105);
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            byte[] discarded$0 = pe.a(80, (byte) 40);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
    }
}
