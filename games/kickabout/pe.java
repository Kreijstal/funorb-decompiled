/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static String field_b;
    static String field_c;
    static String field_a;

    final static int a(byte param0) {
        if (hl.field_d < 2) {
          return 0;
        }
        if (vv.field_r == 0) {
          if (!bw.field_b.d(-93)) {
            return 20;
          }
          if (!bw.field_b.a(false, "commonui")) {
            return 40;
          }
          if (!gs.field_c.d(-58)) {
            return 50;
          }
          if (!gs.field_c.a(false, "commonui")) {
            return 60;
          }
          if (!up.field_k.d(param0 - 179)) {
            return 70;
          }
          if (!up.field_k.a(false)) {
            return 80;
          }
        } else {
          if (null != qq.field_H) {
            if (!qq.field_H.d(-94)) {
              return 14;
            }
            if (!qq.field_H.a("", (byte) -120)) {
              return 29;
            }
            if (!qq.field_H.a(false, "")) {
              return 29;
            }
          }
          if (!bw.field_b.d(-107)) {
            return 43;
          }
          if (!bw.field_b.a(false, "commonui")) {
            return 57;
          }
          if (!gs.field_c.d(-66)) {
            return 71;
          }
          if (!gs.field_c.a(false, "commonui")) {
            return 80;
          }
          if (!up.field_k.d(-106)) {
            return 82;
          }
          if (!up.field_k.a(false)) {
            return 86;
          }
        }
        if (param0 != 92) {
          return -43;
        }
        return 100;
    }

    final static void a(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Kickabout.field_G;
        try {
          if (!n.a(false)) {
            if (null != e.field_m &&
              e.field_m.field_b) {
              fd.h(0);
              mr.field_Z.a(new ve(mr.field_Z, hf.field_a), false);
            }
            return;
          }
          mr.field_Z.a(gw.field_c, 31947, nq.field_J, true);
          if (param0 <= 104) {
            pe.b(104);
          }
          mr.field_Z.n(2);
          while (nk.$cfr$intArgs$b$c4997cb15529(-59)) {
            mr.field_Z.a(il.field_c, (byte) -91, cc.field_e);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "pe.H(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        ol.field_R = false;
        if (param0 != 0) {
          field_a = (String) null;
        }
    }

    final static boolean a(la[] param0, byte param1, int[] param2) {
        la[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        la var5 = null;
        int var6 = 0;
        la[] var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          if (param0 == null) {
            return true;
          }
          if (param1 >= -52) {
            return true;
          }
          var7 = param0;
          var3 = var7;
          var4 = 0;
          while (true) {
            if (var7.length <= var4) {
              return false;
            }
            var5 = var7[var4];
            if (!var5.a(param2[0], param2[1], 703166480, param2[2])) {
              var4++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("pe.E(");
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
          throw nb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void a(eg param0, ut param1, int param2, int param3) {
        try {
          iw.a(-51, param1);
          on.b();
          if (param3 != 40) {
            int[] var5 = (int[]) null;
            pe.a((la[]) null, (byte) 103, (int[]) null);
          }
          t.c();
          t.b(on.field_g >> 1, 198);
          param0.a(0, 0, 0, 0, 0, 0, 0, 700);
          ta.e(param3 + 77);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "pe.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, ef param1) {
        if (param0 != 82) {
          return;
        }
        try {
          se.field_C = param1;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "pe.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1) {
        fn.a(param0, (byte) -32);
        if (param1 >= -114) {
          ut var3 = (ut) null;
          pe.a((eg) null, (ut) null, -104, -61);
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 7) {
          field_a = (String) null;
        }
    }

    static {
        field_b = "Instructions";
        field_a = "buy this pitch for <%0>";
        field_c = "This game ended too early. Rewards are reduced.";
    }
}
