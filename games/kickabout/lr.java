/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
            field_o = (String) null;
        }
    }

    final void e(int param0) {
        String var2_ref_String = null;
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
          this.c(param0 ^ 106);
          this.a(false, tl.field_b);
          if (!this.field_a.field_C.field_i[this.field_h]) {
            L1: {
              if ((this.field_g ^ -1) == 1) {
                break L1;
              } else {
                if (this.field_g == this.field_a.b((byte) -89, this.field_h)) {
                  var3_int = 0;
                  var4 = 0;
                  L2: while (true) {
                    if (var4 >= this.field_a.field_I) {
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
                      var2_ref_String = stackIn_14_0;
                      break L0;
                    } else {
                      if (this.field_a.field_g[var4].field_p == this.field_h) {
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
            var2_ref_String = br.field_b;
            break L0;
          } else {
            var2_ref_String = cb.field_a;
            break L0;
          }
        }
        L4: {
          if (!this.e(0, 50)) {
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
          var4 = 8 + pb.field_C.c(var2_ref_String, 185, 16);
          var5 = -33 + (-var4 + this.c(342, 0));
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
        int discarded$1 = pb.field_C.a(var2_ref_String, 400, var5 + 8, 185, var6, 16777215, -1, param0, 0, 16);
        this.d(param0 + -95);
        this.b(param0 ^ -2352, this.field_a.field_v);
        var2 = this.field_a.field_C.field_k[this.field_h];
        on.a(220, 332, 150, 26, 8, 65793, 128);
        var3 = df.field_F[var2].toLowerCase();
        un.field_d.d(var3, 293, 351, 16777215, -1);
        qj.field_f.c(220, 100);
        var4 = 0;
        L6: while (true) {
          if (4 <= var4) {
            L7: {
              if (!this.e(0, param0 + 49)) {
                break L7;
              } else {
                this.field_k.a(102, false);
                this.field_p.a(param0 + 126, false);
                break L7;
              }
            }
            L8: {
              var4 = 110;
              var5 = 230;
              if (-2 == this.field_g) {
                break L8;
              } else {
                if (-2 != (this.field_a.field_g[this.field_g].field_p ^ -1)) {
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
              this.a(0, var4, (byte) -107, 30);
              this.a(1, var5, (byte) -78, 30);
              if (!this.field_a.field_f) {
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
        super(param0, param1, param2, new int[]{41});
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            this.field_c[0] = new io(-4, 7126504, 41);
            this.field_k = eo.a(false);
            this.field_p = eo.a(true);
            var4_int = this.field_k.field_N.field_o;
            var5 = this.field_k.field_N.field_v;
            this.field_k.field_s = -3 + -var4_int + (this.d(127, 0) - (this.field_c[0].field_d >> 1581249185));
            this.field_k.field_J = this.c(342, 0) + -(var5 >> -1956076351);
            this.field_p.field_s = 3 + this.d(117, 0) - -(this.field_c[0].field_d >> 1388416225);
            this.field_p.field_J = this.c(342, 0) - (var5 >> 1064156961);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var4);
            stackOut_3_1 = new StringBuilder().append("lr.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.removeKeyListener(nr.field_q);
            if (param1 >= -3) {
                field_s = (String) null;
            }
            param0.removeFocusListener(nr.field_q);
            rc.field_d = -1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "lr.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void f(int param0) {
        field_s = null;
        field_n = (boolean[][]) null;
        field_o = null;
        if (param0 != -15640) {
            java.awt.Component var2 = (java.awt.Component) null;
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
        if (this.field_g == -2) {
          return false;
        } else {
          var3 = this.field_a.field_g[this.field_g].field_p;
          if (this.field_a.b((byte) -71, this.field_a.field_g[this.field_g].field_p) != this.field_g) {
            return false;
          } else {
            if (!this.field_a.field_C.field_i[var3]) {
              L0: {
                var4 = this.field_a.field_C.field_k[this.field_a.field_g[this.field_g].field_p];
                if (param1 == 50) {
                  break L0;
                } else {
                  field_s = (String) null;
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
        int discarded$0 = 0;
        if (param0 >= -92) {
            discarded$0 = this.c(-63, 11);
        }
        super.a(-124, param1);
        if (-2 != this.field_g) {
            this.field_k.field_lb = this.e(1, 50);
            this.field_p.field_lb = this.e(2, 50);
            this.field_k.b(0, param1);
            this.field_p.b(0, param1);
            if (!(this.field_k.field_sb == 0)) {
                kj.a((byte) -121);
                this.g(8, 0);
            }
            if (this.field_p.field_sb != 0) {
                kj.a((byte) 49);
                this.g(8, 1);
            }
        }
    }

    private final void g(int param0, int param1) {
        boolean discarded$0 = false;
        this.field_a.a(mf.a(param1, this.field_g, (byte) 0), param0 ^ -127);
        if (!(!this.field_f)) {
            or.field_d.b(73, (byte) 112);
            or.field_d.a(param0 ^ 96, param1);
        }
        if (param0 != 8) {
            discarded$0 = this.e(29, 11);
        }
    }

    final int c(int param0, int param1) {
        if (param0 != 342) {
            field_n = (boolean[][]) null;
        }
        return 224;
    }

    final int d(int param0, int param1) {
        if (param0 <= 106) {
            this.field_p = (hd) null;
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
        field_l = "won";
        field_o = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_n = new boolean[][]{new boolean[]{false, false, false}, new boolean[]{false, true}, new boolean[]{false, true}, new boolean[]{false, true}};
        field_s = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_j = "beach";
    }
}
