/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends hd {
    private il[] field_s;
    static String field_q;
    static id[] field_u;
    static int[] field_r;
    private il field_t;
    static og field_w;
    static int field_v;

    final void a(int param0, int param1, hl[] param2) {
        int var4 = param1;
        if (!(null != ((w) this).field_s[var4])) {
            ((w) this).field_s[var4] = new il();
        }
        if (param0 != 4) {
            field_u = null;
        }
        ((w) this).field_s[param1].field_c = param2;
    }

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        int var7 = 0;
        il var8 = null;
        il var10 = null;
        dk var11 = null;
        il var12 = null;
        il var13 = null;
        il var14 = null;
        il var15 = null;
        uj stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        uj stackOut_1_0 = null;
        L0: {
          if (!(param4 instanceof dk)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (uj) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (uj) param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (dk) (Object) stackIn_3_0;
          cl.a(true, param4.field_f + param4.field_j + param3, param0 + param4.field_s, param3 + param4.field_j, param4.field_i + (param4.field_s + param0));
          if (var11 == null) {
            break L1;
          } else {
            param1 = param1 & var11.field_u;
            break L1;
          }
        }
        L2: {
          var7 = 121 / ((param2 - 2) / 54);
          var8 = ((w) this).field_s[0];
          ((w) this).field_t.a(30644);
          var8.a(((w) this).field_t, param0, param3, param4, -1, (w) this);
          if (var11 == null) {
            break L2;
          } else {
            L3: {
              if (!var11.field_z) {
                break L3;
              } else {
                var12 = ((w) this).field_s[1];
                if (var12 == null) {
                  break L3;
                } else {
                  var12.a(((w) this).field_t, param0, param3, param4, -1, (w) this);
                  break L3;
                }
              }
            }
            if (!var11.field_h) {
              break L2;
            } else {
              L4: {
                var13 = ((w) this).field_s[3];
                if (var11.field_l == 0) {
                  break L4;
                } else {
                  if (var13 != null) {
                    var13.a(((w) this).field_t, param0, param3, param4, -1, (w) this);
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var10 = ((w) this).field_s[2];
              if (var10 == null) {
                break L2;
              } else {
                var10.a(((w) this).field_t, param0, param3, param4, -1, (w) this);
                break L2;
              }
            }
          }
        }
        L5: {
          if (!param4.d(true)) {
            break L5;
          } else {
            var14 = ((w) this).field_s[5];
            if (var14 != null) {
              var14.a(((w) this).field_t, param0, param3, param4, -1, (w) this);
              break L5;
            } else {
              break L5;
            }
          }
        }
        L6: {
          if (!param1) {
            var15 = ((w) this).field_s[4];
            if (var15 != null) {
              var15.a(((w) this).field_t, param0, param3, param4, -1, (w) this);
              break L6;
            } else {
              break L6;
            }
          } else {
            break L6;
          }
        }
        ((w) this).field_t.a(param0, 56, param3, (w) this, param4);
        wf.a(-107);
    }

    final il a(int param0, byte param1) {
        if (param1 != -76) {
            w.b(-56);
        }
        ((w) this).field_s[param0] = new il();
        return new il();
    }

    private final void a(int param0, w param1, boolean param2) {
        int var4 = 0;
        il var5 = null;
        il var6 = null;
        int var7 = 0;
        Object var8 = null;
        il stackIn_9_0 = null;
        il stackIn_10_0 = null;
        il stackIn_11_0 = null;
        il stackIn_11_1 = null;
        il stackOut_8_0 = null;
        il stackOut_10_0 = null;
        il stackOut_10_1 = null;
        il stackOut_9_0 = null;
        il stackOut_9_1 = null;
        L0: {
          var7 = StarCannon.field_A;
          super.a(-71, (hd) (Object) param1);
          if (param0 == 6) {
            break L0;
          } else {
            var8 = null;
            ((w) this).a(77, (hl) null);
            break L0;
          }
        }
        L1: {
          if (param2) {
            var4 = 0;
            L2: while (true) {
              if (-7 >= (var4 ^ -1)) {
                break L1;
              } else {
                var5 = ((w) this).field_s[var4];
                if (var5 != null) {
                  L3: {
                    var6 = param1.field_s[var4];
                    stackOut_8_0 = (il) var5;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (var6 == null) {
                      param1.field_s[var4] = new il();
                      stackOut_10_0 = (il) (Object) stackIn_10_0;
                      stackOut_10_1 = new il();
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      break L3;
                    } else {
                      stackOut_9_0 = (il) (Object) stackIn_9_0;
                      stackOut_9_1 = (il) var6;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      break L3;
                    }
                  }
                  ((il) (Object) stackIn_11_0).a(stackIn_11_1, -2147483648);
                  var4++;
                  continue L2;
                } else {
                  param1.field_s[var4] = null;
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            ug.a((Object[]) (Object) ((w) this).field_s, 0, (Object[]) (Object) param1.field_s, 0, 6);
            break L1;
          }
        }
    }

    w(w param0, boolean param1) {
        this();
        param0.a(6, (w) this, param1);
    }

    public static void b(int param0) {
        if (param0 != 3) {
            return;
        }
        field_w = null;
        field_r = null;
        field_u = null;
        field_q = null;
    }

    final static void b(byte param0) {
        int var1 = 0;
        if (param0 != 14) {
            return;
        }
        s.field_c = false;
        sg.field_n = null;
        if (!tc.field_x) {
            var1 = jj.field_F;
            if ((var1 ^ -1) < -1) {
                if ((var1 ^ -1) == -2) {
                    sg.field_n = of.field_j;
                } else {
                    sg.field_n = fb.a(dk.field_x, 127, new String[1]);
                }
                sg.field_n = rg.a(true, new CharSequence[3]);
            }
            fa.field_G.n(3);
            ea.a(-101);
        } else {
            fa.field_G.o(param0 + 109);
        }
    }

    public w() {
        ((w) this).field_s = new il[6];
        ((w) this).field_t = new il();
        ((w) this).field_s[0] = new il();
        il var1 = new il();
        var1.a(30644);
    }

    final static void a(String param0, byte param1, boolean param2, float param3) {
        if (param1 != 86) {
            return;
        }
        if (!(ve.field_f != null)) {
            ve.field_f = new lf(ti.field_b, sg.field_n);
            ti.field_b.a((byte) 93, (uj) (Object) ve.field_f);
        }
        ve.field_f.a(param0, param2, param3, true);
        ki.b();
        wa.a(true, true);
    }

    final void a(byte param0, hl[] param1) {
        il[] var3 = null;
        int var4 = 0;
        il var5 = null;
        int var6 = 0;
        L0: {
          var6 = StarCannon.field_A;
          var3 = ((w) this).field_s;
          var4 = 0;
          if (param0 == 68) {
            break L0;
          } else {
            il discarded$2 = ((w) this).a(73, (byte) -45);
            break L0;
          }
        }
        L1: while (true) {
          if (var4 >= var3.length) {
            return;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var5.field_c = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, hl param1) {
        il[] var3 = null;
        int var4 = 0;
        il var5 = null;
        int var6 = 0;
        L0: {
          var6 = StarCannon.field_A;
          var3 = ((w) this).field_s;
          var4 = 0;
          if (param0 <= -12) {
            break L0;
          } else {
            field_r = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3.length <= var4) {
            return;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var5.field_d = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Service unavailable";
        rk discarded$0 = new rk();
        field_w = new og();
    }
}
