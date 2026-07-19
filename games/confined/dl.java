/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static mn field_b;
    static String field_a;
    static nf[] field_d;
    static String[] field_c;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 < 43) {
          field_a = (String) null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        java.awt.Component var4 = null;
        if (param2) {
          fn.b(0, 0, fn.field_g, fn.field_l, 0, 192);
          if (param1) {
            kh.a((byte) 35, param2);
            return;
          } else {
            var4 = (java.awt.Component) null;
            dl.a((java.awt.Component) null, (byte) 72);
            kh.a((byte) 35, param2);
            return;
          }
        } else {
          fn.d();
          if (param1) {
            kh.a((byte) 35, param2);
            return;
          } else {
            var4 = (java.awt.Component) null;
            dl.a((java.awt.Component) null, (byte) 72);
            kh.a((byte) 35, param2);
            return;
          }
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$50 = 0;
        byte[] discarded$51 = null;
        int fieldTemp$52 = 0;
        int fieldTemp$53 = 0;
        byte[] discarded$54 = null;
        int fieldTemp$55 = 0;
        int fieldTemp$56 = 0;
        int fieldTemp$57 = 0;
        byte[] discarded$58 = null;
        int fieldTemp$59 = 0;
        int fieldTemp$60 = 0;
        byte[] discarded$61 = null;
        int fieldTemp$62 = 0;
        int fieldTemp$63 = 0;
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
                      if (param0 == vl.field_d[var2]) {
                        if ((ld.field_d[var2] ^ -1) < -1) {
                          ld.field_d[var2] = ld.field_d[var2] - 1;
                          var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                          fh.field_a[var2][ld.field_d[var2]] = null;
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
                if ((sc.field_f ^ -1) < -1) {
                  fieldTemp$50 = sc.field_f - 1;
                  sc.field_f = sc.field_f - 1;
                  var2_ref_byte__ = hf.field_Z[fieldTemp$50];
                  hf.field_Z[sc.field_f] = null;
                  return var2_ref_byte__;
                } else {
                  if (null != fh.field_a) {
                    var2 = 0;
                    L1: while (true) {
                      if (vl.field_d.length <= var2) {
                        return new byte[param0];
                      } else {
                        if (param0 == vl.field_d[var2]) {
                          if ((ld.field_d[var2] ^ -1) < -1) {
                            ld.field_d[var2] = ld.field_d[var2] - 1;
                            var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                            fh.field_a[var2][ld.field_d[var2]] = null;
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
              discarded$51 = dl.a(40, 47);
              if (30000 != param0) {
                if (null != fh.field_a) {
                  var2 = 0;
                  L2: while (true) {
                    if (vl.field_d.length <= var2) {
                      return new byte[param0];
                    } else {
                      if (param0 == vl.field_d[var2]) {
                        if ((ld.field_d[var2] ^ -1) < -1) {
                          ld.field_d[var2] = ld.field_d[var2] - 1;
                          var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                          fh.field_a[var2][ld.field_d[var2]] = null;
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
                if ((sc.field_f ^ -1) < -1) {
                  fieldTemp$52 = sc.field_f - 1;
                  sc.field_f = sc.field_f - 1;
                  var2_ref_byte__ = hf.field_Z[fieldTemp$52];
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
                          if (param0 == vl.field_d[var2]) {
                            if ((ld.field_d[var2] ^ -1) < -1) {
                              ld.field_d[var2] = ld.field_d[var2] - 1;
                              var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                              fh.field_a[var2][ld.field_d[var2]] = null;
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
                    } else {
                      break L3;
                    }
                  }
                  return new byte[param0];
                }
              }
            }
          } else {
            if (-1 <= (rj.field_a ^ -1)) {
              if (param1 < -98) {
                if (30000 != param0) {
                  if (null != fh.field_a) {
                    var2 = 0;
                    L5: while (true) {
                      if (vl.field_d.length <= var2) {
                        return new byte[param0];
                      } else {
                        if (param0 == vl.field_d[var2]) {
                          if ((ld.field_d[var2] ^ -1) < -1) {
                            ld.field_d[var2] = ld.field_d[var2] - 1;
                            var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                            fh.field_a[var2][ld.field_d[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L5;
                          }
                        } else {
                          var2++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    return new byte[param0];
                  }
                } else {
                  if ((sc.field_f ^ -1) >= -1) {
                    if (null != fh.field_a) {
                      var2 = 0;
                      L6: while (true) {
                        if (vl.field_d.length > var2) {
                          if (param0 == vl.field_d[var2]) {
                            if ((ld.field_d[var2] ^ -1) < -1) {
                              ld.field_d[var2] = ld.field_d[var2] - 1;
                              var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                              fh.field_a[var2][ld.field_d[var2]] = null;
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
                    fieldTemp$53 = sc.field_f - 1;
                    sc.field_f = sc.field_f - 1;
                    var2_ref_byte__ = hf.field_Z[fieldTemp$53];
                    hf.field_Z[sc.field_f] = null;
                    return var2_ref_byte__;
                  }
                }
              } else {
                L7: {
                  discarded$54 = dl.a(40, 47);
                  if (30000 != param0) {
                    break L7;
                  } else {
                    if ((sc.field_f ^ -1) < -1) {
                      fieldTemp$55 = sc.field_f - 1;
                      sc.field_f = sc.field_f - 1;
                      var2_ref_byte__ = hf.field_Z[fieldTemp$55];
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
                      if (param0 == vl.field_d[var2]) {
                        if ((ld.field_d[var2] ^ -1) < -1) {
                          ld.field_d[var2] = ld.field_d[var2] - 1;
                          var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                          fh.field_a[var2][ld.field_d[var2]] = null;
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
              }
            } else {
              fieldTemp$56 = rj.field_a - 1;
              rj.field_a = rj.field_a - 1;
              var2_ref_byte__ = rk.field_c[fieldTemp$56];
              rk.field_c[rj.field_a] = null;
              return var2_ref_byte__;
            }
          }
        } else {
          if (fi.field_c <= 0) {
            if (param0 == 5000) {
              if (-1 > (rj.field_a ^ -1)) {
                fieldTemp$57 = rj.field_a - 1;
                rj.field_a = rj.field_a - 1;
                var2_ref_byte__ = rk.field_c[fieldTemp$57];
                rk.field_c[rj.field_a] = null;
                return var2_ref_byte__;
              } else {
                if (param1 >= -98) {
                  L9: {
                    discarded$58 = dl.a(40, 47);
                    if (30000 != param0) {
                      break L9;
                    } else {
                      if ((sc.field_f ^ -1) < -1) {
                        fieldTemp$59 = sc.field_f - 1;
                        sc.field_f = sc.field_f - 1;
                        var2_ref_byte__ = hf.field_Z[fieldTemp$59];
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
                        if (param0 == vl.field_d[var2]) {
                          if ((ld.field_d[var2] ^ -1) < -1) {
                            ld.field_d[var2] = ld.field_d[var2] - 1;
                            var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                            fh.field_a[var2][ld.field_d[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L10;
                          }
                        } else {
                          var2++;
                          continue L10;
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
                      if ((sc.field_f ^ -1) < -1) {
                        fieldTemp$60 = sc.field_f - 1;
                        sc.field_f = sc.field_f - 1;
                        var2_ref_byte__ = hf.field_Z[fieldTemp$60];
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
                        if (param0 == vl.field_d[var2]) {
                          if ((ld.field_d[var2] ^ -1) < -1) {
                            ld.field_d[var2] = ld.field_d[var2] - 1;
                            var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                            fh.field_a[var2][ld.field_d[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L12;
                          }
                        } else {
                          var2++;
                          continue L12;
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
                  discarded$61 = dl.a(40, 47);
                  break L13;
                }
              }
              L14: {
                if (30000 != param0) {
                  break L14;
                } else {
                  if ((sc.field_f ^ -1) < -1) {
                    fieldTemp$62 = sc.field_f - 1;
                    sc.field_f = sc.field_f - 1;
                    var2_ref_byte__ = hf.field_Z[fieldTemp$62];
                    hf.field_Z[sc.field_f] = null;
                    return var2_ref_byte__;
                  } else {
                    break L14;
                  }
                }
              }
              if (null != fh.field_a) {
                var2 = 0;
                L15: while (true) {
                  if (vl.field_d.length > var2) {
                    if (param0 == vl.field_d[var2]) {
                      if ((ld.field_d[var2] ^ -1) < -1) {
                        ld.field_d[var2] = ld.field_d[var2] - 1;
                        var3 = fh.field_a[var2][ld.field_d[var2] - 1];
                        fh.field_a[var2][ld.field_d[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L15;
                      }
                    } else {
                      var2++;
                      continue L15;
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
            fieldTemp$63 = fi.field_c - 1;
            fi.field_c = fi.field_c - 1;
            var2_ref_byte__ = wd.field_d[fieldTemp$63];
            wd.field_d[fi.field_c] = null;
            return var2_ref_byte__;
          }
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
            param0.removeKeyListener(tf.field_p);
            param0.removeFocusListener(tf.field_p);
            int var2_int = -9 / ((param1 - 20) / 56);
            ab.field_a = -1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "dl.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = new mn();
        field_a = "Loading graphics";
    }
}
