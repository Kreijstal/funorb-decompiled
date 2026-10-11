/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends vh {
    private int[] field_v;
    int[] field_r;
    private String[] field_t;
    static uh field_s;
    static String[] field_p;
    static String field_u;
    private int[][] field_q;

    final static java.awt.Canvas d(int param0) {
        if (param0 <= 59) {
          field_u = (String) null;
        }
        return null == a.field_b ? ae.field_G : (java.awt.Canvas) ((Object) a.field_b);
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = Terraphoenix.field_V;
        if (param0 >= -9) {
          this.field_t = (String[]) null;
        }
        if (this.field_r != null) {
          for (var2 = 0; this.field_r.length > var2; var2++) {
            this.field_r[var2] = ei.b(this.field_r[var2], 32768);
          }
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        field_p = null;
        field_u = null;
        field_s = null;
    }

    final static boolean b(int param0, int param1) {
        if (param0 == -1) {
          return true;
        }
        int var2 = 24 / ((param1 - 21) / 53);
        return (Terraphoenix.field_O & 1 << param0) != 0 ? true : false;
    }

    final static void a(int param0, pk param1, int param2, int param3, ci[] param4, int param5, ci[] param6, byte param7, int param8, int param9, int param10, int param11, int param12, ci[] param13, int param14, int param15, pk param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          gj.a(new bm(param4), new bm(param13), 0, param3, param1, param11, param17, param12, param8, param20, param19, param9, param10, param5, new bm(param6), param18, param0, param16, param14, param2, param15);
          if (param7 != 77) {
            mb.d(-5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_5_0 = var21;
          stackIn_5_1 = new StringBuilder().append("mb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final void a(dh param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Terraphoenix.field_V;
        try {
          while (true) {
            var3_int = param0.a(-16384);
            if (var3_int != 0) {
              this.a(param0, (byte) 126, var3_int);
              continue;
            }
            break;
          }
          if (!param1) {
            this.field_v = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("mb.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(boolean param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = Terraphoenix.field_V;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.field_t == null) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_t[0]);
        for (var3 = 1; this.field_t.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_t[var3]);
        }
        if (param0) {
          this.field_t = (String[]) null;
        }
        return var2.toString();
    }

    private final void a(dh param0, byte param1, int param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        rh var7 = null;
        int var9 = 0;
        var9 = Terraphoenix.field_V;
        try {
          if (param2 != 1) {
            if (param2 == 2) {
              var4_int = param0.a(-16384);
              this.field_r = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_r[var5] = param0.i(-25578);
              }
            } else {
              if (3 == param2) {
                var4_int = param0.a(-16384);
                this.field_q = new int[var4_int][];
                this.field_v = new int[var4_int];
                for (var5 = 0; var4_int > var5; var5++) {
                  var6 = param0.i(-25578);
                  var7 = di.a((byte) 33, var6);
                  if (var7 != null) {
                    this.field_v[var5] = var6;
                    array$0 = new int[var7.field_a];
                    this.field_q[var5] = array$0;
                    for (var8 = 0; var7.field_a > var8; var8++) {
                      this.field_q[var5][var8] = param0.i(-25578);
                    }
                  }
                }
              } else {
                if (4 != param2) {
                }
              }
            }
          } else {
            this.field_t = nc.a(14352, param0.e(-1), '<');
          }
          if (param1 <= 111) {
            mb.b(13, 47);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("mb.G(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    mb() {
    }

    static {
        field_p = new String[]{"Research screen", "<col=fcfe7f>RESEARCH GROUP<br></col>A flashing icon denotes unresearched items.", "<col=fcfe7f>GROUP LIST<br></col>A blue highlight shows unresearched topics.", "Data and description of the current topic.", "<col=fcfe7f>RESEARCH STATUS<br></col>Click here to research a new topic if available.", "Exit to mission select screen.", "Here you can research new items of equipment to help your soldiers.  After certain missions, research points will be earned and you will be taken here to select the new topic. After researching topics you should then go to the equipment screen and manufacture the new items for your squad."};
        field_u = "2500pts";
    }
}
