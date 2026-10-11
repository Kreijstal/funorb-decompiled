/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    int field_e;
    static bd field_d;
    static byte[][][] field_h;
    private int field_f;
    int field_g;
    private int field_a;
    static bd field_c;
    private int field_b;

    public final boolean equals(Object param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_7_0 = (param0 instanceof oc) && (this.a((oc) (param0), -124));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("oc.equals(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_d = null;
          if (param0 != -9575) {
            field_h = (byte[][][]) null;
          }
          field_h = (byte[][][]) null;
          field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "oc.D(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_g = param2;
          if (param1 != 8360) {
            this.field_f = -3;
          }
          this.field_e = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var4), "oc.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        vb stackIn_65_0 = null;
        RuntimeException decompiledCaughtException = null;
        en var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        vb var5 = null;
        String var5_ref = null;
        String var6 = null;
        vb var6_ref = null;
        String var7 = null;
        vb var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          var1 = sc.field_g;
          if (param0 <= 25) {
            field_h = (byte[][][]) null;
          }
          var2 = var1.l(32270);
          if (var2 == 0) {
            if (null == n.field_t) {
              n.field_t = new cb(128);
              vd.field_A = 0;
            }
            stackIn_14_0 = (var1.l(32270) != 1) ? 0 : 1;
            var3_int = stackIn_14_0;
            var4_ref_String = var1.o(32);
            if (var3_int != 0) {
              var1.o(32);
            }
            var5 = oa.a((byte) 117, var4_ref_String);
            var6 = var1.o(32);
            var7 = mf.a(false, (CharSequence) ((Object) var4_ref_String));
            if (null == var7) {
              var7 = var4_ref_String;
            }
            if (null == var5) {
              var5 = oa.a((byte) 90, var6);
              if (null != var5) {
                n.field_t.a((long)var7.hashCode(), var5, 320);
              }
            }
            if (var5 == null) {
              var5 = new vb();
              n.field_t.a((long)var7.hashCode(), var5, 320);
              fieldTemp$0 = vd.field_A;
              vd.field_A = vd.field_A + 1;
              var5.field_Gb = fieldTemp$0;
              uj.field_o.a(var5, 121);
            }
            var5.field_Ib = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (2 == var2) {
              if (bj.field_b == 1) {
                bj.field_b = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (2 == bj.field_b) {
                bj.field_b = 1;
              }
              return;
            }
            if (var2 != 4) {
              ic.a((byte) -122, "F1: " + gf.a((byte) -123), (Throwable) null);
              le.c((byte) 51);
              return;
            }
            bj.field_b = 1;
            var3 = var1.o(32);
            eg.field_w = ((String) (var3)).intern();
            var4 = var1.l(32270);
            jf.a(-1631279870, var4);
            return;
          }
          if (null == kj.field_g) {
            kj.field_g = new cb(128);
            rc.field_d = 0;
          }
          var3Lifetime1 = var1.o(32);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.o(32);
          var5_ref = var1.o(32);
          var6_ref = pb.b(var4_ref_StringLifetime1, (byte) -122);
          if (var6_ref == null) {
            var6_ref = pb.b(var5_ref, (byte) -120);
            if (var6_ref != null) {
              kj.field_g.a((long)mf.a(false, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), var6_ref, 320);
            }
          }
          if (null == var6_ref) {
            var6_ref = new vb();
            kj.field_g.a((long)mf.a(false, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), var6_ref, 320);
            fieldTemp$1 = rc.field_d;
            rc.field_d = rc.field_d + 1;
            var6_ref.field_Gb = fieldTemp$1;
            gm.field_d.a(var6_ref, 103);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6_ref.field_Ib = var4_ref_StringLifetime1;
          var6_ref.field_Mb = (String) (var3Lifetime1);
          var6_ref.b(-23);
          var7_ref = (vb) (gm.field_d.g(-97));
          L16: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var7_ref != null) {
              stackIn_65_0 = var7_ref;
              decompiledFrameRemainder0 = (var8 == 0);
              if ((decompiledFrameRemainder0) &&
                (td.a(stackIn_65_0, true, var6_ref))) {
                var7_ref = (vb) (gm.field_d.a(12684));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (null == var7_ref) {
                break L16;
              }
              stackIn_65_0 = var6_ref;
            }
            uf.a(stackIn_65_0, var7_ref, (byte) -59);
            if (var8 == 0) {
              return;
            }
            break;
          }
          gm.field_d.a(var6_ref, 115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1_ref), "oc.I(" + param0 + ')');
        }
    }

    final void a(byte param0, oc param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_e = param1.field_e;
          if (param0 != 46) {
            field_h = (byte[][][]) null;
          }
          this.field_g = param1.field_g;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("oc.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 1) {
            stackIn_4_0 = pf.a(param0, 127, false);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("oc.J(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -4) {
            stackIn_2_0 = -11;
            return stackIn_2_0;
          }
          if (this.field_e != this.field_b ||
            this.field_g != this.field_f) {
            this.field_a = this.field_e + ln.field_a.field_d * this.field_g;
            if (this.field_a < 0) {
              this.field_a = 0;
            }
            if (this.field_a >= ln.field_a.field_n) {
              this.field_a = ln.field_a.field_n - 1;
            }
            this.field_b = this.field_e;
            this.field_f = this.field_g;
          }
          stackIn_17_0 = this.field_a;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "oc.F(" + param0 + ')');
        }
    }

    final static String a(int param0, double param1) {
        RuntimeException var3 = null;
        String stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ul.field_E == null) {
            ul.field_E = new java.text.DecimalFormat("0.00");
          }
          if (param0 != -1) {
            oc.a(47, -0.5022005601801744);
          }
          stackIn_8_0 = ul.field_E.format(param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var3), "oc.G(" + param0 + ',' + param1 + ')');
        }
    }

    final double a(int param0) {
        double var2_double = 0.0;
        RuntimeException var2 = null;
        double stackIn_4_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_double = Math.atan2((double)(-this.field_e), (double)(-this.field_g));
          if (param0 != 25124) {
            field_d = (bd) null;
          }
          var2_double = var2_double * 128.0 / 3.141592653589793;
          stackIn_4_0 = var2_double;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "oc.E(" + param0 + ')');
        }
    }

    final boolean a(oc param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 65 / ((-64 - param1) / 55);
          stackIn_7_0 = (this.field_e == param0.field_e) && (this.field_g == param0.field_g);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("oc.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          stackIn_1_0 = "(" + this.field_e + "," + this.field_g + ")";
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "oc.toString()");
        }
    }

    public oc() {
        this.field_b = -1;
        this.field_f = -1;
        try {
          this.field_e = 0;
          this.field_g = 0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "oc.<init>()");
        }
    }

    final void b(oc param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 24161) {
            return;
          }
          this.field_g = this.field_g - param0.field_g;
          this.field_e = this.field_e - param0.field_e;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("oc.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    oc(oc param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_b = -1;
        this.field_f = -1;
        try {
          this.field_g = param0.field_g;
          this.field_e = param0.field_e;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("oc.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    oc(int param0, int param1) {
        this.field_b = -1;
        this.field_f = -1;
        try {
          this.field_g = param1;
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "oc.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_h = new byte[][][]{new byte[10][], new byte[10][]};
    }
}
