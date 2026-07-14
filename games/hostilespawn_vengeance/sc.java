/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sc implements Runnable {
    private vi field_m;
    private kk field_f;
    private java.net.URL field_o;
    static int field_c;
    private fd field_e;
    static String field_p;
    static String field_h;
    private DataInputStream field_d;
    static bd field_a;
    static String field_i;
    static String field_k;
    static bd field_l;
    static en field_g;
    private kk field_n;
    private int field_b;
    private kk field_j;

    protected final void finalize() {
        if (null != ((sc) this).field_n) {
            if (!(null == ((sc) this).field_n.field_c)) {
                try {
                    ((DataInputStream) ((sc) this).field_n.field_c).close();
                } catch (Exception exception) {
                }
            }
            ((sc) this).field_n = null;
        }
        if (!(((sc) this).field_j == null)) {
            if (((sc) this).field_j.field_c != null) {
                try {
                    ((java.net.Socket) ((sc) this).field_j.field_c).close();
                } catch (Exception exception) {
                }
            }
            ((sc) this).field_j = null;
        }
        if (null != ((sc) this).field_d) {
            try {
                ((sc) this).field_d.close();
            } catch (Exception exception) {
            }
            ((sc) this).field_d = null;
        }
        ((sc) this).field_f = null;
    }

    final vi b(byte param0) {
        if ((((sc) this).field_b ^ -1) == -4) {
            return ((sc) this).field_m;
        }
        if (param0 >= 123) {
            return null;
        }
        return null;
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
                        var4 = HostileSpawn.field_I ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((sc) this).field_m.field_n.length <= ((sc) this).field_m.field_i) {
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
                            var1_int = ((sc) this).field_d.read(((sc) this).field_m.field_n, ((sc) this).field_m.field_i, ((sc) this).field_m.field_n.length + -((sc) this).field_m.field_i);
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
                            ((sc) this).field_m.field_i = ((sc) this).field_m.field_i + var1_int;
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
                            if (((sc) this).field_m.field_n.length == ((sc) this).field_m.field_i) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((sc) this).field_m.field_n.length + " " + ((sc) this).field_o);
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
                            ((sc) this).finalize();
                            ((sc) this).field_b = 3;
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
                            statePc = 18;
                            continue stateLoop;
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
                            ((sc) this).finalize();
                            ((sc) this).field_b = ((sc) this).field_b + 1;
                            // monitorexit var2_ref
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
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
                    case 18: {
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

    public static void a(int param0) {
        field_h = null;
        int var1 = -6 / ((-27 - param0) / 46);
        field_g = null;
        field_k = null;
        field_l = null;
        field_p = null;
        field_a = null;
        field_i = null;
    }

    final synchronized boolean b(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (-3 < (((sc) this).field_b ^ -1)) {
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
                    if (param0 == 24) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    boolean discarded$2 = ((sc) this).b(58);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (((sc) this).field_b == 0) {
                        statePc = 6;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (null != ((sc) this).field_n) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((sc) this).field_n = ((sc) this).field_e.a(30085, ((sc) this).field_o);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (((sc) this).field_n.field_f != 0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return false;
                }
                case 10: {
                    if (-2 != (((sc) this).field_n.field_f ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    ((sc) this).field_n = null;
                    ((sc) this).field_b = ((sc) this).field_b + 1;
                    return false;
                }
                case 13: {
                    if (((sc) this).field_b == 1) {
                        statePc = 15;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (((sc) this).field_j != null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    ((sc) this).field_j = ((sc) this).field_e.a(((sc) this).field_o.getHost(), 96, 443);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (0 != ((sc) this).field_j.field_f) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return false;
                }
                case 19: {
                    if (1 == ((sc) this).field_j.field_f) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ((sc) this).field_b = ((sc) this).field_b + 1;
                    ((sc) this).field_j = null;
                    return false;
                }
                case 21: {
                    if (((sc) this).field_d == null) {
                        statePc = 23;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 23: {
                    try {
                        if (((sc) this).field_b != 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((sc) this).field_d = (DataInputStream) ((sc) this).field_n.field_c;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((((sc) this).field_b ^ -1) != -2) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var4 = (java.net.Socket) ((sc) this).field_j.field_c;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((sc) this).field_o.getFile() + "\n\n");
                        var3.write(lf.a((byte) 113, var5));
                        ((sc) this).field_d = new DataInputStream(var4.getInputStream());
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
                        ((sc) this).field_m.field_i = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var2 = (IOException) (Object) caughtException;
                    ((sc) this).finalize();
                    ((sc) this).field_b = ((sc) this).field_b + 1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (((sc) this).field_f == null) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    ((sc) this).field_f = ((sc) this).field_e.a(5, (Runnable) this, -102);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (((sc) this).field_f.field_f == 0) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    return false;
                }
                case 36: {
                    if (1 == ((sc) this).field_f.field_f) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((sc) this).finalize();
                    ((sc) this).field_b = ((sc) this).field_b + 1;
                    return false;
                }
                case 38: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        L0: {
          u.field_f = new String[34];
          u.field_f[4] = fh.field_e;
          u.field_f[16] = ch.field_d;
          u.field_f[1] = hn.field_d;
          u.field_f[14] = ob.field_E;
          u.field_f[12] = na.field_q;
          u.field_f[0] = lg.field_l;
          u.field_f[2] = lg.field_h;
          u.field_f[6] = ej.field_o;
          u.field_f[3] = il.field_d;
          u.field_f[7] = jh.field_bb;
          u.field_f[15] = ed.field_d;
          u.field_f[13] = wc.field_s;
          u.field_f[11] = mm.field_h;
          u.field_f[5] = ej.field_o;
          u.field_f[18] = field_p;
          u.field_f[28] = ia.field_k;
          u.field_f[29] = aj.field_g;
          u.field_f[23] = bl.field_e;
          if (param0 == 118) {
            break L0;
          } else {
            sc.a(-47);
            break L0;
          }
        }
        u.field_f[17] = ui.field_d;
        u.field_f[32] = f.field_c;
        u.field_f[22] = il.field_d;
        u.field_f[26] = jf.field_e;
        u.field_f[25] = em.field_b;
        u.field_f[33] = ln.field_h;
        u.field_f[24] = gn.field_l;
        u.field_f[10] = m.field_m[2];
        u.field_f[31] = og.field_e;
        u.field_f[21] = ed.field_d;
        u.field_f[9] = m.field_m[1];
        u.field_f[30] = c.field_b;
        u.field_f[8] = m.field_m[0];
    }

    sc(fd param0, java.net.URL param1, int param2) {
        ((sc) this).field_o = param1;
        ((sc) this).field_e = param0;
        ((sc) this).field_m = new vi(param2);
    }

    final static void a(int param0, p param1, int[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        oj var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var13 = HostileSpawn.field_I ? 1 : 0;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          L1: {
            if (0 != param1.field_e) {
              break L1;
            } else {
              L2: {
                jn.field_F[ib.field_c].field_c = 256.0 * Math.random();
                var4++;
                jn.field_F[ib.field_c].field_j.a((byte) 46, param1.field_j);
                jn.field_F[ib.field_c].field_l.a(param1.field_l, -28860);
                jn.field_F[ib.field_c].field_e = -var4;
                jn.field_F[ib.field_c].field_h = 0;
                jn.field_F[ib.field_c].field_i = 6;
                ib.field_c = ib.field_c + 1;
                param1.field_l.a(5, (byte) 94, param1.field_c);
                param1.a(8573);
                param2[param0] = 0;
                if (2 != param2[param1.field_j.b(-4)]) {
                  break L2;
                } else {
                  param1.field_e = 1;
                  param1.field_l.a(15, (byte) 94, param1.field_c);
                  break L2;
                }
              }
              var6 = 1;
              L3: while (true) {
                L4: {
                  if (rc.field_e <= var6) {
                    break L4;
                  } else {
                    L5: {
                      var7 = 0;
                      var8 = 0;
                      var9 = re.field_n[var6];
                      var10 = var9.field_i;
                      var8 = (int)(((double)var9.field_j.field_g + var9.field_l.field_a - (double)param1.field_j.field_g - param1.field_l.field_a) * 24.0);
                      var7 = (int)(24.0 * ((double)var9.field_j.field_e + var9.field_l.field_f - (double)param1.field_j.field_e - param1.field_l.field_f));
                      var11 = 24;
                      if (-var11 > var7) {
                        break L5;
                      } else {
                        if (var7 > var11) {
                          break L5;
                        } else {
                          if (-var11 > var8) {
                            break L5;
                          } else {
                            if (var11 <= var8) {
                              break L5;
                            } else {
                              if ((var9.field_I ^ -1) >= -1) {
                                break L5;
                              } else {
                                L6: {
                                  if (var10 < 12) {
                                    break L6;
                                  } else {
                                    if (var10 >= 18) {
                                      break L6;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                L7: {
                                  jn.field_F[ib.field_c - 1].field_i = 1;
                                  if ((var9.field_I ^ -1) >= -1) {
                                    stackOut_16_0 = 0;
                                    stackIn_17_0 = stackOut_16_0;
                                    break L7;
                                  } else {
                                    stackOut_15_0 = 1;
                                    stackIn_17_0 = stackOut_15_0;
                                    break L7;
                                  }
                                }
                                L8: {
                                  var12 = stackIn_17_0;
                                  if (var9.a(param1.field_i, -101)) {
                                    L9: {
                                      L10: {
                                        if ((param1.field_i ^ -1) != -6) {
                                          break L10;
                                        } else {
                                          var9.field_I = var9.field_I - 8;
                                          if (0 == 0) {
                                            break L9;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      var9.field_I = var9.field_I - 16;
                                      break L9;
                                    }
                                    if (!var9.field_b) {
                                      break L8;
                                    } else {
                                      if (var9.field_I > 0) {
                                        tk.a(8, jc.field_c, 1, true);
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                                L11: {
                                  L12: {
                                    if (var10 == 8) {
                                      break L12;
                                    } else {
                                      if (var10 == 5) {
                                        break L12;
                                      } else {
                                        if (var10 == 10) {
                                          break L12;
                                        } else {
                                          if (var10 == 11) {
                                            break L12;
                                          } else {
                                            if (var10 == 128) {
                                              break L12;
                                            } else {
                                              if (var10 == 129) {
                                                break L12;
                                              } else {
                                                if (var10 == 130) {
                                                  break L12;
                                                } else {
                                                  if (var10 == 131) {
                                                    break L12;
                                                  } else {
                                                    if (132 == var10) {
                                                      break L12;
                                                    } else {
                                                      if (var10 == 133) {
                                                        break L12;
                                                      } else {
                                                        if (var10 == 20) {
                                                          break L12;
                                                        } else {
                                                          if (22 == var10) {
                                                            break L12;
                                                          } else {
                                                            if (!var9.a((byte) 54)) {
                                                              break L11;
                                                            } else {
                                                              break L12;
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
                                        }
                                      }
                                    }
                                  }
                                  if (!var9.a(param1.field_i, -119)) {
                                    break L11;
                                  } else {
                                    L13: {
                                      if (param1.field_i != 5) {
                                        break L13;
                                      } else {
                                        var9.field_I = var9.field_I - 48;
                                        if (0 != bm.field_c) {
                                          break L11;
                                        } else {
                                          if (8 == var10) {
                                            param1.field_e = 1;
                                            if (0 == 0) {
                                              break L11;
                                            } else {
                                              break L13;
                                            }
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                    var9.field_I = var9.field_I - 192;
                                    break L11;
                                  }
                                }
                                L14: {
                                  var9.field_F = 255;
                                  jn.field_F[-1 + ib.field_c].field_e = 1;
                                  if (var9.field_I <= 0) {
                                    L15: {
                                      var9.field_I = 0;
                                      if (!var9.field_b) {
                                        break L15;
                                      } else {
                                        if (var12 == 0) {
                                          break L15;
                                        } else {
                                          if (var9.field_i != 27) {
                                            L16: {
                                              al.field_U[3] = al.field_U[3] + 1;
                                              if (-31 != (al.field_U[3] + 1 ^ -1)) {
                                                break L16;
                                              } else {
                                                ti.a(247, (byte) 67, 8);
                                                break L16;
                                              }
                                            }
                                            var5++;
                                            if (var5 == 5) {
                                              ti.a(245, (byte) -6, 10);
                                              break L15;
                                            } else {
                                              break L15;
                                            }
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                    jn.field_F[-1 + ib.field_c].field_i = 3;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                nh.a(var9, -29966);
                                break L5;
                              }
                            }
                          }
                        }
                      }
                    }
                    var6++;
                    if (0 == 0) {
                      continue L3;
                    } else {
                      break L4;
                    }
                  }
                }
                param2[param0] = 3;
                if (0 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          L17: {
            if (param3 == 1) {
              break L17;
            } else {
              var14 = null;
              sc.a(69, (p) null, (int[]) null, -89);
              break L17;
            }
          }
          L18: {
            if ((param1.field_e ^ -1) >= -1) {
              break L18;
            } else {
              param1.field_e = param1.field_e + 1;
              break L18;
            }
          }
          L19: {
            if (param1.field_e > 32) {
              param1.field_i = -1;
              break L19;
            } else {
              break L19;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Next";
        field_h = "Before you start your mission you should check your systems.<br><br>Use <img=2> or <img=1> to move to the door.  The two sets of keys operate slightly differently, so choose the combination that feels most intuitive.<br>Press <img=5> to swap the keys' effects.";
        field_k = "Quit to website";
        field_i = "Cancel";
    }
}
