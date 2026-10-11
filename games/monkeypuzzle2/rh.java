/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rh extends ua {
    private int field_D;
    boolean field_z;
    static boolean field_B;
    static int field_C;
    private kj field_A;

    private final int m(int param0) {
        RuntimeException var2 = null;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 11) {
            this.k(74);
          }
          if (!this.field_z) {
            stackIn_11_0 = 0;
          } else {
            stackIn_11_0 = (this == this.field_A.j(-106)) ? 256 : 0;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "rh.EB(" + param0 + ')');
        }
    }

    final we a(boolean param0) {
        we var2 = null;
        RuntimeException var2_ref = null;
        we stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = super.a(param0);
          if (null != var2) {
            stackIn_4_0 = var2;
            return stackIn_4_0;
          }
          if (!param0) {
            field_B = true;
          }
          return (we) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "rh.CB(" + param0 + ')');
        }
    }

    final static void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -117) {
            rh.a(-20);
          }
          cd.a(-1);
          hj.field_L = true;
          fk.field_a = true;
          wg.field_j.k(param0 ^ -29);
          vi.a(eg.field_f, 12345, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "rh.SA(" + param0 + ')');
        }
    }

    rh(kj param0, int param1, int param2) {
        super(tf.field_b - param1 >> 1, uj.field_l - param2 >> 1, param1, param2, (ml) null);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_A = param0;
          this.field_z = false;
          this.field_D = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("rh.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 1) {
            stackIn_4_0 = mg.field_s;
            return stackIn_4_0;
          }
          stackIn_2_0 = -111;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "rh.BB(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.field_D == 0) {
            return;
          }
          if (256 <= this.field_D) {
            if (param1 != 0) {
              return;
            }
            this.a(false, param3 + this.field_r, param2 + this.field_e);
            super.a(30, param1, param2, param3);
            return;
          }
          if (vg.field_M == null ||
            !(this.field_l <= vg.field_M.field_k) ||
            !(vg.field_M.field_j >= this.field_p)) {
            vg.field_M = new le(this.field_l, this.field_p);
          }
          mc.a(param0 ^ -8495, vg.field_M);
          ge.d();
          this.a(false, 0, 0);
          super.a(param0, param1, -param2 - this.field_e, -this.field_r - param3);
          tj.b(653);
          vg.field_M.b(this.field_r + param3, param2 + this.field_e, this.field_D);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var5), "rh.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    abstract void a(boolean param0, int param1, int param2);

    boolean b(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_D = this.m(108);
          if (param0) {
            return true;
          }
          stackIn_10_0 = (this.field_D == 0) && (!this.field_z);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "rh.Q(" + param0 + ')');
        }
    }

    final static void a(int param0, ad param1) {
        RuntimeException stackIn_144_0 = null;
        StringBuilder stackIn_144_1 = null;
        String stackIn_145_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        byte[] var2Lifetime3;
        byte[] var2Lifetime4;
        byte[] var2Lifetime5;
        byte[] var2Lifetime6;
        byte[] var2Lifetime7;
        byte[] var2Lifetime8;
        byte[] var2Lifetime9;
        byte[] var2Lifetime10;
        byte[] var2Lifetime11;
        byte[] var2Lifetime12;
        byte[] var2Lifetime13;
        byte[] var2Lifetime14;
        byte[] var2Lifetime15;
        byte[] var2Lifetime16;
        byte[] var2Lifetime17;
        byte[] var2Lifetime18;
        byte[] var2Lifetime19;
        byte[] var2Lifetime20;
        byte[] var2Lifetime21;
        byte[] var2Lifetime22;
        byte[] var2Lifetime23;
        byte[] var2Lifetime24;
        byte[] var2Lifetime25;
        byte[] var2Lifetime26;
        byte[] var2Lifetime27;
        byte[] var2Lifetime28;
        byte[] var2Lifetime29;
        byte[] var2Lifetime30;
        byte[] var2Lifetime31;
        byte[] var2Lifetime32;
        byte[] var2Lifetime33;
        byte[] var2Lifetime34;
        byte[] var2Lifetime35;
        byte[] var2Lifetime36;
        byte[] var2Lifetime37;
        byte[] var2Lifetime38;
        try {
          gf.field_b = param1;
          var2 = o.a((byte) 76, "score_colon_space");
          if (null != var2) {
            be.a(var2, (byte) 112);
          }
          var2Lifetime1 = o.a((byte) 76, "instructions_1");
          if (var2Lifetime1 != null) {
            mk.field_j = be.a(var2Lifetime1, (byte) 111);
          }
          var2Lifetime2 = o.a((byte) 76, "instructions_2");
          if (null != var2Lifetime2) {
            je.field_a = be.a(var2Lifetime2, (byte) -104);
          }
          var2Lifetime3 = o.a((byte) 76, "tips,0");
          if (var2Lifetime3 != null) {
            th.field_n[0] = be.a(var2Lifetime3, (byte) 68);
          }
          var2Lifetime4 = o.a((byte) 76, "tips,1");
          if (null != var2Lifetime4) {
            th.field_n[1] = be.a(var2Lifetime4, (byte) 100);
          }
          var2Lifetime5 = o.a((byte) 76, "tips,2");
          if (null != var2Lifetime5) {
            th.field_n[2] = be.a(var2Lifetime5, (byte) 66);
          }
          var2Lifetime6 = o.a((byte) 76, "tips,3");
          if (null != var2Lifetime6) {
            th.field_n[3] = be.a(var2Lifetime6, (byte) -36);
          }
          var2Lifetime7 = o.a((byte) 76, "tips,4");
          if (null != var2Lifetime7) {
            th.field_n[4] = be.a(var2Lifetime7, (byte) 100);
          }
          var2Lifetime8 = o.a((byte) 76, "notShowingTips");
          if (var2Lifetime8 != null) {
            lg.field_I = be.a(var2Lifetime8, (byte) -57);
          }
          var2Lifetime9 = o.a((byte) 76, "youHaveSeen");
          if (null != var2Lifetime9) {
            jg.field_kb = be.a(var2Lifetime9, (byte) -44);
          }
          var2Lifetime10 = o.a((byte) 76, "wellDone");
          if (null != var2Lifetime10) {
            wj.field_h = be.a(var2Lifetime10, (byte) -87);
          }
          var2Lifetime11 = o.a((byte) 76, "youScored");
          if (var2Lifetime11 != null) {
            cl.field_b = be.a(var2Lifetime11, (byte) -66);
          }
          var2Lifetime12 = o.a((byte) 76, "pressEnter");
          if (null != var2Lifetime12) {
            lb.field_A = be.a(var2Lifetime12, (byte) 77);
          }
          var2Lifetime13 = o.a((byte) 76, "levelComplete");
          if (null != var2Lifetime13) {
            sc.field_d = be.a(var2Lifetime13, (byte) -109);
          }
          var2Lifetime14 = o.a((byte) 76, "speedBonus");
          if (var2Lifetime14 != null) {
            ff.field_a = be.a(var2Lifetime14, (byte) 122);
          }
          var2Lifetime15 = o.a((byte) 76, "cancel");
          if (null != var2Lifetime15) {
            be.a(var2Lifetime15, (byte) 119);
          }
          var2Lifetime16 = o.a((byte) 76, "close");
          if (var2Lifetime16 != null) {
            be.a(var2Lifetime16, (byte) -41);
          }
          var2Lifetime17 = o.a((byte) 76, "members");
          if (var2Lifetime17 != null) {
            be.a(var2Lifetime17, (byte) 105);
          }
          var2Lifetime18 = o.a((byte) 76, "tipsColon");
          if (var2Lifetime18 != null) {
            pe.field_c = be.a(var2Lifetime18, (byte) -80);
          }
          var2Lifetime19 = o.a((byte) 76, "achievement_names,0");
          if (var2Lifetime19 != null) {
            rb.field_hb[0] = be.a(var2Lifetime19, (byte) -44);
          }
          var2Lifetime20 = o.a((byte) 76, "achievement_names,1");
          if (null != var2Lifetime20) {
            rb.field_hb[1] = be.a(var2Lifetime20, (byte) 94);
          }
          var2Lifetime21 = o.a((byte) 76, "achievement_names,2");
          if (null != var2Lifetime21) {
            rb.field_hb[2] = be.a(var2Lifetime21, (byte) -68);
          }
          var2Lifetime22 = o.a((byte) 76, "achievement_names,3");
          if (null != var2Lifetime22) {
            rb.field_hb[3] = be.a(var2Lifetime22, (byte) 89);
          }
          var2Lifetime23 = o.a((byte) 76, "achievement_names,4");
          if (null != var2Lifetime23) {
            rb.field_hb[4] = be.a(var2Lifetime23, (byte) 122);
          }
          var2Lifetime24 = o.a((byte) 76, "achievement_names,5");
          if (null != var2Lifetime24) {
            rb.field_hb[5] = be.a(var2Lifetime24, (byte) -107);
          }
          var2Lifetime25 = o.a((byte) 76, "achievement_names,6");
          if (null != var2Lifetime25) {
            rb.field_hb[6] = be.a(var2Lifetime25, (byte) -89);
          }
          var2Lifetime26 = o.a((byte) 76, "achievement_names,7");
          if (var2Lifetime26 != null) {
            rb.field_hb[7] = be.a(var2Lifetime26, (byte) 85);
          }
          var2Lifetime27 = o.a((byte) 76, "achievement_names,8");
          if (null != var2Lifetime27) {
            rb.field_hb[8] = be.a(var2Lifetime27, (byte) -28);
          }
          var2Lifetime28 = o.a((byte) 76, "achievement_names,9");
          if (null != var2Lifetime28) {
            rb.field_hb[9] = be.a(var2Lifetime28, (byte) 70);
          }
          var2Lifetime29 = o.a((byte) 76, "achievement_criteria,0");
          if (null != var2Lifetime29) {
            ki.field_r[0] = be.a(var2Lifetime29, (byte) 87);
          }
          var2Lifetime30 = o.a((byte) 76, "achievement_criteria,1");
          if (null != var2Lifetime30) {
            ki.field_r[1] = be.a(var2Lifetime30, (byte) -122);
          }
          var2Lifetime31 = o.a((byte) 76, "achievement_criteria,2");
          if (null != var2Lifetime31) {
            ki.field_r[2] = be.a(var2Lifetime31, (byte) 92);
          }
          var2Lifetime32 = o.a((byte) 76, "achievement_criteria,3");
          if (var2Lifetime32 != null) {
            ki.field_r[3] = be.a(var2Lifetime32, (byte) 84);
          }
          var2Lifetime33 = o.a((byte) 76, "achievement_criteria,4");
          if (var2Lifetime33 != null) {
            ki.field_r[4] = be.a(var2Lifetime33, (byte) 65);
          }
          var2Lifetime34 = o.a((byte) 76, "achievement_criteria,5");
          if (param0 != -9585) {
            return;
          }
          if (null != var2Lifetime34) {
            ki.field_r[5] = be.a(var2Lifetime34, (byte) 125);
          }
          var2Lifetime35 = o.a((byte) 76, "achievement_criteria,6");
          if (var2Lifetime35 != null) {
            ki.field_r[6] = be.a(var2Lifetime35, (byte) -33);
          }
          var2Lifetime36 = o.a((byte) 76, "achievement_criteria,7");
          if (var2Lifetime36 != null) {
            ki.field_r[7] = be.a(var2Lifetime36, (byte) -115);
          }
          var2Lifetime37 = o.a((byte) 76, "achievement_criteria,8");
          if (null != var2Lifetime37) {
            ki.field_r[8] = be.a(var2Lifetime37, (byte) -106);
          }
          var2Lifetime38 = o.a((byte) 76, "achievement_criteria,9");
          if (null != var2Lifetime38) {
            ki.field_r[9] = be.a(var2Lifetime38, (byte) 95);
          }
          gf.field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_144_0 = var2_ref;
          stackIn_144_1 = new StringBuilder().append("rh.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_145_2 = "null";
          } else {
            stackIn_145_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_144_0), ((StringBuilder) (Object) stackIn_144_1).append(stackIn_145_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2) {
        try {
          this.a(param0, 13361, tf.field_b - param2 >> 1, param2, -param0 + uj.field_l >> 1);
          int var4_int = -46 / ((60 - param1) / 49);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "rh.AB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean k(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        boolean stackIn_19_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -23913) {
            this.field_z = false;
          }
          var2_int = this.m(93);
          var3 = var2_int - this.field_D;
          if (0 < var3) {
            this.field_D = this.field_D + (8 + (var3 - 1)) / 8;
          }
          if (var3 < 0) {
            this.field_D = this.field_D + (1 + var3 - 16) / 16;
          }
          stackIn_19_0 = (this.field_D == 0) && (0 == var2_int) && (!this.field_z);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "rh.BA(" + param0 + ')');
        }
    }

    final static void l(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_11_0 = 0;
        rb stackIn_57_0 = null;
        RuntimeException decompiledCaughtException = null;
        hb var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int var4_int = 0;
        String var5_ref_String = null;
        int var5 = 0;
        String var6 = null;
        rb var6_ref = null;
        rb var7 = null;
        String var7_ref = null;
        rb var8 = null;
        String var8_ref = null;
        int var9 = 0;
        Object var4Lifetime1;
        String var5_ref_StringLifetime1;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var1 = MonkeyPuzzle2.field_D;
          var2 = -22 % ((param0 - 37) / 33);
          var3 = var1.a((byte) 114);
          if (var3 == 0) {
            if (null == ah.field_b) {
              ah.field_b = new vd(128);
              jj.field_F = 0;
            }
            stackIn_11_0 = (var1.a((byte) 114) != 1) ? 0 : 1;
            var4_int = stackIn_11_0;
            var5_ref_String = var1.f(-1);
            if (var4_int != 0) {
              var1.f(-1);
            }
            var6_ref = ja.a(var5_ref_String, -1684349368);
            var7_ref = var1.f(-1);
            var8_ref = pl.a((byte) 115, (CharSequence) ((Object) var5_ref_String));
            if (null == var8_ref) {
              var8_ref = var5_ref_String;
            }
            if (null == var6_ref) {
              var6_ref = ja.a(var7_ref, -1684349368);
              if (var6_ref != null) {
                ah.field_b.a(var6_ref, (long)var8_ref.hashCode(), -90);
              }
            }
            if (var6_ref == null) {
              var6_ref = new rb();
              ah.field_b.a(var6_ref, (long)var8_ref.hashCode(), -98);
              fieldTemp$1 = jj.field_F;
              jj.field_F = jj.field_F + 1;
              var6_ref.field_gb = fieldTemp$1;
              wl.field_d.a(-8212, var6_ref);
            }
            var6_ref.field_db = var5_ref_String;
            return;
          }
          if (var3 != 1) {
            if (var3 == 2) {
              if (ci.field_b == 1) {
                ci.field_b = 2;
              }
              return;
            }
            if (3 == var3) {
              if (ci.field_b == 2) {
                ci.field_b = 1;
              }
              return;
            }
            if (var3 != 4) {
              kk.a("F1: " + bh.a((byte) -109), (byte) 115, (Throwable) null);
              gk.a(-1);
              return;
            }
            ci.field_b = 1;
            var4 = var1.f(-1);
            cm.field_G = ((String) (var4)).intern();
            var5 = var1.a((byte) 114);
            cm.a(var5, (byte) -117);
            return;
          }
          if (null == pj.field_a) {
            pj.field_a = new vd(128);
            nc.field_f = 0;
          }
          var4Lifetime1 = var1.f(-1);
          if (((String) (var4Lifetime1)).equals("")) {
            var4Lifetime1 = null;
          }
          var5_ref_StringLifetime1 = var1.f(-1);
          var6 = var1.f(-1);
          var7 = ch.a(var5_ref_StringLifetime1, -1);
          if (var7 == null) {
            var7 = ch.a(var6, -1);
            if (var7 != null) {
              pj.field_a.a(var7, (long)pl.a((byte) 123, (CharSequence) ((Object) var5_ref_StringLifetime1)).hashCode(), -101);
            }
          }
          if (null == var7) {
            var7 = new rb();
            pj.field_a.a(var7, (long)pl.a((byte) 109, (CharSequence) ((Object) var5_ref_StringLifetime1)).hashCode(), -98);
            fieldTemp$0 = nc.field_f;
            nc.field_f = nc.field_f + 1;
            var7.field_gb = fieldTemp$0;
            kc.field_a.a(-8212, var7);
          }
          if (var4Lifetime1 != null) {
            var4Lifetime1 = ((String) (var4Lifetime1)).intern();
          }
          var7.field_bb = (String) (var4Lifetime1);
          var7.field_db = var5_ref_StringLifetime1;
          var7.c(-19822);
          var8 = (rb) (kc.field_a.a((byte) -117));
          L6: while (true) {
            if (null != var8) {
              stackIn_57_0 = var8;
              if (var9 != 0) {
                break L6;
              }
              if (ld.a(stackIn_57_0, -24612, var7)) {
                var8 = (rb) (kc.field_a.d((byte) 63));
                continue;
              }
            }
            stackIn_57_0 = var8;
            break;
          }
          if (stackIn_57_0 == null) {
            kc.field_a.a(-8212, var7);
            if (var9 == 0) {
              return;
            }
          }
          ja.a(var8, var7, -99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1_ref), "rh.DB(" + param0 + ')');
        }
    }

    static {
        field_B = true;
    }
}
