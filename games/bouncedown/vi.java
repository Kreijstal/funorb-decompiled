/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi implements Runnable {
    private ml field_d;
    static int field_c;
    static String[] field_f;
    private Thread field_e;
    private boolean field_a;
    int field_b;

    public static void a(byte param0) {
        if (param0 <= 50) {
          return;
        }
        field_f = null;
    }

    final static int c(int param0) {
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = Bounce.field_N;
        try {
          var1_int = 0;
          var3 = 115 % ((param0 - 53) / 58);
          var2 = 0;
          while (q.g((byte) -15)) {
            cf.field_f.a((byte) 110);
            if (cf.field_f.a(-1)) {
              var1_int = 1;
            }
            if (13 != lh.field_f) {
              continue;
            }
            var2 = 1;
          }
          cf.field_f.a(qe.a(uc.field_C, (byte) -94, ll.field_y), qe.a(og.field_a, (byte) -125, rk.field_a), -798);
          if (cf.field_f.a(-1)) {
            var1_int = 1;
          }
          var4 = 0;
          if (var1_int != 0 &&
            0 <= cf.field_f.field_b) {
            var4 = ii.field_n[cf.field_f.field_b];
            if (var4 == 2 ||
              var4 == 5) {
              hb.d((byte) 105);
            }
          } else {
            if (var2 != 0 &&
              ne.field_u != 2) {
              hb.d((byte) 52);
            }
          }
          if (0 == var4 &&
            ne.field_u == 2) {
            var5 = fa.a(84) - gd.field_a;
            var7 = (int)((-var5 + 10999L) / 1000L);
            if (0 >= var7) {
              nj.a(true, -25698, 5);
              var4 = 2;
            }
          }
          stackIn_28_0 = var4;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "vi.A(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        sa var4_ref_sa = null;
        int var5 = 0;
        he var6 = null;
        int var6_int = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        ii var27 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = Bounce.field_N;
        try {
          var27 = jc.field_g;
          if (param0 != 1) {
            return;
          }
          var2 = var27.d((byte) -91);
          if (var2 == 0) {
            var3 = var27.a(-1640531527);
            var4_ref_sa = (sa) (jl.field_f.a((byte) -113));
            while (var4_ref_sa != null) {
              if (var3 != var4_ref_sa.field_n) {
                var4_ref_sa = (sa) (jl.field_f.d((byte) -65));
                continue;
              }
              break;
            }
            if (var4_ref_sa == null) {
              kc.a((byte) 18);
              return;
            }
            var5 = var27.d((byte) -105);
            if (var5 != 0) {
              var6_int = var4_ref_sa.field_g;
              v.field_f[0].field_b = ja.field_b;
              var7 = var4_ref_sa.field_m;
              v.field_f[0].field_a = null;
              v.field_f[0].field_e = false;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                v.field_f[var8_int].field_b = var27.b(true);
                v.field_f[var8_int].field_e = false;
                if (var27.d((byte) -99) != 1) {
                  v.field_f[var8_int].field_a = null;
                } else {
                  v.field_f[var8_int].field_a = var27.b(true);
                }
              }
              dupTemp$0 = new String[3][var6_int];
              var4_ref_sa.field_h = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6_int];
              dupTemp$1 = new long[3][var6_int];
              var4_ref_sa.field_l = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var7 * var6_int];
              var4_ref_sa.field_o = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.d((byte) -68);
              if (var18 > 0) {
                for (var19 = 0; var18 > var19; var19++) {
                  var20 = var27.d((byte) -74);
                  var21 = v.field_f[var20].field_b;
                  var22 = var27.f((byte) -121);
                  var24 = var27.field_h;
                  if (var6_int > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = v.field_f[var20].field_a;
                    var10[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var25 < var7; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var27.j(-3);
                    }
                  }
                  if (var21 != null &&
                    s.a(var21, 126)) {
                    var8[1][var13] = ja.field_b;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var27.field_h = var24;
                    var13++;
                    for (var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var27.j(-3);
                    }
                  }
                  if (var14 < var6_int &&
                    !v.field_f[var20].field_e) {
                    v.field_f[var20].field_e = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = v.field_f[var20].field_a;
                    var10[2][var14] = var22;
                    var27.field_h = var24;
                    var14++;
                    for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var27.j(-3);
                    }
                  }
                }
              }
            }
            var4_ref_sa.field_i = true;
            var4_ref_sa.c(2);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var27.a(-1640531527);
            var4 = var27.f((byte) -121);
            var6 = (he) (of.field_b.a((byte) -92));
            while (var6 != null) {
              if (var6.field_j != var3Lifetime1) {
                var6 = (he) (of.field_b.d((byte) -42));
                continue;
              }
              break;
            }
            if (var6 == null) {
              kc.a((byte) 18);
              return;
            }
            var6.field_o = var4;
            var6.c(2);
            return;
          }
          ti.a((Throwable) null, (byte) 100, "HS1: " + la.a(-105));
          kc.a((byte) 18);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "vi.G(" + param0 + ')');
        }
    }

    final void d(int param0) {
        try {
          this.field_a = true;
          synchronized (this.field_d) {
            this.field_d.notifyAll();
          }
          try {
            if (param0 != -1) {
              vi.c(-89);
            }
            this.field_e.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_e = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.applet.Applet b(int param0) {
        if (a.field_c != null) {
          return a.field_c;
        }
        if (param0 != 0) {
          vi.a(-98);
        }
        return (java.applet.Applet) ((Object) og.field_c);
    }

    private final void a(md param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_d;
          synchronized (var3) {
            this.field_d.a((byte) -78, param0);
            this.field_b = this.field_b + 1;
            if (param1 > -25) {
              field_c = 84;
            }
            this.field_d.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("vi.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final md a(int param0, int param1, vh param2) {
        md var4 = null;
        RuntimeException var4_ref = null;
        md stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new md();
          var4.field_r = param2;
          var4.field_m = false;
          var4.field_p = param0;
          var4.field_j = (long)param1;
          this.a(var4, -126);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("vi.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final md a(int param0, vh param1, boolean param2) {
        md var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        md var6 = null;
        int var8 = 0;
        md stackIn_8_0 = null;
        md stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        md stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Bounce.field_N;
        try {
          var4 = new md();
          var4.field_p = 1;
          var5 = this.field_d;
          synchronized (var5) {
            var6 = (md) (this.field_d.d(-86));
            while (var6 != null) {
              if (~(long)param0 == ~var6.field_j &&
                param1 == var6.field_r &&
                2 == var6.field_p) {
                var4.field_n = false;
                var4.field_s = var6.field_s;
                stackIn_8_0 = var4;
                return stackIn_8_0;
              }
              var6 = (md) (this.field_d.b(0));
            }
          }
          var4.field_s = param1.a(106, param0);
          stackIn_16_0 = var4;
          stackIn_17_1 = (param2);
          stackIn_16_0.field_m = stackIn_17_1;
          var4.field_n = false;
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("vi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final md a(vh param0, int param1, byte param2, byte[] param3) {
        md var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        md stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new md();
          var5.field_m = false;
          var5.field_s = param3;
          var6 = 92 / ((-20 - param2) / 55);
          var5.field_r = param0;
          var5.field_p = 2;
          var5.field_j = (long)param1;
          this.a(var5, -117);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("vi.E(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          md var7 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = Bounce.field_N;
          while (!this.field_a) {
            var2 = this.field_d;
            synchronized (var2) {
              var7 = (md) (this.field_d.a(-1));
              if (var7 != null) {
                this.field_b = this.field_b - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_d.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              if (var7.field_p == 2) {
                var7.field_r.a(var7.field_s.length, (byte) 118, (int)var7.field_j, var7.field_s);
                var7.field_n = false;
              } else {
                if (3 == var7.field_p) {
                  var7.field_s = var7.field_r.a(102, (int)var7.field_j);
                  var7.field_n = false;
                } else {
                  var7.field_n = false;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              ti.a((Throwable) ((Object) var2_ref), (byte) 100, (String) null);
              var7.field_n = false;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    vi(si param0) {
        mk var2 = null;
        this.field_d = new ml();
        this.field_a = false;
        this.field_b = 0;
        try {
          var2 = param0.a(5, (byte) -123, (Runnable) (this));
          while (0 == var2.field_f) {
            wh.a(10L, 19406);
          }
          if (var2.field_f == 2) {
            throw new RuntimeException();
          }
          this.field_e = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "vi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 0;
        field_f = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
