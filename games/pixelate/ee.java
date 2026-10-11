/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    private bb field_b;
    private rd[] field_e;
    static String field_c;
    static String field_a;
    static int field_d;

    final int a(boolean param0) {
        rd var2 = null;
        RuntimeException var2_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            field_c = (String) null;
          }
          var2 = (rd) (this.field_b.c(1504642273));
          if (null == var2) {
            stackIn_9_0 = -1;
            return stackIn_9_0;
          }
          var2.c(2779);
          stackIn_7_0 = var2.field_k;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "ee.D(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_50_0 = false;
        int stackIn_60_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_49_0;
        pc var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        im var6 = null;
        String var7 = null;
        im var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        im var6Lifetime1;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          var1 = vi.field_o;
          var2 = var1.f(255);
          if (var2 == 0) {
            if (null == hq.field_q) {
              hq.field_q = new vg(128);
              aj.field_t = 0;
            }
            stackIn_11_0 = (var1.f(255) != 1) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.h(5);
            if (var3_int != 0) {
              var5 = var1.h(5);
            }
            if (var3_int == 0 ||
              var9 != 0) {
              var5 = var4_ref_String;
            }
            var6 = fh.a(var4_ref_String, -106);
            var7 = var1.h(5);
            var8 = dh.a((CharSequence) ((Object) var4_ref_String), (byte) 100);
            if (null == var8) {
              var8 = var4_ref_String;
            }
            if (var6 == null) {
              var6 = fh.a(var7, 69);
              if (null != var6) {
                hq.field_q.a(false, var6, (long)var8.hashCode());
              }
            }
            if (var6 == null) {
              var6 = new im();
              hq.field_q.a(false, var6, (long)var8.hashCode());
              fieldTemp$0 = aj.field_t;
              aj.field_t = aj.field_t + 1;
              var6.field_Kb = fieldTemp$0;
              bq.field_b.a(22125, var6);
            }
            var6.field_Ib = var5;
            var6.field_Fb = var4_ref_String;
            var6.field_Gb = var7;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (gk.field_db == 1) {
                gk.field_db = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (gk.field_db == 2) {
                gk.field_db = 1;
              }
              return;
            }
            if (4 != var2) {
              jo.a(1, "F1: " + jm.b(-8), (Throwable) null);
              if (param0 >= -89) {
                return;
              }
              na.a(true);
              return;
            }
            gk.field_db = 1;
            var3 = var1.h(5);
            qp.field_L = ((String) (var3)).intern();
            var4 = var1.f(255);
            vm.b(var4, (byte) -113);
            return;
          }
          if (null == vm.field_b) {
            vm.field_b = new vg(128);
            f.field_q = 0;
          }
          var3Lifetime1 = var1.h(5);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.h(5);
          var5Lifetime1 = var1.h(5);
          var6Lifetime1 = re.a(var4_ref_StringLifetime1, -1);
          if (null == var6Lifetime1) {
            var6Lifetime1 = re.a(var5Lifetime1, -1);
            if (null != var6Lifetime1) {
              vm.field_b.a(false, var6Lifetime1, (long)dh.a((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) 29).hashCode());
            }
          }
          if (null == var6Lifetime1) {
            var6Lifetime1 = new im();
            vm.field_b.a(false, var6Lifetime1, (long)dh.a((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) 70).hashCode());
            fieldTemp$1 = f.field_q;
            f.field_q = f.field_q + 1;
            var6Lifetime1.field_Kb = fieldTemp$1;
            vp.field_Hb.a(22125, var6Lifetime1);
          }
          if (null != var3Lifetime1) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Fb = var4_ref_StringLifetime1;
          var6Lifetime1.field_Nb = (String) (var3Lifetime1);
          var6Lifetime1.field_Gb = var5Lifetime1;
          var6Lifetime1.c(2779);
          var7_ref = (im) (vp.field_Hb.c(1504642273));
          L16: while (true) {
            if (null != var7_ref) {
              stackOut_49_0 = hn.a((byte) 115, var6Lifetime1, var7_ref);
              stackIn_60_0 = stackOut_49_0 ? 1 : 0;
              stackIn_50_0 = stackOut_49_0;
              if (var9 != 0) {
                break L16;
              }
              if (stackIn_50_0) {
                var7_ref = (im) (vp.field_Hb.f(1504642273));
                continue;
              }
            }
            if (null == var7_ref) {
              vp.field_Hb.a(22125, var6Lifetime1);
              if (var9 == 0) {
                return;
              }
            }
            stackIn_60_0 = 95;
            break;
          }
          jj.$cfr$intArgs$a$2d0b7bdf67eb(stackIn_60_0, var7_ref, var6Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "ee.C(" + param0 + ')');
        }
    }

    final void a(int param0) {
        if (param0 != -1) {
          return;
        }
        try {
          this.field_b.e(77);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ee.G(" + param0 + ')');
        }
    }

    final int a(int param0, byte param1) {
        rd discarded$1 = null;
        rd var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (rd) (this.field_b.c(1504642273));
          if (param1 >= -14) {
            discarded$1 = this.a(-71, -29, (byte) 37);
          }
          if (var3 != null &&
            var3.field_m < param0) {
            var3.c(2779);
            stackIn_10_0 = var3.field_k;
            return stackIn_10_0;
          }
          stackIn_12_0 = -1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3_ref), "ee.F(" + param0 + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -3) {
            field_c = (String) null;
          }
          field_a = null;
          field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "ee.H(" + param0 + ')');
        }
    }

    private final rd a(int param0, int param1, byte param2) {
        Object var4 = null;
        int var5 = 0;
        Object stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        try {
          var4 = null;
          for (var5 = 0; var5 < this.field_e.length; var5++) {
            if (this.field_e[var5].b(0)) {
              continue;
            }
            var4 = this.field_e[var5];
            break;
          }
          if (null == var4) {
            var4 = new rd();
          }
          ((rd) (var4)).field_k = param1;
          ((rd) (var4)).field_m = param0;
          var5Lifetime1 = -104 / ((-22 - param2) / 50);
          stackIn_12_0 = var4;
          return (rd) (stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (var4), "ee.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    ee() {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Pixelate.field_H ? 1 : 0;
        try {
          this.field_b = new bb();
          this.field_e = new rd[10];
          var1_int = 0;
          while (var1_int < 10) {
            this.field_e[var1_int] = new rd();
            var1_int++;
            if (var2 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "ee.<init>()");
        }
    }

    final static void c(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          var1_int = kb.field_N[param0];
          var2 = 1;
          while (var2 < kb.field_N.length) {
            var3 = kb.field_N[var2];
            qb.a(nd.field_c, var2 << 4, nd.field_c, var1_int, var3);
            var1_int = var1_int + var3;
            var2++;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "ee.A(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        try {
          this.field_b.a(22125, this.a(param0, param2, (byte) 109));
          if (param1 != 0) {
            this.a(-120, 48, 81);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ee.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Message game";
        field_a = "Please log in as a subscribing member to access this feature.";
    }
}
