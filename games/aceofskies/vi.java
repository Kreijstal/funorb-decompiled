/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vi extends qm {
    static String[] field_p;
    private sc field_q;
    static String field_n;
    private sc[] field_o;

    final static void a(byte param0, String param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = null;
            if (param0 != 103) {
                return;
            }
            try {
                var3 = new java.net.URL(param2.getCodeBase(), param1);
                var3 = jf.a(param2, var3, param0 ^ 54);
                wc.a(var3.toString(), param2, param0 + 14198, true);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, vi param1, boolean param2) {
        int var4 = 0;
        sc var5 = null;
        sc var6 = null;
        int var7 = 0;
        sc stackIn_8_0 = null;
        sc stackIn_9_0 = null;
        sc stackIn_10_0 = null;
        sc stackIn_10_1 = null;
        sc stackOut_7_0 = null;
        sc stackOut_9_0 = null;
        sc stackOut_9_1 = null;
        sc stackOut_8_0 = null;
        sc stackOut_8_1 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        if (!param2) {
          L0: {
            this.a((qm) (Object) param1, 27529);
            if (param0) {
              var4 = 0;
              L1: while (true) {
                if (6 <= var4) {
                  break L0;
                } else {
                  var5 = ((vi) this).field_o[var4];
                  if (var5 == null) {
                    ((vi) param1).field_o[var4] = null;
                    var4++;
                    continue L1;
                  } else {
                    L2: {
                      var6 = ((vi) param1).field_o[var4];
                      stackOut_7_0 = (sc) var5;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var6 != null) {
                        stackOut_9_0 = (sc) (Object) stackIn_9_0;
                        stackOut_9_1 = (sc) var6;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L2;
                      } else {
                        ((vi) param1).field_o[var4] = new sc();
                        stackOut_8_0 = (sc) (Object) stackIn_8_0;
                        stackOut_8_1 = new sc();
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        break L2;
                      }
                    }
                    ((sc) (Object) stackIn_10_0).a((sc) (Object) stackIn_10_1, (byte) -22);
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              au.a((Object[]) (Object) ((vi) this).field_o, 0, (Object[]) (Object) ((vi) param1).field_o, 0, 6);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final sc a(int param0, int param1) {
        if (param0 >= -40) {
            rb var4 = (rb) null;
            vi.a((byte) 62, (rb) null);
        }
        ((vi) this).field_o[param1] = new sc();
        return new sc();
    }

    public static void a(boolean param0) {
        field_p = null;
        field_n = null;
        if (param0) {
            field_p = (String[]) null;
        }
    }

    public vi() {
        ((vi) this).field_o = new sc[6];
        ((vi) this).field_q = new sc();
        ((vi) this).field_o[0] = new sc();
        sc var1 = new sc();
        var1.a(-70);
    }

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        sc var7 = null;
        sc var9 = null;
        rb var10 = null;
        mi var11 = null;
        sc var12 = null;
        sc var13 = null;
        sc var14 = null;
        sc var15 = null;
        ea stackIn_5_0 = null;
        ea stackOut_4_0 = null;
        Object stackOut_3_0 = null;
        L0: {
          if (param1 == -7592) {
            break L0;
          } else {
            var10 = (rb) null;
            vi.a((byte) -20, (rb) null);
            break L0;
          }
        }
        L1: {
          if (param3 instanceof mi) {
            stackOut_4_0 = (ea) param3;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = null;
            stackIn_5_0 = (ea) (Object) stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var11 = (mi) (mi) stackIn_5_0;
          fp.a((byte) 67, param4 - -((ea) param3).field_h, ((ea) param3).field_n + ((ea) param3).field_h + param4, ((ea) param3).field_q + (param2 - -((ea) param3).field_p), ((ea) param3).field_p + param2);
          if (var11 == null) {
            break L2;
          } else {
            param0 = param0 & ((mi) var11).field_u;
            break L2;
          }
        }
        L3: {
          var7 = ((vi) this).field_o[0];
          ((vi) this).field_q.a(-93);
          var7.a((vi) this, param4, (byte) -107, param2, param3, ((vi) this).field_q);
          if (var11 == null) {
            break L3;
          } else {
            L4: {
              if (!((mi) var11).field_s) {
                break L4;
              } else {
                var12 = ((vi) this).field_o[1];
                if (var12 != null) {
                  var12.a((vi) this, param4, (byte) -107, param2, param3, ((vi) this).field_q);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (((mi) var11).field_g) {
              L5: {
                var13 = ((vi) this).field_o[3];
                if (((mi) var11).field_i == 0) {
                  break L5;
                } else {
                  if (var13 == null) {
                    break L5;
                  } else {
                    var13.a((vi) this, param4, (byte) -107, param2, param3, ((vi) this).field_q);
                    break L3;
                  }
                }
              }
              var9 = ((vi) this).field_o[2];
              if (var9 == null) {
                break L3;
              } else {
                var9.a((vi) this, param4, (byte) -107, param2, param3, ((vi) this).field_q);
                break L3;
              }
            } else {
              break L3;
            }
          }
        }
        L6: {
          if (!param3.e(28660)) {
            break L6;
          } else {
            var14 = ((vi) this).field_o[5];
            if (var14 == null) {
              break L6;
            } else {
              var14.a((vi) this, param4, (byte) -107, param2, param3, ((vi) this).field_q);
              break L6;
            }
          }
        }
        L7: {
          if (!param0) {
            var15 = ((vi) this).field_o[4];
            if (var15 != null) {
              var15.a((vi) this, param4, (byte) -107, param2, param3, ((vi) this).field_q);
              break L7;
            } else {
              break L7;
            }
          } else {
            break L7;
          }
        }
        ((vi) this).field_q.a(param3, true, param2, (vi) this, param4);
        sl.c(2765);
    }

    final void a(byte param0, ll param1) {
        sc[] var3 = null;
        int var4 = 0;
        sc var5 = null;
        int var6 = 0;
        ll[] var7 = null;
        sc[] var8 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        var8 = ((vi) this).field_o;
        var3 = var8;
        var4 = 0;
        L0: while (true) {
          if (var8.length <= var4) {
            L1: {
              if (param0 == -90) {
                break L1;
              } else {
                var7 = (ll[]) null;
                ((vi) this).a(65, (ll[]) null);
                break L1;
              }
            }
            return;
          } else {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_f = param1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, ll[] param2) {
        int var4 = param0;
        if (param1 != 0) {
            field_p = (String[]) null;
        }
        if (!(null != ((vi) this).field_o[var4])) {
            ((vi) this).field_o[var4] = new sc();
        }
        ((vi) this).field_o[param0].field_d = (ll[]) param2;
    }

    vi(vi param0, boolean param1) {
        this();
        param0.a(param1, (vi) this, false);
    }

    final void a(int param0, ll[] param1) {
        sc[] var3 = null;
        int var4 = 0;
        sc var5 = null;
        int var6 = 0;
        ll var7 = null;
        sc[] var8 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        var8 = ((vi) this).field_o;
        var3 = var8;
        var4 = 0;
        L0: while (true) {
          if (var8.length <= var4) {
            L1: {
              if (param0 <= -32) {
                break L1;
              } else {
                var7 = (ll) null;
                ((vi) this).a((byte) -114, (ll) null);
                break L1;
              }
            }
            return;
          } else {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_d = (ll[]) param1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final static void a(byte param0, rb param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            rb var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            byte[] var11 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = AceOfSkies.field_G ? 1 : 0;
                        var10 = new byte[24];
                        var8 = var10;
                        var7 = var8;
                        var11 = var7;
                        var9 = var11;
                        var2 = var9;
                        if (vs.field_g == null) {
                            statePc = 13;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            vs.field_g.a(true, 0L);
                            vs.field_g.a(var10, param0 ^ -13542);
                            var3_int = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if ((var3_int ^ -1) <= -25) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (0 == var11[var3_int]) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3_int++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if ((var3_int ^ -1) <= -25) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (var4 >= 24) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 13: {
                        if (param0 == -1) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var6 = (rb) null;
                        vi.a((byte) -110, (rb) null);
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        param1.a(true, 24, 0, var11);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new String[100];
        field_n = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
