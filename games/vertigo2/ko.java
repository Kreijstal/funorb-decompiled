/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko extends af {
    private boolean field_Q;
    private kp field_R;
    private kp field_T;
    static String field_S;
    private kp field_N;
    static tj field_O;
    static String field_U;
    static int field_P;
    static ke field_M;

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        super.a(param0, param1, param2, param3, param4);
        var6 = -130 + param4 >> 1;
        if (!((ko) this).field_Q) {
          ((ko) this).field_N.a(param0, var6, 0, param3, 25);
          ((ko) this).field_T.a(param0, var6 - -45, 0, param3, 25);
          ((ko) this).field_R.a(param0, var6 + 90, 0, param3, 40);
          return;
        } else {
          ((ko) this).field_T.a(false, var6, 0, param3, 25);
          ((ko) this).field_N.a(false, 45 + var6, 0, param3, 25);
          ((ko) this).field_R.a(param0, var6 + 90, 0, param3, 40);
          return;
        }
    }

    final int a(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (param0 == -32410) {
          try {
            L0: {
              stackOut_2_0 = Integer.parseInt(((ko) this).field_N.field_w);
              stackIn_3_0 = stackOut_2_0;
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            return -1;
          }
          return stackIn_3_0;
        } else {
          return -117;
        }
    }

    final boolean e(boolean param0) {
        if (null != ((ko) this).field_N.field_w) {
          if (0 != ((ko) this).field_N.field_w.length()) {
            if (null != ((ko) this).field_T.field_w) {
              if (((ko) this).field_T.field_w.length() != 0) {
                if (!param0) {
                  if (null != ((ko) this).field_R.field_w) {
                    if (((ko) this).field_R.field_w.length() == 0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  boolean discarded$6 = ((ko) this).e(false);
                  if (null != ((ko) this).field_R.field_w) {
                    if (((ko) this).field_R.field_w.length() == 0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final void a(int param0, df param1) {
        try {
            super.a(param0, param1);
            if (param0 != -11808) {
                boolean discarded$0 = ((ko) this).e(true);
            }
            ((ko) this).field_N.field_v = (uf) (Object) param1;
            ((ko) this).field_T.field_v = (uf) (Object) param1;
            ((ko) this).field_R.field_v = (uf) (Object) param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ko.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean e() {
        int discarded$0 = 0;
        return pp.a(ob.e((byte) -124));
    }

    final static boolean b(byte param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -27) {
          L0: {
            field_P = 61;
            if (param1 != (-param1 & param1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (param1 != (-param1 & param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int c(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            boolean discarded$2 = ko.b((byte) 90, -57);
            break L0;
          }
        }
        try {
          L1: {
            stackOut_2_0 = Integer.parseInt(((ko) this).field_R.field_w);
            stackIn_3_0 = stackOut_2_0;
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    public static void f() {
        field_U = null;
        field_O = null;
        field_M = null;
        field_S = null;
    }

    final static void a(boolean param0, int param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        tn var4_ref = null;
        cr var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (~ce.field_b == ~ro.field_g.field_d) {
                break L1;
              } else {
                tc.field_b = tc.field_b + (ro.field_g.field_d + -ce.field_b);
                ce.field_b = ro.field_g.field_d;
                break L1;
              }
            }
            L2: {
              if (~ld.field_b < ~da.field_i) {
                da.field_i = da.field_i + 1;
                break L2;
              } else {
                break L2;
              }
            }
            if (da.field_i > 0) {
              L3: {
                kg.c((byte) 77);
                td.field_c.a(0, param0);
                if (lq.field_a == null) {
                  break L3;
                } else {
                  if (pe.field_r) {
                    boolean discarded$3 = lq.field_a.a(td.field_c.field_C, param0, (byte) 82, td.field_c.field_ob);
                    break L3;
                  } else {
                    lq.field_a = null;
                    break L3;
                  }
                }
              }
              var4_int = 0;
              L4: while (true) {
                if (var4_int >= 5) {
                  L5: {
                    if (ea.field_c.field_tb == 0) {
                      break L5;
                    } else {
                      up.field_z = new cb(ea.field_c.field_ob, ea.field_c.field_C, ea.field_c.field_Fb, ea.field_c.field_db, 0, hb.field_D, ji.field_s, eh.field_a, ee.field_b, fr.field_a, ja.field_e, (String) null, 0L);
                      break L5;
                    }
                  }
                  L6: {
                    var4_ref = qr.a(ia.field_G, 55, param1, r.field_f);
                    if (var4_ref == null) {
                      break L6;
                    } else {
                      int discarded$4 = 32192;
                      nd.a(var4_ref);
                      break L6;
                    }
                  }
                  int discarded$5 = -485;
                  var8 = ui.b();
                  if (var8 == null) {
                    break L0;
                  } else {
                    field_S = var8;
                    return;
                  }
                } else {
                  var5 = hl.field_q[var4_int];
                  if (var5 != null) {
                    L7: {
                      if (var5.field_tb == 0) {
                        break L7;
                      } else {
                        gh.a(var5, (byte) 42, var4_int);
                        break L7;
                      }
                    }
                    var6 = ab.a(0, var4_int);
                    w.field_C[var4_int].field_Db = kb.field_d[var6];
                    mg.field_M[var4_int].field_S = ba.field_f[var6];
                    var4_int++;
                    var4_int++;
                    continue L4;
                  } else {
                    var4_int++;
                    var4_int++;
                    continue L4;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var4, "ko.D(" + param0 + 44 + param1 + 44 + 0 + 44 + 1 + 41);
        }
    }

    ko(ur param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
            ((ko) this).a(false, param2, param3, param5, param4);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ko.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private ko(ur param0, boolean param1) {
        super(0, 0, 0, 0, (ur) null);
        try {
            ((ko) this).field_N = (kp) (Object) new br("", (uf) null, 2);
            ((ko) this).field_T = (kp) (Object) new br("", (uf) null, 2);
            ((ko) this).field_R = (kp) (Object) new br("", (uf) null, 4);
            ((ko) this).field_Q = param1 ? true : false;
            ((ko) this).field_R.field_B = param0;
            ((ko) this).field_T.field_B = param0;
            ((ko) this).field_N.field_B = param0;
            if (!((ko) this).field_Q) {
                ((ko) this).c((byte) -91, (iq) (Object) ((ko) this).field_N);
                ((ko) this).c((byte) -27, (iq) (Object) ((ko) this).field_T);
            } else {
                ((ko) this).c((byte) 79, (iq) (Object) ((ko) this).field_T);
                ((ko) this).c((byte) 82, (iq) (Object) ((ko) this).field_N);
            }
            ((ko) this).c((byte) 77, (iq) (Object) ((ko) this).field_R);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ko.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          param2 = param2 + ((ko) this).field_o;
          param3 = param3 + ((ko) this).field_t;
          this.a(param3, -626, param2, (iq) (Object) ((ko) this).field_N, gl.field_m);
          this.a(param3, -626, param2, (iq) (Object) ((ko) this).field_T, ff.field_v);
          this.a(param3, -626, param2, (iq) (Object) ((ko) this).field_R, um.field_C);
          return;
        }
    }

    final int i(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            field_P = 123;
            break L0;
          }
        }
        try {
          L1: {
            stackOut_2_0 = -1 + Integer.parseInt(((ko) this).field_T.field_w);
            stackIn_3_0 = stackOut_2_0;
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    private final void a(int param0, int param1, int param2, iq param3, String param4) {
        try {
            bl.field_N.c(param4, (param3.field_n >> 1) + param2 - -param3.field_o, -5 + (param3.field_t + param0), 16777215, -1);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ko.B(" + param0 + 44 + -626 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final String a(boolean param0) {
        String var2 = ((ko) this).field_T.a(param0);
        if (!(var2 == null)) {
            return var2;
        }
        if (!(!((ko) this).field_p)) {
            return ((ko) this).field_q != null ? ((ko) this).field_q : ((ko) this).field_w;
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_O = new tj();
    }
}
