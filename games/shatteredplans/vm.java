/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vm extends qr {
    private int field_xb;
    static int field_Bb;
    private int field_Eb;
    private int field_Qb;
    private vm field_Ob;
    private sg[] field_Kb;
    private int field_Mb;
    static qr field_Cb;
    static boolean field_Nb;
    static String field_Lb;
    private int field_Ib;
    private int field_Pb;
    static String field_Fb;
    private char[] field_zb;
    private int[] field_Hb;
    private int field_Db;
    private vm[] field_yb;
    private int field_Gb;
    static qr field_Ab;
    static bi field_Jb;

    final void h(int param0) {
        int var3 = 0;
        sg var4 = null;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        sg[] var6 = this.field_Kb;
        sg[] var2 = var6;
        for (var3 = param0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.field_rb = 0;
          var4.field_bb = false;
        }
        if (null != this.field_Ob) {
          this.field_Ob.h(0);
          this.field_Ob.b((byte) -128);
        }
        this.field_Ob = null;
        this.field_Gb = -1;
        this.c(false, 12);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = ShatteredPlansClient.field_F ? 1 : 0;
        int var7Lifetime1;
        this.field_Eb = this.field_Ib + param1 * 2;
        this.a(this.field_Eb, this.field_xb, (byte) 77, param5 - this.field_xb, param3);
        if (this.field_Mb != param2) {
          this.field_Mb = param2;
          this.c(false, this.field_Db);
        }
        for (var7 = 0; this.field_Pb > var7; var7++) {
          this.field_Kb[var7].a(50, this.field_Qb, this.field_Kb[var7].field_db, param1, param4, this.field_Eb, 0);
        }
        if (this.field_Gb != param0 &&
          this.field_yb[this.field_Gb] != null) {
          var7Lifetime1 = this.field_yb[this.field_Gb].field_Pb;
          for (var8 = this.field_Qb * (var7Lifetime1 + this.field_Gb) + this.field_db; param5 < var8; var8 = var8 - this.field_Qb) {
          }
          this.field_yb[this.field_Gb].a(-1, param1, this.field_Kb[this.field_Gb].field_N, param3 + this.field_Eb, param4, var8);
        }
    }

    final static int a(String param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            vm.g(-38);
          }
          if (!param2) {
            stackIn_6_0 = um.field_c.c(param0);
            return stackIn_6_0;
          }
          stackIn_4_0 = ql.field_n.c(param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vm.SA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int g(boolean param0) {
        if (param0) {
          this.c(true, -94);
        }
        return this.field_Eb + (this.field_Ob != null ? this.field_Ob.g(param0) : 0);
    }

    final void a(int param0, int param1, byte param2) {
        int var4_int = 0;
        sg var5;
        int var6;
        sg stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        vm var4;
        vm var7;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var4_int = 0; this.field_Kb.length > var4_int; var4_int++) {
          var5 = this.field_Kb[var4_int];
          if (1 == var5.field_rb) {
            this.a(0, param1, var4_int, param0);
            stackIn_7_0 = var5;
            stackIn_8_1 = (this.field_Gb == var4_int);
            stackIn_7_0.field_bb = stackIn_8_1;
          }
        }
        if (param2 > -101) {
          vm.g(96);
        }
        if (this.field_Gb != -1) {
          var7 = this.field_yb[this.field_Gb];
          var4 = var7;
          if (var4 != null) {
            var7.a(param0, param1, (byte) -121);
          }
        }
        if (this.field_Db > 0) {
          this.c(false, -1 + this.field_Db);
        }
    }

    final static String a(long param0, int param1) {
        i.field_e.setTime(new Date(param0));
        int var3 = i.field_e.get(7);
        int var4 = i.field_e.get(5);
        int var5 = i.field_e.get(2);
        if (param1 != 10) {
          return (String) null;
        }
        int var6 = i.field_e.get(1);
        int var7 = i.field_e.get(11);
        int var8 = i.field_e.get(12);
        int var9 = i.field_e.get(13);
        return j.field_q[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + qa.field_o[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 0) {
          field_Lb = (String) null;
        }
        if (this.field_Gb == param2) {
          this.h(0);
          this.c(false, 0);
        } else {
          if (null != this.field_yb[param2]) {
            this.h(0);
            this.c(false, 0);
            this.field_Gb = param2;
            this.field_Ob = this.field_yb[this.field_Gb];
            ee.a(this.field_Ob, true);
            this.field_Ob.c(false, 12);
          } else {
            if (this.field_Hb[param2] != -1) {
              var5 = 32768 | this.field_Hb[param2];
              var6 = em.field_h;
              if (var6 == 0 &&
                null != np.field_a) {
                var6 = 1;
              }
              if (2 == id.a(-7019, var6)) {
                gb.a((byte) 75, param1, 1, var6);
              }
              String var8 = (String) null;
              ih.a(gi.field_a, 2, var5, em.field_h, (String) null, param3);
              un.a(gi.field_a, (byte) 123, hd.field_k, em.field_h, var5);
              jp.g((byte) 119);
              dc.a(-5883);
            } else {
              mm.d(param0 ^ -16705);
              jp.g((byte) 119);
            }
          }
        }
    }

    private final void c(boolean param0, int param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_Db = param1;
        if (param0) {
          field_Bb = 20;
        }
        for (var5 = 0; this.field_Pb > var5; var5++) {
          var3 = this.field_Qb * var5;
          var4 = this.field_Db * this.field_Db;
          this.field_Kb[var5].field_db = ((-this.field_N + this.field_Mb) * var4 + var3 * (144 - var4)) / 144;
        }
    }

    final boolean f(boolean param0) {
        int var4 = 0;
        sg var5 = null;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = param0 ? 1 : 0;
        sg[] var3 = this.field_Kb;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          var2 = var2 | (var5.field_rb != 0 ? 1 : 0);
        }
        if (var2 == 0 && this.field_Gb != -1 &&
          null != this.field_yb[this.field_Gb]) {
          var2 = this.field_yb[this.field_Gb].f(param0) ? 1 : 0;
        }
        return var2 != 0;
    }

    final boolean a(int param0, boolean param1, int param2) {
        int var6 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1) {
          String var8 = (String) null;
          vm.a((String) null, -29, (String) null, (String) null);
        }
        int var4 = oq.field_j == 85 ? 1 : 0;
        if (this.field_Ob != null) {
          if (var4 != 0 &&
            this.field_Ob.field_Gb == -1) {
            this.h(0);
            this.c(param1, 0);
            return true;
          }
          return this.field_Ob.a(param0, param1, param2);
        }
        if (this.field_Ob == null && this == mr.field_h &&
          var4 != 0) {
          jp.g((byte) 92);
          return true;
        }
        int var5 = ho.field_h;
        if (0 >= var5) {
          return false;
        }
        if (hg.field_p == var5) {
          var5 = 63;
        }
        for (var6 = 0; var6 < this.field_zb.length; var6++) {
          if (var5 == this.field_zb[var6]) {
            this.a(0, param0, var6, param2);
            return true;
          }
        }
        return false;
    }

    vm(long param0, qr param1, qr param2, qr param3, vm[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        int var13 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        Object var14 = null;
        int var15 = 0;
        nq var17 = null;
        nq var18 = null;
        this.field_Gb = -1;
        try {
          this.field_Hb = param5;
          this.field_zb = param7;
          this.field_yb = param4;
          this.field_Pb = this.field_Hb.length;
          var17 = param3.field_nb;
          var18 = var17;
          this.field_Qb = var18.field_q + 2 + var18.field_J;
          this.field_xb = this.field_Qb * this.field_Pb;
          this.field_Kb = new sg[this.field_Pb];
          this.field_Ib = 0;
          var11 = "<col=999999>";
          var12 = "</col>";
          for (var13 = 0; this.field_Pb > var13; var13++) {
            if (0 < this.field_zb[var13]) {
              param6[var13] = var11 + sn.a(this.field_zb[var13], (byte) -86).toUpperCase() + ": " + var12 + param6[var13];
            }
            var14 = null;
            if (this.field_yb[var13] != null ||
              this.field_Hb[var13] == -1) {
              var14 = jq.field_c;
            }
            this.field_Kb[var13] = new sg(0L, param2, (qr) null, param3, (bi) (var14), param6[var13]);
            this.a(4, this.field_Kb[var13]);
            var15 = var17.c(param6[var13]);
            if (this.field_Ib < var15) {
              this.field_Ib = var15;
            }
          }
          this.field_Ib = this.field_Ib + (jq.field_c.field_o + 10);
          this.c(false, 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("vm.<init>(").append(param0).append(',');
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
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param7 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_Jb = null;
        field_Fb = null;
        if (param0 != -22521) {
          vm.g(-73);
        }
        field_Cb = null;
        field_Ab = null;
        field_Lb = null;
    }

    final static String a(String param0, int param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_3_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var6Lifetime1;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 <= 38) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var4_int = param3.length();
          var5 = var4_int;
          var6 = 0;
          var7 = "<%" + param2 + ">";
          while (true) {
            var8_int = param3.indexOf(var7, var6);
            if (var8_int >= 0) {
              var6 = var8_int + var7.length();
              var5 = var5 + (param0.length() - var7.length());
              continue;
            }
            break;
          }
          var6Lifetime1 = 0;
          var8 = new StringBuilder(var5);
          while (true) {
            var9 = param3.indexOf(var7, var6Lifetime1);
            if (var9 < 0) {
              discarded$0 = var8.append(param3.substring(var6Lifetime1, var4_int));
              stackIn_14_0 = var8.toString();
              return stackIn_14_0;
            }
            discarded$1 = var8.append(param3.substring(var6Lifetime1, var9));
            discarded$2 = var8.append(param0);
            var6Lifetime1 = var7.length() + var9;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("vm.G(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    static {
        field_Fb = "<%0> is offering an unrated rematch.";
        field_Lb = "Players";
    }
}
