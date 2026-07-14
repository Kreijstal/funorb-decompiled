/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un {
    static qt[] field_b;
    static r field_c;
    static cn field_d;
    static int[] field_a;
    static ml field_e;

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 106) {
            field_a = null;
        }
    }

    final static void a(nu param0, int param1, int param2) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        ae.field_G = param1;
        sh.field_a = param0;
        if (param2 <= 45) {
            return;
        }
        for (var3 = 0; var3 < 4; var3++) {
            mn.field_b[var3] = 0;
        }
    }

    final synchronized static byte[] a(int param0, boolean param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (!param1) {
          if (param0 != 100) {
            if (param0 != 5000) {
              L0: {
                if (30000 != param0) {
                  break L0;
                } else {
                  if (-1 <= (ep.field_d ^ -1)) {
                    break L0;
                  } else {
                    ep.field_d = ep.field_d - 1;
                    var2_ref_byte__ = vt.field_d[ep.field_d - 1];
                    vt.field_d[ep.field_d] = null;
                    return var2_ref_byte__;
                  }
                }
              }
              if (null != le.field_e) {
                var2 = 0;
                L1: while (true) {
                  if (us.field_i.length <= var2) {
                    return new byte[param0];
                  } else {
                    if (us.field_i[var2] != param0) {
                      var2++;
                      var2++;
                      continue L1;
                    } else {
                      if (uj.field_D[var2] > 0) {
                        uj.field_D[var2] = uj.field_D[var2] - 1;
                        var3 = le.field_e[var2][uj.field_D[var2] - 1];
                        le.field_e[var2][uj.field_D[var2]] = null;
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
            } else {
              if (fu.field_h < -1) {
                fu.field_h = fu.field_h - 1;
                var2_ref_byte__ = sg.field_b[fu.field_h - 1];
                sg.field_b[fu.field_h] = null;
                return var2_ref_byte__;
              } else {
                L2: {
                  if (30000 != param0) {
                    break L2;
                  } else {
                    if (-1 >= ep.field_d) {
                      break L2;
                    } else {
                      ep.field_d = ep.field_d - 1;
                      var2_ref_byte__ = vt.field_d[ep.field_d - 1];
                      vt.field_d[ep.field_d] = null;
                      return var2_ref_byte__;
                    }
                  }
                }
                if (null != le.field_e) {
                  var2 = 0;
                  L3: while (true) {
                    if (us.field_i.length <= var2) {
                      return new byte[param0];
                    } else {
                      if (us.field_i[var2] != param0) {
                        var2++;
                        var2++;
                        continue L3;
                      } else {
                        if (uj.field_D[var2] > 0) {
                          uj.field_D[var2] = uj.field_D[var2] - 1;
                          var3 = le.field_e[var2][uj.field_D[var2] - 1];
                          le.field_e[var2][uj.field_D[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L3;
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
            if (0 < li.field_h) {
              li.field_h = li.field_h - 1;
              var2_ref_byte__ = vb.field_g[li.field_h - 1];
              vb.field_g[li.field_h] = null;
              return var2_ref_byte__;
            } else {
              if (param0 == 5000) {
                if ((fu.field_h ^ -1) < -1) {
                  fu.field_h = fu.field_h - 1;
                  var2_ref_byte__ = sg.field_b[fu.field_h - 1];
                  sg.field_b[fu.field_h] = null;
                  return var2_ref_byte__;
                } else {
                  if (30000 == param0) {
                    if (-1 <= (ep.field_d ^ -1)) {
                      if (null != le.field_e) {
                        var2 = 0;
                        L4: while (true) {
                          if (us.field_i.length <= var2) {
                            return new byte[param0];
                          } else {
                            if (us.field_i[var2] != param0) {
                              var2++;
                              var2++;
                              continue L4;
                            } else {
                              if (uj.field_D[var2] > 0) {
                                uj.field_D[var2] = uj.field_D[var2] - 1;
                                var3 = le.field_e[var2][uj.field_D[var2] - 1];
                                le.field_e[var2][uj.field_D[var2]] = null;
                                return var3;
                              } else {
                                var2++;
                                continue L4;
                              }
                            }
                          }
                        }
                      } else {
                        return new byte[param0];
                      }
                    } else {
                      ep.field_d = ep.field_d - 1;
                      var2_ref_byte__ = vt.field_d[ep.field_d - 1];
                      vt.field_d[ep.field_d] = null;
                      return var2_ref_byte__;
                    }
                  } else {
                    if (null != le.field_e) {
                      var2 = 0;
                      L5: while (true) {
                        if (us.field_i.length <= var2) {
                          return new byte[param0];
                        } else {
                          if (us.field_i[var2] != param0) {
                            var2++;
                            var2++;
                            continue L5;
                          } else {
                            if (uj.field_D[var2] > 0) {
                              uj.field_D[var2] = uj.field_D[var2] - 1;
                              var3 = le.field_e[var2][uj.field_D[var2] - 1];
                              le.field_e[var2][uj.field_D[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              continue L5;
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
                L6: {
                  if (30000 != param0) {
                    break L6;
                  } else {
                    if (-1 <= (ep.field_d ^ -1)) {
                      break L6;
                    } else {
                      ep.field_d = ep.field_d - 1;
                      var2_ref_byte__ = vt.field_d[ep.field_d - 1];
                      vt.field_d[ep.field_d] = null;
                      return var2_ref_byte__;
                    }
                  }
                }
                L7: {
                  if (null != le.field_e) {
                    var2 = 0;
                    if (us.field_i.length <= var2) {
                      break L7;
                    } else {
                      L8: {
                        if (us.field_i[var2] != param0) {
                          var2++;
                          break L8;
                        } else {
                          if (uj.field_D[var2] <= 0) {
                            var2++;
                            break L8;
                          } else {
                            uj.field_D[var2] = uj.field_D[var2] - 1;
                            var3 = le.field_e[var2][uj.field_D[var2] - 1];
                            le.field_e[var2][uj.field_D[var2]] = null;
                            return var3;
                          }
                        }
                      }
                      var2++;
                      var2++;
                      var2++;
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                return new byte[param0];
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
    }
}
