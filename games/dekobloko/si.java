/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class si implements Iterable {
    static vj field_e;
    int field_a;
    static ck[] field_d;
    static String field_j;
    private bh field_l;
    bh[] field_h;
    static String[] field_f;
    static String field_i;
    static ck field_n;
    static String field_c;
    static String field_k;
    static w[] field_b;
    static String field_g;
    static String field_m;

    final bh a(long param0, byte param1) {
        bh var4;
        bh var5;
        int var6;
        int stackIn_8_0 = 0;
        var6 = client.field_A ? 1 : 0;
        var4 = this.field_h[(int)(param0 & (long)(this.field_a - 1))];
        this.field_l = var4.field_b;
        L0: while (true) {
          L1: {
            L2: {
              if (var4 == this.field_l) {
                break L2;
              } else {
                stackIn_8_0 = ((param0 ^ -1L) < (this.field_l.field_i ^ -1L) ? -1 : ((param0 ^ -1L) == (this.field_l.field_i ^ -1L) ? 0 : 1));

                if (var6 != 0) {
                  break L1;
                } else {
                  if (stackIn_8_0 == 0) {
                    var5 = this.field_l;
                    this.field_l = this.field_l.field_b;
                    return var5;
                  } else {
                    this.field_l = this.field_l.field_b;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            this.field_l = null;
            stackIn_8_0 = param1;
            break L1;
          }
          if (stackIn_8_0 == -37) {
            return null;
          } else {
            this.field_a = 79;
            return null;
          }
        }
    }

    final void a(long param0, boolean param1, bh param2) {
        bh var5 = null;
        try {
            if (null != param2.field_a) {
                param2.b((byte) 107);
            }
            var5 = this.field_h[(int)(param0 & (long)(this.field_a + -1))];
            param2.field_a = var5.field_a;
            if (param1) {
                field_d = (ck[]) null;
            }
            param2.field_b = var5;
            param2.field_a.field_b = param2;
            param2.field_b.field_a = param2;
            param2.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "si.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(boolean param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                si.a(115, true, -31, -28, 79, (byte) 85, -127);
                break L1;
              }
            }
            if (param2) {
              stackIn_6_0 = bg.field_g.a(param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = rk.field_R.a(param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("si.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void d(int param0) {
        String var2;
        if (cl.field_r == null) {
          sn.field_k = new cn();
          if (param0 != -31842) {
            var2 = (String) null;
            si.a(true, (String) null, true);
            de.field_W.c(sn.field_k, (byte) 87);
            return;
          } else {
            de.field_W.c(sn.field_k, (byte) 87);
            return;
          }
        } else {
          cl.field_r.n(22);
          sn.field_k = new cn();
          if (param0 == -31842) {
            de.field_W.c(sn.field_k, (byte) 87);
            return;
          } else {
            var2 = (String) null;
            si.a(true, (String) null, true);
            de.field_W.c(sn.field_k, (byte) 87);
            return;
          }
        }
    }

    final static void a(int param0) {
        String var2;
        L0: {
          if (null != qc.field_s) {
            qc.field_s.a(0);
            qc.field_s = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= 57) {
          var2 = (String) null;
          si.a(true, (String) null, true);
          return;
        } else {
          return;
        }
    }

    final static ck[] a(int param0, int param1, ji param2, byte param3) {
        RuntimeException var4 = null;
        ck[] var5 = null;
        ck[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (gb.a(param1, param2, param0, 106)) {
              L1: {
                if (param3 == -46) {
                  break L1;
                } else {
                  var5 = (ck[]) null;
                  si.a(55, false, (ck[]) null, true);
                  break L1;
                }
              }
              stackIn_6_0 = ca.m(0);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("si.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static ck[] a(int param0, boolean param1, ck[] param2, boolean param3) {
        ck[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        ck[] stackIn_3_0 = null;
        ck[] stackIn_7_0 = null;
        ck[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 25972) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (ck[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var4 = new ck[param2.length];
                        var5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param2.length <= var5) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_10_0 = (ck[]) (var4);
                        stackIn_7_0 = stackIn_10_0;
                        if (var6 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_7_0[var5] = me.a(param2[var5], param3, (byte) -87, param1);
                        var5++;
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = (ck[]) (var4);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_13_0 = (RuntimeException) (var4_ref);
                    stackIn_12_0 = stackIn_13_0;
                    stackIn_13_1 = new StringBuilder().append("si.J(").append(param0).append(',').append(param1).append(',');
                    stackIn_12_1 = stackIn_13_1;
                    if (param2 == null) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_14_2 = "{...}";
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_14_2 = "null";
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean c(int param0) {
        if (param0 == -12851) {
          if (null != qc.field_s) {
            if (ph.field_xb != wf.field_u) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_i = (String) null;
          if (null != qc.field_s) {
            if (ph.field_xb != wf.field_u) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new cm((si) (this)));
    }

    final static void b(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            try {
              L0: {
                var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                if (param0 == 1) {
                  break L0;
                } else {
                  field_g = (String) null;
                  break L0;
                }
              }
              if (var1 != null) {
                try {
                  L1: {
                    var2 = Runtime.getRuntime();
                    var4 = (Object[]) null;
                    var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                    ab.field_e = 1 + (int)(var3.longValue() / 1048576L);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  return;
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, byte param5, int param6) {
        String var7;
        if (param5 != -41) {
          return;
        } else {
          L0: {
            L1: {
              if (-3 != (pk.field_r ^ -1)) {
                break L1;
              } else {
                var7 = wk.field_n;
                if (!client.field_A) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var7 = ob.field_l;
            break L0;
          }
          pn.a(param3, param2, param1, param4, var7, param5 + 168, param0, param6);
          return;
        }
    }

    public static void e(int param0) {
        field_b = null;
        field_k = null;
        field_f = null;
        field_m = null;
        field_d = null;
        field_e = null;
        field_i = null;
        field_j = null;
        field_n = null;
        field_g = null;
        field_c = null;
        if (param0 != 0) {
            field_n = (ck) null;
        }
    }

    si(int param0) {
        bh dupTemp$1 = null;
        int var2 = 0;
        bh var3 = null;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    this.field_a = param0;
                    this.field_h = new bh[param0];
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param0 <= var2) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    dupTemp$1 = new bh();
                    var3 = dupTemp$1;
                    this.field_h[var2] = dupTemp$1;
                    var3.field_a = var3;
                    var3.field_b = var3;
                    var2++;
                    if (var4 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_j = "Mute this player for 48 hours";
        field_e = new vj();
        field_k = "Unrated game";
        field_f = new String[]{"Bucket size", "Speed", "Colours", "Special items", "Shape feedback"};
        field_i = "You cannot add yourself!";
        field_c = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_g = "You are not currently logged in to the<nbsp>game.";
        field_m = "Connecting to<br>friend server...";
    }
}
