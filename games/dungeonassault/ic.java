/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends mc {
    static String field_A;
    static String field_z;
    static pp field_y;

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        var3 = DungeonAssault.field_K;
        if (param1 != -31425) {
          return;
        }
        if (0 >= pb.field_G) {
          if (ed.c(true)) {
            var2 = 0;
            if (il.field_c == null &&
              wo.field_c) {
              ae.a(param0, var2, -1);
              return;
            }
            return;
          }
          var2Lifetime2 = 1;
          if (il.field_c != null) {
            return;
          }
          if (!wo.field_c) {
            return;
          }
          ae.a(param0, var2Lifetime2, -1);
          return;
        }
        if (null == il.field_c) {
          cm.field_R = gh.a(0, -115, 0, 480, i.field_A, 640);
          if (cm.field_R == null) {
            var2Lifetime1 = 3;
          } else {
            uk.a(cm.field_R, (byte) -124);
            var2Lifetime1 = 2;
          }
        } else {
          cm.field_R = il.field_c.d(92);
          gk.a(2, (byte) 4);
          if (cm.field_R == null) {
            var2Lifetime1 = 3;
          } else {
            uk.a(cm.field_R, (byte) -124);
            var2Lifetime1 = 2;
          }
        }
        if (il.field_c == null &&
          wo.field_c) {
          ae.a(param0, var2Lifetime1, -1);
          return;
        }
    }

    ic(int param0) {
        this(lp.field_C, param0);
    }

    public static void d(int param0) {
        if (param0 != 4741) {
          return;
        }
        field_A = null;
        field_z = null;
        field_y = null;
    }

    final static void a(int param0, int param1, String param2) {
        if (param1 != 27029) {
          return;
        }
        ac var3 = gh.field_i[param0];
        if (var3 == null) {
          return;
        }
        try {
          var3.field_d = tp.a(kf.field_p, "idle", param2, param1 ^ -28249);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ic.EA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String b(lm param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -444136767) {
            field_A = (String) null;
          }
          stackIn_3_0 = cc.a('*', param0.field_w.length(), 10854);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ic.P(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private ic(se param0, int param1) {
        super(param0, param1);
    }

    static {
        field_A = "Empty Room";
        field_z = "The pillar in the centre of this room is covered in mouths that will shrill and screech if they sense any raiders.<br><br>When triggered, the <%detect> of all monsters in this dungeon is increased by 3.";
    }
}
