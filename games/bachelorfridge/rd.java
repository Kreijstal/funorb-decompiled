/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends td {
    rd(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_n = param3;
          this.field_k = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("rd.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int[] a(boolean param0, lu param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_3_0 = null;
        int[] stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          var2 = new int[50];
          var3 = param1.b(16711935);
          var4 = 0;
          if (!param0) {
            stackIn_3_0 = (int[]) null;
            return stackIn_3_0;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 <= var4))) {
            stackIn_10_0 = var2;
            if (var5 == 0) {
              stackIn_10_0[param1.b(16711935)] = param1.b(16711935);
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_10_0 = var2;
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_14_0 = var2_ref;
          stackIn_14_1 = new StringBuilder().append("rd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        ak var4 = null;
        ak stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_h.a(param1 + 63, param0);
          var4 = new ak(this.field_g, new nq(var3));
          var4.field_r = this.field_k;
          var4.field_s = this.field_n;
          var4.field_o.a(new eba(), true);
          if (param1 != 3) {
            rd.c((byte) 77);
          }
          stackIn_4_0 = var4;
          return (ii) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("rd.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void c(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_50_0 = false;
        int stackIn_60_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_49_0;
        pf var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        nea var6 = null;
        String var7 = null;
        nea var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        nea var6Lifetime1;
        var9 = BachelorFridge.field_y;
        try {
          var1 = ig.field_m;
          var2 = var1.b(param0 + 16712046);
          if (var2 == 0) {
            if (fq.field_s == null) {
              fq.field_s = new wma(128);
              bda.field_l = 0;
            }
            stackIn_11_0 = (var1.b(param0 + 16712046) != 1) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.g(83);
            if (var3_int != 0) {
              var5 = var1.g(43);
            }
            if (var3_int == 0 ||
              var9 != 0) {
              var5 = var4_ref_String;
            }
            var6 = di.a(var4_ref_String, -118);
            var7 = var1.g(param0 + 157);
            var8 = fq.a(0, (CharSequence) ((Object) var4_ref_String));
            if (var8 == null) {
              var8 = var4_ref_String;
            }
            if (null == var6) {
              var6 = di.a(var7, -124);
              if (null != var6) {
                fq.field_s.a(var6, 91, (long)var8.hashCode());
              }
            }
            if (null == var6) {
              var6 = new nea();
              fq.field_s.a(var6, 91, (long)var8.hashCode());
              fieldTemp$0 = bda.field_l;
              bda.field_l = bda.field_l + 1;
              var6.field_wb = fieldTemp$0;
              cca.field_v.a(var6, true);
            }
            var6.field_xb = var4_ref_String;
            var6.field_Cb = var5;
            var6.field_Ab = var7;
            return;
          }
          if (1 != var2) {
            if (var2 == 2) {
              if (um.field_c == 1) {
                um.field_c = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (um.field_c == 2) {
                um.field_c = 1;
              }
              return;
            }
            if (var2 != 4) {
              cv.a(1, "F1: " + nia.d((byte) -89), (Throwable) null);
              vc.a((byte) -122);
              return;
            }
            um.field_c = 1;
            var3 = var1.g(52);
            sja.field_gb = ((String) (var3)).intern();
            var4 = var1.b(param0 ^ -16711826);
            em.a(param0 ^ -109, var4);
            return;
          }
          if (wja.field_m == null) {
            wja.field_m = new wma(128);
            maa.field_v = 0;
          }
          var3Lifetime1 = var1.g(79);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.g(param0 ^ -40);
          var5Lifetime1 = var1.g(-94);
          var6Lifetime1 = bna.b(-51, var4_ref_StringLifetime1);
          if (var6Lifetime1 == null) {
            var6Lifetime1 = bna.b(-102, var5Lifetime1);
            if (var6Lifetime1 != null) {
              wja.field_m.a(var6Lifetime1, 91, (long)fq.a(0, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode());
            }
          }
          if (var6Lifetime1 == null) {
            var6Lifetime1 = new nea();
            wja.field_m.a(var6Lifetime1, param0 ^ -54, (long)fq.a(0, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode());
            fieldTemp$1 = maa.field_v;
            maa.field_v = maa.field_v + 1;
            var6Lifetime1.field_wb = fieldTemp$1;
            es.field_j.a(var6Lifetime1, true);
          }
          if (null != var3Lifetime1) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_vb = (String) (var3Lifetime1);
          var6Lifetime1.field_Ab = var5Lifetime1;
          var6Lifetime1.field_xb = var4_ref_StringLifetime1;
          var6Lifetime1.a(false);
          var7_ref = (nea) (es.field_j.b((byte) 90));
          L14: while (true) {
            if (var7_ref != null) {
              stackOut_49_0 = re.a(param0 ^ -29797, var7_ref, var6Lifetime1);
              stackIn_60_0 = stackOut_49_0 ? 1 : 0;
              stackIn_50_0 = stackOut_49_0;
              if (var9 != 0) {
                break L14;
              }
              if (stackIn_50_0) {
                var7_ref = (nea) (es.field_j.c(0));
                continue;
              }
            }
            if (var7_ref == null) {
              es.field_j.a(var6Lifetime1, true);
              if (var9 == 0) {
                return;
              }
            }
            stackIn_60_0 = -74;
            break;
          }
          nr.$cfr$intArgs$a$94cfdbf41ae0(stackIn_60_0, var7_ref, var6Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "rd.C(" + param0 + ')');
        }
    }

    static {
    }
}
