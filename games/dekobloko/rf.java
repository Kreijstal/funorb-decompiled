/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    byte[] field_c;
    int field_m;
    int field_j;
    int field_n;
    int field_b;
    int field_l;
    static qm field_k;
    int field_e;
    static String field_p;
    static String field_h;
    static int field_o;
    static String field_i;
    static int field_f;
    static int field_g;
    static int field_a;
    static int field_d;

    final static dh[] a(int param0, uf param1) {
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        dh[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        dh var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        dh[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dh[] stackOut_12_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.a(8, (byte) 80);
            if ((var2_int ^ -1) >= -1) {
              L1: {
                if (param0 > 121) {
                  break L1;
                } else {
                  field_i = (String) null;
                  break L1;
                }
              }
              var3 = param1.a(12, (byte) 77);
              var4 = new dh[var3];
              var5 = 0;
              L2: while (true) {
                if (var5 >= var3) {
                  stackOut_12_0 = (dh[]) (var4);
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    L4: {
                      if (wg.a(param1, (byte) 26)) {
                        break L4;
                      } else {
                        var6_int = param1.a(ma.a(var5 + -1, (byte) 49), (byte) 118);
                        var4[var5] = var4[var6_int];
                        if (var7 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var6 = new dh();
                    discarded$12 = param1.a(24, (byte) 40);
                    discarded$13 = param1.a(24, (byte) 73);
                    var6.field_a = param1.a(24, (byte) 42);
                    discarded$14 = param1.a(9, (byte) 98);
                    discarded$15 = param1.a(12, (byte) 77);
                    discarded$16 = param1.a(12, (byte) 86);
                    discarded$17 = param1.a(12, (byte) 108);
                    var4[var5] = var6;
                    break L3;
                  }
                  var5++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("rf.D(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dh[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_13_0;
        }
    }

    final static void a(int param0, boolean param1, float param2, String param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null == pk.field_v) {
                pk.field_v = new qn(ah.field_c, ed.field_d);
                ah.field_c.a((byte) -107, pk.field_v);
                break L1;
              } else {
                break L1;
              }
            }
            pk.field_v.a(param1, param2, 4210752, param3);
            hk.b();
            cg.a(true, param0 + 106);
            if (param0 == 12) {
              break L0;
            } else {
              field_k = (qm) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("rf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public static void a(boolean param0) {
        dh[] discarded$2 = null;
        uf var2 = null;
        field_i = null;
        field_p = null;
        field_h = null;
        if (param0) {
          var2 = (uf) null;
          discarded$2 = rf.a(88, (uf) null);
          field_k = null;
          return;
        } else {
          field_k = null;
          return;
        }
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 == 0) {
          if (null == ik.field_f) {
            return;
          } else {
            var1 = ik.field_f;
            synchronized (var1) {
              L0: {
                ik.field_f = null;
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            if (param0 != 12) {
                String var3 = (String) null;
                rf.a(29, true, 0.5555365681648254f, (String) null);
            }
            param1.removeKeyListener(f.field_r);
            param1.removeFocusListener(f.field_r);
            wi.field_b = -1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "rf.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 == param0) {
            var2 = qk.field_i;
        }
        if (param1 == 1) {
            var2 = wh.field_d;
        }
        if (-3 == (param1 ^ -1)) {
            var2 = wl.field_o;
        }
        return var2;
    }

    final static void a(String[] args, int param1, int param2, int param3, int param4, java.applet.Applet param5) {
        RuntimeException var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              wf.field_n = param5.getParameter("overxgames");
              if (wf.field_n == null) {
                wf.field_n = "0";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              jm.field_u = param5.getParameter("overxachievements");
              if (param3 <= -22) {
                break L2;
              } else {
                field_i = (String) null;
                break L2;
              }
            }
            L3: {
              if (jm.field_u == null) {
                jm.field_u = "0";
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6_ref = param5.getParameter("currency");
              if (var6_ref == null) {
                rb.field_m = 2;
                break L4;
              } else {
                if (!be.a((byte) 98, (CharSequence) ((Object) var6_ref))) {
                  rb.field_m = 2;
                  break L4;
                } else {
                  rb.field_m = cb.a((byte) -33, (CharSequence) ((Object) var6_ref));
                  if (var8 == 0) {
                    break L4;
                  } else {
                    rb.field_m = 2;
                    break L4;
                  }
                }
              }
            }
            w.field_Fb = param2;
            o.field_d = param4;
            qn.field_lb = param1;
            vi.field_z = new ck[args.length];
            var7 = 0;
            L5: while (true) {
              L6: {
                L7: {
                  if (var7 >= args.length) {
                    break L7;
                  } else {
                    vi.field_z[var7] = new ck(317, 34);
                    var7++;
                    if (var8 != 0) {
                      break L6;
                    } else {
                      if (var8 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                dl.field_K = args;
                break L6;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var6);
            stackOut_23_1 = new StringBuilder().append("rf.B(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (args == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param5 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    rf(int param0) {
        this.field_j = param0;
    }

    static {
        field_k = new qm(14, 0, 4, 1);
        field_p = "Unpacking sound effects";
        field_i = "When you match pieces, the machine transforms them into solid shapes.";
        field_h = "Show game chat from my friends";
        field_a = 2;
        field_f = 0;
    }
}
