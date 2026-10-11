/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sh extends mh implements rc {
    private tj field_bb;
    static int[] field_gb;
    static int field_hb;
    private boolean field_eb;
    private boolean field_ib;
    static bl[] field_cb;
    private boolean field_P;
    static String field_jb;
    private boolean field_fb;
    private ll field_db;

    final void a(String param0, int param1, int param2) {
        boolean stackIn_6_1 = false;
        uc stackIn_10_0 = null;
        String stackIn_11_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        uc var6 = null;
        var5 = Bounce.field_N;
        try {
          if (this.field_ib) {
            return;
          }
          this.field_ib = true;
          stackIn_6_1 = (param2 == 256);
          this.field_fb = stackIn_6_1;
          this.field_db.a(param1, (byte) 127, 8405024);
          var6 = new uc(this, this.field_bb, param0);
          if (5 == param2) {
            var6.a(ta.field_e, 11, (byte) 116);
            var6.a(i.field_g, 17, (byte) 123);
          } else {
            if (param2 == 256) {
              var6.a(mh.field_W, (sk) (this), -4);
            } else {
              stackIn_10_0 = var6;
              if (this.field_eb) {
                stackIn_11_1 = mh.field_W;
              } else {
                stackIn_11_1 = pe.field_h;
              }
              ((uc) (Object) stackIn_10_0).a(stackIn_11_1, -1, (byte) 93);
            }
          }
          if (3 != param2) {
            if (param2 != 4) {
              if (param2 == 6) {
                var6.a(da.field_c, 9, (byte) 106);
              } else {
                if (param2 != 9) {
                  this.a(10768, var6);
                  return;
                }
                var6.a(fj.field_d, (sk) (this), -4);
              }
            } else {
              var6.a(ck.field_f, 8, (byte) 97);
            }
          } else {
            var6.a(oc.field_c, 7, (byte) 60);
          }
          this.a(10768, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("sh.W(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    sh(pf param0, tj param1, String param2, boolean param3, boolean param4) {
        super(param0, new uc((sh) null, param1, param2), 77, 10, 10);
        try {
          this.field_ib = false;
          this.field_P = param4 ? true : false;
          this.field_eb = param3 ? true : false;
          this.field_bb = param1;
          this.field_fb = false;
          this.field_db = new ll(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_db.field_C = true;
          this.b(this.field_db, true);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "sh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0) {
        if (!this.field_D) {
          return;
        }
        this.field_D = false;
        if (this.field_eb) {
          pd.a(11173);
        } else {
          if (this.field_P) {
            od.a((byte) 24);
          }
        }
        if (!param0) {
          this.n(-51);
        }
    }

    public void a(byte param0, int param1, int param2, int param3, wd param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param0 < 6) {
            return;
          }
          if (!this.field_fb) {
            qc.a(vi.b(0), 24, "tochangedisplayname.ws");
          } else {
            oh.a(-52, 3);
            this.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("sh.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        String var6 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 13) {
            this.a(true);
            return true;
          }
          if (param3 != -14565) {
            var6 = (String) null;
            this.a((String) null, -33, 29);
          }
          stackIn_7_0 = super.a(param0, param1, param2, -14565);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("sh.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void n(int param0) {
        this.field_db.a(4210752, (byte) 127, 2121792);
        uc var2 = new uc(this, this.field_bb, dh.field_e);
        var2.a(l.field_f, 15, (byte) 120);
        if (param0 != 1) {
          return;
        }
        this.a(10768, var2);
    }

    public static void o(int param0) {
        field_jb = null;
        field_cb = null;
        field_gb = null;
        if (param0 != 5) {
          sh.o(88);
        }
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_gb = new int[256];
        field_jb = "Logging in...";
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((var0 & 1) != 1) {
              var0 = var0 >>> 1;
            } else {
              var0 = var0 >>> 1 ^ -306674912;
            }
          }
          field_gb[var1] = var0;
        }
    }
}
