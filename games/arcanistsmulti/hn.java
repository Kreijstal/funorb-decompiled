/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hn implements Runnable {
    private int field_b;
    private wk field_h;
    static String field_c;
    private og field_j;
    static vn field_q;
    private java.net.URL field_m;
    static String field_l;
    private og field_a;
    private dl field_n;
    private og field_g;
    static int[] field_k;
    static String field_o;
    static String field_i;
    static qb[] field_d;
    private DataInputStream field_f;
    static int field_p;
    static String field_e;

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        field_i = null;
        field_c = null;
        field_o = null;
        field_d = null;
        int var1 = -7 / ((-28 - param0) / 50);
        field_e = null;
        field_q = null;
    }

    final wk b(int param0) {
        if (param0 != 21496) {
            return null;
        }
        if (((hn) this).field_b != 3) {
            return null;
        }
        return ((hn) this).field_h;
    }

    final synchronized boolean c(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (-3 < ((hn) this).field_b) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return true;
                }
                case 2: {
                    if (-1 != ((hn) this).field_b) {
                        statePc = 11;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (((hn) this).field_a == null) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((hn) this).field_a = ((hn) this).field_n.a(true, ((hn) this).field_m);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (0 != ((hn) this).field_a.field_e) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return false;
                }
                case 8: {
                    if (1 != ((hn) this).field_a.field_e) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((hn) this).field_b = ((hn) this).field_b + 1;
                    ((hn) this).field_a = null;
                    return false;
                }
                case 11: {
                    if (-2 == (((hn) this).field_b ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (null == ((hn) this).field_j) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((hn) this).field_j = ((hn) this).field_n.a(443, true, ((hn) this).field_m.getHost());
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (((hn) this).field_j.field_e == 0) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return false;
                }
                case 19: {
                    if ((((hn) this).field_j.field_e ^ -1) == -2) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ((hn) this).field_j = null;
                    ((hn) this).field_b = ((hn) this).field_b + 1;
                    return false;
                }
                case 21: {
                    if (((hn) this).field_f != null) {
                        statePc = 40;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    try {
                        if (-1 != ((hn) this).field_b) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((hn) this).field_f = (DataInputStream) ((hn) this).field_a.field_g;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-2 == ((hn) this).field_b) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var4 = (java.net.Socket) ((hn) this).field_j.field_g;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((hn) this).field_m.getFile() + "\n\n");
                        var3.write(go.a(var5, (byte) -82));
                        ((hn) this).field_f = new DataInputStream(var4.getInputStream());
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ((hn) this).field_h.field_g = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 28: {
                    if (param0 < -51) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    return false;
                }
                case 30: {
                    if (((hn) this).field_g != null) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    ((hn) this).field_g = ((hn) this).field_n.a(124, 5, (Runnable) this);
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (((hn) this).field_g.field_e == -1) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    return false;
                }
                case 35: {
                    if (-2 == ((hn) this).field_g.field_e) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    ((hn) this).finalize();
                    ((hn) this).field_b = ((hn) this).field_b + 1;
                    return false;
                }
                case 37: {
                    return false;
                }
                case 39: {
                    var2 = (IOException) (Object) caughtException;
                    ((hn) this).finalize();
                    ((hn) this).field_b = ((hn) this).field_b + 1;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (param0 < -51) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    return false;
                }
                case 42: {
                    if (((hn) this).field_g != null) {
                        statePc = 50;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    ((hn) this).field_g = ((hn) this).field_n.a(124, 5, (Runnable) this);
                    if (((hn) this).field_g.field_e == -1) {
                        statePc = 45;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 45: {
                    return false;
                }
                case 46: {
                    if (-2 != ((hn) this).field_g.field_e) {
                        statePc = 48;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 48: {
                    ((hn) this).finalize();
                    ((hn) this).field_b = ((hn) this).field_b + 1;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    return false;
                }
                case 50: {
                    if (((hn) this).field_g.field_e == -1) {
                        statePc = 52;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 52: {
                    return false;
                }
                case 53: {
                    if (-2 != ((hn) this).field_g.field_e) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    ((hn) this).finalize();
                    ((hn) this).field_b = ((hn) this).field_b + 1;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(char param0, int param1) {
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_21_0 = 0;
        if (param1 == 17769) {
          if (param0 < 48) {
            if (param0 < 65) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param0 <= 90) {
                stackOut_65_0 = 1;
                stackIn_67_0 = stackOut_65_0;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (param0 < 97) {
                      break L1;
                    } else {
                      if (param0 > 122) {
                        break L1;
                      } else {
                        stackOut_62_0 = 1;
                        stackIn_64_0 = stackOut_62_0;
                        break L0;
                      }
                    }
                  }
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
                  break L0;
                }
                return stackIn_64_0 != 0;
              }
            }
          } else {
            if (57 < param0) {
              if (param0 < 65) {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (param0 > 90) {
                  L2: {
                    L3: {
                      if (param0 < 97) {
                        break L3;
                      } else {
                        if (param0 > 122) {
                          break L3;
                        } else {
                          stackOut_48_0 = 1;
                          stackIn_50_0 = stackOut_48_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_49_0 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackOut_43_0 = 1;
                  stackIn_45_0 = stackOut_43_0;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackOut_38_0 = 1;
              stackIn_40_0 = stackOut_38_0;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          boolean discarded$1 = hn.a('f', 28);
          if (param0 >= 48) {
            if (57 < param0) {
              if (param0 < 65) {
                if (param0 >= 97) {
                  if (param0 <= 122) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (param0 > 90) {
                  L4: {
                    L5: {
                      if (param0 < 97) {
                        break L5;
                      } else {
                        if (param0 > 122) {
                          break L5;
                        } else {
                          stackOut_26_0 = 1;
                          stackIn_28_0 = stackOut_26_0;
                          break L4;
                        }
                      }
                    }
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param0 < 65) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param0 > 90) {
                if (param0 >= 97) {
                  if (param0 > 122) {
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
            }
          }
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var4 = ArcanistsMulti.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((hn) this).field_h.field_j.length <= ((hn) this).field_h.field_g) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var1_int = ((hn) this).field_f.read(((hn) this).field_h.field_j, ((hn) this).field_h.field_g, ((hn) this).field_h.field_j.length + -((hn) this).field_h.field_g);
                            if (-1 < (var1_int ^ -1)) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            ((hn) this).field_h.field_g = ((hn) this).field_h.field_g + var1_int;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (((hn) this).field_h.field_j.length == ((hn) this).field_h.field_g) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((hn) this).field_h.field_j.length + " " + ((hn) this).field_m);
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1 = this;
                            // monitorenter this
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((hn) this).finalize();
                            ((hn) this).field_b = 3;
                            // monitorexit var1
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            return;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = caughtException;
                            // monitorexit var1
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            throw (RuntimeException) (Object) var2;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var1_ref = (Exception) (Object) caughtException;
                        var2_ref = this;
                        // monitorenter this
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((hn) this).finalize();
                            ((hn) this).field_b = ((hn) this).field_b + 1;
                            // monitorexit var2_ref
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return;
                    }
                    case 16: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2_ref
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        throw (RuntimeException) (Object) var3;
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

    final static boolean a(byte param0) {
        int var1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_12_0 = 0;
        var1 = 85 % ((param0 - 10) / 60);
        if (jf.field_e) {
          if (pe.field_Jb) {
            if (!be.field_g) {
              if (lc.a((byte) 112)) {
                return true;
              } else {
                return false;
              }
            } else {
              if (!kg.field_a) {
                L0: {
                  if (!lc.a((byte) 112)) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L0;
                  }
                }
                return stackIn_18_0 != 0;
              } else {
                stackOut_12_0 = 1;
                stackIn_14_0 = stackOut_12_0;
                return stackIn_14_0 != 0;
              }
            }
          } else {
            if (lc.a((byte) 112)) {
              return true;
            } else {
              return false;
            }
          }
        } else {
          if (lc.a((byte) 112)) {
            return true;
          } else {
            return false;
          }
        }
    }

    protected final void finalize() {
        if (!(((hn) this).field_a == null)) {
            if (null != ((hn) this).field_a.field_g) {
                try {
                    ((DataInputStream) ((hn) this).field_a.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((hn) this).field_a = null;
        }
        if (((hn) this).field_j != null) {
            if (!(((hn) this).field_j.field_g == null)) {
                try {
                    ((java.net.Socket) ((hn) this).field_j.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((hn) this).field_j = null;
        }
        if (!(null == ((hn) this).field_f)) {
            try {
                ((hn) this).field_f.close();
            } catch (Exception exception) {
            }
            ((hn) this).field_f = null;
        }
        ((hn) this).field_g = null;
    }

    hn(dl param0, java.net.URL param1, int param2) {
        ((hn) this).field_m = param1;
        ((hn) this).field_n = param0;
        ((hn) this).field_h = new wk(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Advanced Elemental Control";
        field_l = "Loading...";
        field_q = new vn();
        field_i = "Either affect your Arcanist or the whole arena - just click the mouse to activate.";
        field_e = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_o = "Goblin Caves:";
        field_p = 20;
    }
}
