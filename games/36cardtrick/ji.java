/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static rk field_a;
    static String field_b;

    final static void a(boolean param0) {
        eh var1 = null;
        L0: {
          var1 = (eh) (Object) lk.field_g.b(-48);
          if (var1 == null) {
            var1 = new eh();
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          ji.a(false);
          var1.a(vj.field_l, vj.field_h, vj.field_g, 107, vj.field_a, vj.field_b, vj.field_j, vj.field_f);
          ai.field_k.a((qb) (Object) var1, 27362);
          return;
        } else {
          var1.a(vj.field_l, vj.field_h, vj.field_g, 107, vj.field_a, vj.field_b, vj.field_j, vj.field_f);
          ai.field_k.a((qb) (Object) var1, 27362);
          return;
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(int param0, int param1) {
        jc.field_O.field_l[oj.field_c] = (short)(param0 >> 1);
        jc.field_O.field_l[eb.field_d] = (short)(param0 >> 1);
        byte dupTemp$0 = 0 != bc.a(param0, 1) ? ng.field_H : db.field_p;
        jc.field_O.field_O[eb.field_d] = dupTemp$0;
        jc.field_O.field_O[oj.field_c] = dupTemp$0;
    }

    final static void a(byte param0, kc[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
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
        bb var19 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              ab.field_p = new cf(param1);
              jb.b();
              jb.a((b) (Object) ab.field_p);
              jb.b(1.0f);
              var19 = new bb(16, 8, 4);
              var3 = ml.a(var19, 0, 0, 0, (byte) -72);
              var4 = ml.a(var19, 0, 1, 0, (byte) -93);
              var5 = ml.a(var19, 0, 0, 1, (byte) -87);
              var6 = ml.a(var19, 0, 1, 1, (byte) -122);
              var7 = ml.a(var19, 1, 0, 0, (byte) -61);
              var8 = ml.a(var19, 1, 1, 0, (byte) -84);
              var9 = ml.a(var19, 1, 0, 1, (byte) -90);
              var10 = ml.a(var19, 1, 1, 1, (byte) -122);
              var11 = ml.a(var19, 2, 0, 0, (byte) -52);
              var12 = ml.a(var19, 0, 0, 2, (byte) -53);
              var13 = ml.a(var19, 0, 0, -1, (byte) -98);
              var14 = ml.a(var19, 1, 1, -1, (byte) -60);
              var15 = ml.a(var19, -1, 1, 0, (byte) -111);
              var16 = ml.a(var19, 2, 0, -1, (byte) -118);
              var17 = ml.a(var19, -1, 1, -1, (byte) -94);
              var18 = ml.a(var19, 1, 1, 2, (byte) -82);
              int discarded$4 = var19.a(var6, var5, var4, (byte) 1, (byte) -1, (short) 63, (short) -1);
              int discarded$5 = var19.a(var4, var5, var3, (byte) 1, (byte) -1, (short) 63, (short) -1);
              int discarded$6 = var19.a(var9, var10, var7, (byte) 1, (byte) -1, (short) 63, (short) -1);
              int discarded$7 = var19.a(var7, var10, var8, (byte) 1, (byte) -1, (short) 63, (short) -1);
              cf.field_d = var19.a((short) var3, (short) var11, (short) var12);
              db.field_p = var19.a((short) var8, (short) var15, (short) var18);
              sc.field_a = var19.a((short) var13, (short) var16, (short) var5);
              ng.field_H = var19.a((short) var14, (short) var17, (short) var10);
              qf.field_F = var19.a(var3, var5, var7, (byte) 1, cf.field_d, (short) 0, (short) 0);
              if (param0 < -87) {
                break L1;
              } else {
                ji.a(-42);
                break L1;
              }
            }
            od.field_a = var19.a(var7, var5, var9, (byte) 1, cf.field_d, (short) 0, (short) 0);
            eb.field_d = var19.a(var4, var10, var6, (byte) 1, db.field_p, (short) 1, (short) 1);
            oj.field_c = var19.a(var8, var10, var4, (byte) 1, db.field_p, (short) 1, (short) 1);
            jc.field_O = (ik) (Object) var19.a(127, 65535, -1, 0, 0);
            jc.field_O.field_h = qa.a(-100, var19.field_d);
            jc.field_O.field_u = qa.a(-36, var19.field_B);
            jc.field_O.field_U = qa.a(-107, var19.field_z);
            jc.field_O.field_O = var19.field_c;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ji.A(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -15) {
            Object var2 = null;
            ji.a((byte) -45, (kc[]) null);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
    }
}
