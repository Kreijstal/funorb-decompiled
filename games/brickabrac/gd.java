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
        int dupTemp$15 = 0;
        byte[][] arrayValue$16 = null;
        int fieldTemp$17 = 0;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        if (100 != param0) {
          L0: {
            if ((param0 ^ -1) != -5001) {
              break L0;
            } else {
              if (-1 <= (dq.field_b ^ -1)) {
                break L0;
              } else {
                fieldTemp$2 = dq.field_b - 1;
                dq.field_b = dq.field_b - 1;
                var2_ref_byte__ = da.field_L[fieldTemp$2];
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
                          dupTemp$3 = lk.field_u[var2] - 1;
                          arrayValue$4 = bm.field_a[var2];
                          lk.field_u[var2] = dupTemp$3;
                          var3 = arrayValue$4[dupTemp$3];
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
              fieldTemp$5 = ac.field_e - 1;
              ac.field_e = ac.field_e - 1;
              var2_ref_byte__ = si.field_b[fieldTemp$5];
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
                            dupTemp$6 = lk.field_u[var2] - 1;
                            arrayValue$7 = bm.field_a[var2];
                            lk.field_u[var2] = dupTemp$6;
                            var3 = arrayValue$7[dupTemp$6];
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
                              dupTemp$8 = lk.field_u[var2] - 1;
                              arrayValue$9 = bm.field_a[var2];
                              lk.field_u[var2] = dupTemp$8;
                              var3 = arrayValue$9[dupTemp$8];
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
                                dupTemp$10 = lk.field_u[var2] - 1;
                                arrayValue$11 = bm.field_a[var2];
                                lk.field_u[var2] = dupTemp$10;
                                var3 = arrayValue$11[dupTemp$10];
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
                    fieldTemp$12 = ac.field_e - 1;
                    ac.field_e = ac.field_e - 1;
                    var2_ref_byte__ = si.field_b[fieldTemp$12];
                    si.field_b[ac.field_e] = null;
                    return var2_ref_byte__;
                  }
                }
              } else {
                fieldTemp$13 = dq.field_b - 1;
                dq.field_b = dq.field_b - 1;
                var2_ref_byte__ = da.field_L[fieldTemp$13];
                da.field_L[dq.field_b] = null;
                return var2_ref_byte__;
              }
            } else {
              L7: {
                if ((param0 ^ -1) != -30001) {
                  break L7;
                } else {
                  if (ac.field_e > 0) {
                    fieldTemp$14 = ac.field_e - 1;
                    ac.field_e = ac.field_e - 1;
                    var2_ref_byte__ = si.field_b[fieldTemp$14];
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
                          dupTemp$15 = lk.field_u[var2] - 1;
                          arrayValue$16 = bm.field_a[var2];
                          lk.field_u[var2] = dupTemp$15;
                          var3 = arrayValue$16[dupTemp$15];
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
            fieldTemp$17 = ig.field_N - 1;
            ig.field_N = ig.field_N - 1;
            var2_ref_byte__ = cf.field_b[fieldTemp$17];
            cf.field_b[ig.field_N] = null;
            return var2_ref_byte__;
          }
        }
    }

    static {
        field_e = "Error connecting to server. Please try using a different server.";
    }
}
