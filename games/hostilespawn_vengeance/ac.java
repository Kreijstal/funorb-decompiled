/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    private gb field_h;
    private dn field_d;
    private gb field_b;
    static vl field_i;
    static String field_f;
    static int field_a;
    static nd field_c;
    static int[] field_j;
    static int field_g;
    static String field_e;

    final hj a(int param0, int param1) {
        byte[] var4 = null;
        hj var3 = (hj) ((ac) this).field_d.a(0, (long)param0);
        if (var3 != null) {
            return var3;
        }
        if (param0 < 32768) {
            var4 = ((ac) this).field_h.a(false, param0, 1);
        } else {
            var4 = ((ac) this).field_b.a(false, param0 & 32767, 1);
        }
        if (param1 != 1) {
            field_g = 52;
        }
        var3 = new hj();
        if (!(var4 == null)) {
            var3.a(new vi(var4), 64);
        }
        if (param0 >= 32768) {
            var3.c((byte) 64);
        }
        ((ac) this).field_d.a((long)param0, param1 ^ -110, (Object) (Object) var3);
        return var3;
    }

    final static bd a(int param0, int param1, byte param2, gb param3) {
        RuntimeException var4 = null;
        bd stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        bd stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (rl.a(2884, param3, param0, param1)) {
              L1: {
                if (param2 < 0) {
                  break L1;
                } else {
                  field_j = null;
                  break L1;
                }
              }
              stackOut_5_0 = ag.d((byte) 51);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("ac.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final static void a(int param0, double param1, int param2, int param3, double param4, int param5) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        p var15 = null;
        p var16 = null;
        p var17 = null;
        p var18 = null;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        var14 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var8_int = 0;
            L1: while (true) {
              if (~var8_int <= ~ll.field_a) {
                if (param3 == -5161) {
                  var8_int = -1 + ll.field_a;
                  L2: while (true) {
                    if (var8_int < 0) {
                      break L0;
                    } else {
                      L3: {
                        var16 = wh.field_b[var8_int];
                        var18 = var16;
                        if (var18.field_i == -1) {
                          ll.field_a = ll.field_a - 1;
                          var16.field_c = wh.field_b[ll.field_a].field_c;
                          var16.field_l.a(wh.field_b[ll.field_a].field_l, -28860);
                          var16.field_j.a((byte) 46, wh.field_b[ll.field_a].field_j);
                          var16.field_h = wh.field_b[ll.field_a].field_h;
                          var16.field_e = wh.field_b[ll.field_a].field_e;
                          var16.field_n = wh.field_b[ll.field_a].field_n;
                          var16.field_i = wh.field_b[ll.field_a].field_i;
                          var18.field_b = ni.a(var18.field_i, (byte) -64);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var8_int--;
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L4: {
                  var15 = wh.field_b[var8_int];
                  var17 = var15;
                  if (0 >= var17.field_e) {
                    var10 = (int)(((double)(-var17.field_j.field_e) + ((double)param0 + param4) - var17.field_l.field_f) * 24.0);
                    var11 = (int)(((double)param2 + param1 + (double)(-var17.field_j.field_g) - var17.field_l.field_a) * 24.0);
                    if (-24 > var10) {
                      break L4;
                    } else {
                      if (var10 > 48) {
                        break L4;
                      } else {
                        if (var11 < -24) {
                          break L4;
                        } else {
                          if (var11 > 48) {
                            break L4;
                          } else {
                            if (0 == var17.field_i) {
                              L5: {
                                var17.field_i = -1;
                                var12 = 1;
                                var13 = var17.field_h + 1;
                                if (!kh.field_Q[var13]) {
                                  kh.field_Q[var13] = true;
                                  break L5;
                                } else {
                                  var12 = 0;
                                  break L5;
                                }
                              }
                              L6: {
                                if (var12 == 0) {
                                  break L6;
                                } else {
                                  if (kh.field_U[0] == 0) {
                                    L7: {
                                      if (!t.a(param3 ^ -5181, 0, var13)) {
                                        stackOut_67_0 = 0;
                                        stackIn_68_0 = stackOut_67_0;
                                        break L7;
                                      } else {
                                        stackOut_66_0 = 1;
                                        stackIn_68_0 = stackOut_66_0;
                                        break L7;
                                      }
                                    }
                                    var12 = stackIn_68_0;
                                    break L6;
                                  } else {
                                    if (kh.field_U[1] == 0) {
                                      L8: {
                                        if (!t.a(67, 1, var13)) {
                                          stackOut_63_0 = 0;
                                          stackIn_64_0 = stackOut_63_0;
                                          break L8;
                                        } else {
                                          stackOut_62_0 = 1;
                                          stackIn_64_0 = stackOut_62_0;
                                          break L8;
                                        }
                                      }
                                      var12 = stackIn_64_0;
                                      break L6;
                                    } else {
                                      var12 = 0;
                                      break L6;
                                    }
                                  }
                                }
                              }
                              if (uj.field_l != 1) {
                                break L4;
                              } else {
                                if (var12 != 0) {
                                  break L4;
                                } else {
                                  if (sf.field_V[var13 + 15] != null) {
                                    eh.field_c.a(sf.field_V[15 + var13], 100, uh.field_i);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            } else {
                              if (var17.field_i == 1) {
                                var17.field_i = -1;
                                kh.field_ib[var15.field_h] = kh.field_ib[var15.field_h] + te.field_F[var15.field_h];
                                if (uj.field_l != 1) {
                                  break L4;
                                } else {
                                  eh.field_c.a(sf.field_V[40], 100, uh.field_i);
                                  break L4;
                                }
                              } else {
                                if (var17.field_i == 2) {
                                  L9: {
                                    var12 = var17.field_h;
                                    if (0 != var12) {
                                      if (var12 != 1) {
                                        if (var12 != 2) {
                                          if (var12 == 4) {
                                            if (om.field_b) {
                                              bh.field_g[18] = vg.a(new String[1], 82, sf.field_Y);
                                              vg.field_e = new v[1];
                                              pm.field_h = true;
                                              vg.field_e[0] = new v(ch.field_k, 24 * var17.field_j.field_e, var17.field_j.field_g + 3);
                                              vg.field_e[0].field_a = 1;
                                              break L9;
                                            } else {
                                              break L9;
                                            }
                                          } else {
                                            if (5 == var12) {
                                              if (null == q.field_g) {
                                                break L9;
                                              } else {
                                                q.field_g.a(-56, var17);
                                                break L9;
                                              }
                                            } else {
                                              if (var12 != 6) {
                                                if (var12 != 7) {
                                                  if (8 != var12) {
                                                    if (var12 != 9) {
                                                      if (var12 != 10) {
                                                        if (var12 == 3) {
                                                          eh.field_c.a(fg.field_b[23], 100, uh.field_i);
                                                          q.field_g.a(127, var17);
                                                          break L9;
                                                        } else {
                                                          if (var12 != 11) {
                                                            break L9;
                                                          } else {
                                                            uf.field_h = true;
                                                            eh.field_c.a(fg.field_b[21], 100, uh.field_i);
                                                            q.field_g.a(112, var17);
                                                            var17.field_i = -1;
                                                            break L9;
                                                          }
                                                        }
                                                      } else {
                                                        bh.field_d = bh.field_d + 1000;
                                                        break L9;
                                                      }
                                                    } else {
                                                      qh.field_k = qh.field_k + 5;
                                                      break L9;
                                                    }
                                                  } else {
                                                    gb.field_h = gb.field_h + 10;
                                                    break L9;
                                                  }
                                                } else {
                                                  gf.field_j = gf.field_j + 100;
                                                  break L9;
                                                }
                                              } else {
                                                jf.field_g = jf.field_g + 100;
                                                break L9;
                                              }
                                            }
                                          }
                                        } else {
                                          pl.field_l = true;
                                          break L9;
                                        }
                                      } else {
                                        eh.field_g = ba.a((byte) 114);
                                        eh.field_c.a(fg.field_b[20], 100, uh.field_i);
                                        break L9;
                                      }
                                    } else {
                                      L10: {
                                        eh.field_g = eh.field_g + ba.a((byte) 109) / 4;
                                        if (~eh.field_g >= ~ba.a((byte) 108)) {
                                          break L10;
                                        } else {
                                          eh.field_g = ba.a((byte) 100);
                                          break L10;
                                        }
                                      }
                                      eh.field_c.a(fg.field_b[19], 100, uh.field_i);
                                      break L9;
                                    }
                                  }
                                  var17.field_i = -1;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var10 = ln.field_a.field_c[param5];
                    ln.field_a.field_c[param5] = 0;
                    var17.field_e = var17.field_e - 1;
                    boolean[] discarded$1 = var17.a(4, param3 ^ -5164, ln.field_a);
                    var17.a(225, 1.0 + var17.field_c, 50);
                    ln.field_a.field_c[param5] = var10;
                    break L4;
                  }
                }
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var8, "ac.D(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(boolean param0, boolean param1, int param2, String param3) {
        if (param2 != -1) {
            return;
        }
        try {
            de.c(param2);
            im.field_e.f((byte) 32);
            ib.field_e = new lk(rf.field_e, (String) null, li.field_o, param1, param0);
            ke.field_s = new ta(im.field_e, (ag) (Object) ib.field_e);
            im.field_e.c((ag) (Object) ke.field_s, param2 ^ -116);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ac.A(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    private ac() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0) {
        ng var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        ng var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4 = (ng) (Object) td.field_o.g(-92);
            var1 = var4;
            if (var1 != null) {
              var2 = 0;
              L1: while (true) {
                if (var1.field_t <= var2) {
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  L2: {
                    if (null == var4.field_r[var2]) {
                      break L2;
                    } else {
                      if (-1 != var4.field_r[var2].field_f) {
                        break L2;
                      } else {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0 != 0;
                      }
                    }
                  }
                  L3: {
                    if (null == var4.field_j[var2]) {
                      break L3;
                    } else {
                      if (-1 != var4.field_j[var2].field_f) {
                        break L3;
                      } else {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0 != 0;
                      }
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1_ref, "ac.B(" + 24501 + 41);
        }
        return stackIn_16_0 != 0;
    }

    public static void a(byte param0) {
        field_i = null;
        field_f = null;
        field_e = null;
        field_j = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new vl();
        field_j = new int[8192];
        field_f = "This level is locked down. Activate the five security consoles to reactivate the lift.";
        field_c = new nd(1, 2, 2, 0);
        field_e = "Unpacking sound effects";
    }
}
