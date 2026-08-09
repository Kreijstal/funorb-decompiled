/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends df implements vb {
    private ro field_D;
    static String field_H;
    private String[] field_K;
    static String field_I;
    static String field_G;
    static byte[] field_E;
    private ag[] field_J;
    static lg field_F;

    final static void a(int param0, int param1) {
        try {
            try {
                ei.a("resizing", cd.e(113), (byte) 114, new Object[]{new Integer(param0)});
            } catch (Throwable throwable) {
            }
            if (param1 != 0) {
                li.a(-52, 47);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a((byte) -109, param1, param2, param3);
        if (param2 != 0) {
            return;
        }
        dj var5 = ia.field_c;
        if (param0 >= -52) {
            qm var6 = (qm) null;
            this.a((qm) null, (byte) -28, 'ￒ', -66);
        }
        if (!(null == this.field_K)) {
            var5.a(ji.field_f, this.field_n + param1, param3 - -this.field_j, this.field_v, 20, 16777215, -1, 0, 0, var5.field_C + var5.field_m);
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, (byte) -124, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 < -120) {
                  break L1;
                } else {
                  this.field_D = (ro) null;
                  break L1;
                }
              }
              if ((param3 ^ -1) != -99) {
                if (-100 != (param3 ^ -1)) {
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = this.b(2, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_8_0 = this.a(param0, 9555);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("li.N(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    final static void a(byte param0) {
        int var9 = 0;
        int var10 = ArcanistsMulti.field_G ? 1 : 0;
        if (an.field_f <= 0 || (an.field_j ^ -1) >= -1) {
            return;
        }
        int var1_int = wk.field_l.field_w;
        int var2 = wk.field_l.field_n;
        int var3 = km.field_e.field_n;
        int var4 = -var3 + an.field_f;
        int var5 = km.field_e.field_w;
        int var6 = -var5 + an.field_j;
        int var7 = an.field_f - var1_int;
        int var8 = an.field_j - var1_int;
        km.field_e.c(0, 0);
        km.field_e.e(var4, 0);
        km.field_e.d(0, var6);
        if (param0 <= 68) {
            return;
        }
        try {
            km.field_e.a(var4, var6);
            de.h(var3, 0, var4, an.field_j);
            for (var9 = var3; var4 > var9; var9 = var9 + var2) {
                wk.field_l.c(var9, 0);
                wk.field_l.d(var9, var8);
            }
            de.h(0, var5, an.field_f, var6);
            for (var9 = var5; var9 < var6; var9 = var9 + var2) {
                hk.field_k.c(0, var9);
                hk.field_k.e(var7, var9);
            }
            de.a();
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "li.F(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 1313) {
            return;
        }
        field_G = null;
        field_H = null;
        field_E = null;
        field_I = null;
        field_F = null;
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (this.field_K.length <= var6_int) {
                if (param0) {
                  L2: {
                    if (this.field_J[this.field_K.length] == param4) {
                      this.field_D.a((byte) -7);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  if (this.field_J[var6_int] != param4) {
                    break L3;
                  } else {
                    this.field_D.a(this.field_K[var6_int], 90);
                    break L3;
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("li.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    li(ro param0) {
        super(0, 0, 0, 0, (pf) null);
        try {
            this.field_D = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String[] param0, byte param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        gm var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_B.c(109);
              if (param0 == null) {
                break L1;
              } else {
                if (-1 == (param0.length ^ -1)) {
                  break L1;
                } else {
                  var3_int = param0.length;
                  this.field_K = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var4_int >= var3_int) {
                      var4 = new gm(ia.field_c, 0, 1);
                      this.field_J = new ag[var3_int - -1];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var3_int) {
                          var6 = 11 / ((6 - param1) / 42);
                          this.field_J[var3_int] = new ag(pc.field_d, (wc) (this));
                          this.field_J[var3_int].field_r = (pf) ((Object) var4);
                          this.field_J[var3_int].a(15, (1 + var3_int) * 16 + 20, 100, 0, -60);
                          this.c(-87, this.field_J[var3_int]);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_J[var5] = new ag(this.field_K[var5], (wc) (this));
                          this.field_J[var5].field_r = (pf) ((Object) var4);
                          this.field_J[var5].field_q = si.field_q;
                          this.field_J[var5].a(15, var5 * 16 + 20, 80, 0, -80);
                          this.c(-82, this.field_J[var5]);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      this.field_K[var4_int] = qo.a((byte) 80, (CharSequence) ((Object) param0[var4_int])).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            this.field_K = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("li.C(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_H = "Shortcut Reference";
        field_I = "Casting ";
        field_G = "to keep fullscreen or";
        field_E = new byte[]{(byte)7, (byte)10, (byte)2};
    }
}
