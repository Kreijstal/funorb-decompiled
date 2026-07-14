/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class pn extends fj implements qb {
    private boolean field_lb;
    private boolean field_ob;
    private boolean field_tb;
    static char[] field_nb;
    static tb field_pb;
    private wl field_sb;
    private boolean field_mb;
    private jm field_rb;
    static String[] field_qb;

    final void a(String param0, int param1, int param2) {
        int var5 = 0;
        qi var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        qi stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        qi stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        qi stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        qi stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        qi stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        qi stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        var5 = EscapeVector.field_A;
        if (((pn) this).field_mb) {
          return;
        } else {
          L0: {
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (-257 != (param2 ^ -1)) {
              stackOut_5_0 = this;
              stackOut_5_1 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L0;
            } else {
              stackOut_4_0 = this;
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L0;
            }
          }
          ((pn) this).field_tb = stackIn_6_1 != 0;
          if (param1 == -1) {
            ((pn) this).field_mb = true;
            ((pn) this).field_rb.a(4210752, 8405024, -127);
            var6 = new qi((pn) this, ((pn) this).field_sb, param0);
            if ((param2 ^ -1) == -6) {
              var6.a(false, vc.field_i, 11);
              var6.a(false, d.field_d, 17);
              if (param2 != 3) {
                if (-5 == (param2 ^ -1)) {
                  var6.a(false, ei.field_k, 8);
                  ((pn) this).a((hm) (Object) var6, 30);
                  return;
                } else {
                  if (6 != param2) {
                    if (9 == param2) {
                      hc discarded$4 = var6.a((wn) this, (byte) -67, lj.field_g);
                      ((pn) this).a((hm) (Object) var6, 30);
                      return;
                    } else {
                      ((pn) this).a((hm) (Object) var6, 30);
                      return;
                    }
                  } else {
                    var6.a(false, ej.field_c, 9);
                    ((pn) this).a((hm) (Object) var6, 30);
                    return;
                  }
                }
              } else {
                var6.a(false, qk.field_a, 7);
                ((pn) this).a((hm) (Object) var6, 30);
                return;
              }
            } else {
              if ((param2 ^ -1) == -257) {
                hc discarded$5 = var6.a((wn) this, (byte) -67, sh.field_s);
                if (param2 != 3) {
                  if (-5 == (param2 ^ -1)) {
                    var6.a(false, ei.field_k, 8);
                    ((pn) this).a((hm) (Object) var6, 30);
                    return;
                  } else {
                    if (6 != param2) {
                      if (9 == param2) {
                        hc discarded$6 = var6.a((wn) this, (byte) -67, lj.field_g);
                        ((pn) this).a((hm) (Object) var6, 30);
                        return;
                      } else {
                        ((pn) this).a((hm) (Object) var6, 30);
                        return;
                      }
                    } else {
                      var6.a(false, ej.field_c, 9);
                      ((pn) this).a((hm) (Object) var6, 30);
                      return;
                    }
                  }
                } else {
                  var6.a(false, qk.field_a, 7);
                  ((pn) this).a((hm) (Object) var6, 30);
                  return;
                }
              } else {
                L1: {
                  stackOut_10_0 = (qi) var6;
                  stackOut_10_1 = 0;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (((pn) this).field_ob) {
                    stackOut_12_0 = (qi) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = sh.field_s;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L1;
                  } else {
                    stackOut_11_0 = (qi) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = li.field_O;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L1;
                  }
                }
                ((qi) (Object) stackIn_13_0).a(stackIn_13_1 != 0, stackIn_13_2, -1);
                if (param2 != 3) {
                  if (-5 == (param2 ^ -1)) {
                    var6.a(false, ei.field_k, 8);
                    ((pn) this).a((hm) (Object) var6, 30);
                    return;
                  } else {
                    if (6 != param2) {
                      if (9 == param2) {
                        hc discarded$7 = var6.a((wn) this, (byte) -67, lj.field_g);
                        ((pn) this).a((hm) (Object) var6, 30);
                        return;
                      } else {
                        ((pn) this).a((hm) (Object) var6, 30);
                        return;
                      }
                    } else {
                      var6.a(false, ej.field_c, 9);
                      ((pn) this).a((hm) (Object) var6, 30);
                      return;
                    }
                  }
                } else {
                  var6.a(false, qk.field_a, 7);
                  ((pn) this).a((hm) (Object) var6, 30);
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static boolean p(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) ck.field_v;
                    // monitorenter ck.field_v
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 < -66) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_nb = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (ta.field_w != ve.field_l) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        // monitorexit var1_ref
                        stackOut_4_0 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        nk.field_n = td.field_b[ve.field_l];
                        jc.field_c = ek.field_a[ve.field_l];
                        ve.field_l = 127 & 1 + ve.field_l;
                        // monitorexit var1_ref
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1_ref
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void r(int param0) {
        int var3 = -15 / ((26 - param0) / 47);
        ((pn) this).field_rb.a(4210752, 2121792, -127);
        qi var2 = new qi((pn) this, ((pn) this).field_sb, ni.field_K);
        var2.a(false, gj.field_u, 15);
        ((pn) this).a((hm) (Object) var2, 30);
    }

    public static void q(int param0) {
        field_nb = null;
        if (param0 != -5) {
            return;
        }
        field_qb = null;
        field_pb = null;
    }

    final static byte[][][] a(int[] param0, mf param1, byte[][][] param2, mf param3, byte param4) {
        if (param4 <= 53) {
            return null;
        }
        return sl.a(param1, param3, param0, param2, 2, 0);
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        if (param3 >= 0) {
          if ((param2 ^ -1) == -14) {
            ((pn) this).o(-18861);
            return true;
          } else {
            return super.a(param0, param1, param2, 117);
          }
        } else {
          return true;
        }
    }

    public void a(hc param0, int param1, int param2, int param3, int param4) {
        if (param3 == 1) {
          if (((pn) this).field_tb) {
            lj.a(3, param3 + 106);
            ((pn) this).o(-18861);
            return;
          } else {
            md.a(oc.d((byte) -85), (byte) -96, "tochangedisplayname.ws");
            return;
          }
        } else {
          return;
        }
    }

    final void o(int param0) {
        if (!((pn) this).field_G) {
          return;
        } else {
          if (param0 == -18861) {
            ((pn) this).field_G = false;
            if (!((pn) this).field_ob) {
              if (!((pn) this).field_lb) {
                return;
              } else {
                eb.k(0);
                return;
              }
            } else {
              jj.a(0);
              return;
            }
          } else {
            return;
          }
        }
    }

    pn(tb param0, wl param1, String param2, boolean param3, boolean param4) {
        super(param0, (hm) (Object) new qi((pn) null, param1, param2), 77, 10, 10);
        ((pn) this).field_mb = false;
        ((pn) this).field_lb = param4 ? true : false;
        ((pn) this).field_tb = false;
        ((pn) this).field_sb = param1;
        ((pn) this).field_ob = param3 ? true : false;
        ((pn) this).field_rb = new jm(13, 50, 274, 30, 15, 2113632, 4210752);
        ((pn) this).field_rb.field_G = true;
        ((pn) this).b((hm) (Object) ((pn) this).field_rb, false);
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2 = param1.length;
        byte[] var3 = new byte[var2];
        qg.a(param1, param0, var3, 0, var2);
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_nb = new char[]{(char)91, (char)93, (char)35};
        field_qb = new String[]{"Fly the container out of the cave<br>and away from the asteroid.", "Fly the container out of the cave<br>and away from the moon.", "Fly the container out of the cave<br>and away from the planet."};
    }
}
