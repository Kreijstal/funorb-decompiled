/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    static int[] field_k;
    private long[] field_b;
    private int field_c;
    private byte[] field_e;
    private byte[] field_m;
    private long[] field_a;
    private long[] field_j;
    static String field_g;
    private long[] field_d;
    private long[] field_h;
    static String field_i;
    private int field_f;
    static ri field_l;

    final void b(int param0) {
        int var2 = 0;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; 32 > var2; var2++) {
          this.field_e[var2] = (byte) 0;
        }
        this.field_c = 0;
        this.field_m[0] = (byte) 0;
        if (param0 != 32) {
          byte[] var4 = (byte[]) null;
          this.a((byte[]) null, 76, -115);
        }
        this.field_f = 0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_j[var2Lifetime1] = 0L;
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        dm var9 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          this.field_m[this.field_c] = (byte)cr.b((int) this.field_m[this.field_c], 128 >>> tq.b(this.field_f, 7));
          this.field_c = this.field_c + 1;
          if (this.field_c > 32) {
            while (this.field_c < 64) {
              fieldTemp$0 = this.field_c;
              this.field_c = this.field_c + 1;
              this.field_m[fieldTemp$0] = (byte) 0;
            }
            this.a(param1 - 3);
            this.field_c = 0;
          }
          while (this.field_c < 32) {
            fieldTemp$1 = this.field_c;
            this.field_c = this.field_c + 1;
            this.field_m[fieldTemp$1] = (byte) 0;
          }
          d.a(this.field_e, 0, this.field_m, 32, 32);
          this.a(-2);
          var4_int = 0;
          if (param1 != 1) {
            var9 = (dm) null;
            wl.a(-29, (tq) null, -43, 102, (byte) 41, -126, (dm) null);
          }
          var5 = param2;
          while (var4_int < 8) {
            var6 = this.field_j[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[1 + var5] = (byte)(int)(var6 >>> 48);
            param0[2 + var5] = (byte)(int)(var6 >>> 40);
            param0[var5 + 3] = (byte)(int)(var6 >>> 32);
            param0[4 + var5] = (byte)(int)(var6 >>> 24);
            param0[5 + var5] = (byte)(int)(var6 >>> 16);
            param0[6 + var5] = (byte)(int)(var6 >>> 8);
            param0[var5 + 7] = (byte)(int)var6;
            var5 += 8;
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("wl.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 0;
        if (param0 != -2) {
          field_l = (ri) null;
        }
        var3 = 0;
        while (var2 < 8) {
          this.field_h[var2] = tq.a(en.a(255L, (long)this.field_m[7 + var3]), tq.a(en.a(255L, (long)this.field_m[6 + var3]) << 8, tq.a(en.a(255L, (long)this.field_m[var3 + 5]) << 16, tq.a(tq.a(tq.a(en.a(280375465082880L, (long)this.field_m[var3 + 2] << 40), tq.a((long)this.field_m[var3] << 56, en.a((long)this.field_m[var3 + 1], 255L) << 48)), en.a((long)this.field_m[var3 + 3] << 32, 1095216660480L)), en.a((long)this.field_m[var3 + 4] << 24, 4278190080L)))));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          dupTemp$0 = this.field_j[var2Lifetime1];
          arrayValue$1 = this.field_h[var2Lifetime1];
          this.field_d[var2Lifetime1] = dupTemp$0;
          this.field_b[var2Lifetime1] = tq.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_a[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_a[var3Lifetime1] = tq.a(this.field_a[var3Lifetime1], p.field_f[var4][tq.b(255, (int)(this.field_d[tq.b(7, -var4 + var3Lifetime1)] >>> var5))]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_d[var3Lifetime1Lifetime1] = this.field_a[var3Lifetime1Lifetime1];
          }
          this.field_d[0] = tq.a(this.field_d[0], p.field_d[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_a[var3Lifetime1Lifetime2] = this.field_d[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_a[var3Lifetime1Lifetime2] = tq.a(this.field_a[var3Lifetime1Lifetime2], p.field_f[var7][tq.b((int)(this.field_b[tq.b(7, var3Lifetime1Lifetime2 - var7)] >>> var5Lifetime1), 255)]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_b[var3Lifetime1Lifetime3] = this.field_a[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; 8 > var2Lifetime3; var2Lifetime3++) {
          this.field_j[var2Lifetime3] = tq.a(this.field_j[var2Lifetime3], tq.a(this.field_h[var2Lifetime3], this.field_b[var2Lifetime3]));
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        field_k = null;
        field_g = null;
        if (!param0) {
          wl.a(true);
        }
        field_i = null;
    }

    final void a(byte[] param0, int param1, long param2) {
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        long var10 = 0L;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var9Lifetime1;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5_int = -58 / ((-10 - param1) / 50);
          var6 = 0;
          var7 = 8 - ((int)param2 & 7) & 7;
          var8 = 7 & this.field_f;
          var10 = param2;
          var12 = 31;
          var13 = 0;
          while (var12 >= 0) {
            var13 = var13 + ((255 & this.field_e[var12]) + (255 & (int)var10));
            this.field_e[var12] = (byte)var13;
            var10 = var10 >>> 8;
            var13 = var13 >>> 8;
            var12--;
          }
          while (param2 > 8L) {
            var9 = param0[var6] << var7 & 255 | (param0[1 + var6] & 255) >>> 8 - var7;
            if (0 <= var9 &&
              var9 < 256) {
              this.field_m[this.field_c] = (byte)cr.b((int) this.field_m[this.field_c], var9 >>> var8);
              this.field_c = this.field_c + 1;
              this.field_f = this.field_f + (-var8 + 8);
              if (512 == this.field_f) {
                this.a(-2);
                this.field_f = 0;
                this.field_c = 0;
              }
              this.field_m[this.field_c] = (byte)tq.b(var9 << 8 - var8, 255);
              param2 = param2 - 8L;
              this.field_f = this.field_f + var8;
              var6++;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param2 > 0L) {
            stackIn_16_0 = 255;
            stackIn_16_1 = param0[var6] << var7;
            var9Lifetime1 = stackIn_16_0 & stackIn_16_1;
            this.field_m[this.field_c] = (byte)cr.b((int) this.field_m[this.field_c], var9Lifetime1 >>> var8);
          } else {
            var9Lifetime1 = 0;
          }
          if ((long)var8 + param2 >= 8L) {
            param2 = param2 - (long)(-var8 + 8);
            this.field_c = this.field_c + 1;
            this.field_f = this.field_f + (8 - var8);
            if (this.field_f == 512) {
              this.a(-2);
              this.field_c = 0;
              this.field_f = 0;
            }
            this.field_m[this.field_c] = (byte)tq.b(255, var9Lifetime1 << -var8 + 8);
            this.field_f = this.field_f + (int)param2;
          } else {
            this.field_f = (int)((long)this.field_f + param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("wl.D(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        int var4;
        String var4_ref_String;
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
        String var20;
        Object var21;
        CharSequence var22;
        int var5Lifetime1;
        String var7Lifetime1;
        String var7Lifetime2;
        String var7Lifetime3;
        String var7Lifetime4;
        String var7Lifetime5;
        String var7Lifetime6;
        var21 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = 1;
        if (!sp.field_h &&
          lj.field_v == null) {
          var3 = 0;
        }
        if (va.field_a == 0 &&
          ej.field_n != null) {
          var3 = 0;
        }
        if (va.field_a == 2 &&
          !tl.d((byte) -20)) {
          var3 = 0;
        }
        if (sj.field_p == 84) {
          if (var3 != 0) {
            if (rm.field_a.length() > 0) {
              var4_ref_String = rm.field_a.toString();
              if (!so.a(-115, var4_ref_String)) {
                var5 = va.field_a;
                if (var5 == 0 &&
                  mh.field_c != null) {
                  var5 = 1;
                }
                if (ga.a(var5, true) == 2) {
                  kp.a(var5, param2, 1, true);
                }
                kb.a(-1, qf.field_g, param0, var4_ref_String, va.field_a, 29602);
              } else {
                var13 = (String) null;
                var12 = (String) null;
                vm.a((String) null, 0, (String) null, iq.field_d, 2, 0);
                var15 = (String) null;
                var14 = (String) null;
                vm.a((String) null, 0, (String) null, o.field_l, 2, 0);
              }
            }
            pf.a(64);
          } else {
            if (0 != va.field_a) {
              pf.a(48);
            }
          }
          return true;
        }
        if (sj.field_p == 85) {
          if (var3 != 0 &&
            rm.field_a.length() > 0) {
            lf.a(' ', rm.field_a.length() - 1, 0, rm.field_a);
          }
          return true;
        }
        var4 = pn.field_d;
        if (!og.a((char) var4, (byte) 123)) {
          if (param1 < 30) {
            field_i = (String) null;
          }
          return false;
        }
        if (var3 != 0) {
          if (80 <= rm.field_a.length()) {
            return true;
          }
          discarded$0 = rm.field_a.append((char) var4);
          var5Lifetime1 = 485;
          var17 = ta.field_lb;
          var7 = var17;
          var7Lifetime1 = var17;
          var16 = nh.a(2, var17);
          var7Lifetime2 = var16;
          var7Lifetime3 = var16;
          var19 = var16;
          var7Lifetime4 = var19;
          var7Lifetime5 = var19;
          if (va.field_a != 2) {
            var7Lifetime6 = "";
            if (va.field_a == 0) {
              if (null == mh.field_c &&
                sn.field_Hb) {
                var7Lifetime6 = "[" + ne.field_vb + "] ";
              }
              if (mh.field_c != null) {
                if (wa.field_k &&
                  bp.field_t != null) {
                  var7Lifetime6 = "[" + bp.field_t + "] ";
                } else {
                  var7Lifetime6 = "[" + vl.a(ae.field_g, new String[]{mh.field_c.field_Nb}, 2) + "] ";
                }
              }
            }
            var20 = var7Lifetime6 + var19 + ": ";
            var5Lifetime1 = var5Lifetime1 - w.field_A.a(var20);
          } else {
            var22 = (CharSequence) ((Object) qf.field_g);
            var18 = vl.a(v.field_c, new String[]{ld.a((byte) 0, var22)}, 2);
            var7Lifetime6 = var18;
            var7Lifetime6 = var18;
            var8 = vl.a(lc.field_n, new String[]{var16}, 2);
            var7Lifetime6 = var8;
            var7Lifetime6 = var8;
            var9 = w.field_A.a(var18);
            var10 = w.field_A.a(var8);
            if (var10 < var9) {
              var5Lifetime1 = var5Lifetime1 - var9;
            } else {
              var5Lifetime1 = var5Lifetime1 - var10;
            }
          }
          if (w.field_A.a(rm.field_a.toString()) > var5Lifetime1) {
            lf.a(' ', -1 + rm.field_a.length(), 0, rm.field_a);
          }
        }
        return true;
    }

    final static void a(int param0, tq param1, int param2, int param3, byte param4, int param5, dm param6) {
        jb var13 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
          ve.a(param6.field_ec, 196, param6.field_Lb, param1, param6.field_Jb, param6, -1, (int[]) null, -1);
          pk.field_b.a(true, (byte) -102);
          pk.field_b.a(0, (int[]) null, (byte) 13);
          pk.field_b.c(param4 ^ -42);
          if (param4 != 81) {
            wl.a(-56, -95, -27);
          }
          var13 = pk.field_b;
          var8 = param5;
          var9 = param0;
          var10 = param3;
          var11 = param2;
          var13.field_j.b(4542, var8, var11, var9, var10);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "wl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    wl() {
        this.field_b = new long[8];
        this.field_m = new byte[64];
        this.field_j = new long[8];
        this.field_d = new long[8];
        this.field_e = new byte[32];
        this.field_a = new long[8];
        this.field_f = 0;
        this.field_h = new long[8];
        this.field_c = 0;
    }

    static {
        field_g = "Powerups with this modifier can be used on enemy zombies, but can only be applied to a few - experiment with it...";
        field_i = "End of Free Game";
    }
}
