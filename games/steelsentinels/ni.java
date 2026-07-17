/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static int field_c;
    static long field_d;
    static int[] field_b;
    static hk field_a;

    final static boolean b(int param0) {
        if (param0 < 8) {
            field_d = 102L;
            return mg.field_ac;
        }
        return mg.field_ac;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    final synchronized static byte[] a(int param0, byte param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (param0 != 100) {
          if (param0 != 5000) {
            if (param0 != 30000) {
              if (null != lb.field_Wb) {
                var2 = 0;
                L0: while (true) {
                  if (bk.field_W.length <= var2) {
                    return new byte[param0];
                  } else {
                    if (param0 != bk.field_W[var2]) {
                      var2++;
                      var2++;
                      continue L0;
                    } else {
                      if (ff.field_ub[var2] > 0) {
                        ff.field_ub[var2] = ff.field_ub[var2] - 1;
                        var3 = lb.field_Wb[var2][ff.field_ub[var2] - 1];
                        lb.field_Wb[var2][ff.field_ub[var2]] = null;
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
              if (0 < k.field_Gb) {
                int fieldTemp$19 = k.field_Gb - 1;
                k.field_Gb = k.field_Gb - 1;
                var2_ref_byte__ = bc.field_vb[fieldTemp$19];
                bc.field_vb[k.field_Gb] = null;
                return var2_ref_byte__;
              } else {
                if (null != lb.field_Wb) {
                  var2 = 0;
                  L1: while (true) {
                    if (bk.field_W.length <= var2) {
                      return new byte[param0];
                    } else {
                      if (param0 != bk.field_W[var2]) {
                        var2++;
                        var2++;
                        continue L1;
                      } else {
                        if (ff.field_ub[var2] > 0) {
                          ff.field_ub[var2] = ff.field_ub[var2] - 1;
                          var3 = lb.field_Wb[var2][ff.field_ub[var2] - 1];
                          lb.field_Wb[var2][ff.field_ub[var2]] = null;
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
            if (0 < ak.field_c) {
              int fieldTemp$20 = ak.field_c - 1;
              ak.field_c = ak.field_c - 1;
              var2_ref_byte__ = bg.field_A[fieldTemp$20];
              bg.field_A[ak.field_c] = null;
              return var2_ref_byte__;
            } else {
              if (param0 != 30000) {
                if (null != lb.field_Wb) {
                  var2 = 0;
                  L2: while (true) {
                    if (bk.field_W.length <= var2) {
                      return new byte[param0];
                    } else {
                      if (param0 != bk.field_W[var2]) {
                        var2++;
                        var2++;
                        continue L2;
                      } else {
                        if (ff.field_ub[var2] > 0) {
                          ff.field_ub[var2] = ff.field_ub[var2] - 1;
                          var3 = lb.field_Wb[var2][ff.field_ub[var2] - 1];
                          lb.field_Wb[var2][ff.field_ub[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L2;
                        }
                      }
                    }
                  }
                } else {
                  return new byte[param0];
                }
              } else {
                if (0 < k.field_Gb) {
                  int fieldTemp$21 = k.field_Gb - 1;
                  k.field_Gb = k.field_Gb - 1;
                  var2_ref_byte__ = bc.field_vb[fieldTemp$21];
                  bc.field_vb[k.field_Gb] = null;
                  return var2_ref_byte__;
                } else {
                  L3: {
                    if (null != lb.field_Wb) {
                      var2 = 0;
                      L4: while (true) {
                        if (bk.field_W.length <= var2) {
                          break L3;
                        } else {
                          if (param0 != bk.field_W[var2]) {
                            var2++;
                            var2++;
                            continue L4;
                          } else {
                            if (ff.field_ub[var2] > 0) {
                              ff.field_ub[var2] = ff.field_ub[var2] - 1;
                              var3 = lb.field_Wb[var2][ff.field_ub[var2] - 1];
                              lb.field_Wb[var2][ff.field_ub[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              continue L4;
                            }
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  return new byte[param0];
                }
              }
            }
          }
        } else {
          if (ck.field_h <= 0) {
            if (param0 == 5000) {
              if (0 < ak.field_c) {
                int fieldTemp$22 = ak.field_c - 1;
                ak.field_c = ak.field_c - 1;
                var2_ref_byte__ = bg.field_A[fieldTemp$22];
                bg.field_A[ak.field_c] = null;
                return var2_ref_byte__;
              } else {
                if (param0 == 30000) {
                  if (0 < k.field_Gb) {
                    int fieldTemp$23 = k.field_Gb - 1;
                    k.field_Gb = k.field_Gb - 1;
                    var2_ref_byte__ = bc.field_vb[fieldTemp$23];
                    bc.field_vb[k.field_Gb] = null;
                    return var2_ref_byte__;
                  } else {
                    if (null != lb.field_Wb) {
                      var2 = 0;
                      L5: while (true) {
                        if (bk.field_W.length <= var2) {
                          return new byte[param0];
                        } else {
                          if (param0 != bk.field_W[var2]) {
                            var2++;
                            var2++;
                            continue L5;
                          } else {
                            if (ff.field_ub[var2] > 0) {
                              ff.field_ub[var2] = ff.field_ub[var2] - 1;
                              var3 = lb.field_Wb[var2][ff.field_ub[var2] - 1];
                              lb.field_Wb[var2][ff.field_ub[var2]] = null;
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
                } else {
                  if (null != lb.field_Wb) {
                    var2 = 0;
                    L6: while (true) {
                      if (bk.field_W.length > var2) {
                        if (param0 != bk.field_W[var2]) {
                          var2++;
                          var2++;
                          continue L6;
                        } else {
                          if (ff.field_ub[var2] > 0) {
                            ff.field_ub[var2] = ff.field_ub[var2] - 1;
                            var3 = lb.field_Wb[var2][ff.field_ub[var2] - 1];
                            lb.field_Wb[var2][ff.field_ub[var2]] = null;
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
              }
            } else {
              L7: {
                if (param0 != 30000) {
                  break L7;
                } else {
                  if (0 < k.field_Gb) {
                    int fieldTemp$24 = k.field_Gb - 1;
                    k.field_Gb = k.field_Gb - 1;
                    var2_ref_byte__ = bc.field_vb[fieldTemp$24];
                    bc.field_vb[k.field_Gb] = null;
                    return var2_ref_byte__;
                  } else {
                    break L7;
                  }
                }
              }
              if (null != lb.field_Wb) {
                var2 = 0;
                if (bk.field_W.length > var2) {
                  if (param0 == bk.field_W[var2]) {
                    if (ff.field_ub[var2] > 0) {
                      ff.field_ub[var2] = ff.field_ub[var2] - 1;
                      var3 = lb.field_Wb[var2][ff.field_ub[var2] - 1];
                      lb.field_Wb[var2][ff.field_ub[var2]] = null;
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
          } else {
            int fieldTemp$25 = ck.field_h - 1;
            ck.field_h = ck.field_h - 1;
            var2_ref_byte__ = dh.field_A[fieldTemp$25];
            dh.field_A[ck.field_h] = null;
            return var2_ref_byte__;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 250;
        field_b = new int[128];
    }
}
