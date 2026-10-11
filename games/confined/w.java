/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends ga implements uj, el {
    private boolean field_L;
    private rg field_P;
    static int[] field_R;
    private boolean field_W;
    private boolean field_S;
    static String field_Q;
    private String field_H;
    private rg field_U;
    private ul field_X;
    private rg field_V;
    private ul field_T;

    private final void a(byte param0) {
        if (param0 != -65) {
          this.field_U = (rg) null;
        }
        if (hh.a(param0 ^ 13676) ||
          !(this.field_T.field_B.length() <= 0) &&
          !(this.field_X.field_B.length() <= 0)) {
          rm.a(this.field_T.field_B, (byte) 38, this.field_X.field_B);
        }
    }

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          if (param0 <= 68) {
            return;
          }
          if (this.field_V != param3) {
            if (param3 != this.field_P) {
              if (this.field_U == param3) {
                if (!this.field_W) {
                  if (!this.field_L) {
                    um.a((byte) -126);
                  } else {
                    ke.g((byte) -120);
                  }
                } else {
                  wa.a(-20683);
                }
              }
            } else {
              jl.a((byte) -123);
            }
          } else {
            this.a((byte) -65);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("w.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    final void g(byte param0) {
        this.field_T.l((byte) 115);
        if (param0 != -104) {
          String var3 = (String) null;
          this.a(-119, (String) null);
        }
        this.field_X.l((byte) 90);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (this.field_H != null) {
          gm.field_cb.a(this.field_H, 20 + (param3 + this.field_q), this.field_m + param0 + 15, -40 + this.field_F, this.field_z, 16777215, -1, 1, 0, gm.field_cb.field_C);
        }
        if (param2 < 36) {
          w.k(-83);
        }
        if (null != this.field_P) {
          fn.b(param3 + 10, 134 + param0, this.field_F - 20, 4210752);
        }
        super.a(param0, param1, (byte) 61, param3);
    }

    public final void a(ul param0, byte param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_T == param0) {
            this.field_X.a((fj) (this), 418);
          }
          if (param0 == this.field_X) {
            this.a((byte) -65);
          }
          if (param1 != 83) {
            w.k(88);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("w.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, (byte) -48, param2, param3)) {
            return true;
          }
          if (98 == param2) {
            stackIn_6_0 = this.c(param0, 32);
            return stackIn_6_0;
          }
          var5_int = 89 % ((param1 - 47) / 43);
          if (param2 != 99) {
            return false;
          }
          stackIn_9_0 = this.a(17731, param0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("w.Q(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, ul param1) {
        try {
          if (param0 != 32175) {
            fj var4 = (fj) null;
            this.a((fj) null, (byte) 37, 92, '8');
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "w.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String param1) {
        ul var3 = null;
        String var4 = null;
        if (param0 != 0) {
          return;
        }
        try {
          var3 = this.field_T;
          var4 = param1;
          var3.a(false, false, var4);
          this.field_X.l((byte) 110);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "w.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void k(int param0) {
        field_Q = null;
        field_R = null;
        if (param0 != 1) {
          w.k(50);
        }
    }

    final String j(int param0) {
        if (param0 > -97) {
          return (String) null;
        }
        if (null == this.field_T.field_B) {
          return "";
        }
        return this.field_T.field_B;
    }

    w(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (fe) null);
        la dupTemp$0 = null;
        la dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        rg stackIn_18_1 = null;
        rg stackIn_18_2 = null;
        rg stackIn_19_1 = null;
        rg stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        je var6 = null;
        RuntimeException var6_ref = null;
        ok var7 = null;
        String var8 = null;
        al var9 = null;
        la var12 = null;
        la var13 = null;
        try {
          stackIn_4_1 = (param2);
          this.field_W = stackIn_4_1;
          stackIn_7_1 = (param3);
          this.field_S = stackIn_7_1;
          this.field_H = param1;
          stackIn_10_1 = (param4);
          this.field_L = stackIn_10_1;
          if (this.field_W && (this.field_S ||
            this.field_L)) {
            throw new IllegalStateException();
          }
          this.field_T = (ul) ((Object) new wh(param0, (uk) (this), 100));
          this.field_X = (ul) ((Object) new wh("", (uk) (this), 20));
          if (!this.field_W) {
            this.field_V = new rg(o.field_d, (uk) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_L) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = te.field_i;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = ug.field_cb;
            }
            this.field_U = new rg(stackIn_19_3, (uk) null);
            if (this.field_S) {
              this.field_P = new rg(ej.field_c, (uk) (this));
            }
          } else {
            this.field_V = new rg(aa.field_a, (uk) null);
            this.field_U = new rg(al.field_c, (uk) null);
            this.field_T.field_L = false;
          }
          this.field_T.field_n = (fe) ((Object) new db(10000536));
          this.field_X.field_n = (fe) ((Object) new qm(10000536));
          var6 = new je();
          this.field_V.field_n = (fe) ((Object) var6);
          if (this.field_U != null) {
            this.field_U.field_n = (fe) ((Object) var6);
          }
          if (this.field_P != null) {
            this.field_P.field_n = (fe) ((Object) var6);
          }
          this.field_T.field_C = vl.field_a;
          if (null != this.field_P) {
            this.field_P.field_C = eh.field_eb;
          }
          if (!this.field_W) {
            if (this.field_L) {
              this.field_U.field_C = nl.field_a;
              this.field_U.field_n = (fe) ((Object) new hk());
            } else {
              this.field_U.field_n = (fe) ((Object) new hk());
            }
          } else {
            this.field_U.field_C = cj.field_c;
          }
          this.field_m = 15;
          var7 = gm.field_cb;
          if (this.field_H != null) {
            this.field_m = this.field_m + (5 + var7.b(this.field_H, this.field_F - 40, var7.field_C));
          }
          var8 = hd.field_a;
          var9 = tm.a(ii.b(false), -118);
          if (pi.field_T == var9) {
            var8 = hn.field_p;
          } else {
            if (tj.field_n == var9) {
              var8 = nm.field_D;
            }
          }
          dupTemp$0 = new la(10, this.field_m, this.field_F - 20, 25, this.field_T, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.b(dupTemp$0, 10);
          this.field_m = this.field_m + (((fj) ((Object) var12)).field_z + 5);
          dupTemp$1 = new la(10, this.field_m, this.field_F - 20, 25, this.field_X, false, 80, 3, var7, 16777215, sc.field_b);
          var13 = dupTemp$1;
          this.b(dupTemp$1, 10);
          this.field_V.field_t = (uk) (this);
          this.field_m = this.field_m + (((fj) ((Object) var13)).field_z + 5);
          if (null != this.field_P) {
            this.field_P.field_t = (uk) (this);
          }
          if (this.field_U != null) {
            this.field_U.field_t = (uk) (this);
          }
          if (this.field_P != null) {
            this.field_V.a(-125, -95 + this.field_F, this.field_m, 30, 85);
            this.field_m = this.field_m + 60;
          } else {
            this.field_V.a(-119, -10 + (this.field_F - 6), this.field_m, 30, 8);
            this.field_m = this.field_m + 35;
          }
          if (null != this.field_P) {
            this.field_P.a(-112, -16 + this.field_F, this.field_m, 30, 8);
            this.field_m = this.field_m + 35;
          }
          if (this.field_U != null) {
            if (!this.field_W &&
              !this.field_L) {
              this.field_U.a(-110, 40, this.field_m, 20, 8);
              this.field_m = this.field_m + 25;
            } else {
              this.field_U.a(-123, -6 + this.field_F - 10, this.field_m, 30, 8);
              this.field_m = this.field_m + 35;
            }
          }
          this.a(-110, this.field_F, 0, 3 + this.field_m, 0);
          this.b(this.field_V, 10);
          if (this.field_P != null) {
            this.b(this.field_P, 10);
          }
          if (this.field_U != null) {
            this.b(this.field_U, 10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("w.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_R = new int[8192];
        field_Q = "Quit";
    }
}
