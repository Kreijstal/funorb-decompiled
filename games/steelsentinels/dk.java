/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    private int field_e;
    private DualNode field_c;
    private DualNode[] field_b;
    private long field_g;
    static String field_i;
    static fh field_h;
    private int field_f;
    static int field_a;
    private DualNode field_d;

    final DualNode c(byte param0) {
        DualNode var3 = null;
        int var4 = SteelSentinels.obfuscationControl;
        if (this.field_d == null) {
          return null;
        }
        if (param0 <= 85) {
          return (DualNode) null;
        }
        DualNode var2 = this.field_b[(int)((long)(this.field_e - 1) & this.field_g)];
        while (this.field_d != var2) {
          if (~this.field_g == ~this.field_d.field_w) {
            var3 = this.field_d;
            this.field_d = this.field_d.dualNext;
            return var3;
          }
          this.field_d = this.field_d.dualNext;
        }
        this.field_d = null;
        return null;
    }

    public static void b(byte param0) {
        if (param0 > -75) {
          return;
        }
        field_i = null;
        field_h = null;
    }

    final DualNode a(int param0) {
        this.field_f = 0;
        if (param0 <= 87) {
          this.field_c = (DualNode) null;
        }
        return this.a((byte) 95);
    }

    final DualNode a(byte param0) {
        int fieldTemp$0 = 0;
        DualNode var2_ref_kd;
        int var2;
        DualNode var3;
        int var4;
        var4 = SteelSentinels.obfuscationControl;
        if (this.field_f > 0 &&
          this.field_b[-1 + this.field_f] != this.field_c) {
          var2_ref_kd = this.field_c;
          this.field_c = var2_ref_kd.dualNext;
          return var2_ref_kd;
        }
        var2 = 52 % ((4 - param0) / 46);
        do {
          if (this.field_e <= this.field_f) {
            return null;
          }
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          var3 = this.field_b[fieldTemp$0].dualNext;
        } while (this.field_b[-1 + this.field_f] == var3);
        this.field_c = var3.dualNext;
        return var3;
    }

    final static void b(int param0) {
        int var3 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_32_0 = null;
        String stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        boolean stackIn_39_2 = false;
        ak stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        ak var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = SteelSentinels.obfuscationControl;
        try {
          var1_int = ug.field_Q;
          var2 = 0;
          if (in.field_a == 2) {
            var3_long = -rb.field_c + mm.a(117);
            var2 = (int)((10999L - var3_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = 0; var3 < r.field_j.length; var3++) {
            var4 = bl.field_m[var3];
            if (var4 < 0) {
              var5 = se.field_e;
            } else {
              if (DualNodeDeque.field_f.field_e == var4) {
                var5 = km.field_i;
              } else {
                var5 = CipherPacketBuffer.field_I;
              }
            }
            var6 = r.field_j[var3];
            if (2 == in.field_a &&
              var2 == 1) {
              if (oc.field_d.length > nm.field_n.length) {
                stackIn_18_0 = oc.field_d.length;
              } else {
                stackIn_18_0 = nm.field_n.length;
              }
              var7 = stackIn_18_0;
              if (a.field_g.length <= dj.field_j.length) {
                stackIn_21_0 = dj.field_j.length;
              } else {
                stackIn_21_0 = a.field_g.length;
              }
              var8 = stackIn_21_0;
              if (var3 >= 6 &&
                var3 < var7 + 6) {
                if (-var7 + (-6 + var3 + nm.field_n.length) >= 0) {
                  stackIn_26_0 = nm.field_n[-var7 + (var3 - 6 + nm.field_n.length)];
                } else {
                  stackIn_26_0 = "";
                }
                var6 = stackIn_26_0;
              }
              if (var3 >= 7 + var7 &&
                var7 + (7 + var8) > var3) {
                if (dj.field_j.length > -7 + var3 - var7) {
                  stackIn_32_0 = dj.field_j[-var7 - 7 + var3];
                } else {
                  stackIn_32_0 = "";
                }
                var6 = stackIn_32_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_38_0 = var6;
            stackIn_38_1 = 52;
            stackIn_39_2 = !(0 > var4);
            var7Lifetime1 = wd.$cfr$intArgs$a$1694234bddb3(stackIn_38_0, stackIn_38_1, stackIn_39_2);
            var8Lifetime1 = mg.field_kc - (var7Lifetime1 >> 1);
            if (var4 >= 0) {
              if (DualNodeDeque.field_f.field_e != var4) {
                stackIn_44_0 = vd.field_f;
              } else {
                stackIn_44_0 = kk.field_c;
              }
              var9 = stackIn_44_0;
              var1_int = var1_int + ng.field_m;
              if (var9 != null) {
                var9.a(var7Lifetime1 + (ud.field_y << 1), -15203, var8Lifetime1 - ud.field_y, (rc.field_j << 1) + rn.field_q, var1_int);
              }
              var1_int = var1_int + rc.field_j;
            }
            if (var4 < 0) {
              pa.field_k.b(var6, var8Lifetime1, var1_int + ag.field_s, var5, -1);
              var1_int = var1_int + ih.field_r;
            } else {
              wb.field_a.b(var6, var8Lifetime1, var1_int + ia.field_l, var5, -1);
              var1_int = var1_int + (rc.field_j + (ng.field_m + rn.field_q));
            }
          }
          if (param0 != -6561) {
            field_h = (fh) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "dk.F(" + param0 + ')');
        }
    }

    final static byte[] a(boolean param0, Object param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        gb var4 = null;
        byte[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          if (param1 == null) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          if (!(param1 instanceof byte[])) {
            if (!(param1 instanceof gb)) {
              throw new IllegalArgumentException();
            }
            var4 = (gb) (param1);
            stackIn_15_0 = var4.a(param2 - 21109);
            return stackIn_15_0;
          }
          var3 = (byte[]) (param1);
          if (!param0) {
            stackIn_12_0 = var3;
            return stackIn_12_0;
          }
          stackIn_10_0 = ff.a((byte) 89, var3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("dk.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(DualNode param0, int param1, long param2) {
        DualNode var5 = null;
        try {
          if (param0.dualPrevious != null) {
            param0.unlinkDual(480);
          }
          var5 = this.field_b[(int)(param2 & (long)(this.field_e - param1))];
          param0.dualNext = var5;
          param0.dualPrevious = var5.dualPrevious;
          param0.dualPrevious.dualNext = param0;
          param0.dualNext.dualPrevious = param0;
          param0.field_w = param2;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "dk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final DualNode a(long param0, byte param1) {
        DualNode var5_ref_kd = null;
        int var6 = SteelSentinels.obfuscationControl;
        this.field_g = param0;
        DualNode var4 = this.field_b[(int)((long)(this.field_e - 1) & param0)];
        this.field_d = var4.dualNext;
        while (this.field_d != var4) {
          if (~param0 == ~this.field_d.field_w) {
            var5_ref_kd = this.field_d;
            this.field_d = this.field_d.dualNext;
            return var5_ref_kd;
          }
          this.field_d = this.field_d.dualNext;
        }
        int var5 = -63 / ((param1 - 11) / 47);
        this.field_d = null;
        return null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        bf.field_Fb = param3;
        o.field_b = param1;
        if (param0 > 0) {
          field_h = (fh) null;
        }
        vg.field_c = param2;
    }

    dk(int param0) {
        int var2 = 0;
        DualNode dupTemp$0 = null;
        DualNode var3 = null;
        this.field_f = 0;
        this.field_b = new DualNode[param0];
        this.field_e = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new DualNode();
          var3 = dupTemp$0;
          this.field_b[var2] = dupTemp$0;
          var3.dualNext = var3;
          var3.dualPrevious = var3;
        }
    }

    static {
        field_i = "modules:</col>";
    }
}
