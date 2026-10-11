/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends ka {
    private am field_f;
    private int field_g;
    private am field_b;
    private am field_k;
    static pa[] field_e;
    private int field_d;
    private am field_c;
    static int field_h;
    static int field_j;
    private ms field_i;

    final static void a(fp param0, byte param1, int param2) {
        dl var3 = null;
        try {
          var3 = q.field_p;
          var3.g(127, param2);
          if (param1 < 19) {
            field_h = -122;
          }
          var3.b(-1336879960, param0.field_f);
          var3.a(param0.field_e, 23385);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "po.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static rh a(int param0, int param1, al param2) {
        rh var3 = null;
        RuntimeException var3_ref = null;
        rh stackIn_2_0 = null;
        rh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            stackIn_2_0 = (rh) null;
            return stackIn_2_0;
          }
          var3 = jo.a(param2, param0, (byte) -44);
          var3.field_g.d(-1);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("po.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (param0 != -1) {
            po.c(126);
          }
          var3 = ls.a(param1, param2, (byte) 21);
          if (var3 != null) {
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          var4 = 0;
          while (true) {
            if (param1.length() <= var4) {
              return null;
            }
            if (cg.a(param1.charAt(var4), (byte) 118)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_11_0 = wi.field_b;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("po.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          int var2_int = 0;
          RuntimeException var2 = null;
          java.net.URL var3 = null;
          Exception var3_ref = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            var2_int = -51 % ((param1 + 49) / 53);
            try {
              var3 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              param0.getAppletContext().showDocument(jf.a(param0, var3, -53), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2;
            stackIn_7_1 = new StringBuilder().append("po.C(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) {
        CharSequence var3;
        CharSequence var3Lifetime1;
        if (null != this.field_c) {
          this.field_c.a(true);
          if (null != this.field_b) {
            this.field_b.a(true);
          }
          if (null != this.field_k) {
            this.field_k.a(true);
          }
          if (null != this.field_f) {
            this.field_f.a(true);
          }
          if (param0 != 0) {
            var3 = (CharSequence) null;
            po.a(-108, (CharSequence) null, true);
          }
          if (null != this.field_i) {
            this.field_i.b((byte) 29);
          }
          return;
        }
        if (null != this.field_b) {
          this.field_b.a(true);
        }
        if (null != this.field_k) {
          this.field_k.a(true);
        }
        if (null != this.field_f) {
          this.field_f.a(true);
        }
        if (param0 == 0) {
          if (null != this.field_i) {
            this.field_i.b((byte) 29);
          }
          return;
        }
        var3Lifetime1 = (CharSequence) null;
        po.a(-108, (CharSequence) null, true);
        if (null != this.field_i) {
          this.field_i.b((byte) 29);
        }
        return;
    }

    public static void c(int param0) {
        field_e = null;
        if (param0 != -30534) {
          field_h = 87;
        }
    }

    po(bf param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          this.field_d = param2;
          this.field_g = param1;
          if (param3 ||
            tt.a(this.field_g, true, this.field_d)) {
            this.field_c = new am(cu.a((byte) 117, this.field_g, this.field_d));
          }
          if (param3 ||
            ta.a(this.field_g, this.field_d, (byte) 91)) {
            this.field_b = new am(av.a(22847, this.field_d, this.field_g));
          }
          if (param3 ||
            si.a(this.field_d, 2, this.field_g)) {
            this.field_k = new am(hi.c(14834, this.field_g, this.field_d));
          }
          if (param3 ||
            ga.a(0, this.field_d, this.field_g)) {
            this.field_f = new am(ln.a(17, this.field_g, this.field_d));
          }
          if (!param3 &&
            !la.a(this.field_d, this.field_g, (byte) 21)) {
            return;
          }
          this.field_i = new ms(hs.a(true, this.field_g, this.field_d));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("po.<init>(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
