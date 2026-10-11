/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ck extends wl implements oi {
    static boolean field_db;
    private boolean field_eb;
    static int field_hb;
    private boolean field_fb;
    private nc field_cb;
    private bd field_jb;
    static byte[][] field_ib;
    private boolean field_kb;
    private boolean field_gb;

    ck(ei param0, bd param1, String param2, boolean param3, boolean param4) {
        super(param0, new vf((ck) null, param1, param2), 77, 10, 10);
        try {
          this.field_jb = param1;
          this.field_kb = false;
          this.field_fb = false;
          this.field_gb = param4 ? true : false;
          this.field_eb = param3 ? true : false;
          this.field_cb = new nc(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_cb.field_B = true;
          this.b(4, this.field_cb);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ck.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        boolean stackIn_6_1 = false;
        vf stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        String stackIn_12_3;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        vf var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        vf var6 = null;
        var5 = stellarshard.field_B;
        try {
          if (this.field_kb) {
            return;
          }
          stackIn_6_1 = (256 == param1);
          this.field_fb = stackIn_6_1;
          this.field_kb = true;
          this.field_cb.c(65280, 4210752, 8405024);
          var6 = new vf(this, this.field_jb, param0);
          var4 = var6;
          if (5 != param1) {
            if (param1 == 256) {
              var6.a((lf) (this), qb.field_l, (byte) -69);
            } else {
              stackIn_11_0 = var6;
              stackIn_11_1 = -31805;
              stackIn_11_2 = -1;
              if (this.field_eb) {
                stackIn_12_3 = qb.field_l;
              } else {
                stackIn_12_3 = bk.field_e;
              }
              ((vf) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2, stackIn_12_3);
            }
          } else {
            var6.a(-31805, 11, gj.field_s);
            var6.a(-31805, 17, wc.field_z);
          }
          if (param2 != 77) {
            return;
          }
          if (param1 == 3) {
            var6.a(-31805, 7, gh.field_a);
          } else {
            if (param1 == 4) {
              var6.a(param2 ^ -31858, 8, ra.field_a);
            } else {
              if (param1 != 6) {
                if (param1 == 9) {
                  var6.a((lf) (this), eg.field_c, (byte) 72);
                }
              } else {
                var6.a(param2 - 31882, 9, a.field_d);
              }
            }
          }
          this.b(var6, param2 + 23066);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_28_0 = var4_ref;
          stackIn_28_1 = new StringBuilder().append("ck.S(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 29657) {
            ck.a(-53, 99, true, false);
          }
          if (param1 != 13) {
            stackIn_6_0 = super.a(29657, param1, param2, param3);
            return stackIn_6_0;
          }
          this.o(3);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ck.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void m(int param0) {
        field_ib = (byte[][]) null;
        if (param0 > -100) {
          ck.n(-17);
        }
    }

    final static fe n(int param0) {
        try {
          Throwable var1 = null;
          fe stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          if (param0 != 2113632) {
            field_db = true;
          }
          try {
            stackIn_3_0 = (fe) (Class.forName("hb").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void h(byte param0) {
        vf var2 = null;
        vf var2Lifetime1;
        this.field_cb.c(65280, 4210752, 2121792);
        if (param0 == 52) {
          var2 = new vf(this, this.field_jb, kb.field_e);
          var2.a(-31805, 15, vg.field_q);
          this.b(var2, 23143);
          return;
        }
        ck.m(-107);
        var2Lifetime1 = new vf(this, this.field_jb, kb.field_e);
        var2Lifetime1.a(-31805, 15, vg.field_q);
        this.b(var2Lifetime1, 23143);
    }

    public void a(int param0, int param1, ig param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            this.field_eb = true;
          }
          if (!this.field_fb) {
            gf.a(hf.a((byte) -6), "tochangedisplayname.ws", 16729);
            return;
          }
          rh.a(3, (byte) -72);
          this.o(3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ck.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void o(int param0) {
        ig var3 = null;
        ig var3Lifetime1;
        ig var3Lifetime2;
        if (!this.field_G) {
          return;
        }
        this.field_G = false;
        if (this.field_eb) {
          tk.a(param0 ^ -16);
          if (param0 != 3) {
            var3 = (ig) null;
            this.a(-54, 36, (ig) null, false, -76);
            return;
          }
          return;
        }
        if (!this.field_gb) {
          if (param0 != 3) {
            var3Lifetime1 = (ig) null;
            this.a(-54, 36, (ig) null, false, -76);
            return;
          }
          return;
        }
        sb.a(91);
        if (param0 == 3) {
          return;
        }
        var3Lifetime2 = (ig) null;
        this.a(-54, 36, (ig) null, false, -76);
    }

    final static int a(int param0, int param1, boolean param2, boolean param3) {
        if (param3) {
          ck.m(-106);
          return td.a((byte) -103);
        }
        return td.a((byte) -103);
    }

    final static fd a(boolean param0, String param1) {
        String var2 = null;
        fd var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_9_0 = null;
        fd stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = stellarshard.field_B;
        try {
          if (!param0) {
            field_ib = (byte[][]) null;
          }
          if (ac.field_k == null) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (0 == param1.length()) {
            stackIn_9_0 = null;
            return (fd) (stackIn_9_0);
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = nh.a(var6, false);
          if (var2 == null) {
            return null;
          }
          var3 = (fd) (ac.field_k.a((long)var2.hashCode(), -119));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_rb);
            var4 = nh.a(var7, false);
            if (var4.equals(var2)) {
              stackIn_19_0 = var3;
              return stackIn_19_0;
            }
            var3 = (fd) (ac.field_k.a(true));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("ck.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        field_db = false;
        field_ib = new byte[1000][];
    }
}
