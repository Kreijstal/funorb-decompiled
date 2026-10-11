/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static String[] field_e;
    private ug field_a;
    private int field_c;
    private ug[] field_f;
    static String[] field_d;
    private long field_b;

    final ug b(int param0) {
        ug var2;
        ug var3;
        int var4;
        ug var2Lifetime1;
        ug var3Lifetime1;
        var4 = Bounce.field_N;
        if (this.field_a == null) {
          return null;
        }
        if (param0 == 0) {
          var2 = this.field_f[(int)(this.field_b & (long)(-1 + this.field_c))];
          while (true) {
            if (this.field_a == var2) {
              this.field_a = null;
              return null;
            }
            if (this.field_a.field_j != this.field_b) {
              this.field_a = this.field_a.field_l;
              continue;
            }
            break;
          }
          var3 = this.field_a;
          this.field_a = this.field_a.field_l;
          return var3;
        }
        field_d = (String[]) null;
        var2Lifetime1 = this.field_f[(int)(this.field_b & (long)(-1 + this.field_c))];
        while (true) {
          if (this.field_a == var2Lifetime1) {
            this.field_a = null;
            return null;
          }
          if (this.field_a.field_j != this.field_b) {
            this.field_a = this.field_a.field_l;
            continue;
          }
          break;
        }
        var3Lifetime1 = this.field_a;
        this.field_a = this.field_a.field_l;
        return var3Lifetime1;
    }

    final void a(long param0, ug param1, int param2) {
        ug var5 = null;
        try {
          if (param1.field_i != null) {
            param1.a(96);
          }
          var5 = this.field_f[(int)((long)(this.field_c - 1) & param0)];
          param1.field_l = var5;
          param1.field_i = var5.field_i;
          int var6 = -91 / ((param2 + 71) / 43);
          param1.field_i.field_l = param1;
          param1.field_j = param0;
          param1.field_l.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "hc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static tg a(int param0, int param1, byte param2) {
        tg var6 = null;
        tg var3 = null;
        int var4 = 0;
        int var5 = Bounce.field_N;
        if (param2 < -121) {
          var6 = new tg(param0, param0);
          var3 = var6;
          for (var4 = 0; var3.field_v.length > var4; var4++) {
            var6.field_v[var4] = param1;
          }
          return var3;
        }
        return (tg) null;
    }

    final static ke a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7) {
        ke var8 = null;
        if (param5 <= -125) {
          var8 = new ke(param0, param2, param3, param1, param7, param6);
          uk.field_d.a(1, var8);
          qh.a(var8, param4, -22762);
          return var8;
        }
        return (ke) null;
    }

    final static lj a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        lj var5 = null;
        lj stackIn_4_0 = null;
        lj stackIn_8_0 = null;
        lj stackIn_13_0 = null;
        lj stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() != 0) {
            var2_int = param0.indexOf('@');
            if (var2_int == -1) {
              stackIn_8_0 = uc.field_E;
              return stackIn_8_0;
            }
            var3 = param0.substring(0, var2_int);
            if (param1 != 4011) {
              hc.a(true);
            }
            var4 = param0.substring(1 + var2_int);
            var5 = qd.a(var3, param1 - 3915);
            if (var5 == null) {
              stackIn_15_0 = qe.a(param1 ^ 3924, var4);
              return stackIn_15_0;
            }
            stackIn_13_0 = var5;
            return stackIn_13_0;
          }
          stackIn_4_0 = ga.field_f;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("hc.H(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean b(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_e = (String[]) null;
          }
          if (param0 != null &&
            param0.length() >= lc.field_y &&
            param0.length() <= mb.field_e) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("hc.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final ug a(long param0, int param1) {
        ug var4;
        ug var5;
        int var6;
        ug var4Lifetime1;
        ug var5Lifetime1;
        var6 = Bounce.field_N;
        this.field_b = param0;
        if (param1 == 0) {
          var4 = this.field_f[(int)((long)(-1 + this.field_c) & param0)];
          this.field_a = var4.field_l;
          while (true) {
            if (this.field_a == var4) {
              this.field_a = null;
              return null;
            }
            if (~this.field_a.field_j != ~param0) {
              this.field_a = this.field_a.field_l;
              continue;
            }
            break;
          }
          var5 = this.field_a;
          this.field_a = this.field_a.field_l;
          return var5;
        }
        field_e = (String[]) null;
        var4Lifetime1 = this.field_f[(int)((long)(-1 + this.field_c) & param0)];
        this.field_a = var4Lifetime1.field_l;
        while (true) {
          if (this.field_a == var4Lifetime1) {
            this.field_a = null;
            return null;
          }
          if (~this.field_a.field_j != ~param0) {
            this.field_a = this.field_a.field_l;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_a;
        this.field_a = this.field_a.field_l;
        return var5Lifetime1;
    }

    final static void a(int param0) {
        String var2 = (String) null;
        pk.a((String) null, "", -116);
        if (param0 != 0) {
          hc.a(97, -3, -125, -88, -110, (byte) -93, 42, -6);
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        if (!param0) {
          field_d = (String[]) null;
        }
    }

    final static boolean a(int param0, boolean param1, int param2, byte param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        if (!param1) {
          if (ij.field_b[param0] < ij.field_b[param2]) {
            return true;
          }
          if (ij.field_b[param0] > ij.field_b[param2]) {
            return false;
          }
          if (sj.field_j[param0] < sj.field_j[param2]) {
            return true;
          }
          if (sj.field_j[param2] < sj.field_j[param0]) {
            return false;
          }
          var4 = th.field_c[param0] + (nh.field_S[param0] + gk.field_i[param0]);
          if (param3 == 97) {
            var5 = th.field_c[param2] + (nh.field_S[param2] + gk.field_i[param2]);
            if (var4 < var5) {
              return true;
            }
            if (var4 > var5) {
              return false;
            }
            return !(param0 >= param2);
          }
          hc.a(-127, true, -50, (byte) 41);
          var5Lifetime3 = th.field_c[param2] + (nh.field_S[param2] + gk.field_i[param2]);
          if (var4 < var5Lifetime3) {
            return true;
          }
          if (var4 > var5Lifetime3) {
            return false;
          }
          return !(param0 >= param2);
        }
        if (sj.field_j[param2] > sj.field_j[param0]) {
          return true;
        }
        if (sj.field_j[param0] > sj.field_j[param2]) {
          return false;
        }
        if (ij.field_b[param2] > ij.field_b[param0]) {
          return true;
        }
        if (ij.field_b[param2] < ij.field_b[param0]) {
          return false;
        }
        var4Lifetime1 = th.field_c[param0] + (nh.field_S[param0] + gk.field_i[param0]);
        if (param3 == 97) {
          var5Lifetime1 = th.field_c[param2] + (nh.field_S[param2] + gk.field_i[param2]);
          if (var4Lifetime1 < var5Lifetime1) {
            return true;
          }
          if (var4Lifetime1 > var5Lifetime1) {
            return false;
          }
          return !(param0 >= param2);
        }
        hc.a(-127, true, -50, (byte) 41);
        var5Lifetime2 = th.field_c[param2] + (nh.field_S[param2] + gk.field_i[param2]);
        if (var4Lifetime1 < var5Lifetime2) {
          return true;
        }
        if (var4Lifetime1 > var5Lifetime2) {
          return false;
        }
        if (param0 >= param2) {
          return false;
        }
        return true;
    }

    hc(int param0) {
        int var2 = 0;
        ug dupTemp$0 = null;
        ug var3 = null;
        this.field_f = new ug[param0];
        this.field_c = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new ug();
          var3 = dupTemp$0;
          this.field_f[var2] = dupTemp$0;
          var3.field_l = var3;
          var3.field_i = var3;
        }
    }

    static {
        field_e = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_d = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
