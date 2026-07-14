/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class lr extends hs {
    static String field_l;
    static int field_m;
    private hd field_p;
    static int field_r;
    static String field_s;
    private hd field_k;
    static boolean[][] field_n;
    static String field_o;
    static int field_q;
    static String field_j;

    final static void b(byte param0) {
        if (!(null == op.field_y)) {
            op.field_y.a(1);
            op.field_y = null;
        }
        if (param0 != -116) {
            field_o = null;
        }
    }

    final void e(int param0) {
        String var2_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String stackIn_14_0 = null;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        String stackOut_13_0 = null;
        String stackOut_12_0 = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        L0: {
          var7 = Kickabout.field_G;
          ((lr) this).c(param0 ^ 106);
          ((lr) this).a(false, tl.field_b);
          if (!((lr) this).field_a.field_C.field_i[((lr) this).field_h]) {
            L1: {
              if ((((lr) this).field_g ^ -1) == 1) {
                break L1;
              } else {
                if (((lr) this).field_g == ((lr) this).field_a.b((byte) -89, ((lr) this).field_h)) {
                  var3_int = 0;
                  var4 = 0;
                  L2: while (true) {
                    if (var4 >= ((lr) this).field_a.field_I) {
                      L3: {
                        if (-2 > (var3_int ^ -1)) {
                          stackOut_13_0 = b.field_J;
                          stackIn_14_0 = stackOut_13_0;
                          break L3;
                        } else {
                          stackOut_12_0 = fr.field_I;
                          stackIn_14_0 = stackOut_12_0;
                          break L3;
                        }
                      }
                      var2_ref = stackIn_14_0;
                      break L0;
                    } else {
                      if (((lr) this).field_a.field_g[var4].field_p == ((lr) this).field_h) {
                        var3_int++;
                        var4++;
                        continue L2;
                      } else {
                        var4++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            var2_ref = br.field_b;
            break L0;
          } else {
            var2_ref = cb.field_a;
            break L0;
          }
        }
        L4: {
          if (!((lr) this).e(0, 50)) {
            stackOut_17_0 = 0;
            stackIn_18_0 = stackOut_17_0;
            break L4;
          } else {
            stackOut_16_0 = 1;
            stackIn_18_0 = stackOut_16_0;
            break L4;
          }
        }
        L5: {
          var3_int = stackIn_18_0;
          var4 = 8 + pb.field_C.c(var2_ref, 185, 16);
          var5 = -33 + (-var4 + ((lr) this).c(342, 0));
          stackOut_18_0 = 10 + var4;
          stackIn_20_0 = stackOut_18_0;
          stackIn_19_0 = stackOut_18_0;
          if (var3_int == 0) {
            stackOut_20_0 = stackIn_20_0;
            stackOut_20_1 = 0;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            break L5;
          } else {
            stackOut_19_0 = stackIn_19_0;
            stackOut_19_1 = 60;
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            break L5;
          }
        }
        var6 = stackIn_21_0 + stackIn_21_1;
        on.f(390, var5, 205, var6, 10, 983040);
        on.a(390, var5, 205, var6, 10, 65793, 140);
        int discarded$1 = pb.field_C.a(var2_ref, 400, var5 + 8, 185, var6, 16777215, -1, param0, 0, 16);
        ((lr) this).d(param0 + -95);
        ((lr) this).b(param0 ^ -2352, ((lr) this).field_a.field_v);
        var2 = ((lr) this).field_a.field_C.field_k[((lr) this).field_h];
        on.a(220, 332, 150, 26, 8, 65793, 128);
        var3 = df.field_F[var2].toLowerCase();
        un.field_d.d(var3, 293, 351, 16777215, -1);
        qj.field_f.c(220, 100);
        var4 = 0;
        L6: while (true) {
          if (4 <= var4) {
            L7: {
              if (!((lr) this).e(0, param0 + 49)) {
                break L7;
              } else {
                ((lr) this).field_k.a(102, false);
                ((lr) this).field_p.a(param0 + 126, false);
                break L7;
              }
            }
            L8: {
              var4 = 110;
              var5 = 230;
              if (-2 == ((lr) this).field_g) {
                break L8;
              } else {
                if (-2 != (((lr) this).field_a.field_g[((lr) this).field_g].field_p ^ -1)) {
                  break L8;
                } else {
                  var6 = var4;
                  var4 = var5;
                  var5 = var6;
                  break L8;
                }
              }
            }
            L9: {
              ((lr) this).a(0, var4, (byte) -107, 30);
              ((lr) this).a(1, var5, (byte) -78, 30);
              if (!((lr) this).field_a.field_f) {
                break L9;
              } else {
                un.field_d.a("FB", 5, 17, 16777215, -1);
                break L9;
              }
            }
            return;
          } else {
            var5 = -(es.field_f.field_o >> 62423617) + 147 * ws.field_b[var2][var4] / 896 + 220;
            var6 = -(es.field_f.field_v >> 1423849377) + ws.field_d[var2][var4] * 220 / 1344 + 100;
            es.field_f.c(var5, var6);
            var4++;
            continue L6;
          }
        }
    }

    lr(nu param0, int param1, boolean param2) {
        super(param0, param1, param2, new int[1]);
        ((lr) this).field_c[0] = new io(-4, 7126504, 41);
        ((lr) this).field_k = eo.a(false);
        ((lr) this).field_p = eo.a(true);
        int var4 = ((lr) this).field_k.field_N.field_o;
        int var5 = ((lr) this).field_k.field_N.field_v;
        ((lr) this).field_k.field_s = -3 + -var4 + (((lr) this).d(127, 0) - (((lr) this).field_c[0].field_d >> 1581249185));
        ((lr) this).field_k.field_J = ((lr) this).c(342, 0) + -(var5 >> -1956076351);
        ((lr) this).field_p.field_s = 3 + ((lr) this).d(117, 0) - -(((lr) this).field_c[0].field_d >> 1388416225);
        ((lr) this).field_p.field_J = ((lr) this).c(342, 0) - (var5 >> 1064156961);
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) nr.field_q);
        if (param1 >= -3) {
            field_s = null;
        }
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) nr.field_q);
        rc.field_d = -1;
    }

    public static void f(int param0) {
        field_s = null;
        field_n = null;
        field_o = null;
        if (param0 != -15640) {
            Object var2 = null;
            lr.a((java.awt.Component) null, 101);
        }
        field_j = null;
        field_l = null;
    }

    final boolean e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        if (((lr) this).field_g == -2) {
          return false;
        } else {
          var3 = ((lr) this).field_a.field_g[((lr) this).field_g].field_p;
          if (((lr) this).field_a.b((byte) -71, ((lr) this).field_a.field_g[((lr) this).field_g].field_p) != ((lr) this).field_g) {
            return false;
          } else {
            if (!((lr) this).field_a.field_C.field_i[var3]) {
              L0: {
                var4 = ((lr) this).field_a.field_C.field_k[((lr) this).field_a.field_g[((lr) this).field_g].field_p];
                if (param1 == 50) {
                  break L0;
                } else {
                  field_s = null;
                  break L0;
                }
              }
              L1: {
                L2: {
                  L3: {
                    if (1 != param0) {
                      break L3;
                    } else {
                      if (-1 == (var4 ^ -1)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (param0 != 2) {
                    return true;
                  } else {
                    if (var4 == ws.field_b.length + -1) {
                      break L2;
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L1;
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L1;
              }
              return stackIn_16_0 != 0;
            } else {
              return false;
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 >= -92) {
            int discarded$0 = ((lr) this).c(-63, 11);
        }
        super.a(-124, param1);
        if (-2 != ((lr) this).field_g) {
            ((lr) this).field_k.field_lb = ((lr) this).e(1, 50);
            ((lr) this).field_p.field_lb = ((lr) this).e(2, 50);
            ((lr) this).field_k.b(0, param1);
            ((lr) this).field_p.b(0, param1);
            if (!(((lr) this).field_k.field_sb == 0)) {
                kj.a((byte) -121);
                this.g(8, 0);
            }
            if (((lr) this).field_p.field_sb != 0) {
                kj.a((byte) 49);
                this.g(8, 1);
            }
        }
    }

    private final void g(int param0, int param1) {
        ((lr) this).field_a.a(mf.a(param1, ((lr) this).field_g, (byte) 0), param0 ^ -127);
        if (!(!((lr) this).field_f)) {
            or.field_d.b(73, (byte) 112);
            or.field_d.a(param0 ^ 96, param1);
        }
        if (param0 != 8) {
            boolean discarded$0 = ((lr) this).e(29, 11);
        }
    }

    final int c(int param0, int param1) {
        if (param0 != 342) {
            field_n = null;
        }
        return 224;
    }

    final int d(int param0, int param1) {
        if (param0 <= 106) {
            ((lr) this).field_p = null;
        }
        return 493;
    }

    final void f(int param0, int param1) {
        if (param0 <= 98) {
            return;
        }
        if (-42 == (param1 ^ -1)) {
            this.g(8, 2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "won";
        field_o = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_n = new boolean[][]{new boolean[3], new boolean[2], new boolean[2], new boolean[2]};
        field_s = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_j = "beach";
    }
}
