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
          int discarded$2 = ti.a((byte) -81);
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
        ((ti) this).field_e = 1;
        ((ti) this).field_g = 1;
        ((ti) this).field_h = jd.field_s;
    }

    final static int a(byte param0) {
        if (param0 != -1) {
            return -63;
        }
        return wc.field_m;
    }

    final static void a(int param0, byte param1, int param2) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
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
              ac.field_i.a((am) (Object) new t(param2), 90);
              if (ta.p(3)) {
                vl.field_c.a((am) (Object) new hm(param2, param0, q.field_n, in.field_b, lg.field_m, fa.field_a), 89);
                return;
              } else {
                hm discarded$1 = ec.a(in.field_b, fa.field_a, true, 4, lg.field_m, param0, q.field_n, param2);
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
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        if (!param3.field_u) {
          if (!param3.g(-9015)) {
            var6 = 2188450;
            if (param2 == 15430) {
              int discarded$3 = ((ti) this).field_h.a("<u=" + Integer.toString(var6, 16) + ">" + param3.field_n + "</u>", param1 - -param3.field_v, param0 + param3.field_m, param3.field_s, param3.field_x, var6, -1, ((ti) this).field_e, ((ti) this).field_g, ((ti) this).field_h.field_y + ((ti) this).field_h.field_F);
              if (param3.g(param2 + -24445)) {
                L0: {
                  var7 = ((ti) this).field_h.a(param3.field_n);
                  var8 = ((ti) this).field_h.field_y + ((ti) this).field_h.field_F;
                  var9 = param1 - -param3.field_v;
                  var10 = param3.field_m + param0;
                  if (-3 == (((ti) this).field_e ^ -1)) {
                    var9 = var9 + (-var7 + param3.field_s);
                    break L0;
                  } else {
                    if (((ti) this).field_e != -2) {
                      break L0;
                    } else {
                      var9 = var9 + (param3.field_s + -var7 >> 1612629825);
                      if (-3 != ((ti) this).field_g) {
                        if (((ti) this).field_g == 1) {
                          var10 = var10 + (param3.field_x + -var8 >> -1986237471);
                          bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                          return;
                        } else {
                          bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                          return;
                        }
                      } else {
                        var10 = var10 + (-var8 + param3.field_x);
                        bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                        return;
                      }
                    }
                  }
                }
                if (-3 != (((ti) this).field_g ^ -1)) {
                  if (((ti) this).field_g == 1) {
                    var10 = var10 + (param3.field_x + -var8 >> -1986237471);
                    bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                    return;
                  } else {
                    bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                    return;
                  }
                } else {
                  var10 = var10 + (-var8 + param3.field_x);
                  bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            var6 = 3249872;
            if (param2 == 15430) {
              int discarded$4 = ((ti) this).field_h.a("<u=" + Integer.toString(var6, 16) + ">" + param3.field_n + "</u>", param1 - -param3.field_v, param0 + param3.field_m, param3.field_s, param3.field_x, var6, -1, ((ti) this).field_e, ((ti) this).field_g, ((ti) this).field_h.field_y + ((ti) this).field_h.field_F);
              if (param3.g(param2 + -24445)) {
                L1: {
                  var7 = ((ti) this).field_h.a(param3.field_n);
                  var8 = ((ti) this).field_h.field_y + ((ti) this).field_h.field_F;
                  var9 = param1 - -param3.field_v;
                  var10 = param3.field_m + param0;
                  if (-3 == (((ti) this).field_e ^ -1)) {
                    var9 = var9 + (-var7 + param3.field_s);
                    break L1;
                  } else {
                    if (((ti) this).field_e != -2) {
                      break L1;
                    } else {
                      var9 = var9 + (param3.field_s + -var7 >> 1612629825);
                      if (-3 != ((ti) this).field_g) {
                        if (((ti) this).field_g != 1) {
                          bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                          return;
                        } else {
                          var10 = var10 + (param3.field_x + -var8 >> -1986237471);
                          bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                          return;
                        }
                      } else {
                        var10 = var10 + (-var8 + param3.field_x);
                        bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                        return;
                      }
                    }
                  }
                }
                if (-3 != (((ti) this).field_g ^ -1)) {
                  if (((ti) this).field_g != 1) {
                    bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                    return;
                  } else {
                    var10 = var10 + (param3.field_x + -var8 >> -1986237471);
                    bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                    return;
                  }
                } else {
                  var10 = var10 + (-var8 + param3.field_x);
                  bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          var6 = 3249872;
          if (param2 == 15430) {
            int discarded$5 = ((ti) this).field_h.a("<u=" + Integer.toString(var6, 16) + ">" + param3.field_n + "</u>", param1 - -param3.field_v, param0 + param3.field_m, param3.field_s, param3.field_x, var6, -1, ((ti) this).field_e, ((ti) this).field_g, ((ti) this).field_h.field_y + ((ti) this).field_h.field_F);
            if (param3.g(param2 + -24445)) {
              L2: {
                var7 = ((ti) this).field_h.a(param3.field_n);
                var8 = ((ti) this).field_h.field_y + ((ti) this).field_h.field_F;
                var9 = param1 - -param3.field_v;
                var10 = param3.field_m + param0;
                if (-3 == (((ti) this).field_e ^ -1)) {
                  var9 = var9 + (-var7 + param3.field_s);
                  break L2;
                } else {
                  if (((ti) this).field_e != -2) {
                    break L2;
                  } else {
                    L3: {
                      var9 = var9 + (param3.field_s + -var7 >> 1612629825);
                      if (-3 == ((ti) this).field_g) {
                        var10 = var10 + (-var8 + param3.field_x);
                        break L3;
                      } else {
                        if (((ti) this).field_g == 1) {
                          var10 = var10 + (param3.field_x + -var8 >> -1986237471);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                    return;
                  }
                }
              }
              if (-3 != (((ti) this).field_g ^ -1)) {
                if (((ti) this).field_g != 1) {
                  bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                  return;
                } else {
                  var10 = var10 + (param3.field_x + -var8 >> -1986237471);
                  bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                  return;
                }
              } else {
                var10 = var10 + (-var8 + param3.field_x);
                bh.a(var8, 2 + var10, (byte) 65, var9 + -2, var7 - -4);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    ti(vm param0, int param1, int param2) {
        ((ti) this).field_h = param0;
        ((ti) this).field_e = param1;
        ((ti) this).field_g = param2;
    }

    final static kb b(byte param0) {
        try {
            Throwable var1 = null;
            kb stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            kb stackOut_2_0 = null;
            L0: {
              if (param0 <= -50) {
                break L0;
              } else {
                ti.a(109);
                break L0;
              }
            }
            try {
              stackOut_2_0 = (kb) Class.forName("ol").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new oc();
        field_c = new bd(270, 70);
        field_i = "Invalid password.";
        field_a = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_b = new fk();
    }
}
