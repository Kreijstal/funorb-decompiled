/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fa extends mg {
    static String field_m;
    static String field_i;
    static String field_k;
    private String field_l;
    private long field_j;

    final static void a(vc param0, vc param1, boolean param2, boolean param3, int param4, int param5, int param6, int param7, int param8, int param9, dl[] param10, dl[] param11, int param12, int param13, int param14, int param15, int param16) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        dl[] var18 = null;
        try {
          a.a(param8, param9, 0, param16, param7, param1, vh.field_f, param14, param0, aj.field_t, jn.field_i, ao.field_e, la.field_a, new hj(param11), param12, new hj(param10), param15, param5, param4, mc.field_s, param6);
          a.a(126, param13, param3);
          if (!param2) {
            var18 = (dl[]) null;
            fa.a((vc) null, (vc) null, true, false, 27, -22, 78, -62, -125, 77, (dl[]) null, (dl[]) null, -82, -3, -91, -105, 37);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_5_0 = var17;
          stackIn_5_1 = new StringBuilder().append("fa.G(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param11 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    wh a(int param0) {
        if (param0 != 0) {
          return (wh) null;
        }
        return uo.field_n;
    }

    final static String a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -62) {
            field_k = (String) null;
          }
          stackIn_3_0 = gd.a((byte) 102, param1, 0, param1.length);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fa.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        field_i = null;
        if (!param0) {
          return;
        }
        field_m = null;
    }

    final void a(ng param0, byte param1) {
        try {
          if (param1 < 94) {
            field_m = (String) null;
          }
          param0.b(this.field_j, (byte) 13);
          param0.a(-16614, this.field_l);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "fa.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, String param2, boolean param3) {
        try {
          if (!param3) {
            dl[] var5 = (dl[]) null;
            fa.a((vc) null, (vc) null, true, false, 27, -113, -121, 67, 2, -38, (dl[]) null, (dl[]) null, 66, -114, 40, 57, 65);
          }
          pl.e(-125);
          qe.field_g.g((byte) -100);
          mk.field_b = new vk(jd.field_G, (String) null, ne.field_d, param1, param0);
          jm.field_d = new ck(qe.field_g, mk.field_b);
          qe.field_g.b(-3264, jm.field_d);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "fa.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    fa(long param0, String param1) {
        try {
          this.field_j = param0;
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "fa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Click on a tile<br>to find out<br>what it is!";
        field_k = "This is a crystal.<br><br>Crystals are good.<br><br>Collect all the crystals<br>to complete the level!";
        field_m = "Sound: ";
    }
}
