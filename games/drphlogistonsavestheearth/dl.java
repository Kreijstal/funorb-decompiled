/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends si {
    int field_K;
    static bb field_L;
    static vd field_M;
    static String field_I;
    static u field_H;
    static String field_J;

    dl(vg param0) {
        super(param0.field_o, param0.field_m, param0.field_w, param0.field_k, (cg) null, (fd) null);
        try {
            param0.a(0, ((dl) this).field_k, 0, 16535, ((dl) this).field_w);
            ((dl) this).field_z = param0;
            ((dl) this).field_K = 256;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "dl.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static nh[] a() {
        int var5 = 0;
        return n.a(123, 3, 0, 0, 0, 1, 65793, 1, 1);
    }

    final static void a(String param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              oi.field_c = false;
              pj.field_F = false;
              if (param2 >= 57) {
                break L1;
              } else {
                fg discarded$2 = dl.a(false, -65);
                break L1;
              }
            }
            L2: {
              if (ol.field_a == null) {
                break L2;
              } else {
                if (ol.field_a.field_Q) {
                  L3: {
                    var3_int = 1;
                    if (param1 == 8) {
                      L4: {
                        if (!sg.field_a) {
                          param0 = m.field_c;
                          break L4;
                        } else {
                          param0 = tf.field_ib;
                          break L4;
                        }
                      }
                      param1 = 2;
                      pi.field_O.b((byte) 37, qf.field_c);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    if (param1 != 10) {
                      break L5;
                    } else {
                      bh.a((byte) -31);
                      var3_int = 0;
                      break L5;
                    }
                  }
                  L6: {
                    if (var3_int != 0) {
                      L7: {
                        if (!pj.field_F) {
                          break L7;
                        } else {
                          param0 = a.a(5044, field_J, new String[1]);
                          break L7;
                        }
                      }
                      L8: {
                        if (hl.field_b) {
                          param0 = eg.field_b;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      ol.field_a.a(param1, param0, -5485);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (param1 == 256) {
                    break L2;
                  } else {
                    if (param1 != 10) {
                      if (!sg.field_a) {
                        pi.field_O.i(134);
                        break L2;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            runtimeException = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) runtimeException;
            stackOut_28_1 = new StringBuilder().append("dl.G(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static fg a(boolean param0, int param1) {
        lh var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Exception var7 = null;
        int var8 = 0;
        lh var9 = null;
        ai var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_21_0 = null;
        int[] stackOut_20_0 = null;
        L0: {
          var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var9 = dh.field_N;
          var2 = var9;
          var3 = var9.l(31760);
          if ((128 & var3) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          td.field_f = stackIn_3_0 != 0;
          kl.field_J = 127 & var3;
          ib.field_o = var9.l(31760);
          var4 = -87 % ((param1 - -47) / 45);
          fm.field_j = var9.a((byte) -53);
          if (kl.field_J == 2) {
            dj.field_K = var9.j(-788751192);
            ob.field_a = var9.g(-1);
            break L1;
          } else {
            ob.field_a = 0;
            dj.field_K = 0;
            break L1;
          }
        }
        L2: {
          if (var9.l(31760) != 1) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var5 = stackIn_9_0;
          rh.field_j = var9.b((byte) -93);
          if (var5 != 0) {
            tf.field_kb = var9.b((byte) -64);
            break L3;
          } else {
            tf.field_kb = rh.field_j;
            break L3;
          }
        }
        L4: {
          if (1 == kl.field_J) {
            int discarded$4 = var9.j(-788751192);
            String discarded$5 = var9.b((byte) -57);
            break L4;
          } else {
            if (kl.field_J != 4) {
              break L4;
            } else {
              int discarded$6 = var9.j(-788751192);
              String discarded$7 = var9.b((byte) -57);
              break L4;
            }
          }
        }
        if (!param0) {
          am.field_m = gm.a((byte) -96, (od) (Object) var9, 80);
          mf.field_x = null;
          return new fg(param0);
        } else {
          var6 = var9.j(-788751192);
          try {
            L5: {
              L6: {
                var10 = nc.field_O.a(var6, (byte) -74);
                am.field_m = var10.i(121);
                if (tf.field_kb.equals((Object) (Object) oa.field_d)) {
                  stackOut_21_0 = null;
                  stackIn_22_0 = (int[]) (Object) stackOut_21_0;
                  break L6;
                } else {
                  stackOut_20_0 = var10.field_D;
                  stackIn_22_0 = stackOut_20_0;
                  break L6;
                }
              }
              mf.field_x = stackIn_22_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var7 = (Exception) (Object) decompiledCaughtException;
            gb.a((Throwable) (Object) var7, "CC1", 10);
            mf.field_x = null;
            am.field_m = null;
            return new fg(param0);
          }
          return new fg(param0);
        }
    }

    public dl() {
        super(0, 0, 0, 0, (cg) null, (fd) null);
        ((dl) this).field_K = 256;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (!(param1 == 0)) {
            return;
        }
        if (null == ((dl) this).field_z) {
            return;
        }
        if (((dl) this).field_K == 0) {
            return;
        }
        if (((dl) this).field_K == 256) {
            ((dl) this).field_z.a(((dl) this).field_o + param0, param1, (byte) -21, ((dl) this).field_m + param3);
            return;
        }
        nh var5 = new nh(((dl) this).field_z.field_w, ((dl) this).field_z.field_k);
        aj.a(var5, (byte) 47);
        ((dl) this).field_z.a(0, param1, param2, 0);
        cl.d((byte) -81);
        var5.e(((dl) this).field_o + param0, ((dl) this).field_m + param3, ((dl) this).field_K);
    }

    final static double a(boolean param0, double param1, double param2) {
        return Math.sqrt(param2 * param2 + param1 * param1);
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        ul.field_j[param3] = param0;
        if (param6 <= 118) {
            return;
        }
        try {
            ul.field_b[param3] = param2;
            ul.field_i[param3] = param4;
            ul.field_e[param3] = param1;
            ul.field_f[param3] = 30;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "dl.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + 30 + 44 + param6 + 41);
        }
    }

    public static void j() {
        field_M = null;
        field_I = null;
        field_H = null;
        field_J = null;
        field_L = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new bb();
        field_M = new vd();
        field_H = null;
        field_I = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_J = "Connection lost. <%0>";
    }
}
