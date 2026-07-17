/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends ql {
    static bd field_p;
    static in field_v;
    private oc field_f;
    private oc[] field_x;
    static bd[] field_h;
    static qm[] field_w;
    static bd[] field_e;
    static String[] field_j;
    static int field_g;
    static String field_u;
    private oc[] field_k;
    static int field_s;
    private we[] field_d;
    private we[] field_q;
    private v field_r;
    private int field_n;
    private boolean[] field_t;
    private int field_m;
    private boolean field_l;
    private v field_o;
    private qm field_i;

    final boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = -51 % ((param0 - 38) / 53);
        var3 = ha.field_t;
        if (var3 == 15) {
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((vj) this).field_x.length) {
              return false;
            } else {
              if (null != ((vj) this).field_x[var3]) {
                ((vj) this).field_d[var3].a((byte) -46);
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          if (var3 != 16) {
            return true;
          } else {
            var3 = 0;
            L1: while (true) {
              if (((vj) this).field_k.length <= var3) {
                return false;
              } else {
                if (!((vj) this).field_t[var3]) {
                  ((vj) this).field_q[var3].a((byte) -46);
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, p param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5_int = 0;
        oc var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 108 / ((36 - param0) / 63);
              if (param1.field_h != 3) {
                break L1;
              } else {
                var4 = -1;
                var5_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int >= ((vj) this).field_x.length) {
                      break L3;
                    } else {
                      L4: {
                        if (((vj) this).field_x[var5_int] == null) {
                          break L4;
                        } else {
                          if (!((vj) this).field_x[var5_int].a(param1.field_j, -119)) {
                            break L4;
                          } else {
                            var4 = var5_int;
                            break L3;
                          }
                        }
                      }
                      var5_int++;
                      continue L2;
                    }
                  }
                  L5: {
                    wa.field_p = wa.field_p + 1;
                    if (((vj) this).field_m + wa.field_p < 3) {
                      break L5;
                    } else {
                      if (15 == ha.field_t) {
                        L6: {
                          kd.a(16, 1);
                          nh.field_E.a(-1, 8360, -1);
                          var5 = ((vj) this).field_x[var4];
                          ((vj) this).field_o.field_a = 1;
                          var6 = var4;
                          if (var6 != 0) {
                            if (var6 == 2) {
                              break L6;
                            } else {
                              if (var6 != 1) {
                                if (var6 == 3) {
                                  ((vj) this).field_o.field_d = -((vj) this).field_o.field_h + (var5.field_g + -2) * 24;
                                  ((vj) this).field_o.field_l = 24 * var5.field_e + -100;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              } else {
                                ((vj) this).field_o.field_d = 24 * var5.field_g - -48;
                                ((vj) this).field_o.field_l = -100 + 24 * var5.field_e;
                                break L5;
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        ((vj) this).field_o.field_l = 24 * var5.field_e - 100;
                        ((vj) this).field_o.field_d = -((vj) this).field_o.field_h + 24 * (var5.field_g - 2);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (0 > var4) {
                    break L1;
                  } else {
                    ((vj) this).field_x[var4] = null;
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("vj.S(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final void c(int param0) {
        if (!((vj) this).field_l) {
            ti.a(228, (byte) 38, 27);
        }
        if (param0 != 0) {
            field_h = null;
        }
    }

    final String a(boolean param0) {
        int var2 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            vj.a(85L, (byte) 61);
            break L0;
          }
        }
        var2 = ha.field_t;
        if (var2 == 15) {
          return pk.field_n;
        } else {
          if (var2 == 16) {
            return cg.field_c;
          } else {
            return mc.field_L;
          }
        }
    }

    final static byte[] a(String param0) {
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = i.field_b.a(param0, "", 0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("vj.I(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 24 + 41);
        }
        return stackIn_1_0;
    }

    final void b(byte param0) {
        int var3 = 0;
        int var4 = 0;
        oc var5 = null;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          var5 = mm.field_m[0].field_j;
          if (((vj) this).field_o.field_a != 1) {
            break L0;
          } else {
            if (((vj) this).field_o.a((byte) -65)) {
              if (((vj) this).field_o.field_l + ((vj) this).field_o.field_m > var5.field_e * 24 - 96) {
                if (24 * (2 + var5.field_e) < ((vj) this).field_o.field_l) {
                  ((vj) this).field_o.field_a = 2;
                  break L0;
                } else {
                  if (((vj) this).field_o.field_d > 24 * var5.field_g) {
                    break L0;
                  } else {
                    if (24 * var5.field_g <= ((vj) this).field_o.field_h + ((vj) this).field_o.field_d) {
                      ((vj) this).field_o.field_a = 2;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
              } else {
                ((vj) this).field_o.field_a = 2;
                break L0;
              }
            } else {
              ((vj) this).field_o.field_a = 2;
              break L0;
            }
          }
        }
        L1: {
          ((vj) this).field_r.e(-127);
          if (((vj) this).field_m + wa.field_p <= 0) {
            break L1;
          } else {
            si.a(100, 40, 90, 20, 0, 128);
            si.a(100, 40, 90, 20, 16776960);
            id.field_A.c(ph.field_z + wa.field_p, 105, 55, 16776960, -1);
            break L1;
          }
        }
        L2: {
          L3: {
            var3 = 81 / ((-48 - param0) / 38);
            if (((vj) this).field_m > 0) {
              break L3;
            } else {
              if (ha.field_t == 16) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          si.a(410, 40, 140, 20, 0, 128);
          si.a(410, 40, 140, 20, 16776960);
          id.field_A.c(jg.field_a + ((vj) this).field_m, 415, 55, 16776960, -1);
          break L2;
        }
    }

    public static void g(int param0) {
        field_j = null;
        field_u = null;
        field_w = null;
        field_v = null;
        field_h = null;
        field_e = null;
        field_p = null;
        if (param0 != 140) {
            vj.g(39);
        }
    }

    final static void a(long param0, byte param1) {
        if (param1 != -49) {
            return;
        }
        if (!(param0 > 0L)) {
            return;
        }
        if (0L != param0 % 10L) {
            pk.a(207, param0);
        } else {
            pk.a(207, param0 - 1L);
            pk.a(207, 1L);
        }
    }

    final void d(int param0) {
        oc var3 = null;
        int var4 = 0;
        oc var4_ref_oc = null;
        int var5_int = 0;
        oc var5 = null;
        oj var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        oj var10 = null;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          var10 = mm.field_m[0];
          var3 = var10.field_j;
          if (((vj) this).field_i == null) {
            break L0;
          } else {
            L1: {
              L2: {
                ((vj) this).field_i.field_j.a((byte) 46, var3);
                ((vj) this).field_i.field_l.a(var10.field_l.field_a - 0.5, var10.field_l.field_f - 0.5, param0 ^ -2);
                ((vj) this).field_i.field_c = var10.field_c;
                if (32.0 > var10.field_c) {
                  break L2;
                } else {
                  if (var10.field_c > 224.0) {
                    break L2;
                  } else {
                    if (var10.field_c < 96.0) {
                      ((vj) this).field_i.field_c = 64.0;
                      break L1;
                    } else {
                      if (var10.field_c >= 160.0) {
                        ((vj) this).field_i.field_c = 192.0;
                        break L1;
                      } else {
                        ((vj) this).field_i.field_c = 128.0;
                        break L1;
                      }
                    }
                  }
                }
              }
              ((vj) this).field_i.field_c = 0.0;
              break L1;
            }
            ((vj) this).field_i.field_l.a(25, (byte) 94, var10.field_c);
            ((vj) this).field_i.b((byte) 117);
            break L0;
          }
        }
        L3: {
          if (wa.field_p > 1) {
            ((vj) this).field_l = true;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (((vj) this).field_n < 0) {
            break L4;
          } else {
            if (dn.field_i == of.field_d) {
              break L4;
            } else {
              L5: {
                ((vj) this).field_i = null;
                ((vj) this).field_m = ((vj) this).field_m + 1;
                wa.field_p = wa.field_p - 1;
                ((vj) this).field_t[((vj) this).field_n] = true;
                if (((vj) this).field_m != 3) {
                  break L5;
                } else {
                  kd.a(0, 1);
                  nh.field_E.a((byte) 46, ((vj) this).field_f);
                  var4_ref_oc = ((vj) this).field_k[((vj) this).field_n];
                  ((vj) this).field_r.field_a = 1;
                  var5_int = ((vj) this).field_n;
                  if (0 != var5_int) {
                    if (var5_int == 1) {
                      ((vj) this).field_r.field_l = -100 + var4_ref_oc.field_e * 24;
                      ((vj) this).field_r.field_d = 24 * (3 + var4_ref_oc.field_g);
                      break L5;
                    } else {
                      if (var5_int != 2) {
                        break L5;
                      } else {
                        ((vj) this).field_r.field_l = var4_ref_oc.field_e * 24 - 100;
                        ((vj) this).field_r.field_d = -((vj) this).field_r.field_h + (var4_ref_oc.field_g * 24 - 72);
                        break L5;
                      }
                    }
                  } else {
                    ((vj) this).field_r.field_d = 24 * var4_ref_oc.field_g + -96 + -((vj) this).field_r.field_h;
                    ((vj) this).field_r.field_l = 24 * var4_ref_oc.field_e;
                    break L5;
                  }
                }
              }
              L6: {
                if (le.field_D != 0) {
                  break L6;
                } else {
                  le.field_D = 15000;
                  n.field_o = true;
                  break L6;
                }
              }
              ((vj) this).field_n = -1;
              break L4;
            }
          }
        }
        L7: {
          if (~((vj) this).field_n <= param0) {
            break L7;
          } else {
            if (wa.field_p <= 0) {
              break L7;
            } else {
              L8: {
                if (ha.field_t == 15) {
                  break L8;
                } else {
                  if (ha.field_t == 16) {
                    break L8;
                  } else {
                    break L7;
                  }
                }
              }
              var8 = 0;
              var5_int = var8;
              L9: while (true) {
                if (((vj) this).field_k.length <= var8) {
                  break L7;
                } else {
                  L10: {
                    if (((vj) this).field_t[var8]) {
                      break L10;
                    } else {
                      var4 = ih.a(var3, (byte) -102, ((vj) this).field_k[var8]);
                      if (var4 < 2) {
                        var6_int = (int)el.a((double)var3.field_e, (double)((vj) this).field_k[var8].field_e, param0 + 17, (double)var3.field_g, (double)((vj) this).field_k[var8].field_g);
                        ((vj) this).field_n = var8;
                        ca.a((double)(((vj) this).field_k[var8].field_e - -1), 0, (double)(((vj) this).field_k[var8].field_g - -1), true, var6_int);
                        ((vj) this).field_i = new qm(ln.field_a, var3, 230, rl.field_c, 0, false);
                        ((vj) this).field_i.field_c = var10.field_c;
                        int fieldTemp$2 = dk.field_o;
                        dk.field_o = dk.field_o + 1;
                        field_w[fieldTemp$2] = ((vj) this).field_i;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var8++;
                  continue L9;
                }
              }
            }
          }
        }
        L11: {
          if ((31 & ng.field_u) == 0) {
            var9 = 0;
            var4 = var9;
            L12: while (true) {
              if (var9 >= ((vj) this).field_k.length) {
                break L11;
              } else {
                L13: {
                  var5 = ((vj) this).field_k[var9];
                  if (cm.field_c[var5.b(-4)] > 0) {
                    L14: {
                      if (var3.field_e + -20 > var5.field_e) {
                        break L14;
                      } else {
                        if (~(20 + var3.field_e) > ~var5.field_e) {
                          break L14;
                        } else {
                          if (~var5.field_g > ~(-17 + var3.field_g)) {
                            break L14;
                          } else {
                            if (var5.field_g <= 17 + var3.field_g) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    var6 = new oj(var5, 18, rl.field_c);
                    var6.field_M = 0;
                    var6.field_n = true;
                    int fieldTemp$3 = el.field_j;
                    el.field_j = el.field_j + 1;
                    mm.field_m[fieldTemp$3] = var6;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var9++;
                continue L12;
              }
            }
          } else {
            break L11;
          }
        }
        super.d(-1);
    }

    final void e(int param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        var11 = ln.field_a.field_v;
        var10 = var11;
        var9 = var10;
        var8 = var9;
        var6 = var8;
        var2 = var6;
        ((vj) this).field_f = new oc(var11[0], var11[1]);
        var3 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ll.field_a) {
            var7 = 0;
            var4 = var7;
            L1: while (true) {
              if (var7 >= 3) {
                wa.field_p = 0;
                ((vj) this).field_n = -1;
                ((vj) this).field_m = 0;
                ((vj) this).field_o = new v(kd.field_E, 0, 0, 200);
                ((vj) this).field_r = new v(ea.field_b, param0, 0, 200);
                ((vj) this).field_l = false;
                kd.a(15, 1);
                nh.field_E.a(-1, 8360, -1);
                return;
              } else {
                ((vj) this).field_k[var7] = new oc(var6[10 + 2 * var7], var6[2 * (5 + var7) - -1]);
                ((vj) this).field_q[var7] = new we(((vj) this).field_k[var7]);
                var7++;
                continue L1;
              }
            }
          } else {
            if (wh.field_b[var4].field_i == -3) {
              if (-4 == wh.field_b[var4].field_h) {
                ((vj) this).field_x[var3] = new oc(wh.field_b[var4].field_j);
                ((vj) this).field_d[var3] = new we(((vj) this).field_x[var3]);
                var3++;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    public vj() {
        ((vj) this).field_x = new oc[4];
        ((vj) this).field_k = new oc[3];
        ((vj) this).field_d = new we[((vj) this).field_x.length];
        ((vj) this).field_q = new we[((vj) this).field_k.length];
        ((vj) this).field_t = new boolean[3];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 2;
        field_u = "You have 1 unread message!";
        field_j = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
