/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class nm {
    static char field_d;
    static int[] field_a;
    static int field_b;
    static String field_c;

    final static boolean c(int param0) {
        if (param0 != 2) {
            Object var2 = null;
            boolean discarded$0 = nm.a((java.applet.Applet) null, 111);
        }
        return 250 < kf.field_e ? true : false;
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 26523) {
            field_c = null;
        }
    }

    final static void b(int param0) {
        la.field_n = false;
        rj.field_d = null;
        de.field_rb = null;
        if (param0 != 1) {
            Object var2 = null;
            nm.a((byte[]) null, (rm[]) null, (int[]) null, (String[][]) null, (byte[]) null, (eh) null, 27, (String[]) null, (String[][]) null, (mg[][]) null, true, (mg[][]) null, -1, (int[]) null, (byte) -43, (String[]) null, (eh) null, (eh) null, 123);
        }
        eh.field_j = null;
        dh.field_o = null;
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_8_0 = 0;
            int stackIn_15_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_13_0 = 0;
            var7 = Virogrid.field_F ? 1 : 0;
            if (!af.field_i) {
              try {
                L0: {
                  L1: {
                    var2 = "tuhstatbut";
                    var3 = (String) q.b("getcookies", 6168, param0);
                    var4 = ql.a(var3, (byte) -123, ';');
                    var5 = 0;
                    if (param1 >= 77) {
                      break L1;
                    } else {
                      field_b = -17;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var4.length <= var5) {
                      break L0;
                    } else {
                      L3: {
                        var6 = var4[var5].indexOf('=');
                        if ((var6 ^ -1) > -1) {
                          break L3;
                        } else {
                          if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                            break L3;
                          } else {
                            stackOut_7_0 = 1;
                            stackIn_8_0 = stackOut_7_0;
                            return stackIn_8_0 != 0;
                          }
                        }
                      }
                      var5++;
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var2_ref = decompiledCaughtException;
                  break L4;
                }
              }
              L5: {
                if (null == param0.getParameter("tuhstatbut")) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L5;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L5;
                }
              }
              return stackIn_15_0 != 0;
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte[] param0, rm[] param1, int[] param2, String[][] param3, byte[] param4, eh param5, int param6, String[] param7, String[][] param8, mg[][] param9, boolean param10, mg[][] param11, int param12, int[] param13, byte param14, String[] param15, eh param16, eh param17, int param18) {
        if (param14 > -65) {
            nm.a(true, -102, (byte) 44);
        }
        Object var20 = null;
        jg.a(param7, (String[]) null, param8, param0, param16, param11, param3, param4, param12, 1, param10, param1, param18, param5, param2, param17, (byte) 99, param13, param15, param9);
    }

    final static void a(boolean param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String[] var12 = null;
        String var13 = null;
        String var14 = null;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        String[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        String[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        String[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        String stackIn_62_2 = null;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_68_2 = null;
        int stackIn_87_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        String stackOut_67_2 = null;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String stackOut_66_2 = null;
        String[] stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        String[] stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        String stackOut_61_2 = null;
        String[] stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        String stackOut_60_2 = null;
        int stackOut_105_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        L0: {
          var10 = Virogrid.field_F ? 1 : 0;
          p.field_d = param1;
          var3 = 120 / ((-14 - param2) / 41);
          la.field_n = true;
          if (p.field_d == 0) {
            var4 = sf.a((byte) 124, re.field_n, j.field_h, rf.field_b, fb.field_l);
            var5 = 3 + var4;
            mn.field_c = new String[var5];
            wg.field_h = new int[var5];
            var6 = 0;
            L1: while (true) {
              if (var5 <= var6) {
                rb.field_a = new int[2];
                var6 = 0;
                L2: while (true) {
                  if (var4 <= var6) {
                    mn.field_c[-3 + var5] = "";
                    mn.field_c[-2 + var5] = vi.field_m;
                    wg.field_h[-2 + var5] = 0;
                    rb.field_a[0] = 4;
                    mn.field_c[-1 + var5] = je.field_I;
                    wg.field_h[var5 - 1] = 1;
                    rb.field_a[1] = 5;
                    break L0;
                  } else {
                    mn.field_c[var6] = fb.field_l[var6];
                    var6++;
                    continue L2;
                  }
                }
              } else {
                wg.field_h[var6] = -1;
                var6++;
                continue L1;
              }
            }
          } else {
            if (1 == p.field_d) {
              var4 = sf.a((byte) 125, re.field_n, j.field_h, rf.field_b, fb.field_l);
              var5 = var4 + 2;
              wg.field_h = new int[var5];
              mn.field_c = new String[var5];
              var6 = 0;
              L3: while (true) {
                if (var5 <= var6) {
                  rb.field_a = new int[1];
                  var6 = 0;
                  L4: while (true) {
                    if (var6 >= var4) {
                      mn.field_c[-2 + var5] = "";
                      mn.field_c[var5 - 1] = je.field_I;
                      wg.field_h[-1 + var5] = 0;
                      rb.field_a[0] = 5;
                      break L0;
                    } else {
                      mn.field_c[var6] = fb.field_l[var6];
                      var6++;
                      continue L4;
                    }
                  }
                } else {
                  wg.field_h[var6] = -1;
                  var6++;
                  continue L3;
                }
              }
            } else {
              if (2 == p.field_d) {
                var4 = sf.a((byte) 121, oi.a(new String[1], ji.field_d, 2), j.field_h, rf.field_b, fb.field_l);
                var5 = -1;
                var6 = 0;
                L5: while (true) {
                  L6: {
                    if (var6 >= var4) {
                      break L6;
                    } else {
                      if ("<%0>".equals((Object) (Object) fb.field_l[var6])) {
                        var5 = var6;
                        break L6;
                      } else {
                        var6++;
                        continue L5;
                      }
                    }
                  }
                  if (0 != (var5 ^ -1)) {
                    rj.field_d = new String[var5];
                    ek.a((Object[]) (Object) fb.field_l, 0, (Object[]) (Object) rj.field_d, 0, var5);
                    eh.field_j = new String[-1 + var4 + -var5];
                    ek.a((Object[]) (Object) fb.field_l, 1 + var5, (Object[]) (Object) eh.field_j, 0, -var5 + var4 - 1);
                    var4 = sf.a((byte) 124, oi.a(new String[1], mh.field_e, 2), j.field_h, rf.field_b, fb.field_l);
                    var5 = -1;
                    var6 = 0;
                    L7: while (true) {
                      L8: {
                        if (var4 <= var6) {
                          break L8;
                        } else {
                          if ("<%0>".equals((Object) (Object) fb.field_l[var6])) {
                            var5 = var6;
                            break L8;
                          } else {
                            var6++;
                            continue L7;
                          }
                        }
                      }
                      if ((var5 ^ -1) == 0) {
                        throw new IllegalStateException();
                      } else {
                        L9: {
                          dh.field_o = new String[var5];
                          ek.a((Object[]) (Object) fb.field_l, 0, (Object[]) (Object) dh.field_o, 0, var5);
                          de.field_rb = new String[-var5 + var4 + -1];
                          ek.a((Object[]) (Object) fb.field_l, var5 + 1, (Object[]) (Object) de.field_rb, 0, -var5 + (var4 - 1));
                          if (dh.field_o.length > rj.field_d.length) {
                            stackOut_50_0 = dh.field_o.length;
                            stackIn_51_0 = stackOut_50_0;
                            break L9;
                          } else {
                            stackOut_49_0 = rj.field_d.length;
                            stackIn_51_0 = stackOut_49_0;
                            break L9;
                          }
                        }
                        L10: {
                          var6 = stackIn_51_0;
                          if (de.field_rb.length <= eh.field_j.length) {
                            stackOut_53_0 = eh.field_j.length;
                            stackIn_54_0 = stackOut_53_0;
                            break L10;
                          } else {
                            stackOut_52_0 = de.field_rb.length;
                            stackIn_54_0 = stackOut_52_0;
                            break L10;
                          }
                        }
                        var7 = stackIn_54_0;
                        var8 = var7 + (var6 + 7);
                        wg.field_h = new int[var8];
                        mn.field_c = new String[var8];
                        var9 = 0;
                        L11: while (true) {
                          if (var8 <= var9) {
                            rb.field_a = new int[2];
                            mn.field_c[1] = sl.field_c;
                            wg.field_h[1] = 0;
                            mn.field_c[0] = mm.field_b;
                            mn.field_c[4] = ud.field_d;
                            mn.field_c[5] = "";
                            rb.field_a[0] = 5;
                            mn.field_c[2] = dk.field_u;
                            wg.field_h[3] = 1;
                            rb.field_a[1] = 2;
                            mn.field_c[3] = eb.field_a;
                            var9 = 0;
                            L12: while (true) {
                              if (var9 >= var6) {
                                mn.field_c[var6 + 6] = null;
                                wg.field_h[var6 + 6] = -2;
                                var9 = 0;
                                L13: while (true) {
                                  if (var9 >= var7) {
                                    af.field_e = hc.a(-9986);
                                    break L0;
                                  } else {
                                    L14: {
                                      stackOut_65_0 = mn.field_c;
                                      stackOut_65_1 = 7 - (-var6 + -var9);
                                      stackIn_67_0 = stackOut_65_0;
                                      stackIn_67_1 = stackOut_65_1;
                                      stackIn_66_0 = stackOut_65_0;
                                      stackIn_66_1 = stackOut_65_1;
                                      if (de.field_rb.length > var9) {
                                        stackOut_67_0 = (String[]) (Object) stackIn_67_0;
                                        stackOut_67_1 = stackIn_67_1;
                                        stackOut_67_2 = de.field_rb[var9];
                                        stackIn_68_0 = stackOut_67_0;
                                        stackIn_68_1 = stackOut_67_1;
                                        stackIn_68_2 = stackOut_67_2;
                                        break L14;
                                      } else {
                                        stackOut_66_0 = (String[]) (Object) stackIn_66_0;
                                        stackOut_66_1 = stackIn_66_1;
                                        stackOut_66_2 = "";
                                        stackIn_68_0 = stackOut_66_0;
                                        stackIn_68_1 = stackOut_66_1;
                                        stackIn_68_2 = stackOut_66_2;
                                        break L14;
                                      }
                                    }
                                    stackIn_68_0[stackIn_68_1] = stackIn_68_2;
                                    var9++;
                                    continue L13;
                                  }
                                }
                              } else {
                                L15: {
                                  stackOut_59_0 = mn.field_c;
                                  stackOut_59_1 = 6 + var9;
                                  stackIn_61_0 = stackOut_59_0;
                                  stackIn_61_1 = stackOut_59_1;
                                  stackIn_60_0 = stackOut_59_0;
                                  stackIn_60_1 = stackOut_59_1;
                                  if (var9 + dh.field_o.length + -var6 < 0) {
                                    stackOut_61_0 = (String[]) (Object) stackIn_61_0;
                                    stackOut_61_1 = stackIn_61_1;
                                    stackOut_61_2 = "";
                                    stackIn_62_0 = stackOut_61_0;
                                    stackIn_62_1 = stackOut_61_1;
                                    stackIn_62_2 = stackOut_61_2;
                                    break L15;
                                  } else {
                                    stackOut_60_0 = (String[]) (Object) stackIn_60_0;
                                    stackOut_60_1 = stackIn_60_1;
                                    stackOut_60_2 = dh.field_o[-var6 + var9 + dh.field_o.length];
                                    stackIn_62_0 = stackOut_60_0;
                                    stackIn_62_1 = stackOut_60_1;
                                    stackIn_62_2 = stackOut_60_2;
                                    break L15;
                                  }
                                }
                                stackIn_62_0[stackIn_62_1] = stackIn_62_2;
                                var9++;
                                continue L12;
                              }
                            }
                          } else {
                            wg.field_h[var9] = -1;
                            var9++;
                            continue L11;
                          }
                        }
                      }
                    }
                  } else {
                    throw new IllegalStateException();
                  }
                }
              } else {
                if ((p.field_d ^ -1) != -4) {
                  if (-5 != (p.field_d ^ -1)) {
                    if (p.field_d != 5) {
                      throw new IllegalArgumentException();
                    } else {
                      var4 = sf.a((byte) 123, el.field_i, j.field_h, rf.field_b, fb.field_l);
                      var5 = var4 + 3;
                      mn.field_c = new String[var5];
                      wg.field_h = new int[var5];
                      var6 = 0;
                      L16: while (true) {
                        if (var6 >= var5) {
                          rb.field_a = new int[2];
                          var6 = 0;
                          L17: while (true) {
                            if (var6 >= var4) {
                              mn.field_c[-3 + var5] = "";
                              mn.field_c[-2 + var5] = vf.field_a;
                              wg.field_h[-2 + var5] = 0;
                              rb.field_a[0] = 3;
                              mn.field_c[-1 + var5] = je.field_I;
                              wg.field_h[var5 + -1] = 1;
                              rb.field_a[1] = 5;
                              break L0;
                            } else {
                              mn.field_c[var6] = fb.field_l[var6];
                              var6++;
                              continue L17;
                            }
                          }
                        } else {
                          wg.field_h[var6] = -1;
                          var6++;
                          continue L16;
                        }
                      }
                    }
                  } else {
                    var4 = sf.a((byte) 120, tl.field_j, j.field_h, rf.field_b, fb.field_l);
                    var5 = var4 + 2;
                    wg.field_h = new int[var5];
                    mn.field_c = new String[var5];
                    var6 = 0;
                    L18: while (true) {
                      if (var5 <= var6) {
                        rb.field_a = new int[1];
                        var6 = 0;
                        L19: while (true) {
                          if (var6 >= var4) {
                            mn.field_c[-2 + var5] = "";
                            mn.field_c[var5 - 1] = je.field_I;
                            wg.field_h[-1 + var5] = 0;
                            rb.field_a[0] = 5;
                            break L0;
                          } else {
                            mn.field_c[var6] = fb.field_l[var6];
                            var6++;
                            continue L19;
                          }
                        }
                      } else {
                        wg.field_h[var6] = -1;
                        var6++;
                        continue L18;
                      }
                    }
                  }
                } else {
                  L20: {
                    if (!ei.field_c.field_a) {
                      var4 = sf.a((byte) 127, fd.field_x, j.field_h, rf.field_b, fb.field_l);
                      break L20;
                    } else {
                      var4 = sf.a((byte) 120, eh.field_h, j.field_h, rf.field_b, fb.field_l);
                      break L20;
                    }
                  }
                  var5 = 2 + var4;
                  mn.field_c = new String[var5];
                  wg.field_h = new int[var5];
                  var6 = 0;
                  L21: while (true) {
                    if (var6 >= var5) {
                      rb.field_a = new int[1];
                      var6 = 0;
                      L22: while (true) {
                        if (var4 <= var6) {
                          mn.field_c[-2 + var5] = "";
                          mn.field_c[var5 - 1] = je.field_I;
                          wg.field_h[var5 + -1] = 0;
                          rb.field_a[0] = 5;
                          break L0;
                        } else {
                          mn.field_c[var6] = fb.field_l[var6];
                          var6++;
                          continue L22;
                        }
                      }
                    } else {
                      wg.field_h[var6] = -1;
                      var6++;
                      continue L21;
                    }
                  }
                }
              }
            }
          }
        }
        co.field_k.field_o = rb.field_a.length;
        var4 = 0;
        var5 = 0;
        L23: while (true) {
          if (var5 >= mn.field_c.length) {
            L24: {
              if ((p.field_d ^ -1) != -3) {
                break L24;
              } else {
                var11 = rj.field_d;
                var6 = 0;
                L25: while (true) {
                  if (var11.length <= var6) {
                    var12 = eh.field_j;
                    var6 = 0;
                    L26: while (true) {
                      if (var12.length <= var6) {
                        break L24;
                      } else {
                        var14 = var12[var6];
                        var8 = gl.a(1492912648, false, var14);
                        if (var8 > var4) {
                          var4 = var8;
                          var6++;
                          continue L26;
                        } else {
                          var6++;
                          continue L26;
                        }
                      }
                    }
                  } else {
                    var13 = var11[var6];
                    var8 = gl.a(1492912648, false, var13);
                    if (var4 < var8) {
                      var4 = var8;
                      var6++;
                      continue L25;
                    } else {
                      var6++;
                      continue L25;
                    }
                  }
                }
              }
            }
            sg.field_n = co.field_k.field_o * (bj.field_j - -oh.field_d << 1164788929);
            qg.field_g = var4 + hn.field_q - (var4 >> 1816895553);
            gi.field_c = -(var4 >> 1850004545) + hn.field_q;
            var5 = 0;
            L27: while (true) {
              if (mn.field_c.length <= var5) {
                ih.field_a = -(sg.field_n >> 1815736801) + ad.field_i;
                hn.field_v = new int[mn.field_c.length][];
                var5 = 0;
                var6 = ih.field_a;
                L28: while (true) {
                  if (var5 >= mn.field_c.length) {
                    L29: {
                      if ((p.field_d ^ -1) != -3) {
                        co.field_k.a(param0, pn.a(hk.field_Jb, nl.field_u, (byte) 111), -563, 0);
                        break L29;
                      } else {
                        co.field_k.a(param0, -1, -563, -1);
                        break L29;
                      }
                    }
                    return;
                  } else {
                    var7 = wg.field_h[var5];
                    if (-1 < (var7 ^ -1)) {
                      var6 = var6 + re.field_m;
                      var5++;
                      continue L28;
                    } else {
                      var8 = gl.a(1492912648, true, mn.field_c[var5]);
                      var6 = var6 + oh.field_d;
                      var9 = -(var8 >> 2030858689) + hn.field_q;
                      hn.field_v[var5] = new int[4];
                      hn.field_v[var5][0] = var9 + -eh.field_d;
                      hn.field_v[var5][1] = var6;
                      hn.field_v[var5][2] = (eh.field_d << -259916703) + var8;
                      var6 = var6 + ((bj.field_j << -444381151) + (oh.field_d - -mi.field_c));
                      hn.field_v[var5][3] = (bj.field_j << -306212863) + mi.field_c;
                      var5++;
                      continue L28;
                    }
                  }
                }
              } else {
                L30: {
                  stackOut_105_0 = sg.field_n;
                  stackIn_107_0 = stackOut_105_0;
                  stackIn_106_0 = stackOut_105_0;
                  if ((wg.field_h[var5] ^ -1) <= -1) {
                    stackOut_107_0 = stackIn_107_0;
                    stackOut_107_1 = mi.field_c;
                    stackIn_108_0 = stackOut_107_0;
                    stackIn_108_1 = stackOut_107_1;
                    break L30;
                  } else {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = re.field_m;
                    stackIn_108_0 = stackOut_106_0;
                    stackIn_108_1 = stackOut_106_1;
                    break L30;
                  }
                }
                sg.field_n = stackIn_108_0 + stackIn_108_1;
                var5++;
                continue L27;
              }
            }
          } else {
            L31: {
              stackOut_86_0 = 1492912648;
              stackIn_88_0 = stackOut_86_0;
              stackIn_87_0 = stackOut_86_0;
              if (wg.field_h[var5] < 0) {
                stackOut_88_0 = stackIn_88_0;
                stackOut_88_1 = 0;
                stackIn_89_0 = stackOut_88_0;
                stackIn_89_1 = stackOut_88_1;
                break L31;
              } else {
                stackOut_87_0 = stackIn_87_0;
                stackOut_87_1 = 1;
                stackIn_89_0 = stackOut_87_0;
                stackIn_89_1 = stackOut_87_1;
                break L31;
              }
            }
            var6 = gl.a(stackIn_89_0, stackIn_89_1 != 0, mn.field_c[var5]);
            if (var4 < var6) {
              var4 = var6;
              var5++;
              continue L23;
            } else {
              var5++;
              continue L23;
            }
          }
        }
    }

    final static void d(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (w.field_L == null) {
            break L0;
          } else {
            var1 = (Object) (Object) w.field_L;
            synchronized (var1) {
              L1: {
                w.field_L = null;
                break L1;
              }
            }
            break L0;
          }
        }
        L2: {
          if (param0 >= 109) {
            break L2;
          } else {
            field_c = null;
            break L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = new int[8192];
        field_c = "You have entered another game.";
    }
}
