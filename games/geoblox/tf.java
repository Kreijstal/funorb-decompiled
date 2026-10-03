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
        int var2;
        int var3;
        var3 = Geoblox.field_C;
        if ((null != kf.field_c) &&
            (!ag.field_j[param1])) {
          var2 = param1;
          if (var2 != 4) {
            if (3 != var2) {
              if (var2 != 0) {
                if (6 != var2) {
                  if (5 == var2) {
                    k.field_f = rf.a(kf.field_c, "", "sport");
                    uh.field_y.a(te.field_c, 0, -1, k.field_f, sl.field_l);
                  } else {
                    if (2 == var2) {
                      j.field_ib = rf.a(kf.field_c, "", "sweets");
                      uh.field_y.a(te.field_c, 0, -1, j.field_ib, sl.field_l);
                    }
                  }
                } else {
                  wf.field_o = rf.a(kf.field_c, "", "space");
                  uh.field_y.a(te.field_c, 0, -1, wf.field_o, sl.field_l);
                }
              } else {
                ej.field_d = rf.a(kf.field_c, "", "jewellery");
                uh.field_y.a(te.field_c, 0, -1, ej.field_d, sl.field_l);
              }
            } else {
              te.field_b = rf.a(kf.field_c, "", "germs");
              uh.field_y.a(te.field_c, 0, -1, te.field_b, sl.field_l);
            }
          } else {
            qb.field_M = rf.a(kf.field_c, "", "baking");
            uh.field_y.a(te.field_c, 0, -1, qb.field_M, sl.field_l);
          }
          ag.field_j[param1] = true;
          if (param0 <= 110) {
            field_f = 13;
          }
          return;
        }
    }

    final static boolean a(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 <= 65) {
          return false;
        }
        stackIn_6_0 = (oh.field_b != null) && (oh.field_b.j(75) != null);
        return stackIn_6_0;
    }

    public static void f(int param0) {
        field_b = null;
        if (param0 != 51) {
            tf.a(-67, 123, -7, 36, 22);
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
        hf var2 = this.field_a.field_b;
        if (param0 >= -94) {
            this.b((byte) 113);
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
        try {
            this.a(param0, 2541, this.field_a.field_b);
            if (param1 != -70) {
                hf var4 = (hf) null;
                this.a(52, (hf) null);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "tf.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        hf var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          var4 = this.field_a.field_c;
          this.field_a.field_c = param2.field_c;
          param2.field_c.field_b = this.field_a;
          if (this.field_a != param2) {
            param2.field_c = param0.field_a.field_c;
            param2.field_c.field_b = param2;
            param0.field_a.field_c = var4;
            var4.field_b = param0.field_a;
          }
          if (param1 != 2541) {
            this.e(-82);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("tf.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
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
        int var0 = 0;
        field_f = 5;
        field_d = new al();
        field_e = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_b = new int[5];
        for (var0 = 0; var0 < field_b.length; var0++) {
          if (var0 == 0) {
            field_b[var0] = (1 + var0) * 20 << 8;
          } else {
            field_b[var0] = (1 + var0) * 51 << 8;
          }
          if (var0 <= 2) {
            continue;
          }
          field_b[var0] = lb.a(field_b[var0], (-2 + var0) * 22 << 16);
        }
        tf discarded$0 = new tf();
    }
}
