/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf implements iq {
    static int field_n;
    private int field_g;
    private int field_m;
    private nq field_i;
    static String[] field_c;
    private int field_e;
    private int field_f;
    private int field_r;
    static int field_p;
    private int field_o;
    static bi field_b;
    private int field_d;
    static gq field_j;
    private int field_h;
    private int field_s;
    private int field_k;
    static bi[] field_l;
    static int[] field_a;
    private int field_q;

    final static ks a(String param0, int param1) {
        RuntimeException var2 = null;
        ks stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -12179) {
            tf.a(true);
          }
          stackIn_4_0 = new ks(param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("tf.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(boolean param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            tf.a(true);
          }
          return !(param1 < 2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "tf.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_c = null;
          field_b = null;
          field_j = null;
          field_a = null;
          if (param0) {
            field_l = (bi[]) null;
          }
          field_l = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "tf.C(" + param0 + ')');
        }
    }

    final static void a(int param0, nq param1, int param2, nq param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -10) {
            return;
          }
          ql.field_n = param1;
          um.field_c = param3;
          fp.field_c = param2;
          eg.b(gf.field_b / 2, gf.field_k / 2, 0);
          id.a(param3.field_K + param3.field_q, param3.field_K, 26883, param1.field_K, param1.field_q + param1.field_K);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("tf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static wa a(byte param0) {
        int fieldTemp$0 = 0;
        wa localTemp$1 = null;
        Object stackIn_11_0 = null;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        wa stackIn_45_0 = null;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        wa stackIn_52_0 = null;
        RuntimeException decompiledCaughtException = null;
        wa var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        wa var3 = null;
        int var4 = 0;
        wa var1Lifetime1;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L1: while (true) {
            if (rd.field_g == null) {
              stackIn_13_0 = er.field_i;
              stackIn_13_1 = ui.field_p;
              if (var4 != 0) {
                break L1;
              }
              if (stackIn_13_0 > stackIn_13_1) {
                fieldTemp$0 = ui.field_p;
                ui.field_p = ui.field_p + 1;
                rd.field_g = bj.field_J[fieldTemp$0];
                continue;
              }
            }
            if (null == rd.field_g) {
              stackIn_11_0 = null;
              return (wa) (stackIn_11_0);
            }
            stackIn_13_0 = param0;
            stackIn_13_1 = -92;
            break;
          }
          if (stackIn_13_0 != stackIn_13_1) {
            field_p = -40;
          }
          var1 = rd.field_g.field_c;
          if (var1 != null) {
            while (true) {
              if (rd.field_g.field_g == var1.field_g) {
                var2 = rd.field_g.field_h - var1.field_h;
                stackIn_48_0 = -1;
                stackIn_48_1 = ~var2;
                if (var4 == 0) {
                  if (stackIn_48_0 > stackIn_48_1) {
                    ak.a(var1.field_h, 0, rd.field_g);
                  } else {
                    if (var2 < 0) {
                      throw new RuntimeException();
                    }
                  }
                  rd.field_g.field_f = rd.field_g.field_f + var1.field_f;
                  rd.field_g.field_e = rd.field_g.field_e + var1.field_e;
                  rd.field_g.field_a = rd.field_g.field_a + var1.field_a;
                  var3 = var1;
                  localTemp$1 = var1.field_c;
                  var1 = localTemp$1;
                  rd.field_g.field_c = localTemp$1;
                  var3.b(56);
                  if (0 == rd.field_g.field_f &&
                    0 == rd.field_g.field_a) {
                    if (var1 != null &&
                      rd.field_g.field_g == var1.field_g) {
                      var1.field_e = var1.field_e + rd.field_g.field_e;
                      rd.field_g.b(-16);
                      rd.field_g = var1;
                      var1 = var1.field_c;
                    } else {
                      rd.field_g.field_h = 1;
                    }
                  }
                  if (var1 == null) {
                    var1 = rd.field_g;
                    rd.field_g = null;
                    var1.b(param0 + 109);
                    stackIn_45_0 = var1;
                    return stackIn_45_0;
                  }
                  continue;
                }
              } else {
                stackIn_48_0 = var1.field_g - rd.field_g.field_g;
                stackIn_48_1 = rd.field_g.field_h;
              }
              if (stackIn_48_0 >= stackIn_48_1) {
                break;
              }
              ak.a(-rd.field_g.field_g + var1.field_g, 0, rd.field_g);
              break;
            }
          }
          var1Lifetime1 = rd.field_g;
          rd.field_g = var1Lifetime1.field_c;
          var1Lifetime1.b(-118);
          stackIn_52_0 = var1Lifetime1;
          return stackIn_52_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "tf.D(" + param0 + ')');
        }
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        vg stackIn_4_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        lk var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          if (!(param0 instanceof lk)) {
            stackIn_4_0 = null;
          } else {
            stackIn_4_0 = (vg) (param0);
          }
          var6 = (lk) (stackIn_4_0);
          if (var6 != null) {
            param2 = param2 & var6.field_y;
          }
          var7 = 5592405;
          gf.d(param0.field_m + param1, param0.field_q + param3, param0.field_x, param0.field_n, this.field_m);
          if (param2) {
            var7 = 16777215;
          }
          var8 = this.field_h + param0.field_m + param1;
          var9 = this.field_k + param0.field_q + param3;
          gf.a(var8, var9, this.field_e, this.field_s, 5592405);
          gf.d(var8, var9, this.field_e, this.field_s, var7);
          if (param4 != 12) {
            return;
          }
          if (var6.field_z) {
            gf.g(var8, var9, this.field_e + var8, this.field_s + var9, 1);
            gf.g(this.field_e + var8, var9, var8, var9 + this.field_s, 1);
          }
          if (this.field_i != null) {
            var10 = this.field_q + this.field_e + this.field_h;
            this.field_i.a(param0.field_s, var10 + (param0.field_m + param1), this.field_g + (param3 + param0.field_q), param0.field_x - var10 - this.field_q, -(this.field_q << 1) + param0.field_n, this.field_f, this.field_d, this.field_o, this.field_r, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_24_0 = var6_ref;
          stackIn_24_1 = new StringBuilder().append("tf.E(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    tf(nq param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_r = 1;
        this.field_o = 1;
        try {
          this.field_k = param6;
          this.field_g = param2;
          this.field_m = param9;
          this.field_i = param0;
          this.field_f = param3;
          this.field_q = param1;
          this.field_h = param5;
          this.field_s = param7;
          this.field_e = param8;
          this.field_d = param4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("tf.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    static {
        field_c = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_p = 256;
        field_j = new gq(8, 0, 4, 1);
    }
}
