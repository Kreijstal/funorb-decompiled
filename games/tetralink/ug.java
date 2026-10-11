/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends nb {
    private lg field_db;
    private String field_Y;
    private boolean field_gb;
    static bh field_hb;
    static wf field_ib;
    static String field_X;
    static int[] field_bb;
    private boolean field_Z;
    static int field_eb;
    static jk field_cb;
    private String field_fb;
    static ie field_ab;

    final static boolean c(int param0, int param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        String var4_ref_String;
        int var4;
        int var5;
        String var7;
        String var8;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var23;
        String var24;
        String var25;
        String var26;
        String var27;
        String var28;
        String var29;
        String var30;
        String var31;
        String var32;
        String var33;
        String var34;
        String var35;
        String var36;
        String var37;
        Object var38;
        CharSequence var39;
        int var5Lifetime1;
        var38 = null;
        var11 = TetraLink.field_J;
        var3 = 1;
        if (param0 != 32) {
          return false;
        }
        if (!fi.field_Cb &&
          gn.field_I == null) {
          var3 = 0;
        }
        if (sf.field_d == 0 &&
          qe.field_a != null) {
          var3 = 0;
        }
        if (sf.field_d == 2 &&
          !k.a(true)) {
          var3 = 0;
        }
        if (dg.field_e == 84) {
          if (var3 == 0) {
            if (sf.field_d == 0) {
              return true;
            }
            hi.b(-113);
            return true;
          }
          if (io.field_h.length() > 0) {
            var4_ref_String = io.field_h.toString();
            if (oa.a(var4_ref_String, 65416)) {
              var13 = (String) null;
              var12 = (String) null;
              fi.a(0, 0, (String) null, 2, kj.field_c, (String) null);
              var15 = (String) null;
              var14 = (String) null;
              fi.a(0, 0, (String) null, 2, sa.field_a, (String) null);
              hi.b(-82);
            } else {
              var5 = sf.field_d;
              if (var5 == 0 &&
                qb.field_N != null) {
                var5 = 1;
              }
              if (fh.a((byte) 79, var5) == 2) {
                vj.a(var5, param2, 1, 127);
              }
              eo.a(-3, -1, param1, ka.field_m, sf.field_d, var4_ref_String);
              hi.b(-82);
            }
          } else {
            hi.b(-82);
          }
          return true;
        }
        if (dg.field_e == 85) {
          if (var3 == 0) {
            return true;
          }
          if (io.field_h.length() > 0) {
            lo.a(-26750, io.field_h, -1 + io.field_h.length(), ' ');
          }
          return true;
        }
        var4 = tb.field_m;
        if (!id.a(false, (char) var4)) {
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (io.field_h.length() >= 80) {
          return true;
        }
        discarded$0 = io.field_h.append((char) var4);
        var5Lifetime1 = 485;
        var17 = ph.field_w;
        var16 = rh.a(var17, param0 ^ -125);
        var19 = var16;
        if (sf.field_d != 2) {
          var7 = "";
          if (sf.field_d != 0) {
            var23 = var7 + var19 + ": ";
            var5Lifetime1 = var5Lifetime1 - we.field_k.b(var23);
            if (we.field_k.b(io.field_h.toString()) > var5Lifetime1) {
              lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
            }
            return true;
          }
          if (qb.field_N == null) {
            if (!go.field_c) {
              if (null == qb.field_N) {
                var30 = var7 + var19 + ": ";
                var5Lifetime1 = var5Lifetime1 - we.field_k.b(var30);
                if (we.field_k.b(io.field_h.toString()) > var5Lifetime1) {
                  lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
                }
                return true;
              }
              if (!nh.field_Sb) {
                var26 = "[" + sk.a(new String[]{qb.field_N.field_ec}, qe.field_e, 120) + "] ";
                var27 = var26 + var19 + ": ";
                var5Lifetime1 = var5Lifetime1 - we.field_k.b(var27);
                if (we.field_k.b(io.field_h.toString()) > var5Lifetime1) {
                  lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
                }
                return true;
              }
              if (null != ec.field_h) {
                var24 = "[" + ec.field_h + "] ";
                var25 = var24 + var19 + ": ";
                var5Lifetime1 = var5Lifetime1 - we.field_k.b(var25);
                if (we.field_k.b(io.field_h.toString()) > var5Lifetime1) {
                  lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
                }
                return true;
              }
              var28 = "[" + sk.a(new String[]{qb.field_N.field_ec}, qe.field_e, 120) + "] ";
              var7 = var28;
              var29 = var28 + var19 + ": ";
              var5Lifetime1 = var5Lifetime1 - we.field_k.b(var29);
              if (we.field_k.b(io.field_h.toString()) > var5Lifetime1) {
                lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
              }
              return true;
            }
            var7 = "[" + nm.field_v + "] ";
          }
          if (null != qb.field_N) {
            if (!nh.field_Sb) {
              var33 = "[" + sk.a(new String[]{qb.field_N.field_ec}, qe.field_e, 120) + "] ";
              var34 = var33 + var19 + ": ";
              var5Lifetime1 = var5Lifetime1 - we.field_k.b(var34);
              if (we.field_k.b(io.field_h.toString()) > var5Lifetime1) {
                lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
              }
              return true;
            }
            if (null != ec.field_h) {
              var31 = "[" + ec.field_h + "] ";
              var32 = var31 + var19 + ": ";
              var5Lifetime1 = var5Lifetime1 - we.field_k.b(var32);
              if (we.field_k.b(io.field_h.toString()) > var5Lifetime1) {
                lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
              }
              return true;
            }
            var35 = "[" + sk.a(new String[]{qb.field_N.field_ec}, qe.field_e, 120) + "] ";
            var7 = var35;
            var36 = var35 + var19 + ": ";
            var5Lifetime1 = var5Lifetime1 - we.field_k.b(var36);
            if (we.field_k.b(io.field_h.toString()) > var5Lifetime1) {
              lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
            }
            return true;
          }
          var37 = var7 + var19 + ": ";
          var5Lifetime1 = var5Lifetime1 - we.field_k.b(var37);
        } else {
          var39 = (CharSequence) ((Object) ka.field_m);
          var18 = sk.a(new String[]{p.a(var39, (byte) 43)}, vd.field_b, param0 ^ 94);
          var8 = sk.a(new String[]{var16}, mc.field_h, 127);
          var9 = we.field_k.b(var18);
          var10 = we.field_k.b(var8);
          if (var9 > var10) {
            var5Lifetime1 = var5Lifetime1 - var9;
          } else {
            var5Lifetime1 = var5Lifetime1 - var10;
          }
        }
        if (we.field_k.b(io.field_h.toString()) <= var5Lifetime1) {
          return true;
        }
        lo.a(-26750, io.field_h, io.field_h.length() - 1, ' ');
        return true;
    }

    ug(pk param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_Y = param1;
          if (this.field_Y != null) {
            var3_int = ab.field_V.b(this.field_Y, 260, ab.field_V.field_N);
            this.a(300, (byte) 122, var3_int + 150);
          }
          this.field_db = new lg(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_Z = false;
          this.field_gb = false;
          this.field_db.field_K = true;
          this.c(this.field_db, 10);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ug.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_9_0 = 0;
        int stackIn_21_0 = 0;
        int var6;
        int var7;
        int var6Lifetime1;
        int var7Lifetime1;
        go.field_b[nd.field_Mb] = param4;
        qd.field_W[nd.field_Mb] = nd.field_Mb;
        lb.field_P[nd.field_Mb] = param2;
        if (param2 > eh.field_s) {
          va.field_z = param2;
        }
        if (param2 >= ai.field_h) {
          ac.field_b[nd.field_Mb] = param1;
          ai.field_g[nd.field_Mb] = param5;
          gl.field_n[nd.field_Mb] = param0;
          if (param3 != 20) {
            return;
          }
          var6 = param0 + param5 + param1;
          if (var6 != 0) {
            stackIn_21_0 = 1000 * param1 / var6;
          } else {
            stackIn_21_0 = 0;
          }
          var7 = stackIn_21_0;
          fe.field_b[nd.field_Mb] = var7;
          nd.field_Mb = nd.field_Mb + 1;
          if (mh.field_d > var7) {
            mh.field_d = var7;
          }
          if (var7 <= va.field_z) {
            return;
          }
          va.field_z = var7;
          return;
        }
        mh.field_d = param2;
        ac.field_b[nd.field_Mb] = param1;
        ai.field_g[nd.field_Mb] = param5;
        gl.field_n[nd.field_Mb] = param0;
        if (param3 != 20) {
          return;
        }
        var6Lifetime1 = param0 + param5 + param1;
        if (var6Lifetime1 != 0) {
          stackIn_9_0 = 1000 * param1 / var6Lifetime1;
        } else {
          stackIn_9_0 = 0;
        }
        var7Lifetime1 = stackIn_9_0;
        fe.field_b[nd.field_Mb] = var7Lifetime1;
        nd.field_Mb = nd.field_Mb + 1;
        if (mh.field_d > var7Lifetime1) {
          mh.field_d = var7Lifetime1;
        }
        if (var7Lifetime1 <= va.field_z) {
          return;
        }
        va.field_z = var7Lifetime1;
    }

    final static boolean o(int param0) {
        int var1 = 95 / ((param0 + 24) / 43);
        return bh.field_r;
    }

    public static void f(boolean param0) {
        field_ab = null;
        field_bb = null;
        field_X = null;
        if (!param0) {
          field_ib = null;
          field_hb = null;
          field_cb = null;
          return;
        }
        String var2 = (String) null;
        ug.a(-50L, (String) null, false, (String) null, 121);
        field_ib = null;
        field_hb = null;
        field_cb = null;
    }

    final static oh a(ah param0, byte param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        oh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a(-1, param3);
          if (param1 != -45) {
            field_cb = (jk) null;
          }
          var5 = param0.a(var4_int, false, param2);
          stackIn_3_0 = sj.a(-2, param0, var4_int, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ug.R(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(String param0, byte param1, float param2, boolean param3) {
        RuntimeException runtimeException = null;
        ah var6 = null;
        boolean stackIn_2_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = this.field_Z;
          if (param3) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = 1;
          }
          if ((stackIn_2_0 ? 1 : 0) == stackIn_3_1) {
            stackIn_8_1 = (param3);
            this.field_Z = stackIn_8_1;
            if (this.field_Z) {
              this.field_db.b(119, 8405024, 4210752);
              this.field_db.field_K = true;
            } else {
              this.field_db.b(-86, 2113632, 4210752);
              if (this.field_gb) {
                this.field_db.field_K = false;
              }
            }
          }
          if (param1 >= -102) {
            var6 = (ah) null;
            ug.a(104, (ah) null);
          }
          this.field_db.field_bb = (int)(param2 / 100.0f * 65536.0f);
          this.field_fb = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_18_0 = runtimeException;
          stackIn_18_1 = new StringBuilder().append("ug.O(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void e(boolean param0) {
        this.field_gb = param0 ? true : false;
        this.field_db.field_K = false;
    }

    final static void a(int param0, ah param1) {
        ag var2 = null;
        try {
          ag.a(param1.a("headers.packvorbis", "", true));
          if (param0 < 80) {
            ug.f(true);
          }
          var2 = ag.a(param1, "jagex logo2.packvorbis", "");
          var2.b();
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ug.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static hm a(long param0, String param1, boolean param2, String param3, int param4) {
        RuntimeException var6 = null;
        gg stackIn_3_0 = null;
        gl stackIn_7_0 = null;
        hm stackIn_10_0 = null;
        ka stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0L == param0 &&
            param1 != null) {
            stackIn_3_0 = new gg(param1, param3);
            return (hm) ((Object) stackIn_3_0);
          }
          if (param2) {
            stackIn_7_0 = new gl(param0, param3);
            return (hm) ((Object) stackIn_7_0);
          }
          if (param4 == -6336) {
            stackIn_12_0 = new ka(param0, param3);
            return (hm) ((Object) stackIn_12_0);
          }
          stackIn_10_0 = (hm) null;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ug.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, 82, param2);
        ab.field_V.a(this.field_fb, (this.field_F >> 1) + param2, 103 + param0, 16777215, -1);
        if (param1 >= 66) {
          if (null != this.field_Y) {
            ra.g(20 + param2, param0 + 113, 260, 8421504);
            ab.field_V.a(this.field_Y, param2 + 20, 8 + (param0 + 120), 260, 100, 16777215, -1, 1, 0, ab.field_V.field_N);
          }
          return;
        }
    }

    static {
        field_eb = -1;
        field_X = "Members";
        field_bb = new int[1024];
        field_cb = new jk();
    }
}
