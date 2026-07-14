/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sg implements Runnable {
    static int field_e;
    static String field_b;
    private InputStream field_m;
    private boolean field_k;
    private byte[] field_p;
    private int field_n;
    static gh field_i;
    private int field_j;
    private java.net.Socket field_d;
    static String field_h;
    static int field_c;
    private OutputStream field_l;
    private int field_g;
    private wj field_o;
    private pn field_a;
    private boolean field_f;

    final void a(boolean param0) throws IOException {
        if (!((sg) this).field_f) {
          if (!((sg) this).field_k) {
            if (param0) {
              return;
            } else {
              char discarded$2 = sg.a((byte) -109, '`');
              return;
            }
          } else {
            ((sg) this).field_k = false;
            throw new IOException();
          }
        } else {
          return;
        }
    }

    final static mg a(gh param0, mn param1, boolean param2, gh param3, gh param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        mg[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        mn var13_ref = null;
        int var14 = 0;
        int var15 = 0;
        ao var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int[] var22 = null;
        char[] var23 = null;
        int[] var24 = null;
        char[] var25 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var17 = SteelSentinels.field_G;
        if (param1 != null) {
          L0: {
            if (null != param1.field_C) {
              stackOut_4_0 = param1.field_C.length;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            if (param1.field_A != null) {
              stackOut_7_0 = param1.field_A.length;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          var6 = stackIn_8_0;
          var7 = var6 + var5;
          var8 = new String[var7];
          var25 = new char[var7];
          var23 = var25;
          var21 = var23;
          var19 = var21;
          var9 = var19;
          var24 = new int[var7];
          var22 = var24;
          var20 = var22;
          var18 = var20;
          var10 = var18;
          if (!param2) {
            var11 = new mg[var7];
            if (param1.field_C != null) {
              var12 = 0;
              L2: while (true) {
                if (param1.field_C.length <= var12) {
                  if (null == param1.field_A) {
                    return new mg(0L, param0, param4, param3, var11, var24, var8, var25);
                  } else {
                    var12 = var5;
                    var13 = 49;
                    var14 = 0;
                    L3: while (true) {
                      if (param1.field_A.length <= var14) {
                        return new mg(0L, param0, param4, param3, var11, var24, var8, var25);
                      } else {
                        var15 = param1.field_A[var14];
                        if ((var15 ^ -1) == 0) {
                          var8[var14 + var12] = od.field_b;
                          var9[var12 + var14] = param1.field_F[var14];
                          var10[var12 - -var14] = param1.field_A[var14];
                          var14++;
                          continue L3;
                        } else {
                          L4: {
                            var16 = jl.field_w.a(var15, -118);
                            var8[var14 + var12] = var16.i(1);
                            var9[var14 + var12] = param1.field_F[var14];
                            if (var9[var14 + var12] > 0) {
                              break L4;
                            } else {
                              var13 = (char)(var13 + 1);
                              var9[var12 - -var14] = (char)var13;
                              break L4;
                            }
                          }
                          var10[var14 + var12] = param1.field_A[var14];
                          var14++;
                          var14++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  var13_ref = cd.field_e.a((byte) -13, param1.field_C[var12]);
                  var8[var12] = var13_ref.field_D;
                  var9[var12] = param1.field_z[var12];
                  var11[var12] = sg.a(param0, var13_ref, false, param3, param4);
                  var12++;
                  continue L2;
                }
              }
            } else {
              if (null != param1.field_A) {
                var12 = var5;
                var13 = 49;
                var14 = 0;
                L5: while (true) {
                  if (param1.field_A.length > var14) {
                    var15 = param1.field_A[var14];
                    if ((var15 ^ -1) == 0) {
                      var8[var14 + var12] = od.field_b;
                      var9[var12 + var14] = param1.field_F[var14];
                      var10[var12 - -var14] = param1.field_A[var14];
                      var14++;
                      continue L5;
                    } else {
                      L6: {
                        var16 = jl.field_w.a(var15, -118);
                        var8[var14 + var12] = var16.i(1);
                        var9[var14 + var12] = param1.field_F[var14];
                        if (var9[var14 + var12] > 0) {
                          break L6;
                        } else {
                          var13 = (char)(var13 + 1);
                          var9[var12 - -var14] = (char)var13;
                          break L6;
                        }
                      }
                      var10[var14 + var12] = param1.field_A[var14];
                      var14++;
                      var14++;
                      continue L5;
                    }
                  } else {
                    return new mg(0L, param0, param4, param3, var11, var24, var8, var25);
                  }
                }
              } else {
                return new mg(0L, param0, param4, param3, var11, var24, var8, var25);
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_b = null;
        field_h = null;
        field_i = null;
        if (param0 <= -43) {
          return;
        } else {
          var2 = null;
          sg.a(30, -23, (gh) null, -70, 104, (gh) null, (byte[]) null, (byte) 72, (gh) null, 102);
          return;
        }
    }

    final void b(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Object var2_ref2 = null;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SteelSentinels.field_G;
                    if (!((sg) this).field_f) {
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
                    var2_ref2 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        ((sg) this).field_f = true;
                        this.notifyAll();
                        // monitorexit var2_ref2
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = caughtException;
                        // monitorexit var2_ref2
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var3;
                }
                case 7: {
                    if (param0 == 12110) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((sg) this).field_p = null;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (null == ((sg) this).field_o) {
                        statePc = 16;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (((sg) this).field_o.field_a != -1) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    a.a((byte) 120, 1L);
                    statePc = 10;
                    continue stateLoop;
                }
                case 12: {
                    if (-2 != ((sg) this).field_o.field_a) {
                        statePc = 17;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    try {
                        ((Thread) ((sg) this).field_o.field_c).join();
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var2_ref = (InterruptedException) (Object) caughtException;
                    statePc = 19;
                    continue stateLoop;
                }
                case 16: {
                    ((sg) this).field_o = null;
                    return;
                }
                case 17: {
                    ((sg) this).field_o = null;
                    return;
                }
                case 18: {
                    ((sg) this).field_o = null;
                    return;
                }
                case 19: {
                    ((sg) this).field_o = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
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
                        var6 = SteelSentinels.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((sg) this).field_g != ((sg) this).field_n) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (!((sg) this).field_f) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            this.wait();
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var2 = ((sg) this).field_n;
                            if (((sg) this).field_g < ((sg) this).field_n) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var1_int = -((sg) this).field_n + ((sg) this).field_g;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1_int = -((sg) this).field_n + ((sg) this).field_j;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (-1 > (var1_int ^ -1)) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((sg) this).field_l.write(((sg) this).field_p, var2, var1_int);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 12 : 30);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((sg) this).field_k = true;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            ((sg) this).field_n = (var1_int + ((sg) this).field_n) % ((sg) this).field_j;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (((sg) this).field_g != ((sg) this).field_n) {
                                statePc = 1;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 17 : 30);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ((sg) this).field_l.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 17 : 30);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((sg) this).field_k = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (((sg) this).field_m != null) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((sg) this).field_m.close();
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (((sg) this).field_l != null) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((sg) this).field_l.close();
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (null == ((sg) this).field_d) {
                                statePc = 28;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((sg) this).field_d.close();
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var1 = (IOException) (Object) caughtException;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((sg) this).field_p = null;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        var1_ref = (Exception) (Object) caughtException;
                        var7 = null;
                        sj.a((String) null, -59, (Throwable) (Object) var1_ref);
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
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

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        if (!((sg) this).field_f) {
          L0: while (true) {
            if (-1 <= (param1 ^ -1)) {
              if (param3 == -256) {
                return;
              } else {
                ((sg) this).b(76);
                return;
              }
            } else {
              var5 = ((sg) this).field_m.read(param2, param0, param1);
              if (0 >= var5) {
                throw new EOFException();
              } else {
                param0 = param0 + var5;
                param1 = param1 - var5;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, gh param2, int param3, int param4, gh param5, byte[] param6, byte param7, gh param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = SteelSentinels.field_G;
        nb.field_G = -1L;
        wb.field_j = param6;
        gl.field_v = param1;
        be.field_a = param6.length;
        ad.field_f = false;
        rb.field_i = new byte[(gl.field_v - -7) / 8];
        nf.field_b = null;
        ni.field_a = null;
        var10 = 0;
        var11 = 0;
        L0: while (true) {
          if (wb.field_j.length <= var11) {
            var10 = (var10 - -7) / 8;
            ti.field_s = new byte[var10];
            if (null != param5.field_M) {
              q.field_m = param5.field_M;
              q.field_m.g(6);
              t.field_c = new dk(param0);
              if (param7 < -10) {
                L1: {
                  ba.field_b = -1;
                  ja.field_a = 0;
                  bj.field_j = 0;
                  ud.field_D = -1;
                  if (null != param8.field_M) {
                    break L1;
                  } else {
                    param8.field_M = new ul();
                    break L1;
                  }
                }
                ci.field_e = param8.field_M;
                ci.field_e.g(6);
                fm.field_a = new dk(param3);
                if (param2.field_M == null) {
                  param2.field_M = new ul();
                  o.field_d = param2.field_M;
                  o.field_d.g(6);
                  me.field_b = new dk(param4);
                  ka.field_R = 0L;
                  ta.field_l = param9;
                  return;
                } else {
                  o.field_d = param2.field_M;
                  o.field_d.g(6);
                  me.field_b = new dk(param4);
                  ka.field_R = 0L;
                  ta.field_l = param9;
                  return;
                }
              } else {
                return;
              }
            } else {
              param5.field_M = new ul();
              q.field_m = param5.field_M;
              q.field_m.g(6);
              t.field_c = new dk(param0);
              if (param7 < -10) {
                ba.field_b = -1;
                ja.field_a = 0;
                bj.field_j = 0;
                ud.field_D = -1;
                if (null == param8.field_M) {
                  param8.field_M = new ul();
                  ci.field_e = param8.field_M;
                  ci.field_e.g(6);
                  fm.field_a = new dk(param3);
                  if (param2.field_M != null) {
                    o.field_d = param2.field_M;
                    o.field_d.g(6);
                    me.field_b = new dk(param4);
                    ka.field_R = 0L;
                    ta.field_l = param9;
                    return;
                  } else {
                    param2.field_M = new ul();
                    o.field_d = param2.field_M;
                    o.field_d.g(6);
                    me.field_b = new dk(param4);
                    ka.field_R = 0L;
                    ta.field_l = param9;
                    return;
                  }
                } else {
                  ci.field_e = param8.field_M;
                  ci.field_e.g(6);
                  fm.field_a = new dk(param3);
                  if (param2.field_M == null) {
                    param2.field_M = new ul();
                    o.field_d = param2.field_M;
                    o.field_d.g(6);
                    me.field_b = new dk(param4);
                    ka.field_R = 0L;
                    ta.field_l = param9;
                    return;
                  } else {
                    o.field_d = param2.field_M;
                    o.field_d.g(6);
                    me.field_b = new dk(param4);
                    ka.field_R = 0L;
                    ta.field_l = param9;
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            var10 = var10 + (255 & wb.field_j[var11]);
            var11++;
            continue L0;
          }
        }
    }

    sg(java.net.Socket param0, pn param1) throws IOException {
        this(param0, param1, 5000);
    }

    final int b(byte param0) throws IOException {
        if (param0 == -94) {
          if (((sg) this).field_f) {
            return 0;
          } else {
            return ((sg) this).field_m.read();
          }
        } else {
          field_c = 66;
          if (((sg) this).field_f) {
            return 0;
          } else {
            return ((sg) this).field_m.read();
          }
        }
    }

    final int a(int param0) throws IOException {
        if (!(!((sg) this).field_f)) {
            return 0;
        }
        if (param0 > -112) {
            return 108;
        }
        return ((sg) this).field_m.available();
    }

    protected final void finalize() {
        ((sg) this).b(12110);
    }

    final static char a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        if (param0 == 115) {
          var2 = param1;
          if (-33 != (var2 ^ -1)) {
            if (160 != var2) {
              if (95 != var2) {
                if (var2 != 45) {
                  if (91 != var2) {
                    if (-94 != var2) {
                      if (var2 != 35) {
                        if (var2 != 224) {
                          if (-226 != var2) {
                            if (var2 != 226) {
                              if (-229 != var2) {
                                if (var2 != 227) {
                                  if (-193 != var2) {
                                    if (var2 != -194) {
                                      if (var2 != -195) {
                                        if (-197 != var2) {
                                          if (-196 != var2) {
                                            if (232 != var2) {
                                              if (233 != var2) {
                                                if (-235 != var2) {
                                                  if (-236 != var2) {
                                                    if (200 != var2) {
                                                      if (var2 != -202) {
                                                        if (-203 != var2) {
                                                          if (203 != var2) {
                                                            if (-238 != (var2 ^ -1)) {
                                                              if (var2 != 238) {
                                                                if (var2 != 239) {
                                                                  if (var2 != 205) {
                                                                    if (-207 != (var2 ^ -1)) {
                                                                      if ((var2 ^ -1) != -208) {
                                                                        if (242 != var2) {
                                                                          if (var2 != 243) {
                                                                            if (var2 != -245) {
                                                                              if (var2 != 246) {
                                                                                if (-246 != var2) {
                                                                                  if ((var2 ^ -1) != -211) {
                                                                                    if (var2 != -212) {
                                                                                      if (-213 != var2) {
                                                                                        if (var2 != 214) {
                                                                                          if ((var2 ^ -1) != -214) {
                                                                                            if (var2 != 249) {
                                                                                              if (var2 != -251) {
                                                                                                if (-252 != var2) {
                                                                                                  if (-253 != var2) {
                                                                                                    if (var2 != 217) {
                                                                                                      if (-219 != var2) {
                                                                                                        if (-220 != var2) {
                                                                                                          if (-221 != var2) {
                                                                                                            if (var2 != 231) {
                                                                                                              if ((var2 ^ -1) != -200) {
                                                                                                                if (var2 != -256) {
                                                                                                                  if (-377 != var2) {
                                                                                                                    if (var2 != 241) {
                                                                                                                      if (-210 != (var2 ^ -1)) {
                                                                                                                        if ((var2 ^ -1) == -224) {
                                                                                                                          return 'b';
                                                                                                                        } else {
                                                                                                                          return Character.toLowerCase(param1);
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 'n';
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'n';
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'y';
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'y';
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'c';
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'c';
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        } else {
                                                                                                          return 'u';
                                                                                                        }
                                                                                                      } else {
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    } else {
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  } else {
                                                                                                    return 'u';
                                                                                                  }
                                                                                                } else {
                                                                                                  return 'u';
                                                                                                }
                                                                                              } else {
                                                                                                return 'u';
                                                                                              }
                                                                                            } else {
                                                                                              return 'u';
                                                                                            }
                                                                                          } else {
                                                                                            return 'o';
                                                                                          }
                                                                                        } else {
                                                                                          return 'o';
                                                                                        }
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    } else {
                                                                                      return 'o';
                                                                                    }
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                } else {
                                                                                  return 'o';
                                                                                }
                                                                              } else {
                                                                                return 'o';
                                                                              }
                                                                            } else {
                                                                              return 'o';
                                                                            }
                                                                          } else {
                                                                            return 'o';
                                                                          }
                                                                        } else {
                                                                          return 'o';
                                                                        }
                                                                      } else {
                                                                        return 'i';
                                                                      }
                                                                    } else {
                                                                      return 'i';
                                                                    }
                                                                  } else {
                                                                    return 'i';
                                                                  }
                                                                } else {
                                                                  return 'i';
                                                                }
                                                              } else {
                                                                return 'i';
                                                              }
                                                            } else {
                                                              return 'i';
                                                            }
                                                          } else {
                                                            return 'e';
                                                          }
                                                        } else {
                                                          return 'e';
                                                        }
                                                      } else {
                                                        return 'e';
                                                      }
                                                    } else {
                                                      return 'e';
                                                    }
                                                  } else {
                                                    return 'e';
                                                  }
                                                } else {
                                                  return 'e';
                                                }
                                              } else {
                                                return 'e';
                                              }
                                            } else {
                                              return 'e';
                                            }
                                          } else {
                                            return 'a';
                                          }
                                        } else {
                                          return 'a';
                                        }
                                      } else {
                                        return 'a';
                                      }
                                    } else {
                                      return 'a';
                                    }
                                  } else {
                                    return 'a';
                                  }
                                } else {
                                  return 'a';
                                }
                              } else {
                                return 'a';
                              }
                            } else {
                              return 'a';
                            }
                          } else {
                            return 'a';
                          }
                        } else {
                          return 'a';
                        }
                      } else {
                        return param1;
                      }
                    } else {
                      return param1;
                    }
                  } else {
                    return param1;
                  }
                } else {
                  return '_';
                }
              } else {
                return '_';
              }
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        } else {
          return '\n';
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = SteelSentinels.field_G;
                    if (((sg) this).field_f) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    if (!((sg) this).field_k) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ((sg) this).field_k = false;
                    throw new IOException();
                }
                case 5: {
                    if (((sg) this).field_p == null) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((sg) this).field_p = new byte[((sg) this).field_j];
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var5 = this;
                    // monitorenter this
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        var6 = 0;
                        if (param2 == -100) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        // monitorexit var5
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return;
                }
                case 12: {
                    try {
                        if (param0 <= var6) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((sg) this).field_p[((sg) this).field_g] = param1[var6 + param3];
                        ((sg) this).field_g = (1 + ((sg) this).field_g) % ((sg) this).field_j;
                        if (((sg) this).field_g == (-100 + ((sg) this).field_n + ((sg) this).field_j) % ((sg) this).field_j) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6++;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (null == ((sg) this).field_o) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((sg) this).field_o = ((sg) this).field_a.a(2, 3, (Runnable) this);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.notifyAll();
                        // monitorexit var5
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 23: {
                    if (var7 instanceof RuntimeException) throw (RuntimeException) var7;
                    if (var7 instanceof Error) throw (Error) var7;
                    throw (IOException) (Object) var7;
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private sg(java.net.Socket param0, pn param1, int param2) throws IOException {
        ((sg) this).field_k = false;
        ((sg) this).field_g = 0;
        ((sg) this).field_n = 0;
        ((sg) this).field_f = false;
        ((sg) this).field_a = param1;
        ((sg) this).field_d = param0;
        ((sg) this).field_d.setSoTimeout(30000);
        ((sg) this).field_d.setTcpNoDelay(true);
        ((sg) this).field_m = ((sg) this).field_d.getInputStream();
        ((sg) this).field_l = ((sg) this).field_d.getOutputStream();
        ((sg) this).field_j = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Press TAB to chat or F10 to open Quick Chat.";
        field_b = "Hide chat";
    }
}
