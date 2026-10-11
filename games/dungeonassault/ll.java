/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ll extends ne {
    static boolean field_k;
    static md field_i;
    static String[] field_j;
    static nh field_r;
    static String field_s;
    ll field_n;
    static String[] field_m;
    static vk field_p;
    static String field_u;
    ll field_l;
    long field_o;
    static cn field_q;
    static String[] field_t;

    final static void a(int param0, byte[] param1, boolean param2, int param3, int[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        try {
          var5_int = 0;
          while (true) {
            if (gg.field_a.length <= var5_int) {
              if (param2) {
                return;
              }
              field_j = (String[]) null;
              return;
            }
            param0 = gg.field_a[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param0;
              param0--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param3 = hf.field_yb[incrementValue$1];
              dupTemp$2 = param1[param3];
              dupTemp$3 = param4[dupTemp$2];
              param4[dupTemp$2] = dupTemp$3 + 1;
              hf.field_yb[dupTemp$3] = param3;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ll.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        rf.field_K = new fm(ck.field_H);
        le.field_b = new gn[25][];
        le.field_b[0] = lc.a(-27711, new String[][]{bh.field_J, nf.field_C});
        le.field_b[1] = lc.a(-27711, new String[][]{rl.field_e, co.field_J});
        int var1 = -50 % ((30 - param0) / 40);
        le.field_b[2] = lc.a(-27711, new String[][]{p.field_J, je.field_f, og.field_a, h.field_y});
        le.field_b[3] = lc.a(-27711, new String[][]{pp.field_E, np.field_C});
        le.field_b[4] = lc.a(-27711, new String[][]{eg.field_b, lp.field_q, lb.field_d, le.field_c});
        le.field_b[5] = lc.a(-27711, new String[][]{bn.field_m, lp.field_q, ka.field_d});
        le.field_b[6] = lc.a(-27711, new String[][]{rl.field_i, lb.field_d, le.field_c});
        le.field_b[7] = lc.a(-27711, new String[][]{tp.field_C, lp.field_F, nl.field_f, field_j});
        le.field_b[8] = lc.a(-27711, new String[][]{bb.field_t, ka.field_d});
        le.field_b[9] = lc.a(-27711, new String[][]{eh.field_e, bk.field_f});
        le.field_b[10] = lc.a(-27711, new String[][]{hj.field_O});
        le.field_b[11] = lc.a(-27711, new String[][]{ek.field_j});
        le.field_b[12] = lc.a(-27711, new String[][]{rm.field_S});
        le.field_b[13] = lc.a(-27711, new String[][]{wl.field_c});
        le.field_b[14] = lc.a(-27711, new String[][]{ha.field_j});
        le.field_b[15] = lc.a(-27711, new String[][]{qa.field_e});
        le.field_b[16] = lc.a(-27711, new String[][]{tl.field_m});
        le.field_b[17] = lc.a(-27711, new String[][]{ug.field_M});
        le.field_b[18] = lc.a(-27711, new String[][]{qh.field_E, dg.field_O});
        le.field_b[19] = lc.a(-27711, new String[][]{tg.field_e, uo.field_g});
        le.field_b[20] = lc.a(-27711, new String[][]{hh.field_n, fj.field_a, k.field_a});
        le.field_b[21] = lc.a(-27711, new String[][]{rn.field_g});
        le.field_b[22] = lc.a(-27711, new String[][]{kg.field_e});
        le.field_b[23] = lc.a(-27711, new String[][]{vf.field_A, qd.field_e, rk.field_k, un.field_b});
        le.field_b[24] = lc.a(-27711, new String[][]{tp.field_A});
        if (!(kd.field_c <= 25)) {
          kd.field_c = 0;
        }
        uo.field_f = le.field_b[kd.field_c];
        if (!(fc.field_d <= uo.field_f.length)) {
          fc.field_d = 0;
        }
        og.a(false, 0, uo.field_f[fc.field_d]);
    }

    final void b(byte param0) {
        if (this.field_l == null) {
          return;
        }
        this.field_l.field_n = this.field_n;
        if (param0 == -2) {
          this.field_n.field_l = this.field_l;
          this.field_l = null;
          this.field_n = null;
          return;
        }
        field_t = (String[]) null;
        this.field_n.field_l = this.field_l;
        this.field_l = null;
        this.field_n = null;
    }

    public static void a(byte param0) {
        field_i = null;
        field_t = null;
        field_p = null;
        field_r = null;
        field_j = null;
        if (param0 == 92) {
          field_u = null;
          field_q = null;
          field_s = null;
          field_m = null;
          return;
        }
        String var2 = (String) null;
        ll.a((String) null, (byte) 100);
        field_u = null;
        field_q = null;
        field_s = null;
        field_m = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        try {
          gf.b(param1, param4, param2 + 1, 10000536);
          gf.b(param1, param3 + param4, 1 + param2, 12105912);
          var5_int = 1;
          var6 = param3;
          if (param0 != 2) {
            field_s = (String) null;
          }
          if (gf.field_f > var5_int + param4) {
            var5_int = -param4 + gf.field_f;
          }
          if (var6 + param4 > gf.field_e) {
            var6 = -param4 + gf.field_e;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = 152 + var7 * 48 / param3;
            var9 = var8 | (var8 << 8 | var8 << 16);
            gf.field_b[param1 + (param4 + var7) * gf.field_i] = var9;
            gf.field_b[(var7 + param4) * gf.field_i + (param1 + param2)] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var5), "ll.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(byte param0, Random param1, int[] param2, int[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -110) {
            return true;
          }
          var4_int = uj.a(param1, 37, param3.length);
          stackIn_4_0 = mo.a(param2, param3[var4_int], param1, (byte) -74);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ll.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static bo a(String param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        bo var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        bo stackIn_16_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          if (fk.field_v == null) {
            return null;
          }
          if (param0 == null) {
            return null;
          }
          if (param0.length() == 0) {
            return null;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = jm.a((byte) 59, var6);
          if (var2 == null) {
            return null;
          }
          var3 = (bo) (fk.field_v.a((byte) 125, (long)var2.hashCode()));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_Hb);
            var4 = jm.a((byte) 59, var7);
            if (var4.equals(var2)) {
              stackIn_16_0 = var3;
              return stackIn_16_0;
            }
            var3 = (bo) (fk.field_v.c((byte) 5));
          }
          if (param1 == -47) {
            return null;
          }
          ll.a((byte) 52);
          stackIn_21_0 = null;
          return (bo) (stackIn_21_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("ll.F(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    protected ll() {
    }

    static {
        field_s = "Magical Guardian";
        field_u = "Crusher";
        field_j = new String[]{null, "Another option is to <%flee>. If the raider survives at least one combat round, they may be able to escape the room (if they win a <%dodge> roll against the room's <%snare>), allowing you to send a different raider in to face it, or to seek a different route entirely.<br><br><%command>Select one of these strategies now.</col>"};
        field_i = new md();
        field_t = new String[]{"Ferocity", "The <%0> is able to channel his fury into a violent flurry of blows; during the first round of each combat, his <%attack> is doubled."};
    }
}
