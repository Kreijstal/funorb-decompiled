/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd implements dr {
    static String field_a;
    static ri field_g;
    static String field_b;
    static String field_e;
    static String field_c;
    static Boolean field_d;
    static ja[][] field_f;

    public static void a(boolean param0) {
        Object var2 = null;
        field_g = null;
        field_f = null;
        field_c = null;
        field_e = null;
        field_a = null;
        field_d = null;
        if (param0) {
          var2 = null;
          boolean discarded$2 = dd.a((int[]) null, (byte) 46);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        nc.a(param1 ^ -122, param0);
        if (param1 != 0) {
            return;
        }
        pm.a(false, param0);
    }

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var7 = hl.field_e;
        var6 = var7;
        var5 = var6;
        var1 = var5;
        if (param0 == 8) {
          var2 = 0;
          var3 = var7.length;
          L0: while (true) {
            if (var3 > var2) {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          field_e = null;
          var2 = 0;
          var3 = var7.length;
          L1: while (true) {
            if (var3 > var2) {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final static boolean a(int[] param0, byte param1) {
        long var2 = 0L;
        int var4 = 0;
        bb var4_ref_bb = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        bb var8 = null;
        bb var9 = null;
        bb var14 = null;
        bb var18 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (pi.field_a == vo.field_l) {
          var2 = bl.a((byte) 94);
          if (param1 <= -77) {
            if (od.field_Db != 0) {
              if ((fd.field_F ^ -1) > -1) {
                var4_ref_bb = (bb) (Object) he.field_k.c(60);
                if (var4_ref_bb != null) {
                  if (var4_ref_bb.field_j >= var2) {
                    L0: while (true) {
                      L1: {
                        if ((fd.field_F ^ -1) <= -1) {
                          break L1;
                        } else {
                          s.field_e.field_j = 0;
                          if (!fa.b(10, 1)) {
                            return false;
                          } else {
                            fd.field_F = s.field_e.m(101);
                            s.field_e.field_j = 0;
                            hd.field_q = param0[fd.field_F];
                            break L1;
                          }
                        }
                      }
                      if (!dd.a(0)) {
                        return false;
                      } else {
                        if (od.field_Db == 0) {
                          k.field_k = jp.field_e;
                          jp.field_e = ij.field_d;
                          ij.field_d = op.field_i;
                          op.field_i = fd.field_F;
                          fd.field_F = -1;
                          return true;
                        } else {
                          L2: {
                            var4 = od.field_Db;
                            if (0.0 != la.field_n) {
                              var4 = (int)((double)var4 + c.field_c.nextGaussian() * la.field_n);
                              if ((var4 ^ -1) > -1) {
                                var4 = 0;
                                break L2;
                              } else {
                                break L2;
                              }
                            } else {
                              break L2;
                            }
                          }
                          var18 = new bb(var2 + (long)var4, fd.field_F, new byte[hd.field_q]);
                          var6 = 0;
                          L3: while (true) {
                            if (hd.field_q <= var6) {
                              he.field_k.a((br) (Object) var18, false);
                              fd.field_F = -1;
                              continue L0;
                            } else {
                              var18.field_f[var6] = s.field_e.field_m[var6];
                              var6++;
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var4_ref_bb.a(true);
                    hd.field_q = var4_ref_bb.field_f.length;
                    s.field_e.field_j = 0;
                    var5 = 0;
                    L4: while (true) {
                      if (hd.field_q <= var5) {
                        k.field_k = jp.field_e;
                        jp.field_e = ij.field_d;
                        ij.field_d = op.field_i;
                        op.field_i = var4_ref_bb.field_l;
                        return true;
                      } else {
                        s.field_e.field_m[var5] = var4_ref_bb.field_f[var5];
                        var5++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  L5: while (true) {
                    L6: {
                      if ((fd.field_F ^ -1) <= -1) {
                        break L6;
                      } else {
                        s.field_e.field_j = 0;
                        if (!fa.b(10, 1)) {
                          return false;
                        } else {
                          fd.field_F = s.field_e.m(101);
                          s.field_e.field_j = 0;
                          hd.field_q = param0[fd.field_F];
                          break L6;
                        }
                      }
                    }
                    if (!dd.a(0)) {
                      return false;
                    } else {
                      if (od.field_Db == 0) {
                        k.field_k = jp.field_e;
                        jp.field_e = ij.field_d;
                        ij.field_d = op.field_i;
                        op.field_i = fd.field_F;
                        fd.field_F = -1;
                        return true;
                      } else {
                        L7: {
                          var4 = od.field_Db;
                          if (0.0 != la.field_n) {
                            var4 = (int)((double)var4 + c.field_c.nextGaussian() * la.field_n);
                            if ((var4 ^ -1) > -1) {
                              var4 = 0;
                              break L7;
                            } else {
                              break L7;
                            }
                          } else {
                            break L7;
                          }
                        }
                        var14 = new bb(var2 + (long)var4, fd.field_F, new byte[hd.field_q]);
                        var6 = 0;
                        L8: while (true) {
                          if (hd.field_q <= var6) {
                            he.field_k.a((br) (Object) var14, false);
                            fd.field_F = -1;
                            continue L5;
                          } else {
                            var14.field_f[var6] = s.field_e.field_m[var6];
                            var6++;
                            continue L8;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                L9: while (true) {
                  L10: {
                    if ((fd.field_F ^ -1) <= -1) {
                      break L10;
                    } else {
                      s.field_e.field_j = 0;
                      if (!fa.b(10, 1)) {
                        return false;
                      } else {
                        fd.field_F = s.field_e.m(101);
                        s.field_e.field_j = 0;
                        hd.field_q = param0[fd.field_F];
                        break L10;
                      }
                    }
                  }
                  if (!dd.a(0)) {
                    return false;
                  } else {
                    if (od.field_Db == 0) {
                      k.field_k = jp.field_e;
                      jp.field_e = ij.field_d;
                      ij.field_d = op.field_i;
                      op.field_i = fd.field_F;
                      fd.field_F = -1;
                      return true;
                    } else {
                      L11: {
                        var4 = od.field_Db;
                        if (0.0 != la.field_n) {
                          var4 = (int)((double)var4 + c.field_c.nextGaussian() * la.field_n);
                          if ((var4 ^ -1) > -1) {
                            var4 = 0;
                            break L11;
                          } else {
                            break L11;
                          }
                        } else {
                          break L11;
                        }
                      }
                      var9 = new bb(var2 + (long)var4, fd.field_F, new byte[hd.field_q]);
                      var6 = 0;
                      L12: while (true) {
                        if (hd.field_q <= var6) {
                          he.field_k.a((br) (Object) var9, false);
                          fd.field_F = -1;
                          continue L9;
                        } else {
                          var9.field_f[var6] = s.field_e.field_m[var6];
                          var6++;
                          continue L12;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              L13: while (true) {
                L14: {
                  if ((fd.field_F ^ -1) <= -1) {
                    break L14;
                  } else {
                    s.field_e.field_j = 0;
                    if (!fa.b(10, 1)) {
                      return false;
                    } else {
                      fd.field_F = s.field_e.m(101);
                      s.field_e.field_j = 0;
                      hd.field_q = param0[fd.field_F];
                      break L14;
                    }
                  }
                }
                if (!dd.a(0)) {
                  return false;
                } else {
                  if (od.field_Db == 0) {
                    k.field_k = jp.field_e;
                    jp.field_e = ij.field_d;
                    ij.field_d = op.field_i;
                    op.field_i = fd.field_F;
                    fd.field_F = -1;
                    return true;
                  } else {
                    L15: {
                      var4 = od.field_Db;
                      if (0.0 != la.field_n) {
                        var4 = (int)((double)var4 + c.field_c.nextGaussian() * la.field_n);
                        if ((var4 ^ -1) > -1) {
                          var4 = 0;
                          break L15;
                        } else {
                          break L15;
                        }
                      } else {
                        break L15;
                      }
                    }
                    var8 = new bb(var2 + (long)var4, fd.field_F, new byte[hd.field_q]);
                    var6 = 0;
                    L16: while (true) {
                      if (hd.field_q <= var6) {
                        he.field_k.a((br) (Object) var8, false);
                        fd.field_F = -1;
                        continue L13;
                      } else {
                        var8.field_f[var6] = s.field_e.field_m[var6];
                        var6++;
                        continue L16;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0) {
        if (!(param0 != (hd.field_q ^ -1))) {
            if (!(fa.b(10, 1))) {
                return false;
            }
            hd.field_q = s.field_e.g(param0 + 31365);
            s.field_e.field_j = 0;
        }
        if (!(hd.field_q != -2)) {
            if (!(fa.b(param0 + 10, 2))) {
                return false;
            }
            hd.field_q = s.field_e.d((byte) 69);
            s.field_e.field_j = 0;
        }
        return fa.b(10, hd.field_q);
    }

    final static void a(int param0, String[] param1, String param2, int param3) {
        String[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        ta.field_hb = oi.field_j;
        if (-256 != param3) {
          if (-101 < (param3 ^ -1)) {
            ai.field_g = p.a(-28, param2, param3);
            if (param0 == 0) {
              return;
            } else {
              dd.a(false);
              return;
            }
          } else {
            if (param3 <= 105) {
              var4 = param1;
              jk.a(param0 ^ 0, var4);
              ai.field_g = kn.a(param1, param0 ^ -107);
              if (param0 == 0) {
                return;
              } else {
                dd.a(false);
                return;
              }
            } else {
              ai.field_g = p.a(-28, param2, param3);
              if (param0 == 0) {
                return;
              } else {
                dd.a(false);
                return;
              }
            }
          }
        } else {
          L0: {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (-14 <= rj.field_J) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          ai.field_g = ij.a(stackIn_4_0 != 0, stackIn_4_1 != 0);
          var6 = null;
          jk.a(0, (String[]) null);
          if (param0 == 0) {
            return;
          } else {
            dd.a(false);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please check if address is correct";
        field_b = "Draws even more zombies to you at the start of each match than Prepared. Equip both for the maximum number of minions.";
        field_f = new ja[5][];
        field_e = "Cancel";
        field_c = "For the zombie on the go.";
    }
}
