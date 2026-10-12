/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int[][] field_c;
    int field_h;
    static String field_e;
    int field_a;
    static String field_b;
    int[] field_f;
    static String field_g;
    static String field_d;

    final static RgbSprite[] a(int param0, int param1, int param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        RgbSprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!wa.a((byte) 30, param0, param2, param3)) {
            return null;
          }
          if (param1 != 20178) {
            field_d = (String) null;
          }
          stackIn_6_0 = Explosion.g(param1 ^ 20181);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("il.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 <= 97) {
          return;
        }
        String var2 = (String) null;
        nc.a("", (String) null, -54);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param1 == 0 &&
          sg.field_c != param0) {
          sg.field_c = param0;
          cn.field_l = true;
          b.a(param2, (byte) -118);
        }
        if (param3 != -18853) {
          field_b = (String) null;
        }
        if (param1 == 1 &&
          param0 != pm.field_Z) {
          pm.field_Z = param0;
          cn.field_l = true;
          b.a(param2, (byte) -96);
        }
        if (param1 == 2 &&
          param0 != CachedArchiveProvider.field_y) {
          CachedArchiveProvider.field_y = param0;
          cn.field_l = true;
          b.a(param2, (byte) -100);
        }
    }

    public static void c(int param0) {
        if (param0 >= -14) {
          il.a(false, (byte) 111);
        }
        field_d = null;
        field_e = null;
        field_c = (int[][]) null;
        field_g = null;
        field_b = null;
    }

    il(int param0, int param1, int param2) {
        this.field_h = param0;
        this.field_a = param1;
        this.field_f = new int[1 + param2];
    }

    final static void d(int param0) {
        if (!de.field_d) {
          throw new IllegalStateException();
        }
        if (param0 != 0) {
          il.a(-7, 91, 38, 66);
        }
        if (ch.field_O != null) {
          ch.field_O.m(106);
        }
        String var1 = CachedArchiveProvider.e(35);
        jd.field_kb = new pm(var1, (String) null, true, false, false);
        ag.field_p.a(ci.field_a, -114);
        ci.field_a.c(jd.field_kb, param0 - 22908735);
        ci.field_a.i((byte) -14);
    }

    final static void a(boolean param0, byte param1) {
        qc.field_V.a(param0, (byte) 126);
        pl var2 = ve.field_b;
        if (param1 > -108) {
          return;
        }
        if (var2 != null) {
          var2.a(qc.field_V.field_Rb, qc.field_V.field_cb, (byte) -128);
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = SteelSentinels.obfuscationControl;
        if (null != this.field_f &&
          this.field_f.length != 0) {
          for (var3 = 1; var3 < this.field_f.length; var3++) {
            if (param1 < (this.field_f[var3 - 1] + this.field_f[var3] >> 1)) {
              return var3 - 1;
            }
          }
          if (param0 <= 58) {
            field_e = (String) null;
          }
          return -1 + this.field_f.length;
        }
        return 0;
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
        if (param0 != -1) {
          il.a(-87);
        }
        if (this.field_f != null &&
          this.field_f.length != 0) {
          stackIn_7_0 = this.field_f[-1 + this.field_f.length];
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    static {
        field_e = "You appear to be telling someone your password - please don't!";
        field_b = "Please select an option in the '<%0>' row.";
        field_g = "Time: <col=ffffff><%0></col>";
        field_d = "foe";
    }
}
