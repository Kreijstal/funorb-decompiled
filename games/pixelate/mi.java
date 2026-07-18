/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mi extends de {
    static boolean field_o;

    final void c(byte param0) {
        if (param0 >= -13) {
            mi.e(-14);
        }
    }

    final void a(int param0) {
        ((mi) this).b((byte) -71);
        int var2 = go.field_k != 0 ? 1 : 0;
        int var3 = null != wh.field_p ? 1 : 0;
        String var7 = bc.field_p;
        if (param0 != 11) {
            mi.b(false);
        }
        String var8 = var7 + " " + ub.a(sd.a(bf.a(param0 + -99, false, var3 != 0, var2 != 0), param0 ^ 50, new String[1]), param0 + -11, "<br><br>", '#');
        tc var5 = qj.field_e;
        int var6 = 1 + var5.field_z + var5.field_w;
        int discarded$0 = var5.a(var8, 50, 150, 540, 10 * var6, 16777215, 0, 1, 0, var6);
    }

    final static void e(int param0) {
        int var1 = 0;
        int var2 = 0;
        ph var3 = null;
        L0: {
          var2 = Pixelate.field_H ? 1 : 0;
          if (0 == ki.field_f) {
            L1: {
              if (ii.field_q != -1) {
                ii.field_q = -1;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (ph) (Object) pl.field_Y.d(-28918);
            if (var3 == null) {
              break L0;
            } else {
              ii.field_q = var3.field_k;
              ki.field_f = 300;
              nn.field_a = qj.field_e.c(tn.field_n[ii.field_q]) + 56;
              gk.field_bb = 50 - -nn.field_a;
              break L0;
            }
          } else {
            ki.field_f = ki.field_f - 1;
            if (ki.field_f < 16) {
              var1 = 16 - ki.field_f;
              gk.field_bb = var1 * (var1 * (50 - -nn.field_a)) >> 8;
              break L0;
            } else {
              if (284 < ki.field_f) {
                var1 = ki.field_f - 284;
                gk.field_bb = var1 * (nn.field_a + 50) * var1 >> 8;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L2: {
          if (param0 < -121) {
            break L2;
          } else {
            hh[] discarded$1 = mi.a(71, 124, 48, -115);
            break L2;
          }
        }
    }

    final static hh[] a(int param0, int param1, int param2, int param3) {
        hh[] var4 = null;
        int var5 = 0;
        boolean[] var6 = null;
        hh[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        hh[] var11 = null;
        var10 = Pixelate.field_H ? 1 : 0;
        var11 = al.field_c[param2][param0];
        var4 = var11;
        if (var4 != null) {
          var5 = var11.length;
          var6 = new boolean[var5];
          var7 = new hh[param1];
          var8 = 0;
          L0: while (true) {
            if (var7.length <= var8) {
              L1: {
                if (param3 == 20) {
                  break L1;
                } else {
                  mi.b(true);
                  break L1;
                }
              }
              return var7;
            } else {
              var9 = ok.a(tg.field_f, param3 ^ -118, var5);
              L2: while (true) {
                if (!var6[var9]) {
                  var6[var9] = true;
                  var7[var8] = var11[var9];
                  var8++;
                  continue L0;
                } else {
                  var9++;
                  if (var5 <= var9) {
                    var9 = 0;
                    continue L2;
                  } else {
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static int d(int param0, int param1) {
        param1 = param1 & 8191;
        if (param1 >= 4096) {
            return param1 >= 6144 ? -k.field_i[-param1 + 8192] : -k.field_i[param1 + -4096];
        }
        return param1 < 2048 ? k.field_i[param1] : k.field_i[-param1 + 4096];
    }

    mi(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static int a(boolean param0, byte param1, String param2, int param3, boolean param4, String param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_4_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_50_0 = 0;
            int stackIn_79_0 = 0;
            int stackIn_90_0 = 0;
            int stackIn_92_0 = 0;
            int stackIn_100_0 = 0;
            int stackIn_103_0 = 0;
            RuntimeException stackIn_105_0 = null;
            StringBuilder stackIn_105_1 = null;
            RuntimeException stackIn_106_0 = null;
            StringBuilder stackIn_106_1 = null;
            RuntimeException stackIn_107_0 = null;
            StringBuilder stackIn_107_1 = null;
            String stackIn_107_2 = null;
            RuntimeException stackIn_108_0 = null;
            StringBuilder stackIn_108_1 = null;
            RuntimeException stackIn_109_0 = null;
            StringBuilder stackIn_109_1 = null;
            RuntimeException stackIn_110_0 = null;
            StringBuilder stackIn_110_1 = null;
            String stackIn_110_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_78_0 = 0;
            int stackOut_91_0 = 0;
            int stackOut_89_0 = 0;
            int stackOut_99_0 = 0;
            int stackOut_102_0 = 0;
            RuntimeException stackOut_104_0 = null;
            StringBuilder stackOut_104_1 = null;
            RuntimeException stackOut_106_0 = null;
            StringBuilder stackOut_106_1 = null;
            String stackOut_106_2 = null;
            RuntimeException stackOut_105_0 = null;
            StringBuilder stackOut_105_1 = null;
            String stackOut_105_2 = null;
            RuntimeException stackOut_107_0 = null;
            StringBuilder stackOut_107_1 = null;
            RuntimeException stackOut_109_0 = null;
            StringBuilder stackOut_109_1 = null;
            String stackOut_109_2 = null;
            RuntimeException stackOut_108_0 = null;
            StringBuilder stackOut_108_1 = null;
            String stackOut_108_2 = null;
            var9 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != sh.field_e) {
                    break L1;
                  } else {
                    if (wb.a(0, param4)) {
                      break L1;
                    } else {
                      stackOut_3_0 = -1;
                      stackIn_4_0 = stackOut_3_0;
                      return stackIn_4_0;
                    }
                  }
                }
                L2: {
                  if (ij.field_o == uk.field_s) {
                    L3: {
                      if (param4) {
                        var10 = null;
                        li.field_g = ck.a(param2, (String) null, false, vn.field_b, 83);
                        break L3;
                      } else {
                        li.field_g = k.a(param2, false, -61, param5);
                        break L3;
                      }
                    }
                    aa.field_f.field_m = 0;
                    aa.field_f.e(160, 14);
                    aa.field_f.e(160, li.field_g.b(-27096).field_a);
                    vg.b(-1, 10000);
                    uk.field_s = cn.field_a;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (uk.field_s == cn.field_a) {
                    if (!rd.a(1, false)) {
                      break L4;
                    } else {
                      var6_int = vi.field_o.f(255);
                      vi.field_o.field_m = 0;
                      if (var6_int != 0) {
                        mn.field_e = var6_int;
                        uk.field_s = sl.field_b;
                        jj.field_b = -1;
                        break L4;
                      } else {
                        uk.field_s = ke.field_b;
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (uk.field_s == ke.field_b) {
                    if (rd.a(8, false)) {
                      gj.field_P = vi.field_o.a(false);
                      vi.field_o.field_m = 0;
                      io.a(param4, -67, li.field_g, param3, param0);
                      uk.field_s = kk.field_b;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (kk.field_b != uk.field_s) {
                    break L6;
                  } else {
                    if (rd.a(1, false)) {
                      L7: {
                        var6_int = vi.field_o.f(255);
                        sc.field_a = null;
                        vi.field_o.field_m = 0;
                        mn.field_e = var6_int;
                        if (0 == var6_int) {
                          break L7;
                        } else {
                          if (1 == var6_int) {
                            break L7;
                          } else {
                            if (var6_int == 8) {
                              na.a(true);
                              qj.field_b = false;
                              stackOut_29_0 = var6_int;
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0;
                            } else {
                              uk.field_s = sl.field_b;
                              jj.field_b = -1;
                              break L6;
                            }
                          }
                        }
                      }
                      jj.field_b = -1;
                      uk.field_s = e.field_d;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L8: {
                  if (e.field_d == uk.field_s) {
                    int discarded$9 = -18481;
                    if (!in.e()) {
                      break L8;
                    } else {
                      L9: {
                        vn.field_b = vi.field_o.a(false);
                        hq.field_t = param2;
                        wo.field_h = vi.field_o.f(255);
                        rj.field_I = vi.field_o.f(255);
                        uo.field_j = vi.field_o.a((byte) -116);
                        var6_ref = vi.field_o.e((byte) 79);
                        var7 = vi.field_o.f(255);
                        if ((var7 & 1) == 0) {
                          break L9;
                        } else {
                          tm.d((byte) -51);
                          break L9;
                        }
                      }
                      L10: {
                        if ((16 & var7) == 0) {
                          stackOut_39_0 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          break L10;
                        } else {
                          stackOut_38_0 = 1;
                          stackIn_40_0 = stackOut_38_0;
                          break L10;
                        }
                      }
                      L11: {
                        mg.field_l = stackIn_40_0 != 0;
                        if (param4) {
                          break L11;
                        } else {
                          L12: {
                            if (0 == (var7 & 2)) {
                              stackOut_43_0 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              break L12;
                            } else {
                              stackOut_42_0 = 1;
                              stackIn_44_0 = stackOut_42_0;
                              break L12;
                            }
                          }
                          L13: {
                            lh.field_g = stackIn_44_0 != 0;
                            if ((8 & var7) == 0) {
                              stackOut_46_0 = 0;
                              stackIn_47_0 = stackOut_46_0;
                              break L13;
                            } else {
                              stackOut_45_0 = 1;
                              stackIn_47_0 = stackOut_45_0;
                              break L13;
                            }
                          }
                          L14: {
                            ln.field_q = stackIn_47_0 != 0;
                            if ((4 & var7) == 0) {
                              stackOut_49_0 = 0;
                              stackIn_50_0 = stackOut_49_0;
                              break L14;
                            } else {
                              stackOut_48_0 = 1;
                              stackIn_50_0 = stackOut_48_0;
                              break L14;
                            }
                          }
                          wg.field_a = stackIn_50_0 != 0;
                          if (!ln.field_q) {
                            break L11;
                          } else {
                            lh.field_g = true;
                            break L11;
                          }
                        }
                      }
                      L15: {
                        if (vm.field_d) {
                          int discarded$10 = vi.field_o.f(255);
                          int discarded$11 = vi.field_o.f(255);
                          int discarded$12 = vi.field_o.k(0);
                          mo.field_k = vi.field_o.a((byte) -115);
                          dc.field_b = new byte[mo.field_k];
                          var8 = 0;
                          L16: while (true) {
                            if (~mo.field_k >= ~var8) {
                              break L15;
                            } else {
                              dc.field_b[var8] = vi.field_o.a(0);
                              var8++;
                              continue L16;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                      L17: {
                        kn.field_J = vi.field_o.h(5);
                        var11 = (CharSequence) (Object) kn.field_J;
                        eq.field_Hb = dh.a(var11, (byte) 54);
                        ra.field_g = vi.field_o.f(255);
                        uk.field_s = Pixelate.field_G;
                        if (li.field_g.b(-27096) == l.field_r) {
                          ig.field_e.a(ao.a(13867), -80419032);
                          break L17;
                        } else {
                          if (li.field_g.b(-27096) != te.field_Nb) {
                            break L17;
                          } else {
                            vm.field_a.a(ao.a(13867), -80419032);
                            break L17;
                          }
                        }
                      }
                      L18: {
                        qj.field_b = false;
                        if (var6_ref != null) {
                          rd.a(var6_ref, 126, ao.a(13867));
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        L20: {
                          if (uo.field_j > 0) {
                            break L20;
                          } else {
                            if (!wg.field_a) {
                              try {
                                L21: {
                                  Object discarded$13 = cq.a("unzap", (byte) -56, ao.a(13867));
                                  break L21;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L22: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L22;
                                }
                              }
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        try {
                          L23: {
                            int discarded$14 = -7067;
                            Object discarded$15 = cq.a(ao.a(13867), (byte) -37, new Object[1], "zap");
                            break L23;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L24: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L24;
                          }
                        }
                        break L19;
                      }
                      L25: {
                        if (uo.field_j <= 0) {
                          break L25;
                        } else {
                          uj.field_Lb = true;
                          break L25;
                        }
                      }
                      aa.field_f.a(0, ud.field_L);
                      var8 = 0;
                      L26: while (true) {
                        if (var8 >= 4) {
                          vi.field_o.a(0, ud.field_L);
                          stackOut_78_0 = mn.field_e;
                          stackIn_79_0 = stackOut_78_0;
                          return stackIn_79_0;
                        } else {
                          ud.field_L[var8] = ud.field_L[var8] + 50;
                          var8++;
                          continue L26;
                        }
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                L27: {
                  if (sl.field_b != uk.field_s) {
                    break L27;
                  } else {
                    int discarded$16 = -18481;
                    if (in.e()) {
                      L28: {
                        na.a(true);
                        if (mn.field_e != 7) {
                          break L28;
                        } else {
                          if (!qj.field_b) {
                            qj.field_b = true;
                            stackOut_91_0 = -1;
                            stackIn_92_0 = stackOut_91_0;
                            return stackIn_92_0;
                          } else {
                            break L28;
                          }
                        }
                      }
                      L29: {
                        if (mn.field_e == 7) {
                          mn.field_e = 3;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      gi.field_b = vi.field_o.h(5);
                      qj.field_b = false;
                      stackOut_89_0 = mn.field_e;
                      stackIn_90_0 = stackOut_89_0;
                      return stackIn_90_0;
                    } else {
                      break L27;
                    }
                  }
                }
                L30: {
                  var6_int = 51 % ((-18 - param1) / 46);
                  if (null == sh.field_e) {
                    if (!qj.field_b) {
                      var7 = gd.field_g;
                      gd.field_g = cd.field_b;
                      cd.field_b = var7;
                      qj.field_b = true;
                      break L30;
                    } else {
                      L31: {
                        int discarded$17 = 8;
                        if (no.d() <= 30000L) {
                          gi.field_b = ho.field_b;
                          break L31;
                        } else {
                          gi.field_b = vc.field_N;
                          break L31;
                        }
                      }
                      qj.field_b = false;
                      stackOut_99_0 = 3;
                      stackIn_100_0 = stackOut_99_0;
                      return stackIn_100_0;
                    }
                  } else {
                    break L30;
                  }
                }
                stackOut_102_0 = -1;
                stackIn_103_0 = stackOut_102_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L32: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_104_0 = (RuntimeException) var6;
                stackOut_104_1 = new StringBuilder().append("mi.B(").append(param0).append(',').append(param1).append(',');
                stackIn_106_0 = stackOut_104_0;
                stackIn_106_1 = stackOut_104_1;
                stackIn_105_0 = stackOut_104_0;
                stackIn_105_1 = stackOut_104_1;
                if (param2 == null) {
                  stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
                  stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
                  stackOut_106_2 = "null";
                  stackIn_107_0 = stackOut_106_0;
                  stackIn_107_1 = stackOut_106_1;
                  stackIn_107_2 = stackOut_106_2;
                  break L32;
                } else {
                  stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
                  stackOut_105_1 = (StringBuilder) (Object) stackIn_105_1;
                  stackOut_105_2 = "{...}";
                  stackIn_107_0 = stackOut_105_0;
                  stackIn_107_1 = stackOut_105_1;
                  stackIn_107_2 = stackOut_105_2;
                  break L32;
                }
              }
              L33: {
                stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
                stackOut_107_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_107_2).append(',').append(param3).append(',').append(param4).append(',');
                stackIn_109_0 = stackOut_107_0;
                stackIn_109_1 = stackOut_107_1;
                stackIn_108_0 = stackOut_107_0;
                stackIn_108_1 = stackOut_107_1;
                if (param5 == null) {
                  stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
                  stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
                  stackOut_109_2 = "null";
                  stackIn_110_0 = stackOut_109_0;
                  stackIn_110_1 = stackOut_109_1;
                  stackIn_110_2 = stackOut_109_2;
                  break L33;
                } else {
                  stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
                  stackOut_108_1 = (StringBuilder) (Object) stackIn_108_1;
                  stackOut_108_2 = "{...}";
                  stackIn_110_0 = stackOut_108_0;
                  stackIn_110_1 = stackOut_108_1;
                  stackIn_110_2 = stackOut_108_2;
                  break L33;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_110_0, stackIn_110_2 + ')');
            }
            return stackIn_103_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, float param1, int param2, String param3) {
        try {
            if (cn.field_b == null) {
                cn.field_b = new ko(wa.field_c, wp.field_a);
                wa.field_c.b(-6183, (ng) (Object) cn.field_b);
            }
            cn.field_b.a(param3, param1, 7595, param0);
            t.d();
            rj.a(94, true);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "mi.I(" + param0 + ',' + param1 + ',' + -1 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = de.field_h;
              if (param2 <= -72) {
                break L1;
              } else {
                field_o = true;
                break L1;
              }
            }
            L2: while (true) {
              if (var3_int >= vm.field_e.length) {
                stackOut_11_0 = -1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                L3: {
                  var5 = fo.field_a[var3_int];
                  if (var5 >= 0) {
                    var6 = sb.a(3, vm.field_e[var3_int], true);
                    var4 = var4 + ko.field_fb;
                    var7 = -(var6 >> 1) + qe.field_u;
                    if (!mn.a(param0, var4, 9, gk.field_fb + (bd.field_c << 1), var7 + -hc.field_J, param1, (hc.field_J << 1) + var6)) {
                      var4 = var4 + (gk.field_fb + ko.field_fb + (bd.field_c << 1));
                      break L3;
                    } else {
                      stackOut_7_0 = var5;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    }
                  } else {
                    var4 = var4 + hq.field_r;
                    break L3;
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "mi.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    final static void b(boolean param0) {
        ho.field_g.a(0, 18, 0, 256, -(!f.field_n ? 0 : 40 + hk.field_b - -4) + oc.field_O.field_K);
        if (param0) {
            field_o = false;
        }
        l.field_s.a(0, 18, -40 + (-hk.field_b + (oc.field_O.field_K + -2)), 256, 42 - -hk.field_b);
        jm.field_b.a(0, 2, (byte) 102, oc.field_O.field_K, 20, oc.field_O.field_nb - 20, hk.field_b);
    }

    static {
    }
}
