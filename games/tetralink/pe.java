/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static int[] field_a;

    final synchronized static byte[] a(int param0, byte param1) {
        int fieldTemp$39 = 0;
        int fieldTemp$40 = 0;
        int fieldTemp$41 = 0;
        int fieldTemp$42 = 0;
        int fieldTemp$43 = 0;
        int fieldTemp$44 = 0;
        int fieldTemp$45 = 0;
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
                        if (param0 == ed.field_V[var2]) {
                          if (0 < im.field_d[var2]) {
                            im.field_d[var2] = im.field_d[var2] - 1;
                            var3 = rk.field_c[var2][im.field_d[var2] - 1];
                            rk.field_c[var2][im.field_d[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L0;
                          }
                        } else {
                          var2++;
                          continue L0;
                        }
                      }
                    }
                  } else {
                    return new byte[param0];
                  }
                } else {
                  if ((uf.field_e ^ -1) >= -1) {
                    if (rk.field_c != null) {
                      var2 = 0;
                      L1: while (true) {
                        if (ed.field_V.length <= var2) {
                          return new byte[param0];
                        } else {
                          if (param0 == ed.field_V[var2]) {
                            if (0 < im.field_d[var2]) {
                              im.field_d[var2] = im.field_d[var2] - 1;
                              var3 = rk.field_c[var2][im.field_d[var2] - 1];
                              rk.field_c[var2][im.field_d[var2]] = null;
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
                      return new byte[param0];
                    }
                  } else {
                    fieldTemp$39 = uf.field_e - 1;
                    uf.field_e = uf.field_e - 1;
                    var2_ref_byte__ = ng.field_q[fieldTemp$39];
                    ng.field_q[uf.field_e] = null;
                    return var2_ref_byte__;
                  }
                }
              } else {
                if (0 >= ae.field_L) {
                  if ((param0 ^ -1) != -30001) {
                    if (rk.field_c != null) {
                      var2 = 0;
                      L2: while (true) {
                        if (ed.field_V.length > var2) {
                          if (param0 == ed.field_V[var2]) {
                            if (0 < im.field_d[var2]) {
                              im.field_d[var2] = im.field_d[var2] - 1;
                              var3 = rk.field_c[var2][im.field_d[var2] - 1];
                              rk.field_c[var2][im.field_d[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              continue L2;
                            }
                          } else {
                            var2++;
                            continue L2;
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
                      if (rk.field_c != null) {
                        var2 = 0;
                        L3: while (true) {
                          if (ed.field_V.length > var2) {
                            if (param0 == ed.field_V[var2]) {
                              if (0 < im.field_d[var2]) {
                                im.field_d[var2] = im.field_d[var2] - 1;
                                var3 = rk.field_c[var2][im.field_d[var2] - 1];
                                rk.field_c[var2][im.field_d[var2]] = null;
                                return var3;
                              } else {
                                var2++;
                                continue L3;
                              }
                            } else {
                              var2++;
                              continue L3;
                            }
                          } else {
                            return new byte[param0];
                          }
                        }
                      } else {
                        return new byte[param0];
                      }
                    } else {
                      fieldTemp$40 = uf.field_e - 1;
                      uf.field_e = uf.field_e - 1;
                      var2_ref_byte__ = ng.field_q[fieldTemp$40];
                      ng.field_q[uf.field_e] = null;
                      return var2_ref_byte__;
                    }
                  }
                } else {
                  fieldTemp$41 = ae.field_L - 1;
                  ae.field_L = ae.field_L - 1;
                  var2_ref_byte__ = bg.field_j[fieldTemp$41];
                  bg.field_j[ae.field_L] = null;
                  return var2_ref_byte__;
                }
              }
            } else {
              fieldTemp$42 = nn.field_cb - 1;
              nn.field_cb = nn.field_cb - 1;
              var2_ref_byte__ = d.field_f[fieldTemp$42];
              d.field_f[nn.field_cb] = null;
              return var2_ref_byte__;
            }
          } else {
            if (5000 != param0) {
              if ((param0 ^ -1) != -30001) {
                if (rk.field_c != null) {
                  var2 = 0;
                  L4: while (true) {
                    if (ed.field_V.length > var2) {
                      if (param0 == ed.field_V[var2]) {
                        if (0 < im.field_d[var2]) {
                          im.field_d[var2] = im.field_d[var2] - 1;
                          var3 = rk.field_c[var2][im.field_d[var2] - 1];
                          rk.field_c[var2][im.field_d[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L4;
                        }
                      } else {
                        var2++;
                        continue L4;
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
                  if (rk.field_c != null) {
                    var2 = 0;
                    L5: while (true) {
                      if (ed.field_V.length > var2) {
                        if (param0 == ed.field_V[var2]) {
                          if (0 < im.field_d[var2]) {
                            im.field_d[var2] = im.field_d[var2] - 1;
                            var3 = rk.field_c[var2][im.field_d[var2] - 1];
                            rk.field_c[var2][im.field_d[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L5;
                          }
                        } else {
                          var2++;
                          continue L5;
                        }
                      } else {
                        return new byte[param0];
                      }
                    }
                  } else {
                    return new byte[param0];
                  }
                } else {
                  fieldTemp$43 = uf.field_e - 1;
                  uf.field_e = uf.field_e - 1;
                  var2_ref_byte__ = ng.field_q[fieldTemp$43];
                  ng.field_q[uf.field_e] = null;
                  return var2_ref_byte__;
                }
              }
            } else {
              if (0 >= ae.field_L) {
                L6: {
                  if ((param0 ^ -1) != -30001) {
                    break L6;
                  } else {
                    if ((uf.field_e ^ -1) < -1) {
                      fieldTemp$44 = uf.field_e - 1;
                      uf.field_e = uf.field_e - 1;
                      var2_ref_byte__ = ng.field_q[fieldTemp$44];
                      ng.field_q[uf.field_e] = null;
                      return var2_ref_byte__;
                    } else {
                      break L6;
                    }
                  }
                }
                if (rk.field_c != null) {
                  var2 = 0;
                  L7: while (true) {
                    if (ed.field_V.length > var2) {
                      if (param0 == ed.field_V[var2]) {
                        if (0 < im.field_d[var2]) {
                          im.field_d[var2] = im.field_d[var2] - 1;
                          var3 = rk.field_c[var2][im.field_d[var2] - 1];
                          rk.field_c[var2][im.field_d[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L7;
                        }
                      } else {
                        var2++;
                        continue L7;
                      }
                    } else {
                      return new byte[param0];
                    }
                  }
                } else {
                  return new byte[param0];
                }
              } else {
                fieldTemp$45 = ae.field_L - 1;
                ae.field_L = ae.field_L - 1;
                var2_ref_byte__ = bg.field_j[fieldTemp$45];
                bg.field_j[ae.field_L] = null;
                return var2_ref_byte__;
              }
            }
          }
        } else {
          return (byte[]) null;
        }
    }

    final static void a(byte param0) {
        ph.field_w = kb.field_q.g((byte) 81);
        if (param0 < 18) {
            return;
        }
        CharSequence var2 = (CharSequence) ((Object) ph.field_w);
        ik.field_f = cc.a(var2, (byte) 105);
    }

    public static void a(boolean param0) {
        byte[] discarded$0 = null;
        field_a = null;
        if (!param0) {
            discarded$0 = pe.a(80, (byte) 40);
        }
    }

    static {
        field_a = new int[8192];
    }
}
