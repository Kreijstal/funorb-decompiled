/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static dn field_c;
    static String field_e;
    static String field_b;
    static int field_a;
    static String field_d;

    public static void a(boolean param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0) {
            field_d = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static java.awt.Canvas a(byte param0) {
        int var1 = -97 / ((param0 - 81) / 36);
        return (java.awt.Canvas) (null == ua.field_d ? kj.field_D : ua.field_d);
    }

    final synchronized static byte[] a(int param0, byte param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (100 != param0) {
          L0: {
            if (param0 != -5001) {
              break L0;
            } else {
              if (-1 >= dq.field_b) {
                break L0;
              } else {
                dq.field_b = dq.field_b - 1;
                var2_ref_byte__ = da.field_L[dq.field_b - 1];
                da.field_L[dq.field_b] = null;
                return var2_ref_byte__;
              }
            }
          }
          if ((param0 ^ -1) != -30001) {
            if (param1 >= 99) {
              L1: {
                if (bm.field_a == null) {
                  break L1;
                } else {
                  var2 = 0;
                  L2: while (true) {
                    if (gn.field_x.length <= var2) {
                      break L1;
                    } else {
                      if (gn.field_x[var2] != param0) {
                        var2++;
                        var2++;
                        continue L2;
                      } else {
                        if (lk.field_u[var2] > 0) {
                          lk.field_u[var2] = lk.field_u[var2] - 1;
                          var3 = bm.field_a[var2][lk.field_u[var2] - 1];
                          bm.field_a[var2][lk.field_u[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
              return new byte[param0];
            } else {
              return null;
            }
          } else {
            if (ac.field_e > 0) {
              ac.field_e = ac.field_e - 1;
              var2_ref_byte__ = si.field_b[ac.field_e - 1];
              si.field_b[ac.field_e] = null;
              return var2_ref_byte__;
            } else {
              if (param1 >= 99) {
                L3: {
                  if (bm.field_a == null) {
                    break L3;
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (gn.field_x.length <= var2) {
                        break L3;
                      } else {
                        if (gn.field_x[var2] != param0) {
                          var2++;
                          var2++;
                          continue L4;
                        } else {
                          if (lk.field_u[var2] > 0) {
                            lk.field_u[var2] = lk.field_u[var2] - 1;
                            var3 = bm.field_a[var2][lk.field_u[var2] - 1];
                            bm.field_a[var2][lk.field_u[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                }
                return new byte[param0];
              } else {
                return null;
              }
            }
          }
        } else {
          if ((ig.field_N ^ -1) >= -1) {
            if ((param0 ^ -1) == -5001) {
              if (-1 <= (dq.field_b ^ -1)) {
                if ((param0 ^ -1) != -30001) {
                  if (param1 >= 99) {
                    if (bm.field_a != null) {
                      var2 = 0;
                      L5: while (true) {
                        if (gn.field_x.length > var2) {
                          if (gn.field_x[var2] != param0) {
                            var2++;
                            var2++;
                            continue L5;
                          } else {
                            if (lk.field_u[var2] > 0) {
                              lk.field_u[var2] = lk.field_u[var2] - 1;
                              var3 = bm.field_a[var2][lk.field_u[var2] - 1];
                              bm.field_a[var2][lk.field_u[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              continue L5;
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
                    return null;
                  }
                } else {
                  if (ac.field_e <= 0) {
                    if (param1 >= 99) {
                      if (bm.field_a != null) {
                        var2 = 0;
                        if (gn.field_x.length > var2) {
                          if (gn.field_x[var2] == param0) {
                            if (lk.field_u[var2] <= 0) {
                              var2++;
                              var2++;
                              var2++;
                              return new byte[param0];
                            } else {
                              lk.field_u[var2] = lk.field_u[var2] - 1;
                              var3 = bm.field_a[var2][lk.field_u[var2] - 1];
                              bm.field_a[var2][lk.field_u[var2]] = null;
                              return var3;
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
                      return null;
                    }
                  } else {
                    ac.field_e = ac.field_e - 1;
                    var2_ref_byte__ = si.field_b[ac.field_e - 1];
                    si.field_b[ac.field_e] = null;
                    return var2_ref_byte__;
                  }
                }
              } else {
                dq.field_b = dq.field_b - 1;
                var2_ref_byte__ = da.field_L[dq.field_b - 1];
                da.field_L[dq.field_b] = null;
                return var2_ref_byte__;
              }
            } else {
              L6: {
                if ((param0 ^ -1) != -30001) {
                  break L6;
                } else {
                  if (ac.field_e > 0) {
                    ac.field_e = ac.field_e - 1;
                    var2_ref_byte__ = si.field_b[ac.field_e - 1];
                    si.field_b[ac.field_e] = null;
                    return var2_ref_byte__;
                  } else {
                    break L6;
                  }
                }
              }
              if (param1 >= 99) {
                if (bm.field_a != null) {
                  var2 = 0;
                  if (gn.field_x.length > var2) {
                    if (gn.field_x[var2] == param0) {
                      if (lk.field_u[var2] > 0) {
                        lk.field_u[var2] = lk.field_u[var2] - 1;
                        var3 = bm.field_a[var2][lk.field_u[var2] - 1];
                        bm.field_a[var2][lk.field_u[var2]] = null;
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
                return null;
              }
            }
          } else {
            ig.field_N = ig.field_N - 1;
            var2_ref_byte__ = cf.field_b[ig.field_N - 1];
            cf.field_b[ig.field_N] = null;
            return var2_ref_byte__;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Error connecting to server. Please try using a different server.";
    }
}
