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
        if (param0 < 21) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final synchronized static byte[] a(int param0, byte param1) {
        int fieldTemp$27 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        int fieldTemp$30 = 0;
        int fieldTemp$31 = 0;
        int fieldTemp$32 = 0;
        int fieldTemp$33 = 0;
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (param0 != 100) {
          if (param1 == -45) {
            if (param0 != 5000) {
              if (param0 != 30000) {
                if (null != lb.field_Wb) {
                  var2 = 0;
                  L0: while (true) {
                    if (bk.field_W.length <= var2) {
                      return new byte[param0];
                    } else {
                      if (param0 == bk.field_W[var2]) {
                        if ((ff.field_ub[var2] ^ -1) < -1) {
                          ff.field_ub[var2] = ff.field_ub[var2] - 1;
                          var3 = lb.field_Wb[var2][ff.field_ub[var2] - 1];
                          lb.field_Wb[var2][ff.field_ub[var2]] = null;
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
                if (0 < k.field_Gb) {
                  fieldTemp$27 = k.field_Gb - 1;
                  k.field_Gb = k.field_Gb - 1;
                  var2_ref_byte__ = bc.field_vb[fieldTemp$27];
                  bc.field_vb[k.field_Gb] = null;
                  return var2_ref_byte__;
                } else {
                  if (null != lb.field_Wb) {
                    var2 = 0;
                    L1: while (true) {
                      if (bk.field_W.length <= var2) {
                        return new byte[param0];
                      } else {
                        if (param0 == bk.field_W[var2]) {
                          if ((ff.field_ub[var2] ^ -1) < -1) {
                            ff.field_ub[var2] = ff.field_ub[var2] - 1;
                            var3 = lb.field_Wb[var2][ff.field_ub[var2] - 1];
                            lb.field_Wb[var2][ff.field_ub[var2]] = null;
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
                }
              }
            } else {
              if (0 < ak.field_c) {
                fieldTemp$28 = ak.field_c - 1;
                ak.field_c = ak.field_c - 1;
                var2_ref_byte__ = bg.field_A[fieldTemp$28];
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
                        if (param0 == bk.field_W[var2]) {
                          if ((ff.field_ub[var2] ^ -1) < -1) {
                            ff.field_ub[var2] = ff.field_ub[var2] - 1;
                            var3 = lb.field_Wb[var2][ff.field_ub[var2] - 1];
                            lb.field_Wb[var2][ff.field_ub[var2]] = null;
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
                  } else {
                    return new byte[param0];
                  }
                } else {
                  if (0 < k.field_Gb) {
                    fieldTemp$29 = k.field_Gb - 1;
                    k.field_Gb = k.field_Gb - 1;
                    var2_ref_byte__ = bc.field_vb[fieldTemp$29];
                    bc.field_vb[k.field_Gb] = null;
                    return var2_ref_byte__;
                  } else {
                    if (null != lb.field_Wb) {
                      var2 = 0;
                      L3: while (true) {
                        if (bk.field_W.length <= var2) {
                          return new byte[param0];
                        } else {
                          if (param0 == bk.field_W[var2]) {
                            if ((ff.field_ub[var2] ^ -1) < -1) {
                              ff.field_ub[var2] = ff.field_ub[var2] - 1;
                              var3 = lb.field_Wb[var2][ff.field_ub[var2] - 1];
                              lb.field_Wb[var2][ff.field_ub[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              continue L3;
                            }
                          } else {
                            var2++;
                            continue L3;
                          }
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
            return (byte[]) null;
          }
        } else {
          if (-1 <= (ck.field_h ^ -1)) {
            if (param1 == -45) {
              if (param0 == 5000) {
                if (0 < ak.field_c) {
                  fieldTemp$30 = ak.field_c - 1;
                  ak.field_c = ak.field_c - 1;
                  var2_ref_byte__ = bg.field_A[fieldTemp$30];
                  bg.field_A[ak.field_c] = null;
                  return var2_ref_byte__;
                } else {
                  if (param0 == 30000) {
                    if (0 < k.field_Gb) {
                      fieldTemp$31 = k.field_Gb - 1;
                      k.field_Gb = k.field_Gb - 1;
                      var2_ref_byte__ = bc.field_vb[fieldTemp$31];
                      bc.field_vb[k.field_Gb] = null;
                      return var2_ref_byte__;
                    } else {
                      if (null != lb.field_Wb) {
                        var2 = 0;
                        L4: while (true) {
                          if (bk.field_W.length > var2) {
                            if (param0 == bk.field_W[var2]) {
                              if ((ff.field_ub[var2] ^ -1) < -1) {
                                ff.field_ub[var2] = ff.field_ub[var2] - 1;
                                var3 = lb.field_Wb[var2][ff.field_ub[var2] - 1];
                                lb.field_Wb[var2][ff.field_ub[var2]] = null;
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
                    }
                  } else {
                    if (null != lb.field_Wb) {
                      var2 = 0;
                      L5: while (true) {
                        if (bk.field_W.length > var2) {
                          if (param0 == bk.field_W[var2]) {
                            if ((ff.field_ub[var2] ^ -1) < -1) {
                              ff.field_ub[var2] = ff.field_ub[var2] - 1;
                              var3 = lb.field_Wb[var2][ff.field_ub[var2] - 1];
                              lb.field_Wb[var2][ff.field_ub[var2]] = null;
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
                  }
                }
              } else {
                L6: {
                  if (param0 != 30000) {
                    break L6;
                  } else {
                    if (0 < k.field_Gb) {
                      fieldTemp$32 = k.field_Gb - 1;
                      k.field_Gb = k.field_Gb - 1;
                      var2_ref_byte__ = bc.field_vb[fieldTemp$32];
                      bc.field_vb[k.field_Gb] = null;
                      return var2_ref_byte__;
                    } else {
                      break L6;
                    }
                  }
                }
                if (null != lb.field_Wb) {
                  var2 = 0;
                  L7: while (true) {
                    if (bk.field_W.length > var2) {
                      if (param0 == bk.field_W[var2]) {
                        if ((ff.field_ub[var2] ^ -1) < -1) {
                          ff.field_ub[var2] = ff.field_ub[var2] - 1;
                          var3 = lb.field_Wb[var2][ff.field_ub[var2] - 1];
                          lb.field_Wb[var2][ff.field_ub[var2]] = null;
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
              }
            } else {
              return (byte[]) null;
            }
          } else {
            fieldTemp$33 = ck.field_h - 1;
            ck.field_h = ck.field_h - 1;
            var2_ref_byte__ = dh.field_A[fieldTemp$33];
            dh.field_A[ck.field_h] = null;
            return var2_ref_byte__;
          }
        }
    }

    static {
        field_c = 250;
        field_b = new int[128];
    }
}
