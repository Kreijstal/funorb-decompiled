/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static nd field_q;
    byte[] field_m;
    static bd field_p;
    int field_d;
    static bd field_j;
    int field_c;
    int field_h;
    byte[] field_n;
    int field_b;
    int field_g;
    int field_o;
    static bd field_f;
    int field_e;
    static boolean field_l;
    static boolean field_k;
    static String field_a;
    static byte[][] field_i;

    public static void a(boolean param0) {
        field_q = null;
        if (!param0) {
          return;
        }
        field_a = null;
        field_p = null;
        field_f = null;
        field_j = null;
        field_i = (byte[][]) null;
    }

    final static void a(int param0) {
        bd var1 = null;
        bd var2 = null;
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          var1 = new bd(540, 140);
          sb.a(var1, -118);
          ge.b();
          si.d();
          tk.field_e = 0;
          uc.b(-40);
          var2 = var1.h();
          if (param0 != -16183) {
            oj var5 = (oj) null;
            pl.a((byte) -53, (oj) null, -107);
          }
          for (var3 = 0; var3 < 15; var3++) {
            var2.a(-2, -2, 16777215);
            si.d(4, 4, 0, 0, 540, 140);
          }
          ti.field_c.a();
          var1.f(0, 0);
          eh.b(false);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "pl.C(" + param0 + ')');
        }
    }

    final static void a(byte param0, oj param1, int param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (!param1.field_n && (!(0 >= ln.field_a.field_i[param2]) ||
            !(0 >= ln.field_a.field_i[-1 + param2]) ||
            !(ln.field_a.field_i[-ln.field_a.field_d + (param2 - 1)] <= 0))) {
            param1.field_n = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            if (param1.field_n &&
              0 < nl.field_d) {
              if (al.field_Q < 160) {
                al.field_Q = al.field_Q + 50;
                jh.a(3 * uh.field_i / 2, (byte) 69, 41, jc.field_c, 6);
              }
              param1.a(false, 0, 21963, 1, rl.field_c, param1.field_j);
              param1.field_l.a(0.9, 0.9, 1);
              mm.field_m[el.field_j] = new oj(param1.field_j, 232, rl.field_c);
              mm.field_m[el.field_j].field_e = 250;
              mm.field_m[el.field_j].field_b = false;
              mm.field_m[el.field_j].field_w = 0;
              el.field_j = el.field_j + 1;
              return;
            }
          }
          boolean decompiledFrameRemainder1 = true;
          if (param1.field_I <= 0 &&
            param1.field_w != 5) {
            if (al.field_Q < 160) {
              al.field_Q = al.field_Q + 50;
              jh.a(uh.field_i * 3 / 2, (byte) 41, 41, jc.field_c, 6);
            }
            param1.field_z = 0;
            param1.field_w = 5;
            param1.e((byte) -49);
            if ((ln.field_a.field_c[param2] == 4)) {
              ln.field_a.field_c[param2] = 0;
            }
            decompiledFrameRemainder1 = false;
          }
          else {
            if (param1.field_I > 0 && (ln.field_a.field_c[param2] == 0 ||
              1 == ln.field_a.field_c[param2])) {
              ln.field_a.field_c[param2] = 4;
            }
          }
          if (param0 < 101) {
            return;
          }
          if (param1.field_I <= 0 &&
            param1.field_i == 24) {
            param1.a(false, 0, 21963, 1, rl.field_c, param1.field_j);
            param1.field_l.a(0.9, 0.9, 1);
            mm.field_m[el.field_j] = new oj(param1.field_j, 232, rl.field_c);
            mm.field_m[el.field_j].field_e = 250;
            mm.field_m[el.field_j].field_b = false;
            mm.field_m[el.field_j].field_w = 0;
            el.field_j = el.field_j + 1;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("pl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var6 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param2 == null) {
            return false;
          }
          var3_int = param2.length();
          if (1 > var3_int) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = mf.a(false, param2);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!rg.a((byte) -109, var4.charAt(0)) &&
              !rg.a((byte) -109, var4.charAt(-1 + var4.length()))) {
              var5 = 0;
              if (param1 != 12864) {
                field_f = (bd) null;
              }
              for (var6 = 0; param2.length() > var6; var6++) {
                var7 = param2.charAt(var6);
                if (!rg.a((byte) -109, (char) var7)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (2 <= var5 &&
                  !param0) {
                  return false;
                }
              }
              if (0 >= var5) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("pl.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    static {
        field_q = new nd(9, 0, 4, 1);
        field_l = false;
        field_k = false;
        field_a = "Friends can be added in multiplayer<nbsp>games";
        field_i = new byte[250][];
    }
}
