/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends ge {
    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        ov var5 = null;
        up var6 = null;
        mfa var7 = null;
        boa var8 = null;
        fsa var9 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new fsa(param2, param0);
          var9.b((byte) -11, this.field_k, this.field_l);
          var9.h(param1, 0);
          var9.a((byte) 83, (nv) (new eq(param2, param0)));
          var5 = new ov(param2, param0);
          var6 = new up(1, 10);
          var6.b(1, 13);
          var5.a(var6, true);
          this.a((byte) 43, var5, param2);
          var9.a((byte) 83, (nv) (var5));
          var7 = rm.field_a;
          var8 = (boa) (var7.a(7, 100));
          var8.b(114, 16);
          var9.a(var5, (byte) 124, var8);
          this.a(var9, param1 ^ 3, var5, 16777130);
          stackIn_1_0 = var9;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("ih.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    ih(la param0, int param1) {
        super(param0, param1);
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ih.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(CharSequence param0, boolean param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ov.a(62, param2)) {
            return false;
          }
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (var3_int >= 12) {
            return false;
          }
          if (hf.a(114, param2) &&
            0 == var3_int) {
            return false;
          }
          if (!param1) {
            ih.D(97);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("ih.VB(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          return true;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
          return true;
        }
        return true;
    }

    ih(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
          this.t(60);
          return false;
        }
        return false;
    }

    final static mi[] a(byte param0, String param1) {
        int incrementValue$1 = 0;
        vna var2 = null;
        RuntimeException var2_ref = null;
        mi[] var3 = null;
        int var4 = 0;
        mi var5 = null;
        int var6 = 0;
        mi[] stackIn_3_0 = null;
        mi[] stackIn_9_0 = null;
        mi[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1.equals(cf.field_e)) {
            stackIn_3_0 = opa.field_n;
            return stackIn_3_0;
          }
          var2 = lp.a((byte) 48, param1);
          var3 = new mi[var2.a((byte) -16)];
          var4 = 0;
          var5 = (mi) (var2.f(-80));
          while (var5 != null) {
            incrementValue$1 = var4;
            var4++;
            var3[incrementValue$1] = var5;
            var5 = (mi) (var2.e(124));
          }
          if (param0 != 126) {
            stackIn_9_0 = (mi[]) null;
            return stackIn_9_0;
          }
          opa.field_n = var3;
          cf.field_e = param1;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_14_0 = var2_ref;
          stackIn_14_1 = new StringBuilder().append("ih.BC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
          return -4;
        }
        return 7;
    }

    final boolean B(int param0) {
        if (param0 != -23309) {
          return false;
        }
        return true;
    }

    final boolean C(int param0) {
        if (param0 != 128) {
          return true;
        }
        return true;
    }

    final static void D(int param0) {
        if (param0 != 17229) {
          return;
        }
        if (null == baa.field_d) {
          return;
        }
        if (baa.field_d.b(100663296)) {
          nia.d(-25405);
          return;
        }
        if (tga.field_a != null) {
          return;
        }
        if (null == baa.field_d.field_i) {
          return;
        }
        nia.d(-25405);
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(112, 2097152, 2097152);
    }

    final boolean A(int param0) {
        if (param0 != -1) {
          return true;
        }
        return true;
    }

    static {
    }
}
