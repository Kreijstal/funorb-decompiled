/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends gd {
    static int field_j;
    private nk field_l;
    private nk field_i;
    static int field_k;

    final fd a(String param0, byte param1) {
        String var3 = null;
        String var4 = null;
        if (param1 <= 52) {
            Object var5 = null;
            boolean discarded$0 = this.b((String) null, (byte) 79);
            var3 = ((wa) this).field_i.field_q.toLowerCase();
            var4 = param0.toLowerCase();
            if (0 == var4.length()) {
                return g.field_k;
            }
            if (!(ll.a(-103, var3, var4))) {
                return g.field_k;
            }
            if (!(!this.b(param0, (byte) -57))) {
                return g.field_k;
            }
            return tg.field_d;
        }
        var3 = ((wa) this).field_i.field_q.toLowerCase();
        var4 = param0.toLowerCase();
        if (0 == var4.length()) {
            return g.field_k;
        }
        if (!(ll.a(-103, var3, var4))) {
            return g.field_k;
        }
        if (!(!this.b(param0, (byte) -57))) {
            return g.field_k;
        }
        return tg.field_d;
    }

    final static ij a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        da var8 = null;
        on var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int[] stackOut_22_0 = null;
        Object stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = HoldTheLine.field_D;
                    var8 = rd.field_e;
                    var3 = var8.f((byte) -70);
                    if ((128 & var3) == 0) {
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
                    jc.field_f = stackIn_3_0 != 0;
                    ch.field_m = 127 & var3;
                    pj.field_o = var8.f((byte) -104);
                    fc.field_c = var8.d(true);
                    if (-3 != (ch.field_m ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    kf.field_H = var8.k(-108);
                    vn.field_f = var8.c(false);
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    kf.field_H = 0;
                    vn.field_f = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (1 != var8.f((byte) -101)) {
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
                    wj.field_a = var8.j(-1231);
                    if (!param1) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    field_k = 82;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var4 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    kl.field_u = var8.j(-1231);
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    kl.field_u = wj.field_a;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (1 == ch.field_m) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (ch.field_m != 4) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    int discarded$4 = var8.k(95);
                    String discarded$5 = var8.j(-1231);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    int discarded$6 = var8.k(95);
                    String discarded$7 = var8.j(-1231);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (!param0) {
                        statePc = 27;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var5 = var8.k(99);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var9 = hg.field_H.a(var5, 1);
                        fi.field_kb = var9.f(245197136);
                        if (kl.field_u.equals((Object) (Object) ng.field_e)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = var9.field_o;
                        stackIn_24_0 = stackOut_22_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = null;
                        stackIn_24_0 = (int[]) (Object) stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        lm.field_d = stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return new ij(param0);
                }
                case 26: {
                    var6 = (Exception) (Object) caughtException;
                    bl.a((Throwable) (Object) var6, (byte) -49, "CC1");
                    lm.field_d = null;
                    fi.field_kb = null;
                    return new ij(param0);
                }
                case 27: {
                    fi.field_kb = ta.a(80, (th) (Object) var8, param1);
                    lm.field_d = null;
                    return new ij(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (nc.field_h == null) {
          return -1;
        } else {
          if (param0 > 114) {
            if (param2 >= qm.field_b) {
              if (param2 < nc.field_h.field_s + qm.field_b) {
                L0: {
                  if (param1 < pk.field_L) {
                    break L0;
                  } else {
                    if (pk.field_L + nc.field_h.field_y <= param1) {
                      break L0;
                    } else {
                      return 0;
                    }
                  }
                }
                if (vg.field_J <= param2) {
                  if (param2 < nc.field_h.field_s + vg.field_J) {
                    if (param1 >= le.field_t) {
                      if (le.field_t - -nc.field_h.field_y <= param1) {
                        return -1;
                      } else {
                        return 1;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                if (vg.field_J <= param2) {
                  if (param2 < nc.field_h.field_s + vg.field_J) {
                    if (param1 >= le.field_t) {
                      if (le.field_t - -nc.field_h.field_y > param1) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              }
            } else {
              if (vg.field_J <= param2) {
                if (param2 < nc.field_h.field_s + vg.field_J) {
                  if (param1 >= le.field_t) {
                    if (le.field_t - -nc.field_h.field_y > param1) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            }
          } else {
            return -100;
          }
        }
    }

    final String a(String param0, boolean param1) {
        String var4 = null;
        String var5 = null;
        String var6 = null;
        var6 = ((wa) this).field_i.field_q.toLowerCase();
        var4 = param0.toLowerCase();
        if (0 != var4.length()) {
          if (param1) {
            var5 = var4;
            if (wc.a(var5, (byte) -27)) {
              return mf.field_b;
            } else {
              if (!t.a(0, var5)) {
                if (aa.a(var5, 1)) {
                  return ak.field_a;
                } else {
                  if (this.b(param0, (byte) -57)) {
                    return pc.field_i;
                  } else {
                    if (0 < var6.length()) {
                      if (!ka.a(var5, (byte) 126, var6)) {
                        if (jc.a(var5, var6, 95)) {
                          return mc.field_c;
                        } else {
                          if (an.a((byte) -127, var5, var6)) {
                            return le.field_p;
                          } else {
                            return mf.field_b;
                          }
                        }
                      } else {
                        return le.field_p;
                      }
                    } else {
                      return vj.field_m;
                    }
                  }
                }
              } else {
                return md.field_c;
              }
            }
          } else {
            field_k = -118;
            var5 = var4;
            if (wc.a(var5, (byte) -27)) {
              return mf.field_b;
            } else {
              if (!t.a(0, var5)) {
                if (aa.a(var5, 1)) {
                  return ak.field_a;
                } else {
                  if (this.b(param0, (byte) -57)) {
                    return pc.field_i;
                  } else {
                    if (0 < var6.length()) {
                      if (!ka.a(var5, (byte) 126, var6)) {
                        if (jc.a(var5, var6, 95)) {
                          return mc.field_c;
                        } else {
                          if (an.a((byte) -127, var5, var6)) {
                            return le.field_p;
                          } else {
                            return mf.field_b;
                          }
                        }
                      } else {
                        return le.field_p;
                      }
                    } else {
                      return vj.field_m;
                    }
                  }
                }
              } else {
                return md.field_c;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static hj[] a(int param0, int param1, int param2, int param3, int param4) {
        hj[] var5 = null;
        hj[] var6 = null;
        var6 = new hj[9];
        var5 = var6;
        var6[6] = mk.a(param2, 124, param0);
        var5[3] = mk.a(param2, 124, param0);
        var5[2] = mk.a(param2, 124, param0);
        var5[param1] = mk.a(param2, 124, param0);
        var5[0] = mk.a(param2, 124, param0);
        var5[8] = mk.a(param4, wb.a(param1, -97), param0);
        var5[7] = mk.a(param4, wb.a(param1, -97), param0);
        var5[5] = mk.a(param4, wb.a(param1, -97), param0);
        if (-1 != (param3 ^ -1)) {
          var5[4] = mk.a(param3, param1 + -108, 64);
          return var5;
        } else {
          return var5;
        }
    }

    wa(nk param0, nk param1, nk param2) {
        super(param0);
        ((wa) this).field_l = param2;
        ((wa) this).field_i = param1;
    }

    private final boolean b(String param0, byte param1) {
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        var7 = param0;
        if (param1 == -57) {
          var3 = ((wa) this).field_l.field_q.toLowerCase();
          var4 = param0.toLowerCase();
          if ((var3.length() ^ -1) < -1) {
            if ((var4.length() ^ -1) < -1) {
              var5 = var3.lastIndexOf("@");
              if (var5 >= 0) {
                if (var3.length() - 1 > var5) {
                  var6 = var3.substring(0, var5);
                  var7 = var3.substring(var5 + 1);
                  if ((var4.indexOf(var6) ^ -1) > -1) {
                    if (var4.indexOf(var7) < 0) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((wa) this).field_i = null;
          var3 = ((wa) this).field_l.field_q.toLowerCase();
          var4 = param0.toLowerCase();
          if ((var3.length() ^ -1) < -1) {
            if ((var4.length() ^ -1) < -1) {
              var5 = var3.lastIndexOf("@");
              if (var5 >= 0) {
                if (var3.length() - 1 > var5) {
                  var6 = var3.substring(0, var5);
                  var7 = var3.substring(var5 + 1);
                  if ((var4.indexOf(var6) ^ -1) > -1) {
                    if (var4.indexOf(var7) >= 0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    static {
    }
}
