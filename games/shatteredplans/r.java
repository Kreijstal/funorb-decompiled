/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class r implements Runnable {
    private ob field_k;
    private qb field_l;
    static String field_f;
    static int field_c;
    private pb field_b;
    static int[] field_j;
    private DataInputStream field_g;
    private int field_h;
    private java.net.URL field_e;
    private pb field_a;
    static boolean field_d;
    private pb field_i;

    final static void a(byte param0) {
        int var2 = 0;
        gr var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        sl var16 = null;
        String[][] var17 = null;
        int[][] var18 = null;
        String[][] var19 = null;
        int[][] var20 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        var16 = sa.field_a;
        var2 = var16.j(-102);
        var3 = (gr) (Object) qa.field_r.d(0);
        L0: while (true) {
          if (var3 == null) {
            if (var3 == null) {
              q.g(-119);
              return;
            } else {
              var4 = -122 % ((14 - param0) / 34);
              var5 = var16.j(-87);
              if (var5 != 0) {
                var6 = var3.field_j;
                wb.field_a[0] = ln.field_o;
                var7 = 1;
                L1: while (true) {
                  if (var5 <= var7) {
                    vd.a(var6, var5, (byte) 18);
                    var7 = 0;
                    L2: while (true) {
                      if (var5 <= var7) {
                        bh.a(var6, (byte) -111);
                        var3.field_n = new String[2][var6];
                        var19 = new String[2][var6];
                        var3.field_m = new int[2][4 * var6];
                        var20 = new int[2][4 * var6];
                        var9 = wm.field_c;
                        var10 = 0;
                        var11 = 0;
                        L3: while (true) {
                          if (var9 <= var10) {
                            var14 = 0;
                            var10 = var14;
                            var15 = 0;
                            var11 = var15;
                            L4: while (true) {
                              if (var9 <= var14) {
                                var3.field_q = true;
                                var3.b((byte) -106);
                                return;
                              } else {
                                var12 = lg.field_d[var14 + var6];
                                var19[1][var15] = wb.field_a[var12];
                                var20[1][4 * var15] = kf.field_f[var12];
                                var20[1][4 * var15 + 1] = fb.field_zb[var12];
                                var20[1][var15 * 4 + 2] = aj.field_d[var12];
                                var20[1][var15 * 4 - -3] = f.field_y[var12];
                                if (jp.a(wb.field_a[var12], (byte) -105)) {
                                  if (0 == fb.field_zb[var12] + aj.field_d[var12] + f.field_y[var12]) {
                                    var19[1][var15] = null;
                                    var15--;
                                    var14++;
                                    var15++;
                                    continue L4;
                                  } else {
                                    var14++;
                                    var15++;
                                    continue L4;
                                  }
                                } else {
                                  var14++;
                                  var15++;
                                  continue L4;
                                }
                              }
                            }
                          } else {
                            var12 = lg.field_d[var10];
                            var19[0][var11] = wb.field_a[var12];
                            var20[0][4 * var11] = kf.field_f[var12];
                            var20[0][var11 * 4 - -1] = fb.field_zb[var12];
                            var20[0][2 + var11 * 4] = aj.field_d[var12];
                            var20[0][var11 * 4 - -3] = f.field_y[var12];
                            if (jp.a(wb.field_a[var12], (byte) -105)) {
                              if (f.field_y[var12] + aj.field_d[var12] + fb.field_zb[var12] == 0) {
                                var19[0][var11] = null;
                                var11--;
                                var11++;
                                var10++;
                                continue L3;
                              } else {
                                var11++;
                                var10++;
                                continue L3;
                              }
                            } else {
                              var11++;
                              var10++;
                              continue L3;
                            }
                          }
                        }
                      } else {
                        qg.a((ob) (Object) var16, false);
                        if (var7 != 0) {
                          ul.a(0, na.field_L, np.field_j, gp.field_c, var7, ig.field_d);
                          var7++;
                          continue L2;
                        } else {
                          var3.field_i = np.field_j;
                          var3.field_l = na.field_L;
                          var3.field_h = ig.field_d;
                          var3.field_r = gp.field_c;
                          ul.a(0, na.field_L, np.field_j, gp.field_c, var7, ig.field_d);
                          var7++;
                          var7++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    wb.field_a[var7] = var16.e(-1);
                    var7++;
                    continue L1;
                  }
                }
              } else {
                var3.field_q = true;
                var3.b((byte) -106);
                return;
              }
            }
          } else {
            if (var3.field_k != var2) {
              var3 = (gr) (Object) qa.field_r.a((byte) -71);
              continue L0;
            } else {
              if (var3 == null) {
                q.g(-119);
                return;
              } else {
                L5: {
                  var4 = -122 % ((14 - param0) / 34);
                  var5 = var16.j(-87);
                  if (var5 != 0) {
                    var6 = var3.field_j;
                    wb.field_a[0] = ln.field_o;
                    var7 = 1;
                    L6: while (true) {
                      if (var5 <= var7) {
                        L7: {
                          vd.a(var6, var5, (byte) 18);
                          var7 = 0;
                          if (var5 <= var7) {
                            break L7;
                          } else {
                            L8: {
                              qg.a((ob) (Object) var16, false);
                              if (var7 != 0) {
                                ul.a(0, na.field_L, np.field_j, gp.field_c, var7, ig.field_d);
                                var7++;
                                break L8;
                              } else {
                                var3.field_i = np.field_j;
                                var3.field_l = na.field_L;
                                var3.field_h = ig.field_d;
                                var3.field_r = gp.field_c;
                                ul.a(0, na.field_L, np.field_j, gp.field_c, var7, ig.field_d);
                                var7++;
                                break L8;
                              }
                            }
                            var7++;
                            var7++;
                            var7++;
                            break L7;
                          }
                        }
                        bh.a(var6, (byte) -111);
                        var3.field_n = new String[2][var6];
                        var17 = new String[2][var6];
                        var3.field_m = new int[2][4 * var6];
                        var18 = new int[2][4 * var6];
                        var9 = wm.field_c;
                        var10 = 0;
                        var11 = 0;
                        L9: while (true) {
                          if (var9 <= var10) {
                            var14 = 0;
                            var10 = var14;
                            var15 = 0;
                            var11 = var15;
                            L10: while (true) {
                              if (var9 <= var14) {
                                break L5;
                              } else {
                                var12 = lg.field_d[var14 + var6];
                                var17[1][var15] = wb.field_a[var12];
                                var18[1][4 * var15] = kf.field_f[var12];
                                var18[1][4 * var15 + 1] = fb.field_zb[var12];
                                var18[1][var15 * 4 + 2] = aj.field_d[var12];
                                var18[1][var15 * 4 - -3] = f.field_y[var12];
                                if (jp.a(wb.field_a[var12], (byte) -105)) {
                                  if (0 == fb.field_zb[var12] + aj.field_d[var12] + f.field_y[var12]) {
                                    var17[1][var15] = null;
                                    var15--;
                                    var14++;
                                    var15++;
                                    continue L10;
                                  } else {
                                    var14++;
                                    var15++;
                                    continue L10;
                                  }
                                } else {
                                  var14++;
                                  var15++;
                                  continue L10;
                                }
                              }
                            }
                          } else {
                            var12 = lg.field_d[var10];
                            var17[0][var11] = wb.field_a[var12];
                            var18[0][4 * var11] = kf.field_f[var12];
                            var18[0][var11 * 4 - -1] = fb.field_zb[var12];
                            var18[0][2 + var11 * 4] = aj.field_d[var12];
                            var18[0][var11 * 4 - -3] = f.field_y[var12];
                            if (jp.a(wb.field_a[var12], (byte) -105)) {
                              if (f.field_y[var12] + aj.field_d[var12] + fb.field_zb[var12] == 0) {
                                var17[0][var11] = null;
                                var11--;
                                var11++;
                                var10++;
                                continue L9;
                              } else {
                                var11++;
                                var10++;
                                continue L9;
                              }
                            } else {
                              var11++;
                              var10++;
                              continue L9;
                            }
                          }
                        }
                      } else {
                        wb.field_a[var7] = var16.e(-1);
                        var7++;
                        continue L6;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                var3.field_q = true;
                var3.b((byte) -106);
                return;
              }
            }
          }
        }
    }

    protected final void finalize() {
        if (null != ((r) this).field_b) {
            if (!(null == ((r) this).field_b.field_e)) {
                try {
                    ((DataInputStream) ((r) this).field_b.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((r) this).field_b = null;
        }
        if (!(((r) this).field_i == null)) {
            if (!(null == ((r) this).field_i.field_e)) {
                try {
                    ((java.net.Socket) ((r) this).field_i.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((r) this).field_i = null;
        }
        if (((r) this).field_g != null) {
            try {
                ((r) this).field_g.close();
            } catch (Exception exception) {
            }
            ((r) this).field_g = null;
        }
        ((r) this).field_a = null;
    }

    final static void b(byte param0) {
        int var3 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        bi var1 = new bi(540, 140);
        aq.a((byte) 117, var1);
        wn.c();
        gf.b();
        js.field_j = 0;
        gq.e(-65);
        bi var2 = var1.g();
        int var4 = 11 / ((31 - param0) / 62);
        for (var3 = 0; 15 > var3; var3++) {
            var2.e(-2, -2, 16777215);
            gf.b(4, 4, 0, 0, 540, 140);
        }
        rf.field_h.e();
        var1.d(0, 0);
        ln.f((byte) -70);
    }

    final static void a(byte param0, boolean param1) {
        if (null == lg.field_e) {
          if (param0 > -81) {
            field_j = null;
            return;
          } else {
            return;
          }
        } else {
          lg.field_e.b(param1, 125);
          if (param0 <= -81) {
            return;
          } else {
            field_j = null;
            return;
          }
        }
    }

    final static fk a(byte[] param0, byte param1, int param2) {
        fk var3 = null;
        if (param1 > -9) {
          r.a((byte) 30, false);
          var3 = new fk(param0);
          tr.field_vb.a((byte) -113, (oh) (Object) var3);
          dn.a(param2, var3, (byte) 13);
          return var3;
        } else {
          var3 = new fk(param0);
          tr.field_vb.a((byte) -113, (oh) (Object) var3);
          dn.a(param2, var3, (byte) 13);
          return var3;
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
                        var4 = ShatteredPlansClient.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((r) this).field_k.field_h.length <= ((r) this).field_k.field_j) {
                                statePc = 5;
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
                            var1_int = ((r) this).field_g.read(((r) this).field_k.field_h, ((r) this).field_k.field_j, ((r) this).field_k.field_h.length + -((r) this).field_k.field_j);
                            if ((var1_int ^ -1) <= -1) {
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
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ((r) this).field_k.field_j = ((r) this).field_k.field_j + var1_int;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (((r) this).field_k.field_j != ((r) this).field_k.field_h.length) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((r) this).field_k.field_h.length + " " + ((r) this).field_e);
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
                            ((r) this).finalize();
                            ((r) this).field_h = 3;
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
                            ((r) this).finalize();
                            ((r) this).field_h = ((r) this).field_h + 1;
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

    final ob a(boolean param0) {
        if (!(3 != ((r) this).field_h)) {
            return ((r) this).field_k;
        }
        if (param0) {
            return null;
        }
        return null;
    }

    final synchronized boolean b(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (-3 >= ((r) this).field_h) {
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
                    if (-1 != ((r) this).field_h) {
                        statePc = 12;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (null == ((r) this).field_b) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((r) this).field_b = ((r) this).field_l.a(((r) this).field_e, false);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (((r) this).field_b.field_d != 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return false;
                }
                case 9: {
                    if (((r) this).field_b.field_d != 1) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((r) this).field_h = ((r) this).field_h + 1;
                    ((r) this).field_b = null;
                    return false;
                }
                case 12: {
                    if (param0 == 10000) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ((r) this).field_h = 77;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (((r) this).field_h == 1) {
                        statePc = 16;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (((r) this).field_i == null) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    ((r) this).field_i = ((r) this).field_l.a(65535, 443, ((r) this).field_e.getHost());
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (((r) this).field_i.field_d != 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return false;
                }
                case 21: {
                    if ((((r) this).field_i.field_d ^ -1) == -2) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    ((r) this).field_h = ((r) this).field_h + 1;
                    ((r) this).field_i = null;
                    return false;
                }
                case 23: {
                    if (((r) this).field_g != null) {
                        statePc = 40;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    try {
                        if (((r) this).field_h == 0) {
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
                        ((r) this).field_g = (DataInputStream) ((r) this).field_b.field_e;
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
                        if (1 == ((r) this).field_h) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var4 = (java.net.Socket) ((r) this).field_i.field_e;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((r) this).field_e.getFile() + "\n\n");
                        var3.write(se.a((byte) 80, var5));
                        ((r) this).field_g = new DataInputStream(var4.getInputStream());
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ((r) this).field_k.field_j = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 31: {
                    if (null != ((r) this).field_a) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    ((r) this).field_a = ((r) this).field_l.a(true, 5, (Runnable) this);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (-1 != (((r) this).field_a.field_d ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    return false;
                }
                case 35: {
                    if (1 == ((r) this).field_a.field_d) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    ((r) this).finalize();
                    ((r) this).field_h = ((r) this).field_h + 1;
                    return false;
                }
                case 37: {
                    return false;
                }
                case 39: {
                    var2 = (IOException) (Object) caughtException;
                    ((r) this).finalize();
                    ((r) this).field_h = ((r) this).field_h + 1;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (null != ((r) this).field_a) {
                        statePc = 48;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    ((r) this).field_a = ((r) this).field_l.a(true, 5, (Runnable) this);
                    if (-1 == (((r) this).field_a.field_d ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (1 != ((r) this).field_a.field_d) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ((r) this).finalize();
                    ((r) this).field_h = ((r) this).field_h + 1;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    return false;
                }
                case 46: {
                    return false;
                }
                case 48: {
                    if (-1 == (((r) this).field_a.field_d ^ -1)) {
                        statePc = 53;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (1 != ((r) this).field_a.field_d) {
                        statePc = 51;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 51: {
                    ((r) this).finalize();
                    ((r) this).field_h = ((r) this).field_h + 1;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    return false;
                }
                case 53: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static rg a(Throwable param0, String param1) {
        rg var2_ref = null;
        rg var2 = null;
        if (param0 instanceof rg) {
            var2 = (rg) (Object) param0;
            var2.field_b = var2.field_b + 32 + param1;
        } else {
            var2_ref = new rg(param0, param1);
        }
        return var2_ref;
    }

    r(qb param0, java.net.URL param1, int param2) {
        ((r) this).field_e = param1;
        ((r) this).field_l = param0;
        ((r) this).field_k = new ob(param2);
    }

    public static void a(int param0) {
        field_j = null;
        field_f = null;
        if (param0 != 0) {
            r.a((byte) 121, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[]{-65536, -65536, -65536, 0, -65536};
        field_f = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_d = false;
    }
}
