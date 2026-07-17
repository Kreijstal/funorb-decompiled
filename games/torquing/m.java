/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    static char field_t;
    private int field_s;
    private int field_a;
    private int field_b;
    private int field_m;
    private boolean field_i;
    private hd field_p;
    private int field_e;
    private int field_f;
    private int field_g;
    static int[] field_c;
    private float field_j;
    static boolean[] field_y;
    static int field_l;
    private int field_h;
    private int field_o;
    private int field_x;
    private int field_v;
    static int[] field_q;
    private int field_r;
    private int field_u;
    private int field_k;
    private int field_d;
    static int[] field_w;
    static String[] field_n;

    public static void b() {
        field_q = null;
        field_w = null;
        field_y = null;
        field_n = null;
        field_c = null;
    }

    final void a(byte param0) {
        Object var3 = null;
        if (null == dg.field_i) {
          L0: {
            if (wp.field_w <= 0) {
              ((m) this).field_i = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (((m) this).field_i) {
            L1: {
              if (param0 <= -2) {
                break L1;
              } else {
                var3 = null;
                m.a(112, (java.applet.Applet) null, -10, (String[]) null, -70, 40);
                break L1;
              }
            }
            int fieldTemp$2 = ((m) this).field_o - 1;
            ((m) this).field_o = ((m) this).field_o - 1;
            if (fieldTemp$2 <= 0) {
              ((m) this).field_o = ((m) this).field_m;
              if (df.field_u >= ((m) this).field_d) {
                this.a(true);
                return;
              } else {
                ((m) this).field_i = false;
                return;
              }
            } else {
              return;
            }
          } else {
            L2: {
              if (((m) this).field_x <= wk.field_d) {
                if (((m) this).field_x > 0) {
                  aq.field_d = 0;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                aq.field_d = (((m) this).field_x - wk.field_d) / 2;
                break L2;
              }
            }
            L3: {
              L4: {
                if (wk.field_d != ((m) this).field_f) {
                  break L4;
                } else {
                  if (ul.field_a != ((m) this).field_e) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              ((m) this).field_p.a(((m) this).field_e, -6714, ((m) this).field_f);
              break L3;
            }
            return;
          }
        } else {
          return;
        }
    }

    final boolean c(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -19) {
            break L0;
          } else {
            m.c(120);
            break L0;
          }
        }
        L1: {
          L2: {
            if (df.field_u < ((m) this).field_d) {
              break L2;
            } else {
              if (wp.field_w <= 0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void b(boolean param0) {
        ((m) this).field_p.a(((m) this).field_s, -6714, ((m) this).field_u);
        if (param0) {
            ((m) this).a(-68, false, 25);
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (param1) {
            return;
        }
        ((m) this).field_v = param2;
        ((m) this).field_x = param0;
    }

    final static void c(int param0) {
        fm.a(true, -78, on.field_d, ol.field_a);
        if (param0 >= -51) {
            return;
        }
        nk.field_t = true;
    }

    final pp b(byte param0) {
        if (param0 != -73) {
            ((m) this).field_g = 21;
        }
        ((m) this).field_s = ul.field_a;
        ((m) this).field_u = wk.field_d;
        ((m) this).field_p.a(((m) this).field_b, -6714, ((m) this).field_r);
        b.field_v = false;
        pp var2 = je.a(((m) this).field_r, ((m) this).field_b, nk.field_u, 0, 0, -116);
        if (!(var2 != null)) {
            ((m) this).b(false);
        }
        return var2;
    }

    final static void a(int param0, java.applet.Applet param1, int param2, String[] param3, int param4, int param5) {
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            L1: {
              hc.field_u = param1.getParameter("overxgames");
              if (null != hc.field_u) {
                break L1;
              } else {
                hc.field_u = "0";
                break L1;
              }
            }
            L2: {
              rj.field_y = param1.getParameter("overxachievements");
              if (null != rj.field_y) {
                break L2;
              } else {
                rj.field_y = "0";
                break L2;
              }
            }
            L3: {
              var6 = param1.getParameter("currency");
              if (var6 == null) {
                gj.field_j = 2;
                break L3;
              } else {
                if (!ip.a((byte) -42, (CharSequence) (Object) var6)) {
                  gj.field_j = 2;
                  break L3;
                } else {
                  gj.field_j = kc.a((byte) -84, (CharSequence) (Object) var6);
                  break L3;
                }
              }
            }
            fa.field_c = param0;
            of.field_o = param2;
            ln.field_G = param5;
            ln.field_H = new t[param3.length];
            var7 = param4;
            L4: while (true) {
              if (var7 >= param3.length) {
                ik.field_k = param3;
                break L0;
              } else {
                ln.field_H[var7] = new t(317, 34);
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6_ref;
            stackOut_15_1 = new StringBuilder().append("m.G(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a() {
        ib.field_b = new ki();
        hb.field_x.c((gm) (Object) ib.field_b, 33);
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Torquing.field_u;
        var2 = ((m) this).field_x;
        var3 = ((m) this).field_v;
        if (!((m) this).c((byte) -19)) {
          ((m) this).field_i = false;
          return;
        } else {
          L0: {
            if (var3 <= ((m) this).field_k) {
              if (((m) this).field_g <= var3) {
                break L0;
              } else {
                var3 = ((m) this).field_g;
                break L0;
              }
            } else {
              var3 = ((m) this).field_k;
              break L0;
            }
          }
          L1: {
            if (var2 > ((m) this).field_a) {
              var2 = ((m) this).field_a;
              break L1;
            } else {
              if (var2 >= ((m) this).field_h) {
                break L1;
              } else {
                var2 = ((m) this).field_h;
                break L1;
              }
            }
          }
          L2: {
            if (0.0f >= ((m) this).field_j) {
              break L2;
            } else {
              var4 = (int)(0.5f + ((m) this).field_j * (float)var3);
              if (var2 >= var4) {
                if (var2 <= var4) {
                  break L2;
                } else {
                  var2 = var4;
                  break L2;
                }
              } else {
                var3 = (int)((float)var2 / ((m) this).field_j);
                break L2;
              }
            }
          }
          L3: {
            L4: {
              if (wk.field_d != var2) {
                break L4;
              } else {
                if (var3 != ul.field_a) {
                  break L4;
                } else {
                  break L3;
                }
              }
            }
            ((m) this).field_p.a(var3, -6714, var2);
            break L3;
          }
          L5: {
            if (((m) this).field_x > 0) {
              aq.field_d = (((m) this).field_x + -wk.field_d) / 2;
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    private m() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_c = new int[8192];
        field_l = 2;
        field_q = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 14, 13, 16};
        field_y = new boolean[field_q.length];
        field_w = new int[field_q.length];
        field_y[15] = true;
        field_y[16] = true;
        field_y[14] = true;
        field_y[2] = true;
        field_y[1] = true;
        field_y[12] = true;
        field_y[5] = true;
        field_y[6] = true;
        field_y[7] = true;
        field_y[11] = true;
        field_y[10] = true;
        field_y[3] = true;
        field_y[13] = true;
        for (var0 = 0; field_q.length > var0; var0++) {
            field_w[var0] = -1;
        }
        field_w[16] = 0;
        field_n = new String[]{"<br><col=2>Level exit.</col>", "<col=2>Score bonus.</col> Different colours will award you different scores.", "<col=2>Extra time.</col> Again, different colours give different times.", null, "<col=2>Spikes.</col> These improve your grip and are especially useful on slippery surfaces.", "<col=2>Rotate.</col> This rotates the world by ninety degrees. This could be good<nbsp>... or bad.", "<col=2>Gyroscope.</col> This instantly stops you spinning when you press 'INS' or 'CTRL'. It can be used to brake.", "<col=2>Bomb.</col> These explode on contact. In general, you do not want to hit them.", "<col=2>Shield.</col> Each shield you collect allows you to survive one bomb explosion. Beware: the explosion will still send you flying.", "<col=2>Letters.</col> Collect all eight to spell 'TORQUING' for a big bonus. Some of the letters may prove quite challenging to find.", null, null, null, null, null, null, null, null, "<col=2>Skins.</col> There are eight different skins to collect (one per world). You keep a skin either until you die or complete the world."};
    }
}
