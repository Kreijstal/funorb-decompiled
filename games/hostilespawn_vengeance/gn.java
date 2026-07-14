/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    private boolean field_b;
    private int field_g;
    private int field_c;
    static String field_l;
    private int field_i;
    private int field_d;
    private int field_a;
    private int field_n;
    private int field_o;
    private int field_j;
    static int field_t;
    private int field_q;
    private bk field_h;
    private int field_r;
    private int field_s;
    private int field_f;
    private int field_p;
    private int field_e;
    static int[] field_k;
    private int field_u;
    private float field_m;

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var6 = 1;
        L0: while (true) {
          if (var6 >= 3) {
            L1: {
              if (param5 > 69) {
                break L1;
              } else {
                var8 = null;
                boolean discarded$1 = gn.a(10, (vi) null);
                break L1;
              }
            }
            return;
          } else {
            si.e(var6 + param2, param0 - -var6, 9 + -var6, 16776960, param3);
            si.d(param2 - -var6, param0 + var6, -var6 + 9, 16776960, param3);
            si.e(-9 + param1, var6 + param0, 9 - var6, 16776960, param3);
            si.d(param1 + -var6, param0 + var6, 9 + -var6, 16776960, param3);
            si.e(param2 - -var6, -var6 + param4, 9 + -var6, 16776960, param3);
            si.d(var6 + param2, -9 + param4, 9 - var6, 16776960, param3);
            si.e(-9 + param1, param4 + -var6, 1 + -var6 + 9, 16776960, param3);
            si.d(-var6 + param1, param4 - 9, -var6 + 9, 16776960, param3);
            var6++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        int var1 = -52 % ((param0 - 23) / 50);
        field_l = null;
        field_k = null;
    }

    final void a(boolean param0) {
        if (!(null == wa.field_q)) {
            return;
        }
        if (!(0 < wb.field_S)) {
            ((gn) this).field_b = false;
        }
        if (((gn) this).field_b) {
        } else {
            if (hf.field_h < ((gn) this).field_c) {
                sg.field_a = (((gn) this).field_c - hf.field_h) / 2;
            } else {
                if (0 < ((gn) this).field_c) {
                    sg.field_a = 0;
                }
            }
            if (hf.field_h == ((gn) this).field_i) {
                // if_icmpne L100
            } else {
                ((gn) this).field_h.a((byte) -123, ((gn) this).field_u, ((gn) this).field_i);
            }
            return;
        }
        if (!param0) {
            gn.a(-27);
        }
        ((gn) this).field_o = ((gn) this).field_o - 1;
        if (!(-1 <= (((gn) this).field_o - 1 ^ -1))) {
            return;
        }
        ((gn) this).field_o = ((gn) this).field_n;
        if (ca.field_d < ((gn) this).field_q) {
            ((gn) this).field_b = false;
            return;
        }
        this.a((byte) -97);
    }

    final static boolean a(int param0, vi param1) {
        if (param0 != 0) {
            field_t = 102;
        }
        int var2 = param1.l(32270);
        int var3 = 1 != var2 ? 0 : 1;
        return var3 != 0;
    }

    final ue d(int param0) {
        ((gn) this).field_d = hf.field_h;
        ((gn) this).field_f = qc.field_s;
        if (param0 != 16776960) {
            ue discarded$0 = ((gn) this).d(47);
        }
        ((gn) this).field_h.a((byte) -125, ((gn) this).field_p, ((gn) this).field_s);
        ih.field_s = false;
        ue var2 = jg.a(((gn) this).field_s, (byte) -61, gf.field_b, 0, ((gn) this).field_p, 0);
        if (var2 == null) {
            ((gn) this).c(115);
        }
        return var2;
    }

    final static ll a(String param0, boolean param1) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        int var2 = param0.length();
        int var3 = 0;
        if (param1) {
            return null;
        }
        while (var3 < var2) {
            var4 = param0.charAt(var3);
            if (48 > var4) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
            var3++;
        }
        return we.field_g;
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 28433) {
          L0: {
            L1: {
              if (((gn) this).field_q > ca.field_d) {
                break L1;
              } else {
                if (-1 <= (wb.field_S ^ -1)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean[] param5, boolean[] param6) {
        int var8 = 0;
        int var9 = 0;
        p var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        bd var14 = null;
        bd var15 = null;
        var13 = HostileSpawn.field_I ? 1 : 0;
        var8 = 46 / ((9 - param3) / 50);
        var14 = new bd(64, 64);
        var15 = var14;
        var9 = 0;
        L0: while (true) {
          L1: {
            if (var9 >= ll.field_a) {
              break L1;
            } else {
              L2: {
                var10 = wh.field_b[var9];
                param1 = -12 + -param2 + (int)(24.0 * ((double)var10.field_j.field_e + var10.field_l.field_f));
                param4 = (int)(((double)var10.field_j.field_g + var10.field_l.field_a) * 24.0) - param0 - -12;
                if (-96 > param1) {
                  break L2;
                } else {
                  if ((param4 ^ -1) > 95) {
                    break L2;
                  } else {
                    if (736 < param1) {
                      break L2;
                    } else {
                      L3: {
                        if (576 >= param4) {
                          break L3;
                        } else {
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        var11 = var10.field_j.b(-4);
                        if (!param6[var11]) {
                          break L4;
                        } else {
                          var10.field_n = true;
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          L7: {
                            var12 = var10.field_i;
                            if (var12 != 0) {
                              break L7;
                            } else {
                              if (0 == 0) {
                                pf.a(var15.field_D, false);
                                qa.field_g[var10.field_h - -1].a(true, 128, (int)var10.field_c, param1, param4);
                                var15.a();
                                qa.field_g[1 + var10.field_h].a(true, 128, (int)var10.field_c, 32, 32);
                                o.field_n.b((byte) 117);
                                var12 = 0;
                                L8: while (true) {
                                  L9: {
                                    if (var15.field_D.length <= var12) {
                                      break L9;
                                    } else {
                                      L10: {
                                        if ((var14.field_D[var12] ^ -1) != -1) {
                                          var14.field_D[var12] = 16711680;
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      }
                                      var12++;
                                      if (0 == 0) {
                                        continue L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  var12 = em.field_c % 80;
                                  var12 = (int)(100.0 * (1.0 + Math.sin(3.141592653589793 * (double)var12 / 40.0)));
                                  var15.b(param1 - 32, -32 + param4, var12 / 2);
                                  if (!param5[var11]) {
                                    break L2;
                                  } else {
                                    if (param1 + -24 > j.field_c) {
                                      break L2;
                                    } else {
                                      if (-24 + param4 > rb.field_m) {
                                        break L2;
                                      } else {
                                        if (param1 - -24 < j.field_c) {
                                          break L2;
                                        } else {
                                          if (rb.field_m <= 24 + param4) {
                                            L11: {
                                              L12: {
                                                if (var10.field_h < 0) {
                                                  break L12;
                                                } else {
                                                  if (var10.field_h >= rf.field_s.length) {
                                                    break L12;
                                                  } else {
                                                    pf.field_I = rf.field_s[var10.field_h];
                                                    if (0 == 0) {
                                                      break L11;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                              }
                                              pf.field_I = rf.field_s[0];
                                              break L11;
                                            }
                                            aj.field_d = 8 + param4;
                                            lh.field_a = param1;
                                            if (0 == 0) {
                                              break L2;
                                            } else {
                                              break L6;
                                            }
                                          } else {
                                            break L2;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L7;
                              }
                            }
                          }
                          L13: {
                            if (var12 != 1) {
                              break L13;
                            } else {
                              if (0 == 0) {
                                break L6;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if ((var12 ^ -1) == -3) {
                            break L5;
                          } else {
                            break L2;
                          }
                        }
                        pf.a(var15.field_D, false);
                        hh.field_a[var10.field_h].a(true, 128, (int)var10.field_c, param1, param4);
                        var14.a();
                        hh.field_a[var10.field_h].a(true, 128, (int)var10.field_c, 32, 32);
                        o.field_n.b((byte) 110);
                        var12 = 0;
                        L14: while (true) {
                          L15: {
                            if (var15.field_D.length <= var12) {
                              break L15;
                            } else {
                              L16: {
                                if (var14.field_D[var12] == 0) {
                                  break L16;
                                } else {
                                  var14.field_D[var12] = 16711680;
                                  break L16;
                                }
                              }
                              var12++;
                              if (0 == 0) {
                                continue L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          var12 = em.field_c % 80;
                          var12 = (int)(100.0 * (1.0 + Math.sin((double)var12 * 3.141592653589793 / 40.0)));
                          var15.b(-32 + param1, -32 + param4, var12 / 2);
                          if (!param5[var11]) {
                            break L2;
                          } else {
                            if (j.field_c < param1 - 24) {
                              break L2;
                            } else {
                              if (rb.field_m < -24 + param4) {
                                break L2;
                              } else {
                                if (j.field_c > param1 - -24) {
                                  break L2;
                                } else {
                                  if (rb.field_m <= 24 + param4) {
                                    pf.field_I = lg.field_n[var10.field_h];
                                    lh.field_a = param1;
                                    aj.field_d = param4 + 8;
                                    if (0 == 0) {
                                      break L2;
                                    } else {
                                      break L5;
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      pf.a(var15.field_D, false);
                      wk.field_b[var10.field_h].a(true, 128, (int)var10.field_c, param1, param4);
                      var14.a();
                      wk.field_b[var10.field_h].a(true, 128, (int)var10.field_c, 32, 32);
                      o.field_n.b((byte) -88);
                      var12 = 0;
                      L17: while (true) {
                        L18: {
                          if (var15.field_D.length <= var12) {
                            break L18;
                          } else {
                            L19: {
                              if (var14.field_D[var12] == 0) {
                                break L19;
                              } else {
                                var14.field_D[var12] = 16711680;
                                break L19;
                              }
                            }
                            var12++;
                            if (0 == 0) {
                              continue L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        var12 = em.field_c % 80;
                        var12 = (int)(100.0 * (1.0 + Math.sin((double)var12 * 3.141592653589793 / 40.0)));
                        var15.b(-32 + param1, param4 - 32, var12 / 2);
                        if (!param5[var11]) {
                          break L2;
                        } else {
                          if (param1 - 24 > j.field_c) {
                            break L2;
                          } else {
                            if (-24 + param4 > rb.field_m) {
                              break L2;
                            } else {
                              if (param1 - -24 < j.field_c) {
                                break L2;
                              } else {
                                if (rb.field_m <= 24 + param4) {
                                  pf.field_I = bm.field_e[var10.field_h];
                                  lh.field_a = param1;
                                  aj.field_d = 8 + param4;
                                  break L2;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              var9++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((gn) this).field_c = param2;
        if (param1 != 1) {
            ((gn) this).a(true);
        }
        ((gn) this).field_e = param0;
    }

    private final void a(byte param0) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        int var2 = ((gn) this).field_c;
        int var3 = ((gn) this).field_e;
        if (param0 >= -26) {
            ((gn) this).field_d = 123;
        }
        if (!(((gn) this).b(28433))) {
            ((gn) this).field_b = false;
            return;
        }
        if (var3 > ((gn) this).field_j) {
            var3 = ((gn) this).field_j;
        } else {
            if (!(((gn) this).field_a <= var3)) {
                var3 = ((gn) this).field_a;
            }
        }
        if (((gn) this).field_r < var2) {
            var2 = ((gn) this).field_r;
        } else {
            if (((gn) this).field_g > var2) {
                var2 = ((gn) this).field_g;
            }
        }
        if (0.0f >= ((gn) this).field_m) {
        } else {
            var4 = (int)((float)var3 * ((gn) this).field_m + 0.5f);
            if (var2 >= var4) {
                // if_icmple L163
                var2 = var4;
            } else {
                var3 = (int)((float)var2 / ((gn) this).field_m);
            }
        }
        if (var2 == hf.field_h) {
            // if_icmpne L180
        } else {
            ((gn) this).field_h.a((byte) -120, var3, var2);
        }
        if ((((gn) this).field_c ^ -1) < -1) {
            sg.field_a = (-hf.field_h + ((gn) this).field_c) / 2;
        }
    }

    final void c(int param0) {
        if (param0 <= 67) {
            this.a((byte) -115);
        }
        ((gn) this).field_h.a((byte) -119, ((gn) this).field_f, ((gn) this).field_d);
    }

    private gn() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = 0;
        field_l = "Start mission";
        field_k = new int[]{0, 0};
    }
}
