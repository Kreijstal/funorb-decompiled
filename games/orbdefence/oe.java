/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends o {
    private int[][] field_l;
    private int[] field_k;
    private int[] field_o;
    static boolean field_p;
    static String field_q;
    private String[] field_n;
    static String field_m;

    final void a(byte param0, mg param1) {
        int var3_int = 0;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          while (true) {
            var3_int = param1.b((byte) 90);
            if (var3_int != 0) {
              this.a(param1, var3_int, -3);
              continue;
            }
            break;
          }
          if (param0 != 67) {
            var5 = (String) null;
            oe.a(-111, (String) null, -88);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("oe.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(mg param0, int param1, int param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ba var7 = null;
        int var9 = 0;
        String var10 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param2 != -3) {
            var10 = (String) null;
            oe.a(-30, (String) null, -63);
          }
          if (param1 == 1) {
            this.field_n = g.a(87, '<', param0.g(2));
          } else {
            if (param1 == 2) {
              var4_int = param0.b((byte) 90);
              this.field_o = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_o[var5] = param0.j(param2 + 98203179);
              }
            } else if (param1 == 3) {
              var4_int = param0.b((byte) 90);
              this.field_k = new int[var4_int];
              this.field_l = new int[var4_int][];
              for (var5 = 0; var4_int > var5; var5++) {
                var6 = param0.j(98203176);
                var7 = wg.a(var6, -128);
                if (var7 != null) {
                  this.field_k[var5] = var6;
                  array$0 = new int[var7.field_f];
                  this.field_l[var5] = array$0;
                  for (var8 = 0; var8 < var7.field_f; var8++) {
                    this.field_l[var5][var8] = param0.j(98203176);
                  }
                }
              }
            } else {
              if (param1 == 4) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("oe.C(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void f(int param0) {
        if (param0 != -12563) {
          field_m = (String) null;
        }
        field_m = null;
        field_q = null;
    }

    private final String e(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = OrbDefence.field_D ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == this.field_n) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_n[0]);
        for (var3 = 1; this.field_n.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_n[var3]);
        }
        if (param0 >= -47) {
          return (String) null;
        }
        return var2.toString();
    }

    final static og a(boolean param0, byte param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        se var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        se var8 = null;
        oe var9 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        var8 = cd.field_t;
        var2 = var8;
        var3 = var8.b((byte) 90);
        stackIn_3_0 = ((128 & var3) != 0);
        ja.field_e = stackIn_3_0;
        wb.field_d = var3 & 127;
        bh.field_c = var8.b((byte) 90);
        tf.field_l = var8.c((byte) -89);
        if (wb.field_d == 2) {
          pc.field_X = var8.j(98203176);
          gb.field_b = var8.a((byte) -30);
        } else {
          pc.field_X = 0;
          gb.field_b = 0;
        }
        stackIn_9_0 = (var8.b((byte) 90) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        l.field_f = var8.g(2);
        if (var4 != 0) {
          vk.field_v = var8.g(2);
        } else {
          vk.field_v = l.field_f;
        }
        if (param1 > -52) {
          return (og) null;
        }
        if (wb.field_d == 1 ||
          4 == wb.field_d) {
          var8.j(98203176);
          var8.g(2);
        }
        if (param0) {
          var5 = var8.j(98203176);
          try {
            var9 = aa.field_d.b(-11244, var5);
            vj.field_a = var9.e(-50);
            if (vk.field_v.equals(gb.field_h)) {
              stackIn_24_0 = null;
            } else {
              stackIn_24_0 = var9.field_o;
            }
            n.field_c = stackIn_24_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            pe.a((byte) -13, (Throwable) ((Object) var6), "CC1");
            n.field_c = null;
            vj.field_a = null;
          }
        } else {
          vj.field_a = hi.a(80, -111, var8);
          n.field_c = null;
        }
        return new og(param0);
    }

    oe() {
    }

    final static qj a(int param0, String param1, int param2) {
        qj var3 = null;
        RuntimeException var3_ref = null;
        qj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -3) {
            field_q = (String) null;
          }
          var3 = new qj(false);
          var3.field_e = param1;
          var3.field_b = param0;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("oe.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = OrbDefence.field_D ? 1 : 0;
        int var2Lifetime1;
        if (this.field_o != null) {
          for (var2 = 0; var2 < this.field_o.length; var2++) {
            this.field_o[var2] = ge.a(this.field_o[var2], 32768);
          }
        }
        var2Lifetime1 = 73 / ((64 - param0) / 47);
    }

    static {
        field_q = "Orbsome";
        field_m = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_p = false;
    }
}
