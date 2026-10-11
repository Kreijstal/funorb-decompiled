/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao {
    static String field_b;
    static String field_c;
    static String field_a;
    static int field_f;
    static int[] field_h;
    static int[] field_e;
    static boolean field_d;
    static int field_g;

    final static void a(String[] args, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -125) {
            field_a = (String) null;
          }
          if (da.field_d != null) {
            da.field_d.field_G.a(args, (byte) -37);
          }
          if (null == oa.field_c) {
            return;
          }
          oa.field_c.field_M.a(args, (byte) -100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ao.B(");
          if (args == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, String param2, String param3, int param4, String param5) {
        jg var6 = null;
        RuntimeException var6_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new jg(param4, param3, param0, param5, param2);
          vd.a(var6, (byte) -74);
          if (param1 > 68) {
            return;
          }
          ao.b(-83);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_5_0 = var6_ref;
          stackIn_5_1 = new StringBuilder().append("ao.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(long param0, int param1) {
        if (0L >= param0) {
          return;
        }
        if (param1 != 1) {
          field_a = (String) null;
          if (param0 % 10L != 0L) {
            ng.a(true, param0);
            return;
          }
          ng.a(true, -1L + param0);
          ng.a(true, 1L);
          return;
        }
        if (param0 % 10L != 0L) {
          ng.a(true, param0);
          return;
        }
        ng.a(true, -1L + param0);
        ng.a(true, 1L);
    }

    final static int a(boolean param0) {
        if (!param0) {
          ao.a(-63, -91, 35);
          return rf.field_o;
        }
        return rf.field_o;
    }

    final static void a(int param0) {
        if (param0 != 5623) {
          ao.b(-55);
        }
    }

    final static void a(byte param0) {
        int var3 = 0;
        int var3Lifetime1;
        fh.field_g = de.field_e;
        ri.field_a = de.field_j;
        vc.a((byte) -128);
        aj.field_h.a(0, 0, -40 + (k.field_d.field_I - 2), k.field_d.field_x, 5);
        kg.field_c.a(se.field_H.field_x, 0, 0, ga.field_r, (byte) -120);
        int var1 = 2 + ga.field_r;
        mj.field_s.a(se.field_H.field_x, 0, !fc.field_a ? 0 : var1, -(fc.field_a ? var1 : 0) + se.field_H.field_I, (byte) -120);
        ie.l((byte) 100);
        ii.field_b.a(k.field_d.field_x, 0, k.field_d.field_I - 40, 40, (byte) -120);
        sm.field_c.a(fn.field_e.field_x, 0, 0, 30, (byte) -120);
        ad.field_c.a(fn.field_e.field_x, 0, 30, -30 + (-40 + (fn.field_e.field_I - 2)), (byte) -120);
        tj.field_o.a(68, 5, 5, 30, (byte) -120);
        hg.field_e.a(78, 75, 5, 30, (byte) -120);
        ci.field_a.a(48, 155, 5, 30, (byte) -120);
        lo.field_r.a(48, 205, 5, 30, (byte) -120);
        int var2 = !fc.field_a ? 200 : 250;
        vc.field_j.a(-var2 + 363, 5 + var2, 5, 30, (byte) -120);
        jo.field_a.a(-10 + fn.field_e.field_x - 365, 370, 5, 30, (byte) -120);
        ee.field_g.a(37, nn.field_p, -5 + (-5 + ad.field_c.field_x), false, 5, -5 + (ad.field_c.field_I - 5) - 32, 2);
        if (param0 <= -111) {
          var3 = (fn.field_e.field_x + 2) / 2;
          of.field_a.a(-2 + var3, 0, fn.field_e.field_I - 40, 40, (byte) -120);
          if (!fc.field_a) {
            var3 = 0;
          }
          jl.field_a.a(fn.field_e.field_x - var3, var3, fn.field_e.field_I - 40, 40, (byte) -120);
          return;
        }
        ao.a((byte) 81);
        var3Lifetime1 = (fn.field_e.field_x + 2) / 2;
        of.field_a.a(-2 + var3Lifetime1, 0, fn.field_e.field_I - 40, 40, (byte) -120);
        if (!fc.field_a) {
          var3Lifetime1 = 0;
        }
        jl.field_a.a(fn.field_e.field_x - var3Lifetime1, var3Lifetime1, fn.field_e.field_I - 40, 40, (byte) -120);
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_int = 0;
          if (param0 != 31128) {
            stackIn_3_0 = 73;
            return stackIn_3_0;
          }
          var4 = qe.field_o;
          while (pm.field_f.length > var3_int) {
            var5 = ln.field_M[var3_int];
            if (var5 < 0) {
              var4 = var4 + u.field_l;
            } else {
              var6 = lc.a(true, pm.field_f[var3_int], (byte) -97);
              var4 = var4 + ic.field_a;
              var7 = -(var6 >> 1) + af.field_Eb;
              if (bj.a(param2, 39, var4, var6 + (f.field_h << 1), tm.field_b + (uk.field_d << 1), param1, var7 - f.field_h)) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + (tm.field_b + ((uk.field_d << 1) + ic.field_a));
            }
            var3_int++;
          }
          stackIn_16_0 = -1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "ao.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 == 0) {
          field_e = null;
          field_h = null;
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        }
        field_a = (String) null;
        field_e = null;
        field_h = null;
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        field_f = 66;
        field_c = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_a = "MINION MASTER - ";
        field_b = " - Play the tutorial to learn how to use your spells.<br><br> - Never give up! Quitting halfway through a game counts as a forfeit, which will stop you from earning wands and buying more spells/spellbooks.<br><br> - Save your limited-use spells for when they can change the tide of a game.<br><br> - Don't waste a rechargeable spell on an easy target, you might want to use it again soon!<br><br> - Don't forget to use defence as well as offence. Deflecting an opponent's Meteor with a well-timed shield is a great boon.<br><br> - If you have a level 3 spell, save it until it will do the most damage.<br><br> - Keep refining your spellbook to find the combination that best suits your style of play.<br><br>";
        field_d = true;
    }
}
