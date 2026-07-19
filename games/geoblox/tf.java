/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static int field_f;
    hf field_a;
    static al field_d;
    private hf field_c;
    private static int[] field_b;
    static String[] field_e;

    final hf d(int param0) {
        if (param0 != 1) {
            return (hf) null;
        }
        hf var2 = this.field_c;
        if (!(this.field_a != var2)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_b;
        return var2;
    }

    final static dm[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 <= 90) {
            field_d = (al) null;
        }
        return n.a(param4, 1, param3, 3, (byte) 1, param1, param0, 1, 1);
    }

    final hf g(int param0) {
        hf var2 = this.field_a.field_b;
        if (this.field_a == var2) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_b;
        if (param0 != 0) {
            field_f = -122;
        }
        return var2;
    }

    final static void a(int param0, int param1) {
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        boolean discarded$10 = false;
        boolean discarded$11 = false;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Geoblox.field_C;
          if (null == kf.field_c) {
            break L0;
          } else {
            if (!ag.field_j[param1]) {
              L1: {
                var2 = param1;
                if (-5 != (var2 ^ -1)) {
                  if (3 != var2) {
                    if (-1 != (var2 ^ -1)) {
                      if (6 != var2) {
                        if (5 == var2) {
                          k.field_f = rf.a(kf.field_c, "", "sport");
                          discarded$6 = uh.field_y.a(te.field_c, 0, -1, k.field_f, sl.field_l);
                          break L1;
                        } else {
                          if (2 == var2) {
                            j.field_ib = rf.a(kf.field_c, "", "sweets");
                            discarded$7 = uh.field_y.a(te.field_c, 0, -1, j.field_ib, sl.field_l);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        wf.field_o = rf.a(kf.field_c, "", "space");
                        discarded$8 = uh.field_y.a(te.field_c, 0, -1, wf.field_o, sl.field_l);
                        break L1;
                      }
                    } else {
                      ej.field_d = rf.a(kf.field_c, "", "jewellery");
                      discarded$9 = uh.field_y.a(te.field_c, 0, -1, ej.field_d, sl.field_l);
                      break L1;
                    }
                  } else {
                    te.field_b = rf.a(kf.field_c, "", "germs");
                    discarded$10 = uh.field_y.a(te.field_c, 0, -1, te.field_b, sl.field_l);
                    break L1;
                  }
                } else {
                  qb.field_M = rf.a(kf.field_c, "", "baking");
                  discarded$11 = uh.field_y.a(te.field_c, 0, -1, qb.field_M, sl.field_l);
                  break L1;
                }
              }
              L2: {
                ag.field_j[param1] = true;
                if (param0 > 110) {
                  break L2;
                } else {
                  field_f = 13;
                  break L2;
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final static boolean a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 > 65) {
          L0: {
            L1: {
              if (oh.field_b == null) {
                break L1;
              } else {
                if (oh.field_b.j(75) == null) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    public static void f(int param0) {
        dm[] discarded$0 = null;
        field_b = null;
        if (param0 != 51) {
            discarded$0 = tf.a(-67, 123, -7, 36, 22);
        }
        field_d = null;
        field_e = null;
    }

    final hf b(int param0) {
        hf var2 = this.field_c;
        if (param0 != 0) {
            return (hf) null;
        }
        if (var2 == this.field_a) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_c;
        return var2;
    }

    final hf b(byte param0) {
        hf discarded$0 = null;
        hf var2 = this.field_a.field_b;
        if (param0 >= -94) {
            discarded$0 = this.b((byte) 113);
        }
        if (this.field_a == var2) {
            return null;
        }
        var2.a(false);
        return var2;
    }

    final void a(hf param0, boolean param1) {
        try {
            if (param0.field_c != null) {
                param0.a(false);
            }
            param0.field_b = this.field_a.field_b;
            param0.field_c = this.field_a;
            param0.field_c.field_b = param0;
            if (param1) {
                field_b = (int[]) null;
            }
            param0.field_b.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "tf.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(tf param0, byte param1) {
        RuntimeException runtimeException = null;
        hf var4 = null;
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
            L1: {
              this.a(param0, 2541, this.field_a.field_b);
              if (param1 == -70) {
                break L1;
              } else {
                var4 = (hf) null;
                this.a(52, (hf) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("tf.I(");
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
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final int a(int param0) {
        int var5 = Geoblox.field_C;
        int var2 = 0;
        hf var3 = this.field_a.field_b;
        while (this.field_a != var3) {
            var3 = var3.field_b;
            var2++;
        }
        int var4 = -98 / ((param0 - 2) / 51);
        return var2;
    }

    final hf e(int param0) {
        if (param0 != 1) {
            this.field_a = (hf) null;
        }
        hf var2 = this.field_a.field_c;
        if (var2 == this.field_a) {
            return null;
        }
        var2.a(false);
        return var2;
    }

    final void c(byte param0) {
        hf var2 = null;
        int var3 = Geoblox.field_C;
        while (true) {
            var2 = this.field_a.field_b;
            if (var2 == this.field_a) {
                break;
            }
            var2.a(false);
        }
        this.field_c = null;
        if (param0 >= -64) {
            tf.f(113);
        }
    }

    final hf a(boolean param0) {
        if (param0) {
            return (hf) null;
        }
        hf var2 = this.field_a.field_c;
        if (!(this.field_a != var2)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_c;
        return var2;
    }

    final boolean c(int param0) {
        if (param0 != 13519) {
            this.field_c = (hf) null;
        }
        return this.field_a == this.field_a.field_b ? true : false;
    }

    private final void a(tf param0, int param1, hf param2) {
        hf discarded$2 = null;
        hf var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var4 = this.field_a.field_c;
              this.field_a.field_c = param2.field_c;
              param2.field_c.field_b = this.field_a;
              if (this.field_a == param2) {
                break L1;
              } else {
                param2.field_c = param0.field_a.field_c;
                param2.field_c.field_b = param2;
                param0.field_a.field_c = var4;
                var4.field_b = param0.field_a;
                break L1;
              }
            }
            L2: {
              if (param1 == 2541) {
                break L2;
              } else {
                discarded$2 = this.e(-82);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4_ref);
            stackOut_5_1 = new StringBuilder().append("tf.J(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          L4: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public tf() {
        this.field_a = new hf();
        this.field_a.field_b = this.field_a;
        this.field_a.field_c = this.field_a;
    }

    final void a(int param0, hf param1) {
        try {
            if (null != param1.field_c) {
                param1.a(false);
            }
            param1.field_c = this.field_a.field_c;
            if (param0 >= -33) {
                this.field_a = (hf) null;
            }
            param1.field_b = this.field_a;
            param1.field_c.field_b = param1;
            param1.field_b.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "tf.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit: {
            tf discarded$1 = null;
            int var0 = 0;
            field_f = 5;
            field_d = new al();
            field_e = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
            field_b = new int[5];
            var0 = 0;
            L0: while (true) {
              if (var0 >= field_b.length) {
                discarded$1 = new tf();
                break $cfr$clinit;
              } else {
                L1: {
                  if (var0 == 0) {
                    field_b[var0] = (1 + var0) * 20 << -1110765784;
                    break L1;
                  } else {
                    field_b[var0] = (1 + var0) * 51 << 1294033512;
                    break L1;
                  }
                }
                if (var0 > 2) {
                  field_b[var0] = lb.a(field_b[var0], (-2 + var0) * 22 << 316724240);
                  var0++;
                  continue L0;
                } else {
                  var0++;
                  continue L0;
                }
              }
            }
        }
    }
}
