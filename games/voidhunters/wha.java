/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class wha implements dja {
    static int field_a;

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new crb[param1];
    }

    final static void a() {
        wga.field_a = new lwa(fh.field_g, lo.field_b, kn.field_p, qc.field_q, (llb) (Object) urb.field_o, iga.field_o);
    }

    final static void a(int param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        String[] stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        String[] stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        String[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        String stackIn_60_2 = null;
        String[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        String[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String stackIn_66_2 = null;
        int stackIn_85_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        String[] stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String stackOut_65_2 = null;
        String[] stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        String stackOut_64_2 = null;
        String[] stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        String[] stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        String stackOut_59_2 = null;
        String[] stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        String stackOut_58_2 = null;
        int stackOut_104_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              iv.field_o = param2;
              knb.field_o = true;
              if (iv.field_o == 0) {
                var3_int = wva.a(kjb.field_o, ob.field_l, 0, dib.field_j, boa.field_a);
                var4 = var3_int + 3;
                bra.field_f = new String[var4];
                edb.field_o = new int[var4];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    jeb.field_c = new int[2];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var3_int) {
                        bra.field_f[var4 + -3] = "";
                        bra.field_f[var4 + -2] = kg.field_s;
                        edb.field_o[var4 - 2] = 0;
                        jeb.field_c[0] = 4;
                        bra.field_f[var4 - 1] = wm.field_b;
                        edb.field_o[-1 + var4] = 1;
                        jeb.field_c[1] = 5;
                        break L1;
                      } else {
                        bra.field_f[var5] = ob.field_l[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    edb.field_o[var5] = -1;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (1 == iv.field_o) {
                  var3_int = wva.a(kjb.field_o, ob.field_l, 0, dib.field_j, boa.field_a);
                  var4 = 2 - -var3_int;
                  bra.field_f = new String[var4];
                  edb.field_o = new int[var4];
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= var4) {
                      jeb.field_c = new int[1];
                      var5 = 0;
                      L5: while (true) {
                        if (var3_int <= var5) {
                          bra.field_f[-2 + var4] = "";
                          bra.field_f[-1 + var4] = wm.field_b;
                          edb.field_o[var4 + -1] = 0;
                          jeb.field_c[0] = 5;
                          break L1;
                        } else {
                          bra.field_f[var5] = ob.field_l[var5];
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      edb.field_o[var5] = -1;
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  if (iv.field_o == 2) {
                    var3_int = wva.a(kjb.field_o, ob.field_l, 0, isa.a(wma.field_M, new String[1], 95), boa.field_a);
                    var4 = -1;
                    var5 = 0;
                    L6: while (true) {
                      L7: {
                        if (var5 >= var3_int) {
                          break L7;
                        } else {
                          if (!"<%0>".equals((Object) (Object) ob.field_l[var5])) {
                            var5++;
                            continue L6;
                          } else {
                            var4 = var5;
                            break L7;
                          }
                        }
                      }
                      if (var4 != -1) {
                        tj.field_k = new String[var4];
                        cua.a((Object[]) (Object) ob.field_l, 0, (Object[]) (Object) tj.field_k, 0, var4);
                        vg.field_p = new String[-var4 + (var3_int - 1)];
                        cua.a((Object[]) (Object) ob.field_l, var4 + 1, (Object[]) (Object) vg.field_p, 0, -1 + -var4 + var3_int);
                        var3_int = wva.a(kjb.field_o, ob.field_l, 0, isa.a(nda.field_o, new String[1], 88), boa.field_a);
                        var4 = -1;
                        var5 = 0;
                        L8: while (true) {
                          L9: {
                            if (var5 >= var3_int) {
                              break L9;
                            } else {
                              if (!"<%0>".equals((Object) (Object) ob.field_l[var5])) {
                                var5++;
                                continue L8;
                              } else {
                                var4 = var5;
                                break L9;
                              }
                            }
                          }
                          if (var4 != -1) {
                            L10: {
                              dha.field_q = new String[var4];
                              cua.a((Object[]) (Object) ob.field_l, 0, (Object[]) (Object) dha.field_q, 0, var4);
                              jha.field_o = new String[-var4 + (var3_int + -1)];
                              cua.a((Object[]) (Object) ob.field_l, var4 + 1, (Object[]) (Object) jha.field_o, 0, -1 + -var4 + var3_int);
                              if (tj.field_k.length >= dha.field_q.length) {
                                stackOut_48_0 = tj.field_k.length;
                                stackIn_49_0 = stackOut_48_0;
                                break L10;
                              } else {
                                stackOut_47_0 = dha.field_q.length;
                                stackIn_49_0 = stackOut_47_0;
                                break L10;
                              }
                            }
                            L11: {
                              var5 = stackIn_49_0;
                              if (jha.field_o.length <= vg.field_p.length) {
                                stackOut_51_0 = vg.field_p.length;
                                stackIn_52_0 = stackOut_51_0;
                                break L11;
                              } else {
                                stackOut_50_0 = jha.field_o.length;
                                stackIn_52_0 = stackOut_50_0;
                                break L11;
                              }
                            }
                            var6 = stackIn_52_0;
                            var7 = 7 - (-var5 - var6);
                            bra.field_f = new String[var7];
                            edb.field_o = new int[var7];
                            var8 = 0;
                            L12: while (true) {
                              if (var8 >= var7) {
                                bra.field_f[1] = amb.field_b;
                                jeb.field_c = new int[2];
                                bra.field_f[0] = kda.field_g;
                                edb.field_o[1] = 0;
                                bra.field_f[4] = inb.field_p;
                                edb.field_o[3] = 1;
                                bra.field_f[2] = vda.field_p;
                                jeb.field_c[0] = 5;
                                bra.field_f[3] = fja.field_r;
                                bra.field_f[5] = "";
                                jeb.field_c[1] = 2;
                                var8 = 0;
                                L13: while (true) {
                                  if (var5 <= var8) {
                                    bra.field_f[6 + var5] = null;
                                    edb.field_o[var5 + 6] = -2;
                                    var8 = 0;
                                    L14: while (true) {
                                      if (var8 >= var6) {
                                        break L1;
                                      } else {
                                        L15: {
                                          stackOut_63_0 = bra.field_f;
                                          stackOut_63_1 = var8 + (var5 + 7);
                                          stackIn_65_0 = stackOut_63_0;
                                          stackIn_65_1 = stackOut_63_1;
                                          stackIn_64_0 = stackOut_63_0;
                                          stackIn_64_1 = stackOut_63_1;
                                          if (var8 < jha.field_o.length) {
                                            stackOut_65_0 = (String[]) (Object) stackIn_65_0;
                                            stackOut_65_1 = stackIn_65_1;
                                            stackOut_65_2 = jha.field_o[var8];
                                            stackIn_66_0 = stackOut_65_0;
                                            stackIn_66_1 = stackOut_65_1;
                                            stackIn_66_2 = stackOut_65_2;
                                            break L15;
                                          } else {
                                            stackOut_64_0 = (String[]) (Object) stackIn_64_0;
                                            stackOut_64_1 = stackIn_64_1;
                                            stackOut_64_2 = "";
                                            stackIn_66_0 = stackOut_64_0;
                                            stackIn_66_1 = stackOut_64_1;
                                            stackIn_66_2 = stackOut_64_2;
                                            break L15;
                                          }
                                        }
                                        stackIn_66_0[stackIn_66_1] = stackIn_66_2;
                                        var8++;
                                        continue L14;
                                      }
                                    }
                                  } else {
                                    L16: {
                                      stackOut_57_0 = bra.field_f;
                                      stackOut_57_1 = var8 + 6;
                                      stackIn_59_0 = stackOut_57_0;
                                      stackIn_59_1 = stackOut_57_1;
                                      stackIn_58_0 = stackOut_57_0;
                                      stackIn_58_1 = stackOut_57_1;
                                      if (0 > -var5 + var8 + dha.field_q.length) {
                                        stackOut_59_0 = (String[]) (Object) stackIn_59_0;
                                        stackOut_59_1 = stackIn_59_1;
                                        stackOut_59_2 = "";
                                        stackIn_60_0 = stackOut_59_0;
                                        stackIn_60_1 = stackOut_59_1;
                                        stackIn_60_2 = stackOut_59_2;
                                        break L16;
                                      } else {
                                        stackOut_58_0 = (String[]) (Object) stackIn_58_0;
                                        stackOut_58_1 = stackIn_58_1;
                                        stackOut_58_2 = dha.field_q[dha.field_q.length + var8 - var5];
                                        stackIn_60_0 = stackOut_58_0;
                                        stackIn_60_1 = stackOut_58_1;
                                        stackIn_60_2 = stackOut_58_2;
                                        break L16;
                                      }
                                    }
                                    stackIn_60_0[stackIn_60_1] = stackIn_60_2;
                                    var8++;
                                    continue L13;
                                  }
                                }
                              } else {
                                edb.field_o[var8] = -1;
                                var8++;
                                continue L12;
                              }
                            }
                          } else {
                            throw new IllegalStateException();
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  } else {
                    if (iv.field_o != 3) {
                      if (iv.field_o == 4) {
                        var3_int = wva.a(kjb.field_o, ob.field_l, 0, r.field_m, boa.field_a);
                        var4 = var3_int + 2;
                        bra.field_f = new String[var4];
                        edb.field_o = new int[var4];
                        var5 = 0;
                        L17: while (true) {
                          if (var4 <= var5) {
                            jeb.field_c = new int[1];
                            var5 = 0;
                            L18: while (true) {
                              if (var3_int <= var5) {
                                bra.field_f[var4 - 2] = "";
                                bra.field_f[var4 - 1] = wm.field_b;
                                edb.field_o[-1 + var4] = 0;
                                jeb.field_c[0] = 5;
                                break L1;
                              } else {
                                bra.field_f[var5] = ob.field_l[var5];
                                var5++;
                                continue L18;
                              }
                            }
                          } else {
                            edb.field_o[var5] = -1;
                            var5++;
                            continue L17;
                          }
                        }
                      } else {
                        if (5 != iv.field_o) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = wva.a(kjb.field_o, ob.field_l, 0, tl.field_o, boa.field_a);
                          var4 = 3 - -var3_int;
                          bra.field_f = new String[var4];
                          edb.field_o = new int[var4];
                          var5 = 0;
                          L19: while (true) {
                            if (var4 <= var5) {
                              jeb.field_c = new int[2];
                              var5 = 0;
                              L20: while (true) {
                                if (var3_int <= var5) {
                                  bra.field_f[-3 + var4] = "";
                                  bra.field_f[-2 + var4] = nt.field_p;
                                  edb.field_o[var4 - 2] = 0;
                                  jeb.field_c[0] = 3;
                                  bra.field_f[var4 + -1] = wm.field_b;
                                  edb.field_o[var4 + -1] = 1;
                                  jeb.field_c[1] = 5;
                                  break L1;
                                } else {
                                  bra.field_f[var5] = ob.field_l[var5];
                                  var5++;
                                  continue L20;
                                }
                              }
                            } else {
                              edb.field_o[var5] = -1;
                              var5++;
                              continue L19;
                            }
                          }
                        }
                      }
                    } else {
                      L21: {
                        if (!bm.field_o.field_k) {
                          var3_int = wva.a(kjb.field_o, ob.field_l, 0, oda.field_t, boa.field_a);
                          break L21;
                        } else {
                          var3_int = wva.a(kjb.field_o, ob.field_l, 0, moa.field_n, boa.field_a);
                          break L21;
                        }
                      }
                      var4 = 2 - -var3_int;
                      edb.field_o = new int[var4];
                      bra.field_f = new String[var4];
                      var5 = 0;
                      L22: while (true) {
                        if (var4 <= var5) {
                          jeb.field_c = new int[1];
                          var5 = 0;
                          L23: while (true) {
                            if (var3_int <= var5) {
                              bra.field_f[var4 + -2] = "";
                              bra.field_f[var4 - 1] = wm.field_b;
                              edb.field_o[var4 - 1] = 0;
                              jeb.field_c[0] = 5;
                              break L1;
                            } else {
                              bra.field_f[var5] = ob.field_l[var5];
                              var5++;
                              continue L23;
                            }
                          }
                        } else {
                          edb.field_o[var5] = -1;
                          var5++;
                          continue L22;
                        }
                      }
                    }
                  }
                }
              }
            }
            mba.field_a.field_c = jeb.field_c.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (bra.field_f.length <= var4) {
                L25: {
                  if (iv.field_o != 2) {
                    break L25;
                  } else {
                    var10 = tj.field_k;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var10.length) {
                        var11 = vg.field_p;
                        var5 = 0;
                        L27: while (true) {
                          if (var5 >= var11.length) {
                            break L25;
                          } else {
                            L28: {
                              var13 = var11[var5];
                              var7 = ptb.a((byte) -107, false, var13);
                              if (var3_int >= var7) {
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                            var5++;
                            continue L27;
                          }
                        }
                      } else {
                        L29: {
                          var12 = var10[var5];
                          var7 = ptb.a((byte) -107, false, var12);
                          if (var7 <= var3_int) {
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        var5++;
                        continue L26;
                      }
                    }
                  }
                }
                sg.field_E = (lfa.field_m + ro.field_c << 1) * mba.field_a.field_c;
                var4 = 0;
                L30: while (true) {
                  if (bra.field_f.length <= var4) {
                    jrb.field_o = -(sg.field_E >> 1) + bba.field_d;
                    tm.field_o = new int[bra.field_f.length][];
                    var4 = 0;
                    var5 = jrb.field_o;
                    L31: while (true) {
                      if (bra.field_f.length <= var4) {
                        L32: {
                          if (2 != iv.field_o) {
                            mba.field_a.a(param1, -1, 0, uca.a(true, kc.field_b, uia.field_b));
                            break L32;
                          } else {
                            mba.field_a.a(param1, -1, -1, -1);
                            break L32;
                          }
                        }
                        break L0;
                      } else {
                        L33: {
                          var6 = edb.field_o[var4];
                          if (var6 < 0) {
                            var5 = var5 + u.field_r;
                            break L33;
                          } else {
                            var7 = ptb.a((byte) -107, true, bra.field_f[var4]);
                            var8 = -(var7 >> 1) + dv.field_f;
                            var5 = var5 + ro.field_c;
                            tm.field_o[var4] = new int[4];
                            tm.field_o[var4][0] = var8 - za.field_d;
                            tm.field_o[var4][1] = var5;
                            tm.field_o[var4][2] = var7 - -(za.field_d << 1);
                            tm.field_o[var4][3] = (lfa.field_m << 1) + rua.field_p;
                            var5 = var5 + ((lfa.field_m << 1) - (-ro.field_c - rua.field_p));
                            break L33;
                          }
                        }
                        var4++;
                        continue L31;
                      }
                    }
                  } else {
                    L34: {
                      stackOut_104_0 = sg.field_E;
                      stackIn_106_0 = stackOut_104_0;
                      stackIn_105_0 = stackOut_104_0;
                      if (edb.field_o[var4] >= 0) {
                        stackOut_106_0 = stackIn_106_0;
                        stackOut_106_1 = rua.field_p;
                        stackIn_107_0 = stackOut_106_0;
                        stackIn_107_1 = stackOut_106_1;
                        break L34;
                      } else {
                        stackOut_105_0 = stackIn_105_0;
                        stackOut_105_1 = u.field_r;
                        stackIn_107_0 = stackOut_105_0;
                        stackIn_107_1 = stackOut_105_1;
                        break L34;
                      }
                    }
                    sg.field_E = stackIn_107_0 + stackIn_107_1;
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L35: {
                  stackOut_84_0 = -107;
                  stackIn_86_0 = stackOut_84_0;
                  stackIn_85_0 = stackOut_84_0;
                  if (edb.field_o[var4] < 0) {
                    stackOut_86_0 = stackIn_86_0;
                    stackOut_86_1 = 0;
                    stackIn_87_0 = stackOut_86_0;
                    stackIn_87_1 = stackOut_86_1;
                    break L35;
                  } else {
                    stackOut_85_0 = stackIn_85_0;
                    stackOut_85_1 = 1;
                    stackIn_87_0 = stackOut_85_0;
                    stackIn_87_1 = stackOut_85_1;
                    break L35;
                  }
                }
                L36: {
                  var5 = ptb.a((byte) stackIn_87_0, stackIn_87_1 != 0, bra.field_f[var4]);
                  if (var3_int < var5) {
                    var3_int = var5;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                var4++;
                continue L24;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "wha.C(" + 2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public final tv a(byte param0) {
        int var2 = -12 % ((param0 - -64) / 50);
        return (tv) (Object) new crb();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 11;
    }
}
