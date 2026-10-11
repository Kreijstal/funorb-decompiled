/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends dna {
    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (!ej.a(false, param0, param1)) {
            return false;
          }
          var3_int = 0;
          while (true) {
            if (param1.length() <= var3_int) {
              if (param2 == 1617) {
                return true;
              }
              return false;
            }
            if (fqa.a(false, param1.charAt(var3_int))) {
              var3_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("lg.VB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    lg(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(-71, 2097152, 2097152);
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        bg var5 = null;
        pt var6 = null;
        eq var7 = null;
        cu var8 = null;
        kpa var9 = null;
        mfa var10 = null;
        aka var11 = null;
        fsa var12 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var12 = new fsa(param2, param0);
          var12.b((byte) -11, this.field_k, this.field_l);
          var12.h(2, 0);
          var12.a(2, (byte) -12, true);
          var12.a((byte) -3, 1);
          var12.b((byte) 17, false);
          var12.e(true, 124);
          var12.d(1, -1);
          var5 = new bg(param2, param0);
          var5.a(false, 98304);
          var12.a(var5, 0);
          var6 = new pt(param2, param0);
          var6.a(256, (byte) 124);
          var12.a(var6, 0);
          var7 = new eq(param2, param0);
          var7.b((byte) -114, true);
          var7.a(8, (byte) -22);
          var12.a((byte) 83, (nv) (var7));
          var8 = new cu(param2, param0);
          var8.b(0, 5, param1 - 3);
          var8.a(0, 0, 36, 0);
          var9 = var8.j((byte) -114);
          var9.a(false, param1 ^ 102);
          var9.a(0, -17075, true);
          var9.a(param1, -17075, true);
          var9.a(2, param1 ^ -17074, true);
          var12.a((byte) 83, (nv) (var8));
          var10 = rm.field_a;
          var11 = (aka) (var10.a(18, 98));
          var11.b(param1 + 87, 0);
          var12.a((gr) null, (byte) 124, var11);
          var12.e(0, 122);
          stackIn_1_0 = var12;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("lg.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    lg(la param0, int param1) {
        super(param0, param1);
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lg.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
