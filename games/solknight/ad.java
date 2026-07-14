/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ad implements Runnable {
    private int field_f;
    private boolean field_p;
    private boolean field_n;
    private byte[] field_a;
    private nj field_d;
    static int field_h;
    static String field_o;
    static hd field_b;
    private int field_j;
    private InputStream field_l;
    private java.net.Socket field_e;
    private dl field_k;
    static String[] field_c;
    private OutputStream field_g;
    static int field_m;
    private int field_i;

    public static void a(byte param0) {
        field_o = null;
        field_b = null;
        if (param0 < 64) {
            field_c = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static boolean a(byte param0, String param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -11) {
          L0: {
            field_o = null;
            if (mc.a(param1, (byte) 105) == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (mc.a(param1, (byte) 105) == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = SolKnight.field_L ? 1 : 0;
                    if (!((ad) this).field_n) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (!((ad) this).field_p) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((ad) this).field_p = false;
                    throw new IOException();
                }
                case 4: {
                    if (((ad) this).field_a == null) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((ad) this).field_a = new byte[((ad) this).field_f];
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var5 = this;
                    // monitorenter this
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        var6 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param2 <= var6) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((ad) this).field_a[((ad) this).field_j] = param3[param1 + var6];
                        ((ad) this).field_j = (1 + ((ad) this).field_j) % ((ad) this).field_f;
                        if (((ad) this).field_j != (-100 + (((ad) this).field_f + ((ad) this).field_i)) % ((ad) this).field_f) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param0 == -28748) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        field_c = null;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((ad) this).field_d != null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((ad) this).field_d = ((ad) this).field_k.a(3, -29, (Runnable) this);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.notifyAll();
                        // monitorexit var5
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 20: {
                    if (var7 instanceof RuntimeException) throw (RuntimeException) var7;
                    if (var7 instanceof Error) throw (Error) var7;
                    throw (IOException) (Object) var7;
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0) throws IOException {
        if (param0) {
          if (!((ad) this).field_n) {
            if (((ad) this).field_p) {
              ((ad) this).field_p = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((ad) this).run();
          if (!((ad) this).field_n) {
            if (((ad) this).field_p) {
              ((ad) this).field_p = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final int b(int param0) throws IOException {
        if (param0 != -30119) {
            Object var3 = null;
            boolean discarded$4 = ad.a((byte) -118, (String) null);
            if (!(!((ad) this).field_n)) {
                return 0;
            }
            return ((ad) this).field_l.available();
        }
        if (!(!((ad) this).field_n)) {
            return 0;
        }
        return ((ad) this).field_l.available();
    }

    public final void run() {
        try {
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            int var6 = 0;
            Object var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = SolKnight.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((ad) this).field_i != ((ad) this).field_j) {
                                statePc = 6;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (((ad) this).field_n) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            this.wait();
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var2 = ((ad) this).field_i;
                            if (((ad) this).field_j >= ((ad) this).field_i) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1_int = ((ad) this).field_f + -((ad) this).field_i;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1_int = -((ad) this).field_i + ((ad) this).field_j;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (-1 <= (var1_int ^ -1)) {
                                statePc = 1;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((ad) this).field_g.write(((ad) this).field_a, var2, var1_int);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 12 : 29);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((ad) this).field_p = true;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            ((ad) this).field_i = (var1_int + ((ad) this).field_i) % ((ad) this).field_f;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (((ad) this).field_i != ((ad) this).field_j) {
                                statePc = 1;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 17 : 29);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ((ad) this).field_g.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 17 : 29);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((ad) this).field_p = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (((ad) this).field_l == null) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((ad) this).field_l.close();
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (null == ((ad) this).field_g) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((ad) this).field_g.close();
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (null != ((ad) this).field_e) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((ad) this).field_e.close();
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var1 = (IOException) (Object) caughtException;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ((ad) this).field_a = null;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        var1_ref = (Exception) (Object) caughtException;
                        var7 = null;
                        hi.a((Throwable) (Object) var1_ref, (String) null, 1);
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ad(java.net.Socket param0, dl param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static int a(int param0, int param1, int param2) {
        if (null != dh.field_j) {
          if (param2 == 0) {
            L0: {
              if (param1 < sa.field_m) {
                break L0;
              } else {
                if (sa.field_m - -dh.field_j.field_p <= param1) {
                  break L0;
                } else {
                  if (param0 < da.field_f) {
                    break L0;
                  } else {
                    if (dh.field_j.field_t + da.field_f <= param0) {
                      break L0;
                    } else {
                      return 0;
                    }
                  }
                }
              }
            }
            if (ke.field_I <= param1) {
              if (ke.field_I + dh.field_j.field_p > param1) {
                if (lk.field_c <= param0) {
                  if (param0 < dh.field_j.field_t + lk.field_c) {
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
          } else {
            field_b = null;
            if (param1 >= sa.field_m) {
              if (sa.field_m - -dh.field_j.field_p > param1) {
                L1: {
                  if (param0 < da.field_f) {
                    break L1;
                  } else {
                    if (dh.field_j.field_t + da.field_f <= param0) {
                      break L1;
                    } else {
                      return 0;
                    }
                  }
                }
                if (ke.field_I <= param1) {
                  if (ke.field_I + dh.field_j.field_p > param1) {
                    if (lk.field_c <= param0) {
                      if (param0 < dh.field_j.field_t + lk.field_c) {
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
              } else {
                if (ke.field_I <= param1) {
                  if (ke.field_I + dh.field_j.field_p > param1) {
                    if (lk.field_c <= param0) {
                      if (param0 >= dh.field_j.field_t + lk.field_c) {
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
              }
            } else {
              if (ke.field_I <= param1) {
                if (ke.field_I + dh.field_j.field_p > param1) {
                  if (lk.field_c <= param0) {
                    if (param0 >= dh.field_j.field_t + lk.field_c) {
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
            }
          }
        } else {
          return -1;
        }
    }

    final int a(int param0) throws IOException {
        if (((ad) this).field_n) {
            return 0;
        }
        if (param0 > -104) {
            ((ad) this).run();
            return ((ad) this).field_l.read();
        }
        return ((ad) this).field_l.read();
    }

    protected final void finalize() {
        ((ad) this).d(2);
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        if (((ad) this).field_n) {
          return;
        } else {
          L0: while (true) {
            if (-1 <= param2) {
              if (param0 <= 32) {
                ((ad) this).field_l = null;
                return;
              } else {
                return;
              }
            } else {
              var5 = ((ad) this).field_l.read(param3, param1, param2);
              if (-1 < var5) {
                param2 = param2 - var5;
                param1 = param1 + var5;
                continue L0;
              } else {
                throw new EOFException();
              }
            }
          }
        }
    }

    final static pc b(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        var2 = param1.length();
        if (-1 == (var2 ^ -1)) {
          return h.field_a;
        } else {
          if (64 >= var2) {
            if (param1.charAt(0) != 34) {
              var3 = 0;
              var4 = 0;
              L0: while (true) {
                if (var2 > var4) {
                  var5 = param1.charAt(var4);
                  if (var5 == 46) {
                    L1: {
                      if (0 == var4) {
                        break L1;
                      } else {
                        if (-1 + var2 == var4) {
                          break L1;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var4++;
                            continue L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    return si.field_C;
                  } else {
                    if (0 == (ab.field_q.indexOf(var5) ^ -1)) {
                      return si.field_C;
                    } else {
                      var3 = 0;
                      var4++;
                      continue L0;
                    }
                  }
                } else {
                  var4 = 107 % ((param0 - -79) / 45);
                  return null;
                }
              }
            } else {
              if (param1.charAt(var2 + -1) == 34) {
                var3 = 0;
                var4 = 1;
                L2: while (true) {
                  if (var2 + -1 > var4) {
                    var5 = param1.charAt(var4);
                    if (var5 != 92) {
                      L3: {
                        if (var5 != 34) {
                          break L3;
                        } else {
                          if (var3 == 0) {
                            return si.field_C;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L2;
                    } else {
                      L4: {
                        if (var3 != 0) {
                          stackOut_14_0 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          break L4;
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          break L4;
                        }
                      }
                      var3 = stackIn_15_0;
                      var4++;
                      continue L2;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return si.field_C;
              }
            }
          } else {
            return el.field_o;
          }
        }
    }

    final static int c(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        var1 = 0;
        var2 = 0;
        if (param0 <= 64) {
          field_b = null;
          L0: while (true) {
            if (!wk.a((byte) -56)) {
              L1: {
                bc.field_K.a(-121, uc.a(gb.field_j, 1691746689, field_m), uc.a(db.field_o, 1691746689, s.field_gb));
                if (bc.field_K.d((byte) -36)) {
                  var1 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              var3 = 0;
              if (var1 != 0) {
                if (-1 >= (bc.field_K.field_f ^ -1)) {
                  L2: {
                    var3 = fl.field_b[bc.field_K.field_f];
                    if (var3 == 2) {
                      kh.a(-78);
                      break L2;
                    } else {
                      if (5 == var3) {
                        kh.a(-78);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (0 != var3) {
                      break L3;
                    } else {
                      if (te.field_M != 2) {
                        break L3;
                      } else {
                        var4 = je.a(1) + -fg.field_f;
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if (0 >= var6) {
                          hc.a(true, true, 5);
                          var3 = 2;
                          break L3;
                        } else {
                          return var3;
                        }
                      }
                    }
                  }
                  return var3;
                } else {
                  L4: {
                    if (var2 == 0) {
                      break L4;
                    } else {
                      if (te.field_M == 2) {
                        break L4;
                      } else {
                        kh.a(-89);
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (0 != var3) {
                      break L5;
                    } else {
                      if (te.field_M != 2) {
                        break L5;
                      } else {
                        var4 = je.a(1) + -fg.field_f;
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if (0 >= var6) {
                          hc.a(true, true, 5);
                          var3 = 2;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  return var3;
                }
              } else {
                L6: {
                  if (var2 == 0) {
                    break L6;
                  } else {
                    if (te.field_M == 2) {
                      break L6;
                    } else {
                      kh.a(-89);
                      break L6;
                    }
                  }
                }
                L7: {
                  if (0 != var3) {
                    break L7;
                  } else {
                    if (te.field_M != 2) {
                      break L7;
                    } else {
                      var4 = je.a(1) + -fg.field_f;
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (0 >= var6) {
                        hc.a(true, true, 5);
                        var3 = 2;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                return var3;
              }
            } else {
              L8: {
                bc.field_K.a(true);
                if (bc.field_K.d((byte) -38)) {
                  var1 = 1;
                  break L8;
                } else {
                  break L8;
                }
              }
              if (13 == el.field_n) {
                var2 = 1;
                continue L0;
              } else {
                continue L0;
              }
            }
          }
        } else {
          L9: while (true) {
            if (!wk.a((byte) -56)) {
              L10: {
                bc.field_K.a(-121, uc.a(gb.field_j, 1691746689, field_m), uc.a(db.field_o, 1691746689, s.field_gb));
                if (bc.field_K.d((byte) -36)) {
                  var1 = 1;
                  break L10;
                } else {
                  break L10;
                }
              }
              var3 = 0;
              if (var1 != 0) {
                if (-1 >= (bc.field_K.field_f ^ -1)) {
                  var3 = fl.field_b[bc.field_K.field_f];
                  if (var3 == 2) {
                    kh.a(-78);
                    if (0 == var3) {
                      if (te.field_M == 2) {
                        var4 = je.a(1) + -fg.field_f;
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if (0 < var6) {
                          return var3;
                        } else {
                          hc.a(true, true, 5);
                          var3 = 2;
                          return var3;
                        }
                      } else {
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  } else {
                    if (5 == var3) {
                      L11: {
                        kh.a(-78);
                        if (0 != var3) {
                          break L11;
                        } else {
                          if (te.field_M != 2) {
                            break L11;
                          } else {
                            var4 = je.a(1) + -fg.field_f;
                            var6 = (int)((-var4 + 10999L) / 1000L);
                            if (0 >= var6) {
                              hc.a(true, true, 5);
                              var3 = 2;
                              break L11;
                            } else {
                              return var3;
                            }
                          }
                        }
                      }
                      return var3;
                    } else {
                      if (0 == var3) {
                        if (te.field_M == 2) {
                          var4 = je.a(1) + -fg.field_f;
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if (0 < var6) {
                            return var3;
                          } else {
                            hc.a(true, true, 5);
                            var3 = 2;
                            return var3;
                          }
                        } else {
                          return var3;
                        }
                      } else {
                        return var3;
                      }
                    }
                  }
                } else {
                  L12: {
                    if (var2 == 0) {
                      break L12;
                    } else {
                      if (te.field_M == 2) {
                        break L12;
                      } else {
                        kh.a(-89);
                        if (0 == var3) {
                          if (te.field_M == 2) {
                            var4 = je.a(1) + -fg.field_f;
                            var6 = (int)((-var4 + 10999L) / 1000L);
                            if (0 >= var6) {
                              hc.a(true, true, 5);
                              var3 = 2;
                              return var3;
                            } else {
                              return var3;
                            }
                          } else {
                            return var3;
                          }
                        } else {
                          return var3;
                        }
                      }
                    }
                  }
                  if (0 == var3) {
                    if (te.field_M == 2) {
                      var4 = je.a(1) + -fg.field_f;
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (0 >= var6) {
                        hc.a(true, true, 5);
                        var3 = 2;
                        return var3;
                      } else {
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                }
              } else {
                L13: {
                  if (var2 == 0) {
                    break L13;
                  } else {
                    if (te.field_M == 2) {
                      break L13;
                    } else {
                      kh.a(-89);
                      if (0 == var3) {
                        if (te.field_M == 2) {
                          var4 = je.a(1) + -fg.field_f;
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if (0 < var6) {
                            return var3;
                          } else {
                            hc.a(true, true, 5);
                            var3 = 2;
                            return var3;
                          }
                        } else {
                          return var3;
                        }
                      } else {
                        return var3;
                      }
                    }
                  }
                }
                if (0 == var3) {
                  if (te.field_M == 2) {
                    var4 = je.a(1) + -fg.field_f;
                    var6 = (int)((-var4 + 10999L) / 1000L);
                    if (0 < var6) {
                      return var3;
                    } else {
                      hc.a(true, true, 5);
                      var3 = 2;
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                } else {
                  return var3;
                }
              }
            } else {
              L14: {
                bc.field_K.a(true);
                if (bc.field_K.d((byte) -38)) {
                  var1 = 1;
                  break L14;
                } else {
                  break L14;
                }
              }
              if (13 == el.field_n) {
                var2 = 1;
                continue L9;
              } else {
                continue L9;
              }
            }
          }
        }
    }

    final void d(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SolKnight.field_L ? 1 : 0;
                    if (!((ad) this).field_n) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var2 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (param0 == 2) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        field_m = -24;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((ad) this).field_n = true;
                        this.notifyAll();
                        // monitorexit var2
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3 = caughtException;
                        // monitorexit var2
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var3;
                }
                case 9: {
                    if (null != ((ad) this).field_d) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((ad) this).field_d = null;
                    return;
                }
                case 11: {
                    if (0 != ((ad) this).field_d.field_c) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    i.a((byte) 56, 1L);
                    statePc = 11;
                    continue stateLoop;
                }
                case 13: {
                    if (-2 != (((ad) this).field_d.field_c ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    try {
                        ((Thread) ((ad) this).field_d.field_e).join();
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    ((ad) this).field_d = null;
                    return;
                }
                case 16: {
                    var2_ref = (InterruptedException) (Object) caughtException;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    ((ad) this).field_d = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private ad(java.net.Socket param0, dl param1, int param2) throws IOException {
        ((ad) this).field_n = false;
        ((ad) this).field_j = 0;
        ((ad) this).field_i = 0;
        ((ad) this).field_p = false;
        ((ad) this).field_k = param1;
        ((ad) this).field_e = param0;
        ((ad) this).field_e.setSoTimeout(30000);
        ((ad) this).field_e.setTcpNoDelay(true);
        ((ad) this).field_l = ((ad) this).field_e.getInputStream();
        ((ad) this).field_g = ((ad) this).field_e.getOutputStream();
        ((ad) this).field_f = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Friends can be added in multiplayer<nbsp>games";
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_m = 0;
    }
}
