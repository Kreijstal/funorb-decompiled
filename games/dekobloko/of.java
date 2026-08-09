/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class of {
    static String field_g;
    static um field_a;
    static boolean field_h;
    static int field_e;
    static boolean field_c;
    static byte[][] field_f;
    static String field_b;
    static int field_i;
    static int field_d;

    abstract ad a(boolean param0);

    public static void a(byte param0) {
        field_b = null;
        if (param0 <= 88) {
          field_g = (String) null;
          field_f = (byte[][]) null;
          field_g = null;
          field_a = null;
          return;
        } else {
          field_f = (byte[][]) null;
          field_g = null;
          field_a = null;
          return;
        }
    }

    abstract int a(int param0, int param1);

    final static void a(int param0) {
        bb.field_f = bb.field_f + 1;
        if (param0 == 0) {
          jg.field_g = jg.field_g + 1;
          if (bb.field_f < 131072) {
            if (jg.field_g > 255) {
              if (-21 > (sl.field_f ^ -1)) {
                jm.field_p = jm.field_p + 1;
                jg.field_g = 0;
                sl.field_f = 0;
                if (mc.field_b.length > jm.field_p) {
                  return;
                } else {
                  jm.field_p = 0;
                  return;
                }
              } else {
                sl.field_f = sl.field_f + 1;
                jg.field_g = 255;
                if (!client.field_A) {
                  return;
                } else {
                  L0: {
                    jm.field_p = jm.field_p + 1;
                    jg.field_g = 0;
                    sl.field_f = 0;
                    if (mc.field_b.length <= jm.field_p) {
                      jm.field_p = 0;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            bb.field_f = 0;
            if (jg.field_g > 255) {
              if (-21 <= (sl.field_f ^ -1)) {
                sl.field_f = sl.field_f + 1;
                jg.field_g = 255;
                if (client.field_A) {
                  jm.field_p = jm.field_p + 1;
                  jg.field_g = 0;
                  sl.field_f = 0;
                  if (mc.field_b.length > jm.field_p) {
                    return;
                  } else {
                    jm.field_p = 0;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L1: {
                  jm.field_p = jm.field_p + 1;
                  jg.field_g = 0;
                  sl.field_f = 0;
                  if (mc.field_b.length <= jm.field_p) {
                    jm.field_p = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    abstract byte[] a(int param0, byte param1);

    final static void a(boolean param0, int param1) {
        bh var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ki var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = (ki) ((Object) cg.field_c.c((byte) -112));
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
                        if (var4 == null) {
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
                        kk.a(param1, -15016, var4);
                        var4 = (ki) ((Object) cg.field_c.d(true));
                        if (var3 != 0) {
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
                        if (var3 == 0) {
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
                        if (!param0) {
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
                        of.a(true, -48);
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
                        var2 = rc.field_e.c((byte) 109);
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
                        if (var2 == null) {
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
                        gm.b(param1, 47);
                        var2 = rc.field_e.d(true);
                        if (var3 == 0) {
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
                        if (var3 == 0) {
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
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var2_ref), "of.C(" + param0 + ',' + param1 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_g = "That name is not available";
        field_a = new um();
        field_f = new byte[1000][];
        field_b = "ESC - cancel private message";
        field_d = -1;
    }
}
