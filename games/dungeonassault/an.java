/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an extends hh {
    static String field_C;
    static String field_D;
    static int field_w;
    static String field_y;
    private pi[] field_B;
    static String[] field_F;
    static int field_E;
    private pi field_A;
    static String field_x;
    static String field_z;

    final pi a(int param0, byte param1) {
        if (param1 > -81) {
          cn[] var4 = (cn[]) null;
          this.a(65, (cn[]) null, -101);
        }
        pi dupTemp$0 = new pi();
        this.field_B[param0] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(byte param0, cn param1) {
        int var4 = 0;
        pi[] var3 = null;
        pi var5 = null;
        int var6 = 0;
        pi[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = DungeonAssault.field_K;
        try {
          var7 = this.field_B;
          var3 = var7;
          if (param0 != 47) {
            return;
          }
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_d = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("an.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static String a(int param0, byte param1, int param2, String param3) {
        RuntimeException var4 = null;
        String stackIn_5_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -109) {
            an.c(26);
          }
          if (param3 == null) {
            stackIn_5_0 = ng.field_K;
          } else {
            stackIn_5_0 = (String) (param3);
          }
          param3 = stackIn_5_0;
          stackIn_6_0 = ln.a(param2, ib.a((byte) -126, param0, param3), 255);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("an.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_y = null;
        field_z = null;
        if (param0 != -13023) {
          field_y = (String) null;
        }
        field_x = null;
        field_C = null;
        field_F = null;
        field_D = null;
    }

    an(an param0, boolean param1) {
        this();
        try {
          param0.a(0, this, param1);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "an.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5, int param6, int param7, qg param8) {
        try {
          of.field_d = param4;
          ri.field_b = param0;
          ng.field_I = param6;
          lk.field_T = param3;
          kn.field_f = param8;
          if (param2 >= -55) {
            field_w = -6;
          }
          bf.field_k = param1;
          j.field_J = param5;
          pj.field_a = param7;
          hb.field_a = (bb) ((Object) new tp());
          na.field_y = new cc(param8);
          bl.field_r = new je(hb.field_a, na.field_y);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "an.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        lm stackIn_3_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        pi var7 = null;
        pi var9 = null;
        cn[] var10 = null;
        ck var11 = null;
        pi var12 = null;
        pi var13 = null;
        pi var14 = null;
        pi var15 = null;
        try {
          if (param1 instanceof ck) {
            stackIn_3_0 = (lm) (param1);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (ck) (stackIn_3_0);
          d.a(param1.field_q + param2, param1.field_s + (param1.field_v + param3), param1.field_x + param2 + param1.field_q, param1.field_v + param3, false);
          if (var11 != null) {
            param4 = param4 & var11.field_B;
          }
          var7 = this.field_B[0];
          this.field_A.b(0);
          var7.a(param1, (byte) 100, this.field_A, param3, this, param2);
          if (var11 != null) {
            if (var11.field_E) {
              var12 = this.field_B[1];
              if (var12 != null) {
                var12.a(param1, (byte) 100, this.field_A, param3, this, param2);
              }
            }
            if (var11.field_u) {
              var13 = this.field_B[3];
              if (var11.field_y != 0 &&
                var13 != null) {
                var13.a(param1, (byte) 100, this.field_A, param3, this, param2);
              } else {
                var9 = this.field_B[2];
                if (var9 != null) {
                  var9.a(param1, (byte) 100, this.field_A, param3, this, param2);
                }
              }
            }
          }
          if (param1.a((byte) 20)) {
            var14 = this.field_B[5];
            if (var14 != null) {
              var14.a(param1, (byte) 100, this.field_A, param3, this, param2);
            }
          }
          if (!param4) {
            var15 = this.field_B[4];
            if (var15 != null) {
              var15.a(param1, (byte) 100, this.field_A, param3, this, param2);
            }
          }
          this.field_A.a(0, param1, param3, param2, this);
          ti.c(true);
          if (param0 != 34) {
            var10 = (cn[]) null;
            this.a(117, (cn[]) null, 121);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_30_0 = var6;
          stackIn_30_1 = new StringBuilder().append("an.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, cn[] param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = param0;
          if (this.field_B[var4_int] == null) {
            this.field_B[var4_int] = new pi();
          }
          int var5 = -96 % ((-66 - param2) / 49);
          this.field_B[param0].field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "an.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(cn[] param0, int param1) {
        int var4 = 0;
        pi[] var3 = null;
        pi var5 = null;
        int var6 = 0;
        pi[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = DungeonAssault.field_K;
        try {
          var7 = this.field_B;
          var3 = var7;
          for (var4 = param1; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_e = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("an.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, an param1, boolean param2) {
        int var4_int = 0;
        pi dupTemp$0 = null;
        pi stackIn_10_0 = null;
        boolean stackIn_10_1 = false;
        pi stackIn_11_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        pi var5 = null;
        pi var6 = null;
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        try {
          if (param0 != 0) {
            an.c(98);
          }
          super.a((byte) 127, param1);
          if (param2) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_B[var4_int];
              if (var5 == null) {
                param1.field_B[var4_int] = null;
              } else {
                var6 = param1.field_B[var4_int];
                stackIn_10_0 = var5;
                stackIn_10_1 = true;
                if (var6 != null) {
                  stackIn_11_2 = var6;
                } else {
                  dupTemp$0 = new pi();
                  param1.field_B[var4_int] = dupTemp$0;
                  stackIn_11_2 = dupTemp$0;
                }
                ((pi) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_11_2);
              }
            }
            return;
          }
          cj.a(this.field_B, 0, param1.field_B, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("an.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public an() {
        this.field_B = new pi[6];
        this.field_A = new pi();
        pi dupTemp$0 = new pi();
        this.field_B[0] = dupTemp$0;
        pi var1 = dupTemp$0;
        var1.b(0);
    }

    static {
        field_C = "You gain an additional 1 Renown per hour.";
        field_D = "When entering a trap room, the only choice is to continue. The trap must first attempt to detect a raider by rolling it's Detect against a raider's Sneak. If the raider is detected, they must then attempt to Dodge (against the trap's Snare). If the raider fails both rolls, the trap is triggered.";
        field_y = "TRAP";
        field_F = new String[]{"First Strike", "The <%0> has a penchant for wildly charging into combat; such is the speed of his attack, he is guaranteed the first strike even against the most watchful of adversaries."};
        field_z = "Player names can be up to 12 letters, numbers and underscores";
        field_x = "Vampires have an eternal thirst for raider blood; they're strong, fast and very hard to kill.<br><br>Each time this monster kills, its <%attack> and <%defence> increase by 1.";
    }
}
