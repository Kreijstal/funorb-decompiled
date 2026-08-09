/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class rj extends ne {
    static String[] field_j;
    int field_v;
    boolean field_w;
    rj field_r;
    int field_m;
    en field_n;
    int field_t;
    static boolean field_o;
    int field_p;
    static String field_y;
    static int field_l;
    int field_x;
    static cn field_s;
    int field_q;
    static cn field_k;
    Object field_u;
    int field_i;

    final static byte[] a(wj param0, boolean param1, int param2, byte[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            var4_int = param0.j(-106, param2);
            if (-1 != (var4_int ^ -1)) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (param3.length != var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param3 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param0.j(-122, 3);
                var6 = (byte)param0.j(119, 8);
                if (!param1) {
                  break L3;
                } else {
                  field_j = (String[]) null;
                  break L3;
                }
              }
              L4: {
                if (-1 <= (var5 ^ -1)) {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param3[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param3[var7] = (byte)(var6 + param0.j(-73, var5));
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (byte[]) (param3);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("rj.V(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        return stackIn_18_0;
    }

    final boolean a(byte param0, int param1, int param2) {
        int stackIn_10_0 = 0;
        if (this.field_w) {
          param2 = param2 - this.field_t;
          param1 = param1 - this.field_i;
          if (param0 >= 32) {
            L0: {
              L1: {
                if (0 > param2) {
                  break L1;
                } else {
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (this.field_q <= param2) {
                      break L1;
                    } else {
                      if (this.field_x <= param1) {
                        break L1;
                      } else {
                        stackIn_10_0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
              stackIn_10_0 = 0;
              break L0;
            }
            return stackIn_10_0 != 0;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    void b(byte param0) {
        if (param0 != 30) {
            this.d(-28, 91, -122);
        }
        this.a(false);
    }

    final void d(int param0) {
        this.b(param0, param0 ^ 8187, 0);
    }

    final void a(int param0) {
        if (param0 < 60) {
            this.field_v = -29;
        }
        this.a(0, 0, (byte) 124);
    }

    void a(boolean param0, int param1, int param2) {
        this.c(2, param2, param1);
        if (param0) {
            this.b(-54, -3, 63);
        }
    }

    final void b(int param0, int param1, byte param2) {
        if (param0 == this.field_t && param1 == this.field_i) {
            return;
        }
        if (!(-1 == (2 & this.field_v ^ -1))) {
            this.field_i = this.field_i + this.field_x;
        }
        if (!(0 == (1 & this.field_v))) {
            this.field_t = this.field_t + this.field_q;
        }
        this.e(-this.field_i + param1, param0 - this.field_t, 108);
        if (0 != (this.field_v & 2)) {
            this.field_i = this.field_i - this.field_x;
        }
        if (!(-1 == (this.field_v & 1 ^ -1))) {
            this.field_t = this.field_t - this.field_q;
        }
        if (param2 != 4) {
            this.field_p = 44;
        }
    }

    void b(int param0, int param1, int param2) {
        if (param1 != 8187) {
            this.field_p = 99;
        }
    }

    final static tj a(byte[] param0, int param1) {
        tj var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        tj stackIn_5_0 = null;
        tj stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new tj(param0, hg.field_t, fe.field_g, jc.field_f, jn.field_k, uo.field_b, ub.field_q);
              if (param1 == 18118) {
                sb.a(500);
                stackIn_7_0 = (tj) (var2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (tj) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("rj.HA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (tj) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    void d(int param0, int param1, int param2) {
        if (param1 != 128) {
            this.field_q = 96;
        }
    }

    void a(int param0, int param1, byte param2) {
        int var4 = -24 % ((41 - param2) / 61);
    }

    void a(int param0, int param1) {
        if (param0 != 1) {
            rj.a((byte) -122, true);
        }
        if (!(null == this.field_r)) {
            this.field_r.a(1, param1);
        }
    }

    void a(int param0, byte param1, int param2) {
        if (param1 > -59) {
            this.field_p = -18;
        }
    }

    void e(int param0, int param1, int param2) {
        this.field_i = this.field_i + param0;
        if (param2 <= 69) {
            this.field_p = -102;
        }
        this.field_t = this.field_t + param1;
    }

    private final void c(int param0, int param1, int param2) {
        if (-1 != (param0 & this.field_v ^ -1)) {
            this.field_i = this.field_i + (-param1 + this.field_x);
        }
        if (0 != (1 & this.field_v)) {
            this.field_t = this.field_t + (-param2 + this.field_q);
        }
        this.field_x = param1;
        this.field_q = param2;
    }

    public static void b(boolean param0) {
        if (param0) {
            field_j = (String[]) null;
        }
        field_y = null;
        field_j = null;
        field_k = null;
        field_s = null;
    }

    final static cn a(byte param0) {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        cn var1 = new cn(11, 11);
        jh.a(var1);
        if (param0 <= 105) {
            return (cn) null;
        }
        for (var2 = 0; -6 < (var2 ^ -1); var2++) {
            gf.b(var2, 3 - -var2, 11 + -(2 * var2), 65793);
        }
        jh.b();
        return var1;
    }

    final static boolean a(byte param0, boolean param1) {
        try {
            wj var5 = null;
            wj var6 = null;
            if (kf.field_m == null) {
                kf.field_m = sc.field_q.a(-74, an.field_E, ii.field_D);
            }
            if (param0 <= 23) {
                byte[] var3 = (byte[]) null;
                rj.a((wj) null, false, -48, (byte[]) null);
            }
            if (!(0 != kf.field_m.field_c)) {
                return false;
            }
            long dupTemp$0 = kd.c(-2456);
            wh.field_e = dupTemp$0;
            qm.field_o = dupTemp$0;
            if (kf.field_m.field_c != 1) {
                pd.field_A = tp.field_B;
            } else {
                try {
                    sp.field_c = new rk((java.net.Socket) (kf.field_m.field_f), sc.field_q);
                    ac.field_B.field_o = 0;
                    var5 = ra.field_c;
                    var6 = var5;
                    var6.field_o = 0;
                    pd.field_A = no.field_c;
                    wl.field_f = !param1 ? -1 : -2;
                    oc.field_E = !param1 ? -1 : -2;
                    rd.field_C = !param1 ? -1 : -2;
                    rg.a(mh.field_g, ac.field_B, kn.field_b, 119, rd.field_D);
                    op.a(0, -1);
                } catch (IOException iOException) {
                    pd.field_A = tp.field_B;
                }
            }
            kf.field_m = null;
            return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    rj a(int param0, int param1, int param2) {
        if (this.a((byte) 114, param1, param2)) {
            return (rj) (this);
        }
        if (param0 <= -10) {
            return null;
        }
        return (rj) null;
    }

    rj(int param0, int param1, int param2, int param3, int param4) {
        this(param0, param1, param4);
        this.c(2, param3, param2);
    }

    private rj(int param0, int param1, int param2) {
        this.field_q = 0;
        this.field_i = param1;
        this.field_w = true;
        this.field_x = 0;
        this.field_t = param0;
        this.field_u = null;
        this.field_v = param2;
        rl.field_h.b((ne) (this), false);
    }

    static {
        field_j = new String[]{"Armoured", "Ignores first failed roll in each combat."};
        field_y = "The account name you use to access RuneScape and other Jagex.com games";
        field_l = 128;
    }
}
