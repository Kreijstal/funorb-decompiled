/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    private int field_b;
    private int field_d;
    int field_i;
    private int field_a;
    int field_h;
    int field_e;
    int field_g;
    private boolean field_c;
    private int field_f;

    final void a(byte param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          fieldTemp$3 = this.field_b + 1;
          this.field_b = this.field_b + 1;
          if (fieldTemp$3 > this.field_f) {
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            if (this.field_c) {
              fieldTemp$4 = this.field_g + 1;
              this.field_g = this.field_g + 1;
              decompiledFrameRemainder0 = !(fieldTemp$4 > this.field_a);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameRemainder1 = !(this.field_c))) {
              fieldTemp$5 = this.field_g - 1;
              this.field_g = this.field_g - 1;
              decompiledFrameRemainder1 = !(fieldTemp$5 >= this.field_a);
            }
            if (decompiledFrameRemainder1) {
              this.field_g = this.field_d;
            }
            this.field_b = 0;
          }
          if (param0 < 122) {
            va.b((byte) -48);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "va.D(" + param0 + ')');
        }
    }

    final static java.awt.Container b(byte param0) {
        RuntimeException var1 = null;
        java.awt.Frame stackIn_2_0 = null;
        java.awt.Container stackIn_5_0 = null;
        java.applet.Applet stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != sj.field_a) {
            stackIn_2_0 = sj.field_a;
            return (java.awt.Container) ((Object) stackIn_2_0);
          }
          if (param0 < -107) {
            stackIn_7_0 = hc.a(0);
            return (java.awt.Container) ((Object) stackIn_7_0);
          }
          stackIn_5_0 = (java.awt.Container) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "va.A(" + param0 + ')');
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        byte[] stackIn_2_0 = null;
        byte[] stackIn_14_0 = null;
        byte[] stackIn_34_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        Throwable decompiledCaughtException = null;
        de var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        try {
          if (param0 >= -106) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var2 = new de(param1);
          var3 = var2.d((byte) -118);
          var4 = var2.c(-38);
          if (var4 >= 0 && (m.field_z == 0 ||
            !(var4 > m.field_z))) {
            if (var3 == 0) {
              var5_ref_byte__ = new byte[var4];
              var2.a(var4, 0, var5_ref_byte__, 11240);
              stackIn_14_0 = var5_ref_byte__;
              return stackIn_14_0;
            }
            var5 = var2.c(-69);
            if (var5 >= 0 && (0 == m.field_z ||
              !(var5 > m.field_z))) {
              var6 = new byte[var5];
              if (1 != var3) {
                var7 = cn.field_d;
                synchronized (var7) {
                  cn.field_d.a(var6, var2, -8);
                }
              }
              if (1 == var3 ||
                ZombieDawn.field_J != 0) {
                lj.a(var6, var5, param1, var4, 9);
              }
              stackIn_34_0 = var6;
              return stackIn_34_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_38_0 = var2_ref;
          stackIn_38_1 = new StringBuilder().append("va.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_15_0 = 0;
        oh stackIn_68_0 = null;
        RuntimeException decompiledCaughtException = null;
        am var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        oh var5_ref = null;
        oh var6 = null;
        String var6_ref = null;
        oh var7 = null;
        String var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = ZombieDawn.field_J;
        try {
          if (param0 != 1545) {
            va.a((byte) -53, (byte[]) null);
          }
          var1 = fj.field_g;
          var2 = var1.d((byte) -126);
          if (var2 == 0) {
            if (nk.field_a == null) {
              nk.field_a = new pf(128);
              ih.field_J = 0;
            }
            stackIn_15_0 = (var1.d((byte) -119) != 1) ? 0 : 1;
            var3_int = stackIn_15_0;
            var4_ref_String = var1.a(true);
            if (var3_int != 0) {
              var1.a(true);
            }
            var5_ref = pa.a(var4_ref_String, (byte) -66);
            var6_ref = var1.a(true);
            var7_ref = fm.a((CharSequence) ((Object) var4_ref_String), -115);
            if (var7_ref == null) {
              var7_ref = var4_ref_String;
            }
            if (var5_ref == null) {
              var5_ref = pa.a(var6_ref, (byte) -66);
              if (var5_ref != null) {
                nk.field_a.a(param0 ^ 1544, (long)var7_ref.hashCode(), var5_ref);
              }
            }
            if (var5_ref == null) {
              var5_ref = new oh();
              nk.field_a.a(param0 ^ 1544, (long)var7_ref.hashCode(), var5_ref);
              fieldTemp$1 = ih.field_J;
              ih.field_J = ih.field_J + 1;
              var5_ref.field_kb = fieldTemp$1;
              tp.field_m.a(param0 ^ 1545, var5_ref);
            }
            var5_ref.field_lb = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (w.field_b == 1) {
                w.field_b = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (w.field_b == 2) {
                w.field_b = 1;
              }
              return;
            }
            if (var2 != 4) {
              ae.a((Throwable) null, 10331, "F1: " + cb.f(3));
              p.a(param0 - 1544);
              return;
            }
            w.field_b = 1;
            var3 = var1.a(true);
            oo.field_T = ((String) (var3)).intern();
            var4 = var1.d((byte) -128);
            rd.a(20348, var4);
            return;
          }
          if (sf.field_j == null) {
            sf.field_j = new pf(128);
            ne.field_b = 0;
          }
          var3Lifetime1 = var1.a(true);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.a(true);
          var5 = var1.a(true);
          var6 = hg.a(99, var4_ref_StringLifetime1);
          if (var6 == null) {
            var6 = hg.a(103, var5);
            if (var6 != null) {
              sf.field_j.a(1, (long)fm.a((CharSequence) ((Object) var4_ref_StringLifetime1), param0 ^ -1662).hashCode(), var6);
            }
          }
          if (null == var6) {
            var6 = new oh();
            sf.field_j.a(1, (long)fm.a((CharSequence) ((Object) var4_ref_StringLifetime1), -56).hashCode(), var6);
            fieldTemp$0 = ne.field_b;
            ne.field_b = ne.field_b + 1;
            var6.field_kb = fieldTemp$0;
            eb.field_d.a(0, var6);
          }
          if (null != var3Lifetime1) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6.field_lb = var4_ref_StringLifetime1;
          var6.field_ib = (String) (var3Lifetime1);
          var6.b(param0 - 29143);
          var7 = (oh) (eb.field_d.b((byte) 26));
          L8: while (true) {
            if (null != var7) {
              stackIn_68_0 = var6;
              if (var8 != 0) {
                break L8;
              }
              if (eh.a(stackIn_68_0, var7, (byte) 20)) {
                var7 = (oh) (eb.field_d.a(false));
                continue;
              }
            }
            if (null == var7) {
              eb.field_d.a(0, var6);
              if (var8 == 0) {
                return;
              }
            }
            stackIn_68_0 = var7;
            break;
          }
          we.a(stackIn_68_0, param0 ^ 1545, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "va.E(" + param0 + ')');
        }
    }

    final static int a(boolean param0) {
        boolean stackIn_16_0 = false;
        int stackIn_46_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          var1_int = 0;
          var2 = 0;
          if (!param0) {
            va.b((byte) -42);
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!on.b(-114)))) {
            i.field_W.a(21657);
            stackIn_16_0 = i.field_W.d(-127);
            if (var7 == 0) {
              if (stackIn_16_0) {
                var1_int = 1;
              }
              if (kg.field_i != 13) {
                continue;
              }
              var2 = 1;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            i.field_W.a((byte) -55, r.b(6199969, ha.field_b, ei.field_K), r.b(6199969, nc.field_j, hp.field_D));
            stackIn_16_0 = i.field_W.d(-124);
          }
          if (stackIn_16_0) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int == 0 ||
            !(i.field_W.field_d >= 0)) {
            if ((var2 != 0) &&
              (pg.field_p != 2)) {
              cn.a((byte) 126);
              if (var7 != 0) {
                var3 = qk.field_Kb[i.field_W.field_d];
                if (var3 == 2 ||
                  var3 == 5) {
                  cn.a((byte) 80);
                }
              }
            }
          } else {
            var3 = qk.field_Kb[i.field_W.field_d];
            if (var3 == 2 ||
              var3 == 5) {
              cn.a((byte) 80);
            }
          }
          if (var3 == 0 &&
            2 == pg.field_p) {
            var4 = -ge.field_f + pd.a(-22826);
            var6 = (int)((10999L - var4) / 1000L);
            if (var6 <= 0) {
              ti.a(5, 87, true);
              var3 = 2;
            }
          }
          stackIn_46_0 = var3;
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "va.C(" + param0 + ')');
        }
    }

    va(int param0, int param1, int param2, int param3, int param4, int param5) {
        try {
          this.field_a = param2;
          this.field_d = param1;
          this.field_e = param0;
          this.field_i = param5;
          this.field_c = this.field_a > this.field_d ? true : false;
          this.field_g = this.field_d;
          this.field_f = param3;
          this.field_h = param4;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "va.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
    }
}
