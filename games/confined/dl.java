/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static mn field_b;
    static String field_a;
    static nf[] field_d;
    static String[] field_c;

    public static void a() {
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        if (!param2) {
            fn.d();
            kh.a((byte) 35, param2);
            return;
        }
        fn.b(0, 0, fn.field_g, fn.field_l, 0, 192);
        kh.a((byte) 35, param2);
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (param0 != 100) {
          if (param0 != 5000) {
            if (param1 < -98) {
              if (30000 != param0) {
                if (null != fh.field_a) {
                  var2 = 0;
                  L0: while (true) {
                    if (vl.field_d.length <= var2) {
                      return new byte[param0];
                    } else {
                      if (param0 != vl.field_d[var2]) {
                        var2++;
                        var2++;
                        continue L0;
                      } else {
                        if (ld.field_d[var2] > 0) {
                          ld.field_d[var2] = ld.field_d[var2] - 1;
                          var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                          fh.field_a[var2][ld.field_d[var2]] = null;
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
                if (sc.field_f > 0) {
                  int fieldTemp$46 = sc.field_f - 1;
                  sc.field_f = sc.field_f - 1;
                  var2_ref_byte__ = hf.field_Z[fieldTemp$46];
                  hf.field_Z[sc.field_f] = null;
                  return var2_ref_byte__;
                } else {
                  if (null != fh.field_a) {
                    var2 = 0;
                    L1: while (true) {
                      if (vl.field_d.length <= var2) {
                        return new byte[param0];
                      } else {
                        if (param0 != vl.field_d[var2]) {
                          var2++;
                          var2++;
                          continue L1;
                        } else {
                          if (ld.field_d[var2] > 0) {
                            ld.field_d[var2] = ld.field_d[var2] - 1;
                            var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                            fh.field_a[var2][ld.field_d[var2]] = null;
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
              byte[] discarded$47 = dl.a(40, 47);
              if (30000 != param0) {
                if (null != fh.field_a) {
                  var2 = 0;
                  L2: while (true) {
                    if (vl.field_d.length <= var2) {
                      return new byte[param0];
                    } else {
                      if (param0 != vl.field_d[var2]) {
                        var2++;
                        var2++;
                        continue L2;
                      } else {
                        if (ld.field_d[var2] > 0) {
                          ld.field_d[var2] = ld.field_d[var2] - 1;
                          var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                          fh.field_a[var2][ld.field_d[var2]] = null;
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
                if (sc.field_f > 0) {
                  int fieldTemp$48 = sc.field_f - 1;
                  sc.field_f = sc.field_f - 1;
                  var2_ref_byte__ = hf.field_Z[fieldTemp$48];
                  hf.field_Z[sc.field_f] = null;
                  return var2_ref_byte__;
                } else {
                  L3: {
                    if (null != fh.field_a) {
                      var2 = 0;
                      L4: while (true) {
                        if (vl.field_d.length <= var2) {
                          break L3;
                        } else {
                          if (param0 != vl.field_d[var2]) {
                            var2++;
                            var2++;
                            continue L4;
                          } else {
                            if (ld.field_d[var2] > 0) {
                              ld.field_d[var2] = ld.field_d[var2] - 1;
                              var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                              fh.field_a[var2][ld.field_d[var2]] = null;
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
          } else {
            if (rj.field_a <= 0) {
              if (param1 < -98) {
                if (30000 != param0) {
                  if (null != fh.field_a) {
                    var2 = 0;
                    L5: while (true) {
                      if (vl.field_d.length <= var2) {
                        return new byte[param0];
                      } else {
                        if (param0 != vl.field_d[var2]) {
                          var2++;
                          var2++;
                          continue L5;
                        } else {
                          if (ld.field_d[var2] > 0) {
                            ld.field_d[var2] = ld.field_d[var2] - 1;
                            var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                            fh.field_a[var2][ld.field_d[var2]] = null;
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
                } else {
                  if (sc.field_f <= 0) {
                    if (null != fh.field_a) {
                      var2 = 0;
                      L6: while (true) {
                        if (vl.field_d.length > var2) {
                          if (param0 != vl.field_d[var2]) {
                            var2++;
                            var2++;
                            continue L6;
                          } else {
                            if (ld.field_d[var2] > 0) {
                              ld.field_d[var2] = ld.field_d[var2] - 1;
                              var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                              fh.field_a[var2][ld.field_d[var2]] = null;
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
                  } else {
                    int fieldTemp$49 = sc.field_f - 1;
                    sc.field_f = sc.field_f - 1;
                    var2_ref_byte__ = hf.field_Z[fieldTemp$49];
                    hf.field_Z[sc.field_f] = null;
                    return var2_ref_byte__;
                  }
                }
              } else {
                L7: {
                  byte[] discarded$50 = dl.a(40, 47);
                  if (30000 != param0) {
                    break L7;
                  } else {
                    if (sc.field_f > 0) {
                      int fieldTemp$51 = sc.field_f - 1;
                      sc.field_f = sc.field_f - 1;
                      var2_ref_byte__ = hf.field_Z[fieldTemp$51];
                      hf.field_Z[sc.field_f] = null;
                      return var2_ref_byte__;
                    } else {
                      break L7;
                    }
                  }
                }
                if (null != fh.field_a) {
                  var2 = 0;
                  L8: while (true) {
                    if (vl.field_d.length > var2) {
                      if (param0 != vl.field_d[var2]) {
                        var2++;
                        var2++;
                        continue L8;
                      } else {
                        if (ld.field_d[var2] > 0) {
                          ld.field_d[var2] = ld.field_d[var2] - 1;
                          var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                          fh.field_a[var2][ld.field_d[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L8;
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
            } else {
              int fieldTemp$52 = rj.field_a - 1;
              rj.field_a = rj.field_a - 1;
              var2_ref_byte__ = rk.field_c[fieldTemp$52];
              rk.field_c[rj.field_a] = null;
              return var2_ref_byte__;
            }
          }
        } else {
          if (fi.field_c <= 0) {
            if (param0 == 5000) {
              if (rj.field_a > 0) {
                int fieldTemp$53 = rj.field_a - 1;
                rj.field_a = rj.field_a - 1;
                var2_ref_byte__ = rk.field_c[fieldTemp$53];
                rk.field_c[rj.field_a] = null;
                return var2_ref_byte__;
              } else {
                if (param1 >= -98) {
                  L9: {
                    byte[] discarded$54 = dl.a(40, 47);
                    if (30000 != param0) {
                      break L9;
                    } else {
                      if (sc.field_f > 0) {
                        int fieldTemp$55 = sc.field_f - 1;
                        sc.field_f = sc.field_f - 1;
                        var2_ref_byte__ = hf.field_Z[fieldTemp$55];
                        hf.field_Z[sc.field_f] = null;
                        return var2_ref_byte__;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (null != fh.field_a) {
                    var2 = 0;
                    L10: while (true) {
                      if (vl.field_d.length > var2) {
                        if (param0 != vl.field_d[var2]) {
                          var2++;
                          var2++;
                          continue L10;
                        } else {
                          if (ld.field_d[var2] > 0) {
                            ld.field_d[var2] = ld.field_d[var2] - 1;
                            var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                            fh.field_a[var2][ld.field_d[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L10;
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
                  L11: {
                    if (30000 != param0) {
                      break L11;
                    } else {
                      if (sc.field_f > 0) {
                        int fieldTemp$56 = sc.field_f - 1;
                        sc.field_f = sc.field_f - 1;
                        var2_ref_byte__ = hf.field_Z[fieldTemp$56];
                        hf.field_Z[sc.field_f] = null;
                        return var2_ref_byte__;
                      } else {
                        break L11;
                      }
                    }
                  }
                  if (null != fh.field_a) {
                    var2 = 0;
                    L12: while (true) {
                      if (vl.field_d.length > var2) {
                        if (param0 != vl.field_d[var2]) {
                          var2++;
                          var2++;
                          continue L12;
                        } else {
                          if (ld.field_d[var2] > 0) {
                            ld.field_d[var2] = ld.field_d[var2] - 1;
                            var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                            fh.field_a[var2][ld.field_d[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L12;
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
              L13: {
                if (param1 < -98) {
                  break L13;
                } else {
                  byte[] discarded$57 = dl.a(40, 47);
                  break L13;
                }
              }
              L14: {
                if (30000 != param0) {
                  break L14;
                } else {
                  if (sc.field_f > 0) {
                    int fieldTemp$58 = sc.field_f - 1;
                    sc.field_f = sc.field_f - 1;
                    var2_ref_byte__ = hf.field_Z[fieldTemp$58];
                    hf.field_Z[sc.field_f] = null;
                    return var2_ref_byte__;
                  } else {
                    break L14;
                  }
                }
              }
              if (null != fh.field_a) {
                var2 = 0;
                if (vl.field_d.length > var2) {
                  if (param0 == vl.field_d[var2]) {
                    if (ld.field_d[var2] > 0) {
                      ld.field_d[var2] = ld.field_d[var2] - 1;
                      var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                      fh.field_a[var2][ld.field_d[var2]] = null;
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
            int fieldTemp$59 = fi.field_c - 1;
            fi.field_c = fi.field_c - 1;
            var2_ref_byte__ = wd.field_d[fieldTemp$59];
            wd.field_d[fi.field_c] = null;
            return var2_ref_byte__;
          }
        }
    }

    final static void a(java.awt.Component param0) {
        try {
            param0.removeKeyListener((java.awt.event.KeyListener) (Object) tf.field_p);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) tf.field_p);
            int var2_int = 4;
            ab.field_a = -1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "dl.A(" + (param0 != null ? "{...}" : "null") + 44 + -112 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new mn();
        field_a = "Loading graphics";
    }
}
