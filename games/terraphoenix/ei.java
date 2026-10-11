/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ei extends kh {
    private int field_P;
    private int field_T;
    private int field_S;
    static boolean field_R;
    private int field_Q;
    private int field_V;
    private int field_U;

    final void a(int param0, int param1, int param2, byte param3) {
        if (param0 <= 0) {
          this.b(98, param2, param1);
          return;
        }
        this.field_S = this.field_p;
        if (param3 != -80) {
          return;
        }
        this.field_P = param1;
        this.field_Q = this.field_n;
        this.field_U = param2;
        this.field_T = param0;
        this.field_V = 0;
    }

    ei(d param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_T = 0;
        this.field_V = 0;
    }

    void g(byte param0) {
        if (param0 != 109) {
          this.field_U = 62;
        }
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    final static int a(byte param0, boolean param1) {
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        try {
          uj.field_d = uj.field_d + 65536;
          while (65536 <= li.a(uj.field_d, -117, ke.field_e)) {
            el.field_e = el.field_e + 1;
            uj.field_d = uj.field_d - ke.field_e;
          }
          if (param0 > -100) {
            field_R = false;
          }
          var2_int = -1;
          if (rk.field_f == null) {
            if (wg.field_l != null) {
              var2_int = wg.field_l.length;
            }
          } else {
            var2_int = rk.field_f.length;
          }
          if (-1 != var2_int) {
            boolean decompiledFrameRemainder0 = true;
            if (ke.field_f > vi.field_p) {
              vi.field_p = vi.field_p + 1;
              if (ke.field_c < vi.field_p && (null == rk.field_f ||
                null == rk.field_f[vi.field_q])) {
                vi.field_p = vi.field_p - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (vi.field_p >= ke.field_f &&
                  rk.field_f[(1 + vi.field_q) % var2_int] == null) {
                  vi.field_p = vi.field_p - 1;
                }
              }
            }
            if (ke.field_f <= vi.field_p) {
              hd.field_h = vi.field_q;
              if (ve.field_c) {
                vi.field_q = vi.field_q + 1;
                if (var2_int <= vi.field_q) {
                  vi.field_q = vi.field_q - var2_int;
                }
              } else {
                vi.field_q = vi.field_q - 1;
                if (vi.field_q < 0) {
                  vi.field_q = vi.field_q + var2_int;
                }
              }
              vi.field_p = vi.field_p - ke.field_f;
            }
            if (ke.field_c < vi.field_p) {
              ve.field_c = true;
            }
          }
          if (ig.field_a != null) {
            var3 = 357 - ig.field_a.field_u / 2;
            var4 = 0;
            if (ma.field_I != 0 &&
              lm.field_c > var3 &&
              lm.field_c < var3 + ig.field_a.field_t) {
              if (-ig.field_a.field_r + 269 < mm.field_c &&
                mm.field_c < 269) {
                var4 = 1;
                ve.field_c = false;
                vi.field_p = ke.field_f;
              }
              if (586 < mm.field_c &&
                ig.field_a.field_r + 586 > mm.field_c) {
                ve.field_c = true;
                vi.field_p = ke.field_f;
                var4 = 1;
              }
            }
            if (var4 == 0 &&
              ke.field_c < vi.field_p &&
              jb.field_b > var3 &&
              ig.field_a.field_t + var3 > jb.field_b) {
              if (ef.field_j > 269 - ig.field_a.field_r &&
                269 > ef.field_j) {
                vi.field_p = ke.field_c;
              }
              if (586 < ef.field_j &&
                ef.field_j < ig.field_a.field_r + 586) {
                vi.field_p = ke.field_c;
              }
            }
          }
          if (!param1) {
            return 0;
          }
          si.field_ob.a(kk.a(10472, ef.field_j, jb.field_b), 127, kk.a(10472, mm.field_c, lm.field_c));
          if (si.field_ob.c((byte) -121)) {
            if (0 == si.field_ob.field_h) {
              stackIn_61_0 = 3;
              return stackIn_61_0;
            }
            if (si.field_ob.field_h == 1) {
              stackIn_65_0 = 2;
              return stackIn_65_0;
            }
          }
          stackIn_68_0 = 1;
          while (true) {
            if (!fd.d(stackIn_68_0)) {
              stackIn_81_0 = 0;
              return stackIn_81_0;
            }
            si.field_ob.a((byte) -125, 0);
            if (si.field_ob.c((byte) -121)) {
              if (si.field_ob.field_h == 0) {
                stackIn_73_0 = 3;
                return stackIn_73_0;
              }
              if (si.field_ob.field_h == 1) {
                stackIn_76_0 = 1;
                return stackIn_76_0;
              }
            }
            if (lf.field_c != 13) {
              stackIn_68_0 = 1;
              continue;
            }
            break;
          }
          stackIn_79_0 = 1;
          return stackIn_79_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "ei.GB(" + param0 + ',' + param1 + ')');
        }
    }

    boolean i(int param0) {
        int var2 = -90 % ((param0 + 2) / 63);
        this.j(-2065096856);
        return super.i(-127);
    }

    void a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        Object var17;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var13Lifetime2;
        var16 = Terraphoenix.field_V;
        l.b(6 + param0, param1 + 35, this.field_p - 12, this.field_n - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        while (var7 < var4) {
          if (var8 >= l.field_d &&
            var8 < l.field_c) {
            L5: {
              L6: {
                var9 = (var6 - var5) * var7 / var4 + var5;
                var10 = 0;
                var11 = this.field_p;
                if (var7 <= 20) {
                  while (var10 <= 20) {
                    var12 = (-var7 + 20) * (20 - var7) + (20 - var10) * (20 - var10);
                    if (var12 <= 462) {
                      if (var12 < 420) {
                        if (var7 > 20) {
                          break L5;
                        }
                        var12 = var11;
                        var11 -= 21;
                        var13 = 0;
                        while (var13 <= 20) {
                          var14 = var13 * var13 + (-var7 + 20) * (20 - var7);
                          if (462 < var14) {
                            break;
                          }
                          if (var14 >= 420) {
                            var15 = (462 - var14) * var9 / 42;
                            var15 = var15 | (var15 << 8 | var15 << 16);
                            l.field_i[l.field_k * var8 + param0 + var11] = var15;
                          } else {
                            var12 = 1 + var11;
                          }
                          var13++;
                          var11++;
                        }
                        break L6;
                      }
                      var13Lifetime2 = (-var12 + 462) * var9 / 42;
                      var13Lifetime2 = var13Lifetime2 | (var13Lifetime2 << 16 | var13Lifetime2 << 8);
                      l.field_i[param0 + (var8 * l.field_k + var10)] = var13Lifetime2;
                    }
                    var10++;
                  }
                }
                if (var7 > 20) {
                  break L5;
                }
                var12 = var11;
                var11 -= 21;
                var13Lifetime1 = 0;
                while (var13Lifetime1 <= 20) {
                  var14Lifetime1 = var13Lifetime1 * var13Lifetime1 + (-var7 + 20) * (20 - var7);
                  if (462 < var14Lifetime1) {
                    break;
                  }
                  if (var14Lifetime1 >= 420) {
                    var15Lifetime1 = (462 - var14Lifetime1) * var9 / 42;
                    var15Lifetime1 = var15Lifetime1 | (var15Lifetime1 << 8 | var15Lifetime1 << 16);
                    l.field_i[l.field_k * var8 + param0 + var11] = var15Lifetime1;
                  } else {
                    var12 = 1 + var11;
                  }
                  var13Lifetime1++;
                  var11++;
                }
              }
              var11 = var12;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            l.d(param0 + var10, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        if (param2 != 82) {
          var17 = (Object) null;
          ei.a((Object) null, false, true);
        }
        var6Lifetime1 = 169;
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param1;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = var7Lifetime1 * (-var5Lifetime1 + var6Lifetime1) / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          l.d(param0, var8Lifetime1, 6, var9Lifetime1);
          l.d(this.field_p + (param0 - 6), var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        hd.field_o.b(this.field_p + param0 - 90, 10 + param1);
        gd.a(param1 + 35, e.field_p, 5 + param0, 121, this.field_p - 10);
        gd.a(-22 + (this.field_n + param1), qb.field_f, param0, 126, this.field_p);
        var4Lifetime2 = this.field_n - 79;
        var5Lifetime2 = 169;
        var6Lifetime2 = 127;
        var7Lifetime2 = 0;
        var8Lifetime2 = 57 + param1;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = (-var5Lifetime2 + var6Lifetime2) * var7Lifetime2 / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          l.d(param0, var8Lifetime2, 6, var9Lifetime2);
          l.d(-6 + (param0 + this.field_p), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.addMouseListener(a.field_d);
          if (param1 != -24289) {
            String var3 = (String) null;
            ei.a(-4, (String) null);
          }
          param0.addMouseMotionListener(a.field_d);
          param0.addFocusListener(a.field_d);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ei.HB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void j(int param0) {
        if (param0 != -2065096856) {
          java.awt.Component var3 = (java.awt.Component) null;
          ei.a((java.awt.Component) null, -28);
        }
        if (0 >= this.field_T) {
          return;
        }
        this.b(98, this.field_U, this.field_P);
        this.field_T = 0;
        this.g((byte) 109);
    }

    boolean f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -121) {
          Object var6 = (Object) null;
          ei.a((Object) null, true, false);
        }
        if (this.field_T > 0) {
          var2 = this.field_P;
          var3 = this.field_U;
          fieldTemp$0 = this.field_V + 1;
          this.field_V = this.field_V + 1;
          if (fieldTemp$0 >= this.field_T) {
            this.field_T = 0;
            this.g((byte) 109);
          } else {
            var4 = this.field_V * (this.field_T * 2 - this.field_V);
            var5 = this.field_T * this.field_T;
            var3 = this.field_Q + (this.field_U - this.field_Q) * var4 / var5;
            var2 = var4 * (-this.field_S + this.field_P) / var5 + this.field_S;
          }
          this.b(98, var3, var2);
        }
        return super.f((byte) -121);
    }

    final static ec a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ec stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -124 % ((param0 - 26) / 49);
          if (vc.field_a.a(-71) &&
            !param1.equals(vc.field_a.b(-110))) {
            vc.field_a = gl.b(param1, 20);
          }
          stackIn_5_0 = vc.field_a;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ei.AC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static byte[] a(Object param0, boolean param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ke var4 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          if (param0 == null) {
            return null;
          }
          if (!(param0 instanceof byte[])) {
            if (!(param0 instanceof ke)) {
              throw new IllegalArgumentException();
            }
            var4 = (ke) (param0);
            stackIn_14_0 = var4.c(false);
            return stackIn_14_0;
          }
          var3 = (byte[]) (param0);
          if (!param1) {
            stackIn_11_0 = var3;
            return stackIn_11_0;
          }
          stackIn_9_0 = li.a(0, var3);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ei.CC(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_R = true;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$b925f3f4834c(int param0, boolean param1) {
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        try {
          uj.field_d = uj.field_d + 65536;
          while (65536 <= li.a(uj.field_d, -117, ke.field_e)) {
            el.field_e = el.field_e + 1;
            uj.field_d = uj.field_d - ke.field_e;
          }
          if (param0 > -100) {
            field_R = false;
          }
          var2_int = -1;
          if (rk.field_f == null) {
            if (wg.field_l != null) {
              var2_int = wg.field_l.length;
            }
          } else {
            var2_int = rk.field_f.length;
          }
          if (-1 != var2_int) {
            boolean decompiledFrameRemainder0 = true;
            if (ke.field_f > vi.field_p) {
              vi.field_p = vi.field_p + 1;
              if (ke.field_c < vi.field_p && (null == rk.field_f ||
                null == rk.field_f[vi.field_q])) {
                vi.field_p = vi.field_p - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (vi.field_p >= ke.field_f &&
                  rk.field_f[(1 + vi.field_q) % var2_int] == null) {
                  vi.field_p = vi.field_p - 1;
                }
              }
            }
            if (ke.field_f <= vi.field_p) {
              hd.field_h = vi.field_q;
              if (ve.field_c) {
                vi.field_q = vi.field_q + 1;
                if (var2_int <= vi.field_q) {
                  vi.field_q = vi.field_q - var2_int;
                }
              } else {
                vi.field_q = vi.field_q - 1;
                if (vi.field_q < 0) {
                  vi.field_q = vi.field_q + var2_int;
                }
              }
              vi.field_p = vi.field_p - ke.field_f;
            }
            if (ke.field_c < vi.field_p) {
              ve.field_c = true;
            }
          }
          if (ig.field_a != null) {
            var3 = 357 - ig.field_a.field_u / 2;
            var4 = 0;
            if (ma.field_I != 0 &&
              lm.field_c > var3 &&
              lm.field_c < var3 + ig.field_a.field_t) {
              if (-ig.field_a.field_r + 269 < mm.field_c &&
                mm.field_c < 269) {
                var4 = 1;
                ve.field_c = false;
                vi.field_p = ke.field_f;
              }
              if (586 < mm.field_c &&
                ig.field_a.field_r + 586 > mm.field_c) {
                ve.field_c = true;
                vi.field_p = ke.field_f;
                var4 = 1;
              }
            }
            if (var4 == 0 &&
              ke.field_c < vi.field_p &&
              jb.field_b > var3 &&
              ig.field_a.field_t + var3 > jb.field_b) {
              if (ef.field_j > 269 - ig.field_a.field_r &&
                269 > ef.field_j) {
                vi.field_p = ke.field_c;
              }
              if (586 < ef.field_j &&
                ef.field_j < ig.field_a.field_r + 586) {
                vi.field_p = ke.field_c;
              }
            }
          }
          if (!param1) {
            return 0;
          }
          si.field_ob.a(kk.a(10472, ef.field_j, jb.field_b), 127, kk.a(10472, mm.field_c, lm.field_c));
          if (si.field_ob.c((byte) -121)) {
            if (0 == si.field_ob.field_h) {
              stackIn_61_0 = 3;
              return stackIn_61_0;
            }
            if (si.field_ob.field_h == 1) {
              stackIn_65_0 = 2;
              return stackIn_65_0;
            }
          }
          stackIn_68_0 = 1;
          while (true) {
            if (!fd.d(stackIn_68_0)) {
              stackIn_81_0 = 0;
              return stackIn_81_0;
            }
            si.field_ob.a((byte) -125, 0);
            if (si.field_ob.c((byte) -121)) {
              if (si.field_ob.field_h == 0) {
                stackIn_73_0 = 3;
                return stackIn_73_0;
              }
              if (si.field_ob.field_h == 1) {
                stackIn_76_0 = 1;
                return stackIn_76_0;
              }
            }
            if (lf.field_c != 13) {
              stackIn_68_0 = 1;
              continue;
            }
            break;
          }
          stackIn_79_0 = 1;
          return stackIn_79_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "ei.GB(" + param0 + ',' + param1 + ')');
        }
    }
}
