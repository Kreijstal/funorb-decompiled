/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    short[] field_L;
    short[] field_F;
    int[] field_c;
    short field_o;
    short[] field_J;
    short[] field_k;
    int[] field_q;
    short[] field_P;
    int field_K;
    short[] field_n;
    static String field_z;
    short field_m;
    int[] field_e;
    int field_v;
    int[] field_i;
    int field_a;
    static int field_h;
    short[] field_C;
    byte field_I;
    int field_t;
    int[] field_Q;
    short[] field_D;
    short[] field_j;
    static fa field_G;
    short[] field_y;
    short[] field_g;
    int[] field_w;
    private boolean field_H;
    int[] field_b;
    short[] field_A;
    int field_r;
    byte[] field_f;
    short[] field_x;
    short[] field_p;
    int field_M;
    short field_l;
    int[] field_O;
    int[] field_d;
    short[] field_s;
    short[] field_u;
    short[] field_B;
    static String field_N;
    short[] field_E;

    final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Terraphoenix.field_V;
        try {
          if (this.field_H) {
            return;
          }
          this.field_H = true;
          var2_int = 32767;
          var3 = 32767;
          if (param0 != 41) {
            return;
          }
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          while (this.field_m > var8) {
            var9 = this.field_D[var8];
            var10 = this.field_B[var8];
            if (var12 != 0) {
              return;
            }
            if (var9 > var5) {
              var5 = var9;
            }
            if (var2_int > var9) {
              var2_int = var9;
            }
            if (var10 < var3) {
              var3 = var10;
            }
            var11 = this.field_L[var8];
            if (var10 > var6) {
              var6 = var10;
            }
            if (var7 < var11) {
              var7 = var11;
            }
            if (var4 > var11) {
              var4 = var11;
            }
            var8++;
          }
          this.field_r = var2_int;
          this.field_M = var3;
          this.field_t = var7;
          this.field_v = var4;
          this.field_K = var5;
          this.field_a = var6;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "ee.C(" + param0 + ')');
        }
    }

    private final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 >= -100) {
            ee.b((byte) -122);
          }
          this.field_H = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "ee.B(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Terraphoenix.field_V;
        try {
          if (!param0) {
            this.a(-69);
          }
          var6_int = 0;
          while (var6_int < this.field_m) {
            this.field_D[var6_int] = (short)(param4 * this.field_D[var6_int] / param3);
            this.field_B[var6_int] = (short)(this.field_B[var6_int] * param1 / param3);
            this.field_L[var6_int] = (short)(this.field_L[var6_int] * param2 / param3);
            var6_int++;
            if (var7 != 0) {
              return;
            }
          }
          this.a(-112);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var6), "ee.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Terraphoenix.field_V;
        try {
          var5_int = 0;
          while (this.field_m > var5_int) {
            this.field_D[var5_int] = (short)(this.field_D[var5_int] + param2);
            this.field_B[var5_int] = (short)(this.field_B[var5_int] + param3);
            this.field_L[var5_int] = (short)(this.field_L[var5_int] + param1);
            var5_int++;
            if (var6 != 0) {
              return;
            }
          }
          if (!param0) {
            this.field_H = true;
          }
          this.a(-107);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) runtimeException), "ee.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, fa param1) {
        RuntimeException runtimeException = null;
        tl var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          tl.a(param1.a("headers.packvorbis", "", -21653));
          var2 = tl.a(param1, "jagex logo2.packvorbis", "");
          if (param0 != 51) {
            return;
          }
          var2.a();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ee.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        try {
          field_G = null;
          field_N = null;
          field_z = null;
          if (param0 != 20) {
            field_h = -43;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ee.G(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_49_0 = false;
        int stackIn_56_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_48_0;
        uc var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        q var5_ref = null;
        q var6 = null;
        String var6_ref = null;
        q var7 = null;
        String var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = Terraphoenix.field_V;
        try {
          var1 = mk.field_j;
          var2 = var1.a(-16384);
          if (0 == var2) {
            if (null == ai.field_f) {
              ai.field_f = new vb(128);
              cb.field_I = 0;
            }
            stackIn_12_0 = (var1.a(-16384) != 1) ? 0 : 1;
            var3_int = stackIn_12_0;
            var4_ref_String = var1.e(-1);
            if (var3_int != 0) {
              var1.e(-1);
            }
            var5_ref = dm.a((byte) -85, var4_ref_String);
            var6_ref = var1.e(-1);
            var7_ref = hm.a((byte) 106, (CharSequence) ((Object) var4_ref_String));
            if (var7_ref == null) {
              var7_ref = var4_ref_String;
            }
            if (null == var5_ref) {
              var5_ref = dm.a((byte) -85, var6_ref);
              if (var5_ref != null) {
                ai.field_f.a(false, var5_ref, (long)var7_ref.hashCode());
              }
            }
            if (var5_ref == null) {
              var5_ref = new q();
              ai.field_f.a(false, var5_ref, (long)var7_ref.hashCode());
              fieldTemp$1 = cb.field_I;
              cb.field_I = cb.field_I + 1;
              var5_ref.field_Mb = fieldTemp$1;
              r.field_j.a(var5_ref, -16611);
            }
            var5_ref.field_Lb = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (jg.field_gb == 1) {
                jg.field_gb = 2;
              }
              return;
            }
            if (3 == var2) {
              if (2 == jg.field_gb) {
                jg.field_gb = 1;
              }
              return;
            }
            if (param0 < 111) {
              return;
            }
            if (var2 != 4) {
              bd.a((Throwable) null, "F1: " + r.i(-15465), 111);
              gb.g(-17464);
              return;
            }
            jg.field_gb = 1;
            var3 = var1.e(-1);
            ml.field_t = ((String) (var3)).intern();
            var4 = var1.a(-16384);
            ve.a(2, var4);
            return;
          }
          if (gb.field_z == null) {
            gb.field_z = new vb(128);
            gj.field_a = 0;
          }
          var3Lifetime1 = var1.e(-1);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.e(-1);
          var5 = var1.e(-1);
          var6 = dd.a((byte) 104, var4_ref_StringLifetime1);
          if (var6 == null) {
            var6 = dd.a((byte) 104, var5);
            if (null != var6) {
              gb.field_z.a(false, var6, (long)hm.a((byte) 92, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode());
            }
          }
          if (var6 == null) {
            var6 = new q();
            gb.field_z.a(false, var6, (long)hm.a((byte) -121, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode());
            fieldTemp$0 = gj.field_a;
            gj.field_a = gj.field_a + 1;
            var6.field_Mb = fieldTemp$0;
            sb.field_h.a(var6, -16611);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6.field_Eb = (String) (var3Lifetime1);
          var6.field_Lb = var4_ref_StringLifetime1;
          var6.b((byte) 12);
          var7 = (q) (sb.field_h.d(9272));
          L9: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var7 != null) {
              stackOut_48_0 = ji.a((byte) -19, var6, var7);
              stackIn_56_0 = stackOut_48_0 ? 1 : 0;
              stackIn_49_0 = stackOut_48_0;
              decompiledFrameRemainder0 = (var8 == 0);
              if ((decompiledFrameRemainder0) &&
                (stackIn_49_0)) {
                var7 = (q) (sb.field_h.e((byte) -119));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (null == var7) {
                break L9;
              }
              stackIn_56_0 = 119;
            }
            ha.a(stackIn_56_0, var7, var6);
            if (var8 == 0) {
              return;
            }
            break;
          }
          sb.field_h.a(var6, -16611);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1_ref), "ee.E(" + param0 + ')');
        }
    }

    ee() {
        this.field_H = false;
        this.field_I = (byte) 0;
    }

    static {
        field_z = "Open help";
        field_N = "3000pts";
    }
}
