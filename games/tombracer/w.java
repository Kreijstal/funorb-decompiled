/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends sqa {
    private boolean field_e;
    int[] field_i;
    int field_c;
    int field_h;
    private vna field_g;
    static iu[] field_f;
    static String field_d;

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        int var2Lifetime1;
        if (param0) {
          for (var2 = 0; this.field_i.length > var2; var2++) {
            this.field_i[var2] = 0;
          }
          return;
        }
        this.field_g = (vna) null;
        for (var2Lifetime1 = 0; this.field_i.length > var2Lifetime1; var2Lifetime1++) {
          this.field_i[var2Lifetime1] = 0;
        }
    }

    final void a(byte param0) {
        fla var4 = null;
        int var3 = TombRacer.field_G ? 1 : 0;
        fla var4Lifetime1;
        if (param0 >= -118) {
          this.field_g = (vna) null;
        } else {
          var4 = (fla) (this.field_g.f(-80));
          while (var4 != null) {
            rs.a(var4, 107);
            var4 = (fla) (this.field_g.e(107));
          }
          this.field_g.d(8);
          this.a(true);
          return;
        }
        var4Lifetime1 = (fla) (this.field_g.f(-80));
        while (var4Lifetime1 != null) {
          rs.a(var4Lifetime1, 107);
          var4Lifetime1 = (fla) (this.field_g.e(107));
        }
        this.field_g.d(8);
        this.a(true);
    }

    final static int a(uia param0, int param1, vna param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var8 = new StringBuilder(8);
          var4 = 0;
          var5 = -1;
          while (true) {
            if (param0.field_h < param0.field_g.length) {
              var5 = param0.h(255);
              if ((~var5 != ~dia.field_q ||
                var4 != 0) &&
                (!qqa.a(param0, mga.field_j, var5, true) ||
                var4 != 0)) {
                if (uqa.field_w != var5) {
                  discarded$2 = var8.append((char)var5);
                  continue;
                }
                boolean decompiledFrameRemainder0 = true;
                if (var4 != 0) {
                  if (param0.field_g.length == param0.field_h + 1) {
                    throw new RuntimeException("Unterminated quote!");
                  }
                  var6 = param0.c((byte) 52);
                  if (!qqa.a(param0, mga.field_j, var6, true) &&
                    dia.field_q != var6) {
                    if (uqa.field_w == var6) {
                      discarded$0 = var8.append((char)var6);
                    } else {
                      param0.field_h = param0.field_h - 1;
                      discarded$1 = var8.append((char)var5);
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    param0.field_h = param0.field_h - 1;
                  }
                }
                stackIn_26_0 = (var4 != 0) ? 0 : 1;
                var4 = stackIn_26_0;
                continue;
              }
            }
            break;
          }
          param2.b((byte) -59, new gka(var8.toString()));
          if (param1 != -58) {
            field_d = (String) null;
          }
          stackIn_30_0 = var5;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("w.O(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final fla a(fm param0, int param1) {
        Object stackIn_11_0 = null;
        Object stackIn_20_0 = null;
        fla stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vb var11 = null;
        fla var12 = null;
        try {
          var3_int = param0.e(9800);
          if (this.field_e) {
            return null;
          }
          if (this.field_g.a((byte) -16) >= 15) {
            return null;
          }
          if (var3_int < 0) {
            return null;
          }
          if (var3_int >= 98) {
            return null;
          }
          if (this.field_i[var3_int] >= dda.field_f[var3_int]) {
            stackIn_11_0 = null;
            return (fla) (stackIn_11_0);
          }
          if (26 == var3_int) {
            this.a(-101, new fm(28, param0.b(param1 - 43), param0.a(-127), param0.c(4)));
          }
          if (this.a(-123, var3_int)) {
            this.a(param1 ^ 86, new fm(89, param0.b(param1 + 105), param0.a(-121), param0.c(param1 ^ -62)));
          }
          var4 = to.field_j[var3_int];
          if (var4 == -1) {
            stackIn_20_0 = null;
            return (fla) (stackIn_20_0);
          }
          var5 = to.field_i[var3_int];
          if (0 < var5) {
            var4 = var4 + uca.field_c.a(var5, 0);
          }
          var6 = 0;
          if (var3_int == 28) {
            var6 = 300;
          }
          if (param1 == ~var3_int) {
            var6 = 300;
          }
          if (var3_int == 89) {
            var6 = 300;
          }
          var7 = to.field_m[var3_int] ? 1 : 0;
          var8 = to.field_k[var3_int] ? 1 : 0;
          var9 = -1;
          var10 = to.field_n[var3_int];
          if (var8 == 0) {
            var9 = jba.a(this.field_h, true, param0.b(param1 - 52));
            var10 = ol.a(param0.b(-118), var3_int, (byte) -91, this.field_h, param0.a(-121), this.field_c);
          }
          var11 = v.a(100, (byte) -58, var9, var4, var6, var10);
          if (var7 != 0) {
            var11.field_f.b(-1);
          }
          var12 = new fla(var11, var3_int, var7 != 0, var4, var10, var9);
          this.field_g.b((byte) -100, var12);
          this.field_i[var3_int] = this.field_i[var3_int] + 1;
          stackIn_37_0 = var12;
          return stackIn_37_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("w.H(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 < 9) {
          this.field_g = (vna) null;
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 == 0) {
          this.field_e = param0 ? true : false;
          return;
        }
        this.a(110, true);
        this.field_e = param0 ? true : false;
    }

    private final boolean a(int param0, int param1) {
        if (param0 > -89) {
          this.field_g = (vna) null;
          if (param1 == 85) {
            return true;
          }
          if (param1 == 86) {
            return true;
          }
          if (87 == param1) {
            return true;
          }
          if (88 != param1) {
            return false;
          }
          return true;
        }
        if (param1 == 85) {
          return true;
        }
        if (param1 == 86) {
          return true;
        }
        if (87 == param1) {
          return true;
        }
        if (88 != param1) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        if (param0 > -26) {
          field_f = (iu[]) null;
          field_d = null;
          field_f = null;
          return;
        }
        field_d = null;
        field_f = null;
    }

    final void b(int param0, int param1, int param2) {
        this.field_h = param1;
        if (param2 != 89) {
          field_d = (String) null;
          this.field_c = param0;
          return;
        }
        this.field_c = param0;
    }

    final void a(int param0, boolean param1) {
        boolean discarded$1 = false;
        fla var6 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        fm var5 = (fm) (this.field_b.f(-80));
        fla var6Lifetime1;
        while (var5 != null) {
          this.a(var5, -58);
          var5.p(15);
          var5 = (fm) (this.field_b.e(124));
        }
        if (param0 < 75) {
          discarded$1 = this.a(53, -23);
        } else {
          var6 = (fla) (this.field_g.f(-80));
          while (var6 != null) {
            var6.a(564550600, this, param1);
            var6 = (fla) (this.field_g.e(110));
          }
          return;
        }
        var6Lifetime1 = (fla) (this.field_g.f(-80));
        while (var6Lifetime1 != null) {
          var6Lifetime1.a(564550600, this, param1);
          var6Lifetime1 = (fla) (this.field_g.e(110));
        }
    }

    public w() {
        this.field_i = new int[98];
        this.field_g = new vna();
    }

    static {
        field_d = "Offering Rematch";
    }
}
