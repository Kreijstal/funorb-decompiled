/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    int field_c;
    static boolean field_f;
    static il field_a;
    int[] field_d;
    static String field_e;
    int field_b;

    final int a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          if (this.field_d != null &&
            this.field_d.length != 0) {
            if (param0 <= 83) {
              stackIn_9_0 = -89;
              return stackIn_9_0;
            }
            var3_int = 1;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (this.field_d.length <= var3_int))) {
              stackIn_20_0 = this.field_d[-1 + var3_int] + this.field_d[var3_int] >> 1;
              stackIn_20_1 = param1;
              if (var4 == 0) {
                if (stackIn_20_0 > stackIn_20_1) {
                  stackIn_17_0 = var3_int - 1;
                  return stackIn_17_0;
                }
                var3_int++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_20_0 = -1;
              stackIn_20_1 = this.field_d.length;
            }
            stackIn_21_0 = stackIn_20_0 + stackIn_20_1;
            return stackIn_21_0;
          }
          stackIn_6_0 = 0;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var3), "ri.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static km b(byte param0) {
        RuntimeException var1 = null;
        km stackIn_2_0 = null;
        km stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 27) {
            stackIn_4_0 = ao.d(true);
            return stackIn_4_0;
          }
          stackIn_2_0 = (km) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "ri.D(" + param0 + ')');
        }
    }

    final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            this.field_c = 22;
          }
          if (this.field_d != null &&
            this.field_d.length != 0) {
            stackIn_10_0 = this.field_d[this.field_d.length - 1];
          } else {
            stackIn_10_0 = 0;
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "ri.E(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != 2) {
          return;
        }
        try {
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ri.C(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        hg var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        gh var6 = null;
        gh var7 = null;
        String var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        gh var6Lifetime1;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          var1 = sh.field_qb;
          var2 = var1.g(11132);
          if (var2 == 0) {
            if (null == ie.field_a) {
              ie.field_a = new kf(128);
              mj.field_z = 0;
            }
            stackIn_11_0 = (1 != var1.g(11132)) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.h(-122);
            if (var3_int != 0) {
              var5 = var1.h(-118);
            }
            if (var3_int == 0 ||
              var9 != 0) {
              var5 = var4_ref_String;
            }
            var6 = kh.a((byte) 119, var4_ref_String);
            var7_ref = var1.h(-119);
            var8 = c.a((CharSequence) ((Object) var4_ref_String), true);
            if (null == var8) {
              var8 = var4_ref_String;
            }
            if (var6 == null) {
              var6 = kh.a((byte) 42, var7_ref);
              if (var6 != null) {
                ie.field_a.a((long)var8.hashCode(), var6, 30804);
              }
            }
            if (var6 == null) {
              var6 = new gh();
              ie.field_a.a((long)var8.hashCode(), var6, 30804);
              fieldTemp$1 = mj.field_z;
              mj.field_z = mj.field_z + 1;
              var6.field_Nb = fieldTemp$1;
              bd.field_c.a(var6, (byte) -58);
            }
            var6.field_Hb = var4_ref_String;
            var6.field_Ob = var5;
            var6.field_Jb = var7_ref;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (oa.field_q == 1) {
                oa.field_q = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (oa.field_q == 2) {
                oa.field_q = 1;
              }
              return;
            }
            if (4 == var2) {
              oa.field_q = 1;
              var3 = var1.h(-122);
              wl.field_a = ((String) (var3)).intern();
              var4 = var1.g(11132);
              nn.a(true, var4);
              return;
            }
            en.a("F1: " + rg.a(true), (Throwable) null, 1);
            if (param0 <= 44) {
              ri.a((byte) -47);
            }
            tn.a(false);
            return;
          }
          if (oa.field_h == null) {
            oa.field_h = new kf(128);
            sg.field_j = 0;
          }
          var3Lifetime1 = var1.h(-128);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.h(-119);
          var5Lifetime1 = var1.h(-120);
          var6Lifetime1 = j.a(0, var4_ref_StringLifetime1);
          if (null == var6Lifetime1) {
            var6Lifetime1 = j.a(0, var5Lifetime1);
            if (null != var6Lifetime1) {
              oa.field_h.a((long)c.a((CharSequence) ((Object) var4_ref_StringLifetime1), true).hashCode(), var6Lifetime1, 30804);
            }
          }
          if (null == var6Lifetime1) {
            var6Lifetime1 = new gh();
            oa.field_h.a((long)c.a((CharSequence) ((Object) var4_ref_StringLifetime1), true).hashCode(), var6Lifetime1, 30804);
            fieldTemp$0 = sg.field_j;
            sg.field_j = sg.field_j + 1;
            var6Lifetime1.field_Nb = fieldTemp$0;
            co.field_f.a(var6Lifetime1, (byte) -96);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Hb = var4_ref_StringLifetime1;
          var6Lifetime1.field_Jb = var5Lifetime1;
          var6Lifetime1.field_Pb = (String) (var3Lifetime1);
          var6Lifetime1.a(false);
          var7 = (gh) (co.field_f.a((byte) -27));
          while (null != var7) {
            if (wc.a((byte) 23, var6Lifetime1, var7)) {
              var7 = (gh) (co.field_f.a(16213));
              if (var9 == 0) {
                continue;
              }
            }
            break;
          }
          if (null == var7) {
            co.field_f.a(var6Lifetime1, (byte) -77);
            if (var9 == 0) {
              return;
            }
          }
          td.a(var7, (byte) -61, var6Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1_ref), "ri.B(" + param0 + ')');
        }
    }

    ri(int param0, int param1, int param2) {
        try {
          this.field_b = param1;
          this.field_c = param0;
          this.field_d = new int[param2 + 1];
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ri.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Your game";
    }
}
