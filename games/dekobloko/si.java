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
        bh var4 = null;
        bh var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_2_0 = 0;
        byte stackOut_7_0 = 0;
        var6 = client.field_A ? 1 : 0;
        var4 = this.field_h[(int)(param0 & (long)(this.field_a - 1))];
        this.field_l = var4.field_b;
        L0: while (true) {
          L1: {
            L2: {
              if (var4 == this.field_l) {
                break L2;
              } else {
                stackOut_2_0 = ((param0 ^ -1L) < (this.field_l.field_i ^ -1L) ? -1 : ((param0 ^ -1L) == (this.field_l.field_i ^ -1L) ? 0 : 1));
                stackIn_8_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0 == 0) {
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
            stackOut_7_0 = param1;
            stackIn_8_0 = stackOut_7_0;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
              stackOut_5_0 = bg.field_g.a(param1);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = rk.field_R.a(param1);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("si.K(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
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
        int discarded$4 = 0;
        int discarded$5 = 0;
        String var2 = null;
        if (cl.field_r == null) {
          sn.field_k = new cn();
          if (param0 != -31842) {
            var2 = (String) null;
            discarded$4 = si.a(true, (String) null, true);
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
            discarded$5 = si.a(true, (String) null, true);
            de.field_W.c(sn.field_k, (byte) 87);
            return;
          }
        }
    }

    final static void a(int param0) {
        int discarded$2 = 0;
        String var2 = null;
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
          discarded$2 = si.a(true, (String) null, true);
          return;
        } else {
          return;
        }
    }

    final static ck[] a(int param0, int param1, ji param2, byte param3) {
        ck[] discarded$2 = null;
        RuntimeException var4 = null;
        ck[] var5 = null;
        ck[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (gb.a(param1, param2, param0, 106)) {
              L1: {
                if (param3 == -46) {
                  break L1;
                } else {
                  var5 = (ck[]) null;
                  discarded$2 = si.a(55, false, (ck[]) null, true);
                  break L1;
                }
              }
              stackOut_5_0 = ca.m(0);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("si.B(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
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
        RuntimeException decompiledCaughtException = null;
        ck[] stackOut_6_0 = null;
        ck[] stackOut_9_0 = null;
        ck[] stackOut_2_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 == 25972) {
              var4 = new ck[param2.length];
              var5 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (param2.length <= var5) {
                      break L3;
                    } else {
                      stackOut_6_0 = (ck[]) (var4);
                      stackIn_10_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        stackIn_7_0[var5] = me.a(param2[var5], param3, (byte) -87, param1);
                        var5++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_9_0 = (ck[]) (var4);
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (ck[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4_ref);
            stackOut_11_1 = new StringBuilder().append("si.J(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
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
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            Throwable decompiledCaughtException = null;
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
                    var2_ref = Runtime.getRuntime();
                    var4 = (Object[]) null;
                    var3 = (Long) (var1.invoke((Object) (var2_ref), (Object[]) null));
                    ab.field_e = 1 + (int)(var3.longValue() / 1048576L);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = decompiledCaughtException;
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
        String var7 = null;
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
        bh dupTemp$0 = null;
        bh var3 = null;
        int var4 = client.field_A ? 1 : 0;
        this.field_a = param0;
        this.field_h = new bh[param0];
        int var2 = 0;
        while (param0 > var2) {
            dupTemp$0 = new bh();
            var3 = dupTemp$0;
            this.field_h[var2] = dupTemp$0;
            var3.field_a = var3;
            var3.field_b = var3;
            var2++;
            if (var4 != 0) {
                return;
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
