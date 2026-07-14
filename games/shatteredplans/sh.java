/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh implements fo {
    static fg field_c;
    private ob field_a;
    static int field_b;
    private int field_d;

    public final l a(byte param0) throws jn {
        int var2 = 0;
        int var3 = 0;
        l var4 = null;
        int var5 = 0;
        vl var6 = null;
        ln[] var7 = null;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ln var13 = null;
        int var14 = 0;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = pe.a((byte) 34, 11);
        var3 = ls.a(11, 2);
        var5 = -65 / ((-67 - param0) / 44);
        var4 = new l(var2, var3, ((sh) this).field_d, 73);
        var6 = new vl(((sh) this).field_d, 2);
        var6.a(false, var4);
        var7 = var4.field_e;
        var8 = 0;
        L0: while (true) {
          if (var8 >= var7.length) {
            var4.a(26253);
            return var4;
          } else {
            var9 = var7[var8];
            var10 = ((sh) this).field_a.j(-114);
            var11 = 0;
            L1: while (true) {
              if (var10 <= var11) {
                var11 = 0;
                L2: while (true) {
                  L3: {
                    if ((var11 ^ -1) <= -5) {
                      break L3;
                    } else {
                      var12 = ((sh) this).field_a.j(-75);
                      var9.field_G[var11] = we.a(var12, 15);
                      var11++;
                      if (-5 < (var11 ^ -1)) {
                        var9.field_G[var11] = we.a(var12, 240) >> -1896795068;
                        var11++;
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var9.field_x = ((sh) this).field_a.f(-20976);
                    if ((var9.field_x & 32768) == 0) {
                      break L4;
                    } else {
                      var9.field_x = var9.field_x & 32767;
                      var9.field_u = true;
                      break L4;
                    }
                  }
                  var9.field_B = ((sh) this).field_a.j(-84);
                  var9.field_L = var9.field_B >>> -217864410;
                  var9.field_B = var9.field_B & 63;
                  var8++;
                  continue L0;
                }
              } else {
                var12 = ((sh) this).field_a.j(-119);
                var13 = var4.field_e[var12];
                var9.a((byte) -114, var13);
                var13.a((byte) -122, var9);
                var11++;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(sd param0, int param1) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var11 = new int[4];
        var9 = var11;
        var7 = var9;
        var12 = var7;
        var10 = var12;
        var2 = var10;
        sn.a(var11, (byte) -76, param0);
        var5 = var11[0];
        var4 = var11[0];
        var3 = 1;
        L0: while (true) {
          if (4 <= var3) {
            L1: {
              if (param1 == -5) {
                break L1;
              } else {
                boolean discarded$1 = sh.b(31);
                break L1;
              }
            }
            var8 = 0;
            var3 = var8;
            L2: while (true) {
              if (-5 >= (var8 ^ -1)) {
                param0.field_u = var2;
                param0.field_r = var4;
                param0.field_w = mf.a((byte) 74, var12);
                return;
              } else {
                var2[var8] = var12[var8] + -var5;
                var8++;
                continue L2;
              }
            }
          } else {
            L3: {
              if (var11[var3] >= var4) {
                break L3;
              } else {
                var4 = var11[var3];
                break L3;
              }
            }
            if (var5 > var11[var3]) {
              var5 = var11[var3];
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final static boolean b(int param0) {
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var1 = 52 / ((param0 - -16) / 49);
        var2 = pr.a(14274);
        var4 = var2 - tk.field_z;
        if (-30001L > (var4 ^ -1L)) {
          vj.field_C = 0;
          tk.field_z = var2;
          return true;
        } else {
          L0: {
            var6 = 3000;
            if (vj.field_C >= 7) {
              var6 = 12000;
              break L0;
            } else {
              if (-6 >= (vj.field_C ^ -1)) {
                var6 = 9000;
                break L0;
              } else {
                if (vj.field_C >= 3) {
                  var6 = 6000;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          if (var4 > (long)var6) {
            vj.field_C = vj.field_C + 1;
            tk.field_z = var2;
            return true;
          } else {
            return false;
          }
        }
    }

    final static void a(int param0) {
        bg.field_g = false;
        ae.field_b = (sa.field_a.j(-99) ^ -1) == param0 ? true : false;
    }

    public static void b(byte param0) {
        if (param0 != 87) {
            nf discarded$0 = sh.a(false, 42, -4, 3);
        }
        field_c = null;
    }

    sh(ob param0, int param1) {
        ((sh) this).field_d = param1;
        ((sh) this).field_a = param0;
    }

    final static nf a(boolean param0, int param1, int param2, int param3) {
        nf var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nf var8_ref_nf = null;
        int var9 = 0;
        nf var9_ref_nf = null;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        L0: {
          var13 = ShatteredPlansClient.field_F ? 1 : 0;
          var4 = null;
          ji.field_I.field_xb.field_M.a(0);
          var5 = 0;
          var6 = 0;
          if (!param0) {
            break L0;
          } else {
            field_b = -115;
            break L0;
          }
        }
        var7 = da.field_g - 1;
        L1: while (true) {
          if (0 > var7) {
            var7 = 0;
            var8 = 0;
            L2: while (true) {
              if (da.field_g <= var8) {
                L3: {
                  var8 = -var7 - -var6 + (ji.field_I.field_xb.field_mb + ji.field_I.field_xb.field_gb);
                  ji.field_I.field_xb.field_mb = ji.field_I.field_xb.field_mb - var8;
                  ji.field_I.field_xb.field_db = ji.field_I.field_xb.field_db + var8;
                  if (!qh.field_v) {
                    break L3;
                  } else {
                    ji.field_I.field_xb.field_mb = var7;
                    break L3;
                  }
                }
                L4: {
                  ji.field_I.field_xb.field_gb = -ji.field_I.field_xb.field_mb + var7;
                  if (qh.field_v) {
                    qh.field_v = false;
                    ji.field_I.field_xb.field_w = 0;
                    ShatteredPlansClient.field_K = true;
                    ji.field_I.field_xb.field_db = -ji.field_I.field_xb.field_mb + ji.field_I.field_zb.field_mb;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (!sr.field_h) {
                    break L5;
                  } else {
                    if (null != fa.field_X) {
                      ShatteredPlansClient.field_K = true;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  var9 = ji.field_I.field_zb.field_mb + -ji.field_I.field_xb.field_mb - ji.field_I.field_xb.field_gb;
                  if (ShatteredPlansClient.field_K) {
                    ji.field_I.field_xb.field_w = var9 + -ji.field_I.field_xb.field_db;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  ji.field_I.a(param1 * 2 * param3, true, (byte) -114, param3);
                  if (var9 != ji.field_I.field_xb.field_w + ji.field_I.field_xb.field_db) {
                    stackOut_40_0 = 0;
                    stackIn_41_0 = stackOut_40_0;
                    break L7;
                  } else {
                    stackOut_39_0 = 1;
                    stackIn_41_0 = stackOut_39_0;
                    break L7;
                  }
                }
                ShatteredPlansClient.field_K = stackIn_41_0 != 0;
                return var4;
              } else {
                var9_ref_nf = wm.field_d[var8];
                if (null != var9_ref_nf.field_j) {
                  L8: {
                    ji.field_I.field_xb.a(4, var9_ref_nf.field_j);
                    var9_ref_nf.field_j.a(var9_ref_nf.field_j.e(false), param3, (byte) 111, var7, param2);
                    if (0 == var9_ref_nf.field_j.field_rb) {
                      break L8;
                    } else {
                      var4 = var9_ref_nf;
                      break L8;
                    }
                  }
                  var7 = var7 + param3;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            L9: {
              var8_ref_nf = wm.field_d[var7];
              var9 = 0;
              if (bg.field_g) {
                break L9;
              } else {
                if (kp.field_i <= var5) {
                  break L9;
                } else {
                  var10_int = id.a(-7019, var8_ref_nf.field_n);
                  if (var10_int > var8_ref_nf.a((byte) 116)) {
                    break L9;
                  } else {
                    L10: {
                      if (var8_ref_nf.field_h) {
                        break L10;
                      } else {
                        if (!ti.a(var8_ref_nf.field_b, true)) {
                          break L10;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var9 = 1;
                    break L9;
                  }
                }
              }
            }
            if (var9 == 0) {
              var8_ref_nf.field_j = null;
              var7--;
              continue L1;
            } else {
              L11: {
                if (null == var8_ref_nf.field_j) {
                  break L11;
                } else {
                  if (qh.field_v) {
                    break L11;
                  } else {
                    var5++;
                    var7--;
                    continue L1;
                  }
                }
              }
              L12: {
                if (null != var8_ref_nf.field_j) {
                  break L12;
                } else {
                  break L12;
                }
              }
              var10 = hg.a(param0, var8_ref_nf);
              var11 = var10 + nq.a(var8_ref_nf.field_k);
              var12 = jl.a(var8_ref_nf, (byte) -73);
              var8_ref_nf.field_j = new qr(0L, bh.field_k, var11);
              var8_ref_nf.field_j.field_nb = ho.field_f;
              var8_ref_nf.field_j.field_jb = -(var12 >> 1320440001 & 8355711) + var12 + (8355711 & bh.field_k.field_jb >> 549633313);
              var8_ref_nf.field_j.field_x = var12;
              var6 = var6 + param3;
              var8_ref_nf.field_j.field_qb = -(8355711 & var12 >> -1060851551) + (var12 + (8355711 & bh.field_k.field_qb >> 1568618881));
              var5++;
              var7--;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new fg();
    }
}
