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

    final static java.awt.Canvas a() {
        int var1 = 48;
        return null == ua.field_d ? kj.field_D : (java.awt.Canvas) (Object) ua.field_d;
    }

    final synchronized static byte[] a(int param0) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (100 != param0) {
          L0: {
            if (param0 != 5000) {
              break L0;
            } else {
              if (dq.field_b <= 0) {
                break L0;
              } else {
                int fieldTemp$150 = dq.field_b - 1;
                dq.field_b = dq.field_b - 1;
                var2_ref_byte__ = da.field_L[fieldTemp$150];
                da.field_L[dq.field_b] = null;
                return var2_ref_byte__;
              }
            }
          }
          if (param0 != 30000) {
            L1: {
              if (bm.field_a == null) {
                break L1;
              } else {
                var2 = 0;
                L2: while (true) {
                  if (gn.field_x.length <= var2) {
                    break L1;
                  } else {
                    L3: {
                      if (~gn.field_x[var2] != ~param0) {
                        var2++;
                        break L3;
                      } else {
                        if (lk.field_u[var2] <= 0) {
                          break L3;
                        } else {
                          lk.field_u[var2] = lk.field_u[var2] - 1;
                          var3 = bm.field_a[var2][lk.field_u[var2] - 1];
                          bm.field_a[var2][lk.field_u[var2]] = null;
                          return var3;
                        }
                      }
                    }
                    var2++;
                    continue L2;
                  }
                }
              }
            }
            return new byte[param0];
          } else {
            if (ac.field_e > 0) {
              int fieldTemp$151 = ac.field_e - 1;
              ac.field_e = ac.field_e - 1;
              var2_ref_byte__ = si.field_b[fieldTemp$151];
              si.field_b[ac.field_e] = null;
              return var2_ref_byte__;
            } else {
              L4: {
                if (bm.field_a == null) {
                  break L4;
                } else {
                  var2 = 0;
                  L5: while (true) {
                    if (gn.field_x.length <= var2) {
                      break L4;
                    } else {
                      L6: {
                        if (~gn.field_x[var2] != ~param0) {
                          var2++;
                          break L6;
                        } else {
                          if (lk.field_u[var2] <= 0) {
                            break L6;
                          } else {
                            lk.field_u[var2] = lk.field_u[var2] - 1;
                            var3 = bm.field_a[var2][lk.field_u[var2] - 1];
                            bm.field_a[var2][lk.field_u[var2]] = null;
                            return var3;
                          }
                        }
                      }
                      var2++;
                      continue L5;
                    }
                  }
                }
              }
              return new byte[param0];
            }
          }
        } else {
          if (ig.field_N > 0) {
            int fieldTemp$152 = ig.field_N - 1;
            ig.field_N = ig.field_N - 1;
            var2_ref_byte__ = cf.field_b[fieldTemp$152];
            cf.field_b[ig.field_N] = null;
            return var2_ref_byte__;
          } else {
            if (param0 == 5000) {
              if (dq.field_b > 0) {
                int fieldTemp$153 = dq.field_b - 1;
                dq.field_b = dq.field_b - 1;
                var2_ref_byte__ = da.field_L[fieldTemp$153];
                da.field_L[dq.field_b] = null;
                return var2_ref_byte__;
              } else {
                if (param0 != 30000) {
                  L7: {
                    if (bm.field_a == null) {
                      break L7;
                    } else {
                      var2 = 0;
                      L8: while (true) {
                        if (gn.field_x.length <= var2) {
                          break L7;
                        } else {
                          L9: {
                            if (~gn.field_x[var2] != ~param0) {
                              var2++;
                              break L9;
                            } else {
                              if (lk.field_u[var2] <= 0) {
                                break L9;
                              } else {
                                lk.field_u[var2] = lk.field_u[var2] - 1;
                                var3 = bm.field_a[var2][lk.field_u[var2] - 1];
                                bm.field_a[var2][lk.field_u[var2]] = null;
                                return var3;
                              }
                            }
                          }
                          var2++;
                          continue L8;
                        }
                      }
                    }
                  }
                  return new byte[param0];
                } else {
                  if (ac.field_e > 0) {
                    int fieldTemp$154 = ac.field_e - 1;
                    ac.field_e = ac.field_e - 1;
                    var2_ref_byte__ = si.field_b[fieldTemp$154];
                    si.field_b[ac.field_e] = null;
                    return var2_ref_byte__;
                  } else {
                    L10: {
                      if (bm.field_a == null) {
                        break L10;
                      } else {
                        var2 = 0;
                        if (gn.field_x.length <= var2) {
                          break L10;
                        } else {
                          L11: {
                            if (~gn.field_x[var2] != ~param0) {
                              var2++;
                              break L11;
                            } else {
                              if (lk.field_u[var2] <= 0) {
                                var2++;
                                break L11;
                              } else {
                                lk.field_u[var2] = lk.field_u[var2] - 1;
                                var3 = bm.field_a[var2][lk.field_u[var2] - 1];
                                bm.field_a[var2][lk.field_u[var2]] = null;
                                return var3;
                              }
                            }
                          }
                          var2++;
                          var2++;
                          break L10;
                        }
                      }
                    }
                    return new byte[param0];
                  }
                }
              }
            } else {
              L12: {
                if (param0 != 30000) {
                  break L12;
                } else {
                  if (ac.field_e > 0) {
                    int fieldTemp$155 = ac.field_e - 1;
                    ac.field_e = ac.field_e - 1;
                    var2_ref_byte__ = si.field_b[fieldTemp$155];
                    si.field_b[ac.field_e] = null;
                    return var2_ref_byte__;
                  } else {
                    break L12;
                  }
                }
              }
              L13: {
                if (bm.field_a == null) {
                  break L13;
                } else {
                  var2 = 0;
                  if (gn.field_x.length <= var2) {
                    break L13;
                  } else {
                    L14: {
                      if (~gn.field_x[var2] != ~param0) {
                        var2++;
                        break L14;
                      } else {
                        if (lk.field_u[var2] <= 0) {
                          var2++;
                          break L14;
                        } else {
                          lk.field_u[var2] = lk.field_u[var2] - 1;
                          var3 = bm.field_a[var2][lk.field_u[var2] - 1];
                          bm.field_a[var2][lk.field_u[var2]] = null;
                          return var3;
                        }
                      }
                    }
                    var2++;
                    var2++;
                    var2++;
                    break L13;
                  }
                }
              }
              return new byte[param0];
            }
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
