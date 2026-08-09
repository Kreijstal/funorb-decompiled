/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti implements nn {
    private int field_g;
    static oc field_f;
    static String field_d;
    private int field_e;
    private vm field_h;
    static bd field_c;
    static String[] field_a;
    static String field_i;
    static bd field_j;
    static fk field_b;

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_d = null;
        field_c = null;
        field_j = null;
        if (param0 != 70) {
          ti.a((byte) -81);
          field_a = null;
          field_i = null;
          return;
        } else {
          field_a = null;
          field_i = null;
          return;
        }
    }

    public ti() {
        this.field_e = 1;
        this.field_g = 1;
        this.field_h = jd.field_s;
    }

    final static int a(byte param0) {
        if (param0 != -1) {
            return -63;
        }
        return wc.field_m;
    }

    final static void a(int param0, byte param1, int param2) {
        int[] var3;
        int var4;
        int var5;
        int[] var6;
        int[] var7;
        if (0 <= param2) {
          if (param2 < 42) {
            if (hb.a(param2, uk.field_c, false)) {
              return;
            } else {
              q.field_n = q.field_n + lg.field_m;
              fa.field_a = fa.field_a + 1;
              var6 = uk.field_c;
              var3 = var6;
              var4 = param2;
              var6[var4 >> -1602143771] = ll.a(var6[var4 >> -1602143771], 1 << ua.a(31, var4));
              var7 = bm.field_b;
              var3 = var7;
              var4 = param2;
              var7[var4 >> -2067938075] = ll.a(var7[var4 >> -2067938075], 1 << ua.a(var4, 31));
              var5 = 20 / ((-70 - param1) / 40);
              ac.field_i.a(new t(param2), 90);
              if (ta.p(3)) {
                vl.field_c.a(new hm(param2, param0, q.field_n, in.field_b, lg.field_m, fa.field_a), 89);
                return;
              } else {
                ec.a(in.field_b, fa.field_a, true, 4, lg.field_m, param0, q.field_n, param2);
                sg.field_j = wk.a(4, -2178);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param3.field_u) {
                  break L2;
                } else {
                  if (param3.g(-9015)) {
                    break L2;
                  } else {
                    stackIn_5_0 = 2188450;
                    break L1;
                  }
                }
              }
              stackIn_5_0 = 3249872;
              break L1;
            }
            var6_int = stackIn_5_0;
            if (param2 == 15430) {
              L3: {
                this.field_h.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_n + "</u>", param1 - -param3.field_v, param0 + param3.field_m, param3.field_s, param3.field_x, var6_int, -1, this.field_e, this.field_g, this.field_h.field_y + this.field_h.field_F);
                if (!param3.g(param2 + -24445)) {
                  break L3;
                } else {
                  L4: {
                    var7 = this.field_h.a(param3.field_n);
                    var8 = this.field_h.field_y + this.field_h.field_F;
                    var9 = param1 - -param3.field_v;
                    var10 = param3.field_m + param0;
                    if (-3 == (this.field_e ^ -1)) {
                      var9 = var9 + (-var7 + param3.field_s);
                      break L4;
                    } else {
                      if ((this.field_e ^ -1) != -2) {
                        break L4;
                      } else {
                        var9 = var9 + (param3.field_s + -var7 >> 1612629825);
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (-3 == (this.field_g ^ -1)) {
                      var10 = var10 + (-var8 + param3.field_x);
                      break L5;
                    } else {
                      if (this.field_g == 1) {
                        var10 = var10 + (param3.field_x + -var8 >> -1986237471);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var6);

            stackIn_21_1 = new StringBuilder().append("ti.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ti(vm param0, int param1, int param2) {
        try {
            this.field_h = param0;
            this.field_e = param1;
            this.field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ti.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static kb b(byte param0) {
        try {
            Throwable var1 = null;
            kb stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 <= -50) {
                break L0;
              } else {
                ti.a(109);
                break L0;
              }
            }
            try {
              L1: {
                stackIn_3_0 = (kb) (Class.forName("ol").newInstance());
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = new oc();
        field_c = new bd(270, 70);
        field_i = "Invalid password.";
        field_a = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_b = new fk();
    }
}
