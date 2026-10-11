/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends df implements vb {
    static k field_E;
    private ag field_H;
    private ag field_C;
    static aj field_G;
    static String field_D;
    private ag field_F;

    final static void a(boolean param0, int param1, int param2) {
        vd.field_l = param2;
        to.field_p = param1;
        if (!param0) {
          field_E = (k) null;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param0 < -52) {
          var5 = param1 + this.field_n;
          var6 = this.field_j + param3;
          ia.field_c.a(qe.field_j, 20 + var5, var6 + 20, this.field_v - 40, -50 + this.field_k, 16777215, -1, 1, 0, ia.field_c.field_C);
          super.a((byte) -60, param1, param2, param3);
          return;
        }
    }

    public td() {
        super(0, 0, 476, 225, (pf) null);
        this.field_C = new ag(ib.field_t, (wc) null);
        this.field_F = new ag(kn.field_rb, (wc) null);
        this.field_H = new ag(rc.field_n, (wc) null);
        mm var1 = new mm();
        this.field_C.field_r = (pf) ((Object) var1);
        this.field_F.field_r = (pf) ((Object) var1);
        this.field_H.field_r = (pf) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        this.field_F.a(30, -var2 + (this.field_k - 48), var4, -var3 + this.field_v >> 1, -50);
        this.field_H.a(30, -var2 + (this.field_k - 48), var4, var4 + (-var3 + this.field_v >> 1) + var2, -73);
        this.field_C.a(30, this.field_k - 78 - var2 * 2, var3, -var3 + this.field_v >> 1, -103);
        this.field_F.field_o = (wc) (this);
        this.field_C.field_o = (wc) (this);
        this.field_C.field_q = dh.field_Bb;
        this.field_H.field_o = (wc) (this);
        this.field_H.field_q = hj.field_c;
        this.c(-102, this.field_F);
        this.c(-109, this.field_C);
        this.c(-76, this.field_H);
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (!param0) {
            field_G = (aj) null;
          }
          if (param4 == this.field_F) {
            bl.d((byte) 109);
            return;
          }
          if (param4 == this.field_C) {
            wk.k(970210916);
            return;
          }
          if (this.field_H != param4) {
            return;
          }
          oo.g(4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("td.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 > -76) {
          td.a((byte) 111);
          if (null == ch.field_c) {
            return false;
          }
          if (ob.field_eb == qc.field_c) {
            return true;
          }
          return false;
        }
        if (null == ch.field_c) {
          return false;
        }
        if (ob.field_eb == qc.field_c) {
          return true;
        }
        return false;
    }

    final static byte[] a(Object param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        bg var5 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          var3_int = -76 / ((-73 - param1) / 52);
          if (!(param0 instanceof byte[])) {
            if (!(param0 instanceof bg)) {
              throw new IllegalArgumentException();
            }
            var5 = (bg) (param0);
            stackIn_12_0 = var5.b((byte) -43);
            return stackIn_12_0;
          }
          var4 = (byte[]) (param0);
          if (param2) {
            stackIn_9_0 = dd.a(var4, 0);
            return stackIn_9_0;
          }
          stackIn_7_0 = var4;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("td.J(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_E = null;
        if (param0 != 115) {
          return;
        }
        field_D = null;
        field_G = null;
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -120) {
            return true;
          }
          if (super.a(param0, (byte) -127, param2, param3)) {
            return true;
          }
          if (param3 == 98) {
            stackIn_10_0 = this.a(param0, 9555);
            return stackIn_10_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_14_0 = this.b(2, param0);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("td.N(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean e(boolean param0) {
        if (!param0) {
          return true;
        }
        return qf.field_d >= 2 ? true : false;
    }

    final static void a(int param0, byte param1, int param2, ll param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        var21 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var6_int = (-param0 + param2 << 8) / param3.field_g;
          var7 = param3.field_j * var6_int + (param0 << 8);
          param5 = param5 + param3.field_f;
          param4 = param4 + param3.field_j;
          var8 = param4 + param5 * de.field_e;
          var9 = 0;
          var10 = param3.field_c;
          var11 = param3.field_h;
          var12 = de.field_e - var11;
          var13 = 0;
          if (de.field_c > param5) {
            var14 = de.field_c - param5;
            var8 = var8 + de.field_e * var14;
            var9 = var9 + var11 * var14;
            param5 = de.field_c;
            var10 = var10 - var14;
          }
          if (param4 < de.field_i) {
            var14Lifetime1 = de.field_i - param4;
            var12 = var12 + var14Lifetime1;
            var8 = var8 + var14Lifetime1;
            param4 = de.field_i;
            var13 = var13 + var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var7 = var7 + var6_int * var14Lifetime1;
            var11 = var11 - var14Lifetime1;
          }
          if (var10 + param5 > de.field_k) {
            var10 = var10 - (param5 + (var10 - de.field_k));
          }
          var14Lifetime2 = 127 % ((-32 - param1) / 32);
          if (var11 + param4 > de.field_h) {
            var15 = param4 - (-var11 + de.field_h);
            var13 = var13 + var15;
            var11 = var11 - var15;
            var12 = var12 + var15;
          }
          if (var11 > 0 &&
            var10 > 0) {
            for (param5 = -var10; 0 > param5; param5++) {
              var15Lifetime1 = var7;
              for (param4 = -var11; param4 < 0; param4++) {
                var16 = var15Lifetime1 >> 8;
                var15Lifetime1 = var15Lifetime1 + var6_int;
                var17 = -var16 + 256;
                if (0 > var16) {
                  var9++;
                  var8++;
                } else {
                  incrementValue$0 = var9;
                  var9++;
                  var18 = param3.field_l[255 & param3.field_m[incrementValue$0]];
                  if (var18 != 0) {
                    if (var16 <= 255) {
                      var19 = de.field_l[var8];
                      var20 = (16711935 & var18) * var16 + var17 * (var19 & 16711935) >> 8 & 16711935;
                      de.field_l[var8] = var20 + dg.a(65280, dg.a(65280, var18) * var16 + dg.a(var19, 65280) * var17 >> 8);
                    } else {
                      de.field_l[var8] = var18;
                    }
                  }
                  var8++;
                }
              }
              var9 = var9 + var13;
              var8 = var8 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_34_0 = var6;
          stackIn_34_1 = new StringBuilder().append("td.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_D = "Now you will be given every Arcanist's staple spell: Arcane Arrow. This spell is an important addition to any spellbook, providing you with a way of making accurate attacks upon weakened targets.";
        field_G = new aj(4, 1, 1, 1);
    }
}
