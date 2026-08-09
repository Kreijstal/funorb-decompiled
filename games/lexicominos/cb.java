/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends kd {
    int field_o;
    int field_u;
    int field_j;
    int field_E;
    static String field_t;
    static db field_n;
    int field_i;
    ke field_w;
    wj field_p;
    int field_y;
    static String field_A;
    int field_x;
    int field_k;
    int field_m;
    static String field_D;
    int field_q;
    rc field_r;
    int field_v;
    int field_B;
    int field_s;
    cc field_C;
    int field_l;
    int field_z;
    int field_h;
    int field_F;

    public static void a(int param0) {
        field_A = null;
        field_D = null;
        if (param0 != 29152) {
            return;
        }
        field_t = null;
        field_n = null;
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        k.b();
                        gl.field_e = new int[260];
                        sb.field_d = 11;
                        var1_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var1_int >= 256) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = 15.0;
                        gl.field_e[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                        var1_int++;
                        if (var4 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 <= -51) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_n = (db) null;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1_int = 256;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var1_int >= gl.field_e.length) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        gl.field_e[var1_int] = 255;
                        var1_int++;
                        if (var4 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        return;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var4 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) var1), "cb.C(" + param0 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        ug.field_m = 0;
        nc.field_p = null;
        af.field_b = false;
        vf.field_r = -1;
        if (param0 != -52) {
          field_n = (db) null;
          bf.field_g = -1;
          return;
        } else {
          bf.field_g = -1;
          return;
        }
    }

    final static boolean a(byte param0, boolean param1, int param2, int param3) {
        int stackIn_19_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        int var4;
        int var5;
        if (!param1) {
          if (oj.field_j[param3] >= oj.field_j[param2]) {
            if (oj.field_j[param3] > oj.field_j[param2]) {
              return false;
            } else {
              if (we.field_g[param3] < we.field_g[param2]) {
                return true;
              } else {
                if (we.field_g[param2] >= we.field_g[param3]) {
                  if (param0 < 13) {
                    cb.b(73);
                    var4 = hl.field_N[param3] + oc.field_a[param3] + l.field_D[param3];
                    var5 = hl.field_N[param2] + oc.field_a[param2] + l.field_D[param2];
                    if (var4 >= var5) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L0: {
                          if (param3 >= param2) {
                            stackIn_56_0 = 0;
                            break L0;
                          } else {
                            stackIn_56_0 = 1;
                            break L0;
                          }
                        }
                        return stackIn_56_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    var4 = hl.field_N[param3] + oc.field_a[param3] + l.field_D[param3];
                    var5 = hl.field_N[param2] + oc.field_a[param2] + l.field_D[param2];
                    if (var4 >= var5) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L1: {
                          if (param3 >= param2) {
                            stackIn_47_0 = 0;
                            break L1;
                          } else {
                            stackIn_47_0 = 1;
                            break L1;
                          }
                        }
                        return stackIn_47_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return true;
          }
        } else {
          if (we.field_g[param2] <= we.field_g[param3]) {
            if (we.field_g[param3] > we.field_g[param2]) {
              return false;
            } else {
              if (oj.field_j[param2] > oj.field_j[param3]) {
                return true;
              } else {
                if (oj.field_j[param3] <= oj.field_j[param2]) {
                  if (param0 < 13) {
                    cb.b(73);
                    var4 = hl.field_N[param3] + oc.field_a[param3] + l.field_D[param3];
                    var5 = hl.field_N[param2] + oc.field_a[param2] + l.field_D[param2];
                    if (var4 >= var5) {
                      if (var5 >= var4) {
                        if (param3 >= param2) {
                          return false;
                        } else {
                          return true;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    var4 = hl.field_N[param3] + oc.field_a[param3] + l.field_D[param3];
                    var5 = hl.field_N[param2] + oc.field_a[param2] + l.field_D[param2];
                    if (var4 >= var5) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L2: {
                          if (param3 >= param2) {
                            stackIn_19_0 = 0;
                            break L2;
                          } else {
                            stackIn_19_0 = 1;
                            break L2;
                          }
                        }
                        return stackIn_19_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    final void c(int param0) {
        if (param0 != 0) {
          cb.a(-98);
          this.field_r = null;
          this.field_C = null;
          this.field_p = null;
          this.field_w = null;
          return;
        } else {
          this.field_r = null;
          this.field_C = null;
          this.field_p = null;
          this.field_w = null;
          return;
        }
    }

    cb() {
    }

    static {
        field_A = "Use this alternative as your account name";
        field_D = "1 of 4";
    }
}
