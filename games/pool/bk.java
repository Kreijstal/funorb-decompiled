/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends ma {
    int field_s;
    private int field_n;
    private dd field_z;
    static String field_x;
    private ko field_r;
    int field_l;
    gi field_q;
    int field_o;
    int field_u;
    private int field_t;
    static nm field_m;
    private String field_p;
    static int[] field_w;
    private int field_y;
    static int field_v;

    final int c(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -101) {
            stackIn_4_0 = 20 + (qa.field_v.field_Db + this.field_t);
            return stackIn_4_0;
          }
          stackIn_2_0 = -65;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "bk.D(" + param0 + ')');
        }
    }

    final void c(int param0) {
        try {
          this.field_q = ag.a(-al.field_k.field_eb + gg.field_f, this.field_r, wn.field_i - al.field_k.field_qb, 15395);
          int var2_int = 25 % ((param0 - 39) / 62);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "bk.A(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        try {
          this.field_q.a(param0, al.field_k.field_qb, param1, -1, true, al.field_k.field_eb);
          if (param2 != 9750) {
            this.field_u = -125;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "bk.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0) {
            field_w = (int[]) null;
          }
          this.field_z.c(al.field_k.field_qb, al.field_k.field_eb);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "bk.C(" + param0 + ')');
        }
    }

    final void a(hq param0, int param1) {
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          this.field_n = -20 + al.field_k.field_gb;
          if (param1 <= 36) {
            this.field_l = 75;
          }
          this.field_y = op.field_f;
          if (this.field_p.indexOf("<img=") == -1) {
            this.field_y = sa.field_h.field_G;
          }
          this.field_t = sa.field_h.b(this.field_p, this.field_n, this.field_y);
          if (param0.field_d.field_e != this.field_k &&
            !pl.field_b.field_pb) {
            pl.field_b.field_pb = true;
          } else {
            if (this.field_k == param0.field_d.field_e &&
              pl.field_b.field_pb) {
              pl.field_b.field_R = 0;
              pl.field_b.field_pb = false;
            }
          }
          if ((param0.field_d.field_e != this.field_d ||
            param0.field_j != null) &&
            !jq.field_d.field_pb) {
            jq.field_d.field_pb = true;
          } else {
            if (this.field_d == param0.field_d.field_e &&
              null == param0.field_j &&
              jq.field_d.field_pb) {
              jq.field_d.field_pb = false;
              jq.field_d.field_R = 0;
            }
          }
          var3_int = this.field_s;
          if (0 == var3_int) {
            param0.field_a.a(false, (byte) -109);
          } else {
            if (2 != var3_int) {
              if (var3_int == 1) {
                param0.field_a.a(false, (byte) -127);
              }
            } else {
              param0.field_a.a(false, (byte) -122);
            }
          }
          this.field_z = new dd(al.field_k.field_gb, this.field_t + 10);
          this.field_z.e();
          sa.field_h.a(nf.field_Z, bi.field_d);
          sa.field_h.a(ef.a("</col>", this.field_p, (byte) 4, "<col=ccccff>"), 10, 7, this.field_n, this.field_t, 16777215, 3355443, 0, 1, this.field_y);
          this.field_r = ug.a(new int[]{this.field_y}, this.field_n, this.field_p, 7, sa.field_h, true, 10);
          sh.field_P.b(15100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_54_0 = var3;
          stackIn_54_1 = new StringBuilder().append("bk.G(");
          if (param0 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_11_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l > this.field_u) {
            this.field_u = this.field_u + param0;
          }
          if (param1 != 127) {
            this.field_y = -57;
          }
          stackIn_11_0 = !(this.field_u < this.field_l);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "bk.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(pq[] param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pool.field_O;
        try {
          if (param1 != 57) {
            field_x = (String) null;
          }
          var2_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var2_int >= param0.length))) {
            stackIn_15_0 = param0[var2_int].field_v;
            if (var3 == 0) {
              if (stackIn_15_0 != 0) {
                return true;
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_15_0 = 0;
          }
          return stackIn_15_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("bk.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -5917) {
            bk.a(-18);
          }
          field_w = null;
          field_m = null;
          field_x = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "bk.H(" + param0 + ')');
        }
    }

    bk(String param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_s = 0;
        this.field_q = null;
        try {
          this.field_p = param0;
          this.field_l = param1;
          this.field_u = 0;
          if (param2 != -1) {
            this.field_s = 1 << param2;
          }
          this.field_o = ~this.field_s;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("bk.<init>(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    bk(String param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_s = 0;
        this.field_q = null;
        try {
          this.field_o = param3;
          this.field_p = param0;
          if (param2 != -1) {
            this.field_s = 1 << param2;
          }
          this.field_u = 0;
          this.field_l = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("bk.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    bk(String param0, int param1, int param2, ko param3) {
        RuntimeException runtimeException = null;
        aa var5 = null;
        bk var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        this.field_s = 0;
        this.field_q = null;
        try {
          this.field_u = 0;
          this.field_l = param1;
          if (param2 != -1) {
            this.field_s = 1 << param2;
          }
          this.field_p = param0;
          this.field_o = ~this.field_s;
          var5 = new aa(param3);
          var6 = (bk) (var5.b((byte) -92));
          while (null != var6) {
            this.field_o = this.field_o & ~var6.field_s;
            var6 = (bk) (var5.b(-114));
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("bk.<init>(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_w = new int[4];
        field_x = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
