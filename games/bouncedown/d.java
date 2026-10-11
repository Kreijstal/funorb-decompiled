/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends wd {
    static int field_B;
    static oh field_F;
    int field_C;
    private int field_E;
    private aj field_D;
    int field_G;

    public static void f(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 > -91) {
            d.e((byte) 23);
          }
          field_F = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "d.F(" + param0 + ')');
        }
    }

    final int d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -110) {
            stackIn_4_0 = this.field_D.a((byte) -117);
            return stackIn_4_0;
          }
          stackIn_2_0 = 74;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2), "d.G(" + param0 + ')');
        }
    }

    final int b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 59 / ((param0 - 11) / 56);
          if (0 <= param1 &&
            param1 < this.field_D.a((byte) -110)) {
            stackIn_9_0 = this.field_D.a((byte) 112, param1);
            return stackIn_9_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var3), "d.C(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            d.f((byte) 69);
          }
          stackIn_4_0 = this.field_E;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2), "d.H(" + param0 + ')');
        }
    }

    final boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_25_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Bounce.field_N;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_C + param3 - param2;
          var9 = this.field_k - this.field_C * 2;
          if (var8_int > var9) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_E / var9;
          if (param0 != 1) {
            if (param0 == 2) {
              var10 = 2147483647;
              var11 = -1;
              var12 = 0;
              while (true) {
                if (var12 < this.field_D.a((byte) -127)) {
                  var13 = this.field_D.a((byte) -101, var12) - var8_int;
                  var13 = var13 * var13;
                  stackIn_25_0 = var10;
                  if (var14 == 0) {
                    if (stackIn_25_0 > var13) {
                      var10 = var13;
                      var11 = var12;
                    }
                    var12++;
                    continue;
                  }
                } else {
                  stackIn_25_0 = var11;
                }
                break;
              }
              if (stackIn_25_0 >= 0) {
                this.field_D.a(var11, true);
              }
              if (var14 != 0) {
                this.field_D.b(1, var8_int);
              }
            }
          } else {
            this.field_D.b(1, var8_int);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_38_0 = var8;
          stackIn_38_1 = new StringBuilder().append("d.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(String param0, boolean param1, String param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param3 != 0) {
            d.f((byte) 70);
          }
          gi.field_b = param2;
          ak.field_w = param0;
          fj.a(param1, sh.field_jb, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("d.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void e(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        fb stackIn_62_0 = null;
        RuntimeException decompiledCaughtException = null;
        ii var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        fb var5 = null;
        String var5_ref = null;
        String var6 = null;
        fb var6_ref = null;
        String var7 = null;
        fb var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = Bounce.field_N;
        try {
          var1 = jc.field_g;
          var2 = var1.d((byte) -113);
          if (var2 == 0) {
            if (null == tk.field_b) {
              tk.field_b = new hc(128);
              bi.field_g = 0;
            }
            stackIn_11_0 = (var1.d((byte) -128) != 1) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.b(true);
            if (var3_int != 0) {
              var1.b(true);
            }
            var5 = fl.a((byte) -128, var4_ref_String);
            var6 = var1.b(true);
            var7 = ce.a((CharSequence) ((Object) var4_ref_String), 0);
            if (null == var7) {
              var7 = var4_ref_String;
            }
            if (var5 == null) {
              var5 = fl.a((byte) -128, var6);
              if (var5 != null) {
                tk.field_b.a((long)var7.hashCode(), var5, -121);
              }
            }
            if (null == var5) {
              var5 = new fb();
              tk.field_b.a((long)var7.hashCode(), var5, -24);
              fieldTemp$0 = bi.field_g;
              bi.field_g = bi.field_g + 1;
              var5.field_mb = fieldTemp$0;
              wg.field_v.a(1, var5);
            }
            var5.field_ob = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (db.field_V == 1) {
                db.field_V = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (db.field_V == 2) {
                db.field_V = 1;
              }
              return;
            }
            if (var2 == 4) {
              db.field_V = 1;
              var3 = var1.b(true);
              u.field_d = ((String) (var3)).intern();
              var4 = var1.d((byte) -117);
              ij.a(var4, 2);
              return;
            }
            ti.a((Throwable) null, (byte) 100, "F1: " + la.a(-114));
            if (param0 > -12) {
              return;
            }
            kc.a((byte) 18);
            return;
          }
          if (null == lf.field_q) {
            lf.field_q = new hc(128);
            kc.field_a = 0;
          }
          var3Lifetime1 = var1.b(true);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.b(true);
          var5_ref = var1.b(true);
          var6_ref = hf.a(var4_ref_StringLifetime1, true);
          if (null == var6_ref) {
            var6_ref = hf.a(var5_ref, true);
            if (var6_ref != null) {
              lf.field_q.a((long)ce.a((CharSequence) ((Object) var4_ref_StringLifetime1), 0).hashCode(), var6_ref, -127);
            }
          }
          if (var6_ref == null) {
            var6_ref = new fb();
            lf.field_q.a((long)ce.a((CharSequence) ((Object) var4_ref_StringLifetime1), 0).hashCode(), var6_ref, -121);
            fieldTemp$1 = kc.field_a;
            kc.field_a = kc.field_a + 1;
            var6_ref.field_mb = fieldTemp$1;
            oa.field_b.a(1, var6_ref);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6_ref.field_ob = var4_ref_StringLifetime1;
          var6_ref.field_kb = (String) (var3Lifetime1);
          var6_ref.c(2);
          var7_ref = (fb) (oa.field_b.a((byte) -76));
          L14: while (true) {
            if (null != var7_ref) {
              stackIn_62_0 = var7_ref;
              if (var8 != 0) {
                break L14;
              }
              if (ja.a(stackIn_62_0, 200, var6_ref)) {
                var7_ref = (fb) (oa.field_b.d((byte) -114));
                continue;
              }
            }
            stackIn_62_0 = var7_ref;
            break;
          }
          if (stackIn_62_0 != null) {
            lf.a(var7_ref, var6_ref, -17957);
            if (var8 == 0) {
              return;
            }
          }
          oa.field_b.a(1, var6_ref);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1_ref), "d.B(" + param0 + ')');
        }
    }

    private d() throws Throwable {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "d.<init>()");
        }
    }

    static {
        field_B = 0;
    }
}
