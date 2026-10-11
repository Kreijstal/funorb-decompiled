/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static int field_h;
    int[] field_f;
    int field_g;
    static int field_k;
    static int field_l;
    static dj field_c;
    static qb field_b;
    static String field_j;
    static vn field_d;
    static int field_i;
    int field_e;
    static String field_a;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_f != null &&
          this.field_f.length != 0) {
          for (var3 = 1; var3 < this.field_f.length; var3++) {
            if (param0 < (this.field_f[var3] + this.field_f[var3 - 1] >> 1)) {
              return -1 + var3;
            }
          }
          if (param1 <= 15) {
            field_i = -71;
          }
          return -1 + this.field_f.length;
        }
        return 0;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        if (param1 < 120) {
          java.math.BigInteger var5 = (java.math.BigInteger) null;
          vd.a(true, (wk) null, (java.math.BigInteger) null, (wk) null, (java.math.BigInteger) null);
        }
        qn.a(ra.field_h, -115, ga.field_r, param2, param3, param0, dh.field_Gb);
    }

    final static void a(boolean param0, wk param1, java.math.BigInteger param2, wk param3, java.math.BigInteger param4) {
        try {
          we.a(param4, 0, param3.field_j, param1, 0, param2, param3.field_g);
          if (param0) {
            vd.a(-96, -100, -118, true);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vd.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(jg param0, byte param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = 0;
          if (param1 != -74) {
            return;
          }
          while (3 > var2_int) {
            bm.field_d[var2_int] = 0;
            var2_int++;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < gb.field_f; var2_intLifetime1++) {
            if (g.field_d[var2_intLifetime1].field_m == param0.field_m) {
              dupTemp$3 = g.field_d[var2_intLifetime1].b(-62);
              bm.field_d[dupTemp$3] = bm.field_d[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.b(-21);
          bm.field_d[dupTemp$0] = bm.field_d[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; var3 < gb.field_f; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (param0.field_m == g.field_d[var3].field_m) {
              var4 = g.field_d[var3].b(-109);
              if (bm.field_d[var4] > hj.field_b) {
                bm.field_d[var4] = bm.field_d[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              g.field_d[incrementValue$2] = g.field_d[var3];
            }
          }
          gb.field_f = var2_intLifetime2;
          fieldTemp$1 = gb.field_f;
          gb.field_f = gb.field_f + 1;
          g.field_d[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("vd.A(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 0) {
          jg var2 = (jg) null;
          vd.a((jg) null, (byte) -101);
        }
        field_d = null;
    }

    vd(int param0, int param1, int param2) {
        this.field_f = new int[1 + param2];
        this.field_e = param1;
        this.field_g = param0;
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
        if (param0 > -107) {
          vd.a(-125);
        }
        if (this.field_f != null &&
          0 != this.field_f.length) {
          stackIn_7_0 = this.field_f[this.field_f.length - 1];
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    static {
        field_h = -1;
        field_k = 480;
        field_j = "Well done! You have completed your training and are now ready for online play. The sandbox is open to you to test out your spells. Any spell your Arcanist has been equipped with on the 'Spell Selection' screen will be available for you to try out here. Have fun!";
        field_a = "Suggest muting this player";
    }
}
