/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um extends rf {
    kp field_k;
    static tk field_m;
    static boolean field_j;
    static String field_n;
    private hk field_l;
    tp field_i;

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ft var6 = null;
        int var7 = 0;
        var7 = AceOfSkies.field_G ? 1 : 0;
        ((um) this).field_i.b(param0, param1, param2);
        var6 = (ft) ((um) this).field_k.d(268435455);
        L0: while (true) {
          if (var6 != null) {
            L1: {
              if (((um) this).field_l.a(0, var6)) {
                break L1;
              } else {
                var5 = param2;
                var4 = param1;
                L2: while (true) {
                  if (var5 <= ((ft) var6).field_i) {
                    this.a(var6, (byte) 120, var5, var5 + var4, param0, var4);
                    ((ft) var6).field_i = ((ft) var6).field_i - var5;
                    break L1;
                  } else {
                    this.a(var6, (byte) 121, ((ft) var6).field_i, var4 - -var5, param0, var4);
                    var4 = var4 + ((ft) var6).field_i;
                    var5 = var5 - ((ft) var6).field_i;
                    if (((um) this).field_l.a(var5, var4, false, var6, param0)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var6 = (ft) ((um) this).field_k.b((byte) 103);
            continue L0;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, int param1, ft param2) {
        int var4 = 0;
        int var5 = 0;
        hk stackIn_9_0 = null;
        ft stackIn_9_1 = null;
        hk stackIn_10_0 = null;
        ft stackIn_10_1 = null;
        hk stackIn_11_0 = null;
        ft stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        hk stackOut_8_0 = null;
        ft stackOut_8_1 = null;
        hk stackOut_10_0 = null;
        ft stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        hk stackOut_9_0 = null;
        ft stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        if ((4 & ((um) this).field_l.field_G[((ft) param2).field_m] ^ -1) != param0) {
          if (0 > ((ft) param2).field_p) {
            var4 = ((um) this).field_l.field_m[((ft) param2).field_m] / tk.field_f;
            var5 = (var4 + 1048575 - ((ft) param2).field_t) / var4;
            param2.field_t = var4 * param1 + ((ft) param2).field_t & 1048575;
            if (var5 <= param1) {
              L0: {
                if (((um) this).field_l.field_z[((ft) param2).field_m] != 0) {
                  L1: {
                    param2.field_e = su.a(((ft) param2).field_x, ((ft) param2).field_e.l(), 0, ((ft) param2).field_e.g());
                    stackOut_8_0 = ((um) this).field_l;
                    stackOut_8_1 = (ft) param2;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (-1 >= (((ft) param2).field_y.field_n[((ft) param2).field_n] ^ -1)) {
                      stackOut_10_0 = (hk) (Object) stackIn_10_0;
                      stackOut_10_1 = (ft) (Object) stackIn_10_1;
                      stackOut_10_2 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      break L1;
                    } else {
                      stackOut_9_0 = (hk) (Object) stackIn_9_0;
                      stackOut_9_1 = (ft) (Object) stackIn_9_1;
                      stackOut_9_2 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      break L1;
                    }
                  }
                  ((hk) (Object) stackIn_11_0).a((ft) (Object) stackIn_11_1, stackIn_11_2 != 0, true);
                  break L0;
                } else {
                  param2.field_e = su.a(((ft) param2).field_x, ((ft) param2).field_e.l(), ((ft) param2).field_e.i(), ((ft) param2).field_e.g());
                  break L0;
                }
              }
              if ((((ft) param2).field_y.field_n[((ft) param2).field_n] ^ -1) <= -1) {
                param1 = ((ft) param2).field_t / var4;
                ((ft) param2).field_e.a(param1);
                return;
              } else {
                ((ft) param2).field_e.d(-1);
                param1 = ((ft) param2).field_t / var4;
                ((ft) param2).field_e.a(param1);
                return;
              }
            } else {
              ((ft) param2).field_e.a(param1);
              return;
            }
          } else {
            ((ft) param2).field_e.a(param1);
            return;
          }
        } else {
          ((ft) param2).field_e.a(param1);
          return;
        }
    }

    final int d() {
        return 0;
    }

    final static s a(boolean param0, int param1) {
        dl var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        dl var8 = null;
        jr var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_23_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        Object stackOut_21_0 = null;
        int[] stackOut_22_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = AceOfSkies.field_G ? 1 : 0;
                    var8 = nm.field_c;
                    var2 = var8;
                    var3 = var8.g(39);
                    m.field_f = 127 & var3;
                    if (-1 == (var3 & 128 ^ -1)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    sj.field_b = stackIn_3_0 != 0;
                    km.field_b = var8.g(-100);
                    pe.field_g = var8.h((byte) 118);
                    if (2 == m.field_f) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    jt.field_t = 0;
                    ot.field_a = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    jt.field_t = var8.i((byte) 0);
                    ot.field_a = var8.g((byte) -92);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param1 != var8.g(-89)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var4 = stackIn_9_0;
                    ku.field_g = var8.h(param1 + -17884);
                    if (var4 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    tn.field_t = ku.field_g;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    tn.field_t = var8.h(-17883);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (1 == m.field_f) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (-5 == (m.field_f ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 15: {
                    int discarded$4 = var8.i((byte) 0);
                    String discarded$5 = var8.h(-17883);
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    int discarded$6 = var8.i((byte) 0);
                    String discarded$7 = var8.h(-17883);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (param0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    ep.field_x = ko.a((rb) (Object) var8, 80, (byte) -114);
                    ku.field_e = null;
                    return new s(param0);
                }
                case 19: {
                    var5 = var8.i((byte) 0);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        var9 = uk.field_f.a(var5, -43);
                        ep.field_x = var9.c((byte) 1);
                        if (!tn.field_t.equals((Object) (Object) fj.field_a)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = null;
                        stackIn_23_0 = (int[]) (Object) stackOut_21_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = ((jr) var9).field_t;
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ku.field_e = (int[]) (Object) stackIn_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return new s(param0);
                }
                case 25: {
                    var6 = (Exception) (Object) caughtException;
                    v.a("CC1", (byte) -52, (Throwable) (Object) var6);
                    ku.field_e = null;
                    ep.field_x = null;
                    return new s(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final rf b() {
        ft var1 = (ft) ((um) this).field_k.d(268435455);
        if (var1 == null) {
            return null;
        }
        if (!(((ft) var1).field_e == null)) {
            return (rf) (Object) ((ft) var1).field_e;
        }
        return ((um) this).a();
    }

    final void a(int param0) {
        int var2 = 0;
        ft var3 = null;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        ((um) this).field_i.a(param0);
        var3 = (ft) ((um) this).field_k.d(268435455);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (!((um) this).field_l.a(0, var3)) {
                var2 = param0;
                L2: while (true) {
                  if (((ft) var3).field_i >= var2) {
                    this.a(-1, var2, var3);
                    ((ft) var3).field_i = ((ft) var3).field_i - var2;
                    break L1;
                  } else {
                    this.a(-1, ((ft) var3).field_i, var3);
                    var2 = var2 - ((ft) var3).field_i;
                    if (((um) this).field_l.a(var2, 0, false, var3, (int[]) null)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (ft) ((um) this).field_k.b((byte) 103);
            continue L0;
          } else {
            return;
          }
        }
    }

    final rf a() {
        ft var1_ref = null;
        int var2 = AceOfSkies.field_G ? 1 : 0;
        do {
            var1_ref = (ft) ((um) this).field_k.b((byte) 103);
            if (var1_ref == null) {
                return null;
            }
        } while (null == ((ft) var1_ref).field_e);
        return (rf) (Object) ((ft) var1_ref).field_e;
    }

    public static void a(byte param0) {
        field_n = null;
        if (param0 <= 82) {
            return;
        }
        field_m = null;
    }

    final static void d(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = AceOfSkies.field_G ? 1 : 0;
        if (param0 == 1) {
          ss.field_t = false;
          uf.field_e = null;
          if (!nf.field_a) {
            var1 = un.field_c;
            if ((var1 ^ -1) < -1) {
              if (var1 == 1) {
                uf.field_e = qk.field_f;
                uf.field_e = od.a(new CharSequence[3], 3);
                ml.field_m.h((byte) 127);
                nj.c(98);
                return;
              } else {
                uf.field_e = sn.a(field_n, 121, new String[1]);
                uf.field_e = od.a(new CharSequence[3], 3);
                ml.field_m.h((byte) 127);
                nj.c(98);
                return;
              }
            } else {
              ml.field_m.h((byte) 127);
              nj.c(98);
              return;
            }
          } else {
            ml.field_m.l(88);
            return;
          }
        } else {
          field_n = (String) null;
          ss.field_t = false;
          uf.field_e = null;
          if (!nf.field_a) {
            var1 = un.field_c;
            if ((var1 ^ -1) < -1) {
              if (var1 == 1) {
                uf.field_e = qk.field_f;
                uf.field_e = od.a(new CharSequence[3], 3);
                ml.field_m.h((byte) 127);
                nj.c(98);
                return;
              } else {
                uf.field_e = sn.a(field_n, 121, new String[1]);
                uf.field_e = od.a(new CharSequence[3], 3);
                ml.field_m.h((byte) 127);
                nj.c(98);
                return;
              }
            } else {
              ml.field_m.h((byte) 127);
              nj.c(98);
              return;
            }
          } else {
            ml.field_m.l(88);
            return;
          }
        }
    }

    private final void a(ft param0, byte param1, int param2, int param3, int[] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        su var11 = null;
        int var12 = 0;
        hk stackIn_11_0 = null;
        ft stackIn_11_1 = null;
        hk stackIn_12_0 = null;
        ft stackIn_12_1 = null;
        hk stackIn_13_0 = null;
        ft stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        hk stackOut_10_0 = null;
        ft stackOut_10_1 = null;
        hk stackOut_12_0 = null;
        ft stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        hk stackOut_11_0 = null;
        ft stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        var12 = AceOfSkies.field_G ? 1 : 0;
        if (-1 != (4 & ((um) this).field_l.field_G[((ft) param0).field_m] ^ -1)) {
          if (((ft) param0).field_p >= 0) {
            var7 = -120 / ((35 - param1) / 48);
            ((ft) param0).field_e.b(param4, param5, param2);
            return;
          } else {
            var7 = ((um) this).field_l.field_m[((ft) param0).field_m] / tk.field_f;
            L0: while (true) {
              var8 = (-((ft) param0).field_t + (var7 + 1048575)) / var7;
              if (var8 > param2) {
                ((ft) param0).field_t = ((ft) param0).field_t + param2 * var7;
                var7 = -120 / ((35 - param1) / 48);
                ((ft) param0).field_e.b(param4, param5, param2);
                return;
              } else {
                L1: {
                  ((ft) param0).field_e.b(param4, param5, var8);
                  param2 = param2 - var8;
                  ((ft) param0).field_t = ((ft) param0).field_t + (var7 * var8 + -1048576);
                  param5 = param5 + var8;
                  var9 = tk.field_f / 100;
                  var10 = 262144 / var7;
                  if (var10 < var9) {
                    var9 = var10;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var11 = ((ft) param0).field_e;
                  if (((um) this).field_l.field_z[((ft) param0).field_m] != 0) {
                    L3: {
                      param0.field_e = su.a(((ft) param0).field_x, var11.l(), 0, var11.g());
                      stackOut_10_0 = ((um) this).field_l;
                      stackOut_10_1 = (ft) param0;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (0 <= ((ft) param0).field_y.field_n[((ft) param0).field_n]) {
                        stackOut_12_0 = (hk) (Object) stackIn_12_0;
                        stackOut_12_1 = (ft) (Object) stackIn_12_1;
                        stackOut_12_2 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        break L3;
                      } else {
                        stackOut_11_0 = (hk) (Object) stackIn_11_0;
                        stackOut_11_1 = (ft) (Object) stackIn_11_1;
                        stackOut_11_2 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        break L3;
                      }
                    }
                    ((hk) (Object) stackIn_13_0).a((ft) (Object) stackIn_13_1, stackIn_13_2 != 0, true);
                    ((ft) param0).field_e.d(var9, var11.i());
                    break L2;
                  } else {
                    param0.field_e = su.a(((ft) param0).field_x, var11.l(), var11.i(), var11.g());
                    break L2;
                  }
                }
                L4: {
                  if (0 > ((ft) param0).field_y.field_n[((ft) param0).field_n]) {
                    ((ft) param0).field_e.d(-1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var11.h(var9);
                var11.b(param4, param5, -param5 + param3);
                if (!var11.j()) {
                  continue L0;
                } else {
                  ((um) this).field_i.b((rf) (Object) var11);
                  continue L0;
                }
              }
            }
          }
        } else {
          var7 = -120 / ((35 - param1) / 48);
          ((ft) param0).field_e.b(param4, param5, param2);
          return;
        }
    }

    um(hk param0) {
        ((um) this).field_k = new kp();
        ((um) this).field_i = new tp();
        ((um) this).field_l = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = true;
        field_n = "You have <%0> unread messages!";
    }
}
