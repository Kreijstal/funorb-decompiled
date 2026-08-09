/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wha implements dja {
    static int field_a;

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return (tv[]) null;
        }
        return (tv[]) ((Object) new crb[param1]);
    }

    final static void a(int param0) {
        if (param0 != 29012) {
            field_a = 71;
        }
        wga.field_a = new lwa(fh.field_g, lo.field_b, kn.field_p, qc.field_q, urb.field_o, iga.field_o);
    }

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        String[] stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        String[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        String stackIn_60_2 = null;
        String[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        String stackIn_67_2 = null;
        int stackIn_87_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
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
                  if (-3 == (iv.field_o ^ -1)) {
                    var3_int = wva.a(kjb.field_o, ob.field_l, 0, isa.a(wma.field_M, new String[]{"<br><%0><br>"}, param0 + 93), boa.field_a);
                    var4 = -1;
                    var5 = 0;
                    L6: while (true) {
                      L7: {
                        if (var5 >= var3_int) {
                          break L7;
                        } else {
                          if (!"<%0>".equals(ob.field_l[var5])) {
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
                        cua.a(ob.field_l, 0, tj.field_k, 0, var4);
                        vg.field_p = new String[-var4 + (var3_int - 1)];
                        cua.a(ob.field_l, var4 + 1, vg.field_p, 0, -1 + -var4 + var3_int);
                        var3_int = wva.a(kjb.field_o, ob.field_l, 0, isa.a(nda.field_o, new String[]{"<br><%0><br>"}, 88), boa.field_a);
                        var4 = -1;
                        var5 = 0;
                        L8: while (true) {
                          L9: {
                            if (var5 >= var3_int) {
                              break L9;
                            } else {
                              if (!"<%0>".equals(ob.field_l[var5])) {
                                var5++;
                                continue L8;
                              } else {
                                var4 = var5;
                                break L9;
                              }
                            }
                          }
                          if ((var4 ^ -1) != 0) {
                            L10: {
                              dha.field_q = new String[var4];
                              cua.a(ob.field_l, 0, dha.field_q, 0, var4);
                              jha.field_o = new String[-var4 + (var3_int + -1)];
                              cua.a(ob.field_l, var4 + 1, jha.field_o, 0, -1 + -var4 + var3_int);
                              if (tj.field_k.length >= dha.field_q.length) {
                                stackIn_49_0 = tj.field_k.length;
                                break L10;
                              } else {
                                stackIn_49_0 = dha.field_q.length;
                                break L10;
                              }
                            }
                            L11: {
                              var5 = stackIn_49_0;
                              if (jha.field_o.length <= vg.field_p.length) {
                                stackIn_52_0 = vg.field_p.length;
                                break L11;
                              } else {
                                stackIn_52_0 = jha.field_o.length;
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
                                        wt.a(false);
                                        break L1;
                                      } else {
                                        stackIn_64_0 = bra.field_f;
                                        stackIn_64_1 = var8 + (var5 + 7);
                                        stackIn_64_2 = var8 ^ -1;
                                        stackIn_64_3 = jha.field_o.length ^ -1;
                                        L15: {




                                          if (stackIn_64_2 > stackIn_64_3) {
                                            stackIn_64_0 = (String[]) ((Object) stackIn_64_0);

                                            stackIn_67_2 = jha.field_o[var8];
                                            break L15;
                                          } else {
                                            stackIn_64_0 = (String[]) ((Object) stackIn_64_0);

                                            stackIn_67_2 = "";
                                            break L15;
                                          }
                                        }
                                        stackIn_64_0[stackIn_64_1] = stackIn_67_2;
                                        var8++;
                                        continue L14;
                                      }
                                    }
                                  } else {
                                    L16: {
                                      stackIn_59_0 = bra.field_f;

                                      stackIn_59_1 = var8 + 6;

                                      if (0 > -var5 + var8 + dha.field_q.length) {
                                        stackIn_60_0 = (String[]) ((Object) stackIn_59_0);
                                        stackIn_60_1 = stackIn_59_1;
                                        stackIn_60_2 = "";
                                        break L16;
                                      } else {
                                        stackIn_60_0 = (String[]) ((Object) stackIn_59_0);
                                        stackIn_60_1 = stackIn_59_1;
                                        stackIn_60_2 = dha.field_q[dha.field_q.length + var8 - var5];
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
                      if ((iv.field_o ^ -1) == -5) {
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
                          var3_int = wva.a(kjb.field_o, ob.field_l, param0 + -2, tl.field_o, boa.field_a);
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
                          var3_int = wva.a(kjb.field_o, ob.field_l, param0 ^ 2, moa.field_n, boa.field_a);
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
                  if ((iv.field_o ^ -1) != -3) {
                    break L25;
                  } else {
                    var10 = tj.field_k;
                    var4_ref_String__ = var10;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var10.length) {
                        var4_ref_String__ = vg.field_p;
                        var5 = 0;
                        L27: while (true) {
                          if (var5 >= var4_ref_String__.length) {
                            break L25;
                          } else {
                            var12 = var4_ref_String__[var5];
                            var7 = ptb.a((byte) -107, false, var12);
                            if ((var3_int ^ -1) > (var7 ^ -1)) {
                              var3_int = var7;
                              var5++;
                              continue L27;
                            } else {
                              var5++;
                              continue L27;
                            }
                          }
                        }
                      } else {
                        var11 = var10[var5];
                        var7 = ptb.a((byte) -107, false, var11);
                        if (var7 > var3_int) {
                          var3_int = var7;
                          var5++;
                          continue L26;
                        } else {
                          var5++;
                          continue L26;
                        }
                      }
                    }
                  }
                }
                sg.field_E = (lfa.field_m + ro.field_c << -1921525375) * mba.field_a.field_c;
                var4 = 0;
                L28: while (true) {
                  if (bra.field_f.length <= var4) {
                    jrb.field_o = -(sg.field_E >> -1150849375) + bba.field_d;
                    tm.field_o = new int[bra.field_f.length][];
                    var4 = 0;
                    var5 = jrb.field_o;
                    L29: while (true) {
                      if (bra.field_f.length <= var4) {
                        L30: {
                          if (param0 != iv.field_o) {
                            mba.field_a.a(param1, -1, 0, uca.a(true, kc.field_b, uia.field_b));
                            break L30;
                          } else {
                            mba.field_a.a(param1, -1, -1, -1);
                            break L30;
                          }
                        }
                        break L0;
                      } else {
                        L31: {
                          var6 = edb.field_o[var4];
                          if ((var6 ^ -1) > -1) {
                            var5 = var5 + u.field_r;
                            break L31;
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
                            break L31;
                          }
                        }
                        var4++;
                        continue L29;
                      }
                    }
                  } else {
                    L32: {
                      stackIn_107_0 = sg.field_E;

                      if (edb.field_o[var4] >= 0) {
                        stackIn_108_0 = stackIn_107_0;
                        stackIn_108_1 = rua.field_p;
                        break L32;
                      } else {
                        stackIn_108_0 = stackIn_107_0;
                        stackIn_108_1 = u.field_r;
                        break L32;
                      }
                    }
                    sg.field_E = stackIn_108_0 + stackIn_108_1;
                    var4++;
                    continue L28;
                  }
                }
              } else {
                L33: {
                  stackIn_87_0 = -107;

                  if ((edb.field_o[var4] ^ -1) > -1) {
                    stackIn_88_0 = stackIn_87_0;
                    stackIn_88_1 = 0;
                    break L33;
                  } else {
                    stackIn_88_0 = stackIn_87_0;
                    stackIn_88_1 = 1;
                    break L33;
                  }
                }
                L34: {
                  var5 = ptb.a((byte) stackIn_88_0, stackIn_88_1 != 0, bra.field_f[var4]);
                  if (var3_int < var5) {
                    var3_int = var5;
                    break L34;
                  } else {
                    break L34;
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
          throw rta.a((Throwable) ((Object) var3), "wha.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final tv a(byte param0) {
        int var2 = -12 % ((param0 - -64) / 50);
        return (tv) ((Object) new crb());
    }

    static {
        field_a = 11;
    }
}
