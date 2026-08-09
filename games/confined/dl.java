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
        java.awt.Component var4;
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
        int dupTemp$2 = 0;
        byte[][] arrayValue$3 = null;
        int fieldTemp$4 = 0;
        int dupTemp$5 = 0;
        byte[][] arrayValue$6 = null;
        int dupTemp$7 = 0;
        byte[][] arrayValue$8 = null;
        int fieldTemp$9 = 0;
        int dupTemp$10 = 0;
        byte[][] arrayValue$11 = null;
        int dupTemp$12 = 0;
        byte[][] arrayValue$13 = null;
        int dupTemp$14 = 0;
        byte[][] arrayValue$15 = null;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int dupTemp$18 = 0;
        byte[][] arrayValue$19 = null;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int dupTemp$23 = 0;
        byte[][] arrayValue$24 = null;
        int fieldTemp$25 = 0;
        int dupTemp$26 = 0;
        byte[][] arrayValue$27 = null;
        int fieldTemp$28 = 0;
        int dupTemp$29 = 0;
        byte[][] arrayValue$30 = null;
        int fieldTemp$31 = 0;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
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
                          dupTemp$2 = ld.field_d[var2] - 1;
                          arrayValue$3 = fh.field_a[var2];
                          ld.field_d[var2] = dupTemp$2;
                          var3 = arrayValue$3[dupTemp$2];
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
                  fieldTemp$4 = sc.field_f - 1;
                  sc.field_f = sc.field_f - 1;
                  var2_ref_byte__ = hf.field_Z[fieldTemp$4];
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
                            dupTemp$5 = ld.field_d[var2] - 1;
                            arrayValue$6 = fh.field_a[var2];
                            ld.field_d[var2] = dupTemp$5;
                            var3 = arrayValue$6[dupTemp$5];
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
              dl.a(40, 47);
              if (30000 != param0) {
                if (null != fh.field_a) {
                  var2 = 0;
                  L2: while (true) {
                    if (vl.field_d.length <= var2) {
                      return new byte[param0];
                    } else {
                      if (param0 == vl.field_d[var2]) {
                        if ((ld.field_d[var2] ^ -1) < -1) {
                          dupTemp$7 = ld.field_d[var2] - 1;
                          arrayValue$8 = fh.field_a[var2];
                          ld.field_d[var2] = dupTemp$7;
                          var3 = arrayValue$8[dupTemp$7];
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
                  fieldTemp$9 = sc.field_f - 1;
                  sc.field_f = sc.field_f - 1;
                  var2_ref_byte__ = hf.field_Z[fieldTemp$9];
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
                              dupTemp$10 = ld.field_d[var2] - 1;
                              arrayValue$11 = fh.field_a[var2];
                              ld.field_d[var2] = dupTemp$10;
                              var3 = arrayValue$11[dupTemp$10];
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
                            dupTemp$12 = ld.field_d[var2] - 1;
                            arrayValue$13 = fh.field_a[var2];
                            ld.field_d[var2] = dupTemp$12;
                            var3 = arrayValue$13[dupTemp$12];
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
                              dupTemp$14 = ld.field_d[var2] - 1;
                              arrayValue$15 = fh.field_a[var2];
                              ld.field_d[var2] = dupTemp$14;
                              var3 = arrayValue$15[dupTemp$14];
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
                    fieldTemp$16 = sc.field_f - 1;
                    sc.field_f = sc.field_f - 1;
                    var2_ref_byte__ = hf.field_Z[fieldTemp$16];
                    hf.field_Z[sc.field_f] = null;
                    return var2_ref_byte__;
                  }
                }
              } else {
                L7: {
                  dl.a(40, 47);
                  if (30000 != param0) {
                    break L7;
                  } else {
                    if ((sc.field_f ^ -1) < -1) {
                      fieldTemp$17 = sc.field_f - 1;
                      sc.field_f = sc.field_f - 1;
                      var2_ref_byte__ = hf.field_Z[fieldTemp$17];
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
                          dupTemp$18 = ld.field_d[var2] - 1;
                          arrayValue$19 = fh.field_a[var2];
                          ld.field_d[var2] = dupTemp$18;
                          var3 = arrayValue$19[dupTemp$18];
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
              fieldTemp$20 = rj.field_a - 1;
              rj.field_a = rj.field_a - 1;
              var2_ref_byte__ = rk.field_c[fieldTemp$20];
              rk.field_c[rj.field_a] = null;
              return var2_ref_byte__;
            }
          }
        } else {
          if (fi.field_c <= 0) {
            if (param0 == 5000) {
              if (-1 > (rj.field_a ^ -1)) {
                fieldTemp$21 = rj.field_a - 1;
                rj.field_a = rj.field_a - 1;
                var2_ref_byte__ = rk.field_c[fieldTemp$21];
                rk.field_c[rj.field_a] = null;
                return var2_ref_byte__;
              } else {
                if (param1 >= -98) {
                  L9: {
                    dl.a(40, 47);
                    if (30000 != param0) {
                      break L9;
                    } else {
                      if ((sc.field_f ^ -1) < -1) {
                        fieldTemp$22 = sc.field_f - 1;
                        sc.field_f = sc.field_f - 1;
                        var2_ref_byte__ = hf.field_Z[fieldTemp$22];
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
                            dupTemp$23 = ld.field_d[var2] - 1;
                            arrayValue$24 = fh.field_a[var2];
                            ld.field_d[var2] = dupTemp$23;
                            var3 = arrayValue$24[dupTemp$23];
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
                        fieldTemp$25 = sc.field_f - 1;
                        sc.field_f = sc.field_f - 1;
                        var2_ref_byte__ = hf.field_Z[fieldTemp$25];
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
                            dupTemp$26 = ld.field_d[var2] - 1;
                            arrayValue$27 = fh.field_a[var2];
                            ld.field_d[var2] = dupTemp$26;
                            var3 = arrayValue$27[dupTemp$26];
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
                  dl.a(40, 47);
                  break L13;
                }
              }
              L14: {
                if (30000 != param0) {
                  break L14;
                } else {
                  if ((sc.field_f ^ -1) < -1) {
                    fieldTemp$28 = sc.field_f - 1;
                    sc.field_f = sc.field_f - 1;
                    var2_ref_byte__ = hf.field_Z[fieldTemp$28];
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
                        dupTemp$29 = ld.field_d[var2] - 1;
                        arrayValue$30 = fh.field_a[var2];
                        ld.field_d[var2] = dupTemp$29;
                        var3 = arrayValue$30[dupTemp$29];
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
            fieldTemp$31 = fi.field_c - 1;
            fi.field_c = fi.field_c - 1;
            var2_ref_byte__ = wd.field_d[fieldTemp$31];
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
