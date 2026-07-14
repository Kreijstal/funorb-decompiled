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
            return null;
        }
        hf var2 = ((tf) this).field_c;
        if (!(((tf) this).field_a != var2)) {
            ((tf) this).field_c = null;
            return null;
        }
        ((tf) this).field_c = var2.field_b;
        return var2;
    }

    final static dm[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 <= 90) {
            field_d = null;
        }
        return n.a(param4, 1, param3, 3, (byte) 1, param1, param0, 1, 1);
    }

    final hf g(int param0) {
        hf var2 = ((tf) this).field_a.field_b;
        if (((tf) this).field_a == var2) {
            ((tf) this).field_c = null;
            return null;
        }
        ((tf) this).field_c = var2.field_b;
        if (param0 != 0) {
            field_f = -122;
        }
        return var2;
    }

    final static void a(int param0, int param1) {
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
                if (-5 != var2) {
                  if (3 != var2) {
                    if (-1 != var2) {
                      if (6 != var2) {
                        if (5 == var2) {
                          k.field_f = rf.a(kf.field_c, "", "sport");
                          boolean discarded$6 = uh.field_y.a(te.field_c, 0, -1, k.field_f, sl.field_l);
                          break L1;
                        } else {
                          if (2 == var2) {
                            j.field_ib = rf.a(kf.field_c, "", "sweets");
                            boolean discarded$7 = uh.field_y.a(te.field_c, 0, -1, j.field_ib, sl.field_l);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        wf.field_o = rf.a(kf.field_c, "", "space");
                        boolean discarded$8 = uh.field_y.a(te.field_c, 0, -1, wf.field_o, sl.field_l);
                        break L1;
                      }
                    } else {
                      ej.field_d = rf.a(kf.field_c, "", "jewellery");
                      boolean discarded$9 = uh.field_y.a(te.field_c, 0, -1, ej.field_d, sl.field_l);
                      break L1;
                    }
                  } else {
                    te.field_b = rf.a(kf.field_c, "", "germs");
                    boolean discarded$10 = uh.field_y.a(te.field_c, 0, -1, te.field_b, sl.field_l);
                    break L1;
                  }
                } else {
                  qb.field_M = rf.a(kf.field_c, "", "baking");
                  boolean discarded$11 = uh.field_y.a(te.field_c, 0, -1, qb.field_M, sl.field_l);
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
        field_b = null;
        if (param0 != 51) {
            dm[] discarded$0 = tf.a(-67, 123, -7, 36, 22);
        }
        field_d = null;
        field_e = null;
    }

    final hf b(int param0) {
        hf var2 = ((tf) this).field_c;
        if (param0 != 0) {
            return null;
        }
        if (var2 == ((tf) this).field_a) {
            ((tf) this).field_c = null;
            return null;
        }
        ((tf) this).field_c = var2.field_c;
        return var2;
    }

    final hf b(byte param0) {
        hf var2 = ((tf) this).field_a.field_b;
        if (param0 >= -94) {
            hf discarded$0 = ((tf) this).b((byte) 113);
        }
        if (((tf) this).field_a == var2) {
            return null;
        }
        var2.a(false);
        return var2;
    }

    final void a(hf param0, boolean param1) {
        if (param0.field_c != null) {
            param0.a(false);
        }
        param0.field_b = ((tf) this).field_a.field_b;
        param0.field_c = ((tf) this).field_a;
        param0.field_c.field_b = param0;
        if (param1) {
            field_b = null;
        }
        param0.field_b.field_c = param0;
    }

    final void a(tf param0, byte param1) {
        this.a(param0, 2541, ((tf) this).field_a.field_b);
        if (param1 != -70) {
            Object var4 = null;
            ((tf) this).a(52, (hf) null);
        }
    }

    final int a(int param0) {
        int var5 = Geoblox.field_C;
        int var2 = 0;
        hf var3 = ((tf) this).field_a.field_b;
        while (((tf) this).field_a != var3) {
            var3 = var3.field_b;
            var2++;
        }
        int var4 = -98 / ((param0 - 2) / 51);
        return var2;
    }

    final hf e(int param0) {
        if (param0 != 1) {
            ((tf) this).field_a = null;
        }
        hf var2 = ((tf) this).field_a.field_c;
        if (var2 == ((tf) this).field_a) {
            return null;
        }
        var2.a(false);
        return var2;
    }

    final void c(byte param0) {
        hf var2 = null;
        int var3 = Geoblox.field_C;
        while (true) {
            var2 = ((tf) this).field_a.field_b;
            if (var2 == ((tf) this).field_a) {
                break;
            }
            var2.a(false);
        }
        ((tf) this).field_c = null;
        if (param0 >= -64) {
            tf.f(113);
        }
    }

    final hf a(boolean param0) {
        if (param0) {
            return null;
        }
        hf var2 = ((tf) this).field_a.field_c;
        if (!(((tf) this).field_a != var2)) {
            ((tf) this).field_c = null;
            return null;
        }
        ((tf) this).field_c = var2.field_c;
        return var2;
    }

    final boolean c(int param0) {
        if (param0 != 13519) {
            ((tf) this).field_c = null;
        }
        return ((tf) this).field_a == ((tf) this).field_a.field_b ? true : false;
    }

    private final void a(tf param0, int param1, hf param2) {
        hf var4 = ((tf) this).field_a.field_c;
        ((tf) this).field_a.field_c = param2.field_c;
        param2.field_c.field_b = ((tf) this).field_a;
        if (((tf) this).field_a != param2) {
            param2.field_c = param0.field_a.field_c;
            param2.field_c.field_b = param2;
            param0.field_a.field_c = var4;
            var4.field_b = param0.field_a;
        }
        if (param1 != 2541) {
            hf discarded$0 = ((tf) this).e(-82);
        }
    }

    public tf() {
        ((tf) this).field_a = new hf();
        ((tf) this).field_a.field_b = ((tf) this).field_a;
        ((tf) this).field_a.field_c = ((tf) this).field_a;
    }

    final void a(int param0, hf param1) {
        if (null != param1.field_c) {
            param1.a(false);
        }
        param1.field_c = ((tf) this).field_a.field_c;
        if (param0 >= -33) {
            ((tf) this).field_a = null;
        }
        param1.field_b = ((tf) this).field_a;
        param1.field_c.field_b = param1;
        param1.field_b.field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_f = 5;
        field_d = new al();
        field_e = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_b = new int[5];
        var0 = 0;
        L0: while (true) {
          if (var0 >= field_b.length) {
            tf discarded$1 = new tf();
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
