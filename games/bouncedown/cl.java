/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends al {
    static tg[] field_p;
    static int field_q;
    private String field_j;
    static int[] field_n;
    static volatile boolean field_o;
    private bd field_l;
    static int field_m;
    private boolean field_k;

    final vf b(String param0, byte param1) {
        qh var3 = null;
        RuntimeException var3_ref = null;
        vf stackIn_3_0 = null;
        vf stackIn_7_0 = null;
        vf stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l.b(param0, param1) == a.field_e) {
            stackIn_3_0 = a.field_e;
            return stackIn_3_0;
          }
          if (!param0.equals(this.field_j)) {
            var3 = f.a(param0, param1 - 150);
            if (!var3.a(param1 ^ 990)) {
              stackIn_7_0 = mi.field_c;
              return stackIn_7_0;
            }
            this.field_j = param0;
            this.field_k = var3.b(123);
          }
          if (this.field_k) {
            stackIn_12_0 = mc.field_a;
          } else {
            stackIn_12_0 = a.field_e;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("cl.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, boolean param1, int param2) {
        int var3_int = 0;
        try {
          ee.field_c = false;
          if (!param1) {
            String var4 = (String) null;
            cl.a((String) null, false, -26);
          }
          ng.field_b = false;
          if (null != nk.field_a &&
            nk.field_a.field_D) {
            var3_int = 1;
            if (8 == param2) {
              if (fe.field_g) {
                param0 = q.field_J;
              } else {
                param0 = mc.field_c;
              }
              param2 = 2;
              vk.field_c.b(190, gi.field_b);
            }
            if (param2 == 10) {
              qf.a(0);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (ee.field_c) {
                param0 = jf.a(ta.field_b, new String[]{param0}, (byte) -126);
              }
              if (va.field_f) {
                param0 = pf.field_B;
              }
              nk.field_a.a(param0, 4210752, param2);
            }
            if (param2 != 256 &&
              10 != param2) {
              if (fe.field_g) {
                return;
              }
              vk.field_c.e((byte) -100);
            }
          }
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "cl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_n = null;
        field_p = null;
    }

    cl(ba param0, ba param1) {
        super(param0);
        this.field_j = "";
        this.field_k = false;
        try {
          this.field_l = new bd(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "cl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -114) {
            var4 = (String) null;
            this.a((String) null, (byte) -81);
          }
          if (this.field_l.b(param0, (byte) 54) == a.field_e) {
            stackIn_4_0 = this.field_l.a(param0, (byte) -114);
            return stackIn_4_0;
          }
          if (this.b(param0, (byte) 54) != a.field_e) {
            return ha.field_g;
          }
          stackIn_8_0 = hb.field_C;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("cl.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        id var4 = null;
        int var4_int = 0;
        int var5 = 0;
        jc var5_ref_jc = null;
        int[] var6 = null;
        int var8 = 0;
        ii var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = Bounce.field_N;
        try {
          boolean decompiledFrameRemainder0 = true;
          var9 = jc.field_g;
          var2 = var9.d((byte) -118);
          var3 = var9.d((byte) -113);
          if (0 == var2) {
            var4 = (id) (mf.field_d.a((byte) -105));
            if (var4 == null) {
              kc.a((byte) 18);
              return;
            }
            var5 = -var9.field_h + pe.field_d;
            var11 = var4.field_h;
            var10 = var11;
            var6 = var10;
            if (var5 > var11.length << 2) {
              var5 = var11.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.d((byte) -125) << da.b(768, var7 << 8));
            }
            var4.c(2);
          } else {
            if (var2 == 1) {
              var4_int = var9.i(128);
              var5_ref_jc = (jc) (m.field_e.a((byte) -53));
              while (var5_ref_jc != null) {
                if (var3 != var5_ref_jc.field_l ||
                  var5_ref_jc.field_j != var4_int) {
                  var5_ref_jc = (jc) (m.field_e.d((byte) 90));
                  continue;
                }
                break;
              }
              if (var5_ref_jc == null) {
                kc.a((byte) 18);
                return;
              }
              var5_ref_jc.c(2);
              decompiledFrameRemainder0 = false;
            }
            else {
              ti.a((Throwable) null, (byte) 100, "LR1: " + la.a(-114));
              kc.a((byte) 18);
            }
          }
          if (!param0) {
            return;
          }
          field_n = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "cl.A(" + param0 + ')');
        }
    }

    static {
        field_o = false;
    }
}
