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

    final static void a(int param0) {
        if (param0 != 29012) {
            field_a = 71;
        }
        wga.field_a = new lwa(fh.field_g, lo.field_b, kn.field_p, qc.field_q, (llb) (Object) urb.field_o, iga.field_o);
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
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
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        String[] stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        String[] stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        String[] stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        String stackIn_59_2 = null;
        String[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        String[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        String[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        String stackIn_65_2 = null;
        int stackIn_84_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        String[] stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        String[] stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        String stackOut_64_2 = null;
        String[] stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        String stackOut_63_2 = null;
        String[] stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        String[] stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        String stackOut_58_2 = null;
        String[] stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        String stackOut_57_2 = null;
        int stackOut_102_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          iv.field_o = param2;
          knb.field_o = true;
          if (iv.field_o == 0) {
            var3 = wva.a(kjb.field_o, ob.field_l, 0, dib.field_j, boa.field_a);
            var4 = var3 + 3;
            bra.field_f = new String[var4];
            edb.field_o = new int[var4];
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                jeb.field_c = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
                    bra.field_f[var4 + -3] = "";
                    bra.field_f[var4 + -2] = kg.field_s;
                    edb.field_o[var4 - 2] = 0;
                    jeb.field_c[0] = 4;
                    bra.field_f[var4 - 1] = wm.field_b;
                    edb.field_o[-1 + var4] = 1;
                    jeb.field_c[1] = 5;
                    break L0;
                  } else {
                    bra.field_f[var5] = ob.field_l[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                edb.field_o[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (1 == iv.field_o) {
              var3 = wva.a(kjb.field_o, ob.field_l, 0, dib.field_j, boa.field_a);
              var4 = 2 - -var3;
              bra.field_f = new String[var4];
              edb.field_o = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (var5 >= var4) {
                  jeb.field_c = new int[1];
                  var5 = 0;
                  L4: while (true) {
                    if (var3 <= var5) {
                      bra.field_f[-2 + var4] = "";
                      bra.field_f[-1 + var4] = wm.field_b;
                      edb.field_o[var4 + -1] = 0;
                      jeb.field_c[0] = 5;
                      break L0;
                    } else {
                      bra.field_f[var5] = ob.field_l[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  edb.field_o[var5] = -1;
                  var5++;
                  continue L3;
                }
              }
            } else {
              if (-3 == (iv.field_o ^ -1)) {
                var3 = wva.a(kjb.field_o, ob.field_l, 0, isa.a(wma.field_M, new String[1], param0 + 93), boa.field_a);
                var4 = -1;
                var5 = 0;
                L5: while (true) {
                  L6: {
                    if (var5 >= var3) {
                      break L6;
                    } else {
                      if (!"<%0>".equals((Object) (Object) ob.field_l[var5])) {
                        var5++;
                        continue L5;
                      } else {
                        var4 = var5;
                        break L6;
                      }
                    }
                  }
                  if (var4 != -1) {
                    tj.field_k = new String[var4];
                    cua.a((Object[]) (Object) ob.field_l, 0, (Object[]) (Object) tj.field_k, 0, var4);
                    vg.field_p = new String[-var4 + (var3 - 1)];
                    cua.a((Object[]) (Object) ob.field_l, var4 + 1, (Object[]) (Object) vg.field_p, 0, -1 + -var4 + var3);
                    var3 = wva.a(kjb.field_o, ob.field_l, 0, isa.a(nda.field_o, new String[1], 88), boa.field_a);
                    var4 = -1;
                    var5 = 0;
                    L7: while (true) {
                      L8: {
                        if (var5 >= var3) {
                          break L8;
                        } else {
                          if (!"<%0>".equals((Object) (Object) ob.field_l[var5])) {
                            var5++;
                            continue L7;
                          } else {
                            var4 = var5;
                            break L8;
                          }
                        }
                      }
                      if ((var4 ^ -1) != 0) {
                        L9: {
                          dha.field_q = new String[var4];
                          cua.a((Object[]) (Object) ob.field_l, 0, (Object[]) (Object) dha.field_q, 0, var4);
                          jha.field_o = new String[-var4 + (var3 + -1)];
                          cua.a((Object[]) (Object) ob.field_l, var4 + 1, (Object[]) (Object) jha.field_o, 0, -1 + -var4 + var3);
                          if (tj.field_k.length >= dha.field_q.length) {
                            stackOut_47_0 = tj.field_k.length;
                            stackIn_48_0 = stackOut_47_0;
                            break L9;
                          } else {
                            stackOut_46_0 = dha.field_q.length;
                            stackIn_48_0 = stackOut_46_0;
                            break L9;
                          }
                        }
                        L10: {
                          var5 = stackIn_48_0;
                          if (jha.field_o.length <= vg.field_p.length) {
                            stackOut_50_0 = vg.field_p.length;
                            stackIn_51_0 = stackOut_50_0;
                            break L10;
                          } else {
                            stackOut_49_0 = jha.field_o.length;
                            stackIn_51_0 = stackOut_49_0;
                            break L10;
                          }
                        }
                        var6 = stackIn_51_0;
                        var7 = 7 - (-var5 - var6);
                        bra.field_f = new String[var7];
                        edb.field_o = new int[var7];
                        var8 = 0;
                        L11: while (true) {
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
                            L12: while (true) {
                              if (var5 <= var8) {
                                bra.field_f[6 + var5] = null;
                                edb.field_o[var5 + 6] = -2;
                                var8 = 0;
                                L13: while (true) {
                                  if (var8 >= var6) {
                                    break L0;
                                  } else {
                                    L14: {
                                      stackOut_62_0 = bra.field_f;
                                      stackOut_62_1 = var8 + (var5 + 7);
                                      stackIn_64_0 = stackOut_62_0;
                                      stackIn_64_1 = stackOut_62_1;
                                      stackIn_63_0 = stackOut_62_0;
                                      stackIn_63_1 = stackOut_62_1;
                                      if (var8 < jha.field_o.length) {
                                        stackOut_64_0 = (String[]) (Object) stackIn_64_0;
                                        stackOut_64_1 = stackIn_64_1;
                                        stackOut_64_2 = jha.field_o[var8];
                                        stackIn_65_0 = stackOut_64_0;
                                        stackIn_65_1 = stackOut_64_1;
                                        stackIn_65_2 = stackOut_64_2;
                                        break L14;
                                      } else {
                                        stackOut_63_0 = (String[]) (Object) stackIn_63_0;
                                        stackOut_63_1 = stackIn_63_1;
                                        stackOut_63_2 = "";
                                        stackIn_65_0 = stackOut_63_0;
                                        stackIn_65_1 = stackOut_63_1;
                                        stackIn_65_2 = stackOut_63_2;
                                        break L14;
                                      }
                                    }
                                    stackIn_65_0[stackIn_65_1] = stackIn_65_2;
                                    var8++;
                                    continue L13;
                                  }
                                }
                              } else {
                                L15: {
                                  stackOut_56_0 = bra.field_f;
                                  stackOut_56_1 = var8 + 6;
                                  stackIn_58_0 = stackOut_56_0;
                                  stackIn_58_1 = stackOut_56_1;
                                  stackIn_57_0 = stackOut_56_0;
                                  stackIn_57_1 = stackOut_56_1;
                                  if (0 > -var5 + var8 + dha.field_q.length) {
                                    stackOut_58_0 = (String[]) (Object) stackIn_58_0;
                                    stackOut_58_1 = stackIn_58_1;
                                    stackOut_58_2 = "";
                                    stackIn_59_0 = stackOut_58_0;
                                    stackIn_59_1 = stackOut_58_1;
                                    stackIn_59_2 = stackOut_58_2;
                                    break L15;
                                  } else {
                                    stackOut_57_0 = (String[]) (Object) stackIn_57_0;
                                    stackOut_57_1 = stackIn_57_1;
                                    stackOut_57_2 = dha.field_q[dha.field_q.length + var8 - var5];
                                    stackIn_59_0 = stackOut_57_0;
                                    stackIn_59_1 = stackOut_57_1;
                                    stackIn_59_2 = stackOut_57_2;
                                    break L15;
                                  }
                                }
                                stackIn_59_0[stackIn_59_1] = stackIn_59_2;
                                var8++;
                                continue L12;
                              }
                            }
                          } else {
                            edb.field_o[var8] = -1;
                            var8++;
                            continue L11;
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
                  if ((iv.field_o ^ -1) == -5) {
                    var3 = wva.a(kjb.field_o, ob.field_l, 0, r.field_m, boa.field_a);
                    var4 = var3 + 2;
                    bra.field_f = new String[var4];
                    edb.field_o = new int[var4];
                    var5 = 0;
                    L16: while (true) {
                      if (var4 <= var5) {
                        jeb.field_c = new int[1];
                        var5 = 0;
                        L17: while (true) {
                          if (var3 <= var5) {
                            bra.field_f[var4 - 2] = "";
                            bra.field_f[var4 - 1] = wm.field_b;
                            edb.field_o[-1 + var4] = 0;
                            jeb.field_c[0] = 5;
                            break L0;
                          } else {
                            bra.field_f[var5] = ob.field_l[var5];
                            var5++;
                            continue L17;
                          }
                        }
                      } else {
                        edb.field_o[var5] = -1;
                        var5++;
                        continue L16;
                      }
                    }
                  } else {
                    if (5 != iv.field_o) {
                      throw new IllegalArgumentException();
                    } else {
                      var3 = wva.a(kjb.field_o, ob.field_l, param0 + -2, tl.field_o, boa.field_a);
                      var4 = 3 - -var3;
                      bra.field_f = new String[var4];
                      edb.field_o = new int[var4];
                      var5 = 0;
                      L18: while (true) {
                        if (var4 <= var5) {
                          jeb.field_c = new int[2];
                          var5 = 0;
                          L19: while (true) {
                            if (var3 <= var5) {
                              bra.field_f[-3 + var4] = "";
                              bra.field_f[-2 + var4] = nt.field_p;
                              edb.field_o[var4 - 2] = 0;
                              jeb.field_c[0] = 3;
                              bra.field_f[var4 + -1] = wm.field_b;
                              edb.field_o[var4 + -1] = 1;
                              jeb.field_c[1] = 5;
                              break L0;
                            } else {
                              bra.field_f[var5] = ob.field_l[var5];
                              var5++;
                              continue L19;
                            }
                          }
                        } else {
                          edb.field_o[var5] = -1;
                          var5++;
                          continue L18;
                        }
                      }
                    }
                  }
                } else {
                  L20: {
                    if (!bm.field_o.field_k) {
                      var3 = wva.a(kjb.field_o, ob.field_l, 0, oda.field_t, boa.field_a);
                      break L20;
                    } else {
                      var3 = wva.a(kjb.field_o, ob.field_l, param0 ^ 2, moa.field_n, boa.field_a);
                      break L20;
                    }
                  }
                  var4 = 2 - -var3;
                  edb.field_o = new int[var4];
                  bra.field_f = new String[var4];
                  var5 = 0;
                  L21: while (true) {
                    if (var4 <= var5) {
                      jeb.field_c = new int[1];
                      var5 = 0;
                      L22: while (true) {
                        if (var3 <= var5) {
                          bra.field_f[var4 + -2] = "";
                          bra.field_f[var4 - 1] = wm.field_b;
                          edb.field_o[var4 - 1] = 0;
                          jeb.field_c[0] = 5;
                          break L0;
                        } else {
                          bra.field_f[var5] = ob.field_l[var5];
                          var5++;
                          continue L22;
                        }
                      }
                    } else {
                      edb.field_o[var5] = -1;
                      var5++;
                      continue L21;
                    }
                  }
                }
              }
            }
          }
        }
        mba.field_a.field_c = jeb.field_c.length;
        var3 = 0;
        var4 = 0;
        L23: while (true) {
          if (bra.field_f.length <= var4) {
            L24: {
              if ((iv.field_o ^ -1) != -3) {
                break L24;
              } else {
                var10 = tj.field_k;
                var5 = 0;
                L25: while (true) {
                  if (var5 >= var10.length) {
                    var11 = vg.field_p;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var11.length) {
                        break L24;
                      } else {
                        var13 = var11[var5];
                        var7 = ptb.a((byte) -107, false, var13);
                        if (var3 < var7) {
                          var3 = var7;
                          var5++;
                          continue L26;
                        } else {
                          var5++;
                          continue L26;
                        }
                      }
                    }
                  } else {
                    var12 = var10[var5];
                    var7 = ptb.a((byte) -107, false, var12);
                    if (var7 > var3) {
                      var3 = var7;
                      var5++;
                      continue L25;
                    } else {
                      var5++;
                      continue L25;
                    }
                  }
                }
              }
            }
            sg.field_E = (lfa.field_m + ro.field_c << -1921525375) * mba.field_a.field_c;
            var4 = 0;
            L27: while (true) {
              if (bra.field_f.length <= var4) {
                jrb.field_o = -(sg.field_E >> -1150849375) + bba.field_d;
                tm.field_o = new int[bra.field_f.length][];
                var4 = 0;
                var5 = jrb.field_o;
                L28: while (true) {
                  if (bra.field_f.length <= var4) {
                    L29: {
                      if (param0 != iv.field_o) {
                        mba.field_a.a(param1, -1, 0, uca.a(true, kc.field_b, uia.field_b));
                        break L29;
                      } else {
                        mba.field_a.a(param1, -1, -1, -1);
                        break L29;
                      }
                    }
                    return;
                  } else {
                    var6 = edb.field_o[var4];
                    if ((var6 ^ -1) > -1) {
                      var5 = var5 + u.field_r;
                      var4++;
                      continue L28;
                    } else {
                      var7 = ptb.a((byte) -107, true, bra.field_f[var4]);
                      var8 = -(var7 >> -839779391) + dv.field_f;
                      var5 = var5 + ro.field_c;
                      tm.field_o[var4] = new int[4];
                      tm.field_o[var4][0] = var8 - za.field_d;
                      tm.field_o[var4][1] = var5;
                      tm.field_o[var4][2] = var7 - -(za.field_d << 1040370561);
                      tm.field_o[var4][3] = (lfa.field_m << 401559809) + rua.field_p;
                      var5 = var5 + ((lfa.field_m << 2130887425) - (-ro.field_c - rua.field_p));
                      var4++;
                      continue L28;
                    }
                  }
                }
              } else {
                L30: {
                  stackOut_102_0 = sg.field_E;
                  stackIn_104_0 = stackOut_102_0;
                  stackIn_103_0 = stackOut_102_0;
                  if (edb.field_o[var4] >= 0) {
                    stackOut_104_0 = stackIn_104_0;
                    stackOut_104_1 = rua.field_p;
                    stackIn_105_0 = stackOut_104_0;
                    stackIn_105_1 = stackOut_104_1;
                    break L30;
                  } else {
                    stackOut_103_0 = stackIn_103_0;
                    stackOut_103_1 = u.field_r;
                    stackIn_105_0 = stackOut_103_0;
                    stackIn_105_1 = stackOut_103_1;
                    break L30;
                  }
                }
                sg.field_E = stackIn_105_0 + stackIn_105_1;
                var4++;
                continue L27;
              }
            }
          } else {
            L31: {
              stackOut_83_0 = -107;
              stackIn_85_0 = stackOut_83_0;
              stackIn_84_0 = stackOut_83_0;
              if ((edb.field_o[var4] ^ -1) > -1) {
                stackOut_85_0 = stackIn_85_0;
                stackOut_85_1 = 0;
                stackIn_86_0 = stackOut_85_0;
                stackIn_86_1 = stackOut_85_1;
                break L31;
              } else {
                stackOut_84_0 = stackIn_84_0;
                stackOut_84_1 = 1;
                stackIn_86_0 = stackOut_84_0;
                stackIn_86_1 = stackOut_84_1;
                break L31;
              }
            }
            var5 = ptb.a((byte) stackIn_86_0, stackIn_86_1 != 0, bra.field_f[var4]);
            if (var3 < var5) {
              var3 = var5;
              var4++;
              continue L23;
            } else {
              var4++;
              continue L23;
            }
          }
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
