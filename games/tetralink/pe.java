/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static int[] field_a;

    final synchronized static byte[] a(int param0, byte param1) {
        int dupTemp$2 = 0;
        byte[][] arrayValue$3 = null;
        int dupTemp$4 = 0;
        byte[][] arrayValue$5 = null;
        int fieldTemp$6 = 0;
        int dupTemp$7 = 0;
        byte[][] arrayValue$8 = null;
        int dupTemp$9 = 0;
        byte[][] arrayValue$10 = null;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int dupTemp$14 = 0;
        byte[][] arrayValue$15 = null;
        int dupTemp$16 = 0;
        byte[][] arrayValue$17 = null;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int dupTemp$20 = 0;
        byte[][] arrayValue$21 = null;
        int fieldTemp$22 = 0;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        if (param1 == -2) {
          if (param0 == 100) {
            if (0 >= nn.field_cb) {
              if (5000 != param0) {
                if ((param0 ^ -1) != -30001) {
                  if (rk.field_c != null) {
                    var2 = 0;
                    L0: while (true) {
                      if (ed.field_V.length <= var2) {
                        return new byte[param0];
                      } else {
                        if (param0 == ed.field_V[var2]) {
                          if (0 < im.field_d[var2]) {
                            dupTemp$2 = im.field_d[var2] - 1;
                            arrayValue$3 = rk.field_c[var2];
                            im.field_d[var2] = dupTemp$2;
                            var3 = arrayValue$3[dupTemp$2];
                            rk.field_c[var2][im.field_d[var2]] = null;
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
                  if ((uf.field_e ^ -1) >= -1) {
                    if (rk.field_c != null) {
                      var2 = 0;
                      L1: while (true) {
                        if (ed.field_V.length <= var2) {
                          return new byte[param0];
                        } else {
                          if (param0 == ed.field_V[var2]) {
                            if (0 < im.field_d[var2]) {
                              dupTemp$4 = im.field_d[var2] - 1;
                              arrayValue$5 = rk.field_c[var2];
                              im.field_d[var2] = dupTemp$4;
                              var3 = arrayValue$5[dupTemp$4];
                              rk.field_c[var2][im.field_d[var2]] = null;
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
                  } else {
                    fieldTemp$6 = uf.field_e - 1;
                    uf.field_e = uf.field_e - 1;
                    var2_ref_byte__ = ng.field_q[fieldTemp$6];
                    ng.field_q[uf.field_e] = null;
                    return var2_ref_byte__;
                  }
                }
              } else {
                if (0 >= ae.field_L) {
                  if ((param0 ^ -1) != -30001) {
                    if (rk.field_c != null) {
                      var2 = 0;
                      L2: while (true) {
                        if (ed.field_V.length > var2) {
                          if (param0 == ed.field_V[var2]) {
                            if (0 < im.field_d[var2]) {
                              dupTemp$7 = im.field_d[var2] - 1;
                              arrayValue$8 = rk.field_c[var2];
                              im.field_d[var2] = dupTemp$7;
                              var3 = arrayValue$8[dupTemp$7];
                              rk.field_c[var2][im.field_d[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              continue L2;
                            }
                          } else {
                            var2++;
                            continue L2;
                          }
                        } else {
                          return new byte[param0];
                        }
                      }
                    } else {
                      return new byte[param0];
                    }
                  } else {
                    if ((uf.field_e ^ -1) >= -1) {
                      if (rk.field_c != null) {
                        var2 = 0;
                        L3: while (true) {
                          if (ed.field_V.length > var2) {
                            if (param0 == ed.field_V[var2]) {
                              if (0 < im.field_d[var2]) {
                                dupTemp$9 = im.field_d[var2] - 1;
                                arrayValue$10 = rk.field_c[var2];
                                im.field_d[var2] = dupTemp$9;
                                var3 = arrayValue$10[dupTemp$9];
                                rk.field_c[var2][im.field_d[var2]] = null;
                                return var3;
                              } else {
                                var2++;
                                continue L3;
                              }
                            } else {
                              var2++;
                              continue L3;
                            }
                          } else {
                            return new byte[param0];
                          }
                        }
                      } else {
                        return new byte[param0];
                      }
                    } else {
                      fieldTemp$11 = uf.field_e - 1;
                      uf.field_e = uf.field_e - 1;
                      var2_ref_byte__ = ng.field_q[fieldTemp$11];
                      ng.field_q[uf.field_e] = null;
                      return var2_ref_byte__;
                    }
                  }
                } else {
                  fieldTemp$12 = ae.field_L - 1;
                  ae.field_L = ae.field_L - 1;
                  var2_ref_byte__ = bg.field_j[fieldTemp$12];
                  bg.field_j[ae.field_L] = null;
                  return var2_ref_byte__;
                }
              }
            } else {
              fieldTemp$13 = nn.field_cb - 1;
              nn.field_cb = nn.field_cb - 1;
              var2_ref_byte__ = d.field_f[fieldTemp$13];
              d.field_f[nn.field_cb] = null;
              return var2_ref_byte__;
            }
          } else {
            if (5000 != param0) {
              if ((param0 ^ -1) != -30001) {
                if (rk.field_c != null) {
                  var2 = 0;
                  L4: while (true) {
                    if (ed.field_V.length > var2) {
                      if (param0 == ed.field_V[var2]) {
                        if (0 < im.field_d[var2]) {
                          dupTemp$14 = im.field_d[var2] - 1;
                          arrayValue$15 = rk.field_c[var2];
                          im.field_d[var2] = dupTemp$14;
                          var3 = arrayValue$15[dupTemp$14];
                          rk.field_c[var2][im.field_d[var2]] = null;
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
              } else {
                if ((uf.field_e ^ -1) >= -1) {
                  if (rk.field_c != null) {
                    var2 = 0;
                    L5: while (true) {
                      if (ed.field_V.length > var2) {
                        if (param0 == ed.field_V[var2]) {
                          if (0 < im.field_d[var2]) {
                            dupTemp$16 = im.field_d[var2] - 1;
                            arrayValue$17 = rk.field_c[var2];
                            im.field_d[var2] = dupTemp$16;
                            var3 = arrayValue$17[dupTemp$16];
                            rk.field_c[var2][im.field_d[var2]] = null;
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
                  fieldTemp$18 = uf.field_e - 1;
                  uf.field_e = uf.field_e - 1;
                  var2_ref_byte__ = ng.field_q[fieldTemp$18];
                  ng.field_q[uf.field_e] = null;
                  return var2_ref_byte__;
                }
              }
            } else {
              if (0 >= ae.field_L) {
                L6: {
                  if ((param0 ^ -1) != -30001) {
                    break L6;
                  } else {
                    if ((uf.field_e ^ -1) < -1) {
                      fieldTemp$19 = uf.field_e - 1;
                      uf.field_e = uf.field_e - 1;
                      var2_ref_byte__ = ng.field_q[fieldTemp$19];
                      ng.field_q[uf.field_e] = null;
                      return var2_ref_byte__;
                    } else {
                      break L6;
                    }
                  }
                }
                if (rk.field_c != null) {
                  var2 = 0;
                  L7: while (true) {
                    if (ed.field_V.length > var2) {
                      if (param0 == ed.field_V[var2]) {
                        if (0 < im.field_d[var2]) {
                          dupTemp$20 = im.field_d[var2] - 1;
                          arrayValue$21 = rk.field_c[var2];
                          im.field_d[var2] = dupTemp$20;
                          var3 = arrayValue$21[dupTemp$20];
                          rk.field_c[var2][im.field_d[var2]] = null;
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
              } else {
                fieldTemp$22 = ae.field_L - 1;
                ae.field_L = ae.field_L - 1;
                var2_ref_byte__ = bg.field_j[fieldTemp$22];
                bg.field_j[ae.field_L] = null;
                return var2_ref_byte__;
              }
            }
          }
        } else {
          return (byte[]) null;
        }
    }

    final static void a(byte param0) {
        ph.field_w = kb.field_q.g((byte) 81);
        if (param0 < 18) {
            return;
        }
        CharSequence var2 = (CharSequence) ((Object) ph.field_w);
        ik.field_f = cc.a(var2, (byte) 105);
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            pe.a(80, (byte) 40);
        }
    }

    static {
        field_a = new int[8192];
    }
}
