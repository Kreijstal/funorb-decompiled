/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wf {
    wf field_f;
    static boolean field_a;
    long field_c;
    wf field_b;
    static mi field_d;
    static String field_e;

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        if (param0) {
          field_a = true;
        }
    }

    final void c(int param0) {
        if (this.field_f == null) {
          return;
        }
        if (param0 == 5) {
          this.field_f.field_b = this.field_b;
          this.field_b.field_f = this.field_f;
          this.field_f = null;
          this.field_b = null;
          return;
        }
    }

    final static void a(ti[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var22 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var23 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        var23 = Transmogrify.field_A ? 1 : 0;
        try {
          if (null != param0[3]) {
            stackIn_4_0 = param0[3].field_r;
          } else {
            stackIn_4_0 = 0;
          }
          var7_int = stackIn_4_0;
          if (param0[5] != null) {
            stackIn_7_0 = param0[5].field_r;
          } else {
            stackIn_7_0 = 0;
          }
          var8 = stackIn_7_0;
          if (param0[1] != null) {
            stackIn_10_0 = param0[1].field_s;
          } else {
            stackIn_10_0 = 0;
          }
          var9 = stackIn_10_0;
          if (param0[param2] != null) {
            stackIn_13_0 = param0[7].field_s;
          } else {
            stackIn_13_0 = 0;
          }
          var10 = stackIn_13_0;
          var11 = param3 + param5;
          var12 = param1 + param6;
          var13 = param3 + var7_int;
          var14 = var11 - var8;
          var15 = param6 + var9;
          var16 = var12 - var10;
          var17 = var13;
          var18 = var14;
          if (var18 < var17) {
            var18 = param5 * var7_int / (var7_int + var8) + param3;
            var17 = param5 * var7_int / (var7_int + var8) + param3;
          }
          var19 = var15;
          var20 = var16;
          sb.a(fi.field_t);
          if (var19 > var20) {
            var20 = param6 + param1 * var9 / (var10 + var9);
            var19 = param6 + param1 * var9 / (var10 + var9);
          }
          if (null != param0[0]) {
            sb.g(param3, param6, var17, var19);
            he.a(param0[0], param4, param3, (byte) 67, param6);
            sb.b(fi.field_t);
          }
          if (null != param0[2]) {
            sb.g(var18, param6, var11, var19);
            he.a(param0[2], param4, var14, (byte) 108, param6);
            sb.b(fi.field_t);
          }
          if (null != param0[6]) {
            sb.g(param3, var20, var17, var12);
            he.a(param0[6], param4, param3, (byte) 56, var16);
            sb.b(fi.field_t);
          }
          if (param0[8] != null) {
            sb.g(var18, var20, var11, var12);
            he.a(param0[8], param4, var14, (byte) 110, var16);
            sb.b(fi.field_t);
          }
          if (null != param0[1] &&
            0 != param0[1].field_r) {
            sb.g(var17, param6, var18, var19);
            for (var21 = var13; var14 > var21; var21 = var21 + param0[1].field_r) {
              he.a(param0[1], param4, var21, (byte) 84, param6);
            }
            sb.b(fi.field_t);
          }
          if (null != param0[7] &&
            param0[7].field_r != 0) {
            sb.g(var17, var20, var18, var12);
            for (var21Lifetime1 = var13; var14 > var21Lifetime1; var21Lifetime1 = var21Lifetime1 + param0[7].field_r) {
              he.a(param0[7], param4, var21Lifetime1, (byte) 109, var16);
            }
            sb.b(fi.field_t);
          }
          if (null != param0[3] &&
            param0[3].field_s != 0) {
            sb.g(param3, var19, var17, var20);
            for (var21Lifetime2 = var15; var21Lifetime2 < var16; var21Lifetime2 = var21Lifetime2 + param0[3].field_s) {
              he.a(param0[3], param4, param3, (byte) 77, var21Lifetime2);
            }
            sb.b(fi.field_t);
          }
          if (null != param0[5] &&
            param0[5].field_s != 0) {
            sb.g(var18, var19, var11, var20);
            for (var21Lifetime3 = var15; var21Lifetime3 < var16; var21Lifetime3 = var21Lifetime3 + param0[5].field_s) {
              he.a(param0[5], param4, var14, (byte) 82, var21Lifetime3);
            }
            sb.b(fi.field_t);
          }
          if (null != param0[4] &&
            param0[4].field_r != 0) {
            if (param0[4].field_s == 0) {
              return;
            }
            sb.g(var17, var19, var18, var20);
            for (var21Lifetime4 = var15; var21Lifetime4 < var16; var21Lifetime4 = var21Lifetime4 + param0[4].field_s) {
              for (var22 = var13; var14 > var22; var22 = var22 + param0[4].field_r) {
                he.a(param0[4], param4, var22, (byte) 92, var21Lifetime4);
              }
            }
            sb.b(fi.field_t);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("wf.AC(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Transmogrify.field_A ? 1 : 0;
        try {
          ci.field_f.a(be.field_x, lc.field_R, true, 4);
          if (param0 != -1) {
            field_d = (mi) null;
          }
          ci.field_f.l(0);
          while (pc.b(param0 ^ -97)) {
            ci.field_f.a(param0 - 80, sg.field_n, ch.field_d);
          }
          if (sg.field_e != -1) {
            var1_int = sg.field_e;
            ba.a(124, -1);
            stackIn_9_0 = var1_int;
            return stackIn_9_0;
          }
          if (aa.field_g) {
            stackIn_13_0 = 3;
            return stackIn_13_0;
          }
          if (db.field_a == of.field_d) {
            stackIn_16_0 = 1;
            return stackIn_16_0;
          }
          if (!dl.field_l.b(-26753)) {
            stackIn_19_0 = 1;
            return stackIn_19_0;
          }
          if (of.field_d != rh.field_v) {
            stackIn_24_0 = -1;
            return stackIn_24_0;
          }
          stackIn_22_0 = 2;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "wf.VB(" + param0 + ')');
        }
    }

    final boolean b(int param0) {
        if (null == this.field_f) {
          return false;
        }
        if (param0 != 8) {
          this.b(29);
          return true;
        }
        return true;
    }

    static {
        field_e = "Resume Game";
    }
}
