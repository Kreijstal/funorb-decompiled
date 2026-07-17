/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends ki {
    static String field_s;
    static vl field_t;
    static gk field_x;
    static mh field_w;
    static jp field_y;
    static boolean field_r;
    static String field_v;
    static boolean field_u;

    final jp c(byte param0) {
        if (param0 >= -74) {
            ((qa) this).a((byte) 57, -62, 109, 2);
            return ao.field_q;
        }
        return ao.field_q;
    }

    final boolean a(boolean param0) {
        if (!i.field_m.a("ninja", -28138)) {
          return false;
        } else {
          mj.field_d = pl.a("ninja", "ninja_near", (byte) -24, i.field_m);
          ap.field_f = pl.a("ninja", "ninja_mid", (byte) -128, i.field_m);
          hn.field_b = pl.a("ninja", "ninja_far", (byte) 127, i.field_m);
          hc.field_g = pl.a("ninja", "ninja_small", (byte) -81, i.field_m);
          ao.field_q = pl.a("ninja", "ninja_character", (byte) -105, i.field_m);
          nk.field_h = jh.a(0, mj.field_d);
          mp.field_Zb = jh.a(0, ap.field_f);
          rh.field_c = jh.a(0, hn.field_b);
          pl.a(hn.field_b, 0);
          if (param0) {
            return false;
          } else {
            pl.a(rh.field_c, 0);
            return true;
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pb var6 = null;
        if (param0) {
          if (((qa) this).b((byte) -110)) {
            L0: {
              var6 = ge.a(((qa) this).field_m, param3, -20777);
              if (!var6.a((byte) -84, param3, ((qa) this).field_m)) {
                aa.a(0, hn.field_b, true, param3, var6, 1);
                var6.a(((qa) this).field_m, param3, (byte) 78);
                break L0;
              } else {
                break L0;
              }
            }
            tl.a(var6.field_p, (byte) -78, param2, 640, mj.field_d, ap.field_f, param1, 0, param3, param4, 1);
            return;
          } else {
            lb.g(param4, param2, 640, 480, fj.field_Sb[param3], 0);
            return;
          }
        } else {
          return;
        }
    }

    qa(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
    }

    public static void d(byte param0) {
        field_s = null;
        field_v = null;
        field_x = null;
        int var1 = 0;
        field_t = null;
        field_w = null;
        field_y = null;
    }

    final boolean b(byte param0) {
        int stackIn_11_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        if (param0 < -91) {
          if (null != mj.field_d) {
            if (ap.field_f != null) {
              if (null != hn.field_b) {
                if (null == hc.field_g) {
                  return false;
                } else {
                  L0: {
                    if (null == ao.field_q) {
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      break L0;
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L0;
                    }
                  }
                  return stackIn_24_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$8 = qa.a(-41, -77, (byte) -108, -18);
          if (null != mj.field_d) {
            if (ap.field_f != null) {
              if (null != hn.field_b) {
                if (null == hc.field_g) {
                  return false;
                } else {
                  L1: {
                    if (null == ao.field_q) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L1;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L1;
                    }
                  }
                  return stackIn_11_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static jp[] a(int param0, int param1, mf param2, boolean param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        jp[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (ln.a(-97, param0, param2, param1)) {
              stackOut_3_0 = v.a(-835);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (jp[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("qa.M(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 1 + 41);
        }
        return stackIn_4_0;
    }

    final static void e(byte param0) {
        int var1 = 0;
        var1 = 35 / ((-43 - param0) / 37);
        mf.field_f.a(-125);
        if (null == sj.field_b) {
          sj.field_b = new tb(mf.field_f, ke.field_b);
          mf.field_f.a(-76, (oc) (Object) sj.field_b);
          return;
        } else {
          mf.field_f.a(-76, (oc) (Object) sj.field_b);
          return;
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        Object var7 = null;
        pb var8 = null;
        if (((qa) this).b((byte) -127)) {
          var8 = kd.a(((qa) this).field_m, param3, (byte) 120);
          if (var8.a((byte) -84, param3, ((qa) this).field_m)) {
            tl.a(var8.field_p, (byte) -78, param0, 306, nk.field_h, mp.field_Zb, param4, 0, param3, param2, 2);
            if (param1 <= -84) {
              return;
            } else {
              var7 = null;
              jp[] discarded$3 = qa.a(90, 38, (mf) null, true);
              return;
            }
          } else {
            aa.a(0, rh.field_c, true, param3, var8, 2);
            var8.a(((qa) this).field_m, param3, (byte) 78);
            tl.a(var8.field_p, (byte) -78, param0, 306, nk.field_h, mp.field_Zb, param4, 0, param3, param2, 2);
            if (param1 > -84) {
              var7 = null;
              jp[] discarded$4 = qa.a(90, 38, (mf) null, true);
              return;
            } else {
              return;
            }
          }
        } else {
          lb.g(param2, param0, 306, 480, fj.field_Sb[param3], 0);
          if (param1 <= -84) {
            return;
          } else {
            var7 = null;
            jp[] discarded$5 = qa.a(90, 38, (mf) null, true);
            return;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (-1 >= param1) {
          L0: {
            lb.g(param2, param3, 153, 238, 7829367, 928072);
            var5 = 110 / ((param0 - -28) / 43);
            if (((qa) this).b((byte) -97)) {
              hc.field_g.c(param2, param3);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            lb.g(param2, param3, 153, 238, fj.field_Sb[param1], 0);
            var5 = 110 / ((param0 - -28) / 43);
            if (((qa) this).b((byte) -97)) {
              hc.field_g.c(param2, param3);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static boolean a(int param0, int param1, byte param2, int param3) {
        if (um.field_e) {
          return vd.field_a.a(go.field_b, dc.field_b, true);
        } else {
          if (!nq.field_p) {
            if (!ln.a(param1, 11, param0)) {
              if (!qo.field_I) {
                if (param2 != 108) {
                  field_y = null;
                  return hi.a(false, param3, param1);
                } else {
                  return hi.a(false, param3, param1);
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return sa.a(param1, 102, param0);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_t = new vl();
        field_v = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
