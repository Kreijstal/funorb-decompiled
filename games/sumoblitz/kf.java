/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends pj implements ft {
    int field_x;
    static ah field_u;
    static ki field_v;
    int field_s;
    private int field_y;
    private int field_D;
    private fr field_C;
    private int field_z;
    static int field_B;
    int field_A;
    private int field_r;
    static ri[] field_w;
    static String field_t;

    final void a(boolean param0, int param1, int param2) {
        if (param0) {
          ((kf) this).field_z = 37;
          jaggl.OpenGL.glFramebufferRenderbufferEXT(param2, param1, 36161, ((kf) this).field_y);
          ((kf) this).field_z = param2;
          ((kf) this).field_r = param1;
          return;
        } else {
          jaggl.OpenGL.glFramebufferRenderbufferEXT(param2, param1, 36161, ((kf) this).field_y);
          ((kf) this).field_z = param2;
          ((kf) this).field_r = param1;
          return;
        }
    }

    final void g(int param0) {
        Object var3 = null;
        if (param0 <= -124) {
          if ((((kf) this).field_y ^ -1) < -1) {
            ((kf) this).field_C.b(((kf) this).field_y, 97, ((kf) this).field_s);
            ((kf) this).field_y = 0;
            return;
          } else {
            return;
          }
        } else {
          var3 = null;
          String discarded$5 = kf.a((CharSequence) null, (byte) -99);
          if ((((kf) this).field_y ^ -1) >= -1) {
            return;
          } else {
            ((kf) this).field_C.b(((kf) this).field_y, 97, ((kf) this).field_s);
            ((kf) this).field_y = 0;
            return;
          }
        }
    }

    final static String f(int param0) {
        if (param0 != 1) {
            return null;
        }
        if (!(null != qv.field_o)) {
            return "";
        }
        return qv.field_o;
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        fs var6 = null;
        boolean[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        boolean[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        boolean[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        boolean[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        boolean[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        boolean[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        boolean[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        boolean[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        boolean[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        boolean[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        boolean[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var6 = new fs(ah.field_g);
        var2 = var6.e(-31302);
        if ((var2 ^ -1) > -2) {
          return;
        } else {
          bl.field_e = var6.e(-31302);
          ki.field_f = var6.e(-31302);
          iv.field_i = var6.e(-31302);
          hc.field_f = var6.e(-31302);
          if (param0 <= 92) {
            return;
          } else {
            var3 = 0;
            L0: while (true) {
              if (36 <= var3) {
                return;
              } else {
                if (25 > var3) {
                  L1: {
                    go.field_j[var3] = var6.c((byte) 122);
                    ql.field_z[var3] = var6.a(255);
                    if (var2 <= -3) {
                      var4 = var6.e(-31302);
                      ql.field_A[var3] = -1 + eb.a(4, var4);
                      if (-4 <= var2) {
                        L2: {
                          stackOut_12_0 = up.field_g;
                          stackOut_12_1 = var3;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          if ((eb.a(1, var4 >> 110881382) ^ -1) != -2) {
                            stackOut_14_0 = (boolean[]) (Object) stackIn_14_0;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = 0;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            break L2;
                          } else {
                            stackOut_13_0 = (boolean[]) (Object) stackIn_13_0;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = 1;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            break L2;
                          }
                        }
                        L3: {
                          stackIn_15_0[stackIn_15_1] = stackIn_15_2 != 0;
                          stackOut_15_0 = qn.field_d;
                          stackOut_15_1 = var3;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          if ((eb.a(1, var4 >> -509514585) ^ -1) != -2) {
                            stackOut_17_0 = (boolean[]) (Object) stackIn_17_0;
                            stackOut_17_1 = stackIn_17_1;
                            stackOut_17_2 = 0;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            stackIn_18_2 = stackOut_17_2;
                            break L3;
                          } else {
                            stackOut_16_0 = (boolean[]) (Object) stackIn_16_0;
                            stackOut_16_1 = stackIn_16_1;
                            stackOut_16_2 = 1;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            stackIn_18_2 = stackOut_16_2;
                            break L3;
                          }
                        }
                        stackIn_18_0[stackIn_18_1] = stackIn_18_2 != 0;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                  if (go.field_j[var3] != 0) {
                    wm.field_f[var3] = true;
                    bl.field_e = var3;
                    var3++;
                    var3++;
                    continue L0;
                  } else {
                    var3++;
                    var3++;
                    continue L0;
                  }
                } else {
                  var3++;
                  var3++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    public final void a(int param0) {
        jaggl.OpenGL.glFramebufferRenderbufferEXT(((kf) this).field_z, ((kf) this).field_r, 36161, 0);
        int var2 = -8 % ((44 - param0) / 58);
        ((kf) this).field_z = -1;
        ((kf) this).field_r = -1;
    }

    protected final void finalize() throws Throwable {
        ((kf) this).g(-125);
        super.finalize();
    }

    public static void e(int param0) {
        if (param0 != -21057) {
          field_w = null;
          field_w = null;
          field_v = null;
          field_u = null;
          field_t = null;
          return;
        } else {
          field_w = null;
          field_v = null;
          field_u = null;
          field_t = null;
          return;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        Object var3 = null;
        if (param1 != 38) {
          L0: {
            var3 = null;
            String discarded$2 = kf.a((CharSequence) null, (byte) -40);
            var2 = td.a(-29275, vo.a(param0, 7441));
            if (var2 != null) {
              break L0;
            } else {
              var2 = "";
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            var2 = td.a(-29275, vo.a(param0, 7441));
            if (var2 != null) {
              break L1;
            } else {
              var2 = "";
              break L1;
            }
          }
          return var2;
        }
    }

    kf(fr param0, int param1, int param2, int param3) {
        ((kf) this).field_r = -1;
        ((kf) this).field_z = -1;
        ((kf) this).field_C = param0;
        ((kf) this).field_x = param3;
        ((kf) this).field_A = param2;
        ((kf) this).field_D = param1;
        jaggl.OpenGL.glGenRenderbuffersEXT(1, pj.field_q, 0);
        ((kf) this).field_y = pj.field_q[0];
        jaggl.OpenGL.glBindRenderbufferEXT(36161, ((kf) this).field_y);
        jaggl.OpenGL.glRenderbufferStorageEXT(36161, ((kf) this).field_D, ((kf) this).field_A, ((kf) this).field_x);
        ((kf) this).field_s = ((kf) this).field_A * (((kf) this).field_x * ((kf) this).field_C.d(((kf) this).field_D, -72));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Achievements";
    }
}
