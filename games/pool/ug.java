/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ug extends no {
    static ml field_v;
    static vh field_x;
    static int field_u;
    private vb field_w;

    private final void f(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((ug) this).field_w) {
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
                        try {
                            ((ug) this).field_r.field_v = 0;
                            ((ug) this).field_r.a(6, false);
                            if (param0 < -36) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            ((ug) this).field_r.b(3, 99);
                            ((ug) this).field_r.a((byte) -81, 0);
                            ((ug) this).field_w.a(((ug) this).field_r.field_t, (byte) -105, ((ug) this).field_r.field_t.length, 0);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ((ug) this).field_w.c(-114);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        ((ug) this).field_a = -2;
                        ((ug) this).field_e = ((ug) this).field_e + 1;
                        ((ug) this).field_w = null;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
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

    final void a(byte param0) {
        try {
            ((ug) this).field_w.c(-98);
        } catch (Exception exception) {
        }
        ((ug) this).field_a = -1;
        if (param0 >= -4) {
            ((ug) this).field_w = null;
        }
        ((ug) this).field_e = ((ug) this).field_e + 1;
        ((ug) this).field_w = null;
        ((ug) this).field_c = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final static ko a(int[] param0, int param1, String param2, int param3, lr param4, boolean param5, int param6) {
        String[] var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        String[] var12 = null;
        int var13 = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        gi var19 = null;
        gi var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        ko var26 = null;
        var26 = new ko();
        var8 = new String[100];
        if (param5) {
          var9 = param4.a(param2, new int[1], var8);
          var10 = param2.toLowerCase();
          var11 = 0;
          L0: while (true) {
            if (var11 >= lb.field_P.length) {
              return var26;
            } else {
              var12 = lb.field_P[var11];
              var13 = 0;
              L1: while (true) {
                if (var12.length > var13) {
                  var14 = var12[var13];
                  if (var14 != null) {
                    var15 = var14.length();
                    if (var15 != 0) {
                      var16 = var10.indexOf(var14);
                      L2: while (true) {
                        if (-1 != var16) {
                          L3: {
                            if (var16 <= 0) {
                              break L3;
                            } else {
                              if (!vq.a(var10.charAt(-1 + var16), 22987)) {
                                if (35 != var10.charAt(-1 + var16)) {
                                  break L3;
                                } else {
                                  var16 = var10.indexOf(var14, var16 - -1);
                                  continue L2;
                                }
                              } else {
                                var16 = var10.indexOf(var14, var16 - -1);
                                continue L2;
                              }
                            }
                          }
                          L4: {
                            if (var10.length() <= var15 + var16) {
                              break L4;
                            } else {
                              if (!vq.a(var10.charAt(var16 - -var15), 22987)) {
                                break L4;
                              } else {
                                var16 = var10.indexOf(var14, var16 - -1);
                                continue L2;
                              }
                            }
                          }
                          var17 = var15 + var16;
                          var18 = 0;
                          var19 = new gi(var11);
                          var20 = var19;
                          var21 = 0;
                          var22 = param3;
                          L5: while (true) {
                            L6: {
                              if (var21 >= var9) {
                                break L6;
                              } else {
                                L7: {
                                  L8: {
                                    var23 = var8[var21].length();
                                    var24 = param0[(-1 + (var21 - -param0.length)) % param0.length];
                                    if (var18 > var16) {
                                      break L8;
                                    } else {
                                      if (var18 + var23 <= var16) {
                                        break L8;
                                      } else {
                                        L9: {
                                          var25 = param4.b(var8[var21].substring(0, var16 + -var18));
                                          var20.field_r = 1 + param4.field_C - -param4.field_w;
                                          var20.field_m = param6 + var25;
                                          var20.field_q = var22;
                                          if (var17 < var18) {
                                            break L9;
                                          } else {
                                            if (var23 + var18 < var17) {
                                              break L9;
                                            } else {
                                              var20.field_l = param4.b(var8[var21].substring(-var18 + var16, var17 - var18));
                                              break L6;
                                            }
                                          }
                                        }
                                        var20.field_l = param4.b(var8[var21].substring(var16 - var18));
                                        var20.field_s = new gi(var20.field_p);
                                        var20 = var20.field_s;
                                        break L7;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (var18 > var17) {
                                      break L10;
                                    } else {
                                      if (var17 < var23 + var18) {
                                        var25 = param4.b(var8[var21].substring(0, -var18 + var17));
                                        var20.field_m = param6;
                                        var20.field_l = var25;
                                        var20.field_q = var22;
                                        var20.field_r = var24;
                                        break L6;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  if (var16 >= var18) {
                                    break L7;
                                  } else {
                                    if (var18 + var23 >= var17) {
                                      break L7;
                                    } else {
                                      var20.field_l = param1;
                                      var20.field_m = param6;
                                      var20.field_r = var24;
                                      var20.field_q = var22;
                                      var20.field_s = new gi(var20.field_p);
                                      var20 = var20.field_s;
                                      break L7;
                                    }
                                  }
                                }
                                L11: {
                                  if (var8[var21].endsWith("<br>")) {
                                    var18 = var18 + var23;
                                    break L11;
                                  } else {
                                    var18 = var18 + (var23 + 1);
                                    break L11;
                                  }
                                }
                                var21++;
                                var22 = var22 + param0[var21 % param0.length];
                                continue L5;
                              }
                            }
                            var26.b((byte) 116, (ma) (Object) var19);
                            var16 = var10.indexOf(var14, var16 - -1);
                            continue L2;
                          }
                        } else {
                          var13++;
                          continue L1;
                        }
                      }
                    } else {
                      var13++;
                      continue L1;
                    }
                  } else {
                    var13++;
                    continue L1;
                  }
                } else {
                  var11++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static kb e(int param0) {
        if (param0 != 0) {
            return null;
        }
        return (kb) (Object) new hk();
    }

    private final void a(byte param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            ge stackIn_5_0 = null;
            ge stackIn_6_0 = null;
            ge stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            ge stackOut_4_0 = null;
            ge stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            ge stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((ug) this).field_w != null) {
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
                        try {
                            ((ug) this).field_r.field_v = 0;
                            if (param0 == 72) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            this.a((byte) 2, true);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = ((ug) this).field_r;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_5_0 = stackOut_4_0;
                            if (!param1) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = (ge) (Object) stackIn_5_0;
                            stackOut_5_1 = 2;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_7_1 = stackOut_5_1;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = (ge) (Object) stackIn_6_0;
                            stackOut_6_1 = 3;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((ge) (Object) stackIn_7_0).a(stackIn_7_1, false);
                            ((ug) this).field_r.b(0L, 24136);
                            ((ug) this).field_w.a(((ug) this).field_r.field_t, (byte) -102, ((ug) this).field_r.field_t.length, 0);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        try {
                            ((ug) this).field_w.c(-83);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        ((ug) this).field_a = -2;
                        ((ug) this).field_w = null;
                        ((ug) this).field_e = ((ug) this).field_e + 1;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
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

    final void a(int param0, boolean param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            sp var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Pool.field_O;
                        if (((ug) this).field_w == null) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((ug) this).field_w.c(-112);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        ((ug) this).field_w = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((ug) this).field_w = (vb) param2;
                        this.f(-55);
                        this.a((byte) 72, param1);
                        ((ug) this).field_p.field_v = 0;
                        ((ug) this).field_i = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var4_ref2 = (sp) (Object) ((ug) this).field_f.a(0);
                        if (var4_ref2 == null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        ((ug) this).field_j.a((rg) (Object) var4_ref2, false);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 8: {
                        var4_ref2 = (sp) (Object) ((ug) this).field_o.a(0);
                        if (var4_ref2 == null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        ((ug) this).field_t.a((rg) (Object) var4_ref2, false);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 10: {
                        if (-1 == (((ug) this).field_c ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        try {
                            ((ug) this).field_r.field_v = 0;
                            ((ug) this).field_r.a(4, false);
                            ((ug) this).field_r.a((int) ((ug) this).field_c, false);
                            ((ug) this).field_r.a(true, 0);
                            ((ug) this).field_w.a(((ug) this).field_r.field_t, (byte) -102, ((ug) this).field_r.field_t.length, 0);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var4_ref = (IOException) (Object) caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((ug) this).field_w.c(-127);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        ((ug) this).field_a = -2;
                        ((ug) this).field_w = null;
                        ((ug) this).field_e = ((ug) this).field_e + 1;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        ((ug) this).field_m = 0;
                        if (param0 > 8) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        return;
                    }
                    case 20: {
                        ((ug) this).field_d = rl.a((byte) -117);
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

    public static void h(int param0) {
        if (param0 > -60) {
            return;
        }
        field_x = null;
        field_v = null;
    }

    final boolean d(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            sp var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            sp var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            Object var17 = null;
            int stackIn_46_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_84_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_83_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Pool.field_O;
                        if (null == ((ug) this).field_w) {
                            statePc = 10;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = rl.a((byte) -126);
                        var4 = (int)(-((ug) this).field_d + var2_long);
                        ((ug) this).field_d = var2_long;
                        if (200 < var4) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = 200;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        ((ug) this).field_m = ((ug) this).field_m + var4;
                        if (((ug) this).field_m > 30000) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((ug) this).field_w.c(-100);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var5_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        ((ug) this).field_w = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (((ug) this).field_w != null) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (0 != ((ug) this).c(4609)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (((ug) this).a(false) != 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        return true;
                    }
                    case 14: {
                        return false;
                    }
                    case 15: {
                        try {
                            ((ug) this).field_w.e(0);
                            var2_ref = (sp) (Object) ((ug) this).field_j.a((byte) -22);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var2_ref == null) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((ug) this).field_r.field_v = 0;
                            ((ug) this).field_r.a(1, false);
                            ((ug) this).field_r.b(var2_ref.field_m, 24136);
                            ((ug) this).field_w.a(((ug) this).field_r.field_t, (byte) -97, ((ug) this).field_r.field_t.length, 0);
                            ((ug) this).field_f.a((rg) (Object) var2_ref, false);
                            var2_ref = (sp) (Object) ((ug) this).field_j.b((byte) -116);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var2_ref = (sp) (Object) ((ug) this).field_t.a((byte) 117);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var2_ref == null) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((ug) this).field_r.field_v = 0;
                            ((ug) this).field_r.a(0, false);
                            ((ug) this).field_r.b(var2_ref.field_m, 24136);
                            ((ug) this).field_w.a(((ug) this).field_r.field_t, (byte) 55, ((ug) this).field_r.field_t.length, 0);
                            ((ug) this).field_o.a((rg) (Object) var2_ref, false);
                            var2_ref = (sp) (Object) ((ug) this).field_t.b((byte) -112);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (param0 == -2147483648) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var17 = null;
                            ko discarded$1 = ug.a((int[]) null, 69, (String) null, 35, (lr) null, true, -63);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var2_int = 0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (100 <= var2_int) {
                                statePc = 83;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var3_int = ((ug) this).field_w.d(75);
                            if (0 <= var3_int) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var3_int == 0) {
                                statePc = 83;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((ug) this).field_m = 0;
                            var4 = 0;
                            if (null == ((ug) this).field_i) {
                                statePc = 32;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (((ug) this).field_i.field_J == 0) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var4 = 1;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var4 = 10;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var4 <= 0) {
                                statePc = 69;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var5 = -((ug) this).field_p.field_v + var4;
                            if (var3_int >= var5) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var5 = var3_int;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            ((ug) this).field_w.a(var5, 0, ((ug) this).field_p.field_v, ((ug) this).field_p.field_t);
                            if (((ug) this).field_c == 0) {
                                statePc = 40;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var6 = 0;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var5 <= var6) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            ((ug) this).field_p.field_t[((ug) this).field_p.field_v - -var6] = (byte)cq.a((int) ((ug) this).field_p.field_t[((ug) this).field_p.field_v + var6], (int) ((ug) this).field_c);
                            var6++;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            ((ug) this).field_p.field_v = ((ug) this).field_p.field_v + var5;
                            if (((ug) this).field_p.field_v >= var4) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (((ug) this).field_i != null) {
                                statePc = 63;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            ((ug) this).field_p.field_v = 0;
                            var6 = ((ug) this).field_p.g(param0 + 2147483550);
                            var7 = ((ug) this).field_p.b(true);
                            var8 = ((ug) this).field_p.g(param0 + 2147483525);
                            var9 = ((ug) this).field_p.b(true);
                            var10 = var8 & 127;
                            if (0 == (128 & var8)) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            stackOut_44_0 = 1;
                            stackIn_46_0 = stackOut_44_0;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            stackOut_45_0 = 0;
                            stackIn_46_0 = stackOut_45_0;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var11 = stackIn_46_0;
                            var12 = (long)var7 + ((long)var6 << 1122941088);
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 52;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var14_ref = (sp) (Object) ((ug) this).field_o.a((byte) 96);
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var14_ref == null) {
                                statePc = 57;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (var12 != var14_ref.field_m) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var14_ref = (sp) (Object) ((ug) this).field_o.b((byte) -99);
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var14_ref = (sp) (Object) ((ug) this).field_f.a((byte) -113);
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var14_ref == null) {
                                statePc = 57;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if ((var12 ^ -1L) != (var14_ref.field_m ^ -1L)) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var14_ref = (sp) (Object) ((ug) this).field_f.b((byte) -87);
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (var14_ref != null) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (-1 != (var10 ^ -1)) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            stackOut_60_0 = 5;
                            stackIn_62_0 = stackOut_60_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            stackOut_61_0 = 9;
                            stackIn_62_0 = stackOut_61_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var15 = stackIn_62_0;
                            ((ug) this).field_i = var14_ref;
                            ((ug) this).field_i.field_K = new ge(var15 + (var9 + ((ug) this).field_i.field_L));
                            ((ug) this).field_i.field_K.a(var10, false);
                            ((ug) this).field_i.field_K.a(true, var9);
                            ((ug) this).field_p.field_v = 0;
                            ((ug) this).field_i.field_J = 10;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (((ug) this).field_i.field_J == 0) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (((ug) this).field_p.field_t[0] == -1) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            ((ug) this).field_i = null;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            ((ug) this).field_i.field_J = 1;
                            ((ug) this).field_p.field_v = 0;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var5 = -((ug) this).field_i.field_L + ((ug) this).field_i.field_K.field_t.length;
                            var6 = -((ug) this).field_i.field_J + 512;
                            if (var5 + -((ug) this).field_i.field_K.field_v >= var6) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var6 = -((ug) this).field_i.field_K.field_v + var5;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (var3_int >= var6) {
                                statePc = 73;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var6 = var3_int;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            ((ug) this).field_w.a(var6, param0 + -2147483648, ((ug) this).field_i.field_K.field_v, ((ug) this).field_i.field_K.field_t);
                            if (((ug) this).field_c != 0) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var7 = 0;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (var7 >= var6) {
                                statePc = 78;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            ((ug) this).field_i.field_K.field_t[var7 + ((ug) this).field_i.field_K.field_v] = (byte)cq.a((int) ((ug) this).field_i.field_K.field_t[var7 + ((ug) this).field_i.field_K.field_v], (int) ((ug) this).field_c);
                            var7++;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            ((ug) this).field_i.field_K.field_v = ((ug) this).field_i.field_K.field_v + var6;
                            ((ug) this).field_i.field_J = ((ug) this).field_i.field_J + var6;
                            if (((ug) this).field_i.field_K.field_v == var5) {
                                statePc = 81;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (((ug) this).field_i.field_J != 512) {
                                statePc = 82;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            ((ug) this).field_i.field_J = 0;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            ((ug) this).field_i.a(false);
                            ((ug) this).field_i.field_F = false;
                            ((ug) this).field_i = null;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var2_int++;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            stackOut_83_0 = 1;
                            stackIn_84_0 = stackOut_83_0;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        return stackIn_84_0 != 0;
                    }
                    case 85: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 86;
                        continue stateLoop;
                    }
                    case 86: {
                        try {
                            ((ug) this).field_w.c(-128);
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 89: {
                        ((ug) this).field_e = ((ug) this).field_e + 1;
                        ((ug) this).field_w = null;
                        ((ug) this).field_a = -2;
                        if (((ug) this).c(4609) != 0) {
                            statePc = 92;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        if (((ug) this).a(false) != 0) {
                            statePc = 92;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    }
                    case 91: {
                        return true;
                    }
                    case 92: {
                        return false;
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

    final void c(byte param0) {
        if (null != ((ug) this).field_w) {
            ((ug) this).field_w.c(-102);
        }
        if (param0 >= -24) {
            ((ug) this).field_w = null;
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Pool.field_O;
        var4 = param2.length();
        var5 = param0.length();
        var6 = param1.length();
        if (-1 != var5) {
          L0: {
            var7 = var4;
            var8 = -var5 + var6;
            if (param3 != var8) {
              var9_int = 0;
              L1: while (true) {
                var9_int = param2.indexOf(param0, var9_int);
                if (0 <= var9_int) {
                  var7 = var7 + var8;
                  var9_int = var9_int + var5;
                  continue L1;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          L2: while (true) {
            var11 = param2.indexOf(param0, var10);
            if (var11 >= 0) {
              StringBuilder discarded$3 = var9.append(param2.substring(var10, var11));
              var10 = var11 - -var5;
              StringBuilder discarded$4 = var9.append(param1);
              continue L2;
            } else {
              StringBuilder discarded$5 = var9.append(param2.substring(var10));
              return var9.toString();
            }
          }
        } else {
          throw new IllegalArgumentException("Key cannot have zero length");
        }
    }

    public ug() {
    }

    final static int g(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            ge var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_36_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_35_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (-5 < (sq.field_c.field_e ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (-1 == sq.field_c.field_a) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return 3;
                    }
                    case 4: {
                        if (-2 != sq.field_c.field_a) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 4;
                    }
                    case 6: {
                        return 1;
                    }
                    case 7: {
                        try {
                            if (rl.field_e == 0) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            mq.field_c = fe.field_M.a(nr.field_X, na.field_a, 0);
                            rl.field_e = rl.field_e + 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (rl.field_e != 1) {
                                statePc = 18;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (mq.field_c.field_f == 2) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = sd.a(false, -1);
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0;
                    }
                    case 15: {
                        try {
                            if (mq.field_c.field_f == 1) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            rl.field_e = rl.field_e + 1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (2 != rl.field_e) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            dq.field_h = new vb((java.net.Socket) mq.field_c.field_e, fe.field_M);
                            var2 = new ge(13);
                            fm.a(var2, true, ci.field_k, om.field_v, ei.field_B);
                            var2.a(15, false);
                            var2.a(true, qf.field_f);
                            dq.field_h.a(var2.field_t, (byte) 72, 13, 0);
                            rl.field_e = rl.field_e + 1;
                            ae.field_d = rl.a((byte) -105) - -30000L;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (-4 != (rl.field_e ^ -1)) {
                                statePc = 29;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (0 < dq.field_h.d(72)) {
                                statePc = 25;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (rl.a((byte) -110) <= ae.field_d) {
                                statePc = 29;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            stackOut_23_0 = sd.a(false, -2);
                            stackIn_24_0 = stackOut_23_0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        return stackIn_24_0;
                    }
                    case 25: {
                        try {
                            var1_int = dq.field_h.a(14528);
                            if (-1 == (var1_int ^ -1)) {
                                statePc = 28;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            stackOut_26_0 = sd.a(false, var1_int);
                            stackIn_27_0 = stackOut_26_0;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        return stackIn_27_0;
                    }
                    case 28: {
                        try {
                            rl.field_e = rl.field_e + 1;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (rl.field_e != 4) {
                                statePc = 32;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            sq.field_c.a(101, sa.field_k, (Object) (Object) dq.field_h);
                            mq.field_c = null;
                            rl.field_e = 0;
                            dq.field_h = null;
                            stackOut_30_0 = 0;
                            stackIn_31_0 = stackOut_30_0;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        return stackIn_31_0;
                    }
                    case 32: {
                        try {
                            if (param0 == -27108) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            stackOut_33_0 = -29;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0;
                    }
                    case 35: {
                        try {
                            stackOut_35_0 = -1;
                            stackIn_36_0 = stackOut_35_0;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        return stackIn_36_0;
                    }
                    case 37: {
                        var1 = (IOException) (Object) caughtException;
                        return sd.a(false, -3);
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
        field_v = new ml("usename");
    }
}
