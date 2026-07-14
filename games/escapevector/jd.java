/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static String field_b;
    static String field_c;
    static cn field_a;

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oh var5_ref_oh = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        var11 = EscapeVector.field_A;
        if (!eh.field_k) {
          L0: {
            if (null != mm.field_b) {
              mm.field_b.g(256);
              vi.field_d.g(256);
              mm.field_b = null;
              vi.field_d = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            var1 = 0;
            var2 = 0;
            var3 = 0;
            if (param0 == -54) {
              break L1;
            } else {
              byte[] discarded$1 = jd.a(15, false);
              break L1;
            }
          }
          var5_ref_oh = (oh) (Object) wa.field_c.a(false);
          L2: while (true) {
            if (var5_ref_oh == null) {
              var4 = 0;
              var5_ref_oh = (oh) (Object) si.field_u.a(false);
              L3: while (true) {
                if (var5_ref_oh == null) {
                  L4: {
                    var5 = (int)Math.sqrt((double)((var1 - -var2) * 8));
                    if (var2 + var1 == 0) {
                      stackOut_44_0 = 8192;
                      stackIn_45_0 = stackOut_44_0;
                      break L4;
                    } else {
                      stackOut_43_0 = var2 * 16384 / (var1 - -var2);
                      stackIn_45_0 = stackOut_43_0;
                      break L4;
                    }
                  }
                  L5: {
                    var6 = stackIn_45_0;
                    var7 = var4 + var3 >> 965589224;
                    if (var4 + var3 != 0) {
                      stackOut_47_0 = 16384 * var4 / (var4 + var3);
                      stackIn_48_0 = stackOut_47_0;
                      break L5;
                    } else {
                      stackOut_46_0 = 8192;
                      stackIn_48_0 = stackOut_46_0;
                      break L5;
                    }
                  }
                  L6: {
                    var8 = stackIn_48_0;
                    if (mm.field_b == null) {
                      mm.field_b = hl.c(ob.field_d, 100, 0, var6);
                      vi.field_d = hl.c(pa.field_b, 100, 0, var8);
                      mm.field_b.h(-1);
                      vi.field_d.h(-1);
                      rk.field_e.a((wg) (Object) mm.field_b);
                      rk.field_e.a((wg) (Object) vi.field_d);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  mm.field_b.a(441, qm.field_c * var5 / 64, var6);
                  vi.field_d.a(441, var7 * qm.field_c / 64, var8);
                  return;
                } else {
                  L7: {
                    if (var5_ref_oh.field_i > -1) {
                      break L7;
                    } else {
                      if (-641 <= var5_ref_oh.field_i) {
                        break L7;
                      } else {
                        L8: {
                          var6 = var5_ref_oh.field_q;
                          if (0 <= var5_ref_oh.field_m) {
                            break L8;
                          } else {
                            var6 = var6 - var5_ref_oh.field_s;
                            break L8;
                          }
                        }
                        var7 = var6 - -var5_ref_oh.field_s;
                        var8 = var6;
                        L9: while (true) {
                          if (var8 >= var7) {
                            break L7;
                          } else {
                            if ((var8 ^ -1) <= -1) {
                              if ((var8 ^ -1) > -481) {
                                if (6324320 == em.field_i[var8 * 640 - -var5_ref_oh.field_i]) {
                                  var9 = 256 * var5_ref_oh.field_i / 640;
                                  var3 = var3 + (-var9 + 256);
                                  var4 = var4 + var9;
                                  var8 += 6;
                                  continue L9;
                                } else {
                                  var8 += 6;
                                  continue L9;
                                }
                              } else {
                                var8 += 6;
                                continue L9;
                              }
                            } else {
                              var8 += 6;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                  }
                  var5_ref_oh = (oh) (Object) si.field_u.b((byte) 70);
                  continue L3;
                }
              }
            } else {
              L10: {
                if (var5_ref_oh.field_o < 100) {
                  break L10;
                } else {
                  if ((var5_ref_oh.field_q ^ -1) > -1) {
                    break L10;
                  } else {
                    if (var5_ref_oh.field_q >= 480) {
                      break L10;
                    } else {
                      L11: {
                        var6 = 640 * var5_ref_oh.field_q;
                        var7 = var5_ref_oh.field_i;
                        if (-1 < (var5_ref_oh.field_m ^ -1)) {
                          var7 = var7 - var5_ref_oh.field_s;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      var8 = var7 + var5_ref_oh.field_s;
                      var9 = var7;
                      L12: while (true) {
                        if (var9 >= var8) {
                          break L10;
                        } else {
                          if (var9 <= -1) {
                            if (640 > var9) {
                              if (-6324321 == em.field_i[var6 - -var9]) {
                                var10 = 256 * var9 / 640;
                                var1 = var1 + (-var10 + 256);
                                var2 = var2 + var10;
                                var9 += 6;
                                continue L12;
                              } else {
                                var9 += 6;
                                continue L12;
                              }
                            } else {
                              var9 += 6;
                              continue L12;
                            }
                          } else {
                            var9 += 6;
                            continue L12;
                          }
                        }
                      }
                    }
                  }
                }
              }
              var5_ref_oh = (oh) (Object) wa.field_c.b((byte) 70);
              continue L2;
            }
          }
        }
    }

    public static void b(byte param0) {
        field_c = null;
        int var1 = 19 % ((-6 - param0) / 50);
        field_a = null;
        field_b = null;
    }

    final synchronized static byte[] a(int param0, boolean param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param0 != 100) {
            break L0;
          } else {
            if (0 < vi.field_b) {
              vi.field_b = vi.field_b - 1;
              var2_ref_byte__ = ei.field_l[vi.field_b - 1];
              ei.field_l[vi.field_b] = null;
              return var2_ref_byte__;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if ((param0 ^ -1) != -5001) {
            break L1;
          } else {
            if (qj.field_c <= 0) {
              break L1;
            } else {
              qj.field_c = qj.field_c - 1;
              var2_ref_byte__ = ok.field_d[qj.field_c - 1];
              ok.field_d[qj.field_c] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (param1) {
            break L2;
          } else {
            field_a = null;
            break L2;
          }
        }
        L3: {
          if (-30001 != (param0 ^ -1)) {
            break L3;
          } else {
            if (bm.field_c > 0) {
              bm.field_c = bm.field_c - 1;
              var2_ref_byte__ = id.field_b[bm.field_c - 1];
              id.field_b[bm.field_c] = null;
              return var2_ref_byte__;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (ve.field_n == null) {
            break L4;
          } else {
            var2 = 0;
            L5: while (true) {
              if (var2 >= rb.field_h.length) {
                break L4;
              } else {
                if (rb.field_h[var2] == param0) {
                  if (0 < nb.field_b[var2]) {
                    nb.field_b[var2] = nb.field_b[var2] - 1;
                    var3 = ve.field_n[var2][nb.field_b[var2] - 1];
                    ve.field_n[var2][nb.field_b[var2]] = null;
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
          }
        }
        return new byte[param0];
    }

    final static sn a(boolean param0) {
        if (param0) {
            jd.a((byte) -80);
        }
        String var1 = fl.e(0);
        if (var1 != null) {
            if (!(0 > var1.indexOf('@'))) {
                var1 = "";
            }
        }
        return new sn(fl.e(0), uf.c(62));
    }

    final static int a(ih param0, byte param1, String[] param2) {
        int var5 = 0;
        String var6 = null;
        int var7 = EscapeVector.field_A;
        if (param1 != -121) {
            return -57;
        }
        int var3 = 0;
        String[] var4 = param2;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var3 = var3 + ic.a(var6, param1 ^ -16777096, param0);
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_c = "To Level";
    }
}
