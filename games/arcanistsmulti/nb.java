/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nb {
    static String field_e;
    static String field_c;
    private java.util.zip.Inflater field_b;
    static int field_a;
    static String field_f;
    static boolean field_d;

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 5) {
          return;
        }
        if (ah.field_c > 0) {
          if (ob.field_Y != null) {
            ka.field_m = ob.field_Y.a(param1 + 122);
            li.a(2, 0);
          } else {
            ka.field_m = ol.a(0, 0, false, fi.field_d, 480, 640);
          }
          if (null == ka.field_m) {
            var2 = 3;
          } else {
            n.a(ka.field_m, (byte) 118);
            var2 = 2;
          }
        } else {
          var2 = (lc.a((byte) 112)) ? 0 : 1;
        }
        if (null == ob.field_Y &&
          ri.field_f) {
          qa.a(param0, -4693, var2);
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        int var1 = 80 % ((8 - param0) / 56);
        field_f = null;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param3 >= param5) {
            return;
          }
          if (param4 <= param3 + 1) {
            return;
          }
          if (param4 > 5 + param3 &&
            param6 != param1) {
            var7_int = (1 & (param6 & param1)) + (param6 >> 1) + (param1 >> 1);
            var8 = param3;
            var9 = param6;
            var10 = param1;
            for (var11 = param3; var11 < param4; var11++) {
              var12 = ki.field_r[var11];
              if (!param0) {
                stackIn_23_0 = lm.field_i[var12];
              } else {
                stackIn_23_0 = nf.field_z[var12];
              }
              var13 = stackIn_23_0;
              if (var13 <= var7_int) {
                if (var10 < var13) {
                  var10 = var13;
                }
              } else {
                ki.field_r[var11] = ki.field_r[var8];
                incrementValue$0 = var8;
                var8++;
                ki.field_r[incrementValue$0] = var12;
                if (var9 > var13) {
                  var9 = var13;
                }
              }
            }
            nb.a(param0, var9, param2, param3, var8, param5, param6);
            nb.a(param0, param1, param2 + 0, var8, param4, param5, var10);
            return;
          }
          for (var7_intLifetime1 = param4 - 1; param3 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param3; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = ki.field_r[var8Lifetime1];
              var10Lifetime1 = ki.field_r[var8Lifetime1 + 1];
              if (bo.a(param0, var9Lifetime1, (byte) -76, var10Lifetime1)) {
                ki.field_r[var8Lifetime1] = var10Lifetime1;
                ki.field_r[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var7), "nb.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(String param0, long param1, int param2) {
        CharSequence var5 = null;
        try {
          nj.field_c = 2;
          so.field_p = param0;
          if (param2 != -26510) {
            field_a = -55;
          }
          var5 = (CharSequence) ((Object) param0);
          ua.field_S = gk.a(var5, -13);
          gg.field_e = param1;
          ef.field_r = true;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "nb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte[] param1, wk param2) {
        try {
          Exception exception = null;
          RuntimeException runtimeException = null;
          int var4_int = 0;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (31 == param2.field_j[param2.field_g] &&
              param2.field_j[1 + param2.field_g] == -117) {
              if (null == this.field_b) {
                this.field_b = new java.util.zip.Inflater(true);
              }
              var4_int = -109 % ((0 - param0) / 58);
              try {
                this.field_b.setInput(param2.field_j, 10 + param2.field_g, -18 + (-param2.field_g + param2.field_j.length));
                this.field_b.inflate(param1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_b.reset();
                throw new RuntimeException("");
              }
              this.field_b.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = runtimeException;
            stackIn_15_1 = new StringBuilder().append("nb.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private nb(int param0, int param1, int param2) {
    }

    public nb() {
        this(-1, 1000000, 1000000);
    }

    static {
        field_e = "On";
        field_c = "  When you bring a full spellbook, other than the arcane one, into a game, you gain the option of summoning that spellbook's familiar to help you out. Each familiar has a different effect that enchances your Arcanist and/or minions.";
        field_f = "Now for some fun: select the Rain of Fire spell.";
    }
}
