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
            field_d = (String) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static java.awt.Canvas a(byte param0) {
        int var1 = -97 / ((param0 - 81) / 36);
        return null == ua.field_d ? kj.field_D : (java.awt.Canvas) ((Object) ua.field_d);
    }

    final synchronized static byte[] a(int param0, byte param1) {
        int fieldTemp$34 = 0;
        int fieldTemp$35 = 0;
        int fieldTemp$36 = 0;
        int fieldTemp$37 = 0;
        int fieldTemp$38 = 0;
        int fieldTemp$39 = 0;
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (100 != param0) {
          L0: {
            if ((param0 ^ -1) != -5001) {
              break L0;
            } else {
              if (-1 <= (dq.field_b ^ -1)) {
                break L0;
              } else {
                fieldTemp$34 = dq.field_b - 1;
                dq.field_b = dq.field_b - 1;
                var2_ref_byte__ = da.field_L[fieldTemp$34];
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
                      if (gn.field_x[var2] == param0) {
                        if (lk.field_u[var2] > 0) {
                          lk.field_u[var2] = lk.field_u[var2] - 1;
                          var3 = bm.field_a[var2][lk.field_u[var2] - 1];
                          bm.field_a[var2][lk.field_u[var2]] = null;
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
                }
              }
              return new byte[param0];
            } else {
              return (byte[]) null;
            }
          } else {
            if (ac.field_e > 0) {
              fieldTemp$35 = ac.field_e - 1;
              ac.field_e = ac.field_e - 1;
              var2_ref_byte__ = si.field_b[fieldTemp$35];
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
                        if (gn.field_x[var2] == param0) {
                          if (lk.field_u[var2] > 0) {
                            lk.field_u[var2] = lk.field_u[var2] - 1;
                            var3 = bm.field_a[var2][lk.field_u[var2] - 1];
                            bm.field_a[var2][lk.field_u[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L4;
                          }
                        } else {
                          var2++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                return new byte[param0];
              } else {
                return (byte[]) null;
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
                          if (gn.field_x[var2] == param0) {
                            if (lk.field_u[var2] > 0) {
                              lk.field_u[var2] = lk.field_u[var2] - 1;
                              var3 = bm.field_a[var2][lk.field_u[var2] - 1];
                              bm.field_a[var2][lk.field_u[var2]] = null;
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
                    return (byte[]) null;
                  }
                } else {
                  if (ac.field_e <= 0) {
                    if (param1 >= 99) {
                      if (bm.field_a != null) {
                        var2 = 0;
                        L6: while (true) {
                          if (gn.field_x.length > var2) {
                            if (gn.field_x[var2] == param0) {
                              if (lk.field_u[var2] > 0) {
                                lk.field_u[var2] = lk.field_u[var2] - 1;
                                var3 = bm.field_a[var2][lk.field_u[var2] - 1];
                                bm.field_a[var2][lk.field_u[var2]] = null;
                                return var3;
                              } else {
                                var2++;
                                continue L6;
                              }
                            } else {
                              var2++;
                              continue L6;
                            }
                          } else {
                            return new byte[param0];
                          }
                        }
                      } else {
                        return new byte[param0];
                      }
                    } else {
                      return (byte[]) null;
                    }
                  } else {
                    fieldTemp$36 = ac.field_e - 1;
                    ac.field_e = ac.field_e - 1;
                    var2_ref_byte__ = si.field_b[fieldTemp$36];
                    si.field_b[ac.field_e] = null;
                    return var2_ref_byte__;
                  }
                }
              } else {
                fieldTemp$37 = dq.field_b - 1;
                dq.field_b = dq.field_b - 1;
                var2_ref_byte__ = da.field_L[fieldTemp$37];
                da.field_L[dq.field_b] = null;
                return var2_ref_byte__;
              }
            } else {
              L7: {
                if ((param0 ^ -1) != -30001) {
                  break L7;
                } else {
                  if (ac.field_e > 0) {
                    fieldTemp$38 = ac.field_e - 1;
                    ac.field_e = ac.field_e - 1;
                    var2_ref_byte__ = si.field_b[fieldTemp$38];
                    si.field_b[ac.field_e] = null;
                    return var2_ref_byte__;
                  } else {
                    break L7;
                  }
                }
              }
              if (param1 >= 99) {
                if (bm.field_a != null) {
                  var2 = 0;
                  L8: while (true) {
                    if (gn.field_x.length > var2) {
                      if (gn.field_x[var2] == param0) {
                        if (lk.field_u[var2] > 0) {
                          lk.field_u[var2] = lk.field_u[var2] - 1;
                          var3 = bm.field_a[var2][lk.field_u[var2] - 1];
                          bm.field_a[var2][lk.field_u[var2]] = null;
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
                      return new byte[param0];
                    }
                  }
                } else {
                  return new byte[param0];
                }
              } else {
                return (byte[]) null;
              }
            }
          } else {
            fieldTemp$39 = ig.field_N - 1;
            ig.field_N = ig.field_N - 1;
            var2_ref_byte__ = cf.field_b[fieldTemp$39];
            cf.field_b[ig.field_N] = null;
            return var2_ref_byte__;
          }
        }
    }

    static {
        field_e = "Error connecting to server. Please try using a different server.";
    }
}
