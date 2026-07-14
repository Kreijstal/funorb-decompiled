/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej implements Runnable {
    private be field_g;
    static String[] field_f;
    private java.net.URL field_l;
    private ce field_h;
    static mk field_e;
    private ce field_i;
    static String field_b;
    private uf field_c;
    private int field_j;
    private ce field_k;
    private DataInputStream field_a;
    static qj field_d;

    final be a(int param0) {
        if (param0 != -5) {
            return null;
        }
        if (!(-4 != (((ej) this).field_j ^ -1))) {
            return ((ej) this).field_g;
        }
        return null;
    }

    final static boolean a(boolean param0, CharSequence param1) {
        if (param0) {
            return false;
        }
        return mb.a(55, param1, 10, true);
    }

    final synchronized boolean a(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (-3 >= ((ej) this).field_j) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return true;
                }
                case 3: {
                    if (-1 == ((ej) this).field_j) {
                        statePc = 5;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (null == ((ej) this).field_i) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((ej) this).field_i = ((ej) this).field_c.a(false, ((ej) this).field_l);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (-1 == (((ej) this).field_i.field_f ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return false;
                }
                case 11: {
                    if ((((ej) this).field_i.field_f ^ -1) != -2) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ((ej) this).field_j = ((ej) this).field_j + 1;
                    ((ej) this).field_i = null;
                    return false;
                }
                case 14: {
                    if (((ej) this).field_j != 1) {
                        statePc = 23;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (null != ((ej) this).field_h) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    ((ej) this).field_h = ((ej) this).field_c.a(55, 443, ((ej) this).field_l.getHost());
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (-1 == (((ej) this).field_h.field_f ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    return false;
                }
                case 20: {
                    if (((ej) this).field_h.field_f != 1) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    ((ej) this).field_j = ((ej) this).field_j + 1;
                    ((ej) this).field_h = null;
                    return false;
                }
                case 23: {
                    if (((ej) this).field_a == null) {
                        statePc = 36;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (null == ((ej) this).field_k) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    ((ej) this).field_k = ((ej) this).field_c.a(5, (Runnable) this, 72);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (-1 == ((ej) this).field_k.field_f) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    return false;
                }
                case 30: {
                    if (param0 >= 72) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    ((ej) this).finalize();
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (-2 != ((ej) this).field_k.field_f) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    return false;
                }
                case 34: {
                    ((ej) this).finalize();
                    ((ej) this).field_j = ((ej) this).field_j + 1;
                    return false;
                }
                case 36: {
                    try {
                        if (0 != ((ej) this).field_j) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((ej) this).field_a = (DataInputStream) ((ej) this).field_i.field_e;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (1 == ((ej) this).field_j) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var4 = (java.net.Socket) ((ej) this).field_h.field_e;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((ej) this).field_l.getFile() + "\n\n");
                        var3.write(bc.a((byte) -6, var5));
                        ((ej) this).field_a = new DataInputStream(var4.getInputStream());
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ((ej) this).field_g.field_k = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 42: {
                    if (null == ((ej) this).field_k) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ((ej) this).field_k = ((ej) this).field_c.a(5, (Runnable) this, 72);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (-1 == ((ej) this).field_k.field_f) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    return false;
                }
                case 48: {
                    if (param0 >= 72) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    ((ej) this).finalize();
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (-2 == ((ej) this).field_k.field_f) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    ((ej) this).finalize();
                    ((ej) this).field_j = ((ej) this).field_j + 1;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    return false;
                }
                case 53: {
                    var2 = (IOException) (Object) caughtException;
                    ((ej) this).finalize();
                    ((ej) this).field_j = ((ej) this).field_j + 1;
                    if (null == ((ej) this).field_k) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    ((ej) this).field_k = ((ej) this).field_c.a(5, (Runnable) this, 72);
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (-1 == ((ej) this).field_k.field_f) {
                        statePc = 58;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 58: {
                    return false;
                }
                case 59: {
                    if (param0 >= 72) {
                        statePc = 64;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    ((ej) this).finalize();
                    if (-2 == ((ej) this).field_k.field_f) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    ((ej) this).finalize();
                    ((ej) this).field_j = ((ej) this).field_j + 1;
                    return false;
                }
                case 62: {
                    return false;
                }
                case 64: {
                    if (-2 != (((ej) this).field_k.field_f ^ -1)) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    return false;
                }
                case 66: {
                    ((ej) this).finalize();
                    ((ej) this).field_j = ((ej) this).field_j + 1;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        ob.field_u = null;
        w.field_V = null;
        rf.field_c = 0;
        var2 = ga.field_e;
        ga.field_e = fj.field_T;
        fj.field_T = var2;
        if (param0 > 8) {
          rj.field_d.field_e = rj.field_d.field_e + 1;
          if (param1 == 51) {
            rj.field_d.field_b = 2;
            if (-3 > rj.field_d.field_e) {
              if (-3 > rj.field_d.field_e) {
                if ((rj.field_d.field_e ^ -1) > -5) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (-51 == (param1 ^ -1)) {
                  return 5;
                } else {
                  if ((rj.field_d.field_e ^ -1) > -5) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if (param1 == -52) {
                return 2;
              } else {
                if (-3 > rj.field_d.field_e) {
                  if (rj.field_d.field_e > -5) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (-51 == (param1 ^ -1)) {
                    return 5;
                  } else {
                    if ((rj.field_d.field_e ^ -1) > -5) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              }
            }
          } else {
            if (param1 != -51) {
              rj.field_d.field_b = 1;
              if (-3 > rj.field_d.field_e) {
                if (-3 > rj.field_d.field_e) {
                  if (rj.field_d.field_e > -5) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (-51 == (param1 ^ -1)) {
                    return 5;
                  } else {
                    if ((rj.field_d.field_e ^ -1) > -5) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                if (param1 == -52) {
                  return 2;
                } else {
                  if (-3 <= rj.field_d.field_e) {
                    if (-51 == param1) {
                      return 5;
                    } else {
                      if (rj.field_d.field_e > -5) {
                        return -1;
                      } else {
                        return 1;
                      }
                    }
                  } else {
                    if (rj.field_d.field_e > -5) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              }
            } else {
              rj.field_d.field_b = 5;
              if (-3 > rj.field_d.field_e) {
                if (-3 > rj.field_d.field_e) {
                  if (rj.field_d.field_e > -5) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (-51 == (param1 ^ -1)) {
                    return 5;
                  } else {
                    if ((rj.field_d.field_e ^ -1) > -5) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                if (param1 == -52) {
                  return 2;
                } else {
                  if (-3 > rj.field_d.field_e) {
                    if (rj.field_d.field_e > -5) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    if (-51 == (param1 ^ -1)) {
                      return 5;
                    } else {
                      if ((rj.field_d.field_e ^ -1) > -5) {
                        return -1;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          field_b = null;
          rj.field_d.field_e = rj.field_d.field_e + 1;
          if (param1 == 51) {
            rj.field_d.field_b = 2;
            if (-3 >= rj.field_d.field_e) {
              if (param1 == -52) {
                return 2;
              } else {
                if (-3 <= rj.field_d.field_e) {
                  if (-51 == param1) {
                    return 5;
                  } else {
                    if ((rj.field_d.field_e ^ -1) > -5) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                } else {
                  if (rj.field_d.field_e > -5) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if (-3 > rj.field_d.field_e) {
                if ((rj.field_d.field_e ^ -1) > -5) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (-51 != (param1 ^ -1)) {
                  if (rj.field_d.field_e <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 5;
                }
              }
            }
          } else {
            if (param1 != -51) {
              rj.field_d.field_b = 1;
              if (-3 >= rj.field_d.field_e) {
                if (param1 == -52) {
                  return 2;
                } else {
                  if (-3 <= rj.field_d.field_e) {
                    if (-51 == param1) {
                      return 5;
                    } else {
                      if ((rj.field_d.field_e ^ -1) <= -5) {
                        return 1;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    if (rj.field_d.field_e <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              } else {
                L0: {
                  if (-3 > rj.field_d.field_e) {
                    break L0;
                  } else {
                    if (-51 == (param1 ^ -1)) {
                      return 5;
                    } else {
                      break L0;
                    }
                  }
                }
                if ((rj.field_d.field_e ^ -1) <= -5) {
                  return 1;
                } else {
                  return -1;
                }
              }
            } else {
              rj.field_d.field_b = 5;
              if (-3 <= rj.field_d.field_e) {
                if (param1 == -52) {
                  return 2;
                } else {
                  if (-3 <= rj.field_d.field_e) {
                    if (-51 == param1) {
                      return 5;
                    } else {
                      if ((rj.field_d.field_e ^ -1) <= -5) {
                        return 1;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    if (rj.field_d.field_e <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              } else {
                L1: {
                  if (-3 < rj.field_d.field_e) {
                    break L1;
                  } else {
                    if (-51 == param1) {
                      return 5;
                    } else {
                      break L1;
                    }
                  }
                }
                if ((rj.field_d.field_e ^ -1) <= -5) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          }
        }
    }

    final static int a(int param0, int param1, CharSequence param2) {
        int var3 = -55 % ((-73 - param1) / 38);
        return rd.a(8058, true, param2, param0);
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
                        var4 = TrackController.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((ej) this).field_g.field_k >= ((ej) this).field_g.field_j.length) {
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
                            var1_int = ((ej) this).field_a.read(((ej) this).field_g.field_j, ((ej) this).field_g.field_k, -((ej) this).field_g.field_k + ((ej) this).field_g.field_j.length);
                            if ((var1_int ^ -1) > -1) {
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
                            ((ej) this).field_g.field_k = ((ej) this).field_g.field_k + var1_int;
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
                            if (((ej) this).field_g.field_j.length == ((ej) this).field_g.field_k) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((ej) this).field_g.field_j.length + " " + ((ej) this).field_l);
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
                            ((ej) this).finalize();
                            ((ej) this).field_j = 3;
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
                            ((ej) this).finalize();
                            ((ej) this).field_j = ((ej) this).field_j + 1;
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

    protected final void finalize() {
        if (null != ((ej) this).field_i) {
            if (((ej) this).field_i.field_e != null) {
                try {
                    ((DataInputStream) ((ej) this).field_i.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((ej) this).field_i = null;
        }
        if (null != ((ej) this).field_h) {
            if (!(null == ((ej) this).field_h.field_e)) {
                try {
                    ((java.net.Socket) ((ej) this).field_h.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((ej) this).field_h = null;
        }
        if (!(((ej) this).field_a == null)) {
            try {
                ((ej) this).field_a.close();
            } catch (Exception exception) {
            }
            ((ej) this).field_a = null;
        }
        ((ej) this).field_k = null;
    }

    public static void b(int param0) {
        field_b = null;
        field_f = null;
        field_d = null;
        if (param0 != 17) {
            field_e = null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    ej(uf param0, java.net.URL param1, int param2) {
        ((ej) this).field_l = param1;
        ((ej) this).field_c = param0;
        ((ej) this).field_g = new be(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_b = "Use the arrow keys or mouse to move.";
        field_e = new mk();
    }
}
