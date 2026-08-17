/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends bi implements df {
    private lj field_P;
    static int field_U;
    static qj field_T;
    static kk field_V;
    static hi field_Q;
    static boolean field_S;
    static String field_W;
    static int field_R;

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        lj discarded$1 = null;
        RuntimeException var6 = null;
        ma var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 17) {
                break L1;
              } else {
                var7 = (ma) null;
                discarded$1 = this.a((String) null, (ma) null, 33);
                break L1;
              }
            }
            if (param0 != this.field_P) {
              break L0;
            } else {
              this.r(param1 + -28606);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("ll.MA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void q(int param0) {
        field_V = null;
        field_Q = null;
        field_W = null;
        if (param0 != 5) {
            return;
        }
        field_T = null;
    }

    final static int s(int param0) {
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!pc.b(-10)) {
                L2: {
                  bk.field_c.a(-112, tl.a(196077633, ol.field_b, nk.field_c), tl.a(196077633, oa.field_j, bk.field_a));
                  if (bk.field_c.b(31552)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if ((bk.field_c.field_d ^ -1) > -1) {
                        break L4;
                      } else {
                        var3 = uj.field_d[bk.field_c.field_d];
                        if (-3 == (var3 ^ -1)) {
                          i.a(false);
                          break L3;
                        } else {
                          if ((var3 ^ -1) != -6) {
                            break L3;
                          } else {
                            i.a(false);
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if ((q.field_a ^ -1) == -3) {
                      break L3;
                    } else {
                      i.a(false);
                      break L3;
                    }
                  }
                }
                L5: {
                  if (param0 >= 107) {
                    break L5;
                  } else {
                    field_W = (String) null;
                    break L5;
                  }
                }
                L6: {
                  if (0 != var3) {
                    break L6;
                  } else {
                    if (-3 == (q.field_a ^ -1)) {
                      var4 = -c.field_c + lk.a(0);
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (var6 > 0) {
                        break L6;
                      } else {
                        tf.a((byte) 79, true, 5);
                        var3 = 2;
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                stackIn_29_0 = var3;
                break L0;
              } else {
                L7: {
                  bk.field_c.d((byte) -6);
                  if (!bk.field_c.b(31552)) {
                    break L7;
                  } else {
                    var1_int = 1;
                    break L7;
                  }
                }
                if (-14 == (ch.field_d ^ -1)) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "ll.AA(" + param0 + ')');
        }
        return stackIn_29_0;
    }

    private final void r(int param0) {
        if (!this.field_A) {
          return;
        } else {
          if (param0 != -28589) {
            ll.s(109);
            this.field_A = false;
            return;
          } else {
            this.field_A = false;
            return;
          }
        }
    }

    ll(da param0, sh param1) {
        super(param0, 200, 150);
        Object var3 = null;
        qg var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param1 != ni.field_o) {
                if (fi.field_w == param1) {
                  this.field_h = this.field_h + 10;
                  var3 = n.field_b;
                  if (!hi.b(-106)) {
                    break L1;
                  } else {
                    this.field_h = this.field_h + 20;
                    var3 = lk.field_a;
                    break L1;
                  }
                } else {
                  if (ge.field_A != param1) {
                    break L1;
                  } else {
                    var3 = dg.field_e;
                    this.field_h = this.field_h + 30;
                    break L1;
                  }
                }
              } else {
                var3 = nh.field_m;
                break L1;
              }
            }
            var4 = new qg((String) (var3), (ma) null);
            var4.field_l = this.field_l;
            var4.field_p = 0;
            var4.field_h = 80;
            var4.field_n = 50;
            var4.field_q = (ui) ((Object) new h(al.field_i, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a(var4, (byte) -82);
            this.field_P = this.a(oe.field_a, (ma) (this), -3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("ll.<init>(");

            if (param0 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    private final lj a(String param0, ma param1, int param2) {
        lj discarded$1 = null;
        lj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ma var6 = null;
        lj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new lj(param0, param1);
              var4.field_q = (ui) ((Object) new qa());
              var5 = -6 + this.field_h;
              this.field_h = this.field_h + 38;
              var4.a(-91, var5, 15, -14 + (this.field_l - 16), 30);
              this.a((qg) (var4), (byte) -114);
              if (param2 == -3) {
                break L1;
              } else {
                var6 = (ma) null;
                discarded$1 = this.a((String) null, (ma) null, 24);
                break L1;
              }
            }
            this.c((byte) 69);
            stackIn_3_0 = (lj) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("ll.W(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean c(boolean param0) {
        if (!param0) {
            ll.c(true);
            return ej.field_n;
        }
        return ej.field_n;
    }

    static {
        field_V = null;
        field_T = new qj();
        field_W = "<u>Tutorial: lesson 2<br>A full game has 10 rounds. Reusing tiles causes their value to rise. If you use the bonus tile, it doubles your word score.<br><br>Make a second word, trying to use the bonus tile:<br><img=0>";
        field_R = 0;
        field_Q = new hi();
    }
}
