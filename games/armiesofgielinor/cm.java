/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    static String field_c;
    static je field_a;
    static int field_b;
    private ho[][] field_d;

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        if (param0) {
          field_a = (je) null;
        }
    }

    final int a(boolean param0, int param1) {
        int var5 = 0;
        ho var6 = null;
        om var7 = null;
        int var8 = 0;
        int var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null == this.field_d[param1]) {
          return 0;
        }
        if (param0) {
          this.a(-6, 29, -98, 117, 69);
        }
        cf var10 = br.a(param1, (byte) -93);
        cf var3 = var10;
        int var4 = 0;
        for (var5 = 0; var5 < var3.field_n.length; var5++) {
          var6 = this.field_d[param1][var5];
          var7 = var10.field_n[var5];
          var8 = var6 != null ? b.a(var7.field_m, var7.field_F, var6.field_c, (byte) 25, var6.field_b) : 0;
          var4 = var4 + var8;
        }
        return var4;
    }

    final static String b(boolean param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = "(" + me.field_c + " " + ba.field_F + " " + sj.field_e + ") " + nm.field_o;
        var1 = var6;
        if (fk.field_b > 0) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < fk.field_b; var2++) {
            var7 = var1 + ' ';
            var3 = 255 & mg.field_e.field_o[var2];
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 < 10) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            if (var3 < 10) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var8 = var7 + (char)var4;
            var1 = var8 + (char)var3;
          }
        }
        if (!param0) {
          return var1;
        }
        return (String) null;
    }

    final void a(int param0, vh param1, int param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var4_int = param1.e((byte) -104);
          var5 = 0;
          if (param2 > -109) {
            return;
          }
          while (0 != var4_int) {
            if ((var4_int & 1) != 0) {
              this.field_d[var5] = new ho[64];
              while (true) {
                dupTemp$1 = param1.k(0);
                var6 = dupTemp$1;
                if (255 == dupTemp$1) {
                  break;
                }
                if (param0 < 7) {
                  var7 = 2000;
                  var9 = param1.e((byte) -104);
                  var8 = var9;
                } else {
                  var7 = param1.e((byte) -104);
                  var8 = param1.e((byte) -104);
                }
                this.field_d[var5][var6] = new ho(var7, var8);
              }
            }
            var4_int = var4_int >> 1;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("cm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(String param0, int param1, String param2) {
        try {
          if (param1 != 0) {
            cm.b(false);
          }
          wb.a(false, (byte) 32, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "cm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        cf var5;
        om var6;
        var4 = 54 / ((67 - param1) / 36);
        if (this.field_d[param0] != null &&
          null != this.field_d[param0][param2]) {
          var5 = br.a(param0, (byte) -57);
          var6 = var5.field_n[param2];
          return b.a(var6.field_m, var6.field_F, this.field_d[param0][param2].field_c, (byte) 25, this.field_d[param0][param2].field_b);
        }
        return 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (this.field_d[param3] == null) {
          this.field_d[param3] = new ho[64];
        }
        if (param0 != 65535) {
          field_b = -24;
        }
        if ((-1 != param2 ||
          -1 != param4) &&
          (65535 != param2 ||
          param4 != 65535)) {
          this.field_d[param3][param1] = new ho(param2, param4);
        } else {
          this.field_d[param3][param1] = null;
        }
    }

    final static void a(int param0, boolean param1) {
        if (jj.b((byte) -73)) {
          param1 = false;
        }
        nm.a((byte) 95, param1);
        if (gl.field_b) {
          qn.d(ij.field_w.field_a.field_S, ij.field_w.field_a.field_ab, ij.field_w.field_a.field_gb, ij.field_w.field_a.field_ob);
          ij.field_w.field_a.b(param1, 20);
        }
        if (param0 != 2000) {
          return;
        }
        ArmiesOfGielinor.b(0, param1);
    }

    public cm() {
        this.field_d = new ho[3][];
    }

    static {
        field_c = "Unrated game";
    }
}
