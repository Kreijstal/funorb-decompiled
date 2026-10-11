/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uea extends kna {
    uea(la param0, int param1) {
        super(param0, param1);
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (param3 > param0) {
          nra.a((byte) -55, param1, param3, vaa.field_a[param2], param0);
          return;
        }
        nra.a((byte) -55, param1, param0, vaa.field_a[param2], param3);
        if (!param4) {
          return;
        }
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
          this.z(71);
          return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(param0 + 174, 2097152, 2097152);
    }

    uea(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final static uca[] a(kh param0, byte param1) {
        int var5 = 0;
        Object stackIn_3_0 = null;
        uca[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        uca[] var4 = null;
        int var6 = 0;
        uca var6_ref_uca = null;
        int var7 = 0;
        int var6Lifetime1;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = param0.b((byte) 44, 8);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (uca[]) (stackIn_3_0);
          }
          var3 = param0.b((byte) 44, 12);
          var4 = new uca[var3];
          for (var5 = 0; var3 > var5; var5++) {
            if (!uha.a(5907, param0)) {
              var6 = param0.b((byte) 44, nma.b(false, var5 - 1));
              var4[var5] = var4[var6];
            } else {
              var6_ref_uca = new uca();
              param0.b((byte) 44, 24);
              param0.b((byte) 44, 24);
              var6_ref_uca.field_e = param0.b((byte) 44, 24);
              param0.b((byte) 44, 9);
              param0.b((byte) 44, 12);
              param0.b((byte) 44, 12);
              param0.b((byte) 44, 12);
              var4[var5] = var6_ref_uca;
            }
          }
          var6Lifetime1 = 64 % ((param1 + 52) / 37);
          stackIn_12_0 = var4;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("uea.SB(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
          return -20;
        }
        return 7;
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uea.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
          this.t(7);
          return false;
        }
        return false;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          return false;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
          this.q((byte) 37);
          return true;
        }
        return true;
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        eq var5 = null;
        mfa var6 = null;
        am var7 = null;
        gaa var8 = null;
        fsa var9 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new fsa(param2, param0);
          var9.b((byte) -11, this.field_k, this.field_l);
          var9.a((byte) -3, 5);
          var5 = new eq(param2, param0);
          var9.a((byte) 83, (nv) (var5));
          var9.b((byte) 17, false);
          var9.a(1, (byte) -12, false);
          var9.h(3, param1 - 3);
          var6 = rm.field_a;
          var7 = (am) (var6.a(4, 91));
          var7.b(0, (byte) 77);
          var9.a((gr) null, (byte) 124, var7);
          var8 = (gaa) (var6.a(5, 74));
          var8.a(64, 122);
          var8.a(true, 16633231);
          var8.b(1, 128);
          var8.a(0, param1, 1, true);
          var9.a((gr) null, (byte) 124, var8);
          stackIn_1_0 = var9;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("uea.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    static {
    }
}
